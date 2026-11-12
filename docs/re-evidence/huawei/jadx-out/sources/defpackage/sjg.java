package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.health.utils.functionsetcard.manager.constructor.CardConstructor;
import com.huawei.health.health.utils.functionsetcard.manager.model.CardConfig;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.functionsetcard.manager.ICardManager;
import com.huawei.ui.homehealth.functionsetcard.manager.strategy.CardShowStrategy;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class sjg implements CardShowStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f48169a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ICardManager f48170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BroadcastReceiver f48171c;

    public sjg(ICardManager iCardManager) {
        this.f48170b = iCardManager;
        c();
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.strategy.CardShowStrategy
    public void doStrategy() {
        a();
        e();
        c();
    }

    @Override // com.huawei.ui.homehealth.functionsetcard.manager.strategy.CardShowStrategy
    public void release() {
        d();
    }

    private void e() {
        this.f48171c = new BroadcastReceiver() { // from class: sjg.5
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                DeviceInfo deviceInfo;
                if (intent == null) {
                    ReleaseLogUtil.a("FunctionCard_DeviceAbilityStrategy", "setOnBindDeviceListener BroadcastReceiver intent is null");
                    return;
                }
                if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction()) && (deviceInfo = (DeviceInfo) intent.getParcelableExtra("deviceinfo")) != null) {
                    if (deviceInfo.getDeviceConnectState() != 2) {
                        ReleaseLogUtil.d("FunctionCard_DeviceAbilityStrategy", "DEVICE_CONNECT_STATUS_OTHER");
                        return;
                    }
                    DeviceCapability deviceCapabilityA = eej.a(deviceInfo.getDeviceIdentify());
                    if (deviceCapabilityA != null) {
                        sjg.this.c(deviceCapabilityA);
                    }
                    ReleaseLogUtil.d("FunctionCard_DeviceAbilityStrategy", "DEVICE_CONNECTED");
                }
            }
        };
    }

    private void c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        BroadcastManagerUtil.c(BaseApplication.getContext(), this.f48171c, intentFilter, LocalBroadcast.f36595c, null);
        LogUtil.a("FunctionCard_DeviceAbilityStrategy", "registerBindingDeviceBroadcastReceiver");
        this.f48169a = true;
    }

    private void d() {
        ReleaseLogUtil.d("FunctionCard_DeviceAbilityStrategy", "release mConnectStateChangedReceiver broadCast start");
        if (!this.f48169a || this.f48171c == null) {
            return;
        }
        try {
            BaseApplication.getContext().unregisterReceiver(this.f48171c);
        } catch (IllegalArgumentException unused) {
            ReleaseLogUtil.d("FunctionCard_DeviceAbilityStrategy", "unregisterReceiver crash Illegal");
        }
        this.f48169a = false;
    }

    private void a() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "FunctionCard_DeviceAbilityStrategy");
        List<DeviceInfo> deviceList2 = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_AW70_DEVICES, null, "FunctionCard_DeviceAbilityStrategy");
        if (coq.d(deviceList)) {
            deviceList = deviceList2;
        } else if (!eel.d(deviceList.get(0).getProductType()) && !coq.d(deviceList2)) {
            deviceList.addAll(deviceList2);
        }
        if (njy.e(deviceList)) {
            ReleaseLogUtil.e("FunctionCard_DeviceAbilityStrategy", "startLongTermStrategy connectDeviceList is null");
            return;
        }
        ArrayList arrayList = new ArrayList(deviceList.size());
        Iterator<DeviceInfo> it = deviceList.iterator();
        while (it.hasNext()) {
            DeviceCapability deviceCapabilityA = eej.a(it.next().getDeviceIdentify());
            if (deviceCapabilityA == null) {
                ReleaseLogUtil.e("FunctionCard_DeviceAbilityStrategy", "getMarketParams capability is null");
            } else {
                arrayList.add(deviceCapabilityA);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ReleaseLogUtil.d("FunctionCard_DeviceAbilityStrategy", "deviceCapabilityList deviceCapabilityList.size:" + arrayList.size());
        d(arrayList);
    }

    private void d(List<DeviceCapability> list) {
        if (this.f48170b == null) {
            LogUtil.j("FunctionCard_DeviceAbilityStrategy", "addDeviceCapabilityCard mCardImpl is null");
            return;
        }
        ReleaseLogUtil.d("FunctionCard_DeviceAbilityStrategy", "addDeviceCapabilityCard start");
        List<CardConfig> uninitializedCardsFromCache = this.f48170b.getUninitializedCardsFromCache();
        if (njy.e(uninitializedCardsFromCache) || njy.e(list)) {
            ReleaseLogUtil.a("FunctionCard_DeviceAbilityStrategy", "addDeviceCapabilityCard---end--return---");
            return;
        }
        ArrayList arrayList = new ArrayList(uninitializedCardsFromCache.size());
        for (CardConfig cardConfig : uninitializedCardsFromCache) {
            CardConstructor cardConstructorById = this.f48170b.getCardConstructorById(cardConfig.getCardId());
            if (cardConstructorById != null && cardConstructorById.getShowFlag(list) == 1) {
                ReleaseLogUtil.d("FunctionCard_DeviceAbilityStrategy", "addDeviceCapabilityCard---cardConstructor support Card Id is" + cardConfig.getCardId());
                arrayList.add(cardConfig.getCardId());
            }
        }
        this.f48170b.onShowStatusChanged(arrayList, true, -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Object obj) {
        if (obj instanceof DeviceCapability) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add((DeviceCapability) obj);
            d(arrayList);
        }
    }
}
