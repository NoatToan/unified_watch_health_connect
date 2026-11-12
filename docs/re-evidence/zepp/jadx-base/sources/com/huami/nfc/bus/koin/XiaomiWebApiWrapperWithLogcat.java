package com.huami.nfc.bus.koin;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.huami.nfc.applet.City;
import com.huami.nfc.base.ErrorCodeConstant;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.base.PayResponseExtensionsKt;
import com.huami.nfc.bus.ApduAction;
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
import com.huami.nfc.bus.api.IXiaomiWebApi;
import com.huami.nfc.bus.entities.CarouselEntity;
import com.huami.nfc.bus.entities.InvoiceEntity;
import com.huami.nfc.bus.entities.PayAccountInfoPostBody;
import com.huami.nfc.bus.entities.XiaomiBulletin;
import com.huami.nfc.web.Constant;
import com.huami.nfc.web.entity.ProtocolEntity;
import com.huami.passport.Configs;
import io.netty.util.internal.StringUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010[\u001a\u00020\u0001¢\u0006\u0004\b\\\u0010]J$\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J.\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0016JY\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ*\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00062\u0006\u0010\u001e\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u00022\b\u0010 \u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0#0\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u001e\u001a\u00020\u0002H\u0016J\u001e\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0002H\u0016J\u001e\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00062\u0006\u0010(\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010,\u001a\u00020+H\u0016J\u0014\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\u00070\u0006H\u0016J\u001c\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\u00070\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u001c\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u00104\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001e\u00107\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00106\u001a\u000205H\u0016J\u0016\u00109\u001a\b\u0012\u0004\u0012\u0002080\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016JB\u0010>\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010;\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\b\u0010<\u001a\u0004\u0018\u00010\u00022\b\u0010=\u001a\u0004\u0018\u00010\u0002H\u0016J.\u0010?\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010;\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0016J&\u0010@\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010;\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016J>\u0010A\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010;\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J.\u0010B\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010;\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u001e\u0010E\u001a\b\u0012\u0004\u0012\u00020D0\u00062\u0006\u0010 \u001a\u00020\u00022\u0006\u0010C\u001a\u00020\u0002H\u0016J\u0016\u0010F\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u001e\u001a\u00020\u0002H\u0016J\u0016\u0010H\u001a\b\u0012\u0004\u0012\u00020G0\u00062\u0006\u0010\u001e\u001a\u00020\u0002H\u0016J0\u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020K0\u00070\u00062\u0006\u0010I\u001a\u00020\u00022\b\u0010J\u001a\u0004\u0018\u00010\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u0016J\u0016\u0010N\u001a\b\u0012\u0004\u0012\u00020M0\u00062\u0006\u0010J\u001a\u00020\u0002H\u0016J\u0016\u0010O\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010J\u001a\u00020\u0002H\u0016J2\u0010T\u001a\b\u0012\u0004\u0012\u00020S0\u00062\u0006\u0010J\u001a\u00020\u00022\u0006\u0010C\u001a\u00020\u00022\b\u0010P\u001a\u0004\u0018\u00010\u00022\b\u0010R\u001a\u0004\u0018\u00010QH\u0016J&\u0010W\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010J\u001a\u00020\u00022\u0006\u0010U\u001a\u00020\u00022\u0006\u0010V\u001a\u00020\u0002H\u0016J&\u0010X\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u0016\u0010[\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010Z¨\u0006^"}, d2 = {"Lcom/huami/nfc/bus/koin/XiaomiWebApiWrapperWithLogcat;", "Lcom/huami/nfc/bus/api/IXiaomiWebApi;", "", "miCardName", "Lcom/huami/nfc/bus/PayType;", "type", "Lcom/huami/nfc/base/PayResponse;", "", "Lcom/huami/nfc/bus/TransAmountEntity;", "getTransactionAmount", "Lcom/huami/nfc/applet/City;", "city", "deviceId", "orderToken", "actionType", "", "returnCard", "", "feeId", "couponId", "", Constant.KEY_LONGITUDE, Constant.KEY_LATITUDE, "Lcom/huami/nfc/bus/MiPayChannelInfo;", "payChannelInfo", "phone", Configs.Params.CAPTCHA, "Lcom/huami/nfc/bus/OrderEntity;", "generateOrder", "(ILjava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Lcom/huami/nfc/bus/MiPayChannelInfo;Ljava/lang/String;Ljava/lang/String;)Lcom/huami/nfc/base/PayResponse;", "orderId", "aid", "cardName", "Lcom/huami/nfc/bus/XiaomiOrderInfoEntity;", "getOrderInfo", "", "getOrders", FirebaseAnalytics.Event.REFUND, "seNumber", "getCardNumber", "xiaomiBusCardName", "Lcom/huami/nfc/web/entity/ProtocolEntity;", "getProtocol", "", "id", "agreeProtocol", "Lcom/huami/nfc/bus/XiaomiNoticesEntity;", "getNotices", "Lcom/huami/nfc/bus/CouponEntity;", "getCoupon", "Lcom/huami/nfc/bus/entities/CarouselEntity;", "getCarouselList", "getCardInstructions", "Lcom/huami/nfc/bus/entities/InvoiceEntity;", "info", "postInvoiceInfo", "Lcom/huami/nfc/bus/XiaomiInVoiceEntity;", "getInvoiceAddress", "getChargeInvoiceDescription", "appCode", "userProtocolId", "cityId", "issueCard", "charge", "deleteApp", "shiftCard", "checkShiftCard", "claimedBalance", "Lcom/huami/nfc/bus/PrepareTransferOut;", "prepareTransferOut", "confirmTransferOut", "Lcom/huami/nfc/bus/TransferIn;", "startTransferIn", "tag", "xmCardName", "Lcom/huami/nfc/bus/entities/XiaomiBulletin;", "bulletins", "Lcom/huami/nfc/bus/MiRefundStatus;", "queryRefundStatus", "applyRefund", "reasonCode", "Lcom/huami/nfc/bus/entities/PayAccountInfoPostBody;", "payAccountInfo", "Lcom/huami/nfc/bus/XiaomiPrepareReturn;", "prepareReturn", Configs.Params.AUTHCODE, "authChannel", "authorizationBind", "sendCaptcha", "a", "Lcom/huami/nfc/bus/api/IXiaomiWebApi;", "api", "<init>", "(Lcom/huami/nfc/bus/api/IXiaomiWebApi;)V", "nfc-bus_release"}, k = 1, mv = {1, 5, 1})
public final class XiaomiWebApiWrapperWithLogcat implements IXiaomiWebApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IXiaomiWebApi api;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<PayResponse<? extends String>, String> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<String> payResponse) {
            return "小米同意交通卡开卡充值协议";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a0 extends Lambda implements Function1<PayResponse<? extends Unit>, String> {
        public final /* synthetic */ City a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(City city, String str) {
            super(1);
            this.a = city;
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<Unit> payResponse) {
            return "小米退卡[" + this.a.getAppCode() + ',' + this.b + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<PayResponse<? extends Unit>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<Unit> payResponse) {
            return "小米申请退回服务费:[" + this.a + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b0 extends Lambda implements Function1<PayResponse<? extends Unit>, String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(String str, String str2, String str3) {
            super(1);
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<Unit> payResponse) {
            return "开卡验证码（小米）:[" + this.a + StringUtil.SPACE + this.b + StringUtil.SPACE + this.c + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<PayResponse<? extends Unit>, String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2) {
            super(1);
            this.a = str;
            this.b = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<Unit> payResponse) {
            return "退卡binding（小米）:[" + this.a + StringUtil.SPACE + this.b + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c0 extends Lambda implements Function1<PayResponse<? extends Unit>, String> {
        public final /* synthetic */ Ref.ObjectRef<String> a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(Ref.ObjectRef<String> objectRef, String str) {
            super(1);
            this.a = objectRef;
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<Unit> payResponse) {
            return this.a.element + JsonLexerKt.BEGIN_LIST + this.b + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "Lcom/huami/nfc/bus/entities/XiaomiBulletin;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<PayResponse<? extends List<XiaomiBulletin>>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<? extends List<XiaomiBulletin>> payResponse) {
            return "小米公告[" + this.a + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/bus/TransferIn;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d0 extends Lambda implements Function1<PayResponse<? extends TransferIn>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<TransferIn> payResponse) {
            return "小米发起转入公交卡[" + this.a + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<PayResponse<? extends Unit>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<Unit> payResponse) {
            return "小米交通卡充值[" + this.a + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<PayResponse<? extends Unit>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<Unit> payResponse) {
            return "小米检查移出公交卡[" + this.a + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<PayResponse<? extends Unit>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<Unit> payResponse) {
            return "小米确认移出公交卡[" + this.a + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function1<PayResponse<? extends Unit>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<Unit> payResponse) {
            return "小米交通卡删卡[" + this.a + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/bus/OrderEntity;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function1<PayResponse<? extends OrderEntity>, String> {
        public static final i a = new i();

        public i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<OrderEntity> payResponse) {
            return "小米生成订单";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function1<PayResponse<? extends String>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<String> payResponse) {
            return "小米获取开卡须知[" + this.a + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function1<PayResponse<? extends String>, String> {
        public static final k a = new k();

        public k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<String> payResponse) {
            return "小米获取交通卡卡号";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "Lcom/huami/nfc/bus/entities/CarouselEntity;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function1<PayResponse<? extends List<CarouselEntity>>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<? extends List<CarouselEntity>> payResponse) {
            return "小米获取轮播图[" + this.a + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function1<PayResponse<? extends String>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<String> payResponse) {
            return "小米获取充值发票说明[" + this.a + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "Lcom/huami/nfc/bus/CouponEntity;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function1<PayResponse<? extends List<CouponEntity>>, String> {
        public static final n a = new n();

        public n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<? extends List<CouponEntity>> payResponse) {
            return "小米获取优惠券";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/bus/XiaomiInVoiceEntity;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function1<PayResponse<? extends XiaomiInVoiceEntity>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<XiaomiInVoiceEntity> payResponse) {
            return "小米获取电子发票下载地址[" + this.a + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "Lcom/huami/nfc/bus/XiaomiNoticesEntity;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function1<PayResponse<? extends List<XiaomiNoticesEntity>>, String> {
        public static final p a = new p();

        public p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<? extends List<XiaomiNoticesEntity>> payResponse) {
            return "小米获取交通卡公告";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/bus/XiaomiOrderInfoEntity;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function1<PayResponse<? extends XiaomiOrderInfoEntity>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<XiaomiOrderInfoEntity> payResponse) {
            return "小米获取订单详情[" + this.a + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "Lcom/huami/nfc/bus/XiaomiOrderInfoEntity;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function1<PayResponse<? extends List<? extends XiaomiOrderInfoEntity>>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<? extends List<XiaomiOrderInfoEntity>> payResponse) {
            return "小米获取订单列表[" + this.a + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/web/entity/ProtocolEntity;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s extends Lambda implements Function1<PayResponse<? extends ProtocolEntity>, String> {
        public static final s a = new s();

        public s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<ProtocolEntity> payResponse) {
            return "小米获取交通卡开卡充值协议";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "Lcom/huami/nfc/bus/TransAmountEntity;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class t extends Lambda implements Function1<PayResponse<? extends List<TransAmountEntity>>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<? extends List<TransAmountEntity>> payResponse) {
            return "小米获取相关费用[" + this.a + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class u extends Lambda implements Function1<PayResponse<? extends Unit>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<Unit> payResponse) {
            return "小米交通卡开卡[" + this.a + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class v extends Lambda implements Function1<PayResponse<? extends Unit>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<Unit> payResponse) {
            return "小米创建服务费电子发票相关信息[" + this.a + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/bus/XiaomiPrepareReturn;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class w extends Lambda implements Function1<PayResponse<? extends XiaomiPrepareReturn>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<XiaomiPrepareReturn> payResponse) {
            return "准备退卡（小米）:[" + this.a + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/bus/PrepareTransferOut;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class x extends Lambda implements Function1<PayResponse<? extends PrepareTransferOut>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<PrepareTransferOut> payResponse) {
            return "小米准备移出公交卡[" + this.a + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/bus/MiRefundStatus;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class y extends Lambda implements Function1<PayResponse<? extends MiRefundStatus>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<MiRefundStatus> payResponse) {
            return "小米查询退服务费状态:[" + this.a + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class z extends Lambda implements Function1<PayResponse<? extends Unit>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<Unit> payResponse) {
            return "小米申请退款[" + this.a + JsonLexerKt.END_LIST;
        }
    }

    public XiaomiWebApiWrapperWithLogcat(@NotNull IXiaomiWebApi iXiaomiWebApi) {
        this.api = iXiaomiWebApi;
    }

    @Override // com.huami.nfc.bus.api.IXiaomiWebApi
    @NotNull
    public PayResponse<String> agreeProtocol(long id) {
        return PayResponseExtensionsKt.logcat(this.api.agreeProtocol(id), ErrorCodeConstant.MI_AGREE_PROTOCOL, a.a);
    }

    @Override // com.huami.nfc.bus.api.IXiaomiWebApi
    @NotNull
    public PayResponse<Unit> applyRefund(@NotNull String xmCardName) {
        return PayResponseExtensionsKt.logcat(this.api.applyRefund(xmCardName), ErrorCodeConstant.MI_APPLY_REFUND, new b(xmCardName));
    }

    @Override // com.huami.nfc.bus.api.IXiaomiWebApi
    @NotNull
    public PayResponse<Unit> authorizationBind(@NotNull String xmCardName, @NotNull String authCode, @NotNull String authChannel) {
        return PayResponseExtensionsKt.logcat(this.api.authorizationBind(xmCardName, authCode, authChannel), ErrorCodeConstant.MI_RETURN_BIND, new c(xmCardName, authChannel));
    }

    @Override // com.huami.nfc.bus.api.IXiaomiWebApi
    @NotNull
    public PayResponse<List<XiaomiBulletin>> bulletins(@NotNull String tag, @Nullable String xmCardName, @Nullable String aid) {
        return PayResponseExtensionsKt.logcat(this.api.bulletins(tag, xmCardName, aid), ErrorCodeConstant.MI_GET_BULLETINS, new d(tag));
    }

    @Override // com.huami.nfc.bus.api.IXiaomiAppletWebApi
    @NotNull
    public PayResponse<Unit> charge(@NotNull String appCode, @NotNull String aid, @NotNull String deviceId, @NotNull String orderToken) {
        return PayResponseExtensionsKt.logcat(this.api.charge(appCode, aid, deviceId, orderToken), ErrorCodeConstant.MI_CHARGE, new e(appCode));
    }

    @Override // com.huami.nfc.bus.api.IXiaomiAppletWebApi
    @NotNull
    public PayResponse<Unit> checkShiftCard(@NotNull String appCode, @NotNull String aid, @NotNull String miCardName, @NotNull String deviceId) {
        return PayResponseExtensionsKt.logcat(this.api.checkShiftCard(appCode, aid, miCardName, deviceId), ErrorCodeConstant.MI_CHECK_SHIFT_OUT_CARD, new f(miCardName));
    }

    @Override // com.huami.nfc.bus.api.IXiaomiWebApi
    @NotNull
    public PayResponse<Unit> confirmTransferOut(@NotNull String orderId) {
        return PayResponseExtensionsKt.logcat(this.api.confirmTransferOut(orderId), ErrorCodeConstant.MI_CONFIRM_TRANSFER_OUT, new g(orderId));
    }

    @Override // com.huami.nfc.bus.api.IXiaomiAppletWebApi
    @NotNull
    public PayResponse<Unit> deleteApp(@NotNull String appCode, @NotNull String aid, @NotNull String deviceId) {
        return PayResponseExtensionsKt.logcat(this.api.deleteApp(appCode, aid, deviceId), ErrorCodeConstant.MI_DELETE, new h(appCode));
    }

    @Override // com.huami.nfc.bus.api.IXiaomiWebApi
    @NotNull
    public PayResponse<OrderEntity> generateOrder(int feeId, @Nullable Integer couponId, @Nullable Double longitude, @Nullable Double latitude, @Nullable MiPayChannelInfo payChannelInfo, @Nullable String phone, @Nullable String captcha) {
        return PayResponseExtensionsKt.logcat(this.api.generateOrder(feeId, couponId, longitude, latitude, payChannelInfo, phone, captcha), ErrorCodeConstant.MI_GENERATE_ORDER, i.a);
    }

    @Override // com.huami.nfc.bus.api.IXiaomiWebApi
    @NotNull
    public PayResponse<String> getCardInstructions(@NotNull String miCardName) {
        return PayResponseExtensionsKt.logcat(this.api.getCardInstructions(miCardName), ErrorCodeConstant.MI_GET_CARD_INSTRUCTIONS, new j(miCardName));
    }

    @Override // com.huami.nfc.bus.api.IXiaomiWebApi
    @NotNull
    public PayResponse<String> getCardNumber(@NotNull String aid, @NotNull String seNumber) {
        return PayResponseExtensionsKt.logcat(this.api.getCardNumber(aid, seNumber), ErrorCodeConstant.MI_GET_CARD_NUMBER, k.a);
    }

    @Override // com.huami.nfc.bus.api.IXiaomiWebApi
    @NotNull
    public PayResponse<List<CarouselEntity>> getCarouselList(@NotNull String miCardName) {
        return PayResponseExtensionsKt.logcat(this.api.getCarouselList(miCardName), ErrorCodeConstant.MI_GET_CAROUSEL_LIST, new l(miCardName));
    }

    @Override // com.huami.nfc.bus.api.IXiaomiWebApi
    @NotNull
    public PayResponse<String> getChargeInvoiceDescription(@NotNull String miCardName) {
        return PayResponseExtensionsKt.logcat(this.api.getChargeInvoiceDescription(miCardName), ErrorCodeConstant.MI_GET_CHARGE_INVOICE_DESCRIPTION, new m(miCardName));
    }

    @Override // com.huami.nfc.bus.api.IXiaomiWebApi
    @NotNull
    public PayResponse<List<CouponEntity>> getCoupon(int feeId) {
        return PayResponseExtensionsKt.logcat(this.api.getCoupon(feeId), ErrorCodeConstant.MI_GET_COUPON, n.a);
    }

    @Override // com.huami.nfc.bus.api.IXiaomiWebApi
    @NotNull
    public PayResponse<XiaomiInVoiceEntity> getInvoiceAddress(@NotNull String miCardName) {
        return PayResponseExtensionsKt.logcat(this.api.getInvoiceAddress(miCardName), ErrorCodeConstant.MI_GET_INVOICE_ADDRESS, new o(miCardName));
    }

    @Override // com.huami.nfc.bus.api.IXiaomiWebApi
    @NotNull
    public PayResponse<List<XiaomiNoticesEntity>> getNotices() {
        return PayResponseExtensionsKt.logcat(this.api.getNotices(), ErrorCodeConstant.MI_GET_NOTICES, p.a);
    }

    @Override // com.huami.nfc.bus.api.IXiaomiWebApi
    @NotNull
    public PayResponse<XiaomiOrderInfoEntity> getOrderInfo(@NotNull String orderId, @Nullable String aid, @Nullable String cardName) {
        return PayResponseExtensionsKt.logcat(this.api.getOrderInfo(orderId, aid, cardName), ErrorCodeConstant.MI_GET_ORDER_INFO, new q(orderId));
    }

    @Override // com.huami.nfc.bus.api.IXiaomiWebApi
    @NotNull
    public PayResponse<List<XiaomiOrderInfoEntity>> getOrders(@NotNull String miCardName) {
        return PayResponseExtensionsKt.logcat(this.api.getOrders(miCardName), ErrorCodeConstant.MI_GET_ORDER_LIST, new r(miCardName));
    }

    @Override // com.huami.nfc.bus.api.IXiaomiWebApi
    @NotNull
    public PayResponse<ProtocolEntity> getProtocol(@NotNull String xiaomiBusCardName, @NotNull String actionType) {
        return PayResponseExtensionsKt.logcat(this.api.getProtocol(xiaomiBusCardName, actionType), ErrorCodeConstant.MI_GET_PROTOCOL, s.a);
    }

    @Override // com.huami.nfc.bus.api.IXiaomiWebApi
    @NotNull
    public PayResponse<List<TransAmountEntity>> getTransactionAmount(@NotNull String miCardName, @NotNull PayType type) {
        return PayResponseExtensionsKt.logcat(this.api.getTransactionAmount(miCardName, type), ErrorCodeConstant.MI_GET_TRANSACTION_AMOUNT, new t(miCardName));
    }

    @Override // com.huami.nfc.bus.api.IXiaomiAppletWebApi
    @NotNull
    public PayResponse<Unit> issueCard(@NotNull String appCode, @NotNull String aid, @NotNull String deviceId, @NotNull String orderToken, @Nullable String userProtocolId, @Nullable String cityId) {
        return PayResponseExtensionsKt.logcat(this.api.issueCard(appCode, aid, deviceId, orderToken, userProtocolId, cityId), ErrorCodeConstant.MI_ISSUE_CARD, new u(appCode));
    }

    @Override // com.huami.nfc.bus.api.IXiaomiWebApi
    @NotNull
    public PayResponse<Unit> postInvoiceInfo(@NotNull String miCardName, @NotNull InvoiceEntity info) {
        return PayResponseExtensionsKt.logcat(this.api.postInvoiceInfo(miCardName, info), ErrorCodeConstant.MI_POST_INVOICE_INFO, new v(miCardName));
    }

    @Override // com.huami.nfc.bus.api.IXiaomiWebApi
    @NotNull
    public PayResponse<XiaomiPrepareReturn> prepareReturn(@NotNull String xmCardName, @NotNull String claimedBalance, @Nullable String reasonCode, @Nullable PayAccountInfoPostBody payAccountInfo) {
        return PayResponseExtensionsKt.logcat(this.api.prepareReturn(xmCardName, claimedBalance, reasonCode, payAccountInfo), ErrorCodeConstant.MI_PREPARE_RETURN, new w(xmCardName));
    }

    @Override // com.huami.nfc.bus.api.IXiaomiWebApi
    @NotNull
    public PayResponse<PrepareTransferOut> prepareTransferOut(@NotNull String cardName, @NotNull String claimedBalance) {
        return PayResponseExtensionsKt.logcat(this.api.prepareTransferOut(cardName, claimedBalance), ErrorCodeConstant.MI_PREPARE_TRANSFER_OUT, new x(cardName));
    }

    @Override // com.huami.nfc.bus.api.IXiaomiWebApi
    @NotNull
    public PayResponse<MiRefundStatus> queryRefundStatus(@NotNull String xmCardName) {
        return PayResponseExtensionsKt.logcat(this.api.queryRefundStatus(xmCardName), ErrorCodeConstant.MI_QUERY_REFUND_STATUS, new y(xmCardName));
    }

    @Override // com.huami.nfc.bus.api.IXiaomiWebApi
    @NotNull
    public PayResponse<Unit> refund(@NotNull String orderId) {
        return PayResponseExtensionsKt.logcat(this.api.refund(orderId), ErrorCodeConstant.MI_GET_ORDER_REFUND, new z(orderId));
    }

    @Override // com.huami.nfc.bus.api.IXiaomiAppletWebApi
    @NotNull
    public PayResponse<Unit> returnCard(@NotNull City city, @NotNull String deviceId, @NotNull String orderToken, @NotNull String actionType) {
        return PayResponseExtensionsKt.logcat(this.api.returnCard(city, deviceId, orderToken, actionType), ErrorCodeConstant.MI_RETURN, new a0(city, orderToken));
    }

    @Override // com.huami.nfc.bus.api.IXiaomiWebApi
    @NotNull
    public PayResponse<Unit> sendCaptcha(@NotNull String phone, @NotNull String cardName, @NotNull String actionType) {
        return PayResponseExtensionsKt.logcat(this.api.sendCaptcha(phone, cardName, actionType), ErrorCodeConstant.MI_SEND_CAPTCHA, new b0(phone, cardName, actionType));
    }

    @Override // com.huami.nfc.bus.api.IXiaomiAppletWebApi
    @NotNull
    public PayResponse<Unit> shiftCard(@NotNull String appCode, @NotNull String aid, @NotNull String miCardName, @NotNull String deviceId, @NotNull String orderToken, @NotNull String actionType) {
        String str;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "小米交通卡移出卡";
        if (Intrinsics.areEqual(actionType, ApduAction.ShiftOutCard.getValue())) {
            str = ErrorCodeConstant.MI_SHIFT_OUT_CARD;
        } else {
            objectRef.element = "小米交通卡移入卡";
            str = ErrorCodeConstant.MI_SHIFT_IN_CARD;
        }
        return PayResponseExtensionsKt.logcat(this.api.shiftCard(appCode, aid, miCardName, deviceId, orderToken, actionType), str, new c0(objectRef, miCardName));
    }

    @Override // com.huami.nfc.bus.api.IXiaomiWebApi
    @NotNull
    public PayResponse<TransferIn> startTransferIn(@NotNull String orderId) {
        return PayResponseExtensionsKt.logcat(this.api.startTransferIn(orderId), ErrorCodeConstant.MI_START_TRANSFER_IN, new d0(orderId));
    }
}
