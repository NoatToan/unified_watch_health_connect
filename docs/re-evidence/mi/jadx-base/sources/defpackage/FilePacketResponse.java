package defpackage;

import com.miui.tsmclient.util.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ba, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\f¨\u0006\u0011"}, d2 = {"Lba;", "", "", "toString", "", "hashCode", "other", "", "equals", Constants.EXTRA_SESSION_ID, "I", PluginDeviceInfo.FDESC, "()I", "errorCode", PluginDeviceInfo.FMODEL, "<init>", "(II)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class FilePacketResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public final int sessionID;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    public final int errorCode;

    public FilePacketResponse(int i, int i2) {
        this.sessionID = i;
        this.errorCode = i2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getSessionID() {
        return this.sessionID;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FilePacketResponse)) {
            return false;
        }
        FilePacketResponse filePacketResponse = (FilePacketResponse) other;
        return this.sessionID == filePacketResponse.sessionID && this.errorCode == filePacketResponse.errorCode;
    }

    public int hashCode() {
        return (Integer.hashCode(this.sessionID) * 31) + Integer.hashCode(this.errorCode);
    }

    @NotNull
    public String toString() {
        return "FilePacketResponse(sessionID=" + this.sessionID + ", errorCode=" + this.errorCode + ')';
    }
}
