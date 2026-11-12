package com.xiaomi.fitness.share.view;

import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.util.SportReportComputeUtil;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.detail.util.SportShareUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.share.view.SportTraceDataView;
import com.xiaomi.fitness.statistics.StatConstants;
import defpackage.dd1;
import defpackage.fxq;
import defpackage.j1j;
import defpackage.lp5;
import defpackage.rz5;
import defpackage.xr5;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 M2\u00020\u0001:\u0002MNB\u001b\u0012\u0006\u0010H\u001a\u00020G\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010I¢\u0006\u0004\bK\u0010LJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000e\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u00142\n\u0010\u0017\u001a\u00020\u0016\"\u00020\u0005H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J-\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0002¢\u0006\u0004\b$\u0010\u0004J\u0017\u0010%\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0014¢\u0006\u0004\b'\u0010\u001cJ\r\u0010'\u001a\u00020\u0002¢\u0006\u0004\b'\u0010\u0004J\r\u0010(\u001a\u00020\u0002¢\u0006\u0004\b(\u0010\u0004J\u0015\u0010)\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0014¢\u0006\u0004\b)\u0010\u001cJ\u0015\u0010*\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0014¢\u0006\u0004\b*\u0010\u001cJ\u0015\u0010+\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0014¢\u0006\u0004\b+\u0010\u001cJ\r\u0010,\u001a\u00020\u0002¢\u0006\u0004\b,\u0010\u0004J\r\u0010-\u001a\u00020\u0002¢\u0006\u0004\b-\u0010\u0004J\u0013\u00100\u001a\u0004\u0018\u00010/*\u00020.¢\u0006\u0004\b0\u00101R\"\u00103\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0016\u00109\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R$\u0010?\u001a\u0004\u0018\u00010>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0018\u0010E\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006O"}, d2 = {"Lcom/xiaomi/fitness/share/view/SportTraceDataView;", "Landroid/widget/LinearLayout;", "", "initView", "()V", "", DailyRecordKey.sportType, "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "sportValues", "", "Lrz5;", "buildDetailElementModel", "(ILcom/xiaomi/fit/data/common/data/sport/SportBasicReport;)Ljava/util/List;", "detailList", "runOutdoorSportValues", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;Ljava/util/List;)V", "", StatConstants.PARAM_START, "Landroid/animation/AnimatorListenerAdapter;", "listenerAdapter", "", "firstDelay", "", Constants.KEY_RECHARGE_VALUES, "startEndTranslate", "(ZLandroid/animation/AnimatorListenerAdapter;J[I)V", "duration", "startDistanceAnim", "(J)V", "Lcom/xiaomi/fitness/share/view/SportTraceDataView$OnEditBtnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnEditBtnClickListener", "(Lcom/xiaomi/fitness/share/view/SportTraceDataView$OnEditBtnClickListener;)V", "sportDataType", "bindSportDetailInfo", "(ILcom/xiaomi/fit/data/common/data/sport/SportBasicReport;Ljava/util/List;)V", "translateOut", "translateInt", "(Landroid/animation/AnimatorListenerAdapter;)V", "hideEditLayout", "showEditLayout", "startClearDistanceAnim", "startSport", "pauseSport", "resumeSport", "stopAllAnim", "", "", "twoDigits", "(F)Ljava/lang/String;", "Lfxq;", "binding", "Lfxq;", "getBinding", "()Lfxq;", "setBinding", "(Lfxq;)V", "distanceF", "F", "Landroid/animation/AnimatorSet;", "transAnimatorSet", "Landroid/animation/AnimatorSet;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "editLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getEditLayout", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "setEditLayout", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "onEditBtnClickListener", "Lcom/xiaomi/fitness/share/view/SportTraceDataView$OnEditBtnClickListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "OnEditBtnClickListener", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportTraceDataView extends LinearLayout {

    @NotNull
    public static final String TAG = "SportTraceDataView";
    public fxq binding;
    private float distanceF;

    @Nullable
    private ConstraintLayout editLayout;

    @Nullable
    private OnEditBtnClickListener onEditBtnClickListener;

    @Nullable
    private AnimatorSet transAnimatorSet;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/share/view/SportTraceDataView$OnEditBtnClickListener;", "", "onEditBtnClick", "", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnEditBtnClickListener {
        void onEditBtnClick();
    }

    public /* synthetic */ SportTraceDataView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x011e  */
    /* JADX WARN: Code duplicated, block: B:25:0x014a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0153  */
    /* JADX WARN: Code duplicated, block: B:28:0x0175  */
    private final List<rz5> buildDetailElementModel(int sportType, SportBasicReport sportValues) {
        Float riseHeight;
        String strTwoDigits;
        ArrayList arrayList = new ArrayList();
        if (sportType == 9) {
            runOutdoorSportValues(sportValues, arrayList);
        } else if (sportType == 20) {
            ListExtKt.add(arrayList, new rz5(getResources().getString(j1j.ka), TimeDateUtil.getTimeStrWithSecDef(sportValues.getDuration())));
            String string = getResources().getString(j1j.R7);
            riseHeight = sportValues.getRiseHeight();
            if (riseHeight != null) {
                strTwoDigits = twoDigits(riseHeight.floatValue());
            } else {
                strTwoDigits = null;
            }
            ListExtKt.add(arrayList, new rz5(string, strTwoDigits));
            ListExtKt.add(arrayList, new rz5(getResources().getString(j1j.Y4), String.valueOf(sportValues.getCalories())));
        } else if (sportType == 22) {
            runOutdoorSportValues(sportValues, arrayList);
        } else if (sportType == 24) {
            ListExtKt.add(arrayList, new rz5(getResources().getString(j1j.ka), TimeDateUtil.getTimeStrWithSecDef(sportValues.getDuration())));
            ListExtKt.add(arrayList, new rz5(getResources().getString(j1j.Y4), String.valueOf(sportValues.getCalories())));
            String string2 = getResources().getString(j1j.Y9);
            SportShareUtil sportShareUtil = SportShareUtil.INSTANCE;
            Integer mainPosture = sportValues.getMainPosture();
            ListExtKt.add(arrayList, new rz5(string2, sportShareUtil.getPostureStr(mainPosture != null ? mainPosture.intValue() : -1)));
        } else if (sportType == 34) {
            ListExtKt.add(arrayList, new rz5(getResources().getString(j1j.ka), TimeDateUtil.getTimeStrWithSecDef(sportValues.getDuration())));
            String string3 = getResources().getString(j1j.R7);
            riseHeight = sportValues.getRiseHeight();
            if (riseHeight != null) {
                strTwoDigits = twoDigits(riseHeight.floatValue());
            } else {
                strTwoDigits = null;
            }
            ListExtKt.add(arrayList, new rz5(string3, strTwoDigits));
            ListExtKt.add(arrayList, new rz5(getResources().getString(j1j.Y4), String.valueOf(sportValues.getCalories())));
        } else if (sportType != 36) {
            switch (sportType) {
                case 26:
                    runOutdoorSportValues(sportValues, arrayList);
                    break;
                case 27:
                    ListExtKt.add(arrayList, new rz5(getResources().getString(j1j.ka), TimeDateUtil.getTimeStrWithSecDef(sportValues.getDuration())));
                    String string4 = getResources().getString(j1j.R7);
                    riseHeight = sportValues.getRiseHeight();
                    if (riseHeight != null) {
                        strTwoDigits = twoDigits(riseHeight.floatValue());
                    } else {
                        strTwoDigits = null;
                    }
                    ListExtKt.add(arrayList, new rz5(string4, strTwoDigits));
                    ListExtKt.add(arrayList, new rz5(getResources().getString(j1j.Y4), String.valueOf(sportValues.getCalories())));
                    break;
                case 28:
                    ListExtKt.add(arrayList, new rz5(getResources().getString(j1j.ka), TimeDateUtil.getTimeStrWithSecDef(sportValues.getDuration())));
                    ListExtKt.add(arrayList, new rz5(getResources().getString(j1j.t8), String.valueOf(sportValues.getSteps())));
                    ListExtKt.add(arrayList, new rz5(getResources().getString(j1j.Y4), String.valueOf(sportValues.getCalories())));
                    break;
                default:
                    runOutdoorSportValues(sportValues, arrayList);
                    break;
            }
        } else {
            ListExtKt.add(arrayList, new rz5(getResources().getString(j1j.ka), TimeDateUtil.getTimeStrWithSecDef(sportValues.getDuration())));
            ListExtKt.add(arrayList, new rz5(getResources().getString(j1j.Y4), String.valueOf(sportValues.getCalories())));
            ListExtKt.add(arrayList, new rz5(getResources().getString(j1j.x7), String.valueOf(sportValues.getAvgHr())));
        }
        return arrayList;
    }

    private final void initView() {
        setBinding(fxq.A0(LayoutInflater.from(getContext()), this, true));
        this.editLayout = getBinding().D;
        ViewExtKt.clickWithTrigger$default(getBinding().C, 0L, new Function1() { // from class: v4o
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportTraceDataView.initView$lambda$0(this.f36477a, (ImageView) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$0(SportTraceDataView this$0, ImageView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        OnEditBtnClickListener onEditBtnClickListener = this$0.onEditBtnClickListener;
        if (onEditBtnClickListener != null) {
            onEditBtnClickListener.onEditBtnClick();
        }
        return Unit.INSTANCE;
    }

    private final void runOutdoorSportValues(SportBasicReport sportValues, List<? extends rz5> detailList) {
        Integer avgHr = sportValues.getAvgHr();
        if (avgHr != null && avgHr.intValue() > 0) {
            ListExtKt.add(detailList, new rz5(getResources().getString(j1j.ka), TimeDateUtil.getTimeStrWithSecDef(sportValues.getDuration())));
            ListExtKt.add(detailList, new rz5(getResources().getString(j1j.Y4), String.valueOf(sportValues.getCalories())));
            ListExtKt.add(detailList, new rz5(getResources().getString(j1j.x7), String.valueOf(sportValues.getAvgHr())));
        } else {
            ListExtKt.add(detailList, new rz5(getResources().getString(j1j.ka), TimeDateUtil.getTimeStrWithSecDef(sportValues.getDuration())));
            ListExtKt.add(detailList, new rz5(getResources().getString(j1j.Y4), String.valueOf(sportValues.getCalories())));
            String string = getResources().getString(j1j.K3);
            Integer avgPace = SportReportComputeUtil.INSTANCE.getAvgPace(sportValues);
            ListExtKt.add(detailList, new rz5(string, TimeDateUtil.getSportPaceStrWithSecDef(avgPace != null ? avgPace.intValue() : 0)));
        }
    }

    private final void startDistanceAnim(long duration) {
        getBinding().B.f(duration, 0.0f, this.distanceF);
    }

    private final void startEndTranslate(boolean start, AnimatorListenerAdapter listenerAdapter, long firstDelay, int... values) {
        long j = firstDelay + ((long) 100);
        long j2 = firstDelay + ((long) 200);
        ValueAnimator valueAnimatorD = dd1.d(getBinding().K.A, 1000L, start ? j2 : firstDelay, Arrays.copyOf(values, values.length));
        ValueAnimator valueAnimatorD2 = dd1.d(getBinding().K.B, 1000L, j, Arrays.copyOf(values, values.length));
        ValueAnimator valueAnimatorD3 = dd1.d(getBinding().K.C, 1000L, start ? firstDelay : j2, Arrays.copyOf(values, values.length));
        AnimatorSet animatorSet = new AnimatorSet();
        this.transAnimatorSet = animatorSet;
        Intrinsics.checkNotNull(animatorSet);
        animatorSet.playTogether(valueAnimatorD, valueAnimatorD2, valueAnimatorD3);
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
        getBinding().L.setData(sportDataType);
        Integer correctedDistance = sportValues.getCorrectedDistance();
        Integer distance = (correctedDistance == null || correctedDistance.intValue() <= 0) ? sportValues.getDistance() : sportValues.getCorrectedDistance();
        Intrinsics.checkNotNull(distance);
        float f = 1000;
        this.distanceF = xr5.e(2, (distance.intValue() * 1.0f) / f);
        getBinding().B.setSportType(lp5.c(sportDataType));
        getBinding().B.setDistanceTxt((distance.intValue() * 1.0f) / f);
        List<rz5> listBuildDetailElementModel = buildDetailElementModel(sportDataType, sportValues);
        int size = listBuildDetailElementModel.size();
        for (int i = 0; i < size; i++) {
            rz5 rz5Var = listBuildDetailElementModel.get(i);
            if (i == 0) {
                getBinding().K.D.setText(rz5Var != null ? rz5Var.f33082b : null);
                getBinding().K.G.setText(rz5Var != null ? rz5Var.d : null);
            } else if (i == 1) {
                getBinding().K.E.setText(rz5Var != null ? rz5Var.f33082b : null);
                getBinding().K.H.setText(rz5Var != null ? rz5Var.d : null);
            } else if (i == 2) {
                getBinding().K.F.setText(rz5Var != null ? rz5Var.f33082b : null);
                getBinding().K.I.setText(rz5Var != null ? rz5Var.d : null);
            }
        }
    }

    @NotNull
    public final fxq getBinding() {
        fxq fxqVar = this.binding;
        if (fxqVar != null) {
            return fxqVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    @Nullable
    public final ConstraintLayout getEditLayout() {
        return this.editLayout;
    }

    public final void hideEditLayout(long duration) {
        Logger.d(TAG, "hideEditLayout running");
        dd1.d(getBinding().J, duration, 0L, Arrays.copyOf(new int[]{DisplayUtil.dip2px(80.0f)}, 1)).start();
    }

    public final void pauseSport(long duration) {
        getBinding().B.d();
        getBinding().L.pauseDynamicLine(duration);
    }

    public final void resumeSport() {
        getBinding().B.e();
        getBinding().L.resumeDynamicLine();
    }

    public final void setBinding(@NotNull fxq fxqVar) {
        Intrinsics.checkNotNullParameter(fxqVar, "<set-?>");
        this.binding = fxqVar;
    }

    public final void setEditLayout(@Nullable ConstraintLayout constraintLayout) {
        this.editLayout = constraintLayout;
    }

    public final void setOnEditBtnClickListener(@NotNull OnEditBtnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onEditBtnClickListener = listener;
    }

    public final void showEditLayout() {
        dd1.d(getBinding().J, 1000L, 0L, Arrays.copyOf(new int[]{DisplayUtil.dip2px(80.0f), 0}, 2)).start();
    }

    public final void startClearDistanceAnim(long duration) {
        getBinding().B.f(duration, this.distanceF, 0.0f);
    }

    public final void startSport(long duration) {
        startDistanceAnim(duration);
        getBinding().L.startDynamicLine(duration);
    }

    public final void stopAllAnim() {
        getBinding().B.g();
        AnimatorSet animatorSet = this.transAnimatorSet;
        if (animatorSet != null) {
            Intrinsics.checkNotNull(animatorSet);
            animatorSet.cancel();
        }
        getBinding().L.stopDynamicLine();
    }

    public final void translateInt(@Nullable AnimatorListenerAdapter listenerAdapter) {
        startEndTranslate(false, listenerAdapter, 50L, Arrays.copyOf(new int[]{DisplayUtil.dip2px(300.0f), 0}, 2));
    }

    public final void translateOut() {
        startEndTranslate(true, null, 100L, Arrays.copyOf(new int[]{0, DisplayUtil.dip2px(300.0f)}, 2));
    }

    @Nullable
    public final String twoDigits(float f) {
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat.format(Float.valueOf(f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportTraceDataView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        initView();
    }

    public final void hideEditLayout() {
        hideEditLayout(1000L);
    }
}
