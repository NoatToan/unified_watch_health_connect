package com.huami.sky.lib.assist;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'CONNECTING' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001d\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/huami/sky/lib/assist/SkyDeviceStatus;", "", "", "deviceTypeValue", LogUtil.I, "getDeviceTypeValue", "()I", "setDeviceTypeValue", "(I)V", "errorCode", "getErrorCode", "setErrorCode", "<init>", "(Ljava/lang/String;III)V", "CONNECTING", "CONNECT_SUCCESS", "CONNECT_FAIL", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final class SkyDeviceStatus {
    public static final SkyDeviceStatus CONNECTING;
    public static final SkyDeviceStatus CONNECT_FAIL;
    private int deviceTypeValue;
    private int errorCode;
    public static final SkyDeviceStatus CONNECT_SUCCESS = new SkyDeviceStatus("CONNECT_SUCCESS", 1, 0, 0, 3, null);
    private static final /* synthetic */ SkyDeviceStatus[] $VALUES = a();

    static {
        int i = 0;
        CONNECTING = new SkyDeviceStatus("CONNECTING", 0, 0, i, 3, null);
        CONNECT_FAIL = new SkyDeviceStatus("CONNECT_FAIL", 2, i, 0, 3, null);
    }

    private SkyDeviceStatus(String str, int i, int i2, int i3) {
        super(str, i);
        this.deviceTypeValue = i2;
        this.errorCode = i3;
    }

    private static final /* synthetic */ SkyDeviceStatus[] a() {
        return new SkyDeviceStatus[]{CONNECTING, CONNECT_SUCCESS, CONNECT_FAIL};
    }

    public static SkyDeviceStatus valueOf(String str) {
        return (SkyDeviceStatus) Enum.valueOf(SkyDeviceStatus.class, str);
    }

    public static SkyDeviceStatus[] values() {
        return (SkyDeviceStatus[]) $VALUES.clone();
    }

    public final int getDeviceTypeValue() {
        return this.deviceTypeValue;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final void setDeviceTypeValue(int i) {
        this.deviceTypeValue = i;
    }

    public final void setErrorCode(int i) {
        this.errorCode = i;
    }

    public /* synthetic */ SkyDeviceStatus(String str, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i4 & 1) != 0 ? -1 : i2, (i4 & 2) != 0 ? 0 : i3);
    }
}
