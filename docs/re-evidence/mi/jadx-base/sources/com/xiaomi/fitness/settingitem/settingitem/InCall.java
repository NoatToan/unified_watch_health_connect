package com.xiaomi.fitness.settingitem.settingitem;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes8.dex */
public class InCall {

    @SerializedName("inComingCallNotifyTime")
    @Expose
    private int inComingCallNotifyTime;

    @SerializedName("incallContactNotifyEnabled")
    @Expose
    private boolean incallContactNotifyEnabled;

    @SerializedName("incallNameDisplayEnabled")
    @Expose
    private boolean incallNameDisplayEnabled;

    @SerializedName("incallNotifyEnabled")
    @Expose
    private boolean incallNotifyEnabled;

    @SerializedName("incomingCallReply")
    @Expose
    private boolean incomingCallReply;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InCall)) {
            return false;
        }
        InCall inCall = (InCall) obj;
        return this.incallContactNotifyEnabled == inCall.incallContactNotifyEnabled && this.incallNotifyEnabled == inCall.incallNotifyEnabled && this.incallNameDisplayEnabled == inCall.incallNameDisplayEnabled && this.incomingCallReply == inCall.incomingCallReply && this.inComingCallNotifyTime == inCall.inComingCallNotifyTime;
    }

    public int getInComingCallNotifyTime() {
        return this.inComingCallNotifyTime;
    }

    public int hashCode() {
        return (((((((((this.incallContactNotifyEnabled ? 1 : 0) + 31) * 31) + (this.incallNotifyEnabled ? 1 : 0)) * 31) + (this.incallNameDisplayEnabled ? 1 : 0)) * 31) + (this.incomingCallReply ? 1 : 0)) * 31) + this.inComingCallNotifyTime;
    }

    public boolean isIncallContactNotifyEnabled() {
        return this.incallContactNotifyEnabled;
    }

    public boolean isIncallNameDisplayEnabled() {
        return this.incallNameDisplayEnabled;
    }

    public boolean isIncallNotifyEnabled() {
        return this.incallNotifyEnabled;
    }

    public boolean isIncomingCallReply() {
        return this.incomingCallReply;
    }

    public void setInComingCallNotifyTime(int i) {
        this.inComingCallNotifyTime = i;
    }

    public void setIncallContactNotifyEnabled(boolean z) {
        this.incallContactNotifyEnabled = z;
    }

    public void setIncallNameDisplayEnabled(boolean z) {
        this.incallNameDisplayEnabled = z;
    }

    public void setIncallNotifyEnabled(boolean z) {
        this.incallNotifyEnabled = z;
    }

    public void setIncomingCallReply(boolean z) {
        this.incomingCallReply = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InCall.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb.append("incallNotifyEnabled");
        sb.append('=');
        sb.append(this.incallNotifyEnabled);
        sb.append(',');
        sb.append("incallContactNotifyEnabled");
        sb.append('=');
        sb.append(this.incallContactNotifyEnabled);
        sb.append(',');
        sb.append("incallNameDisplayEnabled");
        sb.append('=');
        sb.append(this.incallNameDisplayEnabled);
        sb.append(',');
        sb.append("inComingCallNotifyTime");
        sb.append('=');
        sb.append(this.inComingCallNotifyTime);
        sb.append(',');
        sb.append("incomingCallReply");
        sb.append('=');
        sb.append(this.incomingCallReply);
        sb.append(',');
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.setCharAt(sb.length() - 1, AbstractJsonLexerKt.END_LIST);
        } else {
            sb.append(AbstractJsonLexerKt.END_LIST);
        }
        return sb.toString();
    }
}
