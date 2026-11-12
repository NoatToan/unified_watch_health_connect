package jt1;

import a11.h0;
import am.l1;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.q;
import c2.q2;
import c2.s2;
import c2.t0;
import c2.u2;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.audio.WavUtil;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.p;
import f5.g0;
import f5.z0;
import gl1.y;
import h5.e0;
import i3.e5;
import i3.mh;
import i3.p7;
import i3.u;
import java.util.List;
import jf.s;
import l72.v2;
import o13.r;
import o4.m1;
import o4.q1;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.n1;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.v;
import p3.x1;
import p3.y3;
import pt1.x;
import s5.i0;
import s5.x0;
import u1.w;
import u1.y0;
import w5.c0;
import w5.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class k {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.composables.trail.reviews.SingleTrailReviewKt$SingleTrailReview$2$1", f = "SingleTrailReview.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p1<String> f100848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x f100849b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f100850c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p1<String> p1Var, x xVar, p1<Boolean> p1Var2, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f100848a = p1Var;
            this.f100849b = xVar;
            this.f100850c = p1Var2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f100848a, this.f100849b, this.f100850c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            x xVar = this.f100849b;
            this.f100848a.setValue(xVar.f141017n);
            String str = xVar.f141017n;
            if (str != null && g22.n.d(str)) {
                this.f100850c.setValue(Boolean.TRUE);
            }
            return Unit.INSTANCE;
        }
    }

    public static final void a(List<? extends us1.g> list, p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(1839540321);
        int i15 = (o0VarE.r(list) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            String strQ = y.Q(o0VarE, R.string.activity_details_conditions);
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97918c;
            float f15 = eVar.f97918c;
            h4.r rVarC = c2.l.C(aVar, 0.0f, 0.0f, 0.0f, f14, 7);
            d92.b.f58624b.getClass();
            o0Var = o0VarE;
            mh.c(strQ, rVarC, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97937n, o0VarE), o0Var, 0, 0, 131068);
            bVar.getClass();
            h4.r rVarC2 = c2.l.C(aVar, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7);
            c2.j jVar = c2.j.f22691a;
            bVar.getClass();
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f15);
            bVar.getClass();
            t0.a(rVarC2, iVarI, c2.j.i(f15), null, 0, 0, z3.f.c(-458098810, new a31.a(list, 9), o0Var), o0Var, 1572864, 56);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a31.b(list, i14, 11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0151  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(x xVar, boolean z14, p1 p1Var, p1 p1Var2, e23.l lVar, e23.l lVar2, p1 p1Var3, e23.l lVar3, e23.l lVar4, e23.l lVar5, e23.l lVar6, p3.m mVar, int i14, int i15) {
        int i16;
        e23.l lVar7;
        e23.l lVar8;
        p1 p1Var4;
        e23.l lVar9;
        e23.l lVar10;
        e23.l lVar11;
        int i17;
        o0 o0Var;
        o0 o0VarE = mVar.E(-918302768);
        if ((i14 & 6) == 0) {
            i16 = ((i14 & 8) == 0 ? o0VarE.B(xVar) : o0VarE.r(xVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.h(z14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.B(p1Var) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.B(p1Var2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            lVar7 = lVar;
            i16 |= o0VarE.r(lVar7) ? 16384 : 8192;
        } else {
            lVar7 = lVar;
        }
        if ((196608 & i14) == 0) {
            lVar8 = lVar2;
            i16 |= o0VarE.r(lVar8) ? 131072 : 65536;
        } else {
            lVar8 = lVar2;
        }
        if ((1572864 & i14) == 0) {
            p1Var4 = p1Var3;
            i16 |= o0VarE.B(p1Var4) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            p1Var4 = p1Var3;
        }
        if ((12582912 & i14) == 0) {
            lVar9 = lVar3;
            i16 |= o0VarE.r(lVar9) ? 8388608 : 4194304;
        } else {
            lVar9 = lVar3;
        }
        if ((100663296 & i14) == 0) {
            lVar10 = lVar4;
            i16 |= o0VarE.r(lVar10) ? 67108864 : 33554432;
        } else {
            lVar10 = lVar4;
        }
        if ((805306368 & i14) == 0) {
            lVar11 = lVar5;
            i16 |= o0VarE.r(lVar11) ? 536870912 : 268435456;
        } else {
            lVar11 = lVar5;
        }
        if ((i15 & 6) == 0) {
            i17 = i15 | (o0VarE.r(lVar6) ? 4 : 2);
        } else {
            i17 = i15;
        }
        if (o0VarE.n(i16 & 1, ((i16 & 306783379) == 306783378 && (i17 & 3) == 2) ? false : true)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            h4.r rVarE = u1.n.e(aVar, d92.b.a(o0VarE).c().g(), m1.f128891a);
            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
            boolean z15 = (i16 & 896) == 256;
            Object objQ = o0VarE.q();
            if (z15) {
                objQ = new h(p1Var, 0);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new h(p1Var, 0);
                    o0VarE.K(objQ);
                }
            }
            e23.l lVar12 = lVar10;
            o0Var = o0VarE;
            u.a(zBooleanValue, (e23.a) objQ, rVarE, 0L, null, null, null, 0L, 0.0f, 0.0f, z3.f.c(-1187409675, new dv0.e(xVar, lVar12, lVar9, p1Var, lVar8, z14, lVar11, p1Var4, p1Var2, lVar7, lVar6), o0VarE), o0Var, 0, 48, 2040);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(xVar, z14, p1Var, p1Var2, lVar, lVar2, p1Var3, lVar3, lVar4, lVar5, lVar6, i14, i15);
        }
    }

    public static final void c(kt1.b bVar, h4.r rVar, e23.a aVar, p3.m mVar, int i14) {
        h4.r rVar2;
        boolean z14;
        bVar.getClass();
        boolean z15 = bVar.f106454h;
        aVar.getClass();
        o0 o0VarE = mVar.E(1225040434);
        int i15 = i14 | (o0VarE.B(bVar) ? 4 : 2) | 48 | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            h4.r.a aVar2 = h4.r.S;
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = e5.o(0, o0VarE);
            }
            n1 n1Var = (n1) objQ;
            wf.f.a aVar3 = new wf.f.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            aVar3.f184930c = bVar.f106449c;
            xf.a.b bVar2 = xf.a.b.f190608a;
            int iG = (int) w02.b0.g(gl.b.q(o0VarE, R.dimen.trail_review_image_carousel_height), o0VarE);
            xf.b.a(iG);
            aVar3.c(new xf.g(bVar2, xf.a.C3547a.a(iG)));
            jf.d dVarA = s.a(aVar3.a(), null, o0VarE, 0, 30);
            if (((jf.d.c) p0.c(dVarA.f98632q, o0VarE, 0).getF182175a()) instanceof jf.d.c.C1894d) {
                o0VarE.C(843114957);
                h4.r rVarH = x2.h(aVar2, gl.b.q(o0VarE, R.dimen.trail_review_image_carousel_height));
                h4.d.f81522a.getClass();
                z0 z0VarD = q.d(h4.d.a.f81524b, false);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC = h4.k.c(rVarH, o0VarE);
                h5.g.V.getClass();
                e0.a aVar4 = h5.g.a.f81805b;
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
                b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                h5.g.a.b bVar3 = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.u uVar = c2.u.f22885a;
                String strQ = y.Q(o0VarE, R.string.go_to_trail_photo_content_description);
                boolean z16 = (i15 & 896) == 256;
                Object objQ2 = o0VarE.q();
                if (z16 || objQ2 == c2565a) {
                    objQ2 = new j22.d(aVar, 10);
                    o0VarE.K(objQ2);
                }
                rVar2 = aVar2;
                h4.r rVarA = v2.a(x2.c(w.d(aVar2, false, strQ, null, (e23.a) objQ2, 13), 1.0f), z15, new jl1.a(7), o0VarE, 0);
                Object objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = new h0(n1Var, 20);
                    o0VarE.K(objQ3);
                }
                h4.r rVarF = g0.f(rVarA, (e23.l) objQ3);
                f5.k.f68985a.getClass();
                y0.a(dVarA, null, rVarF, null, f5.k.a.f68989d, 0.0f, null, o0VarE, 24624, 104);
                if (z15) {
                    o0VarE.C(1980729226);
                    String strQ2 = y.Q(o0VarE, R.string.review_photo_hidden_message);
                    h4.r rVarU = x2.u(uVar.c(rVar2, h4.d.a.f81528f), w02.b0.w(n1Var.getIntValue(), o0VarE));
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarA = x0.a(j92.f.f97933j, d92.b.a(o0VarE).k().f63527d, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                    d6.h.f57752b.getClass();
                    z14 = false;
                    mh.c(strQ2, rVarU, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarA, o0VarE, 0, 0, 130044);
                    o0VarE = o0VarE;
                    o0VarE.g0(false);
                } else {
                    z14 = false;
                    o0VarE.C(1981241873);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                o0VarE.g0(z14);
            } else {
                rVar2 = aVar2;
                o0VarE.C(844532432);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new gw1.c(bVar, rVar2, aVar, i14, 29);
        }
    }

    public static final void d(List<? extends us1.i> list, p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(339000418);
        int i15 = (o0VarE.r(list) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            String strQ = y.Q(o0VarE, R.string.lbl_trail_features);
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97918c;
            float f15 = eVar.f97918c;
            h4.r rVarC = c2.l.C(aVar, 0.0f, 0.0f, 0.0f, f14, 7);
            d92.b.f58624b.getClass();
            o0Var = o0VarE;
            mh.c(strQ, rVarC, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97937n, o0VarE), o0Var, 0, 0, 131068);
            bVar.getClass();
            h4.r rVarC2 = c2.l.C(aVar, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7);
            c2.j jVar = c2.j.f22691a;
            bVar.getClass();
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f15);
            bVar.getClass();
            t0.a(rVarC2, iVarI, c2.j.i(f15), null, 0, 0, z3.f.c(265445149, new a31.a(list, 10), o0Var), o0Var, 1572864, 56);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a31.b(list, i14, 12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0175  */
    /* JADX WARN: Code duplicated, block: B:109:0x018e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0197 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x0199  */
    /* JADX WARN: Code duplicated, block: B:114:0x019b  */
    /* JADX WARN: Code duplicated, block: B:117:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:118:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:121:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:122:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:125:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:128:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:131:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:134:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:137:0x025a  */
    /* JADX WARN: Code duplicated, block: B:139:0x0263  */
    /* JADX WARN: Code duplicated, block: B:140:0x0267  */
    /* JADX WARN: Code duplicated, block: B:143:0x027c  */
    /* JADX WARN: Code duplicated, block: B:146:0x028d  */
    /* JADX WARN: Code duplicated, block: B:150:0x029d  */
    /* JADX WARN: Code duplicated, block: B:152:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:154:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:155:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:158:0x0354  */
    /* JADX WARN: Code duplicated, block: B:160:0x035d  */
    /* JADX WARN: Code duplicated, block: B:161:0x0361  */
    /* JADX WARN: Code duplicated, block: B:164:0x036e  */
    /* JADX WARN: Code duplicated, block: B:166:0x037c  */
    /* JADX WARN: Code duplicated, block: B:169:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:171:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:172:0x03af  */
    /* JADX WARN: Code duplicated, block: B:175:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:177:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:180:0x03db  */
    /* JADX WARN: Code duplicated, block: B:181:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:184:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:187:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:189:0x0401  */
    /* JADX WARN: Code duplicated, block: B:190:0x0404  */
    /* JADX WARN: Code duplicated, block: B:193:0x040f  */
    /* JADX WARN: Code duplicated, block: B:194:0x0412  */
    /* JADX WARN: Code duplicated, block: B:197:0x0467  */
    /* JADX WARN: Code duplicated, block: B:199:0x0470  */
    /* JADX WARN: Code duplicated, block: B:200:0x0474  */
    /* JADX WARN: Code duplicated, block: B:203:0x0481  */
    /* JADX WARN: Code duplicated, block: B:205:0x048f  */
    /* JADX WARN: Code duplicated, block: B:208:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:210:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:211:0x0502  */
    /* JADX WARN: Code duplicated, block: B:214:0x050f  */
    /* JADX WARN: Code duplicated, block: B:216:0x051d  */
    /* JADX WARN: Code duplicated, block: B:219:0x05df  */
    /* JADX WARN: Code duplicated, block: B:221:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:223:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:226:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:228:0x060c  */
    /* JADX WARN: Code duplicated, block: B:234:0x0638 A[LOOP:0: B:232:0x0634->B:234:0x0638, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:243:0x06af  */
    /* JADX WARN: Code duplicated, block: B:249:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:252:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:255:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:259:0x0711  */
    /* JADX WARN: Code duplicated, block: B:261:0x071f  */
    /* JADX WARN: Code duplicated, block: B:264:0x0729  */
    /* JADX WARN: Code duplicated, block: B:266:0x072c  */
    /* JADX WARN: Code duplicated, block: B:268:0x0734  */
    /* JADX WARN: Code duplicated, block: B:270:0x0739  */
    /* JADX WARN: Code duplicated, block: B:272:0x079a  */
    /* JADX WARN: Code duplicated, block: B:275:0x07ad  */
    /* JADX WARN: Code duplicated, block: B:277:0x07c3  */
    /* JADX WARN: Code duplicated, block: B:278:0x07c5  */
    /* JADX WARN: Code duplicated, block: B:280:0x07c8  */
    /* JADX WARN: Code duplicated, block: B:286:0x07d5  */
    /* JADX WARN: Code duplicated, block: B:289:0x07dd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:292:0x07e3  */
    /* JADX WARN: Code duplicated, block: B:294:0x07ff  */
    /* JADX WARN: Code duplicated, block: B:296:0x080d  */
    /* JADX WARN: Code duplicated, block: B:298:0x0832  */
    /* JADX WARN: Code duplicated, block: B:304:0x083f  */
    /* JADX WARN: Code duplicated, block: B:307:0x0846  */
    /* JADX WARN: Code duplicated, block: B:308:0x0848  */
    /* JADX WARN: Code duplicated, block: B:311:0x0850 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:312:0x0852  */
    /* JADX WARN: Code duplicated, block: B:314:0x0879  */
    /* JADX WARN: Code duplicated, block: B:317:0x088b  */
    /* JADX WARN: Code duplicated, block: B:318:0x089a  */
    /* JADX WARN: Code duplicated, block: B:321:0x08a9  */
    /* JADX WARN: Code duplicated, block: B:322:0x08b8  */
    /* JADX WARN: Code duplicated, block: B:325:0x08c6  */
    /* JADX WARN: Code duplicated, block: B:326:0x08dc  */
    /* JADX WARN: Code duplicated, block: B:329:0x08fe  */
    /* JADX WARN: Code duplicated, block: B:331:0x0904  */
    /* JADX WARN: Code duplicated, block: B:334:0x0969  */
    /* JADX WARN: Code duplicated, block: B:336:0x0972  */
    /* JADX WARN: Code duplicated, block: B:337:0x0976  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:340:0x0991  */
    /* JADX WARN: Code duplicated, block: B:342:0x099f  */
    /* JADX WARN: Code duplicated, block: B:345:0x09d2  */
    /* JADX WARN: Code duplicated, block: B:348:0x09e4  */
    /* JADX WARN: Code duplicated, block: B:350:0x09ff  */
    /* JADX WARN: Code duplicated, block: B:353:0x0a61  */
    /* JADX WARN: Code duplicated, block: B:355:0x0a87  */
    /* JADX WARN: Code duplicated, block: B:357:0x0a93  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:363:0x0aa0  */
    /* JADX WARN: Code duplicated, block: B:366:0x0aa7  */
    /* JADX WARN: Code duplicated, block: B:368:0x0aad  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:370:0x0ac4  */
    /* JADX WARN: Code duplicated, block: B:374:0x0acd  */
    /* JADX WARN: Code duplicated, block: B:376:0x0ad2  */
    /* JADX WARN: Code duplicated, block: B:378:0x0ad7  */
    /* JADX WARN: Code duplicated, block: B:380:0x0adc  */
    /* JADX WARN: Code duplicated, block: B:382:0x0ae1  */
    /* JADX WARN: Code duplicated, block: B:384:0x0ae6  */
    /* JADX WARN: Code duplicated, block: B:386:0x0aeb  */
    /* JADX WARN: Code duplicated, block: B:389:0x0aff  */
    /* JADX WARN: Code duplicated, block: B:391:0x0680 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:395:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:69:0x0107  */
    /* JADX WARN: Code duplicated, block: B:71:0x010d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0110  */
    /* JADX WARN: Code duplicated, block: B:76:0x011a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0123  */
    /* JADX WARN: Code duplicated, block: B:79:0x0127  */
    /* JADX WARN: Code duplicated, block: B:81:0x0131  */
    /* JADX WARN: Code duplicated, block: B:82:0x0134  */
    /* JADX WARN: Code duplicated, block: B:85:0x013b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0144  */
    /* JADX WARN: Code duplicated, block: B:89:0x014d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0151  */
    /* JADX WARN: Code duplicated, block: B:93:0x015b  */
    /* JADX WARN: Code duplicated, block: B:94:0x015e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0163  */
    /* JADX WARN: Code duplicated, block: B:99:0x016f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v115 */
    /* JADX WARN: Type inference failed for: r1v65 */
    /* JADX WARN: Type inference failed for: r1v71 */
    /* JADX WARN: Type inference failed for: r1v75, types: [boolean, int] */
    public static final void e(x xVar, String str, boolean z14, e23.q<? super Integer, ? super List<kt1.b>, ? super Boolean, Unit> qVar, p<? super Long, ? super Boolean, Unit> pVar, e23.l<? super Long, Unit> lVar, e23.l<? super Long, Unit> lVar2, e23.l<? super Long, Unit> lVar3, e23.l<? super String, Unit> lVar4, e23.l<? super Long, Unit> lVar5, e23.l<? super Long, Unit> lVar6, e23.l<? super pt1.n, Unit> lVar7, p3.m mVar, int i14, int i15, int i16) {
        int i17;
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z15;
        p<? super Long, ? super Boolean, Unit> pVar2;
        e23.q<? super Integer, ? super List<kt1.b>, ? super Boolean, Unit> qVar2;
        boolean z16;
        e23.l<? super Long, Unit> lVar8;
        e23.l<? super Long, Unit> lVar9;
        o0 o0Var;
        p2 p2VarI0;
        boolean z17;
        e23.l<? super Long, Unit> lVar10;
        e23.l<? super Long, Unit> lVar11;
        Object objQ;
        Object obj;
        p1 p1Var;
        boolean z18;
        Object objQ2;
        p1 p1Var2;
        Object objQ3;
        p1 p1Var3;
        Object objQ4;
        p1 p1Var4;
        int i29;
        h4.r.a aVar;
        h4.r rVarA;
        m1.a aVar2;
        h4.g.a aVar3;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        e0.a aVar4;
        e23.l<? super Long, Unit> lVar12;
        h5.g.a.e eVar;
        h5.g.a.C1623g c1623g;
        h5.g.a.b bVar;
        p3.c<?> cVar;
        h5.g.a.f fVar;
        p1 p1Var5;
        j92.b bVar2;
        j92.e eVar2;
        z zVarA2;
        int iHashCode2;
        i2 i2VarA1;
        h4.r rVarC2;
        e23.l<? super Long, Unit> lVar13;
        s2 s2VarA;
        int iHashCode3;
        i2 i2VarA2;
        h4.r rVarC3;
        String strJ;
        String str2;
        boolean z19;
        String str3;
        Integer num;
        z zVarA3;
        int iHashCode4;
        i2 i2VarA3;
        h4.r rVarC4;
        j92.f fVar2;
        x0 x0Var;
        z0 z0VarD;
        int iHashCode5;
        i2 i2VarA4;
        h4.r rVarC5;
        y3 y3Var;
        float f14;
        int i30;
        o0 o0Var2;
        z zVarA4;
        int iHashCode6;
        i2 i2VarA5;
        h4.r rVarC6;
        int i34;
        s5.c.b bVar3;
        int i35;
        int i36;
        int i37;
        boolean z24;
        boolean zR;
        Object objQ5;
        Object obj2;
        p1 p1Var6;
        int i38;
        int i39;
        ?? r14;
        boolean z25;
        boolean z26;
        boolean z27;
        Object objQ6;
        String strP;
        boolean zB;
        Object objQ7;
        s2 s2VarA2;
        int iHashCode7;
        i2 i2VarX;
        h4.r rVarC7;
        e0.a aVarA;
        h5.g.a.b bVarB;
        Object objQ8;
        String strP2;
        boolean z28;
        Object objQ9;
        boolean z29;
        boolean z34;
        boolean z35;
        Object objQ10;
        e23.q<? super Integer, ? super List<kt1.b>, ? super Boolean, Unit> qVar3;
        String str4;
        boolean z36;
        String str5;
        int i44;
        int i45;
        int i46;
        int i47;
        int i48;
        int i49;
        xVar.getClass();
        boolean z37 = xVar.f141015l;
        i53.c<us1.i> cVar2 = xVar.f141011h;
        i53.c<us1.g> cVar3 = xVar.f141013j;
        String str6 = xVar.f141010g;
        String str7 = xVar.f141017n;
        i53.c<kt1.b> cVar4 = xVar.f141012i;
        boolean z38 = xVar.f141020q;
        boolean z39 = xVar.f141023t;
        int i54 = xVar.f141014k;
        str.getClass();
        qVar.getClass();
        pVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        lVar4.getClass();
        lVar7.getClass();
        o0 o0VarE = mVar.E(-2025244318);
        p3.c<?> cVar5 = o0VarE.f135177b;
        int i55 = (i14 & 6) == 0 ? i14 | ((i14 & 8) == 0 ? o0VarE.B(xVar) : o0VarE.r(xVar) ? 4 : 2) : i14;
        if ((i14 & 48) == 0) {
            i55 |= o0VarE.B(str) ? 32 : 16;
        }
        int i56 = i55;
        int i57 = i16 & 4;
        if (i57 == 0) {
            i17 = i56;
            if ((i14 & 384) == 0) {
                i17 |= o0VarE.h(z14) ? 256 : 128;
            }
            if ((i14 & 3072) == 0) {
                if (o0VarE.r(qVar)) {
                    i49 = 2048;
                } else {
                    i49 = 1024;
                }
                i17 |= i49;
            }
            if ((i14 & 24576) == 0) {
                if (o0VarE.r(pVar)) {
                    i48 = 16384;
                } else {
                    i48 = 8192;
                }
                i17 |= i48;
            }
            if ((196608 & i14) != 0) {
                if (o0VarE.r(lVar)) {
                    i47 = 131072;
                } else {
                    i47 = 65536;
                }
                i17 |= i47;
            }
            if ((i14 & 1572864) == 0) {
                if (o0VarE.r(lVar2)) {
                    i46 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i46 = 524288;
                }
                i17 |= i46;
            }
            if ((i14 & 12582912) == 0) {
                if (o0VarE.r(lVar3)) {
                    i45 = 8388608;
                } else {
                    i45 = 4194304;
                }
                i17 |= i45;
            }
            if ((i14 & 100663296) == 0) {
                if (o0VarE.r(lVar4)) {
                    i44 = 67108864;
                } else {
                    i44 = 33554432;
                }
                i17 |= i44;
            }
            i18 = i16 & 512;
            if (i18 != 0) {
                i18 = i18;
                i19 = i17 | C.ENCODING_PCM_32BIT;
            } else {
                if ((i14 & C.ENCODING_PCM_32BIT) != 0) {
                    if (o0VarE.r(lVar5)) {
                        i24 = 536870912;
                    } else {
                        i24 = 268435456;
                    }
                    i17 |= i24;
                }
                i19 = i17;
            }
            i25 = i16 & 1024;
            if (i25 != 0) {
                i26 = i15 | 6;
            } else if ((i15 & 6) == 0) {
                if (o0VarE.r(lVar6)) {
                    i27 = 4;
                } else {
                    i27 = 2;
                }
                i26 = i15 | i27;
            } else {
                i26 = i15;
            }
            if ((i15 & 48) == 0) {
                i26 |= o0VarE.r(lVar7) ? 32 : 16;
            }
            i28 = i26;
            if ((i19 & 306783379) == 306783378 || (i28 & 19) != 18) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (o0VarE.n(i19 & 1, z15)) {
                if (i57 != 0) {
                    z17 = false;
                } else {
                    z17 = z14;
                }
                if (i18 != 0) {
                    lVar10 = null;
                } else {
                    lVar10 = lVar5;
                }
                if (i25 != 0) {
                    lVar11 = null;
                } else {
                    lVar11 = lVar6;
                }
                x1 x1Var = p3.n.f135158a;
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                obj = p3.m.a.f135155b;
                if (objQ == obj) {
                    objQ = p0.n(Boolean.FALSE);
                    o0VarE.K(objQ);
                }
                p1Var = (p1) objQ;
                z18 = z17;
                objQ2 = o0VarE.q();
                if (objQ2 == obj) {
                    objQ2 = p0.n(Boolean.FALSE);
                    o0VarE.K(objQ2);
                }
                p1Var2 = (p1) objQ2;
                objQ3 = o0VarE.q();
                if (objQ3 == obj) {
                    objQ3 = p0.n(Boolean.FALSE);
                    o0VarE.K(objQ3);
                }
                p1Var3 = (p1) objQ3;
                objQ4 = o0VarE.q();
                if (objQ4 == obj) {
                    objQ4 = p0.n(str7);
                    o0VarE.K(objQ4);
                }
                p1Var4 = (p1) objQ4;
                i29 = i19;
                aVar = h4.r.S;
                rVarA = v2.a(aVar, z39, new jl1.a(6), o0VarE, 6);
                h4.r rVarF = x2.f(aVar, 1.0f);
                long jB = am.j.B(d92.b.f58623a, o0VarE);
                aVar2 = m1.f128891a;
                h4.r rVarE = u1.n.e(rVarF, jB, aVar2);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                aVar3 = h4.d.a.f81536n;
                zVarA = c2.y.a(kVar, aVar3, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.getU());
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarE, o0VarE);
                h5.g.V.getClass();
                aVar4 = h5.g.a.f81805b;
                if (cVar5 != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                lVar12 = lVar10;
                if (o0VarE.T) {
                    o0VarE.M(aVar4);
                } else {
                    o0VarE.c();
                }
                eVar = h5.g.a.f81810g;
                b4.c(eVar, zVarA, o0VarE);
                c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    cVar = cVar5;
                } else {
                    cVar = cVar5;
                    if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    }
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, o0VarE);
                    c2.b0 b0Var = c2.b0.f22601a;
                    if (z39) {
                        o0VarE.C(-1801157554);
                        h4.r rVarF2 = x2.f(aVar, 1.0f);
                        d92.b.f58625c.getClass();
                        p1Var5 = p1Var;
                        g.a(c2.l.y(rVarF2, j92.b.f97899b.f97918c), y.Q(o0VarE, R.string.review_hidden_message), ro0.l.TRAIL_REVIEW_HIDDEN, o0VarE, 384);
                        o0VarE.g0(false);
                    } else {
                        p1Var5 = p1Var;
                        if (xVar.f141024u) {
                            o0VarE.C(-1800793056);
                            h4.r rVarF3 = x2.f(aVar, 1.0f);
                            d92.b.f58625c.getClass();
                            g.a(c2.l.y(rVarF3, j92.b.f97899b.f97918c), y.Q(o0VarE, R.string.review_hidden_photos_message), ro0.l.TRAIL_REVIEW_PHOTOS_HIDDEN, o0VarE, 384);
                            o0VarE.g0(false);
                        } else {
                            o0VarE.C(-1800464394);
                            o0VarE.g0(false);
                        }
                    }
                    h4.r rVarE2 = u1.n.e(x2.f(aVar, 1.0f), d92.b.a(o0VarE).c().a(), aVar2);
                    bVar2 = d92.b.f58625c;
                    bVar2.getClass();
                    eVar2 = j92.b.f97899b;
                    h4.r rVarA2 = v2.a(c2.l.y(rVarE2, eVar2.f97920e), z39, new hv0.d(11, lVar11, xVar), o0VarE, 0);
                    bVar2.getClass();
                    zVarA2 = c2.y.a(c2.j.i(eVar2.f97918c), aVar3, o0VarE, 0);
                    iHashCode2 = Long.hashCode(o0VarE.getU());
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = h4.k.c(rVarA2, o0VarE);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    lVar13 = lVar11;
                    if (o0VarE.T) {
                        o0VarE.M(aVar4);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, zVarA2, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC2, o0VarE);
                    bVar2.getClass();
                    s2VarA = q2.a(c2.j.i(eVar2.f97918c), h4.d.a.f81533k, o0VarE, 0);
                    iHashCode3 = Long.hashCode(o0VarE.getU());
                    i2VarA2 = o0VarE.a0();
                    rVarC3 = h4.k.c(aVar, o0VarE);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar4);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, s2VarA, o0VarE);
                    b4.c(c1623g, i2VarA2, o0VarE);
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                        v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                    }
                    b4.c(fVar, rVarC3, o0VarE);
                    u2 u2Var = u2.f22900a;
                    bVar2.getClass();
                    float f15 = j92.b.f97901d.f97905d;
                    if (z38) {
                        strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 715095693, R.string.lbl_anonymous_user, o0VarE, false);
                    } else {
                        strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 715199636, R.string.lbl_profile, o0VarE, false);
                    }
                    str2 = xVar.f141007d;
                    if (z38 && g22.n.d(str2)) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (z19) {
                        str3 = str2;
                    } else {
                        str3 = null;
                    }
                    if (z38) {
                        num = 2131231047;
                    } else {
                        num = null;
                    }
                    b12.k.b(rVarA, strJ, f15, new b12.b(str3, num, null, null, null, 28, null), o0VarE, b12.b.f14385f << 9, 16);
                    h4.r rVarThen = u2Var.a(aVar, 1.0f, true).then(rVarA);
                    bVar2.getClass();
                    zVarA3 = c2.y.a(c2.j.i(eVar2.f97917b), aVar3, o0VarE, 0);
                    x1 x1Var2 = p3.n.f135158a;
                    iHashCode4 = Long.hashCode(o0VarE.getU());
                    i2VarA3 = o0VarE.a0();
                    rVarC4 = h4.k.c(rVarThen, o0VarE);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar4);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, zVarA3, o0VarE);
                    b4.c(c1623g, i2VarA3, o0VarE);
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode4))) {
                        v.h.A(iHashCode4, o0VarE, iHashCode4, bVar);
                    }
                    b4.c(fVar, rVarC4, o0VarE);
                    String str8 = xVar.f141006c;
                    fVar2 = d92.b.f58624b;
                    fVar2.getClass();
                    x0Var = j92.f.f97931h;
                    mh.c(str8, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131070);
                    String str9 = xVar.f141008e;
                    fVar2.getClass();
                    mh.c(str9, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131070);
                    o0VarE.g0(true);
                    z0VarD = q.d(h4.d.a.f81524b, false);
                    iHashCode5 = Long.hashCode(o0VarE.getU());
                    i2VarA4 = o0VarE.a0();
                    rVarC5 = h4.k.c(aVar, o0VarE);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar4);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, z0VarD, o0VarE);
                    b4.c(c1623g, i2VarA4, o0VarE);
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode5))) {
                        v.h.A(iHashCode5, o0VarE, iHashCode5, bVar);
                    }
                    b4.c(fVar, rVarC5, o0VarE);
                    c2.u uVar = c2.u.f22885a;
                    y3Var = p7.f89282d;
                    g6.f.f75994b.getClass();
                    f14 = g6.f.f75996d;
                    p1 p1Var7 = p1Var5;
                    v.a(y3Var.c(g6.f.a(f14)), z3.f.c(-536898676, new l1(p1Var7, 19, (byte) 0), o0VarE), o0VarE, 56);
                    i30 = i29 & 14;
                    int i58 = i29 >> 3;
                    b(xVar, z18, p1Var7, p1Var4, lVar, lVar3, p1Var2, lVar4, lVar12, lVar13, lVar7, o0VarE, 1576320 | i30 | (i58 & 112) | (i58 & 57344) | ((i29 >> 6) & 458752) | (i58 & 29360128) | (i58 & 234881024) | ((i28 << 27) & 1879048192), (i28 >> 3) & 14);
                    o0Var2 = o0VarE;
                    o0Var2.g0(true);
                    o0Var2.g0(true);
                    bVar2.getClass();
                    zVarA4 = c2.y.a(c2.j.i(eVar2.f97918c), aVar3, o0Var2, 0);
                    iHashCode6 = Long.hashCode(o0Var2.getU());
                    i2VarA5 = o0Var2.a0();
                    rVarC6 = h4.k.c(rVarA, o0Var2);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0Var2.z();
                    if (o0Var2.T) {
                        o0Var2.M(aVar4);
                    } else {
                        o0Var2.c();
                    }
                    b4.c(eVar, zVarA4, o0Var2);
                    b4.c(c1623g, i2VarA5, o0Var2);
                    if (o0Var2.T || !p005kotlin.jvm.internal.s.g(o0Var2.q(), Integer.valueOf(iHashCode6))) {
                        v.h.A(iHashCode6, o0Var2, iHashCode6, bVar);
                    }
                    b4.c(fVar, rVarC6, o0Var2);
                    Context context = (Context) o0Var2.A(AndroidCompositionLocals_androidKt.f6042b);
                    i34 = xVar.f141009f;
                    x1 x1Var3 = p3.n.f135158a;
                    o0Var2.C(-1685008668);
                    bVar3 = new s5.c.b(0, 1, null);
                    for (i35 = 0; i35 < i34; i35++) {
                        bVar3.b("★");
                    }
                    d92.b.f58623a.getClass();
                    int iJ = bVar3.j(new i0(d92.b.a(o0Var2).k().d(), 0L, (f0) null, (w5.b0) null, (c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (p005kotlin.jvm.internal.j) null));
                    i36 = 5 - i34;
                    for (i37 = 0; i37 < i36; i37++) {
                        try {
                            bVar3.b("★");
                        } catch (Throwable th3) {
                            bVar3.f(iJ);
                            throw th3;
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    bVar3.f(iJ);
                    s5.c cVarK = bVar3.k();
                    o0Var2.f();
                    x1 x1Var4 = p3.n.f135158a;
                    h4.r rVarF4 = x2.f(aVar, 1.0f);
                    bVar2.getClass();
                    h4.r rVarA3 = c2.l.A(rVarF4, 0.0f, eVar2.f97920e, 1);
                    if (i30 != 4 || ((i29 & 8) != 0 && o0Var2.r(xVar))) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    zR = z24 | o0Var2.r(context);
                    objQ5 = o0Var2.q();
                    if (zR) {
                        obj2 = obj;
                    } else {
                        obj2 = obj;
                        if (objQ5 == obj2) {
                        }
                        h4.r rVarC8 = p5.v.c((e23.l) objQ5, rVarA3, false);
                        fVar2.getClass();
                        mh.d(cVarK, rVarC8, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, d92.c.b(j92.f.f97936m, o0Var2), o0Var2, 0, 0, 262140);
                        if (d53.w.J(str6)) {
                            p1Var6 = p1Var3;
                            i38 = 0;
                            o0Var2.C(284519778);
                            o0Var2.g0(false);
                        } else {
                            o0Var2.C(283824014);
                            str4 = (String) p1Var4.getF182175a();
                            if (str4 == null && (!d53.w.J(str4))) {
                                z36 = true;
                            } else {
                                z36 = false;
                            }
                            if (z36) {
                                str5 = (String) p1Var4.getF182175a();
                                if (str5 == null) {
                                    str5 = "";
                                }
                            } else {
                                str5 = str6;
                            }
                            h4.r rVarF5 = x2.f(aVar, 1.0f);
                            bVar2.getClass();
                            h4.r rVarC9 = c2.l.C(rVarF5, 0.0f, 0.0f, 0.0f, eVar2.f97920e, 7);
                            fVar2.getClass();
                            x0 x0VarB = d92.c.b(x0Var, o0Var2);
                            fVar2.getClass();
                            g02.q.b(str5, rVarC9, 0, x0VarB, p1Var3, null, null, x0.a(x0Var, hb.a.s(o0Var2), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0Var2, 24576, 100);
                            p1Var6 = p1Var3;
                            i38 = 0;
                            o0Var2.g0(false);
                        }
                        if (cVar4.size() == 1) {
                            o0Var2.C(284579236);
                            kt1.b bVar4 = cVar4.get(i38);
                            i39 = i29;
                            if ((i39 & 7168) == 2048) {
                                z29 = true;
                            } else {
                                z29 = false;
                            }
                            if (i30 != 4 || ((i39 & 8) != 0 && o0Var2.r(xVar))) {
                                z34 = true;
                            } else {
                                z34 = false;
                            }
                            z35 = z29 | z34;
                            objQ10 = o0Var2.q();
                            if (!z35 || objQ10 == obj2) {
                                qVar3 = qVar;
                                objQ10 = new i91.c(27, qVar3, xVar);
                                o0Var2.K(objQ10);
                            } else {
                                qVar3 = qVar;
                            }
                            c(bVar4, null, (e23.a) objQ10, o0Var2, 0);
                            o0Var2.g0(false);
                            r14 = 0;
                            qVar2 = qVar3;
                        } else {
                            qVar2 = qVar;
                            i39 = i29;
                            if (cVar4.isEmpty()) {
                                r14 = 0;
                                o0Var2.C(285751842);
                                o0Var2.g0(false);
                            } else {
                                o0Var2.C(284944044);
                                bVar2.getClass();
                                c2.j.i iVarI = c2.j.i(eVar2.f97918c);
                                h4.r rVarF6 = x2.f(aVar, 1.0f);
                                bVar2.getClass();
                                h4.r rVarA4 = c2.l.A(rVarF6, 0.0f, eVar2.f97918c, 1);
                                if (i30 != 4 || ((i39 & 8) != 0 && o0Var2.r(xVar))) {
                                    z25 = true;
                                } else {
                                    z25 = false;
                                }
                                if ((i39 & 7168) == 2048) {
                                    z26 = true;
                                } else {
                                    z26 = false;
                                }
                                z27 = z25 | z26;
                                objQ6 = o0Var2.q();
                                if (z27 || objQ6 == obj2) {
                                    objQ6 = new d(2, xVar, qVar2);
                                    o0Var2.K(objQ6);
                                }
                                e2.c.c(rVarA4, null, null, iVarI, null, null, false, null, (e23.l) objQ6, o0Var2, 0, 494);
                                r14 = 0;
                                o0Var2.g0(false);
                            }
                        }
                        if (cVar3.isEmpty()) {
                            o0Var2.C(285895682);
                            o0Var2.f();
                        } else {
                            o0Var2.C(285812075);
                            a(cVar3, o0Var2, r14);
                            o0Var2.g0(r14);
                        }
                        if (cVar2.isEmpty()) {
                            o0Var2.C(286030594);
                            o0Var2.f();
                        } else {
                            o0Var2.C(285949870);
                            d(cVar2, o0Var2, r14);
                            o0Var2.f();
                        }
                        if (z37) {
                            o0Var2.C(286115069);
                            strP = y.P(R.string.trail_review_helpful_count, new Object[]{String.valueOf(i54)}, o0Var2);
                            o0Var2.f();
                        } else {
                            o0Var2.C(286253081);
                            strP = y.P(R.string.trail_review_not_helpful_count, new Object[]{String.valueOf(i54)}, o0Var2);
                            o0Var2.f();
                        }
                        zB = o0Var2.B(strP);
                        objQ7 = o0Var2.q();
                        if (zB || objQ7 == p3.m.a.a()) {
                            objQ7 = new jl0.e(strP, 3);
                            o0Var2.K(objQ7);
                        }
                        h4.r rVarA5 = v2.a(c2.l.A(p5.v.c((e23.l) objQ7, aVar, true), 0.0f, d92.b.b().b().getF97918c(), 1), xVar.f141019p, new jl1.a(8), o0Var2, 0);
                        s2VarA2 = q2.a(c2.j.i(d92.b.b().b().getF97918c()), h4.d.a.a(), o0Var2, 48);
                        iHashCode7 = Long.hashCode(p0.i(o0Var2));
                        i2VarX = o0Var2.x();
                        rVarC7 = h4.k.c(rVarA5, o0Var2);
                        aVarA = h5.g.a.a();
                        if (o0Var2.F() != null) {
                            p0.l();
                            throw null;
                        }
                        o0Var2.z();
                        if (o0Var2.getT()) {
                            o0Var2.M(aVarA);
                        } else {
                            o0Var2.c();
                        }
                        b4.c(h5.g.a.c(), s2VarA2, o0Var2);
                        b4.c(h5.g.a.e(), i2VarX, o0Var2);
                        bVarB = h5.g.a.b();
                        if (o0Var2.getT() || !p005kotlin.jvm.internal.s.g(o0Var2.q(), Integer.valueOf(iHashCode7))) {
                            v.h.A(iHashCode7, o0Var2, iHashCode7, bVarB);
                        }
                        b4.c(h5.g.a.d(), rVarC7, o0Var2);
                        pVar2 = pVar;
                        v.a(y3Var.c(g6.f.a(f14)), z3.f.c(-1920705380, new i20.b(21, xVar, pVar2), o0Var2), o0Var2, 56);
                        objQ8 = o0Var2.q();
                        if (objQ8 == p3.m.a.a()) {
                            objQ8 = new jn2.b(25);
                            o0Var2.K(objQ8);
                        }
                        h4.r rVarB = p5.v.b(aVar, (e23.l) objQ8);
                        if (z37) {
                            o0Var2.C(1288831543);
                            strP2 = y.P(R.string.value_in_parenthesis, new Object[]{String.valueOf(i54)}, o0Var2);
                            o0Var2.f();
                        } else {
                            o0Var2.C(1288979537);
                            strP2 = y.P(R.string.trail_review_helpful_count, new Object[]{String.valueOf(i54)}, o0Var2);
                            o0Var2.f();
                        }
                        String str10 = strP2;
                        d92.b.c().getClass();
                        mh.c(str10, rVarB, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97937n, o0Var2), o0Var2, 0, 0, 131068);
                        o0Var2.y();
                        o0Var2.y();
                        o0Var2.y();
                        o0Var2.y();
                        if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                            o0Var2.C(1658659424);
                            jg.b.c(p1Var2, xVar.f141004a, str, lVar2, o0Var2, ((i39 << 3) & 896) | 6 | ((i39 >> 9) & 7168));
                            o0Var2.f();
                        } else {
                            o0Var2.C(1658874688);
                            o0Var2.f();
                        }
                        if (i30 != 4 || ((i39 & 8) != 0 && o0Var2.r(xVar))) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        objQ9 = o0Var2.q();
                        if (z28 || objQ9 == p3.m.a.a()) {
                            objQ9 = new a(p1Var4, xVar, p1Var6, null);
                            o0Var2.K(objQ9);
                        }
                        l0.e((p) objQ9, str7, o0Var2);
                        x1 x1Var5 = p3.n.f135158a;
                        lVar8 = lVar12;
                        lVar9 = lVar13;
                        z16 = z18;
                        o0Var = o0Var2;
                    }
                    objQ5 = new d(1, xVar, context);
                    o0Var2.K(objQ5);
                    h4.r rVarC10 = p5.v.c((e23.l) objQ5, rVarA3, false);
                    fVar2.getClass();
                    mh.d(cVarK, rVarC10, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, d92.c.b(j92.f.f97936m, o0Var2), o0Var2, 0, 0, 262140);
                    if (d53.w.J(str6)) {
                        o0Var2.C(283824014);
                        str4 = (String) p1Var4.getF182175a();
                        if (str4 == null) {
                            z36 = false;
                        } else {
                            z36 = false;
                        }
                        if (z36) {
                            str5 = (String) p1Var4.getF182175a();
                            if (str5 == null) {
                                str5 = "";
                            }
                        } else {
                            str5 = str6;
                        }
                        h4.r rVarF7 = x2.f(aVar, 1.0f);
                        bVar2.getClass();
                        h4.r rVarC11 = c2.l.C(rVarF7, 0.0f, 0.0f, 0.0f, eVar2.f97920e, 7);
                        fVar2.getClass();
                        x0 x0VarB2 = d92.c.b(x0Var, o0Var2);
                        fVar2.getClass();
                        g02.q.b(str5, rVarC11, 0, x0VarB2, p1Var3, null, null, x0.a(x0Var, hb.a.s(o0Var2), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0Var2, 24576, 100);
                        p1Var6 = p1Var3;
                        i38 = 0;
                        o0Var2.g0(false);
                    } else {
                        p1Var6 = p1Var3;
                        i38 = 0;
                        o0Var2.C(284519778);
                        o0Var2.g0(false);
                    }
                    if (cVar4.size() == 1) {
                        o0Var2.C(284579236);
                        kt1.b bVar5 = cVar4.get(i38);
                        i39 = i29;
                        if ((i39 & 7168) == 2048) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                        if (i30 != 4) {
                            z34 = true;
                        } else {
                            z34 = true;
                        }
                        z35 = z29 | z34;
                        objQ10 = o0Var2.q();
                        if (z35) {
                            qVar3 = qVar;
                            objQ10 = new i91.c(27, qVar3, xVar);
                            o0Var2.K(objQ10);
                        } else {
                            qVar3 = qVar;
                            objQ10 = new i91.c(27, qVar3, xVar);
                            o0Var2.K(objQ10);
                        }
                        c(bVar5, null, (e23.a) objQ10, o0Var2, 0);
                        o0Var2.g0(false);
                        r14 = 0;
                        qVar2 = qVar3;
                    } else {
                        qVar2 = qVar;
                        i39 = i29;
                        if (cVar4.isEmpty()) {
                            o0Var2.C(284944044);
                            bVar2.getClass();
                            c2.j.i iVarI2 = c2.j.i(eVar2.f97918c);
                            h4.r rVarF8 = x2.f(aVar, 1.0f);
                            bVar2.getClass();
                            h4.r rVarA6 = c2.l.A(rVarF8, 0.0f, eVar2.f97918c, 1);
                            if (i30 != 4) {
                                z25 = true;
                            } else {
                                z25 = true;
                            }
                            if ((i39 & 7168) == 2048) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            z27 = z25 | z26;
                            objQ6 = o0Var2.q();
                            if (z27) {
                                objQ6 = new d(2, xVar, qVar2);
                                o0Var2.K(objQ6);
                            } else {
                                objQ6 = new d(2, xVar, qVar2);
                                o0Var2.K(objQ6);
                            }
                            e2.c.c(rVarA6, null, null, iVarI2, null, null, false, null, (e23.l) objQ6, o0Var2, 0, 494);
                            r14 = 0;
                            o0Var2.g0(false);
                        } else {
                            r14 = 0;
                            o0Var2.C(285751842);
                            o0Var2.g0(false);
                        }
                    }
                    if (cVar3.isEmpty()) {
                        o0Var2.C(285812075);
                        a(cVar3, o0Var2, r14);
                        o0Var2.g0(r14);
                    } else {
                        o0Var2.C(285895682);
                        o0Var2.f();
                    }
                    if (cVar2.isEmpty()) {
                        o0Var2.C(285949870);
                        d(cVar2, o0Var2, r14);
                        o0Var2.f();
                    } else {
                        o0Var2.C(286030594);
                        o0Var2.f();
                    }
                    if (z37) {
                        o0Var2.C(286115069);
                        strP = y.P(R.string.trail_review_helpful_count, new Object[]{String.valueOf(i54)}, o0Var2);
                        o0Var2.f();
                    } else {
                        o0Var2.C(286253081);
                        strP = y.P(R.string.trail_review_not_helpful_count, new Object[]{String.valueOf(i54)}, o0Var2);
                        o0Var2.f();
                    }
                    zB = o0Var2.B(strP);
                    objQ7 = o0Var2.q();
                    if (zB) {
                        objQ7 = new jl0.e(strP, 3);
                        o0Var2.K(objQ7);
                    } else {
                        objQ7 = new jl0.e(strP, 3);
                        o0Var2.K(objQ7);
                    }
                    h4.r rVarA7 = v2.a(c2.l.A(p5.v.c((e23.l) objQ7, aVar, true), 0.0f, d92.b.b().b().getF97918c(), 1), xVar.f141019p, new jl1.a(8), o0Var2, 0);
                    s2VarA2 = q2.a(c2.j.i(d92.b.b().b().getF97918c()), h4.d.a.a(), o0Var2, 48);
                    iHashCode7 = Long.hashCode(p0.i(o0Var2));
                    i2VarX = o0Var2.x();
                    rVarC7 = h4.k.c(rVarA7, o0Var2);
                    aVarA = h5.g.a.a();
                    if (o0Var2.F() != null) {
                        p0.l();
                        throw null;
                    }
                    o0Var2.z();
                    if (o0Var2.getT()) {
                        o0Var2.M(aVarA);
                    } else {
                        o0Var2.c();
                    }
                    b4.c(h5.g.a.c(), s2VarA2, o0Var2);
                    b4.c(h5.g.a.e(), i2VarX, o0Var2);
                    bVarB = h5.g.a.b();
                    if (o0Var2.getT()) {
                        v.h.A(iHashCode7, o0Var2, iHashCode7, bVarB);
                    } else {
                        v.h.A(iHashCode7, o0Var2, iHashCode7, bVarB);
                    }
                    b4.c(h5.g.a.d(), rVarC7, o0Var2);
                    pVar2 = pVar;
                    v.a(y3Var.c(g6.f.a(f14)), z3.f.c(-1920705380, new i20.b(21, xVar, pVar2), o0Var2), o0Var2, 56);
                    objQ8 = o0Var2.q();
                    if (objQ8 == p3.m.a.a()) {
                        objQ8 = new jn2.b(25);
                        o0Var2.K(objQ8);
                    }
                    h4.r rVarB2 = p5.v.b(aVar, (e23.l) objQ8);
                    if (z37) {
                        o0Var2.C(1288831543);
                        strP2 = y.P(R.string.value_in_parenthesis, new Object[]{String.valueOf(i54)}, o0Var2);
                        o0Var2.f();
                    } else {
                        o0Var2.C(1288979537);
                        strP2 = y.P(R.string.trail_review_helpful_count, new Object[]{String.valueOf(i54)}, o0Var2);
                        o0Var2.f();
                    }
                    String str11 = strP2;
                    d92.b.c().getClass();
                    mh.c(str11, rVarB2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97937n, o0Var2), o0Var2, 0, 0, 131068);
                    o0Var2.y();
                    o0Var2.y();
                    o0Var2.y();
                    o0Var2.y();
                    if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                        o0Var2.C(1658659424);
                        jg.b.c(p1Var2, xVar.f141004a, str, lVar2, o0Var2, ((i39 << 3) & 896) | 6 | ((i39 >> 9) & 7168));
                        o0Var2.f();
                    } else {
                        o0Var2.C(1658874688);
                        o0Var2.f();
                    }
                    if (i30 != 4) {
                        z28 = true;
                    } else {
                        z28 = true;
                    }
                    objQ9 = o0Var2.q();
                    if (z28) {
                        objQ9 = new a(p1Var4, xVar, p1Var6, null);
                        o0Var2.K(objQ9);
                    } else {
                        objQ9 = new a(p1Var4, xVar, p1Var6, null);
                        o0Var2.K(objQ9);
                    }
                    l0.e((p) objQ9, str7, o0Var2);
                    x1 x1Var6 = p3.n.f135158a;
                    lVar8 = lVar12;
                    lVar9 = lVar13;
                    z16 = z18;
                    o0Var = o0Var2;
                }
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                c2.b0 b0Var2 = c2.b0.f22601a;
                if (z39) {
                    o0VarE.C(-1801157554);
                    h4.r rVarF9 = x2.f(aVar, 1.0f);
                    d92.b.f58625c.getClass();
                    p1Var5 = p1Var;
                    g.a(c2.l.y(rVarF9, j92.b.f97899b.f97918c), y.Q(o0VarE, R.string.review_hidden_message), ro0.l.TRAIL_REVIEW_HIDDEN, o0VarE, 384);
                    o0VarE.g0(false);
                } else {
                    p1Var5 = p1Var;
                    if (xVar.f141024u) {
                        o0VarE.C(-1800793056);
                        h4.r rVarF10 = x2.f(aVar, 1.0f);
                        d92.b.f58625c.getClass();
                        g.a(c2.l.y(rVarF10, j92.b.f97899b.f97918c), y.Q(o0VarE, R.string.review_hidden_photos_message), ro0.l.TRAIL_REVIEW_PHOTOS_HIDDEN, o0VarE, 384);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-1800464394);
                        o0VarE.g0(false);
                    }
                }
                h4.r rVarE3 = u1.n.e(x2.f(aVar, 1.0f), d92.b.a(o0VarE).c().a(), aVar2);
                bVar2 = d92.b.f58625c;
                bVar2.getClass();
                eVar2 = j92.b.f97899b;
                h4.r rVarA8 = v2.a(c2.l.y(rVarE3, eVar2.f97920e), z39, new hv0.d(11, lVar11, xVar), o0VarE, 0);
                bVar2.getClass();
                zVarA2 = c2.y.a(c2.j.i(eVar2.f97918c), aVar3, o0VarE, 0);
                iHashCode2 = Long.hashCode(o0VarE.getU());
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarA8, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                lVar13 = lVar11;
                if (o0VarE.T) {
                    o0VarE.M(aVar4);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, zVarA2, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                } else {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, o0VarE);
                bVar2.getClass();
                s2VarA = q2.a(c2.j.i(eVar2.f97918c), h4.d.a.f81533k, o0VarE, 0);
                iHashCode3 = Long.hashCode(o0VarE.getU());
                i2VarA2 = o0VarE.a0();
                rVarC3 = h4.k.c(aVar, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar4);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA2, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                } else {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                }
                b4.c(fVar, rVarC3, o0VarE);
                u2 u2Var2 = u2.f22900a;
                bVar2.getClass();
                float f16 = j92.b.f97901d.f97905d;
                if (z38) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 715095693, R.string.lbl_anonymous_user, o0VarE, false);
                } else {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 715199636, R.string.lbl_profile, o0VarE, false);
                }
                str2 = xVar.f141007d;
                if (z38) {
                    z19 = false;
                } else {
                    z19 = false;
                }
                if (z19) {
                    str3 = str2;
                } else {
                    str3 = null;
                }
                if (z38) {
                    num = 2131231047;
                } else {
                    num = null;
                }
                b12.k.b(rVarA, strJ, f16, new b12.b(str3, num, null, null, null, 28, null), o0VarE, b12.b.f14385f << 9, 16);
                h4.r rVarThen2 = u2Var2.a(aVar, 1.0f, true).then(rVarA);
                bVar2.getClass();
                zVarA3 = c2.y.a(c2.j.i(eVar2.f97917b), aVar3, o0VarE, 0);
                x1 x1Var7 = p3.n.f135158a;
                iHashCode4 = Long.hashCode(o0VarE.getU());
                i2VarA3 = o0VarE.a0();
                rVarC4 = h4.k.c(rVarThen2, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar4);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, zVarA3, o0VarE);
                b4.c(c1623g, i2VarA3, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode4, o0VarE, iHashCode4, bVar);
                } else {
                    v.h.A(iHashCode4, o0VarE, iHashCode4, bVar);
                }
                b4.c(fVar, rVarC4, o0VarE);
                String str12 = xVar.f141006c;
                fVar2 = d92.b.f58624b;
                fVar2.getClass();
                x0Var = j92.f.f97931h;
                mh.c(str12, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131070);
                String str13 = xVar.f141008e;
                fVar2.getClass();
                mh.c(str13, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131070);
                o0VarE.g0(true);
                z0VarD = q.d(h4.d.a.f81524b, false);
                iHashCode5 = Long.hashCode(o0VarE.getU());
                i2VarA4 = o0VarE.a0();
                rVarC5 = h4.k.c(aVar, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar4);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, z0VarD, o0VarE);
                b4.c(c1623g, i2VarA4, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode5, o0VarE, iHashCode5, bVar);
                } else {
                    v.h.A(iHashCode5, o0VarE, iHashCode5, bVar);
                }
                b4.c(fVar, rVarC5, o0VarE);
                c2.u uVar2 = c2.u.f22885a;
                y3Var = p7.f89282d;
                g6.f.f75994b.getClass();
                f14 = g6.f.f75996d;
                p1 p1Var8 = p1Var5;
                v.a(y3Var.c(g6.f.a(f14)), z3.f.c(-536898676, new l1(p1Var8, 19, (byte) 0), o0VarE), o0VarE, 56);
                i30 = i29 & 14;
                int i59 = i29 >> 3;
                b(xVar, z18, p1Var8, p1Var4, lVar, lVar3, p1Var2, lVar4, lVar12, lVar13, lVar7, o0VarE, 1576320 | i30 | (i59 & 112) | (i59 & 57344) | ((i29 >> 6) & 458752) | (i59 & 29360128) | (i59 & 234881024) | ((i28 << 27) & 1879048192), (i28 >> 3) & 14);
                o0Var2 = o0VarE;
                o0Var2.g0(true);
                o0Var2.g0(true);
                bVar2.getClass();
                zVarA4 = c2.y.a(c2.j.i(eVar2.f97918c), aVar3, o0Var2, 0);
                iHashCode6 = Long.hashCode(o0Var2.getU());
                i2VarA5 = o0Var2.a0();
                rVarC6 = h4.k.c(rVarA, o0Var2);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0Var2.z();
                if (o0Var2.T) {
                    o0Var2.M(aVar4);
                } else {
                    o0Var2.c();
                }
                b4.c(eVar, zVarA4, o0Var2);
                b4.c(c1623g, i2VarA5, o0Var2);
                if (o0Var2.T) {
                    v.h.A(iHashCode6, o0Var2, iHashCode6, bVar);
                } else {
                    v.h.A(iHashCode6, o0Var2, iHashCode6, bVar);
                }
                b4.c(fVar, rVarC6, o0Var2);
                Context context2 = (Context) o0Var2.A(AndroidCompositionLocals_androidKt.f6042b);
                i34 = xVar.f141009f;
                x1 x1Var8 = p3.n.f135158a;
                o0Var2.C(-1685008668);
                bVar3 = new s5.c.b(0, 1, null);
                while (i35 < i34) {
                    bVar3.b("★");
                }
                d92.b.f58623a.getClass();
                int iJ2 = bVar3.j(new i0(d92.b.a(o0Var2).k().d(), 0L, (f0) null, (w5.b0) null, (c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (p005kotlin.jvm.internal.j) null));
                i36 = 5 - i34;
                while (i37 < i36) {
                    bVar3.b("★");
                }
                Unit unit2 = Unit.INSTANCE;
                bVar3.f(iJ2);
                s5.c cVarK2 = bVar3.k();
                o0Var2.f();
                x1 x1Var9 = p3.n.f135158a;
                h4.r rVarF11 = x2.f(aVar, 1.0f);
                bVar2.getClass();
                h4.r rVarA9 = c2.l.A(rVarF11, 0.0f, eVar2.f97920e, 1);
                if (i30 != 4) {
                    z24 = true;
                } else {
                    z24 = true;
                }
                zR = z24 | o0Var2.r(context2);
                objQ5 = o0Var2.q();
                if (zR) {
                    obj2 = obj;
                    if (objQ5 == obj2) {
                    }
                    h4.r rVarC12 = p5.v.c((e23.l) objQ5, rVarA9, false);
                    fVar2.getClass();
                    mh.d(cVarK2, rVarC12, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, d92.c.b(j92.f.f97936m, o0Var2), o0Var2, 0, 0, 262140);
                    if (d53.w.J(str6)) {
                        o0Var2.C(283824014);
                        str4 = (String) p1Var4.getF182175a();
                        if (str4 == null) {
                            z36 = false;
                        } else {
                            z36 = false;
                        }
                        if (z36) {
                            str5 = (String) p1Var4.getF182175a();
                            if (str5 == null) {
                                str5 = "";
                            }
                        } else {
                            str5 = str6;
                        }
                        h4.r rVarF12 = x2.f(aVar, 1.0f);
                        bVar2.getClass();
                        h4.r rVarC13 = c2.l.C(rVarF12, 0.0f, 0.0f, 0.0f, eVar2.f97920e, 7);
                        fVar2.getClass();
                        x0 x0VarB3 = d92.c.b(x0Var, o0Var2);
                        fVar2.getClass();
                        g02.q.b(str5, rVarC13, 0, x0VarB3, p1Var3, null, null, x0.a(x0Var, hb.a.s(o0Var2), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0Var2, 24576, 100);
                        p1Var6 = p1Var3;
                        i38 = 0;
                        o0Var2.g0(false);
                    } else {
                        p1Var6 = p1Var3;
                        i38 = 0;
                        o0Var2.C(284519778);
                        o0Var2.g0(false);
                    }
                    if (cVar4.size() == 1) {
                        o0Var2.C(284579236);
                        kt1.b bVar6 = cVar4.get(i38);
                        i39 = i29;
                        if ((i39 & 7168) == 2048) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                        if (i30 != 4) {
                            z34 = true;
                        } else {
                            z34 = true;
                        }
                        z35 = z29 | z34;
                        objQ10 = o0Var2.q();
                        if (z35) {
                            qVar3 = qVar;
                            objQ10 = new i91.c(27, qVar3, xVar);
                            o0Var2.K(objQ10);
                        } else {
                            qVar3 = qVar;
                            objQ10 = new i91.c(27, qVar3, xVar);
                            o0Var2.K(objQ10);
                        }
                        c(bVar6, null, (e23.a) objQ10, o0Var2, 0);
                        o0Var2.g0(false);
                        r14 = 0;
                        qVar2 = qVar3;
                    } else {
                        qVar2 = qVar;
                        i39 = i29;
                        if (cVar4.isEmpty()) {
                            o0Var2.C(284944044);
                            bVar2.getClass();
                            c2.j.i iVarI3 = c2.j.i(eVar2.f97918c);
                            h4.r rVarF13 = x2.f(aVar, 1.0f);
                            bVar2.getClass();
                            h4.r rVarA10 = c2.l.A(rVarF13, 0.0f, eVar2.f97918c, 1);
                            if (i30 != 4) {
                                z25 = true;
                            } else {
                                z25 = true;
                            }
                            if ((i39 & 7168) == 2048) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            z27 = z25 | z26;
                            objQ6 = o0Var2.q();
                            if (z27) {
                                objQ6 = new d(2, xVar, qVar2);
                                o0Var2.K(objQ6);
                            } else {
                                objQ6 = new d(2, xVar, qVar2);
                                o0Var2.K(objQ6);
                            }
                            e2.c.c(rVarA10, null, null, iVarI3, null, null, false, null, (e23.l) objQ6, o0Var2, 0, 494);
                            r14 = 0;
                            o0Var2.g0(false);
                        } else {
                            r14 = 0;
                            o0Var2.C(285751842);
                            o0Var2.g0(false);
                        }
                    }
                    if (cVar3.isEmpty()) {
                        o0Var2.C(285812075);
                        a(cVar3, o0Var2, r14);
                        o0Var2.g0(r14);
                    } else {
                        o0Var2.C(285895682);
                        o0Var2.f();
                    }
                    if (cVar2.isEmpty()) {
                        o0Var2.C(285949870);
                        d(cVar2, o0Var2, r14);
                        o0Var2.f();
                    } else {
                        o0Var2.C(286030594);
                        o0Var2.f();
                    }
                    if (z37) {
                        o0Var2.C(286115069);
                        strP = y.P(R.string.trail_review_helpful_count, new Object[]{String.valueOf(i54)}, o0Var2);
                        o0Var2.f();
                    } else {
                        o0Var2.C(286253081);
                        strP = y.P(R.string.trail_review_not_helpful_count, new Object[]{String.valueOf(i54)}, o0Var2);
                        o0Var2.f();
                    }
                    zB = o0Var2.B(strP);
                    objQ7 = o0Var2.q();
                    if (zB) {
                        objQ7 = new jl0.e(strP, 3);
                        o0Var2.K(objQ7);
                    } else {
                        objQ7 = new jl0.e(strP, 3);
                        o0Var2.K(objQ7);
                    }
                    h4.r rVarA11 = v2.a(c2.l.A(p5.v.c((e23.l) objQ7, aVar, true), 0.0f, d92.b.b().b().getF97918c(), 1), xVar.f141019p, new jl1.a(8), o0Var2, 0);
                    s2VarA2 = q2.a(c2.j.i(d92.b.b().b().getF97918c()), h4.d.a.a(), o0Var2, 48);
                    iHashCode7 = Long.hashCode(p0.i(o0Var2));
                    i2VarX = o0Var2.x();
                    rVarC7 = h4.k.c(rVarA11, o0Var2);
                    aVarA = h5.g.a.a();
                    if (o0Var2.F() != null) {
                        p0.l();
                        throw null;
                    }
                    o0Var2.z();
                    if (o0Var2.getT()) {
                        o0Var2.M(aVarA);
                    } else {
                        o0Var2.c();
                    }
                    b4.c(h5.g.a.c(), s2VarA2, o0Var2);
                    b4.c(h5.g.a.e(), i2VarX, o0Var2);
                    bVarB = h5.g.a.b();
                    if (o0Var2.getT()) {
                        v.h.A(iHashCode7, o0Var2, iHashCode7, bVarB);
                    } else {
                        v.h.A(iHashCode7, o0Var2, iHashCode7, bVarB);
                    }
                    b4.c(h5.g.a.d(), rVarC7, o0Var2);
                    pVar2 = pVar;
                    v.a(y3Var.c(g6.f.a(f14)), z3.f.c(-1920705380, new i20.b(21, xVar, pVar2), o0Var2), o0Var2, 56);
                    objQ8 = o0Var2.q();
                    if (objQ8 == p3.m.a.a()) {
                        objQ8 = new jn2.b(25);
                        o0Var2.K(objQ8);
                    }
                    h4.r rVarB3 = p5.v.b(aVar, (e23.l) objQ8);
                    if (z37) {
                        o0Var2.C(1288831543);
                        strP2 = y.P(R.string.value_in_parenthesis, new Object[]{String.valueOf(i54)}, o0Var2);
                        o0Var2.f();
                    } else {
                        o0Var2.C(1288979537);
                        strP2 = y.P(R.string.trail_review_helpful_count, new Object[]{String.valueOf(i54)}, o0Var2);
                        o0Var2.f();
                    }
                    String str14 = strP2;
                    d92.b.c().getClass();
                    mh.c(str14, rVarB3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97937n, o0Var2), o0Var2, 0, 0, 131068);
                    o0Var2.y();
                    o0Var2.y();
                    o0Var2.y();
                    o0Var2.y();
                    if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                        o0Var2.C(1658659424);
                        jg.b.c(p1Var2, xVar.f141004a, str, lVar2, o0Var2, ((i39 << 3) & 896) | 6 | ((i39 >> 9) & 7168));
                        o0Var2.f();
                    } else {
                        o0Var2.C(1658874688);
                        o0Var2.f();
                    }
                    if (i30 != 4) {
                        z28 = true;
                    } else {
                        z28 = true;
                    }
                    objQ9 = o0Var2.q();
                    if (z28) {
                        objQ9 = new a(p1Var4, xVar, p1Var6, null);
                        o0Var2.K(objQ9);
                    } else {
                        objQ9 = new a(p1Var4, xVar, p1Var6, null);
                        o0Var2.K(objQ9);
                    }
                    l0.e((p) objQ9, str7, o0Var2);
                    x1 x1Var10 = p3.n.f135158a;
                    lVar8 = lVar12;
                    lVar9 = lVar13;
                    z16 = z18;
                    o0Var = o0Var2;
                } else {
                    obj2 = obj;
                }
                objQ5 = new d(1, xVar, context2);
                o0Var2.K(objQ5);
                h4.r rVarC14 = p5.v.c((e23.l) objQ5, rVarA9, false);
                fVar2.getClass();
                mh.d(cVarK2, rVarC14, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, d92.c.b(j92.f.f97936m, o0Var2), o0Var2, 0, 0, 262140);
                if (d53.w.J(str6)) {
                    o0Var2.C(283824014);
                    str4 = (String) p1Var4.getF182175a();
                    if (str4 == null) {
                        z36 = false;
                    } else {
                        z36 = false;
                    }
                    if (z36) {
                        str5 = (String) p1Var4.getF182175a();
                        if (str5 == null) {
                            str5 = "";
                        }
                    } else {
                        str5 = str6;
                    }
                    h4.r rVarF14 = x2.f(aVar, 1.0f);
                    bVar2.getClass();
                    h4.r rVarC15 = c2.l.C(rVarF14, 0.0f, 0.0f, 0.0f, eVar2.f97920e, 7);
                    fVar2.getClass();
                    x0 x0VarB4 = d92.c.b(x0Var, o0Var2);
                    fVar2.getClass();
                    g02.q.b(str5, rVarC15, 0, x0VarB4, p1Var3, null, null, x0.a(x0Var, hb.a.s(o0Var2), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0Var2, 24576, 100);
                    p1Var6 = p1Var3;
                    i38 = 0;
                    o0Var2.g0(false);
                } else {
                    p1Var6 = p1Var3;
                    i38 = 0;
                    o0Var2.C(284519778);
                    o0Var2.g0(false);
                }
                if (cVar4.size() == 1) {
                    o0Var2.C(284579236);
                    kt1.b bVar7 = cVar4.get(i38);
                    i39 = i29;
                    if ((i39 & 7168) == 2048) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    if (i30 != 4) {
                        z34 = true;
                    } else {
                        z34 = true;
                    }
                    z35 = z29 | z34;
                    objQ10 = o0Var2.q();
                    if (z35) {
                        qVar3 = qVar;
                        objQ10 = new i91.c(27, qVar3, xVar);
                        o0Var2.K(objQ10);
                    } else {
                        qVar3 = qVar;
                        objQ10 = new i91.c(27, qVar3, xVar);
                        o0Var2.K(objQ10);
                    }
                    c(bVar7, null, (e23.a) objQ10, o0Var2, 0);
                    o0Var2.g0(false);
                    r14 = 0;
                    qVar2 = qVar3;
                } else {
                    qVar2 = qVar;
                    i39 = i29;
                    if (cVar4.isEmpty()) {
                        o0Var2.C(284944044);
                        bVar2.getClass();
                        c2.j.i iVarI4 = c2.j.i(eVar2.f97918c);
                        h4.r rVarF15 = x2.f(aVar, 1.0f);
                        bVar2.getClass();
                        h4.r rVarA12 = c2.l.A(rVarF15, 0.0f, eVar2.f97918c, 1);
                        if (i30 != 4) {
                            z25 = true;
                        } else {
                            z25 = true;
                        }
                        if ((i39 & 7168) == 2048) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        z27 = z25 | z26;
                        objQ6 = o0Var2.q();
                        if (z27) {
                            objQ6 = new d(2, xVar, qVar2);
                            o0Var2.K(objQ6);
                        } else {
                            objQ6 = new d(2, xVar, qVar2);
                            o0Var2.K(objQ6);
                        }
                        e2.c.c(rVarA12, null, null, iVarI4, null, null, false, null, (e23.l) objQ6, o0Var2, 0, 494);
                        r14 = 0;
                        o0Var2.g0(false);
                    } else {
                        r14 = 0;
                        o0Var2.C(285751842);
                        o0Var2.g0(false);
                    }
                }
                if (cVar3.isEmpty()) {
                    o0Var2.C(285812075);
                    a(cVar3, o0Var2, r14);
                    o0Var2.g0(r14);
                } else {
                    o0Var2.C(285895682);
                    o0Var2.f();
                }
                if (cVar2.isEmpty()) {
                    o0Var2.C(285949870);
                    d(cVar2, o0Var2, r14);
                    o0Var2.f();
                } else {
                    o0Var2.C(286030594);
                    o0Var2.f();
                }
                if (z37) {
                    o0Var2.C(286115069);
                    strP = y.P(R.string.trail_review_helpful_count, new Object[]{String.valueOf(i54)}, o0Var2);
                    o0Var2.f();
                } else {
                    o0Var2.C(286253081);
                    strP = y.P(R.string.trail_review_not_helpful_count, new Object[]{String.valueOf(i54)}, o0Var2);
                    o0Var2.f();
                }
                zB = o0Var2.B(strP);
                objQ7 = o0Var2.q();
                if (zB) {
                    objQ7 = new jl0.e(strP, 3);
                    o0Var2.K(objQ7);
                } else {
                    objQ7 = new jl0.e(strP, 3);
                    o0Var2.K(objQ7);
                }
                h4.r rVarA13 = v2.a(c2.l.A(p5.v.c((e23.l) objQ7, aVar, true), 0.0f, d92.b.b().b().getF97918c(), 1), xVar.f141019p, new jl1.a(8), o0Var2, 0);
                s2VarA2 = q2.a(c2.j.i(d92.b.b().b().getF97918c()), h4.d.a.a(), o0Var2, 48);
                iHashCode7 = Long.hashCode(p0.i(o0Var2));
                i2VarX = o0Var2.x();
                rVarC7 = h4.k.c(rVarA13, o0Var2);
                aVarA = h5.g.a.a();
                if (o0Var2.F() != null) {
                    p0.l();
                    throw null;
                }
                o0Var2.z();
                if (o0Var2.getT()) {
                    o0Var2.M(aVarA);
                } else {
                    o0Var2.c();
                }
                b4.c(h5.g.a.c(), s2VarA2, o0Var2);
                b4.c(h5.g.a.e(), i2VarX, o0Var2);
                bVarB = h5.g.a.b();
                if (o0Var2.getT()) {
                    v.h.A(iHashCode7, o0Var2, iHashCode7, bVarB);
                } else {
                    v.h.A(iHashCode7, o0Var2, iHashCode7, bVarB);
                }
                b4.c(h5.g.a.d(), rVarC7, o0Var2);
                pVar2 = pVar;
                v.a(y3Var.c(g6.f.a(f14)), z3.f.c(-1920705380, new i20.b(21, xVar, pVar2), o0Var2), o0Var2, 56);
                objQ8 = o0Var2.q();
                if (objQ8 == p3.m.a.a()) {
                    objQ8 = new jn2.b(25);
                    o0Var2.K(objQ8);
                }
                h4.r rVarB4 = p5.v.b(aVar, (e23.l) objQ8);
                if (z37) {
                    o0Var2.C(1288831543);
                    strP2 = y.P(R.string.value_in_parenthesis, new Object[]{String.valueOf(i54)}, o0Var2);
                    o0Var2.f();
                } else {
                    o0Var2.C(1288979537);
                    strP2 = y.P(R.string.trail_review_helpful_count, new Object[]{String.valueOf(i54)}, o0Var2);
                    o0Var2.f();
                }
                String str15 = strP2;
                d92.b.c().getClass();
                mh.c(str15, rVarB4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97937n, o0Var2), o0Var2, 0, 0, 131068);
                o0Var2.y();
                o0Var2.y();
                o0Var2.y();
                o0Var2.y();
                if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                    o0Var2.C(1658659424);
                    jg.b.c(p1Var2, xVar.f141004a, str, lVar2, o0Var2, ((i39 << 3) & 896) | 6 | ((i39 >> 9) & 7168));
                    o0Var2.f();
                } else {
                    o0Var2.C(1658874688);
                    o0Var2.f();
                }
                if (i30 != 4) {
                    z28 = true;
                } else {
                    z28 = true;
                }
                objQ9 = o0Var2.q();
                if (z28) {
                    objQ9 = new a(p1Var4, xVar, p1Var6, null);
                    o0Var2.K(objQ9);
                } else {
                    objQ9 = new a(p1Var4, xVar, p1Var6, null);
                    o0Var2.K(objQ9);
                }
                l0.e((p) objQ9, str7, o0Var2);
                x1 x1Var11 = p3.n.f135158a;
                lVar8 = lVar12;
                lVar9 = lVar13;
                z16 = z18;
                o0Var = o0Var2;
            } else {
                pVar2 = pVar;
                o0 o0Var3 = o0VarE;
                qVar2 = qVar;
                o0Var3.e();
                z16 = z14;
                lVar8 = lVar5;
                lVar9 = lVar6;
                o0Var = o0Var3;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f(new cw1.l0(xVar, str, z16, qVar2, pVar2, lVar, lVar2, lVar3, lVar4, lVar8, lVar9, lVar7, i14, i15, i16));
            }
        }
        i17 = i56 | 384;
        if ((i14 & 3072) == 0) {
            if (o0VarE.r(qVar)) {
                i49 = 2048;
            } else {
                i49 = 1024;
            }
            i17 |= i49;
        }
        if ((i14 & 24576) == 0) {
            if (o0VarE.r(pVar)) {
                i48 = 16384;
            } else {
                i48 = 8192;
            }
            i17 |= i48;
        }
        if ((196608 & i14) != 0) {
            if (o0VarE.r(lVar)) {
                i47 = 131072;
            } else {
                i47 = 65536;
            }
            i17 |= i47;
        }
        if ((i14 & 1572864) == 0) {
            if (o0VarE.r(lVar2)) {
                i46 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            } else {
                i46 = 524288;
            }
            i17 |= i46;
        }
        if ((i14 & 12582912) == 0) {
            if (o0VarE.r(lVar3)) {
                i45 = 8388608;
            } else {
                i45 = 4194304;
            }
            i17 |= i45;
        }
        if ((i14 & 100663296) == 0) {
            if (o0VarE.r(lVar4)) {
                i44 = 67108864;
            } else {
                i44 = 33554432;
            }
            i17 |= i44;
        }
        i18 = i16 & 512;
        if (i18 != 0) {
            i18 = i18;
            i19 = i17 | C.ENCODING_PCM_32BIT;
        } else {
            if ((i14 & C.ENCODING_PCM_32BIT) != 0) {
                if (o0VarE.r(lVar5)) {
                    i24 = 536870912;
                } else {
                    i24 = 268435456;
                }
                i17 |= i24;
            }
            i19 = i17;
        }
        i25 = i16 & 1024;
        if (i25 != 0) {
            i26 = i15 | 6;
        } else if ((i15 & 6) == 0) {
            if (o0VarE.r(lVar6)) {
                i27 = 4;
            } else {
                i27 = 2;
            }
            i26 = i15 | i27;
        } else {
            i26 = i15;
        }
        if ((i15 & 48) == 0) {
            i26 |= o0VarE.r(lVar7) ? 32 : 16;
        }
        i28 = i26;
        if ((i19 & 306783379) == 306783378) {
            z15 = true;
        } else {
            z15 = true;
        }
        if (o0VarE.n(i19 & 1, z15)) {
            if (i57 != 0) {
                z17 = false;
            } else {
                z17 = z14;
            }
            if (i18 != 0) {
                lVar10 = null;
            } else {
                lVar10 = lVar5;
            }
            if (i25 != 0) {
                lVar11 = null;
            } else {
                lVar11 = lVar6;
            }
            x1 x1Var12 = p3.n.f135158a;
            objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            obj = p3.m.a.f135155b;
            if (objQ == obj) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1Var = (p1) objQ;
            z18 = z17;
            objQ2 = o0VarE.q();
            if (objQ2 == obj) {
                objQ2 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p1Var2 = (p1) objQ2;
            objQ3 = o0VarE.q();
            if (objQ3 == obj) {
                objQ3 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p1Var3 = (p1) objQ3;
            objQ4 = o0VarE.q();
            if (objQ4 == obj) {
                objQ4 = p0.n(str7);
                o0VarE.K(objQ4);
            }
            p1Var4 = (p1) objQ4;
            i29 = i19;
            aVar = h4.r.S;
            rVarA = v2.a(aVar, z39, new jl1.a(6), o0VarE, 6);
            h4.r rVarF16 = x2.f(aVar, 1.0f);
            long jB2 = am.j.B(d92.b.f58623a, o0VarE);
            aVar2 = m1.f128891a;
            h4.r rVarE4 = u1.n.e(rVarF16, jB2, aVar2);
            c2.j.f22691a.getClass();
            c2.j.k kVar2 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            aVar3 = h4.d.a.f81536n;
            zVarA = c2.y.a(kVar2, aVar3, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.getU());
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarE4, o0VarE);
            h5.g.V.getClass();
            aVar4 = h5.g.a.f81805b;
            if (cVar5 != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            lVar12 = lVar10;
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                cVar = cVar5;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                c2.b0 b0Var3 = c2.b0.f22601a;
                if (z39) {
                    o0VarE.C(-1801157554);
                    h4.r rVarF17 = x2.f(aVar, 1.0f);
                    d92.b.f58625c.getClass();
                    p1Var5 = p1Var;
                    g.a(c2.l.y(rVarF17, j92.b.f97899b.f97918c), y.Q(o0VarE, R.string.review_hidden_message), ro0.l.TRAIL_REVIEW_HIDDEN, o0VarE, 384);
                    o0VarE.g0(false);
                } else {
                    p1Var5 = p1Var;
                    if (xVar.f141024u) {
                        o0VarE.C(-1800793056);
                        h4.r rVarF18 = x2.f(aVar, 1.0f);
                        d92.b.f58625c.getClass();
                        g.a(c2.l.y(rVarF18, j92.b.f97899b.f97918c), y.Q(o0VarE, R.string.review_hidden_photos_message), ro0.l.TRAIL_REVIEW_PHOTOS_HIDDEN, o0VarE, 384);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-1800464394);
                        o0VarE.g0(false);
                    }
                }
                h4.r rVarE5 = u1.n.e(x2.f(aVar, 1.0f), d92.b.a(o0VarE).c().a(), aVar2);
                bVar2 = d92.b.f58625c;
                bVar2.getClass();
                eVar2 = j92.b.f97899b;
                h4.r rVarA14 = v2.a(c2.l.y(rVarE5, eVar2.f97920e), z39, new hv0.d(11, lVar11, xVar), o0VarE, 0);
                bVar2.getClass();
                zVarA2 = c2.y.a(c2.j.i(eVar2.f97918c), aVar3, o0VarE, 0);
                iHashCode2 = Long.hashCode(o0VarE.getU());
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarA14, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                lVar13 = lVar11;
                if (o0VarE.T) {
                    o0VarE.M(aVar4);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, zVarA2, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                } else {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, o0VarE);
                bVar2.getClass();
                s2VarA = q2.a(c2.j.i(eVar2.f97918c), h4.d.a.f81533k, o0VarE, 0);
                iHashCode3 = Long.hashCode(o0VarE.getU());
                i2VarA2 = o0VarE.a0();
                rVarC3 = h4.k.c(aVar, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar4);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA2, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                } else {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                }
                b4.c(fVar, rVarC3, o0VarE);
                u2 u2Var3 = u2.f22900a;
                bVar2.getClass();
                float f17 = j92.b.f97901d.f97905d;
                if (z38) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 715095693, R.string.lbl_anonymous_user, o0VarE, false);
                } else {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 715199636, R.string.lbl_profile, o0VarE, false);
                }
                str2 = xVar.f141007d;
                if (z38) {
                    z19 = false;
                } else {
                    z19 = false;
                }
                if (z19) {
                    str3 = str2;
                } else {
                    str3 = null;
                }
                if (z38) {
                    num = 2131231047;
                } else {
                    num = null;
                }
                b12.k.b(rVarA, strJ, f17, new b12.b(str3, num, null, null, null, 28, null), o0VarE, b12.b.f14385f << 9, 16);
                h4.r rVarThen3 = u2Var3.a(aVar, 1.0f, true).then(rVarA);
                bVar2.getClass();
                zVarA3 = c2.y.a(c2.j.i(eVar2.f97917b), aVar3, o0VarE, 0);
                x1 x1Var13 = p3.n.f135158a;
                iHashCode4 = Long.hashCode(o0VarE.getU());
                i2VarA3 = o0VarE.a0();
                rVarC4 = h4.k.c(rVarThen3, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar4);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, zVarA3, o0VarE);
                b4.c(c1623g, i2VarA3, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode4, o0VarE, iHashCode4, bVar);
                } else {
                    v.h.A(iHashCode4, o0VarE, iHashCode4, bVar);
                }
                b4.c(fVar, rVarC4, o0VarE);
                String str16 = xVar.f141006c;
                fVar2 = d92.b.f58624b;
                fVar2.getClass();
                x0Var = j92.f.f97931h;
                mh.c(str16, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131070);
                String str17 = xVar.f141008e;
                fVar2.getClass();
                mh.c(str17, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131070);
                o0VarE.g0(true);
                z0VarD = q.d(h4.d.a.f81524b, false);
                iHashCode5 = Long.hashCode(o0VarE.getU());
                i2VarA4 = o0VarE.a0();
                rVarC5 = h4.k.c(aVar, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar4);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, z0VarD, o0VarE);
                b4.c(c1623g, i2VarA4, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode5, o0VarE, iHashCode5, bVar);
                } else {
                    v.h.A(iHashCode5, o0VarE, iHashCode5, bVar);
                }
                b4.c(fVar, rVarC5, o0VarE);
                c2.u uVar3 = c2.u.f22885a;
                y3Var = p7.f89282d;
                g6.f.f75994b.getClass();
                f14 = g6.f.f75996d;
                p1 p1Var9 = p1Var5;
                v.a(y3Var.c(g6.f.a(f14)), z3.f.c(-536898676, new l1(p1Var9, 19, (byte) 0), o0VarE), o0VarE, 56);
                i30 = i29 & 14;
                int i510 = i29 >> 3;
                b(xVar, z18, p1Var9, p1Var4, lVar, lVar3, p1Var2, lVar4, lVar12, lVar13, lVar7, o0VarE, 1576320 | i30 | (i510 & 112) | (i510 & 57344) | ((i29 >> 6) & 458752) | (i510 & 29360128) | (i510 & 234881024) | ((i28 << 27) & 1879048192), (i28 >> 3) & 14);
                o0Var2 = o0VarE;
                o0Var2.g0(true);
                o0Var2.g0(true);
                bVar2.getClass();
                zVarA4 = c2.y.a(c2.j.i(eVar2.f97918c), aVar3, o0Var2, 0);
                iHashCode6 = Long.hashCode(o0Var2.getU());
                i2VarA5 = o0Var2.a0();
                rVarC6 = h4.k.c(rVarA, o0Var2);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0Var2.z();
                if (o0Var2.T) {
                    o0Var2.M(aVar4);
                } else {
                    o0Var2.c();
                }
                b4.c(eVar, zVarA4, o0Var2);
                b4.c(c1623g, i2VarA5, o0Var2);
                if (o0Var2.T) {
                    v.h.A(iHashCode6, o0Var2, iHashCode6, bVar);
                } else {
                    v.h.A(iHashCode6, o0Var2, iHashCode6, bVar);
                }
                b4.c(fVar, rVarC6, o0Var2);
                Context context3 = (Context) o0Var2.A(AndroidCompositionLocals_androidKt.f6042b);
                i34 = xVar.f141009f;
                x1 x1Var14 = p3.n.f135158a;
                o0Var2.C(-1685008668);
                bVar3 = new s5.c.b(0, 1, null);
                while (i35 < i34) {
                    bVar3.b("★");
                }
                d92.b.f58623a.getClass();
                int iJ3 = bVar3.j(new i0(d92.b.a(o0Var2).k().d(), 0L, (f0) null, (w5.b0) null, (c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (p005kotlin.jvm.internal.j) null));
                i36 = 5 - i34;
                while (i37 < i36) {
                    bVar3.b("★");
                }
                Unit unit3 = Unit.INSTANCE;
                bVar3.f(iJ3);
                s5.c cVarK3 = bVar3.k();
                o0Var2.f();
                x1 x1Var15 = p3.n.f135158a;
                h4.r rVarF19 = x2.f(aVar, 1.0f);
                bVar2.getClass();
                h4.r rVarA15 = c2.l.A(rVarF19, 0.0f, eVar2.f97920e, 1);
                if (i30 != 4) {
                    z24 = true;
                } else {
                    z24 = true;
                }
                zR = z24 | o0Var2.r(context3);
                objQ5 = o0Var2.q();
                if (zR) {
                    obj2 = obj;
                    if (objQ5 == obj2) {
                    }
                    h4.r rVarC16 = p5.v.c((e23.l) objQ5, rVarA15, false);
                    fVar2.getClass();
                    mh.d(cVarK3, rVarC16, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, d92.c.b(j92.f.f97936m, o0Var2), o0Var2, 0, 0, 262140);
                    if (d53.w.J(str6)) {
                        o0Var2.C(283824014);
                        str4 = (String) p1Var4.getF182175a();
                        if (str4 == null) {
                            z36 = false;
                        } else {
                            z36 = false;
                        }
                        if (z36) {
                            str5 = (String) p1Var4.getF182175a();
                            if (str5 == null) {
                                str5 = "";
                            }
                        } else {
                            str5 = str6;
                        }
                        h4.r rVarF110 = x2.f(aVar, 1.0f);
                        bVar2.getClass();
                        h4.r rVarC17 = c2.l.C(rVarF110, 0.0f, 0.0f, 0.0f, eVar2.f97920e, 7);
                        fVar2.getClass();
                        x0 x0VarB5 = d92.c.b(x0Var, o0Var2);
                        fVar2.getClass();
                        g02.q.b(str5, rVarC17, 0, x0VarB5, p1Var3, null, null, x0.a(x0Var, hb.a.s(o0Var2), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0Var2, 24576, 100);
                        p1Var6 = p1Var3;
                        i38 = 0;
                        o0Var2.g0(false);
                    } else {
                        p1Var6 = p1Var3;
                        i38 = 0;
                        o0Var2.C(284519778);
                        o0Var2.g0(false);
                    }
                    if (cVar4.size() == 1) {
                        o0Var2.C(284579236);
                        kt1.b bVar8 = cVar4.get(i38);
                        i39 = i29;
                        if ((i39 & 7168) == 2048) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                        if (i30 != 4) {
                            z34 = true;
                        } else {
                            z34 = true;
                        }
                        z35 = z29 | z34;
                        objQ10 = o0Var2.q();
                        if (z35) {
                            qVar3 = qVar;
                            objQ10 = new i91.c(27, qVar3, xVar);
                            o0Var2.K(objQ10);
                        } else {
                            qVar3 = qVar;
                            objQ10 = new i91.c(27, qVar3, xVar);
                            o0Var2.K(objQ10);
                        }
                        c(bVar8, null, (e23.a) objQ10, o0Var2, 0);
                        o0Var2.g0(false);
                        r14 = 0;
                        qVar2 = qVar3;
                    } else {
                        qVar2 = qVar;
                        i39 = i29;
                        if (cVar4.isEmpty()) {
                            o0Var2.C(284944044);
                            bVar2.getClass();
                            c2.j.i iVarI5 = c2.j.i(eVar2.f97918c);
                            h4.r rVarF111 = x2.f(aVar, 1.0f);
                            bVar2.getClass();
                            h4.r rVarA16 = c2.l.A(rVarF111, 0.0f, eVar2.f97918c, 1);
                            if (i30 != 4) {
                                z25 = true;
                            } else {
                                z25 = true;
                            }
                            if ((i39 & 7168) == 2048) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            z27 = z25 | z26;
                            objQ6 = o0Var2.q();
                            if (z27) {
                                objQ6 = new d(2, xVar, qVar2);
                                o0Var2.K(objQ6);
                            } else {
                                objQ6 = new d(2, xVar, qVar2);
                                o0Var2.K(objQ6);
                            }
                            e2.c.c(rVarA16, null, null, iVarI5, null, null, false, null, (e23.l) objQ6, o0Var2, 0, 494);
                            r14 = 0;
                            o0Var2.g0(false);
                        } else {
                            r14 = 0;
                            o0Var2.C(285751842);
                            o0Var2.g0(false);
                        }
                    }
                    if (cVar3.isEmpty()) {
                        o0Var2.C(285812075);
                        a(cVar3, o0Var2, r14);
                        o0Var2.g0(r14);
                    } else {
                        o0Var2.C(285895682);
                        o0Var2.f();
                    }
                    if (cVar2.isEmpty()) {
                        o0Var2.C(285949870);
                        d(cVar2, o0Var2, r14);
                        o0Var2.f();
                    } else {
                        o0Var2.C(286030594);
                        o0Var2.f();
                    }
                    if (z37) {
                        o0Var2.C(286115069);
                        strP = y.P(R.string.trail_review_helpful_count, new Object[]{String.valueOf(i54)}, o0Var2);
                        o0Var2.f();
                    } else {
                        o0Var2.C(286253081);
                        strP = y.P(R.string.trail_review_not_helpful_count, new Object[]{String.valueOf(i54)}, o0Var2);
                        o0Var2.f();
                    }
                    zB = o0Var2.B(strP);
                    objQ7 = o0Var2.q();
                    if (zB) {
                        objQ7 = new jl0.e(strP, 3);
                        o0Var2.K(objQ7);
                    } else {
                        objQ7 = new jl0.e(strP, 3);
                        o0Var2.K(objQ7);
                    }
                    h4.r rVarA17 = v2.a(c2.l.A(p5.v.c((e23.l) objQ7, aVar, true), 0.0f, d92.b.b().b().getF97918c(), 1), xVar.f141019p, new jl1.a(8), o0Var2, 0);
                    s2VarA2 = q2.a(c2.j.i(d92.b.b().b().getF97918c()), h4.d.a.a(), o0Var2, 48);
                    iHashCode7 = Long.hashCode(p0.i(o0Var2));
                    i2VarX = o0Var2.x();
                    rVarC7 = h4.k.c(rVarA17, o0Var2);
                    aVarA = h5.g.a.a();
                    if (o0Var2.F() != null) {
                        p0.l();
                        throw null;
                    }
                    o0Var2.z();
                    if (o0Var2.getT()) {
                        o0Var2.M(aVarA);
                    } else {
                        o0Var2.c();
                    }
                    b4.c(h5.g.a.c(), s2VarA2, o0Var2);
                    b4.c(h5.g.a.e(), i2VarX, o0Var2);
                    bVarB = h5.g.a.b();
                    if (o0Var2.getT()) {
                        v.h.A(iHashCode7, o0Var2, iHashCode7, bVarB);
                    } else {
                        v.h.A(iHashCode7, o0Var2, iHashCode7, bVarB);
                    }
                    b4.c(h5.g.a.d(), rVarC7, o0Var2);
                    pVar2 = pVar;
                    v.a(y3Var.c(g6.f.a(f14)), z3.f.c(-1920705380, new i20.b(21, xVar, pVar2), o0Var2), o0Var2, 56);
                    objQ8 = o0Var2.q();
                    if (objQ8 == p3.m.a.a()) {
                        objQ8 = new jn2.b(25);
                        o0Var2.K(objQ8);
                    }
                    h4.r rVarB5 = p5.v.b(aVar, (e23.l) objQ8);
                    if (z37) {
                        o0Var2.C(1288831543);
                        strP2 = y.P(R.string.value_in_parenthesis, new Object[]{String.valueOf(i54)}, o0Var2);
                        o0Var2.f();
                    } else {
                        o0Var2.C(1288979537);
                        strP2 = y.P(R.string.trail_review_helpful_count, new Object[]{String.valueOf(i54)}, o0Var2);
                        o0Var2.f();
                    }
                    String str18 = strP2;
                    d92.b.c().getClass();
                    mh.c(str18, rVarB5, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97937n, o0Var2), o0Var2, 0, 0, 131068);
                    o0Var2.y();
                    o0Var2.y();
                    o0Var2.y();
                    o0Var2.y();
                    if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                        o0Var2.C(1658659424);
                        jg.b.c(p1Var2, xVar.f141004a, str, lVar2, o0Var2, ((i39 << 3) & 896) | 6 | ((i39 >> 9) & 7168));
                        o0Var2.f();
                    } else {
                        o0Var2.C(1658874688);
                        o0Var2.f();
                    }
                    if (i30 != 4) {
                        z28 = true;
                    } else {
                        z28 = true;
                    }
                    objQ9 = o0Var2.q();
                    if (z28) {
                        objQ9 = new a(p1Var4, xVar, p1Var6, null);
                        o0Var2.K(objQ9);
                    } else {
                        objQ9 = new a(p1Var4, xVar, p1Var6, null);
                        o0Var2.K(objQ9);
                    }
                    l0.e((p) objQ9, str7, o0Var2);
                    x1 x1Var16 = p3.n.f135158a;
                    lVar8 = lVar12;
                    lVar9 = lVar13;
                    z16 = z18;
                    o0Var = o0Var2;
                } else {
                    obj2 = obj;
                }
                objQ5 = new d(1, xVar, context3);
                o0Var2.K(objQ5);
                h4.r rVarC18 = p5.v.c((e23.l) objQ5, rVarA15, false);
                fVar2.getClass();
                mh.d(cVarK3, rVarC18, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, d92.c.b(j92.f.f97936m, o0Var2), o0Var2, 0, 0, 262140);
                if (d53.w.J(str6)) {
                    o0Var2.C(283824014);
                    str4 = (String) p1Var4.getF182175a();
                    if (str4 == null) {
                        z36 = false;
                    } else {
                        z36 = false;
                    }
                    if (z36) {
                        str5 = (String) p1Var4.getF182175a();
                        if (str5 == null) {
                            str5 = "";
                        }
                    } else {
                        str5 = str6;
                    }
                    h4.r rVarF112 = x2.f(aVar, 1.0f);
                    bVar2.getClass();
                    h4.r rVarC19 = c2.l.C(rVarF112, 0.0f, 0.0f, 0.0f, eVar2.f97920e, 7);
                    fVar2.getClass();
                    x0 x0VarB6 = d92.c.b(x0Var, o0Var2);
                    fVar2.getClass();
                    g02.q.b(str5, rVarC19, 0, x0VarB6, p1Var3, null, null, x0.a(x0Var, hb.a.s(o0Var2), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0Var2, 24576, 100);
                    p1Var6 = p1Var3;
                    i38 = 0;
                    o0Var2.g0(false);
                } else {
                    p1Var6 = p1Var3;
                    i38 = 0;
                    o0Var2.C(284519778);
                    o0Var2.g0(false);
                }
                if (cVar4.size() == 1) {
                    o0Var2.C(284579236);
                    kt1.b bVar9 = cVar4.get(i38);
                    i39 = i29;
                    if ((i39 & 7168) == 2048) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    if (i30 != 4) {
                        z34 = true;
                    } else {
                        z34 = true;
                    }
                    z35 = z29 | z34;
                    objQ10 = o0Var2.q();
                    if (z35) {
                        qVar3 = qVar;
                        objQ10 = new i91.c(27, qVar3, xVar);
                        o0Var2.K(objQ10);
                    } else {
                        qVar3 = qVar;
                        objQ10 = new i91.c(27, qVar3, xVar);
                        o0Var2.K(objQ10);
                    }
                    c(bVar9, null, (e23.a) objQ10, o0Var2, 0);
                    o0Var2.g0(false);
                    r14 = 0;
                    qVar2 = qVar3;
                } else {
                    qVar2 = qVar;
                    i39 = i29;
                    if (cVar4.isEmpty()) {
                        o0Var2.C(284944044);
                        bVar2.getClass();
                        c2.j.i iVarI6 = c2.j.i(eVar2.f97918c);
                        h4.r rVarF113 = x2.f(aVar, 1.0f);
                        bVar2.getClass();
                        h4.r rVarA18 = c2.l.A(rVarF113, 0.0f, eVar2.f97918c, 1);
                        if (i30 != 4) {
                            z25 = true;
                        } else {
                            z25 = true;
                        }
                        if ((i39 & 7168) == 2048) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        z27 = z25 | z26;
                        objQ6 = o0Var2.q();
                        if (z27) {
                            objQ6 = new d(2, xVar, qVar2);
                            o0Var2.K(objQ6);
                        } else {
                            objQ6 = new d(2, xVar, qVar2);
                            o0Var2.K(objQ6);
                        }
                        e2.c.c(rVarA18, null, null, iVarI6, null, null, false, null, (e23.l) objQ6, o0Var2, 0, 494);
                        r14 = 0;
                        o0Var2.g0(false);
                    } else {
                        r14 = 0;
                        o0Var2.C(285751842);
                        o0Var2.g0(false);
                    }
                }
                if (cVar3.isEmpty()) {
                    o0Var2.C(285812075);
                    a(cVar3, o0Var2, r14);
                    o0Var2.g0(r14);
                } else {
                    o0Var2.C(285895682);
                    o0Var2.f();
                }
                if (cVar2.isEmpty()) {
                    o0Var2.C(285949870);
                    d(cVar2, o0Var2, r14);
                    o0Var2.f();
                } else {
                    o0Var2.C(286030594);
                    o0Var2.f();
                }
                if (z37) {
                    o0Var2.C(286115069);
                    strP = y.P(R.string.trail_review_helpful_count, new Object[]{String.valueOf(i54)}, o0Var2);
                    o0Var2.f();
                } else {
                    o0Var2.C(286253081);
                    strP = y.P(R.string.trail_review_not_helpful_count, new Object[]{String.valueOf(i54)}, o0Var2);
                    o0Var2.f();
                }
                zB = o0Var2.B(strP);
                objQ7 = o0Var2.q();
                if (zB) {
                    objQ7 = new jl0.e(strP, 3);
                    o0Var2.K(objQ7);
                } else {
                    objQ7 = new jl0.e(strP, 3);
                    o0Var2.K(objQ7);
                }
                h4.r rVarA19 = v2.a(c2.l.A(p5.v.c((e23.l) objQ7, aVar, true), 0.0f, d92.b.b().b().getF97918c(), 1), xVar.f141019p, new jl1.a(8), o0Var2, 0);
                s2VarA2 = q2.a(c2.j.i(d92.b.b().b().getF97918c()), h4.d.a.a(), o0Var2, 48);
                iHashCode7 = Long.hashCode(p0.i(o0Var2));
                i2VarX = o0Var2.x();
                rVarC7 = h4.k.c(rVarA19, o0Var2);
                aVarA = h5.g.a.a();
                if (o0Var2.F() != null) {
                    p0.l();
                    throw null;
                }
                o0Var2.z();
                if (o0Var2.getT()) {
                    o0Var2.M(aVarA);
                } else {
                    o0Var2.c();
                }
                b4.c(h5.g.a.c(), s2VarA2, o0Var2);
                b4.c(h5.g.a.e(), i2VarX, o0Var2);
                bVarB = h5.g.a.b();
                if (o0Var2.getT()) {
                    v.h.A(iHashCode7, o0Var2, iHashCode7, bVarB);
                } else {
                    v.h.A(iHashCode7, o0Var2, iHashCode7, bVarB);
                }
                b4.c(h5.g.a.d(), rVarC7, o0Var2);
                pVar2 = pVar;
                v.a(y3Var.c(g6.f.a(f14)), z3.f.c(-1920705380, new i20.b(21, xVar, pVar2), o0Var2), o0Var2, 56);
                objQ8 = o0Var2.q();
                if (objQ8 == p3.m.a.a()) {
                    objQ8 = new jn2.b(25);
                    o0Var2.K(objQ8);
                }
                h4.r rVarB6 = p5.v.b(aVar, (e23.l) objQ8);
                if (z37) {
                    o0Var2.C(1288831543);
                    strP2 = y.P(R.string.value_in_parenthesis, new Object[]{String.valueOf(i54)}, o0Var2);
                    o0Var2.f();
                } else {
                    o0Var2.C(1288979537);
                    strP2 = y.P(R.string.trail_review_helpful_count, new Object[]{String.valueOf(i54)}, o0Var2);
                    o0Var2.f();
                }
                String str19 = strP2;
                d92.b.c().getClass();
                mh.c(str19, rVarB6, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97937n, o0Var2), o0Var2, 0, 0, 131068);
                o0Var2.y();
                o0Var2.y();
                o0Var2.y();
                o0Var2.y();
                if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                    o0Var2.C(1658659424);
                    jg.b.c(p1Var2, xVar.f141004a, str, lVar2, o0Var2, ((i39 << 3) & 896) | 6 | ((i39 >> 9) & 7168));
                    o0Var2.f();
                } else {
                    o0Var2.C(1658874688);
                    o0Var2.f();
                }
                if (i30 != 4) {
                    z28 = true;
                } else {
                    z28 = true;
                }
                objQ9 = o0Var2.q();
                if (z28) {
                    objQ9 = new a(p1Var4, xVar, p1Var6, null);
                    o0Var2.K(objQ9);
                } else {
                    objQ9 = new a(p1Var4, xVar, p1Var6, null);
                    o0Var2.K(objQ9);
                }
                l0.e((p) objQ9, str7, o0Var2);
                x1 x1Var17 = p3.n.f135158a;
                lVar8 = lVar12;
                lVar9 = lVar13;
                z16 = z18;
                o0Var = o0Var2;
            } else {
                cVar = cVar5;
            }
            v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var4 = c2.b0.f22601a;
            if (z39) {
                o0VarE.C(-1801157554);
                h4.r rVarF114 = x2.f(aVar, 1.0f);
                d92.b.f58625c.getClass();
                p1Var5 = p1Var;
                g.a(c2.l.y(rVarF114, j92.b.f97899b.f97918c), y.Q(o0VarE, R.string.review_hidden_message), ro0.l.TRAIL_REVIEW_HIDDEN, o0VarE, 384);
                o0VarE.g0(false);
            } else {
                p1Var5 = p1Var;
                if (xVar.f141024u) {
                    o0VarE.C(-1800793056);
                    h4.r rVarF115 = x2.f(aVar, 1.0f);
                    d92.b.f58625c.getClass();
                    g.a(c2.l.y(rVarF115, j92.b.f97899b.f97918c), y.Q(o0VarE, R.string.review_hidden_photos_message), ro0.l.TRAIL_REVIEW_PHOTOS_HIDDEN, o0VarE, 384);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1800464394);
                    o0VarE.g0(false);
                }
            }
            h4.r rVarE6 = u1.n.e(x2.f(aVar, 1.0f), d92.b.a(o0VarE).c().a(), aVar2);
            bVar2 = d92.b.f58625c;
            bVar2.getClass();
            eVar2 = j92.b.f97899b;
            h4.r rVarA110 = v2.a(c2.l.y(rVarE6, eVar2.f97920e), z39, new hv0.d(11, lVar11, xVar), o0VarE, 0);
            bVar2.getClass();
            zVarA2 = c2.y.a(c2.j.i(eVar2.f97918c), aVar3, o0VarE, 0);
            iHashCode2 = Long.hashCode(o0VarE.getU());
            i2VarA1 = o0VarE.a0();
            rVarC2 = h4.k.c(rVarA110, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            lVar13 = lVar11;
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            } else {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            bVar2.getClass();
            s2VarA = q2.a(c2.j.i(eVar2.f97918c), h4.d.a.f81533k, o0VarE, 0);
            iHashCode3 = Long.hashCode(o0VarE.getU());
            i2VarA2 = o0VarE.a0();
            rVarC3 = h4.k.c(aVar, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA2, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
            } else {
                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
            }
            b4.c(fVar, rVarC3, o0VarE);
            u2 u2Var4 = u2.f22900a;
            bVar2.getClass();
            float f18 = j92.b.f97901d.f97905d;
            if (z38) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 715095693, R.string.lbl_anonymous_user, o0VarE, false);
            } else {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 715199636, R.string.lbl_profile, o0VarE, false);
            }
            str2 = xVar.f141007d;
            if (z38) {
                z19 = false;
            } else {
                z19 = false;
            }
            if (z19) {
                str3 = str2;
            } else {
                str3 = null;
            }
            if (z38) {
                num = 2131231047;
            } else {
                num = null;
            }
            b12.k.b(rVarA, strJ, f18, new b12.b(str3, num, null, null, null, 28, null), o0VarE, b12.b.f14385f << 9, 16);
            h4.r rVarThen4 = u2Var4.a(aVar, 1.0f, true).then(rVarA);
            bVar2.getClass();
            zVarA3 = c2.y.a(c2.j.i(eVar2.f97917b), aVar3, o0VarE, 0);
            x1 x1Var18 = p3.n.f135158a;
            iHashCode4 = Long.hashCode(o0VarE.getU());
            i2VarA3 = o0VarE.a0();
            rVarC4 = h4.k.c(rVarThen4, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA3, o0VarE);
            b4.c(c1623g, i2VarA3, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode4, o0VarE, iHashCode4, bVar);
            } else {
                v.h.A(iHashCode4, o0VarE, iHashCode4, bVar);
            }
            b4.c(fVar, rVarC4, o0VarE);
            String str110 = xVar.f141006c;
            fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0Var = j92.f.f97931h;
            mh.c(str110, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131070);
            String str111 = xVar.f141008e;
            fVar2.getClass();
            mh.c(str111, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131070);
            o0VarE.g0(true);
            z0VarD = q.d(h4.d.a.f81524b, false);
            iHashCode5 = Long.hashCode(o0VarE.getU());
            i2VarA4 = o0VarE.a0();
            rVarC5 = h4.k.c(aVar, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, z0VarD, o0VarE);
            b4.c(c1623g, i2VarA4, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode5, o0VarE, iHashCode5, bVar);
            } else {
                v.h.A(iHashCode5, o0VarE, iHashCode5, bVar);
            }
            b4.c(fVar, rVarC5, o0VarE);
            c2.u uVar4 = c2.u.f22885a;
            y3Var = p7.f89282d;
            g6.f.f75994b.getClass();
            f14 = g6.f.f75996d;
            p1 p1Var10 = p1Var5;
            v.a(y3Var.c(g6.f.a(f14)), z3.f.c(-536898676, new l1(p1Var10, 19, (byte) 0), o0VarE), o0VarE, 56);
            i30 = i29 & 14;
            int i511 = i29 >> 3;
            b(xVar, z18, p1Var10, p1Var4, lVar, lVar3, p1Var2, lVar4, lVar12, lVar13, lVar7, o0VarE, 1576320 | i30 | (i511 & 112) | (i511 & 57344) | ((i29 >> 6) & 458752) | (i511 & 29360128) | (i511 & 234881024) | ((i28 << 27) & 1879048192), (i28 >> 3) & 14);
            o0Var2 = o0VarE;
            o0Var2.g0(true);
            o0Var2.g0(true);
            bVar2.getClass();
            zVarA4 = c2.y.a(c2.j.i(eVar2.f97918c), aVar3, o0Var2, 0);
            iHashCode6 = Long.hashCode(o0Var2.getU());
            i2VarA5 = o0Var2.a0();
            rVarC6 = h4.k.c(rVarA, o0Var2);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0Var2.z();
            if (o0Var2.T) {
                o0Var2.M(aVar4);
            } else {
                o0Var2.c();
            }
            b4.c(eVar, zVarA4, o0Var2);
            b4.c(c1623g, i2VarA5, o0Var2);
            if (o0Var2.T) {
                v.h.A(iHashCode6, o0Var2, iHashCode6, bVar);
            } else {
                v.h.A(iHashCode6, o0Var2, iHashCode6, bVar);
            }
            b4.c(fVar, rVarC6, o0Var2);
            Context context4 = (Context) o0Var2.A(AndroidCompositionLocals_androidKt.f6042b);
            i34 = xVar.f141009f;
            x1 x1Var19 = p3.n.f135158a;
            o0Var2.C(-1685008668);
            bVar3 = new s5.c.b(0, 1, null);
            while (i35 < i34) {
                bVar3.b("★");
            }
            d92.b.f58623a.getClass();
            int iJ4 = bVar3.j(new i0(d92.b.a(o0Var2).k().d(), 0L, (f0) null, (w5.b0) null, (c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (p005kotlin.jvm.internal.j) null));
            i36 = 5 - i34;
            while (i37 < i36) {
                bVar3.b("★");
            }
            Unit unit4 = Unit.INSTANCE;
            bVar3.f(iJ4);
            s5.c cVarK4 = bVar3.k();
            o0Var2.f();
            x1 x1Var110 = p3.n.f135158a;
            h4.r rVarF116 = x2.f(aVar, 1.0f);
            bVar2.getClass();
            h4.r rVarA111 = c2.l.A(rVarF116, 0.0f, eVar2.f97920e, 1);
            if (i30 != 4) {
                z24 = true;
            } else {
                z24 = true;
            }
            zR = z24 | o0Var2.r(context4);
            objQ5 = o0Var2.q();
            if (zR) {
                obj2 = obj;
                if (objQ5 == obj2) {
                }
                h4.r rVarC110 = p5.v.c((e23.l) objQ5, rVarA111, false);
                fVar2.getClass();
                mh.d(cVarK4, rVarC110, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, d92.c.b(j92.f.f97936m, o0Var2), o0Var2, 0, 0, 262140);
                if (d53.w.J(str6)) {
                    o0Var2.C(283824014);
                    str4 = (String) p1Var4.getF182175a();
                    if (str4 == null) {
                        z36 = false;
                    } else {
                        z36 = false;
                    }
                    if (z36) {
                        str5 = (String) p1Var4.getF182175a();
                        if (str5 == null) {
                            str5 = "";
                        }
                    } else {
                        str5 = str6;
                    }
                    h4.r rVarF117 = x2.f(aVar, 1.0f);
                    bVar2.getClass();
                    h4.r rVarC111 = c2.l.C(rVarF117, 0.0f, 0.0f, 0.0f, eVar2.f97920e, 7);
                    fVar2.getClass();
                    x0 x0VarB7 = d92.c.b(x0Var, o0Var2);
                    fVar2.getClass();
                    g02.q.b(str5, rVarC111, 0, x0VarB7, p1Var3, null, null, x0.a(x0Var, hb.a.s(o0Var2), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0Var2, 24576, 100);
                    p1Var6 = p1Var3;
                    i38 = 0;
                    o0Var2.g0(false);
                } else {
                    p1Var6 = p1Var3;
                    i38 = 0;
                    o0Var2.C(284519778);
                    o0Var2.g0(false);
                }
                if (cVar4.size() == 1) {
                    o0Var2.C(284579236);
                    kt1.b bVar10 = cVar4.get(i38);
                    i39 = i29;
                    if ((i39 & 7168) == 2048) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    if (i30 != 4) {
                        z34 = true;
                    } else {
                        z34 = true;
                    }
                    z35 = z29 | z34;
                    objQ10 = o0Var2.q();
                    if (z35) {
                        qVar3 = qVar;
                        objQ10 = new i91.c(27, qVar3, xVar);
                        o0Var2.K(objQ10);
                    } else {
                        qVar3 = qVar;
                        objQ10 = new i91.c(27, qVar3, xVar);
                        o0Var2.K(objQ10);
                    }
                    c(bVar10, null, (e23.a) objQ10, o0Var2, 0);
                    o0Var2.g0(false);
                    r14 = 0;
                    qVar2 = qVar3;
                } else {
                    qVar2 = qVar;
                    i39 = i29;
                    if (cVar4.isEmpty()) {
                        o0Var2.C(284944044);
                        bVar2.getClass();
                        c2.j.i iVarI7 = c2.j.i(eVar2.f97918c);
                        h4.r rVarF118 = x2.f(aVar, 1.0f);
                        bVar2.getClass();
                        h4.r rVarA112 = c2.l.A(rVarF118, 0.0f, eVar2.f97918c, 1);
                        if (i30 != 4) {
                            z25 = true;
                        } else {
                            z25 = true;
                        }
                        if ((i39 & 7168) == 2048) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        z27 = z25 | z26;
                        objQ6 = o0Var2.q();
                        if (z27) {
                            objQ6 = new d(2, xVar, qVar2);
                            o0Var2.K(objQ6);
                        } else {
                            objQ6 = new d(2, xVar, qVar2);
                            o0Var2.K(objQ6);
                        }
                        e2.c.c(rVarA112, null, null, iVarI7, null, null, false, null, (e23.l) objQ6, o0Var2, 0, 494);
                        r14 = 0;
                        o0Var2.g0(false);
                    } else {
                        r14 = 0;
                        o0Var2.C(285751842);
                        o0Var2.g0(false);
                    }
                }
                if (cVar3.isEmpty()) {
                    o0Var2.C(285812075);
                    a(cVar3, o0Var2, r14);
                    o0Var2.g0(r14);
                } else {
                    o0Var2.C(285895682);
                    o0Var2.f();
                }
                if (cVar2.isEmpty()) {
                    o0Var2.C(285949870);
                    d(cVar2, o0Var2, r14);
                    o0Var2.f();
                } else {
                    o0Var2.C(286030594);
                    o0Var2.f();
                }
                if (z37) {
                    o0Var2.C(286115069);
                    strP = y.P(R.string.trail_review_helpful_count, new Object[]{String.valueOf(i54)}, o0Var2);
                    o0Var2.f();
                } else {
                    o0Var2.C(286253081);
                    strP = y.P(R.string.trail_review_not_helpful_count, new Object[]{String.valueOf(i54)}, o0Var2);
                    o0Var2.f();
                }
                zB = o0Var2.B(strP);
                objQ7 = o0Var2.q();
                if (zB) {
                    objQ7 = new jl0.e(strP, 3);
                    o0Var2.K(objQ7);
                } else {
                    objQ7 = new jl0.e(strP, 3);
                    o0Var2.K(objQ7);
                }
                h4.r rVarA113 = v2.a(c2.l.A(p5.v.c((e23.l) objQ7, aVar, true), 0.0f, d92.b.b().b().getF97918c(), 1), xVar.f141019p, new jl1.a(8), o0Var2, 0);
                s2VarA2 = q2.a(c2.j.i(d92.b.b().b().getF97918c()), h4.d.a.a(), o0Var2, 48);
                iHashCode7 = Long.hashCode(p0.i(o0Var2));
                i2VarX = o0Var2.x();
                rVarC7 = h4.k.c(rVarA113, o0Var2);
                aVarA = h5.g.a.a();
                if (o0Var2.F() != null) {
                    p0.l();
                    throw null;
                }
                o0Var2.z();
                if (o0Var2.getT()) {
                    o0Var2.M(aVarA);
                } else {
                    o0Var2.c();
                }
                b4.c(h5.g.a.c(), s2VarA2, o0Var2);
                b4.c(h5.g.a.e(), i2VarX, o0Var2);
                bVarB = h5.g.a.b();
                if (o0Var2.getT()) {
                    v.h.A(iHashCode7, o0Var2, iHashCode7, bVarB);
                } else {
                    v.h.A(iHashCode7, o0Var2, iHashCode7, bVarB);
                }
                b4.c(h5.g.a.d(), rVarC7, o0Var2);
                pVar2 = pVar;
                v.a(y3Var.c(g6.f.a(f14)), z3.f.c(-1920705380, new i20.b(21, xVar, pVar2), o0Var2), o0Var2, 56);
                objQ8 = o0Var2.q();
                if (objQ8 == p3.m.a.a()) {
                    objQ8 = new jn2.b(25);
                    o0Var2.K(objQ8);
                }
                h4.r rVarB7 = p5.v.b(aVar, (e23.l) objQ8);
                if (z37) {
                    o0Var2.C(1288831543);
                    strP2 = y.P(R.string.value_in_parenthesis, new Object[]{String.valueOf(i54)}, o0Var2);
                    o0Var2.f();
                } else {
                    o0Var2.C(1288979537);
                    strP2 = y.P(R.string.trail_review_helpful_count, new Object[]{String.valueOf(i54)}, o0Var2);
                    o0Var2.f();
                }
                String str112 = strP2;
                d92.b.c().getClass();
                mh.c(str112, rVarB7, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97937n, o0Var2), o0Var2, 0, 0, 131068);
                o0Var2.y();
                o0Var2.y();
                o0Var2.y();
                o0Var2.y();
                if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                    o0Var2.C(1658659424);
                    jg.b.c(p1Var2, xVar.f141004a, str, lVar2, o0Var2, ((i39 << 3) & 896) | 6 | ((i39 >> 9) & 7168));
                    o0Var2.f();
                } else {
                    o0Var2.C(1658874688);
                    o0Var2.f();
                }
                if (i30 != 4) {
                    z28 = true;
                } else {
                    z28 = true;
                }
                objQ9 = o0Var2.q();
                if (z28) {
                    objQ9 = new a(p1Var4, xVar, p1Var6, null);
                    o0Var2.K(objQ9);
                } else {
                    objQ9 = new a(p1Var4, xVar, p1Var6, null);
                    o0Var2.K(objQ9);
                }
                l0.e((p) objQ9, str7, o0Var2);
                x1 x1Var111 = p3.n.f135158a;
                lVar8 = lVar12;
                lVar9 = lVar13;
                z16 = z18;
                o0Var = o0Var2;
            } else {
                obj2 = obj;
            }
            objQ5 = new d(1, xVar, context4);
            o0Var2.K(objQ5);
            h4.r rVarC112 = p5.v.c((e23.l) objQ5, rVarA111, false);
            fVar2.getClass();
            mh.d(cVarK4, rVarC112, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, d92.c.b(j92.f.f97936m, o0Var2), o0Var2, 0, 0, 262140);
            if (d53.w.J(str6)) {
                o0Var2.C(283824014);
                str4 = (String) p1Var4.getF182175a();
                if (str4 == null) {
                    z36 = false;
                } else {
                    z36 = false;
                }
                if (z36) {
                    str5 = (String) p1Var4.getF182175a();
                    if (str5 == null) {
                        str5 = "";
                    }
                } else {
                    str5 = str6;
                }
                h4.r rVarF119 = x2.f(aVar, 1.0f);
                bVar2.getClass();
                h4.r rVarC113 = c2.l.C(rVarF119, 0.0f, 0.0f, 0.0f, eVar2.f97920e, 7);
                fVar2.getClass();
                x0 x0VarB8 = d92.c.b(x0Var, o0Var2);
                fVar2.getClass();
                g02.q.b(str5, rVarC113, 0, x0VarB8, p1Var3, null, null, x0.a(x0Var, hb.a.s(o0Var2), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0Var2, 24576, 100);
                p1Var6 = p1Var3;
                i38 = 0;
                o0Var2.g0(false);
            } else {
                p1Var6 = p1Var3;
                i38 = 0;
                o0Var2.C(284519778);
                o0Var2.g0(false);
            }
            if (cVar4.size() == 1) {
                o0Var2.C(284579236);
                kt1.b bVar11 = cVar4.get(i38);
                i39 = i29;
                if ((i39 & 7168) == 2048) {
                    z29 = true;
                } else {
                    z29 = false;
                }
                if (i30 != 4) {
                    z34 = true;
                } else {
                    z34 = true;
                }
                z35 = z29 | z34;
                objQ10 = o0Var2.q();
                if (z35) {
                    qVar3 = qVar;
                    objQ10 = new i91.c(27, qVar3, xVar);
                    o0Var2.K(objQ10);
                } else {
                    qVar3 = qVar;
                    objQ10 = new i91.c(27, qVar3, xVar);
                    o0Var2.K(objQ10);
                }
                c(bVar11, null, (e23.a) objQ10, o0Var2, 0);
                o0Var2.g0(false);
                r14 = 0;
                qVar2 = qVar3;
            } else {
                qVar2 = qVar;
                i39 = i29;
                if (cVar4.isEmpty()) {
                    o0Var2.C(284944044);
                    bVar2.getClass();
                    c2.j.i iVarI8 = c2.j.i(eVar2.f97918c);
                    h4.r rVarF1110 = x2.f(aVar, 1.0f);
                    bVar2.getClass();
                    h4.r rVarA114 = c2.l.A(rVarF1110, 0.0f, eVar2.f97918c, 1);
                    if (i30 != 4) {
                        z25 = true;
                    } else {
                        z25 = true;
                    }
                    if ((i39 & 7168) == 2048) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = z25 | z26;
                    objQ6 = o0Var2.q();
                    if (z27) {
                        objQ6 = new d(2, xVar, qVar2);
                        o0Var2.K(objQ6);
                    } else {
                        objQ6 = new d(2, xVar, qVar2);
                        o0Var2.K(objQ6);
                    }
                    e2.c.c(rVarA114, null, null, iVarI8, null, null, false, null, (e23.l) objQ6, o0Var2, 0, 494);
                    r14 = 0;
                    o0Var2.g0(false);
                } else {
                    r14 = 0;
                    o0Var2.C(285751842);
                    o0Var2.g0(false);
                }
            }
            if (cVar3.isEmpty()) {
                o0Var2.C(285812075);
                a(cVar3, o0Var2, r14);
                o0Var2.g0(r14);
            } else {
                o0Var2.C(285895682);
                o0Var2.f();
            }
            if (cVar2.isEmpty()) {
                o0Var2.C(285949870);
                d(cVar2, o0Var2, r14);
                o0Var2.f();
            } else {
                o0Var2.C(286030594);
                o0Var2.f();
            }
            if (z37) {
                o0Var2.C(286115069);
                strP = y.P(R.string.trail_review_helpful_count, new Object[]{String.valueOf(i54)}, o0Var2);
                o0Var2.f();
            } else {
                o0Var2.C(286253081);
                strP = y.P(R.string.trail_review_not_helpful_count, new Object[]{String.valueOf(i54)}, o0Var2);
                o0Var2.f();
            }
            zB = o0Var2.B(strP);
            objQ7 = o0Var2.q();
            if (zB) {
                objQ7 = new jl0.e(strP, 3);
                o0Var2.K(objQ7);
            } else {
                objQ7 = new jl0.e(strP, 3);
                o0Var2.K(objQ7);
            }
            h4.r rVarA115 = v2.a(c2.l.A(p5.v.c((e23.l) objQ7, aVar, true), 0.0f, d92.b.b().b().getF97918c(), 1), xVar.f141019p, new jl1.a(8), o0Var2, 0);
            s2VarA2 = q2.a(c2.j.i(d92.b.b().b().getF97918c()), h4.d.a.a(), o0Var2, 48);
            iHashCode7 = Long.hashCode(p0.i(o0Var2));
            i2VarX = o0Var2.x();
            rVarC7 = h4.k.c(rVarA115, o0Var2);
            aVarA = h5.g.a.a();
            if (o0Var2.F() != null) {
                p0.l();
                throw null;
            }
            o0Var2.z();
            if (o0Var2.getT()) {
                o0Var2.M(aVarA);
            } else {
                o0Var2.c();
            }
            b4.c(h5.g.a.c(), s2VarA2, o0Var2);
            b4.c(h5.g.a.e(), i2VarX, o0Var2);
            bVarB = h5.g.a.b();
            if (o0Var2.getT()) {
                v.h.A(iHashCode7, o0Var2, iHashCode7, bVarB);
            } else {
                v.h.A(iHashCode7, o0Var2, iHashCode7, bVarB);
            }
            b4.c(h5.g.a.d(), rVarC7, o0Var2);
            pVar2 = pVar;
            v.a(y3Var.c(g6.f.a(f14)), z3.f.c(-1920705380, new i20.b(21, xVar, pVar2), o0Var2), o0Var2, 56);
            objQ8 = o0Var2.q();
            if (objQ8 == p3.m.a.a()) {
                objQ8 = new jn2.b(25);
                o0Var2.K(objQ8);
            }
            h4.r rVarB8 = p5.v.b(aVar, (e23.l) objQ8);
            if (z37) {
                o0Var2.C(1288831543);
                strP2 = y.P(R.string.value_in_parenthesis, new Object[]{String.valueOf(i54)}, o0Var2);
                o0Var2.f();
            } else {
                o0Var2.C(1288979537);
                strP2 = y.P(R.string.trail_review_helpful_count, new Object[]{String.valueOf(i54)}, o0Var2);
                o0Var2.f();
            }
            String str113 = strP2;
            d92.b.c().getClass();
            mh.c(str113, rVarB8, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97937n, o0Var2), o0Var2, 0, 0, 131068);
            o0Var2.y();
            o0Var2.y();
            o0Var2.y();
            o0Var2.y();
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                o0Var2.C(1658659424);
                jg.b.c(p1Var2, xVar.f141004a, str, lVar2, o0Var2, ((i39 << 3) & 896) | 6 | ((i39 >> 9) & 7168));
                o0Var2.f();
            } else {
                o0Var2.C(1658874688);
                o0Var2.f();
            }
            if (i30 != 4) {
                z28 = true;
            } else {
                z28 = true;
            }
            objQ9 = o0Var2.q();
            if (z28) {
                objQ9 = new a(p1Var4, xVar, p1Var6, null);
                o0Var2.K(objQ9);
            } else {
                objQ9 = new a(p1Var4, xVar, p1Var6, null);
                o0Var2.K(objQ9);
            }
            l0.e((p) objQ9, str7, o0Var2);
            x1 x1Var112 = p3.n.f135158a;
            lVar8 = lVar12;
            lVar9 = lVar13;
            z16 = z18;
            o0Var = o0Var2;
        } else {
            pVar2 = pVar;
            o0 o0Var4 = o0VarE;
            qVar2 = qVar;
            o0Var4.e();
            z16 = z14;
            lVar8 = lVar5;
            lVar9 = lVar6;
            o0Var = o0Var4;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f(new cw1.l0(xVar, str, z16, qVar2, pVar2, lVar, lVar2, lVar3, lVar4, lVar8, lVar9, lVar7, i14, i15, i16));
        }
    }
}
