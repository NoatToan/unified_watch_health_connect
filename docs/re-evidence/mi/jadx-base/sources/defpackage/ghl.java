package defpackage;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes2.dex */
public class ghl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f19005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f19006b = new b();
    public a c;

    public interface a {
        void a();

        void b();

        void c();
    }

    public class b extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (ghl.this.c == null) {
                return;
            }
            if ("android.intent.action.SCREEN_ON".equals(intent.getAction()) && !c.a(context)) {
                ghl.this.c.a();
                return;
            }
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                ghl.this.c.c();
            } else {
                if (!"android.intent.action.USER_PRESENT".equals(intent.getAction()) || c.a(context)) {
                    return;
                }
                ghl.this.c.b();
            }
        }

        public b() {
        }
    }

    public static class c {
        public static boolean a(Context context) {
            return ((KeyguardManager) context.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
        }
    }

    public ghl(Context context, a aVar) {
        this.f19005a = context;
        this.c = aVar;
    }

    public final void b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.f19005a.registerReceiver(this.f19006b, intentFilter);
    }

    public void c() {
        b();
    }
}
