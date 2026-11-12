package io.sentry.android.replay.capture;

import android.view.MotionEvent;
import com.miui.tsmclient.database.DatabaseConstants;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.ftc;
import defpackage.yq5;
import io.sentry.SentryOptions;
import io.sentry.SentryReplayEvent;
import io.sentry.android.replay.ReplayCache;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.android.replay.gestures.ReplayGestureConverter;
import io.sentry.android.replay.util.ExecutorsKt;
import io.sentry.android.replay.util.PersistableLinkedList;
import io.sentry.rrweb.RRWebIncrementalSnapshotEvent;
import io.sentry.transport.p;
import java.io.File;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\n\b \u0018\u0000 \u008e\u00012\u00020\u0001:\u0006\u008e\u0001\u008f\u0001\u0090\u0001Bl\u0012\u0006\u0010<\u001a\u00020;\u0012\b\u0010?\u001a\u0004\u0018\u00010>\u0012\u0006\u0010B\u001a\u00020A\u0012\u000b\b\u0002\u0010\u008b\u0001\u001a\u0004\u0018\u00010G\u0012:\b\u0002\u0010E\u001a4\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020'\u0018\u00010D¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u008f\u0001\u0010\u000f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00018\u00000\r\"\u0004\b\u0000\u0010\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\u00042S\b\u0006\u0010\f\u001aM\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0005\u0012\u0015\u0012\u0013\u0018\u00018\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00018\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006H\u0082\b¢\u0006\u0004\b\u000f\u0010\u0010J\u008d\u0001\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\u00042S\b\u0006\u0010\f\u001aM\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0005\u0012\u0015\u0012\u0013\u0018\u00018\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00018\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006H\u0082\b¢\u0006\u0004\b\u0011\u0010\u0010Jy\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u00022S\b\u0004\u0010\f\u001aM\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0005\u0012\u0015\u0012\u0013\u0018\u00018\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00018\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006H\u0082\b¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010\u001eJ\u008d\u0001\u00102\u001a\u0002012\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u00152\b\b\u0002\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010)\u001a\u00020\u00152\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+2\u000e\b\u0002\u00100\u001a\b\u0012\u0004\u0012\u00020/0.H\u0004¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020\u000b2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u000bH\u0016¢\u0006\u0004\b:\u0010\u001eR\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010?\u001a\u0004\u0018\u00010>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CRF\u0010E\u001a4\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020'\u0018\u00010D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001b\u0010L\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u001a\u0010Q\u001a\u00020P8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bQ\u0010SR$\u0010(\u001a\u0004\u0018\u00010'8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b(\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR+\u0010\u0014\u001a\u00020\u00132\u0006\u0010Y\u001a\u00020\u00138D@DX\u0084\u008e\u0002¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u00105R/\u0010d\u001a\u0004\u0018\u00010#2\b\u0010Y\u001a\u0004\u0018\u00010#8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b_\u0010[\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u001a\u0010f\u001a\u00020e8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR/\u0010*\u001a\u0004\u0018\u00010\u00042\b\u0010Y\u001a\u0004\u0018\u00010\u00048D@DX\u0084\u008e\u0002¢\u0006\u0012\n\u0004\bj\u0010[\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR+\u0010t\u001a\u00020\u00172\u0006\u0010Y\u001a\u00020\u00178V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bo\u0010[\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR+\u0010z\u001a\u00020\u00152\u0006\u0010Y\u001a\u00020\u00158V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bu\u0010[\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR+\u0010\u001a\u001a\u00020\u00192\u0006\u0010Y\u001a\u00020\u00198V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b{\u0010[\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR%\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020/0.8\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001e\u0010\u0086\u0001\u001a\u00020G8DX\u0084\u0084\u0002¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010I\u001a\u0005\b\u0085\u0001\u0010KR\u001a\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0087\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001¨\u0006\u0091\u0001"}, d2 = {"Lio/sentry/android/replay/capture/BaseCaptureStrategy;", "Lio/sentry/android/replay/capture/CaptureStrategy;", "T", "initialValue", "", "propertyName", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "oldValue", "newValue", "", "onChange", "Lkotlin/properties/ReadWriteProperty;", "", "persistableAtomicNullable", "(Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function3;)Lkotlin/properties/ReadWriteProperty;", "persistableAtomic", "(Lkotlin/jvm/functions/Function3;)Lkotlin/properties/ReadWriteProperty;", "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "recorderConfig", "", "segmentId", "Lio/sentry/protocol/p;", "replayId", "Lio/sentry/SentryReplayEvent$ReplayType;", "replayType", StatConstants.PARAM_START, "(Lio/sentry/android/replay/ScreenshotRecorderConfig;ILio/sentry/protocol/p;Lio/sentry/SentryReplayEvent$ReplayType;)V", "resume", "()V", "pause", BroadcastsKt.SILENT_PUSHING_STOP, "", "duration", "Ljava/util/Date;", "currentSegmentTimestamp", "height", "width", "Lio/sentry/android/replay/ReplayCache;", DatabaseConstants.TABLE_CACHE, "frameRate", "screenAtStart", "", "Lio/sentry/a;", "breadcrumbs", "Ljava/util/LinkedList;", "Lio/sentry/rrweb/b;", "events", "Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment;", "createSegmentInternal", "(JLjava/util/Date;Lio/sentry/protocol/p;IIILio/sentry/SentryReplayEvent$ReplayType;Lio/sentry/android/replay/ReplayCache;ILjava/lang/String;Ljava/util/List;Ljava/util/LinkedList;)Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment;", "onConfigurationChanged", "(Lio/sentry/android/replay/ScreenshotRecorderConfig;)V", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)V", Constants.EXTRA_CLOSE_TAI, "Lio/sentry/SentryOptions;", "options", "Lio/sentry/SentryOptions;", "Lftc;", "hub", "Lftc;", "Lio/sentry/transport/p;", "dateProvider", "Lio/sentry/transport/p;", "Lkotlin/Function2;", "replayCacheProvider", "Lkotlin/jvm/functions/Function2;", "Ljava/util/concurrent/ScheduledExecutorService;", "persistingExecutor$delegate", "Lkotlin/Lazy;", "getPersistingExecutor", "()Ljava/util/concurrent/ScheduledExecutorService;", "persistingExecutor", "Lio/sentry/android/replay/gestures/ReplayGestureConverter;", "gestureConverter", "Lio/sentry/android/replay/gestures/ReplayGestureConverter;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isTerminating", "Ljava/util/concurrent/atomic/AtomicBoolean;", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "Lio/sentry/android/replay/ReplayCache;", "getCache", "()Lio/sentry/android/replay/ReplayCache;", "setCache", "(Lio/sentry/android/replay/ReplayCache;)V", "<set-?>", "recorderConfig$delegate", "Lkotlin/properties/ReadWriteProperty;", "getRecorderConfig", "()Lio/sentry/android/replay/ScreenshotRecorderConfig;", "setRecorderConfig", "segmentTimestamp$delegate", "getSegmentTimestamp", "()Ljava/util/Date;", "setSegmentTimestamp", "(Ljava/util/Date;)V", "segmentTimestamp", "Ljava/util/concurrent/atomic/AtomicLong;", "replayStartTimestamp", "Ljava/util/concurrent/atomic/AtomicLong;", "getReplayStartTimestamp", "()Ljava/util/concurrent/atomic/AtomicLong;", "screenAtStart$delegate", "getScreenAtStart", "()Ljava/lang/String;", "setScreenAtStart", "(Ljava/lang/String;)V", "currentReplayId$delegate", "getCurrentReplayId", "()Lio/sentry/protocol/p;", "setCurrentReplayId", "(Lio/sentry/protocol/p;)V", "currentReplayId", "currentSegment$delegate", "getCurrentSegment", "()I", "setCurrentSegment", "(I)V", "currentSegment", "replayType$delegate", "getReplayType", "()Lio/sentry/SentryReplayEvent$ReplayType;", "setReplayType", "(Lio/sentry/SentryReplayEvent$ReplayType;)V", "currentEvents", "Ljava/util/LinkedList;", "getCurrentEvents", "()Ljava/util/LinkedList;", "replayExecutor$delegate", "getReplayExecutor", "replayExecutor", "Ljava/io/File;", "getReplayCacheDir", "()Ljava/io/File;", "replayCacheDir", "executor", "<init>", "(Lio/sentry/SentryOptions;Lftc;Lio/sentry/transport/p;Ljava/util/concurrent/ScheduledExecutorService;Lkotlin/jvm/functions/Function2;)V", "Companion", "ReplayExecutorServiceThreadFactory", "ReplayPersistingExecutorServiceThreadFactory", "sentry-android-replay_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBaseCaptureStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCaptureStrategy.kt\nio/sentry/android/replay/capture/BaseCaptureStrategy\n*L\n1#1,236:1\n234#1:237\n199#1:238\n220#1:239\n192#1,8:240\n220#1:248\n192#1,8:249\n220#1:257\n222#1,8:258\n199#1:266\n220#1:267\n222#1,8:268\n199#1:276\n220#1:277\n222#1,8:278\n199#1:286\n220#1:287\n199#1:288\n220#1:289\n199#1:290\n220#1:291\n199#1:292\n220#1:293\n*S KotlinDebug\n*F\n+ 1 BaseCaptureStrategy.kt\nio/sentry/android/replay/capture/BaseCaptureStrategy\n*L\n64#1:237\n64#1:238\n64#1:239\n74#1:240,8\n74#1:248\n78#1:249,8\n78#1:257\n79#1:258,8\n79#1:266\n79#1:267\n80#1:268,8\n80#1:276\n80#1:277\n83#1:278,8\n83#1:286\n83#1:287\n229#1:288\n229#1:289\n229#1:290\n229#1:291\n234#1:292\n234#1:293\n*E\n"})
public abstract class BaseCaptureStrategy implements CaptureStrategy {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(BaseCaptureStrategy.class, "recorderConfig", "getRecorderConfig()Lio/sentry/android/replay/ScreenshotRecorderConfig;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(BaseCaptureStrategy.class, "segmentTimestamp", "getSegmentTimestamp()Ljava/util/Date;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(BaseCaptureStrategy.class, "screenAtStart", "getScreenAtStart()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(BaseCaptureStrategy.class, "currentReplayId", "getCurrentReplayId()Lio/sentry/protocol/SentryId;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(BaseCaptureStrategy.class, "currentSegment", "getCurrentSegment()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(BaseCaptureStrategy.class, "replayType", "getReplayType()Lio/sentry/SentryReplayEvent$ReplayType;", 0))};

    @NotNull
    private static final String TAG = "CaptureStrategy";

    @Nullable
    private ReplayCache cache;

    @NotNull
    private final LinkedList<io.sentry.rrweb.b> currentEvents;

    /* JADX INFO: renamed from: currentReplayId$delegate, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty currentReplayId;

    /* JADX INFO: renamed from: currentSegment$delegate, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty currentSegment;

    @NotNull
    private final p dateProvider;

    @NotNull
    private final ReplayGestureConverter gestureConverter;

    @Nullable
    private final ftc hub;

    @NotNull
    private final AtomicBoolean isTerminating;

    @NotNull
    private final SentryOptions options;

    /* JADX INFO: renamed from: persistingExecutor$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy persistingExecutor;

    /* JADX INFO: renamed from: recorderConfig$delegate, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty recorderConfig;

    @Nullable
    private final Function2<io.sentry.protocol.p, ScreenshotRecorderConfig, ReplayCache> replayCacheProvider;

    /* JADX INFO: renamed from: replayExecutor$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy replayExecutor;

    @NotNull
    private final AtomicLong replayStartTimestamp;

    /* JADX INFO: renamed from: replayType$delegate, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty replayType;

    /* JADX INFO: renamed from: screenAtStart$delegate, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty screenAtStart;

    /* JADX INFO: renamed from: segmentTimestamp$delegate, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty segmentTimestamp;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lio/sentry/android/replay/capture/BaseCaptureStrategy$ReplayExecutorServiceThreadFactory;", "Ljava/util/concurrent/ThreadFactory;", "()V", "cnt", "", "newThread", "Ljava/lang/Thread;", "r", "Ljava/lang/Runnable;", "sentry-android-replay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ReplayExecutorServiceThreadFactory implements ThreadFactory {
        private int cnt;

        @Override // java.util.concurrent.ThreadFactory
        @NotNull
        public Thread newThread(@NotNull Runnable r2) {
            Intrinsics.checkNotNullParameter(r2, "r");
            StringBuilder sb = new StringBuilder();
            sb.append("SentryReplayIntegration-");
            int i = this.cnt;
            this.cnt = i + 1;
            sb.append(i);
            Thread thread = new Thread(r2, sb.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lio/sentry/android/replay/capture/BaseCaptureStrategy$ReplayPersistingExecutorServiceThreadFactory;", "Ljava/util/concurrent/ThreadFactory;", "()V", "cnt", "", "newThread", "Ljava/lang/Thread;", "r", "Ljava/lang/Runnable;", "sentry-android-replay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ReplayPersistingExecutorServiceThreadFactory implements ThreadFactory {
        private int cnt;

        @Override // java.util.concurrent.ThreadFactory
        @NotNull
        public Thread newThread(@NotNull Runnable r2) {
            Intrinsics.checkNotNullParameter(r2, "r");
            StringBuilder sb = new StringBuilder();
            sb.append("SentryReplayPersister-");
            int i = this.cnt;
            this.cnt = i + 1;
            sb.append(i);
            Thread thread = new Thread(r2, sb.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: io.sentry.android.replay.capture.BaseCaptureStrategy$persistableAtomicNullable$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J&\u0010\u0005\u001a\u0004\u0018\u00018\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0096\u0002¢\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0002J.\u0010\u000e\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000H\u0096\u0002¢\u0006\u0002\u0010\u000fR\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"io/sentry/android/replay/capture/BaseCaptureStrategy$persistableAtomicNullable$2", "Lkotlin/properties/ReadWriteProperty;", "", "value", "Ljava/util/concurrent/atomic/AtomicReference;", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "runInBackground", "", "task", "Lkotlin/Function0;", "setValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "sentry-android-replay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nBaseCaptureStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCaptureStrategy.kt\nio/sentry/android/replay/capture/BaseCaptureStrategy$persistableAtomicNullable$2\n*L\n1#1,236:1\n*E\n"})
    public static final class AnonymousClass2<T> implements ReadWriteProperty<Object, T> {
        final /* synthetic */ Function3<String, T, T, Unit> $onChange;
        final /* synthetic */ String $propertyName;
        final /* synthetic */ BaseCaptureStrategy this$0;

        @NotNull
        private final AtomicReference<T> value;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(T t, BaseCaptureStrategy baseCaptureStrategy, Function3<? super String, ? super T, ? super T, Unit> function3, String str) {
            this.this$0 = baseCaptureStrategy;
            this.$onChange = function3;
            this.$propertyName = str;
            this.value = new AtomicReference<>(t);
        }

        private final void runInBackground(final Function0<Unit> task) {
            if (this.this$0.options.getMainThreadChecker().a()) {
                ExecutorsKt.submitSafely(this.this$0.getPersistingExecutor(), this.this$0.options, "CaptureStrategy.runInBackground", new Runnable() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$persistableAtomicNullable$2$runInBackground$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        task.invoke();
                    }
                });
            } else {
                task.invoke();
            }
        }

        @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
        @Nullable
        public T getValue(@Nullable Object thisRef, @NotNull KProperty<?> property) {
            Intrinsics.checkNotNullParameter(property, "property");
            return this.value.get();
        }

        @Override // kotlin.properties.ReadWriteProperty
        public void setValue(@Nullable Object thisRef, @NotNull KProperty<?> property, @Nullable final T value) {
            Intrinsics.checkNotNullParameter(property, "property");
            final T andSet = this.value.getAndSet(value);
            if (Intrinsics.areEqual(andSet, value)) {
                return;
            }
            final Function3<String, T, T, Unit> function3 = this.$onChange;
            final String str = this.$propertyName;
            runInBackground(new Function0<Unit>() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$persistableAtomicNullable$2$setValue$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
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
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    function3.invoke(str, andSet, value);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseCaptureStrategy(@NotNull SentryOptions options, @Nullable ftc ftcVar, @NotNull p dateProvider, @Nullable final ScheduledExecutorService scheduledExecutorService, @Nullable Function2<? super io.sentry.protocol.p, ? super ScreenshotRecorderConfig, ReplayCache> function2) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.options = options;
        this.hub = ftcVar;
        this.dateProvider = dateProvider;
        this.replayCacheProvider = function2;
        this.persistingExecutor = LazyKt__LazyJVMKt.lazy(new Function0<ScheduledExecutorService>() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$persistingExecutor$2
            @Override // kotlin.jvm.functions.Function0
            public final ScheduledExecutorService invoke() {
                return Executors.newSingleThreadScheduledExecutor(new BaseCaptureStrategy.ReplayPersistingExecutorServiceThreadFactory());
            }
        });
        this.gestureConverter = new ReplayGestureConverter(dateProvider);
        this.isTerminating = new AtomicBoolean(false);
        final Object obj = null;
        final String str = "";
        this.recorderConfig = new ReadWriteProperty<Object, ScreenshotRecorderConfig>(obj, this, str, this) { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$1
            final /* synthetic */ String $propertyName;
            final /* synthetic */ BaseCaptureStrategy this$0;
            final /* synthetic */ BaseCaptureStrategy this$0$inline_fun;

            @NotNull
            private final AtomicReference<ScreenshotRecorderConfig> value;

            {
                this.this$0$inline_fun = this;
                this.$propertyName = str;
                this.this$0 = this;
                this.value = new AtomicReference<>(obj);
            }

            private final void runInBackground(final Function0<Unit> task) {
                if (this.this$0$inline_fun.options.getMainThreadChecker().a()) {
                    ExecutorsKt.submitSafely(this.this$0$inline_fun.getPersistingExecutor(), this.this$0$inline_fun.options, "CaptureStrategy.runInBackground", new Runnable() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            task.invoke();
                        }
                    });
                } else {
                    task.invoke();
                }
            }

            @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
            @Nullable
            public ScreenshotRecorderConfig getValue(@Nullable Object thisRef, @NotNull KProperty<?> property) {
                Intrinsics.checkNotNullParameter(property, "property");
                return this.value.get();
            }

            @Override // kotlin.properties.ReadWriteProperty
            public void setValue(@Nullable Object thisRef, @NotNull KProperty<?> property, @Nullable final ScreenshotRecorderConfig value) {
                Intrinsics.checkNotNullParameter(property, "property");
                final ScreenshotRecorderConfig andSet = this.value.getAndSet(value);
                if (Intrinsics.areEqual(andSet, value)) {
                    return;
                }
                final String str2 = this.$propertyName;
                final BaseCaptureStrategy baseCaptureStrategy = this.this$0;
                runInBackground(new Function0<Unit>() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        Object obj2 = andSet;
                        ScreenshotRecorderConfig screenshotRecorderConfig = (ScreenshotRecorderConfig) value;
                        if (screenshotRecorderConfig == null) {
                            return;
                        }
                        ReplayCache cache = baseCaptureStrategy.getCache();
                        if (cache != null) {
                            cache.persistSegmentValues(ReplayCache.SEGMENT_KEY_HEIGHT, String.valueOf(screenshotRecorderConfig.getRecordingHeight()));
                        }
                        ReplayCache cache2 = baseCaptureStrategy.getCache();
                        if (cache2 != null) {
                            cache2.persistSegmentValues(ReplayCache.SEGMENT_KEY_WIDTH, String.valueOf(screenshotRecorderConfig.getRecordingWidth()));
                        }
                        ReplayCache cache3 = baseCaptureStrategy.getCache();
                        if (cache3 != null) {
                            cache3.persistSegmentValues(ReplayCache.SEGMENT_KEY_FRAME_RATE, String.valueOf(screenshotRecorderConfig.getFrameRate()));
                        }
                        ReplayCache cache4 = baseCaptureStrategy.getCache();
                        if (cache4 != null) {
                            cache4.persistSegmentValues(ReplayCache.SEGMENT_KEY_BIT_RATE, String.valueOf(screenshotRecorderConfig.getBitRate()));
                        }
                    }
                });
            }
        };
        final String str2 = ReplayCache.SEGMENT_KEY_TIMESTAMP;
        this.segmentTimestamp = new ReadWriteProperty<Object, Date>(obj, this, str2, this) { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$1
            final /* synthetic */ String $propertyName;
            final /* synthetic */ BaseCaptureStrategy this$0;
            final /* synthetic */ BaseCaptureStrategy this$0$inline_fun;

            @NotNull
            private final AtomicReference<Date> value;

            {
                this.this$0$inline_fun = this;
                this.$propertyName = str2;
                this.this$0 = this;
                this.value = new AtomicReference<>(obj);
            }

            private final void runInBackground(final Function0<Unit> task) {
                if (this.this$0$inline_fun.options.getMainThreadChecker().a()) {
                    ExecutorsKt.submitSafely(this.this$0$inline_fun.getPersistingExecutor(), this.this$0$inline_fun.options, "CaptureStrategy.runInBackground", new Runnable() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            task.invoke();
                        }
                    });
                } else {
                    task.invoke();
                }
            }

            @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
            @Nullable
            public Date getValue(@Nullable Object thisRef, @NotNull KProperty<?> property) {
                Intrinsics.checkNotNullParameter(property, "property");
                return this.value.get();
            }

            @Override // kotlin.properties.ReadWriteProperty
            public void setValue(@Nullable Object thisRef, @NotNull KProperty<?> property, @Nullable final Date value) {
                Intrinsics.checkNotNullParameter(property, "property");
                final Date andSet = this.value.getAndSet(value);
                if (Intrinsics.areEqual(andSet, value)) {
                    return;
                }
                final String str3 = this.$propertyName;
                final BaseCaptureStrategy baseCaptureStrategy = this.this$0;
                runInBackground(new Function0<Unit>() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        Object obj2 = andSet;
                        Date date = (Date) value;
                        ReplayCache cache = baseCaptureStrategy.getCache();
                        if (cache != null) {
                            cache.persistSegmentValues(ReplayCache.SEGMENT_KEY_TIMESTAMP, date == null ? null : yq5.g(date));
                        }
                    }
                });
            }
        };
        this.replayStartTimestamp = new AtomicLong();
        final String str3 = ReplayCache.SEGMENT_KEY_REPLAY_SCREEN_AT_START;
        this.screenAtStart = new ReadWriteProperty<Object, String>(obj, this, str3, this, str3) { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$2
            final /* synthetic */ String $propertyName;
            final /* synthetic */ String $propertyName$inlined;
            final /* synthetic */ BaseCaptureStrategy this$0;
            final /* synthetic */ BaseCaptureStrategy this$0$inline_fun;

            @NotNull
            private final AtomicReference<String> value;

            {
                this.this$0$inline_fun = this;
                this.$propertyName = str3;
                this.this$0 = this;
                this.$propertyName$inlined = str3;
                this.value = new AtomicReference<>(obj);
            }

            private final void runInBackground(final Function0<Unit> task) {
                if (this.this$0$inline_fun.options.getMainThreadChecker().a()) {
                    ExecutorsKt.submitSafely(this.this$0$inline_fun.getPersistingExecutor(), this.this$0$inline_fun.options, "CaptureStrategy.runInBackground", new Runnable() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$2.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            task.invoke();
                        }
                    });
                } else {
                    task.invoke();
                }
            }

            @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
            @Nullable
            public String getValue(@Nullable Object thisRef, @NotNull KProperty<?> property) {
                Intrinsics.checkNotNullParameter(property, "property");
                return this.value.get();
            }

            @Override // kotlin.properties.ReadWriteProperty
            public void setValue(@Nullable Object thisRef, @NotNull KProperty<?> property, @Nullable final String value) {
                Intrinsics.checkNotNullParameter(property, "property");
                final String andSet = this.value.getAndSet(value);
                if (Intrinsics.areEqual(andSet, value)) {
                    return;
                }
                final String str4 = this.$propertyName;
                final BaseCaptureStrategy baseCaptureStrategy = this.this$0;
                final String str5 = this.$propertyName$inlined;
                runInBackground(new Function0<Unit>() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$2.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        Object obj2 = value;
                        ReplayCache cache = baseCaptureStrategy.getCache();
                        if (cache != null) {
                            cache.persistSegmentValues(str5, String.valueOf(obj2));
                        }
                    }
                });
            }
        };
        final io.sentry.protocol.p pVar = io.sentry.protocol.p.f21803b;
        final String str4 = ReplayCache.SEGMENT_KEY_REPLAY_ID;
        this.currentReplayId = new ReadWriteProperty<Object, io.sentry.protocol.p>(pVar, this, str4, this, str4) { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$1
            final /* synthetic */ String $propertyName;
            final /* synthetic */ String $propertyName$inlined;
            final /* synthetic */ BaseCaptureStrategy this$0;
            final /* synthetic */ BaseCaptureStrategy this$0$inline_fun;

            @NotNull
            private final AtomicReference<io.sentry.protocol.p> value;

            {
                this.this$0$inline_fun = this;
                this.$propertyName = str4;
                this.this$0 = this;
                this.$propertyName$inlined = str4;
                this.value = new AtomicReference<>(pVar);
            }

            private final void runInBackground(final Function0<Unit> task) {
                if (this.this$0$inline_fun.options.getMainThreadChecker().a()) {
                    ExecutorsKt.submitSafely(this.this$0$inline_fun.getPersistingExecutor(), this.this$0$inline_fun.options, "CaptureStrategy.runInBackground", new Runnable() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            task.invoke();
                        }
                    });
                } else {
                    task.invoke();
                }
            }

            @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
            @Nullable
            public io.sentry.protocol.p getValue(@Nullable Object thisRef, @NotNull KProperty<?> property) {
                Intrinsics.checkNotNullParameter(property, "property");
                return this.value.get();
            }

            @Override // kotlin.properties.ReadWriteProperty
            public void setValue(@Nullable Object thisRef, @NotNull KProperty<?> property, @Nullable final io.sentry.protocol.p value) {
                Intrinsics.checkNotNullParameter(property, "property");
                final io.sentry.protocol.p andSet = this.value.getAndSet(value);
                if (Intrinsics.areEqual(andSet, value)) {
                    return;
                }
                final String str5 = this.$propertyName;
                final BaseCaptureStrategy baseCaptureStrategy = this.this$0;
                final String str6 = this.$propertyName$inlined;
                runInBackground(new Function0<Unit>() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        Object obj2 = value;
                        ReplayCache cache = baseCaptureStrategy.getCache();
                        if (cache != null) {
                            cache.persistSegmentValues(str6, String.valueOf(obj2));
                        }
                    }
                });
            }
        };
        final int i = -1;
        final String str5 = ReplayCache.SEGMENT_KEY_ID;
        this.currentSegment = new ReadWriteProperty<Object, Integer>(i, this, str5, this, str5) { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$2
            final /* synthetic */ String $propertyName;
            final /* synthetic */ String $propertyName$inlined;
            final /* synthetic */ BaseCaptureStrategy this$0;
            final /* synthetic */ BaseCaptureStrategy this$0$inline_fun;

            @NotNull
            private final AtomicReference<Integer> value;

            {
                this.this$0$inline_fun = this;
                this.$propertyName = str5;
                this.this$0 = this;
                this.$propertyName$inlined = str5;
                this.value = new AtomicReference<>(i);
            }

            private final void runInBackground(final Function0<Unit> task) {
                if (this.this$0$inline_fun.options.getMainThreadChecker().a()) {
                    ExecutorsKt.submitSafely(this.this$0$inline_fun.getPersistingExecutor(), this.this$0$inline_fun.options, "CaptureStrategy.runInBackground", new Runnable() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$2.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            task.invoke();
                        }
                    });
                } else {
                    task.invoke();
                }
            }

            @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
            @Nullable
            public Integer getValue(@Nullable Object thisRef, @NotNull KProperty<?> property) {
                Intrinsics.checkNotNullParameter(property, "property");
                return this.value.get();
            }

            @Override // kotlin.properties.ReadWriteProperty
            public void setValue(@Nullable Object thisRef, @NotNull KProperty<?> property, @Nullable final Integer value) {
                Intrinsics.checkNotNullParameter(property, "property");
                final Integer andSet = this.value.getAndSet(value);
                if (Intrinsics.areEqual(andSet, value)) {
                    return;
                }
                final String str6 = this.$propertyName;
                final BaseCaptureStrategy baseCaptureStrategy = this.this$0;
                final String str7 = this.$propertyName$inlined;
                runInBackground(new Function0<Unit>() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$2.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        Object obj2 = value;
                        ReplayCache cache = baseCaptureStrategy.getCache();
                        if (cache != null) {
                            cache.persistSegmentValues(str7, String.valueOf(obj2));
                        }
                    }
                });
            }
        };
        final Object obj2 = null;
        final String str6 = ReplayCache.SEGMENT_KEY_REPLAY_TYPE;
        this.replayType = new ReadWriteProperty<Object, SentryReplayEvent.ReplayType>(obj2, this, str6, this, str6) { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$3
            final /* synthetic */ String $propertyName;
            final /* synthetic */ String $propertyName$inlined;
            final /* synthetic */ BaseCaptureStrategy this$0;
            final /* synthetic */ BaseCaptureStrategy this$0$inline_fun;

            @NotNull
            private final AtomicReference<SentryReplayEvent.ReplayType> value;

            {
                this.this$0$inline_fun = this;
                this.$propertyName = str6;
                this.this$0 = this;
                this.$propertyName$inlined = str6;
                this.value = new AtomicReference<>(obj2);
            }

            private final void runInBackground(final Function0<Unit> task) {
                if (this.this$0$inline_fun.options.getMainThreadChecker().a()) {
                    ExecutorsKt.submitSafely(this.this$0$inline_fun.getPersistingExecutor(), this.this$0$inline_fun.options, "CaptureStrategy.runInBackground", new Runnable() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$3.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            task.invoke();
                        }
                    });
                } else {
                    task.invoke();
                }
            }

            @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
            @Nullable
            public SentryReplayEvent.ReplayType getValue(@Nullable Object thisRef, @NotNull KProperty<?> property) {
                Intrinsics.checkNotNullParameter(property, "property");
                return this.value.get();
            }

            @Override // kotlin.properties.ReadWriteProperty
            public void setValue(@Nullable Object thisRef, @NotNull KProperty<?> property, @Nullable final SentryReplayEvent.ReplayType value) {
                Intrinsics.checkNotNullParameter(property, "property");
                final SentryReplayEvent.ReplayType andSet = this.value.getAndSet(value);
                if (Intrinsics.areEqual(andSet, value)) {
                    return;
                }
                final String str7 = this.$propertyName;
                final BaseCaptureStrategy baseCaptureStrategy = this.this$0;
                final String str8 = this.$propertyName$inlined;
                runInBackground(new Function0<Unit>() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$3.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        Object obj3 = value;
                        ReplayCache cache = baseCaptureStrategy.getCache();
                        if (cache != null) {
                            cache.persistSegmentValues(str8, String.valueOf(obj3));
                        }
                    }
                });
            }
        };
        this.currentEvents = new PersistableLinkedList(ReplayCache.SEGMENT_KEY_REPLAY_RECORDING, options, getPersistingExecutor(), new Function0<ReplayCache>() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$currentEvents$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final ReplayCache invoke() {
                return this.this$0.getCache();
            }
        });
        this.replayExecutor = LazyKt__LazyJVMKt.lazy(new Function0<ScheduledExecutorService>() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$replayExecutor$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ScheduledExecutorService invoke() {
                ScheduledExecutorService scheduledExecutorService2 = scheduledExecutorService;
                return scheduledExecutorService2 == null ? Executors.newSingleThreadScheduledExecutor(new BaseCaptureStrategy.ReplayExecutorServiceThreadFactory()) : scheduledExecutorService2;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CaptureStrategy.ReplaySegment createSegmentInternal$default(BaseCaptureStrategy baseCaptureStrategy, long j, Date date, io.sentry.protocol.p pVar, int i, int i2, int i3, SentryReplayEvent.ReplayType replayType, ReplayCache replayCache, int i4, String str, List list, LinkedList linkedList, int i5, Object obj) {
        if (obj == null) {
            return baseCaptureStrategy.createSegmentInternal(j, date, pVar, i, i2, i3, (i5 & 64) != 0 ? baseCaptureStrategy.getReplayType() : replayType, (i5 & 128) != 0 ? baseCaptureStrategy.cache : replayCache, (i5 & 256) != 0 ? baseCaptureStrategy.getRecorderConfig().getFrameRate() : i4, (i5 & 512) != 0 ? baseCaptureStrategy.getScreenAtStart() : str, (i5 & 1024) != 0 ? null : list, (i5 & 2048) != 0 ? baseCaptureStrategy.currentEvents : linkedList);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createSegmentInternal");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ScheduledExecutorService getPersistingExecutor() {
        Object value = this.persistingExecutor.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-persistingExecutor>(...)");
        return (ScheduledExecutorService) value;
    }

    private final <T> ReadWriteProperty<Object, T> persistableAtomic(T initialValue, String propertyName, Function3<? super String, ? super T, ? super T, Unit> onChange) {
        return new AnonymousClass2(initialValue, this, onChange, propertyName);
    }

    public static /* synthetic */ ReadWriteProperty persistableAtomic$default(BaseCaptureStrategy baseCaptureStrategy, Object obj, final String str, Function3 function3, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: persistableAtomic");
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 4) != 0) {
            function3 = new Function3() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy.persistableAtomic.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                    invoke((String) obj3, obj4, obj5);
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable String str2, @Nullable Object obj3, @Nullable Object obj4) {
                    ReplayCache cache = BaseCaptureStrategy.this.getCache();
                    if (cache != null) {
                        cache.persistSegmentValues(str, String.valueOf(obj4));
                    }
                }
            };
        }
        return new AnonymousClass2(obj, baseCaptureStrategy, function3, str);
    }

    private final <T> ReadWriteProperty<Object, T> persistableAtomicNullable(T initialValue, String propertyName, Function3<? super String, ? super T, ? super T, Unit> onChange) {
        return new AnonymousClass2(initialValue, this, onChange, propertyName);
    }

    public static /* synthetic */ ReadWriteProperty persistableAtomicNullable$default(BaseCaptureStrategy baseCaptureStrategy, Object obj, final String str, Function3 function3, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: persistableAtomicNullable");
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 4) != 0) {
            function3 = new Function3() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy.persistableAtomicNullable.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                    invoke((String) obj3, obj4, obj5);
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable String str2, @Nullable Object obj3, @Nullable Object obj4) {
                    ReplayCache cache = BaseCaptureStrategy.this.getCache();
                    if (cache != null) {
                        cache.persistSegmentValues(str, String.valueOf(obj4));
                    }
                }
            };
        }
        return new AnonymousClass2(obj, baseCaptureStrategy, function3, str);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void close() {
        ExecutorsKt.gracefullyShutdown(getReplayExecutor(), this.options);
    }

    @NotNull
    public final CaptureStrategy.ReplaySegment createSegmentInternal(long duration, @NotNull Date currentSegmentTimestamp, @NotNull io.sentry.protocol.p replayId, int segmentId, int height, int width, @NotNull SentryReplayEvent.ReplayType replayType, @Nullable ReplayCache cache, int frameRate, @Nullable String screenAtStart, @Nullable List<io.sentry.a> breadcrumbs, @NotNull LinkedList<io.sentry.rrweb.b> events) {
        Intrinsics.checkNotNullParameter(currentSegmentTimestamp, "currentSegmentTimestamp");
        Intrinsics.checkNotNullParameter(replayId, "replayId");
        Intrinsics.checkNotNullParameter(replayType, "replayType");
        Intrinsics.checkNotNullParameter(events, "events");
        return CaptureStrategy.INSTANCE.createSegment(this.hub, this.options, duration, currentSegmentTimestamp, replayId, segmentId, height, width, replayType, cache, frameRate, screenAtStart, breadcrumbs, events);
    }

    @Nullable
    public final ReplayCache getCache() {
        return this.cache;
    }

    @NotNull
    public final LinkedList<io.sentry.rrweb.b> getCurrentEvents() {
        return this.currentEvents;
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    @NotNull
    public io.sentry.protocol.p getCurrentReplayId() {
        return (io.sentry.protocol.p) this.currentReplayId.getValue(this, $$delegatedProperties[3]);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public int getCurrentSegment() {
        return ((Number) this.currentSegment.getValue(this, $$delegatedProperties[4])).intValue();
    }

    @NotNull
    public final ScreenshotRecorderConfig getRecorderConfig() {
        return (ScreenshotRecorderConfig) this.recorderConfig.getValue(this, $$delegatedProperties[0]);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    @Nullable
    public File getReplayCacheDir() {
        ReplayCache replayCache = this.cache;
        if (replayCache != null) {
            return replayCache.getReplayCacheDir$sentry_android_replay_release();
        }
        return null;
    }

    @NotNull
    public final ScheduledExecutorService getReplayExecutor() {
        Object value = this.replayExecutor.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-replayExecutor>(...)");
        return (ScheduledExecutorService) value;
    }

    @NotNull
    public final AtomicLong getReplayStartTimestamp() {
        return this.replayStartTimestamp;
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    @NotNull
    public SentryReplayEvent.ReplayType getReplayType() {
        return (SentryReplayEvent.ReplayType) this.replayType.getValue(this, $$delegatedProperties[5]);
    }

    @Nullable
    public final String getScreenAtStart() {
        return (String) this.screenAtStart.getValue(this, $$delegatedProperties[2]);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    @Nullable
    public Date getSegmentTimestamp() {
        return (Date) this.segmentTimestamp.getValue(this, $$delegatedProperties[1]);
    }

    @NotNull
    /* JADX INFO: renamed from: isTerminating, reason: from getter */
    public final AtomicBoolean getIsTerminating() {
        return this.isTerminating;
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void onConfigurationChanged(@NotNull ScreenshotRecorderConfig recorderConfig) {
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        setRecorderConfig(recorderConfig);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void onScreenChanged(@Nullable String str) {
        CaptureStrategy.DefaultImpls.onScreenChanged(this, str);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        List<RRWebIncrementalSnapshotEvent> listConvert = this.gestureConverter.convert(event, getRecorderConfig());
        if (listConvert != null) {
            synchronized (CaptureStrategy.INSTANCE.getCurrentEventsLock$sentry_android_replay_release()) {
                CollectionsKt__MutableCollectionsKt.addAll(this.currentEvents, listConvert);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void pause() {
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void resume() {
        setSegmentTimestamp(yq5.c());
    }

    public final void setCache(@Nullable ReplayCache replayCache) {
        this.cache = replayCache;
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void setCurrentReplayId(@NotNull io.sentry.protocol.p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<set-?>");
        this.currentReplayId.setValue(this, $$delegatedProperties[3], pVar);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void setCurrentSegment(int i) {
        this.currentSegment.setValue(this, $$delegatedProperties[4], Integer.valueOf(i));
    }

    public final void setRecorderConfig(@NotNull ScreenshotRecorderConfig screenshotRecorderConfig) {
        Intrinsics.checkNotNullParameter(screenshotRecorderConfig, "<set-?>");
        this.recorderConfig.setValue(this, $$delegatedProperties[0], screenshotRecorderConfig);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void setReplayType(@NotNull SentryReplayEvent.ReplayType replayType) {
        Intrinsics.checkNotNullParameter(replayType, "<set-?>");
        this.replayType.setValue(this, $$delegatedProperties[5], replayType);
    }

    public final void setScreenAtStart(@Nullable String str) {
        this.screenAtStart.setValue(this, $$delegatedProperties[2], str);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void setSegmentTimestamp(@Nullable Date date) {
        this.segmentTimestamp.setValue(this, $$delegatedProperties[1], date);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void start(@NotNull ScreenshotRecorderConfig recorderConfig, int segmentId, @NotNull io.sentry.protocol.p replayId, @Nullable SentryReplayEvent.ReplayType replayType) {
        ReplayCache replayCache;
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        Intrinsics.checkNotNullParameter(replayId, "replayId");
        Function2<io.sentry.protocol.p, ScreenshotRecorderConfig, ReplayCache> function2 = this.replayCacheProvider;
        if (function2 == null || (replayCache = function2.invoke(replayId, recorderConfig)) == null) {
            replayCache = new ReplayCache(this.options, replayId, recorderConfig);
        }
        this.cache = replayCache;
        setCurrentReplayId(replayId);
        setCurrentSegment(segmentId);
        if (replayType == null) {
            replayType = this instanceof SessionCaptureStrategy ? SentryReplayEvent.ReplayType.SESSION : SentryReplayEvent.ReplayType.BUFFER;
        }
        setReplayType(replayType);
        setRecorderConfig(recorderConfig);
        setSegmentTimestamp(yq5.c());
        this.replayStartTimestamp.set(this.dateProvider.a());
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void stop() {
        ReplayCache replayCache = this.cache;
        if (replayCache != null) {
            replayCache.close();
        }
        setCurrentSegment(-1);
        this.replayStartTimestamp.set(0L);
        setSegmentTimestamp(null);
        io.sentry.protocol.p EMPTY_ID = io.sentry.protocol.p.f21803b;
        Intrinsics.checkNotNullExpressionValue(EMPTY_ID, "EMPTY_ID");
        setCurrentReplayId(EMPTY_ID);
    }

    private final <T> ReadWriteProperty<Object, T> persistableAtomic(Function3<? super String, ? super T, ? super T, Unit> onChange) {
        return new AnonymousClass2(null, this, onChange, "");
    }

    public /* synthetic */ BaseCaptureStrategy(SentryOptions sentryOptions, ftc ftcVar, p pVar, ScheduledExecutorService scheduledExecutorService, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sentryOptions, ftcVar, pVar, (i & 8) != 0 ? null : scheduledExecutorService, (i & 16) != 0 ? null : function2);
    }
}
