package defpackage;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContext;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class fur implements a1d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference<Activity> f18265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x27 f18266b;
    public gsh c;
    public Callback d;
    public String e;
    public String f;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (fur.this.c() != null) {
                fur.this.c().R(fur.this.b());
            }
        }
    }

    public class b implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String[] f18268a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f18269b;
        public final /* synthetic */ int[] c;

        public b(String[] strArr, int i, int[] iArr) {
            this.f18268a = strArr;
            this.f18269b = i;
            this.c = iArr;
        }

        @Override // com.facebook.react.bridge.Callback
        public void invoke(Object... objArr) {
            gsh gshVar = fur.this.c;
            if (gshVar != null) {
                String[] strArr = this.f18268a;
                if (strArr.length <= 0 || !gshVar.onRequestPermissionsResult(this.f18269b, strArr, this.c)) {
                    return;
                }
                fur.this.c = null;
            }
        }
    }

    public fur(Activity activity) {
        this.f18265a = new WeakReference<>(activity);
    }

    @Override // defpackage.a1d
    public void a(String str, String str2) {
        this.e = str;
        this.f = str2;
    }

    public Activity b() {
        return this.f18265a.get();
    }

    public com.facebook.react.a c() {
        if (TextUtils.isEmpty(this.e)) {
            return null;
        }
        return jzr.e().f(this.e, this.f);
    }

    public void d(int i, int i2, Intent intent) {
        zxr.a("YRN_YRNV3_SDK", "YRNActivityDelegate.onActivityResult:" + b());
        if (c() != null) {
            c().O(b(), i, i2, intent);
        }
    }

    public boolean e() {
        zxr.a("YRN_YRNV3_SDK", "YRNActivityDelegate.onBackPressed:" + b());
        if (c() == null) {
            return false;
        }
        c().P();
        return true;
    }

    public void f(Configuration configuration) {
        if (qyr.b()) {
            k();
            m();
        }
    }

    public void g(Bundle bundle) {
        this.f18266b = new x27();
    }

    public void h() {
        zxr.a("YRN_YRNV3_SDK", "YRNActivityDelegate.onDestroy:" + b());
        if (c() != null) {
            new Handler().post(new a());
        }
    }

    public boolean i(int i, KeyEvent keyEvent) {
        if (c() == null || !vwr.g().k()) {
            return false;
        }
        if (i == 82) {
            c().i0();
            return true;
        }
        if (!((x27) sk1.c(this.f18266b)).b(i, b().getCurrentFocus())) {
            return false;
        }
        c().D().handleReloadJS();
        return true;
    }

    public boolean j(Intent intent) {
        if (c() == null || intent == null) {
            return false;
        }
        c().X(intent);
        return true;
    }

    public void k() {
        ReactContext reactContextC;
        zxr.a("YRN_YRNV3_SDK", "YRNActivityDelegate.onPause:" + b());
        if (jzr.e().b() != null && c() != null && (reactContextC = c().C()) != null && b() != null && b() == reactContextC.getCurrentActivity()) {
            try {
                c().T(b());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        jzr.e().i(null);
    }

    public void l(int i, String[] strArr, int[] iArr) {
        this.d = new b(strArr, i, iArr);
    }

    public void m() {
        zxr.a("YRN_YRNV3_SDK", "YRNActivityDelegate.onResume:" + b());
        jzr.e().i(b());
        if (c() != null) {
            if (b() instanceof fv5) {
                c().V(b(), (fv5) b());
            } else {
                c().U(b());
            }
        }
        Callback callback = this.d;
        if (callback != null) {
            callback.invoke(new Object[0]);
            this.d = null;
        }
    }

    @TargetApi(23)
    public void n(String[] strArr, int i, gsh gshVar) {
        this.c = gshVar;
        b().requestPermissions(strArr, i);
    }
}
