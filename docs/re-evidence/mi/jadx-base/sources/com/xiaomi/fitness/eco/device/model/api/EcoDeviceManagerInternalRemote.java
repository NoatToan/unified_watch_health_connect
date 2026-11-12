package com.xiaomi.fitness.eco.device.model.api;

import android.os.RemoteException;
import com.xiaomi.fitness.device.manager.l;
import com.xiaomi.fitness.eco.device.manager.a;
import com.xiaomi.fitness.eco.device.manager.b;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDeviceInfo;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoProduct;
import com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceModelRemote;
import defpackage.g8h;
import defpackage.hbk;
import defpackage.sh7;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \u00052\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/eco/device/model/api/EcoDeviceManagerInternalRemote;", "Lcom/xiaomi/fitness/eco/device/manager/a$a;", "Lcom/xiaomi/fitness/eco/device/model/api/EcoDeviceManagerInternal;", "<init>", "()V", "Companion", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class EcoDeviceManagerInternalRemote extends a.AbstractBinderC0549a implements EcoDeviceManagerInternal {
    @Override // com.xiaomi.fitness.eco.device.manager.a.AbstractBinderC0549a, com.xiaomi.fitness.eco.device.manager.a
    public abstract /* synthetic */ void addDeviceStatusListener(g8h g8hVar) throws RemoteException;

    public abstract /* synthetic */ void bindDevice(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, sh7 sh7Var) throws RemoteException;

    public abstract /* synthetic */ void cancelBind(String str) throws RemoteException;

    public abstract /* synthetic */ void connectLocalDevice(String str) throws RemoteException;

    public abstract /* synthetic */ void deauthorize(String str, l lVar) throws RemoteException;

    public abstract /* synthetic */ void disconnectDevice(String str) throws RemoteException;

    public abstract /* synthetic */ void ecoConnectDeviceByDid(boolean z, String str) throws RemoteException;

    public abstract /* synthetic */ void ecoFetchDeviceInfoList() throws RemoteException;

    public abstract /* synthetic */ EcoDeviceModelRemote findDeviceModel(b bVar) throws RemoteException;

    public abstract /* synthetic */ EcoDeviceInfo getDeviceInfo(String str) throws RemoteException;

    public abstract /* synthetic */ EcoDeviceInfo getDeviceInfoInAll(String str) throws RemoteException;

    public abstract /* synthetic */ List getDeviceInfoList() throws RemoteException;

    public abstract /* synthetic */ EcoDeviceModelRemote getDeviceModel(String str) throws RemoteException;

    public abstract /* synthetic */ EcoDeviceModelRemote getDeviceModelByMac(String str) throws RemoteException;

    public abstract /* synthetic */ List getDeviceModels() throws RemoteException;

    public abstract /* synthetic */ int getDeviceStatus(String str) throws RemoteException;

    public abstract /* synthetic */ EcoDeviceModelRemote getLocalDeviceModel(String str) throws RemoteException;

    public abstract /* synthetic */ EcoProduct getProduct(String str) throws RemoteException;

    public abstract /* synthetic */ boolean isConnectActive(String str) throws RemoteException;

    public abstract /* synthetic */ boolean isConnected(String str) throws RemoteException;

    public abstract /* synthetic */ void refreshEcoList(hbk hbkVar) throws RemoteException;

    public abstract /* synthetic */ void removeDeviceModel(String str) throws RemoteException;

    @Override // com.xiaomi.fitness.eco.device.manager.a.AbstractBinderC0549a, com.xiaomi.fitness.eco.device.manager.a
    public abstract /* synthetic */ void removeDeviceStatusListener(g8h g8hVar) throws RemoteException;

    public abstract /* synthetic */ void setDeviceInfo(EcoDeviceInfo ecoDeviceInfo) throws RemoteException;

    public abstract /* synthetic */ void setDeviceStatus(String str, int i) throws RemoteException;

    public abstract /* synthetic */ void unbindDevice(String str, l lVar) throws RemoteException;
}
