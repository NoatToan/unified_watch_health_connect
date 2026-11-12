package com.huawei.ui.main.stories.recommendcloud;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.recommendcloud.constants.RecommendConstants;
import com.huawei.ui.main.stories.recommendcloud.data.RecommendCloudObject;
import com.huawei.ui.main.stories.recommendcloud.service.RecommendCloudCallBack;
import com.huawei.ui.main.stories.recommendcloud.service.RecommendCloudHttpCallBack;
import com.huawei.ui.main.stories.recommendcloud.service.RecommendCloudParse;
import com.huawei.ui.main.stories.recommendcloud.util.FileUtil;
import com.huawei.ui.main.stories.recommendcloud.util.HttpUtil;
import defpackage.lsy;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class RecommendCloud {
    private static final String TAG = "UIDV_RecommendCloud";
    private static volatile RecommendCloud mInstance;
    private Context mContext;

    private RecommendCloud(Context context) {
        LogUtil.a(TAG, "RecommendCloud");
        this.mContext = context.getApplicationContext();
    }

    public static RecommendCloud getInstance(Context context) {
        LogUtil.a(TAG, "getInstance");
        if (mInstance == null) {
            synchronized (RecommendCloud.class) {
                if (mInstance == null) {
                    mInstance = new RecommendCloud(context);
                }
            }
        }
        return mInstance;
    }

    public void doRefreshBatch(final RecommendCloudCallBack recommendCloudCallBack) {
        LogUtil.a(TAG, "doRefreshBatch");
        if (Utils.m()) {
            LogUtil.a(TAG, "isNoCloudVersion");
            recommendCloudCallBack.onResponce("", RecommendConstants.RESPONSE_CODE_NO_ENOUGH);
            return;
        }
        if (isInIntervalTime()) {
            recommendCloudCallBack.onResponce("", RecommendConstants.RESPONSE_CODE_NO_ENOUGH);
            return;
        }
        if (HandlerExecutor.c()) {
            lsy.a(new Runnable() { // from class: com.huawei.ui.main.stories.recommendcloud.RecommendCloud.1
                @Override // java.lang.Runnable
                public void run() {
                    RecommendCloud.this.doRefreshBatch(recommendCloudCallBack);
                }
            });
            return;
        }
        StorageParams storageParams = new StorageParams();
        SharedPreferenceManager.e(this.mContext, String.valueOf(10000), RecommendConstants.RECOMMEND_CLOUD_BATCH_TIME, String.valueOf(System.currentTimeMillis()), storageParams);
        LogUtil.a(TAG, "can doRefresh");
        HttpUtil.doRefresh(GRSManager.c(this.mContext).getUrl("getLatestVersion"), getBody(), new RecommendCloudHttpCallBack() { // from class: com.huawei.ui.main.stories.recommendcloud.RecommendCloud.2
            @Override // com.huawei.ui.main.stories.recommendcloud.service.RecommendCloudHttpCallBack
            public void onResponce(int i, String str) {
                LogUtil.a(RecommendCloud.TAG, "pullRefresh resCode = ", Integer.valueOf(i));
                if (i == 200) {
                    RecommendCloud.this.downloadBatch(RecommendCloudParse.parseResult(str), recommendCloudCallBack);
                } else {
                    recommendCloudCallBack.onResponce("", -1);
                }
            }
        });
    }

    private boolean isInIntervalTime() {
        String strE = SharedPreferenceManager.e(this.mContext, Integer.toString(10000), RecommendConstants.SERVICE_RECOMMEND_FILE);
        long j = !"1".equals(strE) ? 300000L : 86400000L;
        if (TextUtils.isEmpty(strE)) {
            SharedPreferenceManager.e(this.mContext, String.valueOf(10000), RecommendConstants.SERVICE_RECOMMEND_FILE, "0", new StorageParams());
            j = 0;
        }
        long jM = CommonUtil.m(this.mContext, SharedPreferenceManager.e(this.mContext, Integer.toString(10000), RecommendConstants.RECOMMEND_CLOUD_BATCH_TIME));
        long jCurrentTimeMillis = System.currentTimeMillis();
        LogUtil.a(TAG, "doRefresh less than interval time,lastTime = ", Long.valueOf(jM));
        return jM != 0 && jCurrentTimeMillis - jM < j;
    }

    private String getBody() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject.put(RecommendConstants.FILE_ID, RecommendConstants.HEALTH_SLEEP_RECOMMEND);
            String strE = SharedPreferenceManager.e(this.mContext, Integer.toString(10000), "sleepServiceConfig_ver");
            LogUtil.a(TAG, "serviceId = ", "sleepServiceConfig ver1 = " + strE);
            if (TextUtils.isEmpty(strE)) {
                LogUtil.a(TAG, "set ver1 0");
                strE = "0";
            }
            jSONObject.put(RecommendConstants.VER, strE);
            jSONArray.put(jSONObject);
            jSONObject2.put(RecommendConstants.FILE_ID, jSONArray);
            jSONObject2.put(RecommendConstants.IS_BATCH, "1");
        } catch (JSONException e) {
            LogUtil.j(TAG, "JSONException :", e.getMessage());
        }
        return jSONObject2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void downloadBatch(List<RecommendCloudObject> list, final RecommendCloudCallBack recommendCloudCallBack) {
        LogUtil.a(TAG, "downloadBatch");
        if (list != null) {
            LogUtil.a(TAG, "pullRefresh list.size = ", Integer.valueOf(list.size()));
            if (list.size() == 0) {
                recommendCloudCallBack.onResponce("", 20000);
            }
            for (final RecommendCloudObject recommendCloudObject : list) {
                FileUtil.getInstance(this.mContext).doDownload(recommendCloudObject, new RecommendCloudHttpCallBack() { // from class: com.huawei.ui.main.stories.recommendcloud.RecommendCloud.4
                    @Override // com.huawei.ui.main.stories.recommendcloud.service.RecommendCloudHttpCallBack
                    public void onResponce(int i, String str) {
                        LogUtil.a(RecommendCloud.TAG, "doDownload:", "resCode = ", Integer.valueOf(i), " result = ", str);
                        if (i == 0 && "success".equals(str)) {
                            FileUtil.getInstance(RecommendCloud.this.mContext).doUnZip(recommendCloudObject, recommendCloudCallBack);
                            return;
                        }
                        RecommendCloudObject recommendCloudObject2 = recommendCloudObject;
                        if (recommendCloudObject2 != null) {
                            recommendCloudCallBack.onResponce(recommendCloudObject2.getFileId(), -4);
                        } else {
                            recommendCloudCallBack.onResponce("", -4);
                        }
                    }
                });
            }
            return;
        }
        LogUtil.j(TAG, "download list is null");
    }
}
