package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.district.DistrictResult;
import com.amap.api.services.district.DistrictSearchQuery;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public final class fw extends fm<DistrictSearchQuery, DistrictResult> {
    public fw(Context context, DistrictSearchQuery districtSearchQuery) {
        super(context, districtSearchQuery);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    protected final String c() {
        StringBuffer stringBuffer = new StringBuffer("output=json&page=");
        stringBuffer.append(((DistrictSearchQuery) this.f2534b).getPageNum());
        stringBuffer.append("&offset=").append(((DistrictSearchQuery) this.f2534b).getPageSize());
        if (((DistrictSearchQuery) this.f2534b).isShowBoundary()) {
            stringBuffer.append("&extensions=all");
        } else {
            stringBuffer.append("&extensions=base");
        }
        if (((DistrictSearchQuery) this.f2534b).checkKeyWords()) {
            stringBuffer.append("&keywords=").append(b(((DistrictSearchQuery) this.f2534b).getKeywords()));
        }
        stringBuffer.append("&key=" + il.f(this.i));
        stringBuffer.append("&subdistrict=" + String.valueOf(((DistrictSearchQuery) this.f2534b).getSubDistrict()));
        return stringBuffer.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public DistrictResult a(String str) throws AMapException {
        ArrayList arrayList = new ArrayList();
        DistrictResult districtResult = new DistrictResult((DistrictSearchQuery) this.f2534b, arrayList);
        try {
            JSONObject jSONObject = new JSONObject(str);
            districtResult.setPageCount(jSONObject.optInt("count"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("districts");
            if (jSONArrayOptJSONArray != null) {
                gc.a(jSONArrayOptJSONArray, arrayList, null);
                return districtResult;
            }
        } catch (JSONException e) {
            fu.a(e, "DistrictServerHandler", "paseJSONJSONException");
        } catch (Exception e2) {
            fu.a(e2, "DistrictServerHandler", "paseJSONException");
        }
        return districtResult;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return ft.a() + "/config/district?";
    }
}
