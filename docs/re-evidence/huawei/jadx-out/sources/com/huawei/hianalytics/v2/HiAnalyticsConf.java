package com.huawei.hianalytics.v2;

import android.content.Context;
import com.huawei.hianalytics.a0;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.f1;
import com.huawei.hianalytics.framework.threadpool.TaskThread;
import com.huawei.hianalytics.j0;
import com.huawei.hianalytics.process.HiAnalyticsConfig;
import com.huawei.hianalytics.process.HiAnalyticsManager;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class HiAnalyticsConf {

    /* JADX INFO: loaded from: classes.dex */
    public static class Builder {
        private static final String TAG = "HAConfBuilder";
        String appid;
        Context mContext;
        HiAnalyticsConfig.Builder maintConfigBuilder;
        HiAnalyticsConfig.Builder operConfigBuilder;

        public Builder(Context context) {
            if (context != null) {
                this.mContext = context.getApplicationContext();
            }
            this.maintConfigBuilder = new HiAnalyticsConfig.Builder();
            this.operConfigBuilder = new HiAnalyticsConfig.Builder();
        }

        public void create() {
            if (this.mContext == null) {
                HiLog.e(TAG, "context is null, create failed");
                return;
            }
            HiAnalyticsConfig hiAnalyticsConfigBuild = this.maintConfigBuilder.build();
            HiAnalyticsConfig hiAnalyticsConfigBuild2 = this.operConfigBuilder.build();
            j0.a().a(this.mContext);
            a0 a0Var = new a0("_default_config_tag");
            if (a0Var.f11450c == null) {
                HiLog.e(TAG, "instance is null, create failed. tag: _default_config_tag");
                return;
            }
            a0Var.b(hiAnalyticsConfigBuild2);
            a0Var.a(hiAnalyticsConfigBuild);
            j0.a().a("_default_config_tag", a0Var);
            TaskThread.getUpdateThread().addToQueue(new f1(this.mContext, "_default_config_tag"));
            HiAnalyticsManager.setAppid(this.appid);
        }

        public void refresh(boolean z) {
            HiAnalyticsConfig hiAnalyticsConfigBuild = this.maintConfigBuilder.build();
            HiAnalyticsConfig hiAnalyticsConfigBuild2 = this.operConfigBuilder.build();
            a0 a0VarA = j0.a().a("_default_config_tag");
            if (a0VarA == null) {
                HiLog.sw(TAG, "tag: _default_config_tag has no instance. ");
                return;
            }
            a0VarA.refresh(1, hiAnalyticsConfigBuild);
            a0VarA.refresh(0, hiAnalyticsConfigBuild2);
            if (z) {
                j0 j0VarA = j0.a();
                if (j0VarA.f11557b == null) {
                    HiLog.sw("HADM", "sdk not init. tag: _default_config_tag");
                } else {
                    j0VarA.a("_default_config_tag").f11450c.clearCacheDataByTag();
                }
            }
            HiAnalyticsManager.setAppid(this.appid);
        }

        public Builder setAndroidId(String str) {
            this.operConfigBuilder.setAndroidId(str);
            this.maintConfigBuilder.setAndroidId(str);
            return this;
        }

        @Deprecated
        public Builder setAppID(String str) {
            this.appid = str;
            return this;
        }

        @Deprecated
        public Builder setAutoReportThreshold(int i) {
            return this;
        }

        @Deprecated
        public Builder setCacheExpireTime(int i) {
            this.operConfigBuilder.setCacheExpireTime(i);
            this.maintConfigBuilder.setCacheExpireTime(i);
            return this;
        }

        @Deprecated
        public Builder setChannel(String str) {
            this.operConfigBuilder.setChannel(str);
            this.maintConfigBuilder.setChannel(str);
            return this;
        }

        @Deprecated
        public Builder setCollectURL(int i, String str) {
            if (i == 0) {
                this.operConfigBuilder.setCollectURL(str);
                return this;
            }
            if (i != 1) {
                HiLog.w(TAG, "invalid type");
                return this;
            }
            this.maintConfigBuilder.setCollectURL(str);
            return this;
        }

        @Deprecated
        public Builder setDecryptBatchPolicy(int i, int i2, int i3) {
            this.operConfigBuilder.setDecryptBatchPolicy(i, i2, i3);
            this.maintConfigBuilder.setDecryptBatchPolicy(i, i2, i3);
            return this;
        }

        @Deprecated
        public Builder setEnableAndroidID(boolean z) {
            this.maintConfigBuilder.setEnableAndroidID(z);
            this.operConfigBuilder.setEnableAndroidID(z);
            return this;
        }

        @Deprecated
        public Builder setEnableImei(boolean z) {
            this.operConfigBuilder.setEnableImei(z);
            this.maintConfigBuilder.setEnableImei(z);
            return this;
        }

        @Deprecated
        public Builder setEnableMccMnc(boolean z) {
            this.maintConfigBuilder.setEnableMccMnc(z);
            this.operConfigBuilder.setEnableMccMnc(z);
            return this;
        }

        @Deprecated
        public Builder setEnableSN(boolean z) {
            this.maintConfigBuilder.setEnableSN(z);
            this.operConfigBuilder.setEnableSN(z);
            return this;
        }

        @Deprecated
        public Builder setEnableSession(boolean z) {
            this.operConfigBuilder.setEnableSession(z);
            return this;
        }

        @Deprecated
        public Builder setEnableUDID(boolean z) {
            this.maintConfigBuilder.setEnableUDID(z);
            this.operConfigBuilder.setEnableUDID(z);
            return this;
        }

        @Deprecated
        public Builder setEnableUUID(boolean z) {
            this.operConfigBuilder.setEnableUUID(z);
            this.maintConfigBuilder.setEnableUUID(z);
            return this;
        }

        @Deprecated
        public Builder setHttpHeader(Map<String, String> map) {
            this.operConfigBuilder.setHttpHeader(map);
            this.maintConfigBuilder.setHttpHeader(map);
            return this;
        }

        public Builder setIMEI(String str) {
            this.operConfigBuilder.setImei(str);
            this.maintConfigBuilder.setImei(str);
            return this;
        }

        public Builder setSN(String str) {
            this.operConfigBuilder.setSN(str);
            this.maintConfigBuilder.setSN(str);
            return this;
        }

        public Builder setUDID(String str) {
            this.operConfigBuilder.setUdid(str);
            this.maintConfigBuilder.setUdid(str);
            return this;
        }
    }
}
