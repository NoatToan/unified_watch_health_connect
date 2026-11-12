package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.watch.notification.TransportUri;
import com.tekartik.sqflite.Constant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.cybergarage.upnp.RootDescription;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010#\n\u0002\b\u001c\b\u0017\u0018\u00002\u00020\u0001BE\b\u0000\u0012\u0006\u0010,\u001a\u00020\u001c\u0012\u0006\u0010V\u001a\u00020!\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\bW\u0010XJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J8\u0010\n\u001a\u00020\u00002\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016J\u001e\u0010\u000e\u001a\u00020\u00012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006H\u0016J\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0017\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0018\u0010\u0016J\u000f\u0010\u001b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001a\u0010\u0016J5\u0010%\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\u0006\u0010\"\u001a\u00020!H\u0000¢\u0006\u0004\b#\u0010$J'\u0010+\u001a\u00028\u0000\"\u0004\b\u0000\u0010&2\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000'H\u0080\bø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0002H\u0000¢\u0006\u0004\b)\u0010\u0016J\u0017\u0010/\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u001cH\u0000¢\u0006\u0004\b-\u0010.J\u0017\u00103\u001a\u00020\u00022\u0006\u00100\u001a\u00020!H\u0000¢\u0006\u0004\b1\u00102J\u0017\u00108\u001a\u00020\u00022\u0006\u00105\u001a\u000204H\u0010¢\u0006\u0004\b6\u00107R*\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0010@\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b:\u0010;R*\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0010@\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b<\u0010;R:\u0010?\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010=2\u000e\u0010>\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010=8\u0010@VX\u0090\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010E\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u00102R\u0016\u00100\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010JR\"\u0010K\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u0016\u0010R\u001a\u00020\u00048V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010NR\u0016\u0010U\u001a\u00020\u00018V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010T\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006Y"}, d2 = {"Landroidx/compose/runtime/snapshots/MutableSnapshot;", "Landroidx/compose/runtime/snapshots/Snapshot;", "", "abandon", "", "hasPendingChanges", "Lkotlin/Function1;", "", "readObserver", "writeObserver", "takeNestedMutableSnapshot", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "apply", "dispose", "takeNestedSnapshot", "snapshot", "nestedActivated$runtime_release", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "nestedActivated", "nestedDeactivated$runtime_release", "nestedDeactivated", "notifyObjectsInitialized$runtime_release", "()V", "notifyObjectsInitialized", "close$runtime_release", "close", "validateNotApplied$runtime_release", "validateNotApplied", "", "snapshotId", "", "Landroidx/compose/runtime/snapshots/StateRecord;", "optimisticMerges", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalidSnapshots", "innerApply$runtime_release", "(ILjava/util/Map;Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "innerApply", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function0;", TransportUri.ACTION_BLOCK, "advance$runtime_release", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "advance", "id", "recordPrevious$runtime_release", "(I)V", "recordPrevious", "snapshots", "recordPreviousList$runtime_release", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "recordPreviousList", "Landroidx/compose/runtime/snapshots/StateObject;", "state", "recordModified$runtime_release", "(Landroidx/compose/runtime/snapshots/StateObject;)V", "recordModified", "Lkotlin/jvm/functions/Function1;", "getReadObserver$runtime_release", "()Lkotlin/jvm/functions/Function1;", "getWriteObserver$runtime_release", "", "<set-?>", "modified", "Ljava/util/Set;", "getModified$runtime_release", "()Ljava/util/Set;", "setModified", "(Ljava/util/Set;)V", "previousIds", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "getPreviousIds$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "setPreviousIds$runtime_release", LogUtil.I, "applied", "Z", "getApplied$runtime_release", "()Z", "setApplied$runtime_release", "(Z)V", "getReadOnly", Constant.c, "getRoot", "()Landroidx/compose/runtime/snapshots/Snapshot;", RootDescription.ROOT_ELEMENT, "invalid", "<init>", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "runtime_release"}, k = 1, mv = {1, 5, 1})
public class MutableSnapshot extends Snapshot {
    public static final int $stable = 8;
    private boolean applied;

    @Nullable
    private Set<StateObject> modified;

    @NotNull
    private SnapshotIdSet previousIds;

    @Nullable
    private final Function1<Object, Unit> readObserver;
    private int snapshots;

    @Nullable
    private final Function1<Object, Unit> writeObserver;

    public MutableSnapshot(int i, @NotNull SnapshotIdSet snapshotIdSet, @Nullable Function1<Object, Unit> function1, @Nullable Function1<Object, Unit> function2) {
        super(i, snapshotIdSet, null);
        this.readObserver = function1;
        this.writeObserver = function2;
        this.previousIds = SnapshotIdSet.INSTANCE.getEMPTY();
        this.snapshots = 1;
    }

    private final void abandon() {
        Set<StateObject> modified$runtime_release = getModified$runtime_release();
        if (modified$runtime_release != null) {
            validateNotApplied$runtime_release();
            setModified(null);
            int id = getId();
            Iterator<StateObject> it2 = modified$runtime_release.iterator();
            while (it2.hasNext()) {
                for (StateRecord firstStateRecord = it2.next().getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext()) {
                    if (firstStateRecord.getSnapshotId() == id || CollectionsKt___CollectionsKt.contains(this.previousIds, Integer.valueOf(firstStateRecord.getSnapshotId()))) {
                        firstStateRecord.setSnapshotId$runtime_release(0);
                    }
                }
            }
        }
        close$runtime_release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MutableSnapshot takeNestedMutableSnapshot$default(MutableSnapshot mutableSnapshot, Function1 function1, Function1 function2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedMutableSnapshot");
        }
        if ((i & 1) != 0) {
            function1 = null;
        }
        if ((i & 2) != 0) {
            function2 = null;
        }
        return mutableSnapshot.takeNestedMutableSnapshot(function1, function2);
    }

    public final <T> T advance$runtime_release(@NotNull Function0<? extends T> block) {
        recordPrevious$runtime_release(getId());
        T tInvoke = block.invoke();
        int id = getId();
        synchronized (SnapshotKt.getLock()) {
            try {
                int i = SnapshotKt.nextSnapshotId;
                SnapshotKt.nextSnapshotId = i + 1;
                setId$runtime_release(i);
                SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(getId());
                Unit unit = Unit.INSTANCE;
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        SnapshotIdSet invalid = getInvalid();
        int i2 = id + 1;
        int id2 = getId();
        if (i2 < id2) {
            while (true) {
                int i3 = i2 + 1;
                invalid = invalid.set(i2);
                if (i3 >= id2) {
                    break;
                }
                i2 = i3;
            }
        }
        setInvalid$runtime_release(invalid);
        return tInvoke;
    }

    @NotNull
    public SnapshotApplyResult apply() {
        Pair pair;
        int size;
        int size2;
        Set<StateObject> modified$runtime_release = getModified$runtime_release();
        Map<StateRecord, ? extends StateRecord> mapOptimisticMerges = modified$runtime_release != null ? SnapshotKt.optimisticMerges((MutableSnapshot) SnapshotKt.currentGlobalSnapshot.get(), this, SnapshotKt.openSnapshots.clear(((GlobalSnapshot) SnapshotKt.currentGlobalSnapshot.get()).getId())) : null;
        synchronized (SnapshotKt.getLock()) {
            SnapshotKt.validateOpen(this);
            if (modified$runtime_release == null || modified$runtime_release.size() == 0) {
                close$runtime_release();
                GlobalSnapshot globalSnapshot = (GlobalSnapshot) SnapshotKt.currentGlobalSnapshot.get();
                SnapshotKt.takeNewGlobalSnapshot(globalSnapshot, SnapshotKt.emptyLambda);
                Set<StateObject> modified$runtime_release2 = globalSnapshot.getModified$runtime_release();
                pair = (modified$runtime_release2 == null || !(modified$runtime_release2.isEmpty() ^ true)) ? TuplesKt.to(CollectionsKt__CollectionsKt.emptyList(), null) : TuplesKt.to(CollectionsKt___CollectionsKt.toMutableList((Collection) SnapshotKt.applyObservers), modified$runtime_release2);
            } else {
                GlobalSnapshot globalSnapshot2 = (GlobalSnapshot) SnapshotKt.currentGlobalSnapshot.get();
                SnapshotApplyResult snapshotApplyResultInnerApply$runtime_release = innerApply$runtime_release(SnapshotKt.nextSnapshotId, mapOptimisticMerges, SnapshotKt.openSnapshots.clear(globalSnapshot2.getId()));
                if (!Intrinsics.areEqual(snapshotApplyResultInnerApply$runtime_release, SnapshotApplyResult.Success.INSTANCE)) {
                    return snapshotApplyResultInnerApply$runtime_release;
                }
                close$runtime_release();
                SnapshotKt.takeNewGlobalSnapshot(globalSnapshot2, SnapshotKt.emptyLambda);
                Set<StateObject> modified$runtime_release3 = globalSnapshot2.getModified$runtime_release();
                setModified(null);
                globalSnapshot2.setModified(null);
                pair = TuplesKt.to(CollectionsKt___CollectionsKt.toMutableList((Collection) SnapshotKt.applyObservers), modified$runtime_release3);
            }
            List list = (List) pair.component1();
            Set set = (Set) pair.component2();
            this.applied = true;
            int i = 0;
            if (set != null && (!set.isEmpty()) && (size2 = list.size() - 1) >= 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    ((Function2) list.get(i2)).invoke(set, this);
                    if (i3 > size2) {
                        break;
                    }
                    i2 = i3;
                }
            }
            if (modified$runtime_release != null && (!modified$runtime_release.isEmpty()) && (size = list.size() - 1) >= 0) {
                while (true) {
                    int i4 = i + 1;
                    ((Function2) list.get(i)).invoke(modified$runtime_release, this);
                    if (i4 > size) {
                        break;
                    }
                    i = i4;
                }
            }
            return SnapshotApplyResult.Success.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void close$runtime_release() {
        synchronized (SnapshotKt.getLock()) {
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.clear(getId()).andNot(getPreviousIds());
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (getDisposed()) {
            return;
        }
        super.dispose();
        mo914nestedDeactivated$runtime_release(this);
    }

    /* JADX INFO: renamed from: getApplied$runtime_release, reason: from getter */
    public final boolean getApplied() {
        return this.applied;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @Nullable
    public Set<StateObject> getModified$runtime_release() {
        return this.modified;
    }

    @NotNull
    /* JADX INFO: renamed from: getPreviousIds$runtime_release, reason: from getter */
    public final SnapshotIdSet getPreviousIds() {
        return this.previousIds;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @Nullable
    public Function1<Object, Unit> getReadObserver$runtime_release() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @NotNull
    public Snapshot getRoot() {
        return this;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @Nullable
    public Function1<Object, Unit> getWriteObserver$runtime_release() {
        return this.writeObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        Set<StateObject> modified$runtime_release = getModified$runtime_release();
        return modified$runtime_release != null && (modified$runtime_release.isEmpty() ^ true);
    }

    @NotNull
    public final SnapshotApplyResult innerApply$runtime_release(int snapshotId, @Nullable Map<StateRecord, ? extends StateRecord> optimisticMerges, @NotNull SnapshotIdSet invalidSnapshots) {
        StateRecord stateRecord;
        SnapshotIdSet snapshotIdSetOr = getInvalid().set(getId()).or(this.previousIds);
        Set<StateObject> modified$runtime_release = getModified$runtime_release();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (StateObject stateObject : modified$runtime_release) {
            StateRecord firstStateRecord = stateObject.getFirstStateRecord();
            StateRecord stateRecord2 = SnapshotKt.readable(firstStateRecord, snapshotId, invalidSnapshots);
            if (stateRecord2 != null && (stateRecord = SnapshotKt.readable(firstStateRecord, getId(), snapshotIdSetOr)) != null && !Intrinsics.areEqual(stateRecord2, stateRecord)) {
                StateRecord stateRecord3 = SnapshotKt.readable(firstStateRecord, getId(), getInvalid());
                if (stateRecord3 == null) {
                    SnapshotKt.readError();
                    throw new KotlinNothingValueException();
                }
                StateRecord stateRecordMergeRecords = optimisticMerges == null ? null : optimisticMerges.get(stateRecord2);
                if (stateRecordMergeRecords == null) {
                    stateRecordMergeRecords = stateObject.mergeRecords(stateRecord, stateRecord2, stateRecord3);
                }
                if (stateRecordMergeRecords == null) {
                    return new SnapshotApplyResult.Failure(this);
                }
                if (!Intrinsics.areEqual(stateRecordMergeRecords, stateRecord3)) {
                    if (Intrinsics.areEqual(stateRecordMergeRecords, stateRecord2)) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(TuplesKt.to(stateObject, stateRecord2.create()));
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(stateObject);
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(!Intrinsics.areEqual(stateRecordMergeRecords, stateRecord) ? TuplesKt.to(stateObject, stateRecordMergeRecords) : TuplesKt.to(stateObject, stateRecord.create()));
                    }
                }
            }
        }
        if (arrayList != null) {
            advance$runtime_release();
            int i = 0;
            int size = arrayList.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i2 = i + 1;
                    Pair pair = (Pair) arrayList.get(i);
                    StateObject stateObject2 = (StateObject) pair.component1();
                    StateRecord stateRecord4 = (StateRecord) pair.component2();
                    stateRecord4.setSnapshotId$runtime_release(getId());
                    synchronized (SnapshotKt.getLock()) {
                        stateRecord4.setNext$runtime_release(stateObject2.getFirstStateRecord());
                        stateObject2.prependStateRecord(stateRecord4);
                        Unit unit = Unit.INSTANCE;
                    }
                    if (i2 > size) {
                        break;
                    }
                    i = i2;
                }
            }
        }
        if (arrayList2 != null) {
            modified$runtime_release.removeAll(arrayList2);
        }
        return SnapshotApplyResult.Success.INSTANCE;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: nestedActivated$runtime_release */
    public void mo913nestedActivated$runtime_release(@NotNull Snapshot snapshot) {
        this.snapshots++;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: nestedDeactivated$runtime_release */
    public void mo914nestedDeactivated$runtime_release(@NotNull Snapshot snapshot) {
        int i = this.snapshots;
        if (!(i > 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i2 = i - 1;
        this.snapshots = i2;
        if (i2 != 0 || this.applied) {
            return;
        }
        abandon();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
        if (this.applied || getDisposed()) {
            return;
        }
        advance$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void recordModified$runtime_release(@NotNull StateObject state) {
        Set<StateObject> modified$runtime_release = getModified$runtime_release();
        if (modified$runtime_release == null) {
            modified$runtime_release = new HashSet<>();
            setModified(modified$runtime_release);
        }
        modified$runtime_release.add(state);
    }

    public final void recordPrevious$runtime_release(int id) {
        synchronized (SnapshotKt.getLock()) {
            setPreviousIds$runtime_release(getPreviousIds().set(id));
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void recordPreviousList$runtime_release(@NotNull SnapshotIdSet snapshots) {
        synchronized (SnapshotKt.getLock()) {
            setPreviousIds$runtime_release(getPreviousIds().or(snapshots));
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void setApplied$runtime_release(boolean z) {
        this.applied = z;
    }

    public void setModified(@Nullable Set<StateObject> set) {
        this.modified = set;
    }

    public final void setPreviousIds$runtime_release(@NotNull SnapshotIdSet snapshotIdSet) {
        this.previousIds = snapshotIdSet;
    }

    @NotNull
    public MutableSnapshot takeNestedMutableSnapshot(@Nullable Function1<Object, Unit> readObserver, @Nullable Function1<Object, Unit> writeObserver) {
        NestedMutableSnapshot nestedMutableSnapshot;
        validateNotDisposed$runtime_release();
        validateNotApplied$runtime_release();
        recordPrevious$runtime_release(getId());
        synchronized (SnapshotKt.getLock()) {
            int i = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = i + 1;
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(i);
            SnapshotIdSet invalid = getInvalid();
            setInvalid$runtime_release(invalid.set(i));
            nestedMutableSnapshot = new NestedMutableSnapshot(i, invalid, SnapshotKt.mergedReadObserver(readObserver, getReadObserver$runtime_release()), SnapshotKt.mergedWriteObserver(writeObserver, getWriteObserver$runtime_release()), this);
        }
        int id = getId();
        synchronized (SnapshotKt.getLock()) {
            int i2 = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = i2 + 1;
            setId$runtime_release(i2);
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(getId());
            Unit unit = Unit.INSTANCE;
        }
        SnapshotIdSet invalid2 = getInvalid();
        int i3 = id + 1;
        int id2 = getId();
        if (i3 < id2) {
            while (true) {
                int i4 = i3 + 1;
                invalid2 = invalid2.set(i3);
                if (i4 >= id2) {
                    break;
                }
                i3 = i4;
            }
        }
        setInvalid$runtime_release(invalid2);
        return nestedMutableSnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @NotNull
    public Snapshot takeNestedSnapshot(@Nullable Function1<Object, Unit> readObserver) {
        NestedReadonlySnapshot nestedReadonlySnapshot;
        validateNotDisposed$runtime_release();
        validateNotApplied$runtime_release();
        int id = getId();
        recordPrevious$runtime_release(getId());
        synchronized (SnapshotKt.getLock()) {
            int i = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = i + 1;
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(i);
            SnapshotIdSet invalid = getInvalid();
            int i2 = id + 1;
            if (i2 < i) {
                while (true) {
                    int i3 = i2 + 1;
                    invalid = invalid.set(i2);
                    if (i3 >= i) {
                        break;
                    }
                    i2 = i3;
                }
            }
            nestedReadonlySnapshot = new NestedReadonlySnapshot(i, invalid, readObserver, this);
        }
        int id2 = getId();
        synchronized (SnapshotKt.getLock()) {
            int i4 = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = i4 + 1;
            setId$runtime_release(i4);
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(getId());
            Unit unit = Unit.INSTANCE;
        }
        SnapshotIdSet invalid2 = getInvalid();
        int i5 = id2 + 1;
        int id3 = getId();
        if (i5 < id3) {
            while (true) {
                int i6 = i5 + 1;
                invalid2 = invalid2.set(i5);
                if (i6 >= id3) {
                    break;
                }
                i5 = i6;
            }
        }
        setInvalid$runtime_release(invalid2);
        return nestedReadonlySnapshot;
    }

    public final void validateNotApplied$runtime_release() {
        if (!(!this.applied)) {
            throw new IllegalArgumentException("Unsupported operation on a snapshot that has been applied".toString());
        }
    }

    public final void advance$runtime_release() {
        recordPrevious$runtime_release(getId());
        Unit unit = Unit.INSTANCE;
        int id = getId();
        synchronized (SnapshotKt.getLock()) {
            int i = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = i + 1;
            setId$runtime_release(i);
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(getId());
        }
        SnapshotIdSet invalid = getInvalid();
        int i2 = id + 1;
        int id2 = getId();
        if (i2 < id2) {
            while (true) {
                int i3 = i2 + 1;
                invalid = invalid.set(i2);
                if (i3 >= id2) {
                    break;
                } else {
                    i2 = i3;
                }
            }
        }
        setInvalid$runtime_release(invalid);
    }
}
