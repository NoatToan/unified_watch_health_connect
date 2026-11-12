package com.garmin.android.apps.connectmobile.contacts.emergency;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import c2.b0;
import c2.h2;
import c2.j;
import c2.q;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.p;
import f5.z0;
import h4.k;
import h4.r;
import h5.e0;
import i3.b1;
import i3.c1;
import i3.h1;
import i3.mh;
import j20.t;
import j20.u;
import k2.i;
import l20.l;
import l72.f0;
import l72.p2;
import o4.d0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import s5.x0;
import v.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/emergency/e;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f32683b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f32684a = new w1(s0.f105811a.b(com.garmin.android.apps.connectmobile.contacts.emergency.d.class), new b(this), new d(this), new c(null, this));

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class b extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f32685a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f32685a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f32685a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f32686a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f32687b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e23.a aVar, Fragment fragment) {
            super(0);
            this.f32686a = aVar;
            this.f32687b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f32686a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f32687b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f32688a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f32688a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f32688a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(new z3.e(741588160, true, new u(this, 0)));
        if (w6().f32658q) {
            w6().Q4();
        }
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        g22.e.f(this);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:42:0x0103  */
    /* JADX WARN: Code duplicated, block: B:47:0x011e  */
    /* JADX WARN: Code duplicated, block: B:50:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:52:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:53:0x0204  */
    /* JADX WARN: Code duplicated, block: B:59:0x021f  */
    /* JADX WARN: Code duplicated, block: B:64:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:67:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:68:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:71:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:74:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:75:0x0302  */
    /* JADX WARN: Code duplicated, block: B:77:0x031b  */
    public final void u6(final e23.a<Unit> aVar, final e23.a<Unit> aVar2, e23.a<Unit> aVar3, m mVar, int i14) {
        p3.c<?> cVar;
        h5.g.a.f fVar;
        c2.u uVar;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        l20.c cVar2;
        String str;
        boolean z14;
        boolean z15;
        Object objQ;
        l20.c cVar3;
        e23.a<Unit> aVar4 = aVar3;
        o0 o0VarE = mVar.E(1715589622);
        p3.c<?> cVar4 = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.r(aVar) ? 4 : 2) | (o0VarE.r(aVar2) ? 32 : 16) | (o0VarE.r(aVar4) ? 256 : 128) | (o0VarE.r(this) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            p3.x1 x1Var = n.f135158a;
            final boolean zE4 = w6().E4(l.EMERGENCY_CONTACT);
            final boolean zE5 = w6().E4(l.LIVETRACK);
            r.a aVar5 = r.S;
            r rVarD = x2.d(aVar5, 1.0f);
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            e0.a aVar6 = h5.g.a.f81805b;
            String strV = null;
            if (cVar4 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                cVar = cVar4;
            } else {
                cVar = cVar4;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                uVar = c2.u.f22885a;
                j.f22691a.getClass();
                zVarA = y.a(j.f22694d, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(aVar5, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar6);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, zVarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(fVar, rVarC, o0VarE);
                b0 b0Var = b0.f22601a;
                String string = getString(R.string.lbl_send_new_requests);
                string.getClass();
                d92.b.f58623a.getClass();
                j92.f fVar2 = d92.b.f58624b;
                fVar2.getClass();
                x0 x0Var = j92.f.f97930g;
                long jD = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE);
                d6.h.f57752b.getClass();
                int i16 = d6.h.f57755e;
                r rVarF = x2.f(aVar5, 1.0f);
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar2 = j92.b.f97899b;
                float f14 = eVar2.f97921f;
                float f15 = eVar2.f97921f;
                float f16 = eVar2.f97918c;
                float f17 = eVar2.f97920e;
                bVar2.getClass();
                float f18 = eVar2.f97917b;
                bVar2.getClass();
                bVar2.getClass();
                mh.c(string, c2.l.B(rVarF, f17, f14, f17, f18), jD, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, x0Var, o0VarE, 0, 0, 130040);
                String string2 = getString(R.string.lbl_contact_request_options_send_request_message);
                string2.getClass();
                fVar2.getClass();
                x0 x0Var2 = j92.f.f97931h;
                long jD2 = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE);
                r rVarF2 = x2.f(aVar5, 1.0f);
                bVar2.getClass();
                bVar2.getClass();
                bVar2.getClass();
                bVar2.getClass();
                mh.c(string2, c2.l.B(rVarF2, f17, f16, f17, f15), jD2, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, x0Var2, o0VarE, 0, 0, 130040);
                if (w6().f32658q) {
                    cVar3 = w6().f32647f;
                    if (cVar3 != null) {
                        strV = cVar3.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                    }
                } else {
                    cVar2 = w6().f32647f;
                    if (cVar2 != null && (str = cVar2.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String()) != null) {
                        Context contextRequireContext = requireContext();
                        contextRequireContext.getClass();
                        strV = jg.b.v(contextRequireContext, str);
                    }
                }
                if (strV == null) {
                    strV = "";
                }
                fVar2.getClass();
                x0 x0Var3 = j92.f.f97936m;
                long jG = vb.h.g(o0VarE);
                int i17 = d6.h.f57753c;
                r rVarF3 = x2.f(aVar5, 1.0f);
                bVar2.getClass();
                bVar2.getClass();
                bVar2.getClass();
                bVar2.getClass();
                mh.c(strV, c2.l.B(rVarF3, f17, f15, f17, f16), jG, null, 0L, null, 0L, d6.h.a(i17), 0L, 0, false, 0, 0, null, x0Var3, o0VarE, 0, 0, 130040);
                o0VarE = o0VarE;
                p2 p2Var = p2.f111205a;
                String strQ = gl1.y.Q(o0VarE, R.string.incident_detection_emergency_contact);
                j20.a.f96546a.getClass();
                final int i18 = 0;
                p2Var.g(strQ, null, null, j20.a.f96547b, z3.f.c(-1201836913, new p(this) { // from class: j20.w

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.garmin.android.apps.connectmobile.contacts.emergency.e f96627b;

                    {
                        this.f96627b = this;
                    }

                    /* JADX WARN: Code duplicated, block: B:16:0x0097  */
                    /* JADX WARN: Code duplicated, block: B:41:0x019e  */
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        long jC;
                        u1.u uVar2;
                        long jC2;
                        u1.u uVar3;
                        int i19 = i18;
                        p3.m.a aVar7 = p3.m.f135153a;
                        int i24 = R.string.activities_indoor_climb_lbl_send;
                        e23.a aVar8 = aVar;
                        boolean z16 = zE4;
                        switch (i19) {
                            case 0:
                                p3.m mVar2 = (p3.m) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                com.garmin.android.apps.connectmobile.contacts.emergency.e.a aVar9 = com.garmin.android.apps.connectmobile.contacts.emergency.e.f32683b;
                                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    p3.x1 x1Var2 = p3.n.f135158a;
                                    if (z16) {
                                        i24 = R.string.lbl_connections_request_sent;
                                    }
                                    String strQ2 = gl1.y.Q(mVar2, i24);
                                    h4.r.a aVar10 = h4.r.S;
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    h4.r rVarY = c2.l.y(aVar10, j92.b.f97899b.f97916a);
                                    boolean z17 = !z16;
                                    c1 c1Var = c1.f87691a;
                                    long jE = d92.b.a(mVar2).e().e();
                                    long j8 = d92.b.a(mVar2).k().f63527d;
                                    long jC3 = com.nimbusds.jose.shaded.gson.internal.a.c(mVar2);
                                    long jD3 = d92.b.a(mVar2).k().d();
                                    c1Var.getClass();
                                    b1 b1VarA = c1.a(jE, j8, jC3, jD3, mVar2, 0);
                                    boolean zB = mVar2.B(aVar8);
                                    Object objQ2 = mVar2.q();
                                    if (zB) {
                                        objQ2 = new ii0.h(aVar8, 26);
                                        mVar2.K(objQ2);
                                    } else {
                                        aVar7.getClass();
                                        if (objQ2 == p3.m.a.f135155b) {
                                            objQ2 = new ii0.h(aVar8, 26);
                                            mVar2.K(objQ2);
                                        }
                                    }
                                    e23.a aVar11 = (e23.a) objQ2;
                                    if (z16) {
                                        mVar2.C(380960920);
                                        jC = d92.b.a(mVar2).k().d();
                                    } else {
                                        mVar2.C(380961912);
                                        jC = d92.b.a(mVar2).k().c();
                                    }
                                    mVar2.f();
                                    if (z16) {
                                        mVar2.C(380964497);
                                        g6.f.a aVar12 = g6.f.f75994b;
                                        u1.u uVarA = u1.n.a(1, d0.c(0.5f, d92.b.a(mVar2).j().d(), 14));
                                        mVar2.f();
                                        uVar2 = uVarA;
                                    } else {
                                        mVar2.C(-1074932978);
                                        mVar2.f();
                                        uVar2 = null;
                                    }
                                    this.f96627b.v6(strQ2, rVarY, z17, b1VarA, null, aVar11, jC, null, uVar2, mVar2, 0);
                                } else {
                                    mVar2.e();
                                }
                                break;
                            default:
                                p3.m mVar3 = (p3.m) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                com.garmin.android.apps.connectmobile.contacts.emergency.e.a aVar13 = com.garmin.android.apps.connectmobile.contacts.emergency.e.f32683b;
                                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    p3.x1 x1Var3 = p3.n.f135158a;
                                    if (z16) {
                                        i24 = R.string.lbl_connections_request_sent;
                                    }
                                    String strQ3 = gl1.y.Q(mVar3, i24);
                                    h4.r.a aVar14 = h4.r.S;
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    h4.r rVarY2 = c2.l.y(aVar14, j92.b.f97899b.f97916a);
                                    boolean z18 = !z16;
                                    c1 c1Var2 = c1.f87691a;
                                    long jE2 = d92.b.a(mVar3).e().e();
                                    long j14 = d92.b.a(mVar3).k().f63527d;
                                    long jB = x.b(mVar3);
                                    long jD4 = d92.b.a(mVar3).k().d();
                                    c1Var2.getClass();
                                    b1 b1VarA2 = c1.a(jE2, j14, jB, jD4, mVar3, 0);
                                    boolean zB2 = mVar3.B(aVar8);
                                    Object objQ3 = mVar3.q();
                                    if (zB2) {
                                        objQ3 = new ii0.h(aVar8, 25);
                                        mVar3.K(objQ3);
                                    } else {
                                        aVar7.getClass();
                                        if (objQ3 == p3.m.a.f135155b) {
                                            objQ3 = new ii0.h(aVar8, 25);
                                            mVar3.K(objQ3);
                                        }
                                    }
                                    e23.a aVar15 = (e23.a) objQ3;
                                    if (z16) {
                                        mVar3.C(377641857);
                                        jC2 = d92.b.a(mVar3).k().d();
                                    } else {
                                        mVar3.C(377642849);
                                        jC2 = d92.b.a(mVar3).k().c();
                                    }
                                    mVar3.f();
                                    long j15 = jC2;
                                    if (z16) {
                                        mVar3.C(377645210);
                                        g6.f.a aVar16 = g6.f.f75994b;
                                        u1.u uVarA2 = u1.n.a(1, d0.c(0.5f, d92.b.a(mVar3).j().d(), 14));
                                        mVar3.f();
                                        uVar3 = uVarA2;
                                    } else {
                                        mVar3.C(-1177830875);
                                        mVar3.f();
                                        uVar3 = null;
                                    }
                                    this.f96627b.v6(strQ3, rVarY2, z18, b1VarA2, null, aVar15, j15, null, uVar3, mVar3, 0);
                                } else {
                                    mVar3.e();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, o0VarE), false, false, null, o0VarE, 27648, 486);
                final int i19 = 1;
                p2Var.g(gl1.y.Q(o0VarE, R.string.lbl_livetrack_recipient), null, null, j20.a.f96548c, z3.f.c(898715960, new p(this) { // from class: j20.w

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.garmin.android.apps.connectmobile.contacts.emergency.e f96627b;

                    {
                        this.f96627b = this;
                    }

                    /* JADX WARN: Code duplicated, block: B:16:0x0097  */
                    /* JADX WARN: Code duplicated, block: B:41:0x019e  */
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        long jC;
                        u1.u uVar2;
                        long jC2;
                        u1.u uVar3;
                        int i110 = i19;
                        p3.m.a aVar7 = p3.m.f135153a;
                        int i24 = R.string.activities_indoor_climb_lbl_send;
                        e23.a aVar8 = aVar2;
                        boolean z16 = zE5;
                        switch (i110) {
                            case 0:
                                p3.m mVar2 = (p3.m) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                com.garmin.android.apps.connectmobile.contacts.emergency.e.a aVar9 = com.garmin.android.apps.connectmobile.contacts.emergency.e.f32683b;
                                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    p3.x1 x1Var2 = p3.n.f135158a;
                                    if (z16) {
                                        i24 = R.string.lbl_connections_request_sent;
                                    }
                                    String strQ2 = gl1.y.Q(mVar2, i24);
                                    h4.r.a aVar10 = h4.r.S;
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    h4.r rVarY = c2.l.y(aVar10, j92.b.f97899b.f97916a);
                                    boolean z17 = !z16;
                                    c1 c1Var = c1.f87691a;
                                    long jE = d92.b.a(mVar2).e().e();
                                    long j8 = d92.b.a(mVar2).k().f63527d;
                                    long jC3 = com.nimbusds.jose.shaded.gson.internal.a.c(mVar2);
                                    long jD3 = d92.b.a(mVar2).k().d();
                                    c1Var.getClass();
                                    b1 b1VarA = c1.a(jE, j8, jC3, jD3, mVar2, 0);
                                    boolean zB = mVar2.B(aVar8);
                                    Object objQ2 = mVar2.q();
                                    if (zB) {
                                        objQ2 = new ii0.h(aVar8, 26);
                                        mVar2.K(objQ2);
                                    } else {
                                        aVar7.getClass();
                                        if (objQ2 == p3.m.a.f135155b) {
                                            objQ2 = new ii0.h(aVar8, 26);
                                            mVar2.K(objQ2);
                                        }
                                    }
                                    e23.a aVar11 = (e23.a) objQ2;
                                    if (z16) {
                                        mVar2.C(380960920);
                                        jC = d92.b.a(mVar2).k().d();
                                    } else {
                                        mVar2.C(380961912);
                                        jC = d92.b.a(mVar2).k().c();
                                    }
                                    mVar2.f();
                                    if (z16) {
                                        mVar2.C(380964497);
                                        g6.f.a aVar12 = g6.f.f75994b;
                                        u1.u uVarA = u1.n.a(1, d0.c(0.5f, d92.b.a(mVar2).j().d(), 14));
                                        mVar2.f();
                                        uVar2 = uVarA;
                                    } else {
                                        mVar2.C(-1074932978);
                                        mVar2.f();
                                        uVar2 = null;
                                    }
                                    this.f96627b.v6(strQ2, rVarY, z17, b1VarA, null, aVar11, jC, null, uVar2, mVar2, 0);
                                } else {
                                    mVar2.e();
                                }
                                break;
                            default:
                                p3.m mVar3 = (p3.m) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                com.garmin.android.apps.connectmobile.contacts.emergency.e.a aVar13 = com.garmin.android.apps.connectmobile.contacts.emergency.e.f32683b;
                                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    p3.x1 x1Var3 = p3.n.f135158a;
                                    if (z16) {
                                        i24 = R.string.lbl_connections_request_sent;
                                    }
                                    String strQ3 = gl1.y.Q(mVar3, i24);
                                    h4.r.a aVar14 = h4.r.S;
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    h4.r rVarY2 = c2.l.y(aVar14, j92.b.f97899b.f97916a);
                                    boolean z18 = !z16;
                                    c1 c1Var2 = c1.f87691a;
                                    long jE2 = d92.b.a(mVar3).e().e();
                                    long j14 = d92.b.a(mVar3).k().f63527d;
                                    long jB = x.b(mVar3);
                                    long jD4 = d92.b.a(mVar3).k().d();
                                    c1Var2.getClass();
                                    b1 b1VarA2 = c1.a(jE2, j14, jB, jD4, mVar3, 0);
                                    boolean zB2 = mVar3.B(aVar8);
                                    Object objQ3 = mVar3.q();
                                    if (zB2) {
                                        objQ3 = new ii0.h(aVar8, 25);
                                        mVar3.K(objQ3);
                                    } else {
                                        aVar7.getClass();
                                        if (objQ3 == p3.m.a.f135155b) {
                                            objQ3 = new ii0.h(aVar8, 25);
                                            mVar3.K(objQ3);
                                        }
                                    }
                                    e23.a aVar15 = (e23.a) objQ3;
                                    if (z16) {
                                        mVar3.C(377641857);
                                        jC2 = d92.b.a(mVar3).k().d();
                                    } else {
                                        mVar3.C(377642849);
                                        jC2 = d92.b.a(mVar3).k().c();
                                    }
                                    mVar3.f();
                                    long j15 = jC2;
                                    if (z16) {
                                        mVar3.C(377645210);
                                        g6.f.a aVar16 = g6.f.f75994b;
                                        u1.u uVarA2 = u1.n.a(1, d0.c(0.5f, d92.b.a(mVar3).j().d(), 14));
                                        mVar3.f();
                                        uVar3 = uVarA2;
                                    } else {
                                        mVar3.C(-1177830875);
                                        mVar3.f();
                                        uVar3 = null;
                                    }
                                    this.f96627b.v6(strQ3, rVarY2, z18, b1VarA2, null, aVar15, j15, null, uVar3, mVar3, 0);
                                } else {
                                    mVar3.e();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, o0VarE), false, false, null, o0VarE, 27648, 486);
                o0VarE.g0(true);
                f0.a aVar7 = f0.a.f111000a;
                String strQ2 = gl1.y.Q(o0VarE, R.string.common_button_done);
                r rVarC3 = uVar.c(x2.f(aVar5, 1.0f), h4.d.a.f81531i);
                bVar2.getClass();
                r rVarY = c2.l.y(rVarC3, f17);
                if (zE5 || !zE4) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                if ((i15 & 896) == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objQ = o0VarE.q();
                if (z15) {
                    aVar4 = aVar3;
                    objQ = new ii0.h(aVar4, 27);
                    o0VarE.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        aVar4 = aVar3;
                        objQ = new ii0.h(aVar4, 27);
                        o0VarE.K(objQ);
                    } else {
                        aVar4 = aVar3;
                    }
                }
                aVar7.f(strQ2, rVarY, z14, (e23.a) objQ, o0VarE, 0, 0);
                o0VarE.g0(true);
            }
            h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            uVar = c2.u.f22885a;
            j.f22691a.getClass();
            zVarA = y.a(j.f22694d, h4.d.a.f81536n, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = k.c(aVar5, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var2 = b0.f22601a;
            String string3 = getString(R.string.lbl_send_new_requests);
            string3.getClass();
            d92.b.f58623a.getClass();
            j92.f fVar3 = d92.b.f58624b;
            fVar3.getClass();
            x0 x0Var4 = j92.f.f97930g;
            long jD3 = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE);
            d6.h.f57752b.getClass();
            int i110 = d6.h.f57755e;
            r rVarF4 = x2.f(aVar5, 1.0f);
            j92.b bVar3 = d92.b.f58625c;
            bVar3.getClass();
            j92.e eVar3 = j92.b.f97899b;
            float f19 = eVar3.f97921f;
            float f110 = eVar3.f97921f;
            float f111 = eVar3.f97918c;
            float f112 = eVar3.f97920e;
            bVar3.getClass();
            float f113 = eVar3.f97917b;
            bVar3.getClass();
            bVar3.getClass();
            mh.c(string3, c2.l.B(rVarF4, f112, f19, f112, f113), jD3, null, 0L, null, 0L, d6.h.a(i110), 0L, 0, false, 0, 0, null, x0Var4, o0VarE, 0, 0, 130040);
            String string4 = getString(R.string.lbl_contact_request_options_send_request_message);
            string4.getClass();
            fVar3.getClass();
            x0 x0Var5 = j92.f.f97931h;
            long jD4 = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE);
            r rVarF5 = x2.f(aVar5, 1.0f);
            bVar3.getClass();
            bVar3.getClass();
            bVar3.getClass();
            bVar3.getClass();
            mh.c(string4, c2.l.B(rVarF5, f112, f111, f112, f110), jD4, null, 0L, null, 0L, d6.h.a(i110), 0L, 0, false, 0, 0, null, x0Var5, o0VarE, 0, 0, 130040);
            if (w6().f32658q) {
                cVar3 = w6().f32647f;
                if (cVar3 != null) {
                    strV = cVar3.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                }
            } else {
                cVar2 = w6().f32647f;
                if (cVar2 != null) {
                    Context contextRequireContext2 = requireContext();
                    contextRequireContext2.getClass();
                    strV = jg.b.v(contextRequireContext2, str);
                }
            }
            if (strV == null) {
                strV = "";
            }
            fVar3.getClass();
            x0 x0Var6 = j92.f.f97936m;
            long jG2 = vb.h.g(o0VarE);
            int i111 = d6.h.f57753c;
            r rVarF6 = x2.f(aVar5, 1.0f);
            bVar3.getClass();
            bVar3.getClass();
            bVar3.getClass();
            bVar3.getClass();
            mh.c(strV, c2.l.B(rVarF6, f112, f110, f112, f111), jG2, null, 0L, null, 0L, d6.h.a(i111), 0L, 0, false, 0, 0, null, x0Var6, o0VarE, 0, 0, 130040);
            o0VarE = o0VarE;
            p2 p2Var2 = p2.f111205a;
            String strQ3 = gl1.y.Q(o0VarE, R.string.incident_detection_emergency_contact);
            j20.a.f96546a.getClass();
            final int i112 = 0;
            p2Var2.g(strQ3, null, null, j20.a.f96547b, z3.f.c(-1201836913, new p(this) { // from class: j20.w

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.contacts.emergency.e f96627b;

                {
                    this.f96627b = this;
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0097  */
                /* JADX WARN: Code duplicated, block: B:41:0x019e  */
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    long jC;
                    u1.u uVar2;
                    long jC2;
                    u1.u uVar3;
                    int i113 = i112;
                    p3.m.a aVar8 = p3.m.f135153a;
                    int i24 = R.string.activities_indoor_climb_lbl_send;
                    e23.a aVar9 = aVar;
                    boolean z16 = zE4;
                    switch (i113) {
                        case 0:
                            p3.m mVar2 = (p3.m) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            com.garmin.android.apps.connectmobile.contacts.emergency.e.a aVar10 = com.garmin.android.apps.connectmobile.contacts.emergency.e.f32683b;
                            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                p3.x1 x1Var2 = p3.n.f135158a;
                                if (z16) {
                                    i24 = R.string.lbl_connections_request_sent;
                                }
                                String strQ4 = gl1.y.Q(mVar2, i24);
                                h4.r.a aVar11 = h4.r.S;
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                h4.r rVarY2 = c2.l.y(aVar11, j92.b.f97899b.f97916a);
                                boolean z17 = !z16;
                                c1 c1Var = c1.f87691a;
                                long jE = d92.b.a(mVar2).e().e();
                                long j8 = d92.b.a(mVar2).k().f63527d;
                                long jC3 = com.nimbusds.jose.shaded.gson.internal.a.c(mVar2);
                                long jD5 = d92.b.a(mVar2).k().d();
                                c1Var.getClass();
                                b1 b1VarA = c1.a(jE, j8, jC3, jD5, mVar2, 0);
                                boolean zB = mVar2.B(aVar9);
                                Object objQ2 = mVar2.q();
                                if (zB) {
                                    objQ2 = new ii0.h(aVar9, 26);
                                    mVar2.K(objQ2);
                                } else {
                                    aVar8.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new ii0.h(aVar9, 26);
                                        mVar2.K(objQ2);
                                    }
                                }
                                e23.a aVar12 = (e23.a) objQ2;
                                if (z16) {
                                    mVar2.C(380960920);
                                    jC = d92.b.a(mVar2).k().d();
                                } else {
                                    mVar2.C(380961912);
                                    jC = d92.b.a(mVar2).k().c();
                                }
                                mVar2.f();
                                if (z16) {
                                    mVar2.C(380964497);
                                    g6.f.a aVar13 = g6.f.f75994b;
                                    u1.u uVarA = u1.n.a(1, d0.c(0.5f, d92.b.a(mVar2).j().d(), 14));
                                    mVar2.f();
                                    uVar2 = uVarA;
                                } else {
                                    mVar2.C(-1074932978);
                                    mVar2.f();
                                    uVar2 = null;
                                }
                                this.f96627b.v6(strQ4, rVarY2, z17, b1VarA, null, aVar12, jC, null, uVar2, mVar2, 0);
                            } else {
                                mVar2.e();
                            }
                            break;
                        default:
                            p3.m mVar3 = (p3.m) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            com.garmin.android.apps.connectmobile.contacts.emergency.e.a aVar14 = com.garmin.android.apps.connectmobile.contacts.emergency.e.f32683b;
                            if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                p3.x1 x1Var3 = p3.n.f135158a;
                                if (z16) {
                                    i24 = R.string.lbl_connections_request_sent;
                                }
                                String strQ5 = gl1.y.Q(mVar3, i24);
                                h4.r.a aVar15 = h4.r.S;
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                h4.r rVarY3 = c2.l.y(aVar15, j92.b.f97899b.f97916a);
                                boolean z18 = !z16;
                                c1 c1Var2 = c1.f87691a;
                                long jE2 = d92.b.a(mVar3).e().e();
                                long j14 = d92.b.a(mVar3).k().f63527d;
                                long jB = x.b(mVar3);
                                long jD6 = d92.b.a(mVar3).k().d();
                                c1Var2.getClass();
                                b1 b1VarA2 = c1.a(jE2, j14, jB, jD6, mVar3, 0);
                                boolean zB2 = mVar3.B(aVar9);
                                Object objQ3 = mVar3.q();
                                if (zB2) {
                                    objQ3 = new ii0.h(aVar9, 25);
                                    mVar3.K(objQ3);
                                } else {
                                    aVar8.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        objQ3 = new ii0.h(aVar9, 25);
                                        mVar3.K(objQ3);
                                    }
                                }
                                e23.a aVar16 = (e23.a) objQ3;
                                if (z16) {
                                    mVar3.C(377641857);
                                    jC2 = d92.b.a(mVar3).k().d();
                                } else {
                                    mVar3.C(377642849);
                                    jC2 = d92.b.a(mVar3).k().c();
                                }
                                mVar3.f();
                                long j15 = jC2;
                                if (z16) {
                                    mVar3.C(377645210);
                                    g6.f.a aVar17 = g6.f.f75994b;
                                    u1.u uVarA2 = u1.n.a(1, d0.c(0.5f, d92.b.a(mVar3).j().d(), 14));
                                    mVar3.f();
                                    uVar3 = uVarA2;
                                } else {
                                    mVar3.C(-1177830875);
                                    mVar3.f();
                                    uVar3 = null;
                                }
                                this.f96627b.v6(strQ5, rVarY3, z18, b1VarA2, null, aVar16, j15, null, uVar3, mVar3, 0);
                            } else {
                                mVar3.e();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), false, false, null, o0VarE, 27648, 486);
            final int i113 = 1;
            p2Var2.g(gl1.y.Q(o0VarE, R.string.lbl_livetrack_recipient), null, null, j20.a.f96548c, z3.f.c(898715960, new p(this) { // from class: j20.w

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.contacts.emergency.e f96627b;

                {
                    this.f96627b = this;
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0097  */
                /* JADX WARN: Code duplicated, block: B:41:0x019e  */
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    long jC;
                    u1.u uVar2;
                    long jC2;
                    u1.u uVar3;
                    int i114 = i113;
                    p3.m.a aVar8 = p3.m.f135153a;
                    int i24 = R.string.activities_indoor_climb_lbl_send;
                    e23.a aVar9 = aVar2;
                    boolean z16 = zE5;
                    switch (i114) {
                        case 0:
                            p3.m mVar2 = (p3.m) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            com.garmin.android.apps.connectmobile.contacts.emergency.e.a aVar10 = com.garmin.android.apps.connectmobile.contacts.emergency.e.f32683b;
                            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                p3.x1 x1Var2 = p3.n.f135158a;
                                if (z16) {
                                    i24 = R.string.lbl_connections_request_sent;
                                }
                                String strQ4 = gl1.y.Q(mVar2, i24);
                                h4.r.a aVar11 = h4.r.S;
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                h4.r rVarY2 = c2.l.y(aVar11, j92.b.f97899b.f97916a);
                                boolean z17 = !z16;
                                c1 c1Var = c1.f87691a;
                                long jE = d92.b.a(mVar2).e().e();
                                long j8 = d92.b.a(mVar2).k().f63527d;
                                long jC3 = com.nimbusds.jose.shaded.gson.internal.a.c(mVar2);
                                long jD5 = d92.b.a(mVar2).k().d();
                                c1Var.getClass();
                                b1 b1VarA = c1.a(jE, j8, jC3, jD5, mVar2, 0);
                                boolean zB = mVar2.B(aVar9);
                                Object objQ2 = mVar2.q();
                                if (zB) {
                                    objQ2 = new ii0.h(aVar9, 26);
                                    mVar2.K(objQ2);
                                } else {
                                    aVar8.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new ii0.h(aVar9, 26);
                                        mVar2.K(objQ2);
                                    }
                                }
                                e23.a aVar12 = (e23.a) objQ2;
                                if (z16) {
                                    mVar2.C(380960920);
                                    jC = d92.b.a(mVar2).k().d();
                                } else {
                                    mVar2.C(380961912);
                                    jC = d92.b.a(mVar2).k().c();
                                }
                                mVar2.f();
                                if (z16) {
                                    mVar2.C(380964497);
                                    g6.f.a aVar13 = g6.f.f75994b;
                                    u1.u uVarA = u1.n.a(1, d0.c(0.5f, d92.b.a(mVar2).j().d(), 14));
                                    mVar2.f();
                                    uVar2 = uVarA;
                                } else {
                                    mVar2.C(-1074932978);
                                    mVar2.f();
                                    uVar2 = null;
                                }
                                this.f96627b.v6(strQ4, rVarY2, z17, b1VarA, null, aVar12, jC, null, uVar2, mVar2, 0);
                            } else {
                                mVar2.e();
                            }
                            break;
                        default:
                            p3.m mVar3 = (p3.m) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            com.garmin.android.apps.connectmobile.contacts.emergency.e.a aVar14 = com.garmin.android.apps.connectmobile.contacts.emergency.e.f32683b;
                            if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                p3.x1 x1Var3 = p3.n.f135158a;
                                if (z16) {
                                    i24 = R.string.lbl_connections_request_sent;
                                }
                                String strQ5 = gl1.y.Q(mVar3, i24);
                                h4.r.a aVar15 = h4.r.S;
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                h4.r rVarY3 = c2.l.y(aVar15, j92.b.f97899b.f97916a);
                                boolean z18 = !z16;
                                c1 c1Var2 = c1.f87691a;
                                long jE2 = d92.b.a(mVar3).e().e();
                                long j14 = d92.b.a(mVar3).k().f63527d;
                                long jB = x.b(mVar3);
                                long jD6 = d92.b.a(mVar3).k().d();
                                c1Var2.getClass();
                                b1 b1VarA2 = c1.a(jE2, j14, jB, jD6, mVar3, 0);
                                boolean zB2 = mVar3.B(aVar9);
                                Object objQ3 = mVar3.q();
                                if (zB2) {
                                    objQ3 = new ii0.h(aVar9, 25);
                                    mVar3.K(objQ3);
                                } else {
                                    aVar8.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        objQ3 = new ii0.h(aVar9, 25);
                                        mVar3.K(objQ3);
                                    }
                                }
                                e23.a aVar16 = (e23.a) objQ3;
                                if (z16) {
                                    mVar3.C(377641857);
                                    jC2 = d92.b.a(mVar3).k().d();
                                } else {
                                    mVar3.C(377642849);
                                    jC2 = d92.b.a(mVar3).k().c();
                                }
                                mVar3.f();
                                long j15 = jC2;
                                if (z16) {
                                    mVar3.C(377645210);
                                    g6.f.a aVar17 = g6.f.f75994b;
                                    u1.u uVarA2 = u1.n.a(1, d0.c(0.5f, d92.b.a(mVar3).j().d(), 14));
                                    mVar3.f();
                                    uVar3 = uVarA2;
                                } else {
                                    mVar3.C(-1177830875);
                                    mVar3.f();
                                    uVar3 = null;
                                }
                                this.f96627b.v6(strQ5, rVarY3, z18, b1VarA2, null, aVar16, j15, null, uVar3, mVar3, 0);
                            } else {
                                mVar3.e();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), false, false, null, o0VarE, 27648, 486);
            o0VarE.g0(true);
            f0.a aVar8 = f0.a.f111000a;
            String strQ4 = gl1.y.Q(o0VarE, R.string.common_button_done);
            r rVarC4 = uVar.c(x2.f(aVar5, 1.0f), h4.d.a.f81531i);
            bVar3.getClass();
            r rVarY2 = c2.l.y(rVarC4, f112);
            if (zE5) {
                z14 = false;
            } else {
                z14 = false;
            }
            if ((i15 & 896) == 256) {
                z15 = true;
            } else {
                z15 = false;
            }
            objQ = o0VarE.q();
            if (z15) {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    aVar4 = aVar3;
                    objQ = new ii0.h(aVar4, 27);
                    o0VarE.K(objQ);
                } else {
                    aVar4 = aVar3;
                }
            } else {
                aVar4 = aVar3;
                objQ = new ii0.h(aVar4, 27);
                o0VarE.K(objQ);
            }
            aVar8.f(strQ4, rVarY2, z14, (e23.a) objQ, o0VarE, 0, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g52.d(this, aVar, aVar2, aVar4, i14, 28);
        }
    }

    public final void v6(String str, @SuppressLint({"ModifierParameter"}) r rVar, boolean z14, b1 b1Var, h2 h2Var, e23.a aVar, long j8, x0 x0Var, u1.u uVar, m mVar, int i14) {
        h2 h2Var2;
        x0 x0Var2;
        h2 h2VarA;
        int i15;
        x0 x0Var3;
        o0 o0VarE = mVar.E(-423092125);
        int i16 = i14 | 6 | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(rVar) ? 256 : 128) | (o0VarE.h(z14) ? 2048 : 1024) | (o0VarE.B(b1Var) ? 16384 : 8192) | 65536 | (o0VarE.r(aVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.l(j8) ? 8388608 : 4194304) | 33554432 | (o0VarE.B(uVar) ? 536870912 : 268435456);
        if (o0VarE.n(i16 & 1, (306783379 & i16) != 306783378)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                d92.b bVar = d92.b.f58623a;
                bVar.getClass();
                d92.b.f58625c.getClass();
                h2VarA = c2.l.a(j92.b.f97899b.f97918c);
                bVar.getClass();
                d92.b.f58624b.getClass();
                i15 = i16 & (-235339777);
                x0Var3 = j92.f.f97931h;
            } else {
                o0VarE.e();
                i15 = i16 & (-235339777);
                h2VarA = h2Var;
                x0Var3 = x0Var;
            }
            o0VarE.h0();
            p3.x1 x1Var = n.f135158a;
            long jC = z14 ? j8 : d0.c(0.5f, j8, 14);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            int i17 = i15 >> 3;
            h2 h2Var3 = h2VarA;
            h1.a(aVar, rVar, z14, i.a(j92.b.f97900c.f97910b), b1Var, null, uVar, h2Var3, null, z3.f.c(731360883, new cw1.m(x0Var3, jC, str, 1), o0VarE), o0VarE, (14 & (i15 >> 18)) | C.ENCODING_PCM_32BIT | (i17 & 112) | (i17 & 896) | (57344 & i15) | ((i15 >> 9) & 3670016), 288);
            h2Var2 = h2Var3;
            x0Var2 = x0Var3;
        } else {
            o0VarE.e();
            h2Var2 = h2Var;
            x0Var2 = x0Var;
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t(this, str, rVar, z14, b1Var, h2Var2, aVar, j8, x0Var2, uVar, i14, 0);
        }
    }

    public final com.garmin.android.apps.connectmobile.contacts.emergency.d w6() {
        return (com.garmin.android.apps.connectmobile.contacts.emergency.d) this.f32684a.getValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/emergency/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
