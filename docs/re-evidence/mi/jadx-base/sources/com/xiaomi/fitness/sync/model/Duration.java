package com.xiaomi.fitness.sync.model;

import com.xiaomi.fitness.repo.RepositoryManager;
import com.xiaomi.fitness.repo.healthconnect.biz.daily.BaseSyncBiz;
import com.xiaomi.fitness.sync.exception.DateException;
import java.util.Calendar;

/* JADX INFO: loaded from: classes10.dex */
public class Duration {
    public int days;
    public int hours;
    public int minutes;
    public int seconds;
    public int sign = 1;
    public int weeks;

    public void addTo(Calendar calendar) {
        calendar.add(5, this.sign * this.weeks * 7);
        calendar.add(5, this.sign * this.days);
        calendar.add(10, this.sign * this.hours);
        calendar.add(12, this.sign * this.minutes);
        calendar.add(13, this.sign * this.seconds);
    }

    public long getMillis() {
        return ((long) (this.sign * 1000)) * ((long) ((this.weeks * BaseSyncBiz.RECORD_MAX_LIFETIME) + (this.days * RepositoryManager.GAP_A_DAY) + (this.hours * 3600) + (this.minutes * 60) + this.seconds));
    }

    public void parse(String str) throws DateException {
        int i = 1;
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
        char cCharAt = str.charAt(0);
        if (cCharAt == '-') {
            this.sign = -1;
        } else if (cCharAt != '+') {
            i = 0;
        }
        if (length <= i) {
            return;
        }
        if (str.charAt(i) != 'P') {
            throw new DateException("Duration.parse(str='" + str + "') expected 'P' at index=" + i);
        }
        int i2 = i + 1;
        if (length <= i2) {
            return;
        }
        if (str.charAt(i2) == 'T') {
            i2 = i + 2;
        }
        int i3 = 0;
        while (i2 < length) {
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 < '0' || cCharAt2 > '9') {
                if (cCharAt2 == 'W') {
                    this.weeks = i3;
                } else if (cCharAt2 == 'H') {
                    this.hours = i3;
                } else if (cCharAt2 == 'M') {
                    this.minutes = i3;
                } else if (cCharAt2 == 'S') {
                    this.seconds = i3;
                } else if (cCharAt2 == 'D') {
                    this.days = i3;
                } else if (cCharAt2 != 'T') {
                    throw new DateException("Duration.parse(str='" + str + "') unexpected char '" + cCharAt2 + "' at index=" + i2);
                }
                i3 = 0;
            } else {
                i3 = (i3 * 10) + (cCharAt2 - '0');
            }
            i2++;
        }
    }

    public long addTo(long j) {
        return j + getMillis();
    }
}
