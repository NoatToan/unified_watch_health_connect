package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.SnapshotThreadLocal;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.watch.notification.TransportUri;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0000\u001aB\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0002\u001aB\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0002\u001a'\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0081\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a@\u0010\u0014\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000f\u001a\u00020\u00002!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a8\u0010\u0016\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\b\u0010\u0016\u001a\u00020\u0004H\u0002\u001a<\u0010\u0018\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020\u00002!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0000H\u0002\u001a \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0001\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u0010H\u0002\u001a \u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u0010H\u0002\u001a3\u0010$\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\n*\u00020 2\u0006\u0010\"\u001a\u00028\u00002\u0006\u0010#\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b$\u0010%\u001a#\u0010$\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020 *\u00028\u00002\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b$\u0010(\u001a+\u0010$\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020 *\u00028\u00002\u0006\u0010'\u001a\u00020&2\u0006\u0010\u001a\u001a\u00020\u0000¢\u0006\u0004\b$\u0010)\u001a\b\u0010+\u001a\u00020*H\u0002\u001a\"\u0010,\u001a\u0004\u0018\u00010 2\u0006\u0010'\u001a\u00020&2\u0006\u0010#\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u0010H\u0002\u001a-\u0010-\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020 *\u00028\u00002\u0006\u0010'\u001a\u00020&2\u0006\u0010\u001a\u001a\u00020\u0000H\u0001¢\u0006\u0004\b-\u0010)\u001a5\u0010/\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020 *\u00028\u00002\u0006\u0010'\u001a\u00020&2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010.\u001a\u00028\u0000H\u0000¢\u0006\u0004\b/\u00100\u001a-\u00101\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020 *\u00028\u00002\u0006\u0010'\u001a\u00020&2\u0006\u0010\u001a\u001a\u00020\u0000H\u0000¢\u0006\u0004\b1\u0010)\u001a-\u00102\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020 *\u00028\u00002\u0006\u0010'\u001a\u00020&2\u0006\u0010\u001a\u001a\u00020\u0000H\u0000¢\u0006\u0004\b2\u0010)\u001a\u0018\u00103\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&H\u0001\u001aP\u00106\u001a\u00028\u0001\"\b\b\u0000\u0010\n*\u00020 \"\u0004\b\u0001\u00104*\u00028\u00002\u0006\u0010'\u001a\u00020&2\u0006\u0010\u001a\u001a\u00020\u00002\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0002\b5H\u0086\bø\u0001\u0000¢\u0006\u0004\b6\u00107\u001aH\u00106\u001a\u00028\u0001\"\b\b\u0000\u0010\n*\u00020 \"\u0004\b\u0001\u00104*\u00028\u00002\u0006\u0010'\u001a\u00020&2\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0002\b5H\u0086\bø\u0001\u0000¢\u0006\u0004\b6\u00108\u001aP\u00109\u001a\u00028\u0001\"\b\b\u0000\u0010\n*\u00020 \"\u0004\b\u0001\u00104*\u00028\u00002\u0006\u0010'\u001a\u00020&2\u0006\u0010.\u001a\u00028\u00002\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0002\b5H\u0080\bø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a.\u0010?\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 \u0018\u00010>2\u0006\u0010\u0001\u001a\u00020;2\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020\u0010H\u0002\u001a)\u0010@\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020 2\u0006\u0010\"\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u0000H\u0001¢\u0006\u0004\b@\u0010A\u001aJ\u0010B\u001a\u00028\u0001\"\b\b\u0000\u0010\n*\u00020 \"\u0004\b\u0001\u00104*\u00028\u00002!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\bø\u0001\u0000¢\u0006\u0004\bB\u0010C\"1\u0010D\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00040\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010E\"\u0016\u0010F\u001a\u00020\u001c8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bF\u0010G\"\u001c\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00000H8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010J\"\"\u0010K\u001a\u00020\u00038\u0000@\u0001X\u0081\u0004¢\u0006\u0012\n\u0004\bK\u0010L\u0012\u0004\bO\u0010P\u001a\u0004\bM\u0010N\"\u0016\u0010Q\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010R\"\u0016\u0010S\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010G\"4\u0010W\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030V\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040U0T8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010X\"(\u0010Y\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020T8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010X\"6\u0010^\u001a\"\u0012\f\u0012\n \\*\u0004\u0018\u00010[0[0Zj\u0010\u0012\f\u0012\n \\*\u0004\u0018\u00010[0[`]8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_\"\"\u0010`\u001a\u00020\u00008\u0000@\u0001X\u0081\u0004¢\u0006\u0012\n\u0004\b`\u0010a\u0012\u0004\bd\u0010P\u001a\u0004\bb\u0010c\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006e"}, d2 = {"Landroidx/compose/runtime/snapshots/Snapshot;", "currentSnapshot", "Lkotlin/Function1;", "", "", "readObserver", "parentObserver", "mergedReadObserver", "writeObserver", "mergedWriteObserver", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function0;", TransportUri.ACTION_BLOCK, "sync", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "previousGlobalSnapshot", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "Lkotlin/ParameterName;", "name", "invalid", "takeNewGlobalSnapshot", "(Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "advanceGlobalSnapshot", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "takeNewSnapshot", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "validateOpen", "", "candidateSnapshot", "", "valid", "Landroidx/compose/runtime/snapshots/StateRecord;", "data", "r", "id", "readable", "(Landroidx/compose/runtime/snapshots/StateRecord;ILandroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/StateRecord;", "Landroidx/compose/runtime/snapshots/StateObject;", "state", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;)Landroidx/compose/runtime/snapshots/StateRecord;", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;", "", "readError", "used", "writableRecord", "candidate", "overwritableRecord", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;", "newWritableRecord", "newOverwritableRecord", "notifyWrite", "R", "Lkotlin/ExtensionFunctionType;", "writable", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "overwritable", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/StateRecord;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "applyingSnapshot", "invalidSnapshots", "", "optimisticMerges", "current", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;", "withCurrent", "(Landroidx/compose/runtime/snapshots/StateRecord;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "emptyLambda", "Lkotlin/jvm/functions/Function1;", "INVALID_SNAPSHOT", LogUtil.I, "Landroidx/compose/runtime/SnapshotThreadLocal;", "threadSnapshot", "Landroidx/compose/runtime/SnapshotThreadLocal;", "lock", "Ljava/lang/Object;", "getLock", "()Ljava/lang/Object;", "getLock$annotations", "()V", "openSnapshots", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "nextSnapshotId", "", "Lkotlin/Function2;", "", "applyObservers", "Ljava/util/List;", "globalWriteObservers", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/snapshots/GlobalSnapshot;", "kotlin.jvm.PlatformType", "Landroidx/compose/runtime/AtomicReference;", "currentGlobalSnapshot", "Ljava/util/concurrent/atomic/AtomicReference;", "snapshotInitializer", "Landroidx/compose/runtime/snapshots/Snapshot;", "getSnapshotInitializer", "()Landroidx/compose/runtime/snapshots/Snapshot;", "getSnapshotInitializer$annotations", "runtime_release"}, k = 2, mv = {1, 5, 1})
public final class SnapshotKt {
    private static final int INVALID_SNAPSHOT = 0;

    @NotNull
    private static final List<Function2<Set<? extends Object>, Snapshot, Unit>> applyObservers;

    @NotNull
    private static final AtomicReference<GlobalSnapshot> currentGlobalSnapshot;

    @NotNull
    private static final List<Function1<Object, Unit>> globalWriteObservers;
    private static int nextSnapshotId;

    @NotNull
    private static SnapshotIdSet openSnapshots;

    @NotNull
    private static final Snapshot snapshotInitializer;

    @NotNull
    private static final Function1<SnapshotIdSet, Unit> emptyLambda = new Function1<SnapshotIdSet, Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt$emptyLambda$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SnapshotIdSet snapshotIdSet) {
            invoke2(snapshotIdSet);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull SnapshotIdSet snapshotIdSet) {
        }
    };

    @NotNull
    private static final SnapshotThreadLocal<Snapshot> threadSnapshot = new SnapshotThreadLocal<>();

    @NotNull
    private static final Object lock = new Object();

    static {
        SnapshotIdSet.Companion companion = SnapshotIdSet.INSTANCE;
        openSnapshots = companion.getEMPTY();
        nextSnapshotId = 1;
        applyObservers = new ArrayList();
        globalWriteObservers = new ArrayList();
        int i = nextSnapshotId;
        nextSnapshotId = i + 1;
        GlobalSnapshot globalSnapshot = new GlobalSnapshot(i, companion.getEMPTY());
        openSnapshots = openSnapshots.set(globalSnapshot.getId());
        Unit unit = Unit.INSTANCE;
        AtomicReference<GlobalSnapshot> atomicReference = new AtomicReference<>(globalSnapshot);
        currentGlobalSnapshot = atomicReference;
        snapshotInitializer = atomicReference.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T advanceGlobalSnapshot(Function1<? super SnapshotIdSet, ? extends T> function1) {
        T t;
        List mutableList;
        GlobalSnapshot globalSnapshot = currentGlobalSnapshot.get();
        synchronized (getLock()) {
            t = (T) takeNewGlobalSnapshot(globalSnapshot, function1);
        }
        Set<StateObject> modified$runtime_release = globalSnapshot.getModified$runtime_release();
        if (modified$runtime_release != null) {
            synchronized (getLock()) {
                mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) applyObservers);
            }
            int i = 0;
            int size = mutableList.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i2 = i + 1;
                    ((Function2) mutableList.get(i)).invoke(modified$runtime_release, globalSnapshot);
                    if (i2 > size) {
                        break;
                    }
                    i = i2;
                }
            }
        }
        return t;
    }

    @PublishedApi
    @NotNull
    public static final <T extends StateRecord> T current(@NotNull T t, @NotNull Snapshot snapshot) {
        T t2 = (T) readable(t, snapshot.getId(), snapshot.getInvalid());
        if (t2 != null) {
            return t2;
        }
        readError();
        throw new KotlinNothingValueException();
    }

    @NotNull
    public static final Snapshot currentSnapshot() {
        Snapshot snapshot = threadSnapshot.get();
        return snapshot == null ? currentGlobalSnapshot.get() : snapshot;
    }

    @NotNull
    public static final Object getLock() {
        return lock;
    }

    @PublishedApi
    public static /* synthetic */ void getLock$annotations() {
    }

    @NotNull
    public static final Snapshot getSnapshotInitializer() {
        return snapshotInitializer;
    }

    @PublishedApi
    public static /* synthetic */ void getSnapshotInitializer$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1<Object, Unit> mergedReadObserver(final Function1<Object, Unit> function1, final Function1<Object, Unit> function2) {
        if (function1 == null || function2 == null || Intrinsics.areEqual(function1, function2)) {
            return function1 == null ? function2 : function1;
        }
        return new Function1<Object, Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt.mergedReadObserver.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object obj) {
                function1.invoke(obj);
                function2.invoke(obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1<Object, Unit> mergedWriteObserver(final Function1<Object, Unit> function1, final Function1<Object, Unit> function2) {
        if (function1 == null || function2 == null || Intrinsics.areEqual(function1, function2)) {
            return function1 == null ? function2 : function1;
        }
        return new Function1<Object, Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt.mergedWriteObserver.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object obj) {
                function1.invoke(obj);
                function2.invoke(obj);
            }
        };
    }

    @NotNull
    public static final <T extends StateRecord> T newOverwritableRecord(@NotNull T t, @NotNull StateObject stateObject, @NotNull Snapshot snapshot) {
        T t2 = (T) used(stateObject, snapshot.getId(), openSnapshots);
        if (t2 == null) {
            t2 = null;
        } else {
            t2.setSnapshotId$runtime_release(Integer.MAX_VALUE);
        }
        if (t2 != null) {
            return t2;
        }
        T t3 = (T) t.create();
        t3.setSnapshotId$runtime_release(Integer.MAX_VALUE);
        t3.setNext$runtime_release(stateObject.getFirstStateRecord());
        stateObject.prependStateRecord(t3);
        return t3;
    }

    @NotNull
    public static final <T extends StateRecord> T newWritableRecord(@NotNull T t, @NotNull StateObject stateObject, @NotNull Snapshot snapshot) {
        T t2 = (T) newOverwritableRecord(t, stateObject, snapshot);
        t2.assign(t);
        t2.setSnapshotId$runtime_release(snapshot.getId());
        return t2;
    }

    @PublishedApi
    public static final void notifyWrite(@NotNull Snapshot snapshot, @NotNull StateObject stateObject) {
        Function1<Object, Unit> writeObserver$runtime_release = snapshot.getWriteObserver$runtime_release();
        if (writeObserver$runtime_release == null) {
            return;
        }
        writeObserver$runtime_release.invoke(stateObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<StateRecord, StateRecord> optimisticMerges(MutableSnapshot mutableSnapshot, MutableSnapshot mutableSnapshot2, SnapshotIdSet snapshotIdSet) {
        StateRecord stateRecord;
        Set<StateObject> modified$runtime_release = mutableSnapshot2.getModified$runtime_release();
        int id = mutableSnapshot.getId();
        if (modified$runtime_release == null) {
            return null;
        }
        SnapshotIdSet snapshotIdSetOr = mutableSnapshot2.getInvalid().set(mutableSnapshot2.getId()).or(mutableSnapshot2.getPreviousIds$runtime_release());
        HashMap map = null;
        for (StateObject stateObject : modified$runtime_release) {
            StateRecord firstStateRecord = stateObject.getFirstStateRecord();
            StateRecord stateRecord2 = readable(firstStateRecord, id, snapshotIdSet);
            if (stateRecord2 != null && (stateRecord = readable(firstStateRecord, id, snapshotIdSetOr)) != null && !Intrinsics.areEqual(stateRecord2, stateRecord)) {
                StateRecord stateRecord3 = readable(firstStateRecord, mutableSnapshot2.getId(), mutableSnapshot2.getInvalid());
                if (stateRecord3 == null) {
                    readError();
                    throw new KotlinNothingValueException();
                }
                StateRecord stateRecordMergeRecords = stateObject.mergeRecords(stateRecord, stateRecord2, stateRecord3);
                if (stateRecordMergeRecords == null) {
                    return null;
                }
                if (map == null) {
                    map = new HashMap();
                }
                map.put(stateRecord2, stateRecordMergeRecords);
                map = map;
            }
        }
        return map;
    }

    public static final <T extends StateRecord, R> R overwritable(@NotNull T t, @NotNull StateObject stateObject, @NotNull T t2, @NotNull Function1<? super T, ? extends R> function1) {
        Snapshot current;
        R rInvoke;
        getSnapshotInitializer();
        synchronized (getLock()) {
            try {
                current = Snapshot.INSTANCE.getCurrent();
                rInvoke = function1.invoke(overwritableRecord(t, stateObject, current, t2));
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        notifyWrite(current, stateObject);
        return rInvoke;
    }

    @NotNull
    public static final <T extends StateRecord> T overwritableRecord(@NotNull T t, @NotNull StateObject stateObject, @NotNull Snapshot snapshot, @NotNull T t2) {
        if (snapshot.getReadOnly()) {
            snapshot.recordModified$runtime_release(stateObject);
        }
        int id = snapshot.getId();
        if (t2.getSnapshotId() == id) {
            return t2;
        }
        T t3 = (T) newOverwritableRecord(t, stateObject, snapshot);
        t3.setSnapshotId$runtime_release(id);
        snapshot.recordModified$runtime_release(stateObject);
        return t3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void readError() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends StateRecord> T readable(T t, int i, SnapshotIdSet snapshotIdSet) {
        T t2 = null;
        while (t != null) {
            if (valid(t, i, snapshotIdSet) && (t2 == null || t2.getSnapshotId() < t.getSnapshotId())) {
                t2 = t;
            }
            t = (T) t.getNext();
        }
        if (t2 != null) {
            return t2;
        }
        return null;
    }

    @PublishedApi
    public static final <T> T sync(@NotNull Function0<? extends T> function0) {
        T tInvoke;
        synchronized (getLock()) {
            try {
                tInvoke = function0.invoke();
                InlineMarker.finallyStart(1);
            } finally {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
            }
        }
        return tInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T takeNewGlobalSnapshot(Snapshot snapshot, Function1<? super SnapshotIdSet, ? extends T> function1) {
        T tInvoke = function1.invoke(openSnapshots.clear(snapshot.getId()));
        synchronized (getLock()) {
            int i = nextSnapshotId;
            nextSnapshotId = i + 1;
            openSnapshots = openSnapshots.clear(snapshot.getId());
            currentGlobalSnapshot.set(new GlobalSnapshot(i, openSnapshots));
            openSnapshots = openSnapshots.set(i);
            Unit unit = Unit.INSTANCE;
        }
        return tInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends Snapshot> T takeNewSnapshot(final Function1<? super SnapshotIdSet, ? extends T> function1) {
        return (T) advanceGlobalSnapshot(new Function1<SnapshotIdSet, T>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt.takeNewSnapshot.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Incorrect return type in method signature: (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)TT; */
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Snapshot invoke(@NotNull SnapshotIdSet snapshotIdSet) {
                Snapshot snapshot = (Snapshot) function1.invoke(snapshotIdSet);
                synchronized (SnapshotKt.getLock()) {
                    SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(snapshot.getId());
                    Unit unit = Unit.INSTANCE;
                }
                return snapshot;
            }
        });
    }

    private static final StateRecord used(StateObject stateObject, int i, SnapshotIdSet snapshotIdSet) {
        int iLowest = snapshotIdSet.lowest(i);
        StateRecord stateRecord = null;
        for (StateRecord firstStateRecord = stateObject.getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext()) {
            if (firstStateRecord.getSnapshotId() == 0) {
                return firstStateRecord;
            }
            if (valid(firstStateRecord, iLowest, snapshotIdSet)) {
                if (stateRecord != null) {
                    return firstStateRecord.getSnapshotId() < stateRecord.getSnapshotId() ? firstStateRecord : stateRecord;
                }
                stateRecord = firstStateRecord;
            }
        }
        return null;
    }

    private static final boolean valid(int i, int i2, SnapshotIdSet snapshotIdSet) {
        return (i2 == 0 || i2 > i || snapshotIdSet.get(i2)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateOpen(Snapshot snapshot) {
        if (!openSnapshots.get(snapshot.getId())) {
            throw new IllegalStateException("Snapshot is not open".toString());
        }
    }

    public static final <T extends StateRecord, R> R withCurrent(@NotNull T t, @NotNull Function1<? super T, ? extends R> function1) {
        return function1.invoke(current(t, Snapshot.INSTANCE.getCurrent()));
    }

    public static final <T extends StateRecord, R> R writable(@NotNull T t, @NotNull StateObject stateObject, @NotNull Function1<? super T, ? extends R> function1) {
        Snapshot current;
        R rInvoke;
        getSnapshotInitializer();
        synchronized (getLock()) {
            try {
                current = Snapshot.INSTANCE.getCurrent();
                rInvoke = function1.invoke(writableRecord(t, stateObject, current));
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        notifyWrite(current, stateObject);
        return rInvoke;
    }

    @PublishedApi
    @NotNull
    public static final <T extends StateRecord> T writableRecord(@NotNull T t, @NotNull StateObject stateObject, @NotNull Snapshot snapshot) {
        if (snapshot.getReadOnly()) {
            snapshot.recordModified$runtime_release(stateObject);
        }
        T t2 = (T) readable(t, snapshot.getId(), snapshot.getInvalid());
        if (t2 == null) {
            readError();
            throw new KotlinNothingValueException();
        }
        if (t2.getSnapshotId() == snapshot.getId()) {
            return t2;
        }
        T t3 = (T) newWritableRecord(t, stateObject, snapshot);
        snapshot.recordModified$runtime_release(stateObject);
        return t3;
    }

    private static final boolean valid(StateRecord stateRecord, int i, SnapshotIdSet snapshotIdSet) {
        return valid(i, stateRecord.getSnapshotId(), snapshotIdSet);
    }

    @NotNull
    public static final <T extends StateRecord> T readable(@NotNull T t, @NotNull StateObject stateObject) {
        return (T) readable(t, stateObject, currentSnapshot());
    }

    @NotNull
    public static final <T extends StateRecord> T readable(@NotNull T t, @NotNull StateObject stateObject, @NotNull Snapshot snapshot) {
        Function1<Object, Unit> readObserver$runtime_release = snapshot.getReadObserver$runtime_release();
        if (readObserver$runtime_release != null) {
            readObserver$runtime_release.invoke(stateObject);
        }
        T t2 = (T) readable(t, snapshot.getId(), snapshot.getInvalid());
        if (t2 != null) {
            return t2;
        }
        readError();
        throw new KotlinNothingValueException();
    }

    public static final <T extends StateRecord, R> R writable(@NotNull T t, @NotNull StateObject stateObject, @NotNull Snapshot snapshot, @NotNull Function1<? super T, ? extends R> function1) {
        R rInvoke;
        synchronized (getLock()) {
            try {
                rInvoke = function1.invoke(writableRecord(t, stateObject, snapshot));
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        notifyWrite(snapshot, stateObject);
        return rInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void advanceGlobalSnapshot() {
        advanceGlobalSnapshot(new Function1<SnapshotIdSet, Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt.advanceGlobalSnapshot.2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SnapshotIdSet snapshotIdSet) {
                invoke2(snapshotIdSet);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull SnapshotIdSet snapshotIdSet) {
            }
        });
    }
}
