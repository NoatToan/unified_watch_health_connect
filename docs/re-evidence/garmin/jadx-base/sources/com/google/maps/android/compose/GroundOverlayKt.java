package com.google.maps.android.compose;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import com.nimbusds.jose.HeaderParameterNames;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a}\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001b\u0010\u0001\u001a\u00020\u0011*\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0016\u001a\u001b\u0010\u0001\u001a\u00020\u0017*\u00020\u00172\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/google/maps/android/compose/GroundOverlayPosition;", ModelSourceWrapper.POSITION, "Lcom/google/android/gms/maps/model/BitmapDescriptor;", "image", "Ln4/c;", "anchor", "", "bearing", "", "clickable", "", HeaderParameterNames.AUTHENTICATION_TAG, "transparency", "visible", "zIndex", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/GroundOverlay;", "", "onClick", "GroundOverlay-bPm4XcI", "(Lcom/google/maps/android/compose/GroundOverlayPosition;Lcom/google/android/gms/maps/model/BitmapDescriptor;JFZLjava/lang/Object;FZFLe23/l;Lp3/m;II)V", "GroundOverlay", "(Lcom/google/android/gms/maps/model/GroundOverlay;Lcom/google/maps/android/compose/GroundOverlayPosition;)V", "Lcom/google/android/gms/maps/model/GroundOverlayOptions;", "(Lcom/google/android/gms/maps/model/GroundOverlayOptions;Lcom/google/maps/android/compose/GroundOverlayPosition;)Lcom/google/android/gms/maps/model/GroundOverlayOptions;", "maps-compose_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class GroundOverlayKt {
    /* JADX WARN: Code duplicated, block: B:101:0x0129  */
    /* JADX WARN: Code duplicated, block: B:103:0x012f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0132  */
    /* JADX WARN: Code duplicated, block: B:108:0x0143  */
    /* JADX WARN: Code duplicated, block: B:113:0x015a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x015c  */
    /* JADX WARN: Code duplicated, block: B:115:0x0163  */
    /* JADX WARN: Code duplicated, block: B:118:0x0167  */
    /* JADX WARN: Code duplicated, block: B:120:0x016a  */
    /* JADX WARN: Code duplicated, block: B:123:0x016f  */
    /* JADX WARN: Code duplicated, block: B:125:0x0173  */
    /* JADX WARN: Code duplicated, block: B:126:0x0175  */
    /* JADX WARN: Code duplicated, block: B:128:0x0178  */
    /* JADX WARN: Code duplicated, block: B:129:0x017a  */
    /* JADX WARN: Code duplicated, block: B:132:0x017f  */
    /* JADX WARN: Code duplicated, block: B:135:0x0185  */
    /* JADX WARN: Code duplicated, block: B:137:0x0196  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:142:0x01af  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:147:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:148:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:151:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:152:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:155:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:156:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:159:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:160:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:163:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:164:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:167:0x0201  */
    /* JADX WARN: Code duplicated, block: B:168:0x0203  */
    /* JADX WARN: Code duplicated, block: B:171:0x020c  */
    /* JADX WARN: Code duplicated, block: B:172:0x020e  */
    /* JADX WARN: Code duplicated, block: B:175:0x0217  */
    /* JADX WARN: Code duplicated, block: B:176:0x0219  */
    /* JADX WARN: Code duplicated, block: B:179:0x0227  */
    /* JADX WARN: Code duplicated, block: B:180:0x0229  */
    /* JADX WARN: Code duplicated, block: B:183:0x0231  */
    /* JADX WARN: Code duplicated, block: B:186:0x0239  */
    /* JADX WARN: Code duplicated, block: B:187:0x0246  */
    /* JADX WARN: Code duplicated, block: B:190:0x0267  */
    /* JADX WARN: Code duplicated, block: B:192:0x026e  */
    /* JADX WARN: Code duplicated, block: B:193:0x0272  */
    /* JADX WARN: Code duplicated, block: B:197:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:199:0x0304  */
    /* JADX WARN: Code duplicated, block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00be  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00de  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:88:0x0103  */
    /* JADX WARN: Code duplicated, block: B:90:0x0109  */
    /* JADX WARN: Code duplicated, block: B:92:0x010f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0112  */
    /* JADX WARN: Code duplicated, block: B:97:0x011e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0123  */
    @GoogleMapComposable
    /* JADX INFO: renamed from: GroundOverlay-bPm4XcI, reason: not valid java name */
    public static final void m111GroundOverlaybPm4XcI(final GroundOverlayPosition groundOverlayPosition, final BitmapDescriptor bitmapDescriptor, long j8, float f14, boolean z14, Object obj, float f15, boolean z15, float f16, e23.l<? super GroundOverlay, Unit> lVar, p3.m mVar, final int i14, final int i15) {
        int i16;
        long j14;
        final float f17;
        int i17;
        final boolean z16;
        int i18;
        int i19;
        Object obj2;
        int i24;
        int i25;
        float f18;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i34;
        int i35;
        int i36;
        int i37;
        long jF;
        final float f19;
        final boolean z17;
        float f22;
        p3.m.a aVar;
        e23.l<? super GroundOverlay, Unit> lVar2;
        MapApplier mapApplier;
        long j15;
        boolean z18;
        boolean z19;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        boolean z29;
        boolean z34;
        boolean z35;
        Object objQ;
        Object obj3;
        final e23.l<? super GroundOverlay, Unit> lVar3;
        boolean z36;
        final boolean z37;
        final float f24;
        final long j16;
        float f25;
        final BitmapDescriptor bitmapDescriptor2;
        e23.a aVar2;
        final float f26;
        final boolean z38;
        final float f27;
        final e23.l<? super GroundOverlay, Unit> lVar4;
        final long j17;
        Object objQ2;
        final Object obj4;
        p2 p2VarI0;
        groundOverlayPosition.getClass();
        bitmapDescriptor.getClass();
        p3.o0 o0VarE = mVar.E(199851106);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i15 & 1) != 0) {
            i16 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(groundOverlayPosition) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i15 & 2) != 0) {
            i16 |= 48;
        } else if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(bitmapDescriptor) ? 32 : 16;
        }
        int i38 = i15 & 4;
        if (i38 != 0) {
            i16 |= 384;
            j14 = j8;
        } else {
            j14 = j8;
            if ((i14 & 384) == 0) {
                i16 |= o0VarE.l(j14) ? 256 : 128;
            }
        }
        int i39 = i15 & 8;
        if (i39 == 0) {
            if ((i14 & 3072) == 0) {
                f17 = f14;
                i16 |= o0VarE.i(f17) ? 2048 : 1024;
            }
            i17 = i15 & 16;
            if (i17 != 0) {
                if ((i14 & 24576) == 0) {
                    z16 = z14;
                    if (o0VarE.h(z16)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i16 |= i18;
                }
                i19 = i15 & 32;
                if (i19 != 0) {
                    i16 |= 196608;
                    obj2 = obj;
                } else {
                    obj2 = obj;
                    if ((i14 & 196608) == 0) {
                        if (o0VarE.r(obj2)) {
                            i24 = 131072;
                        } else {
                            i24 = 65536;
                        }
                        i16 |= i24;
                    }
                }
                i25 = i15 & 64;
                if (i25 != 0) {
                    i16 |= 1572864;
                    f18 = f15;
                } else {
                    f18 = f15;
                    if ((i14 & 1572864) == 0) {
                        if (o0VarE.i(f18)) {
                            i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i26 = 524288;
                        }
                        i16 |= i26;
                    }
                }
                i27 = i15 & 128;
                i28 = i16;
                if (i27 != 0) {
                    i28 |= 12582912;
                } else if ((i14 & 12582912) == 0) {
                    if (o0VarE.h(z15)) {
                        i29 = 8388608;
                    } else {
                        i29 = 4194304;
                    }
                    i28 |= i29;
                }
                i30 = i15 & 256;
                if (i30 != 0) {
                    i28 |= 100663296;
                } else if ((i14 & 100663296) == 0) {
                    if (o0VarE.i(f16)) {
                        i34 = 67108864;
                    } else {
                        i34 = 33554432;
                    }
                    i28 |= i34;
                }
                i35 = i15 & 512;
                if (i35 != 0) {
                    i28 |= C.ENCODING_PCM_32BIT;
                } else if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.r(lVar)) {
                        i36 = 536870912;
                    } else {
                        i36 = 268435456;
                    }
                    i28 |= i36;
                }
                i37 = i28;
                if ((i37 & 306783379) == 306783378 || !o0VarE.b()) {
                    if (i38 != 0) {
                        jF = gl1.y.f(0.5f, 0.5f);
                    } else {
                        jF = j14;
                    }
                    if (i39 != 0) {
                        f17 = 0.0f;
                    }
                    if (i17 != 0) {
                        z16 = false;
                    }
                    if (i19 != 0) {
                        obj2 = null;
                    }
                    if (i25 != 0) {
                        f19 = 0.0f;
                    } else {
                        f19 = f18;
                    }
                    if (i27 != 0) {
                        z17 = true;
                    } else {
                        z17 = z15;
                    }
                    f22 = i30 == 0 ? f16 : 0.0f;
                    aVar = p3.m.f135153a;
                    if (i35 != 0) {
                        o0VarE.C(-331704127);
                        objQ2 = o0VarE.q();
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new a(4);
                            o0VarE.K(objQ2);
                        }
                        lVar2 = (e23.l) objQ2;
                        o0VarE.g0(false);
                    } else {
                        lVar2 = lVar;
                    }
                    x1 x1Var = p3.n.f135158a;
                    if (cVar instanceof MapApplier) {
                        mapApplier = (MapApplier) cVar;
                    } else {
                        mapApplier = null;
                    }
                    o0VarE.C(-331699334);
                    boolean zR = o0VarE.r(mapApplier);
                    j15 = jF;
                    if ((i37 & 896) == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    boolean z39 = zR | z18;
                    if ((i37 & 7168) == 2048) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean z44 = z39 | z19;
                    if ((57344 & i37) == 16384) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    boolean z45 = z44 | z24;
                    if ((i37 & 112) == 32) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z46 = z45 | z25;
                    if ((i37 & 14) == 4) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    boolean z47 = z46 | z26;
                    if ((3670016 & i37) == 1048576) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    boolean z48 = z47 | z27;
                    if ((29360128 & i37) == 8388608) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    boolean z49 = z48 | z28;
                    if ((234881024 & i37) == 67108864) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    boolean zR2 = z49 | z29 | o0VarE.r(obj2);
                    if ((i37 & 1879048192) == 536870912) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    z35 = zR2 | z34;
                    objQ = o0VarE.q();
                    if (z35) {
                        lVar3 = lVar2;
                        final MapApplier mapApplier2 = mapApplier;
                        final Object obj5 = obj2;
                        z36 = false;
                        final float f28 = f22;
                        z37 = z16;
                        f24 = f17;
                        j16 = j15;
                        obj3 = new e23.a() { // from class: com.google.maps.android.compose.g
                            @Override // e23.a
                            public final Object invoke() {
                                return GroundOverlayKt.GroundOverlay_bPm4XcI$lambda$4$lambda$3(mapApplier2, obj5, lVar3, j16, f24, z37, bitmapDescriptor, groundOverlayPosition, f19, z17, f28);
                            }
                        };
                        f25 = f28;
                        obj2 = obj5;
                        bitmapDescriptor2 = bitmapDescriptor;
                        o0VarE.K(obj3);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            lVar3 = lVar2;
                            final MapApplier mapApplier3 = mapApplier;
                            final Object obj6 = obj2;
                            z36 = false;
                            final float f29 = f22;
                            z37 = z16;
                            f24 = f17;
                            j16 = j15;
                            obj3 = new e23.a() { // from class: com.google.maps.android.compose.g
                                @Override // e23.a
                                public final Object invoke() {
                                    return GroundOverlayKt.GroundOverlay_bPm4XcI$lambda$4$lambda$3(mapApplier3, obj6, lVar3, j16, f24, z37, bitmapDescriptor, groundOverlayPosition, f19, z17, f29);
                                }
                            };
                            f25 = f29;
                            obj2 = obj6;
                            bitmapDescriptor2 = bitmapDescriptor;
                            o0VarE.K(obj3);
                        } else {
                            bitmapDescriptor2 = bitmapDescriptor;
                            obj3 = objQ;
                            f25 = f22;
                            lVar3 = lVar2;
                            z36 = false;
                            z37 = z16;
                            f24 = f17;
                            j16 = j15;
                        }
                    }
                    aVar2 = (e23.a) obj3;
                    o0VarE.g0(z36);
                    if (!(cVar instanceof MapApplier)) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.H();
                    if (o0VarE.T) {
                        o0VarE.M(aVar2);
                    } else {
                        o0VarE.c();
                    }
                    b4.d(new q0(18), lVar3, o0VarE);
                    b4.d(new q0(19), Float.valueOf(f24), o0VarE);
                    b4.d(new q0(20), Boolean.valueOf(z37), o0VarE);
                    b4.d(new q0(21), bitmapDescriptor2, o0VarE);
                    b4.d(new q0(22), groundOverlayPosition, o0VarE);
                    b4.d(new q0(23), obj2, o0VarE);
                    b4.d(new q0(15), Float.valueOf(f19), o0VarE);
                    b4.d(new q0(16), Boolean.valueOf(z17), o0VarE);
                    b4.d(new q0(17), Float.valueOf(f25), o0VarE);
                    o0VarE.g0(true);
                    f26 = f19;
                    z38 = z17;
                    f27 = f25;
                    lVar4 = lVar3;
                    j17 = j16;
                    f17 = f24;
                    z16 = z37;
                } else {
                    o0VarE.e();
                    bitmapDescriptor2 = bitmapDescriptor;
                    z38 = z15;
                    f26 = f18;
                    j17 = j14;
                    f27 = f16;
                    lVar4 = lVar;
                }
                obj4 = obj2;
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.f
                        @Override // e23.p
                        public final Object invoke(Object obj7, Object obj8) {
                            int iIntValue = ((Integer) obj8).intValue();
                            return GroundOverlayKt.GroundOverlay_bPm4XcI$lambda$15(groundOverlayPosition, bitmapDescriptor2, j17, f17, z16, obj4, f26, z38, f27, lVar4, i14, i15, (p3.m) obj7, iIntValue);
                        }
                    };
                }
            }
            i16 |= 24576;
            z16 = z14;
            i19 = i15 & 32;
            if (i19 != 0) {
                i16 |= 196608;
                obj2 = obj;
            } else {
                obj2 = obj;
                if ((i14 & 196608) == 0) {
                    if (o0VarE.r(obj2)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i16 |= i24;
                }
            }
            i25 = i15 & 64;
            if (i25 != 0) {
                i16 |= 1572864;
                f18 = f15;
            } else {
                f18 = f15;
                if ((i14 & 1572864) == 0) {
                    if (o0VarE.i(f18)) {
                        i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i26 = 524288;
                    }
                    i16 |= i26;
                }
            }
            i27 = i15 & 128;
            i28 = i16;
            if (i27 != 0) {
                i28 |= 12582912;
            } else if ((i14 & 12582912) == 0) {
                if (o0VarE.h(z15)) {
                    i29 = 8388608;
                } else {
                    i29 = 4194304;
                }
                i28 |= i29;
            }
            i30 = i15 & 256;
            if (i30 != 0) {
                i28 |= 100663296;
            } else if ((i14 & 100663296) == 0) {
                if (o0VarE.i(f16)) {
                    i34 = 67108864;
                } else {
                    i34 = 33554432;
                }
                i28 |= i34;
            }
            i35 = i15 & 512;
            if (i35 != 0) {
                i28 |= C.ENCODING_PCM_32BIT;
            } else if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarE.r(lVar)) {
                    i36 = 536870912;
                } else {
                    i36 = 268435456;
                }
                i28 |= i36;
            }
            i37 = i28;
            if ((i37 & 306783379) == 306783378) {
                if (i38 != 0) {
                    jF = gl1.y.f(0.5f, 0.5f);
                } else {
                    jF = j14;
                }
                if (i39 != 0) {
                    f17 = 0.0f;
                }
                if (i17 != 0) {
                    z16 = false;
                }
                if (i19 != 0) {
                    obj2 = null;
                }
                if (i25 != 0) {
                    f19 = 0.0f;
                } else {
                    f19 = f18;
                }
                if (i27 != 0) {
                    z17 = true;
                } else {
                    z17 = z15;
                }
                if (i30 == 0) {
                }
                aVar = p3.m.f135153a;
                if (i35 != 0) {
                    o0VarE.C(-331704127);
                    objQ2 = o0VarE.q();
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new a(4);
                        o0VarE.K(objQ2);
                    }
                    lVar2 = (e23.l) objQ2;
                    o0VarE.g0(false);
                } else {
                    lVar2 = lVar;
                }
                x1 x1Var2 = p3.n.f135158a;
                if (cVar instanceof MapApplier) {
                    mapApplier = (MapApplier) cVar;
                } else {
                    mapApplier = null;
                }
                o0VarE.C(-331699334);
                boolean zR3 = o0VarE.r(mapApplier);
                j15 = jF;
                if ((i37 & 896) == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean z310 = zR3 | z18;
                if ((i37 & 7168) == 2048) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean z410 = z310 | z19;
                if ((57344 & i37) == 16384) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                boolean z411 = z410 | z24;
                if ((i37 & 112) == 32) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z412 = z411 | z25;
                if ((i37 & 14) == 4) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                boolean z413 = z412 | z26;
                if ((3670016 & i37) == 1048576) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                boolean z414 = z413 | z27;
                if ((29360128 & i37) == 8388608) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                boolean z415 = z414 | z28;
                if ((234881024 & i37) == 67108864) {
                    z29 = true;
                } else {
                    z29 = false;
                }
                boolean zR4 = z415 | z29 | o0VarE.r(obj2);
                if ((i37 & 1879048192) == 536870912) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                z35 = zR4 | z34;
                objQ = o0VarE.q();
                if (z35) {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        lVar3 = lVar2;
                        final MapApplier mapApplier4 = mapApplier;
                        final Object obj7 = obj2;
                        z36 = false;
                        final float f210 = f22;
                        z37 = z16;
                        f24 = f17;
                        j16 = j15;
                        obj3 = new e23.a() { // from class: com.google.maps.android.compose.g
                            @Override // e23.a
                            public final Object invoke() {
                                return GroundOverlayKt.GroundOverlay_bPm4XcI$lambda$4$lambda$3(mapApplier4, obj7, lVar3, j16, f24, z37, bitmapDescriptor, groundOverlayPosition, f19, z17, f210);
                            }
                        };
                        f25 = f210;
                        obj2 = obj7;
                        bitmapDescriptor2 = bitmapDescriptor;
                        o0VarE.K(obj3);
                    } else {
                        bitmapDescriptor2 = bitmapDescriptor;
                        obj3 = objQ;
                        f25 = f22;
                        lVar3 = lVar2;
                        z36 = false;
                        z37 = z16;
                        f24 = f17;
                        j16 = j15;
                    }
                } else {
                    lVar3 = lVar2;
                    final MapApplier mapApplier5 = mapApplier;
                    final Object obj8 = obj2;
                    z36 = false;
                    final float f211 = f22;
                    z37 = z16;
                    f24 = f17;
                    j16 = j15;
                    obj3 = new e23.a() { // from class: com.google.maps.android.compose.g
                        @Override // e23.a
                        public final Object invoke() {
                            return GroundOverlayKt.GroundOverlay_bPm4XcI$lambda$4$lambda$3(mapApplier5, obj8, lVar3, j16, f24, z37, bitmapDescriptor, groundOverlayPosition, f19, z17, f211);
                        }
                    };
                    f25 = f211;
                    obj2 = obj8;
                    bitmapDescriptor2 = bitmapDescriptor;
                    o0VarE.K(obj3);
                }
                aVar2 = (e23.a) obj3;
                o0VarE.g0(z36);
                if (!(cVar instanceof MapApplier)) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.H();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.d(new q0(18), lVar3, o0VarE);
                b4.d(new q0(19), Float.valueOf(f24), o0VarE);
                b4.d(new q0(20), Boolean.valueOf(z37), o0VarE);
                b4.d(new q0(21), bitmapDescriptor2, o0VarE);
                b4.d(new q0(22), groundOverlayPosition, o0VarE);
                b4.d(new q0(23), obj2, o0VarE);
                b4.d(new q0(15), Float.valueOf(f19), o0VarE);
                b4.d(new q0(16), Boolean.valueOf(z17), o0VarE);
                b4.d(new q0(17), Float.valueOf(f25), o0VarE);
                o0VarE.g0(true);
                f26 = f19;
                z38 = z17;
                f27 = f25;
                lVar4 = lVar3;
                j17 = j16;
                f17 = f24;
                z16 = z37;
            } else {
                if (i38 != 0) {
                    jF = gl1.y.f(0.5f, 0.5f);
                } else {
                    jF = j14;
                }
                if (i39 != 0) {
                    f17 = 0.0f;
                }
                if (i17 != 0) {
                    z16 = false;
                }
                if (i19 != 0) {
                    obj2 = null;
                }
                if (i25 != 0) {
                    f19 = 0.0f;
                } else {
                    f19 = f18;
                }
                if (i27 != 0) {
                    z17 = true;
                } else {
                    z17 = z15;
                }
                if (i30 == 0) {
                }
                aVar = p3.m.f135153a;
                if (i35 != 0) {
                    o0VarE.C(-331704127);
                    objQ2 = o0VarE.q();
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new a(4);
                        o0VarE.K(objQ2);
                    }
                    lVar2 = (e23.l) objQ2;
                    o0VarE.g0(false);
                } else {
                    lVar2 = lVar;
                }
                x1 x1Var3 = p3.n.f135158a;
                if (cVar instanceof MapApplier) {
                    mapApplier = (MapApplier) cVar;
                } else {
                    mapApplier = null;
                }
                o0VarE.C(-331699334);
                boolean zR5 = o0VarE.r(mapApplier);
                j15 = jF;
                if ((i37 & 896) == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean z311 = zR5 | z18;
                if ((i37 & 7168) == 2048) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean z416 = z311 | z19;
                if ((57344 & i37) == 16384) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                boolean z417 = z416 | z24;
                if ((i37 & 112) == 32) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z418 = z417 | z25;
                if ((i37 & 14) == 4) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                boolean z419 = z418 | z26;
                if ((3670016 & i37) == 1048576) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                boolean z4110 = z419 | z27;
                if ((29360128 & i37) == 8388608) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                boolean z4111 = z4110 | z28;
                if ((234881024 & i37) == 67108864) {
                    z29 = true;
                } else {
                    z29 = false;
                }
                boolean zR6 = z4111 | z29 | o0VarE.r(obj2);
                if ((i37 & 1879048192) == 536870912) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                z35 = zR6 | z34;
                objQ = o0VarE.q();
                if (z35) {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        lVar3 = lVar2;
                        final MapApplier mapApplier6 = mapApplier;
                        final Object obj9 = obj2;
                        z36 = false;
                        final float f212 = f22;
                        z37 = z16;
                        f24 = f17;
                        j16 = j15;
                        obj3 = new e23.a() { // from class: com.google.maps.android.compose.g
                            @Override // e23.a
                            public final Object invoke() {
                                return GroundOverlayKt.GroundOverlay_bPm4XcI$lambda$4$lambda$3(mapApplier6, obj9, lVar3, j16, f24, z37, bitmapDescriptor, groundOverlayPosition, f19, z17, f212);
                            }
                        };
                        f25 = f212;
                        obj2 = obj9;
                        bitmapDescriptor2 = bitmapDescriptor;
                        o0VarE.K(obj3);
                    } else {
                        bitmapDescriptor2 = bitmapDescriptor;
                        obj3 = objQ;
                        f25 = f22;
                        lVar3 = lVar2;
                        z36 = false;
                        z37 = z16;
                        f24 = f17;
                        j16 = j15;
                    }
                } else {
                    lVar3 = lVar2;
                    final MapApplier mapApplier7 = mapApplier;
                    final Object obj10 = obj2;
                    z36 = false;
                    final float f213 = f22;
                    z37 = z16;
                    f24 = f17;
                    j16 = j15;
                    obj3 = new e23.a() { // from class: com.google.maps.android.compose.g
                        @Override // e23.a
                        public final Object invoke() {
                            return GroundOverlayKt.GroundOverlay_bPm4XcI$lambda$4$lambda$3(mapApplier7, obj10, lVar3, j16, f24, z37, bitmapDescriptor, groundOverlayPosition, f19, z17, f213);
                        }
                    };
                    f25 = f213;
                    obj2 = obj10;
                    bitmapDescriptor2 = bitmapDescriptor;
                    o0VarE.K(obj3);
                }
                aVar2 = (e23.a) obj3;
                o0VarE.g0(z36);
                if (!(cVar instanceof MapApplier)) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.H();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.d(new q0(18), lVar3, o0VarE);
                b4.d(new q0(19), Float.valueOf(f24), o0VarE);
                b4.d(new q0(20), Boolean.valueOf(z37), o0VarE);
                b4.d(new q0(21), bitmapDescriptor2, o0VarE);
                b4.d(new q0(22), groundOverlayPosition, o0VarE);
                b4.d(new q0(23), obj2, o0VarE);
                b4.d(new q0(15), Float.valueOf(f19), o0VarE);
                b4.d(new q0(16), Boolean.valueOf(z17), o0VarE);
                b4.d(new q0(17), Float.valueOf(f25), o0VarE);
                o0VarE.g0(true);
                f26 = f19;
                z38 = z17;
                f27 = f25;
                lVar4 = lVar3;
                j17 = j16;
                f17 = f24;
                z16 = z37;
            }
            obj4 = obj2;
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.f
                    @Override // e23.p
                    public final Object invoke(Object obj11, Object obj12) {
                        int iIntValue = ((Integer) obj12).intValue();
                        return GroundOverlayKt.GroundOverlay_bPm4XcI$lambda$15(groundOverlayPosition, bitmapDescriptor2, j17, f17, z16, obj4, f26, z38, f27, lVar4, i14, i15, (p3.m) obj11, iIntValue);
                    }
                };
            }
        }
        i16 |= 3072;
        f17 = f14;
        i17 = i15 & 16;
        if (i17 != 0) {
            if ((i14 & 24576) == 0) {
                z16 = z14;
                if (o0VarE.h(z16)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i16 |= i18;
            }
            i19 = i15 & 32;
            if (i19 != 0) {
                i16 |= 196608;
                obj2 = obj;
            } else {
                obj2 = obj;
                if ((i14 & 196608) == 0) {
                    if (o0VarE.r(obj2)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i16 |= i24;
                }
            }
            i25 = i15 & 64;
            if (i25 != 0) {
                i16 |= 1572864;
                f18 = f15;
            } else {
                f18 = f15;
                if ((i14 & 1572864) == 0) {
                    if (o0VarE.i(f18)) {
                        i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i26 = 524288;
                    }
                    i16 |= i26;
                }
            }
            i27 = i15 & 128;
            i28 = i16;
            if (i27 != 0) {
                i28 |= 12582912;
            } else if ((i14 & 12582912) == 0) {
                if (o0VarE.h(z15)) {
                    i29 = 8388608;
                } else {
                    i29 = 4194304;
                }
                i28 |= i29;
            }
            i30 = i15 & 256;
            if (i30 != 0) {
                i28 |= 100663296;
            } else if ((i14 & 100663296) == 0) {
                if (o0VarE.i(f16)) {
                    i34 = 67108864;
                } else {
                    i34 = 33554432;
                }
                i28 |= i34;
            }
            i35 = i15 & 512;
            if (i35 != 0) {
                i28 |= C.ENCODING_PCM_32BIT;
            } else if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarE.r(lVar)) {
                    i36 = 536870912;
                } else {
                    i36 = 268435456;
                }
                i28 |= i36;
            }
            i37 = i28;
            if ((i37 & 306783379) == 306783378) {
                if (i38 != 0) {
                    jF = gl1.y.f(0.5f, 0.5f);
                } else {
                    jF = j14;
                }
                if (i39 != 0) {
                    f17 = 0.0f;
                }
                if (i17 != 0) {
                    z16 = false;
                }
                if (i19 != 0) {
                    obj2 = null;
                }
                if (i25 != 0) {
                    f19 = 0.0f;
                } else {
                    f19 = f18;
                }
                if (i27 != 0) {
                    z17 = true;
                } else {
                    z17 = z15;
                }
                if (i30 == 0) {
                }
                aVar = p3.m.f135153a;
                if (i35 != 0) {
                    o0VarE.C(-331704127);
                    objQ2 = o0VarE.q();
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new a(4);
                        o0VarE.K(objQ2);
                    }
                    lVar2 = (e23.l) objQ2;
                    o0VarE.g0(false);
                } else {
                    lVar2 = lVar;
                }
                x1 x1Var4 = p3.n.f135158a;
                if (cVar instanceof MapApplier) {
                    mapApplier = (MapApplier) cVar;
                } else {
                    mapApplier = null;
                }
                o0VarE.C(-331699334);
                boolean zR7 = o0VarE.r(mapApplier);
                j15 = jF;
                if ((i37 & 896) == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean z312 = zR7 | z18;
                if ((i37 & 7168) == 2048) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean z4112 = z312 | z19;
                if ((57344 & i37) == 16384) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                boolean z4113 = z4112 | z24;
                if ((i37 & 112) == 32) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z4114 = z4113 | z25;
                if ((i37 & 14) == 4) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                boolean z4115 = z4114 | z26;
                if ((3670016 & i37) == 1048576) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                boolean z4116 = z4115 | z27;
                if ((29360128 & i37) == 8388608) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                boolean z4117 = z4116 | z28;
                if ((234881024 & i37) == 67108864) {
                    z29 = true;
                } else {
                    z29 = false;
                }
                boolean zR8 = z4117 | z29 | o0VarE.r(obj2);
                if ((i37 & 1879048192) == 536870912) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                z35 = zR8 | z34;
                objQ = o0VarE.q();
                if (z35) {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        lVar3 = lVar2;
                        final MapApplier mapApplier8 = mapApplier;
                        final Object obj11 = obj2;
                        z36 = false;
                        final float f214 = f22;
                        z37 = z16;
                        f24 = f17;
                        j16 = j15;
                        obj3 = new e23.a() { // from class: com.google.maps.android.compose.g
                            @Override // e23.a
                            public final Object invoke() {
                                return GroundOverlayKt.GroundOverlay_bPm4XcI$lambda$4$lambda$3(mapApplier8, obj11, lVar3, j16, f24, z37, bitmapDescriptor, groundOverlayPosition, f19, z17, f214);
                            }
                        };
                        f25 = f214;
                        obj2 = obj11;
                        bitmapDescriptor2 = bitmapDescriptor;
                        o0VarE.K(obj3);
                    } else {
                        bitmapDescriptor2 = bitmapDescriptor;
                        obj3 = objQ;
                        f25 = f22;
                        lVar3 = lVar2;
                        z36 = false;
                        z37 = z16;
                        f24 = f17;
                        j16 = j15;
                    }
                } else {
                    lVar3 = lVar2;
                    final MapApplier mapApplier9 = mapApplier;
                    final Object obj12 = obj2;
                    z36 = false;
                    final float f215 = f22;
                    z37 = z16;
                    f24 = f17;
                    j16 = j15;
                    obj3 = new e23.a() { // from class: com.google.maps.android.compose.g
                        @Override // e23.a
                        public final Object invoke() {
                            return GroundOverlayKt.GroundOverlay_bPm4XcI$lambda$4$lambda$3(mapApplier9, obj12, lVar3, j16, f24, z37, bitmapDescriptor, groundOverlayPosition, f19, z17, f215);
                        }
                    };
                    f25 = f215;
                    obj2 = obj12;
                    bitmapDescriptor2 = bitmapDescriptor;
                    o0VarE.K(obj3);
                }
                aVar2 = (e23.a) obj3;
                o0VarE.g0(z36);
                if (!(cVar instanceof MapApplier)) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.H();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.d(new q0(18), lVar3, o0VarE);
                b4.d(new q0(19), Float.valueOf(f24), o0VarE);
                b4.d(new q0(20), Boolean.valueOf(z37), o0VarE);
                b4.d(new q0(21), bitmapDescriptor2, o0VarE);
                b4.d(new q0(22), groundOverlayPosition, o0VarE);
                b4.d(new q0(23), obj2, o0VarE);
                b4.d(new q0(15), Float.valueOf(f19), o0VarE);
                b4.d(new q0(16), Boolean.valueOf(z17), o0VarE);
                b4.d(new q0(17), Float.valueOf(f25), o0VarE);
                o0VarE.g0(true);
                f26 = f19;
                z38 = z17;
                f27 = f25;
                lVar4 = lVar3;
                j17 = j16;
                f17 = f24;
                z16 = z37;
            } else {
                if (i38 != 0) {
                    jF = gl1.y.f(0.5f, 0.5f);
                } else {
                    jF = j14;
                }
                if (i39 != 0) {
                    f17 = 0.0f;
                }
                if (i17 != 0) {
                    z16 = false;
                }
                if (i19 != 0) {
                    obj2 = null;
                }
                if (i25 != 0) {
                    f19 = 0.0f;
                } else {
                    f19 = f18;
                }
                if (i27 != 0) {
                    z17 = true;
                } else {
                    z17 = z15;
                }
                if (i30 == 0) {
                }
                aVar = p3.m.f135153a;
                if (i35 != 0) {
                    o0VarE.C(-331704127);
                    objQ2 = o0VarE.q();
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new a(4);
                        o0VarE.K(objQ2);
                    }
                    lVar2 = (e23.l) objQ2;
                    o0VarE.g0(false);
                } else {
                    lVar2 = lVar;
                }
                x1 x1Var5 = p3.n.f135158a;
                if (cVar instanceof MapApplier) {
                    mapApplier = (MapApplier) cVar;
                } else {
                    mapApplier = null;
                }
                o0VarE.C(-331699334);
                boolean zR9 = o0VarE.r(mapApplier);
                j15 = jF;
                if ((i37 & 896) == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean z313 = zR9 | z18;
                if ((i37 & 7168) == 2048) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean z4118 = z313 | z19;
                if ((57344 & i37) == 16384) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                boolean z4119 = z4118 | z24;
                if ((i37 & 112) == 32) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z41110 = z4119 | z25;
                if ((i37 & 14) == 4) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                boolean z41111 = z41110 | z26;
                if ((3670016 & i37) == 1048576) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                boolean z41112 = z41111 | z27;
                if ((29360128 & i37) == 8388608) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                boolean z41113 = z41112 | z28;
                if ((234881024 & i37) == 67108864) {
                    z29 = true;
                } else {
                    z29 = false;
                }
                boolean zR10 = z41113 | z29 | o0VarE.r(obj2);
                if ((i37 & 1879048192) == 536870912) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                z35 = zR10 | z34;
                objQ = o0VarE.q();
                if (z35) {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        lVar3 = lVar2;
                        final MapApplier mapApplier10 = mapApplier;
                        final Object obj13 = obj2;
                        z36 = false;
                        final float f216 = f22;
                        z37 = z16;
                        f24 = f17;
                        j16 = j15;
                        obj3 = new e23.a() { // from class: com.google.maps.android.compose.g
                            @Override // e23.a
                            public final Object invoke() {
                                return GroundOverlayKt.GroundOverlay_bPm4XcI$lambda$4$lambda$3(mapApplier10, obj13, lVar3, j16, f24, z37, bitmapDescriptor, groundOverlayPosition, f19, z17, f216);
                            }
                        };
                        f25 = f216;
                        obj2 = obj13;
                        bitmapDescriptor2 = bitmapDescriptor;
                        o0VarE.K(obj3);
                    } else {
                        bitmapDescriptor2 = bitmapDescriptor;
                        obj3 = objQ;
                        f25 = f22;
                        lVar3 = lVar2;
                        z36 = false;
                        z37 = z16;
                        f24 = f17;
                        j16 = j15;
                    }
                } else {
                    lVar3 = lVar2;
                    final MapApplier mapApplier11 = mapApplier;
                    final Object obj14 = obj2;
                    z36 = false;
                    final float f217 = f22;
                    z37 = z16;
                    f24 = f17;
                    j16 = j15;
                    obj3 = new e23.a() { // from class: com.google.maps.android.compose.g
                        @Override // e23.a
                        public final Object invoke() {
                            return GroundOverlayKt.GroundOverlay_bPm4XcI$lambda$4$lambda$3(mapApplier11, obj14, lVar3, j16, f24, z37, bitmapDescriptor, groundOverlayPosition, f19, z17, f217);
                        }
                    };
                    f25 = f217;
                    obj2 = obj14;
                    bitmapDescriptor2 = bitmapDescriptor;
                    o0VarE.K(obj3);
                }
                aVar2 = (e23.a) obj3;
                o0VarE.g0(z36);
                if (!(cVar instanceof MapApplier)) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.H();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.d(new q0(18), lVar3, o0VarE);
                b4.d(new q0(19), Float.valueOf(f24), o0VarE);
                b4.d(new q0(20), Boolean.valueOf(z37), o0VarE);
                b4.d(new q0(21), bitmapDescriptor2, o0VarE);
                b4.d(new q0(22), groundOverlayPosition, o0VarE);
                b4.d(new q0(23), obj2, o0VarE);
                b4.d(new q0(15), Float.valueOf(f19), o0VarE);
                b4.d(new q0(16), Boolean.valueOf(z17), o0VarE);
                b4.d(new q0(17), Float.valueOf(f25), o0VarE);
                o0VarE.g0(true);
                f26 = f19;
                z38 = z17;
                f27 = f25;
                lVar4 = lVar3;
                j17 = j16;
                f17 = f24;
                z16 = z37;
            }
            obj4 = obj2;
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.f
                    @Override // e23.p
                    public final Object invoke(Object obj15, Object obj16) {
                        int iIntValue = ((Integer) obj16).intValue();
                        return GroundOverlayKt.GroundOverlay_bPm4XcI$lambda$15(groundOverlayPosition, bitmapDescriptor2, j17, f17, z16, obj4, f26, z38, f27, lVar4, i14, i15, (p3.m) obj15, iIntValue);
                    }
                };
            }
        }
        i16 |= 24576;
        z16 = z14;
        i19 = i15 & 32;
        if (i19 != 0) {
            i16 |= 196608;
            obj2 = obj;
        } else {
            obj2 = obj;
            if ((i14 & 196608) == 0) {
                if (o0VarE.r(obj2)) {
                    i24 = 131072;
                } else {
                    i24 = 65536;
                }
                i16 |= i24;
            }
        }
        i25 = i15 & 64;
        if (i25 != 0) {
            i16 |= 1572864;
            f18 = f15;
        } else {
            f18 = f15;
            if ((i14 & 1572864) == 0) {
                if (o0VarE.i(f18)) {
                    i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i26 = 524288;
                }
                i16 |= i26;
            }
        }
        i27 = i15 & 128;
        i28 = i16;
        if (i27 != 0) {
            i28 |= 12582912;
        } else if ((i14 & 12582912) == 0) {
            if (o0VarE.h(z15)) {
                i29 = 8388608;
            } else {
                i29 = 4194304;
            }
            i28 |= i29;
        }
        i30 = i15 & 256;
        if (i30 != 0) {
            i28 |= 100663296;
        } else if ((i14 & 100663296) == 0) {
            if (o0VarE.i(f16)) {
                i34 = 67108864;
            } else {
                i34 = 33554432;
            }
            i28 |= i34;
        }
        i35 = i15 & 512;
        if (i35 != 0) {
            i28 |= C.ENCODING_PCM_32BIT;
        } else if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            if (o0VarE.r(lVar)) {
                i36 = 536870912;
            } else {
                i36 = 268435456;
            }
            i28 |= i36;
        }
        i37 = i28;
        if ((i37 & 306783379) == 306783378) {
            if (i38 != 0) {
                jF = gl1.y.f(0.5f, 0.5f);
            } else {
                jF = j14;
            }
            if (i39 != 0) {
                f17 = 0.0f;
            }
            if (i17 != 0) {
                z16 = false;
            }
            if (i19 != 0) {
                obj2 = null;
            }
            if (i25 != 0) {
                f19 = 0.0f;
            } else {
                f19 = f18;
            }
            if (i27 != 0) {
                z17 = true;
            } else {
                z17 = z15;
            }
            if (i30 == 0) {
            }
            aVar = p3.m.f135153a;
            if (i35 != 0) {
                o0VarE.C(-331704127);
                objQ2 = o0VarE.q();
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new a(4);
                    o0VarE.K(objQ2);
                }
                lVar2 = (e23.l) objQ2;
                o0VarE.g0(false);
            } else {
                lVar2 = lVar;
            }
            x1 x1Var6 = p3.n.f135158a;
            if (cVar instanceof MapApplier) {
                mapApplier = (MapApplier) cVar;
            } else {
                mapApplier = null;
            }
            o0VarE.C(-331699334);
            boolean zR11 = o0VarE.r(mapApplier);
            j15 = jF;
            if ((i37 & 896) == 256) {
                z18 = true;
            } else {
                z18 = false;
            }
            boolean z314 = zR11 | z18;
            if ((i37 & 7168) == 2048) {
                z19 = true;
            } else {
                z19 = false;
            }
            boolean z41114 = z314 | z19;
            if ((57344 & i37) == 16384) {
                z24 = true;
            } else {
                z24 = false;
            }
            boolean z41115 = z41114 | z24;
            if ((i37 & 112) == 32) {
                z25 = true;
            } else {
                z25 = false;
            }
            boolean z41116 = z41115 | z25;
            if ((i37 & 14) == 4) {
                z26 = true;
            } else {
                z26 = false;
            }
            boolean z41117 = z41116 | z26;
            if ((3670016 & i37) == 1048576) {
                z27 = true;
            } else {
                z27 = false;
            }
            boolean z41118 = z41117 | z27;
            if ((29360128 & i37) == 8388608) {
                z28 = true;
            } else {
                z28 = false;
            }
            boolean z41119 = z41118 | z28;
            if ((234881024 & i37) == 67108864) {
                z29 = true;
            } else {
                z29 = false;
            }
            boolean zR12 = z41119 | z29 | o0VarE.r(obj2);
            if ((i37 & 1879048192) == 536870912) {
                z34 = true;
            } else {
                z34 = false;
            }
            z35 = zR12 | z34;
            objQ = o0VarE.q();
            if (z35) {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    lVar3 = lVar2;
                    final MapApplier mapApplier12 = mapApplier;
                    final Object obj15 = obj2;
                    z36 = false;
                    final float f218 = f22;
                    z37 = z16;
                    f24 = f17;
                    j16 = j15;
                    obj3 = new e23.a() { // from class: com.google.maps.android.compose.g
                        @Override // e23.a
                        public final Object invoke() {
                            return GroundOverlayKt.GroundOverlay_bPm4XcI$lambda$4$lambda$3(mapApplier12, obj15, lVar3, j16, f24, z37, bitmapDescriptor, groundOverlayPosition, f19, z17, f218);
                        }
                    };
                    f25 = f218;
                    obj2 = obj15;
                    bitmapDescriptor2 = bitmapDescriptor;
                    o0VarE.K(obj3);
                } else {
                    bitmapDescriptor2 = bitmapDescriptor;
                    obj3 = objQ;
                    f25 = f22;
                    lVar3 = lVar2;
                    z36 = false;
                    z37 = z16;
                    f24 = f17;
                    j16 = j15;
                }
            } else {
                lVar3 = lVar2;
                final MapApplier mapApplier13 = mapApplier;
                final Object obj16 = obj2;
                z36 = false;
                final float f219 = f22;
                z37 = z16;
                f24 = f17;
                j16 = j15;
                obj3 = new e23.a() { // from class: com.google.maps.android.compose.g
                    @Override // e23.a
                    public final Object invoke() {
                        return GroundOverlayKt.GroundOverlay_bPm4XcI$lambda$4$lambda$3(mapApplier13, obj16, lVar3, j16, f24, z37, bitmapDescriptor, groundOverlayPosition, f19, z17, f219);
                    }
                };
                f25 = f219;
                obj2 = obj16;
                bitmapDescriptor2 = bitmapDescriptor;
                o0VarE.K(obj3);
            }
            aVar2 = (e23.a) obj3;
            o0VarE.g0(z36);
            if (!(cVar instanceof MapApplier)) {
                p3.p0.l();
                throw null;
            }
            o0VarE.H();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.d(new q0(18), lVar3, o0VarE);
            b4.d(new q0(19), Float.valueOf(f24), o0VarE);
            b4.d(new q0(20), Boolean.valueOf(z37), o0VarE);
            b4.d(new q0(21), bitmapDescriptor2, o0VarE);
            b4.d(new q0(22), groundOverlayPosition, o0VarE);
            b4.d(new q0(23), obj2, o0VarE);
            b4.d(new q0(15), Float.valueOf(f19), o0VarE);
            b4.d(new q0(16), Boolean.valueOf(z17), o0VarE);
            b4.d(new q0(17), Float.valueOf(f25), o0VarE);
            o0VarE.g0(true);
            f26 = f19;
            z38 = z17;
            f27 = f25;
            lVar4 = lVar3;
            j17 = j16;
            f17 = f24;
            z16 = z37;
        } else {
            if (i38 != 0) {
                jF = gl1.y.f(0.5f, 0.5f);
            } else {
                jF = j14;
            }
            if (i39 != 0) {
                f17 = 0.0f;
            }
            if (i17 != 0) {
                z16 = false;
            }
            if (i19 != 0) {
                obj2 = null;
            }
            if (i25 != 0) {
                f19 = 0.0f;
            } else {
                f19 = f18;
            }
            if (i27 != 0) {
                z17 = true;
            } else {
                z17 = z15;
            }
            if (i30 == 0) {
            }
            aVar = p3.m.f135153a;
            if (i35 != 0) {
                o0VarE.C(-331704127);
                objQ2 = o0VarE.q();
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new a(4);
                    o0VarE.K(objQ2);
                }
                lVar2 = (e23.l) objQ2;
                o0VarE.g0(false);
            } else {
                lVar2 = lVar;
            }
            x1 x1Var7 = p3.n.f135158a;
            if (cVar instanceof MapApplier) {
                mapApplier = (MapApplier) cVar;
            } else {
                mapApplier = null;
            }
            o0VarE.C(-331699334);
            boolean zR13 = o0VarE.r(mapApplier);
            j15 = jF;
            if ((i37 & 896) == 256) {
                z18 = true;
            } else {
                z18 = false;
            }
            boolean z315 = zR13 | z18;
            if ((i37 & 7168) == 2048) {
                z19 = true;
            } else {
                z19 = false;
            }
            boolean z411110 = z315 | z19;
            if ((57344 & i37) == 16384) {
                z24 = true;
            } else {
                z24 = false;
            }
            boolean z411111 = z411110 | z24;
            if ((i37 & 112) == 32) {
                z25 = true;
            } else {
                z25 = false;
            }
            boolean z411112 = z411111 | z25;
            if ((i37 & 14) == 4) {
                z26 = true;
            } else {
                z26 = false;
            }
            boolean z411113 = z411112 | z26;
            if ((3670016 & i37) == 1048576) {
                z27 = true;
            } else {
                z27 = false;
            }
            boolean z411114 = z411113 | z27;
            if ((29360128 & i37) == 8388608) {
                z28 = true;
            } else {
                z28 = false;
            }
            boolean z411115 = z411114 | z28;
            if ((234881024 & i37) == 67108864) {
                z29 = true;
            } else {
                z29 = false;
            }
            boolean zR14 = z411115 | z29 | o0VarE.r(obj2);
            if ((i37 & 1879048192) == 536870912) {
                z34 = true;
            } else {
                z34 = false;
            }
            z35 = zR14 | z34;
            objQ = o0VarE.q();
            if (z35) {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    lVar3 = lVar2;
                    final MapApplier mapApplier14 = mapApplier;
                    final Object obj17 = obj2;
                    z36 = false;
                    final float f2110 = f22;
                    z37 = z16;
                    f24 = f17;
                    j16 = j15;
                    obj3 = new e23.a() { // from class: com.google.maps.android.compose.g
                        @Override // e23.a
                        public final Object invoke() {
                            return GroundOverlayKt.GroundOverlay_bPm4XcI$lambda$4$lambda$3(mapApplier14, obj17, lVar3, j16, f24, z37, bitmapDescriptor, groundOverlayPosition, f19, z17, f2110);
                        }
                    };
                    f25 = f2110;
                    obj2 = obj17;
                    bitmapDescriptor2 = bitmapDescriptor;
                    o0VarE.K(obj3);
                } else {
                    bitmapDescriptor2 = bitmapDescriptor;
                    obj3 = objQ;
                    f25 = f22;
                    lVar3 = lVar2;
                    z36 = false;
                    z37 = z16;
                    f24 = f17;
                    j16 = j15;
                }
            } else {
                lVar3 = lVar2;
                final MapApplier mapApplier15 = mapApplier;
                final Object obj18 = obj2;
                z36 = false;
                final float f2111 = f22;
                z37 = z16;
                f24 = f17;
                j16 = j15;
                obj3 = new e23.a() { // from class: com.google.maps.android.compose.g
                    @Override // e23.a
                    public final Object invoke() {
                        return GroundOverlayKt.GroundOverlay_bPm4XcI$lambda$4$lambda$3(mapApplier15, obj18, lVar3, j16, f24, z37, bitmapDescriptor, groundOverlayPosition, f19, z17, f2111);
                    }
                };
                f25 = f2111;
                obj2 = obj18;
                bitmapDescriptor2 = bitmapDescriptor;
                o0VarE.K(obj3);
            }
            aVar2 = (e23.a) obj3;
            o0VarE.g0(z36);
            if (!(cVar instanceof MapApplier)) {
                p3.p0.l();
                throw null;
            }
            o0VarE.H();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.d(new q0(18), lVar3, o0VarE);
            b4.d(new q0(19), Float.valueOf(f24), o0VarE);
            b4.d(new q0(20), Boolean.valueOf(z37), o0VarE);
            b4.d(new q0(21), bitmapDescriptor2, o0VarE);
            b4.d(new q0(22), groundOverlayPosition, o0VarE);
            b4.d(new q0(23), obj2, o0VarE);
            b4.d(new q0(15), Float.valueOf(f19), o0VarE);
            b4.d(new q0(16), Boolean.valueOf(z17), o0VarE);
            b4.d(new q0(17), Float.valueOf(f25), o0VarE);
            o0VarE.g0(true);
            f26 = f19;
            z38 = z17;
            f27 = f25;
            lVar4 = lVar3;
            j17 = j16;
            f17 = f24;
            z16 = z37;
        }
        obj4 = obj2;
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.f
                @Override // e23.p
                public final Object invoke(Object obj19, Object obj110) {
                    int iIntValue = ((Integer) obj110).intValue();
                    return GroundOverlayKt.GroundOverlay_bPm4XcI$lambda$15(groundOverlayPosition, bitmapDescriptor2, j17, f17, z16, obj4, f26, z38, f27, lVar4, i14, i15, (p3.m) obj19, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroundOverlay_bPm4XcI$lambda$1$lambda$0(GroundOverlay groundOverlay) {
        groundOverlay.getClass();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroundOverlay_bPm4XcI$lambda$14$lambda$10(GroundOverlayNode groundOverlayNode, Object obj) {
        groundOverlayNode.getClass();
        groundOverlayNode.getGroundOverlay().setTag(obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroundOverlay_bPm4XcI$lambda$14$lambda$11(GroundOverlayNode groundOverlayNode, float f14) {
        groundOverlayNode.getClass();
        groundOverlayNode.getGroundOverlay().setTransparency(f14);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroundOverlay_bPm4XcI$lambda$14$lambda$12(GroundOverlayNode groundOverlayNode, boolean z14) {
        groundOverlayNode.getClass();
        groundOverlayNode.getGroundOverlay().setVisible(z14);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroundOverlay_bPm4XcI$lambda$14$lambda$13(GroundOverlayNode groundOverlayNode, float f14) {
        groundOverlayNode.getClass();
        groundOverlayNode.getGroundOverlay().setZIndex(f14);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroundOverlay_bPm4XcI$lambda$14$lambda$5(GroundOverlayNode groundOverlayNode, e23.l lVar) {
        groundOverlayNode.getClass();
        lVar.getClass();
        groundOverlayNode.setOnGroundOverlayClick(lVar);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroundOverlay_bPm4XcI$lambda$14$lambda$6(GroundOverlayNode groundOverlayNode, float f14) {
        groundOverlayNode.getClass();
        groundOverlayNode.getGroundOverlay().setBearing(f14);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroundOverlay_bPm4XcI$lambda$14$lambda$7(GroundOverlayNode groundOverlayNode, boolean z14) {
        groundOverlayNode.getClass();
        groundOverlayNode.getGroundOverlay().setClickable(z14);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroundOverlay_bPm4XcI$lambda$14$lambda$8(GroundOverlayNode groundOverlayNode, BitmapDescriptor bitmapDescriptor) {
        groundOverlayNode.getClass();
        bitmapDescriptor.getClass();
        groundOverlayNode.getGroundOverlay().setImage(bitmapDescriptor);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroundOverlay_bPm4XcI$lambda$14$lambda$9(GroundOverlayNode groundOverlayNode, GroundOverlayPosition groundOverlayPosition) {
        groundOverlayNode.getClass();
        groundOverlayPosition.getClass();
        position(groundOverlayNode.getGroundOverlay(), groundOverlayPosition);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroundOverlay_bPm4XcI$lambda$15(GroundOverlayPosition groundOverlayPosition, BitmapDescriptor bitmapDescriptor, long j8, float f14, boolean z14, Object obj, float f15, boolean z15, float f16, e23.l lVar, int i14, int i15, p3.m mVar, int i16) {
        m111GroundOverlaybPm4XcI(groundOverlayPosition, bitmapDescriptor, j8, f14, z14, obj, f15, z15, f16, lVar, mVar, p3.p0.t(i14 | 1), i15);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GroundOverlayNode GroundOverlay_bPm4XcI$lambda$4$lambda$3(MapApplier mapApplier, Object obj, e23.l lVar, long j8, float f14, boolean z14, BitmapDescriptor bitmapDescriptor, GroundOverlayPosition groundOverlayPosition, float f15, boolean z15, float f16) {
        GoogleMap map;
        if (mapApplier != null && (map = mapApplier.getMap()) != null) {
            GroundOverlayOptions groundOverlayOptions = new GroundOverlayOptions();
            groundOverlayOptions.anchor(n4.c.g(j8), n4.c.h(j8));
            groundOverlayOptions.bearing(f14);
            groundOverlayOptions.clickable(z14);
            groundOverlayOptions.image(bitmapDescriptor);
            position(groundOverlayOptions, groundOverlayPosition);
            groundOverlayOptions.transparency(f15);
            groundOverlayOptions.visible(z15);
            groundOverlayOptions.zIndex(f16);
            GroundOverlay groundOverlayAddGroundOverlay = map.addGroundOverlay(groundOverlayOptions);
            if (groundOverlayAddGroundOverlay != null) {
                groundOverlayAddGroundOverlay.setTag(obj);
                return new GroundOverlayNode(groundOverlayAddGroundOverlay, lVar);
            }
        }
        vb.h.z("Error adding ground overlay");
        return null;
    }

    private static final GroundOverlayOptions position(GroundOverlayOptions groundOverlayOptions, GroundOverlayPosition groundOverlayPosition) {
        if (groundOverlayPosition.getLatLngBounds() != null) {
            GroundOverlayOptions groundOverlayOptionsPositionFromBounds = groundOverlayOptions.positionFromBounds(groundOverlayPosition.getLatLngBounds());
            groundOverlayOptionsPositionFromBounds.getClass();
            return groundOverlayOptionsPositionFromBounds;
        }
        if (groundOverlayPosition.getLocation() == null || groundOverlayPosition.getWidth() == null) {
            com.google.firebase.messaging.l.n(groundOverlayPosition, "Invalid position ");
            return null;
        }
        if (groundOverlayPosition.getHeight() == null) {
            GroundOverlayOptions groundOverlayOptionsPosition = groundOverlayOptions.position(groundOverlayPosition.getLocation(), groundOverlayPosition.getWidth().floatValue());
            groundOverlayOptionsPosition.getClass();
            return groundOverlayOptionsPosition;
        }
        GroundOverlayOptions groundOverlayOptionsPosition2 = groundOverlayOptions.position(groundOverlayPosition.getLocation(), groundOverlayPosition.getWidth().floatValue(), groundOverlayPosition.getHeight().floatValue());
        groundOverlayOptionsPosition2.getClass();
        return groundOverlayOptionsPosition2;
    }

    private static final void position(GroundOverlay groundOverlay, GroundOverlayPosition groundOverlayPosition) {
        if (groundOverlayPosition.getLatLngBounds() != null) {
            groundOverlay.setPositionFromBounds(groundOverlayPosition.getLatLngBounds());
            return;
        }
        if (groundOverlayPosition.getLocation() != null) {
            groundOverlay.setPosition(groundOverlayPosition.getLocation());
        }
        if (groundOverlayPosition.getWidth() != null && groundOverlayPosition.getHeight() == null) {
            groundOverlay.setDimensions(groundOverlayPosition.getWidth().floatValue());
        } else {
            if (groundOverlayPosition.getWidth() == null || groundOverlayPosition.getHeight() == null) {
                return;
            }
            groundOverlay.setDimensions(groundOverlayPosition.getWidth().floatValue(), groundOverlayPosition.getHeight().floatValue());
        }
    }
}
