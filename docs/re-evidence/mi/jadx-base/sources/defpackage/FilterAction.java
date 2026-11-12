package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: sa, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\t¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u0014"}, d2 = {"Lsa;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lkotlin/Function1;", "", "filter", "Lkotlin/jvm/functions/Function1;", PluginDeviceInfo.FDESC, "()Lkotlin/jvm/functions/Function1;", "", "action", PluginDeviceInfo.FMODEL, "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class FilterAction {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    @NotNull
    public final Function1<byte[], Boolean> filter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @NotNull
    public final Function1<byte[], Unit> action;

    /* JADX WARN: Multi-variable type inference failed */
    public FilterAction(@NotNull Function1<? super byte[], Boolean> filter, @NotNull Function1<? super byte[], Unit> action) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(action, "action");
        this.filter = filter;
        this.action = action;
    }

    @NotNull
    public final Function1<byte[], Unit> a() {
        return this.action;
    }

    @NotNull
    public final Function1<byte[], Boolean> b() {
        return this.filter;
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

    public int hashCode() {
        return (this.filter.hashCode() * 31) + this.action.hashCode();
    }

    @NotNull
    public String toString() {
        return "FilterAction(filter=" + this.filter + ", action=" + this.action + ')';
    }
}
