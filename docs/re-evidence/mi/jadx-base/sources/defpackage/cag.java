package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class cag extends mah {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mah[] f5124a;

    public cag(Map<DecodeHintType, ?> map) {
        Collection collection = map == null ? null : (Collection) map.get(DecodeHintType.POSSIBLE_FORMATS);
        boolean z = (map == null || map.get(DecodeHintType.ASSUME_CODE_39_CHECK_DIGIT) == null) ? false : true;
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(BarcodeFormat.EAN_13) || collection.contains(BarcodeFormat.UPC_A) || collection.contains(BarcodeFormat.EAN_8) || collection.contains(BarcodeFormat.UPC_E)) {
                arrayList.add(new eag(map));
            }
            if (collection.contains(BarcodeFormat.CODE_39)) {
                arrayList.add(new g34(z));
            }
            if (collection.contains(BarcodeFormat.CODE_93)) {
                arrayList.add(new i34());
            }
            if (collection.contains(BarcodeFormat.CODE_128)) {
                arrayList.add(new e34());
            }
            if (collection.contains(BarcodeFormat.ITF)) {
                arrayList.add(new qzc());
            }
            if (collection.contains(BarcodeFormat.CODABAR)) {
                arrayList.add(new c34());
            }
            if (collection.contains(BarcodeFormat.RSS_14)) {
                arrayList.add(new x9j());
            }
            if (collection.contains(BarcodeFormat.RSS_EXPANDED)) {
                arrayList.add(new y9j());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new eag(map));
            arrayList.add(new g34());
            arrayList.add(new c34());
            arrayList.add(new i34());
            arrayList.add(new e34());
            arrayList.add(new qzc());
            arrayList.add(new x9j());
            arrayList.add(new y9j());
        }
        this.f5124a = (mah[]) arrayList.toArray(new mah[arrayList.size()]);
    }

    @Override // defpackage.mah
    public wsk b(int i, zo2 zo2Var, Map<DecodeHintType, ?> map) throws NotFoundException {
        for (mah mahVar : this.f5124a) {
            try {
                return mahVar.b(i, zo2Var, map);
            } catch (ReaderException unused) {
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // defpackage.mah, defpackage.sgj
    public void reset() {
        for (mah mahVar : this.f5124a) {
            mahVar.reset();
        }
    }
}
