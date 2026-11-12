package com.huawei.wearengine.service.api;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.huawei.wearengine.NotifyManager;
import com.huawei.wearengine.auth.Permission;
import com.huawei.wearengine.common.WearEngineBiOperate;
import com.huawei.wearengine.core.common.ClientBinderDied;
import com.huawei.wearengine.core.device.PowerModeChangeManager;
import com.huawei.wearengine.device.Device;
import com.huawei.wearengine.notify.NotificationHarmony;
import com.huawei.wearengine.notify.NotificationParcel;
import com.huawei.wearengine.notify.NotificationTemplate;
import com.huawei.wearengine.notify.NotifyHanrmonyCallback;
import com.huawei.wearengine.notify.NotifySendCallback;
import com.huawei.wearengine.utils.DeviceProcessor;
import defpackage.yik;
import defpackage.yiq;
import defpackage.yit;
import defpackage.yiv;
import defpackage.yiw;
import defpackage.yjb;
import defpackage.yka;
import defpackage.ykl;
import defpackage.yln;
import defpackage.ylt;

/* JADX INFO: loaded from: classes46.dex */
public class NotifyManagerImpl extends NotifyManager.Stub implements ClientBinderDied {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private yiw f30803b;
    private yjb d;
    private yik e;

    public NotifyManagerImpl(yik yikVar, yiw yiwVar) {
        this.d = new yjb(yiwVar);
        this.e = yikVar;
        this.f30803b = yiwVar;
    }

    @Override // com.huawei.wearengine.NotifyManager
    public int notify(Device device, NotificationParcel notificationParcel, NotifySendCallback notifySendCallback) {
        yit.e("NotifyManagerImpl", "Start notify");
        yiq.c(device, "deviceId must not be null!");
        yiq.c(notificationParcel, "notificationParcel must not be null!");
        yiq.c(notifySendCallback, "notifySendCallback must not be null!");
        WearEngineBiOperate wearEngineBiOperate = new WearEngineBiOperate();
        wearEngineBiOperate.init();
        Context contextA = yiv.a();
        String strB = yln.b(Binder.getCallingUid(), contextA, this.f30803b.getApplicationIdByPid(Integer.valueOf(Binder.getCallingPid())));
        try {
            PowerModeChangeManager.a().e(true);
            this.e.b(strB, "notify", ykl.f53588c, Permission.NOTIFY);
            this.d.e(DeviceProcessor.processInputDevice(strB, device), notificationParcel, notifySendCallback);
            wearEngineBiOperate.biApiCalling(contextA, strB, "notify", String.valueOf(0));
            return 0;
        } catch (IllegalStateException e) {
            yit.b("NotifyManagerImpl", "notify illegalStateException");
            wearEngineBiOperate.biApiCalling(contextA, strB, "notify", String.valueOf(ylt.a(e)));
            throw e;
        }
    }

    @Override // com.huawei.wearengine.NotifyManager
    public int notifyHarmonyEx(Device device, NotificationHarmony notificationHarmony, final NotifyHanrmonyCallback notifyHanrmonyCallback) throws RemoteException {
        yit.a("NotifyManagerImpl", "Start notifyHarmonyEx");
        yiq.c(device, "deviceId must not be null!");
        yiq.c(notificationHarmony, "notificationHarmony must not be null!");
        yiq.c(notifyHanrmonyCallback, "notifyHanrmonyCallback must not be null!");
        return notify(device, b(notificationHarmony), new NotifySendCallback.Stub() { // from class: com.huawei.wearengine.service.api.NotifyManagerImpl.1
            @Override // com.huawei.wearengine.notify.NotifySendCallback
            public void onResult(NotificationParcel notificationParcel, int i) throws RemoteException {
                notifyHanrmonyCallback.onResult(NotifyManagerImpl.this.b(notificationParcel), i);
            }

            @Override // com.huawei.wearengine.notify.NotifySendCallback
            public void onError(NotificationParcel notificationParcel, int i) throws RemoteException {
                notifyHanrmonyCallback.onError(NotifyManagerImpl.this.b(notificationParcel), i);
            }
        });
    }

    @Override // com.huawei.wearengine.core.common.ClientBinderDied
    public void handleClientBinderDied(String str) {
        yit.a("NotifyManagerImpl", "handleClientBinderDied clientPkgName is: " + str);
    }

    private NotificationParcel b(NotificationHarmony notificationHarmony) {
        return new NotificationParcel(new yka.d().e(NotificationTemplate.getTemplateForTemplateId(notificationHarmony.getTemplateId())).b(notificationHarmony.getPackageName()).d(notificationHarmony.getTitle()).a(notificationHarmony.getText()).c(notificationHarmony.getButtonContents()).d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public NotificationHarmony b(NotificationParcel notificationParcel) {
        return new NotificationHarmony(new yka.d().e(NotificationTemplate.getTemplateForTemplateId(notificationParcel.getTemplateId())).b(notificationParcel.getPackageName()).d(notificationParcel.getTitle()).a(notificationParcel.getText()).c(notificationParcel.getButtonContents()).d());
    }
}
