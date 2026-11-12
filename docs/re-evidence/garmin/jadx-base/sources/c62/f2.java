package c62;

import android.content.Intent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f2 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Long f24738b;

    public /* synthetic */ f2(int i14, Long l14) {
        this.f24737a = i14;
        this.f24738b = l14;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f24737a;
        Long l14 = this.f24738b;
        switch (i14) {
            case 0:
                return l14;
            case 1:
                Intent intent = (Intent) obj;
                int i15 = ig2.a.f93432c;
                intent.getClass();
                intent.putExtra("extra_device_unit_id", l14);
                return Unit.INSTANCE;
            default:
                k30.a aVar = (k30.a) obj;
                int i16 = k40.a.f102826f;
                aVar.getClass();
                Long l15 = aVar.f102522a;
                return Boolean.valueOf(l15 != null && l15.longValue() == l14.longValue());
        }
    }
}
