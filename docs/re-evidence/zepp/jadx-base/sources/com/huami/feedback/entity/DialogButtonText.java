package com.huami.feedback.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J!\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/huami/feedback/entity/DialogButtonText;", "", "", "component1", "component2", "positive", "negative", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getPositive", "()Ljava/lang/String;", "b", "getNegative", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class DialogButtonText {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private final String positive;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final String negative;

    /* JADX WARN: Multi-variable type inference failed */
    public DialogButtonText() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public DialogButtonText(@Nullable String str, @Nullable String str2) {
        this.positive = str;
        this.negative = str2;
    }

    public static /* synthetic */ DialogButtonText copy$default(DialogButtonText dialogButtonText, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dialogButtonText.positive;
        }
        if ((i & 2) != 0) {
            str2 = dialogButtonText.negative;
        }
        return dialogButtonText.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPositive() {
        return this.positive;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNegative() {
        return this.negative;
    }

    @NotNull
    public final DialogButtonText copy(@Nullable String positive, @Nullable String negative) {
        return new DialogButtonText(positive, negative);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DialogButtonText)) {
            return false;
        }
        DialogButtonText dialogButtonText = (DialogButtonText) other;
        return Intrinsics.areEqual(this.positive, dialogButtonText.positive) && Intrinsics.areEqual(this.negative, dialogButtonText.negative);
    }

    @Nullable
    public final String getNegative() {
        return this.negative;
    }

    @Nullable
    public final String getPositive() {
        return this.positive;
    }

    public int hashCode() {
        String str = this.positive;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.negative;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DialogButtonText(positive=" + ((Object) this.positive) + ", negative=" + ((Object) this.negative) + ')';
    }

    public /* synthetic */ DialogButtonText(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
