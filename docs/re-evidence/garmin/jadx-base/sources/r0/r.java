package r0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.camera.core.ProcessingException;
import androidx.camera.core.impl.l0;
import b0.c1;
import com.google.auto.value.AutoValue;
import j0.u;
import j0.v;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f148774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f148775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f148776c;

    public class a implements l0.c<c1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o f148777a;

        public a(o oVar) {
            this.f148777a = oVar;
        }

        @Override // l0.c
        public final void onFailure(Throwable th3) {
            int i14 = this.f148777a.f148748f;
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
                r.this.f148774a.b(c1Var2);
            } catch (ProcessingException unused) {
            }
        }
    }

    @AutoValue
    public static abstract class b {
        public abstract List<t0.f> a();

        public abstract o b();
    }

    public static class c extends HashMap<t0.f, o> {
    }

    public r(l0 l0Var, q qVar) {
        this.f148775b = l0Var;
        this.f148774a = qVar;
    }

    public final void a(o oVar, Map.Entry<t0.f, o> entry) {
        o value = entry.getValue();
        Objects.toString(value);
        c1.a aVar = null;
        b0.g gVar = new b0.g(oVar.f148749g.f(), entry.getKey().a(), oVar.f148745c ? this.f148775b : null, entry.getKey().c(), entry.getKey().g());
        int iB = entry.getKey().b();
        value.getClass();
        u.a();
        value.b();
        k7.h.f(!value.f148752j, "Consumer can only be linked once.");
        value.f148752j = true;
        o.a aVar2 = value.f148754l;
        l0.j.a(l0.j.j(aVar2.c(), new go1.i(value, aVar2, iB, gVar, aVar), k0.b.d()), new a(value), k0.b.d());
    }

    public final void b() {
        this.f148774a.release();
        u.c(new po.g(this, 12));
    }

    public final c c(r0.c cVar) {
        Rect rectJ;
        u.a();
        q qVar = this.f148774a;
        Objects.toString(qVar);
        o oVar = cVar.f148700a;
        Objects.toString(oVar);
        List<t0.f> list = cVar.f148701b;
        Iterator<t0.f> it = list.iterator();
        while (it.hasNext()) {
            Objects.toString(it.next());
        }
        this.f148776c = new c();
        for (t0.f fVar : list) {
            c cVar2 = this.f148776c;
            Rect rectA = fVar.a();
            int iC = fVar.c();
            boolean zG = fVar.g();
            Matrix matrix = oVar.f148744b;
            Rect rect = oVar.f148746d;
            Matrix matrix2 = new Matrix(matrix);
            Matrix matrixA = v.a(iC, zG, new RectF(rectA), v.k(fVar.d()));
            matrix2.postConcat(matrixA);
            k7.h.a(v.e(v.i(v.g(rectA), iC), false, fVar.d()));
            if (fVar.h()) {
                k7.h.b(fVar.a().contains(rect), "Output crop rect " + fVar.a() + " must contain input crop rect " + rect);
                rectJ = new Rect();
                RectF rectF = new RectF(rect);
                matrixA.mapRect(rectF);
                rectF.round(rectJ);
            } else {
                rectJ = v.j(fVar.d());
            }
            Rect rect2 = rectJ;
            androidx.camera.core.impl.q.b bVarI = oVar.f148749g.i();
            bVarI.c(fVar.d());
            cVar2.put(fVar, new o(fVar.e(), fVar.b(), bVarI.a(), matrix2, false, rect2, oVar.f148751i - iC, -1, oVar.f148747e != zG));
        }
        try {
            qVar.a(oVar.d(this.f148775b, true));
        } catch (ProcessingException unused) {
        }
        for (Map.Entry<t0.f, o> entry : this.f148776c.entrySet()) {
            a(oVar, entry);
            entry.getValue().a(new fh2.a(this, 24, oVar, entry));
        }
        j1.v vVar = new j1.v(this.f148776c, 4);
        oVar.getClass();
        oVar.f148757o.add(vVar);
        return this.f148776c;
    }
}
