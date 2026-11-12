package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.miui.tsmclient.entity.BulletinResponseInfo;
import com.miui.tsmclient.entity.CardConfigManager;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.CardInfoManager;
import com.miui.tsmclient.entity.MifareTag;
import com.miui.tsmclient.entity.RefundInfo;
import com.miui.tsmclient.entity.ReturnCardPayAccountExtra;
import com.miui.tsmclient.entity.ReturnCardReasonResponseInfo;
import com.miui.tsmclient.entity.digitalkey.ProductList;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.net.AuthApiException;
import com.miui.tsmclient.sesdk.CardCategory;
import com.miui.tsmclient.sesdk.DigitalKeyCardDetail;
import com.miui.tsmclient.sesdk.DigitalKeyCardOperation;
import com.miui.tsmclient.sesdk.ICCOADigitalKeyCardDetail;
import com.miui.tsmclient.sesdk.KeyCardArt;
import com.miui.tsmclient.sesdk.KeyCardDetail;
import com.miui.tsmclient.sesdk.KeyCardOperation;
import com.miui.tsmclient.sesdk.MiPayService;
import com.miui.tsmclient.sesdk.OrderData;
import com.miui.tsmclient.sesdk.SDKConstants;
import com.miui.tsmclient.sesdk.SeCard;
import com.miui.tsmclient.sesdk.ServiceFeeRefundInfo;
import com.miui.tsmclient.sesdk.TransitCardOperation;
import com.miui.tsmclient.sesdk.URIUtils;
import com.miui.tsmclient.sesdk.UncompletedOrderList;
import com.miui.tsmclient.sesdk.tsmsdkcard.CloudKeyCard;
import com.miui.tsmclient.util.Constants;
import com.miui.tsmclient.util.NetworkUtil;
import com.service.mi.BankCard;
import com.service.mi.wallet.entity.AuthenticationMethod;
import com.service.mi.wallet.entity.resp.CardListResp;
import com.service.mi.wallet.entity.resp.DigitizeResp;
import com.tsmclient.smartcard.Coder;
import com.tsmclient.smartcard.terminal.IScTerminal;
import com.tsmclient.smartcard.terminal.response.ScResponse;
import com.xiaomi.digitalkey.wearable.utils.Logger;
import com.xiaomi.fitness.account.token.TokenManager;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.login.utils.RegionUtil;
import com.xiaomi.fitness.medal.export.MedalManager;
import com.xiaomi.fitness.medal.export.MedalManagerExtKt;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.di.NfcEventModule;
import com.xiaomi.fitness.nfc.exception.MasterCardExpiredException;
import com.xiaomi.fitness.nfc.exception.NfcException;
import com.xiaomi.fitness.nfc.issuer.IssuerResult;
import com.xiaomi.fitness.nfc.sdk.ChannelImpl;
import com.xiaomi.fitness.nfc.sdk.CustomerChannelImpl;
import com.xiaomi.fitness.nfc.sdk.DeviceInfoImpl;
import com.xiaomi.fitness.nfc.sdk.MiOAuthImpl;
import com.xiaomi.fitness.nfc.sp.NfcPreference;
import com.xiaomi.fitness.nfc.utils.NfcUtils;
import com.xiaomi.fitness.nfc.widget.IssuedTransCardDetailOptionView;
import dagger.hilt.android.EntryPointAccessors;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class s3q {
    public static s3q e = null;
    public static int f = 8;
    public static int g = 9;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MiPayService f33250a = new MiPayService();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TokenManager f33251b = ((c) EntryPointAccessors.fromApplication(AppUtil.getApp(), c.class)).getTokenManager();
    public UserInfoManager c = ((c) EntryPointAccessors.fromApplication(AppUtil.getApp(), c.class)).getUserInfoManager();
    public jz6 d;

    public class a implements Callable<BaseResponse> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f33252a;

        public a(boolean z) {
            this.f33252a = z;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BaseResponse call() throws Exception {
            vqg.d("syncEse pre");
            if (!this.f33252a) {
                BaseResponse baseResponseInvoke = s3q.this.f33250a.invoke("SYNC", null);
                vqg.d("syncEse end code:" + baseResponseInvoke.mResultCode + "   msg:" + baseResponseInvoke.mMsg);
                return baseResponseInvoke;
            }
            com.service.mi.entity.BaseResponse baseResponseB = new rvf().b();
            vqg.d("checkUserBind code:" + baseResponseB.getResultCode() + "  msg:" + baseResponseB.getMsg());
            if (!baseResponseB.isStatusOK()) {
                return new BaseResponse(-1, new Object[0]);
            }
            com.service.mi.entity.BaseResponse baseResponseP = new rvf().p();
            vqg.d("syncEse master end code:" + baseResponseP.getResultCode() + "   msg:" + baseResponseP.getMsg());
            return baseResponseP.isStatusOK() ? new BaseResponse(0, new Object[0]) : new BaseResponse(-1, new Object[0]);
        }
    }

    public class b implements bg4<BaseResponse> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CardWrapper f33254a;

        public b(CardWrapper cardWrapper) {
            this.f33254a = cardWrapper;
        }

        @Override // defpackage.bg4
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(BaseResponse baseResponse) throws Exception {
            if (baseResponse == null || !baseResponse.isSuccess()) {
                return;
            }
            ltg ltgVarC = ltg.c();
            CardWrapper cardWrapper = this.f33254a;
            ltgVarC.m(cardWrapper.mAid, cardWrapper.mCardBalance);
        }
    }

    public interface c {
        TokenManager getTokenManager();

        UserInfoManager getUserInfoManager();
    }

    public static /* synthetic */ BaseResponse B0(CardWrapper cardWrapper, String str, String str2) throws Exception {
        if (cardWrapper.bankCard == null) {
            BaseResponse baseResponseActivate = cardWrapper.activate(str);
            vqg.d("activate end code:" + baseResponseActivate.mResultCode + "   msg:" + baseResponseActivate.mMsg);
            return baseResponseActivate;
        }
        BaseResponse baseResponse = new BaseResponse();
        com.service.mi.entity.BaseResponse baseResponseActivate2 = cardWrapper.bankCard.activate(str, str2);
        vqg.d("activate end code:" + baseResponseActivate2.getResultCode() + "   msg:" + baseResponseActivate2.getMsg());
        if (!baseResponseActivate2.isStatusOK()) {
            baseResponse.mResultCode = -1;
            if (cardWrapper.bankCard.getCardType() == 2) {
                throw new MasterCardExpiredException(NfcUtils.getVisaErrorMsg("visaActivate", baseResponseActivate2.getResultCode(), baseResponseActivate2.getSpErrors()));
            }
            baseResponse.mMsg = NfcUtils.getMasterErrorMsg(baseResponseActivate2.getResultCode(), baseResponseActivate2.getSpErrors());
            return baseResponse;
        }
        baseResponse.mResultCode = 0;
        com.service.mi.entity.BaseResponse baseResponseF = new rvf().f();
        if (!baseResponseF.isStatusOK()) {
            return baseResponse;
        }
        List<BankCard> cardList = ((CardListResp) baseResponseF.getData()).getCardList();
        ArrayList arrayList = new ArrayList();
        if (cardList != null) {
            for (BankCard bankCard : cardList) {
                CardWrapper cardWrapper2 = new CardWrapper(bankCard);
                cardWrapper2.type = 4;
                arrayList.add(cardWrapper2);
                if (Objects.equals(bankCard.getAppletInstanceAid(), cardWrapper.bankCard.getAppletInstanceAid())) {
                    cardWrapper.bankCard = bankCard;
                    cardWrapper.type = 4;
                }
            }
        }
        zl3.g().j.clear();
        zl3.g().j.addAll(arrayList);
        zl3.g().q();
        return baseResponse;
    }

    public static /* synthetic */ void C0(Callable callable, v4h v4hVar) throws Exception {
        try {
            Object objCall = callable.call();
            if (objCall == null) {
                throw new NfcException(AppUtil.getApp().getString(o0j.t2));
            }
            v4hVar.onNext(objCall);
            v4hVar.onComplete();
        } catch (Exception e2) {
            if (v4hVar.isDisposed()) {
                vqg.c("already Disposed", e2);
            } else {
                v4hVar.onError(e2);
            }
        }
    }

    public static /* synthetic */ void D0(Throwable th) throws Exception {
        String strC;
        if (th instanceof AuthApiException) {
            StringBuilder sb = new StringBuilder();
            AuthApiException authApiException = (AuthApiException) th;
            sb.append(authApiException.mErrorCode);
            sb.append(", ");
            sb.append(authApiException.mErrorMsg);
            strC = sb.toString();
        } else {
            strC = gmg.c(th);
        }
        th.printStackTrace();
        vqg.c(strC, th);
    }

    public static /* synthetic */ BaseResponse E0(CardWrapper cardWrapper, String str) throws Exception {
        cardWrapper.mSeCard.setCardName(str);
        return cardWrapper.updateContent();
    }

    public static /* synthetic */ OrderData.Order G0(String str, OrderData.Fee fee, CardWrapper cardWrapper, OrderData.Coupon coupon) throws Exception {
        vqg.d("createOrder pre payChannel:" + str + "  totalPay:" + fee.getTotalPay() + " cardName:" + cardWrapper.mCardName);
        return cardWrapper.createOrder(str, fee, coupon);
    }

    public static /* synthetic */ BaseResponse H0(CardWrapper cardWrapper) throws Exception {
        if (cardWrapper.isMaster()) {
            com.service.mi.entity.BaseResponse baseResponseDelete = cardWrapper.bankCard.delete();
            vqg.d("bankCard.delete() code:" + baseResponseDelete.getResultCode() + "  msg:" + baseResponseDelete.getMsg());
            if (baseResponseDelete.isStatusOK()) {
                return new rvf().p().isStatusOK() ? new BaseResponse(0, baseResponseDelete.getMsg(), new Object[0]) : new BaseResponse(-1, new Object[0]);
            }
            return new BaseResponse(-1, NfcUtils.getBankCardDeleteErrorMsg(baseResponseDelete.getResultCode()), new Object[0]);
        }
        BaseResponse baseResponseDelete2 = cardWrapper.delete();
        vqg.d("deleteCard end carName:" + cardWrapper.mCardName + "  code:" + baseResponseDelete2.mResultCode + "  msg:" + baseResponseDelete2.mMsg);
        return baseResponseDelete2;
    }

    public static <T> o4h<T> K(final Callable<T> callable) {
        return o4h.f(new j5h() { // from class: o3q
            @Override // defpackage.j5h
            public final void subscribe(v4h v4hVar) throws Exception {
                s3q.C0(callable, v4hVar);
            }
        }).Z(10L, TimeUnit.MINUTES).S(tyo.c).H(ua1.c()).k(new bg4() { // from class: p3q
            @Override // defpackage.bg4
            public final void accept(Object obj) throws Exception {
                s3q.D0((Throwable) obj);
            }
        });
    }

    public static /* synthetic */ String K0() throws Exception {
        vqg.d("getDefaultCard sta");
        return ltg.c().b();
    }

    public static /* synthetic */ OrderData.OrderRecordDetail L0(CardWrapper cardWrapper, String str) throws Exception {
        OrderData.OrderRecord next;
        Iterator<OrderData.OrderRecord> it = cardWrapper.mSeCard.getOrderData().getOrderRecordList().getList().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (str.equalsIgnoreCase(next.getOrderId())) {
                return next.getDetail();
            }
        }
        next = null;
        return next.getDetail();
    }

    public static /* synthetic */ List M0(CardWrapper cardWrapper) throws Exception {
        vqg.d("updateCard sta:" + cardWrapper.mCardName);
        List<OrderData.OrderRecord> list = cardWrapper.mSeCard.getOrderData().getOrderRecordList().getList();
        vqg.d("getOrderRecordList list size = " + list.size());
        return list;
    }

    public static /* synthetic */ List N0(CardWrapper cardWrapper) throws Exception {
        vqg.d("getReturnReasons start " + cardWrapper.getName());
        BaseResponse baseResponseQueryReturnCardReason = new TransitCardOperation(cardWrapper.mSeCard).queryReturnCardReason();
        vqg.d("getReturnReasons end code:" + baseResponseQueryReturnCardReason.mResultCode + "  msg:" + baseResponseQueryReturnCardReason.mMsg);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new stk(AppUtil.getApp().getString(o0j.j6), "all"));
        if (baseResponseQueryReturnCardReason.isSuccess()) {
            Object obj = baseResponseQueryReturnCardReason.mDatas[0];
            if (obj instanceof ReturnCardReasonResponseInfo) {
                List<ReturnCardReasonResponseInfo.ReturnCardReasonInfo> returnCardReasonInfoList = ((ReturnCardReasonResponseInfo) obj).getReturnCardReasonInfoList();
                for (int i = 0; returnCardReasonInfoList != null && i < returnCardReasonInfoList.size(); i++) {
                    ReturnCardReasonResponseInfo.ReturnCardReasonInfo returnCardReasonInfo = returnCardReasonInfoList.get(i);
                    arrayList.add(new stk(returnCardReasonInfo.getDesc(), returnCardReasonInfo.getCode()));
                }
            }
        }
        return arrayList;
    }

    public static /* synthetic */ IssuerResult P0(BankCard bankCard, boolean z, Map map, Map map2) throws Exception {
        com.service.mi.entity.BaseResponse baseResponseIssue;
        vqg.d("issue pre master");
        if (!NetworkUtil.isConnected(AppUtil.getApp())) {
            throw new NfcException(AppUtil.getApp().getString(o0j.common_hint_network_unavailable));
        }
        if (z) {
            bankCard = new BankCard();
            vqg.a("real prepare bankCard map:" + h4b.c(map2));
            com.service.mi.entity.BaseResponse baseResponsePrepare = bankCard.prepare(map2);
            vqg.d("prepare end code:" + baseResponsePrepare.getResultCode() + " msg:" + baseResponsePrepare.getMsg());
            if (baseResponsePrepare.isStatusOK()) {
                vqg.d("real issue master bankCard map:" + h4b.c(map));
                baseResponseIssue = bankCard.issue(map);
                vqg.d("issue end code:" + baseResponseIssue.getResultCode() + " msg:" + baseResponseIssue.getMsg());
            } else {
                baseResponseIssue = null;
            }
        } else {
            vqg.a("real issue master preparedBankCard map:" + h4b.c(map));
            baseResponseIssue = bankCard.issue(map);
            vqg.d("issue end preparedBankCard code:" + baseResponseIssue.getResultCode() + " msg:" + baseResponseIssue.getMsg());
        }
        if (baseResponseIssue == null || !baseResponseIssue.isStatusOK()) {
            return new IssuerResult(bankCard.getCardType(), baseResponseIssue, new ArrayList());
        }
        DigitizeResp digitizeResp = (DigitizeResp) baseResponseIssue.getData();
        com.service.mi.entity.BaseResponse baseResponseUpdate = bankCard.update();
        List<AuthenticationMethod> arrayList = new ArrayList<>();
        if (digitizeResp.getAuthenticationMethods() != null && !digitizeResp.getAuthenticationMethods().isEmpty()) {
            arrayList = digitizeResp.getAuthenticationMethods();
        }
        IssuerResult issuerResult = new IssuerResult(bankCard.getCardType(), baseResponseIssue, arrayList);
        if (!baseResponseUpdate.isStatusOK()) {
            return issuerResult;
        }
        zl3.g().l(new CardWrapper(bankCard, digitizeResp.isNeedAdditionalAuth()));
        return issuerResult;
    }

    public static /* synthetic */ BaseResponse U0(CardWrapper cardWrapper, String str) throws Exception {
        BaseResponse baseResponseRecharge = null;
        for (int i = 0; i < 3 && (baseResponseRecharge == null || !baseResponseRecharge.isSuccess()); i++) {
            if (i > 0) {
                Thread.sleep(3000L);
            }
            if (!DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).isConnected()) {
                throw new NfcException(AppUtil.getApp().getString(o0j.q2));
            }
            vqg.d("recharge " + i + ", balance = " + cardWrapper.mCardBalance);
            baseResponseRecharge = cardWrapper.recharge(str);
            vqg.d("recharge " + i + ", balance = " + cardWrapper.mCardBalance + " mResultCode:" + baseResponseRecharge.mResultCode + " msg:" + baseResponseRecharge.mMsg);
        }
        return baseResponseRecharge;
    }

    public static /* synthetic */ RefundInfo V0(OrderData.OrderRecordDetail orderRecordDetail) throws Exception {
        vqg.d("refund pre");
        RefundInfo refundInfoRefund = orderRecordDetail.refund();
        if (refundInfoRefund != null) {
            vqg.d("refund end code:" + refundInfoRefund.getResponseCode() + "  msg:" + refundInfoRefund.getResponseDesc());
        } else {
            vqg.d("refund end");
        }
        return refundInfoRefund;
    }

    public static /* synthetic */ com.service.mi.entity.BaseResponse W0(AuthenticationMethod authenticationMethod, CardWrapper cardWrapper) throws Exception {
        if (authenticationMethod == null) {
            BaseResponse baseResponseRequestAuthCode = cardWrapper.requestAuthCode();
            com.service.mi.entity.BaseResponse baseResponse = new com.service.mi.entity.BaseResponse(baseResponseRequestAuthCode.mResultCode + "", baseResponseRequestAuthCode.mMsg, "");
            vqg.d("requestAuthCode code:" + baseResponseRequestAuthCode.mResultCode + "  msg:" + baseResponseRequestAuthCode.mMsg);
            return baseResponse;
        }
        com.service.mi.entity.BaseResponse baseResponseRequestActivationCode = cardWrapper.bankCard.requestActivationCode(authenticationMethod);
        vqg.d("requestActivationCode code:" + baseResponseRequestActivationCode.getResultCode() + "  msg:" + baseResponseRequestActivationCode.getMsg());
        if (baseResponseRequestActivationCode.isStatusOK()) {
            return baseResponseRequestActivationCode;
        }
        if (cardWrapper.bankCard.getCardType() == 2) {
            throw new MasterCardExpiredException(NfcUtils.getVisaErrorMsg("submitStepUpMethod", baseResponseRequestActivationCode.getResultCode(), baseResponseRequestActivationCode.getSpErrors()));
        }
        if (!"2000".equals(baseResponseRequestActivationCode.getResultCode()) || baseResponseRequestActivationCode.getSpErrors().isEmpty()) {
            return baseResponseRequestActivationCode;
        }
        if ("EXPIRED_CODE".equals(baseResponseRequestActivationCode.getSpErrors().get(0).getReasonCode())) {
            throw new MasterCardExpiredException(AppUtil.getApp().getString(o0j.m4));
        }
        throw new NfcException(NfcUtils.getMasterErrorMsg(baseResponseRequestActivationCode.getResultCode(), baseResponseRequestActivationCode.getSpErrors()));
    }

    public static /* synthetic */ BaseResponse X0(CardWrapper cardWrapper, String str, String str2) throws Exception {
        vqg.d("returnCard pre name:" + cardWrapper.getName());
        cardWrapper.mSeCard.addExtras(new ReturnCardPayAccountExtra(str, str2).toBundle());
        BaseResponse baseResponseReturnCard = cardWrapper.mSeCard.returnCard(null);
        vqg.d("returnCard end code:" + baseResponseReturnCard.mResultCode + "  msg:" + baseResponseReturnCard.mMsg);
        if (baseResponseReturnCard.isSuccess()) {
            ltg.c().r(cardWrapper);
        }
        return baseResponseReturnCard;
    }

    public static /* synthetic */ BaseResponse Y0(CardWrapper cardWrapper, String str, String str2, String str3) throws Exception {
        vqg.d("returnCard pre name:" + cardWrapper.getName());
        cardWrapper.mSeCard.addExtras(new ReturnCardPayAccountExtra(str, str2, str3).toBundle());
        BaseResponse baseResponseReturnCard = cardWrapper.mSeCard.returnCard(null);
        vqg.d("returnCard end code:" + baseResponseReturnCard.mResultCode + "  msg:" + baseResponseReturnCard.mMsg);
        if (baseResponseReturnCard.isSuccess()) {
            ltg.c().r(cardWrapper);
        }
        return baseResponseReturnCard;
    }

    public static /* synthetic */ ServiceFeeRefundInfo Z0(CardWrapper cardWrapper) throws Exception {
        BaseResponse baseResponseReturnCard = cardWrapper.returnCard(null);
        vqg.d("returnCard end code:" + baseResponseReturnCard.mResultCode + "   msg:" + baseResponseReturnCard.mMsg);
        if (!baseResponseReturnCard.isSuccess()) {
            throw new NfcException(baseResponseReturnCard.mMsg);
        }
        TransitCardOperation transitCardOperation = new TransitCardOperation(cardWrapper.mSeCard);
        if (!baseResponseReturnCard.isSuccess()) {
            throw new NfcException(baseResponseReturnCard.mMsg);
        }
        BaseResponse baseResponseQueryServiceFeeRefundStatus = transitCardOperation.queryServiceFeeRefundStatus();
        vqg.d("returnCard code end code:" + baseResponseQueryServiceFeeRefundStatus.mResultCode + "   msg:" + baseResponseQueryServiceFeeRefundStatus.mMsg);
        if (baseResponseQueryServiceFeeRefundStatus.isSuccess()) {
            return (ServiceFeeRefundInfo) baseResponseQueryServiceFeeRefundStatus.mDatas[0];
        }
        throw new NfcException(baseResponseQueryServiceFeeRefundStatus.mMsg);
    }

    public static /* synthetic */ String a1(CardWrapper cardWrapper) throws Exception {
        TransitCardOperation transitCardOperation = new TransitCardOperation(cardWrapper.mSeCard);
        BaseResponse baseResponseRefundServiceFee = transitCardOperation.refundServiceFee();
        vqg.d("returnServiceFee end code:" + baseResponseRefundServiceFee.mResultCode + "   msg:" + baseResponseRefundServiceFee.mMsg);
        if (!baseResponseRefundServiceFee.isSuccess()) {
            throw new NfcException(baseResponseRefundServiceFee.mMsg);
        }
        BaseResponse baseResponseQueryServiceFeeRefundStatus = transitCardOperation.queryServiceFeeRefundStatus();
        vqg.d("serviceFeeRefundInfo end code:" + baseResponseQueryServiceFeeRefundStatus.mResultCode + "   msg:" + baseResponseQueryServiceFeeRefundStatus.mMsg);
        if (!baseResponseQueryServiceFeeRefundStatus.isSuccess()) {
            throw new NfcException(baseResponseQueryServiceFeeRefundStatus.mMsg);
        }
        ServiceFeeRefundInfo serviceFeeRefundInfo = (ServiceFeeRefundInfo) baseResponseQueryServiceFeeRefundStatus.mDatas[0];
        if (serviceFeeRefundInfo.getStatus() == 1 || serviceFeeRefundInfo.getStatus() == 0) {
            return serviceFeeRefundInfo.getRefundTicket();
        }
        throw new NfcException(serviceFeeRefundInfo.getRefundDesc());
    }

    public static /* synthetic */ Boolean b1(CardWrapper cardWrapper) throws Exception {
        vqg.d("setDefaultCard sta cardInfo.mCardName");
        boolean zQ = ltg.c().q(cardWrapper);
        vqg.d("setDefaultCard end cardInfo.mCardName isSuccess:" + zQ);
        return Boolean.valueOf(zQ);
    }

    public static /* synthetic */ void d1(boolean z, WearableDeviceModel wearableDeviceModel, Pair pair) throws Exception {
        if (((Boolean) pair.first).booleanValue()) {
            List<CardWrapper> list = (List) pair.second;
            NfcEventModule.INSTANCE.updateCardNumber(list.size());
            if (z) {
                ltg.c().o(true, list);
            } else {
                ltg.c().o(((Boolean) pair.first).booleanValue(), list);
            }
            vqg.d("background sync save true");
            NfcPreference.setInitSync(wearableDeviceModel.getDid(), true);
        }
    }

    public static s3q f0() {
        if (e == null) {
            e = new s3q();
        }
        return e;
    }

    public static /* synthetic */ BaseResponse f1(CardWrapper cardWrapper) throws Exception {
        vqg.d("transferOut pre name:" + cardWrapper.getName());
        BaseResponse baseResponseTransferOut = cardWrapper.transferOut();
        vqg.d("transferOut end code:" + baseResponseTransferOut.mResultCode + "  msg:" + baseResponseTransferOut.mMsg);
        return baseResponseTransferOut;
    }

    public o4h<BaseResponse> A0(final String str, final boolean z, final String str2) {
        return K(new Callable() { // from class: h3q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f19659a.R0(z, str, str2);
            }
        });
    }

    public BaseResponse A1(CardWrapper cardWrapper, KeyCardArt.Art art) throws Exception {
        BaseResponse art2 = new KeyCardArt(cardWrapper.mSeCard).setArt(art);
        vqg.d("updateCardArtSync after code:" + art2.mResultCode + " msg:" + art2.mMsg);
        return art2;
    }

    public o4h<CardWrapper> B1(final CardWrapper cardWrapper) {
        return K(new Callable() { // from class: s2q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f33220a.h1(cardWrapper);
            }
        });
    }

    public final /* synthetic */ BaseResponse F0(CardWrapper cardWrapper, String str, KeyCardArt.Art art) throws Exception {
        cardWrapper.mSeCard.setCardName(str);
        BaseResponse baseResponseUpdateContent = cardWrapper.updateContent();
        vqg.d("changeNameAndCardFace updateContent code:" + baseResponseUpdateContent.mResultCode + "  msg:" + baseResponseUpdateContent.mMsg);
        if (!baseResponseUpdateContent.isSuccess()) {
            return baseResponseUpdateContent;
        }
        vqg.d("changeNameAndCardFace updateContent code:" + baseResponseUpdateContent.mResultCode + "  msg:" + baseResponseUpdateContent.mMsg);
        if (art != null) {
            BaseResponse baseResponseA1 = A1(cardWrapper, art);
            vqg.d("changeNameAndCardFace updateCardArtSync code:" + baseResponseA1.mResultCode + "  msg:" + baseResponseA1.mMsg);
            if (!baseResponseA1.isSuccess()) {
                throw new NfcException(AppUtil.getApp().getString(o0j.common_hint_unkonwn_error));
            }
        }
        if (baseResponseUpdateContent.isSuccess()) {
            return baseResponseUpdateContent;
        }
        throw new NfcException(baseResponseUpdateContent.mMsg);
    }

    public o4h<BaseResponse> I(final CardWrapper cardWrapper, final String str, final String str2) {
        vqg.d("activate pre");
        return K(new Callable() { // from class: u2q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return s3q.B0(cardWrapper, str, str2);
            }
        });
    }

    public final void J(CardWrapper cardWrapper) {
        if (cardWrapper == null || !gzp.c(cardWrapper)) {
            return;
        }
        IScTerminal terminal = new CardInfo(CardInfo.CARD_TYPE_DUMMY).getTerminal();
        boolean z = true;
        try {
            terminal.open();
            terminal.transmit(Coder.hexStringToBytes("00A4040010A00000063201010510009156000014A1"));
            ScResponse scResponseTransmit = terminal.transmit(Coder.hexStringToBytes("00B0950008"));
            terminal.close();
            if (scResponseTransmit != null && scResponseTransmit.toBytes() != null && scResponseTransmit.toBytes().length == 10 && "9000".equals(Coder.bytesToHexString(scResponseTransmit.getStatus().toBytes())) && !"01011000FFFFFFFF9000".equals(Coder.bytesToHexString(scResponseTransmit.toBytes()))) {
                z = false;
            }
        } catch (Exception unused) {
            terminal.close();
        } finally {
            terminal.close();
            IssuedTransCardDetailOptionView.t = true;
        }
    }

    public final /* synthetic */ String J0() throws Exception {
        vqg.d("getCplc sta");
        return b0();
    }

    public o4h<BaseResponse> L(final CardWrapper cardWrapper, final String str) {
        return K(new Callable() { // from class: t2q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return s3q.E0(cardWrapper, str);
            }
        });
    }

    public o4h<BaseResponse> M(final CardWrapper cardWrapper, final String str, final KeyCardArt.Art art) {
        return K(new Callable() { // from class: l2q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f24577a.F0(cardWrapper, str, art);
            }
        });
    }

    public void N() {
        vqg.d("TsmApiManager clearData pre");
        jz6 jz6Var = this.d;
        if (jz6Var != null && !jz6Var.isDisposed()) {
            this.d.dispose();
        }
        tyo.g();
        zl3.g().a();
        ssg.u().s();
        DeviceInfoImpl.clear();
        bmg.a();
    }

    public BankCard O(String str) {
        return rvf.e(str);
    }

    public final /* synthetic */ String O0() throws Exception {
        vqg.d("getSeId sta");
        return m0();
    }

    public o4h<OrderData.Order> P(final String str, final OrderData.Fee fee, final OrderData.Coupon coupon, final CardWrapper cardWrapper) {
        return K(new Callable() { // from class: w2q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return s3q.G0(str, fee, cardWrapper, coupon);
            }
        });
    }

    public o4h<BaseResponse> Q(final CardWrapper cardWrapper) {
        vqg.d("deleteCard pre cardInfo.mCardName");
        return K(new Callable() { // from class: r3q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return s3q.H0(cardWrapper);
            }
        });
    }

    public final /* synthetic */ BaseResponse Q0(int i, String str, String str2, CardWrapper cardWrapper, Bundle bundle) throws Exception {
        Object[] objArr;
        vqg.d("issue pre ");
        BaseResponse baseResponseIssue = null;
        for (int i2 = 0; i2 < i && (baseResponseIssue == null || !baseResponseIssue.isSuccess()); i2++) {
            if (i2 > 0) {
                Thread.sleep(3000L);
            }
            if (!NetworkUtil.isConnected(AppUtil.getApp())) {
                throw new NfcException(AppUtil.getApp().getString(o0j.common_hint_network_unavailable));
            }
            if (!TextUtils.isEmpty(str)) {
                vqg.d("issue invoke");
                BaseResponse baseResponseInvoke = this.f33250a.invoke("SYNC", null);
                vqg.d("TsmApiManager syncEse code:" + baseResponseInvoke.mResultCode + "   msg:" + baseResponseInvoke.mMsg);
                baseResponseIssue = this.f33250a.invoke("DOOR_CARD_ENROLL", str);
                if (baseResponseIssue.isSuccess() && (objArr = baseResponseIssue.mDatas) != null && objArr.length > 0) {
                    Object obj = objArr[0];
                    vqg.d("issue invoke result length > 0 " + obj.toString());
                    if (obj instanceof String) {
                        zl3.g().l(g0((String) obj, false));
                    }
                }
            } else if (str2 != null) {
                vqg.d("issue token is not null");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(Constants.EXTRA_MIFARE_DOOR_CARD_ISSUER_TOKEN, str2);
                baseResponseIssue = cardWrapper.issue(jSONObject.toString());
                if (baseResponseIssue.isSuccess()) {
                    vqg.d("issue token success aid:" + cardWrapper.mSeCard.getAid() + " name:" + cardWrapper.mSeCard.getName());
                    cardWrapper.mAid = cardWrapper.mSeCard.getAid();
                    zl3.g().l(cardWrapper);
                    X();
                }
            } else if (cardWrapper.mSeCard != null) {
                vqg.d("issue normal");
                baseResponseIssue = cardWrapper.issue(null);
                if (baseResponseIssue.isSuccess() && cardWrapper.isCloudDoor()) {
                    zl3.g().l(f0().W(cardWrapper.mSeCard.getId()));
                }
            } else {
                vqg.d("issue CardInfoManager");
                baseResponseIssue = CardInfoManager.getInstance(AppUtil.getApp()).issue(cardWrapper.mCardInfo, bundle);
                vqg.d("issue CardInfoManager end code:" + baseResponseIssue.mResultCode + " msg:" + baseResponseIssue.mMsg);
                String str3 = cardWrapper.mCardInfo.mAid;
                StringBuilder sb = new StringBuilder();
                sb.append("issue CardInfoManager aid:");
                sb.append(str3);
                vqg.d(sb.toString());
                if (str3 != null) {
                    zl3.g().l(g0(str3, false));
                }
            }
            vqg.d("issue end code:" + baseResponseIssue.mResultCode + " msg:" + baseResponseIssue.mMsg);
        }
        return baseResponseIssue;
    }

    public o4h<CardWrapper> R(final String str) {
        return K(new Callable() { // from class: n3q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f27517a.I0(str);
            }
        });
    }

    public final /* synthetic */ BaseResponse R0(boolean z, String str, String str2) throws Exception {
        vqg.d("issueCar pre isNeedConfirm:" + z + " shareUrl:" + str);
        int i = 1;
        Logger.setDebug(true);
        SeCard seCardN0 = n0();
        if ("ICCOA".equals(str2)) {
            seCardN0 = o0(CardCategory.ICCOA_DIGITAL_KEY);
        } else {
            i = 8;
        }
        if (seCardN0 == null) {
            throw new NfcException(AppUtil.getApp().getString(o0j.common_hint_unkonwn_error));
        }
        DigitalKeyCardOperation digitalKeyCardOperation = new DigitalKeyCardOperation(seCardN0);
        if (z && seCardN0.getCategory() == CardCategory.DIGITAL_KEY) {
            HashMap map = new HashMap();
            map.put(SDKConstants.KEY_SHARE_URL, str);
            BaseResponse baseResponseConfirmDigitalKeySharing = digitalKeyCardOperation.confirmDigitalKeySharing(map);
            vqg.d("confirmCarShare code:" + baseResponseConfirmDigitalKeySharing.mResultCode + "  msg:" + baseResponseConfirmDigitalKeySharing.mMsg);
            if (!baseResponseConfirmDigitalKeySharing.isSuccess() && baseResponseConfirmDigitalKeySharing.mResultCode != 22013) {
                return baseResponseConfirmDigitalKeySharing;
            }
        }
        String mailboxID = URIUtils.getMailboxID(str);
        vqg.d("mailboxId:" + mailboxID + "  shareUrl:" + str);
        BaseResponse baseResponseImportEndpointData = null;
        for (int i2 = 0; i2 < i; i2++) {
            Thread.sleep(15000L);
            baseResponseImportEndpointData = ProductList.ProductInfo.CCC_TYPE.equals(str2) ? digitalKeyCardOperation.importEndpointData(mailboxID) : seCardN0.issue(URIUtils.getICCOAIssueParams(str));
            vqg.d("issueCar end code:" + baseResponseImportEndpointData.mResultCode + " msg:" + baseResponseImportEndpointData.mMsg + " retb ryCount:" + i2);
            if (baseResponseImportEndpointData.isSuccess()) {
                vqg.d("issueCar end id:" + seCardN0.getId() + "  aid:" + seCardN0.getAid());
                if (seCardN0.getId() != null) {
                    ltg.c().j(CardWrapper.parse(seCardN0));
                } else {
                    List<CardWrapper> listX = X();
                    vqg.d("issueCar end isEmpty:" + listX.isEmpty());
                    if (!listX.isEmpty()) {
                        ltg.c().o(false, listX);
                    }
                }
                return baseResponseImportEndpointData;
            }
        }
        return baseResponseImportEndpointData;
    }

    public SeCard S(String str) throws AuthApiException {
        vqg.d("getSupportDoorByProductId pre");
        List<SeCard> supportedCardList = this.f33250a.getSupportedCardList(CardCategory.DOOR);
        vqg.d("getSupportDoorByProductId end:" + supportedCardList.size());
        for (SeCard seCard : supportedCardList) {
            if (str.equals(seCard.getId())) {
                vqg.d("getSupportDoorByProductId end find");
                return seCard;
            }
        }
        vqg.d("getSupportDoorByProductId end not find productId:" + str);
        return null;
    }

    public final /* synthetic */ List S0(CardWrapper cardWrapper, String str) throws Exception {
        BaseResponse bulletinList = cardWrapper == null ? this.f33250a.getBulletinList(null, str) : this.f33250a.getBulletinList(cardWrapper.mSeCard, str);
        vqg.d("TsmManager loadBulletinList,tag = " + str + ",code = " + bulletinList.mResultCode + ",msg = " + bulletinList.mMsg);
        return bulletinList.isSuccess() ? (List) bulletinList.mDatas[0] : Collections.emptyList();
    }

    public CardWrapper T(String str, CardCategory cardCategory) throws AuthApiException {
        vqg.d("findSecardByAidAndCategorySync pre");
        List<SeCard> issuedCardList = this.f33250a.getIssuedCardList(cardCategory);
        vqg.d("findSecardByAidAndCategorySync end:" + issuedCardList.size());
        for (SeCard seCard : issuedCardList) {
            if (str.equals(seCard.getAid())) {
                vqg.d("findSecardByAidAndCategorySync end find");
                return CardWrapper.parse(seCard);
            }
        }
        vqg.d("findSecardByAidAndCategorySync end not find aid:" + str + " cardCategory:" + cardCategory);
        return null;
    }

    public final /* synthetic */ Boolean T0(CardWrapper cardWrapper) throws Exception {
        ArrayList arrayList = new ArrayList();
        arrayList.add(cardWrapper.mSeCard);
        Iterator<UncompletedOrderList.UncompletedOrder> it = s0(arrayList).iterator();
        while (it.hasNext()) {
            if (cardWrapper.mSeCard.getAid().equalsIgnoreCase(it.next().getAid())) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public CardWrapper I0(String str) throws AuthApiException {
        vqg.d("getSupportDoorByProductId pre");
        List<SeCard> supportedCardList = this.f33250a.getSupportedCardList(CardCategory.DOOR);
        vqg.d("getSupportDoorByProductId end:" + supportedCardList.size());
        for (SeCard seCard : supportedCardList) {
            if (str.equals(seCard.getId())) {
                vqg.d("getSupportDoorByProductId end find");
                return CardWrapper.parse(seCard);
            }
        }
        vqg.d("getSupportDoorByProductId end not find productId:" + str);
        return null;
    }

    public CardWrapper V(String str, CardCategory cardCategory) throws AuthApiException {
        vqg.d("findSecardByProductIdAndCategorySync pre");
        List<SeCard> supportedCardList = this.f33250a.getSupportedCardList(cardCategory);
        vqg.d("findSecardByProductIdAndCategorySync end:" + supportedCardList.size());
        for (SeCard seCard : supportedCardList) {
            if (str.equals(seCard.getId())) {
                vqg.d("findSecardByProductIdAndCategorySync end find");
                return CardWrapper.parse(seCard);
            }
        }
        vqg.d("findSecardByProductIdAndCategorySync end not find productId:" + str + " cardCategory:" + cardCategory);
        return null;
    }

    public CardWrapper W(String str) throws Exception {
        vqg.d("geDoorCardByCidSync sta cid:" + str);
        for (SeCard seCard : this.f33250a.getIssuedCardList(CardCategory.DOOR)) {
            String cloudCid = KeyCardDetail.fromJson(seCard.getDetail()).getCloudCid();
            vqg.d("geDoorCardByCidSync seCard cloudCid:" + cloudCid);
            if (str.equals(cloudCid)) {
                return CardWrapper.parse(seCard);
            }
        }
        return null;
    }

    public List<CardWrapper> X() throws Exception {
        vqg.d("getCarCardListSync pre");
        ArrayList arrayList = new ArrayList();
        List<CardWrapper> list = CardWrapper.parse(this.f33250a.getIssuedCardList(CardCategory.DIGITAL_KEY));
        vqg.d("getCarCardListSync cardInfoList.size:" + list.size());
        List<CardWrapper> list2 = CardWrapper.parse(this.f33250a.getIssuedCardList(CardCategory.ICCOA_DIGITAL_KEY));
        vqg.d("getCarCardListSync iccoaCardInfoList.size:" + list2.size());
        List<CardWrapper> list3 = CardWrapper.parse(this.f33250a.getIssuedCardList(CardCategory.PROPRIETARY_CAR_KEY));
        vqg.d("getCarCardListSync outCardInfoList.size:" + list3.size());
        ArrayList arrayList2 = new ArrayList();
        for (CardWrapper cardWrapper : list2) {
            DigitalKeyCardDetail digitalKeyCardDetail = cardWrapper.digitalKeyCardDetail;
            if ((digitalKeyCardDetail instanceof ICCOADigitalKeyCardDetail) && ((ICCOADigitalKeyCardDetail) digitalKeyCardDetail).getSharingChannel() == 2) {
                arrayList2.add(cardWrapper);
            }
        }
        vqg.d("getCarCardListSync filtIccoaCardInfoList.size:" + arrayList2.size());
        arrayList.addAll(list);
        arrayList.addAll(arrayList2);
        arrayList.addAll(list3);
        zl3.g().g.clear();
        zl3.g().g.addAll(list);
        zl3.g().g.addAll(arrayList2);
        zl3.g().g.addAll(list3);
        zl3.g().n();
        return arrayList;
    }

    public CardWrapper Y(@NotNull String str) throws Exception {
        vqg.d("getCloudDoorCardByCidSync sta cid:" + str);
        for (SeCard seCard : this.f33250a.getSupportedCardList(CardCategory.CLOUD_DOOR)) {
            if (str.equals(((CloudKeyCard) seCard).getId())) {
                vqg.d("getCloudDoorCardByCidSync cid:" + str);
                return CardWrapper.parse(seCard);
            }
        }
        return null;
    }

    public List<CardWrapper> Z() throws Exception {
        List<SeCard> supportedCardList = this.f33250a.getSupportedCardList(CardCategory.CLOUD_DOOR);
        vqg.d("getCloudDoorCardListSync size:" + supportedCardList.size());
        return CardWrapper.parse(supportedCardList);
    }

    public o4h<String> a0() {
        vqg.d("getCplc pre");
        return K(new Callable() { // from class: j3q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f22389a.J0();
            }
        });
    }

    public String b0() {
        try {
            String cplc = new MiPayService().getCPLC();
            vqg.d("cplc:" + cplc);
            return cplc;
        } catch (Exception e2) {
            vqg.c("getCplcSync has error:", e2);
            return null;
        }
    }

    public o4h<String> c0() {
        vqg.d("getDefaultCard pre");
        return K(new Callable() { // from class: c3q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return s3q.K0();
            }
        });
    }

    public final /* synthetic */ Pair c1(boolean z, WearableDeviceModel wearableDeviceModel) throws Exception {
        ArrayList arrayList = new ArrayList();
        BaseResponse baseResponseX1 = x1(z);
        vqg.d("background sync TsmApiManager syncEse code:" + baseResponseX1.mResultCode + "   msg:" + baseResponseX1.mMsg);
        return new Pair(Boolean.valueOf(z ? u1(wearableDeviceModel, true, arrayList) : t1(wearableDeviceModel, true, arrayList)), arrayList);
    }

    public o4h<List<CardWrapper>> d0() {
        vqg.d("getDoorCardList pre");
        return K(new Callable() { // from class: d3q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f15056a.e0();
            }
        }).J(new z5l.a(100, 1));
    }

    public List<CardWrapper> e0() throws Exception {
        vqg.d("getDoorCardListSync pre");
        List<CardWrapper> list = CardWrapper.parse(this.f33250a.getIssuedCardList(CardCategory.DOOR));
        zl3.g().f.clear();
        zl3.g().f.addAll(list);
        zl3.g().p();
        return list;
    }

    public final CardWrapper g0(@NotNull String str, boolean z) throws Exception {
        vqg.d("getIssueCardByAidSync sta aid:" + str + "  isTransit:" + z);
        for (SeCard seCard : this.f33250a.getIssuedCardList(z ? CardCategory.TRANSIT : CardCategory.DOOR)) {
            if (str.equals(seCard.getAid())) {
                vqg.d("getIssueCardByAidSync isTransit:" + z + "  findCard aid:" + str);
                return CardWrapper.parse(seCard);
            }
        }
        return null;
    }

    public final /* synthetic */ CardWrapper g1(CardWrapper cardWrapper) throws Exception {
        int i;
        if (cardWrapper.isMaster()) {
            com.service.mi.entity.BaseResponse baseResponseUpdate = cardWrapper.bankCard.update();
            vqg.d("updateCard master end code:" + baseResponseUpdate.getResultCode() + "  msg:" + baseResponseUpdate.getMsg());
            ltg.c().p();
        } else {
            vqg.d("updateCard pre name:" + cardWrapper.mCardName);
            BaseResponse baseResponseUpdateContent = cardWrapper.updateContent();
            vqg.d("updateCard end code:" + baseResponseUpdateContent.mResultCode + "  msg:" + baseResponseUpdateContent.mMsg);
            if (cardWrapper.isIssued() && cardWrapper.isTransit() && (i = cardWrapper.mCardBalance) >= 0 && i != Integer.MAX_VALUE) {
                ltg.c().m(cardWrapper.mAid, cardWrapper.mCardBalance);
            }
            J(cardWrapper);
        }
        return cardWrapper;
    }

    public List<SeCard> h0() throws Exception {
        return this.f33250a.getIssuedCardList(CardCategory.TRANSIT);
    }

    public final /* synthetic */ CardWrapper h1(CardWrapper cardWrapper) throws Exception {
        int i;
        String aid = cardWrapper.getAid();
        vqg.d("updateCardClondTransit pre name:" + cardWrapper.mCardName + "  aid:" + aid);
        CardWrapper cardWrapperG0 = g0(aid, true);
        if (cardWrapperG0 == null) {
            vqg.d("updateCardClondTransit can't find name:" + cardWrapper.mCardName + "  aid:" + aid);
        }
        BaseResponse baseResponseUpdateContent = cardWrapperG0.updateContent();
        vqg.d("updateCardClondTransit updateCard end code:" + baseResponseUpdateContent.mResultCode + "  msg:" + baseResponseUpdateContent.mMsg);
        if (cardWrapper.isIssued() && cardWrapper.isTransit() && (i = cardWrapper.mCardBalance) >= 0 && i != Integer.MAX_VALUE) {
            ltg.c().m(cardWrapper.mAid, cardWrapper.mCardBalance);
        }
        J(cardWrapper);
        return cardWrapperG0;
    }

    public o4h<OrderData.OrderRecordDetail> i0(final CardWrapper cardWrapper, @NotNull final String str) {
        vqg.d("getOrderDetail pre");
        return K(new Callable() { // from class: q3q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return s3q.L0(cardWrapper, str);
            }
        });
    }

    public o4h<List<BulletinResponseInfo.BulletinInfo>> i1(final CardWrapper cardWrapper, final String str) {
        vqg.d("TsmManager loadBulletinList, tag = " + str);
        return K(new Callable() { // from class: m3q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f25723a.S0(cardWrapper, str);
            }
        });
    }

    public o4h<List<OrderData.OrderRecord>> j0(final CardWrapper cardWrapper) {
        vqg.d("getOrderRecordList pre");
        return K(new Callable() { // from class: g3q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return s3q.M0(cardWrapper);
            }
        });
    }

    public o4h<Boolean> j1(final CardWrapper cardWrapper) {
        return K(new Callable() { // from class: f3q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f17370a.T0(cardWrapper);
            }
        });
    }

    public o4h<List<stk>> k0(final CardWrapper cardWrapper) {
        return K(new Callable() { // from class: o2q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return s3q.N0(cardWrapper);
            }
        });
    }

    public MifareTag k1(int i) throws Exception {
        vqg.d("readMifareTag sta:" + i);
        MifareTag mifareTagG = ltg.c().g(i);
        if (mifareTagG == null) {
            throw new NfcException(AppUtil.getApp().getString(o0j.M5));
        }
        if (new KeyCardOperation(null).checkMifareIssued(mifareTagG.getUid())) {
            throw new NfcException(AppUtil.getApp().getString(o0j.I4));
        }
        return mifareTagG;
    }

    public o4h<String> l0() {
        vqg.d("getSeId pre");
        return K(new Callable() { // from class: k3q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f23402a.O0();
            }
        });
    }

    public o4h<BaseResponse> l1(final CardWrapper cardWrapper, final String str) {
        vqg.d("recharge  mCardName:" + cardWrapper.mCardName);
        return K(new Callable() { // from class: q2q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return s3q.U0(cardWrapper, str);
            }
        }).m(new b(cardWrapper));
    }

    public String m0() {
        try {
            return new MiPayService().getSEID();
        } catch (Exception e2) {
            vqg.c("getSeIdSync error:", e2);
            return null;
        }
    }

    public o4h<RefundInfo> m1(final OrderData.OrderRecordDetail orderRecordDetail) {
        return K(new Callable() { // from class: y2q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return s3q.V0(orderRecordDetail);
            }
        });
    }

    public SeCard n0() {
        return o0(CardCategory.DIGITAL_KEY);
    }

    public o4h<com.service.mi.entity.BaseResponse> n1(final CardWrapper cardWrapper, final AuthenticationMethod authenticationMethod) {
        vqg.d("requestAuthCode pre");
        return K(new Callable() { // from class: r2q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return s3q.W0(authenticationMethod, cardWrapper);
            }
        });
    }

    public SeCard o0(CardCategory cardCategory) {
        vqg.d("getCardSeCard");
        try {
            List<SeCard> supportedCardList = this.f33250a.getSupportedCardList(cardCategory);
            if (supportedCardList != null && !supportedCardList.isEmpty()) {
                return supportedCardList.get(0);
            }
            return null;
        } catch (AuthApiException e2) {
            vqg.c("getSupportCarSeCard", e2);
            return null;
        }
    }

    public o4h<ServiceFeeRefundInfo> o1(final CardWrapper cardWrapper) {
        vqg.d("returnCard pre");
        return K(new Callable() { // from class: p2q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return s3q.Z0(cardWrapper);
            }
        });
    }

    public List<SeCard> p0() throws AuthApiException {
        CardConfigManager.HciTLVRule hciTLVRule;
        List<SeCard> supportedCardList = this.f33250a.getSupportedCardList(CardCategory.TRANSIT);
        for (SeCard seCard : supportedCardList) {
            CardConfigManager.CardConfig cardConfig = CardConfigManager.getInstance().getCardConfig(seCard.getAid());
            if (cardConfig != null && (hciTLVRule = cardConfig.getHciTLVRule(seCard.getAid())) != null) {
                vqg.a(seCard.getAid() + " " + seCard.getName() + "  ~~~~~" + hciTLVRule.getHciPrefix() + "~");
            }
        }
        return supportedCardList;
    }

    public o4h<BaseResponse> p1(final CardWrapper cardWrapper, final String str, final String str2) {
        return K(new Callable() { // from class: x2q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return s3q.X0(cardWrapper, str, str2);
            }
        });
    }

    public List<CardWrapper> q0() throws Exception {
        vqg.d("getTransCardIssuedList sta");
        List<CardWrapper> list = CardWrapper.parse(h0());
        vqg.d("getTransCardIssuedList update every card");
        Iterator<CardWrapper> it = list.iterator();
        while (it.hasNext()) {
            it.next().updateContent();
        }
        if (!list.isEmpty()) {
            Map<String, CardConfigManager.CardConfig> supportedTransCardMap = CardConfigManager.getInstance().getSupportedTransCardMap(false);
            if ((supportedTransCardMap == null || supportedTransCardMap.isEmpty()) && ((supportedTransCardMap = CardConfigManager.getInstance().getSupportedTransCardMap(true)) == null || supportedTransCardMap.isEmpty())) {
                throw new IOException(AppUtil.getApp().getString(o0j.R3));
            }
            vqg.d("CardConfigManager getSupportedTransCardMap size:" + supportedTransCardMap.size());
        }
        vqg.d("getTransCardIssuedList size:" + list.size());
        zl3.g().e.clear();
        zl3.g().e.addAll(list);
        zl3.g().r();
        return list;
    }

    public o4h<BaseResponse> q1(final CardWrapper cardWrapper, final String str, final String str2, final String str3) {
        return K(new Callable() { // from class: m2q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return s3q.Y0(cardWrapper, str, str2, str3);
            }
        });
    }

    public BaseResponse r0(CardWrapper cardWrapper) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(cardWrapper.mSeCard);
        return this.f33250a.getUncompletedOrderList(arrayList);
    }

    public o4h<String> r1(final CardWrapper cardWrapper) {
        vqg.d("returnServiceFee pre");
        return K(new Callable() { // from class: k2q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return s3q.a1(cardWrapper);
            }
        });
    }

    public List<UncompletedOrderList.UncompletedOrder> s0(List<SeCard> list) {
        List<UncompletedOrderList.UncompletedOrder> list2;
        ArrayList arrayList = new ArrayList();
        BaseResponse uncompletedOrderList = this.f33250a.getUncompletedOrderList(list);
        vqg.d("getUncompletedOrderList   code:" + uncompletedOrderList.mResultCode + "  msg:" + uncompletedOrderList.mMsg);
        if (uncompletedOrderList.isSuccess() && (list2 = ((UncompletedOrderList) uncompletedOrderList.mDatas[0]).getList()) != null && !list2.isEmpty()) {
            Iterator<UncompletedOrderList.UncompletedOrder> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return arrayList;
    }

    public o4h<Boolean> s1(final CardWrapper cardWrapper) {
        vqg.d("setDefaultCard pre cardInfo.mCardName");
        return K(new Callable() { // from class: v2q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return s3q.b1(cardWrapper);
            }
        });
    }

    public void t0(WearableDeviceModel wearableDeviceModel) {
        vqg.d("DeviceInfoImpl.init");
        if (wearableDeviceModel == null) {
            vqg.b("deviceModel is null");
            return;
        }
        if (DeviceInfoImpl.init(wearableDeviceModel)) {
            vqg.d("DeviceInfoImpl.init same device not need reinit sdk");
            return;
        }
        zl3.g().k(wearableDeviceModel);
        ssg.u().v(wearableDeviceModel);
        try {
            x0(wearableDeviceModel);
        } catch (Exception e2) {
            vqg.c("initTSMSDK", e2);
        }
    }

    public final boolean t1(WearableDeviceModel wearableDeviceModel, boolean z, List<CardWrapper> list) {
        try {
            List<CardWrapper> listQ0 = q0();
            List<CardWrapper> listE0 = e0();
            if (listQ0 != null && !listQ0.isEmpty()) {
                MedalManagerExtKt.getInstance(MedalManager.INSTANCE).doMedalAssistWithSp(f);
            }
            if (listE0 != null && !listE0.isEmpty()) {
                MedalManagerExtKt.getInstance(MedalManager.INSTANCE).doMedalAssistWithSp(g);
            }
            list.addAll(X());
            list.addAll(listQ0);
            list.addAll(listE0);
        } catch (Exception e2) {
            if (e2 instanceof AuthApiException) {
                AuthApiException authApiException = (AuthApiException) e2;
                vqg.b("getBankCardListSync error code:" + authApiException.mErrorCode + "   msg:" + authApiException.mErrorMsg);
            } else {
                vqg.c("background sync", e2);
            }
            z = false;
        }
        vqg.d("background sync syncCardListChina card list end size:" + list.size());
        return z;
    }

    public void u0() {
        MiPayService.initialize(AppUtil.getApp(), "");
        int envr = NfcPreference.getEnvr();
        boolean zB = yhq.c.b();
        vqg.d("initTSM, account staging = " + envr + "， api staging = " + zB + ", index = " + envr + " app=" + AppUtil.getApp());
        if (zB) {
            MiPayService.setStagingIndex(envr);
            MiPayService.setStaging(true);
        } else if (envr == 4) {
            MiPayService.setStagingIndex(4);
        }
        MiPayService.setMiOAuth(new MiOAuthImpl(this.f33251b));
        MiPayService.setLogger(com.xiaomi.fitness.nfc.sdk.Logger.INSTANCE);
    }

    public final boolean u1(WearableDeviceModel wearableDeviceModel, boolean z, List<CardWrapper> list) {
        try {
            com.service.mi.entity.BaseResponse baseResponseF = new rvf().f();
            vqg.d("MiPayService().cardList code:" + baseResponseF.getResultCode() + "  msg:" + baseResponseF.getMsg());
            Iterator<BankCard> it = ((CardListResp) baseResponseF.getData()).getCardList().iterator();
            while (it.hasNext()) {
                list.add(new CardWrapper(it.next()));
            }
            zl3.g().j.clear();
            zl3.g().j.addAll(list);
            zl3.g().q();
        } catch (Exception e2) {
            if (e2 instanceof AuthApiException) {
                AuthApiException authApiException = (AuthApiException) e2;
                vqg.b("syncCardListOther error code:" + authApiException.mErrorCode + "   msg:" + authApiException.mErrorMsg);
            } else {
                vqg.c("background sync syncCardListOther", e2);
            }
            z = false;
        }
        vqg.d("background sync syncCardListOther card list end size:" + list.size());
        return z;
    }

    public void v0() {
        u0();
        this.f33250a.reset();
        MiPayService.setDeviceInfo(new DeviceInfoImpl());
        MiPayService.setChannel(new ChannelImpl(AppUtil.getApp()));
    }

    public void v1(final WearableDeviceModel wearableDeviceModel) {
        jz6 jz6Var = this.d;
        if (jz6Var != null && !jz6Var.isDisposed()) {
            this.d.dispose();
        }
        vqg.d("background sync card list pre");
        final boolean zIsSupportFeature = DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.MASTERCARD);
        this.d = K(new Callable() { // from class: z2q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f40819a.c1(zIsSupportFeature, wearableDeviceModel);
            }
        }).O(new bg4() { // from class: a3q
            @Override // defpackage.bg4
            public final void accept(Object obj) throws Exception {
                s3q.d1(zIsSupportFeature, wearableDeviceModel, (Pair) obj);
            }
        }, new bg4() { // from class: b3q
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                vqg.c("background sync error", (Throwable) obj);
            }
        });
    }

    public final void w0() {
        String upperCase = RegionUtil.getCurrentLocalCountry().toUpperCase();
        boolean zB = yhq.c.b();
        vqg.d("initMasterSdk isStaging:" + zB + "  countryCode:" + upperCase);
        rvf.c();
        rvf.g(AppUtil.getApp(), "", NfcUtils.getPushId(), upperCase);
        rvf.o(zB);
        rvf.l(new DeviceInfoImpl());
        rvf.n(new MiOAuthImpl(this.f33251b));
        rvf.j(new ChannelImpl(AppUtil.getApp()));
        rvf.k(new CustomerChannelImpl(AppUtil.getApp()));
        rvf.m(com.xiaomi.fitness.nfc.sdk.Logger.INSTANCE);
    }

    public o4h<BaseResponse> w1(boolean z) {
        return K(new a(z));
    }

    public final void x0(WearableDeviceModel wearableDeviceModel) {
        boolean zIsPlayChannel = AppUtil.INSTANCE.isPlayChannel();
        vqg.d("initTSMSDK pre supportMasterCard:" + zIsPlayChannel);
        if (!zIsPlayChannel) {
            v0();
        } else {
            w0();
            v0();
        }
    }

    public BaseResponse x1(boolean z) {
        vqg.d("syncEse pre");
        if (z) {
            com.service.mi.entity.BaseResponse baseResponseP = new rvf().p();
            vqg.d("syncEse master end code:" + baseResponseP.getResultCode() + "   msg:" + baseResponseP.getMsg());
            return baseResponseP.isStatusOK() ? new BaseResponse(0, new Object[0]) : new BaseResponse(-1, new Object[0]);
        }
        BaseResponse baseResponseInvoke = this.f33250a.invoke("SYNC", null);
        vqg.d("syncEse end code:" + baseResponseInvoke.mResultCode + "   msg:" + baseResponseInvoke.mMsg);
        return baseResponseInvoke;
    }

    public o4h<IssuerResult> y0(final BankCard bankCard, final Map<String, String> map, final boolean z) {
        String str = map.get("security_code");
        final HashMap map2 = new HashMap();
        map2.put("security_code", str);
        return K(new Callable() { // from class: e3q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return s3q.P0(bankCard, z, map2, map);
            }
        });
    }

    public o4h<BaseResponse> y1(final CardWrapper cardWrapper) {
        return K(new Callable() { // from class: l3q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return s3q.f1(cardWrapper);
            }
        });
    }

    public o4h<BaseResponse> z0(final CardWrapper cardWrapper, final String str, final Bundle bundle, final String str2, final int i) {
        return K(new Callable() { // from class: i3q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f20748a.Q0(i, str, str2, cardWrapper, bundle);
            }
        });
    }

    public o4h<CardWrapper> z1(final CardWrapper cardWrapper) {
        return K(new Callable() { // from class: n2q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f27491a.g1(cardWrapper);
            }
        });
    }
}
