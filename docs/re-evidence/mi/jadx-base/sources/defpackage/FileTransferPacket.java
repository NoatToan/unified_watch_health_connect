package defpackage;

import com.miui.tsmclient.util.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ma, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\nBE\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, d2 = {"Lma;", "", "", "toString", "", Constants.EXTRA_SESSION_ID, "I", PluginDeviceInfo.FICONON, "()I", "chunkSize", PluginDeviceInfo.FMODEL, "", "data", "[B", PluginDeviceInfo.FDESC, "()[B", "", "isLastPacket", "Z", PluginDeviceInfo.FICONOFF, "()Z", "isFirst", "crc", "offset", "<init>", "(II[BZZII)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class FileTransferPacket {

    @NotNull
    public static final a h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public final int sessionID;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    public final int chunkSize;

    @NotNull
    public final byte[] c;

    /* JADX INFO: renamed from: d, reason: from toString */
    public final boolean isLast;
    public final boolean e;

    /* JADX INFO: renamed from: f, reason: from toString */
    public final int crc;
    public final int g;

    /* JADX INFO: renamed from: ma$a */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lma$a;", "", "", "bytes", "Lma;", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final FileTransferPacket a(@NotNull byte[] bytes) {
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            w2 w2Var = new w2(null, 0, 3, 0 == true ? 1 : 0);
            w2Var.a(bytes);
            int iC = w2Var.c();
            int i = iC & 1;
            return new FileTransferPacket(w2Var.c(), w2Var.c(), w2Var.a(w2Var.c(2)), ((iC >> 1) & 1) > 0, i > 0, 0, i > 0 ? w2.b(w2Var, 0, 1, null) : 0);
        }
    }

    public FileTransferPacket(int i, int i2, @NotNull byte[] data, boolean z, boolean z2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.sessionID = i;
        this.chunkSize = i2;
        this.c = data;
        this.isLast = z;
        this.e = z2;
        this.crc = i3;
        this.g = i4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getChunkSize() {
        return this.chunkSize;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final byte[] getC() {
        return this.c;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getSessionID() {
        return this.sessionID;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsLast() {
        return this.isLast;
    }

    @NotNull
    public String toString() {
        return "FileTransferPacket(sessionID=" + this.sessionID + ", chunkSize=" + this.chunkSize + ", dataSize=" + this.c.length + ", isLast=" + this.isLast + ", crc=" + this.crc + ')';
    }
}
