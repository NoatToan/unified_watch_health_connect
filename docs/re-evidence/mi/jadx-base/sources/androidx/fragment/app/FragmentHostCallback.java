package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.RestrictTo;
import defpackage.aaa;
import defpackage.g6i;
import defpackage.ni4;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentHostCallback<E> extends FragmentContainer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f2339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f2340b;
    public final Handler c;
    public final int d;
    public final FragmentManager e;

    public FragmentHostCallback(FragmentActivity fragmentActivity) {
        this(fragmentActivity, fragmentActivity, new Handler(), 0);
    }

    @Override // androidx.fragment.app.FragmentContainer
    public View c(int i) {
        return null;
    }

    @Override // androidx.fragment.app.FragmentContainer
    public boolean d() {
        return true;
    }

    public Activity e() {
        return this.f2339a;
    }

    public Context f() {
        return this.f2340b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Handler g() {
        return this.c;
    }

    public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public abstract E i();

    public LayoutInflater j() {
        return LayoutInflater.from(this.f2340b);
    }

    @Deprecated
    public void k(Fragment fragment, String[] strArr, int i) {
    }

    public boolean l(String str) {
        return false;
    }

    public void m(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        ni4.n(this.f2340b, intent, bundle);
    }

    @Deprecated
    public void n(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        androidx.core.app.a.B(this.f2339a, intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void o() {
    }

    public FragmentHostCallback(Activity activity, Context context, Handler handler, int i) {
        this.e = new aaa();
        this.f2339a = activity;
        this.f2340b = (Context) g6i.h(context, "context == null");
        this.c = (Handler) g6i.h(handler, "handler == null");
        this.d = i;
    }
}
