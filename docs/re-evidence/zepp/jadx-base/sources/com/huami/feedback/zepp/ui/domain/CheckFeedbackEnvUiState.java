package com.huami.feedback.zepp.ui.domain;

import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/huami/feedback/zepp/ui/domain/CheckFeedbackEnvUiState;", "", "ActionError", "NoneCheck", "Successful", "ToastError", "Lcom/huami/feedback/zepp/ui/domain/CheckFeedbackEnvUiState$NoneCheck;", "Lcom/huami/feedback/zepp/ui/domain/CheckFeedbackEnvUiState$ToastError;", "Lcom/huami/feedback/zepp/ui/domain/CheckFeedbackEnvUiState$ActionError;", "Lcom/huami/feedback/zepp/ui/domain/CheckFeedbackEnvUiState$Successful;", "feedback-zepp-ui_release"}, k = 1, mv = {1, 5, 1})
public interface CheckFeedbackEnvUiState {

    @StabilityInferred(parameters = 0)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0019\u0010\u0004\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/huami/feedback/zepp/ui/domain/CheckFeedbackEnvUiState$ActionError;", "Lcom/huami/feedback/zepp/ui/domain/CheckFeedbackEnvUiState;", "Lcom/huami/feedback/zepp/ui/domain/ActionType;", "component1", "action", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Lcom/huami/feedback/zepp/ui/domain/ActionType;", "getAction", "()Lcom/huami/feedback/zepp/ui/domain/ActionType;", "<init>", "(Lcom/huami/feedback/zepp/ui/domain/ActionType;)V", "feedback-zepp-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class ActionError implements CheckFeedbackEnvUiState {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        private final ActionType action;

        public ActionError(@NotNull ActionType actionType) {
            this.action = actionType;
        }

        public static /* synthetic */ ActionError copy$default(ActionError actionError, ActionType actionType, int i, Object obj) {
            if ((i & 1) != 0) {
                actionType = actionError.action;
            }
            return actionError.copy(actionType);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ActionType getAction() {
            return this.action;
        }

        @NotNull
        public final ActionError copy(@NotNull ActionType action) {
            return new ActionError(action);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ActionError) && this.action == ((ActionError) other).action;
        }

        @NotNull
        public final ActionType getAction() {
            return this.action;
        }

        public int hashCode() {
            return this.action.hashCode();
        }

        @NotNull
        public String toString() {
            return "ActionError(action=" + this.action + ')';
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/feedback/zepp/ui/domain/CheckFeedbackEnvUiState$NoneCheck;", "Lcom/huami/feedback/zepp/ui/domain/CheckFeedbackEnvUiState;", "<init>", "()V", "feedback-zepp-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class NoneCheck implements CheckFeedbackEnvUiState {
        public static final int $stable = 0;

        @NotNull
        public static final NoneCheck INSTANCE = new NoneCheck();

        private NoneCheck() {
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/feedback/zepp/ui/domain/CheckFeedbackEnvUiState$Successful;", "Lcom/huami/feedback/zepp/ui/domain/CheckFeedbackEnvUiState;", "<init>", "()V", "feedback-zepp-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Successful implements CheckFeedbackEnvUiState {
        public static final int $stable = 0;

        @NotNull
        public static final Successful INSTANCE = new Successful();

        private Successful() {
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/huami/feedback/zepp/ui/domain/CheckFeedbackEnvUiState$ToastError;", "Lcom/huami/feedback/zepp/ui/domain/CheckFeedbackEnvUiState;", "Lcom/huami/feedback/zepp/ui/domain/ToastType;", "component1", "", "component2", "toastType", "message", "copy", "", "toString", "hashCode", "", "other", "", "equals", "a", "Lcom/huami/feedback/zepp/ui/domain/ToastType;", "getToastType", "()Lcom/huami/feedback/zepp/ui/domain/ToastType;", "b", LogUtil.I, "getMessage", "()I", "<init>", "(Lcom/huami/feedback/zepp/ui/domain/ToastType;I)V", "feedback-zepp-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class ToastError implements CheckFeedbackEnvUiState {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        private final ToastType toastType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private final int message;

        public ToastError(@NotNull ToastType toastType, @StringRes int i) {
            this.toastType = toastType;
            this.message = i;
        }

        public static /* synthetic */ ToastError copy$default(ToastError toastError, ToastType toastType, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                toastType = toastError.toastType;
            }
            if ((i2 & 2) != 0) {
                i = toastError.message;
            }
            return toastError.copy(toastType, i);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ToastType getToastType() {
            return this.toastType;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getMessage() {
            return this.message;
        }

        @NotNull
        public final ToastError copy(@NotNull ToastType toastType, @StringRes int message) {
            return new ToastError(toastType, message);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ToastError)) {
                return false;
            }
            ToastError toastError = (ToastError) other;
            return this.toastType == toastError.toastType && this.message == toastError.message;
        }

        public final int getMessage() {
            return this.message;
        }

        @NotNull
        public final ToastType getToastType() {
            return this.toastType;
        }

        public int hashCode() {
            return (this.toastType.hashCode() * 31) + this.message;
        }

        @NotNull
        public String toString() {
            return "ToastError(toastType=" + this.toastType + ", message=" + this.message + ')';
        }
    }
}
