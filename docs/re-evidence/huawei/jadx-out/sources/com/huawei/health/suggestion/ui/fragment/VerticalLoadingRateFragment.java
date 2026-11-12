package com.huawei.health.suggestion.ui.fragment;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import defpackage.dem;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes31.dex */
public class VerticalLoadingRateFragment extends PostureSuggestBaseFragment {
    @Override // com.huawei.health.suggestion.ui.fragment.PostureSuggestBaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f9547b = 8;
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
            }
        } else {
            super.b();
            c();
            this.e.setVisibility(0);
            this.e.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fragment.VerticalLoadingRateFragment.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (qrs.r()) {
                        LogUtil.j("Suggestion_PostureFragment", "remind is click fast");
                    } else {
                        dem.b().a("VERTICAL_LOADING_RATE");
                        VerticalLoadingRateFragment.this.d(25);
                    }
                }
            });
        }
    }

    private void c() {
        this.i.setText(getString(R.string.IDS_bolt_avg_peak_impact_rate));
        String strE = UnitUtil.e(this.n.getValue(), 1, 1);
        String quantityString = this.f9546a.getResources().getQuantityString(com.huawei.health.suggestion.R.plurals.IDS_bolt_average_peak_impact_unit, (int) this.n.getValue(), "");
        if (LanguageUtil.br(this.f9546a)) {
            this.k.setText(quantityString);
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
            return;
        }
        this.k.setText(strE);
        this.j.setText(quantityString);
    }
}
