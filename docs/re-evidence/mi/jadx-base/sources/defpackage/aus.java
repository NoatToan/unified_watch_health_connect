package defpackage;

import android.content.Context;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.district.DistrictResult;
import com.amap.api.services.district.DistrictSearchQuery;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class aus extends kts<DistrictSearchQuery, DistrictResult> {
    public aus(Context context, DistrictSearchQuery districtSearchQuery) {
        super(context, districtSearchQuery);
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return wts.b() + "/config/district?";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kts
    public final String q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("output=json");
        stringBuffer.append("&page=");
        stringBuffer.append(((DistrictSearchQuery) this.s).getPageNum());
        stringBuffer.append("&offset=");
        stringBuffer.append(((DistrictSearchQuery) this.s).getPageSize());
        if (((DistrictSearchQuery) this.s).isShowBoundary()) {
            stringBuffer.append("&extensions=all");
        } else {
            stringBuffer.append("&extensions=base");
        }
        if (((DistrictSearchQuery) this.s).checkKeyWords()) {
            String strB = kts.b(((DistrictSearchQuery) this.s).getKeywords());
            stringBuffer.append("&keywords=");
            stringBuffer.append(strB);
        }
        stringBuffer.append("&key=" + e0t.k(this.v));
        stringBuffer.append("&subdistrict=" + String.valueOf(((DistrictSearchQuery) this.s).getSubDistrict()));
        return stringBuffer.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kts, com.amap.api.col.p0003sl.u
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final DistrictResult e(String str) throws AMapException {
        ArrayList arrayList = new ArrayList();
        DistrictResult districtResult = new DistrictResult((DistrictSearchQuery) this.s, arrayList);
        try {
            JSONObject jSONObject = new JSONObject(str);
            districtResult.setPageCount(jSONObject.optInt("count"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("districts");
            if (jSONArrayOptJSONArray == null) {
                return districtResult;
            }
            fvs.I(jSONArrayOptJSONArray, arrayList, null);
        } catch (JSONException e) {
            xts.i(e, "DistrictServerHandler", "paseJSONJSONException");
        } catch (Exception e2) {
            xts.i(e2, "DistrictServerHandler", "paseJSONException");
        }
        return districtResult;
    }
}
