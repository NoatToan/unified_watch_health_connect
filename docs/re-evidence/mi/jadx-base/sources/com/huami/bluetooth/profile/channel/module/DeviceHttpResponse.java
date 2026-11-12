package com.huami.bluetooth.profile.channel.module;

import com.miui.tsmclient.util.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\t\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/DeviceHttpResponse;", "Ljava/io/Serializable;", "", "errorCode", "I", "getErrorCode", "()I", Constants.PARAM_STATUS_CODE, "getStatusCode", "", "dataBytes", "[B", "getDataBytes", "()[B", "<init>", "(II[B)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class DeviceHttpResponse implements Serializable {
    public static final int ERROR_CODE_INVALID_PARAMETER = 6;
    public static final int ERROR_CODE_NETWORK_ERROR = 5;
    public static final int ERROR_CODE_NETWORK_TIMEOUT = 4;
    public static final int ERROR_CODE_NO_NETWORK = 3;
    public static final int ERROR_CODE_OK = 1;
    public static final int ERROR_CODE_UNKNOWN = 2;
    private static final long serialVersionUID = 1;

    @Nullable
    private final byte[] dataBytes;
    private final int errorCode;
    private final int statusCode;

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
