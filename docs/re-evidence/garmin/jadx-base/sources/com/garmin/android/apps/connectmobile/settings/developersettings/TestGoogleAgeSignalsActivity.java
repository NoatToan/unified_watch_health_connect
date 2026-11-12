package com.garmin.android.apps.connectmobile.settings.developersettings;

import am.l1;
import android.os.Bundle;
import b.g;
import c.j;
import c2.l;
import c2.x2;
import d92.b;
import e23.p;
import i3.fe;
import l51.c;
import l72.f0;
import l72.o2;
import o13.m;
import o13.r;
import o13.t;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.l0;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import t13.d;
import v13.e;
import v13.i;
import vb.h;
import z3.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000e²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u0012\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\nX\u008a\u0084\u0002²\u0006\u000e\u0010\t\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u0012\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\n8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u000b\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\f\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\r\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u0012\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\nX\u008a\u0084\u0002²\u0006\u000e\u0010\t\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/developersettings/TestGoogleAgeSignalsActivity;", "Lb/g;", "<init>", "()V", "", "showDialog", "", "", "selectionOptions", "selectedOption", "", "selectedAgeMin", "selectedAgeMax", "errorMessage", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TestGoogleAgeSignalsActivity extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f41746b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f41747a = m.b(new o2(13));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.settings.developersettings.TestGoogleAgeSignalsActivity$ClearTestData$1$1$1", f = "TestGoogleAgeSignalsActivity.kt", l = {362}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f41748a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fe f41749b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f41750c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fe feVar, String str, d<? super a> dVar) {
            super(2, dVar);
            this.f41749b = feVar;
            this.f41750c = str;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new a(this.f41749b, this.f41750c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f41748a;
            if (i14 == 0) {
                r.b(obj);
                this.f41748a = 1;
                if (fe.b(this.f41749b, this.f41750c, null, null, this, 14) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void K9(p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(1944666430);
        int i15 = i14 & 1;
        byte b14 = 0;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            f0 f0Var = f0.f110999a;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            b.f58623a.getClass();
            b.f58625c.getClass();
            h4.r rVarC = l.C(rVarF, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new c(p1Var, 4);
                o0VarE.K(objQ2);
            }
            o0Var = o0VarE;
            f0Var.d(24624, 9, (e23.a) objQ2, rVarC, "Set Age Range", o0Var, null, false);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0Var.C(-1255756973);
                Object objQ3 = o0Var.q();
                if (objQ3 == c2565a) {
                    objQ3 = new c(p1Var, 5);
                    o0Var.K(objQ3);
                }
                p004k6.c.a((e23.a) objQ3, null, f.c(1327337456, new l1(p1Var, 22, b14), o0Var), o0Var, 390, 2);
                o0Var.g0(false);
            } else {
                o0Var.C(-1251127836);
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new lg1.f(this, i14, 2);
        }
    }

    public final void L9(fe feVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1116584935);
        int i15 = (o0VarE.r(this) ? 32 : 16) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            b0 b0Var = (b0) objQ;
            f0 f0Var = f0.f110999a;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            b.f58623a.getClass();
            b.f58625c.getClass();
            h4.r rVarC = l.C(rVarF, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
            boolean zR = o0VarE.r(this) | o0VarE.r(b0Var);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new kk1.a(this, 9, b0Var, feVar);
                o0VarE.K(objQ2);
            }
            f0Var.d(48, 9, (e23.a) objQ2, rVarC, "Clear All Test Data", o0VarE, null, false);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new lg1.g(this, feVar, i14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void M9(p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(-922911148);
        int i15 = i14 & 1;
        byte b14 = 0;
        int i16 = 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            f0 f0Var = f0.f110999a;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            b.f58623a.getClass();
            b.f58625c.getClass();
            h4.r rVarC = l.C(rVarF, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new c(p1Var, 14);
                o0VarE.K(objQ2);
            }
            o0Var = o0VarE;
            f0Var.d(24624, 9, (e23.a) objQ2, rVarC, "Set Test Access Status", o0Var, null, false);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0Var.C(1935065171);
                Object objQ3 = o0Var.q();
                if (objQ3 == c2565a) {
                    objQ3 = new c(p1Var, 15);
                    o0Var.K(objQ3);
                }
                p004k6.c.a((e23.a) objQ3, null, f.c(563673862, new l1(p1Var, 29, b14), o0Var), o0Var, 390, 2);
                o0Var.g0(false);
            } else {
                o0Var.C(1938043310);
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new lg1.f(this, i14, i16);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void N9(p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(943768130);
        int i15 = i14 & 1;
        byte b14 = 0;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            f0 f0Var = f0.f110999a;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            b.f58623a.getClass();
            b.f58625c.getClass();
            h4.r rVarC = l.C(rVarF, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new c(p1Var, 6);
                o0VarE.K(objQ2);
            }
            o0Var = o0VarE;
            f0Var.d(24624, 9, (e23.a) objQ2, rVarC, "Set Test Error", o0Var, null, false);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0Var.C(940860863);
                Object objQ3 = o0Var.q();
                if (objQ3 == c2565a) {
                    objQ3 = new c(p1Var, 7);
                    o0Var.K(objQ3);
                }
                p004k6.c.a((e23.a) objQ3, null, f.c(-1013560880, new l1(p1Var, 23, b14), o0Var), o0Var, 390, 2);
                o0Var.g0(false);
            } else {
                o0Var.C(943475744);
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new lg1.f(this, i14, 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O9(p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(300619195);
        int i15 = i14 & 1;
        byte b14 = 0;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            f0 f0Var = f0.f110999a;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            b.f58623a.getClass();
            b.f58625c.getClass();
            h4.r rVarC = l.C(rVarF, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new c(p1Var, 8);
                o0VarE.K(objQ2);
            }
            o0Var = o0VarE;
            f0Var.d(24624, 9, (e23.a) objQ2, rVarC, "View Current Test Data", o0Var, null, false);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0Var.C(740017555);
                Object objQ3 = o0Var.q();
                if (objQ3 == c2565a) {
                    objQ3 = new c(p1Var, 9);
                    o0Var.K(objQ3);
                }
                p004k6.c.a((e23.a) objQ3, null, f.c(-2011907219, new l1(p1Var, 24, b14), o0Var), o0Var, 390, 2);
                o0Var.g0(false);
            } else {
                o0Var.C(741420615);
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new lg1.f(this, i14, 4);
        }
    }

    @Override // b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        j.a(this, new z3.e(-1599620280, true, new lg1.f(this, 0)));
    }
}
