package com.amap.api.col.p0003sl;

import android.content.Context;

/* JADX INFO: loaded from: classes21.dex */
abstract class hk<T, V> extends fm<T, V> {
    public hk(Context context, T t) {
        super(context, t);
    }

    public final T f() {
        return this.f2534b;
    }

    @Override // com.amap.api.col.p0003sl.la
    public String getURL() {
        return ft.a() + "/weather/weatherInfo?";
    }
}
