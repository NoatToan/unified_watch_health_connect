package fr2;

import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import e23.p;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o13.r;
import o53.b0;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.k0;
import ps2.n;
import ps2.w;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00182\u00020\u00012\u00020\u0002:\u0001\u0019B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u0005H\u0082@¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\u0004R2\u0010\u0012\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\r0\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R(\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011¨\u0006\u001a"}, d2 = {"Lfr2/e;", "Lfr2/f;", "Lfr2/d;", "<init>", "()V", "Lbr2/f;", "Lns2/a;", "Lms2/e;", "G4", "(Lbr2/f;Lt13/d;)Ljava/lang/Object;", "", "h", "Landroidx/lifecycle/y0;", "", "", "Landroidx/lifecycle/y0;", "H4", "()Landroidx/lifecycle/y0;", "operatorsByDevice", "", "kotlin.jvm.PlatformType", IntegerTokenConverter.CONVERTER_KEY, "I4", "isOperatorListLoadingInProgress", "j", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends f implements d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f73327k = 8;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Logger f73328l;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final y0<Map<Long, ns2.a<ms2.e>>> operatorsByDevice = new y0<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final y0<Boolean> isOperatorListLoadingInProgress = new y0<>(Boolean.FALSE);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.ui.common.viewmodels.UserWalletWatchesViewModel$loadOperators$1", f = "UserWalletWatchesViewModel.kt", l = {33}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public y0 f73331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f73332b;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo53/b0;", "", "", "Lns2/a;", "Lms2/e;", "<anonymous>", "(Lo53/b0;)Ljava/util/Map;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.feature.garminpay.ui.common.viewmodels.UserWalletWatchesViewModel$loadOperators$1$1", f = "UserWalletWatchesViewModel.kt", l = {33}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements p<b0, t13.d<? super Map<Long, ? extends ns2.a<? extends ms2.e>>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public e f73334a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Map f73335b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public Iterator f73336c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public Map f73337d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public Long f73338e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public int f73339f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int f73340g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public int f73341h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public int f73342i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ List<br2.f> f73343j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public final /* synthetic */ e f73344k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<br2.f> list, e eVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f73343j = list;
                this.f73344k = eVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f73343j, this.f73344k, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Map<Long, ? extends ns2.a<? extends ms2.e>>> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:14:0x004f  */
            /* JADX WARN: Code duplicated, block: B:16:0x0074 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:17:0x0075  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0075 -> B:18:0x0076). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // v13.a
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    u13.a r0 = u13.a.COROUTINE_SUSPENDED
                    int r1 = r12.f73342i
                    r2 = 1
                    if (r1 == 0) goto L24
                    if (r1 != r2) goto L1d
                    int r1 = r12.f73341h
                    int r3 = r12.f73340g
                    int r4 = r12.f73339f
                    java.lang.Long r5 = r12.f73338e
                    java.util.Map r6 = r12.f73337d
                    java.util.Iterator r7 = r12.f73336c
                    java.util.Map r8 = r12.f73335b
                    fr2.e r9 = r12.f73334a
                    o13.r.b(r13)
                    goto L76
                L1d:
                    java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                    vb.h.z(r13)
                    r13 = 0
                    return r13
                L24:
                    o13.r.b(r13)
                    r13 = 10
                    java.util.List<br2.f> r1 = r12.f73343j
                    int r13 = p13.y.r(r1, r13)
                    int r13 = p13.t0.a(r13)
                    r3 = 16
                    if (r13 >= r3) goto L38
                    r13 = r3
                L38:
                    java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
                    r3.<init>(r13)
                    java.util.Iterator r1 = r1.iterator()
                    r4 = 0
                    fr2.e r5 = r12.f73344k
                    r7 = r1
                    r6 = r3
                    r1 = r4
                    r9 = r5
                    r3 = r13
                L49:
                    boolean r13 = r7.hasNext()
                    if (r13 == 0) goto L84
                    java.lang.Object r13 = r7.next()
                    br2.f r13 = (br2.f) r13
                    long r10 = r13.f19599a
                    java.lang.Long r5 = new java.lang.Long
                    r5.<init>(r10)
                    r12.f73334a = r9
                    r12.f73335b = r6
                    r12.f73336c = r7
                    r12.f73337d = r6
                    r12.f73338e = r5
                    r12.f73339f = r4
                    r12.f73340g = r3
                    r12.f73341h = r1
                    r12.f73342i = r2
                    java.lang.Object r13 = fr2.e.F4(r9, r13, r12)
                    if (r13 != r0) goto L75
                    return r0
                L75:
                    r8 = r6
                L76:
                    o13.p r10 = new o13.p
                    r10.<init>(r5, r13)
                    A r13 = r10.f128594a
                    B r5 = r10.f128595b
                    r6.put(r13, r5)
                    r6 = r8
                    goto L49
                L84:
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: fr2.e.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return e.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            y0<Map<Long, ns2.a<ms2.e>>> y0VarE;
            Map<Long, ns2.a<ms2.e>> map;
            y0<Map<Long, ns2.a<ms2.e>>> y0Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f73332b;
            e eVar = e.this;
            if (i14 == 0) {
                r.b(obj);
                Boolean boolD = eVar.d1().d();
                Boolean bool = Boolean.TRUE;
                if (s.g(boolD, bool)) {
                    return Unit.INSTANCE;
                }
                eVar.d1().m(bool);
                List<br2.f> listD = eVar.s1().d();
                y0VarE = eVar.E();
                if (listD != null) {
                    x53.c cVar = s0.f129406a;
                    x53.b bVar = x53.b.f189152a;
                    a aVar2 = new a(listD, eVar, null);
                    this.f73331a = y0VarE;
                    this.f73332b = 1;
                    obj = ge1.b.e0(bVar, aVar2, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    y0Var = y0VarE;
                } else {
                    e.f73328l.warn("availableDevice is null, cannot load card selection items");
                    map = k0.f134949a;
                    map.getClass();
                }
                y0VarE.m(map);
                eVar.d1().m(Boolean.FALSE);
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y0Var = this.f73331a;
            r.b(obj);
            map = (Map) obj;
            y0VarE = y0Var;
            y0VarE.m(map);
            eVar.d1().m(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f73328l = gt2.b.f79005a.h("PAY#UserWalletWatchesViewModel");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object G4(br2.f fVar, t13.d<? super ns2.a<? extends ms2.e>> dVar) {
        w wVar = w.f140538a;
        long j8 = fVar.f19599a;
        wVar.getClass();
        n nVarI = w.i(j8);
        if (nVarI != null) {
            return nVarI.i(dVar);
        }
        f73328l.warn("Cannot get DeviceWallet for #" + fVar.f19599a);
        return gg.b.q(false);
    }

    @Override // fr2.d
    /* JADX INFO: renamed from: H4, reason: merged with bridge method [inline-methods] */
    public y0<Map<Long, ns2.a<ms2.e>>> E() {
        return this.operatorsByDevice;
    }

    @Override // fr2.d
    /* JADX INFO: renamed from: I4, reason: merged with bridge method [inline-methods] */
    public y0<Boolean> d1() {
        return this.isOperatorListLoadingInProgress;
    }

    @Override // fr2.d
    public void h() {
        gl.b.I(v1.a(this), null, new b(null), 3);
    }
}
