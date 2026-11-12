package com.huawei.health.suggestion.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.health.suggestion.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;

/* JADX INFO: loaded from: classes9.dex */
public class FitnessEmptyView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f10191a;
    private ImageView e;

    public FitnessEmptyView(Context context) {
        super(context);
        a(context);
    }

    public FitnessEmptyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public FitnessEmptyView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    private void a(Context context) {
        View viewInflate = View.inflate(context, R.layout.sug_fitness_have_norecord, this);
        this.e = (ImageView) viewInflate.findViewById(R.id.iv_sug_fitness_no_data);
        this.f10191a = (HealthTextView) viewInflate.findViewById(R.id.sug_fitnes_nodata);
        viewInflate.findViewById(R.id.sug_reco_workoutlist_nodata).setVisibility(0);
    }

    public void b() {
        if (NetworkUtil.h()) {
            this.e.setImageResource(R.drawable.ic_collect_course);
            this.f10191a.setText(R.string.IDS_hwh_sug_fitness_recom_nodata);
        } else {
            this.e.setImageResource(R.drawable.ic_recommend_list_no_network);
            this.f10191a.setText(R.string.IDS_plugin_achievement_network_error_msg_content_2);
        }
        setVisibility(0);
    }

    public void e() {
        if (getVisibility() == 0) {
            setVisibility(8);
        }
    }
}
