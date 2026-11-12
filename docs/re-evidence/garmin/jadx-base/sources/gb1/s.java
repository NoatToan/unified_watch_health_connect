package gb1;

import androidx.lifecycle.u1;
import androidx.lifecycle.y0;
import fe2.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgb1/s;", "Landroidx/lifecycle/u1;", "<init>", "()V", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public db1.m f76705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f76706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o13.t f76707c = o13.m.b(new g12.m(19));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o13.t f76708d = o13.m.b(new z(this, 15));

    public static final void x4(s sVar, ArrayList arrayList) {
        Object obj;
        sVar.getClass();
        if (arrayList.isEmpty()) {
            return;
        }
        tb1.c.a aVar = tb1.c.f163744a;
        i52.a.f91796a.getClass();
        ww0.a aVarL = i52.a.l();
        aVar.getClass();
        if (tb1.c.a.a(aVarL)) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                db1.m mVar = (db1.m) obj2;
                if (mVar.getDeliveryDate() == null && mVar.getEndDate() == null && mVar.getDueDate() != null) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    LocalDate dueDate = ((db1.m) next).getDueDate();
                    dueDate.getClass();
                    do {
                        Object next2 = it.next();
                        LocalDate dueDate2 = ((db1.m) next2).getDueDate();
                        dueDate2.getClass();
                        if (dueDate.compareTo(dueDate2) < 0) {
                            next = next2;
                            dueDate = dueDate2;
                        }
                    } while (it.hasNext());
                }
                obj = next;
            } else {
                obj = null;
            }
            sVar.f76705a = (db1.m) obj;
        }
    }

    public final y0<fw.m<List<db1.m>>> y4() {
        return (y0) this.f76707c.getValue();
    }
}
