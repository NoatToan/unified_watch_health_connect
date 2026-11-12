package com.google.maps.android.compose;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import com.nimbusds.jose.HeaderParameterNames;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u0091\u0001\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\f2\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/google/android/gms/maps/model/LatLng;", TtmlNode.CENTER, "", "clickable", "Lo4/d0;", "fillColor", "", "radius", "strokeColor", "", "Lcom/google/android/gms/maps/model/PatternItem;", "strokePattern", "", "strokeWidth", "", HeaderParameterNames.AUTHENTICATION_TAG, "visible", "zIndex", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/Circle;", "", "onClick", "Circle-rQ_Q3OA", "(Lcom/google/android/gms/maps/model/LatLng;ZJDJLjava/util/List;FLjava/lang/Object;ZFLe23/l;Lp3/m;III)V", "Circle", "maps-compose_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class CircleKt {
    /* JADX WARN: Code duplicated, block: B:101:0x012e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0134  */
    /* JADX WARN: Code duplicated, block: B:104:0x0137  */
    /* JADX WARN: Code duplicated, block: B:108:0x013f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0148  */
    /* JADX WARN: Code duplicated, block: B:111:0x014c  */
    /* JADX WARN: Code duplicated, block: B:113:0x0156  */
    /* JADX WARN: Code duplicated, block: B:114:0x0159  */
    /* JADX WARN: Code duplicated, block: B:116:0x015e  */
    /* JADX WARN: Code duplicated, block: B:119:0x016e  */
    /* JADX WARN: Code duplicated, block: B:125:0x0191 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x0193  */
    /* JADX WARN: Code duplicated, block: B:127:0x0195  */
    /* JADX WARN: Code duplicated, block: B:129:0x0199  */
    /* JADX WARN: Code duplicated, block: B:131:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:136:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:137:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:141:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:142:0x01be  */
    /* JADX WARN: Code duplicated, block: B:144:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:145:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:147:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:148:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:151:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:153:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:154:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:156:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:159:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:161:0x0204  */
    /* JADX WARN: Code duplicated, block: B:164:0x021a  */
    /* JADX WARN: Code duplicated, block: B:165:0x021e  */
    /* JADX WARN: Code duplicated, block: B:168:0x0229  */
    /* JADX WARN: Code duplicated, block: B:169:0x022b  */
    /* JADX WARN: Code duplicated, block: B:172:0x0236  */
    /* JADX WARN: Code duplicated, block: B:173:0x0238  */
    /* JADX WARN: Code duplicated, block: B:176:0x0243  */
    /* JADX WARN: Code duplicated, block: B:177:0x0245  */
    /* JADX WARN: Code duplicated, block: B:180:0x0252  */
    /* JADX WARN: Code duplicated, block: B:181:0x0254  */
    /* JADX WARN: Code duplicated, block: B:184:0x0265  */
    /* JADX WARN: Code duplicated, block: B:185:0x0267  */
    /* JADX WARN: Code duplicated, block: B:188:0x0273  */
    /* JADX WARN: Code duplicated, block: B:189:0x0275  */
    /* JADX WARN: Code duplicated, block: B:192:0x027f  */
    /* JADX WARN: Code duplicated, block: B:193:0x0281  */
    /* JADX WARN: Code duplicated, block: B:196:0x028f  */
    /* JADX WARN: Code duplicated, block: B:197:0x0291  */
    /* JADX WARN: Code duplicated, block: B:200:0x0299  */
    /* JADX WARN: Code duplicated, block: B:203:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:204:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:207:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:209:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:210:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:214:0x0397  */
    /* JADX WARN: Code duplicated, block: B:216:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:218:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00df  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:88:0x0103  */
    /* JADX WARN: Code duplicated, block: B:89:0x0108  */
    /* JADX WARN: Code duplicated, block: B:91:0x010e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0114  */
    /* JADX WARN: Code duplicated, block: B:94:0x0117  */
    /* JADX WARN: Code duplicated, block: B:98:0x0123  */
    /* JADX WARN: Code duplicated, block: B:99:0x0128  */
    @GoogleMapComposable
    /* JADX INFO: renamed from: Circle-rQ_Q3OA, reason: not valid java name */
    public static final void m106CirclerQ_Q3OA(final LatLng latLng, boolean z14, long j8, double d14, long j14, List<? extends PatternItem> list, float f14, Object obj, boolean z15, float f15, e23.l<? super Circle, Unit> lVar, p3.m mVar, final int i14, final int i15, final int i16) {
        int i17;
        int i18;
        long j15;
        int i19;
        int i24;
        double d15;
        int i25;
        int i26;
        int i27;
        final long j16;
        int i28;
        int i29;
        List<? extends PatternItem> list2;
        int i30;
        int i34;
        float f16;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i44;
        int i45;
        int i46;
        int i47;
        int i48;
        boolean z16;
        List<? extends PatternItem> list3;
        Object obj2;
        boolean z17;
        float f17;
        p3.m.a aVar;
        e23.l<? super Circle, Unit> lVar2;
        MapApplier mapApplier;
        final e23.l<? super Circle, Unit> lVar3;
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
        boolean z36;
        Object objQ;
        Object obj3;
        final float f18;
        final boolean z37;
        final List<? extends PatternItem> list4;
        final float f19;
        final boolean z38;
        final long j17;
        final double d16;
        final long j18;
        LatLng latLng2;
        e23.l<? super Circle, Unit> lVar4;
        Object obj4;
        p3.o0 o0Var;
        e23.a aVar2;
        boolean z39;
        final Object obj5;
        final float f22;
        final float f24;
        final e23.l<? super Circle, Unit> lVar5;
        final long j19;
        final double d17;
        final List<? extends PatternItem> list5;
        final boolean z44;
        Object objQ2;
        p2 p2VarI0;
        latLng.getClass();
        p3.o0 o0VarE = mVar.E(139485030);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i16 & 1) != 0) {
            i17 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i17 = (o0VarE.B(latLng) ? 4 : 2) | i14;
        } else {
            i17 = i14;
        }
        int i49 = i16 & 2;
        if (i49 == 0) {
            if ((i14 & 48) == 0) {
                i17 |= o0VarE.h(z14) ? 32 : 16;
            }
            i18 = i16 & 4;
            if (i18 != 0) {
                if ((i14 & 384) == 0) {
                    j15 = j8;
                    if (o0VarE.l(j15)) {
                        i19 = 256;
                    } else {
                        i19 = 128;
                    }
                    i17 |= i19;
                }
                i24 = i16 & 8;
                if (i24 != 0) {
                    i17 |= 3072;
                    d15 = d14;
                } else {
                    d15 = d14;
                    if ((i14 & 3072) == 0) {
                        if (o0VarE.m(d15)) {
                            i25 = 2048;
                        } else {
                            i25 = 1024;
                        }
                        i17 |= i25;
                    }
                }
                i26 = i16 & 16;
                if (i26 != 0) {
                    i17 |= 24576;
                    i27 = i49;
                    j16 = j14;
                } else {
                    i27 = i49;
                    j16 = j14;
                    if ((i14 & 24576) == 0) {
                        if (o0VarE.l(j16)) {
                            i28 = 16384;
                        } else {
                            i28 = 8192;
                        }
                        i17 |= i28;
                    }
                }
                i29 = i16 & 32;
                if (i29 != 0) {
                    i17 |= 196608;
                    list2 = list;
                } else {
                    list2 = list;
                    if ((i14 & 196608) == 0) {
                        if (o0VarE.r(list2)) {
                            i30 = 131072;
                        } else {
                            i30 = 65536;
                        }
                        i17 |= i30;
                    }
                }
                i34 = i16 & 64;
                if (i34 != 0) {
                    i17 |= 1572864;
                    f16 = f14;
                } else {
                    f16 = f14;
                    if ((i14 & 1572864) == 0) {
                        if (o0VarE.i(f16)) {
                            i35 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i35 = 524288;
                        }
                        i17 |= i35;
                    }
                }
                i36 = i16 & 128;
                if (i36 != 0) {
                    if ((i14 & 12582912) == 0) {
                        if (o0VarE.r(obj)) {
                            i37 = 8388608;
                        } else {
                            i37 = 4194304;
                        }
                        i17 |= i37;
                    }
                    i38 = i16 & 256;
                    if (i38 != 0) {
                        i17 |= 100663296;
                    } else if ((i14 & 100663296) == 0) {
                        if (o0VarE.h(z15)) {
                            i39 = 67108864;
                        } else {
                            i39 = 33554432;
                        }
                        i17 |= i39;
                    }
                    i44 = i16 & 512;
                    if (i44 != 0) {
                        i17 |= C.ENCODING_PCM_32BIT;
                    } else if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                        if (o0VarE.i(f15)) {
                            i45 = 536870912;
                        } else {
                            i45 = 268435456;
                        }
                        i17 |= i45;
                    }
                    i46 = i16 & 1024;
                    if (i46 != 0) {
                        i47 = i15 | 6;
                    } else if ((i15 & 6) == 0) {
                        if (o0VarE.r(lVar)) {
                            i48 = 4;
                        } else {
                            i48 = 2;
                        }
                        i47 = i15 | i48;
                    } else {
                        i47 = i15;
                    }
                    if ((i17 & 306783379) != 306783378 && (i47 & 3) == 2 && o0VarE.b()) {
                        o0VarE.e();
                        f22 = f16;
                        d17 = d15;
                        z39 = z14;
                        obj5 = obj;
                        o0Var = o0VarE;
                        list5 = list2;
                        j19 = j15;
                        z44 = z15;
                        f24 = f15;
                        lVar5 = lVar;
                    } else {
                        if (i27 != 0) {
                            z16 = false;
                        } else {
                            z16 = z14;
                        }
                        if (i18 != 0) {
                            o4.d0.f128823b.getClass();
                            j15 = o4.d0.f128824c;
                        }
                        if (i24 != 0) {
                            d15 = 10.0d;
                        }
                        if (i26 != 0) {
                            o4.d0.f128823b.getClass();
                            j16 = o4.d0.f128824c;
                        }
                        if (i29 != 0) {
                            list3 = null;
                        } else {
                            list3 = list2;
                        }
                        if (i34 != 0) {
                            f16 = 10.0f;
                        }
                        if (i36 != 0) {
                            obj2 = null;
                        } else {
                            obj2 = obj;
                        }
                        if (i38 != 0) {
                            z17 = true;
                        } else {
                            z17 = z15;
                        }
                        if (i44 != 0) {
                            f17 = 0.0f;
                        } else {
                            f17 = f15;
                        }
                        aVar = p3.m.f135153a;
                        if (i46 != 0) {
                            o0VarE.C(-650387076);
                            objQ2 = o0VarE.q();
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new a(1);
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
                        lVar3 = lVar2;
                        o0VarE.C(-650382489);
                        boolean zR = o0VarE.r(mapApplier);
                        z18 = z16;
                        if ((i17 & 14) == 4) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        boolean z45 = zR | z19;
                        if ((i17 & 112) == 32) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        boolean z46 = z45 | z24;
                        if ((i17 & 896) == 256) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        boolean z47 = z46 | z25;
                        if ((i17 & 7168) == 2048) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        boolean z48 = z47 | z26;
                        if ((57344 & i17) == 16384) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        boolean zR2 = z48 | z27 | o0VarE.r(list3);
                        if ((3670016 & i17) == 1048576) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        boolean z49 = zR2 | z28;
                        if ((234881024 & i17) == 67108864) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                        boolean z54 = z49 | z29;
                        if ((1879048192 & i17) == 536870912) {
                            z34 = true;
                        } else {
                            z34 = false;
                        }
                        boolean zR3 = z54 | z34 | o0VarE.r(obj2);
                        if ((i47 & 14) == 4) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        z36 = zR3 | z35;
                        objQ = o0VarE.q();
                        if (z36) {
                            final MapApplier mapApplier2 = mapApplier;
                            final Object obj6 = obj2;
                            f18 = f17;
                            z37 = z18;
                            list4 = list3;
                            long j24 = j15;
                            f19 = f16;
                            z38 = z17;
                            j17 = j16;
                            d16 = d15;
                            j18 = j24;
                            obj3 = new e23.a() { // from class: com.google.maps.android.compose.d
                                @Override // e23.a
                                public final Object invoke() {
                                    return CircleKt.Circle_rQ_Q3OA$lambda$4$lambda$3(mapApplier2, obj6, lVar3, latLng, z37, j18, d16, j17, list4, f19, z38, f18);
                                }
                            };
                            latLng2 = latLng;
                            lVar4 = lVar3;
                            obj4 = obj6;
                            o0Var = o0VarE;
                            o0Var.K(obj3);
                        } else {
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                final MapApplier mapApplier3 = mapApplier;
                                final Object obj7 = obj2;
                                f18 = f17;
                                z37 = z18;
                                list4 = list3;
                                long j25 = j15;
                                f19 = f16;
                                z38 = z17;
                                j17 = j16;
                                d16 = d15;
                                j18 = j25;
                                obj3 = new e23.a() { // from class: com.google.maps.android.compose.d
                                    @Override // e23.a
                                    public final Object invoke() {
                                        return CircleKt.Circle_rQ_Q3OA$lambda$4$lambda$3(mapApplier3, obj7, lVar3, latLng, z37, j18, d16, j17, list4, f19, z38, f18);
                                    }
                                };
                                latLng2 = latLng;
                                lVar4 = lVar3;
                                obj4 = obj7;
                                o0Var = o0VarE;
                                o0Var.K(obj3);
                            } else {
                                obj3 = objQ;
                                o0Var = o0VarE;
                                list4 = list3;
                                obj4 = obj2;
                                f18 = f17;
                                z37 = z18;
                                latLng2 = latLng;
                                lVar4 = lVar3;
                                long j26 = j15;
                                f19 = f16;
                                z38 = z17;
                                j17 = j16;
                                d16 = d15;
                                j18 = j26;
                            }
                        }
                        aVar2 = (e23.a) obj3;
                        z39 = z37;
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
                        b4.d(new q0(9), lVar4, o0Var);
                        b4.d(new q0(10), latLng2, o0Var);
                        b4.d(new q0(11), Boolean.valueOf(z39), o0Var);
                        b4.d(new e23.p<CircleNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.CircleKt$Circle$3$4
                            @Override // e23.p
                            public /* synthetic */ Unit invoke(CircleNode circleNode, o4.d0 d0Var) {
                                m107invoke4WTKRHQ(circleNode, d0Var.f128833a);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                            public final void m107invoke4WTKRHQ(CircleNode circleNode, long j27) {
                                circleNode.getClass();
                                circleNode.getCircle().setFillColor(o4.f0.j(j27));
                            }
                        }, o4.d0.a(j18), o0Var);
                        b4.d(new q0(12), Double.valueOf(d16), o0Var);
                        b4.d(new e23.p<CircleNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.CircleKt$Circle$3$6
                            @Override // e23.p
                            public /* synthetic */ Unit invoke(CircleNode circleNode, o4.d0 d0Var) {
                                m108invoke4WTKRHQ(circleNode, d0Var.f128833a);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                            public final void m108invoke4WTKRHQ(CircleNode circleNode, long j27) {
                                circleNode.getClass();
                                circleNode.getCircle().setStrokeColor(o4.f0.j(j27));
                            }
                        }, o4.d0.a(j17), o0Var);
                        b4.d(new q0(13), list4, o0Var);
                        b4.d(new q0(14), Float.valueOf(f19), o0Var);
                        b4.d(new q0(6), obj4, o0Var);
                        b4.d(new q0(7), Boolean.valueOf(z38), o0Var);
                        b4.d(new q0(8), Float.valueOf(f18), o0Var);
                        o0Var.g0(true);
                        long j27 = j17;
                        obj5 = obj4;
                        f22 = f19;
                        f24 = f18;
                        boolean z55 = z38;
                        lVar5 = lVar4;
                        j19 = j18;
                        d17 = d16;
                        j16 = j27;
                        list5 = list4;
                        z44 = z55;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        final boolean z56 = z39;
                        p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.c
                            @Override // e23.p
                            public final Object invoke(Object obj8, Object obj9) {
                                int iIntValue = ((Integer) obj9).intValue();
                                return CircleKt.Circle_rQ_Q3OA$lambda$15(latLng, z56, j19, d17, j16, list5, f22, obj5, z44, f24, lVar5, i14, i15, i16, (p3.m) obj8, iIntValue);
                            }
                        };
                    }
                }
                i17 |= 12582912;
                i38 = i16 & 256;
                if (i38 != 0) {
                    i17 |= 100663296;
                } else if ((i14 & 100663296) == 0) {
                    if (o0VarE.h(z15)) {
                        i39 = 67108864;
                    } else {
                        i39 = 33554432;
                    }
                    i17 |= i39;
                }
                i44 = i16 & 512;
                if (i44 != 0) {
                    i17 |= C.ENCODING_PCM_32BIT;
                } else if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.i(f15)) {
                        i45 = 536870912;
                    } else {
                        i45 = 268435456;
                    }
                    i17 |= i45;
                }
                i46 = i16 & 1024;
                if (i46 != 0) {
                    i47 = i15 | 6;
                } else if ((i15 & 6) == 0) {
                    if (o0VarE.r(lVar)) {
                        i48 = 4;
                    } else {
                        i48 = 2;
                    }
                    i47 = i15 | i48;
                } else {
                    i47 = i15;
                }
                if ((i17 & 306783379) != 306783378) {
                    if (i27 != 0) {
                        z16 = false;
                    } else {
                        z16 = z14;
                    }
                    if (i18 != 0) {
                        o4.d0.f128823b.getClass();
                        j15 = o4.d0.f128824c;
                    }
                    if (i24 != 0) {
                        d15 = 10.0d;
                    }
                    if (i26 != 0) {
                        o4.d0.f128823b.getClass();
                        j16 = o4.d0.f128824c;
                    }
                    if (i29 != 0) {
                        list3 = null;
                    } else {
                        list3 = list2;
                    }
                    if (i34 != 0) {
                        f16 = 10.0f;
                    }
                    if (i36 != 0) {
                        obj2 = null;
                    } else {
                        obj2 = obj;
                    }
                    if (i38 != 0) {
                        z17 = true;
                    } else {
                        z17 = z15;
                    }
                    if (i44 != 0) {
                        f17 = 0.0f;
                    } else {
                        f17 = f15;
                    }
                    aVar = p3.m.f135153a;
                    if (i46 != 0) {
                        o0VarE.C(-650387076);
                        objQ2 = o0VarE.q();
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new a(1);
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
                    lVar3 = lVar2;
                    o0VarE.C(-650382489);
                    boolean zR4 = o0VarE.r(mapApplier);
                    z18 = z16;
                    if ((i17 & 14) == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean z410 = zR4 | z19;
                    if ((i17 & 112) == 32) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    boolean z411 = z410 | z24;
                    if ((i17 & 896) == 256) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z412 = z411 | z25;
                    if ((i17 & 7168) == 2048) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    boolean z413 = z412 | z26;
                    if ((57344 & i17) == 16384) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    boolean zR5 = z413 | z27 | o0VarE.r(list3);
                    if ((3670016 & i17) == 1048576) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    boolean z414 = zR5 | z28;
                    if ((234881024 & i17) == 67108864) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    boolean z57 = z414 | z29;
                    if ((1879048192 & i17) == 536870912) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    boolean zR6 = z57 | z34 | o0VarE.r(obj2);
                    if ((i47 & 14) == 4) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    z36 = zR6 | z35;
                    objQ = o0VarE.q();
                    if (z36) {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            final MapApplier mapApplier4 = mapApplier;
                            final Object obj8 = obj2;
                            f18 = f17;
                            z37 = z18;
                            list4 = list3;
                            long j28 = j15;
                            f19 = f16;
                            z38 = z17;
                            j17 = j16;
                            d16 = d15;
                            j18 = j28;
                            obj3 = new e23.a() { // from class: com.google.maps.android.compose.d
                                @Override // e23.a
                                public final Object invoke() {
                                    return CircleKt.Circle_rQ_Q3OA$lambda$4$lambda$3(mapApplier4, obj8, lVar3, latLng, z37, j18, d16, j17, list4, f19, z38, f18);
                                }
                            };
                            latLng2 = latLng;
                            lVar4 = lVar3;
                            obj4 = obj8;
                            o0Var = o0VarE;
                            o0Var.K(obj3);
                        } else {
                            obj3 = objQ;
                            o0Var = o0VarE;
                            list4 = list3;
                            obj4 = obj2;
                            f18 = f17;
                            z37 = z18;
                            latLng2 = latLng;
                            lVar4 = lVar3;
                            long j29 = j15;
                            f19 = f16;
                            z38 = z17;
                            j17 = j16;
                            d16 = d15;
                            j18 = j29;
                        }
                    } else {
                        final MapApplier mapApplier5 = mapApplier;
                        final Object obj9 = obj2;
                        f18 = f17;
                        z37 = z18;
                        list4 = list3;
                        long j210 = j15;
                        f19 = f16;
                        z38 = z17;
                        j17 = j16;
                        d16 = d15;
                        j18 = j210;
                        obj3 = new e23.a() { // from class: com.google.maps.android.compose.d
                            @Override // e23.a
                            public final Object invoke() {
                                return CircleKt.Circle_rQ_Q3OA$lambda$4$lambda$3(mapApplier5, obj9, lVar3, latLng, z37, j18, d16, j17, list4, f19, z38, f18);
                            }
                        };
                        latLng2 = latLng;
                        lVar4 = lVar3;
                        obj4 = obj9;
                        o0Var = o0VarE;
                        o0Var.K(obj3);
                    }
                    aVar2 = (e23.a) obj3;
                    z39 = z37;
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
                    b4.d(new q0(9), lVar4, o0Var);
                    b4.d(new q0(10), latLng2, o0Var);
                    b4.d(new q0(11), Boolean.valueOf(z39), o0Var);
                    b4.d(new e23.p<CircleNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.CircleKt$Circle$3$4
                        @Override // e23.p
                        public /* synthetic */ Unit invoke(CircleNode circleNode, o4.d0 d0Var) {
                            m107invoke4WTKRHQ(circleNode, d0Var.f128833a);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                        public final void m107invoke4WTKRHQ(CircleNode circleNode, long j211) {
                            circleNode.getClass();
                            circleNode.getCircle().setFillColor(o4.f0.j(j211));
                        }
                    }, o4.d0.a(j18), o0Var);
                    b4.d(new q0(12), Double.valueOf(d16), o0Var);
                    b4.d(new e23.p<CircleNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.CircleKt$Circle$3$6
                        @Override // e23.p
                        public /* synthetic */ Unit invoke(CircleNode circleNode, o4.d0 d0Var) {
                            m108invoke4WTKRHQ(circleNode, d0Var.f128833a);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                        public final void m108invoke4WTKRHQ(CircleNode circleNode, long j211) {
                            circleNode.getClass();
                            circleNode.getCircle().setStrokeColor(o4.f0.j(j211));
                        }
                    }, o4.d0.a(j17), o0Var);
                    b4.d(new q0(13), list4, o0Var);
                    b4.d(new q0(14), Float.valueOf(f19), o0Var);
                    b4.d(new q0(6), obj4, o0Var);
                    b4.d(new q0(7), Boolean.valueOf(z38), o0Var);
                    b4.d(new q0(8), Float.valueOf(f18), o0Var);
                    o0Var.g0(true);
                    long j211 = j17;
                    obj5 = obj4;
                    f22 = f19;
                    f24 = f18;
                    boolean z58 = z38;
                    lVar5 = lVar4;
                    j19 = j18;
                    d17 = d16;
                    j16 = j211;
                    list5 = list4;
                    z44 = z58;
                } else {
                    if (i27 != 0) {
                        z16 = false;
                    } else {
                        z16 = z14;
                    }
                    if (i18 != 0) {
                        o4.d0.f128823b.getClass();
                        j15 = o4.d0.f128824c;
                    }
                    if (i24 != 0) {
                        d15 = 10.0d;
                    }
                    if (i26 != 0) {
                        o4.d0.f128823b.getClass();
                        j16 = o4.d0.f128824c;
                    }
                    if (i29 != 0) {
                        list3 = null;
                    } else {
                        list3 = list2;
                    }
                    if (i34 != 0) {
                        f16 = 10.0f;
                    }
                    if (i36 != 0) {
                        obj2 = null;
                    } else {
                        obj2 = obj;
                    }
                    if (i38 != 0) {
                        z17 = true;
                    } else {
                        z17 = z15;
                    }
                    if (i44 != 0) {
                        f17 = 0.0f;
                    } else {
                        f17 = f15;
                    }
                    aVar = p3.m.f135153a;
                    if (i46 != 0) {
                        o0VarE.C(-650387076);
                        objQ2 = o0VarE.q();
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new a(1);
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
                    lVar3 = lVar2;
                    o0VarE.C(-650382489);
                    boolean zR7 = o0VarE.r(mapApplier);
                    z18 = z16;
                    if ((i17 & 14) == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean z415 = zR7 | z19;
                    if ((i17 & 112) == 32) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    boolean z416 = z415 | z24;
                    if ((i17 & 896) == 256) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z417 = z416 | z25;
                    if ((i17 & 7168) == 2048) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    boolean z418 = z417 | z26;
                    if ((57344 & i17) == 16384) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    boolean zR8 = z418 | z27 | o0VarE.r(list3);
                    if ((3670016 & i17) == 1048576) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    boolean z419 = zR8 | z28;
                    if ((234881024 & i17) == 67108864) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    boolean z59 = z419 | z29;
                    if ((1879048192 & i17) == 536870912) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    boolean zR9 = z59 | z34 | o0VarE.r(obj2);
                    if ((i47 & 14) == 4) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    z36 = zR9 | z35;
                    objQ = o0VarE.q();
                    if (z36) {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            final MapApplier mapApplier6 = mapApplier;
                            final Object obj10 = obj2;
                            f18 = f17;
                            z37 = z18;
                            list4 = list3;
                            long j212 = j15;
                            f19 = f16;
                            z38 = z17;
                            j17 = j16;
                            d16 = d15;
                            j18 = j212;
                            obj3 = new e23.a() { // from class: com.google.maps.android.compose.d
                                @Override // e23.a
                                public final Object invoke() {
                                    return CircleKt.Circle_rQ_Q3OA$lambda$4$lambda$3(mapApplier6, obj10, lVar3, latLng, z37, j18, d16, j17, list4, f19, z38, f18);
                                }
                            };
                            latLng2 = latLng;
                            lVar4 = lVar3;
                            obj4 = obj10;
                            o0Var = o0VarE;
                            o0Var.K(obj3);
                        } else {
                            obj3 = objQ;
                            o0Var = o0VarE;
                            list4 = list3;
                            obj4 = obj2;
                            f18 = f17;
                            z37 = z18;
                            latLng2 = latLng;
                            lVar4 = lVar3;
                            long j213 = j15;
                            f19 = f16;
                            z38 = z17;
                            j17 = j16;
                            d16 = d15;
                            j18 = j213;
                        }
                    } else {
                        final MapApplier mapApplier7 = mapApplier;
                        final Object obj11 = obj2;
                        f18 = f17;
                        z37 = z18;
                        list4 = list3;
                        long j214 = j15;
                        f19 = f16;
                        z38 = z17;
                        j17 = j16;
                        d16 = d15;
                        j18 = j214;
                        obj3 = new e23.a() { // from class: com.google.maps.android.compose.d
                            @Override // e23.a
                            public final Object invoke() {
                                return CircleKt.Circle_rQ_Q3OA$lambda$4$lambda$3(mapApplier7, obj11, lVar3, latLng, z37, j18, d16, j17, list4, f19, z38, f18);
                            }
                        };
                        latLng2 = latLng;
                        lVar4 = lVar3;
                        obj4 = obj11;
                        o0Var = o0VarE;
                        o0Var.K(obj3);
                    }
                    aVar2 = (e23.a) obj3;
                    z39 = z37;
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
                    b4.d(new q0(9), lVar4, o0Var);
                    b4.d(new q0(10), latLng2, o0Var);
                    b4.d(new q0(11), Boolean.valueOf(z39), o0Var);
                    b4.d(new e23.p<CircleNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.CircleKt$Circle$3$4
                        @Override // e23.p
                        public /* synthetic */ Unit invoke(CircleNode circleNode, o4.d0 d0Var) {
                            m107invoke4WTKRHQ(circleNode, d0Var.f128833a);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                        public final void m107invoke4WTKRHQ(CircleNode circleNode, long j215) {
                            circleNode.getClass();
                            circleNode.getCircle().setFillColor(o4.f0.j(j215));
                        }
                    }, o4.d0.a(j18), o0Var);
                    b4.d(new q0(12), Double.valueOf(d16), o0Var);
                    b4.d(new e23.p<CircleNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.CircleKt$Circle$3$6
                        @Override // e23.p
                        public /* synthetic */ Unit invoke(CircleNode circleNode, o4.d0 d0Var) {
                            m108invoke4WTKRHQ(circleNode, d0Var.f128833a);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                        public final void m108invoke4WTKRHQ(CircleNode circleNode, long j215) {
                            circleNode.getClass();
                            circleNode.getCircle().setStrokeColor(o4.f0.j(j215));
                        }
                    }, o4.d0.a(j17), o0Var);
                    b4.d(new q0(13), list4, o0Var);
                    b4.d(new q0(14), Float.valueOf(f19), o0Var);
                    b4.d(new q0(6), obj4, o0Var);
                    b4.d(new q0(7), Boolean.valueOf(z38), o0Var);
                    b4.d(new q0(8), Float.valueOf(f18), o0Var);
                    o0Var.g0(true);
                    long j215 = j17;
                    obj5 = obj4;
                    f22 = f19;
                    f24 = f18;
                    boolean z510 = z38;
                    lVar5 = lVar4;
                    j19 = j18;
                    d17 = d16;
                    j16 = j215;
                    list5 = list4;
                    z44 = z510;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    final boolean z511 = z39;
                    p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.c
                        @Override // e23.p
                        public final Object invoke(Object obj12, Object obj13) {
                            int iIntValue = ((Integer) obj13).intValue();
                            return CircleKt.Circle_rQ_Q3OA$lambda$15(latLng, z511, j19, d17, j16, list5, f22, obj5, z44, f24, lVar5, i14, i15, i16, (p3.m) obj12, iIntValue);
                        }
                    };
                }
            }
            i17 |= 384;
            j15 = j8;
            i24 = i16 & 8;
            if (i24 != 0) {
                i17 |= 3072;
                d15 = d14;
            } else {
                d15 = d14;
                if ((i14 & 3072) == 0) {
                    if (o0VarE.m(d15)) {
                        i25 = 2048;
                    } else {
                        i25 = 1024;
                    }
                    i17 |= i25;
                }
            }
            i26 = i16 & 16;
            if (i26 != 0) {
                i17 |= 24576;
                i27 = i49;
                j16 = j14;
            } else {
                i27 = i49;
                j16 = j14;
                if ((i14 & 24576) == 0) {
                    if (o0VarE.l(j16)) {
                        i28 = 16384;
                    } else {
                        i28 = 8192;
                    }
                    i17 |= i28;
                }
            }
            i29 = i16 & 32;
            if (i29 != 0) {
                i17 |= 196608;
                list2 = list;
            } else {
                list2 = list;
                if ((i14 & 196608) == 0) {
                    if (o0VarE.r(list2)) {
                        i30 = 131072;
                    } else {
                        i30 = 65536;
                    }
                    i17 |= i30;
                }
            }
            i34 = i16 & 64;
            if (i34 != 0) {
                i17 |= 1572864;
                f16 = f14;
            } else {
                f16 = f14;
                if ((i14 & 1572864) == 0) {
                    if (o0VarE.i(f16)) {
                        i35 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i35 = 524288;
                    }
                    i17 |= i35;
                }
            }
            i36 = i16 & 128;
            if (i36 != 0) {
                if ((i14 & 12582912) == 0) {
                    if (o0VarE.r(obj)) {
                        i37 = 8388608;
                    } else {
                        i37 = 4194304;
                    }
                    i17 |= i37;
                }
                i38 = i16 & 256;
                if (i38 != 0) {
                    i17 |= 100663296;
                } else if ((i14 & 100663296) == 0) {
                    if (o0VarE.h(z15)) {
                        i39 = 67108864;
                    } else {
                        i39 = 33554432;
                    }
                    i17 |= i39;
                }
                i44 = i16 & 512;
                if (i44 != 0) {
                    i17 |= C.ENCODING_PCM_32BIT;
                } else if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.i(f15)) {
                        i45 = 536870912;
                    } else {
                        i45 = 268435456;
                    }
                    i17 |= i45;
                }
                i46 = i16 & 1024;
                if (i46 != 0) {
                    i47 = i15 | 6;
                } else if ((i15 & 6) == 0) {
                    if (o0VarE.r(lVar)) {
                        i48 = 4;
                    } else {
                        i48 = 2;
                    }
                    i47 = i15 | i48;
                } else {
                    i47 = i15;
                }
                if ((i17 & 306783379) != 306783378) {
                    if (i27 != 0) {
                        z16 = false;
                    } else {
                        z16 = z14;
                    }
                    if (i18 != 0) {
                        o4.d0.f128823b.getClass();
                        j15 = o4.d0.f128824c;
                    }
                    if (i24 != 0) {
                        d15 = 10.0d;
                    }
                    if (i26 != 0) {
                        o4.d0.f128823b.getClass();
                        j16 = o4.d0.f128824c;
                    }
                    if (i29 != 0) {
                        list3 = null;
                    } else {
                        list3 = list2;
                    }
                    if (i34 != 0) {
                        f16 = 10.0f;
                    }
                    if (i36 != 0) {
                        obj2 = null;
                    } else {
                        obj2 = obj;
                    }
                    if (i38 != 0) {
                        z17 = true;
                    } else {
                        z17 = z15;
                    }
                    if (i44 != 0) {
                        f17 = 0.0f;
                    } else {
                        f17 = f15;
                    }
                    aVar = p3.m.f135153a;
                    if (i46 != 0) {
                        o0VarE.C(-650387076);
                        objQ2 = o0VarE.q();
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new a(1);
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
                    lVar3 = lVar2;
                    o0VarE.C(-650382489);
                    boolean zR10 = o0VarE.r(mapApplier);
                    z18 = z16;
                    if ((i17 & 14) == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean z4110 = zR10 | z19;
                    if ((i17 & 112) == 32) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    boolean z4111 = z4110 | z24;
                    if ((i17 & 896) == 256) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z4112 = z4111 | z25;
                    if ((i17 & 7168) == 2048) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    boolean z4113 = z4112 | z26;
                    if ((57344 & i17) == 16384) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    boolean zR11 = z4113 | z27 | o0VarE.r(list3);
                    if ((3670016 & i17) == 1048576) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    boolean z4114 = zR11 | z28;
                    if ((234881024 & i17) == 67108864) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    boolean z512 = z4114 | z29;
                    if ((1879048192 & i17) == 536870912) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    boolean zR12 = z512 | z34 | o0VarE.r(obj2);
                    if ((i47 & 14) == 4) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    z36 = zR12 | z35;
                    objQ = o0VarE.q();
                    if (z36) {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            final MapApplier mapApplier8 = mapApplier;
                            final Object obj12 = obj2;
                            f18 = f17;
                            z37 = z18;
                            list4 = list3;
                            long j216 = j15;
                            f19 = f16;
                            z38 = z17;
                            j17 = j16;
                            d16 = d15;
                            j18 = j216;
                            obj3 = new e23.a() { // from class: com.google.maps.android.compose.d
                                @Override // e23.a
                                public final Object invoke() {
                                    return CircleKt.Circle_rQ_Q3OA$lambda$4$lambda$3(mapApplier8, obj12, lVar3, latLng, z37, j18, d16, j17, list4, f19, z38, f18);
                                }
                            };
                            latLng2 = latLng;
                            lVar4 = lVar3;
                            obj4 = obj12;
                            o0Var = o0VarE;
                            o0Var.K(obj3);
                        } else {
                            obj3 = objQ;
                            o0Var = o0VarE;
                            list4 = list3;
                            obj4 = obj2;
                            f18 = f17;
                            z37 = z18;
                            latLng2 = latLng;
                            lVar4 = lVar3;
                            long j217 = j15;
                            f19 = f16;
                            z38 = z17;
                            j17 = j16;
                            d16 = d15;
                            j18 = j217;
                        }
                    } else {
                        final MapApplier mapApplier9 = mapApplier;
                        final Object obj13 = obj2;
                        f18 = f17;
                        z37 = z18;
                        list4 = list3;
                        long j218 = j15;
                        f19 = f16;
                        z38 = z17;
                        j17 = j16;
                        d16 = d15;
                        j18 = j218;
                        obj3 = new e23.a() { // from class: com.google.maps.android.compose.d
                            @Override // e23.a
                            public final Object invoke() {
                                return CircleKt.Circle_rQ_Q3OA$lambda$4$lambda$3(mapApplier9, obj13, lVar3, latLng, z37, j18, d16, j17, list4, f19, z38, f18);
                            }
                        };
                        latLng2 = latLng;
                        lVar4 = lVar3;
                        obj4 = obj13;
                        o0Var = o0VarE;
                        o0Var.K(obj3);
                    }
                    aVar2 = (e23.a) obj3;
                    z39 = z37;
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
                    b4.d(new q0(9), lVar4, o0Var);
                    b4.d(new q0(10), latLng2, o0Var);
                    b4.d(new q0(11), Boolean.valueOf(z39), o0Var);
                    b4.d(new e23.p<CircleNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.CircleKt$Circle$3$4
                        @Override // e23.p
                        public /* synthetic */ Unit invoke(CircleNode circleNode, o4.d0 d0Var) {
                            m107invoke4WTKRHQ(circleNode, d0Var.f128833a);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                        public final void m107invoke4WTKRHQ(CircleNode circleNode, long j219) {
                            circleNode.getClass();
                            circleNode.getCircle().setFillColor(o4.f0.j(j219));
                        }
                    }, o4.d0.a(j18), o0Var);
                    b4.d(new q0(12), Double.valueOf(d16), o0Var);
                    b4.d(new e23.p<CircleNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.CircleKt$Circle$3$6
                        @Override // e23.p
                        public /* synthetic */ Unit invoke(CircleNode circleNode, o4.d0 d0Var) {
                            m108invoke4WTKRHQ(circleNode, d0Var.f128833a);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                        public final void m108invoke4WTKRHQ(CircleNode circleNode, long j219) {
                            circleNode.getClass();
                            circleNode.getCircle().setStrokeColor(o4.f0.j(j219));
                        }
                    }, o4.d0.a(j17), o0Var);
                    b4.d(new q0(13), list4, o0Var);
                    b4.d(new q0(14), Float.valueOf(f19), o0Var);
                    b4.d(new q0(6), obj4, o0Var);
                    b4.d(new q0(7), Boolean.valueOf(z38), o0Var);
                    b4.d(new q0(8), Float.valueOf(f18), o0Var);
                    o0Var.g0(true);
                    long j219 = j17;
                    obj5 = obj4;
                    f22 = f19;
                    f24 = f18;
                    boolean z513 = z38;
                    lVar5 = lVar4;
                    j19 = j18;
                    d17 = d16;
                    j16 = j219;
                    list5 = list4;
                    z44 = z513;
                } else {
                    if (i27 != 0) {
                        z16 = false;
                    } else {
                        z16 = z14;
                    }
                    if (i18 != 0) {
                        o4.d0.f128823b.getClass();
                        j15 = o4.d0.f128824c;
                    }
                    if (i24 != 0) {
                        d15 = 10.0d;
                    }
                    if (i26 != 0) {
                        o4.d0.f128823b.getClass();
                        j16 = o4.d0.f128824c;
                    }
                    if (i29 != 0) {
                        list3 = null;
                    } else {
                        list3 = list2;
                    }
                    if (i34 != 0) {
                        f16 = 10.0f;
                    }
                    if (i36 != 0) {
                        obj2 = null;
                    } else {
                        obj2 = obj;
                    }
                    if (i38 != 0) {
                        z17 = true;
                    } else {
                        z17 = z15;
                    }
                    if (i44 != 0) {
                        f17 = 0.0f;
                    } else {
                        f17 = f15;
                    }
                    aVar = p3.m.f135153a;
                    if (i46 != 0) {
                        o0VarE.C(-650387076);
                        objQ2 = o0VarE.q();
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new a(1);
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
                    lVar3 = lVar2;
                    o0VarE.C(-650382489);
                    boolean zR13 = o0VarE.r(mapApplier);
                    z18 = z16;
                    if ((i17 & 14) == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean z4115 = zR13 | z19;
                    if ((i17 & 112) == 32) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    boolean z4116 = z4115 | z24;
                    if ((i17 & 896) == 256) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z4117 = z4116 | z25;
                    if ((i17 & 7168) == 2048) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    boolean z4118 = z4117 | z26;
                    if ((57344 & i17) == 16384) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    boolean zR14 = z4118 | z27 | o0VarE.r(list3);
                    if ((3670016 & i17) == 1048576) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    boolean z4119 = zR14 | z28;
                    if ((234881024 & i17) == 67108864) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    boolean z514 = z4119 | z29;
                    if ((1879048192 & i17) == 536870912) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    boolean zR15 = z514 | z34 | o0VarE.r(obj2);
                    if ((i47 & 14) == 4) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    z36 = zR15 | z35;
                    objQ = o0VarE.q();
                    if (z36) {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            final MapApplier mapApplier10 = mapApplier;
                            final Object obj14 = obj2;
                            f18 = f17;
                            z37 = z18;
                            list4 = list3;
                            long j2110 = j15;
                            f19 = f16;
                            z38 = z17;
                            j17 = j16;
                            d16 = d15;
                            j18 = j2110;
                            obj3 = new e23.a() { // from class: com.google.maps.android.compose.d
                                @Override // e23.a
                                public final Object invoke() {
                                    return CircleKt.Circle_rQ_Q3OA$lambda$4$lambda$3(mapApplier10, obj14, lVar3, latLng, z37, j18, d16, j17, list4, f19, z38, f18);
                                }
                            };
                            latLng2 = latLng;
                            lVar4 = lVar3;
                            obj4 = obj14;
                            o0Var = o0VarE;
                            o0Var.K(obj3);
                        } else {
                            obj3 = objQ;
                            o0Var = o0VarE;
                            list4 = list3;
                            obj4 = obj2;
                            f18 = f17;
                            z37 = z18;
                            latLng2 = latLng;
                            lVar4 = lVar3;
                            long j2111 = j15;
                            f19 = f16;
                            z38 = z17;
                            j17 = j16;
                            d16 = d15;
                            j18 = j2111;
                        }
                    } else {
                        final MapApplier mapApplier11 = mapApplier;
                        final Object obj15 = obj2;
                        f18 = f17;
                        z37 = z18;
                        list4 = list3;
                        long j2112 = j15;
                        f19 = f16;
                        z38 = z17;
                        j17 = j16;
                        d16 = d15;
                        j18 = j2112;
                        obj3 = new e23.a() { // from class: com.google.maps.android.compose.d
                            @Override // e23.a
                            public final Object invoke() {
                                return CircleKt.Circle_rQ_Q3OA$lambda$4$lambda$3(mapApplier11, obj15, lVar3, latLng, z37, j18, d16, j17, list4, f19, z38, f18);
                            }
                        };
                        latLng2 = latLng;
                        lVar4 = lVar3;
                        obj4 = obj15;
                        o0Var = o0VarE;
                        o0Var.K(obj3);
                    }
                    aVar2 = (e23.a) obj3;
                    z39 = z37;
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
                    b4.d(new q0(9), lVar4, o0Var);
                    b4.d(new q0(10), latLng2, o0Var);
                    b4.d(new q0(11), Boolean.valueOf(z39), o0Var);
                    b4.d(new e23.p<CircleNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.CircleKt$Circle$3$4
                        @Override // e23.p
                        public /* synthetic */ Unit invoke(CircleNode circleNode, o4.d0 d0Var) {
                            m107invoke4WTKRHQ(circleNode, d0Var.f128833a);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                        public final void m107invoke4WTKRHQ(CircleNode circleNode, long j2113) {
                            circleNode.getClass();
                            circleNode.getCircle().setFillColor(o4.f0.j(j2113));
                        }
                    }, o4.d0.a(j18), o0Var);
                    b4.d(new q0(12), Double.valueOf(d16), o0Var);
                    b4.d(new e23.p<CircleNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.CircleKt$Circle$3$6
                        @Override // e23.p
                        public /* synthetic */ Unit invoke(CircleNode circleNode, o4.d0 d0Var) {
                            m108invoke4WTKRHQ(circleNode, d0Var.f128833a);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                        public final void m108invoke4WTKRHQ(CircleNode circleNode, long j2113) {
                            circleNode.getClass();
                            circleNode.getCircle().setStrokeColor(o4.f0.j(j2113));
                        }
                    }, o4.d0.a(j17), o0Var);
                    b4.d(new q0(13), list4, o0Var);
                    b4.d(new q0(14), Float.valueOf(f19), o0Var);
                    b4.d(new q0(6), obj4, o0Var);
                    b4.d(new q0(7), Boolean.valueOf(z38), o0Var);
                    b4.d(new q0(8), Float.valueOf(f18), o0Var);
                    o0Var.g0(true);
                    long j2113 = j17;
                    obj5 = obj4;
                    f22 = f19;
                    f24 = f18;
                    boolean z515 = z38;
                    lVar5 = lVar4;
                    j19 = j18;
                    d17 = d16;
                    j16 = j2113;
                    list5 = list4;
                    z44 = z515;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    final boolean z516 = z39;
                    p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.c
                        @Override // e23.p
                        public final Object invoke(Object obj16, Object obj17) {
                            int iIntValue = ((Integer) obj17).intValue();
                            return CircleKt.Circle_rQ_Q3OA$lambda$15(latLng, z516, j19, d17, j16, list5, f22, obj5, z44, f24, lVar5, i14, i15, i16, (p3.m) obj16, iIntValue);
                        }
                    };
                }
            }
            i17 |= 12582912;
            i38 = i16 & 256;
            if (i38 != 0) {
                i17 |= 100663296;
            } else if ((i14 & 100663296) == 0) {
                if (o0VarE.h(z15)) {
                    i39 = 67108864;
                } else {
                    i39 = 33554432;
                }
                i17 |= i39;
            }
            i44 = i16 & 512;
            if (i44 != 0) {
                i17 |= C.ENCODING_PCM_32BIT;
            } else if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarE.i(f15)) {
                    i45 = 536870912;
                } else {
                    i45 = 268435456;
                }
                i17 |= i45;
            }
            i46 = i16 & 1024;
            if (i46 != 0) {
                i47 = i15 | 6;
            } else if ((i15 & 6) == 0) {
                if (o0VarE.r(lVar)) {
                    i48 = 4;
                } else {
                    i48 = 2;
                }
                i47 = i15 | i48;
            } else {
                i47 = i15;
            }
            if ((i17 & 306783379) != 306783378) {
                if (i27 != 0) {
                    z16 = false;
                } else {
                    z16 = z14;
                }
                if (i18 != 0) {
                    o4.d0.f128823b.getClass();
                    j15 = o4.d0.f128824c;
                }
                if (i24 != 0) {
                    d15 = 10.0d;
                }
                if (i26 != 0) {
                    o4.d0.f128823b.getClass();
                    j16 = o4.d0.f128824c;
                }
                if (i29 != 0) {
                    list3 = null;
                } else {
                    list3 = list2;
                }
                if (i34 != 0) {
                    f16 = 10.0f;
                }
                if (i36 != 0) {
                    obj2 = null;
                } else {
                    obj2 = obj;
                }
                if (i38 != 0) {
                    z17 = true;
                } else {
                    z17 = z15;
                }
                if (i44 != 0) {
                    f17 = 0.0f;
                } else {
                    f17 = f15;
                }
                aVar = p3.m.f135153a;
                if (i46 != 0) {
                    o0VarE.C(-650387076);
                    objQ2 = o0VarE.q();
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new a(1);
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
                lVar3 = lVar2;
                o0VarE.C(-650382489);
                boolean zR16 = o0VarE.r(mapApplier);
                z18 = z16;
                if ((i17 & 14) == 4) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean z41110 = zR16 | z19;
                if ((i17 & 112) == 32) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                boolean z41111 = z41110 | z24;
                if ((i17 & 896) == 256) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z41112 = z41111 | z25;
                if ((i17 & 7168) == 2048) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                boolean z41113 = z41112 | z26;
                if ((57344 & i17) == 16384) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                boolean zR17 = z41113 | z27 | o0VarE.r(list3);
                if ((3670016 & i17) == 1048576) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                boolean z41114 = zR17 | z28;
                if ((234881024 & i17) == 67108864) {
                    z29 = true;
                } else {
                    z29 = false;
                }
                boolean z517 = z41114 | z29;
                if ((1879048192 & i17) == 536870912) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                boolean zR18 = z517 | z34 | o0VarE.r(obj2);
                if ((i47 & 14) == 4) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                z36 = zR18 | z35;
                objQ = o0VarE.q();
                if (z36) {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        final MapApplier mapApplier12 = mapApplier;
                        final Object obj16 = obj2;
                        f18 = f17;
                        z37 = z18;
                        list4 = list3;
                        long j2114 = j15;
                        f19 = f16;
                        z38 = z17;
                        j17 = j16;
                        d16 = d15;
                        j18 = j2114;
                        obj3 = new e23.a() { // from class: com.google.maps.android.compose.d
                            @Override // e23.a
                            public final Object invoke() {
                                return CircleKt.Circle_rQ_Q3OA$lambda$4$lambda$3(mapApplier12, obj16, lVar3, latLng, z37, j18, d16, j17, list4, f19, z38, f18);
                            }
                        };
                        latLng2 = latLng;
                        lVar4 = lVar3;
                        obj4 = obj16;
                        o0Var = o0VarE;
                        o0Var.K(obj3);
                    } else {
                        obj3 = objQ;
                        o0Var = o0VarE;
                        list4 = list3;
                        obj4 = obj2;
                        f18 = f17;
                        z37 = z18;
                        latLng2 = latLng;
                        lVar4 = lVar3;
                        long j2115 = j15;
                        f19 = f16;
                        z38 = z17;
                        j17 = j16;
                        d16 = d15;
                        j18 = j2115;
                    }
                } else {
                    final MapApplier mapApplier13 = mapApplier;
                    final Object obj17 = obj2;
                    f18 = f17;
                    z37 = z18;
                    list4 = list3;
                    long j2116 = j15;
                    f19 = f16;
                    z38 = z17;
                    j17 = j16;
                    d16 = d15;
                    j18 = j2116;
                    obj3 = new e23.a() { // from class: com.google.maps.android.compose.d
                        @Override // e23.a
                        public final Object invoke() {
                            return CircleKt.Circle_rQ_Q3OA$lambda$4$lambda$3(mapApplier13, obj17, lVar3, latLng, z37, j18, d16, j17, list4, f19, z38, f18);
                        }
                    };
                    latLng2 = latLng;
                    lVar4 = lVar3;
                    obj4 = obj17;
                    o0Var = o0VarE;
                    o0Var.K(obj3);
                }
                aVar2 = (e23.a) obj3;
                z39 = z37;
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
                b4.d(new q0(9), lVar4, o0Var);
                b4.d(new q0(10), latLng2, o0Var);
                b4.d(new q0(11), Boolean.valueOf(z39), o0Var);
                b4.d(new e23.p<CircleNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.CircleKt$Circle$3$4
                    @Override // e23.p
                    public /* synthetic */ Unit invoke(CircleNode circleNode, o4.d0 d0Var) {
                        m107invoke4WTKRHQ(circleNode, d0Var.f128833a);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                    public final void m107invoke4WTKRHQ(CircleNode circleNode, long j2117) {
                        circleNode.getClass();
                        circleNode.getCircle().setFillColor(o4.f0.j(j2117));
                    }
                }, o4.d0.a(j18), o0Var);
                b4.d(new q0(12), Double.valueOf(d16), o0Var);
                b4.d(new e23.p<CircleNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.CircleKt$Circle$3$6
                    @Override // e23.p
                    public /* synthetic */ Unit invoke(CircleNode circleNode, o4.d0 d0Var) {
                        m108invoke4WTKRHQ(circleNode, d0Var.f128833a);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                    public final void m108invoke4WTKRHQ(CircleNode circleNode, long j2117) {
                        circleNode.getClass();
                        circleNode.getCircle().setStrokeColor(o4.f0.j(j2117));
                    }
                }, o4.d0.a(j17), o0Var);
                b4.d(new q0(13), list4, o0Var);
                b4.d(new q0(14), Float.valueOf(f19), o0Var);
                b4.d(new q0(6), obj4, o0Var);
                b4.d(new q0(7), Boolean.valueOf(z38), o0Var);
                b4.d(new q0(8), Float.valueOf(f18), o0Var);
                o0Var.g0(true);
                long j2117 = j17;
                obj5 = obj4;
                f22 = f19;
                f24 = f18;
                boolean z518 = z38;
                lVar5 = lVar4;
                j19 = j18;
                d17 = d16;
                j16 = j2117;
                list5 = list4;
                z44 = z518;
            } else {
                if (i27 != 0) {
                    z16 = false;
                } else {
                    z16 = z14;
                }
                if (i18 != 0) {
                    o4.d0.f128823b.getClass();
                    j15 = o4.d0.f128824c;
                }
                if (i24 != 0) {
                    d15 = 10.0d;
                }
                if (i26 != 0) {
                    o4.d0.f128823b.getClass();
                    j16 = o4.d0.f128824c;
                }
                if (i29 != 0) {
                    list3 = null;
                } else {
                    list3 = list2;
                }
                if (i34 != 0) {
                    f16 = 10.0f;
                }
                if (i36 != 0) {
                    obj2 = null;
                } else {
                    obj2 = obj;
                }
                if (i38 != 0) {
                    z17 = true;
                } else {
                    z17 = z15;
                }
                if (i44 != 0) {
                    f17 = 0.0f;
                } else {
                    f17 = f15;
                }
                aVar = p3.m.f135153a;
                if (i46 != 0) {
                    o0VarE.C(-650387076);
                    objQ2 = o0VarE.q();
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new a(1);
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
                lVar3 = lVar2;
                o0VarE.C(-650382489);
                boolean zR19 = o0VarE.r(mapApplier);
                z18 = z16;
                if ((i17 & 14) == 4) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean z41115 = zR19 | z19;
                if ((i17 & 112) == 32) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                boolean z41116 = z41115 | z24;
                if ((i17 & 896) == 256) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z41117 = z41116 | z25;
                if ((i17 & 7168) == 2048) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                boolean z41118 = z41117 | z26;
                if ((57344 & i17) == 16384) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                boolean zR110 = z41118 | z27 | o0VarE.r(list3);
                if ((3670016 & i17) == 1048576) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                boolean z41119 = zR110 | z28;
                if ((234881024 & i17) == 67108864) {
                    z29 = true;
                } else {
                    z29 = false;
                }
                boolean z519 = z41119 | z29;
                if ((1879048192 & i17) == 536870912) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                boolean zR111 = z519 | z34 | o0VarE.r(obj2);
                if ((i47 & 14) == 4) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                z36 = zR111 | z35;
                objQ = o0VarE.q();
                if (z36) {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        final MapApplier mapApplier14 = mapApplier;
                        final Object obj18 = obj2;
                        f18 = f17;
                        z37 = z18;
                        list4 = list3;
                        long j2118 = j15;
                        f19 = f16;
                        z38 = z17;
                        j17 = j16;
                        d16 = d15;
                        j18 = j2118;
                        obj3 = new e23.a() { // from class: com.google.maps.android.compose.d
                            @Override // e23.a
                            public final Object invoke() {
                                return CircleKt.Circle_rQ_Q3OA$lambda$4$lambda$3(mapApplier14, obj18, lVar3, latLng, z37, j18, d16, j17, list4, f19, z38, f18);
                            }
                        };
                        latLng2 = latLng;
                        lVar4 = lVar3;
                        obj4 = obj18;
                        o0Var = o0VarE;
                        o0Var.K(obj3);
                    } else {
                        obj3 = objQ;
                        o0Var = o0VarE;
                        list4 = list3;
                        obj4 = obj2;
                        f18 = f17;
                        z37 = z18;
                        latLng2 = latLng;
                        lVar4 = lVar3;
                        long j2119 = j15;
                        f19 = f16;
                        z38 = z17;
                        j17 = j16;
                        d16 = d15;
                        j18 = j2119;
                    }
                } else {
                    final MapApplier mapApplier15 = mapApplier;
                    final Object obj19 = obj2;
                    f18 = f17;
                    z37 = z18;
                    list4 = list3;
                    long j21110 = j15;
                    f19 = f16;
                    z38 = z17;
                    j17 = j16;
                    d16 = d15;
                    j18 = j21110;
                    obj3 = new e23.a() { // from class: com.google.maps.android.compose.d
                        @Override // e23.a
                        public final Object invoke() {
                            return CircleKt.Circle_rQ_Q3OA$lambda$4$lambda$3(mapApplier15, obj19, lVar3, latLng, z37, j18, d16, j17, list4, f19, z38, f18);
                        }
                    };
                    latLng2 = latLng;
                    lVar4 = lVar3;
                    obj4 = obj19;
                    o0Var = o0VarE;
                    o0Var.K(obj3);
                }
                aVar2 = (e23.a) obj3;
                z39 = z37;
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
                b4.d(new q0(9), lVar4, o0Var);
                b4.d(new q0(10), latLng2, o0Var);
                b4.d(new q0(11), Boolean.valueOf(z39), o0Var);
                b4.d(new e23.p<CircleNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.CircleKt$Circle$3$4
                    @Override // e23.p
                    public /* synthetic */ Unit invoke(CircleNode circleNode, o4.d0 d0Var) {
                        m107invoke4WTKRHQ(circleNode, d0Var.f128833a);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                    public final void m107invoke4WTKRHQ(CircleNode circleNode, long j21111) {
                        circleNode.getClass();
                        circleNode.getCircle().setFillColor(o4.f0.j(j21111));
                    }
                }, o4.d0.a(j18), o0Var);
                b4.d(new q0(12), Double.valueOf(d16), o0Var);
                b4.d(new e23.p<CircleNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.CircleKt$Circle$3$6
                    @Override // e23.p
                    public /* synthetic */ Unit invoke(CircleNode circleNode, o4.d0 d0Var) {
                        m108invoke4WTKRHQ(circleNode, d0Var.f128833a);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                    public final void m108invoke4WTKRHQ(CircleNode circleNode, long j21111) {
                        circleNode.getClass();
                        circleNode.getCircle().setStrokeColor(o4.f0.j(j21111));
                    }
                }, o4.d0.a(j17), o0Var);
                b4.d(new q0(13), list4, o0Var);
                b4.d(new q0(14), Float.valueOf(f19), o0Var);
                b4.d(new q0(6), obj4, o0Var);
                b4.d(new q0(7), Boolean.valueOf(z38), o0Var);
                b4.d(new q0(8), Float.valueOf(f18), o0Var);
                o0Var.g0(true);
                long j21111 = j17;
                obj5 = obj4;
                f22 = f19;
                f24 = f18;
                boolean z5110 = z38;
                lVar5 = lVar4;
                j19 = j18;
                d17 = d16;
                j16 = j21111;
                list5 = list4;
                z44 = z5110;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                final boolean z5111 = z39;
                p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.c
                    @Override // e23.p
                    public final Object invoke(Object obj110, Object obj111) {
                        int iIntValue = ((Integer) obj111).intValue();
                        return CircleKt.Circle_rQ_Q3OA$lambda$15(latLng, z5111, j19, d17, j16, list5, f22, obj5, z44, f24, lVar5, i14, i15, i16, (p3.m) obj110, iIntValue);
                    }
                };
            }
        }
        i17 |= 48;
        i18 = i16 & 4;
        if (i18 != 0) {
            if ((i14 & 384) == 0) {
                j15 = j8;
                if (o0VarE.l(j15)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i17 |= i19;
            }
            i24 = i16 & 8;
            if (i24 != 0) {
                i17 |= 3072;
                d15 = d14;
            } else {
                d15 = d14;
                if ((i14 & 3072) == 0) {
                    if (o0VarE.m(d15)) {
                        i25 = 2048;
                    } else {
                        i25 = 1024;
                    }
                    i17 |= i25;
                }
            }
            i26 = i16 & 16;
            if (i26 != 0) {
                i17 |= 24576;
                i27 = i49;
                j16 = j14;
            } else {
                i27 = i49;
                j16 = j14;
                if ((i14 & 24576) == 0) {
                    if (o0VarE.l(j16)) {
                        i28 = 16384;
                    } else {
                        i28 = 8192;
                    }
                    i17 |= i28;
                }
            }
            i29 = i16 & 32;
            if (i29 != 0) {
                i17 |= 196608;
                list2 = list;
            } else {
                list2 = list;
                if ((i14 & 196608) == 0) {
                    if (o0VarE.r(list2)) {
                        i30 = 131072;
                    } else {
                        i30 = 65536;
                    }
                    i17 |= i30;
                }
            }
            i34 = i16 & 64;
            if (i34 != 0) {
                i17 |= 1572864;
                f16 = f14;
            } else {
                f16 = f14;
                if ((i14 & 1572864) == 0) {
                    if (o0VarE.i(f16)) {
                        i35 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i35 = 524288;
                    }
                    i17 |= i35;
                }
            }
            i36 = i16 & 128;
            if (i36 != 0) {
                if ((i14 & 12582912) == 0) {
                    if (o0VarE.r(obj)) {
                        i37 = 8388608;
                    } else {
                        i37 = 4194304;
                    }
                    i17 |= i37;
                }
                i38 = i16 & 256;
                if (i38 != 0) {
                    i17 |= 100663296;
                } else if ((i14 & 100663296) == 0) {
                    if (o0VarE.h(z15)) {
                        i39 = 67108864;
                    } else {
                        i39 = 33554432;
                    }
                    i17 |= i39;
                }
                i44 = i16 & 512;
                if (i44 != 0) {
                    i17 |= C.ENCODING_PCM_32BIT;
                } else if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.i(f15)) {
                        i45 = 536870912;
                    } else {
                        i45 = 268435456;
                    }
                    i17 |= i45;
                }
                i46 = i16 & 1024;
                if (i46 != 0) {
                    i47 = i15 | 6;
                } else if ((i15 & 6) == 0) {
                    if (o0VarE.r(lVar)) {
                        i48 = 4;
                    } else {
                        i48 = 2;
                    }
                    i47 = i15 | i48;
                } else {
                    i47 = i15;
                }
                if ((i17 & 306783379) != 306783378) {
                    if (i27 != 0) {
                        z16 = false;
                    } else {
                        z16 = z14;
                    }
                    if (i18 != 0) {
                        o4.d0.f128823b.getClass();
                        j15 = o4.d0.f128824c;
                    }
                    if (i24 != 0) {
                        d15 = 10.0d;
                    }
                    if (i26 != 0) {
                        o4.d0.f128823b.getClass();
                        j16 = o4.d0.f128824c;
                    }
                    if (i29 != 0) {
                        list3 = null;
                    } else {
                        list3 = list2;
                    }
                    if (i34 != 0) {
                        f16 = 10.0f;
                    }
                    if (i36 != 0) {
                        obj2 = null;
                    } else {
                        obj2 = obj;
                    }
                    if (i38 != 0) {
                        z17 = true;
                    } else {
                        z17 = z15;
                    }
                    if (i44 != 0) {
                        f17 = 0.0f;
                    } else {
                        f17 = f15;
                    }
                    aVar = p3.m.f135153a;
                    if (i46 != 0) {
                        o0VarE.C(-650387076);
                        objQ2 = o0VarE.q();
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new a(1);
                            o0VarE.K(objQ2);
                        }
                        lVar2 = (e23.l) objQ2;
                        o0VarE.g0(false);
                    } else {
                        lVar2 = lVar;
                    }
                    x1 x1Var8 = p3.n.f135158a;
                    if (cVar instanceof MapApplier) {
                        mapApplier = (MapApplier) cVar;
                    } else {
                        mapApplier = null;
                    }
                    lVar3 = lVar2;
                    o0VarE.C(-650382489);
                    boolean zR112 = o0VarE.r(mapApplier);
                    z18 = z16;
                    if ((i17 & 14) == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean z411110 = zR112 | z19;
                    if ((i17 & 112) == 32) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    boolean z411111 = z411110 | z24;
                    if ((i17 & 896) == 256) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z411112 = z411111 | z25;
                    if ((i17 & 7168) == 2048) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    boolean z411113 = z411112 | z26;
                    if ((57344 & i17) == 16384) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    boolean zR113 = z411113 | z27 | o0VarE.r(list3);
                    if ((3670016 & i17) == 1048576) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    boolean z411114 = zR113 | z28;
                    if ((234881024 & i17) == 67108864) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    boolean z5112 = z411114 | z29;
                    if ((1879048192 & i17) == 536870912) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    boolean zR114 = z5112 | z34 | o0VarE.r(obj2);
                    if ((i47 & 14) == 4) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    z36 = zR114 | z35;
                    objQ = o0VarE.q();
                    if (z36) {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            final MapApplier mapApplier16 = mapApplier;
                            final Object obj110 = obj2;
                            f18 = f17;
                            z37 = z18;
                            list4 = list3;
                            long j21112 = j15;
                            f19 = f16;
                            z38 = z17;
                            j17 = j16;
                            d16 = d15;
                            j18 = j21112;
                            obj3 = new e23.a() { // from class: com.google.maps.android.compose.d
                                @Override // e23.a
                                public final Object invoke() {
                                    return CircleKt.Circle_rQ_Q3OA$lambda$4$lambda$3(mapApplier16, obj110, lVar3, latLng, z37, j18, d16, j17, list4, f19, z38, f18);
                                }
                            };
                            latLng2 = latLng;
                            lVar4 = lVar3;
                            obj4 = obj110;
                            o0Var = o0VarE;
                            o0Var.K(obj3);
                        } else {
                            obj3 = objQ;
                            o0Var = o0VarE;
                            list4 = list3;
                            obj4 = obj2;
                            f18 = f17;
                            z37 = z18;
                            latLng2 = latLng;
                            lVar4 = lVar3;
                            long j21113 = j15;
                            f19 = f16;
                            z38 = z17;
                            j17 = j16;
                            d16 = d15;
                            j18 = j21113;
                        }
                    } else {
                        final MapApplier mapApplier17 = mapApplier;
                        final Object obj111 = obj2;
                        f18 = f17;
                        z37 = z18;
                        list4 = list3;
                        long j21114 = j15;
                        f19 = f16;
                        z38 = z17;
                        j17 = j16;
                        d16 = d15;
                        j18 = j21114;
                        obj3 = new e23.a() { // from class: com.google.maps.android.compose.d
                            @Override // e23.a
                            public final Object invoke() {
                                return CircleKt.Circle_rQ_Q3OA$lambda$4$lambda$3(mapApplier17, obj111, lVar3, latLng, z37, j18, d16, j17, list4, f19, z38, f18);
                            }
                        };
                        latLng2 = latLng;
                        lVar4 = lVar3;
                        obj4 = obj111;
                        o0Var = o0VarE;
                        o0Var.K(obj3);
                    }
                    aVar2 = (e23.a) obj3;
                    z39 = z37;
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
                    b4.d(new q0(9), lVar4, o0Var);
                    b4.d(new q0(10), latLng2, o0Var);
                    b4.d(new q0(11), Boolean.valueOf(z39), o0Var);
                    b4.d(new e23.p<CircleNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.CircleKt$Circle$3$4
                        @Override // e23.p
                        public /* synthetic */ Unit invoke(CircleNode circleNode, o4.d0 d0Var) {
                            m107invoke4WTKRHQ(circleNode, d0Var.f128833a);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                        public final void m107invoke4WTKRHQ(CircleNode circleNode, long j21115) {
                            circleNode.getClass();
                            circleNode.getCircle().setFillColor(o4.f0.j(j21115));
                        }
                    }, o4.d0.a(j18), o0Var);
                    b4.d(new q0(12), Double.valueOf(d16), o0Var);
                    b4.d(new e23.p<CircleNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.CircleKt$Circle$3$6
                        @Override // e23.p
                        public /* synthetic */ Unit invoke(CircleNode circleNode, o4.d0 d0Var) {
                            m108invoke4WTKRHQ(circleNode, d0Var.f128833a);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                        public final void m108invoke4WTKRHQ(CircleNode circleNode, long j21115) {
                            circleNode.getClass();
                            circleNode.getCircle().setStrokeColor(o4.f0.j(j21115));
                        }
                    }, o4.d0.a(j17), o0Var);
                    b4.d(new q0(13), list4, o0Var);
                    b4.d(new q0(14), Float.valueOf(f19), o0Var);
                    b4.d(new q0(6), obj4, o0Var);
                    b4.d(new q0(7), Boolean.valueOf(z38), o0Var);
                    b4.d(new q0(8), Float.valueOf(f18), o0Var);
                    o0Var.g0(true);
                    long j21115 = j17;
                    obj5 = obj4;
                    f22 = f19;
                    f24 = f18;
                    boolean z5113 = z38;
                    lVar5 = lVar4;
                    j19 = j18;
                    d17 = d16;
                    j16 = j21115;
                    list5 = list4;
                    z44 = z5113;
                } else {
                    if (i27 != 0) {
                        z16 = false;
                    } else {
                        z16 = z14;
                    }
                    if (i18 != 0) {
                        o4.d0.f128823b.getClass();
                        j15 = o4.d0.f128824c;
                    }
                    if (i24 != 0) {
                        d15 = 10.0d;
                    }
                    if (i26 != 0) {
                        o4.d0.f128823b.getClass();
                        j16 = o4.d0.f128824c;
                    }
                    if (i29 != 0) {
                        list3 = null;
                    } else {
                        list3 = list2;
                    }
                    if (i34 != 0) {
                        f16 = 10.0f;
                    }
                    if (i36 != 0) {
                        obj2 = null;
                    } else {
                        obj2 = obj;
                    }
                    if (i38 != 0) {
                        z17 = true;
                    } else {
                        z17 = z15;
                    }
                    if (i44 != 0) {
                        f17 = 0.0f;
                    } else {
                        f17 = f15;
                    }
                    aVar = p3.m.f135153a;
                    if (i46 != 0) {
                        o0VarE.C(-650387076);
                        objQ2 = o0VarE.q();
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new a(1);
                            o0VarE.K(objQ2);
                        }
                        lVar2 = (e23.l) objQ2;
                        o0VarE.g0(false);
                    } else {
                        lVar2 = lVar;
                    }
                    x1 x1Var9 = p3.n.f135158a;
                    if (cVar instanceof MapApplier) {
                        mapApplier = (MapApplier) cVar;
                    } else {
                        mapApplier = null;
                    }
                    lVar3 = lVar2;
                    o0VarE.C(-650382489);
                    boolean zR115 = o0VarE.r(mapApplier);
                    z18 = z16;
                    if ((i17 & 14) == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean z411115 = zR115 | z19;
                    if ((i17 & 112) == 32) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    boolean z411116 = z411115 | z24;
                    if ((i17 & 896) == 256) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z411117 = z411116 | z25;
                    if ((i17 & 7168) == 2048) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    boolean z411118 = z411117 | z26;
                    if ((57344 & i17) == 16384) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    boolean zR116 = z411118 | z27 | o0VarE.r(list3);
                    if ((3670016 & i17) == 1048576) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    boolean z411119 = zR116 | z28;
                    if ((234881024 & i17) == 67108864) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    boolean z5114 = z411119 | z29;
                    if ((1879048192 & i17) == 536870912) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    boolean zR117 = z5114 | z34 | o0VarE.r(obj2);
                    if ((i47 & 14) == 4) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    z36 = zR117 | z35;
                    objQ = o0VarE.q();
                    if (z36) {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            final MapApplier mapApplier18 = mapApplier;
                            final Object obj112 = obj2;
                            f18 = f17;
                            z37 = z18;
                            list4 = list3;
                            long j21116 = j15;
                            f19 = f16;
                            z38 = z17;
                            j17 = j16;
                            d16 = d15;
                            j18 = j21116;
                            obj3 = new e23.a() { // from class: com.google.maps.android.compose.d
                                @Override // e23.a
                                public final Object invoke() {
                                    return CircleKt.Circle_rQ_Q3OA$lambda$4$lambda$3(mapApplier18, obj112, lVar3, latLng, z37, j18, d16, j17, list4, f19, z38, f18);
                                }
                            };
                            latLng2 = latLng;
                            lVar4 = lVar3;
                            obj4 = obj112;
                            o0Var = o0VarE;
                            o0Var.K(obj3);
                        } else {
                            obj3 = objQ;
                            o0Var = o0VarE;
                            list4 = list3;
                            obj4 = obj2;
                            f18 = f17;
                            z37 = z18;
                            latLng2 = latLng;
                            lVar4 = lVar3;
                            long j21117 = j15;
                            f19 = f16;
                            z38 = z17;
                            j17 = j16;
                            d16 = d15;
                            j18 = j21117;
                        }
                    } else {
                        final MapApplier mapApplier19 = mapApplier;
                        final Object obj113 = obj2;
                        f18 = f17;
                        z37 = z18;
                        list4 = list3;
                        long j21118 = j15;
                        f19 = f16;
                        z38 = z17;
                        j17 = j16;
                        d16 = d15;
                        j18 = j21118;
                        obj3 = new e23.a() { // from class: com.google.maps.android.compose.d
                            @Override // e23.a
                            public final Object invoke() {
                                return CircleKt.Circle_rQ_Q3OA$lambda$4$lambda$3(mapApplier19, obj113, lVar3, latLng, z37, j18, d16, j17, list4, f19, z38, f18);
                            }
                        };
                        latLng2 = latLng;
                        lVar4 = lVar3;
                        obj4 = obj113;
                        o0Var = o0VarE;
                        o0Var.K(obj3);
                    }
                    aVar2 = (e23.a) obj3;
                    z39 = z37;
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
                    b4.d(new q0(9), lVar4, o0Var);
                    b4.d(new q0(10), latLng2, o0Var);
                    b4.d(new q0(11), Boolean.valueOf(z39), o0Var);
                    b4.d(new e23.p<CircleNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.CircleKt$Circle$3$4
                        @Override // e23.p
                        public /* synthetic */ Unit invoke(CircleNode circleNode, o4.d0 d0Var) {
                            m107invoke4WTKRHQ(circleNode, d0Var.f128833a);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                        public final void m107invoke4WTKRHQ(CircleNode circleNode, long j21119) {
                            circleNode.getClass();
                            circleNode.getCircle().setFillColor(o4.f0.j(j21119));
                        }
                    }, o4.d0.a(j18), o0Var);
                    b4.d(new q0(12), Double.valueOf(d16), o0Var);
                    b4.d(new e23.p<CircleNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.CircleKt$Circle$3$6
                        @Override // e23.p
                        public /* synthetic */ Unit invoke(CircleNode circleNode, o4.d0 d0Var) {
                            m108invoke4WTKRHQ(circleNode, d0Var.f128833a);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                        public final void m108invoke4WTKRHQ(CircleNode circleNode, long j21119) {
                            circleNode.getClass();
                            circleNode.getCircle().setStrokeColor(o4.f0.j(j21119));
                        }
                    }, o4.d0.a(j17), o0Var);
                    b4.d(new q0(13), list4, o0Var);
                    b4.d(new q0(14), Float.valueOf(f19), o0Var);
                    b4.d(new q0(6), obj4, o0Var);
                    b4.d(new q0(7), Boolean.valueOf(z38), o0Var);
                    b4.d(new q0(8), Float.valueOf(f18), o0Var);
                    o0Var.g0(true);
                    long j21119 = j17;
                    obj5 = obj4;
                    f22 = f19;
                    f24 = f18;
                    boolean z5115 = z38;
                    lVar5 = lVar4;
                    j19 = j18;
                    d17 = d16;
                    j16 = j21119;
                    list5 = list4;
                    z44 = z5115;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    final boolean z5116 = z39;
                    p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.c
                        @Override // e23.p
                        public final Object invoke(Object obj114, Object obj115) {
                            int iIntValue = ((Integer) obj115).intValue();
                            return CircleKt.Circle_rQ_Q3OA$lambda$15(latLng, z5116, j19, d17, j16, list5, f22, obj5, z44, f24, lVar5, i14, i15, i16, (p3.m) obj114, iIntValue);
                        }
                    };
                }
            }
            i17 |= 12582912;
            i38 = i16 & 256;
            if (i38 != 0) {
                i17 |= 100663296;
            } else if ((i14 & 100663296) == 0) {
                if (o0VarE.h(z15)) {
                    i39 = 67108864;
                } else {
                    i39 = 33554432;
                }
                i17 |= i39;
            }
            i44 = i16 & 512;
            if (i44 != 0) {
                i17 |= C.ENCODING_PCM_32BIT;
            } else if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarE.i(f15)) {
                    i45 = 536870912;
                } else {
                    i45 = 268435456;
                }
                i17 |= i45;
            }
            i46 = i16 & 1024;
            if (i46 != 0) {
                i47 = i15 | 6;
            } else if ((i15 & 6) == 0) {
                if (o0VarE.r(lVar)) {
                    i48 = 4;
                } else {
                    i48 = 2;
                }
                i47 = i15 | i48;
            } else {
                i47 = i15;
            }
            if ((i17 & 306783379) != 306783378) {
                if (i27 != 0) {
                    z16 = false;
                } else {
                    z16 = z14;
                }
                if (i18 != 0) {
                    o4.d0.f128823b.getClass();
                    j15 = o4.d0.f128824c;
                }
                if (i24 != 0) {
                    d15 = 10.0d;
                }
                if (i26 != 0) {
                    o4.d0.f128823b.getClass();
                    j16 = o4.d0.f128824c;
                }
                if (i29 != 0) {
                    list3 = null;
                } else {
                    list3 = list2;
                }
                if (i34 != 0) {
                    f16 = 10.0f;
                }
                if (i36 != 0) {
                    obj2 = null;
                } else {
                    obj2 = obj;
                }
                if (i38 != 0) {
                    z17 = true;
                } else {
                    z17 = z15;
                }
                if (i44 != 0) {
                    f17 = 0.0f;
                } else {
                    f17 = f15;
                }
                aVar = p3.m.f135153a;
                if (i46 != 0) {
                    o0VarE.C(-650387076);
                    objQ2 = o0VarE.q();
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new a(1);
                        o0VarE.K(objQ2);
                    }
                    lVar2 = (e23.l) objQ2;
                    o0VarE.g0(false);
                } else {
                    lVar2 = lVar;
                }
                x1 x1Var10 = p3.n.f135158a;
                if (cVar instanceof MapApplier) {
                    mapApplier = (MapApplier) cVar;
                } else {
                    mapApplier = null;
                }
                lVar3 = lVar2;
                o0VarE.C(-650382489);
                boolean zR118 = o0VarE.r(mapApplier);
                z18 = z16;
                if ((i17 & 14) == 4) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean z4111110 = zR118 | z19;
                if ((i17 & 112) == 32) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                boolean z4111111 = z4111110 | z24;
                if ((i17 & 896) == 256) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z4111112 = z4111111 | z25;
                if ((i17 & 7168) == 2048) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                boolean z4111113 = z4111112 | z26;
                if ((57344 & i17) == 16384) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                boolean zR119 = z4111113 | z27 | o0VarE.r(list3);
                if ((3670016 & i17) == 1048576) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                boolean z4111114 = zR119 | z28;
                if ((234881024 & i17) == 67108864) {
                    z29 = true;
                } else {
                    z29 = false;
                }
                boolean z5117 = z4111114 | z29;
                if ((1879048192 & i17) == 536870912) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                boolean zR1110 = z5117 | z34 | o0VarE.r(obj2);
                if ((i47 & 14) == 4) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                z36 = zR1110 | z35;
                objQ = o0VarE.q();
                if (z36) {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        final MapApplier mapApplier110 = mapApplier;
                        final Object obj114 = obj2;
                        f18 = f17;
                        z37 = z18;
                        list4 = list3;
                        long j211110 = j15;
                        f19 = f16;
                        z38 = z17;
                        j17 = j16;
                        d16 = d15;
                        j18 = j211110;
                        obj3 = new e23.a() { // from class: com.google.maps.android.compose.d
                            @Override // e23.a
                            public final Object invoke() {
                                return CircleKt.Circle_rQ_Q3OA$lambda$4$lambda$3(mapApplier110, obj114, lVar3, latLng, z37, j18, d16, j17, list4, f19, z38, f18);
                            }
                        };
                        latLng2 = latLng;
                        lVar4 = lVar3;
                        obj4 = obj114;
                        o0Var = o0VarE;
                        o0Var.K(obj3);
                    } else {
                        obj3 = objQ;
                        o0Var = o0VarE;
                        list4 = list3;
                        obj4 = obj2;
                        f18 = f17;
                        z37 = z18;
                        latLng2 = latLng;
                        lVar4 = lVar3;
                        long j211111 = j15;
                        f19 = f16;
                        z38 = z17;
                        j17 = j16;
                        d16 = d15;
                        j18 = j211111;
                    }
                } else {
                    final MapApplier mapApplier111 = mapApplier;
                    final Object obj115 = obj2;
                    f18 = f17;
                    z37 = z18;
                    list4 = list3;
                    long j211112 = j15;
                    f19 = f16;
                    z38 = z17;
                    j17 = j16;
                    d16 = d15;
                    j18 = j211112;
                    obj3 = new e23.a() { // from class: com.google.maps.android.compose.d
                        @Override // e23.a
                        public final Object invoke() {
                            return CircleKt.Circle_rQ_Q3OA$lambda$4$lambda$3(mapApplier111, obj115, lVar3, latLng, z37, j18, d16, j17, list4, f19, z38, f18);
                        }
                    };
                    latLng2 = latLng;
                    lVar4 = lVar3;
                    obj4 = obj115;
                    o0Var = o0VarE;
                    o0Var.K(obj3);
                }
                aVar2 = (e23.a) obj3;
                z39 = z37;
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
                b4.d(new q0(9), lVar4, o0Var);
                b4.d(new q0(10), latLng2, o0Var);
                b4.d(new q0(11), Boolean.valueOf(z39), o0Var);
                b4.d(new e23.p<CircleNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.CircleKt$Circle$3$4
                    @Override // e23.p
                    public /* synthetic */ Unit invoke(CircleNode circleNode, o4.d0 d0Var) {
                        m107invoke4WTKRHQ(circleNode, d0Var.f128833a);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                    public final void m107invoke4WTKRHQ(CircleNode circleNode, long j211113) {
                        circleNode.getClass();
                        circleNode.getCircle().setFillColor(o4.f0.j(j211113));
                    }
                }, o4.d0.a(j18), o0Var);
                b4.d(new q0(12), Double.valueOf(d16), o0Var);
                b4.d(new e23.p<CircleNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.CircleKt$Circle$3$6
                    @Override // e23.p
                    public /* synthetic */ Unit invoke(CircleNode circleNode, o4.d0 d0Var) {
                        m108invoke4WTKRHQ(circleNode, d0Var.f128833a);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                    public final void m108invoke4WTKRHQ(CircleNode circleNode, long j211113) {
                        circleNode.getClass();
                        circleNode.getCircle().setStrokeColor(o4.f0.j(j211113));
                    }
                }, o4.d0.a(j17), o0Var);
                b4.d(new q0(13), list4, o0Var);
                b4.d(new q0(14), Float.valueOf(f19), o0Var);
                b4.d(new q0(6), obj4, o0Var);
                b4.d(new q0(7), Boolean.valueOf(z38), o0Var);
                b4.d(new q0(8), Float.valueOf(f18), o0Var);
                o0Var.g0(true);
                long j211113 = j17;
                obj5 = obj4;
                f22 = f19;
                f24 = f18;
                boolean z5118 = z38;
                lVar5 = lVar4;
                j19 = j18;
                d17 = d16;
                j16 = j211113;
                list5 = list4;
                z44 = z5118;
            } else {
                if (i27 != 0) {
                    z16 = false;
                } else {
                    z16 = z14;
                }
                if (i18 != 0) {
                    o4.d0.f128823b.getClass();
                    j15 = o4.d0.f128824c;
                }
                if (i24 != 0) {
                    d15 = 10.0d;
                }
                if (i26 != 0) {
                    o4.d0.f128823b.getClass();
                    j16 = o4.d0.f128824c;
                }
                if (i29 != 0) {
                    list3 = null;
                } else {
                    list3 = list2;
                }
                if (i34 != 0) {
                    f16 = 10.0f;
                }
                if (i36 != 0) {
                    obj2 = null;
                } else {
                    obj2 = obj;
                }
                if (i38 != 0) {
                    z17 = true;
                } else {
                    z17 = z15;
                }
                if (i44 != 0) {
                    f17 = 0.0f;
                } else {
                    f17 = f15;
                }
                aVar = p3.m.f135153a;
                if (i46 != 0) {
                    o0VarE.C(-650387076);
                    objQ2 = o0VarE.q();
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new a(1);
                        o0VarE.K(objQ2);
                    }
                    lVar2 = (e23.l) objQ2;
                    o0VarE.g0(false);
                } else {
                    lVar2 = lVar;
                }
                x1 x1Var11 = p3.n.f135158a;
                if (cVar instanceof MapApplier) {
                    mapApplier = (MapApplier) cVar;
                } else {
                    mapApplier = null;
                }
                lVar3 = lVar2;
                o0VarE.C(-650382489);
                boolean zR1111 = o0VarE.r(mapApplier);
                z18 = z16;
                if ((i17 & 14) == 4) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean z4111115 = zR1111 | z19;
                if ((i17 & 112) == 32) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                boolean z4111116 = z4111115 | z24;
                if ((i17 & 896) == 256) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z4111117 = z4111116 | z25;
                if ((i17 & 7168) == 2048) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                boolean z4111118 = z4111117 | z26;
                if ((57344 & i17) == 16384) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                boolean zR1112 = z4111118 | z27 | o0VarE.r(list3);
                if ((3670016 & i17) == 1048576) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                boolean z4111119 = zR1112 | z28;
                if ((234881024 & i17) == 67108864) {
                    z29 = true;
                } else {
                    z29 = false;
                }
                boolean z5119 = z4111119 | z29;
                if ((1879048192 & i17) == 536870912) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                boolean zR1113 = z5119 | z34 | o0VarE.r(obj2);
                if ((i47 & 14) == 4) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                z36 = zR1113 | z35;
                objQ = o0VarE.q();
                if (z36) {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        final MapApplier mapApplier112 = mapApplier;
                        final Object obj116 = obj2;
                        f18 = f17;
                        z37 = z18;
                        list4 = list3;
                        long j211114 = j15;
                        f19 = f16;
                        z38 = z17;
                        j17 = j16;
                        d16 = d15;
                        j18 = j211114;
                        obj3 = new e23.a() { // from class: com.google.maps.android.compose.d
                            @Override // e23.a
                            public final Object invoke() {
                                return CircleKt.Circle_rQ_Q3OA$lambda$4$lambda$3(mapApplier112, obj116, lVar3, latLng, z37, j18, d16, j17, list4, f19, z38, f18);
                            }
                        };
                        latLng2 = latLng;
                        lVar4 = lVar3;
                        obj4 = obj116;
                        o0Var = o0VarE;
                        o0Var.K(obj3);
                    } else {
                        obj3 = objQ;
                        o0Var = o0VarE;
                        list4 = list3;
                        obj4 = obj2;
                        f18 = f17;
                        z37 = z18;
                        latLng2 = latLng;
                        lVar4 = lVar3;
                        long j211115 = j15;
                        f19 = f16;
                        z38 = z17;
                        j17 = j16;
                        d16 = d15;
                        j18 = j211115;
                    }
                } else {
                    final MapApplier mapApplier113 = mapApplier;
                    final Object obj117 = obj2;
                    f18 = f17;
                    z37 = z18;
                    list4 = list3;
                    long j211116 = j15;
                    f19 = f16;
                    z38 = z17;
                    j17 = j16;
                    d16 = d15;
                    j18 = j211116;
                    obj3 = new e23.a() { // from class: com.google.maps.android.compose.d
                        @Override // e23.a
                        public final Object invoke() {
                            return CircleKt.Circle_rQ_Q3OA$lambda$4$lambda$3(mapApplier113, obj117, lVar3, latLng, z37, j18, d16, j17, list4, f19, z38, f18);
                        }
                    };
                    latLng2 = latLng;
                    lVar4 = lVar3;
                    obj4 = obj117;
                    o0Var = o0VarE;
                    o0Var.K(obj3);
                }
                aVar2 = (e23.a) obj3;
                z39 = z37;
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
                b4.d(new q0(9), lVar4, o0Var);
                b4.d(new q0(10), latLng2, o0Var);
                b4.d(new q0(11), Boolean.valueOf(z39), o0Var);
                b4.d(new e23.p<CircleNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.CircleKt$Circle$3$4
                    @Override // e23.p
                    public /* synthetic */ Unit invoke(CircleNode circleNode, o4.d0 d0Var) {
                        m107invoke4WTKRHQ(circleNode, d0Var.f128833a);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                    public final void m107invoke4WTKRHQ(CircleNode circleNode, long j211117) {
                        circleNode.getClass();
                        circleNode.getCircle().setFillColor(o4.f0.j(j211117));
                    }
                }, o4.d0.a(j18), o0Var);
                b4.d(new q0(12), Double.valueOf(d16), o0Var);
                b4.d(new e23.p<CircleNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.CircleKt$Circle$3$6
                    @Override // e23.p
                    public /* synthetic */ Unit invoke(CircleNode circleNode, o4.d0 d0Var) {
                        m108invoke4WTKRHQ(circleNode, d0Var.f128833a);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                    public final void m108invoke4WTKRHQ(CircleNode circleNode, long j211117) {
                        circleNode.getClass();
                        circleNode.getCircle().setStrokeColor(o4.f0.j(j211117));
                    }
                }, o4.d0.a(j17), o0Var);
                b4.d(new q0(13), list4, o0Var);
                b4.d(new q0(14), Float.valueOf(f19), o0Var);
                b4.d(new q0(6), obj4, o0Var);
                b4.d(new q0(7), Boolean.valueOf(z38), o0Var);
                b4.d(new q0(8), Float.valueOf(f18), o0Var);
                o0Var.g0(true);
                long j211117 = j17;
                obj5 = obj4;
                f22 = f19;
                f24 = f18;
                boolean z51110 = z38;
                lVar5 = lVar4;
                j19 = j18;
                d17 = d16;
                j16 = j211117;
                list5 = list4;
                z44 = z51110;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                final boolean z51111 = z39;
                p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.c
                    @Override // e23.p
                    public final Object invoke(Object obj118, Object obj119) {
                        int iIntValue = ((Integer) obj119).intValue();
                        return CircleKt.Circle_rQ_Q3OA$lambda$15(latLng, z51111, j19, d17, j16, list5, f22, obj5, z44, f24, lVar5, i14, i15, i16, (p3.m) obj118, iIntValue);
                    }
                };
            }
        }
        i17 |= 384;
        j15 = j8;
        i24 = i16 & 8;
        if (i24 != 0) {
            i17 |= 3072;
            d15 = d14;
        } else {
            d15 = d14;
            if ((i14 & 3072) == 0) {
                if (o0VarE.m(d15)) {
                    i25 = 2048;
                } else {
                    i25 = 1024;
                }
                i17 |= i25;
            }
        }
        i26 = i16 & 16;
        if (i26 != 0) {
            i17 |= 24576;
            i27 = i49;
            j16 = j14;
        } else {
            i27 = i49;
            j16 = j14;
            if ((i14 & 24576) == 0) {
                if (o0VarE.l(j16)) {
                    i28 = 16384;
                } else {
                    i28 = 8192;
                }
                i17 |= i28;
            }
        }
        i29 = i16 & 32;
        if (i29 != 0) {
            i17 |= 196608;
            list2 = list;
        } else {
            list2 = list;
            if ((i14 & 196608) == 0) {
                if (o0VarE.r(list2)) {
                    i30 = 131072;
                } else {
                    i30 = 65536;
                }
                i17 |= i30;
            }
        }
        i34 = i16 & 64;
        if (i34 != 0) {
            i17 |= 1572864;
            f16 = f14;
        } else {
            f16 = f14;
            if ((i14 & 1572864) == 0) {
                if (o0VarE.i(f16)) {
                    i35 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i35 = 524288;
                }
                i17 |= i35;
            }
        }
        i36 = i16 & 128;
        if (i36 != 0) {
            if ((i14 & 12582912) == 0) {
                if (o0VarE.r(obj)) {
                    i37 = 8388608;
                } else {
                    i37 = 4194304;
                }
                i17 |= i37;
            }
            i38 = i16 & 256;
            if (i38 != 0) {
                i17 |= 100663296;
            } else if ((i14 & 100663296) == 0) {
                if (o0VarE.h(z15)) {
                    i39 = 67108864;
                } else {
                    i39 = 33554432;
                }
                i17 |= i39;
            }
            i44 = i16 & 512;
            if (i44 != 0) {
                i17 |= C.ENCODING_PCM_32BIT;
            } else if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarE.i(f15)) {
                    i45 = 536870912;
                } else {
                    i45 = 268435456;
                }
                i17 |= i45;
            }
            i46 = i16 & 1024;
            if (i46 != 0) {
                i47 = i15 | 6;
            } else if ((i15 & 6) == 0) {
                if (o0VarE.r(lVar)) {
                    i48 = 4;
                } else {
                    i48 = 2;
                }
                i47 = i15 | i48;
            } else {
                i47 = i15;
            }
            if ((i17 & 306783379) != 306783378) {
                if (i27 != 0) {
                    z16 = false;
                } else {
                    z16 = z14;
                }
                if (i18 != 0) {
                    o4.d0.f128823b.getClass();
                    j15 = o4.d0.f128824c;
                }
                if (i24 != 0) {
                    d15 = 10.0d;
                }
                if (i26 != 0) {
                    o4.d0.f128823b.getClass();
                    j16 = o4.d0.f128824c;
                }
                if (i29 != 0) {
                    list3 = null;
                } else {
                    list3 = list2;
                }
                if (i34 != 0) {
                    f16 = 10.0f;
                }
                if (i36 != 0) {
                    obj2 = null;
                } else {
                    obj2 = obj;
                }
                if (i38 != 0) {
                    z17 = true;
                } else {
                    z17 = z15;
                }
                if (i44 != 0) {
                    f17 = 0.0f;
                } else {
                    f17 = f15;
                }
                aVar = p3.m.f135153a;
                if (i46 != 0) {
                    o0VarE.C(-650387076);
                    objQ2 = o0VarE.q();
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new a(1);
                        o0VarE.K(objQ2);
                    }
                    lVar2 = (e23.l) objQ2;
                    o0VarE.g0(false);
                } else {
                    lVar2 = lVar;
                }
                x1 x1Var12 = p3.n.f135158a;
                if (cVar instanceof MapApplier) {
                    mapApplier = (MapApplier) cVar;
                } else {
                    mapApplier = null;
                }
                lVar3 = lVar2;
                o0VarE.C(-650382489);
                boolean zR1114 = o0VarE.r(mapApplier);
                z18 = z16;
                if ((i17 & 14) == 4) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean z41111110 = zR1114 | z19;
                if ((i17 & 112) == 32) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                boolean z41111111 = z41111110 | z24;
                if ((i17 & 896) == 256) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z41111112 = z41111111 | z25;
                if ((i17 & 7168) == 2048) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                boolean z41111113 = z41111112 | z26;
                if ((57344 & i17) == 16384) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                boolean zR1115 = z41111113 | z27 | o0VarE.r(list3);
                if ((3670016 & i17) == 1048576) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                boolean z41111114 = zR1115 | z28;
                if ((234881024 & i17) == 67108864) {
                    z29 = true;
                } else {
                    z29 = false;
                }
                boolean z51112 = z41111114 | z29;
                if ((1879048192 & i17) == 536870912) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                boolean zR1116 = z51112 | z34 | o0VarE.r(obj2);
                if ((i47 & 14) == 4) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                z36 = zR1116 | z35;
                objQ = o0VarE.q();
                if (z36) {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        final MapApplier mapApplier114 = mapApplier;
                        final Object obj118 = obj2;
                        f18 = f17;
                        z37 = z18;
                        list4 = list3;
                        long j211118 = j15;
                        f19 = f16;
                        z38 = z17;
                        j17 = j16;
                        d16 = d15;
                        j18 = j211118;
                        obj3 = new e23.a() { // from class: com.google.maps.android.compose.d
                            @Override // e23.a
                            public final Object invoke() {
                                return CircleKt.Circle_rQ_Q3OA$lambda$4$lambda$3(mapApplier114, obj118, lVar3, latLng, z37, j18, d16, j17, list4, f19, z38, f18);
                            }
                        };
                        latLng2 = latLng;
                        lVar4 = lVar3;
                        obj4 = obj118;
                        o0Var = o0VarE;
                        o0Var.K(obj3);
                    } else {
                        obj3 = objQ;
                        o0Var = o0VarE;
                        list4 = list3;
                        obj4 = obj2;
                        f18 = f17;
                        z37 = z18;
                        latLng2 = latLng;
                        lVar4 = lVar3;
                        long j211119 = j15;
                        f19 = f16;
                        z38 = z17;
                        j17 = j16;
                        d16 = d15;
                        j18 = j211119;
                    }
                } else {
                    final MapApplier mapApplier115 = mapApplier;
                    final Object obj119 = obj2;
                    f18 = f17;
                    z37 = z18;
                    list4 = list3;
                    long j2111110 = j15;
                    f19 = f16;
                    z38 = z17;
                    j17 = j16;
                    d16 = d15;
                    j18 = j2111110;
                    obj3 = new e23.a() { // from class: com.google.maps.android.compose.d
                        @Override // e23.a
                        public final Object invoke() {
                            return CircleKt.Circle_rQ_Q3OA$lambda$4$lambda$3(mapApplier115, obj119, lVar3, latLng, z37, j18, d16, j17, list4, f19, z38, f18);
                        }
                    };
                    latLng2 = latLng;
                    lVar4 = lVar3;
                    obj4 = obj119;
                    o0Var = o0VarE;
                    o0Var.K(obj3);
                }
                aVar2 = (e23.a) obj3;
                z39 = z37;
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
                b4.d(new q0(9), lVar4, o0Var);
                b4.d(new q0(10), latLng2, o0Var);
                b4.d(new q0(11), Boolean.valueOf(z39), o0Var);
                b4.d(new e23.p<CircleNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.CircleKt$Circle$3$4
                    @Override // e23.p
                    public /* synthetic */ Unit invoke(CircleNode circleNode, o4.d0 d0Var) {
                        m107invoke4WTKRHQ(circleNode, d0Var.f128833a);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                    public final void m107invoke4WTKRHQ(CircleNode circleNode, long j2111111) {
                        circleNode.getClass();
                        circleNode.getCircle().setFillColor(o4.f0.j(j2111111));
                    }
                }, o4.d0.a(j18), o0Var);
                b4.d(new q0(12), Double.valueOf(d16), o0Var);
                b4.d(new e23.p<CircleNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.CircleKt$Circle$3$6
                    @Override // e23.p
                    public /* synthetic */ Unit invoke(CircleNode circleNode, o4.d0 d0Var) {
                        m108invoke4WTKRHQ(circleNode, d0Var.f128833a);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                    public final void m108invoke4WTKRHQ(CircleNode circleNode, long j2111111) {
                        circleNode.getClass();
                        circleNode.getCircle().setStrokeColor(o4.f0.j(j2111111));
                    }
                }, o4.d0.a(j17), o0Var);
                b4.d(new q0(13), list4, o0Var);
                b4.d(new q0(14), Float.valueOf(f19), o0Var);
                b4.d(new q0(6), obj4, o0Var);
                b4.d(new q0(7), Boolean.valueOf(z38), o0Var);
                b4.d(new q0(8), Float.valueOf(f18), o0Var);
                o0Var.g0(true);
                long j2111111 = j17;
                obj5 = obj4;
                f22 = f19;
                f24 = f18;
                boolean z51113 = z38;
                lVar5 = lVar4;
                j19 = j18;
                d17 = d16;
                j16 = j2111111;
                list5 = list4;
                z44 = z51113;
            } else {
                if (i27 != 0) {
                    z16 = false;
                } else {
                    z16 = z14;
                }
                if (i18 != 0) {
                    o4.d0.f128823b.getClass();
                    j15 = o4.d0.f128824c;
                }
                if (i24 != 0) {
                    d15 = 10.0d;
                }
                if (i26 != 0) {
                    o4.d0.f128823b.getClass();
                    j16 = o4.d0.f128824c;
                }
                if (i29 != 0) {
                    list3 = null;
                } else {
                    list3 = list2;
                }
                if (i34 != 0) {
                    f16 = 10.0f;
                }
                if (i36 != 0) {
                    obj2 = null;
                } else {
                    obj2 = obj;
                }
                if (i38 != 0) {
                    z17 = true;
                } else {
                    z17 = z15;
                }
                if (i44 != 0) {
                    f17 = 0.0f;
                } else {
                    f17 = f15;
                }
                aVar = p3.m.f135153a;
                if (i46 != 0) {
                    o0VarE.C(-650387076);
                    objQ2 = o0VarE.q();
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new a(1);
                        o0VarE.K(objQ2);
                    }
                    lVar2 = (e23.l) objQ2;
                    o0VarE.g0(false);
                } else {
                    lVar2 = lVar;
                }
                x1 x1Var13 = p3.n.f135158a;
                if (cVar instanceof MapApplier) {
                    mapApplier = (MapApplier) cVar;
                } else {
                    mapApplier = null;
                }
                lVar3 = lVar2;
                o0VarE.C(-650382489);
                boolean zR1117 = o0VarE.r(mapApplier);
                z18 = z16;
                if ((i17 & 14) == 4) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean z41111115 = zR1117 | z19;
                if ((i17 & 112) == 32) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                boolean z41111116 = z41111115 | z24;
                if ((i17 & 896) == 256) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z41111117 = z41111116 | z25;
                if ((i17 & 7168) == 2048) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                boolean z41111118 = z41111117 | z26;
                if ((57344 & i17) == 16384) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                boolean zR1118 = z41111118 | z27 | o0VarE.r(list3);
                if ((3670016 & i17) == 1048576) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                boolean z41111119 = zR1118 | z28;
                if ((234881024 & i17) == 67108864) {
                    z29 = true;
                } else {
                    z29 = false;
                }
                boolean z51114 = z41111119 | z29;
                if ((1879048192 & i17) == 536870912) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                boolean zR1119 = z51114 | z34 | o0VarE.r(obj2);
                if ((i47 & 14) == 4) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                z36 = zR1119 | z35;
                objQ = o0VarE.q();
                if (z36) {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        final MapApplier mapApplier116 = mapApplier;
                        final Object obj1110 = obj2;
                        f18 = f17;
                        z37 = z18;
                        list4 = list3;
                        long j2111112 = j15;
                        f19 = f16;
                        z38 = z17;
                        j17 = j16;
                        d16 = d15;
                        j18 = j2111112;
                        obj3 = new e23.a() { // from class: com.google.maps.android.compose.d
                            @Override // e23.a
                            public final Object invoke() {
                                return CircleKt.Circle_rQ_Q3OA$lambda$4$lambda$3(mapApplier116, obj1110, lVar3, latLng, z37, j18, d16, j17, list4, f19, z38, f18);
                            }
                        };
                        latLng2 = latLng;
                        lVar4 = lVar3;
                        obj4 = obj1110;
                        o0Var = o0VarE;
                        o0Var.K(obj3);
                    } else {
                        obj3 = objQ;
                        o0Var = o0VarE;
                        list4 = list3;
                        obj4 = obj2;
                        f18 = f17;
                        z37 = z18;
                        latLng2 = latLng;
                        lVar4 = lVar3;
                        long j2111113 = j15;
                        f19 = f16;
                        z38 = z17;
                        j17 = j16;
                        d16 = d15;
                        j18 = j2111113;
                    }
                } else {
                    final MapApplier mapApplier117 = mapApplier;
                    final Object obj1111 = obj2;
                    f18 = f17;
                    z37 = z18;
                    list4 = list3;
                    long j2111114 = j15;
                    f19 = f16;
                    z38 = z17;
                    j17 = j16;
                    d16 = d15;
                    j18 = j2111114;
                    obj3 = new e23.a() { // from class: com.google.maps.android.compose.d
                        @Override // e23.a
                        public final Object invoke() {
                            return CircleKt.Circle_rQ_Q3OA$lambda$4$lambda$3(mapApplier117, obj1111, lVar3, latLng, z37, j18, d16, j17, list4, f19, z38, f18);
                        }
                    };
                    latLng2 = latLng;
                    lVar4 = lVar3;
                    obj4 = obj1111;
                    o0Var = o0VarE;
                    o0Var.K(obj3);
                }
                aVar2 = (e23.a) obj3;
                z39 = z37;
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
                b4.d(new q0(9), lVar4, o0Var);
                b4.d(new q0(10), latLng2, o0Var);
                b4.d(new q0(11), Boolean.valueOf(z39), o0Var);
                b4.d(new e23.p<CircleNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.CircleKt$Circle$3$4
                    @Override // e23.p
                    public /* synthetic */ Unit invoke(CircleNode circleNode, o4.d0 d0Var) {
                        m107invoke4WTKRHQ(circleNode, d0Var.f128833a);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                    public final void m107invoke4WTKRHQ(CircleNode circleNode, long j2111115) {
                        circleNode.getClass();
                        circleNode.getCircle().setFillColor(o4.f0.j(j2111115));
                    }
                }, o4.d0.a(j18), o0Var);
                b4.d(new q0(12), Double.valueOf(d16), o0Var);
                b4.d(new e23.p<CircleNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.CircleKt$Circle$3$6
                    @Override // e23.p
                    public /* synthetic */ Unit invoke(CircleNode circleNode, o4.d0 d0Var) {
                        m108invoke4WTKRHQ(circleNode, d0Var.f128833a);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                    public final void m108invoke4WTKRHQ(CircleNode circleNode, long j2111115) {
                        circleNode.getClass();
                        circleNode.getCircle().setStrokeColor(o4.f0.j(j2111115));
                    }
                }, o4.d0.a(j17), o0Var);
                b4.d(new q0(13), list4, o0Var);
                b4.d(new q0(14), Float.valueOf(f19), o0Var);
                b4.d(new q0(6), obj4, o0Var);
                b4.d(new q0(7), Boolean.valueOf(z38), o0Var);
                b4.d(new q0(8), Float.valueOf(f18), o0Var);
                o0Var.g0(true);
                long j2111115 = j17;
                obj5 = obj4;
                f22 = f19;
                f24 = f18;
                boolean z51115 = z38;
                lVar5 = lVar4;
                j19 = j18;
                d17 = d16;
                j16 = j2111115;
                list5 = list4;
                z44 = z51115;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                final boolean z51116 = z39;
                p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.c
                    @Override // e23.p
                    public final Object invoke(Object obj1112, Object obj1113) {
                        int iIntValue = ((Integer) obj1113).intValue();
                        return CircleKt.Circle_rQ_Q3OA$lambda$15(latLng, z51116, j19, d17, j16, list5, f22, obj5, z44, f24, lVar5, i14, i15, i16, (p3.m) obj1112, iIntValue);
                    }
                };
            }
        }
        i17 |= 12582912;
        i38 = i16 & 256;
        if (i38 != 0) {
            i17 |= 100663296;
        } else if ((i14 & 100663296) == 0) {
            if (o0VarE.h(z15)) {
                i39 = 67108864;
            } else {
                i39 = 33554432;
            }
            i17 |= i39;
        }
        i44 = i16 & 512;
        if (i44 != 0) {
            i17 |= C.ENCODING_PCM_32BIT;
        } else if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            if (o0VarE.i(f15)) {
                i45 = 536870912;
            } else {
                i45 = 268435456;
            }
            i17 |= i45;
        }
        i46 = i16 & 1024;
        if (i46 != 0) {
            i47 = i15 | 6;
        } else if ((i15 & 6) == 0) {
            if (o0VarE.r(lVar)) {
                i48 = 4;
            } else {
                i48 = 2;
            }
            i47 = i15 | i48;
        } else {
            i47 = i15;
        }
        if ((i17 & 306783379) != 306783378) {
            if (i27 != 0) {
                z16 = false;
            } else {
                z16 = z14;
            }
            if (i18 != 0) {
                o4.d0.f128823b.getClass();
                j15 = o4.d0.f128824c;
            }
            if (i24 != 0) {
                d15 = 10.0d;
            }
            if (i26 != 0) {
                o4.d0.f128823b.getClass();
                j16 = o4.d0.f128824c;
            }
            if (i29 != 0) {
                list3 = null;
            } else {
                list3 = list2;
            }
            if (i34 != 0) {
                f16 = 10.0f;
            }
            if (i36 != 0) {
                obj2 = null;
            } else {
                obj2 = obj;
            }
            if (i38 != 0) {
                z17 = true;
            } else {
                z17 = z15;
            }
            if (i44 != 0) {
                f17 = 0.0f;
            } else {
                f17 = f15;
            }
            aVar = p3.m.f135153a;
            if (i46 != 0) {
                o0VarE.C(-650387076);
                objQ2 = o0VarE.q();
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new a(1);
                    o0VarE.K(objQ2);
                }
                lVar2 = (e23.l) objQ2;
                o0VarE.g0(false);
            } else {
                lVar2 = lVar;
            }
            x1 x1Var14 = p3.n.f135158a;
            if (cVar instanceof MapApplier) {
                mapApplier = (MapApplier) cVar;
            } else {
                mapApplier = null;
            }
            lVar3 = lVar2;
            o0VarE.C(-650382489);
            boolean zR11110 = o0VarE.r(mapApplier);
            z18 = z16;
            if ((i17 & 14) == 4) {
                z19 = true;
            } else {
                z19 = false;
            }
            boolean z411111110 = zR11110 | z19;
            if ((i17 & 112) == 32) {
                z24 = true;
            } else {
                z24 = false;
            }
            boolean z411111111 = z411111110 | z24;
            if ((i17 & 896) == 256) {
                z25 = true;
            } else {
                z25 = false;
            }
            boolean z411111112 = z411111111 | z25;
            if ((i17 & 7168) == 2048) {
                z26 = true;
            } else {
                z26 = false;
            }
            boolean z411111113 = z411111112 | z26;
            if ((57344 & i17) == 16384) {
                z27 = true;
            } else {
                z27 = false;
            }
            boolean zR11111 = z411111113 | z27 | o0VarE.r(list3);
            if ((3670016 & i17) == 1048576) {
                z28 = true;
            } else {
                z28 = false;
            }
            boolean z411111114 = zR11111 | z28;
            if ((234881024 & i17) == 67108864) {
                z29 = true;
            } else {
                z29 = false;
            }
            boolean z51117 = z411111114 | z29;
            if ((1879048192 & i17) == 536870912) {
                z34 = true;
            } else {
                z34 = false;
            }
            boolean zR11112 = z51117 | z34 | o0VarE.r(obj2);
            if ((i47 & 14) == 4) {
                z35 = true;
            } else {
                z35 = false;
            }
            z36 = zR11112 | z35;
            objQ = o0VarE.q();
            if (z36) {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    final MapApplier mapApplier118 = mapApplier;
                    final Object obj1112 = obj2;
                    f18 = f17;
                    z37 = z18;
                    list4 = list3;
                    long j2111116 = j15;
                    f19 = f16;
                    z38 = z17;
                    j17 = j16;
                    d16 = d15;
                    j18 = j2111116;
                    obj3 = new e23.a() { // from class: com.google.maps.android.compose.d
                        @Override // e23.a
                        public final Object invoke() {
                            return CircleKt.Circle_rQ_Q3OA$lambda$4$lambda$3(mapApplier118, obj1112, lVar3, latLng, z37, j18, d16, j17, list4, f19, z38, f18);
                        }
                    };
                    latLng2 = latLng;
                    lVar4 = lVar3;
                    obj4 = obj1112;
                    o0Var = o0VarE;
                    o0Var.K(obj3);
                } else {
                    obj3 = objQ;
                    o0Var = o0VarE;
                    list4 = list3;
                    obj4 = obj2;
                    f18 = f17;
                    z37 = z18;
                    latLng2 = latLng;
                    lVar4 = lVar3;
                    long j2111117 = j15;
                    f19 = f16;
                    z38 = z17;
                    j17 = j16;
                    d16 = d15;
                    j18 = j2111117;
                }
            } else {
                final MapApplier mapApplier119 = mapApplier;
                final Object obj1113 = obj2;
                f18 = f17;
                z37 = z18;
                list4 = list3;
                long j2111118 = j15;
                f19 = f16;
                z38 = z17;
                j17 = j16;
                d16 = d15;
                j18 = j2111118;
                obj3 = new e23.a() { // from class: com.google.maps.android.compose.d
                    @Override // e23.a
                    public final Object invoke() {
                        return CircleKt.Circle_rQ_Q3OA$lambda$4$lambda$3(mapApplier119, obj1113, lVar3, latLng, z37, j18, d16, j17, list4, f19, z38, f18);
                    }
                };
                latLng2 = latLng;
                lVar4 = lVar3;
                obj4 = obj1113;
                o0Var = o0VarE;
                o0Var.K(obj3);
            }
            aVar2 = (e23.a) obj3;
            z39 = z37;
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
            b4.d(new q0(9), lVar4, o0Var);
            b4.d(new q0(10), latLng2, o0Var);
            b4.d(new q0(11), Boolean.valueOf(z39), o0Var);
            b4.d(new e23.p<CircleNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.CircleKt$Circle$3$4
                @Override // e23.p
                public /* synthetic */ Unit invoke(CircleNode circleNode, o4.d0 d0Var) {
                    m107invoke4WTKRHQ(circleNode, d0Var.f128833a);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                public final void m107invoke4WTKRHQ(CircleNode circleNode, long j2111119) {
                    circleNode.getClass();
                    circleNode.getCircle().setFillColor(o4.f0.j(j2111119));
                }
            }, o4.d0.a(j18), o0Var);
            b4.d(new q0(12), Double.valueOf(d16), o0Var);
            b4.d(new e23.p<CircleNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.CircleKt$Circle$3$6
                @Override // e23.p
                public /* synthetic */ Unit invoke(CircleNode circleNode, o4.d0 d0Var) {
                    m108invoke4WTKRHQ(circleNode, d0Var.f128833a);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                public final void m108invoke4WTKRHQ(CircleNode circleNode, long j2111119) {
                    circleNode.getClass();
                    circleNode.getCircle().setStrokeColor(o4.f0.j(j2111119));
                }
            }, o4.d0.a(j17), o0Var);
            b4.d(new q0(13), list4, o0Var);
            b4.d(new q0(14), Float.valueOf(f19), o0Var);
            b4.d(new q0(6), obj4, o0Var);
            b4.d(new q0(7), Boolean.valueOf(z38), o0Var);
            b4.d(new q0(8), Float.valueOf(f18), o0Var);
            o0Var.g0(true);
            long j2111119 = j17;
            obj5 = obj4;
            f22 = f19;
            f24 = f18;
            boolean z51118 = z38;
            lVar5 = lVar4;
            j19 = j18;
            d17 = d16;
            j16 = j2111119;
            list5 = list4;
            z44 = z51118;
        } else {
            if (i27 != 0) {
                z16 = false;
            } else {
                z16 = z14;
            }
            if (i18 != 0) {
                o4.d0.f128823b.getClass();
                j15 = o4.d0.f128824c;
            }
            if (i24 != 0) {
                d15 = 10.0d;
            }
            if (i26 != 0) {
                o4.d0.f128823b.getClass();
                j16 = o4.d0.f128824c;
            }
            if (i29 != 0) {
                list3 = null;
            } else {
                list3 = list2;
            }
            if (i34 != 0) {
                f16 = 10.0f;
            }
            if (i36 != 0) {
                obj2 = null;
            } else {
                obj2 = obj;
            }
            if (i38 != 0) {
                z17 = true;
            } else {
                z17 = z15;
            }
            if (i44 != 0) {
                f17 = 0.0f;
            } else {
                f17 = f15;
            }
            aVar = p3.m.f135153a;
            if (i46 != 0) {
                o0VarE.C(-650387076);
                objQ2 = o0VarE.q();
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new a(1);
                    o0VarE.K(objQ2);
                }
                lVar2 = (e23.l) objQ2;
                o0VarE.g0(false);
            } else {
                lVar2 = lVar;
            }
            x1 x1Var15 = p3.n.f135158a;
            if (cVar instanceof MapApplier) {
                mapApplier = (MapApplier) cVar;
            } else {
                mapApplier = null;
            }
            lVar3 = lVar2;
            o0VarE.C(-650382489);
            boolean zR11113 = o0VarE.r(mapApplier);
            z18 = z16;
            if ((i17 & 14) == 4) {
                z19 = true;
            } else {
                z19 = false;
            }
            boolean z411111115 = zR11113 | z19;
            if ((i17 & 112) == 32) {
                z24 = true;
            } else {
                z24 = false;
            }
            boolean z411111116 = z411111115 | z24;
            if ((i17 & 896) == 256) {
                z25 = true;
            } else {
                z25 = false;
            }
            boolean z411111117 = z411111116 | z25;
            if ((i17 & 7168) == 2048) {
                z26 = true;
            } else {
                z26 = false;
            }
            boolean z411111118 = z411111117 | z26;
            if ((57344 & i17) == 16384) {
                z27 = true;
            } else {
                z27 = false;
            }
            boolean zR11114 = z411111118 | z27 | o0VarE.r(list3);
            if ((3670016 & i17) == 1048576) {
                z28 = true;
            } else {
                z28 = false;
            }
            boolean z411111119 = zR11114 | z28;
            if ((234881024 & i17) == 67108864) {
                z29 = true;
            } else {
                z29 = false;
            }
            boolean z51119 = z411111119 | z29;
            if ((1879048192 & i17) == 536870912) {
                z34 = true;
            } else {
                z34 = false;
            }
            boolean zR11115 = z51119 | z34 | o0VarE.r(obj2);
            if ((i47 & 14) == 4) {
                z35 = true;
            } else {
                z35 = false;
            }
            z36 = zR11115 | z35;
            objQ = o0VarE.q();
            if (z36) {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    final MapApplier mapApplier1110 = mapApplier;
                    final Object obj1114 = obj2;
                    f18 = f17;
                    z37 = z18;
                    list4 = list3;
                    long j21111110 = j15;
                    f19 = f16;
                    z38 = z17;
                    j17 = j16;
                    d16 = d15;
                    j18 = j21111110;
                    obj3 = new e23.a() { // from class: com.google.maps.android.compose.d
                        @Override // e23.a
                        public final Object invoke() {
                            return CircleKt.Circle_rQ_Q3OA$lambda$4$lambda$3(mapApplier1110, obj1114, lVar3, latLng, z37, j18, d16, j17, list4, f19, z38, f18);
                        }
                    };
                    latLng2 = latLng;
                    lVar4 = lVar3;
                    obj4 = obj1114;
                    o0Var = o0VarE;
                    o0Var.K(obj3);
                } else {
                    obj3 = objQ;
                    o0Var = o0VarE;
                    list4 = list3;
                    obj4 = obj2;
                    f18 = f17;
                    z37 = z18;
                    latLng2 = latLng;
                    lVar4 = lVar3;
                    long j21111111 = j15;
                    f19 = f16;
                    z38 = z17;
                    j17 = j16;
                    d16 = d15;
                    j18 = j21111111;
                }
            } else {
                final MapApplier mapApplier1111 = mapApplier;
                final Object obj1115 = obj2;
                f18 = f17;
                z37 = z18;
                list4 = list3;
                long j21111112 = j15;
                f19 = f16;
                z38 = z17;
                j17 = j16;
                d16 = d15;
                j18 = j21111112;
                obj3 = new e23.a() { // from class: com.google.maps.android.compose.d
                    @Override // e23.a
                    public final Object invoke() {
                        return CircleKt.Circle_rQ_Q3OA$lambda$4$lambda$3(mapApplier1111, obj1115, lVar3, latLng, z37, j18, d16, j17, list4, f19, z38, f18);
                    }
                };
                latLng2 = latLng;
                lVar4 = lVar3;
                obj4 = obj1115;
                o0Var = o0VarE;
                o0Var.K(obj3);
            }
            aVar2 = (e23.a) obj3;
            z39 = z37;
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
            b4.d(new q0(9), lVar4, o0Var);
            b4.d(new q0(10), latLng2, o0Var);
            b4.d(new q0(11), Boolean.valueOf(z39), o0Var);
            b4.d(new e23.p<CircleNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.CircleKt$Circle$3$4
                @Override // e23.p
                public /* synthetic */ Unit invoke(CircleNode circleNode, o4.d0 d0Var) {
                    m107invoke4WTKRHQ(circleNode, d0Var.f128833a);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                public final void m107invoke4WTKRHQ(CircleNode circleNode, long j21111113) {
                    circleNode.getClass();
                    circleNode.getCircle().setFillColor(o4.f0.j(j21111113));
                }
            }, o4.d0.a(j18), o0Var);
            b4.d(new q0(12), Double.valueOf(d16), o0Var);
            b4.d(new e23.p<CircleNode, o4.d0, Unit>() { // from class: com.google.maps.android.compose.CircleKt$Circle$3$6
                @Override // e23.p
                public /* synthetic */ Unit invoke(CircleNode circleNode, o4.d0 d0Var) {
                    m108invoke4WTKRHQ(circleNode, d0Var.f128833a);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
                public final void m108invoke4WTKRHQ(CircleNode circleNode, long j21111113) {
                    circleNode.getClass();
                    circleNode.getCircle().setStrokeColor(o4.f0.j(j21111113));
                }
            }, o4.d0.a(j17), o0Var);
            b4.d(new q0(13), list4, o0Var);
            b4.d(new q0(14), Float.valueOf(f19), o0Var);
            b4.d(new q0(6), obj4, o0Var);
            b4.d(new q0(7), Boolean.valueOf(z38), o0Var);
            b4.d(new q0(8), Float.valueOf(f18), o0Var);
            o0Var.g0(true);
            long j21111113 = j17;
            obj5 = obj4;
            f22 = f19;
            f24 = f18;
            boolean z511110 = z38;
            lVar5 = lVar4;
            j19 = j18;
            d17 = d16;
            j16 = j21111113;
            list5 = list4;
            z44 = z511110;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            final boolean z511111 = z39;
            p2VarI0.f135219d = new e23.p() { // from class: com.google.maps.android.compose.c
                @Override // e23.p
                public final Object invoke(Object obj1116, Object obj1117) {
                    int iIntValue = ((Integer) obj1117).intValue();
                    return CircleKt.Circle_rQ_Q3OA$lambda$15(latLng, z511111, j19, d17, j16, list5, f22, obj5, z44, f24, lVar5, i14, i15, i16, (p3.m) obj1116, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Circle_rQ_Q3OA$lambda$1$lambda$0(Circle circle) {
        circle.getClass();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Circle_rQ_Q3OA$lambda$14$lambda$10(CircleNode circleNode, float f14) {
        circleNode.getClass();
        circleNode.getCircle().setStrokeWidth(f14);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Circle_rQ_Q3OA$lambda$14$lambda$11(CircleNode circleNode, Object obj) {
        circleNode.getClass();
        circleNode.getCircle().setTag(obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Circle_rQ_Q3OA$lambda$14$lambda$12(CircleNode circleNode, boolean z14) {
        circleNode.getClass();
        circleNode.getCircle().setVisible(z14);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Circle_rQ_Q3OA$lambda$14$lambda$13(CircleNode circleNode, float f14) {
        circleNode.getClass();
        circleNode.getCircle().setZIndex(f14);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Circle_rQ_Q3OA$lambda$14$lambda$5(CircleNode circleNode, e23.l lVar) {
        circleNode.getClass();
        lVar.getClass();
        circleNode.setOnCircleClick(lVar);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Circle_rQ_Q3OA$lambda$14$lambda$6(CircleNode circleNode, LatLng latLng) {
        circleNode.getClass();
        latLng.getClass();
        circleNode.getCircle().setCenter(latLng);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Circle_rQ_Q3OA$lambda$14$lambda$7(CircleNode circleNode, boolean z14) {
        circleNode.getClass();
        circleNode.getCircle().setClickable(z14);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Circle_rQ_Q3OA$lambda$14$lambda$8(CircleNode circleNode, double d14) {
        circleNode.getClass();
        circleNode.getCircle().setRadius(d14);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Circle_rQ_Q3OA$lambda$14$lambda$9(CircleNode circleNode, List list) {
        circleNode.getClass();
        circleNode.getCircle().setStrokePattern(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Circle_rQ_Q3OA$lambda$15(LatLng latLng, boolean z14, long j8, double d14, long j14, List list, float f14, Object obj, boolean z15, float f15, e23.l lVar, int i14, int i15, int i16, p3.m mVar, int i17) {
        m106CirclerQ_Q3OA(latLng, z14, j8, d14, j14, list, f14, obj, z15, f15, lVar, mVar, p3.p0.t(i14 | 1), p3.p0.t(i15), i16);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CircleNode Circle_rQ_Q3OA$lambda$4$lambda$3(MapApplier mapApplier, Object obj, e23.l lVar, LatLng latLng, boolean z14, long j8, double d14, long j14, List list, float f14, boolean z15, float f15) {
        GoogleMap map;
        if (mapApplier == null || (map = mapApplier.getMap()) == null) {
            vb.h.z("Error adding circle");
            return null;
        }
        CircleOptions circleOptions = new CircleOptions();
        circleOptions.center(latLng);
        circleOptions.clickable(z14);
        circleOptions.fillColor(o4.f0.j(j8));
        circleOptions.radius(d14);
        circleOptions.strokeColor(o4.f0.j(j14));
        circleOptions.strokePattern(list);
        circleOptions.strokeWidth(f14);
        circleOptions.visible(z15);
        circleOptions.zIndex(f15);
        Circle circleAddCircle = map.addCircle(circleOptions);
        circleAddCircle.getClass();
        circleAddCircle.setTag(obj);
        return new CircleNode(circleAddCircle, lVar);
    }
}
