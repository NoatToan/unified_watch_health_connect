package com.huami.xiaopeng.repo.device;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.nfc.applet.AppletState;
import com.huami.nfc.applet.api.SeAppletApi;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.ble.AppletEntity;
import com.huami.nfc.ble.AppletType;
import com.huami.nfc.ble.IDeviceApi;
import com.huami.nfc.ble.NfcBleApi;
import com.huami.nfc.web.NfcDevice;
import com.huami.nfc.web.NfcDeviceKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/huami/xiaopeng/repo/device/XpDeviceSyncImpl;", "Lcom/huami/xiaopeng/repo/device/XpDeviceSyncApi;", "", "aid", "Lcom/huami/nfc/base/PayResponse;", "", "issueApplet", "deleteApplet", "activeApplet", "updateCarCardList", "", "isDefaultCard", "Lcom/huami/nfc/ble/IDeviceApi;", "a", "Lcom/huami/nfc/ble/IDeviceApi;", "deviceApi", "Lcom/huami/nfc/applet/api/SeAppletApi;", "b", "Lcom/huami/nfc/applet/api/SeAppletApi;", "seAppletApi", "Lcom/huami/nfc/web/NfcDevice;", "c", "Lcom/huami/nfc/web/NfcDevice;", "nfcDevice", "Lcom/huami/nfc/ble/NfcBleApi;", GoogleApiAvailabilityLight.a, "Lcom/huami/nfc/ble/NfcBleApi;", "bleApi", "<init>", "(Lcom/huami/nfc/ble/IDeviceApi;Lcom/huami/nfc/applet/api/SeAppletApi;Lcom/huami/nfc/web/NfcDevice;Lcom/huami/nfc/ble/NfcBleApi;)V", "xiaopeng-repo_release"}, k = 1, mv = {1, 5, 1})
public final class XpDeviceSyncImpl implements XpDeviceSyncApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IDeviceApi deviceApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final SeAppletApi seAppletApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final NfcDevice nfcDevice;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final NfcBleApi bleApi;

    public XpDeviceSyncImpl(@NotNull IDeviceApi iDeviceApi, @NotNull SeAppletApi seAppletApi, @NotNull NfcDevice nfcDevice, @NotNull NfcBleApi nfcBleApi) {
        this.deviceApi = iDeviceApi;
        this.seAppletApi = seAppletApi;
        this.nfcDevice = nfcDevice;
        this.bleApi = nfcBleApi;
    }

    @Override // com.huami.xiaopeng.repo.device.XpDeviceSyncApi
    @NotNull
    public PayResponse<Unit> activeApplet(@NotNull String aid) {
        return !NfcDeviceKt.isClassicDevice(this.nfcDevice.getDeviceModel()) ? this.bleApi.activeDefaultCard(aid, AppletType.XIAOPENG) : this.seAppletApi.setDefaultCard(aid);
    }

    @Override // com.huami.xiaopeng.repo.device.XpDeviceSyncApi
    @NotNull
    public PayResponse<Unit> deleteApplet(@NotNull String aid) {
        return !NfcDeviceKt.isClassicDevice(this.nfcDevice.getDeviceModel()) ? this.deviceApi.deleteApplet(aid, AppletType.XIAOPENG) : this.deviceApi.deleteAppletForWatch(aid, AppletType.XIAOPENG);
    }

    @Override // com.huami.xiaopeng.repo.device.XpDeviceSyncApi
    @NotNull
    public PayResponse<Boolean> isDefaultCard(@NotNull String aid) {
        if (!NfcDeviceKt.isClassicDevice(this.nfcDevice.getDeviceModel())) {
            PayResponse<String> defaultCard = this.bleApi.readDefaultCard();
            return !defaultCard.isSuccessful() ? PayResponse.Companion.success$default(PayResponse.INSTANCE, null, Boolean.FALSE, 1, null) : PayResponse.Companion.success$default(PayResponse.INSTANCE, null, Boolean.valueOf(Intrinsics.areEqual(aid, defaultCard.getData())), 1, null);
        }
        PayResponse<AppletState> appletState = this.seAppletApi.getAppletState(aid);
        if (!appletState.isSuccessful()) {
            return PayResponse.Companion.success$default(PayResponse.INSTANCE, null, Boolean.FALSE, 1, null);
        }
        PayResponse.Companion companion = PayResponse.INSTANCE;
        AppletState data = appletState.getData();
        boolean z = false;
        if (data != null && data.isActive()) {
            z = true;
        }
        return PayResponse.Companion.success$default(companion, null, Boolean.valueOf(z), 1, null);
    }

    @Override // com.huami.xiaopeng.repo.device.XpDeviceSyncApi
    @NotNull
    public PayResponse<Unit> issueApplet(@NotNull String aid) {
        return !NfcDeviceKt.isClassicDevice(this.nfcDevice.getDeviceModel()) ? this.deviceApi.issueApplet(aid, AppletType.XIAOPENG) : this.deviceApi.notifyAppletInfoForWatch(new AppletEntity(aid, null, AppletType.XIAOPENG.getBtValue(), null, null, 26, null));
    }

    @Override // com.huami.xiaopeng.repo.device.XpDeviceSyncApi
    @NotNull
    public PayResponse<Unit> updateCarCardList(@NotNull String aid) {
        if (NfcDeviceKt.isClassicDevice(this.nfcDevice.getDeviceModel())) {
            return this.deviceApi.notifyAppletInfoForWatch(new AppletEntity(aid, null, AppletType.XIAOPENG.getBtValue(), null, null, 26, null));
        }
        ArrayList arrayList = new ArrayList();
        if (!m.isBlank(aid)) {
            arrayList.add(aid);
        }
        return this.bleApi.updateNfcCardListSync(arrayList, AppletType.XIAOPENG);
    }
}
