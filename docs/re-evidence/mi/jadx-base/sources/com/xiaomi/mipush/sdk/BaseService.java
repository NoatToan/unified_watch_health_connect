package com.xiaomi.mipush.sdk;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import defpackage.x9s;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes11.dex */
public abstract class BaseService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f13624a;

    public static class a extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<BaseService> f13625a;

        public a(WeakReference<BaseService> weakReference) {
            this.f13625a = weakReference;
        }

        public void a() {
            if (hasMessages(1001)) {
                removeMessages(1001);
            }
            sendEmptyMessageDelayed(1001, 1000L);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeakReference<BaseService> weakReference;
            BaseService baseService;
            if (message.what != 1001 || (weakReference = this.f13625a) == null || (baseService = weakReference.get()) == null) {
                return;
            }
            x9s.B("TimeoutHandler " + baseService.toString() + " kill self");
            if (!baseService.mo673a()) {
                baseService.stopSelf();
            } else {
                x9s.B("TimeoutHandler has job");
                sendEmptyMessageDelayed(1001, 1000L);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo673a();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i) {
        super.onStart(intent, i);
        if (this.f13624a == null) {
            this.f13624a = new a(new WeakReference(this));
        }
        this.f13624a.a();
    }
}
