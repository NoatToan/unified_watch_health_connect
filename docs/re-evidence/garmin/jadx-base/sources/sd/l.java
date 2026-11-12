package sd;

import android.os.Bundle;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsd/l;", "Li63/c;", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "<init>", "()V", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l implements i63.c<Bundle> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f158583a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k63.f f158584b = k63.k.d("androidx.savedstate.SavedState", new k63.e[0]);

    private l() {
    }

    @Override // i63.b
    public final Object deserialize(l63.e eVar) {
        eVar.getClass();
        if (!(eVar instanceof rd.f)) {
            f158583a.getClass();
            vb.h.x(oe2.f.m(f158584b.f103233a, eVar));
            return null;
        }
        rd.f fVar = (rd.f) eVar;
        boolean zG = s.g(fVar.f152000d, "");
        Bundle bundle = fVar.f151998b;
        if (zG) {
            return bundle;
        }
        bundle.getClass();
        return nd.b.g(bundle, fVar.f152000d);
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF158591b() {
        return f158584b;
    }

    @Override // i63.i
    public final void serialize(l63.f fVar, Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.getClass();
        if (!(fVar instanceof rd.g)) {
            f158583a.getClass();
            vb.h.x(oe2.f.n(f158584b.f103233a, fVar));
            return;
        }
        rd.g gVar = (rd.g) fVar;
        boolean zG = s.g(gVar.f152004c, "");
        Bundle bundle2 = gVar.f152002a;
        if (zG) {
            bundle2.getClass();
            bundle2.putAll(bundle);
        } else {
            bundle2.getClass();
            nd.f.b(gVar.f152004c, bundle2, bundle);
        }
    }
}
