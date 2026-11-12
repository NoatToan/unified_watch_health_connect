package cn.hutool.core.convert.impl;

import cn.hutool.core.convert.AbstractConverter;
import cn.hutool.core.date.a;
import defpackage.fa3;
import defpackage.tt3;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class CalendarConverter extends AbstractConverter<Calendar> {
    private static final long serialVersionUID = 1;
    private String format;

    public String getFormat() {
        return this.format;
    }

    public void setFormat(String str) {
        this.format = str;
    }

    @Override // cn.hutool.core.convert.AbstractConverter
    public Calendar convertInternal(Object obj) {
        if (obj instanceof Date) {
            return fa3.c((Date) obj);
        }
        if (obj instanceof Long) {
            return fa3.b(((Long) obj).longValue());
        }
        String strConvertToStr = convertToStr(obj);
        return fa3.c(tt3.F(this.format) ? a.r(strConvertToStr) : a.t(strConvertToStr, this.format));
    }
}
