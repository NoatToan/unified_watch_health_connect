package sd;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsd/i;", "Li63/c;", "", "Landroid/os/Parcelable;", "<init>", "()V", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i implements i63.c<Parcelable[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f158578a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k63.f f158579b = k63.k.d("kotlin.Array<android.os.Parcelable>", new k63.e[0]);

    private i() {
    }

    public static Parcelable[] a(l63.e eVar) {
        eVar.getClass();
        if (!(eVar instanceof rd.f)) {
            f158578a.getClass();
            vb.h.x(oe2.f.m(f158579b.f103233a, eVar));
            return null;
        }
        rd.f fVar = (rd.f) eVar;
        Bundle bundle = fVar.f151998b;
        bundle.getClass();
        String str = fVar.f152000d;
        k23.d dVarB = s0.f105811a.b(Parcelable.class);
        str.getClass();
        Parcelable[] parcelableArray = Build.VERSION.SDK_INT >= 34 ? (Parcelable[]) h7.b.a.b(bundle, dh.b.u(dVarB), str) : bundle.getParcelableArray(str);
        if (parcelableArray == null) {
            parcelableArray = null;
        }
        if (parcelableArray != null) {
            return parcelableArray;
        }
        gg.b.J(str);
        throw null;
    }

    public static void b(l63.f fVar, Parcelable[] parcelableArr) {
        parcelableArr.getClass();
        if (!(fVar instanceof rd.g)) {
            f158578a.getClass();
            vb.h.x(oe2.f.n(f158579b.f103233a, fVar));
            return;
        }
        rd.g gVar = (rd.g) fVar;
        Bundle bundle = gVar.f152002a;
        bundle.getClass();
        String str = gVar.f152004c;
        str.getClass();
        bundle.putParcelableArray(str, parcelableArr);
    }

    @Override // i63.b
    public final /* bridge */ /* synthetic */ Object deserialize(l63.e eVar) {
        return a(eVar);
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF158591b() {
        return f158579b;
    }

    @Override // i63.i
    public final /* bridge */ /* synthetic */ void serialize(l63.f fVar, Object obj) {
        b(fVar, (Parcelable[]) obj);
    }
}
