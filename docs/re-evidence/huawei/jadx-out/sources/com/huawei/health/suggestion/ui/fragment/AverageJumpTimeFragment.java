package com.huawei.health.suggestion.ui.fragment;

import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.ui.commonui.R;
import defpackage.qqz;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes31.dex */
public class AverageJumpTimeFragment extends BasketballSuggestionBaseFragment {
    @Override // com.huawei.health.suggestion.ui.fragment.BasketballSuggestionBaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.huawei.health.suggestion.ui.fragment.BasketballSuggestionBaseFragment
    public void c() {
        if (this.f9531a == null) {
            return;
        }
        int[] valueList = this.f9531a.getValueList();
        if (valueList == null || valueList.length == 0) {
            if (getActivity() != null) {
                getActivity().finish();
                return;
            }
            return;
        }
        super.c();
        this.i.setText(UnitUtil.e(valueList[0], 1, 0));
        this.j.setText(R.string.IDS_msec_unit);
        this.h.setText(getString(R.string.IDS_aw_version2_jump_time_question));
        StringBuilder sb = new StringBuilder(10);
        sb.append(getString(R.string.IDS_aw_version2_jump_time_answer_1));
        sb.append(System.lineSeparator());
        sb.append(String.format(getString(R.string.IDS_aw_version2_jump_time_answer_3), 900));
        this.f.setText(sb.toString());
        this.f9533c.setText(getString(R.string.IDS_aw_version2_jump_time_answer_2));
        if (LanguageUtil.ba(this.d)) {
            BitmapDrawable bitmapDrawableE = qqz.e(this.d, R.drawable.img_basketball_jump_time);
            if (bitmapDrawableE != null) {
                this.g.setImageDrawable(bitmapDrawableE);
                return;
            }
            return;
        }
        this.g.setImageResource(R.drawable.img_basketball_jump_time);
    }
}
