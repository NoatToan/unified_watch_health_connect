package com.autonavi.aps.amapapi.restruct;

import com.amap.api.maps.model.MyLocationStyle;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6864a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f6865b = 0.0d;
    public double c = 0.0d;
    public long d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 63;
    public int h = 0;

    public final String a() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            jSONObject.put("time", this.d);
            jSONObject.put("lon", this.c);
            jSONObject.put("lat", this.f6865b);
            jSONObject.put("radius", this.e);
            jSONObject.put(MyLocationStyle.LOCATION_TYPE, this.f6864a);
            jSONObject.put("reType", this.g);
            jSONObject.put("reSubType", this.h);
        } catch (Throwable unused) {
            jSONObject = null;
        }
        return jSONObject == null ? "" : jSONObject.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (this.f6864a == fVar.f6864a && Double.compare(fVar.f6865b, this.f6865b) == 0 && Double.compare(fVar.c, this.c) == 0 && this.d == fVar.d && this.e == fVar.e && this.f == fVar.f && this.g == fVar.g && this.h == fVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f6864a), Double.valueOf(this.f6865b), Double.valueOf(this.c), Long.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h));
    }

    public final void a(JSONObject jSONObject) {
        try {
            this.f6865b = jSONObject.optDouble("lat", this.f6865b);
            this.c = jSONObject.optDouble("lon", this.c);
            this.f6864a = jSONObject.optInt(MyLocationStyle.LOCATION_TYPE, this.f6864a);
            this.g = jSONObject.optInt("reType", this.g);
            this.h = jSONObject.optInt("reSubType", this.h);
            this.e = jSONObject.optInt("radius", this.e);
            this.d = jSONObject.optLong("time", this.d);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "CoreUtil", "transformLocation");
        }
    }
}
