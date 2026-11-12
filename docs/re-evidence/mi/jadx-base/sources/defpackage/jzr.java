package defpackage;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class jzr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l1d f23276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference<Activity> f23277b;
    public String c;
    public String d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final jzr f23278a = new jzr();
    }

    public static jzr e() {
        return b.f23278a;
    }

    public h1d a(String str) {
        gur gurVarD = vwr.g().d(str);
        return (gurVarD == null || gurVarD.l() == null) ? new kwr() : gurVarD.l();
    }

    public Activity b() {
        WeakReference<Activity> weakReference = this.f23277b;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public String c() {
        return this.d;
    }

    public l1d d() {
        return this.f23276a;
    }

    public com.facebook.react.a f(String str, String str2) {
        fwr fwrVarD;
        l1d l1dVar = this.f23276a;
        if (l1dVar == null || (fwrVarD = l1dVar.d(str, str2)) == null) {
            return null;
        }
        return fwrVarD.o();
    }

    public void g(l1d l1dVar) {
        sk1.c(l1dVar);
        this.f23276a = l1dVar;
    }

    public Fragment h(String str, String str2, Bundle bundle) {
        return hyr.a(str, str2, bundle);
    }

    public void i(Activity activity) {
        if (activity == null) {
            this.f23277b = null;
        } else {
            this.f23277b = new WeakReference<>(activity);
        }
    }

    public void j(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public jzr() {
    }
}
