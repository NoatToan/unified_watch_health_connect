package vn2;

import com.garmin.android.apps.connectmobile.R;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class e0 extends p005kotlin.jvm.internal.q implements e23.l<Long, Unit> {
    public e0(Object obj) {
        super(1, obj, b0.class, "showDeleteLongWaitingMessage", "showDeleteLongWaitingMessage(J)V", 0);
    }

    @Override // e23.l
    public final Unit invoke(Long l14) {
        long jLongValue = l14.longValue();
        b0 b0Var = (b0) this.receiver;
        Logger logger = b0.f178864c;
        b0Var.l0(R.string.wallet_deleting_card, jLongValue);
        return Unit.INSTANCE;
    }
}
