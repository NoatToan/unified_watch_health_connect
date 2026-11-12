package com.huami.bluetooth.profile.channel.module.obsolete.impl;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003J\u0015\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0002HÆ\u0003J5\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0002HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R%\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R%\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/obsolete/impl/FilterAction;", "", "Lkotlin/Function1;", "", "", "component1", "", "component2", "filter", "action", "copy", "", "toString", "", "hashCode", "other", "equals", "a", "Lkotlin/jvm/functions/Function1;", "getFilter", "()Lkotlin/jvm/functions/Function1;", "b", "getAction", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class FilterAction {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final Function1<byte[], Boolean> filter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final Function1<byte[], Unit> action;

    /* JADX WARN: Multi-variable type inference failed */
    public FilterAction(@NotNull Function1<? super byte[], Boolean> function1, @NotNull Function1<? super byte[], Unit> function2) {
        this.filter = function1;
        this.action = function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FilterAction copy$default(FilterAction filterAction, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = filterAction.filter;
        }
        if ((i & 2) != 0) {
            function2 = filterAction.action;
        }
        return filterAction.copy(function1, function2);
    }

    @NotNull
    public final Function1<byte[], Boolean> component1() {
        return this.filter;
    }

    @NotNull
    public final Function1<byte[], Unit> component2() {
        return this.action;
    }

    @NotNull
    public final FilterAction copy(@NotNull Function1<? super byte[], Boolean> filter, @NotNull Function1<? super byte[], Unit> action) {
        return new FilterAction(filter, action);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FilterAction)) {
            return false;
        }
        FilterAction filterAction = (FilterAction) other;
        return Intrinsics.areEqual(this.filter, filterAction.filter) && Intrinsics.areEqual(this.action, filterAction.action);
    }

    @NotNull
    public final Function1<byte[], Unit> getAction() {
        return this.action;
    }

    @NotNull
    public final Function1<byte[], Boolean> getFilter() {
        return this.filter;
    }

    public int hashCode() {
        return (this.filter.hashCode() * 31) + this.action.hashCode();
    }

    @NotNull
    public String toString() {
        return "FilterAction(filter=" + this.filter + ", action=" + this.action + ')';
    }
}
