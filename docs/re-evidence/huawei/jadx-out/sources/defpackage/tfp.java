package defpackage;

import android.content.Context;
import android.os.Handler;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginmessagecenter.provider.data.MessageChangeEvent;
import com.huawei.pluginmessagecenter.service.MessageObserver;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import health.compact.a.Services;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class tfp {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f49072b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static tfp f49073c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f49074a;
    private boolean e;
    private tfn f;
    private DeviceSettingsInteractors h;
    private DeviceCapability i;
    private Handler o = null;
    private MessageObserver g = new MessageObserver() { // from class: tfp.3
        @Override // com.huawei.pluginmessagecenter.service.MessageObserver
        public void onChange(int i, MessageChangeEvent messageChangeEvent) {
            LogUtil.a("NotificationCardInteractors", "MessageObserver onChange start");
            if (messageChangeEvent == null) {
                return;
            }
            tfp.this.d();
        }
    };
    private Runnable k = new Runnable() { // from class: tfp.5
        @Override // java.lang.Runnable
        public void run() {
            tfp.this.f49074a = false;
            LogUtil.a("NotificationCardInteractors", "pushMessageToDevice weakHandler.postDelayed mPushFaqMessageState = false");
        }
    };
    private Context d = BaseApplication.getContext();
    private MessageCenterApi j = (MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class);

    public void a() {
    }

    public void a(IBaseResponseCallback iBaseResponseCallback) {
    }

    private tfp() {
        this.i = null;
        this.e = false;
        this.f49074a = false;
        this.e = false;
        this.f49074a = false;
        DeviceSettingsInteractors deviceSettingsInteractorsE = DeviceSettingsInteractors.e(this.d);
        this.h = deviceSettingsInteractorsE;
        this.i = deviceSettingsInteractorsE.d();
        this.f = tfn.a();
    }

    public static tfp e() {
        tfp tfpVar;
        synchronized (f49072b) {
            if (f49073c == null) {
                f49073c = new tfp();
            }
            tfpVar = f49073c;
        }
        return tfpVar;
    }

    public void d(Handler handler) {
        if (handler == null) {
            return;
        }
        this.o = handler;
        if (this.j == null || this.g == null) {
            return;
        }
        LogUtil.a("NotificationCardInteractors", "openMessageObserver registerMessageObserver");
        this.j.registerMessageObserver(this.g);
    }

    public void d() {
        if (this.e || this.f49074a) {
            LogUtil.a("NotificationCardInteractors", "getFAQMessageProcess mGetFaqMessgeState is true return!!!");
        } else {
            this.e = true;
            ThreadPoolManager.c().execute(new Runnable() { // from class: tfs
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.c();
                }
            });
        }
    }

    /* synthetic */ void c() {
        List<MessageObject> messages = this.j.getMessages(31);
        this.e = false;
        if (messages.isEmpty() || messages.size() <= 0) {
            return;
        }
        a(messages.get(0));
    }

    public void a(MessageObject messageObject) {
        tfn tfnVar;
        if (messageObject == null || (tfnVar = this.f) == null) {
            LogUtil.a("NotificationCardInteractors", "return MessageObject is null !!!");
            return;
        }
        LogUtil.a("NotificationCardInteractors", "Enter pushMessageToDevice !!!!! mDeviceStateInteractors.getCurrentDeviceType() = ", Integer.valueOf(tfnVar.o()));
        DeviceCapability deviceCapability = this.i;
        if (deviceCapability == null || !deviceCapability.isSupportMessageCenterPushDevice()) {
            LogUtil.a("NotificationCardInteractors", "return deviceCapability notSupport pushMessageToDevice !!!!! msgObj = ", messageObject.toString());
            if (this.f.o() != 10) {
                LogUtil.a("NotificationCardInteractors", "return deviceCapability notSupport pushMessageToDevice && not Leo!!!");
                return;
            }
        }
        LogUtil.a("NotificationCardInteractors", "pushMessageToDevice MessageObject = ", messageObject.toString());
        if (this.f49074a) {
            return;
        }
        long expireTime = messageObject.getExpireTime() / 1000;
        LogUtil.a("NotificationCardInteractors", "pushMessageToDevice !!!!! exprTime = " + expireTime);
        if (this.f.g() == 2) {
            this.f49074a = true;
            a(30000);
            mfj mfjVar = new mfj();
            mfjVar.d(messageObject.getMsgId());
            mfjVar.c(messageObject.getMsgType());
            mfjVar.c(expireTime);
            mfjVar.b(1);
            mfjVar.e(messageObject.getMsgTitle());
            mfjVar.c(messageObject.getMsgContent());
            mfjVar.e((byte[]) null);
            final String msgId = messageObject.getMsgId();
            mes.b().e(mfjVar, new IBaseResponseCallback() { // from class: tfp.2
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("NotificationCardInteractors", "onResponse errCode = ", Integer.valueOf(i), "  msgID = ", msgId);
                    if (i == 0) {
                        tfp.this.j.setMessageRead(msgId);
                    }
                    tfp.this.a(5000);
                }
            });
            return;
        }
        this.f49074a = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        Handler handler = this.o;
        if (handler != null) {
            handler.removeCallbacks(this.k);
            this.o.postDelayed(this.k, i);
        }
    }
}
