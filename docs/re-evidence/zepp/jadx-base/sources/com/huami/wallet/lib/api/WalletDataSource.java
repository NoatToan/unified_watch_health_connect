package com.huami.wallet.lib.api;

import android.app.Activity;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huami.nfc.applet.CardScheduleTime;
import com.huami.nfc.ble.AppletType;
import com.huami.nfc.bus.MiRefundStatus;
import com.huami.nfc.bus.OrderEntity;
import com.huami.nfc.bus.PayType;
import com.huami.nfc.bus.entities.PayAuthorizationInfo;
import com.huami.nfc.bus.entities.RefundTicket;
import com.huami.nfc.bus.entities.RefundTicketPostBody;
import com.huami.nfc.bus.entities.ReturnCardReason;
import com.huami.nfc.bus.entities.XiaomiBulletin;
import com.huami.wallet.lib.entity.BusCardBalance;
import com.huami.wallet.lib.entity.BusCardDetail;
import com.huami.wallet.lib.entity.BusCardListItem;
import com.huami.wallet.lib.entity.BusCardSimple2;
import com.huami.wallet.lib.entity.BusCardValidity;
import com.huami.wallet.lib.entity.BusOpenFeeStateEntity;
import com.huami.wallet.lib.entity.BusRefundOpenFeeEntity;
import com.huami.wallet.lib.entity.BusSiteInfo;
import com.huami.wallet.lib.entity.CarouseInfo;
import com.huami.wallet.lib.entity.CheckOrderResult;
import com.huami.wallet.lib.entity.ConsumeRecord;
import com.huami.wallet.lib.entity.Coupon;
import com.huami.wallet.lib.entity.Fee;
import com.huami.wallet.lib.entity.InVoiceInfo;
import com.huami.wallet.lib.entity.MiOrder;
import com.huami.wallet.lib.entity.MiPayH5Result;
import com.huami.wallet.lib.entity.NFCCardInfoEntity;
import com.huami.wallet.lib.entity.NFCTransEntity;
import com.huami.wallet.lib.entity.Notice;
import com.huami.wallet.lib.entity.Order;
import com.huami.wallet.lib.entity.OrderType;
import com.huami.wallet.lib.entity.PayMode;
import com.huami.wallet.lib.entity.Protocol;
import com.huami.wallet.lib.entity.RechargeRecord;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.lib.entity.XiaomiBulletinType;
import com.huami.wallet.lib.entity.XiaomiInVoiceInfo;
import com.huami.wallet.lib.entity.XiaomiNotice;
import java.util.List;
import kotlin.Unit;
import org.reactivestreams.Processor;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes13.dex */
public interface WalletDataSource {
    Publisher<Resource<String>> agreeProtocol(String str, long j);

    Publisher<Resource<String>> agreeShiftProtocol(String str, @Nullable Long l);

    Publisher<Resource<String>> applyRefund(@NonNull String str);

    Publisher<Resource<BusRefundOpenFeeEntity>> applyRefundOpenFee(String str, String str2);

    Publisher<Resource<PayAuthorizationInfo>> authorization(String str, String str2);

    Publisher<Resource<String>> chargeToDevice(@NonNull String str, @NonNull String str2);

    Publisher<Resource<CheckOrderResult>> checkOrderWithLoop(@NonNull String str, boolean z);

    void clearData();

    Publisher<Resource<String>> deleteBusCard(@NonNull String str);

    Publisher<Resource<Boolean>> deleteCardScheduleTime(CardScheduleTime cardScheduleTime);

    Publisher<Resource<MiOrder>> generateMiOrder(int i, Integer num, PayMode payMode);

    Publisher<Resource<OrderEntity>> generateShiftOrder(String str, PayType payType, @Nullable String str2);

    String getAid(String str);

    Publisher<Resource<String>> getBusImageUrl(String str);

    Publisher<Resource<String>> getCardInstructions(String str);

    Publisher<Resource<List<CarouseInfo>>> getCarouselList(String str);

    Publisher<Resource<String>> getChargeInvoiceDescription(String str);

    Publisher<Resource<List<Coupon>>> getCoupon(Integer num);

    Publisher<Resource<String>> getDefaultBusCardId();

    String getDeviceModel();

    Publisher<Resource<InVoiceInfo>> getFeeInvoice(String str);

    String getHost();

    Publisher<Resource<List<BusCardSimple2>>> getInstalledBusCards();

    Publisher<Resource<XiaomiInVoiceInfo>> getInvoiceAddress(String str);

    Publisher<Resource<BusOpenFeeStateEntity>> getOpenFeeStatus(@NonNull String str, @NonNull String str2);

    Publisher<Resource<Boolean>> getOrderInfo(String str);

    Publisher<Resource<Protocol>> getProtocol(@NonNull String str, @NonNull String str2, @NonNull String str3);

    Publisher<Resource<Protocol>> getShiftProtocol(@NonNull String str, @NonNull String str2);

    Publisher<Resource<BusSiteInfo>> getSiteInfo(String str, String str2);

    String getUserId();

    Publisher<Resource<XiaomiBulletin>> getXiaomiBulletins(XiaomiBulletinType xiaomiBulletinType, String str, String str2);

    Publisher<Resource<List<XiaomiNotice>>> getXiaomiNotice();

    MiPayH5Result goMiPayH5(Activity activity, String str, String str2);

    Publisher<Boolean> isDeviceConnected();

    @AnyThread
    boolean isForMi();

    Boolean isForSnowballShanghai(String str);

    boolean isLingNanTong(String str);

    boolean isSupportBannerView();

    boolean isSupportCardInformation();

    boolean isSupportCity(String str);

    boolean isSupportMiInVoice();

    boolean isSupportMiuiPay();

    boolean isSupportTimeSwitchCard();

    Publisher<Resource<String>> issueCardToDevice(@NonNull String str, @NonNull String str2, @NonNull String str3);

    Publisher<Resource<List<BusCardListItem>>> loadAllBusCards(@Nullable String str);

    Publisher<Resource<BusCardBalance>> loadBusCardBalance(String str);

    Publisher<Resource<List<ConsumeRecord>>> loadBusCardConsumeRecordsWeb(@NonNull String str, @NonNull String str2);

    Publisher<Resource<BusCardDetail>> loadBusCardDetailInfo(@NonNull String str);

    Publisher<Resource<String>> loadBusCardNumber(@NonNull String str);

    Publisher<Resource<List<RechargeRecord>>> loadBusCardRechargeRecords(@NonNull String str);

    Publisher<Resource<BusCardValidity>> loadBusCardValidity(String str);

    Publisher<Resource<String>> loadCplc();

    Publisher<Resource<List<Fee>>> loadFees(@NonNull String str, @NonNull OrderType orderType);

    Publisher<Resource<Integer>> loadMiBusCardRechargeRecords(@NonNull String str);

    Publisher<Resource<List<Notice>>> loadNotices();

    Publisher<Resource<List<BusCardSimple2>>> loadOpenedBusCards();

    Publisher<Resource<Order>> loadOrderInfo(@NonNull String str, String str2, String str3);

    Publisher<Resource<String>> loadVerifiedPhone();

    Publisher<Resource<String>> payToOpenAndRecharge(@NonNull Activity activity, @NonNull String str, int i, @Nullable Integer num, int i2, @Nullable PayMode payMode, int i3, Processor<Resource<String>, Resource<String>> processor);

    Publisher<Resource<String>> payToRechargeCard(@NonNull Activity activity, @NonNull String str, int i, int i2, @Nullable PayMode payMode, Processor<Resource<String>, Resource<String>> processor);

    Publisher<Resource<Boolean>> postFeeInvoice(String str, InVoiceInfo inVoiceInfo);

    Publisher<Resource<Boolean>> postInvoiceInfo(String str, InVoiceInfo inVoiceInfo);

    Publisher<Resource<List<CardScheduleTime>>> queryCardScheduleTime(AppletType appletType, String str);

    Publisher<Resource<MiRefundStatus>> queryRefundStatus(String str);

    Publisher<Resource<Object>> refund(@NonNull String str);

    Publisher<Resource<RefundTicket>> refundTicket(String str, String str2, String str3, RefundTicketPostBody refundTicketPostBody);

    Publisher<Resource<Unit>> returnCard(String str, String str2);

    Publisher<Resource<String>> returnCardMi(String str, @Nullable Integer num, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7);

    Publisher<Resource<List<ReturnCardReason>>> returnCardReason();

    Publisher<Resource<Object>> sendSmsCaptcha(String str);

    Publisher<Resource<Boolean>> setCardScheduleTime(CardScheduleTime cardScheduleTime);

    Publisher<Resource<Object>> setDefaultBusCard(@NonNull String str, @Nullable String str2);

    Publisher<Resource<Boolean>> shiftIn(String str, String str2);

    Publisher<Resource<String>> shiftInMi(String str, String str2, String str3);

    Publisher<Resource<Boolean>> shiftOut(String str, String str2);

    Publisher<Resource<String>> shiftOutMi(String str, @Nullable String str2, @Nullable String str3);

    Publisher<Resource<Unit>> updateCardName(String str, String str2);

    void updateNfcCardListSync(List<BusCardSimple2> list);

    void uploadCardInfo(NFCCardInfoEntity nFCCardInfoEntity, String str);

    Publisher<Resource<Boolean>> uploadConsumeRecords(String str);

    Publisher<Resource<Object>> uploadNfcTransEntitys(@NonNull String str, @NonNull String str2, List<NFCTransEntity> list);

    Publisher<Resource<Object>> uploadTransactionRecord(@NonNull String str, @NonNull String str2, List<Order> list);

    Publisher<Resource<String>> validateCardDate(long j, long j2);

    Publisher<Resource<Object>> verifySmsCaptcha(String str, String str2);

    Boolean withBleApi();
}
