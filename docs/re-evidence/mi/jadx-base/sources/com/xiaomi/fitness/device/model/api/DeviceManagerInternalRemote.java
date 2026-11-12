package com.xiaomi.fitness.device.model.api;

import android.os.RemoteException;
import com.xiaomi.fitness.device.manager.DeviceSwitcher;
import com.xiaomi.fitness.device.manager.a;
import com.xiaomi.fitness.device.manager.b;
import com.xiaomi.fitness.device.manager.bean.DeviceParameter;
import com.xiaomi.fitness.device.manager.c;
import com.xiaomi.fitness.device.manager.d;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.device.manager.export.bean.WearableProduct;
import com.xiaomi.fitness.device.manager.f;
import com.xiaomi.fitness.device.manager.g;
import com.xiaomi.fitness.device.manager.h;
import com.xiaomi.fitness.device.manager.l;
import com.xiaomi.fitness.device.manager.remote.DeviceModelRemote;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \u00062\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/device/model/api/DeviceManagerInternalRemote;", "Lcom/xiaomi/fitness/device/manager/c$a;", "Lcom/xiaomi/fitness/device/model/api/DeviceManagerInternal;", "Lcom/xiaomi/fitness/device/manager/DeviceSwitcher;", "<init>", "()V", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class DeviceManagerInternalRemote extends c.a implements DeviceManagerInternal, DeviceSwitcher {
    @Override // com.xiaomi.fitness.device.manager.c.a, com.xiaomi.fitness.device.manager.c
    public abstract /* synthetic */ void addAccessoryDeviceStateListener(f fVar) throws RemoteException;

    @Override // com.xiaomi.fitness.device.manager.c.a, com.xiaomi.fitness.device.manager.c
    public abstract /* synthetic */ void addDeviceChangeListener(g gVar) throws RemoteException;

    @Override // com.xiaomi.fitness.device.manager.c.a, com.xiaomi.fitness.device.manager.c
    public abstract /* synthetic */ void addDeviceStatusListener(h hVar) throws RemoteException;

    public abstract /* synthetic */ void bindDevice(DeviceParameter deviceParameter, a aVar) throws RemoteException;

    public abstract /* synthetic */ void cancelBind(String str) throws RemoteException;

    public abstract /* synthetic */ void connectDevice(boolean z, boolean z2) throws RemoteException;

    public abstract /* synthetic */ void connectLocalDevice(String str) throws RemoteException;

    public abstract /* synthetic */ void deauthorize(String str, l lVar) throws RemoteException;

    public abstract /* synthetic */ void disconnectDevice(String str) throws RemoteException;

    public abstract /* synthetic */ void ecoConnectDeviceByDid(boolean z, String str) throws RemoteException;

    public abstract /* synthetic */ DeviceModelRemote findDeviceModel(d dVar) throws RemoteException;

    public abstract /* synthetic */ List getAccessoryDeviceModels() throws RemoteException;

    public abstract /* synthetic */ int getAccessoryMode(String str) throws RemoteException;

    public abstract /* synthetic */ DeviceModelRemote getCurrentDeviceModel() throws RemoteException;

    public abstract /* synthetic */ String getCurrentPhoneSid() throws RemoteException;

    public abstract /* synthetic */ int getDeviceCapability(String str) throws RemoteException;

    public abstract /* synthetic */ int getDeviceCapabilityV2(String str) throws RemoteException;

    public abstract /* synthetic */ WearableDeviceInfo getDeviceInfo(String str) throws RemoteException;

    public abstract /* synthetic */ WearableDeviceInfo getDeviceInfoByModelFromAllDevice(String str) throws RemoteException;

    public abstract /* synthetic */ WearableDeviceInfo getDeviceInfoInAll(String str) throws RemoteException;

    public abstract /* synthetic */ List getDeviceInfoList() throws RemoteException;

    public abstract /* synthetic */ DeviceModelRemote getDeviceModel(String str) throws RemoteException;

    public abstract /* synthetic */ DeviceModelRemote getDeviceModelByMac(String str) throws RemoteException;

    public abstract /* synthetic */ List getDeviceModels() throws RemoteException;

    public abstract /* synthetic */ int getDeviceStatus(String str) throws RemoteException;

    public abstract /* synthetic */ DeviceModelRemote getLocalDeviceModel(String str) throws RemoteException;

    public abstract /* synthetic */ List getLocalDeviceModels() throws RemoteException;

    public abstract /* synthetic */ List getNeedKeepAliveDeviceModel() throws RemoteException;

    public abstract /* synthetic */ WearableProduct getProduct(String str) throws RemoteException;

    public abstract /* synthetic */ int getRequestStatus() throws RemoteException;

    public abstract /* synthetic */ boolean hasAccessoryMode(int i) throws RemoteException;

    public abstract /* synthetic */ boolean isConnectActive(String str) throws RemoteException;

    public abstract /* synthetic */ boolean isConnected(String str) throws RemoteException;

    public abstract /* synthetic */ boolean isCurrent(String str) throws RemoteException;

    @Override // com.xiaomi.fitness.device.manager.c.a, com.xiaomi.fitness.device.manager.c
    public abstract /* synthetic */ void removeAccessoryDeviceStateListener(f fVar) throws RemoteException;

    @Override // com.xiaomi.fitness.device.manager.c.a, com.xiaomi.fitness.device.manager.c
    public abstract /* synthetic */ void removeDeviceChangeListener(g gVar) throws RemoteException;

    public abstract /* synthetic */ void removeDeviceModel(String str) throws RemoteException;

    @Override // com.xiaomi.fitness.device.manager.c.a, com.xiaomi.fitness.device.manager.c
    public abstract /* synthetic */ void removeDeviceStatusListener(h hVar) throws RemoteException;

    public abstract /* synthetic */ void requestDeviceList(b bVar) throws RemoteException;

    public abstract /* synthetic */ void setDeviceInfo(WearableDeviceInfo wearableDeviceInfo) throws RemoteException;

    public abstract /* synthetic */ void setDeviceStatus(String str, int i) throws RemoteException;

    public abstract /* synthetic */ void switchDevice(String str) throws RemoteException;

    public abstract /* synthetic */ void switchDeviceWearMode(String str, int i, boolean z) throws RemoteException;

    public abstract /* synthetic */ void unbindBloodSugarDevice(String str, l lVar, boolean z) throws RemoteException;

    public abstract /* synthetic */ void unbindDevice(String str, l lVar) throws RemoteException;
}
