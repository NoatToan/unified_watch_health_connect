package com.huawei.healthcloud.plugintrack.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class TrainingResultsView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthDivider f11360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f11361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f11362c;
    private HealthTextView d;
    private HealthTextView e;

    public TrainingResultsView(Context context) {
        super(context);
        d(context);
    }

    public TrainingResultsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d(context);
    }

    public TrainingResultsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d(context);
    }

    private void d(Context context) {
        if (context == null) {
            ReleaseLogUtil.a("Track_TrainingResultsView", "context is null");
            return;
        }
        View viewInflate = View.inflate(context, R.layout.track_detail_training_results, this);
        ((HealthSubHeader) viewInflate.findViewById(R.id.sub_header_training)).setPaddingStartEnd(0.0f, 0.0f);
        this.f11361b = (HealthTextView) viewInflate.findViewById(R.id.training_course_name);
        this.d = (HealthTextView) viewInflate.findViewById(R.id.training_course_difficulty);
        this.e = (HealthTextView) viewInflate.findViewById(R.id.training_course_duration);
        this.f11362c = (HealthTextView) viewInflate.findViewById(R.id.training_course_finish);
        this.f11360a = (HealthDivider) viewInflate.findViewById(R.id.health_divider_training_result);
    }

    public void setCourseName(String str) {
        HealthTextView healthTextView = this.f11361b;
        if (healthTextView == null) {
            LogUtil.j("Track_TrainingResultsView", "mCourseName is null");
        } else {
            healthTextView.setText(str);
        }
    }

    public void setCourseDifficulty(String str) {
        HealthTextView healthTextView = this.d;
        if (healthTextView == null) {
            LogUtil.j("Track_TrainingResultsView", "mCourseName is null");
        } else {
            healthTextView.setText(str);
        }
    }

    public void setCourseDuration(String str) {
        HealthTextView healthTextView = this.e;
        if (healthTextView == null) {
            LogUtil.j("Track_TrainingResultsView", "mCourseName is null");
        } else {
            healthTextView.setText(str);
        }
    }

    public void setCourseFinish(float f) {
        if (f <= 0.0f) {
            LogUtil.j("Track_TrainingResultsView", "courseFinish is 0");
            return;
        }
        HealthTextView healthTextView = this.f11362c;
        if (healthTextView == null) {
            LogUtil.j("Track_TrainingResultsView", "mCourseName is null");
        } else {
            healthTextView.setText(BaseApplication.getContext().getString(R.string.IDS_track_detail_finish_rate, UnitUtil.e(f, 2, 0)));
        }
    }

    public void setHealthDivider(boolean z) {
        if (z) {
            this.f11360a.setVisibility(8);
        }
    }
}
