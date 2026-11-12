package com.huami.assistant.calendar;

import java.util.Calendar;

/* JADX INFO: loaded from: classes5.dex */
public class Duration {
    public int days;
    public int hours;
    public int minutes;
    public int seconds;
    public int sign = 1;
    public int weeks;

    public void addTo(Calendar cal) {
        cal.add(5, this.sign * this.weeks * 7);
        cal.add(5, this.sign * this.days);
        cal.add(10, this.sign * this.hours);
        cal.add(12, this.sign * this.minutes);
        cal.add(13, this.sign * this.seconds);
    }

    public long getMillis() {
        return ((long) (this.sign * 1000)) * ((long) ((this.weeks * 604800) + (this.days * 86400) + (this.hours * 3600) + (this.minutes * 60) + this.seconds));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x002b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:50:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x007b A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x00a4, please report this as an issue */
    public void parse(String str) throws DateException {
        int i;
        int i2;
        int i3;
        char cCharAt;
        this.sign = 1;
        this.weeks = 0;
        this.days = 0;
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
        int length = str.length();
        if (length < 1) {
            return;
        }
        char cCharAt2 = str.charAt(0);
        if (cCharAt2 != '-') {
            if (cCharAt2 != '+') {
                i = 0;
            }
            if (length < i) {
                return;
            }
            if (str.charAt(i) == 'P') {
                throw new DateException("Duration.parse(str='" + str + "') expected 'P' at index=" + i);
            }
            i2 = i + 1;
            if (str.charAt(i2) == 'T') {
                i2++;
            }
            i3 = 0;
            while (i2 < length) {
                cCharAt = str.charAt(i2);
                if (cCharAt >= '0' || cCharAt > '9') {
                    if (cCharAt == 'W') {
                        this.weeks = i3;
                    } else if (cCharAt == 'H') {
                        this.hours = i3;
                    } else if (cCharAt == 'M') {
                        this.minutes = i3;
                    } else if (cCharAt == 'S') {
                        this.seconds = i3;
                    } else if (cCharAt == 'D') {
                        this.days = i3;
                    } else if (cCharAt != 'T') {
                        throw new DateException("Duration.parse(str='" + str + "') unexpected char '" + cCharAt + "' at index=" + i2);
                    }
                    i3 = 0;
                } else {
                    i3 = (i3 * 10) + (cCharAt - '0');
                }
                i2++;
            }
        }
        this.sign = -1;
        i = 1;
        if (length < i) {
            return;
        }
        if (str.charAt(i) == 'P') {
            throw new DateException("Duration.parse(str='" + str + "') expected 'P' at index=" + i);
        }
        i2 = i + 1;
        if (str.charAt(i2) == 'T') {
            i2++;
        }
        i3 = 0;
        while (i2 < length) {
            cCharAt = str.charAt(i2);
            if (cCharAt >= '0') {
                if (cCharAt == 'W') {
                    this.weeks = i3;
                } else if (cCharAt == 'H') {
                    this.hours = i3;
                } else if (cCharAt == 'M') {
                    this.minutes = i3;
                } else if (cCharAt == 'S') {
                    this.seconds = i3;
                } else if (cCharAt == 'D') {
                    this.days = i3;
                } else if (cCharAt != 'T') {
                    throw new DateException("Duration.parse(str='" + str + "') unexpected char '" + cCharAt + "' at index=" + i2);
                }
                i3 = 0;
            } else {
                if (cCharAt == 'W') {
                    this.weeks = i3;
                } else if (cCharAt == 'H') {
                    this.hours = i3;
                } else if (cCharAt == 'M') {
                    this.minutes = i3;
                } else if (cCharAt == 'S') {
                    this.seconds = i3;
                } else if (cCharAt == 'D') {
                    this.days = i3;
                } else if (cCharAt != 'T') {
                    throw new DateException("Duration.parse(str='" + str + "') unexpected char '" + cCharAt + "' at index=" + i2);
                }
                i3 = 0;
            }
            i2++;
        }
    }

    public long addTo(long dt) {
        return dt + getMillis();
    }
}
