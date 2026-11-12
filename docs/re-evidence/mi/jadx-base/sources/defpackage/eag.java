package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class eag extends mah {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z7q[] f16447a;

    public eag(Map<DecodeHintType, ?> map) {
        Collection collection = map == null ? null : (Collection) map.get(DecodeHintType.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(BarcodeFormat.EAN_13)) {
                arrayList.add(new n77());
            } else if (collection.contains(BarcodeFormat.UPC_A)) {
                arrayList.add(new u7q());
            }
            if (collection.contains(BarcodeFormat.EAN_8)) {
                arrayList.add(new p77());
            }
            if (collection.contains(BarcodeFormat.UPC_E)) {
                arrayList.add(new b8q());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new n77());
            arrayList.add(new p77());
            arrayList.add(new b8q());
        }
        this.f16447a = (z7q[]) arrayList.toArray(new z7q[arrayList.size()]);
    }

    @Override // defpackage.mah
    public wsk b(int i, zo2 zo2Var, Map<DecodeHintType, ?> map) throws NotFoundException {
        int[] iArrO = z7q.o(zo2Var);
        for (z7q z7qVar : this.f16447a) {
            try {
                wsk wskVarL = z7qVar.l(i, zo2Var, iArrO, map);
                boolean z = wskVarL.b() == BarcodeFormat.EAN_13 && wskVarL.f().charAt(0) == '0';
                Collection collection = map == null ? null : (Collection) map.get(DecodeHintType.POSSIBLE_FORMATS);
                boolean z2 = collection == null || collection.contains(BarcodeFormat.UPC_A);
                if (!z || !z2) {
                    return wskVarL;
                }
                wsk wskVar = new wsk(wskVarL.f().substring(1), wskVarL.c(), wskVarL.e(), BarcodeFormat.UPC_A);
                wskVar.g(wskVarL.d());
                return wskVar;
            } catch (ReaderException unused) {
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // defpackage.mah, defpackage.sgj
    public void reset() {
        for (z7q z7qVar : this.f16447a) {
            z7qVar.reset();
        }
    }
}
