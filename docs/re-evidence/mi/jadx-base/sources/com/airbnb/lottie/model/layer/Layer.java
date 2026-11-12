package com.airbnb.lottie.model.layer;

import com.airbnb.lottie.model.content.Mask;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import defpackage.e1e;
import defpackage.eb1;
import defpackage.f67;
import defpackage.fi4;
import defpackage.lse;
import defpackage.nb1;
import defpackage.ob1;
import defpackage.qb1;
import defpackage.v33;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class Layer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<fi4> f5692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lse f5693b;
    public final String c;
    public final long d;
    public final LayerType e;
    public final long f;
    public final String g;
    public final List<Mask> h;
    public final qb1 i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f5694k;
    public final int l;
    public final float m;
    public final float n;
    public final float o;
    public final float p;
    public final nb1 q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ob1 f5695r;
    public final eb1 s;
    public final List<e1e<Float>> t;
    public final MatteType u;
    public final boolean v;
    public final v33 w;
    public final f67 x;

    public enum LayerType {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public enum MatteType {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public Layer(List<fi4> list, lse lseVar, String str, long j, LayerType layerType, long j2, String str2, List<Mask> list2, qb1 qb1Var, int i, int i2, int i3, float f, float f2, float f3, float f4, nb1 nb1Var, ob1 ob1Var, List<e1e<Float>> list3, MatteType matteType, eb1 eb1Var, boolean z, v33 v33Var, f67 f67Var) {
        this.f5692a = list;
        this.f5693b = lseVar;
        this.c = str;
        this.d = j;
        this.e = layerType;
        this.f = j2;
        this.g = str2;
        this.h = list2;
        this.i = qb1Var;
        this.j = i;
        this.f5694k = i2;
        this.l = i3;
        this.m = f;
        this.n = f2;
        this.o = f3;
        this.p = f4;
        this.q = nb1Var;
        this.f5695r = ob1Var;
        this.t = list3;
        this.u = matteType;
        this.s = eb1Var;
        this.v = z;
        this.w = v33Var;
        this.x = f67Var;
    }

    public v33 a() {
        return this.w;
    }

    public lse b() {
        return this.f5693b;
    }

    public f67 c() {
        return this.x;
    }

    public long d() {
        return this.d;
    }

    public List<e1e<Float>> e() {
        return this.t;
    }

    public LayerType f() {
        return this.e;
    }

    public List<Mask> g() {
        return this.h;
    }

    public MatteType h() {
        return this.u;
    }

    public String i() {
        return this.c;
    }

    public long j() {
        return this.f;
    }

    public float k() {
        return this.p;
    }

    public float l() {
        return this.o;
    }

    public String m() {
        return this.g;
    }

    public List<fi4> n() {
        return this.f5692a;
    }

    public int o() {
        return this.l;
    }

    public int p() {
        return this.f5694k;
    }

    public int q() {
        return this.j;
    }

    public float r() {
        return this.n / this.f5693b.e();
    }

    public nb1 s() {
        return this.q;
    }

    public ob1 t() {
        return this.f5695r;
    }

    public String toString() {
        return y("");
    }

    public eb1 u() {
        return this.s;
    }

    public float v() {
        return this.m;
    }

    public qb1 w() {
        return this.i;
    }

    public boolean x() {
        return this.v;
    }

    public String y(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i());
        sb.append("\n");
        Layer layerT = this.f5693b.t(j());
        if (layerT != null) {
            sb.append("\t\tParents: ");
            sb.append(layerT.i());
            Layer layerT2 = this.f5693b.t(layerT.j());
            while (layerT2 != null) {
                sb.append(LifecycleConstantKt.DATA_DELIMITER);
                sb.append(layerT2.i());
                layerT2 = this.f5693b.t(layerT2.j());
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!g().isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(g().size());
            sb.append("\n");
        }
        if (q() != 0 && p() != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(q()), Integer.valueOf(p()), Integer.valueOf(o())));
        }
        if (!this.f5692a.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (fi4 fi4Var : this.f5692a) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(fi4Var);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
