package defpackage;

import com.miui.tsmclient.util.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: fv, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\f¨\u0006\u0013"}, d2 = {"Lfv;", "", "", "toString", "", "hashCode", "other", "", "equals", Constants.EXTRA_SESSION_ID, "I", PluginDeviceInfo.FICONON, "()I", "errorCode", PluginDeviceInfo.FDESC, "alreadyTransferSize", PluginDeviceInfo.FMODEL, "<init>", "(III)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class TransferResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public final int sessionID;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    public final int errorCode;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final int alreadyTransferSize;

    public TransferResponse(int i, int i2, int i3) {
        this.sessionID = i;
        this.errorCode = i2;
        this.alreadyTransferSize = i3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getAlreadyTransferSize() {
        return this.alreadyTransferSize;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getSessionID() {
        return this.sessionID;
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

    public int hashCode() {
        return (((Integer.hashCode(this.sessionID) * 31) + Integer.hashCode(this.errorCode)) * 31) + Integer.hashCode(this.alreadyTransferSize);
    }

    @NotNull
    public String toString() {
        return "TransferResponse(sessionID=" + this.sessionID + ", errorCode=" + this.errorCode + ", alreadyTransferSize=" + this.alreadyTransferSize + ')';
    }

    public /* synthetic */ TransferResponse(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
