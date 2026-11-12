package ot1;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.widget.Toast;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.R;
import et1.q2;
import i3.fe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.t1;
import kotlin.t3;
import lc.m0;
import lc.q0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.l0;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;
import pt1.a0;
import vs1.h0;
import vs1.i0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\n²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002"}, d2 = {"Lot1/y;", "Lot1/a;", "<init>", "()V", "Lpt1/a0;", "userReviews", "Lpt1/l;", "submitReviewState", "", "wasAnyReviewEditedOrDeletedState", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y extends ot1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f133845a = new y();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.navigation.routes.UserTrailReviewsRoute$Content$23$1", f = "UserTrailReviewsRoute.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ qt1.k f133846a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f133847b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(qt1.k kVar, Context context, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f133846a = kVar;
            this.f133847b = context;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f133846a, this.f133847b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            qt1.k kVar = this.f133846a;
            kVar.getClass();
            Context context = this.f133847b;
            context.getClass();
            h0 h0Var = kVar.f147686w;
            h0Var.getClass();
            ge1.b.T(h0Var.f179811a, null, null, new i0(h0Var, false, context, null), 3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.navigation.routes.UserTrailReviewsRoute$Content$24$1", f = "UserTrailReviewsRoute.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x3<a0> f133848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c.q<String, Unit> f133849b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x3<a0> x3Var, c.q<String, Unit> qVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f133848a = x3Var;
            this.f133849b = qVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f133848a, this.f133849b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            y yVar = y.f133845a;
            String str = this.f133848a.getF182175a().f140808f;
            if (str != null) {
                this.f133849b.a(str, null);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.navigation.routes.UserTrailReviewsRoute$Content$25$1", f = "UserTrailReviewsRoute.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f133850a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<Boolean> f133851b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Activity activity, x3<Boolean> x3Var, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f133850a = activity;
            this.f133851b = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f133850a, this.f133851b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Activity activity;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            y yVar = y.f133845a;
            if (this.f133851b.getF182175a().booleanValue() && (activity = this.f133850a) != null) {
                activity.setResult(-1);
            }
            return Unit.INSTANCE;
        }
    }

    private y() {
    }

    public static void e(int i14, c.q qVar, c.q qVar2) {
        if (i14 > 1) {
            qVar.a(f.k.a(g.e.d.f74074a, i14, 12), null);
        } else {
            qVar2.a(f.k.a(g.e.d.f74074a, 0, 14), null);
        }
    }

    public static void f(List list, Context context, qt1.k kVar) {
        ContentResolver contentResolver;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (uri != null) {
                if (Build.VERSION.SDK_INT > 29 && (contentResolver = context.getContentResolver()) != null) {
                    contentResolver.takePersistableUriPermission(uri, 1);
                }
                String string = uri.toString();
                string.getClass();
                arrayList.add(new bq0.k(uri, string, "jpg", 0.0d));
            } else {
                Toast.makeText(context, R.string.social_upload_failed_message, 0).show();
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        int i14 = 0;
        for (Object obj : arrayList) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                p13.x.q();
                throw null;
            }
            bq0.k kVar2 = (bq0.k) obj;
            kVar2.getClass();
            String string2 = kVar2.f19509a.toString();
            string2.getClass();
            arrayList2.add(new pt1.u(string2, null, kVar2.f19511c, kVar2.f19510b, kVar2.f19512d, i14, false, 66, null));
            i14 = i15;
        }
        ge1.b.T(v1.a(kVar), null, null, new qt1.j(kVar, arrayList2, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0292  */
    /* JADX WARN: Code duplicated, block: B:103:0x0299  */
    /* JADX WARN: Code duplicated, block: B:106:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:108:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:111:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:113:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:116:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:118:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:121:0x0313  */
    /* JADX WARN: Code duplicated, block: B:124:0x031d  */
    /* JADX WARN: Code duplicated, block: B:128:0x0336  */
    /* JADX WARN: Code duplicated, block: B:130:0x033d  */
    /* JADX WARN: Code duplicated, block: B:133:0x0353  */
    /* JADX WARN: Code duplicated, block: B:135:0x035a  */
    /* JADX WARN: Code duplicated, block: B:138:0x0378  */
    /* JADX WARN: Code duplicated, block: B:140:0x037f  */
    /* JADX WARN: Code duplicated, block: B:143:0x0395  */
    /* JADX WARN: Code duplicated, block: B:145:0x039c  */
    /* JADX WARN: Code duplicated, block: B:148:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:150:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:153:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:155:0x03da  */
    /* JADX WARN: Code duplicated, block: B:158:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:160:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:163:0x045c  */
    /* JADX WARN: Code duplicated, block: B:165:0x0463  */
    /* JADX WARN: Code duplicated, block: B:168:0x0489  */
    /* JADX WARN: Code duplicated, block: B:170:0x0490  */
    /* JADX WARN: Code duplicated, block: B:173:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:175:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:36:0x0096  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:51:0x011c  */
    /* JADX WARN: Code duplicated, block: B:61:0x016e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0175  */
    /* JADX WARN: Code duplicated, block: B:66:0x018c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0193  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:78:0x01de  */
    /* JADX WARN: Code duplicated, block: B:81:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:83:0x0203  */
    /* JADX WARN: Code duplicated, block: B:86:0x0221  */
    /* JADX WARN: Code duplicated, block: B:88:0x0228  */
    /* JADX WARN: Code duplicated, block: B:91:0x0240  */
    /* JADX WARN: Code duplicated, block: B:93:0x0247  */
    /* JADX WARN: Code duplicated, block: B:96:0x0267  */
    /* JADX WARN: Code duplicated, block: B:98:0x026e  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ot1.a
    public final void a(lc.v vVar, m0 m0Var, fe feVar, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        c.q qVar;
        boolean zR;
        Object objQ;
        boolean zR2;
        Object objQ2;
        boolean zR3;
        Object objQ3;
        boolean zR4;
        Object objQ4;
        boolean zR5;
        Object objQ5;
        boolean zR6;
        Object objQ6;
        boolean zR7;
        Object objQ7;
        boolean zR8;
        Object objQ8;
        boolean zR9;
        Object objQ9;
        boolean zR10;
        Object objQ10;
        e23.p pVar;
        boolean zR11;
        Object objQ11;
        boolean zR12;
        Object objQ12;
        boolean zR13;
        Object objQ13;
        e23.p pVar2;
        boolean zR14;
        Object objQ14;
        boolean zR15;
        Object objQ15;
        boolean zR16;
        Object objQ16;
        boolean zR17;
        Object objQ17;
        boolean zR18;
        Object objQ18;
        boolean zR19;
        Object objQ19;
        boolean zR20;
        Object objQ20;
        c.q qVar2;
        boolean zR21;
        Object objQ21;
        boolean zB;
        Object objQ22;
        boolean zB2;
        Object objQ23;
        o0 o0VarQ = androidx.room.a0.q(vVar, m0Var, mVar, 1252381249);
        if ((i14 & 6) == 0) {
            i15 = (o0VarQ.r(vVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarQ.r(m0Var) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarQ.B(feVar) ? 256 : 128;
        }
        if (o0VarQ.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            if (feVar == null) {
                vb.h.s("Snackbar host state must be passed to user trail reviews route");
                return;
            }
            Context context = (Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b);
            Activity activity = (Activity) o0VarQ.A(c.n.f22332a);
            qt1.k kVarE0 = gl1.d.e0(vVar, o0VarQ);
            p1 p1VarC = s9.c.c(kVarE0.E, o0VarQ);
            p1 p1VarC2 = s9.c.c(kVarE0.B, o0VarQ);
            p1 p1VarC3 = s9.c.c(kVarE0.F, o0VarQ);
            nt1.g gVar = new nt1.g();
            boolean zR22 = o0VarQ.r(kVarE0);
            Object objQ24 = o0VarQ.q();
            int i16 = 14;
            p3.m.a aVar = p3.m.f135153a;
            if (zR22) {
                objQ24 = new j(kVarE0, i16);
                o0VarQ.K(objQ24);
            } else {
                aVar.getClass();
                if (objQ24 == p3.m.a.f135155b) {
                    objQ24 = new j(kVarE0, i16);
                    o0VarQ.K(objQ24);
                }
            }
            c.q qVarC = c.w.c(gVar, (e23.l) objQ24, o0VarQ, 0);
            g.d dVar = new g.d(0, 1, null);
            boolean zR23 = o0VarQ.r(context) | o0VarQ.r(kVarE0);
            Object objQ25 = o0VarQ.q();
            if (zR23) {
                objQ25 = new p(context, kVarE0, 14);
                o0VarQ.K(objQ25);
            } else {
                aVar.getClass();
                if (objQ25 == p3.m.a.f135155b) {
                    objQ25 = new p(context, kVarE0, 14);
                    o0VarQ.K(objQ25);
                }
            }
            c.q qVarC2 = c.w.c(dVar, (e23.l) objQ25, o0VarQ, 0);
            g.e eVar = new g.e();
            boolean zR24 = o0VarQ.r(context) | o0VarQ.r(kVarE0);
            Object objQ26 = o0VarQ.q();
            int i17 = 15;
            if (zR24) {
                objQ26 = new p(context, kVarE0, i17);
                o0VarQ.K(objQ26);
            } else {
                aVar.getClass();
                if (objQ26 == p3.m.a.f135155b) {
                    objQ26 = new p(context, kVarE0, i17);
                    o0VarQ.K(objQ26);
                }
            }
            c.q qVarC3 = c.w.c(eVar, (e23.l) objQ26, o0VarQ, 0);
            g.f fVar = new g.f();
            boolean zR25 = o0VarQ.r(qVarC2) | o0VarQ.r(qVarC3);
            Object objQ27 = o0VarQ.q();
            if (zR25) {
                objQ27 = new s(1, qVarC2, qVarC3);
                o0VarQ.K(objQ27);
            } else {
                aVar.getClass();
                if (objQ27 == p3.m.a.f135155b) {
                    objQ27 = new s(1, qVarC2, qVarC3);
                    o0VarQ.K(objQ27);
                }
            }
            c.q qVarC4 = c.w.c(fVar, (e23.l) objQ27, o0VarQ, 0);
            t3 t3Var = (t3) o0VarQ.A(t1.f91501s);
            a0 a0Var = (a0) p1VarC.getF182175a();
            pt1.l lVar = (pt1.l) p1VarC2.getF182175a();
            boolean zR26 = o0VarQ.r(kVarE0);
            Object objQ28 = o0VarQ.q();
            if (zR26) {
                qVar = qVarC;
            } else {
                aVar.getClass();
                qVar = qVarC;
                if (objQ28 == p3.m.a.f135155b) {
                }
                e23.l lVar2 = (e23.l) objQ28;
                zR = o0VarQ.r(m0Var);
                objQ = o0VarQ.q();
                if (zR) {
                    objQ = new nk0.h(m0Var, 7);
                    o0VarQ.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new nk0.h(m0Var, 7);
                        o0VarQ.K(objQ);
                    }
                }
                e23.q qVar3 = (e23.q) objQ;
                zR2 = o0VarQ.r(kVarE0);
                objQ2 = o0VarQ.q();
                if (zR2) {
                    objQ2 = new q(kVarE0, 2);
                    o0VarQ.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new q(kVarE0, 2);
                        o0VarQ.K(objQ2);
                    }
                }
                e23.p pVar3 = (e23.p) objQ2;
                zR3 = o0VarQ.r(kVarE0) | o0VarQ.r(context);
                objQ3 = o0VarQ.q();
                if (zR3) {
                    objQ3 = new p(kVarE0, context, 17);
                    o0VarQ.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new p(kVarE0, context, 17);
                        o0VarQ.K(objQ3);
                    }
                }
                e23.l lVar3 = (e23.l) objQ3;
                zR4 = o0VarQ.r(kVarE0) | o0VarQ.r(context);
                objQ4 = o0VarQ.q();
                if (zR4) {
                    objQ4 = new p(kVarE0, context, 18);
                    o0VarQ.K(objQ4);
                } else {
                    aVar.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new p(kVarE0, context, 18);
                        o0VarQ.K(objQ4);
                    }
                }
                e23.l lVar4 = (e23.l) objQ4;
                zR5 = o0VarQ.r(kVarE0) | o0VarQ.r(context);
                objQ5 = o0VarQ.q();
                if (zR5) {
                    objQ5 = new p(kVarE0, context, 19);
                    o0VarQ.K(objQ5);
                } else {
                    aVar.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = new p(kVarE0, context, 19);
                        o0VarQ.K(objQ5);
                    }
                }
                e23.l lVar5 = (e23.l) objQ5;
                zR6 = o0VarQ.r(kVarE0) | o0VarQ.r(context);
                objQ6 = o0VarQ.q();
                if (zR6) {
                    objQ6 = new p(kVarE0, context, 16);
                    o0VarQ.K(objQ6);
                } else {
                    aVar.getClass();
                    if (objQ6 == p3.m.a.f135155b) {
                        objQ6 = new p(kVarE0, context, 16);
                        o0VarQ.K(objQ6);
                    }
                }
                e23.l lVar6 = (e23.l) objQ6;
                zR7 = o0VarQ.r(kVarE0);
                objQ7 = o0VarQ.q();
                if (zR7) {
                    objQ7 = new j(kVarE0, 16);
                    o0VarQ.K(objQ7);
                } else {
                    aVar.getClass();
                    if (objQ7 == p3.m.a.f135155b) {
                        objQ7 = new j(kVarE0, 16);
                        o0VarQ.K(objQ7);
                    }
                }
                e23.l lVar7 = (e23.l) objQ7;
                zR8 = o0VarQ.r(kVarE0) | o0VarQ.r(context);
                objQ8 = o0VarQ.q();
                if (zR8) {
                    objQ8 = new p(kVarE0, context, 20);
                    o0VarQ.K(objQ8);
                } else {
                    aVar.getClass();
                    if (objQ8 == p3.m.a.f135155b) {
                        objQ8 = new p(kVarE0, context, 20);
                        o0VarQ.K(objQ8);
                    }
                }
                e23.l lVar8 = (e23.l) objQ8;
                zR9 = o0VarQ.r(qVarC2) | o0VarQ.r(qVarC3) | o0VarQ.r(qVarC4);
                objQ9 = o0VarQ.q();
                if (zR9) {
                    objQ9 = new r(qVarC2, qVarC3, qVarC4, 1);
                    o0VarQ.K(objQ9);
                } else {
                    aVar.getClass();
                    if (objQ9 == p3.m.a.f135155b) {
                        objQ9 = new r(qVarC2, qVarC3, qVarC4, 1);
                        o0VarQ.K(objQ9);
                    }
                }
                e23.l lVar9 = (e23.l) objQ9;
                zR10 = o0VarQ.r(kVarE0);
                objQ10 = o0VarQ.q();
                if (zR10) {
                    objQ10 = new q(kVarE0, 3);
                    o0VarQ.K(objQ10);
                } else {
                    aVar.getClass();
                    if (objQ10 == p3.m.a.f135155b) {
                        objQ10 = new q(kVarE0, 3);
                        o0VarQ.K(objQ10);
                    }
                }
                pVar = (e23.p) objQ10;
                zR11 = o0VarQ.r(kVarE0);
                objQ11 = o0VarQ.q();
                if (zR11) {
                    objQ11 = new j(kVarE0, 17);
                    o0VarQ.K(objQ11);
                } else {
                    aVar.getClass();
                    if (objQ11 == p3.m.a.f135155b) {
                        objQ11 = new j(kVarE0, 17);
                        o0VarQ.K(objQ11);
                    }
                }
                e23.l lVar10 = (e23.l) objQ11;
                zR12 = o0VarQ.r(kVarE0) | o0VarQ.r(context);
                objQ12 = o0VarQ.q();
                if (zR12) {
                    objQ12 = new p(kVarE0, context, 21);
                    o0VarQ.K(objQ12);
                } else {
                    aVar.getClass();
                    if (objQ12 == p3.m.a.f135155b) {
                        objQ12 = new p(kVarE0, context, 21);
                        o0VarQ.K(objQ12);
                    }
                }
                e23.l lVar11 = (e23.l) objQ12;
                zR13 = o0VarQ.r(kVarE0) | o0VarQ.r(context);
                objQ13 = o0VarQ.q();
                if (zR13) {
                    pVar2 = pVar;
                } else {
                    aVar.getClass();
                    pVar2 = pVar;
                    if (objQ13 == p3.m.a.f135155b) {
                    }
                    e23.a aVar2 = (e23.a) objQ13;
                    zR14 = o0VarQ.r(t3Var);
                    objQ14 = o0VarQ.q();
                    if (zR14) {
                        objQ14 = new by1.q(t3Var, 12);
                        o0VarQ.K(objQ14);
                    } else {
                        aVar.getClass();
                        if (objQ14 == p3.m.a.f135155b) {
                            objQ14 = new by1.q(t3Var, 12);
                            o0VarQ.K(objQ14);
                        }
                    }
                    e23.a aVar3 = (e23.a) objQ14;
                    zR15 = o0VarQ.r(kVarE0);
                    objQ15 = o0VarQ.q();
                    if (zR15) {
                        objQ15 = new h(kVarE0, 20);
                        o0VarQ.K(objQ15);
                    } else {
                        aVar.getClass();
                        if (objQ15 == p3.m.a.f135155b) {
                            objQ15 = new h(kVarE0, 20);
                            o0VarQ.K(objQ15);
                        }
                    }
                    e23.a aVar4 = (e23.a) objQ15;
                    zR16 = o0VarQ.r(m0Var) | o0VarQ.r(activity);
                    objQ16 = o0VarQ.q();
                    if (zR16) {
                        objQ16 = new x(m0Var, activity);
                        o0VarQ.K(objQ16);
                    } else {
                        aVar.getClass();
                        if (objQ16 == p3.m.a.f135155b) {
                            objQ16 = new x(m0Var, activity);
                            o0VarQ.K(objQ16);
                        }
                    }
                    e23.a aVar5 = (e23.a) objQ16;
                    zR17 = o0VarQ.r(kVarE0);
                    objQ17 = o0VarQ.q();
                    if (zR17) {
                        objQ17 = new h(kVarE0, 21);
                        o0VarQ.K(objQ17);
                    } else {
                        aVar.getClass();
                        if (objQ17 == p3.m.a.f135155b) {
                            objQ17 = new h(kVarE0, 21);
                            o0VarQ.K(objQ17);
                        }
                    }
                    e23.a aVar6 = (e23.a) objQ17;
                    zR18 = o0VarQ.r(kVarE0);
                    objQ18 = o0VarQ.q();
                    if (zR18) {
                        objQ18 = new h(kVarE0, 22);
                        o0VarQ.K(objQ18);
                    } else {
                        aVar.getClass();
                        if (objQ18 == p3.m.a.f135155b) {
                            objQ18 = new h(kVarE0, 22);
                            o0VarQ.K(objQ18);
                        }
                    }
                    e23.a aVar7 = (e23.a) objQ18;
                    zR19 = o0VarQ.r(kVarE0);
                    objQ19 = o0VarQ.q();
                    if (zR19) {
                        objQ19 = new h(kVarE0, 23);
                        o0VarQ.K(objQ19);
                    } else {
                        aVar.getClass();
                        if (objQ19 == p3.m.a.f135155b) {
                            objQ19 = new h(kVarE0, 23);
                            o0VarQ.K(objQ19);
                        }
                    }
                    e23.a aVar8 = (e23.a) objQ19;
                    zR20 = o0VarQ.r(kVarE0);
                    objQ20 = o0VarQ.q();
                    if (zR20) {
                        objQ20 = new h(kVarE0, 24);
                        o0VarQ.K(objQ20);
                    } else {
                        aVar.getClass();
                        if (objQ20 == p3.m.a.f135155b) {
                            objQ20 = new h(kVarE0, 24);
                            o0VarQ.K(objQ20);
                        }
                    }
                    qVar2 = qVar;
                    q2.b(a0Var, lVar, feVar, lVar2, qVar3, pVar3, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, pVar2, lVar10, lVar11, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, (e23.a) objQ20, o0VarQ, i15 & 896);
                    o0Var = o0VarQ;
                    Unit unit = Unit.INSTANCE;
                    zR21 = o0Var.r(kVarE0) | o0Var.r(context);
                    objQ21 = o0Var.q();
                    if (zR21) {
                        objQ21 = new a(kVarE0, context, null);
                        o0Var.K(objQ21);
                    } else {
                        aVar.getClass();
                        if (objQ21 == p3.m.a.f135155b) {
                            objQ21 = new a(kVarE0, context, null);
                            o0Var.K(objQ21);
                        }
                    }
                    l0.e((e23.p) objQ21, unit, o0Var);
                    String str = ((a0) p1VarC.getF182175a()).f140808f;
                    zB = o0Var.B(p1VarC) | o0Var.r(qVar2);
                    objQ22 = o0Var.q();
                    if (zB) {
                        objQ22 = new b(p1VarC, qVar2, null);
                        o0Var.K(objQ22);
                    } else {
                        aVar.getClass();
                        if (objQ22 == p3.m.a.f135155b) {
                            objQ22 = new b(p1VarC, qVar2, null);
                            o0Var.K(objQ22);
                        }
                    }
                    l0.e((e23.p) objQ22, str, o0Var);
                    Boolean bool = (Boolean) p1VarC3.getF182175a();
                    bool.getClass();
                    zB2 = o0Var.B(p1VarC3) | o0Var.r(activity);
                    objQ23 = o0Var.q();
                    if (zB2) {
                        objQ23 = new c(activity, p1VarC3, null);
                        o0Var.K(objQ23);
                    } else {
                        aVar.getClass();
                        if (objQ23 == p3.m.a.f135155b) {
                            objQ23 = new c(activity, p1VarC3, null);
                            o0Var.K(objQ23);
                        }
                    }
                    l0.e((e23.p) objQ23, bool, o0Var);
                }
                objQ13 = new o(kVarE0, context, 1);
                o0VarQ.K(objQ13);
                e23.a aVar9 = (e23.a) objQ13;
                zR14 = o0VarQ.r(t3Var);
                objQ14 = o0VarQ.q();
                if (zR14) {
                    aVar.getClass();
                    if (objQ14 == p3.m.a.f135155b) {
                        objQ14 = new by1.q(t3Var, 12);
                        o0VarQ.K(objQ14);
                    }
                } else {
                    objQ14 = new by1.q(t3Var, 12);
                    o0VarQ.K(objQ14);
                }
                e23.a aVar10 = (e23.a) objQ14;
                zR15 = o0VarQ.r(kVarE0);
                objQ15 = o0VarQ.q();
                if (zR15) {
                    aVar.getClass();
                    if (objQ15 == p3.m.a.f135155b) {
                        objQ15 = new h(kVarE0, 20);
                        o0VarQ.K(objQ15);
                    }
                } else {
                    objQ15 = new h(kVarE0, 20);
                    o0VarQ.K(objQ15);
                }
                e23.a aVar11 = (e23.a) objQ15;
                zR16 = o0VarQ.r(m0Var) | o0VarQ.r(activity);
                objQ16 = o0VarQ.q();
                if (zR16) {
                    aVar.getClass();
                    if (objQ16 == p3.m.a.f135155b) {
                        objQ16 = new x(m0Var, activity);
                        o0VarQ.K(objQ16);
                    }
                } else {
                    objQ16 = new x(m0Var, activity);
                    o0VarQ.K(objQ16);
                }
                e23.a aVar12 = (e23.a) objQ16;
                zR17 = o0VarQ.r(kVarE0);
                objQ17 = o0VarQ.q();
                if (zR17) {
                    aVar.getClass();
                    if (objQ17 == p3.m.a.f135155b) {
                        objQ17 = new h(kVarE0, 21);
                        o0VarQ.K(objQ17);
                    }
                } else {
                    objQ17 = new h(kVarE0, 21);
                    o0VarQ.K(objQ17);
                }
                e23.a aVar13 = (e23.a) objQ17;
                zR18 = o0VarQ.r(kVarE0);
                objQ18 = o0VarQ.q();
                if (zR18) {
                    aVar.getClass();
                    if (objQ18 == p3.m.a.f135155b) {
                        objQ18 = new h(kVarE0, 22);
                        o0VarQ.K(objQ18);
                    }
                } else {
                    objQ18 = new h(kVarE0, 22);
                    o0VarQ.K(objQ18);
                }
                e23.a aVar14 = (e23.a) objQ18;
                zR19 = o0VarQ.r(kVarE0);
                objQ19 = o0VarQ.q();
                if (zR19) {
                    aVar.getClass();
                    if (objQ19 == p3.m.a.f135155b) {
                        objQ19 = new h(kVarE0, 23);
                        o0VarQ.K(objQ19);
                    }
                } else {
                    objQ19 = new h(kVarE0, 23);
                    o0VarQ.K(objQ19);
                }
                e23.a aVar15 = (e23.a) objQ19;
                zR20 = o0VarQ.r(kVarE0);
                objQ20 = o0VarQ.q();
                if (zR20) {
                    aVar.getClass();
                    if (objQ20 == p3.m.a.f135155b) {
                        objQ20 = new h(kVarE0, 24);
                        o0VarQ.K(objQ20);
                    }
                } else {
                    objQ20 = new h(kVarE0, 24);
                    o0VarQ.K(objQ20);
                }
                qVar2 = qVar;
                q2.b(a0Var, lVar, feVar, lVar2, qVar3, pVar3, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, pVar2, lVar10, lVar11, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, (e23.a) objQ20, o0VarQ, i15 & 896);
                o0Var = o0VarQ;
                Unit unit2 = Unit.INSTANCE;
                zR21 = o0Var.r(kVarE0) | o0Var.r(context);
                objQ21 = o0Var.q();
                if (zR21) {
                    aVar.getClass();
                    if (objQ21 == p3.m.a.f135155b) {
                        objQ21 = new a(kVarE0, context, null);
                        o0Var.K(objQ21);
                    }
                } else {
                    objQ21 = new a(kVarE0, context, null);
                    o0Var.K(objQ21);
                }
                l0.e((e23.p) objQ21, unit2, o0Var);
                String str2 = ((a0) p1VarC.getF182175a()).f140808f;
                zB = o0Var.B(p1VarC) | o0Var.r(qVar2);
                objQ22 = o0Var.q();
                if (zB) {
                    aVar.getClass();
                    if (objQ22 == p3.m.a.f135155b) {
                        objQ22 = new b(p1VarC, qVar2, null);
                        o0Var.K(objQ22);
                    }
                } else {
                    objQ22 = new b(p1VarC, qVar2, null);
                    o0Var.K(objQ22);
                }
                l0.e((e23.p) objQ22, str2, o0Var);
                Boolean bool2 = (Boolean) p1VarC3.getF182175a();
                bool2.getClass();
                zB2 = o0Var.B(p1VarC3) | o0Var.r(activity);
                objQ23 = o0Var.q();
                if (zB2) {
                    aVar.getClass();
                    if (objQ23 == p3.m.a.f135155b) {
                        objQ23 = new c(activity, p1VarC3, null);
                        o0Var.K(objQ23);
                    }
                } else {
                    objQ23 = new c(activity, p1VarC3, null);
                    o0Var.K(objQ23);
                }
                l0.e((e23.p) objQ23, bool2, o0Var);
            }
            objQ28 = new j(kVarE0, 15);
            o0VarQ.K(objQ28);
            e23.l lVar12 = (e23.l) objQ28;
            zR = o0VarQ.r(m0Var);
            objQ = o0VarQ.q();
            if (zR) {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new nk0.h(m0Var, 7);
                    o0VarQ.K(objQ);
                }
            } else {
                objQ = new nk0.h(m0Var, 7);
                o0VarQ.K(objQ);
            }
            e23.q qVar4 = (e23.q) objQ;
            zR2 = o0VarQ.r(kVarE0);
            objQ2 = o0VarQ.q();
            if (zR2) {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new q(kVarE0, 2);
                    o0VarQ.K(objQ2);
                }
            } else {
                objQ2 = new q(kVarE0, 2);
                o0VarQ.K(objQ2);
            }
            e23.p pVar4 = (e23.p) objQ2;
            zR3 = o0VarQ.r(kVarE0) | o0VarQ.r(context);
            objQ3 = o0VarQ.q();
            if (zR3) {
                aVar.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new p(kVarE0, context, 17);
                    o0VarQ.K(objQ3);
                }
            } else {
                objQ3 = new p(kVarE0, context, 17);
                o0VarQ.K(objQ3);
            }
            e23.l lVar13 = (e23.l) objQ3;
            zR4 = o0VarQ.r(kVarE0) | o0VarQ.r(context);
            objQ4 = o0VarQ.q();
            if (zR4) {
                aVar.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = new p(kVarE0, context, 18);
                    o0VarQ.K(objQ4);
                }
            } else {
                objQ4 = new p(kVarE0, context, 18);
                o0VarQ.K(objQ4);
            }
            e23.l lVar14 = (e23.l) objQ4;
            zR5 = o0VarQ.r(kVarE0) | o0VarQ.r(context);
            objQ5 = o0VarQ.q();
            if (zR5) {
                aVar.getClass();
                if (objQ5 == p3.m.a.f135155b) {
                    objQ5 = new p(kVarE0, context, 19);
                    o0VarQ.K(objQ5);
                }
            } else {
                objQ5 = new p(kVarE0, context, 19);
                o0VarQ.K(objQ5);
            }
            e23.l lVar15 = (e23.l) objQ5;
            zR6 = o0VarQ.r(kVarE0) | o0VarQ.r(context);
            objQ6 = o0VarQ.q();
            if (zR6) {
                aVar.getClass();
                if (objQ6 == p3.m.a.f135155b) {
                    objQ6 = new p(kVarE0, context, 16);
                    o0VarQ.K(objQ6);
                }
            } else {
                objQ6 = new p(kVarE0, context, 16);
                o0VarQ.K(objQ6);
            }
            e23.l lVar16 = (e23.l) objQ6;
            zR7 = o0VarQ.r(kVarE0);
            objQ7 = o0VarQ.q();
            if (zR7) {
                aVar.getClass();
                if (objQ7 == p3.m.a.f135155b) {
                    objQ7 = new j(kVarE0, 16);
                    o0VarQ.K(objQ7);
                }
            } else {
                objQ7 = new j(kVarE0, 16);
                o0VarQ.K(objQ7);
            }
            e23.l lVar17 = (e23.l) objQ7;
            zR8 = o0VarQ.r(kVarE0) | o0VarQ.r(context);
            objQ8 = o0VarQ.q();
            if (zR8) {
                aVar.getClass();
                if (objQ8 == p3.m.a.f135155b) {
                    objQ8 = new p(kVarE0, context, 20);
                    o0VarQ.K(objQ8);
                }
            } else {
                objQ8 = new p(kVarE0, context, 20);
                o0VarQ.K(objQ8);
            }
            e23.l lVar18 = (e23.l) objQ8;
            zR9 = o0VarQ.r(qVarC2) | o0VarQ.r(qVarC3) | o0VarQ.r(qVarC4);
            objQ9 = o0VarQ.q();
            if (zR9) {
                aVar.getClass();
                if (objQ9 == p3.m.a.f135155b) {
                    objQ9 = new r(qVarC2, qVarC3, qVarC4, 1);
                    o0VarQ.K(objQ9);
                }
            } else {
                objQ9 = new r(qVarC2, qVarC3, qVarC4, 1);
                o0VarQ.K(objQ9);
            }
            e23.l lVar19 = (e23.l) objQ9;
            zR10 = o0VarQ.r(kVarE0);
            objQ10 = o0VarQ.q();
            if (zR10) {
                aVar.getClass();
                if (objQ10 == p3.m.a.f135155b) {
                    objQ10 = new q(kVarE0, 3);
                    o0VarQ.K(objQ10);
                }
            } else {
                objQ10 = new q(kVarE0, 3);
                o0VarQ.K(objQ10);
            }
            pVar = (e23.p) objQ10;
            zR11 = o0VarQ.r(kVarE0);
            objQ11 = o0VarQ.q();
            if (zR11) {
                aVar.getClass();
                if (objQ11 == p3.m.a.f135155b) {
                    objQ11 = new j(kVarE0, 17);
                    o0VarQ.K(objQ11);
                }
            } else {
                objQ11 = new j(kVarE0, 17);
                o0VarQ.K(objQ11);
            }
            e23.l lVar110 = (e23.l) objQ11;
            zR12 = o0VarQ.r(kVarE0) | o0VarQ.r(context);
            objQ12 = o0VarQ.q();
            if (zR12) {
                aVar.getClass();
                if (objQ12 == p3.m.a.f135155b) {
                    objQ12 = new p(kVarE0, context, 21);
                    o0VarQ.K(objQ12);
                }
            } else {
                objQ12 = new p(kVarE0, context, 21);
                o0VarQ.K(objQ12);
            }
            e23.l lVar111 = (e23.l) objQ12;
            zR13 = o0VarQ.r(kVarE0) | o0VarQ.r(context);
            objQ13 = o0VarQ.q();
            if (zR13) {
                aVar.getClass();
                pVar2 = pVar;
                if (objQ13 == p3.m.a.f135155b) {
                }
                e23.a aVar16 = (e23.a) objQ13;
                zR14 = o0VarQ.r(t3Var);
                objQ14 = o0VarQ.q();
                if (zR14) {
                    aVar.getClass();
                    if (objQ14 == p3.m.a.f135155b) {
                        objQ14 = new by1.q(t3Var, 12);
                        o0VarQ.K(objQ14);
                    }
                } else {
                    objQ14 = new by1.q(t3Var, 12);
                    o0VarQ.K(objQ14);
                }
                e23.a aVar17 = (e23.a) objQ14;
                zR15 = o0VarQ.r(kVarE0);
                objQ15 = o0VarQ.q();
                if (zR15) {
                    aVar.getClass();
                    if (objQ15 == p3.m.a.f135155b) {
                        objQ15 = new h(kVarE0, 20);
                        o0VarQ.K(objQ15);
                    }
                } else {
                    objQ15 = new h(kVarE0, 20);
                    o0VarQ.K(objQ15);
                }
                e23.a aVar18 = (e23.a) objQ15;
                zR16 = o0VarQ.r(m0Var) | o0VarQ.r(activity);
                objQ16 = o0VarQ.q();
                if (zR16) {
                    aVar.getClass();
                    if (objQ16 == p3.m.a.f135155b) {
                        objQ16 = new x(m0Var, activity);
                        o0VarQ.K(objQ16);
                    }
                } else {
                    objQ16 = new x(m0Var, activity);
                    o0VarQ.K(objQ16);
                }
                e23.a aVar19 = (e23.a) objQ16;
                zR17 = o0VarQ.r(kVarE0);
                objQ17 = o0VarQ.q();
                if (zR17) {
                    aVar.getClass();
                    if (objQ17 == p3.m.a.f135155b) {
                        objQ17 = new h(kVarE0, 21);
                        o0VarQ.K(objQ17);
                    }
                } else {
                    objQ17 = new h(kVarE0, 21);
                    o0VarQ.K(objQ17);
                }
                e23.a aVar110 = (e23.a) objQ17;
                zR18 = o0VarQ.r(kVarE0);
                objQ18 = o0VarQ.q();
                if (zR18) {
                    aVar.getClass();
                    if (objQ18 == p3.m.a.f135155b) {
                        objQ18 = new h(kVarE0, 22);
                        o0VarQ.K(objQ18);
                    }
                } else {
                    objQ18 = new h(kVarE0, 22);
                    o0VarQ.K(objQ18);
                }
                e23.a aVar111 = (e23.a) objQ18;
                zR19 = o0VarQ.r(kVarE0);
                objQ19 = o0VarQ.q();
                if (zR19) {
                    aVar.getClass();
                    if (objQ19 == p3.m.a.f135155b) {
                        objQ19 = new h(kVarE0, 23);
                        o0VarQ.K(objQ19);
                    }
                } else {
                    objQ19 = new h(kVarE0, 23);
                    o0VarQ.K(objQ19);
                }
                e23.a aVar112 = (e23.a) objQ19;
                zR20 = o0VarQ.r(kVarE0);
                objQ20 = o0VarQ.q();
                if (zR20) {
                    aVar.getClass();
                    if (objQ20 == p3.m.a.f135155b) {
                        objQ20 = new h(kVarE0, 24);
                        o0VarQ.K(objQ20);
                    }
                } else {
                    objQ20 = new h(kVarE0, 24);
                    o0VarQ.K(objQ20);
                }
                qVar2 = qVar;
                q2.b(a0Var, lVar, feVar, lVar12, qVar4, pVar4, lVar13, lVar14, lVar15, lVar16, lVar17, lVar18, lVar19, pVar2, lVar110, lVar111, aVar16, aVar17, aVar18, aVar19, aVar110, aVar111, aVar112, (e23.a) objQ20, o0VarQ, i15 & 896);
                o0Var = o0VarQ;
                Unit unit3 = Unit.INSTANCE;
                zR21 = o0Var.r(kVarE0) | o0Var.r(context);
                objQ21 = o0Var.q();
                if (zR21) {
                    aVar.getClass();
                    if (objQ21 == p3.m.a.f135155b) {
                        objQ21 = new a(kVarE0, context, null);
                        o0Var.K(objQ21);
                    }
                } else {
                    objQ21 = new a(kVarE0, context, null);
                    o0Var.K(objQ21);
                }
                l0.e((e23.p) objQ21, unit3, o0Var);
                String str3 = ((a0) p1VarC.getF182175a()).f140808f;
                zB = o0Var.B(p1VarC) | o0Var.r(qVar2);
                objQ22 = o0Var.q();
                if (zB) {
                    aVar.getClass();
                    if (objQ22 == p3.m.a.f135155b) {
                        objQ22 = new b(p1VarC, qVar2, null);
                        o0Var.K(objQ22);
                    }
                } else {
                    objQ22 = new b(p1VarC, qVar2, null);
                    o0Var.K(objQ22);
                }
                l0.e((e23.p) objQ22, str3, o0Var);
                Boolean bool3 = (Boolean) p1VarC3.getF182175a();
                bool3.getClass();
                zB2 = o0Var.B(p1VarC3) | o0Var.r(activity);
                objQ23 = o0Var.q();
                if (zB2) {
                    aVar.getClass();
                    if (objQ23 == p3.m.a.f135155b) {
                        objQ23 = new c(activity, p1VarC3, null);
                        o0Var.K(objQ23);
                    }
                } else {
                    objQ23 = new c(activity, p1VarC3, null);
                    o0Var.K(objQ23);
                }
                l0.e((e23.p) objQ23, bool3, o0Var);
            } else {
                pVar2 = pVar;
            }
            objQ13 = new o(kVarE0, context, 1);
            o0VarQ.K(objQ13);
            e23.a aVar113 = (e23.a) objQ13;
            zR14 = o0VarQ.r(t3Var);
            objQ14 = o0VarQ.q();
            if (zR14) {
                aVar.getClass();
                if (objQ14 == p3.m.a.f135155b) {
                    objQ14 = new by1.q(t3Var, 12);
                    o0VarQ.K(objQ14);
                }
            } else {
                objQ14 = new by1.q(t3Var, 12);
                o0VarQ.K(objQ14);
            }
            e23.a aVar114 = (e23.a) objQ14;
            zR15 = o0VarQ.r(kVarE0);
            objQ15 = o0VarQ.q();
            if (zR15) {
                aVar.getClass();
                if (objQ15 == p3.m.a.f135155b) {
                    objQ15 = new h(kVarE0, 20);
                    o0VarQ.K(objQ15);
                }
            } else {
                objQ15 = new h(kVarE0, 20);
                o0VarQ.K(objQ15);
            }
            e23.a aVar115 = (e23.a) objQ15;
            zR16 = o0VarQ.r(m0Var) | o0VarQ.r(activity);
            objQ16 = o0VarQ.q();
            if (zR16) {
                aVar.getClass();
                if (objQ16 == p3.m.a.f135155b) {
                    objQ16 = new x(m0Var, activity);
                    o0VarQ.K(objQ16);
                }
            } else {
                objQ16 = new x(m0Var, activity);
                o0VarQ.K(objQ16);
            }
            e23.a aVar116 = (e23.a) objQ16;
            zR17 = o0VarQ.r(kVarE0);
            objQ17 = o0VarQ.q();
            if (zR17) {
                aVar.getClass();
                if (objQ17 == p3.m.a.f135155b) {
                    objQ17 = new h(kVarE0, 21);
                    o0VarQ.K(objQ17);
                }
            } else {
                objQ17 = new h(kVarE0, 21);
                o0VarQ.K(objQ17);
            }
            e23.a aVar117 = (e23.a) objQ17;
            zR18 = o0VarQ.r(kVarE0);
            objQ18 = o0VarQ.q();
            if (zR18) {
                aVar.getClass();
                if (objQ18 == p3.m.a.f135155b) {
                    objQ18 = new h(kVarE0, 22);
                    o0VarQ.K(objQ18);
                }
            } else {
                objQ18 = new h(kVarE0, 22);
                o0VarQ.K(objQ18);
            }
            e23.a aVar118 = (e23.a) objQ18;
            zR19 = o0VarQ.r(kVarE0);
            objQ19 = o0VarQ.q();
            if (zR19) {
                aVar.getClass();
                if (objQ19 == p3.m.a.f135155b) {
                    objQ19 = new h(kVarE0, 23);
                    o0VarQ.K(objQ19);
                }
            } else {
                objQ19 = new h(kVarE0, 23);
                o0VarQ.K(objQ19);
            }
            e23.a aVar119 = (e23.a) objQ19;
            zR20 = o0VarQ.r(kVarE0);
            objQ20 = o0VarQ.q();
            if (zR20) {
                aVar.getClass();
                if (objQ20 == p3.m.a.f135155b) {
                    objQ20 = new h(kVarE0, 24);
                    o0VarQ.K(objQ20);
                }
            } else {
                objQ20 = new h(kVarE0, 24);
                o0VarQ.K(objQ20);
            }
            qVar2 = qVar;
            q2.b(a0Var, lVar, feVar, lVar12, qVar4, pVar4, lVar13, lVar14, lVar15, lVar16, lVar17, lVar18, lVar19, pVar2, lVar110, lVar111, aVar113, aVar114, aVar115, aVar116, aVar117, aVar118, aVar119, (e23.a) objQ20, o0VarQ, i15 & 896);
            o0Var = o0VarQ;
            Unit unit4 = Unit.INSTANCE;
            zR21 = o0Var.r(kVarE0) | o0Var.r(context);
            objQ21 = o0Var.q();
            if (zR21) {
                aVar.getClass();
                if (objQ21 == p3.m.a.f135155b) {
                    objQ21 = new a(kVarE0, context, null);
                    o0Var.K(objQ21);
                }
            } else {
                objQ21 = new a(kVarE0, context, null);
                o0Var.K(objQ21);
            }
            l0.e((e23.p) objQ21, unit4, o0Var);
            String str4 = ((a0) p1VarC.getF182175a()).f140808f;
            zB = o0Var.B(p1VarC) | o0Var.r(qVar2);
            objQ22 = o0Var.q();
            if (zB) {
                aVar.getClass();
                if (objQ22 == p3.m.a.f135155b) {
                    objQ22 = new b(p1VarC, qVar2, null);
                    o0Var.K(objQ22);
                }
            } else {
                objQ22 = new b(p1VarC, qVar2, null);
                o0Var.K(objQ22);
            }
            l0.e((e23.p) objQ22, str4, o0Var);
            Boolean bool4 = (Boolean) p1VarC3.getF182175a();
            bool4.getClass();
            zB2 = o0Var.B(p1VarC3) | o0Var.r(activity);
            objQ23 = o0Var.q();
            if (zB2) {
                aVar.getClass();
                if (objQ23 == p3.m.a.f135155b) {
                    objQ23 = new c(activity, p1VarC3, null);
                    o0Var.K(objQ23);
                }
            } else {
                objQ23 = new c(activity, p1VarC3, null);
                o0Var.K(objQ23);
            }
            l0.e((e23.p) objQ23, bool4, o0Var);
        } else {
            o0Var = o0VarQ;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(this, vVar, m0Var, feVar, i14, 6);
        }
    }

    @Override // ot1.a
    public final List<lc.r> b() {
        lc.u uVar = new lc.u();
        uVar.b(q0.f111851p);
        lc.t.a aVar = uVar.f111877a;
        aVar.f111872b = true;
        Unit unit = Unit.INSTANCE;
        return p13.w.c(new lc.r("reviewId", aVar.a()));
    }
}
