package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.hms.ads.jsb.inner.data.H5Ad;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.inter.PlacementAdLoader;
import com.huawei.openalliance.ad.inter.data.IPlacementAd;
import com.huawei.openalliance.ad.inter.listeners.PlacementAdListener;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class y extends i {

    public static class a implements PlacementAdListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f21499a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Context f21500b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f21501c;
        private fz d;
        private RemoteCallResultCallback<String> e;

        @Override // com.huawei.openalliance.ad.inter.listeners.PlacementAdListener
        public void onAdsLoaded(Map<String, List<IPlacementAd>> map) {
            if (map == null || map.size() <= 0) {
                hw.b("JsbReqPlacementAd", " ads map is empty.");
                j.a(this.e, this.f21501c, 1005, null, true);
                return;
            }
            List<H5Ad> listA = a(map.get(this.f21499a), com.huawei.openalliance.ad.utils.cw.b(this.f21500b));
            if (listA.size() > 0) {
                j.a(this.e, this.f21501c, 1000, com.huawei.openalliance.ad.utils.bk.b(listA), true);
            } else {
                hw.b("JsbReqPlacementAd", " ads map is empty.");
                j.a(this.e, this.f21501c, 1005, null, true);
            }
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.PlacementAdListener
        public void onAdFailed(int i) {
            j.a(this.e, this.f21501c, bp.a(i), null, true);
        }

        private List<H5Ad> a(List<IPlacementAd> list, byte[] bArr) {
            ArrayList arrayList = new ArrayList(4);
            if (list != null && list.size() > 0) {
                for (IPlacementAd iPlacementAd : list) {
                    if (iPlacementAd != null) {
                        com.huawei.openalliance.ad.inter.data.h hVar = (com.huawei.openalliance.ad.inter.data.h) iPlacementAd;
                        arrayList.add(new H5Ad(hVar));
                        ContentRecord contentRecordA = pq.a(hVar);
                        contentRecordA.a(bArr);
                        this.d.a(contentRecordA);
                    }
                }
            }
            return arrayList;
        }

        a(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback, String str2) {
            this.f21499a = str;
            this.f21500b = context;
            this.e = remoteCallResultCallback;
            this.f21501c = str2;
            this.d = ew.a(context);
        }
    }

    @Override // com.huawei.openalliance.ad.i
    protected void b(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback) {
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("slotId");
        int iOptInt = jSONObject.optInt("deviceType", 4);
        int iOptInt2 = jSONObject.optInt("maxCount", 1);
        int iOptInt3 = jSONObject.optInt(JsbMapKeyNames.H5_PLACEMENT_REQUEST_MAX_DURATION, 300);
        PlacementAdLoader placementAdLoaderBuild = new PlacementAdLoader.Builder(context).setTest(false).setAdIds(new String[]{strOptString}).setRequestOptions(c(context, str)).setDeviceType(iOptInt).a((Integer) 3).setLocation(g(str)).build();
        if (iOptInt3 > 0) {
            placementAdLoaderBuild.loadAds(new a(context, strOptString, remoteCallResultCallback, this.f19295a));
        } else if (iOptInt2 > 0) {
            placementAdLoaderBuild.loadAds(new a(context, strOptString, remoteCallResultCallback, this.f19295a), iOptInt3);
        } else {
            placementAdLoaderBuild.loadAds(new a(context, strOptString, remoteCallResultCallback, this.f19295a), iOptInt3, iOptInt2);
        }
    }

    public y() {
        super("pps.placement.request");
    }
}
