package com.amap.api.col.p0003sl;

import android.content.Context;
import com.huawei.hms.network.embedded.j2;
import com.huawei.openalliance.ad.constant.Constants;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public abstract class ie<T, V> extends id<T, V> {
    @Override // com.amap.api.col.p0003sl.id
    protected abstract V a(String str) throws ic;

    @Override // com.amap.api.col.p0003sl.id
    protected abstract String c();

    @Override // com.amap.api.col.p0003sl.df, com.amap.api.col.p0003sl.la
    public Map<String, String> getParams() {
        return null;
    }

    public ie(Context context, T t) {
        super(context, t);
    }

    @Override // com.amap.api.col.p0003sl.la
    public byte[] getEntityBytes() {
        try {
            return c().getBytes("utf-8");
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @Override // com.amap.api.col.p0003sl.id, com.amap.api.col.p0003sl.la
    public Map<String, String> getRequestHead() {
        HashMap map = new HashMap(16);
        map.put("Content-Type", " application/json");
        map.put(j2.v, Constants.GZIP);
        map.put("User-Agent", "AMAP SDK Android Trace 10.1.300");
        map.put("x-INFO", io.b(this.g));
        map.put("platinfo", String.format(Locale.US, "platform=Android&sdkversion=%s&product=%s", "10.1.300", "trace"));
        map.put("logversion", "2.1");
        return map;
    }
}
