package com.miui.tsmclient.sesdk.tsmsdkcard;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.miui.tsmclient.common.net.ErrorInfo;
import com.miui.tsmclient.common.net.HttpClient;
import com.miui.tsmclient.entity.CarKeyCardInfo;
import com.miui.tsmclient.entity.CardGroupType;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.CardInfoFactory;
import com.miui.tsmclient.entity.CardUIInfo;
import com.miui.tsmclient.entity.CloudTransitCardInfo;
import com.miui.tsmclient.entity.DoorCardProduct;
import com.miui.tsmclient.entity.DoorCardProducts;
import com.miui.tsmclient.entity.ICCOACarKeyCardInfo;
import com.miui.tsmclient.entity.MifareCardInfo;
import com.miui.tsmclient.entity.ProprietaryCarKeyCardInfo;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.model.g;
import com.miui.tsmclient.model.j;
import com.miui.tsmclient.model.mitsm.h;
import com.miui.tsmclient.net.AuthApiException;
import com.miui.tsmclient.net.TSMAuthManager;
import com.miui.tsmclient.seitsm.TsmRpcModels;
import com.miui.tsmclient.sesdk.CardCategory;
import com.miui.tsmclient.sesdk.ICardList;
import com.miui.tsmclient.sesdk.SeCard;
import com.miui.tsmclient.util.Constants;
import com.miui.tsmclient.util.EnvironmentConfig;
import com.miui.tsmclient.util.LogUtils;
import com.miui.tsmclient.util.TSMLocationService;
import defpackage.b1t;
import defpackage.b4s;
import defpackage.fgt;
import defpackage.fss;
import defpackage.jjs;
import defpackage.oas;
import defpackage.w3s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r.a;

/* JADX INFO: loaded from: classes6.dex */
public class TSMSDKService implements ICardList {
    private List<SeCard> build(List<? extends CardInfo> list, boolean z, CardCategory cardCategory) {
        SeCard iCCOADigitalKeyCard;
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (CardInfo cardInfo : list) {
            if (cardCategory == CardCategory.TRANSIT) {
                iCCOADigitalKeyCard = cardInfo.isHasChildren() ? new TransitCardGroup(cardInfo) : new TransitCard(cardInfo);
            } else if (cardCategory == CardCategory.CLOUD_TRANSIT) {
                iCCOADigitalKeyCard = new CloudTransitCard(cardInfo);
            } else if (cardCategory == CardCategory.CLOUD_DOOR) {
                iCCOADigitalKeyCard = new CloudKeyCard(cardInfo);
            } else if (cardCategory == CardCategory.DIGITAL_KEY) {
                iCCOADigitalKeyCard = new DigitalKeyCard(cardInfo, z);
            } else if (cardCategory == CardCategory.PROPRIETARY_CAR_KEY) {
                iCCOADigitalKeyCard = new ProprietaryCarKeyCard(cardInfo, z);
            } else {
                iCCOADigitalKeyCard = cardCategory == CardCategory.ICCOA_DIGITAL_KEY ? new ICCOADigitalKeyCard(cardInfo, z) : new KeyCard(cardInfo, z);
            }
            arrayList.add(iCCOADigitalKeyCard);
        }
        return arrayList;
    }

    private List<SeCard> getCarKeyCardList() throws AuthApiException {
        ArrayList arrayList = new ArrayList();
        Context context = EnvironmentConfig.getContext();
        b1t b1tVar = new b1t(context, "ALL");
        try {
            b1t.b bVar = (b1t.b) HttpClient.getInstance(context).execute(b1tVar).getResult();
            if (!b1tVar.isSuccess()) {
                throw new AuthApiException(bVar.getErrorCode(), bVar.getErrorDesc());
            }
            arrayList.addAll(build(bVar.a().b(), true, CardCategory.DIGITAL_KEY));
            arrayList.addAll(build(bVar.a().d(), true, CardCategory.ICCOA_DIGITAL_KEY));
            arrayList.addAll(build(bVar.a().f(), true, CardCategory.PROPRIETARY_CAR_KEY));
            return arrayList;
        } catch (IOException unused) {
            throw new AuthApiException(12);
        }
    }

    private List<SeCard> getCloudDoorCardList() throws AuthApiException {
        ArrayList arrayList = new ArrayList();
        try {
            fss fssVar = new fss(null);
            fss.a aVar = (fss.a) HttpClient.getInstance(EnvironmentConfig.getContext()).execute(fssVar).getResult();
            if (!fssVar.isSuccess()) {
                ErrorInfo errorInfo = fssVar.getResponse().getErrorInfo();
                throw new AuthApiException(errorInfo.mErrorCode, errorInfo.mErrorDesc);
            }
            ArrayList arrayList2 = new ArrayList();
            for (DoorCardProduct doorCardProduct : aVar.a()) {
                MifareCardInfo mifareCardInfo = new MifareCardInfo();
                mifareCardInfo.mCardArt = doorCardProduct.getCardArt();
                mifareCardInfo.mCardName = doorCardProduct.getName();
                mifareCardInfo.setProductId(doorCardProduct.getProductId());
                mifareCardInfo.mMifareCardType = doorCardProduct.getCardType();
                mifareCardInfo.setCloudCid(doorCardProduct.getCid());
                mifareCardInfo.mHasIssue = !doorCardProduct.isDownloadable();
                mifareCardInfo.setBusinessId(doorCardProduct.getBusinessId());
                arrayList2.add(mifareCardInfo);
            }
            arrayList.addAll(build(arrayList2, false, CardCategory.CLOUD_DOOR));
            return arrayList;
        } catch (IOException e) {
            LogUtils.e("getCloudDoorCardList failed", e);
            throw new AuthApiException(2);
        }
    }

    private List<SeCard> getCloudTransitCardList() throws AuthApiException {
        TSMAuthManager tSMAuthManager = new TSMAuthManager();
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArrayQueryCloudTransitCard = tSMAuthManager.queryCloudTransitCard(EnvironmentConfig.getContext(), CardGroupType.TRANSCARD, null, TSMLocationService.getInstance(EnvironmentConfig.getContext()).getLastLocation());
            ArrayList arrayList2 = new ArrayList();
            if (jSONArrayQueryCloudTransitCard != null) {
                for (int i = 0; i < jSONArrayQueryCloudTransitCard.length(); i++) {
                    JSONObject jSONObject = jSONArrayQueryCloudTransitCard.getJSONObject(i);
                    arrayList2.add(new CloudTransitCardInfo(jSONObject.optString("cardName"), jSONObject));
                }
            }
            arrayList.addAll(build(arrayList2, false, CardCategory.CLOUD_TRANSIT));
            return arrayList;
        } catch (JSONException e) {
            LogUtils.e("failed to get cloud cards on network!", e);
            throw new AuthApiException(16);
        }
    }

    private List<SeCard> getDoorCardList() throws AuthApiException {
        ArrayList arrayList = new ArrayList();
        fgt fgtVar = new fgt(null);
        try {
            DoorCardProducts doorCardProducts = (DoorCardProducts) HttpClient.getInstance(EnvironmentConfig.getContext()).execute(fgtVar).getResult();
            if (!fgtVar.isSuccess()) {
                throw new AuthApiException(doorCardProducts == null ? 2 : doorCardProducts.getErrorCode(), doorCardProducts != null ? doorCardProducts.getErrorDesc() : null);
            }
            ArrayList arrayList2 = new ArrayList();
            for (DoorCardProduct doorCardProduct : doorCardProducts.getDoorCardProducts()) {
                MifareCardInfo mifareCardInfo = new MifareCardInfo();
                mifareCardInfo.mCardArt = doorCardProduct.getCardArt();
                mifareCardInfo.mCardName = doorCardProduct.getProductName();
                mifareCardInfo.setProductId(doorCardProduct.getProductId());
                mifareCardInfo.mMifareCardType = doorCardProduct.getCardType();
                mifareCardInfo.setBusinessId(doorCardProduct.getBusinessId());
                arrayList2.add(mifareCardInfo);
            }
            arrayList.addAll(build(arrayList2, false, CardCategory.DOOR));
            return arrayList;
        } catch (IOException unused) {
            throw new AuthApiException(2);
        }
    }

    private List<SeCard> getIssuedICCOADigtalKeyCardList() throws AuthApiException {
        ArrayList arrayList = new ArrayList();
        BaseResponse baseResponseC = g.a(CardInfo.CARD_TYPE_ICCOA_DIGITAL_KEY).c(EnvironmentConfig.getContext(), new ICCOACarKeyCardInfo(), null);
        if (!baseResponseC.isSuccess()) {
            throw new AuthApiException(baseResponseC.mResultCode, baseResponseC.mMsg);
        }
        Object[] objArr = baseResponseC.mDatas;
        if (objArr != null && objArr.length > 0) {
            arrayList.addAll(build((List) objArr[0], true, CardCategory.ICCOA_DIGITAL_KEY));
        }
        return arrayList;
    }

    private List<SeCard> getIssuedProprietaryCarKeyCardList() throws AuthApiException {
        ArrayList arrayList = new ArrayList();
        BaseResponse baseResponseB = g.a(CardInfo.CARD_TYPE_TRADITIONALCARKEYCARD).b(EnvironmentConfig.getContext(), null);
        if (!baseResponseB.isSuccess()) {
            throw new AuthApiException(baseResponseB.mResultCode, baseResponseB.mMsg);
        }
        Object[] objArr = baseResponseB.mDatas;
        if (objArr != null && objArr.length > 0) {
            arrayList.addAll(build((List) objArr[0], true, CardCategory.PROPRIETARY_CAR_KEY));
        }
        return arrayList;
    }

    private List<SeCard> getProprietaryCarKeyCardList() throws AuthApiException {
        ArrayList arrayList = new ArrayList();
        try {
            jjs jjsVar = new jjs(EnvironmentConfig.getContext(), null);
            oas oasVar = (oas) HttpClient.getInstance(EnvironmentConfig.getContext()).execute(jjsVar).getResult();
            if (!jjsVar.isSuccess()) {
                ErrorInfo errorInfo = jjsVar.getResponse().getErrorInfo();
                throw new AuthApiException(errorInfo.mErrorCode, errorInfo.mErrorDesc);
            }
            List<DoorCardProduct> listA = oasVar.a().a();
            ArrayList arrayList2 = new ArrayList();
            for (DoorCardProduct doorCardProduct : listA) {
                ProprietaryCarKeyCardInfo proprietaryCarKeyCardInfo = new ProprietaryCarKeyCardInfo();
                proprietaryCarKeyCardInfo.mCardArt = doorCardProduct.getCardArt();
                proprietaryCarKeyCardInfo.mProductId = doorCardProduct.getProductId();
                proprietaryCarKeyCardInfo.mProductName = doorCardProduct.getProductName();
                proprietaryCarKeyCardInfo.mCardName = doorCardProduct.getProductName();
                proprietaryCarKeyCardInfo.setIssuerId(doorCardProduct.getIssuerId());
                proprietaryCarKeyCardInfo.mTraditionalCardType = doorCardProduct.getCardType();
                CardUIInfo cardUIInfo = new CardUIInfo();
                cardUIInfo.mCardDesc = doorCardProduct.getProductDesc();
                cardUIInfo.mCardLogoUrl = doorCardProduct.getLogo();
                proprietaryCarKeyCardInfo.mCardUIInfo = cardUIInfo;
                arrayList2.add(proprietaryCarKeyCardInfo);
            }
            arrayList.addAll(build(arrayList2, false, CardCategory.PROPRIETARY_CAR_KEY));
            return arrayList;
        } catch (IOException e) {
            LogUtils.e("getProprietaryCarKeyCardList with exception ", e);
            throw new AuthApiException(12);
        }
    }

    @Override // com.miui.tsmclient.sesdk.ICardList
    public List<SeCard> getIssuedCardList(CardCategory cardCategory) throws AuthApiException {
        List<SeCard> issuedICCOADigtalKeyCardList;
        Object[] objArr;
        int iA;
        String message;
        b4s b4sVar = new b4s();
        Context context = EnvironmentConfig.getContext();
        ArrayList arrayList = new ArrayList();
        if (cardCategory == null || cardCategory == CardCategory.TRANSIT) {
            for (SeCard seCard : getTransitCardList(null, false)) {
                if (seCard.isIssued()) {
                    arrayList.add(seCard);
                }
            }
        }
        if (cardCategory != null) {
            CardCategory cardCategory2 = CardCategory.DIGITAL_KEY;
            if (cardCategory == cardCategory2) {
                j jVarA = g.a(CardInfo.CARD_TYPE_DIGITAL_KEY);
                Bundle bundle = new Bundle();
                bundle.putBoolean(Constants.EXTRA_OUT_OPERATION, true);
                BaseResponse baseResponseC = jVarA.c(context, new CarKeyCardInfo(), bundle);
                if (!baseResponseC.isSuccess() || (objArr = baseResponseC.mDatas) == null || objArr.length <= 0) {
                    throw new AuthApiException(baseResponseC.mResultCode, baseResponseC.mMsg);
                }
                issuedICCOADigtalKeyCardList = build((List) objArr[0], true, cardCategory2);
            } else if (cardCategory == CardCategory.PROPRIETARY_CAR_KEY) {
                issuedICCOADigtalKeyCardList = getIssuedProprietaryCarKeyCardList();
            } else if (cardCategory == CardCategory.ICCOA_DIGITAL_KEY) {
                issuedICCOADigtalKeyCardList = getIssuedICCOADigtalKeyCardList();
            }
            arrayList.addAll(issuedICCOADigtalKeyCardList);
            return arrayList;
        }
        arrayList.addAll(getCarKeyCardList());
        if (cardCategory != null && cardCategory != CardCategory.DOOR) {
            return arrayList;
        }
        try {
            TsmRpcModels.QueryDoorCardInfoResponse queryDoorCardInfoResponseQueryMifareCardList = b4sVar.queryMifareCardList(context);
            if (queryDoorCardInfoResponseQueryMifareCardList == null) {
                return arrayList;
            }
            iA = h.a(queryDoorCardInfoResponseQueryMifareCardList.getResult());
            message = queryDoorCardInfoResponseQueryMifareCardList.getErrorDesc();
            LogUtils.d("getDoorCardList result: " + iA);
            if (iA == 0) {
                arrayList.addAll(build(w3s.e(context, queryDoorCardInfoResponseQueryMifareCardList.getCardInfoListList()), true, CardCategory.DOOR));
                return arrayList;
            }
        } catch (a e) {
            LogUtils.e("getDoorCardList failed", e);
            iA = e.a();
            message = e.getMessage();
        }
        throw new AuthApiException(iA, message);
    }

    @Override // com.miui.tsmclient.sesdk.ICardList
    public List<SeCard> getSupportedCardList(CardCategory cardCategory) throws AuthApiException {
        ArrayList arrayList = new ArrayList();
        if (cardCategory == null || cardCategory == CardCategory.CLOUD_TRANSIT) {
            try {
                arrayList.addAll(getCloudTransitCardList());
            } catch (AuthApiException e) {
                LogUtils.e("getCloudTransitCardList failed", e);
            }
        }
        if (cardCategory == null || cardCategory == CardCategory.TRANSIT) {
            arrayList.addAll(getTransitCardList(null, false));
        }
        if (cardCategory == null || cardCategory == CardCategory.DOOR) {
            arrayList.addAll(getDoorCardList());
        }
        if (cardCategory == CardCategory.PROPRIETARY_CAR_KEY) {
            arrayList.addAll(getProprietaryCarKeyCardList());
        }
        if (cardCategory == null || cardCategory == CardCategory.CLOUD_DOOR) {
            try {
                arrayList.addAll(getCloudDoorCardList());
            } catch (AuthApiException e2) {
                LogUtils.e("getCloudDoorCardList failed", e2);
            }
        }
        if (cardCategory == null || cardCategory == CardCategory.DIGITAL_KEY) {
            arrayList.add(new DigitalKeyCard(new CarKeyCardInfo(), false));
        }
        if (cardCategory == null || cardCategory == CardCategory.ICCOA_DIGITAL_KEY) {
            arrayList.add(new ICCOADigitalKeyCard(new ICCOACarKeyCardInfo(), false));
        }
        return arrayList;
    }

    @Override // com.miui.tsmclient.sesdk.ICardList
    public List<SeCard> getSupportedCardListWithGroup(CardCategory cardCategory) throws AuthApiException {
        ArrayList arrayList = new ArrayList();
        if (cardCategory == null || cardCategory == CardCategory.CLOUD_TRANSIT) {
            try {
                arrayList.addAll(getCloudTransitCardList());
            } catch (AuthApiException e) {
                LogUtils.e("getCloudTransitCardList failed", e);
            }
        }
        if (cardCategory == null || cardCategory == CardCategory.TRANSIT) {
            arrayList.addAll(getTransitCardList(null, true));
        }
        if (cardCategory == null || cardCategory == CardCategory.DOOR) {
            arrayList.addAll(getDoorCardList());
        }
        if (cardCategory == CardCategory.PROPRIETARY_CAR_KEY) {
            arrayList.addAll(getProprietaryCarKeyCardList());
        }
        if (cardCategory == null || cardCategory == CardCategory.CLOUD_DOOR) {
            try {
                arrayList.addAll(getCloudDoorCardList());
            } catch (AuthApiException e2) {
                LogUtils.e("getCloudDoorCardList failed", e2);
            }
        }
        return arrayList;
    }

    public List<SeCard> getTransitCardList(String str, boolean z) throws AuthApiException {
        TSMAuthManager tSMAuthManager = new TSMAuthManager();
        Context context = EnvironmentConfig.getContext();
        ArrayList arrayList = new ArrayList();
        try {
            Location lastLocation = TSMLocationService.getInstance(context).getLastLocation();
            JSONArray jSONArrayQueryCardProductGroup = z ? tSMAuthManager.queryCardProductGroup(context, CardGroupType.TRANSCARD, str, lastLocation) : tSMAuthManager.queryCardProduct(context, CardGroupType.TRANSCARD, str, lastLocation);
            ArrayList arrayList2 = new ArrayList();
            if (jSONArrayQueryCardProductGroup != null) {
                for (int i = 0; i < jSONArrayQueryCardProductGroup.length(); i++) {
                    JSONObject jSONObject = jSONArrayQueryCardProductGroup.getJSONObject(i);
                    CardInfo cardInfoMakeCardInfo = CardInfoFactory.makeCardInfo(jSONObject.optString("cardName"), null);
                    cardInfoMakeCardInfo.parse(jSONObject);
                    if (!cardInfoMakeCardInfo.isHide()) {
                        arrayList2.add(cardInfoMakeCardInfo);
                    }
                }
            }
            arrayList.addAll(build(arrayList2, false, CardCategory.TRANSIT));
            return arrayList;
        } catch (JSONException e) {
            LogUtils.e("failed to get cards on network!", e);
            throw new AuthApiException(16);
        }
    }
}
