package com.amap.api.mapcore.util;

import android.content.Context;
import com.amap.api.maps.AMapException;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bw<T, V> {
    public T a;
    public int b = 3;
    public Context c;

    public bw(Context context, T t) {
        this.c = context;
        this.a = t;
    }

    private V d() throws AMapException {
        int i = 0;
        V vA = null;
        gk.a aVarA = null;
        while (i < this.b) {
            try {
                aVarA = gk.a(this.c, er.f(), a(), b());
                vA = a(a(aVarA));
                i = this.b;
            } catch (Throwable th) {
                hn.c(th, "AbstractProtocalHandler", "getDataMayThrow AMapException");
                th.printStackTrace();
                i++;
                if (i < this.b) {
                    continue;
                } else {
                    if (aVarA != null && aVarA.c != null) {
                        throw new AMapException(aVarA.c);
                    }
                    vA = null;
                }
            }
        }
        return vA;
    }

    public abstract V a(JSONObject jSONObject) throws AMapException;

    public abstract String a();

    public abstract JSONObject a(gk.a aVar);

    public abstract Map<String, String> b();

    public final V c() throws AMapException {
        if (this.a != null) {
            return d();
        }
        return null;
    }
}
