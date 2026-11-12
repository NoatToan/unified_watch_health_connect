package j02;

import android.view.View;
import androidx.core.view.s0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class k implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f96093b;

    public /* synthetic */ k(View view2, ig2.d dVar) {
        this.f96092a = 0;
        this.f96093b = view2;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f96092a;
        View view2 = this.f96093b;
        switch (i14) {
            case 0:
                s0.l(12, view2);
                break;
            case 1:
                double dDoubleValue = ((Double) obj).doubleValue();
                int i15 = va1.a.f176579b;
                view2.setEnabled(dDoubleValue > 0.0d);
                break;
            default:
                int iIntValue = ((Integer) obj).intValue();
                int i16 = va1.e.f176595b;
                view2.setEnabled(((double) iIntValue) > 0.0d);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ k(View view2, int i14) {
        this.f96092a = i14;
        this.f96093b = view2;
    }
}
