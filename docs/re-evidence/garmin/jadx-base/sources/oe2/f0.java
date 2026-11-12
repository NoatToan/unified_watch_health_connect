package oe2;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.geojson.LineString;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.MapInitOptionsKt;
import com.mapbox.maps.MapOptions;
import com.mapbox.maps.MapView;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.RenderedQueryGeometry;
import com.mapbox.maps.RenderedQueryOptions;
import com.mapbox.maps.Style;
import com.mapbox.maps.StyleObjectInfo;
import com.mapbox.maps.extension.compose.ComposeMapInitOptions;
import com.mapbox.maps.extension.compose.MapEffectKt;
import com.mapbox.maps.extension.compose.MapState;
import com.mapbox.maps.extension.compose.MapboxMapKt;
import com.mapbox.maps.extension.compose.MapboxMapScope;
import com.mapbox.maps.extension.compose.animation.viewport.MapViewportState;
import com.mapbox.maps.extension.compose.style.IdGenerator;
import com.mapbox.maps.extension.compose.style.LongValue;
import com.mapbox.maps.extension.compose.style.StringValue;
import com.mapbox.maps.extension.compose.style.sources.generated.RasterDemSourceState;
import com.mapbox.maps.extension.compose.style.terrain.generated.TerrainState;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.Layer;
import com.mapbox.maps.extension.style.layers.LayerUtils;
import com.mapbox.maps.extension.style.layers.generated.LineLayer;
import com.mapbox.maps.extension.style.layers.generated.LineLayerKt;
import com.mapbox.maps.extension.style.layers.generated.SymbolLayer;
import com.mapbox.maps.extension.style.layers.generated.SymbolLayerKt;
import com.mapbox.maps.extension.style.layers.properties.generated.LineCap;
import com.mapbox.maps.extension.style.layers.properties.generated.LineJoin;
import com.mapbox.maps.extension.style.sources.Source;
import com.mapbox.maps.extension.style.sources.SourceUtils;
import com.mapbox.maps.extension.style.sources.generated.GeoJsonSource;
import com.mapbox.maps.extension.style.sources.generated.GeoJsonSourceKt;
import com.mapbox.maps.extension.style.utils.ColorUtils;
import com.mapbox.maps.plugin.gestures.OnMapClickListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import mt0.b2;
import o72.z0;
import p005kotlin.Unit;
import p13.h0;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes11.dex */
public final class f0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [T, com.mapbox.maps.extension.compose.animation.viewport.MapViewportState, java.lang.Object] */
    public static final void a(final h4.r rVar, final e eVar, final ie2.l lVar, final le2.b bVar, final boolean z14, boolean z15, final boolean z16, final e23.l lVar2, final e23.r rVar2, final e23.l lVar3, p3.m mVar, final int i14) {
        int i15;
        boolean z17;
        o0 o0Var;
        Object obj;
        String str;
        final double d14;
        p1 p1Var;
        p1 p1Var2;
        p1 p1Var3;
        rVar.getClass();
        bVar.getClass();
        o0 o0VarE = mVar.E(-1992934212);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(eVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(lVar) : o0VarE.r(lVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(bVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.h(z14) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.h(z15) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.h(z16) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarE.r(lVar2) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            i15 |= o0VarE.r(rVar2) ? 67108864 : 33554432;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            i15 |= o0VarE.r(lVar3) ? 536870912 : 268435456;
        }
        if (o0VarE.n(i15 & 1, (i15 & 306783379) != 306783378)) {
            x1 x1Var = p3.n.f135158a;
            final Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object[] objArr = new Object[0];
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            Object obj2 = p3.m.a.f135155b;
            if (objQ == obj2) {
                objQ = new oe0.e(1);
                o0VarE.K(objQ);
            }
            final p1 p1Var4 = (p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
            final p1 p1VarC = s9.c.c(eVar.f131474c, o0VarE);
            final ?? r14 = (MapViewportState) d4.a.c(Arrays.copyOf(new Object[]{eVar}, 1), MapViewportState.INSTANCE.getSaver(), new e0(new nw0.f(eVar, 12)), o0VarE, 0);
            if (eVar.f98598b == 0) {
                eVar.f98598b = r14;
            }
            Object objQ2 = o0VarE.q();
            if (objQ2 == obj2) {
                objQ2 = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ2);
            }
            final o53.b0 b0Var = (o53.b0) objQ2;
            Object[] objArr2 = new Object[0];
            int i16 = i15 & 7168;
            int i17 = i15;
            boolean z18 = i16 == 2048;
            Object objQ3 = o0VarE.q();
            if (z18 || objQ3 == obj2) {
                objQ3 = new n82.i(bVar, 18);
                o0VarE.K(objQ3);
            }
            final p1 p1Var5 = (p1) d4.a.e(objArr2, (e23.a) objQ3, o0VarE, 0);
            String strB = ne2.p.b(com.garmin.android.library.mapsdkadapter.i.e.f50297a, lVar.f93136a);
            Object objQ4 = o0VarE.q();
            if (objQ4 == obj2) {
                objQ4 = p0.n(null);
                o0VarE.K(objQ4);
            }
            final p1 p1Var6 = (p1) objQ4;
            Object objQ5 = o0VarE.q();
            if (objQ5 == obj2) {
                objQ5 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ5);
            }
            final p1 p1Var7 = (p1) objQ5;
            CameraState cameraState = r14.getCameraState();
            Object[] objArr3 = {cameraState != null ? Double.valueOf(cameraState.getZoom()) : null};
            boolean zB = o0VarE.B(r14) | o0VarE.r(eVar);
            Object objQ6 = o0VarE.q();
            if (zB || objQ6 == obj2) {
                objQ6 = new oe.j(1, (Object) r14, eVar);
                o0VarE.K(objQ6);
            }
            final double dDoubleValue = ((Number) d4.a.e(objArr3, (e23.a) objQ6, o0VarE, 0)).doubleValue();
            g gVar = new g(0);
            o0VarE.L(-231233878);
            final MapState mapState = (MapState) d4.a.d(new Object[0], MapState.INSTANCE.getSaver(), null, new l(gVar), o0VarE, 72, 0);
            o0VarE.g0(false);
            Object objQ7 = o0VarE.q();
            if (objQ7 == obj2) {
                MapOptions mapOptionsBuild = MapInitOptionsKt.applyDefaultParams(new MapOptions.Builder(), context).build();
                mapOptionsBuild.getClass();
                objQ7 = new ComposeMapInitOptions(mapOptionsBuild, false, 0, (String) null, 14, (p005kotlin.jvm.internal.j) null);
                o0VarE.K(objQ7);
            }
            ComposeMapInitOptions composeMapInitOptions = (ComposeMapInitOptions) objQ7;
            TerrainState terrainStateG = g(strB, o0VarE);
            h4.r rVarD = x2.d(rVar, 1.0f);
            boolean zM = ((i17 & 29360128) == 8388608) | (i16 == 2048) | o0VarE.m(dDoubleValue) | o0VarE.r(b0Var) | o0VarE.B(p1Var4) | o0VarE.r(eVar);
            Object objQ8 = o0VarE.q();
            if (zM || objQ8 == obj2) {
                str = strB;
                obj = new OnMapClickListener() { // from class: oe2.h
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.mapbox.maps.plugin.gestures.OnMapClickListener
                    public final boolean onMapClick(Point point) {
                        point.getClass();
                        e23.l lVar4 = lVar2;
                        if (lVar4 != null) {
                            lVar4.invoke(ne2.p.f(point));
                        }
                        e23.p<Float, com.garmin.android.library.mapsdkadapter.i.d, Boolean> pVar = bVar.f112057d;
                        double d15 = dDoubleValue;
                        boolean zBooleanValue = pVar.invoke(Float.valueOf((float) d15), com.garmin.android.library.mapsdkadapter.i.d.MAPBOX).booleanValue();
                        MapView mapView = (MapView) p1Var6.getF182175a();
                        MapboxMap mapboxMapDeprecated = mapView != null ? mapView.getMapboxMapDeprecated() : null;
                        k kVar = new k(zBooleanValue, b0Var, eVar, d15, p1Var4);
                        if (mapboxMapDeprecated == null) {
                            return true;
                        }
                        mapboxMapDeprecated.queryRenderedFeatures(new RenderedQueryGeometry(mapboxMapDeprecated.pixelForCoordinate(point)), new RenderedQueryOptions(p13.x.k("clustered-layer", "unclustered-layer"), null), new b2(kVar, 21));
                        return true;
                    }
                };
                d14 = dDoubleValue;
                p1Var = p1Var6;
                p1Var4 = p1Var4;
                o0VarE.K(obj);
            } else {
                str = strB;
                p1Var = p1Var6;
                obj = objQ8;
                d14 = dDoubleValue;
            }
            a.f131445a.getClass();
            z3.e eVar2 = a.f131446b;
            z3.e eVar3 = a.f131447c;
            z3.e eVarC = z3.f.c(-1479110127, new mw0.i(27, str, (Object) terrainStateG), o0VarE);
            final p1 p1Var8 = p1Var4;
            final String str2 = str;
            final p1 p1Var9 = p1Var;
            MapboxMapKt.MapboxMap(rVarD, composeMapInitOptions, eVar2, eVar3, null, null, r14, mapState, (OnMapClickListener) obj, null, eVarC, z3.f.c(-2007044419, new e23.q() { // from class: oe2.i
                /* JADX WARN: Code duplicated, block: B:12:0x0043  */
                /* JADX WARN: Code duplicated, block: B:17:0x006c  */
                /* JADX WARN: Code duplicated, block: B:22:0x009a  */
                /* JADX WARN: Code duplicated, block: B:27:0x00fe  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // e23.q
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    p3.m mVar2 = (p3.m) obj4;
                    int iIntValue = ((Integer) obj5).intValue();
                    ((MapboxMapScope) obj3).getClass();
                    if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                        x1 x1Var2 = p3.n.f135158a;
                        boolean z19 = z16;
                        Boolean boolValueOf = Boolean.valueOf(z19);
                        boolean zH = mVar2.h(z19);
                        Object objQ9 = mVar2.q();
                        p3.m.a aVar = p3.m.f135153a;
                        if (zH) {
                            objQ9 = new n(z19, null);
                            mVar2.K(objQ9);
                        } else {
                            aVar.getClass();
                            if (objQ9 == p3.m.a.f135155b) {
                                objQ9 = new n(z19, null);
                                mVar2.K(objQ9);
                            }
                        }
                        MapEffectKt.MapEffect(boolValueOf, (e23.q<? super o53.b0, ? super MapView, ? super t13.d<? super Unit>, ? extends Object>) objQ9, mVar2, 0);
                        p1 p1Var10 = p1Var5;
                        Boolean bool = (Boolean) p1Var10.getF182175a();
                        bool.booleanValue();
                        boolean zB2 = mVar2.B(p1Var10);
                        Object objQ10 = mVar2.q();
                        if (zB2) {
                            objQ10 = new o(p1Var10, null);
                            mVar2.K(objQ10);
                        } else {
                            aVar.getClass();
                            if (objQ10 == p3.m.a.f135155b) {
                                objQ10 = new o(p1Var10, null);
                                mVar2.K(objQ10);
                            }
                        }
                        MapEffectKt.MapEffect(bool, (e23.q<? super o53.b0, ? super MapView, ? super t13.d<? super Unit>, ? extends Object>) objQ10, mVar2, 0);
                        le2.b bVar2 = bVar;
                        boolean zB3 = mVar2.B(bVar2);
                        double d15 = d14;
                        boolean zM2 = zB3 | mVar2.m(d15);
                        Context context2 = context;
                        boolean zR = zM2 | mVar2.r(context2);
                        Object objQ11 = mVar2.q();
                        if (zR) {
                            q qVar = new q(p1Var9, bVar2, d15, context2, null);
                            mVar2.K(qVar);
                            objQ11 = qVar;
                        } else {
                            aVar.getClass();
                            if (objQ11 == p3.m.a.f135155b) {
                                q qVar2 = new q(p1Var9, bVar2, d15, context2, null);
                                mVar2.K(qVar2);
                                objQ11 = qVar2;
                            }
                        }
                        MapEffectKt.MapEffect(mapState, bVar2, str2, (e23.q) objQ11, mVar2, 0);
                        p1 p1Var11 = p1Var8;
                        Boolean boolValueOf2 = Boolean.valueOf(f0.b(p1Var11));
                        p1 p1Var12 = p1Var7;
                        Boolean bool2 = (Boolean) p1Var12.getF182175a();
                        bool2.booleanValue();
                        Integer numValueOf = Integer.valueOf(((Number) p1VarC.getF182175a()).intValue());
                        boolean zB4 = mVar2.B(p1Var11);
                        MapViewportState mapViewportState = r14;
                        boolean zB5 = zB4 | mVar2.B(mapViewportState);
                        e eVar4 = eVar;
                        boolean zR2 = zB5 | mVar2.r(eVar4);
                        e23.r rVar3 = rVar2;
                        boolean zB6 = zR2 | mVar2.B(rVar3);
                        Object objQ12 = mVar2.q();
                        if (zB6) {
                            r rVar4 = new r(mapViewportState, p1Var11, p1Var12, eVar4, rVar3, null);
                            mVar2.K(rVar4);
                            objQ12 = rVar4;
                        } else {
                            aVar.getClass();
                            if (objQ12 == p3.m.a.f135155b) {
                                r rVar5 = new r(mapViewportState, p1Var11, p1Var12, eVar4, rVar3, null);
                                mVar2.K(rVar5);
                                objQ12 = rVar5;
                            }
                        }
                        MapEffectKt.MapEffect(boolValueOf2, bool2, numValueOf, (e23.q) objQ12, mVar2, 0);
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, 3504, 54, 560);
            o0 o0Var2 = o0VarE;
            Boolean boolValueOf = Boolean.valueOf(z14);
            MapView mapView = (MapView) p1Var9.getF182175a();
            boolean zB2 = ((i17 & 57344) == 16384) | (i16 == 2048) | o0Var2.B(p1Var8) | o0Var2.r(eVar);
            Object objQ9 = o0Var2.q();
            if (zB2 || objQ9 == obj2) {
                p1Var2 = p1Var8;
                p1Var3 = p1Var9;
                Object sVar = new s(z14, bVar, eVar, p1Var3, p1Var2, null);
                o0Var2.K(sVar);
                objQ9 = sVar;
            } else {
                p1Var2 = p1Var8;
                p1Var3 = p1Var9;
            }
            l0.f(boolValueOf, mapView, (e23.p) objQ9, o0Var2);
            Boolean boolValueOf2 = Boolean.valueOf(z15);
            boolean zB3 = o0Var2.B(mapState) | ((i17 & 458752) == 131072);
            Object objQ10 = o0Var2.q();
            if (zB3 || objQ10 == obj2) {
                z17 = z15;
                objQ10 = new t(mapState, z17, null);
                o0Var2.K(objQ10);
            } else {
                z17 = z15;
            }
            l0.e((e23.p) objQ10, boolValueOf2, o0Var2);
            MapView mapView2 = (MapView) p1Var3.getF182175a();
            boolean zB4 = o0Var2.B(p1Var2) | ((i17 & 1879048192) == 536870912) | o0Var2.B(mapState);
            Object objQ11 = o0Var2.q();
            if (zB4 || objQ11 == obj2) {
                objQ11 = new u(p1Var3, mapState, p1Var2, lVar3, p1Var7, null);
                o0Var2.K(objQ11);
            }
            l0.e((e23.p) objQ11, mapView2, o0Var2);
            o0Var = o0Var2;
        } else {
            z17 = z15;
            o0 o0Var3 = o0VarE;
            o0Var3.e();
            o0Var = o0Var3;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            final boolean z19 = z17;
            p2VarI0.f135219d = new e23.p() { // from class: oe2.j
                @Override // e23.p
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    f0.a(rVar, eVar, lVar, bVar, z14, z19, z16, lVar2, rVar2, lVar3, (p3.m) obj3, p0.t(i14 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final boolean b(p1<Boolean> p1Var) {
        return p1Var.getF182175a().booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0180  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:81:0x0236  */
    /* JADX WARN: Code duplicated, block: B:82:0x0238  */
    /* JADX WARN: Code duplicated, block: B:86:0x0242  */
    /* JADX WARN: Code duplicated, block: B:89:0x025d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0260  */
    /* JADX WARN: Code duplicated, block: B:94:0x026a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [T, com.mapbox.maps.extension.compose.animation.viewport.MapViewportState] */
    public static final void c(h4.r rVar, e eVar, i53.c cVar, i53.c cVar2, List list, int i14, boolean z14, e23.a aVar, boolean z15, e23.l lVar, p3.m mVar, int i15) {
        p3.m.a.C2565a c2565a;
        Object objQ;
        boolean z16;
        Object objQ2;
        boolean z17;
        boolean z18;
        Object objQ3;
        boolean z19;
        Object objQ4;
        rVar.getClass();
        cVar.getClass();
        cVar2.getClass();
        list.getClass();
        o0 o0VarE = mVar.E(1546054057);
        int i16 = i15 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.r(eVar) ? 32 : 16) | (o0VarE.B(cVar) ? 256 : 128) | (o0VarE.B(cVar2) ? 2048 : 1024) | (o0VarE.r(list) ? 16384 : 8192) | (o0VarE.k(i14) ? 131072 : 65536) | (o0VarE.h(z14) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(aVar) ? 8388608 : 4194304) | (o0VarE.h(z15) ? 67108864 : 33554432) | (o0VarE.r(lVar) ? 536870912 : 268435456);
        if (o0VarE.n(i16 & 1, (i16 & 306783379) != 306783378)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ5 = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
            if (objQ5 == c2565a2) {
                objQ5 = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ5);
            }
            o53.b0 b0Var = (o53.b0) objQ5;
            g gVar = new g(1);
            o0VarE.L(-231233878);
            MapState mapState = (MapState) d4.a.d(new Object[0], MapState.INSTANCE.getSaver(), null, new v(gVar), o0VarE, 72, 0);
            o0VarE.g0(false);
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a2) {
                objQ6 = p0.n(null);
                o0VarE.K(objQ6);
            }
            p1 p1Var = (p1) objQ6;
            ?? r14 = (MapViewportState) d4.a.c(Arrays.copyOf(new Object[]{eVar}, 1), MapViewportState.INSTANCE.getSaver(), new e0(new dt1.d(eVar, b0Var, list, z15, 4)), o0VarE, 0);
            if (eVar.f98598b == 0) {
                eVar.f98598b = r14;
            }
            boolean z24 = (i16 & 458752) == 131072;
            Object objQ7 = o0VarE.q();
            if (z24) {
                c2565a = c2565a2;
            } else {
                c2565a = c2565a2;
                if (objQ7 == c2565a) {
                }
                p1 p1Var2 = (p1) objQ7;
                objQ = o0VarE.q();
                if (objQ == c2565a) {
                    MapOptions mapOptionsBuild = MapInitOptionsKt.applyDefaultParams(new MapOptions.Builder(), context).build();
                    mapOptionsBuild.getClass();
                    objQ = new ComposeMapInitOptions(mapOptionsBuild, false, 0, (String) null, 14, (p005kotlin.jvm.internal.j) null);
                    o0VarE.K(objQ);
                }
                ComposeMapInitOptions composeMapInitOptions = (ComposeMapInitOptions) objQ;
                TerrainState terrainStateG = g((String) p1Var2.getF182175a(), o0VarE);
                if ((i16 & 29360128) == 8388608) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objQ2 = o0VarE.q();
                if (z16 || objQ2 == c2565a) {
                    objQ2 = new ne2.e(aVar, 1);
                    o0VarE.K(objQ2);
                }
                a.f131445a.getClass();
                MapboxMapKt.MapboxMap(rVar, composeMapInitOptions, a.f131448d, a.f131449e, null, null, r14, mapState, (OnMapClickListener) objQ2, null, z3.f.c(82127678, new mw0.i(28, p1Var2, terrainStateG), o0VarE), z3.f.c(-1486334230, new g82.d(mapState, cVar, cVar2, (MapViewportState) r14, context, z15, p1Var2, p1Var), o0VarE), o0VarE, (i16 & 14) | 3504, 54, 560);
                o0VarE = o0VarE;
                Boolean boolValueOf = Boolean.valueOf(z14);
                boolean zB = o0VarE.B(mapState);
                if ((i16 & 3670016) == 1048576) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = zB | z17;
                objQ3 = o0VarE.q();
                if (z18 || objQ3 == c2565a) {
                    objQ3 = new y(mapState, z14, null);
                    o0VarE.K(objQ3);
                }
                l0.e((e23.p) objQ3, boolValueOf, o0VarE);
                MapView mapView = (MapView) p1Var.getF182175a();
                if ((i16 & 1879048192) == 536870912) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                objQ4 = o0VarE.q();
                if (z19 || objQ4 == c2565a) {
                    objQ4 = new z(p1Var, lVar, null);
                    o0VarE.K(objQ4);
                }
                l0.e((e23.p) objQ4, mapView, o0VarE);
            }
            objQ7 = p0.n(ne2.p.b(com.garmin.android.library.mapsdkadapter.i.e.f50297a, i14));
            o0VarE.K(objQ7);
            p1 p1Var3 = (p1) objQ7;
            objQ = o0VarE.q();
            if (objQ == c2565a) {
                MapOptions mapOptionsBuild2 = MapInitOptionsKt.applyDefaultParams(new MapOptions.Builder(), context).build();
                mapOptionsBuild2.getClass();
                objQ = new ComposeMapInitOptions(mapOptionsBuild2, false, 0, (String) null, 14, (p005kotlin.jvm.internal.j) null);
                o0VarE.K(objQ);
            }
            ComposeMapInitOptions composeMapInitOptions2 = (ComposeMapInitOptions) objQ;
            TerrainState terrainStateG2 = g((String) p1Var3.getF182175a(), o0VarE);
            if ((i16 & 29360128) == 8388608) {
                z16 = true;
            } else {
                z16 = false;
            }
            objQ2 = o0VarE.q();
            if (z16) {
                objQ2 = new ne2.e(aVar, 1);
                o0VarE.K(objQ2);
            } else {
                objQ2 = new ne2.e(aVar, 1);
                o0VarE.K(objQ2);
            }
            a.f131445a.getClass();
            MapboxMapKt.MapboxMap(rVar, composeMapInitOptions2, a.f131448d, a.f131449e, null, null, r14, mapState, (OnMapClickListener) objQ2, null, z3.f.c(82127678, new mw0.i(28, p1Var3, terrainStateG2), o0VarE), z3.f.c(-1486334230, new g82.d(mapState, cVar, cVar2, (MapViewportState) r14, context, z15, p1Var3, p1Var), o0VarE), o0VarE, (i16 & 14) | 3504, 54, 560);
            o0VarE = o0VarE;
            Boolean boolValueOf2 = Boolean.valueOf(z14);
            boolean zB2 = o0VarE.B(mapState);
            if ((i16 & 3670016) == 1048576) {
                z17 = true;
            } else {
                z17 = false;
            }
            z18 = zB2 | z17;
            objQ3 = o0VarE.q();
            if (z18) {
                objQ3 = new y(mapState, z14, null);
                o0VarE.K(objQ3);
            } else {
                objQ3 = new y(mapState, z14, null);
                o0VarE.K(objQ3);
            }
            l0.e((e23.p) objQ3, boolValueOf2, o0VarE);
            MapView mapView2 = (MapView) p1Var.getF182175a();
            if ((i16 & 1879048192) == 536870912) {
                z19 = true;
            } else {
                z19 = false;
            }
            objQ4 = o0VarE.q();
            if (z19) {
                objQ4 = new z(p1Var, lVar, null);
                o0VarE.K(objQ4);
            } else {
                objQ4 = new z(p1Var, lVar, null);
                o0VarE.K(objQ4);
            }
            l0.e((e23.p) objQ4, mapView2, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b(rVar, eVar, cVar, cVar2, list, i14, z14, aVar, z15, lVar, i15);
        }
    }

    public static final void d(p1 p1Var, boolean z14) {
        p1Var.setValue(Boolean.valueOf(z14));
    }

    public static final void e(Context context, Style style, List list, boolean z14) {
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        Iterator it = list.iterator();
        int i14 = 0;
        while (true) {
            SymbolLayer symbolLayer = null;
            if (!it.hasNext()) {
                FeatureCollection featureCollectionFromFeatures = FeatureCollection.fromFeatures(arrayList);
                Source source = SourceUtils.getSource(style, "cluster-source");
                GeoJsonSource geoJsonSource = source instanceof GeoJsonSource ? (GeoJsonSource) source : null;
                if (geoJsonSource == null || !p005kotlin.jvm.internal.s.g(geoJsonSource.getCluster(), Boolean.valueOf(z14))) {
                    style.removeStyleLayer("unclustered-layer");
                    style.removeStyleLayer("clustered-layer");
                    style.removeStyleSource("cluster-source");
                    SourceUtils.addSource(style, GeoJsonSourceKt.geoJsonSource("cluster-source", new as2.d(featureCollectionFromFeatures, z14, 14)));
                } else {
                    featureCollectionFromFeatures.getClass();
                    GeoJsonSource.featureCollection$default(geoJsonSource, featureCollectionFromFeatures, null, 2, null);
                }
                Layer layer = LayerUtils.getLayer(style, "unclustered-layer");
                SymbolLayer symbolLayer2 = layer instanceof SymbolLayer ? (SymbolLayer) layer : null;
                if (symbolLayer2 == null) {
                    symbolLayer2 = SymbolLayerKt.symbolLayer("unclustered-layer", "cluster-source", new z0(26));
                    LayerUtils.addPersistentLayer$default(style, symbolLayer2, null, 2, null);
                }
                Expression.Companion companion = Expression.INSTANCE;
                symbolLayer2.filter(companion.not(companion.has("cluster")));
                symbolLayer2.iconImage(companion.get("icon-id"));
                symbolLayer2.iconSize(1.0d);
                symbolLayer2.iconAllowOverlap(true);
                symbolLayer2.iconIgnorePlacement(true);
                symbolLayer2.symbolSortKey(companion.get("z_index"));
                Layer layer2 = LayerUtils.getLayer(style, "clustered-layer");
                SymbolLayer symbolLayer3 = layer2 instanceof SymbolLayer ? (SymbolLayer) layer2 : null;
                if (symbolLayer3 == null && z14) {
                    Bitmap bitmapA = ne2.p.a(R.drawable.cluster_icon, context);
                    if (bitmapA != null) {
                        style.addImage("cluster-icon-id", bitmapA);
                    }
                    SymbolLayer symbolLayer4 = SymbolLayerKt.symbolLayer("clustered-layer", "cluster-source", new z0(27));
                    LayerUtils.addPersistentLayer$default(style, symbolLayer4, null, 2, null);
                    symbolLayer = symbolLayer4;
                } else if (z14) {
                    symbolLayer = symbolLayer3;
                } else {
                    style.removeStyleLayer("clustered-layer");
                }
                if (symbolLayer != null) {
                    symbolLayer.filter(companion.has("cluster"));
                    symbolLayer.iconImage("cluster-icon-id");
                    symbolLayer.iconSize(1.0d);
                    symbolLayer.textField(companion.get("point_count"));
                    symbolLayer.textSize(12.0d);
                    symbolLayer.textColor(-1);
                    symbolLayer.textOffset(p13.x.k(Double.valueOf(0.0d), Double.valueOf(-0.5d)));
                    symbolLayer.iconAllowOverlap(true);
                    symbolLayer.iconIgnorePlacement(true);
                    return;
                }
                return;
            }
            Object next = it.next();
            int i15 = i14 + 1;
            if (i14 < 0) {
                p13.x.q();
                throw null;
            }
            le2.c cVar = (le2.c) next;
            String strH = am.j.h(i14, "uncluster-icon-");
            Bitmap bitmap = cVar.f112059b;
            if (bitmap != null) {
                style.addImage(strH, bitmap);
            }
            ke2.b bVar = cVar.f112058a;
            Point pointFromLngLat = Point.fromLngLat(bVar.f104552b, bVar.f104551a);
            pointFromLngLat.getClass();
            Feature featureFromGeometry = Feature.fromGeometry(pointFromLngLat);
            featureFromGeometry.addStringProperty("icon-id", strH);
            featureFromGeometry.addNumberProperty("z_index", Float.valueOf(cVar.f112061d));
            arrayList.add(featureFromGeometry);
            i14 = i15;
        }
    }

    public static final void f(Style style, List list, double d14) {
        String str;
        String str2;
        String str3;
        LineLayer lineLayer;
        int i14 = 10;
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        Iterator it = list.iterator();
        while (true) {
            str = "polyline-source-";
            if (!it.hasNext()) {
                break;
            }
            arrayList.add("polyline-source-" + ((le2.d) it.next()).f112062a);
        }
        List<StyleObjectInfo> styleSources = style.getStyleSources();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : styleSources) {
            if (!arrayList.contains(((StyleObjectInfo) obj).getId())) {
                arrayList2.add(obj);
            }
        }
        ArrayList<StyleObjectInfo> arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            String id3 = ((StyleObjectInfo) obj2).getId();
            id3.getClass();
            if (d53.u.y(id3, "polyline-source-", false)) {
                arrayList3.add(obj2);
            }
        }
        for (StyleObjectInfo styleObjectInfo : arrayList3) {
            String id4 = styleObjectInfo.getId();
            id4.getClass();
            if (style.styleSourceExists(id4)) {
                String id5 = styleObjectInfo.getId();
                id5.getClass();
                style.removeStyleSource(id5);
            }
        }
        ArrayList arrayList4 = new ArrayList(p13.y.r(list, 10));
        Iterator it3 = list.iterator();
        while (true) {
            str2 = "polyline-layer-";
            if (!it3.hasNext()) {
                break;
            }
            arrayList4.add("polyline-layer-" + ((le2.d) it3.next()).f112062a);
        }
        List<StyleObjectInfo> styleLayers = style.getStyleLayers();
        ArrayList arrayList5 = new ArrayList();
        for (Object obj3 : styleLayers) {
            if (!arrayList4.contains(((StyleObjectInfo) obj3).getId())) {
                arrayList5.add(obj3);
            }
        }
        ArrayList<StyleObjectInfo> arrayList6 = new ArrayList();
        for (Object obj4 : arrayList5) {
            String id6 = ((StyleObjectInfo) obj4).getId();
            id6.getClass();
            if (d53.u.y(id6, "polyline-layer-", false)) {
                arrayList6.add(obj4);
            }
        }
        for (StyleObjectInfo styleObjectInfo2 : arrayList6) {
            String id7 = styleObjectInfo2.getId();
            id7.getClass();
            if (style.styleLayerExists(id7)) {
                String id8 = styleObjectInfo2.getId();
                id8.getClass();
                style.removeStyleLayer(id8);
            }
        }
        ArrayList arrayList7 = new ArrayList(p13.y.r(list, 10));
        Iterator it4 = list.iterator();
        while (true) {
            str3 = "polyline-border-";
            if (!it4.hasNext()) {
                break;
            }
            arrayList7.add("polyline-border-" + ((le2.d) it4.next()).f112062a);
        }
        List<StyleObjectInfo> styleLayers2 = style.getStyleLayers();
        ArrayList arrayList8 = new ArrayList();
        for (Object obj5 : styleLayers2) {
            if (!arrayList7.contains(((StyleObjectInfo) obj5).getId())) {
                arrayList8.add(obj5);
            }
        }
        ArrayList<StyleObjectInfo> arrayList9 = new ArrayList();
        for (Object obj6 : arrayList8) {
            String id9 = ((StyleObjectInfo) obj6).getId();
            id9.getClass();
            if (d53.u.y(id9, "polyline-border-", false)) {
                arrayList9.add(obj6);
            }
        }
        for (StyleObjectInfo styleObjectInfo3 : arrayList9) {
            String id10 = styleObjectInfo3.getId();
            id10.getClass();
            if (style.styleLayerExists(id10)) {
                String id11 = styleObjectInfo3.getId();
                id11.getClass();
                style.removeStyleLayer(id11);
            }
        }
        Iterator it5 = h0.N0(list, new b0()).iterator();
        while (it5.hasNext()) {
            le2.d dVar = (le2.d) it5.next();
            long j8 = dVar.f112062a;
            float f14 = dVar.f112068g;
            String strE = org.apache.commons.lang3.e.e(j8, str);
            String strE2 = org.apache.commons.lang3.e.e(j8, str2);
            String strE3 = org.apache.commons.lang3.e.e(j8, str3);
            i53.c<ke2.b> cVar = dVar.f112063b;
            ArrayList arrayList10 = new ArrayList(p13.y.r(cVar, i14));
            Iterator<ke2.b> it6 = cVar.iterator();
            while (it6.hasNext()) {
                arrayList10.add(ne2.p.i(it6.next()));
            }
            Feature featureFromGeometry = Feature.fromGeometry(LineString.fromLngLats(arrayList10));
            Source source = SourceUtils.getSource(style, strE);
            GeoJsonSource geoJsonSource = source instanceof GeoJsonSource ? (GeoJsonSource) source : null;
            if (geoJsonSource == null) {
                SourceUtils.addSource(style, GeoJsonSourceKt.geoJsonSource(strE, new nw0.f(featureFromGeometry, 11)));
            } else {
                featureFromGeometry.getClass();
                GeoJsonSource.feature$default(geoJsonSource, featureFromGeometry, null, 2, null);
            }
            Layer layer = LayerUtils.getLayer(style, strE2);
            LineLayer lineLayer2 = layer instanceof LineLayer ? (LineLayer) layer : null;
            Layer layer2 = LayerUtils.getLayer(style, strE3);
            LineLayer lineLayer3 = layer2 instanceof LineLayer ? (LineLayer) layer2 : null;
            e23.p<Float, com.garmin.android.library.mapsdkadapter.i.d, Float> pVar = dVar.f112064c;
            float f15 = (float) d14;
            Iterator it7 = it5;
            Float fValueOf = Float.valueOf(f15);
            com.garmin.android.library.mapsdkadapter.i.d dVar2 = com.garmin.android.library.mapsdkadapter.i.d.MAPBOX;
            float fFloatValue = pVar.invoke(fValueOf, dVar2).floatValue();
            LineLayer lineLayer4 = lineLayer2;
            String str4 = str;
            double d15 = fFloatValue;
            String str5 = str2;
            float fFloatValue2 = dVar.f112066e.invoke(Float.valueOf(f15), dVar2).floatValue();
            String str6 = str3;
            double d16 = ((double) fFloatValue2) + d15;
            if (lineLayer3 == null && d16 > 0.0d) {
                lineLayer3 = LineLayerKt.lineLayer(strE3, strE, new z0(28));
                LayerUtils.addPersistentLayer$default(style, lineLayer3, null, 2, null);
            }
            if (lineLayer3 != null) {
                lineLayer3.lineColor(ColorUtils.INSTANCE.colorToRgbaString(dVar.f112067f));
                lineLayer3.lineWidth(d16);
                lineLayer3.lineCap(LineCap.ROUND);
                lineLayer3.lineJoin(LineJoin.ROUND);
                lineLayer3.lineSortKey(((double) f14) - ((double) 1.0f));
            }
            if (lineLayer4 == null) {
                lineLayer = LineLayerKt.lineLayer(strE2, strE, new z0(29));
                LayerUtils.addPersistentLayer$default(style, lineLayer, null, 2, null);
            } else {
                lineLayer = lineLayer4;
            }
            lineLayer.lineColor(ColorUtils.INSTANCE.colorToRgbaString(dVar.f112065d));
            lineLayer.lineWidth(d15);
            lineLayer.lineCap(LineCap.ROUND);
            lineLayer.lineJoin(LineJoin.ROUND);
            lineLayer.lineSortKey(f14);
            str = str4;
            it5 = it7;
            str3 = str6;
            str2 = str5;
            i14 = 10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final TerrainState g(String str, p3.m mVar) {
        str.getClass();
        x1 x1Var = p3.n.f135158a;
        if (!str.equals(Style.OUTDOORS)) {
            mVar.C(652668054);
            mVar.f();
            return TerrainState.DISABLED;
        }
        mVar.C(652174689);
        mVar.L(2081338773);
        mVar.L(-492369756);
        Object objQ = mVar.q();
        p3.m.f135153a.getClass();
        p3.m.a.C2565a c2565a = p3.m.a.f135155b;
        if (objQ == c2565a) {
            objQ = IdGenerator.INSTANCE.generateRandomSourceId("raster-dem");
            mVar.K(objQ);
        }
        mVar.R();
        RasterDemSourceState rasterDemSourceState = (RasterDemSourceState) d4.a.d(new Object[0], RasterDemSourceState.INSTANCE.getSaver(), null, new c0((String) objQ), mVar, 72, 0);
        mVar.R();
        rasterDemSourceState.setUrl(new StringValue("mapbox://mapbox.mapbox-terrain-dem-v1"));
        rasterDemSourceState.setTileSize(new LongValue(514L));
        z0 z0Var = new z0(25);
        mVar.L(2126220653);
        TerrainState.Companion companion = TerrainState.INSTANCE;
        TerrainState terrainState = (TerrainState) d4.a.d(new Object[0], companion.getSaver(), null, new d0(rasterDemSourceState, z0Var), mVar, 72, 0);
        mVar.R();
        Object[] objArr = new Object[0];
        d4.k<TerrainState, TerrainState.Holder> saver = companion.getSaver();
        boolean zB = mVar.B(terrainState);
        Object objQ2 = mVar.q();
        if (zB || objQ2 == c2565a) {
            objQ2 = new n82.i(terrainState, 19);
            mVar.K(objQ2);
        }
        TerrainState terrainState2 = (TerrainState) d4.a.f(objArr, saver, (e23.a) objQ2, mVar, 0).getF182175a();
        mVar.f();
        return terrainState2;
    }
}
