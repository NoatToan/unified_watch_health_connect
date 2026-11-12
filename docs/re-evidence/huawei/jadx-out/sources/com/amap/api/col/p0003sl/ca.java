package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.maps.AMapException;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ca<T, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected T f2301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f2302b = 3;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Context f2303c;

    protected abstract V a(JSONObject jSONObject) throws AMapException;

    protected abstract String a();

    protected abstract JSONObject a(im.b bVar);

    protected abstract Map<String, String> b();

    public ca(Context context, T t) {
        a(context, t);
    }

    private void a(Context context, T t) {
        this.f2303c = context;
        this.f2301a = t;
    }

    public final V c() throws AMapException {
        if (this.f2301a != null) {
            return d();
        }
        return null;
    }

    private V d() throws AMapException {
        int i = 0;
        V vA = null;
        im.b bVarA = null;
        while (i < this.f2302b) {
            try {
                bVarA = im.a(this.f2303c, eb.a(), a(), b());
                vA = a(a(bVarA));
                i = this.f2302b;
            } catch (Throwable th) {
                jv.c(th, "AbstractProtocalHandler", "getDataMayThrow AMapException");
                th.printStackTrace();
                i++;
                if (i < this.f2302b) {
                    continue;
                } else {
                    if (bVarA != null && bVarA.f2776c != null) {
                        throw new AMapException(bVarA.f2776c);
                    }
                    vA = null;
                }
            }
        }
        return vA;
    }
}
