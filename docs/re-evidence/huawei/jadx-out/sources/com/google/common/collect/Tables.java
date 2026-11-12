package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.huawei.operation.utils.Constants;
import java.io.Serializable;
import java.util.Collections;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class Tables {
    private static final Function<? extends Map<?, ?>, ? extends Map<?, ?>> e = new Function<Map<Object, Object>, Map<Object, Object>>() { // from class: com.google.common.collect.Tables.3
        @Override // com.google.common.base.Function
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map<Object, Object> apply(Map<Object, Object> map) {
            return Collections.unmodifiableMap(map);
        }
    };

    public static <R, C, V> Table.Cell<R, C, V> c(@ParametricNullness R r, @ParametricNullness C c2, @ParametricNullness V v) {
        return new b(r, c2, v);
    }

    static final class b<R, C, V> extends AbstractCell<R, C, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @ParametricNullness
        private final V f4506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @ParametricNullness
        private final C f4507b;

        @ParametricNullness
        private final R d;

        b(@ParametricNullness R r, @ParametricNullness C c2, @ParametricNullness V v) {
            this.d = r;
            this.f4507b = c2;
            this.f4506a = v;
        }

        @Override // com.google.common.collect.Table.Cell
        @ParametricNullness
        public R getRowKey() {
            return this.d;
        }

        @Override // com.google.common.collect.Table.Cell
        @ParametricNullness
        public C getColumnKey() {
            return this.f4507b;
        }

        @Override // com.google.common.collect.Table.Cell
        @ParametricNullness
        public V getValue() {
            return this.f4506a;
        }
    }

    public static abstract class AbstractCell<R, C, V> implements Table.Cell<R, C, V> {
        @Override // com.google.common.collect.Table.Cell
        public boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Table.Cell)) {
                return false;
            }
            Table.Cell cell = (Table.Cell) obj;
            return Objects.equal(getRowKey(), cell.getRowKey()) && Objects.equal(getColumnKey(), cell.getColumnKey()) && Objects.equal(getValue(), cell.getValue());
        }

        @Override // com.google.common.collect.Table.Cell
        public int hashCode() {
            return Objects.hashCode(getRowKey(), getColumnKey(), getValue());
        }

        public String toString() {
            return Constants.LEFT_BRACKET_ONLY + getRowKey() + "," + getColumnKey() + ")=" + getValue();
        }
    }

    static boolean a(Table<?, ?, ?> table, @CheckForNull Object obj) {
        if (obj == table) {
            return true;
        }
        if (obj instanceof Table) {
            return table.cellSet().equals(((Table) obj).cellSet());
        }
        return false;
    }
}
