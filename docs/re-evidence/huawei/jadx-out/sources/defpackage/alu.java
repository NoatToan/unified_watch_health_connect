package defpackage;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;
import com.huawei.operation.utils.Constants;
import java.io.Serializable;
import java.util.List;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class alu<T> extends Ordering<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ImmutableMap<T, Integer> f519b;

    public alu(List<T> list) {
        this(Maps.c(list));
    }

    alu(ImmutableMap<T, Integer> immutableMap) {
        this.f519b = immutableMap;
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(T t, T t2) {
        return a(t) - a(t2);
    }

    private int a(T t) {
        Integer num = this.f519b.get(t);
        if (num == null) {
            throw new Ordering.a(t);
        }
        return num.intValue();
    }

    @Override // java.util.Comparator
    public boolean equals(@CheckForNull Object obj) {
        if (obj instanceof alu) {
            return this.f519b.equals(((alu) obj).f519b);
        }
        return false;
    }

    public int hashCode() {
        return this.f519b.hashCode();
    }

    public String toString() {
        return "Ordering.explicit(" + this.f519b.keySet() + Constants.RIGHT_BRACKET_ONLY;
    }
}
