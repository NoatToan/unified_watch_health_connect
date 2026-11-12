package io.sentry.android.replay.gestures;

import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.rrweb.RRWebIncrementalSnapshotEvent;
import io.sentry.rrweb.RRWebInteractionEvent;
import io.sentry.rrweb.c;
import io.sentry.transport.p;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fRP\u0010\u0013\u001a>\u0012\u0004\u0012\u00020\u000e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u00110\rj\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011`\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017¨\u0006\u001c"}, d2 = {"Lio/sentry/android/replay/gestures/ReplayGestureConverter;", "", "Landroid/view/MotionEvent;", "event", "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "recorderConfig", "", "Lio/sentry/rrweb/RRWebIncrementalSnapshotEvent;", "convert", "(Landroid/view/MotionEvent;Lio/sentry/android/replay/ScreenshotRecorderConfig;)Ljava/util/List;", "Lio/sentry/transport/p;", "dateProvider", "Lio/sentry/transport/p;", "Ljava/util/LinkedHashMap;", "", "Ljava/util/ArrayList;", "Lio/sentry/rrweb/c$b;", "Lkotlin/collections/ArrayList;", "Lkotlin/collections/LinkedHashMap;", "currentPositions", "Ljava/util/LinkedHashMap;", "", "touchMoveBaseline", "J", "lastCapturedMoveEvent", "<init>", "(Lio/sentry/transport/p;)V", "Companion", "sentry-android-replay_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nReplayGestureConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplayGestureConverter.kt\nio/sentry/android/replay/gestures/ReplayGestureConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,145:1\n1855#2,2:146\n1549#2:148\n1620#2,3:149\n*S KotlinDebug\n*F\n+ 1 ReplayGestureConverter.kt\nio/sentry/android/replay/gestures/ReplayGestureConverter\n*L\n36#1:146,2\n64#1:148\n64#1:149,3\n*E\n"})
public final class ReplayGestureConverter {
    private static final int CAPTURE_MOVE_EVENT_THRESHOLD = 500;
    private static final int TOUCH_MOVE_DEBOUNCE_THRESHOLD = 50;

    @NotNull
    private final LinkedHashMap<Integer, ArrayList<c.b>> currentPositions;

    @NotNull
    private final p dateProvider;
    private long lastCapturedMoveEvent;
    private long touchMoveBaseline;
    public static final int $stable = 8;

    public ReplayGestureConverter(@NotNull p dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.dateProvider = dateProvider;
        this.currentPositions = new LinkedHashMap<>(10);
    }

    @Nullable
    public final List<RRWebIncrementalSnapshotEvent> convert(@NotNull MotionEvent event, @NotNull ScreenshotRecorderConfig recorderConfig) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        int actionMasked = event.getActionMasked();
        int i = 0;
        if (actionMasked != 0) {
            boolean z = true;
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    long jA = this.dateProvider.a();
                    long j = this.lastCapturedMoveEvent;
                    if (j != 0 && j + ((long) 50) > jA) {
                        return null;
                    }
                    this.lastCapturedMoveEvent = jA;
                    Set<Integer> setKeySet = this.currentPositions.keySet();
                    Intrinsics.checkNotNullExpressionValue(setKeySet, "currentPositions.keys");
                    for (Integer pId : setKeySet) {
                        Intrinsics.checkNotNullExpressionValue(pId, "pId");
                        int iFindPointerIndex = event.findPointerIndex(pId.intValue());
                        if (iFindPointerIndex != -1) {
                            if (this.touchMoveBaseline == 0) {
                                this.touchMoveBaseline = jA;
                            }
                            ArrayList<c.b> arrayList = this.currentPositions.get(pId);
                            Intrinsics.checkNotNull(arrayList);
                            c.b bVar = new c.b();
                            bVar.i(event.getX(iFindPointerIndex) * recorderConfig.getScaleFactorX());
                            bVar.j(event.getY(iFindPointerIndex) * recorderConfig.getScaleFactorY());
                            bVar.f(i);
                            bVar.g(jA - this.touchMoveBaseline);
                            arrayList.add(bVar);
                        }
                        i = 0;
                    }
                    long j2 = jA - this.touchMoveBaseline;
                    if (j2 <= 500) {
                        return null;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Map.Entry<Integer, ArrayList<c.b>> entry : this.currentPositions.entrySet()) {
                        int iIntValue = entry.getKey().intValue();
                        ArrayList<c.b> value = entry.getValue();
                        if (value.isEmpty() ^ z) {
                            c cVar = new c();
                            cVar.f(jA);
                            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(value, 10));
                            for (c.b bVar2 : value) {
                                bVar2.g(bVar2.e() - j2);
                                arrayList3.add(bVar2);
                                jA = jA;
                            }
                            cVar.n(arrayList3);
                            cVar.m(iIntValue);
                            arrayList2.add(cVar);
                            ArrayList<c.b> arrayList4 = this.currentPositions.get(Integer.valueOf(iIntValue));
                            Intrinsics.checkNotNull(arrayList4);
                            arrayList4.clear();
                            z = true;
                        }
                    }
                    this.touchMoveBaseline = 0L;
                    return arrayList2;
                }
                if (actionMasked == 3) {
                    this.currentPositions.clear();
                    RRWebInteractionEvent rRWebInteractionEvent = new RRWebInteractionEvent();
                    rRWebInteractionEvent.f(this.dateProvider.a());
                    rRWebInteractionEvent.u(event.getX() * recorderConfig.getScaleFactorX());
                    rRWebInteractionEvent.v(event.getY() * recorderConfig.getScaleFactorY());
                    rRWebInteractionEvent.q(0);
                    rRWebInteractionEvent.s(0);
                    rRWebInteractionEvent.r(RRWebInteractionEvent.InteractionType.TouchCancel);
                    return CollectionsKt__CollectionsJVMKt.listOf(rRWebInteractionEvent);
                }
                if (actionMasked != 5) {
                    if (actionMasked != 6) {
                        return null;
                    }
                }
            }
            int pointerId = event.getPointerId(event.getActionIndex());
            int iFindPointerIndex2 = event.findPointerIndex(pointerId);
            if (iFindPointerIndex2 == -1) {
                return null;
            }
            this.currentPositions.remove(Integer.valueOf(pointerId));
            RRWebInteractionEvent rRWebInteractionEvent2 = new RRWebInteractionEvent();
            rRWebInteractionEvent2.f(this.dateProvider.a());
            rRWebInteractionEvent2.u(event.getX(iFindPointerIndex2) * recorderConfig.getScaleFactorX());
            rRWebInteractionEvent2.v(event.getY(iFindPointerIndex2) * recorderConfig.getScaleFactorY());
            rRWebInteractionEvent2.q(0);
            rRWebInteractionEvent2.s(pointerId);
            rRWebInteractionEvent2.r(RRWebInteractionEvent.InteractionType.TouchEnd);
            return CollectionsKt__CollectionsJVMKt.listOf(rRWebInteractionEvent2);
        }
        int pointerId2 = event.getPointerId(event.getActionIndex());
        int iFindPointerIndex3 = event.findPointerIndex(pointerId2);
        if (iFindPointerIndex3 == -1) {
            return null;
        }
        this.currentPositions.put(Integer.valueOf(pointerId2), new ArrayList<>());
        RRWebInteractionEvent rRWebInteractionEvent3 = new RRWebInteractionEvent();
        rRWebInteractionEvent3.f(this.dateProvider.a());
        rRWebInteractionEvent3.u(event.getX(iFindPointerIndex3) * recorderConfig.getScaleFactorX());
        rRWebInteractionEvent3.v(event.getY(iFindPointerIndex3) * recorderConfig.getScaleFactorY());
        rRWebInteractionEvent3.q(0);
        rRWebInteractionEvent3.s(pointerId2);
        rRWebInteractionEvent3.r(RRWebInteractionEvent.InteractionType.TouchStart);
        return CollectionsKt__CollectionsJVMKt.listOf(rRWebInteractionEvent3);
    }
}
