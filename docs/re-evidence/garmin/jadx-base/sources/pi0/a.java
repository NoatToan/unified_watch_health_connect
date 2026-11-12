package pi0;

import android.content.Context;
import android.text.format.DateUtils;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.w;
import p13.x;
import p13.y;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpi0/a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "formatter_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f137833a;

    public a(Context context) {
        context.getClass();
        this.f137833a = context;
    }

    public static ArrayList i(List list, LocalDateTime localDateTime, DateTimeZone dateTimeZone) {
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(localDateTime.withFields((LocalTime) it.next()));
        }
        if (!arrayList.isEmpty()) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                if (dateTimeZone.isLocalDateTimeGap((LocalDateTime) it3.next())) {
                    ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        arrayList2.add(((LocalDateTime) it4.next()).minusDays(1).toDateTime());
                    }
                    return arrayList2;
                }
            }
        }
        ArrayList arrayList3 = new ArrayList(y.r(arrayList, 10));
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            arrayList3.add(((LocalDateTime) it5.next()).toDateTime());
        }
        return arrayList3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final String a(DateTime dateTime, qi0.a aVar) {
        dateTime.getClass();
        aVar.getClass();
        String dateTime2 = DateUtils.formatDateTime(this.f137833a, dateTime.getMillis(), b.a((c) b.f137835b.get(aVar), 16));
        dateTime2.getClass();
        return dateTime2;
    }

    public final String b(DateTime dateTime, qi0.b bVar) {
        bVar.getClass();
        String dateTime2 = DateUtils.formatDateTime(this.f137833a, dateTime.getMillis(), b.a(b.f137834a.get(bVar), 16, 1));
        dateTime2.getClass();
        return dateTime2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final String c(DateTime dateTime, qi0.f fVar) {
        dateTime.getClass();
        fVar.getClass();
        String dateTime2 = DateUtils.formatDateTime(this.f137833a, dateTime.getMillis(), b.a((c) b.f137836c.get(fVar), 1));
        dateTime2.getClass();
        return dateTime2;
    }

    public final String d(LocalDate localDate, qi0.a aVar) {
        localDate.getClass();
        aVar.getClass();
        DateTime dateTimeAtStartOfDay = localDate.toDateTimeAtStartOfDay();
        dateTimeAtStartOfDay.getClass();
        return a(dateTimeAtStartOfDay, aVar);
    }

    public final String e(LocalTime localTime, qi0.f fVar) {
        localTime.getClass();
        fVar.getClass();
        List listC = w.c(localTime);
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        localDateTimeNow.getClass();
        DateTimeZone dateTimeZone = DateTimeZone.getDefault();
        dateTimeZone.getClass();
        return c((DateTime) i(listC, localDateTimeNow, dateTimeZone).get(0), fVar);
    }

    public final String f(int i14, DateTime dateTime, DateTime dateTime2) {
        if (dateTime2.isEqual(dateTime2.withTimeAtStartOfDay())) {
            dateTime2 = dateTime2.plusDays(1);
        }
        if (s.g(Locale.getDefault().getCountry(), "VN")) {
            i14 |= 131072;
        }
        long millis = dateTime.getMillis();
        long millis2 = dateTime2.getMillis();
        String dateRange = DateUtils.formatDateRange(this.f137833a, millis, millis2, i14);
        dateRange.getClass();
        return dateRange;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final String g(DateTime dateTime, DateTime dateTime2, qi0.c cVar) {
        dateTime.getClass();
        dateTime2.getClass();
        cVar.getClass();
        return f(b.a((c) b.f137838e.get(cVar), 16), dateTime, dateTime2);
    }

    public final String h(LocalTime localTime, LocalTime localTime2, qi0.e eVar) {
        eVar.getClass();
        List listK = x.k(localTime, localTime2);
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        localDateTimeNow.getClass();
        DateTimeZone dateTimeZone = DateTimeZone.getDefault();
        dateTimeZone.getClass();
        ArrayList arrayListI = i(listK, localDateTimeNow, dateTimeZone);
        DateTime dateTime = (DateTime) arrayListI.get(0);
        DateTime dateTime2 = (DateTime) arrayListI.get(1);
        dateTime.getClass();
        dateTime2.getClass();
        return f(b.a(b.f137839f.get(eVar), 1), dateTime, dateTime2);
    }
}
