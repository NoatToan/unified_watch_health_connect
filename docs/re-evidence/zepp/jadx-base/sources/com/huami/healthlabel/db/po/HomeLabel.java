package com.huami.healthlabel.db.po;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Entity(tableName = "home_label")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b$\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b+\u0010,J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003JE\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\f\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\r\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u000e\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u000f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010\u0018\u001a\u0004\b$\u0010\u001aR\u0019\u0010\u0010\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0011\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010\u0018\u001a\u0004\b*\u0010\u001a¨\u0006-"}, d2 = {"Lcom/huami/healthlabel/db/po/HomeLabel;", "", "", "component1", "", "component2", "", "component3", "component4", "", "component5", "component6", "labelText", "labelId", "showInHome", "labelColor", "sort", "reason", "copy", "toString", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getLabelText", "()Ljava/lang/String;", "b", LogUtil.I, "getLabelId", "()I", "c", "Z", "getShowInHome", "()Z", GoogleApiAvailabilityLight.a, "getLabelColor", "e", "J", "getSort", "()J", "f", "getReason", "<init>", "(Ljava/lang/String;IZLjava/lang/String;JLjava/lang/String;)V", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HomeLabel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @PrimaryKey
    @NotNull
    private final String labelText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int labelId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final boolean showInHome;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String labelColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final long sort;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    private final String reason;

    public HomeLabel(@NotNull String str, int i, boolean z, @NotNull String str2, long j, @NotNull String str3) {
        this.labelText = str;
        this.labelId = i;
        this.showInHome = z;
        this.labelColor = str2;
        this.sort = j;
        this.reason = str3;
    }

    public static /* synthetic */ HomeLabel copy$default(HomeLabel homeLabel, String str, int i, boolean z, String str2, long j, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = homeLabel.labelText;
        }
        if ((i2 & 2) != 0) {
            i = homeLabel.labelId;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            z = homeLabel.showInHome;
        }
        boolean z2 = z;
        if ((i2 & 8) != 0) {
            str2 = homeLabel.labelColor;
        }
        String str4 = str2;
        if ((i2 & 16) != 0) {
            j = homeLabel.sort;
        }
        long j2 = j;
        if ((i2 & 32) != 0) {
            str3 = homeLabel.reason;
        }
        return homeLabel.copy(str, i3, z2, str4, j2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLabelText() {
        return this.labelText;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLabelId() {
        return this.labelId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getShowInHome() {
        return this.showInHome;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLabelColor() {
        return this.labelColor;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getSort() {
        return this.sort;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    @NotNull
    public final HomeLabel copy(@NotNull String labelText, int labelId, boolean showInHome, @NotNull String labelColor, long sort, @NotNull String reason) {
        return new HomeLabel(labelText, labelId, showInHome, labelColor, sort, reason);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeLabel)) {
            return false;
        }
        HomeLabel homeLabel = (HomeLabel) other;
        return Intrinsics.areEqual(this.labelText, homeLabel.labelText) && this.labelId == homeLabel.labelId && this.showInHome == homeLabel.showInHome && Intrinsics.areEqual(this.labelColor, homeLabel.labelColor) && this.sort == homeLabel.sort && Intrinsics.areEqual(this.reason, homeLabel.reason);
    }

    @NotNull
    public final String getLabelColor() {
        return this.labelColor;
    }

    public final int getLabelId() {
        return this.labelId;
    }

    @NotNull
    public final String getLabelText() {
        return this.labelText;
    }

    @NotNull
    public final String getReason() {
        return this.reason;
    }

    public final boolean getShowInHome() {
        return this.showInHome;
    }

    public final long getSort() {
        return this.sort;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public int hashCode() {
        int iHashCode = ((this.labelText.hashCode() * 31) + this.labelId) * 31;
        boolean z = this.showInHome;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((((iHashCode + r1) * 31) + this.labelColor.hashCode()) * 31) + b.a(this.sort)) * 31) + this.reason.hashCode();
    }

    @NotNull
    public String toString() {
        return "HomeLabel(labelText=" + this.labelText + ", labelId=" + this.labelId + ", showInHome=" + this.showInHome + ", labelColor=" + this.labelColor + ", sort=" + this.sort + ", reason=" + this.reason + ")";
    }

    public /* synthetic */ HomeLabel(String str, int i, boolean z, String str2, long j, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? false : z, str2, j, (i2 & 32) != 0 ? "" : str3);
    }
}
