package defpackage;

import com.huawei.ads.adsrec.l;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ayf extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<axh> f788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<axh> f789c;

    @Override // com.huawei.ads.adsrec.h0
    public void a() {
        int size = this.f789c.size();
        int size2 = this.f788b.size();
        this.f4757a.clear();
        int i = 0;
        int i2 = 0;
        while (i < size && i2 < size2) {
            axh axhVar = this.f789c.get(i);
            axh axhVar2 = this.f788b.get(i2);
            if (axhVar.w().booleanValue() && (!axhVar2.w().booleanValue() || axhVar.k() < axhVar2.k())) {
                this.f4757a.add(axhVar2);
                i2++;
            } else {
                this.f4757a.add(axhVar);
                i++;
            }
        }
        if (i < size) {
            this.f4757a.addAll(this.f789c.subList(i, size));
        } else {
            this.f4757a.addAll(this.f788b.subList(i2, size2));
        }
    }

    public ayf(List<axh> list, List<axh> list2, List<axh> list3) {
        super(list);
        this.f789c = list2;
        this.f788b = list3;
    }
}
