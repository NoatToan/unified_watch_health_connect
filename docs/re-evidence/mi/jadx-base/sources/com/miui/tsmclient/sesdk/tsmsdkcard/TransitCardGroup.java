package com.miui.tsmclient.sesdk.tsmsdkcard;

import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.CardInfoFactory;
import com.miui.tsmclient.entity.CardUIInfo;
import com.miui.tsmclient.net.AuthApiException;
import com.miui.tsmclient.sesdk.CardCategory;
import com.miui.tsmclient.sesdk.SeCard;
import com.miui.tsmclient.sesdk.TransitCardGroupDetail;
import com.miui.tsmclient.util.EnvironmentConfig;
import com.miui.tsmclient.util.LogUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
class TransitCardGroup extends SeCard {
    private List<SeCard> mCardList;

    public TransitCardGroup(CardInfo cardInfo) {
        super(cardInfo);
    }

    private List<SeCard> build(List<? extends CardInfo> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<? extends CardInfo> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new TransitCard(it.next()));
            }
        }
        return arrayList;
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public void cloneExtraCardInfo() {
        CardUIInfo cardUIInfo = this.mCardInfo.mCardUIInfo;
        if (cardUIInfo != null) {
            this.mCardFace = cardUIInfo.getBackground();
            this.mIsIssued = this.mCardInfo.mHasIssue;
        }
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public SeCard.IOnlineProperties createOnlineProperties() {
        return new TransitCardGroupDetail(this);
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public List<SeCard> getCardList() throws AuthApiException {
        List<SeCard> list = this.mCardList;
        if (list != null) {
            return list;
        }
        try {
            this.mCardList = new ArrayList();
            JSONArray jSONArrayQueryChildCardProduct = this.mTSMAuthManager.queryChildCardProduct(EnvironmentConfig.getContext(), this.mCardInfo.mCardType);
            ArrayList arrayList = new ArrayList();
            if (jSONArrayQueryChildCardProduct != null) {
                for (int i = 0; i < jSONArrayQueryChildCardProduct.length(); i++) {
                    JSONObject jSONObject = jSONArrayQueryChildCardProduct.getJSONObject(i);
                    CardInfo cardInfoMakeCardInfo = CardInfoFactory.makeCardInfo(jSONObject.optString("cardName"), null);
                    cardInfoMakeCardInfo.parse(jSONObject);
                    if (!cardInfoMakeCardInfo.isHide()) {
                        arrayList.add(cardInfoMakeCardInfo);
                    }
                }
            }
            this.mCardList.addAll(build(arrayList));
            return this.mCardList;
        } catch (JSONException e) {
            LogUtils.e("failed to get cards on network!", e);
            throw new AuthApiException(16);
        }
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public CardCategory getCategory() {
        return CardCategory.TRANSIT;
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public String getDetail() {
        return new TransitCardGroupDetail(this).toJson();
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public boolean isGroup() {
        return true;
    }
}
