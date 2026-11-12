package com.huami.sky.service;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001b\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/huami/sky/service/RelaxData;", "", "", "", "component1", "Lcom/huami/sky/service/RelaxScore;", "component2", "component3", "tags", "scores", "daysOfContinuous", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/util/List;", "getTags", "()Ljava/util/List;", "b", "getScores", "c", "Ljava/lang/String;", "getDaysOfContinuous", "()Ljava/lang/String;", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "sky-service_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class RelaxData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<String> tags;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<RelaxScore> scores;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final String daysOfContinuous;

    public RelaxData(@NotNull List<String> list, @NotNull List<RelaxScore> list2, @Nullable String str) {
        this.tags = list;
        this.scores = list2;
        this.daysOfContinuous = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RelaxData copy$default(RelaxData relaxData, List list, List list2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = relaxData.tags;
        }
        if ((i & 2) != 0) {
            list2 = relaxData.scores;
        }
        if ((i & 4) != 0) {
            str = relaxData.daysOfContinuous;
        }
        return relaxData.copy(list, list2, str);
    }

    @NotNull
    public final List<String> component1() {
        return this.tags;
    }

    @NotNull
    public final List<RelaxScore> component2() {
        return this.scores;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDaysOfContinuous() {
        return this.daysOfContinuous;
    }

    @NotNull
    public final RelaxData copy(@NotNull List<String> tags, @NotNull List<RelaxScore> scores, @Nullable String daysOfContinuous) {
        return new RelaxData(tags, scores, daysOfContinuous);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RelaxData)) {
            return false;
        }
        RelaxData relaxData = (RelaxData) other;
        return Intrinsics.areEqual(this.tags, relaxData.tags) && Intrinsics.areEqual(this.scores, relaxData.scores) && Intrinsics.areEqual(this.daysOfContinuous, relaxData.daysOfContinuous);
    }

    @Nullable
    public final String getDaysOfContinuous() {
        return this.daysOfContinuous;
    }

    @NotNull
    public final List<RelaxScore> getScores() {
        return this.scores;
    }

    @NotNull
    public final List<String> getTags() {
        return this.tags;
    }

    public int hashCode() {
        int iHashCode = ((this.tags.hashCode() * 31) + this.scores.hashCode()) * 31;
        String str = this.daysOfContinuous;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "RelaxData(tags=" + this.tags + ", scores=" + this.scores + ", daysOfContinuous=" + this.daysOfContinuous + ")";
    }
}
