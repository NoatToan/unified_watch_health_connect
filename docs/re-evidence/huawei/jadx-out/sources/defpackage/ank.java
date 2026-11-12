package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public class ank<R, C, V> extends ImmutableTable<R, C, V> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final V f603c;
    final C d;
    final R e;

    @Override // com.google.common.collect.Table
    public int size() {
        return 1;
    }

    public ank(R r, C c2, V v) {
        this.e = (R) Preconditions.checkNotNull(r);
        this.d = (C) Preconditions.checkNotNull(c2);
        this.f603c = (V) Preconditions.checkNotNull(v);
    }

    public ank(Table.Cell<R, C, V> cell) {
        this(cell.getRowKey(), cell.getColumnKey(), cell.getValue());
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public ImmutableMap<R, V> column(C c2) {
        Preconditions.checkNotNull(c2);
        if (containsColumn(c2)) {
            return ImmutableMap.of(this.e, (Object) this.f603c);
        }
        return ImmutableMap.of();
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public ImmutableMap<C, Map<R, V>> columnMap() {
        return ImmutableMap.of(this.d, ImmutableMap.of(this.e, (Object) this.f603c));
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public ImmutableMap<R, Map<C, V>> rowMap() {
        return ImmutableMap.of(this.e, ImmutableMap.of(this.d, (Object) this.f603c));
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    public ImmutableSet<Table.Cell<R, C, V>> createCellSet() {
        return ImmutableSet.of(cellOf(this.e, this.d, this.f603c));
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    public ImmutableCollection<V> createValues() {
        return ImmutableSet.of(this.f603c);
    }

    @Override // com.google.common.collect.ImmutableTable
    public Object writeReplace() {
        return ImmutableTable.e.e(this, new int[]{0}, new int[]{0});
    }
}
