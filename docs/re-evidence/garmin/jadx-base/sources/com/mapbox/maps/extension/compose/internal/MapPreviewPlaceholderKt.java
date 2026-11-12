package com.mapbox.maps.extension.compose.internal;

import e23.l;
import h4.r;
import o4.d0;
import o4.f0;
import o4.m1;
import p005kotlin.Metadata;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a;\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lh4/r;", "modifier", "Lo4/d0;", "placeholderColor", "", "strokeWidthInDp", "strokeColor", "", "MapPreviewPlaceHolder--RWsq2U", "(Lh4/r;JIJLp3/m;II)V", "MapPreviewPlaceHolder", "extension-compose_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class MapPreviewPlaceholderKt {
    /* JADX WARN: Code duplicated, block: B:62:0x00c8  */
    /* JADX INFO: renamed from: MapPreviewPlaceHolder--RWsq2U, reason: not valid java name */
    public static final void m207MapPreviewPlaceHolderRWsq2U(r rVar, long j8, int i14, long j14, m mVar, int i15, int i16) {
        int i17;
        long j15;
        int i18;
        long j16;
        rVar.getClass();
        o0 o0VarE = mVar.E(268920985);
        if ((i16 & 1) != 0) {
            i17 = i15 | 6;
        } else if ((i15 & 14) == 0) {
            i17 = (o0VarE.B(rVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i19 = i16 & 2;
        if (i19 != 0) {
            i17 |= 48;
        } else if ((i15 & 112) == 0) {
            i17 |= o0VarE.l(j8) ? 32 : 16;
        }
        int i24 = i16 & 4;
        if (i24 != 0) {
            i17 |= 384;
        } else if ((i15 & 896) == 0) {
            i17 |= o0VarE.k(i14) ? 256 : 128;
        }
        int i25 = i16 & 8;
        if (i25 != 0) {
            i17 |= 3072;
        } else if ((i15 & 7168) == 0) {
            i17 |= o0VarE.l(j14) ? 2048 : 1024;
        }
        if ((i17 & 5851) == 1170 && o0VarE.b()) {
            o0VarE.e();
            i18 = i14;
            j16 = j14;
        } else {
            if (i19 != 0) {
                j8 = f0.d(4292006617L);
            }
            int i26 = i24 != 0 ? 5 : i14;
            if (i25 != 0) {
                d0.f128823b.getClass();
                j15 = d0.f128828g;
            } else {
                j15 = j14;
            }
            x1 x1Var = n.f135158a;
            r rVarE = u1.n.e(rVar, j8, m1.f128891a);
            d0 d0VarA = d0.a(j15);
            Integer numValueOf = Integer.valueOf(i26);
            o0VarE.L(511388516);
            boolean zB = o0VarE.B(d0VarA) | o0VarE.B(numValueOf);
            Object objQ = o0VarE.q();
            if (zB) {
                objQ = new MapPreviewPlaceholderKt$MapPreviewPlaceHolder$1$1(j15, i26);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new MapPreviewPlaceholderKt$MapPreviewPlaceHolder$1$1(j15, i26);
                    o0VarE.K(objQ);
                }
            }
            o0VarE.g0(false);
            u1.n.b(rVarE, (l) objQ, o0VarE, 0);
            i18 = i26;
            j16 = j15;
        }
        long j17 = j8;
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new MapPreviewPlaceholderKt$MapPreviewPlaceHolder$2(rVar, j17, i18, j16, i15, i16);
    }
}
