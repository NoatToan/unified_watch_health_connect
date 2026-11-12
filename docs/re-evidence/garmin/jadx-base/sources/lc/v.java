package lc;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.j1;
import androidx.lifecycle.m1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0018B_\b\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\u0004\b\u0013\u0010\u0014B#\b\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0000\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\u0004\b\u0013\u0010\u0017¨\u0006\u0019"}, d2 = {"Llc/v;", "Landroidx/lifecycle/n0;", "Landroidx/lifecycle/ViewModelStoreOwner;", "Landroidx/lifecycle/y;", "Lnd/e;", "Lqc/f;", CoreConstants.CONTEXT_SCOPE_VALUE, "Llc/h0;", FirebaseAnalytics.Param.DESTINATION, "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "immutableArgs", "Landroidx/lifecycle/b0$b;", "hostLifecycleState", "Llc/s0;", "viewModelStoreProvider", "", TtmlNode.ATTR_ID, "savedState", "<init>", "(Lqc/f;Llc/h0;Landroid/os/Bundle;Landroidx/lifecycle/b0$b;Llc/s0;Ljava/lang/String;Landroid/os/Bundle;)V", "entry", "arguments", "(Llc/v;Landroid/os/Bundle;)V", "a", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class v implements androidx.lifecycle.n0, ViewModelStoreOwner, androidx.lifecycle.y, nd.e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f111880j = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qc.f f111881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h0 f111882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f111883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.lifecycle.b0.b f111884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s0 f111885e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f111886f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f111887g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qc.d f111888h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o13.t f111889i;

    /* JADX WARN: Illegal instructions before constructor call */
    public v(qc.f fVar, h0 h0Var, Bundle bundle, androidx.lifecycle.b0.b bVar, s0 s0Var, String str, Bundle bundle2, int i14, p005kotlin.jvm.internal.j jVar) {
        bundle = (i14 & 4) != 0 ? null : bundle;
        bVar = (i14 & 8) != 0 ? androidx.lifecycle.b0.b.CREATED : bVar;
        s0Var = (i14 & 16) != 0 ? null : s0Var;
        if ((i14 & 32) != 0) {
            f111880j.getClass();
            str = UUID.randomUUID().toString();
            str.getClass();
        }
        this(fVar, h0Var, bundle, bVar, s0Var, str, (i14 & 64) != 0 ? null : bundle2);
    }

    public final j1 a() {
        return (j1) this.f111889i.getValue();
    }

    public final void b(androidx.lifecycle.b0.b bVar) {
        bVar.getClass();
        qc.d dVar = this.f111888h;
        dVar.getClass();
        dVar.f144303k = bVar;
        dVar.b();
    }

    public final boolean equals(Object obj) {
        Set<String> setKeySet;
        if (obj != null && (obj instanceof v)) {
            v vVar = (v) obj;
            Bundle bundle = vVar.f111883c;
            if (p005kotlin.jvm.internal.s.g(this.f111886f, vVar.f111886f) && p005kotlin.jvm.internal.s.g(this.f111882b, vVar.f111882b) && p005kotlin.jvm.internal.s.g(this.f111888h.f144302j, vVar.f111888h.f144302j) && p005kotlin.jvm.internal.s.g(getSavedStateRegistry(), vVar.getSavedStateRegistry())) {
                Bundle bundle2 = this.f111883c;
                if (p005kotlin.jvm.internal.s.g(bundle2, bundle)) {
                    return true;
                }
                if (bundle2 != null && (setKeySet = bundle2.keySet()) != null) {
                    Set<String> set = setKeySet;
                    if ((set instanceof Collection) && set.isEmpty()) {
                        return true;
                    }
                    for (String str : set) {
                        if (!p005kotlin.jvm.internal.s.g(bundle2.get(str), bundle != null ? bundle.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0038  */
    @Override // androidx.lifecycle.y
    public final CreationExtras getDefaultViewModelCreationExtras() {
        Application application;
        qc.d dVar = this.f111888h;
        dVar.getClass();
        androidx.lifecycle.viewmodel.a aVar = new androidx.lifecycle.viewmodel.a(null, 1, null);
        m1.b bVar = m1.f7960a;
        v vVar = dVar.f144293a;
        aVar.b(bVar, vVar);
        aVar.b(m1.f7961b, vVar);
        Bundle bundleA = dVar.a();
        if (bundleA != null) {
            aVar.b(m1.f7962c, bundleA);
        }
        qc.f fVar = this.f111881a;
        if (fVar == null) {
            application = null;
        } else {
            Context context = fVar.f144311a;
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
            } else {
                application = null;
            }
        }
        Application application2 = application != null ? application : null;
        if (application2 != null) {
            aVar.b(x1.a.f8075f, application2);
        }
        return aVar;
    }

    @Override // androidx.lifecycle.y
    public final x1.c getDefaultViewModelProviderFactory() {
        return this.f111888h.f144304l;
    }

    @Override // androidx.lifecycle.n0
    /* JADX INFO: renamed from: getLifecycle */
    public final androidx.lifecycle.b0 getF158016a() {
        return this.f111888h.f144302j;
    }

    @Override // nd.e
    public final nd.c getSavedStateRegistry() {
        return this.f111888h.f144300h.f125387b;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final y1 getViewModelStore() {
        qc.d dVar = this.f111888h;
        if (!dVar.f144301i) {
            vb.h.z("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
            return null;
        }
        if (dVar.f144302j.f7973d == androidx.lifecycle.b0.b.DESTROYED) {
            vb.h.z("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
            return null;
        }
        s0 s0Var = dVar.f144297e;
        if (s0Var != null) {
            return s0Var.t3(dVar.f144298f);
        }
        vb.h.z("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
        return null;
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = this.f111882b.hashCode() + (this.f111886f.hashCode() * 31);
        Bundle bundle = this.f111883c;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i14 = iHashCode * 31;
                Object obj = bundle.get((String) it.next());
                iHashCode = i14 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return getSavedStateRegistry().hashCode() + ((this.f111888h.f144302j.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return this.f111888h.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llc/v$a;", "", "<init>", "()V", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static v a(a aVar, qc.f fVar, h0 h0Var, Bundle bundle, androidx.lifecycle.b0.b bVar, s0 s0Var) {
            aVar.getClass();
            String string = UUID.randomUUID().toString();
            string.getClass();
            aVar.getClass();
            h0Var.getClass();
            bVar.getClass();
            return new v(fVar, h0Var, bundle, bVar, s0Var, string, null, null);
        }

        private a() {
        }
    }

    private v(qc.f fVar, h0 h0Var, Bundle bundle, androidx.lifecycle.b0.b bVar, s0 s0Var, String str, Bundle bundle2) {
        this.f111881a = fVar;
        this.f111882b = h0Var;
        this.f111883c = bundle;
        this.f111884d = bVar;
        this.f111885e = s0Var;
        this.f111886f = str;
        this.f111887g = bundle2;
        this.f111888h = new qc.d(this);
        this.f111889i = o13.m.b(new p006l2.v0(this, 4));
    }

    public /* synthetic */ v(qc.f fVar, h0 h0Var, Bundle bundle, androidx.lifecycle.b0.b bVar, s0 s0Var, String str, Bundle bundle2, p005kotlin.jvm.internal.j jVar) {
        this(fVar, h0Var, bundle, bVar, s0Var, str, bundle2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v(v vVar, Bundle bundle) {
        this(vVar.f111881a, vVar.f111882b, bundle, vVar.f111884d, vVar.f111885e, vVar.f111886f, vVar.f111887g);
        vVar.getClass();
        qc.d dVar = this.f111888h;
        androidx.lifecycle.b0.b bVar = vVar.f111884d;
        dVar.getClass();
        bVar.getClass();
        dVar.f144296d = bVar;
        qc.d dVar2 = this.f111888h;
        androidx.lifecycle.b0.b bVar2 = vVar.f111888h.f144303k;
        dVar2.getClass();
        bVar2.getClass();
        dVar2.f144303k = bVar2;
        dVar2.b();
    }

    public v(v vVar, Bundle bundle, int i14, p005kotlin.jvm.internal.j jVar) {
        this(vVar, (i14 & 2) != 0 ? vVar.f111888h.a() : bundle);
    }
}
