package io.sentry.android.replay.capture;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import com.miui.tsmclient.database.DatabaseConstants;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.devicesettings.thirdparty.PhoneStateBroadcastReceiver;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.c8c;
import defpackage.ftc;
import defpackage.hgl;
import defpackage.yq5;
import io.sentry.SentryOptions;
import io.sentry.SentryReplayEvent;
import io.sentry.android.replay.GeneratedVideo;
import io.sentry.android.replay.ReplayCache;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.l;
import io.sentry.protocol.p;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000f\b`\u0018\u0000 H2\u00020\u0001:\u0002HIJ7\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH&¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\nH&¢\u0006\u0004\b\u0010\u0010\u000eJ+\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\n0\u0013H&¢\u0006\u0004\b\u0016\u0010\u0017JI\u0010\"\u001a\u00020\n2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182,\u0010!\u001a(\u0012\u0004\u0012\u00020\u001b\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\n0\u001a¢\u0006\u0002\b H&¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\n2\u0006\u0010'\u001a\u00020&H&¢\u0006\u0004\b(\u0010)J\u0019\u0010,\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0000H&¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\nH&¢\u0006\u0004\b0\u0010\u000eR\u001c\u00105\u001a\u00020\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001c\u0010:\u001a\u00020\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0016\u0010>\u001a\u0004\u0018\u00010;8&X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u001c\u0010\t\u001a\u00020\b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001e\u0010G\u001a\u0004\u0018\u00010\u00148&@&X¦\u000e¢\u0006\f\u001a\u0004\bC\u0010D\"\u0004\bE\u0010F¨\u0006J"}, d2 = {"Lio/sentry/android/replay/capture/CaptureStrategy;", "", "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "recorderConfig", "", "segmentId", "Lio/sentry/protocol/p;", "replayId", "Lio/sentry/SentryReplayEvent$ReplayType;", "replayType", "", StatConstants.PARAM_START, "(Lio/sentry/android/replay/ScreenshotRecorderConfig;ILio/sentry/protocol/p;Lio/sentry/SentryReplayEvent$ReplayType;)V", BroadcastsKt.SILENT_PUSHING_STOP, "()V", "pause", "resume", "", "isTerminating", "Lkotlin/Function1;", "Ljava/util/Date;", "onSegmentSent", "captureReplay", "(ZLkotlin/jvm/functions/Function1;)V", "Landroid/graphics/Bitmap;", "bitmap", "Lkotlin/Function2;", "Lio/sentry/android/replay/ReplayCache;", "", "Lkotlin/ParameterName;", "name", "frameTimestamp", "Lkotlin/ExtensionFunctionType;", "store", "onScreenshotRecorded", "(Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function2;)V", "onConfigurationChanged", "(Lio/sentry/android/replay/ScreenshotRecorderConfig;)V", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)V", "", PhoneStateBroadcastReceiver.PARAMS_SCREEN, "onScreenChanged", "(Ljava/lang/String;)V", "convert", "()Lio/sentry/android/replay/capture/CaptureStrategy;", Constants.EXTRA_CLOSE_TAI, "getCurrentSegment", "()I", "setCurrentSegment", "(I)V", "currentSegment", "getCurrentReplayId", "()Lio/sentry/protocol/p;", "setCurrentReplayId", "(Lio/sentry/protocol/p;)V", "currentReplayId", "Ljava/io/File;", "getReplayCacheDir", "()Ljava/io/File;", "replayCacheDir", "getReplayType", "()Lio/sentry/SentryReplayEvent$ReplayType;", "setReplayType", "(Lio/sentry/SentryReplayEvent$ReplayType;)V", "getSegmentTimestamp", "()Ljava/util/Date;", "setSegmentTimestamp", "(Ljava/util/Date;)V", "segmentTimestamp", "Companion", "ReplaySegment", "sentry-android-replay_release"}, k = 1, mv = {1, 8, 0})
public interface CaptureStrategy {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b5\u00106J\u008d\u0001\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0091\u0001\u0010&\u001a\u00020\u001c2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\u000f\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0004\b&\u0010'J=\u0010.\u001a\u00020*2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010(\u001a\u00020\u00102\u0016\b\u0002\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020*\u0018\u00010)H\u0000¢\u0006\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00101\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u00067"}, d2 = {"Lio/sentry/android/replay/capture/CaptureStrategy$Companion;", "", "Lio/sentry/SentryOptions;", "options", "Ljava/io/File;", "video", "Lio/sentry/protocol/p;", "currentReplayId", "Ljava/util/Date;", "segmentTimestamp", "", "segmentId", "height", "width", "frameCount", "frameRate", "", "videoDuration", "Lio/sentry/SentryReplayEvent$ReplayType;", "replayType", "", "screenAtStart", "", "Lio/sentry/a;", "breadcrumbs", "Ljava/util/LinkedList;", "Lio/sentry/rrweb/b;", "events", "Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment;", "buildReplay", "(Lio/sentry/SentryOptions;Ljava/io/File;Lio/sentry/protocol/p;Ljava/util/Date;IIIIIJLio/sentry/SentryReplayEvent$ReplayType;Ljava/lang/String;Ljava/util/List;Ljava/util/LinkedList;)Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment;", "Lftc;", "hub", "duration", "currentSegmentTimestamp", "replayId", "Lio/sentry/android/replay/ReplayCache;", DatabaseConstants.TABLE_CACHE, "createSegment", "(Lftc;Lio/sentry/SentryOptions;JLjava/util/Date;Lio/sentry/protocol/p;IIILio/sentry/SentryReplayEvent$ReplayType;Lio/sentry/android/replay/ReplayCache;ILjava/lang/String;Ljava/util/List;Ljava/util/LinkedList;)Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment;", "until", "Lkotlin/Function1;", "", "callback", "rotateEvents$sentry_android_replay_release", "(Ljava/util/LinkedList;JLkotlin/jvm/functions/Function1;)V", "rotateEvents", "BREADCRUMB_START_OFFSET", "J", "currentEventsLock", "Ljava/lang/Object;", "getCurrentEventsLock$sentry_android_replay_release", "()Ljava/lang/Object;", "<init>", "()V", "sentry-android-replay_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCaptureStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CaptureStrategy.kt\nio/sentry/android/replay/capture/CaptureStrategy$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,246:1\n1855#2,2:247\n1045#2:249\n*S KotlinDebug\n*F\n+ 1 CaptureStrategy.kt\nio/sentry/android/replay/capture/CaptureStrategy$Companion\n*L\n164#1:247,2\n199#1:249\n*E\n"})
    public static final class Companion {
        private static final long BREADCRUMB_START_OFFSET = 100;
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final Object currentEventsLock = new Object();

        private Companion() {
        }

        private final ReplaySegment buildReplay(SentryOptions options, File video, p currentReplayId, final Date segmentTimestamp, int segmentId, int height, int width, int frameCount, int frameRate, long videoDuration, SentryReplayEvent.ReplayType replayType, String screenAtStart, List<io.sentry.a> breadcrumbs, LinkedList<io.sentry.rrweb.b> events) {
            io.sentry.rrweb.b bVarConvert;
            Date dateD = yq5.d(segmentTimestamp.getTime() + videoDuration);
            Intrinsics.checkNotNullExpressionValue(dateD, "getDateTime(segmentTimestamp.time + videoDuration)");
            SentryReplayEvent sentryReplayEvent = new SentryReplayEvent();
            sentryReplayEvent.V(currentReplayId);
            sentryReplayEvent.j0(currentReplayId);
            sentryReplayEvent.m0(segmentId);
            sentryReplayEvent.n0(dateD);
            sentryReplayEvent.k0(segmentTimestamp);
            sentryReplayEvent.l0(replayType);
            sentryReplayEvent.s0(video);
            final ArrayList arrayList = new ArrayList();
            io.sentry.rrweb.d dVar = new io.sentry.rrweb.d();
            dVar.f(segmentTimestamp.getTime());
            dVar.l(height);
            dVar.n(width);
            arrayList.add(dVar);
            io.sentry.rrweb.f fVar = new io.sentry.rrweb.f();
            fVar.f(segmentTimestamp.getTime());
            fVar.C(segmentId);
            fVar.w(videoDuration);
            fVar.x(frameCount);
            fVar.D(video.length());
            fVar.y(frameRate);
            fVar.z(height);
            fVar.G(width);
            fVar.A(0);
            fVar.E(0);
            arrayList.add(fVar);
            LinkedList linkedList = new LinkedList();
            for (io.sentry.a aVar : breadcrumbs) {
                if (aVar.k().getTime() + 100 >= segmentTimestamp.getTime() && aVar.k().getTime() < dateD.getTime() && (bVarConvert = options.getReplayController().getBreadcrumbConverter().convert(aVar)) != null) {
                    arrayList.add(bVarConvert);
                    io.sentry.rrweb.a aVar2 = bVarConvert instanceof io.sentry.rrweb.a ? (io.sentry.rrweb.a) bVarConvert : null;
                    if (Intrinsics.areEqual(aVar2 != null ? aVar2.n() : null, "navigation")) {
                        Map<String, Object> mapO = ((io.sentry.rrweb.a) bVarConvert).o();
                        Intrinsics.checkNotNull(mapO);
                        Object obj = mapO.get("to");
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                        linkedList.add((String) obj);
                    }
                }
            }
            if (screenAtStart != null && !Intrinsics.areEqual(CollectionsKt___CollectionsKt.firstOrNull((List) linkedList), screenAtStart)) {
                linkedList.addFirst(screenAtStart);
            }
            rotateEvents$sentry_android_replay_release(events, dateD.getTime(), new Function1<io.sentry.rrweb.b, Unit>() { // from class: io.sentry.android.replay.capture.CaptureStrategy$Companion$buildReplay$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Unit invoke2(io.sentry.rrweb.b bVar) {
                    invoke2(bVar);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull io.sentry.rrweb.b event) {
                    Intrinsics.checkNotNullParameter(event, "event");
                    if (event.e() >= segmentTimestamp.getTime()) {
                        arrayList.add(event);
                    }
                }
            });
            l lVar = new l();
            lVar.c(Integer.valueOf(segmentId));
            lVar.b(CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: io.sentry.android.replay.capture.CaptureStrategy$Companion$buildReplay$lambda$6$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((io.sentry.rrweb.b) t).e()), Long.valueOf(((io.sentry.rrweb.b) t2).e()));
                }
            }));
            sentryReplayEvent.r0(linkedList);
            return new ReplaySegment.Created(sentryReplayEvent, lVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Type inference failed for: r0v2, types: [T, java.util.ArrayList] */
        public static final void createSegment$lambda$0(Ref.ObjectRef crumbs, io.sentry.e scope) {
            Intrinsics.checkNotNullParameter(crumbs, "$crumbs");
            Intrinsics.checkNotNullParameter(scope, "scope");
            crumbs.element = new ArrayList(scope.b());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void rotateEvents$sentry_android_replay_release$default(Companion companion, LinkedList linkedList, long j, Function1 function1, int i, Object obj) {
            if ((i & 4) != 0) {
                function1 = null;
            }
            companion.rotateEvents$sentry_android_replay_release(linkedList, j, function1);
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.util.List] */
        @NotNull
        public final ReplaySegment createSegment(@Nullable ftc hub, @NotNull SentryOptions options, long duration, @NotNull Date currentSegmentTimestamp, @NotNull p replayId, int segmentId, int height, int width, @NotNull SentryReplayEvent.ReplayType replayType, @Nullable ReplayCache cache, int frameRate, @Nullable String screenAtStart, @Nullable List<io.sentry.a> breadcrumbs, @NotNull LinkedList<io.sentry.rrweb.b> events) {
            GeneratedVideo generatedVideoCreateVideoOf$default;
            List<io.sentry.a> list;
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(currentSegmentTimestamp, "currentSegmentTimestamp");
            Intrinsics.checkNotNullParameter(replayId, "replayId");
            Intrinsics.checkNotNullParameter(replayType, "replayType");
            Intrinsics.checkNotNullParameter(events, "events");
            if (cache == null || (generatedVideoCreateVideoOf$default = ReplayCache.createVideoOf$default(cache, duration, currentSegmentTimestamp.getTime(), segmentId, height, width, null, 32, null)) == null) {
                return ReplaySegment.Failed.INSTANCE;
            }
            File video = generatedVideoCreateVideoOf$default.getVideo();
            int frameCount = generatedVideoCreateVideoOf$default.getFrameCount();
            long duration2 = generatedVideoCreateVideoOf$default.getDuration();
            if (breadcrumbs == null) {
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = CollectionsKt__CollectionsKt.emptyList();
                if (hub != null) {
                    hub.v(new hgl() { // from class: io.sentry.android.replay.capture.e
                        @Override // defpackage.hgl
                        public final void a(io.sentry.e eVar) {
                            CaptureStrategy.Companion.createSegment$lambda$0(objectRef, eVar);
                        }
                    });
                }
                list = (List) objectRef.element;
            } else {
                list = breadcrumbs;
            }
            return buildReplay(options, video, replayId, currentSegmentTimestamp, segmentId, height, width, frameCount, frameRate, duration2, replayType, screenAtStart, list, events);
        }

        @NotNull
        public final Object getCurrentEventsLock$sentry_android_replay_release() {
            return currentEventsLock;
        }

        public final void rotateEvents$sentry_android_replay_release(@NotNull LinkedList<io.sentry.rrweb.b> events, long until, @Nullable Function1<? super io.sentry.rrweb.b, Unit> callback) {
            Intrinsics.checkNotNullParameter(events, "events");
            synchronized (currentEventsLock) {
                try {
                    io.sentry.rrweb.b bVarPeek = events.peek();
                    while (bVarPeek != null && bVarPeek.e() < until) {
                        if (callback != null) {
                            callback.invoke2(bVarPeek);
                        }
                        events.remove();
                        bVarPeek = events.peek();
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onScreenChanged(@NotNull CaptureStrategy captureStrategy, @Nullable String str) {
        }

        public static /* synthetic */ void onScreenshotRecorded$default(CaptureStrategy captureStrategy, Bitmap bitmap, Function2 function2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onScreenshotRecorded");
            }
            if ((i & 1) != 0) {
                bitmap = null;
            }
            captureStrategy.onScreenshotRecorded(bitmap, function2);
        }

        public static /* synthetic */ void start$default(CaptureStrategy captureStrategy, ScreenshotRecorderConfig screenshotRecorderConfig, int i, p pVar, SentryReplayEvent.ReplayType replayType, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
            }
            if ((i2 & 2) != 0) {
                i = 0;
            }
            if ((i2 & 4) != 0) {
                pVar = new p();
            }
            if ((i2 & 8) != 0) {
                replayType = null;
            }
            captureStrategy.start(screenshotRecorderConfig, i, pVar, replayType);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment;", "", "()V", "Created", "Failed", "Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment$Created;", "Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment$Failed;", "sentry-android-replay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class ReplaySegment {
        public static final int $stable = 0;

        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b%\u0010&J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0013\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0013\u0010!\u001a\u0004\b\"\u0010\u000fR\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0014\u0010#\u001a\u0004\b$\u0010\u0012¨\u0006'"}, d2 = {"Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment$Created;", "Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment;", "Lftc;", "hub", "Lc8c;", "hint", "", "capture", "(Lftc;Lc8c;)V", "", "segmentId", "setSegmentId", "(I)V", "Lio/sentry/SentryReplayEvent;", "component1", "()Lio/sentry/SentryReplayEvent;", "Lio/sentry/l;", "component2", "()Lio/sentry/l;", "replay", "recording", "copy", "(Lio/sentry/SentryReplayEvent;Lio/sentry/l;)Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment$Created;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lio/sentry/SentryReplayEvent;", "getReplay", "Lio/sentry/l;", "getRecording", "<init>", "(Lio/sentry/SentryReplayEvent;Lio/sentry/l;)V", "sentry-android-replay_release"}, k = 1, mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nCaptureStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CaptureStrategy.kt\nio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment$Created\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,246:1\n1#2:247\n1855#3,2:248\n*S KotlinDebug\n*F\n+ 1 CaptureStrategy.kt\nio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment$Created\n*L\n237#1:248,2\n*E\n"})
        public static final /* data */ class Created extends ReplaySegment {
            public static final int $stable = 8;

            @NotNull
            private final l recording;

            @NotNull
            private final SentryReplayEvent replay;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Created(@NotNull SentryReplayEvent replay, @NotNull l recording) {
                super(null);
                Intrinsics.checkNotNullParameter(replay, "replay");
                Intrinsics.checkNotNullParameter(recording, "recording");
                this.replay = replay;
                this.recording = recording;
            }

            public static /* synthetic */ void capture$default(Created created, ftc ftcVar, c8c c8cVar, int i, Object obj) {
                if ((i & 2) != 0) {
                    c8cVar = new c8c();
                }
                created.capture(ftcVar, c8cVar);
            }

            public static /* synthetic */ Created copy$default(Created created, SentryReplayEvent sentryReplayEvent, l lVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    sentryReplayEvent = created.replay;
                }
                if ((i & 2) != 0) {
                    lVar = created.recording;
                }
                return created.copy(sentryReplayEvent, lVar);
            }

            public final void capture(@Nullable ftc hub, @NotNull c8c hint) {
                Intrinsics.checkNotNullParameter(hint, "hint");
                if (hub != null) {
                    SentryReplayEvent sentryReplayEvent = this.replay;
                    hint.m(this.recording);
                    Unit unit = Unit.INSTANCE;
                    hub.s(sentryReplayEvent, hint);
                }
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final SentryReplayEvent getReplay() {
                return this.replay;
            }

            @NotNull
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final l getRecording() {
                return this.recording;
            }

            @NotNull
            public final Created copy(@NotNull SentryReplayEvent replay, @NotNull l recording) {
                Intrinsics.checkNotNullParameter(replay, "replay");
                Intrinsics.checkNotNullParameter(recording, "recording");
                return new Created(replay, recording);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Created)) {
                    return false;
                }
                Created created = (Created) other;
                return Intrinsics.areEqual(this.replay, created.replay) && Intrinsics.areEqual(this.recording, created.recording);
            }

            @NotNull
            public final l getRecording() {
                return this.recording;
            }

            @NotNull
            public final SentryReplayEvent getReplay() {
                return this.replay;
            }

            public int hashCode() {
                return (this.replay.hashCode() * 31) + this.recording.hashCode();
            }

            public final void setSegmentId(int segmentId) {
                this.replay.m0(segmentId);
                List<? extends io.sentry.rrweb.b> listA = this.recording.a();
                if (listA != null) {
                    for (io.sentry.rrweb.b bVar : listA) {
                        if (bVar instanceof io.sentry.rrweb.f) {
                            ((io.sentry.rrweb.f) bVar).C(segmentId);
                        }
                    }
                }
            }

            @NotNull
            public String toString() {
                return "Created(replay=" + this.replay + ", recording=" + this.recording + ')';
            }
        }

        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment$Failed;", "Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment;", "()V", "sentry-android-replay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Failed extends ReplaySegment {
            public static final int $stable = 0;

            @NotNull
            public static final Failed INSTANCE = new Failed();

            private Failed() {
                super(null);
            }
        }

        private ReplaySegment() {
        }

        public /* synthetic */ ReplaySegment(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    void captureReplay(boolean isTerminating, @NotNull Function1<? super Date, Unit> onSegmentSent);

    void close();

    @NotNull
    CaptureStrategy convert();

    @NotNull
    p getCurrentReplayId();

    int getCurrentSegment();

    @Nullable
    File getReplayCacheDir();

    @NotNull
    SentryReplayEvent.ReplayType getReplayType();

    @Nullable
    Date getSegmentTimestamp();

    void onConfigurationChanged(@NotNull ScreenshotRecorderConfig recorderConfig);

    void onScreenChanged(@Nullable String screen);

    void onScreenshotRecorded(@Nullable Bitmap bitmap, @NotNull Function2<? super ReplayCache, ? super Long, Unit> store);

    void onTouchEvent(@NotNull MotionEvent event);

    void pause();

    void resume();

    void setCurrentReplayId(@NotNull p pVar);

    void setCurrentSegment(int i);

    void setReplayType(@NotNull SentryReplayEvent.ReplayType replayType);

    void setSegmentTimestamp(@Nullable Date date);

    void start(@NotNull ScreenshotRecorderConfig recorderConfig, int segmentId, @NotNull p replayId, @Nullable SentryReplayEvent.ReplayType replayType);

    void stop();
}
