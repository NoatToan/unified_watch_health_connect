package com.xiaomi.fitness.nfc.bean;

import android.text.TextUtils;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.sesdk.CardCategory;
import com.miui.tsmclient.sesdk.CloudKeyCardDetail;
import com.miui.tsmclient.sesdk.CloudTransitCardDetail;
import com.miui.tsmclient.sesdk.DigitalKeyCardDetail;
import com.miui.tsmclient.sesdk.ICCOADigitalKeyCardDetail;
import com.miui.tsmclient.sesdk.KeyCardDetail;
import com.miui.tsmclient.sesdk.OrderData;
import com.miui.tsmclient.sesdk.SeCard;
import com.miui.tsmclient.sesdk.SeCardStatus;
import com.miui.tsmclient.sesdk.TransitCardDetail;
import com.miui.tsmclient.sesdk.UncompletedOrderList;
import com.service.mi.BankCard;
import com.service.mi.visa.entity.CardMetaData;
import com.service.mi.wallet.entity.MediaContent;
import com.service.mi.wallet.entity.ProductConfig;
import com.tsmclient.smartcard.model.TradeLog;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.nfc.bean.yoyo.CardInfoBean;
import com.xiaomi.fitness.nfc.sdk.ChannelImpl;
import com.xiaomi.fitness.nfc.utils.NfcUtils;
import defpackage.lxf;
import defpackage.o0j;
import defpackage.vqg;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class CardWrapper {
    public BankCard bankCard;
    public String detailDescription;
    public DigitalKeyCardDetail digitalKeyCardDetail;
    private List<OrderData.Fee> feeList;
    public boolean isBackUp;
    public boolean isDownloadable;
    public boolean isNeedAuthor;
    public boolean isOwner;
    public boolean isSupportBackup;
    private boolean isSupportServiceFeeRefund;
    private Boolean isYoYoDisableCard;
    public String mAid;
    private String mCaptcha;
    public int mCardBalance;
    private CardCategory mCardCategory;
    public String mCardFace;

    @Deprecated
    public CardInfo mCardInfo;
    public String mCardName;
    public String mCardNo;
    public String mCardType;
    public String mGroupName;
    public int mGroupType;
    public boolean mHasIssue;
    public boolean mIsReadSECorrectly;
    private int mIssueStatus;
    private String mIssueStatusDesc;
    public OrderData.Order mOrderInfo;
    public List<OrderData.Order> mPendingOrderList;
    private String mPhoneNum;
    private int mRechargeStatus;
    private String mRechargeStatusDesc;
    public SeCard mSeCard;
    public SeCardStatus mStatus;
    public OrderData.Fee selectedFee;
    public int type;
    public String userIdMismatchDesc;
    public int vsStatus;
    public CardInfoBean youyouCard;

    @Retention(RetentionPolicy.SOURCE)
    public @interface IssueStatus {
        public static final int ISSUE_ALLOW = 0;
        public static final int ISSUE_DISALLOW = 4;
        public static final int ISSUE_UNKNOWN = -1;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface RechargeStatus {
        public static final int RECHARGE_ALLOW = 0;
        public static final int RECHARGE_DISALLOW = 4;
        public static final int RECHARGE_UNKNOWN = -1;
    }

    public CardWrapper(BankCard bankCard) {
        this(bankCard, true);
    }

    private void init(CardInfo cardInfo) {
        this.mAid = cardInfo.mAid;
        this.mCardType = cardInfo.mCardType;
        this.mCardName = cardInfo.mCardName;
        this.mCardInfo = cardInfo;
    }

    public static CardWrapper parse(SeCard seCard) {
        return new CardWrapper(seCard);
    }

    public static List<CardWrapper> parseTransit(List<SeCard> list, List<UncompletedOrderList.UncompletedOrder> list2) {
        HashMap map = new HashMap();
        if (list2 != null && !list2.isEmpty()) {
            for (UncompletedOrderList.UncompletedOrder uncompletedOrder : list2) {
                vqg.d("parseTransit aid:" + uncompletedOrder.getAid());
                map.put(uncompletedOrder.getAid(), uncompletedOrder);
            }
        }
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            for (SeCard seCard : list) {
                CardWrapper cardWrapper = parse(seCard);
                UncompletedOrderList.UncompletedOrder uncompletedOrder2 = (UncompletedOrderList.UncompletedOrder) map.get(seCard.getAid());
                if (uncompletedOrder2 != null) {
                    int type = uncompletedOrder2.getType();
                    cardWrapper.type = type;
                    cardWrapper.userIdMismatchDesc = uncompletedOrder2.getUserIdMismatchDesc();
                    vqg.d("parseTransit aid:" + seCard.getAid() + "  type:" + type);
                }
                arrayList.add(cardWrapper);
            }
        }
        return arrayList;
    }

    public BaseResponse activate(String str) {
        return this.mSeCard.activate(str);
    }

    public OrderData.Order createOrder(String str, OrderData.Fee fee, OrderData.Coupon coupon) throws Exception {
        OrderData orderData = this.mSeCard.getOrderData();
        if (isSupportNewPay()) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < orderData.getPayChannelList().size(); i++) {
                sb.append(orderData.getPayChannelList().get(i));
                sb.append("  ");
            }
            vqg.a("isSupportNewPay PayChannelList = " + sb.toString());
        }
        orderData.setPayChannel(str);
        orderData.setFee(fee);
        orderData.setCoupon(coupon);
        orderData.setPhoneNum(getPhoneNum());
        orderData.setCaptcha(getCaptcha());
        return orderData.createOrder();
    }

    public BaseResponse delete() {
        return this.mSeCard.delete(null);
    }

    public List<OrderData.Fee> getActiveFeeInfoList() {
        return this.feeList;
    }

    public String getAid() {
        SeCard seCard = this.mSeCard;
        if (seCard == null) {
            return null;
        }
        return seCard.getAid();
    }

    public String getBankEndNo() {
        BankCard bankCard = this.bankCard;
        if (bankCard != null) {
            return bankCard.getTokenInfo().getAccountPanSuffix();
        }
        return null;
    }

    public String getBankName() {
        if (this.bankCard.getCardType() == 2) {
            return (this.bankCard.getCardMetaData() == null || this.bankCard.getCardMetaData().getContactName() == null) ? "" : this.bankCard.getCardMetaData().getContactName();
        }
        return (this.bankCard.getProductConfig() == null || this.bankCard.getProductConfig().getIssuerName() == null) ? "" : this.bankCard.getProductConfig().getIssuerName();
    }

    public String getCaptcha() {
        return this.mCaptcha;
    }

    public SeCardStatus getCarStatus() {
        return this.digitalKeyCardDetail.getStatus();
    }

    public String getCardBalanceTitle() {
        return this.mSeCard.getOnlineProperties().getDescription();
    }

    public String getCardFace() {
        List<MediaContent> mediaContents;
        SeCard seCard = this.mSeCard;
        if (seCard != null) {
            String cardFace = seCard.getCardFace();
            return (isMifare() && TextUtils.isEmpty(cardFace)) ? lxf.b() : cardFace;
        }
        BankCard bankCard = this.bankCard;
        if (bankCard != null) {
            if (bankCard.getCardType() == 2) {
                CardMetaData cardMetaData = this.bankCard.getCardMetaData();
                if (cardMetaData != null && (mediaContents = cardMetaData.getMediaContents()) != null && !mediaContents.isEmpty()) {
                    for (int i = 0; i < mediaContents.size(); i++) {
                        MediaContent mediaContent = mediaContents.get(i);
                        if (Objects.equals(mediaContent.getContentType(), "digitalCardArt")) {
                            return mediaContent.getUrl();
                        }
                    }
                    return mediaContents.get(1).getUrl();
                }
            } else {
                ProductConfig productConfig = this.bankCard.getProductConfig();
                if (productConfig != null && productConfig.getCardBackgroundCombinedMediaContents() != null) {
                    return productConfig.getCardBackgroundCombinedMediaContents().getUrl();
                }
            }
        }
        return isYoYo() ? NfcUtils.getYoYoCardFace(this.youyouCard.getCardLayout()) : this.mCardFace;
    }

    public SeCardStatus getCardStatus() {
        return this.mSeCard.getContent() != null ? this.mSeCard.getContent().getStatus() : this.mStatus;
    }

    public String getCardType() {
        return this.mSeCard.getId();
    }

    public CardCategory getCategory() {
        return this.mCardCategory;
    }

    public OrderData.CouponList getCouponList(OrderData.Fee fee) throws Exception {
        if (fee != null) {
            this.mSeCard.getOrderData().setFee(fee);
        }
        return this.mSeCard.getOrderData().getCouponList();
    }

    public String getDeviceEndNo() {
        BankCard bankCard = this.bankCard;
        if (bankCard != null) {
            return bankCard.getTokenInfo().getTokenPanSuffix();
        }
        return null;
    }

    public String getDevicePreNo() {
        BankCard bankCard = this.bankCard;
        if (bankCard != null) {
            return bankCard.getTokenInfo().getTokenExpiry();
        }
        return null;
    }

    public String getEndDate() {
        SeCard seCard = this.mSeCard;
        return (seCard == null || seCard.getContent() == null) ? "" : this.mSeCard.getContent().validEndDate;
    }

    public String getId() {
        SeCard seCard = this.mSeCard;
        if (seCard == null) {
            return null;
        }
        return seCard.getId();
    }

    public int getIssueStatus() {
        return this.mIssueStatus;
    }

    public String getIssueStatusDesc() {
        return this.mIssueStatusDesc;
    }

    public String getLabel() {
        return this.mSeCard.getOnlineProperties().getLabel();
    }

    public String getName() {
        SeCard seCard = this.mSeCard;
        return seCard == null ? "" : seCard.getName();
    }

    public int getOriginServiceFee() {
        return this.mSeCard.getOrderData().getServiceFee();
    }

    public String getPhoneNum() {
        return this.mPhoneNum;
    }

    public String getProductId() {
        SeCard seCard = this.mSeCard;
        if (seCard != null) {
            return seCard.getId();
        }
        return null;
    }

    public OrderData.Order getRechargeOrder() {
        return this.mOrderInfo;
    }

    public int getRechargeStatus() {
        return this.mRechargeStatus;
    }

    public String getRechargeStatusDesc() {
        return this.mRechargeStatusDesc;
    }

    public String getServiceStatusDesc() {
        return this.mSeCard.getOnlineProperties().getServiceStatus();
    }

    public String getStatus() {
        BankCard bankCard = this.bankCard;
        if (bankCard == null) {
            return "";
        }
        int tokenStatus = bankCard.getTokenStatus();
        vqg.d("tokenStatus:" + tokenStatus);
        if (tokenStatus == 1) {
            return AppUtil.getApp().getString(o0j.Z1);
        }
        if (tokenStatus == 2) {
            return AppUtil.getApp().getString(o0j.X1);
        }
        if (tokenStatus != 3) {
            return (tokenStatus == 4 || tokenStatus == 5) ? AppUtil.getApp().getString(o0j.Y1) : "";
        }
        return AppUtil.getApp().getString(o0j.a2);
    }

    public String getTips() {
        return this.mSeCard.getOnlineProperties().getTips();
    }

    public List<TradeLog> getTradeLogs() {
        SeCard seCard = this.mSeCard;
        if (seCard == null || seCard.getContent() == null) {
            return null;
        }
        return this.mSeCard.getContent().tradeLogs;
    }

    public OrderData.Order getTransferInOrder() {
        List<OrderData.Order> list = this.mPendingOrderList;
        if (list == null) {
            vqg.d("getTransferInOrder mPendingOrderList == null");
            return null;
        }
        for (OrderData.Order order : list) {
            if (!TextUtils.isEmpty(order.getTransferInToken())) {
                vqg.d("getTransferInOrder order.getTransferInToken() != null");
                return order;
            }
        }
        vqg.d("getTransferInOrder order == null");
        return null;
    }

    public boolean hasIssueNoComplete() {
        return this.type == 1;
    }

    public OrderData.Order hasIssueOrder() {
        List<OrderData.Order> list = this.mPendingOrderList;
        if (list == null) {
            return null;
        }
        for (OrderData.Order order : list) {
            if (order.getIssueToken() != null) {
                return order;
            }
        }
        return null;
    }

    public boolean hasRechargeOrder() {
        for (int i = 0; i < this.mPendingOrderList.size(); i++) {
            if (!TextUtils.isEmpty(this.mPendingOrderList.get(i).getRechargeToken())) {
                return true;
            }
        }
        return false;
    }

    public boolean hasTransferInOrder() {
        return this.type == 2;
    }

    public boolean hasTransferOutOrder() {
        return this.type == 4;
    }

    public boolean isBalanceValid() {
        return this.mCardBalance != -999;
    }

    public boolean isBank() {
        return getCategory() == CardCategory.UNION_PAY;
    }

    public boolean isCar() {
        return getCategory() == CardCategory.DIGITAL_KEY || getCategory() == CardCategory.ICCOA_DIGITAL_KEY;
    }

    public boolean isCardActive() {
        return this.mSeCard.getOnlineProperties().isServiceAvailable();
    }

    public boolean isCloudDoor() {
        return getCategory() == CardCategory.CLOUD_DOOR;
    }

    public boolean isCloudTransit() {
        return getCategory() == CardCategory.CLOUD_TRANSIT;
    }

    public boolean isIssued() {
        SeCard seCard = this.mSeCard;
        return seCard != null && seCard.isIssued();
    }

    public boolean isMaster() {
        return this.bankCard != null;
    }

    public boolean isMifare() {
        return getCategory() == CardCategory.DOOR;
    }

    public boolean isNeedActive() {
        BankCard bankCard = this.bankCard;
        return (bankCard == null || bankCard.getTokenStatus() == 2) ? false : true;
    }

    public boolean isPrivateCarKey() {
        return getCategory() == CardCategory.PROPRIETARY_CAR_KEY;
    }

    public boolean isServiceAvailable() {
        if (!isMifare()) {
            return this.mSeCard.getOnlineProperties().isServiceAvailable();
        }
        if (!lxf.e(this)) {
            return this.mSeCard != null;
        }
        SeCard seCard = this.mSeCard;
        return (seCard == null || seCard.getContent() == null || this.mSeCard.getContent().getStatus() != SeCardStatus.ACTIVE) ? false : true;
    }

    public boolean isSuperCardNotOk() {
        return this.vsStatus == 6;
    }

    public boolean isSuperCardOk() {
        return this.vsStatus == 7;
    }

    public boolean isSupportAlipay() {
        return this.mSeCard.getOrderData().getPayChannelList().contains("alipay");
    }

    public boolean isSupportNewPay() {
        return this.mSeCard.getOrderData().getPayChannelList().size() > 0 && (isSupportWechat() || isSupportAlipay());
    }

    public boolean isSupportServiceFeeRefund() {
        return this.isSupportServiceFeeRefund;
    }

    public boolean isSupportTransferOut() {
        return this.mSeCard.isSupportTransferOut();
    }

    public boolean isSupportUcashier() {
        return this.mSeCard.getOrderData().getPayChannelList().contains("ucashier");
    }

    public boolean isSupportWechat() {
        return this.mSeCard.getOrderData().getPayChannelList().contains("wechat_pay");
    }

    public boolean isTransit() {
        return getCategory() == CardCategory.TRANSIT;
    }

    public boolean isYoYo() {
        return this.youyouCard != null;
    }

    public BaseResponse issue(String str) throws Exception {
        boolean z = getTransferInOrder() != null;
        if (!isTransit() || z) {
            if (isCloudDoor() || isCloudTransit() || z) {
                vqg.d("issue isCloudTransit hasTransferIn");
                return transferIn();
            }
            if (str != null) {
                return this.mSeCard.issue(str);
            }
            vqg.d("issue else aid:" + this.mSeCard.getAid());
            BaseResponse baseResponseIssue = this.mSeCard.issue(null);
            this.mSeCard.updateContent();
            vqg.d("issue else issue end aid:" + this.mSeCard.getAid());
            init(this.mSeCard);
            return baseResponseIssue;
        }
        if (this.mOrderInfo == null) {
            List<OrderData.Order> list = this.mSeCard.getOrderData().getPendingOrderList().getList();
            this.mPendingOrderList = list;
            if (list != null) {
                vqg.d("issue isTransit hasTransferIn mPendingOrderListSize:" + this.mPendingOrderList.size());
            } else {
                vqg.d("issue isTransit hasTransferIn mPendingOrderList = null");
            }
            for (int i = 0; i < this.mPendingOrderList.size(); i++) {
                if (!TextUtils.isEmpty(this.mPendingOrderList.get(i).getIssueToken())) {
                    this.mOrderInfo = this.mPendingOrderList.get(i);
                    break;
                }
            }
        }
        OrderData.Order order = this.mOrderInfo;
        if (order == null) {
            throw new Exception(AppUtil.getApp().getString(o0j.o5));
        }
        String issueToken = order.getIssueToken();
        StringBuilder sb = new StringBuilder();
        sb.append("issue isPaid:");
        sb.append(this.mOrderInfo.isPaid());
        sb.append("  hasIssueToken:");
        sb.append(!TextUtils.isEmpty(issueToken));
        vqg.d(sb.toString());
        BaseResponse baseResponseIssue2 = this.mSeCard.issue(issueToken);
        init(this.mSeCard);
        return baseResponseIssue2;
    }

    public BaseResponse prepare() {
        return this.mSeCard.prepare(null);
    }

    public BaseResponse queryPan(String str) {
        return this.mSeCard.queryPan(str);
    }

    public BaseResponse recharge(String str) throws Exception {
        vqg.d("recharge orderId:" + str);
        List<OrderData.Order> list = this.mSeCard.getOrderData().getPendingOrderList().getList();
        this.mPendingOrderList = list;
        int i = 0;
        if (list != null && list.size() == 0) {
            BaseResponse baseResponseUpdateContent = this.mSeCard.updateContent();
            this.mCardBalance = this.mSeCard.getContent().balance;
            vqg.d("updateResponse code:" + baseResponseUpdateContent.mResultCode + "  msg:" + baseResponseUpdateContent.mMsg + "  mCardBalance:" + this.mCardBalance + "  mPendingOrderList != null && mPendingOrderList.size() == 0");
            return new BaseResponse(0, new Object[0]);
        }
        OrderData.Order order = null;
        if (TextUtils.isEmpty(str)) {
            while (i < this.mPendingOrderList.size()) {
                OrderData.Order order2 = this.mPendingOrderList.get(i);
                if (!TextUtils.isEmpty(order2.getRechargeToken())) {
                    order = order2;
                    break;
                }
                i++;
            }
        } else {
            while (i < this.mPendingOrderList.size()) {
                OrderData.Order order3 = this.mPendingOrderList.get(i);
                if (order3.getOrderId().equals(str)) {
                    order = order3;
                    break;
                }
                i++;
            }
        }
        if (order == null) {
            BaseResponse baseResponseUpdateContent2 = this.mSeCard.updateContent();
            this.mCardBalance = this.mSeCard.getContent().balance;
            vqg.d("updateResponse code:" + baseResponseUpdateContent2.mResultCode + "  msg:" + baseResponseUpdateContent2.mMsg + "  mCardBalance:" + this.mCardBalance + "  targetOrder == null");
            return baseResponseUpdateContent2;
        }
        BaseResponse baseResponseRecharge = this.mSeCard.recharge(order.getRechargeToken());
        vqg.d("recharge code:" + baseResponseRecharge.mResultCode + "  msg:" + baseResponseRecharge.mMsg);
        if (baseResponseRecharge.isSuccess()) {
            BaseResponse baseResponseUpdateContent3 = this.mSeCard.updateContent();
            this.mCardBalance = this.mSeCard.getContent().balance;
            vqg.d("updateResponse code:" + baseResponseUpdateContent3.mResultCode + "  msg:" + baseResponseUpdateContent3.mMsg + "  mCardBalance:" + this.mCardBalance + "  targetOrder != null");
        }
        return baseResponseRecharge;
    }

    public BaseResponse requestAuthCode() {
        return this.mSeCard.requestAuthCode(null);
    }

    public BaseResponse returnCard(String str) {
        return this.mSeCard.returnCard(str);
    }

    public JSONObject serialize() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("aid", this.mAid);
            jSONObject.put("title", this.mCardName);
            jSONObject.put("card_face", getCardFace());
            jSONObject.put("card_balance", this.mCardBalance);
            jSONObject.put("card_no", this.mCardNo);
            jSONObject.put("has_issue", this.mHasIssue);
            jSONObject.put("cardName", this.mCardType);
            jSONObject.put("detail_description", this.detailDescription);
            jSONObject.put(CardInfo.KEY_READ_SE_CORRECTLY, this.mIsReadSECorrectly);
            jSONObject.put(CardInfo.KEY_CARD_GROUP, this.mGroupType);
            jSONObject.put(CardInfo.KEY_CARD_GROUP_NAME, this.mGroupName);
        } catch (JSONException e) {
            vqg.c("serialize cardInfo to JSONObject failed!", e);
        }
        return jSONObject;
    }

    public void setCaptcha(String str) {
        this.mCaptcha = str;
    }

    public void setCoupon(OrderData.Coupon coupon) {
        this.mSeCard.getOrderData().setCoupon(coupon);
    }

    public void setPhoneNum(String str) {
        this.mPhoneNum = str;
    }

    public BaseResponse transferIn() {
        OrderData.Order transferInOrder = getTransferInOrder();
        return this.mSeCard.transferIn(transferInOrder != null ? transferInOrder.getTransferInToken() : null);
    }

    public BaseResponse transferOut() {
        try {
            ChannelImpl.isTransferOutOption = true;
            return this.mSeCard.transferOut();
        } finally {
            ChannelImpl.isTransferOutOption = false;
        }
    }

    public BaseResponse updateContent() throws Exception {
        SeCard seCard = this.mSeCard;
        if (seCard != null) {
            BaseResponse baseResponseUpdateContent = seCard.updateContent();
            if (isTransit()) {
                this.mPendingOrderList = this.mSeCard.getOrderData().getPendingOrderList().getList();
                this.feeList = this.mSeCard.getOrderData().getFeeList().getList();
            }
            init(this.mSeCard);
            return baseResponseUpdateContent;
        }
        BankCard bankCard = this.bankCard;
        if (bankCard == null) {
            return new BaseResponse(0, new Object[0]);
        }
        com.service.mi.entity.BaseResponse baseResponseUpdate = bankCard.update();
        vqg.d("master update code:" + baseResponseUpdate.getResultCode() + "  msg:" + baseResponseUpdate.getMsg());
        return baseResponseUpdate.isStatusOK() ? new BaseResponse(0, new Object[0]) : new BaseResponse(-1, baseResponseUpdate.getMsg(), new Object[0]);
    }

    public CardWrapper(BankCard bankCard, boolean z) {
        this.mPendingOrderList = new ArrayList();
        this.mIsReadSECorrectly = true;
        this.isNeedAuthor = true;
        this.bankCard = bankCard;
        this.mAid = bankCard.getAppletInstanceAid();
        this.mCardName = ".... " + bankCard.getTokenInfo().getAccountPanSuffix();
        this.isNeedAuthor = z;
    }

    public static List<CardWrapper> parse(List<SeCard> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            for (SeCard seCard : list) {
                CardWrapper cardWrapper = parse(seCard);
                if (cardWrapper.isMifare() && lxf.e(cardWrapper)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("find milock, updateContent = ");
                    sb.append(seCard.getContent() == null ? null : seCard.getContent().getStatus());
                    vqg.a(sb.toString());
                }
                arrayList.add(cardWrapper);
            }
        }
        return arrayList;
    }

    private void init(SeCard seCard) {
        this.mAid = seCard.getAid();
        this.mCardType = seCard.getId();
        this.mCardName = seCard.getName();
        this.mHasIssue = seCard.isIssued();
        vqg.d("CardWrapper init getId:" + this.mSeCard.getId() + "  getName:" + seCard.getName() + "  mHasIssue:" + this.mHasIssue);
        if (isTransit()) {
            SeCard.SeData content = this.mSeCard.getContent();
            if (content != null && this.mSeCard.isIssued()) {
                this.mCardNo = content.cardNumber;
                vqg.d("cardNo " + this.mSeCard.getAid() + "  " + content.getCardNumber() + "  " + content.balance);
                this.mCardBalance = content.balance;
                try {
                    this.mStatus = content.getStatus();
                } catch (Exception unused) {
                }
                this.mIsReadSECorrectly = true;
            }
            TransitCardDetail transitCardDetailFromJson = TransitCardDetail.fromJson(seCard.getDetail());
            this.isOwner = transitCardDetailFromJson.isOwner();
            this.mGroupName = transitCardDetailFromJson.getGroupName();
            this.mGroupType = transitCardDetailFromJson.getCardGroup();
            this.detailDescription = transitCardDetailFromJson.getDescription();
            this.mRechargeStatusDesc = transitCardDetailFromJson.getRechargeStatusDesc();
            this.mIssueStatusDesc = transitCardDetailFromJson.getIssueStatusDesc();
            this.isSupportServiceFeeRefund = transitCardDetailFromJson.isSupportServiceFeeRefund();
            this.mRechargeStatus = transitCardDetailFromJson.getRechargeStatus();
            this.mIssueStatus = transitCardDetailFromJson.getIssueStatus();
        } else if (isCloudDoor()) {
            String detail = seCard.getDetail();
            this.isDownloadable = CloudKeyCardDetail.fromJson(detail).isDownloadable();
            vqg.d("isCloudDoor detail " + detail);
        } else if (isCloudTransit()) {
            this.detailDescription = CloudTransitCardDetail.fromJson(seCard.getDetail()).getDescription();
        } else if (isMifare()) {
            String detail2 = seCard.getDetail();
            vqg.d("isMifare detail " + detail2);
            KeyCardDetail keyCardDetailFromJson = KeyCardDetail.fromJson(detail2);
            this.vsStatus = keyCardDetailFromJson.getVCStatus();
            this.isBackUp = keyCardDetailFromJson.isBackedUp();
            this.isSupportBackup = keyCardDetailFromJson.isSupportBackup();
        } else if (isCar()) {
            String detail3 = seCard.getDetail();
            if (seCard.getCategory() == CardCategory.ICCOA_DIGITAL_KEY) {
                this.digitalKeyCardDetail = ICCOADigitalKeyCardDetail.fromJson(detail3);
            } else {
                this.digitalKeyCardDetail = DigitalKeyCardDetail.fromJson(detail3);
            }
        }
        vqg.d("CardWrapper aid:" + seCard.getAid() + "  carName" + seCard.getName());
    }

    public CardWrapper parse(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.mAid = jSONObject.optString("aid");
            if (jSONObject.has("title")) {
                this.mCardName = jSONObject.optString("title");
            }
            this.mCardFace = jSONObject.optString("card_face");
            if (jSONObject.has("card_balance")) {
                this.mCardBalance = jSONObject.optInt("card_balance");
            }
            if (jSONObject.has("card_no")) {
                this.mCardNo = jSONObject.optString("card_no");
            }
            if (jSONObject.has("cardName")) {
                this.mCardType = jSONObject.optString("cardName");
            }
            this.mIsReadSECorrectly = jSONObject.optBoolean(CardInfo.KEY_READ_SE_CORRECTLY);
            this.mGroupType = jSONObject.optInt(CardInfo.KEY_CARD_GROUP, -1);
            this.mGroupName = jSONObject.optString(CardInfo.KEY_CARD_GROUP_NAME);
            this.detailDescription = jSONObject.optString("detail_description");
        }
        return this;
    }

    public CardWrapper(CardCategory cardCategory, JSONObject jSONObject) {
        this.mPendingOrderList = new ArrayList();
        this.mIsReadSECorrectly = true;
        this.isNeedAuthor = true;
        this.mCardCategory = cardCategory;
        parse(jSONObject);
    }

    public CardWrapper(CardCategory cardCategory, CardInfo cardInfo) {
        this.mPendingOrderList = new ArrayList();
        this.mIsReadSECorrectly = true;
        this.isNeedAuthor = true;
        this.mCardCategory = cardCategory;
        init(cardInfo);
    }

    public CardWrapper(SeCard seCard) {
        this.mPendingOrderList = new ArrayList();
        this.mIsReadSECorrectly = true;
        this.isNeedAuthor = true;
        this.mCardCategory = seCard.getCategory();
        this.mSeCard = seCard;
        init(seCard);
    }

    public CardWrapper(CardInfoBean cardInfoBean) {
        this.mPendingOrderList = new ArrayList();
        this.mIsReadSECorrectly = true;
        this.isNeedAuthor = true;
        this.youyouCard = cardInfoBean;
    }

    public CardWrapper(CardInfoBean cardInfoBean, Boolean bool) {
        this(cardInfoBean);
        this.isYoYoDisableCard = bool;
    }
}
