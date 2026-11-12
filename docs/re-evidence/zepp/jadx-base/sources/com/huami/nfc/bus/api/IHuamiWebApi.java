package com.huami.nfc.bus.api;

import androidx.autofill.HintConstants;
import com.huami.nfc.applet.TransEntity;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.bus.CityInfoEntity;
import com.huami.nfc.bus.NoticesEntity;
import com.huami.nfc.bus.VerifyCodeEntity;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J<\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&JQ\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u000eH&¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H&J&\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H&JS\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u00042\u0006\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00042\u0006\u0010\u0006\u001a\u00020\u0002H&J(\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u00042\u0006\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0002H&J\u0014\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\t0\u0004H&J\u001e\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0002H&J\u001e\u0010*\u001a\b\u0012\u0004\u0012\u00020(0\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0002H&J\u001e\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u0010H&J'\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010+\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0004\b-\u0010.J\u0016\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00042\u0006\u0010\u0006\u001a\u00020\u0002H&J\u001e\u00102\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u00101\u001a\u00020/H&J0\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\t0\u00042\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000eH&J\u001e\u00105\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u00101\u001a\u0002032\u0006\u0010\u0006\u001a\u00020\u0002H&J\u001e\u00108\u001a\b\u0012\u0004\u0012\u0002070\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u0002H&J\u001e\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u0002H&J\u0014\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0\u001e0\u0004H&J\u001e\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u0002H&J.\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010@\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u00022\u0006\u0010B\u001a\u00020AH&¨\u0006E"}, d2 = {"Lcom/huami/nfc/bus/api/IHuamiWebApi;", "", "", "userId", "Lcom/huami/nfc/base/PayResponse;", "getPhoneNumber", "appCode", "cardNumber", "deviceId", "", "Lcom/huami/nfc/applet/TransEntity;", "trans", "", "uploadTransactions", "", "type", "", "next", "limit", "getTransactionsRecord", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Long;I)Lcom/huami/nfc/base/PayResponse;", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "Lcom/huami/nfc/bus/VerifyCodeEntity;", "sendCaptcha", Configs.Params.CAPTCHA, "verifyCaptcha", "", Constant.KEY_LONGITUDE, Constant.KEY_LATITUDE, "gpsCityCode", "", "Lcom/huami/nfc/bus/CityInfoEntity;", "getAvailableCitiesWithStatus", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)Lcom/huami/nfc/base/PayResponse;", "getCityInfo", "cityCode", "getInstalledBusCards", "Lcom/huami/nfc/bus/NoticesEntity;", "getNotices", "actionType", "Lcom/huami/nfc/web/entity/ProtocolEntity;", "getProtocol", "getShiftProtocol", "id", "agreeProtocol", "agreeShiftProtocol", "(Ljava/lang/String;Ljava/lang/Long;)Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/bus/entities/InvoiceEntity;", "getFeeInvoice", "info", "postFeeInvoice", "Lcom/huami/nfc/bus/entities/CardInfoEntity;", "getCardInfoList", "postCardInfo", "cardNo", "Lcom/huami/nfc/bus/entities/OpenFeeStateEntity;", "getOpenFeeStatus", "Lcom/huami/nfc/bus/entities/RefundOpenFeeEntity;", "applyRefundOpenFee", "Lcom/huami/nfc/bus/entities/ReturnCardReason;", "returnCardReason", "authChannelType", "Lcom/huami/nfc/bus/entities/PayAuthorizationInfo;", Common.AUTHORIZATION, "refundReasonCode", "Lcom/huami/nfc/bus/entities/RefundTicketPostBody;", "refundTicketPostBody", "Lcom/huami/nfc/bus/entities/RefundTicket;", "refundTicket", "nfc-bus_release"}, k = 1, mv = {1, 5, 1})
public interface IHuamiWebApi {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ PayResponse getAvailableCitiesWithStatus$default(IHuamiWebApi iHuamiWebApi, String str, Double d, Double d2, String str2, String str3, int i, Object obj) {
            if (obj == null) {
                return iHuamiWebApi.getAvailableCitiesWithStatus(str, (i & 2) != 0 ? null : d, (i & 4) != 0 ? null : d2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAvailableCitiesWithStatus");
        }

        public static /* synthetic */ PayResponse getCardInfoList$default(IHuamiWebApi iHuamiWebApi, String str, int i, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCardInfoList");
            }
            if ((i3 & 2) != 0) {
                i = 100;
            }
            if ((i3 & 4) != 0) {
                i2 = 0;
            }
            return iHuamiWebApi.getCardInfoList(str, i, i2);
        }

        public static /* synthetic */ PayResponse getInstalledBusCards$default(IHuamiWebApi iHuamiWebApi, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getInstalledBusCards");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return iHuamiWebApi.getInstalledBusCards(str, str2);
        }

        public static /* synthetic */ PayResponse getTransactionsRecord$default(IHuamiWebApi iHuamiWebApi, String str, String str2, String str3, int i, Long l, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTransactionsRecord");
            }
            if ((i3 & 16) != 0) {
                l = null;
            }
            return iHuamiWebApi.getTransactionsRecord(str, str2, str3, i, l, (i3 & 32) != 0 ? 10 : i2);
        }
    }

    @NotNull
    PayResponse<String> agreeProtocol(@NotNull String appCode, long id);

    @NotNull
    PayResponse<String> agreeShiftProtocol(@NotNull String appCode, @Nullable Long id);

    @NotNull
    PayResponse<RefundOpenFeeEntity> applyRefundOpenFee(@NotNull String appCode, @NotNull String cardNo);

    @NotNull
    PayResponse<PayAuthorizationInfo> authorization(@NotNull String appCode, @NotNull String authChannelType);

    @NotNull
    PayResponse<List<CityInfoEntity>> getAvailableCitiesWithStatus(@NotNull String deviceId, @Nullable Double longitude, @Nullable Double latitude, @Nullable String appCode, @Nullable String gpsCityCode);

    @NotNull
    PayResponse<List<CardInfoEntity>> getCardInfoList(@NotNull String appCode, int limit, int next);

    @NotNull
    PayResponse<CityInfoEntity> getCityInfo(@NotNull String appCode);

    @NotNull
    PayResponse<InvoiceEntity> getFeeInvoice(@NotNull String appCode);

    @NotNull
    PayResponse<List<CityInfoEntity>> getInstalledBusCards(@NotNull String deviceId, @Nullable String cityCode);

    @NotNull
    PayResponse<List<NoticesEntity>> getNotices();

    @NotNull
    PayResponse<OpenFeeStateEntity> getOpenFeeStatus(@NotNull String appCode, @NotNull String cardNo);

    @NotNull
    PayResponse<String> getPhoneNumber(@NotNull String userId);

    @NotNull
    PayResponse<ProtocolEntity> getProtocol(@NotNull String appCode, @NotNull String actionType);

    @NotNull
    PayResponse<ProtocolEntity> getShiftProtocol(@NotNull String appCode, @NotNull String actionType);

    @NotNull
    PayResponse<List<TransEntity>> getTransactionsRecord(@NotNull String userId, @NotNull String appCode, @NotNull String cardNumber, int type, @Nullable Long next, int limit);

    @NotNull
    PayResponse<Unit> postCardInfo(@NotNull CardInfoEntity info, @NotNull String appCode);

    @NotNull
    PayResponse<Unit> postFeeInvoice(@NotNull String appCode, @NotNull InvoiceEntity info);

    @NotNull
    PayResponse<RefundTicket> refundTicket(@NotNull String appCode, @NotNull String refundReasonCode, @NotNull String cardNo, @NotNull RefundTicketPostBody refundTicketPostBody);

    @NotNull
    PayResponse<List<ReturnCardReason>> returnCardReason();

    @NotNull
    PayResponse<VerifyCodeEntity> sendCaptcha(@NotNull String userId, @NotNull String phoneNumber);

    @NotNull
    PayResponse<Unit> uploadTransactions(@NotNull String userId, @NotNull String appCode, @NotNull String cardNumber, @NotNull String deviceId, @NotNull List<TransEntity> trans);

    @NotNull
    PayResponse<Unit> verifyCaptcha(@NotNull String userId, @NotNull String phoneNumber, @NotNull String captcha);
}
