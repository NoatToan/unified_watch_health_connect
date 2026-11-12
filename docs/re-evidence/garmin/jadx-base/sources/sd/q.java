package sd;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsd/q;", "Li63/c;", "Landroid/util/SparseArray;", "Landroid/os/Parcelable;", "<init>", "()V", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class q implements i63.c<SparseArray<Parcelable>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f158597a = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k63.f f158598b = k63.k.d("android.util.SparseArray<android.os.Parcelable>", new k63.e[0]);

    private q() {
    }

    @Override // i63.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final SparseArray<Parcelable> deserialize(l63.e eVar) {
        eVar.getClass();
        if (!(eVar instanceof rd.f)) {
            f158597a.getClass();
            vb.h.x(oe2.f.m(f158598b.f103233a, eVar));
            return null;
        }
        rd.f fVar = (rd.f) eVar;
        Bundle bundle = fVar.f151998b;
        bundle.getClass();
        String str = fVar.f152000d;
        k23.d dVarB = s0.f105811a.b(Parcelable.class);
        str.getClass();
        SparseArray<Parcelable> sparseArrayE = Build.VERSION.SDK_INT >= 34 ? h7.b.a.e(bundle, dh.b.u(dVarB), str) : bundle.getSparseParcelableArray(str);
        if (sparseArrayE != null) {
            return sparseArrayE;
        }
        gg.b.J(str);
        throw null;
    }

    @Override // i63.i
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void serialize(l63.f fVar, SparseArray<Parcelable> sparseArray) {
        sparseArray.getClass();
        if (!(fVar instanceof rd.g)) {
            f158597a.getClass();
            vb.h.x(oe2.f.n(f158598b.f103233a, fVar));
            return;
        }
        rd.g gVar = (rd.g) fVar;
        Bundle bundle = gVar.f152002a;
        bundle.getClass();
        String str = gVar.f152004c;
        str.getClass();
        bundle.putSparseParcelableArray(str, sparseArray);
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF158591b() {
        return f158598b;
    }
}
