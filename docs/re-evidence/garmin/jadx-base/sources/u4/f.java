package u4;

import android.graphics.PathMeasure;
import java.util.List;
import o4.f1;
import o4.i1;
import o4.w;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lu4/f;", "Lu4/j;", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w f168408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f168409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<? extends g> f168410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f168411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f168412f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public w f168413g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f168414h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f168415i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f168416j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f168417k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f168418l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f168419m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f168420n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f168421o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f168422p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public q4.k f168423q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o4.j f168424r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public o4.j f168425s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public o4.j f168426t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f168427u;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo4/i1;", "invoke", "()Lo4/i1;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class a extends p005kotlin.jvm.internal.w implements e23.a<i1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f168428a = new a();

        public a() {
            super(0);
        }

        @Override // e23.a
        public final i1 invoke() {
            return new o4.l(new PathMeasure());
        }
    }

    public f() {
        super(null);
        this.f168409c = 1.0f;
        this.f168410d = m.f168519a;
        this.f168411e = 1.0f;
        this.f168414h = 0;
        this.f168415i = 0;
        this.f168416j = 4.0f;
        this.f168418l = 1.0f;
        this.f168420n = true;
        this.f168421o = true;
        o4.j jVarA = o4.m.a();
        this.f168424r = jVarA;
        this.f168425s = jVarA;
        this.f168427u = o13.m.a(o13.n.NONE, a.f168428a);
    }

    @Override // u4.j
    public final void a(q4.f fVar) {
        q4.k kVar;
        if (this.f168420n) {
            i.b(this.f168410d, this.f168424r);
            e();
        } else if (this.f168422p) {
            e();
        }
        this.f168420n = false;
        this.f168422p = false;
        w wVar = this.f168408b;
        if (wVar != null) {
            q4.f.C1(fVar, this.f168425s, wVar, this.f168409c, null, 56);
        }
        w wVar2 = this.f168413g;
        if (wVar2 != null) {
            q4.k kVar2 = this.f168423q;
            if (this.f168421o || kVar2 == null) {
                q4.k kVar3 = new q4.k(this.f168412f, this.f168416j, this.f168414h, this.f168415i, null, 16, null);
                this.f168423q = kVar3;
                this.f168421o = false;
                kVar = kVar3;
            } else {
                kVar = kVar2;
            }
            q4.f.C1(fVar, this.f168425s, wVar2, this.f168411e, kVar, 48);
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, o13.l] */
    public final void e() {
        float f14 = this.f168417k;
        o4.j jVar = this.f168424r;
        if (f14 == 0.0f && this.f168418l == 1.0f) {
            this.f168425s = jVar;
            return;
        }
        if (s.g(this.f168425s, jVar)) {
            this.f168425s = o4.m.a();
        } else {
            int iG = this.f168425s.g();
            this.f168425s.rewind();
            this.f168425s.j(iG);
        }
        ?? r14 = this.f168427u;
        ((i1) r14.getValue()).b(jVar);
        float length = ((i1) r14.getValue()).getLength();
        float f15 = this.f168417k;
        float f16 = this.f168419m;
        float f17 = ((f15 + f16) % 1.0f) * length;
        float f18 = ((this.f168418l + f16) % 1.0f) * length;
        if (f17 <= f18) {
            ((i1) r14.getValue()).a(f17, f18, this.f168425s);
            return;
        }
        o4.j jVarA = this.f168426t;
        if (jVarA == null) {
            jVarA = o4.m.a();
            this.f168426t = jVarA;
        }
        jVarA.reset();
        ((i1) r14.getValue()).a(f17, length, jVarA);
        f1.m(this.f168425s, jVarA);
        jVarA.reset();
        ((i1) r14.getValue()).a(0.0f, f18, jVarA);
        f1.m(this.f168425s, jVarA);
    }

    public final String toString() {
        return this.f168424r.toString();
    }
}
