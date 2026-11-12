package com.huawei.health.suggestion.ui.fragment;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import defpackage.dem;
import defpackage.qri;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes31.dex */
public class GCTimeBalanceFragment extends PostureSuggestBaseFragment {
    @Override // com.huawei.health.suggestion.ui.fragment.PostureSuggestBaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f9547b = 4;
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.huawei.health.suggestion.ui.fragment.PostureSuggestBaseFragment
    protected void b() {
        super.b();
        if (this.n == null) {
            return;
        }
        float value = this.n.getValue();
        if (value < 0.0f) {
            if (getActivity() != null) {
                getActivity().finish();
            }
        } else {
            super.b();
            this.i.setText(getString(R.string.IDS_bolt_balance_avg_left_right_touches));
            e(value);
            this.e.setVisibility(0);
            this.e.setOnClickListener(new View.OnClickListener() { // from class: hny
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f36971a.d(view);
                }
            });
        }
    }

    public /* synthetic */ void d(View view) {
        dem.b().a("PARAMETER_GROUND_TIME_BALANCE");
        d(19);
    }

    private void e(float f) {
        String strE = UnitUtil.e(f, 2, 1);
        String strE2 = UnitUtil.e(100.0f - f, 2, 1);
        String string = getResources().getString(R.string.IDS_bolt_balance_rate_left_right_value, strE, strE2);
        try {
            if (LanguageUtil.br(this.f9546a)) {
                c(string, strE, strE2);
                return;
            }
            if (LanguageUtil.c(this.f9546a)) {
                c(f, string, strE, strE2);
                return;
            }
            int iIndexOf = string.indexOf(strE);
            int iLastIndexOf = string.lastIndexOf(strE2);
            int length = strE.length();
            int length2 = strE2.length();
            SpannableString spannableString = new SpannableString(string);
            qri.d(spannableString, 0, iIndexOf - 1, new AbsoluteSizeSpan(14, true));
            qri.d(spannableString, (iIndexOf + length) - 1, iLastIndexOf - 1, new AbsoluteSizeSpan(14, true));
            qri.d(spannableString, (iLastIndexOf + length2) - 1, string.length(), new AbsoluteSizeSpan(14, true));
            this.k.setText(spannableString);
        } catch (IndexOutOfBoundsException unused) {
            LogUtil.e("Suggestion_PostureFragment", "setPostureItemValue is exception");
            this.k.setText(string);
        }
    }

    private void e(int i, int i2, SpannableString spannableString) {
        if (i < 0 || i >= i2 || i2 >= spannableString.length()) {
            return;
        }
        spannableString.setSpan(new AbsoluteSizeSpan(14, true), i, i2, 33);
    }

    private void c(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str.replace("%", ""));
        int iIndexOf = str.indexOf(str2.replace("%", "").trim());
        int iLastIndexOf = str.lastIndexOf(str3.replace("%", "").trim());
        sb.insert(iIndexOf - 1, "%");
        sb.insert(iLastIndexOf - 1, "%");
        int length = str2.length();
        SpannableString spannableString = new SpannableString(sb.toString());
        e(0, iIndexOf, spannableString);
        e(iIndexOf + length, iLastIndexOf, spannableString);
        this.k.setText(spannableString);
    }

    private void c(float f, String str, String str2, String str3) {
        int iIndexOf = str.indexOf(str2);
        if (f == 5.0f) {
            iIndexOf = str.lastIndexOf(str2);
        }
        int iLastIndexOf = str.lastIndexOf(str3);
        if (f == 100.0f || f == 95.0f) {
            iLastIndexOf = str.indexOf(str3);
        }
        if (f != 50.0f) {
            int i = iLastIndexOf;
            iLastIndexOf = iIndexOf;
            iIndexOf = i;
        }
        int length = str2.length();
        int length2 = str3.length();
        SpannableString spannableString = new SpannableString(str);
        e(0, iIndexOf - 1, spannableString);
        e((iIndexOf + length2) - 1, iLastIndexOf - 1, spannableString);
        e((iLastIndexOf + length) - 1, str.length(), spannableString);
        this.k.setText(spannableString);
    }
}
