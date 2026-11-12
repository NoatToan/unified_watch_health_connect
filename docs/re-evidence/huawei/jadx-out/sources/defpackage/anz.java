package defpackage;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.Ordering;
import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class anz extends Ordering<Object> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final anz f615a = new anz();
    private static final long serialVersionUID = 0;

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return obj.toString().compareTo(obj2.toString());
    }

    private Object readResolve() {
        return f615a;
    }

    public String toString() {
        return "Ordering.usingToString()";
    }

    private anz() {
    }
}
