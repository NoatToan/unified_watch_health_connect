package rr2;

import br2.f;
import com.garmin.feature.garminpay.ui.selectcarddestination.CardDestinationSelectionActivity;
import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CardDestinationSelectionActivity f154277b;

    public /* synthetic */ a(CardDestinationSelectionActivity cardDestinationSelectionActivity, int i14) {
        this.f154276a = i14;
        this.f154277b = cardDestinationSelectionActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f154276a;
        CardDestinationSelectionActivity cardDestinationSelectionActivity = this.f154277b;
        switch (i14) {
            case 0:
                CardDestinationSelectionActivity.a aVar = CardDestinationSelectionActivity.f52143n;
                cardDestinationSelectionActivity.setResult(0);
                cardDestinationSelectionActivity.finish();
                break;
            case 1:
                CardDestinationSelectionActivity.a aVar2 = CardDestinationSelectionActivity.f52143n;
                cardDestinationSelectionActivity.setResult(0);
                cardDestinationSelectionActivity.finish();
                break;
            default:
                CardDestinationSelectionActivity.a aVar3 = CardDestinationSelectionActivity.f52143n;
                List<f> listD = cardDestinationSelectionActivity.ca().s1().d();
                if (listD == null || listD.isEmpty()) {
                    com.garmin.feature.garminpay.ui.common.a.f51889a.getClass();
                    cardDestinationSelectionActivity.fa(new com.garmin.feature.garminpay.ui.common.a());
                    hn2.c.ba(cardDestinationSelectionActivity, Boolean.FALSE, null, null, 14);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
