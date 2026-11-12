package sd;

import android.os.Bundle;
import android.util.Size;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lsd/n;", "Li63/c;", "Landroid/util/Size;", "<init>", "()V", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n implements i63.c<Size> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f158587a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k63.f f158588b = k63.k.d("android.util.Size", new k63.e[0]);

    private n() {
    }

    @Override // i63.b
    public final Object deserialize(l63.e eVar) {
        eVar.getClass();
        if (!(eVar instanceof rd.f)) {
            f158587a.getClass();
            vb.h.x(oe2.f.m(f158588b.f103233a, eVar));
            return null;
        }
        rd.f fVar = (rd.f) eVar;
        Bundle bundle = fVar.f151998b;
        bundle.getClass();
        String str = fVar.f152000d;
        str.getClass();
        Size size = bundle.getSize(str);
        if (size != null) {
            return size;
        }
        gg.b.J(str);
        throw null;
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF158591b() {
        return f158588b;
    }

    @Override // i63.i
    public final void serialize(l63.f fVar, Object obj) {
        Size size = (Size) obj;
        size.getClass();
        if (!(fVar instanceof rd.g)) {
            f158587a.getClass();
            vb.h.x(oe2.f.n(f158588b.f103233a, fVar));
            return;
        }
        rd.g gVar = (rd.g) fVar;
        Bundle bundle = gVar.f152002a;
        bundle.getClass();
        String str = gVar.f152004c;
        str.getClass();
        bundle.putSize(str, size);
    }
}
