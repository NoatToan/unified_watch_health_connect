package defpackage;

import com.huawei.ads.adsrec.IDsRelationCallback;
import com.huawei.ads.adsrec.l;
import com.huawei.ads.adsrec.o0;
import com.huawei.openalliance.ad.constant.Constants;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class axz extends l {

    class e implements Comparator<axh> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f770b;
        final /* synthetic */ float d;

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(axh axhVar, axh axhVar2) {
            int iA;
            if (axhVar.w().booleanValue() && axhVar2.w().booleanValue()) {
                iA = o0.a((axhVar2.k() * ((double) this.f770b)) + (axhVar2.g() * ((double) this.d)), (axhVar.k() * ((double) this.f770b)) + (axhVar.g() * ((double) this.d)));
            } else {
                iA = o0.a(axhVar, axhVar2);
            }
            return o0.a(axhVar, axhVar2, iA);
        }

        e(float f, float f2) {
            this.f770b = f;
            this.d = f2;
        }
    }

    @Override // com.huawei.ads.adsrec.h0
    public void a() {
        IDsRelationCallback iDsRelationCallbackA = awz.a();
        if (iDsRelationCallbackA == null) {
            return;
        }
        float relationCoL = iDsRelationCallbackA.getRelationCoL(Constants.RELATION_COL_A_KEY);
        float relationCoL2 = iDsRelationCallbackA.getRelationCoL(Constants.RELATION_COL_B_KEY);
        if (Math.abs(relationCoL) + Math.abs(relationCoL2) < 1.0E-6f) {
            return;
        }
        Collections.sort(this.f4757a, new e(relationCoL, relationCoL2));
    }

    public axz(List<axh> list) {
        super(list);
    }
}
