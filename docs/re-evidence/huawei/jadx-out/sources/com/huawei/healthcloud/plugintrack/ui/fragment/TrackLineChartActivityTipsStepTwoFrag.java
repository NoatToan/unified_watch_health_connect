package com.huawei.healthcloud.plugintrack.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.TipsFragment;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.utils.CustomChartTitleBar;

/* JADX INFO: loaded from: classes33.dex */
public class TrackLineChartActivityTipsStepTwoFrag extends TipsFragment implements View.OnTouchListener, View.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View.OnClickListener f11135c = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View.OnClickListener f11134b = null;

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (layoutInflater == null) {
            throw new RuntimeException("LayoutInflater not found.");
        }
        LogUtil.a("Track_TrackLineChartActivityTipsFrag", "onCreateView--------");
        View viewInflate = layoutInflater.inflate(R.layout.track_linechart_tips_frag_step_two, (ViewGroup) null);
        if (!(viewInflate instanceof RelativeLayout)) {
            LogUtil.e("Track_TrackLineChartActivityTipsFrag", "object is not instanceof RelativeLayout");
            return null;
        }
        RelativeLayout relativeLayout = (RelativeLayout) viewInflate;
        RelativeLayout relativeLayout2 = (RelativeLayout) relativeLayout.findViewById(R.id.step_two_click_tips);
        int iC = CustomChartTitleBar.c(layoutInflater.getContext());
        ViewGroup.LayoutParams layoutParams = relativeLayout2.getLayoutParams();
        if (!(layoutParams instanceof RelativeLayout.LayoutParams)) {
            LogUtil.e("Track_TrackLineChartActivityTipsFrag", "objectLayoutParams is not instanceof LayoutParams");
            return null;
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.height = iC;
        relativeLayout2.setLayoutParams(layoutParams2);
        relativeLayout.setOnTouchListener(this);
        relativeLayout.findViewById(R.id.all_content).setOnClickListener(this);
        relativeLayout.findViewById(R.id.tips_close_btn).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.TrackLineChartActivityTipsStepTwoFrag.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("Track_TrackLineChartActivityTipsFrag", "onClick tips close");
                if (TrackLineChartActivityTipsStepTwoFrag.this.f11134b != null) {
                    TrackLineChartActivityTipsStepTwoFrag.this.f11134b.onClick(view);
                }
            }
        });
        return relativeLayout;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        LogUtil.a("Track_TrackLineChartActivityTipsFrag", "onClick frag,tips next");
        View.OnClickListener onClickListener = this.f11135c;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.TipsFragment
    public void setOnNextClickListener(View.OnClickListener onClickListener) {
        this.f11135c = onClickListener;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.TipsFragment
    public void setOnCloseClickListener(View.OnClickListener onClickListener) {
        this.f11134b = onClickListener;
    }
}
