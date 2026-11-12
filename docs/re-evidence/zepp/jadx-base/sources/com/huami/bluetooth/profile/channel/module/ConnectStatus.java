package com.huami.bluetooth.profile.channel.module;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.utils.BufByteDecoder;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u0000 ,2\u00020\u0001:\u0001,BK\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b*\u0010+J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0012\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJV\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0015\u001a\u00020\bHÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 R\u001b\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\nR\u001b\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b)\u0010\n¨\u0006-"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/ConnectStatus;", "", "Lcom/huami/bluetooth/profile/channel/module/WiFiConnectStatus;", "component1", "", "component2", "component3", "component4", "", "component5", "()Ljava/lang/Integer;", "component6", "status", "ssid", "ip", "mac", "errorCode", "retryCount", "copy", "(Lcom/huami/bluetooth/profile/channel/module/WiFiConnectStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/huami/bluetooth/profile/channel/module/ConnectStatus;", "toString", "hashCode", "other", "", "equals", "a", "Lcom/huami/bluetooth/profile/channel/module/WiFiConnectStatus;", "getStatus", "()Lcom/huami/bluetooth/profile/channel/module/WiFiConnectStatus;", "b", "Ljava/lang/String;", "getSsid", "()Ljava/lang/String;", "c", "getIp", GoogleApiAvailabilityLight.a, "getMac", "e", "Ljava/lang/Integer;", "getErrorCode", "f", "getRetryCount", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/WiFiConnectStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ConnectStatus {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final WiFiConnectStatus status;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final String ssid;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final String ip;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final String mac;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer errorCode;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer retryCount;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/ConnectStatus$Companion;", "", "", "byteArray", "Lcom/huami/bluetooth/profile/channel/module/ConnectStatus;", "parse", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final ConnectStatus parse(@NotNull byte[] byteArray) {
            Object objM3845constructorimpl;
            Integer num;
            Object objM3845constructorimpl2;
            Object obj = null;
            BufByteDecoder bufByteDecoder = new BufByteDecoder(null, 0, 3, null);
            bufByteDecoder.append(byteArray);
            WiFiConnectStatus wiFiConnectStatusFromValue = WiFiConnectStatus.INSTANCE.fromValue(bufByteDecoder.readInt(1));
            String string = bufByteDecoder.readString();
            WiFiConnectStatus wiFiConnectStatus = WiFiConnectStatus.CONNECTED;
            String string2 = wiFiConnectStatusFromValue == wiFiConnectStatus ? bufByteDecoder.readString() : null;
            String string3 = wiFiConnectStatusFromValue == wiFiConnectStatus ? bufByteDecoder.readString() : null;
            if (wiFiConnectStatusFromValue == WiFiConnectStatus.CONNECTING || wiFiConnectStatusFromValue == WiFiConnectStatus.DISCONNECT) {
                try {
                    Result.Companion companion = Result.Companion;
                    objM3845constructorimpl = Result.m3845constructorimpl(Integer.valueOf(bufByteDecoder.readByte()));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                }
                if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                    objM3845constructorimpl = null;
                }
                num = (Integer) objM3845constructorimpl;
            } else {
                num = null;
            }
            if (wiFiConnectStatusFromValue == WiFiConnectStatus.CONNECTING) {
                try {
                    Result.Companion companion3 = Result.Companion;
                    objM3845constructorimpl2 = Result.m3845constructorimpl(Integer.valueOf(bufByteDecoder.readByte()));
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.Companion;
                    objM3845constructorimpl2 = Result.m3845constructorimpl(ResultKt.createFailure(th2));
                }
                obj = (Integer) (Result.m3850isFailureimpl(objM3845constructorimpl2) ? null : objM3845constructorimpl2);
            }
            return new ConnectStatus(wiFiConnectStatusFromValue, string, string2, string3, num, obj);
        }
    }

    public ConnectStatus(@NotNull WiFiConnectStatus wiFiConnectStatus, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable Integer num2) {
        this.status = wiFiConnectStatus;
        this.ssid = str;
        this.ip = str2;
        this.mac = str3;
        this.errorCode = num;
        this.retryCount = num2;
    }

    public static /* synthetic */ ConnectStatus copy$default(ConnectStatus connectStatus, WiFiConnectStatus wiFiConnectStatus, String str, String str2, String str3, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            wiFiConnectStatus = connectStatus.status;
        }
        if ((i & 2) != 0) {
            str = connectStatus.ssid;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = connectStatus.ip;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = connectStatus.mac;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            num = connectStatus.errorCode;
        }
        Integer num3 = num;
        if ((i & 32) != 0) {
            num2 = connectStatus.retryCount;
        }
        return connectStatus.copy(wiFiConnectStatus, str4, str5, str6, num3, num2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final WiFiConnectStatus getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSsid() {
        return this.ssid;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIp() {
        return this.ip;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMac() {
        return this.mac;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getRetryCount() {
        return this.retryCount;
    }

    @NotNull
    public final ConnectStatus copy(@NotNull WiFiConnectStatus status, @Nullable String ssid, @Nullable String ip, @Nullable String mac, @Nullable Integer errorCode, @Nullable Integer retryCount) {
        return new ConnectStatus(status, ssid, ip, mac, errorCode, retryCount);
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

    @Nullable
    public final Integer getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final String getIp() {
        return this.ip;
    }

    @Nullable
    public final String getMac() {
        return this.mac;
    }

    @Nullable
    public final Integer getRetryCount() {
        return this.retryCount;
    }

    @Nullable
    public final String getSsid() {
        return this.ssid;
    }

    @NotNull
    public final WiFiConnectStatus getStatus() {
        return this.status;
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
        return "ConnectStatus(status=" + this.status + ", ssid=" + ((Object) this.ssid) + ", ip=" + ((Object) this.ip) + ", mac=" + ((Object) this.mac) + ", errorCode=" + this.errorCode + ", retryCount=" + this.retryCount + ')';
    }

    public /* synthetic */ ConnectStatus(WiFiConnectStatus wiFiConnectStatus, String str, String str2, String str3, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wiFiConnectStatus, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : num, (i & 32) == 0 ? num2 : null);
    }
}
