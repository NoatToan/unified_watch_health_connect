package com.garmin.android.apps.connectmobile.performance.stats;

import android.os.Bundle;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.m0;
import ro0.l;
import t61.g;
import t61.h;

/* JADX INFO: loaded from: classes9.dex */
public class StressLevelScoresSummaryActivity extends h implements a.b {
    @Override // com.garmin.android.apps.connectmobile.performance.stats.a.b
    public final void A2() {
        SparseArray<Fragment> sparseArray = this.f162757b.f162760a;
        if (sparseArray != null) {
            for (int i14 = 0; i14 < sparseArray.size(); i14++) {
                Fragment fragment = sparseArray.get(sparseArray.keyAt(i14));
                if (fragment != null && (fragment instanceof g)) {
                    for (Fragment fragment2 : ((g) fragment).getChildFragmentManager().f7372c.f()) {
                        if (fragment2 instanceof m0) {
                            ((m0) fragment2).E6();
                        }
                    }
                }
            }
        }
    }

    @Override // t61.h
    public final int ca() {
        return 4;
    }

    @Override // t61.h
    public final void da() {
        HelpActivity.da(this, l.HRV_STRESS, null, null);
    }

    @Override // t61.h, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initActionBar(true, R.string.lbl_hrv_stress);
    }
}
