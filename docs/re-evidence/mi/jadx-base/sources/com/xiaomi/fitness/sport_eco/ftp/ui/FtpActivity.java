package com.xiaomi.fitness.sport_eco.ftp.ui;

import android.animation.Animator;
import android.app.Application;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.airbnb.lottie.LottieAnimationView;
import com.miui.tsmclient.util.Constants;
import com.miui.tsmclient.util.StringUtils;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.account.HrZone;
import com.xiaomi.fitness.account.HrZoneLevel;
import com.xiaomi.fitness.baseui.dialog.DriftDialog;
import com.xiaomi.fitness.baseui.notch.NotchScreenManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.sport_eco.ftp.ChartDataEntity;
import com.xiaomi.fitness.sport_eco.ftp.ChartViewProperty;
import com.xiaomi.fitness.sport_eco.ftp.CourseSportState;
import com.xiaomi.fitness.sport_eco.ftp.FtpActivityState;
import com.xiaomi.fitness.sport_eco.ftp.FtpChartType;
import com.xiaomi.fitness.sport_eco.ftp.FtpDeviceState;
import com.xiaomi.fitness.sport_eco.ftp.ui.FtpActivity;
import com.xiaomi.fitness.sport_eco.ftp.utils.TextTypefaceSpan;
import com.xiaomi.fitness.sport_eco_manager_export.RemindExt;
import com.xiaomi.fitness.sport_eco_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback;
import com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference;
import defpackage.cki;
import defpackage.e1j;
import defpackage.foi;
import defpackage.fvi;
import defpackage.jl0;
import defpackage.ll0;
import defpackage.lp5;
import defpackage.npi;
import defpackage.oe4;
import defpackage.pv1;
import defpackage.rvn;
import defpackage.tr9;
import defpackage.wc0;
import defpackage.zri;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u0086\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0086\u0001B\b¢\u0006\u0005\b\u0085\u0001\u0010\nJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\nJ\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\nJ\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\nJ\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\nJ\u000f\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\nJ\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J'\u0010'\u001a\u00020&2\u0006\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0004H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b)\u0010\bJ\u000f\u0010*\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010\nJ\u000f\u0010+\u001a\u00020\u0006H\u0002¢\u0006\u0004\b+\u0010\nJ\u000f\u0010,\u001a\u00020\u0006H\u0002¢\u0006\u0004\b,\u0010\nJ\u000f\u0010-\u001a\u00020\u0006H\u0002¢\u0006\u0004\b-\u0010\nJ\u001f\u00101\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u00042\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102J\u0019\u00105\u001a\u00020\u00062\b\u00104\u001a\u0004\u0018\u000103H\u0014¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u000e¢\u0006\u0004\b7\u0010\u0010J\r\u00108\u001a\u00020\u0006¢\u0006\u0004\b8\u0010\nJ\r\u00109\u001a\u00020\u0006¢\u0006\u0004\b9\u0010\nJ\u000f\u0010:\u001a\u00020\u0006H\u0016¢\u0006\u0004\b:\u0010\nJ\u000f\u0010;\u001a\u00020\u0006H\u0014¢\u0006\u0004\b;\u0010\nJ\u000f\u0010<\u001a\u00020\u0006H\u0014¢\u0006\u0004\b<\u0010\nJ\u000f\u0010=\u001a\u00020\u0006H\u0014¢\u0006\u0004\b=\u0010\nR\u0016\u0010>\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010@\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u001b\u0010G\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001b\u0010K\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010D\u001a\u0004\bI\u0010JR\u001b\u0010P\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010D\u001a\u0004\bN\u0010OR\u0016\u0010Q\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010AR\u0016\u0010R\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010U\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010X\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010Z\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010SR#\u0010`\u001a\n \\*\u0004\u0018\u00010[0[8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010D\u001a\u0004\b^\u0010_R\u0018\u0010b\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010d\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010AR\u0016\u0010e\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010?R\u0016\u0010f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010AR\u0016\u0010h\u001a\u00020g8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010k\u001a\u0004\u0018\u00010j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR#\u0010p\u001a\n \\*\u0004\u0018\u00010j0j8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bm\u0010D\u001a\u0004\bn\u0010oR\u0018\u0010r\u001a\u0004\u0018\u00010q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u001b\u0010x\u001a\u00020t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bu\u0010D\u001a\u0004\bv\u0010wR\u001b\u0010|\u001a\u00020q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\by\u0010D\u001a\u0004\bz\u0010{R\u0014\u0010}\u001a\u00020t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0016\u0010\u007f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010SR\u0018\u0010\u0080\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010AR\u0016\u0010\u0082\u0001\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010JR\u0016\u0010\u0084\u0001\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010J¨\u0006\u008a\u0001²\u0006\u0017\u0010\u0088\u0001\u001a\f \\*\u0005\u0018\u00010\u0087\u00010\u0087\u00018\nX\u008a\u0084\u0002²\u0006\u0017\u0010\u0089\u0001\u001a\f \\*\u0005\u0018\u00010\u0087\u00010\u0087\u00018\nX\u008a\u0084\u0002"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/ftp/ui/FtpActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/sport_eco/ftp/ui/FtpActivityViewModel;", "Lll0;", "", "duration", "", "setDuration", "(I)V", "showTimeTooShortDialog", "()V", "hr", "checkHr", "checkHrWithZero", "", "abnormalHeartRate", "()Z", "Lcom/xiaomi/fitness/sport_eco/ftp/FtpDeviceState;", "state", "setDeviceStatus", "(Lcom/xiaomi/fitness/sport_eco/ftp/FtpDeviceState;)V", "addObserver", "updateFtpTiltle", "quit", "initData", "initClickEvent", "islink", "setLinkSrc", "(Z)V", "", "key", "", "value", "setConcernData", "(Ljava/lang/String;F)V", "fullStr", "valueLength", "txtSize", "Landroid/text/SpannableStringBuilder;", "buildSpan", "(Ljava/lang/String;II)Landroid/text/SpannableStringBuilder;", "setHrLabel", "startSport", "pauseSport", "resumeSport", "showCountDownAnimation", "num", "", "milliseconds", "countDownTime", "(IJ)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "isSendCmd", "showStopDialog", "finishFtp", "onBackPressed", LifecycleConstantKt.ON_RESUME, LifecycleConstantKt.ON_STOP, LifecycleConstantKt.ON_DESTROY, "startTime", "J", DailyRecordKey.sportType, "I", "Lcom/xiaomi/fitness/account/HrZone;", "hrZone$delegate", "Lkotlin/Lazy;", "getHrZone", "()Lcom/xiaomi/fitness/account/HrZone;", "hrZone", "hrWarnLimit$delegate", "getHrWarnLimit", "()I", "hrWarnLimit", "Landroid/view/View;", "decoderView$delegate", "getDecoderView", "()Landroid/view/View;", "decoderView", "distance", "supportDeviceLink", "Z", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "report", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "Ljava/text/SimpleDateFormat;", "mDurationFormat", "Ljava/text/SimpleDateFormat;", "isPause", "Lcom/airbnb/lottie/LottieAnimationView;", "kotlin.jvm.PlatformType", "countDownLottieView$delegate", "getCountDownLottieView", "()Lcom/airbnb/lottie/LottieAnimationView;", "countDownLottieView", "Landroid/os/CountDownTimer;", "timer", "Landroid/os/CountDownTimer;", "count", "startToastTime", "mBelowTarget", "Ltr9;", "mFtpTargetValue", "Ltr9;", "Landroid/graphics/Typeface;", "typeFace", "Landroid/graphics/Typeface;", "unitTypeFace$delegate", "getUnitTypeFace", "()Landroid/graphics/Typeface;", "unitTypeFace", "Lcom/xiaomi/fitness/baseui/dialog/DriftDialog;", "disConnectDialog", "Lcom/xiaomi/fitness/baseui/dialog/DriftDialog;", "Ljava/lang/Runnable;", "disconnectRunnable$delegate", "getDisconnectRunnable", "()Ljava/lang/Runnable;", "disconnectRunnable", "hrWarnDialog$delegate", "getHrWarnDialog", "()Lcom/xiaomi/fitness/baseui/dialog/DriftDialog;", "hrWarnDialog", "hrWarnRunnable", "Ljava/lang/Runnable;", "hrWarnIn", "mCurrentHr", "getLayoutId", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "Landroid/widget/TextView;", "curDeviceView", "sportDeviceView", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nFtpActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FtpActivity.kt\ncom/xiaomi/fitness/sport_eco/ftp/ui/FtpActivity\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,770:1\n13402#2,2:771\n*S KotlinDebug\n*F\n+ 1 FtpActivity.kt\ncom/xiaomi/fitness/sport_eco/ftp/ui/FtpActivity\n*L\n438#1:771,2\n*E\n"})
public final class FtpActivity extends Hilt_FtpActivity<FtpActivityViewModel, ll0> {

    @NotNull
    public static final String DATA_BLEW_TARGET = "target";

    @NotNull
    public static final String DATA_CALORIE = "calorie";

    @NotNull
    public static final String DATA_DISTANCE = "distance";

    @NotNull
    public static final String DATA_HRM = "hrm";

    @NotNull
    public static final String DATA_POWER = "power";

    @NotNull
    public static final String DATA_RESISTANCE = "resistance";

    @NotNull
    public static final String DATA_RPM = "rpm";

    @NotNull
    private static final String TAG = "FtpActivity";
    public static final long TIMEOUT = 10000;
    private int count;

    @Nullable
    private DriftDialog disConnectDialog;
    private int distance;
    private boolean hrWarnIn;
    private boolean isPause;
    private int mBelowTarget;
    private int mCurrentHr;
    private tr9 mFtpTargetValue;

    @Nullable
    private SportBasicReport report;
    private int sportType;
    private long startTime;
    private long startToastTime;

    @Nullable
    private CountDownTimer timer;

    /* JADX INFO: renamed from: hrZone$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy hrZone = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: jqa
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FtpActivity.hrZone_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: hrWarnLimit$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy hrWarnLimit = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: kqa
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(FtpActivity.hrWarnLimit_delegate$lambda$1(this.f24189a));
        }
    });

    /* JADX INFO: renamed from: decoderView$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy decoderView = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: lqa
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FtpActivity.decoderView_delegate$lambda$2(this.f25351a);
        }
    });
    private boolean supportDeviceLink = true;

    @NotNull
    private final SimpleDateFormat mDurationFormat = new SimpleDateFormat(StringUtils.EXPECT_TIME_FORMAT);

    /* JADX INFO: renamed from: countDownLottieView$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy countDownLottieView = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: mqa
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FtpActivity.countDownLottieView_delegate$lambda$3(this.f27097a);
        }
    });

    @Nullable
    private final Typeface typeFace = DisplayUtil.getTypefaceAsResourceId(AppUtil.getApp(), npi.f28231a);

    /* JADX INFO: renamed from: unitTypeFace$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy unitTypeFace = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ipa
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FtpActivity.unitTypeFace_delegate$lambda$4(this.f21973a);
        }
    });

    /* JADX INFO: renamed from: disconnectRunnable$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy disconnectRunnable = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: jpa
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FtpActivity.disconnectRunnable_delegate$lambda$10(this.f23002a);
        }
    });

    /* JADX INFO: renamed from: hrWarnDialog$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy hrWarnDialog = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: kpa
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FtpActivity.hrWarnDialog_delegate$lambda$13(this.f24134a);
        }
    });

    @NotNull
    private final Runnable hrWarnRunnable = new Runnable() { // from class: lpa
        @Override // java.lang.Runnable
        public final void run() {
            FtpActivity.hrWarnRunnable$lambda$14(this.f25296a);
        }
    };

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

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_eco.ftp.ui.FtpActivity$quit$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport_eco.ftp.ui.FtpActivity$quit$1", f = "FtpActivity.kt", i = {}, l = {496}, m = "invokeSuspend", n = {}, s = {})
    public static final class C31021 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C31021(Continuation<? super C31021> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FtpActivity.this.new C31021(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.delay(VibrateModeProgressBar.sLongToLong, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            FtpActivity.this.dismissDialog();
            FtpActivity.this.finish();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C31021) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_eco.ftp.ui.FtpActivity$startSport$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport_eco.ftp.ui.FtpActivity$startSport$2", f = "FtpActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FtpActivity.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FtpActivity.this.showCountDownAnimation();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final boolean abnormalHeartRate() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ ll0 access$getMBinding(FtpActivity ftpActivity) {
        return (ll0) ftpActivity.getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ FtpActivityViewModel access$getMViewModel(FtpActivity ftpActivity) {
        return (FtpActivityViewModel) ftpActivity.getMViewModel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void addObserver() {
        ((FtpActivityViewModel) getMViewModel()).getMDeviceState().observe(this, new FtpActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: upa
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FtpActivity.addObserver$lambda$25(this.f35996a, (FtpDeviceState) obj);
            }
        }));
        ((FtpActivityViewModel) getMViewModel()).getMSportState().observe(this, new FtpActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: vpa
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FtpActivity.addObserver$lambda$26(this.f37103a, (CourseSportState) obj);
            }
        }));
        ((FtpActivityViewModel) getMViewModel()).getMPhoneSportData().observe(this, new FtpActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: wpa
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FtpActivity.addObserver$lambda$28(this.f38210a, (PhoneSportData) obj);
            }
        }));
        ((FtpActivityViewModel) getMViewModel()).checkDeviceStatus();
        ((FtpActivityViewModel) getMViewModel()).setOnSecondTick(new Function1() { // from class: xpa
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FtpActivity.addObserver$lambda$29(((Long) obj).longValue());
            }
        });
        ((FtpActivityViewModel) getMViewModel()).getRecordEmitter().observe(this, new FtpActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ypa
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FtpActivity.addObserver$lambda$31(this.f40394a, (SportBasicReport) obj);
            }
        }));
        ((FtpActivityViewModel) getMViewModel()).getLineChartDataEmitter().observe(this, new Observer() { // from class: zpa
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                FtpActivity.addObserver$lambda$32(this.f41543a, (ChartViewProperty) obj);
            }
        });
        ((FtpActivityViewModel) getMViewModel()).getTitleEmitter().observe(this, new Observer() { // from class: aqa
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                FtpActivity.addObserver$lambda$33(this.f3352a, (String) obj);
            }
        });
        ((FtpActivityViewModel) getMViewModel()).getStateData().observe(this, new FtpActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: bqa
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FtpActivity.addObserver$lambda$36(this.f4481a, (FtpActivityState) obj);
            }
        }));
        MutableLiveData<oe4> connectEcoState = ((FtpActivityViewModel) getMViewModel()).getConnectEcoState();
        if (connectEcoState != null) {
            connectEcoState.observe(this, new FtpActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: cqa
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return FtpActivity.addObserver$lambda$37(this.f14614a, (oe4) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addObserver$lambda$25(final FtpActivity this$0, final FtpDeviceState ftpDeviceState) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (ftpDeviceState != null) {
            this$0.setDeviceStatus(ftpDeviceState);
            if (!this$0.supportDeviceLink) {
                return Unit.INSTANCE;
            }
            if (ftpDeviceState.getSportConnect()) {
                DriftDialog driftDialog = this$0.disConnectDialog;
                if (driftDialog != null && driftDialog.isVisible()) {
                    driftDialog.dismiss();
                }
                this$0.disConnectDialog = null;
                this$0.getDecoderView().removeCallbacks(this$0.getDisconnectRunnable());
            } else {
                DriftDialog driftDialog2 = this$0.disConnectDialog;
                if (driftDialog2 == null || driftDialog2 == null || !driftDialog2.isVisible()) {
                    this$0.getDecoderView().removeCallbacks(this$0.getDisconnectRunnable());
                    this$0.disConnectDialog = new DriftDialog.Builder().setLayoutRes(fvi.d).addClickIds(zri.X0, zri.O1).setOnViewClick(new Function2() { // from class: rpa
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return FtpActivity.addObserver$lambda$25$lambda$24$lambda$22(this.f32769a, (View) obj, (DriftDialog) obj2);
                        }
                    }).setOnViewBind(new Function1() { // from class: tpa
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return FtpActivity.addObserver$lambda$25$lambda$24$lambda$23(this.f34912a, ftpDeviceState, (View) obj);
                        }
                    }).setCanceledOnTouchOutside(false).create();
                    this$0.getDecoderView().postDelayed(this$0.getDisconnectRunnable(), 60000L);
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addObserver$lambda$25$lambda$24$lambda$22(FtpActivity this$0, View view, DriftDialog dialog) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        int id = view.getId();
        if (id == zri.X0) {
            dialog.dismiss();
            FitnessLogUtils.d(TAG, "onDeviceStatusChange finishCourse");
            this$0.finishFtp();
        } else if (id == zri.O1) {
            dialog.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addObserver$lambda$25$lambda$24$lambda$23(FtpActivity this$0, FtpDeviceState this_run, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_run, "$this_run");
        Intrinsics.checkNotNullParameter(view, "view");
        jl0 jl0VarA0 = jl0.A0(view);
        TextView textView = jl0VarA0.E;
        String string = this$0.getString(e1j.course_audio_dialog_disconnect_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String str = String.format(string, Arrays.copyOf(new Object[]{this_run.getSportName()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        textView.setText(str);
        String string2 = this$0.getString(e1j.course_audio_dialog_disconnect_content);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String str2 = String.format(string2, Arrays.copyOf(new Object[]{this_run.getSportName()}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        jl0VarA0.A.setText(str2);
        jl0VarA0.B.setText(this$0.getString(e1j.course_got_it));
        TextView rightButton = jl0VarA0.D;
        Intrinsics.checkNotNullExpressionValue(rightButton, "rightButton");
        ViewExtKt.gone(rightButton);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit addObserver$lambda$26(FtpActivity this$0, CourseSportState courseSportState) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (courseSportState instanceof CourseSportState.Finish) {
            CourseSportState.Finish finish = (CourseSportState.Finish) courseSportState;
            FitnessLogUtils.d(TAG, "onSportFinished validSport==" + finish.getValidSport());
            if (finish.getValidSport()) {
                this$0.showLoading(e1j.g, false);
            } else {
                this$0.quit();
            }
        } else if (Intrinsics.areEqual(courseSportState, CourseSportState.Restart.INSTANCE)) {
            FitnessLogUtils.d(TAG, "onSportRestarted");
            this$0.isPause = false;
            rvn.Y(this$0).K();
        } else if (Intrinsics.areEqual(courseSportState, CourseSportState.Pause.INSTANCE)) {
            FitnessLogUtils.d(TAG, "onSportPaused");
            this$0.isPause = true;
            rvn.Y(this$0).I();
        } else if (courseSportState instanceof CourseSportState.Start) {
            this$0.startTime = ((FtpActivityViewModel) this$0.getMViewModel()).getStartTime();
            FitnessLogUtils.d(TAG, "onSportStarted");
        } else {
            if (!Intrinsics.areEqual(courseSportState, CourseSportState.Idle.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            FitnessLogUtils.d(TAG, "Idle");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit addObserver$lambda$28(FtpActivity this$0, PhoneSportData phoneSportData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (phoneSportData != null) {
            this$0.distance = phoneSportData.distance;
            this$0.mBelowTarget = phoneSportData.bike_below_target;
            this$0.setHrLabel(phoneSportData.heart_rate);
            this$0.checkHr(phoneSportData.heart_rate);
            this$0.setDuration((int) phoneSportData.deviceDuration);
            ((FtpActivityViewModel) this$0.getMViewModel()).setMinute((int) phoneSportData.deviceDuration);
            float f = phoneSportData.bike_power;
            this$0.setConcernData("resistance", phoneSportData.bike_resistance_level);
            this$0.setConcernData("calorie", phoneSportData.calorie / 1000);
            this$0.setConcernData("power", phoneSportData.bike_power);
            this$0.setConcernData("rpm", phoneSportData.bike_rpm);
            this$0.setConcernData("target", phoneSportData.bike_below_target);
            if (Intrinsics.areEqual(((FtpActivityViewModel) this$0.getMViewModel()).getLineChartType(), FtpChartType.TIME.getItem())) {
                ((ll0) this$0.getMBinding()).c0.updateData(new ChartDataEntity(phoneSportData.deviceDuration / 60, f));
            } else {
                ((ll0) this$0.getMBinding()).c0.updateData(new ChartDataEntity(phoneSportData.deviceDuration / 60, f));
            }
            if (phoneSportData.bike_below_target != 0) {
                if (this$0.startToastTime == 0) {
                    this$0.startToastTime = System.currentTimeMillis();
                }
                if (System.currentTimeMillis() - this$0.startToastTime >= 5000) {
                    this$0.updateFtpTiltle();
                    ToastUtil.showShortToast(this$0.getString(e1j.K1));
                    this$0.startToastTime = 0L;
                }
            } else {
                this$0.updateFtpTiltle();
                this$0.startToastTime = 0L;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addObserver$lambda$29(long j) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addObserver$lambda$31(FtpActivity this$0, SportBasicReport sportBasicReport) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (sportBasicReport == null || sportBasicReport.getDuration() < 120) {
            this$0.quit();
        } else {
            this$0.report = sportBasicReport;
            Bundle bundle = new Bundle();
            int iA = lp5.a(sportBasicReport);
            bundle.putLong("time_stamp", sportBasicReport.getTimeStamp());
            bundle.putSerializable("sport_report", sportBasicReport);
            bundle.putInt("sport_type", iA);
            Intent intent = new Intent(this$0, (Class<?>) FtpTestResultActivity.class);
            intent.putExtras(bundle);
            this$0.dismissDialog();
            this$0.startActivity(intent);
            this$0.finish();
            FitnessLogUtils.d(TAG, "有效数据:" + this$0.report);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void addObserver$lambda$32(FtpActivity this$0, ChartViewProperty chartViewProperty) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((ll0) this$0.getMBinding()).c0.initRecommendData(chartViewProperty.getRecommendList());
        String type = chartViewProperty.getType();
        FtpChartType ftpChartType = FtpChartType.TIME;
        if (Intrinsics.areEqual(type, ftpChartType.getItem())) {
            ((ll0) this$0.getMBinding()).c0.setXType(ftpChartType, chartViewProperty.getMaxValueX());
        } else {
            ((ll0) this$0.getMBinding()).c0.setXType(FtpChartType.DISTANCE, chartViewProperty.getMaxValueX());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void addObserver$lambda$33(FtpActivity this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((ll0) this$0.getMBinding()).D.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit addObserver$lambda$36(FtpActivity this$0, FtpActivityState ftpActivityState) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (ftpActivityState != null) {
            if (!(ftpActivityState.getMFtpTarget().length == 0)) {
                ArrayList<ChartDataEntity> arrayList = new ArrayList<>();
                float f = 0.0f;
                for (tr9 tr9Var : ftpActivityState.getMFtpTarget()) {
                    arrayList.add(new ChartDataEntity(f, tr9Var.f));
                    if (ftpActivityState.getMinute() == ((int) f)) {
                        this$0.mFtpTargetValue = tr9Var;
                        this$0.updateFtpTiltle();
                        ((ll0) this$0.getMBinding()).j0.setText(this$0.getString(e1j.z4) + " " + tr9Var.f + Constants.DEVICE_TYPE_WEAR);
                        ((ll0) this$0.getMBinding()).i0.setText(this$0.getString(e1j.z4) + " " + tr9Var.g);
                    }
                    f += tr9Var.d;
                }
                ((ll0) this$0.getMBinding()).c0.initRecommendData(arrayList);
            }
            FitnessLogUtils.d(TAG, "minute=" + ftpActivityState.getMinute());
            ((ll0) this$0.getMBinding()).G.setText(this$0.getResources().getString(ftpActivityState.getMinute() >= 2 ? e1j.L1 : e1j.course_hr_distribute_warm_up));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addObserver$lambda$37(FtpActivity this$0, oe4 oe4Var) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!oe4Var.b()) {
            this$0.showLoading();
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$0), null, null, new FtpActivity$addObserver$9$1(this$0, null), 3, null);
        }
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

    private final void checkHr(int hr) {
        if (hr > 0) {
            this.mCurrentHr = hr;
        }
        if (hr > getHrWarnLimit()) {
            if (this.hrWarnIn) {
                return;
            }
            this.hrWarnIn = true;
            getWindow().getDecorView().postDelayed(this.hrWarnRunnable, 3000L);
            return;
        }
        if (this.hrWarnIn) {
            getWindow().getDecorView().removeCallbacks(this.hrWarnRunnable);
            if (getHrWarnDialog().isVisible()) {
                getHrWarnDialog().dismiss();
            }
            this.hrWarnIn = false;
        }
    }

    private final void checkHrWithZero(int hr) {
        if (hr > 0) {
            this.mCurrentHr = hr;
        }
        if (1 > hr || hr > getHrWarnLimit()) {
            if (this.hrWarnIn) {
                return;
            }
            this.hrWarnIn = true;
            getWindow().getDecorView().postDelayed(this.hrWarnRunnable, 3000L);
            return;
        }
        getWindow().getDecorView().removeCallbacks(this.hrWarnRunnable);
        if (getHrWarnDialog().isVisible()) {
            getHrWarnDialog().dismiss();
        }
        this.hrWarnIn = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LottieAnimationView countDownLottieView_delegate$lambda$3(FtpActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return (LottieAnimationView) this$0.findViewById(zri.C);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void countDownTime(int num, long milliseconds) {
        this.count = num;
        CountDownTimer countDownTimer = new CountDownTimer(milliseconds, ((long) num) * milliseconds) { // from class: com.xiaomi.fitness.sport_eco.ftp.ui.FtpActivity.countDownTime.1
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
    public static final View decoderView_delegate$lambda$2(FtpActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getWindow().getDecorView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Runnable disconnectRunnable_delegate$lambda$10(final FtpActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new Runnable() { // from class: mpa
            @Override // java.lang.Runnable
            public final void run() {
                FtpActivity.disconnectRunnable_delegate$lambda$10$lambda$9(this.f27066a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void disconnectRunnable_delegate$lambda$10$lambda$9(FtpActivity this$0) {
        DriftDialog driftDialog;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isFinishing() || (driftDialog = this$0.disConnectDialog) == null) {
            return;
        }
        FragmentManager supportFragmentManager = this$0.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        driftDialog.show(supportFragmentManager);
    }

    private final LottieAnimationView getCountDownLottieView() {
        return (LottieAnimationView) this.countDownLottieView.getValue();
    }

    private final View getDecoderView() {
        return (View) this.decoderView.getValue();
    }

    private final Runnable getDisconnectRunnable() {
        return (Runnable) this.disconnectRunnable.getValue();
    }

    private final DriftDialog getHrWarnDialog() {
        return (DriftDialog) this.hrWarnDialog.getValue();
    }

    private final int getHrWarnLimit() {
        return ((Number) this.hrWarnLimit.getValue()).intValue();
    }

    private final HrZone getHrZone() {
        return (HrZone) this.hrZone.getValue();
    }

    private final Typeface getUnitTypeFace() {
        return (Typeface) this.unitTypeFace.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DriftDialog hrWarnDialog_delegate$lambda$13(final FtpActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        DriftDialog.Builder layoutRes = new DriftDialog.Builder().setLayoutRes(fvi.course_layout_alert);
        UIUtils uIUtils = UIUtils.INSTANCE;
        Application application = this$0.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
        return DriftDialog.Builder.setGravity$default(layoutRes.setWidth(uIUtils.dip2px(application, 187.0f)), 17, 0, 0, 6, null).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: hqa
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                FtpActivity.hrWarnDialog_delegate$lambda$13$lambda$11(this.f20339a, dialogInterface);
            }
        }).setOnViewBind(new Function1() { // from class: iqa
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FtpActivity.hrWarnDialog_delegate$lambda$13$lambda$12(this.f21993a, (View) obj);
            }
        }).create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hrWarnDialog_delegate$lambda$13$lambda$11(FtpActivity this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hrWarnIn = false;
        this$0.getWindow().getDecorView().removeCallbacks(this$0.hrWarnRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit hrWarnDialog_delegate$lambda$13$lambda$12(FtpActivity this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        ((TextView) it.findViewById(zri.o1)).setText(this$0.getString(e1j.course_hr_warning));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int hrWarnLimit_delegate$lambda$1(FtpActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getHrZone().getMaxHr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hrWarnRunnable$lambda$14(FtpActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.abnormalHeartRate()) {
            DriftDialog hrWarnDialog = this$0.getHrWarnDialog();
            FragmentManager supportFragmentManager = this$0.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            hrWarnDialog.show(supportFragmentManager);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HrZone hrZone_delegate$lambda$0() {
        return new HrZone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initClickEvent() {
        ((ll0) getMBinding()).C.setOnClickListener(new View.OnClickListener() { // from class: hpa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FtpActivity.initClickEvent$lambda$38(this.f20312a, view);
            }
        });
        ((ll0) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: spa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FtpActivity.initClickEvent$lambda$39(this.f33856a, view);
            }
        });
        ((ll0) getMBinding()).B.setOnClickListener(new View.OnClickListener() { // from class: dqa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FtpActivity.initClickEvent$lambda$40(this.f15811a, view);
            }
        });
        ((ll0) getMBinding()).Z.setOnClickListener(new View.OnClickListener() { // from class: gqa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FtpActivity.initClickEvent$lambda$41(this.f19232a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initClickEvent$lambda$38(FtpActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (((FtpActivityViewModel) this$0.getMViewModel()).isSportValid()) {
            this$0.showStopDialog();
        } else {
            this$0.showTimeTooShortDialog();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickEvent$lambda$39(FtpActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.resumeSport();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickEvent$lambda$40(FtpActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.pauseSport();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initClickEvent$lambda$41(FtpActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setLinkSrc(true);
        ((FtpActivityViewModel) this$0.getMViewModel()).setCmdEnable(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initData() {
        this.mDurationFormat.setTimeZone(TimeZone.getTimeZone("GMT+00:00"));
        ((ll0) getMBinding()).E.setText(getString(e1j.L1));
        ((FtpActivityViewModel) getMViewModel()).initAudioSegment(null);
        setConcernData("resistance", 0.0f);
        setConcernData("calorie", 0.0f);
        setConcernData("power", 0.0f);
        setConcernData("rpm", 0.0f);
        ((ll0) getMBinding()).O.setSelected(false);
        ((ll0) getMBinding()).Q.setSelected(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void pauseSport() {
        FitnessLogUtils.d(TAG, "pauseSport");
        ((FtpActivityViewModel) getMViewModel()).pauseSport(this.sportType, new RequestCallback() { // from class: com.xiaomi.fitness.sport_eco.ftp.ui.FtpActivity.pauseSport.1
            @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback
            public void call(int responseCode) {
                FitnessLogUtils.d(FtpActivity.TAG, "pauseSport resultCode=" + responseCode);
            }
        });
    }

    private final void quit() {
        showLoading();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C31021(null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void resumeSport() {
        FitnessLogUtils.d(TAG, "resumeSport");
        ((FtpActivityViewModel) getMViewModel()).resumeSport(this.sportType, new RequestCallback() { // from class: com.xiaomi.fitness.sport_eco.ftp.ui.FtpActivity.resumeSport.1
            @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback
            public void call(int responseCode) {
                FitnessLogUtils.d(FtpActivity.TAG, "resumeSport resultCode=" + responseCode);
            }
        });
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    private final void setConcernData(String key, float value) {
        switch (key.hashCode()) {
            case 113135:
                if (key.equals("rpm")) {
                    int i = (int) value;
                    ((ll0) getMBinding()).H.setText(buildSpan(i + "\n" + getString(e1j.M), String.valueOf(i).length(), 30));
                    break;
                }
                break;
            case 106858757:
                if (key.equals("power")) {
                    ((ll0) getMBinding()).a0.setText(buildSpan(value + "W\n" + getString(e1j.F2), String.valueOf(value).length() + 1, 30));
                    break;
                }
                break;
            case 548738829:
                if (key.equals("calorie")) {
                    int i2 = (int) value;
                    ((ll0) getMBinding()).T.setText(buildSpan(i2 + "\n" + getString(e1j.course_calorie_label), String.valueOf(i2).length(), 30));
                    break;
                }
                break;
            case 1863800889:
                if (key.equals("resistance")) {
                    int i3 = (int) value;
                    ((ll0) getMBinding()).b0.setText(buildSpan(i3 + "\n" + getString(e1j.R2), String.valueOf(i3).length(), 30));
                    break;
                }
                break;
        }
    }

    private final void setDeviceStatus(FtpDeviceState state) {
        String str;
        String str2;
        FitnessLogUtils.d(TAG, "setDeviceStatus:" + state);
        Lazy lazy = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: eqa
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FtpActivity.setDeviceStatus$lambda$15(this.f16957a);
            }
        });
        Lazy lazy2 = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: fqa
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FtpActivity.setDeviceStatus$lambda$17(this.f18080a);
            }
        });
        TextView deviceStatus$lambda$16 = setDeviceStatus$lambda$16(lazy);
        if (deviceStatus$lambda$16 != null) {
            if (state.getWearHas()) {
                ViewExtKt.visible(deviceStatus$lambda$16);
                if (state.getWearConnect()) {
                    String string = getString(e1j.course_device_connect);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    str2 = String.format(string, Arrays.copyOf(new Object[]{state.getWearName()}, 1));
                    Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                } else {
                    String string2 = getString(e1j.course_device_disconnect);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    str2 = String.format(string2, Arrays.copyOf(new Object[]{state.getWearName()}, 1));
                    Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                }
                deviceStatus$lambda$16.setText(str2);
            } else {
                ViewExtKt.invisible(deviceStatus$lambda$16);
            }
        }
        TextView deviceStatus$lambda$18 = setDeviceStatus$lambda$18(lazy2);
        if (deviceStatus$lambda$18 != null) {
            if (!state.getSportHas()) {
                ViewExtKt.invisible(deviceStatus$lambda$18);
                return;
            }
            ViewExtKt.visible(deviceStatus$lambda$18);
            if (state.getSportConnect()) {
                String string3 = getString(e1j.course_device_connect);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                str = String.format(string3, Arrays.copyOf(new Object[]{state.getSportName()}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            } else {
                String string4 = getString(e1j.course_device_disconnect);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                str = String.format(string4, Arrays.copyOf(new Object[]{state.getSportName()}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            }
            deviceStatus$lambda$18.setText(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView setDeviceStatus$lambda$15(FtpActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return (TextView) this$0.findViewById(zri.D);
    }

    private static final TextView setDeviceStatus$lambda$16(Lazy<? extends TextView> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView setDeviceStatus$lambda$17(FtpActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return (TextView) this$0.findViewById(zri.h2);
    }

    private static final TextView setDeviceStatus$lambda$18(Lazy<? extends TextView> lazy) {
        return lazy.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setDuration(int duration) {
        if (duration < 0) {
            return;
        }
        ((ll0) getMBinding()).h0.setText(TimeDateUtil.getTimeStrWithSecDef(duration));
        ((ll0) getMBinding()).g0.setText("(" + ((duration * 100) / 1200) + "%)");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setHrLabel(int hr) {
        ((ll0) getMBinding()).S.setText(hr <= 0 ? "--" : String.valueOf(hr));
        HrZoneLevel hrZone = getHrZone().getHrZone(hr);
        ((ll0) getMBinding()).U.setBackgroundColor(getResources().getColor(cki.f5430b));
        ((ll0) getMBinding()).V.setBackgroundColor(getResources().getColor(cki.f5430b));
        ((ll0) getMBinding()).W.setBackgroundColor(getResources().getColor(cki.f5430b));
        ((ll0) getMBinding()).X.setBackgroundColor(getResources().getColor(cki.f5430b));
        ((ll0) getMBinding()).Y.setBackgroundColor(getResources().getColor(cki.f5430b));
        switch (WhenMappings.$EnumSwitchMapping$0[hrZone.ordinal()]) {
            case 1:
            case 2:
                ((ll0) getMBinding()).U.setBackgroundColor(getResources().getColor(cki.common_textcolor_1));
                ((ll0) getMBinding()).G.setText(getResources().getString(e1j.course_hr_distribute_warm_up));
                return;
            case 3:
                ((ll0) getMBinding()).V.setBackgroundColor(getResources().getColor(cki.common_textcolor_1));
                ((ll0) getMBinding()).G.setText(getResources().getString(e1j.course_hr_distribute_fat_burn));
                return;
            case 4:
                ((ll0) getMBinding()).W.setBackgroundColor(getResources().getColor(cki.common_textcolor_1));
                ((ll0) getMBinding()).G.setText(getResources().getString(e1j.course_hr_distribute_aerobic));
                return;
            case 5:
                ((ll0) getMBinding()).X.setBackgroundColor(getResources().getColor(cki.common_textcolor_1));
                ((ll0) getMBinding()).G.setText(getResources().getString(e1j.course_hr_distribute_anaerobic));
                return;
            case 6:
                ((ll0) getMBinding()).Y.setBackgroundColor(getResources().getColor(cki.common_textcolor_1));
                ((ll0) getMBinding()).G.setText(getResources().getString(e1j.course_hr_distribute_acme));
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setLinkSrc(boolean islink) {
        if (islink) {
            ((ll0) getMBinding()).Z.setImageResource(foi.course_audio_link_open);
        } else {
            ((ll0) getMBinding()).Z.setImageResource(foi.course_audio_link_close);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showCountDownAnimation() {
        final LottieAnimationView countDownLottieView = getCountDownLottieView();
        if (countDownLottieView != null) {
            countDownLottieView.setVisibility(0);
            countDownLottieView.w();
            countDownLottieView.i(new Animator.AnimatorListener() { // from class: com.xiaomi.fitness.sport_eco.ftp.ui.FtpActivity$showCountDownAnimation$1$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    countDownLottieView.setVisibility(8);
                    ImageView audioStopIv = FtpActivity.access$getMBinding(this).C;
                    Intrinsics.checkNotNullExpressionValue(audioStopIv, "audioStopIv");
                    ViewExtKt.visible(audioStopIv);
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    this.countDownTime(3, 900L);
                    ImageView audioStopIv = FtpActivity.access$getMBinding(this).C;
                    Intrinsics.checkNotNullExpressionValue(audioStopIv, "audioStopIv");
                    ViewExtKt.gone(audioStopIv);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showStopDialog$lambda$7(FtpActivity this$0, View view, DriftDialog dialog) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        int id = view.getId();
        if (id == zri.X0) {
            dialog.dismiss();
            FitnessLogUtils.d(TAG, "showStopDialog finishFTP");
            this$0.finishFtp();
        } else if (id == zri.O1) {
            dialog.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showStopDialog$lambda$8(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        jl0 jl0VarA0 = jl0.A0(view);
        jl0VarA0.E.setText(e1j.course_stop_title);
        jl0VarA0.A.setText(e1j.course_stop_desc);
        jl0VarA0.B.setText(e1j.course_dialog_finish);
        jl0VarA0.D.setText(e1j.course_continue);
        return Unit.INSTANCE;
    }

    private final void showTimeTooShortDialog() {
        DriftDialog driftDialogCreate = new DriftDialog.Builder().setLayoutRes(fvi.d).addClickIds(zri.X0, zri.O1).setOnViewClick(new Function2() { // from class: ppa
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FtpActivity.showTimeTooShortDialog$lambda$5(this.f30605a, (View) obj, (DriftDialog) obj2);
            }
        }).setOnViewBind(new Function1() { // from class: qpa
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FtpActivity.showTimeTooShortDialog$lambda$6((View) obj);
            }
        }).setCanceledOnTouchOutside(false).create();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        driftDialogCreate.show(supportFragmentManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showTimeTooShortDialog$lambda$5(FtpActivity this$0, View view, DriftDialog dialog) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        int id = view.getId();
        if (id == zri.X0) {
            dialog.dismiss();
            FitnessLogUtils.d(TAG, "showTimeTooShortDialog finishCourse");
            this$0.finishFtp();
        } else if (id == zri.O1) {
            dialog.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showTimeTooShortDialog$lambda$6(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        jl0 jl0VarA0 = jl0.A0(view);
        jl0VarA0.E.setText(e1j.course_stop);
        jl0VarA0.A.setText(e1j.course_too_short);
        jl0VarA0.B.setText(e1j.course_dialog_finish);
        jl0VarA0.D.setText(e1j.course_continue);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void startSport() {
        ((FtpActivityViewModel) getMViewModel()).setGymFtpTest(true, new RequestCallback() { // from class: com.xiaomi.fitness.sport_eco.ftp.ui.FtpActivity.startSport.1
            @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback
            public void call(int responseCode) {
                FtpActivityViewModel ftpActivityViewModelAccess$getMViewModel = FtpActivity.access$getMViewModel(FtpActivity.this);
                final FtpActivity ftpActivity = FtpActivity.this;
                ftpActivityViewModelAccess$getMViewModel.startLocalSport(new RequestCallback() { // from class: com.xiaomi.fitness.sport_eco.ftp.ui.FtpActivity$startSport$1$call$1
                    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback
                    public void call(int responseCode2) {
                        FitnessLogUtils.d("FtpActivity", "startLocalSport: = " + responseCode2);
                        if (responseCode2 != 0) {
                            ToastUtil.showShortToast(e1j.course_device_abnomal);
                            ftpActivity.finish();
                            FitnessLogUtils.d("FtpActivity", "结束ftp运动");
                        }
                    }
                });
            }
        });
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass2(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Typeface unitTypeFace_delegate$lambda$4(FtpActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return Typeface.create(this$0.getString(e1j.x), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateFtpTiltle() {
        if (this.mBelowTarget != 0) {
            ((ll0) getMBinding()).D.setText(getString(e1j.K1));
            return;
        }
        TextView textView = ((ll0) getMBinding()).D;
        String string = getString(e1j.D4);
        tr9 tr9Var = this.mFtpTargetValue;
        tr9 tr9Var2 = null;
        if (tr9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFtpTargetValue");
            tr9Var = null;
        }
        int i = tr9Var.f;
        String string2 = getString(e1j.A4);
        tr9 tr9Var3 = this.mFtpTargetValue;
        if (tr9Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFtpTargetValue");
        } else {
            tr9Var2 = tr9Var3;
        }
        textView.setText(string + i + "w，" + string2 + tr9Var2.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void finishFtp() {
        if (((FtpActivityViewModel) getMViewModel()).isDeviceConnect()) {
            ((FtpActivityViewModel) getMViewModel()).finishSport(this.sportType, new RequestCallback() { // from class: com.xiaomi.fitness.sport_eco.ftp.ui.FtpActivity.finishFtp.1
                @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback
                public void call(int responseCode) {
                    FitnessLogUtils.d(FtpActivity.TAG, "结束ftp运动=" + responseCode);
                }
            });
        } else {
            finish();
            FitnessLogUtils.d(TAG, "结束ftp运动");
        }
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return fvi.e;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return pv1.f30813a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isSendCmd() {
        return Intrinsics.areEqual(((FtpActivityViewModel) getMViewModel()).getLineChartType(), FtpChartType.DISTANCE.getItem());
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
    @Override // com.xiaomi.fitness.sport_eco.ftp.ui.Hilt_FtpActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(1024, 1024);
        DisplayUtil.hideBottomUIMenu(this);
        Intent intent = getIntent();
        String stringExtra = intent != null ? intent.getStringExtra(FtpTestIntroduceActivityKt.FTP_DEVICE_MODEL) : null;
        NotchScreenManager.INSTANCE.getInstance().setDisplayInNotch(this);
        this.sportType = 7;
        FtpActivityViewModel ftpActivityViewModel = (FtpActivityViewModel) getMViewModel();
        if (stringExtra == null) {
            stringExtra = SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE();
        }
        ftpActivityViewModel.initData(stringExtra, this.sportType);
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null) {
            miuiActionBar.hide();
        }
        this.supportDeviceLink = true;
        RemindExt.INSTANCE.setSupportRemind(false);
        addObserver();
        initClickEvent();
        initData();
        startSport();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.sport_eco.ftp.ui.Hilt_FtpActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDecoderView().removeCallbacks(this.hrWarnRunnable);
        getDecoderView().removeCallbacks(getDisconnectRunnable());
        RemindExt.INSTANCE.setSupportRemind(true);
        ((FtpActivityViewModel) getMViewModel()).finishSportState();
        getCountDownLottieView().x();
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        getWindow().addFlags(128);
    }

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        getWindow().clearFlags(128);
    }

    public final void showStopDialog() {
        DriftDialog driftDialogCreate = new DriftDialog.Builder().setLayoutRes(fvi.d).addClickIds(zri.X0, zri.O1).setOnViewClick(new Function2() { // from class: npa
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FtpActivity.showStopDialog$lambda$7(this.f28226a, (View) obj, (DriftDialog) obj2);
            }
        }).setOnViewBind(new Function1() { // from class: opa
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FtpActivity.showStopDialog$lambda$8((View) obj);
            }
        }).setCanceledOnTouchOutside(false).create();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        driftDialogCreate.show(supportFragmentManager);
    }
}
