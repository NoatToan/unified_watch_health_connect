package com.huami.phn.service;

import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u001b\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00050\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J9\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\u001a\b\u0002\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R+\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u000b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/huami/phn/service/PHNCardTipsData;", "", "", "component1", "", "Lkotlin/Pair;", "", "component2", "component3", "title", "description", "isHelper", "copy", "toString", "", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "b", "Ljava/util/List;", "getDescription", "()Ljava/util/List;", "c", "Z", "()Z", "<init>", "(Ljava/lang/String;Ljava/util/List;Z)V", "phn_service_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PHNCardTipsData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<Pair<String, Boolean>> description;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final boolean isHelper;

    public PHNCardTipsData(@NotNull String str, @NotNull List<Pair<String, Boolean>> list, boolean z) {
        this.title = str;
        this.description = list;
        this.isHelper = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PHNCardTipsData copy$default(PHNCardTipsData pHNCardTipsData, String str, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pHNCardTipsData.title;
        }
        if ((i & 2) != 0) {
            list = pHNCardTipsData.description;
        }
        if ((i & 4) != 0) {
            z = pHNCardTipsData.isHelper;
        }
        return pHNCardTipsData.copy(str, list, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final List<Pair<String, Boolean>> component2() {
        return this.description;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsHelper() {
        return this.isHelper;
    }

    @NotNull
    public final PHNCardTipsData copy(@NotNull String title, @NotNull List<Pair<String, Boolean>> description, boolean isHelper) {
        return new PHNCardTipsData(title, description, isHelper);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PHNCardTipsData)) {
            return false;
        }
        PHNCardTipsData pHNCardTipsData = (PHNCardTipsData) other;
        return Intrinsics.areEqual(this.title, pHNCardTipsData.title) && Intrinsics.areEqual(this.description, pHNCardTipsData.description) && this.isHelper == pHNCardTipsData.isHelper;
    }

    @NotNull
    public final List<Pair<String, Boolean>> getDescription() {
        return this.description;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public int hashCode() {
        int iHashCode = ((this.title.hashCode() * 31) + this.description.hashCode()) * 31;
        boolean z = this.isHelper;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final boolean isHelper() {
        return this.isHelper;
    }

    @NotNull
    public String toString() {
        return "PHNCardTipsData(title=" + this.title + ", description=" + this.description + ", isHelper=" + this.isHelper + ")";
    }
}
