package com.google.maps.android.compose;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.maps.android.data.kml.KmlPolygon;
import com.nimbusds.jose.HeaderParameterNames;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a·\u0001\u0010\u001a\u001a\u00020\u00162\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00000\u00002\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H\u0007¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"", "Lcom/google/android/gms/maps/model/LatLng;", "points", "", "clickable", "Lo4/d0;", "fillColor", "geodesic", "holes", "strokeColor", "", "strokeJointType", "Lcom/google/android/gms/maps/model/PatternItem;", "strokePattern", "", "strokeWidth", "", HeaderParameterNames.AUTHENTICATION_TAG, "visible", "zIndex", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/Polygon;", "", "onClick", "Polygon-qT8xWJw", "(Ljava/util/List;ZJZLjava/util/List;JILjava/util/List;FLjava/lang/Object;ZFLe23/l;Lp3/m;III)V", KmlPolygon.GEOMETRY_TYPE, "maps-compose_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class PolygonKt {
    /* JADX WARN: Code duplicated, block: B:100:0x0127  */
    /* JADX WARN: Code duplicated, block: B:102:0x012b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0135  */
    /* JADX WARN: Code duplicated, block: B:105:0x0138  */
    /* JADX WARN: Code duplicated, block: B:109:0x0140  */
    /* JADX WARN: Code duplicated, block: B:110:0x0149  */
    /* JADX WARN: Code duplicated, block: B:112:0x014d  */
    /* JADX WARN: Code duplicated, block: B:114:0x0157  */
    /* JADX WARN: Code duplicated, block: B:115:0x015a  */
    /* JADX WARN: Code duplicated, block: B:117:0x015f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0169  */
    /* JADX WARN: Code duplicated, block: B:122:0x0170  */
    /* JADX WARN: Code duplicated, block: B:124:0x0174  */
    /* JADX WARN: Code duplicated, block: B:126:0x017e  */
    /* JADX WARN: Code duplicated, block: B:127:0x0181  */
    /* JADX WARN: Code duplicated, block: B:129:0x0186  */
    /* JADX WARN: Code duplicated, block: B:132:0x018f  */
    /* JADX WARN: Code duplicated, block: B:133:0x0192  */
    /* JADX WARN: Code duplicated, block: B:135:0x0198  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:140:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:143:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:149:0x01de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:150:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:151:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:153:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:154:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:156:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:158:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:160:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:162:0x0201  */
    /* JADX WARN: Code duplicated, block: B:165:0x0206  */
    /* JADX WARN: Code duplicated, block: B:167:0x020a  */
    /* JADX WARN: Code duplicated, block: B:168:0x020d  */
    /* JADX WARN: Code duplicated, block: B:170:0x0211  */
    /* JADX WARN: Code duplicated, block: B:171:0x0214  */
    /* JADX WARN: Code duplicated, block: B:173:0x0218  */
    /* JADX WARN: Code duplicated, block: B:174:0x021b  */
    /* JADX WARN: Code duplicated, block: B:176:0x021f  */
    /* JADX WARN: Code duplicated, block: B:177:0x0222  */
    /* JADX WARN: Code duplicated, block: B:180:0x0228  */
    /* JADX WARN: Code duplicated, block: B:182:0x023b  */
    /* JADX WARN: Code duplicated, block: B:184:0x024c  */
    /* JADX WARN: Code duplicated, block: B:187:0x0259  */
    /* JADX WARN: Code duplicated, block: B:189:0x025f  */
    /* JADX WARN: Code duplicated, block: B:191:0x0284  */
    /* JADX WARN: Code duplicated, block: B:193:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:194:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:197:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:198:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:201:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:202:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:205:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:206:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:209:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:210:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:213:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:214:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:217:0x0307  */
    /* JADX WARN: Code duplicated, block: B:218:0x0309  */
    /* JADX WARN: Code duplicated, block: B:221:0x0312  */
    /* JADX WARN: Code duplicated, block: B:222:0x0314  */
    /* JADX WARN: Code duplicated, block: B:225:0x0322  */
    /* JADX WARN: Code duplicated, block: B:226:0x0324  */
    /* JADX WARN: Code duplicated, block: B:229:0x032d  */
    /* JADX WARN: Code duplicated, block: B:232:0x0335  */
    /* JADX WARN: Code duplicated, block: B:233:0x0343  */
    /* JADX WARN: Code duplicated, block: B:236:0x0373  */
    /* JADX WARN: Code duplicated, block: B:238:0x037a  */
    /* JADX WARN: Code duplicated, block: B:239:0x037e  */
    /* JADX WARN: Code duplicated, block: B:242:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:245:0x03e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:248:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:252:0x0451  */
    /* JADX WARN: Code duplicated, block: B:254:0x046a  */
    /* JADX WARN: Code duplicated, block: B:256:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x005b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX WARN: Code duplicated, block: B:49:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:54:0x009c  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:88:0x0102  */
    /* JADX WARN: Code duplicated, block: B:89:0x0107  */
    /* JADX WARN: Code duplicated, block: B:91:0x010d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0113  */
    /* JADX WARN: Code duplicated, block: B:94:0x0116  */
    /* JADX WARN: Code duplicated, block: B:98:0x0120  */
    @GoogleMapComposable
    /* JADX INFO: renamed from: Polygon-qT8xWJw, reason: not valid java name */
    public static final void m120PolygonqT8xWJw(final List<LatLng> list, boolean z14, long j8, boolean z15, List<? extends List<LatLng>> list2, long j14, int i14, List<? extends PatternItem> list3, float f14, Object obj, boolean z16, float f15, e23.l<? super Polygon, Unit> lVar, p3.m mVar, final int i15, final int i16, final int i17) {
        int i18;
        boolean z17;
        int i19;
        int i24;
        int i25;
        int i26;
        boolean z18;
        int i27;
        int i28;
        List<? extends List<LatLng>> list4;
        int i29;
        int i30;
        final long j15;
        int i34;
        int i35;
        final int i36;
        int i37;
        int i38;
        List<? extends PatternItem> list5;
        int i39;
        int i44;
        int i45;
        int i46;
        int i47;
        int i48;
        int i49;
        int i54;
        int i55;
        int i56;
        int i57;
        int i58;
        int i59;
        int i64;
        boolean z19;
        long j16;
        float f16;
        Object obj2;
        boolean z24;
        float f17;
        p3.m.a aVar;
        boolean z25;
        e23.l<? super Polygon, Unit> lVar2;
        final float f18;
        boolean z26;
        final Object obj3;
        int i65;
        final List<? extends List<LatLng>> list6;
        final float f19;
        final boolean z27;
        final e23.l<? super Polygon, Unit> lVar3;
        final long j17;
        final boolean z28;
        List<? extends PatternItem> list7;
        final MapApplier mapApplier;
        boolean z29;
        boolean z34;
        boolean z35;
        boolean z36;
        boolean z37;
        boolean z38;
        boolean z39;
        boolean z44;
        boolean z45;
        boolean z46;
        Object objQ;
        Object obj4;
        final List<? extends PatternItem> list8;
        final int i66;
        List<LatLng> list9;
        p3.o0 o0Var;
        e23.l<? super Polygon, Unit> lVar4;
        final long j18;
        e23.a aVar2;
        c0 c0Var;
        boolean z47;
        final Object obj5;
        final boolean z48;
        final List<? extends PatternItem> list10;
        final boolean z49;
        final e23.l<? super Polygon, Unit> lVar5;
        final List<? extends List<LatLng>> list11;
        final float f22;
        final float f24;
        p2 p2VarI0;
        Object objQ2;
        p2 p2VarI1;
        list.getClass();
        p3.o0 o0VarE = mVar.E(-52967640);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i17 & 1) != 0) {
            i18 = i15 | 6;
        } else if ((i15 & 6) == 0) {
            i18 = (o0VarE.r(list) ? 4 : 2) | i15;
        } else {
            i18 = i15;
        }
        int i67 = i17 & 2;
        if (i67 == 0) {
            if ((i15 & 48) == 0) {
                z17 = z14;
                i18 |= o0VarE.h(z17) ? 32 : 16;
            }
            i19 = i17 & 4;
            if (i19 != 0) {
                i18 |= 384;
                i24 = i67;
            } else {
                i24 = i67;
                if ((i15 & 384) == 0) {
                    if (o0VarE.l(j8)) {
                        i25 = 256;
                    } else {
                        i25 = 128;
                    }
                    i18 |= i25;
                }
            }
            i26 = i17 & 8;
            if (i26 != 0) {
                if ((i15 & 3072) == 0) {
                    z18 = z15;
                    if (o0VarE.h(z18)) {
                        i27 = 2048;
                    } else {
                        i27 = 1024;
                    }
                    i18 |= i27;
                }
                i28 = i17 & 16;
                if (i28 != 0) {
                    if ((i15 & 24576) == 0) {
                        list4 = list2;
                        if (o0VarE.r(list4)) {
                            i29 = 16384;
                        } else {
                            i29 = 8192;
                        }
                        i18 |= i29;
                    }
                    i30 = i17 & 32;
                    if (i30 != 0) {
                        i18 |= 196608;
                        j15 = j14;
                    } else {
                        j15 = j14;
                        if ((i15 & 196608) == 0) {
                            if (o0VarE.l(j15)) {
                                i34 = 131072;
                            } else {
                                i34 = 65536;
                            }
                            i18 |= i34;
                        }
                    }
                    i35 = i17 & 64;
                    if (i35 != 0) {
                        i18 |= 1572864;
                        i36 = i14;
                    } else {
                        i36 = i14;
                        if ((i15 & 1572864) == 0) {
                            if (o0VarE.k(i36)) {
                                i37 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                            } else {
                                i37 = 524288;
                            }
                            i18 |= i37;
                        }
                    }
                    i38 = i17 & 128;
                    if (i38 != 0) {
                        i18 |= 12582912;
                        list5 = list3;
                    } else {
                        list5 = list3;
                        if ((i15 & 12582912) == 0) {
                            if (o0VarE.r(list5)) {
                                i39 = 8388608;
                            } else {
                                i39 = 4194304;
                            }
                            i18 |= i39;
                        }
                    }
                    i44 = i17 & 256;
                    if (i44 != 0) {
                        i18 |= 100663296;
                    } else if ((i15 & 100663296) == 0) {
                        if (o0VarE.i(f14)) {
                            i45 = 67108864;
                        } else {
                            i45 = 33554432;
                        }
                        i18 |= i45;
                    }
                    i46 = i17 & 512;
                    if (i46 != 0) {
                        if ((i15 & C.ENCODING_PCM_32BIT) == 0) {
                            if (o0VarE.r(obj)) {
                                i47 = 536870912;
                            } else {
                                i47 = 268435456;
                            }
                            i18 |= i47;
                        }
                        i48 = i17 & 1024;
                        if (i48 != 0) {
                            i49 = i16 | 6;
                        } else if ((i16 & 6) == 0) {
                            if (o0VarE.h(z16)) {
                                i54 = 4;
                            } else {
                                i54 = 2;
                            }
                            i49 = i16 | i54;
                        } else {
                            i49 = i16;
                        }
                        i55 = i17 & 2048;
                        if (i55 != 0) {
                            i49 |= 48;
                        } else if ((i16 & 48) != 0) {
                            if (o0VarE.i(f15)) {
                                i56 = 32;
                            } else {
                                i56 = 16;
                            }
                            i49 |= i56;
                        }
                        i57 = i49;
                        i58 = i17 & 4096;
                        if (i58 != 0) {
                            i59 = i57 | 384;
                        } else if ((i16 & 384) == 0) {
                            if (o0VarE.r(lVar)) {
                                i64 = 256;
                            } else {
                                i64 = 128;
                            }
                            i59 = i57 | i64;
                        } else {
                            i59 = i57;
                        }
                        if ((i18 & 306783379) != 306783378 && (i59 & 147) == 146 && o0VarE.b()) {
                            o0VarE.e();
                            z49 = z16;
                            lVar5 = lVar;
                            o0Var = o0VarE;
                            z48 = z18;
                            list10 = list5;
                            z19 = z17;
                            list11 = list4;
                            j18 = j8;
                            f22 = f14;
                            obj5 = obj;
                            f24 = f15;
                        } else {
                            if (i24 != 0) {
                                z19 = false;
                            } else {
                                z19 = z17;
                            }
                            if (i19 != 0) {
                                o4.d0.f128823b.getClass();
                                j16 = o4.d0.f128824c;
                            } else {
                                j16 = j8;
                            }
                            if (i26 != 0) {
                                z18 = false;
                            }
                            if (i28 != 0) {
                                list4 = p13.j0.f134944a;
                            }
                            if (i30 != 0) {
                                o4.d0.f128823b.getClass();
                                j15 = o4.d0.f128824c;
                            }
                            if (i35 != 0) {
                                i36 = 0;
                            }
                            if (i38 != 0) {
                                list5 = null;
                            }
                            if (i44 != 0) {
                                f16 = 10.0f;
                            } else {
                                f16 = f14;
                            }
                            if (i46 != 0) {
                                obj2 = null;
                            } else {
                                obj2 = obj;
                            }
                            if (i48 != 0) {
                                z24 = true;
                            } else {
                                z24 = z16;
                            }
                            if (i55 != 0) {
                                f17 = 0.0f;
                            } else {
                                f17 = f15;
                            }
                            aVar = p3.m.f135153a;
                            if (i58 != 0) {
                                o0VarE.C(751006162);
                                objQ2 = o0VarE.q();
                                aVar.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new f0(8);
                                    o0VarE.K(objQ2);
                                }
                                lVar2 = (e23.l) objQ2;
                                z25 = false;
                                o0VarE.g0(false);
                            } else {
                                z25 = false;
                                lVar2 = lVar;
                            }
                            x1 x1Var = p3.n.f135158a;
                            if (list.isEmpty()) {
                                p2VarI0 = o0VarE.i0();
                                if (p2VarI0 != null) {
                                    final int i68 = 1;
                                    final boolean z54 = z18;
                                    final List<? extends PatternItem> list12 = list5;
                                    final long j19 = j16;
                                    final List<? extends List<LatLng>> list13 = list4;
                                    final float f25 = f16;
                                    final Object obj6 = obj2;
                                    final boolean z55 = z24;
                                    final float f26 = f17;
                                    final boolean z56 = z19;
                                    final e23.l<? super Polygon, Unit> lVar6 = lVar2;
                                    p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.g0
                                        @Override // e23.p
                                        public final Object invoke(Object obj7, Object obj8) {
                                            p3.m mVar2 = (p3.m) obj7;
                                            switch (i68) {
                                                case 0:
                                                    return PolygonKt.Polygon_qT8xWJw$lambda$18(list, z56, j19, z54, list13, j15, i36, list12, f25, obj6, z55, f26, lVar6, i15, i16, i17, mVar2, ((Integer) obj8).intValue());
                                                default:
                                                    return PolygonKt.Polygon_qT8xWJw$lambda$2(list, z56, j19, z54, list13, j15, i36, list12, f25, obj6, z55, f26, lVar6, i15, i16, i17, mVar2, ((Integer) obj8).intValue());
                                            }
                                        }
                                    };
                                    return;
                                }
                                return;
                            }
                            f18 = f17;
                            z26 = z25;
                            obj3 = obj2;
                            i65 = i36;
                            list6 = list4;
                            f19 = f16;
                            z27 = z24;
                            lVar3 = lVar2;
                            j17 = j15;
                            z28 = z18;
                            list7 = list5;
                            mapApplier = (MapApplier) cVar;
                            o0VarE.C(751012594);
                            boolean zR = o0VarE.r(mapApplier) | o0VarE.r(list);
                            if ((i18 & 112) == 32) {
                                z29 = true;
                            } else {
                                z29 = z26;
                            }
                            boolean z57 = z29 | zR;
                            if ((i18 & 896) == 256) {
                                z34 = true;
                            } else {
                                z34 = z26;
                            }
                            boolean z58 = z57 | z34;
                            if ((i18 & 7168) == 2048) {
                                z35 = true;
                            } else {
                                z35 = z26;
                            }
                            boolean zR2 = z58 | z35 | o0VarE.r(list6);
                            if ((458752 & i18) == 131072) {
                                z36 = true;
                            } else {
                                z36 = z26;
                            }
                            boolean z59 = zR2 | z36;
                            if ((3670016 & i18) == 1048576) {
                                z37 = true;
                            } else {
                                z37 = z26;
                            }
                            boolean zR3 = z59 | z37 | o0VarE.r(list7);
                            if ((234881024 & i18) == 67108864) {
                                z38 = true;
                            } else {
                                z38 = z26;
                            }
                            boolean z64 = zR3 | z38;
                            if ((i59 & 14) == 4) {
                                z39 = true;
                            } else {
                                z39 = z26;
                            }
                            boolean z65 = z64 | z39;
                            if ((i59 & 112) == 32) {
                                z44 = true;
                            } else {
                                z44 = z26;
                            }
                            boolean zR4 = z65 | z44 | o0VarE.r(obj3);
                            if ((i59 & 896) == 256) {
                                z45 = true;
                            } else {
                                z45 = z26;
                            }
                            z46 = z45 | zR4;
                            objQ = o0VarE.q();
                            if (z46) {
                                final long j24 = j16;
                                list8 = list7;
                                i66 = i65;
                                final boolean z66 = z19;
                                obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                                    @Override // e23.a
                                    public final Object invoke() {
                                        return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z66, j24, z28, list6, j17, i66, list8, f19, z27, f18);
                                    }
                                };
                                list9 = list;
                                o0Var = o0VarE;
                                lVar4 = lVar3;
                                j18 = j24;
                                o0Var.K(obj4);
                            } else {
                                aVar.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    final long j25 = j16;
                                    list8 = list7;
                                    i66 = i65;
                                    final boolean z67 = z19;
                                    obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                                        @Override // e23.a
                                        public final Object invoke() {
                                            return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z67, j25, z28, list6, j17, i66, list8, f19, z27, f18);
                                        }
                                    };
                                    list9 = list;
                                    o0Var = o0VarE;
                                    lVar4 = lVar3;
                                    j18 = j25;
                                    o0Var.K(obj4);
                                } else {
                                    obj4 = objQ;
                                    o0Var = o0VarE;
                                    j18 = j16;
                                    lVar4 = lVar3;
                                    list9 = list;
                                    i66 = i65;
                                    list8 = list7;
                                }
                            }
                            aVar2 = (e23.a) obj4;
                            o0Var.g0(false);
                            if (!(cVar instanceof MapApplier)) {
                                p3.p0.l();
                                throw null;
                            }
                            o0Var.H();
                            if (o0Var.T) {
                                o0Var.M(aVar2);
                            } else {
                                o0Var.c();
                            }
                            b4.d(new c0(22), lVar4, o0Var);
                            b4.d(new c0(23), list9, o0Var);
                            b4.d(new c0(13), Boolean.valueOf(z19), o0Var);
                            b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$4
                                @Override // e23.p
                                public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                                    m121invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                                public final void m121invoke4WTKRHQ(PolygonNode polygonNode, long j26) {
                                    polygonNode.getClass();
                                    polygonNode.getPolygon().setFillColor(o4.f0.j(j26));
                                }
                            }, o4.d0.a(j18), o0Var);
                            b4.d(new c0(14), Boolean.valueOf(z28), o0Var);
                            b4.d(new c0(15), list6, o0Var);
                            b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$7
                                @Override // e23.p
                                public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                                    m122invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                                public final void m122invoke4WTKRHQ(PolygonNode polygonNode, long j26) {
                                    polygonNode.getClass();
                                    polygonNode.getPolygon().setStrokeColor(o4.f0.j(j26));
                                }
                            }, o4.d0.a(j17), o0Var);
                            c0Var = new c0(16);
                            z47 = o0Var.T;
                            if (!z47 || !p005kotlin.jvm.internal.s.g(o0Var.q(), Integer.valueOf(i66))) {
                                o0Var.K(Integer.valueOf(i66));
                                if (!z47) {
                                    o0Var.apply(c0Var, Integer.valueOf(i66));
                                }
                            }
                            b4.d(new c0(17), list8, o0Var);
                            b4.d(new c0(18), Float.valueOf(f19), o0Var);
                            b4.d(new c0(19), obj3, o0Var);
                            b4.d(new c0(20), Boolean.valueOf(z27), o0Var);
                            b4.d(new c0(21), Float.valueOf(f18), o0Var);
                            o0Var.g0(true);
                            int i69 = i66;
                            obj5 = obj3;
                            z48 = z28;
                            j15 = j17;
                            list10 = list8;
                            z49 = z27;
                            lVar5 = lVar4;
                            list11 = list6;
                            i36 = i69;
                            f22 = f19;
                            f24 = f18;
                        }
                        p2VarI1 = o0Var.i0();
                        if (p2VarI1 != null) {
                            final int i74 = 0;
                            final boolean z68 = z19;
                            p2VarI1.f135219d = new e23.p() { // from class: com.google.maps.android.compose.g0
                                @Override // e23.p
                                public final Object invoke(Object obj7, Object obj8) {
                                    p3.m mVar2 = (p3.m) obj7;
                                    switch (i74) {
                                        case 0:
                                            return PolygonKt.Polygon_qT8xWJw$lambda$18(list, z68, j18, z48, list11, j15, i36, list10, f22, obj5, z49, f24, lVar5, i15, i16, i17, mVar2, ((Integer) obj8).intValue());
                                        default:
                                            return PolygonKt.Polygon_qT8xWJw$lambda$2(list, z68, j18, z48, list11, j15, i36, list10, f22, obj5, z49, f24, lVar5, i15, i16, i17, mVar2, ((Integer) obj8).intValue());
                                    }
                                }
                            };
                        }
                    }
                    i18 |= C.ENCODING_PCM_32BIT;
                    i48 = i17 & 1024;
                    if (i48 != 0) {
                        i49 = i16 | 6;
                    } else if ((i16 & 6) == 0) {
                        if (o0VarE.h(z16)) {
                            i54 = 4;
                        } else {
                            i54 = 2;
                        }
                        i49 = i16 | i54;
                    } else {
                        i49 = i16;
                    }
                    i55 = i17 & 2048;
                    if (i55 != 0) {
                        i49 |= 48;
                    } else if ((i16 & 48) != 0) {
                        if (o0VarE.i(f15)) {
                            i56 = 32;
                        } else {
                            i56 = 16;
                        }
                        i49 |= i56;
                    }
                    i57 = i49;
                    i58 = i17 & 4096;
                    if (i58 != 0) {
                        i59 = i57 | 384;
                    } else if ((i16 & 384) == 0) {
                        if (o0VarE.r(lVar)) {
                            i64 = 256;
                        } else {
                            i64 = 128;
                        }
                        i59 = i57 | i64;
                    } else {
                        i59 = i57;
                    }
                    if ((i18 & 306783379) != 306783378) {
                        if (i24 != 0) {
                            z19 = false;
                        } else {
                            z19 = z17;
                        }
                        if (i19 != 0) {
                            o4.d0.f128823b.getClass();
                            j16 = o4.d0.f128824c;
                        } else {
                            j16 = j8;
                        }
                        if (i26 != 0) {
                            z18 = false;
                        }
                        if (i28 != 0) {
                            list4 = p13.j0.f134944a;
                        }
                        if (i30 != 0) {
                            o4.d0.f128823b.getClass();
                            j15 = o4.d0.f128824c;
                        }
                        if (i35 != 0) {
                            i36 = 0;
                        }
                        if (i38 != 0) {
                            list5 = null;
                        }
                        if (i44 != 0) {
                            f16 = 10.0f;
                        } else {
                            f16 = f14;
                        }
                        if (i46 != 0) {
                            obj2 = null;
                        } else {
                            obj2 = obj;
                        }
                        if (i48 != 0) {
                            z24 = true;
                        } else {
                            z24 = z16;
                        }
                        if (i55 != 0) {
                            f17 = 0.0f;
                        } else {
                            f17 = f15;
                        }
                        aVar = p3.m.f135153a;
                        if (i58 != 0) {
                            o0VarE.C(751006162);
                            objQ2 = o0VarE.q();
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new f0(8);
                                o0VarE.K(objQ2);
                            }
                            lVar2 = (e23.l) objQ2;
                            z25 = false;
                            o0VarE.g0(false);
                        } else {
                            z25 = false;
                            lVar2 = lVar;
                        }
                        x1 x1Var2 = p3.n.f135158a;
                        if (list.isEmpty()) {
                            p2VarI0 = o0VarE.i0();
                            if (p2VarI0 != null) {
                                final int i610 = 1;
                                final boolean z510 = z18;
                                final List list14 = list5;
                                final long j110 = j16;
                                final List list15 = list4;
                                final float f27 = f16;
                                final Object obj7 = obj2;
                                final boolean z511 = z24;
                                final float f28 = f17;
                                final boolean z512 = z19;
                                final e23.l lVar7 = lVar2;
                                p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.g0
                                    @Override // e23.p
                                    public final Object invoke(Object obj8, Object obj9) {
                                        p3.m mVar2 = (p3.m) obj8;
                                        switch (i610) {
                                            case 0:
                                                return PolygonKt.Polygon_qT8xWJw$lambda$18(list, z512, j110, z510, list15, j15, i36, list14, f27, obj7, z511, f28, lVar7, i15, i16, i17, mVar2, ((Integer) obj9).intValue());
                                            default:
                                                return PolygonKt.Polygon_qT8xWJw$lambda$2(list, z512, j110, z510, list15, j15, i36, list14, f27, obj7, z511, f28, lVar7, i15, i16, i17, mVar2, ((Integer) obj9).intValue());
                                        }
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        f18 = f17;
                        z26 = z25;
                        obj3 = obj2;
                        i65 = i36;
                        list6 = list4;
                        f19 = f16;
                        z27 = z24;
                        lVar3 = lVar2;
                        j17 = j15;
                        z28 = z18;
                        list7 = list5;
                        mapApplier = (MapApplier) cVar;
                        o0VarE.C(751012594);
                        boolean zR5 = o0VarE.r(mapApplier) | o0VarE.r(list);
                        if ((i18 & 112) == 32) {
                            z29 = true;
                        } else {
                            z29 = z26;
                        }
                        boolean z513 = z29 | zR5;
                        if ((i18 & 896) == 256) {
                            z34 = true;
                        } else {
                            z34 = z26;
                        }
                        boolean z514 = z513 | z34;
                        if ((i18 & 7168) == 2048) {
                            z35 = true;
                        } else {
                            z35 = z26;
                        }
                        boolean zR6 = z514 | z35 | o0VarE.r(list6);
                        if ((458752 & i18) == 131072) {
                            z36 = true;
                        } else {
                            z36 = z26;
                        }
                        boolean z515 = zR6 | z36;
                        if ((3670016 & i18) == 1048576) {
                            z37 = true;
                        } else {
                            z37 = z26;
                        }
                        boolean zR7 = z515 | z37 | o0VarE.r(list7);
                        if ((234881024 & i18) == 67108864) {
                            z38 = true;
                        } else {
                            z38 = z26;
                        }
                        boolean z69 = zR7 | z38;
                        if ((i59 & 14) == 4) {
                            z39 = true;
                        } else {
                            z39 = z26;
                        }
                        boolean z610 = z69 | z39;
                        if ((i59 & 112) == 32) {
                            z44 = true;
                        } else {
                            z44 = z26;
                        }
                        boolean zR8 = z610 | z44 | o0VarE.r(obj3);
                        if ((i59 & 896) == 256) {
                            z45 = true;
                        } else {
                            z45 = z26;
                        }
                        z46 = z45 | zR8;
                        objQ = o0VarE.q();
                        if (z46) {
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                final long j26 = j16;
                                list8 = list7;
                                i66 = i65;
                                final boolean z611 = z19;
                                obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                                    @Override // e23.a
                                    public final Object invoke() {
                                        return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z611, j26, z28, list6, j17, i66, list8, f19, z27, f18);
                                    }
                                };
                                list9 = list;
                                o0Var = o0VarE;
                                lVar4 = lVar3;
                                j18 = j26;
                                o0Var.K(obj4);
                            } else {
                                obj4 = objQ;
                                o0Var = o0VarE;
                                j18 = j16;
                                lVar4 = lVar3;
                                list9 = list;
                                i66 = i65;
                                list8 = list7;
                            }
                        } else {
                            final long j27 = j16;
                            list8 = list7;
                            i66 = i65;
                            final boolean z612 = z19;
                            obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                                @Override // e23.a
                                public final Object invoke() {
                                    return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z612, j27, z28, list6, j17, i66, list8, f19, z27, f18);
                                }
                            };
                            list9 = list;
                            o0Var = o0VarE;
                            lVar4 = lVar3;
                            j18 = j27;
                            o0Var.K(obj4);
                        }
                        aVar2 = (e23.a) obj4;
                        o0Var.g0(false);
                        if (!(cVar instanceof MapApplier)) {
                            p3.p0.l();
                            throw null;
                        }
                        o0Var.H();
                        if (o0Var.T) {
                            o0Var.M(aVar2);
                        } else {
                            o0Var.c();
                        }
                        b4.d(new c0(22), lVar4, o0Var);
                        b4.d(new c0(23), list9, o0Var);
                        b4.d(new c0(13), Boolean.valueOf(z19), o0Var);
                        b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$4
                            @Override // e23.p
                            public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                                m121invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                            public final void m121invoke4WTKRHQ(PolygonNode polygonNode, long j28) {
                                polygonNode.getClass();
                                polygonNode.getPolygon().setFillColor(o4.f0.j(j28));
                            }
                        }, o4.d0.a(j18), o0Var);
                        b4.d(new c0(14), Boolean.valueOf(z28), o0Var);
                        b4.d(new c0(15), list6, o0Var);
                        b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$7
                            @Override // e23.p
                            public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                                m122invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                            public final void m122invoke4WTKRHQ(PolygonNode polygonNode, long j28) {
                                polygonNode.getClass();
                                polygonNode.getPolygon().setStrokeColor(o4.f0.j(j28));
                            }
                        }, o4.d0.a(j17), o0Var);
                        c0Var = new c0(16);
                        z47 = o0Var.T;
                        if (!z47) {
                        }
                        o0Var.K(Integer.valueOf(i66));
                        if (!z47) {
                            o0Var.apply(c0Var, Integer.valueOf(i66));
                        }
                        b4.d(new c0(17), list8, o0Var);
                        b4.d(new c0(18), Float.valueOf(f19), o0Var);
                        b4.d(new c0(19), obj3, o0Var);
                        b4.d(new c0(20), Boolean.valueOf(z27), o0Var);
                        b4.d(new c0(21), Float.valueOf(f18), o0Var);
                        o0Var.g0(true);
                        int i611 = i66;
                        obj5 = obj3;
                        z48 = z28;
                        j15 = j17;
                        list10 = list8;
                        z49 = z27;
                        lVar5 = lVar4;
                        list11 = list6;
                        i36 = i611;
                        f22 = f19;
                        f24 = f18;
                    } else {
                        if (i24 != 0) {
                            z19 = false;
                        } else {
                            z19 = z17;
                        }
                        if (i19 != 0) {
                            o4.d0.f128823b.getClass();
                            j16 = o4.d0.f128824c;
                        } else {
                            j16 = j8;
                        }
                        if (i26 != 0) {
                            z18 = false;
                        }
                        if (i28 != 0) {
                            list4 = p13.j0.f134944a;
                        }
                        if (i30 != 0) {
                            o4.d0.f128823b.getClass();
                            j15 = o4.d0.f128824c;
                        }
                        if (i35 != 0) {
                            i36 = 0;
                        }
                        if (i38 != 0) {
                            list5 = null;
                        }
                        if (i44 != 0) {
                            f16 = 10.0f;
                        } else {
                            f16 = f14;
                        }
                        if (i46 != 0) {
                            obj2 = null;
                        } else {
                            obj2 = obj;
                        }
                        if (i48 != 0) {
                            z24 = true;
                        } else {
                            z24 = z16;
                        }
                        if (i55 != 0) {
                            f17 = 0.0f;
                        } else {
                            f17 = f15;
                        }
                        aVar = p3.m.f135153a;
                        if (i58 != 0) {
                            o0VarE.C(751006162);
                            objQ2 = o0VarE.q();
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new f0(8);
                                o0VarE.K(objQ2);
                            }
                            lVar2 = (e23.l) objQ2;
                            z25 = false;
                            o0VarE.g0(false);
                        } else {
                            z25 = false;
                            lVar2 = lVar;
                        }
                        x1 x1Var3 = p3.n.f135158a;
                        if (list.isEmpty()) {
                            p2VarI0 = o0VarE.i0();
                            if (p2VarI0 != null) {
                                final int i612 = 1;
                                final boolean z516 = z18;
                                final List list16 = list5;
                                final long j111 = j16;
                                final List list17 = list4;
                                final float f29 = f16;
                                final Object obj8 = obj2;
                                final boolean z517 = z24;
                                final float f210 = f17;
                                final boolean z518 = z19;
                                final e23.l lVar8 = lVar2;
                                p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.g0
                                    @Override // e23.p
                                    public final Object invoke(Object obj9, Object obj10) {
                                        p3.m mVar2 = (p3.m) obj9;
                                        switch (i612) {
                                            case 0:
                                                return PolygonKt.Polygon_qT8xWJw$lambda$18(list, z518, j111, z516, list17, j15, i36, list16, f29, obj8, z517, f210, lVar8, i15, i16, i17, mVar2, ((Integer) obj10).intValue());
                                            default:
                                                return PolygonKt.Polygon_qT8xWJw$lambda$2(list, z518, j111, z516, list17, j15, i36, list16, f29, obj8, z517, f210, lVar8, i15, i16, i17, mVar2, ((Integer) obj10).intValue());
                                        }
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        f18 = f17;
                        z26 = z25;
                        obj3 = obj2;
                        i65 = i36;
                        list6 = list4;
                        f19 = f16;
                        z27 = z24;
                        lVar3 = lVar2;
                        j17 = j15;
                        z28 = z18;
                        list7 = list5;
                        mapApplier = (MapApplier) cVar;
                        o0VarE.C(751012594);
                        boolean zR9 = o0VarE.r(mapApplier) | o0VarE.r(list);
                        if ((i18 & 112) == 32) {
                            z29 = true;
                        } else {
                            z29 = z26;
                        }
                        boolean z519 = z29 | zR9;
                        if ((i18 & 896) == 256) {
                            z34 = true;
                        } else {
                            z34 = z26;
                        }
                        boolean z5110 = z519 | z34;
                        if ((i18 & 7168) == 2048) {
                            z35 = true;
                        } else {
                            z35 = z26;
                        }
                        boolean zR10 = z5110 | z35 | o0VarE.r(list6);
                        if ((458752 & i18) == 131072) {
                            z36 = true;
                        } else {
                            z36 = z26;
                        }
                        boolean z5111 = zR10 | z36;
                        if ((3670016 & i18) == 1048576) {
                            z37 = true;
                        } else {
                            z37 = z26;
                        }
                        boolean zR11 = z5111 | z37 | o0VarE.r(list7);
                        if ((234881024 & i18) == 67108864) {
                            z38 = true;
                        } else {
                            z38 = z26;
                        }
                        boolean z613 = zR11 | z38;
                        if ((i59 & 14) == 4) {
                            z39 = true;
                        } else {
                            z39 = z26;
                        }
                        boolean z614 = z613 | z39;
                        if ((i59 & 112) == 32) {
                            z44 = true;
                        } else {
                            z44 = z26;
                        }
                        boolean zR12 = z614 | z44 | o0VarE.r(obj3);
                        if ((i59 & 896) == 256) {
                            z45 = true;
                        } else {
                            z45 = z26;
                        }
                        z46 = z45 | zR12;
                        objQ = o0VarE.q();
                        if (z46) {
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                final long j28 = j16;
                                list8 = list7;
                                i66 = i65;
                                final boolean z615 = z19;
                                obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                                    @Override // e23.a
                                    public final Object invoke() {
                                        return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z615, j28, z28, list6, j17, i66, list8, f19, z27, f18);
                                    }
                                };
                                list9 = list;
                                o0Var = o0VarE;
                                lVar4 = lVar3;
                                j18 = j28;
                                o0Var.K(obj4);
                            } else {
                                obj4 = objQ;
                                o0Var = o0VarE;
                                j18 = j16;
                                lVar4 = lVar3;
                                list9 = list;
                                i66 = i65;
                                list8 = list7;
                            }
                        } else {
                            final long j29 = j16;
                            list8 = list7;
                            i66 = i65;
                            final boolean z616 = z19;
                            obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                                @Override // e23.a
                                public final Object invoke() {
                                    return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z616, j29, z28, list6, j17, i66, list8, f19, z27, f18);
                                }
                            };
                            list9 = list;
                            o0Var = o0VarE;
                            lVar4 = lVar3;
                            j18 = j29;
                            o0Var.K(obj4);
                        }
                        aVar2 = (e23.a) obj4;
                        o0Var.g0(false);
                        if (!(cVar instanceof MapApplier)) {
                            p3.p0.l();
                            throw null;
                        }
                        o0Var.H();
                        if (o0Var.T) {
                            o0Var.M(aVar2);
                        } else {
                            o0Var.c();
                        }
                        b4.d(new c0(22), lVar4, o0Var);
                        b4.d(new c0(23), list9, o0Var);
                        b4.d(new c0(13), Boolean.valueOf(z19), o0Var);
                        b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$4
                            @Override // e23.p
                            public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                                m121invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                            public final void m121invoke4WTKRHQ(PolygonNode polygonNode, long j210) {
                                polygonNode.getClass();
                                polygonNode.getPolygon().setFillColor(o4.f0.j(j210));
                            }
                        }, o4.d0.a(j18), o0Var);
                        b4.d(new c0(14), Boolean.valueOf(z28), o0Var);
                        b4.d(new c0(15), list6, o0Var);
                        b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$7
                            @Override // e23.p
                            public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                                m122invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                            public final void m122invoke4WTKRHQ(PolygonNode polygonNode, long j210) {
                                polygonNode.getClass();
                                polygonNode.getPolygon().setStrokeColor(o4.f0.j(j210));
                            }
                        }, o4.d0.a(j17), o0Var);
                        c0Var = new c0(16);
                        z47 = o0Var.T;
                        if (!z47) {
                        }
                        o0Var.K(Integer.valueOf(i66));
                        if (!z47) {
                            o0Var.apply(c0Var, Integer.valueOf(i66));
                        }
                        b4.d(new c0(17), list8, o0Var);
                        b4.d(new c0(18), Float.valueOf(f19), o0Var);
                        b4.d(new c0(19), obj3, o0Var);
                        b4.d(new c0(20), Boolean.valueOf(z27), o0Var);
                        b4.d(new c0(21), Float.valueOf(f18), o0Var);
                        o0Var.g0(true);
                        int i613 = i66;
                        obj5 = obj3;
                        z48 = z28;
                        j15 = j17;
                        list10 = list8;
                        z49 = z27;
                        lVar5 = lVar4;
                        list11 = list6;
                        i36 = i613;
                        f22 = f19;
                        f24 = f18;
                    }
                    p2VarI1 = o0Var.i0();
                    if (p2VarI1 != null) {
                        final int i75 = 0;
                        final boolean z617 = z19;
                        p2VarI1.f135219d = new e23.p() { // from class: com.google.maps.android.compose.g0
                            @Override // e23.p
                            public final Object invoke(Object obj9, Object obj10) {
                                p3.m mVar2 = (p3.m) obj9;
                                switch (i75) {
                                    case 0:
                                        return PolygonKt.Polygon_qT8xWJw$lambda$18(list, z617, j18, z48, list11, j15, i36, list10, f22, obj5, z49, f24, lVar5, i15, i16, i17, mVar2, ((Integer) obj10).intValue());
                                    default:
                                        return PolygonKt.Polygon_qT8xWJw$lambda$2(list, z617, j18, z48, list11, j15, i36, list10, f22, obj5, z49, f24, lVar5, i15, i16, i17, mVar2, ((Integer) obj10).intValue());
                                }
                            }
                        };
                    }
                }
                i18 |= 24576;
                list4 = list2;
                i30 = i17 & 32;
                if (i30 != 0) {
                    i18 |= 196608;
                    j15 = j14;
                } else {
                    j15 = j14;
                    if ((i15 & 196608) == 0) {
                        if (o0VarE.l(j15)) {
                            i34 = 131072;
                        } else {
                            i34 = 65536;
                        }
                        i18 |= i34;
                    }
                }
                i35 = i17 & 64;
                if (i35 != 0) {
                    i18 |= 1572864;
                    i36 = i14;
                } else {
                    i36 = i14;
                    if ((i15 & 1572864) == 0) {
                        if (o0VarE.k(i36)) {
                            i37 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i37 = 524288;
                        }
                        i18 |= i37;
                    }
                }
                i38 = i17 & 128;
                if (i38 != 0) {
                    i18 |= 12582912;
                    list5 = list3;
                } else {
                    list5 = list3;
                    if ((i15 & 12582912) == 0) {
                        if (o0VarE.r(list5)) {
                            i39 = 8388608;
                        } else {
                            i39 = 4194304;
                        }
                        i18 |= i39;
                    }
                }
                i44 = i17 & 256;
                if (i44 != 0) {
                    i18 |= 100663296;
                } else if ((i15 & 100663296) == 0) {
                    if (o0VarE.i(f14)) {
                        i45 = 67108864;
                    } else {
                        i45 = 33554432;
                    }
                    i18 |= i45;
                }
                i46 = i17 & 512;
                if (i46 != 0) {
                    if ((i15 & C.ENCODING_PCM_32BIT) == 0) {
                        if (o0VarE.r(obj)) {
                            i47 = 536870912;
                        } else {
                            i47 = 268435456;
                        }
                        i18 |= i47;
                    }
                    i48 = i17 & 1024;
                    if (i48 != 0) {
                        i49 = i16 | 6;
                    } else if ((i16 & 6) == 0) {
                        if (o0VarE.h(z16)) {
                            i54 = 4;
                        } else {
                            i54 = 2;
                        }
                        i49 = i16 | i54;
                    } else {
                        i49 = i16;
                    }
                    i55 = i17 & 2048;
                    if (i55 != 0) {
                        i49 |= 48;
                    } else if ((i16 & 48) != 0) {
                        if (o0VarE.i(f15)) {
                            i56 = 32;
                        } else {
                            i56 = 16;
                        }
                        i49 |= i56;
                    }
                    i57 = i49;
                    i58 = i17 & 4096;
                    if (i58 != 0) {
                        i59 = i57 | 384;
                    } else if ((i16 & 384) == 0) {
                        if (o0VarE.r(lVar)) {
                            i64 = 256;
                        } else {
                            i64 = 128;
                        }
                        i59 = i57 | i64;
                    } else {
                        i59 = i57;
                    }
                    if ((i18 & 306783379) != 306783378) {
                        if (i24 != 0) {
                            z19 = false;
                        } else {
                            z19 = z17;
                        }
                        if (i19 != 0) {
                            o4.d0.f128823b.getClass();
                            j16 = o4.d0.f128824c;
                        } else {
                            j16 = j8;
                        }
                        if (i26 != 0) {
                            z18 = false;
                        }
                        if (i28 != 0) {
                            list4 = p13.j0.f134944a;
                        }
                        if (i30 != 0) {
                            o4.d0.f128823b.getClass();
                            j15 = o4.d0.f128824c;
                        }
                        if (i35 != 0) {
                            i36 = 0;
                        }
                        if (i38 != 0) {
                            list5 = null;
                        }
                        if (i44 != 0) {
                            f16 = 10.0f;
                        } else {
                            f16 = f14;
                        }
                        if (i46 != 0) {
                            obj2 = null;
                        } else {
                            obj2 = obj;
                        }
                        if (i48 != 0) {
                            z24 = true;
                        } else {
                            z24 = z16;
                        }
                        if (i55 != 0) {
                            f17 = 0.0f;
                        } else {
                            f17 = f15;
                        }
                        aVar = p3.m.f135153a;
                        if (i58 != 0) {
                            o0VarE.C(751006162);
                            objQ2 = o0VarE.q();
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new f0(8);
                                o0VarE.K(objQ2);
                            }
                            lVar2 = (e23.l) objQ2;
                            z25 = false;
                            o0VarE.g0(false);
                        } else {
                            z25 = false;
                            lVar2 = lVar;
                        }
                        x1 x1Var4 = p3.n.f135158a;
                        if (list.isEmpty()) {
                            p2VarI0 = o0VarE.i0();
                            if (p2VarI0 != null) {
                                final int i614 = 1;
                                final boolean z5112 = z18;
                                final List list18 = list5;
                                final long j112 = j16;
                                final List list19 = list4;
                                final float f211 = f16;
                                final Object obj9 = obj2;
                                final boolean z5113 = z24;
                                final float f212 = f17;
                                final boolean z5114 = z19;
                                final e23.l lVar9 = lVar2;
                                p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.g0
                                    @Override // e23.p
                                    public final Object invoke(Object obj10, Object obj11) {
                                        p3.m mVar2 = (p3.m) obj10;
                                        switch (i614) {
                                            case 0:
                                                return PolygonKt.Polygon_qT8xWJw$lambda$18(list, z5114, j112, z5112, list19, j15, i36, list18, f211, obj9, z5113, f212, lVar9, i15, i16, i17, mVar2, ((Integer) obj11).intValue());
                                            default:
                                                return PolygonKt.Polygon_qT8xWJw$lambda$2(list, z5114, j112, z5112, list19, j15, i36, list18, f211, obj9, z5113, f212, lVar9, i15, i16, i17, mVar2, ((Integer) obj11).intValue());
                                        }
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        f18 = f17;
                        z26 = z25;
                        obj3 = obj2;
                        i65 = i36;
                        list6 = list4;
                        f19 = f16;
                        z27 = z24;
                        lVar3 = lVar2;
                        j17 = j15;
                        z28 = z18;
                        list7 = list5;
                        mapApplier = (MapApplier) cVar;
                        o0VarE.C(751012594);
                        boolean zR13 = o0VarE.r(mapApplier) | o0VarE.r(list);
                        if ((i18 & 112) == 32) {
                            z29 = true;
                        } else {
                            z29 = z26;
                        }
                        boolean z5115 = z29 | zR13;
                        if ((i18 & 896) == 256) {
                            z34 = true;
                        } else {
                            z34 = z26;
                        }
                        boolean z5116 = z5115 | z34;
                        if ((i18 & 7168) == 2048) {
                            z35 = true;
                        } else {
                            z35 = z26;
                        }
                        boolean zR14 = z5116 | z35 | o0VarE.r(list6);
                        if ((458752 & i18) == 131072) {
                            z36 = true;
                        } else {
                            z36 = z26;
                        }
                        boolean z5117 = zR14 | z36;
                        if ((3670016 & i18) == 1048576) {
                            z37 = true;
                        } else {
                            z37 = z26;
                        }
                        boolean zR15 = z5117 | z37 | o0VarE.r(list7);
                        if ((234881024 & i18) == 67108864) {
                            z38 = true;
                        } else {
                            z38 = z26;
                        }
                        boolean z618 = zR15 | z38;
                        if ((i59 & 14) == 4) {
                            z39 = true;
                        } else {
                            z39 = z26;
                        }
                        boolean z619 = z618 | z39;
                        if ((i59 & 112) == 32) {
                            z44 = true;
                        } else {
                            z44 = z26;
                        }
                        boolean zR16 = z619 | z44 | o0VarE.r(obj3);
                        if ((i59 & 896) == 256) {
                            z45 = true;
                        } else {
                            z45 = z26;
                        }
                        z46 = z45 | zR16;
                        objQ = o0VarE.q();
                        if (z46) {
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                final long j210 = j16;
                                list8 = list7;
                                i66 = i65;
                                final boolean z6110 = z19;
                                obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                                    @Override // e23.a
                                    public final Object invoke() {
                                        return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z6110, j210, z28, list6, j17, i66, list8, f19, z27, f18);
                                    }
                                };
                                list9 = list;
                                o0Var = o0VarE;
                                lVar4 = lVar3;
                                j18 = j210;
                                o0Var.K(obj4);
                            } else {
                                obj4 = objQ;
                                o0Var = o0VarE;
                                j18 = j16;
                                lVar4 = lVar3;
                                list9 = list;
                                i66 = i65;
                                list8 = list7;
                            }
                        } else {
                            final long j211 = j16;
                            list8 = list7;
                            i66 = i65;
                            final boolean z6111 = z19;
                            obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                                @Override // e23.a
                                public final Object invoke() {
                                    return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z6111, j211, z28, list6, j17, i66, list8, f19, z27, f18);
                                }
                            };
                            list9 = list;
                            o0Var = o0VarE;
                            lVar4 = lVar3;
                            j18 = j211;
                            o0Var.K(obj4);
                        }
                        aVar2 = (e23.a) obj4;
                        o0Var.g0(false);
                        if (!(cVar instanceof MapApplier)) {
                            p3.p0.l();
                            throw null;
                        }
                        o0Var.H();
                        if (o0Var.T) {
                            o0Var.M(aVar2);
                        } else {
                            o0Var.c();
                        }
                        b4.d(new c0(22), lVar4, o0Var);
                        b4.d(new c0(23), list9, o0Var);
                        b4.d(new c0(13), Boolean.valueOf(z19), o0Var);
                        b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$4
                            @Override // e23.p
                            public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                                m121invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                            public final void m121invoke4WTKRHQ(PolygonNode polygonNode, long j212) {
                                polygonNode.getClass();
                                polygonNode.getPolygon().setFillColor(o4.f0.j(j212));
                            }
                        }, o4.d0.a(j18), o0Var);
                        b4.d(new c0(14), Boolean.valueOf(z28), o0Var);
                        b4.d(new c0(15), list6, o0Var);
                        b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$7
                            @Override // e23.p
                            public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                                m122invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                            public final void m122invoke4WTKRHQ(PolygonNode polygonNode, long j212) {
                                polygonNode.getClass();
                                polygonNode.getPolygon().setStrokeColor(o4.f0.j(j212));
                            }
                        }, o4.d0.a(j17), o0Var);
                        c0Var = new c0(16);
                        z47 = o0Var.T;
                        if (!z47) {
                        }
                        o0Var.K(Integer.valueOf(i66));
                        if (!z47) {
                            o0Var.apply(c0Var, Integer.valueOf(i66));
                        }
                        b4.d(new c0(17), list8, o0Var);
                        b4.d(new c0(18), Float.valueOf(f19), o0Var);
                        b4.d(new c0(19), obj3, o0Var);
                        b4.d(new c0(20), Boolean.valueOf(z27), o0Var);
                        b4.d(new c0(21), Float.valueOf(f18), o0Var);
                        o0Var.g0(true);
                        int i615 = i66;
                        obj5 = obj3;
                        z48 = z28;
                        j15 = j17;
                        list10 = list8;
                        z49 = z27;
                        lVar5 = lVar4;
                        list11 = list6;
                        i36 = i615;
                        f22 = f19;
                        f24 = f18;
                    } else {
                        if (i24 != 0) {
                            z19 = false;
                        } else {
                            z19 = z17;
                        }
                        if (i19 != 0) {
                            o4.d0.f128823b.getClass();
                            j16 = o4.d0.f128824c;
                        } else {
                            j16 = j8;
                        }
                        if (i26 != 0) {
                            z18 = false;
                        }
                        if (i28 != 0) {
                            list4 = p13.j0.f134944a;
                        }
                        if (i30 != 0) {
                            o4.d0.f128823b.getClass();
                            j15 = o4.d0.f128824c;
                        }
                        if (i35 != 0) {
                            i36 = 0;
                        }
                        if (i38 != 0) {
                            list5 = null;
                        }
                        if (i44 != 0) {
                            f16 = 10.0f;
                        } else {
                            f16 = f14;
                        }
                        if (i46 != 0) {
                            obj2 = null;
                        } else {
                            obj2 = obj;
                        }
                        if (i48 != 0) {
                            z24 = true;
                        } else {
                            z24 = z16;
                        }
                        if (i55 != 0) {
                            f17 = 0.0f;
                        } else {
                            f17 = f15;
                        }
                        aVar = p3.m.f135153a;
                        if (i58 != 0) {
                            o0VarE.C(751006162);
                            objQ2 = o0VarE.q();
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new f0(8);
                                o0VarE.K(objQ2);
                            }
                            lVar2 = (e23.l) objQ2;
                            z25 = false;
                            o0VarE.g0(false);
                        } else {
                            z25 = false;
                            lVar2 = lVar;
                        }
                        x1 x1Var5 = p3.n.f135158a;
                        if (list.isEmpty()) {
                            p2VarI0 = o0VarE.i0();
                            if (p2VarI0 != null) {
                                final int i616 = 1;
                                final boolean z5118 = z18;
                                final List list110 = list5;
                                final long j113 = j16;
                                final List list111 = list4;
                                final float f213 = f16;
                                final Object obj10 = obj2;
                                final boolean z5119 = z24;
                                final float f214 = f17;
                                final boolean z51110 = z19;
                                final e23.l lVar10 = lVar2;
                                p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.g0
                                    @Override // e23.p
                                    public final Object invoke(Object obj11, Object obj12) {
                                        p3.m mVar2 = (p3.m) obj11;
                                        switch (i616) {
                                            case 0:
                                                return PolygonKt.Polygon_qT8xWJw$lambda$18(list, z51110, j113, z5118, list111, j15, i36, list110, f213, obj10, z5119, f214, lVar10, i15, i16, i17, mVar2, ((Integer) obj12).intValue());
                                            default:
                                                return PolygonKt.Polygon_qT8xWJw$lambda$2(list, z51110, j113, z5118, list111, j15, i36, list110, f213, obj10, z5119, f214, lVar10, i15, i16, i17, mVar2, ((Integer) obj12).intValue());
                                        }
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        f18 = f17;
                        z26 = z25;
                        obj3 = obj2;
                        i65 = i36;
                        list6 = list4;
                        f19 = f16;
                        z27 = z24;
                        lVar3 = lVar2;
                        j17 = j15;
                        z28 = z18;
                        list7 = list5;
                        mapApplier = (MapApplier) cVar;
                        o0VarE.C(751012594);
                        boolean zR17 = o0VarE.r(mapApplier) | o0VarE.r(list);
                        if ((i18 & 112) == 32) {
                            z29 = true;
                        } else {
                            z29 = z26;
                        }
                        boolean z51111 = z29 | zR17;
                        if ((i18 & 896) == 256) {
                            z34 = true;
                        } else {
                            z34 = z26;
                        }
                        boolean z51112 = z51111 | z34;
                        if ((i18 & 7168) == 2048) {
                            z35 = true;
                        } else {
                            z35 = z26;
                        }
                        boolean zR18 = z51112 | z35 | o0VarE.r(list6);
                        if ((458752 & i18) == 131072) {
                            z36 = true;
                        } else {
                            z36 = z26;
                        }
                        boolean z51113 = zR18 | z36;
                        if ((3670016 & i18) == 1048576) {
                            z37 = true;
                        } else {
                            z37 = z26;
                        }
                        boolean zR19 = z51113 | z37 | o0VarE.r(list7);
                        if ((234881024 & i18) == 67108864) {
                            z38 = true;
                        } else {
                            z38 = z26;
                        }
                        boolean z6112 = zR19 | z38;
                        if ((i59 & 14) == 4) {
                            z39 = true;
                        } else {
                            z39 = z26;
                        }
                        boolean z6113 = z6112 | z39;
                        if ((i59 & 112) == 32) {
                            z44 = true;
                        } else {
                            z44 = z26;
                        }
                        boolean zR110 = z6113 | z44 | o0VarE.r(obj3);
                        if ((i59 & 896) == 256) {
                            z45 = true;
                        } else {
                            z45 = z26;
                        }
                        z46 = z45 | zR110;
                        objQ = o0VarE.q();
                        if (z46) {
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                final long j212 = j16;
                                list8 = list7;
                                i66 = i65;
                                final boolean z6114 = z19;
                                obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                                    @Override // e23.a
                                    public final Object invoke() {
                                        return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z6114, j212, z28, list6, j17, i66, list8, f19, z27, f18);
                                    }
                                };
                                list9 = list;
                                o0Var = o0VarE;
                                lVar4 = lVar3;
                                j18 = j212;
                                o0Var.K(obj4);
                            } else {
                                obj4 = objQ;
                                o0Var = o0VarE;
                                j18 = j16;
                                lVar4 = lVar3;
                                list9 = list;
                                i66 = i65;
                                list8 = list7;
                            }
                        } else {
                            final long j213 = j16;
                            list8 = list7;
                            i66 = i65;
                            final boolean z6115 = z19;
                            obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                                @Override // e23.a
                                public final Object invoke() {
                                    return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z6115, j213, z28, list6, j17, i66, list8, f19, z27, f18);
                                }
                            };
                            list9 = list;
                            o0Var = o0VarE;
                            lVar4 = lVar3;
                            j18 = j213;
                            o0Var.K(obj4);
                        }
                        aVar2 = (e23.a) obj4;
                        o0Var.g0(false);
                        if (!(cVar instanceof MapApplier)) {
                            p3.p0.l();
                            throw null;
                        }
                        o0Var.H();
                        if (o0Var.T) {
                            o0Var.M(aVar2);
                        } else {
                            o0Var.c();
                        }
                        b4.d(new c0(22), lVar4, o0Var);
                        b4.d(new c0(23), list9, o0Var);
                        b4.d(new c0(13), Boolean.valueOf(z19), o0Var);
                        b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$4
                            @Override // e23.p
                            public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                                m121invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                            public final void m121invoke4WTKRHQ(PolygonNode polygonNode, long j214) {
                                polygonNode.getClass();
                                polygonNode.getPolygon().setFillColor(o4.f0.j(j214));
                            }
                        }, o4.d0.a(j18), o0Var);
                        b4.d(new c0(14), Boolean.valueOf(z28), o0Var);
                        b4.d(new c0(15), list6, o0Var);
                        b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$7
                            @Override // e23.p
                            public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                                m122invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                            public final void m122invoke4WTKRHQ(PolygonNode polygonNode, long j214) {
                                polygonNode.getClass();
                                polygonNode.getPolygon().setStrokeColor(o4.f0.j(j214));
                            }
                        }, o4.d0.a(j17), o0Var);
                        c0Var = new c0(16);
                        z47 = o0Var.T;
                        if (!z47) {
                        }
                        o0Var.K(Integer.valueOf(i66));
                        if (!z47) {
                            o0Var.apply(c0Var, Integer.valueOf(i66));
                        }
                        b4.d(new c0(17), list8, o0Var);
                        b4.d(new c0(18), Float.valueOf(f19), o0Var);
                        b4.d(new c0(19), obj3, o0Var);
                        b4.d(new c0(20), Boolean.valueOf(z27), o0Var);
                        b4.d(new c0(21), Float.valueOf(f18), o0Var);
                        o0Var.g0(true);
                        int i617 = i66;
                        obj5 = obj3;
                        z48 = z28;
                        j15 = j17;
                        list10 = list8;
                        z49 = z27;
                        lVar5 = lVar4;
                        list11 = list6;
                        i36 = i617;
                        f22 = f19;
                        f24 = f18;
                    }
                    p2VarI1 = o0Var.i0();
                    if (p2VarI1 != null) {
                        final int i76 = 0;
                        final boolean z6116 = z19;
                        p2VarI1.f135219d = new e23.p() { // from class: com.google.maps.android.compose.g0
                            @Override // e23.p
                            public final Object invoke(Object obj11, Object obj12) {
                                p3.m mVar2 = (p3.m) obj11;
                                switch (i76) {
                                    case 0:
                                        return PolygonKt.Polygon_qT8xWJw$lambda$18(list, z6116, j18, z48, list11, j15, i36, list10, f22, obj5, z49, f24, lVar5, i15, i16, i17, mVar2, ((Integer) obj12).intValue());
                                    default:
                                        return PolygonKt.Polygon_qT8xWJw$lambda$2(list, z6116, j18, z48, list11, j15, i36, list10, f22, obj5, z49, f24, lVar5, i15, i16, i17, mVar2, ((Integer) obj12).intValue());
                                }
                            }
                        };
                    }
                }
                i18 |= C.ENCODING_PCM_32BIT;
                i48 = i17 & 1024;
                if (i48 != 0) {
                    i49 = i16 | 6;
                } else if ((i16 & 6) == 0) {
                    if (o0VarE.h(z16)) {
                        i54 = 4;
                    } else {
                        i54 = 2;
                    }
                    i49 = i16 | i54;
                } else {
                    i49 = i16;
                }
                i55 = i17 & 2048;
                if (i55 != 0) {
                    i49 |= 48;
                } else if ((i16 & 48) != 0) {
                    if (o0VarE.i(f15)) {
                        i56 = 32;
                    } else {
                        i56 = 16;
                    }
                    i49 |= i56;
                }
                i57 = i49;
                i58 = i17 & 4096;
                if (i58 != 0) {
                    i59 = i57 | 384;
                } else if ((i16 & 384) == 0) {
                    if (o0VarE.r(lVar)) {
                        i64 = 256;
                    } else {
                        i64 = 128;
                    }
                    i59 = i57 | i64;
                } else {
                    i59 = i57;
                }
                if ((i18 & 306783379) != 306783378) {
                    if (i24 != 0) {
                        z19 = false;
                    } else {
                        z19 = z17;
                    }
                    if (i19 != 0) {
                        o4.d0.f128823b.getClass();
                        j16 = o4.d0.f128824c;
                    } else {
                        j16 = j8;
                    }
                    if (i26 != 0) {
                        z18 = false;
                    }
                    if (i28 != 0) {
                        list4 = p13.j0.f134944a;
                    }
                    if (i30 != 0) {
                        o4.d0.f128823b.getClass();
                        j15 = o4.d0.f128824c;
                    }
                    if (i35 != 0) {
                        i36 = 0;
                    }
                    if (i38 != 0) {
                        list5 = null;
                    }
                    if (i44 != 0) {
                        f16 = 10.0f;
                    } else {
                        f16 = f14;
                    }
                    if (i46 != 0) {
                        obj2 = null;
                    } else {
                        obj2 = obj;
                    }
                    if (i48 != 0) {
                        z24 = true;
                    } else {
                        z24 = z16;
                    }
                    if (i55 != 0) {
                        f17 = 0.0f;
                    } else {
                        f17 = f15;
                    }
                    aVar = p3.m.f135153a;
                    if (i58 != 0) {
                        o0VarE.C(751006162);
                        objQ2 = o0VarE.q();
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new f0(8);
                            o0VarE.K(objQ2);
                        }
                        lVar2 = (e23.l) objQ2;
                        z25 = false;
                        o0VarE.g0(false);
                    } else {
                        z25 = false;
                        lVar2 = lVar;
                    }
                    x1 x1Var6 = p3.n.f135158a;
                    if (list.isEmpty()) {
                        p2VarI0 = o0VarE.i0();
                        if (p2VarI0 != null) {
                            final int i618 = 1;
                            final boolean z51114 = z18;
                            final List list112 = list5;
                            final long j114 = j16;
                            final List list113 = list4;
                            final float f215 = f16;
                            final Object obj11 = obj2;
                            final boolean z51115 = z24;
                            final float f216 = f17;
                            final boolean z51116 = z19;
                            final e23.l lVar11 = lVar2;
                            p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.g0
                                @Override // e23.p
                                public final Object invoke(Object obj12, Object obj13) {
                                    p3.m mVar2 = (p3.m) obj12;
                                    switch (i618) {
                                        case 0:
                                            return PolygonKt.Polygon_qT8xWJw$lambda$18(list, z51116, j114, z51114, list113, j15, i36, list112, f215, obj11, z51115, f216, lVar11, i15, i16, i17, mVar2, ((Integer) obj13).intValue());
                                        default:
                                            return PolygonKt.Polygon_qT8xWJw$lambda$2(list, z51116, j114, z51114, list113, j15, i36, list112, f215, obj11, z51115, f216, lVar11, i15, i16, i17, mVar2, ((Integer) obj13).intValue());
                                    }
                                }
                            };
                            return;
                        }
                        return;
                    }
                    f18 = f17;
                    z26 = z25;
                    obj3 = obj2;
                    i65 = i36;
                    list6 = list4;
                    f19 = f16;
                    z27 = z24;
                    lVar3 = lVar2;
                    j17 = j15;
                    z28 = z18;
                    list7 = list5;
                    mapApplier = (MapApplier) cVar;
                    o0VarE.C(751012594);
                    boolean zR111 = o0VarE.r(mapApplier) | o0VarE.r(list);
                    if ((i18 & 112) == 32) {
                        z29 = true;
                    } else {
                        z29 = z26;
                    }
                    boolean z51117 = z29 | zR111;
                    if ((i18 & 896) == 256) {
                        z34 = true;
                    } else {
                        z34 = z26;
                    }
                    boolean z51118 = z51117 | z34;
                    if ((i18 & 7168) == 2048) {
                        z35 = true;
                    } else {
                        z35 = z26;
                    }
                    boolean zR112 = z51118 | z35 | o0VarE.r(list6);
                    if ((458752 & i18) == 131072) {
                        z36 = true;
                    } else {
                        z36 = z26;
                    }
                    boolean z51119 = zR112 | z36;
                    if ((3670016 & i18) == 1048576) {
                        z37 = true;
                    } else {
                        z37 = z26;
                    }
                    boolean zR113 = z51119 | z37 | o0VarE.r(list7);
                    if ((234881024 & i18) == 67108864) {
                        z38 = true;
                    } else {
                        z38 = z26;
                    }
                    boolean z6117 = zR113 | z38;
                    if ((i59 & 14) == 4) {
                        z39 = true;
                    } else {
                        z39 = z26;
                    }
                    boolean z6118 = z6117 | z39;
                    if ((i59 & 112) == 32) {
                        z44 = true;
                    } else {
                        z44 = z26;
                    }
                    boolean zR114 = z6118 | z44 | o0VarE.r(obj3);
                    if ((i59 & 896) == 256) {
                        z45 = true;
                    } else {
                        z45 = z26;
                    }
                    z46 = z45 | zR114;
                    objQ = o0VarE.q();
                    if (z46) {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            final long j214 = j16;
                            list8 = list7;
                            i66 = i65;
                            final boolean z6119 = z19;
                            obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                                @Override // e23.a
                                public final Object invoke() {
                                    return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z6119, j214, z28, list6, j17, i66, list8, f19, z27, f18);
                                }
                            };
                            list9 = list;
                            o0Var = o0VarE;
                            lVar4 = lVar3;
                            j18 = j214;
                            o0Var.K(obj4);
                        } else {
                            obj4 = objQ;
                            o0Var = o0VarE;
                            j18 = j16;
                            lVar4 = lVar3;
                            list9 = list;
                            i66 = i65;
                            list8 = list7;
                        }
                    } else {
                        final long j215 = j16;
                        list8 = list7;
                        i66 = i65;
                        final boolean z61110 = z19;
                        obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                            @Override // e23.a
                            public final Object invoke() {
                                return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z61110, j215, z28, list6, j17, i66, list8, f19, z27, f18);
                            }
                        };
                        list9 = list;
                        o0Var = o0VarE;
                        lVar4 = lVar3;
                        j18 = j215;
                        o0Var.K(obj4);
                    }
                    aVar2 = (e23.a) obj4;
                    o0Var.g0(false);
                    if (!(cVar instanceof MapApplier)) {
                        p3.p0.l();
                        throw null;
                    }
                    o0Var.H();
                    if (o0Var.T) {
                        o0Var.M(aVar2);
                    } else {
                        o0Var.c();
                    }
                    b4.d(new c0(22), lVar4, o0Var);
                    b4.d(new c0(23), list9, o0Var);
                    b4.d(new c0(13), Boolean.valueOf(z19), o0Var);
                    b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$4
                        @Override // e23.p
                        public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                            m121invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                        public final void m121invoke4WTKRHQ(PolygonNode polygonNode, long j216) {
                            polygonNode.getClass();
                            polygonNode.getPolygon().setFillColor(o4.f0.j(j216));
                        }
                    }, o4.d0.a(j18), o0Var);
                    b4.d(new c0(14), Boolean.valueOf(z28), o0Var);
                    b4.d(new c0(15), list6, o0Var);
                    b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$7
                        @Override // e23.p
                        public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                            m122invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                        public final void m122invoke4WTKRHQ(PolygonNode polygonNode, long j216) {
                            polygonNode.getClass();
                            polygonNode.getPolygon().setStrokeColor(o4.f0.j(j216));
                        }
                    }, o4.d0.a(j17), o0Var);
                    c0Var = new c0(16);
                    z47 = o0Var.T;
                    if (!z47) {
                    }
                    o0Var.K(Integer.valueOf(i66));
                    if (!z47) {
                        o0Var.apply(c0Var, Integer.valueOf(i66));
                    }
                    b4.d(new c0(17), list8, o0Var);
                    b4.d(new c0(18), Float.valueOf(f19), o0Var);
                    b4.d(new c0(19), obj3, o0Var);
                    b4.d(new c0(20), Boolean.valueOf(z27), o0Var);
                    b4.d(new c0(21), Float.valueOf(f18), o0Var);
                    o0Var.g0(true);
                    int i619 = i66;
                    obj5 = obj3;
                    z48 = z28;
                    j15 = j17;
                    list10 = list8;
                    z49 = z27;
                    lVar5 = lVar4;
                    list11 = list6;
                    i36 = i619;
                    f22 = f19;
                    f24 = f18;
                } else {
                    if (i24 != 0) {
                        z19 = false;
                    } else {
                        z19 = z17;
                    }
                    if (i19 != 0) {
                        o4.d0.f128823b.getClass();
                        j16 = o4.d0.f128824c;
                    } else {
                        j16 = j8;
                    }
                    if (i26 != 0) {
                        z18 = false;
                    }
                    if (i28 != 0) {
                        list4 = p13.j0.f134944a;
                    }
                    if (i30 != 0) {
                        o4.d0.f128823b.getClass();
                        j15 = o4.d0.f128824c;
                    }
                    if (i35 != 0) {
                        i36 = 0;
                    }
                    if (i38 != 0) {
                        list5 = null;
                    }
                    if (i44 != 0) {
                        f16 = 10.0f;
                    } else {
                        f16 = f14;
                    }
                    if (i46 != 0) {
                        obj2 = null;
                    } else {
                        obj2 = obj;
                    }
                    if (i48 != 0) {
                        z24 = true;
                    } else {
                        z24 = z16;
                    }
                    if (i55 != 0) {
                        f17 = 0.0f;
                    } else {
                        f17 = f15;
                    }
                    aVar = p3.m.f135153a;
                    if (i58 != 0) {
                        o0VarE.C(751006162);
                        objQ2 = o0VarE.q();
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new f0(8);
                            o0VarE.K(objQ2);
                        }
                        lVar2 = (e23.l) objQ2;
                        z25 = false;
                        o0VarE.g0(false);
                    } else {
                        z25 = false;
                        lVar2 = lVar;
                    }
                    x1 x1Var7 = p3.n.f135158a;
                    if (list.isEmpty()) {
                        p2VarI0 = o0VarE.i0();
                        if (p2VarI0 != null) {
                            final int i6110 = 1;
                            final boolean z511110 = z18;
                            final List list114 = list5;
                            final long j115 = j16;
                            final List list115 = list4;
                            final float f217 = f16;
                            final Object obj12 = obj2;
                            final boolean z511111 = z24;
                            final float f218 = f17;
                            final boolean z511112 = z19;
                            final e23.l lVar12 = lVar2;
                            p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.g0
                                @Override // e23.p
                                public final Object invoke(Object obj13, Object obj14) {
                                    p3.m mVar2 = (p3.m) obj13;
                                    switch (i6110) {
                                        case 0:
                                            return PolygonKt.Polygon_qT8xWJw$lambda$18(list, z511112, j115, z511110, list115, j15, i36, list114, f217, obj12, z511111, f218, lVar12, i15, i16, i17, mVar2, ((Integer) obj14).intValue());
                                        default:
                                            return PolygonKt.Polygon_qT8xWJw$lambda$2(list, z511112, j115, z511110, list115, j15, i36, list114, f217, obj12, z511111, f218, lVar12, i15, i16, i17, mVar2, ((Integer) obj14).intValue());
                                    }
                                }
                            };
                            return;
                        }
                        return;
                    }
                    f18 = f17;
                    z26 = z25;
                    obj3 = obj2;
                    i65 = i36;
                    list6 = list4;
                    f19 = f16;
                    z27 = z24;
                    lVar3 = lVar2;
                    j17 = j15;
                    z28 = z18;
                    list7 = list5;
                    mapApplier = (MapApplier) cVar;
                    o0VarE.C(751012594);
                    boolean zR115 = o0VarE.r(mapApplier) | o0VarE.r(list);
                    if ((i18 & 112) == 32) {
                        z29 = true;
                    } else {
                        z29 = z26;
                    }
                    boolean z511113 = z29 | zR115;
                    if ((i18 & 896) == 256) {
                        z34 = true;
                    } else {
                        z34 = z26;
                    }
                    boolean z511114 = z511113 | z34;
                    if ((i18 & 7168) == 2048) {
                        z35 = true;
                    } else {
                        z35 = z26;
                    }
                    boolean zR116 = z511114 | z35 | o0VarE.r(list6);
                    if ((458752 & i18) == 131072) {
                        z36 = true;
                    } else {
                        z36 = z26;
                    }
                    boolean z511115 = zR116 | z36;
                    if ((3670016 & i18) == 1048576) {
                        z37 = true;
                    } else {
                        z37 = z26;
                    }
                    boolean zR117 = z511115 | z37 | o0VarE.r(list7);
                    if ((234881024 & i18) == 67108864) {
                        z38 = true;
                    } else {
                        z38 = z26;
                    }
                    boolean z61111 = zR117 | z38;
                    if ((i59 & 14) == 4) {
                        z39 = true;
                    } else {
                        z39 = z26;
                    }
                    boolean z61112 = z61111 | z39;
                    if ((i59 & 112) == 32) {
                        z44 = true;
                    } else {
                        z44 = z26;
                    }
                    boolean zR118 = z61112 | z44 | o0VarE.r(obj3);
                    if ((i59 & 896) == 256) {
                        z45 = true;
                    } else {
                        z45 = z26;
                    }
                    z46 = z45 | zR118;
                    objQ = o0VarE.q();
                    if (z46) {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            final long j216 = j16;
                            list8 = list7;
                            i66 = i65;
                            final boolean z61113 = z19;
                            obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                                @Override // e23.a
                                public final Object invoke() {
                                    return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z61113, j216, z28, list6, j17, i66, list8, f19, z27, f18);
                                }
                            };
                            list9 = list;
                            o0Var = o0VarE;
                            lVar4 = lVar3;
                            j18 = j216;
                            o0Var.K(obj4);
                        } else {
                            obj4 = objQ;
                            o0Var = o0VarE;
                            j18 = j16;
                            lVar4 = lVar3;
                            list9 = list;
                            i66 = i65;
                            list8 = list7;
                        }
                    } else {
                        final long j217 = j16;
                        list8 = list7;
                        i66 = i65;
                        final boolean z61114 = z19;
                        obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                            @Override // e23.a
                            public final Object invoke() {
                                return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z61114, j217, z28, list6, j17, i66, list8, f19, z27, f18);
                            }
                        };
                        list9 = list;
                        o0Var = o0VarE;
                        lVar4 = lVar3;
                        j18 = j217;
                        o0Var.K(obj4);
                    }
                    aVar2 = (e23.a) obj4;
                    o0Var.g0(false);
                    if (!(cVar instanceof MapApplier)) {
                        p3.p0.l();
                        throw null;
                    }
                    o0Var.H();
                    if (o0Var.T) {
                        o0Var.M(aVar2);
                    } else {
                        o0Var.c();
                    }
                    b4.d(new c0(22), lVar4, o0Var);
                    b4.d(new c0(23), list9, o0Var);
                    b4.d(new c0(13), Boolean.valueOf(z19), o0Var);
                    b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$4
                        @Override // e23.p
                        public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                            m121invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                        public final void m121invoke4WTKRHQ(PolygonNode polygonNode, long j218) {
                            polygonNode.getClass();
                            polygonNode.getPolygon().setFillColor(o4.f0.j(j218));
                        }
                    }, o4.d0.a(j18), o0Var);
                    b4.d(new c0(14), Boolean.valueOf(z28), o0Var);
                    b4.d(new c0(15), list6, o0Var);
                    b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$7
                        @Override // e23.p
                        public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                            m122invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                        public final void m122invoke4WTKRHQ(PolygonNode polygonNode, long j218) {
                            polygonNode.getClass();
                            polygonNode.getPolygon().setStrokeColor(o4.f0.j(j218));
                        }
                    }, o4.d0.a(j17), o0Var);
                    c0Var = new c0(16);
                    z47 = o0Var.T;
                    if (!z47) {
                    }
                    o0Var.K(Integer.valueOf(i66));
                    if (!z47) {
                        o0Var.apply(c0Var, Integer.valueOf(i66));
                    }
                    b4.d(new c0(17), list8, o0Var);
                    b4.d(new c0(18), Float.valueOf(f19), o0Var);
                    b4.d(new c0(19), obj3, o0Var);
                    b4.d(new c0(20), Boolean.valueOf(z27), o0Var);
                    b4.d(new c0(21), Float.valueOf(f18), o0Var);
                    o0Var.g0(true);
                    int i6111 = i66;
                    obj5 = obj3;
                    z48 = z28;
                    j15 = j17;
                    list10 = list8;
                    z49 = z27;
                    lVar5 = lVar4;
                    list11 = list6;
                    i36 = i6111;
                    f22 = f19;
                    f24 = f18;
                }
                p2VarI1 = o0Var.i0();
                if (p2VarI1 != null) {
                    final int i77 = 0;
                    final boolean z61115 = z19;
                    p2VarI1.f135219d = new e23.p() { // from class: com.google.maps.android.compose.g0
                        @Override // e23.p
                        public final Object invoke(Object obj13, Object obj14) {
                            p3.m mVar2 = (p3.m) obj13;
                            switch (i77) {
                                case 0:
                                    return PolygonKt.Polygon_qT8xWJw$lambda$18(list, z61115, j18, z48, list11, j15, i36, list10, f22, obj5, z49, f24, lVar5, i15, i16, i17, mVar2, ((Integer) obj14).intValue());
                                default:
                                    return PolygonKt.Polygon_qT8xWJw$lambda$2(list, z61115, j18, z48, list11, j15, i36, list10, f22, obj5, z49, f24, lVar5, i15, i16, i17, mVar2, ((Integer) obj14).intValue());
                            }
                        }
                    };
                }
            }
            i18 |= 3072;
            z18 = z15;
            i28 = i17 & 16;
            if (i28 != 0) {
                if ((i15 & 24576) == 0) {
                    list4 = list2;
                    if (o0VarE.r(list4)) {
                        i29 = 16384;
                    } else {
                        i29 = 8192;
                    }
                    i18 |= i29;
                }
                i30 = i17 & 32;
                if (i30 != 0) {
                    i18 |= 196608;
                    j15 = j14;
                } else {
                    j15 = j14;
                    if ((i15 & 196608) == 0) {
                        if (o0VarE.l(j15)) {
                            i34 = 131072;
                        } else {
                            i34 = 65536;
                        }
                        i18 |= i34;
                    }
                }
                i35 = i17 & 64;
                if (i35 != 0) {
                    i18 |= 1572864;
                    i36 = i14;
                } else {
                    i36 = i14;
                    if ((i15 & 1572864) == 0) {
                        if (o0VarE.k(i36)) {
                            i37 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i37 = 524288;
                        }
                        i18 |= i37;
                    }
                }
                i38 = i17 & 128;
                if (i38 != 0) {
                    i18 |= 12582912;
                    list5 = list3;
                } else {
                    list5 = list3;
                    if ((i15 & 12582912) == 0) {
                        if (o0VarE.r(list5)) {
                            i39 = 8388608;
                        } else {
                            i39 = 4194304;
                        }
                        i18 |= i39;
                    }
                }
                i44 = i17 & 256;
                if (i44 != 0) {
                    i18 |= 100663296;
                } else if ((i15 & 100663296) == 0) {
                    if (o0VarE.i(f14)) {
                        i45 = 67108864;
                    } else {
                        i45 = 33554432;
                    }
                    i18 |= i45;
                }
                i46 = i17 & 512;
                if (i46 != 0) {
                    if ((i15 & C.ENCODING_PCM_32BIT) == 0) {
                        if (o0VarE.r(obj)) {
                            i47 = 536870912;
                        } else {
                            i47 = 268435456;
                        }
                        i18 |= i47;
                    }
                    i48 = i17 & 1024;
                    if (i48 != 0) {
                        i49 = i16 | 6;
                    } else if ((i16 & 6) == 0) {
                        if (o0VarE.h(z16)) {
                            i54 = 4;
                        } else {
                            i54 = 2;
                        }
                        i49 = i16 | i54;
                    } else {
                        i49 = i16;
                    }
                    i55 = i17 & 2048;
                    if (i55 != 0) {
                        i49 |= 48;
                    } else if ((i16 & 48) != 0) {
                        if (o0VarE.i(f15)) {
                            i56 = 32;
                        } else {
                            i56 = 16;
                        }
                        i49 |= i56;
                    }
                    i57 = i49;
                    i58 = i17 & 4096;
                    if (i58 != 0) {
                        i59 = i57 | 384;
                    } else if ((i16 & 384) == 0) {
                        if (o0VarE.r(lVar)) {
                            i64 = 256;
                        } else {
                            i64 = 128;
                        }
                        i59 = i57 | i64;
                    } else {
                        i59 = i57;
                    }
                    if ((i18 & 306783379) != 306783378) {
                        if (i24 != 0) {
                            z19 = false;
                        } else {
                            z19 = z17;
                        }
                        if (i19 != 0) {
                            o4.d0.f128823b.getClass();
                            j16 = o4.d0.f128824c;
                        } else {
                            j16 = j8;
                        }
                        if (i26 != 0) {
                            z18 = false;
                        }
                        if (i28 != 0) {
                            list4 = p13.j0.f134944a;
                        }
                        if (i30 != 0) {
                            o4.d0.f128823b.getClass();
                            j15 = o4.d0.f128824c;
                        }
                        if (i35 != 0) {
                            i36 = 0;
                        }
                        if (i38 != 0) {
                            list5 = null;
                        }
                        if (i44 != 0) {
                            f16 = 10.0f;
                        } else {
                            f16 = f14;
                        }
                        if (i46 != 0) {
                            obj2 = null;
                        } else {
                            obj2 = obj;
                        }
                        if (i48 != 0) {
                            z24 = true;
                        } else {
                            z24 = z16;
                        }
                        if (i55 != 0) {
                            f17 = 0.0f;
                        } else {
                            f17 = f15;
                        }
                        aVar = p3.m.f135153a;
                        if (i58 != 0) {
                            o0VarE.C(751006162);
                            objQ2 = o0VarE.q();
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new f0(8);
                                o0VarE.K(objQ2);
                            }
                            lVar2 = (e23.l) objQ2;
                            z25 = false;
                            o0VarE.g0(false);
                        } else {
                            z25 = false;
                            lVar2 = lVar;
                        }
                        x1 x1Var8 = p3.n.f135158a;
                        if (list.isEmpty()) {
                            p2VarI0 = o0VarE.i0();
                            if (p2VarI0 != null) {
                                final int i6112 = 1;
                                final boolean z511116 = z18;
                                final List list116 = list5;
                                final long j116 = j16;
                                final List list117 = list4;
                                final float f219 = f16;
                                final Object obj13 = obj2;
                                final boolean z511117 = z24;
                                final float f2110 = f17;
                                final boolean z511118 = z19;
                                final e23.l lVar13 = lVar2;
                                p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.g0
                                    @Override // e23.p
                                    public final Object invoke(Object obj14, Object obj15) {
                                        p3.m mVar2 = (p3.m) obj14;
                                        switch (i6112) {
                                            case 0:
                                                return PolygonKt.Polygon_qT8xWJw$lambda$18(list, z511118, j116, z511116, list117, j15, i36, list116, f219, obj13, z511117, f2110, lVar13, i15, i16, i17, mVar2, ((Integer) obj15).intValue());
                                            default:
                                                return PolygonKt.Polygon_qT8xWJw$lambda$2(list, z511118, j116, z511116, list117, j15, i36, list116, f219, obj13, z511117, f2110, lVar13, i15, i16, i17, mVar2, ((Integer) obj15).intValue());
                                        }
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        f18 = f17;
                        z26 = z25;
                        obj3 = obj2;
                        i65 = i36;
                        list6 = list4;
                        f19 = f16;
                        z27 = z24;
                        lVar3 = lVar2;
                        j17 = j15;
                        z28 = z18;
                        list7 = list5;
                        mapApplier = (MapApplier) cVar;
                        o0VarE.C(751012594);
                        boolean zR119 = o0VarE.r(mapApplier) | o0VarE.r(list);
                        if ((i18 & 112) == 32) {
                            z29 = true;
                        } else {
                            z29 = z26;
                        }
                        boolean z511119 = z29 | zR119;
                        if ((i18 & 896) == 256) {
                            z34 = true;
                        } else {
                            z34 = z26;
                        }
                        boolean z5111110 = z511119 | z34;
                        if ((i18 & 7168) == 2048) {
                            z35 = true;
                        } else {
                            z35 = z26;
                        }
                        boolean zR1110 = z5111110 | z35 | o0VarE.r(list6);
                        if ((458752 & i18) == 131072) {
                            z36 = true;
                        } else {
                            z36 = z26;
                        }
                        boolean z5111111 = zR1110 | z36;
                        if ((3670016 & i18) == 1048576) {
                            z37 = true;
                        } else {
                            z37 = z26;
                        }
                        boolean zR1111 = z5111111 | z37 | o0VarE.r(list7);
                        if ((234881024 & i18) == 67108864) {
                            z38 = true;
                        } else {
                            z38 = z26;
                        }
                        boolean z61116 = zR1111 | z38;
                        if ((i59 & 14) == 4) {
                            z39 = true;
                        } else {
                            z39 = z26;
                        }
                        boolean z61117 = z61116 | z39;
                        if ((i59 & 112) == 32) {
                            z44 = true;
                        } else {
                            z44 = z26;
                        }
                        boolean zR1112 = z61117 | z44 | o0VarE.r(obj3);
                        if ((i59 & 896) == 256) {
                            z45 = true;
                        } else {
                            z45 = z26;
                        }
                        z46 = z45 | zR1112;
                        objQ = o0VarE.q();
                        if (z46) {
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                final long j218 = j16;
                                list8 = list7;
                                i66 = i65;
                                final boolean z61118 = z19;
                                obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                                    @Override // e23.a
                                    public final Object invoke() {
                                        return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z61118, j218, z28, list6, j17, i66, list8, f19, z27, f18);
                                    }
                                };
                                list9 = list;
                                o0Var = o0VarE;
                                lVar4 = lVar3;
                                j18 = j218;
                                o0Var.K(obj4);
                            } else {
                                obj4 = objQ;
                                o0Var = o0VarE;
                                j18 = j16;
                                lVar4 = lVar3;
                                list9 = list;
                                i66 = i65;
                                list8 = list7;
                            }
                        } else {
                            final long j219 = j16;
                            list8 = list7;
                            i66 = i65;
                            final boolean z61119 = z19;
                            obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                                @Override // e23.a
                                public final Object invoke() {
                                    return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z61119, j219, z28, list6, j17, i66, list8, f19, z27, f18);
                                }
                            };
                            list9 = list;
                            o0Var = o0VarE;
                            lVar4 = lVar3;
                            j18 = j219;
                            o0Var.K(obj4);
                        }
                        aVar2 = (e23.a) obj4;
                        o0Var.g0(false);
                        if (!(cVar instanceof MapApplier)) {
                            p3.p0.l();
                            throw null;
                        }
                        o0Var.H();
                        if (o0Var.T) {
                            o0Var.M(aVar2);
                        } else {
                            o0Var.c();
                        }
                        b4.d(new c0(22), lVar4, o0Var);
                        b4.d(new c0(23), list9, o0Var);
                        b4.d(new c0(13), Boolean.valueOf(z19), o0Var);
                        b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$4
                            @Override // e23.p
                            public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                                m121invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                            public final void m121invoke4WTKRHQ(PolygonNode polygonNode, long j2110) {
                                polygonNode.getClass();
                                polygonNode.getPolygon().setFillColor(o4.f0.j(j2110));
                            }
                        }, o4.d0.a(j18), o0Var);
                        b4.d(new c0(14), Boolean.valueOf(z28), o0Var);
                        b4.d(new c0(15), list6, o0Var);
                        b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$7
                            @Override // e23.p
                            public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                                m122invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                            public final void m122invoke4WTKRHQ(PolygonNode polygonNode, long j2110) {
                                polygonNode.getClass();
                                polygonNode.getPolygon().setStrokeColor(o4.f0.j(j2110));
                            }
                        }, o4.d0.a(j17), o0Var);
                        c0Var = new c0(16);
                        z47 = o0Var.T;
                        if (!z47) {
                        }
                        o0Var.K(Integer.valueOf(i66));
                        if (!z47) {
                            o0Var.apply(c0Var, Integer.valueOf(i66));
                        }
                        b4.d(new c0(17), list8, o0Var);
                        b4.d(new c0(18), Float.valueOf(f19), o0Var);
                        b4.d(new c0(19), obj3, o0Var);
                        b4.d(new c0(20), Boolean.valueOf(z27), o0Var);
                        b4.d(new c0(21), Float.valueOf(f18), o0Var);
                        o0Var.g0(true);
                        int i6113 = i66;
                        obj5 = obj3;
                        z48 = z28;
                        j15 = j17;
                        list10 = list8;
                        z49 = z27;
                        lVar5 = lVar4;
                        list11 = list6;
                        i36 = i6113;
                        f22 = f19;
                        f24 = f18;
                    } else {
                        if (i24 != 0) {
                            z19 = false;
                        } else {
                            z19 = z17;
                        }
                        if (i19 != 0) {
                            o4.d0.f128823b.getClass();
                            j16 = o4.d0.f128824c;
                        } else {
                            j16 = j8;
                        }
                        if (i26 != 0) {
                            z18 = false;
                        }
                        if (i28 != 0) {
                            list4 = p13.j0.f134944a;
                        }
                        if (i30 != 0) {
                            o4.d0.f128823b.getClass();
                            j15 = o4.d0.f128824c;
                        }
                        if (i35 != 0) {
                            i36 = 0;
                        }
                        if (i38 != 0) {
                            list5 = null;
                        }
                        if (i44 != 0) {
                            f16 = 10.0f;
                        } else {
                            f16 = f14;
                        }
                        if (i46 != 0) {
                            obj2 = null;
                        } else {
                            obj2 = obj;
                        }
                        if (i48 != 0) {
                            z24 = true;
                        } else {
                            z24 = z16;
                        }
                        if (i55 != 0) {
                            f17 = 0.0f;
                        } else {
                            f17 = f15;
                        }
                        aVar = p3.m.f135153a;
                        if (i58 != 0) {
                            o0VarE.C(751006162);
                            objQ2 = o0VarE.q();
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new f0(8);
                                o0VarE.K(objQ2);
                            }
                            lVar2 = (e23.l) objQ2;
                            z25 = false;
                            o0VarE.g0(false);
                        } else {
                            z25 = false;
                            lVar2 = lVar;
                        }
                        x1 x1Var9 = p3.n.f135158a;
                        if (list.isEmpty()) {
                            p2VarI0 = o0VarE.i0();
                            if (p2VarI0 != null) {
                                final int i6114 = 1;
                                final boolean z5111112 = z18;
                                final List list118 = list5;
                                final long j117 = j16;
                                final List list119 = list4;
                                final float f2111 = f16;
                                final Object obj14 = obj2;
                                final boolean z5111113 = z24;
                                final float f2112 = f17;
                                final boolean z5111114 = z19;
                                final e23.l lVar14 = lVar2;
                                p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.g0
                                    @Override // e23.p
                                    public final Object invoke(Object obj15, Object obj16) {
                                        p3.m mVar2 = (p3.m) obj15;
                                        switch (i6114) {
                                            case 0:
                                                return PolygonKt.Polygon_qT8xWJw$lambda$18(list, z5111114, j117, z5111112, list119, j15, i36, list118, f2111, obj14, z5111113, f2112, lVar14, i15, i16, i17, mVar2, ((Integer) obj16).intValue());
                                            default:
                                                return PolygonKt.Polygon_qT8xWJw$lambda$2(list, z5111114, j117, z5111112, list119, j15, i36, list118, f2111, obj14, z5111113, f2112, lVar14, i15, i16, i17, mVar2, ((Integer) obj16).intValue());
                                        }
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        f18 = f17;
                        z26 = z25;
                        obj3 = obj2;
                        i65 = i36;
                        list6 = list4;
                        f19 = f16;
                        z27 = z24;
                        lVar3 = lVar2;
                        j17 = j15;
                        z28 = z18;
                        list7 = list5;
                        mapApplier = (MapApplier) cVar;
                        o0VarE.C(751012594);
                        boolean zR1113 = o0VarE.r(mapApplier) | o0VarE.r(list);
                        if ((i18 & 112) == 32) {
                            z29 = true;
                        } else {
                            z29 = z26;
                        }
                        boolean z5111115 = z29 | zR1113;
                        if ((i18 & 896) == 256) {
                            z34 = true;
                        } else {
                            z34 = z26;
                        }
                        boolean z5111116 = z5111115 | z34;
                        if ((i18 & 7168) == 2048) {
                            z35 = true;
                        } else {
                            z35 = z26;
                        }
                        boolean zR1114 = z5111116 | z35 | o0VarE.r(list6);
                        if ((458752 & i18) == 131072) {
                            z36 = true;
                        } else {
                            z36 = z26;
                        }
                        boolean z5111117 = zR1114 | z36;
                        if ((3670016 & i18) == 1048576) {
                            z37 = true;
                        } else {
                            z37 = z26;
                        }
                        boolean zR1115 = z5111117 | z37 | o0VarE.r(list7);
                        if ((234881024 & i18) == 67108864) {
                            z38 = true;
                        } else {
                            z38 = z26;
                        }
                        boolean z611110 = zR1115 | z38;
                        if ((i59 & 14) == 4) {
                            z39 = true;
                        } else {
                            z39 = z26;
                        }
                        boolean z611111 = z611110 | z39;
                        if ((i59 & 112) == 32) {
                            z44 = true;
                        } else {
                            z44 = z26;
                        }
                        boolean zR1116 = z611111 | z44 | o0VarE.r(obj3);
                        if ((i59 & 896) == 256) {
                            z45 = true;
                        } else {
                            z45 = z26;
                        }
                        z46 = z45 | zR1116;
                        objQ = o0VarE.q();
                        if (z46) {
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                final long j2110 = j16;
                                list8 = list7;
                                i66 = i65;
                                final boolean z611112 = z19;
                                obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                                    @Override // e23.a
                                    public final Object invoke() {
                                        return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z611112, j2110, z28, list6, j17, i66, list8, f19, z27, f18);
                                    }
                                };
                                list9 = list;
                                o0Var = o0VarE;
                                lVar4 = lVar3;
                                j18 = j2110;
                                o0Var.K(obj4);
                            } else {
                                obj4 = objQ;
                                o0Var = o0VarE;
                                j18 = j16;
                                lVar4 = lVar3;
                                list9 = list;
                                i66 = i65;
                                list8 = list7;
                            }
                        } else {
                            final long j2111 = j16;
                            list8 = list7;
                            i66 = i65;
                            final boolean z611113 = z19;
                            obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                                @Override // e23.a
                                public final Object invoke() {
                                    return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z611113, j2111, z28, list6, j17, i66, list8, f19, z27, f18);
                                }
                            };
                            list9 = list;
                            o0Var = o0VarE;
                            lVar4 = lVar3;
                            j18 = j2111;
                            o0Var.K(obj4);
                        }
                        aVar2 = (e23.a) obj4;
                        o0Var.g0(false);
                        if (!(cVar instanceof MapApplier)) {
                            p3.p0.l();
                            throw null;
                        }
                        o0Var.H();
                        if (o0Var.T) {
                            o0Var.M(aVar2);
                        } else {
                            o0Var.c();
                        }
                        b4.d(new c0(22), lVar4, o0Var);
                        b4.d(new c0(23), list9, o0Var);
                        b4.d(new c0(13), Boolean.valueOf(z19), o0Var);
                        b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$4
                            @Override // e23.p
                            public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                                m121invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                            public final void m121invoke4WTKRHQ(PolygonNode polygonNode, long j2112) {
                                polygonNode.getClass();
                                polygonNode.getPolygon().setFillColor(o4.f0.j(j2112));
                            }
                        }, o4.d0.a(j18), o0Var);
                        b4.d(new c0(14), Boolean.valueOf(z28), o0Var);
                        b4.d(new c0(15), list6, o0Var);
                        b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$7
                            @Override // e23.p
                            public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                                m122invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                            public final void m122invoke4WTKRHQ(PolygonNode polygonNode, long j2112) {
                                polygonNode.getClass();
                                polygonNode.getPolygon().setStrokeColor(o4.f0.j(j2112));
                            }
                        }, o4.d0.a(j17), o0Var);
                        c0Var = new c0(16);
                        z47 = o0Var.T;
                        if (!z47) {
                        }
                        o0Var.K(Integer.valueOf(i66));
                        if (!z47) {
                            o0Var.apply(c0Var, Integer.valueOf(i66));
                        }
                        b4.d(new c0(17), list8, o0Var);
                        b4.d(new c0(18), Float.valueOf(f19), o0Var);
                        b4.d(new c0(19), obj3, o0Var);
                        b4.d(new c0(20), Boolean.valueOf(z27), o0Var);
                        b4.d(new c0(21), Float.valueOf(f18), o0Var);
                        o0Var.g0(true);
                        int i6115 = i66;
                        obj5 = obj3;
                        z48 = z28;
                        j15 = j17;
                        list10 = list8;
                        z49 = z27;
                        lVar5 = lVar4;
                        list11 = list6;
                        i36 = i6115;
                        f22 = f19;
                        f24 = f18;
                    }
                    p2VarI1 = o0Var.i0();
                    if (p2VarI1 != null) {
                        final int i78 = 0;
                        final boolean z611114 = z19;
                        p2VarI1.f135219d = new e23.p() { // from class: com.google.maps.android.compose.g0
                            @Override // e23.p
                            public final Object invoke(Object obj15, Object obj16) {
                                p3.m mVar2 = (p3.m) obj15;
                                switch (i78) {
                                    case 0:
                                        return PolygonKt.Polygon_qT8xWJw$lambda$18(list, z611114, j18, z48, list11, j15, i36, list10, f22, obj5, z49, f24, lVar5, i15, i16, i17, mVar2, ((Integer) obj16).intValue());
                                    default:
                                        return PolygonKt.Polygon_qT8xWJw$lambda$2(list, z611114, j18, z48, list11, j15, i36, list10, f22, obj5, z49, f24, lVar5, i15, i16, i17, mVar2, ((Integer) obj16).intValue());
                                }
                            }
                        };
                    }
                }
                i18 |= C.ENCODING_PCM_32BIT;
                i48 = i17 & 1024;
                if (i48 != 0) {
                    i49 = i16 | 6;
                } else if ((i16 & 6) == 0) {
                    if (o0VarE.h(z16)) {
                        i54 = 4;
                    } else {
                        i54 = 2;
                    }
                    i49 = i16 | i54;
                } else {
                    i49 = i16;
                }
                i55 = i17 & 2048;
                if (i55 != 0) {
                    i49 |= 48;
                } else if ((i16 & 48) != 0) {
                    if (o0VarE.i(f15)) {
                        i56 = 32;
                    } else {
                        i56 = 16;
                    }
                    i49 |= i56;
                }
                i57 = i49;
                i58 = i17 & 4096;
                if (i58 != 0) {
                    i59 = i57 | 384;
                } else if ((i16 & 384) == 0) {
                    if (o0VarE.r(lVar)) {
                        i64 = 256;
                    } else {
                        i64 = 128;
                    }
                    i59 = i57 | i64;
                } else {
                    i59 = i57;
                }
                if ((i18 & 306783379) != 306783378) {
                    if (i24 != 0) {
                        z19 = false;
                    } else {
                        z19 = z17;
                    }
                    if (i19 != 0) {
                        o4.d0.f128823b.getClass();
                        j16 = o4.d0.f128824c;
                    } else {
                        j16 = j8;
                    }
                    if (i26 != 0) {
                        z18 = false;
                    }
                    if (i28 != 0) {
                        list4 = p13.j0.f134944a;
                    }
                    if (i30 != 0) {
                        o4.d0.f128823b.getClass();
                        j15 = o4.d0.f128824c;
                    }
                    if (i35 != 0) {
                        i36 = 0;
                    }
                    if (i38 != 0) {
                        list5 = null;
                    }
                    if (i44 != 0) {
                        f16 = 10.0f;
                    } else {
                        f16 = f14;
                    }
                    if (i46 != 0) {
                        obj2 = null;
                    } else {
                        obj2 = obj;
                    }
                    if (i48 != 0) {
                        z24 = true;
                    } else {
                        z24 = z16;
                    }
                    if (i55 != 0) {
                        f17 = 0.0f;
                    } else {
                        f17 = f15;
                    }
                    aVar = p3.m.f135153a;
                    if (i58 != 0) {
                        o0VarE.C(751006162);
                        objQ2 = o0VarE.q();
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new f0(8);
                            o0VarE.K(objQ2);
                        }
                        lVar2 = (e23.l) objQ2;
                        z25 = false;
                        o0VarE.g0(false);
                    } else {
                        z25 = false;
                        lVar2 = lVar;
                    }
                    x1 x1Var10 = p3.n.f135158a;
                    if (list.isEmpty()) {
                        p2VarI0 = o0VarE.i0();
                        if (p2VarI0 != null) {
                            final int i6116 = 1;
                            final boolean z5111118 = z18;
                            final List list1110 = list5;
                            final long j118 = j16;
                            final List list1111 = list4;
                            final float f2113 = f16;
                            final Object obj15 = obj2;
                            final boolean z5111119 = z24;
                            final float f2114 = f17;
                            final boolean z51111110 = z19;
                            final e23.l lVar15 = lVar2;
                            p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.g0
                                @Override // e23.p
                                public final Object invoke(Object obj16, Object obj17) {
                                    p3.m mVar2 = (p3.m) obj16;
                                    switch (i6116) {
                                        case 0:
                                            return PolygonKt.Polygon_qT8xWJw$lambda$18(list, z51111110, j118, z5111118, list1111, j15, i36, list1110, f2113, obj15, z5111119, f2114, lVar15, i15, i16, i17, mVar2, ((Integer) obj17).intValue());
                                        default:
                                            return PolygonKt.Polygon_qT8xWJw$lambda$2(list, z51111110, j118, z5111118, list1111, j15, i36, list1110, f2113, obj15, z5111119, f2114, lVar15, i15, i16, i17, mVar2, ((Integer) obj17).intValue());
                                    }
                                }
                            };
                            return;
                        }
                        return;
                    }
                    f18 = f17;
                    z26 = z25;
                    obj3 = obj2;
                    i65 = i36;
                    list6 = list4;
                    f19 = f16;
                    z27 = z24;
                    lVar3 = lVar2;
                    j17 = j15;
                    z28 = z18;
                    list7 = list5;
                    mapApplier = (MapApplier) cVar;
                    o0VarE.C(751012594);
                    boolean zR1117 = o0VarE.r(mapApplier) | o0VarE.r(list);
                    if ((i18 & 112) == 32) {
                        z29 = true;
                    } else {
                        z29 = z26;
                    }
                    boolean z51111111 = z29 | zR1117;
                    if ((i18 & 896) == 256) {
                        z34 = true;
                    } else {
                        z34 = z26;
                    }
                    boolean z51111112 = z51111111 | z34;
                    if ((i18 & 7168) == 2048) {
                        z35 = true;
                    } else {
                        z35 = z26;
                    }
                    boolean zR1118 = z51111112 | z35 | o0VarE.r(list6);
                    if ((458752 & i18) == 131072) {
                        z36 = true;
                    } else {
                        z36 = z26;
                    }
                    boolean z51111113 = zR1118 | z36;
                    if ((3670016 & i18) == 1048576) {
                        z37 = true;
                    } else {
                        z37 = z26;
                    }
                    boolean zR1119 = z51111113 | z37 | o0VarE.r(list7);
                    if ((234881024 & i18) == 67108864) {
                        z38 = true;
                    } else {
                        z38 = z26;
                    }
                    boolean z611115 = zR1119 | z38;
                    if ((i59 & 14) == 4) {
                        z39 = true;
                    } else {
                        z39 = z26;
                    }
                    boolean z611116 = z611115 | z39;
                    if ((i59 & 112) == 32) {
                        z44 = true;
                    } else {
                        z44 = z26;
                    }
                    boolean zR11110 = z611116 | z44 | o0VarE.r(obj3);
                    if ((i59 & 896) == 256) {
                        z45 = true;
                    } else {
                        z45 = z26;
                    }
                    z46 = z45 | zR11110;
                    objQ = o0VarE.q();
                    if (z46) {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            final long j2112 = j16;
                            list8 = list7;
                            i66 = i65;
                            final boolean z611117 = z19;
                            obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                                @Override // e23.a
                                public final Object invoke() {
                                    return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z611117, j2112, z28, list6, j17, i66, list8, f19, z27, f18);
                                }
                            };
                            list9 = list;
                            o0Var = o0VarE;
                            lVar4 = lVar3;
                            j18 = j2112;
                            o0Var.K(obj4);
                        } else {
                            obj4 = objQ;
                            o0Var = o0VarE;
                            j18 = j16;
                            lVar4 = lVar3;
                            list9 = list;
                            i66 = i65;
                            list8 = list7;
                        }
                    } else {
                        final long j2113 = j16;
                        list8 = list7;
                        i66 = i65;
                        final boolean z611118 = z19;
                        obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                            @Override // e23.a
                            public final Object invoke() {
                                return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z611118, j2113, z28, list6, j17, i66, list8, f19, z27, f18);
                            }
                        };
                        list9 = list;
                        o0Var = o0VarE;
                        lVar4 = lVar3;
                        j18 = j2113;
                        o0Var.K(obj4);
                    }
                    aVar2 = (e23.a) obj4;
                    o0Var.g0(false);
                    if (!(cVar instanceof MapApplier)) {
                        p3.p0.l();
                        throw null;
                    }
                    o0Var.H();
                    if (o0Var.T) {
                        o0Var.M(aVar2);
                    } else {
                        o0Var.c();
                    }
                    b4.d(new c0(22), lVar4, o0Var);
                    b4.d(new c0(23), list9, o0Var);
                    b4.d(new c0(13), Boolean.valueOf(z19), o0Var);
                    b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$4
                        @Override // e23.p
                        public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                            m121invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                        public final void m121invoke4WTKRHQ(PolygonNode polygonNode, long j2114) {
                            polygonNode.getClass();
                            polygonNode.getPolygon().setFillColor(o4.f0.j(j2114));
                        }
                    }, o4.d0.a(j18), o0Var);
                    b4.d(new c0(14), Boolean.valueOf(z28), o0Var);
                    b4.d(new c0(15), list6, o0Var);
                    b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$7
                        @Override // e23.p
                        public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                            m122invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                        public final void m122invoke4WTKRHQ(PolygonNode polygonNode, long j2114) {
                            polygonNode.getClass();
                            polygonNode.getPolygon().setStrokeColor(o4.f0.j(j2114));
                        }
                    }, o4.d0.a(j17), o0Var);
                    c0Var = new c0(16);
                    z47 = o0Var.T;
                    if (!z47) {
                    }
                    o0Var.K(Integer.valueOf(i66));
                    if (!z47) {
                        o0Var.apply(c0Var, Integer.valueOf(i66));
                    }
                    b4.d(new c0(17), list8, o0Var);
                    b4.d(new c0(18), Float.valueOf(f19), o0Var);
                    b4.d(new c0(19), obj3, o0Var);
                    b4.d(new c0(20), Boolean.valueOf(z27), o0Var);
                    b4.d(new c0(21), Float.valueOf(f18), o0Var);
                    o0Var.g0(true);
                    int i6117 = i66;
                    obj5 = obj3;
                    z48 = z28;
                    j15 = j17;
                    list10 = list8;
                    z49 = z27;
                    lVar5 = lVar4;
                    list11 = list6;
                    i36 = i6117;
                    f22 = f19;
                    f24 = f18;
                } else {
                    if (i24 != 0) {
                        z19 = false;
                    } else {
                        z19 = z17;
                    }
                    if (i19 != 0) {
                        o4.d0.f128823b.getClass();
                        j16 = o4.d0.f128824c;
                    } else {
                        j16 = j8;
                    }
                    if (i26 != 0) {
                        z18 = false;
                    }
                    if (i28 != 0) {
                        list4 = p13.j0.f134944a;
                    }
                    if (i30 != 0) {
                        o4.d0.f128823b.getClass();
                        j15 = o4.d0.f128824c;
                    }
                    if (i35 != 0) {
                        i36 = 0;
                    }
                    if (i38 != 0) {
                        list5 = null;
                    }
                    if (i44 != 0) {
                        f16 = 10.0f;
                    } else {
                        f16 = f14;
                    }
                    if (i46 != 0) {
                        obj2 = null;
                    } else {
                        obj2 = obj;
                    }
                    if (i48 != 0) {
                        z24 = true;
                    } else {
                        z24 = z16;
                    }
                    if (i55 != 0) {
                        f17 = 0.0f;
                    } else {
                        f17 = f15;
                    }
                    aVar = p3.m.f135153a;
                    if (i58 != 0) {
                        o0VarE.C(751006162);
                        objQ2 = o0VarE.q();
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new f0(8);
                            o0VarE.K(objQ2);
                        }
                        lVar2 = (e23.l) objQ2;
                        z25 = false;
                        o0VarE.g0(false);
                    } else {
                        z25 = false;
                        lVar2 = lVar;
                    }
                    x1 x1Var11 = p3.n.f135158a;
                    if (list.isEmpty()) {
                        p2VarI0 = o0VarE.i0();
                        if (p2VarI0 != null) {
                            final int i6118 = 1;
                            final boolean z51111114 = z18;
                            final List list1112 = list5;
                            final long j119 = j16;
                            final List list1113 = list4;
                            final float f2115 = f16;
                            final Object obj16 = obj2;
                            final boolean z51111115 = z24;
                            final float f2116 = f17;
                            final boolean z51111116 = z19;
                            final e23.l lVar16 = lVar2;
                            p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.g0
                                @Override // e23.p
                                public final Object invoke(Object obj17, Object obj18) {
                                    p3.m mVar2 = (p3.m) obj17;
                                    switch (i6118) {
                                        case 0:
                                            return PolygonKt.Polygon_qT8xWJw$lambda$18(list, z51111116, j119, z51111114, list1113, j15, i36, list1112, f2115, obj16, z51111115, f2116, lVar16, i15, i16, i17, mVar2, ((Integer) obj18).intValue());
                                        default:
                                            return PolygonKt.Polygon_qT8xWJw$lambda$2(list, z51111116, j119, z51111114, list1113, j15, i36, list1112, f2115, obj16, z51111115, f2116, lVar16, i15, i16, i17, mVar2, ((Integer) obj18).intValue());
                                    }
                                }
                            };
                            return;
                        }
                        return;
                    }
                    f18 = f17;
                    z26 = z25;
                    obj3 = obj2;
                    i65 = i36;
                    list6 = list4;
                    f19 = f16;
                    z27 = z24;
                    lVar3 = lVar2;
                    j17 = j15;
                    z28 = z18;
                    list7 = list5;
                    mapApplier = (MapApplier) cVar;
                    o0VarE.C(751012594);
                    boolean zR11111 = o0VarE.r(mapApplier) | o0VarE.r(list);
                    if ((i18 & 112) == 32) {
                        z29 = true;
                    } else {
                        z29 = z26;
                    }
                    boolean z51111117 = z29 | zR11111;
                    if ((i18 & 896) == 256) {
                        z34 = true;
                    } else {
                        z34 = z26;
                    }
                    boolean z51111118 = z51111117 | z34;
                    if ((i18 & 7168) == 2048) {
                        z35 = true;
                    } else {
                        z35 = z26;
                    }
                    boolean zR11112 = z51111118 | z35 | o0VarE.r(list6);
                    if ((458752 & i18) == 131072) {
                        z36 = true;
                    } else {
                        z36 = z26;
                    }
                    boolean z51111119 = zR11112 | z36;
                    if ((3670016 & i18) == 1048576) {
                        z37 = true;
                    } else {
                        z37 = z26;
                    }
                    boolean zR11113 = z51111119 | z37 | o0VarE.r(list7);
                    if ((234881024 & i18) == 67108864) {
                        z38 = true;
                    } else {
                        z38 = z26;
                    }
                    boolean z611119 = zR11113 | z38;
                    if ((i59 & 14) == 4) {
                        z39 = true;
                    } else {
                        z39 = z26;
                    }
                    boolean z6111110 = z611119 | z39;
                    if ((i59 & 112) == 32) {
                        z44 = true;
                    } else {
                        z44 = z26;
                    }
                    boolean zR11114 = z6111110 | z44 | o0VarE.r(obj3);
                    if ((i59 & 896) == 256) {
                        z45 = true;
                    } else {
                        z45 = z26;
                    }
                    z46 = z45 | zR11114;
                    objQ = o0VarE.q();
                    if (z46) {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            final long j2114 = j16;
                            list8 = list7;
                            i66 = i65;
                            final boolean z6111111 = z19;
                            obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                                @Override // e23.a
                                public final Object invoke() {
                                    return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z6111111, j2114, z28, list6, j17, i66, list8, f19, z27, f18);
                                }
                            };
                            list9 = list;
                            o0Var = o0VarE;
                            lVar4 = lVar3;
                            j18 = j2114;
                            o0Var.K(obj4);
                        } else {
                            obj4 = objQ;
                            o0Var = o0VarE;
                            j18 = j16;
                            lVar4 = lVar3;
                            list9 = list;
                            i66 = i65;
                            list8 = list7;
                        }
                    } else {
                        final long j2115 = j16;
                        list8 = list7;
                        i66 = i65;
                        final boolean z6111112 = z19;
                        obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                            @Override // e23.a
                            public final Object invoke() {
                                return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z6111112, j2115, z28, list6, j17, i66, list8, f19, z27, f18);
                            }
                        };
                        list9 = list;
                        o0Var = o0VarE;
                        lVar4 = lVar3;
                        j18 = j2115;
                        o0Var.K(obj4);
                    }
                    aVar2 = (e23.a) obj4;
                    o0Var.g0(false);
                    if (!(cVar instanceof MapApplier)) {
                        p3.p0.l();
                        throw null;
                    }
                    o0Var.H();
                    if (o0Var.T) {
                        o0Var.M(aVar2);
                    } else {
                        o0Var.c();
                    }
                    b4.d(new c0(22), lVar4, o0Var);
                    b4.d(new c0(23), list9, o0Var);
                    b4.d(new c0(13), Boolean.valueOf(z19), o0Var);
                    b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$4
                        @Override // e23.p
                        public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                            m121invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                        public final void m121invoke4WTKRHQ(PolygonNode polygonNode, long j2116) {
                            polygonNode.getClass();
                            polygonNode.getPolygon().setFillColor(o4.f0.j(j2116));
                        }
                    }, o4.d0.a(j18), o0Var);
                    b4.d(new c0(14), Boolean.valueOf(z28), o0Var);
                    b4.d(new c0(15), list6, o0Var);
                    b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$7
                        @Override // e23.p
                        public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                            m122invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                        public final void m122invoke4WTKRHQ(PolygonNode polygonNode, long j2116) {
                            polygonNode.getClass();
                            polygonNode.getPolygon().setStrokeColor(o4.f0.j(j2116));
                        }
                    }, o4.d0.a(j17), o0Var);
                    c0Var = new c0(16);
                    z47 = o0Var.T;
                    if (!z47) {
                    }
                    o0Var.K(Integer.valueOf(i66));
                    if (!z47) {
                        o0Var.apply(c0Var, Integer.valueOf(i66));
                    }
                    b4.d(new c0(17), list8, o0Var);
                    b4.d(new c0(18), Float.valueOf(f19), o0Var);
                    b4.d(new c0(19), obj3, o0Var);
                    b4.d(new c0(20), Boolean.valueOf(z27), o0Var);
                    b4.d(new c0(21), Float.valueOf(f18), o0Var);
                    o0Var.g0(true);
                    int i6119 = i66;
                    obj5 = obj3;
                    z48 = z28;
                    j15 = j17;
                    list10 = list8;
                    z49 = z27;
                    lVar5 = lVar4;
                    list11 = list6;
                    i36 = i6119;
                    f22 = f19;
                    f24 = f18;
                }
                p2VarI1 = o0Var.i0();
                if (p2VarI1 != null) {
                    final int i79 = 0;
                    final boolean z6111113 = z19;
                    p2VarI1.f135219d = new e23.p() { // from class: com.google.maps.android.compose.g0
                        @Override // e23.p
                        public final Object invoke(Object obj17, Object obj18) {
                            p3.m mVar2 = (p3.m) obj17;
                            switch (i79) {
                                case 0:
                                    return PolygonKt.Polygon_qT8xWJw$lambda$18(list, z6111113, j18, z48, list11, j15, i36, list10, f22, obj5, z49, f24, lVar5, i15, i16, i17, mVar2, ((Integer) obj18).intValue());
                                default:
                                    return PolygonKt.Polygon_qT8xWJw$lambda$2(list, z6111113, j18, z48, list11, j15, i36, list10, f22, obj5, z49, f24, lVar5, i15, i16, i17, mVar2, ((Integer) obj18).intValue());
                            }
                        }
                    };
                }
            }
            i18 |= 24576;
            list4 = list2;
            i30 = i17 & 32;
            if (i30 != 0) {
                i18 |= 196608;
                j15 = j14;
            } else {
                j15 = j14;
                if ((i15 & 196608) == 0) {
                    if (o0VarE.l(j15)) {
                        i34 = 131072;
                    } else {
                        i34 = 65536;
                    }
                    i18 |= i34;
                }
            }
            i35 = i17 & 64;
            if (i35 != 0) {
                i18 |= 1572864;
                i36 = i14;
            } else {
                i36 = i14;
                if ((i15 & 1572864) == 0) {
                    if (o0VarE.k(i36)) {
                        i37 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i37 = 524288;
                    }
                    i18 |= i37;
                }
            }
            i38 = i17 & 128;
            if (i38 != 0) {
                i18 |= 12582912;
                list5 = list3;
            } else {
                list5 = list3;
                if ((i15 & 12582912) == 0) {
                    if (o0VarE.r(list5)) {
                        i39 = 8388608;
                    } else {
                        i39 = 4194304;
                    }
                    i18 |= i39;
                }
            }
            i44 = i17 & 256;
            if (i44 != 0) {
                i18 |= 100663296;
            } else if ((i15 & 100663296) == 0) {
                if (o0VarE.i(f14)) {
                    i45 = 67108864;
                } else {
                    i45 = 33554432;
                }
                i18 |= i45;
            }
            i46 = i17 & 512;
            if (i46 != 0) {
                if ((i15 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.r(obj)) {
                        i47 = 536870912;
                    } else {
                        i47 = 268435456;
                    }
                    i18 |= i47;
                }
                i48 = i17 & 1024;
                if (i48 != 0) {
                    i49 = i16 | 6;
                } else if ((i16 & 6) == 0) {
                    if (o0VarE.h(z16)) {
                        i54 = 4;
                    } else {
                        i54 = 2;
                    }
                    i49 = i16 | i54;
                } else {
                    i49 = i16;
                }
                i55 = i17 & 2048;
                if (i55 != 0) {
                    i49 |= 48;
                } else if ((i16 & 48) != 0) {
                    if (o0VarE.i(f15)) {
                        i56 = 32;
                    } else {
                        i56 = 16;
                    }
                    i49 |= i56;
                }
                i57 = i49;
                i58 = i17 & 4096;
                if (i58 != 0) {
                    i59 = i57 | 384;
                } else if ((i16 & 384) == 0) {
                    if (o0VarE.r(lVar)) {
                        i64 = 256;
                    } else {
                        i64 = 128;
                    }
                    i59 = i57 | i64;
                } else {
                    i59 = i57;
                }
                if ((i18 & 306783379) != 306783378) {
                    if (i24 != 0) {
                        z19 = false;
                    } else {
                        z19 = z17;
                    }
                    if (i19 != 0) {
                        o4.d0.f128823b.getClass();
                        j16 = o4.d0.f128824c;
                    } else {
                        j16 = j8;
                    }
                    if (i26 != 0) {
                        z18 = false;
                    }
                    if (i28 != 0) {
                        list4 = p13.j0.f134944a;
                    }
                    if (i30 != 0) {
                        o4.d0.f128823b.getClass();
                        j15 = o4.d0.f128824c;
                    }
                    if (i35 != 0) {
                        i36 = 0;
                    }
                    if (i38 != 0) {
                        list5 = null;
                    }
                    if (i44 != 0) {
                        f16 = 10.0f;
                    } else {
                        f16 = f14;
                    }
                    if (i46 != 0) {
                        obj2 = null;
                    } else {
                        obj2 = obj;
                    }
                    if (i48 != 0) {
                        z24 = true;
                    } else {
                        z24 = z16;
                    }
                    if (i55 != 0) {
                        f17 = 0.0f;
                    } else {
                        f17 = f15;
                    }
                    aVar = p3.m.f135153a;
                    if (i58 != 0) {
                        o0VarE.C(751006162);
                        objQ2 = o0VarE.q();
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new f0(8);
                            o0VarE.K(objQ2);
                        }
                        lVar2 = (e23.l) objQ2;
                        z25 = false;
                        o0VarE.g0(false);
                    } else {
                        z25 = false;
                        lVar2 = lVar;
                    }
                    x1 x1Var12 = p3.n.f135158a;
                    if (list.isEmpty()) {
                        p2VarI0 = o0VarE.i0();
                        if (p2VarI0 != null) {
                            final int i61110 = 1;
                            final boolean z511111110 = z18;
                            final List list1114 = list5;
                            final long j1110 = j16;
                            final List list1115 = list4;
                            final float f2117 = f16;
                            final Object obj17 = obj2;
                            final boolean z511111111 = z24;
                            final float f2118 = f17;
                            final boolean z511111112 = z19;
                            final e23.l lVar17 = lVar2;
                            p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.g0
                                @Override // e23.p
                                public final Object invoke(Object obj18, Object obj19) {
                                    p3.m mVar2 = (p3.m) obj18;
                                    switch (i61110) {
                                        case 0:
                                            return PolygonKt.Polygon_qT8xWJw$lambda$18(list, z511111112, j1110, z511111110, list1115, j15, i36, list1114, f2117, obj17, z511111111, f2118, lVar17, i15, i16, i17, mVar2, ((Integer) obj19).intValue());
                                        default:
                                            return PolygonKt.Polygon_qT8xWJw$lambda$2(list, z511111112, j1110, z511111110, list1115, j15, i36, list1114, f2117, obj17, z511111111, f2118, lVar17, i15, i16, i17, mVar2, ((Integer) obj19).intValue());
                                    }
                                }
                            };
                            return;
                        }
                        return;
                    }
                    f18 = f17;
                    z26 = z25;
                    obj3 = obj2;
                    i65 = i36;
                    list6 = list4;
                    f19 = f16;
                    z27 = z24;
                    lVar3 = lVar2;
                    j17 = j15;
                    z28 = z18;
                    list7 = list5;
                    mapApplier = (MapApplier) cVar;
                    o0VarE.C(751012594);
                    boolean zR11115 = o0VarE.r(mapApplier) | o0VarE.r(list);
                    if ((i18 & 112) == 32) {
                        z29 = true;
                    } else {
                        z29 = z26;
                    }
                    boolean z511111113 = z29 | zR11115;
                    if ((i18 & 896) == 256) {
                        z34 = true;
                    } else {
                        z34 = z26;
                    }
                    boolean z511111114 = z511111113 | z34;
                    if ((i18 & 7168) == 2048) {
                        z35 = true;
                    } else {
                        z35 = z26;
                    }
                    boolean zR11116 = z511111114 | z35 | o0VarE.r(list6);
                    if ((458752 & i18) == 131072) {
                        z36 = true;
                    } else {
                        z36 = z26;
                    }
                    boolean z511111115 = zR11116 | z36;
                    if ((3670016 & i18) == 1048576) {
                        z37 = true;
                    } else {
                        z37 = z26;
                    }
                    boolean zR11117 = z511111115 | z37 | o0VarE.r(list7);
                    if ((234881024 & i18) == 67108864) {
                        z38 = true;
                    } else {
                        z38 = z26;
                    }
                    boolean z6111114 = zR11117 | z38;
                    if ((i59 & 14) == 4) {
                        z39 = true;
                    } else {
                        z39 = z26;
                    }
                    boolean z6111115 = z6111114 | z39;
                    if ((i59 & 112) == 32) {
                        z44 = true;
                    } else {
                        z44 = z26;
                    }
                    boolean zR11118 = z6111115 | z44 | o0VarE.r(obj3);
                    if ((i59 & 896) == 256) {
                        z45 = true;
                    } else {
                        z45 = z26;
                    }
                    z46 = z45 | zR11118;
                    objQ = o0VarE.q();
                    if (z46) {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            final long j2116 = j16;
                            list8 = list7;
                            i66 = i65;
                            final boolean z6111116 = z19;
                            obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                                @Override // e23.a
                                public final Object invoke() {
                                    return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z6111116, j2116, z28, list6, j17, i66, list8, f19, z27, f18);
                                }
                            };
                            list9 = list;
                            o0Var = o0VarE;
                            lVar4 = lVar3;
                            j18 = j2116;
                            o0Var.K(obj4);
                        } else {
                            obj4 = objQ;
                            o0Var = o0VarE;
                            j18 = j16;
                            lVar4 = lVar3;
                            list9 = list;
                            i66 = i65;
                            list8 = list7;
                        }
                    } else {
                        final long j2117 = j16;
                        list8 = list7;
                        i66 = i65;
                        final boolean z6111117 = z19;
                        obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                            @Override // e23.a
                            public final Object invoke() {
                                return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z6111117, j2117, z28, list6, j17, i66, list8, f19, z27, f18);
                            }
                        };
                        list9 = list;
                        o0Var = o0VarE;
                        lVar4 = lVar3;
                        j18 = j2117;
                        o0Var.K(obj4);
                    }
                    aVar2 = (e23.a) obj4;
                    o0Var.g0(false);
                    if (!(cVar instanceof MapApplier)) {
                        p3.p0.l();
                        throw null;
                    }
                    o0Var.H();
                    if (o0Var.T) {
                        o0Var.M(aVar2);
                    } else {
                        o0Var.c();
                    }
                    b4.d(new c0(22), lVar4, o0Var);
                    b4.d(new c0(23), list9, o0Var);
                    b4.d(new c0(13), Boolean.valueOf(z19), o0Var);
                    b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$4
                        @Override // e23.p
                        public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                            m121invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                        public final void m121invoke4WTKRHQ(PolygonNode polygonNode, long j2118) {
                            polygonNode.getClass();
                            polygonNode.getPolygon().setFillColor(o4.f0.j(j2118));
                        }
                    }, o4.d0.a(j18), o0Var);
                    b4.d(new c0(14), Boolean.valueOf(z28), o0Var);
                    b4.d(new c0(15), list6, o0Var);
                    b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$7
                        @Override // e23.p
                        public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                            m122invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                        public final void m122invoke4WTKRHQ(PolygonNode polygonNode, long j2118) {
                            polygonNode.getClass();
                            polygonNode.getPolygon().setStrokeColor(o4.f0.j(j2118));
                        }
                    }, o4.d0.a(j17), o0Var);
                    c0Var = new c0(16);
                    z47 = o0Var.T;
                    if (!z47) {
                    }
                    o0Var.K(Integer.valueOf(i66));
                    if (!z47) {
                        o0Var.apply(c0Var, Integer.valueOf(i66));
                    }
                    b4.d(new c0(17), list8, o0Var);
                    b4.d(new c0(18), Float.valueOf(f19), o0Var);
                    b4.d(new c0(19), obj3, o0Var);
                    b4.d(new c0(20), Boolean.valueOf(z27), o0Var);
                    b4.d(new c0(21), Float.valueOf(f18), o0Var);
                    o0Var.g0(true);
                    int i61111 = i66;
                    obj5 = obj3;
                    z48 = z28;
                    j15 = j17;
                    list10 = list8;
                    z49 = z27;
                    lVar5 = lVar4;
                    list11 = list6;
                    i36 = i61111;
                    f22 = f19;
                    f24 = f18;
                } else {
                    if (i24 != 0) {
                        z19 = false;
                    } else {
                        z19 = z17;
                    }
                    if (i19 != 0) {
                        o4.d0.f128823b.getClass();
                        j16 = o4.d0.f128824c;
                    } else {
                        j16 = j8;
                    }
                    if (i26 != 0) {
                        z18 = false;
                    }
                    if (i28 != 0) {
                        list4 = p13.j0.f134944a;
                    }
                    if (i30 != 0) {
                        o4.d0.f128823b.getClass();
                        j15 = o4.d0.f128824c;
                    }
                    if (i35 != 0) {
                        i36 = 0;
                    }
                    if (i38 != 0) {
                        list5 = null;
                    }
                    if (i44 != 0) {
                        f16 = 10.0f;
                    } else {
                        f16 = f14;
                    }
                    if (i46 != 0) {
                        obj2 = null;
                    } else {
                        obj2 = obj;
                    }
                    if (i48 != 0) {
                        z24 = true;
                    } else {
                        z24 = z16;
                    }
                    if (i55 != 0) {
                        f17 = 0.0f;
                    } else {
                        f17 = f15;
                    }
                    aVar = p3.m.f135153a;
                    if (i58 != 0) {
                        o0VarE.C(751006162);
                        objQ2 = o0VarE.q();
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new f0(8);
                            o0VarE.K(objQ2);
                        }
                        lVar2 = (e23.l) objQ2;
                        z25 = false;
                        o0VarE.g0(false);
                    } else {
                        z25 = false;
                        lVar2 = lVar;
                    }
                    x1 x1Var13 = p3.n.f135158a;
                    if (list.isEmpty()) {
                        p2VarI0 = o0VarE.i0();
                        if (p2VarI0 != null) {
                            final int i61112 = 1;
                            final boolean z511111116 = z18;
                            final List list1116 = list5;
                            final long j1111 = j16;
                            final List list1117 = list4;
                            final float f2119 = f16;
                            final Object obj18 = obj2;
                            final boolean z511111117 = z24;
                            final float f21110 = f17;
                            final boolean z511111118 = z19;
                            final e23.l lVar18 = lVar2;
                            p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.g0
                                @Override // e23.p
                                public final Object invoke(Object obj19, Object obj110) {
                                    p3.m mVar2 = (p3.m) obj19;
                                    switch (i61112) {
                                        case 0:
                                            return PolygonKt.Polygon_qT8xWJw$lambda$18(list, z511111118, j1111, z511111116, list1117, j15, i36, list1116, f2119, obj18, z511111117, f21110, lVar18, i15, i16, i17, mVar2, ((Integer) obj110).intValue());
                                        default:
                                            return PolygonKt.Polygon_qT8xWJw$lambda$2(list, z511111118, j1111, z511111116, list1117, j15, i36, list1116, f2119, obj18, z511111117, f21110, lVar18, i15, i16, i17, mVar2, ((Integer) obj110).intValue());
                                    }
                                }
                            };
                            return;
                        }
                        return;
                    }
                    f18 = f17;
                    z26 = z25;
                    obj3 = obj2;
                    i65 = i36;
                    list6 = list4;
                    f19 = f16;
                    z27 = z24;
                    lVar3 = lVar2;
                    j17 = j15;
                    z28 = z18;
                    list7 = list5;
                    mapApplier = (MapApplier) cVar;
                    o0VarE.C(751012594);
                    boolean zR11119 = o0VarE.r(mapApplier) | o0VarE.r(list);
                    if ((i18 & 112) == 32) {
                        z29 = true;
                    } else {
                        z29 = z26;
                    }
                    boolean z511111119 = z29 | zR11119;
                    if ((i18 & 896) == 256) {
                        z34 = true;
                    } else {
                        z34 = z26;
                    }
                    boolean z5111111110 = z511111119 | z34;
                    if ((i18 & 7168) == 2048) {
                        z35 = true;
                    } else {
                        z35 = z26;
                    }
                    boolean zR111110 = z5111111110 | z35 | o0VarE.r(list6);
                    if ((458752 & i18) == 131072) {
                        z36 = true;
                    } else {
                        z36 = z26;
                    }
                    boolean z5111111111 = zR111110 | z36;
                    if ((3670016 & i18) == 1048576) {
                        z37 = true;
                    } else {
                        z37 = z26;
                    }
                    boolean zR111111 = z5111111111 | z37 | o0VarE.r(list7);
                    if ((234881024 & i18) == 67108864) {
                        z38 = true;
                    } else {
                        z38 = z26;
                    }
                    boolean z6111118 = zR111111 | z38;
                    if ((i59 & 14) == 4) {
                        z39 = true;
                    } else {
                        z39 = z26;
                    }
                    boolean z6111119 = z6111118 | z39;
                    if ((i59 & 112) == 32) {
                        z44 = true;
                    } else {
                        z44 = z26;
                    }
                    boolean zR111112 = z6111119 | z44 | o0VarE.r(obj3);
                    if ((i59 & 896) == 256) {
                        z45 = true;
                    } else {
                        z45 = z26;
                    }
                    z46 = z45 | zR111112;
                    objQ = o0VarE.q();
                    if (z46) {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            final long j2118 = j16;
                            list8 = list7;
                            i66 = i65;
                            final boolean z61111110 = z19;
                            obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                                @Override // e23.a
                                public final Object invoke() {
                                    return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z61111110, j2118, z28, list6, j17, i66, list8, f19, z27, f18);
                                }
                            };
                            list9 = list;
                            o0Var = o0VarE;
                            lVar4 = lVar3;
                            j18 = j2118;
                            o0Var.K(obj4);
                        } else {
                            obj4 = objQ;
                            o0Var = o0VarE;
                            j18 = j16;
                            lVar4 = lVar3;
                            list9 = list;
                            i66 = i65;
                            list8 = list7;
                        }
                    } else {
                        final long j2119 = j16;
                        list8 = list7;
                        i66 = i65;
                        final boolean z61111111 = z19;
                        obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                            @Override // e23.a
                            public final Object invoke() {
                                return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z61111111, j2119, z28, list6, j17, i66, list8, f19, z27, f18);
                            }
                        };
                        list9 = list;
                        o0Var = o0VarE;
                        lVar4 = lVar3;
                        j18 = j2119;
                        o0Var.K(obj4);
                    }
                    aVar2 = (e23.a) obj4;
                    o0Var.g0(false);
                    if (!(cVar instanceof MapApplier)) {
                        p3.p0.l();
                        throw null;
                    }
                    o0Var.H();
                    if (o0Var.T) {
                        o0Var.M(aVar2);
                    } else {
                        o0Var.c();
                    }
                    b4.d(new c0(22), lVar4, o0Var);
                    b4.d(new c0(23), list9, o0Var);
                    b4.d(new c0(13), Boolean.valueOf(z19), o0Var);
                    b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$4
                        @Override // e23.p
                        public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                            m121invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                        public final void m121invoke4WTKRHQ(PolygonNode polygonNode, long j21110) {
                            polygonNode.getClass();
                            polygonNode.getPolygon().setFillColor(o4.f0.j(j21110));
                        }
                    }, o4.d0.a(j18), o0Var);
                    b4.d(new c0(14), Boolean.valueOf(z28), o0Var);
                    b4.d(new c0(15), list6, o0Var);
                    b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$7
                        @Override // e23.p
                        public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                            m122invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                        public final void m122invoke4WTKRHQ(PolygonNode polygonNode, long j21110) {
                            polygonNode.getClass();
                            polygonNode.getPolygon().setStrokeColor(o4.f0.j(j21110));
                        }
                    }, o4.d0.a(j17), o0Var);
                    c0Var = new c0(16);
                    z47 = o0Var.T;
                    if (!z47) {
                    }
                    o0Var.K(Integer.valueOf(i66));
                    if (!z47) {
                        o0Var.apply(c0Var, Integer.valueOf(i66));
                    }
                    b4.d(new c0(17), list8, o0Var);
                    b4.d(new c0(18), Float.valueOf(f19), o0Var);
                    b4.d(new c0(19), obj3, o0Var);
                    b4.d(new c0(20), Boolean.valueOf(z27), o0Var);
                    b4.d(new c0(21), Float.valueOf(f18), o0Var);
                    o0Var.g0(true);
                    int i61113 = i66;
                    obj5 = obj3;
                    z48 = z28;
                    j15 = j17;
                    list10 = list8;
                    z49 = z27;
                    lVar5 = lVar4;
                    list11 = list6;
                    i36 = i61113;
                    f22 = f19;
                    f24 = f18;
                }
                p2VarI1 = o0Var.i0();
                if (p2VarI1 != null) {
                    final int i710 = 0;
                    final boolean z61111112 = z19;
                    p2VarI1.f135219d = new e23.p() { // from class: com.google.maps.android.compose.g0
                        @Override // e23.p
                        public final Object invoke(Object obj19, Object obj110) {
                            p3.m mVar2 = (p3.m) obj19;
                            switch (i710) {
                                case 0:
                                    return PolygonKt.Polygon_qT8xWJw$lambda$18(list, z61111112, j18, z48, list11, j15, i36, list10, f22, obj5, z49, f24, lVar5, i15, i16, i17, mVar2, ((Integer) obj110).intValue());
                                default:
                                    return PolygonKt.Polygon_qT8xWJw$lambda$2(list, z61111112, j18, z48, list11, j15, i36, list10, f22, obj5, z49, f24, lVar5, i15, i16, i17, mVar2, ((Integer) obj110).intValue());
                            }
                        }
                    };
                }
            }
            i18 |= C.ENCODING_PCM_32BIT;
            i48 = i17 & 1024;
            if (i48 != 0) {
                i49 = i16 | 6;
            } else if ((i16 & 6) == 0) {
                if (o0VarE.h(z16)) {
                    i54 = 4;
                } else {
                    i54 = 2;
                }
                i49 = i16 | i54;
            } else {
                i49 = i16;
            }
            i55 = i17 & 2048;
            if (i55 != 0) {
                i49 |= 48;
            } else if ((i16 & 48) != 0) {
                if (o0VarE.i(f15)) {
                    i56 = 32;
                } else {
                    i56 = 16;
                }
                i49 |= i56;
            }
            i57 = i49;
            i58 = i17 & 4096;
            if (i58 != 0) {
                i59 = i57 | 384;
            } else if ((i16 & 384) == 0) {
                if (o0VarE.r(lVar)) {
                    i64 = 256;
                } else {
                    i64 = 128;
                }
                i59 = i57 | i64;
            } else {
                i59 = i57;
            }
            if ((i18 & 306783379) != 306783378) {
                if (i24 != 0) {
                    z19 = false;
                } else {
                    z19 = z17;
                }
                if (i19 != 0) {
                    o4.d0.f128823b.getClass();
                    j16 = o4.d0.f128824c;
                } else {
                    j16 = j8;
                }
                if (i26 != 0) {
                    z18 = false;
                }
                if (i28 != 0) {
                    list4 = p13.j0.f134944a;
                }
                if (i30 != 0) {
                    o4.d0.f128823b.getClass();
                    j15 = o4.d0.f128824c;
                }
                if (i35 != 0) {
                    i36 = 0;
                }
                if (i38 != 0) {
                    list5 = null;
                }
                if (i44 != 0) {
                    f16 = 10.0f;
                } else {
                    f16 = f14;
                }
                if (i46 != 0) {
                    obj2 = null;
                } else {
                    obj2 = obj;
                }
                if (i48 != 0) {
                    z24 = true;
                } else {
                    z24 = z16;
                }
                if (i55 != 0) {
                    f17 = 0.0f;
                } else {
                    f17 = f15;
                }
                aVar = p3.m.f135153a;
                if (i58 != 0) {
                    o0VarE.C(751006162);
                    objQ2 = o0VarE.q();
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new f0(8);
                        o0VarE.K(objQ2);
                    }
                    lVar2 = (e23.l) objQ2;
                    z25 = false;
                    o0VarE.g0(false);
                } else {
                    z25 = false;
                    lVar2 = lVar;
                }
                x1 x1Var14 = p3.n.f135158a;
                if (list.isEmpty()) {
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        final int i61114 = 1;
                        final boolean z5111111112 = z18;
                        final List list1118 = list5;
                        final long j1112 = j16;
                        final List list1119 = list4;
                        final float f21111 = f16;
                        final Object obj19 = obj2;
                        final boolean z5111111113 = z24;
                        final float f21112 = f17;
                        final boolean z5111111114 = z19;
                        final e23.l lVar19 = lVar2;
                        p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.g0
                            @Override // e23.p
                            public final Object invoke(Object obj110, Object obj111) {
                                p3.m mVar2 = (p3.m) obj110;
                                switch (i61114) {
                                    case 0:
                                        return PolygonKt.Polygon_qT8xWJw$lambda$18(list, z5111111114, j1112, z5111111112, list1119, j15, i36, list1118, f21111, obj19, z5111111113, f21112, lVar19, i15, i16, i17, mVar2, ((Integer) obj111).intValue());
                                    default:
                                        return PolygonKt.Polygon_qT8xWJw$lambda$2(list, z5111111114, j1112, z5111111112, list1119, j15, i36, list1118, f21111, obj19, z5111111113, f21112, lVar19, i15, i16, i17, mVar2, ((Integer) obj111).intValue());
                                }
                            }
                        };
                        return;
                    }
                    return;
                }
                f18 = f17;
                z26 = z25;
                obj3 = obj2;
                i65 = i36;
                list6 = list4;
                f19 = f16;
                z27 = z24;
                lVar3 = lVar2;
                j17 = j15;
                z28 = z18;
                list7 = list5;
                mapApplier = (MapApplier) cVar;
                o0VarE.C(751012594);
                boolean zR111113 = o0VarE.r(mapApplier) | o0VarE.r(list);
                if ((i18 & 112) == 32) {
                    z29 = true;
                } else {
                    z29 = z26;
                }
                boolean z5111111115 = z29 | zR111113;
                if ((i18 & 896) == 256) {
                    z34 = true;
                } else {
                    z34 = z26;
                }
                boolean z5111111116 = z5111111115 | z34;
                if ((i18 & 7168) == 2048) {
                    z35 = true;
                } else {
                    z35 = z26;
                }
                boolean zR111114 = z5111111116 | z35 | o0VarE.r(list6);
                if ((458752 & i18) == 131072) {
                    z36 = true;
                } else {
                    z36 = z26;
                }
                boolean z5111111117 = zR111114 | z36;
                if ((3670016 & i18) == 1048576) {
                    z37 = true;
                } else {
                    z37 = z26;
                }
                boolean zR111115 = z5111111117 | z37 | o0VarE.r(list7);
                if ((234881024 & i18) == 67108864) {
                    z38 = true;
                } else {
                    z38 = z26;
                }
                boolean z61111113 = zR111115 | z38;
                if ((i59 & 14) == 4) {
                    z39 = true;
                } else {
                    z39 = z26;
                }
                boolean z61111114 = z61111113 | z39;
                if ((i59 & 112) == 32) {
                    z44 = true;
                } else {
                    z44 = z26;
                }
                boolean zR111116 = z61111114 | z44 | o0VarE.r(obj3);
                if ((i59 & 896) == 256) {
                    z45 = true;
                } else {
                    z45 = z26;
                }
                z46 = z45 | zR111116;
                objQ = o0VarE.q();
                if (z46) {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        final long j21110 = j16;
                        list8 = list7;
                        i66 = i65;
                        final boolean z61111115 = z19;
                        obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                            @Override // e23.a
                            public final Object invoke() {
                                return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z61111115, j21110, z28, list6, j17, i66, list8, f19, z27, f18);
                            }
                        };
                        list9 = list;
                        o0Var = o0VarE;
                        lVar4 = lVar3;
                        j18 = j21110;
                        o0Var.K(obj4);
                    } else {
                        obj4 = objQ;
                        o0Var = o0VarE;
                        j18 = j16;
                        lVar4 = lVar3;
                        list9 = list;
                        i66 = i65;
                        list8 = list7;
                    }
                } else {
                    final long j21111 = j16;
                    list8 = list7;
                    i66 = i65;
                    final boolean z61111116 = z19;
                    obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                        @Override // e23.a
                        public final Object invoke() {
                            return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z61111116, j21111, z28, list6, j17, i66, list8, f19, z27, f18);
                        }
                    };
                    list9 = list;
                    o0Var = o0VarE;
                    lVar4 = lVar3;
                    j18 = j21111;
                    o0Var.K(obj4);
                }
                aVar2 = (e23.a) obj4;
                o0Var.g0(false);
                if (!(cVar instanceof MapApplier)) {
                    p3.p0.l();
                    throw null;
                }
                o0Var.H();
                if (o0Var.T) {
                    o0Var.M(aVar2);
                } else {
                    o0Var.c();
                }
                b4.d(new c0(22), lVar4, o0Var);
                b4.d(new c0(23), list9, o0Var);
                b4.d(new c0(13), Boolean.valueOf(z19), o0Var);
                b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$4
                    @Override // e23.p
                    public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                        m121invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                    public final void m121invoke4WTKRHQ(PolygonNode polygonNode, long j21112) {
                        polygonNode.getClass();
                        polygonNode.getPolygon().setFillColor(o4.f0.j(j21112));
                    }
                }, o4.d0.a(j18), o0Var);
                b4.d(new c0(14), Boolean.valueOf(z28), o0Var);
                b4.d(new c0(15), list6, o0Var);
                b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$7
                    @Override // e23.p
                    public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                        m122invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                    public final void m122invoke4WTKRHQ(PolygonNode polygonNode, long j21112) {
                        polygonNode.getClass();
                        polygonNode.getPolygon().setStrokeColor(o4.f0.j(j21112));
                    }
                }, o4.d0.a(j17), o0Var);
                c0Var = new c0(16);
                z47 = o0Var.T;
                if (!z47) {
                }
                o0Var.K(Integer.valueOf(i66));
                if (!z47) {
                    o0Var.apply(c0Var, Integer.valueOf(i66));
                }
                b4.d(new c0(17), list8, o0Var);
                b4.d(new c0(18), Float.valueOf(f19), o0Var);
                b4.d(new c0(19), obj3, o0Var);
                b4.d(new c0(20), Boolean.valueOf(z27), o0Var);
                b4.d(new c0(21), Float.valueOf(f18), o0Var);
                o0Var.g0(true);
                int i61115 = i66;
                obj5 = obj3;
                z48 = z28;
                j15 = j17;
                list10 = list8;
                z49 = z27;
                lVar5 = lVar4;
                list11 = list6;
                i36 = i61115;
                f22 = f19;
                f24 = f18;
            } else {
                if (i24 != 0) {
                    z19 = false;
                } else {
                    z19 = z17;
                }
                if (i19 != 0) {
                    o4.d0.f128823b.getClass();
                    j16 = o4.d0.f128824c;
                } else {
                    j16 = j8;
                }
                if (i26 != 0) {
                    z18 = false;
                }
                if (i28 != 0) {
                    list4 = p13.j0.f134944a;
                }
                if (i30 != 0) {
                    o4.d0.f128823b.getClass();
                    j15 = o4.d0.f128824c;
                }
                if (i35 != 0) {
                    i36 = 0;
                }
                if (i38 != 0) {
                    list5 = null;
                }
                if (i44 != 0) {
                    f16 = 10.0f;
                } else {
                    f16 = f14;
                }
                if (i46 != 0) {
                    obj2 = null;
                } else {
                    obj2 = obj;
                }
                if (i48 != 0) {
                    z24 = true;
                } else {
                    z24 = z16;
                }
                if (i55 != 0) {
                    f17 = 0.0f;
                } else {
                    f17 = f15;
                }
                aVar = p3.m.f135153a;
                if (i58 != 0) {
                    o0VarE.C(751006162);
                    objQ2 = o0VarE.q();
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new f0(8);
                        o0VarE.K(objQ2);
                    }
                    lVar2 = (e23.l) objQ2;
                    z25 = false;
                    o0VarE.g0(false);
                } else {
                    z25 = false;
                    lVar2 = lVar;
                }
                x1 x1Var15 = p3.n.f135158a;
                if (list.isEmpty()) {
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        final int i61116 = 1;
                        final boolean z5111111118 = z18;
                        final List list11110 = list5;
                        final long j1113 = j16;
                        final List list11111 = list4;
                        final float f21113 = f16;
                        final Object obj110 = obj2;
                        final boolean z5111111119 = z24;
                        final float f21114 = f17;
                        final boolean z51111111110 = z19;
                        final e23.l lVar110 = lVar2;
                        p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.g0
                            @Override // e23.p
                            public final Object invoke(Object obj111, Object obj112) {
                                p3.m mVar2 = (p3.m) obj111;
                                switch (i61116) {
                                    case 0:
                                        return PolygonKt.Polygon_qT8xWJw$lambda$18(list, z51111111110, j1113, z5111111118, list11111, j15, i36, list11110, f21113, obj110, z5111111119, f21114, lVar110, i15, i16, i17, mVar2, ((Integer) obj112).intValue());
                                    default:
                                        return PolygonKt.Polygon_qT8xWJw$lambda$2(list, z51111111110, j1113, z5111111118, list11111, j15, i36, list11110, f21113, obj110, z5111111119, f21114, lVar110, i15, i16, i17, mVar2, ((Integer) obj112).intValue());
                                }
                            }
                        };
                        return;
                    }
                    return;
                }
                f18 = f17;
                z26 = z25;
                obj3 = obj2;
                i65 = i36;
                list6 = list4;
                f19 = f16;
                z27 = z24;
                lVar3 = lVar2;
                j17 = j15;
                z28 = z18;
                list7 = list5;
                mapApplier = (MapApplier) cVar;
                o0VarE.C(751012594);
                boolean zR111117 = o0VarE.r(mapApplier) | o0VarE.r(list);
                if ((i18 & 112) == 32) {
                    z29 = true;
                } else {
                    z29 = z26;
                }
                boolean z51111111111 = z29 | zR111117;
                if ((i18 & 896) == 256) {
                    z34 = true;
                } else {
                    z34 = z26;
                }
                boolean z51111111112 = z51111111111 | z34;
                if ((i18 & 7168) == 2048) {
                    z35 = true;
                } else {
                    z35 = z26;
                }
                boolean zR111118 = z51111111112 | z35 | o0VarE.r(list6);
                if ((458752 & i18) == 131072) {
                    z36 = true;
                } else {
                    z36 = z26;
                }
                boolean z51111111113 = zR111118 | z36;
                if ((3670016 & i18) == 1048576) {
                    z37 = true;
                } else {
                    z37 = z26;
                }
                boolean zR111119 = z51111111113 | z37 | o0VarE.r(list7);
                if ((234881024 & i18) == 67108864) {
                    z38 = true;
                } else {
                    z38 = z26;
                }
                boolean z61111117 = zR111119 | z38;
                if ((i59 & 14) == 4) {
                    z39 = true;
                } else {
                    z39 = z26;
                }
                boolean z61111118 = z61111117 | z39;
                if ((i59 & 112) == 32) {
                    z44 = true;
                } else {
                    z44 = z26;
                }
                boolean zR1111110 = z61111118 | z44 | o0VarE.r(obj3);
                if ((i59 & 896) == 256) {
                    z45 = true;
                } else {
                    z45 = z26;
                }
                z46 = z45 | zR1111110;
                objQ = o0VarE.q();
                if (z46) {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        final long j21112 = j16;
                        list8 = list7;
                        i66 = i65;
                        final boolean z61111119 = z19;
                        obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                            @Override // e23.a
                            public final Object invoke() {
                                return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z61111119, j21112, z28, list6, j17, i66, list8, f19, z27, f18);
                            }
                        };
                        list9 = list;
                        o0Var = o0VarE;
                        lVar4 = lVar3;
                        j18 = j21112;
                        o0Var.K(obj4);
                    } else {
                        obj4 = objQ;
                        o0Var = o0VarE;
                        j18 = j16;
                        lVar4 = lVar3;
                        list9 = list;
                        i66 = i65;
                        list8 = list7;
                    }
                } else {
                    final long j21113 = j16;
                    list8 = list7;
                    i66 = i65;
                    final boolean z611111110 = z19;
                    obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                        @Override // e23.a
                        public final Object invoke() {
                            return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z611111110, j21113, z28, list6, j17, i66, list8, f19, z27, f18);
                        }
                    };
                    list9 = list;
                    o0Var = o0VarE;
                    lVar4 = lVar3;
                    j18 = j21113;
                    o0Var.K(obj4);
                }
                aVar2 = (e23.a) obj4;
                o0Var.g0(false);
                if (!(cVar instanceof MapApplier)) {
                    p3.p0.l();
                    throw null;
                }
                o0Var.H();
                if (o0Var.T) {
                    o0Var.M(aVar2);
                } else {
                    o0Var.c();
                }
                b4.d(new c0(22), lVar4, o0Var);
                b4.d(new c0(23), list9, o0Var);
                b4.d(new c0(13), Boolean.valueOf(z19), o0Var);
                b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$4
                    @Override // e23.p
                    public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                        m121invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                    public final void m121invoke4WTKRHQ(PolygonNode polygonNode, long j21114) {
                        polygonNode.getClass();
                        polygonNode.getPolygon().setFillColor(o4.f0.j(j21114));
                    }
                }, o4.d0.a(j18), o0Var);
                b4.d(new c0(14), Boolean.valueOf(z28), o0Var);
                b4.d(new c0(15), list6, o0Var);
                b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$7
                    @Override // e23.p
                    public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                        m122invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                    public final void m122invoke4WTKRHQ(PolygonNode polygonNode, long j21114) {
                        polygonNode.getClass();
                        polygonNode.getPolygon().setStrokeColor(o4.f0.j(j21114));
                    }
                }, o4.d0.a(j17), o0Var);
                c0Var = new c0(16);
                z47 = o0Var.T;
                if (!z47) {
                }
                o0Var.K(Integer.valueOf(i66));
                if (!z47) {
                    o0Var.apply(c0Var, Integer.valueOf(i66));
                }
                b4.d(new c0(17), list8, o0Var);
                b4.d(new c0(18), Float.valueOf(f19), o0Var);
                b4.d(new c0(19), obj3, o0Var);
                b4.d(new c0(20), Boolean.valueOf(z27), o0Var);
                b4.d(new c0(21), Float.valueOf(f18), o0Var);
                o0Var.g0(true);
                int i61117 = i66;
                obj5 = obj3;
                z48 = z28;
                j15 = j17;
                list10 = list8;
                z49 = z27;
                lVar5 = lVar4;
                list11 = list6;
                i36 = i61117;
                f22 = f19;
                f24 = f18;
            }
            p2VarI1 = o0Var.i0();
            if (p2VarI1 != null) {
                final int i711 = 0;
                final boolean z611111111 = z19;
                p2VarI1.f135219d = new e23.p() { // from class: com.google.maps.android.compose.g0
                    @Override // e23.p
                    public final Object invoke(Object obj111, Object obj112) {
                        p3.m mVar2 = (p3.m) obj111;
                        switch (i711) {
                            case 0:
                                return PolygonKt.Polygon_qT8xWJw$lambda$18(list, z611111111, j18, z48, list11, j15, i36, list10, f22, obj5, z49, f24, lVar5, i15, i16, i17, mVar2, ((Integer) obj112).intValue());
                            default:
                                return PolygonKt.Polygon_qT8xWJw$lambda$2(list, z611111111, j18, z48, list11, j15, i36, list10, f22, obj5, z49, f24, lVar5, i15, i16, i17, mVar2, ((Integer) obj112).intValue());
                        }
                    }
                };
            }
        }
        i18 |= 48;
        z17 = z14;
        i19 = i17 & 4;
        if (i19 != 0) {
            i18 |= 384;
            i24 = i67;
        } else {
            i24 = i67;
            if ((i15 & 384) == 0) {
                if (o0VarE.l(j8)) {
                    i25 = 256;
                } else {
                    i25 = 128;
                }
                i18 |= i25;
            }
        }
        i26 = i17 & 8;
        if (i26 != 0) {
            if ((i15 & 3072) == 0) {
                z18 = z15;
                if (o0VarE.h(z18)) {
                    i27 = 2048;
                } else {
                    i27 = 1024;
                }
                i18 |= i27;
            }
            i28 = i17 & 16;
            if (i28 != 0) {
                if ((i15 & 24576) == 0) {
                    list4 = list2;
                    if (o0VarE.r(list4)) {
                        i29 = 16384;
                    } else {
                        i29 = 8192;
                    }
                    i18 |= i29;
                }
                i30 = i17 & 32;
                if (i30 != 0) {
                    i18 |= 196608;
                    j15 = j14;
                } else {
                    j15 = j14;
                    if ((i15 & 196608) == 0) {
                        if (o0VarE.l(j15)) {
                            i34 = 131072;
                        } else {
                            i34 = 65536;
                        }
                        i18 |= i34;
                    }
                }
                i35 = i17 & 64;
                if (i35 != 0) {
                    i18 |= 1572864;
                    i36 = i14;
                } else {
                    i36 = i14;
                    if ((i15 & 1572864) == 0) {
                        if (o0VarE.k(i36)) {
                            i37 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i37 = 524288;
                        }
                        i18 |= i37;
                    }
                }
                i38 = i17 & 128;
                if (i38 != 0) {
                    i18 |= 12582912;
                    list5 = list3;
                } else {
                    list5 = list3;
                    if ((i15 & 12582912) == 0) {
                        if (o0VarE.r(list5)) {
                            i39 = 8388608;
                        } else {
                            i39 = 4194304;
                        }
                        i18 |= i39;
                    }
                }
                i44 = i17 & 256;
                if (i44 != 0) {
                    i18 |= 100663296;
                } else if ((i15 & 100663296) == 0) {
                    if (o0VarE.i(f14)) {
                        i45 = 67108864;
                    } else {
                        i45 = 33554432;
                    }
                    i18 |= i45;
                }
                i46 = i17 & 512;
                if (i46 != 0) {
                    if ((i15 & C.ENCODING_PCM_32BIT) == 0) {
                        if (o0VarE.r(obj)) {
                            i47 = 536870912;
                        } else {
                            i47 = 268435456;
                        }
                        i18 |= i47;
                    }
                    i48 = i17 & 1024;
                    if (i48 != 0) {
                        i49 = i16 | 6;
                    } else if ((i16 & 6) == 0) {
                        if (o0VarE.h(z16)) {
                            i54 = 4;
                        } else {
                            i54 = 2;
                        }
                        i49 = i16 | i54;
                    } else {
                        i49 = i16;
                    }
                    i55 = i17 & 2048;
                    if (i55 != 0) {
                        i49 |= 48;
                    } else if ((i16 & 48) != 0) {
                        if (o0VarE.i(f15)) {
                            i56 = 32;
                        } else {
                            i56 = 16;
                        }
                        i49 |= i56;
                    }
                    i57 = i49;
                    i58 = i17 & 4096;
                    if (i58 != 0) {
                        i59 = i57 | 384;
                    } else if ((i16 & 384) == 0) {
                        if (o0VarE.r(lVar)) {
                            i64 = 256;
                        } else {
                            i64 = 128;
                        }
                        i59 = i57 | i64;
                    } else {
                        i59 = i57;
                    }
                    if ((i18 & 306783379) != 306783378) {
                        if (i24 != 0) {
                            z19 = false;
                        } else {
                            z19 = z17;
                        }
                        if (i19 != 0) {
                            o4.d0.f128823b.getClass();
                            j16 = o4.d0.f128824c;
                        } else {
                            j16 = j8;
                        }
                        if (i26 != 0) {
                            z18 = false;
                        }
                        if (i28 != 0) {
                            list4 = p13.j0.f134944a;
                        }
                        if (i30 != 0) {
                            o4.d0.f128823b.getClass();
                            j15 = o4.d0.f128824c;
                        }
                        if (i35 != 0) {
                            i36 = 0;
                        }
                        if (i38 != 0) {
                            list5 = null;
                        }
                        if (i44 != 0) {
                            f16 = 10.0f;
                        } else {
                            f16 = f14;
                        }
                        if (i46 != 0) {
                            obj2 = null;
                        } else {
                            obj2 = obj;
                        }
                        if (i48 != 0) {
                            z24 = true;
                        } else {
                            z24 = z16;
                        }
                        if (i55 != 0) {
                            f17 = 0.0f;
                        } else {
                            f17 = f15;
                        }
                        aVar = p3.m.f135153a;
                        if (i58 != 0) {
                            o0VarE.C(751006162);
                            objQ2 = o0VarE.q();
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new f0(8);
                                o0VarE.K(objQ2);
                            }
                            lVar2 = (e23.l) objQ2;
                            z25 = false;
                            o0VarE.g0(false);
                        } else {
                            z25 = false;
                            lVar2 = lVar;
                        }
                        x1 x1Var16 = p3.n.f135158a;
                        if (list.isEmpty()) {
                            p2VarI0 = o0VarE.i0();
                            if (p2VarI0 != null) {
                                final int i61118 = 1;
                                final boolean z51111111114 = z18;
                                final List list11112 = list5;
                                final long j1114 = j16;
                                final List list11113 = list4;
                                final float f21115 = f16;
                                final Object obj111 = obj2;
                                final boolean z51111111115 = z24;
                                final float f21116 = f17;
                                final boolean z51111111116 = z19;
                                final e23.l lVar111 = lVar2;
                                p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.g0
                                    @Override // e23.p
                                    public final Object invoke(Object obj112, Object obj113) {
                                        p3.m mVar2 = (p3.m) obj112;
                                        switch (i61118) {
                                            case 0:
                                                return PolygonKt.Polygon_qT8xWJw$lambda$18(list, z51111111116, j1114, z51111111114, list11113, j15, i36, list11112, f21115, obj111, z51111111115, f21116, lVar111, i15, i16, i17, mVar2, ((Integer) obj113).intValue());
                                            default:
                                                return PolygonKt.Polygon_qT8xWJw$lambda$2(list, z51111111116, j1114, z51111111114, list11113, j15, i36, list11112, f21115, obj111, z51111111115, f21116, lVar111, i15, i16, i17, mVar2, ((Integer) obj113).intValue());
                                        }
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        f18 = f17;
                        z26 = z25;
                        obj3 = obj2;
                        i65 = i36;
                        list6 = list4;
                        f19 = f16;
                        z27 = z24;
                        lVar3 = lVar2;
                        j17 = j15;
                        z28 = z18;
                        list7 = list5;
                        mapApplier = (MapApplier) cVar;
                        o0VarE.C(751012594);
                        boolean zR1111111 = o0VarE.r(mapApplier) | o0VarE.r(list);
                        if ((i18 & 112) == 32) {
                            z29 = true;
                        } else {
                            z29 = z26;
                        }
                        boolean z51111111117 = z29 | zR1111111;
                        if ((i18 & 896) == 256) {
                            z34 = true;
                        } else {
                            z34 = z26;
                        }
                        boolean z51111111118 = z51111111117 | z34;
                        if ((i18 & 7168) == 2048) {
                            z35 = true;
                        } else {
                            z35 = z26;
                        }
                        boolean zR1111112 = z51111111118 | z35 | o0VarE.r(list6);
                        if ((458752 & i18) == 131072) {
                            z36 = true;
                        } else {
                            z36 = z26;
                        }
                        boolean z51111111119 = zR1111112 | z36;
                        if ((3670016 & i18) == 1048576) {
                            z37 = true;
                        } else {
                            z37 = z26;
                        }
                        boolean zR1111113 = z51111111119 | z37 | o0VarE.r(list7);
                        if ((234881024 & i18) == 67108864) {
                            z38 = true;
                        } else {
                            z38 = z26;
                        }
                        boolean z611111112 = zR1111113 | z38;
                        if ((i59 & 14) == 4) {
                            z39 = true;
                        } else {
                            z39 = z26;
                        }
                        boolean z611111113 = z611111112 | z39;
                        if ((i59 & 112) == 32) {
                            z44 = true;
                        } else {
                            z44 = z26;
                        }
                        boolean zR1111114 = z611111113 | z44 | o0VarE.r(obj3);
                        if ((i59 & 896) == 256) {
                            z45 = true;
                        } else {
                            z45 = z26;
                        }
                        z46 = z45 | zR1111114;
                        objQ = o0VarE.q();
                        if (z46) {
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                final long j21114 = j16;
                                list8 = list7;
                                i66 = i65;
                                final boolean z611111114 = z19;
                                obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                                    @Override // e23.a
                                    public final Object invoke() {
                                        return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z611111114, j21114, z28, list6, j17, i66, list8, f19, z27, f18);
                                    }
                                };
                                list9 = list;
                                o0Var = o0VarE;
                                lVar4 = lVar3;
                                j18 = j21114;
                                o0Var.K(obj4);
                            } else {
                                obj4 = objQ;
                                o0Var = o0VarE;
                                j18 = j16;
                                lVar4 = lVar3;
                                list9 = list;
                                i66 = i65;
                                list8 = list7;
                            }
                        } else {
                            final long j21115 = j16;
                            list8 = list7;
                            i66 = i65;
                            final boolean z611111115 = z19;
                            obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                                @Override // e23.a
                                public final Object invoke() {
                                    return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z611111115, j21115, z28, list6, j17, i66, list8, f19, z27, f18);
                                }
                            };
                            list9 = list;
                            o0Var = o0VarE;
                            lVar4 = lVar3;
                            j18 = j21115;
                            o0Var.K(obj4);
                        }
                        aVar2 = (e23.a) obj4;
                        o0Var.g0(false);
                        if (!(cVar instanceof MapApplier)) {
                            p3.p0.l();
                            throw null;
                        }
                        o0Var.H();
                        if (o0Var.T) {
                            o0Var.M(aVar2);
                        } else {
                            o0Var.c();
                        }
                        b4.d(new c0(22), lVar4, o0Var);
                        b4.d(new c0(23), list9, o0Var);
                        b4.d(new c0(13), Boolean.valueOf(z19), o0Var);
                        b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$4
                            @Override // e23.p
                            public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                                m121invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                            public final void m121invoke4WTKRHQ(PolygonNode polygonNode, long j21116) {
                                polygonNode.getClass();
                                polygonNode.getPolygon().setFillColor(o4.f0.j(j21116));
                            }
                        }, o4.d0.a(j18), o0Var);
                        b4.d(new c0(14), Boolean.valueOf(z28), o0Var);
                        b4.d(new c0(15), list6, o0Var);
                        b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$7
                            @Override // e23.p
                            public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                                m122invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                            public final void m122invoke4WTKRHQ(PolygonNode polygonNode, long j21116) {
                                polygonNode.getClass();
                                polygonNode.getPolygon().setStrokeColor(o4.f0.j(j21116));
                            }
                        }, o4.d0.a(j17), o0Var);
                        c0Var = new c0(16);
                        z47 = o0Var.T;
                        if (!z47) {
                        }
                        o0Var.K(Integer.valueOf(i66));
                        if (!z47) {
                            o0Var.apply(c0Var, Integer.valueOf(i66));
                        }
                        b4.d(new c0(17), list8, o0Var);
                        b4.d(new c0(18), Float.valueOf(f19), o0Var);
                        b4.d(new c0(19), obj3, o0Var);
                        b4.d(new c0(20), Boolean.valueOf(z27), o0Var);
                        b4.d(new c0(21), Float.valueOf(f18), o0Var);
                        o0Var.g0(true);
                        int i61119 = i66;
                        obj5 = obj3;
                        z48 = z28;
                        j15 = j17;
                        list10 = list8;
                        z49 = z27;
                        lVar5 = lVar4;
                        list11 = list6;
                        i36 = i61119;
                        f22 = f19;
                        f24 = f18;
                    } else {
                        if (i24 != 0) {
                            z19 = false;
                        } else {
                            z19 = z17;
                        }
                        if (i19 != 0) {
                            o4.d0.f128823b.getClass();
                            j16 = o4.d0.f128824c;
                        } else {
                            j16 = j8;
                        }
                        if (i26 != 0) {
                            z18 = false;
                        }
                        if (i28 != 0) {
                            list4 = p13.j0.f134944a;
                        }
                        if (i30 != 0) {
                            o4.d0.f128823b.getClass();
                            j15 = o4.d0.f128824c;
                        }
                        if (i35 != 0) {
                            i36 = 0;
                        }
                        if (i38 != 0) {
                            list5 = null;
                        }
                        if (i44 != 0) {
                            f16 = 10.0f;
                        } else {
                            f16 = f14;
                        }
                        if (i46 != 0) {
                            obj2 = null;
                        } else {
                            obj2 = obj;
                        }
                        if (i48 != 0) {
                            z24 = true;
                        } else {
                            z24 = z16;
                        }
                        if (i55 != 0) {
                            f17 = 0.0f;
                        } else {
                            f17 = f15;
                        }
                        aVar = p3.m.f135153a;
                        if (i58 != 0) {
                            o0VarE.C(751006162);
                            objQ2 = o0VarE.q();
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new f0(8);
                                o0VarE.K(objQ2);
                            }
                            lVar2 = (e23.l) objQ2;
                            z25 = false;
                            o0VarE.g0(false);
                        } else {
                            z25 = false;
                            lVar2 = lVar;
                        }
                        x1 x1Var17 = p3.n.f135158a;
                        if (list.isEmpty()) {
                            p2VarI0 = o0VarE.i0();
                            if (p2VarI0 != null) {
                                final int i611110 = 1;
                                final boolean z511111111110 = z18;
                                final List list11114 = list5;
                                final long j1115 = j16;
                                final List list11115 = list4;
                                final float f21117 = f16;
                                final Object obj112 = obj2;
                                final boolean z511111111111 = z24;
                                final float f21118 = f17;
                                final boolean z511111111112 = z19;
                                final e23.l lVar112 = lVar2;
                                p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.g0
                                    @Override // e23.p
                                    public final Object invoke(Object obj113, Object obj114) {
                                        p3.m mVar2 = (p3.m) obj113;
                                        switch (i611110) {
                                            case 0:
                                                return PolygonKt.Polygon_qT8xWJw$lambda$18(list, z511111111112, j1115, z511111111110, list11115, j15, i36, list11114, f21117, obj112, z511111111111, f21118, lVar112, i15, i16, i17, mVar2, ((Integer) obj114).intValue());
                                            default:
                                                return PolygonKt.Polygon_qT8xWJw$lambda$2(list, z511111111112, j1115, z511111111110, list11115, j15, i36, list11114, f21117, obj112, z511111111111, f21118, lVar112, i15, i16, i17, mVar2, ((Integer) obj114).intValue());
                                        }
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        f18 = f17;
                        z26 = z25;
                        obj3 = obj2;
                        i65 = i36;
                        list6 = list4;
                        f19 = f16;
                        z27 = z24;
                        lVar3 = lVar2;
                        j17 = j15;
                        z28 = z18;
                        list7 = list5;
                        mapApplier = (MapApplier) cVar;
                        o0VarE.C(751012594);
                        boolean zR1111115 = o0VarE.r(mapApplier) | o0VarE.r(list);
                        if ((i18 & 112) == 32) {
                            z29 = true;
                        } else {
                            z29 = z26;
                        }
                        boolean z511111111113 = z29 | zR1111115;
                        if ((i18 & 896) == 256) {
                            z34 = true;
                        } else {
                            z34 = z26;
                        }
                        boolean z511111111114 = z511111111113 | z34;
                        if ((i18 & 7168) == 2048) {
                            z35 = true;
                        } else {
                            z35 = z26;
                        }
                        boolean zR1111116 = z511111111114 | z35 | o0VarE.r(list6);
                        if ((458752 & i18) == 131072) {
                            z36 = true;
                        } else {
                            z36 = z26;
                        }
                        boolean z511111111115 = zR1111116 | z36;
                        if ((3670016 & i18) == 1048576) {
                            z37 = true;
                        } else {
                            z37 = z26;
                        }
                        boolean zR1111117 = z511111111115 | z37 | o0VarE.r(list7);
                        if ((234881024 & i18) == 67108864) {
                            z38 = true;
                        } else {
                            z38 = z26;
                        }
                        boolean z611111116 = zR1111117 | z38;
                        if ((i59 & 14) == 4) {
                            z39 = true;
                        } else {
                            z39 = z26;
                        }
                        boolean z611111117 = z611111116 | z39;
                        if ((i59 & 112) == 32) {
                            z44 = true;
                        } else {
                            z44 = z26;
                        }
                        boolean zR1111118 = z611111117 | z44 | o0VarE.r(obj3);
                        if ((i59 & 896) == 256) {
                            z45 = true;
                        } else {
                            z45 = z26;
                        }
                        z46 = z45 | zR1111118;
                        objQ = o0VarE.q();
                        if (z46) {
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                final long j21116 = j16;
                                list8 = list7;
                                i66 = i65;
                                final boolean z611111118 = z19;
                                obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                                    @Override // e23.a
                                    public final Object invoke() {
                                        return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z611111118, j21116, z28, list6, j17, i66, list8, f19, z27, f18);
                                    }
                                };
                                list9 = list;
                                o0Var = o0VarE;
                                lVar4 = lVar3;
                                j18 = j21116;
                                o0Var.K(obj4);
                            } else {
                                obj4 = objQ;
                                o0Var = o0VarE;
                                j18 = j16;
                                lVar4 = lVar3;
                                list9 = list;
                                i66 = i65;
                                list8 = list7;
                            }
                        } else {
                            final long j21117 = j16;
                            list8 = list7;
                            i66 = i65;
                            final boolean z611111119 = z19;
                            obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                                @Override // e23.a
                                public final Object invoke() {
                                    return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z611111119, j21117, z28, list6, j17, i66, list8, f19, z27, f18);
                                }
                            };
                            list9 = list;
                            o0Var = o0VarE;
                            lVar4 = lVar3;
                            j18 = j21117;
                            o0Var.K(obj4);
                        }
                        aVar2 = (e23.a) obj4;
                        o0Var.g0(false);
                        if (!(cVar instanceof MapApplier)) {
                            p3.p0.l();
                            throw null;
                        }
                        o0Var.H();
                        if (o0Var.T) {
                            o0Var.M(aVar2);
                        } else {
                            o0Var.c();
                        }
                        b4.d(new c0(22), lVar4, o0Var);
                        b4.d(new c0(23), list9, o0Var);
                        b4.d(new c0(13), Boolean.valueOf(z19), o0Var);
                        b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$4
                            @Override // e23.p
                            public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                                m121invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                            public final void m121invoke4WTKRHQ(PolygonNode polygonNode, long j21118) {
                                polygonNode.getClass();
                                polygonNode.getPolygon().setFillColor(o4.f0.j(j21118));
                            }
                        }, o4.d0.a(j18), o0Var);
                        b4.d(new c0(14), Boolean.valueOf(z28), o0Var);
                        b4.d(new c0(15), list6, o0Var);
                        b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$7
                            @Override // e23.p
                            public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                                m122invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                            public final void m122invoke4WTKRHQ(PolygonNode polygonNode, long j21118) {
                                polygonNode.getClass();
                                polygonNode.getPolygon().setStrokeColor(o4.f0.j(j21118));
                            }
                        }, o4.d0.a(j17), o0Var);
                        c0Var = new c0(16);
                        z47 = o0Var.T;
                        if (!z47) {
                        }
                        o0Var.K(Integer.valueOf(i66));
                        if (!z47) {
                            o0Var.apply(c0Var, Integer.valueOf(i66));
                        }
                        b4.d(new c0(17), list8, o0Var);
                        b4.d(new c0(18), Float.valueOf(f19), o0Var);
                        b4.d(new c0(19), obj3, o0Var);
                        b4.d(new c0(20), Boolean.valueOf(z27), o0Var);
                        b4.d(new c0(21), Float.valueOf(f18), o0Var);
                        o0Var.g0(true);
                        int i611111 = i66;
                        obj5 = obj3;
                        z48 = z28;
                        j15 = j17;
                        list10 = list8;
                        z49 = z27;
                        lVar5 = lVar4;
                        list11 = list6;
                        i36 = i611111;
                        f22 = f19;
                        f24 = f18;
                    }
                    p2VarI1 = o0Var.i0();
                    if (p2VarI1 != null) {
                        final int i712 = 0;
                        final boolean z6111111110 = z19;
                        p2VarI1.f135219d = new e23.p() { // from class: com.google.maps.android.compose.g0
                            @Override // e23.p
                            public final Object invoke(Object obj113, Object obj114) {
                                p3.m mVar2 = (p3.m) obj113;
                                switch (i712) {
                                    case 0:
                                        return PolygonKt.Polygon_qT8xWJw$lambda$18(list, z6111111110, j18, z48, list11, j15, i36, list10, f22, obj5, z49, f24, lVar5, i15, i16, i17, mVar2, ((Integer) obj114).intValue());
                                    default:
                                        return PolygonKt.Polygon_qT8xWJw$lambda$2(list, z6111111110, j18, z48, list11, j15, i36, list10, f22, obj5, z49, f24, lVar5, i15, i16, i17, mVar2, ((Integer) obj114).intValue());
                                }
                            }
                        };
                    }
                }
                i18 |= C.ENCODING_PCM_32BIT;
                i48 = i17 & 1024;
                if (i48 != 0) {
                    i49 = i16 | 6;
                } else if ((i16 & 6) == 0) {
                    if (o0VarE.h(z16)) {
                        i54 = 4;
                    } else {
                        i54 = 2;
                    }
                    i49 = i16 | i54;
                } else {
                    i49 = i16;
                }
                i55 = i17 & 2048;
                if (i55 != 0) {
                    i49 |= 48;
                } else if ((i16 & 48) != 0) {
                    if (o0VarE.i(f15)) {
                        i56 = 32;
                    } else {
                        i56 = 16;
                    }
                    i49 |= i56;
                }
                i57 = i49;
                i58 = i17 & 4096;
                if (i58 != 0) {
                    i59 = i57 | 384;
                } else if ((i16 & 384) == 0) {
                    if (o0VarE.r(lVar)) {
                        i64 = 256;
                    } else {
                        i64 = 128;
                    }
                    i59 = i57 | i64;
                } else {
                    i59 = i57;
                }
                if ((i18 & 306783379) != 306783378) {
                    if (i24 != 0) {
                        z19 = false;
                    } else {
                        z19 = z17;
                    }
                    if (i19 != 0) {
                        o4.d0.f128823b.getClass();
                        j16 = o4.d0.f128824c;
                    } else {
                        j16 = j8;
                    }
                    if (i26 != 0) {
                        z18 = false;
                    }
                    if (i28 != 0) {
                        list4 = p13.j0.f134944a;
                    }
                    if (i30 != 0) {
                        o4.d0.f128823b.getClass();
                        j15 = o4.d0.f128824c;
                    }
                    if (i35 != 0) {
                        i36 = 0;
                    }
                    if (i38 != 0) {
                        list5 = null;
                    }
                    if (i44 != 0) {
                        f16 = 10.0f;
                    } else {
                        f16 = f14;
                    }
                    if (i46 != 0) {
                        obj2 = null;
                    } else {
                        obj2 = obj;
                    }
                    if (i48 != 0) {
                        z24 = true;
                    } else {
                        z24 = z16;
                    }
                    if (i55 != 0) {
                        f17 = 0.0f;
                    } else {
                        f17 = f15;
                    }
                    aVar = p3.m.f135153a;
                    if (i58 != 0) {
                        o0VarE.C(751006162);
                        objQ2 = o0VarE.q();
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new f0(8);
                            o0VarE.K(objQ2);
                        }
                        lVar2 = (e23.l) objQ2;
                        z25 = false;
                        o0VarE.g0(false);
                    } else {
                        z25 = false;
                        lVar2 = lVar;
                    }
                    x1 x1Var18 = p3.n.f135158a;
                    if (list.isEmpty()) {
                        p2VarI0 = o0VarE.i0();
                        if (p2VarI0 != null) {
                            final int i611112 = 1;
                            final boolean z511111111116 = z18;
                            final List list11116 = list5;
                            final long j1116 = j16;
                            final List list11117 = list4;
                            final float f21119 = f16;
                            final Object obj113 = obj2;
                            final boolean z511111111117 = z24;
                            final float f211110 = f17;
                            final boolean z511111111118 = z19;
                            final e23.l lVar113 = lVar2;
                            p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.g0
                                @Override // e23.p
                                public final Object invoke(Object obj114, Object obj115) {
                                    p3.m mVar2 = (p3.m) obj114;
                                    switch (i611112) {
                                        case 0:
                                            return PolygonKt.Polygon_qT8xWJw$lambda$18(list, z511111111118, j1116, z511111111116, list11117, j15, i36, list11116, f21119, obj113, z511111111117, f211110, lVar113, i15, i16, i17, mVar2, ((Integer) obj115).intValue());
                                        default:
                                            return PolygonKt.Polygon_qT8xWJw$lambda$2(list, z511111111118, j1116, z511111111116, list11117, j15, i36, list11116, f21119, obj113, z511111111117, f211110, lVar113, i15, i16, i17, mVar2, ((Integer) obj115).intValue());
                                    }
                                }
                            };
                            return;
                        }
                        return;
                    }
                    f18 = f17;
                    z26 = z25;
                    obj3 = obj2;
                    i65 = i36;
                    list6 = list4;
                    f19 = f16;
                    z27 = z24;
                    lVar3 = lVar2;
                    j17 = j15;
                    z28 = z18;
                    list7 = list5;
                    mapApplier = (MapApplier) cVar;
                    o0VarE.C(751012594);
                    boolean zR1111119 = o0VarE.r(mapApplier) | o0VarE.r(list);
                    if ((i18 & 112) == 32) {
                        z29 = true;
                    } else {
                        z29 = z26;
                    }
                    boolean z511111111119 = z29 | zR1111119;
                    if ((i18 & 896) == 256) {
                        z34 = true;
                    } else {
                        z34 = z26;
                    }
                    boolean z5111111111110 = z511111111119 | z34;
                    if ((i18 & 7168) == 2048) {
                        z35 = true;
                    } else {
                        z35 = z26;
                    }
                    boolean zR11111110 = z5111111111110 | z35 | o0VarE.r(list6);
                    if ((458752 & i18) == 131072) {
                        z36 = true;
                    } else {
                        z36 = z26;
                    }
                    boolean z5111111111111 = zR11111110 | z36;
                    if ((3670016 & i18) == 1048576) {
                        z37 = true;
                    } else {
                        z37 = z26;
                    }
                    boolean zR11111111 = z5111111111111 | z37 | o0VarE.r(list7);
                    if ((234881024 & i18) == 67108864) {
                        z38 = true;
                    } else {
                        z38 = z26;
                    }
                    boolean z6111111111 = zR11111111 | z38;
                    if ((i59 & 14) == 4) {
                        z39 = true;
                    } else {
                        z39 = z26;
                    }
                    boolean z6111111112 = z6111111111 | z39;
                    if ((i59 & 112) == 32) {
                        z44 = true;
                    } else {
                        z44 = z26;
                    }
                    boolean zR11111112 = z6111111112 | z44 | o0VarE.r(obj3);
                    if ((i59 & 896) == 256) {
                        z45 = true;
                    } else {
                        z45 = z26;
                    }
                    z46 = z45 | zR11111112;
                    objQ = o0VarE.q();
                    if (z46) {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            final long j21118 = j16;
                            list8 = list7;
                            i66 = i65;
                            final boolean z6111111113 = z19;
                            obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                                @Override // e23.a
                                public final Object invoke() {
                                    return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z6111111113, j21118, z28, list6, j17, i66, list8, f19, z27, f18);
                                }
                            };
                            list9 = list;
                            o0Var = o0VarE;
                            lVar4 = lVar3;
                            j18 = j21118;
                            o0Var.K(obj4);
                        } else {
                            obj4 = objQ;
                            o0Var = o0VarE;
                            j18 = j16;
                            lVar4 = lVar3;
                            list9 = list;
                            i66 = i65;
                            list8 = list7;
                        }
                    } else {
                        final long j21119 = j16;
                        list8 = list7;
                        i66 = i65;
                        final boolean z6111111114 = z19;
                        obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                            @Override // e23.a
                            public final Object invoke() {
                                return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z6111111114, j21119, z28, list6, j17, i66, list8, f19, z27, f18);
                            }
                        };
                        list9 = list;
                        o0Var = o0VarE;
                        lVar4 = lVar3;
                        j18 = j21119;
                        o0Var.K(obj4);
                    }
                    aVar2 = (e23.a) obj4;
                    o0Var.g0(false);
                    if (!(cVar instanceof MapApplier)) {
                        p3.p0.l();
                        throw null;
                    }
                    o0Var.H();
                    if (o0Var.T) {
                        o0Var.M(aVar2);
                    } else {
                        o0Var.c();
                    }
                    b4.d(new c0(22), lVar4, o0Var);
                    b4.d(new c0(23), list9, o0Var);
                    b4.d(new c0(13), Boolean.valueOf(z19), o0Var);
                    b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$4
                        @Override // e23.p
                        public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                            m121invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                        public final void m121invoke4WTKRHQ(PolygonNode polygonNode, long j211110) {
                            polygonNode.getClass();
                            polygonNode.getPolygon().setFillColor(o4.f0.j(j211110));
                        }
                    }, o4.d0.a(j18), o0Var);
                    b4.d(new c0(14), Boolean.valueOf(z28), o0Var);
                    b4.d(new c0(15), list6, o0Var);
                    b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$7
                        @Override // e23.p
                        public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                            m122invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                        public final void m122invoke4WTKRHQ(PolygonNode polygonNode, long j211110) {
                            polygonNode.getClass();
                            polygonNode.getPolygon().setStrokeColor(o4.f0.j(j211110));
                        }
                    }, o4.d0.a(j17), o0Var);
                    c0Var = new c0(16);
                    z47 = o0Var.T;
                    if (!z47) {
                    }
                    o0Var.K(Integer.valueOf(i66));
                    if (!z47) {
                        o0Var.apply(c0Var, Integer.valueOf(i66));
                    }
                    b4.d(new c0(17), list8, o0Var);
                    b4.d(new c0(18), Float.valueOf(f19), o0Var);
                    b4.d(new c0(19), obj3, o0Var);
                    b4.d(new c0(20), Boolean.valueOf(z27), o0Var);
                    b4.d(new c0(21), Float.valueOf(f18), o0Var);
                    o0Var.g0(true);
                    int i611113 = i66;
                    obj5 = obj3;
                    z48 = z28;
                    j15 = j17;
                    list10 = list8;
                    z49 = z27;
                    lVar5 = lVar4;
                    list11 = list6;
                    i36 = i611113;
                    f22 = f19;
                    f24 = f18;
                } else {
                    if (i24 != 0) {
                        z19 = false;
                    } else {
                        z19 = z17;
                    }
                    if (i19 != 0) {
                        o4.d0.f128823b.getClass();
                        j16 = o4.d0.f128824c;
                    } else {
                        j16 = j8;
                    }
                    if (i26 != 0) {
                        z18 = false;
                    }
                    if (i28 != 0) {
                        list4 = p13.j0.f134944a;
                    }
                    if (i30 != 0) {
                        o4.d0.f128823b.getClass();
                        j15 = o4.d0.f128824c;
                    }
                    if (i35 != 0) {
                        i36 = 0;
                    }
                    if (i38 != 0) {
                        list5 = null;
                    }
                    if (i44 != 0) {
                        f16 = 10.0f;
                    } else {
                        f16 = f14;
                    }
                    if (i46 != 0) {
                        obj2 = null;
                    } else {
                        obj2 = obj;
                    }
                    if (i48 != 0) {
                        z24 = true;
                    } else {
                        z24 = z16;
                    }
                    if (i55 != 0) {
                        f17 = 0.0f;
                    } else {
                        f17 = f15;
                    }
                    aVar = p3.m.f135153a;
                    if (i58 != 0) {
                        o0VarE.C(751006162);
                        objQ2 = o0VarE.q();
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new f0(8);
                            o0VarE.K(objQ2);
                        }
                        lVar2 = (e23.l) objQ2;
                        z25 = false;
                        o0VarE.g0(false);
                    } else {
                        z25 = false;
                        lVar2 = lVar;
                    }
                    x1 x1Var19 = p3.n.f135158a;
                    if (list.isEmpty()) {
                        p2VarI0 = o0VarE.i0();
                        if (p2VarI0 != null) {
                            final int i611114 = 1;
                            final boolean z5111111111112 = z18;
                            final List list11118 = list5;
                            final long j1117 = j16;
                            final List list11119 = list4;
                            final float f211111 = f16;
                            final Object obj114 = obj2;
                            final boolean z5111111111113 = z24;
                            final float f211112 = f17;
                            final boolean z5111111111114 = z19;
                            final e23.l lVar114 = lVar2;
                            p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.g0
                                @Override // e23.p
                                public final Object invoke(Object obj115, Object obj116) {
                                    p3.m mVar2 = (p3.m) obj115;
                                    switch (i611114) {
                                        case 0:
                                            return PolygonKt.Polygon_qT8xWJw$lambda$18(list, z5111111111114, j1117, z5111111111112, list11119, j15, i36, list11118, f211111, obj114, z5111111111113, f211112, lVar114, i15, i16, i17, mVar2, ((Integer) obj116).intValue());
                                        default:
                                            return PolygonKt.Polygon_qT8xWJw$lambda$2(list, z5111111111114, j1117, z5111111111112, list11119, j15, i36, list11118, f211111, obj114, z5111111111113, f211112, lVar114, i15, i16, i17, mVar2, ((Integer) obj116).intValue());
                                    }
                                }
                            };
                            return;
                        }
                        return;
                    }
                    f18 = f17;
                    z26 = z25;
                    obj3 = obj2;
                    i65 = i36;
                    list6 = list4;
                    f19 = f16;
                    z27 = z24;
                    lVar3 = lVar2;
                    j17 = j15;
                    z28 = z18;
                    list7 = list5;
                    mapApplier = (MapApplier) cVar;
                    o0VarE.C(751012594);
                    boolean zR11111113 = o0VarE.r(mapApplier) | o0VarE.r(list);
                    if ((i18 & 112) == 32) {
                        z29 = true;
                    } else {
                        z29 = z26;
                    }
                    boolean z5111111111115 = z29 | zR11111113;
                    if ((i18 & 896) == 256) {
                        z34 = true;
                    } else {
                        z34 = z26;
                    }
                    boolean z5111111111116 = z5111111111115 | z34;
                    if ((i18 & 7168) == 2048) {
                        z35 = true;
                    } else {
                        z35 = z26;
                    }
                    boolean zR11111114 = z5111111111116 | z35 | o0VarE.r(list6);
                    if ((458752 & i18) == 131072) {
                        z36 = true;
                    } else {
                        z36 = z26;
                    }
                    boolean z5111111111117 = zR11111114 | z36;
                    if ((3670016 & i18) == 1048576) {
                        z37 = true;
                    } else {
                        z37 = z26;
                    }
                    boolean zR11111115 = z5111111111117 | z37 | o0VarE.r(list7);
                    if ((234881024 & i18) == 67108864) {
                        z38 = true;
                    } else {
                        z38 = z26;
                    }
                    boolean z6111111115 = zR11111115 | z38;
                    if ((i59 & 14) == 4) {
                        z39 = true;
                    } else {
                        z39 = z26;
                    }
                    boolean z6111111116 = z6111111115 | z39;
                    if ((i59 & 112) == 32) {
                        z44 = true;
                    } else {
                        z44 = z26;
                    }
                    boolean zR11111116 = z6111111116 | z44 | o0VarE.r(obj3);
                    if ((i59 & 896) == 256) {
                        z45 = true;
                    } else {
                        z45 = z26;
                    }
                    z46 = z45 | zR11111116;
                    objQ = o0VarE.q();
                    if (z46) {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            final long j211110 = j16;
                            list8 = list7;
                            i66 = i65;
                            final boolean z6111111117 = z19;
                            obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                                @Override // e23.a
                                public final Object invoke() {
                                    return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z6111111117, j211110, z28, list6, j17, i66, list8, f19, z27, f18);
                                }
                            };
                            list9 = list;
                            o0Var = o0VarE;
                            lVar4 = lVar3;
                            j18 = j211110;
                            o0Var.K(obj4);
                        } else {
                            obj4 = objQ;
                            o0Var = o0VarE;
                            j18 = j16;
                            lVar4 = lVar3;
                            list9 = list;
                            i66 = i65;
                            list8 = list7;
                        }
                    } else {
                        final long j211111 = j16;
                        list8 = list7;
                        i66 = i65;
                        final boolean z6111111118 = z19;
                        obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                            @Override // e23.a
                            public final Object invoke() {
                                return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z6111111118, j211111, z28, list6, j17, i66, list8, f19, z27, f18);
                            }
                        };
                        list9 = list;
                        o0Var = o0VarE;
                        lVar4 = lVar3;
                        j18 = j211111;
                        o0Var.K(obj4);
                    }
                    aVar2 = (e23.a) obj4;
                    o0Var.g0(false);
                    if (!(cVar instanceof MapApplier)) {
                        p3.p0.l();
                        throw null;
                    }
                    o0Var.H();
                    if (o0Var.T) {
                        o0Var.M(aVar2);
                    } else {
                        o0Var.c();
                    }
                    b4.d(new c0(22), lVar4, o0Var);
                    b4.d(new c0(23), list9, o0Var);
                    b4.d(new c0(13), Boolean.valueOf(z19), o0Var);
                    b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$4
                        @Override // e23.p
                        public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                            m121invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                        public final void m121invoke4WTKRHQ(PolygonNode polygonNode, long j211112) {
                            polygonNode.getClass();
                            polygonNode.getPolygon().setFillColor(o4.f0.j(j211112));
                        }
                    }, o4.d0.a(j18), o0Var);
                    b4.d(new c0(14), Boolean.valueOf(z28), o0Var);
                    b4.d(new c0(15), list6, o0Var);
                    b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$7
                        @Override // e23.p
                        public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                            m122invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                        public final void m122invoke4WTKRHQ(PolygonNode polygonNode, long j211112) {
                            polygonNode.getClass();
                            polygonNode.getPolygon().setStrokeColor(o4.f0.j(j211112));
                        }
                    }, o4.d0.a(j17), o0Var);
                    c0Var = new c0(16);
                    z47 = o0Var.T;
                    if (!z47) {
                    }
                    o0Var.K(Integer.valueOf(i66));
                    if (!z47) {
                        o0Var.apply(c0Var, Integer.valueOf(i66));
                    }
                    b4.d(new c0(17), list8, o0Var);
                    b4.d(new c0(18), Float.valueOf(f19), o0Var);
                    b4.d(new c0(19), obj3, o0Var);
                    b4.d(new c0(20), Boolean.valueOf(z27), o0Var);
                    b4.d(new c0(21), Float.valueOf(f18), o0Var);
                    o0Var.g0(true);
                    int i611115 = i66;
                    obj5 = obj3;
                    z48 = z28;
                    j15 = j17;
                    list10 = list8;
                    z49 = z27;
                    lVar5 = lVar4;
                    list11 = list6;
                    i36 = i611115;
                    f22 = f19;
                    f24 = f18;
                }
                p2VarI1 = o0Var.i0();
                if (p2VarI1 != null) {
                    final int i713 = 0;
                    final boolean z6111111119 = z19;
                    p2VarI1.f135219d = new e23.p() { // from class: com.google.maps.android.compose.g0
                        @Override // e23.p
                        public final Object invoke(Object obj115, Object obj116) {
                            p3.m mVar2 = (p3.m) obj115;
                            switch (i713) {
                                case 0:
                                    return PolygonKt.Polygon_qT8xWJw$lambda$18(list, z6111111119, j18, z48, list11, j15, i36, list10, f22, obj5, z49, f24, lVar5, i15, i16, i17, mVar2, ((Integer) obj116).intValue());
                                default:
                                    return PolygonKt.Polygon_qT8xWJw$lambda$2(list, z6111111119, j18, z48, list11, j15, i36, list10, f22, obj5, z49, f24, lVar5, i15, i16, i17, mVar2, ((Integer) obj116).intValue());
                            }
                        }
                    };
                }
            }
            i18 |= 24576;
            list4 = list2;
            i30 = i17 & 32;
            if (i30 != 0) {
                i18 |= 196608;
                j15 = j14;
            } else {
                j15 = j14;
                if ((i15 & 196608) == 0) {
                    if (o0VarE.l(j15)) {
                        i34 = 131072;
                    } else {
                        i34 = 65536;
                    }
                    i18 |= i34;
                }
            }
            i35 = i17 & 64;
            if (i35 != 0) {
                i18 |= 1572864;
                i36 = i14;
            } else {
                i36 = i14;
                if ((i15 & 1572864) == 0) {
                    if (o0VarE.k(i36)) {
                        i37 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i37 = 524288;
                    }
                    i18 |= i37;
                }
            }
            i38 = i17 & 128;
            if (i38 != 0) {
                i18 |= 12582912;
                list5 = list3;
            } else {
                list5 = list3;
                if ((i15 & 12582912) == 0) {
                    if (o0VarE.r(list5)) {
                        i39 = 8388608;
                    } else {
                        i39 = 4194304;
                    }
                    i18 |= i39;
                }
            }
            i44 = i17 & 256;
            if (i44 != 0) {
                i18 |= 100663296;
            } else if ((i15 & 100663296) == 0) {
                if (o0VarE.i(f14)) {
                    i45 = 67108864;
                } else {
                    i45 = 33554432;
                }
                i18 |= i45;
            }
            i46 = i17 & 512;
            if (i46 != 0) {
                if ((i15 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.r(obj)) {
                        i47 = 536870912;
                    } else {
                        i47 = 268435456;
                    }
                    i18 |= i47;
                }
                i48 = i17 & 1024;
                if (i48 != 0) {
                    i49 = i16 | 6;
                } else if ((i16 & 6) == 0) {
                    if (o0VarE.h(z16)) {
                        i54 = 4;
                    } else {
                        i54 = 2;
                    }
                    i49 = i16 | i54;
                } else {
                    i49 = i16;
                }
                i55 = i17 & 2048;
                if (i55 != 0) {
                    i49 |= 48;
                } else if ((i16 & 48) != 0) {
                    if (o0VarE.i(f15)) {
                        i56 = 32;
                    } else {
                        i56 = 16;
                    }
                    i49 |= i56;
                }
                i57 = i49;
                i58 = i17 & 4096;
                if (i58 != 0) {
                    i59 = i57 | 384;
                } else if ((i16 & 384) == 0) {
                    if (o0VarE.r(lVar)) {
                        i64 = 256;
                    } else {
                        i64 = 128;
                    }
                    i59 = i57 | i64;
                } else {
                    i59 = i57;
                }
                if ((i18 & 306783379) != 306783378) {
                    if (i24 != 0) {
                        z19 = false;
                    } else {
                        z19 = z17;
                    }
                    if (i19 != 0) {
                        o4.d0.f128823b.getClass();
                        j16 = o4.d0.f128824c;
                    } else {
                        j16 = j8;
                    }
                    if (i26 != 0) {
                        z18 = false;
                    }
                    if (i28 != 0) {
                        list4 = p13.j0.f134944a;
                    }
                    if (i30 != 0) {
                        o4.d0.f128823b.getClass();
                        j15 = o4.d0.f128824c;
                    }
                    if (i35 != 0) {
                        i36 = 0;
                    }
                    if (i38 != 0) {
                        list5 = null;
                    }
                    if (i44 != 0) {
                        f16 = 10.0f;
                    } else {
                        f16 = f14;
                    }
                    if (i46 != 0) {
                        obj2 = null;
                    } else {
                        obj2 = obj;
                    }
                    if (i48 != 0) {
                        z24 = true;
                    } else {
                        z24 = z16;
                    }
                    if (i55 != 0) {
                        f17 = 0.0f;
                    } else {
                        f17 = f15;
                    }
                    aVar = p3.m.f135153a;
                    if (i58 != 0) {
                        o0VarE.C(751006162);
                        objQ2 = o0VarE.q();
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new f0(8);
                            o0VarE.K(objQ2);
                        }
                        lVar2 = (e23.l) objQ2;
                        z25 = false;
                        o0VarE.g0(false);
                    } else {
                        z25 = false;
                        lVar2 = lVar;
                    }
                    x1 x1Var110 = p3.n.f135158a;
                    if (list.isEmpty()) {
                        p2VarI0 = o0VarE.i0();
                        if (p2VarI0 != null) {
                            final int i611116 = 1;
                            final boolean z5111111111118 = z18;
                            final List list111110 = list5;
                            final long j1118 = j16;
                            final List list111111 = list4;
                            final float f211113 = f16;
                            final Object obj115 = obj2;
                            final boolean z5111111111119 = z24;
                            final float f211114 = f17;
                            final boolean z51111111111110 = z19;
                            final e23.l lVar115 = lVar2;
                            p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.g0
                                @Override // e23.p
                                public final Object invoke(Object obj116, Object obj117) {
                                    p3.m mVar2 = (p3.m) obj116;
                                    switch (i611116) {
                                        case 0:
                                            return PolygonKt.Polygon_qT8xWJw$lambda$18(list, z51111111111110, j1118, z5111111111118, list111111, j15, i36, list111110, f211113, obj115, z5111111111119, f211114, lVar115, i15, i16, i17, mVar2, ((Integer) obj117).intValue());
                                        default:
                                            return PolygonKt.Polygon_qT8xWJw$lambda$2(list, z51111111111110, j1118, z5111111111118, list111111, j15, i36, list111110, f211113, obj115, z5111111111119, f211114, lVar115, i15, i16, i17, mVar2, ((Integer) obj117).intValue());
                                    }
                                }
                            };
                            return;
                        }
                        return;
                    }
                    f18 = f17;
                    z26 = z25;
                    obj3 = obj2;
                    i65 = i36;
                    list6 = list4;
                    f19 = f16;
                    z27 = z24;
                    lVar3 = lVar2;
                    j17 = j15;
                    z28 = z18;
                    list7 = list5;
                    mapApplier = (MapApplier) cVar;
                    o0VarE.C(751012594);
                    boolean zR11111117 = o0VarE.r(mapApplier) | o0VarE.r(list);
                    if ((i18 & 112) == 32) {
                        z29 = true;
                    } else {
                        z29 = z26;
                    }
                    boolean z51111111111111 = z29 | zR11111117;
                    if ((i18 & 896) == 256) {
                        z34 = true;
                    } else {
                        z34 = z26;
                    }
                    boolean z51111111111112 = z51111111111111 | z34;
                    if ((i18 & 7168) == 2048) {
                        z35 = true;
                    } else {
                        z35 = z26;
                    }
                    boolean zR11111118 = z51111111111112 | z35 | o0VarE.r(list6);
                    if ((458752 & i18) == 131072) {
                        z36 = true;
                    } else {
                        z36 = z26;
                    }
                    boolean z51111111111113 = zR11111118 | z36;
                    if ((3670016 & i18) == 1048576) {
                        z37 = true;
                    } else {
                        z37 = z26;
                    }
                    boolean zR11111119 = z51111111111113 | z37 | o0VarE.r(list7);
                    if ((234881024 & i18) == 67108864) {
                        z38 = true;
                    } else {
                        z38 = z26;
                    }
                    boolean z61111111110 = zR11111119 | z38;
                    if ((i59 & 14) == 4) {
                        z39 = true;
                    } else {
                        z39 = z26;
                    }
                    boolean z61111111111 = z61111111110 | z39;
                    if ((i59 & 112) == 32) {
                        z44 = true;
                    } else {
                        z44 = z26;
                    }
                    boolean zR111111110 = z61111111111 | z44 | o0VarE.r(obj3);
                    if ((i59 & 896) == 256) {
                        z45 = true;
                    } else {
                        z45 = z26;
                    }
                    z46 = z45 | zR111111110;
                    objQ = o0VarE.q();
                    if (z46) {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            final long j211112 = j16;
                            list8 = list7;
                            i66 = i65;
                            final boolean z61111111112 = z19;
                            obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                                @Override // e23.a
                                public final Object invoke() {
                                    return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z61111111112, j211112, z28, list6, j17, i66, list8, f19, z27, f18);
                                }
                            };
                            list9 = list;
                            o0Var = o0VarE;
                            lVar4 = lVar3;
                            j18 = j211112;
                            o0Var.K(obj4);
                        } else {
                            obj4 = objQ;
                            o0Var = o0VarE;
                            j18 = j16;
                            lVar4 = lVar3;
                            list9 = list;
                            i66 = i65;
                            list8 = list7;
                        }
                    } else {
                        final long j211113 = j16;
                        list8 = list7;
                        i66 = i65;
                        final boolean z61111111113 = z19;
                        obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                            @Override // e23.a
                            public final Object invoke() {
                                return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z61111111113, j211113, z28, list6, j17, i66, list8, f19, z27, f18);
                            }
                        };
                        list9 = list;
                        o0Var = o0VarE;
                        lVar4 = lVar3;
                        j18 = j211113;
                        o0Var.K(obj4);
                    }
                    aVar2 = (e23.a) obj4;
                    o0Var.g0(false);
                    if (!(cVar instanceof MapApplier)) {
                        p3.p0.l();
                        throw null;
                    }
                    o0Var.H();
                    if (o0Var.T) {
                        o0Var.M(aVar2);
                    } else {
                        o0Var.c();
                    }
                    b4.d(new c0(22), lVar4, o0Var);
                    b4.d(new c0(23), list9, o0Var);
                    b4.d(new c0(13), Boolean.valueOf(z19), o0Var);
                    b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$4
                        @Override // e23.p
                        public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                            m121invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                        public final void m121invoke4WTKRHQ(PolygonNode polygonNode, long j211114) {
                            polygonNode.getClass();
                            polygonNode.getPolygon().setFillColor(o4.f0.j(j211114));
                        }
                    }, o4.d0.a(j18), o0Var);
                    b4.d(new c0(14), Boolean.valueOf(z28), o0Var);
                    b4.d(new c0(15), list6, o0Var);
                    b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$7
                        @Override // e23.p
                        public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                            m122invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                        public final void m122invoke4WTKRHQ(PolygonNode polygonNode, long j211114) {
                            polygonNode.getClass();
                            polygonNode.getPolygon().setStrokeColor(o4.f0.j(j211114));
                        }
                    }, o4.d0.a(j17), o0Var);
                    c0Var = new c0(16);
                    z47 = o0Var.T;
                    if (!z47) {
                    }
                    o0Var.K(Integer.valueOf(i66));
                    if (!z47) {
                        o0Var.apply(c0Var, Integer.valueOf(i66));
                    }
                    b4.d(new c0(17), list8, o0Var);
                    b4.d(new c0(18), Float.valueOf(f19), o0Var);
                    b4.d(new c0(19), obj3, o0Var);
                    b4.d(new c0(20), Boolean.valueOf(z27), o0Var);
                    b4.d(new c0(21), Float.valueOf(f18), o0Var);
                    o0Var.g0(true);
                    int i611117 = i66;
                    obj5 = obj3;
                    z48 = z28;
                    j15 = j17;
                    list10 = list8;
                    z49 = z27;
                    lVar5 = lVar4;
                    list11 = list6;
                    i36 = i611117;
                    f22 = f19;
                    f24 = f18;
                } else {
                    if (i24 != 0) {
                        z19 = false;
                    } else {
                        z19 = z17;
                    }
                    if (i19 != 0) {
                        o4.d0.f128823b.getClass();
                        j16 = o4.d0.f128824c;
                    } else {
                        j16 = j8;
                    }
                    if (i26 != 0) {
                        z18 = false;
                    }
                    if (i28 != 0) {
                        list4 = p13.j0.f134944a;
                    }
                    if (i30 != 0) {
                        o4.d0.f128823b.getClass();
                        j15 = o4.d0.f128824c;
                    }
                    if (i35 != 0) {
                        i36 = 0;
                    }
                    if (i38 != 0) {
                        list5 = null;
                    }
                    if (i44 != 0) {
                        f16 = 10.0f;
                    } else {
                        f16 = f14;
                    }
                    if (i46 != 0) {
                        obj2 = null;
                    } else {
                        obj2 = obj;
                    }
                    if (i48 != 0) {
                        z24 = true;
                    } else {
                        z24 = z16;
                    }
                    if (i55 != 0) {
                        f17 = 0.0f;
                    } else {
                        f17 = f15;
                    }
                    aVar = p3.m.f135153a;
                    if (i58 != 0) {
                        o0VarE.C(751006162);
                        objQ2 = o0VarE.q();
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new f0(8);
                            o0VarE.K(objQ2);
                        }
                        lVar2 = (e23.l) objQ2;
                        z25 = false;
                        o0VarE.g0(false);
                    } else {
                        z25 = false;
                        lVar2 = lVar;
                    }
                    x1 x1Var111 = p3.n.f135158a;
                    if (list.isEmpty()) {
                        p2VarI0 = o0VarE.i0();
                        if (p2VarI0 != null) {
                            final int i611118 = 1;
                            final boolean z51111111111114 = z18;
                            final List list111112 = list5;
                            final long j1119 = j16;
                            final List list111113 = list4;
                            final float f211115 = f16;
                            final Object obj116 = obj2;
                            final boolean z51111111111115 = z24;
                            final float f211116 = f17;
                            final boolean z51111111111116 = z19;
                            final e23.l lVar116 = lVar2;
                            p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.g0
                                @Override // e23.p
                                public final Object invoke(Object obj117, Object obj118) {
                                    p3.m mVar2 = (p3.m) obj117;
                                    switch (i611118) {
                                        case 0:
                                            return PolygonKt.Polygon_qT8xWJw$lambda$18(list, z51111111111116, j1119, z51111111111114, list111113, j15, i36, list111112, f211115, obj116, z51111111111115, f211116, lVar116, i15, i16, i17, mVar2, ((Integer) obj118).intValue());
                                        default:
                                            return PolygonKt.Polygon_qT8xWJw$lambda$2(list, z51111111111116, j1119, z51111111111114, list111113, j15, i36, list111112, f211115, obj116, z51111111111115, f211116, lVar116, i15, i16, i17, mVar2, ((Integer) obj118).intValue());
                                    }
                                }
                            };
                            return;
                        }
                        return;
                    }
                    f18 = f17;
                    z26 = z25;
                    obj3 = obj2;
                    i65 = i36;
                    list6 = list4;
                    f19 = f16;
                    z27 = z24;
                    lVar3 = lVar2;
                    j17 = j15;
                    z28 = z18;
                    list7 = list5;
                    mapApplier = (MapApplier) cVar;
                    o0VarE.C(751012594);
                    boolean zR111111111 = o0VarE.r(mapApplier) | o0VarE.r(list);
                    if ((i18 & 112) == 32) {
                        z29 = true;
                    } else {
                        z29 = z26;
                    }
                    boolean z51111111111117 = z29 | zR111111111;
                    if ((i18 & 896) == 256) {
                        z34 = true;
                    } else {
                        z34 = z26;
                    }
                    boolean z51111111111118 = z51111111111117 | z34;
                    if ((i18 & 7168) == 2048) {
                        z35 = true;
                    } else {
                        z35 = z26;
                    }
                    boolean zR111111112 = z51111111111118 | z35 | o0VarE.r(list6);
                    if ((458752 & i18) == 131072) {
                        z36 = true;
                    } else {
                        z36 = z26;
                    }
                    boolean z51111111111119 = zR111111112 | z36;
                    if ((3670016 & i18) == 1048576) {
                        z37 = true;
                    } else {
                        z37 = z26;
                    }
                    boolean zR111111113 = z51111111111119 | z37 | o0VarE.r(list7);
                    if ((234881024 & i18) == 67108864) {
                        z38 = true;
                    } else {
                        z38 = z26;
                    }
                    boolean z61111111114 = zR111111113 | z38;
                    if ((i59 & 14) == 4) {
                        z39 = true;
                    } else {
                        z39 = z26;
                    }
                    boolean z61111111115 = z61111111114 | z39;
                    if ((i59 & 112) == 32) {
                        z44 = true;
                    } else {
                        z44 = z26;
                    }
                    boolean zR111111114 = z61111111115 | z44 | o0VarE.r(obj3);
                    if ((i59 & 896) == 256) {
                        z45 = true;
                    } else {
                        z45 = z26;
                    }
                    z46 = z45 | zR111111114;
                    objQ = o0VarE.q();
                    if (z46) {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            final long j211114 = j16;
                            list8 = list7;
                            i66 = i65;
                            final boolean z61111111116 = z19;
                            obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                                @Override // e23.a
                                public final Object invoke() {
                                    return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z61111111116, j211114, z28, list6, j17, i66, list8, f19, z27, f18);
                                }
                            };
                            list9 = list;
                            o0Var = o0VarE;
                            lVar4 = lVar3;
                            j18 = j211114;
                            o0Var.K(obj4);
                        } else {
                            obj4 = objQ;
                            o0Var = o0VarE;
                            j18 = j16;
                            lVar4 = lVar3;
                            list9 = list;
                            i66 = i65;
                            list8 = list7;
                        }
                    } else {
                        final long j211115 = j16;
                        list8 = list7;
                        i66 = i65;
                        final boolean z61111111117 = z19;
                        obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                            @Override // e23.a
                            public final Object invoke() {
                                return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z61111111117, j211115, z28, list6, j17, i66, list8, f19, z27, f18);
                            }
                        };
                        list9 = list;
                        o0Var = o0VarE;
                        lVar4 = lVar3;
                        j18 = j211115;
                        o0Var.K(obj4);
                    }
                    aVar2 = (e23.a) obj4;
                    o0Var.g0(false);
                    if (!(cVar instanceof MapApplier)) {
                        p3.p0.l();
                        throw null;
                    }
                    o0Var.H();
                    if (o0Var.T) {
                        o0Var.M(aVar2);
                    } else {
                        o0Var.c();
                    }
                    b4.d(new c0(22), lVar4, o0Var);
                    b4.d(new c0(23), list9, o0Var);
                    b4.d(new c0(13), Boolean.valueOf(z19), o0Var);
                    b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$4
                        @Override // e23.p
                        public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                            m121invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                        public final void m121invoke4WTKRHQ(PolygonNode polygonNode, long j211116) {
                            polygonNode.getClass();
                            polygonNode.getPolygon().setFillColor(o4.f0.j(j211116));
                        }
                    }, o4.d0.a(j18), o0Var);
                    b4.d(new c0(14), Boolean.valueOf(z28), o0Var);
                    b4.d(new c0(15), list6, o0Var);
                    b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$7
                        @Override // e23.p
                        public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                            m122invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                        public final void m122invoke4WTKRHQ(PolygonNode polygonNode, long j211116) {
                            polygonNode.getClass();
                            polygonNode.getPolygon().setStrokeColor(o4.f0.j(j211116));
                        }
                    }, o4.d0.a(j17), o0Var);
                    c0Var = new c0(16);
                    z47 = o0Var.T;
                    if (!z47) {
                    }
                    o0Var.K(Integer.valueOf(i66));
                    if (!z47) {
                        o0Var.apply(c0Var, Integer.valueOf(i66));
                    }
                    b4.d(new c0(17), list8, o0Var);
                    b4.d(new c0(18), Float.valueOf(f19), o0Var);
                    b4.d(new c0(19), obj3, o0Var);
                    b4.d(new c0(20), Boolean.valueOf(z27), o0Var);
                    b4.d(new c0(21), Float.valueOf(f18), o0Var);
                    o0Var.g0(true);
                    int i611119 = i66;
                    obj5 = obj3;
                    z48 = z28;
                    j15 = j17;
                    list10 = list8;
                    z49 = z27;
                    lVar5 = lVar4;
                    list11 = list6;
                    i36 = i611119;
                    f22 = f19;
                    f24 = f18;
                }
                p2VarI1 = o0Var.i0();
                if (p2VarI1 != null) {
                    final int i714 = 0;
                    final boolean z61111111118 = z19;
                    p2VarI1.f135219d = new e23.p() { // from class: com.google.maps.android.compose.g0
                        @Override // e23.p
                        public final Object invoke(Object obj117, Object obj118) {
                            p3.m mVar2 = (p3.m) obj117;
                            switch (i714) {
                                case 0:
                                    return PolygonKt.Polygon_qT8xWJw$lambda$18(list, z61111111118, j18, z48, list11, j15, i36, list10, f22, obj5, z49, f24, lVar5, i15, i16, i17, mVar2, ((Integer) obj118).intValue());
                                default:
                                    return PolygonKt.Polygon_qT8xWJw$lambda$2(list, z61111111118, j18, z48, list11, j15, i36, list10, f22, obj5, z49, f24, lVar5, i15, i16, i17, mVar2, ((Integer) obj118).intValue());
                            }
                        }
                    };
                }
            }
            i18 |= C.ENCODING_PCM_32BIT;
            i48 = i17 & 1024;
            if (i48 != 0) {
                i49 = i16 | 6;
            } else if ((i16 & 6) == 0) {
                if (o0VarE.h(z16)) {
                    i54 = 4;
                } else {
                    i54 = 2;
                }
                i49 = i16 | i54;
            } else {
                i49 = i16;
            }
            i55 = i17 & 2048;
            if (i55 != 0) {
                i49 |= 48;
            } else if ((i16 & 48) != 0) {
                if (o0VarE.i(f15)) {
                    i56 = 32;
                } else {
                    i56 = 16;
                }
                i49 |= i56;
            }
            i57 = i49;
            i58 = i17 & 4096;
            if (i58 != 0) {
                i59 = i57 | 384;
            } else if ((i16 & 384) == 0) {
                if (o0VarE.r(lVar)) {
                    i64 = 256;
                } else {
                    i64 = 128;
                }
                i59 = i57 | i64;
            } else {
                i59 = i57;
            }
            if ((i18 & 306783379) != 306783378) {
                if (i24 != 0) {
                    z19 = false;
                } else {
                    z19 = z17;
                }
                if (i19 != 0) {
                    o4.d0.f128823b.getClass();
                    j16 = o4.d0.f128824c;
                } else {
                    j16 = j8;
                }
                if (i26 != 0) {
                    z18 = false;
                }
                if (i28 != 0) {
                    list4 = p13.j0.f134944a;
                }
                if (i30 != 0) {
                    o4.d0.f128823b.getClass();
                    j15 = o4.d0.f128824c;
                }
                if (i35 != 0) {
                    i36 = 0;
                }
                if (i38 != 0) {
                    list5 = null;
                }
                if (i44 != 0) {
                    f16 = 10.0f;
                } else {
                    f16 = f14;
                }
                if (i46 != 0) {
                    obj2 = null;
                } else {
                    obj2 = obj;
                }
                if (i48 != 0) {
                    z24 = true;
                } else {
                    z24 = z16;
                }
                if (i55 != 0) {
                    f17 = 0.0f;
                } else {
                    f17 = f15;
                }
                aVar = p3.m.f135153a;
                if (i58 != 0) {
                    o0VarE.C(751006162);
                    objQ2 = o0VarE.q();
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new f0(8);
                        o0VarE.K(objQ2);
                    }
                    lVar2 = (e23.l) objQ2;
                    z25 = false;
                    o0VarE.g0(false);
                } else {
                    z25 = false;
                    lVar2 = lVar;
                }
                x1 x1Var112 = p3.n.f135158a;
                if (list.isEmpty()) {
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        final int i6111110 = 1;
                        final boolean z511111111111110 = z18;
                        final List list111114 = list5;
                        final long j11110 = j16;
                        final List list111115 = list4;
                        final float f211117 = f16;
                        final Object obj117 = obj2;
                        final boolean z511111111111111 = z24;
                        final float f211118 = f17;
                        final boolean z511111111111112 = z19;
                        final e23.l lVar117 = lVar2;
                        p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.g0
                            @Override // e23.p
                            public final Object invoke(Object obj118, Object obj119) {
                                p3.m mVar2 = (p3.m) obj118;
                                switch (i6111110) {
                                    case 0:
                                        return PolygonKt.Polygon_qT8xWJw$lambda$18(list, z511111111111112, j11110, z511111111111110, list111115, j15, i36, list111114, f211117, obj117, z511111111111111, f211118, lVar117, i15, i16, i17, mVar2, ((Integer) obj119).intValue());
                                    default:
                                        return PolygonKt.Polygon_qT8xWJw$lambda$2(list, z511111111111112, j11110, z511111111111110, list111115, j15, i36, list111114, f211117, obj117, z511111111111111, f211118, lVar117, i15, i16, i17, mVar2, ((Integer) obj119).intValue());
                                }
                            }
                        };
                        return;
                    }
                    return;
                }
                f18 = f17;
                z26 = z25;
                obj3 = obj2;
                i65 = i36;
                list6 = list4;
                f19 = f16;
                z27 = z24;
                lVar3 = lVar2;
                j17 = j15;
                z28 = z18;
                list7 = list5;
                mapApplier = (MapApplier) cVar;
                o0VarE.C(751012594);
                boolean zR111111115 = o0VarE.r(mapApplier) | o0VarE.r(list);
                if ((i18 & 112) == 32) {
                    z29 = true;
                } else {
                    z29 = z26;
                }
                boolean z511111111111113 = z29 | zR111111115;
                if ((i18 & 896) == 256) {
                    z34 = true;
                } else {
                    z34 = z26;
                }
                boolean z511111111111114 = z511111111111113 | z34;
                if ((i18 & 7168) == 2048) {
                    z35 = true;
                } else {
                    z35 = z26;
                }
                boolean zR111111116 = z511111111111114 | z35 | o0VarE.r(list6);
                if ((458752 & i18) == 131072) {
                    z36 = true;
                } else {
                    z36 = z26;
                }
                boolean z511111111111115 = zR111111116 | z36;
                if ((3670016 & i18) == 1048576) {
                    z37 = true;
                } else {
                    z37 = z26;
                }
                boolean zR111111117 = z511111111111115 | z37 | o0VarE.r(list7);
                if ((234881024 & i18) == 67108864) {
                    z38 = true;
                } else {
                    z38 = z26;
                }
                boolean z61111111119 = zR111111117 | z38;
                if ((i59 & 14) == 4) {
                    z39 = true;
                } else {
                    z39 = z26;
                }
                boolean z611111111110 = z61111111119 | z39;
                if ((i59 & 112) == 32) {
                    z44 = true;
                } else {
                    z44 = z26;
                }
                boolean zR111111118 = z611111111110 | z44 | o0VarE.r(obj3);
                if ((i59 & 896) == 256) {
                    z45 = true;
                } else {
                    z45 = z26;
                }
                z46 = z45 | zR111111118;
                objQ = o0VarE.q();
                if (z46) {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        final long j211116 = j16;
                        list8 = list7;
                        i66 = i65;
                        final boolean z611111111111 = z19;
                        obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                            @Override // e23.a
                            public final Object invoke() {
                                return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z611111111111, j211116, z28, list6, j17, i66, list8, f19, z27, f18);
                            }
                        };
                        list9 = list;
                        o0Var = o0VarE;
                        lVar4 = lVar3;
                        j18 = j211116;
                        o0Var.K(obj4);
                    } else {
                        obj4 = objQ;
                        o0Var = o0VarE;
                        j18 = j16;
                        lVar4 = lVar3;
                        list9 = list;
                        i66 = i65;
                        list8 = list7;
                    }
                } else {
                    final long j211117 = j16;
                    list8 = list7;
                    i66 = i65;
                    final boolean z611111111112 = z19;
                    obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                        @Override // e23.a
                        public final Object invoke() {
                            return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z611111111112, j211117, z28, list6, j17, i66, list8, f19, z27, f18);
                        }
                    };
                    list9 = list;
                    o0Var = o0VarE;
                    lVar4 = lVar3;
                    j18 = j211117;
                    o0Var.K(obj4);
                }
                aVar2 = (e23.a) obj4;
                o0Var.g0(false);
                if (!(cVar instanceof MapApplier)) {
                    p3.p0.l();
                    throw null;
                }
                o0Var.H();
                if (o0Var.T) {
                    o0Var.M(aVar2);
                } else {
                    o0Var.c();
                }
                b4.d(new c0(22), lVar4, o0Var);
                b4.d(new c0(23), list9, o0Var);
                b4.d(new c0(13), Boolean.valueOf(z19), o0Var);
                b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$4
                    @Override // e23.p
                    public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                        m121invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                    public final void m121invoke4WTKRHQ(PolygonNode polygonNode, long j211118) {
                        polygonNode.getClass();
                        polygonNode.getPolygon().setFillColor(o4.f0.j(j211118));
                    }
                }, o4.d0.a(j18), o0Var);
                b4.d(new c0(14), Boolean.valueOf(z28), o0Var);
                b4.d(new c0(15), list6, o0Var);
                b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$7
                    @Override // e23.p
                    public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                        m122invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                    public final void m122invoke4WTKRHQ(PolygonNode polygonNode, long j211118) {
                        polygonNode.getClass();
                        polygonNode.getPolygon().setStrokeColor(o4.f0.j(j211118));
                    }
                }, o4.d0.a(j17), o0Var);
                c0Var = new c0(16);
                z47 = o0Var.T;
                if (!z47) {
                }
                o0Var.K(Integer.valueOf(i66));
                if (!z47) {
                    o0Var.apply(c0Var, Integer.valueOf(i66));
                }
                b4.d(new c0(17), list8, o0Var);
                b4.d(new c0(18), Float.valueOf(f19), o0Var);
                b4.d(new c0(19), obj3, o0Var);
                b4.d(new c0(20), Boolean.valueOf(z27), o0Var);
                b4.d(new c0(21), Float.valueOf(f18), o0Var);
                o0Var.g0(true);
                int i6111111 = i66;
                obj5 = obj3;
                z48 = z28;
                j15 = j17;
                list10 = list8;
                z49 = z27;
                lVar5 = lVar4;
                list11 = list6;
                i36 = i6111111;
                f22 = f19;
                f24 = f18;
            } else {
                if (i24 != 0) {
                    z19 = false;
                } else {
                    z19 = z17;
                }
                if (i19 != 0) {
                    o4.d0.f128823b.getClass();
                    j16 = o4.d0.f128824c;
                } else {
                    j16 = j8;
                }
                if (i26 != 0) {
                    z18 = false;
                }
                if (i28 != 0) {
                    list4 = p13.j0.f134944a;
                }
                if (i30 != 0) {
                    o4.d0.f128823b.getClass();
                    j15 = o4.d0.f128824c;
                }
                if (i35 != 0) {
                    i36 = 0;
                }
                if (i38 != 0) {
                    list5 = null;
                }
                if (i44 != 0) {
                    f16 = 10.0f;
                } else {
                    f16 = f14;
                }
                if (i46 != 0) {
                    obj2 = null;
                } else {
                    obj2 = obj;
                }
                if (i48 != 0) {
                    z24 = true;
                } else {
                    z24 = z16;
                }
                if (i55 != 0) {
                    f17 = 0.0f;
                } else {
                    f17 = f15;
                }
                aVar = p3.m.f135153a;
                if (i58 != 0) {
                    o0VarE.C(751006162);
                    objQ2 = o0VarE.q();
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new f0(8);
                        o0VarE.K(objQ2);
                    }
                    lVar2 = (e23.l) objQ2;
                    z25 = false;
                    o0VarE.g0(false);
                } else {
                    z25 = false;
                    lVar2 = lVar;
                }
                x1 x1Var113 = p3.n.f135158a;
                if (list.isEmpty()) {
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        final int i6111112 = 1;
                        final boolean z511111111111116 = z18;
                        final List list111116 = list5;
                        final long j11111 = j16;
                        final List list111117 = list4;
                        final float f211119 = f16;
                        final Object obj118 = obj2;
                        final boolean z511111111111117 = z24;
                        final float f2111110 = f17;
                        final boolean z511111111111118 = z19;
                        final e23.l lVar118 = lVar2;
                        p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.g0
                            @Override // e23.p
                            public final Object invoke(Object obj119, Object obj1110) {
                                p3.m mVar2 = (p3.m) obj119;
                                switch (i6111112) {
                                    case 0:
                                        return PolygonKt.Polygon_qT8xWJw$lambda$18(list, z511111111111118, j11111, z511111111111116, list111117, j15, i36, list111116, f211119, obj118, z511111111111117, f2111110, lVar118, i15, i16, i17, mVar2, ((Integer) obj1110).intValue());
                                    default:
                                        return PolygonKt.Polygon_qT8xWJw$lambda$2(list, z511111111111118, j11111, z511111111111116, list111117, j15, i36, list111116, f211119, obj118, z511111111111117, f2111110, lVar118, i15, i16, i17, mVar2, ((Integer) obj1110).intValue());
                                }
                            }
                        };
                        return;
                    }
                    return;
                }
                f18 = f17;
                z26 = z25;
                obj3 = obj2;
                i65 = i36;
                list6 = list4;
                f19 = f16;
                z27 = z24;
                lVar3 = lVar2;
                j17 = j15;
                z28 = z18;
                list7 = list5;
                mapApplier = (MapApplier) cVar;
                o0VarE.C(751012594);
                boolean zR111111119 = o0VarE.r(mapApplier) | o0VarE.r(list);
                if ((i18 & 112) == 32) {
                    z29 = true;
                } else {
                    z29 = z26;
                }
                boolean z511111111111119 = z29 | zR111111119;
                if ((i18 & 896) == 256) {
                    z34 = true;
                } else {
                    z34 = z26;
                }
                boolean z5111111111111110 = z511111111111119 | z34;
                if ((i18 & 7168) == 2048) {
                    z35 = true;
                } else {
                    z35 = z26;
                }
                boolean zR1111111110 = z5111111111111110 | z35 | o0VarE.r(list6);
                if ((458752 & i18) == 131072) {
                    z36 = true;
                } else {
                    z36 = z26;
                }
                boolean z5111111111111111 = zR1111111110 | z36;
                if ((3670016 & i18) == 1048576) {
                    z37 = true;
                } else {
                    z37 = z26;
                }
                boolean zR1111111111 = z5111111111111111 | z37 | o0VarE.r(list7);
                if ((234881024 & i18) == 67108864) {
                    z38 = true;
                } else {
                    z38 = z26;
                }
                boolean z611111111113 = zR1111111111 | z38;
                if ((i59 & 14) == 4) {
                    z39 = true;
                } else {
                    z39 = z26;
                }
                boolean z611111111114 = z611111111113 | z39;
                if ((i59 & 112) == 32) {
                    z44 = true;
                } else {
                    z44 = z26;
                }
                boolean zR1111111112 = z611111111114 | z44 | o0VarE.r(obj3);
                if ((i59 & 896) == 256) {
                    z45 = true;
                } else {
                    z45 = z26;
                }
                z46 = z45 | zR1111111112;
                objQ = o0VarE.q();
                if (z46) {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        final long j211118 = j16;
                        list8 = list7;
                        i66 = i65;
                        final boolean z611111111115 = z19;
                        obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                            @Override // e23.a
                            public final Object invoke() {
                                return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z611111111115, j211118, z28, list6, j17, i66, list8, f19, z27, f18);
                            }
                        };
                        list9 = list;
                        o0Var = o0VarE;
                        lVar4 = lVar3;
                        j18 = j211118;
                        o0Var.K(obj4);
                    } else {
                        obj4 = objQ;
                        o0Var = o0VarE;
                        j18 = j16;
                        lVar4 = lVar3;
                        list9 = list;
                        i66 = i65;
                        list8 = list7;
                    }
                } else {
                    final long j211119 = j16;
                    list8 = list7;
                    i66 = i65;
                    final boolean z611111111116 = z19;
                    obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                        @Override // e23.a
                        public final Object invoke() {
                            return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z611111111116, j211119, z28, list6, j17, i66, list8, f19, z27, f18);
                        }
                    };
                    list9 = list;
                    o0Var = o0VarE;
                    lVar4 = lVar3;
                    j18 = j211119;
                    o0Var.K(obj4);
                }
                aVar2 = (e23.a) obj4;
                o0Var.g0(false);
                if (!(cVar instanceof MapApplier)) {
                    p3.p0.l();
                    throw null;
                }
                o0Var.H();
                if (o0Var.T) {
                    o0Var.M(aVar2);
                } else {
                    o0Var.c();
                }
                b4.d(new c0(22), lVar4, o0Var);
                b4.d(new c0(23), list9, o0Var);
                b4.d(new c0(13), Boolean.valueOf(z19), o0Var);
                b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$4
                    @Override // e23.p
                    public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                        m121invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                    public final void m121invoke4WTKRHQ(PolygonNode polygonNode, long j2111110) {
                        polygonNode.getClass();
                        polygonNode.getPolygon().setFillColor(o4.f0.j(j2111110));
                    }
                }, o4.d0.a(j18), o0Var);
                b4.d(new c0(14), Boolean.valueOf(z28), o0Var);
                b4.d(new c0(15), list6, o0Var);
                b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$7
                    @Override // e23.p
                    public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                        m122invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                    public final void m122invoke4WTKRHQ(PolygonNode polygonNode, long j2111110) {
                        polygonNode.getClass();
                        polygonNode.getPolygon().setStrokeColor(o4.f0.j(j2111110));
                    }
                }, o4.d0.a(j17), o0Var);
                c0Var = new c0(16);
                z47 = o0Var.T;
                if (!z47) {
                }
                o0Var.K(Integer.valueOf(i66));
                if (!z47) {
                    o0Var.apply(c0Var, Integer.valueOf(i66));
                }
                b4.d(new c0(17), list8, o0Var);
                b4.d(new c0(18), Float.valueOf(f19), o0Var);
                b4.d(new c0(19), obj3, o0Var);
                b4.d(new c0(20), Boolean.valueOf(z27), o0Var);
                b4.d(new c0(21), Float.valueOf(f18), o0Var);
                o0Var.g0(true);
                int i6111113 = i66;
                obj5 = obj3;
                z48 = z28;
                j15 = j17;
                list10 = list8;
                z49 = z27;
                lVar5 = lVar4;
                list11 = list6;
                i36 = i6111113;
                f22 = f19;
                f24 = f18;
            }
            p2VarI1 = o0Var.i0();
            if (p2VarI1 != null) {
                final int i715 = 0;
                final boolean z611111111117 = z19;
                p2VarI1.f135219d = new e23.p() { // from class: com.google.maps.android.compose.g0
                    @Override // e23.p
                    public final Object invoke(Object obj119, Object obj1110) {
                        p3.m mVar2 = (p3.m) obj119;
                        switch (i715) {
                            case 0:
                                return PolygonKt.Polygon_qT8xWJw$lambda$18(list, z611111111117, j18, z48, list11, j15, i36, list10, f22, obj5, z49, f24, lVar5, i15, i16, i17, mVar2, ((Integer) obj1110).intValue());
                            default:
                                return PolygonKt.Polygon_qT8xWJw$lambda$2(list, z611111111117, j18, z48, list11, j15, i36, list10, f22, obj5, z49, f24, lVar5, i15, i16, i17, mVar2, ((Integer) obj1110).intValue());
                        }
                    }
                };
            }
        }
        i18 |= 3072;
        z18 = z15;
        i28 = i17 & 16;
        if (i28 != 0) {
            if ((i15 & 24576) == 0) {
                list4 = list2;
                if (o0VarE.r(list4)) {
                    i29 = 16384;
                } else {
                    i29 = 8192;
                }
                i18 |= i29;
            }
            i30 = i17 & 32;
            if (i30 != 0) {
                i18 |= 196608;
                j15 = j14;
            } else {
                j15 = j14;
                if ((i15 & 196608) == 0) {
                    if (o0VarE.l(j15)) {
                        i34 = 131072;
                    } else {
                        i34 = 65536;
                    }
                    i18 |= i34;
                }
            }
            i35 = i17 & 64;
            if (i35 != 0) {
                i18 |= 1572864;
                i36 = i14;
            } else {
                i36 = i14;
                if ((i15 & 1572864) == 0) {
                    if (o0VarE.k(i36)) {
                        i37 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i37 = 524288;
                    }
                    i18 |= i37;
                }
            }
            i38 = i17 & 128;
            if (i38 != 0) {
                i18 |= 12582912;
                list5 = list3;
            } else {
                list5 = list3;
                if ((i15 & 12582912) == 0) {
                    if (o0VarE.r(list5)) {
                        i39 = 8388608;
                    } else {
                        i39 = 4194304;
                    }
                    i18 |= i39;
                }
            }
            i44 = i17 & 256;
            if (i44 != 0) {
                i18 |= 100663296;
            } else if ((i15 & 100663296) == 0) {
                if (o0VarE.i(f14)) {
                    i45 = 67108864;
                } else {
                    i45 = 33554432;
                }
                i18 |= i45;
            }
            i46 = i17 & 512;
            if (i46 != 0) {
                if ((i15 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.r(obj)) {
                        i47 = 536870912;
                    } else {
                        i47 = 268435456;
                    }
                    i18 |= i47;
                }
                i48 = i17 & 1024;
                if (i48 != 0) {
                    i49 = i16 | 6;
                } else if ((i16 & 6) == 0) {
                    if (o0VarE.h(z16)) {
                        i54 = 4;
                    } else {
                        i54 = 2;
                    }
                    i49 = i16 | i54;
                } else {
                    i49 = i16;
                }
                i55 = i17 & 2048;
                if (i55 != 0) {
                    i49 |= 48;
                } else if ((i16 & 48) != 0) {
                    if (o0VarE.i(f15)) {
                        i56 = 32;
                    } else {
                        i56 = 16;
                    }
                    i49 |= i56;
                }
                i57 = i49;
                i58 = i17 & 4096;
                if (i58 != 0) {
                    i59 = i57 | 384;
                } else if ((i16 & 384) == 0) {
                    if (o0VarE.r(lVar)) {
                        i64 = 256;
                    } else {
                        i64 = 128;
                    }
                    i59 = i57 | i64;
                } else {
                    i59 = i57;
                }
                if ((i18 & 306783379) != 306783378) {
                    if (i24 != 0) {
                        z19 = false;
                    } else {
                        z19 = z17;
                    }
                    if (i19 != 0) {
                        o4.d0.f128823b.getClass();
                        j16 = o4.d0.f128824c;
                    } else {
                        j16 = j8;
                    }
                    if (i26 != 0) {
                        z18 = false;
                    }
                    if (i28 != 0) {
                        list4 = p13.j0.f134944a;
                    }
                    if (i30 != 0) {
                        o4.d0.f128823b.getClass();
                        j15 = o4.d0.f128824c;
                    }
                    if (i35 != 0) {
                        i36 = 0;
                    }
                    if (i38 != 0) {
                        list5 = null;
                    }
                    if (i44 != 0) {
                        f16 = 10.0f;
                    } else {
                        f16 = f14;
                    }
                    if (i46 != 0) {
                        obj2 = null;
                    } else {
                        obj2 = obj;
                    }
                    if (i48 != 0) {
                        z24 = true;
                    } else {
                        z24 = z16;
                    }
                    if (i55 != 0) {
                        f17 = 0.0f;
                    } else {
                        f17 = f15;
                    }
                    aVar = p3.m.f135153a;
                    if (i58 != 0) {
                        o0VarE.C(751006162);
                        objQ2 = o0VarE.q();
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new f0(8);
                            o0VarE.K(objQ2);
                        }
                        lVar2 = (e23.l) objQ2;
                        z25 = false;
                        o0VarE.g0(false);
                    } else {
                        z25 = false;
                        lVar2 = lVar;
                    }
                    x1 x1Var114 = p3.n.f135158a;
                    if (list.isEmpty()) {
                        p2VarI0 = o0VarE.i0();
                        if (p2VarI0 != null) {
                            final int i6111114 = 1;
                            final boolean z5111111111111112 = z18;
                            final List list111118 = list5;
                            final long j11112 = j16;
                            final List list111119 = list4;
                            final float f2111111 = f16;
                            final Object obj119 = obj2;
                            final boolean z5111111111111113 = z24;
                            final float f2111112 = f17;
                            final boolean z5111111111111114 = z19;
                            final e23.l lVar119 = lVar2;
                            p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.g0
                                @Override // e23.p
                                public final Object invoke(Object obj1110, Object obj1111) {
                                    p3.m mVar2 = (p3.m) obj1110;
                                    switch (i6111114) {
                                        case 0:
                                            return PolygonKt.Polygon_qT8xWJw$lambda$18(list, z5111111111111114, j11112, z5111111111111112, list111119, j15, i36, list111118, f2111111, obj119, z5111111111111113, f2111112, lVar119, i15, i16, i17, mVar2, ((Integer) obj1111).intValue());
                                        default:
                                            return PolygonKt.Polygon_qT8xWJw$lambda$2(list, z5111111111111114, j11112, z5111111111111112, list111119, j15, i36, list111118, f2111111, obj119, z5111111111111113, f2111112, lVar119, i15, i16, i17, mVar2, ((Integer) obj1111).intValue());
                                    }
                                }
                            };
                            return;
                        }
                        return;
                    }
                    f18 = f17;
                    z26 = z25;
                    obj3 = obj2;
                    i65 = i36;
                    list6 = list4;
                    f19 = f16;
                    z27 = z24;
                    lVar3 = lVar2;
                    j17 = j15;
                    z28 = z18;
                    list7 = list5;
                    mapApplier = (MapApplier) cVar;
                    o0VarE.C(751012594);
                    boolean zR1111111113 = o0VarE.r(mapApplier) | o0VarE.r(list);
                    if ((i18 & 112) == 32) {
                        z29 = true;
                    } else {
                        z29 = z26;
                    }
                    boolean z5111111111111115 = z29 | zR1111111113;
                    if ((i18 & 896) == 256) {
                        z34 = true;
                    } else {
                        z34 = z26;
                    }
                    boolean z5111111111111116 = z5111111111111115 | z34;
                    if ((i18 & 7168) == 2048) {
                        z35 = true;
                    } else {
                        z35 = z26;
                    }
                    boolean zR1111111114 = z5111111111111116 | z35 | o0VarE.r(list6);
                    if ((458752 & i18) == 131072) {
                        z36 = true;
                    } else {
                        z36 = z26;
                    }
                    boolean z5111111111111117 = zR1111111114 | z36;
                    if ((3670016 & i18) == 1048576) {
                        z37 = true;
                    } else {
                        z37 = z26;
                    }
                    boolean zR1111111115 = z5111111111111117 | z37 | o0VarE.r(list7);
                    if ((234881024 & i18) == 67108864) {
                        z38 = true;
                    } else {
                        z38 = z26;
                    }
                    boolean z611111111118 = zR1111111115 | z38;
                    if ((i59 & 14) == 4) {
                        z39 = true;
                    } else {
                        z39 = z26;
                    }
                    boolean z611111111119 = z611111111118 | z39;
                    if ((i59 & 112) == 32) {
                        z44 = true;
                    } else {
                        z44 = z26;
                    }
                    boolean zR1111111116 = z611111111119 | z44 | o0VarE.r(obj3);
                    if ((i59 & 896) == 256) {
                        z45 = true;
                    } else {
                        z45 = z26;
                    }
                    z46 = z45 | zR1111111116;
                    objQ = o0VarE.q();
                    if (z46) {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            final long j2111110 = j16;
                            list8 = list7;
                            i66 = i65;
                            final boolean z6111111111110 = z19;
                            obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                                @Override // e23.a
                                public final Object invoke() {
                                    return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z6111111111110, j2111110, z28, list6, j17, i66, list8, f19, z27, f18);
                                }
                            };
                            list9 = list;
                            o0Var = o0VarE;
                            lVar4 = lVar3;
                            j18 = j2111110;
                            o0Var.K(obj4);
                        } else {
                            obj4 = objQ;
                            o0Var = o0VarE;
                            j18 = j16;
                            lVar4 = lVar3;
                            list9 = list;
                            i66 = i65;
                            list8 = list7;
                        }
                    } else {
                        final long j2111111 = j16;
                        list8 = list7;
                        i66 = i65;
                        final boolean z6111111111111 = z19;
                        obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                            @Override // e23.a
                            public final Object invoke() {
                                return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z6111111111111, j2111111, z28, list6, j17, i66, list8, f19, z27, f18);
                            }
                        };
                        list9 = list;
                        o0Var = o0VarE;
                        lVar4 = lVar3;
                        j18 = j2111111;
                        o0Var.K(obj4);
                    }
                    aVar2 = (e23.a) obj4;
                    o0Var.g0(false);
                    if (!(cVar instanceof MapApplier)) {
                        p3.p0.l();
                        throw null;
                    }
                    o0Var.H();
                    if (o0Var.T) {
                        o0Var.M(aVar2);
                    } else {
                        o0Var.c();
                    }
                    b4.d(new c0(22), lVar4, o0Var);
                    b4.d(new c0(23), list9, o0Var);
                    b4.d(new c0(13), Boolean.valueOf(z19), o0Var);
                    b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$4
                        @Override // e23.p
                        public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                            m121invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                        public final void m121invoke4WTKRHQ(PolygonNode polygonNode, long j2111112) {
                            polygonNode.getClass();
                            polygonNode.getPolygon().setFillColor(o4.f0.j(j2111112));
                        }
                    }, o4.d0.a(j18), o0Var);
                    b4.d(new c0(14), Boolean.valueOf(z28), o0Var);
                    b4.d(new c0(15), list6, o0Var);
                    b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$7
                        @Override // e23.p
                        public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                            m122invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                        public final void m122invoke4WTKRHQ(PolygonNode polygonNode, long j2111112) {
                            polygonNode.getClass();
                            polygonNode.getPolygon().setStrokeColor(o4.f0.j(j2111112));
                        }
                    }, o4.d0.a(j17), o0Var);
                    c0Var = new c0(16);
                    z47 = o0Var.T;
                    if (!z47) {
                    }
                    o0Var.K(Integer.valueOf(i66));
                    if (!z47) {
                        o0Var.apply(c0Var, Integer.valueOf(i66));
                    }
                    b4.d(new c0(17), list8, o0Var);
                    b4.d(new c0(18), Float.valueOf(f19), o0Var);
                    b4.d(new c0(19), obj3, o0Var);
                    b4.d(new c0(20), Boolean.valueOf(z27), o0Var);
                    b4.d(new c0(21), Float.valueOf(f18), o0Var);
                    o0Var.g0(true);
                    int i6111115 = i66;
                    obj5 = obj3;
                    z48 = z28;
                    j15 = j17;
                    list10 = list8;
                    z49 = z27;
                    lVar5 = lVar4;
                    list11 = list6;
                    i36 = i6111115;
                    f22 = f19;
                    f24 = f18;
                } else {
                    if (i24 != 0) {
                        z19 = false;
                    } else {
                        z19 = z17;
                    }
                    if (i19 != 0) {
                        o4.d0.f128823b.getClass();
                        j16 = o4.d0.f128824c;
                    } else {
                        j16 = j8;
                    }
                    if (i26 != 0) {
                        z18 = false;
                    }
                    if (i28 != 0) {
                        list4 = p13.j0.f134944a;
                    }
                    if (i30 != 0) {
                        o4.d0.f128823b.getClass();
                        j15 = o4.d0.f128824c;
                    }
                    if (i35 != 0) {
                        i36 = 0;
                    }
                    if (i38 != 0) {
                        list5 = null;
                    }
                    if (i44 != 0) {
                        f16 = 10.0f;
                    } else {
                        f16 = f14;
                    }
                    if (i46 != 0) {
                        obj2 = null;
                    } else {
                        obj2 = obj;
                    }
                    if (i48 != 0) {
                        z24 = true;
                    } else {
                        z24 = z16;
                    }
                    if (i55 != 0) {
                        f17 = 0.0f;
                    } else {
                        f17 = f15;
                    }
                    aVar = p3.m.f135153a;
                    if (i58 != 0) {
                        o0VarE.C(751006162);
                        objQ2 = o0VarE.q();
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new f0(8);
                            o0VarE.K(objQ2);
                        }
                        lVar2 = (e23.l) objQ2;
                        z25 = false;
                        o0VarE.g0(false);
                    } else {
                        z25 = false;
                        lVar2 = lVar;
                    }
                    x1 x1Var115 = p3.n.f135158a;
                    if (list.isEmpty()) {
                        p2VarI0 = o0VarE.i0();
                        if (p2VarI0 != null) {
                            final int i6111116 = 1;
                            final boolean z5111111111111118 = z18;
                            final List list1111110 = list5;
                            final long j11113 = j16;
                            final List list1111111 = list4;
                            final float f2111113 = f16;
                            final Object obj1110 = obj2;
                            final boolean z5111111111111119 = z24;
                            final float f2111114 = f17;
                            final boolean z51111111111111110 = z19;
                            final e23.l lVar1110 = lVar2;
                            p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.g0
                                @Override // e23.p
                                public final Object invoke(Object obj1111, Object obj1112) {
                                    p3.m mVar2 = (p3.m) obj1111;
                                    switch (i6111116) {
                                        case 0:
                                            return PolygonKt.Polygon_qT8xWJw$lambda$18(list, z51111111111111110, j11113, z5111111111111118, list1111111, j15, i36, list1111110, f2111113, obj1110, z5111111111111119, f2111114, lVar1110, i15, i16, i17, mVar2, ((Integer) obj1112).intValue());
                                        default:
                                            return PolygonKt.Polygon_qT8xWJw$lambda$2(list, z51111111111111110, j11113, z5111111111111118, list1111111, j15, i36, list1111110, f2111113, obj1110, z5111111111111119, f2111114, lVar1110, i15, i16, i17, mVar2, ((Integer) obj1112).intValue());
                                    }
                                }
                            };
                            return;
                        }
                        return;
                    }
                    f18 = f17;
                    z26 = z25;
                    obj3 = obj2;
                    i65 = i36;
                    list6 = list4;
                    f19 = f16;
                    z27 = z24;
                    lVar3 = lVar2;
                    j17 = j15;
                    z28 = z18;
                    list7 = list5;
                    mapApplier = (MapApplier) cVar;
                    o0VarE.C(751012594);
                    boolean zR1111111117 = o0VarE.r(mapApplier) | o0VarE.r(list);
                    if ((i18 & 112) == 32) {
                        z29 = true;
                    } else {
                        z29 = z26;
                    }
                    boolean z51111111111111111 = z29 | zR1111111117;
                    if ((i18 & 896) == 256) {
                        z34 = true;
                    } else {
                        z34 = z26;
                    }
                    boolean z51111111111111112 = z51111111111111111 | z34;
                    if ((i18 & 7168) == 2048) {
                        z35 = true;
                    } else {
                        z35 = z26;
                    }
                    boolean zR1111111118 = z51111111111111112 | z35 | o0VarE.r(list6);
                    if ((458752 & i18) == 131072) {
                        z36 = true;
                    } else {
                        z36 = z26;
                    }
                    boolean z51111111111111113 = zR1111111118 | z36;
                    if ((3670016 & i18) == 1048576) {
                        z37 = true;
                    } else {
                        z37 = z26;
                    }
                    boolean zR1111111119 = z51111111111111113 | z37 | o0VarE.r(list7);
                    if ((234881024 & i18) == 67108864) {
                        z38 = true;
                    } else {
                        z38 = z26;
                    }
                    boolean z6111111111112 = zR1111111119 | z38;
                    if ((i59 & 14) == 4) {
                        z39 = true;
                    } else {
                        z39 = z26;
                    }
                    boolean z6111111111113 = z6111111111112 | z39;
                    if ((i59 & 112) == 32) {
                        z44 = true;
                    } else {
                        z44 = z26;
                    }
                    boolean zR11111111110 = z6111111111113 | z44 | o0VarE.r(obj3);
                    if ((i59 & 896) == 256) {
                        z45 = true;
                    } else {
                        z45 = z26;
                    }
                    z46 = z45 | zR11111111110;
                    objQ = o0VarE.q();
                    if (z46) {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            final long j2111112 = j16;
                            list8 = list7;
                            i66 = i65;
                            final boolean z6111111111114 = z19;
                            obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                                @Override // e23.a
                                public final Object invoke() {
                                    return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z6111111111114, j2111112, z28, list6, j17, i66, list8, f19, z27, f18);
                                }
                            };
                            list9 = list;
                            o0Var = o0VarE;
                            lVar4 = lVar3;
                            j18 = j2111112;
                            o0Var.K(obj4);
                        } else {
                            obj4 = objQ;
                            o0Var = o0VarE;
                            j18 = j16;
                            lVar4 = lVar3;
                            list9 = list;
                            i66 = i65;
                            list8 = list7;
                        }
                    } else {
                        final long j2111113 = j16;
                        list8 = list7;
                        i66 = i65;
                        final boolean z6111111111115 = z19;
                        obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                            @Override // e23.a
                            public final Object invoke() {
                                return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z6111111111115, j2111113, z28, list6, j17, i66, list8, f19, z27, f18);
                            }
                        };
                        list9 = list;
                        o0Var = o0VarE;
                        lVar4 = lVar3;
                        j18 = j2111113;
                        o0Var.K(obj4);
                    }
                    aVar2 = (e23.a) obj4;
                    o0Var.g0(false);
                    if (!(cVar instanceof MapApplier)) {
                        p3.p0.l();
                        throw null;
                    }
                    o0Var.H();
                    if (o0Var.T) {
                        o0Var.M(aVar2);
                    } else {
                        o0Var.c();
                    }
                    b4.d(new c0(22), lVar4, o0Var);
                    b4.d(new c0(23), list9, o0Var);
                    b4.d(new c0(13), Boolean.valueOf(z19), o0Var);
                    b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$4
                        @Override // e23.p
                        public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                            m121invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                        public final void m121invoke4WTKRHQ(PolygonNode polygonNode, long j2111114) {
                            polygonNode.getClass();
                            polygonNode.getPolygon().setFillColor(o4.f0.j(j2111114));
                        }
                    }, o4.d0.a(j18), o0Var);
                    b4.d(new c0(14), Boolean.valueOf(z28), o0Var);
                    b4.d(new c0(15), list6, o0Var);
                    b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$7
                        @Override // e23.p
                        public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                            m122invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                        public final void m122invoke4WTKRHQ(PolygonNode polygonNode, long j2111114) {
                            polygonNode.getClass();
                            polygonNode.getPolygon().setStrokeColor(o4.f0.j(j2111114));
                        }
                    }, o4.d0.a(j17), o0Var);
                    c0Var = new c0(16);
                    z47 = o0Var.T;
                    if (!z47) {
                    }
                    o0Var.K(Integer.valueOf(i66));
                    if (!z47) {
                        o0Var.apply(c0Var, Integer.valueOf(i66));
                    }
                    b4.d(new c0(17), list8, o0Var);
                    b4.d(new c0(18), Float.valueOf(f19), o0Var);
                    b4.d(new c0(19), obj3, o0Var);
                    b4.d(new c0(20), Boolean.valueOf(z27), o0Var);
                    b4.d(new c0(21), Float.valueOf(f18), o0Var);
                    o0Var.g0(true);
                    int i6111117 = i66;
                    obj5 = obj3;
                    z48 = z28;
                    j15 = j17;
                    list10 = list8;
                    z49 = z27;
                    lVar5 = lVar4;
                    list11 = list6;
                    i36 = i6111117;
                    f22 = f19;
                    f24 = f18;
                }
                p2VarI1 = o0Var.i0();
                if (p2VarI1 != null) {
                    final int i716 = 0;
                    final boolean z6111111111116 = z19;
                    p2VarI1.f135219d = new e23.p() { // from class: com.google.maps.android.compose.g0
                        @Override // e23.p
                        public final Object invoke(Object obj1111, Object obj1112) {
                            p3.m mVar2 = (p3.m) obj1111;
                            switch (i716) {
                                case 0:
                                    return PolygonKt.Polygon_qT8xWJw$lambda$18(list, z6111111111116, j18, z48, list11, j15, i36, list10, f22, obj5, z49, f24, lVar5, i15, i16, i17, mVar2, ((Integer) obj1112).intValue());
                                default:
                                    return PolygonKt.Polygon_qT8xWJw$lambda$2(list, z6111111111116, j18, z48, list11, j15, i36, list10, f22, obj5, z49, f24, lVar5, i15, i16, i17, mVar2, ((Integer) obj1112).intValue());
                            }
                        }
                    };
                }
            }
            i18 |= C.ENCODING_PCM_32BIT;
            i48 = i17 & 1024;
            if (i48 != 0) {
                i49 = i16 | 6;
            } else if ((i16 & 6) == 0) {
                if (o0VarE.h(z16)) {
                    i54 = 4;
                } else {
                    i54 = 2;
                }
                i49 = i16 | i54;
            } else {
                i49 = i16;
            }
            i55 = i17 & 2048;
            if (i55 != 0) {
                i49 |= 48;
            } else if ((i16 & 48) != 0) {
                if (o0VarE.i(f15)) {
                    i56 = 32;
                } else {
                    i56 = 16;
                }
                i49 |= i56;
            }
            i57 = i49;
            i58 = i17 & 4096;
            if (i58 != 0) {
                i59 = i57 | 384;
            } else if ((i16 & 384) == 0) {
                if (o0VarE.r(lVar)) {
                    i64 = 256;
                } else {
                    i64 = 128;
                }
                i59 = i57 | i64;
            } else {
                i59 = i57;
            }
            if ((i18 & 306783379) != 306783378) {
                if (i24 != 0) {
                    z19 = false;
                } else {
                    z19 = z17;
                }
                if (i19 != 0) {
                    o4.d0.f128823b.getClass();
                    j16 = o4.d0.f128824c;
                } else {
                    j16 = j8;
                }
                if (i26 != 0) {
                    z18 = false;
                }
                if (i28 != 0) {
                    list4 = p13.j0.f134944a;
                }
                if (i30 != 0) {
                    o4.d0.f128823b.getClass();
                    j15 = o4.d0.f128824c;
                }
                if (i35 != 0) {
                    i36 = 0;
                }
                if (i38 != 0) {
                    list5 = null;
                }
                if (i44 != 0) {
                    f16 = 10.0f;
                } else {
                    f16 = f14;
                }
                if (i46 != 0) {
                    obj2 = null;
                } else {
                    obj2 = obj;
                }
                if (i48 != 0) {
                    z24 = true;
                } else {
                    z24 = z16;
                }
                if (i55 != 0) {
                    f17 = 0.0f;
                } else {
                    f17 = f15;
                }
                aVar = p3.m.f135153a;
                if (i58 != 0) {
                    o0VarE.C(751006162);
                    objQ2 = o0VarE.q();
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new f0(8);
                        o0VarE.K(objQ2);
                    }
                    lVar2 = (e23.l) objQ2;
                    z25 = false;
                    o0VarE.g0(false);
                } else {
                    z25 = false;
                    lVar2 = lVar;
                }
                x1 x1Var116 = p3.n.f135158a;
                if (list.isEmpty()) {
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        final int i6111118 = 1;
                        final boolean z51111111111111114 = z18;
                        final List list1111112 = list5;
                        final long j11114 = j16;
                        final List list1111113 = list4;
                        final float f2111115 = f16;
                        final Object obj1111 = obj2;
                        final boolean z51111111111111115 = z24;
                        final float f2111116 = f17;
                        final boolean z51111111111111116 = z19;
                        final e23.l lVar1111 = lVar2;
                        p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.g0
                            @Override // e23.p
                            public final Object invoke(Object obj1112, Object obj1113) {
                                p3.m mVar2 = (p3.m) obj1112;
                                switch (i6111118) {
                                    case 0:
                                        return PolygonKt.Polygon_qT8xWJw$lambda$18(list, z51111111111111116, j11114, z51111111111111114, list1111113, j15, i36, list1111112, f2111115, obj1111, z51111111111111115, f2111116, lVar1111, i15, i16, i17, mVar2, ((Integer) obj1113).intValue());
                                    default:
                                        return PolygonKt.Polygon_qT8xWJw$lambda$2(list, z51111111111111116, j11114, z51111111111111114, list1111113, j15, i36, list1111112, f2111115, obj1111, z51111111111111115, f2111116, lVar1111, i15, i16, i17, mVar2, ((Integer) obj1113).intValue());
                                }
                            }
                        };
                        return;
                    }
                    return;
                }
                f18 = f17;
                z26 = z25;
                obj3 = obj2;
                i65 = i36;
                list6 = list4;
                f19 = f16;
                z27 = z24;
                lVar3 = lVar2;
                j17 = j15;
                z28 = z18;
                list7 = list5;
                mapApplier = (MapApplier) cVar;
                o0VarE.C(751012594);
                boolean zR11111111111 = o0VarE.r(mapApplier) | o0VarE.r(list);
                if ((i18 & 112) == 32) {
                    z29 = true;
                } else {
                    z29 = z26;
                }
                boolean z51111111111111117 = z29 | zR11111111111;
                if ((i18 & 896) == 256) {
                    z34 = true;
                } else {
                    z34 = z26;
                }
                boolean z51111111111111118 = z51111111111111117 | z34;
                if ((i18 & 7168) == 2048) {
                    z35 = true;
                } else {
                    z35 = z26;
                }
                boolean zR11111111112 = z51111111111111118 | z35 | o0VarE.r(list6);
                if ((458752 & i18) == 131072) {
                    z36 = true;
                } else {
                    z36 = z26;
                }
                boolean z51111111111111119 = zR11111111112 | z36;
                if ((3670016 & i18) == 1048576) {
                    z37 = true;
                } else {
                    z37 = z26;
                }
                boolean zR11111111113 = z51111111111111119 | z37 | o0VarE.r(list7);
                if ((234881024 & i18) == 67108864) {
                    z38 = true;
                } else {
                    z38 = z26;
                }
                boolean z6111111111117 = zR11111111113 | z38;
                if ((i59 & 14) == 4) {
                    z39 = true;
                } else {
                    z39 = z26;
                }
                boolean z6111111111118 = z6111111111117 | z39;
                if ((i59 & 112) == 32) {
                    z44 = true;
                } else {
                    z44 = z26;
                }
                boolean zR11111111114 = z6111111111118 | z44 | o0VarE.r(obj3);
                if ((i59 & 896) == 256) {
                    z45 = true;
                } else {
                    z45 = z26;
                }
                z46 = z45 | zR11111111114;
                objQ = o0VarE.q();
                if (z46) {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        final long j2111114 = j16;
                        list8 = list7;
                        i66 = i65;
                        final boolean z6111111111119 = z19;
                        obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                            @Override // e23.a
                            public final Object invoke() {
                                return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z6111111111119, j2111114, z28, list6, j17, i66, list8, f19, z27, f18);
                            }
                        };
                        list9 = list;
                        o0Var = o0VarE;
                        lVar4 = lVar3;
                        j18 = j2111114;
                        o0Var.K(obj4);
                    } else {
                        obj4 = objQ;
                        o0Var = o0VarE;
                        j18 = j16;
                        lVar4 = lVar3;
                        list9 = list;
                        i66 = i65;
                        list8 = list7;
                    }
                } else {
                    final long j2111115 = j16;
                    list8 = list7;
                    i66 = i65;
                    final boolean z61111111111110 = z19;
                    obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                        @Override // e23.a
                        public final Object invoke() {
                            return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z61111111111110, j2111115, z28, list6, j17, i66, list8, f19, z27, f18);
                        }
                    };
                    list9 = list;
                    o0Var = o0VarE;
                    lVar4 = lVar3;
                    j18 = j2111115;
                    o0Var.K(obj4);
                }
                aVar2 = (e23.a) obj4;
                o0Var.g0(false);
                if (!(cVar instanceof MapApplier)) {
                    p3.p0.l();
                    throw null;
                }
                o0Var.H();
                if (o0Var.T) {
                    o0Var.M(aVar2);
                } else {
                    o0Var.c();
                }
                b4.d(new c0(22), lVar4, o0Var);
                b4.d(new c0(23), list9, o0Var);
                b4.d(new c0(13), Boolean.valueOf(z19), o0Var);
                b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$4
                    @Override // e23.p
                    public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                        m121invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                    public final void m121invoke4WTKRHQ(PolygonNode polygonNode, long j2111116) {
                        polygonNode.getClass();
                        polygonNode.getPolygon().setFillColor(o4.f0.j(j2111116));
                    }
                }, o4.d0.a(j18), o0Var);
                b4.d(new c0(14), Boolean.valueOf(z28), o0Var);
                b4.d(new c0(15), list6, o0Var);
                b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$7
                    @Override // e23.p
                    public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                        m122invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                    public final void m122invoke4WTKRHQ(PolygonNode polygonNode, long j2111116) {
                        polygonNode.getClass();
                        polygonNode.getPolygon().setStrokeColor(o4.f0.j(j2111116));
                    }
                }, o4.d0.a(j17), o0Var);
                c0Var = new c0(16);
                z47 = o0Var.T;
                if (!z47) {
                }
                o0Var.K(Integer.valueOf(i66));
                if (!z47) {
                    o0Var.apply(c0Var, Integer.valueOf(i66));
                }
                b4.d(new c0(17), list8, o0Var);
                b4.d(new c0(18), Float.valueOf(f19), o0Var);
                b4.d(new c0(19), obj3, o0Var);
                b4.d(new c0(20), Boolean.valueOf(z27), o0Var);
                b4.d(new c0(21), Float.valueOf(f18), o0Var);
                o0Var.g0(true);
                int i6111119 = i66;
                obj5 = obj3;
                z48 = z28;
                j15 = j17;
                list10 = list8;
                z49 = z27;
                lVar5 = lVar4;
                list11 = list6;
                i36 = i6111119;
                f22 = f19;
                f24 = f18;
            } else {
                if (i24 != 0) {
                    z19 = false;
                } else {
                    z19 = z17;
                }
                if (i19 != 0) {
                    o4.d0.f128823b.getClass();
                    j16 = o4.d0.f128824c;
                } else {
                    j16 = j8;
                }
                if (i26 != 0) {
                    z18 = false;
                }
                if (i28 != 0) {
                    list4 = p13.j0.f134944a;
                }
                if (i30 != 0) {
                    o4.d0.f128823b.getClass();
                    j15 = o4.d0.f128824c;
                }
                if (i35 != 0) {
                    i36 = 0;
                }
                if (i38 != 0) {
                    list5 = null;
                }
                if (i44 != 0) {
                    f16 = 10.0f;
                } else {
                    f16 = f14;
                }
                if (i46 != 0) {
                    obj2 = null;
                } else {
                    obj2 = obj;
                }
                if (i48 != 0) {
                    z24 = true;
                } else {
                    z24 = z16;
                }
                if (i55 != 0) {
                    f17 = 0.0f;
                } else {
                    f17 = f15;
                }
                aVar = p3.m.f135153a;
                if (i58 != 0) {
                    o0VarE.C(751006162);
                    objQ2 = o0VarE.q();
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new f0(8);
                        o0VarE.K(objQ2);
                    }
                    lVar2 = (e23.l) objQ2;
                    z25 = false;
                    o0VarE.g0(false);
                } else {
                    z25 = false;
                    lVar2 = lVar;
                }
                x1 x1Var117 = p3.n.f135158a;
                if (list.isEmpty()) {
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        final int i61111110 = 1;
                        final boolean z511111111111111110 = z18;
                        final List list1111114 = list5;
                        final long j11115 = j16;
                        final List list1111115 = list4;
                        final float f2111117 = f16;
                        final Object obj1112 = obj2;
                        final boolean z511111111111111111 = z24;
                        final float f2111118 = f17;
                        final boolean z511111111111111112 = z19;
                        final e23.l lVar1112 = lVar2;
                        p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.g0
                            @Override // e23.p
                            public final Object invoke(Object obj1113, Object obj1114) {
                                p3.m mVar2 = (p3.m) obj1113;
                                switch (i61111110) {
                                    case 0:
                                        return PolygonKt.Polygon_qT8xWJw$lambda$18(list, z511111111111111112, j11115, z511111111111111110, list1111115, j15, i36, list1111114, f2111117, obj1112, z511111111111111111, f2111118, lVar1112, i15, i16, i17, mVar2, ((Integer) obj1114).intValue());
                                    default:
                                        return PolygonKt.Polygon_qT8xWJw$lambda$2(list, z511111111111111112, j11115, z511111111111111110, list1111115, j15, i36, list1111114, f2111117, obj1112, z511111111111111111, f2111118, lVar1112, i15, i16, i17, mVar2, ((Integer) obj1114).intValue());
                                }
                            }
                        };
                        return;
                    }
                    return;
                }
                f18 = f17;
                z26 = z25;
                obj3 = obj2;
                i65 = i36;
                list6 = list4;
                f19 = f16;
                z27 = z24;
                lVar3 = lVar2;
                j17 = j15;
                z28 = z18;
                list7 = list5;
                mapApplier = (MapApplier) cVar;
                o0VarE.C(751012594);
                boolean zR11111111115 = o0VarE.r(mapApplier) | o0VarE.r(list);
                if ((i18 & 112) == 32) {
                    z29 = true;
                } else {
                    z29 = z26;
                }
                boolean z511111111111111113 = z29 | zR11111111115;
                if ((i18 & 896) == 256) {
                    z34 = true;
                } else {
                    z34 = z26;
                }
                boolean z511111111111111114 = z511111111111111113 | z34;
                if ((i18 & 7168) == 2048) {
                    z35 = true;
                } else {
                    z35 = z26;
                }
                boolean zR11111111116 = z511111111111111114 | z35 | o0VarE.r(list6);
                if ((458752 & i18) == 131072) {
                    z36 = true;
                } else {
                    z36 = z26;
                }
                boolean z511111111111111115 = zR11111111116 | z36;
                if ((3670016 & i18) == 1048576) {
                    z37 = true;
                } else {
                    z37 = z26;
                }
                boolean zR11111111117 = z511111111111111115 | z37 | o0VarE.r(list7);
                if ((234881024 & i18) == 67108864) {
                    z38 = true;
                } else {
                    z38 = z26;
                }
                boolean z61111111111111 = zR11111111117 | z38;
                if ((i59 & 14) == 4) {
                    z39 = true;
                } else {
                    z39 = z26;
                }
                boolean z61111111111112 = z61111111111111 | z39;
                if ((i59 & 112) == 32) {
                    z44 = true;
                } else {
                    z44 = z26;
                }
                boolean zR11111111118 = z61111111111112 | z44 | o0VarE.r(obj3);
                if ((i59 & 896) == 256) {
                    z45 = true;
                } else {
                    z45 = z26;
                }
                z46 = z45 | zR11111111118;
                objQ = o0VarE.q();
                if (z46) {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        final long j2111116 = j16;
                        list8 = list7;
                        i66 = i65;
                        final boolean z61111111111113 = z19;
                        obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                            @Override // e23.a
                            public final Object invoke() {
                                return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z61111111111113, j2111116, z28, list6, j17, i66, list8, f19, z27, f18);
                            }
                        };
                        list9 = list;
                        o0Var = o0VarE;
                        lVar4 = lVar3;
                        j18 = j2111116;
                        o0Var.K(obj4);
                    } else {
                        obj4 = objQ;
                        o0Var = o0VarE;
                        j18 = j16;
                        lVar4 = lVar3;
                        list9 = list;
                        i66 = i65;
                        list8 = list7;
                    }
                } else {
                    final long j2111117 = j16;
                    list8 = list7;
                    i66 = i65;
                    final boolean z61111111111114 = z19;
                    obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                        @Override // e23.a
                        public final Object invoke() {
                            return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z61111111111114, j2111117, z28, list6, j17, i66, list8, f19, z27, f18);
                        }
                    };
                    list9 = list;
                    o0Var = o0VarE;
                    lVar4 = lVar3;
                    j18 = j2111117;
                    o0Var.K(obj4);
                }
                aVar2 = (e23.a) obj4;
                o0Var.g0(false);
                if (!(cVar instanceof MapApplier)) {
                    p3.p0.l();
                    throw null;
                }
                o0Var.H();
                if (o0Var.T) {
                    o0Var.M(aVar2);
                } else {
                    o0Var.c();
                }
                b4.d(new c0(22), lVar4, o0Var);
                b4.d(new c0(23), list9, o0Var);
                b4.d(new c0(13), Boolean.valueOf(z19), o0Var);
                b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$4
                    @Override // e23.p
                    public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                        m121invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                    public final void m121invoke4WTKRHQ(PolygonNode polygonNode, long j2111118) {
                        polygonNode.getClass();
                        polygonNode.getPolygon().setFillColor(o4.f0.j(j2111118));
                    }
                }, o4.d0.a(j18), o0Var);
                b4.d(new c0(14), Boolean.valueOf(z28), o0Var);
                b4.d(new c0(15), list6, o0Var);
                b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$7
                    @Override // e23.p
                    public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                        m122invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                    public final void m122invoke4WTKRHQ(PolygonNode polygonNode, long j2111118) {
                        polygonNode.getClass();
                        polygonNode.getPolygon().setStrokeColor(o4.f0.j(j2111118));
                    }
                }, o4.d0.a(j17), o0Var);
                c0Var = new c0(16);
                z47 = o0Var.T;
                if (!z47) {
                }
                o0Var.K(Integer.valueOf(i66));
                if (!z47) {
                    o0Var.apply(c0Var, Integer.valueOf(i66));
                }
                b4.d(new c0(17), list8, o0Var);
                b4.d(new c0(18), Float.valueOf(f19), o0Var);
                b4.d(new c0(19), obj3, o0Var);
                b4.d(new c0(20), Boolean.valueOf(z27), o0Var);
                b4.d(new c0(21), Float.valueOf(f18), o0Var);
                o0Var.g0(true);
                int i61111111 = i66;
                obj5 = obj3;
                z48 = z28;
                j15 = j17;
                list10 = list8;
                z49 = z27;
                lVar5 = lVar4;
                list11 = list6;
                i36 = i61111111;
                f22 = f19;
                f24 = f18;
            }
            p2VarI1 = o0Var.i0();
            if (p2VarI1 != null) {
                final int i717 = 0;
                final boolean z61111111111115 = z19;
                p2VarI1.f135219d = new e23.p() { // from class: com.google.maps.android.compose.g0
                    @Override // e23.p
                    public final Object invoke(Object obj1113, Object obj1114) {
                        p3.m mVar2 = (p3.m) obj1113;
                        switch (i717) {
                            case 0:
                                return PolygonKt.Polygon_qT8xWJw$lambda$18(list, z61111111111115, j18, z48, list11, j15, i36, list10, f22, obj5, z49, f24, lVar5, i15, i16, i17, mVar2, ((Integer) obj1114).intValue());
                            default:
                                return PolygonKt.Polygon_qT8xWJw$lambda$2(list, z61111111111115, j18, z48, list11, j15, i36, list10, f22, obj5, z49, f24, lVar5, i15, i16, i17, mVar2, ((Integer) obj1114).intValue());
                        }
                    }
                };
            }
        }
        i18 |= 24576;
        list4 = list2;
        i30 = i17 & 32;
        if (i30 != 0) {
            i18 |= 196608;
            j15 = j14;
        } else {
            j15 = j14;
            if ((i15 & 196608) == 0) {
                if (o0VarE.l(j15)) {
                    i34 = 131072;
                } else {
                    i34 = 65536;
                }
                i18 |= i34;
            }
        }
        i35 = i17 & 64;
        if (i35 != 0) {
            i18 |= 1572864;
            i36 = i14;
        } else {
            i36 = i14;
            if ((i15 & 1572864) == 0) {
                if (o0VarE.k(i36)) {
                    i37 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i37 = 524288;
                }
                i18 |= i37;
            }
        }
        i38 = i17 & 128;
        if (i38 != 0) {
            i18 |= 12582912;
            list5 = list3;
        } else {
            list5 = list3;
            if ((i15 & 12582912) == 0) {
                if (o0VarE.r(list5)) {
                    i39 = 8388608;
                } else {
                    i39 = 4194304;
                }
                i18 |= i39;
            }
        }
        i44 = i17 & 256;
        if (i44 != 0) {
            i18 |= 100663296;
        } else if ((i15 & 100663296) == 0) {
            if (o0VarE.i(f14)) {
                i45 = 67108864;
            } else {
                i45 = 33554432;
            }
            i18 |= i45;
        }
        i46 = i17 & 512;
        if (i46 != 0) {
            if ((i15 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarE.r(obj)) {
                    i47 = 536870912;
                } else {
                    i47 = 268435456;
                }
                i18 |= i47;
            }
            i48 = i17 & 1024;
            if (i48 != 0) {
                i49 = i16 | 6;
            } else if ((i16 & 6) == 0) {
                if (o0VarE.h(z16)) {
                    i54 = 4;
                } else {
                    i54 = 2;
                }
                i49 = i16 | i54;
            } else {
                i49 = i16;
            }
            i55 = i17 & 2048;
            if (i55 != 0) {
                i49 |= 48;
            } else if ((i16 & 48) != 0) {
                if (o0VarE.i(f15)) {
                    i56 = 32;
                } else {
                    i56 = 16;
                }
                i49 |= i56;
            }
            i57 = i49;
            i58 = i17 & 4096;
            if (i58 != 0) {
                i59 = i57 | 384;
            } else if ((i16 & 384) == 0) {
                if (o0VarE.r(lVar)) {
                    i64 = 256;
                } else {
                    i64 = 128;
                }
                i59 = i57 | i64;
            } else {
                i59 = i57;
            }
            if ((i18 & 306783379) != 306783378) {
                if (i24 != 0) {
                    z19 = false;
                } else {
                    z19 = z17;
                }
                if (i19 != 0) {
                    o4.d0.f128823b.getClass();
                    j16 = o4.d0.f128824c;
                } else {
                    j16 = j8;
                }
                if (i26 != 0) {
                    z18 = false;
                }
                if (i28 != 0) {
                    list4 = p13.j0.f134944a;
                }
                if (i30 != 0) {
                    o4.d0.f128823b.getClass();
                    j15 = o4.d0.f128824c;
                }
                if (i35 != 0) {
                    i36 = 0;
                }
                if (i38 != 0) {
                    list5 = null;
                }
                if (i44 != 0) {
                    f16 = 10.0f;
                } else {
                    f16 = f14;
                }
                if (i46 != 0) {
                    obj2 = null;
                } else {
                    obj2 = obj;
                }
                if (i48 != 0) {
                    z24 = true;
                } else {
                    z24 = z16;
                }
                if (i55 != 0) {
                    f17 = 0.0f;
                } else {
                    f17 = f15;
                }
                aVar = p3.m.f135153a;
                if (i58 != 0) {
                    o0VarE.C(751006162);
                    objQ2 = o0VarE.q();
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new f0(8);
                        o0VarE.K(objQ2);
                    }
                    lVar2 = (e23.l) objQ2;
                    z25 = false;
                    o0VarE.g0(false);
                } else {
                    z25 = false;
                    lVar2 = lVar;
                }
                x1 x1Var118 = p3.n.f135158a;
                if (list.isEmpty()) {
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        final int i61111112 = 1;
                        final boolean z511111111111111116 = z18;
                        final List list1111116 = list5;
                        final long j11116 = j16;
                        final List list1111117 = list4;
                        final float f2111119 = f16;
                        final Object obj1113 = obj2;
                        final boolean z511111111111111117 = z24;
                        final float f21111110 = f17;
                        final boolean z511111111111111118 = z19;
                        final e23.l lVar1113 = lVar2;
                        p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.g0
                            @Override // e23.p
                            public final Object invoke(Object obj1114, Object obj1115) {
                                p3.m mVar2 = (p3.m) obj1114;
                                switch (i61111112) {
                                    case 0:
                                        return PolygonKt.Polygon_qT8xWJw$lambda$18(list, z511111111111111118, j11116, z511111111111111116, list1111117, j15, i36, list1111116, f2111119, obj1113, z511111111111111117, f21111110, lVar1113, i15, i16, i17, mVar2, ((Integer) obj1115).intValue());
                                    default:
                                        return PolygonKt.Polygon_qT8xWJw$lambda$2(list, z511111111111111118, j11116, z511111111111111116, list1111117, j15, i36, list1111116, f2111119, obj1113, z511111111111111117, f21111110, lVar1113, i15, i16, i17, mVar2, ((Integer) obj1115).intValue());
                                }
                            }
                        };
                        return;
                    }
                    return;
                }
                f18 = f17;
                z26 = z25;
                obj3 = obj2;
                i65 = i36;
                list6 = list4;
                f19 = f16;
                z27 = z24;
                lVar3 = lVar2;
                j17 = j15;
                z28 = z18;
                list7 = list5;
                mapApplier = (MapApplier) cVar;
                o0VarE.C(751012594);
                boolean zR11111111119 = o0VarE.r(mapApplier) | o0VarE.r(list);
                if ((i18 & 112) == 32) {
                    z29 = true;
                } else {
                    z29 = z26;
                }
                boolean z511111111111111119 = z29 | zR11111111119;
                if ((i18 & 896) == 256) {
                    z34 = true;
                } else {
                    z34 = z26;
                }
                boolean z5111111111111111110 = z511111111111111119 | z34;
                if ((i18 & 7168) == 2048) {
                    z35 = true;
                } else {
                    z35 = z26;
                }
                boolean zR111111111110 = z5111111111111111110 | z35 | o0VarE.r(list6);
                if ((458752 & i18) == 131072) {
                    z36 = true;
                } else {
                    z36 = z26;
                }
                boolean z5111111111111111111 = zR111111111110 | z36;
                if ((3670016 & i18) == 1048576) {
                    z37 = true;
                } else {
                    z37 = z26;
                }
                boolean zR111111111111 = z5111111111111111111 | z37 | o0VarE.r(list7);
                if ((234881024 & i18) == 67108864) {
                    z38 = true;
                } else {
                    z38 = z26;
                }
                boolean z61111111111116 = zR111111111111 | z38;
                if ((i59 & 14) == 4) {
                    z39 = true;
                } else {
                    z39 = z26;
                }
                boolean z61111111111117 = z61111111111116 | z39;
                if ((i59 & 112) == 32) {
                    z44 = true;
                } else {
                    z44 = z26;
                }
                boolean zR111111111112 = z61111111111117 | z44 | o0VarE.r(obj3);
                if ((i59 & 896) == 256) {
                    z45 = true;
                } else {
                    z45 = z26;
                }
                z46 = z45 | zR111111111112;
                objQ = o0VarE.q();
                if (z46) {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        final long j2111118 = j16;
                        list8 = list7;
                        i66 = i65;
                        final boolean z61111111111118 = z19;
                        obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                            @Override // e23.a
                            public final Object invoke() {
                                return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z61111111111118, j2111118, z28, list6, j17, i66, list8, f19, z27, f18);
                            }
                        };
                        list9 = list;
                        o0Var = o0VarE;
                        lVar4 = lVar3;
                        j18 = j2111118;
                        o0Var.K(obj4);
                    } else {
                        obj4 = objQ;
                        o0Var = o0VarE;
                        j18 = j16;
                        lVar4 = lVar3;
                        list9 = list;
                        i66 = i65;
                        list8 = list7;
                    }
                } else {
                    final long j2111119 = j16;
                    list8 = list7;
                    i66 = i65;
                    final boolean z61111111111119 = z19;
                    obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                        @Override // e23.a
                        public final Object invoke() {
                            return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z61111111111119, j2111119, z28, list6, j17, i66, list8, f19, z27, f18);
                        }
                    };
                    list9 = list;
                    o0Var = o0VarE;
                    lVar4 = lVar3;
                    j18 = j2111119;
                    o0Var.K(obj4);
                }
                aVar2 = (e23.a) obj4;
                o0Var.g0(false);
                if (!(cVar instanceof MapApplier)) {
                    p3.p0.l();
                    throw null;
                }
                o0Var.H();
                if (o0Var.T) {
                    o0Var.M(aVar2);
                } else {
                    o0Var.c();
                }
                b4.d(new c0(22), lVar4, o0Var);
                b4.d(new c0(23), list9, o0Var);
                b4.d(new c0(13), Boolean.valueOf(z19), o0Var);
                b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$4
                    @Override // e23.p
                    public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                        m121invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                    public final void m121invoke4WTKRHQ(PolygonNode polygonNode, long j21111110) {
                        polygonNode.getClass();
                        polygonNode.getPolygon().setFillColor(o4.f0.j(j21111110));
                    }
                }, o4.d0.a(j18), o0Var);
                b4.d(new c0(14), Boolean.valueOf(z28), o0Var);
                b4.d(new c0(15), list6, o0Var);
                b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$7
                    @Override // e23.p
                    public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                        m122invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                    public final void m122invoke4WTKRHQ(PolygonNode polygonNode, long j21111110) {
                        polygonNode.getClass();
                        polygonNode.getPolygon().setStrokeColor(o4.f0.j(j21111110));
                    }
                }, o4.d0.a(j17), o0Var);
                c0Var = new c0(16);
                z47 = o0Var.T;
                if (!z47) {
                }
                o0Var.K(Integer.valueOf(i66));
                if (!z47) {
                    o0Var.apply(c0Var, Integer.valueOf(i66));
                }
                b4.d(new c0(17), list8, o0Var);
                b4.d(new c0(18), Float.valueOf(f19), o0Var);
                b4.d(new c0(19), obj3, o0Var);
                b4.d(new c0(20), Boolean.valueOf(z27), o0Var);
                b4.d(new c0(21), Float.valueOf(f18), o0Var);
                o0Var.g0(true);
                int i61111113 = i66;
                obj5 = obj3;
                z48 = z28;
                j15 = j17;
                list10 = list8;
                z49 = z27;
                lVar5 = lVar4;
                list11 = list6;
                i36 = i61111113;
                f22 = f19;
                f24 = f18;
            } else {
                if (i24 != 0) {
                    z19 = false;
                } else {
                    z19 = z17;
                }
                if (i19 != 0) {
                    o4.d0.f128823b.getClass();
                    j16 = o4.d0.f128824c;
                } else {
                    j16 = j8;
                }
                if (i26 != 0) {
                    z18 = false;
                }
                if (i28 != 0) {
                    list4 = p13.j0.f134944a;
                }
                if (i30 != 0) {
                    o4.d0.f128823b.getClass();
                    j15 = o4.d0.f128824c;
                }
                if (i35 != 0) {
                    i36 = 0;
                }
                if (i38 != 0) {
                    list5 = null;
                }
                if (i44 != 0) {
                    f16 = 10.0f;
                } else {
                    f16 = f14;
                }
                if (i46 != 0) {
                    obj2 = null;
                } else {
                    obj2 = obj;
                }
                if (i48 != 0) {
                    z24 = true;
                } else {
                    z24 = z16;
                }
                if (i55 != 0) {
                    f17 = 0.0f;
                } else {
                    f17 = f15;
                }
                aVar = p3.m.f135153a;
                if (i58 != 0) {
                    o0VarE.C(751006162);
                    objQ2 = o0VarE.q();
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new f0(8);
                        o0VarE.K(objQ2);
                    }
                    lVar2 = (e23.l) objQ2;
                    z25 = false;
                    o0VarE.g0(false);
                } else {
                    z25 = false;
                    lVar2 = lVar;
                }
                x1 x1Var119 = p3.n.f135158a;
                if (list.isEmpty()) {
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        final int i61111114 = 1;
                        final boolean z5111111111111111112 = z18;
                        final List list1111118 = list5;
                        final long j11117 = j16;
                        final List list1111119 = list4;
                        final float f21111111 = f16;
                        final Object obj1114 = obj2;
                        final boolean z5111111111111111113 = z24;
                        final float f21111112 = f17;
                        final boolean z5111111111111111114 = z19;
                        final e23.l lVar1114 = lVar2;
                        p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.g0
                            @Override // e23.p
                            public final Object invoke(Object obj1115, Object obj1116) {
                                p3.m mVar2 = (p3.m) obj1115;
                                switch (i61111114) {
                                    case 0:
                                        return PolygonKt.Polygon_qT8xWJw$lambda$18(list, z5111111111111111114, j11117, z5111111111111111112, list1111119, j15, i36, list1111118, f21111111, obj1114, z5111111111111111113, f21111112, lVar1114, i15, i16, i17, mVar2, ((Integer) obj1116).intValue());
                                    default:
                                        return PolygonKt.Polygon_qT8xWJw$lambda$2(list, z5111111111111111114, j11117, z5111111111111111112, list1111119, j15, i36, list1111118, f21111111, obj1114, z5111111111111111113, f21111112, lVar1114, i15, i16, i17, mVar2, ((Integer) obj1116).intValue());
                                }
                            }
                        };
                        return;
                    }
                    return;
                }
                f18 = f17;
                z26 = z25;
                obj3 = obj2;
                i65 = i36;
                list6 = list4;
                f19 = f16;
                z27 = z24;
                lVar3 = lVar2;
                j17 = j15;
                z28 = z18;
                list7 = list5;
                mapApplier = (MapApplier) cVar;
                o0VarE.C(751012594);
                boolean zR111111111113 = o0VarE.r(mapApplier) | o0VarE.r(list);
                if ((i18 & 112) == 32) {
                    z29 = true;
                } else {
                    z29 = z26;
                }
                boolean z5111111111111111115 = z29 | zR111111111113;
                if ((i18 & 896) == 256) {
                    z34 = true;
                } else {
                    z34 = z26;
                }
                boolean z5111111111111111116 = z5111111111111111115 | z34;
                if ((i18 & 7168) == 2048) {
                    z35 = true;
                } else {
                    z35 = z26;
                }
                boolean zR111111111114 = z5111111111111111116 | z35 | o0VarE.r(list6);
                if ((458752 & i18) == 131072) {
                    z36 = true;
                } else {
                    z36 = z26;
                }
                boolean z5111111111111111117 = zR111111111114 | z36;
                if ((3670016 & i18) == 1048576) {
                    z37 = true;
                } else {
                    z37 = z26;
                }
                boolean zR111111111115 = z5111111111111111117 | z37 | o0VarE.r(list7);
                if ((234881024 & i18) == 67108864) {
                    z38 = true;
                } else {
                    z38 = z26;
                }
                boolean z611111111111110 = zR111111111115 | z38;
                if ((i59 & 14) == 4) {
                    z39 = true;
                } else {
                    z39 = z26;
                }
                boolean z611111111111111 = z611111111111110 | z39;
                if ((i59 & 112) == 32) {
                    z44 = true;
                } else {
                    z44 = z26;
                }
                boolean zR111111111116 = z611111111111111 | z44 | o0VarE.r(obj3);
                if ((i59 & 896) == 256) {
                    z45 = true;
                } else {
                    z45 = z26;
                }
                z46 = z45 | zR111111111116;
                objQ = o0VarE.q();
                if (z46) {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        final long j21111110 = j16;
                        list8 = list7;
                        i66 = i65;
                        final boolean z611111111111112 = z19;
                        obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                            @Override // e23.a
                            public final Object invoke() {
                                return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z611111111111112, j21111110, z28, list6, j17, i66, list8, f19, z27, f18);
                            }
                        };
                        list9 = list;
                        o0Var = o0VarE;
                        lVar4 = lVar3;
                        j18 = j21111110;
                        o0Var.K(obj4);
                    } else {
                        obj4 = objQ;
                        o0Var = o0VarE;
                        j18 = j16;
                        lVar4 = lVar3;
                        list9 = list;
                        i66 = i65;
                        list8 = list7;
                    }
                } else {
                    final long j21111111 = j16;
                    list8 = list7;
                    i66 = i65;
                    final boolean z611111111111113 = z19;
                    obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                        @Override // e23.a
                        public final Object invoke() {
                            return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z611111111111113, j21111111, z28, list6, j17, i66, list8, f19, z27, f18);
                        }
                    };
                    list9 = list;
                    o0Var = o0VarE;
                    lVar4 = lVar3;
                    j18 = j21111111;
                    o0Var.K(obj4);
                }
                aVar2 = (e23.a) obj4;
                o0Var.g0(false);
                if (!(cVar instanceof MapApplier)) {
                    p3.p0.l();
                    throw null;
                }
                o0Var.H();
                if (o0Var.T) {
                    o0Var.M(aVar2);
                } else {
                    o0Var.c();
                }
                b4.d(new c0(22), lVar4, o0Var);
                b4.d(new c0(23), list9, o0Var);
                b4.d(new c0(13), Boolean.valueOf(z19), o0Var);
                b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$4
                    @Override // e23.p
                    public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                        m121invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                    public final void m121invoke4WTKRHQ(PolygonNode polygonNode, long j21111112) {
                        polygonNode.getClass();
                        polygonNode.getPolygon().setFillColor(o4.f0.j(j21111112));
                    }
                }, o4.d0.a(j18), o0Var);
                b4.d(new c0(14), Boolean.valueOf(z28), o0Var);
                b4.d(new c0(15), list6, o0Var);
                b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$7
                    @Override // e23.p
                    public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                        m122invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                    public final void m122invoke4WTKRHQ(PolygonNode polygonNode, long j21111112) {
                        polygonNode.getClass();
                        polygonNode.getPolygon().setStrokeColor(o4.f0.j(j21111112));
                    }
                }, o4.d0.a(j17), o0Var);
                c0Var = new c0(16);
                z47 = o0Var.T;
                if (!z47) {
                }
                o0Var.K(Integer.valueOf(i66));
                if (!z47) {
                    o0Var.apply(c0Var, Integer.valueOf(i66));
                }
                b4.d(new c0(17), list8, o0Var);
                b4.d(new c0(18), Float.valueOf(f19), o0Var);
                b4.d(new c0(19), obj3, o0Var);
                b4.d(new c0(20), Boolean.valueOf(z27), o0Var);
                b4.d(new c0(21), Float.valueOf(f18), o0Var);
                o0Var.g0(true);
                int i61111115 = i66;
                obj5 = obj3;
                z48 = z28;
                j15 = j17;
                list10 = list8;
                z49 = z27;
                lVar5 = lVar4;
                list11 = list6;
                i36 = i61111115;
                f22 = f19;
                f24 = f18;
            }
            p2VarI1 = o0Var.i0();
            if (p2VarI1 != null) {
                final int i718 = 0;
                final boolean z611111111111114 = z19;
                p2VarI1.f135219d = new e23.p() { // from class: com.google.maps.android.compose.g0
                    @Override // e23.p
                    public final Object invoke(Object obj1115, Object obj1116) {
                        p3.m mVar2 = (p3.m) obj1115;
                        switch (i718) {
                            case 0:
                                return PolygonKt.Polygon_qT8xWJw$lambda$18(list, z611111111111114, j18, z48, list11, j15, i36, list10, f22, obj5, z49, f24, lVar5, i15, i16, i17, mVar2, ((Integer) obj1116).intValue());
                            default:
                                return PolygonKt.Polygon_qT8xWJw$lambda$2(list, z611111111111114, j18, z48, list11, j15, i36, list10, f22, obj5, z49, f24, lVar5, i15, i16, i17, mVar2, ((Integer) obj1116).intValue());
                        }
                    }
                };
            }
        }
        i18 |= C.ENCODING_PCM_32BIT;
        i48 = i17 & 1024;
        if (i48 != 0) {
            i49 = i16 | 6;
        } else if ((i16 & 6) == 0) {
            if (o0VarE.h(z16)) {
                i54 = 4;
            } else {
                i54 = 2;
            }
            i49 = i16 | i54;
        } else {
            i49 = i16;
        }
        i55 = i17 & 2048;
        if (i55 != 0) {
            i49 |= 48;
        } else if ((i16 & 48) != 0) {
            if (o0VarE.i(f15)) {
                i56 = 32;
            } else {
                i56 = 16;
            }
            i49 |= i56;
        }
        i57 = i49;
        i58 = i17 & 4096;
        if (i58 != 0) {
            i59 = i57 | 384;
        } else if ((i16 & 384) == 0) {
            if (o0VarE.r(lVar)) {
                i64 = 256;
            } else {
                i64 = 128;
            }
            i59 = i57 | i64;
        } else {
            i59 = i57;
        }
        if ((i18 & 306783379) != 306783378) {
            if (i24 != 0) {
                z19 = false;
            } else {
                z19 = z17;
            }
            if (i19 != 0) {
                o4.d0.f128823b.getClass();
                j16 = o4.d0.f128824c;
            } else {
                j16 = j8;
            }
            if (i26 != 0) {
                z18 = false;
            }
            if (i28 != 0) {
                list4 = p13.j0.f134944a;
            }
            if (i30 != 0) {
                o4.d0.f128823b.getClass();
                j15 = o4.d0.f128824c;
            }
            if (i35 != 0) {
                i36 = 0;
            }
            if (i38 != 0) {
                list5 = null;
            }
            if (i44 != 0) {
                f16 = 10.0f;
            } else {
                f16 = f14;
            }
            if (i46 != 0) {
                obj2 = null;
            } else {
                obj2 = obj;
            }
            if (i48 != 0) {
                z24 = true;
            } else {
                z24 = z16;
            }
            if (i55 != 0) {
                f17 = 0.0f;
            } else {
                f17 = f15;
            }
            aVar = p3.m.f135153a;
            if (i58 != 0) {
                o0VarE.C(751006162);
                objQ2 = o0VarE.q();
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new f0(8);
                    o0VarE.K(objQ2);
                }
                lVar2 = (e23.l) objQ2;
                z25 = false;
                o0VarE.g0(false);
            } else {
                z25 = false;
                lVar2 = lVar;
            }
            x1 x1Var1110 = p3.n.f135158a;
            if (list.isEmpty()) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    final int i61111116 = 1;
                    final boolean z5111111111111111118 = z18;
                    final List list11111110 = list5;
                    final long j11118 = j16;
                    final List list11111111 = list4;
                    final float f21111113 = f16;
                    final Object obj1115 = obj2;
                    final boolean z5111111111111111119 = z24;
                    final float f21111114 = f17;
                    final boolean z51111111111111111110 = z19;
                    final e23.l lVar1115 = lVar2;
                    p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.g0
                        @Override // e23.p
                        public final Object invoke(Object obj1116, Object obj1117) {
                            p3.m mVar2 = (p3.m) obj1116;
                            switch (i61111116) {
                                case 0:
                                    return PolygonKt.Polygon_qT8xWJw$lambda$18(list, z51111111111111111110, j11118, z5111111111111111118, list11111111, j15, i36, list11111110, f21111113, obj1115, z5111111111111111119, f21111114, lVar1115, i15, i16, i17, mVar2, ((Integer) obj1117).intValue());
                                default:
                                    return PolygonKt.Polygon_qT8xWJw$lambda$2(list, z51111111111111111110, j11118, z5111111111111111118, list11111111, j15, i36, list11111110, f21111113, obj1115, z5111111111111111119, f21111114, lVar1115, i15, i16, i17, mVar2, ((Integer) obj1117).intValue());
                            }
                        }
                    };
                    return;
                }
                return;
            }
            f18 = f17;
            z26 = z25;
            obj3 = obj2;
            i65 = i36;
            list6 = list4;
            f19 = f16;
            z27 = z24;
            lVar3 = lVar2;
            j17 = j15;
            z28 = z18;
            list7 = list5;
            mapApplier = (MapApplier) cVar;
            o0VarE.C(751012594);
            boolean zR111111111117 = o0VarE.r(mapApplier) | o0VarE.r(list);
            if ((i18 & 112) == 32) {
                z29 = true;
            } else {
                z29 = z26;
            }
            boolean z51111111111111111111 = z29 | zR111111111117;
            if ((i18 & 896) == 256) {
                z34 = true;
            } else {
                z34 = z26;
            }
            boolean z51111111111111111112 = z51111111111111111111 | z34;
            if ((i18 & 7168) == 2048) {
                z35 = true;
            } else {
                z35 = z26;
            }
            boolean zR111111111118 = z51111111111111111112 | z35 | o0VarE.r(list6);
            if ((458752 & i18) == 131072) {
                z36 = true;
            } else {
                z36 = z26;
            }
            boolean z51111111111111111113 = zR111111111118 | z36;
            if ((3670016 & i18) == 1048576) {
                z37 = true;
            } else {
                z37 = z26;
            }
            boolean zR111111111119 = z51111111111111111113 | z37 | o0VarE.r(list7);
            if ((234881024 & i18) == 67108864) {
                z38 = true;
            } else {
                z38 = z26;
            }
            boolean z611111111111115 = zR111111111119 | z38;
            if ((i59 & 14) == 4) {
                z39 = true;
            } else {
                z39 = z26;
            }
            boolean z611111111111116 = z611111111111115 | z39;
            if ((i59 & 112) == 32) {
                z44 = true;
            } else {
                z44 = z26;
            }
            boolean zR1111111111110 = z611111111111116 | z44 | o0VarE.r(obj3);
            if ((i59 & 896) == 256) {
                z45 = true;
            } else {
                z45 = z26;
            }
            z46 = z45 | zR1111111111110;
            objQ = o0VarE.q();
            if (z46) {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    final long j21111112 = j16;
                    list8 = list7;
                    i66 = i65;
                    final boolean z611111111111117 = z19;
                    obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                        @Override // e23.a
                        public final Object invoke() {
                            return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z611111111111117, j21111112, z28, list6, j17, i66, list8, f19, z27, f18);
                        }
                    };
                    list9 = list;
                    o0Var = o0VarE;
                    lVar4 = lVar3;
                    j18 = j21111112;
                    o0Var.K(obj4);
                } else {
                    obj4 = objQ;
                    o0Var = o0VarE;
                    j18 = j16;
                    lVar4 = lVar3;
                    list9 = list;
                    i66 = i65;
                    list8 = list7;
                }
            } else {
                final long j21111113 = j16;
                list8 = list7;
                i66 = i65;
                final boolean z611111111111118 = z19;
                obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                    @Override // e23.a
                    public final Object invoke() {
                        return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z611111111111118, j21111113, z28, list6, j17, i66, list8, f19, z27, f18);
                    }
                };
                list9 = list;
                o0Var = o0VarE;
                lVar4 = lVar3;
                j18 = j21111113;
                o0Var.K(obj4);
            }
            aVar2 = (e23.a) obj4;
            o0Var.g0(false);
            if (!(cVar instanceof MapApplier)) {
                p3.p0.l();
                throw null;
            }
            o0Var.H();
            if (o0Var.T) {
                o0Var.M(aVar2);
            } else {
                o0Var.c();
            }
            b4.d(new c0(22), lVar4, o0Var);
            b4.d(new c0(23), list9, o0Var);
            b4.d(new c0(13), Boolean.valueOf(z19), o0Var);
            b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$4
                @Override // e23.p
                public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                    m121invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                public final void m121invoke4WTKRHQ(PolygonNode polygonNode, long j21111114) {
                    polygonNode.getClass();
                    polygonNode.getPolygon().setFillColor(o4.f0.j(j21111114));
                }
            }, o4.d0.a(j18), o0Var);
            b4.d(new c0(14), Boolean.valueOf(z28), o0Var);
            b4.d(new c0(15), list6, o0Var);
            b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$7
                @Override // e23.p
                public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                    m122invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                public final void m122invoke4WTKRHQ(PolygonNode polygonNode, long j21111114) {
                    polygonNode.getClass();
                    polygonNode.getPolygon().setStrokeColor(o4.f0.j(j21111114));
                }
            }, o4.d0.a(j17), o0Var);
            c0Var = new c0(16);
            z47 = o0Var.T;
            if (!z47) {
            }
            o0Var.K(Integer.valueOf(i66));
            if (!z47) {
                o0Var.apply(c0Var, Integer.valueOf(i66));
            }
            b4.d(new c0(17), list8, o0Var);
            b4.d(new c0(18), Float.valueOf(f19), o0Var);
            b4.d(new c0(19), obj3, o0Var);
            b4.d(new c0(20), Boolean.valueOf(z27), o0Var);
            b4.d(new c0(21), Float.valueOf(f18), o0Var);
            o0Var.g0(true);
            int i61111117 = i66;
            obj5 = obj3;
            z48 = z28;
            j15 = j17;
            list10 = list8;
            z49 = z27;
            lVar5 = lVar4;
            list11 = list6;
            i36 = i61111117;
            f22 = f19;
            f24 = f18;
        } else {
            if (i24 != 0) {
                z19 = false;
            } else {
                z19 = z17;
            }
            if (i19 != 0) {
                o4.d0.f128823b.getClass();
                j16 = o4.d0.f128824c;
            } else {
                j16 = j8;
            }
            if (i26 != 0) {
                z18 = false;
            }
            if (i28 != 0) {
                list4 = p13.j0.f134944a;
            }
            if (i30 != 0) {
                o4.d0.f128823b.getClass();
                j15 = o4.d0.f128824c;
            }
            if (i35 != 0) {
                i36 = 0;
            }
            if (i38 != 0) {
                list5 = null;
            }
            if (i44 != 0) {
                f16 = 10.0f;
            } else {
                f16 = f14;
            }
            if (i46 != 0) {
                obj2 = null;
            } else {
                obj2 = obj;
            }
            if (i48 != 0) {
                z24 = true;
            } else {
                z24 = z16;
            }
            if (i55 != 0) {
                f17 = 0.0f;
            } else {
                f17 = f15;
            }
            aVar = p3.m.f135153a;
            if (i58 != 0) {
                o0VarE.C(751006162);
                objQ2 = o0VarE.q();
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new f0(8);
                    o0VarE.K(objQ2);
                }
                lVar2 = (e23.l) objQ2;
                z25 = false;
                o0VarE.g0(false);
            } else {
                z25 = false;
                lVar2 = lVar;
            }
            x1 x1Var1111 = p3.n.f135158a;
            if (list.isEmpty()) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    final int i61111118 = 1;
                    final boolean z51111111111111111114 = z18;
                    final List list11111112 = list5;
                    final long j11119 = j16;
                    final List list11111113 = list4;
                    final float f21111115 = f16;
                    final Object obj1116 = obj2;
                    final boolean z51111111111111111115 = z24;
                    final float f21111116 = f17;
                    final boolean z51111111111111111116 = z19;
                    final e23.l lVar1116 = lVar2;
                    p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.g0
                        @Override // e23.p
                        public final Object invoke(Object obj1117, Object obj1118) {
                            p3.m mVar2 = (p3.m) obj1117;
                            switch (i61111118) {
                                case 0:
                                    return PolygonKt.Polygon_qT8xWJw$lambda$18(list, z51111111111111111116, j11119, z51111111111111111114, list11111113, j15, i36, list11111112, f21111115, obj1116, z51111111111111111115, f21111116, lVar1116, i15, i16, i17, mVar2, ((Integer) obj1118).intValue());
                                default:
                                    return PolygonKt.Polygon_qT8xWJw$lambda$2(list, z51111111111111111116, j11119, z51111111111111111114, list11111113, j15, i36, list11111112, f21111115, obj1116, z51111111111111111115, f21111116, lVar1116, i15, i16, i17, mVar2, ((Integer) obj1118).intValue());
                            }
                        }
                    };
                    return;
                }
                return;
            }
            f18 = f17;
            z26 = z25;
            obj3 = obj2;
            i65 = i36;
            list6 = list4;
            f19 = f16;
            z27 = z24;
            lVar3 = lVar2;
            j17 = j15;
            z28 = z18;
            list7 = list5;
            mapApplier = (MapApplier) cVar;
            o0VarE.C(751012594);
            boolean zR1111111111111 = o0VarE.r(mapApplier) | o0VarE.r(list);
            if ((i18 & 112) == 32) {
                z29 = true;
            } else {
                z29 = z26;
            }
            boolean z51111111111111111117 = z29 | zR1111111111111;
            if ((i18 & 896) == 256) {
                z34 = true;
            } else {
                z34 = z26;
            }
            boolean z51111111111111111118 = z51111111111111111117 | z34;
            if ((i18 & 7168) == 2048) {
                z35 = true;
            } else {
                z35 = z26;
            }
            boolean zR1111111111112 = z51111111111111111118 | z35 | o0VarE.r(list6);
            if ((458752 & i18) == 131072) {
                z36 = true;
            } else {
                z36 = z26;
            }
            boolean z51111111111111111119 = zR1111111111112 | z36;
            if ((3670016 & i18) == 1048576) {
                z37 = true;
            } else {
                z37 = z26;
            }
            boolean zR1111111111113 = z51111111111111111119 | z37 | o0VarE.r(list7);
            if ((234881024 & i18) == 67108864) {
                z38 = true;
            } else {
                z38 = z26;
            }
            boolean z611111111111119 = zR1111111111113 | z38;
            if ((i59 & 14) == 4) {
                z39 = true;
            } else {
                z39 = z26;
            }
            boolean z6111111111111110 = z611111111111119 | z39;
            if ((i59 & 112) == 32) {
                z44 = true;
            } else {
                z44 = z26;
            }
            boolean zR1111111111114 = z6111111111111110 | z44 | o0VarE.r(obj3);
            if ((i59 & 896) == 256) {
                z45 = true;
            } else {
                z45 = z26;
            }
            z46 = z45 | zR1111111111114;
            objQ = o0VarE.q();
            if (z46) {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    final long j21111114 = j16;
                    list8 = list7;
                    i66 = i65;
                    final boolean z6111111111111111 = z19;
                    obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                        @Override // e23.a
                        public final Object invoke() {
                            return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z6111111111111111, j21111114, z28, list6, j17, i66, list8, f19, z27, f18);
                        }
                    };
                    list9 = list;
                    o0Var = o0VarE;
                    lVar4 = lVar3;
                    j18 = j21111114;
                    o0Var.K(obj4);
                } else {
                    obj4 = objQ;
                    o0Var = o0VarE;
                    j18 = j16;
                    lVar4 = lVar3;
                    list9 = list;
                    i66 = i65;
                    list8 = list7;
                }
            } else {
                final long j21111115 = j16;
                list8 = list7;
                i66 = i65;
                final boolean z6111111111111112 = z19;
                obj4 = new e23.a() { // from class: com.google.maps.android.compose.h0
                    @Override // e23.a
                    public final Object invoke() {
                        return PolygonKt.Polygon_qT8xWJw$lambda$5$lambda$4(mapApplier, obj3, lVar3, list, z6111111111111112, j21111115, z28, list6, j17, i66, list8, f19, z27, f18);
                    }
                };
                list9 = list;
                o0Var = o0VarE;
                lVar4 = lVar3;
                j18 = j21111115;
                o0Var.K(obj4);
            }
            aVar2 = (e23.a) obj4;
            o0Var.g0(false);
            if (!(cVar instanceof MapApplier)) {
                p3.p0.l();
                throw null;
            }
            o0Var.H();
            if (o0Var.T) {
                o0Var.M(aVar2);
            } else {
                o0Var.c();
            }
            b4.d(new c0(22), lVar4, o0Var);
            b4.d(new c0(23), list9, o0Var);
            b4.d(new c0(13), Boolean.valueOf(z19), o0Var);
            b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$4
                @Override // e23.p
                public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                    m121invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                public final void m121invoke4WTKRHQ(PolygonNode polygonNode, long j21111116) {
                    polygonNode.getClass();
                    polygonNode.getPolygon().setFillColor(o4.f0.j(j21111116));
                }
            }, o4.d0.a(j18), o0Var);
            b4.d(new c0(14), Boolean.valueOf(z28), o0Var);
            b4.d(new c0(15), list6, o0Var);
            b4.d(new e23.p<PolygonNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.PolygonKt$Polygon$4$7
                @Override // e23.p
                public /* synthetic */ Unit invoke(PolygonNode polygonNode, o4.d0 d0Var) {
                    m122invoke4WTKRHQ(polygonNode, d0Var.f128833a);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                public final void m122invoke4WTKRHQ(PolygonNode polygonNode, long j21111116) {
                    polygonNode.getClass();
                    polygonNode.getPolygon().setStrokeColor(o4.f0.j(j21111116));
                }
            }, o4.d0.a(j17), o0Var);
            c0Var = new c0(16);
            z47 = o0Var.T;
            if (!z47) {
            }
            o0Var.K(Integer.valueOf(i66));
            if (!z47) {
                o0Var.apply(c0Var, Integer.valueOf(i66));
            }
            b4.d(new c0(17), list8, o0Var);
            b4.d(new c0(18), Float.valueOf(f19), o0Var);
            b4.d(new c0(19), obj3, o0Var);
            b4.d(new c0(20), Boolean.valueOf(z27), o0Var);
            b4.d(new c0(21), Float.valueOf(f18), o0Var);
            o0Var.g0(true);
            int i61111119 = i66;
            obj5 = obj3;
            z48 = z28;
            j15 = j17;
            list10 = list8;
            z49 = z27;
            lVar5 = lVar4;
            list11 = list6;
            i36 = i61111119;
            f22 = f19;
            f24 = f18;
        }
        p2VarI1 = o0Var.i0();
        if (p2VarI1 != null) {
            final int i719 = 0;
            final boolean z6111111111111113 = z19;
            p2VarI1.f135219d = new e23.p() { // from class: com.google.maps.android.compose.g0
                @Override // e23.p
                public final Object invoke(Object obj1117, Object obj1118) {
                    p3.m mVar2 = (p3.m) obj1117;
                    switch (i719) {
                        case 0:
                            return PolygonKt.Polygon_qT8xWJw$lambda$18(list, z6111111111111113, j18, z48, list11, j15, i36, list10, f22, obj5, z49, f24, lVar5, i15, i16, i17, mVar2, ((Integer) obj1118).intValue());
                        default:
                            return PolygonKt.Polygon_qT8xWJw$lambda$2(list, z6111111111111113, j18, z48, list11, j15, i36, list10, f22, obj5, z49, f24, lVar5, i15, i16, i17, mVar2, ((Integer) obj1118).intValue());
                    }
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Polygon_qT8xWJw$lambda$1$lambda$0(Polygon polygon) {
        polygon.getClass();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Polygon_qT8xWJw$lambda$17$lambda$10(PolygonNode polygonNode, List list) {
        polygonNode.getClass();
        list.getClass();
        polygonNode.getPolygon().setHoles(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Polygon_qT8xWJw$lambda$17$lambda$11(PolygonNode polygonNode, int i14) {
        polygonNode.getClass();
        polygonNode.getPolygon().setStrokeJointType(i14);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Polygon_qT8xWJw$lambda$17$lambda$12(PolygonNode polygonNode, List list) {
        polygonNode.getClass();
        polygonNode.getPolygon().setStrokePattern(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Polygon_qT8xWJw$lambda$17$lambda$13(PolygonNode polygonNode, float f14) {
        polygonNode.getClass();
        polygonNode.getPolygon().setStrokeWidth(f14);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Polygon_qT8xWJw$lambda$17$lambda$14(PolygonNode polygonNode, Object obj) {
        polygonNode.getClass();
        polygonNode.getPolygon().setTag(obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Polygon_qT8xWJw$lambda$17$lambda$15(PolygonNode polygonNode, boolean z14) {
        polygonNode.getClass();
        polygonNode.getPolygon().setVisible(z14);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Polygon_qT8xWJw$lambda$17$lambda$16(PolygonNode polygonNode, float f14) {
        polygonNode.getClass();
        polygonNode.getPolygon().setZIndex(f14);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Polygon_qT8xWJw$lambda$17$lambda$6(PolygonNode polygonNode, e23.l lVar) {
        polygonNode.getClass();
        lVar.getClass();
        polygonNode.setOnPolygonClick(lVar);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Polygon_qT8xWJw$lambda$17$lambda$7(PolygonNode polygonNode, List list) {
        polygonNode.getClass();
        list.getClass();
        polygonNode.getPolygon().setPoints(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Polygon_qT8xWJw$lambda$17$lambda$8(PolygonNode polygonNode, boolean z14) {
        polygonNode.getClass();
        polygonNode.getPolygon().setClickable(z14);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Polygon_qT8xWJw$lambda$17$lambda$9(PolygonNode polygonNode, boolean z14) {
        polygonNode.getClass();
        polygonNode.getPolygon().setGeodesic(z14);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Polygon_qT8xWJw$lambda$18(List list, boolean z14, long j8, boolean z15, List list2, long j14, int i14, List list3, float f14, Object obj, boolean z16, float f15, e23.l lVar, int i15, int i16, int i17, p3.m mVar, int i18) {
        m120PolygonqT8xWJw(list, z14, j8, z15, list2, j14, i14, list3, f14, obj, z16, f15, lVar, mVar, p3.p0.t(i15 | 1), p3.p0.t(i16), i17);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Polygon_qT8xWJw$lambda$2(List list, boolean z14, long j8, boolean z15, List list2, long j14, int i14, List list3, float f14, Object obj, boolean z16, float f15, e23.l lVar, int i15, int i16, int i17, p3.m mVar, int i18) {
        m120PolygonqT8xWJw(list, z14, j8, z15, list2, j14, i14, list3, f14, obj, z16, f15, lVar, mVar, p3.p0.t(i15 | 1), p3.p0.t(i16), i17);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PolygonNode Polygon_qT8xWJw$lambda$5$lambda$4(MapApplier mapApplier, Object obj, e23.l lVar, List list, boolean z14, long j8, boolean z15, List list2, long j14, int i14, List list3, float f14, boolean z16, float f15) {
        GoogleMap map;
        if (mapApplier == null || (map = mapApplier.getMap()) == null) {
            vb.h.z("Error adding polygon");
            return null;
        }
        PolygonOptions polygonOptions = new PolygonOptions();
        polygonOptions.addAll(list);
        polygonOptions.clickable(z14);
        polygonOptions.fillColor(o4.f0.j(j8));
        polygonOptions.geodesic(z15);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            polygonOptions.addHole((List) it.next());
        }
        polygonOptions.strokeColor(o4.f0.j(j14));
        polygonOptions.strokeJointType(i14);
        polygonOptions.strokePattern(list3);
        polygonOptions.strokeWidth(f14);
        polygonOptions.visible(z16);
        polygonOptions.zIndex(f15);
        Polygon polygonAddPolygon = map.addPolygon(polygonOptions);
        polygonAddPolygon.getClass();
        polygonAddPolygon.setTag(obj);
        return new PolygonNode(polygonAddPolygon, lVar);
    }
}
