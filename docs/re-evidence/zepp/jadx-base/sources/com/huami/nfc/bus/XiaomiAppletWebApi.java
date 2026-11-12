package com.huami.nfc.bus;

import com.facebook.share.internal.ShareConstants;
import com.huami.dev.Logcat;
import com.huami.dev.LogcatKt;
import com.huami.nfc.applet.BusCard;
import com.huami.nfc.applet.BusCardExtensions;
import com.huami.nfc.applet.City;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.base.PayResponseKt;
import com.huami.nfc.bus.api.IXiaomiAppletWebApi;
import com.huami.nfc.web.InitRequestTask;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ>\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J.\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016JB\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016J.\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J.\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/huami/nfc/bus/XiaomiAppletWebApi;", "Lcom/huami/nfc/bus/api/IXiaomiAppletWebApi;", "", "appCode", "aid", "miCardName", "deviceId", "orderToken", "actionType", "Lcom/huami/nfc/base/PayResponse;", "", "shiftCard", "checkShiftCard", "userProtocolId", "cityId", "issueCard", "charge", "deleteApp", "Lcom/huami/nfc/applet/City;", "city", "returnCard", "Lcom/huami/nfc/web/InitRequestTask;", "a", "Lcom/huami/nfc/web/InitRequestTask;", "task", "<init>", "(Lcom/huami/nfc/web/InitRequestTask;)V", "nfc-bus_release"}, k = 1, mv = {1, 5, 1})
public final class XiaomiAppletWebApi implements IXiaomiAppletWebApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final InitRequestTask task;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<PayResponse<? extends String>, Unit> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final void a(@NotNull PayResponse<String> payResponse) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PayResponse<? extends String> payResponse) {
            a(payResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<PayResponse<? extends String>, Unit> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        public final void a(@NotNull PayResponse<String> payResponse) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PayResponse<? extends String> payResponse) {
            a(payResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<PayResponse<? extends String>, Unit> {
        public static final c a = new c();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<Object> {
            public final /* synthetic */ PayResponse<String> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PayResponse<String> payResponse) {
                super(0);
                this.a = payResponse;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final Object invoke() {
                return Intrinsics.stringPlus("response: ", this.a);
            }
        }

        public c() {
            super(1);
        }

        public final void a(@NotNull PayResponse<String> payResponse) {
            LogcatKt.info$default(Logcat.INSTANCE, null, new a(payResponse), 1, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PayResponse<? extends String> payResponse) {
            a(payResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<PayResponse<? extends String>, Unit> {
        public static final d a = new d();

        public d() {
            super(1);
        }

        public final void a(@NotNull PayResponse<String> payResponse) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PayResponse<? extends String> payResponse) {
            a(payResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<PayResponse<? extends String>, Unit> {
        public static final e a = new e();

        public e() {
            super(1);
        }

        public final void a(@NotNull PayResponse<String> payResponse) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PayResponse<? extends String> payResponse) {
            a(payResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<PayResponse<? extends String>, Unit> {
        public static final f a = new f();

        public f() {
            super(1);
        }

        public final void a(@NotNull PayResponse<String> payResponse) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PayResponse<? extends String> payResponse) {
            a(payResponse);
            return Unit.INSTANCE;
        }
    }

    public XiaomiAppletWebApi(@NotNull InitRequestTask initRequestTask) {
        this.task = initRequestTask;
    }

    @Override // com.huami.nfc.bus.api.IXiaomiAppletWebApi
    @NotNull
    public PayResponse<Unit> charge(@NotNull String appCode, @NotNull String aid, @NotNull String deviceId, @NotNull String orderToken) {
        return PayResponseKt.map(this.task.apply(r.mutableMapOf(TuplesKt.to(ConstantKt.KEY_APP_CODE, appCode), TuplesKt.to("deviceId", deviceId), TuplesKt.to("aid", aid), TuplesKt.to("fetch_adpu_mode", com.huami.nfc.applet.EntityKt.getWebApiMode(aid)), TuplesKt.to(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE, ApduAction.Charge.getValue()), TuplesKt.to("order_token", orderToken))), a.a);
    }

    @Override // com.huami.nfc.bus.api.IXiaomiAppletWebApi
    @NotNull
    public PayResponse<Unit> checkShiftCard(@NotNull String appCode, @NotNull String aid, @NotNull String miCardName, @NotNull String deviceId) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("card_name", miCardName);
        return PayResponseKt.map(this.task.apply(r.mutableMapOf(TuplesKt.to(ConstantKt.KEY_APP_CODE, appCode), TuplesKt.to("deviceId", deviceId), TuplesKt.to("extra_info", jSONObject.toString()), TuplesKt.to("aid", aid), TuplesKt.to("fetch_adpu_mode", com.huami.nfc.applet.EntityKt.getWebApiMode(aid)), TuplesKt.to(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE, ApduAction.CheckShiftOutCard.getValue()))), b.a);
    }

    @Override // com.huami.nfc.bus.api.IXiaomiAppletWebApi
    @NotNull
    public PayResponse<Unit> deleteApp(@NotNull String appCode, @NotNull String aid, @NotNull String deviceId) {
        return PayResponseKt.map(this.task.apply(r.mutableMapOf(TuplesKt.to(ConstantKt.KEY_APP_CODE, appCode), TuplesKt.to("deviceId", deviceId), TuplesKt.to("aid", aid), TuplesKt.to("fetch_adpu_mode", com.huami.nfc.applet.EntityKt.getWebApiMode(aid)), TuplesKt.to(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE, ApduAction.DeleteApp.getValue()))), c.a);
    }

    @Override // com.huami.nfc.bus.api.IXiaomiAppletWebApi
    @NotNull
    public PayResponse<Unit> issueCard(@NotNull String appCode, @NotNull String aid, @NotNull String deviceId, @NotNull String orderToken, @Nullable String userProtocolId, @Nullable String cityId) {
        InitRequestTask initRequestTask = this.task;
        Pair[] pairArr = new Pair[8];
        pairArr[0] = TuplesKt.to(ConstantKt.KEY_APP_CODE, appCode);
        pairArr[1] = TuplesKt.to("deviceId", deviceId);
        pairArr[2] = TuplesKt.to("aid", aid);
        pairArr[3] = TuplesKt.to("fetch_adpu_mode", com.huami.nfc.applet.EntityKt.getWebApiMode(aid));
        pairArr[4] = TuplesKt.to(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE, ApduAction.IssueCard.getValue());
        pairArr[5] = TuplesKt.to("order_token", orderToken);
        if (userProtocolId == null) {
            userProtocolId = "";
        }
        pairArr[6] = TuplesKt.to("userProtocolId", userProtocolId);
        if (cityId == null) {
            cityId = "";
        }
        pairArr[7] = TuplesKt.to(XiaomiApduScriptKt.KEY_CITY_ID, cityId);
        return PayResponseKt.map(initRequestTask.apply(r.mutableMapOf(pairArr)), d.a);
    }

    @Override // com.huami.nfc.bus.api.IXiaomiAppletWebApi
    @NotNull
    public PayResponse<Unit> returnCard(@NotNull City city, @NotNull String deviceId, @NotNull String orderToken, @NotNull String actionType) throws JSONException {
        BusCard busCardFromAppCode = BusCardExtensions.fromAppCode(city.getAppCode());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("card_name", busCardFromAppCode.getMiCardName());
        return PayResponseKt.map(this.task.apply(r.mutableMapOf(TuplesKt.to(ConstantKt.KEY_APP_CODE, busCardFromAppCode.getAppCode()), TuplesKt.to("deviceId", deviceId), TuplesKt.to("aid", busCardFromAppCode.getAid()), TuplesKt.to("fetch_adpu_mode", com.huami.nfc.applet.EntityKt.getWebApiMode(busCardFromAppCode.getAid())), TuplesKt.to(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE, actionType), TuplesKt.to("order_token", orderToken), TuplesKt.to("extra_info", jSONObject.toString()))), e.a);
    }

    @Override // com.huami.nfc.bus.api.IXiaomiAppletWebApi
    @NotNull
    public PayResponse<Unit> shiftCard(@NotNull String appCode, @NotNull String aid, @NotNull String miCardName, @NotNull String deviceId, @NotNull String orderToken, @NotNull String actionType) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("card_name", miCardName);
        jSONObject.put("serviceType", -1);
        return PayResponseKt.map(this.task.apply(r.mutableMapOf(TuplesKt.to(ConstantKt.KEY_APP_CODE, appCode), TuplesKt.to("deviceId", deviceId), TuplesKt.to("aid", aid), TuplesKt.to("fetch_adpu_mode", com.huami.nfc.applet.EntityKt.getWebApiMode(aid)), TuplesKt.to(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE, actionType), TuplesKt.to("order_token", orderToken), TuplesKt.to("extra_info", jSONObject.toString()))), f.a);
    }
}
