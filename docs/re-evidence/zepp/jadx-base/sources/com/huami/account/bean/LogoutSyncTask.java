package com.huami.account.bean;

import android.util.Log;
import com.facebook.internal.AnalyticsEvents;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.HMLogoutManager;
import com.huami.tools.log.HMLog;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u0016B%\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010\u0003\u001a\u00020\u0002R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/huami/account/bean/LogoutSyncTask;", "", "Lcom/huami/account/bean/LogoutSyncTask$Result;", Constant.METHOD_EXECUTE, "", "a", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "code", "b", "desc", "Lkotlin/Function0;", "", "c", "Lkotlin/jvm/functions/Function0;", "syncAction", GoogleApiAvailabilityLight.a, "Z", "isSuccess", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "Result", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class LogoutSyncTask {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String code;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String desc;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Function0<Boolean> syncAction;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isSuccess;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lcom/huami/account/bean/LogoutSyncTask$Result;", "", "", "a", "Z", "isSuccess", "()Z", "<init>", "(Z)V", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, "Success", "Lcom/huami/account/bean/LogoutSyncTask$Result$Success;", "Lcom/huami/account/bean/LogoutSyncTask$Result$Failed;", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static abstract class Result {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isSuccess;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/huami/account/bean/LogoutSyncTask$Result$Failed;", "Lcom/huami/account/bean/LogoutSyncTask$Result;", "", "toString", "b", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "code", "c", "getMessage", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
        public static final class Failed extends Result {

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            private final String code;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            @NotNull
            private final String message;

            public Failed(@NotNull String str, @NotNull String str2) {
                super(false, null);
                this.code = str;
                this.message = str2;
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

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/account/bean/LogoutSyncTask$Result$Success;", "Lcom/huami/account/bean/LogoutSyncTask$Result;", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
        public static final class Success extends Result {

            @NotNull
            public static final Success INSTANCE = new Success();

            private Success() {
                super(true, null);
            }
        }

        private Result(boolean z) {
            this.isSuccess = z;
        }

        public /* synthetic */ Result(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(z);
        }

        /* JADX INFO: renamed from: isSuccess, reason: from getter */
        public final boolean getIsSuccess() {
            return this.isSuccess;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.ObjectRef<String> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Ref.ObjectRef<String> objectRef) {
            super(0);
            this.b = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "[" + LogoutSyncTask.this.desc + " -> " + LogoutSyncTask.this.isSuccess + "] " + ((Object) this.b.element);
        }
    }

    public LogoutSyncTask(@NotNull String str, @NotNull String str2, @NotNull Function0<Boolean> function0) {
        this.code = str;
        this.desc = str2;
        this.syncAction = function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v16, types: [T, java.lang.String] */
    @NotNull
    public final Result execute() {
        Object objM3845constructorimpl;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        try {
            kotlin.Result.Companion companion = kotlin.Result.Companion;
            boolean zBooleanValue = this.syncAction.invoke().booleanValue();
            this.isSuccess = zBooleanValue;
            if (!zBooleanValue) {
                objectRef.element = "[" + this.desc + "(" + getCode() + ")]失败";
            }
            objM3845constructorimpl = kotlin.Result.m3845constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.Companion;
            objM3845constructorimpl = kotlin.Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = kotlin.Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            this.isSuccess = false;
            objectRef.element = "[" + this.desc + "(" + getCode() + ")]同步异常: " + Log.getStackTraceString(thM3848exceptionOrNullimpl);
        }
        HMLog.info(HMLogoutManager.TAG, new a(objectRef));
        return this.isSuccess ? Result.Success.INSTANCE : new Result.Failed(this.code, (String) objectRef.element);
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }
}
