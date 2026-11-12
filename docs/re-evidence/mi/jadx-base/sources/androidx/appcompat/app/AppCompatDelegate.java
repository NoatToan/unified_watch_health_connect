package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RequiresApi;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.widget.Toolbar;
import androidx.collection.ArraySet;
import defpackage.df1;
import defpackage.goq;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class AppCompatDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f1425a = -100;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArraySet<WeakReference<AppCompatDelegate>> f1426b = new ArraySet<>();
    public static final Object c = new Object();

    public static void A(AppCompatDelegate appCompatDelegate) {
        synchronized (c) {
            B(appCompatDelegate);
        }
    }

    public static void B(AppCompatDelegate appCompatDelegate) {
        synchronized (c) {
            try {
                Iterator<WeakReference<AppCompatDelegate>> it = f1426b.iterator();
                while (it.hasNext()) {
                    AppCompatDelegate appCompatDelegate2 = it.next().get();
                    if (appCompatDelegate2 == appCompatDelegate || appCompatDelegate2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void D(boolean z) {
        goq.c(z);
    }

    public static void H(int i) {
        if ((i == -1 || i == 0 || i == 1 || i == 2 || i == 3) && f1425a != i) {
            f1425a = i;
            f();
        }
    }

    public static void c(AppCompatDelegate appCompatDelegate) {
        synchronized (c) {
            B(appCompatDelegate);
            f1426b.add(new WeakReference<>(appCompatDelegate));
        }
    }

    public static void f() {
        synchronized (c) {
            try {
                Iterator<WeakReference<AppCompatDelegate>> it = f1426b.iterator();
                while (it.hasNext()) {
                    AppCompatDelegate appCompatDelegate = it.next().get();
                    if (appCompatDelegate != null) {
                        appCompatDelegate.e();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static AppCompatDelegate i(Activity activity, df1 df1Var) {
        return new AppCompatDelegateImpl(activity, df1Var);
    }

    public static AppCompatDelegate j(Dialog dialog, df1 df1Var) {
        return new AppCompatDelegateImpl(dialog, df1Var);
    }

    public static int l() {
        return f1425a;
    }

    public abstract boolean C(int i);

    public abstract void E(int i);

    public abstract void F(View view);

    public abstract void G(View view, ViewGroup.LayoutParams layoutParams);

    @RequiresApi(17)
    public abstract void I(int i);

    public abstract void J(Toolbar toolbar);

    public void K(int i) {
    }

    public abstract void L(CharSequence charSequence);

    public abstract ActionMode M(ActionMode.Callback callback);

    public abstract void d(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean e();

    @Deprecated
    public void g(Context context) {
    }

    public Context h(Context context) {
        g(context);
        return context;
    }

    public abstract <T extends View> T k(int i);

    public abstract ActionBarDrawerToggle$Delegate m();

    public int n() {
        return -100;
    }

    public abstract MenuInflater o();

    public abstract ActionBar p();

    public abstract void q();

    public abstract void r();

    public abstract void s(Configuration configuration);

    public abstract void t(Bundle bundle);

    public abstract void u();

    public abstract void v(Bundle bundle);

    public abstract void w();

    public abstract void x(Bundle bundle);

    public abstract void y();

    public abstract void z();
}
