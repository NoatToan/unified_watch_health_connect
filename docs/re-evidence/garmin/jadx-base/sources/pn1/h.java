package pn1;

import java.util.ArrayList;
import java.util.Iterator;
import o13.p;
import org.joda.time.DateTime;
import org.joda.time.ReadableInstant;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpn1/h;", "", "<init>", "()V", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f138689a = new h();

    private h() {
    }

    public static boolean a(DateTime dateTime, p pVar) {
        A a14 = pVar.f128594a;
        if (dateTime == null) {
            return false;
        }
        B b14 = pVar.f128595b;
        if (a14 == 0 || b14 == 0) {
            return false;
        }
        if (!dateTime.isEqual((ReadableInstant) a14) && !dateTime.isAfter((ReadableInstant) a14)) {
            return false;
        }
        ReadableInstant readableInstant = (ReadableInstant) b14;
        return dateTime.isEqual(readableInstant) || dateTime.isBefore(readableInstant);
    }

    public static boolean b(DateTime dateTime, ArrayList arrayList) {
        if (dateTime == null || arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            km1.b bVar = (km1.b) it.next();
            p pVar = new p(km1.b.f(bVar), km1.b.d(bVar));
            f138689a.getClass();
            if (a(dateTime, pVar)) {
                return true;
            }
        }
        return false;
    }
}
