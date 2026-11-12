package com.xiaomi.fit.fitness.export.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/SportReportKey;", "", "key", "", "category", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getCategory", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SportReportKey {

    @NotNull
    private final String category;

    @NotNull
    private final String key;

    public SportReportKey(@NotNull String key, @NotNull String category) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(category, "category");
        this.key = key;
        this.category = category;
    }

    public static /* synthetic */ SportReportKey copy$default(SportReportKey sportReportKey, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sportReportKey.key;
        }
        if ((i & 2) != 0) {
            str2 = sportReportKey.category;
        }
        return sportReportKey.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    @NotNull
    public final SportReportKey copy(@NotNull String key, @NotNull String category) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(category, "category");
        return new SportReportKey(key, category);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportReportKey)) {
            return false;
        }
        SportReportKey sportReportKey = (SportReportKey) other;
        return Intrinsics.areEqual(this.key, sportReportKey.key) && Intrinsics.areEqual(this.category, sportReportKey.category);
    }

    @NotNull
    public final String getCategory() {
        return this.category;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        return (this.key.hashCode() * 31) + this.category.hashCode();
    }

    @NotNull
    public String toString() {
        return "SportReportKey(key=" + this.key + ", category=" + this.category + ")";
    }
}
