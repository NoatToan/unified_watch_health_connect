package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.model.mitsm.f;
import com.miui.tsmclient.net.TSMAuthManager;

/* JADX INFO: loaded from: classes2.dex */
public class t3s extends f {
    public TSMAuthManager d = new TSMAuthManager();

    public BaseResponse a(Context context, CardInfo cardInfo) {
        return this.d.queryHardwareWallet(context, cardInfo);
    }

    @Override // com.miui.tsmclient.model.mitsm.f
    public BaseResponse delete(Context context, CardInfo cardInfo, Bundle bundle) {
        return this.d.removeHardwareWallet(context, cardInfo, bundle);
    }

    @Override // com.miui.tsmclient.model.mitsm.f
    public BaseResponse issue(Context context, CardInfo cardInfo, Bundle bundle) {
        cardInfo.getTerminal().deactivateCard(cardInfo.getAid());
        return this.d.addHardwareWallet(context, cardInfo, bundle);
    }
}
