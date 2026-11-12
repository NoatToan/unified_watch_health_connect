package com.xiaomi.continuity;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import defpackage.uoe;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ContinuityListenerService extends Service {
    private static final String TAG = "ContinuityListenerService";
    private final b.a mRemote = new a();

    public class a extends b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f11176a = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ContinuityListenerService f11177b;

        public a() {
            this.f11177b = ContinuityListenerService.this;
        }

        @Override // com.xiaomi.continuity.b
        public void Y4(final Intent intent) {
            uoe.e(ContinuityListenerService.TAG, "onNotify:" + intent);
            intent.setExtrasClassLoader(ContinuityListenerService.this.getClassLoader());
            this.f11176a.post(new Runnable() { // from class: fj4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17837a.h4(intent);
                }
            });
        }

        public final /* synthetic */ void h4(Intent intent) {
            this.f11177b.onNotify(intent);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (Objects.equals(intent.getAction(), "com.xiaomi.continuity.action.STATIC_CONFIG_ACTION")) {
            return this.mRemote;
        }
        uoe.h(TAG, "Tried to bind to wrong intent (should be com.xiaomi.continuity.action.STATIC_CONFIG_ACTION): " + intent);
        return null;
    }

    public void onNotify(Intent intent) {
    }
}
