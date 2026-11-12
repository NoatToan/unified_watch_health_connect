package fj0;

import android.content.Context;
import c22.j0;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import g22.k;
import i53.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import m92.h0;
import o82.g;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p13.y;
import pi0.e;
import yi0.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfj0/a;", "", "<init>", "()V", "gcm-functional-threshold-power_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f71826a = new a();

    /* JADX INFO: renamed from: fj0.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1461a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f71827a;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.f130853f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.f130854g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f71827a = iArr;
        }
    }

    private a() {
    }

    public static String a(Context context, DateTime dateTime, qi0.a aVar) {
        if (dateTime == null) {
            String string = context.getString(R.string.no_value);
            string.getClass();
            return string;
        }
        if (!k.k(dateTime)) {
            return new e(context).a(dateTime, aVar);
        }
        String string2 = context.getString(R.string.mct_lbl_today);
        string2.getClass();
        return string2;
    }

    public static c b(Context context, e eVar, pi0.a aVar, DateTime dateTime, g gVar, b bVar, c cVar) {
        DateTime dateTimePlusDays;
        String strC;
        String strG;
        ArrayList arrayList = new ArrayList(y.r(cVar, 10));
        Iterator<E> it = cVar.iterator();
        while (it.hasNext()) {
            h0.e.a aVar2 = (h0.e.a) it.next();
            int i14 = C1461a.f71827a[gVar.ordinal()];
            if (i14 == 1) {
                dateTimePlusDays = dateTime.plusDays((int) aVar2.f117346a);
            } else if (i14 != 2) {
                j0.f23099a.getClass();
                dateTimePlusDays = j0.S(dateTime).plusDays((int) aVar2.f117346a);
            } else {
                dateTimePlusDays = dateTime.plusWeeks((int) aVar2.f117346a);
            }
            b bVar2 = b.WATTS;
            if (bVar == bVar2) {
                strC = org.apache.commons.lang3.e.d((int) aVar2.f117347b, StringUtils.SPACE, context.getString(bVar.f197332c));
            } else {
                l3.a aVar3 = l3.f23124b;
                double d14 = aVar2.f117347b;
                aVar3.getClass();
                strC = l3.a.U1(d14) + StringUtils.SPACE + context.getString(bVar.f197332c);
            }
            g gVar2 = g.f130853f;
            if (gVar != gVar2) {
                String string = context.getString(R.string.sleep_lbl_average_prefix);
                string.getClass();
                String lowerCase = string.toLowerCase(Locale.ROOT);
                strC = zl.a.c(lowerCase, strC, StringUtils.SPACE, lowerCase);
            }
            String strA = bVar == bVar2 ? oi0.c.A(context, new fh0.b(1), strC) : oi0.c.A(context, new fh0.b(2), strC);
            float f14 = aVar2.f117346a;
            if (gVar == gVar2) {
                dateTimePlusDays.getClass();
                strG = eVar.a(dateTimePlusDays, qi0.a.YEAR_MONTH_DAY);
            } else {
                dateTimePlusDays.getClass();
                DateTime dateTimePlusDays2 = dateTimePlusDays.plusDays(6);
                dateTimePlusDays2.getClass();
                strG = aVar.g(dateTimePlusDays, dateTimePlusDays2, qi0.c.OVERLAPPING_RELATIVE_YEAR_OVERLAPPING_MONTH_DAY);
            }
            arrayList.add(new gj0.c(f14, strC, strA, strG));
        }
        return i53.a.e(arrayList);
    }

    public static c c(DateTime dateTime, ArrayList arrayList) {
        h0.e.a aVar;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            wi0.a aVar2 = (wi0.a) it.next();
            DateTime dateTimeA = aVar2.a();
            Double value = aVar2.getValue();
            if (dateTimeA == null || value == null) {
                aVar = null;
            } else {
                aVar = new h0.e.a(k.a(dateTime, dateTimeA), (float) value.doubleValue());
            }
            if (aVar != null) {
                arrayList2.add(aVar);
            }
        }
        return i53.a.e(arrayList2);
    }

    public static c d(DateTime dateTime, ArrayList arrayList) {
        h0.e.a aVar;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            wi0.a aVar2 = (wi0.a) it.next();
            DateTime dateTimeA = aVar2.a();
            Double value = aVar2.getValue();
            if (dateTimeA == null || value == null) {
                aVar = null;
            } else {
                aVar = new h0.e.a(k.a(dateTime, dateTimeA) / 7, (float) value.doubleValue());
            }
            if (aVar != null) {
                arrayList2.add(aVar);
            }
        }
        return i53.a.e(arrayList2);
    }

    public static c e(DateTime dateTime, ArrayList arrayList) {
        h0.e.a aVar;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            wi0.a aVar2 = (wi0.a) it.next();
            DateTime dateTimeA = aVar2.a();
            Double value = aVar2.getValue();
            if (dateTimeA == null || value == null) {
                aVar = null;
            } else {
                double dDoubleValue = value.doubleValue();
                j0.f23099a.getClass();
                aVar = new h0.e.a(k.a(j0.S(dateTime), dateTimeA), (float) dDoubleValue);
            }
            if (aVar != null) {
                arrayList2.add(aVar);
            }
        }
        return i53.a.e(arrayList2);
    }
}
