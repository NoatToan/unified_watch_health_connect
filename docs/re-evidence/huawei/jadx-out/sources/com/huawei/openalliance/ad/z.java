package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.hms.ads.jsb.inner.data.H5Ad;
import com.huawei.openalliance.ad.beans.parameter.RequestOptions;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.db.bean.ContentTemplateRecord;
import com.huawei.openalliance.ad.inter.RewardAdLoader;
import com.huawei.openalliance.ad.inter.data.BaseRewardItem;
import com.huawei.openalliance.ad.inter.data.IRewardAd;
import com.huawei.openalliance.ad.inter.data.RewardItem;
import com.huawei.openalliance.ad.inter.listeners.RewardAdListener;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class z extends i {

    public static class a extends f implements RewardAdListener {
        private int i;

        @Override // com.huawei.openalliance.ad.inter.listeners.RewardAdListener
        public void onAdsLoaded(Map<String, List<IRewardAd>> map) {
            if (map == null || map.size() == 0) {
                hw.b("JsbReqRewardAd", " ads map is empty.");
                j.a(this.g, this.f18742c, 1005, null, true);
                return;
            }
            hw.b("JsbReqRewardAd", "onAdsLoaded, is multi slot id: %s", Boolean.valueOf(this.h));
            List<IRewardAd> listA = a(map, this.f18740a);
            ArrayList arrayList = new ArrayList();
            List<H5Ad> listA2 = a(arrayList, listA, com.huawei.openalliance.ad.utils.cw.b(this.f18741b), this.i);
            a(arrayList);
            String strB = this.h ? com.huawei.openalliance.ad.utils.bk.b(new Pair(7, a(map, this.i))) : com.huawei.openalliance.ad.utils.bk.b(listA2);
            if (listA2.size() > 0) {
                j.a(this.g, this.f18742c, 1000, strB, true);
            } else {
                hw.b("JsbReqRewardAd", " ads map is empty.");
                j.a(this.g, this.f18742c, 1005, null, true);
            }
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.RewardAdListener
        public void onAdFailed(int i) {
            j.a(this.g, this.f18742c, bp.a(i), null, true);
        }

        private void a(List<ContentRecord> list) {
            if (com.huawei.openalliance.ad.utils.bm.a(list)) {
                return;
            }
            for (ContentRecord contentRecord : list) {
                if (contentRecord != null) {
                    hw.b("JsbReqRewardAd", "insertOrUpdateContent, uniqueId: %s", contentRecord.ac());
                    if (contentRecord.aQ() == 3) {
                        if (this.e.a(contentRecord.o(), contentRecord.aP(), contentRecord.n(), contentRecord.ac()) == null) {
                            contentRecord.g(com.huawei.openalliance.ad.utils.as.c());
                        }
                        hw.b("JsbReqRewardAd", "insertOrUpdateV3Content");
                        this.e.c(contentRecord);
                        if (!TextUtils.isEmpty(contentRecord.aP()) && !com.huawei.openalliance.ad.utils.bm.a(contentRecord.aY())) {
                            ContentTemplateRecord contentTemplateRecord = new ContentTemplateRecord(contentRecord.o(), contentRecord.aP(), contentRecord.aY(), contentRecord.aV(), contentRecord.br());
                            if (!TextUtils.isEmpty(contentRecord.ba())) {
                                contentTemplateRecord.a(contentRecord.ba());
                            }
                            this.f.a(contentTemplateRecord);
                        }
                    } else {
                        if (this.d.a(contentRecord.o(), contentRecord.n(), contentRecord.ac()) == null) {
                            contentRecord.g(com.huawei.openalliance.ad.utils.as.c());
                        }
                        hw.b("JsbReqRewardAd", "insertOrUpdateV2Content");
                        this.d.b(contentRecord);
                    }
                }
            }
        }

        private void a(int i, IRewardAd iRewardAd, H5Ad h5Ad) {
            RewardItem rewardItem = iRewardAd.getRewardItem();
            if (rewardItem == null || i >= 30482300) {
                return;
            }
            BaseRewardItem baseRewardItem = new BaseRewardItem();
            baseRewardItem.setType(rewardItem.getType());
            baseRewardItem.setAmount(rewardItem.getAmount());
            h5Ad.a(baseRewardItem);
        }

        private Map<String, List<H5Ad>> a(Map<String, List<IRewardAd>> map, int i) {
            if (com.huawei.openalliance.ad.utils.br.a(map)) {
                return null;
            }
            HashMap map2 = new HashMap();
            for (Map.Entry<String, List<IRewardAd>> entry : map.entrySet()) {
                if (!com.huawei.openalliance.ad.utils.bm.a(entry.getValue())) {
                    ArrayList arrayList = new ArrayList();
                    for (IRewardAd iRewardAd : entry.getValue()) {
                        H5Ad h5Ad = new H5Ad((com.huawei.openalliance.ad.inter.data.i) iRewardAd);
                        a(i, iRewardAd, h5Ad);
                        arrayList.add(h5Ad);
                    }
                    map2.put(entry.getKey(), arrayList);
                }
            }
            return map2;
        }

        private List<IRewardAd> a(Map<String, List<IRewardAd>> map, String str) {
            if (com.huawei.openalliance.ad.utils.br.a(map)) {
                return null;
            }
            if (!TextUtils.isEmpty(str)) {
                return map.get(str);
            }
            ArrayList arrayList = new ArrayList();
            Iterator<Map.Entry<String, List<IRewardAd>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().getValue());
            }
            return arrayList;
        }

        private List<H5Ad> a(List<ContentRecord> list, List<IRewardAd> list2, byte[] bArr, int i) {
            ArrayList arrayList = new ArrayList(4);
            if (list2 != null && list2.size() > 0) {
                for (IRewardAd iRewardAd : list2) {
                    if (iRewardAd != null) {
                        com.huawei.openalliance.ad.inter.data.i iVar = (com.huawei.openalliance.ad.inter.data.i) iRewardAd;
                        H5Ad h5Ad = new H5Ad(iVar);
                        a(i, iRewardAd, h5Ad);
                        arrayList.add(h5Ad);
                        ContentRecord contentRecordA = pw.a(iVar);
                        contentRecordA.a(bArr);
                        list.add(contentRecordA);
                    }
                }
            }
            return arrayList;
        }

        a(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback, String str2, int i) {
            super(context, str, remoteCallResultCallback, str2);
            this.i = i;
        }

        a(Context context, RemoteCallResultCallback<String> remoteCallResultCallback, String str) {
            super(context, remoteCallResultCallback, str);
        }
    }

    @Override // com.huawei.openalliance.ad.i
    protected void b(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback) {
        int i;
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("slotId");
        String strOptString2 = jSONObject.optString(JsbMapKeyNames.JSSDK_VERSION);
        String strOptString3 = jSONObject.optString(JsbMapKeyNames.H5_MEDIA_CONTENT);
        int iOptInt = jSONObject.optInt("deviceType", 4);
        RequestOptions requestOptionsC = c(context, str);
        RewardAdLoader rewardAdLoader = new RewardAdLoader(context, new String[]{strOptString});
        rewardAdLoader.setRequestOptions(requestOptionsC);
        rewardAdLoader.a((Integer) 3);
        rewardAdLoader.setContentBundle(c(strOptString3));
        rewardAdLoader.setLocation(g(str));
        try {
            i = Integer.parseInt(strOptString2);
        } catch (Throwable unused) {
            hw.d("JsbReqRewardAd", "parse js sdk version error");
            i = -1;
        }
        rewardAdLoader.setListener(new a(context, strOptString, remoteCallResultCallback, this.f19295a, i));
        rewardAdLoader.loadAds(iOptInt, false);
    }

    public z() {
        super("pps.reward.request");
    }
}
