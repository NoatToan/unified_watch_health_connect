package u2;

import d4.n;
import f4.s;
import java.util.List;
import org.apache.commons.io.IOUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.d0;
import p13.w;
import p13.x;
import p3.c2;
import p3.p0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\bB#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lu2/k;", "", "Lx2/d;", "initialStagingUndo", "Lx2/e;", "undoManager", "<init>", "(Lx2/d;Lx2/e;)V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f167857c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x2.e<x2.d> f167858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c2 f167859b;

    static {
        new a(null);
    }

    public /* synthetic */ k(x2.d dVar, x2.e eVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : dVar, (i14 & 2) != 0 ? new x2.e(null, null, 100, 3, null) : eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        c2 c2Var = this.f167859b;
        f4.f.f68735e.getClass();
        f4.f fVarA = f4.f.a.a();
        e23.l<Object, Unit> f68793s = fVarA != null ? fVarA.getF68733f() : null;
        f4.f fVarB = f4.f.a.b(fVarA);
        try {
            x2.d dVar = (x2.d) c2Var.getF182175a();
            f4.f.a.e(fVarA, fVarB, f68793s);
            if (dVar != null) {
                x2.e<x2.d> eVar = this.f167858a;
                s<x2.d> sVar = eVar.f188478b;
                s<x2.d> sVar2 = eVar.f188479c;
                sVar2.clear();
                while (sVar2.size() + sVar.size() > eVar.f188477a - 1) {
                    d0.D(sVar);
                }
                sVar.add(dVar);
            }
            c2Var.setValue(null);
        } catch (Throwable th3) {
            f4.f.a.e(fVarA, fVarB, f68793s);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0075  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void b(x2.d dVar) {
        x2.d dVar2;
        x2.d dVar3;
        c2 c2Var = this.f167859b;
        String str = dVar.f188470c;
        f4.f.f68735e.getClass();
        f4.f fVarA = f4.f.a.a();
        e23.l<Object, Unit> f68793s = fVarA != null ? fVarA.getF68733f() : null;
        f4.f fVarB = f4.f.a.b(fVarA);
        try {
            x2.d dVar4 = (x2.d) c2Var.getF182175a();
            f4.f.a.e(fVarA, fVarB, f68793s);
            if (dVar4 == null) {
                c2Var.setValue(dVar);
                return;
            }
            boolean z14 = dVar4.f188474g;
            String str2 = dVar4.f188469b;
            String str3 = dVar4.f188470c;
            x2.b bVar = dVar4.f188475h;
            int i14 = dVar4.f188468a;
            if (z14) {
                boolean z15 = dVar.f188474g;
                String str4 = dVar.f188469b;
                int i15 = dVar.f188468a;
                if (z15) {
                    long j8 = dVar.f188473f;
                    long j14 = dVar4.f188473f;
                    if (j8 < j14 || j8 - j14 >= 5000 || p005kotlin.jvm.internal.s.g(str3, "\n") || p005kotlin.jvm.internal.s.g(str3, IOUtils.LINE_SEPARATOR_WINDOWS) || p005kotlin.jvm.internal.s.g(str, "\n") || p005kotlin.jvm.internal.s.g(str, IOUtils.LINE_SEPARATOR_WINDOWS) || bVar != dVar.f188475h) {
                        dVar2 = null;
                    } else {
                        if (bVar == x2.b.Insert && str3.length() + i14 == i15) {
                            dVar3 = new x2.d(dVar4.f188468a, "", tn.k.g(str3, str), dVar4.f188471d, dVar.f188472e, dVar4.f188473f, false, 64, null);
                        } else if (bVar != x2.b.Delete || dVar4.a() != dVar.a() || (dVar4.a() != x2.a.Start && dVar4.a() != x2.a.End)) {
                            dVar2 = null;
                        } else if (i14 == str4.length() + i15) {
                            dVar3 = new x2.d(dVar.f188468a, tn.k.g(str4, str2), "", dVar4.f188471d, dVar.f188472e, dVar4.f188473f, false, 64, null);
                        } else if (i14 == i15) {
                            dVar2 = new x2.d(dVar4.f188468a, tn.k.g(str2, str4), "", dVar4.f188471d, dVar.f188472e, dVar4.f188473f, false, 64, null);
                        } else {
                            dVar2 = null;
                        }
                        dVar2 = dVar3;
                    }
                } else {
                    dVar2 = null;
                }
            } else {
                dVar2 = null;
            }
            if (dVar2 != null) {
                c2Var.setValue(dVar2);
            } else {
                a();
                c2Var.setValue(dVar);
            }
        } catch (Throwable th3) {
            f4.f.a.e(fVarA, fVarB, f68793s);
            throw th3;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lu2/k$a;", "", "<init>", "()V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: u2.k$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lu2/k$a$a;", "Ld4/k;", "Lu2/k;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C3151a implements d4.k<k, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C3151a f167860a = new C3151a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C3152a f167861b;

            /* JADX INFO: renamed from: u2.k$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"u2/k$a$a$a", "Ld4/k;", "Lx2/e;", "", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class C3152a implements d4.k<x2.e<x2.d>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ d4.k f167862a;

                public C3152a(d4.k kVar) {
                    this.f167862a = kVar;
                }

                @Override // d4.k
                public final x2.e<x2.d> a(Object obj) {
                    d4.k kVar;
                    obj.getClass();
                    List list = (List) obj;
                    int iIntValue = ((Number) list.get(0)).intValue();
                    int iIntValue2 = ((Number) list.get(1)).intValue();
                    int iIntValue3 = ((Number) list.get(2)).intValue();
                    q13.b bVarB = w.b();
                    int i14 = 3;
                    while (true) {
                        int i15 = iIntValue2 + 3;
                        kVar = this.f167862a;
                        if (i14 >= i15) {
                            break;
                        }
                        Object objA = kVar.a(list.get(i14));
                        objA.getClass();
                        bVarB.add(objA);
                        i14++;
                    }
                    q13.b bVarA = w.a(bVarB);
                    q13.b bVarB2 = w.b();
                    while (i14 < iIntValue2 + iIntValue3 + 3) {
                        Object objA2 = kVar.a(list.get(i14));
                        objA2.getClass();
                        bVarB2.add(objA2);
                        i14++;
                    }
                    return new x2.e<>(bVarA, w.a(bVarB2), iIntValue);
                }

                @Override // d4.k
                public final Object b(n nVar, x2.e<x2.d> eVar) {
                    d4.k kVar;
                    x2.e<x2.d> eVar2 = eVar;
                    q13.b bVarB = w.b();
                    bVarB.add(Integer.valueOf(eVar2.f188477a));
                    s<x2.d> sVar = eVar2.f188478b;
                    bVarB.add(Integer.valueOf(sVar.size()));
                    s<x2.d> sVar2 = eVar2.f188479c;
                    bVarB.add(Integer.valueOf(sVar2.size()));
                    int size = sVar.size();
                    int i14 = 0;
                    while (true) {
                        kVar = this.f167862a;
                        if (i14 >= size) {
                            break;
                        }
                        bVarB.add(kVar.b(nVar, sVar.get(i14)));
                        i14++;
                    }
                    int size2 = sVar2.size();
                    for (int i15 = 0; i15 < size2; i15++) {
                        bVarB.add(kVar.b(nVar, sVar2.get(i15)));
                    }
                    return w.a(bVarB);
                }
            }

            static {
                int i14 = x2.e.f188476d;
                x2.d.f188466i.getClass();
                f167861b = new C3152a(x2.d.f188467j);
            }

            private C3151a() {
            }

            public static k c(Object obj) {
                x2.d dVar;
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                Object obj3 = list.get(1);
                if (obj2 != null) {
                    x2.d.f188466i.getClass();
                    dVar = (x2.d) x2.d.f188467j.a(obj2);
                } else {
                    dVar = null;
                }
                obj3.getClass();
                return new k(dVar, f167861b.a(obj3));
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static List d(n nVar, k kVar) {
                Object objB;
                int i14 = k.f167857c;
                x2.d dVar = (x2.d) kVar.f167859b.getF182175a();
                if (dVar != null) {
                    x2.d.f188466i.getClass();
                    objB = x2.d.f188467j.b(nVar, dVar);
                } else {
                    objB = null;
                }
                return x.k(objB, f167861b.b(nVar, kVar.f167858a));
            }

            @Override // d4.k
            public final /* bridge */ /* synthetic */ k a(Object obj) {
                return c(obj);
            }

            @Override // d4.k
            public final /* bridge */ /* synthetic */ Object b(n nVar, k kVar) {
                return d(nVar, kVar);
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public k(x2.d dVar, x2.e<x2.d> eVar) {
        this.f167858a = eVar;
        this.f167859b = p0.n(dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
