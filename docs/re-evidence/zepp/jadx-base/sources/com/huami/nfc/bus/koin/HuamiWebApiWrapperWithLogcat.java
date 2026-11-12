package com.huami.nfc.bus.koin;

import androidx.autofill.HintConstants;
import com.huami.nfc.applet.TransEntity;
import com.huami.nfc.base.ErrorCodeConstant;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.base.PayResponseExtensionsKt;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010G\u001a\u00020\u0001¢\u0006\u0004\bH\u0010IJ\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J<\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016JM\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H\u0016J&\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0016JK\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u00042\u0006\u0010\b\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J&\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u00042\u0006\u0010\b\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016J\u0014\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\t0\u0004H\u0016J\u001e\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0002H\u0016J\u001e\u0010*\u001a\b\u0012\u0004\u0012\u00020(0\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0002H\u0016J\u001e\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u0010H\u0016J'\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010+\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b-\u0010.J\u0016\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u001e\u00102\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u00101\u001a\u00020/H\u0016J,\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\t0\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u001e\u00105\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u00101\u001a\u0002032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u001e\u00108\u001a\b\u0012\u0004\u0012\u0002070\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u0002H\u0016J\u001e\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u0002H\u0016J\u0014\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0\u001e0\u0004H\u0016J\u001e\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u0002H\u0016J.\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010@\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u00022\u0006\u0010B\u001a\u00020AH\u0016R\u0016\u0010G\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006J"}, d2 = {"Lcom/huami/nfc/bus/koin/HuamiWebApiWrapperWithLogcat;", "Lcom/huami/nfc/bus/api/IHuamiWebApi;", "", "userId", "Lcom/huami/nfc/base/PayResponse;", "getPhoneNumber", "appCode", "cardNumber", "deviceId", "", "Lcom/huami/nfc/applet/TransEntity;", "trans", "", "uploadTransactions", "", "type", "", "next", "limit", "getTransactionsRecord", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Long;I)Lcom/huami/nfc/base/PayResponse;", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "Lcom/huami/nfc/bus/VerifyCodeEntity;", "sendCaptcha", Configs.Params.CAPTCHA, "verifyCaptcha", "", Constant.KEY_LONGITUDE, Constant.KEY_LATITUDE, "gpsCityCode", "", "Lcom/huami/nfc/bus/CityInfoEntity;", "getAvailableCitiesWithStatus", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)Lcom/huami/nfc/base/PayResponse;", "getCityInfo", "cityCode", "getInstalledBusCards", "Lcom/huami/nfc/bus/NoticesEntity;", "getNotices", "actionType", "Lcom/huami/nfc/web/entity/ProtocolEntity;", "getProtocol", "getShiftProtocol", "id", "agreeProtocol", "agreeShiftProtocol", "(Ljava/lang/String;Ljava/lang/Long;)Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/bus/entities/InvoiceEntity;", "getFeeInvoice", "info", "postFeeInvoice", "Lcom/huami/nfc/bus/entities/CardInfoEntity;", "getCardInfoList", "postCardInfo", "cardNo", "Lcom/huami/nfc/bus/entities/OpenFeeStateEntity;", "getOpenFeeStatus", "Lcom/huami/nfc/bus/entities/RefundOpenFeeEntity;", "applyRefundOpenFee", "Lcom/huami/nfc/bus/entities/ReturnCardReason;", "returnCardReason", "authChannelType", "Lcom/huami/nfc/bus/entities/PayAuthorizationInfo;", Common.AUTHORIZATION, "refundReasonCode", "Lcom/huami/nfc/bus/entities/RefundTicketPostBody;", "refundTicketPostBody", "Lcom/huami/nfc/bus/entities/RefundTicket;", "refundTicket", "a", "Lcom/huami/nfc/bus/api/IHuamiWebApi;", "api", "<init>", "(Lcom/huami/nfc/bus/api/IHuamiWebApi;)V", "nfc-bus_release"}, k = 1, mv = {1, 5, 1})
public final class HuamiWebApiWrapperWithLogcat implements IHuamiWebApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IHuamiWebApi api;

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
            return "华米同意交通卡开卡充值协议";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<PayResponse<? extends String>, String> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<String> payResponse) {
            return "华米同意交通卡迁卡协议";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/bus/entities/RefundOpenFeeEntity;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<PayResponse<? extends RefundOpenFeeEntity>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<RefundOpenFeeEntity> payResponse) {
            return "华米申请退服务费[" + this.a + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/bus/entities/PayAuthorizationInfo;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<PayResponse<? extends PayAuthorizationInfo>, String> {
        public static final d a = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<PayAuthorizationInfo> payResponse) {
            return "生成支付授权信息";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "Lcom/huami/nfc/bus/CityInfoEntity;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<PayResponse<? extends List<? extends CityInfoEntity>>, String> {
        public static final e a = new e();

        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<? extends List<CityInfoEntity>> payResponse) {
            return "获取交通卡列表(三合一)";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "Lcom/huami/nfc/bus/entities/CardInfoEntity;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<PayResponse<? extends List<CardInfoEntity>>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<? extends List<CardInfoEntity>> payResponse) {
            return "华米获取交通卡详情列表信息[" + this.a + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/bus/CityInfoEntity;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<PayResponse<? extends CityInfoEntity>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<CityInfoEntity> payResponse) {
            return "华米获取交通卡详情信息[" + this.a + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/bus/entities/InvoiceEntity;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function1<PayResponse<? extends InvoiceEntity>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<InvoiceEntity> payResponse) {
            return "华米获取发票相关信息[" + this.a + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "Lcom/huami/nfc/bus/CityInfoEntity;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function1<PayResponse<? extends List<? extends CityInfoEntity>>, String> {
        public static final i a = new i();

        public i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<? extends List<CityInfoEntity>> payResponse) {
            return "华米已开通交通卡列表";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "Lcom/huami/nfc/bus/NoticesEntity;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function1<PayResponse<? extends List<NoticesEntity>>, String> {
        public static final j a = new j();

        public j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<? extends List<NoticesEntity>> payResponse) {
            return "华米获取交通卡公告";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/bus/entities/OpenFeeStateEntity;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function1<PayResponse<? extends OpenFeeStateEntity>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<OpenFeeStateEntity> payResponse) {
            return "华米获取退开卡费状态[" + this.a + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function1<PayResponse<? extends String>, String> {
        public static final l a = new l();

        public l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<String> payResponse) {
            return "华米获取用户已绑定的手机号接口";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/web/entity/ProtocolEntity;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function1<PayResponse<? extends ProtocolEntity>, String> {
        public static final m a = new m();

        public m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<ProtocolEntity> payResponse) {
            return "华米获取交通卡开卡充值协议";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/web/entity/ProtocolEntity;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function1<PayResponse<? extends ProtocolEntity>, String> {
        public static final n a = new n();

        public n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<ProtocolEntity> payResponse) {
            return "华米获取交通卡迁卡协议";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "Lcom/huami/nfc/applet/TransEntity;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function1<PayResponse<? extends List<TransEntity>>, String> {
        public static final o a = new o();

        public o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<? extends List<TransEntity>> payResponse) {
            return "华米获取交通卡交易记录接口";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function1<PayResponse<? extends Unit>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<Unit> payResponse) {
            return "华米上传交通卡详情信息[" + this.a + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function1<PayResponse<? extends Unit>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<Unit> payResponse) {
            return "华米创建发票相关信息[" + this.a + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/bus/entities/RefundTicket;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function1<PayResponse<? extends RefundTicket>, String> {
        public static final r a = new r();

        public r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<RefundTicket> payResponse) {
            return "生成退卡工单";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "Lcom/huami/nfc/bus/entities/ReturnCardReason;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s extends Lambda implements Function1<PayResponse<? extends List<? extends ReturnCardReason>>, String> {
        public static final s a = new s();

        public s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<? extends List<ReturnCardReason>> payResponse) {
            return "退卡原因";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/bus/VerifyCodeEntity;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class t extends Lambda implements Function1<PayResponse<? extends VerifyCodeEntity>, String> {
        public static final t a = new t();

        public t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<VerifyCodeEntity> payResponse) {
            return "华米发送验证码";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class u extends Lambda implements Function1<PayResponse<? extends Unit>, String> {
        public static final u a = new u();

        public u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<Unit> payResponse) {
            return "华米上传交通卡交易记录接口";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class v extends Lambda implements Function1<PayResponse<? extends Unit>, String> {
        public static final v a = new v();

        public v() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<Unit> payResponse) {
            return "华米校验手机验证码接口";
        }
    }

    public HuamiWebApiWrapperWithLogcat(@NotNull IHuamiWebApi iHuamiWebApi) {
        this.api = iHuamiWebApi;
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<String> agreeProtocol(@NotNull String appCode, long id) {
        return PayResponseExtensionsKt.logcat(this.api.agreeProtocol(appCode, id), ErrorCodeConstant.HUAMI_AGREE_PROTOCOL, a.a);
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<String> agreeShiftProtocol(@NotNull String appCode, @Nullable Long id) {
        return PayResponseExtensionsKt.logcat(this.api.agreeShiftProtocol(appCode, id), ErrorCodeConstant.HUAMI_AGREE_PROTOCOL, b.a);
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<RefundOpenFeeEntity> applyRefundOpenFee(@NotNull String appCode, @NotNull String cardNo) {
        return PayResponseExtensionsKt.logcat(this.api.applyRefundOpenFee(appCode, cardNo), ErrorCodeConstant.HUAMI_REFUND_OPEN_FEE, new c(appCode));
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<PayAuthorizationInfo> authorization(@NotNull String appCode, @NotNull String authChannelType) {
        return PayResponseExtensionsKt.logcat(this.api.authorization(appCode, authChannelType), ErrorCodeConstant.HUAMI_PAY_AUTHORIZATIONINFO, d.a);
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<List<CityInfoEntity>> getAvailableCitiesWithStatus(@NotNull String deviceId, @Nullable Double longitude, @Nullable Double latitude, @Nullable String appCode, @Nullable String gpsCityCode) {
        return PayResponseExtensionsKt.logcat(this.api.getAvailableCitiesWithStatus(deviceId, longitude, latitude, appCode, gpsCityCode), ErrorCodeConstant.HUAMI_GET_AVAILABLE_CITIES_WITH_STATUS, e.a);
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<List<CardInfoEntity>> getCardInfoList(@NotNull String appCode, int limit, int next) {
        return PayResponseExtensionsKt.logcat(this.api.getCardInfoList(appCode, limit, next), ErrorCodeConstant.HUAMI_GET_CARD_LIST, new f(appCode));
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<CityInfoEntity> getCityInfo(@NotNull String appCode) {
        return PayResponseExtensionsKt.logcat(this.api.getCityInfo(appCode), ErrorCodeConstant.HUAMI_GET_CARD_INFO, new g(appCode));
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<InvoiceEntity> getFeeInvoice(@NotNull String appCode) {
        return PayResponseExtensionsKt.logcat(this.api.getFeeInvoice(appCode), ErrorCodeConstant.HUAMI_GET_FEE_INVOICE, new h(appCode));
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<List<CityInfoEntity>> getInstalledBusCards(@NotNull String deviceId, @Nullable String cityCode) {
        return PayResponseExtensionsKt.logcat(this.api.getInstalledBusCards(deviceId, cityCode), ErrorCodeConstant.HUAMI_GET_INSTALLED_BUS_CARDS, i.a);
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<List<NoticesEntity>> getNotices() {
        return PayResponseExtensionsKt.logcat(this.api.getNotices(), ErrorCodeConstant.HUAMI_GET_NOTICES, j.a);
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<OpenFeeStateEntity> getOpenFeeStatus(@NotNull String appCode, @NotNull String cardNo) {
        return PayResponseExtensionsKt.logcat(this.api.getOpenFeeStatus(appCode, cardNo), ErrorCodeConstant.HUAMI_GET_OPEN_FEE_STATUS, new k(appCode));
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<String> getPhoneNumber(@NotNull String userId) {
        return PayResponseExtensionsKt.logcat(this.api.getPhoneNumber(userId), ErrorCodeConstant.HUAMI_GET_PHONE_NUMBER, l.a);
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<ProtocolEntity> getProtocol(@NotNull String appCode, @NotNull String actionType) {
        return PayResponseExtensionsKt.logcat(this.api.getProtocol(appCode, actionType), ErrorCodeConstant.HUAMI_GET_PROTOCOL, m.a);
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<ProtocolEntity> getShiftProtocol(@NotNull String appCode, @NotNull String actionType) {
        return PayResponseExtensionsKt.logcat(this.api.getShiftProtocol(appCode, actionType), ErrorCodeConstant.HUAMI_GET_PROTOCOL, n.a);
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<List<TransEntity>> getTransactionsRecord(@NotNull String userId, @NotNull String appCode, @NotNull String cardNumber, int type, @Nullable Long next, int limit) {
        return PayResponseExtensionsKt.logcat(this.api.getTransactionsRecord(userId, appCode, cardNumber, type, next, limit), ErrorCodeConstant.HUAMI_GET_TRANSACTIONS_RECORD, o.a);
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<Unit> postCardInfo(@NotNull CardInfoEntity info, @NotNull String appCode) {
        return PayResponseExtensionsKt.logcat(this.api.postCardInfo(info, appCode), ErrorCodeConstant.HUAMI_POST_CARD_INFO, new p(appCode));
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<Unit> postFeeInvoice(@NotNull String appCode, @NotNull InvoiceEntity info) {
        return PayResponseExtensionsKt.logcat(this.api.postFeeInvoice(appCode, info), ErrorCodeConstant.HUAMI_POST_FEE_INVOICE, new q(appCode));
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<RefundTicket> refundTicket(@NotNull String appCode, @NotNull String refundReasonCode, @NotNull String cardNo, @NotNull RefundTicketPostBody refundTicketPostBody) {
        return PayResponseExtensionsKt.logcat(this.api.refundTicket(appCode, refundReasonCode, cardNo, refundTicketPostBody), ErrorCodeConstant.HUAMI_REFUNDTICKET, r.a);
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<List<ReturnCardReason>> returnCardReason() {
        return PayResponseExtensionsKt.logcat(this.api.returnCardReason(), ErrorCodeConstant.HUAMI_RETURNCARD_REASON, s.a);
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<VerifyCodeEntity> sendCaptcha(@NotNull String userId, @NotNull String phoneNumber) {
        return PayResponseExtensionsKt.logcat(this.api.sendCaptcha(userId, phoneNumber), ErrorCodeConstant.HUAMI_SEND_CAPTCHA, t.a);
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<Unit> uploadTransactions(@NotNull String userId, @NotNull String appCode, @NotNull String cardNumber, @NotNull String deviceId, @NotNull List<TransEntity> trans) {
        return PayResponseExtensionsKt.logcat(this.api.uploadTransactions(userId, appCode, cardNumber, deviceId, trans), ErrorCodeConstant.HUAMI_UPLOAD_TRANSACTIONS, u.a);
    }

    @Override // com.huami.nfc.bus.api.IHuamiWebApi
    @NotNull
    public PayResponse<Unit> verifyCaptcha(@NotNull String userId, @NotNull String phoneNumber, @NotNull String captcha) {
        return PayResponseExtensionsKt.logcat(this.api.verifyCaptcha(userId, phoneNumber, captcha), ErrorCodeConstant.HUAMI_VERIFY_CAPTCHA, v.a);
    }
}
