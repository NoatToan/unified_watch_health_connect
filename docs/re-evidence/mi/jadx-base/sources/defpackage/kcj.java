package defpackage;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.facebook.react.ReactActivity;
import com.facebook.react.bridge.Callback;

/* JADX INFO: loaded from: classes4.dex */
public class kcj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f23718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23719b;
    public gsh c;
    public Callback d;
    public zcj e;

    public class a implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f23720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String[] f23721b;
        public final /* synthetic */ int[] c;

        public a(int i, String[] strArr, int[] iArr) {
            this.f23720a = i;
            this.f23721b = strArr;
            this.c = iArr;
        }

        @Override // com.facebook.react.bridge.Callback
        public void invoke(Object... objArr) {
            if (kcj.this.c == null || !kcj.this.c.onRequestPermissionsResult(this.f23720a, this.f23721b, this.c)) {
                return;
            }
            kcj.this.c = null;
        }
    }

    public kcj(ReactActivity reactActivity, String str) {
        this.f23718a = reactActivity;
        this.f23719b = str;
    }

    public Context c() {
        return (Context) sk1.c(this.f23718a);
    }

    public Bundle d() {
        return null;
    }

    public String e() {
        return this.f23719b;
    }

    public Activity f() {
        return (Activity) c();
    }

    public xdj g() {
        ((mcj) f().getApplication()).a();
        return null;
    }

    public void h(String str) {
        this.e.e(str);
        f().setContentView(this.e.c());
    }

    public void i(int i, int i2, Intent intent) {
        this.e.f(i, i2, intent, true);
    }

    public boolean j() {
        return this.e.g();
    }

    public void k(Bundle bundle) {
        String strE = e();
        Activity activityF = f();
        g();
        this.e = new zcj(activityF, null, strE, d());
        if (this.f23719b != null) {
            h(strE);
        }
    }

    public void l() {
        this.e.h();
    }

    public boolean m(int i, KeyEvent keyEvent) {
        g();
        throw null;
    }

    public boolean n(int i, KeyEvent keyEvent) {
        g();
        throw null;
    }

    public boolean o(int i, KeyEvent keyEvent) {
        return this.e.k(i, keyEvent);
    }

    public boolean p(Intent intent) {
        g();
        throw null;
    }

    public void q() {
        this.e.i();
    }

    public void r(int i, String[] strArr, int[] iArr) {
        this.d = new a(i, strArr, iArr);
    }

    public void s() {
        this.e.j();
        Callback callback = this.d;
        if (callback != null) {
            callback.invoke(new Object[0]);
            this.d = null;
        }
    }

    public void t(boolean z) {
        g();
        throw null;
    }

    @TargetApi(23)
    public void u(String[] strArr, int i, gsh gshVar) {
        this.c = gshVar;
        f().requestPermissions(strArr, i);
    }
}
