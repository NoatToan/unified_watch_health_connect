package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.onetrack.c.q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: k4, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0016\u0018\u00002\u00020\u0001:\u0001\u000eB1\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\nR\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\n¨\u0006\u0013"}, d2 = {"Lk4;", "", "", "toString", "", PluginDeviceInfo.FICONOFF, "", "sessionId", "I", PluginDeviceInfo.FICONON, "()I", "errorCode", PluginDeviceInfo.FDESC, q.f13858b, PluginDeviceInfo.FMODEL, "type", "index", "<init>", "(IIIII)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public class ChannelReplyPacket {

    @NotNull
    public static final a f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    public final int sessionId;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final int errorCode;

    /* JADX INFO: renamed from: d, reason: from toString */
    public final int index;
    public final int e;

    /* JADX INFO: renamed from: k4$a */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004¨\u0006\u000e"}, d2 = {"Lk4$a;", "", "", "REPLY_BYTE_LEN", "I", "REPLY_CODE_BUSY", "REPLY_CODE_OK", "REPLY_CODE_PACKET_LOST", "REPLY_CODE_PACKET_MALFORMED", "REPLY_CODE_SESSION_ID_UNMATCH", "REPLY_CODE_UNKNOWN_MODULE", "REPLY_PACKET_TYPE", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ChannelReplyPacket(int i, int i2, int i3, int i4, int i5) {
        this.f23406a = i;
        this.sessionId = i2;
        this.errorCode = i3;
        this.index = i4;
        this.e = i5;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getE() {
        return this.e;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getSessionId() {
        return this.sessionId;
    }

    public final boolean d() {
        return this.errorCode == 1;
    }

    @NotNull
    public String toString() {
        return "ChannelReplyPacket(sessionId=" + this.sessionId + ", errorCode=" + this.errorCode + ", index=" + this.index + ')';
    }

    public /* synthetic */ ChannelReplyPacket(int i, int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, i4, (i6 & 16) != 0 ? 0 : i5);
    }
}
