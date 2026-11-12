package defpackage;

import com.huawei.ads.adsrec.l;
import com.huawei.ads.adsrec.o0;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ayi extends l {

    class a implements Comparator<axh> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(axh axhVar, axh axhVar2) {
            return o0.a(axhVar, axhVar2, (axhVar.w().booleanValue() && axhVar2.w().booleanValue()) ? o0.a(axhVar2.k(), axhVar.k()) : o0.a(axhVar, axhVar2));
        }

        a() {
        }
    }

    @Override // com.huawei.ads.adsrec.h0
    public void a() {
        Collections.sort(this.f4757a, new a());
    }

    public ayi(List<axh> list) {
        super(list);
    }
}
