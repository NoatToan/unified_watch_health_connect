package com.amap.api.col.p0003sl;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.services.cloud.CloudItem;
import com.amap.api.services.cloud.CloudItemDetail;
import com.amap.api.services.cloud.CloudResult;
import com.amap.api.services.cloud.CloudSearch;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import defpackage.e0t;
import defpackage.g0t;
import defpackage.gv5;
import defpackage.j2t;
import defpackage.sts;
import defpackage.wts;
import defpackage.xts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class v extends sts<CloudSearch.Query, CloudResult> {
    public int y;

    public v(Context context, CloudSearch.Query query) {
        super(context, query);
        this.y = 0;
    }

    public static String C(String str) {
        return str != null ? str.replace("%26%26", "&&") : str;
    }

    public static String D(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            str = s(str);
            String[] strArrSplit = str.split(gv5.CONNECT_STR);
            Arrays.sort(strArrSplit);
            StringBuffer stringBuffer = new StringBuffer();
            for (String str2 : strArrSplit) {
                stringBuffer.append(str2);
                stringBuffer.append(gv5.CONNECT_STR);
            }
            String strC = C(stringBuffer.toString());
            if (strC.length() > 1) {
                return (String) strC.subSequence(0, strC.length() - 1);
            }
        } catch (Throwable th) {
            j2t.e(th, "ut", "sPa");
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private String g() {
        StringBuffer stringBuffer = new StringBuffer();
        String filterString = ((CloudSearch.Query) this.s).getFilterString();
        String filterNumString = ((CloudSearch.Query) this.s).getFilterNumString();
        stringBuffer.append(filterString);
        if (!xts.j(filterString) && !xts.j(filterNumString)) {
            stringBuffer.append("&&");
        }
        stringBuffer.append(filterNumString);
        return stringBuffer.toString();
    }

    public static String s(String str) {
        return str != null ? str.replace("&&", "%26%26") : str;
    }

    public static String y(Map<String, String> map) {
        return D(z(map));
    }

    public static String z(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append(gv5.CONNECT_STR);
            }
            sb.append(entry.getKey());
            sb.append("=");
            sb.append(entry.getValue());
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kts, com.amap.api.col.p0003sl.u
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final CloudResult e(String str) throws AMapException {
        ArrayList<CloudItem> arrayListB = null;
        if (str == null || str.equals("")) {
            T t = this.s;
            return CloudResult.createPagedResult((CloudSearch.Query) t, this.y, ((CloudSearch.Query) t).getBound(), ((CloudSearch.Query) this.s).getPageSize(), null);
        }
        try {
            arrayListB = B(new JSONObject(str));
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        T t2 = this.s;
        return CloudResult.createPagedResult((CloudSearch.Query) t2, this.y, ((CloudSearch.Query) t2).getBound(), ((CloudSearch.Query) this.s).getPageSize(), arrayListB);
    }

    public final ArrayList<CloudItem> B(JSONObject jSONObject) throws JSONException {
        ArrayList<CloudItem> arrayList = new ArrayList<>();
        JSONArray jSONArrayT = sts.t(jSONObject);
        if (jSONArrayT == null) {
            return arrayList;
        }
        this.y = sts.v(jSONObject);
        for (int i = 0; i < jSONArrayT.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayT.optJSONObject(i);
            CloudItemDetail cloudItemDetailW = sts.w(jSONObjectOptJSONObject);
            sts.u(cloudItemDetailW, jSONObjectOptJSONObject);
            arrayList.add(cloudItemDetailW);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kts, com.amap.api.col.p0003sl.la
    public final Map<String, String> getParams() {
        Hashtable hashtable = new Hashtable(16);
        hashtable.put("key", e0t.k(this.v));
        hashtable.put("output", "json");
        if (((CloudSearch.Query) this.s).getBound() != null) {
            if (((CloudSearch.Query) this.s).getBound().getShape().equals("Bound")) {
                hashtable.put("center", xts.a(((CloudSearch.Query) this.s).getBound().getCenter().getLongitude()) + "," + xts.a(((CloudSearch.Query) this.s).getBound().getCenter().getLatitude()));
                StringBuilder sb = new StringBuilder();
                sb.append(((CloudSearch.Query) this.s).getBound().getRange());
                hashtable.put("radius", sb.toString());
            } else if (((CloudSearch.Query) this.s).getBound().getShape().equals("Rectangle")) {
                LatLonPoint lowerLeft = ((CloudSearch.Query) this.s).getBound().getLowerLeft();
                LatLonPoint upperRight = ((CloudSearch.Query) this.s).getBound().getUpperRight();
                double dA = xts.a(lowerLeft.getLatitude());
                double dA2 = xts.a(lowerLeft.getLongitude());
                double dA3 = xts.a(upperRight.getLatitude());
                hashtable.put("polygon", dA2 + "," + dA + ";" + xts.a(upperRight.getLongitude()) + "," + dA3);
            } else if (((CloudSearch.Query) this.s).getBound().getShape().equals("Polygon")) {
                List<LatLonPoint> polyGonList = ((CloudSearch.Query) this.s).getBound().getPolyGonList();
                if (polyGonList != null && polyGonList.size() > 0) {
                    hashtable.put("polygon", xts.g(polyGonList, ";"));
                }
            } else if (((CloudSearch.Query) this.s).getBound().getShape().equals(CloudSearch.SearchBound.LOCAL_SHAPE)) {
                hashtable.put("city", ((CloudSearch.Query) this.s).getBound().getCity());
            }
        }
        hashtable.put("layerId", ((CloudSearch.Query) this.s).getTableID());
        if (!xts.j(o())) {
            hashtable.put("sortrule", o());
        }
        String strG = g();
        if (!xts.j(strG)) {
            hashtable.put("filter", strG);
        }
        String queryString = ((CloudSearch.Query) this.s).getQueryString();
        if (queryString == null || "".equals(queryString)) {
            hashtable.put("keywords", "");
        } else {
            hashtable.put("keywords", queryString);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((CloudSearch.Query) this.s).getPageSize());
        hashtable.put("pageSize", sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(((CloudSearch.Query) this.s).getPageNum());
        hashtable.put("pageNum", sb3.toString());
        String strA = g0t.a();
        String strC = g0t.c(this.v, strA, y(hashtable));
        hashtable.put(DeviceTagInterface.TAG_DATA_START, strA);
        hashtable.put("scode", strC);
        return hashtable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        String str = wts.f() + "/datasearch";
        String shape = ((CloudSearch.Query) this.s).getBound().getShape();
        if (shape.equals("Bound")) {
            return str + "/around";
        }
        if (shape.equals("Polygon") || shape.equals("Rectangle")) {
            return str + "/polygon";
        }
        if (!shape.equals(CloudSearch.SearchBound.LOCAL_SHAPE)) {
            return str;
        }
        return str + "/local";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String o() {
        return ((CloudSearch.Query) this.s).getSortingrules() != null ? ((CloudSearch.Query) this.s).getSortingrules().toString() : "";
    }

    @Override // defpackage.kts
    public final String q() {
        return null;
    }
}
