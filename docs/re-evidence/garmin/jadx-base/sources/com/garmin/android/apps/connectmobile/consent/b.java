package com.garmin.android.apps.connectmobile.consent;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import c2.b0;
import c2.j;
import c2.l;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h4.g;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import l72.f0;
import o4.m1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import u1.a2;
import v.h;
import z10.d0;
import z10.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/consent/b;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f32262b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d0 f32263a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        this.f32263a = context instanceof d0 ? (d0) context : null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.activity_composable_container, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        ((ComposeView) view2.findViewById(R.id.composable_container)).setContent(new z3.e(-1791934919, true, new t(this, 0, (byte) 0)));
    }

    /* JADX WARN: Code duplicated, block: B:41:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:48:0x01f9  */
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
    public final void u6(m mVar, int i14) {
        final b bVar;
        boolean z14;
        o0 o0VarE = mVar.E(-147236256);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.r(this) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            r rVarD = x2.d(aVar, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarY = l.y(rVarD, eVar.f97920e);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            g.a aVar2 = h4.d.a.f81536n;
            z zVarA = y.a(kVar, aVar2, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
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
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            r rVarB = a2.b(b0.f22601a.a(aVar, 1.0f, true), a2.a(o0VarE), true);
            String strQ = gl1.y.Q(o0VarE, R.string.msg_atp_child_terms_and_conditions);
            d92.b.f58624b.getClass();
            mh.c(strQ, rVarB, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 131068);
            r rVarX = x2.x(x2.f(aVar, 1.0f), null, 3);
            bVar2.getClass();
            r rVarE = u1.n.e(l.y(rVarX, eVar.f97920e), ds.e0.w(o0VarE), m1.f128891a);
            final int i16 = 0;
            z zVarA2 = y.a(kVar, aVar2, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = k.c(rVarE, o0VarE);
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
            b4.c(eVar2, zVarA2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            }
            b4.c(fVar, rVarC2, o0VarE);
            f0 f0Var = f0.f110999a;
            String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_i_accept);
            r rVarF = x2.f(aVar, 1.0f);
            bVar = this;
            boolean zR = o0VarE.r(bVar);
            Object objQ = o0VarE.q();
            m.a aVar4 = m.f135153a;
            if (zR) {
                objQ = new e23.a(bVar) { // from class: z10.u

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.garmin.android.apps.connectmobile.consent.b f201261b;

                    {
                        this.f201261b = bVar;
                    }

                    @Override // e23.a
                    public final Object invoke() {
                        switch (i16) {
                            case 0:
                                d0 d0Var = this.f201261b.f32263a;
                                if (d0Var != null) {
                                    d0Var.S3();
                                }
                                break;
                            default:
                                d0 d0Var2 = this.f201261b.f32263a;
                                if (d0Var2 != null) {
                                    d0Var2.T1();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ);
            } else {
                aVar4.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new e23.a(bVar) { // from class: z10.u

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ com.garmin.android.apps.connectmobile.consent.b f201261b;

                        {
                            this.f201261b = bVar;
                        }

                        @Override // e23.a
                        public final Object invoke() {
                            switch (i16) {
                                case 0:
                                    d0 d0Var = this.f201261b.f32263a;
                                    if (d0Var != null) {
                                        d0Var.S3();
                                    }
                                    break;
                                default:
                                    d0 d0Var2 = this.f201261b.f32263a;
                                    if (d0Var2 != null) {
                                        d0Var2.T1();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ);
                }
            }
            f0Var.d(384, 9, (e23.a) objQ, rVarF, strQ2, o0VarE, null, false);
            o0VarE = o0VarE;
            String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_i_do_not_accept);
            r rVarF2 = x2.f(aVar, 1.0f);
            bVar2.getClass();
            r rVarC3 = l.C(rVarF2, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
            boolean zR2 = o0VarE.r(bVar);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                z14 = true;
                final char c14 = 1 == true ? 1 : 0;
                objQ2 = new e23.a(bVar) { // from class: z10.u

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.garmin.android.apps.connectmobile.consent.b f201261b;

                    {
                        this.f201261b = bVar;
                    }

                    @Override // e23.a
                    public final Object invoke() {
                        switch (c14) {
                            case 0:
                                d0 d0Var = this.f201261b.f32263a;
                                if (d0Var != null) {
                                    d0Var.S3();
                                }
                                break;
                            default:
                                d0 d0Var2 = this.f201261b.f32263a;
                                if (d0Var2 != null) {
                                    d0Var2.T1();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ2);
            } else {
                aVar4.getClass();
                if (objQ2 == m.a.f135155b) {
                    z14 = true;
                    final int c15 = 1 == true ? 1 : 0;
                    objQ2 = new e23.a(bVar) { // from class: z10.u

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ com.garmin.android.apps.connectmobile.consent.b f201261b;

                        {
                            this.f201261b = bVar;
                        }

                        @Override // e23.a
                        public final Object invoke() {
                            switch (c15) {
                                case 0:
                                    d0 d0Var = this.f201261b.f32263a;
                                    if (d0Var != null) {
                                        d0Var.S3();
                                    }
                                    break;
                                default:
                                    d0 d0Var2 = this.f201261b.f32263a;
                                    if (d0Var2 != null) {
                                        d0Var2.T1();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ2);
                } else {
                    z14 = true;
                }
            }
            f0Var.i(strQ3, rVarC3, false, (e23.a) objQ2, o0VarE, 0, 4);
            o0VarE.g0(z14);
            o0VarE.g0(z14);
        } else {
            bVar = this;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t(bVar, i14);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/consent/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
