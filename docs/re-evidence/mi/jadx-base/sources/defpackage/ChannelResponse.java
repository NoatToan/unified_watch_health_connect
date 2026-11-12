package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: m4, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011B#\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0004\u001a\u00020\u0002R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lm4;", "", "", "toString", PluginDeviceInfo.FICONOFF, "", "errorCode", "I", PluginDeviceInfo.FDESC, "()I", "msg", "Ljava/lang/String;", PluginDeviceInfo.FICONON, "()Ljava/lang/String;", "", "data", "[B", PluginDeviceInfo.FMODEL, "()[B", "<init>", "(ILjava/lang/String;[B)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class ChannelResponse {

    @NotNull
    public static final a d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public final int errorCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @NotNull
    public final String msg;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final byte[] data;

    /* JADX INFO: renamed from: m4$a */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004¨\u0006\u0010"}, d2 = {"Lm4$a;", "", "", "ERROR_NO_REPLY", "I", "ERROR_PACKAGE_LOST", "ERROR_REPLY_TIMEOUT", "ERROR_REQUEST_ALREADY_TIMEOUT", "ERROR_REQUEST_REPLY_DATA_TIMEOUT", "ERROR_SEND_DATA_TIME_OUT", "ERROR_SEND_PACKET_FAILED", "ERROR_TIMEOUT", "ERROT_SESSION_ID_MISMATCH", "RESPONSE_OK", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ChannelResponse(int i, @NotNull String msg, @NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(data, "data");
        this.errorCode = i;
        this.msg = msg;
        this.data = data;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    @NotNull
    public final String d() {
        return "ChannelResponse(errorCode=" + this.errorCode + ", msg='" + this.msg + "', data=" + tet.x(this.data) + ')';
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChannelResponse(errorCode=");
        sb.append(this.errorCode);
        sb.append(", msg='");
        sb.append(this.msg);
        sb.append("', data=");
        String string = Arrays.toString(this.data);
        Intrinsics.checkNotNullExpressionValue(string, "toString(this)");
        sb.append(string);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ ChannelResponse(int i, String str, byte[] bArr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? new byte[0] : bArr);
    }
}
