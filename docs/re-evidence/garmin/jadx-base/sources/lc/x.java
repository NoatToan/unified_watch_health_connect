package lc;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Arrays;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0015\b\u0016\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\u0004\u0010\t¨\u0006\n"}, d2 = {"Llc/x;", "", "Llc/v;", "entry", "<init>", "(Llc/v;)V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", RemoteConfigConstants.ResponseFieldKey.STATE, "(Landroid/os/Bundle;)V", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qc.e f111895a;

    public x(Bundle bundle) {
        bundle.getClass();
        bundle.setClassLoader(x.class.getClassLoader());
        this.f111895a = new qc.e(bundle);
    }

    public final v a(qc.f fVar, h0 h0Var, androidx.lifecycle.b0.b bVar, z zVar) {
        Bundle bundle;
        fVar.getClass();
        bVar.getClass();
        qc.e eVar = this.f111895a;
        Bundle bundle2 = eVar.f144309c;
        if (bundle2 != null) {
            Context context = fVar.f144311a;
            bundle2.setClassLoader(context != null ? context.getClassLoader() : null);
            bundle = bundle2;
        } else {
            bundle = null;
        }
        v.a aVar = v.f111880j;
        String str = eVar.f144307a;
        Bundle bundle3 = eVar.f144310d;
        aVar.getClass();
        str.getClass();
        return new v(fVar, h0Var, bundle, bVar, zVar, str, bundle3, null);
    }

    public final Bundle b() {
        qc.e eVar = this.f111895a;
        eVar.getClass();
        p13.k0.f134949a.getClass();
        Bundle bundleA = h7.c.a((o13.p[]) Arrays.copyOf(new o13.p[0], 0));
        String str = eVar.f144307a;
        str.getClass();
        bundleA.putString("nav-entry-state:id", str);
        bundleA.putInt("nav-entry-state:destination-id", eVar.f144308b);
        Bundle bundleA2 = eVar.f144309c;
        if (bundleA2 == null) {
            bundleA2 = h7.c.a((o13.p[]) Arrays.copyOf(new o13.p[0], 0));
        }
        bundleA.putBundle("nav-entry-state:args", bundleA2);
        nd.f.b("nav-entry-state:saved-state", bundleA, eVar.f144310d);
        return bundleA;
    }

    public x(v vVar) {
        vVar.getClass();
        this.f111895a = new qc.e(vVar, vVar.f111882b.f111773b.f144346e);
    }
}
