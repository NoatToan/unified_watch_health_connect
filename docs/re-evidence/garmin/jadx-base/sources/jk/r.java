package jk;

import java.util.GregorianCalendar;
import java.util.TimeZone;
import org.apache.commons.lang3.time.TimeZones;

/* JADX INFO: loaded from: classes7.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f99223a = {68, 5, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final GregorianCalendar f99224b;

    static {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        f99224b = gregorianCalendar;
        gregorianCalendar.setTimeZone(TimeZone.getTimeZone(TimeZones.GMT_ID));
        gregorianCalendar.set(1989, 11, 31, 0, 0, 0);
        gregorianCalendar.set(0, 1);
    }
}
