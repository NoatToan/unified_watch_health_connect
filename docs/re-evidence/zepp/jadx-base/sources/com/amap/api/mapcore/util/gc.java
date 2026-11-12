package com.amap.api.mapcore.util;

import android.content.Context;
import com.loopj.android.http.AsyncHttpClient;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gc<T, V> extends gb<T, V> {
    public gc(Context context, T t) {
        super(context, t);
    }

    @Override // com.amap.api.mapcore.util.gb
    public abstract V a(String str) throws ga;

    @Override // com.amap.api.mapcore.util.gb
    public abstract String d();

    @Override // com.amap.api.mapcore.util.ir
    public byte[] getEntityBytes() {
        try {
            return d().getBytes("utf-8");
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @Override // com.amap.api.mapcore.util.dq, com.amap.api.mapcore.util.ir
    public Map<String, String> getParams() {
        return null;
    }

    @Override // com.amap.api.mapcore.util.gb, com.amap.api.mapcore.util.ir
    public Map<String, String> getRequestHead() {
        HashMap map = new HashMap(16);
        map.put("Content-Type", " application/json");
        map.put("Accept-Encoding", AsyncHttpClient.ENCODING_GZIP);
        map.put("User-Agent", "AMAP SDK Android Trace 7.9.1");
        map.put("x-INFO", gm.b(((gb) this).g));
        map.put("platinfo", String.format(Locale.US, "platform=Android&sdkversion=%s&product=%s", "7.9.1", "trace"));
        map.put("logversion", "2.1");
        return map;
    }
}
