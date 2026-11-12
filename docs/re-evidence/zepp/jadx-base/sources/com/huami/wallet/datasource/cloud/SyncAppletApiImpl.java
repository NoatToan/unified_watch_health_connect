package com.huami.wallet.datasource.cloud;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.ble.AppletEntity;
import com.huami.nfc.ble.AppletType;
import com.huami.nfc.ble.IDeviceApi;
import com.huami.nfc.ble.NfcBleApi;
import com.huami.nfc.web.NfcDevice;
import com.huami.nfc.web.NfcDeviceKt;
import com.huami.wallet.lib.entity.BusCardSimple2;
import com.huami.wallet.lib.entity.CitySimpleInfo;
import com.huami.wallet.lib.util.CitySimpleInfoCache;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/huami/wallet/datasource/cloud/SyncAppletApiImpl;", "Lcom/huami/wallet/datasource/cloud/SyncAppletApi;", "", "a", "", "appCode", "Lcom/huami/wallet/datasource/cloud/ChangeCityType;", "type", "Lcom/huami/nfc/base/PayResponse;", "", "c", "b", "", "Lcom/huami/wallet/lib/entity/BusCardSimple2;", "list", "syncAppletList", "notifyToDevice", "Lcom/huami/nfc/ble/NfcBleApi;", "Lcom/huami/nfc/ble/NfcBleApi;", "bleApi", "Lcom/huami/nfc/ble/IDeviceApi;", "Lcom/huami/nfc/ble/IDeviceApi;", "deviceApi", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "withBleApi", "Lcom/huami/nfc/web/NfcDevice;", GoogleApiAvailabilityLight.a, "Lcom/huami/nfc/web/NfcDevice;", "device", "<init>", "(Lcom/huami/nfc/ble/NfcBleApi;Lcom/huami/nfc/ble/IDeviceApi;Lkotlin/jvm/functions/Function0;Lcom/huami/nfc/web/NfcDevice;)V", "cloud-api_release"}, k = 1, mv = {1, 5, 1})
public final class SyncAppletApiImpl implements SyncAppletApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final NfcBleApi bleApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final IDeviceApi deviceApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Function0<Boolean> withBleApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final NfcDevice device;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChangeCityType.values().length];
            iArr[ChangeCityType.IssueCard.ordinal()] = 1;
            iArr[ChangeCityType.DeleteCard.ordinal()] = 2;
            iArr[ChangeCityType.ChangeCity.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SyncAppletApiImpl(@NotNull NfcBleApi nfcBleApi, @NotNull IDeviceApi iDeviceApi, @NotNull Function0<Boolean> function0, @NotNull NfcDevice nfcDevice) {
        this.bleApi = nfcBleApi;
        this.deviceApi = iDeviceApi;
        this.withBleApi = function0;
        this.device = nfcDevice;
    }

    private final boolean a() {
        return NfcDeviceKt.isClassicDevice(this.device.getDeviceModel());
    }

    private final PayResponse<Unit> b(String appCode, ChangeCityType type) {
        String aid = CitySimpleInfoCache.INSTANCE.getAid(appCode);
        if (aid == null) {
            return PayResponse.Companion.error$default(PayResponse.INSTANCE, "没有匹配 " + appCode + " 的卡片", null, 2, null);
        }
        int i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            return this.deviceApi.issueApplet(aid, AppletType.BUS);
        }
        if (i == 2) {
            return this.deviceApi.deleteApplet(aid, AppletType.BUS);
        }
        if (i == 3) {
            return this.deviceApi.activeApplet(aid, AppletType.BUS);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final PayResponse<Unit> c(String appCode, ChangeCityType type) {
        CitySimpleInfo cityInfo = CitySimpleInfoCache.INSTANCE.getCityInfo(appCode);
        if (cityInfo == null) {
            return PayResponse.Companion.error$default(PayResponse.INSTANCE, "没有匹配 " + appCode + " 的卡片", null, 2, null);
        }
        int i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            return this.deviceApi.notifyAppletInfoForWatch(new AppletEntity(cityInfo.getAid(), null, 0, appCode, cityInfo.getName(), 2, null));
        }
        if (i == 2) {
            return this.deviceApi.deleteAppletForWatch(cityInfo.getAid(), AppletType.BUS);
        }
        if (i == 3) {
            return PayResponse.INSTANCE.success("success", null);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.huami.wallet.datasource.cloud.SyncAppletApi
    @NotNull
    public PayResponse<Unit> notifyToDevice(@NotNull String appCode, @NotNull ChangeCityType type) {
        return a() ? c(appCode, type) : b(appCode, type);
    }

    @Override // com.huami.wallet.datasource.cloud.SyncAppletApi
    @NotNull
    public PayResponse<Unit> syncAppletList(@NotNull List<? extends BusCardSimple2> list) {
        if (a()) {
            IDeviceApi iDeviceApi = this.deviceApi;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (BusCardSimple2 busCardSimple2 : list) {
                arrayList.add(new AppletEntity(busCardSimple2.aid, busCardSimple2.imageUrl, 0, busCardSimple2.id, busCardSimple2.cardNumber));
            }
            return iDeviceApi.notifyAppletInfoListForWatch(CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList));
        }
        if (!this.withBleApi.invoke().booleanValue()) {
            return PayResponse.INSTANCE.success("success, do nothing", null);
        }
        NfcBleApi nfcBleApi = this.bleApi;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((BusCardSimple2) it2.next()).aid);
        }
        return nfcBleApi.updateNfcCardListSync(arrayList2, AppletType.BUS);
    }
}
