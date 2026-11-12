package com.amap.api.col.p0003sl;

import android.content.Context;
import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.amap.api.services.cloud.CloudItem;
import com.amap.api.services.cloud.CloudItemDetail;
import com.amap.api.services.cloud.CloudResult;
import com.amap.api.services.cloud.CloudSearch;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.district.DistrictSearchQuery;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.pluginachievement.manager.db.IAchieveDBMgr;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import com.huawei.watchface.videoedit.gles.Constant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public final class fs extends fq<CloudSearch.Query, CloudResult> {
    private int k;

    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    protected final String c() {
        return null;
    }

    public fs(Context context, CloudSearch.Query query) {
        super(context, query);
        this.k = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        String str = ft.e() + "/datasearch";
        String shape = ((CloudSearch.Query) this.f2534b).getBound().getShape();
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public CloudResult a(String str) throws AMapException {
        ArrayList<CloudItem> arrayListD = null;
        if (str == null || str.equals("")) {
            return CloudResult.createPagedResult((CloudSearch.Query) this.f2534b, this.k, ((CloudSearch.Query) this.f2534b).getBound(), ((CloudSearch.Query) this.f2534b).getPageSize(), null);
        }
        try {
            arrayListD = d(new JSONObject(str));
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return CloudResult.createPagedResult((CloudSearch.Query) this.f2534b, this.k, ((CloudSearch.Query) this.f2534b).getBound(), ((CloudSearch.Query) this.f2534b).getPageSize(), arrayListD);
    }

    private ArrayList<CloudItem> d(JSONObject jSONObject) throws JSONException {
        ArrayList<CloudItem> arrayList = new ArrayList<>();
        JSONArray jSONArrayA = a(jSONObject);
        if (jSONArrayA != null) {
            this.k = b(jSONObject);
            for (int i = 0; i < jSONArrayA.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayA.optJSONObject(i);
                CloudItemDetail cloudItemDetailC = c(jSONObjectOptJSONObject);
                a(cloudItemDetailC, jSONObjectOptJSONObject);
                arrayList.add(cloudItemDetailC);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl, com.amap.api.col.p0003sl.la
    public final Map<String, String> getParams() {
        Hashtable hashtable = new Hashtable(16);
        hashtable.put(MedalConstants.EVENT_KEY, il.f(this.i));
        hashtable.put("output", "json");
        if (((CloudSearch.Query) this.f2534b).getBound() != null) {
            if (((CloudSearch.Query) this.f2534b).getBound().getShape().equals("Bound")) {
                hashtable.put(TtmlNode.CENTER, fu.a(((CloudSearch.Query) this.f2534b).getBound().getCenter().getLongitude()) + "," + fu.a(((CloudSearch.Query) this.f2534b).getBound().getCenter().getLatitude()));
                StringBuilder sb = new StringBuilder();
                sb.append(((CloudSearch.Query) this.f2534b).getBound().getRange());
                hashtable.put("radius", sb.toString());
            } else if (((CloudSearch.Query) this.f2534b).getBound().getShape().equals("Rectangle")) {
                LatLonPoint lowerLeft = ((CloudSearch.Query) this.f2534b).getBound().getLowerLeft();
                LatLonPoint upperRight = ((CloudSearch.Query) this.f2534b).getBound().getUpperRight();
                double dA = fu.a(lowerLeft.getLatitude());
                double dA2 = fu.a(lowerLeft.getLongitude());
                double dA3 = fu.a(upperRight.getLatitude());
                hashtable.put("polygon", dA2 + "," + dA + ";" + fu.a(upperRight.getLongitude()) + "," + dA3);
            } else if (((CloudSearch.Query) this.f2534b).getBound().getShape().equals("Polygon")) {
                List<LatLonPoint> polyGonList = ((CloudSearch.Query) this.f2534b).getBound().getPolyGonList();
                if (polyGonList != null && polyGonList.size() > 0) {
                    hashtable.put("polygon", fu.a(polyGonList, ";"));
                }
            } else if (((CloudSearch.Query) this.f2534b).getBound().getShape().equals(CloudSearch.SearchBound.LOCAL_SHAPE)) {
                hashtable.put(DistrictSearchQuery.KEYWORDS_CITY, ((CloudSearch.Query) this.f2534b).getBound().getCity());
            }
        }
        hashtable.put("layerId", ((CloudSearch.Query) this.f2534b).getTableID());
        if (!fu.a(f())) {
            hashtable.put("sortrule", f());
        }
        String strG = g();
        if (!fu.a(strG)) {
            hashtable.put(Constant.FILTER, strG);
        }
        String queryString = ((CloudSearch.Query) this.f2534b).getQueryString();
        if (queryString != null && !"".equals(queryString)) {
            hashtable.put("keywords", queryString);
        } else {
            hashtable.put("keywords", "");
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((CloudSearch.Query) this.f2534b).getPageSize());
        hashtable.put(IAchieveDBMgr.PARAM_PAGE_SIZE, sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(((CloudSearch.Query) this.f2534b).getPageNum());
        hashtable.put("pageNum", sb3.toString());
        String strA = io.a();
        String strA2 = io.a(this.i, strA, a(hashtable));
        hashtable.put("ts", strA);
        hashtable.put("scode", strA2);
        return hashtable;
    }

    private static String d(String str) {
        return str != null ? str.replace(Constants.PARAM_SERVER_SPLIT, "%26%26") : str;
    }

    private static String e(String str) {
        return str != null ? str.replace("%26%26", Constants.PARAM_SERVER_SPLIT) : str;
    }

    private static String a(Map<String, String> map) {
        return f(b(map));
    }

    private static String f(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            str = d(str);
            String[] strArrSplit = str.split("&");
            Arrays.sort(strArrSplit);
            StringBuffer stringBuffer = new StringBuffer();
            for (String str2 : strArrSplit) {
                stringBuffer.append(str2);
                stringBuffer.append("&");
            }
            String strE = e(stringBuffer.toString());
            return strE.length() > 1 ? (String) strE.subSequence(0, strE.length() - 1) : str;
        } catch (Throwable th) {
            js.a(th, "ut", "sPa");
            return str;
        }
    }

    private static String b(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(entry.getKey());
            sb.append("=");
            sb.append(entry.getValue());
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private String f() {
        if (((CloudSearch.Query) this.f2534b).getSortingrules() != null) {
            return ((CloudSearch.Query) this.f2534b).getSortingrules().toString();
        }
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    private String g() {
        StringBuffer stringBuffer = new StringBuffer();
        String filterString = ((CloudSearch.Query) this.f2534b).getFilterString();
        String filterNumString = ((CloudSearch.Query) this.f2534b).getFilterNumString();
        stringBuffer.append(filterString);
        if (!fu.a(filterString) && !fu.a(filterNumString)) {
            stringBuffer.append(Constants.PARAM_SERVER_SPLIT);
        }
        stringBuffer.append(filterNumString);
        return stringBuffer.toString();
    }
}
