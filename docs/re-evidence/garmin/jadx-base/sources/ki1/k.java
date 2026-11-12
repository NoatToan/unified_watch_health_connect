package ki1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import c2.y;
import c2.z;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import f5.z0;
import h5.e0;
import i3.s4;
import java.util.Iterator;
import java.util.List;
import kd0.h6;
import l72.c1;
import l72.f0;
import l72.f3;
import l72.p2;
import o4.m1;
import o53.b0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.x;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.y3;
import r1.q2;
import u1.a2;
import w2.a0;

/* JADX INFO: loaded from: classes10.dex */
public final class k {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.findmydevice.presentation.FindMyDeviceScreenKt$Map$3$1", f = "FindMyDeviceScreen.kt", l = {270}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f104846a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ke2.b f104847b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ke2.b f104848c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.library.mapsdkadapter.i.d f104849d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ je2.b<?> f104850e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ke2.b bVar, ke2.b bVar2, com.garmin.android.library.mapsdkadapter.i.d dVar, je2.b<?> bVar3, t13.d<? super a> dVar2) {
            super(2, dVar2);
            this.f104847b = bVar;
            this.f104848c = bVar2;
            this.f104849d = dVar;
            this.f104850e = bVar3;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f104847b, this.f104848c, this.f104849d, this.f104850e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f104846a;
            if (i14 == 0) {
                o13.r.b(obj);
                List listK = x.k(this.f104847b, this.f104848c);
                com.garmin.android.library.mapsdkadapter.e.a aVar2 = new com.garmin.android.library.mapsdkadapter.e.a();
                Iterator it = listK.iterator();
                while (it.hasNext()) {
                    aVar2.b(new com.garmin.android.library.mapsdkadapter.f(ke2.c.c((ke2.b) it.next()), this.f104849d));
                }
                com.garmin.android.library.mapsdkadapter.e eVarA = aVar2.a();
                if (eVarA != null) {
                    LatLng latLng = eVarA.f50274b.f50283a;
                    LatLng latLng2 = eVarA.f50273a.f50283a;
                    je2.b<?> bVar = this.f104850e;
                    if (bVar != null) {
                        List<ke2.b> listK2 = x.k(new ke2.b(latLng2.latitude, latLng2.longitude, null, 4, null), new ke2.b(latLng.latitude, latLng.longitude, null, 4, null), new ke2.b(latLng2.latitude, latLng.longitude, null, 4, null), new ke2.b(latLng.latitude, latLng2.longitude, null, 4, null));
                        this.f104846a = 1;
                        if (bVar.f(listK2, this) == aVar) {
                            return aVar;
                        }
                    }
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:76:0x01e7 A[PHI: r0
      0x01e7: PHI (r0v28 java.lang.String) = (r0v25 java.lang.String), (r0v30 java.lang.String) binds: [B:85:0x020e, B:74:0x01e2] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void a(fi1.a aVar, boolean z14, Long l14, Float f14, z3.e eVar, boolean z15, e23.a aVar2, p3.m mVar, int i14) {
        double dA;
        String str;
        String strC;
        o0 o0VarE = mVar.E(-1491794202);
        int i15 = i14 | (o0VarE.B(aVar) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.B(l14) ? 256 : 128) | (o0VarE.B(f14) ? 2048 : 1024) | (o0VarE.r(eVar) ? 16384 : 8192) | (o0VarE.h(z15) ? 131072 : 65536) | (o0VarE.r(aVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            li1.a aVar3 = new li1.a(a0.s(o0VarE), false, 2, null);
            h4.r.a aVar4 = h4.r.S;
            h4.r rVarB = a2.b(u1.n.e(aVar4, am.j.c(d92.b.f58623a, o0VarE), m1.f128891a), a2.a(o0VarE), true);
            h4.d.f81522a.getClass();
            h4.g.a aVar5 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            z zVarA = y.a(c2.j.f22694d, aVar5, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            e0.a aVar6 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
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
            p2 p2Var = p2.f111205a;
            String str2 = aVar.f71762b;
            String string = "";
            if (str2 == null) {
                str2 = "";
            }
            int i16 = z14 ? R.string.txt_garmin_device_connected : R.string.txt_garmin_device_disconnected;
            l22.b bVar2 = aVar3.f112890a;
            p2Var.h(str2, bVar2.getString(i16), null, null, null, false, false, z3.f.c(-2058338590, new ik1.c(aVar, 28), o0VarE), null, null, null, o0VarE, 12582912, 0, 1916);
            String strQ = gl1.y.Q(o0VarE, R.string.txt_garmin_device_last_connected);
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            context.getClass();
            f3.a(strQ, null, l14 != null ? xy2.b.o(context, new DateTime(l14.longValue())) : "", null, null, o0VarE, 0, 26);
            String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_distance);
            Double dValueOf = f14 != null ? Double.valueOf(f14.floatValue()) : null;
            boolean z16 = aVar3.f112891b;
            if (z16) {
                dA = 1.0d;
            } else {
                m3.a aVar7 = m3.f23147f;
                m3 m3Var = m3.FOOT;
                m3 m3Var2 = m3.METER;
                aVar7.getClass();
                dA = m3.a.a(m3Var, m3Var2);
            }
            if (dValueOf == null || Double.isNaN(dValueOf.doubleValue()) || dValueOf.doubleValue() < 0.0d) {
                string = bVar2.getString(R.string.no_value_card);
            } else {
                double dDoubleValue = dValueOf.doubleValue();
                li1.b bVar3 = aVar3.f112893d;
                if (dDoubleValue < dA) {
                    strC = u00.b.c(bVar3, Double.valueOf(0.0d), 2, 4);
                    if (strC != null) {
                        str = strC;
                    }
                } else {
                    double dDoubleValue2 = dValueOf.doubleValue();
                    m3 m3Var3 = z16 ? m3.KILOMETER : m3.MILE;
                    m3.a aVar8 = m3.f23147f;
                    m3 m3Var4 = m3.METER;
                    aVar8.getClass();
                    strC = dDoubleValue2 < m3.a.a(m3Var3, m3Var4) ? u00.b.c(aVar3.f112892c, dValueOf, 2, 4) : u00.b.c(bVar3, dValueOf, 2, 4);
                    if (strC != null) {
                        str = strC;
                    }
                }
                f3.a(strQ2, null, str, null, null, o0VarE, 0, 26);
                eVar.invoke(o0VarE, Integer.valueOf((i15 >> 12) & 14));
                f0 f0Var = f0.f110999a;
                d92.b.f58625c.getClass();
                f0Var.j(z3.f.c(-1487036528, new j30.d(z15, 6, (byte) 0), o0VarE), gl1.y.Q(o0VarE, R.string.lbl_refresh), c2.l.C(aVar4, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97920e, 7), !z15, aVar2, o0VarE, (57344 & (i15 >> 6)) | 48, 0);
                o0VarE = o0VarE;
                o0VarE.g0(true);
            }
            str = string;
            f3.a(strQ2, null, str, null, null, o0VarE, 0, 26);
            eVar.invoke(o0VarE, Integer.valueOf((i15 >> 12) & 14));
            f0 f0Var2 = f0.f110999a;
            d92.b.f58625c.getClass();
            f0Var2.j(z3.f.c(-1487036528, new j30.d(z15, 6, (byte) 0), o0VarE), gl1.y.Q(o0VarE, R.string.lbl_refresh), c2.l.C(aVar4, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97920e, 7), !z15, aVar2, o0VarE, (57344 & (i15 >> 6)) | 48, 0);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(aVar, z14, l14, f14, eVar, z15, aVar2, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0094  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:55:0x014e  */
    public static final void b(b bVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, p3.m mVar, int i14) {
        boolean z14;
        o0 o0VarE = mVar.E(1951106124);
        int i15 = i14 | (o0VarE.B(bVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128) | (o0VarE.r(aVar3) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            f0 f0Var = f0.f110999a;
            h4.r.a aVar4 = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarF = x2.f(c2.l.y(aVar4, j92.b.f97899b.f97920e), 1.0f);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_find_my_device);
            boolean z15 = (i15 & 112) == 32;
            Object objQ = o0VarE.q();
            p3.m.a aVar5 = p3.m.f135153a;
            if (z15) {
                objQ = new kb0.p(aVar, 3);
                o0VarE.K(objQ);
            } else {
                aVar5.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new kb0.p(aVar, 3);
                    o0VarE.K(objQ);
                }
            }
            f0Var.d(3072, 1, (e23.a) objQ, rVarF, strQ, o0VarE, null, true);
            if (p005kotlin.jvm.internal.s.g(bVar, b.a.f104820a)) {
                o0VarE.C(1610706924);
                c1 c1Var = c1.f110940a;
                String strQ2 = gl1.y.Q(o0VarE, R.string.find_my_watch_device_not_connected_title);
                String strQ3 = gl1.y.Q(o0VarE, R.string.find_my_watch_device_not_connected_msg);
                String strQ4 = gl1.y.Q(o0VarE, R.string.lbl_ok);
                z14 = (i15 & 7168) == 2048;
                Object objQ2 = o0VarE.q();
                if (z14) {
                    objQ2 = new kb0.p(aVar3, 4);
                    o0VarE.K(objQ2);
                } else {
                    aVar5.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new kb0.p(aVar3, 4);
                        o0VarE.K(objQ2);
                    }
                }
                c1Var.a(false, strQ2, strQ3, null, null, strQ4, false, false, (e23.a) objQ2, null, null, o0VarE, 0, 0, 1753);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else if (p005kotlin.jvm.internal.s.g(bVar, b.c.f104822a)) {
                o0VarE.C(1611110916);
                c1 c1Var2 = c1.f110940a;
                String strQ5 = gl1.y.Q(o0VarE, R.string.find_my_watch_found_title);
                String strQ6 = gl1.y.Q(o0VarE, R.string.find_my_watch_found_msg);
                String strQ7 = gl1.y.Q(o0VarE, R.string.lbl_close);
                z14 = (i15 & 896) == 256;
                Object objQ3 = o0VarE.q();
                if (z14) {
                    objQ3 = new kb0.p(aVar2, 5);
                    o0VarE.K(objQ3);
                } else {
                    aVar5.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new kb0.p(aVar2, 5);
                        o0VarE.K(objQ3);
                    }
                }
                c1Var2.a(false, strQ5, strQ6, null, null, strQ7, false, false, (e23.a) objQ3, null, null, o0VarE, 0, 0, 1753);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1887680272);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new jj2.c(bVar, aVar, aVar2, aVar3, i14, 12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:45:0x0104  */
    /* JADX WARN: Code duplicated, block: B:56:0x012c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0156  */
    /* JADX WARN: Code duplicated, block: B:73:0x017c  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(final l lVar, e23.l<? super fi1.b, Unit> lVar2, final e23.a<Unit> aVar, final e23.a<Unit> aVar2, final e23.a<Unit> aVar3, final e23.a<Unit> aVar4, p3.m mVar, int i14) {
        o0 o0Var;
        final int i15;
        lVar.getClass();
        lVar2.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        o0 o0VarE = mVar.E(1849294078);
        int i16 = i14 | (o0VarE.r(lVar) ? 4 : 2) | (o0VarE.r(lVar2) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024) | (o0VarE.r(aVar3) ? 16384 : 8192) | (o0VarE.r(aVar4) ? 131072 : 65536);
        if (o0VarE.n(i16 & 1, (74899 & i16) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(lVar.f104867p, o0VarE);
            p1 p1VarC2 = s9.c.c(lVar.f104866o, o0VarE);
            p1 p1VarC3 = s9.c.c(lVar.f104865n, o0VarE);
            p1 p1VarC4 = s9.c.c(r53.s.d(lVar.f104868q), o0VarE);
            w wVar = (w) p1VarC.getF182175a();
            fi1.d dVar = (fi1.d) p1VarC2.getF182175a();
            fi1.c cVar = (fi1.c) p1VarC3.getF182175a();
            final int i17 = 0;
            z3.e eVarC = z3.f.c(1944983125, new hl1.j(lVar, lVar2, p1VarC, p1VarC4, p1VarC2, p1VarC3, 16), o0VarE);
            boolean zR = o0VarE.r(lVar);
            Object objQ = o0VarE.q();
            p3.m.a aVar5 = p3.m.f135153a;
            if (zR) {
                objQ = new e(lVar, i17);
                o0VarE.K(objQ);
            } else {
                aVar5.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new e(lVar, i17);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar6 = (e23.a) objQ;
            boolean zR2 = o0VarE.r(lVar) | ((i16 & 896) == 256);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                objQ2 = new e23.a() { // from class: ki1.h
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i17) {
                            case 0:
                                lVar.x4();
                                aVar.invoke();
                                break;
                            case 1:
                                lVar.x4();
                                aVar.invoke();
                                break;
                            case 2:
                                lVar.x4();
                                aVar.invoke();
                                break;
                            default:
                                lVar.x4();
                                aVar.invoke();
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ2);
            } else {
                aVar5.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new e23.a() { // from class: ki1.h
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i17) {
                                case 0:
                                    lVar.x4();
                                    aVar.invoke();
                                    break;
                                case 1:
                                    lVar.x4();
                                    aVar.invoke();
                                    break;
                                case 2:
                                    lVar.x4();
                                    aVar.invoke();
                                    break;
                                default:
                                    lVar.x4();
                                    aVar.invoke();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ2);
                }
            }
            e23.a aVar7 = (e23.a) objQ2;
            boolean zR3 = o0VarE.r(lVar) | ((i16 & 7168) == 2048);
            Object objQ3 = o0VarE.q();
            if (zR3) {
                i15 = 1;
                objQ3 = new e23.a() { // from class: ki1.h
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i15) {
                            case 0:
                                lVar.x4();
                                aVar2.invoke();
                                break;
                            case 1:
                                lVar.x4();
                                aVar2.invoke();
                                break;
                            case 2:
                                lVar.x4();
                                aVar2.invoke();
                                break;
                            default:
                                lVar.x4();
                                aVar2.invoke();
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ3);
            } else {
                aVar5.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    i15 = 1;
                    objQ3 = new e23.a() { // from class: ki1.h
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i15) {
                                case 0:
                                    lVar.x4();
                                    aVar2.invoke();
                                    break;
                                case 1:
                                    lVar.x4();
                                    aVar2.invoke();
                                    break;
                                case 2:
                                    lVar.x4();
                                    aVar2.invoke();
                                    break;
                                default:
                                    lVar.x4();
                                    aVar2.invoke();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ3);
                } else {
                    i15 = 1;
                }
            }
            e23.a aVar8 = (e23.a) objQ3;
            int i18 = (o0VarE.r(lVar) ? 1 : 0) | ((57344 & i16) == 16384 ? i15 : 0);
            Object objQ4 = o0VarE.q();
            if (i18 == 0) {
                aVar5.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    final int i19 = 2;
                    objQ4 = new e23.a() { // from class: ki1.h
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i19) {
                                case 0:
                                    lVar.x4();
                                    aVar3.invoke();
                                    break;
                                case 1:
                                    lVar.x4();
                                    aVar3.invoke();
                                    break;
                                case 2:
                                    lVar.x4();
                                    aVar3.invoke();
                                    break;
                                default:
                                    lVar.x4();
                                    aVar3.invoke();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ4);
                }
            } else {
                final int i110 = 2;
                objQ4 = new e23.a() { // from class: ki1.h
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i110) {
                            case 0:
                                lVar.x4();
                                aVar3.invoke();
                                break;
                            case 1:
                                lVar.x4();
                                aVar3.invoke();
                                break;
                            case 2:
                                lVar.x4();
                                aVar3.invoke();
                                break;
                            default:
                                lVar.x4();
                                aVar3.invoke();
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ4);
            }
            e23.a aVar9 = (e23.a) objQ4;
            boolean zR4 = o0VarE.r(lVar);
            if ((458752 & i16) == 131072) {
                i17 = 1;
            }
            int i24 = (zR4 ? 1 : 0) | i17;
            Object objQ5 = o0VarE.q();
            if (i24 == 0) {
                aVar5.getClass();
                if (objQ5 == p3.m.a.f135155b) {
                    final int i25 = 3;
                    objQ5 = new e23.a() { // from class: ki1.h
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i25) {
                                case 0:
                                    lVar.x4();
                                    aVar4.invoke();
                                    break;
                                case 1:
                                    lVar.x4();
                                    aVar4.invoke();
                                    break;
                                case 2:
                                    lVar.x4();
                                    aVar4.invoke();
                                    break;
                                default:
                                    lVar.x4();
                                    aVar4.invoke();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ5);
                }
            } else {
                final int i26 = 3;
                objQ5 = new e23.a() { // from class: ki1.h
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i26) {
                            case 0:
                                lVar.x4();
                                aVar4.invoke();
                                break;
                            case 1:
                                lVar.x4();
                                aVar4.invoke();
                                break;
                            case 2:
                                lVar.x4();
                                aVar4.invoke();
                                break;
                            default:
                                lVar.x4();
                                aVar4.invoke();
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ5);
            }
            o0Var = o0VarE;
            d(wVar, dVar, cVar, eVarC, aVar6, aVar7, aVar8, aVar9, (e23.a) objQ5, aVar4, o0Var, ((i16 << 12) & 1879048192) | 3072);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new hl1.j((Object) lVar, (o13.h) lVar2, (e23.a) aVar, (e23.a) aVar2, (e23.a) aVar3, (e23.a) aVar4, i14, 17);
        }
    }

    /* JADX WARN: Code duplicated, block: B:97:0x0183  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(w wVar, fi1.d dVar, fi1.c cVar, z3.e eVar, e23.a aVar, e23.a aVar2, e23.a aVar3, e23.a aVar4, e23.a aVar5, e23.a aVar6, p3.m mVar, int i14) {
        int i15;
        wVar.getClass();
        dVar.getClass();
        cVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        aVar5.getClass();
        aVar6.getClass();
        o0 o0VarE = mVar.E(-1228905415);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(wVar) : o0VarE.r(wVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(dVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(cVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(eVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(aVar2) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(aVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarE.r(aVar4) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            i15 |= o0VarE.r(aVar5) ? 67108864 : 33554432;
        }
        if ((805306368 & i14) == 0) {
            i15 |= o0VarE.r(aVar6) ? 536870912 : 268435456;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (306783379 & i15) != 306783378)) {
            x1 x1Var = p3.n.f135158a;
            w.a aVar7 = wVar.f104913a;
            z02.d.a(false, z3.f.c(-2010735810, new hl1.i(aVar6, 21), o0VarE), null, null, null, z3.f.c(901902658, new ix.h(cVar, dVar, eVar, aVar7, aVar, 11), o0VarE), o0VarE, 196656, 29);
            boolean z14 = aVar7 instanceof w.a.c;
            p3.m.a aVar8 = p3.m.f135153a;
            if (z14) {
                o0VarE.C(137949063);
                v vVar = ((w.a.c) aVar7).f104917a;
                if (vVar == null) {
                    o0VarE.C(-18546342);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-18546341);
                    if (vVar instanceof v.a) {
                        o0VarE.C(538103155);
                        boolean z15 = (i16 & 458752) == 131072;
                        Object objQ = o0VarE.q();
                        if (z15) {
                            objQ = new i(aVar2, null);
                            o0VarE.K(objQ);
                        } else {
                            aVar8.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new i(aVar2, null);
                                o0VarE.K(objQ);
                            }
                        }
                        l0.e((e23.p) objQ, vVar, o0VarE);
                        o0VarE.g0(false);
                    } else if (vVar.equals(v.c.f104912a)) {
                        o0VarE.C(538286489);
                        h(aVar3, aVar5, o0VarE, ((i16 >> 18) & 14) | ((i16 >> 21) & 112));
                        o0VarE.g0(false);
                    } else {
                        if (!vVar.equals(v.b.f104911a)) {
                            throw kg.f.h(o0VarE, 848639738, false);
                        }
                        o0VarE.C(538498560);
                        i(aVar4, aVar5, o0VarE, (i16 >> 21) & 126);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(false);
                }
                o0VarE.g0(false);
            } else {
                o0VarE.C(-17881143);
                o0VarE.g0(false);
            }
            if (aVar7 instanceof w.a.C2010a) {
                Object objH = q2.h(o0VarE, -17829373, aVar8);
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                if (objH == c2565a) {
                    objH = p0.n(Boolean.TRUE);
                    o0VarE.K(objH);
                }
                p1 p1Var = (p1) objH;
                Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                Boolean bool = (Boolean) p1Var.getF182175a();
                bool.booleanValue();
                boolean zR = o0VarE.r(context) | ((i16 & 1879048192) == 536870912);
                Object objQ2 = o0VarE.q();
                if (zR || objQ2 == c2565a) {
                    objQ2 = new j(context, aVar6, p1Var, null);
                    o0VarE.K(objQ2);
                }
                l0.e((e23.p) objQ2, bool, o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-17454583);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new s4(wVar, dVar, cVar, eVar, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, i14, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x009a  */
    public static final void e(fi1.d dVar, fi1.c cVar, boolean z14, e23.l<? super fi1.b, Unit> lVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(112049343);
        int i15 = (o0VarE.B(dVar) ? 4 : 2) | i14 | (o0VarE.B(cVar) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            f0 f0Var = f0.f110999a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarF = x2.f(c2.l.y(aVar, j92.b.f97899b.f97920e), 1.0f);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_get_directions);
            boolean z15 = (dVar.f71774b || cVar.f71770a == null || z14) ? false : true;
            boolean z16 = ((i15 & 112) == 32) | ((i15 & 7168) == 2048);
            Object objQ = o0VarE.q();
            if (z16) {
                objQ = new k11.h(10, cVar, lVar);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new k11.h(10, cVar, lVar);
                    o0VarE.K(objQ);
                }
            }
            f0Var.d(0, 1, (e23.a) objQ, rVarF, strQ, o0VarE, null, z15);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ad0.g((Object) dVar, (Object) cVar, z14, (o13.h) lVar, i14, 26);
        }
    }

    public static final void f(fi1.b bVar, fi1.b bVar2, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(991502783);
        int i15 = (o0VarE.B(bVar) ? 4 : 2) | i14 | (o0VarE.B(bVar2) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            g6.f.a aVar2 = g6.f.f75994b;
            h4.r rVarH = x2.h(x2.f(aVar, 1.0f), 400);
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
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
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            if (bVar == null || bVar2 == null) {
                o0VarE.C(-517915597);
                h4.r rVarC2 = uVar.c(aVar, h4.d.a.f81528f);
                Object objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new kb0.d(19);
                    o0VarE.K(objQ);
                }
                p002j6.c.b((e23.l) objQ, rVarC2, null, o0VarE, 6, 4);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-518131326);
                int i16 = i15 << 3;
                g(x2.d(aVar, 1.0f), bVar, bVar2, o0VarE, (i16 & 896) | (i16 & 112) | 6);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k41.e(bVar, bVar2, i14, 12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x011d  */
    /* JADX WARN: Code duplicated, block: B:52:0x01a2  */
    public static final void g(h4.r rVar, fi1.b bVar, fi1.b bVar2, p3.m mVar, int i14) {
        int i15;
        ke2.b bVar3;
        ke2.b bVar4;
        je2.b<?> bVar5;
        ke2.b bVar6;
        ke2.b bVar7;
        o0 o0VarE = mVar.E(1703334368);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(bVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(bVar2) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
            Drawable drawable = a7.b.getDrawable((Context) o0VarE.A(y3Var), R.drawable.device_location);
            Bitmap bitmapB = drawable != null ? d7.b.b(drawable, 0, 0, 7) : null;
            Drawable drawable2 = a7.b.getDrawable((Context) o0VarE.A(y3Var), R.drawable.current_location);
            Bitmap bitmapB2 = drawable2 != null ? d7.b.b(drawable2, 0, 0, 7) : null;
            ie2.n.f93149a.getClass();
            com.garmin.android.library.mapsdkadapter.i.d dVarF = ((qw0.i) ie2.n.a()).f();
            ke2.b bVarK = k(bVar, dVarF);
            ke2.b bVarK2 = k(bVar2, dVarF);
            ie2.l lVar = new ie2.l(1, false, null, 0.0f, null, null, null, null, null, null, null, null, 4094, null);
            le2.b bVar8 = new le2.b(bVarK, i53.a.a(new le2.d(0L, i53.a.a(bVarK, bVarK2), null, 0, null, 0, 0.0f, 125, null)), i53.a.a(new le2.c(bVarK2, bitmapB2, j(bitmapB2), 0.0f), new le2.c(bVarK, bitmapB, j(bitmapB), 1.0f)), null, 8, null);
            com.garmin.android.library.mapsdkadapter.k kVarA = ie2.n.a();
            boolean zR = o0VarE.r(bVarK);
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zR) {
                objQ = new g(bVarK, 0);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new g(bVarK, 0);
                    o0VarE.K(objQ);
                }
            }
            je2.b<?> bVarE = ((com.garmin.android.library.mapsdkadapter.r) kVarA).e(dVarF, bVarK2, (e23.a) objQ, o0VarE, ke2.b.f104550d << 3);
            if (bVarE == null) {
                o0VarE.C(-1002942457);
                o0VarE.g0(false);
                bVar4 = bVarK2;
                bVar3 = bVarK;
                bVar5 = bVarE;
            } else {
                o0VarE.C(521836346);
                int i16 = (i15 & 14) | 224256 | (ie2.l.f93135m << 3) | 1073741824;
                bVar3 = bVarK;
                bVar4 = bVarK2;
                bVar5 = bVarE;
                bVar5.a(rVar, lVar, bVar8, true, true, false, null, null, null, o0VarE, i16, 448);
                o0VarE.g0(false);
            }
            boolean zR2 = o0VarE.r(bVar3) | o0VarE.r(bVar4) | o0VarE.k(dVarF.ordinal()) | o0VarE.r(bVar5);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                ke2.b bVar9 = bVar3;
                ke2.b bVar10 = bVar4;
                objQ2 = new a(bVar9, bVar10, dVarF, bVar5, null);
                bVar6 = bVar9;
                bVar7 = bVar10;
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    ke2.b bVar11 = bVar3;
                    ke2.b bVar12 = bVar4;
                    objQ2 = new a(bVar11, bVar12, dVarF, bVar5, null);
                    bVar6 = bVar11;
                    bVar7 = bVar12;
                    o0VarE.K(objQ2);
                } else {
                    bVar6 = bVar3;
                    bVar7 = bVar4;
                }
            }
            l0.f(bVar6, bVar7, (e23.p) objQ2, o0VarE);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h6(rVar, bVar, bVar2, i14, 8);
        }
    }

    public static final void h(e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(1774675359);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.r(aVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar2) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            c1.f110940a.a(false, gl1.y.Q(o0VarE, R.string.lbl_location_permissions_needed), gl1.y.Q(o0VarE, R.string.msg_location_permissions_needed_to_use_feature), null, null, gl1.y.Q(o0VarE, R.string.lbl_settings), false, false, aVar, gl1.y.Q(o0VarE, R.string.lbl_cancel), aVar2, o0VarE, ((i15 << 24) & 234881024) | 6, (i15 >> 3) & 14, 216);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new com.google.maps.android.compose.l(aVar, aVar2, i14, 3, (byte) 0);
        }
    }

    public static final void i(e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(1867920718);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.r(aVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar2) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            c1.f110940a.a(false, gl1.y.Q(o0VarE, R.string.notification_title_location_services_disabled), gl1.y.Q(o0VarE, R.string.msg_location_services_needed_to_use_feature), null, null, gl1.y.Q(o0VarE, R.string.lbl_settings), false, false, aVar, gl1.y.Q(o0VarE, R.string.lbl_cancel), aVar2, o0VarE, ((i15 << 24) & 234881024) | 6, (i15 >> 3) & 14, 216);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new com.google.maps.android.compose.l(aVar, aVar2, i14, 4, (byte) 0);
        }
    }

    public static final BitmapDescriptor j(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                BitmapDescriptor bitmapDescriptorFromBitmap = BitmapDescriptorFactory.fromBitmap(bitmap);
                if (bitmapDescriptorFromBitmap != null) {
                    return bitmapDescriptorFromBitmap;
                }
            } catch (Exception e4) {
                sn.a.s("Exception creating BitmapDescriptor: ", e4.getMessage(), com.garmin.android.apps.connectmobile.i2.f36769a, com.garmin.android.apps.connectmobile.a2.GENERAL, "FindMyDeviceScreen");
                return null;
            }
        }
        BitmapDescriptor bitmapDescriptorDefaultMarker = BitmapDescriptorFactory.defaultMarker();
        bitmapDescriptorDefaultMarker.getClass();
        return bitmapDescriptorDefaultMarker;
    }

    public static final ke2.b k(fi1.b bVar, com.garmin.android.library.mapsdkadapter.i.d dVar) {
        if (dVar != com.garmin.android.library.mapsdkadapter.i.d.GOOGLE) {
            return new ke2.b(bVar.f71766a, bVar.f71767b, null, 4, null);
        }
        LatLng latLngD = me2.z.d(new com.garmin.android.library.mapsdkadapter.f(bVar.f71766a, bVar.f71767b, com.garmin.android.library.mapsdkadapter.i.b.WGS84));
        return new ke2.b(latLngD.latitude, latLngD.longitude, null, 4, null);
    }
}
