package com.loc;

import android.text.TextUtils;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClientOption;
import com.facebook.appevents.integrity.IntegrityManager;
import com.google.android.exoplayer2.C;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public final class dr extends AMapLocation {
    public String d;
    public boolean e;
    public String f;
    private String g;
    private String h;
    private int i;
    private String j;
    private String k;
    private JSONObject l;
    private String m;
    private String n;
    private String o;
    private boolean p;

    public dr(String str) {
        super(str);
        this.d = "";
        this.g = null;
        this.h = "";
        this.j = "";
        this.k = "new";
        this.l = null;
        this.m = "";
        this.e = true;
        this.f = String.valueOf(AMapLocationClientOption.GeoLanguage.DEFAULT);
        this.n = "";
        this.o = null;
        this.p = false;
    }

    public final String a() {
        return this.g;
    }

    public final void a(String str) {
        this.g = str;
    }

    public final void a(JSONObject jSONObject) {
        this.l = jSONObject;
    }

    public final void a(boolean z) {
        this.e = z;
    }

    public final String b() {
        return this.h;
    }

    public final void b(String str) {
        this.h = str;
    }

    public final void b(JSONObject jSONObject) {
        try {
            ei.a(this, jSONObject);
            this.k = jSONObject.optString("type", this.k);
            this.j = jSONObject.optString("retype", this.j);
            String strOptString = jSONObject.optString(C.CENC_TYPE_cens, this.n);
            if (!TextUtils.isEmpty(strOptString)) {
                for (String str : strOptString.split("\\*")) {
                    if (!TextUtils.isEmpty(str)) {
                        String[] strArrSplit = str.split(",");
                        setLongitude(eo.e(strArrSplit[0]));
                        setLatitude(eo.e(strArrSplit[1]));
                        setAccuracy(eo.g(strArrSplit[2]));
                        break;
                    }
                }
                this.n = strOptString;
            }
            this.d = jSONObject.optString("desc", this.d);
            c(jSONObject.optString("coord", String.valueOf(this.i)));
            this.m = jSONObject.optString("mcell", this.m);
            this.e = jSONObject.optBoolean("isReversegeo", this.e);
            this.f = jSONObject.optString("geoLanguage", this.f);
            if (eo.a(jSONObject, "poiid")) {
                setBuildingId(jSONObject.optString("poiid"));
            }
            if (eo.a(jSONObject, DTransferConstants.PID)) {
                setBuildingId(jSONObject.optString(DTransferConstants.PID));
            }
            if (eo.a(jSONObject, "floor")) {
                setFloor(jSONObject.optString("floor"));
            }
            if (eo.a(jSONObject, "flr")) {
                setFloor(jSONObject.optString("flr"));
            }
        } catch (Throwable th) {
            ei.a(th, "AmapLoc", "AmapLoc");
        }
    }

    public final void b(boolean z) {
        this.p = z;
    }

    public final int c() {
        return this.i;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    public final void c(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            i = -1;
        } else if (str.equals("0")) {
            i = 0;
        } else if (str.equals("1")) {
            i = 1;
        } else {
            i = -1;
        }
        this.i = i;
        super.setCoordType(this.i == 0 ? AMapLocation.COORD_TYPE_WGS84 : AMapLocation.COORD_TYPE_GCJ02);
    }

    public final String d() {
        return this.j;
    }

    public final void d(String str) {
        this.j = str;
    }

    public final String e() {
        return this.k;
    }

    public final void e(String str) {
        this.k = str;
    }

    public final JSONObject f() {
        return this.l;
    }

    public final void f(String str) {
        this.f = str;
    }

    public final String g() {
        return this.m;
    }

    public final void g(String str) {
        this.d = str;
    }

    public final dr h() {
        String str = this.m;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split(",");
        if (strArrSplit.length != 3) {
            return null;
        }
        dr drVar = new dr("");
        drVar.setProvider(getProvider());
        drVar.setLongitude(eo.e(strArrSplit[0]));
        drVar.setLatitude(eo.e(strArrSplit[1]));
        drVar.setAccuracy(eo.f(strArrSplit[2]));
        drVar.setCityCode(getCityCode());
        drVar.setAdCode(getAdCode());
        drVar.setCountry(getCountry());
        drVar.setProvince(getProvince());
        drVar.setCity(getCity());
        drVar.setTime(getTime());
        drVar.k = this.k;
        drVar.c(String.valueOf(this.i));
        if (eo.a(drVar)) {
            return drVar;
        }
        return null;
    }

    public final void h(String str) {
        this.o = str;
    }

    public final boolean i() {
        return this.e;
    }

    public final String j() {
        return this.f;
    }

    public final String k() {
        return this.o;
    }

    public final boolean l() {
        return this.p;
    }

    @Override // com.amap.api.location.AMapLocation
    public final JSONObject toJson(int i) {
        try {
            JSONObject json = super.toJson(i);
            if (i == 1) {
                json.put("retype", this.j);
                json.put(C.CENC_TYPE_cens, this.n);
                json.put("coord", this.i);
                json.put("mcell", this.m);
                json.put("desc", this.d);
                json.put(IntegrityManager.INTEGRITY_TYPE_ADDRESS, getAddress());
                if (this.l != null && eo.a(json, "offpct")) {
                    json.put("offpct", this.l.getString("offpct"));
                }
            } else if (i != 2 && i != 3) {
                return json;
            }
            json.put("type", this.k);
            json.put("isReversegeo", this.e);
            json.put("geoLanguage", this.f);
            return json;
        } catch (Throwable th) {
            ei.a(th, "AmapLoc", "toStr");
            return null;
        }
    }

    @Override // com.amap.api.location.AMapLocation
    public final String toStr() {
        return toStr(1);
    }

    @Override // com.amap.api.location.AMapLocation
    public final String toStr(int i) {
        JSONObject json;
        try {
            json = toJson(i);
            json.put("nb", this.o);
        } catch (Throwable th) {
            ei.a(th, "AMapLocation", "toStr part2");
            json = null;
        }
        if (json == null) {
            return null;
        }
        return json.toString();
    }
}
