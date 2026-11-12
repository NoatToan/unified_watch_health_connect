package com.huawei.health.suggestion.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.ui.commonui.R;
import defpackage.dem;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes31.dex */
public class VerticalOscillationFragment extends PostureSuggestBaseFragment {
    @Override // com.huawei.health.suggestion.ui.fragment.PostureSuggestBaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f9547b = 5;
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
        this.i.setText(getString(R.string.IDS_bolt_avg_vertical_amplitude));
        this.k.setText(UnitUtil.e(d(this.n.getValue()), 1, 1));
        if (!UnitUtil.f()) {
            this.j.setText(R.string.IDS_cm);
        } else {
            this.j.setText(R.string.IDS_ins);
        }
        this.e.setVisibility(0);
        this.e.setOnClickListener(new View.OnClickListener() { // from class: hog
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.c(view);
            }
        });
    }

    public /* synthetic */ void c(View view) {
        dem.b().a("PARAMETER_VERTICAL_OSCILLATION");
        d(18);
    }

    private float d(float f) {
        return !UnitUtil.f() ? f : (float) UnitUtil.e(f, 0);
    }
}
