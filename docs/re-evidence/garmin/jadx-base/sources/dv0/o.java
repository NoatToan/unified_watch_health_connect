package dv0;

import b82.t0;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import d53.w;
import gl1.y;
import h5.e0;
import i3.ce;
import i3.fe;
import i3.ff;
import i3.hf;
import i3.mh;
import i3.yd;
import kotlin.m3;
import kotlin.t1;
import o4.d0;
import o53.b0;
import org.apache.commons.io.IOUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import r53.p2;
import s5.w0;
import s5.x0;
import x5.v;
import z2.t2;
import z2.u2;

/* JADX INFO: loaded from: classes9.dex */
public final class o {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.profile.LiveTrackProfileEditContentKt$LiveTrackProfileEditContent$1$1", f = "LiveTrackProfileEditContent.kt", l = {104}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f61417a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fe f61418b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f61419c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ yu0.f f61420d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x3<Boolean> f61421e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fe feVar, String str, yu0.f fVar, x3<Boolean> x3Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f61418b = feVar;
            this.f61419c = str;
            this.f61420d = fVar;
            this.f61421e = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f61418b, this.f61419c, this.f61420d, this.f61421e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            a aVar;
            Object value;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f61417a;
            if (i14 == 0) {
                o13.r.b(obj);
                if (this.f61421e.getF182175a().booleanValue()) {
                    yd ydVar = yd.Short;
                    this.f61417a = 1;
                    aVar = this;
                    if (fe.b(this.f61418b, this.f61419c, null, ydVar, aVar, 6) == aVar2) {
                        return aVar2;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            aVar = this;
            p2 p2Var = aVar.f61420d.f199715m;
            do {
                value = p2Var.getValue();
                ((Boolean) value).getClass();
            } while (!p2Var.b(value, Boolean.FALSE));
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f61422a;

        static {
            int[] iArr = new int[yu0.c.values().length];
            try {
                iArr[yu0.c.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[yu0.c.ERROR_INVALID_CHARACTERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[yu0.c.NORMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[yu0.c.SUCCESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f61422a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(yu0.f fVar, p3.m mVar, int i14) {
        final yu0.f fVar2 = fVar;
        fVar2.getClass();
        o0 o0VarE = mVar.E(1116229467);
        int i15 = (o0VarE.r(fVar2) ? 4 : 2) | i14;
        final int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(fVar2.f199723w, o0VarE);
            p1 p1VarC2 = s9.c.c(fVar2.f199712j, o0VarE);
            p1 p1VarC3 = s9.c.c(fVar2.f199718p, o0VarE);
            final p1 p1VarC4 = s9.c.c(fVar2.f199720r, o0VarE);
            final p1 p1VarC5 = s9.c.c(fVar2.f199722v, o0VarE);
            p1 p1VarC6 = s9.c.c(fVar2.f199716n, o0VarE);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = com.nimbusds.jose.shaded.gson.internal.a.f(o0VarE);
            }
            fe feVar = (fe) objQ;
            String strQ = y.Q(o0VarE, R.string.livetrack_save_url_error);
            ev0.c cVar = (ev0.c) ((g3) p1VarC2.getF182175a()).f35301b;
            boolean zB = o0VarE.B(cVar != null ? cVar.f66154c : null);
            Object objQ2 = o0VarE.q();
            if (zB || objQ2 == c2565a) {
                ev0.c cVar2 = (ev0.c) ((g3) p1VarC2.getF182175a()).f35301b;
                String str = cVar2 != null ? cVar2.f66154c : null;
                objQ2 = (str == null || w.J(str)) ? "" : tn.k.g(w.l0(w.i0(str).toString(), IOUtils.DIR_SEPARATOR_UNIX), "/");
                o0VarE.K(objQ2);
            }
            String str2 = (String) objQ2;
            Boolean bool = (Boolean) p1VarC6.getF182175a();
            bool.booleanValue();
            boolean zB2 = o0VarE.B(p1VarC6) | o0VarE.B(strQ) | o0VarE.r(fVar2);
            Object objQ3 = o0VarE.q();
            if (zB2 || objQ3 == c2565a) {
                a aVar = new a(feVar, strQ, fVar2, p1VarC6, null);
                o0VarE.K(aVar);
                objQ3 = aVar;
            }
            l0.e((e23.p) objQ3, bool, o0VarE);
            h4.r.a aVar2 = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar2, o0VarE);
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
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            String strQ2 = y.Q(o0VarE, R.string.lbl_displays_current_and_past_sessions);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97933j, o0VarE);
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar2.getClass();
            mh.c(strQ2, c2.l.z(aVar2, eVar.f97920e, f14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
            l72.p2 p2Var = l72.p2.f111205a;
            fVar2 = fVar;
            p2Var.b(null, z3.f.c(654441959, new d50.i(str2, fVar2, p1VarC3, p1VarC, 6), o0VarE), null, z3.f.c(-461526167, new l(p1VarC, i16), o0VarE), o0VarE, 3504, 1);
            String strQ3 = y.Q(o0VarE, R.string.lbl_protect_with_access_code);
            String strQ4 = y.Q(o0VarE, R.string.lbl_protect_with_access_code_info);
            z3.e eVarC = z3.f.c(-451807016, new e23.p() { // from class: dv0.m
                /* JADX WARN: Code duplicated, block: B:34:0x00fe  */
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i17 = i16;
                    p3.m.a aVar4 = p3.m.f135153a;
                    x3 x3Var = p1VarC5;
                    yu0.f fVar3 = fVar2;
                    int i18 = 2;
                    int i19 = 1;
                    switch (i17) {
                        case 0:
                            p3.m mVar2 = (p3.m) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (mVar2.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                                x1 x1Var2 = p3.n.f135158a;
                                boolean zBooleanValue = ((Boolean) x3Var.getF182175a()).booleanValue();
                                boolean zR = mVar2.r(fVar3);
                                Object objQ4 = mVar2.q();
                                if (zR) {
                                    objQ4 = new d(fVar3, i18);
                                    mVar2.K(objQ4);
                                } else {
                                    aVar4.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        objQ4 = new d(fVar3, i18);
                                        mVar2.K(objQ4);
                                    }
                                }
                                hf.a(zBooleanValue, (e23.l) objQ4, null, false, d92.c.a(ff.f88115a, mVar2), mVar2, 0, 92);
                            } else {
                                mVar2.e();
                            }
                            break;
                        default:
                            p3.m mVar3 = (p3.m) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                x1 x1Var3 = p3.n.f135158a;
                                t0 t0Var = t0.f16792a;
                                h4.r.a aVar5 = h4.r.S;
                                String strQ5 = y.Q(mVar3, R.string.lbl_your_access_code);
                                String str3 = (String) x3Var.getF182175a();
                                String str4 = (String) x3Var.getF182175a();
                                fVar3.getClass();
                                str4.getClass();
                                boolean z14 = !fVar3.f199704b.i(str4);
                                v.f188954b.getClass();
                                int i24 = v.f188955c;
                                x5.p.f188918b.getClass();
                                int i25 = x5.p.f188926j;
                                Object objQ5 = mVar3.q();
                                aVar4.getClass();
                                p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                                if (objQ5 == c2565a2) {
                                    objQ5 = new n(0);
                                    mVar3.K(objQ5);
                                }
                                e23.l<? super x5.l0, x5.l0> lVar = (e23.l) objQ5;
                                boolean zR2 = mVar3.r(fVar3);
                                Object objQ6 = mVar3.q();
                                if (zR2 || objQ6 == c2565a2) {
                                    objQ6 = new d(fVar3, i19);
                                    mVar3.K(objQ6);
                                }
                                e23.l<? super String, Unit> lVar2 = (e23.l) objQ6;
                                boolean zR3 = mVar3.r(fVar3) | mVar3.B(x3Var);
                                Object objQ7 = mVar3.q();
                                if (zR3 || objQ7 == c2565a2) {
                                    objQ7 = new cn1.d(24, fVar3, x3Var);
                                    mVar3.K(objQ7);
                                }
                                t0Var.j(aVar5, strQ5, str3, 64, z14, lVar, lVar2, (e23.l) objQ7, i24, i25, null, mVar3, 906169350, 0, 1024);
                            } else {
                                mVar3.e();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE);
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = new dh0.j(15);
                o0VarE.K(objQ4);
            }
            p2Var.h(strQ3, strQ4, null, null, null, false, false, null, eVarC, null, (e23.a) objQ4, o0VarE, 100663296, 6, 764);
            if (((Boolean) p1VarC5.getF182175a()).booleanValue()) {
                o0VarE.C(1756932605);
                final int i17 = 1;
                z3.e eVarC2 = z3.f.c(1803709804, new e23.p() { // from class: dv0.m
                    /* JADX WARN: Code duplicated, block: B:34:0x00fe  */
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        int i18 = i17;
                        p3.m.a aVar4 = p3.m.f135153a;
                        x3 x3Var = p1VarC4;
                        yu0.f fVar3 = fVar2;
                        int i19 = 2;
                        int i110 = 1;
                        switch (i18) {
                            case 0:
                                p3.m mVar2 = (p3.m) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (mVar2.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                                    x1 x1Var2 = p3.n.f135158a;
                                    boolean zBooleanValue = ((Boolean) x3Var.getF182175a()).booleanValue();
                                    boolean zR = mVar2.r(fVar3);
                                    Object objQ5 = mVar2.q();
                                    if (zR) {
                                        objQ5 = new d(fVar3, i19);
                                        mVar2.K(objQ5);
                                    } else {
                                        aVar4.getClass();
                                        if (objQ5 == p3.m.a.f135155b) {
                                            objQ5 = new d(fVar3, i19);
                                            mVar2.K(objQ5);
                                        }
                                    }
                                    hf.a(zBooleanValue, (e23.l) objQ5, null, false, d92.c.a(ff.f88115a, mVar2), mVar2, 0, 92);
                                } else {
                                    mVar2.e();
                                }
                                break;
                            default:
                                p3.m mVar3 = (p3.m) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    x1 x1Var3 = p3.n.f135158a;
                                    t0 t0Var = t0.f16792a;
                                    h4.r.a aVar5 = h4.r.S;
                                    String strQ5 = y.Q(mVar3, R.string.lbl_your_access_code);
                                    String str3 = (String) x3Var.getF182175a();
                                    String str4 = (String) x3Var.getF182175a();
                                    fVar3.getClass();
                                    str4.getClass();
                                    boolean z14 = !fVar3.f199704b.i(str4);
                                    v.f188954b.getClass();
                                    int i24 = v.f188955c;
                                    x5.p.f188918b.getClass();
                                    int i25 = x5.p.f188926j;
                                    Object objQ6 = mVar3.q();
                                    aVar4.getClass();
                                    p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                                    if (objQ6 == c2565a2) {
                                        objQ6 = new n(0);
                                        mVar3.K(objQ6);
                                    }
                                    e23.l<? super x5.l0, x5.l0> lVar = (e23.l) objQ6;
                                    boolean zR2 = mVar3.r(fVar3);
                                    Object objQ7 = mVar3.q();
                                    if (zR2 || objQ7 == c2565a2) {
                                        objQ7 = new d(fVar3, i110);
                                        mVar3.K(objQ7);
                                    }
                                    e23.l<? super String, Unit> lVar2 = (e23.l) objQ7;
                                    boolean zR3 = mVar3.r(fVar3) | mVar3.B(x3Var);
                                    Object objQ8 = mVar3.q();
                                    if (zR3 || objQ8 == c2565a2) {
                                        objQ8 = new cn1.d(24, fVar3, x3Var);
                                        mVar3.K(objQ8);
                                    }
                                    t0Var.j(aVar5, strQ5, str3, 64, z14, lVar, lVar2, (e23.l) objQ8, i24, i25, null, mVar3, 906169350, 0, 1024);
                                } else {
                                    mVar3.e();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, o0VarE);
                dv0.b.f61355a.getClass();
                p2Var.b(null, eVarC2, null, dv0.b.f61356b, o0VarE, 3504, 1);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1758377949);
                o0VarE.g0(false);
            }
            c2.l.f(b0Var.a(aVar2, 1.0f, true), o0VarE);
            ce.b(feVar, x2.f(aVar2, 1.0f), null, o0VarE, 54, 4);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new dh1.a(fVar2, i14, 6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(h4.r rVar, String str, String str2, boolean z14, e23.l lVar, e23.l lVar2, p3.m mVar, int i14) {
        p3.m.a.C2565a c2565a;
        o0 o0Var;
        o0 o0VarE = mVar.E(784674015);
        int i15 = i14 | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(str2) ? 256 : 128) | (o0VarE.h(z14) ? 16384 : 8192) | (o0VarE.r(lVar) ? 131072 : 65536) | (o0VarE.r(lVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
            if (objQ == c2565a2) {
                objQ = new i2.c();
                o0VarE.K(objQ);
            }
            i2.a aVar = (i2.a) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a2) {
                objQ2 = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ2);
            }
            b0 b0Var = (b0) objQ2;
            m4.q qVar = (m4.q) o0VarE.A(t1.f91491i);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a2) {
                objQ3 = kg.f.j(o0VarE);
            }
            m4.b0 b0Var2 = (m4.b0) objQ3;
            m3 m3Var = (m3) o0VarE.A(t1.f91499q);
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a2) {
                objQ4 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ4);
            }
            p1 p1Var = (p1) objQ4;
            x3 x3VarB = s1.f.b((((Boolean) p1Var.getF182175a()).booleanValue() || str2.length() != 0) ? -1.0f : 0.0f, s1.l.d(300, 0, null, 6), "", o0VarE, 3120, 20);
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a2) {
                int length = str2.length();
                o0Var = o0VarE;
                c2565a = c2565a2;
                objQ5 = p0.n(new x5.l0(str2, og.a.l(length, length), (w0) null, 4, (p005kotlin.jvm.internal.j) null));
                o0Var.K(objQ5);
            } else {
                c2565a = c2565a2;
                o0Var = o0VarE;
            }
            p1 p1Var2 = (p1) objQ5;
            t2 t2Var = new t2(ds.e0.d(d92.b.f58623a, o0Var), d0.c(0.4f, d92.b.a(o0Var).k().b(), 14), null);
            boolean z15 = (i15 & 896) == 256;
            Object objQ6 = o0Var.q();
            if (z15 || objQ6 == c2565a) {
                objQ6 = new b82.b0(1, str2, p1Var2);
                o0Var.K(objQ6);
            }
            l0.a(str2, (e23.l) objQ6, o0Var);
            o0VarE = o0Var;
            p3.v.a(u2.f201804a.c(t2Var), z3.f.c(2063987103, new ds.b(rVar, m3Var, b0Var2, p1Var, z14, x3VarB, str, b0Var, aVar, p1Var2, qVar, lVar, lVar2), o0VarE), o0VarE, 56);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ck0.h(rVar, str, str2, z14, lVar, lVar2, i14);
        }
    }

    public static final String c(String str, String str2) {
        if (w.J(str)) {
            return "";
        }
        String string = w.i0(str).toString();
        if (str2.length() > 0) {
            String strR = w.R(str2, "/");
            while (d53.u.y(string, str2, true)) {
                string = w.O(string, str2);
            }
            while (d53.u.y(string, strR, true)) {
                string = w.O(w.O(string, strR), "/");
            }
        }
        return string;
    }
}
