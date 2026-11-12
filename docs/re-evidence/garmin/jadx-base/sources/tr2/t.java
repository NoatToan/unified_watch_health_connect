package tr2;

import android.content.Intent;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.ui.selectcarddestination.CardDestinationSelectionActivity;
import com.garmin.feature.garminpay.ui.userwallet.UserWalletActivity;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p005kotlin.Unit;
import p13.k0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class t implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f166172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UserWalletActivity f166173b;

    public /* synthetic */ t(UserWalletActivity userWalletActivity, int i14) {
        this.f166172a = i14;
        this.f166173b = userWalletActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f166172a;
        UserWalletActivity userWalletActivity = this.f166173b;
        switch (i14) {
            case 0:
                f.c<Intent> cVar = userWalletActivity.f52227o;
                CardDestinationSelectionActivity.a aVar = CardDestinationSelectionActivity.f52143n;
                fr2.d dVar = userWalletActivity.f52222j;
                if (dVar == null) {
                    p005kotlin.jvm.internal.s.m("watchesVm");
                    throw null;
                }
                Map<Long, ns2.a<ms2.e>> mapD = dVar.E().d();
                if (mapD == null) {
                    mapD = k0.f134949a;
                    mapD.getClass();
                }
                cVar.a(CardDestinationSelectionActivity.a.b(aVar, userWalletActivity, mapD), null);
                return Unit.INSTANCE;
            case 1:
                UserWalletActivity.a aVar2 = UserWalletActivity.f52217q;
                return userWalletActivity;
            default:
                UserWalletActivity userWalletActivity2 = this.f166173b;
                fr2.d dVar2 = userWalletActivity2.f52222j;
                if (dVar2 == null) {
                    p005kotlin.jvm.internal.s.m("watchesVm");
                    throw null;
                }
                List list = (List) dVar2.s1().d();
                byte b14 = 0;
                if (list == null || !list.isEmpty()) {
                    fr2.d dVar3 = userWalletActivity2.f52222j;
                    if (dVar3 == null) {
                        p005kotlin.jvm.internal.s.m("watchesVm");
                        throw null;
                    }
                    Map<Long, ns2.a<ms2.e>> mapD2 = dVar3.E().d();
                    if (mapD2 == null || mapD2.isEmpty()) {
                        br2.c.f19585a.m(userWalletActivity2);
                    } else {
                        Iterator<Map.Entry<Long, ns2.a<ms2.e>>> it = mapD2.entrySet().iterator();
                        while (it.hasNext()) {
                            if (!g8.i.c0(it.next().getValue()).f127815a.isEmpty()) {
                                xr2.a.f192031a.getClass();
                                if (xr2.a.a()) {
                                    f.c<Intent> cVar2 = userWalletActivity2.f52227o;
                                    CardDestinationSelectionActivity.a aVar3 = CardDestinationSelectionActivity.f52143n;
                                    fr2.d dVar4 = userWalletActivity2.f52222j;
                                    if (dVar4 == null) {
                                        p005kotlin.jvm.internal.s.m("watchesVm");
                                        throw null;
                                    }
                                    Map<Long, ns2.a<ms2.e>> mapD3 = dVar4.E().d();
                                    if (mapD3 == null) {
                                        mapD3 = k0.f134949a;
                                        mapD3.getClass();
                                    }
                                    cVar2.a(CardDestinationSelectionActivity.a.b(aVar3, userWalletActivity2, mapD3), null);
                                } else {
                                    br2.c.f19585a.a(new t(userWalletActivity2, b14), userWalletActivity2);
                                }
                            }
                        }
                        br2.c.f19585a.m(userWalletActivity2);
                    }
                } else {
                    br2.c cVar3 = br2.c.f19585a;
                    cVar3.getClass();
                    String string = userWalletActivity2.getString(R.string.wallet_no_supporting_watches_found);
                    string.getClass();
                    String string2 = userWalletActivity2.getString(R.string.wallet_message_no_supporting_watches_found);
                    string2.getClass();
                    String string3 = userWalletActivity2.getString(R.string.lbl_ok);
                    string3.getClass();
                    androidx.appcompat.app.e eVarQ = br2.c.q(cVar3, userWalletActivity2, string, string2, new o13.p(string3, new bb1.a(b14, 10)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
                    if (eVarQ != null) {
                        eVarQ.show();
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
