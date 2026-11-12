package org.apache.commons.lang3.time;

import androidx.core.view.j;
import ch.qos.logback.core.CoreConstants;
import ds.e0;
import i3.e5;
import java.util.Date;
import java.util.TimeZone;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
class GmtTimeZone extends TimeZone {
    private static final int HOURS_PER_DAY = 24;
    private static final int MILLISECONDS_PER_MINUTE = 60000;
    private static final int MINUTES_PER_HOUR = 60;
    static final long serialVersionUID = 1;
    private final int offset;
    private final String zoneId;

    public GmtTimeZone(boolean z14, int i14, int i15) {
        if (i14 >= 24) {
            h.s(j.f(i14, " hours out of range"));
            throw null;
        }
        if (i15 >= 60) {
            h.s(j.f(i15, " minutes out of range"));
            throw null;
        }
        int iC = e5.c(i14, 60, i15, 60000);
        this.offset = z14 ? -iC : iC;
        StringBuilder sb3 = new StringBuilder(9);
        sb3.append(TimeZones.GMT_ID);
        sb3.append(z14 ? '-' : '+');
        StringBuilder sbTwoDigits = twoDigits(sb3, i14);
        sbTwoDigits.append(CoreConstants.COLON_CHAR);
        this.zoneId = twoDigits(sbTwoDigits, i15).toString();
    }

    private static StringBuilder twoDigits(StringBuilder sb3, int i14) {
        sb3.append((char) ((i14 / 10) + 48));
        sb3.append((char) ((i14 % 10) + 48));
        return sb3;
    }

    public boolean equals(Object obj) {
        return (obj instanceof GmtTimeZone) && this.zoneId == ((GmtTimeZone) obj).zoneId;
    }

    @Override // java.util.TimeZone
    public String getID() {
        return this.zoneId;
    }

    @Override // java.util.TimeZone
    public int getOffset(int i14, int i15, int i16, int i17, int i18, int i19) {
        return this.offset;
    }

    @Override // java.util.TimeZone
    public int getRawOffset() {
        return this.offset;
    }

    public int hashCode() {
        return this.offset;
    }

    @Override // java.util.TimeZone
    public boolean inDaylightTime(Date date) {
        return false;
    }

    @Override // java.util.TimeZone
    public void setRawOffset(int i14) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[GmtTimeZone id=\"");
        sb3.append(this.zoneId);
        sb3.append("\",offset=");
        return e0.j(sb3, this.offset, ']');
    }

    @Override // java.util.TimeZone
    public boolean useDaylightTime() {
        return false;
    }
}
