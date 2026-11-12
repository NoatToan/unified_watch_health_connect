package com.huami.account.ui.forget.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/huami/account/ui/forget/entity/ChangePasswordResult;", "", "", "component1", "Lcom/huami/account/ui/forget/entity/ChangePasswordForm;", "component2", "result", "changePasswordForm", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getResult", "()Ljava/lang/String;", "b", "Lcom/huami/account/ui/forget/entity/ChangePasswordForm;", "getChangePasswordForm", "()Lcom/huami/account/ui/forget/entity/ChangePasswordForm;", "<init>", "(Ljava/lang/String;Lcom/huami/account/ui/forget/entity/ChangePasswordForm;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ChangePasswordResult {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private final String result;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final ChangePasswordForm changePasswordForm;

    public ChangePasswordResult(@Nullable String str, @NotNull ChangePasswordForm changePasswordForm) {
        this.result = str;
        this.changePasswordForm = changePasswordForm;
    }

    public static /* synthetic */ ChangePasswordResult copy$default(ChangePasswordResult changePasswordResult, String str, ChangePasswordForm changePasswordForm, int i, Object obj) {
        if ((i & 1) != 0) {
            str = changePasswordResult.result;
        }
        if ((i & 2) != 0) {
            changePasswordForm = changePasswordResult.changePasswordForm;
        }
        return changePasswordResult.copy(str, changePasswordForm);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getResult() {
        return this.result;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ChangePasswordForm getChangePasswordForm() {
        return this.changePasswordForm;
    }

    @NotNull
    public final ChangePasswordResult copy(@Nullable String result, @NotNull ChangePasswordForm changePasswordForm) {
        return new ChangePasswordResult(result, changePasswordForm);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangePasswordResult)) {
            return false;
        }
        ChangePasswordResult changePasswordResult = (ChangePasswordResult) other;
        return Intrinsics.areEqual(this.result, changePasswordResult.result) && Intrinsics.areEqual(this.changePasswordForm, changePasswordResult.changePasswordForm);
    }

    @NotNull
    public final ChangePasswordForm getChangePasswordForm() {
        return this.changePasswordForm;
    }

    @Nullable
    public final String getResult() {
        return this.result;
    }

    public int hashCode() {
        String str = this.result;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.changePasswordForm.hashCode();
    }

    @NotNull
    public String toString() {
        return "ChangePasswordResult(result=" + this.result + ", changePasswordForm=" + this.changePasswordForm + ")";
    }
}
