package k32;

import android.view.View;
import nf0.z;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class m implements View.OnScrollChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f102711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f102712b;

    public /* synthetic */ m(Object obj, int i14) {
        this.f102711a = i14;
        this.f102712b = obj;
    }

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(View view2, int i14, int i15, int i16, int i17) {
        int i18 = this.f102711a;
        Object obj = this.f102712b;
        switch (i18) {
            case 0:
                v22.e.s(((o) obj).f102715a, i15 > 0);
                break;
            default:
                z zVar = (z) obj;
                int i19 = z.f125870h;
                if (!zVar.y6().canScrollVertically(1)) {
                    zVar.w6().setEnabled(true);
                    zVar.y6().setOnScrollChangeListener(null);
                }
                break;
        }
    }
}
