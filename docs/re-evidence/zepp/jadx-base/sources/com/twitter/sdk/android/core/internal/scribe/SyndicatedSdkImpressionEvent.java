package com.twitter.sdk.android.core.internal.scribe;

import com.google.gson.annotations.SerializedName;
import com.huami.account.UserLegalInfoManager;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class SyndicatedSdkImpressionEvent extends ScribeEvent {
    public static final String CLIENT_NAME = "android";
    private static final String g = "syndicated_sdk_impression";

    @SerializedName("device_id_created_at")
    public final long deviceIdCreatedAt;

    @SerializedName("external_ids")
    public final ExternalIds externalIds;

    @SerializedName(UserLegalInfoManager.KEY_LANGUAGE)
    public final String language;

    public class ExternalIds {

        @SerializedName("AD_ID")
        public final String adId;

        public ExternalIds(String str) {
            this.adId = str;
        }
    }

    public SyndicatedSdkImpressionEvent(EventNamespace eventNamespace, long j, String str, String str2) {
        this(eventNamespace, j, str, str2, Collections.emptyList());
    }

    public SyndicatedSdkImpressionEvent(EventNamespace eventNamespace, long j, String str, String str2, List<ScribeItem> list) {
        super(g, eventNamespace, j, list);
        this.language = str;
        this.externalIds = new ExternalIds(str2);
        this.deviceIdCreatedAt = 0L;
    }
}
