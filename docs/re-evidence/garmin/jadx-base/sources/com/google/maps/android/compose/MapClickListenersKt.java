package com.google.maps.android.compose;

import android.location.Location;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.IndoorBuilding;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PointOfInterest;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001aM\u0010\u000b\u001a\u00020\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00052\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00000\u00072\u0006\u0010\n\u001a\u00028\u0000H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a1\u0010\u000b\u001a\u00020\u00002\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00052\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\u0005H\u0003¢\u0006\u0004\b\u000b\u0010\u000f¨\u0006\u0010"}, d2 = {"", "MapClickListenerUpdater", "(Lp3/m;I)V", "", "L", "Lkotlin/Function0;", "callback", "Lkotlin/Function2;", "Lcom/google/android/gms/maps/GoogleMap;", "setter", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "MapClickListenerComposeNode", "(Le23/a;Le23/p;Ljava/lang/Object;Lp3/m;I)V", "Lcom/google/maps/android/compose/MapClickListenerNode;", "factory", "(Le23/a;Le23/a;Lp3/m;I)V", "maps-compose_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class MapClickListenersKt {
    @GoogleMapComposable
    private static final void MapClickListenerComposeNode(e23.a<? extends Object> aVar, e23.a<? extends MapClickListenerNode<?>> aVar2, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(-1042600347);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar2) ? 32 : 16;
        }
        if ((i15 & 19) == 18 && o0VarE.b()) {
            o0VarE.e();
        } else {
            x1 x1Var = p3.n.f135158a;
            if (aVar.invoke() != null) {
                if (!(o0VarE.f135177b instanceof MapApplier)) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.H();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                o0VarE.g0(true);
            }
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l(aVar, aVar2, i14, 0, (byte) 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MapClickListenerNode MapClickListenerComposeNode$lambda$29$lambda$28(MapApplier mapApplier, e23.p pVar, Object obj) {
        return new MapClickListenerNode(mapApplier.getMap(), pVar, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MapClickListenerComposeNode$lambda$31(e23.a aVar, e23.a aVar2, int i14, p3.m mVar, int i15) {
        MapClickListenerComposeNode(aVar, aVar2, mVar, p3.p0.t(i14 | 1));
        return Unit.INSTANCE;
    }

    public static final void MapClickListenerUpdater(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(1792062778);
        if (i14 == 0 && o0VarE.b()) {
            o0VarE.e();
        } else {
            x1 x1Var = p3.n.f135158a;
            p3.c<?> cVar = o0VarE.f135177b;
            cVar.getClass();
            final MapClickListeners mapClickListeners = ((MapApplier) cVar).getMapClickListeners();
            o0VarE.C(1577826274);
            final p005kotlin.jvm.internal.z zVar = new p005kotlin.jvm.internal.z(mapClickListeners) { // from class: com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$1
                @Override // p005kotlin.jvm.internal.z, k23.m
                public Object get() {
                    return ((MapClickListeners) this.receiver).getIndoorStateChangeListener();
                }

                @Override // p005kotlin.jvm.internal.z, k23.i
                public void set(Object obj) {
                    ((MapClickListeners) this.receiver).setIndoorStateChangeListener((IndoorStateChangeListener) obj);
                }
            };
            o0VarE.C(-568962266);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = MapClickListenersKt$MapClickListenerUpdater$1$2$1$1.INSTANCE;
                o0VarE.K(objQ);
            }
            int i15 = 0;
            o0VarE.g0(false);
            MapClickListenerComposeNode(zVar, (e23.p) ((k23.g) objQ), new GoogleMap.OnIndoorStateChangeListener() { // from class: com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$2$2
                @Override // com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener
                public void onIndoorBuildingFocused() {
                    zVar.invoke().onIndoorBuildingFocused();
                }

                @Override // com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener
                public void onIndoorLevelActivated(IndoorBuilding building) {
                    building.getClass();
                    zVar.invoke().onIndoorLevelActivated(building);
                }
            }, o0VarE, 48);
            o0VarE.g0(false);
            o0VarE.C(1577843195);
            p005kotlin.jvm.internal.z zVar2 = new p005kotlin.jvm.internal.z(mapClickListeners) { // from class: com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$3
                @Override // p005kotlin.jvm.internal.z, k23.m
                public Object get() {
                    return ((MapClickListeners) this.receiver).getOnMapClick();
                }

                @Override // p005kotlin.jvm.internal.z, k23.i
                public void set(Object obj) {
                    ((MapClickListeners) this.receiver).setOnMapClick((e23.l) obj);
                }
            };
            o0VarE.C(-568945059);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = MapClickListenersKt$MapClickListenerUpdater$1$4$1$1.INSTANCE;
                o0VarE.K(objQ2);
            }
            o0VarE.g0(false);
            e23.p pVar = (e23.p) ((k23.g) objQ2);
            o0VarE.C(-568943446);
            boolean zR = o0VarE.r(zVar2);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                objQ3 = new m(zVar2, i15);
                o0VarE.K(objQ3);
            }
            o0VarE.g0(false);
            MapClickListenerComposeNode(zVar2, pVar, (GoogleMap.OnMapClickListener) objQ3, o0VarE, 48);
            o0VarE.g0(false);
            o0VarE.C(1577851107);
            p005kotlin.jvm.internal.z zVar3 = new p005kotlin.jvm.internal.z(mapClickListeners) { // from class: com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$5
                @Override // p005kotlin.jvm.internal.z, k23.m
                public Object get() {
                    return ((MapClickListeners) this.receiver).getOnMapLongClick();
                }

                @Override // p005kotlin.jvm.internal.z, k23.i
                public void set(Object obj) {
                    ((MapClickListeners) this.receiver).setOnMapLongClick((e23.l) obj);
                }
            };
            o0VarE.C(-568937151);
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = MapClickListenersKt$MapClickListenerUpdater$1$6$1$1.INSTANCE;
                o0VarE.K(objQ4);
            }
            o0VarE.g0(false);
            e23.p pVar2 = (e23.p) ((k23.g) objQ4);
            o0VarE.C(-568935410);
            boolean zR2 = o0VarE.r(zVar3);
            Object objQ5 = o0VarE.q();
            if (zR2 || objQ5 == c2565a) {
                objQ5 = new n(zVar3, i15);
                o0VarE.K(objQ5);
            }
            o0VarE.g0(false);
            MapClickListenerComposeNode(zVar3, pVar2, (GoogleMap.OnMapLongClickListener) objQ5, o0VarE, 48);
            o0VarE.g0(false);
            o0VarE.C(1577859163);
            p005kotlin.jvm.internal.z zVar4 = new p005kotlin.jvm.internal.z(mapClickListeners) { // from class: com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$7
                @Override // p005kotlin.jvm.internal.z, k23.m
                public Object get() {
                    return ((MapClickListeners) this.receiver).getOnMapLoaded();
                }

                @Override // p005kotlin.jvm.internal.z, k23.i
                public void set(Object obj) {
                    ((MapClickListeners) this.receiver).setOnMapLoaded((e23.a) obj);
                }
            };
            o0VarE.C(-568929090);
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a) {
                objQ6 = MapClickListenersKt$MapClickListenerUpdater$1$8$1$1.INSTANCE;
                o0VarE.K(objQ6);
            }
            o0VarE.g0(false);
            e23.p pVar3 = (e23.p) ((k23.g) objQ6);
            o0VarE.C(-568927447);
            boolean zR3 = o0VarE.r(zVar4);
            Object objQ7 = o0VarE.q();
            if (zR3 || objQ7 == c2565a) {
                objQ7 = new o(zVar4, i15);
                o0VarE.K(objQ7);
            }
            o0VarE.g0(false);
            MapClickListenerComposeNode(zVar4, pVar3, (GoogleMap.OnMapLoadedCallback) objQ7, o0VarE, 48);
            o0VarE.g0(false);
            o0VarE.C(1577867388);
            final p005kotlin.jvm.internal.z zVar5 = new p005kotlin.jvm.internal.z(mapClickListeners) { // from class: com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$9
                @Override // p005kotlin.jvm.internal.z, k23.m
                public Object get() {
                    return ((MapClickListeners) this.receiver).getOnMyLocationButtonClick();
                }

                @Override // p005kotlin.jvm.internal.z, k23.i
                public void set(Object obj) {
                    ((MapClickListeners) this.receiver).setOnMyLocationButtonClick((e23.a) obj);
                }
            };
            o0VarE.C(-568920886);
            Object objQ8 = o0VarE.q();
            if (objQ8 == c2565a) {
                objQ8 = MapClickListenersKt$MapClickListenerUpdater$1$10$1$1.INSTANCE;
                o0VarE.K(objQ8);
            }
            o0VarE.g0(false);
            e23.p pVar4 = (e23.p) ((k23.g) objQ8);
            o0VarE.C(-568918850);
            boolean zR4 = o0VarE.r(zVar5);
            Object objQ9 = o0VarE.q();
            if (zR4 || objQ9 == c2565a) {
                objQ9 = new GoogleMap.OnMyLocationButtonClickListener() { // from class: com.google.maps.android.compose.p
                    @Override // com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener
                    public final boolean onMyLocationButtonClick() {
                        return MapClickListenersKt.MapClickListenerUpdater$lambda$26$lambda$17$lambda$16$lambda$15(zVar5);
                    }
                };
                o0VarE.K(objQ9);
            }
            o0VarE.g0(false);
            MapClickListenerComposeNode(zVar5, pVar4, (GoogleMap.OnMyLocationButtonClickListener) objQ9, o0VarE, 48);
            o0VarE.g0(false);
            o0VarE.C(1577876425);
            final p005kotlin.jvm.internal.z zVar6 = new p005kotlin.jvm.internal.z(mapClickListeners) { // from class: com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$11
                @Override // p005kotlin.jvm.internal.z, k23.m
                public Object get() {
                    return ((MapClickListeners) this.receiver).getOnMyLocationClick();
                }

                @Override // p005kotlin.jvm.internal.z, k23.i
                public void set(Object obj) {
                    ((MapClickListeners) this.receiver).setOnMyLocationClick((e23.l) obj);
                }
            };
            o0VarE.C(-568911836);
            Object objQ10 = o0VarE.q();
            if (objQ10 == c2565a) {
                objQ10 = MapClickListenersKt$MapClickListenerUpdater$1$12$1$1.INSTANCE;
                o0VarE.K(objQ10);
            }
            o0VarE.g0(false);
            e23.p pVar5 = (e23.p) ((k23.g) objQ10);
            o0VarE.C(-568909999);
            boolean zR5 = o0VarE.r(zVar6);
            Object objQ11 = o0VarE.q();
            if (zR5 || objQ11 == c2565a) {
                objQ11 = new GoogleMap.OnMyLocationClickListener() { // from class: com.google.maps.android.compose.q
                    @Override // com.google.android.gms.maps.GoogleMap.OnMyLocationClickListener
                    public final void onMyLocationClick(Location location) {
                        MapClickListenersKt.MapClickListenerUpdater$lambda$26$lambda$21$lambda$20$lambda$19(zVar6, location);
                    }
                };
                o0VarE.K(objQ11);
            }
            o0VarE.g0(false);
            MapClickListenerComposeNode(zVar6, pVar5, (GoogleMap.OnMyLocationClickListener) objQ11, o0VarE, 48);
            o0VarE.g0(false);
            o0VarE.C(1577884635);
            final p005kotlin.jvm.internal.z zVar7 = new p005kotlin.jvm.internal.z(mapClickListeners) { // from class: com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$13
                @Override // p005kotlin.jvm.internal.z, k23.m
                public Object get() {
                    return ((MapClickListeners) this.receiver).getOnPOIClick();
                }

                @Override // p005kotlin.jvm.internal.z, k23.i
                public void set(Object obj) {
                    ((MapClickListeners) this.receiver).setOnPOIClick((e23.l) obj);
                }
            };
            o0VarE.C(-568903619);
            Object objQ12 = o0VarE.q();
            if (objQ12 == c2565a) {
                objQ12 = MapClickListenersKt$MapClickListenerUpdater$1$14$1$1.INSTANCE;
                o0VarE.K(objQ12);
            }
            o0VarE.g0(false);
            e23.p pVar6 = (e23.p) ((k23.g) objQ12);
            o0VarE.C(-568902006);
            boolean zR6 = o0VarE.r(zVar7);
            Object objQ13 = o0VarE.q();
            if (zR6 || objQ13 == c2565a) {
                objQ13 = new GoogleMap.OnPoiClickListener() { // from class: com.google.maps.android.compose.s
                    @Override // com.google.android.gms.maps.GoogleMap.OnPoiClickListener
                    public final void onPoiClick(PointOfInterest pointOfInterest) {
                        MapClickListenersKt.MapClickListenerUpdater$lambda$26$lambda$25$lambda$24$lambda$23(zVar7, pointOfInterest);
                    }
                };
                o0VarE.K(objQ13);
            }
            o0VarE.g0(false);
            MapClickListenerComposeNode(zVar7, pVar6, (GoogleMap.OnPoiClickListener) objQ13, o0VarE, 48);
            o0VarE.g0(false);
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ba2.e(i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MapClickListenerUpdater$lambda$26$lambda$13$lambda$12$lambda$11(k23.i iVar) {
        e23.a aVar = (e23.a) iVar.invoke();
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MapClickListenerUpdater$lambda$26$lambda$17$lambda$16$lambda$15(k23.i iVar) {
        e23.a aVar = (e23.a) iVar.invoke();
        if (aVar != null) {
            return ((Boolean) aVar.invoke()).booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MapClickListenerUpdater$lambda$26$lambda$21$lambda$20$lambda$19(k23.i iVar, Location location) {
        location.getClass();
        e23.l lVar = (e23.l) iVar.invoke();
        if (lVar != null) {
            lVar.invoke(location);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MapClickListenerUpdater$lambda$26$lambda$25$lambda$24$lambda$23(k23.i iVar, PointOfInterest pointOfInterest) {
        pointOfInterest.getClass();
        e23.l lVar = (e23.l) iVar.invoke();
        if (lVar != null) {
            lVar.invoke(pointOfInterest);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MapClickListenerUpdater$lambda$26$lambda$5$lambda$4$lambda$3(k23.i iVar, LatLng latLng) {
        latLng.getClass();
        e23.l lVar = (e23.l) iVar.invoke();
        if (lVar != null) {
            lVar.invoke(latLng);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MapClickListenerUpdater$lambda$26$lambda$9$lambda$8$lambda$7(k23.i iVar, LatLng latLng) {
        latLng.getClass();
        e23.l lVar = (e23.l) iVar.invoke();
        if (lVar != null) {
            lVar.invoke(latLng);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MapClickListenerUpdater$lambda$27(int i14, p3.m mVar, int i15) {
        MapClickListenerUpdater(mVar, p3.p0.t(i14 | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0056  */
    private static final <L> void MapClickListenerComposeNode(e23.a<? extends Object> aVar, e23.p<? super GoogleMap, ? super L, Unit> pVar, L l14, p3.m mVar, int i14) {
        mVar.C(-649632125);
        x1 x1Var = p3.n.f135158a;
        p3.c<?> cVarF = mVar.F();
        cVarF.getClass();
        MapApplier mapApplier = (MapApplier) cVarF;
        mVar.C(1495685668);
        boolean zR = mVar.r(mapApplier) | ((((i14 & 112) ^ 48) > 32 && mVar.B(pVar)) || (i14 & 48) == 32) | ((((i14 & 896) ^ 384) > 256 && mVar.r(l14)) || (i14 & 384) == 256);
        Object objQ = mVar.q();
        if (!zR) {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new ak0.m(mapApplier, 26, pVar, l14);
                mVar.K(objQ);
            }
        } else {
            objQ = new ak0.m(mapApplier, 26, pVar, l14);
            mVar.K(objQ);
        }
        mVar.f();
        MapClickListenerComposeNode(aVar, (e23.a) objQ, mVar, i14 & 14);
        mVar.f();
    }
}
