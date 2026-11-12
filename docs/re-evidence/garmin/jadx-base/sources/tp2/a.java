package tp2;

import androidx.lifecycle.i0;
import com.garmin.feature.garminpay.providers.gpay.ui.managecard.FitPayCardDetailsActivity;
import o53.f0;
import o53.s0;
import p005kotlin.Unit;
import u53.o;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FitPayCardDetailsActivity f165941b;

    public /* synthetic */ a(FitPayCardDetailsActivity fitPayCardDetailsActivity, int i14) {
        this.f165940a = i14;
        this.f165941b = fitPayCardDetailsActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f165940a;
        FitPayCardDetailsActivity fitPayCardDetailsActivity = this.f165941b;
        switch (i14) {
            case 0:
                FitPayCardDetailsActivity.a aVar = FitPayCardDetailsActivity.F;
                fitPayCardDetailsActivity.ia(true);
                break;
            default:
                FitPayCardDetailsActivity.a aVar2 = FitPayCardDetailsActivity.F;
                i0 i0VarW = f0.w(fitPayCardDetailsActivity);
                x53.c cVar = s0.f129406a;
                ge1.b.T(i0VarW, o.f168762a, null, new c(fitPayCardDetailsActivity, null), 2);
                break;
        }
        return Unit.INSTANCE;
    }
}
