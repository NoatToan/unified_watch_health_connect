package com.huami.account.ui.common.state;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u0006*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00020\u0003:\u0001\u0006J\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/huami/account/ui/common/state/ResultWrapper;", "SuccessData", "FailedData", "", "Lcom/huami/account/ui/common/state/StateWrapper;", "asState", "Companion", "Lcom/huami/account/ui/common/state/StateWrapper$Success;", "Lcom/huami/account/ui/common/state/StateWrapper$Failed;", "accountui_release"}, k = 1, mv = {1, 5, 1})
public interface ResultWrapper<SuccessData, FailedData> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00020\t\"\u0004\b\u0002\u0010\u00072\u0006\u0010\b\u001a\u00028\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/huami/account/ui/common/state/ResultWrapper$Companion;", "", "SuccessData", "successData", "Lcom/huami/account/ui/common/state/StateWrapper$Success;", "success", "(Ljava/lang/Object;)Lcom/huami/account/ui/common/state/StateWrapper$Success;", "FailedData", "failedData", "Lcom/huami/account/ui/common/state/StateWrapper$Failed;", "failed", "(Ljava/lang/Object;)Lcom/huami/account/ui/common/state/StateWrapper$Failed;", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }

        @NotNull
        public final <FailedData> StateWrapper.Failed<FailedData> failed(FailedData failedData) {
            return new StateWrapper.Failed<>(failedData);
        }

        @NotNull
        public final <SuccessData> StateWrapper.Success<SuccessData> success(SuccessData successData) {
            return new StateWrapper.Success<>(successData);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @NotNull
        public static <SuccessData, FailedData> StateWrapper<SuccessData, FailedData> asState(@NotNull ResultWrapper<? extends SuccessData, ? extends FailedData> resultWrapper) {
            if (!(resultWrapper instanceof StateWrapper.Failed) && !(resultWrapper instanceof StateWrapper.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            return (StateWrapper) resultWrapper;
        }
    }

    @NotNull
    StateWrapper<SuccessData, FailedData> asState();
}
