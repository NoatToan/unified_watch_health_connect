package com.xiaomi.fit.fitness.persist.server.data;

import com.xiaomi.fitness.sport.route.detail.server.RouteRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/server/data/SportCategoryKey;", "", "limit", "", RouteRequest.KEY_NEXT_KEY, "", "<init>", "(ILjava/lang/String;)V", "getLimit", "()I", "getNext_key", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SportCategoryKey {
    private final int limit;

    @Nullable
    private final String next_key;

    /* JADX WARN: Multi-variable type inference failed */
    public SportCategoryKey() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SportCategoryKey copy$default(SportCategoryKey sportCategoryKey, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = sportCategoryKey.limit;
        }
        if ((i2 & 2) != 0) {
            str = sportCategoryKey.next_key;
        }
        return sportCategoryKey.copy(i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNext_key() {
        return this.next_key;
    }

    @NotNull
    public final SportCategoryKey copy(int limit, @Nullable String next_key) {
        return new SportCategoryKey(limit, next_key);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportCategoryKey)) {
            return false;
        }
        SportCategoryKey sportCategoryKey = (SportCategoryKey) other;
        return this.limit == sportCategoryKey.limit && Intrinsics.areEqual(this.next_key, sportCategoryKey.next_key);
    }

    public final int getLimit() {
        return this.limit;
    }

    @Nullable
    public final String getNext_key() {
        return this.next_key;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.limit) * 31;
        String str = this.next_key;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "SportCategoryKey(limit=" + this.limit + ", next_key=" + this.next_key + ")";
    }

    public SportCategoryKey(int i, @Nullable String str) {
        this.limit = i;
        this.next_key = str;
    }

    public /* synthetic */ SportCategoryKey(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 100 : i, (i2 & 2) != 0 ? null : str);
    }
}
