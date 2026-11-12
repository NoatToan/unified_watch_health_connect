package com.huawei.health.suggestion.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.ui.commonui.R;
import defpackage.dem;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes31.dex */
public class LandingImpactFragment extends PostureSuggestBaseFragment {
    @Override // com.huawei.health.suggestion.ui.fragment.PostureSuggestBaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f9547b = 3;
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.huawei.health.suggestion.ui.fragment.PostureSuggestBaseFragment
    public void b() {
        if (this.n == null) {
            return;
        }
        super.b();
        this.i.setText(getString(R.string.IDS_running_posture_avg_ground_impact_acceleration));
        int[] iArrAcquireValueList = this.n.acquireValueList();
        if (iArrAcquireValueList == null || iArrAcquireValueList.length == 0) {
            if (getActivity() != null) {
                getActivity().finish();
            }
        } else {
            this.k.setText(UnitUtil.e(iArrAcquireValueList[0], 1, 0));
            this.j.setText(getString(R.string.IDS_gravity_unit));
            this.e.setVisibility(0);
            this.e.setOnClickListener(new View.OnClickListener() { // from class: hnz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f36972b.b(view);
                }
            });
        }
    }

    public /* synthetic */ void b(View view) {
        dem.b().a("LANDING_IMPACT");
        d(8);
    }
}
