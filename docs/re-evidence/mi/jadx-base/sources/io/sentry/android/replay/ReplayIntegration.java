package io.sentry.android.replay;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.passport.utils.LoginPreferenceConfig;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.avg;
import defpackage.c8c;
import defpackage.dyc;
import defpackage.elk;
import defpackage.flk;
import defpackage.ftc;
import defpackage.hgl;
import defpackage.kvl;
import defpackage.ucd;
import io.sentry.DataCategory;
import io.sentry.IConnectionStatusProvider;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SentryReplayOptions;
import io.sentry.android.replay.capture.BufferCaptureStrategy;
import io.sentry.android.replay.capture.CaptureStrategy;
import io.sentry.android.replay.capture.SessionCaptureStrategy;
import io.sentry.android.replay.gestures.GestureRecorder;
import io.sentry.android.replay.gestures.TouchRecorderCallback;
import io.sentry.android.replay.util.ContextKt;
import io.sentry.android.replay.util.ExecutorsKt;
import io.sentry.android.replay.util.MainLooperHandler;
import io.sentry.android.replay.util.SamplingKt;
import io.sentry.transport.p;
import io.sentry.transport.z;
import io.sentry.util.Random;
import io.sentry.util.j;
import io.sentry.util.k;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0080\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0002\u0088\u0001B\u008e\u0001\u0012\u0006\u0010H\u001a\u00020G\u0012\u0006\u0010K\u001a\u00020J\u0012\u0010\b\u0002\u0010O\u001a\n\u0012\u0004\u0012\u00020N\u0018\u00010M\u0012%\b\u0002\u0010V\u001a\u001f\u0012\u0013\u0012\u00110\u0019¢\u0006\f\bR\u0012\b\bS\u0012\u0004\b\b(T\u0012\u0004\u0012\u00020U\u0018\u00010Q\u0012:\b\u0002\u0010\\\u001a4\u0012\u0013\u0012\u00110!¢\u0006\f\bR\u0012\b\bS\u0012\u0004\b\b(Y\u0012\u0013\u0012\u00110U¢\u0006\f\bR\u0012\b\bS\u0012\u0004\b\b(Z\u0012\u0004\u0012\u00020[\u0018\u00010X¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001B\u001b\b\u0016\u0012\u0006\u0010H\u001a\u00020G\u0012\u0006\u0010K\u001a\u00020J¢\u0006\u0006\b\u0084\u0001\u0010\u0086\u0001BÏ\u0001\b\u0010\u0012\u0006\u0010H\u001a\u00020G\u0012\u0006\u0010K\u001a\u00020J\u0012\u000e\u0010O\u001a\n\u0012\u0004\u0012\u00020N\u0018\u00010M\u0012#\u0010V\u001a\u001f\u0012\u0013\u0012\u00110\u0019¢\u0006\f\bR\u0012\b\bS\u0012\u0004\b\b(T\u0012\u0004\u0012\u00020U\u0018\u00010Q\u00128\u0010\\\u001a4\u0012\u0013\u0012\u00110!¢\u0006\f\bR\u0012\b\bS\u0012\u0004\b\b(Y\u0012\u0013\u0012\u00110U¢\u0006\f\bR\u0012\b\bS\u0012\u0004\b\b(Z\u0012\u0004\u0012\u00020[\u0018\u00010X\u0012%\b\u0002\u0010{\u001a\u001f\u0012\u0013\u0012\u00110\u0019¢\u0006\f\bR\u0012\b\bS\u0012\u0004\b\b(z\u0012\u0004\u0012\u00020u\u0018\u00010Q\u0012\n\b\u0002\u0010}\u001a\u0004\u0018\u00010|\u0012\u0010\b\u0002\u0010\u007f\u001a\n\u0012\u0004\u0012\u00020b\u0018\u00010M¢\u0006\u0006\b\u0084\u0001\u0010\u0087\u0001J\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u0019\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u000bJ\u001f\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u000bJ\u000f\u0010\u001d\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u000bJ\u0019\u0010\u001f\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\t2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020$H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\tH\u0016¢\u0006\u0004\b*\u0010\u000bJ\u000f\u0010+\u001a\u00020\tH\u0016¢\u0006\u0004\b+\u0010\u000bJ\u0017\u0010.\u001a\u00020\t2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u001f\u0010.\u001a\u00020\t2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b.\u00104J\u000f\u00105\u001a\u00020\tH\u0016¢\u0006\u0004\b5\u0010\u000bJ\u0017\u00108\u001a\u00020\t2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\t2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020\t2\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\tH\u0016¢\u0006\u0004\bB\u0010\u000bJ\u0017\u0010E\u001a\u00020\t2\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u001c\u0010O\u001a\n\u0012\u0004\u0012\u00020N\u0018\u00010M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR1\u0010V\u001a\u001f\u0012\u0013\u0012\u00110\u0019¢\u0006\f\bR\u0012\b\bS\u0012\u0004\b\b(T\u0012\u0004\u0012\u00020U\u0018\u00010Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WRF\u0010\\\u001a4\u0012\u0013\u0012\u00110!¢\u0006\f\bR\u0012\b\bS\u0012\u0004\b\b(Y\u0012\u0013\u0012\u00110U¢\u0006\f\bR\u0012\b\bS\u0012\u0004\b\b(Z\u0012\u0004\u0012\u00020[\u0018\u00010X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010^R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010_R\u0018\u0010`\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010c\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u001b\u0010j\u001a\u00020e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u001b\u0010o\u001a\u00020k8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u0010g\u001a\u0004\bm\u0010nR\u001a\u0010q\u001a\u00020p8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010tR\u0014\u0010\u001a\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010rR\u0018\u0010v\u001a\u0004\u0018\u00010u8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0016\u0010x\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR3\u0010{\u001a\u001f\u0012\u0013\u0012\u00110\u0019¢\u0006\f\bR\u0012\b\bS\u0012\u0004\b\b(z\u0012\u0004\u0012\u00020u\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010WR\u0016\u0010}\u001a\u00020|8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R\u001e\u0010\u007f\u001a\n\u0012\u0004\u0012\u00020b\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010PR\u0017\u0010Z\u001a\u00020U8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\bZ\u0010\u0080\u0001R\u0016\u0010\u0083\u0001\u001a\u0004\u0018\u0001008F¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001¨\u0006\u0089\u0001"}, d2 = {"Lio/sentry/android/replay/ReplayIntegration;", "Lucd;", "Ljava/io/Closeable;", "Lio/sentry/android/replay/ScreenshotRecorderCallback;", "Lio/sentry/android/replay/gestures/TouchRecorderCallback;", "Lflk;", "Landroid/content/ComponentCallbacks;", "Lio/sentry/IConnectionStatusProvider$a;", "Lio/sentry/transport/z$b;", "", "checkCanRecord", "()V", "registerRootViewListeners", "unregisterRootViewListeners", "", "unfinishedReplayId", "cleanupReplays", "(Ljava/lang/String;)V", "finalizePreviousReplay", "Lftc;", "hub", "Lio/sentry/SentryOptions;", "options", LoginPreferenceConfig.TYPE_REGISTER, "(Lftc;Lio/sentry/SentryOptions;)V", "", "isRecording", "()Z", StatConstants.PARAM_START, "resume", "isTerminating", "captureReplay", "(Ljava/lang/Boolean;)V", "Lio/sentry/protocol/p;", "getReplayId", "()Lio/sentry/protocol/p;", "Lelk;", "converter", "setBreadcrumbConverter", "(Lelk;)V", "getBreadcrumbConverter", "()Lelk;", "pause", BroadcastsKt.SILENT_PUSHING_STOP, "Landroid/graphics/Bitmap;", "bitmap", "onScreenshotRecorded", "(Landroid/graphics/Bitmap;)V", "Ljava/io/File;", "screenshot", "", "frameTimestamp", "(Ljava/io/File;J)V", Constants.EXTRA_CLOSE_TAI, "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lio/sentry/IConnectionStatusProvider$ConnectionStatus;", "status", "onConnectionStatusChanged", "(Lio/sentry/IConnectionStatusProvider$ConnectionStatus;)V", "Lio/sentry/transport/z;", "rateLimiter", "onRateLimitChanged", "(Lio/sentry/transport/z;)V", "onLowMemory", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)V", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lio/sentry/transport/p;", "dateProvider", "Lio/sentry/transport/p;", "Lkotlin/Function0;", "Lio/sentry/android/replay/Recorder;", "recorderProvider", "Lkotlin/jvm/functions/Function0;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "configChanged", "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "recorderConfigProvider", "Lkotlin/jvm/functions/Function1;", "Lkotlin/Function2;", "replayId", "recorderConfig", "Lio/sentry/android/replay/ReplayCache;", "replayCacheProvider", "Lkotlin/jvm/functions/Function2;", "Lio/sentry/SentryOptions;", "Lftc;", "recorder", "Lio/sentry/android/replay/Recorder;", "Lio/sentry/android/replay/gestures/GestureRecorder;", "gestureRecorder", "Lio/sentry/android/replay/gestures/GestureRecorder;", "Lio/sentry/util/Random;", "random$delegate", "Lkotlin/Lazy;", "getRandom", "()Lio/sentry/util/Random;", "random", "Lio/sentry/android/replay/RootViewsSpy;", "rootViewsSpy$delegate", "getRootViewsSpy", "()Lio/sentry/android/replay/RootViewsSpy;", "rootViewsSpy", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isEnabled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isEnabled$sentry_android_replay_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "Lio/sentry/android/replay/capture/CaptureStrategy;", "captureStrategy", "Lio/sentry/android/replay/capture/CaptureStrategy;", "replayBreadcrumbConverter", "Lelk;", "isFullSession", "replayCaptureStrategyProvider", "Lio/sentry/android/replay/util/MainLooperHandler;", "mainLooperHandler", "Lio/sentry/android/replay/util/MainLooperHandler;", "gestureRecorderProvider", "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "getReplayCacheDir", "()Ljava/io/File;", "replayCacheDir", "<init>", "(Landroid/content/Context;Lio/sentry/transport/p;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "(Landroid/content/Context;Lio/sentry/transport/p;)V", "(Landroid/content/Context;Lio/sentry/transport/p;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lio/sentry/android/replay/util/MainLooperHandler;Lkotlin/jvm/functions/Function0;)V", "PreviousReplayHint", "sentry-android-replay_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nReplayIntegration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplayIntegration.kt\nio/sentry/android/replay/ReplayIntegration\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,408:1\n13579#2,2:409\n*S KotlinDebug\n*F\n+ 1 ReplayIntegration.kt\nio/sentry/android/replay/ReplayIntegration\n*L\n348#1:409,2\n*E\n"})
public final class ReplayIntegration implements ucd, Closeable, ScreenshotRecorderCallback, TouchRecorderCallback, flk, ComponentCallbacks, IConnectionStatusProvider.a, z.b {
    public static final int $stable = 8;

    @Nullable
    private CaptureStrategy captureStrategy;

    @NotNull
    private final Context context;

    @NotNull
    private final p dateProvider;

    @Nullable
    private GestureRecorder gestureRecorder;

    @Nullable
    private Function0<GestureRecorder> gestureRecorderProvider;

    @Nullable
    private ftc hub;

    @NotNull
    private final AtomicBoolean isEnabled;

    @NotNull
    private final AtomicBoolean isRecording;

    @NotNull
    private MainLooperHandler mainLooperHandler;
    private SentryOptions options;

    /* JADX INFO: renamed from: random$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy random;

    @Nullable
    private Recorder recorder;
    private ScreenshotRecorderConfig recorderConfig;

    @Nullable
    private final Function1<Boolean, ScreenshotRecorderConfig> recorderConfigProvider;

    @Nullable
    private final Function0<Recorder> recorderProvider;

    @NotNull
    private elk replayBreadcrumbConverter;

    @Nullable
    private final Function2<io.sentry.protocol.p, ScreenshotRecorderConfig, ReplayCache> replayCacheProvider;

    @Nullable
    private Function1<? super Boolean, ? extends CaptureStrategy> replayCaptureStrategyProvider;

    /* JADX INFO: renamed from: rootViewsSpy$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy rootViewsSpy;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lio/sentry/android/replay/ReplayIntegration$PreviousReplayHint;", "Lio/sentry/hints/c;", "", "shouldEnrich", "()Z", "<init>", "()V", "sentry-android-replay_release"}, k = 1, mv = {1, 8, 0})
    public static final class PreviousReplayHint implements io.sentry.hints.c {
        @Override // io.sentry.hints.c
        public boolean shouldEnrich() {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReplayIntegration(@NotNull Context context, @NotNull p dateProvider, @Nullable Function0<? extends Recorder> function0, @Nullable Function1<? super Boolean, ScreenshotRecorderConfig> function1, @Nullable Function2<? super io.sentry.protocol.p, ? super ScreenshotRecorderConfig, ReplayCache> function2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.context = context;
        this.dateProvider = dateProvider;
        this.recorderProvider = function0;
        this.recorderConfigProvider = function1;
        this.replayCacheProvider = function2;
        this.random = LazyKt__LazyJVMKt.lazy(new Function0<Random>() { // from class: io.sentry.android.replay.ReplayIntegration$random$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Random invoke() {
                return new Random();
            }
        });
        this.rootViewsSpy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<RootViewsSpy>() { // from class: io.sentry.android.replay.ReplayIntegration$rootViewsSpy$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final RootViewsSpy invoke() {
                return RootViewsSpy.INSTANCE.install();
            }
        });
        this.isEnabled = new AtomicBoolean(false);
        this.isRecording = new AtomicBoolean(false);
        avg avgVarA = avg.a();
        Intrinsics.checkNotNullExpressionValue(avgVarA, "getInstance()");
        this.replayBreadcrumbConverter = avgVarA;
        this.mainLooperHandler = new MainLooperHandler(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkCanRecord() {
        ftc ftcVar;
        ftc ftcVar2;
        z zVarG;
        z zVarG2;
        if (this.captureStrategy instanceof SessionCaptureStrategy) {
            SentryOptions sentryOptions = this.options;
            if (sentryOptions == null) {
                Intrinsics.throwUninitializedPropertyAccessException("options");
                sentryOptions = null;
            }
            if (sentryOptions.getConnectionStatusProvider().b() == IConnectionStatusProvider.ConnectionStatus.DISCONNECTED || !(((ftcVar = this.hub) == null || (zVarG2 = ftcVar.g()) == null || !zVarG2.o(DataCategory.All)) && ((ftcVar2 = this.hub) == null || (zVarG = ftcVar2.g()) == null || !zVarG.o(DataCategory.Replay)))) {
                pause();
            }
        }
    }

    private final void cleanupReplays(String unfinishedReplayId) {
        File[] fileArrListFiles;
        SentryOptions sentryOptions = this.options;
        if (sentryOptions == null) {
            Intrinsics.throwUninitializedPropertyAccessException("options");
            sentryOptions = null;
        }
        String cacheDirPath = sentryOptions.getCacheDirPath();
        if (cacheDirPath == null || (fileArrListFiles = new File(cacheDirPath).listFiles()) == null) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "listFiles()");
        for (File file : fileArrListFiles) {
            String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "name");
            if (StringsKt__StringsJVMKt.startsWith$default(name, "replay_", false, 2, null)) {
                String string = getReplayId().toString();
                Intrinsics.checkNotNullExpressionValue(string, "replayId.toString()");
                if (!StringsKt__StringsKt.contains$default((CharSequence) name, (CharSequence) string, false, 2, (Object) null) && (!(!StringsKt__StringsKt.isBlank(unfinishedReplayId)) || !StringsKt__StringsKt.contains$default((CharSequence) name, (CharSequence) unfinishedReplayId, false, 2, (Object) null))) {
                    io.sentry.util.e.a(file);
                }
            }
        }
    }

    public static /* synthetic */ void cleanupReplays$default(ReplayIntegration replayIntegration, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        replayIntegration.cleanupReplays(str);
    }

    private final void finalizePreviousReplay() {
        SentryOptions sentryOptions = this.options;
        SentryOptions sentryOptions2 = null;
        if (sentryOptions == null) {
            Intrinsics.throwUninitializedPropertyAccessException("options");
            sentryOptions = null;
        }
        dyc executorService = sentryOptions.getExecutorService();
        Intrinsics.checkNotNullExpressionValue(executorService, "options.executorService");
        SentryOptions sentryOptions3 = this.options;
        if (sentryOptions3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("options");
        } else {
            sentryOptions2 = sentryOptions3;
        }
        ExecutorsKt.submitSafely(executorService, sentryOptions2, "ReplayIntegration.finalize_previous_replay", new Runnable() { // from class: io.sentry.android.replay.c
            @Override // java.lang.Runnable
            public final void run() {
                ReplayIntegration.finalizePreviousReplay$lambda$5(this.f21632a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void finalizePreviousReplay$lambda$5(ReplayIntegration this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SentryOptions sentryOptions = this$0.options;
        if (sentryOptions == null) {
            Intrinsics.throwUninitializedPropertyAccessException("options");
            sentryOptions = null;
        }
        String str = (String) io.sentry.cache.p.x(sentryOptions, "replay.json", String.class);
        if (str == null) {
            cleanupReplays$default(this$0, null, 1, null);
            return;
        }
        io.sentry.protocol.p pVar = new io.sentry.protocol.p(str);
        if (Intrinsics.areEqual(pVar, io.sentry.protocol.p.f21803b)) {
            cleanupReplays$default(this$0, null, 1, null);
            return;
        }
        ReplayCache.Companion companion = ReplayCache.INSTANCE;
        SentryOptions sentryOptions2 = this$0.options;
        if (sentryOptions2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("options");
            sentryOptions2 = null;
        }
        LastSegmentData lastSegmentDataFromDisk$sentry_android_replay_release = companion.fromDisk$sentry_android_replay_release(sentryOptions2, pVar, this$0.replayCacheProvider);
        if (lastSegmentDataFromDisk$sentry_android_replay_release == null) {
            cleanupReplays$default(this$0, null, 1, null);
            return;
        }
        SentryOptions sentryOptions3 = this$0.options;
        if (sentryOptions3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("options");
            sentryOptions3 = null;
        }
        Object objY = io.sentry.cache.p.y(sentryOptions3, "breadcrumbs.json", List.class, new io.sentry.a.C0967a());
        List<io.sentry.a> list = objY instanceof List ? (List) objY : null;
        CaptureStrategy.Companion companion2 = CaptureStrategy.INSTANCE;
        ftc ftcVar = this$0.hub;
        SentryOptions sentryOptions4 = this$0.options;
        if (sentryOptions4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("options");
            sentryOptions4 = null;
        }
        CaptureStrategy.ReplaySegment replaySegmentCreateSegment = companion2.createSegment(ftcVar, sentryOptions4, lastSegmentDataFromDisk$sentry_android_replay_release.getDuration(), lastSegmentDataFromDisk$sentry_android_replay_release.getTimestamp(), pVar, lastSegmentDataFromDisk$sentry_android_replay_release.getId(), lastSegmentDataFromDisk$sentry_android_replay_release.getRecorderConfig().getRecordingHeight(), lastSegmentDataFromDisk$sentry_android_replay_release.getRecorderConfig().getRecordingWidth(), lastSegmentDataFromDisk$sentry_android_replay_release.getReplayType(), lastSegmentDataFromDisk$sentry_android_replay_release.getCache(), lastSegmentDataFromDisk$sentry_android_replay_release.getRecorderConfig().getFrameRate(), lastSegmentDataFromDisk$sentry_android_replay_release.getScreenAtStart(), list, new LinkedList<>(lastSegmentDataFromDisk$sentry_android_replay_release.getEvents()));
        if (replaySegmentCreateSegment instanceof CaptureStrategy.ReplaySegment.Created) {
            c8c hint = j.e(new PreviousReplayHint());
            ftc ftcVar2 = this$0.hub;
            Intrinsics.checkNotNullExpressionValue(hint, "hint");
            ((CaptureStrategy.ReplaySegment.Created) replaySegmentCreateSegment).capture(ftcVar2, hint);
        }
        this$0.cleanupReplays(str);
    }

    private final Random getRandom() {
        return (Random) this.random.getValue();
    }

    private final RootViewsSpy getRootViewsSpy() {
        return (RootViewsSpy) this.rootViewsSpy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onScreenshotRecorded$lambda$0(Ref.ObjectRef screen, io.sentry.e it) {
        Intrinsics.checkNotNullParameter(screen, "$screen");
        Intrinsics.checkNotNullParameter(it, "it");
        String strR = it.r();
        screen.element = strR != null ? StringsKt__StringsKt.substringAfterLast$default(strR, '.', (String) null, 2, (Object) null) : 0;
    }

    private final void registerRootViewListeners() {
        if (this.recorder instanceof OnRootViewsChangedListener) {
            CopyOnWriteArrayList<OnRootViewsChangedListener> listeners = getRootViewsSpy().getListeners();
            Recorder recorder = this.recorder;
            Intrinsics.checkNotNull(recorder, "null cannot be cast to non-null type io.sentry.android.replay.OnRootViewsChangedListener");
            listeners.add((OnRootViewsChangedListener) recorder);
        }
        getRootViewsSpy().getListeners().add(this.gestureRecorder);
    }

    private final void unregisterRootViewListeners() {
        if (this.recorder instanceof OnRootViewsChangedListener) {
            CopyOnWriteArrayList<OnRootViewsChangedListener> listeners = getRootViewsSpy().getListeners();
            Recorder recorder = this.recorder;
            Intrinsics.checkNotNull(recorder, "null cannot be cast to non-null type io.sentry.android.replay.OnRootViewsChangedListener");
            listeners.remove((OnRootViewsChangedListener) recorder);
        }
        getRootViewsSpy().getListeners().remove(this.gestureRecorder);
    }

    @Override // defpackage.flk
    public void captureReplay(@Nullable Boolean isTerminating) {
        if (this.isEnabled.get() && this.isRecording.get()) {
            io.sentry.protocol.p pVar = io.sentry.protocol.p.f21803b;
            CaptureStrategy captureStrategy = this.captureStrategy;
            SentryOptions sentryOptions = null;
            if (pVar.equals(captureStrategy != null ? captureStrategy.getCurrentReplayId() : null)) {
                SentryOptions sentryOptions2 = this.options;
                if (sentryOptions2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("options");
                } else {
                    sentryOptions = sentryOptions2;
                }
                sentryOptions.getLogger().c(SentryLevel.DEBUG, "Replay id is not set, not capturing for event", new Object[0]);
                return;
            }
            CaptureStrategy captureStrategy2 = this.captureStrategy;
            if (captureStrategy2 != null) {
                captureStrategy2.captureReplay(Intrinsics.areEqual(isTerminating, Boolean.TRUE), new Function1<Date, Unit>() { // from class: io.sentry.android.replay.ReplayIntegration.captureReplay.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public /* bridge */ /* synthetic */ Unit invoke2(Date date) {
                        invoke2(date);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Date newTimestamp) {
                        Intrinsics.checkNotNullParameter(newTimestamp, "newTimestamp");
                        CaptureStrategy captureStrategy3 = ReplayIntegration.this.captureStrategy;
                        if (captureStrategy3 != null) {
                            CaptureStrategy captureStrategy4 = ReplayIntegration.this.captureStrategy;
                            Integer numValueOf = captureStrategy4 != null ? Integer.valueOf(captureStrategy4.getCurrentSegment()) : null;
                            Intrinsics.checkNotNull(numValueOf);
                            captureStrategy3.setCurrentSegment(numValueOf.intValue() + 1);
                        }
                        CaptureStrategy captureStrategy5 = ReplayIntegration.this.captureStrategy;
                        if (captureStrategy5 == null) {
                            return;
                        }
                        captureStrategy5.setSegmentTimestamp(newTimestamp);
                    }
                });
            }
            CaptureStrategy captureStrategy3 = this.captureStrategy;
            this.captureStrategy = captureStrategy3 != null ? captureStrategy3.convert() : null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        z zVarG;
        if (this.isEnabled.get()) {
            SentryOptions sentryOptions = this.options;
            if (sentryOptions == null) {
                Intrinsics.throwUninitializedPropertyAccessException("options");
                sentryOptions = null;
            }
            sentryOptions.getConnectionStatusProvider().c(this);
            ftc ftcVar = this.hub;
            if (ftcVar != null && (zVarG = ftcVar.g()) != null) {
                zVarG.M(this);
            }
            try {
                this.context.unregisterComponentCallbacks(this);
            } catch (Throwable unused) {
            }
            stop();
            Recorder recorder = this.recorder;
            if (recorder != null) {
                recorder.close();
            }
            this.recorder = null;
        }
    }

    @Override // defpackage.flk
    @NotNull
    /* JADX INFO: renamed from: getBreadcrumbConverter, reason: from getter */
    public elk getReplayBreadcrumbConverter() {
        return this.replayBreadcrumbConverter;
    }

    @Nullable
    public final File getReplayCacheDir() {
        CaptureStrategy captureStrategy = this.captureStrategy;
        if (captureStrategy != null) {
            return captureStrategy.getReplayCacheDir();
        }
        return null;
    }

    @NotNull
    public io.sentry.protocol.p getReplayId() {
        io.sentry.protocol.p currentReplayId;
        CaptureStrategy captureStrategy = this.captureStrategy;
        if (captureStrategy != null && (currentReplayId = captureStrategy.getCurrentReplayId()) != null) {
            return currentReplayId;
        }
        io.sentry.protocol.p EMPTY_ID = io.sentry.protocol.p.f21803b;
        Intrinsics.checkNotNullExpressionValue(EMPTY_ID, "EMPTY_ID");
        return EMPTY_ID;
    }

    @NotNull
    /* JADX INFO: renamed from: isEnabled$sentry_android_replay_release, reason: from getter */
    public final AtomicBoolean getIsEnabled() {
        return this.isEnabled;
    }

    public boolean isRecording() {
        return this.isRecording.get();
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        ScreenshotRecorderConfig screenshotRecorderConfigFrom;
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        if (this.isEnabled.get() && this.isRecording.get()) {
            Recorder recorder = this.recorder;
            if (recorder != null) {
                recorder.stop();
            }
            Function1<Boolean, ScreenshotRecorderConfig> function1 = this.recorderConfigProvider;
            ScreenshotRecorderConfig screenshotRecorderConfig = null;
            if (function1 == null || (screenshotRecorderConfigFrom = function1.invoke2(Boolean.TRUE)) == null) {
                ScreenshotRecorderConfig.Companion companion = ScreenshotRecorderConfig.INSTANCE;
                Context context = this.context;
                SentryOptions sentryOptions = this.options;
                if (sentryOptions == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("options");
                    sentryOptions = null;
                }
                SentryReplayOptions sentryReplayOptionsA = sentryOptions.getExperimental().a();
                Intrinsics.checkNotNullExpressionValue(sentryReplayOptionsA, "options.experimental.sessionReplay");
                screenshotRecorderConfigFrom = companion.from(context, sentryReplayOptionsA);
            }
            this.recorderConfig = screenshotRecorderConfigFrom;
            CaptureStrategy captureStrategy = this.captureStrategy;
            if (captureStrategy != null) {
                if (screenshotRecorderConfigFrom == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("recorderConfig");
                    screenshotRecorderConfigFrom = null;
                }
                captureStrategy.onConfigurationChanged(screenshotRecorderConfigFrom);
            }
            Recorder recorder2 = this.recorder;
            if (recorder2 != null) {
                ScreenshotRecorderConfig screenshotRecorderConfig2 = this.recorderConfig;
                if (screenshotRecorderConfig2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("recorderConfig");
                } else {
                    screenshotRecorderConfig = screenshotRecorderConfig2;
                }
                recorder2.start(screenshotRecorderConfig);
            }
        }
    }

    @Override // io.sentry.IConnectionStatusProvider.a
    public void onConnectionStatusChanged(@NotNull IConnectionStatusProvider.ConnectionStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        if (this.captureStrategy instanceof SessionCaptureStrategy) {
            if (status == IConnectionStatusProvider.ConnectionStatus.DISCONNECTED) {
                pause();
            } else {
                resume();
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // io.sentry.transport.z.b
    public void onRateLimitChanged(@NotNull z rateLimiter) {
        Intrinsics.checkNotNullParameter(rateLimiter, "rateLimiter");
        if (this.captureStrategy instanceof SessionCaptureStrategy) {
            if (rateLimiter.o(DataCategory.All) || rateLimiter.o(DataCategory.Replay)) {
                pause();
            } else {
                resume();
            }
        }
    }

    @Override // io.sentry.android.replay.ScreenshotRecorderCallback
    public void onScreenshotRecorded(@NotNull final Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ftc ftcVar = this.hub;
        if (ftcVar != null) {
            ftcVar.v(new hgl() { // from class: io.sentry.android.replay.d
                @Override // defpackage.hgl
                public final void a(io.sentry.e eVar) {
                    ReplayIntegration.onScreenshotRecorded$lambda$0(objectRef, eVar);
                }
            });
        }
        CaptureStrategy captureStrategy = this.captureStrategy;
        if (captureStrategy != null) {
            captureStrategy.onScreenshotRecorded(bitmap, new Function2<ReplayCache, Long, Unit>() { // from class: io.sentry.android.replay.ReplayIntegration.onScreenshotRecorded.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(ReplayCache replayCache, Long l) throws IOException {
                    invoke(replayCache, l.longValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull ReplayCache onScreenshotRecorded, long j) throws IOException {
                    Intrinsics.checkNotNullParameter(onScreenshotRecorded, "$this$onScreenshotRecorded");
                    onScreenshotRecorded.addFrame$sentry_android_replay_release(bitmap, j, objectRef.element);
                    this.checkCanRecord();
                }
            });
        }
    }

    @Override // io.sentry.android.replay.gestures.TouchRecorderCallback
    public void onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        CaptureStrategy captureStrategy = this.captureStrategy;
        if (captureStrategy != null) {
            captureStrategy.onTouchEvent(event);
        }
    }

    @Override // defpackage.flk
    public void pause() {
        if (this.isEnabled.get() && this.isRecording.get()) {
            Recorder recorder = this.recorder;
            if (recorder != null) {
                recorder.pause();
            }
            CaptureStrategy captureStrategy = this.captureStrategy;
            if (captureStrategy != null) {
                captureStrategy.pause();
            }
        }
    }

    @Override // defpackage.ucd
    public void register(@NotNull ftc hub, @NotNull SentryOptions options) {
        Recorder windowRecorder;
        GestureRecorder gestureRecorder;
        Intrinsics.checkNotNullParameter(hub, "hub");
        Intrinsics.checkNotNullParameter(options, "options");
        this.options = options;
        if (!options.getExperimental().a().n() && !options.getExperimental().a().o()) {
            options.getLogger().c(SentryLevel.INFO, "Session replay is disabled, no sample rate specified", new Object[0]);
            return;
        }
        this.hub = hub;
        Function0<Recorder> function0 = this.recorderProvider;
        if (function0 == null || (windowRecorder = function0.invoke()) == null) {
            windowRecorder = new WindowRecorder(options, this, this.mainLooperHandler);
        }
        this.recorder = windowRecorder;
        Function0<GestureRecorder> function1 = this.gestureRecorderProvider;
        if (function1 == null || (gestureRecorder = function1.invoke()) == null) {
            gestureRecorder = new GestureRecorder(options, this);
        }
        this.gestureRecorder = gestureRecorder;
        this.isEnabled.set(true);
        options.getConnectionStatusProvider().d(this);
        z zVarG = hub.g();
        if (zVarG != null) {
            zVarG.d(this);
        }
        try {
            this.context.registerComponentCallbacks(this);
        } catch (Throwable th) {
            options.getLogger().a(SentryLevel.INFO, "ComponentCallbacks is not available, orientation changes won't be handled by Session replay", th);
        }
        k.a("Replay");
        kvl.c().b("maven:io.sentry:sentry-android-replay", "7.18.0");
        finalizePreviousReplay();
    }

    @Override // defpackage.flk
    public void resume() {
        if (this.isEnabled.get() && this.isRecording.get()) {
            CaptureStrategy captureStrategy = this.captureStrategy;
            if (captureStrategy != null) {
                captureStrategy.resume();
            }
            Recorder recorder = this.recorder;
            if (recorder != null) {
                recorder.resume();
            }
        }
    }

    public void setBreadcrumbConverter(@NotNull elk converter) {
        Intrinsics.checkNotNullParameter(converter, "converter");
        this.replayBreadcrumbConverter = converter;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.flk
    public void start() {
        ScreenshotRecorderConfig screenshotRecorderConfigFrom;
        CaptureStrategy bufferCaptureStrategy;
        SentryOptions sentryOptions;
        CaptureStrategy captureStrategyInvoke2;
        SentryOptions sentryOptions2;
        ScreenshotRecorderConfig screenshotRecorderConfig;
        if (this.isEnabled.get()) {
            ScreenshotRecorderConfig screenshotRecorderConfig2 = null;
            SentryOptions sentryOptions3 = null;
            SentryOptions sentryOptions4 = null;
            if (this.isRecording.getAndSet(true)) {
                SentryOptions sentryOptions5 = this.options;
                if (sentryOptions5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("options");
                } else {
                    sentryOptions3 = sentryOptions5;
                }
                sentryOptions3.getLogger().c(SentryLevel.DEBUG, "Session replay is already being recorded, not starting a new one", new Object[0]);
                return;
            }
            Random random = getRandom();
            SentryOptions sentryOptions6 = this.options;
            if (sentryOptions6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("options");
                sentryOptions6 = null;
            }
            boolean zSample = SamplingKt.sample(random, sentryOptions6.getExperimental().a().j());
            if (!zSample) {
                SentryOptions sentryOptions7 = this.options;
                if (sentryOptions7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("options");
                    sentryOptions7 = null;
                }
                if (!sentryOptions7.getExperimental().a().o()) {
                    SentryOptions sentryOptions8 = this.options;
                    if (sentryOptions8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("options");
                    } else {
                        sentryOptions4 = sentryOptions8;
                    }
                    sentryOptions4.getLogger().c(SentryLevel.INFO, "Session replay is not started, full session was not sampled and onErrorSampleRate is not specified", new Object[0]);
                    return;
                }
            }
            Function1<Boolean, ScreenshotRecorderConfig> function1 = this.recorderConfigProvider;
            if (function1 == null || (screenshotRecorderConfigFrom = function1.invoke2(Boolean.FALSE)) == null) {
                ScreenshotRecorderConfig.Companion companion = ScreenshotRecorderConfig.INSTANCE;
                Context context = this.context;
                SentryOptions sentryOptions9 = this.options;
                if (sentryOptions9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("options");
                    sentryOptions9 = null;
                }
                SentryReplayOptions sentryReplayOptionsA = sentryOptions9.getExperimental().a();
                Intrinsics.checkNotNullExpressionValue(sentryReplayOptionsA, "options.experimental.sessionReplay");
                screenshotRecorderConfigFrom = companion.from(context, sentryReplayOptionsA);
            }
            this.recorderConfig = screenshotRecorderConfigFrom;
            Function1<? super Boolean, ? extends CaptureStrategy> function2 = this.replayCaptureStrategyProvider;
            if (function2 == null || (captureStrategyInvoke2 = function2.invoke2(Boolean.valueOf(zSample))) == null) {
                if (zSample) {
                    SentryOptions sentryOptions10 = this.options;
                    if (sentryOptions10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("options");
                        sentryOptions2 = null;
                    } else {
                        sentryOptions2 = sentryOptions10;
                    }
                    bufferCaptureStrategy = new SessionCaptureStrategy(sentryOptions2, this.hub, this.dateProvider, null, this.replayCacheProvider, 8, null);
                } else {
                    SentryOptions sentryOptions11 = this.options;
                    if (sentryOptions11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("options");
                        sentryOptions = null;
                    } else {
                        sentryOptions = sentryOptions11;
                    }
                    bufferCaptureStrategy = new BufferCaptureStrategy(sentryOptions, this.hub, this.dateProvider, getRandom(), null, this.replayCacheProvider, 16, null);
                }
                captureStrategyInvoke2 = bufferCaptureStrategy;
            }
            CaptureStrategy captureStrategy = captureStrategyInvoke2;
            this.captureStrategy = captureStrategy;
            ScreenshotRecorderConfig screenshotRecorderConfig3 = this.recorderConfig;
            if (screenshotRecorderConfig3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recorderConfig");
                screenshotRecorderConfig = null;
            } else {
                screenshotRecorderConfig = screenshotRecorderConfig3;
            }
            CaptureStrategy.DefaultImpls.start$default(captureStrategy, screenshotRecorderConfig, 0, null, null, 14, null);
            Recorder recorder = this.recorder;
            if (recorder != null) {
                ScreenshotRecorderConfig screenshotRecorderConfig4 = this.recorderConfig;
                if (screenshotRecorderConfig4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("recorderConfig");
                } else {
                    screenshotRecorderConfig2 = screenshotRecorderConfig4;
                }
                recorder.start(screenshotRecorderConfig2);
            }
            registerRootViewListeners();
        }
    }

    @Override // defpackage.flk
    public void stop() {
        if (this.isEnabled.get() && this.isRecording.get()) {
            unregisterRootViewListeners();
            Recorder recorder = this.recorder;
            if (recorder != null) {
                recorder.stop();
            }
            GestureRecorder gestureRecorder = this.gestureRecorder;
            if (gestureRecorder != null) {
                gestureRecorder.stop();
            }
            CaptureStrategy captureStrategy = this.captureStrategy;
            if (captureStrategy != null) {
                captureStrategy.stop();
            }
            this.isRecording.set(false);
            CaptureStrategy captureStrategy2 = this.captureStrategy;
            if (captureStrategy2 != null) {
                captureStrategy2.close();
            }
            this.captureStrategy = null;
        }
    }

    @Override // io.sentry.android.replay.ScreenshotRecorderCallback
    public void onScreenshotRecorded(@NotNull final File screenshot, final long frameTimestamp) {
        Intrinsics.checkNotNullParameter(screenshot, "screenshot");
        CaptureStrategy captureStrategy = this.captureStrategy;
        if (captureStrategy != null) {
            CaptureStrategy.DefaultImpls.onScreenshotRecorded$default(captureStrategy, null, new Function2<ReplayCache, Long, Unit>() { // from class: io.sentry.android.replay.ReplayIntegration.onScreenshotRecorded.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(ReplayCache replayCache, Long l) {
                    invoke(replayCache, l.longValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull ReplayCache onScreenshotRecorded, long j) {
                    Intrinsics.checkNotNullParameter(onScreenshotRecorded, "$this$onScreenshotRecorded");
                    ReplayCache.addFrame$default(onScreenshotRecorded, screenshot, frameTimestamp, null, 4, null);
                    this.checkCanRecord();
                }
            }, 1, null);
        }
    }

    public /* synthetic */ ReplayIntegration(Context context, p pVar, Function0 function0, Function1 function1, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, pVar, (i & 4) != 0 ? null : function0, (i & 8) != 0 ? null : function1, (i & 16) != 0 ? null : function2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReplayIntegration(@NotNull Context context, @NotNull p dateProvider) {
        this(ContextKt.appContext(context), dateProvider, null, null, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
    }

    public /* synthetic */ ReplayIntegration(Context context, p pVar, Function0 function0, Function1 function1, Function2 function2, Function1 function3, MainLooperHandler mainLooperHandler, Function0 function4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, pVar, function0, function1, function2, (i & 32) != 0 ? null : function3, (i & 64) != 0 ? null : mainLooperHandler, (i & 128) != 0 ? null : function4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReplayIntegration(@NotNull Context context, @NotNull p dateProvider, @Nullable Function0<? extends Recorder> function0, @Nullable Function1<? super Boolean, ScreenshotRecorderConfig> function1, @Nullable Function2<? super io.sentry.protocol.p, ? super ScreenshotRecorderConfig, ReplayCache> function2, @Nullable Function1<? super Boolean, ? extends CaptureStrategy> function3, @Nullable MainLooperHandler mainLooperHandler, @Nullable Function0<GestureRecorder> function4) {
        this(ContextKt.appContext(context), dateProvider, function0, function1, function2);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.replayCaptureStrategyProvider = function3;
        this.mainLooperHandler = mainLooperHandler == null ? new MainLooperHandler(null, 1, null) : mainLooperHandler;
        this.gestureRecorderProvider = function4;
    }
}
