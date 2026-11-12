package com.huami.nfc.bus;

import androidx.exifinterface.media.ExifInterface;
import com.google.gson.Gson;
import com.huami.dev.Logcat;
import com.huami.dev.LogcatKt;
import com.huami.nfc.base.PayResponse;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/bus/ResponseError;", "getError", "", "CODE_BEIJING_BLACK_CARD", "Ljava/lang/String;", "nfc-bus_release"}, k = 2, mv = {1, 5, 1})
public final class EntityKt {

    @NotNull
    public static final String CODE_BEIJING_BLACK_CARD = "02-9998";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Object> {
        public final /* synthetic */ PayResponse<T> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(PayResponse<? extends T> payResponse) {
            super(0);
            this.a = payResponse;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            return "解析通卡错误失败，此错误为服务商错误（01-" + this.a.getCode() + (char) 65289;
        }
    }

    @Nullable
    public static final <T> ResponseError getError(@NotNull PayResponse<? extends T> payResponse) {
        if (payResponse.isSuccessful() || payResponse.isInternalError()) {
            return null;
        }
        String message = payResponse.getMessage();
        if (message == null || message.length() == 0) {
            return new ResponseError(Intrinsics.stringPlus("01-", payResponse.getCode()), null, null, 6, null);
        }
        try {
            ResponseError responseError = (ResponseError) new Gson().fromJson(payResponse.getMessage(), (Class) ResponseError.class);
            return new ResponseError(Intrinsics.stringPlus("02-", responseError.getCode()), responseError.getMessage(), responseError.getTip());
        } catch (Exception unused) {
            LogcatKt.info$default(Logcat.INSTANCE, null, new a(payResponse), 1, null);
            return new ResponseError(Intrinsics.stringPlus("01-", payResponse.getCode()), null, null, 6, null);
        }
    }
}
