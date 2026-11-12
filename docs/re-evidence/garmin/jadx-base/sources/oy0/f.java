package oy0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b21.v4;
import b82.k0;
import c2.j;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import c22.x0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import cy0.l;
import e23.p;
import e23.q;
import h4.k;
import h5.e0;
import i3.ba;
import i3.c3;
import i3.e9;
import i3.eh;
import i3.fe;
import i3.i7;
import i3.mc;
import i3.mh;
import i3.sg;
import i3.yd;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.t1;
import l72.c1;
import o13.r;
import o4.d0;
import o4.m1;
import o53.b0;
import o72.h3;
import o72.i3;
import okhttp3.internal.Util;
import org.koin.java.KoinJavaComponent;
import ov1.o;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p006l2.a2;
import p006l2.z1;
import p3.b4;
import p3.c2;
import p3.i2;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import u1.w;
import v62.n1;
import x5.f0;
import x5.v;
import z2.t2;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.timeline.MultiDayActivitiesEditNotesBottomSheetKt$MultiDayActivitiesEditNotesBottomSheet$1$1", f = "MultiDayActivitiesEditNotesBottomSheet.kt", l = {116}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f134392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fe f134393b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f134394c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f134395d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fe feVar, Context context, p1<Boolean> p1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f134393b = feVar;
            this.f134394c = context;
            this.f134395d = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f134393b, this.f134394c, this.f134395d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f134392a;
            p1<Boolean> p1Var = this.f134395d;
            if (i14 == 0) {
                r.b(obj);
                if (p1Var.getF182175a().booleanValue()) {
                    x0.f23314a.getClass();
                    String strD = dh.b.D(this.f134394c, x0.J9);
                    yd ydVar = yd.Short;
                    this.f134392a = 1;
                    if (fe.b(this.f134393b, strD, null, ydVar, this, 6) == aVar) {
                        return aVar;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            p1Var.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.timeline.MultiDayActivitiesEditNotesBottomSheetKt$MultiDayActivitiesEditNotesBottomSheet$2$1$1$1$1", f = "MultiDayActivitiesEditNotesBottomSheet.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q<Map<String, l>, Set<? extends ActivityListItemDTO>, Set<? extends ActivityListItemDTO>, Unit> f134396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Map<String, l> f134397b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Set<ActivityListItemDTO> f134398c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Set<ActivityListItemDTO> f134399d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(q<? super Map<String, l>, ? super Set<? extends ActivityListItemDTO>, ? super Set<? extends ActivityListItemDTO>, Unit> qVar, Map<String, l> map, Set<ActivityListItemDTO> set, Set<ActivityListItemDTO> set2, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f134396a = qVar;
            this.f134397b = map;
            this.f134398c = set;
            this.f134399d = set2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f134396a, this.f134397b, this.f134398c, this.f134399d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.f134396a.invoke(Util.toImmutableMap(this.f134397b), i53.a.h(this.f134398c), i53.a.h(this.f134399d));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.timeline.MultiDayActivitiesEditNotesBottomSheetKt$MultiDayActivitiesEditNotesBottomSheet$3$1$1", f = "MultiDayActivitiesEditNotesBottomSheet.kt", l = {132}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f134400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f134401b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f134402c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f134403d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f134404e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(mc mcVar, e23.a<Unit> aVar, p1<Boolean> p1Var, p1<Boolean> p1Var2, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f134401b = mcVar;
            this.f134402c = aVar;
            this.f134403d = p1Var;
            this.f134404e = p1Var2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f134401b, this.f134402c, this.f134403d, this.f134404e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f134400a;
            if (i14 == 0) {
                r.b(obj);
                if (this.f134403d.getF182175a().booleanValue()) {
                    this.f134404e.setValue(Boolean.TRUE);
                } else {
                    this.f134400a = 1;
                    if (this.f134401b.d(this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            this.f134402c.invoke();
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.timeline.MultiDayActivitiesEditNotesBottomSheetKt$MultiDayActivitiesEditNotesBottomSheet$5$1$1", f = "MultiDayActivitiesEditNotesBottomSheet.kt", l = {263}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f134405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f134406b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f134407c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(mc mcVar, e23.a<Unit> aVar, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f134406b = mcVar;
            this.f134407c = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f134406b, this.f134407c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f134405a;
            if (i14 == 0) {
                r.b(obj);
                this.f134405a = 1;
                if (this.f134406b.d(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            this.f134407c.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r10v4, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r39v0, types: [fy0.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v26 */
    public static final void a(String str, String str2, List<sy0.q> list, fy0.e eVar, e23.l<? super String, Unit> lVar, p<? super sy0.q, ? super Boolean, Unit> pVar, m mVar, int i14) {
        ?? r14;
        Object obj;
        ?? r15;
        Object obj2;
        Object objN;
        Object obj3;
        Object obj4;
        Object obj5;
        o0 o0VarE = mVar.E(1722972101);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.r(list) ? 256 : 128) | (o0VarE.B(eVar) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192) | (o0VarE.r(pVar) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                obj = objQ;
                c2 c2VarN = p0.n(str2);
                o0VarE.K(c2VarN);
                obj = c2VarN;
            }
            obj = objQ;
            p1 p1Var = (p1) obj;
            h4.r.a aVar = h4.r.S;
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = k.c(aVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            h4.r rVarF = x2.f(aVar, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar2 = j92.b.f97899b;
            h4.r rVarA = c2.l.A(rVarF, eVar2.f97920e, 0.0f, 2);
            bVar2.getClass();
            float f14 = eVar2.f97920e;
            bVar2.getClass();
            h4.r rVarC2 = c2.l.C(rVarA, 0.0f, f14, 0.0f, eVar2.f97918c, 5);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            s5.x0 x0Var = j92.f.f97932i;
            mh.c(str, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, o0VarE), o0VarE, i15 & 14, 0, 131068);
            String str3 = (String) p1Var.getF182175a();
            fVar.getClass();
            s5.x0 x0VarF = d92.c.f(x0Var, o0VarE);
            x0.f23314a.getClass();
            String strW = gl1.d.W(x0.M9);
            boolean z14 = (57344 & i15) == 16384;
            Object objQ2 = o0VarE.q();
            if (z14 || objQ2 == c2565a) {
                r15 = 0;
                oy0.c cVar = new oy0.c(lVar, p1Var, 0);
                o0VarE.K(cVar);
                obj2 = cVar;
            } else {
                r15 = 0;
                obj2 = objQ2;
            }
            c(str3, x0VarF, strW, 0L, 0, (e23.l) obj2, o0VarE, 3120);
            ?? r16 = o0VarE;
            r16.C(-1920197493);
            for (sy0.q qVar : list) {
                ActivityListItemDTO activityListItemDTO = qVar.f161276a;
                ActivityListItemDTO activityListItemDTO2 = qVar.f161276a;
                boolean zL = r16.l(activityListItemDTO.f29250b);
                Object objQ3 = r16.q();
                if (zL || objQ3 == m.a.f135155b) {
                    objN = objQ3;
                    objN = hb.a.n(qVar.f161277b, r16);
                }
                objN = objQ3;
                p1 p1Var2 = (p1) objN;
                boolean zL2 = r16.l(activityListItemDTO2.f29250b);
                Object objQ4 = r16.q();
                if (zL2 || objQ4 == m.a.f135155b) {
                    obj3 = objQ4;
                    c2 c2VarN2 = p0.n(Boolean.FALSE);
                    r16.K(c2VarN2);
                    obj3 = c2VarN2;
                }
                obj3 = objQ4;
                p1 p1Var3 = (p1) obj3;
                boolean zBooleanValue = ((Boolean) p1Var2.getF182175a()).booleanValue();
                int i16 = 458752 & i15;
                boolean z15 = ((((r16.B(p1Var3) ? 1 : 0) | (i16 == 131072 ? 1 : r15)) | (r16.B(qVar) ? 1 : 0)) == true ? 1 : 0) | (r16.B(p1Var2) ? 1 : 0);
                Object objQ5 = r16.q();
                if (z15 != 0 || objQ5 == m.a.f135155b) {
                    obj4 = objQ5;
                    mt0.e0 e0Var = new mt0.e0(pVar, qVar, p1Var3, p1Var2, 13);
                    p1Var3 = p1Var3;
                    p1Var2 = p1Var2;
                    r16.K(e0Var);
                    obj4 = e0Var;
                }
                obj4 = objQ5;
                eVar.a(activityListItemDTO2, zBooleanValue, (e23.l) obj4, r16, i15 & 7168);
                if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                    r16.C(-1547701596);
                    boolean z16 = ((((i16 == 131072 ? 1 : r15) | (r16.B(qVar) ? 1 : 0)) | (r16.B(p1Var2) ? 1 : 0)) == true ? 1 : 0) | (r16.B(p1Var3) ? 1 : 0);
                    Object objQ6 = r16.q();
                    if (z16 != 0 || objQ6 == m.a.f135155b) {
                        ok0.d dVar = new ok0.d(pVar, qVar, p1Var2, p1Var3, 3);
                        r16.K(dVar);
                        objQ6 = dVar;
                    }
                    e23.a aVar3 = (e23.a) objQ6;
                    boolean zB = r16.B(p1Var3);
                    Object objQ7 = r16.q();
                    if (zB || objQ7 == m.a.f135155b) {
                        obj5 = objQ7;
                        om0.h hVar = new om0.h(p1Var3, 6);
                        r16.K(hVar);
                        obj5 = hVar;
                    }
                    obj5 = objQ7;
                    f(aVar3, (e23.a) obj5, r16, r15);
                    r16.g0(r15);
                } else {
                    r16.C(-1547301820);
                    r16.g0(r15);
                }
            }
            r16.g0(r15);
            r16.g0(true);
            x1 x1Var2 = n.f135158a;
            r14 = r16;
        } else {
            o0VarE.e();
            r14 = o0VarE;
        }
        p2 p2VarI0 = r14.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new oy0.b(str, str2, list, eVar, lVar, pVar, i14, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0056  */
    public static final void b(e23.a<Unit> aVar, e23.a<Unit> aVar2, m mVar, int i14) {
        o0 o0Var;
        int i15;
        o0 o0VarE = mVar.E(117141488);
        int i16 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            c1 c1Var = c1.f110940a;
            String strQ = gl1.y.Q(o0VarE, R.string.save_strategy_details_confirmation_title);
            String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_yes);
            boolean z14 = (i16 & 14) == 4;
            Object objQ = o0VarE.q();
            m.a aVar3 = m.f135153a;
            if (z14) {
                objQ = new o(aVar, 4);
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new o(aVar, 4);
                    o0VarE.K(objQ);
                }
            }
            e23.a<Unit> aVar4 = (e23.a) objQ;
            String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_cancel);
            Object objQ2 = o0VarE.q();
            aVar3.getClass();
            if (objQ2 == m.a.f135155b) {
                objQ2 = new o(aVar2, 5);
                o0VarE.K(objQ2);
            }
            o0Var = o0VarE;
            i15 = 2;
            c1Var.a(false, strQ, null, null, null, strQ2, false, false, aVar4, strQ3, (e23.a) objQ2, o0Var, 0, 0, 221);
        } else {
            o0Var = o0VarE;
            i15 = 2;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new nw0.l(aVar, aVar2, i14, i15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(String str, s5.x0 x0Var, String str2, long j8, int i14, e23.l lVar, m mVar, int i15) {
        long j14;
        int i16;
        int i17;
        int i18;
        long j15;
        long j16;
        p1 p1Var;
        p1 p1Var2;
        o0 o0VarE = mVar.E(1619249464);
        p3.c<?> cVar = o0VarE.f135177b;
        int i19 = i15 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(x0Var) ? 256 : 128) | (o0VarE.B(str2) ? 16384 : 8192) | 13303808 | (o0VarE.r(lVar) ? 67108864 : 33554432);
        if (o0VarE.n(i19 & 1, (38347923 & i19) != 38347922)) {
            o0VarE.G0();
            if ((i15 & 1) == 0 || o0VarE.o0()) {
                long jC = am.j.c(d92.b.f58623a, o0VarE);
                i17 = i19 & (-3670017);
                x5.p.f188918b.getClass();
                i18 = x5.p.f188926j;
                j15 = jC;
            } else {
                o0VarE.e();
                i17 = i19 & (-3670017);
                j15 = j8;
                i18 = i14;
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var3 = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = kg.f.j(o0VarE);
            }
            m4.b0 b0Var = (m4.b0) objQ2;
            m4.q qVar = (m4.q) o0VarE.A(t1.f91491i);
            Boolean bool = Boolean.FALSE;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new e(false, b0Var, null);
                o0VarE.K(objQ3);
            }
            l0.e((p) objQ3, bool, o0VarE);
            h4.r.a aVar = h4.r.S;
            h4.r rVarF = x2.f(aVar, 1.0f);
            if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                o0VarE.C(1320597344);
                d92.b.f58623a.getClass();
                long jE = d92.b.a(o0VarE).c().e();
                o0VarE.g0(false);
                j16 = jE;
            } else {
                o0VarE.C(1320597803);
                o0VarE.g0(false);
                j16 = j15;
            }
            h4.r rVarE = u1.n.e(rVarF, j16, m1.f128891a);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            int i24 = i17;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var2 = c2.b0.f22601a;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f14 = eVar2.f97920e;
            bVar2.getClass();
            h4.r rVarC2 = c2.l.C(aVar, f14, eVar2.f97920e, 0.0f, 0.0f, 12);
            h4.r.a aVar3 = aVar;
            String strQ = gl1.y.Q(o0VarE, R.string.workout_step_notes);
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            int i25 = i18;
            mh.c(strQ, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 131068);
            h4.r rVarF2 = x2.f(aVar3, 1.0f);
            s2 s2VarA = q2.a(j.f22692b, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC3 = k.c(rVarF2, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC3, o0VarE);
            h4.r rVarA = u2.f22900a.a(aVar3, 1.0f, true);
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                p1Var = p1Var3;
                objQ4 = new i3(p1Var, 10);
                o0VarE.K(objQ4);
            } else {
                p1Var = p1Var3;
            }
            h4.r rVarA2 = m4.e.a(m4.e.c(rVarA, (e23.l) objQ4), b0Var);
            ((Boolean) p1Var.getF182175a()).getClass();
            v.f188954b.getClass();
            a2 a2Var = new a2(0, (Boolean) null, v.f188955c, i25, (f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
            boolean zR = o0VarE.r(qVar);
            Object objQ5 = o0VarE.q();
            if (zR || objQ5 == c2565a) {
                objQ5 = new k0(qVar, 11);
                o0VarE.K(objQ5);
            }
            z1 z1Var = new z1((e23.l) objQ5, null, null, null, null, null, 62, null);
            ba baVar = ba.f87580a;
            d0.f128823b.getClass();
            long j17 = d0.f128831j;
            long jE2 = hb.a.e(o0VarE);
            t2 t2Var = new t2(hb.a.e(o0VarE), hb.a.e(o0VarE), null);
            baVar.getClass();
            p1 p1Var4 = p1Var;
            sg sgVarC = ba.c(0L, 0L, 0L, 0L, 0L, jE2, t2Var, j17, j17, 0L, 0L, j17, j17, 0L, 0L, 0L, 0L, o0VarE, 2147377919);
            int i26 = i24 & 234881024;
            boolean z14 = i26 == 67108864;
            Object objQ6 = o0VarE.q();
            if (z14 || objQ6 == c2565a) {
                objQ6 = new na0.l(lVar, 20);
                o0VarE.K(objQ6);
            }
            eh.a(str, (e23.l) objQ6, rVarA2, false, x0Var, z3.f.c(-2075960371, new h3(str2, 3), o0VarE), null, null, null, a2Var, z1Var, false, 0, 0, null, null, sgVarC, o0VarE, (i24 & 14) | 12582912, 0, 4095832);
            o0VarE = o0VarE;
            if (((Boolean) p1Var4.getF182175a()).booleanValue()) {
                o0VarE.C(451206485);
                s62.a.f157643a.getClass();
                u4.d dVarA = n1.a(t62.b.f162798a);
                bVar2.getClass();
                float f15 = eVar2.f97920e;
                bVar2.getClass();
                float f16 = eVar2.f97920e;
                bVar2.getClass();
                h4.r rVarC4 = c2.l.C(aVar3, 0.0f, f15, f16, eVar2.f97920e, 1);
                bVar2.getClass();
                h4.r rVarQ = x2.q(rVarC4, j92.b.f97901d.f97904c);
                boolean z15 = i26 == 67108864;
                Object objQ7 = o0VarE.q();
                if (z15 || objQ7 == c2565a) {
                    p1Var2 = p1Var4;
                    objQ7 = new ky0.m(lVar, b0Var, p1Var2, 1);
                    o0VarE.K(objQ7);
                } else {
                    p1Var2 = p1Var4;
                }
                aVar3 = aVar3;
                i7.b(dVarA, gl1.y.Q(o0VarE, R.string.lbl_edit), w.d(rVarQ, false, null, null, (e23.a) objQ7, 15), sn.a.y(o0VarE), o0VarE, 0, 0);
                o0VarE.g0(false);
            } else {
                p1Var2 = p1Var4;
                o0VarE.C(451922864);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            o0VarE.g0(true);
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                o0VarE.C(-2008424504);
                String strP = gl1.y.P(R.string.string_slash_string_pattern, new Object[]{Integer.valueOf(str.length()), 2000}, o0VarE);
                d6.h.f57752b.getClass();
                int i27 = d6.h.f57758h;
                fVar2.getClass();
                s5.x0 x0VarF = d92.c.f(j92.f.f97932i, o0VarE);
                h4.r rVarF3 = x2.f(aVar3, 1.0f);
                bVar2.getClass();
                float f17 = eVar2.f97920e;
                bVar2.getClass();
                float f18 = eVar2.f97917b;
                bVar2.getClass();
                mh.c(strP, c2.l.C(rVarF3, 0.0f, f18, f17, eVar2.f97920e, 1), 0L, null, 0L, null, 0L, d6.h.a(i27), 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 130044);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(-2007992054);
                o0VarE.g0(false);
            }
            j14 = j15;
            i16 = i25;
        } else {
            o0VarE.e();
            j14 = j8;
            i16 = i14;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c3(str, x0Var, str2, j14, i16, lVar, i15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void d(sy0.i iVar, sy0.i iVar2, sy0.i iVar3, i53.c<sy0.p> cVar, e23.a<Unit> aVar, q<? super Map<String, l>, ? super Set<? extends ActivityListItemDTO>, ? super Set<? extends ActivityListItemDTO>, Unit> qVar, m mVar, int i14) {
        e23.a<Unit> aVar2;
        Object v4Var;
        String str;
        b0 b0Var;
        mc mcVar;
        cVar.getClass();
        aVar.getClass();
        qVar.getClass();
        o0 o0VarE = mVar.E(-563441723);
        int i15 = i14 | (o0VarE.B(iVar) ? 4 : 2) | (o0VarE.B(iVar2) ? 32 : 16) | (o0VarE.B(iVar3) ? 256 : 128) | (o0VarE.B(cVar) ? 2048 : 1024) | (o0VarE.r(qVar) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            b0 b0Var2 = (b0) objQ;
            mc mcVarF = e9.f(true, null, o0VarE, 6, 2);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new LinkedHashMap();
                o0VarE.K(objQ2);
            }
            Map map = (Map) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new LinkedHashSet();
                o0VarE.K(objQ3);
            }
            Set set = (Set) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = new LinkedHashSet();
                o0VarE.K(objQ4);
            }
            Set set2 = (Set) objQ4;
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ5);
            }
            p1 p1Var = (p1) objQ5;
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a) {
                objQ6 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ6);
            }
            p1 p1Var2 = (p1) objQ6;
            fy0.e eVar = (fy0.e) KoinJavaComponent.get$default(fy0.e.class, null, null, 6, null);
            Object objQ7 = o0VarE.q();
            if (objQ7 == c2565a) {
                objQ7 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ7);
            }
            p1 p1Var3 = (p1) objQ7;
            Object objQ8 = o0VarE.q();
            if (objQ8 == c2565a) {
                objQ8 = com.nimbusds.jose.shaded.gson.internal.a.f(o0VarE);
            }
            fe feVar = (fe) objQ8;
            Boolean bool = (Boolean) p1Var3.getF182175a();
            bool.getClass();
            boolean zR = o0VarE.r(context);
            Object objQ9 = o0VarE.q();
            if (zR || objQ9 == c2565a) {
                objQ9 = new a(feVar, context, p1Var3, null);
                o0VarE.K(objQ9);
            }
            l0.e((p) objQ9, bool, o0VarE);
            l72.w wVar = l72.w.f111301a;
            String strQ = gl1.y.Q(o0VarE, R.string.edit_notes);
            p1 p1Var4 = p1Var;
            z3.e eVarC = z3.f.c(557461756, new oy0.b(p1Var4, b0Var2, qVar, map, set, set2, 0), o0VarE);
            boolean zR2 = o0VarE.r(b0Var2) | o0VarE.B(mcVarF);
            Object objQ10 = o0VarE.q();
            if (zR2 || objQ10 == c2565a) {
                v4Var = new v4(b0Var2, mcVarF, aVar, p1Var4, p1Var2, 29);
                str = strQ;
                b0Var = b0Var2;
                mcVar = mcVarF;
                p1Var4 = p1Var4;
                o0VarE.K(v4Var);
            } else {
                mcVar = mcVarF;
                str = strQ;
                v4Var = objQ10;
                b0Var = b0Var2;
            }
            wVar.d(str, eVarC, (e23.a) v4Var, mcVar, null, null, z3.f.c(1464007303, new oy0.d(feVar, iVar, iVar2, iVar3, context, cVar, map, eVar, set, set2, p1Var4, p1Var3), o0VarE), o0VarE, 1572912, 48);
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                o0VarE.C(-751497743);
                boolean zR3 = o0VarE.r(b0Var) | o0VarE.B(mcVar);
                Object objQ11 = o0VarE.q();
                if (zR3 || objQ11 == c2565a) {
                    aVar2 = aVar;
                    objQ11 = new eu.b(b0Var, mcVar, aVar2, 5);
                    o0VarE.K(objQ11);
                } else {
                    aVar2 = aVar;
                }
                e23.a aVar3 = (e23.a) objQ11;
                Object objQ12 = o0VarE.q();
                if (objQ12 == c2565a) {
                    objQ12 = new om0.h(p1Var2, 7);
                    o0VarE.K(objQ12);
                }
                b(aVar3, (e23.a) objQ12, o0VarE, 48);
                o0VarE.g0(false);
            } else {
                aVar2 = aVar;
                o0VarE.C(-751178691);
                o0VarE.g0(false);
            }
        } else {
            aVar2 = aVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new oy0.b(iVar, iVar2, iVar3, (i53.c) cVar, (e23.a) aVar2, (q) qVar, i14);
        }
    }

    public static final void e(Map<String, l> map, Set<ActivityListItemDTO> set, Set<ActivityListItemDTO> set2, p1<Boolean> p1Var) {
        p1Var.setValue(Boolean.valueOf((map.isEmpty() && set.isEmpty() && set2.isEmpty()) ? false : true));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:33:0x008d  */
    public static final void f(e23.a<Unit> aVar, e23.a<Unit> aVar2, m mVar, int i14) {
        o0 o0Var;
        int i15;
        o0 o0VarE = mVar.E(-5774496);
        int i16 = (o0VarE.r(aVar) ? 4 : 2) | i14 | (o0VarE.r(aVar2) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            c1 c1Var = c1.f110940a;
            x0.f23314a.getClass();
            String strW = gl1.d.W(x0.Qa);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_remove);
            boolean z14 = (i16 & 14) == 4;
            Object objQ = o0VarE.q();
            m.a aVar3 = m.f135153a;
            if (z14) {
                objQ = new o(aVar, 2);
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new o(aVar, 2);
                    o0VarE.K(objQ);
                }
            }
            e23.a<Unit> aVar4 = (e23.a) objQ;
            String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_cancel);
            boolean z15 = (i16 & 112) == 32;
            Object objQ2 = o0VarE.q();
            if (z15) {
                objQ2 = new o(aVar2, 3);
                o0VarE.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new o(aVar2, 3);
                    o0VarE.K(objQ2);
                }
            }
            o0Var = o0VarE;
            i15 = 3;
            c1Var.a(false, strW, null, null, null, strQ, false, false, aVar4, strQ2, (e23.a) objQ2, o0Var, 0, 0, 221);
        } else {
            o0Var = o0VarE;
            i15 = 3;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new nw0.l(aVar, aVar2, i14, i15);
        }
    }
}
