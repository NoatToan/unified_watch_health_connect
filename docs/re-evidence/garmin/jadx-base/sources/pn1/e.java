package pn1;

import android.content.Context;
import android.text.format.DateFormat;
import android.widget.Toast;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b82.v1;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import f12.l;
import g22.k;
import gl1.y;
import h5.e0;
import i3.e5;
import i3.e9;
import i3.mc;
import i3.mh;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import km1.c0;
import km1.v;
import l72.c1;
import l72.l2;
import o13.r;
import o53.b0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.a1;
import p13.h0;
import p13.j0;
import p13.x;
import p3.b4;
import p3.c2;
import p3.i2;
import p3.l0;
import p3.m;
import p3.n;
import p3.n1;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import pf0.j;
import sm1.a0;
import sm1.s;
import u1.a2;
import u1.d2;
import v13.i;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.naps.NapsDetailsScreenKt$NapsDetailsScreen$1$1$2$1$1$1", f = "NapsDetailsScreen.kt", l = {96}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f138675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f138676b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mc mcVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f138676b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f138676b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f138675a;
            if (i14 == 0) {
                r.b(obj);
                this.f138675a = 1;
                if (this.f138676b.b(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.naps.NapsDetailsScreenKt$NapsDetailsScreen$1$1$3$1$1$1$1", f = "NapsDetailsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f138677a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f138678b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f138679c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p1<List<km1.b>> f138680d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z14, int i14, Context context, p1<List<km1.b>> p1Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f138677a = z14;
            this.f138678b = i14;
            this.f138679c = context;
            this.f138680d = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f138677a, this.f138678b, this.f138679c, this.f138680d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            if (this.f138677a) {
                sn.a.o(l.f68084a, true);
                p1<List<km1.b>> p1Var = this.f138680d;
                List f182175a = p1Var.getF182175a();
                int i14 = this.f138678b;
                if (i14 >= 0 && i14 < f182175a.size()) {
                    ArrayList arrayList = new ArrayList(f182175a);
                    arrayList.remove(i14);
                    f182175a = arrayList;
                }
                p1Var.setValue((List<km1.b>) f182175a);
            } else {
                Toast.makeText(this.f138679c, R.string.txt_error_occurred, 0).show();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.naps.NapsDetailsScreenKt$NapsDetailsScreen$1$2$1$1$1", f = "NapsDetailsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ km1.b f138681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ km1.b f138682b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f138683c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ n1 f138684d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p1<List<km1.b>> f138685e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(km1.b bVar, km1.b bVar2, Context context, n1 n1Var, p1<List<km1.b>> p1Var, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f138681a = bVar;
            this.f138682b = bVar2;
            this.f138683c = context;
            this.f138684d = n1Var;
            this.f138685e = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f138681a, this.f138682b, this.f138683c, this.f138684d, this.f138685e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            if (this.f138681a != null) {
                int intValue = this.f138684d.getIntValue();
                p1<List<km1.b>> p1Var = this.f138685e;
                List f182175a = p1Var.getF182175a();
                if (intValue >= 0 && intValue < f182175a.size()) {
                    ArrayList arrayList = new ArrayList(f182175a);
                    arrayList.set(intValue, this.f138682b);
                    f182175a = arrayList;
                }
                p1Var.setValue((List<km1.b>) f182175a);
            } else {
                Toast.makeText(this.f138683c, R.string.txt_error_occurred, 0).show();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(km1.b.f((km1.b) t7), km1.b.f((km1.b) t14));
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0081  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a0  */
    public static final void a(e23.a<Unit> aVar, e23.a<Unit> aVar2, m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(-2008074543);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14 | (o0VarE.r(aVar2) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            c1 c1Var = c1.f110940a;
            String strQ = y.Q(o0VarE, R.string.lbl_delete_nap);
            String strQ2 = y.Q(o0VarE, R.string.msg_delete_nap);
            String strQ3 = y.Q(o0VarE, R.string.lbl_delete);
            Locale locale = Locale.ROOT;
            String upperCase = strQ3.toUpperCase(locale);
            upperCase.getClass();
            String upperCase2 = y.Q(o0VarE, R.string.lbl_cancel).toUpperCase(locale);
            upperCase2.getClass();
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            m.a aVar3 = m.f135153a;
            if (z14) {
                objQ = new j(aVar, 8);
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new j(aVar, 8);
                    o0VarE.K(objQ);
                }
            }
            e23.a<Unit> aVar4 = (e23.a) objQ;
            boolean z15 = (i15 & 112) == 32;
            Object objQ2 = o0VarE.q();
            if (z15) {
                objQ2 = new j(aVar2, 10);
                o0VarE.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new j(aVar2, 10);
                    o0VarE.K(objQ2);
                }
            }
            o0Var = o0VarE;
            c1Var.a(false, strQ, strQ2, null, null, upperCase, false, false, aVar4, upperCase2, (e23.a) objQ2, o0Var, 6, 0, 216);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new nw0.l(aVar, aVar2, i14, 5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [km1.f] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v36 */
    public static final void b(s sVar, e23.a<Unit> aVar, m mVar, int i14) throws Throwable {
        ?? r14;
        o0 o0Var;
        Object objN0;
        n1 n1Var;
        p1 p1Var;
        p3.c<?> cVar;
        Throwable th3;
        km1.f fVar;
        boolean z14;
        int i15;
        o0 o0Var2;
        v vVar;
        boolean z15;
        ?? r15;
        ?? r16;
        boolean z16;
        o0 o0Var3;
        o0 o0Var4;
        Object obj;
        List<km1.b> listT;
        v vVar2;
        int i16;
        b0 b0Var;
        char c14;
        List<km1.b> listT2;
        s sVar2 = sVar;
        sVar2.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(14652879);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i17 = (o0VarE.r(sVar2) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i17 & 1, (i17 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            p1 p1VarC = s9.c.c(sVar2.f160188h, o0VarE);
            v vVar3 = (v) sVar2.f160190j.getF182175a();
            Throwable th4 = null;
            boolean zG = k.g(vVar3 != null ? vVar3.s() : null, LocalDate.now());
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            f fVar2 = new f(new l22.a(context));
            boolean zIs24HourFormat = DateFormat.is24HourFormat(context);
            km1.f fVar3 = new km1.f(context, ((a0) p1VarC.getF182175a()).f160098n);
            d2 d2VarA = a2.a(o0VarE);
            g6.f.a aVar2 = g6.f.f75994b;
            h4.r rVarB = a2.b(c2.l.C(x2.d(h4.r.S, 1.0f), 0.0f, 24, 0.0f, 0.0f, 13), d2VarA, true);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var2 = c2.b0.f22601a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            Object obj2 = objQ;
            if (objQ == c2565a) {
                b0 b0VarJ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(b0VarJ);
                obj2 = b0VarJ;
            }
            b0 b0Var3 = (b0) obj2;
            char c15 = 6;
            mc mcVarF = e9.f(true, null, o0VarE, 6, 2);
            if (vVar3 == null || (listT2 = vVar3.t()) == null || (objN0 = h0.N0(listT2, new d())) == null) {
                objN0 = j0.f134944a;
            }
            Object objQ2 = o0VarE.q();
            Object obj3 = objQ2;
            if (objQ2 == c2565a) {
                c2 c2VarN = p0.n(objN0);
                o0VarE.K(c2VarN);
                obj3 = c2VarN;
            }
            p1 p1Var2 = (p1) obj3;
            Object objQ3 = o0VarE.q();
            Object objO = objQ3;
            if (objQ3 == c2565a) {
                objO = e5.o(-1, o0VarE);
            }
            n1 n1Var2 = (n1) objO;
            if (((List) p1Var2.getF182175a()).isEmpty()) {
                n1Var = n1Var2;
                p1Var = p1Var2;
                cVar = cVar2;
                th3 = null;
                fVar = fVar3;
                z14 = false;
                i15 = 16;
                o0VarE.C(1333134480);
                o0VarE.g0(false);
                aVar.invoke();
                o0Var2 = o0VarE;
            } else {
                o0VarE.C(1330178351);
                int i18 = 0;
                o0 o0Var5 = o0VarE;
                for (Object obj4 : (List) p1Var2.getF182175a()) {
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        Throwable th5 = th4;
                        x.q();
                        throw th5;
                    }
                    km1.b bVar2 = (km1.b) obj4;
                    Set setB = a1.b(new c92.b.a(c92.a.DELETE, y.Q(o0Var5, R.string.lbl_delete)));
                    boolean zK = o0Var5.k(i18);
                    Object objQ4 = o0Var5.q();
                    if (zK || objQ4 == m.a.f135155b) {
                        c14 = 2;
                        objQ4 = new v1(i18, n1Var2, 2);
                        o0Var5.K(objQ4);
                    } else {
                        c14 = 2;
                    }
                    int i24 = i18;
                    f fVar4 = fVar2;
                    n1 n1Var3 = n1Var2;
                    b0 b0Var4 = b0Var3;
                    s sVar3 = sVar2;
                    sVar2 = sVar3;
                    o0 o0Var6 = o0Var5;
                    b0Var3 = b0Var4;
                    l2.a(setB, b0Var3, zG, null, (e23.a) objQ4, z3.f.c(-1629114263, new cq.i(fVar4, bVar2, zIs24HourFormat, context, zG, i24, b0Var4, mcVarF, n1Var3), o0Var5), z3.f.c(503212330, new a42.m(i24, sVar3, b0Var4, context, p1Var2), o0Var5), o0Var6, 1769472, 8);
                    p1Var2 = p1Var2;
                    o0Var5 = o0Var6;
                    fVar2 = fVar4;
                    n1Var2 = n1Var3;
                    th4 = th4;
                    cVar2 = cVar2;
                    c15 = 6;
                    fVar3 = fVar3;
                    i18 = i19;
                }
                n1Var = n1Var2;
                p1Var = p1Var2;
                cVar = cVar2;
                th3 = th4;
                fVar = fVar3;
                z14 = false;
                i15 = 16;
                o0Var5.g0(false);
                o0Var2 = o0Var5;
            }
            if (!mcVarF.e() || n1Var.getIntValue() == -1) {
                vVar = vVar3;
                o0Var2.C(1334276489);
                o0Var2.g0(z14);
                r15 = fVar;
                z15 = z14;
            } else {
                o0Var2.C(1333342397);
                if (vVar3 != null) {
                    vVar2 = v.b(vVar3, 0L, null, 0, 0L, 0L, (List) p1Var.getF182175a(), -1, 7167);
                    vVar = vVar3;
                } else {
                    vVar = vVar3;
                    vVar2 = new v(0L, 0L, null, 0, 0, false, null, 0L, 0L, 0L, 0L, null, null, null, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 8191, null);
                }
                km1.b bVar3 = (km1.b) ((List) p1Var.getF182175a()).get(n1Var.getIntValue());
                boolean zR = o0Var2.r(sVar2) | o0Var2.r(b0Var3) | o0Var2.r(context);
                Object objQ5 = o0Var2.q();
                if (zR || objQ5 == m.a.f135155b) {
                    b0 b0Var5 = b0Var3;
                    i16 = i15;
                    jv0.c cVar3 = new jv0.c(sVar2, p1Var, n1Var, b0Var5, context);
                    b0Var = b0Var5;
                    o0Var2.K(cVar3);
                    objQ5 = cVar3;
                } else {
                    b0Var = b0Var3;
                    i16 = i15;
                }
                int i25 = (v.P0 << 3) | 6 | (km1.b.f105434k << 6);
                i15 = i16;
                r15 = fVar;
                b0 b0Var6 = b0Var;
                boolean z17 = z14 ? 1 : 0 ? 1 : 0;
                pn1.b.a(true, vVar2, bVar3, b0Var6, mcVarF, (e23.l) objQ5, o0Var2, i25, 0);
                o0Var2.g0(z17);
                z15 = z17;
            }
            if (vVar == null || (listT = vVar.t()) == null) {
                r16 = th3;
            } else {
                ArrayList arrayList = new ArrayList(p13.y.r(listT, 10));
                Iterator it = listT.iterator();
                while (it.hasNext()) {
                    arrayList.add(((km1.b) it.next()).getNapFeedback());
                }
                r16 = (String) h0.n0(arrayList);
            }
            if (r16 != 0) {
                o0Var2.C(1334619163);
                String strB = r15.b(c0.NAPS, r16);
                if (strB != null) {
                    o0Var2.C(1334759159);
                    h4.r.a aVar4 = h4.r.S;
                    float f14 = i15;
                    c2.l.f(c2.l.C(aVar4, 0.0f, f14, 0.0f, 0.0f, 13), o0Var2);
                    Object objQ6 = o0Var2.q();
                    if (objQ6 == m.a.f135155b) {
                        obj = objQ6;
                        p40.h hVar = new p40.h(21);
                        o0Var2.K(hVar);
                        obj = hVar;
                    }
                    obj = objQ6;
                    h4.r rVarC2 = p5.v.c((e23.l) obj, aVar4, true);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA2 = c2.y.a(kVar2, h4.d.a.f81536n, o0Var2, z15 ? 1 : 0);
                    x1 x1Var2 = n.f135158a;
                    int iHashCode2 = Long.hashCode(o0Var2.U);
                    i2 i2VarA1 = o0Var2.a0();
                    h4.r rVarC3 = h4.k.c(rVarC2, o0Var2);
                    h5.g.V.getClass();
                    e0.a aVar5 = h5.g.a.f81805b;
                    if (cVar == null) {
                        p0.l();
                        throw th3;
                    }
                    o0Var2.z();
                    if (o0Var2.T) {
                        o0Var2.M(aVar5);
                    } else {
                        o0Var2.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, o0Var2);
                    b4.c(h5.g.a.f81809f, i2VarA1, o0Var2);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (o0Var2.T || !p005kotlin.jvm.internal.s.g(o0Var2.q(), Integer.valueOf(iHashCode2))) {
                        v.h.A(iHashCode2, o0Var2, iHashCode2, bVar4);
                    }
                    b4.c(h5.g.a.f81807d, rVarC3, o0Var2);
                    c2.b0 b0Var7 = c2.b0.f22601a;
                    String strQ = y.Q(o0Var2, R.string.lbl_nap_tip);
                    d92.b.f58623a.getClass();
                    j92.f fVar5 = d92.b.f58624b;
                    fVar5.getClass();
                    o0 o0Var7 = o0Var2;
                    z16 = true;
                    mh.c(strQ, c2.l.y(aVar4, f14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), o0Var2), o0Var7, 48, 0, 131068);
                    fVar5.getClass();
                    mh.c(strB, c2.l.C(aVar4, f14, 0.0f, f14, f14, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0Var7), o0Var7, 48, 0, 131068);
                    o0 o0Var8 = o0Var7;
                    o0Var8.g0(true);
                    o0Var8.g0(z15);
                    o0Var4 = o0Var8;
                } else {
                    z16 = true;
                    o0Var2.C(1335391497);
                    o0Var2.g0(z15);
                    o0Var4 = o0Var2;
                }
                o0Var4.g0(z15);
                o0Var3 = o0Var4;
            } else {
                z16 = true;
                o0Var2.C(1335401417);
                o0Var2.g0(z15);
                o0Var3 = o0Var2;
            }
            o0Var3.g0(z16);
            x1 x1Var3 = n.f135158a;
            r14 = z15;
            o0Var = o0Var3;
        } else {
            r14 = 0;
            o0VarE.e();
            o0Var = o0VarE;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new pn1.d(sVar2, aVar, i14, r14);
        }
    }
}
