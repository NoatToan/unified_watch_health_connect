package com.miui.tsmclient.net.request;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.miui.tsmclient.common.net.ResponseListener;
import com.miui.tsmclient.common.net.request.SecureRequest;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.PersonalCardFace;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.util.LogUtils;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class PersonalCardFaceRequest extends SecureRequest<PersonalCardFaceResponseInfo> {
    private CardInfo mCardInfo;

    public static final class PersonalCardFaceResponseInfo extends CommonResponseInfo {

        @SerializedName("data")
        private PersonalCardFace mPresonalCardFace;

        public PersonalCardFace getPresonalCardFace() {
            return this.mPresonalCardFace;
        }
    }

    public PersonalCardFaceRequest(CardInfo cardInfo) {
        super("POST", TSMAuthContants.URL_QUERY_PERSONAL_CARD_FACE, PersonalCardFaceResponseInfo.class, (ResponseListener) null);
        this.mCardInfo = cardInfo;
        addParams("cardName", cardInfo.mCardType);
        if (TextUtils.isEmpty(this.mCardInfo.mAreaCode)) {
            return;
        }
        LogUtils.v("mAreaCode " + this.mCardInfo.mAreaCode);
        addParams("areaCode", this.mCardInfo.mAreaCode);
    }

    @Override // com.miui.tsmclient.common.net.request.SecureRequest, com.miui.tsmclient.common.net.request.BaseRequest
    public void addExtraParams() throws IOException {
        try {
            addParams("cplc", this.mCardInfo.getTerminal().getCPLC());
        } catch (IOException | InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException("QueryCouponsRequest getExtraParams failed", e);
        }
    }
}
