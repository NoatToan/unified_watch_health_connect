package dagger.hilt.android.internal.managers;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import defpackage.d5a;
import defpackage.e6i;
import defpackage.hc8;
import defpackage.sxa;

/* JADX INFO: loaded from: classes2.dex */
public class a implements sxa<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f15312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f15313b = new Object();
    public final Fragment c;

    /* JADX INFO: renamed from: dagger.hilt.android.internal.managers.a$a, reason: collision with other inner class name */
    public interface InterfaceC0910a {
        d5a Y0();
    }

    public a(Fragment fragment) {
        this.c = fragment;
    }

    private Object a() {
        e6i.c(this.c.getHost(), "Hilt Fragments must be attached before creating the component.");
        e6i.d(this.c.getHost() instanceof sxa, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", this.c.getHost().getClass());
        e(this.c);
        return ((InterfaceC0910a) hc8.a(this.c.getHost(), InterfaceC0910a.class)).Y0().a(this.c).build();
    }

    public static ContextWrapper b(Context context, Fragment fragment) {
        return new ViewComponentManager.FragmentContextWrapper(context, fragment);
    }

    public static ContextWrapper c(LayoutInflater layoutInflater, Fragment fragment) {
        return new ViewComponentManager.FragmentContextWrapper(layoutInflater, fragment);
    }

    public static final Context d(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public void e(Fragment fragment) {
    }

    @Override // defpackage.sxa
    public Object generatedComponent() {
        if (this.f15312a == null) {
            synchronized (this.f15313b) {
                try {
                    if (this.f15312a == null) {
                        this.f15312a = a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f15312a;
    }
}
