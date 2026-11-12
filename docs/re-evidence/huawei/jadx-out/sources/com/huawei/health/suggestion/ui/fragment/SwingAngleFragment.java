package com.huawei.health.suggestion.ui.fragment;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.dem;

/* JADX INFO: loaded from: classes31.dex */
public class SwingAngleFragment extends PostureSuggestBaseFragment {
    @Override // com.huawei.health.suggestion.ui.fragment.PostureSuggestBaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f9547b = 5;
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.huawei.health.suggestion.ui.fragment.PostureSuggestBaseFragment
    public void b() {
        if (this.n == null) {
            return;
        }
        super.b();
        this.i.setText(getString(R.string.IDS_running_posture_avg_swing_angle));
        int[] iArrAcquireValueList = this.n.acquireValueList();
        if (iArrAcquireValueList == null || iArrAcquireValueList.length == 0) {
            if (getActivity() != null) {
                getActivity().finish();
                return;
            }
            return;
        }
        HealthTextView healthTextView = this.k;
        Resources resources = getResources();
        int i = R.plurals.IDS_degree_unit_with_value;
        int i2 = iArrAcquireValueList[0];
        healthTextView.setText(resources.getQuantityString(i, i2, Integer.valueOf(i2)));
        this.e.setVisibility(0);
        this.e.setOnClickListener(new View.OnClickListener() { // from class: hod
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f36977a.d(view);
            }
        });
    }

    public /* synthetic */ void d(View view) {
        dem.b().a("OSCILLATING_ANGLE");
        d(27);
    }
}
