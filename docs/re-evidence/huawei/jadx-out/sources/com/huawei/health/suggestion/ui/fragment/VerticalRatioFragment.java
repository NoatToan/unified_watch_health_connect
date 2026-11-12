package com.huawei.health.suggestion.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.ui.commonui.R;
import defpackage.dem;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes31.dex */
public class VerticalRatioFragment extends PostureSuggestBaseFragment {
    @Override // com.huawei.health.suggestion.ui.fragment.PostureSuggestBaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f9547b = 6;
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.huawei.health.suggestion.ui.fragment.PostureSuggestBaseFragment
    protected void b() {
        super.b();
        if (this.n == null) {
            return;
        }
        int[] iArrAcquireValueList = this.n.acquireValueList();
        if (iArrAcquireValueList == null || iArrAcquireValueList.length == 0) {
            if (getActivity() != null) {
                getActivity().finish();
                return;
            }
            return;
        }
        super.b();
        this.i.setText(getString(R.string.IDS_bolt_average_vertical_amplitude_rate));
        this.k.setText(UnitUtil.e(this.n.getValue(), 2, 1));
        this.j.setText("");
        this.e.setVisibility(0);
        this.e.setOnClickListener(new View.OnClickListener() { // from class: hoe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f36978c.d(view);
            }
        });
    }

    public /* synthetic */ void d(View view) {
        dem.b().a("VERTICAL_STRIKE_RATE");
        d(20);
    }
}
