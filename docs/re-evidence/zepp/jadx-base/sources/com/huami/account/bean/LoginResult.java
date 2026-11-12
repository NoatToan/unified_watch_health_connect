package com.huami.account.bean;

import android.util.Log;
import com.facebook.internal.AnalyticsEvents;
import com.huami.passport.ErrorCode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0003\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/huami/account/bean/LoginResult;", "", "", "isSuccess", "()Z", "<init>", "()V", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, "Success", "Lcom/huami/account/bean/LoginResult$Success;", "Lcom/huami/account/bean/LoginResult$Failed;", "accountui_release"}, k = 1, mv = {1, 5, 1})
public abstract class LoginResult {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u000e\u000f\u0010B\u0019\b\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007\u0082\u0001\u0003\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/huami/account/bean/LoginResult$Failed;", "Lcom/huami/account/bean/LoginResult;", "", "toString", "a", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "code", "b", "getMessage", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Account", "MissParam", "ProcessData", "Lcom/huami/account/bean/LoginResult$Failed$Account;", "Lcom/huami/account/bean/LoginResult$Failed$ProcessData;", "Lcom/huami/account/bean/LoginResult$Failed$MissParam;", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static abstract class Failed extends LoginResult {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final String code;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final String message;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/account/bean/LoginResult$Failed$Account;", "Lcom/huami/account/bean/LoginResult$Failed;", "Lcom/huami/passport/ErrorCode;", "c", "Lcom/huami/passport/ErrorCode;", "getErrorCode", "()Lcom/huami/passport/ErrorCode;", "errorCode", "<init>", "(Lcom/huami/passport/ErrorCode;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
        public static final class Account extends Failed {

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            @NotNull
            private final ErrorCode errorCode;

            public Account(@NotNull ErrorCode errorCode) {
                super("200301000", errorCode.getErrorCode(), null);
                this.errorCode = errorCode;
            }

            @NotNull
            public final ErrorCode getErrorCode() {
                return this.errorCode;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/huami/account/bean/LoginResult$Failed$MissParam;", "Lcom/huami/account/bean/LoginResult$Failed;", "", "message", "<init>", "(Ljava/lang/String;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
        public static final class MissParam extends Failed {
            public MissParam(@NotNull String str) {
                super("200310004", str, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\nB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/huami/account/bean/LoginResult$Failed$ProcessData;", "Lcom/huami/account/bean/LoginResult$Failed;", "", "code", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "External", "SyncData", "Unknown", "UserData", "Lcom/huami/account/bean/LoginResult$Failed$ProcessData$Unknown;", "Lcom/huami/account/bean/LoginResult$Failed$ProcessData$UserData;", "Lcom/huami/account/bean/LoginResult$Failed$ProcessData$SyncData;", "Lcom/huami/account/bean/LoginResult$Failed$ProcessData$External;", "accountui_release"}, k = 1, mv = {1, 5, 1})
        public static abstract class ProcessData extends Failed {

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/huami/account/bean/LoginResult$Failed$ProcessData$External;", "Lcom/huami/account/bean/LoginResult$Failed$ProcessData;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
            public static final class External extends ProcessData {
                public External(@NotNull Throwable th) {
                    super("200310003", "外部数据处理出错 " + Log.getStackTraceString(th), null);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/account/bean/LoginResult$Failed$ProcessData$SyncData;", "Lcom/huami/account/bean/LoginResult$Failed$ProcessData;", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
            public static final class SyncData extends ProcessData {

                @NotNull
                public static final SyncData INSTANCE = new SyncData();

                private SyncData() {
                    super("200310002", "登录同步数据出错", null);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/huami/account/bean/LoginResult$Failed$ProcessData$Unknown;", "Lcom/huami/account/bean/LoginResult$Failed$ProcessData;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
            public static final class Unknown extends ProcessData {
                public Unknown(@NotNull Throwable th) {
                    super("200310000", "未知错误 " + Log.getStackTraceString(th), null);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/account/bean/LoginResult$Failed$ProcessData$UserData;", "Lcom/huami/account/bean/LoginResult$Failed$ProcessData;", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
            public static final class UserData extends ProcessData {

                @NotNull
                public static final UserData INSTANCE = new UserData();

                private UserData() {
                    super("200310001", "请求用户信息出错", null);
                }
            }

            private ProcessData(String str, String str2) {
                super(str, str2, null);
            }

            public /* synthetic */ ProcessData(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2);
            }
        }

        private Failed(String str, String str2) {
            super(null);
            this.code = str;
            this.message = str2;
        }

        public /* synthetic */ Failed(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        @NotNull
        public final String getCode() {
            return this.code;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public String toString() {
            return "account-" + this.code + "：" + this.message;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/account/bean/LoginResult$Success;", "Lcom/huami/account/bean/LoginResult;", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Success extends LoginResult {

        @NotNull
        public static final Success INSTANCE = new Success();

        private Success() {
            super(null);
        }
    }

    private LoginResult() {
    }

    public /* synthetic */ LoginResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean isSuccess() {
        return this instanceof Success;
    }
}
