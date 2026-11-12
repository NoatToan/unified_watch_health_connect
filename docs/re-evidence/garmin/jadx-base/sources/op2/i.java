package op2;

import android.content.Intent;
import android.net.Uri;
import com.garmin.feature.garminpay.providers.gpay.ui.common.NewFitPayWebNavigationActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class i implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NewFitPayWebNavigationActivity f133217b;

    public /* synthetic */ i(NewFitPayWebNavigationActivity newFitPayWebNavigationActivity, int i14) {
        this.f133216a = i14;
        this.f133217b = newFitPayWebNavigationActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f133216a;
        NewFitPayWebNavigationActivity newFitPayWebNavigationActivity = this.f133217b;
        switch (i14) {
            case 0:
                NewFitPayWebNavigationActivity.a aVar = NewFitPayWebNavigationActivity.f51549w;
                newFitPayWebNavigationActivity.finish();
                break;
            case 1:
                NewFitPayWebNavigationActivity.a aVar2 = NewFitPayWebNavigationActivity.f51549w;
                aq2.j jVar = aq2.j.f12491a;
                kj0.b.f104940a.getClass();
                zi2.a aVarA = kj0.b.a();
                jVar.getClass();
                newFitPayWebNavigationActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(aq2.j.c(aVarA))));
                newFitPayWebNavigationActivity.finish();
                break;
            case 2:
                NewFitPayWebNavigationActivity.a aVar3 = NewFitPayWebNavigationActivity.f51549w;
                newFitPayWebNavigationActivity.finish();
                break;
            case 3:
                com.garmin.feature.garminpay.providers.gpay.ui.common.a aVar4 = newFitPayWebNavigationActivity.f51553i;
                if (aVar4 != null) {
                    aVar4.x4();
                }
                break;
            case 4:
                NewFitPayWebNavigationActivity.a aVar5 = NewFitPayWebNavigationActivity.f51549w;
                newFitPayWebNavigationActivity.finish();
                break;
            case 5:
                NewFitPayWebNavigationActivity.a aVar6 = NewFitPayWebNavigationActivity.f51549w;
                newFitPayWebNavigationActivity.finish();
                break;
            default:
                NewFitPayWebNavigationActivity.a aVar7 = NewFitPayWebNavigationActivity.f51549w;
                newFitPayWebNavigationActivity.finish();
                break;
        }
        return Unit.INSTANCE;
    }
}
