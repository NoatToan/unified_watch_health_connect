package com.huawei.hwdevice.phoneprocess.mgr.hwintelligentmgr;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.huawei.haf.application.BroadcastManager;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class HiAiScreenListener {
    private ScreenStateListener d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f17496b = false;
    private final d e = new d();

    public interface ScreenStateListener {
        void onScreenOff();

        void onScreenOn();

        void onUserPresent();
    }

    public void b(ScreenStateListener screenStateListener) {
        if (screenStateListener == null) {
            throw new IllegalArgumentException("listener cannot be null");
        }
        synchronized (this) {
            if (this.f17496b) {
                LogUtil.j("Track_HiAiScreenListener", "HiAiScreenListener already registered");
                return;
            }
            this.d = screenStateListener;
            BroadcastManager.i(this.e);
            this.f17496b = true;
        }
    }

    public void b() {
        synchronized (this) {
            if (this.f17496b) {
                BroadcastManager.p(this.e);
                this.d = null;
                this.f17496b = false;
            }
        }
    }

    class d extends BroadcastReceiver {
        private d() {
        }

        /* JADX WARN: Code duplicated, block: B:27:0x004f  */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            byte b2;
            if (intent == null || context == null) {
                LogUtil.j("Track_HiAiScreenListener", "Received null intent or context");
                return;
            }
            String action = intent.getAction();
            if (action == null) {
                LogUtil.j("Track_HiAiScreenListener", "Received null action");
                return;
            }
            action.hashCode();
            int iHashCode = action.hashCode();
            if (iHashCode != -2128145023) {
                if (iHashCode != -1454123155) {
                    if (iHashCode == 823795052 && action.equals("android.intent.action.USER_PRESENT")) {
                        b2 = 2;
                    } else {
                        b2 = -1;
                    }
                } else if (action.equals("android.intent.action.SCREEN_ON")) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
            } else if (action.equals("android.intent.action.SCREEN_OFF")) {
                b2 = 0;
            } else {
                b2 = -1;
            }
            if (b2 != 0) {
                if (b2 != 1) {
                    if (b2 == 2) {
                        if (HiAiScreenListener.this.d != null) {
                            HiAiScreenListener.this.d.onUserPresent();
                        }
                    } else {
                        LogUtil.a("Track_HiAiScreenListener", "Unknown action: " + action);
                    }
                } else if (HiAiScreenListener.this.d != null) {
                    HiAiScreenListener.this.d.onScreenOn();
                }
            } else if (HiAiScreenListener.this.d != null) {
                HiAiScreenListener.this.d.onScreenOff();
            }
            LogUtil.d("Track_HiAiScreenListener", "ScreenBroadcastReceiver received action: " + action);
        }
    }
}
