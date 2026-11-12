package com.huami.nfc.web;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B!\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\u000e\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0011\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/huami/nfc/web/NfcDevice;", "", "", "toString", "a", "Ljava/lang/String;", "getSn", "()Ljava/lang/String;", "sn", "Lcom/huami/nfc/web/DeviceModel;", "b", "Lcom/huami/nfc/web/DeviceModel;", "getDeviceModel", "()Lcom/huami/nfc/web/DeviceModel;", "deviceModel", "c", "getVendor", "vendor", "<init>", "(Ljava/lang/String;Lcom/huami/nfc/web/DeviceModel;Ljava/lang/String;)V", "Companion", "web_release"}, k = 1, mv = {1, 5, 1})
public class NfcDevice {

    @NotNull
    public static final String DEVICE_MODEL_ANDES = "A2153";

    @NotNull
    public static final String DEVICE_MODEL_BARI = "A2283";

    @NotNull
    public static final String DEVICE_MODEL_BEATS = "A1712";

    @NotNull
    public static final String DEVICE_MODEL_BEATS_P = "A1715";

    @NotNull
    public static final String DEVICE_MODEL_BERLIN = "A2165";

    @NotNull
    public static final String DEVICE_MODEL_BLANC = "A2011";

    @NotNull
    public static final String DEVICE_MODEL_BLED_PRO = "A2145";

    @NotNull
    public static final String DEVICE_MODEL_BONN = "A2020";

    @NotNull
    public static final String DEVICE_MODEL_CHONG_QING = "XMSH06HM";

    @NotNull
    public static final String DEVICE_MODEL_CINCO = "XMSH08HM";

    @NotNull
    public static final String DEVICE_MODEL_COMO = "A2019";

    @NotNull
    public static final String DEVICE_MODEL_COMO_LITE = "A2009";

    @NotNull
    public static final String DEVICE_MODEL_COMO_S = "ComoS";

    @NotNull
    public static final String DEVICE_MODEL_CORSICA = "A1957";

    @NotNull
    public static final String DEVICE_MODEL_DONGTINGHU = "A1805";

    @NotNull
    public static final String DEVICE_MODEL_EVEREST2 = "A1928";

    @NotNull
    public static final String DEVICE_MODEL_FALCON = "A1901";

    @NotNull
    public static final String DEVICE_MODEL_FLORENCE = "A2281";

    @NotNull
    public static final String DEVICE_MODEL_HAMBURG = "A2022";

    @NotNull
    public static final String DEVICE_MODEL_HAWK = "A1909";

    @NotNull
    public static final String DEVICE_MODEL_HUA_SHAN_S = "A1713";

    @NotNull
    public static final String DEVICE_MODEL_KESTREL = "A1913";

    @NotNull
    public static final String DEVICE_MODEL_KONG_MING = "XMSH11HM";

    @NotNull
    public static final String DEVICE_MODEL_KONG_MING_PRO = "XMSH14HM";

    @NotNull
    public static final String DEVICE_MODEL_L66 = "M2130B1";

    @NotNull
    public static final String DEVICE_MODEL_LEIDEN = "A2173";

    @NotNull
    public static final String DEVICE_MODEL_LILLE = "A2167";

    @NotNull
    public static final String DEVICE_MODEL_LINCS = "A1959";

    @NotNull
    public static final String DEVICE_MODEL_LISBON = "A1951";

    @NotNull
    public static final String DEVICE_MODEL_LONDON = "A2002";

    @NotNull
    public static final String DEVICE_MODEL_MADRID = "A2039";

    @NotNull
    public static final String DEVICE_MODEL_NESS = "A2010";

    @NotNull
    public static final String DEVICE_MODEL_NEWTON = "A1968";

    @NotNull
    public static final String DEVICE_MODEL_ONYX = "A1935";

    @NotNull
    public static final String DEVICE_MODEL_OSPREY = "A1933";

    @NotNull
    public static final String DEVICE_MODEL_PANGU = "XMSH16HM";

    @NotNull
    public static final String DEVICE_MODEL_POYANGHU = "A1808";

    @NotNull
    public static final String DEVICE_MODEL_PRAGUE = "A1955";

    @NotNull
    public static final String DEVICE_MODEL_PROVENCE = "A2175";

    @NotNull
    public static final String DEVICE_MODEL_PROVENCE_W = "A2176";

    @NotNull
    public static final String DEVICE_MODEL_QOGIR = "A1801";

    @NotNull
    public static final String DEVICE_MODEL_SOFIA = "A2160";

    @NotNull
    public static final String DEVICE_MODEL_TEIDE = "A2169";

    @NotNull
    public static final String DEVICE_MODEL_TLSCH = "A1820";

    @NotNull
    public static final String DEVICE_MODEL_TLSCL = "A1824";

    @NotNull
    public static final String DEVICE_MODEL_VENICE = "A1941";

    @NotNull
    public static final String DEVICE_MODEL_VERONA = "A1970";

    @NotNull
    public static final String DEVICE_MODEL_VIENNA = "A2028";

    @NotNull
    public static final String DEVICE_MODEL_VOLGA = "A2014";

    @NotNull
    public static final String DEVICE_MODEL_WAST = "A2280";

    @NotNull
    public static final String DEVICE_MODEL_XIHU = "AC1807";

    @NotNull
    public static final String DEVICE_MODEL_XIHU_E = "AC1903";

    @NotNull
    public static final String DEVICE_MODEL_ZURICH = "A2036";

    @NotNull
    public static final String DEVICE_VENDOR = "huami";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String sn;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final DeviceModel deviceModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String vendor;

    public NfcDevice(@NotNull String str, @NotNull DeviceModel deviceModel, @NotNull String str2) {
        this.sn = str;
        this.deviceModel = deviceModel;
        this.vendor = str2;
    }

    @NotNull
    public final DeviceModel getDeviceModel() {
        return this.deviceModel;
    }

    @NotNull
    public final String getSn() {
        return this.sn;
    }

    @NotNull
    public final String getVendor() {
        return this.vendor;
    }

    @NotNull
    public String toString() {
        return "NfcDevice(sn='" + this.sn + "', deviceModel='" + this.deviceModel.getModel() + "', vendor='" + this.vendor + "')";
    }

    public /* synthetic */ NfcDevice(String str, DeviceModel deviceModel, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, deviceModel, (i & 4) != 0 ? "huami" : str2);
    }
}
