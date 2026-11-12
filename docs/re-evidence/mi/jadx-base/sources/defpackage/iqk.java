package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public enum iqk {
    UNRESOLVED,
    RESOLVED;

    public static final iqk a(boolean z) {
        return z ? RESOLVED : UNRESOLVED;
    }

    public static final iqk b(Collection<? extends h00> collection) {
        Iterator<? extends h00> it = collection.iterator();
        while (it.hasNext()) {
            iqk iqkVarZ = it.next().Z();
            iqk iqkVar = UNRESOLVED;
            if (iqkVarZ == iqkVar) {
                return iqkVar;
            }
        }
        return RESOLVED;
    }
}
