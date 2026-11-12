package com.miui.tsmclient.model;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.miui.tsmclient.entity.ActionToken;
import com.miui.tsmclient.entity.CardGroupType;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.CardInfoFactory;
import com.miui.tsmclient.entity.CloudTransitCardInfo;
import com.miui.tsmclient.entity.PayableCardInfo;
import com.miui.tsmclient.entity.UncompletedBusiness;
import com.miui.tsmclient.net.AuthApiException;
import com.miui.tsmclient.net.TSMAuthManager;
import com.miui.tsmclient.pay.OrderInfo;
import com.miui.tsmclient.util.Constants;
import com.miui.tsmclient.util.LogUtils;
import com.miui.tsmclient.util.ObjectUtils;
import com.miui.tsmclient.util.TSMLocationService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class BaseTransitCardModel extends BaseModel {
    protected TSMAuthManager mTSMAuthManager;

    private void filterUnfinishedOrder(List<CardInfo> list) {
        OrderInfo orderInfo;
        if (ObjectUtils.isCollectionEmpty(list) || list.get(0) == null) {
            return;
        }
        PayableCardInfo payableCardInfo = (PayableCardInfo) list.get(0);
        List<OrderInfo> list2 = payableCardInfo.mUnfinishOrderInfos;
        int size = list2.size() - 1;
        while (true) {
            if (size < 0) {
                orderInfo = null;
                break;
            } else {
                if (list2.get(size) != null && list2.get(size).isIssueOrder()) {
                    orderInfo = list2.get(size);
                    break;
                }
                size--;
            }
        }
        payableCardInfo.mUnfinishOrderInfos.clear();
        if (orderInfo != null) {
            payableCardInfo.mUnfinishOrderInfos.add(orderInfo);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0013  */
    private void parseJsonArray(JSONArray jSONArray, List<CardInfo> list, Bundle bundle) throws AuthApiException {
        boolean z;
        if (jSONArray == null) {
            return;
        }
        if (bundle != null) {
            try {
                if (bundle.getBoolean(Constants.EXTRA_IS_SKIP_QUERY_BY_USER_ID, false)) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (JSONException e) {
                LogUtils.e("failed to get cards on network!", e);
                throw new AuthApiException(16);
            }
        } else {
            z = false;
        }
        HashMap map = new HashMap();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            PayableCardInfo payableCardInfo = new PayableCardInfo(jSONObject.optString("cardName"));
            payableCardInfo.mDataSource = CardInfo.DataSource.Network;
            payableCardInfo.parse(jSONObject);
            list.add(payableCardInfo);
            if (!z) {
                try {
                    queryByUserId(map);
                    z = true;
                } catch (AuthApiException e2) {
                    LogUtils.e("queryByUserId failed. errorCode: " + e2.mErrorCode + ", msg: " + e2.mErrorMsg, e2);
                }
            }
            if (map.containsKey(payableCardInfo.mCardType)) {
                payableCardInfo.mUnfinishOrderInfos = map.get(payableCardInfo.mCardType);
            }
        }
    }

    private void parseJsonArrayToList(JSONArray jSONArray, List<CardInfo> list, Bundle bundle) throws AuthApiException {
        parseJsonArray(jSONArray, list, bundle);
        getCardsMergeUncompletedBusiness(list, bundle);
    }

    public CardInfo getCardFromNetwork(String str) {
        try {
            JSONArray jSONArrayQueryCardProduct = this.mTSMAuthManager.queryCardProduct(getContext(), str);
            if (jSONArrayQueryCardProduct == null) {
                return null;
            }
            for (int i = 0; i < jSONArrayQueryCardProduct.length(); i++) {
                JSONObject jSONObject = jSONArrayQueryCardProduct.getJSONObject(i);
                CardInfo cardInfoMakeCardInfo = CardInfoFactory.makeCardInfo(jSONObject.optString("cardName"), jSONObject);
                if (TextUtils.equals(str, cardInfoMakeCardInfo.mCardType)) {
                    return cardInfoMakeCardInfo;
                }
            }
        } catch (AuthApiException e) {
            LogUtils.e("failed to get card info. errorCode: " + e.mErrorCode + ", msg: " + e.mErrorMsg, e);
        } catch (IOException e2) {
            LogUtils.e("failed to get card info!", e2);
        } catch (JSONException e3) {
            LogUtils.e("failed to parse card info!", e3);
        }
        return null;
    }

    public List<OrderInfo> getCardOrderList(CardInfo cardInfo) throws AuthApiException {
        if (cardInfo != null) {
            HashMap map = new HashMap();
            try {
                JSONArray jSONArrayQueryByUserId = queryByUserId(map);
                List<OrderInfo> list = map.get(cardInfo.mCardType);
                if (jSONArrayQueryByUserId == null) {
                    return null;
                }
                return list == null ? new ArrayList() : list;
            } catch (JSONException e) {
                LogUtils.e("failed to getCardOrderList!", e);
            }
        }
        return null;
    }

    public List<CardInfo> getCardsFromNetwork(CardInfo cardInfo, Bundle bundle) throws AuthApiException {
        Location lastLocation = TSMLocationService.getInstance(getContext()).getLastLocation();
        ArrayList arrayList = new ArrayList();
        parseJsonArrayToList(this.mTSMAuthManager.queryCardProduct(getContext(), CardGroupType.TRANSCARD, cardInfo == null ? null : cardInfo.mCardType, lastLocation), arrayList, bundle);
        return arrayList;
    }

    public void getCardsMergeUncompletedBusiness(List<CardInfo> list, Bundle bundle) throws AuthApiException {
        UncompletedBusiness next;
        if (list == null || list.isEmpty()) {
            return;
        }
        if (bundle == null || !bundle.getBoolean(Constants.EXTRA_IS_SKIP_QUERY_CARD_UNCOMPLETED_BUSINESS, false)) {
            List<UncompletedBusiness> listQueryUncompletedBusiness = queryUncompletedBusiness(null);
            if (listQueryUncompletedBusiness == null) {
                listQueryUncompletedBusiness = Collections.emptyList();
            }
            LogUtils.d("uncompletedCards count: " + listQueryUncompletedBusiness.size());
            for (CardInfo cardInfo : list) {
                if (cardInfo instanceof PayableCardInfo) {
                    PayableCardInfo payableCardInfo = (PayableCardInfo) cardInfo;
                    Iterator<UncompletedBusiness> it = listQueryUncompletedBusiness.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!payableCardInfo.isCardId(next.getAid()));
                    payableCardInfo.setUncompletedBusiness(next);
                }
            }
        }
    }

    public List<CardInfo> getCardsWithGroupFromNetWork(CardInfo cardInfo) throws AuthApiException {
        Location lastLocation = TSMLocationService.getInstance(getContext()).getLastLocation();
        ArrayList arrayList = new ArrayList();
        parseJsonArrayToList(this.mTSMAuthManager.queryCardProductGroup(getContext(), CardGroupType.TRANSCARD, cardInfo == null ? null : cardInfo.mCardType, lastLocation), arrayList, null);
        return arrayList;
    }

    public List<CardInfo> getChildCardsFromNetWork(CardInfo cardInfo) throws AuthApiException {
        ArrayList arrayList = new ArrayList();
        parseJsonArrayToList(this.mTSMAuthManager.queryChildCardProduct(getContext(), cardInfo.mCardType), arrayList, null);
        return arrayList;
    }

    public List<CardInfo> getCloudCardsFromNetwork() throws AuthApiException {
        Location lastLocation = TSMLocationService.getInstance(getContext()).getLastLocation();
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArrayQueryCloudTransitCard = new TSMAuthManager().queryCloudTransitCard(getContext(), CardGroupType.TRANSCARD, null, lastLocation);
            if (jSONArrayQueryCloudTransitCard != null) {
                for (int i = 0; i < jSONArrayQueryCloudTransitCard.length(); i++) {
                    JSONObject jSONObject = jSONArrayQueryCloudTransitCard.getJSONObject(i);
                    CloudTransitCardInfo cloudTransitCardInfo = new CloudTransitCardInfo(jSONObject.optString("cardName"), jSONObject);
                    cloudTransitCardInfo.mDataSource = CardInfo.DataSource.Network;
                    cloudTransitCardInfo.parse(jSONObject);
                    arrayList.add(cloudTransitCardInfo);
                }
            }
            return arrayList;
        } catch (JSONException e) {
            LogUtils.e("failed to get cloud cards on network!", e);
            throw new AuthApiException(16);
        }
    }

    public List<CardInfo> getGiftCardFromNetWork(CardInfo cardInfo) throws AuthApiException {
        Location lastLocation = TSMLocationService.getInstance(getContext()).getLastLocation();
        ArrayList arrayList = new ArrayList();
        parseJsonArray(this.mTSMAuthManager.queryGiftCardRequest(getContext(), CardGroupType.TRANSCARD, cardInfo == null ? null : cardInfo.mCardType, lastLocation), arrayList, null);
        filterUnfinishedOrder(arrayList);
        return arrayList;
    }

    public List<CardInfo> getLoggingOutCardsFromNetWork() throws AuthApiException {
        ArrayList arrayList = new ArrayList();
        parseJsonArrayToList(this.mTSMAuthManager.queryLoggingOutCardProduct(getContext()), arrayList, null);
        return arrayList;
    }

    public List<CardInfo> getRecommendedCardsFromNetWork(int i) throws AuthApiException {
        ArrayList arrayList = new ArrayList();
        parseJsonArrayToList(new TSMAuthManager().queryRecommendedTransitCard(getContext(), CardGroupType.TRANSCARD, null, i), arrayList, null);
        return arrayList;
    }

    @Override // com.miui.tsmclient.model.BaseModel
    public void onInit() {
        this.mTSMAuthManager = new TSMAuthManager();
    }

    public Map<String, List<OrderInfo>> queryByUserId() throws JSONException, AuthApiException {
        HashMap map = new HashMap();
        queryByUserId(map);
        return map;
    }

    public List<UncompletedBusiness> queryUncompletedBusiness(String str) throws AuthApiException {
        return (List) new Gson().fromJson(this.mTSMAuthManager.queryUncompletedBusiness(getContext(), str).toString(), new TypeToken<List<UncompletedBusiness>>() { // from class: com.miui.tsmclient.model.BaseTransitCardModel.1
        }.getType());
    }

    public void removeUnTransferInOrder(List<CardInfo> list) {
        List<ActionToken> list2;
        int size = list == null ? 0 : list.size();
        for (int i = 0; i < size; i++) {
            CardInfo cardInfo = list.get(i);
            if (cardInfo instanceof PayableCardInfo) {
                PayableCardInfo payableCardInfo = (PayableCardInfo) cardInfo;
                if (payableCardInfo.hasTransferInOrder() && (list2 = payableCardInfo.mUnfinishOrderInfos.get(0).mActionTokens) != null) {
                    Iterator<ActionToken> it = list2.iterator();
                    while (it.hasNext()) {
                        if (!it.next().canShiftIn()) {
                            payableCardInfo.mUnfinishOrderInfos.clear();
                        }
                    }
                }
            }
        }
    }

    public JSONArray queryByUserId(Map<String, List<OrderInfo>> map) throws JSONException, AuthApiException {
        JSONArray jSONArrayQueryByUserId = this.mTSMAuthManager.queryByUserId(getContext());
        if (jSONArrayQueryByUserId == null) {
            return jSONArrayQueryByUserId;
        }
        for (int i = 0; i < jSONArrayQueryByUserId.length(); i++) {
            OrderInfo orderInfo = new OrderInfo();
            orderInfo.parse(jSONArrayQueryByUserId.getJSONObject(i));
            List<OrderInfo> copyOnWriteArrayList = map.get(orderInfo.mCardType);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                map.put(orderInfo.mCardType, copyOnWriteArrayList);
            }
            copyOnWriteArrayList.add(orderInfo);
        }
        return jSONArrayQueryByUserId;
    }
}
