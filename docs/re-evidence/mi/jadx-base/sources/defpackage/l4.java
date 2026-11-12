package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001\u001eBU\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0012¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\bR\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u0019\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016¨\u0006\u001f"}, d2 = {"Ll4;", "", "", "toString", "", "mode", "I", PluginDeviceInfo.FICONOFFLINE, "()I", "", "data", "[B", PluginDeviceInfo.FDESC, "()[B", "replyFreq", PluginDeviceInfo.FLOCALIZATIONS, "sessionId", "h", "", "encrypt", "Z", PluginDeviceInfo.FICONOFF, "()Z", "dataSize", PluginDeviceInfo.FICONON, "needTailReply", PluginDeviceInfo.FBLUETOOTHPAIR, "originData", "<init>", "(I[BIIZI[BZ)V", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class l4 {

    @NotNull
    public static final a i = new a(null);
    public static int j = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public final int module;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @NotNull
    public final byte[] data;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final int replyFreq;

    /* JADX INFO: renamed from: d, reason: from toString */
    public final int sessionId;

    /* JADX INFO: renamed from: e, reason: from toString */
    public final boolean encrypt;

    /* JADX INFO: renamed from: f, reason: from toString */
    public final int dataSize;

    @Nullable
    public byte[] g;
    public final boolean h;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005¨\u0006\n"}, d2 = {"Ll4$a;", "", "", PluginDeviceInfo.FMODEL, "REPLY_FREQ", "I", "SESSION_ID", "SESSION_ID_LOOP_COUNT", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final synchronized int a() {
            l4.j++;
            l4.j %= 256;
            return l4.j;
        }
    }

    public l4(int i2, @NotNull byte[] data, int i3, int i4, boolean z, int i5, @Nullable byte[] bArr, boolean z2) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.module = i2;
        this.data = data;
        this.replyFreq = i3;
        this.sessionId = i4;
        this.encrypt = z;
        this.dataSize = i5;
        this.g = bArr;
        this.h = z2;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getDataSize() {
        return this.dataSize;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getEncrypt() {
        return this.encrypt;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getModule() {
        return this.module;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getH() {
        return this.h;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getReplyFreq() {
        return this.replyFreq;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getSessionId() {
        return this.sessionId;
    }

    @NotNull
    public String toString() {
        return "(module=" + this.module + ", data=" + tet.x(this.data) + ", replyFreq=" + this.replyFreq + ", sessionId=" + this.sessionId + ", encrypt=" + this.encrypt + ", dataSize=" + this.dataSize + ')';
    }

    public /* synthetic */ l4(int i2, byte[] bArr, int i3, int i4, boolean z, int i5, byte[] bArr2, boolean z2, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, bArr, (i6 & 4) != 0 ? 16 : i3, (i6 & 8) != 0 ? i.a() : i4, (i6 & 16) != 0 ? false : z, (i6 & 32) != 0 ? bArr.length : i5, (i6 & 64) != 0 ? null : bArr2, (i6 & 128) != 0 ? true : z2);
    }
}
