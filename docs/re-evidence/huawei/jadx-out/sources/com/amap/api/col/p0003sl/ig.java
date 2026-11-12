package com.amap.api.col.p0003sl;

import android.content.Context;
import android.os.Handler;
import com.amap.api.maps.model.LatLng;
import com.amap.api.trace.TraceLocation;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public final class ig extends ie<List<TraceLocation>, List<LatLng>> implements Runnable {
    private List<TraceLocation> j;
    private Handler k;
    private int l;
    private int m;
    private String n;

    @Override // com.amap.api.col.p0003sl.la
    public final boolean isSupportIPV6() {
        return true;
    }

    @Override // com.amap.api.col.p0003sl.ie, com.amap.api.col.p0003sl.id
    protected final /* synthetic */ Object a(String str) throws ic {
        return b(str);
    }

    public ig(Context context, Handler handler, List<TraceLocation> list, String str, int i, int i2) {
        super(context, list);
        this.j = list;
        this.k = handler;
        this.m = i;
        this.l = i2;
        this.n = str;
    }

    @Override // com.amap.api.col.p0003sl.ie, com.amap.api.col.p0003sl.id
    protected final String c() {
        JSONArray jSONArray = new JSONArray();
        long j = 0;
        for (int i = 0; i < this.j.size(); i++) {
            TraceLocation traceLocation = this.j.get(i);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("x", traceLocation.getLongitude());
                jSONObject.put("y", traceLocation.getLatitude());
                jSONObject.put("ag", (int) traceLocation.getBearing());
                long time = traceLocation.getTime();
                if (i == 0) {
                    if (time == 0) {
                        time = (System.currentTimeMillis() - 10000) / 1000;
                    }
                    jSONObject.put("tm", time / 1000);
                } else if (time != 0) {
                    long j2 = time - j;
                    if (j2 >= 1000) {
                        jSONObject.put("tm", j2 / 1000);
                    } else {
                        jSONObject.put("tm", 1);
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
        this.h = getURL() + "&" + jSONArray.toString();
        return jSONArray.toString();
    }

    private static List<LatLng> b(String str) throws ic {
        JSONArray jSONArrayOptJSONArray;
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("data") && (jSONArrayOptJSONArray = jSONObject.optJSONObject("data").optJSONArray("points")) != null && jSONArrayOptJSONArray.length() != 0) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    arrayList.add(new LatLng(Double.parseDouble(jSONObjectOptJSONObject.optString("y")), Double.parseDouble(jSONObjectOptJSONObject.optString("x"))));
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        new ArrayList();
        try {
            try {
                ii.a().a(this.n, this.l, d());
                ii.a().a(this.n).a(this.k);
            } catch (ic e) {
                ii.a();
                ii.a(this.k, this.m, e.a());
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        String str = "key=" + il.f(this.g);
        String strA = io.a();
        return "http://restsdk.amap.com/v4/grasproad/driving?" + str + "&ts=".concat(String.valueOf(strA)) + "&scode=".concat(String.valueOf(io.a(this.g, strA, str)));
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getIPV6URL() {
        return eb.a(getURL());
    }
}
