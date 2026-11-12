package com.huami.pay.lib.web;

import com.google.gson.reflect.TypeToken;
import com.huami.http.ConverterKt;
import com.huami.http.HttpError;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitContext;
import com.huami.http.HttpKitKtxKt;
import com.huami.http.ResponseBodyConverter;
import com.huami.pay.lib.PayConstantsKt;
import com.huami.pay.lib.entry.PayNotification;
import com.huami.pay.lib.entry.PayOrder;
import com.huami.pay.service.PayResult;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import kotlinx.serialization.json.Json;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.cybergarage.upnp.std.av.server.ContentDirectory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002¨\u0006\u0010"}, d2 = {"Lcom/huami/pay/lib/web/PayWebApi;", "Lcom/huami/http/HttpKit;", "", "userId", "Lcom/huami/pay/lib/entry/PayOrder;", "payOrder", "Lkotlin/Pair;", "Lcom/huami/pay/service/PayResult;", "generatePayOrder", "Lcom/huami/pay/lib/entry/PayNotification;", "payNotification", "uploadNotification", "orderId", "queryOrderState", "<init>", "()V", "pay-lib_release"}, k = 1, mv = {1, 5, 1})
public final class PayWebApi implements HttpKit {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "generatePayOrder body:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ PayOrder a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(PayOrder payOrder) {
            super(0);
            this.a = payOrder;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "resultPayOrder:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "生成订单异常:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "查询订单结果：" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "查询订单状态失败：" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "uploadNotification body:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "通知失败：" + this.a;
        }
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    @NotNull
    public final Pair<PayResult, PayOrder> generatePayOrder(@NotNull String userId, @NotNull PayOrder payOrder) {
        try {
            String strReplace$default = m.replace$default("users/{userId}/orders", "{userId}", userId, false, 4, (Object) null);
            String strEncodeToString = Json.INSTANCE.encodeToString(PayOrder.INSTANCE.serializer(), payOrder);
            HMLog.info(PayConstantsKt.PAY_TAG, new a(strEncodeToString));
            Response responseHttpPost$default = HttpKitKtxKt.httpPost$default(this, strReplace$default, RequestBody.create(MediaType.parse("application/json"), strEncodeToString), null, null, 12, null);
            ConverterKt.checkToken(responseHttpPost$default, ConverterKt.responseToJsonStr(responseHttpPost$default));
            if (!responseHttpPost$default.isSuccessful()) {
                throw new HttpError(responseHttpPost$default);
            }
            ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
            ResponseBody responseBodyBody = responseHttpPost$default.body();
            if (responseBodyBody == null) {
                Intrinsics.throwNpe();
            }
            PayOrder payOrder2 = (PayOrder) converter.convert(responseBodyBody, new TypeToken<PayOrder>() { // from class: com.huami.pay.lib.web.PayWebApi$generatePayOrder$$inlined$deserializeOrThrow$1
            }.getType());
            HMLog.info(PayConstantsKt.PAY_TAG, new b(payOrder2));
            return TuplesKt.to(PayResult.CODE_SUCCESS, payOrder2);
        } catch (Exception e2) {
            HMLog.error$default(PayConstantsKt.PAY_TAG, null, null, new c(e2), 6, null);
            return TuplesKt.to(PayResult.CODE_CLOUD_PAY_GENERATE_EXCEPTION, null);
        }
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return HttpKit.DefaultImpls.okHttpClient(this);
    }

    @NotNull
    public final PayResult queryOrderState(@NotNull String userId, @NotNull String orderId) {
        try {
            ResponseBody responseBodyBody = HttpKitKtxKt.httpGet$default(this, m.replace$default(m.replace$default(PayConstantsKt.PAY_ORDER_STATE_URL, "{userId}", userId, false, 4, (Object) null), "{orderId}", orderId, false, 4, (Object) null), null, null, 6, null).body();
            String strString = responseBodyBody == null ? null : responseBodyBody.string();
            HMLog.info(PayConstantsKt.PAY_TAG, new d(strString));
            return Intrinsics.areEqual(strString, ContentDirectory.COMPLETED) ? PayResult.CODE_SUCCESS : PayResult.CODE_QUERY_ORDER_STATE_EXCEPTION;
        } catch (Exception e2) {
            HMLog.error$default(PayConstantsKt.PAY_TAG, null, null, new e(e2), 6, null);
            return PayResult.CODE_QUERY_ORDER_STATE_EXCEPTION;
        }
    }

    @NotNull
    public final PayResult uploadNotification(@NotNull PayNotification payNotification) {
        try {
            String strEncodeToString = Json.INSTANCE.encodeToString(PayNotification.INSTANCE.serializer(), payNotification);
            HMLog.info(PayConstantsKt.PAY_TAG, new f(strEncodeToString));
            return HttpKitKtxKt.httpPost$default(this, PayConstantsKt.PAY_NOTIFICATION_URL, RequestBody.create(MediaType.parse("application/json"), strEncodeToString), null, null, 12, null).isSuccessful() ? PayResult.CODE_SUCCESS : PayResult.CODE_CLOUD_NOTIFICATION_FAIL;
        } catch (Exception e2) {
            HMLog.error$default(PayConstantsKt.PAY_TAG, null, null, new g(e2), 6, null);
            return PayResult.CODE_CLOUD_NOTIFICATION_EXCEPTION;
        }
    }
}
