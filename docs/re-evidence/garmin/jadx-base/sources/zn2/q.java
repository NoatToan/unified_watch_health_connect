package zn2;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.gpay.model.Product;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import i3.e5;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lzn2/q;", "Lms2/c;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q implements ms2.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f205734b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o13.t f205735c = o13.m.b(new zd0.r0(13));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List<o13.p<qs2.a, a.C3842a>> f205736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List<qs2.a> f205737e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final is2.b f205738a = is2.b.FITPAY;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewFitPayCardProductCatalogProvider", f = "NewFitPayCardProductCatalogProvider.kt", l = {45}, m = "getOperators", v = 2)
    public static final class b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ns2.a f205743a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f205744b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f205746d;

        public b(t13.d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f205744b = obj;
            this.f205746d |= Integer.MIN_VALUE;
            return q.this.c(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewFitPayCardProductCatalogProvider", f = "NewFitPayCardProductCatalogProvider.kt", l = {132}, m = "isOperatorOccurrenceExceeded", v = 2)
    public static final class c extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public t3 f205747a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ns2.a f205748b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f205749c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f205750d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f205752f;

        public c(t13.d<? super c> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f205750d = obj;
            this.f205752f |= Integer.MIN_VALUE;
            return q.this.d(0L, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewFitPayCardProductCatalogProvider", f = "NewFitPayCardProductCatalogProvider.kt", l = {TsExtractor.TS_STREAM_TYPE_AC4}, m = "isProductOccurrenceExceeded", v = 2)
    public static final class d extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public u3 f205753a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f205754b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f205755c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f205757e;

        public d(t13.d<? super d> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f205755c = obj;
            this.f205757e |= Integer.MIN_VALUE;
            return q.this.e(0L, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        List<o13.p<qs2.a, a.C3842a>> listK = p13.x.k(new o13.p(qs2.a.f147378g, new a.C3842a(R.string.operator_visa, 2131233597, 7000, 7000)), new o13.p(qs2.a.f147379h, new a.C3842a(R.string.operator_mastercard, 2131232993, 23000, 13000)), new o13.p(qs2.a.f147380i, new a.C3842a(R.string.operator_discover, 2131231547, 68000, 0)), new o13.p(qs2.a.f147381j, new a.C3842a(R.string.operator_maestro, 2131232942, 0, 0)));
        f205736d = listK;
        ArrayList arrayList = new ArrayList(p13.y.r(listK, 10));
        Iterator<T> it = listK.iterator();
        while (it.hasNext()) {
            arrayList.add((qs2.a) ((o13.p) it.next()).f128594a);
        }
        f205737e = p13.w.c(qs2.a.f147388q);
    }

    @Override // ms2.c
    /* JADX INFO: renamed from: a, reason: from getter */
    public final is2.b getF205738a() {
        return this.f205738a;
    }

    @Override // ms2.c
    public final Object b(ms2.e eVar, ps2.o oVar) throws IOException {
        if (eVar instanceof zq2.g) {
            return new ns2.a(p13.w.c(eVar), true);
        }
        if (!(eVar instanceof t3)) {
            return gg.b.q(false);
        }
        Object objF = f((t3) eVar, oVar);
        return objF == u13.a.COROUTINE_SUSPENDED ? objF : (ns2.a) objF;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ms2.c
    public final Object c(hs2.a aVar, t13.d<? super ns2.a<? extends ms2.e>> dVar) {
        b bVar;
        ns2.a aVarQ;
        ns2.a aVar2;
        Object bVar2;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i14 = bVar.f205746d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f205746d = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objE0 = bVar.f205744b;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f205746d;
        if (i15 == 0) {
            o13.r.b(objE0);
            zf.b.r();
            ns2.b bVar3 = new ns2.b(aVar, gh2.i.f77458c.a().f77477b.h("garminpay_feature_fitpay_restricted_devices"), ((com.garmin.android.apps.connectmobile.l) zf.b.r()).l());
            j jVar = j.f205593a;
            Set<pl2.c> setB = aVar.getNfcInfo().b();
            jVar.getClass();
            boolean zE = j.e(setB);
            a aVar4 = f205734b;
            if (zE) {
                a.a(aVar4).info("Here is the fitpay capability, add hard coded items.");
                List<o13.p<qs2.a, a.C3842a>> list = f205736d;
                ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    o13.p pVar = (o13.p) it.next();
                    qs2.a aVar5 = (qs2.a) pVar.f128594a;
                    a.C3842a c3842a = (a.C3842a) pVar.f128595b;
                    zq2.g.a aVar6 = zq2.g.f206679k;
                    String string = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().getString(c3842a.f205739a);
                    string.getClass();
                    ArrayList arrayListA = bVar3.a(aVar5);
                    aVar6.getClass();
                    arrayList.add(zq2.g.a.a(aVar5, string, arrayListA));
                }
                aVarQ = new ns2.a(arrayList, true);
            } else {
                a.a(aVar4).info("No fitpay capability, won't add hard coded items.");
                aVarQ = gg.b.q(true);
            }
            try {
                int i16 = o13.q.f128596b;
                bVar.f205743a = aVarQ;
                bVar.f205746d = 1;
                try {
                    x53.c cVar = o53.s0.f129406a;
                    objE0 = ge1.b.e0(x53.b.f189152a, new r(aVar, bVar3, null), bVar);
                    if (objE0 == aVar3) {
                        return aVar3;
                    }
                    aVar2 = aVarQ;
                } catch (Throwable th3) {
                    th = th3;
                    aVar2 = aVarQ;
                    int i17 = o13.q.f128596b;
                    bVar2 = new o13.q.b(th);
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar2 = bVar.f205743a;
            try {
                o13.r.b(objE0);
            } catch (Throwable th5) {
                th = th5;
                int i18 = o13.q.f128596b;
                bVar2 = new o13.q.b(th);
            }
        }
        bVar2 = (ns2.a) objE0;
        int i19 = o13.q.f128596b;
        ns2.a aVarQ2 = (ns2.a) (bVar2 instanceof o13.q.b ? null : bVar2);
        if (aVarQ2 == null) {
            aVarQ2 = gg.b.q(false);
        }
        aVar2.getClass();
        return new ns2.a(p13.h0.C0(aVar2, aVarQ2), aVar2.f127816b && aVarQ2.f127816b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ms2.c
    public final Object d(long j8, ms2.e eVar, ns2.a<? extends ms2.f> aVar, t13.d<? super Boolean> dVar) throws IOException {
        c cVar;
        Object next;
        String str;
        fo2.m0 links;
        fo2.p credentials;
        String link;
        int i14;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i15 = cVar.f205752f;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                cVar.f205752f = i15 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object objJ = cVar.f205750d;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i16 = cVar.f205752f;
        if (i16 == 0) {
            o13.r.b(objJ);
            if (!(eVar instanceof t3)) {
                return Boolean.FALSE;
            }
            ms2.g gVarA = ps2.w.f140538a.a(this.f205738a);
            if (!(gVarA instanceof z0)) {
                gVarA = null;
            }
            z0 z0Var = (z0) gVarA;
            if (z0Var == null) {
                return Boolean.FALSE;
            }
            g1 g1Var = z0Var.f205979a;
            Iterator<T> it = g1Var.f205531f.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((fo2.s) next).f73103c != j8);
            fo2.s sVar = (fo2.s) next;
            if (sVar == null || (str = sVar.f73101a) == null) {
                return Boolean.FALSE;
            }
            fo2.u uVar = g1Var.f205530e;
            if (uVar == null || (links = uVar.getLinks()) == null || (credentials = links.getCredentials()) == null || (link = credentials.getLink()) == null) {
                kg.f.n("No credentialsLink");
                return null;
            }
            u0 u0Var = u0.f205864a;
            cVar.f205747a = (t3) eVar;
            cVar.f205748b = aVar;
            cVar.f205749c = str;
            cVar.f205752f = 1;
            objJ = u0Var.j(link, p13.l0.f134950a, cVar);
            if (objJ == aVar2) {
                return aVar2;
            }
        } else {
            if (i16 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = cVar.f205749c;
            aVar = cVar.f205748b;
            eVar = cVar.f205747a;
            o13.r.b(objJ);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Iterable) objJ) {
            if (p005kotlin.jvm.internal.s.g(((fo2.l0) obj).getDeviceId(), str)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(p13.y.r(aVar, 10));
        for (T t7 : aVar.f127815a) {
            t7.getClass();
            arrayList2.add((u3) t7);
        }
        ArrayList arrayList3 = new ArrayList(p13.y.r(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((u3) it3.next()).f205880a.getProductId());
        }
        if (arrayList.isEmpty()) {
            i14 = 0;
        } else {
            Iterator it4 = arrayList.iterator();
            i14 = 0;
            while (it4.hasNext()) {
                if (arrayList3.contains(((fo2.l0) it4.next()).k().getProductId()) && (i14 = i14 + 1) < 0) {
                    p13.x.p();
                    throw null;
                }
            }
        }
        return Boolean.valueOf(i14 >= ((t3) eVar).f205850a.getMaxOccurrencesPerDevice());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ms2.c
    public final Object e(long j8, ms2.f fVar, t13.d<? super Boolean> dVar) throws IOException {
        d dVar2;
        Object next;
        String str;
        fo2.m0 links;
        fo2.p credentials;
        String link;
        int i14;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i15 = dVar2.f205757e;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                dVar2.f205757e = i15 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object objJ = dVar2.f205755c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = dVar2.f205757e;
        if (i16 == 0) {
            o13.r.b(objJ);
            if (!(fVar instanceof u3)) {
                return Boolean.FALSE;
            }
            ms2.g gVarA = ps2.w.f140538a.a(this.f205738a);
            if (!(gVarA instanceof z0)) {
                gVarA = null;
            }
            z0 z0Var = (z0) gVarA;
            if (z0Var == null) {
                return Boolean.FALSE;
            }
            g1 g1Var = z0Var.f205979a;
            Iterator<T> it = g1Var.f205531f.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((fo2.s) next).f73103c != j8);
            fo2.s sVar = (fo2.s) next;
            if (sVar == null || (str = sVar.f73101a) == null) {
                return Boolean.FALSE;
            }
            fo2.u uVar = g1Var.f205530e;
            if (uVar == null || (links = uVar.getLinks()) == null || (credentials = links.getCredentials()) == null || (link = credentials.getLink()) == null) {
                kg.f.n("No credentialsLink");
                return null;
            }
            u0 u0Var = u0.f205864a;
            dVar2.f205753a = (u3) fVar;
            dVar2.f205754b = str;
            dVar2.f205757e = 1;
            objJ = u0Var.j(link, p13.l0.f134950a, dVar2);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i16 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = dVar2.f205754b;
            fVar = dVar2.f205753a;
            o13.r.b(objJ);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Iterable) objJ) {
            if (p005kotlin.jvm.internal.s.g(((fo2.l0) obj).getDeviceId(), str)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            i14 = 0;
        } else {
            Iterator it3 = arrayList.iterator();
            i14 = 0;
            while (it3.hasNext()) {
                if (p005kotlin.jvm.internal.s.g(((fo2.l0) it3.next()).k().getProductId(), ((u3) fVar).f205880a.getProductId()) && (i14 = i14 + 1) < 0) {
                    p13.x.p();
                    throw null;
                }
            }
        }
        return Boolean.valueOf(i14 >= ((u3) fVar).f205880a.getMaxOccurrencesPerDevice());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, java.util.Map] */
    public final Object f(t3 t3Var, v13.c cVar) throws IOException {
        s sVar;
        String link;
        u3 u3VarA;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i14 = sVar.f205804c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                sVar.f205804c = i14 - Integer.MIN_VALUE;
            } else {
                sVar = new s(this, cVar);
            }
        } else {
            sVar = new s(this, cVar);
        }
        Object objC = sVar.f205802a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = sVar.f205804c;
        if (i15 == 0) {
            o13.r.b(objC);
            fo2.p pVar = (fo2.p) t3Var.f205850a.getLinks().f51142a.get("products");
            if (pVar == null || (link = pVar.getLink()) == null) {
                n23.j.A(t3Var.f205850a, "Missing products link in ");
                return null;
            }
            u0 u0Var = u0.f205864a;
            sVar.f205804c = 1;
            objC = u0Var.c(link, sVar);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objC);
        }
        ArrayList arrayList = new ArrayList();
        for (Product product : (Iterable) objC) {
            try {
                u3.f205879f.getClass();
                u3VarA = u3.a.a(product);
            } catch (Throwable th3) {
                a.a(f205734b).warn("Error during convert product into ServerBasedProduct, drop " + product, th3);
                u3VarA = null;
            }
            if (u3VarA != null) {
                arrayList.add(u3VarA);
            }
        }
        return new ns2.a(arrayList, true);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\r"}, d2 = {"Lzn2/q$a;", "", "<init>", "()V", "", "Lo13/p;", "Lqs2/a;", "Lzn2/q$a$a;", "HARD_CODED_BUSINESS_OPERATOR_INFOS", "Ljava/util/List;", "HARD_CODED_BUSINESS_OPERATORS", "SERVER_BACKED_BUSINESS_OPERATORS", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: zn2.q$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lzn2/q$a$a;", "", "", "cardNameRes", "cardImageRes", "firstCardEstimatedSize", "nextCardEstimatedSize", "<init>", "(IIII)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C3842a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f205739a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f205740b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f205741c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final int f205742d;

            public C3842a(int i14, int i15, int i16, int i17) {
                this.f205739a = i14;
                this.f205740b = i15;
                this.f205741c = i16;
                this.f205742d = i17;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3842a)) {
                    return false;
                }
                C3842a c3842a = (C3842a) obj;
                return this.f205739a == c3842a.f205739a && this.f205740b == c3842a.f205740b && this.f205741c == c3842a.f205741c && this.f205742d == c3842a.f205742d;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f205742d) + r1.q2.d(this.f205741c, r1.q2.d(this.f205740b, Integer.hashCode(this.f205739a) * 31, 31), 31);
            }

            public final String toString() {
                return androidx.core.view.j.e(this.f205741c, this.f205742d, ", nextCardEstimatedSize=", ")", e5.j(this.f205739a, this.f205740b, "HardCodedCardConfig(cardNameRes=", ", cardImageRes=", ", firstCardEstimatedSize="));
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static final Logger a(a aVar) {
            aVar.getClass();
            return (Logger) q.f205735c.getValue();
        }

        private a() {
        }
    }
}
