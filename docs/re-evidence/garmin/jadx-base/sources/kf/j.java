package kf;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.b0;
import androidx.room.a0;
import f5.a1;
import f5.b1;
import f5.k;
import f5.y0;
import f5.z0;
import java.util.List;
import jf.p;
import kotlin.l2;
import o4.v0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.math.MathKt;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f104590a = a.f104592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f104591b = g6.b.b(0, 0, 5);

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f104592a = new a();

        @Override // f5.z0
        public final a1 f(b1 b1Var, List<? extends y0> list, long j8) {
            return b1.h0(b1Var, g6.a.l(j8), g6.a.k(j8), new kb0.d(16));
        }
    }

    public static final jf.i a(m mVar) {
        x1 x1Var = n.f135158a;
        if (!((Boolean) mVar.A(l2.f91259a)).booleanValue()) {
            mVar.C(2019129125);
            mVar.f();
            return null;
        }
        mVar.C(2019071620);
        jf.i iVar = (jf.i) mVar.A(p.f98677a);
        mVar.f();
        return iVar;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0020 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    public static final xf.h b(k kVar, m mVar) {
        Object jVar;
        x1 x1Var = n.f135158a;
        k.f68985a.getClass();
        boolean zG = s.g(kVar, k.a.f68992g);
        boolean zH = mVar.h(zG);
        Object objQ = mVar.q();
        if (zH) {
            if (zG) {
                jVar = xf.h.E0;
            } else {
                jVar = new jf.j();
            }
            objQ = jVar;
            mVar.K(objQ);
        } else {
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                if (zG) {
                    jVar = xf.h.E0;
                } else {
                    jVar = new jf.j();
                }
                objQ = jVar;
                mVar.K(objQ);
            }
        }
        return (xf.h) objQ;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0041  */
    public static final wf.f c(Object obj, m mVar) {
        mVar.C(1319639034);
        x1 x1Var = n.f135158a;
        if (obj instanceof wf.f) {
            mVar.C(1530922508);
            wf.f fVar = (wf.f) obj;
            mVar.f();
            mVar.f();
            return fVar;
        }
        mVar.C(1530961754);
        Context context = (Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b);
        boolean zB = mVar.B(context) | mVar.B(obj);
        Object objQ = mVar.q();
        if (zB) {
            wf.f.a aVar = new wf.f.a(context);
            aVar.f184930c = obj;
            objQ = aVar.a();
            mVar.K(objQ);
        } else {
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                wf.f.a aVar2 = new wf.f.a(context);
                aVar2.f184930c = obj;
                objQ = aVar2.a();
                mVar.K(objQ);
            }
        }
        wf.f fVar2 = (wf.f) objQ;
        mVar.f();
        mVar.f();
        return fVar2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0092  */
    public static final wf.f d(Object obj, k kVar, m mVar, int i14) {
        mVar.C(-329318062);
        x1 x1Var = n.f135158a;
        boolean z14 = obj instanceof wf.f;
        m.a aVar = m.f135153a;
        if (!z14) {
            mVar.C(-1008549326);
            Context context = (Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b);
            xf.h hVarB = b(kVar, mVar);
            boolean zB = mVar.B(context) | mVar.B(obj) | mVar.B(hVarB);
            Object objQ = mVar.q();
            if (zB) {
                wf.f.a aVar2 = new wf.f.a(context);
                aVar2.f184930c = obj;
                aVar2.f184949v = hVarB;
                objQ = aVar2.a();
                mVar.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == m.a.f135155b) {
                    wf.f.a aVar3 = new wf.f.a(context);
                    aVar3.f184930c = obj;
                    aVar3.f184949v = hVarB;
                    objQ = aVar3.a();
                    mVar.K(objQ);
                }
            }
            wf.f fVar = (wf.f) objQ;
            mVar.f();
            mVar.f();
            return fVar;
        }
        mVar.C(-1008895720);
        wf.f fVar2 = (wf.f) obj;
        if (fVar2.f184926y.f184978k != null) {
            mVar.C(-1008855668);
            mVar.f();
            mVar.f();
            mVar.f();
            return fVar2;
        }
        mVar.C(-1008807494);
        xf.h hVarB2 = b(kVar, mVar);
        boolean zB2 = mVar.B(fVar2) | mVar.B(hVarB2);
        Object objQ2 = mVar.q();
        if (zB2) {
            wf.f.a aVarA = wf.f.a(fVar2);
            aVarA.f184949v = hVarB2;
            objQ2 = aVarA.a();
            mVar.K(objQ2);
        } else {
            aVar.getClass();
            if (objQ2 == m.a.f135155b) {
                wf.f.a aVarA2 = wf.f.a(fVar2);
                aVarA2.f184949v = hVarB2;
                objQ2 = aVarA2.a();
                mVar.K(objQ2);
            }
        }
        wf.f fVar3 = (wf.f) objQ2;
        mVar.f();
        mVar.f();
        mVar.f();
        return fVar3;
    }

    public static final long e(long j8) {
        int iC = MathKt.c(Float.intBitsToFloat((int) (j8 >> 32)));
        long jC = (((long) MathKt.c(Float.intBitsToFloat((int) (j8 & 4294967295L)))) & 4294967295L) | (((long) iC) << 32);
        g6.m.a aVar = g6.m.f76012b;
        return jC;
    }

    public static void f(String str) {
        throw new IllegalArgumentException(a0.j("Unsupported type: ", str, ". ", am.j.m("If you wish to display this ", str, ", use androidx.compose.foundation.Image.")));
    }

    public static final void g(wf.f fVar) {
        Object obj = fVar.f184903b;
        if (obj instanceof wf.f.a) {
            vb.h.s("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
            return;
        }
        if (obj instanceof v0) {
            f("ImageBitmap");
            throw null;
        }
        if (obj instanceof u4.d) {
            f("ImageVector");
            throw null;
        }
        if (obj instanceof t4.d) {
            f("Painter");
            throw null;
        }
        if (fVar.f184904c != null) {
            vb.h.s("request.target must be null.");
        } else {
            if (((b0) hf.g.a(fVar, wf.h.f184989e)) == null) {
                return;
            }
            vb.h.s("request.lifecycle must be null.");
        }
    }
}
