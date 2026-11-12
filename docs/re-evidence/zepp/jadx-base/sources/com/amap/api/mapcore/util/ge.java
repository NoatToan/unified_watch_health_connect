package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.Handler;
import com.amap.api.maps.model.LatLng;
import com.amap.api.trace.TraceLocation;
import com.xiaomi.hm.health.Constant;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ge extends gc<List<TraceLocation>, List<LatLng>> implements Runnable {
    private List<TraceLocation> j;
    private Handler k;
    private int l;
    private int m;
    private String n;

    public ge(Context context, Handler handler, List<TraceLocation> list, String str, int i, int i2) {
        super(context, list);
        this.k = null;
        this.l = 0;
        this.m = 0;
        this.j = list;
        this.k = handler;
        this.m = i;
        this.l = i2;
        this.n = str;
    }

    private static List<LatLng> b(String str) throws ga {
        JSONArray jSONArrayOptJSONArray;
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("data") && (jSONArrayOptJSONArray = jSONObject.optJSONObject("data").optJSONArray("points")) != null && jSONArrayOptJSONArray.length() != 0) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    arrayList.add(new LatLng(Double.parseDouble(jSONObjectOptJSONObject.optString("y")), Double.parseDouble(jSONObjectOptJSONObject.optString("x"))));
                }
                return arrayList;
            }
            return arrayList;
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.mapcore.util.gc, com.amap.api.mapcore.util.gb
    public final /* synthetic */ Object a(String str) throws ga {
        return b(str);
    }

    @Override // com.amap.api.mapcore.util.gc, com.amap.api.mapcore.util.gb
    public final String d() {
        JSONArray jSONArray = new JSONArray();
        long j = 0;
        for (int i = 0; i < this.j.size(); i++) {
            TraceLocation traceLocation = this.j.get(i);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("x", traceLocation.getLongitude());
                jSONObject.put("y", traceLocation.getLatitude());
                jSONObject.put(Constant.PAI_KEY_AGE, (int) traceLocation.getBearing());
                long time = traceLocation.getTime();
                if (i == 0) {
                    if (time == 0) {
                        time = (System.currentTimeMillis() - 10000) / 1000;
                    }
                    jSONObject.put("tm", time / 1000);
                } else if (time != 0) {
                    long j2 = time - j;
                    if (j2 < 1000) {
                        jSONObject.put("tm", 1);
                    } else {
                        jSONObject.put("tm", j2 / 1000);
                    }
                } else {
                    jSONObject.put("tm", 1);
                }
                j = time;
                jSONObject.put("sp", (int) traceLocation.getSpeed());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            jSONArray.put(jSONObject);
        }
        ((gb) this).h = getURL() + com.alipay.sdk.m.s.a.l + jSONArray.toString();
        return jSONArray.toString();
    }

    @Override // com.amap.api.mapcore.util.ir
    public final String getIPV6URL() {
        return er.a(getURL());
    }

    @Override // com.amap.api.mapcore.util.ir
    public final String getURL() {
        String str = "key=" + gj.f(((gb) this).g);
        String strA = gm.a();
        return "http://restsdk.amap.com/v4/grasproad/driving?" + str + "&ts=".concat(String.valueOf(strA)) + "&scode=".concat(String.valueOf(gm.a(((gb) this).g, strA, str)));
    }

    @Override // com.amap.api.mapcore.util.ir
    public final boolean isSupportIPV6() {
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        new ArrayList();
        try {
            try {
                gg.a().a(this.n, this.l, e());
                gg.a().a(this.n).a(this.k);
            } catch (ga e) {
                gg.a();
                gg.a(this.k, this.m, e.a());
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
