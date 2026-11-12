package qm;

import com.github.mikephil.chartingv2.data.Entry;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class g extends g22.c<Void, Float> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f145362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f145363d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, o53.z zVar, List list) {
        super(zVar);
        this.f145363d = hVar;
        this.f145362c = list;
    }

    @Override // g22.c
    public final Float b(Void[] voidArr) {
        List list = this.f145362c;
        int size = list.size();
        int i14 = 0;
        float val = 0.0f;
        for (int i15 = 0; i15 < size; i15++) {
            Entry entry = (Entry) list.get(i15);
            if (entry != null && entry.getVal() > 0.0f) {
                val += entry.getVal();
                i14++;
            }
        }
        return Float.valueOf(i14 > 0 ? val / i14 : 0.0f);
    }

    @Override // g22.c
    public final void d(Float f14) {
        this.f145363d.f145382c.a(f14.floatValue());
    }
}
