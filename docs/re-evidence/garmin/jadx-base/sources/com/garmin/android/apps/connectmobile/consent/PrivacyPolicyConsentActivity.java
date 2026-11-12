package com.garmin.android.apps.connectmobile.consent;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import c2.j;
import c2.l;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import c22.w1;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import h4.k;
import h5.e0;
import i3.mh;
import i3.q1;
import i3.r1;
import i3.s1;
import i3.v5;
import java.util.List;
import java.util.Locale;
import l72.c1;
import l72.f0;
import o13.m;
import o13.n;
import o13.r;
import o13.t;
import o53.b0;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import q92.x;
import s5.x0;
import u1.w;
import v.h;
import v13.i;
import z10.k2;
import z10.l2;
import z10.n2;
import z10.p2;
import z10.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\n²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\u000e\u0010\b\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\t\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/consent/PrivacyPolicyConsentActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "Lz10/q2;", "uiState", "", "isPolicyChecked", "showCiqPrivacyPolicyAlreadyAcceptedDialog", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PrivacyPolicyConsentActivity extends com.garmin.android.apps.connectmobile.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f32218d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f32219a = m.b(new l2(this, 1));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f32220b = m.b(new l2(this, 2));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f32221c = m.a(n.NONE, new d(this, null, null, null));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.consent.PrivacyPolicyConsentActivity$onCreate$1$1$2$1$1", f = "PrivacyPolicyConsentActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<q2> f32223b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x3<q2> x3Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f32223b = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return PrivacyPolicyConsentActivity.this.new b(this.f32223b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            a aVar2 = PrivacyPolicyConsentActivity.f32218d;
            if (s.g(this.f32223b.getF182175a().f201222e, Boolean.TRUE)) {
                PrivacyPolicyConsentActivity privacyPolicyConsentActivity = PrivacyPolicyConsentActivity.this;
                privacyPolicyConsentActivity.displayFailedMessage();
                Intent intent = new Intent();
                intent.putExtra("GCM_extra_privacy_policy_declined", true);
                privacyPolicyConsentActivity.setResult(0, intent);
                privacyPolicyConsentActivity.onBackPressed();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.consent.PrivacyPolicyConsentActivity$onCreate$1$1$2$2$1", f = "PrivacyPolicyConsentActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<q2> f32225b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(x3<q2> x3Var, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f32225b = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return PrivacyPolicyConsentActivity.this.new c(this.f32225b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            a aVar2 = PrivacyPolicyConsentActivity.f32218d;
            if (s.g(this.f32225b.getF182175a().f201219b, Boolean.TRUE)) {
                PrivacyPolicyConsentActivity privacyPolicyConsentActivity = PrivacyPolicyConsentActivity.this;
                privacyPolicyConsentActivity.setResult(-1);
                privacyPolicyConsentActivity.onBackPressed();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<p2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f32226a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f32227b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f32228c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f32229d;

        public d(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f32226a = gVar;
            this.f32227b = qualifier;
            this.f32228c = aVar;
            this.f32229d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, z10.p2] */
        @Override // e23.a
        public final p2 invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f32226a;
            y1 viewModelStore = gVar.getF189591b();
            e23.a aVar = this.f32228c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(p2.class), viewModelStore, null, defaultViewModelCreationExtras, this.f32227b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f32229d, 4, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:97:0x03da  */
    /* JADX WARN: Code duplicated, block: B:98:0x03dc  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void da(q2 q2Var, p3.m mVar, int i14) {
        PrivacyPolicyConsentActivity privacyPolicyConsentActivity;
        q2 q2Var2;
        p3.m.a.C2565a c2565a;
        p1 p1Var;
        h4.r.a aVar;
        h5.g.a.b bVar;
        h5.g.a.e eVar;
        h5.g.a.C1623g c1623g;
        float f14;
        boolean z14;
        p1 p1Var2;
        p3.m.a.C2565a c2565a2;
        boolean z15;
        boolean zR;
        Object objQ;
        p3.m.a.C2565a c2565a3;
        boolean z16;
        List<s92.e> listD;
        List<s92.b> listB;
        s92.b bVar2;
        o0 o0VarE = mVar.E(-1244677413);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.r(q2Var) ? 4 : 2) | (o0VarE.r(this) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ2 = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a4 = p3.m.a.f135155b;
            if (objQ2 == c2565a4) {
                objQ2 = hb.a.n(q2Var.f201220c, o0VarE);
            }
            p1 p1Var3 = (p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a4) {
                objQ3 = hb.a.n(q2Var.f201220c && ((x) this.f32220b.getValue()) == x.DI_CONNECT_CIQ_PRIVACY, o0VarE);
            }
            p1 p1Var4 = (p1) objQ3;
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarA = l.A(x2.d(aVar2, 1.0f), 0.0f, 0.0f, 3);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            s92.e eVar2 = null;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar3 = h5.g.a.f81810g;
            b4.c(eVar3, zVarA, o0VarE);
            h5.g.a.C1623g c1623g2 = h5.g.a.f81809f;
            b4.c(c1623g2, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            hl.a aVar4 = (hl.a) this.f32219a.getValue();
            hl.a.b bVar4 = aVar4 instanceof hl.a.b ? (hl.a.b) aVar4 : null;
            if (bVar4 == null) {
                o0VarE.C(619813418);
                o0VarE.g0(false);
                cVar = cVar;
                p1Var = p1Var3;
                c2565a = c2565a4;
                eVar = eVar3;
                c1623g = c1623g2;
                bVar = bVar3;
                b0Var = b0Var;
                f14 = 1.0f;
                aVar = aVar2;
            } else {
                o0VarE.C(619813419);
                String str = bVar4.f84253c;
                if (str == null) {
                    o0VarE.C(-604226171);
                    z14 = false;
                    o0VarE.g0(false);
                    p1Var = p1Var3;
                    c2565a = c2565a4;
                    eVar = eVar3;
                    c1623g = c1623g2;
                    bVar = bVar3;
                    f14 = 1.0f;
                    aVar = aVar2;
                } else {
                    o0VarE.C(-604226170);
                    c2565a = c2565a4;
                    p1Var = p1Var3;
                    aVar = aVar2;
                    bVar = bVar3;
                    eVar = eVar3;
                    c1623g = c1623g2;
                    f14 = 1.0f;
                    w1.a(bVar4.f84252b, str, bVar4.f84254d, false, null, o0VarE, 3072, 16);
                    Unit unit = Unit.INSTANCE;
                    z14 = false;
                    o0VarE.g0(false);
                }
                o0VarE.g0(z14);
            }
            h4.r rVarF = x2.f(aVar, f14);
            d92.b.f58623a.getClass();
            j92.b bVar5 = d92.b.f58625c;
            bVar5.getClass();
            j92.e eVar4 = j92.b.f97899b;
            float f15 = eVar4.f97920e;
            float f16 = eVar4.f97920e;
            float f17 = eVar4.f97918c;
            bVar5.getClass();
            h4.r rVarZ = l.z(rVarF, f17, f15);
            s2 s2VarA = c2.q2.a(j.f22692b, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = k.c(rVarZ, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            h4.r rVarC3 = u2.f22900a.c(aVar, h4.d.a.f81534l);
            bVar5.getClass();
            h4.r rVarQ = x2.q(rVarC3, j92.b.f97901d.f97906e);
            bVar5.getClass();
            h4.r rVarY = l.y(rVarQ, f17);
            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
            r1 r1Var = r1.f89474a;
            long jA = d92.b.a(o0VarE).f().a();
            r1Var.getClass();
            q1 q1VarA = r1.a(jA, 0L, o0VarE, 62);
            Object objQ4 = o0VarE.q();
            p3.m.a.C2565a c2565a5 = c2565a;
            if (objQ4 == c2565a5) {
                p1Var2 = p1Var;
                objQ4 = new xq1.c(p1Var2, 14);
                o0VarE.K(objQ4);
            } else {
                p1Var2 = p1Var;
            }
            s1.a(zBooleanValue, (e23.l) objQ4, rVarY, false, q1VarA, o0VarE, 48, 40);
            s92.g gVar = q2Var.f201221d;
            String copy = (gVar == null || (listB = gVar.b()) == null || (bVar2 = (s92.b) h0.d0(listB)) == null) ? null : bVar2.getCopy();
            String str2 = copy == null ? "" : copy;
            h4.r rVarF2 = x2.f(aVar, f14);
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0 x0Var = j92.f.f97931h;
            p1 p1Var5 = p1Var2;
            h4.r.a aVar5 = aVar;
            c2.b0 b0Var2 = b0Var;
            int i16 = 1;
            mh.c(str2, rVarF2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0VarE, 48, 0, 131068);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            s92.g gVar2 = q2Var.f201221d;
            if (gVar2 != null && (listD = gVar2.d()) != null) {
                eVar2 = (s92.e) h0.d0(listD);
            }
            s92.e eVar5 = eVar2;
            if (eVar5 == null) {
                o0VarE.C(621320607);
                o0VarE.g0(false);
                privacyPolicyConsentActivity = this;
                z16 = true;
                c2565a3 = c2565a5;
                q2Var2 = q2Var;
            } else {
                o0VarE.C(621320608);
                float f18 = 1;
                g6.f.a aVar6 = g6.f.f75994b;
                v5.a(0.0f, 6, 2, sn.a.c(o0VarE), x2.f(x2.h(aVar5, f18), 1.0f), o0VarE);
                String text = eVar5.getText();
                if (text == null) {
                    text = "";
                }
                h4.r rVarF3 = x2.f(aVar5, 1.0f);
                bVar5.getClass();
                bVar5.getClass();
                h4.r rVarZ2 = l.z(rVarF3, f17, f16);
                boolean zR2 = o0VarE.r(eVar5) | o0VarE.r(this);
                Object objQ5 = o0VarE.q();
                if (zR2) {
                    c2565a2 = c2565a5;
                } else {
                    c2565a2 = c2565a5;
                    if (objQ5 == c2565a2) {
                    }
                    h4.r rVarD = w.d(rVarZ2, false, null, null, (e23.a) objQ5, 15);
                    fVar2.getClass();
                    p3.m.a.C2565a c2565a6 = c2565a2;
                    privacyPolicyConsentActivity = this;
                    mh.c(text, rVarD, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(x0Var, d92.b.a(o0VarE).k().a(), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0VarE, 0, 0, 131068);
                    o0VarE = o0VarE;
                    v5.a(0.0f, 6, 2, sn.a.c(o0VarE), x2.f(x2.h(aVar5, f18), 1.0f), o0VarE);
                    l.f(b0Var2.a(aVar5, 1.0f, true), o0VarE);
                    f0 f0Var = f0.f110999a;
                    String strQ = gl1.y.Q(o0VarE, R.string.lbl_common_continue);
                    h4.r rVarF4 = x2.f(aVar5, 1.0f);
                    bVar5.getClass();
                    h4.r rVarY2 = l.y(rVarF4, f16);
                    if (((Boolean) p1Var5.getF182175a()).booleanValue()) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    q2Var2 = q2Var;
                    zR = o0VarE.r(privacyPolicyConsentActivity) | o0VarE.r(q2Var2);
                    objQ = o0VarE.q();
                    c2565a3 = c2565a6;
                    if (zR || objQ == c2565a3) {
                        objQ = new z10.d(2, privacyPolicyConsentActivity, q2Var2);
                        o0VarE.K(objQ);
                    }
                    f0Var.d(0, 1, (e23.a) objQ, rVarY2, strQ, o0VarE, null, z15);
                    Unit unit2 = Unit.INSTANCE;
                    o0VarE.g0(false);
                    z16 = true;
                }
                objQ5 = new z10.d(i16, eVar5, this);
                o0VarE.K(objQ5);
                h4.r rVarD2 = w.d(rVarZ2, false, null, null, (e23.a) objQ5, 15);
                fVar2.getClass();
                p3.m.a.C2565a c2565a7 = c2565a2;
                privacyPolicyConsentActivity = this;
                mh.c(text, rVarD2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(x0Var, d92.b.a(o0VarE).k().a(), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0VarE, 0, 0, 131068);
                o0VarE = o0VarE;
                v5.a(0.0f, 6, 2, sn.a.c(o0VarE), x2.f(x2.h(aVar5, f18), 1.0f), o0VarE);
                l.f(b0Var2.a(aVar5, 1.0f, true), o0VarE);
                f0 f0Var2 = f0.f110999a;
                String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_common_continue);
                h4.r rVarF5 = x2.f(aVar5, 1.0f);
                bVar5.getClass();
                h4.r rVarY3 = l.y(rVarF5, f16);
                if (((Boolean) p1Var5.getF182175a()).booleanValue()) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                q2Var2 = q2Var;
                zR = o0VarE.r(privacyPolicyConsentActivity) | o0VarE.r(q2Var2);
                objQ = o0VarE.q();
                c2565a3 = c2565a7;
                if (zR) {
                    objQ = new z10.d(2, privacyPolicyConsentActivity, q2Var2);
                    o0VarE.K(objQ);
                } else {
                    objQ = new z10.d(2, privacyPolicyConsentActivity, q2Var2);
                    o0VarE.K(objQ);
                }
                f0Var2.d(0, 1, (e23.a) objQ, rVarY3, strQ2, o0VarE, null, z15);
                Unit unit3 = Unit.INSTANCE;
                o0VarE.g0(false);
                z16 = true;
            }
            o0VarE.g0(z16);
            if (((Boolean) p1Var4.getF182175a()).booleanValue()) {
                o0VarE.C(-1728170454);
                c1 c1Var = c1.f110940a;
                String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_privacy_policy_already_accepted);
                String strQ4 = gl1.y.Q(o0VarE, R.string.lbl_privacy_policy_already_accepted_msg);
                String upperCase = gl1.y.Q(o0VarE, R.string.lbl_ok).toUpperCase(Locale.ROOT);
                upperCase.getClass();
                boolean zR3 = o0VarE.r(privacyPolicyConsentActivity);
                Object objQ6 = o0VarE.q();
                if (zR3 || objQ6 == c2565a3) {
                    objQ6 = new l2(privacyPolicyConsentActivity, 0);
                    o0VarE.K(objQ6);
                }
                o0 o0Var = o0VarE;
                c1Var.a(false, strQ3, strQ4, null, null, upperCase, false, false, (e23.a) objQ6, null, null, o0Var, 0, 0, 1753);
                o0VarE = o0Var;
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1727742809);
                o0VarE.g0(false);
            }
        } else {
            privacyPolicyConsentActivity = this;
            q2Var2 = q2Var;
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new xm0.h(privacyPolicyConsentActivity, q2Var2, i14, 23);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, o13.l] */
    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean booleanExtra = getIntent().getBooleanExtra("extra_creation_consent_flow", false);
        p2 p2Var = (p2) this.f32221c.getValue();
        hl.a aVar = (hl.a) this.f32219a.getValue();
        x xVar = (x) this.f32220b.getValue();
        p2Var.getClass();
        aVar.getClass();
        xVar.getClass();
        ge1.b.T(v1.a(p2Var), null, null, new n2(p2Var, aVar, xVar, null), 3);
        initComposeScreen(new z3.e(-154222742, true, new k2(this, booleanExtra, 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/consent/PrivacyPolicyConsentActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Context context, hl.a aVar, x xVar, boolean z14) {
            context.getClass();
            aVar.getClass();
            xVar.getClass();
            Intent intent = new Intent(context, (Class<?>) PrivacyPolicyConsentActivity.class);
            intent.putExtra("GCM_extra_screen_access_role", aVar);
            intent.putExtra("consentType", xVar.name());
            intent.putExtra("extra_creation_consent_flow", z14);
            return intent;
        }

        public static /* synthetic */ Intent b(a aVar, Context context, hl.a aVar2, int i14) {
            x xVar = x.DI_CONNECT_PRIVACY;
            boolean z14 = (i14 & 8) == 0;
            aVar.getClass();
            return a(context, aVar2, xVar, z14);
        }

        private a() {
        }
    }
}
