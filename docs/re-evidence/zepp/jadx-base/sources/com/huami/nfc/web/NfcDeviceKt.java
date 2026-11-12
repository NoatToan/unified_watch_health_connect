package com.huami.nfc.web;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.context.GlobalContext;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0006\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0000\u001a\u0006\u0010\u0005\u001a\u00020\u0004\"\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/huami/nfc/web/DeviceModel;", "", "isXiaomiDevice", "isClassicDevice", "Lcom/huami/nfc/web/NfcDevice;", "getNfcDevice", "", "", "a", "Ljava/util/List;", "getXIAOMI_TSM_DEVICE", "()Ljava/util/List;", "XIAOMI_TSM_DEVICE", "", "b", "[Ljava/lang/String;", "getCLASSIC_DEVICE", "()[Ljava/lang/String;", "CLASSIC_DEVICE", "web_release"}, k = 2, mv = {1, 5, 1})
public final class NfcDeviceKt {

    @NotNull
    private static final List<String> a = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{NfcDevice.DEVICE_MODEL_CHONG_QING, NfcDevice.DEVICE_MODEL_CINCO, NfcDevice.DEVICE_MODEL_KONG_MING, NfcDevice.DEVICE_MODEL_KONG_MING_PRO, NfcDevice.DEVICE_MODEL_PANGU, NfcDevice.DEVICE_MODEL_L66});

    @NotNull
    private static final String[] b = {NfcDevice.DEVICE_MODEL_QOGIR, NfcDevice.DEVICE_MODEL_XIHU, NfcDevice.DEVICE_MODEL_XIHU_E};

    @NotNull
    public static final String[] getCLASSIC_DEVICE() {
        return b;
    }

    @NotNull
    public static final NfcDevice getNfcDevice() {
        return (NfcDevice) GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(NfcDevice.class), null, null);
    }

    @NotNull
    public static final List<String> getXIAOMI_TSM_DEVICE() {
        return a;
    }

    public static final boolean isClassicDevice(@NotNull DeviceModel deviceModel) {
        return ArraysKt___ArraysKt.contains(b, deviceModel.getModel());
    }

    public static final boolean isXiaomiDevice(@NotNull DeviceModel deviceModel) {
        return a.contains(deviceModel.getModel());
    }
}
