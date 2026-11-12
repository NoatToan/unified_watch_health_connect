package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.concurrent.CopyOnWriteArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroidx/fragment/app/t;", "", "Landroidx/fragment/app/v;", "fragmentManager", "<init>", "(Landroidx/fragment/app/v;)V", "a", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f7364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList<a> f7365b;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/fragment/app/t$a;", "", "Landroidx/fragment/app/v$m;", "callback", "", "recursive", "<init>", "(Landroidx/fragment/app/v$m;Z)V", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v.m f7366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f7367b;

        public a(v.m mVar, boolean z14) {
            mVar.getClass();
            this.f7366a = mVar;
            this.f7367b = z14;
        }
    }

    public t(v vVar) {
        vVar.getClass();
        this.f7364a = vVar;
        this.f7365b = new CopyOnWriteArrayList<>();
    }

    public final void a(Fragment fragment, Bundle bundle, boolean z14) {
        fragment.getClass();
        v vVar = this.f7364a;
        Fragment fragment2 = vVar.f7395z;
        if (fragment2 != null) {
            v parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.f7385p.a(fragment, bundle, true);
        }
        for (a aVar : this.f7365b) {
            if (!z14 || aVar.f7367b) {
                aVar.f7366a.onFragmentActivityCreated(vVar, fragment, bundle);
            }
        }
    }

    public final void b(Fragment fragment, boolean z14) {
        fragment.getClass();
        v vVar = this.f7364a;
        Context context = vVar.f7393x.f7358b;
        Fragment fragment2 = vVar.f7395z;
        if (fragment2 != null) {
            v parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.f7385p.b(fragment, true);
        }
        for (a aVar : this.f7365b) {
            if (!z14 || aVar.f7367b) {
                aVar.f7366a.onFragmentAttached(vVar, fragment, context);
            }
        }
    }

    public final void c(Fragment fragment, Bundle bundle, boolean z14) {
        fragment.getClass();
        v vVar = this.f7364a;
        Fragment fragment2 = vVar.f7395z;
        if (fragment2 != null) {
            v parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.f7385p.c(fragment, bundle, true);
        }
        for (a aVar : this.f7365b) {
            if (!z14 || aVar.f7367b) {
                aVar.f7366a.onFragmentCreated(vVar, fragment, bundle);
            }
        }
    }

    public final void d(Fragment fragment, boolean z14) {
        fragment.getClass();
        v vVar = this.f7364a;
        Fragment fragment2 = vVar.f7395z;
        if (fragment2 != null) {
            v parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.f7385p.d(fragment, true);
        }
        for (a aVar : this.f7365b) {
            if (!z14 || aVar.f7367b) {
                aVar.f7366a.onFragmentDestroyed(vVar, fragment);
            }
        }
    }

    public final void e(Fragment fragment, boolean z14) {
        fragment.getClass();
        v vVar = this.f7364a;
        Fragment fragment2 = vVar.f7395z;
        if (fragment2 != null) {
            v parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.f7385p.e(fragment, true);
        }
        for (a aVar : this.f7365b) {
            if (!z14 || aVar.f7367b) {
                aVar.f7366a.onFragmentDetached(vVar, fragment);
            }
        }
    }

    public final void f(Fragment fragment, boolean z14) {
        fragment.getClass();
        v vVar = this.f7364a;
        Fragment fragment2 = vVar.f7395z;
        if (fragment2 != null) {
            v parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.f7385p.f(fragment, true);
        }
        for (a aVar : this.f7365b) {
            if (!z14 || aVar.f7367b) {
                aVar.f7366a.onFragmentPaused(vVar, fragment);
            }
        }
    }

    public final void g(Fragment fragment, boolean z14) {
        fragment.getClass();
        v vVar = this.f7364a;
        Context context = vVar.f7393x.f7358b;
        Fragment fragment2 = vVar.f7395z;
        if (fragment2 != null) {
            v parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.f7385p.g(fragment, true);
        }
        for (a aVar : this.f7365b) {
            if (!z14 || aVar.f7367b) {
                aVar.f7366a.onFragmentPreAttached(vVar, fragment, context);
            }
        }
    }

    public final void h(Fragment fragment, Bundle bundle, boolean z14) {
        fragment.getClass();
        v vVar = this.f7364a;
        Fragment fragment2 = vVar.f7395z;
        if (fragment2 != null) {
            v parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.f7385p.h(fragment, bundle, true);
        }
        for (a aVar : this.f7365b) {
            if (!z14 || aVar.f7367b) {
                aVar.f7366a.onFragmentPreCreated(vVar, fragment, bundle);
            }
        }
    }

    public final void i(Fragment fragment, boolean z14) {
        fragment.getClass();
        v vVar = this.f7364a;
        Fragment fragment2 = vVar.f7395z;
        if (fragment2 != null) {
            v parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.f7385p.i(fragment, true);
        }
        for (a aVar : this.f7365b) {
            if (!z14 || aVar.f7367b) {
                aVar.f7366a.onFragmentResumed(vVar, fragment);
            }
        }
    }

    public final void j(Fragment fragment, Bundle bundle, boolean z14) {
        fragment.getClass();
        v vVar = this.f7364a;
        Fragment fragment2 = vVar.f7395z;
        if (fragment2 != null) {
            v parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.f7385p.j(fragment, bundle, true);
        }
        for (a aVar : this.f7365b) {
            if (!z14 || aVar.f7367b) {
                aVar.f7366a.onFragmentSaveInstanceState(vVar, fragment, bundle);
            }
        }
    }

    public final void k(Fragment fragment, boolean z14) {
        fragment.getClass();
        v vVar = this.f7364a;
        Fragment fragment2 = vVar.f7395z;
        if (fragment2 != null) {
            v parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.f7385p.k(fragment, true);
        }
        for (a aVar : this.f7365b) {
            if (!z14 || aVar.f7367b) {
                aVar.f7366a.onFragmentStarted(vVar, fragment);
            }
        }
    }

    public final void l(Fragment fragment, boolean z14) {
        fragment.getClass();
        v vVar = this.f7364a;
        Fragment fragment2 = vVar.f7395z;
        if (fragment2 != null) {
            v parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.f7385p.l(fragment, true);
        }
        for (a aVar : this.f7365b) {
            if (!z14 || aVar.f7367b) {
                aVar.f7366a.onFragmentStopped(vVar, fragment);
            }
        }
    }

    public final void m(Fragment fragment, View view2, Bundle bundle, boolean z14) {
        fragment.getClass();
        view2.getClass();
        v vVar = this.f7364a;
        Fragment fragment2 = vVar.f7395z;
        if (fragment2 != null) {
            v parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.f7385p.m(fragment, view2, bundle, true);
        }
        for (a aVar : this.f7365b) {
            if (!z14 || aVar.f7367b) {
                aVar.f7366a.onFragmentViewCreated(vVar, fragment, view2, bundle);
            }
        }
    }

    public final void n(Fragment fragment, boolean z14) {
        fragment.getClass();
        v vVar = this.f7364a;
        Fragment fragment2 = vVar.f7395z;
        if (fragment2 != null) {
            v parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.f7385p.n(fragment, true);
        }
        for (a aVar : this.f7365b) {
            if (!z14 || aVar.f7367b) {
                aVar.f7366a.onFragmentViewDestroyed(vVar, fragment);
            }
        }
    }
}
