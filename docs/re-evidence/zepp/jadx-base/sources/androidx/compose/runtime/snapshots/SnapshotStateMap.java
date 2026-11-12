package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.watch.notification.TransportUri;
import com.huami.watch.transport.httpsupport.model.DataItem;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010'\n\u0002\b\u0004\n\u0002\u0010&\n\u0002\b\t\n\u0002\u0010#\n\u0002\b\u0006\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00020\u0004:\u0001LB\u0007¢\u0006\u0004\bK\u0010IJ;\u0010\n\u001a\u00028\u0002\"\u0004\b\u0002\u0010\u00052#\u0010\t\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0004\u0012\u00028\u00020\u0006¢\u0006\u0002\b\bH\u0082\b¢\u0006\u0004\b\n\u0010\u000bJ;\u0010\f\u001a\u00028\u0002\"\u0004\b\u0002\u0010\u00052#\u0010\t\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0004\u0012\u00028\u00020\u0006¢\u0006\u0002\b\bH\u0082\b¢\u0006\u0004\b\f\u0010\u000bJ6\u0010\r\u001a\u00028\u0002\"\u0004\b\u0002\u0010\u00052\u001e\u0010\t\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0004\u0012\u00028\u00020\u0006H\u0082\b¢\u0006\u0004\b\r\u0010\u000bJ5\u0010\u0010\u001a\u00020\u000f2*\u0010\t\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e0\u0006H\u0082\bJ\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u001a\u0010\u0019\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0015H\u0016J\b\u0010\u001c\u001a\u00020\u000fH\u0016J!\u0010\u001d\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001e\u0010!\u001a\u00020\u000f2\u0014\u0010 \u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001fH\u0016J\u0019\u0010\"\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\"\u0010\u001aJ\u0017\u0010$\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00028\u0001H\u0000¢\u0006\u0004\b#\u0010\u0017J3\u0010)\u001a\u00020\u00152\u001e\u0010&\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010%\u0012\u0004\u0012\u00020\u00150\u0006H\u0080\bø\u0001\u0000¢\u0006\u0004\b'\u0010(J3\u0010,\u001a\u00020\u00152\u001e\u0010&\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010*\u0012\u0004\u0012\u00020\u00150\u0006H\u0080\bø\u0001\u0000¢\u0006\u0004\b+\u0010(J3\u0010.\u001a\u00020\u00152\u001e\u0010&\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010*\u0012\u0004\u0012\u00020\u00150\u0006H\u0080\bø\u0001\u0000¢\u0006\u0004\b-\u0010(R$\u00100\u001a\u00020\u00112\u0006\u0010/\u001a\u00020\u00118\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R.\u00105\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010%048\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\"\u00109\u001a\b\u0012\u0004\u0012\u00028\u0000048\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u00106\u001a\u0004\b:\u00108R\"\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00010;8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0016\u0010C\u001a\u00020@8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0016\u0010E\u001a\u00020@8@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\bD\u0010BR(\u0010J\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078@@\u0000X\u0080\u0004¢\u0006\f\u0012\u0004\bH\u0010I\u001a\u0004\bF\u0010G\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006M"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "K", "V", "", "Landroidx/compose/runtime/snapshots/StateObject;", "R", "Lkotlin/Function1;", "Landroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord;", "Lkotlin/ExtensionFunctionType;", TransportUri.ACTION_BLOCK, "withCurrent", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "writable", "mutate", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "", "update", "Landroidx/compose/runtime/snapshots/StateRecord;", "value", "prependStateRecord", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "isEmpty", "clear", DataItem.HTTP_METHOD_PUT, "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "from", "putAll", "remove", "removeValue$runtime_release", "removeValue", "", "predicate", "removeIf$runtime_release", "(Lkotlin/jvm/functions/Function1;)Z", "removeIf", "", "any$runtime_release", "any", "all$runtime_release", "all", "<set-?>", "firstStateRecord", "Landroidx/compose/runtime/snapshots/StateRecord;", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "Ljava/util/Set;", "getEntries", "()Ljava/util/Set;", "keys", "getKeys", "", "values", "Ljava/util/Collection;", "getValues", "()Ljava/util/Collection;", "", "getSize", "()I", "size", "getModification$runtime_release", "modification", "getReadable$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord;", "getReadable$runtime_release$annotations", "()V", "readable", "<init>", "StateMapStateRecord", "runtime_release"}, k = 1, mv = {1, 5, 1})
@Stable
public final class SnapshotStateMap<K, V> implements Map<K, V>, StateObject, KMutableMap {

    @NotNull
    private StateRecord firstStateRecord = new StateMapStateRecord(ExtensionsKt.persistentHashMapOf());

    @NotNull
    private final Set<Map.Entry<K, V>> entries = new SnapshotMapEntrySet(this);

    @NotNull
    private final Set<K> keys = new SnapshotMapKeySet(this);

    @NotNull
    private final Collection<V> values = new SnapshotMapValueSet(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u001d\b\u0000\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b¢\u0006\u0004\b\u0016\u0010\u000eJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016R.\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord;", "K", "V", "Landroidx/compose/runtime/snapshots/StateRecord;", "value", "", "assign", "create", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", SportAnalytics.ParamValue.MapButtonType.MAP, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "getMap$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "setMap$runtime_release", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;)V", "", "modification", LogUtil.I, "getModification$runtime_release", "()I", "setModification$runtime_release", "(I)V", "<init>", "runtime_release"}, k = 1, mv = {1, 5, 1})
    public static final class StateMapStateRecord<K, V> extends StateRecord {

        @NotNull
        private PersistentMap<K, ? extends V> map;
        private int modification;

        public StateMapStateRecord(@NotNull PersistentMap<K, ? extends V> persistentMap) {
            this.map = persistentMap;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(@NotNull StateRecord value) {
            StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) value;
            this.map = stateMapStateRecord.map;
            this.modification = stateMapStateRecord.modification;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        @NotNull
        public StateRecord create() {
            return new StateMapStateRecord(this.map);
        }

        @NotNull
        public final PersistentMap<K, V> getMap$runtime_release() {
            return this.map;
        }

        /* JADX INFO: renamed from: getModification$runtime_release, reason: from getter */
        public final int getModification() {
            return this.modification;
        }

        public final void setMap$runtime_release(@NotNull PersistentMap<K, ? extends V> persistentMap) {
            this.map = persistentMap;
        }

        public final void setModification$runtime_release(int i) {
            this.modification = i;
        }
    }

    public static /* synthetic */ void getReadable$runtime_release$annotations() {
    }

    private final <R> R mutate(Function1<? super Map<K, V>, ? extends R> block) {
        Snapshot current;
        StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) getFirstStateRecord();
        Snapshot.Companion companion = Snapshot.INSTANCE;
        StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) SnapshotKt.current(stateMapStateRecord, companion.getCurrent());
        PersistentMap.Builder<K, V> builder = stateMapStateRecord2.getMap$runtime_release().builder();
        R rInvoke = block.invoke(builder);
        PersistentMap<K, V> persistentMapBuild = builder.build();
        if (persistentMapBuild != stateMapStateRecord2.getMap$runtime_release()) {
            StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) getFirstStateRecord();
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                try {
                    current = companion.getCurrent();
                    StateMapStateRecord stateMapStateRecord4 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord3, this, current);
                    stateMapStateRecord4.setMap$runtime_release(persistentMapBuild);
                    stateMapStateRecord4.setModification$runtime_release(stateMapStateRecord4.getModification() + 1);
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

    private final void update(Function1<? super PersistentMap<K, ? extends V>, ? extends PersistentMap<K, ? extends V>> block) {
        Snapshot current;
        StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) getFirstStateRecord();
        Snapshot.Companion companion = Snapshot.INSTANCE;
        StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) SnapshotKt.current(stateMapStateRecord, companion.getCurrent());
        PersistentMap<K, ? extends V> persistentMapInvoke = block.invoke(stateMapStateRecord2.getMap$runtime_release());
        if (persistentMapInvoke != stateMapStateRecord2.getMap$runtime_release()) {
            StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) getFirstStateRecord();
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                try {
                    current = companion.getCurrent();
                    StateMapStateRecord stateMapStateRecord4 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord3, this, current);
                    stateMapStateRecord4.setMap$runtime_release(persistentMapInvoke);
                    stateMapStateRecord4.setModification$runtime_release(stateMapStateRecord4.getModification() + 1);
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

    private final <R> R withCurrent(Function1<? super StateMapStateRecord<K, V>, ? extends R> block) {
        return block.invoke(SnapshotKt.current((StateMapStateRecord) getFirstStateRecord(), Snapshot.INSTANCE.getCurrent()));
    }

    private final <R> R writable(Function1<? super StateMapStateRecord<K, V>, ? extends R> block) {
        Snapshot current;
        R rInvoke;
        StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) getFirstStateRecord();
        SnapshotKt.getSnapshotInitializer();
        synchronized (SnapshotKt.getLock()) {
            try {
                current = Snapshot.INSTANCE.getCurrent();
                rInvoke = block.invoke(SnapshotKt.writableRecord(stateMapStateRecord, this, current));
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

    public final boolean all$runtime_release(@NotNull Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        Iterator<E> it2 = ((ImmutableSet) getReadable$runtime_release().getMap$runtime_release().entrySet()).iterator();
        while (it2.hasNext()) {
            if (!predicate.invoke((Map.Entry) it2.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public final boolean any$runtime_release(@NotNull Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        Iterator<E> it2 = ((ImmutableSet) getReadable$runtime_release().getMap$runtime_release().entrySet()).iterator();
        while (it2.hasNext()) {
            if (predicate.invoke((Map.Entry) it2.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public void clear() {
        Snapshot current;
        StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) getFirstStateRecord();
        Snapshot.Companion companion = Snapshot.INSTANCE;
        StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) SnapshotKt.current(stateMapStateRecord, companion.getCurrent());
        stateMapStateRecord2.getMap$runtime_release();
        PersistentMap<K, V> persistentMapPersistentHashMapOf = ExtensionsKt.persistentHashMapOf();
        if (persistentMapPersistentHashMapOf != stateMapStateRecord2.getMap$runtime_release()) {
            StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) getFirstStateRecord();
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = companion.getCurrent();
                StateMapStateRecord stateMapStateRecord4 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord3, this, current);
                stateMapStateRecord4.setMap$runtime_release(persistentMapPersistentHashMapOf);
                stateMapStateRecord4.setModification$runtime_release(stateMapStateRecord4.getModification() + 1);
            }
            SnapshotKt.notifyWrite(current, this);
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return getReadable$runtime_release().getMap$runtime_release().containsKey(key);
    }

    @Override // java.util.Map
    public boolean containsValue(Object value) {
        return getReadable$runtime_release().getMap$runtime_release().containsValue(value);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    @Nullable
    public V get(Object key) {
        return getReadable$runtime_release().getMap$runtime_release().get(key);
    }

    @NotNull
    public Set<Map.Entry<K, V>> getEntries() {
        return this.entries;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @NotNull
    public StateRecord getFirstStateRecord() {
        return this.firstStateRecord;
    }

    @NotNull
    public Set<K> getKeys() {
        return this.keys;
    }

    public final int getModification$runtime_release() {
        return getReadable$runtime_release().getModification();
    }

    @NotNull
    public final StateMapStateRecord<K, V> getReadable$runtime_release() {
        return (StateMapStateRecord) SnapshotKt.readable((StateMapStateRecord) getFirstStateRecord(), this);
    }

    public int getSize() {
        return getReadable$runtime_release().getMap$runtime_release().size();
    }

    @NotNull
    public Collection<V> getValues() {
        return this.values;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return getReadable$runtime_release().getMap$runtime_release().isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @Nullable
    public StateRecord mergeRecords(@NotNull StateRecord stateRecord, @NotNull StateRecord stateRecord2, @NotNull StateRecord stateRecord3) {
        return StateObject.DefaultImpls.mergeRecords(this, stateRecord, stateRecord2, stateRecord3);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(@NotNull StateRecord value) {
        this.firstStateRecord = (StateMapStateRecord) value;
    }

    @Override // java.util.Map
    @Nullable
    public V put(K key, V value) {
        Snapshot current;
        StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) getFirstStateRecord();
        Snapshot.Companion companion = Snapshot.INSTANCE;
        StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) SnapshotKt.current(stateMapStateRecord, companion.getCurrent());
        PersistentMap.Builder<K, V> builder = stateMapStateRecord2.getMap$runtime_release().builder();
        V vPut = builder.put(key, value);
        PersistentMap<K, V> persistentMapBuild = builder.build();
        if (persistentMapBuild != stateMapStateRecord2.getMap$runtime_release()) {
            StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) getFirstStateRecord();
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = companion.getCurrent();
                StateMapStateRecord stateMapStateRecord4 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord3, this, current);
                stateMapStateRecord4.setMap$runtime_release(persistentMapBuild);
                stateMapStateRecord4.setModification$runtime_release(stateMapStateRecord4.getModification() + 1);
            }
            SnapshotKt.notifyWrite(current, this);
        }
        return vPut;
    }

    @Override // java.util.Map
    public void putAll(@NotNull Map<? extends K, ? extends V> from) {
        Snapshot current;
        StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) getFirstStateRecord();
        Snapshot.Companion companion = Snapshot.INSTANCE;
        StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) SnapshotKt.current(stateMapStateRecord, companion.getCurrent());
        PersistentMap.Builder<K, V> builder = stateMapStateRecord2.getMap$runtime_release().builder();
        builder.putAll(from);
        Unit unit = Unit.INSTANCE;
        PersistentMap<K, V> persistentMapBuild = builder.build();
        if (persistentMapBuild != stateMapStateRecord2.getMap$runtime_release()) {
            StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) getFirstStateRecord();
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = companion.getCurrent();
                StateMapStateRecord stateMapStateRecord4 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord3, this, current);
                stateMapStateRecord4.setMap$runtime_release(persistentMapBuild);
                stateMapStateRecord4.setModification$runtime_release(stateMapStateRecord4.getModification() + 1);
            }
            SnapshotKt.notifyWrite(current, this);
        }
    }

    @Override // java.util.Map
    @Nullable
    public V remove(Object key) {
        Snapshot current;
        StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) getFirstStateRecord();
        Snapshot.Companion companion = Snapshot.INSTANCE;
        StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) SnapshotKt.current(stateMapStateRecord, companion.getCurrent());
        PersistentMap.Builder<K, V> builder = stateMapStateRecord2.getMap$runtime_release().builder();
        V vRemove = builder.remove(key);
        PersistentMap<K, V> persistentMapBuild = builder.build();
        if (persistentMapBuild != stateMapStateRecord2.getMap$runtime_release()) {
            StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) getFirstStateRecord();
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = companion.getCurrent();
                StateMapStateRecord stateMapStateRecord4 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord3, this, current);
                stateMapStateRecord4.setMap$runtime_release(persistentMapBuild);
                stateMapStateRecord4.setModification$runtime_release(stateMapStateRecord4.getModification() + 1);
            }
            SnapshotKt.notifyWrite(current, this);
        }
        return vRemove;
    }

    public final boolean removeIf$runtime_release(@NotNull Function1<? super Map.Entry<K, V>, Boolean> predicate) {
        Snapshot current;
        StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) getFirstStateRecord(), Snapshot.INSTANCE.getCurrent());
        PersistentMap.Builder<K, V> builder = stateMapStateRecord.getMap$runtime_release().builder();
        boolean z = false;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (predicate.invoke(entry).booleanValue()) {
                builder.remove(entry.getKey());
                z = true;
            }
        }
        Unit unit = Unit.INSTANCE;
        PersistentMap<K, V> persistentMapBuild = builder.build();
        if (persistentMapBuild != stateMapStateRecord.getMap$runtime_release()) {
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) getFirstStateRecord();
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                try {
                    current = Snapshot.INSTANCE.getCurrent();
                    StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current);
                    stateMapStateRecord3.setMap$runtime_release(persistentMapBuild);
                    stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification() + 1);
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
        return z;
    }

    public final boolean removeValue$runtime_release(V value) {
        Object next;
        Iterator<T> it2 = entrySet().iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!Intrinsics.areEqual(((Map.Entry) next).getValue(), value));
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return false;
        }
        remove(entry.getKey());
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }
}
