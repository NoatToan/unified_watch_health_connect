package jl1;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c.w;
import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.messaging.Constants;
import e23.l;
import e23.p;
import gl1.y;
import i3.e5;
import java.util.List;
import l72.c1;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.x;
import p3.l0;
import p3.m;
import p3.n;
import p3.n1;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import r53.p2;
import v62.h7;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.setup.presentation.activities.edit.SelectFavouriteActivitiesScreenKt$SelectFavouriteActivitiesScreen$2$1", f = "SelectFavouriteActivitiesScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<Boolean, Unit> f99489a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ jl1.g f99490b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f99491c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x3<jl1.d> f99492d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f99493e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super Boolean, Unit> lVar, jl1.g gVar, Context context, x3<jl1.d> x3Var, boolean z14, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f99489a = lVar;
            this.f99490b = gVar;
            this.f99491c = context;
            this.f99492d = x3Var;
            this.f99493e = z14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f99489a, this.f99490b, this.f99491c, this.f99492d, this.f99493e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            x3<jl1.d> x3Var = this.f99492d;
            jl1.c cVar = x3Var.getF182175a().f99480c;
            boolean z14 = cVar instanceof jl1.c.d;
            jl1.g gVar = this.f99490b;
            if (z14) {
                jl1.d f182175a = x3Var.getF182175a();
                this.f99489a.invoke(Boolean.valueOf(!s.g(f182175a.f99482e, f182175a.f99481d)));
                gVar.z4();
            } else {
                boolean z15 = cVar instanceof jl1.c.b;
                Context context = this.f99491c;
                if (z15) {
                    Toast.makeText(context, R.string.txt_error_occurred, 0).show();
                    gVar.z4();
                } else if (!(cVar instanceof jl1.c.C1911c)) {
                    if (!(cVar instanceof jl1.c.a)) {
                        u0.r();
                        return null;
                    }
                    new androidx.appcompat.app.e.a(context).setTitle(R.string.txt_error_occurred).setMessage(R.string.title_failed_to_update_favorite_activities).setPositiveButton(R.string.common_retry, new jl1.e(gVar, this.f99493e, cVar)).setNegativeButton(R.string.common_cancel, new com.garmin.android.apps.connectmobile.connectiq.i(0)).setCancelable(false).show();
                    gVar.z4();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ jl1.g f99494a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f99495b;

        public b(jl1.g gVar, int i14) {
            this.f99494a = gVar;
            this.f99495b = i14;
        }

        @Override // e23.a
        public final Boolean invoke() {
            int i14 = this.f99495b;
            this.f99494a.y4(i14, i14 - 1);
            return Boolean.TRUE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ jl1.g f99496a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f99497b;

        public c(jl1.g gVar, int i14) {
            this.f99496a = gVar;
            this.f99497b = i14;
        }

        @Override // e23.a
        public final Boolean invoke() {
            int i14 = this.f99497b;
            this.f99496a.y4(i14, i14 + 1);
            return Boolean.TRUE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements p<m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w02.i f99498a;

        public d(w02.i iVar) {
            this.f99498a = iVar;
        }

        @Override // e23.p
        public final Unit invoke(m mVar, Integer num) {
            m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                x1 x1Var = n.f135158a;
                h4.r rVarD = this.f99498a.d(h4.r.S, true);
                s62.a.f157643a.getClass();
                il1.f.b(0, 0L, rVarD, mVar2, h7.a(t62.b.f162798a));
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f99499a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ jl1.g f99500b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ zf2.d f99501c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f99502d;

        public e(boolean z14, jl1.g gVar, zf2.d dVar, p1<Boolean> p1Var) {
            this.f99499a = z14;
            this.f99500b = gVar;
            this.f99501c = dVar;
            this.f99502d = p1Var;
        }

        @Override // e23.a
        public final Unit invoke() {
            Object value;
            jl1.d dVar;
            i53.c cVarE;
            if (this.f99499a) {
                jl1.g gVar = this.f99500b;
                gVar.getClass();
                zf2.d dVar2 = this.f99501c;
                dVar2.getClass();
                p2 p2Var = gVar.f99524g;
                do {
                    value = p2Var.getValue();
                    dVar = (jl1.d) value;
                    cVarE = i53.a.e(h0.y0(dVar.f99482e, dVar2));
                } while (!p2Var.b(value, jl1.d.a(dVar, false, false, null, null, cVarE, null, jl1.g.x4(dVar.f99483f, cVarE), 47)));
            } else {
                this.f99502d.setValue(Boolean.TRUE);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: jl1.f$f, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo53/b0;", "Le2/n;", Constants.MessagePayloadKeys.FROM, "to", "", "<anonymous>", "(Lo53/b0;Le2/n;Le2/n;)Z"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.setup.presentation.activities.edit.SelectFavouriteActivitiesScreenKt$SelectFavouriteActivitiesScreen$4$reorderableState$1$1", f = "SelectFavouriteActivitiesScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class C1912f extends v13.i implements e23.r<b0, e2.n, e2.n, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ e2.n f99503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ e2.n f99504b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f99505c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i53.c<zf2.d> f99506d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ jl1.g f99507e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C1912f(int i14, i53.c<? extends zf2.d> cVar, jl1.g gVar, t13.d<? super C1912f> dVar) {
            super(4, dVar);
            this.f99505c = i14;
            this.f99506d = cVar;
            this.f99507e = gVar;
        }

        @Override // e23.r
        public final Object invoke(b0 b0Var, e2.n nVar, e2.n nVar2, t13.d<? super Boolean> dVar) {
            i53.c<zf2.d> cVar = this.f99506d;
            jl1.g gVar = this.f99507e;
            C1912f c1912f = new C1912f(this.f99505c, cVar, gVar, dVar);
            c1912f.f99503a = nVar;
            c1912f.f99504b = nVar2;
            return c1912f.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002e  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            boolean z14;
            e2.n nVar = this.f99503a;
            e2.n nVar2 = this.f99504b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            int f62559a = nVar.getF62559a();
            int i14 = this.f99505c;
            int i15 = f62559a - i14;
            int f62559a2 = nVar2.getF62559a() - i14;
            if (i15 >= 0) {
                i53.c<zf2.d> cVar = this.f99506d;
                if (i15 >= cVar.size() || f62559a2 < 0 || f62559a2 >= cVar.size()) {
                    z14 = false;
                } else {
                    this.f99507e.y4(i15, f62559a2);
                    z14 = true;
                }
            } else {
                z14 = false;
            }
            return Boolean.valueOf(z14);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p f99508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f99509b;

        public g(p pVar, List list) {
            this.f99508a = pVar;
            this.f99509b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            int iIntValue = num.intValue();
            return this.f99508a.invoke(Integer.valueOf(iIntValue), this.f99509b.get(iIntValue));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f99510a;

        public h(List list) {
            this.f99510a = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            this.f99510a.get(num.intValue());
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class i implements e23.s<w02.i, Integer, Boolean, m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f99511a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kl1.a f99512b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f99513c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ jl1.g f99514d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ i53.c f99515e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ p1 f99516f;

        public i(List list, kl1.a aVar, boolean z14, jl1.g gVar, i53.c cVar, p1 p1Var) {
            this.f99511a = list;
            this.f99512b = aVar;
            this.f99513c = z14;
            this.f99514d = gVar;
            this.f99515e = cVar;
            this.f99516f = p1Var;
        }

        /* JADX WARN: Code duplicated, block: B:34:0x00ae  */
        /* JADX WARN: Code duplicated, block: B:50:0x00e9  */
        /* JADX WARN: Code duplicated, block: B:68:0x0136  */
        @Override // e23.s
        public final Unit invoke(w02.i iVar, Integer num, Boolean bool, m mVar, Integer num2) {
            int i14;
            e23.a aVar;
            e23.a aVar2;
            z3.e eVar;
            w02.i iVar2 = iVar;
            int iIntValue = num.intValue();
            boolean zBooleanValue = bool.booleanValue();
            m mVar2 = mVar;
            int iIntValue2 = num2.intValue();
            iVar2.getClass();
            if ((iIntValue2 & 6) == 0) {
                i14 = (mVar2.B(iVar2) ? 4 : 2) | iIntValue2;
            } else {
                i14 = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i14 |= mVar2.k(iIntValue) ? 32 : 16;
            }
            if ((iIntValue2 & 384) == 0) {
                i14 |= mVar2.h(zBooleanValue) ? 256 : 128;
            }
            if (mVar2.n(i14 & 1, (i14 & 1171) != 1170)) {
                x1 x1Var = n.f135158a;
                int i15 = ((i14 << 3) & 7168) | (i14 & 126);
                zf2.d dVar = (zf2.d) this.f99511a.get(iIntValue);
                mVar2.C(-1851455372);
                kl1.a aVar3 = this.f99512b;
                String strA = aVar3.a(dVar);
                u4.d dVarC = aVar3.c(dVar);
                boolean z14 = this.f99513c;
                boolean zH = mVar2.h(z14);
                jl1.g gVar = this.f99514d;
                boolean zR = zH | mVar2.r(gVar) | mVar2.k(dVar.ordinal());
                Object objQ = mVar2.q();
                m.a aVar4 = m.f135153a;
                if (zR) {
                    objQ = new e(z14, gVar, dVar, this.f99516f);
                    mVar2.K(objQ);
                } else {
                    aVar4.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new e(z14, gVar, dVar, this.f99516f);
                        mVar2.K(objQ);
                    }
                }
                e23.a aVar5 = (e23.a) objQ;
                if (!z14 || iIntValue <= 0) {
                    mVar2.C(-1850500976);
                    mVar2.f();
                    aVar = null;
                } else {
                    mVar2.C(-1850689208);
                    boolean zR2 = ((((i15 & 112) ^ 48) > 32 && mVar2.k(iIntValue)) || (i15 & 48) == 32) | mVar2.r(gVar);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new b(gVar, iIntValue);
                        mVar2.K(objQ2);
                    } else {
                        aVar4.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new b(gVar, iIntValue);
                            mVar2.K(objQ2);
                        }
                    }
                    aVar = (e23.a) objQ2;
                    mVar2.f();
                }
                if (!z14 || iIntValue >= x.j(this.f99515e)) {
                    mVar2.C(-1850156752);
                    mVar2.f();
                    aVar2 = null;
                } else {
                    mVar2.C(-1850344984);
                    boolean zR3 = mVar2.r(gVar) | ((((i15 & 112) ^ 48) > 32 && mVar2.k(iIntValue)) || (i15 & 48) == 32);
                    Object objQ3 = mVar2.q();
                    if (zR3) {
                        objQ3 = new c(gVar, iIntValue);
                        mVar2.K(objQ3);
                    } else {
                        aVar4.getClass();
                        if (objQ3 == m.a.f135155b) {
                            objQ3 = new c(gVar, iIntValue);
                            mVar2.K(objQ3);
                        }
                    }
                    aVar2 = (e23.a) objQ3;
                    mVar2.f();
                }
                if (z14) {
                    mVar2.C(-1850036441);
                    z3.e eVarC = z3.f.c(593640932, new d(iVar2), mVar2);
                    mVar2.f();
                    eVar = eVarC;
                } else {
                    mVar2.C(-1849878000);
                    mVar2.f();
                    eVar = null;
                }
                il1.e.a(null, strA, dVarC, true, zBooleanValue, aVar5, aVar5, aVar, aVar2, eVar, mVar2, (57344 & (i15 << 3)) | 3072, 1);
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0062  */
    public static final void a(e23.a<Unit> aVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(1031590870);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            c1 c1Var = c1.f110940a;
            String strQ = y.Q(o0VarE, R.string.lbl_favorite_activity_selection_limit_reached);
            String strP = y.P(R.string.msg_you_have_reached_the_limit_of_x_activities, new Object[]{10}, o0VarE);
            String strQ2 = y.Q(o0VarE, R.string.lbl_ok);
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new j22.d(aVar, 9);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new j22.d(aVar, 9);
                    o0VarE.K(objQ);
                }
            }
            c1Var.a(false, strQ, strP, null, null, strQ2, false, false, (e23.a) objQ, null, null, o0VarE, 6, 0, 1752);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new hl1.i(aVar, i14, 12);
        }
    }

    public static final void b(e23.a<Unit> aVar, e23.a<Unit> aVar2, m mVar, int i14) {
        o0 o0VarE = mVar.E(2433130);
        int i15 = i14 | (o0VarE.r(aVar) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            c1.f110940a.a(false, y.Q(o0VarE, R.string.title_exit_without_saving), y.Q(o0VarE, R.string.lbl_exit_without_saving_alert_message), null, null, y.Q(o0VarE, R.string.lbl_exit), false, false, aVar, y.Q(o0VarE, R.string.lbl_cancel), aVar2, o0VarE, ((i15 << 24) & 234881024) | 6, 6, 216);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at1.f(aVar, aVar2, i14, 23);
        }
    }

    public static final void c(e23.a<Unit> aVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(1987022036);
        if (o0VarE.n(i14 & 1, (i14 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            c1 c1Var = c1.f110940a;
            String strQ = y.Q(o0VarE, R.string.lbl_one_activity_required);
            String strQ2 = y.Q(o0VarE, R.string.msg_one_activity_required);
            String strQ3 = y.Q(o0VarE, R.string.device_settings_group_ride_canned_msg_16);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new j22.d(aVar, 8);
                o0VarE.K(objQ);
            }
            c1Var.a(false, strQ, strQ2, null, null, strQ3, false, false, (e23.a) objQ, null, null, o0VarE, 6, 0, 1752);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new hl1.i(aVar, i14, 11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0058  */
    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    /* JADX WARN: Code duplicated, block: B:32:0x0072  */
    /* JADX WARN: Code duplicated, block: B:33:0x0074  */
    /* JADX WARN: Code duplicated, block: B:36:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x007f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0081  */
    /* JADX WARN: Code duplicated, block: B:41:0x009f  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:47:0x00be  */
    /* JADX WARN: Code duplicated, block: B:50:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:51:0x00de  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:59:0x0100  */
    /* JADX WARN: Code duplicated, block: B:62:0x0124  */
    /* JADX WARN: Code duplicated, block: B:63:0x0126  */
    /* JADX WARN: Code duplicated, block: B:66:0x0139  */
    /* JADX WARN: Code duplicated, block: B:67:0x013c  */
    /* JADX WARN: Code duplicated, block: B:73:0x014e  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(jl1.g gVar, kl1.a aVar, boolean z14, l<? super Boolean, Unit> lVar, e23.a<Unit> aVar2, m mVar, int i14, int i15) {
        boolean z15;
        int i16;
        int i17;
        int i18;
        boolean z16;
        o0 o0Var;
        boolean z17;
        p3.p2 p2VarI0;
        boolean z18;
        p1 p1VarC;
        Object objQ;
        m.a.C2565a c2565a;
        Object objQ2;
        p1 p1Var;
        Object objQ3;
        Context context;
        boolean z19;
        boolean z24;
        Object objQ4;
        e23.a aVar3;
        boolean zB;
        Object objQ5;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        Object objQ6;
        p1 p1Var2;
        boolean z29;
        gVar.getClass();
        aVar.getClass();
        lVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(1423093067);
        int i19 = (o0VarE.r(gVar) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        int i24 = i15 & 4;
        if (i24 == 0) {
            if ((i14 & 384) == 0) {
                z15 = z14;
                i19 |= o0VarE.h(z15) ? 256 : 128;
            }
            if (o0VarE.r(lVar)) {
                i16 = 2048;
            } else {
                i16 = 1024;
            }
            int i25 = i19 | i16;
            if (o0VarE.r(aVar2)) {
                i17 = 16384;
            } else {
                i17 = 8192;
            }
            i18 = i25 | i17;
            if ((i18 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i18 & 1, z16)) {
                if (i24 != 0) {
                    z18 = false;
                } else {
                    z18 = z15;
                }
                x1 x1Var = n.f135158a;
                p1VarC = s9.c.c(gVar.f99525h, o0VarE);
                i53.c<zf2.d> cVar = ((jl1.d) p1VarC.getF182175a()).f99482e;
                objQ = o0VarE.q();
                m.f135153a.getClass();
                c2565a = m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = e5.o(0, o0VarE);
                }
                n1 n1Var = (n1) objQ;
                objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = p0.n(Boolean.FALSE);
                    o0VarE.K(objQ2);
                }
                p1Var = (p1) objQ2;
                objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = p0.n(Boolean.FALSE);
                    o0VarE.K(objQ3);
                }
                p1 p1Var3 = (p1) objQ3;
                context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                boolean zB2 = o0VarE.B(p1VarC);
                if ((i18 & 57344) == 16384) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z24 = zB2 | z19;
                objQ4 = o0VarE.q();
                if (z24 || objQ4 == c2565a) {
                    objQ4 = new gv0.o0(aVar2, p1VarC, p1Var, 6);
                    o0VarE.K(objQ4);
                }
                aVar3 = (e23.a) objQ4;
                zB = o0VarE.B(aVar3);
                objQ5 = o0VarE.q();
                if (zB || objQ5 == c2565a) {
                    objQ5 = new j22.d(aVar3, 7);
                    o0VarE.K(objQ5);
                }
                z25 = z18;
                w.a(0, 1, (e23.a) objQ5, o0VarE, false);
                jl1.c cVar2 = ((jl1.d) p1VarC.getF182175a()).f99480c;
                boolean zB3 = o0VarE.B(p1VarC);
                if ((i18 & 7168) == 2048) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                boolean zR = zB3 | z26 | o0VarE.r(gVar) | o0VarE.r(context);
                if ((i18 & 896) == 256) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                z28 = zR | z27;
                objQ6 = o0VarE.q();
                if (!z28 || objQ6 == c2565a) {
                    p1Var2 = p1Var;
                    a aVar4 = new a(lVar, gVar, context, p1VarC, z25, null);
                    z29 = z25;
                    o0VarE.K(aVar4);
                    objQ6 = aVar4;
                } else {
                    z29 = z25;
                    p1Var2 = p1Var;
                }
                l0.e((p) objQ6, cVar2, o0VarE);
                boolean z34 = ((jl1.d) p1VarC.getF182175a()).f99478a;
                z3.e eVarC = z3.f.c(1370036134, new ad0.g(aVar3, z29, gVar, p1VarC, 22), o0VarE);
                z3.e eVarC2 = z3.f.c(-1836881630, new dd1.d(cVar, gVar, aVar, p1VarC, aVar2, p1Var3, n1Var, p1Var2), o0VarE);
                o0Var = o0VarE;
                z02.d.a(z34, eVarC, null, null, null, eVarC2, o0Var, 196656, 28);
                z17 = z29;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                z17 = z15;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a82.a(gVar, aVar, z17, lVar, aVar2, i14, i15, 8);
            }
        }
        i19 |= 384;
        z15 = z14;
        if (o0VarE.r(lVar)) {
            i16 = 2048;
        } else {
            i16 = 1024;
        }
        int i26 = i19 | i16;
        if (o0VarE.r(aVar2)) {
            i17 = 16384;
        } else {
            i17 = 8192;
        }
        i18 = i26 | i17;
        if ((i18 & 9363) != 9362) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i18 & 1, z16)) {
            if (i24 != 0) {
                z18 = false;
            } else {
                z18 = z15;
            }
            x1 x1Var2 = n.f135158a;
            p1VarC = s9.c.c(gVar.f99525h, o0VarE);
            i53.c<zf2.d> cVar3 = ((jl1.d) p1VarC.getF182175a()).f99482e;
            objQ = o0VarE.q();
            m.f135153a.getClass();
            c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = e5.o(0, o0VarE);
            }
            n1 n1Var2 = (n1) objQ;
            objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p1Var = (p1) objQ2;
            objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p1 p1Var4 = (p1) objQ3;
            context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            boolean zB4 = o0VarE.B(p1VarC);
            if ((i18 & 57344) == 16384) {
                z19 = true;
            } else {
                z19 = false;
            }
            z24 = zB4 | z19;
            objQ4 = o0VarE.q();
            if (z24) {
                objQ4 = new gv0.o0(aVar2, p1VarC, p1Var, 6);
                o0VarE.K(objQ4);
            } else {
                objQ4 = new gv0.o0(aVar2, p1VarC, p1Var, 6);
                o0VarE.K(objQ4);
            }
            aVar3 = (e23.a) objQ4;
            zB = o0VarE.B(aVar3);
            objQ5 = o0VarE.q();
            if (zB) {
                objQ5 = new j22.d(aVar3, 7);
                o0VarE.K(objQ5);
            } else {
                objQ5 = new j22.d(aVar3, 7);
                o0VarE.K(objQ5);
            }
            z25 = z18;
            w.a(0, 1, (e23.a) objQ5, o0VarE, false);
            jl1.c cVar4 = ((jl1.d) p1VarC.getF182175a()).f99480c;
            boolean zB5 = o0VarE.B(p1VarC);
            if ((i18 & 7168) == 2048) {
                z26 = true;
            } else {
                z26 = false;
            }
            boolean zR2 = zB5 | z26 | o0VarE.r(gVar) | o0VarE.r(context);
            if ((i18 & 896) == 256) {
                z27 = true;
            } else {
                z27 = false;
            }
            z28 = zR2 | z27;
            objQ6 = o0VarE.q();
            if (z28) {
                p1Var2 = p1Var;
                a aVar5 = new a(lVar, gVar, context, p1VarC, z25, null);
                z29 = z25;
                o0VarE.K(aVar5);
                objQ6 = aVar5;
            } else {
                p1Var2 = p1Var;
                a aVar6 = new a(lVar, gVar, context, p1VarC, z25, null);
                z29 = z25;
                o0VarE.K(aVar6);
                objQ6 = aVar6;
            }
            l0.e((p) objQ6, cVar4, o0VarE);
            boolean z35 = ((jl1.d) p1VarC.getF182175a()).f99478a;
            z3.e eVarC3 = z3.f.c(1370036134, new ad0.g(aVar3, z29, gVar, p1VarC, 22), o0VarE);
            z3.e eVarC4 = z3.f.c(-1836881630, new dd1.d(cVar3, gVar, aVar, p1VarC, aVar2, p1Var4, n1Var2, p1Var2), o0VarE);
            o0Var = o0VarE;
            z02.d.a(z35, eVarC3, null, null, null, eVarC4, o0Var, 196656, 28);
            z17 = z29;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            z17 = z15;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a82.a(gVar, aVar, z17, lVar, aVar2, i14, i15, 8);
        }
    }
}
