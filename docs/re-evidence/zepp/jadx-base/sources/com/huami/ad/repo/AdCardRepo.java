package com.huami.ad.repo;

import com.huami.ad.db.AdProvider;
import com.huami.ad.utils.AdHelper;
import com.huami.ad.utils.EventAdDownloadFinished;
import com.huami.ad.web.AdAPI;
import com.huami.network.base.handler.ResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.xiaomi.hm.health.databases.model.AdEntity;
import de.greenrobot.event.EventBus;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class AdCardRepo {
    private static final String a = "AdCardRepo";
    private static AdCardRepo b;

    public class a extends ResponseHandler {
        public a() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
            EventBus.getDefault().post(new EventAdDownloadFinished(false));
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onSuccess(HMHttpResponseData hMHttpResponseData) {
            AdCardRepo.this.b(hMHttpResponseData);
        }
    }

    private AdCardRepo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(HMHttpResponseData hMHttpResponseData) {
        if (!hMHttpResponseData.isSuccess()) {
            EventBus.getDefault().post(new EventAdDownloadFinished(false));
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(hMHttpResponseData.getResponseBody(), StandardCharsets.UTF_8));
            for (String str : AdAPI.HOME_PAGE_ADS_ARRAY) {
                List<AdEntity> data = AdHelper.parseData(jSONObject.optString(str), str);
                if (AdAPI.TYPE_BODY_WEIGHT_TEXT_CHAIN.equals(str) || AdAPI.TYPE_BODY_FAT_TEXT_CHAIN.equals(str)) {
                    data = c(data);
                }
                AdProvider.getInstance().insertOrReplaceHomepageAdsByTypes(data, str);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        EventBus.getDefault().post(new EventAdDownloadFinished(true));
    }

    private List<AdEntity> c(List<AdEntity> list) {
        return (list == null || list.isEmpty()) ? list : Collections.singletonList(list.get(0));
    }

    public static AdCardRepo get() {
        return new AdCardRepo();
    }

    public static AdCardRepo getInstance() {
        if (b == null) {
            b = new AdCardRepo();
        }
        return b;
    }

    public void requestHomePageAds(String str, String str2, boolean z) {
        AdAPI.requestHomepageCard(new a(), str, str2, z);
    }
}
