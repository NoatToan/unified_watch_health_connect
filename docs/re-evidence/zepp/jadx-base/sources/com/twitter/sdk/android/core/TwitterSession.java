package com.twitter.sdk.android.core;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.twitter.sdk.android.core.internal.persistence.SerializationStrategy;

/* JADX INFO: loaded from: classes18.dex */
public class TwitterSession extends Session<TwitterAuthToken> {
    public static final long UNKNOWN_USER_ID = -1;
    public static final String UNKNOWN_USER_NAME = "";

    @SerializedName("user_name")
    private final String c;

    public static class a implements SerializationStrategy<TwitterSession> {
        private final Gson a = new Gson();

        @Override // com.twitter.sdk.android.core.internal.persistence.SerializationStrategy
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TwitterSession deserialize(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                return (TwitterSession) this.a.fromJson(str, TwitterSession.class);
            } catch (Exception e) {
                Twitter.getLogger().d("Twitter", e.getMessage());
                return null;
            }
        }

        @Override // com.twitter.sdk.android.core.internal.persistence.SerializationStrategy
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String serialize(TwitterSession twitterSession) {
            if (twitterSession == null || twitterSession.getAuthToken() == null) {
                return "";
            }
            try {
                return this.a.toJson(twitterSession);
            } catch (Exception e) {
                Twitter.getLogger().d("Twitter", e.getMessage());
                return "";
            }
        }
    }

    public TwitterSession(TwitterAuthToken twitterAuthToken, long j, String str) {
        super(twitterAuthToken, j);
        this.c = str;
    }

    @Override // com.twitter.sdk.android.core.Session
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        String str = this.c;
        String str2 = ((TwitterSession) obj).c;
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    public long getUserId() {
        return getId();
    }

    public String getUserName() {
        return this.c;
    }

    @Override // com.twitter.sdk.android.core.Session
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.c;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
