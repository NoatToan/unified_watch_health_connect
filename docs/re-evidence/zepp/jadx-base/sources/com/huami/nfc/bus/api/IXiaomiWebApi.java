package com.huami.nfc.bus.api;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.bus.CouponEntity;
import com.huami.nfc.bus.MiPayChannelInfo;
import com.huami.nfc.bus.MiRefundStatus;
import com.huami.nfc.bus.OrderEntity;
import com.huami.nfc.bus.PayType;
import com.huami.nfc.bus.PrepareTransferOut;
import com.huami.nfc.bus.TransAmountEntity;
import com.huami.nfc.bus.TransferIn;
import com.huami.nfc.bus.XiaomiInVoiceEntity;
import com.huami.nfc.bus.XiaomiNoticesEntity;
import com.huami.nfc.bus.XiaomiOrderInfoEntity;
import com.huami.nfc.bus.XiaomiPrepareReturn;
import com.huami.nfc.bus.entities.CarouselEntity;
import com.huami.nfc.bus.entities.InvoiceEntity;
import com.huami.nfc.bus.entities.PayAccountInfoPostBody;
import com.huami.nfc.bus.entities.XiaomiBulletin;
import com.huami.nfc.web.Constant;
import com.huami.nfc.web.entity.ProtocolEntity;
import com.huami.passport.Configs;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J$\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&Je\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00062\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0015\u0010\u0016J.\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00062\u0006\u0010\u0017\u001a\u00020\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002H&J\u001c\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u001c0\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00062\u0006\u0010\u0017\u001a\u00020\u0002H&J\u001e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0002H&J\u001e\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00062\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0002H&J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010'\u001a\u00020&H&J\u0014\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00070\u0006H&J\u001c\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u00070\u00062\u0006\u0010\u000b\u001a\u00020\nH&J\u001c\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001e\u00102\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00101\u001a\u000200H&J\u0016\u00104\u001a\b\u0012\u0004\u0012\u0002030\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u00105\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001e\u00108\u001a\b\u0012\u0004\u0012\u0002070\u00062\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u0002H&J\u0016\u00109\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00062\u0006\u0010\u0017\u001a\u00020\u0002H&J\u0016\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u00062\u0006\u0010\u0017\u001a\u00020\u0002H&J4\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0\u00070\u00062\u0006\u0010<\u001a\u00020\u00022\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002H&J\u0016\u0010A\u001a\b\u0012\u0004\u0012\u00020@0\u00062\u0006\u0010=\u001a\u00020\u0002H&J\u0016\u0010B\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00062\u0006\u0010=\u001a\u00020\u0002H&J4\u0010G\u001a\b\u0012\u0004\u0012\u00020F0\u00062\u0006\u0010=\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u00022\b\u0010C\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010E\u001a\u0004\u0018\u00010DH&J&\u0010J\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00062\u0006\u0010=\u001a\u00020\u00022\u0006\u0010H\u001a\u00020\u00022\u0006\u0010I\u001a\u00020\u0002H&J&\u0010K\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00062\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0002H&¨\u0006L"}, d2 = {"Lcom/huami/nfc/bus/api/IXiaomiWebApi;", "Lcom/huami/nfc/bus/api/IXiaomiAppletWebApi;", "", "miCardName", "Lcom/huami/nfc/bus/PayType;", "type", "Lcom/huami/nfc/base/PayResponse;", "", "Lcom/huami/nfc/bus/TransAmountEntity;", "getTransactionAmount", "", "feeId", "couponId", "", Constant.KEY_LONGITUDE, Constant.KEY_LATITUDE, "Lcom/huami/nfc/bus/MiPayChannelInfo;", "payChannelInfo", "phone", Configs.Params.CAPTCHA, "Lcom/huami/nfc/bus/OrderEntity;", "generateOrder", "(ILjava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Lcom/huami/nfc/bus/MiPayChannelInfo;Ljava/lang/String;Ljava/lang/String;)Lcom/huami/nfc/base/PayResponse;", "orderId", "aid", "cardName", "Lcom/huami/nfc/bus/XiaomiOrderInfoEntity;", "getOrderInfo", "", "getOrders", "", FirebaseAnalytics.Event.REFUND, "seNumber", "getCardNumber", "xiaomiBusCardName", "actionType", "Lcom/huami/nfc/web/entity/ProtocolEntity;", "getProtocol", "", "id", "agreeProtocol", "Lcom/huami/nfc/bus/XiaomiNoticesEntity;", "getNotices", "Lcom/huami/nfc/bus/CouponEntity;", "getCoupon", "Lcom/huami/nfc/bus/entities/CarouselEntity;", "getCarouselList", "getCardInstructions", "Lcom/huami/nfc/bus/entities/InvoiceEntity;", "info", "postInvoiceInfo", "Lcom/huami/nfc/bus/XiaomiInVoiceEntity;", "getInvoiceAddress", "getChargeInvoiceDescription", "claimedBalance", "Lcom/huami/nfc/bus/PrepareTransferOut;", "prepareTransferOut", "confirmTransferOut", "Lcom/huami/nfc/bus/TransferIn;", "startTransferIn", "tag", "xmCardName", "Lcom/huami/nfc/bus/entities/XiaomiBulletin;", "bulletins", "Lcom/huami/nfc/bus/MiRefundStatus;", "queryRefundStatus", "applyRefund", "reasonCode", "Lcom/huami/nfc/bus/entities/PayAccountInfoPostBody;", "payAccountInfo", "Lcom/huami/nfc/bus/XiaomiPrepareReturn;", "prepareReturn", Configs.Params.AUTHCODE, "authChannel", "authorizationBind", "sendCaptcha", "nfc-bus_release"}, k = 1, mv = {1, 5, 1})
public interface IXiaomiWebApi extends IXiaomiAppletWebApi {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ PayResponse bulletins$default(IXiaomiWebApi iXiaomiWebApi, String str, String str2, String str3, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bulletins");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            return iXiaomiWebApi.bulletins(str, str2, str3);
        }

        public static /* synthetic */ PayResponse generateOrder$default(IXiaomiWebApi iXiaomiWebApi, int i, Integer num, Double d, Double d2, MiPayChannelInfo miPayChannelInfo, String str, String str2, int i2, Object obj) {
            if (obj == null) {
                return iXiaomiWebApi.generateOrder(i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : d, (i2 & 8) != 0 ? null : d2, (i2 & 16) != 0 ? null : miPayChannelInfo, (i2 & 32) != 0 ? null : str, (i2 & 64) == 0 ? str2 : null);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: generateOrder");
        }

        public static /* synthetic */ PayResponse getOrderInfo$default(IXiaomiWebApi iXiaomiWebApi, String str, String str2, String str3, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOrderInfo");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            return iXiaomiWebApi.getOrderInfo(str, str2, str3);
        }

        public static /* synthetic */ PayResponse prepareReturn$default(IXiaomiWebApi iXiaomiWebApi, String str, String str2, String str3, PayAccountInfoPostBody payAccountInfoPostBody, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: prepareReturn");
            }
            if ((i & 8) != 0) {
                payAccountInfoPostBody = null;
            }
            return iXiaomiWebApi.prepareReturn(str, str2, str3, payAccountInfoPostBody);
        }
    }

    @NotNull
    PayResponse<String> agreeProtocol(long id);

    @NotNull
    PayResponse<Unit> applyRefund(@NotNull String xmCardName);

    @NotNull
    PayResponse<Unit> authorizationBind(@NotNull String xmCardName, @NotNull String authCode, @NotNull String authChannel);

    @NotNull
    PayResponse<List<XiaomiBulletin>> bulletins(@NotNull String tag, @Nullable String xmCardName, @Nullable String aid);

    @NotNull
    PayResponse<Unit> confirmTransferOut(@NotNull String orderId);

    @NotNull
    PayResponse<OrderEntity> generateOrder(int feeId, @Nullable Integer couponId, @Nullable Double longitude, @Nullable Double latitude, @Nullable MiPayChannelInfo payChannelInfo, @Nullable String phone, @Nullable String captcha);

    @NotNull
    PayResponse<String> getCardInstructions(@NotNull String miCardName);

    @NotNull
    PayResponse<String> getCardNumber(@NotNull String aid, @NotNull String seNumber);

    @NotNull
    PayResponse<List<CarouselEntity>> getCarouselList(@NotNull String miCardName);

    @NotNull
    PayResponse<String> getChargeInvoiceDescription(@NotNull String miCardName);

    @NotNull
    PayResponse<List<CouponEntity>> getCoupon(int feeId);

    @NotNull
    PayResponse<XiaomiInVoiceEntity> getInvoiceAddress(@NotNull String miCardName);

    @NotNull
    PayResponse<List<XiaomiNoticesEntity>> getNotices();

    @NotNull
    PayResponse<XiaomiOrderInfoEntity> getOrderInfo(@NotNull String orderId, @Nullable String aid, @Nullable String cardName);

    @NotNull
    PayResponse<List<XiaomiOrderInfoEntity>> getOrders(@NotNull String miCardName);

    @NotNull
    PayResponse<ProtocolEntity> getProtocol(@NotNull String xiaomiBusCardName, @NotNull String actionType);

    @NotNull
    PayResponse<List<TransAmountEntity>> getTransactionAmount(@NotNull String miCardName, @NotNull PayType type);

    @NotNull
    PayResponse<Unit> postInvoiceInfo(@NotNull String miCardName, @NotNull InvoiceEntity info);

    @NotNull
    PayResponse<XiaomiPrepareReturn> prepareReturn(@NotNull String xmCardName, @NotNull String claimedBalance, @Nullable String reasonCode, @Nullable PayAccountInfoPostBody payAccountInfo);

    @NotNull
    PayResponse<PrepareTransferOut> prepareTransferOut(@NotNull String cardName, @NotNull String claimedBalance);

    @NotNull
    PayResponse<MiRefundStatus> queryRefundStatus(@NotNull String xmCardName);

    @NotNull
    PayResponse<Unit> refund(@NotNull String orderId);

    @NotNull
    PayResponse<Unit> sendCaptcha(@NotNull String phone, @NotNull String cardName, @NotNull String actionType);

    @NotNull
    PayResponse<TransferIn> startTransferIn(@NotNull String orderId);
}
