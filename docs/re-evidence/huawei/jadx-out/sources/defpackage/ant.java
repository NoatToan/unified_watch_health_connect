package defpackage;

import androidx.exifinterface.media.ExifInterface;
import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Maps;
import com.google.common.collect.RegularImmutableTable;
import com.google.common.collect.Table;
import com.google.common.collect.UnmodifiableIterator;
import com.google.errorprone.annotations.Immutable;
import com.huawei.ui.main.stories.nps.interactors.mode.TypeParams;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes21.dex */
@Immutable(containerOf = {"R", TypeParams.SEARCH_CODE, ExifInterface.GPS_MEASUREMENT_INTERRUPTED})
@ElementTypesAreNonnullByDefault
public final class ant<R, C, V> extends RegularImmutableTable<R, C, V> {
    public static final ImmutableTable<Object, Object, Object> d = new ant(ImmutableList.of(), ImmutableSet.of(), ImmutableSet.of());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ImmutableMap<R, ImmutableMap<C, V>> f609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f610c;
    private final ImmutableMap<C, ImmutableMap<R, V>> e;

    /* JADX WARN: Multi-variable type inference failed */
    public ant(ImmutableList<Table.Cell<R, C, V>> immutableList, ImmutableSet<R> immutableSet, ImmutableSet<C> immutableSet2) {
        ImmutableMap immutableMapC = Maps.c(immutableSet);
        LinkedHashMap linkedHashMapC = Maps.c();
        UnmodifiableIterator<R> it = immutableSet.iterator();
        while (it.hasNext()) {
            linkedHashMapC.put(it.next(), new LinkedHashMap());
        }
        LinkedHashMap linkedHashMapC2 = Maps.c();
        UnmodifiableIterator<C> it2 = immutableSet2.iterator();
        while (it2.hasNext()) {
            linkedHashMapC2.put(it2.next(), new LinkedHashMap());
        }
        int[] iArr = new int[immutableList.size()];
        int[] iArr2 = new int[immutableList.size()];
        for (int i = 0; i < immutableList.size(); i++) {
            Table.Cell<R, C, V> cell = immutableList.get(i);
            R rowKey = cell.getRowKey();
            C columnKey = cell.getColumnKey();
            V value = cell.getValue();
            iArr[i] = ((Integer) Objects.requireNonNull((Integer) immutableMapC.get(rowKey))).intValue();
            Map map = (Map) Objects.requireNonNull((Map) linkedHashMapC.get(rowKey));
            iArr2[i] = map.size();
            checkNoDuplicate(rowKey, columnKey, map.put(columnKey, value), value);
            ((Map) Objects.requireNonNull((Map) linkedHashMapC2.get(columnKey))).put(rowKey, value);
        }
        this.f608a = iArr;
        this.f610c = iArr2;
        ImmutableMap.b bVar = new ImmutableMap.b(linkedHashMapC.size());
        for (Map.Entry entry : linkedHashMapC.entrySet()) {
            bVar.c(entry.getKey(), ImmutableMap.copyOf((Map) entry.getValue()));
        }
        this.f609b = bVar.j();
        ImmutableMap.b bVar2 = new ImmutableMap.b(linkedHashMapC2.size());
        for (Map.Entry entry2 : linkedHashMapC2.entrySet()) {
            bVar2.c(entry2.getKey(), ImmutableMap.copyOf((Map) entry2.getValue()));
        }
        this.e = bVar2.j();
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public ImmutableMap<C, Map<R, V>> columnMap() {
        return ImmutableMap.copyOf((Map) this.e);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public ImmutableMap<R, Map<C, V>> rowMap() {
        return ImmutableMap.copyOf((Map) this.f609b);
    }

    @Override // com.google.common.collect.Table
    public int size() {
        return this.f608a.length;
    }

    @Override // com.google.common.collect.RegularImmutableTable
    public Table.Cell<R, C, V> getCell(int i) {
        Map.Entry<R, ImmutableMap<C, V>> entry = this.f609b.entrySet().asList().get(this.f608a[i]);
        ImmutableMap<C, V> value = entry.getValue();
        Map.Entry<C, V> entry2 = value.entrySet().asList().get(this.f610c[i]);
        return cellOf(entry.getKey(), entry2.getKey(), entry2.getValue());
    }

    @Override // com.google.common.collect.RegularImmutableTable
    public V getValue(int i) {
        ImmutableMap<C, V> immutableMap = this.f609b.values().asList().get(this.f608a[i]);
        return immutableMap.values().asList().get(this.f610c[i]);
    }

    @Override // com.google.common.collect.RegularImmutableTable, com.google.common.collect.ImmutableTable
    public Object writeReplace() {
        ImmutableMap immutableMapC = Maps.c(columnKeySet());
        int[] iArr = new int[cellSet().size()];
        UnmodifiableIterator<Table.Cell<R, C, V>> it = cellSet().iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Integer) Objects.requireNonNull((Integer) immutableMapC.get(it.next().getColumnKey()))).intValue();
            i++;
        }
        return ImmutableTable.e.e(this, this.f608a, iArr);
    }
}
