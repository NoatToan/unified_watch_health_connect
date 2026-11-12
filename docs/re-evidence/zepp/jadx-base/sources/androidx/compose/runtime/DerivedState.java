package androidx.compose.runtime;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateRecord;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.device.event.StatEvent;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.runtime.DerivedSnapshotState, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\"\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\"B\u0015\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b \u0010!J2\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\r8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000e\u001a\u00028\u00008V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00028\u00008V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/snapshots/StateObject;", "Landroidx/compose/runtime/DerivedState;", "Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;", "readable", "Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "Lkotlin/Function0;", "calculation", "currentRecord", "", "displayValue", "Landroidx/compose/runtime/snapshots/StateRecord;", "value", "", "prependStateRecord", "toString", "Lkotlin/jvm/functions/Function0;", StatEvent.TP_FIRST, "Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "firstStateRecord", "getValue", "()Ljava/lang/Object;", "getCurrentValue", "currentValue", "", "getDependencies", "()Ljava/util/Set;", "dependencies", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "ResultRecord", "runtime_release"}, k = 1, mv = {1, 5, 1})
final class DerivedState<T> implements StateObject, androidx.compose.runtime.DerivedState<T> {

    @NotNull
    private final Function0<T> calculation;

    @NotNull
    private ResultRecord<T> first = new ResultRecord<>();

    /* JADX INFO: renamed from: androidx.compose.runtime.DerivedSnapshotState$ResultRecord */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\n\u001a\u00020\tJ\u001a\u0010\u000e\u001a\u00020\r2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\n\u001a\u00020\tR6\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fj\n\u0012\u0004\u0012\u00020\u0010\u0018\u0001`\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u0004\u0018\u00018\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/snapshots/StateRecord;", "value", "", "assign", "create", "Landroidx/compose/runtime/DerivedState;", "derivedState", "Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "", "isValid", "", "readableHash", "Ljava/util/HashSet;", "Landroidx/compose/runtime/snapshots/StateObject;", "Lkotlin/collections/HashSet;", "dependencies", "Ljava/util/HashSet;", "getDependencies", "()Ljava/util/HashSet;", "setDependencies", "(Ljava/util/HashSet;)V", "result", "Ljava/lang/Object;", "getResult", "()Ljava/lang/Object;", "setResult", "(Ljava/lang/Object;)V", "resultHash", LogUtil.I, "getResultHash", "()I", "setResultHash", "(I)V", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 5, 1})
    public static final class ResultRecord<T> extends StateRecord {

        @Nullable
        private HashSet<StateObject> dependencies;

        @Nullable
        private T result;
        private int resultHash;

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(@NotNull StateRecord value) {
            ResultRecord resultRecord = (ResultRecord) value;
            this.dependencies = resultRecord.dependencies;
            this.result = resultRecord.result;
            this.resultHash = resultRecord.resultHash;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        @NotNull
        public StateRecord create() {
            return new ResultRecord();
        }

        @Nullable
        public final HashSet<StateObject> getDependencies() {
            return this.dependencies;
        }

        @Nullable
        public final T getResult() {
            return this.result;
        }

        public final int getResultHash() {
            return this.resultHash;
        }

        public final boolean isValid(@NotNull androidx.compose.runtime.DerivedState<?> derivedState, @NotNull Snapshot snapshot) {
            return this.result != null && this.resultHash == readableHash(derivedState, snapshot);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0047 A[Catch: all -> 0x0084, LOOP:1: B:19:0x0041->B:21:0x0047, LOOP_END, TryCatch #0 {all -> 0x0084, blocks: (B:18:0x003d, B:19:0x0041, B:21:0x0047, B:22:0x0064), top: B:40:0x003d }] */
        /* JADX WARN: Code duplicated, block: B:25:0x006e A[LOOP:2: B:25:0x006e->B:28:0x0082, LOOP_START, PHI: r4
          0x006e: PHI (r4v3 int) = (r4v0 int), (r4v4 int) binds: [B:24:0x006c, B:28:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:28:0x0082 A[LOOP:2: B:25:0x006e->B:28:0x0082, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:45:0x00a3 A[EDGE_INSN: B:45:0x00a3->B:36:0x00a3 BREAK  A[LOOP:2: B:25:0x006e->B:28:0x0082], SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        public final int readableHash(@NotNull androidx.compose.runtime.DerivedState<?> derivedState, @NotNull Snapshot snapshot) {
            HashSet<StateObject> dependencies;
            int size;
            int i;
            synchronized (SnapshotKt.getLock()) {
                dependencies = getDependencies();
            }
            int iIdentityHashCode = 7;
            if (dependencies != null) {
                PersistentList persistentListPersistentListOf = (PersistentList) SnapshotStateKt.derivedStateObservers.get();
                if (persistentListPersistentListOf == null) {
                    persistentListPersistentListOf = ExtensionsKt.persistentListOf();
                }
                int size2 = persistentListPersistentListOf.size() - 1;
                int i2 = 0;
                try {
                    if (size2 >= 0) {
                        int i3 = 0;
                        while (true) {
                            int i4 = i3 + 1;
                            ((Function1) ((Pair) persistentListPersistentListOf.get(i3)).component1()).invoke(derivedState);
                            if (i4 > size2) {
                                break;
                            }
                            i3 = i4;
                        }
                        for (StateObject stateObject : dependencies) {
                            StateRecord stateRecord = SnapshotKt.readable(stateObject.getFirstStateRecord(), stateObject, snapshot);
                            iIdentityHashCode = (((iIdentityHashCode * 31) + ActualJvm_jvmKt.identityHashCode(stateRecord)) * 31) + stateRecord.getSnapshotId();
                        }
                        Unit unit = Unit.INSTANCE;
                        size = persistentListPersistentListOf.size() - 1;
                        if (size >= 0) {
                            while (true) {
                                i = i2 + 1;
                                ((Function1) ((Pair) persistentListPersistentListOf.get(i2)).component2()).invoke(derivedState);
                                if (i > size) {
                                    break;
                                }
                                i2 = i;
                            }
                        }
                    }
                    while (r1.hasNext()) {
                        StateRecord stateRecord2 = SnapshotKt.readable(stateObject.getFirstStateRecord(), stateObject, snapshot);
                        iIdentityHashCode = (((iIdentityHashCode * 31) + ActualJvm_jvmKt.identityHashCode(stateRecord2)) * 31) + stateRecord2.getSnapshotId();
                    }
                    Unit unit2 = Unit.INSTANCE;
                    size = persistentListPersistentListOf.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            i = i2 + 1;
                            ((Function1) ((Pair) persistentListPersistentListOf.get(i2)).component2()).invoke(derivedState);
                            if (i > size) {
                                break;
                                break;
                            }
                            i2 = i;
                        }
                    }
                } catch (Throwable th) {
                    int size3 = persistentListPersistentListOf.size() - 1;
                    if (size3 >= 0) {
                        while (true) {
                            int i5 = i2 + 1;
                            ((Function1) ((Pair) persistentListPersistentListOf.get(i2)).component2()).invoke(derivedState);
                            if (i5 > size3) {
                                break;
                            }
                            i2 = i5;
                        }
                    }
                    throw th;
                }
            }
            return iIdentityHashCode;
        }

        public final void setDependencies(@Nullable HashSet<StateObject> hashSet) {
            this.dependencies = hashSet;
        }

        public final void setResult(@Nullable T t) {
            this.result = t;
        }

        public final void setResultHash(int i) {
            this.resultHash = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DerivedState(@NotNull Function0<? extends T> function0) {
        this.calculation = function0;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0050 A[LOOP:1: B:18:0x0050->B:21:0x0064, LOOP_START, PHI: r1
      0x0050: PHI (r1v8 int) = (r1v0 int), (r1v13 int) binds: [B:17:0x004e, B:21:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0064 A[LOOP:1: B:18:0x0050->B:21:0x0064, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0066 A[EDGE_INSN: B:42:0x0066->B:22:0x0066 BREAK  A[LOOP:1: B:18:0x0050->B:21:0x0064], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    private final ResultRecord<T> currentRecord(ResultRecord<T> readable, Snapshot snapshot, Function0<? extends T> calculation) {
        Object objObserve;
        int size;
        int i;
        if (readable.isValid(this, snapshot)) {
            return readable;
        }
        final HashSet hashSet = new HashSet();
        PersistentList persistentListPersistentListOf = (PersistentList) SnapshotStateKt.derivedStateObservers.get();
        if (persistentListPersistentListOf == null) {
            persistentListPersistentListOf = ExtensionsKt.persistentListOf();
        }
        int size2 = persistentListPersistentListOf.size() - 1;
        int i2 = 0;
        try {
            if (size2 >= 0) {
                int i3 = 0;
                while (true) {
                    int i4 = i3 + 1;
                    ((Function1) ((Pair) persistentListPersistentListOf.get(i3)).component1()).invoke(this);
                    if (i4 > size2) {
                        break;
                    }
                    i3 = i4;
                }
                objObserve = Snapshot.INSTANCE.observe(new Function1<Object, Unit>(this) { // from class: androidx.compose.runtime.DerivedSnapshotState$currentRecord$result$1$1
                    public final /* synthetic */ DerivedState<T> this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                        this.this$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                        invoke2(obj);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Object obj) {
                        if (obj == this.this$0) {
                            throw new IllegalStateException("A derived state cannot calculation cannot read itself".toString());
                        }
                        if (obj instanceof StateObject) {
                            hashSet.add(obj);
                        }
                    }
                }, null, calculation);
                size = persistentListPersistentListOf.size() - 1;
                if (size >= 0) {
                    while (true) {
                        i = i2 + 1;
                        ((Function1) ((Pair) persistentListPersistentListOf.get(i2)).component2()).invoke(this);
                        if (i > size) {
                            break;
                        }
                        i2 = i;
                    }
                }
                synchronized (SnapshotKt.getLock()) {
                    Snapshot.Companion companion = Snapshot.INSTANCE;
                    Snapshot current = companion.getCurrent();
                    ResultRecord<T> resultRecord = (ResultRecord<T>) ((ResultRecord) SnapshotKt.newWritableRecord(this.first, this, current));
                    resultRecord.setDependencies(hashSet);
                    resultRecord.setResultHash(resultRecord.readableHash(this, current));
                    resultRecord.setResult(objObserve);
                }
                companion.notifyObjectsInitialized();
                return resultRecord;
            }
            objObserve = Snapshot.INSTANCE.observe(new Function1<Object, Unit>(this) { // from class: androidx.compose.runtime.DerivedSnapshotState$currentRecord$result$1$1
                public final /* synthetic */ DerivedState<T> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                    this.this$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                    invoke2(obj);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Object obj) {
                    if (obj == this.this$0) {
                        throw new IllegalStateException("A derived state cannot calculation cannot read itself".toString());
                    }
                    if (obj instanceof StateObject) {
                        hashSet.add(obj);
                    }
                }
            }, null, calculation);
            size = persistentListPersistentListOf.size() - 1;
            if (size >= 0) {
                while (true) {
                    i = i2 + 1;
                    ((Function1) ((Pair) persistentListPersistentListOf.get(i2)).component2()).invoke(this);
                    if (i > size) {
                        break;
                        break;
                    }
                    i2 = i;
                }
            }
            synchronized (SnapshotKt.getLock()) {
                Snapshot.Companion companion2 = Snapshot.INSTANCE;
                Snapshot current2 = companion2.getCurrent();
                ResultRecord<T> resultRecord2 = (ResultRecord<T>) ((ResultRecord) SnapshotKt.newWritableRecord(this.first, this, current2));
                resultRecord2.setDependencies(hashSet);
                resultRecord2.setResultHash(resultRecord2.readableHash(this, current2));
                resultRecord2.setResult(objObserve);
                companion2.notifyObjectsInitialized();
                return resultRecord2;
            }
        } catch (Throwable th) {
            int size3 = persistentListPersistentListOf.size() - 1;
            if (size3 >= 0) {
                while (true) {
                    int i5 = i2 + 1;
                    ((Function1) ((Pair) persistentListPersistentListOf.get(i2)).component2()).invoke(this);
                    if (i5 > size3) {
                        break;
                    }
                    i2 = i5;
                }
            }
            throw th;
        }
    }

    private final String displayValue() {
        ResultRecord<T> resultRecord = this.first;
        Snapshot.Companion companion = Snapshot.INSTANCE;
        ResultRecord resultRecord2 = (ResultRecord) SnapshotKt.current(resultRecord, companion.getCurrent());
        return resultRecord2.isValid(this, companion.getCurrent()) ? String.valueOf(resultRecord2.getResult()) : "<Not calculated>";
    }

    @Override // androidx.compose.runtime.DerivedState
    public T getCurrentValue() {
        ResultRecord<T> resultRecord = this.first;
        Snapshot.Companion companion = Snapshot.INSTANCE;
        return currentRecord((ResultRecord) SnapshotKt.current(resultRecord, companion.getCurrent()), companion.getCurrent(), this.calculation).getResult();
    }

    @Override // androidx.compose.runtime.DerivedState
    @NotNull
    public Set<StateObject> getDependencies() {
        ResultRecord<T> resultRecord = this.first;
        Snapshot.Companion companion = Snapshot.INSTANCE;
        HashSet<StateObject> dependencies = currentRecord((ResultRecord) SnapshotKt.current(resultRecord, companion.getCurrent()), companion.getCurrent(), this.calculation).getDependencies();
        return dependencies == null ? y.emptySet() : dependencies;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @NotNull
    public StateRecord getFirstStateRecord() {
        return this.first;
    }

    @Override // androidx.compose.runtime.State
    public T getValue() {
        Function1<Object, Unit> readObserver$runtime_release = Snapshot.INSTANCE.getCurrent().getReadObserver$runtime_release();
        if (readObserver$runtime_release != null) {
            readObserver$runtime_release.invoke(this);
        }
        return getCurrentValue();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @Nullable
    public StateRecord mergeRecords(@NotNull StateRecord stateRecord, @NotNull StateRecord stateRecord2, @NotNull StateRecord stateRecord3) {
        return StateObject.DefaultImpls.mergeRecords(this, stateRecord, stateRecord2, stateRecord3);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(@NotNull StateRecord value) {
        this.first = (ResultRecord) value;
    }

    @NotNull
    public String toString() {
        return "DerivedState(value=" + displayValue() + ")@" + hashCode();
    }
}
