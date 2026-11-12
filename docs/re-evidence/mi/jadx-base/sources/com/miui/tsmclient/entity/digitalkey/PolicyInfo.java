package com.miui.tsmclient.entity.digitalkey;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.onetrack.api.b;

/* JADX INFO: loaded from: classes6.dex */
public class PolicyInfo {

    @SerializedName("KTS")
    private Policy mKTSPolicy;

    @SerializedName("ShareFriend")
    private Policy mShareFriendPolicy;

    @SerializedName("ShareOwner")
    private Policy mShareOwnerPolicy;

    public static class Policy {

        @SerializedName("step1")
        public Step mStep1;

        @SerializedName("step2")
        public Step mStep2;

        @SerializedName("step3")
        public Step mStep3;

        @SerializedName("step4")
        public Step mStep4;
    }

    public static class Step {

        @SerializedName("duration")
        private int mDuration;

        @SerializedName("next")
        private String mNext;

        @SerializedName(b.M)
        private int mRetry;

        public int getDuration() {
            return this.mDuration;
        }

        public String getNext() {
            return this.mNext;
        }

        public int getRetry() {
            return this.mRetry;
        }
    }

    public Policy getKTS() {
        return this.mKTSPolicy;
    }

    public Policy getShareFriend() {
        return this.mShareFriendPolicy;
    }

    public Policy getShareOwner() {
        return this.mShareOwnerPolicy;
    }
}
