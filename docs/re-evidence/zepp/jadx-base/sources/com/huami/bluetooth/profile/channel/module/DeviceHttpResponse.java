package com.huami.bluetooth.profile.channel.module;

import com.baidu.ocr.sdk.utils.LogUtil;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\t\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B%\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/DeviceHttpResponse;", "Ljava/io/Serializable;", "", "a", LogUtil.I, "getErrorCode", "()I", "errorCode", "b", "getStatusCode", "statusCode", "", "c", "[B", "getDataBytes", "()[B", "dataBytes", "<init>", "(II[B)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class DeviceHttpResponse implements Serializable {
    public static final int ERROR_CODE_INVALID_PARAMETER = 6;
    public static final int ERROR_CODE_NETWORK_ERROR = 5;
    public static final int ERROR_CODE_NETWORK_TIMEOUT = 4;
    public static final int ERROR_CODE_NO_NETWORK = 3;
    public static final int ERROR_CODE_OK = 1;
    public static final int ERROR_CODE_UNKNOWN = 2;
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int errorCode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int statusCode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final byte[] dataBytes;

    public DeviceHttpResponse(int i, int i2, @Nullable byte[] bArr) {
        this.errorCode = i;
        this.statusCode = i2;
        this.dataBytes = bArr;
    }

    @Nullable
    public final byte[] getDataBytes() {
        return this.dataBytes;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public /* synthetic */ DeviceHttpResponse(int i, int i2, byte[] bArr, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? -1 : i2, (i3 & 4) != 0 ? null : bArr);
    }
}
