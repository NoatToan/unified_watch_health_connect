package defpackage;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: bu, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\u0013"}, d2 = {"Lbu;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lau;", "code", "", "freeSize", "count", "", "Ldu;", "clearItems", "<init>", "(Lau;Ljava/lang/Long;Ljava/lang/Integer;Ljava/util/List;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class StorageResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    @NotNull
    public final au code;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @Nullable
    public final Long freeSize;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public final Integer count;

    /* JADX INFO: renamed from: d, reason: from toString */
    @Nullable
    public final List<StorageType> clearItems;

    public StorageResult(@NotNull au code, @Nullable Long l, @Nullable Integer num, @Nullable List<StorageType> list) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.code = code;
        this.freeSize = l;
        this.count = num;
        this.clearItems = list;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StorageResult)) {
            return false;
        }
        StorageResult storageResult = (StorageResult) other;
        return this.code == storageResult.code && Intrinsics.areEqual(this.freeSize, storageResult.freeSize) && Intrinsics.areEqual(this.count, storageResult.count) && Intrinsics.areEqual(this.clearItems, storageResult.clearItems);
    }

    public int hashCode() {
        int iHashCode = this.code.hashCode() * 31;
        Long l = this.freeSize;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.count;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List<StorageType> list = this.clearItems;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "StorageResult(code=" + this.code + ", freeSize=" + this.freeSize + ", count=" + this.count + ", clearItems=" + this.clearItems + ')';
    }

    public /* synthetic */ StorageResult(au auVar, Long l, Integer num, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(auVar, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : list);
    }
}
