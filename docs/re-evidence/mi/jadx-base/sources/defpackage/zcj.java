package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.facebook.react.ReactRootView;

/* JADX INFO: loaded from: classes4.dex */
public class zcj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f41124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ReactRootView f41125b;
    public final String c;
    public Bundle d;
    public x27 e = new x27();

    public zcj(Activity activity, xdj xdjVar, String str, Bundle bundle) {
        this.f41124a = activity;
        this.c = str;
        this.d = bundle;
    }

    public ReactRootView a() {
        return new ReactRootView(this.f41124a);
    }

    public final xdj b() {
        return null;
    }

    public ReactRootView c() {
        return this.f41125b;
    }

    public void d() {
        e(this.c);
    }

    public void e(String str) {
        if (this.f41125b != null) {
            throw new IllegalStateException("Cannot loadApp while app is already running.");
        }
        this.f41125b = a();
        b();
        throw null;
    }

    public void f(int i, int i2, Intent intent, boolean z) {
        b();
        throw null;
    }

    public boolean g() {
        b();
        throw null;
    }

    public void h() {
        ReactRootView reactRootView = this.f41125b;
        if (reactRootView != null) {
            reactRootView.q();
            this.f41125b = null;
        }
        b();
        throw null;
    }

    public void i() {
        b();
        throw null;
    }

    public void j() {
        b();
        throw null;
    }

    public boolean k(int i, KeyEvent keyEvent) {
        b();
        throw null;
    }
}
