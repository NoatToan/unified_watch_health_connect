package com.huawei.health.suggestion.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.huawei.healthcloud.plugintrack.model.SportDetailChartDataType;
import com.huawei.ui.commonui.R;
import defpackage.dem;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes31.dex */
public class GroundHangTimeRateFragment extends PostureSuggestBaseFragment {
    @Override // com.huawei.health.suggestion.ui.fragment.PostureSuggestBaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f9547b = 2;
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.huawei.health.suggestion.ui.fragment.PostureSuggestBaseFragment
    public void b() {
        if (this.n == null) {
            return;
        }
        super.b();
        this.i.setText(getString(R.string.IDS_motiontrack__average_ground_to_air_ratio));
        int[] iArrAcquireValueList = this.n.acquireValueList();
        if (iArrAcquireValueList == null || iArrAcquireValueList.length == 0) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        this.k.setText(UnitUtil.e(iArrAcquireValueList[0] * 0.01f, 1, 1));
        this.j.setVisibility(8);
        c(SportDetailChartDataType.GROUND_HANG_TIME_RATE);
        this.e.setVisibility(0);
        this.e.setOnClickListener(new View.OnClickListener() { // from class: hnx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f36970a.b(view);
            }
        });
    }

    public /* synthetic */ void b(View view) {
        dem.b().a("IMPACT_HANG_TIME_RATE");
        d(17);
    }
}
