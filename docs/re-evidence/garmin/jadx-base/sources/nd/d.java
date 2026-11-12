package nd;

import android.os.Bundle;
import androidx.lifecycle.b0;
import java.util.Arrays;
import java.util.Map;
import n82.i;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p13.k0;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lnd/d;", "", "Lqd/a;", "impl", "<init>", "(Lqd/a;)V", "a", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f125385c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qd.a f125386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f125387b;

    private d(qd.a aVar) {
        this.f125386a = aVar;
        this.f125387b = new c(aVar);
    }

    public final void a(Bundle bundle) {
        qd.a aVar = this.f125386a;
        e eVar = aVar.f144454a;
        if (!aVar.f144458e) {
            aVar.a();
        }
        if (eVar.getF158016a().getF7973d().a(b0.b.STARTED)) {
            o2.c.s(eVar.getF158016a().getF7973d(), "performRestore cannot be called when owner is ");
            return;
        }
        if (aVar.f144460g) {
            h.z("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundleG = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleG = b.g(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        aVar.f144459f = bundleG;
        aVar.f144460g = true;
    }

    public final void b(Bundle bundle) {
        qd.a aVar = this.f125386a;
        aVar.getClass();
        k0.f134949a.getClass();
        Bundle bundleA = h7.c.a((p[]) Arrays.copyOf(new p[0], 0));
        Bundle bundle2 = aVar.f144459f;
        if (bundle2 != null) {
            bundleA.putAll(bundle2);
        }
        synchronized (aVar.f144456c) {
            try {
                for (Map.Entry entry : aVar.f144457d.entrySet()) {
                    f.b((String) entry.getKey(), bundleA, ((c.b) entry.getValue()).a());
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (bundleA.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleA);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnd/d$a;", "", "<init>", "()V", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static d a(e eVar) {
            eVar.getClass();
            return new d(new qd.a(eVar, new i(eVar, 2)), null);
        }

        private a() {
        }
    }

    public /* synthetic */ d(qd.a aVar, j jVar) {
        this(aVar);
    }
}
