package com.xiaomi.hm.health.thirdbind;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003J\u0019\u0010\u0007\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0013\u001a\u00020\r8F@\u0006¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/thirdbind/Result;", "", "", "Lcom/xiaomi/hm/health/thirdbind/ThirdAuthItem;", "items", "Lcom/xiaomi/hm/health/thirdbind/AuthorizeApp;", "component1", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "isFinished", "()Z", "<init>", "(Ljava/util/List;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Result {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("items")
    @NotNull
    private final List<AuthorizeApp> items;

    public Result(@NotNull List<AuthorizeApp> list) {
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Result copy$default(Result result, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = result.items;
        }
        return result.copy(list);
    }

    @NotNull
    public final List<AuthorizeApp> component1() {
        return this.items;
    }

    @NotNull
    public final Result copy(@NotNull List<AuthorizeApp> items) {
        return new Result(items);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Result) && Intrinsics.areEqual(this.items, ((Result) other).items);
    }

    @NotNull
    public final List<AuthorizeApp> getItems() {
        return this.items;
    }

    public int hashCode() {
        return this.items.hashCode();
    }

    public final boolean isFinished() {
        return this.items.isEmpty();
    }

    @NotNull
    public final List<ThirdAuthItem> items() {
        List<AuthorizeApp> list = this.items;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (AuthorizeApp authorizeApp : list) {
            arrayList.add(new ThirdAuthItem(authorizeApp.getAppId(), authorizeApp.getAppName(), authorizeApp.getIcon()));
        }
        return arrayList;
    }

    @NotNull
    public String toString() {
        return "Result(items=" + this.items + ")";
    }
}
