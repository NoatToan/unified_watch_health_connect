package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.services.auto.AutoTChargeStationResult;
import com.amap.api.services.auto.AutoTSearch;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class bts extends kts<AutoTSearch.Query, AutoTChargeStationResult> {
    public zss y;

    public bts(Context context, AutoTSearch.Query query) {
        super(context, query);
        this.y = null;
        this.y = new zss(context);
    }

    public static AutoTChargeStationResult t(String str) throws AMapException {
        try {
            return ets.a(new JSONObject(str));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // defpackage.kts, com.amap.api.col.p0003sl.u
    public final /* synthetic */ Object e(String str) throws AMapException {
        return t(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        try {
            String strC = gts.c(new HashMap(), ((AutoTSearch.Query) this.s).getAccessKey());
            return wts.g() + "/ws/mapapi/poi/infolite/auto?" + strC + "&Signature=" + gts.b("POST", strC, ((AutoTSearch.Query) this.s).getSecretKey());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kts
    public final String q() {
        StringBuilder sb = new StringBuilder(this.y.a());
        String adCode = ((AutoTSearch.Query) this.s).getAdCode();
        if (!TextUtils.isEmpty(adCode)) {
            sb.append("&adcode=");
            sb.append(kts.b(adCode));
        }
        String city = ((AutoTSearch.Query) this.s).getCity();
        if (!TextUtils.isEmpty(city)) {
            sb.append("&city=");
            sb.append(kts.b(city));
        }
        String dataType = ((AutoTSearch.Query) this.s).getDataType();
        if (!TextUtils.isEmpty(dataType)) {
            sb.append("&data_type=");
            sb.append(kts.b(dataType));
        }
        String geoObj = ((AutoTSearch.Query) this.s).getGeoObj();
        if (!TextUtils.isEmpty(geoObj)) {
            sb.append("&geoobj=");
            sb.append(kts.b(geoObj));
        }
        String keywords = ((AutoTSearch.Query) this.s).getKeywords();
        if (!TextUtils.isEmpty(keywords)) {
            sb.append("&keywords=");
            sb.append(kts.b(keywords));
        }
        sb.append("&pagenum=");
        sb.append(((AutoTSearch.Query) this.s).getPageNum());
        sb.append("&pagesize=");
        sb.append(((AutoTSearch.Query) this.s).getPageSize());
        sb.append("&qii=");
        sb.append(((AutoTSearch.Query) this.s).isQii());
        String queryType = ((AutoTSearch.Query) this.s).getQueryType();
        if (!TextUtils.isEmpty(queryType)) {
            sb.append("&query_type=");
            sb.append(kts.b(queryType));
        }
        sb.append("&range=");
        sb.append(((AutoTSearch.Query) this.s).getRange());
        LatLonPoint latLonPoint = ((AutoTSearch.Query) this.s).getLatLonPoint();
        if (latLonPoint != null) {
            sb.append("&longitude=");
            sb.append(latLonPoint.getLongitude());
            sb.append("&latitude=");
            sb.append(latLonPoint.getLatitude());
        }
        String userLoc = ((AutoTSearch.Query) this.s).getUserLoc();
        if (!TextUtils.isEmpty(userLoc)) {
            sb.append("&user_loc=");
            sb.append(kts.b(userLoc));
        }
        String userCity = ((AutoTSearch.Query) this.s).getUserCity();
        if (!TextUtils.isEmpty(userCity)) {
            sb.append("&user_city=");
            sb.append(kts.b(userCity));
        }
        AutoTSearch.FilterBox filterBox = ((AutoTSearch.Query) this.s).getFilterBox();
        if (filterBox != null) {
            String retainState = filterBox.getRetainState();
            if (!TextUtils.isEmpty(retainState)) {
                sb.append("&retain_state=");
                sb.append(kts.b(retainState));
            }
            String checkedLevel = filterBox.getCheckedLevel();
            if (!TextUtils.isEmpty(checkedLevel)) {
                sb.append("&checked_level=");
                sb.append(kts.b(checkedLevel));
            }
            String classifyV2Data = filterBox.getClassifyV2Data();
            if (!TextUtils.isEmpty(classifyV2Data)) {
                sb.append("&classify_v2_data=");
                sb.append(kts.b(classifyV2Data));
            }
            String classifyV2Level2Data = filterBox.getClassifyV2Level2Data();
            if (!TextUtils.isEmpty(classifyV2Level2Data)) {
                sb.append("&classify_v2_level2_data=");
                sb.append(kts.b(classifyV2Level2Data));
            }
            String classifyV2Level3Data = filterBox.getClassifyV2Level3Data();
            if (!TextUtils.isEmpty(classifyV2Level3Data)) {
                sb.append("&classify_v2_level3_data=");
                sb.append(kts.b(classifyV2Level3Data));
            }
        }
        return sb.toString();
    }
}
