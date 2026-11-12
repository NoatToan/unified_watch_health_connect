package u01;

import b63.v;
import c63.k0;
import e63.d;
import i63.c;
import k63.k;
import l63.e;
import l63.f;
import m63.q1;
import p005kotlin.Metadata;
import tn2.n0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lu01/a;", "Li63/c;", "Lb63/v;", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements c<v> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f167340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q1 f167341b;

    public a() {
        v.Companion companion = v.INSTANCE;
        n0 n0Var = new n0(23);
        companion.getClass();
        k0.f24999b.getClass();
        k0.a aVar = new k0.a(new d());
        n0Var.invoke(aVar);
        this.f167340a = new k0(aVar.build());
        this.f167341b = k.a("LocalTime", k63.d.i.f103232a);
    }

    @Override // i63.b
    public final Object deserialize(e eVar) {
        eVar.getClass();
        if (!eVar.D()) {
            return null;
        }
        v.Companion companion = v.INSTANCE;
        String strS = eVar.s();
        companion.getClass();
        return v.Companion.b(strS, this.f167340a);
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF158591b() {
        return this.f167341b;
    }

    @Override // i63.i
    public final void serialize(f fVar, Object obj) {
        v vVar = (v) obj;
        if (vVar != null) {
            k0 k0Var = this.f167340a;
            k0Var.getClass();
            fVar.p(k0Var.b(vVar));
        }
    }
}
