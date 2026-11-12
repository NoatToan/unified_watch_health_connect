package ay0;

import com.garmin.android.apps.connectmobile.courses.model.i;
import g22.k;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import k30.m;
import k30.n;
import k30.o;
import lc.u0;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p005kotlin.jvm.internal.s;
import p13.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13654a;

        static {
            int[] iArr = new int[m.values().length];
            try {
                iArr[m.COURSE_DATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.COURSE_LENGTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m.ZA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[m.AZ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f13654a = iArr;
        }
    }

    public static final List<sy0.f> a(List<sy0.f> list, n nVar) {
        list.getClass();
        nVar.getClass();
        i53.c<o> cVar = nVar.f102576b;
        if (cVar.size() == i.f32978q.getF134973e()) {
            if (!cVar.isEmpty()) {
                Iterator<o> it = cVar.iterator();
                while (it.hasNext()) {
                    if (!it.next().f102580b) {
                    }
                }
            }
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            sy0.f fVar = (sy0.f) obj;
            if (!cVar.isEmpty()) {
                for (o oVar : cVar) {
                    if (s.g(oVar.f102579a.f32984f, fVar.f161217g.f4358a) && oVar.f102580b) {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    public static final List<sy0.f> b(List<sy0.f> list, n nVar) {
        nVar.getClass();
        int i14 = a.f13654a[nVar.f102575a.ordinal()];
        if (i14 == 1) {
            return h0.N0(list, new d());
        }
        if (i14 == 2) {
            return h0.N0(list, new e());
        }
        if (i14 == 3) {
            return h0.N0(list, new f());
        }
        if (i14 == 4) {
            return h0.N0(list, new c());
        }
        u0.r();
        return null;
    }

    public static final DateTime c(String str) {
        str.getClass();
        return k.q(str, "yyyy-MM-dd", DateTimeZone.getDefault());
    }

    public static final b63.o d(String str) {
        Date date;
        Instant instant;
        ZonedDateTime zonedDateTimeAtZone;
        LocalDate localDate;
        str.getClass();
        DateTime dateTimeC = c(str);
        if (dateTimeC == null || (date = dateTimeC.toDate()) == null || (instant = date.toInstant()) == null || (zonedDateTimeAtZone = instant.atZone(ZoneId.systemDefault())) == null || (localDate = zonedDateTimeAtZone.toLocalDate()) == null) {
            return null;
        }
        return new b63.o(localDate);
    }
}
