package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class dag implements sgj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<DecodeHintType, ?> f15305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public sgj[] f15306b;

    @Override // defpackage.sgj
    public wsk a(cj2 cj2Var, Map<DecodeHintType, ?> map) throws NotFoundException {
        d(map);
        return b(cj2Var);
    }

    public final wsk b(cj2 cj2Var) throws NotFoundException {
        sgj[] sgjVarArr = this.f15306b;
        if (sgjVarArr != null) {
            for (sgj sgjVar : sgjVarArr) {
                try {
                    return sgjVar.a(cj2Var, this.f15305a);
                } catch (ReaderException unused) {
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public wsk c(cj2 cj2Var) throws NotFoundException {
        if (this.f15306b == null) {
            d(null);
        }
        return b(cj2Var);
    }

    public void d(Map<DecodeHintType, ?> map) {
        this.f15305a = map;
        boolean z = map != null && map.containsKey(DecodeHintType.TRY_HARDER);
        Collection collection = map == null ? null : (Collection) map.get(DecodeHintType.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            boolean z2 = collection.contains(BarcodeFormat.UPC_A) || collection.contains(BarcodeFormat.UPC_E) || collection.contains(BarcodeFormat.EAN_13) || collection.contains(BarcodeFormat.EAN_8) || collection.contains(BarcodeFormat.CODABAR) || collection.contains(BarcodeFormat.CODE_39) || collection.contains(BarcodeFormat.CODE_93) || collection.contains(BarcodeFormat.CODE_128) || collection.contains(BarcodeFormat.ITF) || collection.contains(BarcodeFormat.RSS_14) || collection.contains(BarcodeFormat.RSS_EXPANDED);
            if (z2 && !z) {
                arrayList.add(new cag(map));
            }
            if (collection.contains(BarcodeFormat.QR_CODE)) {
                arrayList.add(new lfi());
            }
            if (collection.contains(BarcodeFormat.DATA_MATRIX)) {
                arrayList.add(new hm5());
            }
            if (collection.contains(BarcodeFormat.AZTEC)) {
                arrayList.add(new jt1());
            }
            if (collection.contains(BarcodeFormat.PDF_417)) {
                arrayList.add(new zfh());
            }
            if (collection.contains(BarcodeFormat.MAXICODE)) {
                arrayList.add(new p9f());
            }
            if (z2 && z) {
                arrayList.add(new cag(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z) {
                arrayList.add(new cag(map));
            }
            arrayList.add(new lfi());
            arrayList.add(new hm5());
            arrayList.add(new jt1());
            arrayList.add(new zfh());
            arrayList.add(new p9f());
            if (z) {
                arrayList.add(new cag(map));
            }
        }
        this.f15306b = (sgj[]) arrayList.toArray(new sgj[arrayList.size()]);
    }

    @Override // defpackage.sgj
    public void reset() {
        sgj[] sgjVarArr = this.f15306b;
        if (sgjVarArr != null) {
            for (sgj sgjVar : sgjVarArr) {
                sgjVar.reset();
            }
        }
    }
}
