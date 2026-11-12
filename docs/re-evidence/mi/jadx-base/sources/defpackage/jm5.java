package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class jm5 implements epr {
    public static cp2 b(k73 k73Var, int i, int i2) {
        cp2 cp2Var;
        int iE = k73Var.e();
        int iD = k73Var.d();
        int iMax = Math.max(i, iE);
        int iMax2 = Math.max(i2, iD);
        int iMin = Math.min(iMax / iE, iMax2 / iD);
        int i3 = (iMax - (iE * iMin)) / 2;
        int i4 = (iMax2 - (iD * iMin)) / 2;
        if (i2 < iD || i < iE) {
            cp2Var = new cp2(iE, iD);
            i3 = 0;
            i4 = 0;
        } else {
            cp2Var = new cp2(i, i2);
        }
        cp2Var.b();
        int i5 = 0;
        while (i5 < iD) {
            int i6 = i3;
            int i7 = 0;
            while (i7 < iE) {
                if (k73Var.b(i7, i5) == 1) {
                    cp2Var.p(i6, i4, iMin, iMin);
                }
                i7++;
                i6 += iMin;
            }
            i5++;
            i4 += iMin;
        }
        return cp2Var;
    }

    public static cp2 c(mw5 mw5Var, hso hsoVar, int i, int i2) {
        int iH = hsoVar.h();
        int iG = hsoVar.g();
        k73 k73Var = new k73(hsoVar.j(), hsoVar.i());
        int i3 = 0;
        for (int i4 = 0; i4 < iG; i4++) {
            if (i4 % hsoVar.e == 0) {
                int i5 = 0;
                for (int i6 = 0; i6 < hsoVar.j(); i6++) {
                    k73Var.g(i5, i3, i6 % 2 == 0);
                    i5++;
                }
                i3++;
            }
            int i7 = 0;
            for (int i8 = 0; i8 < iH; i8++) {
                if (i8 % hsoVar.d == 0) {
                    k73Var.g(i7, i3, true);
                    i7++;
                }
                k73Var.g(i7, i3, mw5Var.e(i8, i4));
                int i9 = i7 + 1;
                int i10 = hsoVar.d;
                if (i8 % i10 == i10 - 1) {
                    k73Var.g(i9, i3, i4 % 2 == 0);
                    i7 += 2;
                } else {
                    i7 = i9;
                }
            }
            int i11 = i3 + 1;
            int i12 = hsoVar.e;
            if (i4 % i12 == i12 - 1) {
                int i13 = 0;
                for (int i14 = 0; i14 < hsoVar.j(); i14++) {
                    k73Var.g(i13, i11, true);
                    i13++;
                }
                i3 += 2;
            } else {
                i3 = i11;
            }
        }
        return b(k73Var, i, i2);
    }

    @Override // defpackage.epr
    public cp2 a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        dx6 dx6Var;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (barcodeFormat != BarcodeFormat.DATA_MATRIX) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(barcodeFormat)));
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Requested dimensions can't be negative: " + i + 'x' + i2);
        }
        SymbolShapeHint symbolShapeHint = SymbolShapeHint.FORCE_NONE;
        dx6 dx6Var2 = null;
        if (map != null) {
            SymbolShapeHint symbolShapeHint2 = (SymbolShapeHint) map.get(EncodeHintType.DATA_MATRIX_SHAPE);
            if (symbolShapeHint2 != null) {
                symbolShapeHint = symbolShapeHint2;
            }
            dx6 dx6Var3 = (dx6) map.get(EncodeHintType.MIN_SIZE);
            if (dx6Var3 == null) {
                dx6Var3 = null;
            }
            dx6Var = (dx6) map.get(EncodeHintType.MAX_SIZE);
            if (dx6Var == null) {
                dx6Var = null;
            }
            dx6Var2 = dx6Var3;
        } else {
            dx6Var = null;
        }
        String strB = p7c.b(str, symbolShapeHint, dx6Var2, dx6Var);
        hso hsoVarL = hso.l(strB.length(), symbolShapeHint, dx6Var2, dx6Var, true);
        mw5 mw5Var = new mw5(fd8.c(strB, hsoVarL), hsoVarL.h(), hsoVarL.g());
        mw5Var.h();
        return c(mw5Var, hsoVarL, i, i2);
    }
}
