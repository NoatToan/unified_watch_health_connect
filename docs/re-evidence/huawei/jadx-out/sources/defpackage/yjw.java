package defpackage;

import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.Tasks;
import com.huawei.wearengine.device.Device;
import com.huawei.wearengine.notify.Action;
import com.huawei.wearengine.notify.NotificationParcel;
import com.huawei.wearengine.notify.NotifySendCallback;
import defpackage.yio;
import defpackage.yis;
import defpackage.yka;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes20.dex */
public final class yjw {
    private yjz e;

    private yjw() {
        this.e = new yjz();
    }

    static class e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final yjw f53536c = new yjw();
    }

    public static yjw d() {
        return e.f53536c;
    }

    public Task<Void> a(final Device device, final yka ykaVar) {
        return Tasks.callInBackground(new Callable<Void>() { // from class: yjw.2
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Void call() {
                yir.d(device, "deviceId can not be null!");
                yir.d(ykaVar, "notification can not be null!");
                yjw.this.c(ykaVar);
                NotifySendCallback.Stub stubB = yjw.this.b(ykaVar.c());
                int iNotify = yjw.this.e.notify(device, new NotificationParcel(ykaVar), stubB);
                if (iNotify == 0) {
                    return null;
                }
                throw new yib(iNotify);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public NotifySendCallback.Stub b(final Action action) {
        return new NotifySendCallback.Stub() { // from class: com.huawei.wearengine.notify.NotifyClient$2
            @Override // com.huawei.wearengine.notify.NotifySendCallback
            public void onResult(NotificationParcel notificationParcel, int i) {
                if (notificationParcel == null) {
                    yis.d("NotifyClient", "getNotifySendCallback onResult NotificationParcel is null");
                    return;
                }
                Action action2 = action;
                if (action2 == null) {
                    yis.d("NotifyClient", "action is null");
                } else {
                    action2.onResult(new yka.d().e(NotificationTemplate.getTemplateForTemplateId(notificationParcel.getTemplateId())).b(notificationParcel.getPackageName()).d(notificationParcel.getTitle()).a(notificationParcel.getText()).d(), i);
                }
            }

            @Override // com.huawei.wearengine.notify.NotifySendCallback
            public void onError(NotificationParcel notificationParcel, int i) {
                if (notificationParcel == null) {
                    yis.d("NotifyClient", "getNotifySendCallback onError NotificationParcel is null");
                    return;
                }
                Action action2 = action;
                if (action2 == null) {
                    yis.d("NotifyClient", "action is null");
                } else {
                    action2.onError(new yka.d().e(NotificationTemplate.getTemplateForTemplateId(notificationParcel.getTemplateId())).b(notificationParcel.getPackageName()).d(notificationParcel.getTitle()).a(notificationParcel.getText()).d(), yio.e(String.valueOf(i)), yio.b(i));
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(yka ykaVar) {
        ylw.b(ykaVar.e());
        yir.c(ykaVar.b(), 28);
        yir.c(ykaVar.f(), 28);
        yir.c(ykaVar.d(), 400);
        ylw.b(ykaVar);
    }
}
