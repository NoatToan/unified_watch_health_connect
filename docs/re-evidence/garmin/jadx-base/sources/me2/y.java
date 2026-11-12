package me2;

import android.graphics.Bitmap;
import c2.x2;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RoundCap;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.compose.CameraPositionState;
import com.google.maps.android.compose.GoogleMapKt;
import com.google.maps.android.compose.MapProperties;
import com.google.maps.android.compose.MapType;
import com.google.maps.android.compose.MapUiSettings;
import com.google.maps.android.compose.MarkerKt;
import com.google.maps.android.compose.MarkerState;
import com.google.maps.android.compose.PolylineKt;
import com.google.maps.android.compose.clustering.ClusteringKt;
import f5.z0;
import h5.e0;
import i3.m8;
import i3.mh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import l30.i0;
import l72.y0;
import o4.m1;
import p005kotlin.Unit;
import p006l2.v0;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.x0;
import w5.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class y {
    /* JADX WARN: Code duplicated, block: B:31:0x0113  */
    /* JADX WARN: Code duplicated, block: B:33:0x011a  */
    /* JADX WARN: Code duplicated, block: B:34:0x011e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0139  */
    /* JADX WARN: Code duplicated, block: B:41:0x01df  */
    public static final void a(Cluster<f> cluster, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        int i16;
        j92.b bVar;
        h5.g.a.f fVar;
        c2.u uVar;
        h4.g gVar;
        z0 z0VarD;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        o0 o0VarE = mVar.E(712087720);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.r(cluster) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.d dVar = j92.b.f97900c;
            h4.r rVarB = l4.k.b(aVar, k2.i.a(dVar.f97914f));
            long jC = o4.d0.c(0.4f, d92.b.a(o0VarE).e().e(), 14);
            m1.a aVar2 = m1.f128891a;
            h4.r rVarE = u1.n.e(rVarB, jC, aVar2);
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarY = c2.l.y(rVarE, eVar.f97917b);
            h4.d.f81522a.getClass();
            h4.g gVar2 = h4.d.a.f81524b;
            z0 z0VarD2 = c2.q.d(gVar2, false);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarY, o0VarE);
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
            b4.c(eVar2, z0VarD2, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T) {
                bVar = bVar2;
            } else {
                bVar = bVar2;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                uVar = c2.u.f22885a;
                gVar = h4.d.a.f81528f;
                h4.r rVarC3 = uVar.c(aVar, gVar);
                bVar.getClass();
                h4.r rVarE2 = u1.n.e(l4.k.b(rVarC3, k2.i.a(dVar.f97913e)), d92.b.a(o0VarE).e().e(), aVar2);
                bVar.getClass();
                h4.r rVarY2 = c2.l.y(rVarE2, eVar.f97917b);
                z0VarD = c2.q.d(gVar2, false);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarY2, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, z0VarD, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                }
                b4.c(fVar, rVarC, o0VarE);
                String strValueOf = String.valueOf(cluster.getItems().size());
                g6.f.a aVar4 = g6.f.f75994b;
                h4.r rVarC4 = uVar.c(x2.w(aVar, 16, 0.0f, 2), gVar);
                d6.h.f57752b.getClass();
                d6.h hVarA = d6.h.a(d6.h.f57755e);
                d92.b.f58624b.getClass();
                x0 x0VarA = x0.a(j92.f.f97933j, d92.b.a(o0VarE).k().f63527d, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                f0.f182097b.getClass();
                i16 = 1;
                mh.c(strValueOf, rVarC4, 0L, null, 0L, null, 0L, hVarA, 0L, 0, false, 0, 0, null, x0.a(x0VarA, 0L, 0L, f0.f182105j, null, 0L, null, null, 0, 0L, null, null, 16777211), o0VarE, 0, 0, 130044);
                o0Var = o0VarE;
                o0Var.g0(true);
                o0Var.g0(true);
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            uVar = c2.u.f22885a;
            gVar = h4.d.a.f81528f;
            h4.r rVarC5 = uVar.c(aVar, gVar);
            bVar.getClass();
            h4.r rVarE3 = u1.n.e(l4.k.b(rVarC5, k2.i.a(dVar.f97913e)), d92.b.a(o0VarE).e().e(), aVar2);
            bVar.getClass();
            h4.r rVarY3 = c2.l.y(rVarE3, eVar.f97917b);
            z0VarD = c2.q.d(gVar2, false);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarY3, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, z0VarD, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(fVar, rVarC, o0VarE);
            String strValueOf2 = String.valueOf(cluster.getItems().size());
            g6.f.a aVar5 = g6.f.f75994b;
            h4.r rVarC6 = uVar.c(x2.w(aVar, 16, 0.0f, 2), gVar);
            d6.h.f57752b.getClass();
            d6.h hVarA2 = d6.h.a(d6.h.f57755e);
            d92.b.f58624b.getClass();
            x0 x0VarA2 = x0.a(j92.f.f97933j, d92.b.a(o0VarE).k().f63527d, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
            f0.f182097b.getClass();
            i16 = 1;
            mh.c(strValueOf2, rVarC6, 0L, null, 0L, null, 0L, hVarA2, 0L, 0, false, 0, 0, null, x0.a(x0VarA2, 0L, 0L, f0.f182105j, null, 0L, null, null, 0, 0L, null, null, 16777211), o0VarE, 0, 0, 130044);
            o0Var = o0VarE;
            o0Var.g0(true);
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            i16 = 1;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new y0(cluster, i14, i16);
        }
    }

    public static final void b(f fVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(299079486);
        int i16 = 2;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(fVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            Bitmap bitmap = fVar.f118168a.f50327a.f50318j;
            if (bitmap == null) {
                o0VarE.C(2114864560);
                o0VarE.g0(false);
            } else {
                o0VarE.C(2114864561);
                o4.f fVar2 = new o4.f(bitmap);
                h4.r.a aVar = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                u1.y0.c(fVar2, null, h4.p.b(x2.q(aVar, j92.b.f97899b.f97921f), fVar.getZIndex()), null, o0VarE, 48, 248);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new y0(fVar, i14, i16);
        }
    }

    public static final void c(le2.d dVar, float f14, p3.m mVar, int i14) {
        o0 o0Var;
        i53.c<ke2.b> cVar;
        int i15;
        o0 o0VarE = mVar.E(-1376172052);
        int i16 = i14 | (o0VarE.B(dVar) ? 4 : 2) | (o0VarE.i(f14) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            e23.p<Float, com.garmin.android.library.mapsdkadapter.i.d, Float> pVar = dVar.f112064c;
            i53.c<ke2.b> cVar2 = dVar.f112063b;
            Float fValueOf = Float.valueOf(f14);
            com.garmin.android.library.mapsdkadapter.i.d dVar2 = com.garmin.android.library.mapsdkadapter.i.d.GOOGLE;
            float fFloatValue = pVar.invoke(fValueOf, dVar2).floatValue();
            float fFloatValue2 = dVar.f112066e.invoke(Float.valueOf(f14), dVar2).floatValue();
            if (fFloatValue2 > 0.0f) {
                o0VarE.C(-2078481748);
                ArrayList arrayList = new ArrayList(p13.y.r(cVar2, 10));
                Iterator<ke2.b> it = cVar2.iterator();
                while (it.hasNext()) {
                    arrayList.add(ke2.c.c(it.next()));
                }
                o0Var = o0VarE;
                cVar = cVar2;
                i15 = 10;
                PolylineKt.m123PolylineUt8lOTo(arrayList, false, o4.f0.b(dVar.f112067f), new RoundCap(), false, 2, null, new RoundCap(), null, true, fFloatValue + fFloatValue2, dVar.f112068g - 1, null, o0Var, 805503024, 0, 4432);
                o0Var.g0(false);
            } else {
                cVar = cVar2;
                i15 = 10;
                o0VarE.C(-2078097162);
                o0VarE.g0(false);
                o0Var = o0VarE;
            }
            ArrayList arrayList2 = new ArrayList(p13.y.r(cVar, i15));
            Iterator<ke2.b> it3 = cVar.iterator();
            while (it3.hasNext()) {
                arrayList2.add(ke2.c.c(it3.next()));
            }
            PolylineKt.m123PolylineUt8lOTo(arrayList2, false, o4.f0.b(dVar.f112065d), new RoundCap(), false, 2, null, new RoundCap(), null, true, fFloatValue, dVar.f112068g, null, o0Var, 805503024, 0, 4432);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d70.f(dVar, f14, i14, 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [T, com.google.maps.android.compose.CameraPositionState, java.lang.Object] */
    public static final void d(h4.r rVar, final e eVar, ie2.l lVar, final le2.b bVar, boolean z14, boolean z15, boolean z16, final e23.l lVar2, e23.r rVar2, e23.l lVar3, p3.m mVar, int i14) {
        boolean z17;
        o0 o0Var;
        MapType mapType;
        boolean z18;
        p1 p1Var;
        e eVar2 = eVar;
        boolean z19 = z14;
        rVar.getClass();
        bVar.getClass();
        i53.c<le2.d> cVar = bVar.f112055b;
        i53.c<le2.c> cVar2 = bVar.f112056c;
        o0 o0VarE = mVar.E(-580671648);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.r(eVar2) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.B(bVar) ? 2048 : 1024) | (o0VarE.h(z19) ? 16384 : 8192) | (o0VarE.h(z15) ? 131072 : 65536) | (o0VarE.h(z16) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(lVar2) ? 8388608 : 4194304) | (o0VarE.r(rVar2) ? 67108864 : 33554432) | (o0VarE.r(lVar3) ? 536870912 : 268435456);
        if (o0VarE.n(i15 & 1, (i15 & 306783379) != 306783378)) {
            x1 x1Var = p3.n.f135158a;
            final ?? r14 = (CameraPositionState) d4.a.c(Arrays.copyOf(new Object[]{eVar2}, 1), CameraPositionState.INSTANCE.getSaver(), new x(new kp2.a(eVar2, 27)), o0VarE, 0);
            if (eVar2.f98598b == 0) {
                eVar2.f98598b = r14;
            }
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            Object obj = p3.m.a.f135155b;
            if (objQ == obj) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            final o53.b0 b0Var = (o53.b0) objQ;
            int i16 = lVar.f93136a;
            if (i16 == 1) {
                mapType = MapType.NORMAL;
            } else if (i16 != 3) {
                mapType = i16 != 4 ? MapType.NONE : MapType.HYBRID;
            } else {
                mapType = MapType.TERRAIN;
            }
            MapType mapType2 = mapType;
            Object[] objArr = {Float.valueOf(r14.getPosition().zoom)};
            boolean zR = o0VarE.r(r14);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == obj) {
                objQ2 = new v0(r14, 27);
                o0VarE.K(objQ2);
            }
            final float fFloatValue = ((Number) d4.a.e(objArr, (e23.a) objQ2, o0VarE, 0)).floatValue();
            Object objQ3 = o0VarE.q();
            if (objQ3 == obj) {
                LatLng latLngC = ke2.c.c(bVar.f112054a);
                com.garmin.android.library.mapsdkadapter.f.f50281c.getClass();
                z18 = true;
                objQ3 = p0.n(new MapProperties(false, false, !latLngC.equals(com.garmin.android.library.mapsdkadapter.f.f50282d.f50283a), false, null, null, mapType2, 17.0f, 0.0f, 304, null));
                o0VarE.K(objQ3);
            } else {
                z18 = true;
            }
            p1 p1Var2 = (p1) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == obj) {
                Boolean bool = lVar.f93143h;
                Boolean bool2 = Boolean.TRUE;
                objQ4 = p0.n(new MapUiSettings(false, false, p005kotlin.jvm.internal.s.g(lVar.f93146k, bool2), false, false, false, false, false, p005kotlin.jvm.internal.s.g(bool, bool2), false, 738, null));
                o0VarE.K(objQ4);
            }
            p1 p1Var3 = (p1) objQ4;
            if (((MapProperties) p1Var2.getF182175a()).getMapType() != mapType2) {
                p1Var2.setValue(MapProperties.copy$default((MapProperties) p1Var2.getF182175a(), false, false, false, false, null, null, mapType2, 0.0f, 0.0f, 447, null));
            }
            boolean zB = o0VarE.B(cVar);
            Object objQ5 = o0VarE.q();
            if (zB || objQ5 == obj) {
                objQ5 = p0.n(i53.a.e(cVar));
                o0VarE.K(objQ5);
            }
            final p1 p1Var4 = (p1) objQ5;
            boolean zB2 = o0VarE.B(cVar2);
            Object objQ6 = o0VarE.q();
            if (zB2 || objQ6 == obj) {
                objQ6 = p0.n(i53.a.e(cVar2));
                o0VarE.K(objQ6);
            }
            p1 p1Var5 = (p1) objQ6;
            boolean zB3 = o0VarE.B(cVar2);
            Object objQ7 = o0VarE.q();
            if (zB3 || objQ7 == obj) {
                ArrayList arrayList = new ArrayList(p13.y.r(cVar2, 10));
                Iterator<le2.c> it = cVar2.iterator();
                while (it.hasNext()) {
                    le2.c next = it.next();
                    next.getClass();
                    com.garmin.android.library.mapsdkadapter.p pVar = new com.garmin.android.library.mapsdkadapter.p();
                    pVar.d(z.b(ke2.c.c(next.f112058a)));
                    pVar.f50327a.f50311c = next.f112061d;
                    pVar.c(next.f112059b);
                    arrayList.add(new f(pVar, null, 2, null));
                    it = it;
                    p1Var5 = p1Var5;
                }
                p1Var = p1Var5;
                objQ7 = p0.n(i53.a.e(arrayList));
                o0VarE.K(objQ7);
            } else {
                p1Var = p1Var5;
            }
            final p1 p1Var6 = (p1) objQ7;
            Object objQ8 = o0VarE.q();
            Object obj2 = p3.m.a.f135155b;
            if (objQ8 == obj2) {
                objQ8 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ8);
            }
            final p1 p1Var7 = (p1) objQ8;
            h4.r rVarD = x2.d(rVar, 1.0f);
            MapProperties mapProperties = (MapProperties) p1Var2.getF182175a();
            MapUiSettings mapUiSettings = (MapUiSettings) p1Var3.getF182175a();
            boolean zR2 = o0VarE.r(lVar);
            Object objQ9 = o0VarE.q();
            if (zR2 || objQ9 == obj2) {
                objQ9 = new v0(lVar, 28);
                o0VarE.K(objQ9);
            }
            e23.a aVar = (e23.a) objQ9;
            boolean z24 = (i15 & 29360128) == 8388608 ? z18 : false;
            Object objQ10 = o0VarE.q();
            if (z24 || objQ10 == obj2) {
                objQ10 = new k11.n(lVar2, 25);
                o0VarE.K(objQ10);
            }
            e23.l lVar4 = (e23.l) objQ10;
            Object objQ11 = o0VarE.q();
            if (objQ11 == obj2) {
                objQ11 = new ly0.f(p1Var7, 22);
                o0VarE.K(objQ11);
            }
            o0 o0Var2 = o0VarE;
            boolean z25 = z18;
            final p1 p1Var8 = p1Var;
            eVar2 = eVar;
            GoogleMapKt.GoogleMap(rVarD, false, r14, null, aVar, mapProperties, null, mapUiSettings, null, lVar4, null, (e23.a) objQ11, null, null, null, null, null, z3.f.c(1315694470, new e23.p() { // from class: me2.o
                /* JADX WARN: Code duplicated, block: B:16:0x0083  */
                /* JADX WARN: Code duplicated, block: B:21:0x00af  */
                /* JADX WARN: Code duplicated, block: B:37:0x014c  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // e23.p
                public final Object invoke(Object obj3, Object obj4) {
                    p3.m mVar2 = (p3.m) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                        x1 x1Var2 = p3.n.f135158a;
                        if (((Boolean) p1Var7.getF182175a()).booleanValue()) {
                            mVar2.C(-17494989);
                            e23.p<Float, com.garmin.android.library.mapsdkadapter.i.d, Boolean> pVar2 = bVar.f112057d;
                            final float f14 = fFloatValue;
                            boolean zBooleanValue = pVar2.invoke(Float.valueOf(f14), com.garmin.android.library.mapsdkadapter.i.d.GOOGLE).booleanValue();
                            final e23.l lVar5 = lVar2;
                            p3.m.a aVar2 = p3.m.f135153a;
                            if (zBooleanValue) {
                                mVar2.C(-17420093);
                                i53.c cVar3 = (i53.c) p1Var6.getF182175a();
                                final o53.b0 b0Var2 = b0Var;
                                boolean zR3 = mVar2.r(b0Var2);
                                final e eVar3 = eVar;
                                boolean zR4 = zR3 | mVar2.r(eVar3) | mVar2.i(f14) | mVar2.B(lVar5);
                                Object objQ12 = mVar2.q();
                                if (zR4) {
                                    final int i17 = 0;
                                    e23.l lVar6 = new e23.l() { // from class: me2.n
                                        @Override // e23.l
                                        public final Object invoke(Object obj5) {
                                            switch (i17) {
                                                case 0:
                                                    Cluster cluster = (Cluster) obj5;
                                                    cluster.getClass();
                                                    ge1.b.T(b0Var2, null, null, new p(eVar3, cluster, f14, null), 3);
                                                    e23.l lVar7 = lVar5;
                                                    if (lVar7 != null) {
                                                        LatLng position = cluster.getPosition();
                                                        position.getClass();
                                                        lVar7.invoke(ke2.c.b(position));
                                                    }
                                                    break;
                                                default:
                                                    f fVar = (f) obj5;
                                                    fVar.getClass();
                                                    ge1.b.T(b0Var2, null, null, new q(eVar3, fVar, f14, null), 3);
                                                    e23.l lVar8 = lVar5;
                                                    if (lVar8 != null) {
                                                        lVar8.invoke(ke2.c.b(fVar.mo335getPosition()));
                                                    }
                                                    break;
                                            }
                                            return Boolean.TRUE;
                                        }
                                    };
                                    mVar2.K(lVar6);
                                    objQ12 = lVar6;
                                } else {
                                    aVar2.getClass();
                                    if (objQ12 == p3.m.a.f135155b) {
                                        final int i18 = 0;
                                        e23.l lVar7 = new e23.l() { // from class: me2.n
                                            @Override // e23.l
                                            public final Object invoke(Object obj5) {
                                                switch (i18) {
                                                    case 0:
                                                        Cluster cluster = (Cluster) obj5;
                                                        cluster.getClass();
                                                        ge1.b.T(b0Var2, null, null, new p(eVar3, cluster, f14, null), 3);
                                                        e23.l lVar8 = lVar5;
                                                        if (lVar8 != null) {
                                                            LatLng position = cluster.getPosition();
                                                            position.getClass();
                                                            lVar8.invoke(ke2.c.b(position));
                                                        }
                                                        break;
                                                    default:
                                                        f fVar = (f) obj5;
                                                        fVar.getClass();
                                                        ge1.b.T(b0Var2, null, null, new q(eVar3, fVar, f14, null), 3);
                                                        e23.l lVar9 = lVar5;
                                                        if (lVar9 != null) {
                                                            lVar9.invoke(ke2.c.b(fVar.mo335getPosition()));
                                                        }
                                                        break;
                                                }
                                                return Boolean.TRUE;
                                            }
                                        };
                                        mVar2.K(lVar7);
                                        objQ12 = lVar7;
                                    }
                                }
                                e23.l lVar8 = (e23.l) objQ12;
                                boolean zR5 = mVar2.r(b0Var2) | mVar2.r(eVar3) | mVar2.i(f14) | mVar2.B(lVar5);
                                Object objQ13 = mVar2.q();
                                if (zR5) {
                                    final int i19 = 1;
                                    e23.l lVar9 = new e23.l() { // from class: me2.n
                                        @Override // e23.l
                                        public final Object invoke(Object obj5) {
                                            switch (i19) {
                                                case 0:
                                                    Cluster cluster = (Cluster) obj5;
                                                    cluster.getClass();
                                                    ge1.b.T(b0Var2, null, null, new p(eVar3, cluster, f14, null), 3);
                                                    e23.l lVar10 = lVar5;
                                                    if (lVar10 != null) {
                                                        LatLng position = cluster.getPosition();
                                                        position.getClass();
                                                        lVar10.invoke(ke2.c.b(position));
                                                    }
                                                    break;
                                                default:
                                                    f fVar = (f) obj5;
                                                    fVar.getClass();
                                                    ge1.b.T(b0Var2, null, null, new q(eVar3, fVar, f14, null), 3);
                                                    e23.l lVar11 = lVar5;
                                                    if (lVar11 != null) {
                                                        lVar11.invoke(ke2.c.b(fVar.mo335getPosition()));
                                                    }
                                                    break;
                                            }
                                            return Boolean.TRUE;
                                        }
                                    };
                                    mVar2.K(lVar9);
                                    objQ13 = lVar9;
                                } else {
                                    aVar2.getClass();
                                    if (objQ13 == p3.m.a.f135155b) {
                                        final int i110 = 1;
                                        e23.l lVar10 = new e23.l() { // from class: me2.n
                                            @Override // e23.l
                                            public final Object invoke(Object obj5) {
                                                switch (i110) {
                                                    case 0:
                                                        Cluster cluster = (Cluster) obj5;
                                                        cluster.getClass();
                                                        ge1.b.T(b0Var2, null, null, new p(eVar3, cluster, f14, null), 3);
                                                        e23.l lVar11 = lVar5;
                                                        if (lVar11 != null) {
                                                            LatLng position = cluster.getPosition();
                                                            position.getClass();
                                                            lVar11.invoke(ke2.c.b(position));
                                                        }
                                                        break;
                                                    default:
                                                        f fVar = (f) obj5;
                                                        fVar.getClass();
                                                        ge1.b.T(b0Var2, null, null, new q(eVar3, fVar, f14, null), 3);
                                                        e23.l lVar12 = lVar5;
                                                        if (lVar12 != null) {
                                                            lVar12.invoke(ke2.c.b(fVar.mo335getPosition()));
                                                        }
                                                        break;
                                                }
                                                return Boolean.TRUE;
                                            }
                                        };
                                        mVar2.K(lVar10);
                                        objQ13 = lVar10;
                                    }
                                }
                                e23.l lVar11 = (e23.l) objQ13;
                                a.f118117a.getClass();
                                z3.e eVar4 = a.f118118b;
                                z3.e eVar5 = a.f118119c;
                                Object objQ14 = mVar2.q();
                                aVar2.getClass();
                                if (objQ14 == p3.m.a.f135155b) {
                                    objQ14 = new m30.n(28);
                                    mVar2.K(objQ14);
                                }
                                ClusteringKt.Clustering(cVar3, lVar8, lVar11, (e23.l) null, (e23.l) null, eVar4, eVar5, (e23.l) objQ14, mVar2, 14352384, 24);
                                mVar2.f();
                            } else {
                                mVar2.C(-15943284);
                                mVar2.C(1662054216);
                                Iterator<E> it3 = ((i53.c) p1Var4.getF182175a()).iterator();
                                while (it3.hasNext()) {
                                    y.c((le2.d) it3.next(), r14.getPosition().zoom, mVar2, 0);
                                }
                                mVar2.f();
                                for (le2.c cVar4 : (i53.c) p1Var8.getF182175a()) {
                                    boolean zB4 = mVar2.B(lVar5) | mVar2.B(cVar4);
                                    Object objQ15 = mVar2.q();
                                    if (zB4) {
                                        objQ15 = new i0(25, lVar5, cVar4);
                                        mVar2.K(objQ15);
                                    } else {
                                        aVar2.getClass();
                                        if (objQ15 == p3.m.a.f135155b) {
                                            objQ15 = new i0(25, lVar5, cVar4);
                                            mVar2.K(objQ15);
                                        }
                                    }
                                    y.e(cVar4, (e23.a) objQ15, mVar2, 0, 0);
                                }
                                mVar2.f();
                            }
                            mVar2.f();
                        } else {
                            mVar2.C(-15364452);
                            mVar2.f();
                        }
                        x1 x1Var3 = p3.n.f135158a;
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0Var2), o0Var2, (CameraPositionState.$stable << 6) | (MapProperties.$stable << 15) | (MapUiSettings.$stable << 21), 12582960, 128330);
            Boolean boolValueOf = Boolean.valueOf(r14.isMoving());
            Boolean bool3 = (Boolean) p1Var7.getF182175a();
            bool3.getClass();
            boolean zR3 = o0Var2.r(r14) | o0Var2.r(eVar2) | ((i15 & 234881024) == 67108864 ? z25 : false);
            Object objQ12 = o0Var2.q();
            if (zR3 || objQ12 == obj2) {
                r rVar3 = new r(r14, p1Var7, eVar2, rVar2, null);
                o0Var2.K(rVar3);
                objQ12 = rVar3;
            }
            l0.f(boolValueOf, bool3, (e23.p) objQ12, o0Var2);
            Float fValueOf = Float.valueOf(r14.getPosition().bearing);
            Boolean bool4 = (Boolean) p1Var7.getF182175a();
            bool4.getClass();
            boolean zR4 = ((i15 & 1879048192) == 536870912 ? z25 : false) | o0Var2.r(r14);
            Object objQ13 = o0Var2.q();
            if (zR4 || objQ13 == obj2) {
                objQ13 = new s(lVar3, r14, p1Var7, null);
                o0Var2.K(objQ13);
            }
            l0.f(fValueOf, bool4, (e23.p) objQ13, o0Var2);
            Boolean boolValueOf2 = Boolean.valueOf(z16);
            boolean z26 = (i15 & 3670016) == 1048576 ? z25 : false;
            Object objQ14 = o0Var2.q();
            if (z26 || objQ14 == obj2) {
                objQ14 = new t(z16, p1Var2, null);
                o0Var2.K(objQ14);
            }
            l0.e((e23.p) objQ14, boolValueOf2, o0Var2);
            Boolean boolValueOf3 = Boolean.valueOf(z14);
            i53.c cVar3 = (i53.c) p1Var4.getF182175a();
            boolean zB4 = ((i15 & 57344) == 16384 ? z25 : false) | o0Var2.B(p1Var4) | o0Var2.r(eVar2);
            Object objQ15 = o0Var2.q();
            if (zB4 || objQ15 == obj2) {
                z19 = z14;
                objQ15 = new u(z19, eVar2, p1Var4, null);
                o0Var2.K(objQ15);
            } else {
                z19 = z14;
            }
            l0.f(boolValueOf3, cVar3, (e23.p) objQ15, o0Var2);
            Boolean boolValueOf4 = Boolean.valueOf(z15);
            boolean z27 = (i15 & 458752) == 131072 ? z25 : false;
            Object objQ16 = o0Var2.q();
            if (z27 || objQ16 == obj2) {
                z17 = z15;
                objQ16 = new v(z17, p1Var3, null);
                o0Var2.K(objQ16);
            } else {
                z17 = z15;
            }
            l0.e((e23.p) objQ16, boolValueOf4, o0Var2);
            x1 x1Var2 = p3.n.f135158a;
            o0Var = o0Var2;
        } else {
            z17 = z15;
            o0 o0Var3 = o0VarE;
            o0Var3.e();
            o0Var = o0Var3;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(rVar, eVar2, lVar, bVar, z19, z17, z16, lVar2, rVar2, lVar3, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0082  */
    public static final void e(le2.c cVar, e23.a<Boolean> aVar, p3.m mVar, int i14, int i15) {
        e23.a<Boolean> aVar2;
        int i16;
        o0 o0Var;
        e23.a<Boolean> aVar3;
        e23.a<Boolean> aVar4;
        o0 o0VarE = mVar.E(-478976316);
        int i17 = i14 | (o0VarE.B(cVar) ? 4 : 2);
        int i18 = i15 & 2;
        if (i18 != 0) {
            i16 = i17 | 48;
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            i16 = i17 | (o0VarE.r(aVar2) ? 32 : 16);
        }
        int i19 = 18;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            p3.m.a aVar5 = p3.m.f135153a;
            if (i18 != 0) {
                Object objQ = o0VarE.q();
                aVar5.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ll0.b(26);
                    o0VarE.K(objQ);
                }
                aVar4 = (e23.a) objQ;
            } else {
                aVar4 = aVar2;
            }
            x1 x1Var = p3.n.f135158a;
            MarkerState markerStateRememberUpdatedMarkerState = MarkerKt.rememberUpdatedMarkerState(ke2.c.c(cVar.f112058a), o0VarE, 0, 0);
            BitmapDescriptor bitmapDescriptor = cVar.f112060c;
            float f14 = cVar.f112061d;
            boolean z14 = (i16 & 112) == 32;
            Object objQ2 = o0VarE.q();
            if (z14) {
                objQ2 = new m8(aVar4, i19);
                o0VarE.K(objQ2);
            } else {
                aVar5.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new m8(aVar4, i19);
                    o0VarE.K(objQ2);
                }
            }
            o0Var = o0VarE;
            MarkerKt.m114Markerqld6geY(markerStateRememberUpdatedMarkerState, null, 0.0f, 0L, false, false, bitmapDescriptor, 0L, 0.0f, null, null, null, false, f14, (e23.l) objQ2, null, null, null, o0Var, MarkerState.$stable, 0, 237502);
            aVar3 = aVar4;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            aVar3 = aVar2;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ik1.a(cVar, aVar3, i14, i15, 29);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v19, types: [T, com.google.maps.android.compose.CameraPositionState, java.lang.Object] */
    public static final void f(h4.r rVar, e eVar, i53.c cVar, i53.c cVar2, List list, int i14, boolean z14, e23.a aVar, e23.l lVar, p3.m mVar, int i15) {
        o0 o0Var;
        MapType mapType;
        rVar.getClass();
        cVar.getClass();
        cVar2.getClass();
        list.getClass();
        o0 o0VarE = mVar.E(1114155677);
        int i16 = i15 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.r(eVar) ? 32 : 16) | (o0VarE.B(cVar) ? 256 : 128) | (o0VarE.B(cVar2) ? 2048 : 1024) | (o0VarE.r(list) ? 16384 : 8192) | (o0VarE.k(i14) ? 131072 : 65536) | (o0VarE.h(z14) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(aVar) ? 8388608 : 4194304) | (o0VarE.r(lVar) ? 67108864 : 33554432);
        if (o0VarE.n(i16 & 1, (38347923 & i16) != 38347922)) {
            x1 x1Var = p3.n.f135158a;
            if (i14 == 1) {
                mapType = MapType.NORMAL;
            } else if (i14 != 3) {
                mapType = i14 != 4 ? MapType.NONE : MapType.HYBRID;
            } else {
                mapType = MapType.TERRAIN;
            }
            MapProperties mapProperties = new MapProperties(false, false, false, false, null, null, mapType, 0.0f, 0.0f, 447, null);
            MapUiSettings mapUiSettings = new MapUiSettings(false, false, false, false, z14, z14, false, false, false, z14, 64, null);
            ?? r14 = (CameraPositionState) d4.a.c(Arrays.copyOf(new Object[]{eVar}, 1), CameraPositionState.INSTANCE.getSaver(), new x(new l3.p1(29, eVar, list)), o0VarE, 0);
            if (eVar.f98598b == 0) {
                eVar.f98598b = r14;
            }
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            Object obj = p3.m.a.f135155b;
            if (objQ == obj) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            boolean z15 = (i16 & 29360128) == 8388608;
            Object objQ2 = o0VarE.q();
            if (z15 || objQ2 == obj) {
                objQ2 = new m8(aVar, 19);
                o0VarE.K(objQ2);
            }
            e23.l lVar2 = (e23.l) objQ2;
            boolean zR = o0VarE.r(r14) | o0VarE.r(list);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == obj) {
                objQ3 = new kk1.a((Object) r14, 18, list, p1Var);
                o0VarE.K(objQ3);
            }
            boolean z16 = false;
            GoogleMapKt.GoogleMap(rVar, false, r14, null, null, mapProperties, null, mapUiSettings, null, lVar2, null, (e23.a) objQ3, null, null, null, null, null, z3.f.c(749648963, new lb0.a(cVar, 22, cVar2, r14), o0VarE), o0VarE, (i16 & 14) | (CameraPositionState.$stable << 6) | (MapProperties.$stable << 15) | (MapUiSettings.$stable << 21), 12582912, 128346);
            o0 o0Var2 = o0VarE;
            Float fValueOf = Float.valueOf(r14.getPosition().bearing);
            Boolean bool = (Boolean) p1Var.getF182175a();
            bool.getClass();
            if ((i16 & 234881024) == 67108864) {
                z16 = true;
            }
            boolean zR2 = z16 | o0Var2.r(r14);
            Object objQ4 = o0Var2.q();
            if (zR2 || objQ4 == obj) {
                objQ4 = new w(lVar, r14, p1Var, null);
                o0Var2.K(objQ4);
            }
            l0.f(fValueOf, bool, (e23.p) objQ4, o0Var2);
            o0Var = o0Var2;
        } else {
            o0 o0Var3 = o0VarE;
            o0Var3.e();
            o0Var = o0Var3;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b(rVar, eVar, cVar, cVar2, list, i14, z14, aVar, lVar, i15);
        }
    }
}
