package com.xiaomi.fitness.health.stand;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import defpackage.eri;
import defpackage.jui;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u000eH\u0014J\u0006\u0010\u000f\u001a\u00020\u000eJ\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/health/stand/StandManualSetView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "mContext", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "standSetTime", "Landroid/widget/TextView;", "standManualSetBtn", "onFinishInflate", "", "bindData", "getStandManualSetBtn", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StandManualSetView extends ConstraintLayout {

    @NotNull
    private final Context mContext;

    @Nullable
    private TextView standManualSetBtn;

    @Nullable
    private TextView standSetTime;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StandManualSetView(@NotNull Context mContext) {
        this(mContext, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
    }

    public final void bindData() {
        long currentHourTime = TimeDateUtil.getCurrentHourTime();
        String dateStr = TimeDateUtil.getDateStr(currentHourTime, TimeUtils.FORMAT_H_M);
        String dateStr2 = TimeDateUtil.getDateStr(currentHourTime + TimeDateUtil.TIME_HOUR, TimeUtils.FORMAT_H_M);
        TextView textView = this.standSetTime;
        Intrinsics.checkNotNull(textView);
        textView.setText(dateStr + "-" + dateStr2);
    }

    @Nullable
    public final TextView getStandManualSetBtn() {
        return this.standManualSetBtn;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.standSetTime = (TextView) findViewById(eri.hh);
        this.standManualSetBtn = (TextView) findViewById(eri.gh);
        setFocusable(true);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StandManualSetView(@NotNull Context mContext, @Nullable AttributeSet attributeSet) {
        this(mContext, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
    }

    public /* synthetic */ StandManualSetView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StandManualSetView(@NotNull Context mContext, @Nullable AttributeSet attributeSet, int i) {
        super(mContext, attributeSet, i);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.mContext = mContext;
        LayoutInflater.from(mContext).inflate(jui.I8, this);
    }
}
