package defpackage;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.miui.tsmclient.common.net.request.SecureRequest;
import com.miui.tsmclient.entity.CardExtraInfo;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.net.TSMAuthContants;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class dfs extends SecureRequest<CardExtraInfo> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CardInfo f15497b;
    public String c;

    public dfs(CardInfo cardInfo, String str) {
        super("GET", TSMAuthContants.URL_TRANSIT_CARDS_EXTRA_INFO, TypeToken.get(CardExtraInfo.class));
        this.f15497b = cardInfo;
        this.c = str;
        addParams("deviceModel", ljs.b(cardInfo)).addParams("type", cardInfo.mCardType).addParams(TSMAuthContants.PARAM_CARDNO, cardInfo.mCardNo).addParams(TSMAuthContants.PARAM_REAL_CARDNO, cardInfo.mRealCardNo).addParams(TSMAuthContants.PARAM_LANGUAGE, Locale.getDefault().toString()).addParams(TSMAuthContants.PARAM_MIUI_ROM_TYPE, ljs.f(this.f15497b)).addParams(TSMAuthContants.PARAM_MIUI_SYSTEM_VERSION, ljs.n());
    }

    @Override // com.miui.tsmclient.common.net.request.SecureRequest, com.miui.tsmclient.common.net.request.BaseRequest
    public void addExtraParams() throws IOException {
        super.addExtraParams();
        if (TextUtils.isEmpty(this.f15497b.mAid) || TextUtils.isEmpty(this.c)) {
            throw new IOException("params can't be null");
        }
        addParams("aid", this.f15497b.mAid);
        addParams("cplc", this.c);
    }
}
