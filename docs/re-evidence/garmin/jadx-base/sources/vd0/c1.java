package vd0;

import android.graphics.Bitmap;
import android.net.Uri;
import c2.n3;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.UCropView;
import i3.i7;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;

/* JADX INFO: loaded from: classes8.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f177181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f177182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f177183c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dogs.presentation.DogProfilePicturePageContentKt$DogProfilePicturePageContent$1$1$1$1", f = "DogProfilePicturePageContent.kt", l = {94}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f177184a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x0 f177185b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Uri f177186c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.l<Uri, Unit> f177187d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f177188e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(x0 x0Var, Uri uri, e23.l<? super Uri, Unit> lVar, e23.a<Unit> aVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f177185b = x0Var;
            this.f177186c = uri;
            this.f177187d = lVar;
            this.f177188e = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f177185b, this.f177186c, this.f177187d, this.f177188e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            GestureCropImageView cropImageView;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f177184a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f177184a = 1;
                UCropView uCropView = this.f177185b.f177429a;
                if (uCropView == null || (cropImageView = uCropView.getCropImageView()) == null) {
                    obj = null;
                } else {
                    o53.k kVar = new o53.k(u13.f.b(this), 1);
                    kVar.q();
                    cropImageView.cropAndSaveImage(Bitmap.CompressFormat.PNG, 100, new w0(kVar));
                    obj = kVar.p();
                }
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            Uri uri = (Uri) obj;
            if (uri == null) {
                uri = this.f177186c;
            }
            this.f177187d.invoke(uri);
            this.f177188e.invoke();
            return Unit.INSTANCE;
        }
    }

    static {
        g6.f.a aVar = g6.f.f75994b;
        f177181a = 180;
        f177182b = 120;
        f177183c = 90;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00af  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:74:0x010d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0128  */
    /* JADX WARN: Code duplicated, block: B:80:0x017b  */
    /* JADX WARN: Code duplicated, block: B:83:0x0185  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    public static final void a(Uri uri, String str, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.l<? super Uri, Unit> lVar, boolean z14, p3.m mVar, int i14, int i15) {
        Uri uri2;
        int i16;
        String str2;
        e23.a<Unit> aVar3;
        e23.a<Unit> aVar4;
        e23.l<? super Uri, Unit> lVar2;
        boolean z15;
        boolean z16;
        boolean z17;
        p2 p2VarI0;
        boolean z18;
        Object objQ;
        p3.m.a.C2565a c2565a;
        p3.p1 p1Var;
        Object objQ2;
        Object objQ3;
        boolean zB;
        Object objQ4;
        boolean zB2;
        Object objQ5;
        aVar.getClass();
        aVar2.getClass();
        lVar.getClass();
        p3.o0 o0VarE = mVar.E(762119289);
        if ((i14 & 6) == 0) {
            uri2 = uri;
            i16 = (o0VarE.r(uri2) ? 4 : 2) | i14;
        } else {
            uri2 = uri;
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            str2 = str;
            i16 |= o0VarE.B(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i14 & 384) == 0) {
            aVar3 = aVar;
            i16 |= o0VarE.r(aVar3) ? 256 : 128;
        } else {
            aVar3 = aVar;
        }
        if ((i14 & 3072) == 0) {
            aVar4 = aVar2;
            i16 |= o0VarE.r(aVar4) ? 2048 : 1024;
        } else {
            aVar4 = aVar2;
        }
        if ((i14 & 24576) == 0) {
            lVar2 = lVar;
            i16 |= o0VarE.r(lVar2) ? 16384 : 8192;
        } else {
            lVar2 = lVar;
        }
        int i17 = i15 & 32;
        if (i17 == 0) {
            if ((196608 & i14) == 0) {
                z15 = z14;
                i16 |= o0VarE.h(z15) ? 131072 : 65536;
            }
            if ((74899 & i16) != 74898) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i16 & 1, z16)) {
                if (i17 != 0) {
                    z18 = true;
                } else {
                    z18 = z15;
                }
                p3.x1 x1Var = p3.n.f135158a;
                Object[] objArr = new Object[0];
                objQ = o0VarE.q();
                p3.m.a aVar5 = p3.m.f135153a;
                aVar5.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new v10.a(24);
                    o0VarE.K(objQ);
                }
                p1Var = (p3.p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
                objQ2 = o0VarE.q();
                aVar5.getClass();
                if (objQ2 == c2565a) {
                    objQ2 = new x0();
                    o0VarE.K(objQ2);
                }
                x0 x0Var = (x0) objQ2;
                objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = p3.l0.j(t13.h.f161748a, o0VarE);
                    o0VarE.K(objQ3);
                }
                o53.b0 b0Var = (o53.b0) objQ3;
                zB = o0VarE.B(p1Var);
                objQ4 = o0VarE.q();
                if (zB || objQ4 == c2565a) {
                    objQ4 = new d(p1Var, 3);
                    o0VarE.K(objQ4);
                }
                ug2.k kVarE = y22.e.e((e23.l) objQ4, o0VarE);
                zB2 = o0VarE.B(p1Var);
                objQ5 = o0VarE.q();
                if (zB2 || objQ5 == c2565a) {
                    objQ5 = new d(p1Var, 4);
                    o0VarE.K(objQ5);
                }
                e23.a aVarF = y22.e.f((e23.l) objQ5, o0VarE, 1, 6);
                z3.e eVarC = z3.f.c(-327068012, new defpackage.d(aVar3, z18, p1Var, b0Var, x0Var, lVar2, aVar4), o0VarE);
                c2.n0 n0Var = n3.f22788a;
                z02.d.a(false, eVarC, null, null, new c2.n0(0, 0, 0, 0), z3.f.c(-2071889136, new ta0.g0(x0Var, uri2, str2, p1Var, kVarE, aVarF), o0VarE), o0VarE, 196656, 13);
                z17 = z18;
            } else {
                o0VarE.e();
                z17 = z15;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new d62.o(uri, str, aVar, aVar2, lVar, z17, i14, i15);
            }
        }
        i16 |= 196608;
        z15 = z14;
        if ((74899 & i16) != 74898) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i16 & 1, z16)) {
            if (i17 != 0) {
                z18 = true;
            } else {
                z18 = z15;
            }
            p3.x1 x1Var2 = p3.n.f135158a;
            Object[] objArr2 = new Object[0];
            objQ = o0VarE.q();
            p3.m.a aVar6 = p3.m.f135153a;
            aVar6.getClass();
            c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new v10.a(24);
                o0VarE.K(objQ);
            }
            p1Var = (p3.p1) d4.a.e(objArr2, (e23.a) objQ, o0VarE, 48);
            objQ2 = o0VarE.q();
            aVar6.getClass();
            if (objQ2 == c2565a) {
                objQ2 = new x0();
                o0VarE.K(objQ2);
            }
            x0 x0Var2 = (x0) objQ2;
            objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ3);
            }
            o53.b0 b0Var2 = (o53.b0) objQ3;
            zB = o0VarE.B(p1Var);
            objQ4 = o0VarE.q();
            if (zB) {
                objQ4 = new d(p1Var, 3);
                o0VarE.K(objQ4);
            } else {
                objQ4 = new d(p1Var, 3);
                o0VarE.K(objQ4);
            }
            ug2.k kVarE2 = y22.e.e((e23.l) objQ4, o0VarE);
            zB2 = o0VarE.B(p1Var);
            objQ5 = o0VarE.q();
            if (zB2) {
                objQ5 = new d(p1Var, 4);
                o0VarE.K(objQ5);
            } else {
                objQ5 = new d(p1Var, 4);
                o0VarE.K(objQ5);
            }
            e23.a aVarF2 = y22.e.f((e23.l) objQ5, o0VarE, 1, 6);
            z3.e eVarC2 = z3.f.c(-327068012, new defpackage.d(aVar3, z18, p1Var, b0Var2, x0Var2, lVar2, aVar4), o0VarE);
            c2.n0 n0Var2 = n3.f22788a;
            z02.d.a(false, eVarC2, null, null, new c2.n0(0, 0, 0, 0), z3.f.c(-2071889136, new ta0.g0(x0Var2, uri2, str2, p1Var, kVarE2, aVarF2), o0VarE), o0VarE, 196656, 13);
            z17 = z18;
        } else {
            o0VarE.e();
            z17 = z15;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d62.o(uri, str, aVar, aVar2, lVar, z17, i14, i15);
        }
    }

    public static final void b(int i14, h4.r rVar, String str, p3.m mVar) {
        String str2 = str;
        p3.o0 o0VarE = mVar.E(-1773940176);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(str2) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            k2.h hVar = k2.i.f102406a;
            h4.r rVarE = u1.n.e(l4.k.b(rVar, hVar), vb.h.f(d92.b.f58623a, o0VarE), o4.m1.f128891a);
            h4.d.f81522a.getClass();
            h4.g gVar = h4.d.a.f81528f;
            f5.z0 z0VarD = c2.q.d(gVar, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            h4.r.a aVar2 = h4.r.S;
            g6.f.a aVar3 = g6.f.f75994b;
            h4.r rVarB = l4.k.b(x2.q(aVar2, 105), hVar);
            o4.d0.f128823b.getClass();
            u1.u uVarA = u1.n.a(2, o4.d0.f128826e);
            h4.r rVarC2 = u1.q.c(uVarA.f167683a, rVarB, uVarA.f167684b, hVar);
            f5.z0 z0VarD2 = c2.q.d(gVar, false);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarC2, o0VarE);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, z0VarD2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC3, o0VarE);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_profile_picture);
            h4.r rVarB2 = l4.k.b(x2.q(aVar2, f177183c), hVar);
            f5.k.f68985a.getClass();
            str2 = str;
            jf.r.a(str2, strQ, rVarB2, null, null, f5.k.a.f68987b, null, o0VarE, (i15 & 14) | 1572864, 1976);
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq.g(str2, rVar, i14, 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:37:0x0106  */
    /* JADX WARN: Code duplicated, block: B:38:0x010a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0125  */
    /* JADX WARN: Code duplicated, block: B:45:0x0158  */
    public static final void c(u4.d dVar, String str, e23.a aVar, h4.r rVar, p3.m mVar, int i14) {
        p3.c<?> cVar;
        h5.g.a.f fVar;
        h4.r.a aVar2;
        f5.z0 z0VarD;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        p3.o0 o0VarE = mVar.E(-2074887423);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(dVar) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            k2.h hVar = k2.i.f102406a;
            h4.r rVarB = l4.k.b(rVar, hVar);
            long jF = vb.h.f(d92.b.f58623a, o0VarE);
            o4.m1.a aVar3 = o4.m1.f128891a;
            h4.r rVarD = u1.w.d(u1.n.e(rVarB, jF, aVar3), false, null, null, aVar, 15);
            h4.d.f81522a.getClass();
            h4.g gVar = h4.d.a.f81528f;
            f5.z0 z0VarD2 = c2.q.d(gVar, false);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, z0VarD2, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                cVar = cVar2;
            } else {
                cVar = cVar2;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                c2.u uVar = c2.u.f22885a;
                aVar2 = h4.r.S;
                h4.r rVarE = u1.n.e(l4.k.b(x2.q(aVar2, f177183c), hVar), d92.b.a(o0VarE).c().f(), aVar3);
                z0VarD = c2.q.d(gVar, false);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarE, o0VarE);
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar4);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, z0VarD, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(fVar, rVarC, o0VarE);
                long jD = d92.b.a(o0VarE).f().d();
                g6.f.a aVar5 = g6.f.f75994b;
                i7.b(dVar, str, x2.q(aVar2, 48), jD, o0VarE, (i15 & 14) | 384 | (i15 & 112), 0);
                o0VarE.g0(true);
                o0VarE.g0(true);
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            c2.u uVar2 = c2.u.f22885a;
            aVar2 = h4.r.S;
            h4.r rVarE2 = u1.n.e(l4.k.b(x2.q(aVar2, f177183c), hVar), d92.b.a(o0VarE).c().f(), aVar3);
            z0VarD = c2.q.d(gVar, false);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarE2, o0VarE);
            if (cVar != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, z0VarD, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(fVar, rVarC, o0VarE);
            long jD2 = d92.b.a(o0VarE).f().d();
            g6.f.a aVar6 = g6.f.f75994b;
            i7.b(dVar, str, x2.q(aVar2, 48), jD2, o0VarE, (i15 & 14) | 384 | (i15 & 112), 0);
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new sk0.k1((Object) dVar, (Object) str, aVar, (Object) rVar, i14, 24);
        }
    }
}
