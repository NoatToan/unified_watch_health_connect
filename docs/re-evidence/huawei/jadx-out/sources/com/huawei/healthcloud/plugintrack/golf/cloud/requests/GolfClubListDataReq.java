package com.huawei.healthcloud.plugintrack.golf.cloud.requests;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes10.dex */
public class GolfClubListDataReq implements IRequest {

    @SerializedName("language")
    private String mLanguage;

    @SerializedName("version")
    private String mVersion;

    private GolfClubListDataReq(Builder builder) {
        this.mLanguage = builder.mLanguage;
        this.mVersion = builder.mVersion;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("achievementUrl") + "/achievement/golfclub/getGolfClubList";
    }

    public String getVersion() {
        return this.mVersion;
    }

    public static final class Builder {
        private String mLanguage;
        private String mVersion;

        public Builder language(String str) {
            this.mLanguage = str;
            return this;
        }

        public Builder version(String str) {
            this.mVersion = str;
            return this;
        }

        public GolfClubListDataReq build() {
            return new GolfClubListDataReq(this);
        }
    }

    public String getLanguage() {
        return this.mLanguage;
    }
}
