package com.huami.feedback.ui;

import android.content.DialogInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012%\b\u0002\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012%\b\u0002\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ&\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002HÆ\u0003J&\u0010\t\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002HÆ\u0003JW\u0010\f\u001a\u00020\u00002%\b\u0002\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00022%\b\u0002\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R6\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R6\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/huami/feedback/ui/DialogCallbacks;", "", "Lkotlin/Function1;", "Landroid/content/DialogInterface;", "Lkotlin/ParameterName;", "name", "dialog", "", "component1", "component2", "positiveCallbacks", "negativeCallBack", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lkotlin/jvm/functions/Function1;", "getPositiveCallbacks", "()Lkotlin/jvm/functions/Function1;", "b", "getNegativeCallBack", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class DialogCallbacks {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private final Function1<DialogInterface, Unit> positiveCallbacks;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final Function1<DialogInterface, Unit> negativeCallBack;

    /* JADX WARN: Multi-variable type inference failed */
    public DialogCallbacks() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DialogCallbacks(@Nullable Function1<? super DialogInterface, Unit> function1, @Nullable Function1<? super DialogInterface, Unit> function2) {
        this.positiveCallbacks = function1;
        this.negativeCallBack = function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DialogCallbacks copy$default(DialogCallbacks dialogCallbacks, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = dialogCallbacks.positiveCallbacks;
        }
        if ((i & 2) != 0) {
            function2 = dialogCallbacks.negativeCallBack;
        }
        return dialogCallbacks.copy(function1, function2);
    }

    @Nullable
    public final Function1<DialogInterface, Unit> component1() {
        return this.positiveCallbacks;
    }

    @Nullable
    public final Function1<DialogInterface, Unit> component2() {
        return this.negativeCallBack;
    }

    @NotNull
    public final DialogCallbacks copy(@Nullable Function1<? super DialogInterface, Unit> positiveCallbacks, @Nullable Function1<? super DialogInterface, Unit> negativeCallBack) {
        return new DialogCallbacks(positiveCallbacks, negativeCallBack);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DialogCallbacks)) {
            return false;
        }
        DialogCallbacks dialogCallbacks = (DialogCallbacks) other;
        return Intrinsics.areEqual(this.positiveCallbacks, dialogCallbacks.positiveCallbacks) && Intrinsics.areEqual(this.negativeCallBack, dialogCallbacks.negativeCallBack);
    }

    @Nullable
    public final Function1<DialogInterface, Unit> getNegativeCallBack() {
        return this.negativeCallBack;
    }

    @Nullable
    public final Function1<DialogInterface, Unit> getPositiveCallbacks() {
        return this.positiveCallbacks;
    }

    public int hashCode() {
        Function1<DialogInterface, Unit> function1 = this.positiveCallbacks;
        int iHashCode = (function1 == null ? 0 : function1.hashCode()) * 31;
        Function1<DialogInterface, Unit> function2 = this.negativeCallBack;
        return iHashCode + (function2 != null ? function2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DialogCallbacks(positiveCallbacks=" + this.positiveCallbacks + ", negativeCallBack=" + this.negativeCallBack + ')';
    }

    public /* synthetic */ DialogCallbacks(Function1 function1, Function1 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1, (i & 2) != 0 ? null : function2);
    }
}
