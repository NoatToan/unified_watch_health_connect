package com.huawei.health.suggestion.ui.fragment;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.view.TotalDataRectView;
import defpackage.dem;
import defpackage.qrs;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes31.dex */
public class FootStrikePatternFragment extends PostureSuggestBaseFragment {
    private HealthTextView l;
    private HealthTextView o;
    private HealthTextView p;
    private TotalDataRectView q;

    @Override // com.huawei.health.suggestion.ui.fragment.PostureSuggestBaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f9547b = 6;
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.huawei.health.suggestion.ui.fragment.PostureSuggestBaseFragment
    protected void e(View view) {
        if (view == null) {
            LogUtil.j("Suggestion_FootStrikePatternFragment", "initLayout rootView == null");
            return;
        }
        this.q = (TotalDataRectView) view.findViewById(R.id.proportion_bar);
        this.o = (HealthTextView) view.findViewById(R.id.running_posture_avg_foot_strike_pattern_fore_value);
        this.p = (HealthTextView) view.findViewById(R.id.running_posture_avg_foot_strike_pattern_whole_value);
        this.l = (HealthTextView) view.findViewById(R.id.running_posture_avg_foot_strike_pattern_hind_value);
        super.e(view);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        Resources resources = getResources();
        layoutParams.setMargins(resources.getDimensionPixelSize(com.huawei.health.suggestion.R.dimen.maxPaddingStart), resources.getDimensionPixelSize(com.huawei.health.suggestion.R.dimen.hw_achieve_medal_size_24), resources.getDimensionPixelSize(com.huawei.health.suggestion.R.dimen.maxPaddingEnd), -resources.getDimensionPixelSize(com.huawei.health.suggestion.R.dimen.hw_achieve_medal_size_12));
        view.findViewById(com.huawei.health.suggestion.R.id.sug_running_posture_item).setLayoutParams(layoutParams);
        this.k.setVisibility(8);
        this.j.setVisibility(8);
        this.h.setVisibility(8);
        this.i.setText(getString(R.string.IDS_bolt_avg_foot_strike_pattern));
        this.e.setVisibility(0);
        this.e.setOnClickListener(new View.OnClickListener() { // from class: hnw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f36969c.a(view2);
            }
        });
        view.findViewById(com.huawei.health.suggestion.R.id.sug_running_posture_item_proportinbar).setVisibility(0);
    }

    public /* synthetic */ void a(View view) {
        if (qrs.r()) {
            LogUtil.j("Suggestion_FootStrikePatternFragment", "remind is click fast");
        } else {
            dem.b().a("STRIKE_PATTERN");
            d(28);
        }
    }

    @Override // com.huawei.health.suggestion.ui.fragment.PostureSuggestBaseFragment
    public void b() {
        if (this.n == null) {
            if (getActivity() != null) {
                getActivity().finish();
                return;
            }
            return;
        }
        int[] iArrAcquireValueList = this.n.acquireValueList();
        if (iArrAcquireValueList == null || iArrAcquireValueList.length != 3) {
            if (getActivity() != null) {
                getActivity().finish();
                return;
            }
            return;
        }
        this.q.setColors(getResources().getColor(R.color.track_detail_running_posture_color_one), getResources().getColor(R.color.track_detail_running_posture_color_two), getResources().getColor(R.color.track_detail_running_posture_color_three));
        this.q.setViewData(iArrAcquireValueList[0], iArrAcquireValueList[1], iArrAcquireValueList[2]);
        this.q.postInvalidate();
        String strE = UnitUtil.e(iArrAcquireValueList[0], 2, 0);
        String strE2 = UnitUtil.e(iArrAcquireValueList[1], 2, 0);
        String strE3 = UnitUtil.e(iArrAcquireValueList[2], 2, 0);
        this.o.setText(UnitUtil.b(getContext(), "\\d+.\\d+|\\d+", strE, R.style.strike_pattern_text_result_k, R.style.strike_pattern_text_result_n));
        this.p.setText(UnitUtil.b(getContext(), "\\d+.\\d+|\\d+", strE2, R.style.strike_pattern_text_result_k, R.style.strike_pattern_text_result_n));
        this.l.setText(UnitUtil.b(getContext(), "\\d+.\\d+|\\d+", strE3, R.style.strike_pattern_text_result_k, R.style.strike_pattern_text_result_n));
        this.g.setText(getString(this.n.acquireLevelLongTip()));
        this.f.setText(getString(this.n.acquireAdvice()));
    }
}
