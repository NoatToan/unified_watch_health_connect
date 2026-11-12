package com.huami.account.ui.common.entity;

import androidx.exifinterface.media.ExifInterface;
import com.huami.passport.ErrorCode;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/huami/account/ui/common/entity/PhoneLoginState;", ExifInterface.GPS_DIRECTION_TRUE, "", "Error", "Loading", "Success", "Lcom/huami/account/ui/common/entity/PhoneLoginState$Loading;", "Lcom/huami/account/ui/common/entity/PhoneLoginState$Success;", "Lcom/huami/account/ui/common/entity/PhoneLoginState$Error;", "accountui_release"}, k = 1, mv = {1, 5, 1})
public interface PhoneLoginState<T> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\b\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/huami/account/ui/common/entity/PhoneLoginState$Error;", "Lcom/huami/account/ui/common/entity/PhoneLoginState;", "", "Lcom/huami/passport/ErrorCode;", "a", "Lcom/huami/passport/ErrorCode;", "getErrorCode", "()Lcom/huami/passport/ErrorCode;", "errorCode", "<init>", "(Lcom/huami/passport/ErrorCode;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Error implements PhoneLoginState<Object> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final ErrorCode errorCode;

        public Error(@NotNull ErrorCode errorCode) {
            this.errorCode = errorCode;
        }

        @NotNull
        public final ErrorCode getErrorCode() {
            return this.errorCode;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/huami/account/ui/common/entity/PhoneLoginState$Loading;", "Lcom/huami/account/ui/common/entity/PhoneLoginState;", "", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Loading implements PhoneLoginState<Object> {

        @NotNull
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u000f\u0012\u0006\u0010\u0007\u001a\u00028\u0001¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00028\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/account/ui/common/entity/PhoneLoginState$Success;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/account/ui/common/entity/PhoneLoginState;", "a", "Ljava/lang/Object;", "getData", "()Ljava/lang/Object;", "data", "<init>", "(Ljava/lang/Object;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Success<T> implements PhoneLoginState<T> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final T data;

        public Success(T t) {
            this.data = t;
        }

        public final T getData() {
            return this.data;
        }
    }
}
