package com.huami.nfc.base;

import androidx.exifinterface.media.ExifInterface;
import com.alipay.sdk.m.l.c;
import com.huami.dev.Logcat;
import com.huami.dev.LogcatKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0016\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u0016\u0010\u0004\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u0016\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u0016\u0010\u0006\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u0016\u0010\u0007\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001aC\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\t\u001a\u00020\b2\u001d\u0010\f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\b\u000b\u001a&\u0010\u000f\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b¨\u0006\u0010"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/nfc/base/PayResponse;", "", "isSeError", "isNfcChannelError", "isNotResponseError", "isHttpError", "isBleError", "", "apiCode", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "body", "logcat", c.n, "getErrorDescription", "nfc-base_release"}, k = 2, mv = {1, 5, 1})
public final class PayResponseExtensionsKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Object> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            return this.a;
        }
    }

    @NotNull
    public static final <T> String getErrorDescription(@NotNull PayResponse<? extends T> payResponse, @NotNull String str, @NotNull String str2) {
        if (payResponse.isUnauthorized()) {
            return "【NFC-" + str + "-APP-" + payResponse.getCode() + (char) 12305 + str2 + ", APP问题：网络授权失败，" + ((Object) payResponse.getMessage());
        }
        if (payResponse.isNetworkError()) {
            return "【NFC-" + str + "-APP-" + payResponse.getCode() + (char) 12305 + str2 + ", APP问题：网络连接异常导致，用户行为导致。";
        }
        if (isSeError(payResponse)) {
            return "【NFC-" + str + "-SE-" + payResponse.getCode() + (char) 12305 + str2 + ", SE问题：" + ((Object) payResponse.getMessage());
        }
        if (isNfcChannelError(payResponse)) {
            return "【NFC-" + str + "-APP-" + payResponse.getCode() + (char) 12305 + str2 + ", APP问题：" + ((Object) payResponse.getMessage());
        }
        if (isNotResponseError(payResponse)) {
            return "【NFC-" + str + "-APP-" + payResponse.getCode() + (char) 12305 + str2 + ", APP问题：" + ((Object) payResponse.getMessage());
        }
        if (isHttpError(payResponse)) {
            return "【NFC-" + str + "-Service-" + payResponse.getCode() + (char) 12305 + str2 + ", Service问题：" + ((Object) payResponse.getMessage());
        }
        if (isBleError(payResponse)) {
            return "【NFC-" + str + "-Service-" + payResponse.getCode() + (char) 12305 + str2 + ", 蓝牙/固件问题：" + ((Object) payResponse.getMessage());
        }
        return "【NFC-" + str + "-TSM-" + payResponse.getCode() + (char) 12305 + str2 + ", TSM问题：" + ((Object) payResponse.getMessage());
    }

    public static final <T> boolean isBleError(@NotNull PayResponse<? extends T> payResponse) {
        return m.startsWith$default(payResponse.getCode(), PayResponse.CODE_BLE_ERROR_PREFIX, false, 2, null);
    }

    public static final <T> boolean isHttpError(@NotNull PayResponse<? extends T> payResponse) {
        return m.startsWith$default(payResponse.getCode(), "http", false, 2, null);
    }

    public static final <T> boolean isNfcChannelError(@NotNull PayResponse<? extends T> payResponse) {
        return Intrinsics.areEqual(payResponse.getCode(), PayResponse.CODE_NFC_CHANNEL_ERROR);
    }

    public static final <T> boolean isNotResponseError(@NotNull PayResponse<? extends T> payResponse) {
        return Intrinsics.areEqual(payResponse.getCode(), PayResponse.CODE_SE_NOT_RESPONSE_ERROR);
    }

    public static final <T> boolean isSeError(@NotNull PayResponse<? extends T> payResponse) {
        return Intrinsics.areEqual(payResponse.getCode(), PayResponse.CODE_SE_RESPONSE_ERROR);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> PayResponse<T> logcat(@NotNull PayResponse<? extends T> payResponse, @NotNull String str, @NotNull Function1<? super PayResponse<? extends T>, String> function1) {
        if (payResponse.isSuccessful()) {
            return payResponse;
        }
        String strInvoke = function1.invoke(payResponse);
        String errorDescription = getErrorDescription(payResponse, str, strInvoke);
        LogcatKt.error$default(Logcat.INSTANCE, null, new a(errorDescription), 1, null);
        PayResponse<T> payResponse2 = new PayResponse<>(payResponse.getCode(), errorDescription, payResponse.getData());
        payResponse2.setApiCode(str);
        payResponse2.setApiMessage(strInvoke);
        payResponse2.setRawMessage(payResponse.getMessage());
        return payResponse2;
    }
}
