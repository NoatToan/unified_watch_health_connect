package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.nearby.NearbyInfo;
import com.amap.api.services.nearby.NearbySearch;
import com.amap.api.services.nearby.NearbySearchResult;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public final class gh extends fm<NearbySearch.NearbyQuery, NearbySearchResult> {
    private Context k;
    private NearbySearch.NearbyQuery l;

    public gh(Context context, NearbySearch.NearbyQuery nearbyQuery) {
        super(context, nearbyQuery);
        this.k = context;
        this.l = nearbyQuery;
    }

    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    protected final String c() {
        StringBuffer stringBuffer = new StringBuffer("key=");
        stringBuffer.append(il.f(this.k));
        LatLonPoint centerPoint = this.l.getCenterPoint();
        if (centerPoint != null) {
            stringBuffer.append("&center=").append(centerPoint.getLongitude()).append(",").append(centerPoint.getLatitude());
        }
        stringBuffer.append("&radius=").append(this.l.getRadius());
        stringBuffer.append("&limit=30&searchtype=");
        stringBuffer.append(this.l.getType());
        stringBuffer.append("&timerange=").append(this.l.getTimeRange());
        return stringBuffer.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public NearbySearchResult a(String str) throws AMapException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            boolean z = true;
            if (this.l.getType() != 1) {
                z = false;
            }
            ArrayList<NearbyInfo> arrayListA = gc.a(jSONObject, z);
            NearbySearchResult nearbySearchResult = new NearbySearchResult();
            nearbySearchResult.setNearbyInfoList(arrayListA);
            return nearbySearchResult;
        } catch (JSONException e) {
            fu.a(e, "NearbySearchHandler", "paseJSON");
            return null;
        }
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return ft.d() + "/nearby/around";
    }
}
