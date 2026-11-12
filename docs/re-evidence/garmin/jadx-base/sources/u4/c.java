package u4;

import ch.qos.logback.classic.net.SyslogAppender;
import java.util.ArrayList;
import java.util.List;
import o4.a1;
import o4.c0;
import o4.d0;
import o4.t1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p13.j0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lu4/c;", "Lu4/j;", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f168354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f168355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f168356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f168357e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<? extends g> f168358f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f168359g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public o4.j f168360h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e23.l<? super j, Unit> f168361i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f168362j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f168363k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f168364l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f168365m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f168366n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f168367o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f168368p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f168369q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f168370r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f168371s;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu4/j;", "node", "", "invoke", "(Lu4/j;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class a extends w implements e23.l<j, Unit> {
        public a() {
            super(1);
        }

        @Override // e23.l
        public final Unit invoke(j jVar) {
            j jVar2 = jVar;
            c cVar = c.this;
            cVar.g(jVar2);
            e23.l<? super j, Unit> lVar = cVar.f168361i;
            if (lVar != null) {
                lVar.invoke(jVar2);
            }
            return Unit.INSTANCE;
        }
    }

    public c() {
        super(null);
        this.f168355c = new ArrayList();
        this.f168356d = true;
        d0.f128823b.getClass();
        this.f168357e = d0.f128832k;
        this.f168358f = m.f168519a;
        this.f168359g = true;
        this.f168362j = new a();
        this.f168363k = "";
        this.f168367o = 1.0f;
        this.f168368p = 1.0f;
        this.f168371s = true;
    }

    @Override // u4.j
    public final void a(q4.f fVar) {
        if (this.f168371s) {
            float[] fArrB = this.f168354b;
            if (fArrB == null) {
                fArrB = a1.b();
                this.f168354b = fArrB;
            } else {
                a1.e(fArrB);
            }
            a1.i(fArrB, this.f168369q + this.f168365m, this.f168370r + this.f168366n);
            a1.g(this.f168364l, fArrB);
            float f14 = this.f168367o;
            float f15 = this.f168368p;
            if (fArrB.length >= 16) {
                fArrB[0] = fArrB[0] * f14;
                fArrB[1] = fArrB[1] * f14;
                fArrB[2] = fArrB[2] * f14;
                fArrB[3] = fArrB[3] * f14;
                fArrB[4] = fArrB[4] * f15;
                fArrB[5] = fArrB[5] * f15;
                fArrB[6] = fArrB[6] * f15;
                fArrB[7] = fArrB[7] * f15;
                fArrB[8] = fArrB[8] * 1.0f;
                fArrB[9] = fArrB[9] * 1.0f;
                fArrB[10] = fArrB[10] * 1.0f;
                fArrB[11] = fArrB[11] * 1.0f;
            }
            a1.i(fArrB, -this.f168365m, -this.f168366n);
            this.f168371s = false;
        }
        if (this.f168359g) {
            if (!this.f168358f.isEmpty()) {
                o4.j jVarA = this.f168360h;
                if (jVarA == null) {
                    jVarA = o4.m.a();
                    this.f168360h = jVarA;
                }
                i.b(this.f168358f, jVarA);
            }
            this.f168359g = false;
        }
        q4.a.b f142543b = fVar.getF142543b();
        long jB = f142543b.b();
        f142543b.a().l();
        try {
            q4.b bVar = f142543b.f142550a;
            float[] fArr = this.f168354b;
            if (fArr != null) {
                bVar.f142553a.a().n(a1.a(fArr).f128808a);
            }
            o4.j jVar = this.f168360h;
            if (!this.f168358f.isEmpty() && jVar != null) {
                c0.f128819b.getClass();
                bVar.d(jVar, c0.f128820c);
            }
            ArrayList arrayList = this.f168355c;
            int size = arrayList.size();
            for (int i14 = 0; i14 < size; i14++) {
                ((j) arrayList.get(i14)).a(fVar);
            }
        } finally {
            tn.k.p(f142543b, jB);
        }
    }

    @Override // u4.j
    public final e23.l<j, Unit> b() {
        return this.f168361i;
    }

    @Override // u4.j
    public final void d(a aVar) {
        this.f168361i = aVar;
    }

    public final void e(int i14, j jVar) {
        ArrayList arrayList = this.f168355c;
        if (i14 < arrayList.size()) {
            arrayList.set(i14, jVar);
        } else {
            arrayList.add(jVar);
        }
        g(jVar);
        jVar.d(this.f168362j);
        c();
    }

    public final void f(long j8) {
        if (this.f168356d && j8 != 16) {
            long j14 = this.f168357e;
            if (j14 == 16) {
                this.f168357e = j8;
                return;
            }
            j0 j0Var = m.f168519a;
            if (d0.i(j14) == d0.i(j8) && d0.h(j14) == d0.h(j8) && d0.f(j14) == d0.f(j8)) {
                return;
            }
            this.f168356d = false;
            d0.f128823b.getClass();
            this.f168357e = d0.f128832k;
        }
    }

    public final void g(j jVar) {
        if (!(jVar instanceof f)) {
            if (jVar instanceof c) {
                c cVar = (c) jVar;
                if (cVar.f168356d && this.f168356d) {
                    f(cVar.f168357e);
                    return;
                }
                this.f168356d = false;
                d0.f128823b.getClass();
                this.f168357e = d0.f128832k;
                return;
            }
            return;
        }
        f fVar = (f) jVar;
        o4.w wVar = fVar.f168408b;
        if (this.f168356d && wVar != null) {
            if (wVar instanceof t1) {
                f(((t1) wVar).f129007b);
            } else {
                this.f168356d = false;
                d0.f128823b.getClass();
                this.f168357e = d0.f128832k;
            }
        }
        o4.w wVar2 = fVar.f168413g;
        if (this.f168356d && wVar2 != null) {
            if (wVar2 instanceof t1) {
                f(((t1) wVar2).f129007b);
                return;
            }
            this.f168356d = false;
            d0.f128823b.getClass();
            this.f168357e = d0.f128832k;
        }
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VGroup: ");
        sb3.append(this.f168363k);
        ArrayList arrayList = this.f168355c;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            j jVar = (j) arrayList.get(i14);
            sb3.append(SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
            sb3.append(jVar.toString());
            sb3.append("\n");
        }
        return sb3.toString();
    }
}
