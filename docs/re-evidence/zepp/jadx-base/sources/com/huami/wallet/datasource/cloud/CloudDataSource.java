package com.huami.wallet.datasource.cloud;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.huami.android.mipay.h5.MiPayH5Response;
import com.huami.android.mipay.h5.MipayH5;
import com.huami.android.tools.pay.ali.AliPay;
import com.huami.android.tools.pay.ali.AliPayResponse;
import com.huami.android.tools.pay.wechat.WeChatPay;
import com.huami.android.tools.pay.wechat.WeChatResponse;
import com.huami.mipay.MiPayResponse;
import com.huami.mipay.Mipay;
import com.huami.nfc.applet.BalanceException;
import com.huami.nfc.applet.BusCardExtensions;
import com.huami.nfc.applet.CardInfo;
import com.huami.nfc.applet.CardScheduleTime;
import com.huami.nfc.applet.City;
import com.huami.nfc.applet.ConstantKt;
import com.huami.nfc.applet.OverdraftException;
import com.huami.nfc.applet.ShangHai;
import com.huami.nfc.applet.ShenZhenMot;
import com.huami.nfc.applet.TransEntity;
import com.huami.nfc.applet.TransType;
import com.huami.nfc.applet.api.SeAppletApi;
import com.huami.nfc.applet.api.SeInfoApi;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.ble.AppletType;
import com.huami.nfc.ble.IDeviceApi;
import com.huami.nfc.ble.NfcBleApi;
import com.huami.nfc.bus.ActionToken;
import com.huami.nfc.bus.ApduAction;
import com.huami.nfc.bus.CityInfoEntity;
import com.huami.nfc.bus.CouponEntity;
import com.huami.nfc.bus.EntityKt;
import com.huami.nfc.bus.ExtraInfo;
import com.huami.nfc.bus.MiPayChannelInfo;
import com.huami.nfc.bus.MiRefundStatus;
import com.huami.nfc.bus.MiShiftActionToken;
import com.huami.nfc.bus.NoticesEntity;
import com.huami.nfc.bus.OrderCategory;
import com.huami.nfc.bus.OrderEntity;
import com.huami.nfc.bus.OrderInfoEntity;
import com.huami.nfc.bus.PayChannel;
import com.huami.nfc.bus.PayType;
import com.huami.nfc.bus.PrepareTransferOut;
import com.huami.nfc.bus.ResponseError;
import com.huami.nfc.bus.TransAmountEntity;
import com.huami.nfc.bus.TransferIn;
import com.huami.nfc.bus.VerifyCodeEntity;
import com.huami.nfc.bus.XiaomiInVoiceEntity;
import com.huami.nfc.bus.XiaomiNoticesEntity;
import com.huami.nfc.bus.XiaomiOrderInfoEntity;
import com.huami.nfc.bus.XiaomiPrepareReturn;
import com.huami.nfc.bus.api.IHuamiWebApi;
import com.huami.nfc.bus.api.ISnowballWebApi;
import com.huami.nfc.bus.api.IXiaomiWebApi;
import com.huami.nfc.bus.entities.CardInfoEntity;
import com.huami.nfc.bus.entities.CarouselEntity;
import com.huami.nfc.bus.entities.InvoiceEntity;
import com.huami.nfc.bus.entities.OpenFeeStateEntity;
import com.huami.nfc.bus.entities.PayAccountInfoPostBody;
import com.huami.nfc.bus.entities.PayAuthorizationInfo;
import com.huami.nfc.bus.entities.RefundOpenFeeEntity;
import com.huami.nfc.bus.entities.RefundTicket;
import com.huami.nfc.bus.entities.RefundTicketPostBody;
import com.huami.nfc.bus.entities.ReturnCardReason;
import com.huami.nfc.bus.entities.SiteInfo;
import com.huami.nfc.bus.entities.XiaomiBulletin;
import com.huami.nfc.web.NfcDevice;
import com.huami.nfc.web.NfcDeviceKt;
import com.huami.nfc.web.entity.ProtocolEntity;
import com.huami.tools.log.HMLog;
import com.huami.wallet.common.api.ImageProviderApi;
import com.huami.wallet.common.config.LocationConfig;
import com.huami.wallet.common.config.LocationInfo;
import com.huami.wallet.common.config.WebConfig;
import com.huami.wallet.datasource.cloud.CloudDataSource;
import com.huami.wallet.lib.api.WalletDataSource;
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
import com.huami.wallet.lib.entity.CitySimpleInfo;
import com.huami.wallet.lib.entity.CitySimpleInfoKt;
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
import com.huami.wallet.lib.entity.Status;
import com.huami.wallet.lib.entity.WalletConfig;
import com.huami.wallet.lib.entity.XiaomiBulletinType;
import com.huami.wallet.lib.entity.XiaomiInVoiceInfo;
import com.huami.wallet.lib.entity.XiaomiNotice;
import com.huami.wallet.lib.util.CitySimpleInfoCache;
import com.huami.wallet.lib.util.ErrorCode;
import com.xiaomi.mipush.sdk.Constants;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.koin.java.KoinJavaComponent;
import org.reactivestreams.Processor;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes13.dex */
public class CloudDataSource implements WalletDataSource {
    public static final String A = "http401";
    private static final String B = "com.xiaomi.hm.health";
    private static final String C = "01";
    private static final String D = "02";
    public static final String y = "Wallet-CloudDataSource";
    public static final String z = "unknown";
    private final Config b;
    private SeAppletApi c;
    private IHuamiWebApi d;
    private ISnowballWebApi e;
    private IXiaomiWebApi f;
    private IDeviceApi g;
    private NfcBleApi h;
    private m i;
    private SyncAppletApi u;
    private final Object a = new Object();
    private Lazy<IHuamiWebApi> j = KoinJavaComponent.inject(IHuamiWebApi.class);
    private Lazy<ISnowballWebApi> k = KoinJavaComponent.inject(ISnowballWebApi.class);
    private Lazy<NfcBleApi> l = KoinJavaComponent.inject(NfcBleApi.class);
    private Lazy<IXiaomiWebApi> m = KoinJavaComponent.inject(IXiaomiWebApi.class);
    private Lazy<IDeviceApi> n = KoinJavaComponent.inject(IDeviceApi.class);
    private Lazy<SeAppletApi> o = KoinJavaComponent.inject(SeAppletApi.class);
    private Lazy<NfcDevice> p = KoinJavaComponent.inject(NfcDevice.class);
    private Lazy<SeInfoApi> q = KoinJavaComponent.inject(SeInfoApi.class);
    private Lazy<ImageProviderApi> r = KoinJavaComponent.inject(ImageProviderApi.class);
    private Lazy<WebConfig> s = KoinJavaComponent.inject(WebConfig.class);
    private Lazy<LocationConfig> t = KoinJavaComponent.inject(LocationConfig.class);
    private String v = null;
    private String w = null;
    private String x = null;

    public static class Config {
        public Context context;
        public Publisher<Boolean> deviceConnectionChecker;
        public String deviceId;
        public String hostAppPackageName;
        public String hostUrl;
        public Function0<Boolean> isSupportBannerView;
        public Function0<Boolean> isSupportCardInformation;
        public Function0<Boolean> isSupportDynamicCity;
        public Function0<Boolean> isSupportMiInVoice;
        public Publisher<Boolean> isSupportMiuiPay;
        public Function0<Double> latitudeFunction0;
        public Function0<Double> longitudeFunction0;
        public OnWalletHttpError onWalletHttpError;
        public boolean testPay;
        public String userId;
        public Function0<Boolean> withBleApi;
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[OrderType.values().length];
            b = iArr;
            try {
                iArr[OrderType.OPEN_OR_RECHARGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[OrderType.OPEN_AND_RECHARGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[OrderType.RECHARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[PayMode.values().length];
            a = iArr2;
            try {
                iArr2[PayMode.WECHAT_PAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[PayMode.ALIPAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[PayMode.MI_PAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public CloudDataSource(Config config) {
        l.a(config.context, "context cannot be null");
        l.a(config.deviceConnectionChecker, "deviceConnectionChecker cannot be null");
        l.a(config.isSupportMiuiPay, "isSupportMiuiPay cannot be null");
        this.b = config;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource A1(String str, String str2) throws Exception {
        PayResponse<OpenFeeStateEntity> openFeeStatus = X0().getOpenFeeStatus(str, str2);
        if (openFeeStatus.isSuccessful()) {
            return Resource.success(new BusOpenFeeStateEntity(openFeeStatus.getData() == null ? 0 : openFeeStatus.getData().getStatus()));
        }
        return Resource.error(openFeeStatus.getCode(), openFeeStatus.getMessage(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource A2(String str, String str2) throws Exception {
        return O2(L0().updateAppletInfo(str, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource B1(String str) throws Exception {
        PayResponse<XiaomiOrderInfoEntity> orderInfo = T2().getOrderInfo(str, null, null);
        if (!orderInfo.isSuccessful()) {
            HMLog.w(y, "getOrderInfo:" + orderInfo.toString(), new Object[0]);
            return Helpers.l(orderInfo);
        }
        HMLog.i(y, "getOrderInfo:" + orderInfo.toString(), new Object[0]);
        XiaomiOrderInfoEntity data = orderInfo.getData();
        return data == null ? Resource.success(Boolean.FALSE) : Resource.success(Boolean.valueOf(W0(data)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean B2(Resource resource) throws Exception {
        return resource.status == Status.SUCCESS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource C1(String str, String str2, String str3) throws Exception {
        PayResponse<ProtocolEntity> protocol;
        if (isForMi()) {
            protocol = T2().getProtocol(str, str2);
        } else {
            protocol = str2.equals("RECHARGE") ? X0().getProtocol(str3, "UPDATE") : X0().getProtocol(str3, str2);
        }
        if (!protocol.isSuccessful() || protocol.getData() == null) {
            return Resource.success(null);
        }
        ProtocolEntity data = protocol.getData();
        return Resource.success(new Protocol(data.getUrl(), Long.valueOf(data.getId()), data.getNeedConfirm(), data.getServiceName(), data.getTitle(), Boolean.FALSE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String C2(Resource resource) throws Exception {
        T t = resource.data;
        return t != 0 ? (String) t : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource D1(String str) throws Exception {
        if (isForMi()) {
            return Resource.error("", null);
        }
        PayResponse<ProtocolEntity> shiftProtocol = X0().getShiftProtocol(str, "ISSUE");
        if (shiftProtocol.isSuccessful() && shiftProtocol.getData() != null) {
            ProtocolEntity data = shiftProtocol.getData();
            return Resource.success(new Protocol(data.getUrl(), Long.valueOf(data.getId()), data.getNeedConfirm(), data.getServiceName(), data.getTitle(), Boolean.FALSE));
        }
        return Resource.error("" + shiftProtocol.getMessage(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource D2(String str) throws Exception {
        PayResponse<List<TransEntity>> transRecord = J0().getTransRecord(str);
        if (!transRecord.isSuccessful()) {
            HMLog.w(y, "从设备获取交易记录失败, city:" + str + ":" + transRecord.toString(), new Object[0]);
            return Resource.success(Boolean.FALSE);
        }
        ArrayList arrayList = new ArrayList();
        if (transRecord.getData() != null) {
            for (TransEntity transEntity : transRecord.getData()) {
                if (transEntity.getType() == TransType.Consume) {
                    arrayList.add(transEntity);
                }
            }
        }
        if (arrayList.isEmpty()) {
            HMLog.d(y, "没有消费记录，无需上传", new Object[0]);
            return Resource.success(Boolean.FALSE);
        }
        String str2 = (String) Flowable.fromPublisher(loadBusCardNumber(str)).filter(new Predicate() { // from class: jq0
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return CloudDataSource.B2((Resource) obj);
            }
        }).map(new Function() { // from class: mt0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return CloudDataSource.C2((Resource) obj);
            }
        }).blockingFirst(null);
        if (TextUtils.isEmpty(str2)) {
            HMLog.w(y, "未找到对应的卡号, city:" + str, new Object[0]);
            return Resource.success(Boolean.FALSE);
        }
        IHuamiWebApi iHuamiWebApiX0 = X0();
        Config config = this.b;
        PayResponse<Unit> payResponseUploadTransactions = iHuamiWebApiX0.uploadTransactions(config.userId, str, str2, config.deviceId, arrayList);
        if (payResponseUploadTransactions.isSuccessful()) {
            return Resource.success(Boolean.TRUE);
        }
        HMLog.w(y, "上传消费记录失败, city:" + str + ":" + payResponseUploadTransactions.toString(), new Object[0]);
        return Resource.success(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource E1(String str, String str2) throws Exception {
        PayResponse<SiteInfo> siteInfo = P2().getSiteInfo(str, str2);
        if (!siteInfo.isSuccessful()) {
            return Resource.error("", null);
        }
        SiteInfo data = siteInfo.getData();
        return data == null ? Resource.error("", null) : Resource.success(new BusSiteInfo(data.getTrafficType(), data.getSiteName(), data.getConsumptionType(), data.getLineNo()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource E2(List list, String str, String str2) throws Exception {
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                NFCTransEntity nFCTransEntity = (NFCTransEntity) it2.next();
                arrayList.add(new TransEntity(nFCTransEntity.getSource(), nFCTransEntity.getAid(), nFCTransEntity.getTransId(), nFCTransEntity.getTime(), nFCTransEntity.getAmount(), TransType.from(nFCTransEntity.getType()), nFCTransEntity.getPosId(), nFCTransEntity.getOverdraftLimit()));
            }
            IHuamiWebApi iHuamiWebApiX0 = X0();
            Config config = this.b;
            PayResponse<Unit> payResponseUploadTransactions = iHuamiWebApiX0.uploadTransactions(config.userId, str, str2, config.deviceId, arrayList);
            if (!payResponseUploadTransactions.isSuccessful()) {
                HMLog.w(y, "从网络上传交易事件失败:" + payResponseUploadTransactions.toString(), new Object[0]);
                return Helpers.l(payResponseUploadTransactions);
            }
        }
        return Resource.success(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource F1(XiaomiBulletinType xiaomiBulletinType, String str, String str2) throws Exception {
        if (!isForMi()) {
            return Resource.success(null);
        }
        PayResponse<List<XiaomiBulletin>> payResponseBulletins = T2().bulletins(xiaomiBulletinType.getType(), str, BusCardExtensions.fromAppCode(str2).getAid());
        return payResponseBulletins.isSuccessful() ? Resource.success(M0(payResponseBulletins.getData())) : Resource.error(payResponseBulletins.getCode(), payResponseBulletins.getMessage(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource F2(List list, String str, String str2) throws Exception {
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Order order = (Order) it2.next();
                TransType transTypeK = Helpers.k(order.state);
                if (transTypeK != null) {
                    arrayList.add(new TransEntity("", "", "", order.timestamp, order.amount, transTypeK, "", 0));
                }
            }
            IHuamiWebApi iHuamiWebApiX0 = X0();
            Config config = this.b;
            PayResponse<Unit> payResponseUploadTransactions = iHuamiWebApiX0.uploadTransactions(config.userId, str, str2, config.deviceId, arrayList);
            if (!payResponseUploadTransactions.isSuccessful()) {
                HMLog.w(y, "从网络上传交易记录失败:" + payResponseUploadTransactions.toString(), new Object[0]);
                return Helpers.l(payResponseUploadTransactions);
            }
        }
        return Resource.success(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource G1() throws Exception {
        if (!isForMi()) {
            return Resource.success(null);
        }
        PayResponse<List<XiaomiNoticesEntity>> notices = T2().getNotices();
        if (!notices.isSuccessful()) {
            return Helpers.l(notices);
        }
        ArrayList arrayList = new ArrayList();
        if (notices.getData() == null || notices.getData().isEmpty()) {
            return Resource.success(arrayList);
        }
        for (XiaomiNoticesEntity xiaomiNoticesEntity : notices.getData()) {
            arrayList.add(new XiaomiNotice(xiaomiNoticesEntity.getAppCode(), xiaomiNoticesEntity.getCardName(), xiaomiNoticesEntity.getStatus(), xiaomiNoticesEntity.getType(), xiaomiNoticesEntity.getDescription()));
        }
        return Resource.success(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Resource G2(long j, long j2) throws Exception {
        if (j <= j2) {
            return Resource.success("");
        }
        HMLog.w(y, "() -> 卡片已过期, expireDate:" + j2 + ", now:" + j, new Object[0]);
        return Resource.error(ErrorCode.CARD_EXPIRED, "卡片已过期", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean H1() {
        return l.e(this.b.context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ CardInfo H2(PayResponse payResponse, Object obj) {
        return (CardInfo) payResponse.getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I1() {
        IHuamiWebApi value = this.j.getValue();
        m mVar = new m();
        this.i = mVar;
        this.d = (IHuamiWebApi) Proxy.newProxyInstance(value.getClass().getClassLoader(), value.getClass().getInterfaces(), new n("Wallet-HuamiWebApi", new b(value, mVar), new com.huami.wallet.datasource.cloud.a() { // from class: com.huami.wallet.datasource.cloud.e
            @Override // com.huami.wallet.datasource.cloud.a
            public final boolean getAsBoolean() {
                return this.a.H1();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource I2(String str, String str2) throws Exception {
        PayResponse<Unit> payResponseVerifyCaptcha = X0().verifyCaptcha(this.b.userId, str, str2);
        if (payResponseVerifyCaptcha.isSuccessful()) {
            return Resource.success(new Object());
        }
        HMLog.w(y, "从网络请求验证短信验证码失败:" + payResponseVerifyCaptcha.toString(), new Object[0]);
        return Const.InternalErrorCode.HTTP_SMS_CODE_NOT_MATCHED.equals(payResponseVerifyCaptcha.getCode()) ? Resource.error(ErrorCode.SMS_CODE_NOT_MATCHED, payResponseVerifyCaptcha.getMessage(), null) : Helpers.l(payResponseVerifyCaptcha);
    }

    @WorkerThread
    private SeAppletApi J0() {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    l.b("create applet api", new Runnable() { // from class: nq0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.e1();
                        }
                    });
                }
            }
        }
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource J1(String str, String str2, String str3) throws Exception {
        PayResponse<Unit> payResponseIssueCard;
        String message;
        CitySimpleInfo cityInfo = CitySimpleInfoCache.INSTANCE.getCityInfo(str);
        if (cityInfo == null) {
            return Resource.error(ErrorCode.CARD_NOT_FOUNDED, "没有找到匹配的公家卡", null);
        }
        if (isForMi()) {
            Pair<String, Resource<String>> pairV0 = V0(str2, 1, "issueCardToDevice", str);
            Object obj = pairV0.second;
            if (obj != null) {
                return (Resource) obj;
            }
            payResponseIssueCard = T2().issueCard(cityInfo.getAppCode(), cityInfo.getAid(), this.b.deviceId, (String) pairV0.first, str3, this.x);
        } else {
            PayResponse<String> phoneNumber = X0().getPhoneNumber(this.b.userId);
            if (!phoneNumber.isSuccessful()) {
                HMLog.w(y, "从网络获取绑定的手机号失败" + phoneNumber.toString(), new Object[0]);
                return Helpers.l(phoneNumber);
            }
            if (phoneNumber.getData() == null) {
                HMLog.w(y, "从网络获取绑定的手机号，发现尚未绑定:" + phoneNumber.toString(), new Object[0]);
                return Resource.error("c0007", "未绑定手机号", "未绑定手机号");
            }
            ExtraInfo extraInfo = new ExtraInfo();
            extraInfo.setPhoneNumber(phoneNumber.getData());
            String value = ApduAction.IssueCard.getValue();
            if (Z0(str2)) {
                value = ApduAction.IssueAndCharge.getValue();
            }
            payResponseIssueCard = P2().issueCard(cityInfo.getAppCode(), this.b.deviceId, str2, extraInfo, value);
        }
        if (payResponseIssueCard.isSuccessful()) {
            this.i.a(str);
            K0(ChangeCityType.IssueCard, str);
            return Resource.success("");
        }
        ResponseError error = EntityKt.getError(payResponseIssueCard);
        String code = error != null ? error.getCode() : "";
        String message2 = error != null ? error.getMessage() : "";
        String code2 = ErrorCode.CARD_ERROR;
        if (error == null) {
            code2 = payResponseIssueCard.getCode();
            message = payResponseIssueCard.getMessage();
        } else if (code.startsWith("01")) {
            message = WalletConfig.isShowMessage().getA().booleanValue() ? String.format("(%s)%s", code, payResponseIssueCard.getMessage()) : String.format("(%s)", code);
        } else if (code.startsWith("02")) {
            message = WalletConfig.isShowMessage().getA().booleanValue() ? String.format("(%s)%s", code, payResponseIssueCard.getMessage()) : String.format("(%s)，%s", code, message2);
        } else {
            message = code;
        }
        HMLog.w(y, " 向设备写入开卡信息失败:" + payResponseIssueCard.toString() + ", cardErrorCode:" + code + ", cardErrorMsg:" + message2, new Object[0]);
        if (TextUtils.isEmpty(message2)) {
            message2 = payResponseIssueCard.getMessage();
        }
        return Resource.error(code2, message, message2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean J2() {
        return l.e(this.b.context);
    }

    private void K0(ChangeCityType changeCityType, String str) {
        Q2().notifyToDevice(str, changeCityType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource K1(String str) throws Exception {
        PayResponse<List<CityInfoEntity>> availableCitiesWithStatus = X0().getAvailableCitiesWithStatus(this.b.deviceId, Double.valueOf(U0()), Double.valueOf(R0()), S0(this.i), Q0());
        if (!availableCitiesWithStatus.isSuccessful()) {
            HMLog.w(y, "从网络获取所有可用城市列表失败," + availableCitiesWithStatus.toString(), new Object[0]);
            return Helpers.l(availableCitiesWithStatus);
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        boolean z2 = (str == null || str.isEmpty()) ? false : true;
        if (availableCitiesWithStatus.getData() != null && !availableCitiesWithStatus.getData().isEmpty()) {
            if (!z2) {
                for (CityInfoEntity cityInfoEntity : availableCitiesWithStatus.getData()) {
                    if (cityInfoEntity.getParentAppCode() != null && !cityInfoEntity.getParentAppCode().isEmpty()) {
                        hashSet.add(cityInfoEntity.getParentAppCode());
                    }
                }
            }
            for (CityInfoEntity cityInfoEntity2 : availableCitiesWithStatus.getData()) {
                hashSet.contains(cityInfoEntity2.getAppCode());
                if ((cityInfoEntity2.getAppCode() != null && !cityInfoEntity2.getAppCode().isEmpty()) || !z2) {
                    if ((cityInfoEntity2.isRecommend() != null && cityInfoEntity2.isRecommend().booleanValue()) || z2 || !hashSet.contains(cityInfoEntity2.getParentAppCode())) {
                        if (!z2 || (cityInfoEntity2.getParentAppCode() != null && !cityInfoEntity2.getParentAppCode().isEmpty() && str.equals(cityInfoEntity2.getParentAppCode()))) {
                            int iG = Helpers.g(cityInfoEntity2.getStatus());
                            if (hashSet.contains(cityInfoEntity2.getAppCode())) {
                                iG = 0;
                            }
                            if (iG != -1 && cityInfoEntity2.getAppCode() != null && !cityInfoEntity2.getAppCode().isEmpty()) {
                                BusCardListItem busCardListItem = new BusCardListItem();
                                busCardListItem.shiftBalance = cityInfoEntity2.getBalance();
                                busCardListItem.id = cityInfoEntity2.getAppCode();
                                busCardListItem.aid = cityInfoEntity2.getAid();
                                busCardListItem.name = cityInfoEntity2.getCardName();
                                busCardListItem.imageUrl = cityInfoEntity2.getOpenedImgUrl();
                                busCardListItem.description = cityInfoEntity2.getServiceScope();
                                busCardListItem.state = iG;
                                busCardListItem.orderId = cityInfoEntity2.getOrderId();
                                busCardListItem.xiaomiCardName = cityInfoEntity2.getXiaomiCityCode();
                                busCardListItem.isMot = cityInfoEntity2.getType() == 2;
                                busCardListItem.cardCode = cityInfoEntity2.getCardCode();
                                busCardListItem.shiftEnable = cityInfoEntity2.getShiftEnable();
                                busCardListItem.isRecommend = cityInfoEntity2.isRecommend();
                                busCardListItem.xmActionToken = cityInfoEntity2.getXmActionToken();
                                busCardListItem.parentAppCode = cityInfoEntity2.getParentAppCode();
                                busCardListItem.appName = cityInfoEntity2.getAppName();
                                busCardListItem.packageName = cityInfoEntity2.getPackageName();
                                busCardListItem.serviceContact = cityInfoEntity2.getServiceContact();
                                busCardListItem.redirectTo = cityInfoEntity2.getRedirectTo();
                                busCardListItem.isParent = hashSet.contains(cityInfoEntity2.getAppCode());
                                busCardListItem.xmReturnFeeFlg = cityInfoEntity2.getXmReturnFeeFlg();
                                busCardListItem.xmReturnCardFlg = cityInfoEntity2.getXmReturnCardFlg();
                                busCardListItem.refundEnable = cityInfoEntity2.getRefundEnable();
                                busCardListItem.refundAccountCollectModes = cityInfoEntity2.getRefundAccountCollectModes();
                                arrayList.add(busCardListItem);
                                if (!hashSet.contains(cityInfoEntity2.getAppCode())) {
                                    CitySimpleInfoCache.INSTANCE.putCityInfo(cityInfoEntity2.getAppCode(), CitySimpleInfoKt.toCitySimpleInfo(cityInfoEntity2));
                                }
                            }
                        }
                    }
                }
            }
        }
        return Resource.success(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K2() {
        IXiaomiWebApi value = this.m.getValue();
        this.f = (IXiaomiWebApi) Proxy.newProxyInstance(value.getClass().getClassLoader(), value.getClass().getInterfaces(), new n("Wallet-XiaomiWebApi", value, new com.huami.wallet.datasource.cloud.a() { // from class: com.huami.wallet.datasource.cloud.f
            @Override // com.huami.wallet.datasource.cloud.a
            public final boolean getAsBoolean() {
                return this.a.J2();
            }
        }));
    }

    @WorkerThread
    private IDeviceApi L0() {
        if (this.g == null) {
            synchronized (this) {
                if (this.g == null) {
                    this.g = this.n.getValue();
                }
            }
        }
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource L1(String str) throws Exception {
        try {
            PayResponse<Integer> balance = J0().getBalance(str);
            if (!balance.isSuccessful()) {
                return Helpers.l(balance);
            }
            if (balance.getData() == null) {
                return Resource.error(Const.InternalErrorCode.CODE_NO_BALANCE, "从设备查询卡片余额数据为空", null);
            }
            BusCardBalance busCardBalance = new BusCardBalance();
            busCardBalance.id = str;
            busCardBalance.balance = balance.getData().intValue();
            return Resource.success(busCardBalance);
        } catch (BalanceException unused) {
            return Resource.error(ErrorCode.BALANCE_EXCEPTION, "钱包和透支区都有值", null);
        } catch (OverdraftException unused2) {
            return Resource.error(ErrorCode.OVERDRAFT, "透支区负值", null);
        }
    }

    private boolean L2(String str) {
        return "0010".equals(str) || ConstantKt.APP_CODE_SHANG_HAI.equals(str) || ConstantKt.APP_CODE_JJJ.equals(str);
    }

    private XiaomiBulletin M0(List<XiaomiBulletin> list) {
        if (list != null && !list.isEmpty()) {
            for (XiaomiBulletin xiaomiBulletin : list) {
                if (!Y0(xiaomiBulletin)) {
                    return xiaomiBulletin;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource M1(String str, String str2) throws Exception {
        PayResponse<List<TransEntity>> transactionsRecord = X0().getTransactionsRecord(this.b.userId, str, str2, 1, Long.valueOf(System.currentTimeMillis()), 1000);
        if (!transactionsRecord.isSuccessful()) {
            HMLog.w(y, "从网络获取交易记录失败:" + transactionsRecord.toString(), new Object[0]);
            return Helpers.l(transactionsRecord);
        }
        ArrayList arrayList = new ArrayList();
        if (transactionsRecord.getData() != null) {
            for (TransEntity transEntity : transactionsRecord.getData()) {
                if (transEntity.getType() == TransType.Consume) {
                    arrayList.add(new ConsumeRecord(transEntity.getTime(), transEntity.getAmount()));
                }
            }
        }
        return Resource.success(arrayList);
    }

    @WorkerThread
    private NfcBleApi M2() {
        if (this.h == null) {
            synchronized (this) {
                if (this.h == null) {
                    l.b("create Ble api", new Runnable() { // from class: kq0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.f2();
                        }
                    });
                }
            }
        }
        return this.h;
    }

    private PayResponse<OrderEntity> N0(String str, int i, Integer num, int i2, PayMode payMode, PayType payType, Processor<Resource<String>, Resource<String>> processor) throws Exception {
        try {
            PayChannel payChannelR2 = R2(payMode, str);
            if (!isForMi()) {
                return P2().generateOrder(str, payChannelR2, i2, payType);
            }
            PayResponse<OrderEntity> payResponseGenerateOrder = T2().generateOrder(i, num, Double.valueOf(U0()), Double.valueOf(R0()), payChannelR2 == PayChannel.MiPay ? null : new MiPayChannelInfo(payChannelR2, this.b.hostAppPackageName), null, null);
            if (!payResponseGenerateOrder.isSuccessful() || payResponseGenerateOrder.getData() == null) {
                this.x = null;
                return payResponseGenerateOrder;
            }
            this.x = payResponseGenerateOrder.getData().getCityId();
            return payResponseGenerateOrder;
        } catch (Exception e) {
            processor.onNext(Resource.error("w10000", e.getMessage(), null));
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ BusCardDetail N1(String str, CardInfo cardInfo, String str2) {
        BusCardDetail busCardDetail = new BusCardDetail();
        busCardDetail.id = str;
        busCardDetail.number = str2;
        if (cardInfo != null) {
            busCardDetail.activeDate = cardInfo.getActivationDate();
            busCardDetail.expireDate = cardInfo.getExpiredDate();
            busCardDetail.balance = cardInfo.getBalance();
            busCardDetail.isBalanceFromCached = false;
        }
        return busCardDetail;
    }

    private Resource<String> N2(Activity activity, String str, int i, Integer num, int i2, PayMode payMode, PayType payType, Processor<Resource<String>, Resource<String>> processor) throws Exception {
        Resource<String> resourceError;
        processor.onNext(Resource.loading(null));
        PayResponse<OrderEntity> payResponseN0 = N0(str, i, num, i2, payMode, payType, processor);
        if (!payResponseN0.isSuccessful()) {
            HMLog.w(y, "生成订单失败, city:" + str + ":" + payResponseN0.toString(), new Object[0]);
            if (ErrorCode.NETWORK_ERROR.equals(payResponseN0.getCode())) {
                resourceError = Helpers.l(payResponseN0);
            } else if (payResponseN0.getCode().startsWith("http401")) {
                resourceError = Resource.error(payResponseN0.getCode(), payResponseN0.getMessage(), null);
            } else if (payResponseN0.getCode().equals(ErrorCode.BEIJING_NEED_UPDATE)) {
                resourceError = Resource.error(payResponseN0.getCode(), Helpers.f(payResponseN0.getRawMessage()), null);
            } else {
                resourceError = Resource.error(ErrorCode.FAILED_TO_MAKE_ORDER, "Cause:\n code: " + payResponseN0.getCode() + "\n msg: " + payResponseN0.getMessage(), null);
            }
            processor.onNext(resourceError);
            return resourceError;
        }
        if (payResponseN0.getData() == null) {
            HMLog.w(y, "生成的订单无数据, city:" + str + ":" + payResponseN0.toString(), new Object[0]);
            StringBuilder sb = new StringBuilder();
            sb.append("No order generated for ");
            sb.append(payType);
            Resource<String> resourceError2 = Resource.error(ErrorCode.FAILED_TO_MAKE_ORDER, sb.toString(), null);
            processor.onNext(resourceError2);
            return resourceError2;
        }
        String data = payResponseN0.getData().getData();
        String orderNum = payResponseN0.getData().getOrderNum();
        processor.onNext(Resource.success(orderNum));
        if (isForMi()) {
            if (payMode == PayMode.MI_PAY) {
                MiPayResponse miPayResponsePay = Mipay.pay(activity, data);
                HMLog.w(y, "小米收银台小米钱包支付:city:" + str + ", response:" + miPayResponsePay, new Object[0]);
                if (!miPayResponsePay.isSuccessful()) {
                    return Resource.error(String.valueOf(miPayResponsePay.getCode()), miPayResponsePay.getMessage(), null);
                }
            } else if (payMode == PayMode.WECHAT_PAY) {
                WeChatResponse weChatResponsePay = WeChatPay.pay(activity, data);
                HMLog.w(y, "小米收银台微信支付: city:" + str + ", response:" + weChatResponsePay, new Object[0]);
                if (!weChatResponsePay.isSuccessful()) {
                    return Resource.error(String.valueOf(weChatResponsePay.getCode()), weChatResponsePay.getMessage(), null);
                }
            } else if (payMode == PayMode.ALIPAY) {
                AliPayResponse aliPayResponsePay = new AliPay().pay(activity, data);
                HMLog.w(y, "payOrder() -> 小米收银台支付宝支付" + aliPayResponsePay.isSuccessful() + ", busCardId:" + str + ", code:" + aliPayResponsePay.getCode() + ", msg:" + aliPayResponsePay.getMessage(), new Object[0]);
                if (!aliPayResponsePay.isSuccessful()) {
                    return "6001".equals(aliPayResponsePay.getCode()) ? Resource.error(ErrorCode.PAYMENT_CANCELLED, aliPayResponsePay.getMessage(), null) : Resource.error(aliPayResponsePay.getCode(), aliPayResponsePay.getMessage(), null);
                }
            }
        } else {
            if (i2 == 0 && payType != PayType.Charge) {
                return Resource.success(orderNum);
            }
            if (a.a[payMode.ordinal()] != 1) {
                AliPayResponse aliPayResponsePay2 = new AliPay().pay(activity, data);
                HMLog.w(y, "支付宝支付, city " + str + ":" + aliPayResponsePay2.toString(), new Object[0]);
                if (!aliPayResponsePay2.isSuccessful()) {
                    return "6001".equals(aliPayResponsePay2.getCode()) ? Resource.error(ErrorCode.PAYMENT_CANCELLED, aliPayResponsePay2.getMessage(), null) : Resource.error(aliPayResponsePay2.getCode(), aliPayResponsePay2.getMessage(), null);
                }
            } else {
                WeChatResponse weChatResponsePay2 = WeChatPay.pay(activity, data);
                HMLog.w(y, "微信支付, city:" + str + ", response:" + weChatResponsePay2, new Object[0]);
                if (!weChatResponsePay2.isSuccessful()) {
                    return Resource.error(String.valueOf(weChatResponsePay2.getCode()), weChatResponsePay2.getMessage(), null);
                }
            }
        }
        return Resource.success(orderNum);
    }

    private String O0(List<CityInfoEntity> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            Iterator<CityInfoEntity> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getAid());
            }
        }
        String data = J0().getDefaultCardAid(arrayList).getData();
        return data == null ? "" : data;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.huami.wallet.lib.util.Function O1(final String str, final CardInfo cardInfo) {
        return new com.huami.wallet.lib.util.Function() { // from class: ws0
            @Override // com.huami.wallet.lib.util.Function
            public final Object apply(Object obj) {
                return CloudDataSource.N1(str, cardInfo, (String) obj);
            }
        };
    }

    private <T> Resource<T> O2(PayResponse<T> payResponse) {
        return payResponse.isSuccessful() ? Resource.success(payResponse.getData()) : Resource.error(payResponse.getCode(), payResponse.getMessage(), null);
    }

    private <T> Pair<String, String> P0(PayResponse<T> payResponse) {
        String apiCode = payResponse.getApiCode();
        String code = payResponse.getCode();
        String rawMessage = payResponse.getRawMessage();
        String str = "";
        if (rawMessage == null || code.isEmpty()) {
            rawMessage = "";
        }
        if (apiCode == null || apiCode.isEmpty()) {
            apiCode = "unknown";
        }
        if (TextUtils.isEmpty(code)) {
            code = "unknown";
        }
        if (!apiCode.equals("unknown") && !code.equals("unknown")) {
            str = "(" + apiCode + Constants.ACCEPT_TIME_SEPARATOR_SERVER + code + ")";
        } else if (!apiCode.equals("unknown") || !code.equals("unknown")) {
            if (apiCode.equals("unknown")) {
                str = "(" + apiCode + Constants.ACCEPT_TIME_SEPARATOR_SERVER + code + ")";
            } else {
                str = "(" + apiCode + ")";
            }
        }
        if (str.contains(ErrorCode.NETWORK_ERROR)) {
            str = "(w10015)";
            rawMessage = "网络异常";
        }
        return new Pair<>(str, rawMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ BusCardDetail P1(com.huami.wallet.lib.util.Function function, CardInfo cardInfo) {
        return (BusCardDetail) ((com.huami.wallet.lib.util.Function) function.apply(cardInfo)).apply(cardInfo != null ? cardInfo.getNumber() : null);
    }

    @WorkerThread
    private ISnowballWebApi P2() {
        if (this.e == null) {
            synchronized (this) {
                if (this.e == null) {
                    l.b("create snowball web api", new Runnable() { // from class: mq0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.z2();
                        }
                    });
                }
            }
        }
        return this.e;
    }

    private String Q0() {
        LocationInfo locationInfo = this.t.getValue().getLocationInfo();
        if (locationInfo == null) {
            return null;
        }
        return locationInfo.getCityCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource Q1(final String str) throws Exception {
        PayResponse<String> cardNumber;
        final com.huami.wallet.lib.util.Function function = new com.huami.wallet.lib.util.Function() { // from class: er0
            @Override // com.huami.wallet.lib.util.Function
            public final Object apply(Object obj) {
                return CloudDataSource.O1(str, (CardInfo) obj);
            }
        };
        PayResponse<CardInfo> cardInfo = J0().getCardInfo(str);
        Resource<CardInfo> resourceS2 = S2(cardInfo, "loadBusCardDetailInfo", str);
        if (resourceS2 != null) {
            return resourceS2.map(new com.huami.wallet.lib.util.Function() { // from class: tq0
                @Override // com.huami.wallet.lib.util.Function
                public final Object apply(Object obj) {
                    return CloudDataSource.P1(function, (CardInfo) obj);
                }
            });
        }
        String number = null;
        if (L2(str)) {
            if (!isForMi()) {
                cardNumber = P2().getCardNumber(str);
            } else {
                if (cardInfo.getData() == null) {
                    HMLog.w(y, "从设备获取卡片详情无数据:" + cardInfo.toString(), new Object[0]);
                    return Resource.error(Const.InternalErrorCode.CODE_NO_CARD_DETAIL, "No card detail info", null);
                }
                String aid = CitySimpleInfoCache.INSTANCE.getAid(str);
                if (aid == null) {
                    HMLog.w(y, "找不到匹配的通卡:" + str, new Object[0]);
                    return Resource.error(Const.InternalErrorCode.CODE_NO_CARD_DETAIL, "找不到匹配的通卡", null);
                }
                cardNumber = T2().getCardNumber(aid, cardInfo.getData().getNumber());
            }
            if (!cardNumber.isSuccessful()) {
                HMLog.w(y, "从网络获取卡号失败:" + cardNumber.toString(), new Object[0]);
            }
            if (cardNumber.getData() == null) {
                HMLog.w(y, "从网络获取卡号无数据:" + cardNumber.toString(), new Object[0]);
            }
            number = cardNumber.getData();
        } else if (cardInfo.getData() != null) {
            number = cardInfo.getData().getNumber();
        }
        return Resource.success((BusCardDetail) ((com.huami.wallet.lib.util.Function) function.apply(cardInfo.getData())).apply(number));
    }

    @WorkerThread
    private SyncAppletApi Q2() {
        if (this.u == null) {
            synchronized (this) {
                if (this.u == null) {
                    this.u = new SyncAppletApiImpl(M2(), L0(), this.b.withBleApi, this.p.getValue());
                }
            }
        }
        return this.u;
    }

    private double R0() {
        return this.b.latitudeFunction0.getA().doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String R1(CardInfo cardInfo) {
        if (cardInfo != null) {
            return cardInfo.getNumber();
        }
        return null;
    }

    private PayChannel R2(@NonNull PayMode payMode, @Nullable String str) {
        int i = a.a[payMode.ordinal()];
        if (i == 1) {
            if (a1()) {
                return isForMi() ? PayChannel.WeChatMi : PayChannel.WeChatMifit;
            }
            return PayChannel.WeChatWatch;
        }
        if (i == 3) {
            return PayChannel.MiPay;
        }
        if (a1() && isForMi()) {
            return PayChannel.AlipayMi;
        }
        return (!this.b.testPay || isForSnowballShanghai(str).booleanValue()) ? PayChannel.AliPay : PayChannel.AliPayTest;
    }

    private String S0(m mVar) {
        if (mVar != null && mVar.c() != null && !mVar.c().isEmpty()) {
            for (CityInfoEntity cityInfoEntity : mVar.c()) {
                if (isLingNanTong(cityInfoEntity.getAppCode())) {
                    return cityInfoEntity.getAppCode();
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource S1(String str) throws Exception {
        PayResponse<String> cardNumber;
        PayResponse<CardInfo> cardInfo = J0().getCardInfo(str);
        Resource<CardInfo> resourceS2 = S2(cardInfo, "loadBusCardNumber", str);
        if (resourceS2 != null) {
            return resourceS2.map(new com.huami.wallet.lib.util.Function() { // from class: ht0
                @Override // com.huami.wallet.lib.util.Function
                public final Object apply(Object obj) {
                    return CloudDataSource.R1((CardInfo) obj);
                }
            });
        }
        String number = null;
        if (L2(str)) {
            if (!isForMi()) {
                cardNumber = P2().getCardNumber(str);
            } else {
                if (cardInfo.getData() == null) {
                    HMLog.w(y, "从设备获取卡片详情无数据:" + cardInfo.toString(), new Object[0]);
                    return Resource.error(Const.InternalErrorCode.CODE_NO_CARD_DETAIL, "No card detail info", null);
                }
                String aid = CitySimpleInfoCache.INSTANCE.getAid(str);
                if (aid == null) {
                    HMLog.w(y, "找不到匹配的通卡:" + str, new Object[0]);
                    return Resource.error(Const.InternalErrorCode.CODE_NO_CARD_DETAIL, "找不到匹配的通卡", null);
                }
                cardNumber = T2().getCardNumber(aid, cardInfo.getData().getNumber());
            }
            if (!cardNumber.isSuccessful()) {
                HMLog.w(y, "从网络获取卡号失败:" + cardNumber.toString(), new Object[0]);
                return Helpers.l(cardNumber);
            }
            if (cardNumber.getData() == null) {
                HMLog.w(y, "从网络获取卡号无数据:" + cardNumber.toString(), new Object[0]);
                return Resource.error(Const.InternalErrorCode.CODE_NO_CARD_NUMBER, "Card number not found", null);
            }
            number = cardNumber.getData();
        } else if (cardInfo.getData() != null) {
            number = cardInfo.getData().getNumber();
        }
        return Resource.success(number);
    }

    @Nullable
    private Resource<CardInfo> S2(final PayResponse<CardInfo> payResponse, String str, String str2) {
        if (!payResponse.isSuccessful()) {
            HMLog.w(y, str + "() -> 从设备获取卡片详情失败, city:" + str2 + payResponse.toString(), new Object[0]);
            return Helpers.l(payResponse).map(new com.huami.wallet.lib.util.Function() { // from class: iq0
                @Override // com.huami.wallet.lib.util.Function
                public final Object apply(Object obj) {
                    return CloudDataSource.H2(payResponse, obj);
                }
            });
        }
        if (payResponse.getData() == null) {
            HMLog.w(y, str + "() -> 从设备获取卡片详情无数据, city:" + str2 + payResponse.toString(), new Object[0]);
            return Resource.error(Const.InternalErrorCode.CODE_NO_CARD_DETAIL, "No card detail info", null);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long activationDate = payResponse.getData().getActivationDate();
        long expiredDate = payResponse.getData().getExpiredDate();
        if (!payResponse.getData().getEnable()) {
            HMLog.w(y, str + "() -> 非启用状态卡片, city:" + str2, new Object[0]);
            return Resource.error(ErrorCode.CARD_NOT_ENABLE, "非启用状态卡片", payResponse.getData());
        }
        if (activationDate == -1) {
            HMLog.w(y, str + "() -> 非法的卡片启用日期, city:" + str2, new Object[0]);
            return Resource.error(ErrorCode.INVALID_CARD_ACTIVATE_DATE, "非法的卡片启用日期", payResponse.getData());
        }
        if (expiredDate == -1) {
            HMLog.w(y, str + "() -> 非法的卡片有效期, city:" + str2, new Object[0]);
            return Resource.error(ErrorCode.INVALID_CARD_EXPIRE_DATE, "非法的卡片有效期", payResponse.getData());
        }
        if (activationDate > expiredDate) {
            HMLog.w(y, str + "() -> 卡片启用日期居然大于有效期, activeDate:" + activationDate + ", expireDate:" + expiredDate + ", city:" + str2, new Object[0]);
            return Resource.error(ErrorCode.CARD_ACTIVATE_DATE_GREATER_THAN_EXPIRE_DATE, "卡片有效期居然小于启用日期", payResponse.getData());
        }
        if (jCurrentTimeMillis >= activationDate) {
            return null;
        }
        HMLog.w(y, str + "() -> 卡片未到启用日期, activeDate:" + activationDate + ", now:" + jCurrentTimeMillis + ", city:" + str2, new Object[0]);
        return Resource.error(ErrorCode.CARD_NOT_ACTIVATED, "卡片未到启用日期", payResponse.getData());
    }

    private String T0() {
        PayResponse<String> lingNanTongCityCode = J0().getLingNanTongCityCode();
        if (lingNanTongCityCode.isSuccessful()) {
            return lingNanTongCityCode.getData();
        }
        HMLog.w(y, "getLntCode() -> error" + lingNanTongCityCode.toString(), new Object[0]);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource T1(String str) throws Exception {
        if (isForMi()) {
            PayResponse<List<XiaomiOrderInfoEntity>> orders = T2().getOrders(CitySimpleInfoCache.INSTANCE.getMiCardName(str));
            if (!orders.isSuccessful()) {
                HMLog.w(y, "从网络获取订单列表失败:" + orders.toString(), new Object[0]);
                return Helpers.l(orders);
            }
            ArrayList arrayList = new ArrayList();
            if (orders.getData() != null) {
                for (XiaomiOrderInfoEntity xiaomiOrderInfoEntity : orders.getData()) {
                    if (!"1000".equals(xiaomiOrderInfoEntity.getStatus()) && !Const.OrderStatus.DEDUCTION_FAIL.equals(xiaomiOrderInfoEntity.getStatus()) && !Const.OrderStatus.SHIFT_IN_SUCCESS.equals(xiaomiOrderInfoEntity.getStatus()) && !Const.OrderStatus.SHIFT_OUT_SUCCESS.equals(xiaomiOrderInfoEntity.getStatus())) {
                        PayType xiaomiOrderType = Helpers.parseXiaomiOrderType(xiaomiOrderInfoEntity.getType());
                        RechargeRecord rechargeRecord = new RechargeRecord();
                        rechargeRecord.orderId = xiaomiOrderInfoEntity.getOrderNum();
                        rechargeRecord.timestamp = xiaomiOrderInfoEntity.getTimestamp() * 1000;
                        rechargeRecord.amount = xiaomiOrderInfoEntity.getAmount();
                        rechargeRecord.state = Helpers.h(xiaomiOrderType, xiaomiOrderInfoEntity.getStatus());
                        rechargeRecord.type = Helpers.i(xiaomiOrderType);
                        arrayList.add(rechargeRecord);
                    }
                }
            }
            return Resource.success(arrayList);
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(2018, 0, 1);
        PayResponse<List<OrderInfoEntity>> orders2 = P2().getOrders(str, calendar.getTimeInMillis() / 1000, System.currentTimeMillis() / 1000, OrderCategory.All, 1000);
        if (!orders2.isSuccessful()) {
            HMLog.w(y, "从网络获取订单列表失败:" + orders2.toString(), new Object[0]);
            return Helpers.l(orders2);
        }
        ArrayList arrayList2 = new ArrayList();
        if (orders2.getData() != null) {
            for (OrderInfoEntity orderInfoEntity : orders2.getData()) {
                if (!"1000".equals(orderInfoEntity.getStatus()) && !Const.OrderStatus.DEDUCTION_FAIL.equals(orderInfoEntity.getStatus()) && !Const.OrderStatus.SHIFT_IN_SUCCESS.equals(orderInfoEntity.getStatus()) && !Const.OrderStatus.SHIFT_OUT_SUCCESS.equals(orderInfoEntity.getStatus())) {
                    RechargeRecord rechargeRecord2 = new RechargeRecord();
                    rechargeRecord2.orderId = orderInfoEntity.getOrderNum();
                    rechargeRecord2.timestamp = orderInfoEntity.getTime() * 1000;
                    rechargeRecord2.amount = orderInfoEntity.getAmount();
                    rechargeRecord2.state = Helpers.h(orderInfoEntity.getType(), orderInfoEntity.getStatus());
                    rechargeRecord2.type = Helpers.i(orderInfoEntity.getType());
                    arrayList2.add(rechargeRecord2);
                }
            }
        }
        return Resource.success(arrayList2);
    }

    @WorkerThread
    private IXiaomiWebApi T2() {
        if (this.f == null) {
            synchronized (this) {
                if (this.f == null) {
                    l.b("create xiaomi web api", new Runnable() { // from class: oq0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.K2();
                        }
                    });
                }
            }
        }
        return this.f;
    }

    private double U0() {
        return this.b.longitudeFunction0.getA().doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ BusCardValidity U1(String str, CardInfo cardInfo) {
        BusCardValidity busCardValidity = new BusCardValidity();
        busCardValidity.id = str;
        if (cardInfo != null) {
            busCardValidity.activeDate = cardInfo.getActivationDate();
            busCardValidity.expireDate = cardInfo.getExpiredDate();
        }
        return busCardValidity;
    }

    private Pair<String, Resource<String>> V0(String str, int i, String str2, String str3) {
        String token;
        PayResponse<XiaomiOrderInfoEntity> orderInfo = T2().getOrderInfo(str, null, null);
        if (!orderInfo.isSuccessful() || orderInfo.getData() == null || orderInfo.getData().getTokens() == null) {
            try {
                Thread.sleep(8000L);
            } catch (InterruptedException e) {
                HMLog.w(y, "小米订单延迟8秒获取状态时出错：" + e.getMessage(), new Object[0]);
            }
            orderInfo = T2().getOrderInfo(str, null, null);
        }
        if (!orderInfo.isSuccessful()) {
            HMLog.w(y, str2 + "() -> 从网络获取订单详情失败, city:" + str3 + ":" + orderInfo.toString(), new Object[0]);
            return new Pair<>(null, Helpers.l(orderInfo));
        }
        if (orderInfo.getData() == null || orderInfo.getData().getTokens() == null) {
            HMLog.w(y, str2 + "() -> 从网络获取订单详情无数据, city:" + str3 + ":" + orderInfo.toString(), new Object[0]);
            return new Pair<>(null, Resource.error(Const.InternalErrorCode.CODE_NO_ORDER_INFO, "无订单数据", "无订单数据"));
        }
        Iterator<ActionToken> it2 = orderInfo.getData().getTokens().iterator();
        while (true) {
            if (!it2.hasNext()) {
                token = null;
                break;
            }
            ActionToken next = it2.next();
            if (next.getType() == i) {
                token = next.getToken();
                break;
            }
        }
        if (token != null) {
            return new Pair<>(token, null);
        }
        HMLog.w(y, str2 + "() -> 订单无需要的token city:" + str3 + ":" + orderInfo.toString(), new Object[0]);
        return new Pair<>(null, Resource.error(Const.InternalErrorCode.CODE_NO_ORDER_TOKEN, "订单无需要的token", "订单无需要的token"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource V1(final String str) throws Exception {
        com.huami.wallet.lib.util.Function<CardInfo, R> function = new com.huami.wallet.lib.util.Function() { // from class: pr0
            @Override // com.huami.wallet.lib.util.Function
            public final Object apply(Object obj) {
                return CloudDataSource.U1(str, (CardInfo) obj);
            }
        };
        PayResponse<CardInfo> cardInfo = J0().getCardInfo(str);
        Resource<CardInfo> resourceS2 = S2(cardInfo, "loadBusCardValidity", str);
        return resourceS2 != null ? resourceS2.map(function) : Resource.success((BusCardValidity) function.apply(cardInfo.getData()));
    }

    private boolean W0(XiaomiOrderInfoEntity xiaomiOrderInfoEntity) {
        if (xiaomiOrderInfoEntity.getTokens() != null) {
            for (ActionToken actionToken : xiaomiOrderInfoEntity.getTokens()) {
                if (actionToken.getToken() == null || actionToken.getToken().isEmpty()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource W1() throws Exception {
        return O2(this.q.getValue().getCplc(this.p.getValue().getSn()));
    }

    private IHuamiWebApi X0() {
        if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    l.b("create huami web api", new Runnable() { // from class: lq0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.I1();
                        }
                    });
                }
            }
        }
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource X1(OrderType orderType, String str) throws Exception {
        PayType payType;
        PayResponse<List<TransAmountEntity>> transactionAmount;
        int i = a.b[orderType.ordinal()];
        if (i == 1) {
            payType = PayType.OpenOrCharge;
        } else if (i == 2) {
            payType = PayType.OpenAndCharge;
        } else {
            if (i != 3) {
                return Resource.error(Const.InternalErrorCode.CODE_NO_ORDER_TYPE, "缺少交易类型", null);
            }
            payType = PayType.Charge;
        }
        if (isForMi()) {
            transactionAmount = T2().getTransactionAmount(CitySimpleInfoCache.INSTANCE.getMiCardName(str), payType);
        } else {
            if (ShangHai.INSTANCE.getAppCode().equals(str) && payType == PayType.OpenOrCharge) {
                payType = PayType.OpenAndCharge;
            }
            transactionAmount = P2().getTransactionAmount(str, payType);
        }
        if (!transactionAmount.isSuccessful()) {
            HMLog.w(y, "从网络获取充值金额失败:" + transactionAmount.toString(), new Object[0]);
            return Helpers.l(transactionAmount);
        }
        if (transactionAmount.getData() == null || transactionAmount.getData().isEmpty()) {
            HMLog.w(y, "从网络获取充值金额无数据:" + transactionAmount.toString(), new Object[0]);
            return Resource.error(Const.InternalErrorCode.CODE_NO_RECHARGE_AMOUNTS, "无可用充值金额, city:" + str, null);
        }
        ArrayList arrayList = new ArrayList();
        for (TransAmountEntity transAmountEntity : transactionAmount.getData()) {
            Fee fee = new Fee();
            fee.id = transAmountEntity.getFreeId() != null ? transAmountEntity.getFreeId().intValue() : 0;
            fee.rechargeAmountRaw = transAmountEntity.getChargeAmount();
            fee.rechargeAmountDiscount = transAmountEntity.getChargeAmount() - transAmountEntity.getChargeCouponAmount();
            fee.serviceChargeRaw = transAmountEntity.getAmount();
            fee.serviceChargeDiscount = transAmountEntity.getAmount() - transAmountEntity.getCouponAmount();
            fee.type = transAmountEntity.getType();
            arrayList.add(fee);
        }
        return Resource.success(arrayList);
    }

    private boolean Y0(XiaomiBulletin xiaomiBulletin) {
        Config config = this.b;
        return BusKeeper.isBulletinExist(config.context, config.userId, xiaomiBulletin.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource Y1(String str) throws Exception {
        PayResponse<List<XiaomiOrderInfoEntity>> orders = T2().getOrders(CitySimpleInfoCache.INSTANCE.getMiCardName(str));
        int i = 0;
        if (!orders.isSuccessful()) {
            HMLog.w(y, "从网络获取订单列表失败" + orders.toString(), new Object[0]);
            return Helpers.l(orders);
        }
        if (orders.getData() != null) {
            int amount = 0;
            for (XiaomiOrderInfoEntity xiaomiOrderInfoEntity : orders.getData()) {
                if ((xiaomiOrderInfoEntity.getType() == 1 || xiaomiOrderInfoEntity.getType() == 3) && xiaomiOrderInfoEntity.getStatus().equals("0000")) {
                    List<ActionToken> tokens = xiaomiOrderInfoEntity.getTokens();
                    Objects.requireNonNull(tokens);
                    for (ActionToken actionToken : tokens) {
                        if (actionToken.getType() == 1) {
                            amount = actionToken.getAmount();
                            break;
                        }
                    }
                }
            }
            i = amount;
        }
        return Resource.success(Integer.valueOf(i));
    }

    private boolean Z0(String str) {
        PayResponse<OrderInfoEntity> orderInfo = P2().getOrderInfo(str);
        if (!orderInfo.isSuccessful() || orderInfo.getData() == null) {
            return false;
        }
        OrderInfoEntity data = orderInfo.getData();
        return data.getType() == PayType.OpenAndCharge && Const.OrderStatus.DEDUCTED_BUT_NOT_CONFIRM.equalsIgnoreCase(data.getStatus());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource Z1() throws Exception {
        if (isForMi()) {
            return Resource.success(null);
        }
        PayResponse<List<NoticesEntity>> notices = X0().getNotices();
        if (!notices.isSuccessful()) {
            return Helpers.l(notices);
        }
        ArrayList arrayList = new ArrayList();
        List<NoticesEntity> data = notices.getData();
        Objects.requireNonNull(data);
        for (Iterator<NoticesEntity> it2 = data.iterator(); it2.hasNext(); it2 = it2) {
            NoticesEntity next = it2.next();
            arrayList.add(new Notice(next.getId(), next.getStartTime(), next.getEndTime(), next.getAppCode(), next.getContext(), next.getNoticeType(), next.isSupportCrossBarJump(), next.getCrossBarJumpUrl(), next.getLoopType(), next.getUpdateTime(), next.getActionType()));
        }
        return Resource.success(arrayList);
    }

    private boolean a1() {
        return "com.xiaomi.hm.health".equals(this.b.hostAppPackageName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a2(CityInfoEntity cityInfoEntity, CityInfoEntity cityInfoEntity2) {
        return (int) (cityInfoEntity.getOpenTime() - cityInfoEntity2.getOpenTime());
    }

    private boolean b1(String str) {
        return isForMi() && ConstantKt.APP_CODE_SHEN_ZHEN_MOT.equalsIgnoreCase(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource b2() throws Exception {
        PayResponse<List<CityInfoEntity>> installedBusCards = X0().getInstalledBusCards(this.b.deviceId, T0());
        if (!installedBusCards.isSuccessful()) {
            HMLog.w(y, "从网络获取已开通卡片列表失败, code:" + installedBusCards.toString(), new Object[0]);
            return Helpers.l(installedBusCards);
        }
        ArrayList arrayList = new ArrayList();
        String strO0 = this.w;
        if (strO0 == null) {
            strO0 = O0(installedBusCards.getData());
        }
        if (strO0.length() == 0) {
            this.w = "";
            this.v = "";
        } else {
            this.w = strO0;
        }
        if (installedBusCards.getData() != null && !installedBusCards.getData().isEmpty()) {
            Collections.sort(installedBusCards.getData(), new Comparator() { // from class: pq0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return CloudDataSource.a2((CityInfoEntity) obj, (CityInfoEntity) obj2);
                }
            });
            for (CityInfoEntity cityInfoEntity : installedBusCards.getData()) {
                CitySimpleInfoCache.INSTANCE.putCityInfo(cityInfoEntity.getAppCode(), CitySimpleInfoKt.toCitySimpleInfo(cityInfoEntity));
                BusCardSimple2 busCardSimple2 = new BusCardSimple2();
                busCardSimple2.id = cityInfoEntity.getAppCode();
                busCardSimple2.name = cityInfoEntity.getCardName();
                busCardSimple2.imageUrl = cityInfoEntity.getOpenedImgUrl();
                busCardSimple2.cardNumber = cityInfoEntity.getCardId();
                busCardSimple2.xiaomiCardName = cityInfoEntity.getXiaomiCityCode();
                busCardSimple2.shiftEnable = cityInfoEntity.getShiftEnable();
                busCardSimple2.appName = cityInfoEntity.getAppName();
                busCardSimple2.packageName = cityInfoEntity.getPackageName();
                busCardSimple2.serviceContact = cityInfoEntity.getServiceContact();
                busCardSimple2.redirectTo = cityInfoEntity.getRedirectTo();
                busCardSimple2.xmReturnFeeFlg = cityInfoEntity.getXmReturnFeeFlg();
                busCardSimple2.xmReturnCardFlg = cityInfoEntity.getXmReturnCardFlg();
                busCardSimple2.refundEnable = cityInfoEntity.getRefundEnable();
                busCardSimple2.refundAccountCollectModes = cityInfoEntity.getRefundAccountCollectModes();
                boolean zEquals = TextUtils.equals(strO0, cityInfoEntity.getAid());
                busCardSimple2.isDefault = zEquals;
                if (zEquals) {
                    arrayList.add(0, busCardSimple2);
                    this.v = cityInfoEntity.getAppCode();
                } else {
                    arrayList.add(busCardSimple2);
                }
            }
        }
        return Resource.success(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource c1(long j, String str) throws Exception {
        if (isForMi()) {
            T2().agreeProtocol(j);
            return Resource.success("");
        }
        PayResponse<String> payResponseAgreeProtocol = X0().agreeProtocol(str, j);
        if (payResponseAgreeProtocol.isSuccessful()) {
            HMLog.i(y, "agreeProtocolResponse : " + payResponseAgreeProtocol.toString(), new Object[0]);
            return Resource.success(payResponseAgreeProtocol.getData());
        }
        HMLog.w(y, "agreeProtocolResponse : " + payResponseAgreeProtocol.toString(), new Object[0]);
        return Resource.error(payResponseAgreeProtocol.getCode(), payResponseAgreeProtocol.getMessage(), payResponseAgreeProtocol.getData());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Resource c2(String str, PayResponse payResponse) {
        if (!payResponse.isSuccessful()) {
            HMLog.w(y, "从网络获取订单详情失败:" + payResponse.toString(), new Object[0]);
            return Helpers.l(payResponse);
        }
        if (payResponse.getData() != null) {
            return null;
        }
        HMLog.w(y, "从网络获取订单详情无数据:" + payResponse.toString(), new Object[0]);
        return Resource.error(Const.InternalErrorCode.CODE_NO_ORDER_INFO, "无订单数据，orderId:" + str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource d1(String str, Long l) throws Exception {
        if (!isForMi()) {
            PayResponse<String> payResponseAgreeShiftProtocol = X0().agreeShiftProtocol(str, l);
            if (!payResponseAgreeShiftProtocol.isSuccessful()) {
                HMLog.w(y, "agreeShiftProtocol : " + payResponseAgreeShiftProtocol.toString(), new Object[0]);
                return Resource.error(payResponseAgreeShiftProtocol.getCode(), payResponseAgreeShiftProtocol.getMessage(), payResponseAgreeShiftProtocol.getData());
            }
            HMLog.i(y, "agreeShiftProtocol : " + payResponseAgreeShiftProtocol.toString(), new Object[0]);
        }
        return Resource.success("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource d2(final String str, String str2, String str3) throws Exception {
        Order orderJ;
        com.huami.wallet.lib.util.Function function = new com.huami.wallet.lib.util.Function() { // from class: as0
            @Override // com.huami.wallet.lib.util.Function
            public final Object apply(Object obj) {
                return CloudDataSource.c2(str, (PayResponse) obj);
            }
        };
        if (isForMi()) {
            PayResponse<XiaomiOrderInfoEntity> orderInfo = T2().getOrderInfo(str, str2, str3);
            Resource resource = (Resource) function.apply(orderInfo);
            if (resource != null || orderInfo.getData() == null) {
                return resource;
            }
            orderJ = Helpers.parseXiaoMiOrder(orderInfo.getData());
        } else {
            PayResponse<OrderInfoEntity> orderInfo2 = P2().getOrderInfo(str);
            Resource resource2 = (Resource) function.apply(orderInfo2);
            if (resource2 != null || orderInfo2.getData() == null) {
                return resource2;
            }
            orderJ = Helpers.j(orderInfo2.getData());
        }
        return Resource.success(orderJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e1() {
        SeAppletApi value = this.o.getValue();
        NfcBleApi value2 = this.l.getValue();
        Config config = this.b;
        this.c = (SeAppletApi) Proxy.newProxyInstance(value.getClass().getClassLoader(), value.getClass().getInterfaces(), new k(new ExtendAppletBleApi(value, value2, config.withBleApi, config.isSupportDynamicCity), this.a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource e2() throws Exception {
        PayResponse<String> phoneNumber = X0().getPhoneNumber(this.b.userId);
        if (!phoneNumber.isSuccessful()) {
            HMLog.w(y, "从网络获取绑定的手机号失败:" + phoneNumber.toString(), new Object[0]);
            return Helpers.l(phoneNumber);
        }
        String data = phoneNumber.getData();
        if (data != null && !data.isEmpty()) {
            return Resource.success(data);
        }
        HMLog.w(y, "从网络获取绑定的手机号，发现尚未绑定:" + phoneNumber.toString(), new Object[0]);
        return Resource.error("c0007", "No verified phone", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource f1(String str) throws Exception {
        PayResponse<Unit> payResponseApplyRefund = T2().applyRefund(BusCardExtensions.fromAppCode(str).getMiCardName());
        return !payResponseApplyRefund.isSuccessful() ? Helpers.l(payResponseApplyRefund) : Resource.success("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f2() {
        this.h = this.l.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource g1(String str, String str2) throws Exception {
        PayResponse<RefundOpenFeeEntity> payResponseApplyRefundOpenFee = X0().applyRefundOpenFee(str, str2);
        if (payResponseApplyRefundOpenFee.isSuccessful()) {
            return Resource.success(new BusRefundOpenFeeEntity(payResponseApplyRefundOpenFee.getData() != null ? payResponseApplyRefundOpenFee.getData().getVoucherCode() : ""));
        }
        return Resource.error(payResponseApplyRefundOpenFee.getCode(), payResponseApplyRefundOpenFee.getMessage(), new BusRefundOpenFeeEntity(payResponseApplyRefundOpenFee.getData() != null ? payResponseApplyRefundOpenFee.getData().getVoucherCode() : ""));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource g2(Activity activity, String str, int i, Integer num, int i2, PayMode payMode, int i3, Processor processor) throws Exception {
        return N2(activity, str, i, num, i2, payMode, PayType.from(i3), processor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource h1(String str, String str2) throws Exception {
        PayResponse<PayAuthorizationInfo> payResponseAuthorization = X0().authorization(str, str2);
        return payResponseAuthorization.isSuccessful() ? Resource.success(payResponseAuthorization.getData()) : Resource.error(payResponseAuthorization.getCode(), payResponseAuthorization.getMessage(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource h2(Activity activity, String str, int i, int i2, PayMode payMode, Processor processor) throws Exception {
        return N2(activity, str, i, null, i2, payMode, PayType.Charge, processor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource i1(String str, String str2) throws Exception {
        PayResponse<Unit> payResponseCharge;
        String message;
        CitySimpleInfo cityInfo = CitySimpleInfoCache.INSTANCE.getCityInfo(str);
        String message2 = "";
        if (cityInfo == null) {
            return Resource.error(ErrorCode.CARD_NOT_FOUNDED, "没有找到匹配的公交卡", "");
        }
        if (isForMi()) {
            Pair<String, Resource<String>> pairV0 = V0(str2, 2, "chargeToDevice", str);
            Object obj = pairV0.second;
            if (obj != null) {
                return (Resource) obj;
            }
            payResponseCharge = T2().charge(cityInfo.getAppCode(), cityInfo.getAid(), this.b.deviceId, (String) pairV0.first);
        } else {
            String value = ApduAction.Charge.getValue();
            ExtraInfo extraInfo = null;
            if (Z0(str2)) {
                value = ApduAction.IssueAndCharge.getValue();
                if (ConstantKt.APP_CODE_JJJ.equals(str)) {
                    PayResponse<String> phoneNumber = X0().getPhoneNumber(this.b.userId);
                    if (phoneNumber.isSuccessful()) {
                        extraInfo = new ExtraInfo();
                        extraInfo.setPhoneNumber(phoneNumber.getData());
                    }
                }
            }
            payResponseCharge = P2().charge(cityInfo.getAppCode(), this.b.deviceId, str2, value, extraInfo);
        }
        if (payResponseCharge.isSuccessful()) {
            return Resource.success("");
        }
        ResponseError error = EntityKt.getError(payResponseCharge);
        String code = error != null ? error.getCode() : "";
        String message3 = error != null ? error.getMessage() : "";
        String code2 = ErrorCode.CARD_ERROR;
        if (error == null) {
            code2 = payResponseCharge.getCode();
            message = payResponseCharge.getMessage();
        } else if (code.startsWith("01")) {
            message = String.format("(%s)", code);
        } else {
            message = code.startsWith("02") ? String.format("(%s)，%s", code, message3) : code;
        }
        HMLog.w(y, "向设备写入充值信息失败, city:" + str + payResponseCharge.toString() + ", cardErrorCode:" + code + ", cardErrorMsg:" + message3, new Object[0]);
        if (error != null && error.getMessage() != null) {
            message2 = !TextUtils.isEmpty(error.getMessage()) ? error.getMessage() : payResponseCharge.getMessage();
        }
        return Resource.error(code2, message, message2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource i2(InVoiceInfo inVoiceInfo, String str) throws Exception {
        PayResponse<Unit> payResponsePostFeeInvoice = X0().postFeeInvoice(str, new InvoiceEntity(inVoiceInfo.getType(), inVoiceInfo.getContent(), inVoiceInfo.getCompanyName(), inVoiceInfo.getIdentifier(), inVoiceInfo.getEmail(), inVoiceInfo.getName(), "", ""));
        if (payResponsePostFeeInvoice.isSuccessful()) {
            HMLog.i(y, "postFeeInvoice:" + payResponsePostFeeInvoice.toString(), new Object[0]);
            return Resource.success(Boolean.TRUE);
        }
        HMLog.w(y, "postFeeInvoice:" + payResponsePostFeeInvoice.toString(), new Object[0]);
        return Helpers.l(payResponsePostFeeInvoice);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Resource j1(String str, PayResponse payResponse) {
        if (!payResponse.isSuccessful()) {
            HMLog.e(y, "checkOrderWithLoop 从网络获取订单详情失败:" + payResponse.toString(), new Object[0]);
            return Helpers.l(payResponse);
        }
        if (payResponse.getData() != null) {
            return null;
        }
        HMLog.e(y, "checkOrderWithLoop() 从网络获取订单详情无数据:" + payResponse.toString(), new Object[0]);
        return Resource.error(Const.InternalErrorCode.CODE_NO_ORDER_INFO, "无订单数据，orderId:" + str, new CheckOrderResult(false, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource j2(InVoiceInfo inVoiceInfo, String str) throws Exception {
        PayResponse<Unit> payResponsePostInvoiceInfo = T2().postInvoiceInfo(CitySimpleInfoCache.INSTANCE.getMiCardName(str), new InvoiceEntity(inVoiceInfo.getType(), inVoiceInfo.getContent(), inVoiceInfo.getCompanyName(), inVoiceInfo.getIdentifier(), inVoiceInfo.getEmail(), "", inVoiceInfo.getPhoneNumber(), ""));
        if (payResponsePostInvoiceInfo.isSuccessful()) {
            HMLog.i(y, "postInvoiceInfo:" + payResponsePostInvoiceInfo.toString(), new Object[0]);
            return Resource.success(Boolean.TRUE);
        }
        HMLog.w(y, "postInvoiceInfo:" + payResponsePostInvoiceInfo.toString(), new Object[0]);
        return Helpers.l(payResponsePostInvoiceInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ PayResponse k1(String str, com.huami.wallet.lib.util.Function function) throws Exception {
        PayResponse<XiaomiOrderInfoEntity> orderInfo = T2().getOrderInfo(str, null, null);
        if (((Resource) function.apply(orderInfo)) != null || orderInfo.getData() == null) {
            throw new Exception("小米订单有误发起重试");
        }
        if (orderInfo.isSuccessful() && orderInfo.getData().getStatus().equals("1000")) {
            throw new Exception("小米订单有误发起重试");
        }
        return orderInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource k2(AppletType appletType, String str) throws Exception {
        PayResponse<List<CardScheduleTime>> payResponseQueryScheduleTime = L0().queryScheduleTime(appletType, str);
        return payResponseQueryScheduleTime.isSuccessful() ? Resource.success(payResponseQueryScheduleTime.getData()) : Resource.error(payResponseQueryScheduleTime.getCode(), payResponseQueryScheduleTime.getMessage(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Publisher l1(Flowable flowable) throws Exception {
        return flowable.delay(500L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource l2(String str) throws Exception {
        if (!isForMi() || !str.equals(ShenZhenMot.INSTANCE.getMiCardName())) {
            return Resource.success(null);
        }
        PayResponse<MiRefundStatus> payResponseQueryRefundStatus = T2().queryRefundStatus(str);
        return payResponseQueryRefundStatus.isSuccessful() ? Resource.success(payResponseQueryRefundStatus.getData()) : Resource.error(payResponseQueryRefundStatus.getCode(), payResponseQueryRefundStatus.getMessage(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource m1(final String str, boolean z2) throws Exception {
        final com.huami.wallet.lib.util.Function function = new com.huami.wallet.lib.util.Function() { // from class: ls0
            @Override // com.huami.wallet.lib.util.Function
            public final Object apply(Object obj) {
                return CloudDataSource.j1(str, (PayResponse) obj);
            }
        };
        if (!isForMi()) {
            PayResponse<OrderInfoEntity> orderInfo = P2().getOrderInfo(str);
            Resource resource = (Resource) function.apply(orderInfo);
            if (resource != null || orderInfo.getData() == null) {
                return resource;
            }
            OrderInfoEntity data = orderInfo.getData();
            return Resource.success(new CheckOrderResult(data.getType() != PayType.OpenCard, Const.OrderStatus.DEDUCTED_BUT_NOT_HANDLE.equals(data.getStatus())));
        }
        PayResponse<XiaomiOrderInfoEntity> orderInfo2 = T2().getOrderInfo(str, null, null);
        boolean z3 = orderInfo2.isSuccessful() && orderInfo2.getData() != null && orderInfo2.getData().getStatus().equals("1000");
        if (!isSupportMiuiPay() && z2 && z3) {
            orderInfo2 = (PayResponse) Flowable.fromCallable(new Callable() { // from class: ns0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.k1(str, function);
                }
            }).retryWhen(new Function() { // from class: nt0
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return CloudDataSource.l1((Flowable) obj);
                }
            }).timeout(8L, TimeUnit.SECONDS).blockingFirst(null);
        }
        Resource resource2 = (Resource) function.apply(orderInfo2);
        if (resource2 != null || orderInfo2.getData() == null) {
            return resource2;
        }
        XiaomiOrderInfoEntity data2 = orderInfo2.getData();
        String status = data2.getStatus();
        boolean zC = Helpers.c(data2.getType());
        boolean zD = Helpers.d(status);
        if (!zD || W0(data2)) {
            return Resource.success(new CheckOrderResult(zC, zD));
        }
        HMLog.e(y, "checkOrderWithLoop 订单无token", new Object[0]);
        return Resource.error(Const.InternalErrorCode.CODE_NO_ORDER_TOKEN, "订单无token", new CheckOrderResult(false, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource m2(String str) throws Exception {
        PayResponse<Unit> payResponseRefund = isForMi() ? T2().refund(str) : P2().refund(str);
        if (payResponseRefund.isSuccessful()) {
            return Resource.success(null);
        }
        HMLog.w(y, "refund() -> 从网络申请退款失败:" + payResponseRefund.toString(), new Object[0]);
        return Helpers.l(payResponseRefund);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource n1(String str) throws Exception {
        CitySimpleInfo cityInfo = CitySimpleInfoCache.INSTANCE.getCityInfo(str);
        if (cityInfo == null) {
            return Resource.error(ErrorCode.CARD_NOT_FOUNDED, "没有找到匹配的公交卡", "");
        }
        PayResponse<Unit> payResponseDeleteApp = isForMi() ? T2().deleteApp(cityInfo.getAppCode(), cityInfo.getAid(), this.b.deviceId) : P2().deleteApp(cityInfo.getAppCode(), this.b.deviceId);
        if (payResponseDeleteApp.isSuccessful()) {
            K0(ChangeCityType.DeleteCard, str);
            this.i.g(str);
            return Resource.success(payResponseDeleteApp.getVoucherCode());
        }
        HMLog.w(y, "deleteBusCard() -> 删除设备中的卡片失败:" + payResponseDeleteApp.toString(), new Object[0]);
        return Helpers.m(payResponseDeleteApp, payResponseDeleteApp.getVoucherCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource n2(String str, String str2, String str3, RefundTicketPostBody refundTicketPostBody) throws Exception {
        PayResponse<RefundTicket> payResponseRefundTicket = X0().refundTicket(str, str2, str3, refundTicketPostBody);
        return payResponseRefundTicket.isSuccessful() ? Resource.success(payResponseRefundTicket.getData()) : Resource.error(payResponseRefundTicket.getCode(), payResponseRefundTicket.getMessage(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource o1(CardScheduleTime cardScheduleTime) throws Exception {
        PayResponse<Boolean> payResponseDeleteScheduleTime = L0().deleteScheduleTime(cardScheduleTime);
        return payResponseDeleteScheduleTime.isSuccessful() ? Resource.success(payResponseDeleteScheduleTime.getData()) : Resource.error(payResponseDeleteScheduleTime.getCode(), payResponseDeleteScheduleTime.getMessage(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource o2(String str, String str2) throws Exception {
        PayResponse<Unit> payResponseReturnCard = P2().returnCard(str, this.b.deviceId, str2);
        return payResponseReturnCard.isSuccessful() ? Resource.success(payResponseReturnCard.getData()) : Resource.error(payResponseReturnCard.getCode(), payResponseReturnCard.getMessage(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource p1(PayMode payMode, int i, Integer num) throws Exception {
        PayChannel payChannelR2 = R2(payMode, null);
        PayResponse<OrderEntity> payResponseGenerateOrder = T2().generateOrder(i, num, Double.valueOf(U0()), Double.valueOf(R0()), payChannelR2 == PayChannel.MiPay ? null : new MiPayChannelInfo(payChannelR2, this.b.hostAppPackageName), null, null);
        if (payResponseGenerateOrder.isSuccessful()) {
            if (payResponseGenerateOrder.getData() != null) {
                this.x = payResponseGenerateOrder.getData().getCityId();
                return Resource.success(Helpers.parseMiOrder(payResponseGenerateOrder.getData()));
            }
            this.x = null;
            HMLog.w(y, "生成的订单无数据:" + payResponseGenerateOrder.toString(), new Object[0]);
            return Resource.error(ErrorCode.FAILED_TO_MAKE_ORDER, "生成的订单无数据", null);
        }
        HMLog.w(y, "生成订单失败" + payResponseGenerateOrder.toString(), new Object[0]);
        this.x = null;
        if (ErrorCode.NETWORK_ERROR.equals(payResponseGenerateOrder.getCode())) {
            return Helpers.l(payResponseGenerateOrder);
        }
        if (payResponseGenerateOrder.getCode().startsWith("http401")) {
            return Resource.error(payResponseGenerateOrder.getCode(), payResponseGenerateOrder.getMessage(), null);
        }
        return Resource.error(ErrorCode.FAILED_TO_MAKE_ORDER, "code:" + payResponseGenerateOrder.getCode() + ", msg:" + payResponseGenerateOrder.getMessage(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource p2(String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7) throws Exception {
        String string;
        if (str == null) {
            if (num == null) {
                try {
                    PayResponse<Integer> balance = J0().getBalance(str2);
                    if (!balance.isSuccessful() || balance.getData() == null) {
                        return Resource.error(Const.InternalErrorCode.CODE_NO_BALANCE, "从设备查询卡片余额数据失败", "");
                    }
                    string = balance.getData().toString();
                } catch (BalanceException unused) {
                    return Resource.error(ErrorCode.BALANCE_EXCEPTION, "钱包和透支区都有值", "");
                } catch (OverdraftException unused2) {
                    return Resource.error(ErrorCode.OVERDRAFT, "透支区负值", "");
                }
            } else {
                string = num.toString();
            }
            PayAccountInfoPostBody payAccountInfoPostBody = null;
            if (!b1(str2)) {
                if (str3 == null || str3.isEmpty()) {
                    payAccountInfoPostBody = new PayAccountInfoPostBody(str4, str5, str6);
                } else {
                    PayResponse<Unit> payResponseAuthorizationBind = T2().authorizationBind(BusCardExtensions.fromAppCode(str2).getMiCardName(), str3, "ALIPAY");
                    if (!payResponseAuthorizationBind.isSuccessful()) {
                        return Helpers.l(payResponseAuthorizationBind);
                    }
                }
            }
            PayResponse<XiaomiPrepareReturn> payResponsePrepareReturn = T2().prepareReturn(BusCardExtensions.fromAppCode(str2).getMiCardName(), string, str7, payAccountInfoPostBody);
            if (!payResponsePrepareReturn.isSuccessful()) {
                return Helpers.l(payResponsePrepareReturn);
            }
            str = payResponsePrepareReturn.getData().getTransferOutToken();
        }
        PayResponse<Unit> payResponseReturnCard = T2().returnCard(City.from(str2), this.b.deviceId, str, ApduAction.Return.getValue());
        if (!payResponseReturnCard.isSuccessful()) {
            return Helpers.l(payResponseReturnCard);
        }
        K0(ChangeCityType.DeleteCard, str2);
        this.i.g(str2);
        return Resource.success("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource q1(PayType payType, String str, String str2) throws Exception {
        if (!isForMi()) {
            PayType payType2 = PayType.MoveIn;
            PayResponse<OrderEntity> payResponseGenerateShiftOrder = payType == payType2 ? P2().generateShiftOrder(str, payType2, str2) : P2().generateShiftOrder(str, PayType.MoveOut, null);
            if (payResponseGenerateShiftOrder.isSuccessful() && payResponseGenerateShiftOrder.getData() != null) {
                return Resource.success(payResponseGenerateShiftOrder.getData());
            }
        }
        return Resource.error("", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource q2() throws Exception {
        PayResponse<List<ReturnCardReason>> payResponseReturnCardReason = X0().returnCardReason();
        return payResponseReturnCardReason.isSuccessful() ? Resource.success(payResponseReturnCardReason.getData()) : Resource.error(payResponseReturnCardReason.getCode(), payResponseReturnCardReason.getMessage(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource r1(String str) throws Exception {
        return Resource.success(this.r.getValue().getImageUrlByKey(this.s.getValue().getWebAppName(), "huami.preLaunch.nfc_bus_img", str).getData());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource r2(String str) throws Exception {
        PayResponse<VerifyCodeEntity> payResponseSendCaptcha = X0().sendCaptcha(this.b.userId, str);
        if (payResponseSendCaptcha.isSuccessful()) {
            return Resource.success(new Object());
        }
        HMLog.w(y, "从网络请求发送短信验证码失败:" + payResponseSendCaptcha.toString(), new Object[0]);
        return Helpers.l(payResponseSendCaptcha);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource s1(String str) throws Exception {
        PayResponse<String> cardInstructions = T2().getCardInstructions(CitySimpleInfoCache.INSTANCE.getMiCardName(str));
        if (cardInstructions.isSuccessful()) {
            HMLog.i(y, "getCardInstructions():" + cardInstructions.toString(), new Object[0]);
            return Resource.success(cardInstructions.getData());
        }
        HMLog.w(y, "getCardInstructions():" + cardInstructions.toString(), new Object[0]);
        return Helpers.l(cardInstructions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource s2(CardScheduleTime cardScheduleTime) throws Exception {
        PayResponse<Boolean> scheduleTime = L0().setScheduleTime(cardScheduleTime);
        return scheduleTime.isSuccessful() ? Resource.success(scheduleTime.getData()) : Resource.error(scheduleTime.getCode(), scheduleTime.getMessage(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource t1(String str) throws Exception {
        ArrayList arrayList = new ArrayList();
        if (isForMi()) {
            PayResponse<List<CarouselEntity>> carouselList = T2().getCarouselList(CitySimpleInfoCache.INSTANCE.getMiCardName(str));
            if (!carouselList.isSuccessful()) {
                HMLog.w(y, "getCarouselList():" + carouselList.toString(), new Object[0]);
                return Helpers.l(carouselList);
            }
            if (carouselList.getData() != null) {
                for (CarouselEntity carouselEntity : carouselList.getData()) {
                    arrayList.add(new CarouseInfo(carouselEntity.getImage(), carouselEntity.getUrl()));
                }
            }
            HMLog.i(y, "getCarouselList PayResponse" + carouselList.toString(), new Object[0]);
        }
        return Resource.success(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource t2(String str) throws Exception {
        if (withBleApi().booleanValue()) {
            PayResponse<Unit> payResponseActivateCard = J0().activateCard(str);
            if (!payResponseActivateCard.isSuccessful()) {
                HMLog.w(y, "给设备设置默认卡失败 city:" + str + ":" + payResponseActivateCard.toString(), new Object[0]);
                return Helpers.l(payResponseActivateCard);
            }
            this.v = str;
            this.w = getAid(str);
        } else {
            String aid = getAid(str);
            PayResponse<Unit> defaultCard = J0().setDefaultCard(aid);
            if (!defaultCard.isSuccessful()) {
                HMLog.w(y, "给设备设置默认卡失败, city:" + str + ":" + defaultCard.toString(), new Object[0]);
                return Helpers.l(defaultCard);
            }
            this.v = str;
            this.w = aid;
            K0(ChangeCityType.ChangeCity, str);
        }
        return Resource.success(new Object());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource u1(String str) throws Exception {
        PayResponse<String> chargeInvoiceDescription = T2().getChargeInvoiceDescription(CitySimpleInfoCache.INSTANCE.getMiCardName(str));
        if (chargeInvoiceDescription.isSuccessful()) {
            HMLog.i(y, "getChargeInvoiceDescription:" + chargeInvoiceDescription.toString(), new Object[0]);
            return Resource.success(chargeInvoiceDescription.getData());
        }
        HMLog.w(y, "getChargeInvoiceDescription:" + chargeInvoiceDescription.toString(), new Object[0]);
        return Helpers.l(chargeInvoiceDescription);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource u2(String str, String str2) throws Exception {
        PayResponse<String> phoneNumber = X0().getPhoneNumber(this.b.userId);
        if (!phoneNumber.isSuccessful()) {
            HMLog.w(y, "从网络获取绑定的手机号失败:" + phoneNumber.toString(), new Object[0]);
            return Helpers.m(phoneNumber, Boolean.FALSE);
        }
        if (phoneNumber.getData() == null) {
            HMLog.w(y, "从网络获取绑定的手机号，发现尚未绑定:" + phoneNumber.toString(), new Object[0]);
            return Resource.error("c0007", "未绑定手机号", Boolean.FALSE);
        }
        ExtraInfo extraInfo = new ExtraInfo();
        extraInfo.setPhoneNumber(phoneNumber.getData());
        PayResponse<Unit> payResponseShiftInCard = P2().shiftInCard(str, this.b.deviceId, str2, extraInfo);
        if (!payResponseShiftInCard.isSuccessful()) {
            Pair<String, String> pairP0 = P0(payResponseShiftInCard);
            return Resource.error((String) pairP0.first, (String) pairP0.second, Boolean.TRUE);
        }
        this.i.a(str);
        K0(ChangeCityType.IssueCard, str);
        return Resource.success(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource v1(Integer num) throws Exception {
        if (!isForMi()) {
            return Resource.success(null);
        }
        PayResponse<List<CouponEntity>> coupon = T2().getCoupon(num.intValue());
        if (!coupon.isSuccessful()) {
            return Helpers.l(coupon);
        }
        ArrayList arrayList = new ArrayList();
        List<CouponEntity> data = coupon.getData();
        Objects.requireNonNull(data);
        for (CouponEntity couponEntity : data) {
            arrayList.add(new Coupon(couponEntity.getCouponId(), couponEntity.getIssueDiscount(), couponEntity.getIssuePayFee(), couponEntity.getName(), couponEntity.getRechargeDiscount(), couponEntity.getRechargePayFee(), couponEntity.getTotalDiscount(), couponEntity.getTotalPayFee(), couponEntity.getValid()));
        }
        return Resource.success(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource v2(String str, String str2, String str3) throws Exception {
        if (str == null || str.isEmpty()) {
            PayResponse<TransferIn> payResponseStartTransferIn = T2().startTransferIn(str2);
            if (!payResponseStartTransferIn.isSuccessful()) {
                Pair<String, String> pairP0 = P0(payResponseStartTransferIn);
                return Resource.error((String) pairP0.first, (String) pairP0.second, "");
            }
            if (payResponseStartTransferIn.getData() != null && payResponseStartTransferIn.getData().getTokens() != null) {
                for (MiShiftActionToken miShiftActionToken : payResponseStartTransferIn.getData().getTokens()) {
                    if (miShiftActionToken.getType() == 3) {
                        str = miShiftActionToken.getToken();
                        break;
                    }
                }
            }
            if (str == null || str.isEmpty()) {
                return Resource.error("移卡缺少必要的Token", "");
            }
        }
        String str4 = str;
        CitySimpleInfo cityInfo = CitySimpleInfoCache.INSTANCE.getCityInfo(str3);
        if (cityInfo == null) {
            return Resource.error(ErrorCode.CARD_NOT_FOUNDED, "没有匹配的公交卡:" + str3, "");
        }
        if (cityInfo.getMiCardName() == null) {
            return Resource.error(ErrorCode.CARD_NOT_FOUNDED, "没有匹配的公交卡:miCardName为空" + str3, "");
        }
        PayResponse<Unit> payResponseShiftCard = T2().shiftCard(cityInfo.getAppCode(), cityInfo.getAid(), cityInfo.getMiCardName(), this.b.deviceId, str4, ApduAction.ShiftInCard.getValue());
        if (!payResponseShiftCard.isSuccessful()) {
            Pair<String, String> pairP1 = P0(payResponseShiftCard);
            return Resource.error((String) pairP1.first, (String) pairP1.second, "");
        }
        this.i.a(str3);
        K0(ChangeCityType.IssueCard, str3);
        return Resource.success("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource w1() throws Exception {
        String str = this.v;
        String appCode = null;
        if (str != null) {
            return str.isEmpty() ? Resource.success(null) : Resource.success(this.v);
        }
        PayResponse<List<CityInfoEntity>> installedBusCards = X0().getInstalledBusCards(this.b.deviceId, T0());
        List<CityInfoEntity> data = installedBusCards.getData();
        if (!installedBusCards.isSuccessful()) {
            HMLog.w(y, "getDefaultBusCardId() -> 从网络获取已开通卡片列表失败:" + installedBusCards.toString(), new Object[0]);
            return Helpers.l(installedBusCards);
        }
        String strO0 = O0(data);
        if (installedBusCards.getData() != null && !installedBusCards.getData().isEmpty()) {
            for (CityInfoEntity cityInfoEntity : installedBusCards.getData()) {
                if (TextUtils.equals(strO0, cityInfoEntity.getAid())) {
                    appCode = cityInfoEntity.getAppCode();
                    break;
                }
            }
        }
        if (appCode == null) {
            this.v = "";
            this.w = "";
        } else {
            this.w = strO0;
            this.v = appCode;
        }
        return Resource.success(appCode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource w2(String str, String str2) throws Exception {
        PayResponse<String> phoneNumber = X0().getPhoneNumber(this.b.userId);
        if (!phoneNumber.isSuccessful()) {
            HMLog.w(y, "从网络获取绑定的手机号失败: " + phoneNumber.toString(), new Object[0]);
            return Helpers.m(phoneNumber, Boolean.FALSE);
        }
        if (phoneNumber.getData() == null) {
            HMLog.w(y, "从网络获取绑定的手机号，发现尚未绑定: " + phoneNumber.toString(), new Object[0]);
            return Resource.error("c0007", "未绑定手机号", Boolean.FALSE);
        }
        ExtraInfo extraInfo = new ExtraInfo();
        extraInfo.setPhoneNumber(phoneNumber.getData());
        PayResponse<Unit> payResponseShiftOutCard = P2().shiftOutCard(str, this.b.deviceId, str2, extraInfo);
        if (!payResponseShiftOutCard.isSuccessful()) {
            Pair<String, String> pairP0 = P0(payResponseShiftOutCard);
            return Resource.error((String) pairP0.first, (String) pairP0.second, Boolean.FALSE);
        }
        this.i.g(str);
        K0(ChangeCityType.DeleteCard, str);
        return Resource.success(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource x1(String str) throws Exception {
        PayResponse<InvoiceEntity> feeInvoice = X0().getFeeInvoice(str);
        if (!feeInvoice.isSuccessful()) {
            HMLog.w(y, "getFeeInvoice:" + feeInvoice.toString(), new Object[0]);
            return Helpers.l(feeInvoice);
        }
        InvoiceEntity data = feeInvoice.getData();
        InVoiceInfo inVoiceInfo = data != null ? new InVoiceInfo(data.getType(), data.getContent(), data.getCompanyName(), data.getIdentifier(), data.getEmail(), data.getName(), data.getPhoneNumber(), data.getAddress()) : null;
        HMLog.i(y, "getFeeInvoice:" + feeInvoice.toString(), new Object[0]);
        return Resource.success(inVoiceInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource x2(String str, String str2, String str3) throws Exception {
        String transferOutToken;
        CitySimpleInfo cityInfo = CitySimpleInfoCache.INSTANCE.getCityInfo(str3);
        if (cityInfo == null) {
            return Resource.error(ErrorCode.CARD_NOT_FOUNDED, "没有匹配的公交卡:" + str3, "");
        }
        if (cityInfo.getMiCardName() == null) {
            return Resource.error(ErrorCode.CARD_NOT_FOUNDED, "没有匹配的公交卡:miCardName为空" + str3, "");
        }
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            try {
                PayResponse<Integer> balance = J0().getBalance(str3);
                if (!balance.isSuccessful() || balance.getData() == null) {
                    return Resource.error(Const.InternalErrorCode.CODE_NO_BALANCE, "从设备查询卡片余额数据失败", "");
                }
                PayResponse<PrepareTransferOut> payResponsePrepareTransferOut = T2().prepareTransferOut(cityInfo.getMiCardName(), balance.getData().toString());
                if (!payResponsePrepareTransferOut.isSuccessful() || payResponsePrepareTransferOut.getData() == null) {
                    Pair<String, String> pairP0 = P0(payResponsePrepareTransferOut);
                    return Resource.error((String) pairP0.first, (String) pairP0.second, "");
                }
                transferOutToken = payResponsePrepareTransferOut.getData().getTransferOutToken();
                str2 = payResponsePrepareTransferOut.getData().getOrderId();
            } catch (BalanceException unused) {
                return Resource.error(ErrorCode.BALANCE_EXCEPTION, "钱包和透支区都有值", "");
            } catch (OverdraftException unused2) {
                return Resource.error(ErrorCode.OVERDRAFT, "透支区负值", "");
            }
        } else {
            transferOutToken = str;
        }
        PayResponse<Unit> payResponseCheckShiftCard = T2().checkShiftCard(cityInfo.getAppCode(), cityInfo.getAid(), cityInfo.getMiCardName(), this.b.deviceId);
        if (!payResponseCheckShiftCard.isSuccessful()) {
            Pair<String, String> pairP1 = P0(payResponseCheckShiftCard);
            return Resource.error((String) pairP1.first, (String) pairP1.second, "");
        }
        if (transferOutToken == null) {
            return Resource.error("移卡缺少必要的Token", "");
        }
        if (str2 == null) {
            return Resource.error("移卡缺少必要的OrderId", "");
        }
        PayResponse<Unit> payResponseShiftCard = T2().shiftCard(cityInfo.getAppCode(), cityInfo.getAid(), cityInfo.getMiCardName(), this.b.deviceId, transferOutToken, ApduAction.ShiftOutCard.getValue());
        if (!payResponseShiftCard.isSuccessful()) {
            Pair<String, String> pairP2 = P0(payResponseShiftCard);
            return Resource.error((String) pairP2.first, (String) pairP2.second, "");
        }
        this.i.g(str3);
        K0(ChangeCityType.DeleteCard, str3);
        this.f.confirmTransferOut(str2);
        return Resource.success("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource y1() throws Exception {
        clearData();
        PayResponse<List<CityInfoEntity>> installedBusCards = X0().getInstalledBusCards(this.b.deviceId, T0());
        if (!installedBusCards.isSuccessful()) {
            HMLog.w(y, "从网络获取已开通卡片列表失败: " + installedBusCards.toString(), new Object[0]);
            return Resource.error(installedBusCards.getCode(), installedBusCards.getMessage(), null);
        }
        String sn = this.p.getValue().getSn();
        PayResponse<String> cplc = this.q.getValue().getCplc(sn);
        if (cplc.isSuccessful()) {
            HMLog.i(y, "sn is " + sn + ",cplc is " + cplc.getData(), new Object[0]);
        }
        ArrayList arrayList = new ArrayList();
        if (installedBusCards.getData() == null || installedBusCards.getData().isEmpty()) {
            return Resource.success(arrayList);
        }
        for (CityInfoEntity cityInfoEntity : installedBusCards.getData()) {
            BusCardSimple2 busCardSimple2 = new BusCardSimple2();
            try {
                if (!TextUtils.isEmpty(cityInfoEntity.getAppCode())) {
                    busCardSimple2.id = cityInfoEntity.getAppCode();
                    busCardSimple2.name = cityInfoEntity.getCardName();
                    busCardSimple2.xiaomiCardName = cityInfoEntity.getXiaomiCityCode();
                    busCardSimple2.cardNumber = cityInfoEntity.getCardName();
                    busCardSimple2.imageUrl = cityInfoEntity.getOpenedImgUrl();
                    busCardSimple2.aid = cityInfoEntity.getAid();
                    busCardSimple2.shiftEnable = cityInfoEntity.getShiftEnable();
                    busCardSimple2.packageName = cityInfoEntity.getPackageName();
                    busCardSimple2.appName = cityInfoEntity.getAppName();
                    busCardSimple2.redirectTo = cityInfoEntity.getRedirectTo();
                    busCardSimple2.serviceContact = cityInfoEntity.getServiceContact();
                    CitySimpleInfoCache.INSTANCE.putCityInfo(cityInfoEntity.getAppCode(), CitySimpleInfoKt.toCitySimpleInfo(cityInfoEntity));
                    arrayList.add(busCardSimple2);
                }
            } catch (Exception e) {
                HMLog.w(y, e, "To BusCardSimple2 error" + e.getMessage(), new Object[0]);
            }
        }
        return Resource.success(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean y2() {
        return l.e(this.b.context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource z1(String str) throws Exception {
        PayResponse<XiaomiInVoiceEntity> invoiceAddress = T2().getInvoiceAddress(CitySimpleInfoCache.INSTANCE.getMiCardName(str));
        if (!invoiceAddress.isSuccessful()) {
            HMLog.w(y, "getInvoiceAddress:" + invoiceAddress.toString(), new Object[0]);
            return Helpers.l(invoiceAddress);
        }
        HMLog.i(y, "getInvoiceAddress:" + invoiceAddress.toString(), new Object[0]);
        XiaomiInVoiceEntity data = invoiceAddress.getData();
        return Resource.success(data != null ? new XiaomiInVoiceInfo(data.getStatus(), data.getDownUrl(), data.getVersion()) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z2() {
        ISnowballWebApi value = this.k.getValue();
        this.e = (ISnowballWebApi) Proxy.newProxyInstance(value.getClass().getClassLoader(), value.getClass().getInterfaces(), new n("Wallet-SnowballWebApi", value, new com.huami.wallet.datasource.cloud.a() { // from class: com.huami.wallet.datasource.cloud.d
            @Override // com.huami.wallet.datasource.cloud.a
            public final boolean getAsBoolean() {
                return this.a.y2();
            }
        }));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<String>> agreeProtocol(final String str, final long j) {
        return Flowable.fromCallable(new Callable() { // from class: ar0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.c1(j, str);
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<String>> agreeShiftProtocol(final String str, @Nullable final Long l) {
        return Flowable.fromCallable(new Callable() { // from class: ps0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.d1(str, l);
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<String>> applyRefund(@NonNull final String str) {
        return Flowable.fromCallable(new Callable() { // from class: hs0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.f1(str);
            }
        }).compose(new i(this.b, City.from(str).name(), getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<BusRefundOpenFeeEntity>> applyRefundOpenFee(final String str, final String str2) {
        return Flowable.fromCallable(new Callable() { // from class: us0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.g1(str, str2);
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<PayAuthorizationInfo>> authorization(final String str, final String str2) {
        return Flowable.fromCallable(new Callable() { // from class: zs0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.h1(str, str2);
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<String>> chargeToDevice(@NonNull final String str, @NonNull final String str2) {
        return Flowable.fromCallable(new Callable() { // from class: bt0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.i1(str, str2);
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<CheckOrderResult>> checkOrderWithLoop(@NonNull final String str, final boolean z2) {
        return Flowable.fromCallable(new Callable() { // from class: jt0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.m1(str, z2);
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public void clearData() {
        m mVar = this.i;
        if (mVar != null) {
            mVar.b();
        }
        this.v = null;
        this.w = null;
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<String>> deleteBusCard(@NonNull final String str) {
        return Flowable.fromCallable(new Callable() { // from class: zr0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.n1(str);
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<Boolean>> deleteCardScheduleTime(final CardScheduleTime cardScheduleTime) {
        return Flowable.fromCallable(new Callable() { // from class: fr0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.o1(cardScheduleTime);
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<MiOrder>> generateMiOrder(final int i, final Integer num, final PayMode payMode) {
        return Flowable.fromCallable(new Callable() { // from class: lr0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.p1(payMode, i, num);
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<OrderEntity>> generateShiftOrder(final String str, final PayType payType, @Nullable final String str2) {
        return Flowable.fromCallable(new Callable() { // from class: hr0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.q1(payType, str, str2);
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public String getAid(String str) {
        return CitySimpleInfoCache.INSTANCE.getAid(str);
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<String>> getBusImageUrl(final String str) {
        return Flowable.fromCallable(new Callable() { // from class: xr0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.r1(str);
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<String>> getCardInstructions(final String str) {
        return Flowable.fromCallable(new Callable() { // from class: qr0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.s1(str);
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<List<CarouseInfo>>> getCarouselList(final String str) {
        return Flowable.fromCallable(new Callable() { // from class: yr0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.t1(str);
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<String>> getChargeInvoiceDescription(final String str) {
        return Flowable.fromCallable(new Callable() { // from class: js0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.u1(str);
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<List<Coupon>>> getCoupon(final Integer num) {
        return Flowable.fromCallable(new Callable() { // from class: nr0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.v1(num);
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<String>> getDefaultBusCardId() {
        return Flowable.fromCallable(new Callable() { // from class: rq0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.w1();
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public String getDeviceModel() {
        return this.p.getValue().getDeviceModel().getModel();
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<InVoiceInfo>> getFeeInvoice(final String str) {
        return Flowable.fromCallable(new Callable() { // from class: wr0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.x1(str);
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public String getHost() {
        return this.b.hostUrl;
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<List<BusCardSimple2>>> getInstalledBusCards() {
        return Flowable.fromCallable(new Callable() { // from class: zq0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.y1();
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<XiaomiInVoiceInfo>> getInvoiceAddress(final String str) {
        return Flowable.fromCallable(new Callable() { // from class: ms0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.z1(str);
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<BusOpenFeeStateEntity>> getOpenFeeStatus(@NonNull final String str, @NonNull final String str2) {
        return Flowable.fromCallable(new Callable() { // from class: qs0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.A1(str, str2);
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<Boolean>> getOrderInfo(final String str) {
        return Flowable.fromCallable(new Callable() { // from class: fs0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.B1(str);
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<Protocol>> getProtocol(@NonNull final String str, @NonNull final String str2, @NonNull final String str3) {
        return Flowable.fromCallable(new Callable() { // from class: ft0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.C1(str2, str3, str);
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<Protocol>> getShiftProtocol(@NonNull final String str, @NonNull String str2) {
        return Flowable.fromCallable(new Callable() { // from class: gs0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.D1(str);
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<BusSiteInfo>> getSiteInfo(final String str, final String str2) {
        return Flowable.fromCallable(new Callable() { // from class: at0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.E1(str, str2);
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public String getUserId() {
        return this.b.userId;
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<XiaomiBulletin>> getXiaomiBulletins(final XiaomiBulletinType xiaomiBulletinType, final String str, final String str2) {
        return Flowable.fromCallable(new Callable() { // from class: mr0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.F1(xiaomiBulletinType, str, str2);
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<List<XiaomiNotice>>> getXiaomiNotice() {
        return Flowable.fromCallable(new Callable() { // from class: vq0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.G1();
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public MiPayH5Result goMiPayH5(Activity activity, String str, String str2) {
        MiPayH5Response miPayH5ResponsePay = MipayH5.pay(activity, str, str2);
        return new MiPayH5Result(miPayH5ResponsePay.getCode(), miPayH5ResponsePay.getMessage());
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Boolean> isDeviceConnected() {
        return this.b.deviceConnectionChecker;
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public boolean isForMi() {
        return NfcDeviceKt.isXiaomiDevice(this.p.getValue().getDeviceModel());
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Boolean isForSnowballShanghai(String str) {
        return Boolean.valueOf(!isForMi() && ConstantKt.APP_CODE_SHANG_HAI.equalsIgnoreCase(str));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public boolean isLingNanTong(String str) {
        return BusCardExtensions.getLNT_CITYS().contains(str);
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public boolean isSupportBannerView() {
        Function0<Boolean> function0;
        if (!isForMi() || (function0 = this.b.isSupportBannerView) == null) {
            return false;
        }
        return function0.getA().booleanValue();
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public boolean isSupportCardInformation() {
        Function0<Boolean> function0;
        if (!isForMi() || (function0 = this.b.isSupportCardInformation) == null) {
            return false;
        }
        return function0.getA().booleanValue();
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public boolean isSupportCity(String str) {
        if (!this.b.isSupportDynamicCity.getA().booleanValue()) {
            return BusCardExtensions.aidList().contains(str);
        }
        PayResponse<Boolean> payResponseIsSupport = M2().isSupport(str);
        if (!payResponseIsSupport.isSuccessful() || payResponseIsSupport.getData() == null) {
            return false;
        }
        return payResponseIsSupport.getData().booleanValue();
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public boolean isSupportMiInVoice() {
        Function0<Boolean> function0 = this.b.isSupportMiInVoice;
        if (function0 == null) {
            return false;
        }
        return function0.getA().booleanValue();
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public boolean isSupportMiuiPay() {
        return ((Boolean) Flowable.fromPublisher(this.b.isSupportMiuiPay).blockingFirst(Boolean.FALSE)).booleanValue();
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public boolean isSupportTimeSwitchCard() {
        return L0().isSupportScheduleTime();
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<String>> issueCardToDevice(@NonNull final String str, @NonNull final String str2, @NonNull final String str3) {
        return Flowable.fromCallable(new Callable() { // from class: et0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.J1(str, str2, str3);
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<List<BusCardListItem>>> loadAllBusCards(@Nullable final String str) {
        return Flowable.fromCallable(new Callable() { // from class: bs0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.K1(str);
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<BusCardBalance>> loadBusCardBalance(final String str) {
        return Flowable.fromCallable(new Callable() { // from class: ds0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.L1(str);
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<List<ConsumeRecord>>> loadBusCardConsumeRecordsWeb(@NonNull final String str, @NonNull final String str2) {
        return Flowable.fromCallable(new Callable() { // from class: vs0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.M1(str, str2);
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<BusCardDetail>> loadBusCardDetailInfo(@NonNull final String str) {
        return Flowable.fromCallable(new Callable() { // from class: es0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.Q1(str);
            }
        }).compose(new i(this.b, str, getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<String>> loadBusCardNumber(@NonNull final String str) {
        return Flowable.fromCallable(new Callable() { // from class: tr0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.S1(str);
            }
        }).compose(new i(this.b, str, getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<List<RechargeRecord>>> loadBusCardRechargeRecords(@NonNull final String str) {
        return Flowable.fromCallable(new Callable() { // from class: sr0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.T1(str);
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<BusCardValidity>> loadBusCardValidity(final String str) {
        return Flowable.fromCallable(new Callable() { // from class: or0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.V1(str);
            }
        }).compose(new i(this.b, str, getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<String>> loadCplc() {
        return Flowable.fromCallable(new Callable() { // from class: wq0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.W1();
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<List<Fee>>> loadFees(@NonNull final String str, @NonNull final OrderType orderType) {
        return Flowable.fromCallable(new Callable() { // from class: kr0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.X1(orderType, str);
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<Integer>> loadMiBusCardRechargeRecords(@NonNull final String str) {
        return Flowable.fromCallable(new Callable() { // from class: ks0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.Y1(str);
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<List<Notice>>> loadNotices() {
        return Flowable.fromCallable(new Callable() { // from class: sq0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.Z1();
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<List<BusCardSimple2>>> loadOpenedBusCards() {
        return Flowable.fromCallable(new Callable() { // from class: yq0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.b2();
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<Order>> loadOrderInfo(@NonNull final String str, final String str2, final String str3) {
        return Flowable.fromCallable(new Callable() { // from class: dt0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.d2(str, str2, str3);
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<String>> loadVerifiedPhone() {
        return Flowable.fromCallable(new Callable() { // from class: uq0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.e2();
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<String>> payToOpenAndRecharge(@NonNull final Activity activity, @NonNull final String str, final int i, @Nullable final Integer num, final int i2, @Nullable final PayMode payMode, final int i3, final Processor<Resource<String>, Resource<String>> processor) {
        return Flowable.fromCallable(new Callable() { // from class: cr0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.g2(activity, str, i, num, i2, payMode, i3, processor);
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<String>> payToRechargeCard(@NonNull final Activity activity, @NonNull final String str, final int i, final int i2, @Nullable final PayMode payMode, final Processor<Resource<String>, Resource<String>> processor) {
        return Flowable.fromCallable(new Callable() { // from class: br0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.h2(activity, str, i, i2, payMode, processor);
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<Boolean>> postFeeInvoice(final String str, final InVoiceInfo inVoiceInfo) {
        return Flowable.fromCallable(new Callable() { // from class: ir0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.i2(inVoiceInfo, str);
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<Boolean>> postInvoiceInfo(final String str, final InVoiceInfo inVoiceInfo) {
        return Flowable.fromCallable(new Callable() { // from class: jr0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.j2(inVoiceInfo, str);
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<List<CardScheduleTime>>> queryCardScheduleTime(final AppletType appletType, final String str) {
        return Flowable.fromCallable(new Callable() { // from class: gr0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.k2(appletType, str);
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<MiRefundStatus>> queryRefundStatus(final String str) {
        return Flowable.fromCallable(new Callable() { // from class: cs0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.l2(str);
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<Object>> refund(@NonNull final String str) {
        return Flowable.fromCallable(new Callable() { // from class: is0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.m2(str);
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<RefundTicket>> refundTicket(final String str, final String str2, final String str3, final RefundTicketPostBody refundTicketPostBody) {
        return Flowable.fromCallable(new Callable() { // from class: it0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.n2(str, str2, str3, refundTicketPostBody);
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<Unit>> returnCard(final String str, final String str2) {
        return Flowable.fromCallable(new Callable() { // from class: xs0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.o2(str, str2);
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<String>> returnCardMi(final String str, @Nullable final Integer num, @Nullable final String str2, @Nullable final String str3, @Nullable final String str4, @Nullable final String str5, @Nullable final String str6, @Nullable final String str7) {
        return Flowable.fromCallable(new Callable() { // from class: os0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.p2(str2, num, str, str3, str5, str6, str7, str4);
            }
        }).compose(new i(this.b, City.from(str).name(), getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<List<ReturnCardReason>>> returnCardReason() {
        return Flowable.fromCallable(new Callable() { // from class: xq0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.q2();
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<Object>> sendSmsCaptcha(final String str) {
        return Flowable.fromCallable(new Callable() { // from class: ur0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.r2(str);
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<Boolean>> setCardScheduleTime(final CardScheduleTime cardScheduleTime) {
        return Flowable.fromCallable(new Callable() { // from class: dr0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.s2(cardScheduleTime);
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<Object>> setDefaultBusCard(@NonNull final String str, @Nullable String str2) {
        return Flowable.fromCallable(new Callable() { // from class: vr0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.t2(str);
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<Boolean>> shiftIn(@NonNull final String str, @NonNull final String str2) {
        return Flowable.fromCallable(new Callable() { // from class: rs0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.u2(str, str2);
            }
        }).compose(new i(this.b, str, getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<String>> shiftInMi(final String str, final String str2, final String str3) {
        return Flowable.fromCallable(new Callable() { // from class: gt0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.v2(str3, str2, str);
            }
        }).compose(new i(this.b, str, getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<Boolean>> shiftOut(@NonNull final String str, @NonNull final String str2) {
        return Flowable.fromCallable(new Callable() { // from class: ts0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.w2(str, str2);
            }
        }).compose(new i(this.b, str, getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<String>> shiftOutMi(final String str, @Nullable final String str2, @Nullable final String str3) {
        return Flowable.fromCallable(new Callable() { // from class: ct0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.x2(str3, str2, str);
            }
        }).compose(new i(this.b, str, getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<Unit>> updateCardName(final String str, final String str2) {
        return Flowable.fromCallable(new Callable() { // from class: ss0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.A2(str, str2);
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public void updateNfcCardListSync(List<BusCardSimple2> list) {
        Q2().syncAppletList(list);
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public void uploadCardInfo(NFCCardInfoEntity nFCCardInfoEntity, String str) {
        X0().postCardInfo(new CardInfoEntity(nFCCardInfoEntity.getBalance(), nFCCardInfoEntity.getActivationDate(), nFCCardInfoEntity.getCardNumber(), nFCCardInfoEntity.getExpiredDate(), nFCCardInfoEntity.getUpdateTime()), str);
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    @SuppressLint({"CheckResult"})
    public Publisher<Resource<Boolean>> uploadConsumeRecords(final String str) {
        return Flowable.fromCallable(new Callable() { // from class: rr0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.D2(str);
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<Object>> uploadNfcTransEntitys(@NonNull final String str, @NonNull final String str2, final List<NFCTransEntity> list) {
        return Flowable.fromCallable(new Callable() { // from class: lt0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.E2(list, str, str2);
            }
        }).compose(new i(this.b, str, getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<Object>> uploadTransactionRecord(@NonNull final String str, @NonNull final String str2, final List<Order> list) {
        return Flowable.fromCallable(new Callable() { // from class: kt0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.F2(list, str, str2);
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<String>> validateCardDate(long j, final long j2) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        return Flowable.fromCallable(new Callable() { // from class: qq0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CloudDataSource.G2(jCurrentTimeMillis, j2);
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Publisher<Resource<Object>> verifySmsCaptcha(final String str, final String str2) {
        return Flowable.fromCallable(new Callable() { // from class: ys0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.I2(str, str2);
            }
        }).compose(new i(this.b, "", getDeviceModel()));
    }

    @Override // com.huami.wallet.lib.api.WalletDataSource
    public Boolean withBleApi() {
        Function0<Boolean> function0 = this.b.withBleApi;
        return function0 == null ? Boolean.FALSE : function0.getA();
    }
}
