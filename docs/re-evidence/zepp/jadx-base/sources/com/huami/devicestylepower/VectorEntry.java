package com.huami.devicestylepower;

import androidx.annotation.ColorInt;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.huami.devicestylepower.a, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0082\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\n\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/huami/devicestylepower/a;", "", "", "a", "", "b", "", "c", "pathName", "pathColor", "fullColor", GoogleApiAvailabilityLight.a, "toString", "hashCode", "other", "equals", "Ljava/lang/String;", "h", "()Ljava/lang/String;", LogUtil.I, "g", "()I", "Z", "f", "()Z", "<init>", "(Ljava/lang/String;IZ)V", "deviceStylePower_release"}, k = 1, mv = {1, 5, 1})
final /* data */ class VectorEntry {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String pathName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int pathColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final boolean fullColor;

    public VectorEntry(@NotNull String str, @ColorInt int i, boolean z) {
        this.pathName = str;
        this.pathColor = i;
        this.fullColor = z;
    }

    public static /* synthetic */ VectorEntry e(VectorEntry vectorEntry, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = vectorEntry.pathName;
        }
        if ((i2 & 2) != 0) {
            i = vectorEntry.pathColor;
        }
        if ((i2 & 4) != 0) {
            z = vectorEntry.fullColor;
        }
        return vectorEntry.d(str, i, z);
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getPathName() {
        return this.pathName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getPathColor() {
        return this.pathColor;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getFullColor() {
        return this.fullColor;
    }

    @NotNull
    public final VectorEntry d(@NotNull String pathName, @ColorInt int pathColor, boolean fullColor) {
        return new VectorEntry(pathName, pathColor, fullColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VectorEntry)) {
            return false;
        }
        VectorEntry vectorEntry = (VectorEntry) other;
        return Intrinsics.areEqual(this.pathName, vectorEntry.pathName) && this.pathColor == vectorEntry.pathColor && this.fullColor == vectorEntry.fullColor;
    }

    public final boolean f() {
        return this.fullColor;
    }

    public final int g() {
        return this.pathColor;
    }

    @NotNull
    public final String h() {
        return this.pathName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public int hashCode() {
        int iHashCode = ((this.pathName.hashCode() * 31) + this.pathColor) * 31;
        boolean z = this.fullColor;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    @NotNull
    public String toString() {
        return "VectorEntry(pathName=" + this.pathName + ", pathColor=" + this.pathColor + ", fullColor=" + this.fullColor + ')';
    }
}
