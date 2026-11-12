package cn.hutool.core.io.unit;

import com.xiaomi.onetrack.api.c;
import com.xiaomi.smarthome.frame.server_compact.ServerConstants;
import defpackage.ap5;
import defpackage.tt3;

/* JADX INFO: loaded from: classes.dex */
public enum DataUnit {
    BYTES(c.f13755a, ap5.b(1)),
    KILOBYTES("KB", ap5.d(1)),
    MEGABYTES("MB", ap5.e(1)),
    GIGABYTES(ServerConstants.GB_COUNTRY_CODE, ap5.c(1)),
    TERABYTES("TB", ap5.h(1));

    public static final String[] UNIT_NAMES = {c.f13755a, "KB", "MB", ServerConstants.GB_COUNTRY_CODE, "TB", "PB", "EB"};
    private final ap5 size;
    private final String suffix;

    DataUnit(String str, ap5 ap5Var) {
        this.suffix = str;
        this.size = ap5Var;
    }

    public static DataUnit fromSuffix(String str) {
        for (DataUnit dataUnit : values()) {
            if (tt3.i0(dataUnit.suffix, str)) {
                return dataUnit;
            }
        }
        throw new IllegalArgumentException("Unknown data unit suffix '" + str + "'");
    }

    public ap5 size() {
        return this.size;
    }
}
