package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.watch.notification.TransportUri;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u0003B\u001b\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\bH\u0016J\u0015\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bH\u0096\u0002J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\u00020\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\bH\u0016J\u0016\u0010\u0011\u001a\u00020\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\bH\u0016J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ\u0016\u0010\u0013\u001a\u00020\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\bH\u0016¨\u0006\u0018"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotMapValueSet;", "K", "V", "Landroidx/compose/runtime/snapshots/SnapshotMapSet;", "element", "", TransportUri.ACTION_ADD, "(Ljava/lang/Object;)Ljava/lang/Void;", "", MessengerShareContentUtility.ELEMENTS, "addAll", "Landroidx/compose/runtime/snapshots/StateMapMutableValuesIterator;", "iterator", "", "remove", "(Ljava/lang/Object;)Z", "removeAll", "retainAll", SearchCriteria.CONTAINS, "containsAll", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", SportAnalytics.ParamValue.MapButtonType.MAP, "<init>", "(Landroidx/compose/runtime/snapshots/SnapshotStateMap;)V", "runtime_release"}, k = 1, mv = {1, 5, 1})
final class SnapshotMapValueSet<K, V> extends SnapshotMapSet<K, V, V> {
    public SnapshotMapValueSet(@NotNull SnapshotStateMap<K, V> snapshotStateMap) {
        super(snapshotStateMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) add(obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) addAll(collection)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object element) {
        return getMap().containsValue(element);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        if (elements.isEmpty()) {
            return true;
        }
        Iterator<T> it2 = elements.iterator();
        while (it2.hasNext()) {
            if (!getMap().containsValue(it2.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object element) {
        return getMap().removeValue$runtime_release(element);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(@NotNull Collection<? extends Object> elements) {
        Snapshot current;
        Set set = CollectionsKt___CollectionsKt.toSet(elements);
        SnapshotStateMap<K, V> map = getMap();
        SnapshotStateMap.StateMapStateRecord stateMapStateRecord = (SnapshotStateMap.StateMapStateRecord) SnapshotKt.current((SnapshotStateMap.StateMapStateRecord) map.getFirstStateRecord(), Snapshot.INSTANCE.getCurrent());
        PersistentMap.Builder<K, V> builder = stateMapStateRecord.getMap$runtime_release().builder();
        boolean z = false;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (set.contains(entry.getValue())) {
                builder.remove(entry.getKey());
                z = true;
            }
        }
        Unit unit = Unit.INSTANCE;
        PersistentMap<K, V> persistentMapBuild = builder.build();
        if (persistentMapBuild != stateMapStateRecord.getMap$runtime_release()) {
            SnapshotStateMap.StateMapStateRecord stateMapStateRecord2 = (SnapshotStateMap.StateMapStateRecord) map.getFirstStateRecord();
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                SnapshotStateMap.StateMapStateRecord stateMapStateRecord3 = (SnapshotStateMap.StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, map, current);
                stateMapStateRecord3.setMap$runtime_release(persistentMapBuild);
                stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification() + 1);
            }
            SnapshotKt.notifyWrite(current, map);
        }
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(@NotNull Collection<? extends Object> elements) {
        Snapshot current;
        Set set = CollectionsKt___CollectionsKt.toSet(elements);
        SnapshotStateMap<K, V> map = getMap();
        SnapshotStateMap.StateMapStateRecord stateMapStateRecord = (SnapshotStateMap.StateMapStateRecord) SnapshotKt.current((SnapshotStateMap.StateMapStateRecord) map.getFirstStateRecord(), Snapshot.INSTANCE.getCurrent());
        PersistentMap.Builder<K, V> builder = stateMapStateRecord.getMap$runtime_release().builder();
        boolean z = false;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (!set.contains(entry.getValue())) {
                builder.remove(entry.getKey());
                z = true;
            }
        }
        Unit unit = Unit.INSTANCE;
        PersistentMap<K, V> persistentMapBuild = builder.build();
        if (persistentMapBuild != stateMapStateRecord.getMap$runtime_release()) {
            SnapshotStateMap.StateMapStateRecord stateMapStateRecord2 = (SnapshotStateMap.StateMapStateRecord) map.getFirstStateRecord();
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                SnapshotStateMap.StateMapStateRecord stateMapStateRecord3 = (SnapshotStateMap.StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, map, current);
                stateMapStateRecord3.setMap$runtime_release(persistentMapBuild);
                stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification() + 1);
            }
            SnapshotKt.notifyWrite(current, map);
        }
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    @NotNull
    public Void add(V element) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.Set, java.util.Collection
    @NotNull
    public Void addAll(@NotNull Collection<? extends V> elements) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @NotNull
    public StateMapMutableValuesIterator<K, V> iterator() {
        return new StateMapMutableValuesIterator<>(getMap(), ((ImmutableSet) getMap().getReadable$runtime_release().getMap$runtime_release().entrySet()).iterator());
    }
}
