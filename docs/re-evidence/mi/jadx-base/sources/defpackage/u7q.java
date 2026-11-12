package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class u7q extends z7q {
    public final z7q i = new n77();

    public static wsk r(wsk wskVar) throws FormatException {
        String strF = wskVar.f();
        if (strF.charAt(0) != '0') {
            throw FormatException.getFormatInstance();
        }
        wsk wskVar2 = new wsk(strF.substring(1), null, wskVar.e(), BarcodeFormat.UPC_A);
        if (wskVar.d() != null) {
            wskVar2.g(wskVar.d());
        }
        return wskVar2;
    }

    @Override // defpackage.mah, defpackage.sgj
    public wsk a(cj2 cj2Var, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        return r(this.i.a(cj2Var, map));
    }

    @Override // defpackage.z7q, defpackage.mah
    public wsk b(int i, zo2 zo2Var, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        return r(this.i.b(i, zo2Var, map));
    }

    @Override // defpackage.z7q
    public int k(zo2 zo2Var, int[] iArr, StringBuilder sb) throws NotFoundException {
        return this.i.k(zo2Var, iArr, sb);
    }

    @Override // defpackage.z7q
    public wsk l(int i, zo2 zo2Var, int[] iArr, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        return r(this.i.l(i, zo2Var, iArr, map));
    }

    @Override // defpackage.z7q
    public BarcodeFormat p() {
        return BarcodeFormat.UPC_A;
    }
}
