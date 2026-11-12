package com.xiaomi.fitness.configwifi;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import defpackage.av6;
import defpackage.ni4;
import defpackage.zzi;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BaseActivity f11830b;
    public b d;
    public boolean e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11829a = 0;
    public final HashMap<String, c> c = new HashMap<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.configwifi.a$a, reason: collision with other inner class name */
    public class C0386a extends av6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f11831a;

        public C0386a(String str) {
            this.f11831a = str;
        }

        @Override // defpackage.av6
        public void onDialogClick(String str, DialogInterface dialogInterface, int i) {
            super.onDialogClick(str, dialogInterface, i);
            if (i == -1) {
                dialogInterface.dismiss();
                a.this.e = false;
                if (a.this.d != null) {
                    a.this.d.onGoToSetting();
                    return;
                }
                return;
            }
            if (i == -2) {
                dialogInterface.dismiss();
                a.this.e = false;
                if (a.this.d != null) {
                    a.this.d.onPermissionDenied(this.f11831a);
                }
            }
        }
    }

    public interface b {
        void onAllPermissionGranted();

        void onGoToSetting();

        void onPermissionDenied(String str);
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f11833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f11834b;
        public int c;
        public int d;
        public boolean e;
        public boolean f;

        public c(String str, int i, int i2, int i3, boolean z) {
            this.f11834b = str;
            this.c = i2;
            this.d = i3;
            this.e = z;
            this.f11833a = i;
        }
    }

    public a(BaseActivity baseActivity) {
        this.f11830b = baseActivity;
    }

    public static void f(Context context) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.addFlags(268435456);
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        context.startActivity(intent);
    }

    public void c(String str, int i) {
        new PermissionDialog.Builder(this.f11830b.getString(i)).setPositiveText(zzi.x0).create().addDialogCallback(new C0386a(str)).showIfNeed(this.f11830b.getSupportFragmentManager());
    }

    public void d() {
        if (this.e) {
            return;
        }
        for (c cVar : this.c.values()) {
            if (!cVar.f && e(cVar.f11834b, cVar.c, cVar.f11833a) != 0) {
                return;
            }
        }
        b bVar = this.d;
        if (bVar != null) {
            bVar.onAllPermissionGranted();
        }
    }

    public final int e(String str, int i, int i2) {
        int iA = ni4.a(this.f11830b, str);
        ConfigWifiLogExtKt.logi(String.format("%s %d", str, Integer.valueOf(iA)));
        if (iA != 0) {
            if (androidx.core.app.a.z(this.f11830b, str)) {
                ConfigWifiLogExtKt.logi("showRequestPermissionRationale");
                c(str, i);
                this.e = true;
            } else {
                androidx.core.app.a.v(this.f11830b, new String[]{str}, i2);
                ConfigWifiLogExtKt.logi("requestPermissions");
            }
        }
        return iA;
    }

    public a g(b bVar) {
        this.d = bVar;
        return this;
    }

    public void h(int i, String[] strArr, @NotNull int[] iArr) {
        if (strArr == null || strArr.length == 0) {
            return;
        }
        ConfigWifiLogExtKt.logi(String.format("onRequestPermissionsResult %s %s", strArr[0], Integer.valueOf(iArr[0])));
        for (c cVar : this.c.values()) {
            if (cVar.f11833a == i) {
                if (iArr.length <= 0 || iArr[0] != 0) {
                    c cVar2 = this.c.get(strArr[0]);
                    if (cVar2.e) {
                        cVar2.f = true;
                        d();
                    } else {
                        c(strArr[0], cVar.d);
                        this.e = true;
                    }
                } else {
                    d();
                }
            }
        }
    }

    public a i(String str, int i, int i2) {
        j(str, i, i2, false);
        return this;
    }

    public a j(String str, int i, int i2, boolean z) {
        int i3 = this.f11829a + 1;
        this.f11829a = i3;
        this.c.put(str, new c(str, i3, i, i2, z));
        return this;
    }
}
