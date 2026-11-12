package io.sentry.android.replay.capture;

import android.graphics.Bitmap;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.ftc;
import defpackage.hgl;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SentryReplayEvent;
import io.sentry.android.replay.ReplayCache;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.android.replay.util.ExecutorsKt;
import io.sentry.transport.p;
import java.io.File;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 <2\u00020\u0001:\u0001<Bi\u0012\u0006\u0010/\u001a\u00020.\u0012\b\u00102\u001a\u0004\u0018\u000101\u0012\u0006\u00105\u001a\u000204\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u000107\u0012:\b\u0002\u00109\u001a4\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\n¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020 \u0018\u00010\u001f¢\u0006\u0004\b:\u0010;J+\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ1\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J+\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00060\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJG\u0010'\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2,\u0010&\u001a(\u0012\u0004\u0012\u00020 \u0012\u0013\u0012\u00110!¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00060\u001f¢\u0006\u0002\b%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00102\u001a\u0004\u0018\u0001018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u0006="}, d2 = {"Lio/sentry/android/replay/capture/SessionCaptureStrategy;", "Lio/sentry/android/replay/capture/BaseCaptureStrategy;", "", "taskName", "Lkotlin/Function1;", "Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment;", "", "onSegmentCreated", "createCurrentSegment", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "recorderConfig", "", "segmentId", "Lio/sentry/protocol/p;", "replayId", "Lio/sentry/SentryReplayEvent$ReplayType;", "replayType", StatConstants.PARAM_START, "(Lio/sentry/android/replay/ScreenshotRecorderConfig;ILio/sentry/protocol/p;Lio/sentry/SentryReplayEvent$ReplayType;)V", "pause", "()V", BroadcastsKt.SILENT_PUSHING_STOP, "", "isTerminating", "Ljava/util/Date;", "onSegmentSent", "captureReplay", "(ZLkotlin/jvm/functions/Function1;)V", "Landroid/graphics/Bitmap;", "bitmap", "Lkotlin/Function2;", "Lio/sentry/android/replay/ReplayCache;", "", "Lkotlin/ParameterName;", "name", "frameTimestamp", "Lkotlin/ExtensionFunctionType;", "store", "onScreenshotRecorded", "(Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function2;)V", "onConfigurationChanged", "(Lio/sentry/android/replay/ScreenshotRecorderConfig;)V", "Lio/sentry/android/replay/capture/CaptureStrategy;", "convert", "()Lio/sentry/android/replay/capture/CaptureStrategy;", "Lio/sentry/SentryOptions;", "options", "Lio/sentry/SentryOptions;", "Lftc;", "hub", "Lftc;", "Lio/sentry/transport/p;", "dateProvider", "Lio/sentry/transport/p;", "Ljava/util/concurrent/ScheduledExecutorService;", "executor", "replayCacheProvider", "<init>", "(Lio/sentry/SentryOptions;Lftc;Lio/sentry/transport/p;Ljava/util/concurrent/ScheduledExecutorService;Lkotlin/jvm/functions/Function2;)V", "Companion", "sentry-android-replay_release"}, k = 1, mv = {1, 8, 0})
public final class SessionCaptureStrategy extends BaseCaptureStrategy {

    @NotNull
    private static final String TAG = "SessionCaptureStrategy";

    @NotNull
    private final p dateProvider;

    @Nullable
    private final ftc hub;

    @NotNull
    private final SentryOptions options;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionCaptureStrategy(@NotNull SentryOptions options, @Nullable ftc ftcVar, @NotNull p dateProvider, @Nullable ScheduledExecutorService scheduledExecutorService, @Nullable Function2<? super io.sentry.protocol.p, ? super ScreenshotRecorderConfig, ReplayCache> function2) {
        super(options, ftcVar, dateProvider, scheduledExecutorService, function2);
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.options = options;
        this.hub = ftcVar;
        this.dateProvider = dateProvider;
    }

    private final void createCurrentSegment(String taskName, final Function1<? super CaptureStrategy.ReplaySegment, Unit> onSegmentCreated) {
        long jA = this.dateProvider.a();
        final Date segmentTimestamp = getSegmentTimestamp();
        if (segmentTimestamp == null) {
            return;
        }
        final int currentSegment = getCurrentSegment();
        final long time = jA - segmentTimestamp.getTime();
        final io.sentry.protocol.p currentReplayId = getCurrentReplayId();
        final int recordingHeight = getRecorderConfig().getRecordingHeight();
        final int recordingWidth = getRecorderConfig().getRecordingWidth();
        ExecutorsKt.submitSafely(getReplayExecutor(), this.options, "SessionCaptureStrategy." + taskName, new Runnable() { // from class: io.sentry.android.replay.capture.f
            @Override // java.lang.Runnable
            public final void run() {
                SessionCaptureStrategy.createCurrentSegment$lambda$4(this.f21640a, time, segmentTimestamp, currentReplayId, currentSegment, recordingHeight, recordingWidth, onSegmentCreated);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createCurrentSegment$lambda$4(SessionCaptureStrategy this$0, long j, Date currentSegmentTimestamp, io.sentry.protocol.p replayId, int i, int i2, int i3, Function1 onSegmentCreated) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(currentSegmentTimestamp, "$currentSegmentTimestamp");
        Intrinsics.checkNotNullParameter(replayId, "$replayId");
        Intrinsics.checkNotNullParameter(onSegmentCreated, "$onSegmentCreated");
        onSegmentCreated.invoke2(BaseCaptureStrategy.createSegmentInternal$default(this$0, j, currentSegmentTimestamp, replayId, i, i2, i3, null, null, 0, null, null, null, 4032, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onScreenshotRecorded$lambda$3(SessionCaptureStrategy this$0, Function2 store, long j, int i, int i2) {
        SessionCaptureStrategy sessionCaptureStrategy;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(store, "$store");
        ReplayCache cache = this$0.getCache();
        if (cache != null) {
            store.invoke(cache, Long.valueOf(j));
        }
        Date segmentTimestamp = this$0.getSegmentTimestamp();
        if (segmentTimestamp == null) {
            this$0.options.getLogger().c(SentryLevel.DEBUG, "Segment timestamp is not set, not recording frame", new Object[0]);
            return;
        }
        if (this$0.getIsTerminating().get()) {
            this$0.options.getLogger().c(SentryLevel.DEBUG, "Not capturing segment, because the app is terminating, will be captured on next launch", new Object[0]);
            return;
        }
        long jA = this$0.dateProvider.a();
        if (jA - segmentTimestamp.getTime() >= this$0.options.getExperimental().a().k()) {
            CaptureStrategy.ReplaySegment replaySegmentCreateSegmentInternal$default = BaseCaptureStrategy.createSegmentInternal$default(this$0, this$0.options.getExperimental().a().k(), segmentTimestamp, this$0.getCurrentReplayId(), this$0.getCurrentSegment(), i, i2, null, null, 0, null, null, null, 4032, null);
            if (replaySegmentCreateSegmentInternal$default instanceof CaptureStrategy.ReplaySegment.Created) {
                CaptureStrategy.ReplaySegment.Created created = (CaptureStrategy.ReplaySegment.Created) replaySegmentCreateSegmentInternal$default;
                sessionCaptureStrategy = this$0;
                CaptureStrategy.ReplaySegment.Created.capture$default(created, sessionCaptureStrategy.hub, null, 2, null);
                sessionCaptureStrategy.setCurrentSegment(this$0.getCurrentSegment() + 1);
                sessionCaptureStrategy.setSegmentTimestamp(created.getReplay().g0());
            } else {
                sessionCaptureStrategy = this$0;
            }
        } else {
            sessionCaptureStrategy = this$0;
        }
        if (jA - this$0.getReplayStartTimestamp().get() >= sessionCaptureStrategy.options.getExperimental().a().i()) {
            sessionCaptureStrategy.options.getReplayController().stop();
            sessionCaptureStrategy.options.getLogger().c(SentryLevel.INFO, "Session replay deadline exceeded (1h), stopping recording", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$0(SessionCaptureStrategy this$0, io.sentry.e it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        it.c(this$0.getCurrentReplayId());
        String strR = it.r();
        this$0.setScreenAtStart(strR != null ? StringsKt__StringsKt.substringAfterLast$default(strR, '.', (String) null, 2, (Object) null) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stop$lambda$1(io.sentry.e it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.c(io.sentry.protocol.p.f21803b);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void captureReplay(boolean isTerminating, @NotNull Function1<? super Date, Unit> onSegmentSent) {
        Intrinsics.checkNotNullParameter(onSegmentSent, "onSegmentSent");
        this.options.getLogger().c(SentryLevel.DEBUG, "Replay is already running in 'session' mode, not capturing for event", new Object[0]);
        getIsTerminating().set(isTerminating);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    @NotNull
    public CaptureStrategy convert() {
        return this;
    }

    @Override // io.sentry.android.replay.capture.BaseCaptureStrategy, io.sentry.android.replay.capture.CaptureStrategy
    public void onConfigurationChanged(@NotNull ScreenshotRecorderConfig recorderConfig) {
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        createCurrentSegment("onConfigurationChanged", new Function1<CaptureStrategy.ReplaySegment, Unit>() { // from class: io.sentry.android.replay.capture.SessionCaptureStrategy.onConfigurationChanged.1
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
                    CaptureStrategy.ReplaySegment.Created created = (CaptureStrategy.ReplaySegment.Created) segment;
                    CaptureStrategy.ReplaySegment.Created.capture$default(created, SessionCaptureStrategy.this.hub, null, 2, null);
                    SessionCaptureStrategy sessionCaptureStrategy = SessionCaptureStrategy.this;
                    sessionCaptureStrategy.setCurrentSegment(sessionCaptureStrategy.getCurrentSegment() + 1);
                    SessionCaptureStrategy.this.setSegmentTimestamp(created.getReplay().g0());
                }
            }
        });
        super.onConfigurationChanged(recorderConfig);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void onScreenshotRecorded(@Nullable Bitmap bitmap, @NotNull final Function2<? super ReplayCache, ? super Long, Unit> store) {
        Intrinsics.checkNotNullParameter(store, "store");
        final long jA = this.dateProvider.a();
        final int recordingHeight = getRecorderConfig().getRecordingHeight();
        final int recordingWidth = getRecorderConfig().getRecordingWidth();
        ExecutorsKt.submitSafely(getReplayExecutor(), this.options, "SessionCaptureStrategy.add_frame", new Runnable() { // from class: io.sentry.android.replay.capture.g
            @Override // java.lang.Runnable
            public final void run() {
                SessionCaptureStrategy.onScreenshotRecorded$lambda$3(this.f21642a, store, jA, recordingHeight, recordingWidth);
            }
        });
    }

    @Override // io.sentry.android.replay.capture.BaseCaptureStrategy, io.sentry.android.replay.capture.CaptureStrategy
    public void pause() {
        createCurrentSegment("pause", new Function1<CaptureStrategy.ReplaySegment, Unit>() { // from class: io.sentry.android.replay.capture.SessionCaptureStrategy.pause.1
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
                    CaptureStrategy.ReplaySegment.Created.capture$default((CaptureStrategy.ReplaySegment.Created) segment, SessionCaptureStrategy.this.hub, null, 2, null);
                    SessionCaptureStrategy sessionCaptureStrategy = SessionCaptureStrategy.this;
                    sessionCaptureStrategy.setCurrentSegment(sessionCaptureStrategy.getCurrentSegment() + 1);
                }
            }
        });
        super.pause();
    }

    @Override // io.sentry.android.replay.capture.BaseCaptureStrategy, io.sentry.android.replay.capture.CaptureStrategy
    public void start(@NotNull ScreenshotRecorderConfig recorderConfig, int segmentId, @NotNull io.sentry.protocol.p replayId, @Nullable SentryReplayEvent.ReplayType replayType) {
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        Intrinsics.checkNotNullParameter(replayId, "replayId");
        super.start(recorderConfig, segmentId, replayId, replayType);
        ftc ftcVar = this.hub;
        if (ftcVar != null) {
            ftcVar.v(new hgl() { // from class: io.sentry.android.replay.capture.h
                @Override // defpackage.hgl
                public final void a(io.sentry.e eVar) {
                    SessionCaptureStrategy.start$lambda$0(this.f21644a, eVar);
                }
            });
        }
    }

    @Override // io.sentry.android.replay.capture.BaseCaptureStrategy, io.sentry.android.replay.capture.CaptureStrategy
    public void stop() {
        ReplayCache cache = getCache();
        final File replayCacheDir$sentry_android_replay_release = cache != null ? cache.getReplayCacheDir$sentry_android_replay_release() : null;
        createCurrentSegment(BroadcastsKt.SILENT_PUSHING_STOP, new Function1<CaptureStrategy.ReplaySegment, Unit>() { // from class: io.sentry.android.replay.capture.SessionCaptureStrategy.stop.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    CaptureStrategy.ReplaySegment.Created.capture$default((CaptureStrategy.ReplaySegment.Created) segment, SessionCaptureStrategy.this.hub, null, 2, null);
                }
                io.sentry.util.e.a(replayCacheDir$sentry_android_replay_release);
            }
        });
        ftc ftcVar = this.hub;
        if (ftcVar != null) {
            ftcVar.v(new hgl() { // from class: io.sentry.android.replay.capture.i
                @Override // defpackage.hgl
                public final void a(io.sentry.e eVar) {
                    SessionCaptureStrategy.stop$lambda$1(eVar);
                }
            });
        }
        super.stop();
    }

    public /* synthetic */ SessionCaptureStrategy(SentryOptions sentryOptions, ftc ftcVar, p pVar, ScheduledExecutorService scheduledExecutorService, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sentryOptions, ftcVar, pVar, (i & 8) != 0 ? null : scheduledExecutorService, (i & 16) != 0 ? null : function2);
    }
}
