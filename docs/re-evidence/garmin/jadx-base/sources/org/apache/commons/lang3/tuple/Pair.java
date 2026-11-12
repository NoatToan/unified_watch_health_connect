package org.apache.commons.lang3.tuple;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import java.util.Map;
import java.util.Objects;
import org.apache.commons.lang3.builder.CompareToBuilder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Pair<L, R> implements Map.Entry<L, R>, Comparable<Pair<L, R>>, Serializable {
    public static final Pair<?, ?>[] EMPTY_ARRAY = new PairAdapter[0];
    private static final long serialVersionUID = 4954918890077093841L;

    public static final class PairAdapter<L, R> extends Pair<L, R> {
        private static final long serialVersionUID = 1;

        private PairAdapter() {
        }

        @Override // org.apache.commons.lang3.tuple.Pair, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return super.compareTo((Pair) obj);
        }

        @Override // org.apache.commons.lang3.tuple.Pair
        public L getLeft() {
            return null;
        }

        @Override // org.apache.commons.lang3.tuple.Pair
        public R getRight() {
            return null;
        }

        @Override // java.util.Map.Entry
        public R setValue(R r14) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <L, R> Pair<L, R>[] emptyArray() {
        return (Pair<L, R>[]) EMPTY_ARRAY;
    }

    public static <L, R> Pair<L, R> of(L l14, R r14) {
        return ImmutablePair.of((Object) l14, (Object) r14);
    }

    @Override // java.lang.Comparable
    public int compareTo(Pair<L, R> pair) {
        return new CompareToBuilder().append(getLeft(), pair.getLeft()).append(getRight(), pair.getRight()).toComparison();
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (Objects.equals(getKey(), entry.getKey()) && Objects.equals(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final L getKey() {
        return getLeft();
    }

    public abstract L getLeft();

    public abstract R getRight();

    @Override // java.util.Map.Entry
    public R getValue() {
        return getRight();
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return Objects.hashCode(getKey()) ^ Objects.hashCode(getValue());
    }

    public String toString() {
        return "(" + getLeft() + CoreConstants.COMMA_CHAR + getRight() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public static <L, R> Pair<L, R> of(Map.Entry<L, R> entry) {
        return ImmutablePair.of((Map.Entry) entry);
    }

    public String toString(String str) {
        return String.format(str, getLeft(), getRight());
    }
}
