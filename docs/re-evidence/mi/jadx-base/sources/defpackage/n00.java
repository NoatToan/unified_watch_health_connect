package defpackage;

import org.joda.convert.ToString;
import org.joda.time.Duration;
import org.joda.time.Period;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n00 implements hgj {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hgj) && getMillis() == ((hgj) obj).getMillis();
    }

    public int hashCode() {
        long millis = getMillis();
        return (int) (millis ^ (millis >>> 32));
    }

    public boolean isEqual(hgj hgjVar) {
        if (hgjVar == null) {
            hgjVar = Duration.ZERO;
        }
        return compareTo(hgjVar) == 0;
    }

    public boolean isLongerThan(hgj hgjVar) {
        if (hgjVar == null) {
            hgjVar = Duration.ZERO;
        }
        return compareTo(hgjVar) > 0;
    }

    public boolean isShorterThan(hgj hgjVar) {
        if (hgjVar == null) {
            hgjVar = Duration.ZERO;
        }
        return compareTo(hgjVar) < 0;
    }

    public Duration toDuration() {
        return new Duration(getMillis());
    }

    public Period toPeriod() {
        return new Period(getMillis());
    }

    @ToString
    public String toString() {
        long millis = getMillis();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("PT");
        boolean z = millis < 0;
        d1a.f(stringBuffer, millis);
        while (true) {
            int i = 3;
            if (stringBuffer.length() >= (z ? 7 : 6)) {
                break;
            }
            if (!z) {
                i = 2;
            }
            stringBuffer.insert(i, "0");
        }
        if ((millis / 1000) * 1000 == millis) {
            stringBuffer.setLength(stringBuffer.length() - 3);
        } else {
            stringBuffer.insert(stringBuffer.length() - 3, ".");
        }
        stringBuffer.append('S');
        return stringBuffer.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(hgj hgjVar) {
        long millis = getMillis();
        long millis2 = hgjVar.getMillis();
        if (millis < millis2) {
            return -1;
        }
        return millis > millis2 ? 1 : 0;
    }
}
