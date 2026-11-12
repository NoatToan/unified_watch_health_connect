package com.huami.sleep.daysleep.sleepstagechart.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.huami.sleep.R;
import com.huami.sleep.daysleep.sleepstagechart.vo.SleepStageDurationInfo;
import com.huami.sleep.ext.ViewExKt;
import com.huami.sleep.util.TimeShowUtilsKt;
import com.huami.sleep.view.UnitTextView;
import com.huami.tools.analytics.DbUtils;
import java.util.Arrays;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0010"}, d2 = {"Lcom/huami/sleep/daysleep/sleepstagechart/ui/view/SleepStageInfoView;", "Landroid/widget/FrameLayout;", "Lcom/huami/sleep/daysleep/sleepstagechart/vo/SleepStageDurationInfo;", "data", "", "update", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepStageInfoView extends FrameLayout {
    public SleepStageInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.layout_sleep_stage_chart_intro, this);
        setVisibility(8);
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final void update(@NotNull SleepStageDurationInfo data) {
        UnitTextView unitTextView = (UnitTextView) findViewById(R.id.dpDurationTv);
        String[] durationStr$default = TimeShowUtilsKt.getDurationStr$default(data.getDeepDuration(), getContext(), false, false, 2, null);
        unitTextView.setValues((String[]) Arrays.copyOf(durationStr$default, durationStr$default.length));
        UnitTextView unitTextView2 = (UnitTextView) findViewById(R.id.lightDurationTv);
        String[] durationStr$default2 = TimeShowUtilsKt.getDurationStr$default(data.getLightDuration(), getContext(), false, false, 2, null);
        unitTextView2.setValues((String[]) Arrays.copyOf(durationStr$default2, durationStr$default2.length));
        UnitTextView unitTextView3 = (UnitTextView) findViewById(R.id.remDurationTv);
        String[] durationStr$default3 = TimeShowUtilsKt.getDurationStr$default(data.getRemDuration(), getContext(), false, false, 2, null);
        unitTextView3.setValues((String[]) Arrays.copyOf(durationStr$default3, durationStr$default3.length));
        UnitTextView unitTextView4 = (UnitTextView) findViewById(R.id.wakeDurationTv);
        String[] durationStr$default4 = TimeShowUtilsKt.getDurationStr$default(data.getAwakeDuration(), getContext(), false, false, 2, null);
        unitTextView4.setValues((String[]) Arrays.copyOf(durationStr$default4, durationStr$default4.length));
        ViewExKt.setVisible((LinearLayout) findViewById(R.id.remLayout), data.isRemSupport());
    }

    public SleepStageInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SleepStageInfoView(@NotNull Context context) {
        this(context, null);
    }
}
