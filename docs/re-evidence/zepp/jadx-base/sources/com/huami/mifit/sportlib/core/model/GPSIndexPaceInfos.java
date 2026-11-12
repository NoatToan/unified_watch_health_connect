package com.huami.mifit.sportlib.core.model;

import android.util.SparseArray;
import com.huami.mifit.sportlib.logkit.LogKit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class GPSIndexPaceInfos {
    private static final String c = "GPSIndexPaceInfos";
    private SparseArray<GPSIndexPace> a = new SparseArray<>();
    private SparseArray<GPSIndexPace> b = new SparseArray<>();

    private JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < this.a.size(); i++) {
            try {
                jSONArray.put(this.a.get(this.a.keyAt(i)).toJson());
            } catch (Exception e) {
                LogKit.w2f(c, "Exception:" + e.getMessage());
            }
        }
        jSONObject.put("KM", jSONArray);
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            jSONArray2.put(this.b.get(this.b.keyAt(i2)).toJson());
        }
        jSONObject.put("MILE", jSONArray2);
        return jSONObject;
    }

    public void add(int i, GPSIndexPace gPSIndexPace) {
        add(i, gPSIndexPace, true);
    }

    public void fromJson(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("KM");
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("MILE");
            float dis = 0.0f;
            if (jSONArrayOptJSONArray != null) {
                float dis2 = 0.0f;
                int ct = 0;
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    String string = jSONArrayOptJSONArray.getString(i);
                    GPSIndexPace gPSIndexPace = new GPSIndexPace();
                    gPSIndexPace.fromJson(string);
                    dis2 += gPSIndexPace.getDis();
                    ct += gPSIndexPace.getCt();
                    gPSIndexPace.saveTotal(dis2, ct);
                    this.a.put((int) gPSIndexPace.getDis(), gPSIndexPace);
                }
            }
            if (jSONArrayOptJSONArray2 != null) {
                int ct2 = 0;
                for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                    String string2 = jSONArrayOptJSONArray2.getString(i2);
                    GPSIndexPace gPSIndexPace2 = new GPSIndexPace();
                    gPSIndexPace2.fromJson(string2);
                    dis += gPSIndexPace2.getDis();
                    ct2 += gPSIndexPace2.getCt();
                    gPSIndexPace2.saveTotal(dis, ct2);
                    this.b.put((int) gPSIndexPace2.getDis(), gPSIndexPace2);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public GPSIndexPace get(int i) {
        return get(i, true);
    }

    public String toString() {
        return a().toString();
    }

    public void add(int i, GPSIndexPace gPSIndexPace, boolean z) {
        if (z) {
            this.a.put(i, gPSIndexPace);
        } else {
            this.b.put(i, gPSIndexPace);
        }
    }

    public GPSIndexPace get(int i, boolean z) {
        return (z ? this.a : this.b).get(i);
    }
}
