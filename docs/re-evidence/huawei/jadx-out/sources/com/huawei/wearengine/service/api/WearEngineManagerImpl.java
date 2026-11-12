package com.huawei.wearengine.service.api;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import com.huawei.wearengine.WearEngineManager;
import com.huawei.wearengine.auth.Permission;
import com.huawei.wearengine.common.WearEngineBiOperate;
import com.huawei.wearengine.connect.ServiceConnectCallback;
import com.huawei.wearengine.core.common.ClientBinderDied;
import defpackage.yii;
import defpackage.yik;
import defpackage.yit;
import defpackage.yiv;
import defpackage.yiw;
import defpackage.yjb;
import defpackage.ykl;
import defpackage.yln;
import defpackage.ylt;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes46.dex */
public class WearEngineManagerImpl extends WearEngineManager.Stub implements ClientBinderDied {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private yiw f30814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<Integer, IBinder> f30815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private yik f30816c;
    private yjb d;

    public WearEngineManagerImpl(yik yikVar, yiw yiwVar, ConcurrentHashMap<Integer, IBinder> concurrentHashMap) {
        this.d = new yjb(yiwVar);
        this.f30814a = yiwVar;
        this.f30815b = concurrentHashMap;
        this.f30816c = yikVar;
    }

    @Override // com.huawei.wearengine.core.common.ClientBinderDied
    public void handleClientBinderDied(String str) {
        if (!d()) {
            yit.b("WearEngineManagerImpl", "handleClientBinderDied checkPermission failed");
            return;
        }
        yit.a("WearEngineManagerImpl", "handleClientBinderDied clientPkgName:" + str);
    }

    @Override // com.huawei.wearengine.WearEngineManager
    public int registerConnectCallback(ServiceConnectCallback serviceConnectCallback) {
        yit.e("WearEngineManagerImpl", "Start registerConnectCallback");
        String strE = e();
        WearEngineBiOperate wearEngineBiOperateC = c();
        Context contextA = yiv.a();
        try {
            if (!d()) {
                yit.b("WearEngineManagerImpl", "registerConnectCallback checkPermission failed");
                throw new IllegalStateException(String.valueOf(8));
            }
            int iE = this.d.e(this.f30814a.e(yiv.e(), yiv.d()), serviceConnectCallback);
            wearEngineBiOperateC.biApiCalling(contextA, strE, "registerConnectCallback", String.valueOf(iE));
            return iE;
        } catch (IllegalStateException e) {
            int iA = ylt.a(e);
            wearEngineBiOperateC.biApiCalling(contextA, strE, "registerConnectCallback", String.valueOf(iA));
            return iA;
        }
    }

    @Override // com.huawei.wearengine.WearEngineManager
    public int unregisterConnectCallback(ServiceConnectCallback serviceConnectCallback) {
        yit.e("WearEngineManagerImpl", "Start unregisterConnectCallback");
        String strE = e();
        WearEngineBiOperate wearEngineBiOperateC = c();
        Context contextA = yiv.a();
        try {
            if (!d()) {
                yit.b("WearEngineManagerImpl", "unregisterConnectCallback checkPermission failed");
                throw new IllegalStateException(String.valueOf(8));
            }
            int iA = this.d.a(this.f30814a.e(yiv.e(), yiv.d()), serviceConnectCallback);
            wearEngineBiOperateC.biApiCalling(contextA, strE, "unregisterConnectCallback", String.valueOf(iA));
            return iA;
        } catch (IllegalStateException e) {
            int iA2 = ylt.a(e);
            wearEngineBiOperateC.biApiCalling(contextA, strE, "unregisterConnectCallback", String.valueOf(iA2));
            return iA2;
        }
    }

    @Override // com.huawei.wearengine.WearEngineManager
    public int releaseConnection() {
        yit.e("WearEngineManagerImpl", "releaseConnection start.");
        String strE = e();
        WearEngineBiOperate wearEngineBiOperateC = c();
        Context contextA = yiv.a();
        try {
            this.d.d();
            int iA = a(strE, yiv.e(), yiv.d(), wearEngineBiOperateC);
            wearEngineBiOperateC.biApiCalling(contextA, strE, "releaseConnection", String.valueOf(iA));
            return iA;
        } catch (IllegalStateException e) {
            int iA2 = ylt.a(e);
            wearEngineBiOperateC.biApiCalling(contextA, strE, "releaseConnection", String.valueOf(iA2));
            return iA2;
        }
    }

    @Override // com.huawei.wearengine.WearEngineManager.Stub, android.os.IInterface
    public IBinder asBinder() {
        if (d()) {
            return this;
        }
        yit.b("WearEngineManagerImpl", "asBinder checkPermission failed");
        return null;
    }

    private boolean d() {
        return Binder.getCallingUid() == getCallingUid();
    }

    private WearEngineBiOperate c() {
        WearEngineBiOperate wearEngineBiOperate = new WearEngineBiOperate();
        wearEngineBiOperate.init();
        return wearEngineBiOperate;
    }

    private String e() {
        return yln.b(Binder.getCallingUid(), yiv.a(), this.f30814a.getApplicationIdByPid(Integer.valueOf(Binder.getCallingPid())));
    }

    private int a(String str, int i, int i2, WearEngineBiOperate wearEngineBiOperate) {
        int iA;
        int iD;
        if (this.f30815b == null) {
            yit.b("WearEngineManagerImpl", "clean mBinderMap is null");
            return 12;
        }
        yit.e("WearEngineManagerImpl", "clean callingPkgName: " + str + " callingPid:" + i2);
        int iA2 = this.f30816c.a(new yii(i, i2, str), wearEngineBiOperate, "releaseConnection", ykl.e, Permission.DEVICE_MANAGER);
        if (iA2 == 0 && (iD = d(i2)) != 0) {
            return iD;
        }
        if (iA2 != 0) {
            iA2 = this.f30816c.a(new yii(i, i2, str), wearEngineBiOperate, "releaseConnection", ykl.i, Permission.WEAR_USER_STATUS);
        }
        if (iA2 == 0 && (iA = a(str)) != 0) {
            return iA;
        }
        int iA3 = this.f30816c.a(new yii(i, i2, str), wearEngineBiOperate, "releaseConnection", ykl.f53587b, Permission.SENSOR);
        if (iA3 != 0) {
            iA3 = this.f30816c.a(new yii(i, i2, str), wearEngineBiOperate, "releaseConnection", ykl.f53586a, Permission.MOTION_SENSOR);
        }
        if (iA3 != 0) {
            return 0;
        }
        d(str);
        return 0;
    }

    private int d(int i) {
        IBinder iBinder = this.f30815b.get(2);
        if (iBinder instanceof P2pManagerImpl) {
            int iA = ((P2pManagerImpl) iBinder).a(i);
            if (iA == 0) {
                return 0;
            }
            yit.b("WearEngineManagerImpl", "removeReceiver failed, ret:" + iA);
            return iA;
        }
        yit.e("WearEngineManagerImpl", "p2pBinder is null, no need to remove receiver");
        return 0;
    }

    private int a(String str) {
        IBinder iBinder = this.f30815b.get(3);
        if (iBinder instanceof MonitorManagerImpl) {
            int iB = ((MonitorManagerImpl) iBinder).b(str);
            if (iB == 0) {
                return 0;
            }
            yit.b("WearEngineManagerImpl", "removeMonitorReceiver failed, ret:" + iB);
            return iB;
        }
        yit.e("WearEngineManagerImpl", "monitorManager is null, no need to remove receiver");
        return 0;
    }

    private void d(String str) {
        IBinder iBinder = this.f30815b.get(7);
        if (iBinder instanceof SensorManagerImpl) {
            ((SensorManagerImpl) iBinder).a(str);
        } else {
            yit.e("WearEngineManagerImpl", "sensorManager is null, no need to stop sensor");
        }
    }
}
