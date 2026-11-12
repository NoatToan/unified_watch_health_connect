package com.garmin.android.apps.connectmobile.activities.health.presentation;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.g1;
import e23.p;
import java.util.List;
import lc.m0;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import r53.j;
import sk0.k1;
import t21.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fBK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b0\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0013²\u0006\u000e\u0010\u0011\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0012\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/health/presentation/c;", "", "Lcom/garmin/android/apps/connectmobile/activities/health/presentation/e;", "viewModel", "Lkotlin/Function2;", "", "", "Lim/b;", "", "chartClickListener", "Lkotlin/Function0;", "onNavigateUp", "onActivityUpdated", "<init>", "(Lcom/garmin/android/apps/connectmobile/activities/health/presentation/e;Le23/p;Le23/a;Le23/a;)V", "a", "", "showDeleteActivityDialog", "showLoadingOverlay", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f29045e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f29046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p<Integer, List<? extends im.b>, Unit> f29047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.a<Unit> f29048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.a<Unit> f29049d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.health.presentation.HealthSnapshotDetailsRoute$Render$2$1", f = "HealthSnapshotDetailsScreen.kt", l = {91}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f29050a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f29052c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f29053d;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f29054a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Context f29055b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ p1<Boolean> f29056c;

            public a(c cVar, Context context, p1<Boolean> p1Var) {
                this.f29054a = cVar;
                this.f29055b = context;
                this.f29056c = p1Var;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                com.garmin.android.apps.connectmobile.activities.health.presentation.a aVar = (com.garmin.android.apps.connectmobile.activities.health.presentation.a) obj;
                boolean zG = s.g(aVar, com.garmin.android.apps.connectmobile.activities.health.presentation.a.C0445a.f29027a);
                c cVar = this.f29054a;
                if (zG) {
                    cVar.f29049d.invoke();
                    cVar.f29048c.invoke();
                } else {
                    boolean zG2 = s.g(aVar, com.garmin.android.apps.connectmobile.activities.health.presentation.a.c.f29029a);
                    p1<Boolean> p1Var = this.f29056c;
                    if (zG2) {
                        g1.a(this.f29055b, null);
                        int i14 = c.f29045e;
                        p1Var.setValue(Boolean.FALSE);
                    } else if (s.g(aVar, com.garmin.android.apps.connectmobile.activities.health.presentation.a.d.f29030a)) {
                        int i15 = c.f29045e;
                        p1Var.setValue(Boolean.TRUE);
                    } else if (s.g(aVar, com.garmin.android.apps.connectmobile.activities.health.presentation.a.e.f29031a)) {
                        int i16 = c.f29045e;
                        p1Var.setValue(Boolean.FALSE);
                    } else {
                        if (!s.g(aVar, com.garmin.android.apps.connectmobile.activities.health.presentation.a.b.f29028a) && !s.g(aVar, com.garmin.android.apps.connectmobile.activities.health.presentation.a.f.f29032a)) {
                            u0.r();
                            return null;
                        }
                        cVar.f29049d.invoke();
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, p1<Boolean> p1Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f29052c = context;
            this.f29053d = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return c.this.new b(this.f29052c, this.f29053d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to com.garmin.android.apps.connectmobile.activities.health.presentation.c$b for r6v1 'this'  t13.d
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                u13.a r0 = u13.a.COROUTINE_SUSPENDED
                int r1 = r6.f29050a
                r2 = 1
                if (r1 == 0) goto L14
                if (r1 != r2) goto Ld
                o13.r.b(r7)
                goto L31
            Ld:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                vb.h.z(r7)
                r7 = 0
                return r7
            L14:
                o13.r.b(r7)
                com.garmin.android.apps.connectmobile.activities.health.presentation.c r7 = com.garmin.android.apps.connectmobile.activities.health.presentation.c.this
                com.garmin.android.apps.connectmobile.activities.health.presentation.e r1 = r7.f29046a
                nn.e<Action extends nn.j> r1 = r1.f126662f
                com.garmin.android.apps.connectmobile.activities.health.presentation.c$b$a r3 = new com.garmin.android.apps.connectmobile.activities.health.presentation.c$b$a
                android.content.Context r4 = r6.f29052c
                p3.p1<java.lang.Boolean> r5 = r6.f29053d
                r3.<init>(r7, r4, r5)
                r6.f29050a = r2
                r53.i<T> r7 = r1.f126669a
                java.lang.Object r7 = r7.collect(r3, r6)
                if (r7 != r0) goto L31
                return r0
            L31:
                kotlin.Unit r7 = p005kotlin.Unit.INSTANCE
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.garmin.android.apps.connectmobile.activities.health.presentation.c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(e eVar, p<? super Integer, ? super List<? extends im.b>, Unit> pVar, e23.a<Unit> aVar, e23.a<Unit> aVar2) {
        eVar.getClass();
        pVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        this.f29046a = eVar;
        this.f29047b = pVar;
        this.f29048c = aVar;
        this.f29049d = aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, sn.h] */
    public final void a(m0 m0Var, m mVar, int i14) {
        c cVar = this;
        m0Var.getClass();
        o0 o0VarE = mVar.E(1791131005);
        int i15 = (o0VarE.r(m0Var) ? 4 : 2) | i14 | (o0VarE.r(cVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            boolean z14 = ((Configuration) o0VarE.A(AndroidCompositionLocals_androidKt.f6041a)).orientation == 1;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            r0 r0Var = new r0();
            ?? r14 = ((tn.g) p0.c(cVar.f29046a.x4(), o0VarE, 0).getF182175a()).f165466a;
            if (r14 != 0) {
                r0Var.f105810a = r14;
            }
            String strB = new wn.c(context).b((sn.h) r0Var.f105810a);
            g8.i.d(2, o0VarE, 6);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p1 p1Var2 = (p1) objQ2;
            Unit unit = Unit.INSTANCE;
            boolean zR = o0VarE.r(cVar) | o0VarE.r(context);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                objQ3 = cVar.new b(context, p1Var2, null);
                o0VarE.K(objQ3);
            }
            l0.e((p) objQ3, unit, o0VarE);
            boolean zBooleanValue = ((Boolean) p1Var2.getF182175a()).booleanValue();
            z3.e eVarC = z3.f.c(1737235096, new defpackage.d(strB, cVar, context, z14, r0Var, m0Var, p1Var), o0VarE);
            cVar = this;
            z02.d.a(zBooleanValue, eVarC, null, null, null, z3.f.c(1590065940, new k1((Object) r0Var, (Object) strB, (Object) this, p1Var, 12), o0VarE), o0VarE, 196656, 28);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l(cVar, m0Var, i14, 12);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/health/presentation/c$a;", "", "<init>", "()V", "", "EDIT_NAME_MENU_ITEM", "Ljava/lang/String;", "DOWNLOAD_PDF_MENU_ITEM", "HELP_MENU_ITEM", "DELETE_MENU_ITEM", "DATE_FORMAT", "ROUTE", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
