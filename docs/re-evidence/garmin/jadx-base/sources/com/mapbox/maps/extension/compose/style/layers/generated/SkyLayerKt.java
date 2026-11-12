package com.mapbox.maps.extension.compose.style.layers.generated;

import com.mapbox.maps.extension.compose.MapboxMapComposable;
import com.mapbox.maps.extension.compose.internal.MapApplier;
import com.mapbox.maps.extension.compose.style.IdGenerator;
import com.mapbox.maps.extension.compose.style.layers.internal.LayerNode;
import com.mapbox.maps.p;
import e23.a;
import e23.l;
import i3.e5;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.b4;
import p3.c;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p3.z;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a3\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0014\b\u0004\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0007H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"", "layerId", "Lcom/mapbox/maps/extension/compose/style/layers/generated/SkyLayerState;", "skyLayerState", "", "SkyLayer", "(Ljava/lang/String;Lcom/mapbox/maps/extension/compose/style/layers/generated/SkyLayerState;Lp3/m;II)V", "Lkotlin/Function1;", "init", "(Ljava/lang/String;Le23/l;Lp3/m;II)V", "extension-compose_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class SkyLayerKt {
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:34:0x006c  */
    /* JADX WARN: Code duplicated, block: B:36:0x007e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0081  */
    /* JADX WARN: Code duplicated, block: B:40:0x0089  */
    /* JADX WARN: Code duplicated, block: B:42:0x0097  */
    /* JADX WARN: Code duplicated, block: B:45:0x009f  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fe A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:57:0x0100  */
    /* JADX WARN: Code duplicated, block: B:60:0x0117  */
    /* JADX WARN: Code duplicated, block: B:62:0x011e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0122  */
    /* JADX WARN: Code duplicated, block: B:67:0x0144 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:68:0x0145  */
    /* JADX WARN: Code duplicated, block: B:70:0x014d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0151  */
    @MapboxMapComposable
    public static final void SkyLayer(String str, SkyLayerState skyLayerState, m mVar, int i14, int i15) {
        String str2;
        int i16;
        SkyLayerState skyLayerState2;
        m.a aVar;
        String str3;
        SkyLayerState skyLayerState3;
        MapApplier mapApplier;
        Object objG;
        Object obj;
        b0 b0Var;
        Object objQ;
        LayerNode layerNode;
        boolean zB;
        Object objQ2;
        a aVar2;
        Object objK;
        Object objK2;
        SkyLayerState skyLayerState4;
        p2 p2VarI0;
        o0 o0VarE = mVar.E(1372442818);
        c<?> cVar = o0VarE.f135177b;
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 6;
            str2 = str;
        } else if ((i14 & 14) == 0) {
            str2 = str;
            i16 = (o0VarE.B(str2) ? 4 : 2) | i14;
        } else {
            str2 = str;
            i16 = i14;
        }
        int i18 = i15 & 2;
        if (i18 == 0) {
            if ((i14 & 112) == 0) {
                skyLayerState2 = skyLayerState;
                i16 |= o0VarE.B(skyLayerState2) ? 32 : 16;
            }
            if ((i16 & 91) == 18 || !o0VarE.b()) {
                aVar = m.f135153a;
                if (i17 != 0) {
                    objK2 = fb1.c.k(o0VarE, -492369756, aVar);
                    if (objK2 == m.a.f135155b) {
                        objK2 = IdGenerator.INSTANCE.generateRandomLayerId("sky");
                        o0VarE.K(objK2);
                    }
                    o0VarE.g0(false);
                    str3 = (String) objK2;
                } else {
                    str3 = str2;
                }
                if (i18 != 0) {
                    objK = fb1.c.k(o0VarE, -492369756, aVar);
                    if (objK == m.a.f135155b) {
                        objK = new SkyLayerState();
                        o0VarE.K(objK);
                    }
                    o0VarE.g0(false);
                    skyLayerState3 = (SkyLayerState) objK;
                } else {
                    skyLayerState3 = skyLayerState2;
                }
                x1 x1Var = n.f135158a;
                if (cVar instanceof MapApplier) {
                    mapApplier = (MapApplier) cVar;
                } else {
                    mapApplier = null;
                }
                if (mapApplier == null) {
                    h.z("Illegal use of SkyLayer inside unsupported composable function");
                    return;
                }
                objG = p.g(o0VarE, 773894976, -492369756, aVar);
                obj = m.a.f135155b;
                if (objG == obj) {
                    objG = com.garmin.proto.generated.a.d(l0.j(t13.h.f161748a, o0VarE), o0VarE);
                }
                o0VarE.g0(false);
                b0Var = ((z) objG).f135391a;
                o0VarE.g0(false);
                o0VarE.L(-492369756);
                objQ = o0VarE.q();
                if (objQ == obj) {
                    Object layerNode2 = new LayerNode(mapApplier.getMapView().getMapboxMapDeprecated(), "sky", str3, null, b0Var, 8, null);
                    o0VarE.K(layerNode2);
                    objQ = layerNode2;
                }
                o0VarE.g0(false);
                layerNode = (LayerNode) objQ;
                o0VarE.L(1157296644);
                zB = o0VarE.B(layerNode);
                objQ2 = o0VarE.q();
                if (zB || objQ2 == obj) {
                    objQ2 = new SkyLayerKt$SkyLayer$3$1(layerNode);
                    o0VarE.K(objQ2);
                }
                o0VarE.g0(false);
                aVar2 = (a) objQ2;
                o0VarE.L(-548224868);
                if (!(cVar instanceof MapApplier)) {
                    p0.l();
                    throw null;
                }
                o0VarE.H();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.d(new SkyLayerKt$SkyLayer$4$1(str3), str3, o0VarE);
                o0VarE.N(126953761, skyLayerState3);
                skyLayerState3.UpdateProperties$extension_compose_release(layerNode, o0VarE, (i16 & 112) | 6);
                e5.u(o0VarE, false, true, false);
                skyLayerState4 = skyLayerState3;
            } else {
                o0VarE.e();
                str3 = str2;
                skyLayerState4 = skyLayerState2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 == null) {
                return;
            }
            p2VarI0.f135219d = new AnonymousClass6(str3, skyLayerState4, i14, i15);
        }
        i16 |= 48;
        skyLayerState2 = skyLayerState;
        if ((i16 & 91) == 18) {
            aVar = m.f135153a;
            if (i17 != 0) {
                objK2 = fb1.c.k(o0VarE, -492369756, aVar);
                if (objK2 == m.a.f135155b) {
                    objK2 = IdGenerator.INSTANCE.generateRandomLayerId("sky");
                    o0VarE.K(objK2);
                }
                o0VarE.g0(false);
                str3 = (String) objK2;
            } else {
                str3 = str2;
            }
            if (i18 != 0) {
                objK = fb1.c.k(o0VarE, -492369756, aVar);
                if (objK == m.a.f135155b) {
                    objK = new SkyLayerState();
                    o0VarE.K(objK);
                }
                o0VarE.g0(false);
                skyLayerState3 = (SkyLayerState) objK;
            } else {
                skyLayerState3 = skyLayerState2;
            }
            x1 x1Var2 = n.f135158a;
            if (cVar instanceof MapApplier) {
                mapApplier = (MapApplier) cVar;
            } else {
                mapApplier = null;
            }
            if (mapApplier == null) {
                h.z("Illegal use of SkyLayer inside unsupported composable function");
                return;
            }
            objG = p.g(o0VarE, 773894976, -492369756, aVar);
            obj = m.a.f135155b;
            if (objG == obj) {
                objG = com.garmin.proto.generated.a.d(l0.j(t13.h.f161748a, o0VarE), o0VarE);
            }
            o0VarE.g0(false);
            b0Var = ((z) objG).f135391a;
            o0VarE.g0(false);
            o0VarE.L(-492369756);
            objQ = o0VarE.q();
            if (objQ == obj) {
                Object layerNode3 = new LayerNode(mapApplier.getMapView().getMapboxMapDeprecated(), "sky", str3, null, b0Var, 8, null);
                o0VarE.K(layerNode3);
                objQ = layerNode3;
            }
            o0VarE.g0(false);
            layerNode = (LayerNode) objQ;
            o0VarE.L(1157296644);
            zB = o0VarE.B(layerNode);
            objQ2 = o0VarE.q();
            if (zB) {
                objQ2 = new SkyLayerKt$SkyLayer$3$1(layerNode);
                o0VarE.K(objQ2);
            } else {
                objQ2 = new SkyLayerKt$SkyLayer$3$1(layerNode);
                o0VarE.K(objQ2);
            }
            o0VarE.g0(false);
            aVar2 = (a) objQ2;
            o0VarE.L(-548224868);
            if (!(cVar instanceof MapApplier)) {
                p0.l();
                throw null;
            }
            o0VarE.H();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.d(new SkyLayerKt$SkyLayer$4$1(str3), str3, o0VarE);
            o0VarE.N(126953761, skyLayerState3);
            skyLayerState3.UpdateProperties$extension_compose_release(layerNode, o0VarE, (i16 & 112) | 6);
            e5.u(o0VarE, false, true, false);
            skyLayerState4 = skyLayerState3;
        } else {
            aVar = m.f135153a;
            if (i17 != 0) {
                objK2 = fb1.c.k(o0VarE, -492369756, aVar);
                if (objK2 == m.a.f135155b) {
                    objK2 = IdGenerator.INSTANCE.generateRandomLayerId("sky");
                    o0VarE.K(objK2);
                }
                o0VarE.g0(false);
                str3 = (String) objK2;
            } else {
                str3 = str2;
            }
            if (i18 != 0) {
                objK = fb1.c.k(o0VarE, -492369756, aVar);
                if (objK == m.a.f135155b) {
                    objK = new SkyLayerState();
                    o0VarE.K(objK);
                }
                o0VarE.g0(false);
                skyLayerState3 = (SkyLayerState) objK;
            } else {
                skyLayerState3 = skyLayerState2;
            }
            x1 x1Var3 = n.f135158a;
            if (cVar instanceof MapApplier) {
                mapApplier = (MapApplier) cVar;
            } else {
                mapApplier = null;
            }
            if (mapApplier == null) {
                h.z("Illegal use of SkyLayer inside unsupported composable function");
                return;
            }
            objG = p.g(o0VarE, 773894976, -492369756, aVar);
            obj = m.a.f135155b;
            if (objG == obj) {
                objG = com.garmin.proto.generated.a.d(l0.j(t13.h.f161748a, o0VarE), o0VarE);
            }
            o0VarE.g0(false);
            b0Var = ((z) objG).f135391a;
            o0VarE.g0(false);
            o0VarE.L(-492369756);
            objQ = o0VarE.q();
            if (objQ == obj) {
                Object layerNode4 = new LayerNode(mapApplier.getMapView().getMapboxMapDeprecated(), "sky", str3, null, b0Var, 8, null);
                o0VarE.K(layerNode4);
                objQ = layerNode4;
            }
            o0VarE.g0(false);
            layerNode = (LayerNode) objQ;
            o0VarE.L(1157296644);
            zB = o0VarE.B(layerNode);
            objQ2 = o0VarE.q();
            if (zB) {
                objQ2 = new SkyLayerKt$SkyLayer$3$1(layerNode);
                o0VarE.K(objQ2);
            } else {
                objQ2 = new SkyLayerKt$SkyLayer$3$1(layerNode);
                o0VarE.K(objQ2);
            }
            o0VarE.g0(false);
            aVar2 = (a) objQ2;
            o0VarE.L(-548224868);
            if (!(cVar instanceof MapApplier)) {
                p0.l();
                throw null;
            }
            o0VarE.H();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.d(new SkyLayerKt$SkyLayer$4$1(str3), str3, o0VarE);
            o0VarE.N(126953761, skyLayerState3);
            skyLayerState3.UpdateProperties$extension_compose_release(layerNode, o0VarE, (i16 & 112) | 6);
            e5.u(o0VarE, false, true, false);
            skyLayerState4 = skyLayerState3;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AnonymousClass6(str3, skyLayerState4, i14, i15);
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.layers.generated.SkyLayerKt$SkyLayer$6, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass6 extends w implements e23.p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ String $layerId;
        final /* synthetic */ SkyLayerState $skyLayerState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(String str, SkyLayerState skyLayerState, int i14, int i15) {
            super(2);
            this.$layerId = str;
            this.$skyLayerState = skyLayerState;
            this.$$changed = i14;
            this.$$default = i15;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            SkyLayerKt.SkyLayer(this.$layerId, this.$skyLayerState, mVar, this.$$changed | 1, this.$$default);
        }
    }

    @MapboxMapComposable
    public static final void SkyLayer(String str, l<? super SkyLayerState, Unit> lVar, m mVar, int i14, int i15) {
        lVar.getClass();
        mVar.L(1074536618);
        int i16 = i15 & 1;
        m.a aVar = m.f135153a;
        if (i16 != 0) {
            Object objF = p.f(mVar, -492369756, aVar);
            if (objF == m.a.f135155b) {
                objF = IdGenerator.INSTANCE.generateRandomLayerId("sky");
                mVar.K(objF);
            }
            mVar.R();
            str = (String) objF;
        }
        Object objF2 = p.f(mVar, -492369756, aVar);
        if (objF2 == m.a.f135155b) {
            objF2 = new SkyLayerState();
            mVar.K(objF2);
        }
        mVar.R();
        lVar.invoke(objF2);
        SkyLayer(str, (SkyLayerState) objF2, mVar, i14 & 14, 0);
        mVar.R();
    }
}
