package cn.hutool.core.convert.impl;

import cn.hutool.core.convert.AbstractConverter;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.a;
import defpackage.tt3;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class DateConverter extends AbstractConverter<Date> {
    private static final long serialVersionUID = 1;
    private String format;
    private final Class<? extends Date> targetType;

    public DateConverter(Class<? extends Date> cls) {
        this.targetType = cls;
    }

    private Date wrap(Date date) {
        Class<? extends Date> cls = this.targetType;
        if (Date.class == cls) {
            return date;
        }
        if (DateTime.class == cls) {
            return a.i(date);
        }
        if (java.sql.Date.class == cls) {
            return new java.sql.Date(date.getTime());
        }
        if (Time.class == cls) {
            return new Time(date.getTime());
        }
        if (Timestamp.class == cls) {
            return new Timestamp(date.getTime());
        }
        throw new UnsupportedOperationException(tt3.y("Unsupport Date type: {}", this.targetType.getName()));
    }

    public String getFormat() {
        return this.format;
    }

    public void setFormat(String str) {
        this.format = str;
    }

    @Override // cn.hutool.core.convert.AbstractConverter
    public Date convertInternal(Object obj) {
        if (obj instanceof TemporalAccessor) {
            return wrap(a.g((TemporalAccessor) obj));
        }
        if (obj instanceof Calendar) {
            return wrap(a.h((Calendar) obj));
        }
        if (obj instanceof Number) {
            return wrap(((Number) obj).longValue());
        }
        String strConvertToStr = convertToStr(obj);
        DateTime dateTimeR = tt3.F(this.format) ? a.r(strConvertToStr) : a.t(strConvertToStr, this.format);
        if (dateTimeR != null) {
            return wrap(dateTimeR);
        }
        throw new UnsupportedOperationException(tt3.y("Unsupport Date type: {}", this.targetType.getName()));
    }

    public DateConverter(Class<? extends Date> cls, String str) {
        this.targetType = cls;
        this.format = str;
    }

    private Date wrap(long j) {
        Class<? extends Date> cls = this.targetType;
        if (Date.class == cls) {
            return new Date(j);
        }
        if (DateTime.class == cls) {
            return a.f(j);
        }
        if (java.sql.Date.class == cls) {
            return new java.sql.Date(j);
        }
        if (Time.class == cls) {
            return new Time(j);
        }
        if (Timestamp.class == cls) {
            return new Timestamp(j);
        }
        throw new UnsupportedOperationException(tt3.y("Unsupport Date type: {}", this.targetType.getName()));
    }
}
