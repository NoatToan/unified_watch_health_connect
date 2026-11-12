package oq2;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vr2.q;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Loq2/g;", "Lyq2/b;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements yq2.b {
    @Override // yq2.b
    public final q a(fs2.a aVar) {
        String str = aVar.f73429d;
        b.f133301a.getClass();
        kj0.b.f104940a.getClass();
        return new q(str, yr2.g.b(kj0.b.a()).concat("/com.garmin.connect.mobile/garmin-pay/image/image_rabbit.png"), null, null, aVar);
    }

    @Override // yq2.b
    public final Object b(fs2.a aVar, i iVar) {
        return Unit.INSTANCE;
    }

    @Override // yq2.b
    public final yq2.b.a d(fs2.a aVar) {
        return new yq2.b.a(R.string.wallet_card_disabled_title, R.string.wallet_card_disabled_message);
    }
}
