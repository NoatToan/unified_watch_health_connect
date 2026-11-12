package sd;

import android.os.Bundle;
import java.io.Serializable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsd/g;", "Ljava/io/Serializable;", "T", "Li63/c;", "<init>", "()V", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class g<T extends Serializable> implements i63.c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k63.f f158575a = k63.k.d("java.io.Serializable", new k63.e[0]);

    @Override // i63.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final T deserialize(l63.e eVar) {
        eVar.getClass();
        if (!(eVar instanceof rd.f)) {
            vb.h.x(oe2.f.m(this.f158575a.f103233a, eVar));
            return null;
        }
        rd.f fVar = (rd.f) eVar;
        Bundle bundle = fVar.f151998b;
        bundle.getClass();
        String str = fVar.f152000d;
        k23.d dVarB = s0.f105811a.b(Serializable.class);
        str.getClass();
        T t7 = (T) h7.b.b(bundle, dh.b.u(dVarB), str);
        if (t7 != null) {
            return t7;
        }
        gg.b.J(str);
        throw null;
    }

    @Override // i63.i
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void serialize(l63.f fVar, T t7) {
        t7.getClass();
        if (!(fVar instanceof rd.g)) {
            vb.h.x(oe2.f.n(this.f158575a.f103233a, fVar));
            return;
        }
        rd.g gVar = (rd.g) fVar;
        Bundle bundle = gVar.f152002a;
        bundle.getClass();
        String str = gVar.f152004c;
        str.getClass();
        bundle.putSerializable(str, t7);
    }

    @Override // i63.i, i63.b
    public final k63.e getDescriptor() {
        return this.f158575a;
    }
}
