package com.xiaomi.fitness.share.view;

import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.baseui.widget.SportDetailItemView;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.statistics.StatConstants;
import defpackage.bsi;
import defpackage.dd1;
import defpackage.ivi;
import defpackage.lp5;
import defpackage.rz5;
import defpackage.xr5;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010;\u001a\u0004\u0018\u00010:¢\u0006\u0004\b<\u0010=J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J5\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u000f\u001a\u00020\r\"\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u0013J\u0017\u0010\u001d\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u000b¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u000b¢\u0006\u0004\b\"\u0010!J\r\u0010#\u001a\u00020\u0004¢\u0006\u0004\b#\u0010\u0013R$\u0010$\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010\u0006R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00108\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109¨\u0006>"}, d2 = {"Lcom/xiaomi/fitness/share/view/ShareSportInfoView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "", "init", "(Landroid/content/Context;)V", "", StatConstants.PARAM_START, "Landroid/animation/AnimatorListenerAdapter;", "listenerAdapter", "", "firstDelay", "", "", Constants.KEY_RECHARGE_VALUES, "startEndTranslate", "(ZLandroid/animation/AnimatorListenerAdapter;J[I)V", "onFinishInflate", "()V", "sportDataType", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "sportValues", "", "Lrz5;", "detailList", "bindSportDetailInfo", "(ILcom/xiaomi/fit/data/common/data/sport/SportBasicReport;Ljava/util/List;)V", "translateOut", "translateInt", "(Landroid/animation/AnimatorListenerAdapter;)V", "duration", "startClearDistanceAnim", "(J)V", "startDistanceAnim", "stopAllAnim", "mContext", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;", "itemView1", "Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;", "itemView2", "itemView3", "Landroid/widget/TextView;", "txtSportName", "Landroid/widget/TextView;", "Lcom/xiaomi/fitness/share/view/TraceDistanceView;", "mTraceDistanceView", "Lcom/xiaomi/fitness/share/view/TraceDistanceView;", "Landroid/animation/AnimatorSet;", "transAnimatorSet", "Landroid/animation/AnimatorSet;", "", "distanceF", "F", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class ShareSportInfoView extends LinearLayout {
    private float distanceF;

    @Nullable
    private SportDetailItemView itemView1;

    @Nullable
    private SportDetailItemView itemView2;

    @Nullable
    private SportDetailItemView itemView3;

    @Nullable
    private Context mContext;

    @Nullable
    private TraceDistanceView mTraceDistanceView;

    @Nullable
    private AnimatorSet transAnimatorSet;

    @Nullable
    private TextView txtSportName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareSportInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        init(context);
    }

    private final void init(Context context) {
        this.mContext = context;
        LayoutInflater.from(context).inflate(ivi.Y0, this);
    }

    private final void startEndTranslate(boolean start, AnimatorListenerAdapter listenerAdapter, long firstDelay, int... values) {
        long j = firstDelay + ((long) 100);
        long j2 = firstDelay + ((long) 200);
        ValueAnimator valueAnimatorC = dd1.c(this.itemView1, 1000L, start ? j2 : firstDelay, Arrays.copyOf(values, values.length));
        ValueAnimator valueAnimatorC2 = dd1.c(this.itemView2, 1000L, j, Arrays.copyOf(values, values.length));
        ValueAnimator valueAnimatorC3 = dd1.c(this.itemView3, 1000L, start ? firstDelay : j2, Arrays.copyOf(values, values.length));
        AnimatorSet animatorSet = new AnimatorSet();
        this.transAnimatorSet = animatorSet;
        Intrinsics.checkNotNull(animatorSet);
        animatorSet.playTogether(valueAnimatorC, valueAnimatorC2, valueAnimatorC3);
        AnimatorSet animatorSet2 = this.transAnimatorSet;
        Intrinsics.checkNotNull(animatorSet2);
        animatorSet2.start();
        if (listenerAdapter != null) {
            AnimatorSet animatorSet3 = this.transAnimatorSet;
            Intrinsics.checkNotNull(animatorSet3);
            animatorSet3.addListener(listenerAdapter);
        }
    }

    public final void bindSportDetailInfo(int sportDataType, @NotNull SportBasicReport sportValues, @NotNull List<? extends rz5> detailList) {
        Intrinsics.checkNotNullParameter(sportValues, "sportValues");
        Intrinsics.checkNotNullParameter(detailList, "detailList");
        Integer correctedDistance = sportValues.getCorrectedDistance();
        Integer distance = (correctedDistance == null || correctedDistance.intValue() <= 0) ? sportValues.getDistance() : sportValues.getCorrectedDistance();
        Intrinsics.checkNotNull(distance);
        float f = 1000;
        this.distanceF = xr5.e(2, (distance.intValue() * 1.0f) / f);
        TextView textView = this.txtSportName;
        Intrinsics.checkNotNull(textView);
        textView.setText(lp5.c(sportDataType));
        TraceDistanceView traceDistanceView = this.mTraceDistanceView;
        Intrinsics.checkNotNull(traceDistanceView);
        traceDistanceView.setDistanceTxt((distance.intValue() * 1.0f) / f);
        int size = detailList.size();
        for (int i = 0; i < size; i++) {
            rz5 rz5Var = detailList.get(i);
            if (i == 0) {
                SportDetailItemView sportDetailItemView = this.itemView1;
                Intrinsics.checkNotNull(sportDetailItemView);
                SportDetailItemView.bindData$default(sportDetailItemView, rz5Var, false, 2, null);
            } else if (i == 1) {
                SportDetailItemView sportDetailItemView2 = this.itemView2;
                Intrinsics.checkNotNull(sportDetailItemView2);
                SportDetailItemView.bindData$default(sportDetailItemView2, rz5Var, false, 2, null);
            } else if (i == 2) {
                SportDetailItemView sportDetailItemView3 = this.itemView3;
                Intrinsics.checkNotNull(sportDetailItemView3);
                SportDetailItemView.bindData$default(sportDetailItemView3, rz5Var, false, 2, null);
            }
        }
    }

    @Nullable
    public final Context getMContext() {
        return this.mContext;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.itemView1 = (SportDetailItemView) findViewById(bsi.k1);
        this.itemView2 = (SportDetailItemView) findViewById(bsi.l1);
        this.itemView3 = (SportDetailItemView) findViewById(bsi.m1);
        this.txtSportName = (TextView) findViewById(bsi.W8);
        this.mTraceDistanceView = (TraceDistanceView) findViewById(bsi.aa);
    }

    public final void setMContext(@Nullable Context context) {
        this.mContext = context;
    }

    public final void startClearDistanceAnim(long duration) {
        TraceDistanceView traceDistanceView = this.mTraceDistanceView;
        Intrinsics.checkNotNull(traceDistanceView);
        traceDistanceView.d(duration, this.distanceF, 0.0f);
    }

    public final void startDistanceAnim(long duration) {
        TraceDistanceView traceDistanceView = this.mTraceDistanceView;
        Intrinsics.checkNotNull(traceDistanceView);
        traceDistanceView.d(duration, 0.0f, this.distanceF);
    }

    public final void stopAllAnim() {
        TraceDistanceView traceDistanceView = this.mTraceDistanceView;
        Intrinsics.checkNotNull(traceDistanceView);
        traceDistanceView.e();
        AnimatorSet animatorSet = this.transAnimatorSet;
        if (animatorSet != null) {
            Intrinsics.checkNotNull(animatorSet);
            animatorSet.cancel();
        }
    }

    public final void translateInt(@Nullable AnimatorListenerAdapter listenerAdapter) {
        int[] iArr = getLayoutDirection() == 0 ? new int[]{-DisplayUtil.dip2px(300.0f), 0} : new int[]{DisplayUtil.dip2px(300.0f), 0};
        startEndTranslate(false, listenerAdapter, 50L, Arrays.copyOf(iArr, iArr.length));
    }

    public final void translateOut() {
        int[] iArr = getLayoutDirection() == 0 ? new int[]{0, -DisplayUtil.dip2px(300.0f)} : new int[]{0, DisplayUtil.dip2px(300.0f)};
        startEndTranslate(true, null, 100L, Arrays.copyOf(iArr, iArr.length));
    }
}
