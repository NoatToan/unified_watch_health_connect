package com.xiaomi.fitness.detail.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J1\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/detail/model/SportFeedbackLabelModel;", "", "index", "", "labelStr", "", "labelStrCN", "selected", "", "<init>", "(ILjava/lang/String;Ljava/lang/String;Z)V", "getIndex", "()I", "setIndex", "(I)V", "getLabelStr", "()Ljava/lang/String;", "setLabelStr", "(Ljava/lang/String;)V", "getLabelStrCN", "setLabelStrCN", "getSelected", "()Z", "setSelected", "(Z)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SportFeedbackLabelModel {
    private int index;

    @NotNull
    private String labelStr;

    @NotNull
    private String labelStrCN;
    private boolean selected;

    public SportFeedbackLabelModel(int i, @NotNull String labelStr, @NotNull String labelStrCN, boolean z) {
        Intrinsics.checkNotNullParameter(labelStr, "labelStr");
        Intrinsics.checkNotNullParameter(labelStrCN, "labelStrCN");
        this.index = i;
        this.labelStr = labelStr;
        this.labelStrCN = labelStrCN;
        this.selected = z;
    }

    public static /* synthetic */ SportFeedbackLabelModel copy$default(SportFeedbackLabelModel sportFeedbackLabelModel, int i, String str, String str2, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = sportFeedbackLabelModel.index;
        }
        if ((i2 & 2) != 0) {
            str = sportFeedbackLabelModel.labelStr;
        }
        if ((i2 & 4) != 0) {
            str2 = sportFeedbackLabelModel.labelStrCN;
        }
        if ((i2 & 8) != 0) {
            z = sportFeedbackLabelModel.selected;
        }
        return sportFeedbackLabelModel.copy(i, str, str2, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabelStr() {
        return this.labelStr;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLabelStrCN() {
        return this.labelStrCN;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    @NotNull
    public final SportFeedbackLabelModel copy(int index, @NotNull String labelStr, @NotNull String labelStrCN, boolean selected) {
        Intrinsics.checkNotNullParameter(labelStr, "labelStr");
        Intrinsics.checkNotNullParameter(labelStrCN, "labelStrCN");
        return new SportFeedbackLabelModel(index, labelStr, labelStrCN, selected);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportFeedbackLabelModel)) {
            return false;
        }
        SportFeedbackLabelModel sportFeedbackLabelModel = (SportFeedbackLabelModel) other;
        return this.index == sportFeedbackLabelModel.index && Intrinsics.areEqual(this.labelStr, sportFeedbackLabelModel.labelStr) && Intrinsics.areEqual(this.labelStrCN, sportFeedbackLabelModel.labelStrCN) && this.selected == sportFeedbackLabelModel.selected;
    }

    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final String getLabelStr() {
        return this.labelStr;
    }

    @NotNull
    public final String getLabelStrCN() {
        return this.labelStrCN;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.index) * 31) + this.labelStr.hashCode()) * 31) + this.labelStrCN.hashCode()) * 31) + Boolean.hashCode(this.selected);
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public final void setLabelStr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.labelStr = str;
    }

    public final void setLabelStrCN(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.labelStrCN = str;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    @NotNull
    public String toString() {
        return "SportFeedbackLabelModel(index=" + this.index + ", labelStr=" + this.labelStr + ", labelStrCN=" + this.labelStrCN + ", selected=" + this.selected + ")";
    }

    public /* synthetic */ SportFeedbackLabelModel(int i, String str, String str2, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, (i2 & 8) != 0 ? false : z);
    }
}
