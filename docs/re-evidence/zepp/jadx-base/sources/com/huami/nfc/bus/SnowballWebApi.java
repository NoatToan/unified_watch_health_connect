package com.huami.nfc.bus;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huami.nfc.base.INfcChannel;
import com.huami.nfc.base.NfcChannelExtensionsKt;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.base.PayResponseKt;
import com.huami.nfc.bus.api.ISnowballAppletWebApi;
import com.huami.nfc.bus.api.ISnowballWebApi;
import com.huami.nfc.bus.entities.CardNo;
import com.huami.nfc.bus.entities.SiteInfo;
import com.huami.nfc.bus.service.SnowballService;
import com.huami.watch.companion.mediac.Command;
import com.tekartik.sqflite.Constant;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010:\u001a\u000208\u0012\u0006\u0010=\u001a\u00020;\u0012\u0006\u0010@\u001a\u00020>¢\u0006\u0004\bA\u0010BJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J$\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016J.\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\fH\u0016J(\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\tH\u0016J>\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0014H\u0016J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\u0006\u0010!\u001a\u00020\tH\u0016J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u000e2\u0006\u0010!\u001a\u00020\tH\u0016J\u0014\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u000eH\u0016J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\t0\u000e2\u0006\u0010\u000b\u001a\u00020\tH\u0016J\u001e\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u000e2\u0006\u0010'\u001a\u00020\t2\u0006\u0010(\u001a\u00020\tH\u0016J6\u00100\u001a\b\u0012\u0004\u0012\u00020#0\u000e2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020\t2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\tH\u0016J8\u00101\u001a\b\u0012\u0004\u0012\u00020#0\u000e2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020\t2\u0006\u0010/\u001a\u00020\t2\b\u0010.\u001a\u0004\u0018\u00010-H\u0016J\u001e\u00102\u001a\b\u0012\u0004\u0012\u00020#0\u000e2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010+\u001a\u00020\tH\u0016J\u001e\u00103\u001a\b\u0012\u0004\u0012\u00020#0\u000e2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010+\u001a\u00020\tH\u0016J.\u00104\u001a\b\u0012\u0004\u0012\u00020#0\u000e2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020\t2\u0006\u0010.\u001a\u00020-H\u0016J.\u00105\u001a\b\u0012\u0004\u0012\u00020#0\u000e2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020\t2\u0006\u0010.\u001a\u00020-H\u0016J&\u00107\u001a\b\u0012\u0004\u0012\u00020#0\u000e2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010+\u001a\u00020\t2\u0006\u00106\u001a\u00020\tH\u0016R\u0016\u0010:\u001a\u0002088\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00109R\u0016\u0010=\u001a\u00020;8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010<R\u0016\u0010@\u001a\u00020>8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010?¨\u0006C"}, d2 = {"Lcom/huami/nfc/bus/SnowballWebApi;", "Lcom/huami/nfc/bus/api/ISnowballWebApi;", "Lorg/json/JSONObject;", "json", "", "Lcom/huami/nfc/bus/OrderInfoEntity;", GoogleApiAvailabilityLight.a, "a", "c", "", "b", "appCode", "Lcom/huami/nfc/bus/PayType;", "type", "Lcom/huami/nfc/base/PayResponse;", "", "Lcom/huami/nfc/bus/TransAmountEntity;", "getTransactionAmount", "Lcom/huami/nfc/bus/PayChannel;", "channel", "", "amount", "Lcom/huami/nfc/bus/OrderEntity;", "generateOrder", "shiftOrderNo", "generateShiftOrder", "", "start", Command.STOP, "Lcom/huami/nfc/bus/OrderCategory;", "category", "count", "getOrders", "orderId", "getOrderInfo", "", FirebaseAnalytics.Event.REFUND, "getInstalledAids", "getCardNumber", "hciContent", "cityCode", "Lcom/huami/nfc/bus/entities/SiteInfo;", "getSiteInfo", "deviceId", "orderNum", "Lcom/huami/nfc/bus/ExtraInfo;", "extra", "actionType", "issueCard", "charge", "deleteApp", "safeDeleteApp", "shiftOutCard", "shiftInCard", "snbTicket", "returnCard", "Lcom/huami/nfc/bus/service/SnowballService;", "Lcom/huami/nfc/bus/service/SnowballService;", "service", "Lcom/huami/nfc/bus/api/ISnowballAppletWebApi;", "Lcom/huami/nfc/bus/api/ISnowballAppletWebApi;", "appletApi", "Lcom/huami/nfc/base/INfcChannel;", "Lcom/huami/nfc/base/INfcChannel;", Constant.h, "<init>", "(Lcom/huami/nfc/bus/service/SnowballService;Lcom/huami/nfc/bus/api/ISnowballAppletWebApi;Lcom/huami/nfc/base/INfcChannel;)V", "nfc-bus_release"}, k = 1, mv = {1, 5, 1})
public final class SnowballWebApi implements ISnowballWebApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SnowballService service;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ISnowballAppletWebApi appletApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final INfcChannel cmd;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<PayResponse<? extends Unit>> {
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ ExtraInfo f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3, String str4, ExtraInfo extraInfo) {
            super(0);
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = extraInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<Unit> invoke() {
            return SnowballWebApi.this.appletApi.charge(this.b, this.c, this.d, this.e, this.f);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<PayResponse<? extends Unit>> {
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2) {
            super(0);
            this.b = str;
            this.c = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<Unit> invoke() {
            return SnowballWebApi.this.appletApi.deleteApp(this.b, this.c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/json/JSONObject;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<JSONObject, Unit> {
        public final /* synthetic */ String a;
        public final /* synthetic */ PayChannel b;
        public final /* synthetic */ int c;
        public final /* synthetic */ PayType d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, PayChannel payChannel, int i, PayType payType) {
            super(1);
            this.a = str;
            this.b = payChannel;
            this.c = i;
            this.d = payType;
        }

        public final void a(@NotNull JSONObject jSONObject) throws JSONException {
            jSONObject.put(ConstantKt.KEY_APP_CODE, this.a);
            jSONObject.put(ConstantKt.KEY_PAYMENT_CHANNEL, this.b.getValue());
            jSONObject.put("payment_amount", this.c);
            jSONObject.put("order_type", this.d.getValue());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JSONObject jSONObject) throws JSONException {
            a(jSONObject);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/json/JSONObject;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<JSONObject, Unit> {
        public final /* synthetic */ String a;
        public final /* synthetic */ PayType b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, PayType payType, String str2) {
            super(1);
            this.a = str;
            this.b = payType;
            this.c = str2;
        }

        public final void a(@NotNull JSONObject jSONObject) throws JSONException {
            jSONObject.put(ConstantKt.KEY_APP_CODE, this.a);
            jSONObject.put(ConstantKt.KEY_PAYMENT_CHANNEL, PayChannel.AliPay.getValue());
            jSONObject.put("payment_amount", 0);
            jSONObject.put("order_type", this.b.getValue());
            String str = this.c;
            if (str != null) {
                jSONObject.put("shiftOrderNo", str);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JSONObject jSONObject) throws JSONException {
            a(jSONObject);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/json/JSONObject;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<JSONObject, Unit> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(1);
            this.a = str;
        }

        public final void a(@NotNull JSONObject jSONObject) throws JSONException {
            jSONObject.put(ConstantKt.KEY_APP_CODE, this.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JSONObject jSONObject) throws JSONException {
            a(jSONObject);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/bus/entities/CardNo;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<PayResponse<? extends CardNo>, String> {
        public static final f a = new f();

        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<CardNo> payResponse) {
            CardNo data = payResponse.getData();
            if (data == null) {
                return null;
            }
            return data.getNumber();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n"}, d2 = {"", "isSuccessful", "", "value", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function2<Boolean, String, List<? extends String>> {
        public g() {
            super(2);
        }

        @Nullable
        public final List<String> a(boolean z, @Nullable String str) {
            if (z) {
                if (!(str == null || str.length() == 0)) {
                    return SnowballWebApi.this.b(new JSONObject(str));
                }
            }
            return CollectionsKt___CollectionsKt.toList(new ArrayList());
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ List<? extends String> invoke(Boolean bool, String str) {
            return a(bool.booleanValue(), str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n"}, d2 = {"", "isSuccessful", "", "value", "Lcom/huami/nfc/bus/OrderInfoEntity;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function2<Boolean, String, OrderInfoEntity> {
        public h() {
            super(2);
        }

        @Nullable
        public final OrderInfoEntity a(boolean z, @Nullable String str) {
            if (!z) {
                return null;
            }
            if (str == null || str.length() == 0) {
                return null;
            }
            return SnowballWebApi.this.c(new JSONObject(str));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ OrderInfoEntity invoke(Boolean bool, String str) {
            return a(bool.booleanValue(), str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n"}, d2 = {"", "isSuccessful", "", "value", "", "Lcom/huami/nfc/bus/OrderInfoEntity;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function2<Boolean, String, List<? extends OrderInfoEntity>> {
        public i() {
            super(2);
        }

        @Nullable
        public final List<OrderInfoEntity> a(boolean z, @Nullable String str) {
            if (z) {
                if (!(str == null || str.length() == 0)) {
                    return SnowballWebApi.this.d(new JSONObject(str));
                }
            }
            return CollectionsKt___CollectionsKt.toList(new ArrayList());
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ List<? extends OrderInfoEntity> invoke(Boolean bool, String str) {
            return a(bool.booleanValue(), str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/json/JSONObject;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function1<JSONObject, Unit> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, String str2) {
            super(1);
            this.a = str;
            this.b = str2;
        }

        public final void a(@NotNull JSONObject jSONObject) throws JSONException {
            jSONObject.put("hciContent", this.a);
            jSONObject.put("cityCode", this.b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JSONObject jSONObject) throws JSONException {
            a(jSONObject);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<PayResponse<? extends Unit>> {
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ ExtraInfo e;
        public final /* synthetic */ String f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, String str2, String str3, ExtraInfo extraInfo, String str4) {
            super(0);
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = extraInfo;
            this.f = str4;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<Unit> invoke() {
            return SnowballWebApi.this.appletApi.issueCard(this.b, this.c, this.d, this.e, this.f);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/json/JSONObject;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function1<JSONObject, Unit> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str) {
            super(1);
            this.a = str;
        }

        public final void a(@NotNull JSONObject jSONObject) throws JSONException {
            jSONObject.put("snb_order_no", this.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JSONObject jSONObject) throws JSONException {
            a(jSONObject);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<PayResponse<? extends Unit>> {
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str, String str2, String str3) {
            super(0);
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<Unit> invoke() {
            return SnowballWebApi.this.appletApi.returnCard(this.b, this.c, this.d);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<PayResponse<? extends Unit>> {
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str, String str2) {
            super(0);
            this.b = str;
            this.c = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<Unit> invoke() {
            return SnowballWebApi.this.appletApi.safeDeleteApp(this.b, this.c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<PayResponse<? extends Unit>> {
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ ExtraInfo e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, String str2, String str3, ExtraInfo extraInfo) {
            super(0);
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = extraInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<Unit> invoke() {
            return SnowballWebApi.this.appletApi.shiftInCard(this.b, this.c, this.d, this.e);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<PayResponse<? extends Unit>> {
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ ExtraInfo e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String str, String str2, String str3, ExtraInfo extraInfo) {
            super(0);
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = extraInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<Unit> invoke() {
            return SnowballWebApi.this.appletApi.shiftOutCard(this.b, this.c, this.d, this.e);
        }
    }

    public SnowballWebApi(@NotNull SnowballService snowballService, @NotNull ISnowballAppletWebApi iSnowballAppletWebApi, @NotNull INfcChannel iNfcChannel) {
        this.service = snowballService;
        this.appletApi = iSnowballAppletWebApi;
        this.cmd = iNfcChannel;
    }

    private final OrderInfoEntity a(JSONObject json) {
        return new OrderInfoEntity(json.optString("snb_order_no"), PayChannel.INSTANCE.from(json.optString(ConstantKt.KEY_PAYMENT_CHANNEL)), PayType.INSTANCE.from(json.optInt("order_type")), json.optString("order_status"), json.optString("order_status_desc"), json.optInt("order_amount"), json.optLong("order_time_timestamp"), json.optString("trans_no"), json.optString(ConstantKt.KEY_APP_CODE), json.optString("invoice_auth_code"), json.optString("code_valid_date"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<String> b(JSONObject json) {
        JSONArray jSONArrayOptJSONArray;
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObjectOptJSONObject = json.optJSONObject("resp_data");
        if (jSONObjectOptJSONObject == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("aids")) == null) {
            return arrayList;
        }
        int i2 = 0;
        int length = jSONArrayOptJSONArray.length();
        if (length > 0) {
            while (true) {
                int i3 = i2 + 1;
                arrayList.add(jSONArrayOptJSONArray.optString(i2));
                if (i3 >= length) {
                    break;
                }
                i2 = i3;
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OrderInfoEntity c(JSONObject json) {
        JSONObject jSONObjectOptJSONObject = json.optJSONObject("resp_data");
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        return a(jSONObjectOptJSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<OrderInfoEntity> d(JSONObject json) {
        JSONArray jSONArrayOptJSONArray;
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObjectOptJSONObject = json.optJSONObject("resp_data");
        if (jSONObjectOptJSONObject == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("orders")) == null) {
            return arrayList;
        }
        int i2 = 0;
        int length = jSONArrayOptJSONArray.length();
        if (length > 0) {
            while (true) {
                int i3 = i2 + 1;
                arrayList.add(a(jSONArrayOptJSONArray.optJSONObject(i2)));
                if (i3 >= length) {
                    break;
                }
                i2 = i3;
            }
        }
        return arrayList;
    }

    @Override // com.huami.nfc.bus.api.ISnowballAppletWebApi
    @NotNull
    public PayResponse<Unit> charge(@NotNull String appCode, @NotNull String deviceId, @NotNull String orderNum, @NotNull String actionType, @Nullable ExtraInfo extra) {
        return NfcChannelExtensionsKt.withOpenAndClose(this.cmd, new a(appCode, deviceId, orderNum, actionType, extra));
    }

    @Override // com.huami.nfc.bus.api.ISnowballAppletWebApi
    @NotNull
    public PayResponse<Unit> deleteApp(@NotNull String appCode, @NotNull String deviceId) {
        return NfcChannelExtensionsKt.withOpenAndClose(this.cmd, new b(appCode, deviceId));
    }

    @Override // com.huami.nfc.bus.api.ISnowballWebApi
    @NotNull
    public PayResponse<OrderEntity> generateOrder(@NotNull String appCode, @NotNull PayChannel channel, int amount, @NotNull PayType type) {
        return PayResponseKt.toPayResponse(this.service.generateOrder(ExpansionsKt.requestBody$default(null, new c(appCode, channel, amount, type), 1, null)).execute());
    }

    @Override // com.huami.nfc.bus.api.ISnowballWebApi
    @NotNull
    public PayResponse<OrderEntity> generateShiftOrder(@NotNull String appCode, @NotNull PayType type, @Nullable String shiftOrderNo) {
        return PayResponseKt.toPayResponse(this.service.generateOrder(ExpansionsKt.requestBody$default(null, new d(appCode, type, shiftOrderNo), 1, null)).execute());
    }

    @Override // com.huami.nfc.bus.api.ISnowballWebApi
    @NotNull
    public PayResponse<String> getCardNumber(@NotNull String appCode) {
        return PayResponseKt.map(PayResponseKt.toPayResponse(this.service.getCardNum(ExpansionsKt.requestBody$default(null, new e(appCode), 1, null)).execute()), f.a);
    }

    @Override // com.huami.nfc.bus.api.ISnowballWebApi
    @NotNull
    public PayResponse<List<String>> getInstalledAids() {
        return PayResponseKt.response(this.service.getInstalledCards().execute(), new g());
    }

    @Override // com.huami.nfc.bus.api.ISnowballWebApi
    @NotNull
    public PayResponse<OrderInfoEntity> getOrderInfo(@NotNull String orderId) {
        return PayResponseKt.response(this.service.getOrderInfo(orderId).execute(), new h());
    }

    @Override // com.huami.nfc.bus.api.ISnowballWebApi
    @NotNull
    public PayResponse<List<OrderInfoEntity>> getOrders(@Nullable String appCode, long start, long stop, @NotNull OrderCategory category, int count) {
        Map<String, String> mapMutableMapOf = r.mutableMapOf(TuplesKt.to("start_time", String.valueOf(start)), TuplesKt.to("end_time", String.valueOf(stop)), TuplesKt.to("count", String.valueOf(count)), TuplesKt.to("order_category", category.getValue()));
        if (appCode != null) {
            mapMutableMapOf.put(ConstantKt.KEY_APP_CODE, appCode);
        }
        return PayResponseKt.response(this.service.getOrders(mapMutableMapOf).execute(), new i());
    }

    @Override // com.huami.nfc.bus.api.ISnowballWebApi
    @NotNull
    public PayResponse<SiteInfo> getSiteInfo(@NotNull String hciContent, @NotNull String cityCode) {
        return PayResponseKt.toPayResponse(this.service.getSiteInfo(ExpansionsKt.requestBody$default(null, new j(hciContent, cityCode), 1, null)).execute());
    }

    @Override // com.huami.nfc.bus.api.ISnowballWebApi
    @NotNull
    public PayResponse<List<TransAmountEntity>> getTransactionAmount(@NotNull String appCode, @NotNull PayType type) {
        return PayResponseKt.toPayResponse(this.service.getTransactionAmount(r.mutableMapOf(new Pair(ConstantKt.KEY_APP_CODE, appCode), new Pair("type", String.valueOf(type.getValue())))).execute());
    }

    @Override // com.huami.nfc.bus.api.ISnowballAppletWebApi
    @NotNull
    public PayResponse<Unit> issueCard(@NotNull String appCode, @NotNull String deviceId, @NotNull String orderNum, @NotNull ExtraInfo extra, @NotNull String actionType) {
        return NfcChannelExtensionsKt.withOpenAndClose(this.cmd, new k(appCode, deviceId, orderNum, extra, actionType));
    }

    @Override // com.huami.nfc.bus.api.ISnowballWebApi
    @NotNull
    public PayResponse<Unit> refund(@NotNull String orderId) {
        return PayResponseKt.toPayResponse(this.service.refund(ExpansionsKt.requestBody$default(null, new l(orderId), 1, null)).execute());
    }

    @Override // com.huami.nfc.bus.api.ISnowballAppletWebApi
    @NotNull
    public PayResponse<Unit> returnCard(@NotNull String appCode, @NotNull String deviceId, @NotNull String snbTicket) {
        return NfcChannelExtensionsKt.withOpenAndClose(this.cmd, new m(appCode, deviceId, snbTicket));
    }

    @Override // com.huami.nfc.bus.api.ISnowballAppletWebApi
    @NotNull
    public PayResponse<Unit> safeDeleteApp(@NotNull String appCode, @NotNull String deviceId) {
        return NfcChannelExtensionsKt.withOpenAndClose(this.cmd, new n(appCode, deviceId));
    }

    @Override // com.huami.nfc.bus.api.ISnowballAppletWebApi
    @NotNull
    public PayResponse<Unit> shiftInCard(@NotNull String appCode, @NotNull String deviceId, @NotNull String orderNum, @NotNull ExtraInfo extra) {
        return NfcChannelExtensionsKt.withOpenAndClose(this.cmd, new o(appCode, deviceId, orderNum, extra));
    }

    @Override // com.huami.nfc.bus.api.ISnowballAppletWebApi
    @NotNull
    public PayResponse<Unit> shiftOutCard(@NotNull String appCode, @NotNull String deviceId, @NotNull String orderNum, @NotNull ExtraInfo extra) {
        return NfcChannelExtensionsKt.withOpenAndClose(this.cmd, new p(appCode, deviceId, orderNum, extra));
    }
}
