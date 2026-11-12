package com.mi.health.course.activity;

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
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import com.airbnb.lottie.LottieAnimationView;
import com.mi.health.course.LineChartType;
import com.mi.health.course.activity.CourseAudioActivity;
import com.mi.health.course.data.CourseSportState;
import com.mi.health.course.export.data.CourseConfigModel;
import com.mi.health.course.export.data.CourseModel;
import com.mi.health.course.ext.CourseExtKt;
import com.mi.health.course.util.LogUtil;
import com.mi.health.course.util.TextTypefaceSpan;
import com.mi.health.course.vm.CourseAudioVM;
import com.mi.health.course.vm.CourseBasePlayerVM;
import com.miui.tsmclient.util.StringUtils;
import com.xiaomi.fitness.account.HrZoneLevel;
import com.xiaomi.fitness.baseui.dialog.DriftDialog;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.sport_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_manager_export.listener.RequestCallback;
import com.xiaomi.wearable.course.data.LinechartDataEntity;
import com.xiaomi.wearable.course.data.LinechartViewProperty;
import defpackage.bli;
import defpackage.czi;
import defpackage.ew1;
import defpackage.ez5;
import defpackage.ipi;
import defpackage.kyi;
import defpackage.om4;
import defpackage.oqi;
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
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\bb\u0010\nJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\nJ\u001f\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010\bJ\u000f\u0010\"\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010\nJ\u000f\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010\nJ\u000f\u0010$\u001a\u00020\u0006H\u0002¢\u0006\u0004\b$\u0010\nJ\u000f\u0010%\u001a\u00020\u0006H\u0002¢\u0006\u0004\b%\u0010\nJ\u001f\u0010)\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u0019\u0010-\u001a\u00020\u00062\b\u0010,\u001a\u0004\u0018\u00010+H\u0014¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\rH\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\rH\u0016¢\u0006\u0004\b1\u00100J\u0017\u00103\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u000202H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0006H\u0016¢\u0006\u0004\b5\u0010\nJ\u000f\u00106\u001a\u00020\u0006H\u0016¢\u0006\u0004\b6\u0010\nJ\u000f\u00107\u001a\u00020\u0006H\u0014¢\u0006\u0004\b7\u0010\nR\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R#\u0010C\u001a\n >*\u0004\u0018\u00010=0=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0018\u0010E\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010M\u001a\u0004\u0018\u00010L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR#\u0010R\u001a\n >*\u0004\u0018\u00010L0L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010@\u001a\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010HR \u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020U0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u001b\u0010\\\u001a\u00020X8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010@\u001a\u0004\bZ\u0010[R\u0014\u0010_\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0014\u0010a\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b`\u0010^¨\u0006c"}, d2 = {"Lcom/mi/health/course/activity/CourseAudioActivity;", "Lcom/mi/health/course/activity/BaseCourseActivity;", "Lcom/mi/health/course/vm/CourseAudioVM;", "Lom4;", "", "duration", "", "setDuration", "(I)V", "addObserver", "()V", "initData", "initClickEvent", "", "islink", "setLinkSrc", "(Z)V", "state", "setButtonStatus", "configConcernData", "", "key", "", "value", "setConcernData", "(Ljava/lang/String;F)V", "fullStr", "valueLength", "txtSize", "Landroid/text/SpannableStringBuilder;", "buildSpan", "(Ljava/lang/String;II)Landroid/text/SpannableStringBuilder;", "hr", "setHrLabel", "startSport", "pauseSport", "resumeSport", "showCountDownAnimation", "num", "", "milliseconds", "countDownTime", "(IJ)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "enablePadOrientationRotate", "()Z", "isSendCmd", "Lcom/mi/health/course/data/CourseSportState;", "onSportStateChange", "(Lcom/mi/health/course/data/CourseSportState;)V", "finishCourse", "onBackPressed", LifecycleConstantKt.ON_DESTROY, "Ljava/text/SimpleDateFormat;", "mDurationFormat", "Ljava/text/SimpleDateFormat;", "isPause", "Z", "Lcom/airbnb/lottie/LottieAnimationView;", "kotlin.jvm.PlatformType", "countDownLottieView$delegate", "Lkotlin/Lazy;", "getCountDownLottieView", "()Lcom/airbnb/lottie/LottieAnimationView;", "countDownLottieView", "Landroid/os/CountDownTimer;", "timer", "Landroid/os/CountDownTimer;", "count", "I", "Lcom/xiaomi/fitness/baseui/dialog/DriftDialog;", "errorDialog", "Lcom/xiaomi/fitness/baseui/dialog/DriftDialog;", "Landroid/graphics/Typeface;", "typeFace", "Landroid/graphics/Typeface;", "unitTypeFace$delegate", "getUnitTypeFace", "()Landroid/graphics/Typeface;", "unitTypeFace", "unitTextColor", "", "Landroid/view/View;", "concernedConfig", "Ljava/util/Map;", "Ljava/lang/Runnable;", "finishTimeout$delegate", "getFinishTimeout", "()Ljava/lang/Runnable;", "finishTimeout", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCourseAudioActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseAudioActivity.kt\ncom/mi/health/course/activity/CourseAudioActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,555:1\n1863#2,2:556\n*S KotlinDebug\n*F\n+ 1 CourseAudioActivity.kt\ncom/mi/health/course/activity/CourseAudioActivity\n*L\n298#1:556,2\n*E\n"})
public final class CourseAudioActivity extends Hilt_CourseAudioActivity<CourseAudioVM, om4> {
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
    private final Lazy countDownLottieView = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: go4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CourseAudioActivity.countDownLottieView_delegate$lambda$0(this.f19176a);
        }
    });

    @Nullable
    private final Typeface typeFace = DisplayUtil.getTypefaceAsResourceId(AppUtil.getApp(), ipi.f21978a);

    /* JADX INFO: renamed from: unitTypeFace$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy unitTypeFace = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ho4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CourseAudioActivity.unitTypeFace_delegate$lambda$1(this.f20278a);
        }
    });
    private final int unitTextColor = Color.parseColor("#8c000000");

    @NotNull
    private final Map<String, View> concernedConfig = new LinkedHashMap();

    /* JADX INFO: renamed from: finishTimeout$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy finishTimeout = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: io4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CourseAudioActivity.finishTimeout_delegate$lambda$15(this.f21936a);
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
    public static final /* synthetic */ CourseAudioVM access$getMViewModel(CourseAudioActivity courseAudioActivity) {
        return (CourseAudioVM) courseAudioActivity.getMViewModel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void addObserver() {
        ((CourseAudioVM) getMViewModel()).setOnDataChange(new Function1() { // from class: ao4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseAudioActivity.addObserver$lambda$3(this.f3296a, (PhoneSportData) obj);
            }
        });
        ((CourseAudioVM) getMViewModel()).getLineChartDataEmitter().observe(this, new Observer() { // from class: do4
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                CourseAudioActivity.addObserver$lambda$4(this.f15736a, (LinechartViewProperty) obj);
            }
        });
        ((CourseAudioVM) getMViewModel()).setOnPlayError(new Function1() { // from class: eo4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseAudioActivity.addObserver$lambda$5(this.f16868a, ((Boolean) obj).booleanValue());
            }
        });
        ((CourseAudioVM) getMViewModel()).getTitleEmitter().observe(this, new Observer() { // from class: fo4
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                CourseAudioActivity.addObserver$lambda$6(this.f17991a, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit addObserver$lambda$3(CourseAudioActivity this$0, PhoneSportData it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.setDistance(it.distance);
        this$0.setHrLabel(it.heart_rate);
        this$0.checkHr(it.heart_rate);
        this$0.setDuration((int) it.deviceDuration);
        float f = it.speed;
        float f2 = 1000;
        this$0.setConcernData("distance", it.distance / f2);
        this$0.setConcernData("calorie", it.calorie / f2);
        this$0.setConcernData("speed", f);
        if (Intrinsics.areEqual(((CourseAudioVM) this$0.getMViewModel()).getLineChartType(), LineChartType.TIME.getItem())) {
            ((om4) this$0.getMBinding()).R.updateData(new LinechartDataEntity(it.deviceDuration / 60, f));
        } else {
            ((om4) this$0.getMBinding()).R.updateData(new LinechartDataEntity(it.distance, f));
        }
        ((CourseAudioVM) this$0.getMViewModel()).sendCmd(it.distance);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void addObserver$lambda$4(CourseAudioActivity this$0, LinechartViewProperty linechartViewProperty) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((om4) this$0.getMBinding()).R.initRecommendData(linechartViewProperty.getRecommendList());
        String type = linechartViewProperty.getType();
        LineChartType lineChartType = LineChartType.TIME;
        if (Intrinsics.areEqual(type, lineChartType.getItem())) {
            ((om4) this$0.getMBinding()).R.setXType(lineChartType, linechartViewProperty.getMaxValueX());
        } else {
            ((om4) this$0.getMBinding()).R.setXType(LineChartType.DISTANCE, linechartViewProperty.getMaxValueX());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addObserver$lambda$5(CourseAudioActivity this$0, boolean z) {
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
    public static final void addObserver$lambda$6(CourseAudioActivity this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((om4) this$0.getMBinding()).D.setText(str);
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
        spannableStringBuilder.setSpan(new ForegroundColorSpan(this.unitTextColor), valueLength, fullStr.length(), 17);
        return spannableStringBuilder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private final void configConcernData() {
        ((om4) getMBinding()).J.removeAllViews();
        int i = UIUtils.INSTANCE.getScreenState() == 0 ? 4 : 3;
        CourseConfigModel.DeviceLinkage deviceLinkage = getDeviceLinkage();
        if (deviceLinkage != null) {
            List<String> concernDataSet = deviceLinkage.concernDataSet;
            Intrinsics.checkNotNullExpressionValue(concernDataSet, "concernDataSet");
            for (IndexedValue indexedValue : CollectionsKt___CollectionsKt.withIndex(concernDataSet)) {
                LogUtil.INSTANCE.i(BaseBindingActivity.TAG, "setConcernData: " + indexedValue);
                boolean z = UIUtils.INSTANCE.getScreenState() == 0;
                if (!Intrinsics.areEqual(indexedValue.getValue(), "hrm")) {
                    View viewInflate = LayoutInflater.from(this).inflate(sti.course_layout_video_data, (ViewGroup) ((om4) getMBinding()).J, false);
                    int childCount = ((om4) getMBinding()).J.getChildCount();
                    if (childCount <= i) {
                        if (childCount > 0) {
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(((om4) getMBinding()).J.getLayoutParams());
                            layoutParams.setMargins(ExtUtilsKt.getDp(Integer.valueOf(z ? 340 : 27)), ez5.a(2), 0, 0);
                            viewInflate.setLayoutParams(layoutParams);
                            if (childCount == 1) {
                                Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type android.widget.TextView");
                                ((TextView) viewInflate).setGravity(17);
                            }
                        }
                        ((om4) getMBinding()).J.addView(viewInflate);
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
    public static final LottieAnimationView countDownLottieView_delegate$lambda$0(CourseAudioActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return (LottieAnimationView) this$0.findViewById(oqi.K);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void countDownTime(int num, long milliseconds) {
        this.count = num;
        CountDownTimer countDownTimer = new CountDownTimer(milliseconds, ((long) num) * milliseconds) { // from class: com.mi.health.course.activity.CourseAudioActivity.countDownTime.1
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
    public static final Runnable finishTimeout_delegate$lambda$15(final CourseAudioActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new Runnable() { // from class: co4
            @Override // java.lang.Runnable
            public final void run() {
                CourseAudioActivity.finishTimeout_delegate$lambda$15$lambda$14(this.f5592a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void finishTimeout_delegate$lambda$15$lambda$14(CourseAudioActivity this$0) {
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

    private final Typeface getUnitTypeFace() {
        return (Typeface) this.unitTypeFace.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initClickEvent() {
        ((om4) getMBinding()).C.setOnClickListener(new View.OnClickListener() { // from class: jo4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CourseAudioActivity.initClickEvent$lambda$7(this.f22966a, view);
            }
        });
        ((om4) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: ko4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CourseAudioActivity.initClickEvent$lambda$8(this.f24035a, view);
            }
        });
        ((om4) getMBinding()).B.setOnClickListener(new View.OnClickListener() { // from class: lo4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CourseAudioActivity.initClickEvent$lambda$9(this.f25257a, view);
            }
        });
        ((om4) getMBinding()).Q.setOnClickListener(new View.OnClickListener() { // from class: bo4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CourseAudioActivity.initClickEvent$lambda$10(this.f4415a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initClickEvent$lambda$10(CourseAudioActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setCmdEnable(!this$0.getCmdEnable());
        this$0.setLinkSrc(this$0.getCmdEnable());
        ((CourseAudioVM) this$0.getMViewModel()).setCmdEnable(this$0.getCmdEnable());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initClickEvent$lambda$7(CourseAudioActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (((CourseAudioVM) this$0.getMViewModel()).isSportValid()) {
            this$0.showStopDialog();
        } else {
            this$0.showTimeTooShortDialog();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickEvent$lambda$8(CourseAudioActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.resumeSport();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickEvent$lambda$9(CourseAudioActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.pauseSport();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initData() {
        String str;
        this.mDurationFormat.setTimeZone(TimeZone.getTimeZone("GMT+00:00"));
        CourseModel.CourseData basicInfo = getInfo().getBasicInfo();
        TextView textView = ((om4) getMBinding()).E;
        if (basicInfo == null || (str = basicInfo.title) == null) {
            str = "";
        }
        textView.setText(str);
        CourseAudioVM courseAudioVM = (CourseAudioVM) getMViewModel();
        CourseConfigModel.AudioInfo audioInfo = getInfo().getAudioInfo();
        courseAudioVM.initAudioSegment(audioInfo != null ? audioInfo.audioSegments : null);
        configConcernData();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void pauseSport() {
        LogUtil.INSTANCE.i(BaseBindingActivity.TAG, "pauseSport");
        ((CourseAudioVM) getMViewModel()).pauseAudio();
        if (CourseExtKt.supportLink(getDeviceLinkage())) {
            ((CourseAudioVM) getMViewModel()).pauseSport(getSportType(), new RequestCallback() { // from class: com.mi.health.course.activity.CourseAudioActivity.pauseSport.1
                @Override // com.xiaomi.fitness.sport_manager_export.listener.RequestCallback
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
        ((CourseAudioVM) getMViewModel()).resumeAudio();
        if (CourseExtKt.supportLink(getDeviceLinkage())) {
            ((CourseAudioVM) getMViewModel()).resumeSport(getSportType(), new RequestCallback() { // from class: com.mi.health.course.activity.CourseAudioActivity.resumeSport.1
                @Override // com.xiaomi.fitness.sport_manager_export.listener.RequestCallback
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
            ImageView audioPauseIv = ((om4) getMBinding()).A;
            Intrinsics.checkNotNullExpressionValue(audioPauseIv, "audioPauseIv");
            ViewExtKt.gone(audioPauseIv);
            ImageView audioStopIv = ((om4) getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(audioStopIv, "audioStopIv");
            ViewExtKt.gone(audioStopIv);
            ImageView audioStartIv = ((om4) getMBinding()).B;
            Intrinsics.checkNotNullExpressionValue(audioStartIv, "audioStartIv");
            ViewExtKt.visible(audioStartIv);
            return;
        }
        if (state != 2) {
            return;
        }
        ImageView audioPauseIv2 = ((om4) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(audioPauseIv2, "audioPauseIv");
        ViewExtKt.visible(audioPauseIv2);
        ImageView audioStopIv2 = ((om4) getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(audioStopIv2, "audioStopIv");
        ViewExtKt.visible(audioStopIv2);
        ImageView audioStartIv2 = ((om4) getMBinding()).B;
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
        ((om4) getMBinding()).V.setText(TimeDateUtil.getTimeStrWithSecDef(duration));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setHrLabel(int hr) {
        ((om4) getMBinding()).K.setText(hr <= 0 ? "--" : String.valueOf(hr));
        HrZoneLevel hrZone = getHrZone().getHrZone(hr);
        ((om4) getMBinding()).L.setBackgroundColor(getResources().getColor(bli.e));
        ((om4) getMBinding()).M.setBackgroundColor(getResources().getColor(bli.e));
        ((om4) getMBinding()).N.setBackgroundColor(getResources().getColor(bli.e));
        ((om4) getMBinding()).O.setBackgroundColor(getResources().getColor(bli.e));
        ((om4) getMBinding()).P.setBackgroundColor(getResources().getColor(bli.e));
        switch (WhenMappings.$EnumSwitchMapping$0[hrZone.ordinal()]) {
            case 1:
            case 2:
                ((om4) getMBinding()).L.setBackgroundColor(getResources().getColor(bli.common_textcolor_1));
                ((om4) getMBinding()).G.setText(getResources().getString(czi.course_hr_distribute_warm_up));
                return;
            case 3:
                ((om4) getMBinding()).M.setBackgroundColor(getResources().getColor(bli.common_textcolor_1));
                ((om4) getMBinding()).G.setText(getResources().getString(czi.course_hr_distribute_fat_burn));
                return;
            case 4:
                ((om4) getMBinding()).N.setBackgroundColor(getResources().getColor(bli.common_textcolor_1));
                ((om4) getMBinding()).G.setText(getResources().getString(czi.course_hr_distribute_aerobic));
                return;
            case 5:
                ((om4) getMBinding()).O.setBackgroundColor(getResources().getColor(bli.common_textcolor_1));
                ((om4) getMBinding()).G.setText(getResources().getString(czi.course_hr_distribute_anaerobic));
                return;
            case 6:
                ((om4) getMBinding()).P.setBackgroundColor(getResources().getColor(bli.common_textcolor_1));
                ((om4) getMBinding()).G.setText(getResources().getString(czi.course_hr_distribute_acme));
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setLinkSrc(boolean islink) {
        if (islink) {
            ((om4) getMBinding()).Q.setImageResource(xmi.course_audio_link_open);
        } else {
            ((om4) getMBinding()).Q.setImageResource(xmi.course_audio_link_close);
        }
    }

    private final void showCountDownAnimation() {
        final LottieAnimationView countDownLottieView = getCountDownLottieView();
        if (countDownLottieView != null) {
            countDownLottieView.setVisibility(0);
            countDownLottieView.w();
            countDownLottieView.i(new Animator.AnimatorListener() { // from class: com.mi.health.course.activity.CourseAudioActivity$showCountDownAnimation$1$1
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
                    CourseAudioActivity.access$getMViewModel(this).startAudio(str);
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
        ((CourseAudioVM) getMViewModel()).startLocalSport(new RequestCallback() { // from class: com.mi.health.course.activity.CourseAudioActivity.startSport.1
            @Override // com.xiaomi.fitness.sport_manager_export.listener.RequestCallback
            public void call(int responseCode) {
                LogUtil.INSTANCE.i(BaseBindingActivity.TAG, "startLocalSport result=" + responseCode);
                if (responseCode != 0) {
                    ToastUtil.showShortToast(czi.course_device_busy);
                    CourseAudioActivity.this.finish();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Typeface unitTypeFace_delegate$lambda$1(CourseAudioActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return Typeface.create(this$0.getString(czi.e), 0);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity
    public boolean enablePadOrientationRotate() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mi.health.course.activity.BaseCourseActivity
    public void finishCourse() {
        ((CourseAudioVM) getMViewModel()).stopAudio();
        boolean zIsDeviceConnect = ((CourseAudioVM) getMViewModel()).isDeviceConnect();
        LogUtil.INSTANCE.i(BaseBindingActivity.TAG, "finishCourse: startTime = " + getStartTime() + "; deviceConnect = " + zIsDeviceConnect);
        if (getStartTime() <= 0 || !zIsDeviceConnect) {
            finish();
        } else {
            ((om4) getMBinding()).G.postDelayed(getFinishTimeout(), 10000L);
            CourseBasePlayerVM.finishSport$default((CourseBasePlayerVM) getMViewModel(), getSportType(), new RequestCallback() { // from class: com.mi.health.course.activity.CourseAudioActivity.finishCourse.1
                @Override // com.xiaomi.fitness.sport_manager_export.listener.RequestCallback
                public void call(int responseCode) {
                    LogUtil.INSTANCE.i(BaseBindingActivity.TAG, "finishCourse resultCode=" + responseCode);
                }
            }, 0L, 4, null);
        }
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return sti.course_activity_audio;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return ew1.f17121a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mi.health.course.activity.BaseCourseActivity
    public boolean isSendCmd() {
        return Intrinsics.areEqual(((CourseAudioVM) getMViewModel()).getLineChartType(), LineChartType.DISTANCE.getItem());
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
    @Override // com.mi.health.course.activity.Hilt_CourseAudioActivity, com.mi.health.course.activity.BaseCourseActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addObserver();
        initClickEvent();
        initData();
        startSport();
        showCountDownAnimation();
        if (CourseExtKt.supportLink(getDeviceLinkage())) {
            setLinkSrc(getCmdEnable());
        } else {
            ((CourseAudioVM) getMViewModel()).setCmdEnable(false);
            ((om4) getMBinding()).Q.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mi.health.course.activity.Hilt_CourseAudioActivity, com.mi.health.course.activity.BaseCourseActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getCountDownLottieView().x();
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        ((om4) getMBinding()).G.removeCallbacks(getFinishTimeout());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mi.health.course.activity.BaseCourseActivity
    public void onSportStateChange(@NotNull CourseSportState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof CourseSportState.Finish) {
            LogUtil.INSTANCE.i(BaseBindingActivity.TAG, "onSportFinished validSport==" + state);
            ((om4) getMBinding()).G.removeCallbacks(getFinishTimeout());
            ((CourseAudioVM) getMViewModel()).stopAudio();
            if (((CourseSportState.Finish) state).getValidSport()) {
                finish();
                return;
            } else {
                finish();
                return;
            }
        }
        if (Intrinsics.areEqual(state, CourseSportState.Restart.INSTANCE)) {
            LogUtil.INSTANCE.i(BaseBindingActivity.TAG, "onSportRestarted");
            this.isPause = false;
            setButtonStatus(1);
            ((CourseAudioVM) getMViewModel()).resumeAudio();
            return;
        }
        if (Intrinsics.areEqual(state, CourseSportState.Pause.INSTANCE)) {
            LogUtil.INSTANCE.i(BaseBindingActivity.TAG, "onSportPaused");
            this.isPause = true;
            setButtonStatus(2);
            ((CourseAudioVM) getMViewModel()).pauseAudio();
            return;
        }
        if (!(state instanceof CourseSportState.Start)) {
            LogUtil.INSTANCE.i(BaseBindingActivity.TAG, "onSportStateChange other");
        } else {
            LogUtil.INSTANCE.i(BaseBindingActivity.TAG, "onSportStarted");
            setButtonStatus(1);
        }
    }
}
