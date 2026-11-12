package com.xiaomi.idm.notify;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.xiaomi.mi_connect_service.IIDMStaticConfigService;
import defpackage.gpe;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public class MiConnectNotifyService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IIDMStaticConfigService.Stub f13585a = new a();

    public class a extends IIDMStaticConfigService.Stub {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f13586a = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MiConnectNotifyService f13587b;

        public a() {
            this.f13587b = MiConnectNotifyService.this;
        }

        public final /* synthetic */ void h4(Intent intent) {
            this.f13587b.a(intent);
        }

        @Override // com.xiaomi.mi_connect_service.IIDMStaticConfigService
        public void onMiConnectNotify(final Intent intent) {
            gpe.a("MiConnectNotifyService: ", "onMiConnectNotify:", new Object[0]);
            this.f13586a.post(new Runnable() { // from class: suf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33996a.h4(intent);
                }
            });
        }
    }

    public void a(Intent intent) {
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (Objects.equals(intent.getAction(), "com.xiaomi.mi_connect_service.action.STATIC_CONFIG_ACTION")) {
            return this.f13585a;
        }
        gpe.i("MiConnectNotifyService: ", "onBind: Tried to bind to wrong intent " + intent.getAction(), new Object[0]);
        return null;
    }
}
