package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList<a> f2410a = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FragmentManager f2411b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FragmentManager.l f2412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f2413b;

        public a(FragmentManager.l lVar, boolean z) {
            this.f2412a = lVar;
            this.f2413b = z;
        }
    }

    public f(FragmentManager fragmentManager) {
        this.f2411b = fragmentManager;
    }

    public void a(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragmentC0 = this.f2411b.C0();
        if (fragmentC0 != null) {
            fragmentC0.getParentFragmentManager().B0().a(fragment, bundle, true);
        }
        for (a aVar : this.f2410a) {
            if (!z || aVar.f2413b) {
                aVar.f2412a.onFragmentActivityCreated(this.f2411b, fragment, bundle);
            }
        }
    }

    public void b(Fragment fragment, boolean z) {
        Context contextF = this.f2411b.z0().f();
        Fragment fragmentC0 = this.f2411b.C0();
        if (fragmentC0 != null) {
            fragmentC0.getParentFragmentManager().B0().b(fragment, true);
        }
        for (a aVar : this.f2410a) {
            if (!z || aVar.f2413b) {
                aVar.f2412a.onFragmentAttached(this.f2411b, fragment, contextF);
            }
        }
    }

    public void c(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragmentC0 = this.f2411b.C0();
        if (fragmentC0 != null) {
            fragmentC0.getParentFragmentManager().B0().c(fragment, bundle, true);
        }
        for (a aVar : this.f2410a) {
            if (!z || aVar.f2413b) {
                aVar.f2412a.onFragmentCreated(this.f2411b, fragment, bundle);
            }
        }
    }

    public void d(Fragment fragment, boolean z) {
        Fragment fragmentC0 = this.f2411b.C0();
        if (fragmentC0 != null) {
            fragmentC0.getParentFragmentManager().B0().d(fragment, true);
        }
        for (a aVar : this.f2410a) {
            if (!z || aVar.f2413b) {
                aVar.f2412a.onFragmentDestroyed(this.f2411b, fragment);
            }
        }
    }

    public void e(Fragment fragment, boolean z) {
        Fragment fragmentC0 = this.f2411b.C0();
        if (fragmentC0 != null) {
            fragmentC0.getParentFragmentManager().B0().e(fragment, true);
        }
        for (a aVar : this.f2410a) {
            if (!z || aVar.f2413b) {
                aVar.f2412a.onFragmentDetached(this.f2411b, fragment);
            }
        }
    }

    public void f(Fragment fragment, boolean z) {
        Fragment fragmentC0 = this.f2411b.C0();
        if (fragmentC0 != null) {
            fragmentC0.getParentFragmentManager().B0().f(fragment, true);
        }
        for (a aVar : this.f2410a) {
            if (!z || aVar.f2413b) {
                aVar.f2412a.onFragmentPaused(this.f2411b, fragment);
            }
        }
    }

    public void g(Fragment fragment, boolean z) {
        Context contextF = this.f2411b.z0().f();
        Fragment fragmentC0 = this.f2411b.C0();
        if (fragmentC0 != null) {
            fragmentC0.getParentFragmentManager().B0().g(fragment, true);
        }
        for (a aVar : this.f2410a) {
            if (!z || aVar.f2413b) {
                aVar.f2412a.onFragmentPreAttached(this.f2411b, fragment, contextF);
            }
        }
    }

    public void h(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragmentC0 = this.f2411b.C0();
        if (fragmentC0 != null) {
            fragmentC0.getParentFragmentManager().B0().h(fragment, bundle, true);
        }
        for (a aVar : this.f2410a) {
            if (!z || aVar.f2413b) {
                aVar.f2412a.onFragmentPreCreated(this.f2411b, fragment, bundle);
            }
        }
    }

    public void i(Fragment fragment, boolean z) {
        Fragment fragmentC0 = this.f2411b.C0();
        if (fragmentC0 != null) {
            fragmentC0.getParentFragmentManager().B0().i(fragment, true);
        }
        for (a aVar : this.f2410a) {
            if (!z || aVar.f2413b) {
                aVar.f2412a.onFragmentResumed(this.f2411b, fragment);
            }
        }
    }

    public void j(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragmentC0 = this.f2411b.C0();
        if (fragmentC0 != null) {
            fragmentC0.getParentFragmentManager().B0().j(fragment, bundle, true);
        }
        for (a aVar : this.f2410a) {
            if (!z || aVar.f2413b) {
                aVar.f2412a.onFragmentSaveInstanceState(this.f2411b, fragment, bundle);
            }
        }
    }

    public void k(Fragment fragment, boolean z) {
        Fragment fragmentC0 = this.f2411b.C0();
        if (fragmentC0 != null) {
            fragmentC0.getParentFragmentManager().B0().k(fragment, true);
        }
        for (a aVar : this.f2410a) {
            if (!z || aVar.f2413b) {
                aVar.f2412a.onFragmentStarted(this.f2411b, fragment);
            }
        }
    }

    public void l(Fragment fragment, boolean z) {
        Fragment fragmentC0 = this.f2411b.C0();
        if (fragmentC0 != null) {
            fragmentC0.getParentFragmentManager().B0().l(fragment, true);
        }
        for (a aVar : this.f2410a) {
            if (!z || aVar.f2413b) {
                aVar.f2412a.onFragmentStopped(this.f2411b, fragment);
            }
        }
    }

    public void m(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment fragmentC0 = this.f2411b.C0();
        if (fragmentC0 != null) {
            fragmentC0.getParentFragmentManager().B0().m(fragment, view, bundle, true);
        }
        for (a aVar : this.f2410a) {
            if (!z || aVar.f2413b) {
                aVar.f2412a.onFragmentViewCreated(this.f2411b, fragment, view, bundle);
            }
        }
    }

    public void n(Fragment fragment, boolean z) {
        Fragment fragmentC0 = this.f2411b.C0();
        if (fragmentC0 != null) {
            fragmentC0.getParentFragmentManager().B0().n(fragment, true);
        }
        for (a aVar : this.f2410a) {
            if (!z || aVar.f2413b) {
                aVar.f2412a.onFragmentViewDestroyed(this.f2411b, fragment);
            }
        }
    }

    public void o(FragmentManager.l lVar, boolean z) {
        this.f2410a.add(new a(lVar, z));
    }

    public void p(FragmentManager.l lVar) {
        synchronized (this.f2410a) {
            try {
                int size = this.f2410a.size();
                for (int i = 0; i < size; i++) {
                    if (this.f2410a.get(i).f2412a == lVar) {
                        this.f2410a.remove(i);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
