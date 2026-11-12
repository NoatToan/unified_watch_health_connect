package defpackage;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.decoder.DecodeException;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class nv5 implements n3d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n3d f28465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n3d f28466b;
    public final h0i c;
    public final n3d d;
    public final Map<l4d, n3d> e;

    public class a implements n3d {
        public a() {
        }

        @Override // defpackage.n3d
        public u14 a(o98 o98Var, int i, tfi tfiVar, l3d l3dVar) {
            l4d l4dVarS = o98Var.s();
            if (l4dVarS == pv5.f30818a) {
                return nv5.this.d(o98Var, i, tfiVar, l3dVar);
            }
            if (l4dVarS == pv5.c) {
                return nv5.this.c(o98Var, i, tfiVar, l3dVar);
            }
            if (l4dVarS == pv5.j) {
                return nv5.this.b(o98Var, i, tfiVar, l3dVar);
            }
            if (l4dVarS != l4d.c) {
                return nv5.this.e(o98Var, l3dVar);
            }
            throw new DecodeException("unknown image format", o98Var);
        }
    }

    public nv5(n3d n3dVar, n3d n3dVar2, h0i h0iVar) {
        this(n3dVar, n3dVar2, h0iVar, null);
    }

    @Override // defpackage.n3d
    public u14 a(o98 o98Var, int i, tfi tfiVar, l3d l3dVar) {
        n3d n3dVar;
        n3d n3dVar2 = l3dVar.h;
        if (n3dVar2 != null) {
            return n3dVar2.a(o98Var, i, tfiVar, l3dVar);
        }
        l4d l4dVarS = o98Var.s();
        if (l4dVarS == null || l4dVarS == l4d.c) {
            l4dVarS = m4d.c(o98Var.y());
            o98Var.b0(l4dVarS);
        }
        Map<l4d, n3d> map = this.e;
        return (map == null || (n3dVar = map.get(l4dVarS)) == null) ? this.d.a(o98Var, i, tfiVar, l3dVar) : n3dVar.a(o98Var, i, tfiVar, l3dVar);
    }

    public u14 b(o98 o98Var, int i, tfi tfiVar, l3d l3dVar) {
        return this.f28466b.a(o98Var, i, tfiVar, l3dVar);
    }

    public u14 c(o98 o98Var, int i, tfi tfiVar, l3d l3dVar) {
        n3d n3dVar;
        return (l3dVar.e || (n3dVar = this.f28465a) == null) ? e(o98Var, l3dVar) : n3dVar.a(o98Var, i, tfiVar, l3dVar);
    }

    public z14 d(o98 o98Var, int i, tfi tfiVar, l3d l3dVar) {
        w14<Bitmap> w14VarB = this.c.b(o98Var, l3dVar.g, null, i, l3dVar.f);
        try {
            f(null, w14VarB);
            return new z14(w14VarB, tfiVar, o98Var.D(), o98Var.o());
        } finally {
            w14VarB.close();
        }
    }

    public z14 e(o98 o98Var, l3d l3dVar) {
        w14<Bitmap> w14VarA = this.c.a(o98Var, l3dVar.g, null, l3dVar.f);
        try {
            f(null, w14VarA);
            return new z14(w14VarA, z6d.d, o98Var.D(), o98Var.o());
        } finally {
            w14VarA.close();
        }
    }

    public final void f(hq2 hq2Var, w14<Bitmap> w14Var) {
        if (hq2Var == null) {
            return;
        }
        Bitmap bitmapN = w14Var.n();
        if (hq2Var.a()) {
            bitmapN.setHasAlpha(true);
        }
        hq2Var.b(bitmapN);
    }

    public nv5(n3d n3dVar, n3d n3dVar2, h0i h0iVar, Map<l4d, n3d> map) {
        this.d = new a();
        this.f28465a = n3dVar;
        this.f28466b = n3dVar2;
        this.c = h0iVar;
        this.e = map;
    }
}
