package defpackage;

import org.joda.time.DateTimeZone;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bw3 {
    public abstract long add(long j, long j2, int i);

    public abstract long add(qgj qgjVar, long j, int i);

    public abstract t67 centuries();

    public abstract gq5 centuryOfEra();

    public abstract gq5 clockhourOfDay();

    public abstract gq5 clockhourOfHalfday();

    public abstract gq5 dayOfMonth();

    public abstract gq5 dayOfWeek();

    public abstract gq5 dayOfYear();

    public abstract t67 days();

    public abstract gq5 era();

    public abstract t67 eras();

    public abstract int[] get(ogj ogjVar, long j);

    public abstract int[] get(qgj qgjVar, long j);

    public abstract int[] get(qgj qgjVar, long j, long j2);

    public abstract long getDateTimeMillis(int i, int i2, int i3, int i4);

    public abstract long getDateTimeMillis(int i, int i2, int i3, int i4, int i5, int i6, int i7);

    public abstract long getDateTimeMillis(long j, int i, int i2, int i3, int i4);

    public abstract DateTimeZone getZone();

    public abstract gq5 halfdayOfDay();

    public abstract t67 halfdays();

    public abstract gq5 hourOfDay();

    public abstract gq5 hourOfHalfday();

    public abstract t67 hours();

    public abstract t67 millis();

    public abstract gq5 millisOfDay();

    public abstract gq5 millisOfSecond();

    public abstract gq5 minuteOfDay();

    public abstract gq5 minuteOfHour();

    public abstract t67 minutes();

    public abstract gq5 monthOfYear();

    public abstract t67 months();

    public abstract gq5 secondOfDay();

    public abstract gq5 secondOfMinute();

    public abstract t67 seconds();

    public abstract long set(ogj ogjVar, long j);

    public abstract String toString();

    public abstract void validate(ogj ogjVar, int[] iArr);

    public abstract gq5 weekOfWeekyear();

    public abstract t67 weeks();

    public abstract gq5 weekyear();

    public abstract gq5 weekyearOfCentury();

    public abstract t67 weekyears();

    public abstract bw3 withUTC();

    public abstract bw3 withZone(DateTimeZone dateTimeZone);

    public abstract gq5 year();

    public abstract gq5 yearOfCentury();

    public abstract gq5 yearOfEra();

    public abstract t67 years();
}
