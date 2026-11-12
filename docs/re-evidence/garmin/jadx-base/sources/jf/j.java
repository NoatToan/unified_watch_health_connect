package jf;

import a03.k0;
import f5.a1;
import f5.b1;
import f5.o0;
import f5.v1;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.y0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ljf/j;", "Lxf/h;", "Lf5/o0;", "<init>", "()V", "coil-compose-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements xf.h, o0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f98656c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f98657a = kf.j.f104591b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f98658b = new ArrayList();

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @v13.e(c = "coil3.compose.ConstraintsSizeResolver", f = "ConstraintsSizeResolver.kt", l = {77}, m = "size")
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public r0 f98659a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f98660b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f98662d;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f98660b = obj;
            this.f98662d |= Integer.MIN_VALUE;
            return j.this.a(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object, o53.k] */
    @Override // xf.h
    public final Object a(t13.d<? super xf.g> dVar) throws Throwable {
        a aVar;
        r0 r0Var;
        Throwable th3;
        xf.a aVarA;
        xf.a aVarA2;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f98662d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f98662d = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f98660b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f98662d;
        if (i15 == 0) {
            o13.r.b(obj);
            if (g6.a.m(this.f98657a)) {
                r0 r0Var2 = new r0();
                try {
                    aVar.f98659a = r0Var2;
                    aVar.f98662d = 1;
                    ?? kVar = new o53.k(u13.f.b(aVar), 1);
                    kVar.q();
                    r0Var2.f105810a = kVar;
                    this.f98658b.add(kVar);
                    if (kVar.p() == aVar2) {
                        return aVar2;
                    }
                    r0Var = r0Var2;
                    ArrayList arrayList = this.f98658b;
                    y0.a(arrayList).remove(r0Var.f105810a);
                } catch (Throwable th4) {
                    r0Var = r0Var2;
                    th3 = th4;
                    ArrayList arrayList2 = this.f98658b;
                    y0.a(arrayList2).remove(r0Var.f105810a);
                    throw th3;
                }
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r0Var = aVar.f98659a;
            try {
                o13.r.b(obj);
                ArrayList arrayList3 = this.f98658b;
                y0.a(arrayList3).remove(r0Var.f105810a);
            } catch (Throwable th5) {
                th3 = th5;
                ArrayList arrayList4 = this.f98658b;
                y0.a(arrayList4).remove(r0Var.f105810a);
                throw th3;
            }
        }
        long j8 = this.f98657a;
        kf.j.a aVar3 = kf.j.f104590a;
        int iJ = g6.a.j(j8);
        if (iJ != Integer.MAX_VALUE) {
            xf.b.a(iJ);
            aVarA = xf.a.C3547a.a(iJ);
        } else {
            aVarA = xf.a.b.f190608a;
        }
        int i16 = g6.a.i(j8);
        if (i16 != Integer.MAX_VALUE) {
            xf.b.a(i16);
            aVarA2 = xf.a.C3547a.a(i16);
        } else {
            aVarA2 = xf.a.b.f190608a;
        }
        return new xf.g(aVarA, aVarA2);
    }

    public final void g(long j8) {
        this.f98657a = j8;
        if (g6.a.m(j8)) {
            return;
        }
        ArrayList<t13.d> arrayList = this.f98658b;
        if (arrayList.isEmpty()) {
            return;
        }
        this.f98658b = new ArrayList();
        for (t13.d dVar : arrayList) {
            int i14 = o13.q.f128596b;
            dVar.resumeWith(Unit.INSTANCE);
        }
    }

    @Override // f5.o0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final a1 mo0measure3p2s80s(b1 b1Var, f5.y0 y0Var, long j8) {
        g(j8);
        v1 v1VarQ = y0Var.Q(j8);
        return b1.h0(b1Var, v1VarQ.f69144a, v1VarQ.f69145b, new k0(v1VarQ, 17));
    }
}
