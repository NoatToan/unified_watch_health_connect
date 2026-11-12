package com.huami.bluetooth.profile.channel.module.file_transfer;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/file_transfer/TransferResponse;", "", "", "component1", "component2", "component3", SDKConstants.PARAM_SESSION_ID, "errorCode", "alreadyTransferSize", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getSessionID", "()I", "b", "getErrorCode", "c", "getAlreadyTransferSize", "<init>", "(III)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class TransferResponse {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int sessionID;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int errorCode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int alreadyTransferSize;

    public TransferResponse(int i, int i2, int i3) {
        this.sessionID = i;
        this.errorCode = i2;
        this.alreadyTransferSize = i3;
    }

    public static /* synthetic */ TransferResponse copy$default(TransferResponse transferResponse, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = transferResponse.sessionID;
        }
        if ((i4 & 2) != 0) {
            i2 = transferResponse.errorCode;
        }
        if ((i4 & 4) != 0) {
            i3 = transferResponse.alreadyTransferSize;
        }
        return transferResponse.copy(i, i2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSessionID() {
        return this.sessionID;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getAlreadyTransferSize() {
        return this.alreadyTransferSize;
    }

    @NotNull
    public final TransferResponse copy(int sessionID, int errorCode, int alreadyTransferSize) {
        return new TransferResponse(sessionID, errorCode, alreadyTransferSize);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferResponse)) {
            return false;
        }
        TransferResponse transferResponse = (TransferResponse) other;
        return this.sessionID == transferResponse.sessionID && this.errorCode == transferResponse.errorCode && this.alreadyTransferSize == transferResponse.alreadyTransferSize;
    }

    public final int getAlreadyTransferSize() {
        return this.alreadyTransferSize;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final int getSessionID() {
        return this.sessionID;
    }

    public int hashCode() {
        return (((this.sessionID * 31) + this.errorCode) * 31) + this.alreadyTransferSize;
    }

    @NotNull
    public String toString() {
        return "TransferResponse(sessionID=" + this.sessionID + ", errorCode=" + this.errorCode + ", alreadyTransferSize=" + this.alreadyTransferSize + ')';
    }

    public /* synthetic */ TransferResponse(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
