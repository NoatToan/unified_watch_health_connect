package com.huami.sky.lib.entity;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J5\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u0010\r\u001a\u00020\u0007HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/huami/sky/lib/entity/RelaxDataResponse;", "", "", "Lcom/huami/sky/lib/entity/RelaxInfo;", "component1", "Lcom/huami/sky/lib/entity/MusicTags;", "component2", "", "component3", "relaxations", "tags", "daysOfContinuous", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/List;", "getRelaxations", "()Ljava/util/List;", "getTags", "Ljava/lang/String;", "getDaysOfContinuous", "()Ljava/lang/String;", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class RelaxDataResponse {

    @Nullable
    private final String daysOfContinuous;

    @NotNull
    private final List<RelaxInfo> relaxations;

    @NotNull
    private final List<MusicTags> tags;

    public RelaxDataResponse(@NotNull List<RelaxInfo> list, @NotNull List<MusicTags> list2, @Nullable String str) {
        this.relaxations = list;
        this.tags = list2;
        this.daysOfContinuous = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RelaxDataResponse copy$default(RelaxDataResponse relaxDataResponse, List list, List list2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = relaxDataResponse.relaxations;
        }
        if ((i & 2) != 0) {
            list2 = relaxDataResponse.tags;
        }
        if ((i & 4) != 0) {
            str = relaxDataResponse.daysOfContinuous;
        }
        return relaxDataResponse.copy(list, list2, str);
    }

    @NotNull
    public final List<RelaxInfo> component1() {
        return this.relaxations;
    }

    @NotNull
    public final List<MusicTags> component2() {
        return this.tags;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDaysOfContinuous() {
        return this.daysOfContinuous;
    }

    @NotNull
    public final RelaxDataResponse copy(@NotNull List<RelaxInfo> relaxations, @NotNull List<MusicTags> tags, @Nullable String daysOfContinuous) {
        return new RelaxDataResponse(relaxations, tags, daysOfContinuous);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RelaxDataResponse)) {
            return false;
        }
        RelaxDataResponse relaxDataResponse = (RelaxDataResponse) other;
        return Intrinsics.areEqual(this.relaxations, relaxDataResponse.relaxations) && Intrinsics.areEqual(this.tags, relaxDataResponse.tags) && Intrinsics.areEqual(this.daysOfContinuous, relaxDataResponse.daysOfContinuous);
    }

    @Nullable
    public final String getDaysOfContinuous() {
        return this.daysOfContinuous;
    }

    @NotNull
    public final List<RelaxInfo> getRelaxations() {
        return this.relaxations;
    }

    @NotNull
    public final List<MusicTags> getTags() {
        return this.tags;
    }

    public int hashCode() {
        int iHashCode = ((this.relaxations.hashCode() * 31) + this.tags.hashCode()) * 31;
        String str = this.daysOfContinuous;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "RelaxDataResponse(relaxations=" + this.relaxations + ", tags=" + this.tags + ", daysOfContinuous=" + this.daysOfContinuous + ")";
    }
}
