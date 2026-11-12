package a30;

import am.x0;
import com.garmin.android.apps.connectmobile.courses.model.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes8.dex */
public final class d {
    public static final void a(a aVar, c cVar, com.garmin.android.apps.connectmobile.courses.model.e eVar) {
        b bVar;
        aVar.getClass();
        cVar.getClass();
        if (eVar != null) {
            if (eVar.getStartNote() != null || eVar.getFinishNote() != null || c(eVar) || b(eVar)) {
                x0 x0VarG = eVar.g();
                boolean zE0 = eVar.e0();
                double dQ = eVar.q();
                ArrayList arrayList = new ArrayList();
                if (eVar.getStartNote() != null || eVar.getFinishNote() != null) {
                    arrayList.add(b.EnumC0008b.NOTES);
                }
                if (c(eVar)) {
                    arrayList.add(b.EnumC0008b.REST_DURATION);
                }
                if (b(eVar)) {
                    arrayList.add(b.EnumC0008b.CUTOFF_DURATION);
                }
                String string = DateTime.now().toString("yyyy-MM-dd'T'HH:mm:ss.S");
                string.getClass();
                bVar = new b(x0VarG, zE0, dQ, arrayList, string);
            } else {
                bVar = null;
            }
            if (bVar != null) {
                aVar.a(cVar, bVar);
            }
        }
    }

    public static final boolean b(com.garmin.android.apps.connectmobile.courses.model.e eVar) {
        if (eVar.getCutoffDuration() != null) {
            return true;
        }
        List<g> listJ = eVar.j();
        if (listJ == null || listJ.isEmpty()) {
            return false;
        }
        Iterator<T> it = listJ.iterator();
        while (it.hasNext()) {
            Integer num = ((g) it.next()).cutoffDuration;
            if (num != null && num.intValue() > 0) {
                return true;
            }
        }
        return false;
    }

    public static final boolean c(com.garmin.android.apps.connectmobile.courses.model.e eVar) {
        List<g> listJ = eVar.j();
        if (listJ == null || listJ.isEmpty()) {
            return false;
        }
        Iterator<T> it = listJ.iterator();
        while (it.hasNext()) {
            Integer num = ((g) it.next()).restDuration;
            if (num != null && num.intValue() > 0) {
                return true;
            }
        }
        return false;
    }
}
