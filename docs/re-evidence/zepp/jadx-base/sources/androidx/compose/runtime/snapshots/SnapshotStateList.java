package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.huami.watch.companion.event.WatchFaceArrivingEvent;
import com.huami.watch.notification.TransportUri;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.markers.KMutableList;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b!\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001EB\u0007¢\u0006\u0004\bD\u0010@J5\u0010\t\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00042\u001d\u0010\b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0002\b\u0007H\u0082\b¢\u0006\u0004\b\t\u0010\nJ5\u0010\u000b\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00042\u001d\u0010\b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0002\b\u0007H\u0082\b¢\u0006\u0004\b\u000b\u0010\nJ0\u0010\f\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00042\u0018\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00010\u0005H\u0082\b¢\u0006\u0004\b\f\u0010\nJ)\u0010\u000f\u001a\u00020\u000e2\u001e\u0010\b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\u0005H\u0082\bJ)\u0010\u0011\u001a\u00020\u00102\u001e\u0010\b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\u0005H\u0082\bJ\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u001a\u001a\u00020\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016J\u0018\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u001bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001f\u0010 J\b\u0010!\u001a\u00020\u0010H\u0016J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0096\u0002J\u0017\u0010$\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b$\u0010 J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0016J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u001e\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u001bH\u0016J\u0017\u0010*\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b*\u0010\u0017J\u001f\u0010*\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b*\u0010+J\u001e\u0010,\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016J\u0016\u0010,\u001a\u00020\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016J\b\u0010-\u001a\u00020\u000eH\u0016J\u0017\u0010.\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b.\u0010\u0017J\u0016\u0010/\u001a\u00020\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016J\u0017\u00100\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b0\u0010\u001eJ\u0016\u00101\u001a\u00020\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016J \u00102\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b2\u00103J\u0016\u00104\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u001bR$\u00106\u001a\u00020\u00122\u0006\u00105\u001a\u00020\u00128\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0016\u0010<\u001a\u00020\u001b8@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\"\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068@@\u0000X\u0080\u0004¢\u0006\f\u0012\u0004\b?\u0010@\u001a\u0004\b=\u0010>R\u0016\u0010C\u001a\u00020\u001b8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010;¨\u0006F"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList;", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroidx/compose/runtime/snapshots/StateObject;", "R", "Lkotlin/Function1;", "Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;", "Lkotlin/ExtensionFunctionType;", TransportUri.ACTION_BLOCK, "writable", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "withCurrent", "mutate", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "", "update", "", "conditionalUpdate", "Landroidx/compose/runtime/snapshots/StateRecord;", "value", "prependStateRecord", "element", SearchCriteria.CONTAINS, "(Ljava/lang/Object;)Z", "", MessengerShareContentUtility.ELEMENTS, "containsAll", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "", "iterator", "lastIndexOf", "", "listIterator", "fromIndex", "toIndex", "subList", TransportUri.ACTION_ADD, "(ILjava/lang/Object;)V", "addAll", "clear", "remove", "removeAll", "removeAt", "retainAll", WatchFaceArrivingEvent.CMD_SET, "(ILjava/lang/Object;)Ljava/lang/Object;", "removeRange", "<set-?>", "firstStateRecord", "Landroidx/compose/runtime/snapshots/StateRecord;", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "getModification$runtime_release", "()I", "modification", "getReadable$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;", "getReadable$runtime_release$annotations", "()V", "readable", "getSize", "size", "<init>", "StateListStateRecord", "runtime_release"}, k = 1, mv = {1, 5, 1})
@Stable
public final class SnapshotStateList<T> implements List<T>, StateObject, KMutableList {

    @NotNull
    private StateRecord firstStateRecord = new StateListStateRecord(ExtensionsKt.persistentListOf());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0017\b\u0000\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\u0015\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016R(\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u000f\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/snapshots/StateRecord;", "value", "", "assign", "create", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "list", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "getList$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "setList$runtime_release", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;)V", "", "modification", LogUtil.I, "getModification$runtime_release", "()I", "setModification$runtime_release", "(I)V", "<init>", "runtime_release"}, k = 1, mv = {1, 5, 1})
    public static final class StateListStateRecord<T> extends StateRecord {

        @NotNull
        private PersistentList<? extends T> list;
        private int modification;

        public StateListStateRecord(@NotNull PersistentList<? extends T> persistentList) {
            this.list = persistentList;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(@NotNull StateRecord value) {
            StateListStateRecord stateListStateRecord = (StateListStateRecord) value;
            this.list = stateListStateRecord.list;
            this.modification = stateListStateRecord.modification;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        @NotNull
        public StateRecord create() {
            return new StateListStateRecord(this.list);
        }

        @NotNull
        public final PersistentList<T> getList$runtime_release() {
            return this.list;
        }

        /* JADX INFO: renamed from: getModification$runtime_release, reason: from getter */
        public final int getModification() {
            return this.modification;
        }

        public final void setList$runtime_release(@NotNull PersistentList<? extends T> persistentList) {
            this.list = persistentList;
        }

        public final void setModification$runtime_release(int i) {
            this.modification = i;
        }
    }

    private final boolean conditionalUpdate(Function1<? super PersistentList<? extends T>, ? extends PersistentList<? extends T>> block) {
        Snapshot current;
        StateListStateRecord stateListStateRecord = (StateListStateRecord) getFirstStateRecord();
        Snapshot.Companion companion = Snapshot.INSTANCE;
        StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.current(stateListStateRecord, companion.getCurrent());
        PersistentList<? extends T> persistentListInvoke = block.invoke(stateListStateRecord2.getList$runtime_release());
        if (persistentListInvoke == stateListStateRecord2.getList$runtime_release()) {
            return false;
        }
        StateListStateRecord stateListStateRecord3 = (StateListStateRecord) getFirstStateRecord();
        SnapshotKt.getSnapshotInitializer();
        synchronized (SnapshotKt.getLock()) {
            try {
                current = companion.getCurrent();
                StateListStateRecord stateListStateRecord4 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord3, this, current);
                stateListStateRecord4.setList$runtime_release(persistentListInvoke);
                stateListStateRecord4.setModification$runtime_release(stateListStateRecord4.getModification() + 1);
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        SnapshotKt.notifyWrite(current, this);
        return true;
    }

    public static /* synthetic */ void getReadable$runtime_release$annotations() {
    }

    private final <R> R mutate(Function1<? super List<T>, ? extends R> block) {
        Snapshot current;
        StateListStateRecord stateListStateRecord = (StateListStateRecord) getFirstStateRecord();
        Snapshot.Companion companion = Snapshot.INSTANCE;
        StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.current(stateListStateRecord, companion.getCurrent());
        PersistentList.Builder<T> builder = stateListStateRecord2.getList$runtime_release().builder();
        R rInvoke = block.invoke(builder);
        PersistentList<T> persistentListBuild = builder.build();
        if (persistentListBuild != stateListStateRecord2.getList$runtime_release()) {
            StateListStateRecord stateListStateRecord3 = (StateListStateRecord) getFirstStateRecord();
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                try {
                    current = companion.getCurrent();
                    StateListStateRecord stateListStateRecord4 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord3, this, current);
                    stateListStateRecord4.setList$runtime_release(persistentListBuild);
                    stateListStateRecord4.setModification$runtime_release(stateListStateRecord4.getModification() + 1);
                    InlineMarker.finallyStart(1);
                } catch (Throwable th) {
                    InlineMarker.finallyStart(1);
                    InlineMarker.finallyEnd(1);
                    throw th;
                }
            }
            InlineMarker.finallyEnd(1);
            SnapshotKt.notifyWrite(current, this);
        }
        return rInvoke;
    }

    private final void update(Function1<? super PersistentList<? extends T>, ? extends PersistentList<? extends T>> block) {
        Snapshot current;
        StateListStateRecord stateListStateRecord = (StateListStateRecord) getFirstStateRecord();
        Snapshot.Companion companion = Snapshot.INSTANCE;
        StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.current(stateListStateRecord, companion.getCurrent());
        PersistentList<? extends T> persistentListInvoke = block.invoke(stateListStateRecord2.getList$runtime_release());
        if (persistentListInvoke != stateListStateRecord2.getList$runtime_release()) {
            StateListStateRecord stateListStateRecord3 = (StateListStateRecord) getFirstStateRecord();
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                try {
                    current = companion.getCurrent();
                    StateListStateRecord stateListStateRecord4 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord3, this, current);
                    stateListStateRecord4.setList$runtime_release(persistentListInvoke);
                    stateListStateRecord4.setModification$runtime_release(stateListStateRecord4.getModification() + 1);
                    InlineMarker.finallyStart(1);
                } catch (Throwable th) {
                    InlineMarker.finallyStart(1);
                    InlineMarker.finallyEnd(1);
                    throw th;
                }
            }
            InlineMarker.finallyEnd(1);
            SnapshotKt.notifyWrite(current, this);
        }
    }

    private final <R> R withCurrent(Function1<? super StateListStateRecord<T>, ? extends R> block) {
        return block.invoke(SnapshotKt.current((StateListStateRecord) getFirstStateRecord(), Snapshot.INSTANCE.getCurrent()));
    }

    private final <R> R writable(Function1<? super StateListStateRecord<T>, ? extends R> block) {
        Snapshot current;
        R rInvoke;
        StateListStateRecord stateListStateRecord = (StateListStateRecord) getFirstStateRecord();
        SnapshotKt.getSnapshotInitializer();
        synchronized (SnapshotKt.getLock()) {
            try {
                current = Snapshot.INSTANCE.getCurrent();
                rInvoke = block.invoke(SnapshotKt.writableRecord(stateListStateRecord, this, current));
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        SnapshotKt.notifyWrite(current, this);
        return rInvoke;
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T element) {
        Snapshot current;
        StateListStateRecord stateListStateRecord = (StateListStateRecord) getFirstStateRecord();
        Snapshot.Companion companion = Snapshot.INSTANCE;
        StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.current(stateListStateRecord, companion.getCurrent());
        PersistentList<T> persistentListAdd = stateListStateRecord2.getList$runtime_release().add(element);
        if (persistentListAdd == stateListStateRecord2.getList$runtime_release()) {
            return false;
        }
        StateListStateRecord stateListStateRecord3 = (StateListStateRecord) getFirstStateRecord();
        SnapshotKt.getSnapshotInitializer();
        synchronized (SnapshotKt.getLock()) {
            current = companion.getCurrent();
            StateListStateRecord stateListStateRecord4 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord3, this, current);
            stateListStateRecord4.setList$runtime_release(persistentListAdd);
            stateListStateRecord4.setModification$runtime_release(stateListStateRecord4.getModification() + 1);
        }
        SnapshotKt.notifyWrite(current, this);
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int index, @NotNull Collection<? extends T> elements) {
        Snapshot current;
        StateListStateRecord stateListStateRecord = (StateListStateRecord) getFirstStateRecord();
        Snapshot.Companion companion = Snapshot.INSTANCE;
        StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.current(stateListStateRecord, companion.getCurrent());
        PersistentList.Builder<T> builder = stateListStateRecord2.getList$runtime_release().builder();
        boolean zAddAll = builder.addAll(index, elements);
        PersistentList<T> persistentListBuild = builder.build();
        if (persistentListBuild != stateListStateRecord2.getList$runtime_release()) {
            StateListStateRecord stateListStateRecord3 = (StateListStateRecord) getFirstStateRecord();
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = companion.getCurrent();
                StateListStateRecord stateListStateRecord4 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord3, this, current);
                stateListStateRecord4.setList$runtime_release(persistentListBuild);
                stateListStateRecord4.setModification$runtime_release(stateListStateRecord4.getModification() + 1);
            }
            SnapshotKt.notifyWrite(current, this);
        }
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        Snapshot current;
        StateListStateRecord stateListStateRecord = (StateListStateRecord) getFirstStateRecord();
        SnapshotKt.getSnapshotInitializer();
        synchronized (SnapshotKt.getLock()) {
            current = Snapshot.INSTANCE.getCurrent();
            ((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord, this, current)).setList$runtime_release(ExtensionsKt.persistentListOf());
            Unit unit = Unit.INSTANCE;
        }
        SnapshotKt.notifyWrite(current, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object element) {
        return getReadable$runtime_release().getList$runtime_release().contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        return getReadable$runtime_release().getList$runtime_release().containsAll(elements);
    }

    @Override // java.util.List
    public T get(int index) {
        return getReadable$runtime_release().getList$runtime_release().get(index);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @NotNull
    public StateRecord getFirstStateRecord() {
        return this.firstStateRecord;
    }

    public final int getModification$runtime_release() {
        return ((StateListStateRecord) SnapshotKt.current((StateListStateRecord) getFirstStateRecord(), Snapshot.INSTANCE.getCurrent())).getModification();
    }

    @NotNull
    public final StateListStateRecord<T> getReadable$runtime_release() {
        return (StateListStateRecord) SnapshotKt.readable((StateListStateRecord) getFirstStateRecord(), this);
    }

    public int getSize() {
        return getReadable$runtime_release().getList$runtime_release().size();
    }

    @Override // java.util.List
    public int indexOf(Object element) {
        return getReadable$runtime_release().getList$runtime_release().indexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return getReadable$runtime_release().getList$runtime_release().isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object element) {
        return getReadable$runtime_release().getList$runtime_release().lastIndexOf(element);
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<T> listIterator() {
        return new StateListIterator(this, 0);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @Nullable
    public StateRecord mergeRecords(@NotNull StateRecord stateRecord, @NotNull StateRecord stateRecord2, @NotNull StateRecord stateRecord3) {
        return StateObject.DefaultImpls.mergeRecords(this, stateRecord, stateRecord2, stateRecord3);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(@NotNull StateRecord value) {
        value.setNext$runtime_release(getFirstStateRecord());
        this.firstStateRecord = (StateListStateRecord) value;
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i) {
        return removeAt(i);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(@NotNull Collection<? extends Object> elements) {
        Snapshot current;
        StateListStateRecord stateListStateRecord = (StateListStateRecord) getFirstStateRecord();
        Snapshot.Companion companion = Snapshot.INSTANCE;
        StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.current(stateListStateRecord, companion.getCurrent());
        PersistentList<T> persistentListRemoveAll = stateListStateRecord2.getList$runtime_release().removeAll((Collection<? extends T>) elements);
        if (persistentListRemoveAll == stateListStateRecord2.getList$runtime_release()) {
            return false;
        }
        StateListStateRecord stateListStateRecord3 = (StateListStateRecord) getFirstStateRecord();
        SnapshotKt.getSnapshotInitializer();
        synchronized (SnapshotKt.getLock()) {
            current = companion.getCurrent();
            StateListStateRecord stateListStateRecord4 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord3, this, current);
            stateListStateRecord4.setList$runtime_release(persistentListRemoveAll);
            stateListStateRecord4.setModification$runtime_release(stateListStateRecord4.getModification() + 1);
        }
        SnapshotKt.notifyWrite(current, this);
        return true;
    }

    public T removeAt(int index) {
        Snapshot current;
        T t = get(index);
        StateListStateRecord stateListStateRecord = (StateListStateRecord) getFirstStateRecord();
        Snapshot.Companion companion = Snapshot.INSTANCE;
        StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.current(stateListStateRecord, companion.getCurrent());
        PersistentList<T> persistentListRemoveAt = stateListStateRecord2.getList$runtime_release().removeAt(index);
        if (persistentListRemoveAt != stateListStateRecord2.getList$runtime_release()) {
            StateListStateRecord stateListStateRecord3 = (StateListStateRecord) getFirstStateRecord();
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = companion.getCurrent();
                StateListStateRecord stateListStateRecord4 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord3, this, current);
                stateListStateRecord4.setList$runtime_release(persistentListRemoveAt);
                stateListStateRecord4.setModification$runtime_release(stateListStateRecord4.getModification() + 1);
            }
            SnapshotKt.notifyWrite(current, this);
        }
        return t;
    }

    public final void removeRange(int fromIndex, int toIndex) {
        Snapshot current;
        StateListStateRecord stateListStateRecord = (StateListStateRecord) getFirstStateRecord();
        Snapshot.Companion companion = Snapshot.INSTANCE;
        StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.current(stateListStateRecord, companion.getCurrent());
        PersistentList.Builder<T> builder = stateListStateRecord2.getList$runtime_release().builder();
        builder.subList(fromIndex, toIndex).clear();
        Unit unit = Unit.INSTANCE;
        PersistentList<T> persistentListBuild = builder.build();
        if (persistentListBuild != stateListStateRecord2.getList$runtime_release()) {
            StateListStateRecord stateListStateRecord3 = (StateListStateRecord) getFirstStateRecord();
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = companion.getCurrent();
                StateListStateRecord stateListStateRecord4 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord3, this, current);
                stateListStateRecord4.setList$runtime_release(persistentListBuild);
                stateListStateRecord4.setModification$runtime_release(stateListStateRecord4.getModification() + 1);
            }
            SnapshotKt.notifyWrite(current, this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(@NotNull Collection<? extends Object> elements) {
        Snapshot current;
        StateListStateRecord stateListStateRecord = (StateListStateRecord) getFirstStateRecord();
        Snapshot.Companion companion = Snapshot.INSTANCE;
        StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.current(stateListStateRecord, companion.getCurrent());
        PersistentList.Builder<T> builder = stateListStateRecord2.getList$runtime_release().builder();
        boolean zRetainAll = builder.retainAll(elements);
        PersistentList<T> persistentListBuild = builder.build();
        if (persistentListBuild != stateListStateRecord2.getList$runtime_release()) {
            StateListStateRecord stateListStateRecord3 = (StateListStateRecord) getFirstStateRecord();
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = companion.getCurrent();
                StateListStateRecord stateListStateRecord4 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord3, this, current);
                stateListStateRecord4.setList$runtime_release(persistentListBuild);
                stateListStateRecord4.setModification$runtime_release(stateListStateRecord4.getModification() + 1);
            }
            SnapshotKt.notifyWrite(current, this);
        }
        return zRetainAll;
    }

    @Override // java.util.List
    public T set(int index, T element) {
        Snapshot current;
        T t = get(index);
        StateListStateRecord stateListStateRecord = (StateListStateRecord) getFirstStateRecord();
        Snapshot.Companion companion = Snapshot.INSTANCE;
        StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.current(stateListStateRecord, companion.getCurrent());
        PersistentList<T> persistentList = stateListStateRecord2.getList$runtime_release().set(index, element);
        if (persistentList != stateListStateRecord2.getList$runtime_release()) {
            StateListStateRecord stateListStateRecord3 = (StateListStateRecord) getFirstStateRecord();
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = companion.getCurrent();
                StateListStateRecord stateListStateRecord4 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord3, this, current);
                stateListStateRecord4.setList$runtime_release(persistentList);
                stateListStateRecord4.setModification$runtime_release(stateListStateRecord4.getModification() + 1);
            }
            SnapshotKt.notifyWrite(current, this);
        }
        return t;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    @NotNull
    public List<T> subList(int fromIndex, int toIndex) {
        if ((fromIndex >= 0 && fromIndex <= toIndex) && toIndex <= size()) {
            return new SubList(this, fromIndex, toIndex);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) CollectionToArray.toArray(this, tArr);
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<T> listIterator(int index) {
        return new StateListIterator(this, index);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object element) {
        Snapshot current;
        StateListStateRecord stateListStateRecord = (StateListStateRecord) getFirstStateRecord();
        Snapshot.Companion companion = Snapshot.INSTANCE;
        StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.current(stateListStateRecord, companion.getCurrent());
        PersistentList<T> persistentListRemove = stateListStateRecord2.getList$runtime_release().remove(element);
        if (persistentListRemove == stateListStateRecord2.getList$runtime_release()) {
            return false;
        }
        StateListStateRecord stateListStateRecord3 = (StateListStateRecord) getFirstStateRecord();
        SnapshotKt.getSnapshotInitializer();
        synchronized (SnapshotKt.getLock()) {
            current = companion.getCurrent();
            StateListStateRecord stateListStateRecord4 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord3, this, current);
            stateListStateRecord4.setList$runtime_release(persistentListRemove);
            stateListStateRecord4.setModification$runtime_release(stateListStateRecord4.getModification() + 1);
        }
        SnapshotKt.notifyWrite(current, this);
        return true;
    }

    @Override // java.util.List
    public void add(int index, T element) {
        Snapshot current;
        StateListStateRecord stateListStateRecord = (StateListStateRecord) getFirstStateRecord();
        Snapshot.Companion companion = Snapshot.INSTANCE;
        StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.current(stateListStateRecord, companion.getCurrent());
        PersistentList<T> persistentListAdd = stateListStateRecord2.getList$runtime_release().add(index, element);
        if (persistentListAdd != stateListStateRecord2.getList$runtime_release()) {
            StateListStateRecord stateListStateRecord3 = (StateListStateRecord) getFirstStateRecord();
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = companion.getCurrent();
                StateListStateRecord stateListStateRecord4 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord3, this, current);
                stateListStateRecord4.setList$runtime_release(persistentListAdd);
                stateListStateRecord4.setModification$runtime_release(stateListStateRecord4.getModification() + 1);
            }
            SnapshotKt.notifyWrite(current, this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(@NotNull Collection<? extends T> elements) {
        Snapshot current;
        StateListStateRecord stateListStateRecord = (StateListStateRecord) getFirstStateRecord();
        Snapshot.Companion companion = Snapshot.INSTANCE;
        StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.current(stateListStateRecord, companion.getCurrent());
        PersistentList<T> persistentListAddAll = stateListStateRecord2.getList$runtime_release().addAll(elements);
        if (persistentListAddAll == stateListStateRecord2.getList$runtime_release()) {
            return false;
        }
        StateListStateRecord stateListStateRecord3 = (StateListStateRecord) getFirstStateRecord();
        SnapshotKt.getSnapshotInitializer();
        synchronized (SnapshotKt.getLock()) {
            current = companion.getCurrent();
            StateListStateRecord stateListStateRecord4 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord3, this, current);
            stateListStateRecord4.setList$runtime_release(persistentListAddAll);
            stateListStateRecord4.setModification$runtime_release(stateListStateRecord4.getModification() + 1);
        }
        SnapshotKt.notifyWrite(current, this);
        return true;
    }
}
