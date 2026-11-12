package defpackage;

import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes5.dex */
public class vep {
    public static final vep c = new vep(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f36823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TimeZone f36824b;

    public vep(Long l, TimeZone timeZone) {
        this.f36823a = l;
        this.f36824b = timeZone;
    }

    public static vep c() {
        return c;
    }

    public Calendar a() {
        return b(this.f36824b);
    }

    public Calendar b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l = this.f36823a;
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        return calendar;
    }
}
