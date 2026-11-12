package ta0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lta0/f1;", "Landroidx/lifecycle/u1;", "", "Lzb0/l;", "", "Ll90/b;", "deviceCategories", "deviceFamily", "<init>", "(Ljava/util/Map;Lzb0/l;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f1 extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<zb0.l, List<l90.b>> f163314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zb0.l f163315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f163316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b2 f163317d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(((l90.b) t7).f111521f, ((l90.b) t14).f111521f);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(((l90.b) t7).f111521f, ((l90.b) t14).f111521f);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements r53.i<va0.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f163318a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f1 f163319b;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f163320a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f1 f163321b;

            /* JADX INFO: renamed from: ta0.f1$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.discovery.DeviceSelectionViewModel$special$$inlined$map$1$2", f = "DeviceSelectionViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C3077a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f163322a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f163323b;

                public C3077a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f163322a = obj;
                    this.f163323b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar, f1 f1Var) {
                this.f163320a = jVar;
                this.f163321b = f1Var;
            }

            /* JADX WARN: Code duplicated, block: B:33:0x00b5  */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v11, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r2v4, types: [p13.j0] */
            /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r2v7 */
            /* JADX WARN: Type inference failed for: r2v9, types: [p13.j0] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List] */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C3077a c3077a;
                ?? arrayList;
                List listN0;
                if (dVar instanceof C3077a) {
                    c3077a = (C3077a) dVar;
                    int i14 = c3077a.f163323b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c3077a.f163323b = i14 - Integer.MIN_VALUE;
                    } else {
                        c3077a = new C3077a(dVar);
                    }
                } else {
                    c3077a = new C3077a(dVar);
                }
                Object obj2 = c3077a.f163322a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c3077a.f163323b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    String str = (String) obj;
                    boolean zJ = d53.w.J(str);
                    f1 f1Var = this.f163321b;
                    if (zJ) {
                        zb0.l lVar = f1Var.f163315b;
                        Map<zb0.l, List<l90.b>> map = f1Var.f163314a;
                        if (lVar != null) {
                            List<l90.b> list = map.get(lVar);
                            if (list == null || (listN0 = p13.h0.N0(list, new b())) == null) {
                                arrayList = p13.j0.f134944a;
                            } else {
                                arrayList = new ArrayList(p13.y.r(listN0, 10));
                                Iterator<T> it = listN0.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(new va0.c.a((l90.b) it.next()));
                                }
                            }
                        } else {
                            Set<zb0.l> setKeySet = map.keySet();
                            arrayList = new ArrayList(p13.y.r(setKeySet, 10));
                            Iterator<T> it3 = setKeySet.iterator();
                            while (it3.hasNext()) {
                                arrayList.add(new va0.c.b((zb0.l) it3.next()));
                            }
                        }
                    } else {
                        List<l90.b> list2 = f1Var.f163314a.get(zb0.l.ALL);
                        if (list2 != null) {
                            ArrayList arrayList2 = new ArrayList();
                            for (T t7 : list2) {
                                l90.b bVar = (l90.b) t7;
                                if (d53.w.z(bVar.f111521f, str, true) || d53.w.z(d53.u.v(d53.u.w(bVar.f111521f, (char) 237, 'i'), "ē", JWKParameterNames.RSA_EXPONENT, false), str, true)) {
                                    arrayList2.add(t7);
                                }
                            }
                            List listN1 = p13.h0.N0(arrayList2, new a());
                            if (listN1 != null) {
                                arrayList = new ArrayList(p13.y.r(listN1, 10));
                                Iterator<T> it4 = listN1.iterator();
                                while (it4.hasNext()) {
                                    arrayList.add(new va0.c.a((l90.b) it4.next()));
                                }
                            } else {
                                arrayList = p13.j0.f134944a;
                            }
                        } else {
                            arrayList = p13.j0.f134944a;
                        }
                    }
                    va0.d dVar2 = new va0.d(str, false, arrayList, 2, null);
                    c3077a.f163323b = 1;
                    if (this.f163320a.emit(dVar2, c3077a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public c(r53.i iVar, f1 f1Var) {
            this.f163318a = iVar;
            this.f163319b = f1Var;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super va0.d> jVar, t13.d dVar) {
            Object objCollect = this.f163318a.collect(new a(jVar, this.f163319b), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f1(Map<zb0.l, ? extends List<l90.b>> map, zb0.l lVar) {
        map.getClass();
        this.f163314a = map;
        this.f163315b = lVar;
        p2 p2VarA = q2.a("");
        this.f163316c = p2VarA;
        this.f163317d = r53.s.K(new c(p2VarA, this), v1.a(this), k2.a.a(k2.f150703a, 2), new va0.d(null, false, null, 7, null));
    }

    public final void x4(String str) {
        p2 p2Var;
        Object value;
        str.getClass();
        do {
            p2Var = this.f163316c;
            value = p2Var.getValue();
        } while (!p2Var.b(value, str));
    }
}
