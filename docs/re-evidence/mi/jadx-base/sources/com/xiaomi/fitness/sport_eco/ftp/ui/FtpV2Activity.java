package com.xiaomi.fitness.sport_eco.ftp.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Application;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Vibrator;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.DisplayCutout;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import com.airbnb.lottie.LottieAnimationView;
import com.miui.tsmclient.util.StringUtils;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.account.HrZone;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.dialog.DriftDialog;
import com.xiaomi.fitness.baseui.notch.NotchScreenManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.sport_eco.ftp.CourseSportState;
import com.xiaomi.fitness.sport_eco.ftp.FtpActivityState;
import com.xiaomi.fitness.sport_eco.ftp.FtpDeviceState;
import com.xiaomi.fitness.sport_eco.ftp.FtpPart;
import com.xiaomi.fitness.sport_eco.ftp.ui.FtpV2Activity;
import com.xiaomi.fitness.sport_eco.ftp.utils.DeviceExceptionUtil;
import com.xiaomi.fitness.sport_eco.ftp.utils.TextTypefaceSpan;
import com.xiaomi.fitness.sport_eco.view.launch.gym.dialog.SportDeviceExceptionDialog;
import com.xiaomi.fitness.sport_eco.view.widget.CircularProgressLayout;
import com.xiaomi.fitness.sport_eco_manager_export.data.FtpStateData;
import com.xiaomi.fitness.sport_eco_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_eco_manager_export.di.SportEcoManagerExtKt;
import com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ILockListener;
import com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback;
import com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference;
import defpackage.av6;
import defpackage.cki;
import defpackage.clb;
import defpackage.e1j;
import defpackage.foi;
import defpackage.fvi;
import defpackage.jl0;
import defpackage.lp5;
import defpackage.ni4;
import defpackage.npi;
import defpackage.oe4;
import defpackage.pv1;
import defpackage.rvn;
import defpackage.tl0;
import defpackage.tr9;
import defpackage.wc0;
import defpackage.zri;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 Â\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0002Â\u0001B\b¢\u0006\u0005\bÁ\u0001\u0010\u0013J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001c\u0010\u0013J\u0019\u0010\u001f\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\"\u0010\tJ\u000f\u0010#\u001a\u00020\u0007H\u0002¢\u0006\u0004\b#\u0010\u0013J!\u0010(\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010&H\u0003¢\u0006\u0004\b(\u0010)J\u0019\u0010*\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010$H\u0003¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0007H\u0003¢\u0006\u0004\b,\u0010\u0013J\u0017\u0010.\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u000bH\u0002¢\u0006\u0004\b.\u0010/J\u001f\u00103\u001a\u00020\u00072\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\u0005H\u0002¢\u0006\u0004\b3\u00104J7\u0010;\u001a\u00020:2\u0006\u00105\u001a\u0002002\u0006\u00106\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u00052\u0006\u00108\u001a\u0002002\u0006\u00109\u001a\u000200H\u0002¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0007H\u0002¢\u0006\u0004\b=\u0010\u0013J\u000f\u0010>\u001a\u00020\u0007H\u0002¢\u0006\u0004\b>\u0010\u0013J\u000f\u0010?\u001a\u00020\u0007H\u0002¢\u0006\u0004\b?\u0010\u0013J\u000f\u0010@\u001a\u00020\u0007H\u0002¢\u0006\u0004\b@\u0010\u0013J\u000f\u0010A\u001a\u00020\u0007H\u0002¢\u0006\u0004\bA\u0010\u0013J\u001f\u0010E\u001a\u00020\u00072\u0006\u0010B\u001a\u00020\u00052\u0006\u0010D\u001a\u00020CH\u0002¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u0007H\u0002¢\u0006\u0004\bG\u0010\u0013J\u001f\u0010J\u001a\u00020\u00072\u0006\u0010H\u001a\u0002002\u0006\u0010I\u001a\u000200H\u0002¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\u0007H\u0016¢\u0006\u0004\bL\u0010\u0013J\u0019\u0010O\u001a\u00020\u00072\b\u0010N\u001a\u0004\u0018\u00010MH\u0014¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\u0007H\u0016¢\u0006\u0004\bQ\u0010\u0013J\u000f\u0010R\u001a\u00020\u0007H\u0014¢\u0006\u0004\bR\u0010\u0013J\u000f\u0010S\u001a\u00020\u0007H\u0014¢\u0006\u0004\bS\u0010\u0013J\u000f\u0010T\u001a\u00020\u0007H\u0014¢\u0006\u0004\bT\u0010\u0013J\u001f\u0010W\u001a\u00020\u00072\u0006\u0010U\u001a\u00020\u000b2\u0006\u0010V\u001a\u00020\u0005H\u0016¢\u0006\u0004\bW\u0010XJ\u0017\u0010Z\u001a\u00020\u00072\u0006\u0010Y\u001a\u00020\u000bH\u0016¢\u0006\u0004\bZ\u0010/J\u0017\u0010\\\u001a\u00020\u00072\u0006\u0010[\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\\\u0010\tR\u0016\u0010]\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010_\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u001b\u0010f\u001a\u00020a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u001b\u0010j\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bg\u0010c\u001a\u0004\bh\u0010iR\u001b\u0010n\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bk\u0010c\u001a\u0004\bl\u0010mR\u0016\u0010o\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010`R\u0016\u0010p\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0018\u0010s\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0016\u0010v\u001a\u00020u8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u001e\u0010z\u001a\n\u0012\u0004\u0012\u00020y\u0018\u00010x8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u001c\u0010|\u001a\b\u0012\u0002\b\u0003\u0018\u00010x8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010{R(\u0010~\u001a\u0004\u0018\u00010}8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0016\u0010\u0084\u0001\u001a\u00020C8\u0002X\u0082D¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010^R*\u0010\u0086\u0001\u001a\u00030\u0085\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0018\u0010\u008c\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010`R\u0018\u0010\u008d\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010`R\u0018\u0010\u008e\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010`R\u0018\u0010\u008f\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010`R\u0016\u0010\u0090\u0001\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010^R\u0018\u0010\u0092\u0001\u001a\u00030\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0018\u0010\u0094\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010qR(\u0010\u0099\u0001\u001a\u000b \u0095\u0001*\u0004\u0018\u00010\u001d0\u001d8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0096\u0001\u0010c\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u001c\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u009a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0018\u0010\u009d\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009d\u0001\u0010`R\u0018\u0010\u009e\u0001\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009e\u0001\u0010^R\u0018\u0010\u009f\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009f\u0001\u0010`R!\u0010¢\u0001\u001a\n\u0012\u0005\u0012\u00030¡\u00010 \u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R\u0018\u0010¤\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¤\u0001\u0010`R\u0018\u0010¥\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¥\u0001\u0010`R\u001a\u0010§\u0001\u001a\u0005\u0018\u00010¦\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R*\u0010¬\u0001\u001a\r \u0095\u0001*\u0005\u0018\u00010¦\u00010¦\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b©\u0001\u0010c\u001a\u0006\bª\u0001\u0010«\u0001R\u001c\u0010®\u0001\u001a\u0005\u0018\u00010\u00ad\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R \u0010´\u0001\u001a\u00030°\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b±\u0001\u0010c\u001a\u0006\b²\u0001\u0010³\u0001R \u0010¸\u0001\u001a\u00030\u00ad\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\bµ\u0001\u0010c\u001a\u0006\b¶\u0001\u0010·\u0001R\u0018\u0010¹\u0001\u001a\u00030°\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R\u0018\u0010»\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b»\u0001\u0010qR\u0018\u0010¼\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¼\u0001\u0010`R\u0016\u0010¾\u0001\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b½\u0001\u0010iR\u0016\u0010À\u0001\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¿\u0001\u0010i¨\u0006Å\u0001²\u0006\u0018\u0010Ä\u0001\u001a\r \u0095\u0001*\u0005\u0018\u00010Ã\u00010Ã\u00018\nX\u008a\u0084\u0002"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/ftp/ui/FtpV2Activity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/sport_eco/ftp/ui/FtpV2ActivityViewModel;", "Ltl0;", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ILockListener;", "", "hr", "", "checkHr", "(I)V", "checkHrWithZero", "", "abnormalHeartRate", "()Z", "Lcom/xiaomi/fitness/sport_eco/ftp/FtpDeviceState;", "state", "setDeviceStatus", "(Lcom/xiaomi/fitness/sport_eco/ftp/FtpDeviceState;)V", "addObserver", "()V", "Loe4;", "it", "showConnectDialog", "(Loe4;)V", "Lcom/xiaomi/fitness/sport_eco_manager_export/data/FtpStateData;", "ftpStateData", "initFtpPart", "(Lcom/xiaomi/fitness/sport_eco_manager_export/data/FtpStateData;)V", "quit", "Lcom/airbnb/lottie/LottieAnimationView;", "lottie", "setCountdownMode", "(Lcom/airbnb/lottie/LottieAnimationView;)V", "bgId", "updateFinishSportActionBg", "initData", "Landroid/view/View;", "view", "Lcom/xiaomi/fitness/sport_eco/view/widget/CircularProgressLayout;", "circularProgressLayout", "finishStartAnimator", "(Landroid/view/View;Lcom/xiaomi/fitness/sport_eco/view/widget/CircularProgressLayout;)V", "finishStopAnimator", "(Landroid/view/View;)V", "initClickEvent", "islink", "setLinkSrc", "(Z)V", "", "key", "value", "setConcernData", "(Ljava/lang/String;I)V", "fullStr", "valueLength", "txtSize", "colorLight", "colorDark", "Landroid/text/SpannableStringBuilder;", "buildSpan", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)Landroid/text/SpannableStringBuilder;", "finishFtp", "startSport", "pauseSport", "resumeSport", "showCountDownAnimation", "num", "", "milliseconds", "countDownTime", "(IJ)V", "adaptiveFullScreen", "title", "des", "showDeviceExceptionDialog", "(Ljava/lang/String;Ljava/lang/String;)V", "onAttachedToWindow", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", LifecycleConstantKt.ON_RESUME, LifecycleConstantKt.ON_STOP, LifecycleConstantKt.ON_DESTROY, "isHasLock", "lockCode", "onLock", "(ZI)V", "isDynamicMode", "onModeSwitch", "code", "ecoDeviceFault", "startTime", "J", DailyRecordKey.sportType, "I", "Lcom/xiaomi/fitness/account/HrZone;", "hrZone$delegate", "Lkotlin/Lazy;", "getHrZone", "()Lcom/xiaomi/fitness/account/HrZone;", "hrZone", "hrWarnLimit$delegate", "getHrWarnLimit", "()I", "hrWarnLimit", "decoderView$delegate", "getDecoderView", "()Landroid/view/View;", "decoderView", "distance", "supportDeviceLink", "Z", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "report", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "Lcom/xiaomi/fitness/sport_eco/ftp/FtpPart;", "ftpPart", "Lcom/xiaomi/fitness/sport_eco/ftp/FtpPart;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "mSportDeviceExceptionDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "dialog", "Landroid/animation/AnimatorSet;", "finishStartAnimatorSet", "Landroid/animation/AnimatorSet;", "getFinishStartAnimatorSet", "()Landroid/animation/AnimatorSet;", "setFinishStartAnimatorSet", "(Landroid/animation/AnimatorSet;)V", "mScaleAnimatorTime", "", "currentValue", "F", "getCurrentValue", "()F", "setCurrentValue", "(F)V", "lockIcResId", "actionBg0", "actionBg1", "finishBgColorResId", "FINISH_PRESSED_TOTAL_TIME", "Ljava/text/SimpleDateFormat;", "mDurationFormat", "Ljava/text/SimpleDateFormat;", "isPause", "kotlin.jvm.PlatformType", "countDownLottieView$delegate", "getCountDownLottieView", "()Lcom/airbnb/lottie/LottieAnimationView;", "countDownLottieView", "Landroid/os/CountDownTimer;", "timer", "Landroid/os/CountDownTimer;", "count", "startToastTime", "mBelowTarget", "", "Ltr9;", "ftpTarget", "[Ltr9;", "currentStage", "sumStage", "Landroid/graphics/Typeface;", "typeFace", "Landroid/graphics/Typeface;", "unitTypeFace$delegate", "getUnitTypeFace", "()Landroid/graphics/Typeface;", "unitTypeFace", "Lcom/xiaomi/fitness/baseui/dialog/DriftDialog;", "disConnectDialog", "Lcom/xiaomi/fitness/baseui/dialog/DriftDialog;", "Ljava/lang/Runnable;", "disconnectRunnable$delegate", "getDisconnectRunnable", "()Ljava/lang/Runnable;", "disconnectRunnable", "hrWarnDialog$delegate", "getHrWarnDialog", "()Lcom/xiaomi/fitness/baseui/dialog/DriftDialog;", "hrWarnDialog", "hrWarnRunnable", "Ljava/lang/Runnable;", "hrWarnIn", "mCurrentHr", "getLayoutId", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "Landroid/widget/TextView;", "sportDeviceView", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FtpV2Activity extends Hilt_FtpV2Activity<FtpV2ActivityViewModel, tl0> implements ILockListener {

    @NotNull
    public static final String DATA_POWER = "power";

    @NotNull
    public static final String DATA_RESISTANCE = "resistance";

    @NotNull
    public static final String DATA_RPM = "rpm";

    @NotNull
    private static final String TAG = "FtpActivity";
    private int count;
    private int currentStage;

    @Nullable
    private CommonDialog<?> dialog;

    @Nullable
    private DriftDialog disConnectDialog;
    private int distance;

    @Nullable
    private AnimatorSet finishStartAnimatorSet;
    private boolean hrWarnIn;
    private boolean isPause;
    private int mBelowTarget;
    private int mCurrentHr;

    @Nullable
    private CommonDialog<DialogParams> mSportDeviceExceptionDialog;

    @Nullable
    private SportBasicReport report;
    private int sportType;
    private long startTime;
    private long startToastTime;
    private int sumStage;

    @Nullable
    private CountDownTimer timer;

    /* JADX INFO: renamed from: hrZone$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy hrZone = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: isa
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FtpV2Activity.hrZone_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: hrWarnLimit$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy hrWarnLimit = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: tsa
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(FtpV2Activity.hrWarnLimit_delegate$lambda$1(this.f34991a));
        }
    });

    /* JADX INFO: renamed from: decoderView$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy decoderView = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: zsa
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FtpV2Activity.decoderView_delegate$lambda$2(this.f41624a);
        }
    });
    private boolean supportDeviceLink = true;

    @NotNull
    private FtpPart ftpPart = FtpPart.START_WARMING_UP;
    private final long mScaleAnimatorTime = 200;
    private float currentValue = 1.1f;
    private int lockIcResId = foi.v;
    private int actionBg0 = foi.q;
    private int actionBg1 = foi.p;
    private int finishBgColorResId = cki.f5432r;
    private final long FINISH_PRESSED_TOTAL_TIME = TimeUnit.SECONDS.toMillis(1);

    @NotNull
    private final SimpleDateFormat mDurationFormat = new SimpleDateFormat(StringUtils.EXPECT_TIME_FORMAT);

    /* JADX INFO: renamed from: countDownLottieView$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy countDownLottieView = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ata
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FtpV2Activity.countDownLottieView_delegate$lambda$3(this.f3430a);
        }
    });

    @NotNull
    private tr9[] ftpTarget = new tr9[0];

    @Nullable
    private final Typeface typeFace = DisplayUtil.getTypefaceAsResourceId(AppUtil.getApp(), npi.f28231a);

    /* JADX INFO: renamed from: unitTypeFace$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy unitTypeFace = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: bta
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FtpV2Activity.unitTypeFace_delegate$lambda$4(this.f4588a);
        }
    });

    /* JADX INFO: renamed from: disconnectRunnable$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy disconnectRunnable = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: cta
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FtpV2Activity.disconnectRunnable_delegate$lambda$6(this.f14695a);
        }
    });

    /* JADX INFO: renamed from: hrWarnDialog$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy hrWarnDialog = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: dta
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FtpV2Activity.hrWarnDialog_delegate$lambda$9(this.f15911a);
        }
    });

    @NotNull
    private final Runnable hrWarnRunnable = new Runnable() { // from class: eta
        @Override // java.lang.Runnable
        public final void run() {
            FtpV2Activity.hrWarnRunnable$lambda$10(this.f17041a);
        }
    };

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_eco.ftp.ui.FtpV2Activity$quit$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport_eco.ftp.ui.FtpV2Activity$quit$1", f = "FtpV2Activity.kt", i = {}, l = {545}, m = "invokeSuspend", n = {}, s = {})
    public static final class C31121 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C31121(Continuation<? super C31121> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FtpV2Activity.this.new C31121(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.delay(1500L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            FtpV2Activity.this.dismissDialog();
            FtpV2Activity.this.finish();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C31121) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_eco.ftp.ui.FtpV2Activity$startSport$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport_eco.ftp.ui.FtpV2Activity$startSport$1", f = "FtpV2Activity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C31161 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C31161(Continuation<? super C31161> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FtpV2Activity.this.new C31161(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FtpV2Activity.this.showCountDownAnimation();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C31161) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_eco.ftp.ui.FtpV2Activity$startSport$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/xiaomi/fitness/sport_eco/ftp/ui/FtpV2Activity$startSport$2", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/RequestCallback;", "call", "", "responseCode", "", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass2 implements RequestCallback {
        public AnonymousClass2() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit call$lambda$0(boolean z) {
            FitnessLogUtils.i(FtpV2Activity.TAG, "getEcoFtpTarget is " + z);
            return Unit.INSTANCE;
        }

        @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback
        public void call(int responseCode) {
            FitnessLogUtils.i(FtpV2Activity.TAG, "startLocalSport: = " + responseCode);
            if (responseCode == 0) {
                FtpV2Activity.access$getMViewModel(FtpV2Activity.this).getEcoFtpTarget(new Function1() { // from class: hta
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return FtpV2Activity.AnonymousClass2.call$lambda$0(((Boolean) obj).booleanValue());
                    }
                });
                return;
            }
            ToastUtil.showShortToast(e1j.J0);
            FtpV2Activity.this.finish();
            FitnessLogUtils.d(FtpV2Activity.TAG, "结束ftp运动");
        }
    }

    private final boolean abnormalHeartRate() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ tl0 access$getMBinding(FtpV2Activity ftpV2Activity) {
        return (tl0) ftpV2Activity.getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ FtpV2ActivityViewModel access$getMViewModel(FtpV2Activity ftpV2Activity) {
        return (FtpV2ActivityViewModel) ftpV2Activity.getMViewModel();
    }

    private final void adaptiveFullScreen() {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        if (Build.VERSION.SDK_INT >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void addObserver() {
        ((FtpV2ActivityViewModel) getMViewModel()).getMDeviceState().observe(this, new FtpV2Activity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: qsa
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FtpV2Activity.addObserver$lambda$18(this.f31798a, (FtpDeviceState) obj);
            }
        }));
        ((FtpV2ActivityViewModel) getMViewModel()).getMSportState().observe(this, new FtpV2Activity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: rsa
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FtpV2Activity.addObserver$lambda$19(this.f32852a, (CourseSportState) obj);
            }
        }));
        ((FtpV2ActivityViewModel) getMViewModel()).getMPhoneSportData().observe(this, new FtpV2Activity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ssa
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FtpV2Activity.addObserver$lambda$21(this.f33944a, (PhoneSportData) obj);
            }
        }));
        ((FtpV2ActivityViewModel) getMViewModel()).getMFtpStateData().observe(this, new FtpV2Activity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: usa
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FtpV2Activity.addObserver$lambda$23(this.f36084a, (FtpStateData) obj);
            }
        }));
        ((FtpV2ActivityViewModel) getMViewModel()).checkDeviceStatus();
        ((FtpV2ActivityViewModel) getMViewModel()).setOnSecondTick(new Function1() { // from class: vsa
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FtpV2Activity.addObserver$lambda$24(((Long) obj).longValue());
            }
        });
        ((FtpV2ActivityViewModel) getMViewModel()).getRecordEmitter().observe(this, new FtpV2Activity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: wsa
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FtpV2Activity.addObserver$lambda$28(this.f38308a, (SportBasicReport) obj);
            }
        }));
        ((FtpV2ActivityViewModel) getMViewModel()).getStateData().observe(this, new FtpV2Activity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: xsa
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FtpV2Activity.addObserver$lambda$30(this.f39414a, (FtpActivityState) obj);
            }
        }));
        MutableLiveData<oe4> connectEcoState = ((FtpV2ActivityViewModel) getMViewModel()).getConnectEcoState();
        if (connectEcoState != null) {
            connectEcoState.observe(this, new FtpV2Activity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ysa
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return FtpV2Activity.addObserver$lambda$31(this.f40488a, (oe4) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addObserver$lambda$18(final FtpV2Activity this$0, final FtpDeviceState ftpDeviceState) {
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
                    this$0.disConnectDialog = new DriftDialog.Builder().setLayoutRes(fvi.d).addClickIds(zri.X0, zri.O1).setOnViewClick(new Function2() { // from class: msa
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return FtpV2Activity.addObserver$lambda$18$lambda$17$lambda$15(this.f27155a, (View) obj, (DriftDialog) obj2);
                        }
                    }).setOnViewBind(new Function1() { // from class: nsa
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return FtpV2Activity.addObserver$lambda$18$lambda$17$lambda$16(this.f28321a, ftpDeviceState, (View) obj);
                        }
                    }).setCanceledOnTouchOutside(false).create();
                    this$0.getDecoderView().postDelayed(this$0.getDisconnectRunnable(), 60000L);
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addObserver$lambda$18$lambda$17$lambda$15(FtpV2Activity this$0, View view, DriftDialog dialog) {
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
    public static final Unit addObserver$lambda$18$lambda$17$lambda$16(FtpV2Activity this$0, FtpDeviceState this_run, View view) {
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
    public static final Unit addObserver$lambda$19(FtpV2Activity this$0, CourseSportState courseSportState) {
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
            this$0.startTime = ((FtpV2ActivityViewModel) this$0.getMViewModel()).getStartTime();
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
    public static final Unit addObserver$lambda$21(FtpV2Activity this$0, PhoneSportData phoneSportData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (phoneSportData != null) {
            this$0.distance = phoneSportData.distance;
            this$0.mBelowTarget = phoneSportData.bike_below_target;
            this$0.checkHr(phoneSportData.heart_rate);
            ((FtpV2ActivityViewModel) this$0.getMViewModel()).setMinute((int) phoneSportData.deviceDuration);
            this$0.setConcernData("resistance", phoneSportData.bike_resistance_level);
            this$0.setConcernData("power", phoneSportData.bike_power);
            this$0.setConcernData("rpm", phoneSportData.bike_rpm);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit addObserver$lambda$23(FtpV2Activity this$0, FtpStateData ftpStateData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (ftpStateData != null) {
            this$0.currentStage = ftpStateData.stage;
            this$0.initFtpPart(ftpStateData);
            if (ftpStateData.retryCount >= 2) {
                this$0.updateFinishSportActionBg(this$0.actionBg1);
            } else {
                this$0.updateFinishSportActionBg(this$0.actionBg0);
            }
            ((tl0) this$0.getMBinding()).O.setPercent(ftpStateData.lightOnNumber * 33.3f);
            if (ftpStateData.lightOnNumber == 3) {
                ((tl0) this$0.getMBinding()).O.setFgColorStart(ResourceExtKt.getResourceColor(this$0, cki.i));
                ((tl0) this$0.getMBinding()).O.setFgColorEnd(ResourceExtKt.getResourceColor(this$0, cki.h));
            } else {
                ((tl0) this$0.getMBinding()).O.setFgColorStart(ResourceExtKt.getResourceColor(this$0, cki.g));
                ((tl0) this$0.getMBinding()).O.setFgColorEnd(ResourceExtKt.getResourceColor(this$0, cki.f));
            }
            ((tl0) this$0.getMBinding()).R.setText(String.valueOf(ftpStateData.countdown));
            ((tl0) this$0.getMBinding()).E.setText(((FtpV2ActivityViewModel) this$0.getMViewModel()).getIndicatorText(ftpStateData, this$0.sumStage));
            ((tl0) this$0.getMBinding()).D.setText(((FtpV2ActivityViewModel) this$0.getMViewModel()).getPartText(this$0.ftpPart));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addObserver$lambda$24(long j) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addObserver$lambda$28(FtpV2Activity this$0, SportBasicReport sportBasicReport) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = this$0.currentStage;
        if (i == 0) {
            FitnessLogUtils.i(TAG, "ftp finish,ftp test stage=0");
            Bundle bundle = new Bundle();
            if (sportBasicReport != null) {
                FitnessLogUtils.i(TAG, "ftp finish,ftp test stage=" + this$0.currentStage + ",has report");
                this$0.report = sportBasicReport;
                int iA = lp5.a(sportBasicReport);
                bundle.putLong("time_stamp", sportBasicReport.getTimeStamp());
                bundle.putSerializable("sport_report", sportBasicReport);
                bundle.putInt("sport_type", iA);
                bundle.putBoolean(FtpTestResultV2ActivityKt.HAS_REPORT, true);
                Intent intent = new Intent(this$0, (Class<?>) FtpTestResultV2Activity.class);
                intent.putExtras(bundle);
                this$0.dismissDialog();
                this$0.startActivity(intent);
                this$0.finish();
            } else {
                FitnessLogUtils.i(TAG, "ftp finish,ftp test stage=" + this$0.currentStage + ",no report");
                bundle.putBoolean(FtpTestResultV2ActivityKt.HAS_REPORT, false);
                Intent intent2 = new Intent(this$0, (Class<?>) FtpTestResultV2Activity.class);
                intent2.putExtras(bundle);
                this$0.dismissDialog();
                this$0.startActivity(intent2);
                this$0.finish();
            }
        } else {
            FitnessLogUtils.i(TAG, "ftp finish,ftp test stage = " + i);
            if (sportBasicReport != null) {
                FitnessLogUtils.i(TAG, "ftp finish,ftp test stage = " + this$0.currentStage + ",has report");
                this$0.report = sportBasicReport;
                Bundle bundle2 = new Bundle();
                int iA2 = lp5.a(sportBasicReport);
                bundle2.putLong("time_stamp", sportBasicReport.getTimeStamp());
                bundle2.putSerializable("sport_report", sportBasicReport);
                bundle2.putInt("sport_type", iA2);
                Intent intent3 = new Intent(this$0, (Class<?>) FtpTestResultActivity.class);
                intent3.putExtras(bundle2);
                this$0.dismissDialog();
                this$0.startActivity(intent3);
                this$0.finish();
            } else {
                FitnessLogUtils.i(TAG, "ftp finish,ftp test stage = " + this$0.currentStage + ",no report");
                FitnessLogUtils.i(TAG, "no report,ftp test is error");
                this$0.quit();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addObserver$lambda$30(FtpV2Activity this$0, FtpActivityState ftpActivityState) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (ftpActivityState != null) {
            if (!(ftpActivityState.getMFtpTarget().length == 0)) {
                this$0.sumStage = ftpActivityState.getMFtpTarget().length - 1;
                this$0.ftpTarget = ftpActivityState.getMFtpTarget();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addObserver$lambda$31(FtpV2Activity this$0, oe4 oe4Var) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(oe4Var);
        this$0.showConnectDialog(oe4Var);
        return Unit.INSTANCE;
    }

    private final SpannableStringBuilder buildSpan(String fullStr, int valueLength, int txtSize, String colorLight, String colorDark) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fullStr);
        if (this.typeFace == null || getUnitTypeFace() == null) {
            return spannableStringBuilder;
        }
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(txtSize, true), 0, valueLength, 17);
        spannableStringBuilder.setSpan(new TextTypefaceSpan(this.typeFace), 0, valueLength, 17);
        if (!UIUtils.isNightMode(this)) {
            colorLight = colorDark;
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor(colorLight)), 0, valueLength, 17);
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
    public static final LottieAnimationView countDownLottieView_delegate$lambda$3(FtpV2Activity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return (LottieAnimationView) this$0.findViewById(zri.C);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void countDownTime(int num, long milliseconds) {
        this.count = num;
        CountDownTimer countDownTimer = new CountDownTimer(milliseconds, ((long) num) * milliseconds) { // from class: com.xiaomi.fitness.sport_eco.ftp.ui.FtpV2Activity.countDownTime.1
            @Override // android.os.CountDownTimer
            public void onFinish() {
                FitnessLogUtils.i(FtpV2Activity.TAG, "countDownTime finish");
                FtpV2Activity.access$getMViewModel(this).setGymFtpTest(true, new RequestCallback() { // from class: com.xiaomi.fitness.sport_eco.ftp.ui.FtpV2Activity$countDownTime$1$onFinish$1
                    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback
                    public void call(int responseCode) {
                        FitnessLogUtils.i("FtpActivity", "setGymFtpTest responseCode=" + responseCode);
                    }
                });
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
    public static final View decoderView_delegate$lambda$2(FtpV2Activity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getWindow().getDecorView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Runnable disconnectRunnable_delegate$lambda$6(final FtpV2Activity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new Runnable() { // from class: psa
            @Override // java.lang.Runnable
            public final void run() {
                FtpV2Activity.disconnectRunnable_delegate$lambda$6$lambda$5(this.f30702a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void disconnectRunnable_delegate$lambda$6$lambda$5(FtpV2Activity this$0) {
        DriftDialog driftDialog;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isFinishing() || (driftDialog = this$0.disConnectDialog) == null) {
            return;
        }
        FragmentManager supportFragmentManager = this$0.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        driftDialog.show(supportFragmentManager);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void finishFtp() {
        if (((FtpV2ActivityViewModel) getMViewModel()).isDeviceConnect()) {
            ((FtpV2ActivityViewModel) getMViewModel()).finishSport(this.sportType, new RequestCallback() { // from class: com.xiaomi.fitness.sport_eco.ftp.ui.FtpV2Activity.finishFtp.1
                @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback
                public void call(int responseCode) {
                    FitnessLogUtils.d(FtpV2Activity.TAG, "结束ftp运动=" + responseCode);
                }
            });
        } else {
            finish();
            FitnessLogUtils.d(TAG, "结束ftp运动");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"ObjectAnimatorBinding"})
    private final void finishStartAnimator(View view, CircularProgressLayout circularProgressLayout) {
        AnimatorSet.Builder builderPlay;
        ((tl0) getMBinding()).L.setVisibility(0);
        this.finishStartAnimatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 0.8f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 0.8f);
        AnimatorSet animatorSet = this.finishStartAnimatorSet;
        if (animatorSet != null) {
            animatorSet.setDuration(this.mScaleAnimatorTime);
        }
        AnimatorSet animatorSet2 = this.finishStartAnimatorSet;
        if (animatorSet2 != null) {
            animatorSet2.setInterpolator(new DecelerateInterpolator());
        }
        AnimatorSet animatorSet3 = this.finishStartAnimatorSet;
        if (animatorSet3 != null && (builderPlay = animatorSet3.play(objectAnimatorOfFloat)) != null) {
            builderPlay.with(objectAnimatorOfFloat2);
        }
        AnimatorSet animatorSet4 = this.finishStartAnimatorSet;
        if (animatorSet4 != null) {
            animatorSet4.start();
        }
        if (objectAnimatorOfFloat != null) {
            objectAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: fta
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    FtpV2Activity.finishStartAnimator$lambda$32(this.f18221a, valueAnimator);
                }
            });
        }
        if (circularProgressLayout != null) {
            circularProgressLayout.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void finishStartAnimator$lambda$32(FtpV2Activity this$0, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.currentValue = ((Float) animatedValue).floatValue();
    }

    @SuppressLint({"ObjectAnimatorBinding"})
    private final void finishStopAnimator(View view) {
        AnimatorSet animatorSet = this.finishStartAnimatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", this.currentValue, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "scaleY", this.currentValue, 1.0f);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setInterpolator(new DecelerateInterpolator());
        animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet2.setDuration(this.mScaleAnimatorTime);
        animatorSet2.start();
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
    public static final DriftDialog hrWarnDialog_delegate$lambda$9(final FtpV2Activity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        DriftDialog.Builder layoutRes = new DriftDialog.Builder().setLayoutRes(fvi.course_layout_alert);
        UIUtils uIUtils = UIUtils.INSTANCE;
        Application application = this$0.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
        return DriftDialog.Builder.setGravity$default(layoutRes.setWidth(uIUtils.dip2px(application, 187.0f)), 17, 0, 0, 6, null).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: ksa
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                FtpV2Activity.hrWarnDialog_delegate$lambda$9$lambda$7(this.f24258a, dialogInterface);
            }
        }).setOnViewBind(new Function1() { // from class: lsa
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FtpV2Activity.hrWarnDialog_delegate$lambda$9$lambda$8(this.f25396a, (View) obj);
            }
        }).create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hrWarnDialog_delegate$lambda$9$lambda$7(FtpV2Activity this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hrWarnIn = false;
        this$0.getWindow().getDecorView().removeCallbacks(this$0.hrWarnRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit hrWarnDialog_delegate$lambda$9$lambda$8(FtpV2Activity this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        ((TextView) it.findViewById(zri.o1)).setText(this$0.getString(e1j.course_hr_warning));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int hrWarnLimit_delegate$lambda$1(FtpV2Activity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getHrZone().getMaxHr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hrWarnRunnable$lambda$10(FtpV2Activity this$0) {
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
    @SuppressLint({"ClickableViewAccessibility", "ObjectAnimatorBinding", "WrongConstant"})
    private final void initClickEvent() {
        ((tl0) getMBinding()).M.setOnTouchListener(new View.OnTouchListener() { // from class: gta
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return FtpV2Activity.initClickEvent$lambda$33(this.f19315a, view, motionEvent);
            }
        });
        ((tl0) getMBinding()).K.setOnTimerFinishedListener(new CircularProgressLayout.b() { // from class: jsa
            @Override // com.xiaomi.fitness.sport_eco.view.widget.CircularProgressLayout.b
            public final void a(CircularProgressLayout circularProgressLayout) {
                FtpV2Activity.initClickEvent$lambda$34(this.f23089a, circularProgressLayout);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean initClickEvent$lambda$33(FtpV2Activity this$0, View view, MotionEvent event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            clb.a(ApplicationExtKt.getSafeContext(this$0));
            ImageView finishSportAction = ((tl0) this$0.getMBinding()).M;
            Intrinsics.checkNotNullExpressionValue(finishSportAction, "finishSportAction");
            this$0.finishStartAnimator(finishSportAction, ((tl0) this$0.getMBinding()).K);
        } else if (actionMasked == 1 || actionMasked == 3) {
            AnimatorSet animatorSet = this$0.finishStartAnimatorSet;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            ((tl0) this$0.getMBinding()).L.setVisibility(8);
            if (((tl0) this$0.getMBinding()).K.a()) {
                ((tl0) this$0.getMBinding()).K.c();
                this$0.finishStopAnimator(((tl0) this$0.getMBinding()).M);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initClickEvent$lambda$34(FtpV2Activity this$0, CircularProgressLayout circularProgressLayout) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AnimatorSet animatorSet = this$0.finishStartAnimatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ((tl0) this$0.getMBinding()).L.setVisibility(8);
        if (((tl0) this$0.getMBinding()).K.a()) {
            ((tl0) this$0.getMBinding()).K.c();
            this$0.finishStopAnimator(((tl0) this$0.getMBinding()).M);
        }
        Object systemService = this$0.getSystemService("vibrator");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.Vibrator");
        ((Vibrator) systemService).vibrate(100L);
        this$0.finishFtp();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initData() {
        setCountdownMode(((tl0) getMBinding()).I);
        this.mDurationFormat.setTimeZone(TimeZone.getTimeZone("GMT+00:00"));
        ((tl0) getMBinding()).C.setText(getString(e1j.L1));
        ((tl0) getMBinding()).K.setTotalTime(this.FINISH_PRESSED_TOTAL_TIME);
        ((tl0) getMBinding()).M.setContentDescription(getString(e1j.J4));
        this.finishBgColorResId = UIUtils.isNightMode(ApplicationExtKt.getSafeContext(this)) ? cki.f5429a : cki.f5432r;
        ((tl0) getMBinding()).K.setBackgroundColor(ni4.c(ApplicationExtKt.getSafeContext(this), this.finishBgColorResId));
        updateFinishSportActionBg(this.actionBg0);
        ((tl0) getMBinding()).M.setImageDrawable(ni4.e(ApplicationExtKt.getSafeContext(this), this.lockIcResId));
    }

    private final void initFtpPart(FtpStateData ftpStateData) {
        FtpPart ftpPart;
        int i = ftpStateData.stage;
        if (i == this.sumStage && ftpStateData.countdown == 0 && ftpStateData.lightOnNumber == 3) {
            ftpPart = FtpPart.COMPLETE_TEST;
        } else if (i <= 0) {
            int i2 = ftpStateData.countdown;
            if (i2 > 176) {
                ftpPart = FtpPart.START_WARMING_UP;
            } else {
                ftpPart = i2 < 4 ? FtpPart.TEST_IS_ABOUT_TO_START : FtpPart.WARMING_UP;
            }
        } else if (ftpStateData.retryCount > 0) {
            if (i == 1 || i == 2) {
                ftpPart = ftpStateData.countdown > 86 ? FtpPart.TRUST_ME : FtpPart.KEEP_GOING;
            } else {
                ftpPart = ftpStateData.countdown > 56 ? FtpPart.TRUST_ME : FtpPart.KEEP_GOING;
            }
        } else if (ftpStateData.lightOnNumber == 3 && ftpStateData.countdown > 0) {
            ftpPart = FtpPart.DAWN_IS_COMING;
        } else if (i == 1) {
            ftpPart = ftpStateData.countdown > 86 ? FtpPart.TEST_START : FtpPart.KEEP_GOING;
        } else if (i != 2) {
            ftpPart = ftpStateData.countdown > 56 ? FtpPart.NEW_STAGE_BEGINS : FtpPart.KEEP_GOING;
        } else {
            ftpPart = ftpStateData.countdown > 86 ? FtpPart.NEW_STAGE_BEGINS : FtpPart.KEEP_GOING;
        }
        this.ftpPart = ftpPart;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void pauseSport() {
        FitnessLogUtils.d(TAG, "pauseSport");
        ((FtpV2ActivityViewModel) getMViewModel()).pauseSport(this.sportType, new RequestCallback() { // from class: com.xiaomi.fitness.sport_eco.ftp.ui.FtpV2Activity.pauseSport.1
            @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback
            public void call(int responseCode) {
                FitnessLogUtils.d(FtpV2Activity.TAG, "pauseSport resultCode=" + responseCode);
            }
        });
    }

    private final void quit() {
        showLoading();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C31121(null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void resumeSport() {
        FitnessLogUtils.d(TAG, "resumeSport");
        ((FtpV2ActivityViewModel) getMViewModel()).resumeSport(this.sportType, new RequestCallback() { // from class: com.xiaomi.fitness.sport_eco.ftp.ui.FtpV2Activity.resumeSport.1
            @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback
            public void call(int responseCode) {
                FitnessLogUtils.d(FtpV2Activity.TAG, "resumeSport resultCode=" + responseCode);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setConcernData(String key, int value) {
        int iHashCode = key.hashCode();
        if (iHashCode == 113135) {
            if (key.equals("rpm")) {
                String str = value + "\n" + getString(e1j.M);
                tr9[] tr9VarArr = this.ftpTarget;
                if (tr9VarArr.length == 0) {
                    ((tl0) getMBinding()).F.setText(buildSpan(str, String.valueOf(value).length(), 30, "#E6FFFFFF", "#000000"));
                    return;
                }
                int i = tr9VarArr[this.currentStage].g;
                if (1 > i || i > value) {
                    ((tl0) getMBinding()).F.setText(buildSpan(str, String.valueOf(value).length(), 30, "#E6FFFFFF", "#000000"));
                } else {
                    ((tl0) getMBinding()).F.setText(buildSpan(str, String.valueOf(value).length(), 30, "#E6EB6009", "#FF612E"));
                }
                if (i <= 0) {
                    ((tl0) getMBinding()).a0.setText("");
                    return;
                }
                ((tl0) getMBinding()).a0.setText("/" + i);
                return;
            }
            return;
        }
        if (iHashCode != 106858757) {
            if (iHashCode == 1863800889 && key.equals("resistance")) {
                ((tl0) getMBinding()).W.setText(buildSpan(value + "\n" + getString(e1j.R2), String.valueOf(value).length(), 30, "#E6FFFFFF", "#000000"));
                return;
            }
            return;
        }
        if (key.equals("power")) {
            String str2 = value + "\n" + getString(e1j.F2);
            tr9[] tr9VarArr2 = this.ftpTarget;
            if (tr9VarArr2.length == 0) {
                ((tl0) getMBinding()).U.setText(buildSpan(str2, String.valueOf(value).length(), 30, "#ffffff", "#000000"));
                return;
            }
            int i2 = tr9VarArr2[this.currentStage].f;
            if (1 > i2 || i2 > value) {
                ((tl0) getMBinding()).U.setText(buildSpan(str2, String.valueOf(value).length(), 30, "#E6FFFFFF", "#000000"));
            } else {
                ((tl0) getMBinding()).U.setText(buildSpan(str2, String.valueOf(value).length(), 30, "#E6EB6009", "#FF612E"));
            }
            if (i2 <= 0) {
                ((tl0) getMBinding()).b0.setText("");
                return;
            }
            ((tl0) getMBinding()).b0.setText("/" + i2);
        }
    }

    private final void setCountdownMode(LottieAnimationView lottie) {
        if (UIUtils.isNightMode(this)) {
            if (lottie != null) {
                lottie.setBackgroundResource(cki.f5429a);
            }
            if (lottie != null) {
                lottie.setAnimation("countdown_black.json");
                return;
            }
            return;
        }
        if (lottie != null) {
            lottie.setAnimation("countdown_white.json");
        }
        if (lottie != null) {
            lottie.setBackgroundResource(cki.f5432r);
        }
    }

    private final void setDeviceStatus(FtpDeviceState state) {
        String str;
        FitnessLogUtils.d(TAG, "setDeviceStatus:" + state);
        TextView deviceStatus$lambda$12 = setDeviceStatus$lambda$12(LazyKt__LazyJVMKt.lazy(new Function0() { // from class: osa
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FtpV2Activity.setDeviceStatus$lambda$11(this.f29649a);
            }
        }));
        if (deviceStatus$lambda$12 != null) {
            if (!state.getSportHas()) {
                ViewExtKt.invisible(deviceStatus$lambda$12);
                return;
            }
            ViewExtKt.visible(deviceStatus$lambda$12);
            if (state.getSportConnect()) {
                String string = getString(e1j.course_device_connect);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                str = String.format(string, Arrays.copyOf(new Object[]{state.getSportName()}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            } else {
                String string2 = getString(e1j.course_device_disconnect);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                str = String.format(string2, Arrays.copyOf(new Object[]{state.getSportName()}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            }
            deviceStatus$lambda$12.setText(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView setDeviceStatus$lambda$11(FtpV2Activity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return (TextView) this$0.findViewById(zri.h2);
    }

    private static final TextView setDeviceStatus$lambda$12(Lazy<? extends TextView> lazy) {
        return lazy.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setLinkSrc(boolean islink) {
        if (islink) {
            ((tl0) getMBinding()).S.setImageResource(foi.course_audio_link_open);
        } else {
            ((tl0) getMBinding()).S.setImageResource(foi.course_audio_link_close);
        }
    }

    private final void showConnectDialog(oe4 it) {
        if (it.b()) {
            CommonDialog<?> commonDialog = this.dialog;
            if (commonDialog != null) {
                commonDialog.dismissAllowingStateLoss();
            }
            this.dialog = null;
            return;
        }
        FitnessLogUtils.i(TAG, "FTP testing but device is disConnect");
        if (this.dialog == null) {
            CommonDialog<?> commonDialogCreate = new CommonDialog.c("connectDialog").setDialogTitle(e1j.L).setDialogDescription(e1j.P2).setPositiveText(e1j.y1).create();
            this.dialog = commonDialogCreate;
            if (commonDialogCreate != null) {
                commonDialogCreate.setCancelable(false);
            }
            CommonDialog<?> commonDialog2 = this.dialog;
            if (commonDialog2 != null) {
                commonDialog2.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport_eco.ftp.ui.FtpV2Activity.showConnectDialog.1
                    @Override // defpackage.av6
                    public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                        if (which == -1) {
                            if (dialog != null) {
                                dialog.dismiss();
                            }
                            FtpV2Activity.access$getMViewModel(FtpV2Activity.this).disconnectOperate();
                            FtpV2Activity.this.finish();
                        }
                    }
                });
            }
            CommonDialog<?> commonDialog3 = this.dialog;
            if (commonDialog3 != null) {
                commonDialog3.showIfNeed(getSupportFragmentManager());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showCountDownAnimation() {
        final LottieAnimationView countDownLottieView = getCountDownLottieView();
        if (countDownLottieView != null) {
            countDownLottieView.setVisibility(0);
            countDownLottieView.w();
            countDownLottieView.i(new Animator.AnimatorListener() { // from class: com.xiaomi.fitness.sport_eco.ftp.ui.FtpV2Activity$showCountDownAnimation$1$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    countDownLottieView.setVisibility(8);
                    FrameLayout frameLayoutFinishGroup = FtpV2Activity.access$getMBinding(this).N;
                    Intrinsics.checkNotNullExpressionValue(frameLayoutFinishGroup, "frameLayoutFinishGroup");
                    ViewExtKt.visible(frameLayoutFinishGroup);
                    ConstraintLayout ftpProgressGroup = FtpV2Activity.access$getMBinding(this).Q;
                    Intrinsics.checkNotNullExpressionValue(ftpProgressGroup, "ftpProgressGroup");
                    ViewExtKt.visible(ftpProgressGroup);
                    ConstraintLayout sportDataLayout = FtpV2Activity.access$getMBinding(this).X;
                    Intrinsics.checkNotNullExpressionValue(sportDataLayout, "sportDataLayout");
                    ViewExtKt.visible(sportDataLayout);
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    this.countDownTime(3, 900L);
                    FrameLayout frameLayoutFinishGroup = FtpV2Activity.access$getMBinding(this).N;
                    Intrinsics.checkNotNullExpressionValue(frameLayoutFinishGroup, "frameLayoutFinishGroup");
                    ViewExtKt.gone(frameLayoutFinishGroup);
                    ConstraintLayout ftpProgressGroup = FtpV2Activity.access$getMBinding(this).Q;
                    Intrinsics.checkNotNullExpressionValue(ftpProgressGroup, "ftpProgressGroup");
                    ViewExtKt.gone(ftpProgressGroup);
                    ConstraintLayout sportDataLayout = FtpV2Activity.access$getMBinding(this).X;
                    Intrinsics.checkNotNullExpressionValue(sportDataLayout, "sportDataLayout");
                    ViewExtKt.gone(sportDataLayout);
                }
            });
        }
    }

    private final void showDeviceExceptionDialog(String title, String des) {
        CommonDialog<DialogParams> commonDialogAddDialogCallback = new SportDeviceExceptionDialog.Builder(title, des).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport_eco.ftp.ui.FtpV2Activity.showDeviceExceptionDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which != -1 || dialog == null) {
                    return;
                }
                dialog.dismiss();
            }
        });
        this.mSportDeviceExceptionDialog = commonDialogAddDialogCallback;
        if (commonDialogAddDialogCallback != null) {
            commonDialogAddDialogCallback.setCancelable(false);
        }
        CommonDialog<DialogParams> commonDialog = this.mSportDeviceExceptionDialog;
        Intrinsics.checkNotNull(commonDialog);
        commonDialog.showIfNeed(getSupportFragmentManager());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void startSport() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C31161(null), 3, null);
        ((FtpV2ActivityViewModel) getMViewModel()).startLocalSport(new AnonymousClass2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Typeface unitTypeFace_delegate$lambda$4(FtpV2Activity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return Typeface.create(this$0.getString(e1j.x), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateFinishSportActionBg(int bgId) {
        ((tl0) getMBinding()).M.setBackground(ni4.e(ApplicationExtKt.getSafeContext(this), bgId));
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ILockListener
    public void ecoDeviceFault(int code) {
        FitnessLogUtils.i(TAG, "故障处理" + code);
        showDeviceExceptionDialog(DeviceExceptionUtil.getExceptionTitleByCode(code), DeviceExceptionUtil.getExceptionDesByCode(code));
    }

    public final float getCurrentValue() {
        return this.currentValue;
    }

    @Nullable
    public final AnimatorSet getFinishStartAnimatorSet() {
        return this.finishStartAnimatorSet;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return fvi.i;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return pv1.f30813a;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003f  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        int safeInsetTop;
        super.onAttachedToWindow();
        if (Build.VERSION.SDK_INT >= 28) {
            DisplayCutout displayCutout = getWindow().getDecorView().getRootWindowInsets().getDisplayCutout();
            if (displayCutout != null) {
                List boundingRects = displayCutout.getBoundingRects();
                Intrinsics.checkNotNullExpressionValue(boundingRects, "getBoundingRects(...)");
                if (!boundingRects.isEmpty()) {
                    safeInsetTop = getRequestedOrientation() == 1 ? displayCutout.getSafeInsetTop() : displayCutout.getSafeInsetLeft();
                } else {
                    safeInsetTop = 0;
                }
            } else {
                safeInsetTop = 0;
            }
            if (getRequestedOrientation() != 2) {
                safeInsetTop = 0;
            }
            ConstraintLayout constraintLayout = ((tl0) getMBinding()).H;
            if (constraintLayout != null) {
                constraintLayout.setPadding(safeInsetTop, 0, 0, 0);
            }
        }
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
    @Override // com.xiaomi.fitness.sport_eco.ftp.ui.Hilt_FtpV2Activity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adaptiveFullScreen();
        Intent intent = getIntent();
        String stringExtra = intent != null ? intent.getStringExtra(FtpTestIntroduceActivityKt.FTP_DEVICE_MODEL) : null;
        NotchScreenManager.INSTANCE.getInstance().setDisplayInNotch(this);
        this.sportType = 7;
        FtpV2ActivityViewModel ftpV2ActivityViewModel = (FtpV2ActivityViewModel) getMViewModel();
        if (stringExtra == null) {
            stringExtra = SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE();
        }
        ftpV2ActivityViewModel.initData(stringExtra, this.sportType);
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null) {
            miuiActionBar.hide();
        }
        this.supportDeviceLink = true;
        SportManagerExportPreference.INSTANCE.setKEY_GYM_IS_SUPPORT_REMIND(false);
        SportEcoManagerExtKt.getInstance(IEcoSportRemoteState.INSTANCE).setLocalReceiveListener(this);
        addObserver();
        initClickEvent();
        initData();
        startSport();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.sport_eco.ftp.ui.Hilt_FtpV2Activity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AnimatorSet animatorSet = this.finishStartAnimatorSet;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        SportEcoManagerExtKt.getInstance(IEcoSportRemoteState.INSTANCE).setLocalReceiveListener(null);
        getDecoderView().removeCallbacks(this.hrWarnRunnable);
        getDecoderView().removeCallbacks(getDisconnectRunnable());
        SportManagerExportPreference.INSTANCE.setKEY_GYM_IS_SUPPORT_REMIND(true);
        ((FtpV2ActivityViewModel) getMViewModel()).resetListener();
        getCountDownLottieView().x();
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ILockListener
    public void onLock(boolean isHasLock, int lockCode) {
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ILockListener
    public void onModeSwitch(boolean isDynamicMode) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ((FtpV2ActivityViewModel) getMViewModel()).initListener();
        getWindow().addFlags(128);
    }

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        getWindow().clearFlags(128);
    }

    public final void setCurrentValue(float f) {
        this.currentValue = f;
    }

    public final void setFinishStartAnimatorSet(@Nullable AnimatorSet animatorSet) {
        this.finishStartAnimatorSet = animatorSet;
    }
}
