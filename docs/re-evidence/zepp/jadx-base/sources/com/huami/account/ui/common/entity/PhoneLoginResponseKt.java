package com.huami.account.ui.common.entity;

import androidx.exifinterface.media.ExifInterface;
import com.huami.passport.ErrorCode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aj\u0010\r\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00030\u00052!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00030\u0005¨\u0006\u000e"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/account/ui/common/entity/PhoneLoginResponse;", "Lkotlin/Function0;", "", "loading", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "t", "success", "Lcom/huami/passport/ErrorCode;", "errorCode", "error", "deal", "accountui_release"}, k = 2, mv = {1, 5, 1})
public final class PhoneLoginResponseKt {
    public static final <T> void deal(@NotNull PhoneLoginResponse<T> phoneLoginResponse, @NotNull Function0<Unit> function0, @NotNull Function1<? super T, Unit> function1, @NotNull Function1<? super ErrorCode, Unit> function2) {
        ErrorCode errorCode;
        int status = phoneLoginResponse.getStatus();
        if (status == 0) {
            function0.invoke();
            return;
        }
        if (status != 1) {
            if (status == 2 && (errorCode = phoneLoginResponse.getErrorCode()) != null) {
                function2.invoke(errorCode);
                return;
            }
            return;
        }
        T data = phoneLoginResponse.getData();
        if (data == null) {
            return;
        }
        function1.invoke(data);
    }
}
