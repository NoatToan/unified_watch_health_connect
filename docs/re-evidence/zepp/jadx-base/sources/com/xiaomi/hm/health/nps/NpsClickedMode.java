package com.xiaomi.hm.health.nps;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0006\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/nps/NpsClickedMode;", "", "", "component1", "", "component2", "code", "hasClicked", "copy", "toString", "", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "b", "Z", "getHasClicked", "()Z", "setHasClicked", "(Z)V", "<init>", "(Ljava/lang/String;Z)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class NpsClickedMode {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("nps_device_id")
    @NotNull
    private final String code;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("has_clicked")
    private boolean hasClicked;

    public NpsClickedMode(@NotNull String str, boolean z) {
        this.code = str;
        this.hasClicked = z;
    }

    public static /* synthetic */ NpsClickedMode copy$default(NpsClickedMode npsClickedMode, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = npsClickedMode.code;
        }
        if ((i & 2) != 0) {
            z = npsClickedMode.hasClicked;
        }
        return npsClickedMode.copy(str, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getHasClicked() {
        return this.hasClicked;
    }

    @NotNull
    public final NpsClickedMode copy(@NotNull String code, boolean hasClicked) {
        return new NpsClickedMode(code, hasClicked);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NpsClickedMode)) {
            return false;
        }
        NpsClickedMode npsClickedMode = (NpsClickedMode) other;
        return Intrinsics.areEqual(this.code, npsClickedMode.code) && this.hasClicked == npsClickedMode.hasClicked;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    public final boolean getHasClicked() {
        return this.hasClicked;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.code.hashCode() * 31;
        boolean z = this.hasClicked;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final void setHasClicked(boolean z) {
        this.hasClicked = z;
    }

    @NotNull
    public String toString() {
        return "NpsClickedMode(code=" + this.code + ", hasClicked=" + this.hasClicked + ")";
    }
}
