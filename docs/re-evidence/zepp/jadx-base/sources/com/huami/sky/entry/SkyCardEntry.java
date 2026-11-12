package com.huami.sky.entry;

import com.facebook.internal.ServerProtocol;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J9\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001b\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/huami/sky/entry/SkyCardEntry;", "", "", "component1", "component2", "Lcom/huami/sky/entry/PopInfo;", "component3", "", "Lcom/huami/sky/entry/TagInfo;", "component4", ServerProtocol.DIALOG_PARAM_DISPLAY, "hasPop", "pop", "tags", "copy", "", "toString", "", "hashCode", "other", "equals", "Z", "getDisplay", "()Z", "getHasPop", "Lcom/huami/sky/entry/PopInfo;", "getPop", "()Lcom/huami/sky/entry/PopInfo;", "Ljava/util/List;", "getTags", "()Ljava/util/List;", "<init>", "(ZZLcom/huami/sky/entry/PopInfo;Ljava/util/List;)V", "sky-service_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SkyCardEntry {
    private final boolean display;
    private final boolean hasPop;

    @Nullable
    private final PopInfo pop;

    @NotNull
    private final List<TagInfo> tags;

    public SkyCardEntry(boolean z, boolean z2, @Nullable PopInfo popInfo, @NotNull List<TagInfo> list) {
        this.display = z;
        this.hasPop = z2;
        this.pop = popInfo;
        this.tags = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SkyCardEntry copy$default(SkyCardEntry skyCardEntry, boolean z, boolean z2, PopInfo popInfo, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = skyCardEntry.display;
        }
        if ((i & 2) != 0) {
            z2 = skyCardEntry.hasPop;
        }
        if ((i & 4) != 0) {
            popInfo = skyCardEntry.pop;
        }
        if ((i & 8) != 0) {
            list = skyCardEntry.tags;
        }
        return skyCardEntry.copy(z, z2, popInfo, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getDisplay() {
        return this.display;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getHasPop() {
        return this.hasPop;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PopInfo getPop() {
        return this.pop;
    }

    @NotNull
    public final List<TagInfo> component4() {
        return this.tags;
    }

    @NotNull
    public final SkyCardEntry copy(boolean display, boolean hasPop, @Nullable PopInfo pop, @NotNull List<TagInfo> tags) {
        return new SkyCardEntry(display, hasPop, pop, tags);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SkyCardEntry)) {
            return false;
        }
        SkyCardEntry skyCardEntry = (SkyCardEntry) other;
        return this.display == skyCardEntry.display && this.hasPop == skyCardEntry.hasPop && Intrinsics.areEqual(this.pop, skyCardEntry.pop) && Intrinsics.areEqual(this.tags, skyCardEntry.tags);
    }

    public final boolean getDisplay() {
        return this.display;
    }

    public final boolean getHasPop() {
        return this.hasPop;
    }

    @Nullable
    public final PopInfo getPop() {
        return this.pop;
    }

    @NotNull
    public final List<TagInfo> getTags() {
        return this.tags;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    public int hashCode() {
        boolean z = this.display;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.hasPop;
        int i2 = (i + (z2 ? 1 : z2)) * 31;
        PopInfo popInfo = this.pop;
        return ((i2 + (popInfo == null ? 0 : popInfo.hashCode())) * 31) + this.tags.hashCode();
    }

    @NotNull
    public String toString() {
        return "SkyCardEntry(display=" + this.display + ", hasPop=" + this.hasPop + ", pop=" + this.pop + ", tags=" + this.tags + ")";
    }
}
