package com.huawei.health.suggestion.ui.fragment;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.ui.commonui.R;
import defpackage.dem;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes31.dex */
public class ActivePeakFragment extends PostureSuggestBaseFragment {
    @Override // com.huawei.health.suggestion.ui.fragment.PostureSuggestBaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f9547b = 7;
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
        this.i.setText(getString(R.string.IDS_bolt_average_peak_impact));
        String strE = UnitUtil.e(this.n.getValue(), 1, 1);
        if (LanguageUtil.c(this.f9546a)) {
            String quantityString = this.f9546a.getResources().getQuantityString(com.huawei.health.suggestion.R.plurals.IDS_bolt_run_posture_shock_peak_unit, (int) this.n.getValue(), "");
            this.k.setText(strE);
            this.j.setText(quantityString);
        } else if (LanguageUtil.br(this.f9546a)) {
            this.k.setText(com.huawei.health.suggestion.R.string.IDS_bolt_shock_peak_unit);
            Typeface typefaceCreate = Typeface.create(this.f9546a.getString(com.huawei.health.suggestion.R.string.textFontFamilyRegular), 0);
            this.k.setTextSize(2, 14.0f);
            this.k.setMinHeight(qrs.d(this.f9546a, 35.0f));
            this.k.setGravity(80);
            this.k.setTypeface(typefaceCreate);
            this.j.setTextSize(1, 35.0f);
            Typeface typefaceCreate2 = Typeface.create(this.f9546a.getString(com.huawei.health.suggestion.R.string.textFontFamilyMedium), 0);
            this.j.setMinHeight(qrs.d(this.f9546a, 35.0f));
            this.j.setTypeface(typefaceCreate2);
            this.j.setText(strE);
        } else {
            this.k.setText(strE);
            this.j.setText(com.huawei.health.suggestion.R.string.IDS_bolt_shock_peak_unit);
        }
        this.e.setVisibility(0);
        this.e.setOnClickListener(new View.OnClickListener() { // from class: hns
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f36964b.b(view);
            }
        });
    }

    public /* synthetic */ void b(View view) {
        dem.b().a("GROUND_IMPACT_PEAK");
        d(21);
    }
}
