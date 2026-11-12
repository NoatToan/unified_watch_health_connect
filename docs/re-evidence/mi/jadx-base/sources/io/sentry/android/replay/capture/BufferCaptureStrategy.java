package io.sentry.android.replay.capture;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.ftc;
import defpackage.hgl;
import defpackage.yq5;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SentryReplayEvent;
import io.sentry.android.replay.ReplayCache;
import io.sentry.android.replay.ReplayFrame;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.android.replay.util.ExecutorsKt;
import io.sentry.android.replay.util.SamplingKt;
import io.sentry.transport.p;
import io.sentry.util.Random;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 J2\u00020\u0001:\u0001JBq\u0012\u0006\u00106\u001a\u000205\u0012\b\u00109\u001a\u0004\u0018\u000108\u0012\u0006\u0010<\u001a\u00020;\u0012\u0006\u0010?\u001a\u00020>\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010C\u0012:\b\u0002\u0010G\u001a4\u0012\u0013\u0012\u00110E¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(F\u0012\u0013\u0012\u00110*¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020\"\u0018\u00010!¢\u0006\u0004\bH\u0010IJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J+\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00040\u0011H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJG\u0010(\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u001f2,\u0010'\u001a(\u0012\u0004\u0012\u00020\"\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u00040!¢\u0006\u0002\b&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\u00042\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00109\u001a\u0004\u0018\u0001088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006K"}, d2 = {"Lio/sentry/android/replay/capture/BufferCaptureStrategy;", "Lio/sentry/android/replay/capture/BaseCaptureStrategy;", "Ljava/io/File;", "file", "", "deleteFile", "(Ljava/io/File;)V", "", "Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment$Created;", "capture", "(Ljava/util/List;)V", "", "bufferLimit", "rotate", "(Ljava/util/List;J)V", "", "taskName", "Lkotlin/Function1;", "Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment;", "onSegmentCreated", "createCurrentSegment", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "pause", "()V", BroadcastsKt.SILENT_PUSHING_STOP, "", "isTerminating", "Ljava/util/Date;", "onSegmentSent", "captureReplay", "(ZLkotlin/jvm/functions/Function1;)V", "Landroid/graphics/Bitmap;", "bitmap", "Lkotlin/Function2;", "Lio/sentry/android/replay/ReplayCache;", "Lkotlin/ParameterName;", "name", "frameTimestamp", "Lkotlin/ExtensionFunctionType;", "store", "onScreenshotRecorded", "(Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function2;)V", "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "recorderConfig", "onConfigurationChanged", "(Lio/sentry/android/replay/ScreenshotRecorderConfig;)V", "Lio/sentry/android/replay/capture/CaptureStrategy;", "convert", "()Lio/sentry/android/replay/capture/CaptureStrategy;", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)V", "Lio/sentry/SentryOptions;", "options", "Lio/sentry/SentryOptions;", "Lftc;", "hub", "Lftc;", "Lio/sentry/transport/p;", "dateProvider", "Lio/sentry/transport/p;", "Lio/sentry/util/Random;", "random", "Lio/sentry/util/Random;", "bufferedSegments", "Ljava/util/List;", "Ljava/util/concurrent/ScheduledExecutorService;", "executor", "Lio/sentry/protocol/p;", "replayId", "replayCacheProvider", "<init>", "(Lio/sentry/SentryOptions;Lftc;Lio/sentry/transport/p;Lio/sentry/util/Random;Ljava/util/concurrent/ScheduledExecutorService;Lkotlin/jvm/functions/Function2;)V", "Companion", "sentry-android-replay_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBufferCaptureStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferCaptureStrategy.kt\nio/sentry/android/replay/capture/BufferCaptureStrategy\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,211:1\n1864#2,3:212\n*S KotlinDebug\n*F\n+ 1 BufferCaptureStrategy.kt\nio/sentry/android/replay/capture/BufferCaptureStrategy\n*L\n183#1:212,3\n*E\n"})
public final class BufferCaptureStrategy extends BaseCaptureStrategy {
    private static final long ENVELOPE_PROCESSING_DELAY = 100;

    @NotNull
    private static final String TAG = "BufferCaptureStrategy";

    @NotNull
    private final List<CaptureStrategy.ReplaySegment.Created> bufferedSegments;

    @NotNull
    private final p dateProvider;

    @Nullable
    private final ftc hub;

    @NotNull
    private final SentryOptions options;

    @NotNull
    private final Random random;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferCaptureStrategy(@NotNull SentryOptions options, @Nullable ftc ftcVar, @NotNull p dateProvider, @NotNull Random random, @Nullable ScheduledExecutorService scheduledExecutorService, @Nullable Function2<? super io.sentry.protocol.p, ? super ScreenshotRecorderConfig, ReplayCache> function2) {
        super(options, ftcVar, dateProvider, scheduledExecutorService, function2);
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(random, "random");
        this.options = options;
        this.hub = ftcVar;
        this.dateProvider = dateProvider;
        this.random = random;
        this.bufferedSegments = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void capture(List<CaptureStrategy.ReplaySegment.Created> list) throws InterruptedException {
        CaptureStrategy.ReplaySegment.Created created = (CaptureStrategy.ReplaySegment.Created) CollectionsKt__MutableCollectionsKt.removeFirstOrNull(list);
        while (created != null) {
            CaptureStrategy.ReplaySegment.Created.capture$default(created, this.hub, null, 2, null);
            created = (CaptureStrategy.ReplaySegment.Created) CollectionsKt__MutableCollectionsKt.removeFirstOrNull(list);
            Thread.sleep(100L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void captureReplay$lambda$1(BufferCaptureStrategy this$0, io.sentry.e it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        it.c(this$0.getCurrentReplayId());
    }

    private final void createCurrentSegment(String taskName, final Function1<? super CaptureStrategy.ReplaySegment, Unit> onSegmentCreated) {
        Date dateD;
        List<ReplayFrame> frames$sentry_android_replay_release;
        long jC = this.options.getExperimental().a().c();
        long jA = this.dateProvider.a();
        ReplayCache cache = getCache();
        if (cache == null || (frames$sentry_android_replay_release = cache.getFrames$sentry_android_replay_release()) == null || !(!frames$sentry_android_replay_release.isEmpty())) {
            dateD = yq5.d(jA - jC);
        } else {
            ReplayCache cache2 = getCache();
            Intrinsics.checkNotNull(cache2);
            dateD = yq5.d(((ReplayFrame) CollectionsKt___CollectionsKt.first((List) cache2.getFrames$sentry_android_replay_release())).getTimestamp());
        }
        final Date date = dateD;
        Intrinsics.checkNotNullExpressionValue(date, "if (cache?.frames?.isNot…ReplayDuration)\n        }");
        final int currentSegment = getCurrentSegment();
        final long time = jA - date.getTime();
        final io.sentry.protocol.p currentReplayId = getCurrentReplayId();
        final int recordingHeight = getRecorderConfig().getRecordingHeight();
        final int recordingWidth = getRecorderConfig().getRecordingWidth();
        ExecutorsKt.submitSafely(getReplayExecutor(), this.options, "BufferCaptureStrategy." + taskName, new Runnable() { // from class: io.sentry.android.replay.capture.a
            @Override // java.lang.Runnable
            public final void run() {
                BufferCaptureStrategy.createCurrentSegment$lambda$4(this.f21633a, time, date, currentReplayId, currentSegment, recordingHeight, recordingWidth, onSegmentCreated);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createCurrentSegment$lambda$4(BufferCaptureStrategy this$0, long j, Date currentSegmentTimestamp, io.sentry.protocol.p replayId, int i, int i2, int i3, Function1 onSegmentCreated) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(currentSegmentTimestamp, "$currentSegmentTimestamp");
        Intrinsics.checkNotNullParameter(replayId, "$replayId");
        Intrinsics.checkNotNullParameter(onSegmentCreated, "$onSegmentCreated");
        onSegmentCreated.invoke2(BaseCaptureStrategy.createSegmentInternal$default(this$0, j, currentSegmentTimestamp, replayId, i, i2, i3, null, null, 0, null, null, null, 4032, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deleteFile(File file) {
        if (file == null) {
            return;
        }
        try {
            if (file.delete()) {
                return;
            }
            this.options.getLogger().c(SentryLevel.ERROR, "Failed to delete replay segment: %s", file.getAbsolutePath());
        } catch (Throwable th) {
            this.options.getLogger().b(SentryLevel.ERROR, th, "Failed to delete replay segment: %s", file.getAbsolutePath());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onScreenshotRecorded$lambda$2(BufferCaptureStrategy this$0, Function2 store, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(store, "$store");
        ReplayCache cache = this$0.getCache();
        if (cache != null) {
            store.invoke(cache, Long.valueOf(j));
        }
        long jA = this$0.dateProvider.a() - this$0.options.getExperimental().a().c();
        ReplayCache cache2 = this$0.getCache();
        this$0.setScreenAtStart(cache2 != null ? cache2.rotate(jA) : null);
        this$0.rotate(this$0.bufferedSegments, jA);
    }

    private final void rotate(List<CaptureStrategy.ReplaySegment.Created> list, final long j) {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        CollectionsKt__MutableCollectionsKt.removeAll((List) list, (Function1) new Function1<CaptureStrategy.ReplaySegment.Created, Boolean>() { // from class: io.sentry.android.replay.capture.BufferCaptureStrategy.rotate.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Boolean invoke2(@NotNull CaptureStrategy.ReplaySegment.Created it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.getReplay().g0().getTime() >= j) {
                    return Boolean.FALSE;
                }
                BufferCaptureStrategy bufferCaptureStrategy = this;
                bufferCaptureStrategy.setCurrentSegment(bufferCaptureStrategy.getCurrentSegment() - 1);
                this.deleteFile(it.getReplay().h0());
                booleanRef.element = true;
                return Boolean.TRUE;
            }
        });
        if (booleanRef.element) {
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                ((CaptureStrategy.ReplaySegment.Created) obj).setSegmentId(i);
                i = i2;
            }
        }
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void captureReplay(boolean isTerminating, @NotNull final Function1<? super Date, Unit> onSegmentSent) {
        Intrinsics.checkNotNullParameter(onSegmentSent, "onSegmentSent");
        if (!SamplingKt.sample(this.random, this.options.getExperimental().a().g())) {
            this.options.getLogger().c(SentryLevel.INFO, "Replay wasn't sampled by onErrorSampleRate, not capturing for event", new Object[0]);
            return;
        }
        ftc ftcVar = this.hub;
        if (ftcVar != null) {
            ftcVar.v(new hgl() { // from class: io.sentry.android.replay.capture.c
                @Override // defpackage.hgl
                public final void a(io.sentry.e eVar) {
                    BufferCaptureStrategy.captureReplay$lambda$1(this.f21637a, eVar);
                }
            });
        }
        if (!isTerminating) {
            createCurrentSegment("capture_replay", new Function1<CaptureStrategy.ReplaySegment, Unit>() { // from class: io.sentry.android.replay.capture.BufferCaptureStrategy.captureReplay.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Unit invoke2(CaptureStrategy.ReplaySegment replaySegment) throws InterruptedException {
                    invoke2(replaySegment);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CaptureStrategy.ReplaySegment segment) throws InterruptedException {
                    Intrinsics.checkNotNullParameter(segment, "segment");
                    BufferCaptureStrategy bufferCaptureStrategy = BufferCaptureStrategy.this;
                    bufferCaptureStrategy.capture(bufferCaptureStrategy.bufferedSegments);
                    if (segment instanceof CaptureStrategy.ReplaySegment.Created) {
                        CaptureStrategy.ReplaySegment.Created created = (CaptureStrategy.ReplaySegment.Created) segment;
                        CaptureStrategy.ReplaySegment.Created.capture$default(created, BufferCaptureStrategy.this.hub, null, 2, null);
                        Function1<Date, Unit> function1 = onSegmentSent;
                        Date dateG0 = created.getReplay().g0();
                        Intrinsics.checkNotNullExpressionValue(dateG0, "segment.replay.timestamp");
                        function1.invoke2(dateG0);
                    }
                }
            });
        } else {
            getIsTerminating().set(true);
            this.options.getLogger().c(SentryLevel.DEBUG, "Not capturing replay for crashed event, will be captured on next launch", new Object[0]);
        }
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    @NotNull
    public CaptureStrategy convert() {
        if (getIsTerminating().get()) {
            this.options.getLogger().c(SentryLevel.DEBUG, "Not converting to session mode, because the process is about to terminate", new Object[0]);
            return this;
        }
        SessionCaptureStrategy sessionCaptureStrategy = new SessionCaptureStrategy(this.options, this.hub, this.dateProvider, getReplayExecutor(), null, 16, null);
        sessionCaptureStrategy.start(getRecorderConfig(), getCurrentSegment(), getCurrentReplayId(), SentryReplayEvent.ReplayType.BUFFER);
        return sessionCaptureStrategy;
    }

    @Override // io.sentry.android.replay.capture.BaseCaptureStrategy, io.sentry.android.replay.capture.CaptureStrategy
    public void onConfigurationChanged(@NotNull ScreenshotRecorderConfig recorderConfig) {
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        createCurrentSegment("configuration_changed", new Function1<CaptureStrategy.ReplaySegment, Unit>() { // from class: io.sentry.android.replay.capture.BufferCaptureStrategy.onConfigurationChanged.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit invoke2(CaptureStrategy.ReplaySegment replaySegment) {
                invoke2(replaySegment);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull CaptureStrategy.ReplaySegment segment) {
                Intrinsics.checkNotNullParameter(segment, "segment");
                if (segment instanceof CaptureStrategy.ReplaySegment.Created) {
                    BufferCaptureStrategy.this.bufferedSegments.add(segment);
                    BufferCaptureStrategy bufferCaptureStrategy = BufferCaptureStrategy.this;
                    bufferCaptureStrategy.setCurrentSegment(bufferCaptureStrategy.getCurrentSegment() + 1);
                }
            }
        });
        super.onConfigurationChanged(recorderConfig);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void onScreenshotRecorded(@Nullable Bitmap bitmap, @NotNull final Function2<? super ReplayCache, ? super Long, Unit> store) {
        Intrinsics.checkNotNullParameter(store, "store");
        final long jA = this.dateProvider.a();
        ExecutorsKt.submitSafely(getReplayExecutor(), this.options, "BufferCaptureStrategy.add_frame", new Runnable() { // from class: io.sentry.android.replay.capture.b
            @Override // java.lang.Runnable
            public final void run() {
                BufferCaptureStrategy.onScreenshotRecorded$lambda$2(this.f21635a, store, jA);
            }
        });
    }

    @Override // io.sentry.android.replay.capture.BaseCaptureStrategy, io.sentry.android.replay.capture.CaptureStrategy
    public void onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.onTouchEvent(event);
        CaptureStrategy.Companion.rotateEvents$sentry_android_replay_release$default(CaptureStrategy.INSTANCE, getCurrentEvents(), this.dateProvider.a() - this.options.getExperimental().a().c(), null, 4, null);
    }

    @Override // io.sentry.android.replay.capture.BaseCaptureStrategy, io.sentry.android.replay.capture.CaptureStrategy
    public void pause() {
        createCurrentSegment("pause", new Function1<CaptureStrategy.ReplaySegment, Unit>() { // from class: io.sentry.android.replay.capture.BufferCaptureStrategy.pause.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit invoke2(CaptureStrategy.ReplaySegment replaySegment) {
                invoke2(replaySegment);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull CaptureStrategy.ReplaySegment segment) {
                Intrinsics.checkNotNullParameter(segment, "segment");
                if (segment instanceof CaptureStrategy.ReplaySegment.Created) {
                    BufferCaptureStrategy.this.bufferedSegments.add(segment);
                    BufferCaptureStrategy bufferCaptureStrategy = BufferCaptureStrategy.this;
                    bufferCaptureStrategy.setCurrentSegment(bufferCaptureStrategy.getCurrentSegment() + 1);
                }
            }
        });
        super.pause();
    }

    @Override // io.sentry.android.replay.capture.BaseCaptureStrategy, io.sentry.android.replay.capture.CaptureStrategy
    public void stop() {
        ReplayCache cache = getCache();
        final File replayCacheDir$sentry_android_replay_release = cache != null ? cache.getReplayCacheDir$sentry_android_replay_release() : null;
        ExecutorsKt.submitSafely(getReplayExecutor(), this.options, "BufferCaptureStrategy.stop", new Runnable() { // from class: io.sentry.android.replay.capture.d
            @Override // java.lang.Runnable
            public final void run() {
                io.sentry.util.e.a(replayCacheDir$sentry_android_replay_release);
            }
        });
        super.stop();
    }

    public /* synthetic */ BufferCaptureStrategy(SentryOptions sentryOptions, ftc ftcVar, p pVar, Random random, ScheduledExecutorService scheduledExecutorService, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sentryOptions, ftcVar, pVar, random, (i & 16) != 0 ? null : scheduledExecutorService, (i & 32) != 0 ? null : function2);
    }
}
