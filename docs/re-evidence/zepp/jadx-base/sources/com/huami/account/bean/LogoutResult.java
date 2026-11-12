package com.huami.account.bean;

import com.facebook.internal.AnalyticsEvents;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u000b\fB\t\b\u0004¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0013\u0010\u0007\u001a\u00020\u00068F@\u0006¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/huami/account/bean/LogoutResult;", "", "", "getLogMessage", "()Ljava/lang/String;", "logMessage", "", "isSuccess", "()Z", "<init>", "()V", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, "Success", "Lcom/huami/account/bean/LogoutResult$Success;", "Lcom/huami/account/bean/LogoutResult$Failed;", "accountui_release"}, k = 1, mv = {1, 5, 1})
public abstract class LogoutResult {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0013\u0014\u0015B\u0019\b\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u00020\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0003\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lcom/huami/account/bean/LogoutResult$Failed;", "Lcom/huami/account/bean/LogoutResult;", "", "a", "Ljava/lang/String;", "code", "b", "message", "", "c", "Ljava/util/List;", "getReasonCodes", "()Ljava/util/List;", "reasonCodes", "getLogMessage", "()Ljava/lang/String;", "logMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "OldAccount", "PersonInfo", "SyncData", "Lcom/huami/account/bean/LogoutResult$Failed$PersonInfo;", "Lcom/huami/account/bean/LogoutResult$Failed$OldAccount;", "Lcom/huami/account/bean/LogoutResult$Failed$SyncData;", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static abstract class Failed extends LogoutResult {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final String code;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final String message;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final List<String> reasonCodes;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/account/bean/LogoutResult$Failed$OldAccount;", "Lcom/huami/account/bean/LogoutResult$Failed;", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
        public static final class OldAccount extends Failed {

            @NotNull
            public static final OldAccount INSTANCE = new OldAccount();

            private OldAccount() {
                super("200311001", "旧账户登出", null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/account/bean/LogoutResult$Failed$PersonInfo;", "Lcom/huami/account/bean/LogoutResult$Failed;", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
        public static final class PersonInfo extends Failed {

            @NotNull
            public static final PersonInfo INSTANCE = new PersonInfo();

            private PersonInfo() {
                super("200311000", "个人信息", null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/huami/account/bean/LogoutResult$Failed$SyncData;", "Lcom/huami/account/bean/LogoutResult$Failed;", "", "", GoogleApiAvailabilityLight.a, "Ljava/util/List;", "getReasonCodes", "()Ljava/util/List;", "reasonCodes", "Lcom/huami/account/bean/LogoutSyncTask$Result$Failed;", "failTaskResults", "<init>", "(Ljava/util/List;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
        public static final class SyncData extends Failed {

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @NotNull
            private final List<String> reasonCodes;

            public SyncData(@NotNull List<LogoutSyncTask.Result.Failed> list) {
                super("200311002", "外部同步失败", null);
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((LogoutSyncTask.Result.Failed) it2.next()).getCode());
                }
                this.reasonCodes = arrayList;
            }

            @Override // com.huami.account.bean.LogoutResult.Failed
            @NotNull
            public List<String> getReasonCodes() {
                return this.reasonCodes;
            }
        }

        private Failed(String str, String str2) {
            super(null);
            this.code = str;
            this.message = str2;
            this.reasonCodes = e.listOf(str);
        }

        public /* synthetic */ Failed(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        @Override // com.huami.account.bean.LogoutResult
        @NotNull
        public String getLogMessage() {
            return "account-" + CollectionsKt___CollectionsKt.joinToString$default(getReasonCodes(), FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE, null, null, 0, null, null, 62, null) + "：" + this.message;
        }

        @NotNull
        public List<String> getReasonCodes() {
            return this.reasonCodes;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0007\u001a\u00020\u00028\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/account/bean/LogoutResult$Success;", "Lcom/huami/account/bean/LogoutResult;", "", "a", "Ljava/lang/String;", "getLogMessage", "()Ljava/lang/String;", "logMessage", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Success extends LogoutResult {

        @NotNull
        public static final Success INSTANCE = new Success();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private static final String logMessage = "success";

        private Success() {
            super(null);
        }

        @Override // com.huami.account.bean.LogoutResult
        @NotNull
        public String getLogMessage() {
            return logMessage;
        }
    }

    private LogoutResult() {
    }

    public /* synthetic */ LogoutResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract String getLogMessage();

    public final boolean isSuccess() {
        return this instanceof Success;
    }
}
