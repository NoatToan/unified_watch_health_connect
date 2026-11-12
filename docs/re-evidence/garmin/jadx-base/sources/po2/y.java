package po2;

import com.garmin.feature.garminpay.providers.gpay.snowball.exception.NeedToUpgradeManuallyException;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class y implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.feature.garminpay.providers.gpay.snowball.ui.d f139488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NeedToUpgradeManuallyException f139489c;

    public /* synthetic */ y(com.garmin.feature.garminpay.providers.gpay.snowball.ui.d dVar, NeedToUpgradeManuallyException needToUpgradeManuallyException, int i14) {
        this.f139487a = i14;
        this.f139488b = dVar;
        this.f139489c = needToUpgradeManuallyException;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f139487a) {
            case 0:
                ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) this.f139488b.getView()).z5(this.f139489c.getUrl());
                break;
            default:
                ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) this.f139488b.getView()).z5(this.f139489c.getUrl());
                break;
        }
        return Unit.INSTANCE;
    }
}
