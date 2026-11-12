package vj1;

import g22.n;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class f {
    public static final l20.a a(List<l20.a> list) {
        Object next;
        list.getClass();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (d((l20.a) next)) {
                return (l20.a) next;
            }
        }
        next = null;
        return (l20.a) next;
    }

    public static final l20.c b(l20.a aVar) {
        aVar.getClass();
        List<l20.c> listZ = aVar.z();
        Object obj = null;
        if (listZ == null) {
            return null;
        }
        for (Object obj2 : listZ) {
            Boolean isEmsValue = ((l20.c) obj2).getIsEmsValue();
            if (isEmsValue != null ? isEmsValue.booleanValue() : false) {
                obj = obj2;
                break;
            }
        }
        return (l20.c) obj;
    }

    public static final boolean c(l20.a aVar) {
        aVar.getClass();
        if (ge1.b.Q(aVar)) {
            return n.d(aVar.getFirstName()) || n.d(aVar.getLastName());
        }
        return false;
    }

    public static final boolean d(l20.a aVar) {
        aVar.getClass();
        Boolean isEmsContact = aVar.getIsEmsContact();
        return (isEmsContact != null ? isEmsContact.booleanValue() : false) && b(aVar) != null;
    }
}
