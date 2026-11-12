package com.huami.nfc.bus.koin;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.huami.nfc.base.ErrorCodeConstant;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.base.PayResponseExtensionsKt;
import com.huami.nfc.bus.ExtraInfo;
import com.huami.nfc.bus.OrderCategory;
import com.huami.nfc.bus.OrderEntity;
import com.huami.nfc.bus.OrderInfoEntity;
import com.huami.nfc.bus.PayChannel;
import com.huami.nfc.bus.PayType;
import com.huami.nfc.bus.TransAmountEntity;
import com.huami.nfc.bus.api.ISnowballWebApi;
import com.huami.nfc.bus.entities.SiteInfo;
import com.huami.watch.companion.mediac.Command;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u00104\u001a\u00020\u0001¢\u0006\u0004\b5\u00106J$\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J.\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J(\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016J>\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fH\u0016J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00062\u0006\u0010\u001b\u001a\u00020\u0002H\u0016J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00062\u0006\u0010\u001b\u001a\u00020\u0002H\u0016J\u0014\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00180\u0006H\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J6\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0002H\u0016J8\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010#H\u0016J\u001e\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0002H\u0016J\u001e\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0002H\u0016J.\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#H\u0016J.\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#H\u0016J\u001e\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u00062\u0006\u0010,\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u0002H\u0016J&\u00101\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u0002H\u0016R\u0016\u00104\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00067"}, d2 = {"Lcom/huami/nfc/bus/koin/SnowballWebApiWrapperWithLogcat;", "Lcom/huami/nfc/bus/api/ISnowballWebApi;", "", "appCode", "Lcom/huami/nfc/bus/PayType;", "type", "Lcom/huami/nfc/base/PayResponse;", "", "Lcom/huami/nfc/bus/TransAmountEntity;", "getTransactionAmount", "Lcom/huami/nfc/bus/PayChannel;", "channel", "", "amount", "Lcom/huami/nfc/bus/OrderEntity;", "generateOrder", "shiftOrderNo", "generateShiftOrder", "", "start", Command.STOP, "Lcom/huami/nfc/bus/OrderCategory;", "category", "count", "", "Lcom/huami/nfc/bus/OrderInfoEntity;", "getOrders", "orderId", "getOrderInfo", "", FirebaseAnalytics.Event.REFUND, "getInstalledAids", "getCardNumber", "deviceId", "orderNum", "Lcom/huami/nfc/bus/ExtraInfo;", "extra", "actionType", "issueCard", "charge", "deleteApp", "safeDeleteApp", "shiftOutCard", "shiftInCard", "hciContent", "cityCode", "Lcom/huami/nfc/bus/entities/SiteInfo;", "getSiteInfo", "snbTicket", "returnCard", "a", "Lcom/huami/nfc/bus/api/ISnowballWebApi;", "api", "<init>", "(Lcom/huami/nfc/bus/api/ISnowballWebApi;)V", "nfc-bus_release"}, k = 1, mv = {1, 5, 1})
public final class SnowballWebApiWrapperWithLogcat implements ISnowballWebApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ISnowballWebApi api;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<PayResponse<? extends Unit>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<Unit> payResponse) {
            return "雪球交通卡充值[" + this.a + JsonLexerKt.END_LIST;
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
            return "雪球交通卡删卡[" + this.a + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/bus/OrderEntity;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<PayResponse<? extends OrderEntity>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<OrderEntity> payResponse) {
            return "雪球生成订单[" + this.a + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/bus/OrderEntity;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<PayResponse<? extends OrderEntity>, String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2) {
            super(1);
            this.a = str;
            this.b = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<OrderEntity> payResponse) {
            StringBuilder sb = new StringBuilder();
            sb.append("雪球生成移卡订单[");
            sb.append(this.a);
            sb.append(',');
            String str = this.b;
            if (str == null) {
                str = "";
            }
            sb.append(str);
            sb.append(JsonLexerKt.END_LIST);
            return sb.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<PayResponse<? extends String>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<String> payResponse) {
            return "雪球获取交通卡卡号[" + this.a + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<PayResponse<? extends List<? extends String>>, String> {
        public static final f a = new f();

        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<? extends List<String>> payResponse) {
            return "雪球获取已安装Applet aid列表";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/bus/OrderInfoEntity;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<PayResponse<? extends OrderInfoEntity>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<OrderInfoEntity> payResponse) {
            return "雪球订单详情[" + this.a + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "Lcom/huami/nfc/bus/OrderInfoEntity;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function1<PayResponse<? extends List<? extends OrderInfoEntity>>, String> {
        public static final h a = new h();

        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<? extends List<OrderInfoEntity>> payResponse) {
            return "雪球订单列表";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/bus/entities/SiteInfo;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function1<PayResponse<? extends SiteInfo>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<SiteInfo> payResponse) {
            return "雪球获取站点信息[" + this.a + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "Lcom/huami/nfc/bus/TransAmountEntity;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function1<PayResponse<? extends List<TransAmountEntity>>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<? extends List<TransAmountEntity>> payResponse) {
            return "雪球获取相关费用[" + this.a + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function1<PayResponse<? extends Unit>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<Unit> payResponse) {
            return "雪球交通卡开卡[" + this.a + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function1<PayResponse<? extends Unit>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<Unit> payResponse) {
            return "雪球申请退款[" + this.a + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function1<PayResponse<? extends Unit>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<Unit> payResponse) {
            return "雪球退卡[" + this.a + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function1<PayResponse<? extends Unit>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<Unit> payResponse) {
            return "雪球交通卡前置检查删卡[" + this.a + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function1<PayResponse<? extends Unit>, String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<Unit> payResponse) {
            return "雪球交通卡移入[" + this.a + JsonLexerKt.END_LIST;
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
            return "雪球交通卡移出[" + this.a + JsonLexerKt.END_LIST;
        }
    }

    public SnowballWebApiWrapperWithLogcat(@NotNull ISnowballWebApi iSnowballWebApi) {
        this.api = iSnowballWebApi;
    }

    @Override // com.huami.nfc.bus.api.ISnowballAppletWebApi
    @NotNull
    public PayResponse<Unit> charge(@NotNull String appCode, @NotNull String deviceId, @NotNull String orderNum, @NotNull String actionType, @Nullable ExtraInfo extra) {
        return PayResponseExtensionsKt.logcat(this.api.charge(appCode, deviceId, orderNum, actionType, extra), ErrorCodeConstant.SNB_CHARGE, new a(appCode));
    }

    @Override // com.huami.nfc.bus.api.ISnowballAppletWebApi
    @NotNull
    public PayResponse<Unit> deleteApp(@NotNull String appCode, @NotNull String deviceId) {
        return PayResponseExtensionsKt.logcat(this.api.deleteApp(appCode, deviceId), ErrorCodeConstant.SNB_DELETE_APP, new b(appCode));
    }

    @Override // com.huami.nfc.bus.api.ISnowballWebApi
    @NotNull
    public PayResponse<OrderEntity> generateOrder(@NotNull String appCode, @NotNull PayChannel channel, int amount, @NotNull PayType type) {
        return PayResponseExtensionsKt.logcat(this.api.generateOrder(appCode, channel, amount, type), ErrorCodeConstant.SNB_GENERATE_ORDER, new c(appCode));
    }

    @Override // com.huami.nfc.bus.api.ISnowballWebApi
    @NotNull
    public PayResponse<OrderEntity> generateShiftOrder(@NotNull String appCode, @NotNull PayType type, @Nullable String shiftOrderNo) {
        return PayResponseExtensionsKt.logcat(this.api.generateShiftOrder(appCode, type, shiftOrderNo), ErrorCodeConstant.SNB_GET_TRANSACTION_AMOUNT, new d(appCode, shiftOrderNo));
    }

    @Override // com.huami.nfc.bus.api.ISnowballWebApi
    @NotNull
    public PayResponse<String> getCardNumber(@NotNull String appCode) {
        return PayResponseExtensionsKt.logcat(this.api.getCardNumber(appCode), ErrorCodeConstant.SNB_GET_CARD_NUMBER, new e(appCode));
    }

    @Override // com.huami.nfc.bus.api.ISnowballWebApi
    @NotNull
    public PayResponse<List<String>> getInstalledAids() {
        return PayResponseExtensionsKt.logcat(this.api.getInstalledAids(), ErrorCodeConstant.SNB_GET_INSTALLED_AIDS, f.a);
    }

    @Override // com.huami.nfc.bus.api.ISnowballWebApi
    @NotNull
    public PayResponse<OrderInfoEntity> getOrderInfo(@NotNull String orderId) {
        return PayResponseExtensionsKt.logcat(this.api.getOrderInfo(orderId), ErrorCodeConstant.SNB_GET_ORDER_INFO, new g(orderId));
    }

    @Override // com.huami.nfc.bus.api.ISnowballWebApi
    @NotNull
    public PayResponse<List<OrderInfoEntity>> getOrders(@Nullable String appCode, long start, long stop, @NotNull OrderCategory category, int count) {
        return PayResponseExtensionsKt.logcat(this.api.getOrders(appCode, start, stop, category, count), ErrorCodeConstant.SNB_GET_ORDERS, h.a);
    }

    @Override // com.huami.nfc.bus.api.ISnowballWebApi
    @NotNull
    public PayResponse<SiteInfo> getSiteInfo(@NotNull String hciContent, @NotNull String cityCode) {
        return PayResponseExtensionsKt.logcat(this.api.getSiteInfo(hciContent, cityCode), ErrorCodeConstant.SNB_GET_SITE_INFO, new i(hciContent));
    }

    @Override // com.huami.nfc.bus.api.ISnowballWebApi
    @NotNull
    public PayResponse<List<TransAmountEntity>> getTransactionAmount(@NotNull String appCode, @NotNull PayType type) {
        return PayResponseExtensionsKt.logcat(this.api.getTransactionAmount(appCode, type), ErrorCodeConstant.SNB_GET_TRANSACTION_AMOUNT, new j(appCode));
    }

    @Override // com.huami.nfc.bus.api.ISnowballAppletWebApi
    @NotNull
    public PayResponse<Unit> issueCard(@NotNull String appCode, @NotNull String deviceId, @NotNull String orderNum, @NotNull ExtraInfo extra, @NotNull String actionType) {
        return PayResponseExtensionsKt.logcat(this.api.issueCard(appCode, deviceId, orderNum, extra, actionType), ErrorCodeConstant.SNB_ISSUE_CARD, new k(appCode));
    }

    @Override // com.huami.nfc.bus.api.ISnowballWebApi
    @NotNull
    public PayResponse<Unit> refund(@NotNull String orderId) {
        return PayResponseExtensionsKt.logcat(this.api.refund(orderId), ErrorCodeConstant.SNB_REFUND, new l(orderId));
    }

    @Override // com.huami.nfc.bus.api.ISnowballAppletWebApi
    @NotNull
    public PayResponse<Unit> returnCard(@NotNull String appCode, @NotNull String deviceId, @NotNull String snbTicket) {
        return PayResponseExtensionsKt.logcat(this.api.returnCard(appCode, deviceId, snbTicket), ErrorCodeConstant.SNB_RETURN_CARD, new m(snbTicket));
    }

    @Override // com.huami.nfc.bus.api.ISnowballAppletWebApi
    @NotNull
    public PayResponse<Unit> safeDeleteApp(@NotNull String appCode, @NotNull String deviceId) {
        return PayResponseExtensionsKt.logcat(this.api.safeDeleteApp(appCode, deviceId), ErrorCodeConstant.SNB_SAFE_DELETE_APP, new n(appCode));
    }

    @Override // com.huami.nfc.bus.api.ISnowballAppletWebApi
    @NotNull
    public PayResponse<Unit> shiftInCard(@NotNull String appCode, @NotNull String deviceId, @NotNull String orderNum, @NotNull ExtraInfo extra) {
        return PayResponseExtensionsKt.logcat(this.api.shiftInCard(appCode, deviceId, orderNum, extra), ErrorCodeConstant.SNB_SHIFT_IN_CARD, new o(appCode));
    }

    @Override // com.huami.nfc.bus.api.ISnowballAppletWebApi
    @NotNull
    public PayResponse<Unit> shiftOutCard(@NotNull String appCode, @NotNull String deviceId, @NotNull String orderNum, @NotNull ExtraInfo extra) {
        return PayResponseExtensionsKt.logcat(this.api.shiftOutCard(appCode, deviceId, orderNum, extra), ErrorCodeConstant.SNB_SHIFT_OUT_CARD, new p(appCode));
    }
}
