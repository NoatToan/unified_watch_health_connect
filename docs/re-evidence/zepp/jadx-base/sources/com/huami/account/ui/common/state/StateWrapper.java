package com.huami.account.ui.common.state;

import com.facebook.internal.AnalyticsEvents;
import com.huami.account.AccountExternalsKt;
import com.huami.message.api.WebConst;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u0004*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00020\u0003:\u0004\u0004\u0005\u0006\u0007\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/huami/account/ui/common/state/StateWrapper;", "SuccessData", "FailedData", "", "Companion", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, "Loading", "Success", "Lcom/huami/account/ui/common/state/StateWrapper$Loading;", "Lcom/huami/account/ui/common/state/StateWrapper$Success;", "Lcom/huami/account/ui/common/state/StateWrapper$Failed;", "accountui_release"}, k = 1, mv = {1, 5, 1})
public interface StateWrapper<SuccessData, FailedData> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\n\"\u0004\b\u0002\u0010\b2\u0006\u0010\t\u001a\u00028\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00020\u000f\"\u0004\b\u0002\u0010\r2\u0006\u0010\u000e\u001a\u00028\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/huami/account/ui/common/state/StateWrapper$Companion;", "", "", "message", "Lcom/huami/account/ui/common/state/StateWrapper$Loading;", "loading", "", WebConst.QueryParam.MESSAGE_ID, "SuccessData", "successData", "Lcom/huami/account/ui/common/state/StateWrapper$Success;", "success", "(Ljava/lang/Object;)Lcom/huami/account/ui/common/state/StateWrapper$Success;", "FailedData", "failedData", "Lcom/huami/account/ui/common/state/StateWrapper$Failed;", "failed", "(Ljava/lang/Object;)Lcom/huami/account/ui/common/state/StateWrapper$Failed;", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }

        @NotNull
        public final <FailedData> Failed<FailedData> failed(FailedData failedData) {
            return new Failed<>(failedData);
        }

        @NotNull
        public final Loading loading(@Nullable String message) {
            return new Loading(message);
        }

        @NotNull
        public final <SuccessData> Success<SuccessData> success(SuccessData successData) {
            return new Success<>(successData);
        }

        @NotNull
        public final Loading loading(int messageId) {
            return new Loading(messageId);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0002\u0010\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00020\u0004B\u000f\u0012\u0006\u0010\t\u001a\u00028\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\t\u001a\u00028\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/account/ui/common/state/StateWrapper$Failed;", "FailedData", "Lcom/huami/account/ui/common/state/StateWrapper;", "", "Lcom/huami/account/ui/common/state/ResultWrapper;", "a", "Ljava/lang/Object;", "getError", "()Ljava/lang/Object;", "error", "<init>", "(Ljava/lang/Object;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Failed<FailedData> implements StateWrapper, ResultWrapper {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final FailedData error;

        public Failed(FailedData faileddata) {
            this.error = faileddata;
        }

        @Override // com.huami.account.ui.common.state.ResultWrapper
        @NotNull
        public StateWrapper asState() {
            return ResultWrapper.DefaultImpls.asState(this);
        }

        public final FailedData getError() {
            return this.error;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rR\u001b\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/huami/account/ui/common/state/StateWrapper$Loading;", "Lcom/huami/account/ui/common/state/StateWrapper;", "", "", "a", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "<init>", "(Ljava/lang/String;)V", "", "resId", "(I)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Loading implements StateWrapper {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private final String message;

        public Loading(@Nullable String str) {
            this.message = str;
        }

        @Nullable
        public final String getMessage() {
            return this.message;
        }

        public Loading(int i) {
            this(AccountExternalsKt.getAppContext().getString(i));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0002\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u00030\u0004B\u000f\u0012\u0006\u0010\t\u001a\u00028\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\t\u001a\u00028\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/account/ui/common/state/StateWrapper$Success;", "SuccessData", "Lcom/huami/account/ui/common/state/StateWrapper;", "", "Lcom/huami/account/ui/common/state/ResultWrapper;", "a", "Ljava/lang/Object;", "getData", "()Ljava/lang/Object;", "data", "<init>", "(Ljava/lang/Object;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Success<SuccessData> implements StateWrapper, ResultWrapper {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final SuccessData data;

        public Success(SuccessData successdata) {
            this.data = successdata;
        }

        @Override // com.huami.account.ui.common.state.ResultWrapper
        @NotNull
        public StateWrapper asState() {
            return ResultWrapper.DefaultImpls.asState(this);
        }

        public final SuccessData getData() {
            return this.data;
        }
    }
}
