package ih0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f93453a;

        static {
            int[] iArr = new int[dh0.g.values().length];
            try {
                iArr[dh0.g.BODY_FAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[dh0.g.BMI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f93453a = iArr;
        }
    }

    public static final dh0.d a(List<dh0.d> list, dh0.g gVar) {
        Object next;
        list.getClass();
        gVar.getClass();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((dh0.d) next).f59564a == gVar) {
                return (dh0.d) next;
            }
        }
        next = null;
        return (dh0.d) next;
    }

    public static final ArrayList b(List list) {
        ArrayList arrayListL = androidx.core.view.j.l(list);
        for (Object obj : list) {
            dh0.d dVar = (dh0.d) obj;
            dVar.getClass();
            Boolean bool = dVar.f59567d;
            if (bool != null ? bool.booleanValue() : false) {
                arrayListL.add(obj);
            }
        }
        return arrayListL;
    }
}
