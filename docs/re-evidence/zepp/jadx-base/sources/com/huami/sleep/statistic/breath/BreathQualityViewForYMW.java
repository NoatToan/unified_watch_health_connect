package com.huami.sleep.statistic.breath;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huami.sleep.databinding.ItemBreathQualityYmwBinding;
import com.huami.sleep.ext.ViewExKt;
import com.huami.sleep.statistic.dto.TimeMode;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import com.huami.sleep.ui.breathquality.BreathQualityActivity;
import com.huami.snore.core.ext.KoinExtKt;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/huami/sleep/statistic/breath/BreathQualityViewForYMW;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/huami/sleep/statistic/dto/TimeMode;", SleepAnalysisFragment.TIME_MODE, "", "time", "", "initParams", "Lcom/huami/sleep/databinding/ItemBreathQualityYmwBinding;", "a", "Lcom/huami/sleep/databinding/ItemBreathQualityYmwBinding;", "itemBreathQualityYmwBinding", "b", "Lcom/huami/sleep/statistic/dto/TimeMode;", "mode", "c", "J", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class BreathQualityViewForYMW extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ItemBreathQualityYmwBinding itemBreathQualityYmwBinding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private TimeMode mode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private long time;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<View, Unit> {
        public final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j) {
            super(1);
            this.b = j;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            BreathQualityActivity.INSTANCE.navigation(BreathQualityViewForYMW.this.getContext(), KoinExtKt.getUserInfo().getUserId(), BreathQualityViewForYMW.this.mode.getValue(), this.b);
        }
    }

    @JvmOverloads
    public BreathQualityViewForYMW(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public BreathQualityViewForYMW(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ BreathQualityViewForYMW(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? -1 : i);
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final void initParams(@NotNull TimeMode timeMode, long time) {
        this.mode = timeMode;
        this.time = time;
        ViewExKt.smartClick$default(this.itemBreathQualityYmwBinding.getRoot(), 0L, new a(time), 1, null);
    }

    @JvmOverloads
    public BreathQualityViewForYMW(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.itemBreathQualityYmwBinding = ItemBreathQualityYmwBinding.inflate(LayoutInflater.from(context), this, true);
        this.mode = TimeMode.WEEK;
        this.time = System.currentTimeMillis();
    }
}
