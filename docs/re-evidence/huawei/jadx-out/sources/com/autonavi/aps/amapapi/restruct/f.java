package com.autonavi.aps.amapapi.restruct;

import com.amap.api.maps.model.MyLocationStyle;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3955a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f3956b = 0.0d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f3957c = 0.0d;
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
            jSONObject.put("lon", this.f3957c);
            jSONObject.put("lat", this.f3956b);
            jSONObject.put("radius", this.e);
            jSONObject.put(MyLocationStyle.LOCATION_TYPE, this.f3955a);
            jSONObject.put("reType", this.g);
            jSONObject.put("reSubType", this.h);
        } catch (Throwable unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return "";
        }
        return jSONObject.toString();
    }

    public final void a(JSONObject jSONObject) {
        try {
            this.f3956b = jSONObject.optDouble("lat", this.f3956b);
            this.f3957c = jSONObject.optDouble("lon", this.f3957c);
            this.f3955a = jSONObject.optInt(MyLocationStyle.LOCATION_TYPE, this.f3955a);
            this.g = jSONObject.optInt("reType", this.g);
            this.h = jSONObject.optInt("reSubType", this.h);
            this.e = jSONObject.optInt("radius", this.e);
            this.d = jSONObject.optLong("time", this.d);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "CoreUtil", "transformLocation");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return this.f3955a == fVar.f3955a && Double.compare(fVar.f3956b, this.f3956b) == 0 && Double.compare(fVar.f3957c, this.f3957c) == 0 && this.d == fVar.d && this.e == fVar.e && this.f == fVar.f && this.g == fVar.g && this.h == fVar.h;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f3955a), Double.valueOf(this.f3956b), Double.valueOf(this.f3957c), Long.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h));
    }
}
