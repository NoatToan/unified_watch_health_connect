package ho2;

import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.x1;
import com.garmin.feature.garminpay.providers.gpay.pushprovisioning.PushProvMainActivity;
import com.garmin.feature.garminpay.ui.selectcarddestination.CardDestinationSelectionActivity;
import java.util.Map;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PushProvMainActivity f84832b;

    public /* synthetic */ a(PushProvMainActivity pushProvMainActivity, int i14) {
        this.f84831a = i14;
        this.f84832b = pushProvMainActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f84831a;
        PushProvMainActivity pushProvMainActivity = this.f84832b;
        switch (i14) {
            case 0:
                PushProvMainActivity.a aVar = PushProvMainActivity.f51161t;
                return (com.garmin.feature.garminpay.providers.gpay.ui.common.a) new x1(pushProvMainActivity).b(s0.f105811a.b(com.garmin.feature.garminpay.providers.gpay.ui.common.a.class));
            case 1:
                PushProvMainActivity.a aVar2 = PushProvMainActivity.f51161t;
                hn2.c.U9(pushProvMainActivity, pushProvMainActivity, null, 12);
                pushProvMainActivity.finish();
                return Unit.INSTANCE;
            case 2:
                PushProvMainActivity.a aVar3 = PushProvMainActivity.f51161t;
                return pushProvMainActivity;
            case 3:
                PushProvMainActivity.a aVar4 = PushProvMainActivity.f51161t;
                pushProvMainActivity.ga();
                return Unit.INSTANCE;
            case 4:
                PushProvMainActivity.f51162v.debug("startDeviceSelection");
                xr2.a.f192031a.getClass();
                if (xr2.a.a()) {
                    f.c<Intent> cVar = pushProvMainActivity.f51170n;
                    CardDestinationSelectionActivity.a aVar5 = CardDestinationSelectionActivity.f52143n;
                    m mVar = pushProvMainActivity.f51165i;
                    if (mVar == null) {
                        s.m("pushProvViewModel");
                        throw null;
                    }
                    Map<Long, ? extends ns2.a<? extends ms2.e>> map = mVar.f84871b;
                    if (map == null) {
                        s.m("operatorsByDevice");
                        throw null;
                    }
                    cVar.a(CardDestinationSelectionActivity.a.b(aVar5, pushProvMainActivity, map), null);
                } else {
                    br2.c.f19585a.a(new a(pushProvMainActivity, 7), pushProvMainActivity);
                }
                return Unit.INSTANCE;
            case 5:
                PushProvMainActivity.a aVar6 = PushProvMainActivity.f51161t;
                aq2.j jVar = aq2.j.f12491a;
                kj0.b.f104940a.getClass();
                zi2.a aVarA = kj0.b.a();
                jVar.getClass();
                pushProvMainActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(aq2.j.c(aVarA))));
                pushProvMainActivity.fa();
                return Unit.INSTANCE;
            case 6:
                PushProvMainActivity.a aVar7 = PushProvMainActivity.f51161t;
                pushProvMainActivity.fa();
                return Unit.INSTANCE;
            case 7:
                f.c<Intent> cVar2 = pushProvMainActivity.f51170n;
                CardDestinationSelectionActivity.a aVar8 = CardDestinationSelectionActivity.f52143n;
                m mVar2 = pushProvMainActivity.f51165i;
                if (mVar2 == null) {
                    s.m("pushProvViewModel");
                    throw null;
                }
                Map<Long, ? extends ns2.a<? extends ms2.e>> map2 = mVar2.f84871b;
                if (map2 != null) {
                    cVar2.a(CardDestinationSelectionActivity.a.b(aVar8, pushProvMainActivity, map2), null);
                    return Unit.INSTANCE;
                }
                s.m("operatorsByDevice");
                throw null;
            case 8:
                PushProvMainActivity.a aVar9 = PushProvMainActivity.f51161t;
                pushProvMainActivity.ga();
                return Unit.INSTANCE;
            default:
                PushProvMainActivity.a aVar10 = PushProvMainActivity.f51161t;
                pushProvMainActivity.fa();
                return Unit.INSTANCE;
        }
    }
}
