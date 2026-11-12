package com.huami.arch.core;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b!\u0010\"J \u0010\u0007\u001a\u00020\u00052\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00020\u00050\u0003J \u0010\t\u001a\u00020\u00052\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0004\u0012\u00020\u00050\u0003J \u0010\u000b\u001a\u00020\u00052\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0004\u0012\u00020\u00050\u0003J \u0010\r\u001a\u00020\u00052\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0004\u0012\u00020\u00050\u0003R6\u0010\u0014\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R6\u0010\u0018\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R6\u0010\u001c\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R6\u0010 \u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u000f\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013¨\u0006#"}, d2 = {"Lcom/huami/arch/core/StateBuilder;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlin/Function1;", "Lcom/huami/arch/core/Loading;", "", "action", "onLoading", "Lcom/huami/arch/core/Success;", "onSuccess", "Lcom/huami/arch/core/Fail;", "onFail", "Lcom/huami/arch/core/State;", "onCompleted", "a", "Lkotlin/jvm/functions/Function1;", "getLoadingAction", "()Lkotlin/jvm/functions/Function1;", "setLoadingAction", "(Lkotlin/jvm/functions/Function1;)V", "loadingAction", "b", "getSuccessAction", "setSuccessAction", "successAction", "c", "getFailAction", "setFailAction", "failAction", GoogleApiAvailabilityLight.a, "getCompletedAction", "setCompletedAction", "completedAction", "<init>", "()V", "arch_release"}, k = 1, mv = {1, 4, 0})
public final class StateBuilder<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Function1<? super Loading<? extends T>, Unit> loadingAction;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Function1<? super Success<? extends T>, Unit> successAction;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Function1<? super Fail<? extends T>, Unit> failAction;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private Function1<? super State<? extends T>, Unit> completedAction;

    @Nullable
    public final Function1<State<? extends T>, Unit> getCompletedAction() {
        return this.completedAction;
    }

    @Nullable
    public final Function1<Fail<? extends T>, Unit> getFailAction() {
        return this.failAction;
    }

    @Nullable
    public final Function1<Loading<? extends T>, Unit> getLoadingAction() {
        return this.loadingAction;
    }

    @Nullable
    public final Function1<Success<? extends T>, Unit> getSuccessAction() {
        return this.successAction;
    }

    public final void onCompleted(@NotNull Function1<? super State<? extends T>, Unit> action) {
        this.completedAction = action;
    }

    public final void onFail(@NotNull Function1<? super Fail<? extends T>, Unit> action) {
        this.failAction = action;
    }

    public final void onLoading(@NotNull Function1<? super Loading<? extends T>, Unit> action) {
        this.loadingAction = action;
    }

    public final void onSuccess(@NotNull Function1<? super Success<? extends T>, Unit> action) {
        this.successAction = action;
    }

    public final void setCompletedAction(@Nullable Function1<? super State<? extends T>, Unit> function1) {
        this.completedAction = function1;
    }

    public final void setFailAction(@Nullable Function1<? super Fail<? extends T>, Unit> function1) {
        this.failAction = function1;
    }

    public final void setLoadingAction(@Nullable Function1<? super Loading<? extends T>, Unit> function1) {
        this.loadingAction = function1;
    }

    public final void setSuccessAction(@Nullable Function1<? super Success<? extends T>, Unit> function1) {
        this.successAction = function1;
    }
}
