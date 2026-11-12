package com.huami.bluetooth.profile.channel;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0012\n\u0002\b\t\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B#\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0004\u001a\u00020\u0002R\u0019\u0010\n\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0019\u0010\u000f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0015\u001a\u00020\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "", "", "toString", "toHexString", "", "a", LogUtil.I, "getErrorCode", "()I", "errorCode", "b", "Ljava/lang/String;", "getMsg", "()Ljava/lang/String;", "msg", "", "c", "[B", "getData", "()[B", "data", "<init>", "(ILjava/lang/String;[B)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ChannelResponse {
    public static final int ERROR_NO_REPLY = 5;
    public static final int ERROR_PACKAGE_LOST = 3;
    public static final int ERROR_REPLY_TIMEOUT = 7;
    public static final int ERROR_REQUEST_ALREADY_TIMEOUT = 9;
    public static final int ERROR_REQUEST_REPLY_DATA_TIMEOUT = 16;
    public static final int ERROR_SEND_DATA_TIME_OUT = 8;
    public static final int ERROR_SEND_PACKET_FAILED = 6;
    public static final int ERROR_TIMEOUT = 4;
    public static final int ERROT_SESSION_ID_MISMATCH = 2;
    public static final int RESPONSE_OK = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int errorCode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String msg;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final byte[] data;

    public ChannelResponse(int i, @NotNull String str, @NotNull byte[] bArr) {
        this.errorCode = i;
        this.msg = str;
        this.data = bArr;
    }

    @NotNull
    public final byte[] getData() {
        return this.data;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final String getMsg() {
        return this.msg;
    }

    @NotNull
    public final String toHexString() {
        return "ChannelResponse(errorCode=" + this.errorCode + ", msg='" + this.msg + "', data=" + ((Object) GattUtils.bytesToHexString(this.data)) + ')';
    }

    @NotNull
    public String toString() {
        return "ChannelResponse(errorCode=" + this.errorCode + ", msg='" + this.msg + "', data=" + Arrays.toString(this.data) + ')';
    }

    public /* synthetic */ ChannelResponse(int i, String str, byte[] bArr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? new byte[0] : bArr);
    }
}
