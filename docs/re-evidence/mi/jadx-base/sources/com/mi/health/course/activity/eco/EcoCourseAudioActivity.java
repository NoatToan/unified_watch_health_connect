package com.mi.health.course.activity.eco;

import android.animation.Animator;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import com.airbnb.lottie.LottieAnimationView;
import com.mi.health.course.LineChartType;
import com.mi.health.course.activity.eco.EcoCourseAudioActivity;
import com.mi.health.course.data.CourseSportState;
import com.mi.health.course.eco.widget.LineChartView;
import com.mi.health.course.export.data.CourseConfigModel;
import com.mi.health.course.export.data.CourseModel;
import com.mi.health.course.ext.CourseExtKt;
import com.mi.health.course.util.TextTypefaceSpan;
import com.miui.tsmclient.util.StringUtils;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.account.HrZoneLevel;
import com.xiaomi.fitness.baseui.dialog.DriftDialog;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.nfc.ui.realname.RealNameWebViewActivity;
import com.xiaomi.fitness.sport_eco_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback;
import com.xiaomi.wearable.course.data.LinechartDataEntity;
import com.xiaomi.wearable.course.data.LinechartViewProperty;
import defpackage.bli;
import defpackage.czi;
import defpackage.ew1;
import defpackage.ez5;
import defpackage.ipi;
import defpackage.kyi;
import defpackage.oqi;
import defpackage.rvn;
import defpackage.sti;
import defpackage.tj7;
import defpackage.xmi;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 k2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001kB\u0007¢\u0006\u0004\bj\u0010\nJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\nJ\u001f\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010\bJ\u000f\u0010\"\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010\nJ\u000f\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010\nJ\u000f\u0010$\u001a\u00020\u0006H\u0002¢\u0006\u0004\b$\u0010\nJ\u0019\u0010'\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0006H\u0002¢\u0006\u0004\b)\u0010\nJ\u001f\u0010-\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u0019\u00101\u001a\u00020\u00062\b\u00100\u001a\u0004\u0018\u00010/H\u0014¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\rH\u0016¢\u0006\u0004\b3\u00104J\u0015\u00107\u001a\u00020\u00142\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u000209H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0006H\u0016¢\u0006\u0004\b<\u0010\nJ\u000f\u0010=\u001a\u00020\u0006H\u0016¢\u0006\u0004\b=\u0010\nJ\u000f\u0010>\u001a\u00020\u0006H\u0014¢\u0006\u0004\b>\u0010\nR\u0018\u0010?\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010D\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER#\u0010K\u001a\n F*\u0004\u0018\u00010%0%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0018\u0010M\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010O\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010R\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010U\u001a\u0004\u0018\u00010T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR#\u0010Z\u001a\n F*\u0004\u0018\u00010T0T8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010H\u001a\u0004\bX\u0010YR\u0014\u0010[\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010PR \u0010^\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020]0\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u001b\u0010d\u001a\u00020`8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\ba\u0010H\u001a\u0004\bb\u0010cR\u0014\u0010g\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010fR\u0014\u0010i\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u0010f¨\u0006l"}, d2 = {"Lcom/mi/health/course/activity/eco/EcoCourseAudioActivity;", "Lcom/mi/health/course/activity/eco/EcoBaseCourseActivity;", "Lcom/mi/health/course/activity/eco/EcoCourseAudioVM;", "Ltj7;", "", "duration", "", "setDuration", "(I)V", "addObserver", "()V", "initData", "initClickEvent", "", "islink", "setLinkSrc", "(Z)V", "state", "setButtonStatus", "configConcernData", "", "key", "", "value", "setConcernData", "(Ljava/lang/String;F)V", "fullStr", "valueLength", "txtSize", "Landroid/text/SpannableStringBuilder;", "buildSpan", "(Ljava/lang/String;II)Landroid/text/SpannableStringBuilder;", "hr", "setHrLabel", "startSport", "pauseSport", "resumeSport", "Lcom/airbnb/lottie/LottieAnimationView;", "lottie", "setCountdownMode", "(Lcom/airbnb/lottie/LottieAnimationView;)V", "showCountDownAnimation", "num", "", "milliseconds", "countDownTime", "(IJ)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "isSendCmd", "()Z", "", RealNameWebViewActivity.NUMBER, "roundUpToTwoDecimalPlaces", "(D)Ljava/lang/String;", "Lcom/mi/health/course/data/CourseSportState;", "onSportStateChange", "(Lcom/mi/health/course/data/CourseSportState;)V", "finishCourse", "onBackPressed", LifecycleConstantKt.ON_DESTROY, "model", "Ljava/lang/String;", "Ljava/text/SimpleDateFormat;", "mDurationFormat", "Ljava/text/SimpleDateFormat;", "isPause", "Z", "kotlin.jvm.PlatformType", "countDownLottieView$delegate", "Lkotlin/Lazy;", "getCountDownLottieView", "()Lcom/airbnb/lottie/LottieAnimationView;", "countDownLottieView", "Landroid/os/CountDownTimer;", "timer", "Landroid/os/CountDownTimer;", "count", "I", "Lcom/xiaomi/fitness/baseui/dialog/DriftDialog;", "errorDialog", "Lcom/xiaomi/fitness/baseui/dialog/DriftDialog;", "Landroid/graphics/Typeface;", "typeFace", "Landroid/graphics/Typeface;", "unitTypeFace$delegate", "getUnitTypeFace", "()Landroid/graphics/Typeface;", "unitTypeFace", "unitTextColor", "", "Landroid/view/View;", "concernedConfig", "Ljava/util/Map;", "Ljava/lang/Runnable;", "finishTimeout$delegate", "getFinishTimeout", "()Ljava/lang/Runnable;", "finishTimeout", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nEcoCourseAudioActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcoCourseAudioActivity.kt\ncom/mi/health/course/activity/eco/EcoCourseAudioActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,733:1\n1863#2,2:734\n*S KotlinDebug\n*F\n+ 1 EcoCourseAudioActivity.kt\ncom/mi/health/course/activity/eco/EcoCourseAudioActivity\n*L\n407#1:734,2\n*E\n"})
public final class EcoCourseAudioActivity extends Hilt_EcoCourseAudioActivity<EcoCourseAudioVM, tj7> {

    @NotNull
    public static final String TAG = "EcoCourseAudioActivity";
    public static final long TIMEOUT = 10000;
    private int count;

    @Nullable
    private DriftDialog errorDialog;
    private boolean isPause;

    @Nullable
    private CountDownTimer timer;

    @Nullable
    private String model = "ksmb.treadmill.m1v1";

    @NotNull
    private final SimpleDateFormat mDurationFormat = new SimpleDateFormat(StringUtils.EXPECT_TIME_FORMAT);

    /* JADX INFO: renamed from: countDownLottieView$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy countDownLottieView = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: uk7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoCourseAudioActivity.countDownLottieView_delegate$lambda$0(this.f35862a);
        }
    });

    @Nullable
    private final Typeface typeFace = DisplayUtil.getTypefaceAsResourceId(AppUtil.getApp(), ipi.f21978a);

    /* JADX INFO: renamed from: unitTypeFace$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy unitTypeFace = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: wk7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoCourseAudioActivity.unitTypeFace_delegate$lambda$1(this.f38054a);
        }
    });
    private final int unitTextColor = Color.parseColor("#8c000000");

    @NotNull
    private final Map<String, View> concernedConfig = new LinkedHashMap();

    /* JADX INFO: renamed from: finishTimeout$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy finishTimeout = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: yk7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoCourseAudioActivity.finishTimeout_delegate$lambda$15(this.f40263a);
        }
    });

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HrZoneLevel.values().length];
            try {
                iArr[HrZoneLevel.Smooth.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HrZoneLevel.WarmUp.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HrZoneLevel.FatBurning.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HrZoneLevel.Aerobic.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HrZoneLevel.Anaerobic.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HrZoneLevel.Extreme.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ EcoCourseAudioVM access$getMViewModel(EcoCourseAudioActivity ecoCourseAudioActivity) {
        return (EcoCourseAudioVM) ecoCourseAudioActivity.getMViewModel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void addObserver() {
        ((EcoCourseAudioVM) getMViewModel()).setOnDataChange(new Function1() { // from class: mk7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoCourseAudioActivity.addObserver$lambda$3(this.f26948a, (PhoneSportData) obj);
            }
        });
        ((EcoCourseAudioVM) getMViewModel()).getLineChartDataEmitter().observe(this, new Observer() { // from class: ok7
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                EcoCourseAudioActivity.addObserver$lambda$4(this.f29240a, (LinechartViewProperty) obj);
            }
        });
        ((EcoCourseAudioVM) getMViewModel()).setOnPlayError(new Function1() { // from class: qk7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoCourseAudioActivity.addObserver$lambda$5(this.f31586a, ((Boolean) obj).booleanValue());
            }
        });
        ((EcoCourseAudioVM) getMViewModel()).getTitleEmitter().observe(this, new Observer() { // from class: sk7
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                EcoCourseAudioActivity.addObserver$lambda$6(this.f33729a, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit addObserver$lambda$3(EcoCourseAudioActivity this$0, PhoneSportData it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.setDistance(it.distance);
        this$0.setHrLabel(it.heart_rate);
        this$0.checkHr(it.heart_rate);
        this$0.setDuration((int) it.deviceDuration);
        float f = it.speed;
        float f2 = it.bike_rpm;
        float f3 = 1000;
        this$0.setConcernData("distance", it.distance / f3);
        this$0.setConcernData("calorie", it.calorie / f3);
        this$0.setConcernData("speed", f);
        if (Intrinsics.areEqual(this$0.model, "runmi.exbike.jscrm1") || Intrinsics.areEqual(this$0.model, "yesoul.exbike.jsc01y")) {
            this$0.setConcernData("resistance", it.bike_resistance_level);
            this$0.setConcernData("rpm", it.bike_rpm);
            this$0.setConcernData("power", it.bike_power);
            if (Intrinsics.areEqual(((EcoCourseAudioVM) this$0.getMViewModel()).getLineChartType(), LineChartType.TIME.getItem())) {
                ((tj7) this$0.getMBinding()).U.updateData(new LinechartDataEntity(it.deviceDuration / 60, f2));
            }
            ((EcoCourseAudioVM) this$0.getMViewModel()).showBikeData();
        } else {
            if (Intrinsics.areEqual(((EcoCourseAudioVM) this$0.getMViewModel()).getLineChartType(), LineChartType.TIME.getItem())) {
                ((tj7) this$0.getMBinding()).U.updateData(new LinechartDataEntity(it.deviceDuration / 60, f));
            } else {
                ((tj7) this$0.getMBinding()).U.updateData(new LinechartDataEntity(it.distance, f));
            }
            ((EcoCourseAudioVM) this$0.getMViewModel()).sendCmd(it.distance);
        }
        try {
            CourseModel.CourseData basicInfo = this$0.getInfo().getBasicInfo();
            Integer numValueOf = basicInfo != null ? Integer.valueOf(basicInfo.duration) : null;
            Intrinsics.checkNotNull(numValueOf);
            if (numValueOf.intValue() > 0) {
                long j = it.deviceDuration;
                CourseModel.CourseData basicInfo2 = this$0.getInfo().getBasicInfo();
                Integer numValueOf2 = basicInfo2 != null ? Integer.valueOf(basicInfo2.duration) : null;
                Intrinsics.checkNotNull(numValueOf2);
                if (j > (numValueOf2.intValue() * 60) + 1) {
                    this$0.finishCourse();
                }
            }
        } catch (Exception unused) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void addObserver$lambda$4(EcoCourseAudioActivity this$0, LinechartViewProperty linechartViewProperty) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!Intrinsics.areEqual(this$0.model, "runmi.exbike.jscrm1") && !Intrinsics.areEqual(this$0.model, "yesoul.exbike.jsc01y")) {
            ((tj7) this$0.getMBinding()).U.initRecommendData(linechartViewProperty.getRecommendList());
            String type = linechartViewProperty.getType();
            LineChartType lineChartType = LineChartType.TIME;
            if (Intrinsics.areEqual(type, lineChartType.getItem())) {
                ((tj7) this$0.getMBinding()).U.setXType(lineChartType, linechartViewProperty.getMaxValueX());
                return;
            } else {
                ((tj7) this$0.getMBinding()).U.setXType(LineChartType.DISTANCE, linechartViewProperty.getMaxValueX());
                return;
            }
        }
        ((tj7) this$0.getMBinding()).U.initBikeRecommendData(linechartViewProperty.getRecommendList());
        LineChartView lineChartView = ((tj7) this$0.getMBinding()).U;
        LineChartType lineChartType2 = LineChartType.RPM;
        lineChartView.setYType(lineChartType2);
        String type2 = linechartViewProperty.getType();
        LineChartType lineChartType3 = LineChartType.TIME;
        if (Intrinsics.areEqual(type2, lineChartType3.getItem())) {
            ((tj7) this$0.getMBinding()).U.setXType(lineChartType3, linechartViewProperty.getMaxValueX());
        } else {
            ((tj7) this$0.getMBinding()).U.setXType(lineChartType2, linechartViewProperty.getMaxValueX());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addObserver$lambda$5(EcoCourseAudioActivity this$0, boolean z) {
        DriftDialog driftDialog;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.pauseSport();
            DriftDialog driftDialog2 = this$0.errorDialog;
            if (driftDialog2 != null && driftDialog2.isVisible()) {
                return Unit.INSTANCE;
            }
            String string = this$0.getString(czi.course_audio_error_title);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = this$0.getString(czi.course_audio_error_desc);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            DriftDialog driftDialogShowErrorDialog = this$0.showErrorDialog(string, string2);
            this$0.errorDialog = driftDialogShowErrorDialog;
            if (driftDialogShowErrorDialog != null) {
                FragmentManager supportFragmentManager = this$0.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                driftDialogShowErrorDialog.show(supportFragmentManager);
            }
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            DriftDialog driftDialog3 = this$0.errorDialog;
            if (driftDialog3 != null && driftDialog3.isVisible() && (driftDialog = this$0.errorDialog) != null) {
                driftDialog.dismissAllowingStateLoss();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void addObserver$lambda$6(EcoCourseAudioActivity this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((tj7) this$0.getMBinding()).D.setText(str);
    }

    private final SpannableStringBuilder buildSpan(String fullStr, int valueLength, int txtSize) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fullStr);
        if (this.typeFace == null || getUnitTypeFace() == null) {
            return spannableStringBuilder;
        }
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(txtSize, true), 0, valueLength, 17);
        spannableStringBuilder.setSpan(new TextTypefaceSpan(this.typeFace), 0, valueLength, 17);
        Typeface unitTypeFace = getUnitTypeFace();
        Intrinsics.checkNotNullExpressionValue(unitTypeFace, "<get-unitTypeFace>(...)");
        spannableStringBuilder.setSpan(new TextTypefaceSpan(unitTypeFace), valueLength, fullStr.length(), 17);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(13, true), valueLength, fullStr.length(), 17);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor(UIUtils.isNightMode(this) ? "#8cffffff" : "#8c000000")), valueLength, fullStr.length(), 17);
        return spannableStringBuilder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void configConcernData() {
        ((tj7) getMBinding()).J.removeAllViews();
        ((tj7) getMBinding()).K.removeAllViews();
        CourseConfigModel.DeviceLinkage deviceLinkage = getDeviceLinkage();
        if (deviceLinkage != null) {
            if (!deviceLinkage.concernDataSet.contains("power")) {
                deviceLinkage.concernDataSet.add("power");
            }
            if (!deviceLinkage.concernDataSet.contains("distance")) {
                deviceLinkage.concernDataSet.add("distance");
            }
            List<String> concernDataSet = deviceLinkage.concernDataSet;
            Intrinsics.checkNotNullExpressionValue(concernDataSet, "concernDataSet");
            for (IndexedValue indexedValue : CollectionsKt___CollectionsKt.withIndex(concernDataSet)) {
                FitnessLogUtils.d(TAG, "setConcernData: " + indexedValue);
                if (!Intrinsics.areEqual(indexedValue.getValue(), "hrm")) {
                    int childCount = ((tj7) getMBinding()).J.getChildCount() + ((tj7) getMBinding()).K.getChildCount();
                    if (childCount < 0 || childCount >= 3) {
                        View viewInflate = LayoutInflater.from(this).inflate(sti.i, (ViewGroup) ((tj7) getMBinding()).K, false);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(((tj7) getMBinding()).K.getLayoutParams());
                        layoutParams.setMargins(ez5.a(childCount == 3 ? 0 : 27), ez5.a(2), 0, 0);
                        viewInflate.setLayoutParams(layoutParams);
                        if (childCount == 4) {
                            Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type android.widget.TextView");
                            ((TextView) viewInflate).setGravity(17);
                        }
                        ((tj7) getMBinding()).K.setVisibility(0);
                        ((tj7) getMBinding()).K.addView(viewInflate);
                        this.concernedConfig.put((String) indexedValue.getValue(), viewInflate);
                    } else {
                        View viewInflate2 = LayoutInflater.from(this).inflate(sti.i, (ViewGroup) ((tj7) getMBinding()).J, false);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(((tj7) getMBinding()).J.getLayoutParams());
                        layoutParams2.setMargins(ez5.a(childCount == 0 ? 0 : 27), ez5.a(2), 0, 0);
                        viewInflate2.setLayoutParams(layoutParams2);
                        if (childCount == 1) {
                            Intrinsics.checkNotNull(viewInflate2, "null cannot be cast to non-null type android.widget.TextView");
                            ((TextView) viewInflate2).setGravity(17);
                        }
                        ((tj7) getMBinding()).J.addView(viewInflate2);
                        this.concernedConfig.put((String) indexedValue.getValue(), viewInflate2);
                    }
                }
            }
            Iterator<Map.Entry<String, View>> it = this.concernedConfig.entrySet().iterator();
            while (it.hasNext()) {
                setConcernData(it.next().getKey(), 0.0f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LottieAnimationView countDownLottieView_delegate$lambda$0(EcoCourseAudioActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return (LottieAnimationView) this$0.findViewById(oqi.K);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void countDownTime(int num, long milliseconds) {
        this.count = num;
        CountDownTimer countDownTimer = new CountDownTimer(milliseconds, ((long) num) * milliseconds) { // from class: com.mi.health.course.activity.eco.EcoCourseAudioActivity.countDownTime.1
            @Override // android.os.CountDownTimer
            public void onFinish() {
            }

            @Override // android.os.CountDownTimer
            public void onTick(long millisUntilFinished) {
                if (this.count > 0) {
                    rvn rvnVarY = rvn.Y(this.getApplication());
                    int i = this.count;
                    this.count = i - 1;
                    rvnVarY.L(i);
                }
            }
        };
        this.timer = countDownTimer;
        countDownTimer.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Runnable finishTimeout_delegate$lambda$15(final EcoCourseAudioActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new Runnable() { // from class: ck7
            @Override // java.lang.Runnable
            public final void run() {
                EcoCourseAudioActivity.finishTimeout_delegate$lambda$15$lambda$14(this.f5419a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void finishTimeout_delegate$lambda$15$lambda$14(EcoCourseAudioActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.d(TAG, "finish AudioCourse timeout");
        this$0.quitCourse();
    }

    private final LottieAnimationView getCountDownLottieView() {
        return (LottieAnimationView) this.countDownLottieView.getValue();
    }

    private final Runnable getFinishTimeout() {
        return (Runnable) this.finishTimeout.getValue();
    }

    private final Typeface getUnitTypeFace() {
        return (Typeface) this.unitTypeFace.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initClickEvent() {
        ((tj7) getMBinding()).C.setOnClickListener(new View.OnClickListener() { // from class: al7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EcoCourseAudioActivity.initClickEvent$lambda$7(this.f1160a, view);
            }
        });
        ((tj7) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: cl7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EcoCourseAudioActivity.initClickEvent$lambda$8(this.f5450a, view);
            }
        });
        ((tj7) getMBinding()).B.setOnClickListener(new View.OnClickListener() { // from class: ek7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EcoCourseAudioActivity.initClickEvent$lambda$9(this.f16722a, view);
            }
        });
        ((tj7) getMBinding()).T.setOnClickListener(new View.OnClickListener() { // from class: gk7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EcoCourseAudioActivity.initClickEvent$lambda$10(this.f19075a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initClickEvent$lambda$10(EcoCourseAudioActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setCmdEnable(!this$0.getCmdEnable());
        this$0.setLinkSrc(this$0.getCmdEnable());
        ((EcoCourseAudioVM) this$0.getMViewModel()).setCmdEnable(this$0.getCmdEnable());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initClickEvent$lambda$7(EcoCourseAudioActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (((EcoCourseAudioVM) this$0.getMViewModel()).isSportValid()) {
            this$0.showStopDialog();
        } else {
            this$0.showTimeTooShortDialog();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickEvent$lambda$8(EcoCourseAudioActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.resumeSport();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickEvent$lambda$9(EcoCourseAudioActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.pauseSport();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initData() {
        String str;
        setCountdownMode(((tj7) getMBinding()).H);
        if (Intrinsics.areEqual(this.model, "yesoul.exbike.jsc01y")) {
            ConstraintLayout heartrateLayout = ((tj7) getMBinding()).M;
            Intrinsics.checkNotNullExpressionValue(heartrateLayout, "heartrateLayout");
            ViewExtKt.gone(heartrateLayout);
            TextView bodyConditionTv = ((tj7) getMBinding()).G;
            Intrinsics.checkNotNullExpressionValue(bodyConditionTv, "bodyConditionTv");
            ViewExtKt.gone(bodyConditionTv);
            LinearLayout bodyConditionLl = ((tj7) getMBinding()).F;
            Intrinsics.checkNotNullExpressionValue(bodyConditionLl, "bodyConditionLl");
            ViewExtKt.gone(bodyConditionLl);
        }
        this.mDurationFormat.setTimeZone(TimeZone.getTimeZone("GMT+00:00"));
        CourseModel.CourseData basicInfo = getInfo().getBasicInfo();
        TextView textView = ((tj7) getMBinding()).E;
        if (basicInfo == null || (str = basicInfo.title) == null) {
            str = "";
        }
        textView.setText(str);
        EcoCourseAudioVM ecoCourseAudioVM = (EcoCourseAudioVM) getMViewModel();
        CourseConfigModel.AudioInfo audioInfo = getInfo().getAudioInfo();
        ecoCourseAudioVM.initAudioSegment(audioInfo != null ? audioInfo.audioSegments : null, this.model);
        configConcernData();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void pauseSport() {
        FitnessLogUtils.d(TAG, "pauseSport");
        ((EcoCourseAudioVM) getMViewModel()).pauseAudio();
        if (CourseExtKt.supportLink(getDeviceLinkage())) {
            ((EcoCourseAudioVM) getMViewModel()).pauseSport(getSportType(), new RequestCallback() { // from class: com.mi.health.course.activity.eco.EcoCourseAudioActivity.pauseSport.1
                @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback
                public void call(int responseCode) {
                    FitnessLogUtils.d(EcoCourseAudioActivity.TAG, "pauseSport resultCode=" + responseCode);
                }
            });
        }
        setButtonStatus(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void resumeSport() {
        FitnessLogUtils.d(TAG, "resumeSport");
        ((EcoCourseAudioVM) getMViewModel()).resumeAudio();
        if (CourseExtKt.supportLink(getDeviceLinkage())) {
            ((EcoCourseAudioVM) getMViewModel()).resumeSport(getSportType(), new RequestCallback() { // from class: com.mi.health.course.activity.eco.EcoCourseAudioActivity.resumeSport.1
                @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback
                public void call(int responseCode) {
                    FitnessLogUtils.d(EcoCourseAudioActivity.TAG, "resumeSport resultCode=" + responseCode);
                }
            });
        }
        setButtonStatus(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setButtonStatus(int state) {
        if (state == 1) {
            ImageView audioPauseIv = ((tj7) getMBinding()).A;
            Intrinsics.checkNotNullExpressionValue(audioPauseIv, "audioPauseIv");
            ViewExtKt.gone(audioPauseIv);
            ImageView audioStopIv = ((tj7) getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(audioStopIv, "audioStopIv");
            ViewExtKt.gone(audioStopIv);
            ImageView audioStartIv = ((tj7) getMBinding()).B;
            Intrinsics.checkNotNullExpressionValue(audioStartIv, "audioStartIv");
            ViewExtKt.visible(audioStartIv);
            return;
        }
        if (state != 2) {
            return;
        }
        ImageView audioPauseIv2 = ((tj7) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(audioPauseIv2, "audioPauseIv");
        ViewExtKt.visible(audioPauseIv2);
        ImageView audioStopIv2 = ((tj7) getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(audioStopIv2, "audioStopIv");
        ViewExtKt.visible(audioStopIv2);
        ImageView audioStartIv2 = ((tj7) getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(audioStartIv2, "audioStartIv");
        ViewExtKt.gone(audioStartIv2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void setConcernData(String key, float value) {
        View view = this.concernedConfig.get(key);
        if (view != null) {
            TextView textView = (TextView) view;
            switch (key.hashCode()) {
                case 113135:
                    if (key.equals("rpm")) {
                        if (Intrinsics.areEqual(this.model, "runmi.exbike.jscrm1") || Intrinsics.areEqual(this.model, "yesoul.exbike.jsc01y")) {
                            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                            String str = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(value)}, 1));
                            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                            textView.setText(buildSpan(str + "\n" + getString(czi.course_cadence), String.valueOf(value).length(), 30));
                        }
                        break;
                    }
                    break;
                case 106858757:
                    if (key.equals("power")) {
                        if (Intrinsics.areEqual(this.model, "runmi.exbike.jscrm1") || Intrinsics.areEqual(this.model, "yesoul.exbike.jsc01y")) {
                            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                            String str2 = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(value)}, 1));
                            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                            textView.setText(buildSpan(str2 + "\n" + getString(czi.course_power), String.valueOf(value).length(), 30));
                        }
                        break;
                    }
                    break;
                case 109641799:
                    if (key.equals("speed")) {
                        StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                        String str3 = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(value)}, 1));
                        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                        textView.setText(buildSpan(str3 + "\n" + getString(czi.course_unit_speed), String.valueOf(value).length(), 30));
                        break;
                    }
                    break;
                case 288459765:
                    if (key.equals("distance")) {
                        String strRoundUpToTwoDecimalPlaces = roundUpToTwoDecimalPlaces(value);
                        textView.setText(buildSpan(strRoundUpToTwoDecimalPlaces + "\n" + textView.getResources().getQuantityString(kyi.f24423b, (int) value), strRoundUpToTwoDecimalPlaces.length(), 30));
                        break;
                    }
                    break;
                case 548738829:
                    if (key.equals("calorie")) {
                        int i = (int) value;
                        textView.setText(buildSpan(i + "\n" + getString(czi.course_calorie_label), String.valueOf(i).length(), 30));
                        break;
                    }
                    break;
                case 1863800889:
                    if (key.equals("resistance")) {
                        if (Intrinsics.areEqual(this.model, "runmi.exbike.jscrm1") || Intrinsics.areEqual(this.model, "yesoul.exbike.jsc01y")) {
                            StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
                            String str4 = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(value)}, 1));
                            Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
                            textView.setText(buildSpan(str4 + "\n" + getString(czi.course_resistance), String.valueOf(value).length(), 30));
                        }
                        break;
                    }
                    break;
            }
        }
    }

    private final void setCountdownMode(LottieAnimationView lottie) {
        if (UIUtils.isNightMode(this)) {
            if (lottie != null) {
                lottie.setBackgroundResource(bli.c);
            }
            if (lottie != null) {
                lottie.setAnimation("lottie/countdown_black.json");
                return;
            }
            return;
        }
        if (lottie != null) {
            lottie.setAnimation("lottie/countdown_white.json");
        }
        if (lottie != null) {
            lottie.setBackgroundResource(bli.m);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setDuration(int duration) {
        if (duration < 0) {
            return;
        }
        ((tj7) getMBinding()).Y.setText(TimeDateUtil.getTimeStrWithSecDef(duration));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setHrLabel(int hr) {
        ((tj7) getMBinding()).N.setText(hr <= 0 ? "--" : String.valueOf(hr));
        HrZoneLevel hrZone = getHrZone().getHrZone(hr);
        ((tj7) getMBinding()).O.setBackgroundColor(getResources().getColor(bli.e));
        ((tj7) getMBinding()).P.setBackgroundColor(getResources().getColor(bli.e));
        ((tj7) getMBinding()).Q.setBackgroundColor(getResources().getColor(bli.e));
        ((tj7) getMBinding()).R.setBackgroundColor(getResources().getColor(bli.e));
        ((tj7) getMBinding()).S.setBackgroundColor(getResources().getColor(bli.e));
        switch (WhenMappings.$EnumSwitchMapping$0[hrZone.ordinal()]) {
            case 1:
            case 2:
                ((tj7) getMBinding()).O.setBackgroundColor(getResources().getColor(bli.common_textcolor_1));
                ((tj7) getMBinding()).G.setText(getResources().getString(czi.course_hr_distribute_warm_up));
                return;
            case 3:
                ((tj7) getMBinding()).P.setBackgroundColor(getResources().getColor(bli.common_textcolor_1));
                ((tj7) getMBinding()).G.setText(getResources().getString(czi.course_hr_distribute_fat_burn));
                return;
            case 4:
                ((tj7) getMBinding()).Q.setBackgroundColor(getResources().getColor(bli.common_textcolor_1));
                ((tj7) getMBinding()).G.setText(getResources().getString(czi.course_hr_distribute_aerobic));
                return;
            case 5:
                ((tj7) getMBinding()).R.setBackgroundColor(getResources().getColor(bli.common_textcolor_1));
                ((tj7) getMBinding()).G.setText(getResources().getString(czi.course_hr_distribute_anaerobic));
                return;
            case 6:
                ((tj7) getMBinding()).S.setBackgroundColor(getResources().getColor(bli.common_textcolor_1));
                ((tj7) getMBinding()).G.setText(getResources().getString(czi.course_hr_distribute_acme));
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setLinkSrc(boolean islink) {
        if (islink) {
            ((tj7) getMBinding()).T.setImageResource(xmi.course_audio_link_open);
        } else {
            ((tj7) getMBinding()).T.setImageResource(xmi.course_audio_link_close);
        }
    }

    private final void showCountDownAnimation() {
        final LottieAnimationView countDownLottieView = getCountDownLottieView();
        if (countDownLottieView != null) {
            countDownLottieView.setVisibility(0);
            countDownLottieView.w();
            countDownLottieView.i(new Animator.AnimatorListener() { // from class: com.mi.health.course.activity.eco.EcoCourseAudioActivity$showCountDownAnimation$1$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animation) {
                    String str;
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    countDownLottieView.setVisibility(8);
                    CourseConfigModel.AudioInfo audioInfo = this.getInfo().getAudioInfo();
                    if (audioInfo == null || (str = audioInfo.audioUrl) == null) {
                        str = "";
                    }
                    FitnessLogUtils.d(EcoCourseAudioActivity.TAG, "onAnimationEnd audioPath==" + str);
                    EcoCourseAudioActivity.access$getMViewModel(this).startAudio(str);
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    this.countDownTime(3, 900L);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void startSport() {
        FitnessLogUtils.i(TAG, "startSport");
        ((EcoCourseAudioVM) getMViewModel()).startSport(new RequestCallback() { // from class: com.mi.health.course.activity.eco.EcoCourseAudioActivity.startSport.1
            @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback
            public void call(int responseCode) {
                FitnessLogUtils.i(EcoCourseAudioActivity.TAG, "startLocalSport result=" + responseCode);
                if (responseCode != 0) {
                    ToastUtil.showShortToast(czi.course_device_busy);
                    EcoCourseAudioActivity.this.quitCourse();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Typeface unitTypeFace_delegate$lambda$1(EcoCourseAudioActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return Typeface.create(this$0.getString(czi.e), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mi.health.course.activity.eco.EcoBaseCourseActivity
    public void finishCourse() {
        ((EcoCourseAudioVM) getMViewModel()).stopAudio();
        boolean zIsDeviceConnect = ((EcoCourseAudioVM) getMViewModel()).isDeviceConnect();
        FitnessLogUtils.d(TAG, "finishCourse: startTime = " + getStartTime() + "; deviceConnect = " + zIsDeviceConnect);
        if (getStartTime() <= 0 || !zIsDeviceConnect) {
            quitCourse();
        } else {
            ((tj7) getMBinding()).G.postDelayed(getFinishTimeout(), 10000L);
            ((EcoCourseAudioVM) getMViewModel()).finishSport(getSportType(), new RequestCallback() { // from class: com.mi.health.course.activity.eco.EcoCourseAudioActivity.finishCourse.1
                @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback
                public void call(int responseCode) {
                    FitnessLogUtils.d(EcoCourseAudioActivity.TAG, "finishCourse resultCode=" + responseCode);
                }
            });
        }
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return sti.c;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return ew1.f17121a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mi.health.course.activity.eco.EcoBaseCourseActivity
    public boolean isSendCmd() {
        return Intrinsics.areEqual(((EcoCourseAudioVM) getMViewModel()).getLineChartType(), LineChartType.DISTANCE.getItem());
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
        if (this.isPause) {
            return;
        }
        pauseSport();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mi.health.course.activity.eco.Hilt_EcoCourseAudioActivity, com.mi.health.course.activity.eco.EcoBaseCourseActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getIntent().hasExtra("course_device_model")) {
            this.model = getIntent().getStringExtra("course_device_model");
        }
        addObserver();
        initClickEvent();
        initData();
        startSport();
        showCountDownAnimation();
        if (CourseExtKt.supportLink(getDeviceLinkage())) {
            setLinkSrc(getCmdEnable());
        } else {
            ((EcoCourseAudioVM) getMViewModel()).setCmdEnable(false);
            ((tj7) getMBinding()).T.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mi.health.course.activity.eco.Hilt_EcoCourseAudioActivity, com.mi.health.course.activity.eco.EcoBaseCourseActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LottieAnimationView countDownLottieView = getCountDownLottieView();
        if (countDownLottieView != null) {
            countDownLottieView.x();
        }
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        ((tj7) getMBinding()).G.removeCallbacks(getFinishTimeout());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mi.health.course.activity.eco.EcoBaseCourseActivity
    public void onSportStateChange(@NotNull CourseSportState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof CourseSportState.Finish) {
            FitnessLogUtils.d(TAG, "onSportFinished validSport==" + state);
            ((tj7) getMBinding()).G.removeCallbacks(getFinishTimeout());
            ((EcoCourseAudioVM) getMViewModel()).stopAudio();
            if (((CourseSportState.Finish) state).getValidSport()) {
                showLoading(czi.d, false);
                return;
            } else {
                quitCourse();
                return;
            }
        }
        if (Intrinsics.areEqual(state, CourseSportState.Restart.INSTANCE)) {
            FitnessLogUtils.d(TAG, "onSportRestarted");
            this.isPause = false;
            setButtonStatus(1);
            ((EcoCourseAudioVM) getMViewModel()).resumeAudio();
            dismissAllDialog();
            return;
        }
        if (Intrinsics.areEqual(state, CourseSportState.Pause.INSTANCE)) {
            FitnessLogUtils.d(TAG, "onSportPaused");
            this.isPause = true;
            setButtonStatus(2);
            ((EcoCourseAudioVM) getMViewModel()).pauseAudio();
            return;
        }
        if (!(state instanceof CourseSportState.Start)) {
            FitnessLogUtils.d(TAG, "onSportStateChange other");
            return;
        }
        FitnessLogUtils.d(TAG, "onSportStarted");
        setButtonStatus(1);
        dismissAllDialog();
    }

    @NotNull
    public final String roundUpToTwoDecimalPlaces(double number) {
        double d = 100;
        double dCeil = Math.ceil(number * d) / d;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dCeil)}, 1)), "format(...)");
        decimalFormat.format(dCeil);
        String str = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dCeil)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
