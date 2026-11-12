package com.airbnb.lottie.model.layer;

import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.model.content.LBlendMode;
import com.airbnb.lottie.model.content.Mask;
import defpackage.cx;
import defpackage.fu;
import defpackage.gd;
import defpackage.ge;
import defpackage.gf;
import defpackage.gg;
import defpackage.ho;
import defpackage.jb;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes21.dex */
public class Layer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final cx f1949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ho f1950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LBlendMode f1951c;
    private final ge d;
    private final boolean e;
    private final String f;
    private final List<Mask> g;
    private final List<jb<Float>> h;
    private final long i;
    private final LayerType j;
    private final String k;
    private final float l;
    private final MatteType m;
    private final long n;
    private final float o;
    private final int p;
    private final List<ContentModel> q;
    private final int r;
    private final float s;
    private final int t;
    private final gg u;
    private final float v;
    private final gd w;
    private final fu x;
    private final gf y;

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

    public Layer(List<ContentModel> list, cx cxVar, String str, long j, LayerType layerType, long j2, String str2, List<Mask> list2, gf gfVar, int i, int i2, int i3, float f, float f2, float f3, float f4, gd gdVar, gg ggVar, List<jb<Float>> list3, MatteType matteType, fu fuVar, boolean z, ge geVar, ho hoVar, LBlendMode lBlendMode) {
        this.q = list;
        this.f1949a = cxVar;
        this.f = str;
        this.i = j;
        this.j = layerType;
        this.n = j2;
        this.k = str2;
        this.g = list2;
        this.y = gfVar;
        this.p = i;
        this.t = i2;
        this.r = i3;
        this.v = f;
        this.s = f2;
        this.l = f3;
        this.o = f4;
        this.w = gdVar;
        this.u = ggVar;
        this.h = list3;
        this.m = matteType;
        this.x = fuVar;
        this.e = z;
        this.d = geVar;
        this.f1950b = hoVar;
        this.f1951c = lBlendMode;
    }

    public cx b() {
        return this.f1949a;
    }

    public float x() {
        return this.v;
    }

    public float r() {
        return this.s / this.f1949a.d();
    }

    List<jb<Float>> f() {
        return this.h;
    }

    public long d() {
        return this.i;
    }

    public String g() {
        return this.f;
    }

    public String k() {
        return this.k;
    }

    public float n() {
        return this.l;
    }

    public float m() {
        return this.o;
    }

    List<Mask> i() {
        return this.g;
    }

    public LayerType h() {
        return this.j;
    }

    public MatteType j() {
        return this.m;
    }

    public long o() {
        return this.n;
    }

    public List<ContentModel> l() {
        return this.q;
    }

    gf y() {
        return this.y;
    }

    public int q() {
        return this.r;
    }

    public int s() {
        return this.t;
    }

    public int p() {
        return this.p;
    }

    public gd t() {
        return this.w;
    }

    public gg w() {
        return this.u;
    }

    public fu v() {
        return this.x;
    }

    public String toString() {
        return b("");
    }

    public boolean u() {
        return this.e;
    }

    public LBlendMode e() {
        return this.f1951c;
    }

    public ge a() {
        return this.d;
    }

    public ho c() {
        return this.f1950b;
    }

    public String b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(g());
        sb.append("\n");
        Layer layerA = this.f1949a.a(o());
        if (layerA != null) {
            sb.append("\t\tParents: ");
            sb.append(layerA.g());
            Layer layerA2 = this.f1949a.a(layerA.o());
            while (layerA2 != null) {
                sb.append("->");
                sb.append(layerA2.g());
                layerA2 = this.f1949a.a(layerA2.o());
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!i().isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(i().size());
            sb.append("\n");
        }
        if (p() != 0 && s() != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(p()), Integer.valueOf(s()), Integer.valueOf(q())));
        }
        if (!this.q.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (ContentModel contentModel : this.q) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(contentModel);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
