package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class uzs<T, V> extends szs<T, V> {
    public uzs(Context context, T t) {
        super(context, t);
    }

    @Override // com.amap.api.col.p0003sl.la
    public byte[] getEntityBytes() {
        try {
            return o().getBytes("utf-8");
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @Override // com.amap.api.col.p0003sl.l, com.amap.api.col.p0003sl.la
    public Map<String, String> getParams() {
        return null;
    }

    @Override // defpackage.szs, com.amap.api.col.p0003sl.la
    public Map<String, String> getRequestHead() {
        HashMap map = new HashMap(16);
        map.put("Content-Type", " application/json");
        map.put("Accept-Encoding", "gzip");
        map.put("User-Agent", "AMAP SDK Android Trace 10.1.300");
        map.put("x-INFO", g0t.i(this.t));
        map.put("platinfo", String.format(Locale.US, "platform=Android&sdkversion=%s&product=%s", "10.1.300", "trace"));
        map.put("logversion", "2.1");
        return map;
    }

    public abstract String o();
}
