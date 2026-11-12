package jy0;

import am.x0;
import android.content.Context;
import android.widget.Toast;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b21.v4;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailActivity;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import g02.f1;
import i3.d6;
import i3.e5;
import i3.s4;
import i3.v2;
import java.util.List;
import l72.c1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class u {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.creation.MultiDayActivitiesCreationWizardKt$CreationWizardFooter$1$3$1$1", f = "MultiDayActivitiesCreationWizard.kt", l = {292}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f101807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.l<Boolean, Unit> f101808b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h f101809c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ c12.h<v> f101810d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.l<cy0.e, Unit> f101811e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Context f101812f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.l<? super Boolean, Unit> lVar, h hVar, c12.h<v> hVar2, e23.l<? super cy0.e, Unit> lVar2, Context context, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f101808b = lVar;
            this.f101809c = hVar;
            this.f101810d = hVar2;
            this.f101811e = lVar2;
            this.f101812f = context;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f101808b, this.f101809c, this.f101810d, this.f101811e, this.f101812f, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f101807a;
            h hVar = this.f101809c;
            e23.l<Boolean, Unit> lVar = this.f101808b;
            if (i14 == 0) {
                o13.r.b(obj);
                lVar.invoke(Boolean.TRUE);
                this.f101807a = 1;
                obj = hVar.G0(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            gy0.c cVar = (gy0.c) obj;
            lVar.invoke(Boolean.FALSE);
            if (p005kotlin.jvm.internal.s.g(cVar, gy0.c.C1605c.f80119a)) {
                hVar.N2();
                this.f101810d.b(v.a.f101826b);
            } else if (cVar instanceof gy0.c.a) {
                this.f101811e.invoke(((gy0.c.a) cVar).f80116a);
            } else {
                Toast.makeText(this.f101812f, R.string.txt_error_occurred, 0).show();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.creation.MultiDayActivitiesCreationWizardKt$CreationWizardFooter$1$5$1$1", f = "MultiDayActivitiesCreationWizard.kt", l = {330}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f101813a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f101814b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.l<Boolean, Unit> f101815c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ h f101816d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Context f101817e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f101818f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(e23.l<? super Boolean, Unit> lVar, h hVar, Context context, e23.a<Unit> aVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f101815c = lVar;
            this.f101816d = hVar;
            this.f101817e = context;
            this.f101818f = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = new b(this.f101815c, this.f101816d, this.f101817e, this.f101818f, dVar);
            bVar.f101814b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            o53.b0 b0Var = (o53.b0) this.f101814b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f101813a;
            e23.l<Boolean, Unit> lVar = this.f101815c;
            if (i14 == 0) {
                o13.r.b(obj);
                lVar.invoke(Boolean.TRUE);
                this.f101814b = b0Var;
                this.f101813a = 1;
                obj = this.f101816d.p2(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            String str = (String) obj;
            Context context = this.f101817e;
            if (str != null) {
                MultiDayActivitiesDetailActivity.f39233a.getClass();
                MultiDayActivitiesDetailActivity.a.b(context, str);
                this.f101818f.invoke();
            } else {
                lVar.invoke(Boolean.FALSE);
                Toast.makeText(context, R.string.txt_error_occurred, 0).show();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.creation.MultiDayActivitiesCreationWizardKt$CreationWizardPage$1$4$1", f = "MultiDayActivitiesCreationWizard.kt", l = {394}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f101819a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f101820b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(h hVar, t13.d<? super c> dVar) {
            super(1, dVar);
            this.f101820b = hVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new c(this.f101820b, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super Unit> dVar) {
            return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f101819a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f101819a = 1;
                if (this.f101820b.V(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.p<d4.n, c12.h<v>, List<? extends c12.h.b<v>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f101821a = new d();

        @Override // e23.p
        public final List<? extends c12.h.b<v>> invoke(d4.n nVar, c12.h<v> hVar) {
            c12.h<v> hVar2 = hVar;
            nVar.getClass();
            hVar2.getClass();
            return p13.w.c(hVar2.f22558b.f150540a.getValue());
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.l<List<? extends c12.h.b<v>>, c12.h<v>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f101822a = new e();

        @Override // e23.l
        public final c12.h<v> invoke(List<? extends c12.h.b<v>> list) {
            List<? extends c12.h.b<v>> list2 = list;
            list2.getClass();
            return new c12.h<>(list2.get(0));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<c12.h<v>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c12.h.b f101823a;

        public f(c12.h.b bVar) {
            this.f101823a = bVar;
        }

        @Override // e23.a
        public final c12.h<v> invoke() {
            return new c12.h<>(this.f101823a);
        }
    }

    public static final /* synthetic */ class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f101824a;

        static {
            int[] iArr = new int[cy0.e.values().length];
            try {
                iArr[cy0.e.MULTI_DAY_ACTIVITY_OVERLAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[cy0.e.MAX_FUTURE_ACTIVITIES_EXCEEDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f101824a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:178:0x02f4  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(h hVar, c12.h<v> hVar2, sy0.j jVar, sy0.g gVar, e23.l<? super cy0.e, Unit> lVar, e23.l<? super Boolean, Unit> lVar2, e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        e23.a<Unit> aVar2;
        c12.h<v> hVar3;
        o0 o0Var;
        i53.f fVarB;
        i53.f fVar;
        boolean z14;
        boolean z15;
        boolean z16;
        i53.f fVarA;
        o0 o0VarE = mVar.E(-883243532);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(hVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(hVar2) : o0VarE.r(hVar2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(jVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(gVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(lVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(lVar2) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            aVar2 = aVar;
            i15 |= o0VarE.r(aVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            aVar2 = aVar;
        }
        if (o0VarE.n(i15 & 1, (i15 & 599187) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            v vVar = (v) ((c12.h.b) s9.c.c(hVar2.f22558b, o0VarE).getF182175a()).f22560b.f22562a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            o53.b0 b0Var = (o53.b0) objQ;
            h4.r.a aVar3 = h4.r.S;
            h4.r rVarP = c2.l.p(c2.l.s(aVar3));
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarP, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
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
            long jF = vb.h.f(d92.b.f58623a, o0VarE);
            if (vVar instanceof v.f) {
                o0VarE.C(206899184);
                String strQ = gl1.y.Q(o0VarE, R.string.lbl_get_started);
                boolean z17 = (i15 & 112) == 32 || ((i15 & 64) != 0 && o0VarE.r(hVar2));
                Object objQ2 = o0VarE.q();
                if (z17 || objQ2 == c2565a) {
                    objQ2 = new ew0.r(hVar2, 3);
                    o0VarE.K(objQ2);
                }
                fVarA = i53.a.a(new c12.b(strQ, (e23.a) objQ2, false, c12.b.a.PRIMARY, 4, null));
                o0VarE.g0(false);
            } else {
                if (p005kotlin.jvm.internal.s.g(vVar, v.g.f101832b)) {
                    o0VarE.C(206912382);
                    String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_next);
                    c12.b.a aVar5 = c12.b.a.PRIMARY;
                    String str = jVar.f161226a;
                    if (str == null) {
                        z16 = false;
                    } else {
                        if (str.length() > 0) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                    }
                    boolean z18 = ((i15 & 112) == 32 || ((i15 & 64) != 0 && o0VarE.r(hVar2))) | ((i15 & 896) == 256) | ((i15 & 14) == 4);
                    Object objQ3 = o0VarE.q();
                    if (z18 || objQ3 == c2565a) {
                        objQ3 = new d6(jVar, 24, hVar2, hVar);
                        o0VarE.K(objQ3);
                    }
                    fVarA = i53.a.a(new c12.b(strQ2, (e23.a) objQ3, z16, aVar5));
                    o0VarE.g0(false);
                } else if (p005kotlin.jvm.internal.s.g(vVar, v.e.f101830b)) {
                    o0VarE.C(206932876);
                    String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_next);
                    c12.b.a aVar6 = c12.b.a.PRIMARY;
                    boolean z19 = (gVar.f161219a == null || gVar.f161220b == null) ? false : true;
                    boolean zR = ((i15 & 57344) == 16384) | o0VarE.r(b0Var) | ((458752 & i15) == 131072) | ((i15 & 14) == 4) | ((i15 & 112) == 32 || ((i15 & 64) != 0 && o0VarE.r(hVar2))) | o0VarE.r(context);
                    Object objQ4 = o0VarE.q();
                    if (zR || objQ4 == c2565a) {
                        z15 = false;
                        ck0.j jVar2 = new ck0.j(b0Var, (Object) lVar2, (Object) hVar, (Object) hVar2, (Object) lVar, (Object) context, 6);
                        hVar3 = hVar2;
                        o0VarE.K(jVar2);
                        objQ4 = jVar2;
                    } else {
                        hVar3 = hVar2;
                        z15 = false;
                    }
                    i53.f fVarA2 = i53.a.a(new c12.b(strQ3, (e23.a) objQ4, z19, aVar6));
                    o0VarE.g0(z15);
                    fVar = fVarA2;
                } else {
                    hVar3 = hVar2;
                    if (p005kotlin.jvm.internal.s.g(vVar, v.a.f101826b)) {
                        o0VarE.C(206980850);
                        String strQ4 = gl1.y.Q(o0VarE, R.string.lbl_next);
                        c12.b.a aVar7 = c12.b.a.PRIMARY;
                        String str2 = jVar.f161226a;
                        if (str2 == null) {
                            z14 = false;
                        } else {
                            if (str2.length() > 0) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                        }
                        boolean z24 = (i15 & 112) == 32 || ((i15 & 64) != 0 && o0VarE.r(hVar3));
                        Object objQ5 = o0VarE.q();
                        if (z24 || objQ5 == c2565a) {
                            objQ5 = new ew0.r(hVar3, 4);
                            o0VarE.K(objQ5);
                        }
                        fVarB = i53.a.a(new c12.b(strQ4, (e23.a) objQ5, z14, aVar7));
                        o0VarE.g0(false);
                    } else if (p005kotlin.jvm.internal.s.g(vVar, v.h.f101833b)) {
                        o0VarE.C(206996514);
                        String strQ5 = gl1.y.Q(o0VarE, R.string.onboarding_device_setup_title);
                        boolean zR2 = ((i15 & 3670016) == 1048576) | o0VarE.r(b0Var) | ((i15 & 458752) == 131072) | ((i15 & 14) == 4) | o0VarE.r(context);
                        Object objQ6 = o0VarE.q();
                        if (zR2 || objQ6 == c2565a) {
                            v4 v4Var = new v4(b0Var, lVar2, hVar, context, aVar2, 15);
                            o0VarE.K(v4Var);
                            objQ6 = v4Var;
                        }
                        fVarB = i53.a.a(new c12.b(strQ5, (e23.a) objQ6, false, c12.b.a.PRIMARY, 4, null));
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(207029232);
                        o0VarE.g0(false);
                        fVarB = j53.l.b();
                    }
                    fVar = fVarB;
                }
                o0Var = o0VarE;
                c12.c.a(jF, fVar, o0Var, 0, 0);
                d92.b.f58625c.getClass();
                e5.t(aVar3, j92.b.f97899b.f97920e, o0Var, true);
            }
            fVar = fVarA;
            hVar3 = hVar2;
            o0Var = o0VarE;
            c12.c.a(jF, fVar, o0Var, 0, 0);
            d92.b.f58625c.getClass();
            e5.t(aVar3, j92.b.f97899b.f97920e, o0Var, true);
        } else {
            hVar3 = hVar2;
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.o(hVar, hVar3, jVar, gVar, lVar, lVar2, aVar, i14, 11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x019e  */
    /* JADX WARN: Code duplicated, block: B:123:0x01de  */
    /* JADX WARN: Code duplicated, block: B:132:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:144:0x023f  */
    /* JADX WARN: Code duplicated, block: B:153:0x0266  */
    /* JADX WARN: Code duplicated, block: B:167:0x0295  */
    /* JADX WARN: Code duplicated, block: B:181:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:182:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:185:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:187:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:200:0x033e  */
    /* JADX WARN: Code duplicated, block: B:209:0x035e  */
    /* JADX WARN: Code duplicated, block: B:230:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:248:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:257:0x0415  */
    /* JADX WARN: Code duplicated, block: B:269:0x045a  */
    /* JADX WARN: Code duplicated, block: B:281:0x0493  */
    /* JADX WARN: Code duplicated, block: B:295:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:304:0x04ee  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v26 */
    public static final void b(final h hVar, c12.h<v> hVar2, v vVar, sy0.j jVar, sy0.g gVar, sy0.b bVar, e23.l<? super Boolean, Unit> lVar, k30.n nVar, i53.c<sy0.f> cVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        e23.a<Unit> aVar2;
        o0 o0Var;
        final int i16;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        o0 o0Var2;
        Object obj10;
        Object obj11;
        Object obj12;
        p3.m.a aVar3;
        boolean z14;
        Object objQ;
        Object obj13;
        Object obj14;
        Object obj15;
        boolean z15;
        ?? r14;
        final h hVar3;
        Object obj16;
        o0 o0Var3;
        o0 o0Var4;
        final h hVar4 = hVar;
        o0 o0VarE = mVar.E(-1240513779);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(hVar4) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(hVar2) : o0VarE.r(hVar2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(vVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(jVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.B(gVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.B(bVar) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(lVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i15 |= o0VarE.B(nVar) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i15 |= o0VarE.B(cVar) ? 67108864 : 33554432;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            i15 |= o0VarE.r(aVar) ? 536870912 : 268435456;
        }
        if (o0VarE.n(i15 & 1, (i15 & 306783379) != 306783378)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar4 = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar4, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar5 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            if (p005kotlin.jvm.internal.s.g(vVar, v.f.f101831b)) {
                o0VarE.C(704700606);
                gg.b.j(o0VarE, 0);
                o0VarE.g0(false);
                hVar4 = hVar;
            } else {
                boolean zG = p005kotlin.jvm.internal.s.g(vVar, v.g.f101832b);
                p3.m.a aVar6 = p3.m.f135153a;
                if (zG) {
                    o0VarE.C(704834092);
                    String str = jVar.f161226a;
                    boolean z16 = (i15 & 14) == 4;
                    Object objQ2 = o0VarE.q();
                    if (z16) {
                        r14 = 0;
                        hVar3 = hVar;
                        final boolean z17 = false ? 1 : 0;
                        e23.l lVar2 = new e23.l() { // from class: jy0.s
                            @Override // e23.l
                            public final Object invoke(Object obj17) {
                                switch (z17) {
                                    case 0:
                                        String str2 = (String) obj17;
                                        str2.getClass();
                                        hVar3.e2(str2);
                                        break;
                                    case 1:
                                        hVar3.E1(((Boolean) obj17).booleanValue());
                                        break;
                                    case 2:
                                        sy0.m mVar2 = (sy0.m) obj17;
                                        mVar2.getClass();
                                        hVar3.Q1(mVar2);
                                        break;
                                    case 3:
                                        hVar3.u3((sy0.f) obj17);
                                        break;
                                    case 4:
                                        k30.m mVar3 = (k30.m) obj17;
                                        mVar3.getClass();
                                        hVar3.b0(mVar3);
                                        break;
                                    case 5:
                                        i53.c<k30.o> cVar2 = (i53.c) obj17;
                                        cVar2.getClass();
                                        hVar3.D1(cVar2);
                                        break;
                                    case 6:
                                        hVar3.N3((Long) obj17);
                                        break;
                                    case 7:
                                        hVar3.n3((Long) obj17);
                                        break;
                                    case 8:
                                        ActivityListItemDTO activityListItemDTO = (ActivityListItemDTO) obj17;
                                        activityListItemDTO.getClass();
                                        hVar3.w4(activityListItemDTO);
                                        break;
                                    case 9:
                                        x0 x0Var = (x0) obj17;
                                        x0Var.getClass();
                                        hVar3.D0(x0Var);
                                        break;
                                    default:
                                        x0 x0Var2 = (x0) obj17;
                                        x0Var2.getClass();
                                        hVar3.D0(x0Var2);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(lVar2);
                        obj16 = lVar2;
                    } else {
                        aVar6.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            r14 = 0;
                            hVar3 = hVar;
                            final int z18 = false ? 1 : 0;
                            e23.l lVar3 = new e23.l() { // from class: jy0.s
                                @Override // e23.l
                                public final Object invoke(Object obj17) {
                                    switch (z18) {
                                        case 0:
                                            String str2 = (String) obj17;
                                            str2.getClass();
                                            hVar3.e2(str2);
                                            break;
                                        case 1:
                                            hVar3.E1(((Boolean) obj17).booleanValue());
                                            break;
                                        case 2:
                                            sy0.m mVar2 = (sy0.m) obj17;
                                            mVar2.getClass();
                                            hVar3.Q1(mVar2);
                                            break;
                                        case 3:
                                            hVar3.u3((sy0.f) obj17);
                                            break;
                                        case 4:
                                            k30.m mVar3 = (k30.m) obj17;
                                            mVar3.getClass();
                                            hVar3.b0(mVar3);
                                            break;
                                        case 5:
                                            i53.c<k30.o> cVar2 = (i53.c) obj17;
                                            cVar2.getClass();
                                            hVar3.D1(cVar2);
                                            break;
                                        case 6:
                                            hVar3.N3((Long) obj17);
                                            break;
                                        case 7:
                                            hVar3.n3((Long) obj17);
                                            break;
                                        case 8:
                                            ActivityListItemDTO activityListItemDTO = (ActivityListItemDTO) obj17;
                                            activityListItemDTO.getClass();
                                            hVar3.w4(activityListItemDTO);
                                            break;
                                        case 9:
                                            x0 x0Var = (x0) obj17;
                                            x0Var.getClass();
                                            hVar3.D0(x0Var);
                                            break;
                                        default:
                                            x0 x0Var2 = (x0) obj17;
                                            x0Var2.getClass();
                                            hVar3.D0(x0Var2);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            o0VarE.K(lVar3);
                            obj16 = lVar3;
                        } else {
                            r14 = 0;
                            hVar3 = hVar;
                            obj16 = objQ2;
                        }
                    }
                    z.a(str, (e23.l) obj16, o0VarE, r14);
                    o0VarE.g0(r14);
                    hVar4 = hVar3;
                } else if (p005kotlin.jvm.internal.s.g(vVar, v.e.f101830b)) {
                    o0VarE.C(705148122);
                    Long l14 = gVar.f161219a;
                    Long l15 = gVar.f161220b;
                    int i17 = i15 & 14;
                    boolean z19 = i17 == 4;
                    Object objQ3 = o0VarE.q();
                    if (z19) {
                        obj14 = objQ3;
                        final int i18 = 6;
                        e23.l lVar4 = new e23.l() { // from class: jy0.s
                            @Override // e23.l
                            public final Object invoke(Object obj17) {
                                switch (i18) {
                                    case 0:
                                        String str2 = (String) obj17;
                                        str2.getClass();
                                        hVar.e2(str2);
                                        break;
                                    case 1:
                                        hVar.E1(((Boolean) obj17).booleanValue());
                                        break;
                                    case 2:
                                        sy0.m mVar2 = (sy0.m) obj17;
                                        mVar2.getClass();
                                        hVar.Q1(mVar2);
                                        break;
                                    case 3:
                                        hVar.u3((sy0.f) obj17);
                                        break;
                                    case 4:
                                        k30.m mVar3 = (k30.m) obj17;
                                        mVar3.getClass();
                                        hVar.b0(mVar3);
                                        break;
                                    case 5:
                                        i53.c<k30.o> cVar2 = (i53.c) obj17;
                                        cVar2.getClass();
                                        hVar.D1(cVar2);
                                        break;
                                    case 6:
                                        hVar.N3((Long) obj17);
                                        break;
                                    case 7:
                                        hVar.n3((Long) obj17);
                                        break;
                                    case 8:
                                        ActivityListItemDTO activityListItemDTO = (ActivityListItemDTO) obj17;
                                        activityListItemDTO.getClass();
                                        hVar.w4(activityListItemDTO);
                                        break;
                                    case 9:
                                        x0 x0Var = (x0) obj17;
                                        x0Var.getClass();
                                        hVar.D0(x0Var);
                                        break;
                                    default:
                                        x0 x0Var2 = (x0) obj17;
                                        x0Var2.getClass();
                                        hVar.D0(x0Var2);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(lVar4);
                        obj14 = lVar4;
                    } else {
                        aVar6.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            obj14 = objQ3;
                            final int i19 = 6;
                            e23.l lVar5 = new e23.l() { // from class: jy0.s
                                @Override // e23.l
                                public final Object invoke(Object obj17) {
                                    switch (i19) {
                                        case 0:
                                            String str2 = (String) obj17;
                                            str2.getClass();
                                            hVar.e2(str2);
                                            break;
                                        case 1:
                                            hVar.E1(((Boolean) obj17).booleanValue());
                                            break;
                                        case 2:
                                            sy0.m mVar2 = (sy0.m) obj17;
                                            mVar2.getClass();
                                            hVar.Q1(mVar2);
                                            break;
                                        case 3:
                                            hVar.u3((sy0.f) obj17);
                                            break;
                                        case 4:
                                            k30.m mVar3 = (k30.m) obj17;
                                            mVar3.getClass();
                                            hVar.b0(mVar3);
                                            break;
                                        case 5:
                                            i53.c<k30.o> cVar2 = (i53.c) obj17;
                                            cVar2.getClass();
                                            hVar.D1(cVar2);
                                            break;
                                        case 6:
                                            hVar.N3((Long) obj17);
                                            break;
                                        case 7:
                                            hVar.n3((Long) obj17);
                                            break;
                                        case 8:
                                            ActivityListItemDTO activityListItemDTO = (ActivityListItemDTO) obj17;
                                            activityListItemDTO.getClass();
                                            hVar.w4(activityListItemDTO);
                                            break;
                                        case 9:
                                            x0 x0Var = (x0) obj17;
                                            x0Var.getClass();
                                            hVar.D0(x0Var);
                                            break;
                                        default:
                                            x0 x0Var2 = (x0) obj17;
                                            x0Var2.getClass();
                                            hVar.D0(x0Var2);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            o0VarE.K(lVar5);
                            obj14 = lVar5;
                        }
                    }
                    obj14 = objQ3;
                    e23.l lVar6 = (e23.l) obj14;
                    boolean z24 = i17 == 4;
                    Object objQ4 = o0VarE.q();
                    if (z24) {
                        obj15 = objQ4;
                        final int i24 = 7;
                        e23.l lVar7 = new e23.l() { // from class: jy0.s
                            @Override // e23.l
                            public final Object invoke(Object obj17) {
                                switch (i24) {
                                    case 0:
                                        String str2 = (String) obj17;
                                        str2.getClass();
                                        hVar.e2(str2);
                                        break;
                                    case 1:
                                        hVar.E1(((Boolean) obj17).booleanValue());
                                        break;
                                    case 2:
                                        sy0.m mVar2 = (sy0.m) obj17;
                                        mVar2.getClass();
                                        hVar.Q1(mVar2);
                                        break;
                                    case 3:
                                        hVar.u3((sy0.f) obj17);
                                        break;
                                    case 4:
                                        k30.m mVar3 = (k30.m) obj17;
                                        mVar3.getClass();
                                        hVar.b0(mVar3);
                                        break;
                                    case 5:
                                        i53.c<k30.o> cVar2 = (i53.c) obj17;
                                        cVar2.getClass();
                                        hVar.D1(cVar2);
                                        break;
                                    case 6:
                                        hVar.N3((Long) obj17);
                                        break;
                                    case 7:
                                        hVar.n3((Long) obj17);
                                        break;
                                    case 8:
                                        ActivityListItemDTO activityListItemDTO = (ActivityListItemDTO) obj17;
                                        activityListItemDTO.getClass();
                                        hVar.w4(activityListItemDTO);
                                        break;
                                    case 9:
                                        x0 x0Var = (x0) obj17;
                                        x0Var.getClass();
                                        hVar.D0(x0Var);
                                        break;
                                    default:
                                        x0 x0Var2 = (x0) obj17;
                                        x0Var2.getClass();
                                        hVar.D0(x0Var2);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(lVar7);
                        obj15 = lVar7;
                    } else {
                        aVar6.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            obj15 = objQ4;
                            final int i25 = 7;
                            e23.l lVar8 = new e23.l() { // from class: jy0.s
                                @Override // e23.l
                                public final Object invoke(Object obj17) {
                                    switch (i25) {
                                        case 0:
                                            String str2 = (String) obj17;
                                            str2.getClass();
                                            hVar.e2(str2);
                                            break;
                                        case 1:
                                            hVar.E1(((Boolean) obj17).booleanValue());
                                            break;
                                        case 2:
                                            sy0.m mVar2 = (sy0.m) obj17;
                                            mVar2.getClass();
                                            hVar.Q1(mVar2);
                                            break;
                                        case 3:
                                            hVar.u3((sy0.f) obj17);
                                            break;
                                        case 4:
                                            k30.m mVar3 = (k30.m) obj17;
                                            mVar3.getClass();
                                            hVar.b0(mVar3);
                                            break;
                                        case 5:
                                            i53.c<k30.o> cVar2 = (i53.c) obj17;
                                            cVar2.getClass();
                                            hVar.D1(cVar2);
                                            break;
                                        case 6:
                                            hVar.N3((Long) obj17);
                                            break;
                                        case 7:
                                            hVar.n3((Long) obj17);
                                            break;
                                        case 8:
                                            ActivityListItemDTO activityListItemDTO = (ActivityListItemDTO) obj17;
                                            activityListItemDTO.getClass();
                                            hVar.w4(activityListItemDTO);
                                            break;
                                        case 9:
                                            x0 x0Var = (x0) obj17;
                                            x0Var.getClass();
                                            hVar.D0(x0Var);
                                            break;
                                        default:
                                            x0 x0Var2 = (x0) obj17;
                                            x0Var2.getClass();
                                            hVar.D0(x0Var2);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            o0VarE.K(lVar8);
                            obj15 = lVar8;
                        }
                    }
                    obj15 = objQ4;
                    y.b(l14, l15, lVar6, (e23.l) obj15, o0VarE, 0);
                    o0VarE.g0(false);
                    nVar = nVar;
                    hVar4 = hVar;
                    aVar2 = aVar;
                    z15 = true;
                    o0Var3 = o0VarE;
                } else {
                    if (p005kotlin.jvm.internal.s.g(vVar, v.a.f101826b)) {
                        o0VarE.C(705786970);
                        int i26 = i15 & 14;
                        boolean z25 = i26 == 4;
                        Object objQ5 = o0VarE.q();
                        if (z25) {
                            obj10 = objQ5;
                            c cVar2 = new c(hVar, null);
                            o0VarE.K(cVar2);
                            obj10 = cVar2;
                        } else {
                            aVar6.getClass();
                            if (objQ5 == p3.m.a.f135155b) {
                                obj10 = objQ5;
                                c cVar3 = new c(hVar, null);
                                o0VarE.K(cVar3);
                                obj10 = cVar3;
                            }
                        }
                        obj10 = objQ5;
                        e23.l lVar9 = (e23.l) obj10;
                        Long l16 = jVar.f161227b;
                        Long l17 = jVar.f161228c;
                        int i27 = i15;
                        i53.e<ActivityListItemDTO> eVar = jVar.f161229d;
                        boolean z26 = i26 == 4;
                        Object objQ6 = o0VarE.q();
                        if (z26) {
                            obj11 = objQ6;
                            final int i28 = 8;
                            e23.l lVar10 = new e23.l() { // from class: jy0.s
                                @Override // e23.l
                                public final Object invoke(Object obj17) {
                                    switch (i28) {
                                        case 0:
                                            String str2 = (String) obj17;
                                            str2.getClass();
                                            hVar.e2(str2);
                                            break;
                                        case 1:
                                            hVar.E1(((Boolean) obj17).booleanValue());
                                            break;
                                        case 2:
                                            sy0.m mVar2 = (sy0.m) obj17;
                                            mVar2.getClass();
                                            hVar.Q1(mVar2);
                                            break;
                                        case 3:
                                            hVar.u3((sy0.f) obj17);
                                            break;
                                        case 4:
                                            k30.m mVar3 = (k30.m) obj17;
                                            mVar3.getClass();
                                            hVar.b0(mVar3);
                                            break;
                                        case 5:
                                            i53.c<k30.o> cVar4 = (i53.c) obj17;
                                            cVar4.getClass();
                                            hVar.D1(cVar4);
                                            break;
                                        case 6:
                                            hVar.N3((Long) obj17);
                                            break;
                                        case 7:
                                            hVar.n3((Long) obj17);
                                            break;
                                        case 8:
                                            ActivityListItemDTO activityListItemDTO = (ActivityListItemDTO) obj17;
                                            activityListItemDTO.getClass();
                                            hVar.w4(activityListItemDTO);
                                            break;
                                        case 9:
                                            x0 x0Var = (x0) obj17;
                                            x0Var.getClass();
                                            hVar.D0(x0Var);
                                            break;
                                        default:
                                            x0 x0Var2 = (x0) obj17;
                                            x0Var2.getClass();
                                            hVar.D0(x0Var2);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            o0VarE.K(lVar10);
                            obj11 = lVar10;
                        } else {
                            aVar6.getClass();
                            if (objQ6 == p3.m.a.f135155b) {
                                obj11 = objQ6;
                                final int i29 = 8;
                                e23.l lVar11 = new e23.l() { // from class: jy0.s
                                    @Override // e23.l
                                    public final Object invoke(Object obj17) {
                                        switch (i29) {
                                            case 0:
                                                String str2 = (String) obj17;
                                                str2.getClass();
                                                hVar.e2(str2);
                                                break;
                                            case 1:
                                                hVar.E1(((Boolean) obj17).booleanValue());
                                                break;
                                            case 2:
                                                sy0.m mVar2 = (sy0.m) obj17;
                                                mVar2.getClass();
                                                hVar.Q1(mVar2);
                                                break;
                                            case 3:
                                                hVar.u3((sy0.f) obj17);
                                                break;
                                            case 4:
                                                k30.m mVar3 = (k30.m) obj17;
                                                mVar3.getClass();
                                                hVar.b0(mVar3);
                                                break;
                                            case 5:
                                                i53.c<k30.o> cVar4 = (i53.c) obj17;
                                                cVar4.getClass();
                                                hVar.D1(cVar4);
                                                break;
                                            case 6:
                                                hVar.N3((Long) obj17);
                                                break;
                                            case 7:
                                                hVar.n3((Long) obj17);
                                                break;
                                            case 8:
                                                ActivityListItemDTO activityListItemDTO = (ActivityListItemDTO) obj17;
                                                activityListItemDTO.getClass();
                                                hVar.w4(activityListItemDTO);
                                                break;
                                            case 9:
                                                x0 x0Var = (x0) obj17;
                                                x0Var.getClass();
                                                hVar.D0(x0Var);
                                                break;
                                            default:
                                                x0 x0Var2 = (x0) obj17;
                                                x0Var2.getClass();
                                                hVar.D0(x0Var2);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                o0VarE.K(lVar11);
                                obj11 = lVar11;
                            }
                        }
                        obj11 = objQ6;
                        e23.l lVar12 = (e23.l) obj11;
                        boolean z27 = (i27 & 112) == 32 || ((i27 & 64) != 0 && o0VarE.r(hVar2));
                        Object objQ7 = o0VarE.q();
                        if (z27) {
                            obj12 = objQ7;
                            ew0.r rVar = new ew0.r(hVar2, 5);
                            o0VarE.K(rVar);
                            obj12 = rVar;
                        } else {
                            aVar6.getClass();
                            if (objQ7 == p3.m.a.f135155b) {
                                obj12 = objQ7;
                                ew0.r rVar2 = new ew0.r(hVar2, 5);
                                o0VarE.K(rVar2);
                                obj12 = rVar2;
                            }
                        }
                        obj12 = objQ7;
                        e23.a aVar7 = (e23.a) obj12;
                        boolean z28 = i26 == 4;
                        Object objQ8 = o0VarE.q();
                        if (z28) {
                            aVar3 = aVar6;
                        } else {
                            aVar6.getClass();
                            aVar3 = aVar6;
                            if (objQ8 == p3.m.a.f135155b) {
                            }
                            obj = objQ8;
                            e23.p pVar = (e23.p) obj;
                            if (i26 == 4) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            objQ = o0VarE.q();
                            if (z14) {
                                obj13 = objQ;
                                final int i30 = 9;
                                e23.l lVar13 = new e23.l() { // from class: jy0.s
                                    @Override // e23.l
                                    public final Object invoke(Object obj17) {
                                        switch (i30) {
                                            case 0:
                                                String str2 = (String) obj17;
                                                str2.getClass();
                                                hVar.e2(str2);
                                                break;
                                            case 1:
                                                hVar.E1(((Boolean) obj17).booleanValue());
                                                break;
                                            case 2:
                                                sy0.m mVar2 = (sy0.m) obj17;
                                                mVar2.getClass();
                                                hVar.Q1(mVar2);
                                                break;
                                            case 3:
                                                hVar.u3((sy0.f) obj17);
                                                break;
                                            case 4:
                                                k30.m mVar3 = (k30.m) obj17;
                                                mVar3.getClass();
                                                hVar.b0(mVar3);
                                                break;
                                            case 5:
                                                i53.c<k30.o> cVar4 = (i53.c) obj17;
                                                cVar4.getClass();
                                                hVar.D1(cVar4);
                                                break;
                                            case 6:
                                                hVar.N3((Long) obj17);
                                                break;
                                            case 7:
                                                hVar.n3((Long) obj17);
                                                break;
                                            case 8:
                                                ActivityListItemDTO activityListItemDTO = (ActivityListItemDTO) obj17;
                                                activityListItemDTO.getClass();
                                                hVar.w4(activityListItemDTO);
                                                break;
                                            case 9:
                                                x0 x0Var = (x0) obj17;
                                                x0Var.getClass();
                                                hVar.D0(x0Var);
                                                break;
                                            default:
                                                x0 x0Var2 = (x0) obj17;
                                                x0Var2.getClass();
                                                hVar.D0(x0Var2);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                o0VarE.K(lVar13);
                                obj13 = lVar13;
                            } else {
                                aVar3.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    obj13 = objQ;
                                    final int i34 = 9;
                                    e23.l lVar14 = new e23.l() { // from class: jy0.s
                                        @Override // e23.l
                                        public final Object invoke(Object obj17) {
                                            switch (i34) {
                                                case 0:
                                                    String str2 = (String) obj17;
                                                    str2.getClass();
                                                    hVar.e2(str2);
                                                    break;
                                                case 1:
                                                    hVar.E1(((Boolean) obj17).booleanValue());
                                                    break;
                                                case 2:
                                                    sy0.m mVar2 = (sy0.m) obj17;
                                                    mVar2.getClass();
                                                    hVar.Q1(mVar2);
                                                    break;
                                                case 3:
                                                    hVar.u3((sy0.f) obj17);
                                                    break;
                                                case 4:
                                                    k30.m mVar3 = (k30.m) obj17;
                                                    mVar3.getClass();
                                                    hVar.b0(mVar3);
                                                    break;
                                                case 5:
                                                    i53.c<k30.o> cVar4 = (i53.c) obj17;
                                                    cVar4.getClass();
                                                    hVar.D1(cVar4);
                                                    break;
                                                case 6:
                                                    hVar.N3((Long) obj17);
                                                    break;
                                                case 7:
                                                    hVar.n3((Long) obj17);
                                                    break;
                                                case 8:
                                                    ActivityListItemDTO activityListItemDTO = (ActivityListItemDTO) obj17;
                                                    activityListItemDTO.getClass();
                                                    hVar.w4(activityListItemDTO);
                                                    break;
                                                case 9:
                                                    x0 x0Var = (x0) obj17;
                                                    x0Var.getClass();
                                                    hVar.D0(x0Var);
                                                    break;
                                                default:
                                                    x0 x0Var2 = (x0) obj17;
                                                    x0Var2.getClass();
                                                    hVar.D0(x0Var2);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    o0VarE.K(lVar14);
                                    obj13 = lVar14;
                                }
                            }
                            obj13 = objQ;
                            aVar2 = aVar;
                            hVar4 = hVar;
                            i0.f(lVar9, bVar, l16, l17, eVar, lVar, lVar12, aVar7, pVar, (e23.l) obj13, o0VarE, ((i27 >> 12) & 112) | ((i27 >> 3) & 458752));
                            o0 o0Var5 = o0VarE;
                            o0Var5.g0(false);
                            o0Var2 = o0Var5;
                        }
                        obj = objQ8;
                        ik1.c cVar4 = new ik1.c(hVar, 15);
                        o0VarE.K(cVar4);
                        Object obj17 = cVar4;
                        obj17 = objQ8;
                        e23.p pVar2 = (e23.p) obj17;
                        if (i26 == 4) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objQ = o0VarE.q();
                        if (z14) {
                            aVar3.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                obj13 = objQ;
                                final int i35 = 9;
                                e23.l lVar15 = new e23.l() { // from class: jy0.s
                                    @Override // e23.l
                                    public final Object invoke(Object obj18) {
                                        switch (i35) {
                                            case 0:
                                                String str2 = (String) obj18;
                                                str2.getClass();
                                                hVar.e2(str2);
                                                break;
                                            case 1:
                                                hVar.E1(((Boolean) obj18).booleanValue());
                                                break;
                                            case 2:
                                                sy0.m mVar2 = (sy0.m) obj18;
                                                mVar2.getClass();
                                                hVar.Q1(mVar2);
                                                break;
                                            case 3:
                                                hVar.u3((sy0.f) obj18);
                                                break;
                                            case 4:
                                                k30.m mVar3 = (k30.m) obj18;
                                                mVar3.getClass();
                                                hVar.b0(mVar3);
                                                break;
                                            case 5:
                                                i53.c<k30.o> cVar5 = (i53.c) obj18;
                                                cVar5.getClass();
                                                hVar.D1(cVar5);
                                                break;
                                            case 6:
                                                hVar.N3((Long) obj18);
                                                break;
                                            case 7:
                                                hVar.n3((Long) obj18);
                                                break;
                                            case 8:
                                                ActivityListItemDTO activityListItemDTO = (ActivityListItemDTO) obj18;
                                                activityListItemDTO.getClass();
                                                hVar.w4(activityListItemDTO);
                                                break;
                                            case 9:
                                                x0 x0Var = (x0) obj18;
                                                x0Var.getClass();
                                                hVar.D0(x0Var);
                                                break;
                                            default:
                                                x0 x0Var2 = (x0) obj18;
                                                x0Var2.getClass();
                                                hVar.D0(x0Var2);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                o0VarE.K(lVar15);
                                obj13 = lVar15;
                            }
                        } else {
                            obj13 = objQ;
                            final int i36 = 9;
                            e23.l lVar16 = new e23.l() { // from class: jy0.s
                                @Override // e23.l
                                public final Object invoke(Object obj18) {
                                    switch (i36) {
                                        case 0:
                                            String str2 = (String) obj18;
                                            str2.getClass();
                                            hVar.e2(str2);
                                            break;
                                        case 1:
                                            hVar.E1(((Boolean) obj18).booleanValue());
                                            break;
                                        case 2:
                                            sy0.m mVar2 = (sy0.m) obj18;
                                            mVar2.getClass();
                                            hVar.Q1(mVar2);
                                            break;
                                        case 3:
                                            hVar.u3((sy0.f) obj18);
                                            break;
                                        case 4:
                                            k30.m mVar3 = (k30.m) obj18;
                                            mVar3.getClass();
                                            hVar.b0(mVar3);
                                            break;
                                        case 5:
                                            i53.c<k30.o> cVar5 = (i53.c) obj18;
                                            cVar5.getClass();
                                            hVar.D1(cVar5);
                                            break;
                                        case 6:
                                            hVar.N3((Long) obj18);
                                            break;
                                        case 7:
                                            hVar.n3((Long) obj18);
                                            break;
                                        case 8:
                                            ActivityListItemDTO activityListItemDTO = (ActivityListItemDTO) obj18;
                                            activityListItemDTO.getClass();
                                            hVar.w4(activityListItemDTO);
                                            break;
                                        case 9:
                                            x0 x0Var = (x0) obj18;
                                            x0Var.getClass();
                                            hVar.D0(x0Var);
                                            break;
                                        default:
                                            x0 x0Var2 = (x0) obj18;
                                            x0Var2.getClass();
                                            hVar.D0(x0Var2);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            o0VarE.K(lVar16);
                            obj13 = lVar16;
                        }
                        obj13 = objQ;
                        aVar2 = aVar;
                        hVar4 = hVar;
                        i0.f(lVar9, bVar, l16, l17, eVar, lVar, lVar12, aVar7, pVar2, (e23.l) obj13, o0VarE, ((i27 >> 12) & 112) | ((i27 >> 3) & 458752));
                        o0 o0Var6 = o0VarE;
                        o0Var6.g0(false);
                        o0Var2 = o0Var6;
                    } else {
                        hVar4 = hVar;
                        aVar2 = aVar;
                        int i37 = i15;
                        if (p005kotlin.jvm.internal.s.g(vVar, v.b.f101827b)) {
                            o0VarE.C(707045446);
                            i53.c<x0> cVar5 = bVar.f161202b;
                            i53.e<x0> eVar2 = bVar.f161203c;
                            int i38 = i37 & 14;
                            boolean z29 = i38 == 4;
                            Object objQ9 = o0VarE.q();
                            if (z29) {
                                obj8 = objQ9;
                                jx0.e eVar3 = new jx0.e(hVar4, 3);
                                o0VarE.K(eVar3);
                                obj8 = eVar3;
                            } else {
                                aVar6.getClass();
                                if (objQ9 == p3.m.a.f135155b) {
                                    obj8 = objQ9;
                                    jx0.e eVar4 = new jx0.e(hVar4, 3);
                                    o0VarE.K(eVar4);
                                    obj8 = eVar4;
                                }
                            }
                            obj8 = objQ9;
                            e23.a aVar8 = (e23.a) obj8;
                            boolean z34 = i38 == 4;
                            Object objQ10 = o0VarE.q();
                            if (z34) {
                                obj9 = objQ10;
                                final int i39 = 10;
                                e23.l lVar17 = new e23.l() { // from class: jy0.s
                                    @Override // e23.l
                                    public final Object invoke(Object obj18) {
                                        switch (i39) {
                                            case 0:
                                                String str2 = (String) obj18;
                                                str2.getClass();
                                                hVar4.e2(str2);
                                                break;
                                            case 1:
                                                hVar4.E1(((Boolean) obj18).booleanValue());
                                                break;
                                            case 2:
                                                sy0.m mVar2 = (sy0.m) obj18;
                                                mVar2.getClass();
                                                hVar4.Q1(mVar2);
                                                break;
                                            case 3:
                                                hVar4.u3((sy0.f) obj18);
                                                break;
                                            case 4:
                                                k30.m mVar3 = (k30.m) obj18;
                                                mVar3.getClass();
                                                hVar4.b0(mVar3);
                                                break;
                                            case 5:
                                                i53.c<k30.o> cVar6 = (i53.c) obj18;
                                                cVar6.getClass();
                                                hVar4.D1(cVar6);
                                                break;
                                            case 6:
                                                hVar4.N3((Long) obj18);
                                                break;
                                            case 7:
                                                hVar4.n3((Long) obj18);
                                                break;
                                            case 8:
                                                ActivityListItemDTO activityListItemDTO = (ActivityListItemDTO) obj18;
                                                activityListItemDTO.getClass();
                                                hVar4.w4(activityListItemDTO);
                                                break;
                                            case 9:
                                                x0 x0Var = (x0) obj18;
                                                x0Var.getClass();
                                                hVar4.D0(x0Var);
                                                break;
                                            default:
                                                x0 x0Var2 = (x0) obj18;
                                                x0Var2.getClass();
                                                hVar4.D0(x0Var2);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                o0VarE.K(lVar17);
                                obj9 = lVar17;
                            } else {
                                aVar6.getClass();
                                if (objQ10 == p3.m.a.f135155b) {
                                    obj9 = objQ10;
                                    final int i310 = 10;
                                    e23.l lVar18 = new e23.l() { // from class: jy0.s
                                        @Override // e23.l
                                        public final Object invoke(Object obj18) {
                                            switch (i310) {
                                                case 0:
                                                    String str2 = (String) obj18;
                                                    str2.getClass();
                                                    hVar4.e2(str2);
                                                    break;
                                                case 1:
                                                    hVar4.E1(((Boolean) obj18).booleanValue());
                                                    break;
                                                case 2:
                                                    sy0.m mVar2 = (sy0.m) obj18;
                                                    mVar2.getClass();
                                                    hVar4.Q1(mVar2);
                                                    break;
                                                case 3:
                                                    hVar4.u3((sy0.f) obj18);
                                                    break;
                                                case 4:
                                                    k30.m mVar3 = (k30.m) obj18;
                                                    mVar3.getClass();
                                                    hVar4.b0(mVar3);
                                                    break;
                                                case 5:
                                                    i53.c<k30.o> cVar6 = (i53.c) obj18;
                                                    cVar6.getClass();
                                                    hVar4.D1(cVar6);
                                                    break;
                                                case 6:
                                                    hVar4.N3((Long) obj18);
                                                    break;
                                                case 7:
                                                    hVar4.n3((Long) obj18);
                                                    break;
                                                case 8:
                                                    ActivityListItemDTO activityListItemDTO = (ActivityListItemDTO) obj18;
                                                    activityListItemDTO.getClass();
                                                    hVar4.w4(activityListItemDTO);
                                                    break;
                                                case 9:
                                                    x0 x0Var = (x0) obj18;
                                                    x0Var.getClass();
                                                    hVar4.D0(x0Var);
                                                    break;
                                                default:
                                                    x0 x0Var2 = (x0) obj18;
                                                    x0Var2.getClass();
                                                    hVar4.D0(x0Var2);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    o0VarE.K(lVar18);
                                    obj9 = lVar18;
                                }
                            }
                            obj9 = objQ10;
                            d0.b(cVar5, eVar2, aVar8, (e23.l) obj9, o0VarE, 0);
                            o0VarE.g0(false);
                            o0Var2 = o0VarE;
                        } else if (p005kotlin.jvm.internal.s.g(vVar, v.h.f101833b)) {
                            o0VarE.C(707532208);
                            sy0.f fVar = jVar.f161230e;
                            String str2 = fVar != null ? fVar.f161213c : null;
                            sy0.m mVar2 = jVar.f161231f;
                            boolean z35 = jVar.f161232g;
                            boolean zW3 = hVar4.W3();
                            boolean zI1 = hVar4.I1();
                            int i44 = i37 & 112;
                            boolean z36 = i44 == 32 || ((i37 & 64) != 0 && o0VarE.r(hVar2));
                            Object objQ11 = o0VarE.q();
                            if (z36) {
                                obj5 = objQ11;
                                ew0.r rVar3 = new ew0.r(hVar2, 6);
                                o0VarE.K(rVar3);
                                obj5 = rVar3;
                            } else {
                                aVar6.getClass();
                                if (objQ11 == p3.m.a.f135155b) {
                                    obj5 = objQ11;
                                    ew0.r rVar4 = new ew0.r(hVar2, 6);
                                    o0VarE.K(rVar4);
                                    obj5 = rVar4;
                                }
                            }
                            obj5 = objQ11;
                            e23.a aVar9 = (e23.a) obj5;
                            boolean z37 = ((1879048192 & i37) == 536870912) | (i44 == 32 || ((i37 & 64) != 0 && o0VarE.r(hVar2)));
                            Object objQ12 = o0VarE.q();
                            if (z37) {
                                obj6 = objQ12;
                                i91.c cVar6 = new i91.c(28, aVar2, hVar2);
                                o0VarE.K(cVar6);
                                obj6 = cVar6;
                            } else {
                                aVar6.getClass();
                                if (objQ12 == p3.m.a.f135155b) {
                                    obj6 = objQ12;
                                    i91.c cVar7 = new i91.c(28, aVar2, hVar2);
                                    o0VarE.K(cVar7);
                                    obj6 = cVar7;
                                }
                            }
                            obj6 = objQ12;
                            e23.a aVar10 = (e23.a) obj6;
                            boolean z38 = (i37 & 14) == 4;
                            Object objQ13 = o0VarE.q();
                            if (z38) {
                                obj7 = objQ13;
                                final int i45 = 1;
                                e23.l lVar19 = new e23.l() { // from class: jy0.s
                                    @Override // e23.l
                                    public final Object invoke(Object obj18) {
                                        switch (i45) {
                                            case 0:
                                                String str3 = (String) obj18;
                                                str3.getClass();
                                                hVar4.e2(str3);
                                                break;
                                            case 1:
                                                hVar4.E1(((Boolean) obj18).booleanValue());
                                                break;
                                            case 2:
                                                sy0.m mVar3 = (sy0.m) obj18;
                                                mVar3.getClass();
                                                hVar4.Q1(mVar3);
                                                break;
                                            case 3:
                                                hVar4.u3((sy0.f) obj18);
                                                break;
                                            case 4:
                                                k30.m mVar4 = (k30.m) obj18;
                                                mVar4.getClass();
                                                hVar4.b0(mVar4);
                                                break;
                                            case 5:
                                                i53.c<k30.o> cVar8 = (i53.c) obj18;
                                                cVar8.getClass();
                                                hVar4.D1(cVar8);
                                                break;
                                            case 6:
                                                hVar4.N3((Long) obj18);
                                                break;
                                            case 7:
                                                hVar4.n3((Long) obj18);
                                                break;
                                            case 8:
                                                ActivityListItemDTO activityListItemDTO = (ActivityListItemDTO) obj18;
                                                activityListItemDTO.getClass();
                                                hVar4.w4(activityListItemDTO);
                                                break;
                                            case 9:
                                                x0 x0Var = (x0) obj18;
                                                x0Var.getClass();
                                                hVar4.D0(x0Var);
                                                break;
                                            default:
                                                x0 x0Var2 = (x0) obj18;
                                                x0Var2.getClass();
                                                hVar4.D0(x0Var2);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                o0VarE.K(lVar19);
                                obj7 = lVar19;
                            } else {
                                aVar6.getClass();
                                if (objQ13 == p3.m.a.f135155b) {
                                    obj7 = objQ13;
                                    final int i46 = 1;
                                    e23.l lVar110 = new e23.l() { // from class: jy0.s
                                        @Override // e23.l
                                        public final Object invoke(Object obj18) {
                                            switch (i46) {
                                                case 0:
                                                    String str3 = (String) obj18;
                                                    str3.getClass();
                                                    hVar4.e2(str3);
                                                    break;
                                                case 1:
                                                    hVar4.E1(((Boolean) obj18).booleanValue());
                                                    break;
                                                case 2:
                                                    sy0.m mVar3 = (sy0.m) obj18;
                                                    mVar3.getClass();
                                                    hVar4.Q1(mVar3);
                                                    break;
                                                case 3:
                                                    hVar4.u3((sy0.f) obj18);
                                                    break;
                                                case 4:
                                                    k30.m mVar4 = (k30.m) obj18;
                                                    mVar4.getClass();
                                                    hVar4.b0(mVar4);
                                                    break;
                                                case 5:
                                                    i53.c<k30.o> cVar8 = (i53.c) obj18;
                                                    cVar8.getClass();
                                                    hVar4.D1(cVar8);
                                                    break;
                                                case 6:
                                                    hVar4.N3((Long) obj18);
                                                    break;
                                                case 7:
                                                    hVar4.n3((Long) obj18);
                                                    break;
                                                case 8:
                                                    ActivityListItemDTO activityListItemDTO = (ActivityListItemDTO) obj18;
                                                    activityListItemDTO.getClass();
                                                    hVar4.w4(activityListItemDTO);
                                                    break;
                                                case 9:
                                                    x0 x0Var = (x0) obj18;
                                                    x0Var.getClass();
                                                    hVar4.D0(x0Var);
                                                    break;
                                                default:
                                                    x0 x0Var2 = (x0) obj18;
                                                    x0Var2.getClass();
                                                    hVar4.D0(x0Var2);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    o0VarE.K(lVar110);
                                    obj7 = lVar110;
                                }
                            }
                            obj7 = objQ13;
                            b0.a(str2, mVar2, z35, zW3, zI1, aVar9, aVar10, (e23.l) obj7, o0VarE, 0);
                            o0 o0Var7 = o0VarE;
                            o0Var7.g0(false);
                            o0Var2 = o0Var7;
                        } else if (p005kotlin.jvm.internal.s.g(vVar, v.i.f101834b)) {
                            o0VarE.C(708599879);
                            sy0.m mVar3 = jVar.f161231f;
                            boolean z39 = (i37 & 14) == 4;
                            Object objQ14 = o0VarE.q();
                            if (z39) {
                                obj4 = objQ14;
                                final int i47 = 2;
                                e23.l lVar20 = new e23.l() { // from class: jy0.s
                                    @Override // e23.l
                                    public final Object invoke(Object obj18) {
                                        switch (i47) {
                                            case 0:
                                                String str3 = (String) obj18;
                                                str3.getClass();
                                                hVar4.e2(str3);
                                                break;
                                            case 1:
                                                hVar4.E1(((Boolean) obj18).booleanValue());
                                                break;
                                            case 2:
                                                sy0.m mVar4 = (sy0.m) obj18;
                                                mVar4.getClass();
                                                hVar4.Q1(mVar4);
                                                break;
                                            case 3:
                                                hVar4.u3((sy0.f) obj18);
                                                break;
                                            case 4:
                                                k30.m mVar5 = (k30.m) obj18;
                                                mVar5.getClass();
                                                hVar4.b0(mVar5);
                                                break;
                                            case 5:
                                                i53.c<k30.o> cVar8 = (i53.c) obj18;
                                                cVar8.getClass();
                                                hVar4.D1(cVar8);
                                                break;
                                            case 6:
                                                hVar4.N3((Long) obj18);
                                                break;
                                            case 7:
                                                hVar4.n3((Long) obj18);
                                                break;
                                            case 8:
                                                ActivityListItemDTO activityListItemDTO = (ActivityListItemDTO) obj18;
                                                activityListItemDTO.getClass();
                                                hVar4.w4(activityListItemDTO);
                                                break;
                                            case 9:
                                                x0 x0Var = (x0) obj18;
                                                x0Var.getClass();
                                                hVar4.D0(x0Var);
                                                break;
                                            default:
                                                x0 x0Var2 = (x0) obj18;
                                                x0Var2.getClass();
                                                hVar4.D0(x0Var2);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                o0VarE.K(lVar20);
                                obj4 = lVar20;
                            } else {
                                aVar6.getClass();
                                if (objQ14 == p3.m.a.f135155b) {
                                    obj4 = objQ14;
                                    final int i48 = 2;
                                    e23.l lVar21 = new e23.l() { // from class: jy0.s
                                        @Override // e23.l
                                        public final Object invoke(Object obj18) {
                                            switch (i48) {
                                                case 0:
                                                    String str3 = (String) obj18;
                                                    str3.getClass();
                                                    hVar4.e2(str3);
                                                    break;
                                                case 1:
                                                    hVar4.E1(((Boolean) obj18).booleanValue());
                                                    break;
                                                case 2:
                                                    sy0.m mVar4 = (sy0.m) obj18;
                                                    mVar4.getClass();
                                                    hVar4.Q1(mVar4);
                                                    break;
                                                case 3:
                                                    hVar4.u3((sy0.f) obj18);
                                                    break;
                                                case 4:
                                                    k30.m mVar5 = (k30.m) obj18;
                                                    mVar5.getClass();
                                                    hVar4.b0(mVar5);
                                                    break;
                                                case 5:
                                                    i53.c<k30.o> cVar8 = (i53.c) obj18;
                                                    cVar8.getClass();
                                                    hVar4.D1(cVar8);
                                                    break;
                                                case 6:
                                                    hVar4.N3((Long) obj18);
                                                    break;
                                                case 7:
                                                    hVar4.n3((Long) obj18);
                                                    break;
                                                case 8:
                                                    ActivityListItemDTO activityListItemDTO = (ActivityListItemDTO) obj18;
                                                    activityListItemDTO.getClass();
                                                    hVar4.w4(activityListItemDTO);
                                                    break;
                                                case 9:
                                                    x0 x0Var = (x0) obj18;
                                                    x0Var.getClass();
                                                    hVar4.D0(x0Var);
                                                    break;
                                                default:
                                                    x0 x0Var2 = (x0) obj18;
                                                    x0Var2.getClass();
                                                    hVar4.D0(x0Var2);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    o0VarE.K(lVar21);
                                    obj4 = lVar21;
                                }
                            }
                            obj4 = objQ14;
                            c0.a(mVar3, (e23.l) obj4, o0VarE, 0);
                            o0VarE.g0(false);
                            o0Var2 = o0VarE;
                        } else {
                            if (p005kotlin.jvm.internal.s.g(vVar, v.d.f101829b)) {
                                o0VarE.C(708916451);
                                sy0.f fVar2 = jVar.f161230e;
                                boolean z44 = (i37 & 14) == 4;
                                Object objQ15 = o0VarE.q();
                                if (z44) {
                                    obj3 = objQ15;
                                    final int i49 = 3;
                                    e23.l lVar22 = new e23.l() { // from class: jy0.s
                                        @Override // e23.l
                                        public final Object invoke(Object obj18) {
                                            switch (i49) {
                                                case 0:
                                                    String str3 = (String) obj18;
                                                    str3.getClass();
                                                    hVar4.e2(str3);
                                                    break;
                                                case 1:
                                                    hVar4.E1(((Boolean) obj18).booleanValue());
                                                    break;
                                                case 2:
                                                    sy0.m mVar4 = (sy0.m) obj18;
                                                    mVar4.getClass();
                                                    hVar4.Q1(mVar4);
                                                    break;
                                                case 3:
                                                    hVar4.u3((sy0.f) obj18);
                                                    break;
                                                case 4:
                                                    k30.m mVar5 = (k30.m) obj18;
                                                    mVar5.getClass();
                                                    hVar4.b0(mVar5);
                                                    break;
                                                case 5:
                                                    i53.c<k30.o> cVar8 = (i53.c) obj18;
                                                    cVar8.getClass();
                                                    hVar4.D1(cVar8);
                                                    break;
                                                case 6:
                                                    hVar4.N3((Long) obj18);
                                                    break;
                                                case 7:
                                                    hVar4.n3((Long) obj18);
                                                    break;
                                                case 8:
                                                    ActivityListItemDTO activityListItemDTO = (ActivityListItemDTO) obj18;
                                                    activityListItemDTO.getClass();
                                                    hVar4.w4(activityListItemDTO);
                                                    break;
                                                case 9:
                                                    x0 x0Var = (x0) obj18;
                                                    x0Var.getClass();
                                                    hVar4.D0(x0Var);
                                                    break;
                                                default:
                                                    x0 x0Var2 = (x0) obj18;
                                                    x0Var2.getClass();
                                                    hVar4.D0(x0Var2);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    o0VarE.K(lVar22);
                                    obj3 = lVar22;
                                } else {
                                    aVar6.getClass();
                                    if (objQ15 == p3.m.a.f135155b) {
                                        obj3 = objQ15;
                                        final int i410 = 3;
                                        e23.l lVar23 = new e23.l() { // from class: jy0.s
                                            @Override // e23.l
                                            public final Object invoke(Object obj18) {
                                                switch (i410) {
                                                    case 0:
                                                        String str3 = (String) obj18;
                                                        str3.getClass();
                                                        hVar4.e2(str3);
                                                        break;
                                                    case 1:
                                                        hVar4.E1(((Boolean) obj18).booleanValue());
                                                        break;
                                                    case 2:
                                                        sy0.m mVar4 = (sy0.m) obj18;
                                                        mVar4.getClass();
                                                        hVar4.Q1(mVar4);
                                                        break;
                                                    case 3:
                                                        hVar4.u3((sy0.f) obj18);
                                                        break;
                                                    case 4:
                                                        k30.m mVar5 = (k30.m) obj18;
                                                        mVar5.getClass();
                                                        hVar4.b0(mVar5);
                                                        break;
                                                    case 5:
                                                        i53.c<k30.o> cVar8 = (i53.c) obj18;
                                                        cVar8.getClass();
                                                        hVar4.D1(cVar8);
                                                        break;
                                                    case 6:
                                                        hVar4.N3((Long) obj18);
                                                        break;
                                                    case 7:
                                                        hVar4.n3((Long) obj18);
                                                        break;
                                                    case 8:
                                                        ActivityListItemDTO activityListItemDTO = (ActivityListItemDTO) obj18;
                                                        activityListItemDTO.getClass();
                                                        hVar4.w4(activityListItemDTO);
                                                        break;
                                                    case 9:
                                                        x0 x0Var = (x0) obj18;
                                                        x0Var.getClass();
                                                        hVar4.D0(x0Var);
                                                        break;
                                                    default:
                                                        x0 x0Var2 = (x0) obj18;
                                                        x0Var2.getClass();
                                                        hVar4.D0(x0Var2);
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        o0VarE.K(lVar23);
                                        obj3 = lVar23;
                                    }
                                }
                                obj3 = objQ15;
                                i.b(cVar, fVar2, (e23.l) obj3, o0VarE, (i37 >> 24) & 14);
                                o0VarE.g0(false);
                                o0Var2 = o0VarE;
                            } else if (p005kotlin.jvm.internal.s.g(vVar, v.c.f101828b)) {
                                o0VarE.C(709266224);
                                int i54 = i37 & 14;
                                boolean z45 = i54 == 4;
                                Object objQ16 = o0VarE.q();
                                if (z45) {
                                    i16 = 4;
                                    e23.l lVar24 = new e23.l() { // from class: jy0.s
                                        @Override // e23.l
                                        public final Object invoke(Object obj18) {
                                            switch (i16) {
                                                case 0:
                                                    String str3 = (String) obj18;
                                                    str3.getClass();
                                                    hVar4.e2(str3);
                                                    break;
                                                case 1:
                                                    hVar4.E1(((Boolean) obj18).booleanValue());
                                                    break;
                                                case 2:
                                                    sy0.m mVar4 = (sy0.m) obj18;
                                                    mVar4.getClass();
                                                    hVar4.Q1(mVar4);
                                                    break;
                                                case 3:
                                                    hVar4.u3((sy0.f) obj18);
                                                    break;
                                                case 4:
                                                    k30.m mVar5 = (k30.m) obj18;
                                                    mVar5.getClass();
                                                    hVar4.b0(mVar5);
                                                    break;
                                                case 5:
                                                    i53.c<k30.o> cVar8 = (i53.c) obj18;
                                                    cVar8.getClass();
                                                    hVar4.D1(cVar8);
                                                    break;
                                                case 6:
                                                    hVar4.N3((Long) obj18);
                                                    break;
                                                case 7:
                                                    hVar4.n3((Long) obj18);
                                                    break;
                                                case 8:
                                                    ActivityListItemDTO activityListItemDTO = (ActivityListItemDTO) obj18;
                                                    activityListItemDTO.getClass();
                                                    hVar4.w4(activityListItemDTO);
                                                    break;
                                                case 9:
                                                    x0 x0Var = (x0) obj18;
                                                    x0Var.getClass();
                                                    hVar4.D0(x0Var);
                                                    break;
                                                default:
                                                    x0 x0Var2 = (x0) obj18;
                                                    x0Var2.getClass();
                                                    hVar4.D0(x0Var2);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    o0VarE.K(lVar24);
                                    obj = lVar24;
                                } else {
                                    aVar6.getClass();
                                    if (objQ16 == p3.m.a.f135155b) {
                                        i16 = 4;
                                        e23.l lVar25 = new e23.l() { // from class: jy0.s
                                            @Override // e23.l
                                            public final Object invoke(Object obj18) {
                                                switch (i16) {
                                                    case 0:
                                                        String str3 = (String) obj18;
                                                        str3.getClass();
                                                        hVar4.e2(str3);
                                                        break;
                                                    case 1:
                                                        hVar4.E1(((Boolean) obj18).booleanValue());
                                                        break;
                                                    case 2:
                                                        sy0.m mVar4 = (sy0.m) obj18;
                                                        mVar4.getClass();
                                                        hVar4.Q1(mVar4);
                                                        break;
                                                    case 3:
                                                        hVar4.u3((sy0.f) obj18);
                                                        break;
                                                    case 4:
                                                        k30.m mVar5 = (k30.m) obj18;
                                                        mVar5.getClass();
                                                        hVar4.b0(mVar5);
                                                        break;
                                                    case 5:
                                                        i53.c<k30.o> cVar8 = (i53.c) obj18;
                                                        cVar8.getClass();
                                                        hVar4.D1(cVar8);
                                                        break;
                                                    case 6:
                                                        hVar4.N3((Long) obj18);
                                                        break;
                                                    case 7:
                                                        hVar4.n3((Long) obj18);
                                                        break;
                                                    case 8:
                                                        ActivityListItemDTO activityListItemDTO = (ActivityListItemDTO) obj18;
                                                        activityListItemDTO.getClass();
                                                        hVar4.w4(activityListItemDTO);
                                                        break;
                                                    case 9:
                                                        x0 x0Var = (x0) obj18;
                                                        x0Var.getClass();
                                                        hVar4.D0(x0Var);
                                                        break;
                                                    default:
                                                        x0 x0Var2 = (x0) obj18;
                                                        x0Var2.getClass();
                                                        hVar4.D0(x0Var2);
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        o0VarE.K(lVar25);
                                        obj = lVar25;
                                    } else {
                                        i16 = 4;
                                        obj = objQ16;
                                    }
                                }
                                e23.l lVar26 = (e23.l) obj;
                                boolean z46 = i54 == i16;
                                Object objQ17 = o0VarE.q();
                                if (z46) {
                                    obj2 = objQ17;
                                    final int i55 = 5;
                                    e23.l lVar27 = new e23.l() { // from class: jy0.s
                                        @Override // e23.l
                                        public final Object invoke(Object obj18) {
                                            switch (i55) {
                                                case 0:
                                                    String str3 = (String) obj18;
                                                    str3.getClass();
                                                    hVar4.e2(str3);
                                                    break;
                                                case 1:
                                                    hVar4.E1(((Boolean) obj18).booleanValue());
                                                    break;
                                                case 2:
                                                    sy0.m mVar4 = (sy0.m) obj18;
                                                    mVar4.getClass();
                                                    hVar4.Q1(mVar4);
                                                    break;
                                                case 3:
                                                    hVar4.u3((sy0.f) obj18);
                                                    break;
                                                case 4:
                                                    k30.m mVar5 = (k30.m) obj18;
                                                    mVar5.getClass();
                                                    hVar4.b0(mVar5);
                                                    break;
                                                case 5:
                                                    i53.c<k30.o> cVar8 = (i53.c) obj18;
                                                    cVar8.getClass();
                                                    hVar4.D1(cVar8);
                                                    break;
                                                case 6:
                                                    hVar4.N3((Long) obj18);
                                                    break;
                                                case 7:
                                                    hVar4.n3((Long) obj18);
                                                    break;
                                                case 8:
                                                    ActivityListItemDTO activityListItemDTO = (ActivityListItemDTO) obj18;
                                                    activityListItemDTO.getClass();
                                                    hVar4.w4(activityListItemDTO);
                                                    break;
                                                case 9:
                                                    x0 x0Var = (x0) obj18;
                                                    x0Var.getClass();
                                                    hVar4.D0(x0Var);
                                                    break;
                                                default:
                                                    x0 x0Var2 = (x0) obj18;
                                                    x0Var2.getClass();
                                                    hVar4.D0(x0Var2);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    o0VarE.K(lVar27);
                                    obj2 = lVar27;
                                } else {
                                    aVar6.getClass();
                                    if (objQ17 == p3.m.a.f135155b) {
                                        obj2 = objQ17;
                                        final int i56 = 5;
                                        e23.l lVar28 = new e23.l() { // from class: jy0.s
                                            @Override // e23.l
                                            public final Object invoke(Object obj18) {
                                                switch (i56) {
                                                    case 0:
                                                        String str3 = (String) obj18;
                                                        str3.getClass();
                                                        hVar4.e2(str3);
                                                        break;
                                                    case 1:
                                                        hVar4.E1(((Boolean) obj18).booleanValue());
                                                        break;
                                                    case 2:
                                                        sy0.m mVar4 = (sy0.m) obj18;
                                                        mVar4.getClass();
                                                        hVar4.Q1(mVar4);
                                                        break;
                                                    case 3:
                                                        hVar4.u3((sy0.f) obj18);
                                                        break;
                                                    case 4:
                                                        k30.m mVar5 = (k30.m) obj18;
                                                        mVar5.getClass();
                                                        hVar4.b0(mVar5);
                                                        break;
                                                    case 5:
                                                        i53.c<k30.o> cVar8 = (i53.c) obj18;
                                                        cVar8.getClass();
                                                        hVar4.D1(cVar8);
                                                        break;
                                                    case 6:
                                                        hVar4.N3((Long) obj18);
                                                        break;
                                                    case 7:
                                                        hVar4.n3((Long) obj18);
                                                        break;
                                                    case 8:
                                                        ActivityListItemDTO activityListItemDTO = (ActivityListItemDTO) obj18;
                                                        activityListItemDTO.getClass();
                                                        hVar4.w4(activityListItemDTO);
                                                        break;
                                                    case 9:
                                                        x0 x0Var = (x0) obj18;
                                                        x0Var.getClass();
                                                        hVar4.D0(x0Var);
                                                        break;
                                                    default:
                                                        x0 x0Var2 = (x0) obj18;
                                                        x0Var2.getClass();
                                                        hVar4.D0(x0Var2);
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        o0VarE.K(lVar28);
                                        obj2 = lVar28;
                                    }
                                }
                                obj2 = objQ17;
                                nVar = nVar;
                                k.a(nVar, lVar26, (e23.l) obj2, o0VarE, (i37 >> 21) & 14);
                                o0VarE.g0(false);
                                o0Var4 = o0VarE;
                            } else {
                                nVar = nVar;
                                o0VarE.C(709610045);
                                o0VarE.g0(false);
                                o0Var4 = o0VarE;
                            }
                            z15 = true;
                            o0Var3 = o0Var4;
                        }
                    }
                    nVar = nVar;
                    o0Var4 = o0Var2;
                    z15 = true;
                    o0Var3 = o0Var4;
                }
                o0Var3.g0(z15);
                o0Var = o0Var3;
            }
            aVar2 = aVar;
            o0Var4 = o0VarE;
            z15 = true;
            o0Var3 = o0Var4;
            o0Var3.g0(z15);
            o0Var = o0Var3;
        } else {
            nVar = nVar;
            aVar2 = aVar;
            o0VarE.e();
            o0Var = o0VarE;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new s4(hVar4, hVar2, vVar, jVar, gVar, bVar, lVar, nVar, cVar, aVar2, i14);
        }
    }

    public static final void c(int i14, p3.m mVar, int i15) {
        o0 o0VarE = mVar.E(1836054038);
        int i16 = (o0VarE.k(i14) ? 4 : 2) | i15;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            if (i14 > 0) {
                o0VarE.C(1477419819);
                h4.r.a aVar = h4.r.S;
                h4.r rVarF = x2.f(aVar, 1.0f);
                d92.b.f58623a.getClass();
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar = j92.b.f97899b;
                float f14 = eVar.f97920e;
                bVar.getClass();
                float f15 = eVar.f97918c;
                bVar.getClass();
                h4.r rVarC = c2.l.C(rVarF, f15, f14, eVar.f97918c, 0.0f, 8);
                h4.d.f81522a.getClass();
                h4.g.b bVar2 = h4.d.a.f81534l;
                c2.j.f22691a.getClass();
                s2 s2VarA = q2.a(c2.j.f22692b, bVar2, o0VarE, 48);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
                h5.g.V.getClass();
                h5.e0.a aVar2 = h5.g.a.f81805b;
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
                b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                h5.g.a.b bVar3 = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                }
                b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
                u2 u2Var = u2.f22900a;
                h4.r rVarF2 = x2.f(aVar, 1.0f);
                gl.c.f77766a.getClass();
                f1.j(rVarF2, 0, false, gl.c.a(o0VarE).f(), i14 * 20.0f, 0.0f, 0.0f, o0VarE, 6, 102);
                o0VarE.g0(true);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1477912812);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ba2.e(i14, i15, 5);
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
    public static final void d(l lVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        boolean z14;
        lVar = lVar;
        e23.a<Unit> aVar2 = aVar;
        lVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-1200554710);
        int i16 = i14 | (o0VarE.B(lVar) ? 4 : 2) | (o0VarE.r(aVar2) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(lVar.f101749h, o0VarE);
            p1 p1VarC2 = s9.c.c(lVar.f101753l, o0VarE);
            p1 p1VarC3 = s9.c.c(lVar.f101751j, o0VarE);
            p1 p1VarC4 = s9.c.c(lVar.f101755n, o0VarE);
            p1 p1VarC5 = s9.c.c(lVar.f101756o, o0VarE);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            int i17 = 12;
            if (objQ2 == c2565a) {
                objQ2 = new v2(p1Var, i17);
                o0VarE.K(objQ2);
            }
            e23.l lVar2 = (e23.l) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p1 p1Var2 = (p1) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ4);
            }
            p1 p1Var3 = (p1) objQ4;
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = p0.n(null);
                o0VarE.K(objQ5);
            }
            p1 p1Var4 = (p1) objQ5;
            Object objQ6 = o0VarE.q();
            int i18 = 13;
            if (objQ6 == c2565a) {
                objQ6 = new v2(p1Var4, i18);
                o0VarE.K(objQ6);
            }
            e23.l lVar3 = (e23.l) objQ6;
            c12.h.b bVar = new c12.h.b(v.f.f101831b, null, null, 6, null);
            Object[] objArr = new Object[0];
            int i19 = c12.h.f22556c;
            d4.l lVarB = d4.a.b(d.f101821a, e.f101822a);
            boolean zR = o0VarE.r(bVar);
            Object objQ7 = o0VarE.q();
            if (zR || objQ7 == c2565a) {
                objQ7 = new f(bVar);
                o0VarE.K(objQ7);
            }
            c12.h hVar = (c12.h) d4.a.c(objArr, lVarB, (e23.a) objQ7, o0VarE, 0);
            jl1.a aVar3 = new jl1.a(12);
            t tVar = new t(p1VarC3, 0);
            boolean zR2 = o0VarE.r(hVar);
            Object objQ8 = o0VarE.q();
            if (zR2 || objQ8 == c2565a) {
                objQ8 = new i20.b(24, hVar, p1Var2);
                o0VarE.K(objQ8);
            }
            jy0.a.f101670a.getClass();
            int i24 = i16 & 112;
            int i25 = 13;
            c12.g.a(hVar, aVar, null, aVar3, tVar, (e23.p) objQ8, jy0.a.f101671b, z3.f.c(1739367813, new ak0.h(lVar, lVar3, lVar2, aVar2, p1VarC, p1VarC2, 12), o0VarE), ((Boolean) p1Var.getF182175a()).booleanValue(), z3.f.c(97201268, new a42.g0(lVar, lVar2, p1VarC, p1VarC2, p1VarC3, p1VarC4, p1VarC5, p1Var3), o0VarE), o0VarE, 819462144 | c12.h.f22556c | i24, 4);
            aVar2 = aVar;
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                o0VarE.C(-1527013732);
                c1 c1Var = c1.f110940a;
                c22.x0.f23314a.getClass();
                String strW = gl1.d.W(c22.x0.f23526ma);
                String strW2 = gl1.d.W(c22.x0.f23543na);
                String strQ = gl1.y.Q(o0VarE, R.string.lbl_exit_setup);
                boolean z15 = i24 == 32;
                Object objQ9 = o0VarE.q();
                if (z15 || objQ9 == c2565a) {
                    objQ9 = new j22.d(aVar2, i25);
                    o0VarE.K(objQ9);
                }
                e23.a<Unit> aVar4 = (e23.a) objQ9;
                String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_cancel);
                Object objQ10 = o0VarE.q();
                if (objQ10 == c2565a) {
                    objQ10 = new jt1.h(p1Var2, 8);
                    o0VarE.K(objQ10);
                }
                i15 = 2;
                c1Var.a(false, strW, strW2, null, null, strQ, false, false, aVar4, strQ2, (e23.a) objQ10, o0VarE, 0, 6, 217);
                z14 = false;
                o0VarE.g0(false);
            } else {
                i15 = 2;
                z14 = false;
                o0VarE.C(-1526587048);
                o0VarE.g0(false);
            }
            if (((cy0.e) r28.getF182175a()) != null) {
                o0VarE.C(-1526512989);
                cy0.e eVar = (cy0.e) r28.getF182175a();
                int i26 = eVar == null ? -1 : g.f101824a[eVar.ordinal()];
                if (i26 == 1) {
                    o0VarE.C(-1526446587);
                    c1 c1Var2 = c1.f110940a;
                    c22.x0.f23314a.getClass();
                    String strW3 = gl1.d.W(c22.x0.f23428gb);
                    String strW4 = gl1.d.W(c22.x0.f23444hb);
                    String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_ok);
                    Object objQ11 = o0VarE.q();
                    if (objQ11 == r15) {
                        objQ11 = new jt1.h(r28, 9);
                        o0VarE.K(objQ11);
                    }
                    c1Var2.a(false, strW3, strW4, null, null, strQ3, false, false, (e23.a) objQ11, null, null, o0VarE, 100663296, 0, 1753);
                    o0VarE.g0(z14);
                    Unit unit = Unit.INSTANCE;
                } else if (i26 != i15) {
                    o0VarE.C(-1525674346);
                    o0VarE.g0(z14);
                    Unit unit2 = Unit.INSTANCE;
                } else {
                    o0VarE.C(-1525989337);
                    c1 c1Var3 = c1.f110940a;
                    c22.x0.f23314a.getClass();
                    String strW5 = gl1.d.W(c22.x0.f23576pa);
                    String strQ4 = gl1.y.Q(o0VarE, R.string.lbl_ok);
                    Object objQ12 = o0VarE.q();
                    if (objQ12 == c2565a) {
                        objQ12 = new jt1.h(p1Var4, 11);
                        o0VarE.K(objQ12);
                    }
                    c1Var3.a(false, null, strW5, null, null, strQ4, false, false, (e23.a) objQ12, null, null, o0VarE, 100663296, 0, 1755);
                    o0VarE.g0(z14);
                    Unit unit3 = Unit.INSTANCE;
                }
                o0VarE.g0(z14);
            } else {
                o0VarE.C(-1525656552);
                o0VarE.g0(z14);
            }
            if (((Boolean) r16.getF182175a()).booleanValue()) {
                o0VarE.C(-1525611695);
                c1 c1Var4 = c1.f110940a;
                String strQ5 = gl1.y.Q(o0VarE, R.string.multi_day_activities_child_epic_privacy_header);
                String strQ6 = gl1.y.Q(o0VarE, R.string.multi_day_activities_child_epic_privacy_body);
                String strQ7 = gl1.y.Q(o0VarE, R.string.lbl_ok);
                Object objQ13 = o0VarE.q();
                if (objQ13 == r15) {
                    objQ13 = new jt1.h(p1Var3, 12);
                    o0VarE.K(objQ13);
                }
                c1Var4.a(false, strQ5, strQ6, null, null, strQ7, false, false, (e23.a) objQ13, null, null, o0VarE, 100663296, 0, 1753);
                o0VarE.g0(z14);
            } else {
                o0VarE.C(-1525266696);
                o0VarE.g0(z14);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i20.b(lVar, aVar2, i14, 23);
        }
    }
}
