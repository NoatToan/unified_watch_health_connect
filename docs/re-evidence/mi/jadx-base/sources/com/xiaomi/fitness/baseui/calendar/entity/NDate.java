package com.xiaomi.fitness.baseui.calendar.entity;

import defpackage.bwe;
import java.io.Serializable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes7.dex */
public class NDate implements Serializable {
    public LocalDate localDate;
    public bwe lunar;
    public String lunarHoliday;
    public String solarHoliday;
    public String solarTerm;

    public NDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public boolean equals(Object obj) {
        if (obj instanceof NDate) {
            return this.localDate.equals(((NDate) obj).localDate);
        }
        return false;
    }

    public NDate() {
    }
}
