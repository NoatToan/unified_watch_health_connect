package com.xiaomi.fitness.health.ecg;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J%\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/health/ecg/DialogLabelModel;", "", "dialogLabels", "", "", "dialogSelectedPosition", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getDialogLabels", "()Ljava/util/List;", "getDialogSelectedPosition", "()Ljava/lang/String;", "setDialogSelectedPosition", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DialogLabelModel {

    @NotNull
    private final List<String> dialogLabels;

    @Nullable
    private String dialogSelectedPosition;

    public DialogLabelModel(@NotNull List<String> dialogLabels, @Nullable String str) {
        Intrinsics.checkNotNullParameter(dialogLabels, "dialogLabels");
        this.dialogLabels = dialogLabels;
        this.dialogSelectedPosition = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DialogLabelModel copy$default(DialogLabelModel dialogLabelModel, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = dialogLabelModel.dialogLabels;
        }
        if ((i & 2) != 0) {
            str = dialogLabelModel.dialogSelectedPosition;
        }
        return dialogLabelModel.copy(list, str);
    }

    @NotNull
    public final List<String> component1() {
        return this.dialogLabels;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDialogSelectedPosition() {
        return this.dialogSelectedPosition;
    }

    @NotNull
    public final DialogLabelModel copy(@NotNull List<String> dialogLabels, @Nullable String dialogSelectedPosition) {
        Intrinsics.checkNotNullParameter(dialogLabels, "dialogLabels");
        return new DialogLabelModel(dialogLabels, dialogSelectedPosition);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DialogLabelModel)) {
            return false;
        }
        DialogLabelModel dialogLabelModel = (DialogLabelModel) other;
        return Intrinsics.areEqual(this.dialogLabels, dialogLabelModel.dialogLabels) && Intrinsics.areEqual(this.dialogSelectedPosition, dialogLabelModel.dialogSelectedPosition);
    }

    @NotNull
    public final List<String> getDialogLabels() {
        return this.dialogLabels;
    }

    @Nullable
    public final String getDialogSelectedPosition() {
        return this.dialogSelectedPosition;
    }

    public int hashCode() {
        int iHashCode = this.dialogLabels.hashCode() * 31;
        String str = this.dialogSelectedPosition;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final void setDialogSelectedPosition(@Nullable String str) {
        this.dialogSelectedPosition = str;
    }

    @NotNull
    public String toString() {
        return "DialogLabelModel(dialogLabels=" + this.dialogLabels + ", dialogSelectedPosition=" + this.dialogSelectedPosition + ")";
    }
}
