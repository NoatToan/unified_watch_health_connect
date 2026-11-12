package defpackage;

import com.miui.circulate.device.api.DeviceInfo;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: h5, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0012BK\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\u0013"}, d2 = {"Lh5;", "", "", "toString", "", "hashCode", "other", "", "equals", "Ljx;", "status", "ssid", DeviceInfo.Builder.PrivateDataKey.IP, "mac", "errorCode", "retryCount", "<init>", "(Ljx;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class ConnectStatus {

    @NotNull
    public static final a g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    @NotNull
    public final jx status;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @Nullable
    public final String ssid;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public final String ip;

    /* JADX INFO: renamed from: d, reason: from toString */
    @Nullable
    public final String mac;

    /* JADX INFO: renamed from: e, reason: from toString */
    @Nullable
    public final Integer errorCode;

    /* JADX INFO: renamed from: f, reason: from toString */
    @Nullable
    public final Integer retryCount;

    /* JADX INFO: renamed from: h5$a */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lh5$a;", "", "", "byteArray", "Lh5;", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r3v0, types: [byte[], kotlin.jvm.internal.DefaultConstructorMarker] */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v6 */
        @NotNull
        public final ConnectStatus a(@NotNull byte[] byteArray) {
            Object objM886constructorimpl;
            Integer num;
            Object objM886constructorimpl2;
            Intrinsics.checkNotNullParameter(byteArray, "byteArray");
            ?? r3 = 0;
            w2 w2Var = new w2(r3, 0, 3, r3);
            w2Var.a(byteArray);
            jx jxVarA = jx.u.a(w2Var.c(1));
            String strF = w2Var.f();
            jx jxVar = jx.CONNECTED;
            String strF2 = jxVarA == jxVar ? w2Var.f() : null;
            String strF3 = jxVarA == jxVar ? w2Var.f() : null;
            if (jxVarA == jx.CONNECTING || jxVarA == jx.DISCONNECT) {
                try {
                    Result.Companion companion = Result.Companion;
                    objM886constructorimpl = Result.m886constructorimpl(Integer.valueOf(w2Var.c()));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
                }
                if (Result.m892isFailureimpl(objM886constructorimpl)) {
                    objM886constructorimpl = null;
                }
                num = (Integer) objM886constructorimpl;
            } else {
                num = null;
            }
            if (jxVarA == jx.CONNECTING) {
                try {
                    Result.Companion companion3 = Result.Companion;
                    objM886constructorimpl2 = Result.m886constructorimpl(Integer.valueOf(w2Var.c()));
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.Companion;
                    objM886constructorimpl2 = Result.m886constructorimpl(ResultKt.createFailure(th2));
                }
                r3 = (Integer) (Result.m892isFailureimpl(objM886constructorimpl2) ? null : objM886constructorimpl2);
            }
            return new ConnectStatus(jxVarA, strF, strF2, strF3, num, r3);
        }
    }

    public ConnectStatus(@NotNull jx status, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable Integer num2) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
        this.ssid = str;
        this.ip = str2;
        this.mac = str3;
        this.errorCode = num;
        this.retryCount = num2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConnectStatus)) {
            return false;
        }
        ConnectStatus connectStatus = (ConnectStatus) other;
        return this.status == connectStatus.status && Intrinsics.areEqual(this.ssid, connectStatus.ssid) && Intrinsics.areEqual(this.ip, connectStatus.ip) && Intrinsics.areEqual(this.mac, connectStatus.mac) && Intrinsics.areEqual(this.errorCode, connectStatus.errorCode) && Intrinsics.areEqual(this.retryCount, connectStatus.retryCount);
    }

    public int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        String str = this.ssid;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.ip;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mac;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.errorCode;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.retryCount;
        return iHashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ConnectStatus(status=" + this.status + ", ssid=" + this.ssid + ", ip=" + this.ip + ", mac=" + this.mac + ", errorCode=" + this.errorCode + ", retryCount=" + this.retryCount + ')';
    }

    public /* synthetic */ ConnectStatus(jx jxVar, String str, String str2, String str3, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(jxVar, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : num, (i & 32) == 0 ? num2 : null);
    }
}
