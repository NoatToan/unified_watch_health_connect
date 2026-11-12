package com.google.maps.android.compose;

import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.TileOverlay;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.TileProvider;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.p2;
import p3.x1;
import r1.q2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aU\u0010\f\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00042\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0007¢\u0006\u0004\b\f\u0010\r\u001a_\u0010\f\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00042\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0007¢\u0006\u0004\b\f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/google/android/gms/maps/model/TileProvider;", "tileProvider", "", "fadeIn", "", "transparency", "visible", "zIndex", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/TileOverlay;", "", "onClick", "TileOverlay", "(Lcom/google/android/gms/maps/model/TileProvider;ZFZFLe23/l;Lp3/m;II)V", "Lcom/google/maps/android/compose/TileOverlayState;", RemoteConfigConstants.ResponseFieldKey.STATE, "(Lcom/google/android/gms/maps/model/TileProvider;Lcom/google/maps/android/compose/TileOverlayState;ZFZFLe23/l;Lp3/m;II)V", "rememberTileOverlayState", "(Lp3/m;I)Lcom/google/maps/android/compose/TileOverlayState;", "maps-compose_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class TileOverlayKt {
    /* JADX WARN: Code duplicated, block: B:101:0x0123  */
    /* JADX WARN: Code duplicated, block: B:103:0x0126  */
    /* JADX WARN: Code duplicated, block: B:105:0x0129  */
    /* JADX WARN: Code duplicated, block: B:107:0x0134  */
    /* JADX WARN: Code duplicated, block: B:111:0x0168  */
    /* JADX WARN: Code duplicated, block: B:112:0x016a  */
    /* JADX WARN: Code duplicated, block: B:115:0x0172  */
    /* JADX WARN: Code duplicated, block: B:116:0x0174  */
    /* JADX WARN: Code duplicated, block: B:119:0x017e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0180  */
    /* JADX WARN: Code duplicated, block: B:123:0x0189  */
    /* JADX WARN: Code duplicated, block: B:124:0x018b  */
    /* JADX WARN: Code duplicated, block: B:127:0x0195  */
    /* JADX WARN: Code duplicated, block: B:129:0x019b  */
    /* JADX WARN: Code duplicated, block: B:135:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:136:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:142:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:143:0x01be  */
    /* JADX WARN: Code duplicated, block: B:146:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:148:0x01da  */
    /* JADX WARN: Code duplicated, block: B:149:0x01de  */
    /* JADX WARN: Code duplicated, block: B:153:0x0243  */
    /* JADX WARN: Code duplicated, block: B:155:0x024f  */
    /* JADX WARN: Code duplicated, block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:91:0x0108 A[PHI: r0 r2 r3 r6 r13 r14
      0x0108: PHI (r0v38 int) = (r0v21 int), (r0v20 int), (r0v39 int) binds: [B:104:0x0127, B:89:0x0104, B:90:0x0106] A[DONT_GENERATE, DONT_INLINE]
      0x0108: PHI (r2v7 com.google.maps.android.compose.TileOverlayState) = 
      (r2v4 com.google.maps.android.compose.TileOverlayState)
      (r2v3 com.google.maps.android.compose.TileOverlayState)
      (r2v3 com.google.maps.android.compose.TileOverlayState)
     binds: [B:104:0x0127, B:89:0x0104, B:90:0x0106] A[DONT_GENERATE, DONT_INLINE]
      0x0108: PHI (r3v7 float) = (r3v2 float), (r3v1 float), (r3v1 float) binds: [B:104:0x0127, B:89:0x0104, B:90:0x0106] A[DONT_GENERATE, DONT_INLINE]
      0x0108: PHI (r6v8 boolean) = (r6v3 boolean), (r6v2 boolean), (r6v2 boolean) binds: [B:104:0x0127, B:89:0x0104, B:90:0x0106] A[DONT_GENERATE, DONT_INLINE]
      0x0108: PHI (r13v17 boolean) = (r13v3 boolean), (r13v2 boolean), (r13v2 boolean) binds: [B:104:0x0127, B:89:0x0104, B:90:0x0106] A[DONT_GENERATE, DONT_INLINE]
      0x0108: PHI (r14v33 float) = (r14v3 float), (r14v2 float), (r14v2 float) binds: [B:104:0x0127, B:89:0x0104, B:90:0x0106] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:92:0x010f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0113  */
    /* JADX WARN: Code duplicated, block: B:96:0x011c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0120  */
    @GoogleMapComposable
    public static final void TileOverlay(final TileProvider tileProvider, TileOverlayState tileOverlayState, boolean z14, float f14, boolean z15, float f15, e23.l<? super TileOverlay, Unit> lVar, p3.m mVar, final int i14, final int i15) {
        int i16;
        final TileOverlayState tileOverlayStateRememberTileOverlayState;
        boolean z16;
        int i17;
        float f16;
        int i18;
        int i19;
        boolean z17;
        int i24;
        int i25;
        float f17;
        int i26;
        int i27;
        e23.l<? super TileOverlay, Unit> lVar2;
        int i28;
        int i29;
        p3.m.a aVar;
        int i30;
        Object objH;
        final float f18;
        final e23.l<? super TileOverlay, Unit> lVar3;
        p3.m.a aVar2;
        final boolean z18;
        final boolean z19;
        final float f19;
        MapApplier mapApplier;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        boolean z29;
        Object objQ;
        final MapApplier mapApplier2;
        e23.a aVar3;
        int i34;
        final e23.l<? super TileOverlay, Unit> lVar4;
        final boolean z34;
        final boolean z35;
        final float f22;
        final float f24;
        p2 p2VarI0;
        final TileProvider tileProvider2 = tileProvider;
        tileProvider2.getClass();
        p3.o0 o0VarE = mVar.E(-378552693);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i15 & 1) != 0) {
            i16 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i16 = (o0VarE.r(tileProvider2) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            if ((i15 & 2) == 0) {
                tileOverlayStateRememberTileOverlayState = tileOverlayState;
                int i35 = o0VarE.B(tileOverlayStateRememberTileOverlayState) ? 32 : 16;
                i16 |= i35;
            } else {
                tileOverlayStateRememberTileOverlayState = tileOverlayState;
            }
            i16 |= i35;
        } else {
            tileOverlayStateRememberTileOverlayState = tileOverlayState;
        }
        int i36 = i15 & 4;
        if (i36 == 0) {
            if ((i14 & 384) == 0) {
                z16 = z14;
                i16 |= o0VarE.h(z16) ? 256 : 128;
            }
            i17 = i15 & 8;
            if (i17 != 0) {
                if ((i14 & 3072) == 0) {
                    f16 = f14;
                    if (o0VarE.i(f16)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i16 |= i18;
                }
                i19 = i15 & 16;
                if (i19 != 0) {
                    if ((i14 & 24576) == 0) {
                        z17 = z15;
                        if (o0VarE.h(z17)) {
                            i24 = 16384;
                        } else {
                            i24 = 8192;
                        }
                        i16 |= i24;
                    }
                    i25 = i15 & 32;
                    if (i25 != 0) {
                        i16 |= 196608;
                        f17 = f15;
                    } else {
                        f17 = f15;
                        if ((i14 & 196608) == 0) {
                            if (o0VarE.i(f17)) {
                                i26 = 131072;
                            } else {
                                i26 = 65536;
                            }
                            i16 |= i26;
                        }
                    }
                    i27 = i15 & 64;
                    if (i27 != 0) {
                        i16 |= 1572864;
                        lVar2 = lVar;
                    } else {
                        lVar2 = lVar;
                        if ((i14 & 1572864) == 0) {
                            if (o0VarE.r(lVar2)) {
                                i28 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                            } else {
                                i28 = 524288;
                            }
                            i16 |= i28;
                        }
                    }
                    if ((i16 & 599187) == 599186 || !o0VarE.b()) {
                        o0VarE.G0();
                        i29 = i14 & 1;
                        aVar = p3.m.f135153a;
                        i30 = 1;
                        if (i29 != 0 || o0VarE.o0()) {
                            if ((i15 & 2) != 0) {
                                tileOverlayStateRememberTileOverlayState = rememberTileOverlayState(o0VarE, 0);
                                i16 &= -113;
                            }
                            if (i36 != 0) {
                                z16 = true;
                            }
                            if (i17 != 0) {
                                f16 = 0.0f;
                            }
                            if (i19 != 0) {
                                z17 = true;
                            }
                            if (i25 != 0) {
                                f17 = 0.0f;
                            }
                            if (i27 != 0) {
                                objH = q2.h(o0VarE, -1493227078, aVar);
                                if (objH == p3.m.a.f135155b) {
                                    objH = new f0(13);
                                    o0VarE.K(objH);
                                }
                                o0VarE.g0(false);
                                f18 = f17;
                                lVar3 = (e23.l) objH;
                                aVar2 = aVar;
                                z18 = z16;
                                z19 = z17;
                                f19 = f16;
                            }
                            o0VarE.h0();
                            x1 x1Var = p3.n.f135158a;
                            mapApplier = (MapApplier) cVar;
                            o0VarE.C(-1493222491);
                            boolean zR = o0VarE.r(mapApplier) | o0VarE.r(tileProvider2);
                            if ((i16 & 896) == 256) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            boolean z36 = zR | z24;
                            if ((i16 & 7168) == 2048) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            boolean z37 = z36 | z25;
                            if ((57344 & i16) == 16384) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            boolean z38 = z37 | z26;
                            if ((458752 & i16) == 131072) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            boolean z39 = z38 | z27 | ((((i16 & 112) ^ 48) <= 32 && o0VarE.B(tileOverlayStateRememberTileOverlayState)) || (i16 & 48) == 32);
                            if ((i16 & 3670016) == 1048576) {
                                z28 = true;
                            } else {
                                z28 = false;
                            }
                            z29 = z28 | z39;
                            objQ = o0VarE.q();
                            if (z29) {
                                mapApplier2 = mapApplier;
                                e23.a aVar4 = new e23.a() { // from class: com.google.maps.android.compose.p0
                                    @Override // e23.a
                                    public final Object invoke() {
                                        return TileOverlayKt.TileOverlay$lambda$7$lambda$6(mapApplier2, tileOverlayStateRememberTileOverlayState, lVar3, tileProvider2, z18, f19, z19, f18);
                                    }
                                };
                                o0VarE.K(aVar4);
                                objQ = aVar4;
                            } else {
                                aVar2.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    mapApplier2 = mapApplier;
                                    e23.a aVar5 = new e23.a() { // from class: com.google.maps.android.compose.p0
                                        @Override // e23.a
                                        public final Object invoke() {
                                            return TileOverlayKt.TileOverlay$lambda$7$lambda$6(mapApplier2, tileOverlayStateRememberTileOverlayState, lVar3, tileProvider2, z18, f19, z19, f18);
                                        }
                                    };
                                    o0VarE.K(aVar5);
                                    objQ = aVar5;
                                } else {
                                    mapApplier2 = mapApplier;
                                }
                            }
                            aVar3 = (e23.a) objQ;
                            i34 = 0;
                            o0VarE.g0(false);
                            if (cVar instanceof MapApplier) {
                                p3.p0.l();
                                throw null;
                            }
                            o0VarE.H();
                            if (o0VarE.T) {
                                o0VarE.M(aVar3);
                            } else {
                                o0VarE.c();
                            }
                            b4.d(new q0(i34), lVar3, o0VarE);
                            final MapApplier mapApplier3 = mapApplier2;
                            final boolean z44 = z18;
                            final float f25 = f19;
                            final boolean z45 = z19;
                            final float f26 = f18;
                            tileProvider2 = tileProvider;
                            b4.d(new e23.p() { // from class: com.google.maps.android.compose.r0
                                @Override // e23.p
                                public final Object invoke(Object obj, Object obj2) {
                                    return TileOverlayKt.TileOverlay$lambda$15$lambda$10(mapApplier3, tileProvider, z44, f25, z45, f26, (TileOverlayNode) obj, (TileProvider) obj2);
                                }
                            }, tileProvider2, o0VarE);
                            b4.d(new q0(i30), Boolean.valueOf(z18), o0VarE);
                            b4.d(new q0(2), Float.valueOf(f19), o0VarE);
                            b4.d(new q0(3), Boolean.valueOf(z19), o0VarE);
                            b4.d(new q0(4), Float.valueOf(f18), o0VarE);
                            o0VarE.g0(true);
                            boolean z46 = z19;
                            lVar4 = lVar3;
                            z34 = z18;
                            z35 = z46;
                            f22 = f19;
                            f24 = f18;
                        } else {
                            o0VarE.e();
                            if ((i15 & 2) != 0) {
                                i16 &= -113;
                            }
                        }
                        z18 = z16;
                        aVar2 = aVar;
                        z19 = z17;
                        f19 = f16;
                        f18 = f17;
                        lVar3 = lVar2;
                        o0VarE.h0();
                        x1 x1Var2 = p3.n.f135158a;
                        mapApplier = (MapApplier) cVar;
                        o0VarE.C(-1493222491);
                        boolean zR2 = o0VarE.r(mapApplier) | o0VarE.r(tileProvider2);
                        if ((i16 & 896) == 256) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        boolean z310 = zR2 | z24;
                        if ((i16 & 7168) == 2048) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        boolean z311 = z310 | z25;
                        if ((57344 & i16) == 16384) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        boolean z312 = z311 | z26;
                        if ((458752 & i16) == 131072) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        boolean z313 = z312 | z27 | ((((i16 & 112) ^ 48) <= 32 && o0VarE.B(tileOverlayStateRememberTileOverlayState)) || (i16 & 48) == 32);
                        if ((i16 & 3670016) == 1048576) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        z29 = z28 | z313;
                        objQ = o0VarE.q();
                        if (z29) {
                            aVar2.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                mapApplier2 = mapApplier;
                                e23.a aVar6 = new e23.a() { // from class: com.google.maps.android.compose.p0
                                    @Override // e23.a
                                    public final Object invoke() {
                                        return TileOverlayKt.TileOverlay$lambda$7$lambda$6(mapApplier2, tileOverlayStateRememberTileOverlayState, lVar3, tileProvider2, z18, f19, z19, f18);
                                    }
                                };
                                o0VarE.K(aVar6);
                                objQ = aVar6;
                            } else {
                                mapApplier2 = mapApplier;
                            }
                        } else {
                            mapApplier2 = mapApplier;
                            e23.a aVar7 = new e23.a() { // from class: com.google.maps.android.compose.p0
                                @Override // e23.a
                                public final Object invoke() {
                                    return TileOverlayKt.TileOverlay$lambda$7$lambda$6(mapApplier2, tileOverlayStateRememberTileOverlayState, lVar3, tileProvider2, z18, f19, z19, f18);
                                }
                            };
                            o0VarE.K(aVar7);
                            objQ = aVar7;
                        }
                        aVar3 = (e23.a) objQ;
                        i34 = 0;
                        o0VarE.g0(false);
                        if (cVar instanceof MapApplier) {
                            p3.p0.l();
                            throw null;
                        }
                        o0VarE.H();
                        if (o0VarE.T) {
                            o0VarE.M(aVar3);
                        } else {
                            o0VarE.c();
                        }
                        b4.d(new q0(i34), lVar3, o0VarE);
                        final MapApplier mapApplier4 = mapApplier2;
                        final boolean z47 = z18;
                        final float f27 = f19;
                        final boolean z48 = z19;
                        final float f28 = f18;
                        tileProvider2 = tileProvider;
                        b4.d(new e23.p() { // from class: com.google.maps.android.compose.r0
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                return TileOverlayKt.TileOverlay$lambda$15$lambda$10(mapApplier4, tileProvider, z47, f27, z48, f28, (TileOverlayNode) obj, (TileProvider) obj2);
                            }
                        }, tileProvider2, o0VarE);
                        b4.d(new q0(i30), Boolean.valueOf(z18), o0VarE);
                        b4.d(new q0(2), Float.valueOf(f19), o0VarE);
                        b4.d(new q0(3), Boolean.valueOf(z19), o0VarE);
                        b4.d(new q0(4), Float.valueOf(f18), o0VarE);
                        o0VarE.g0(true);
                        boolean z49 = z19;
                        lVar4 = lVar3;
                        z34 = z18;
                        z35 = z49;
                        f22 = f19;
                        f24 = f18;
                    } else {
                        o0VarE.e();
                        boolean z54 = z16;
                        f24 = f17;
                        z34 = z54;
                        lVar4 = lVar2;
                        z35 = z17;
                        f22 = f16;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.n0
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return TileOverlayKt.TileOverlay$lambda$16(tileProvider2, tileOverlayStateRememberTileOverlayState, z34, f22, z35, f24, lVar4, i14, i15, (p3.m) obj, iIntValue);
                            }
                        };
                    }
                }
                i16 |= 24576;
                z17 = z15;
                i25 = i15 & 32;
                if (i25 != 0) {
                    i16 |= 196608;
                    f17 = f15;
                } else {
                    f17 = f15;
                    if ((i14 & 196608) == 0) {
                        if (o0VarE.i(f17)) {
                            i26 = 131072;
                        } else {
                            i26 = 65536;
                        }
                        i16 |= i26;
                    }
                }
                i27 = i15 & 64;
                if (i27 != 0) {
                    i16 |= 1572864;
                    lVar2 = lVar;
                } else {
                    lVar2 = lVar;
                    if ((i14 & 1572864) == 0) {
                        if (o0VarE.r(lVar2)) {
                            i28 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i28 = 524288;
                        }
                        i16 |= i28;
                    }
                }
                if ((i16 & 599187) == 599186) {
                    o0VarE.G0();
                    i29 = i14 & 1;
                    aVar = p3.m.f135153a;
                    i30 = 1;
                    if (i29 != 0) {
                        if ((i15 & 2) != 0) {
                            tileOverlayStateRememberTileOverlayState = rememberTileOverlayState(o0VarE, 0);
                            i16 &= -113;
                        }
                        if (i36 != 0) {
                            z16 = true;
                        }
                        if (i17 != 0) {
                            f16 = 0.0f;
                        }
                        if (i19 != 0) {
                            z17 = true;
                        }
                        if (i25 != 0) {
                            f17 = 0.0f;
                        }
                        if (i27 != 0) {
                            objH = q2.h(o0VarE, -1493227078, aVar);
                            if (objH == p3.m.a.f135155b) {
                                objH = new f0(13);
                                o0VarE.K(objH);
                            }
                            o0VarE.g0(false);
                            f18 = f17;
                            lVar3 = (e23.l) objH;
                            aVar2 = aVar;
                            z18 = z16;
                            z19 = z17;
                            f19 = f16;
                        } else {
                            z18 = z16;
                            aVar2 = aVar;
                            z19 = z17;
                            f19 = f16;
                            f18 = f17;
                            lVar3 = lVar2;
                        }
                    } else {
                        if ((i15 & 2) != 0) {
                            tileOverlayStateRememberTileOverlayState = rememberTileOverlayState(o0VarE, 0);
                            i16 &= -113;
                        }
                        if (i36 != 0) {
                            z16 = true;
                        }
                        if (i17 != 0) {
                            f16 = 0.0f;
                        }
                        if (i19 != 0) {
                            z17 = true;
                        }
                        if (i25 != 0) {
                            f17 = 0.0f;
                        }
                        if (i27 != 0) {
                            objH = q2.h(o0VarE, -1493227078, aVar);
                            if (objH == p3.m.a.f135155b) {
                                objH = new f0(13);
                                o0VarE.K(objH);
                            }
                            o0VarE.g0(false);
                            f18 = f17;
                            lVar3 = (e23.l) objH;
                            aVar2 = aVar;
                            z18 = z16;
                            z19 = z17;
                            f19 = f16;
                        } else {
                            z18 = z16;
                            aVar2 = aVar;
                            z19 = z17;
                            f19 = f16;
                            f18 = f17;
                            lVar3 = lVar2;
                        }
                    }
                    o0VarE.h0();
                    x1 x1Var3 = p3.n.f135158a;
                    mapApplier = (MapApplier) cVar;
                    o0VarE.C(-1493222491);
                    boolean zR3 = o0VarE.r(mapApplier) | o0VarE.r(tileProvider2);
                    if ((i16 & 896) == 256) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    boolean z314 = zR3 | z24;
                    if ((i16 & 7168) == 2048) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z315 = z314 | z25;
                    if ((57344 & i16) == 16384) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    boolean z316 = z315 | z26;
                    if ((458752 & i16) == 131072) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    boolean z317 = z316 | z27 | ((((i16 & 112) ^ 48) <= 32 && o0VarE.B(tileOverlayStateRememberTileOverlayState)) || (i16 & 48) == 32);
                    if ((i16 & 3670016) == 1048576) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    z29 = z28 | z317;
                    objQ = o0VarE.q();
                    if (z29) {
                        aVar2.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            mapApplier2 = mapApplier;
                            e23.a aVar8 = new e23.a() { // from class: com.google.maps.android.compose.p0
                                @Override // e23.a
                                public final Object invoke() {
                                    return TileOverlayKt.TileOverlay$lambda$7$lambda$6(mapApplier2, tileOverlayStateRememberTileOverlayState, lVar3, tileProvider2, z18, f19, z19, f18);
                                }
                            };
                            o0VarE.K(aVar8);
                            objQ = aVar8;
                        } else {
                            mapApplier2 = mapApplier;
                        }
                    } else {
                        mapApplier2 = mapApplier;
                        e23.a aVar9 = new e23.a() { // from class: com.google.maps.android.compose.p0
                            @Override // e23.a
                            public final Object invoke() {
                                return TileOverlayKt.TileOverlay$lambda$7$lambda$6(mapApplier2, tileOverlayStateRememberTileOverlayState, lVar3, tileProvider2, z18, f19, z19, f18);
                            }
                        };
                        o0VarE.K(aVar9);
                        objQ = aVar9;
                    }
                    aVar3 = (e23.a) objQ;
                    i34 = 0;
                    o0VarE.g0(false);
                    if (cVar instanceof MapApplier) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.H();
                    if (o0VarE.T) {
                        o0VarE.M(aVar3);
                    } else {
                        o0VarE.c();
                    }
                    b4.d(new q0(i34), lVar3, o0VarE);
                    final MapApplier mapApplier5 = mapApplier2;
                    final boolean z410 = z18;
                    final float f29 = f19;
                    final boolean z411 = z19;
                    final float f210 = f18;
                    tileProvider2 = tileProvider;
                    b4.d(new e23.p() { // from class: com.google.maps.android.compose.r0
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            return TileOverlayKt.TileOverlay$lambda$15$lambda$10(mapApplier5, tileProvider, z410, f29, z411, f210, (TileOverlayNode) obj, (TileProvider) obj2);
                        }
                    }, tileProvider2, o0VarE);
                    b4.d(new q0(i30), Boolean.valueOf(z18), o0VarE);
                    b4.d(new q0(2), Float.valueOf(f19), o0VarE);
                    b4.d(new q0(3), Boolean.valueOf(z19), o0VarE);
                    b4.d(new q0(4), Float.valueOf(f18), o0VarE);
                    o0VarE.g0(true);
                    boolean z412 = z19;
                    lVar4 = lVar3;
                    z34 = z18;
                    z35 = z412;
                    f22 = f19;
                    f24 = f18;
                } else {
                    o0VarE.G0();
                    i29 = i14 & 1;
                    aVar = p3.m.f135153a;
                    i30 = 1;
                    if (i29 != 0) {
                        if ((i15 & 2) != 0) {
                            tileOverlayStateRememberTileOverlayState = rememberTileOverlayState(o0VarE, 0);
                            i16 &= -113;
                        }
                        if (i36 != 0) {
                            z16 = true;
                        }
                        if (i17 != 0) {
                            f16 = 0.0f;
                        }
                        if (i19 != 0) {
                            z17 = true;
                        }
                        if (i25 != 0) {
                            f17 = 0.0f;
                        }
                        if (i27 != 0) {
                            objH = q2.h(o0VarE, -1493227078, aVar);
                            if (objH == p3.m.a.f135155b) {
                                objH = new f0(13);
                                o0VarE.K(objH);
                            }
                            o0VarE.g0(false);
                            f18 = f17;
                            lVar3 = (e23.l) objH;
                            aVar2 = aVar;
                            z18 = z16;
                            z19 = z17;
                            f19 = f16;
                        } else {
                            z18 = z16;
                            aVar2 = aVar;
                            z19 = z17;
                            f19 = f16;
                            f18 = f17;
                            lVar3 = lVar2;
                        }
                    } else {
                        if ((i15 & 2) != 0) {
                            tileOverlayStateRememberTileOverlayState = rememberTileOverlayState(o0VarE, 0);
                            i16 &= -113;
                        }
                        if (i36 != 0) {
                            z16 = true;
                        }
                        if (i17 != 0) {
                            f16 = 0.0f;
                        }
                        if (i19 != 0) {
                            z17 = true;
                        }
                        if (i25 != 0) {
                            f17 = 0.0f;
                        }
                        if (i27 != 0) {
                            objH = q2.h(o0VarE, -1493227078, aVar);
                            if (objH == p3.m.a.f135155b) {
                                objH = new f0(13);
                                o0VarE.K(objH);
                            }
                            o0VarE.g0(false);
                            f18 = f17;
                            lVar3 = (e23.l) objH;
                            aVar2 = aVar;
                            z18 = z16;
                            z19 = z17;
                            f19 = f16;
                        } else {
                            z18 = z16;
                            aVar2 = aVar;
                            z19 = z17;
                            f19 = f16;
                            f18 = f17;
                            lVar3 = lVar2;
                        }
                    }
                    o0VarE.h0();
                    x1 x1Var4 = p3.n.f135158a;
                    mapApplier = (MapApplier) cVar;
                    o0VarE.C(-1493222491);
                    boolean zR4 = o0VarE.r(mapApplier) | o0VarE.r(tileProvider2);
                    if ((i16 & 896) == 256) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    boolean z318 = zR4 | z24;
                    if ((i16 & 7168) == 2048) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z319 = z318 | z25;
                    if ((57344 & i16) == 16384) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    boolean z3110 = z319 | z26;
                    if ((458752 & i16) == 131072) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    boolean z3111 = z3110 | z27 | ((((i16 & 112) ^ 48) <= 32 && o0VarE.B(tileOverlayStateRememberTileOverlayState)) || (i16 & 48) == 32);
                    if ((i16 & 3670016) == 1048576) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    z29 = z28 | z3111;
                    objQ = o0VarE.q();
                    if (z29) {
                        aVar2.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            mapApplier2 = mapApplier;
                            e23.a aVar10 = new e23.a() { // from class: com.google.maps.android.compose.p0
                                @Override // e23.a
                                public final Object invoke() {
                                    return TileOverlayKt.TileOverlay$lambda$7$lambda$6(mapApplier2, tileOverlayStateRememberTileOverlayState, lVar3, tileProvider2, z18, f19, z19, f18);
                                }
                            };
                            o0VarE.K(aVar10);
                            objQ = aVar10;
                        } else {
                            mapApplier2 = mapApplier;
                        }
                    } else {
                        mapApplier2 = mapApplier;
                        e23.a aVar11 = new e23.a() { // from class: com.google.maps.android.compose.p0
                            @Override // e23.a
                            public final Object invoke() {
                                return TileOverlayKt.TileOverlay$lambda$7$lambda$6(mapApplier2, tileOverlayStateRememberTileOverlayState, lVar3, tileProvider2, z18, f19, z19, f18);
                            }
                        };
                        o0VarE.K(aVar11);
                        objQ = aVar11;
                    }
                    aVar3 = (e23.a) objQ;
                    i34 = 0;
                    o0VarE.g0(false);
                    if (cVar instanceof MapApplier) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.H();
                    if (o0VarE.T) {
                        o0VarE.M(aVar3);
                    } else {
                        o0VarE.c();
                    }
                    b4.d(new q0(i34), lVar3, o0VarE);
                    final MapApplier mapApplier6 = mapApplier2;
                    final boolean z413 = z18;
                    final float f211 = f19;
                    final boolean z414 = z19;
                    final float f212 = f18;
                    tileProvider2 = tileProvider;
                    b4.d(new e23.p() { // from class: com.google.maps.android.compose.r0
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            return TileOverlayKt.TileOverlay$lambda$15$lambda$10(mapApplier6, tileProvider, z413, f211, z414, f212, (TileOverlayNode) obj, (TileProvider) obj2);
                        }
                    }, tileProvider2, o0VarE);
                    b4.d(new q0(i30), Boolean.valueOf(z18), o0VarE);
                    b4.d(new q0(2), Float.valueOf(f19), o0VarE);
                    b4.d(new q0(3), Boolean.valueOf(z19), o0VarE);
                    b4.d(new q0(4), Float.valueOf(f18), o0VarE);
                    o0VarE.g0(true);
                    boolean z415 = z19;
                    lVar4 = lVar3;
                    z34 = z18;
                    z35 = z415;
                    f22 = f19;
                    f24 = f18;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.n0
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TileOverlayKt.TileOverlay$lambda$16(tileProvider2, tileOverlayStateRememberTileOverlayState, z34, f22, z35, f24, lVar4, i14, i15, (p3.m) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 3072;
            f16 = f14;
            i19 = i15 & 16;
            if (i19 != 0) {
                if ((i14 & 24576) == 0) {
                    z17 = z15;
                    if (o0VarE.h(z17)) {
                        i24 = 16384;
                    } else {
                        i24 = 8192;
                    }
                    i16 |= i24;
                }
                i25 = i15 & 32;
                if (i25 != 0) {
                    i16 |= 196608;
                    f17 = f15;
                } else {
                    f17 = f15;
                    if ((i14 & 196608) == 0) {
                        if (o0VarE.i(f17)) {
                            i26 = 131072;
                        } else {
                            i26 = 65536;
                        }
                        i16 |= i26;
                    }
                }
                i27 = i15 & 64;
                if (i27 != 0) {
                    i16 |= 1572864;
                    lVar2 = lVar;
                } else {
                    lVar2 = lVar;
                    if ((i14 & 1572864) == 0) {
                        if (o0VarE.r(lVar2)) {
                            i28 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i28 = 524288;
                        }
                        i16 |= i28;
                    }
                }
                if ((i16 & 599187) == 599186) {
                    o0VarE.G0();
                    i29 = i14 & 1;
                    aVar = p3.m.f135153a;
                    i30 = 1;
                    if (i29 != 0) {
                        if ((i15 & 2) != 0) {
                            tileOverlayStateRememberTileOverlayState = rememberTileOverlayState(o0VarE, 0);
                            i16 &= -113;
                        }
                        if (i36 != 0) {
                            z16 = true;
                        }
                        if (i17 != 0) {
                            f16 = 0.0f;
                        }
                        if (i19 != 0) {
                            z17 = true;
                        }
                        if (i25 != 0) {
                            f17 = 0.0f;
                        }
                        if (i27 != 0) {
                            objH = q2.h(o0VarE, -1493227078, aVar);
                            if (objH == p3.m.a.f135155b) {
                                objH = new f0(13);
                                o0VarE.K(objH);
                            }
                            o0VarE.g0(false);
                            f18 = f17;
                            lVar3 = (e23.l) objH;
                            aVar2 = aVar;
                            z18 = z16;
                            z19 = z17;
                            f19 = f16;
                        } else {
                            z18 = z16;
                            aVar2 = aVar;
                            z19 = z17;
                            f19 = f16;
                            f18 = f17;
                            lVar3 = lVar2;
                        }
                    } else {
                        if ((i15 & 2) != 0) {
                            tileOverlayStateRememberTileOverlayState = rememberTileOverlayState(o0VarE, 0);
                            i16 &= -113;
                        }
                        if (i36 != 0) {
                            z16 = true;
                        }
                        if (i17 != 0) {
                            f16 = 0.0f;
                        }
                        if (i19 != 0) {
                            z17 = true;
                        }
                        if (i25 != 0) {
                            f17 = 0.0f;
                        }
                        if (i27 != 0) {
                            objH = q2.h(o0VarE, -1493227078, aVar);
                            if (objH == p3.m.a.f135155b) {
                                objH = new f0(13);
                                o0VarE.K(objH);
                            }
                            o0VarE.g0(false);
                            f18 = f17;
                            lVar3 = (e23.l) objH;
                            aVar2 = aVar;
                            z18 = z16;
                            z19 = z17;
                            f19 = f16;
                        } else {
                            z18 = z16;
                            aVar2 = aVar;
                            z19 = z17;
                            f19 = f16;
                            f18 = f17;
                            lVar3 = lVar2;
                        }
                    }
                    o0VarE.h0();
                    x1 x1Var5 = p3.n.f135158a;
                    mapApplier = (MapApplier) cVar;
                    o0VarE.C(-1493222491);
                    boolean zR5 = o0VarE.r(mapApplier) | o0VarE.r(tileProvider2);
                    if ((i16 & 896) == 256) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    boolean z3112 = zR5 | z24;
                    if ((i16 & 7168) == 2048) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z3113 = z3112 | z25;
                    if ((57344 & i16) == 16384) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    boolean z3114 = z3113 | z26;
                    if ((458752 & i16) == 131072) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    boolean z3115 = z3114 | z27 | ((((i16 & 112) ^ 48) <= 32 && o0VarE.B(tileOverlayStateRememberTileOverlayState)) || (i16 & 48) == 32);
                    if ((i16 & 3670016) == 1048576) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    z29 = z28 | z3115;
                    objQ = o0VarE.q();
                    if (z29) {
                        aVar2.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            mapApplier2 = mapApplier;
                            e23.a aVar12 = new e23.a() { // from class: com.google.maps.android.compose.p0
                                @Override // e23.a
                                public final Object invoke() {
                                    return TileOverlayKt.TileOverlay$lambda$7$lambda$6(mapApplier2, tileOverlayStateRememberTileOverlayState, lVar3, tileProvider2, z18, f19, z19, f18);
                                }
                            };
                            o0VarE.K(aVar12);
                            objQ = aVar12;
                        } else {
                            mapApplier2 = mapApplier;
                        }
                    } else {
                        mapApplier2 = mapApplier;
                        e23.a aVar13 = new e23.a() { // from class: com.google.maps.android.compose.p0
                            @Override // e23.a
                            public final Object invoke() {
                                return TileOverlayKt.TileOverlay$lambda$7$lambda$6(mapApplier2, tileOverlayStateRememberTileOverlayState, lVar3, tileProvider2, z18, f19, z19, f18);
                            }
                        };
                        o0VarE.K(aVar13);
                        objQ = aVar13;
                    }
                    aVar3 = (e23.a) objQ;
                    i34 = 0;
                    o0VarE.g0(false);
                    if (cVar instanceof MapApplier) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.H();
                    if (o0VarE.T) {
                        o0VarE.M(aVar3);
                    } else {
                        o0VarE.c();
                    }
                    b4.d(new q0(i34), lVar3, o0VarE);
                    final MapApplier mapApplier7 = mapApplier2;
                    final boolean z416 = z18;
                    final float f213 = f19;
                    final boolean z417 = z19;
                    final float f214 = f18;
                    tileProvider2 = tileProvider;
                    b4.d(new e23.p() { // from class: com.google.maps.android.compose.r0
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            return TileOverlayKt.TileOverlay$lambda$15$lambda$10(mapApplier7, tileProvider, z416, f213, z417, f214, (TileOverlayNode) obj, (TileProvider) obj2);
                        }
                    }, tileProvider2, o0VarE);
                    b4.d(new q0(i30), Boolean.valueOf(z18), o0VarE);
                    b4.d(new q0(2), Float.valueOf(f19), o0VarE);
                    b4.d(new q0(3), Boolean.valueOf(z19), o0VarE);
                    b4.d(new q0(4), Float.valueOf(f18), o0VarE);
                    o0VarE.g0(true);
                    boolean z418 = z19;
                    lVar4 = lVar3;
                    z34 = z18;
                    z35 = z418;
                    f22 = f19;
                    f24 = f18;
                } else {
                    o0VarE.G0();
                    i29 = i14 & 1;
                    aVar = p3.m.f135153a;
                    i30 = 1;
                    if (i29 != 0) {
                        if ((i15 & 2) != 0) {
                            tileOverlayStateRememberTileOverlayState = rememberTileOverlayState(o0VarE, 0);
                            i16 &= -113;
                        }
                        if (i36 != 0) {
                            z16 = true;
                        }
                        if (i17 != 0) {
                            f16 = 0.0f;
                        }
                        if (i19 != 0) {
                            z17 = true;
                        }
                        if (i25 != 0) {
                            f17 = 0.0f;
                        }
                        if (i27 != 0) {
                            objH = q2.h(o0VarE, -1493227078, aVar);
                            if (objH == p3.m.a.f135155b) {
                                objH = new f0(13);
                                o0VarE.K(objH);
                            }
                            o0VarE.g0(false);
                            f18 = f17;
                            lVar3 = (e23.l) objH;
                            aVar2 = aVar;
                            z18 = z16;
                            z19 = z17;
                            f19 = f16;
                        } else {
                            z18 = z16;
                            aVar2 = aVar;
                            z19 = z17;
                            f19 = f16;
                            f18 = f17;
                            lVar3 = lVar2;
                        }
                    } else {
                        if ((i15 & 2) != 0) {
                            tileOverlayStateRememberTileOverlayState = rememberTileOverlayState(o0VarE, 0);
                            i16 &= -113;
                        }
                        if (i36 != 0) {
                            z16 = true;
                        }
                        if (i17 != 0) {
                            f16 = 0.0f;
                        }
                        if (i19 != 0) {
                            z17 = true;
                        }
                        if (i25 != 0) {
                            f17 = 0.0f;
                        }
                        if (i27 != 0) {
                            objH = q2.h(o0VarE, -1493227078, aVar);
                            if (objH == p3.m.a.f135155b) {
                                objH = new f0(13);
                                o0VarE.K(objH);
                            }
                            o0VarE.g0(false);
                            f18 = f17;
                            lVar3 = (e23.l) objH;
                            aVar2 = aVar;
                            z18 = z16;
                            z19 = z17;
                            f19 = f16;
                        } else {
                            z18 = z16;
                            aVar2 = aVar;
                            z19 = z17;
                            f19 = f16;
                            f18 = f17;
                            lVar3 = lVar2;
                        }
                    }
                    o0VarE.h0();
                    x1 x1Var6 = p3.n.f135158a;
                    mapApplier = (MapApplier) cVar;
                    o0VarE.C(-1493222491);
                    boolean zR6 = o0VarE.r(mapApplier) | o0VarE.r(tileProvider2);
                    if ((i16 & 896) == 256) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    boolean z3116 = zR6 | z24;
                    if ((i16 & 7168) == 2048) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z3117 = z3116 | z25;
                    if ((57344 & i16) == 16384) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    boolean z3118 = z3117 | z26;
                    if ((458752 & i16) == 131072) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    boolean z3119 = z3118 | z27 | ((((i16 & 112) ^ 48) <= 32 && o0VarE.B(tileOverlayStateRememberTileOverlayState)) || (i16 & 48) == 32);
                    if ((i16 & 3670016) == 1048576) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    z29 = z28 | z3119;
                    objQ = o0VarE.q();
                    if (z29) {
                        aVar2.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            mapApplier2 = mapApplier;
                            e23.a aVar14 = new e23.a() { // from class: com.google.maps.android.compose.p0
                                @Override // e23.a
                                public final Object invoke() {
                                    return TileOverlayKt.TileOverlay$lambda$7$lambda$6(mapApplier2, tileOverlayStateRememberTileOverlayState, lVar3, tileProvider2, z18, f19, z19, f18);
                                }
                            };
                            o0VarE.K(aVar14);
                            objQ = aVar14;
                        } else {
                            mapApplier2 = mapApplier;
                        }
                    } else {
                        mapApplier2 = mapApplier;
                        e23.a aVar15 = new e23.a() { // from class: com.google.maps.android.compose.p0
                            @Override // e23.a
                            public final Object invoke() {
                                return TileOverlayKt.TileOverlay$lambda$7$lambda$6(mapApplier2, tileOverlayStateRememberTileOverlayState, lVar3, tileProvider2, z18, f19, z19, f18);
                            }
                        };
                        o0VarE.K(aVar15);
                        objQ = aVar15;
                    }
                    aVar3 = (e23.a) objQ;
                    i34 = 0;
                    o0VarE.g0(false);
                    if (cVar instanceof MapApplier) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.H();
                    if (o0VarE.T) {
                        o0VarE.M(aVar3);
                    } else {
                        o0VarE.c();
                    }
                    b4.d(new q0(i34), lVar3, o0VarE);
                    final MapApplier mapApplier8 = mapApplier2;
                    final boolean z419 = z18;
                    final float f215 = f19;
                    final boolean z4110 = z19;
                    final float f216 = f18;
                    tileProvider2 = tileProvider;
                    b4.d(new e23.p() { // from class: com.google.maps.android.compose.r0
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            return TileOverlayKt.TileOverlay$lambda$15$lambda$10(mapApplier8, tileProvider, z419, f215, z4110, f216, (TileOverlayNode) obj, (TileProvider) obj2);
                        }
                    }, tileProvider2, o0VarE);
                    b4.d(new q0(i30), Boolean.valueOf(z18), o0VarE);
                    b4.d(new q0(2), Float.valueOf(f19), o0VarE);
                    b4.d(new q0(3), Boolean.valueOf(z19), o0VarE);
                    b4.d(new q0(4), Float.valueOf(f18), o0VarE);
                    o0VarE.g0(true);
                    boolean z4111 = z19;
                    lVar4 = lVar3;
                    z34 = z18;
                    z35 = z4111;
                    f22 = f19;
                    f24 = f18;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.n0
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TileOverlayKt.TileOverlay$lambda$16(tileProvider2, tileOverlayStateRememberTileOverlayState, z34, f22, z35, f24, lVar4, i14, i15, (p3.m) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 24576;
            z17 = z15;
            i25 = i15 & 32;
            if (i25 != 0) {
                i16 |= 196608;
                f17 = f15;
            } else {
                f17 = f15;
                if ((i14 & 196608) == 0) {
                    if (o0VarE.i(f17)) {
                        i26 = 131072;
                    } else {
                        i26 = 65536;
                    }
                    i16 |= i26;
                }
            }
            i27 = i15 & 64;
            if (i27 != 0) {
                i16 |= 1572864;
                lVar2 = lVar;
            } else {
                lVar2 = lVar;
                if ((i14 & 1572864) == 0) {
                    if (o0VarE.r(lVar2)) {
                        i28 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i28 = 524288;
                    }
                    i16 |= i28;
                }
            }
            if ((i16 & 599187) == 599186) {
                o0VarE.G0();
                i29 = i14 & 1;
                aVar = p3.m.f135153a;
                i30 = 1;
                if (i29 != 0) {
                    if ((i15 & 2) != 0) {
                        tileOverlayStateRememberTileOverlayState = rememberTileOverlayState(o0VarE, 0);
                        i16 &= -113;
                    }
                    if (i36 != 0) {
                        z16 = true;
                    }
                    if (i17 != 0) {
                        f16 = 0.0f;
                    }
                    if (i19 != 0) {
                        z17 = true;
                    }
                    if (i25 != 0) {
                        f17 = 0.0f;
                    }
                    if (i27 != 0) {
                        objH = q2.h(o0VarE, -1493227078, aVar);
                        if (objH == p3.m.a.f135155b) {
                            objH = new f0(13);
                            o0VarE.K(objH);
                        }
                        o0VarE.g0(false);
                        f18 = f17;
                        lVar3 = (e23.l) objH;
                        aVar2 = aVar;
                        z18 = z16;
                        z19 = z17;
                        f19 = f16;
                    } else {
                        z18 = z16;
                        aVar2 = aVar;
                        z19 = z17;
                        f19 = f16;
                        f18 = f17;
                        lVar3 = lVar2;
                    }
                } else {
                    if ((i15 & 2) != 0) {
                        tileOverlayStateRememberTileOverlayState = rememberTileOverlayState(o0VarE, 0);
                        i16 &= -113;
                    }
                    if (i36 != 0) {
                        z16 = true;
                    }
                    if (i17 != 0) {
                        f16 = 0.0f;
                    }
                    if (i19 != 0) {
                        z17 = true;
                    }
                    if (i25 != 0) {
                        f17 = 0.0f;
                    }
                    if (i27 != 0) {
                        objH = q2.h(o0VarE, -1493227078, aVar);
                        if (objH == p3.m.a.f135155b) {
                            objH = new f0(13);
                            o0VarE.K(objH);
                        }
                        o0VarE.g0(false);
                        f18 = f17;
                        lVar3 = (e23.l) objH;
                        aVar2 = aVar;
                        z18 = z16;
                        z19 = z17;
                        f19 = f16;
                    } else {
                        z18 = z16;
                        aVar2 = aVar;
                        z19 = z17;
                        f19 = f16;
                        f18 = f17;
                        lVar3 = lVar2;
                    }
                }
                o0VarE.h0();
                x1 x1Var7 = p3.n.f135158a;
                mapApplier = (MapApplier) cVar;
                o0VarE.C(-1493222491);
                boolean zR7 = o0VarE.r(mapApplier) | o0VarE.r(tileProvider2);
                if ((i16 & 896) == 256) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                boolean z31110 = zR7 | z24;
                if ((i16 & 7168) == 2048) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z31111 = z31110 | z25;
                if ((57344 & i16) == 16384) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                boolean z31112 = z31111 | z26;
                if ((458752 & i16) == 131072) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                boolean z31113 = z31112 | z27 | ((((i16 & 112) ^ 48) <= 32 && o0VarE.B(tileOverlayStateRememberTileOverlayState)) || (i16 & 48) == 32);
                if ((i16 & 3670016) == 1048576) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                z29 = z28 | z31113;
                objQ = o0VarE.q();
                if (z29) {
                    aVar2.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        mapApplier2 = mapApplier;
                        e23.a aVar16 = new e23.a() { // from class: com.google.maps.android.compose.p0
                            @Override // e23.a
                            public final Object invoke() {
                                return TileOverlayKt.TileOverlay$lambda$7$lambda$6(mapApplier2, tileOverlayStateRememberTileOverlayState, lVar3, tileProvider2, z18, f19, z19, f18);
                            }
                        };
                        o0VarE.K(aVar16);
                        objQ = aVar16;
                    } else {
                        mapApplier2 = mapApplier;
                    }
                } else {
                    mapApplier2 = mapApplier;
                    e23.a aVar17 = new e23.a() { // from class: com.google.maps.android.compose.p0
                        @Override // e23.a
                        public final Object invoke() {
                            return TileOverlayKt.TileOverlay$lambda$7$lambda$6(mapApplier2, tileOverlayStateRememberTileOverlayState, lVar3, tileProvider2, z18, f19, z19, f18);
                        }
                    };
                    o0VarE.K(aVar17);
                    objQ = aVar17;
                }
                aVar3 = (e23.a) objQ;
                i34 = 0;
                o0VarE.g0(false);
                if (cVar instanceof MapApplier) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.H();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.d(new q0(i34), lVar3, o0VarE);
                final MapApplier mapApplier9 = mapApplier2;
                final boolean z4112 = z18;
                final float f217 = f19;
                final boolean z4113 = z19;
                final float f218 = f18;
                tileProvider2 = tileProvider;
                b4.d(new e23.p() { // from class: com.google.maps.android.compose.r0
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        return TileOverlayKt.TileOverlay$lambda$15$lambda$10(mapApplier9, tileProvider, z4112, f217, z4113, f218, (TileOverlayNode) obj, (TileProvider) obj2);
                    }
                }, tileProvider2, o0VarE);
                b4.d(new q0(i30), Boolean.valueOf(z18), o0VarE);
                b4.d(new q0(2), Float.valueOf(f19), o0VarE);
                b4.d(new q0(3), Boolean.valueOf(z19), o0VarE);
                b4.d(new q0(4), Float.valueOf(f18), o0VarE);
                o0VarE.g0(true);
                boolean z4114 = z19;
                lVar4 = lVar3;
                z34 = z18;
                z35 = z4114;
                f22 = f19;
                f24 = f18;
            } else {
                o0VarE.G0();
                i29 = i14 & 1;
                aVar = p3.m.f135153a;
                i30 = 1;
                if (i29 != 0) {
                    if ((i15 & 2) != 0) {
                        tileOverlayStateRememberTileOverlayState = rememberTileOverlayState(o0VarE, 0);
                        i16 &= -113;
                    }
                    if (i36 != 0) {
                        z16 = true;
                    }
                    if (i17 != 0) {
                        f16 = 0.0f;
                    }
                    if (i19 != 0) {
                        z17 = true;
                    }
                    if (i25 != 0) {
                        f17 = 0.0f;
                    }
                    if (i27 != 0) {
                        objH = q2.h(o0VarE, -1493227078, aVar);
                        if (objH == p3.m.a.f135155b) {
                            objH = new f0(13);
                            o0VarE.K(objH);
                        }
                        o0VarE.g0(false);
                        f18 = f17;
                        lVar3 = (e23.l) objH;
                        aVar2 = aVar;
                        z18 = z16;
                        z19 = z17;
                        f19 = f16;
                    } else {
                        z18 = z16;
                        aVar2 = aVar;
                        z19 = z17;
                        f19 = f16;
                        f18 = f17;
                        lVar3 = lVar2;
                    }
                } else {
                    if ((i15 & 2) != 0) {
                        tileOverlayStateRememberTileOverlayState = rememberTileOverlayState(o0VarE, 0);
                        i16 &= -113;
                    }
                    if (i36 != 0) {
                        z16 = true;
                    }
                    if (i17 != 0) {
                        f16 = 0.0f;
                    }
                    if (i19 != 0) {
                        z17 = true;
                    }
                    if (i25 != 0) {
                        f17 = 0.0f;
                    }
                    if (i27 != 0) {
                        objH = q2.h(o0VarE, -1493227078, aVar);
                        if (objH == p3.m.a.f135155b) {
                            objH = new f0(13);
                            o0VarE.K(objH);
                        }
                        o0VarE.g0(false);
                        f18 = f17;
                        lVar3 = (e23.l) objH;
                        aVar2 = aVar;
                        z18 = z16;
                        z19 = z17;
                        f19 = f16;
                    } else {
                        z18 = z16;
                        aVar2 = aVar;
                        z19 = z17;
                        f19 = f16;
                        f18 = f17;
                        lVar3 = lVar2;
                    }
                }
                o0VarE.h0();
                x1 x1Var8 = p3.n.f135158a;
                mapApplier = (MapApplier) cVar;
                o0VarE.C(-1493222491);
                boolean zR8 = o0VarE.r(mapApplier) | o0VarE.r(tileProvider2);
                if ((i16 & 896) == 256) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                boolean z31114 = zR8 | z24;
                if ((i16 & 7168) == 2048) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z31115 = z31114 | z25;
                if ((57344 & i16) == 16384) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                boolean z31116 = z31115 | z26;
                if ((458752 & i16) == 131072) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                boolean z31117 = z31116 | z27 | ((((i16 & 112) ^ 48) <= 32 && o0VarE.B(tileOverlayStateRememberTileOverlayState)) || (i16 & 48) == 32);
                if ((i16 & 3670016) == 1048576) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                z29 = z28 | z31117;
                objQ = o0VarE.q();
                if (z29) {
                    aVar2.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        mapApplier2 = mapApplier;
                        e23.a aVar18 = new e23.a() { // from class: com.google.maps.android.compose.p0
                            @Override // e23.a
                            public final Object invoke() {
                                return TileOverlayKt.TileOverlay$lambda$7$lambda$6(mapApplier2, tileOverlayStateRememberTileOverlayState, lVar3, tileProvider2, z18, f19, z19, f18);
                            }
                        };
                        o0VarE.K(aVar18);
                        objQ = aVar18;
                    } else {
                        mapApplier2 = mapApplier;
                    }
                } else {
                    mapApplier2 = mapApplier;
                    e23.a aVar19 = new e23.a() { // from class: com.google.maps.android.compose.p0
                        @Override // e23.a
                        public final Object invoke() {
                            return TileOverlayKt.TileOverlay$lambda$7$lambda$6(mapApplier2, tileOverlayStateRememberTileOverlayState, lVar3, tileProvider2, z18, f19, z19, f18);
                        }
                    };
                    o0VarE.K(aVar19);
                    objQ = aVar19;
                }
                aVar3 = (e23.a) objQ;
                i34 = 0;
                o0VarE.g0(false);
                if (cVar instanceof MapApplier) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.H();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.d(new q0(i34), lVar3, o0VarE);
                final MapApplier mapApplier10 = mapApplier2;
                final boolean z4115 = z18;
                final float f219 = f19;
                final boolean z4116 = z19;
                final float f2110 = f18;
                tileProvider2 = tileProvider;
                b4.d(new e23.p() { // from class: com.google.maps.android.compose.r0
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        return TileOverlayKt.TileOverlay$lambda$15$lambda$10(mapApplier10, tileProvider, z4115, f219, z4116, f2110, (TileOverlayNode) obj, (TileProvider) obj2);
                    }
                }, tileProvider2, o0VarE);
                b4.d(new q0(i30), Boolean.valueOf(z18), o0VarE);
                b4.d(new q0(2), Float.valueOf(f19), o0VarE);
                b4.d(new q0(3), Boolean.valueOf(z19), o0VarE);
                b4.d(new q0(4), Float.valueOf(f18), o0VarE);
                o0VarE.g0(true);
                boolean z4117 = z19;
                lVar4 = lVar3;
                z34 = z18;
                z35 = z4117;
                f22 = f19;
                f24 = f18;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.n0
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TileOverlayKt.TileOverlay$lambda$16(tileProvider2, tileOverlayStateRememberTileOverlayState, z34, f22, z35, f24, lVar4, i14, i15, (p3.m) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 384;
        z16 = z14;
        i17 = i15 & 8;
        if (i17 != 0) {
            if ((i14 & 3072) == 0) {
                f16 = f14;
                if (o0VarE.i(f16)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i16 |= i18;
            }
            i19 = i15 & 16;
            if (i19 != 0) {
                if ((i14 & 24576) == 0) {
                    z17 = z15;
                    if (o0VarE.h(z17)) {
                        i24 = 16384;
                    } else {
                        i24 = 8192;
                    }
                    i16 |= i24;
                }
                i25 = i15 & 32;
                if (i25 != 0) {
                    i16 |= 196608;
                    f17 = f15;
                } else {
                    f17 = f15;
                    if ((i14 & 196608) == 0) {
                        if (o0VarE.i(f17)) {
                            i26 = 131072;
                        } else {
                            i26 = 65536;
                        }
                        i16 |= i26;
                    }
                }
                i27 = i15 & 64;
                if (i27 != 0) {
                    i16 |= 1572864;
                    lVar2 = lVar;
                } else {
                    lVar2 = lVar;
                    if ((i14 & 1572864) == 0) {
                        if (o0VarE.r(lVar2)) {
                            i28 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i28 = 524288;
                        }
                        i16 |= i28;
                    }
                }
                if ((i16 & 599187) == 599186) {
                    o0VarE.G0();
                    i29 = i14 & 1;
                    aVar = p3.m.f135153a;
                    i30 = 1;
                    if (i29 != 0) {
                        if ((i15 & 2) != 0) {
                            tileOverlayStateRememberTileOverlayState = rememberTileOverlayState(o0VarE, 0);
                            i16 &= -113;
                        }
                        if (i36 != 0) {
                            z16 = true;
                        }
                        if (i17 != 0) {
                            f16 = 0.0f;
                        }
                        if (i19 != 0) {
                            z17 = true;
                        }
                        if (i25 != 0) {
                            f17 = 0.0f;
                        }
                        if (i27 != 0) {
                            objH = q2.h(o0VarE, -1493227078, aVar);
                            if (objH == p3.m.a.f135155b) {
                                objH = new f0(13);
                                o0VarE.K(objH);
                            }
                            o0VarE.g0(false);
                            f18 = f17;
                            lVar3 = (e23.l) objH;
                            aVar2 = aVar;
                            z18 = z16;
                            z19 = z17;
                            f19 = f16;
                        } else {
                            z18 = z16;
                            aVar2 = aVar;
                            z19 = z17;
                            f19 = f16;
                            f18 = f17;
                            lVar3 = lVar2;
                        }
                    } else {
                        if ((i15 & 2) != 0) {
                            tileOverlayStateRememberTileOverlayState = rememberTileOverlayState(o0VarE, 0);
                            i16 &= -113;
                        }
                        if (i36 != 0) {
                            z16 = true;
                        }
                        if (i17 != 0) {
                            f16 = 0.0f;
                        }
                        if (i19 != 0) {
                            z17 = true;
                        }
                        if (i25 != 0) {
                            f17 = 0.0f;
                        }
                        if (i27 != 0) {
                            objH = q2.h(o0VarE, -1493227078, aVar);
                            if (objH == p3.m.a.f135155b) {
                                objH = new f0(13);
                                o0VarE.K(objH);
                            }
                            o0VarE.g0(false);
                            f18 = f17;
                            lVar3 = (e23.l) objH;
                            aVar2 = aVar;
                            z18 = z16;
                            z19 = z17;
                            f19 = f16;
                        } else {
                            z18 = z16;
                            aVar2 = aVar;
                            z19 = z17;
                            f19 = f16;
                            f18 = f17;
                            lVar3 = lVar2;
                        }
                    }
                    o0VarE.h0();
                    x1 x1Var9 = p3.n.f135158a;
                    mapApplier = (MapApplier) cVar;
                    o0VarE.C(-1493222491);
                    boolean zR9 = o0VarE.r(mapApplier) | o0VarE.r(tileProvider2);
                    if ((i16 & 896) == 256) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    boolean z31118 = zR9 | z24;
                    if ((i16 & 7168) == 2048) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z31119 = z31118 | z25;
                    if ((57344 & i16) == 16384) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    boolean z311110 = z31119 | z26;
                    if ((458752 & i16) == 131072) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    boolean z311111 = z311110 | z27 | ((((i16 & 112) ^ 48) <= 32 && o0VarE.B(tileOverlayStateRememberTileOverlayState)) || (i16 & 48) == 32);
                    if ((i16 & 3670016) == 1048576) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    z29 = z28 | z311111;
                    objQ = o0VarE.q();
                    if (z29) {
                        aVar2.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            mapApplier2 = mapApplier;
                            e23.a aVar110 = new e23.a() { // from class: com.google.maps.android.compose.p0
                                @Override // e23.a
                                public final Object invoke() {
                                    return TileOverlayKt.TileOverlay$lambda$7$lambda$6(mapApplier2, tileOverlayStateRememberTileOverlayState, lVar3, tileProvider2, z18, f19, z19, f18);
                                }
                            };
                            o0VarE.K(aVar110);
                            objQ = aVar110;
                        } else {
                            mapApplier2 = mapApplier;
                        }
                    } else {
                        mapApplier2 = mapApplier;
                        e23.a aVar111 = new e23.a() { // from class: com.google.maps.android.compose.p0
                            @Override // e23.a
                            public final Object invoke() {
                                return TileOverlayKt.TileOverlay$lambda$7$lambda$6(mapApplier2, tileOverlayStateRememberTileOverlayState, lVar3, tileProvider2, z18, f19, z19, f18);
                            }
                        };
                        o0VarE.K(aVar111);
                        objQ = aVar111;
                    }
                    aVar3 = (e23.a) objQ;
                    i34 = 0;
                    o0VarE.g0(false);
                    if (cVar instanceof MapApplier) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.H();
                    if (o0VarE.T) {
                        o0VarE.M(aVar3);
                    } else {
                        o0VarE.c();
                    }
                    b4.d(new q0(i34), lVar3, o0VarE);
                    final MapApplier mapApplier11 = mapApplier2;
                    final boolean z4118 = z18;
                    final float f2111 = f19;
                    final boolean z4119 = z19;
                    final float f2112 = f18;
                    tileProvider2 = tileProvider;
                    b4.d(new e23.p() { // from class: com.google.maps.android.compose.r0
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            return TileOverlayKt.TileOverlay$lambda$15$lambda$10(mapApplier11, tileProvider, z4118, f2111, z4119, f2112, (TileOverlayNode) obj, (TileProvider) obj2);
                        }
                    }, tileProvider2, o0VarE);
                    b4.d(new q0(i30), Boolean.valueOf(z18), o0VarE);
                    b4.d(new q0(2), Float.valueOf(f19), o0VarE);
                    b4.d(new q0(3), Boolean.valueOf(z19), o0VarE);
                    b4.d(new q0(4), Float.valueOf(f18), o0VarE);
                    o0VarE.g0(true);
                    boolean z41110 = z19;
                    lVar4 = lVar3;
                    z34 = z18;
                    z35 = z41110;
                    f22 = f19;
                    f24 = f18;
                } else {
                    o0VarE.G0();
                    i29 = i14 & 1;
                    aVar = p3.m.f135153a;
                    i30 = 1;
                    if (i29 != 0) {
                        if ((i15 & 2) != 0) {
                            tileOverlayStateRememberTileOverlayState = rememberTileOverlayState(o0VarE, 0);
                            i16 &= -113;
                        }
                        if (i36 != 0) {
                            z16 = true;
                        }
                        if (i17 != 0) {
                            f16 = 0.0f;
                        }
                        if (i19 != 0) {
                            z17 = true;
                        }
                        if (i25 != 0) {
                            f17 = 0.0f;
                        }
                        if (i27 != 0) {
                            objH = q2.h(o0VarE, -1493227078, aVar);
                            if (objH == p3.m.a.f135155b) {
                                objH = new f0(13);
                                o0VarE.K(objH);
                            }
                            o0VarE.g0(false);
                            f18 = f17;
                            lVar3 = (e23.l) objH;
                            aVar2 = aVar;
                            z18 = z16;
                            z19 = z17;
                            f19 = f16;
                        } else {
                            z18 = z16;
                            aVar2 = aVar;
                            z19 = z17;
                            f19 = f16;
                            f18 = f17;
                            lVar3 = lVar2;
                        }
                    } else {
                        if ((i15 & 2) != 0) {
                            tileOverlayStateRememberTileOverlayState = rememberTileOverlayState(o0VarE, 0);
                            i16 &= -113;
                        }
                        if (i36 != 0) {
                            z16 = true;
                        }
                        if (i17 != 0) {
                            f16 = 0.0f;
                        }
                        if (i19 != 0) {
                            z17 = true;
                        }
                        if (i25 != 0) {
                            f17 = 0.0f;
                        }
                        if (i27 != 0) {
                            objH = q2.h(o0VarE, -1493227078, aVar);
                            if (objH == p3.m.a.f135155b) {
                                objH = new f0(13);
                                o0VarE.K(objH);
                            }
                            o0VarE.g0(false);
                            f18 = f17;
                            lVar3 = (e23.l) objH;
                            aVar2 = aVar;
                            z18 = z16;
                            z19 = z17;
                            f19 = f16;
                        } else {
                            z18 = z16;
                            aVar2 = aVar;
                            z19 = z17;
                            f19 = f16;
                            f18 = f17;
                            lVar3 = lVar2;
                        }
                    }
                    o0VarE.h0();
                    x1 x1Var10 = p3.n.f135158a;
                    mapApplier = (MapApplier) cVar;
                    o0VarE.C(-1493222491);
                    boolean zR10 = o0VarE.r(mapApplier) | o0VarE.r(tileProvider2);
                    if ((i16 & 896) == 256) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    boolean z311112 = zR10 | z24;
                    if ((i16 & 7168) == 2048) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z311113 = z311112 | z25;
                    if ((57344 & i16) == 16384) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    boolean z311114 = z311113 | z26;
                    if ((458752 & i16) == 131072) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    boolean z311115 = z311114 | z27 | ((((i16 & 112) ^ 48) <= 32 && o0VarE.B(tileOverlayStateRememberTileOverlayState)) || (i16 & 48) == 32);
                    if ((i16 & 3670016) == 1048576) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    z29 = z28 | z311115;
                    objQ = o0VarE.q();
                    if (z29) {
                        aVar2.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            mapApplier2 = mapApplier;
                            e23.a aVar112 = new e23.a() { // from class: com.google.maps.android.compose.p0
                                @Override // e23.a
                                public final Object invoke() {
                                    return TileOverlayKt.TileOverlay$lambda$7$lambda$6(mapApplier2, tileOverlayStateRememberTileOverlayState, lVar3, tileProvider2, z18, f19, z19, f18);
                                }
                            };
                            o0VarE.K(aVar112);
                            objQ = aVar112;
                        } else {
                            mapApplier2 = mapApplier;
                        }
                    } else {
                        mapApplier2 = mapApplier;
                        e23.a aVar113 = new e23.a() { // from class: com.google.maps.android.compose.p0
                            @Override // e23.a
                            public final Object invoke() {
                                return TileOverlayKt.TileOverlay$lambda$7$lambda$6(mapApplier2, tileOverlayStateRememberTileOverlayState, lVar3, tileProvider2, z18, f19, z19, f18);
                            }
                        };
                        o0VarE.K(aVar113);
                        objQ = aVar113;
                    }
                    aVar3 = (e23.a) objQ;
                    i34 = 0;
                    o0VarE.g0(false);
                    if (cVar instanceof MapApplier) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.H();
                    if (o0VarE.T) {
                        o0VarE.M(aVar3);
                    } else {
                        o0VarE.c();
                    }
                    b4.d(new q0(i34), lVar3, o0VarE);
                    final MapApplier mapApplier12 = mapApplier2;
                    final boolean z41111 = z18;
                    final float f2113 = f19;
                    final boolean z41112 = z19;
                    final float f2114 = f18;
                    tileProvider2 = tileProvider;
                    b4.d(new e23.p() { // from class: com.google.maps.android.compose.r0
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            return TileOverlayKt.TileOverlay$lambda$15$lambda$10(mapApplier12, tileProvider, z41111, f2113, z41112, f2114, (TileOverlayNode) obj, (TileProvider) obj2);
                        }
                    }, tileProvider2, o0VarE);
                    b4.d(new q0(i30), Boolean.valueOf(z18), o0VarE);
                    b4.d(new q0(2), Float.valueOf(f19), o0VarE);
                    b4.d(new q0(3), Boolean.valueOf(z19), o0VarE);
                    b4.d(new q0(4), Float.valueOf(f18), o0VarE);
                    o0VarE.g0(true);
                    boolean z41113 = z19;
                    lVar4 = lVar3;
                    z34 = z18;
                    z35 = z41113;
                    f22 = f19;
                    f24 = f18;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.n0
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TileOverlayKt.TileOverlay$lambda$16(tileProvider2, tileOverlayStateRememberTileOverlayState, z34, f22, z35, f24, lVar4, i14, i15, (p3.m) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 24576;
            z17 = z15;
            i25 = i15 & 32;
            if (i25 != 0) {
                i16 |= 196608;
                f17 = f15;
            } else {
                f17 = f15;
                if ((i14 & 196608) == 0) {
                    if (o0VarE.i(f17)) {
                        i26 = 131072;
                    } else {
                        i26 = 65536;
                    }
                    i16 |= i26;
                }
            }
            i27 = i15 & 64;
            if (i27 != 0) {
                i16 |= 1572864;
                lVar2 = lVar;
            } else {
                lVar2 = lVar;
                if ((i14 & 1572864) == 0) {
                    if (o0VarE.r(lVar2)) {
                        i28 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i28 = 524288;
                    }
                    i16 |= i28;
                }
            }
            if ((i16 & 599187) == 599186) {
                o0VarE.G0();
                i29 = i14 & 1;
                aVar = p3.m.f135153a;
                i30 = 1;
                if (i29 != 0) {
                    if ((i15 & 2) != 0) {
                        tileOverlayStateRememberTileOverlayState = rememberTileOverlayState(o0VarE, 0);
                        i16 &= -113;
                    }
                    if (i36 != 0) {
                        z16 = true;
                    }
                    if (i17 != 0) {
                        f16 = 0.0f;
                    }
                    if (i19 != 0) {
                        z17 = true;
                    }
                    if (i25 != 0) {
                        f17 = 0.0f;
                    }
                    if (i27 != 0) {
                        objH = q2.h(o0VarE, -1493227078, aVar);
                        if (objH == p3.m.a.f135155b) {
                            objH = new f0(13);
                            o0VarE.K(objH);
                        }
                        o0VarE.g0(false);
                        f18 = f17;
                        lVar3 = (e23.l) objH;
                        aVar2 = aVar;
                        z18 = z16;
                        z19 = z17;
                        f19 = f16;
                    } else {
                        z18 = z16;
                        aVar2 = aVar;
                        z19 = z17;
                        f19 = f16;
                        f18 = f17;
                        lVar3 = lVar2;
                    }
                } else {
                    if ((i15 & 2) != 0) {
                        tileOverlayStateRememberTileOverlayState = rememberTileOverlayState(o0VarE, 0);
                        i16 &= -113;
                    }
                    if (i36 != 0) {
                        z16 = true;
                    }
                    if (i17 != 0) {
                        f16 = 0.0f;
                    }
                    if (i19 != 0) {
                        z17 = true;
                    }
                    if (i25 != 0) {
                        f17 = 0.0f;
                    }
                    if (i27 != 0) {
                        objH = q2.h(o0VarE, -1493227078, aVar);
                        if (objH == p3.m.a.f135155b) {
                            objH = new f0(13);
                            o0VarE.K(objH);
                        }
                        o0VarE.g0(false);
                        f18 = f17;
                        lVar3 = (e23.l) objH;
                        aVar2 = aVar;
                        z18 = z16;
                        z19 = z17;
                        f19 = f16;
                    } else {
                        z18 = z16;
                        aVar2 = aVar;
                        z19 = z17;
                        f19 = f16;
                        f18 = f17;
                        lVar3 = lVar2;
                    }
                }
                o0VarE.h0();
                x1 x1Var11 = p3.n.f135158a;
                mapApplier = (MapApplier) cVar;
                o0VarE.C(-1493222491);
                boolean zR11 = o0VarE.r(mapApplier) | o0VarE.r(tileProvider2);
                if ((i16 & 896) == 256) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                boolean z311116 = zR11 | z24;
                if ((i16 & 7168) == 2048) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z311117 = z311116 | z25;
                if ((57344 & i16) == 16384) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                boolean z311118 = z311117 | z26;
                if ((458752 & i16) == 131072) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                boolean z311119 = z311118 | z27 | ((((i16 & 112) ^ 48) <= 32 && o0VarE.B(tileOverlayStateRememberTileOverlayState)) || (i16 & 48) == 32);
                if ((i16 & 3670016) == 1048576) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                z29 = z28 | z311119;
                objQ = o0VarE.q();
                if (z29) {
                    aVar2.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        mapApplier2 = mapApplier;
                        e23.a aVar114 = new e23.a() { // from class: com.google.maps.android.compose.p0
                            @Override // e23.a
                            public final Object invoke() {
                                return TileOverlayKt.TileOverlay$lambda$7$lambda$6(mapApplier2, tileOverlayStateRememberTileOverlayState, lVar3, tileProvider2, z18, f19, z19, f18);
                            }
                        };
                        o0VarE.K(aVar114);
                        objQ = aVar114;
                    } else {
                        mapApplier2 = mapApplier;
                    }
                } else {
                    mapApplier2 = mapApplier;
                    e23.a aVar115 = new e23.a() { // from class: com.google.maps.android.compose.p0
                        @Override // e23.a
                        public final Object invoke() {
                            return TileOverlayKt.TileOverlay$lambda$7$lambda$6(mapApplier2, tileOverlayStateRememberTileOverlayState, lVar3, tileProvider2, z18, f19, z19, f18);
                        }
                    };
                    o0VarE.K(aVar115);
                    objQ = aVar115;
                }
                aVar3 = (e23.a) objQ;
                i34 = 0;
                o0VarE.g0(false);
                if (cVar instanceof MapApplier) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.H();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.d(new q0(i34), lVar3, o0VarE);
                final MapApplier mapApplier13 = mapApplier2;
                final boolean z41114 = z18;
                final float f2115 = f19;
                final boolean z41115 = z19;
                final float f2116 = f18;
                tileProvider2 = tileProvider;
                b4.d(new e23.p() { // from class: com.google.maps.android.compose.r0
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        return TileOverlayKt.TileOverlay$lambda$15$lambda$10(mapApplier13, tileProvider, z41114, f2115, z41115, f2116, (TileOverlayNode) obj, (TileProvider) obj2);
                    }
                }, tileProvider2, o0VarE);
                b4.d(new q0(i30), Boolean.valueOf(z18), o0VarE);
                b4.d(new q0(2), Float.valueOf(f19), o0VarE);
                b4.d(new q0(3), Boolean.valueOf(z19), o0VarE);
                b4.d(new q0(4), Float.valueOf(f18), o0VarE);
                o0VarE.g0(true);
                boolean z41116 = z19;
                lVar4 = lVar3;
                z34 = z18;
                z35 = z41116;
                f22 = f19;
                f24 = f18;
            } else {
                o0VarE.G0();
                i29 = i14 & 1;
                aVar = p3.m.f135153a;
                i30 = 1;
                if (i29 != 0) {
                    if ((i15 & 2) != 0) {
                        tileOverlayStateRememberTileOverlayState = rememberTileOverlayState(o0VarE, 0);
                        i16 &= -113;
                    }
                    if (i36 != 0) {
                        z16 = true;
                    }
                    if (i17 != 0) {
                        f16 = 0.0f;
                    }
                    if (i19 != 0) {
                        z17 = true;
                    }
                    if (i25 != 0) {
                        f17 = 0.0f;
                    }
                    if (i27 != 0) {
                        objH = q2.h(o0VarE, -1493227078, aVar);
                        if (objH == p3.m.a.f135155b) {
                            objH = new f0(13);
                            o0VarE.K(objH);
                        }
                        o0VarE.g0(false);
                        f18 = f17;
                        lVar3 = (e23.l) objH;
                        aVar2 = aVar;
                        z18 = z16;
                        z19 = z17;
                        f19 = f16;
                    } else {
                        z18 = z16;
                        aVar2 = aVar;
                        z19 = z17;
                        f19 = f16;
                        f18 = f17;
                        lVar3 = lVar2;
                    }
                } else {
                    if ((i15 & 2) != 0) {
                        tileOverlayStateRememberTileOverlayState = rememberTileOverlayState(o0VarE, 0);
                        i16 &= -113;
                    }
                    if (i36 != 0) {
                        z16 = true;
                    }
                    if (i17 != 0) {
                        f16 = 0.0f;
                    }
                    if (i19 != 0) {
                        z17 = true;
                    }
                    if (i25 != 0) {
                        f17 = 0.0f;
                    }
                    if (i27 != 0) {
                        objH = q2.h(o0VarE, -1493227078, aVar);
                        if (objH == p3.m.a.f135155b) {
                            objH = new f0(13);
                            o0VarE.K(objH);
                        }
                        o0VarE.g0(false);
                        f18 = f17;
                        lVar3 = (e23.l) objH;
                        aVar2 = aVar;
                        z18 = z16;
                        z19 = z17;
                        f19 = f16;
                    } else {
                        z18 = z16;
                        aVar2 = aVar;
                        z19 = z17;
                        f19 = f16;
                        f18 = f17;
                        lVar3 = lVar2;
                    }
                }
                o0VarE.h0();
                x1 x1Var12 = p3.n.f135158a;
                mapApplier = (MapApplier) cVar;
                o0VarE.C(-1493222491);
                boolean zR12 = o0VarE.r(mapApplier) | o0VarE.r(tileProvider2);
                if ((i16 & 896) == 256) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                boolean z3111110 = zR12 | z24;
                if ((i16 & 7168) == 2048) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z3111111 = z3111110 | z25;
                if ((57344 & i16) == 16384) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                boolean z3111112 = z3111111 | z26;
                if ((458752 & i16) == 131072) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                boolean z3111113 = z3111112 | z27 | ((((i16 & 112) ^ 48) <= 32 && o0VarE.B(tileOverlayStateRememberTileOverlayState)) || (i16 & 48) == 32);
                if ((i16 & 3670016) == 1048576) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                z29 = z28 | z3111113;
                objQ = o0VarE.q();
                if (z29) {
                    aVar2.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        mapApplier2 = mapApplier;
                        e23.a aVar116 = new e23.a() { // from class: com.google.maps.android.compose.p0
                            @Override // e23.a
                            public final Object invoke() {
                                return TileOverlayKt.TileOverlay$lambda$7$lambda$6(mapApplier2, tileOverlayStateRememberTileOverlayState, lVar3, tileProvider2, z18, f19, z19, f18);
                            }
                        };
                        o0VarE.K(aVar116);
                        objQ = aVar116;
                    } else {
                        mapApplier2 = mapApplier;
                    }
                } else {
                    mapApplier2 = mapApplier;
                    e23.a aVar117 = new e23.a() { // from class: com.google.maps.android.compose.p0
                        @Override // e23.a
                        public final Object invoke() {
                            return TileOverlayKt.TileOverlay$lambda$7$lambda$6(mapApplier2, tileOverlayStateRememberTileOverlayState, lVar3, tileProvider2, z18, f19, z19, f18);
                        }
                    };
                    o0VarE.K(aVar117);
                    objQ = aVar117;
                }
                aVar3 = (e23.a) objQ;
                i34 = 0;
                o0VarE.g0(false);
                if (cVar instanceof MapApplier) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.H();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.d(new q0(i34), lVar3, o0VarE);
                final MapApplier mapApplier14 = mapApplier2;
                final boolean z41117 = z18;
                final float f2117 = f19;
                final boolean z41118 = z19;
                final float f2118 = f18;
                tileProvider2 = tileProvider;
                b4.d(new e23.p() { // from class: com.google.maps.android.compose.r0
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        return TileOverlayKt.TileOverlay$lambda$15$lambda$10(mapApplier14, tileProvider, z41117, f2117, z41118, f2118, (TileOverlayNode) obj, (TileProvider) obj2);
                    }
                }, tileProvider2, o0VarE);
                b4.d(new q0(i30), Boolean.valueOf(z18), o0VarE);
                b4.d(new q0(2), Float.valueOf(f19), o0VarE);
                b4.d(new q0(3), Boolean.valueOf(z19), o0VarE);
                b4.d(new q0(4), Float.valueOf(f18), o0VarE);
                o0VarE.g0(true);
                boolean z41119 = z19;
                lVar4 = lVar3;
                z34 = z18;
                z35 = z41119;
                f22 = f19;
                f24 = f18;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.n0
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TileOverlayKt.TileOverlay$lambda$16(tileProvider2, tileOverlayStateRememberTileOverlayState, z34, f22, z35, f24, lVar4, i14, i15, (p3.m) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 3072;
        f16 = f14;
        i19 = i15 & 16;
        if (i19 != 0) {
            if ((i14 & 24576) == 0) {
                z17 = z15;
                if (o0VarE.h(z17)) {
                    i24 = 16384;
                } else {
                    i24 = 8192;
                }
                i16 |= i24;
            }
            i25 = i15 & 32;
            if (i25 != 0) {
                i16 |= 196608;
                f17 = f15;
            } else {
                f17 = f15;
                if ((i14 & 196608) == 0) {
                    if (o0VarE.i(f17)) {
                        i26 = 131072;
                    } else {
                        i26 = 65536;
                    }
                    i16 |= i26;
                }
            }
            i27 = i15 & 64;
            if (i27 != 0) {
                i16 |= 1572864;
                lVar2 = lVar;
            } else {
                lVar2 = lVar;
                if ((i14 & 1572864) == 0) {
                    if (o0VarE.r(lVar2)) {
                        i28 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i28 = 524288;
                    }
                    i16 |= i28;
                }
            }
            if ((i16 & 599187) == 599186) {
                o0VarE.G0();
                i29 = i14 & 1;
                aVar = p3.m.f135153a;
                i30 = 1;
                if (i29 != 0) {
                    if ((i15 & 2) != 0) {
                        tileOverlayStateRememberTileOverlayState = rememberTileOverlayState(o0VarE, 0);
                        i16 &= -113;
                    }
                    if (i36 != 0) {
                        z16 = true;
                    }
                    if (i17 != 0) {
                        f16 = 0.0f;
                    }
                    if (i19 != 0) {
                        z17 = true;
                    }
                    if (i25 != 0) {
                        f17 = 0.0f;
                    }
                    if (i27 != 0) {
                        objH = q2.h(o0VarE, -1493227078, aVar);
                        if (objH == p3.m.a.f135155b) {
                            objH = new f0(13);
                            o0VarE.K(objH);
                        }
                        o0VarE.g0(false);
                        f18 = f17;
                        lVar3 = (e23.l) objH;
                        aVar2 = aVar;
                        z18 = z16;
                        z19 = z17;
                        f19 = f16;
                    } else {
                        z18 = z16;
                        aVar2 = aVar;
                        z19 = z17;
                        f19 = f16;
                        f18 = f17;
                        lVar3 = lVar2;
                    }
                } else {
                    if ((i15 & 2) != 0) {
                        tileOverlayStateRememberTileOverlayState = rememberTileOverlayState(o0VarE, 0);
                        i16 &= -113;
                    }
                    if (i36 != 0) {
                        z16 = true;
                    }
                    if (i17 != 0) {
                        f16 = 0.0f;
                    }
                    if (i19 != 0) {
                        z17 = true;
                    }
                    if (i25 != 0) {
                        f17 = 0.0f;
                    }
                    if (i27 != 0) {
                        objH = q2.h(o0VarE, -1493227078, aVar);
                        if (objH == p3.m.a.f135155b) {
                            objH = new f0(13);
                            o0VarE.K(objH);
                        }
                        o0VarE.g0(false);
                        f18 = f17;
                        lVar3 = (e23.l) objH;
                        aVar2 = aVar;
                        z18 = z16;
                        z19 = z17;
                        f19 = f16;
                    } else {
                        z18 = z16;
                        aVar2 = aVar;
                        z19 = z17;
                        f19 = f16;
                        f18 = f17;
                        lVar3 = lVar2;
                    }
                }
                o0VarE.h0();
                x1 x1Var13 = p3.n.f135158a;
                mapApplier = (MapApplier) cVar;
                o0VarE.C(-1493222491);
                boolean zR13 = o0VarE.r(mapApplier) | o0VarE.r(tileProvider2);
                if ((i16 & 896) == 256) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                boolean z3111114 = zR13 | z24;
                if ((i16 & 7168) == 2048) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z3111115 = z3111114 | z25;
                if ((57344 & i16) == 16384) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                boolean z3111116 = z3111115 | z26;
                if ((458752 & i16) == 131072) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                boolean z3111117 = z3111116 | z27 | ((((i16 & 112) ^ 48) <= 32 && o0VarE.B(tileOverlayStateRememberTileOverlayState)) || (i16 & 48) == 32);
                if ((i16 & 3670016) == 1048576) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                z29 = z28 | z3111117;
                objQ = o0VarE.q();
                if (z29) {
                    aVar2.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        mapApplier2 = mapApplier;
                        e23.a aVar118 = new e23.a() { // from class: com.google.maps.android.compose.p0
                            @Override // e23.a
                            public final Object invoke() {
                                return TileOverlayKt.TileOverlay$lambda$7$lambda$6(mapApplier2, tileOverlayStateRememberTileOverlayState, lVar3, tileProvider2, z18, f19, z19, f18);
                            }
                        };
                        o0VarE.K(aVar118);
                        objQ = aVar118;
                    } else {
                        mapApplier2 = mapApplier;
                    }
                } else {
                    mapApplier2 = mapApplier;
                    e23.a aVar119 = new e23.a() { // from class: com.google.maps.android.compose.p0
                        @Override // e23.a
                        public final Object invoke() {
                            return TileOverlayKt.TileOverlay$lambda$7$lambda$6(mapApplier2, tileOverlayStateRememberTileOverlayState, lVar3, tileProvider2, z18, f19, z19, f18);
                        }
                    };
                    o0VarE.K(aVar119);
                    objQ = aVar119;
                }
                aVar3 = (e23.a) objQ;
                i34 = 0;
                o0VarE.g0(false);
                if (cVar instanceof MapApplier) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.H();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.d(new q0(i34), lVar3, o0VarE);
                final MapApplier mapApplier15 = mapApplier2;
                final boolean z411110 = z18;
                final float f2119 = f19;
                final boolean z411111 = z19;
                final float f21110 = f18;
                tileProvider2 = tileProvider;
                b4.d(new e23.p() { // from class: com.google.maps.android.compose.r0
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        return TileOverlayKt.TileOverlay$lambda$15$lambda$10(mapApplier15, tileProvider, z411110, f2119, z411111, f21110, (TileOverlayNode) obj, (TileProvider) obj2);
                    }
                }, tileProvider2, o0VarE);
                b4.d(new q0(i30), Boolean.valueOf(z18), o0VarE);
                b4.d(new q0(2), Float.valueOf(f19), o0VarE);
                b4.d(new q0(3), Boolean.valueOf(z19), o0VarE);
                b4.d(new q0(4), Float.valueOf(f18), o0VarE);
                o0VarE.g0(true);
                boolean z411112 = z19;
                lVar4 = lVar3;
                z34 = z18;
                z35 = z411112;
                f22 = f19;
                f24 = f18;
            } else {
                o0VarE.G0();
                i29 = i14 & 1;
                aVar = p3.m.f135153a;
                i30 = 1;
                if (i29 != 0) {
                    if ((i15 & 2) != 0) {
                        tileOverlayStateRememberTileOverlayState = rememberTileOverlayState(o0VarE, 0);
                        i16 &= -113;
                    }
                    if (i36 != 0) {
                        z16 = true;
                    }
                    if (i17 != 0) {
                        f16 = 0.0f;
                    }
                    if (i19 != 0) {
                        z17 = true;
                    }
                    if (i25 != 0) {
                        f17 = 0.0f;
                    }
                    if (i27 != 0) {
                        objH = q2.h(o0VarE, -1493227078, aVar);
                        if (objH == p3.m.a.f135155b) {
                            objH = new f0(13);
                            o0VarE.K(objH);
                        }
                        o0VarE.g0(false);
                        f18 = f17;
                        lVar3 = (e23.l) objH;
                        aVar2 = aVar;
                        z18 = z16;
                        z19 = z17;
                        f19 = f16;
                    } else {
                        z18 = z16;
                        aVar2 = aVar;
                        z19 = z17;
                        f19 = f16;
                        f18 = f17;
                        lVar3 = lVar2;
                    }
                } else {
                    if ((i15 & 2) != 0) {
                        tileOverlayStateRememberTileOverlayState = rememberTileOverlayState(o0VarE, 0);
                        i16 &= -113;
                    }
                    if (i36 != 0) {
                        z16 = true;
                    }
                    if (i17 != 0) {
                        f16 = 0.0f;
                    }
                    if (i19 != 0) {
                        z17 = true;
                    }
                    if (i25 != 0) {
                        f17 = 0.0f;
                    }
                    if (i27 != 0) {
                        objH = q2.h(o0VarE, -1493227078, aVar);
                        if (objH == p3.m.a.f135155b) {
                            objH = new f0(13);
                            o0VarE.K(objH);
                        }
                        o0VarE.g0(false);
                        f18 = f17;
                        lVar3 = (e23.l) objH;
                        aVar2 = aVar;
                        z18 = z16;
                        z19 = z17;
                        f19 = f16;
                    } else {
                        z18 = z16;
                        aVar2 = aVar;
                        z19 = z17;
                        f19 = f16;
                        f18 = f17;
                        lVar3 = lVar2;
                    }
                }
                o0VarE.h0();
                x1 x1Var14 = p3.n.f135158a;
                mapApplier = (MapApplier) cVar;
                o0VarE.C(-1493222491);
                boolean zR14 = o0VarE.r(mapApplier) | o0VarE.r(tileProvider2);
                if ((i16 & 896) == 256) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                boolean z3111118 = zR14 | z24;
                if ((i16 & 7168) == 2048) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z3111119 = z3111118 | z25;
                if ((57344 & i16) == 16384) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                boolean z31111110 = z3111119 | z26;
                if ((458752 & i16) == 131072) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                boolean z31111111 = z31111110 | z27 | ((((i16 & 112) ^ 48) <= 32 && o0VarE.B(tileOverlayStateRememberTileOverlayState)) || (i16 & 48) == 32);
                if ((i16 & 3670016) == 1048576) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                z29 = z28 | z31111111;
                objQ = o0VarE.q();
                if (z29) {
                    aVar2.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        mapApplier2 = mapApplier;
                        e23.a aVar1110 = new e23.a() { // from class: com.google.maps.android.compose.p0
                            @Override // e23.a
                            public final Object invoke() {
                                return TileOverlayKt.TileOverlay$lambda$7$lambda$6(mapApplier2, tileOverlayStateRememberTileOverlayState, lVar3, tileProvider2, z18, f19, z19, f18);
                            }
                        };
                        o0VarE.K(aVar1110);
                        objQ = aVar1110;
                    } else {
                        mapApplier2 = mapApplier;
                    }
                } else {
                    mapApplier2 = mapApplier;
                    e23.a aVar1111 = new e23.a() { // from class: com.google.maps.android.compose.p0
                        @Override // e23.a
                        public final Object invoke() {
                            return TileOverlayKt.TileOverlay$lambda$7$lambda$6(mapApplier2, tileOverlayStateRememberTileOverlayState, lVar3, tileProvider2, z18, f19, z19, f18);
                        }
                    };
                    o0VarE.K(aVar1111);
                    objQ = aVar1111;
                }
                aVar3 = (e23.a) objQ;
                i34 = 0;
                o0VarE.g0(false);
                if (cVar instanceof MapApplier) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.H();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.d(new q0(i34), lVar3, o0VarE);
                final MapApplier mapApplier16 = mapApplier2;
                final boolean z411113 = z18;
                final float f21111 = f19;
                final boolean z411114 = z19;
                final float f21112 = f18;
                tileProvider2 = tileProvider;
                b4.d(new e23.p() { // from class: com.google.maps.android.compose.r0
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        return TileOverlayKt.TileOverlay$lambda$15$lambda$10(mapApplier16, tileProvider, z411113, f21111, z411114, f21112, (TileOverlayNode) obj, (TileProvider) obj2);
                    }
                }, tileProvider2, o0VarE);
                b4.d(new q0(i30), Boolean.valueOf(z18), o0VarE);
                b4.d(new q0(2), Float.valueOf(f19), o0VarE);
                b4.d(new q0(3), Boolean.valueOf(z19), o0VarE);
                b4.d(new q0(4), Float.valueOf(f18), o0VarE);
                o0VarE.g0(true);
                boolean z411115 = z19;
                lVar4 = lVar3;
                z34 = z18;
                z35 = z411115;
                f22 = f19;
                f24 = f18;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.n0
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TileOverlayKt.TileOverlay$lambda$16(tileProvider2, tileOverlayStateRememberTileOverlayState, z34, f22, z35, f24, lVar4, i14, i15, (p3.m) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 24576;
        z17 = z15;
        i25 = i15 & 32;
        if (i25 != 0) {
            i16 |= 196608;
            f17 = f15;
        } else {
            f17 = f15;
            if ((i14 & 196608) == 0) {
                if (o0VarE.i(f17)) {
                    i26 = 131072;
                } else {
                    i26 = 65536;
                }
                i16 |= i26;
            }
        }
        i27 = i15 & 64;
        if (i27 != 0) {
            i16 |= 1572864;
            lVar2 = lVar;
        } else {
            lVar2 = lVar;
            if ((i14 & 1572864) == 0) {
                if (o0VarE.r(lVar2)) {
                    i28 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i28 = 524288;
                }
                i16 |= i28;
            }
        }
        if ((i16 & 599187) == 599186) {
            o0VarE.G0();
            i29 = i14 & 1;
            aVar = p3.m.f135153a;
            i30 = 1;
            if (i29 != 0) {
                if ((i15 & 2) != 0) {
                    tileOverlayStateRememberTileOverlayState = rememberTileOverlayState(o0VarE, 0);
                    i16 &= -113;
                }
                if (i36 != 0) {
                    z16 = true;
                }
                if (i17 != 0) {
                    f16 = 0.0f;
                }
                if (i19 != 0) {
                    z17 = true;
                }
                if (i25 != 0) {
                    f17 = 0.0f;
                }
                if (i27 != 0) {
                    objH = q2.h(o0VarE, -1493227078, aVar);
                    if (objH == p3.m.a.f135155b) {
                        objH = new f0(13);
                        o0VarE.K(objH);
                    }
                    o0VarE.g0(false);
                    f18 = f17;
                    lVar3 = (e23.l) objH;
                    aVar2 = aVar;
                    z18 = z16;
                    z19 = z17;
                    f19 = f16;
                } else {
                    z18 = z16;
                    aVar2 = aVar;
                    z19 = z17;
                    f19 = f16;
                    f18 = f17;
                    lVar3 = lVar2;
                }
            } else {
                if ((i15 & 2) != 0) {
                    tileOverlayStateRememberTileOverlayState = rememberTileOverlayState(o0VarE, 0);
                    i16 &= -113;
                }
                if (i36 != 0) {
                    z16 = true;
                }
                if (i17 != 0) {
                    f16 = 0.0f;
                }
                if (i19 != 0) {
                    z17 = true;
                }
                if (i25 != 0) {
                    f17 = 0.0f;
                }
                if (i27 != 0) {
                    objH = q2.h(o0VarE, -1493227078, aVar);
                    if (objH == p3.m.a.f135155b) {
                        objH = new f0(13);
                        o0VarE.K(objH);
                    }
                    o0VarE.g0(false);
                    f18 = f17;
                    lVar3 = (e23.l) objH;
                    aVar2 = aVar;
                    z18 = z16;
                    z19 = z17;
                    f19 = f16;
                } else {
                    z18 = z16;
                    aVar2 = aVar;
                    z19 = z17;
                    f19 = f16;
                    f18 = f17;
                    lVar3 = lVar2;
                }
            }
            o0VarE.h0();
            x1 x1Var15 = p3.n.f135158a;
            mapApplier = (MapApplier) cVar;
            o0VarE.C(-1493222491);
            boolean zR15 = o0VarE.r(mapApplier) | o0VarE.r(tileProvider2);
            if ((i16 & 896) == 256) {
                z24 = true;
            } else {
                z24 = false;
            }
            boolean z31111112 = zR15 | z24;
            if ((i16 & 7168) == 2048) {
                z25 = true;
            } else {
                z25 = false;
            }
            boolean z31111113 = z31111112 | z25;
            if ((57344 & i16) == 16384) {
                z26 = true;
            } else {
                z26 = false;
            }
            boolean z31111114 = z31111113 | z26;
            if ((458752 & i16) == 131072) {
                z27 = true;
            } else {
                z27 = false;
            }
            boolean z31111115 = z31111114 | z27 | ((((i16 & 112) ^ 48) <= 32 && o0VarE.B(tileOverlayStateRememberTileOverlayState)) || (i16 & 48) == 32);
            if ((i16 & 3670016) == 1048576) {
                z28 = true;
            } else {
                z28 = false;
            }
            z29 = z28 | z31111115;
            objQ = o0VarE.q();
            if (z29) {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    mapApplier2 = mapApplier;
                    e23.a aVar1112 = new e23.a() { // from class: com.google.maps.android.compose.p0
                        @Override // e23.a
                        public final Object invoke() {
                            return TileOverlayKt.TileOverlay$lambda$7$lambda$6(mapApplier2, tileOverlayStateRememberTileOverlayState, lVar3, tileProvider2, z18, f19, z19, f18);
                        }
                    };
                    o0VarE.K(aVar1112);
                    objQ = aVar1112;
                } else {
                    mapApplier2 = mapApplier;
                }
            } else {
                mapApplier2 = mapApplier;
                e23.a aVar1113 = new e23.a() { // from class: com.google.maps.android.compose.p0
                    @Override // e23.a
                    public final Object invoke() {
                        return TileOverlayKt.TileOverlay$lambda$7$lambda$6(mapApplier2, tileOverlayStateRememberTileOverlayState, lVar3, tileProvider2, z18, f19, z19, f18);
                    }
                };
                o0VarE.K(aVar1113);
                objQ = aVar1113;
            }
            aVar3 = (e23.a) objQ;
            i34 = 0;
            o0VarE.g0(false);
            if (cVar instanceof MapApplier) {
                p3.p0.l();
                throw null;
            }
            o0VarE.H();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.d(new q0(i34), lVar3, o0VarE);
            final MapApplier mapApplier17 = mapApplier2;
            final boolean z411116 = z18;
            final float f21113 = f19;
            final boolean z411117 = z19;
            final float f21114 = f18;
            tileProvider2 = tileProvider;
            b4.d(new e23.p() { // from class: com.google.maps.android.compose.r0
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    return TileOverlayKt.TileOverlay$lambda$15$lambda$10(mapApplier17, tileProvider, z411116, f21113, z411117, f21114, (TileOverlayNode) obj, (TileProvider) obj2);
                }
            }, tileProvider2, o0VarE);
            b4.d(new q0(i30), Boolean.valueOf(z18), o0VarE);
            b4.d(new q0(2), Float.valueOf(f19), o0VarE);
            b4.d(new q0(3), Boolean.valueOf(z19), o0VarE);
            b4.d(new q0(4), Float.valueOf(f18), o0VarE);
            o0VarE.g0(true);
            boolean z411118 = z19;
            lVar4 = lVar3;
            z34 = z18;
            z35 = z411118;
            f22 = f19;
            f24 = f18;
        } else {
            o0VarE.G0();
            i29 = i14 & 1;
            aVar = p3.m.f135153a;
            i30 = 1;
            if (i29 != 0) {
                if ((i15 & 2) != 0) {
                    tileOverlayStateRememberTileOverlayState = rememberTileOverlayState(o0VarE, 0);
                    i16 &= -113;
                }
                if (i36 != 0) {
                    z16 = true;
                }
                if (i17 != 0) {
                    f16 = 0.0f;
                }
                if (i19 != 0) {
                    z17 = true;
                }
                if (i25 != 0) {
                    f17 = 0.0f;
                }
                if (i27 != 0) {
                    objH = q2.h(o0VarE, -1493227078, aVar);
                    if (objH == p3.m.a.f135155b) {
                        objH = new f0(13);
                        o0VarE.K(objH);
                    }
                    o0VarE.g0(false);
                    f18 = f17;
                    lVar3 = (e23.l) objH;
                    aVar2 = aVar;
                    z18 = z16;
                    z19 = z17;
                    f19 = f16;
                } else {
                    z18 = z16;
                    aVar2 = aVar;
                    z19 = z17;
                    f19 = f16;
                    f18 = f17;
                    lVar3 = lVar2;
                }
            } else {
                if ((i15 & 2) != 0) {
                    tileOverlayStateRememberTileOverlayState = rememberTileOverlayState(o0VarE, 0);
                    i16 &= -113;
                }
                if (i36 != 0) {
                    z16 = true;
                }
                if (i17 != 0) {
                    f16 = 0.0f;
                }
                if (i19 != 0) {
                    z17 = true;
                }
                if (i25 != 0) {
                    f17 = 0.0f;
                }
                if (i27 != 0) {
                    objH = q2.h(o0VarE, -1493227078, aVar);
                    if (objH == p3.m.a.f135155b) {
                        objH = new f0(13);
                        o0VarE.K(objH);
                    }
                    o0VarE.g0(false);
                    f18 = f17;
                    lVar3 = (e23.l) objH;
                    aVar2 = aVar;
                    z18 = z16;
                    z19 = z17;
                    f19 = f16;
                } else {
                    z18 = z16;
                    aVar2 = aVar;
                    z19 = z17;
                    f19 = f16;
                    f18 = f17;
                    lVar3 = lVar2;
                }
            }
            o0VarE.h0();
            x1 x1Var16 = p3.n.f135158a;
            mapApplier = (MapApplier) cVar;
            o0VarE.C(-1493222491);
            boolean zR16 = o0VarE.r(mapApplier) | o0VarE.r(tileProvider2);
            if ((i16 & 896) == 256) {
                z24 = true;
            } else {
                z24 = false;
            }
            boolean z31111116 = zR16 | z24;
            if ((i16 & 7168) == 2048) {
                z25 = true;
            } else {
                z25 = false;
            }
            boolean z31111117 = z31111116 | z25;
            if ((57344 & i16) == 16384) {
                z26 = true;
            } else {
                z26 = false;
            }
            boolean z31111118 = z31111117 | z26;
            if ((458752 & i16) == 131072) {
                z27 = true;
            } else {
                z27 = false;
            }
            boolean z31111119 = z31111118 | z27 | ((((i16 & 112) ^ 48) <= 32 && o0VarE.B(tileOverlayStateRememberTileOverlayState)) || (i16 & 48) == 32);
            if ((i16 & 3670016) == 1048576) {
                z28 = true;
            } else {
                z28 = false;
            }
            z29 = z28 | z31111119;
            objQ = o0VarE.q();
            if (z29) {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    mapApplier2 = mapApplier;
                    e23.a aVar1114 = new e23.a() { // from class: com.google.maps.android.compose.p0
                        @Override // e23.a
                        public final Object invoke() {
                            return TileOverlayKt.TileOverlay$lambda$7$lambda$6(mapApplier2, tileOverlayStateRememberTileOverlayState, lVar3, tileProvider2, z18, f19, z19, f18);
                        }
                    };
                    o0VarE.K(aVar1114);
                    objQ = aVar1114;
                } else {
                    mapApplier2 = mapApplier;
                }
            } else {
                mapApplier2 = mapApplier;
                e23.a aVar1115 = new e23.a() { // from class: com.google.maps.android.compose.p0
                    @Override // e23.a
                    public final Object invoke() {
                        return TileOverlayKt.TileOverlay$lambda$7$lambda$6(mapApplier2, tileOverlayStateRememberTileOverlayState, lVar3, tileProvider2, z18, f19, z19, f18);
                    }
                };
                o0VarE.K(aVar1115);
                objQ = aVar1115;
            }
            aVar3 = (e23.a) objQ;
            i34 = 0;
            o0VarE.g0(false);
            if (cVar instanceof MapApplier) {
                p3.p0.l();
                throw null;
            }
            o0VarE.H();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.d(new q0(i34), lVar3, o0VarE);
            final MapApplier mapApplier18 = mapApplier2;
            final boolean z411119 = z18;
            final float f21115 = f19;
            final boolean z4111110 = z19;
            final float f21116 = f18;
            tileProvider2 = tileProvider;
            b4.d(new e23.p() { // from class: com.google.maps.android.compose.r0
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    return TileOverlayKt.TileOverlay$lambda$15$lambda$10(mapApplier18, tileProvider, z411119, f21115, z4111110, f21116, (TileOverlayNode) obj, (TileProvider) obj2);
                }
            }, tileProvider2, o0VarE);
            b4.d(new q0(i30), Boolean.valueOf(z18), o0VarE);
            b4.d(new q0(2), Float.valueOf(f19), o0VarE);
            b4.d(new q0(3), Boolean.valueOf(z19), o0VarE);
            b4.d(new q0(4), Float.valueOf(f18), o0VarE);
            o0VarE.g0(true);
            boolean z4111111 = z19;
            lVar4 = lVar3;
            z34 = z18;
            z35 = z4111111;
            f22 = f19;
            f24 = f18;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.n0
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TileOverlayKt.TileOverlay$lambda$16(tileProvider2, tileOverlayStateRememberTileOverlayState, z34, f22, z35, f24, lVar4, i14, i15, (p3.m) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TileOverlay$lambda$1$lambda$0(TileOverlay tileOverlay) {
        tileOverlay.getClass();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TileOverlay$lambda$15$lambda$10(MapApplier mapApplier, TileProvider tileProvider, boolean z14, float f14, boolean z15, float f15, TileOverlayNode tileOverlayNode, TileProvider tileProvider2) {
        GoogleMap map;
        tileOverlayNode.getClass();
        tileProvider2.getClass();
        tileOverlayNode.getTileOverlay().remove();
        if (mapApplier != null && (map = mapApplier.getMap()) != null) {
            TileOverlayOptions tileOverlayOptions = new TileOverlayOptions();
            tileOverlayOptions.tileProvider(tileProvider);
            tileOverlayOptions.fadeIn(z14);
            tileOverlayOptions.transparency(f14);
            tileOverlayOptions.visible(z15);
            tileOverlayOptions.zIndex(f15);
            Unit unit = Unit.INSTANCE;
            TileOverlay tileOverlayAddTileOverlay = map.addTileOverlay(tileOverlayOptions);
            if (tileOverlayAddTileOverlay != null) {
                tileOverlayNode.setTileOverlay(tileOverlayAddTileOverlay);
                return Unit.INSTANCE;
            }
        }
        vb.h.z("Error adding tile overlay");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TileOverlay$lambda$15$lambda$11(TileOverlayNode tileOverlayNode, boolean z14) {
        tileOverlayNode.getClass();
        tileOverlayNode.getTileOverlay().setFadeIn(z14);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TileOverlay$lambda$15$lambda$12(TileOverlayNode tileOverlayNode, float f14) {
        tileOverlayNode.getClass();
        tileOverlayNode.getTileOverlay().setTransparency(f14);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TileOverlay$lambda$15$lambda$13(TileOverlayNode tileOverlayNode, boolean z14) {
        tileOverlayNode.getClass();
        tileOverlayNode.getTileOverlay().setVisible(z14);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TileOverlay$lambda$15$lambda$14(TileOverlayNode tileOverlayNode, float f14) {
        tileOverlayNode.getClass();
        tileOverlayNode.getTileOverlay().setZIndex(f14);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TileOverlay$lambda$15$lambda$8(TileOverlayNode tileOverlayNode, e23.l lVar) {
        tileOverlayNode.getClass();
        lVar.getClass();
        tileOverlayNode.setOnTileOverlayClick(lVar);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TileOverlay$lambda$16(TileProvider tileProvider, TileOverlayState tileOverlayState, boolean z14, float f14, boolean z15, float f15, e23.l lVar, int i14, int i15, p3.m mVar, int i16) {
        TileOverlay(tileProvider, tileOverlayState, z14, f14, z15, f15, lVar, mVar, p3.p0.t(i14 | 1), i15);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TileOverlay$lambda$2(TileProvider tileProvider, boolean z14, float f14, boolean z15, float f15, e23.l lVar, int i14, int i15, p3.m mVar, int i16) {
        TileOverlay(tileProvider, z14, f14, z15, f15, lVar, mVar, p3.p0.t(i14 | 1), i15);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TileOverlay$lambda$4$lambda$3(TileOverlay tileOverlay) {
        tileOverlay.getClass();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TileOverlayNode TileOverlay$lambda$7$lambda$6(MapApplier mapApplier, TileOverlayState tileOverlayState, e23.l lVar, TileProvider tileProvider, boolean z14, float f14, boolean z15, float f15) {
        GoogleMap map;
        if (mapApplier != null && (map = mapApplier.getMap()) != null) {
            TileOverlayOptions tileOverlayOptions = new TileOverlayOptions();
            tileOverlayOptions.tileProvider(tileProvider);
            tileOverlayOptions.fadeIn(z14);
            tileOverlayOptions.transparency(f14);
            tileOverlayOptions.visible(z15);
            tileOverlayOptions.zIndex(f15);
            TileOverlay tileOverlayAddTileOverlay = map.addTileOverlay(tileOverlayOptions);
            if (tileOverlayAddTileOverlay != null) {
                return new TileOverlayNode(tileOverlayAddTileOverlay, tileOverlayState, lVar);
            }
        }
        vb.h.z("Error adding tile overlay");
        return null;
    }

    public static final TileOverlayState rememberTileOverlayState(p3.m mVar, int i14) {
        mVar.C(1570127269);
        x1 x1Var = p3.n.f135158a;
        mVar.C(-533281595);
        Object objQ = mVar.q();
        p3.m.f135153a.getClass();
        if (objQ == p3.m.a.f135155b) {
            objQ = TileOverlayState.INSTANCE.invoke();
            mVar.K(objQ);
        }
        TileOverlayState tileOverlayState = (TileOverlayState) objQ;
        mVar.f();
        mVar.f();
        return tileOverlayState;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:84:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:87:0x00db  */
    /* JADX WARN: Code duplicated, block: B:89:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:91:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:95:0x0131  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:74:0x00c9, please report this as an issue */
    @o13.e
    @GoogleMapComposable
    public static final void TileOverlay(final TileProvider tileProvider, boolean z14, float f14, boolean z15, float f15, e23.l lVar, p3.m mVar, final int i14, final int i15) {
        TileProvider tileProvider2;
        int i16;
        final boolean z16;
        int i17;
        float f16;
        int i18;
        int i19;
        boolean z17;
        int i24;
        int i25;
        float f17;
        int i26;
        int i27;
        e23.l lVar2;
        int i28;
        e23.l lVar3;
        final float f18;
        final boolean z18;
        final float f19;
        final e23.l lVar4;
        Object objQ;
        p2 p2VarI0;
        tileProvider.getClass();
        p3.o0 o0VarE = mVar.E(1712508128);
        if ((i15 & 1) != 0) {
            i16 = i14 | 6;
            tileProvider2 = tileProvider;
        } else {
            tileProvider2 = tileProvider;
            if ((i14 & 6) == 0) {
                i16 = (o0VarE.r(tileProvider2) ? 4 : 2) | i14;
            } else {
                i16 = i14;
            }
        }
        int i29 = i15 & 2;
        if (i29 == 0) {
            if ((i14 & 48) == 0) {
                z16 = z14;
                i16 |= o0VarE.h(z16) ? 32 : 16;
            }
            i17 = i15 & 4;
            if (i17 != 0) {
                if ((i14 & 384) == 0) {
                    f16 = f14;
                    if (o0VarE.i(f16)) {
                        i18 = 256;
                    } else {
                        i18 = 128;
                    }
                    i16 |= i18;
                }
                i19 = i15 & 8;
                if (i19 != 0) {
                    if ((i14 & 3072) == 0) {
                        z17 = z15;
                        if (o0VarE.h(z17)) {
                            i24 = 2048;
                        } else {
                            i24 = 1024;
                        }
                        i16 |= i24;
                    }
                    i25 = i15 & 16;
                    if (i25 != 0) {
                        if ((i14 & 24576) == 0) {
                            f17 = f15;
                            if (o0VarE.i(f17)) {
                                i26 = 16384;
                            } else {
                                i26 = 8192;
                            }
                            i16 |= i26;
                        }
                        i27 = i15 & 32;
                        if (i27 != 0) {
                            if ((196608 & i14) == 0) {
                                lVar2 = lVar;
                                if (o0VarE.r(lVar2)) {
                                    i28 = 131072;
                                } else {
                                    i28 = 65536;
                                }
                                i16 |= i28;
                            }
                            if ((74899 & i16) != 74898 && o0VarE.b()) {
                                o0VarE.e();
                                f18 = f16;
                                z18 = z17;
                                f19 = f17;
                                lVar4 = lVar2;
                            } else {
                                if (i29 != 0) {
                                    z16 = true;
                                }
                                if (i17 != 0) {
                                    f16 = 0.0f;
                                }
                                boolean z19 = i19 == 0 ? z17 : true;
                                if (i25 != 0) {
                                    f17 = 0.0f;
                                }
                                if (i27 != 0) {
                                    o0VarE.C(-1493261926);
                                    objQ = o0VarE.q();
                                    p3.m.f135153a.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = new f0(12);
                                        o0VarE.K(objQ);
                                    }
                                    o0VarE.g0(false);
                                    lVar3 = (e23.l) objQ;
                                } else {
                                    lVar3 = lVar2;
                                }
                                x1 x1Var = p3.n.f135158a;
                                int i30 = i16 & 14;
                                int i34 = i16 << 3;
                                float f22 = f16;
                                boolean z24 = z19;
                                float f24 = f17;
                                TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f22, z24, f24, lVar3, o0VarE, i30 | (i34 & 896) | (i34 & 7168) | (57344 & i34) | (458752 & i34) | (i34 & 3670016), 0);
                                f18 = f22;
                                z18 = z24;
                                f19 = f24;
                                lVar4 = lVar3;
                            }
                            p2VarI0 = o0VarE.i0();
                            if (p2VarI0 != null) {
                                p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.o0
                                    @Override // e23.p
                                    public final Object invoke(Object obj, Object obj2) {
                                        int iIntValue = ((Integer) obj2).intValue();
                                        return TileOverlayKt.TileOverlay$lambda$2(tileProvider, z16, f18, z18, f19, lVar4, i14, i15, (p3.m) obj, iIntValue);
                                    }
                                };
                            }
                        }
                        i16 |= 196608;
                        lVar2 = lVar;
                        if ((74899 & i16) != 74898) {
                            if (i29 != 0) {
                                z16 = true;
                            }
                            if (i17 != 0) {
                                f16 = 0.0f;
                            }
                            if (i19 == 0) {
                            }
                            if (i25 != 0) {
                                f17 = 0.0f;
                            }
                            if (i27 != 0) {
                                o0VarE.C(-1493261926);
                                objQ = o0VarE.q();
                                p3.m.f135153a.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new f0(12);
                                    o0VarE.K(objQ);
                                }
                                o0VarE.g0(false);
                                lVar3 = (e23.l) objQ;
                            } else {
                                lVar3 = lVar2;
                            }
                            x1 x1Var2 = p3.n.f135158a;
                            int i35 = i16 & 14;
                            int i36 = i16 << 3;
                            float f25 = f16;
                            boolean z25 = z19;
                            float f26 = f17;
                            TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f25, z25, f26, lVar3, o0VarE, i35 | (i36 & 896) | (i36 & 7168) | (57344 & i36) | (458752 & i36) | (i36 & 3670016), 0);
                            f18 = f25;
                            z18 = z25;
                            f19 = f26;
                            lVar4 = lVar3;
                        } else {
                            if (i29 != 0) {
                                z16 = true;
                            }
                            if (i17 != 0) {
                                f16 = 0.0f;
                            }
                            if (i19 == 0) {
                            }
                            if (i25 != 0) {
                                f17 = 0.0f;
                            }
                            if (i27 != 0) {
                                o0VarE.C(-1493261926);
                                objQ = o0VarE.q();
                                p3.m.f135153a.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new f0(12);
                                    o0VarE.K(objQ);
                                }
                                o0VarE.g0(false);
                                lVar3 = (e23.l) objQ;
                            } else {
                                lVar3 = lVar2;
                            }
                            x1 x1Var3 = p3.n.f135158a;
                            int i37 = i16 & 14;
                            int i38 = i16 << 3;
                            float f27 = f16;
                            boolean z26 = z19;
                            float f28 = f17;
                            TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f27, z26, f28, lVar3, o0VarE, i37 | (i38 & 896) | (i38 & 7168) | (57344 & i38) | (458752 & i38) | (i38 & 3670016), 0);
                            f18 = f27;
                            z18 = z26;
                            f19 = f28;
                            lVar4 = lVar3;
                        }
                        p2VarI0 = o0VarE.i0();
                        if (p2VarI0 != null) {
                            p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.o0
                                @Override // e23.p
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return TileOverlayKt.TileOverlay$lambda$2(tileProvider, z16, f18, z18, f19, lVar4, i14, i15, (p3.m) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i16 |= 24576;
                    f17 = f15;
                    i27 = i15 & 32;
                    if (i27 != 0) {
                        if ((196608 & i14) == 0) {
                            lVar2 = lVar;
                            if (o0VarE.r(lVar2)) {
                                i28 = 131072;
                            } else {
                                i28 = 65536;
                            }
                            i16 |= i28;
                        }
                        if ((74899 & i16) != 74898) {
                            if (i29 != 0) {
                                z16 = true;
                            }
                            if (i17 != 0) {
                                f16 = 0.0f;
                            }
                            if (i19 == 0) {
                            }
                            if (i25 != 0) {
                                f17 = 0.0f;
                            }
                            if (i27 != 0) {
                                o0VarE.C(-1493261926);
                                objQ = o0VarE.q();
                                p3.m.f135153a.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new f0(12);
                                    o0VarE.K(objQ);
                                }
                                o0VarE.g0(false);
                                lVar3 = (e23.l) objQ;
                            } else {
                                lVar3 = lVar2;
                            }
                            x1 x1Var4 = p3.n.f135158a;
                            int i39 = i16 & 14;
                            int i310 = i16 << 3;
                            float f29 = f16;
                            boolean z27 = z19;
                            float f210 = f17;
                            TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f29, z27, f210, lVar3, o0VarE, i39 | (i310 & 896) | (i310 & 7168) | (57344 & i310) | (458752 & i310) | (i310 & 3670016), 0);
                            f18 = f29;
                            z18 = z27;
                            f19 = f210;
                            lVar4 = lVar3;
                        } else {
                            if (i29 != 0) {
                                z16 = true;
                            }
                            if (i17 != 0) {
                                f16 = 0.0f;
                            }
                            if (i19 == 0) {
                            }
                            if (i25 != 0) {
                                f17 = 0.0f;
                            }
                            if (i27 != 0) {
                                o0VarE.C(-1493261926);
                                objQ = o0VarE.q();
                                p3.m.f135153a.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new f0(12);
                                    o0VarE.K(objQ);
                                }
                                o0VarE.g0(false);
                                lVar3 = (e23.l) objQ;
                            } else {
                                lVar3 = lVar2;
                            }
                            x1 x1Var5 = p3.n.f135158a;
                            int i311 = i16 & 14;
                            int i312 = i16 << 3;
                            float f211 = f16;
                            boolean z28 = z19;
                            float f212 = f17;
                            TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f211, z28, f212, lVar3, o0VarE, i311 | (i312 & 896) | (i312 & 7168) | (57344 & i312) | (458752 & i312) | (i312 & 3670016), 0);
                            f18 = f211;
                            z18 = z28;
                            f19 = f212;
                            lVar4 = lVar3;
                        }
                        p2VarI0 = o0VarE.i0();
                        if (p2VarI0 != null) {
                            p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.o0
                                @Override // e23.p
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return TileOverlayKt.TileOverlay$lambda$2(tileProvider, z16, f18, z18, f19, lVar4, i14, i15, (p3.m) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i16 |= 196608;
                    lVar2 = lVar;
                    if ((74899 & i16) != 74898) {
                        if (i29 != 0) {
                            z16 = true;
                        }
                        if (i17 != 0) {
                            f16 = 0.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i25 != 0) {
                            f17 = 0.0f;
                        }
                        if (i27 != 0) {
                            o0VarE.C(-1493261926);
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new f0(12);
                                o0VarE.K(objQ);
                            }
                            o0VarE.g0(false);
                            lVar3 = (e23.l) objQ;
                        } else {
                            lVar3 = lVar2;
                        }
                        x1 x1Var6 = p3.n.f135158a;
                        int i313 = i16 & 14;
                        int i314 = i16 << 3;
                        float f213 = f16;
                        boolean z29 = z19;
                        float f214 = f17;
                        TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f213, z29, f214, lVar3, o0VarE, i313 | (i314 & 896) | (i314 & 7168) | (57344 & i314) | (458752 & i314) | (i314 & 3670016), 0);
                        f18 = f213;
                        z18 = z29;
                        f19 = f214;
                        lVar4 = lVar3;
                    } else {
                        if (i29 != 0) {
                            z16 = true;
                        }
                        if (i17 != 0) {
                            f16 = 0.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i25 != 0) {
                            f17 = 0.0f;
                        }
                        if (i27 != 0) {
                            o0VarE.C(-1493261926);
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new f0(12);
                                o0VarE.K(objQ);
                            }
                            o0VarE.g0(false);
                            lVar3 = (e23.l) objQ;
                        } else {
                            lVar3 = lVar2;
                        }
                        x1 x1Var7 = p3.n.f135158a;
                        int i315 = i16 & 14;
                        int i316 = i16 << 3;
                        float f215 = f16;
                        boolean z210 = z19;
                        float f216 = f17;
                        TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f215, z210, f216, lVar3, o0VarE, i315 | (i316 & 896) | (i316 & 7168) | (57344 & i316) | (458752 & i316) | (i316 & 3670016), 0);
                        f18 = f215;
                        z18 = z210;
                        f19 = f216;
                        lVar4 = lVar3;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.o0
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return TileOverlayKt.TileOverlay$lambda$2(tileProvider, z16, f18, z18, f19, lVar4, i14, i15, (p3.m) obj, iIntValue);
                            }
                        };
                    }
                }
                i16 |= 3072;
                z17 = z15;
                i25 = i15 & 16;
                if (i25 != 0) {
                    if ((i14 & 24576) == 0) {
                        f17 = f15;
                        if (o0VarE.i(f17)) {
                            i26 = 16384;
                        } else {
                            i26 = 8192;
                        }
                        i16 |= i26;
                    }
                    i27 = i15 & 32;
                    if (i27 != 0) {
                        if ((196608 & i14) == 0) {
                            lVar2 = lVar;
                            if (o0VarE.r(lVar2)) {
                                i28 = 131072;
                            } else {
                                i28 = 65536;
                            }
                            i16 |= i28;
                        }
                        if ((74899 & i16) != 74898) {
                            if (i29 != 0) {
                                z16 = true;
                            }
                            if (i17 != 0) {
                                f16 = 0.0f;
                            }
                            if (i19 == 0) {
                            }
                            if (i25 != 0) {
                                f17 = 0.0f;
                            }
                            if (i27 != 0) {
                                o0VarE.C(-1493261926);
                                objQ = o0VarE.q();
                                p3.m.f135153a.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new f0(12);
                                    o0VarE.K(objQ);
                                }
                                o0VarE.g0(false);
                                lVar3 = (e23.l) objQ;
                            } else {
                                lVar3 = lVar2;
                            }
                            x1 x1Var8 = p3.n.f135158a;
                            int i317 = i16 & 14;
                            int i318 = i16 << 3;
                            float f217 = f16;
                            boolean z211 = z19;
                            float f218 = f17;
                            TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f217, z211, f218, lVar3, o0VarE, i317 | (i318 & 896) | (i318 & 7168) | (57344 & i318) | (458752 & i318) | (i318 & 3670016), 0);
                            f18 = f217;
                            z18 = z211;
                            f19 = f218;
                            lVar4 = lVar3;
                        } else {
                            if (i29 != 0) {
                                z16 = true;
                            }
                            if (i17 != 0) {
                                f16 = 0.0f;
                            }
                            if (i19 == 0) {
                            }
                            if (i25 != 0) {
                                f17 = 0.0f;
                            }
                            if (i27 != 0) {
                                o0VarE.C(-1493261926);
                                objQ = o0VarE.q();
                                p3.m.f135153a.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new f0(12);
                                    o0VarE.K(objQ);
                                }
                                o0VarE.g0(false);
                                lVar3 = (e23.l) objQ;
                            } else {
                                lVar3 = lVar2;
                            }
                            x1 x1Var9 = p3.n.f135158a;
                            int i319 = i16 & 14;
                            int i3110 = i16 << 3;
                            float f219 = f16;
                            boolean z212 = z19;
                            float f2110 = f17;
                            TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f219, z212, f2110, lVar3, o0VarE, i319 | (i3110 & 896) | (i3110 & 7168) | (57344 & i3110) | (458752 & i3110) | (i3110 & 3670016), 0);
                            f18 = f219;
                            z18 = z212;
                            f19 = f2110;
                            lVar4 = lVar3;
                        }
                        p2VarI0 = o0VarE.i0();
                        if (p2VarI0 != null) {
                            p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.o0
                                @Override // e23.p
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return TileOverlayKt.TileOverlay$lambda$2(tileProvider, z16, f18, z18, f19, lVar4, i14, i15, (p3.m) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i16 |= 196608;
                    lVar2 = lVar;
                    if ((74899 & i16) != 74898) {
                        if (i29 != 0) {
                            z16 = true;
                        }
                        if (i17 != 0) {
                            f16 = 0.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i25 != 0) {
                            f17 = 0.0f;
                        }
                        if (i27 != 0) {
                            o0VarE.C(-1493261926);
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new f0(12);
                                o0VarE.K(objQ);
                            }
                            o0VarE.g0(false);
                            lVar3 = (e23.l) objQ;
                        } else {
                            lVar3 = lVar2;
                        }
                        x1 x1Var10 = p3.n.f135158a;
                        int i3111 = i16 & 14;
                        int i3112 = i16 << 3;
                        float f2111 = f16;
                        boolean z213 = z19;
                        float f2112 = f17;
                        TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f2111, z213, f2112, lVar3, o0VarE, i3111 | (i3112 & 896) | (i3112 & 7168) | (57344 & i3112) | (458752 & i3112) | (i3112 & 3670016), 0);
                        f18 = f2111;
                        z18 = z213;
                        f19 = f2112;
                        lVar4 = lVar3;
                    } else {
                        if (i29 != 0) {
                            z16 = true;
                        }
                        if (i17 != 0) {
                            f16 = 0.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i25 != 0) {
                            f17 = 0.0f;
                        }
                        if (i27 != 0) {
                            o0VarE.C(-1493261926);
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new f0(12);
                                o0VarE.K(objQ);
                            }
                            o0VarE.g0(false);
                            lVar3 = (e23.l) objQ;
                        } else {
                            lVar3 = lVar2;
                        }
                        x1 x1Var11 = p3.n.f135158a;
                        int i3113 = i16 & 14;
                        int i3114 = i16 << 3;
                        float f2113 = f16;
                        boolean z214 = z19;
                        float f2114 = f17;
                        TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f2113, z214, f2114, lVar3, o0VarE, i3113 | (i3114 & 896) | (i3114 & 7168) | (57344 & i3114) | (458752 & i3114) | (i3114 & 3670016), 0);
                        f18 = f2113;
                        z18 = z214;
                        f19 = f2114;
                        lVar4 = lVar3;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.o0
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return TileOverlayKt.TileOverlay$lambda$2(tileProvider, z16, f18, z18, f19, lVar4, i14, i15, (p3.m) obj, iIntValue);
                            }
                        };
                    }
                }
                i16 |= 24576;
                f17 = f15;
                i27 = i15 & 32;
                if (i27 != 0) {
                    if ((196608 & i14) == 0) {
                        lVar2 = lVar;
                        if (o0VarE.r(lVar2)) {
                            i28 = 131072;
                        } else {
                            i28 = 65536;
                        }
                        i16 |= i28;
                    }
                    if ((74899 & i16) != 74898) {
                        if (i29 != 0) {
                            z16 = true;
                        }
                        if (i17 != 0) {
                            f16 = 0.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i25 != 0) {
                            f17 = 0.0f;
                        }
                        if (i27 != 0) {
                            o0VarE.C(-1493261926);
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new f0(12);
                                o0VarE.K(objQ);
                            }
                            o0VarE.g0(false);
                            lVar3 = (e23.l) objQ;
                        } else {
                            lVar3 = lVar2;
                        }
                        x1 x1Var12 = p3.n.f135158a;
                        int i3115 = i16 & 14;
                        int i3116 = i16 << 3;
                        float f2115 = f16;
                        boolean z215 = z19;
                        float f2116 = f17;
                        TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f2115, z215, f2116, lVar3, o0VarE, i3115 | (i3116 & 896) | (i3116 & 7168) | (57344 & i3116) | (458752 & i3116) | (i3116 & 3670016), 0);
                        f18 = f2115;
                        z18 = z215;
                        f19 = f2116;
                        lVar4 = lVar3;
                    } else {
                        if (i29 != 0) {
                            z16 = true;
                        }
                        if (i17 != 0) {
                            f16 = 0.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i25 != 0) {
                            f17 = 0.0f;
                        }
                        if (i27 != 0) {
                            o0VarE.C(-1493261926);
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new f0(12);
                                o0VarE.K(objQ);
                            }
                            o0VarE.g0(false);
                            lVar3 = (e23.l) objQ;
                        } else {
                            lVar3 = lVar2;
                        }
                        x1 x1Var13 = p3.n.f135158a;
                        int i3117 = i16 & 14;
                        int i3118 = i16 << 3;
                        float f2117 = f16;
                        boolean z216 = z19;
                        float f2118 = f17;
                        TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f2117, z216, f2118, lVar3, o0VarE, i3117 | (i3118 & 896) | (i3118 & 7168) | (57344 & i3118) | (458752 & i3118) | (i3118 & 3670016), 0);
                        f18 = f2117;
                        z18 = z216;
                        f19 = f2118;
                        lVar4 = lVar3;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.o0
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return TileOverlayKt.TileOverlay$lambda$2(tileProvider, z16, f18, z18, f19, lVar4, i14, i15, (p3.m) obj, iIntValue);
                            }
                        };
                    }
                }
                i16 |= 196608;
                lVar2 = lVar;
                if ((74899 & i16) != 74898) {
                    if (i29 != 0) {
                        z16 = true;
                    }
                    if (i17 != 0) {
                        f16 = 0.0f;
                    }
                    if (i19 == 0) {
                    }
                    if (i25 != 0) {
                        f17 = 0.0f;
                    }
                    if (i27 != 0) {
                        o0VarE.C(-1493261926);
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new f0(12);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        lVar3 = (e23.l) objQ;
                    } else {
                        lVar3 = lVar2;
                    }
                    x1 x1Var14 = p3.n.f135158a;
                    int i3119 = i16 & 14;
                    int i31110 = i16 << 3;
                    float f2119 = f16;
                    boolean z217 = z19;
                    float f21110 = f17;
                    TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f2119, z217, f21110, lVar3, o0VarE, i3119 | (i31110 & 896) | (i31110 & 7168) | (57344 & i31110) | (458752 & i31110) | (i31110 & 3670016), 0);
                    f18 = f2119;
                    z18 = z217;
                    f19 = f21110;
                    lVar4 = lVar3;
                } else {
                    if (i29 != 0) {
                        z16 = true;
                    }
                    if (i17 != 0) {
                        f16 = 0.0f;
                    }
                    if (i19 == 0) {
                    }
                    if (i25 != 0) {
                        f17 = 0.0f;
                    }
                    if (i27 != 0) {
                        o0VarE.C(-1493261926);
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new f0(12);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        lVar3 = (e23.l) objQ;
                    } else {
                        lVar3 = lVar2;
                    }
                    x1 x1Var15 = p3.n.f135158a;
                    int i31111 = i16 & 14;
                    int i31112 = i16 << 3;
                    float f21111 = f16;
                    boolean z218 = z19;
                    float f21112 = f17;
                    TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f21111, z218, f21112, lVar3, o0VarE, i31111 | (i31112 & 896) | (i31112 & 7168) | (57344 & i31112) | (458752 & i31112) | (i31112 & 3670016), 0);
                    f18 = f21111;
                    z18 = z218;
                    f19 = f21112;
                    lVar4 = lVar3;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.o0
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TileOverlayKt.TileOverlay$lambda$2(tileProvider, z16, f18, z18, f19, lVar4, i14, i15, (p3.m) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 384;
            f16 = f14;
            i19 = i15 & 8;
            if (i19 != 0) {
                if ((i14 & 3072) == 0) {
                    z17 = z15;
                    if (o0VarE.h(z17)) {
                        i24 = 2048;
                    } else {
                        i24 = 1024;
                    }
                    i16 |= i24;
                }
                i25 = i15 & 16;
                if (i25 != 0) {
                    if ((i14 & 24576) == 0) {
                        f17 = f15;
                        if (o0VarE.i(f17)) {
                            i26 = 16384;
                        } else {
                            i26 = 8192;
                        }
                        i16 |= i26;
                    }
                    i27 = i15 & 32;
                    if (i27 != 0) {
                        if ((196608 & i14) == 0) {
                            lVar2 = lVar;
                            if (o0VarE.r(lVar2)) {
                                i28 = 131072;
                            } else {
                                i28 = 65536;
                            }
                            i16 |= i28;
                        }
                        if ((74899 & i16) != 74898) {
                            if (i29 != 0) {
                                z16 = true;
                            }
                            if (i17 != 0) {
                                f16 = 0.0f;
                            }
                            if (i19 == 0) {
                            }
                            if (i25 != 0) {
                                f17 = 0.0f;
                            }
                            if (i27 != 0) {
                                o0VarE.C(-1493261926);
                                objQ = o0VarE.q();
                                p3.m.f135153a.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new f0(12);
                                    o0VarE.K(objQ);
                                }
                                o0VarE.g0(false);
                                lVar3 = (e23.l) objQ;
                            } else {
                                lVar3 = lVar2;
                            }
                            x1 x1Var16 = p3.n.f135158a;
                            int i31113 = i16 & 14;
                            int i31114 = i16 << 3;
                            float f21113 = f16;
                            boolean z219 = z19;
                            float f21114 = f17;
                            TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f21113, z219, f21114, lVar3, o0VarE, i31113 | (i31114 & 896) | (i31114 & 7168) | (57344 & i31114) | (458752 & i31114) | (i31114 & 3670016), 0);
                            f18 = f21113;
                            z18 = z219;
                            f19 = f21114;
                            lVar4 = lVar3;
                        } else {
                            if (i29 != 0) {
                                z16 = true;
                            }
                            if (i17 != 0) {
                                f16 = 0.0f;
                            }
                            if (i19 == 0) {
                            }
                            if (i25 != 0) {
                                f17 = 0.0f;
                            }
                            if (i27 != 0) {
                                o0VarE.C(-1493261926);
                                objQ = o0VarE.q();
                                p3.m.f135153a.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new f0(12);
                                    o0VarE.K(objQ);
                                }
                                o0VarE.g0(false);
                                lVar3 = (e23.l) objQ;
                            } else {
                                lVar3 = lVar2;
                            }
                            x1 x1Var17 = p3.n.f135158a;
                            int i31115 = i16 & 14;
                            int i31116 = i16 << 3;
                            float f21115 = f16;
                            boolean z2110 = z19;
                            float f21116 = f17;
                            TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f21115, z2110, f21116, lVar3, o0VarE, i31115 | (i31116 & 896) | (i31116 & 7168) | (57344 & i31116) | (458752 & i31116) | (i31116 & 3670016), 0);
                            f18 = f21115;
                            z18 = z2110;
                            f19 = f21116;
                            lVar4 = lVar3;
                        }
                        p2VarI0 = o0VarE.i0();
                        if (p2VarI0 != null) {
                            p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.o0
                                @Override // e23.p
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return TileOverlayKt.TileOverlay$lambda$2(tileProvider, z16, f18, z18, f19, lVar4, i14, i15, (p3.m) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i16 |= 196608;
                    lVar2 = lVar;
                    if ((74899 & i16) != 74898) {
                        if (i29 != 0) {
                            z16 = true;
                        }
                        if (i17 != 0) {
                            f16 = 0.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i25 != 0) {
                            f17 = 0.0f;
                        }
                        if (i27 != 0) {
                            o0VarE.C(-1493261926);
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new f0(12);
                                o0VarE.K(objQ);
                            }
                            o0VarE.g0(false);
                            lVar3 = (e23.l) objQ;
                        } else {
                            lVar3 = lVar2;
                        }
                        x1 x1Var18 = p3.n.f135158a;
                        int i31117 = i16 & 14;
                        int i31118 = i16 << 3;
                        float f21117 = f16;
                        boolean z2111 = z19;
                        float f21118 = f17;
                        TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f21117, z2111, f21118, lVar3, o0VarE, i31117 | (i31118 & 896) | (i31118 & 7168) | (57344 & i31118) | (458752 & i31118) | (i31118 & 3670016), 0);
                        f18 = f21117;
                        z18 = z2111;
                        f19 = f21118;
                        lVar4 = lVar3;
                    } else {
                        if (i29 != 0) {
                            z16 = true;
                        }
                        if (i17 != 0) {
                            f16 = 0.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i25 != 0) {
                            f17 = 0.0f;
                        }
                        if (i27 != 0) {
                            o0VarE.C(-1493261926);
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new f0(12);
                                o0VarE.K(objQ);
                            }
                            o0VarE.g0(false);
                            lVar3 = (e23.l) objQ;
                        } else {
                            lVar3 = lVar2;
                        }
                        x1 x1Var19 = p3.n.f135158a;
                        int i31119 = i16 & 14;
                        int i311110 = i16 << 3;
                        float f21119 = f16;
                        boolean z2112 = z19;
                        float f211110 = f17;
                        TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f21119, z2112, f211110, lVar3, o0VarE, i31119 | (i311110 & 896) | (i311110 & 7168) | (57344 & i311110) | (458752 & i311110) | (i311110 & 3670016), 0);
                        f18 = f21119;
                        z18 = z2112;
                        f19 = f211110;
                        lVar4 = lVar3;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.o0
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return TileOverlayKt.TileOverlay$lambda$2(tileProvider, z16, f18, z18, f19, lVar4, i14, i15, (p3.m) obj, iIntValue);
                            }
                        };
                    }
                }
                i16 |= 24576;
                f17 = f15;
                i27 = i15 & 32;
                if (i27 != 0) {
                    if ((196608 & i14) == 0) {
                        lVar2 = lVar;
                        if (o0VarE.r(lVar2)) {
                            i28 = 131072;
                        } else {
                            i28 = 65536;
                        }
                        i16 |= i28;
                    }
                    if ((74899 & i16) != 74898) {
                        if (i29 != 0) {
                            z16 = true;
                        }
                        if (i17 != 0) {
                            f16 = 0.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i25 != 0) {
                            f17 = 0.0f;
                        }
                        if (i27 != 0) {
                            o0VarE.C(-1493261926);
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new f0(12);
                                o0VarE.K(objQ);
                            }
                            o0VarE.g0(false);
                            lVar3 = (e23.l) objQ;
                        } else {
                            lVar3 = lVar2;
                        }
                        x1 x1Var110 = p3.n.f135158a;
                        int i311111 = i16 & 14;
                        int i311112 = i16 << 3;
                        float f211111 = f16;
                        boolean z2113 = z19;
                        float f211112 = f17;
                        TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f211111, z2113, f211112, lVar3, o0VarE, i311111 | (i311112 & 896) | (i311112 & 7168) | (57344 & i311112) | (458752 & i311112) | (i311112 & 3670016), 0);
                        f18 = f211111;
                        z18 = z2113;
                        f19 = f211112;
                        lVar4 = lVar3;
                    } else {
                        if (i29 != 0) {
                            z16 = true;
                        }
                        if (i17 != 0) {
                            f16 = 0.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i25 != 0) {
                            f17 = 0.0f;
                        }
                        if (i27 != 0) {
                            o0VarE.C(-1493261926);
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new f0(12);
                                o0VarE.K(objQ);
                            }
                            o0VarE.g0(false);
                            lVar3 = (e23.l) objQ;
                        } else {
                            lVar3 = lVar2;
                        }
                        x1 x1Var111 = p3.n.f135158a;
                        int i311113 = i16 & 14;
                        int i311114 = i16 << 3;
                        float f211113 = f16;
                        boolean z2114 = z19;
                        float f211114 = f17;
                        TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f211113, z2114, f211114, lVar3, o0VarE, i311113 | (i311114 & 896) | (i311114 & 7168) | (57344 & i311114) | (458752 & i311114) | (i311114 & 3670016), 0);
                        f18 = f211113;
                        z18 = z2114;
                        f19 = f211114;
                        lVar4 = lVar3;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.o0
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return TileOverlayKt.TileOverlay$lambda$2(tileProvider, z16, f18, z18, f19, lVar4, i14, i15, (p3.m) obj, iIntValue);
                            }
                        };
                    }
                }
                i16 |= 196608;
                lVar2 = lVar;
                if ((74899 & i16) != 74898) {
                    if (i29 != 0) {
                        z16 = true;
                    }
                    if (i17 != 0) {
                        f16 = 0.0f;
                    }
                    if (i19 == 0) {
                    }
                    if (i25 != 0) {
                        f17 = 0.0f;
                    }
                    if (i27 != 0) {
                        o0VarE.C(-1493261926);
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new f0(12);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        lVar3 = (e23.l) objQ;
                    } else {
                        lVar3 = lVar2;
                    }
                    x1 x1Var112 = p3.n.f135158a;
                    int i311115 = i16 & 14;
                    int i311116 = i16 << 3;
                    float f211115 = f16;
                    boolean z2115 = z19;
                    float f211116 = f17;
                    TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f211115, z2115, f211116, lVar3, o0VarE, i311115 | (i311116 & 896) | (i311116 & 7168) | (57344 & i311116) | (458752 & i311116) | (i311116 & 3670016), 0);
                    f18 = f211115;
                    z18 = z2115;
                    f19 = f211116;
                    lVar4 = lVar3;
                } else {
                    if (i29 != 0) {
                        z16 = true;
                    }
                    if (i17 != 0) {
                        f16 = 0.0f;
                    }
                    if (i19 == 0) {
                    }
                    if (i25 != 0) {
                        f17 = 0.0f;
                    }
                    if (i27 != 0) {
                        o0VarE.C(-1493261926);
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new f0(12);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        lVar3 = (e23.l) objQ;
                    } else {
                        lVar3 = lVar2;
                    }
                    x1 x1Var113 = p3.n.f135158a;
                    int i311117 = i16 & 14;
                    int i311118 = i16 << 3;
                    float f211117 = f16;
                    boolean z2116 = z19;
                    float f211118 = f17;
                    TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f211117, z2116, f211118, lVar3, o0VarE, i311117 | (i311118 & 896) | (i311118 & 7168) | (57344 & i311118) | (458752 & i311118) | (i311118 & 3670016), 0);
                    f18 = f211117;
                    z18 = z2116;
                    f19 = f211118;
                    lVar4 = lVar3;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.o0
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TileOverlayKt.TileOverlay$lambda$2(tileProvider, z16, f18, z18, f19, lVar4, i14, i15, (p3.m) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 3072;
            z17 = z15;
            i25 = i15 & 16;
            if (i25 != 0) {
                if ((i14 & 24576) == 0) {
                    f17 = f15;
                    if (o0VarE.i(f17)) {
                        i26 = 16384;
                    } else {
                        i26 = 8192;
                    }
                    i16 |= i26;
                }
                i27 = i15 & 32;
                if (i27 != 0) {
                    if ((196608 & i14) == 0) {
                        lVar2 = lVar;
                        if (o0VarE.r(lVar2)) {
                            i28 = 131072;
                        } else {
                            i28 = 65536;
                        }
                        i16 |= i28;
                    }
                    if ((74899 & i16) != 74898) {
                        if (i29 != 0) {
                            z16 = true;
                        }
                        if (i17 != 0) {
                            f16 = 0.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i25 != 0) {
                            f17 = 0.0f;
                        }
                        if (i27 != 0) {
                            o0VarE.C(-1493261926);
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new f0(12);
                                o0VarE.K(objQ);
                            }
                            o0VarE.g0(false);
                            lVar3 = (e23.l) objQ;
                        } else {
                            lVar3 = lVar2;
                        }
                        x1 x1Var114 = p3.n.f135158a;
                        int i311119 = i16 & 14;
                        int i3111110 = i16 << 3;
                        float f211119 = f16;
                        boolean z2117 = z19;
                        float f2111110 = f17;
                        TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f211119, z2117, f2111110, lVar3, o0VarE, i311119 | (i3111110 & 896) | (i3111110 & 7168) | (57344 & i3111110) | (458752 & i3111110) | (i3111110 & 3670016), 0);
                        f18 = f211119;
                        z18 = z2117;
                        f19 = f2111110;
                        lVar4 = lVar3;
                    } else {
                        if (i29 != 0) {
                            z16 = true;
                        }
                        if (i17 != 0) {
                            f16 = 0.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i25 != 0) {
                            f17 = 0.0f;
                        }
                        if (i27 != 0) {
                            o0VarE.C(-1493261926);
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new f0(12);
                                o0VarE.K(objQ);
                            }
                            o0VarE.g0(false);
                            lVar3 = (e23.l) objQ;
                        } else {
                            lVar3 = lVar2;
                        }
                        x1 x1Var115 = p3.n.f135158a;
                        int i3111111 = i16 & 14;
                        int i3111112 = i16 << 3;
                        float f2111111 = f16;
                        boolean z2118 = z19;
                        float f2111112 = f17;
                        TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f2111111, z2118, f2111112, lVar3, o0VarE, i3111111 | (i3111112 & 896) | (i3111112 & 7168) | (57344 & i3111112) | (458752 & i3111112) | (i3111112 & 3670016), 0);
                        f18 = f2111111;
                        z18 = z2118;
                        f19 = f2111112;
                        lVar4 = lVar3;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.o0
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return TileOverlayKt.TileOverlay$lambda$2(tileProvider, z16, f18, z18, f19, lVar4, i14, i15, (p3.m) obj, iIntValue);
                            }
                        };
                    }
                }
                i16 |= 196608;
                lVar2 = lVar;
                if ((74899 & i16) != 74898) {
                    if (i29 != 0) {
                        z16 = true;
                    }
                    if (i17 != 0) {
                        f16 = 0.0f;
                    }
                    if (i19 == 0) {
                    }
                    if (i25 != 0) {
                        f17 = 0.0f;
                    }
                    if (i27 != 0) {
                        o0VarE.C(-1493261926);
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new f0(12);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        lVar3 = (e23.l) objQ;
                    } else {
                        lVar3 = lVar2;
                    }
                    x1 x1Var116 = p3.n.f135158a;
                    int i3111113 = i16 & 14;
                    int i3111114 = i16 << 3;
                    float f2111113 = f16;
                    boolean z2119 = z19;
                    float f2111114 = f17;
                    TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f2111113, z2119, f2111114, lVar3, o0VarE, i3111113 | (i3111114 & 896) | (i3111114 & 7168) | (57344 & i3111114) | (458752 & i3111114) | (i3111114 & 3670016), 0);
                    f18 = f2111113;
                    z18 = z2119;
                    f19 = f2111114;
                    lVar4 = lVar3;
                } else {
                    if (i29 != 0) {
                        z16 = true;
                    }
                    if (i17 != 0) {
                        f16 = 0.0f;
                    }
                    if (i19 == 0) {
                    }
                    if (i25 != 0) {
                        f17 = 0.0f;
                    }
                    if (i27 != 0) {
                        o0VarE.C(-1493261926);
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new f0(12);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        lVar3 = (e23.l) objQ;
                    } else {
                        lVar3 = lVar2;
                    }
                    x1 x1Var117 = p3.n.f135158a;
                    int i3111115 = i16 & 14;
                    int i3111116 = i16 << 3;
                    float f2111115 = f16;
                    boolean z21110 = z19;
                    float f2111116 = f17;
                    TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f2111115, z21110, f2111116, lVar3, o0VarE, i3111115 | (i3111116 & 896) | (i3111116 & 7168) | (57344 & i3111116) | (458752 & i3111116) | (i3111116 & 3670016), 0);
                    f18 = f2111115;
                    z18 = z21110;
                    f19 = f2111116;
                    lVar4 = lVar3;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.o0
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TileOverlayKt.TileOverlay$lambda$2(tileProvider, z16, f18, z18, f19, lVar4, i14, i15, (p3.m) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 24576;
            f17 = f15;
            i27 = i15 & 32;
            if (i27 != 0) {
                if ((196608 & i14) == 0) {
                    lVar2 = lVar;
                    if (o0VarE.r(lVar2)) {
                        i28 = 131072;
                    } else {
                        i28 = 65536;
                    }
                    i16 |= i28;
                }
                if ((74899 & i16) != 74898) {
                    if (i29 != 0) {
                        z16 = true;
                    }
                    if (i17 != 0) {
                        f16 = 0.0f;
                    }
                    if (i19 == 0) {
                    }
                    if (i25 != 0) {
                        f17 = 0.0f;
                    }
                    if (i27 != 0) {
                        o0VarE.C(-1493261926);
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new f0(12);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        lVar3 = (e23.l) objQ;
                    } else {
                        lVar3 = lVar2;
                    }
                    x1 x1Var118 = p3.n.f135158a;
                    int i3111117 = i16 & 14;
                    int i3111118 = i16 << 3;
                    float f2111117 = f16;
                    boolean z21111 = z19;
                    float f2111118 = f17;
                    TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f2111117, z21111, f2111118, lVar3, o0VarE, i3111117 | (i3111118 & 896) | (i3111118 & 7168) | (57344 & i3111118) | (458752 & i3111118) | (i3111118 & 3670016), 0);
                    f18 = f2111117;
                    z18 = z21111;
                    f19 = f2111118;
                    lVar4 = lVar3;
                } else {
                    if (i29 != 0) {
                        z16 = true;
                    }
                    if (i17 != 0) {
                        f16 = 0.0f;
                    }
                    if (i19 == 0) {
                    }
                    if (i25 != 0) {
                        f17 = 0.0f;
                    }
                    if (i27 != 0) {
                        o0VarE.C(-1493261926);
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new f0(12);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        lVar3 = (e23.l) objQ;
                    } else {
                        lVar3 = lVar2;
                    }
                    x1 x1Var119 = p3.n.f135158a;
                    int i3111119 = i16 & 14;
                    int i31111110 = i16 << 3;
                    float f2111119 = f16;
                    boolean z21112 = z19;
                    float f21111110 = f17;
                    TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f2111119, z21112, f21111110, lVar3, o0VarE, i3111119 | (i31111110 & 896) | (i31111110 & 7168) | (57344 & i31111110) | (458752 & i31111110) | (i31111110 & 3670016), 0);
                    f18 = f2111119;
                    z18 = z21112;
                    f19 = f21111110;
                    lVar4 = lVar3;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.o0
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TileOverlayKt.TileOverlay$lambda$2(tileProvider, z16, f18, z18, f19, lVar4, i14, i15, (p3.m) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 196608;
            lVar2 = lVar;
            if ((74899 & i16) != 74898) {
                if (i29 != 0) {
                    z16 = true;
                }
                if (i17 != 0) {
                    f16 = 0.0f;
                }
                if (i19 == 0) {
                }
                if (i25 != 0) {
                    f17 = 0.0f;
                }
                if (i27 != 0) {
                    o0VarE.C(-1493261926);
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new f0(12);
                        o0VarE.K(objQ);
                    }
                    o0VarE.g0(false);
                    lVar3 = (e23.l) objQ;
                } else {
                    lVar3 = lVar2;
                }
                x1 x1Var1110 = p3.n.f135158a;
                int i31111111 = i16 & 14;
                int i31111112 = i16 << 3;
                float f21111111 = f16;
                boolean z21113 = z19;
                float f21111112 = f17;
                TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f21111111, z21113, f21111112, lVar3, o0VarE, i31111111 | (i31111112 & 896) | (i31111112 & 7168) | (57344 & i31111112) | (458752 & i31111112) | (i31111112 & 3670016), 0);
                f18 = f21111111;
                z18 = z21113;
                f19 = f21111112;
                lVar4 = lVar3;
            } else {
                if (i29 != 0) {
                    z16 = true;
                }
                if (i17 != 0) {
                    f16 = 0.0f;
                }
                if (i19 == 0) {
                }
                if (i25 != 0) {
                    f17 = 0.0f;
                }
                if (i27 != 0) {
                    o0VarE.C(-1493261926);
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new f0(12);
                        o0VarE.K(objQ);
                    }
                    o0VarE.g0(false);
                    lVar3 = (e23.l) objQ;
                } else {
                    lVar3 = lVar2;
                }
                x1 x1Var1111 = p3.n.f135158a;
                int i31111113 = i16 & 14;
                int i31111114 = i16 << 3;
                float f21111113 = f16;
                boolean z21114 = z19;
                float f21111114 = f17;
                TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f21111113, z21114, f21111114, lVar3, o0VarE, i31111113 | (i31111114 & 896) | (i31111114 & 7168) | (57344 & i31111114) | (458752 & i31111114) | (i31111114 & 3670016), 0);
                f18 = f21111113;
                z18 = z21114;
                f19 = f21111114;
                lVar4 = lVar3;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.o0
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TileOverlayKt.TileOverlay$lambda$2(tileProvider, z16, f18, z18, f19, lVar4, i14, i15, (p3.m) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 48;
        z16 = z14;
        i17 = i15 & 4;
        if (i17 != 0) {
            if ((i14 & 384) == 0) {
                f16 = f14;
                if (o0VarE.i(f16)) {
                    i18 = 256;
                } else {
                    i18 = 128;
                }
                i16 |= i18;
            }
            i19 = i15 & 8;
            if (i19 != 0) {
                if ((i14 & 3072) == 0) {
                    z17 = z15;
                    if (o0VarE.h(z17)) {
                        i24 = 2048;
                    } else {
                        i24 = 1024;
                    }
                    i16 |= i24;
                }
                i25 = i15 & 16;
                if (i25 != 0) {
                    if ((i14 & 24576) == 0) {
                        f17 = f15;
                        if (o0VarE.i(f17)) {
                            i26 = 16384;
                        } else {
                            i26 = 8192;
                        }
                        i16 |= i26;
                    }
                    i27 = i15 & 32;
                    if (i27 != 0) {
                        if ((196608 & i14) == 0) {
                            lVar2 = lVar;
                            if (o0VarE.r(lVar2)) {
                                i28 = 131072;
                            } else {
                                i28 = 65536;
                            }
                            i16 |= i28;
                        }
                        if ((74899 & i16) != 74898) {
                            if (i29 != 0) {
                                z16 = true;
                            }
                            if (i17 != 0) {
                                f16 = 0.0f;
                            }
                            if (i19 == 0) {
                            }
                            if (i25 != 0) {
                                f17 = 0.0f;
                            }
                            if (i27 != 0) {
                                o0VarE.C(-1493261926);
                                objQ = o0VarE.q();
                                p3.m.f135153a.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new f0(12);
                                    o0VarE.K(objQ);
                                }
                                o0VarE.g0(false);
                                lVar3 = (e23.l) objQ;
                            } else {
                                lVar3 = lVar2;
                            }
                            x1 x1Var1112 = p3.n.f135158a;
                            int i31111115 = i16 & 14;
                            int i31111116 = i16 << 3;
                            float f21111115 = f16;
                            boolean z21115 = z19;
                            float f21111116 = f17;
                            TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f21111115, z21115, f21111116, lVar3, o0VarE, i31111115 | (i31111116 & 896) | (i31111116 & 7168) | (57344 & i31111116) | (458752 & i31111116) | (i31111116 & 3670016), 0);
                            f18 = f21111115;
                            z18 = z21115;
                            f19 = f21111116;
                            lVar4 = lVar3;
                        } else {
                            if (i29 != 0) {
                                z16 = true;
                            }
                            if (i17 != 0) {
                                f16 = 0.0f;
                            }
                            if (i19 == 0) {
                            }
                            if (i25 != 0) {
                                f17 = 0.0f;
                            }
                            if (i27 != 0) {
                                o0VarE.C(-1493261926);
                                objQ = o0VarE.q();
                                p3.m.f135153a.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new f0(12);
                                    o0VarE.K(objQ);
                                }
                                o0VarE.g0(false);
                                lVar3 = (e23.l) objQ;
                            } else {
                                lVar3 = lVar2;
                            }
                            x1 x1Var1113 = p3.n.f135158a;
                            int i31111117 = i16 & 14;
                            int i31111118 = i16 << 3;
                            float f21111117 = f16;
                            boolean z21116 = z19;
                            float f21111118 = f17;
                            TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f21111117, z21116, f21111118, lVar3, o0VarE, i31111117 | (i31111118 & 896) | (i31111118 & 7168) | (57344 & i31111118) | (458752 & i31111118) | (i31111118 & 3670016), 0);
                            f18 = f21111117;
                            z18 = z21116;
                            f19 = f21111118;
                            lVar4 = lVar3;
                        }
                        p2VarI0 = o0VarE.i0();
                        if (p2VarI0 != null) {
                            p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.o0
                                @Override // e23.p
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return TileOverlayKt.TileOverlay$lambda$2(tileProvider, z16, f18, z18, f19, lVar4, i14, i15, (p3.m) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i16 |= 196608;
                    lVar2 = lVar;
                    if ((74899 & i16) != 74898) {
                        if (i29 != 0) {
                            z16 = true;
                        }
                        if (i17 != 0) {
                            f16 = 0.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i25 != 0) {
                            f17 = 0.0f;
                        }
                        if (i27 != 0) {
                            o0VarE.C(-1493261926);
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new f0(12);
                                o0VarE.K(objQ);
                            }
                            o0VarE.g0(false);
                            lVar3 = (e23.l) objQ;
                        } else {
                            lVar3 = lVar2;
                        }
                        x1 x1Var1114 = p3.n.f135158a;
                        int i31111119 = i16 & 14;
                        int i311111110 = i16 << 3;
                        float f21111119 = f16;
                        boolean z21117 = z19;
                        float f211111110 = f17;
                        TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f21111119, z21117, f211111110, lVar3, o0VarE, i31111119 | (i311111110 & 896) | (i311111110 & 7168) | (57344 & i311111110) | (458752 & i311111110) | (i311111110 & 3670016), 0);
                        f18 = f21111119;
                        z18 = z21117;
                        f19 = f211111110;
                        lVar4 = lVar3;
                    } else {
                        if (i29 != 0) {
                            z16 = true;
                        }
                        if (i17 != 0) {
                            f16 = 0.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i25 != 0) {
                            f17 = 0.0f;
                        }
                        if (i27 != 0) {
                            o0VarE.C(-1493261926);
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new f0(12);
                                o0VarE.K(objQ);
                            }
                            o0VarE.g0(false);
                            lVar3 = (e23.l) objQ;
                        } else {
                            lVar3 = lVar2;
                        }
                        x1 x1Var1115 = p3.n.f135158a;
                        int i311111111 = i16 & 14;
                        int i311111112 = i16 << 3;
                        float f211111111 = f16;
                        boolean z21118 = z19;
                        float f211111112 = f17;
                        TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f211111111, z21118, f211111112, lVar3, o0VarE, i311111111 | (i311111112 & 896) | (i311111112 & 7168) | (57344 & i311111112) | (458752 & i311111112) | (i311111112 & 3670016), 0);
                        f18 = f211111111;
                        z18 = z21118;
                        f19 = f211111112;
                        lVar4 = lVar3;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.o0
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return TileOverlayKt.TileOverlay$lambda$2(tileProvider, z16, f18, z18, f19, lVar4, i14, i15, (p3.m) obj, iIntValue);
                            }
                        };
                    }
                }
                i16 |= 24576;
                f17 = f15;
                i27 = i15 & 32;
                if (i27 != 0) {
                    if ((196608 & i14) == 0) {
                        lVar2 = lVar;
                        if (o0VarE.r(lVar2)) {
                            i28 = 131072;
                        } else {
                            i28 = 65536;
                        }
                        i16 |= i28;
                    }
                    if ((74899 & i16) != 74898) {
                        if (i29 != 0) {
                            z16 = true;
                        }
                        if (i17 != 0) {
                            f16 = 0.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i25 != 0) {
                            f17 = 0.0f;
                        }
                        if (i27 != 0) {
                            o0VarE.C(-1493261926);
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new f0(12);
                                o0VarE.K(objQ);
                            }
                            o0VarE.g0(false);
                            lVar3 = (e23.l) objQ;
                        } else {
                            lVar3 = lVar2;
                        }
                        x1 x1Var1116 = p3.n.f135158a;
                        int i311111113 = i16 & 14;
                        int i311111114 = i16 << 3;
                        float f211111113 = f16;
                        boolean z21119 = z19;
                        float f211111114 = f17;
                        TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f211111113, z21119, f211111114, lVar3, o0VarE, i311111113 | (i311111114 & 896) | (i311111114 & 7168) | (57344 & i311111114) | (458752 & i311111114) | (i311111114 & 3670016), 0);
                        f18 = f211111113;
                        z18 = z21119;
                        f19 = f211111114;
                        lVar4 = lVar3;
                    } else {
                        if (i29 != 0) {
                            z16 = true;
                        }
                        if (i17 != 0) {
                            f16 = 0.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i25 != 0) {
                            f17 = 0.0f;
                        }
                        if (i27 != 0) {
                            o0VarE.C(-1493261926);
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new f0(12);
                                o0VarE.K(objQ);
                            }
                            o0VarE.g0(false);
                            lVar3 = (e23.l) objQ;
                        } else {
                            lVar3 = lVar2;
                        }
                        x1 x1Var1117 = p3.n.f135158a;
                        int i311111115 = i16 & 14;
                        int i311111116 = i16 << 3;
                        float f211111115 = f16;
                        boolean z211110 = z19;
                        float f211111116 = f17;
                        TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f211111115, z211110, f211111116, lVar3, o0VarE, i311111115 | (i311111116 & 896) | (i311111116 & 7168) | (57344 & i311111116) | (458752 & i311111116) | (i311111116 & 3670016), 0);
                        f18 = f211111115;
                        z18 = z211110;
                        f19 = f211111116;
                        lVar4 = lVar3;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.o0
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return TileOverlayKt.TileOverlay$lambda$2(tileProvider, z16, f18, z18, f19, lVar4, i14, i15, (p3.m) obj, iIntValue);
                            }
                        };
                    }
                }
                i16 |= 196608;
                lVar2 = lVar;
                if ((74899 & i16) != 74898) {
                    if (i29 != 0) {
                        z16 = true;
                    }
                    if (i17 != 0) {
                        f16 = 0.0f;
                    }
                    if (i19 == 0) {
                    }
                    if (i25 != 0) {
                        f17 = 0.0f;
                    }
                    if (i27 != 0) {
                        o0VarE.C(-1493261926);
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new f0(12);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        lVar3 = (e23.l) objQ;
                    } else {
                        lVar3 = lVar2;
                    }
                    x1 x1Var1118 = p3.n.f135158a;
                    int i311111117 = i16 & 14;
                    int i311111118 = i16 << 3;
                    float f211111117 = f16;
                    boolean z211111 = z19;
                    float f211111118 = f17;
                    TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f211111117, z211111, f211111118, lVar3, o0VarE, i311111117 | (i311111118 & 896) | (i311111118 & 7168) | (57344 & i311111118) | (458752 & i311111118) | (i311111118 & 3670016), 0);
                    f18 = f211111117;
                    z18 = z211111;
                    f19 = f211111118;
                    lVar4 = lVar3;
                } else {
                    if (i29 != 0) {
                        z16 = true;
                    }
                    if (i17 != 0) {
                        f16 = 0.0f;
                    }
                    if (i19 == 0) {
                    }
                    if (i25 != 0) {
                        f17 = 0.0f;
                    }
                    if (i27 != 0) {
                        o0VarE.C(-1493261926);
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new f0(12);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        lVar3 = (e23.l) objQ;
                    } else {
                        lVar3 = lVar2;
                    }
                    x1 x1Var1119 = p3.n.f135158a;
                    int i311111119 = i16 & 14;
                    int i3111111110 = i16 << 3;
                    float f211111119 = f16;
                    boolean z211112 = z19;
                    float f2111111110 = f17;
                    TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f211111119, z211112, f2111111110, lVar3, o0VarE, i311111119 | (i3111111110 & 896) | (i3111111110 & 7168) | (57344 & i3111111110) | (458752 & i3111111110) | (i3111111110 & 3670016), 0);
                    f18 = f211111119;
                    z18 = z211112;
                    f19 = f2111111110;
                    lVar4 = lVar3;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.o0
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TileOverlayKt.TileOverlay$lambda$2(tileProvider, z16, f18, z18, f19, lVar4, i14, i15, (p3.m) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 3072;
            z17 = z15;
            i25 = i15 & 16;
            if (i25 != 0) {
                if ((i14 & 24576) == 0) {
                    f17 = f15;
                    if (o0VarE.i(f17)) {
                        i26 = 16384;
                    } else {
                        i26 = 8192;
                    }
                    i16 |= i26;
                }
                i27 = i15 & 32;
                if (i27 != 0) {
                    if ((196608 & i14) == 0) {
                        lVar2 = lVar;
                        if (o0VarE.r(lVar2)) {
                            i28 = 131072;
                        } else {
                            i28 = 65536;
                        }
                        i16 |= i28;
                    }
                    if ((74899 & i16) != 74898) {
                        if (i29 != 0) {
                            z16 = true;
                        }
                        if (i17 != 0) {
                            f16 = 0.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i25 != 0) {
                            f17 = 0.0f;
                        }
                        if (i27 != 0) {
                            o0VarE.C(-1493261926);
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new f0(12);
                                o0VarE.K(objQ);
                            }
                            o0VarE.g0(false);
                            lVar3 = (e23.l) objQ;
                        } else {
                            lVar3 = lVar2;
                        }
                        x1 x1Var11110 = p3.n.f135158a;
                        int i3111111111 = i16 & 14;
                        int i3111111112 = i16 << 3;
                        float f2111111111 = f16;
                        boolean z211113 = z19;
                        float f2111111112 = f17;
                        TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f2111111111, z211113, f2111111112, lVar3, o0VarE, i3111111111 | (i3111111112 & 896) | (i3111111112 & 7168) | (57344 & i3111111112) | (458752 & i3111111112) | (i3111111112 & 3670016), 0);
                        f18 = f2111111111;
                        z18 = z211113;
                        f19 = f2111111112;
                        lVar4 = lVar3;
                    } else {
                        if (i29 != 0) {
                            z16 = true;
                        }
                        if (i17 != 0) {
                            f16 = 0.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i25 != 0) {
                            f17 = 0.0f;
                        }
                        if (i27 != 0) {
                            o0VarE.C(-1493261926);
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new f0(12);
                                o0VarE.K(objQ);
                            }
                            o0VarE.g0(false);
                            lVar3 = (e23.l) objQ;
                        } else {
                            lVar3 = lVar2;
                        }
                        x1 x1Var11111 = p3.n.f135158a;
                        int i3111111113 = i16 & 14;
                        int i3111111114 = i16 << 3;
                        float f2111111113 = f16;
                        boolean z211114 = z19;
                        float f2111111114 = f17;
                        TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f2111111113, z211114, f2111111114, lVar3, o0VarE, i3111111113 | (i3111111114 & 896) | (i3111111114 & 7168) | (57344 & i3111111114) | (458752 & i3111111114) | (i3111111114 & 3670016), 0);
                        f18 = f2111111113;
                        z18 = z211114;
                        f19 = f2111111114;
                        lVar4 = lVar3;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.o0
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return TileOverlayKt.TileOverlay$lambda$2(tileProvider, z16, f18, z18, f19, lVar4, i14, i15, (p3.m) obj, iIntValue);
                            }
                        };
                    }
                }
                i16 |= 196608;
                lVar2 = lVar;
                if ((74899 & i16) != 74898) {
                    if (i29 != 0) {
                        z16 = true;
                    }
                    if (i17 != 0) {
                        f16 = 0.0f;
                    }
                    if (i19 == 0) {
                    }
                    if (i25 != 0) {
                        f17 = 0.0f;
                    }
                    if (i27 != 0) {
                        o0VarE.C(-1493261926);
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new f0(12);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        lVar3 = (e23.l) objQ;
                    } else {
                        lVar3 = lVar2;
                    }
                    x1 x1Var11112 = p3.n.f135158a;
                    int i3111111115 = i16 & 14;
                    int i3111111116 = i16 << 3;
                    float f2111111115 = f16;
                    boolean z211115 = z19;
                    float f2111111116 = f17;
                    TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f2111111115, z211115, f2111111116, lVar3, o0VarE, i3111111115 | (i3111111116 & 896) | (i3111111116 & 7168) | (57344 & i3111111116) | (458752 & i3111111116) | (i3111111116 & 3670016), 0);
                    f18 = f2111111115;
                    z18 = z211115;
                    f19 = f2111111116;
                    lVar4 = lVar3;
                } else {
                    if (i29 != 0) {
                        z16 = true;
                    }
                    if (i17 != 0) {
                        f16 = 0.0f;
                    }
                    if (i19 == 0) {
                    }
                    if (i25 != 0) {
                        f17 = 0.0f;
                    }
                    if (i27 != 0) {
                        o0VarE.C(-1493261926);
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new f0(12);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        lVar3 = (e23.l) objQ;
                    } else {
                        lVar3 = lVar2;
                    }
                    x1 x1Var11113 = p3.n.f135158a;
                    int i3111111117 = i16 & 14;
                    int i3111111118 = i16 << 3;
                    float f2111111117 = f16;
                    boolean z211116 = z19;
                    float f2111111118 = f17;
                    TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f2111111117, z211116, f2111111118, lVar3, o0VarE, i3111111117 | (i3111111118 & 896) | (i3111111118 & 7168) | (57344 & i3111111118) | (458752 & i3111111118) | (i3111111118 & 3670016), 0);
                    f18 = f2111111117;
                    z18 = z211116;
                    f19 = f2111111118;
                    lVar4 = lVar3;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.o0
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TileOverlayKt.TileOverlay$lambda$2(tileProvider, z16, f18, z18, f19, lVar4, i14, i15, (p3.m) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 24576;
            f17 = f15;
            i27 = i15 & 32;
            if (i27 != 0) {
                if ((196608 & i14) == 0) {
                    lVar2 = lVar;
                    if (o0VarE.r(lVar2)) {
                        i28 = 131072;
                    } else {
                        i28 = 65536;
                    }
                    i16 |= i28;
                }
                if ((74899 & i16) != 74898) {
                    if (i29 != 0) {
                        z16 = true;
                    }
                    if (i17 != 0) {
                        f16 = 0.0f;
                    }
                    if (i19 == 0) {
                    }
                    if (i25 != 0) {
                        f17 = 0.0f;
                    }
                    if (i27 != 0) {
                        o0VarE.C(-1493261926);
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new f0(12);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        lVar3 = (e23.l) objQ;
                    } else {
                        lVar3 = lVar2;
                    }
                    x1 x1Var11114 = p3.n.f135158a;
                    int i3111111119 = i16 & 14;
                    int i31111111110 = i16 << 3;
                    float f2111111119 = f16;
                    boolean z211117 = z19;
                    float f21111111110 = f17;
                    TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f2111111119, z211117, f21111111110, lVar3, o0VarE, i3111111119 | (i31111111110 & 896) | (i31111111110 & 7168) | (57344 & i31111111110) | (458752 & i31111111110) | (i31111111110 & 3670016), 0);
                    f18 = f2111111119;
                    z18 = z211117;
                    f19 = f21111111110;
                    lVar4 = lVar3;
                } else {
                    if (i29 != 0) {
                        z16 = true;
                    }
                    if (i17 != 0) {
                        f16 = 0.0f;
                    }
                    if (i19 == 0) {
                    }
                    if (i25 != 0) {
                        f17 = 0.0f;
                    }
                    if (i27 != 0) {
                        o0VarE.C(-1493261926);
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new f0(12);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        lVar3 = (e23.l) objQ;
                    } else {
                        lVar3 = lVar2;
                    }
                    x1 x1Var11115 = p3.n.f135158a;
                    int i31111111111 = i16 & 14;
                    int i31111111112 = i16 << 3;
                    float f21111111111 = f16;
                    boolean z211118 = z19;
                    float f21111111112 = f17;
                    TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f21111111111, z211118, f21111111112, lVar3, o0VarE, i31111111111 | (i31111111112 & 896) | (i31111111112 & 7168) | (57344 & i31111111112) | (458752 & i31111111112) | (i31111111112 & 3670016), 0);
                    f18 = f21111111111;
                    z18 = z211118;
                    f19 = f21111111112;
                    lVar4 = lVar3;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.o0
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TileOverlayKt.TileOverlay$lambda$2(tileProvider, z16, f18, z18, f19, lVar4, i14, i15, (p3.m) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 196608;
            lVar2 = lVar;
            if ((74899 & i16) != 74898) {
                if (i29 != 0) {
                    z16 = true;
                }
                if (i17 != 0) {
                    f16 = 0.0f;
                }
                if (i19 == 0) {
                }
                if (i25 != 0) {
                    f17 = 0.0f;
                }
                if (i27 != 0) {
                    o0VarE.C(-1493261926);
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new f0(12);
                        o0VarE.K(objQ);
                    }
                    o0VarE.g0(false);
                    lVar3 = (e23.l) objQ;
                } else {
                    lVar3 = lVar2;
                }
                x1 x1Var11116 = p3.n.f135158a;
                int i31111111113 = i16 & 14;
                int i31111111114 = i16 << 3;
                float f21111111113 = f16;
                boolean z211119 = z19;
                float f21111111114 = f17;
                TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f21111111113, z211119, f21111111114, lVar3, o0VarE, i31111111113 | (i31111111114 & 896) | (i31111111114 & 7168) | (57344 & i31111111114) | (458752 & i31111111114) | (i31111111114 & 3670016), 0);
                f18 = f21111111113;
                z18 = z211119;
                f19 = f21111111114;
                lVar4 = lVar3;
            } else {
                if (i29 != 0) {
                    z16 = true;
                }
                if (i17 != 0) {
                    f16 = 0.0f;
                }
                if (i19 == 0) {
                }
                if (i25 != 0) {
                    f17 = 0.0f;
                }
                if (i27 != 0) {
                    o0VarE.C(-1493261926);
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new f0(12);
                        o0VarE.K(objQ);
                    }
                    o0VarE.g0(false);
                    lVar3 = (e23.l) objQ;
                } else {
                    lVar3 = lVar2;
                }
                x1 x1Var11117 = p3.n.f135158a;
                int i31111111115 = i16 & 14;
                int i31111111116 = i16 << 3;
                float f21111111115 = f16;
                boolean z2111110 = z19;
                float f21111111116 = f17;
                TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f21111111115, z2111110, f21111111116, lVar3, o0VarE, i31111111115 | (i31111111116 & 896) | (i31111111116 & 7168) | (57344 & i31111111116) | (458752 & i31111111116) | (i31111111116 & 3670016), 0);
                f18 = f21111111115;
                z18 = z2111110;
                f19 = f21111111116;
                lVar4 = lVar3;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.o0
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TileOverlayKt.TileOverlay$lambda$2(tileProvider, z16, f18, z18, f19, lVar4, i14, i15, (p3.m) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 384;
        f16 = f14;
        i19 = i15 & 8;
        if (i19 != 0) {
            if ((i14 & 3072) == 0) {
                z17 = z15;
                if (o0VarE.h(z17)) {
                    i24 = 2048;
                } else {
                    i24 = 1024;
                }
                i16 |= i24;
            }
            i25 = i15 & 16;
            if (i25 != 0) {
                if ((i14 & 24576) == 0) {
                    f17 = f15;
                    if (o0VarE.i(f17)) {
                        i26 = 16384;
                    } else {
                        i26 = 8192;
                    }
                    i16 |= i26;
                }
                i27 = i15 & 32;
                if (i27 != 0) {
                    if ((196608 & i14) == 0) {
                        lVar2 = lVar;
                        if (o0VarE.r(lVar2)) {
                            i28 = 131072;
                        } else {
                            i28 = 65536;
                        }
                        i16 |= i28;
                    }
                    if ((74899 & i16) != 74898) {
                        if (i29 != 0) {
                            z16 = true;
                        }
                        if (i17 != 0) {
                            f16 = 0.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i25 != 0) {
                            f17 = 0.0f;
                        }
                        if (i27 != 0) {
                            o0VarE.C(-1493261926);
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new f0(12);
                                o0VarE.K(objQ);
                            }
                            o0VarE.g0(false);
                            lVar3 = (e23.l) objQ;
                        } else {
                            lVar3 = lVar2;
                        }
                        x1 x1Var11118 = p3.n.f135158a;
                        int i31111111117 = i16 & 14;
                        int i31111111118 = i16 << 3;
                        float f21111111117 = f16;
                        boolean z2111111 = z19;
                        float f21111111118 = f17;
                        TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f21111111117, z2111111, f21111111118, lVar3, o0VarE, i31111111117 | (i31111111118 & 896) | (i31111111118 & 7168) | (57344 & i31111111118) | (458752 & i31111111118) | (i31111111118 & 3670016), 0);
                        f18 = f21111111117;
                        z18 = z2111111;
                        f19 = f21111111118;
                        lVar4 = lVar3;
                    } else {
                        if (i29 != 0) {
                            z16 = true;
                        }
                        if (i17 != 0) {
                            f16 = 0.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i25 != 0) {
                            f17 = 0.0f;
                        }
                        if (i27 != 0) {
                            o0VarE.C(-1493261926);
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new f0(12);
                                o0VarE.K(objQ);
                            }
                            o0VarE.g0(false);
                            lVar3 = (e23.l) objQ;
                        } else {
                            lVar3 = lVar2;
                        }
                        x1 x1Var11119 = p3.n.f135158a;
                        int i31111111119 = i16 & 14;
                        int i311111111110 = i16 << 3;
                        float f21111111119 = f16;
                        boolean z2111112 = z19;
                        float f211111111110 = f17;
                        TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f21111111119, z2111112, f211111111110, lVar3, o0VarE, i31111111119 | (i311111111110 & 896) | (i311111111110 & 7168) | (57344 & i311111111110) | (458752 & i311111111110) | (i311111111110 & 3670016), 0);
                        f18 = f21111111119;
                        z18 = z2111112;
                        f19 = f211111111110;
                        lVar4 = lVar3;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.o0
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return TileOverlayKt.TileOverlay$lambda$2(tileProvider, z16, f18, z18, f19, lVar4, i14, i15, (p3.m) obj, iIntValue);
                            }
                        };
                    }
                }
                i16 |= 196608;
                lVar2 = lVar;
                if ((74899 & i16) != 74898) {
                    if (i29 != 0) {
                        z16 = true;
                    }
                    if (i17 != 0) {
                        f16 = 0.0f;
                    }
                    if (i19 == 0) {
                    }
                    if (i25 != 0) {
                        f17 = 0.0f;
                    }
                    if (i27 != 0) {
                        o0VarE.C(-1493261926);
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new f0(12);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        lVar3 = (e23.l) objQ;
                    } else {
                        lVar3 = lVar2;
                    }
                    x1 x1Var111110 = p3.n.f135158a;
                    int i311111111111 = i16 & 14;
                    int i311111111112 = i16 << 3;
                    float f211111111111 = f16;
                    boolean z2111113 = z19;
                    float f211111111112 = f17;
                    TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f211111111111, z2111113, f211111111112, lVar3, o0VarE, i311111111111 | (i311111111112 & 896) | (i311111111112 & 7168) | (57344 & i311111111112) | (458752 & i311111111112) | (i311111111112 & 3670016), 0);
                    f18 = f211111111111;
                    z18 = z2111113;
                    f19 = f211111111112;
                    lVar4 = lVar3;
                } else {
                    if (i29 != 0) {
                        z16 = true;
                    }
                    if (i17 != 0) {
                        f16 = 0.0f;
                    }
                    if (i19 == 0) {
                    }
                    if (i25 != 0) {
                        f17 = 0.0f;
                    }
                    if (i27 != 0) {
                        o0VarE.C(-1493261926);
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new f0(12);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        lVar3 = (e23.l) objQ;
                    } else {
                        lVar3 = lVar2;
                    }
                    x1 x1Var111111 = p3.n.f135158a;
                    int i311111111113 = i16 & 14;
                    int i311111111114 = i16 << 3;
                    float f211111111113 = f16;
                    boolean z2111114 = z19;
                    float f211111111114 = f17;
                    TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f211111111113, z2111114, f211111111114, lVar3, o0VarE, i311111111113 | (i311111111114 & 896) | (i311111111114 & 7168) | (57344 & i311111111114) | (458752 & i311111111114) | (i311111111114 & 3670016), 0);
                    f18 = f211111111113;
                    z18 = z2111114;
                    f19 = f211111111114;
                    lVar4 = lVar3;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.o0
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TileOverlayKt.TileOverlay$lambda$2(tileProvider, z16, f18, z18, f19, lVar4, i14, i15, (p3.m) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 24576;
            f17 = f15;
            i27 = i15 & 32;
            if (i27 != 0) {
                if ((196608 & i14) == 0) {
                    lVar2 = lVar;
                    if (o0VarE.r(lVar2)) {
                        i28 = 131072;
                    } else {
                        i28 = 65536;
                    }
                    i16 |= i28;
                }
                if ((74899 & i16) != 74898) {
                    if (i29 != 0) {
                        z16 = true;
                    }
                    if (i17 != 0) {
                        f16 = 0.0f;
                    }
                    if (i19 == 0) {
                    }
                    if (i25 != 0) {
                        f17 = 0.0f;
                    }
                    if (i27 != 0) {
                        o0VarE.C(-1493261926);
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new f0(12);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        lVar3 = (e23.l) objQ;
                    } else {
                        lVar3 = lVar2;
                    }
                    x1 x1Var111112 = p3.n.f135158a;
                    int i311111111115 = i16 & 14;
                    int i311111111116 = i16 << 3;
                    float f211111111115 = f16;
                    boolean z2111115 = z19;
                    float f211111111116 = f17;
                    TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f211111111115, z2111115, f211111111116, lVar3, o0VarE, i311111111115 | (i311111111116 & 896) | (i311111111116 & 7168) | (57344 & i311111111116) | (458752 & i311111111116) | (i311111111116 & 3670016), 0);
                    f18 = f211111111115;
                    z18 = z2111115;
                    f19 = f211111111116;
                    lVar4 = lVar3;
                } else {
                    if (i29 != 0) {
                        z16 = true;
                    }
                    if (i17 != 0) {
                        f16 = 0.0f;
                    }
                    if (i19 == 0) {
                    }
                    if (i25 != 0) {
                        f17 = 0.0f;
                    }
                    if (i27 != 0) {
                        o0VarE.C(-1493261926);
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new f0(12);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        lVar3 = (e23.l) objQ;
                    } else {
                        lVar3 = lVar2;
                    }
                    x1 x1Var111113 = p3.n.f135158a;
                    int i311111111117 = i16 & 14;
                    int i311111111118 = i16 << 3;
                    float f211111111117 = f16;
                    boolean z2111116 = z19;
                    float f211111111118 = f17;
                    TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f211111111117, z2111116, f211111111118, lVar3, o0VarE, i311111111117 | (i311111111118 & 896) | (i311111111118 & 7168) | (57344 & i311111111118) | (458752 & i311111111118) | (i311111111118 & 3670016), 0);
                    f18 = f211111111117;
                    z18 = z2111116;
                    f19 = f211111111118;
                    lVar4 = lVar3;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.o0
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TileOverlayKt.TileOverlay$lambda$2(tileProvider, z16, f18, z18, f19, lVar4, i14, i15, (p3.m) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 196608;
            lVar2 = lVar;
            if ((74899 & i16) != 74898) {
                if (i29 != 0) {
                    z16 = true;
                }
                if (i17 != 0) {
                    f16 = 0.0f;
                }
                if (i19 == 0) {
                }
                if (i25 != 0) {
                    f17 = 0.0f;
                }
                if (i27 != 0) {
                    o0VarE.C(-1493261926);
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new f0(12);
                        o0VarE.K(objQ);
                    }
                    o0VarE.g0(false);
                    lVar3 = (e23.l) objQ;
                } else {
                    lVar3 = lVar2;
                }
                x1 x1Var111114 = p3.n.f135158a;
                int i311111111119 = i16 & 14;
                int i3111111111110 = i16 << 3;
                float f211111111119 = f16;
                boolean z2111117 = z19;
                float f2111111111110 = f17;
                TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f211111111119, z2111117, f2111111111110, lVar3, o0VarE, i311111111119 | (i3111111111110 & 896) | (i3111111111110 & 7168) | (57344 & i3111111111110) | (458752 & i3111111111110) | (i3111111111110 & 3670016), 0);
                f18 = f211111111119;
                z18 = z2111117;
                f19 = f2111111111110;
                lVar4 = lVar3;
            } else {
                if (i29 != 0) {
                    z16 = true;
                }
                if (i17 != 0) {
                    f16 = 0.0f;
                }
                if (i19 == 0) {
                }
                if (i25 != 0) {
                    f17 = 0.0f;
                }
                if (i27 != 0) {
                    o0VarE.C(-1493261926);
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new f0(12);
                        o0VarE.K(objQ);
                    }
                    o0VarE.g0(false);
                    lVar3 = (e23.l) objQ;
                } else {
                    lVar3 = lVar2;
                }
                x1 x1Var111115 = p3.n.f135158a;
                int i3111111111111 = i16 & 14;
                int i3111111111112 = i16 << 3;
                float f2111111111111 = f16;
                boolean z2111118 = z19;
                float f2111111111112 = f17;
                TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f2111111111111, z2111118, f2111111111112, lVar3, o0VarE, i3111111111111 | (i3111111111112 & 896) | (i3111111111112 & 7168) | (57344 & i3111111111112) | (458752 & i3111111111112) | (i3111111111112 & 3670016), 0);
                f18 = f2111111111111;
                z18 = z2111118;
                f19 = f2111111111112;
                lVar4 = lVar3;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.o0
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TileOverlayKt.TileOverlay$lambda$2(tileProvider, z16, f18, z18, f19, lVar4, i14, i15, (p3.m) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 3072;
        z17 = z15;
        i25 = i15 & 16;
        if (i25 != 0) {
            if ((i14 & 24576) == 0) {
                f17 = f15;
                if (o0VarE.i(f17)) {
                    i26 = 16384;
                } else {
                    i26 = 8192;
                }
                i16 |= i26;
            }
            i27 = i15 & 32;
            if (i27 != 0) {
                if ((196608 & i14) == 0) {
                    lVar2 = lVar;
                    if (o0VarE.r(lVar2)) {
                        i28 = 131072;
                    } else {
                        i28 = 65536;
                    }
                    i16 |= i28;
                }
                if ((74899 & i16) != 74898) {
                    if (i29 != 0) {
                        z16 = true;
                    }
                    if (i17 != 0) {
                        f16 = 0.0f;
                    }
                    if (i19 == 0) {
                    }
                    if (i25 != 0) {
                        f17 = 0.0f;
                    }
                    if (i27 != 0) {
                        o0VarE.C(-1493261926);
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new f0(12);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        lVar3 = (e23.l) objQ;
                    } else {
                        lVar3 = lVar2;
                    }
                    x1 x1Var111116 = p3.n.f135158a;
                    int i3111111111113 = i16 & 14;
                    int i3111111111114 = i16 << 3;
                    float f2111111111113 = f16;
                    boolean z2111119 = z19;
                    float f2111111111114 = f17;
                    TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f2111111111113, z2111119, f2111111111114, lVar3, o0VarE, i3111111111113 | (i3111111111114 & 896) | (i3111111111114 & 7168) | (57344 & i3111111111114) | (458752 & i3111111111114) | (i3111111111114 & 3670016), 0);
                    f18 = f2111111111113;
                    z18 = z2111119;
                    f19 = f2111111111114;
                    lVar4 = lVar3;
                } else {
                    if (i29 != 0) {
                        z16 = true;
                    }
                    if (i17 != 0) {
                        f16 = 0.0f;
                    }
                    if (i19 == 0) {
                    }
                    if (i25 != 0) {
                        f17 = 0.0f;
                    }
                    if (i27 != 0) {
                        o0VarE.C(-1493261926);
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new f0(12);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        lVar3 = (e23.l) objQ;
                    } else {
                        lVar3 = lVar2;
                    }
                    x1 x1Var111117 = p3.n.f135158a;
                    int i3111111111115 = i16 & 14;
                    int i3111111111116 = i16 << 3;
                    float f2111111111115 = f16;
                    boolean z21111110 = z19;
                    float f2111111111116 = f17;
                    TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f2111111111115, z21111110, f2111111111116, lVar3, o0VarE, i3111111111115 | (i3111111111116 & 896) | (i3111111111116 & 7168) | (57344 & i3111111111116) | (458752 & i3111111111116) | (i3111111111116 & 3670016), 0);
                    f18 = f2111111111115;
                    z18 = z21111110;
                    f19 = f2111111111116;
                    lVar4 = lVar3;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.o0
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TileOverlayKt.TileOverlay$lambda$2(tileProvider, z16, f18, z18, f19, lVar4, i14, i15, (p3.m) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 196608;
            lVar2 = lVar;
            if ((74899 & i16) != 74898) {
                if (i29 != 0) {
                    z16 = true;
                }
                if (i17 != 0) {
                    f16 = 0.0f;
                }
                if (i19 == 0) {
                }
                if (i25 != 0) {
                    f17 = 0.0f;
                }
                if (i27 != 0) {
                    o0VarE.C(-1493261926);
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new f0(12);
                        o0VarE.K(objQ);
                    }
                    o0VarE.g0(false);
                    lVar3 = (e23.l) objQ;
                } else {
                    lVar3 = lVar2;
                }
                x1 x1Var111118 = p3.n.f135158a;
                int i3111111111117 = i16 & 14;
                int i3111111111118 = i16 << 3;
                float f2111111111117 = f16;
                boolean z21111111 = z19;
                float f2111111111118 = f17;
                TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f2111111111117, z21111111, f2111111111118, lVar3, o0VarE, i3111111111117 | (i3111111111118 & 896) | (i3111111111118 & 7168) | (57344 & i3111111111118) | (458752 & i3111111111118) | (i3111111111118 & 3670016), 0);
                f18 = f2111111111117;
                z18 = z21111111;
                f19 = f2111111111118;
                lVar4 = lVar3;
            } else {
                if (i29 != 0) {
                    z16 = true;
                }
                if (i17 != 0) {
                    f16 = 0.0f;
                }
                if (i19 == 0) {
                }
                if (i25 != 0) {
                    f17 = 0.0f;
                }
                if (i27 != 0) {
                    o0VarE.C(-1493261926);
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new f0(12);
                        o0VarE.K(objQ);
                    }
                    o0VarE.g0(false);
                    lVar3 = (e23.l) objQ;
                } else {
                    lVar3 = lVar2;
                }
                x1 x1Var111119 = p3.n.f135158a;
                int i3111111111119 = i16 & 14;
                int i31111111111110 = i16 << 3;
                float f2111111111119 = f16;
                boolean z21111112 = z19;
                float f21111111111110 = f17;
                TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f2111111111119, z21111112, f21111111111110, lVar3, o0VarE, i3111111111119 | (i31111111111110 & 896) | (i31111111111110 & 7168) | (57344 & i31111111111110) | (458752 & i31111111111110) | (i31111111111110 & 3670016), 0);
                f18 = f2111111111119;
                z18 = z21111112;
                f19 = f21111111111110;
                lVar4 = lVar3;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.o0
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TileOverlayKt.TileOverlay$lambda$2(tileProvider, z16, f18, z18, f19, lVar4, i14, i15, (p3.m) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 24576;
        f17 = f15;
        i27 = i15 & 32;
        if (i27 != 0) {
            if ((196608 & i14) == 0) {
                lVar2 = lVar;
                if (o0VarE.r(lVar2)) {
                    i28 = 131072;
                } else {
                    i28 = 65536;
                }
                i16 |= i28;
            }
            if ((74899 & i16) != 74898) {
                if (i29 != 0) {
                    z16 = true;
                }
                if (i17 != 0) {
                    f16 = 0.0f;
                }
                if (i19 == 0) {
                }
                if (i25 != 0) {
                    f17 = 0.0f;
                }
                if (i27 != 0) {
                    o0VarE.C(-1493261926);
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new f0(12);
                        o0VarE.K(objQ);
                    }
                    o0VarE.g0(false);
                    lVar3 = (e23.l) objQ;
                } else {
                    lVar3 = lVar2;
                }
                x1 x1Var1111110 = p3.n.f135158a;
                int i31111111111111 = i16 & 14;
                int i31111111111112 = i16 << 3;
                float f21111111111111 = f16;
                boolean z21111113 = z19;
                float f21111111111112 = f17;
                TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f21111111111111, z21111113, f21111111111112, lVar3, o0VarE, i31111111111111 | (i31111111111112 & 896) | (i31111111111112 & 7168) | (57344 & i31111111111112) | (458752 & i31111111111112) | (i31111111111112 & 3670016), 0);
                f18 = f21111111111111;
                z18 = z21111113;
                f19 = f21111111111112;
                lVar4 = lVar3;
            } else {
                if (i29 != 0) {
                    z16 = true;
                }
                if (i17 != 0) {
                    f16 = 0.0f;
                }
                if (i19 == 0) {
                }
                if (i25 != 0) {
                    f17 = 0.0f;
                }
                if (i27 != 0) {
                    o0VarE.C(-1493261926);
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new f0(12);
                        o0VarE.K(objQ);
                    }
                    o0VarE.g0(false);
                    lVar3 = (e23.l) objQ;
                } else {
                    lVar3 = lVar2;
                }
                x1 x1Var1111111 = p3.n.f135158a;
                int i31111111111113 = i16 & 14;
                int i31111111111114 = i16 << 3;
                float f21111111111113 = f16;
                boolean z21111114 = z19;
                float f21111111111114 = f17;
                TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f21111111111113, z21111114, f21111111111114, lVar3, o0VarE, i31111111111113 | (i31111111111114 & 896) | (i31111111111114 & 7168) | (57344 & i31111111111114) | (458752 & i31111111111114) | (i31111111111114 & 3670016), 0);
                f18 = f21111111111113;
                z18 = z21111114;
                f19 = f21111111111114;
                lVar4 = lVar3;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.o0
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TileOverlayKt.TileOverlay$lambda$2(tileProvider, z16, f18, z18, f19, lVar4, i14, i15, (p3.m) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 196608;
        lVar2 = lVar;
        if ((74899 & i16) != 74898) {
            if (i29 != 0) {
                z16 = true;
            }
            if (i17 != 0) {
                f16 = 0.0f;
            }
            if (i19 == 0) {
            }
            if (i25 != 0) {
                f17 = 0.0f;
            }
            if (i27 != 0) {
                o0VarE.C(-1493261926);
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new f0(12);
                    o0VarE.K(objQ);
                }
                o0VarE.g0(false);
                lVar3 = (e23.l) objQ;
            } else {
                lVar3 = lVar2;
            }
            x1 x1Var1111112 = p3.n.f135158a;
            int i31111111111115 = i16 & 14;
            int i31111111111116 = i16 << 3;
            float f21111111111115 = f16;
            boolean z21111115 = z19;
            float f21111111111116 = f17;
            TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f21111111111115, z21111115, f21111111111116, lVar3, o0VarE, i31111111111115 | (i31111111111116 & 896) | (i31111111111116 & 7168) | (57344 & i31111111111116) | (458752 & i31111111111116) | (i31111111111116 & 3670016), 0);
            f18 = f21111111111115;
            z18 = z21111115;
            f19 = f21111111111116;
            lVar4 = lVar3;
        } else {
            if (i29 != 0) {
                z16 = true;
            }
            if (i17 != 0) {
                f16 = 0.0f;
            }
            if (i19 == 0) {
            }
            if (i25 != 0) {
                f17 = 0.0f;
            }
            if (i27 != 0) {
                o0VarE.C(-1493261926);
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new f0(12);
                    o0VarE.K(objQ);
                }
                o0VarE.g0(false);
                lVar3 = (e23.l) objQ;
            } else {
                lVar3 = lVar2;
            }
            x1 x1Var1111113 = p3.n.f135158a;
            int i31111111111117 = i16 & 14;
            int i31111111111118 = i16 << 3;
            float f21111111111117 = f16;
            boolean z21111116 = z19;
            float f21111111111118 = f17;
            TileOverlay(tileProvider2, rememberTileOverlayState(o0VarE, 0), z16, f21111111111117, z21111116, f21111111111118, lVar3, o0VarE, i31111111111117 | (i31111111111118 & 896) | (i31111111111118 & 7168) | (57344 & i31111111111118) | (458752 & i31111111111118) | (i31111111111118 & 3670016), 0);
            f18 = f21111111111117;
            z18 = z21111116;
            f19 = f21111111111118;
            lVar4 = lVar3;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.o0
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TileOverlayKt.TileOverlay$lambda$2(tileProvider, z16, f18, z18, f19, lVar4, i14, i15, (p3.m) obj, iIntValue);
                }
            };
        }
    }
}
