package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.maps.AMapException;
import defpackage.m2t;
import defpackage.zns;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g<T, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f6061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6062b = 3;
    public Context c;

    public g(Context context, T t) {
        d(context, t);
    }

    public abstract V a(JSONObject jSONObject) throws AMapException;

    public abstract String b();

    public abstract JSONObject c(x0.c cVar);

    public final void d(Context context, T t) {
        this.c = context;
        this.f6061a = t;
    }

    public abstract Map<String, String> e();

    public final V f() throws AMapException {
        if (this.f6061a != null) {
            return g();
        }
        return null;
    }

    public final V g() throws AMapException {
        int i = 0;
        V vA = null;
        x0.c cVarC = null;
        while (i < this.f6062b) {
            try {
                cVarC = x0.c(this.c, zns.t(), b(), e());
                vA = a(c(cVarC));
                i = this.f6062b;
            } catch (Throwable th) {
                m2t.r(th, "AbstractProtocalHandler", "getDataMayThrow AMapException");
                th.printStackTrace();
                i++;
                if (i < this.f6062b) {
                    continue;
                } else {
                    if (cVarC != null && cVarC.c != null) {
                        throw new AMapException(cVarC.c);
                    }
                    vA = null;
                }
            }
        }
        return vA;
    }
}
