package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.hms.ads.jsb.inner.data.H5Ad;
import com.huawei.hms.ads.jsb.inner.data.JsbCallBackData;
import com.huawei.openalliance.ad.beans.inner.AdContentData;
import com.huawei.openalliance.ad.beans.parameter.RequestOptions;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.inter.NativeAdLoader;
import com.huawei.openalliance.ad.inter.data.INativeAd;
import com.huawei.openalliance.ad.inter.listeners.ContentIdListener;
import com.huawei.openalliance.ad.inter.listeners.NativeAdListener;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class x extends i {

    public static class a implements NativeAdListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f21494a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Context f21495b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f21496c;
        private fz d;
        private fz e;
        private RemoteCallResultCallback<String> f;
        private boolean g;
        private int h;
        private int i;

        @Override // com.huawei.openalliance.ad.inter.listeners.NativeAdListener
        public void onAdsLoaded(Map<String, List<INativeAd>> map) {
            if (com.huawei.openalliance.ad.utils.br.a(map)) {
                hw.b("JsbReqNativeAd", " ads map is empty.");
                j.a(this.f, this.f21496c, 1005, null, true);
                return;
            }
            hw.b("JsbReqNativeAd", "onAdsLoaded, is multi slot id: %s", Boolean.valueOf(this.g));
            int i = this.i;
            if (i == 2) {
                a(map);
            } else {
                if (i != 3) {
                    return;
                }
                b(map);
            }
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.NativeAdListener
        public void onAdFailed(int i) {
            j.a(this.f, this.f21496c, bp.a(i), null, true);
        }

        private void b(Map<String, List<INativeAd>> map) {
            Object pair;
            List<INativeAd> listA = a(map, this.f21494a);
            ArrayList arrayList = new ArrayList();
            a(listA, com.huawei.openalliance.ad.utils.cw.b(this.f21495b), arrayList);
            if (this.g) {
                HashMap map2 = new HashMap();
                a(map, map2);
                pair = new Pair(Integer.valueOf(this.h), map2);
            } else {
                pair = arrayList;
            }
            if (arrayList.size() > 0) {
                j.a(this.f, this.f21496c, 1000, new JsbCallBackData(pair, true, null));
            } else {
                hw.b("JsbReqNativeAd", " ads map is empty.");
                j.a(this.f, this.f21496c, 1005, null, true);
            }
        }

        private <T> void a(Map<String, List<INativeAd>> map, Map<String, List<T>> map2) {
            if (com.huawei.openalliance.ad.utils.br.a(map)) {
                return;
            }
            for (Map.Entry<String, List<INativeAd>> entry : map.entrySet()) {
                if (!com.huawei.openalliance.ad.utils.bm.a(entry.getValue())) {
                    List<T> arrayList = new ArrayList<>();
                    for (INativeAd iNativeAd : entry.getValue()) {
                        if (iNativeAd != null) {
                            int i = this.i;
                            if (i == 3) {
                                arrayList.add(AdContentData.a((com.huawei.openalliance.ad.inter.data.e) iNativeAd));
                            } else if (i == 2) {
                                arrayList.add(new H5Ad((com.huawei.openalliance.ad.inter.data.e) iNativeAd));
                            }
                        }
                    }
                    map2.put(entry.getKey(), arrayList);
                }
            }
        }

        private void a(Map<String, List<INativeAd>> map) {
            String strB;
            List<INativeAd> listA = a(map, this.f21494a);
            ArrayList arrayList = new ArrayList();
            a(listA, com.huawei.openalliance.ad.utils.cw.b(this.f21495b), arrayList);
            if (this.g) {
                HashMap map2 = new HashMap();
                a(map, map2);
                strB = com.huawei.openalliance.ad.utils.bk.b(new Pair(Integer.valueOf(this.h), map2));
            } else {
                strB = com.huawei.openalliance.ad.utils.bk.b(arrayList);
            }
            if (arrayList.size() > 0) {
                j.a(this.f, this.f21496c, 1000, new JsbCallBackData(strB, true, null));
            } else {
                hw.b("JsbReqNativeAd", " ads map is empty.");
                j.a(this.f, this.f21496c, 1005, null, true);
            }
        }

        private <T> void a(List<INativeAd> list, byte[] bArr, List<T> list2) {
            if (com.huawei.openalliance.ad.utils.bm.a(list)) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (INativeAd iNativeAd : list) {
                if (iNativeAd != null) {
                    com.huawei.openalliance.ad.inter.data.e eVar = (com.huawei.openalliance.ad.inter.data.e) iNativeAd;
                    ContentRecord contentRecordA = pl.a(eVar);
                    contentRecordA.a(bArr);
                    int i = this.i;
                    if (i == 3) {
                        list2.add(AdContentData.a(eVar));
                        a(contentRecordA);
                    } else if (i == 2) {
                        list2.add(new H5Ad(eVar));
                        arrayList.add(contentRecordA);
                    }
                }
            }
            if (this.i == 2) {
                this.d.a(arrayList);
            }
        }

        private void a(ContentRecord contentRecord) {
            if (contentRecord == null || TextUtils.isEmpty(contentRecord.o()) || TextUtils.isEmpty(contentRecord.n())) {
                return;
            }
            hw.b("JsbReqNativeAd", "insertOrUpdateContent, uniqueId: %s", contentRecord.ac());
            if (contentRecord.aQ() != 3) {
                if (this.d.a(contentRecord.o(), contentRecord.n(), contentRecord.ac()) == null) {
                    contentRecord.g(com.huawei.openalliance.ad.utils.as.c());
                }
                this.d.b(contentRecord);
            } else {
                if (TextUtils.isEmpty(contentRecord.aP())) {
                    return;
                }
                if (this.e.a(contentRecord.o(), contentRecord.aP(), contentRecord.n(), contentRecord.ac()) == null) {
                    contentRecord.g(com.huawei.openalliance.ad.utils.as.c());
                    hw.a("JsbReqNativeAd", "insertContent");
                }
                this.e.c(contentRecord);
            }
        }

        private List<INativeAd> a(Map<String, List<INativeAd>> map, String str) {
            if (com.huawei.openalliance.ad.utils.br.a(map)) {
                return null;
            }
            if (!TextUtils.isEmpty(str)) {
                return map.get(str);
            }
            ArrayList arrayList = new ArrayList();
            Iterator<Map.Entry<String, List<INativeAd>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().getValue());
            }
            return arrayList;
        }

        a(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback, String str2, int i) {
            this.g = false;
            this.h = 3;
            this.i = 2;
            this.f21494a = str;
            this.f21495b = context;
            this.f = remoteCallResultCallback;
            this.f21496c = str2;
            this.d = ew.a(context);
            this.e = ex.b(context);
            this.i = i;
        }

        a(Context context, RemoteCallResultCallback<String> remoteCallResultCallback, String str, int i, int i2) {
            this.g = false;
            this.h = 3;
            this.i = 2;
            this.f21495b = context;
            this.f21496c = str;
            this.f = remoteCallResultCallback;
            this.d = ew.a(context);
            this.e = ex.b(context);
            this.g = true;
            this.h = i;
            this.i = i2;
        }
    }

    @Override // com.huawei.openalliance.ad.i
    protected void b(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback) {
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("slotId");
        String strOptString2 = jSONObject.optString(JsbMapKeyNames.H5_MEDIA_CONTENT);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(JsbMapKeyNames.H5_CREATIVE_TYPES);
        int iOptInt = jSONObject.optInt(JsbMapKeyNames.JSSDK_VER, 2);
        String strOptString3 = jSONObject.optString(JsbMapKeyNames.JSSDK_VERSION);
        int iOptInt2 = jSONObject.optInt(JsbMapKeyNames.H5_SMART_BANNER, -111111);
        int iOptInt3 = jSONObject.optInt(JsbMapKeyNames.H5_PHY_WIDTH, -111111);
        int iOptInt4 = jSONObject.optInt(JsbMapKeyNames.H5_PHY_HEIGHT, -111111);
        int iOptInt5 = jSONObject.optInt(JsbMapKeyNames.H5_BANNER_REFRESH_FLAG, -111111);
        int iOptInt6 = jSONObject.optInt("adType", 3);
        int iOptInt7 = jSONObject.optInt("deviceType", 4);
        int iOptInt8 = jSONObject.optInt("maxCount", 0);
        boolean zOptBoolean = jSONObject.optBoolean(JsbMapKeyNames.H5_RETURN_VIDEOAD, true);
        boolean zOptBoolean2 = jSONObject.optBoolean("directCacheVideo", false);
        boolean zOptBoolean3 = jSONObject.optBoolean(JsbMapKeyNames.SUPPORT_TEMPLATE_AD, false);
        RequestOptions requestOptionsC = c(context, str);
        NativeAdLoader nativeAdLoader = new NativeAdLoader(context, new String[]{strOptString}, iOptInt6, b(jSONObject.optJSONArray(JsbMapKeyNames.H5_AD_CACHEIDS)));
        nativeAdLoader.setRequestOptions(requestOptionsC);
        nativeAdLoader.setContentBundle(c(strOptString2));
        nativeAdLoader.setDetailedCreativeType(a(jSONArrayOptJSONArray));
        nativeAdLoader.enableDirectReturnVideoAd(zOptBoolean);
        nativeAdLoader.enableDirectCacheVideo(zOptBoolean2);
        if (iOptInt5 != -111111) {
            nativeAdLoader.a(Integer.valueOf(iOptInt5));
        }
        if (iOptInt3 != -111111) {
            nativeAdLoader.setAdWidth(Integer.valueOf(iOptInt3));
        }
        if (iOptInt4 != -111111) {
            nativeAdLoader.setAdHeight(Integer.valueOf(iOptInt4));
        }
        if (iOptInt2 != -111111) {
            nativeAdLoader.setIsSmart(Integer.valueOf(iOptInt2));
        }
        if (iOptInt8 > 0) {
            nativeAdLoader.setMaxAdNumbers(iOptInt8);
        }
        nativeAdLoader.setContentIdListener(new b(remoteCallResultCallback, this.f19295a));
        nativeAdLoader.setListener(new a(context, strOptString, remoteCallResultCallback, this.f19295a, iOptInt));
        nativeAdLoader.b((Integer) 3);
        nativeAdLoader.setLocation(g(str));
        nativeAdLoader.setSupportTptAd(zOptBoolean3);
        nativeAdLoader.setJssdkVersion(strOptString3);
        nativeAdLoader.loadAds(iOptInt7, false);
    }

    static class b implements ContentIdListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f21497a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private RemoteCallResultCallback<String> f21498b;

        @Override // com.huawei.openalliance.ad.inter.listeners.ContentIdListener
        public void a(List<String> list) {
            if (list == null || list.size() <= 0) {
                return;
            }
            j.a(this.f21498b, this.f21497a, 1000, new JsbCallBackData(com.huawei.openalliance.ad.utils.bk.b(list), false, "native.cb.invalidcontentid"));
        }

        b(RemoteCallResultCallback<String> remoteCallResultCallback, String str) {
            this.f21498b = remoteCallResultCallback;
            this.f21497a = str;
        }
    }

    private List<String> b(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String strOptString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(strOptString)) {
                    arrayList.add(strOptString);
                }
            }
        }
        return arrayList;
    }

    private List<Integer> a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                int iOptInt = jSONArray.optInt(i, -111111);
                if (iOptInt != -111111) {
                    arrayList.add(Integer.valueOf(iOptInt));
                }
            }
        }
        return arrayList;
    }

    public x() {
        super("pps.native.request");
    }
}
