package defpackage;

import android.content.Context;
import android.os.Handler;
import com.amap.api.col.p0003sl.ic;
import com.amap.api.maps.model.LatLng;
import com.amap.api.trace.TraceLocation;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzs extends uzs<List<TraceLocation>, List<LatLng>> implements Runnable {
    public String A;
    public List<TraceLocation> w;
    public Handler x;
    public int y;
    public int z;

    public zzs(Context context, Handler handler, List<TraceLocation> list, String str, int i, int i2) {
        super(context, list);
        this.w = list;
        this.x = handler;
        this.z = i;
        this.y = i2;
        this.A = str;
    }

    public static List<LatLng> p(String str) throws ic {
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

    @Override // defpackage.szs
    public final /* synthetic */ Object e(String str) throws ic {
        return p(str);
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getIPV6URL() {
        return zns.y(getURL());
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        String str = "key=" + e0t.k(this.t);
        String strA = g0t.a();
        return "http://restsdk.amap.com/v4/grasproad/driving?" + str + "&ts=".concat(String.valueOf(strA)) + "&scode=".concat(String.valueOf(g0t.c(this.t, strA, str)));
    }

    @Override // com.amap.api.col.p0003sl.la
    public final boolean isSupportIPV6() {
        return true;
    }

    @Override // defpackage.uzs
    public final String o() {
        JSONArray jSONArray = new JSONArray();
        long j = 0;
        for (int i = 0; i < this.w.size(); i++) {
            TraceLocation traceLocation = this.w.get(i);
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
        this.u = getURL() + gv5.CONNECT_STR + jSONArray.toString();
        return jSONArray.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
        new ArrayList();
        try {
            try {
                b0t.b().e(this.A, this.y, m());
                b0t.b().a(this.A).b(this.x);
            } catch (ic e) {
                b0t.b();
                b0t.c(this.x, this.z, e.a());
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
