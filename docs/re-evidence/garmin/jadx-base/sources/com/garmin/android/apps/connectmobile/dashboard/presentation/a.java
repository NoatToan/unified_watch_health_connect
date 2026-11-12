package com.garmin.android.apps.connectmobile.dashboard.presentation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.v1;
import c2.j;
import c2.n0;
import c2.n3;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.consent.DataStorageConsentActivity;
import e23.l;
import e23.p;
import g02.g0;
import h4.k;
import h5.e0;
import i3.e5;
import i3.e9;
import i3.fe;
import i3.mc;
import i3.yd;
import l72.d3;
import o13.r;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import q92.v;
import r53.p2;
import r70.q;
import r70.u;
import s70.c0;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.dashboard.presentation.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardScreenKt$Dashboard$1$1", f = "DashboardScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class C0548a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f33502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<Boolean> f33503b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f33504c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0548a(p1<Boolean> p1Var, x3<Boolean> x3Var, p1<Boolean> p1Var2, t13.d<? super C0548a> dVar) {
            super(2, dVar);
            this.f33502a = p1Var;
            this.f33503b = x3Var;
            this.f33504c = p1Var2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new C0548a(this.f33502a, this.f33503b, this.f33504c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C0548a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            if (this.f33502a.getF182175a().booleanValue() && this.f33503b.getF182175a().booleanValue()) {
                this.f33504c.setValue(Boolean.TRUE);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardScreenKt$Dashboard$3$1", f = "DashboardScreen.kt", l = {171}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f33505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fe f33506b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.dashboard.presentation.d f33507c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x3<String> f33508d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(fe feVar, com.garmin.android.apps.connectmobile.dashboard.presentation.d dVar, x3<String> x3Var, t13.d<? super b> dVar2) {
            super(2, dVar2);
            this.f33506b = feVar;
            this.f33507c = dVar;
            this.f33508d = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f33506b, this.f33507c, this.f33508d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f33505a;
            if (i14 == 0) {
                r.b(obj);
                x3<String> x3Var = this.f33508d;
                if (x3Var.getF182175a() != null) {
                    String f182175a = x3Var.getF182175a();
                    f182175a.getClass();
                    this.f33505a = 1;
                    if (d3.c(this.f33506b, f182175a, null, this) == aVar) {
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
            this.f33507c.f33551h.f204261a.E4("FEEDBACK_SNACKBAR_MESSAGE");
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardScreenKt$Dashboard$4$1", f = "DashboardScreen.kt", l = {178}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f33509a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fe f33510b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f33511c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.dashboard.presentation.d f33512d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x3<Boolean> f33513e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(fe feVar, Context context, com.garmin.android.apps.connectmobile.dashboard.presentation.d dVar, x3<Boolean> x3Var, t13.d<? super c> dVar2) {
            super(2, dVar2);
            this.f33510b = feVar;
            this.f33511c = context;
            this.f33512d = dVar;
            this.f33513e = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f33510b, this.f33511c, this.f33512d, this.f33513e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f33509a;
            if (i14 == 0) {
                r.b(obj);
                if (this.f33513e.getF182175a().booleanValue()) {
                    String string = this.f33511c.getString(R.string.txt_something_went_wrong_try_again);
                    string.getClass();
                    this.f33509a = 1;
                    if (d3.c(this.f33510b, string, null, this) == aVar) {
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
            p2 p2Var = this.f33512d.F;
            do {
                value = p2Var.getValue();
                ((Boolean) value).getClass();
            } while (!p2Var.b(value, Boolean.FALSE));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/dashboard/presentation/a$d", "Lr70/q;", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<DashboardRoute, Unit> f33514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b0 f33515b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ fe f33516c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ m4.b0 f33517d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.dashboard.presentation.d f33518e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Context f33519f;

        /* JADX WARN: Multi-variable type inference failed */
        public d(l<? super DashboardRoute, Unit> lVar, b0 b0Var, fe feVar, m4.b0 b0Var2, com.garmin.android.apps.connectmobile.dashboard.presentation.d dVar, Context context) {
            this.f33514a = lVar;
            this.f33515b = b0Var;
            this.f33516c = feVar;
            this.f33517d = b0Var2;
            this.f33518e = dVar;
            this.f33519f = context;
        }

        @Override // r70.q
        public final void a(DashboardRoute dashboardRoute) {
            dashboardRoute.getClass();
            this.f33514a.invoke(dashboardRoute);
        }

        @Override // r70.q
        public final void b(String str, yd ydVar, qv1.l lVar) {
            str.getClass();
            ydVar.getClass();
            ge1.b.T(this.f33515b, null, null, new com.garmin.android.apps.connectmobile.dashboard.presentation.b(this.f33516c, str, null, false, ydVar, this.f33517d, lVar, null), 3);
        }

        @Override // r70.q
        public final void c(Object obj, String str) {
            if (str.equals(o70.b.PENDING_ACTIVITIES.a())) {
                pb2.a.d dVar = obj instanceof pb2.a.d ? (pb2.a.d) obj : null;
                if (dVar != null) {
                    com.garmin.android.apps.connectmobile.dashboard.presentation.d dVar2 = this.f33518e;
                    dVar2.getClass();
                    Context context = this.f33519f;
                    context.getClass();
                    ge1.b.T(v1.a(dVar2), null, null, new u(dVar2, context, dVar, null), 3);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardScreenKt$DashboardScreen$1$1", f = "DashboardScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<com.garmin.android.apps.connectmobile.dashboard.presentation.c, Unit> f33520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.dashboard.presentation.c f33521b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(l<? super com.garmin.android.apps.connectmobile.dashboard.presentation.c, Unit> lVar, com.garmin.android.apps.connectmobile.dashboard.presentation.c cVar, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f33520a = lVar;
            this.f33521b = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new e(this.f33520a, this.f33521b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.f33520a.invoke(this.f33521b);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardScreenKt$DashboardScreen$3$1", f = "DashboardScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class f extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f33522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.dashboard.presentation.c f33523b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Context context, com.garmin.android.apps.connectmobile.dashboard.presentation.c cVar, t13.d<? super f> dVar) {
            super(2, dVar);
            this.f33522a = context;
            this.f33523b = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new f(this.f33522a, this.f33523b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            DataStorageConsentActivity.a aVar2 = DataStorageConsentActivity.f32194t;
            com.garmin.android.apps.connectmobile.dashboard.presentation.c cVar = this.f33523b;
            v vVar = ((com.garmin.android.apps.connectmobile.dashboard.presentation.c.a) cVar).f33536a;
            s92.g gVar = ((com.garmin.android.apps.connectmobile.dashboard.presentation.c.a) cVar).f33537b;
            hl.a.c cVar2 = hl.a.c.f84256b;
            aVar2.getClass();
            Context context = this.f33522a;
            context.getClass();
            vVar.getClass();
            gVar.getClass();
            cVar2.getClass();
            Intent intent = new Intent(context, (Class<?>) DataStorageConsentActivity.class);
            intent.putExtra("extra_implicit_device_upload_consent", true);
            intent.putExtra("extra_show_toolbar", false);
            intent.putExtra("extra_consent_status", vVar);
            intent.putExtra("extra_consent_text", gVar);
            intent.putExtra("GCM_extra_screen_access_role", cVar2);
            context.startActivity(intent);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardScreenKt$DashboardScreen$4$1", f = "DashboardScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class g extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<com.garmin.android.apps.connectmobile.dashboard.presentation.c, Unit> f33524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.dashboard.presentation.c f33525b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(l<? super com.garmin.android.apps.connectmobile.dashboard.presentation.c, Unit> lVar, com.garmin.android.apps.connectmobile.dashboard.presentation.c cVar, t13.d<? super g> dVar) {
            super(2, dVar);
            this.f33524a = lVar;
            this.f33525b = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new g(this.f33524a, this.f33525b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.f33524a.invoke(this.f33525b);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardScreenKt$DashboardScreen$openAuthorizedModal$1$1$1", f = "DashboardScreen.kt", l = {76}, m = "invokeSuspend", v = 2)
    public static final class h extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f33526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f33527b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(mc mcVar, t13.d<? super h> dVar) {
            super(2, dVar);
            this.f33527b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new h(this.f33527b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f33526a;
            if (i14 == 0) {
                r.b(obj);
                this.f33526a = 1;
                if (this.f33527b.g(this) == aVar) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(com.garmin.android.apps.connectmobile.dashboard.presentation.c.b bVar, com.garmin.android.apps.connectmobile.dashboard.presentation.d dVar, e23.a<Unit> aVar, l<? super DashboardRoute, Unit> lVar, m mVar, int i14) {
        int i15;
        fe feVar;
        Context context;
        o0 o0VarE = mVar.E(-630832757);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(bVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(dVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = com.nimbusds.jose.shaded.gson.internal.a.f(o0VarE);
            }
            fe feVar2 = (fe) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ2);
            }
            b0 b0Var = (b0) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = kg.f.j(o0VarE);
            }
            m4.b0 b0Var2 = (m4.b0) objQ3;
            p1 p1VarC = p0.c(dVar.f33567z, o0VarE, 0);
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = p0.n(Boolean.TRUE);
                o0VarE.K(objQ4);
            }
            p1 p1Var = (p1) objQ4;
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ5);
            }
            p1 p1Var2 = (p1) objQ5;
            p1 p1VarC2 = p0.c(dVar.A, o0VarE, 0);
            p1 p1VarC3 = p0.c(dVar.I, o0VarE, 0);
            Context context2 = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Boolean bool = (Boolean) p1Var.getF182175a();
            bool.booleanValue();
            Boolean bool2 = (Boolean) p1VarC.getF182175a();
            bool2.booleanValue();
            boolean zB = o0VarE.B(p1VarC);
            Object objQ6 = o0VarE.q();
            if (zB || objQ6 == c2565a) {
                objQ6 = new C0548a(p1Var, p1VarC, p1Var2, null);
                o0VarE.K(objQ6);
            }
            l0.f(bool, bool2, (p) objQ6, o0VarE);
            androidx.lifecycle.b0.a aVar2 = androidx.lifecycle.b0.a.ON_PAUSE;
            Object objQ7 = o0VarE.q();
            if (objQ7 == c2565a) {
                objQ7 = new qk0.m(p1Var2, 26);
                o0VarE.K(objQ7);
            }
            s9.e.a(aVar2, null, (e23.a) objQ7, o0VarE, 390);
            String str = (String) p1VarC2.getF182175a();
            boolean zB2 = o0VarE.B(p1VarC2) | o0VarE.r(dVar);
            Object objQ8 = o0VarE.q();
            if (zB2 || objQ8 == c2565a) {
                objQ8 = new b(feVar2, dVar, p1VarC2, null);
                o0VarE.K(objQ8);
            }
            l0.e((p) objQ8, str, o0VarE);
            Boolean bool3 = (Boolean) p1VarC3.getF182175a();
            bool3.booleanValue();
            boolean zB3 = o0VarE.B(p1VarC3) | o0VarE.r(context2) | o0VarE.r(dVar);
            Object objQ9 = o0VarE.q();
            if (zB3 || objQ9 == c2565a) {
                feVar = feVar2;
                context = context2;
                c cVar = new c(feVar, context, dVar, p1VarC3, null);
                o0VarE.K(cVar);
                objQ9 = cVar;
            } else {
                feVar = feVar2;
                context = context2;
            }
            l0.e((p) objQ9, bool3, o0VarE);
            fe feVar3 = feVar;
            d dVar2 = new d(lVar, b0Var, feVar3, b0Var2, dVar, context);
            n0 n0Var = n3.f22788a;
            z02.d.a(false, z3.f.c(1529633872, new pp.g(dVar, 19, aVar, p1Var2), o0VarE), z3.f.c(1539404433, new q72.f(24, feVar3, b0Var2), o0VarE), null, new n0(0, 0, 0, 0), z3.f.c(1568716116, new ob0.e(dVar, bVar, dVar2, p1Var2, p1Var, 17), o0VarE), o0VarE, 197040, 9);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ot1.i(bVar, dVar, aVar, lVar, i14, 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:81:0x0220  */
    /* JADX WARN: Code duplicated, block: B:82:0x0235  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [e23.a, java.lang.Object, org.koin.core.qualifier.Qualifier] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v5 */
    public static final void b(com.garmin.android.apps.connectmobile.dashboard.presentation.d dVar, l<? super com.garmin.android.apps.connectmobile.dashboard.presentation.c, Unit> lVar, l<? super DashboardRoute, Unit> lVar2, m mVar, int i14) {
        o0 o0Var;
        ?? r14;
        ?? r15;
        o0 o0Var2;
        dVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar.E(-745474488);
        int i15 = i14 | (o0VarE.r(dVar) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(lVar2) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            p1 p1VarC = s9.c.c(dVar.f33559p, o0VarE);
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            mc mcVarF = e9.f(true, null, o0VarE, 6, 2);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            Object obj = m.a.f135155b;
            if (objQ == obj) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            b0 b0Var = (b0) objQ;
            boolean zR = o0VarE.r(b0Var) | o0VarE.B(mcVarF);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == obj) {
                objQ2 = new nw0.n(b0Var, mcVarF, 6);
                o0VarE.K(objQ2);
            }
            e23.a aVar = (e23.a) objQ2;
            com.garmin.android.apps.connectmobile.dashboard.presentation.c cVar = (com.garmin.android.apps.connectmobile.dashboard.presentation.c) p1VarC.getF182175a();
            if (cVar instanceof com.garmin.android.apps.connectmobile.dashboard.presentation.c.b) {
                o0VarE.C(846086512);
                boolean zB = ((i15 & 112) == 32) | o0VarE.B(cVar);
                Object objQ3 = o0VarE.q();
                if (zB || objQ3 == obj) {
                    objQ3 = new e(lVar, cVar, null);
                    o0VarE.K(objQ3);
                }
                l0.e((p) objQ3, cVar, o0VarE);
                boolean zR2 = o0VarE.r(dVar);
                Object objQ4 = o0VarE.q();
                if (zR2 || objQ4 == obj) {
                    objQ4 = new r12.a(dVar, 9);
                    o0VarE.K(objQ4);
                }
                g0.a((p) objQ4, o0VarE, 0);
                a((com.garmin.android.apps.connectmobile.dashboard.presentation.c.b) cVar, dVar, aVar, lVar2, o0VarE, (i15 << 3) & 7280);
                o0VarE.g0(false);
            } else {
                if (cVar instanceof com.garmin.android.apps.connectmobile.dashboard.presentation.c.a) {
                    o0VarE.C(846498099);
                    Unit unit = Unit.INSTANCE;
                    boolean zR3 = o0VarE.r(context) | o0VarE.B(cVar);
                    Object objQ5 = o0VarE.q();
                    if (zR3 || objQ5 == obj) {
                        objQ5 = new f(context, cVar, null);
                        o0VarE.K(objQ5);
                    }
                    l0.e((p) objQ5, unit, o0VarE);
                    o0VarE.g0(false);
                } else if (cVar instanceof com.garmin.android.apps.connectmobile.dashboard.presentation.c.C0549c) {
                    o0VarE.C(846976212);
                    boolean zB2 = ((i15 & 112) == 32) | o0VarE.B(cVar);
                    Object objQ6 = o0VarE.q();
                    if (zB2 || objQ6 == obj) {
                        objQ6 = new g(lVar, cVar, null);
                        o0VarE.K(objQ6);
                    }
                    l0.e((p) objQ6, cVar, o0VarE);
                    h4.r.a aVar2 = h4.r.S;
                    h4.r rVarD = x2.d(aVar2, 1.0f);
                    j.f22691a.getClass();
                    j.k kVar = j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                    int iHashCode = Long.hashCode(o0VarE.U);
                    i2 i2VarA0 = o0VarE.a0();
                    h4.r rVarC = k.c(rVarD, o0VarE);
                    h5.g.V.getClass();
                    e0.a aVar3 = h5.g.a.f81805b;
                    if (o0VarE.f135177b == null) {
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
                    if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    c0.c(dVar, null, null, aVar, o0VarE, i15 & 14, 6);
                    h4.r rVarD2 = x2.d(aVar2, 1.0f);
                    boolean zB3 = o0VarE.B(cVar);
                    Object objQ7 = o0VarE.q();
                    if (zB3 || objQ7 == obj) {
                        objQ7 = new qw0.y((com.garmin.android.apps.connectmobile.dashboard.presentation.c.C0549c) cVar, 11);
                        o0VarE.K(objQ7);
                    }
                    l lVar3 = (l) objQ7;
                    o0VarE.L(1765406104);
                    r15 = 0;
                    o0 o0Var3 = o0VarE;
                    r14 = 0;
                    g8.a.a(r70.p.class, rVarD2, g8.i.U(o0VarE), Bundle.EMPTY, lVar3, o0Var3, 48, 0);
                    e5.u(o0Var3, false, true, false);
                    o0Var2 = o0Var3;
                } else {
                    r14 = 0;
                    r15 = 0;
                    o0 o0Var4 = o0VarE;
                    o0Var4.C(847678393);
                    o0Var4.g0(false);
                    o0Var2 = o0Var4;
                }
                if (mcVarF.e()) {
                    o0Var2.C(847787296);
                    ((n70.g) KoinJavaComponent.get$default(n70.g.class, r15, r15, 6, r15)).l(mcVarF, o0Var2, r14);
                    o0Var2.g0(r14);
                    o0Var = o0Var2;
                } else {
                    o0Var2.C(847873786);
                    o0Var2.g0(r14);
                    o0Var = o0Var2;
                }
            }
            r14 = 0;
            r15 = 0;
            o0Var2 = o0VarE;
            if (mcVarF.e()) {
                o0Var2.C(847787296);
                ((n70.g) KoinJavaComponent.get$default(n70.g.class, r15, r15, 6, r15)).l(mcVarF, o0Var2, r14);
                o0Var2.g0(r14);
                o0Var = o0Var2;
            } else {
                o0Var2.C(847873786);
                o0Var2.g0(r14);
                o0Var = o0Var2;
            }
        } else {
            o0 o0Var5 = o0VarE;
            o0Var5.e();
            o0Var = o0Var5;
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new pp.g(dVar, lVar, lVar2, i14, 18);
        }
    }
}
