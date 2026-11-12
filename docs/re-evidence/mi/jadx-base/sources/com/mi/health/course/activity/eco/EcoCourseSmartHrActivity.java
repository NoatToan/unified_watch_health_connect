package com.mi.health.course.activity.eco;

import android.animation.Animator;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
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
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import com.airbnb.lottie.LottieAnimationView;
import com.mi.health.course.activity.eco.EcoCourseSmartHrActivity;
import com.mi.health.course.data.CourseSportState;
import com.mi.health.course.export.data.CourseConfigModel;
import com.mi.health.course.export.data.CourseModel;
import com.mi.health.course.export.data.HrCourseConfigModel;
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
import com.xiaomi.fitness.sport_eco_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback;
import com.xiaomi.wearable.course.data.LinechartDataEntity;
import com.xiaomi.wearable.course.data.LinechartViewProperty;
import defpackage.bli;
import defpackage.czi;
import defpackage.ew1;
import defpackage.ez5;
import defpackage.hu4;
import defpackage.ipi;
import defpackage.kyi;
import defpackage.oqi;
import defpackage.rvn;
import defpackage.sti;
import defpackage.vj7;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001fB\u0007¢\u0006\u0004\be\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0006J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ\u000f\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0006J\u000f\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0006J\u000f\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0006J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u000fJ\u000f\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0006J\u001f\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\fH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b%\u0010\u000fJ\u000f\u0010&\u001a\u00020\u0004H\u0002¢\u0006\u0004\b&\u0010\u0006J\u0017\u0010(\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u0019H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u0007H\u0002¢\u0006\u0004\b+\u0010\nJ\u001f\u0010/\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\f2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b/\u00100J\u0019\u00103\u001a\u00020\u00042\b\u00102\u001a\u0004\u0018\u000101H\u0014¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0004H\u0016¢\u0006\u0004\b8\u0010\u0006J\u000f\u00109\u001a\u00020\u0004H\u0016¢\u0006\u0004\b9\u0010\u0006J\u000f\u0010:\u001a\u00020\u0004H\u0014¢\u0006\u0004\b:\u0010\u0006R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R#\u0010D\u001a\n ?*\u0004\u0018\u00010>0>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0018\u0010F\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010I\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010K\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010N\u001a\u0004\u0018\u00010M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR#\u0010S\u001a\n ?*\u0004\u0018\u00010M0M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010A\u001a\u0004\bQ\u0010RR\u0014\u0010T\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010LR\u0016\u0010U\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u001b\u0010[\u001a\u00020W8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010A\u001a\u0004\bY\u0010ZR \u0010^\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020]0\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0014\u0010d\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010a¨\u0006g"}, d2 = {"Lcom/mi/health/course/activity/eco/EcoCourseSmartHrActivity;", "Lcom/mi/health/course/activity/eco/EcoBaseCourseActivity;", "Lcom/mi/health/course/activity/eco/EcoCourseSmartHrVM;", "Lvj7;", "", "initClickEvent", "()V", "", "islink", "setLinkSrc", "(Z)V", "initData", "", "duration", "setDuration", "(I)V", "addObserver", "hr", "checkAbnormalHr", "startSport", "pauseSport", "resumeSport", "state", "setButtonStatus", "configConcernData", "", "key", "", "value", "setConcernData", "(Ljava/lang/String;F)V", "fullStr", "valueLength", "txtSize", "Landroid/text/SpannableStringBuilder;", "buildSpan", "(Ljava/lang/String;II)Landroid/text/SpannableStringBuilder;", "setHrLabel", "showCountDownAnimation", "param", "showProtectDialog", "(Ljava/lang/String;)V", "enable", "setLinkEnable", "num", "", "milliseconds", "countDownTime", "(IJ)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/mi/health/course/data/CourseSportState;", "onSportStateChange", "(Lcom/mi/health/course/data/CourseSportState;)V", "finishCourse", "onBackPressed", LifecycleConstantKt.ON_DESTROY, "Ljava/text/SimpleDateFormat;", "mDurationFormat", "Ljava/text/SimpleDateFormat;", "Lcom/airbnb/lottie/LottieAnimationView;", "kotlin.jvm.PlatformType", "countDownLottieView$delegate", "Lkotlin/Lazy;", "getCountDownLottieView", "()Lcom/airbnb/lottie/LottieAnimationView;", "countDownLottieView", "Lcom/xiaomi/fitness/baseui/dialog/DriftDialog;", "driftDialog", "Lcom/xiaomi/fitness/baseui/dialog/DriftDialog;", "Landroid/os/CountDownTimer;", "timer", "Landroid/os/CountDownTimer;", "count", "I", "Landroid/graphics/Typeface;", "typeFace", "Landroid/graphics/Typeface;", "unitTypeFace$delegate", "getUnitTypeFace", "()Landroid/graphics/Typeface;", "unitTypeFace", "unitTextColor", "mHasNoHeartRate", "Z", "Ljava/lang/Runnable;", "finishTimeout$delegate", "getFinishTimeout", "()Ljava/lang/Runnable;", "finishTimeout", "", "Landroid/view/View;", "concernedConfig", "Ljava/util/Map;", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nEcoCourseSmartHrActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcoCourseSmartHrActivity.kt\ncom/mi/health/course/activity/eco/EcoCourseSmartHrActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,543:1\n1863#2,2:544\n*S KotlinDebug\n*F\n+ 1 EcoCourseSmartHrActivity.kt\ncom/mi/health/course/activity/eco/EcoCourseSmartHrActivity\n*L\n310#1:544,2\n*E\n"})
public final class EcoCourseSmartHrActivity extends Hilt_EcoCourseSmartHrActivity<EcoCourseSmartHrVM, vj7> {

    @NotNull
    public static final String TAG = "EcoCourseSmartHrActivity";
    public static final long TIMEOUT = 10000;
    private int count;

    @Nullable
    private DriftDialog driftDialog;

    @Nullable
    private CountDownTimer timer;

    @NotNull
    private final SimpleDateFormat mDurationFormat = new SimpleDateFormat(StringUtils.EXPECT_TIME_FORMAT);

    /* JADX INFO: renamed from: countDownLottieView$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy countDownLottieView = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ro7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoCourseSmartHrActivity.countDownLottieView_delegate$lambda$0(this.f32743a);
        }
    });

    @Nullable
    private final Typeface typeFace = DisplayUtil.getTypefaceAsResourceId(AppUtil.getApp(), ipi.f21978a);

    /* JADX INFO: renamed from: unitTypeFace$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy unitTypeFace = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: eo7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoCourseSmartHrActivity.unitTypeFace_delegate$lambda$1(this.f16871a);
        }
    });
    private final int unitTextColor = Color.parseColor("#8c000000");
    private boolean mHasNoHeartRate = true;

    /* JADX INFO: renamed from: finishTimeout$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy finishTimeout = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: fo7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoCourseSmartHrActivity.finishTimeout_delegate$lambda$3(this.f17995a);
        }
    });

    @NotNull
    private final Map<String, View> concernedConfig = new LinkedHashMap();

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
    private final void addObserver() {
        ((EcoCourseSmartHrVM) getMViewModel()).setOnDataChange(new Function1() { // from class: do7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoCourseSmartHrActivity.addObserver$lambda$9(this.f15739a, (PhoneSportData) obj);
            }
        });
        ((EcoCourseSmartHrVM) getMViewModel()).getLineChartDataEmitter().observe(this, new Observer() { // from class: jo7
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                EcoCourseSmartHrActivity.addObserver$lambda$10(this.f22969a, (LinechartViewProperty) obj);
            }
        });
        ((EcoCourseSmartHrVM) getMViewModel()).setToastListener(new Function1() { // from class: ko7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoCourseSmartHrActivity.addObserver$lambda$11(this.f24037a, (String) obj);
            }
        });
        ((EcoCourseSmartHrVM) getMViewModel()).setStageTitleListener(new Function1() { // from class: lo7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoCourseSmartHrActivity.addObserver$lambda$12(this.f25260a, (HrCourseConfigModel.HrDetailStage) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void addObserver$lambda$10(EcoCourseSmartHrActivity this$0, LinechartViewProperty linechartViewProperty) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((vj7) this$0.getMBinding()).L.setXMaxData(linechartViewProperty.getMaxValueX());
        ((vj7) this$0.getMBinding()).L.initRecommendData(linechartViewProperty.getRecommendList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:32:0x0083  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Unit addObserver$lambda$11(EcoCourseSmartHrActivity this$0, String it) {
        Dialog dialog;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        switch (it.hashCode()) {
            case -1998070641:
                if (it.equals("lessThan_hr")) {
                    ToastUtil.showShortToast(czi.course_hr_less_than);
                }
                break;
            case -309012785:
                if (it.equals("protect")) {
                    this$0.showProtectDialog(it);
                }
                break;
            case -52477855:
                if (it.equals("abnormal_hr")) {
                    ToastUtil.showShortToast(czi.course_hr_warning);
                }
                break;
            case 111691479:
                if (it.equals("speed_protect")) {
                    this$0.showProtectDialog(it);
                }
                break;
            case 720054337:
                if (it.equals("dialog_close")) {
                    boolean z = false;
                    this$0.setLinkEnable(false);
                    DriftDialog driftDialog = this$0.driftDialog;
                    if (driftDialog != null && (dialog = driftDialog.getDialog()) != null && dialog.isShowing()) {
                        z = true;
                    }
                    FitnessLogUtils.d(TAG, "protectDialog isShowing=" + z);
                    DriftDialog driftDialog2 = this$0.driftDialog;
                    if (driftDialog2 != null) {
                        driftDialog2.dismissAllowingStateLoss();
                    }
                }
                break;
            case 1712723795:
                if (it.equals("moreThan_hr")) {
                    ToastUtil.showShortToast(czi.course_hr_more_than);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit addObserver$lambda$12(EcoCourseSmartHrActivity this$0, HrCourseConfigModel.HrDetailStage it) {
        String string;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        int i = it.stage;
        if (i == 1) {
            string = this$0.getString(czi.course_hr_stage_warmup);
        } else if (i != 2) {
            string = i != 3 ? "" : this$0.getString(czi.course_hr_stage_relax);
        } else {
            string = this$0.getString(czi.course_hr_stage_training);
        }
        Resources resources = this$0.getResources();
        int i2 = kyi.f24422a;
        int i3 = it.duration;
        String quantityString = resources.getQuantityString(i2, i3, Integer.valueOf(i3));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        ((vj7) this$0.getMBinding()).B.setText(this$0.getResources().getString(czi.course_hr_stage_title, string, quantityString, Integer.valueOf(CourseExtKt.getMinBpm(it, this$0.getHrZone().getMaxHr())), Integer.valueOf(CourseExtKt.getMaxBpm(it, this$0.getHrZone().getMaxHr()))));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit addObserver$lambda$9(EcoCourseSmartHrActivity this$0, PhoneSportData it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.setHrLabel(it.heart_rate);
        this$0.checkAbnormalHr(it.heart_rate);
        this$0.setDistance(it.distance);
        ((EcoCourseSmartHrVM) this$0.getMViewModel()).changePropertyFromBpm(it.deviceDuration * ((long) 1000), it.heart_rate, it.speed);
        this$0.setDuration((int) it.deviceDuration);
        float f = 1000;
        this$0.setConcernData("distance", it.distance / f);
        this$0.setConcernData("calorie", it.calorie / f);
        this$0.setConcernData("speed", it.speed);
        ((vj7) this$0.getMBinding()).L.updateData(new LinechartDataEntity(it.deviceDuration / 60, it.heart_rate));
        return Unit.INSTANCE;
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

    private final void checkAbnormalHr(int hr) {
        if (hr == 0) {
            if (this.mHasNoHeartRate) {
                return;
            }
            checkHrWithZero(hr);
        } else {
            if (this.mHasNoHeartRate) {
                this.mHasNoHeartRate = false;
            }
            checkHrWithZero(hr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private final void configConcernData() {
        ((vj7) getMBinding()).J.removeAllViews();
        CourseConfigModel.DeviceLinkage deviceLinkage = getDeviceLinkage();
        if (deviceLinkage != null) {
            List<String> concernDataSet = deviceLinkage.concernDataSet;
            Intrinsics.checkNotNullExpressionValue(concernDataSet, "concernDataSet");
            for (IndexedValue indexedValue : CollectionsKt___CollectionsKt.withIndex(concernDataSet)) {
                FitnessLogUtils.d(TAG, "setConcernData: " + indexedValue);
                if (!Intrinsics.areEqual(indexedValue.getValue(), "hrm")) {
                    View viewInflate = LayoutInflater.from(this).inflate(sti.i, (ViewGroup) ((vj7) getMBinding()).J, false);
                    int childCount = ((vj7) getMBinding()).J.getChildCount();
                    if (childCount <= 3) {
                        if (childCount > 0) {
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(((vj7) getMBinding()).J.getLayoutParams());
                            layoutParams.setMargins(ez5.a(27), ez5.a(2), 0, 0);
                            viewInflate.setLayoutParams(layoutParams);
                            if (childCount == 1) {
                                Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type android.widget.TextView");
                                ((TextView) viewInflate).setGravity(17);
                            }
                        }
                        ((vj7) getMBinding()).J.addView(viewInflate);
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
    public static final LottieAnimationView countDownLottieView_delegate$lambda$0(EcoCourseSmartHrActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return (LottieAnimationView) this$0.findViewById(oqi.K);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void countDownTime(int num, long milliseconds) {
        this.count = num;
        CountDownTimer countDownTimer = new CountDownTimer(milliseconds, ((long) num) * milliseconds) { // from class: com.mi.health.course.activity.eco.EcoCourseSmartHrActivity.countDownTime.1
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
    public static final Runnable finishTimeout_delegate$lambda$3(final EcoCourseSmartHrActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new Runnable() { // from class: qo7
            @Override // java.lang.Runnable
            public final void run() {
                EcoCourseSmartHrActivity.finishTimeout_delegate$lambda$3$lambda$2(this.f31693a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void finishTimeout_delegate$lambda$3$lambda$2(EcoCourseSmartHrActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.d(TAG, "finish hrCourse timeout");
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
        ((vj7) getMBinding()).D.setOnClickListener(new View.OnClickListener() { // from class: mo7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EcoCourseSmartHrActivity.initClickEvent$lambda$4(this.f27043a, view);
            }
        });
        ((vj7) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: no7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EcoCourseSmartHrActivity.initClickEvent$lambda$5(this.f28195a, view);
            }
        });
        ((vj7) getMBinding()).C.setOnClickListener(new View.OnClickListener() { // from class: oo7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EcoCourseSmartHrActivity.initClickEvent$lambda$6(this.f29334a, view);
            }
        });
        ((vj7) getMBinding()).R.setOnClickListener(new View.OnClickListener() { // from class: po7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EcoCourseSmartHrActivity.initClickEvent$lambda$7(this.f30582a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initClickEvent$lambda$4(EcoCourseSmartHrActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (((EcoCourseSmartHrVM) this$0.getMViewModel()).isSportValid()) {
            this$0.showStopDialog();
        } else {
            this$0.showTimeTooShortDialog();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickEvent$lambda$5(EcoCourseSmartHrActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setButtonStatus(1);
        this$0.resumeSport();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickEvent$lambda$6(EcoCourseSmartHrActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setButtonStatus(2);
        this$0.pauseSport();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initClickEvent$lambda$7(EcoCourseSmartHrActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setLinkEnable(!((EcoCourseSmartHrVM) this$0.getMViewModel()).getLinkEnable());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initData() {
        String str;
        this.mDurationFormat.setTimeZone(TimeZone.getTimeZone("GMT+00:00"));
        CourseModel.CourseData basicInfo = getInfo().getBasicInfo();
        TextView textView = ((vj7) getMBinding()).E;
        if (basicInfo == null || (str = basicInfo.title) == null) {
            str = "";
        }
        textView.setText(str);
        ((EcoCourseSmartHrVM) getMViewModel()).initLineChart(getInfo().getHeartCourseDetail());
        configConcernData();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void pauseSport() {
        FitnessLogUtils.d(TAG, "pauseSport");
        ((EcoCourseSmartHrVM) getMViewModel()).pauseSport(getSportType(), new RequestCallback() { // from class: com.mi.health.course.activity.eco.EcoCourseSmartHrActivity.pauseSport.1
            @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback
            public void call(int responseCode) {
                FitnessLogUtils.d(EcoCourseSmartHrActivity.TAG, "pauseSport result=" + responseCode);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void resumeSport() {
        FitnessLogUtils.d(TAG, "resumeSport");
        ((EcoCourseSmartHrVM) getMViewModel()).resumeSport(getSportType(), new RequestCallback() { // from class: com.mi.health.course.activity.eco.EcoCourseSmartHrActivity.resumeSport.1
            @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback
            public void call(int responseCode) {
                FitnessLogUtils.d(EcoCourseSmartHrActivity.TAG, "resumeSport result=" + responseCode);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setButtonStatus(int state) {
        if (state == 1) {
            ImageView audioPauseIv = ((vj7) getMBinding()).A;
            Intrinsics.checkNotNullExpressionValue(audioPauseIv, "audioPauseIv");
            ViewExtKt.gone(audioPauseIv);
            ImageView audioStopIv = ((vj7) getMBinding()).D;
            Intrinsics.checkNotNullExpressionValue(audioStopIv, "audioStopIv");
            ViewExtKt.gone(audioStopIv);
            ImageView audioStartIv = ((vj7) getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(audioStartIv, "audioStartIv");
            ViewExtKt.visible(audioStartIv);
            return;
        }
        if (state != 2) {
            return;
        }
        ImageView audioPauseIv2 = ((vj7) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(audioPauseIv2, "audioPauseIv");
        ViewExtKt.visible(audioPauseIv2);
        ImageView audioStopIv2 = ((vj7) getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(audioStopIv2, "audioStopIv");
        ViewExtKt.visible(audioStopIv2);
        ImageView audioStartIv2 = ((vj7) getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(audioStartIv2, "audioStartIv");
        ViewExtKt.gone(audioStartIv2);
    }

    private final void setConcernData(String key, float value) {
        View view = this.concernedConfig.get(key);
        if (view != null) {
            TextView textView = (TextView) view;
            int iHashCode = key.hashCode();
            if (iHashCode == 109641799) {
                if (key.equals("speed")) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String str = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(value)}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                    textView.setText(buildSpan(str + "\n" + getString(czi.course_unit_speed), String.valueOf(value).length(), 30));
                    return;
                }
                return;
            }
            if (iHashCode == 288459765) {
                if (key.equals("distance")) {
                    textView.setText(buildSpan(value + "\n" + textView.getResources().getQuantityString(kyi.f24423b, (int) value), String.valueOf(value).length(), 30));
                    return;
                }
                return;
            }
            if (iHashCode == 548738829 && key.equals("calorie")) {
                int i = (int) value;
                textView.setText(buildSpan(i + "\n" + getString(czi.course_calorie_label), String.valueOf(i).length(), 30));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setDuration(int duration) {
        if (duration < 0) {
            return;
        }
        ((vj7) getMBinding()).V.setText(TimeDateUtil.getTimeStrWithSecDef(duration));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setHrLabel(int hr) {
        ((vj7) getMBinding()).K.setText(hr <= 0 ? "--" : String.valueOf(hr));
        HrZoneLevel hrZone = getHrZone().getHrZone(hr);
        ((vj7) getMBinding()).M.setBackgroundColor(getResources().getColor(bli.e));
        ((vj7) getMBinding()).N.setBackgroundColor(getResources().getColor(bli.e));
        ((vj7) getMBinding()).O.setBackgroundColor(getResources().getColor(bli.e));
        ((vj7) getMBinding()).P.setBackgroundColor(getResources().getColor(bli.e));
        ((vj7) getMBinding()).Q.setBackgroundColor(getResources().getColor(bli.e));
        switch (WhenMappings.$EnumSwitchMapping$0[hrZone.ordinal()]) {
            case 1:
            case 2:
                ((vj7) getMBinding()).M.setBackgroundColor(getResources().getColor(bli.common_textcolor_1));
                ((vj7) getMBinding()).G.setText(getResources().getString(czi.course_hr_distribute_warm_up));
                return;
            case 3:
                ((vj7) getMBinding()).N.setBackgroundColor(getResources().getColor(bli.common_textcolor_1));
                ((vj7) getMBinding()).G.setText(getResources().getString(czi.course_hr_distribute_fat_burn));
                return;
            case 4:
                ((vj7) getMBinding()).O.setBackgroundColor(getResources().getColor(bli.common_textcolor_1));
                ((vj7) getMBinding()).G.setText(getResources().getString(czi.course_hr_distribute_aerobic));
                return;
            case 5:
                ((vj7) getMBinding()).P.setBackgroundColor(getResources().getColor(bli.common_textcolor_1));
                ((vj7) getMBinding()).G.setText(getResources().getString(czi.course_hr_distribute_anaerobic));
                return;
            case 6:
                ((vj7) getMBinding()).Q.setBackgroundColor(getResources().getColor(bli.common_textcolor_1));
                ((vj7) getMBinding()).G.setText(getResources().getString(czi.course_hr_distribute_acme));
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setLinkEnable(boolean enable) {
        if (enable) {
            ToastUtil.showShortToast(czi.course_hr_linked_open);
        } else {
            ToastUtil.showShortToast(czi.course_hr_linked_close);
        }
        ((EcoCourseSmartHrVM) getMViewModel()).setLinkEnable(enable);
        setLinkSrc(((EcoCourseSmartHrVM) getMViewModel()).getLinkEnable());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setLinkSrc(boolean islink) {
        if (islink) {
            ((vj7) getMBinding()).R.setImageResource(xmi.course_audio_link_open);
            FitnessLogUtils.d(TAG, "link open");
        } else {
            ((vj7) getMBinding()).R.setImageResource(xmi.course_audio_link_close);
            FitnessLogUtils.d(TAG, "link close");
        }
    }

    private final void showCountDownAnimation() {
        final LottieAnimationView countDownLottieView = getCountDownLottieView();
        if (countDownLottieView != null) {
            countDownLottieView.setVisibility(0);
            countDownLottieView.w();
            countDownLottieView.i(new Animator.AnimatorListener() { // from class: com.mi.health.course.activity.eco.EcoCourseSmartHrActivity$showCountDownAnimation$1$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    countDownLottieView.setVisibility(8);
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
    /* JADX WARN: Type inference failed for: r5v20, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v22, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v3, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v5, types: [T, java.lang.String] */
    private final void showProtectDialog(String param) {
        if (((EcoCourseSmartHrVM) getMViewModel()).getLinkEnable()) {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = "";
            final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = "";
            if (Intrinsics.areEqual(param, "protect")) {
                objectRef.element = getString(czi.course_hr_dialog_title);
                objectRef2.element = getString(czi.course_hr_linked_continue);
            } else if (Intrinsics.areEqual(param, "speed_protect")) {
                objectRef.element = getString(czi.course_hr_speed_protect_title);
                objectRef2.element = getString(czi.course_hr_speed_protect);
            }
            if (((CharSequence) objectRef.element).length() == 0) {
                return;
            }
            DriftDialog driftDialogCreate = new DriftDialog.Builder().setLayoutRes(sti.course_layout_dialog).addClickIds(oqi.C0, oqi.e1).setOnViewClick(new Function2() { // from class: go7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EcoCourseSmartHrActivity.showProtectDialog$lambda$17(this.f19179a, (View) obj, (DriftDialog) obj2);
                }
            }).setOnViewBind(new Function1() { // from class: ho7
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return EcoCourseSmartHrActivity.showProtectDialog$lambda$18(objectRef, objectRef2, (View) obj);
                }
            }).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: io7
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    EcoCourseSmartHrActivity.showProtectDialog$lambda$19(this.f21939a, dialogInterface);
                }
            }).setCanceledOnTouchOutside(false).create();
            this.driftDialog = driftDialogCreate;
            if (driftDialogCreate != null) {
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                driftDialogCreate.show(supportFragmentManager);
            }
            ((EcoCourseSmartHrVM) getMViewModel()).protectDialogDismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showProtectDialog$lambda$17(EcoCourseSmartHrActivity this$0, View view, DriftDialog dialog) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        int id = view.getId();
        if (id == oqi.C0) {
            dialog.dismiss();
            this$0.setLinkEnable(false);
        } else if (id == oqi.e1) {
            dialog.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showProtectDialog$lambda$18(Ref.ObjectRef title, Ref.ObjectRef content, View view) {
        Intrinsics.checkNotNullParameter(title, "$title");
        Intrinsics.checkNotNullParameter(content, "$content");
        Intrinsics.checkNotNullParameter(view, "view");
        hu4 hu4VarA0 = hu4.A0(view);
        hu4VarA0.E.setText((CharSequence) title.element);
        hu4VarA0.A.setText((CharSequence) content.element);
        hu4VarA0.B.setText(czi.common_cancel);
        hu4VarA0.D.setText(czi.c);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void showProtectDialog$lambda$19(EcoCourseSmartHrActivity this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((EcoCourseSmartHrVM) this$0.getMViewModel()).removeAutoDismissMsg();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void startSport() {
        FitnessLogUtils.d(TAG, "startSport");
        ((EcoCourseSmartHrVM) getMViewModel()).startLocalSport(new RequestCallback() { // from class: com.mi.health.course.activity.eco.EcoCourseSmartHrActivity.startSport.1
            @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback
            public void call(int responseCode) {
                FitnessLogUtils.d(EcoCourseSmartHrActivity.TAG, "startLocalSport result=" + responseCode);
                if (responseCode != 0) {
                    ToastUtil.showShortToast(czi.course_device_abnomal);
                    EcoCourseSmartHrActivity.this.quitCourse();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Typeface unitTypeFace_delegate$lambda$1(EcoCourseSmartHrActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return Typeface.create(this$0.getString(czi.e), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mi.health.course.activity.eco.EcoBaseCourseActivity
    public void finishCourse() {
        boolean zIsDeviceConnect = ((EcoCourseSmartHrVM) getMViewModel()).isDeviceConnect();
        FitnessLogUtils.d(TAG, "finishCourse: startTime = " + getStartTime() + "; deviceConnect = " + zIsDeviceConnect);
        if (!zIsDeviceConnect) {
            quitCourse();
        } else {
            ((vj7) getMBinding()).G.postDelayed(getFinishTimeout(), 10000L);
            ((EcoCourseSmartHrVM) getMViewModel()).finishSport(getSportType(), new RequestCallback() { // from class: com.mi.health.course.activity.eco.EcoCourseSmartHrActivity.finishCourse.1
                @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback
                public void call(int responseCode) {
                    FitnessLogUtils.d(EcoCourseSmartHrActivity.TAG, "finishCourse result=" + responseCode);
                }
            });
        }
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return sti.d;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return ew1.f17121a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
        if (((EcoCourseSmartHrVM) getMViewModel()).getIsCoursePause()) {
            return;
        }
        pauseSport();
        setButtonStatus(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mi.health.course.activity.eco.Hilt_EcoCourseSmartHrActivity, com.mi.health.course.activity.eco.EcoBaseCourseActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addObserver();
        initClickEvent();
        initData();
        startSport();
        showCountDownAnimation();
        setLinkSrc(((EcoCourseSmartHrVM) getMViewModel()).getLinkEnable());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mi.health.course.activity.eco.Hilt_EcoCourseSmartHrActivity, com.mi.health.course.activity.eco.EcoBaseCourseActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getCountDownLottieView().x();
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        ((vj7) getMBinding()).G.postDelayed(getFinishTimeout(), 10000L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mi.health.course.activity.eco.EcoBaseCourseActivity
    public void onSportStateChange(@NotNull CourseSportState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof CourseSportState.Finish) {
            FitnessLogUtils.d(TAG, "onSportFinished validSport==" + state);
            ((vj7) getMBinding()).G.postDelayed(getFinishTimeout(), 10000L);
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
            ((EcoCourseSmartHrVM) getMViewModel()).setCoursePause(false);
            setButtonStatus(1);
        } else if (Intrinsics.areEqual(state, CourseSportState.Pause.INSTANCE)) {
            FitnessLogUtils.d(TAG, "onSportPaused");
            ((EcoCourseSmartHrVM) getMViewModel()).setCoursePause(true);
            setButtonStatus(2);
        } else if (!(state instanceof CourseSportState.Start)) {
            FitnessLogUtils.d(TAG, "onSportStateChange other");
        } else {
            FitnessLogUtils.d(TAG, "onSportStarted");
            setButtonStatus(1);
        }
    }
}
