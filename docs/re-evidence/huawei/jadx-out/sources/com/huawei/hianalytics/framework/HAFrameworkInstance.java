package com.huawei.hianalytics.framework;

import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.core.storage.IStorageHandler;
import com.huawei.hianalytics.framework.config.ICallback;
import com.huawei.hianalytics.framework.config.ICollectorConfig;
import com.huawei.hianalytics.framework.config.IMandatoryParameters;
import com.huawei.hianalytics.framework.policy.IStoragePolicy;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public interface HAFrameworkInstance {
    public static final String TAG = "HAFrameworkInstance";

    public static final class Builder {
        private ICollectorConfig collectorConfig;
        private IMandatoryParameters parameters;
        private IStorageHandler storageHandler;
        private IStoragePolicy storagePolicy;

        public HAFrameworkInstance build(String str) {
            if (this.parameters == null && b.e.f11498a == null) {
                return null;
            }
            b bVar = b.e;
            if (bVar.f11499b.containsKey(str)) {
                HiLog.sw(HAFrameworkInstance.TAG, "serviceTag check failed, TAG: " + str);
                return null;
            }
            ICollectorConfig iCollectorConfig = this.collectorConfig;
            IMandatoryParameters iMandatoryParameters = this.parameters;
            IStorageHandler iStorageHandler = this.storageHandler;
            IStoragePolicy iStoragePolicy = this.storagePolicy;
            synchronized (bVar) {
                bVar.f11499b.put(str, iCollectorConfig);
                g gVar = new g();
                gVar.f11518a = iStorageHandler;
                bVar.f11500c.put(str, gVar);
                bVar.d.put(str, iStoragePolicy);
                if (bVar.f11498a == null && iMandatoryParameters != null) {
                    bVar.f11498a = iMandatoryParameters;
                }
            }
            return new h(str);
        }

        public Builder setCollectorConfig(ICollectorConfig iCollectorConfig) {
            this.collectorConfig = iCollectorConfig;
            return this;
        }

        public Builder setMandatoryParameters(IMandatoryParameters iMandatoryParameters) {
            this.parameters = iMandatoryParameters;
            return this;
        }

        public Builder setStorageHandler(IStorageHandler iStorageHandler) {
            this.storageHandler = iStorageHandler;
            return this;
        }

        public Builder setStoragePolicy(IStoragePolicy iStoragePolicy) {
            this.storagePolicy = iStoragePolicy;
            return this;
        }
    }

    void clearCacheDataAll();

    void clearCacheDataByTag();

    void clearCacheDataByTagType(String str);

    void onEvent(String str, String str2, JSONObject jSONObject, ICallback iCallback);

    void onEvent(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, ICallback iCallback);

    void onEventSync(String str, String str2, JSONObject jSONObject);

    void onReport(String str);

    void onStreamEvent(String str, String str2, JSONObject jSONObject, ICallback iCallback);

    void onStreamEvent(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, ICallback iCallback);
}
