package defpackage;

import android.content.Context;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.nearby.NearbyInfo;
import com.amap.api.services.nearby.NearbySearch;
import com.amap.api.services.nearby.NearbySearchResult;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class rvs extends kts<NearbySearch.NearbyQuery, NearbySearchResult> {
    public Context y;
    public NearbySearch.NearbyQuery z;

    public rvs(Context context, NearbySearch.NearbyQuery nearbyQuery) {
        super(context, nearbyQuery);
        this.y = context;
        this.z = nearbyQuery;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return wts.e() + "/nearby/around";
    }

    @Override // defpackage.kts
    public final String q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=");
        stringBuffer.append(e0t.k(this.y));
        LatLonPoint centerPoint = this.z.getCenterPoint();
        if (centerPoint != null) {
            stringBuffer.append("&center=");
            stringBuffer.append(centerPoint.getLongitude());
            stringBuffer.append(",");
            stringBuffer.append(centerPoint.getLatitude());
        }
        stringBuffer.append("&radius=");
        stringBuffer.append(this.z.getRadius());
        stringBuffer.append("&limit=30");
        stringBuffer.append("&searchtype=");
        stringBuffer.append(this.z.getType());
        stringBuffer.append("&timerange=");
        stringBuffer.append(this.z.getTimeRange());
        return stringBuffer.toString();
    }

    @Override // defpackage.kts, com.amap.api.col.p0003sl.u
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final NearbySearchResult e(String str) throws AMapException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            boolean z = true;
            if (this.z.getType() != 1) {
                z = false;
            }
            ArrayList<NearbyInfo> arrayListX = fvs.x(jSONObject, z);
            NearbySearchResult nearbySearchResult = new NearbySearchResult();
            nearbySearchResult.setNearbyInfoList(arrayListX);
            return nearbySearchResult;
        } catch (JSONException e) {
            xts.i(e, "NearbySearchHandler", "paseJSON");
            return null;
        }
    }
}
