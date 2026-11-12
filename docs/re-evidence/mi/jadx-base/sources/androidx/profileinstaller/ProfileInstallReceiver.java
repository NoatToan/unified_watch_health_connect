package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import defpackage.rbi;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    public class a implements c.InterfaceC0065c {
        public a() {
        }

        @Override // androidx.profileinstaller.c.InterfaceC0065c
        public void a(int i, Object obj) {
            c.f2775b.a(i, obj);
            ProfileInstallReceiver.this.setResultCode(i);
        }

        @Override // androidx.profileinstaller.c.InterfaceC0065c
        public void b(int i, Object obj) {
            c.f2775b.b(i, obj);
        }
    }

    public static void a(c.InterfaceC0065c interfaceC0065c) {
        Process.sendSignal(Process.myPid(), 10);
        interfaceC0065c.a(12, null);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            c.k(context, new rbi(), new a(), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if ("WRITE_SKIP_FILE".equals(string)) {
                    c.l(context, new rbi(), new a());
                    return;
                } else {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        c.c(context, new rbi(), new a());
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            a(new a());
            return;
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        a aVar = new a();
        if ("DROP_SHADER_CACHE".equals(string2)) {
            androidx.profileinstaller.a.b(context, aVar);
        } else {
            aVar.a(16, null);
        }
    }
}
