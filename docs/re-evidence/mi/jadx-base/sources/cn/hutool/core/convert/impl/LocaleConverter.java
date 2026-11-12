package cn.hutool.core.convert.impl;

import cn.hutool.core.convert.AbstractConverter;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import defpackage.tt3;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class LocaleConverter extends AbstractConverter<Locale> {
    private static final long serialVersionUID = 1;

    @Override // cn.hutool.core.convert.AbstractConverter
    public Locale convertInternal(Object obj) {
        try {
            String strConvertToStr = convertToStr(obj);
            if (tt3.G(strConvertToStr)) {
                return null;
            }
            String[] strArrSplit = strConvertToStr.split(RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR);
            if (strArrSplit.length == 1) {
                return new Locale(strArrSplit[0]);
            }
            return strArrSplit.length == 2 ? new Locale(strArrSplit[0], strArrSplit[1]) : new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
        } catch (Exception unused) {
            return null;
        }
    }
}
