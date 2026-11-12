package defpackage;

import com.miui.tsmclient.account.TSMAccountManager;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.model.c;
import com.miui.tsmclient.net.TSMAuthContants;

/* JADX INFO: loaded from: classes2.dex */
public class u3s extends c {
    public TSMAccountManager d;
    public CardInfo e = new CardInfo(CardInfo.CARD_TYPE_DUMMY);

    public u3s() {
        this.mBussinessType = TSMAuthContants.BusinessType.sptc.toString();
        this.d = new TSMAccountManager();
    }
}
