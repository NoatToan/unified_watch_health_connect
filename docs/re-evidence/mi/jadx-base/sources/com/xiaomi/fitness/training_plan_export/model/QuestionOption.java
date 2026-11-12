package com.xiaomi.fitness.training_plan_export.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J:\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b\u0015\u0010\u0016¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/model/QuestionOption;", "", "id", "", "contentRes", "", "selected", "", "selectedDescStr", "<init>", "(ILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getId", "()I", "getContentRes", "()Ljava/lang/String;", "getSelected", "()Ljava/lang/Boolean;", "setSelected", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getSelectedDescStr", "setSelectedDescStr", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "copy", "(ILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/xiaomi/fitness/training_plan_export/model/QuestionOption;", "equals", "other", "hashCode", "toString", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class QuestionOption {

    @NotNull
    private final String contentRes;
    private final int id;

    @Nullable
    private Boolean selected;

    @Nullable
    private String selectedDescStr;

    public QuestionOption(int i, @NotNull String contentRes, @Nullable Boolean bool, @Nullable String str) {
        Intrinsics.checkNotNullParameter(contentRes, "contentRes");
        this.id = i;
        this.contentRes = contentRes;
        this.selected = bool;
        this.selectedDescStr = str;
    }

    public static /* synthetic */ QuestionOption copy$default(QuestionOption questionOption, int i, String str, Boolean bool, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = questionOption.id;
        }
        if ((i2 & 2) != 0) {
            str = questionOption.contentRes;
        }
        if ((i2 & 4) != 0) {
            bool = questionOption.selected;
        }
        if ((i2 & 8) != 0) {
            str2 = questionOption.selectedDescStr;
        }
        return questionOption.copy(i, str, bool, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContentRes() {
        return this.contentRes;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getSelected() {
        return this.selected;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSelectedDescStr() {
        return this.selectedDescStr;
    }

    @NotNull
    public final QuestionOption copy(int id, @NotNull String contentRes, @Nullable Boolean selected, @Nullable String selectedDescStr) {
        Intrinsics.checkNotNullParameter(contentRes, "contentRes");
        return new QuestionOption(id, contentRes, selected, selectedDescStr);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuestionOption)) {
            return false;
        }
        QuestionOption questionOption = (QuestionOption) other;
        return this.id == questionOption.id && Intrinsics.areEqual(this.contentRes, questionOption.contentRes) && Intrinsics.areEqual(this.selected, questionOption.selected) && Intrinsics.areEqual(this.selectedDescStr, questionOption.selectedDescStr);
    }

    @NotNull
    public final String getContentRes() {
        return this.contentRes;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final Boolean getSelected() {
        return this.selected;
    }

    @Nullable
    public final String getSelectedDescStr() {
        return this.selectedDescStr;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.id) * 31) + this.contentRes.hashCode()) * 31;
        Boolean bool = this.selected;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.selectedDescStr;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final void setSelected(@Nullable Boolean bool) {
        this.selected = bool;
    }

    public final void setSelectedDescStr(@Nullable String str) {
        this.selectedDescStr = str;
    }

    @NotNull
    public String toString() {
        return "QuestionOption(id=" + this.id + ", contentRes=" + this.contentRes + ", selected=" + this.selected + ", selectedDescStr=" + this.selectedDescStr + ")";
    }

    public /* synthetic */ QuestionOption(int i, String str, Boolean bool, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, bool, (i2 & 8) != 0 ? null : str2);
    }
}
