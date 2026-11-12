package com.xiaomi.fitness.health.sleep.utils;

import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J/\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/utils/SleepParagraph;", "", "id", "", MiuiCursorConstants.CONTENT, "synonymList", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getContent", "getSynonymList", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SleepParagraph {

    @NotNull
    private final String content;

    @NotNull
    private final String id;

    @Nullable
    private final List<String> synonymList;

    public SleepParagraph(@NotNull String id, @NotNull String content, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(content, "content");
        this.id = id;
        this.content = content;
        this.synonymList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SleepParagraph copy$default(SleepParagraph sleepParagraph, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sleepParagraph.id;
        }
        if ((i & 2) != 0) {
            str2 = sleepParagraph.content;
        }
        if ((i & 4) != 0) {
            list = sleepParagraph.synonymList;
        }
        return sleepParagraph.copy(str, str2, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final List<String> component3() {
        return this.synonymList;
    }

    @NotNull
    public final SleepParagraph copy(@NotNull String id, @NotNull String content, @Nullable List<String> synonymList) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(content, "content");
        return new SleepParagraph(id, content, synonymList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepParagraph)) {
            return false;
        }
        SleepParagraph sleepParagraph = (SleepParagraph) other;
        return Intrinsics.areEqual(this.id, sleepParagraph.id) && Intrinsics.areEqual(this.content, sleepParagraph.content) && Intrinsics.areEqual(this.synonymList, sleepParagraph.synonymList);
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final List<String> getSynonymList() {
        return this.synonymList;
    }

    public int hashCode() {
        int iHashCode = ((this.id.hashCode() * 31) + this.content.hashCode()) * 31;
        List<String> list = this.synonymList;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "SleepParagraph(id=" + this.id + ", content=" + this.content + ", synonymList=" + this.synonymList + ")";
    }
}
