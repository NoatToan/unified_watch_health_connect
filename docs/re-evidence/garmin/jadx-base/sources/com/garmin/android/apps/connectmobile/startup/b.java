package com.garmin.android.apps.connectmobile.startup;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.audio.WavUtil;
import d53.w;
import e23.p;
import e23.r;
import h5.e0;
import i3.i7;
import i3.mh;
import l72.c1;
import o13.n;
import o4.d0;
import o4.m1;
import o4.q1;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import q92.x;
import s5.i0;
import s5.r0;
import s5.x0;
import v62.e1;
import w5.c0;
import w5.f0;
import w5.q;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\u0010\u0010\b\u001a\u0004\u0018\u00010\u00078\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/startup/b;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "Laq1/e;", "uiState", "Lq92/x;", "reviewingConsentId", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f44801b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f44802a = o13.m.a(n.NONE, new e(this, null, new d(this), null, null));

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.startup.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C0855b implements r<Boolean, d0, p3.m, Integer, Unit> {
        public C0855b() {
        }

        @Override // e23.r
        public final Unit invoke(Boolean bool, d0 d0Var, p3.m mVar, Integer num) {
            bool.getClass();
            long j8 = d0Var.f128833a;
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if ((iIntValue & 48) == 0) {
                iIntValue |= mVar2.l(j8) ? 32 : 16;
            }
            byte b14 = 0;
            if (mVar2.n(iIntValue & 1, (iIntValue & 145) != 144)) {
                x1 x1Var = p3.n.f135158a;
                b82.c.b(null, null, z3.f.c(1445943254, new aq1.d(b.this, 3, b14), mVar2), null, j8, mVar2, ((iIntValue << 9) & 57344) | 384, 11);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44804a;

        static {
            int[] iArr = new int[x.values().length];
            try {
                iArr[x.DI_CONNECT_PRIVACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x.DI_CONNECT_UPLOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x.DI_CONNECT_INSIGHTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[x.DI_CONNECT_LIVETRACK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[x.DI_CONNECT_ADAPTIVE_TRAINING_PLAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[x.DI_CONNECT_PRODUCT_IMPROVEMENT_DATA_USAGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[x.DI_CONNECT_AUTO_ACTIVITY_DETECTION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f44804a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<androidx.fragment.app.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f44805a;

        public d(Fragment fragment) {
            this.f44805a = fragment;
        }

        @Override // e23.a
        public final androidx.fragment.app.m invoke() {
            return this.f44805a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<com.garmin.android.apps.connectmobile.startup.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f44806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f44807b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f44808c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f44809d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f44810e;

        public e(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f44806a = fragment;
            this.f44807b = qualifier;
            this.f44808c = aVar;
            this.f44809d = aVar2;
            this.f44810e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, com.garmin.android.apps.connectmobile.startup.e] */
        @Override // e23.a
        public final com.garmin.android.apps.connectmobile.startup.e invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f44808c.invoke();
            y1 f189591b = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f44806a;
            e23.a aVar = this.f44809d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(com.garmin.android.apps.connectmobile.startup.e.class), f189591b, null, defaultViewModelCreationExtras, this.f44807b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f44810e, 4, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.activity_composable_container, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        ((ComposeView) view2.findViewById(R.id.composable_container)).setContent(new z3.e(596694130, true, new aq1.d(this, 0, (byte) 0)));
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0442  */
    /* JADX WARN: Code duplicated, block: B:84:0x02df  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v29 */
    @SuppressLint({"UnsafeImplicitIntentLaunch"})
    public final void u6(final x xVar, final e23.a aVar, p3.m mVar, final int i14) {
        p2 p2VarI0;
        p<? super p3.m, ? super Integer, Unit> pVar;
        String strJ;
        int i15;
        int i16;
        String str;
        int i17;
        String strJ2;
        ?? r14;
        o0 o0VarE = mVar.E(-940134112);
        p3.c<?> cVar = o0VarE.f135177b;
        int i18 = i14 | (o0VarE.k(xVar.ordinal()) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(this) ? 256 : 128);
        if (o0VarE.n(i18 & 1, (i18 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            int[] iArr = c.f44804a;
            switch (iArr[xVar.ordinal()]) {
                case 1:
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1777431239, R.string.lbl_garmin_connect_privacy_policy, o0VarE, false);
                    str = strJ;
                    break;
                case 2:
                    i15 = 1777434618;
                    i16 = R.string.title_consent_upload;
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i15, i16, o0VarE, false);
                    str = strJ;
                    break;
                case 3:
                    i15 = 1777437652;
                    i16 = R.string.title_insights;
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i15, i16, o0VarE, false);
                    str = strJ;
                    break;
                case 4:
                    i15 = 1777440534;
                    i16 = R.string.title_live_track;
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i15, i16, o0VarE, false);
                    str = strJ;
                    break;
                case 5:
                    i15 = 1777443914;
                    i16 = R.string.title_consent_adaptive_training_plan;
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i15, i16, o0VarE, false);
                    str = strJ;
                    break;
                case 6:
                    i15 = 1777448172;
                    i16 = R.string.title_consent_gdpr_product_improvement;
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i15, i16, o0VarE, false);
                    str = strJ;
                    break;
                case 7:
                    i15 = 1777452257;
                    i16 = R.string.lbl_auto_activity_detection;
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i15, i16, o0VarE, false);
                    str = strJ;
                    break;
                default:
                    o0VarE.C(-733483952);
                    o0VarE.g0(false);
                    str = null;
                    break;
            }
            if (str == null) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i19 = 2;
                pVar = new p(this, xVar, aVar, i14, i19) { // from class: aq1.b

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f12348a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.garmin.android.apps.connectmobile.startup.b f12349b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ q92.x f12350c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ e23.a f12351d;

                    {
                        this.f12348a = i19;
                        this.f12349b = this;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        int i24 = this.f12348a;
                        e23.a aVar2 = this.f12351d;
                        q92.x xVar2 = this.f12350c;
                        com.garmin.android.apps.connectmobile.startup.b bVar = this.f12349b;
                        p3.m mVar2 = (p3.m) obj;
                        ((Integer) obj2).getClass();
                        com.garmin.android.apps.connectmobile.startup.b.a aVar3 = com.garmin.android.apps.connectmobile.startup.b.f44801b;
                        switch (i24) {
                            case 0:
                                bVar.u6(xVar2, aVar2, mVar2, p0.t(1));
                                break;
                            case 1:
                                bVar.u6(xVar2, aVar2, mVar2, p0.t(1));
                                break;
                            default:
                                bVar.u6(xVar2, aVar2, mVar2, p0.t(1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                int i24 = iArr[xVar.ordinal()];
                int i25 = R.string.msg_garmin_connect_privacy_policy;
                switch (i24) {
                    case 1:
                        i17 = -1715706738;
                        strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i17, i25, o0VarE, false);
                        break;
                    case 2:
                        i17 = -1715703349;
                        i25 = R.string.msg_storage_processing_consent;
                        strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i17, i25, o0VarE, false);
                        break;
                    case 3:
                        i17 = -1715699999;
                        i25 = R.string.msg_insights_consent;
                        strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i17, i25, o0VarE, false);
                        break;
                    case 4:
                        i17 = -1715696926;
                        i25 = R.string.msg_livetrack_consent;
                        strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i17, i25, o0VarE, false);
                        break;
                    case 5:
                        i17 = -1715693403;
                        i25 = R.string.msg_garmin_coach_consent;
                        strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i17, i25, o0VarE, false);
                        break;
                    case 6:
                        i17 = -1715689522;
                        strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i17, i25, o0VarE, false);
                        break;
                    case 7:
                        i17 = -1715685584;
                        i25 = R.string.msg_auto_activity_detection_consent;
                        strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i17, i25, o0VarE, false);
                        break;
                    default:
                        o0VarE.C(-1646566935);
                        o0VarE.g0(false);
                        strJ2 = null;
                        break;
                }
                if (strJ2 == null) {
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 == null) {
                        return;
                    }
                    final int i26 = 0;
                    pVar = new p(this, xVar, aVar, i14, i26) { // from class: aq1.b

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ int f12348a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ com.garmin.android.apps.connectmobile.startup.b f12349b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ q92.x f12350c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ e23.a f12351d;

                        {
                            this.f12348a = i26;
                            this.f12349b = this;
                        }

                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int i27 = this.f12348a;
                            e23.a aVar2 = this.f12351d;
                            q92.x xVar2 = this.f12350c;
                            com.garmin.android.apps.connectmobile.startup.b bVar = this.f12349b;
                            p3.m mVar2 = (p3.m) obj;
                            ((Integer) obj2).getClass();
                            com.garmin.android.apps.connectmobile.startup.b.a aVar3 = com.garmin.android.apps.connectmobile.startup.b.f44801b;
                            switch (i27) {
                                case 0:
                                    bVar.u6(xVar2, aVar2, mVar2, p0.t(1));
                                    break;
                                case 1:
                                    bVar.u6(xVar2, aVar2, mVar2, p0.t(1));
                                    break;
                                default:
                                    bVar.u6(xVar2, aVar2, mVar2, p0.t(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    h4.r.a aVar2 = h4.r.S;
                    h4.r rVarF = x2.f(aVar2, 1.0f);
                    d92.b.f58623a.getClass();
                    j92.b bVar = d92.b.f58625c;
                    bVar.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f14 = eVar.f97920e;
                    bVar.getClass();
                    h4.r rVarZ = c2.l.z(rVarF, f14, eVar.f97918c);
                    c2.j.f22691a.getClass();
                    c2.j.C0343j c0343j = c2.j.f22692b;
                    h4.d.f81522a.getClass();
                    s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
                    int iHashCode = Long.hashCode(o0VarE.U);
                    i2 i2VarA0 = o0VarE.a0();
                    h4.r rVarC = h4.k.c(rVarZ, o0VarE);
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
                    b4.c(eVar2, s2VarA, o0VarE);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarA0, o0VarE);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, o0VarE);
                    u2 u2Var = u2.f22900a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA = e1.a(t62.b.f162798a);
                    long jA = d92.b.a(o0VarE).f().a();
                    bVar.getClass();
                    h4.r rVarC2 = c2.l.C(aVar2, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14);
                    bVar.getClass();
                    i7.b(dVarA, null, x2.q(rVarC2, j92.b.f97901d.f97904c), jA, o0VarE, 48, 0);
                    bVar.getClass();
                    h4.r rVarC3 = c2.l.C(aVar2, eVar.f97920e, 0.0f, 0.0f, 0.0f, 14);
                    z zVarA = y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
                    int iHashCode2 = Long.hashCode(o0VarE.U);
                    i2 i2VarA1 = o0VarE.a0();
                    h4.r rVarC4 = h4.k.c(rVarC3, o0VarE);
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
                    b4.c(eVar2, zVarA, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                    }
                    b4.c(fVar, rVarC4, o0VarE);
                    b0 b0Var = b0.f22601a;
                    j92.f fVar2 = d92.b.f58624b;
                    fVar2.getClass();
                    String str2 = strJ2;
                    mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0VarE, 0, 0, 131070);
                    x xVar2 = x.DI_CONNECT_PRIVACY;
                    p3.m.a aVar4 = p3.m.f135153a;
                    if (xVar == xVar2) {
                        o0VarE.C(-1588109151);
                        String string = getString(R.string.lbl_garmin_connect_privacy_policy);
                        string.getClass();
                        i0 i0Var = new i0(d92.b.a(o0VarE).d().a().a(), 0L, (f0) null, (w5.b0) null, (c0) null, (q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (p005kotlin.jvm.internal.j) null);
                        boolean zR = o0VarE.r(this);
                        Object objQ = o0VarE.q();
                        if (zR) {
                            r14 = 0;
                            objQ = new aq1.c(this, 0 == true ? 1 : 0);
                            o0VarE.K(objQ);
                        } else {
                            aVar4.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                r14 = 0;
                                objQ = new aq1.c(this, 0 == true ? 1 : 0);
                                o0VarE.K(objQ);
                            } else {
                                r14 = 0;
                            }
                        }
                        e23.a aVar5 = (e23.a) objQ;
                        s5.c.b bVar3 = new s5.c.b(r14, 1, null);
                        int iH = w.H(str2, string, r14, r14, 6);
                        if (iH == -1) {
                            bVar3.b(str2);
                        } else {
                            bVar3.b(d53.y.s0(iH, str2));
                        }
                        int iG = bVar3.g(new s5.m.a("", new r0(i0Var, null, null, null, 14, null), new a92.a(aVar5, 1)));
                        try {
                            bVar3.b(string);
                            Unit unit = Unit.INSTANCE;
                            bVar3.f(iG);
                            bVar3.b(str2.substring(string.length() + iH, str2.length()));
                            s5.c cVarK = bVar3.k();
                            fVar2.getClass();
                            x0 x0VarF = d92.c.f(j92.f.f97935l, o0VarE);
                            bVar.getClass();
                            mh.d(cVarK, c2.l.C(aVar2, 0.0f, eVar.f97917b, 0.0f, 0.0f, 13), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, x0VarF, o0VarE, 0, 0, 262140);
                            o0VarE = o0VarE;
                            o0VarE.g0(false);
                        } catch (Throwable th3) {
                            bVar3.f(iG);
                            throw th3;
                        }
                    } else {
                        o0VarE.C(-1587407404);
                        fVar2.getClass();
                        x0 x0Var = j92.f.f97935l;
                        x0 x0VarF2 = d92.c.f(x0Var, o0VarE);
                        bVar.getClass();
                        mh.c(str2, c2.l.C(aVar2, 0.0f, eVar.f97917b, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF2, o0VarE, 0, 0, 131068);
                        if (aVar == null) {
                            o0VarE = o0VarE;
                            o0VarE.C(-1587148493);
                            o0VarE.g0(false);
                        } else {
                            o0VarE.C(-1587148492);
                            String strQ = gl1.y.Q(o0VarE, R.string.trails_view_review_header_title);
                            fVar2.getClass();
                            long jA2 = d92.b.a(o0VarE).k().a();
                            bVar.getClass();
                            h4.r rVarC5 = c2.l.C(aVar2, 0.0f, eVar.f97917b, 0.0f, 0.0f, 13);
                            boolean zB = o0VarE.B(aVar);
                            Object objQ2 = o0VarE.q();
                            if (zB) {
                                o0VarE = o0VarE;
                                o0VarE = o0VarE;
                                objQ2 = new defpackage.c(aVar, 21);
                                o0VarE.K(objQ2);
                            } else {
                                aVar4.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    o0VarE = o0VarE;
                                    o0VarE = o0VarE;
                                    objQ2 = new defpackage.c(aVar, 21);
                                    o0VarE.K(objQ2);
                                }
                            }
                            o0VarE = o0VarE;
                            mh.c(strQ, u1.w.d(rVarC5, false, null, null, (e23.a) objQ2, 15), jA2, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0VarE, 0, 0, 131064);
                            o0VarE = o0VarE;
                            Unit unit2 = Unit.INSTANCE;
                            o0VarE.g0(false);
                        }
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(true);
                    o0VarE.g0(true);
                }
            }
            p2VarI0.f135219d = pVar;
        }
        o0VarE.e();
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            final int i27 = 1;
            pVar = new p(this, xVar, aVar, i14, i27) { // from class: aq1.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f12348a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.startup.b f12349b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ q92.x f12350c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ e23.a f12351d;

                {
                    this.f12348a = i27;
                    this.f12349b = this;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i28 = this.f12348a;
                    e23.a aVar6 = this.f12351d;
                    q92.x xVar3 = this.f12350c;
                    com.garmin.android.apps.connectmobile.startup.b bVar4 = this.f12349b;
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).getClass();
                    com.garmin.android.apps.connectmobile.startup.b.a aVar7 = com.garmin.android.apps.connectmobile.startup.b.f44801b;
                    switch (i28) {
                        case 0:
                            bVar4.u6(xVar3, aVar6, mVar2, p0.t(1));
                            break;
                        case 1:
                            bVar4.u6(xVar3, aVar6, mVar2, p0.t(1));
                            break;
                        default:
                            bVar4.u6(xVar3, aVar6, mVar2, p0.t(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, o13.l] */
    public final void v6(p3.m mVar, int i14) {
        b bVar;
        o0 o0Var;
        o0 o0VarE = mVar.E(-1917387251);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(r53.s.d(((com.garmin.android.apps.connectmobile.startup.e) this.f44802a.getValue()).f44833f), o0VarE);
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(null);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            g.h hVar = new g.h();
            boolean zR = o0VarE.r(this);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new a42.i(13, p1Var, this);
                o0VarE.K(objQ2);
            }
            c.q qVarC = c.w.c(hVar, (e23.l) objQ2, o0VarE, 0);
            h4.r rVarE = u1.n.e(x2.d(h4.r.S, 1.0f), tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            boolean zIsEmpty = ((aq1.e) p1VarC.getF182175a()).f12364a.isEmpty();
            bVar = this;
            z3.e eVarC = z3.f.c(1635082583, new a42.z(this, context, p1VarC, qVarC, p1Var, 6), o0VarE);
            o0Var = o0VarE;
            g02.s0.a(rVarE, zIsEmpty, eVarC, o0Var, 384, 0);
            if (((aq1.e) p1VarC.getF182175a()).f12365b) {
                o0Var.C(-2108722391);
                c1 c1Var = c1.f110940a;
                String strQ = gl1.y.Q(o0Var, R.string.pregnancy_something_went_wrong);
                String strQ2 = gl1.y.Q(o0Var, R.string.msg_too_many_retries_child_consent);
                String strQ3 = gl1.y.Q(o0Var, R.string.lbl_close);
                boolean zR2 = o0Var.r(bVar);
                Object objQ3 = o0Var.q();
                if (zR2 || objQ3 == c2565a) {
                    objQ3 = new aq1.c(bVar, i16);
                    o0Var.K(objQ3);
                }
                c1Var.a(false, strQ, strQ2, null, null, strQ3, false, false, (e23.a) objQ3, null, null, o0Var, 6, 0, 1752);
                o0Var.g0(false);
            } else {
                o0Var.C(-2108311083);
                o0Var.g0(false);
            }
        } else {
            bVar = this;
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new aq1.d(bVar, i14);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/startup/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "PRIVACY_LINK", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
