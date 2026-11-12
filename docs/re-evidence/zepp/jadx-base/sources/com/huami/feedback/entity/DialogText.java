package com.huami.feedback.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/huami/feedback/entity/DialogText;", "", "Lcom/huami/feedback/entity/DialogTitle;", "component1", "Lcom/huami/feedback/entity/DialogButtonText;", "component2", "dialogTitle", "dialogButtonText", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/huami/feedback/entity/DialogTitle;", "getDialogTitle", "()Lcom/huami/feedback/entity/DialogTitle;", "b", "Lcom/huami/feedback/entity/DialogButtonText;", "getDialogButtonText", "()Lcom/huami/feedback/entity/DialogButtonText;", "<init>", "(Lcom/huami/feedback/entity/DialogTitle;Lcom/huami/feedback/entity/DialogButtonText;)V", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class DialogText {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final DialogTitle dialogTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final DialogButtonText dialogButtonText;

    public DialogText(@NotNull DialogTitle dialogTitle, @NotNull DialogButtonText dialogButtonText) {
        this.dialogTitle = dialogTitle;
        this.dialogButtonText = dialogButtonText;
    }

    public static /* synthetic */ DialogText copy$default(DialogText dialogText, DialogTitle dialogTitle, DialogButtonText dialogButtonText, int i, Object obj) {
        if ((i & 1) != 0) {
            dialogTitle = dialogText.dialogTitle;
        }
        if ((i & 2) != 0) {
            dialogButtonText = dialogText.dialogButtonText;
        }
        return dialogText.copy(dialogTitle, dialogButtonText);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DialogTitle getDialogTitle() {
        return this.dialogTitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DialogButtonText getDialogButtonText() {
        return this.dialogButtonText;
    }

    @NotNull
    public final DialogText copy(@NotNull DialogTitle dialogTitle, @NotNull DialogButtonText dialogButtonText) {
        return new DialogText(dialogTitle, dialogButtonText);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DialogText)) {
            return false;
        }
        DialogText dialogText = (DialogText) other;
        return Intrinsics.areEqual(this.dialogTitle, dialogText.dialogTitle) && Intrinsics.areEqual(this.dialogButtonText, dialogText.dialogButtonText);
    }

    @NotNull
    public final DialogButtonText getDialogButtonText() {
        return this.dialogButtonText;
    }

    @NotNull
    public final DialogTitle getDialogTitle() {
        return this.dialogTitle;
    }

    public int hashCode() {
        return (this.dialogTitle.hashCode() * 31) + this.dialogButtonText.hashCode();
    }

    @NotNull
    public String toString() {
        return "DialogText(dialogTitle=" + this.dialogTitle + ", dialogButtonText=" + this.dialogButtonText + ')';
    }
}
