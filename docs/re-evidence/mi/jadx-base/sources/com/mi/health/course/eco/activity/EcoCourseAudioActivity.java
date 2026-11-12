package com.mi.health.course.eco.activity;

import android.animation.Animator;
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
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import com.airbnb.lottie.LottieAnimationView;
import com.mi.health.course.LineChartType;
import com.mi.health.course.data.CourseSportState;
import com.mi.health.course.eco.activity.EcoCourseAudioActivity;
import com.mi.health.course.eco.vm.EcoCourseAudioVM;
import com.mi.health.course.export.data.CourseConfigModel;
import com.mi.health.course.export.data.CourseModel;
import com.mi.health.course.ext.CourseExtKt;
import com.mi.health.course.util.LogUtil;
import com.mi.health.course.util.TextTypefaceSpan;
import com.miui.tsmclient.util.StringUtils;
import com.xiaomi.fitness.account.HrZoneLevel;
import com.xiaomi.fitness.baseui.dialog.DriftDialog;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
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
import defpackage.rj7;
import defpackage.rvn;
import defpackage.sti;
import defpackage.xmi;
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
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\bj\u0010\nJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\nJ\u001f\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0004H\u0002¢\u0006\u0004\b&\u0010\bJ\u000f\u0010'\u001a\u00020\u0006H\u0002¢\u0006\u0004\b'\u0010\nJ\u000f\u0010(\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010\nJ\u000f\u0010)\u001a\u00020\u0006H\u0002¢\u0006\u0004\b)\u0010\nJ\u000f\u0010*\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010\nJ\u001f\u0010.\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/J\u0019\u00102\u001a\u00020\u00062\b\u00101\u001a\u0004\u0018\u000100H\u0014¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\rH\u0016¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0006H\u0016¢\u0006\u0004\b9\u0010\nJ\u000f\u0010:\u001a\u00020\u0006H\u0016¢\u0006\u0004\b:\u0010\nJ\u000f\u0010;\u001a\u00020\u0006H\u0014¢\u0006\u0004\b;\u0010\nR\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R#\u0010G\u001a\n B*\u0004\u0018\u00010A0A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0018\u0010I\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010K\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010N\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010Q\u001a\u0004\u0018\u00010P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR#\u0010V\u001a\n B*\u0004\u0018\u00010P0P8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010D\u001a\u0004\bT\u0010UR\u001b\u0010Z\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010D\u001a\u0004\bX\u0010YR\u001b\u0010]\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b[\u0010D\u001a\u0004\b\\\u0010YR \u0010_\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001a0^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u001b\u0010e\u001a\u00020a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010D\u001a\u0004\bc\u0010dR\u0014\u0010g\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010YR\u0014\u0010i\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u0010Y¨\u0006k"}, d2 = {"Lcom/mi/health/course/eco/activity/EcoCourseAudioActivity;", "Lcom/mi/health/course/eco/activity/EcoBaseCourseActivity;", "Lcom/mi/health/course/eco/vm/EcoCourseAudioVM;", "Lrj7;", "", "duration", "", "setDuration", "(I)V", "addObserver", "()V", "initData", "initClickEvent", "", "islink", "setLinkSrc", "(Z)V", "state", "setButtonStatus", "configConcernData", "", "key", "", "value", "setConcernData", "(Ljava/lang/String;F)V", "Landroid/view/View;", "view", "recommend", "setJumpRopRecommendCount", "(Landroid/view/View;I)V", "fullStr", "valueLength", "txtSize", "Landroid/text/SpannableStringBuilder;", "buildSpan", "(Ljava/lang/String;II)Landroid/text/SpannableStringBuilder;", "hr", "setHrLabel", "startSport", "pauseSport", "resumeSport", "showCountDownAnimation", "num", "", "milliseconds", "countDownTime", "(IJ)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "isSendCmd", "()Z", "Lcom/mi/health/course/data/CourseSportState;", "onSportStateChange", "(Lcom/mi/health/course/data/CourseSportState;)V", "finishCourse", "onBackPressed", LifecycleConstantKt.ON_DESTROY, "Ljava/text/SimpleDateFormat;", "mDurationFormat", "Ljava/text/SimpleDateFormat;", "isPause", "Z", "Lcom/airbnb/lottie/LottieAnimationView;", "kotlin.jvm.PlatformType", "countDownLottieView$delegate", "Lkotlin/Lazy;", "getCountDownLottieView", "()Lcom/airbnb/lottie/LottieAnimationView;", "countDownLottieView", "Landroid/os/CountDownTimer;", "timer", "Landroid/os/CountDownTimer;", "count", "I", "Lcom/xiaomi/fitness/baseui/dialog/DriftDialog;", "errorDialog", "Lcom/xiaomi/fitness/baseui/dialog/DriftDialog;", "Landroid/graphics/Typeface;", "typeFace", "Landroid/graphics/Typeface;", "unitTypeFace$delegate", "getUnitTypeFace", "()Landroid/graphics/Typeface;", "unitTypeFace", "textColor$delegate", "getTextColor", "()I", "textColor", "unitTextColor$delegate", "getUnitTextColor", "unitTextColor", "", "concernedConfig", "Ljava/util/Map;", "Ljava/lang/Runnable;", "finishTimeout$delegate", "getFinishTimeout", "()Ljava/lang/Runnable;", "finishTimeout", "getLayoutId", "layoutId", "getViewModelId", "viewModelId", "<init>", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nEcoCourseAudioActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcoCourseAudioActivity.kt\ncom/mi/health/course/eco/activity/EcoCourseAudioActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,684:1\n1863#2,2:685\n*S KotlinDebug\n*F\n+ 1 EcoCourseAudioActivity.kt\ncom/mi/health/course/eco/activity/EcoCourseAudioActivity\n*L\n352#1:685,2\n*E\n"})
public final class EcoCourseAudioActivity extends Hilt_EcoCourseAudioActivity<EcoCourseAudioVM, rj7> {
    private int count;

    @Nullable
    private DriftDialog errorDialog;
    private boolean isPause;

    @Nullable
    private CountDownTimer timer;

    @NotNull
    private final SimpleDateFormat mDurationFormat = new SimpleDateFormat(StringUtils.EXPECT_TIME_FORMAT);

    /* JADX INFO: renamed from: countDownLottieView$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy countDownLottieView = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: dk7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoCourseAudioActivity.countDownLottieView_delegate$lambda$0(this.f15607a);
        }
    });

    @Nullable
    private final Typeface typeFace = DisplayUtil.getTypefaceAsResourceId(AppUtil.getApp(), ipi.f21978a);

    /* JADX INFO: renamed from: unitTypeFace$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy unitTypeFace = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: fk7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoCourseAudioActivity.unitTypeFace_delegate$lambda$1(this.f17866a);
        }
    });

    /* JADX INFO: renamed from: textColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy textColor = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: hk7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(EcoCourseAudioActivity.textColor_delegate$lambda$2(this.f20158a));
        }
    });

    /* JADX INFO: renamed from: unitTextColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy unitTextColor = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ik7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(EcoCourseAudioActivity.unitTextColor_delegate$lambda$3(this.f21248a));
        }
    });

    @NotNull
    private final Map<String, View> concernedConfig = new LinkedHashMap();

    /* JADX INFO: renamed from: finishTimeout$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy finishTimeout = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: jk7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoCourseAudioActivity.finishTimeout_delegate$lambda$19(this.f22885a);
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
        ((EcoCourseAudioVM) getMViewModel()).setOnDataChange(new Function1() { // from class: bk7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoCourseAudioActivity.addObserver$lambda$5(this.f4306a, (PhoneSportData) obj);
            }
        });
        ((EcoCourseAudioVM) getMViewModel()).getLineChartDataEmitter().observe(this, new Observer() { // from class: lk7
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                EcoCourseAudioActivity.addObserver$lambda$6(this.f25163a, (LinechartViewProperty) obj);
            }
        });
        ((EcoCourseAudioVM) getMViewModel()).setOnPlayError(new Function1() { // from class: nk7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoCourseAudioActivity.addObserver$lambda$7(this.f28004a, ((Boolean) obj).booleanValue());
            }
        });
        ((EcoCourseAudioVM) getMViewModel()).setOnPlaybackStateChanged(new Function1() { // from class: pk7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoCourseAudioActivity.addObserver$lambda$8(this.f30484a, ((Integer) obj).intValue());
            }
        });
        ((EcoCourseAudioVM) getMViewModel()).getTitleEmitter().observe(this, new Observer() { // from class: rk7
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                EcoCourseAudioActivity.addObserver$lambda$9(this.f32628a, (String) obj);
            }
        });
        ((EcoCourseAudioVM) getMViewModel()).setOnPropertyChange(new Function1() { // from class: tk7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoCourseAudioActivity.addObserver$lambda$10(this.f34783a, ((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addObserver$lambda$10(EcoCourseAudioActivity this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AnyExtKt.main$default(null, new EcoCourseAudioActivity$addObserver$6$1(this$0, i, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit addObserver$lambda$5(EcoCourseAudioActivity this$0, PhoneSportData it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (((EcoCourseAudioVM) this$0.getMViewModel()).isRopeSkipping()) {
            int i = it.jumpDuration;
            this$0.setDuration(i);
            this$0.setConcernData("frequency_hopping", it.jumpFrequency);
            this$0.setConcernData(CourseConfigModel.DeviceLinkage.DATA_JUMP_ROP_COUNT, it.jumpCount);
            this$0.setConcernData("calorie", it.calorie / 1000);
            if (Intrinsics.areEqual(((EcoCourseAudioVM) this$0.getMViewModel()).getLineChartType(), LineChartType.TIME.getItem())) {
                ((rj7) this$0.getMBinding()).M.updateData(new LinechartDataEntity(i / 60, it.jumpFrequency));
            }
            ((EcoCourseAudioVM) this$0.getMViewModel()).showJumpData();
        } else {
            this$0.setDistance(it.distance);
            this$0.setHrLabel(it.heart_rate);
            this$0.checkHr(it.heart_rate);
            this$0.setDuration((int) it.deviceDuration);
            float f = it.speed;
            float f2 = 1000;
            this$0.setConcernData("distance", it.distance / f2);
            this$0.setConcernData("calorie", it.calorie / f2);
            this$0.setConcernData("speed", f);
            if (Intrinsics.areEqual(((EcoCourseAudioVM) this$0.getMViewModel()).getModel(), "runmi.exbike.jscrm1") || Intrinsics.areEqual(((EcoCourseAudioVM) this$0.getMViewModel()).getModel(), "yesoul.exbike.jsc01y")) {
                this$0.setConcernData("resistance", it.bike_resistance_level);
                this$0.setConcernData("rpm", it.bike_rpm);
                this$0.setConcernData("power", it.bike_power);
            }
            if (Intrinsics.areEqual(((EcoCourseAudioVM) this$0.getMViewModel()).getLineChartType(), LineChartType.TIME.getItem())) {
                ((rj7) this$0.getMBinding()).T.updateData(new LinechartDataEntity(it.deviceDuration / 60, f));
            } else {
                ((rj7) this$0.getMBinding()).T.updateData(new LinechartDataEntity(it.distance, f));
            }
            ((EcoCourseAudioVM) this$0.getMViewModel()).sendCmd(it.distance);
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
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void addObserver$lambda$6(EcoCourseAudioActivity this$0, LinechartViewProperty linechartViewProperty) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (((EcoCourseAudioVM) this$0.getMViewModel()).isRopeSkipping()) {
            ((rj7) this$0.getMBinding()).M.initRecommendData(linechartViewProperty.getRecommendList());
            String type = linechartViewProperty.getType();
            LineChartType lineChartType = LineChartType.TIME;
            if (Intrinsics.areEqual(type, lineChartType.getItem())) {
                ((rj7) this$0.getMBinding()).M.setXType(lineChartType, linechartViewProperty.getMaxValueX());
                return;
            }
            return;
        }
        ((rj7) this$0.getMBinding()).T.initRecommendData(linechartViewProperty.getRecommendList());
        String type2 = linechartViewProperty.getType();
        LineChartType lineChartType2 = LineChartType.TIME;
        if (Intrinsics.areEqual(type2, lineChartType2.getItem())) {
            ((rj7) this$0.getMBinding()).T.setXType(lineChartType2, linechartViewProperty.getMaxValueX());
        } else {
            ((rj7) this$0.getMBinding()).T.setXType(LineChartType.DISTANCE, linechartViewProperty.getMaxValueX());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addObserver$lambda$7(EcoCourseAudioActivity this$0, boolean z) {
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
    public static final Unit addObserver$lambda$8(EcoCourseAudioActivity this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i == 4) {
            this$0.finishCourse();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void addObserver$lambda$9(EcoCourseAudioActivity this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((rj7) this$0.getMBinding()).D.setText(str);
    }

    private final SpannableStringBuilder buildSpan(String fullStr, int valueLength, int txtSize) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fullStr);
        if (this.typeFace == null || getUnitTypeFace() == null) {
            return spannableStringBuilder;
        }
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(txtSize, true), 0, valueLength, 17);
        spannableStringBuilder.setSpan(new TextTypefaceSpan(this.typeFace), 0, valueLength, 17);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(getTextColor()), 0, valueLength, 17);
        Typeface unitTypeFace = getUnitTypeFace();
        Intrinsics.checkNotNullExpressionValue(unitTypeFace, "<get-unitTypeFace>(...)");
        spannableStringBuilder.setSpan(new TextTypefaceSpan(unitTypeFace), valueLength, fullStr.length(), 17);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(13, true), valueLength, fullStr.length(), 17);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(getUnitTextColor()), valueLength, fullStr.length(), 17);
        return spannableStringBuilder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private final void configConcernData() {
        View viewInflate;
        ((rj7) getMBinding()).K.removeAllViews();
        CourseConfigModel.DeviceLinkage deviceLinkage = getDeviceLinkage();
        if (deviceLinkage != null) {
            List<String> concernDataSet = deviceLinkage.concernDataSet;
            Intrinsics.checkNotNullExpressionValue(concernDataSet, "concernDataSet");
            for (IndexedValue indexedValue : CollectionsKt___CollectionsKt.withIndex(concernDataSet)) {
                LogUtil.INSTANCE.i(BaseBindingActivity.TAG, "setConcernData: " + indexedValue);
                if (!Intrinsics.areEqual(indexedValue.getValue(), "hrm")) {
                    if (Intrinsics.areEqual(indexedValue.getValue(), "frequency_hopping")) {
                        viewInflate = LayoutInflater.from(this).inflate(sti.course_layout_audio_data, (ViewGroup) ((rj7) getMBinding()).K, false);
                        TextView textView = (TextView) viewInflate.findViewById(oqi.b1);
                        textView.setVisibility(0);
                        textView.setText(getResources().getString(czi.course_suggestions) + "：--");
                    } else {
                        viewInflate = LayoutInflater.from(this).inflate(sti.course_layout_audio_data, (ViewGroup) ((rj7) getMBinding()).K, false);
                        ((TextView) viewInflate.findViewById(oqi.b1)).setVisibility(4);
                    }
                    int childCount = ((rj7) getMBinding()).K.getChildCount();
                    if (childCount <= 3) {
                        if (childCount > 0) {
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(((rj7) getMBinding()).K.getLayoutParams());
                            layoutParams.setMargins(ez5.a(27), ez5.a(2), 0, 0);
                            viewInflate.setLayoutParams(layoutParams);
                            if (childCount == 1) {
                                ((TextView) viewInflate.findViewById(oqi.P)).setGravity(17);
                            }
                        }
                        ((rj7) getMBinding()).K.addView(viewInflate);
                        this.concernedConfig.put((String) indexedValue.getValue(), viewInflate);
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
        CountDownTimer countDownTimer = new CountDownTimer(milliseconds, ((long) num) * milliseconds) { // from class: com.mi.health.course.eco.activity.EcoCourseAudioActivity.countDownTime.1
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
    public static final Runnable finishTimeout_delegate$lambda$19(final EcoCourseAudioActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new Runnable() { // from class: kk7
            @Override // java.lang.Runnable
            public final void run() {
                EcoCourseAudioActivity.finishTimeout_delegate$lambda$19$lambda$18(this.f23941a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void finishTimeout_delegate$lambda$19$lambda$18(EcoCourseAudioActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LogUtil.INSTANCE.i(BaseBindingActivity.TAG, "finish AudioCourse timeout");
        this$0.finish();
    }

    private final LottieAnimationView getCountDownLottieView() {
        return (LottieAnimationView) this.countDownLottieView.getValue();
    }

    private final Runnable getFinishTimeout() {
        return (Runnable) this.finishTimeout.getValue();
    }

    private final int getTextColor() {
        return ((Number) this.textColor.getValue()).intValue();
    }

    private final int getUnitTextColor() {
        return ((Number) this.unitTextColor.getValue()).intValue();
    }

    private final Typeface getUnitTypeFace() {
        return (Typeface) this.unitTypeFace.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initClickEvent() {
        ((rj7) getMBinding()).C.setOnClickListener(new View.OnClickListener() { // from class: vk7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EcoCourseAudioActivity.initClickEvent$lambda$11(this.f36973a, view);
            }
        });
        ((rj7) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: xk7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EcoCourseAudioActivity.initClickEvent$lambda$12(this.f39213a, view);
            }
        });
        ((rj7) getMBinding()).B.setOnClickListener(new View.OnClickListener() { // from class: zk7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EcoCourseAudioActivity.initClickEvent$lambda$13(this.f41397a, view);
            }
        });
        ((rj7) getMBinding()).S.setOnClickListener(new View.OnClickListener() { // from class: bl7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EcoCourseAudioActivity.initClickEvent$lambda$14(this.f4332a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initClickEvent$lambda$11(EcoCourseAudioActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (((EcoCourseAudioVM) this$0.getMViewModel()).isSportValid()) {
            this$0.showStopDialog();
        } else {
            this$0.showTimeTooShortDialog();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickEvent$lambda$12(EcoCourseAudioActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.resumeSport();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickEvent$lambda$13(EcoCourseAudioActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.pauseSport();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initClickEvent$lambda$14(EcoCourseAudioActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setCmdEnable(!this$0.getCmdEnable());
        this$0.setLinkSrc(this$0.getCmdEnable());
        ((EcoCourseAudioVM) this$0.getMViewModel()).setCmdEnable(this$0.getCmdEnable());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initData() {
        String str;
        this.mDurationFormat.setTimeZone(TimeZone.getTimeZone("GMT+00:00"));
        CourseModel.CourseData basicInfo = getInfo().getBasicInfo();
        TextView textView = ((rj7) getMBinding()).E;
        if (basicInfo == null || (str = basicInfo.title) == null) {
            str = "";
        }
        textView.setText(str);
        EcoCourseAudioVM ecoCourseAudioVM = (EcoCourseAudioVM) getMViewModel();
        CourseConfigModel.AudioInfo audioInfo = getInfo().getAudioInfo();
        ecoCourseAudioVM.initAudioSegment(audioInfo != null ? audioInfo.audioSegments : null);
        configConcernData();
        if (!((EcoCourseAudioVM) getMViewModel()).isRopeSkipping()) {
            ((rj7) getMBinding()).M.setVisibility(8);
            ((rj7) getMBinding()).T.setVisibility(0);
            return;
        }
        ((rj7) getMBinding()).L.setVisibility(8);
        ((rj7) getMBinding()).H.setVisibility(8);
        ((rj7) getMBinding()).G.setVisibility(8);
        ((rj7) getMBinding()).F.setVisibility(8);
        ((rj7) getMBinding()).M.setVisibility(0);
        ((rj7) getMBinding()).T.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void pauseSport() {
        LogUtil.INSTANCE.i(BaseBindingActivity.TAG, "pauseSport");
        ((EcoCourseAudioVM) getMViewModel()).pauseAudio();
        if (CourseExtKt.supportLink(getDeviceLinkage())) {
            ((EcoCourseAudioVM) getMViewModel()).pauseSport(getSportType(), new RequestCallback() { // from class: com.mi.health.course.eco.activity.EcoCourseAudioActivity.pauseSport.1
                @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback
                public void call(int responseCode) {
                    LogUtil.INSTANCE.i(BaseBindingActivity.TAG, "pauseSport resultCode=" + responseCode);
                }
            });
        }
        setButtonStatus(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void resumeSport() {
        LogUtil.INSTANCE.i(BaseBindingActivity.TAG, "resumeSport");
        ((EcoCourseAudioVM) getMViewModel()).resumeAudio();
        if (CourseExtKt.supportLink(getDeviceLinkage())) {
            ((EcoCourseAudioVM) getMViewModel()).resumeSport(getSportType(), new RequestCallback() { // from class: com.mi.health.course.eco.activity.EcoCourseAudioActivity.resumeSport.1
                @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback
                public void call(int responseCode) {
                    LogUtil.INSTANCE.i(BaseBindingActivity.TAG, "resumeSport resultCode=" + responseCode);
                }
            });
        }
        setButtonStatus(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setButtonStatus(int state) {
        if (state == 1) {
            ImageView audioPauseIv = ((rj7) getMBinding()).A;
            Intrinsics.checkNotNullExpressionValue(audioPauseIv, "audioPauseIv");
            ViewExtKt.gone(audioPauseIv);
            ImageView audioStopIv = ((rj7) getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(audioStopIv, "audioStopIv");
            ViewExtKt.gone(audioStopIv);
            ImageView audioStartIv = ((rj7) getMBinding()).B;
            Intrinsics.checkNotNullExpressionValue(audioStartIv, "audioStartIv");
            ViewExtKt.visible(audioStartIv);
            return;
        }
        if (state != 2) {
            return;
        }
        ImageView audioPauseIv2 = ((rj7) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(audioPauseIv2, "audioPauseIv");
        ViewExtKt.visible(audioPauseIv2);
        ImageView audioStopIv2 = ((rj7) getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(audioStopIv2, "audioStopIv");
        ViewExtKt.visible(audioStopIv2);
        ImageView audioStartIv2 = ((rj7) getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(audioStartIv2, "audioStartIv");
        ViewExtKt.gone(audioStartIv2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    private final void setConcernData(String key, float value) {
        View view = this.concernedConfig.get(key);
        if (view == null || !(view instanceof LinearLayout)) {
            return;
        }
        switch (key.hashCode()) {
            case 113135:
                if (key.equals("rpm")) {
                    if (Intrinsics.areEqual(((EcoCourseAudioVM) getMViewModel()).getModel(), "runmi.exbike.jscrm1") || Intrinsics.areEqual(((EcoCourseAudioVM) getMViewModel()).getModel(), "yesoul.exbike.jsc01y")) {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String str = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(value)}, 1));
                        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                        ((TextView) view.findViewById(oqi.P)).setText(buildSpan(str + "\n" + getString(czi.course_cadence), String.valueOf(value).length(), 30));
                    }
                    break;
                }
                break;
            case 106858757:
                if (key.equals("power")) {
                    if (Intrinsics.areEqual(((EcoCourseAudioVM) getMViewModel()).getModel(), "runmi.exbike.jscrm1") || Intrinsics.areEqual(((EcoCourseAudioVM) getMViewModel()).getModel(), "yesoul.exbike.jsc01y")) {
                        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                        String str2 = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(value)}, 1));
                        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                        ((TextView) view.findViewById(oqi.P)).setText(buildSpan(str2 + "\n" + getString(czi.course_power), String.valueOf(value).length(), 30));
                    }
                    break;
                }
                break;
            case 109641799:
                if (key.equals("speed")) {
                    StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                    String str3 = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(value)}, 1));
                    Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                    ((TextView) view.findViewById(oqi.P)).setText(buildSpan(str3 + "\n" + getString(czi.course_unit_speed), String.valueOf(value).length(), 30));
                    break;
                }
                break;
            case 288459765:
                if (key.equals("distance")) {
                    ((TextView) view.findViewById(oqi.P)).setText(buildSpan(value + "\n" + ((LinearLayout) view).getResources().getQuantityString(kyi.f24423b, (int) value), String.valueOf(value).length(), 30));
                    break;
                }
                break;
            case 485939544:
                if (key.equals("frequency_hopping")) {
                    int i = (int) value;
                    ((TextView) view.findViewById(oqi.P)).setText(buildSpan(i + "\n" + getString(czi.course_unit_frequency), String.valueOf(i).length(), 30));
                    break;
                }
                break;
            case 548738829:
                if (key.equals("calorie")) {
                    int i2 = (int) value;
                    ((TextView) view.findViewById(oqi.P)).setText(buildSpan(i2 + "\n" + getString(czi.course_calorie_label), String.valueOf(i2).length(), 30));
                    break;
                }
                break;
            case 1863800889:
                if (key.equals("resistance")) {
                    if (Intrinsics.areEqual(((EcoCourseAudioVM) getMViewModel()).getModel(), "runmi.exbike.jscrm1") || Intrinsics.areEqual(((EcoCourseAudioVM) getMViewModel()).getModel(), "yesoul.exbike.jsc01y")) {
                        StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
                        String str4 = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(value)}, 1));
                        Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
                        ((TextView) view.findViewById(oqi.P)).setText(buildSpan(str4 + "\n" + getString(czi.course_resistance), String.valueOf(value).length(), 30));
                    }
                    break;
                }
                break;
            case 2000916690:
                if (key.equals(CourseConfigModel.DeviceLinkage.DATA_JUMP_ROP_COUNT)) {
                    int i3 = (int) value;
                    ((TextView) view.findViewById(oqi.P)).setText(buildSpan(i3 + "\n" + getString(czi.course_unit_number), String.valueOf(i3).length(), 30));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setDuration(int duration) {
        if (duration < 0) {
            return;
        }
        ((rj7) getMBinding()).X.setText(TimeDateUtil.getTimeStrWithSecDef(duration));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setHrLabel(int hr) {
        ((rj7) getMBinding()).L.setText(hr <= 0 ? "--" : String.valueOf(hr));
        HrZoneLevel hrZone = getHrZone().getHrZone(hr);
        ((rj7) getMBinding()).N.setBackgroundColor(getResources().getColor(bli.e));
        ((rj7) getMBinding()).O.setBackgroundColor(getResources().getColor(bli.e));
        ((rj7) getMBinding()).P.setBackgroundColor(getResources().getColor(bli.e));
        ((rj7) getMBinding()).Q.setBackgroundColor(getResources().getColor(bli.e));
        ((rj7) getMBinding()).R.setBackgroundColor(getResources().getColor(bli.e));
        switch (WhenMappings.$EnumSwitchMapping$0[hrZone.ordinal()]) {
            case 1:
            case 2:
                ((rj7) getMBinding()).N.setBackgroundColor(getResources().getColor(bli.common_textcolor_1));
                ((rj7) getMBinding()).G.setText(getResources().getString(czi.course_hr_distribute_warm_up));
                return;
            case 3:
                ((rj7) getMBinding()).O.setBackgroundColor(getResources().getColor(bli.common_textcolor_1));
                ((rj7) getMBinding()).G.setText(getResources().getString(czi.course_hr_distribute_fat_burn));
                return;
            case 4:
                ((rj7) getMBinding()).P.setBackgroundColor(getResources().getColor(bli.common_textcolor_1));
                ((rj7) getMBinding()).G.setText(getResources().getString(czi.course_hr_distribute_aerobic));
                return;
            case 5:
                ((rj7) getMBinding()).Q.setBackgroundColor(getResources().getColor(bli.common_textcolor_1));
                ((rj7) getMBinding()).G.setText(getResources().getString(czi.course_hr_distribute_anaerobic));
                return;
            case 6:
                ((rj7) getMBinding()).R.setBackgroundColor(getResources().getColor(bli.common_textcolor_1));
                ((rj7) getMBinding()).G.setText(getResources().getString(czi.course_hr_distribute_acme));
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setJumpRopRecommendCount(View view, int recommend) {
        String str;
        if (recommend == 0) {
            str = getResources().getString(czi.course_suggestions) + "：--";
        } else {
            str = getResources().getString(czi.course_suggestions) + "：" + recommend;
        }
        ((TextView) view.findViewById(oqi.b1)).setText(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setLinkSrc(boolean islink) {
        if (islink) {
            ((rj7) getMBinding()).S.setImageResource(xmi.course_audio_link_open);
        } else {
            ((rj7) getMBinding()).S.setImageResource(xmi.course_audio_link_close);
        }
    }

    private final void showCountDownAnimation() {
        final LottieAnimationView countDownLottieView = getCountDownLottieView();
        if (countDownLottieView != null) {
            countDownLottieView.setVisibility(0);
            countDownLottieView.w();
            countDownLottieView.i(new Animator.AnimatorListener() { // from class: com.mi.health.course.eco.activity.EcoCourseAudioActivity$showCountDownAnimation$1$1
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
                    LogUtil.INSTANCE.i(BaseBindingActivity.TAG, "onAnimationEnd audioPath==" + str);
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
        LogUtil.INSTANCE.i(BaseBindingActivity.TAG, "startSport");
        ((EcoCourseAudioVM) getMViewModel()).startLocalSport(new RequestCallback() { // from class: com.mi.health.course.eco.activity.EcoCourseAudioActivity.startSport.1
            @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback
            public void call(int responseCode) {
                LogUtil.INSTANCE.i(BaseBindingActivity.TAG, "startLocalSport result=" + responseCode);
                if (responseCode != 0) {
                    ToastUtil.showShortToast(czi.course_device_busy);
                    EcoCourseAudioActivity.this.finish();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int textColor_delegate$lambda$2(EcoCourseAudioActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getColor(bli.j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int unitTextColor_delegate$lambda$3(EcoCourseAudioActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getColor(bli.course_color_black_8c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Typeface unitTypeFace_delegate$lambda$1(EcoCourseAudioActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return Typeface.create(this$0.getString(czi.e), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mi.health.course.eco.activity.EcoBaseCourseActivity
    public void finishCourse() {
        ((EcoCourseAudioVM) getMViewModel()).stopAudio();
        boolean zIsDeviceConnect = ((EcoCourseAudioVM) getMViewModel()).isDeviceConnect();
        LogUtil.INSTANCE.i(BaseBindingActivity.TAG, "finishCourse: startTime = " + getStartTime() + "; deviceConnect = " + zIsDeviceConnect);
        if (getStartTime() <= 0 || !zIsDeviceConnect) {
            finish();
        } else {
            ((rj7) getMBinding()).G.postDelayed(getFinishTimeout(), 10000L);
            ((EcoCourseAudioVM) getMViewModel()).finishSport(getSportType(), new RequestCallback() { // from class: com.mi.health.course.eco.activity.EcoCourseAudioActivity.finishCourse.1
                @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback
                public void call(int responseCode) {
                    LogUtil.INSTANCE.i(BaseBindingActivity.TAG, "finishCourse resultCode=" + responseCode);
                }
            });
        }
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return sti.f33975b;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return ew1.f17121a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mi.health.course.eco.activity.EcoBaseCourseActivity
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
    @Override // com.mi.health.course.eco.activity.Hilt_EcoCourseAudioActivity, com.mi.health.course.eco.activity.EcoBaseCourseActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addObserver();
        initClickEvent();
        initData();
        startSport();
        showCountDownAnimation();
        if (!CourseExtKt.supportLink(getDeviceLinkage())) {
            ((EcoCourseAudioVM) getMViewModel()).setCmdEnable(false);
            ((rj7) getMBinding()).S.setVisibility(8);
        } else {
            setLinkSrc(getCmdEnable());
            if (((EcoCourseAudioVM) getMViewModel()).isRopeSkipping()) {
                ((rj7) getMBinding()).S.setVisibility(8);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mi.health.course.eco.activity.Hilt_EcoCourseAudioActivity, com.mi.health.course.eco.activity.EcoBaseCourseActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getCountDownLottieView().x();
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        ((rj7) getMBinding()).G.removeCallbacks(getFinishTimeout());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mi.health.course.eco.activity.EcoBaseCourseActivity
    public void onSportStateChange(@NotNull CourseSportState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof CourseSportState.Finish) {
            LogUtil.INSTANCE.i(BaseBindingActivity.TAG, "onSportFinished validSport==" + state);
            ((rj7) getMBinding()).G.removeCallbacks(getFinishTimeout());
            rvn.Y(this).X0();
            ((EcoCourseAudioVM) getMViewModel()).stopAudio();
            if (((CourseSportState.Finish) state).getValidSport()) {
                showLoading(czi.d, false);
                return;
            } else {
                finish();
                return;
            }
        }
        if (Intrinsics.areEqual(state, CourseSportState.Restart.INSTANCE)) {
            LogUtil.INSTANCE.i(BaseBindingActivity.TAG, "onSportRestarted");
            this.isPause = false;
            rvn.Y(this).K();
            setButtonStatus(1);
            ((EcoCourseAudioVM) getMViewModel()).resumeAudio();
            dismissAllDialog();
            return;
        }
        if (Intrinsics.areEqual(state, CourseSportState.Pause.INSTANCE)) {
            LogUtil.INSTANCE.i(BaseBindingActivity.TAG, "onSportPaused");
            this.isPause = true;
            rvn.Y(this).I();
            setButtonStatus(2);
            ((EcoCourseAudioVM) getMViewModel()).pauseAudio();
            return;
        }
        if (!(state instanceof CourseSportState.Start)) {
            LogUtil.INSTANCE.i(BaseBindingActivity.TAG, "onSportStateChange other");
            return;
        }
        LogUtil.INSTANCE.i(BaseBindingActivity.TAG, "onSportStarted");
        setButtonStatus(1);
        dismissAllDialog();
    }
}
