package androidx.lifecycle;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/lifecycle/n1;", "Lnd/c$b;", "Lnd/c;", "savedStateRegistry", "Landroidx/lifecycle/ViewModelStoreOwner;", "viewModelStoreOwner", "<init>", "(Lnd/c;Landroidx/lifecycle/ViewModelStoreOwner;)V", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n1 implements nd.c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nd.c f7963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f7965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o13.t f7966d;

    public n1(nd.c cVar, ViewModelStoreOwner viewModelStoreOwner) {
        cVar.getClass();
        viewModelStoreOwner.getClass();
        this.f7963a = cVar;
        this.f7966d = o13.m.b(new a03.e(viewModelStoreOwner, 15));
    }

    @Override // nd.c.b
    public final Bundle a() {
        p13.k0.f134949a.getClass();
        Bundle bundleA = h7.c.a((o13.p[]) Arrays.copyOf(new o13.p[0], 0));
        Bundle bundle = this.f7965c;
        if (bundle != null) {
            bundleA.putAll(bundle);
        }
        for (Map.Entry entry : ((o1) this.f7966d.getValue()).f7982a.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA2 = ((j1) entry.getValue()).f7945b.f163197e.a();
            if (!bundleA2.isEmpty()) {
                nd.f.b(str, bundleA, bundleA2);
            }
        }
        this.f7964b = false;
        return bundleA;
    }

    public final void b() {
        if (this.f7964b) {
            return;
        }
        Bundle bundleA = this.f7963a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        p13.k0.f134949a.getClass();
        Bundle bundleA2 = h7.c.a((o13.p[]) Arrays.copyOf(new o13.p[0], 0));
        Bundle bundle = this.f7965c;
        if (bundle != null) {
            bundleA2.putAll(bundle);
        }
        if (bundleA != null) {
            bundleA2.putAll(bundleA);
        }
        this.f7965c = bundleA2;
        this.f7964b = true;
    }
}
