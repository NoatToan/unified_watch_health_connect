package com.huami.wallet.datasource.cloud;

import androidx.autofill.HintConstants;
import com.huami.nfc.applet.TransEntity;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.bus.CityInfoEntity;
import com.huami.nfc.bus.NoticesEntity;
import com.huami.nfc.bus.VerifyCodeEntity;
import com.huami.nfc.bus.api.IHuamiWebApi;
import com.huami.nfc.bus.entities.CardInfoEntity;
import com.huami.nfc.bus.entities.InvoiceEntity;
import com.huami.nfc.bus.entities.OpenFeeStateEntity;
import com.huami.nfc.bus.entities.PayAuthorizationInfo;
import com.huami.nfc.bus.entities.RefundOpenFeeEntity;
import com.huami.nfc.bus.entities.RefundTicket;
import com.huami.nfc.bus.entities.RefundTicketPostBody;
import com.huami.nfc.bus.entities.ReturnCardReason;
import com.huami.nfc.web.Constant;
import com.huami.nfc.web.entity.ProtocolEntity;
import com.huami.passport.Configs;
import com.xiaomi.infra.galaxy.fds.Common;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010G\u001a\u00020\u0001¢\u0006\u0004\bH\u0010IJ\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0001J(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0001¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0001J\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0096\u0001JT\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00062\u0006\u0010\u0010\u001a\u00020\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J1\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u0019H\u0096\u0001J\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J)\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00062\u0006\u0010\u0010\u001a\u00020\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002H\u0096\u0001J\u0015\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u001c0\u0006H\u0096\u0001J\u001f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0001J\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010(\u001a\u00020\u0002H\u0096\u0001J\u001f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u0002H\u0096\u0001J\u001f\u0010-\u001a\b\u0012\u0004\u0012\u00020+0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u0002H\u0096\u0001JR\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\u001c0\u00062\u0006\u0010(\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0096\u0001¢\u0006\u0004\b1\u00102J\u001f\u00105\u001a\b\u0012\u0004\u0012\u0002040\u00062\u0006\u00103\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\u001f\u00106\u001a\b\u0012\u0004\u0012\u0002040\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00103\u001a\u00020 H\u0096\u0001J/\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00107\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u00109\u001a\u000208H\u0096\u0001J\u0015\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0\u00150\u0006H\u0096\u0001J\u001f\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u00062\u0006\u0010(\u001a\u00020\u00022\u0006\u0010>\u001a\u00020\u0002H\u0096\u0001J=\u0010B\u001a\b\u0012\u0004\u0012\u0002040\u00062\u0006\u0010(\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\f\u0010A\u001a\b\u0012\u0004\u0012\u0002000\u001cH\u0096\u0001J'\u0010D\u001a\b\u0012\u0004\u0012\u0002040\u00062\u0006\u0010(\u001a\u00020\u00022\u0006\u0010>\u001a\u00020\u00022\u0006\u0010C\u001a\u00020\u0002H\u0096\u0001R\u0016\u0010G\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006J"}, d2 = {"Lcom/huami/wallet/datasource/cloud/FilterHuamiWebApi;", "Lcom/huami/nfc/bus/api/IHuamiWebApi;", "", "appCode", "", "id", "Lcom/huami/nfc/base/PayResponse;", "agreeProtocol", "agreeShiftProtocol", "(Ljava/lang/String;Ljava/lang/Long;)Lcom/huami/nfc/base/PayResponse;", "cardNo", "Lcom/huami/nfc/bus/entities/RefundOpenFeeEntity;", "applyRefundOpenFee", "authChannelType", "Lcom/huami/nfc/bus/entities/PayAuthorizationInfo;", Common.AUTHORIZATION, "deviceId", "", Constant.KEY_LONGITUDE, Constant.KEY_LATITUDE, "gpsCityCode", "", "Lcom/huami/nfc/bus/CityInfoEntity;", "getAvailableCitiesWithStatus", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)Lcom/huami/nfc/base/PayResponse;", "", "limit", "next", "", "Lcom/huami/nfc/bus/entities/CardInfoEntity;", "getCardInfoList", "getCityInfo", "Lcom/huami/nfc/bus/entities/InvoiceEntity;", "getFeeInvoice", "cityCode", "getInstalledBusCards", "Lcom/huami/nfc/bus/NoticesEntity;", "getNotices", "Lcom/huami/nfc/bus/entities/OpenFeeStateEntity;", "getOpenFeeStatus", "userId", "getPhoneNumber", "actionType", "Lcom/huami/nfc/web/entity/ProtocolEntity;", "getProtocol", "getShiftProtocol", "cardNumber", "type", "Lcom/huami/nfc/applet/TransEntity;", "getTransactionsRecord", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Long;I)Lcom/huami/nfc/base/PayResponse;", "info", "", "postCardInfo", "postFeeInvoice", "refundReasonCode", "Lcom/huami/nfc/bus/entities/RefundTicketPostBody;", "refundTicketPostBody", "Lcom/huami/nfc/bus/entities/RefundTicket;", "refundTicket", "Lcom/huami/nfc/bus/entities/ReturnCardReason;", "returnCardReason", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "Lcom/huami/nfc/bus/VerifyCodeEntity;", "sendCaptcha", "trans", "uploadTransactions", Configs.Params.CAPTCHA, "verifyCaptcha", "a", "Lcom/huami/nfc/bus/api/IHuamiWebApi;", "delegate", "<init>", "(Lcom/huami/nfc/bus/api/IHuamiWebApi;)V", "cloud-api_release"}, k = 1, mv = {1, 5, 1})
public class FilterHuamiWebApi implements IHuamiWebApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IHuamiWebApi delegate;

    public FilterHuamiWebApi(@NotNull IHuamiWebApi iHuamiWebApi) {
        this.delegate = iHuamiWebApi;
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<String> agreeProtocol(@NotNull String appCode, long id) {
        return this.delegate.agreeProtocol(appCode, id);
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<String> agreeShiftProtocol(@NotNull String appCode, @Nullable Long id) {
        return this.delegate.agreeShiftProtocol(appCode, id);
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<RefundOpenFeeEntity> applyRefundOpenFee(@NotNull String appCode, @NotNull String cardNo) {
        return this.delegate.applyRefundOpenFee(appCode, cardNo);
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<PayAuthorizationInfo> authorization(@NotNull String appCode, @NotNull String authChannelType) {
        return this.delegate.authorization(appCode, authChannelType);
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<List<CityInfoEntity>> getAvailableCitiesWithStatus(@NotNull String deviceId, @Nullable Double longitude, @Nullable Double latitude, @Nullable String appCode, @Nullable String gpsCityCode) {
        return this.delegate.getAvailableCitiesWithStatus(deviceId, longitude, latitude, appCode, gpsCityCode);
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<List<CardInfoEntity>> getCardInfoList(@NotNull String appCode, int limit, int next) {
        return this.delegate.getCardInfoList(appCode, limit, next);
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<CityInfoEntity> getCityInfo(@NotNull String appCode) {
        return this.delegate.getCityInfo(appCode);
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<InvoiceEntity> getFeeInvoice(@NotNull String appCode) {
        return this.delegate.getFeeInvoice(appCode);
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<List<CityInfoEntity>> getInstalledBusCards(@NotNull String deviceId, @Nullable String cityCode) {
        return this.delegate.getInstalledBusCards(deviceId, cityCode);
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<List<NoticesEntity>> getNotices() {
        return this.delegate.getNotices();
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<OpenFeeStateEntity> getOpenFeeStatus(@NotNull String appCode, @NotNull String cardNo) {
        return this.delegate.getOpenFeeStatus(appCode, cardNo);
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<String> getPhoneNumber(@NotNull String userId) {
        return this.delegate.getPhoneNumber(userId);
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<ProtocolEntity> getProtocol(@NotNull String appCode, @NotNull String actionType) {
        return this.delegate.getProtocol(appCode, actionType);
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<ProtocolEntity> getShiftProtocol(@NotNull String appCode, @NotNull String actionType) {
        return this.delegate.getShiftProtocol(appCode, actionType);
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<List<TransEntity>> getTransactionsRecord(@NotNull String userId, @NotNull String appCode, @NotNull String cardNumber, int type, @Nullable Long next, int limit) {
        return this.delegate.getTransactionsRecord(userId, appCode, cardNumber, type, next, limit);
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<Unit> postCardInfo(@NotNull CardInfoEntity info, @NotNull String appCode) {
        return this.delegate.postCardInfo(info, appCode);
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<Unit> postFeeInvoice(@NotNull String appCode, @NotNull InvoiceEntity info) {
        return this.delegate.postFeeInvoice(appCode, info);
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<RefundTicket> refundTicket(@NotNull String appCode, @NotNull String refundReasonCode, @NotNull String cardNo, @NotNull RefundTicketPostBody refundTicketPostBody) {
        return this.delegate.refundTicket(appCode, refundReasonCode, cardNo, refundTicketPostBody);
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<List<ReturnCardReason>> returnCardReason() {
        return this.delegate.returnCardReason();
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<VerifyCodeEntity> sendCaptcha(@NotNull String userId, @NotNull String phoneNumber) {
        return this.delegate.sendCaptcha(userId, phoneNumber);
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<Unit> uploadTransactions(@NotNull String userId, @NotNull String appCode, @NotNull String cardNumber, @NotNull String deviceId, @NotNull List<TransEntity> trans) {
        return this.delegate.uploadTransactions(userId, appCode, cardNumber, deviceId, trans);
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<Unit> verifyCaptcha(@NotNull String userId, @NotNull String phoneNumber, @NotNull String captcha) {
        return this.delegate.verifyCaptcha(userId, phoneNumber, captcha);
    }
}
