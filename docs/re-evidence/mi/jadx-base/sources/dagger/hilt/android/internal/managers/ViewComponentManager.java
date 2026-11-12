package dagger.hilt.android.internal.managers;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import defpackage.e6i;
import defpackage.hc8;
import defpackage.jsq;
import defpackage.sxa;
import defpackage.uyq;
import defpackage.zi4;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewComponentManager implements sxa<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f15307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f15308b = new Object();
    public final boolean c;
    public final View d;

    public interface a {
        jsq G();
    }

    public interface b {
        uyq N();
    }

    public ViewComponentManager(View view, boolean z) {
        this.d = view;
        this.c = z;
    }

    private Object a() {
        sxa<?> sxaVarB = b(false);
        return this.c ? ((b) hc8.a(sxaVarB, b.class)).N().a(this.d).build() : ((a) hc8.a(sxaVarB, a.class)).G().a(this.d).build();
    }

    public static Context d(Context context, Class<?> cls) {
        while ((context instanceof ContextWrapper) && !cls.isInstance(context)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public final sxa<?> b(boolean z) {
        if (this.c) {
            Context contextC = c(FragmentContextWrapper.class, z);
            if (contextC instanceof FragmentContextWrapper) {
                return (sxa) ((FragmentContextWrapper) contextC).d();
            }
            if (z) {
                return null;
            }
            Context contextC2 = c(sxa.class, z);
            e6i.d(!(contextC2 instanceof sxa), "%s, @WithFragmentBindings Hilt view must be attached to an @AndroidEntryPoint Fragment. Was attached to context %s", this.d.getClass(), contextC2.getClass().getName());
        } else {
            Object objC = c(sxa.class, z);
            if (objC instanceof sxa) {
                return (sxa) objC;
            }
            if (z) {
                return null;
            }
        }
        throw new IllegalStateException(String.format("%s, Hilt view must be attached to an @AndroidEntryPoint Fragment or Activity.", this.d.getClass()));
    }

    public final Context c(Class<?> cls, boolean z) {
        Context contextD = d(this.d.getContext(), cls);
        if (contextD != zi4.a(contextD.getApplicationContext())) {
            return contextD;
        }
        e6i.d(z, "%s, Hilt view cannot be created using the application context. Use a Hilt Fragment or Activity context.", this.d.getClass());
        return null;
    }

    @Override // defpackage.sxa
    public Object generatedComponent() {
        if (this.f15307a == null) {
            synchronized (this.f15308b) {
                try {
                    if (this.f15307a == null) {
                        this.f15307a = a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f15307a;
    }

    public static final class FragmentContextWrapper extends ContextWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Fragment f15309a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public LayoutInflater f15310b;
        public LayoutInflater c;
        public final LifecycleEventObserver d;

        public FragmentContextWrapper(Context context, Fragment fragment) {
            super((Context) e6i.b(context));
            LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: dagger.hilt.android.internal.managers.ViewComponentManager.FragmentContextWrapper.1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        FragmentContextWrapper.this.f15309a = null;
                        FragmentContextWrapper.this.f15310b = null;
                        FragmentContextWrapper.this.c = null;
                    }
                }
            };
            this.d = lifecycleEventObserver;
            this.f15310b = null;
            Fragment fragment2 = (Fragment) e6i.b(fragment);
            this.f15309a = fragment2;
            fragment2.getLifecycle().addObserver(lifecycleEventObserver);
        }

        public Fragment d() {
            e6i.c(this.f15309a, "The fragment has already been destroyed.");
            return this.f15309a;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Object getSystemService(String str) {
            if (!"layout_inflater".equals(str)) {
                return getBaseContext().getSystemService(str);
            }
            if (this.c == null) {
                if (this.f15310b == null) {
                    this.f15310b = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
                }
                this.c = this.f15310b.cloneInContext(this);
            }
            return this.c;
        }

        public FragmentContextWrapper(LayoutInflater layoutInflater, Fragment fragment) {
            super((Context) e6i.b(((LayoutInflater) e6i.b(layoutInflater)).getContext()));
            LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: dagger.hilt.android.internal.managers.ViewComponentManager.FragmentContextWrapper.1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        FragmentContextWrapper.this.f15309a = null;
                        FragmentContextWrapper.this.f15310b = null;
                        FragmentContextWrapper.this.c = null;
                    }
                }
            };
            this.d = lifecycleEventObserver;
            this.f15310b = layoutInflater;
            Fragment fragment2 = (Fragment) e6i.b(fragment);
            this.f15309a = fragment2;
            fragment2.getLifecycle().addObserver(lifecycleEventObserver);
        }
    }
}
