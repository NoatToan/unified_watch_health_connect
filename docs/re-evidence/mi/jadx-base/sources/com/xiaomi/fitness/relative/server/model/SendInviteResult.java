package com.xiaomi.fitness.relative.server.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/relative/server/model/SendInviteResult;", "", "result", "", "<init>", "(I)V", "getResult", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SendInviteResult {

    @SerializedName("send_ret")
    private final int result;

    public SendInviteResult(int i) {
        this.result = i;
    }

    public static /* synthetic */ SendInviteResult copy$default(SendInviteResult sendInviteResult, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = sendInviteResult.result;
        }
        return sendInviteResult.copy(i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getResult() {
        return this.result;
    }

    @NotNull
    public final SendInviteResult copy(int result) {
        return new SendInviteResult(result);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SendInviteResult) && this.result == ((SendInviteResult) other).result;
    }

    public final int getResult() {
        return this.result;
    }

    public int hashCode() {
        return Integer.hashCode(this.result);
    }

    @NotNull
    public String toString() {
        return "SendInviteResult(result=" + this.result + ")";
    }
}
