package com.huami.bluetooth.profile.channel.module.file_transfer.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/file_transfer/model/AckResponse;", "", "", "component1", "component2", SDKConstants.PARAM_SESSION_ID, "code", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getSessionID", "()I", "b", "getCode", "<init>", "(II)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AckResponse {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int sessionID;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int code;

    public AckResponse(int i, int i2) {
        this.sessionID = i;
        this.code = i2;
    }

    public static /* synthetic */ AckResponse copy$default(AckResponse ackResponse, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = ackResponse.sessionID;
        }
        if ((i3 & 2) != 0) {
            i2 = ackResponse.code;
        }
        return ackResponse.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSessionID() {
        return this.sessionID;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final AckResponse copy(int sessionID, int code) {
        return new AckResponse(sessionID, code);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AckResponse)) {
            return false;
        }
        AckResponse ackResponse = (AckResponse) other;
        return this.sessionID == ackResponse.sessionID && this.code == ackResponse.code;
    }

    public final int getCode() {
        return this.code;
    }

    public final int getSessionID() {
        return this.sessionID;
    }

    public int hashCode() {
        return (this.sessionID * 31) + this.code;
    }

    @NotNull
    public String toString() {
        return "AckResponse(sessionID=" + this.sessionID + ", code=" + this.code + ')';
    }
}
