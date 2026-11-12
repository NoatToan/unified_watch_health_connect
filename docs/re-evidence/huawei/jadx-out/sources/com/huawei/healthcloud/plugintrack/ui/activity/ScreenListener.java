package com.huawei.healthcloud.plugintrack.ui.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.huawei.haf.application.BroadcastManager;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.ixq;

/* JADX INFO: loaded from: classes10.dex */
public class ScreenListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f10880c;
    private ScreenStateListener e;

    public interface ScreenStateListener {
        void onScreenOff();

        void onScreenOn();

        void onUserPresent();
    }

    public ScreenListener(Context context) {
        if (context == null) {
            throw new RuntimeException("ScreenListener invalid params.");
        }
        this.f10880c = new c();
    }

    public void b(ScreenStateListener screenStateListener) {
        this.e = screenStateListener;
        BroadcastManager.i(this.f10880c);
    }

    public void a() {
        BroadcastManager.p(this.f10880c);
        ixq.a(false);
    }

    class c extends BroadcastReceiver {
        private c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || context == null) {
                return;
            }
            String action = intent.getAction();
            if (!"android.intent.action.SCREEN_ON".equals(action)) {
                if (!"android.intent.action.SCREEN_OFF".equals(action)) {
                    if (!"android.intent.action.USER_PRESENT".equals(action)) {
                        LogUtil.a("Track_ScreenListener", "unknow action");
                    } else if (ScreenListener.this.e != null) {
                        ScreenListener.this.e.onUserPresent();
                    }
                } else {
                    if (ScreenListener.this.e != null) {
                        ScreenListener.this.e.onScreenOff();
                    }
                    ixq.a(true);
                }
            } else {
                if (ScreenListener.this.e != null) {
                    ScreenListener.this.e.onScreenOn();
                }
                ixq.a(false);
            }
            LogUtil.j("Track_ScreenListener", "ScreenBroadcastReceiver intent:", intent.getAction());
        }
    }
}
