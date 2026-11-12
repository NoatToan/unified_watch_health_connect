package com.fasterxml.jackson.databind.jsonFormatVisitors;

import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import defpackage.uud;

/* JADX INFO: loaded from: classes4.dex */
public enum JsonValueFormat {
    COLOR("color"),
    DATE(DialWidgetType.DATE),
    DATE_TIME("date-time"),
    EMAIL("email"),
    HOST_NAME("host-name"),
    IP_ADDRESS("ip-address"),
    IPV6("ipv6"),
    PHONE("phone"),
    REGEX("regex"),
    STYLE("style"),
    TIME("time"),
    URI(SportRecordBundleKey.BUNDLE_PARAM_URI),
    UTC_MILLISEC("utc-millisec");

    private final String _desc;

    JsonValueFormat(String str) {
        this._desc = str;
    }

    @Override // java.lang.Enum
    @uud
    public String toString() {
        return this._desc;
    }
}
