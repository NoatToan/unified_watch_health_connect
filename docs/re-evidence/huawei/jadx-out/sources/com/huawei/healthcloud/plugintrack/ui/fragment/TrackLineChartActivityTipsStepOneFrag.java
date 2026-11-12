package com.huawei.healthcloud.plugintrack.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.TipsFragment;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes33.dex */
public class TrackLineChartActivityTipsStepOneFrag extends TipsFragment implements View.OnTouchListener, View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View.OnClickListener f11133a = null;
    private View.OnClickListener e = null;

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
        View viewInflate = layoutInflater.inflate(R.layout.track_linechart_tips_frag_step_one, (ViewGroup) null);
        if (!(viewInflate instanceof LinearLayout)) {
            LogUtil.e("Track_TrackLineChartActivityTipsFrag", "object is not instanceof LinearLayout");
            return null;
        }
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        linearLayout.setOnTouchListener(this);
        linearLayout.findViewById(R.id.all_content).setOnClickListener(this);
        linearLayout.findViewById(R.id.tips_close_btn).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.TrackLineChartActivityTipsStepOneFrag.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("Track_TrackLineChartActivityTipsFrag", "onClick tips close");
                if (TrackLineChartActivityTipsStepOneFrag.this.e != null) {
                    TrackLineChartActivityTipsStepOneFrag.this.e.onClick(view);
                }
            }
        });
        return linearLayout;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        LogUtil.a("Track_TrackLineChartActivityTipsFrag", "onClick frag,tips next");
        View.OnClickListener onClickListener = this.f11133a;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.TipsFragment
    public void setOnNextClickListener(View.OnClickListener onClickListener) {
        this.f11133a = onClickListener;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.TipsFragment
    public void setOnCloseClickListener(View.OnClickListener onClickListener) {
        this.e = onClickListener;
    }
}
