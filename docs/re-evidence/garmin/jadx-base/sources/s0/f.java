package s0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.camera.core.ProcessingException;
import androidx.camera.core.impl.l0;
import b0.c1;
import b0.g;
import com.google.auto.value.AutoValue;
import go1.i;
import j0.u;
import j0.v;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import k7.h;
import l0.j;
import p006l2.z;
import r0.o;
import r0.q;
import r0.t;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f155270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f155271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l0 f155272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f155273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s0.b f155274e;

    public class a implements l0.c<c1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o f155275a;

        public a(o oVar) {
            this.f155275a = oVar;
        }

        @Override // l0.c
        public final void onFailure(Throwable th3) {
            int i14 = this.f155275a.f148748f;
            if (i14 == 2 && (th3 instanceof CancellationException)) {
                return;
            }
            t.b(i14);
        }

        @Override // l0.c
        public final void onSuccess(c1 c1Var) {
            c1 c1Var2 = c1Var;
            c1Var2.getClass();
            try {
                f.this.f155270a.b(c1Var2);
            } catch (ProcessingException unused) {
            }
        }
    }

    @AutoValue
    public static abstract class b {
        public abstract List<d> a();

        public abstract o b();

        public abstract o c();
    }

    public static class c extends HashMap<d, o> {
    }

    public f(l0 l0Var, l0 l0Var2, q qVar) {
        this.f155271b = l0Var;
        this.f155272c = l0Var2;
        this.f155270a = qVar;
    }

    public final void a(l0 l0Var, l0 l0Var2, o oVar, o oVar2, Map.Entry<d, o> entry) {
        o value = entry.getValue();
        Objects.toString(value);
        g gVar = new g(oVar.f148749g.f(), entry.getKey().a().a(), oVar.f148745c ? l0Var : null, entry.getKey().a().c(), entry.getKey().a().g());
        g gVar2 = new g(oVar2.f148749g.f(), entry.getKey().b().a(), oVar2.f148745c ? l0Var2 : null, entry.getKey().b().c(), entry.getKey().b().g());
        int iB = entry.getKey().a().b();
        value.getClass();
        u.a();
        value.b();
        h.f(!value.f148752j, "Consumer can only be linked once.");
        value.f148752j = true;
        o.a aVar = value.f148754l;
        j.a(j.j(aVar.c(), new i(value, aVar, iB, gVar, gVar2), k0.b.d()), new a(value), k0.b.d());
    }

    public final c b(s0.b bVar) {
        f fVar = this;
        u.a();
        q qVar = fVar.f155270a;
        Objects.toString(qVar);
        Objects.toString(bVar.f155253a);
        Objects.toString(bVar.f155254b);
        Iterator<d> it = bVar.f155255c.iterator();
        while (it.hasNext()) {
            Objects.toString(it.next());
        }
        fVar.f155274e = bVar;
        fVar.f155273d = new c();
        s0.b bVar2 = fVar.f155274e;
        o oVar = bVar2.f155253a;
        o oVar2 = bVar2.f155254b;
        for (d dVar : bVar2.f155255c) {
            c cVar = fVar.f155273d;
            t0.f fVarA = dVar.a();
            Rect rectA = fVarA.a();
            int iC = fVarA.c();
            boolean zG = fVarA.g();
            Matrix matrix = new Matrix(oVar.f148744b);
            matrix.postConcat(v.a(iC, zG, new RectF(rectA), v.k(fVarA.d())));
            h.a(v.e(v.i(v.g(rectA), iC), false, fVarA.d()));
            Rect rectJ = v.j(fVarA.d());
            androidx.camera.core.impl.q.b bVarI = oVar.f148749g.i();
            bVarI.c(fVarA.d());
            cVar.put(dVar, new o(fVarA.e(), fVarA.b(), bVarI.a(), matrix, false, rectJ, oVar.f148751i - iC, -1, oVar.f148747e != zG));
        }
        try {
            qVar.a(oVar.d(fVar.f155271b, true));
        } catch (ProcessingException unused) {
        }
        try {
            qVar.a(oVar2.d(fVar.f155272c, false));
        } catch (ProcessingException unused2) {
        }
        for (Map.Entry<d, o> entry : fVar.f155273d.entrySet()) {
            l0 l0Var = fVar.f155271b;
            l0 l0Var2 = fVar.f155272c;
            fVar.a(l0Var, l0Var2, oVar, oVar2, entry);
            o value = entry.getValue();
            o oVar3 = oVar2;
            o oVar4 = oVar;
            z zVar = new z(this, l0Var, l0Var2, oVar4, oVar3, entry, 1);
            fVar = this;
            oVar = oVar4;
            oVar2 = oVar3;
            value.a(zVar);
        }
        return fVar.f155273d;
    }
}
