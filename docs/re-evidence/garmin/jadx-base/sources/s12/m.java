package s12;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import d62.o;
import e23.p;
import e23.q;
import h5.e0;
import i3.mh;
import i3.ua;
import j23.t;
import java.util.List;
import kotlin.t1;
import li0.n0;
import o13.r;
import o4.d0;
import o4.m1;
import o4.u1;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.u;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;
import p3.y3;
import s5.q0;
import s5.s0;
import s5.t0;
import s5.x0;
import u1.w;
import u1.y0;
import v62.b3;
import v62.b8;
import v62.w0;
import w5.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class m {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.follow.profile.ProfileFollowHeaderKt$ProfileFollowHeader$1$1", f = "ProfileFollowHeader.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ hi0.c.b f155974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f155975b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(hi0.c.b bVar, p1<Boolean> p1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f155974a = bVar;
            this.f155975b = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f155974a, this.f155975b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.f155975b.setValue(Boolean.valueOf(hi0.c.b.CREATED == this.f155974a));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.follow.profile.ProfileFollowHeaderKt$ProfileFollowHeader$2$1", f = "ProfileFollowHeader.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<com.garmin.android.apps.connectmobile.userprofile.i.c, Unit> f155976a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<Boolean> f155977b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(e23.l<? super com.garmin.android.apps.connectmobile.userprofile.i.c, Unit> lVar, x3<Boolean> x3Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f155976a = lVar;
            this.f155977b = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f155976a, this.f155977b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            if (s.g(this.f155977b.getF182175a(), Boolean.TRUE)) {
                this.f155976a.invoke(com.garmin.android.apps.connectmobile.userprofile.i.c.REFRESH);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.follow.profile.ProfileFollowHeaderKt$ProfileFollowHeader$3$1", f = "ProfileFollowHeader.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<com.garmin.android.apps.connectmobile.userprofile.i.c, Unit> f155978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<Boolean> f155979b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(e23.l<? super com.garmin.android.apps.connectmobile.userprofile.i.c, Unit> lVar, x3<Boolean> x3Var, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f155978a = lVar;
            this.f155979b = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f155978a, this.f155979b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            if (s.g(this.f155979b.getF182175a(), Boolean.TRUE)) {
                this.f155978a.invoke(com.garmin.android.apps.connectmobile.userprofile.i.c.REFRESH_HEADER);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.follow.profile.ProfileFollowHeaderKt$ProfileFollowHeader$4$1", f = "ProfileFollowHeader.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<com.garmin.android.apps.connectmobile.userprofile.i.c, Unit> f155980a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<com.garmin.android.apps.connectmobile.userprofile.i.b> f155981b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f155982c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(e23.l<? super com.garmin.android.apps.connectmobile.userprofile.i.c, Unit> lVar, x3<com.garmin.android.apps.connectmobile.userprofile.i.b> x3Var, p1<Boolean> p1Var, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f155980a = lVar;
            this.f155981b = x3Var;
            this.f155982c = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f155980a, this.f155981b, this.f155982c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            x3<com.garmin.android.apps.connectmobile.userprofile.i.b> x3Var = this.f155981b;
            Boolean bool = x3Var.getF182175a().f46773a;
            if (bool != null) {
                this.f155982c.setValue(bool);
            }
            boolean z14 = x3Var.getF182175a().f46774b;
            e23.l<com.garmin.android.apps.connectmobile.userprofile.i.c, Unit> lVar = this.f155980a;
            if (z14) {
                lVar.invoke(com.garmin.android.apps.connectmobile.userprofile.i.c.FOLLOWER_REQUEST_ACCEPT);
            }
            if (x3Var.getF182175a().f46775c) {
                lVar.invoke(com.garmin.android.apps.connectmobile.userprofile.i.c.FOLLOWER_REQUEST_REJECT);
            }
            if (x3Var.getF182175a().f46776d) {
                lVar.invoke(com.garmin.android.apps.connectmobile.userprofile.i.c.FOLLOWER_REQUEST_ERROR);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0085  */
    /* JADX WARN: Code duplicated, block: B:44:0x0087  */
    /* JADX WARN: Code duplicated, block: B:47:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x0092  */
    /* JADX WARN: Code duplicated, block: B:50:0x0095  */
    /* JADX WARN: Code duplicated, block: B:52:0x009f  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:62:0x0101  */
    /* JADX WARN: Code duplicated, block: B:67:0x0122  */
    /* JADX WARN: Code duplicated, block: B:69:0x0144  */
    /* JADX WARN: Code duplicated, block: B:73:0x0179  */
    /* JADX WARN: Code duplicated, block: B:75:0x0180  */
    /* JADX WARN: Code duplicated, block: B:76:0x0184  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:86:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:89:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    public static final void a(h4.r rVar, boolean z14, h4.d.c cVar, c2.j.l lVar, c2.j.e eVar, z3.e eVar2, p3.m mVar, int i14, int i15) {
        int i16;
        boolean z15;
        int i17;
        h4.d.c cVar2;
        int i18;
        int i19;
        int i24;
        c2.j.e eVar3;
        int i25;
        int i26;
        boolean z16;
        boolean z17;
        h4.d.c cVar3;
        c2.j.e eVar4;
        p2 p2VarI0;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        e0.a aVar;
        h5.g.a.b bVar;
        s2 s2VarA;
        int iHashCode2;
        i2 i2VarA1;
        h4.r rVarC2;
        e0.a aVar2;
        h5.g.a.b bVar2;
        o0 o0VarE = mVar.E(-1444605580);
        p3.c<?> cVar4 = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i27 = i15 & 2;
        if (i27 != 0) {
            i17 = i16 | 48;
            z15 = z14;
        } else {
            z15 = z14;
            i17 = i16 | (o0VarE.h(z15) ? 32 : 16);
        }
        int i28 = i15 & 4;
        if (i28 == 0) {
            if ((i14 & 384) == 0) {
                cVar2 = cVar;
                i17 |= o0VarE.B(cVar2) ? 256 : 128;
            }
            if (o0VarE.B(lVar)) {
                i18 = 2048;
            } else {
                i18 = 1024;
            }
            i19 = i17 | i18;
            i24 = i15 & 16;
            if (i24 != 0) {
                i26 = i19 | 24576;
                eVar3 = eVar;
            } else {
                eVar3 = eVar;
                if (o0VarE.B(eVar3)) {
                    i25 = 16384;
                } else {
                    i25 = 8192;
                }
                i26 = i19 | i25;
            }
            if ((74899 & i26) != 74898) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i26 & 1, z16)) {
                if (i27 != 0) {
                    z15 = false;
                }
                if (i28 != 0) {
                    h4.d.f81522a.getClass();
                    cVar2 = h4.d.a.f81533k;
                }
                if (i24 != 0) {
                    c2.j.f22691a.getClass();
                    eVar3 = c2.j.f22692b;
                }
                x1 x1Var = p3.n.f135158a;
                if (((g6.c) o0VarE.A(t1.f91490h)).getF75992b() >= 1.6f && !z15) {
                    o0VarE.C(-671808596);
                    s2VarA = q2.a(eVar3, cVar2, o0VarE, (((i26 & 896) | ((i26 & 14) | ((i26 >> 9) & 112))) >> 3) & 126);
                    iHashCode2 = Long.hashCode(o0VarE.U);
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = h4.k.c(rVar, o0VarE);
                    h5.g.V.getClass();
                    aVar2 = h5.g.a.f81805b;
                    if (cVar4 != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar2);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA1, o0VarE);
                    bVar2 = h5.g.a.f81813j;
                    if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
                    eVar2.invoke(u2.f22900a.a(h4.r.S, 1.0f, true), o0VarE, 48);
                    o0VarE.g0(true);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-671992612);
                    h4.d.f81522a.getClass();
                    zVarA = y.a(lVar, h4.d.a.f81536n, o0VarE, ((((i26 >> 6) & 112) | (i26 & 14)) >> 3) & 14);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVar, o0VarE);
                    h5.g.V.getClass();
                    aVar = h5.g.a.f81805b;
                    if (cVar4 != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                    bVar = h5.g.a.f81813j;
                    if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    c2.b0 b0Var = c2.b0.f22601a;
                    eVar2.invoke(x2.f(h4.r.S, 1.0f), o0VarE, 54);
                    o0VarE.g0(true);
                    o0VarE.g0(false);
                }
            } else {
                o0VarE.e();
            }
            z17 = z15;
            cVar3 = cVar2;
            eVar4 = eVar3;
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new o(rVar, z17, cVar3, lVar, eVar4, eVar2, i14, i15);
            }
        }
        i17 |= 384;
        cVar2 = cVar;
        if (o0VarE.B(lVar)) {
            i18 = 2048;
        } else {
            i18 = 1024;
        }
        i19 = i17 | i18;
        i24 = i15 & 16;
        if (i24 != 0) {
            i26 = i19 | 24576;
            eVar3 = eVar;
        } else {
            eVar3 = eVar;
            if (o0VarE.B(eVar3)) {
                i25 = 16384;
            } else {
                i25 = 8192;
            }
            i26 = i19 | i25;
        }
        if ((74899 & i26) != 74898) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i26 & 1, z16)) {
            if (i27 != 0) {
                z15 = false;
            }
            if (i28 != 0) {
                h4.d.f81522a.getClass();
                cVar2 = h4.d.a.f81533k;
            }
            if (i24 != 0) {
                c2.j.f22691a.getClass();
                eVar3 = c2.j.f22692b;
            }
            x1 x1Var2 = p3.n.f135158a;
            if (((g6.c) o0VarE.A(t1.f91490h)).getF75992b() >= 1.6f) {
                o0VarE.C(-671992612);
                h4.d.f81522a.getClass();
                zVarA = y.a(lVar, h4.d.a.f81536n, o0VarE, ((((i26 >> 6) & 112) | (i26 & 14)) >> 3) & 14);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVar, o0VarE);
                h5.g.V.getClass();
                aVar = h5.g.a.f81805b;
                if (cVar4 != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.b0 b0Var2 = c2.b0.f22601a;
                eVar2.invoke(x2.f(h4.r.S, 1.0f), o0VarE, 54);
                o0VarE.g0(true);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-671808596);
                s2VarA = q2.a(eVar3, cVar2, o0VarE, (((i26 & 896) | ((i26 & 14) | ((i26 >> 9) & 112))) >> 3) & 126);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVar, o0VarE);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                if (cVar4 != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA1, o0VarE);
                bVar2 = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                } else {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
                eVar2.invoke(u2.f22900a.a(h4.r.S, 1.0f, true), o0VarE, 48);
                o0VarE.g0(true);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        z17 = z15;
        cVar3 = cVar2;
        eVar4 = eVar3;
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(rVar, z17, cVar3, lVar, eVar4, eVar2, i14, i15);
        }
    }

    public static final void b(boolean z14, p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(-1447212327);
        int i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            if (z14) {
                o0VarE.C(-1020628460);
                h4.r.a aVar = h4.r.S;
                d92.b.f58623a.getClass();
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar = j92.b.f97899b;
                h4.r rVarC = c2.l.C(aVar, 0.0f, 0.0f, eVar.f97918c, 0.0f, 11);
                bVar.getClass();
                h4.r rVarQ = x2.q(rVarC, j92.b.f97901d.f97903b);
                long jC = d0.c(0.5f, d92.b.a(o0VarE).f().b(), 14);
                d0.f128823b.getClass();
                long j8 = d0.f128831j;
                bVar.getClass();
                float f14 = eVar.f97916a;
                u1.f129010b.getClass();
                o0Var = o0VarE;
                ua.a(f14, 0.0f, u1.f129012d, 3072, 32, jC, j8, rVarQ, o0Var);
                o0Var.g0(false);
            } else {
                o0Var = o0VarE;
                o0Var.C(-1020247935);
                s62.a.f157643a.getClass();
                u4.d dVarA = w0.a(t62.b.f162798a);
                h4.r.a aVar2 = h4.r.S;
                d92.b.f58623a.getClass();
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar2 = j92.b.f97899b;
                h4.r rVarC2 = c2.l.C(aVar2, 0.0f, 0.0f, eVar2.f97918c, 0.0f, 11);
                bVar2.getClass();
                y0.b(dVarA, "", x2.q(rVarC2, eVar2.f97920e), o4.e0.a.a(o4.e0.f128843b, d92.b.a(o0Var).f().c()), o0Var, 48, 56);
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new rw0.g(z14, i14, 2);
        }
    }

    public static final void c(int i14, int i15, h4.r rVar, String str, p3.m mVar) {
        o0 o0VarE = mVar.E(-412909599);
        int i16 = (o0VarE.k(i14) ? 4 : 2) | i15 | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(rVar) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            h4.d.f81522a.getClass();
            h4.g.a aVar = h4.d.a.f81536n;
            c2.j.f22691a.getClass();
            z zVarA = y.a(c2.j.f22694d, aVar, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
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
            c2.b0 b0Var = c2.b0.f22601a;
            String strValueOf = String.valueOf(i14);
            long jD = ds.e0.d(d92.b.f58623a, o0VarE);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0Var = j92.f.f97932i;
            f0.f182097b.getClass();
            mh.c(strValueOf, null, jD, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(x0Var, 0L, 0L, f0.f182104i, null, 0L, null, null, 0, 0L, null, null, 16777211), o0VarE, 0, 0, 131066);
            long jB = d92.b.a(o0VarE).k().b();
            fVar.getClass();
            mh.c(str, null, jB, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(j92.f.f97933j, 0L, 0L, null, null, 0L, null, null, 0, o53.f0.B(18), null, null, 16646143), o0VarE, (i16 >> 3) & 14, 0, 131066);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new aa2.d(i14, str, rVar, i15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"ConfigurationScreenWidthHeight"})
    public static final void d(final com.garmin.android.apps.connectmobile.userprofile.i iVar, final e23.l<? super com.garmin.android.apps.connectmobile.userprofile.i.c, Unit> lVar, p3.m mVar, final int i14) {
        int i15;
        final int i16;
        p2 p2VarI0;
        p<? super p3.m, ? super Integer, Unit> pVar;
        final String str;
        final String str2;
        boolean z14;
        final int i17 = i14;
        iVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-2071313316);
        if ((i17 & 6) == 0) {
            i15 = (o0VarE.r(iVar) ? 4 : 2) | i17;
        } else {
            i15 = i17;
        }
        if ((i17 & 48) == 0) {
            i15 |= o0VarE.r(lVar) ? 32 : 16;
        }
        final int i18 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            final com.garmin.android.apps.connectmobile.userprofile.i.d dVar = (com.garmin.android.apps.connectmobile.userprofile.i.d) o53.f0.G(iVar.f46767t, o0VarE).getF182175a();
            if (dVar == null) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                } else {
                    pVar = new p() { // from class: s12.h
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int i19 = i18;
                            p3.m mVar2 = (p3.m) obj;
                            ((Integer) obj2).intValue();
                            switch (i19) {
                                case 0:
                                    m.d(iVar, lVar, mVar2, p0.t(i17 | 1));
                                    break;
                                case 1:
                                    m.d(iVar, lVar, mVar2, p0.t(i17 | 1));
                                    break;
                                default:
                                    m.d(iVar, lVar, mVar2, p0.t(i17 | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                }
            } else {
                li0.d0 d0Var = dVar.f46789b;
                n0 n0Var = d0Var.f112656i;
                boolean z15 = (n0Var != null ? n0Var.f112816a : null) == hi0.e.b.MUTUAL;
                li0.b0 b0Var = d0Var.f112649b;
                Boolean bool = (Boolean) o53.f0.G(iVar.A, o0VarE).getF182175a();
                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                final com.garmin.android.apps.connectmobile.userprofile.i.e eVar = iVar.F;
                y3 y3Var = t1.f91490h;
                g6.c cVar = (g6.c) o0VarE.A(y3Var);
                d92.b.f58623a.getClass();
                j92.f fVar = d92.b.f58624b;
                fVar.getClass();
                x0 x0Var = j92.f.f97933j;
                float fH0 = cVar.H0(x0Var.f157323b.f157308c);
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar2 = j92.b.f97899b;
                float f14 = eVar2.f97920e;
                float f15 = eVar2.f97922g;
                float f16 = eVar2.f97918c;
                final float f17 = fH0 + f14;
                g6.f.a aVar = g6.f.f75994b;
                if (dVar.f46788a) {
                    o0VarE.C(-699092288);
                    String strQ = gl1.y.Q(o0VarE, R.string.lbl_edit_profile);
                    String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_share_profile);
                    g6.c cVar2 = (g6.c) o0VarE.A(y3Var);
                    s0 s0VarA = t0.a(o0VarE);
                    float f18 = ((Configuration) o0VarE.A(AndroidCompositionLocals_androidKt.f6041a)).screenWidthDp;
                    bVar.getClass();
                    bVar.getClass();
                    bVar.getClass();
                    bVar.getClass();
                    float f19 = ((((f18 - f15) - f16) / 2.0f) - f15) - j92.b.f97901d.f97903b;
                    bVar.getClass();
                    int iF0 = cVar2.f0(((g6.f) t.b(g6.f.a(f19 - f16), g6.f.a(0))).f75997a);
                    if (iF0 <= 0) {
                        str2 = strQ2;
                        str = strQ;
                    } else {
                        fVar.getClass();
                        str = strQ;
                        int i19 = s0.a(s0VarA, strQ, x0Var, g6.b.b(iF0, 0, 13), 988).f157281b.f157257f;
                        q0 q0VarA = s0.a(s0VarA, strQ2, x0Var, g6.b.b(iF0, 0, 13), 988);
                        str2 = strQ2;
                        int i24 = q0VarA.f157281b.f157257f;
                        if (i19 <= 1 && i24 <= 1) {
                            f16 = f16;
                            z14 = false;
                        }
                        h4.r rVarF = x2.f(h4.r.S, 1.0f);
                        c2.j jVar = c2.j.f22691a;
                        bVar.getClass();
                        jVar.getClass();
                        c2.j.i iVarI = c2.j.i(f16);
                        bVar.getClass();
                        a(rVarF, z14, null, iVarI, c2.j.i(f16), z3.f.c(-714554887, new q() { // from class: s12.i
                            /* JADX WARN: Code duplicated, block: B:19:0x0057  */
                            /* JADX WARN: Code duplicated, block: B:24:0x0086  */
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
                            @Override // e23.q
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                h4.r rVar = (h4.r) obj;
                                p3.m mVar2 = (p3.m) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                rVar.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= mVar2.B(rVar) ? 4 : 2;
                                }
                                if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    x1 x1Var2 = p3.n.f135158a;
                                    l72.f0.a aVar2 = l72.f0.a.f111000a;
                                    s62.a.f157643a.getClass();
                                    t62.b bVar2 = t62.b.f162798a;
                                    u4.d dVarA = b3.a(bVar2);
                                    float f22 = f17;
                                    h4.r rVarH = x2.h(rVar, f22);
                                    e23.l lVar2 = lVar;
                                    boolean zB = mVar2.B(lVar2);
                                    Object objQ = mVar2.q();
                                    p3.m.a aVar3 = p3.m.f135153a;
                                    if (zB) {
                                        objQ = new me2.d(lVar2, 22);
                                        mVar2.K(objQ);
                                    } else {
                                        aVar3.getClass();
                                        if (objQ == p3.m.a.f135155b) {
                                            objQ = new me2.d(lVar2, 22);
                                            mVar2.K(objQ);
                                        }
                                    }
                                    aVar2.h(3072, 0, (e23.a) objQ, rVarH, str, mVar2, dVarA, true);
                                    u4.d dVarA2 = b8.a(bVar2);
                                    h4.r rVarH2 = x2.h(rVar, f22);
                                    boolean zB2 = mVar2.B(lVar2);
                                    Object objQ2 = mVar2.q();
                                    if (zB2) {
                                        objQ2 = new me2.d(lVar2, 23);
                                        mVar2.K(objQ2);
                                    } else {
                                        aVar3.getClass();
                                        if (objQ2 == p3.m.a.f135155b) {
                                            objQ2 = new me2.d(lVar2, 23);
                                            mVar2.K(objQ2);
                                        }
                                    }
                                    aVar2.h(3072, 0, (e23.a) objQ2, rVarH2, str2, mVar2, dVarA2, true);
                                } else {
                                    mVar2.e();
                                }
                                return Unit.INSTANCE;
                            }
                        }, o0VarE), o0VarE, 196614, 4);
                        o0VarE.g0(false);
                        i16 = 2;
                    }
                    z14 = true;
                    h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                    c2.j jVar2 = c2.j.f22691a;
                    bVar.getClass();
                    jVar2.getClass();
                    c2.j.i iVarI2 = c2.j.i(f16);
                    bVar.getClass();
                    a(rVarF2, z14, null, iVarI2, c2.j.i(f16), z3.f.c(-714554887, new q() { // from class: s12.i
                        /* JADX WARN: Code duplicated, block: B:19:0x0057  */
                        /* JADX WARN: Code duplicated, block: B:24:0x0086  */
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
                        @Override // e23.q
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            h4.r rVar = (h4.r) obj;
                            p3.m mVar2 = (p3.m) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            rVar.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= mVar2.B(rVar) ? 4 : 2;
                            }
                            if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                                x1 x1Var2 = p3.n.f135158a;
                                l72.f0.a aVar2 = l72.f0.a.f111000a;
                                s62.a.f157643a.getClass();
                                t62.b bVar2 = t62.b.f162798a;
                                u4.d dVarA = b3.a(bVar2);
                                float f22 = f17;
                                h4.r rVarH = x2.h(rVar, f22);
                                e23.l lVar2 = lVar;
                                boolean zB = mVar2.B(lVar2);
                                Object objQ = mVar2.q();
                                p3.m.a aVar3 = p3.m.f135153a;
                                if (zB) {
                                    objQ = new me2.d(lVar2, 22);
                                    mVar2.K(objQ);
                                } else {
                                    aVar3.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = new me2.d(lVar2, 22);
                                        mVar2.K(objQ);
                                    }
                                }
                                aVar2.h(3072, 0, (e23.a) objQ, rVarH, str, mVar2, dVarA, true);
                                u4.d dVarA2 = b8.a(bVar2);
                                h4.r rVarH2 = x2.h(rVar, f22);
                                boolean zB2 = mVar2.B(lVar2);
                                Object objQ2 = mVar2.q();
                                if (zB2) {
                                    objQ2 = new me2.d(lVar2, 23);
                                    mVar2.K(objQ2);
                                } else {
                                    aVar3.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new me2.d(lVar2, 23);
                                        mVar2.K(objQ2);
                                    }
                                }
                                aVar2.h(3072, 0, (e23.a) objQ2, rVarH2, str2, mVar2, dVarA2, true);
                            } else {
                                mVar2.e();
                            }
                            return Unit.INSTANCE;
                        }
                    }, o0VarE), o0VarE, 196614, 4);
                    o0VarE.g0(false);
                    i16 = 2;
                } else if (z15) {
                    o0VarE.C(-696973562);
                    h4.r rVarF3 = x2.f(h4.r.S, 1.0f);
                    c2.j jVar3 = c2.j.f22691a;
                    bVar.getClass();
                    jVar3.getClass();
                    final boolean z16 = zBooleanValue;
                    c2.j.i iVarI3 = c2.j.i(f16);
                    bVar.getClass();
                    c2.j.i iVarI4 = c2.j.i(f16);
                    z3.e eVarC = z3.f.c(-63677072, new q() { // from class: s12.j
                        /* JADX WARN: Code duplicated, block: B:19:0x006a  */
                        @Override // e23.q
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            h4.r rVar = (h4.r) obj;
                            p3.m mVar2 = (p3.m) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            rVar.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= mVar2.B(rVar) ? 4 : 2;
                            }
                            if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                                x1 x1Var2 = p3.n.f135158a;
                                l72.f0.a aVar2 = l72.f0.a.f111000a;
                                float f22 = f17;
                                h4.r rVarH = x2.h(rVar, f22);
                                String strQ3 = gl1.y.Q(mVar2, R.string.challenge_title);
                                boolean z17 = z16;
                                boolean z18 = !z17;
                                z3.e eVarC2 = z3.f.c(283199097, new rw0.g(z17, 1), mVar2);
                                com.garmin.android.apps.connectmobile.userprofile.i iVar2 = iVar;
                                boolean zR = mVar2.r(iVar2);
                                e23.l lVar2 = lVar;
                                boolean zB = zR | mVar2.B(lVar2);
                                Object objQ = mVar2.q();
                                if (zB) {
                                    objQ = new rk0.f(16, iVar2, lVar2);
                                    mVar2.K(objQ);
                                } else {
                                    p3.m.f135153a.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = new rk0.f(16, iVar2, lVar2);
                                        mVar2.K(objQ);
                                    }
                                }
                                aVar2.e(eVarC2, strQ3, rVarH, z18, (e23.a) objQ, mVar2, 6);
                                a.a(dVar.f46789b, eVar, x2.h(rVar, f22), mVar2, li0.d0.f112647j | 384 | (li0.f.f112658h << 3));
                            } else {
                                mVar2.e();
                            }
                            return Unit.INSTANCE;
                        }
                    }, o0VarE);
                    i16 = 2;
                    a(rVarF3, false, null, iVarI3, iVarI4, eVarC, o0VarE, 196614, 6);
                    o0VarE.g0(false);
                } else {
                    i16 = 2;
                    if (h0.R(u.m0(new li0.b0[]{li0.b0.FOLLOW, li0.b0.REQUEST_SENT, li0.b0.FOLLOW_BACK, li0.b0.UNBLOCK, li0.b0.FOLLOWING, li0.b0.MUTED, li0.b0.FAVORITE}), b0Var)) {
                        o0VarE.C(-695659162);
                        h4.r.a aVar2 = h4.r.S;
                        h4.r rVarH = x2.h(x2.f(aVar2, 1.0f), f17);
                        c2.j.f22691a.getClass();
                        c2.j.C0343j c0343j = c2.j.f22692b;
                        h4.d.f81522a.getClass();
                        s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
                        int iHashCode = Long.hashCode(o0VarE.U);
                        i2 i2VarA0 = o0VarE.a0();
                        h4.r rVarC = h4.k.c(rVarH, o0VarE);
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
                        b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
                        b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                        h5.g.a.b bVar2 = h5.g.a.f81813j;
                        if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                            v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                        s12.a.a(d0Var, eVar, u2.f22900a.a(aVar2, 1.0f, true), o0VarE, li0.d0.f112647j | 384 | (li0.f.f112658h << 3));
                        o0VarE.g0(true);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-695363608);
                        o0VarE.g0(false);
                        p2VarI0 = o0VarE.i0();
                        if (p2VarI0 == null) {
                            return;
                        }
                        final int i25 = 1;
                        pVar = new p() { // from class: s12.h
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                int i110 = i25;
                                p3.m mVar2 = (p3.m) obj;
                                ((Integer) obj2).intValue();
                                switch (i110) {
                                    case 0:
                                        m.d(iVar, lVar, mVar2, p0.t(i14 | 1));
                                        break;
                                    case 1:
                                        m.d(iVar, lVar, mVar2, p0.t(i14 | 1));
                                        break;
                                    default:
                                        m.d(iVar, lVar, mVar2, p0.t(i14 | 1));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i17 = i14;
            }
            p2VarI0.f135219d = pVar;
        }
        i16 = 2;
        o0VarE.e();
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            pVar = new p() { // from class: s12.h
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i110 = i16;
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).intValue();
                    switch (i110) {
                        case 0:
                            m.d(iVar, lVar, mVar2, p0.t(i17 | 1));
                            break;
                        case 1:
                            m.d(iVar, lVar, mVar2, p0.t(i17 | 1));
                            break;
                        default:
                            m.d(iVar, lVar, mVar2, p0.t(i17 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @SuppressLint({"ConfigurationScreenWidthHeight"})
    public static final void e(final Context context, final com.garmin.android.apps.connectmobile.userprofile.i iVar, final e23.l<? super com.garmin.android.apps.connectmobile.userprofile.i.c, Unit> lVar, p3.m mVar, final int i14) {
        int i15;
        p2 p2VarI0;
        p<? super p3.m, ? super Integer, Unit> pVar;
        com.garmin.android.apps.connectmobile.userprofile.model.q qVar;
        hi0.e followStatus;
        hi0.c receivedRequest;
        context.getClass();
        iVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-208487480);
        int iA = o0VarE.a();
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(context) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(iVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            g3 g3Var = (g3) o53.f0.G(iVar.f46757i, o0VarE).getF182175a();
            if (g3Var == null || (qVar = (com.garmin.android.apps.connectmobile.userprofile.model.q) g3Var.f35301b) == null) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i17 = 0;
                pVar = new p() { // from class: s12.g
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        int i18 = i17;
                        p3.m mVar2 = (p3.m) obj;
                        ((Integer) obj2).intValue();
                        switch (i18) {
                            case 0:
                                m.e(context, iVar, lVar, mVar2, p0.t(i14 | 1));
                                break;
                            case 1:
                                m.e(context, iVar, lVar, mVar2, p0.t(i14 | 1));
                                break;
                            case 2:
                                m.e(context, iVar, lVar, mVar2, p0.t(i14 | 1));
                                break;
                            default:
                                m.e(context, iVar, lVar, mVar2, p0.t(i14 | 1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                com.garmin.android.apps.connectmobile.userprofile.i.d dVar = (com.garmin.android.apps.connectmobile.userprofile.i.d) o53.f0.G(iVar.f46767t, o0VarE).getF182175a();
                if (dVar == null) {
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 == null) {
                        return;
                    }
                    final int i18 = 1;
                    pVar = new p() { // from class: s12.g
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int i19 = i18;
                            p3.m mVar2 = (p3.m) obj;
                            ((Integer) obj2).intValue();
                            switch (i19) {
                                case 0:
                                    m.e(context, iVar, lVar, mVar2, p0.t(i14 | 1));
                                    break;
                                case 1:
                                    m.e(context, iVar, lVar, mVar2, p0.t(i14 | 1));
                                    break;
                                case 2:
                                    m.e(context, iVar, lVar, mVar2, p0.t(i14 | 1));
                                    break;
                                default:
                                    m.e(context, iVar, lVar, mVar2, p0.t(i14 | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    p1 p1VarG = o53.f0.G(iVar.f46769w, o0VarE);
                    p1 p1VarG2 = o53.f0.G(iVar.f46771y, o0VarE);
                    p1 p1VarC = s9.c.c(iVar.f46765q, o0VarE);
                    hi0.a userFollowProfile = qVar.getUserFollowProfile();
                    hi0.c.b requestStatus = (userFollowProfile == null || (followStatus = userFollowProfile.getFollowStatus()) == null || (receivedRequest = followStatus.getReceivedRequest()) == null) ? null : receivedRequest.getRequestStatus();
                    Object objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = hb.a.n(hi0.c.b.CREATED == requestStatus, o0VarE);
                    }
                    p1 p1Var = (p1) objQ;
                    boolean zK = o0VarE.k(requestStatus == null ? -1 : requestStatus.ordinal());
                    Object objQ2 = o0VarE.q();
                    if (zK || objQ2 == c2565a) {
                        objQ2 = new a(requestStatus, p1Var, null);
                        o0VarE.K(objQ2);
                    }
                    l0.e((p) objQ2, requestStatus, o0VarE);
                    Boolean bool = (Boolean) p1VarG.getF182175a();
                    int i19 = i16 & 896;
                    boolean zB = (i19 == 256) | o0VarE.B(p1VarG);
                    Object objQ3 = o0VarE.q();
                    if (zB || objQ3 == c2565a) {
                        objQ3 = new b(lVar, p1VarG, null);
                        o0VarE.K(objQ3);
                    }
                    l0.e((p) objQ3, bool, o0VarE);
                    Boolean bool2 = (Boolean) p1VarG2.getF182175a();
                    boolean zB2 = o0VarE.B(p1VarG2) | (i19 == 256);
                    Object objQ4 = o0VarE.q();
                    if (zB2 || objQ4 == c2565a) {
                        objQ4 = new c(lVar, p1VarG2, null);
                        o0VarE.K(objQ4);
                    }
                    l0.e((p) objQ4, bool2, o0VarE);
                    com.garmin.android.apps.connectmobile.userprofile.i.b bVar = (com.garmin.android.apps.connectmobile.userprofile.i.b) p1VarC.getF182175a();
                    boolean zB3 = o0VarE.B(p1VarC) | (i19 == 256);
                    Object objQ5 = o0VarE.q();
                    if (zB3 || objQ5 == c2565a) {
                        objQ5 = new d(lVar, p1VarC, p1Var, null);
                        o0VarE.K(objQ5);
                    }
                    l0.e((p) objQ5, bVar, o0VarE);
                    h4.r.a aVar = h4.r.S;
                    h4.r rVarE = u1.n.e(x2.f(aVar, 1.0f), vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a);
                    j92.b bVar2 = d92.b.f58625c;
                    bVar2.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f14 = eVar.f97920e;
                    float f15 = eVar.f97921f;
                    float f16 = eVar.f97920e;
                    org.apache.commons.lang3.e.j(bVar2);
                    h4.r rVarB = c2.l.B(rVarE, f14, f16, f16, f15);
                    c2.j.i iVarG = r1.q2.g(bVar2, c2.j.f22691a, f15);
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(iVarG, h4.d.a.f81536n, o0VarE, 0);
                    int iHashCode = Long.hashCode(o0VarE.U);
                    i2 i2VarA0 = o0VarE.a0();
                    h4.r rVarC = h4.k.c(rVarB, o0VarE);
                    h5.g.V.getClass();
                    e0.a aVar2 = h5.g.a.f81805b;
                    if (o0VarE.f135177b == null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar2);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    c2.b0 b0Var = c2.b0.f22601a;
                    o0VarE.C(-738125756);
                    l72.s.f111232a.a(((Boolean) p1Var.getF182175a()).booleanValue(), z3.f.c(-246995039, new rx1.u(qVar, 2, iVar, context), o0VarE), o0VarE, 48);
                    h4.r rVarF = x2.f(aVar, 1.0f);
                    bVar2.getClass();
                    c2.j.i iVarI = c2.j.i(f16);
                    bVar2.getClass();
                    a(rVarF, false, null, iVarI, c2.j.i(f16), z3.f.c(400365705, new mw0.h(qVar, dVar, iVar, lVar, 16), o0VarE), o0VarE, 196614, 6);
                    d(iVar, lVar, o0VarE, (i16 >> 3) & 126);
                    List<hi0.a> listF = qVar.f();
                    if (listF == null || listF.isEmpty()) {
                        o0VarE.w(iA);
                        p2VarI0 = o0VarE.i0();
                        if (p2VarI0 == null) {
                            return;
                        }
                        final int i24 = 2;
                        pVar = new p() { // from class: s12.g
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                int i110 = i24;
                                p3.m mVar2 = (p3.m) obj;
                                ((Integer) obj2).intValue();
                                switch (i110) {
                                    case 0:
                                        m.e(context, iVar, lVar, mVar2, p0.t(i14 | 1));
                                        break;
                                    case 1:
                                        m.e(context, iVar, lVar, mVar2, p0.t(i14 | 1));
                                        break;
                                    case 2:
                                        m.e(context, iVar, lVar, mVar2, p0.t(i14 | 1));
                                        break;
                                    default:
                                        m.e(context, iVar, lVar, mVar2, p0.t(i14 | 1));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        boolean z14 = i19 == 256;
                        Object objQ6 = o0VarE.q();
                        if (z14 || objQ6 == c2565a) {
                            objQ6 = new me2.d(lVar, 24);
                            o0VarE.K(objQ6);
                        }
                        h4.r rVarD = w.d(aVar, false, null, null, (e23.a) objQ6, 15);
                        h4.g.b bVar4 = h4.d.a.f81534l;
                        bVar2.getClass();
                        a(rVarD, false, bVar4, c2.j.i(eVar.f97919d), null, z3.f.c(959232000, new o62.s0(qVar, 20), o0VarE), o0VarE, 196992, 18);
                        o0VarE.g0(false);
                        o0VarE.g0(true);
                    }
                }
            }
            p2VarI0.f135219d = pVar;
        }
        o0VarE.e();
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            final int i25 = 3;
            pVar = new p() { // from class: s12.g
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i110 = i25;
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).intValue();
                    switch (i110) {
                        case 0:
                            m.e(context, iVar, lVar, mVar2, p0.t(i14 | 1));
                            break;
                        case 1:
                            m.e(context, iVar, lVar, mVar2, p0.t(i14 | 1));
                            break;
                        case 2:
                            m.e(context, iVar, lVar, mVar2, p0.t(i14 | 1));
                            break;
                        default:
                            m.e(context, iVar, lVar, mVar2, p0.t(i14 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }
}
