package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import bv2.g;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    public class a implements c.InterfaceC0142c {
        public a() {
        }

        @Override // androidx.profileinstaller.c.InterfaceC0142c
        public final void a() {
            c.f10233b.getClass();
        }

        @Override // androidx.profileinstaller.c.InterfaceC0142c
        public final void b(int i14, Object obj) {
            c.f10233b.b(i14, obj);
            ProfileInstallReceiver.this.setResultCode(i14);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            c.b(context, new g(1), new a(), true);
            return;
        }
        if (!"androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
                a aVar = new a();
                Process.sendSignal(Process.myPid(), 10);
                aVar.b(12, null);
                return;
            }
            if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
                return;
            }
            String string = extras.getString("EXTRA_BENCHMARK_OPERATION");
            a aVar2 = new a();
            if ("DROP_SHADER_CACHE".equals(string)) {
                if (androidx.profileinstaller.a.a(Build.VERSION.SDK_INT >= 34 ? context.createDeviceProtectedStorageContext().getCacheDir() : context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
                    aVar2.b(14, null);
                    return;
                } else {
                    aVar2.b(15, null);
                    return;
                }
            }
            if (!"SAVE_PROFILE".equals(string)) {
                aVar2.b(16, null);
                return;
            } else {
                Process.sendSignal(extras.getInt("EXTRA_PID", Process.myPid()), 10);
                aVar2.b(12, null);
                return;
            }
        }
        Bundle extras2 = intent.getExtras();
        if (extras2 != null) {
            String string2 = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
            if (!"WRITE_SKIP_FILE".equals(string2)) {
                if ("DELETE_SKIP_FILE".equals(string2)) {
                    a aVar3 = new a();
                    c.a aVar4 = c.f10232a;
                    new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                    c.a aVar5 = c.f10232a;
                    aVar3.b(11, null);
                    return;
                }
                return;
            }
            a aVar6 = new a();
            c.a aVar7 = c.f10232a;
            try {
                c.a(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                c.a aVar8 = c.f10232a;
                aVar6.b(10, null);
            } catch (PackageManager.NameNotFoundException e4) {
                c.a aVar9 = c.f10232a;
                aVar6.b(7, e4);
            }
        }
    }
}
