/*
 * Copyright (C) 2013-2017 microG Project Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.microg.gms.ui;

import androidx.fragment.app.Fragment;

import com.google.android.gms.BuildConfig;

import org.microg.tools.ui.AbstractAboutFragment;
import org.microg.tools.ui.AbstractSettingsActivity;

import java.util.List;

public class AboutFragment extends AbstractAboutFragment {

    @Override
    protected void collectLibraries(List<AbstractAboutFragment.Library> libraries) {
        if (BuildConfig.FLAVOR.toLowerCase().contains("vtm")) {
            libraries.add(new AbstractAboutFragment.Library("org.oscim.android", "V™", "GNU LGPLv3, Hannes Janetzek and devemux86."));
            libraries.add(new AbstractAboutFragment.Library("org.slf4j", "SLF4J", "MIT License, QOS.ch."));
        } else {
            libraries.add(new AbstractAboutFragment.Library("org.maplibre.android", "MapLibre Native for Android", "Two-Clause BSD, MapLibre contributors."));
        }
        
    }

    public static class AsActivity extends AbstractSettingsActivity {
        public AsActivity() {
            showHomeAsUp = true;
        }

        @Override
        protected Fragment getFragment() {
            return new AboutFragment();
        }
    }
}
