package com.huami.treadmill.data;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@TypeConverters({TupleConverters.class, ExtraConverters.class})
@Entity(tableName = "tdlines")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001Bs\b\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\n\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\r\u0012\b\b\u0002\u0010\u0019\u001a\u00020\r¢\u0006\u0004\b@\u0010AJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\f\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\t\u0010\u000f\u001a\u00020\rHÆ\u0003Js\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\rHÆ\u0001J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010%\u001a\u0004\b*\u0010'\"\u0004\b+\u0010)R\"\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010%\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)R\"\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010%\u001a\u0004\b.\u0010'\"\u0004\b/\u0010)R$\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010%\u001a\u0004\b0\u0010'\"\u0004\b1\u0010)R\"\u0010\u0016\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010 \u001a\u0004\b7\u0010\"\"\u0004\b8\u0010$R\"\u0010\u0018\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010\u0019\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u00109\u001a\u0004\b>\u0010;\"\u0004\b?\u0010=¨\u0006B"}, d2 = {"Lcom/huami/treadmill/data/TdLine;", "", "", "component1", "", "component2", "component3", "component4", "component5", "component6", "", "component7", "component8", "", "component9", "component10", "index", "runLineIcon", "runLineDetailIcon", "runLineTitle", "runLineIntroduction", "runLineArea", "runLineDis", "runLineMan", "runLineId", "runLineTime", "copy", "toString", "hashCode", "other", "", "equals", LogUtil.I, "getIndex", "()I", "setIndex", "(I)V", "Ljava/lang/String;", "getRunLineIcon", "()Ljava/lang/String;", "setRunLineIcon", "(Ljava/lang/String;)V", "getRunLineDetailIcon", "setRunLineDetailIcon", "getRunLineTitle", "setRunLineTitle", "getRunLineIntroduction", "setRunLineIntroduction", "getRunLineArea", "setRunLineArea", "F", "getRunLineDis", "()F", "setRunLineDis", "(F)V", "getRunLineMan", "setRunLineMan", "J", "getRunLineId", "()J", "setRunLineId", "(J)V", "getRunLineTime", "setRunLineTime", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FIJJ)V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class TdLine {
    private int index;

    @SerializedName("extra")
    @Nullable
    private String runLineArea;

    @SerializedName("detailsPageIllustrated")
    @Nullable
    private String runLineDetailIcon;

    @SerializedName("distance")
    private float runLineDis;

    @SerializedName("recommendedPageIllustrated")
    @Nullable
    private String runLineIcon;

    @SerializedName("id")
    @PrimaryKey(autoGenerate = false)
    private long runLineId;

    @SerializedName("introduction")
    @NotNull
    private String runLineIntroduction;

    @SerializedName("participantNumber")
    private int runLineMan;

    @SerializedName(ParamKey.createTime)
    private long runLineTime;

    @SerializedName("name")
    @NotNull
    private String runLineTitle;

    @JvmOverloads
    public TdLine() {
        this(0, null, null, null, null, null, 0.0f, 0, 0L, 0L, 1023, null);
    }

    @JvmOverloads
    public TdLine(int i) {
        this(i, null, null, null, null, null, 0.0f, 0, 0L, 0L, 1022, null);
    }

    @JvmOverloads
    public TdLine(int i, @Nullable String str) {
        this(i, str, null, null, null, null, 0.0f, 0, 0L, 0L, 1020, null);
    }

    @JvmOverloads
    public TdLine(int i, @Nullable String str, @Nullable String str2) {
        this(i, str, str2, null, null, null, 0.0f, 0, 0L, 0L, 1016, null);
    }

    @JvmOverloads
    public TdLine(int i, @Nullable String str, @Nullable String str2, @NotNull String str3) {
        this(i, str, str2, str3, null, null, 0.0f, 0, 0L, 0L, 1008, null);
    }

    @JvmOverloads
    public TdLine(int i, @Nullable String str, @Nullable String str2, @NotNull String str3, @NotNull String str4) {
        this(i, str, str2, str3, str4, null, 0.0f, 0, 0L, 0L, 992, null);
    }

    @JvmOverloads
    public TdLine(int i, @Nullable String str, @Nullable String str2, @NotNull String str3, @NotNull String str4, @Nullable String str5) {
        this(i, str, str2, str3, str4, str5, 0.0f, 0, 0L, 0L, 960, null);
    }

    @JvmOverloads
    public TdLine(int i, @Nullable String str, @Nullable String str2, @NotNull String str3, @NotNull String str4, @Nullable String str5, float f) {
        this(i, str, str2, str3, str4, str5, f, 0, 0L, 0L, 896, null);
    }

    @JvmOverloads
    public TdLine(int i, @Nullable String str, @Nullable String str2, @NotNull String str3, @NotNull String str4, @Nullable String str5, float f, int i2) {
        this(i, str, str2, str3, str4, str5, f, i2, 0L, 0L, 768, null);
    }

    @JvmOverloads
    public TdLine(int i, @Nullable String str, @Nullable String str2, @NotNull String str3, @NotNull String str4, @Nullable String str5, float f, int i2, long j) {
        this(i, str, str2, str3, str4, str5, f, i2, j, 0L, 512, null);
    }

    @JvmOverloads
    public TdLine(int i, @Nullable String str, @Nullable String str2, @NotNull String str3, @NotNull String str4, @Nullable String str5, float f, int i2, long j, long j2) {
        this.index = i;
        this.runLineIcon = str;
        this.runLineDetailIcon = str2;
        this.runLineTitle = str3;
        this.runLineIntroduction = str4;
        this.runLineArea = str5;
        this.runLineDis = f;
        this.runLineMan = i2;
        this.runLineId = j;
        this.runLineTime = j2;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getRunLineTime() {
        return this.runLineTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRunLineIcon() {
        return this.runLineIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRunLineDetailIcon() {
        return this.runLineDetailIcon;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRunLineTitle() {
        return this.runLineTitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRunLineIntroduction() {
        return this.runLineIntroduction;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getRunLineArea() {
        return this.runLineArea;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final float getRunLineDis() {
        return this.runLineDis;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getRunLineMan() {
        return this.runLineMan;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getRunLineId() {
        return this.runLineId;
    }

    @NotNull
    public final TdLine copy(int index, @Nullable String runLineIcon, @Nullable String runLineDetailIcon, @NotNull String runLineTitle, @NotNull String runLineIntroduction, @Nullable String runLineArea, float runLineDis, int runLineMan, long runLineId, long runLineTime) {
        return new TdLine(index, runLineIcon, runLineDetailIcon, runLineTitle, runLineIntroduction, runLineArea, runLineDis, runLineMan, runLineId, runLineTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TdLine)) {
            return false;
        }
        TdLine tdLine = (TdLine) other;
        return this.index == tdLine.index && Intrinsics.areEqual(this.runLineIcon, tdLine.runLineIcon) && Intrinsics.areEqual(this.runLineDetailIcon, tdLine.runLineDetailIcon) && Intrinsics.areEqual(this.runLineTitle, tdLine.runLineTitle) && Intrinsics.areEqual(this.runLineIntroduction, tdLine.runLineIntroduction) && Intrinsics.areEqual(this.runLineArea, tdLine.runLineArea) && Intrinsics.areEqual((Object) Float.valueOf(this.runLineDis), (Object) Float.valueOf(tdLine.runLineDis)) && this.runLineMan == tdLine.runLineMan && this.runLineId == tdLine.runLineId && this.runLineTime == tdLine.runLineTime;
    }

    public final int getIndex() {
        return this.index;
    }

    @Nullable
    public final String getRunLineArea() {
        return this.runLineArea;
    }

    @Nullable
    public final String getRunLineDetailIcon() {
        return this.runLineDetailIcon;
    }

    public final float getRunLineDis() {
        return this.runLineDis;
    }

    @Nullable
    public final String getRunLineIcon() {
        return this.runLineIcon;
    }

    public final long getRunLineId() {
        return this.runLineId;
    }

    @NotNull
    public final String getRunLineIntroduction() {
        return this.runLineIntroduction;
    }

    public final int getRunLineMan() {
        return this.runLineMan;
    }

    public final long getRunLineTime() {
        return this.runLineTime;
    }

    @NotNull
    public final String getRunLineTitle() {
        return this.runLineTitle;
    }

    public int hashCode() {
        int i = this.index * 31;
        String str = this.runLineIcon;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.runLineDetailIcon;
        int iHashCode2 = (((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.runLineTitle.hashCode()) * 31) + this.runLineIntroduction.hashCode()) * 31;
        String str3 = this.runLineArea;
        return ((((((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Float.floatToIntBits(this.runLineDis)) * 31) + this.runLineMan) * 31) + b.a(this.runLineId)) * 31) + b.a(this.runLineTime);
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public final void setRunLineArea(@Nullable String str) {
        this.runLineArea = str;
    }

    public final void setRunLineDetailIcon(@Nullable String str) {
        this.runLineDetailIcon = str;
    }

    public final void setRunLineDis(float f) {
        this.runLineDis = f;
    }

    public final void setRunLineIcon(@Nullable String str) {
        this.runLineIcon = str;
    }

    public final void setRunLineId(long j) {
        this.runLineId = j;
    }

    public final void setRunLineIntroduction(@NotNull String str) {
        this.runLineIntroduction = str;
    }

    public final void setRunLineMan(int i) {
        this.runLineMan = i;
    }

    public final void setRunLineTime(long j) {
        this.runLineTime = j;
    }

    public final void setRunLineTitle(@NotNull String str) {
        this.runLineTitle = str;
    }

    @NotNull
    public String toString() {
        return "TdLine(index=" + this.index + ", runLineIcon=" + ((Object) this.runLineIcon) + ", runLineDetailIcon=" + ((Object) this.runLineDetailIcon) + ", runLineTitle=" + this.runLineTitle + ", runLineIntroduction=" + this.runLineIntroduction + ", runLineArea=" + ((Object) this.runLineArea) + ", runLineDis=" + this.runLineDis + ", runLineMan=" + this.runLineMan + ", runLineId=" + this.runLineId + ", runLineTime=" + this.runLineTime + ')';
    }

    public /* synthetic */ TdLine(int i, String str, String str2, String str3, String str4, String str5, float f, int i2, long j, long j2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? null : str2, (i3 & 8) != 0 ? "" : str3, (i3 & 16) == 0 ? str4 : "", (i3 & 32) == 0 ? str5 : null, (i3 & 64) != 0 ? 0.0f : f, (i3 & 128) == 0 ? i2 : 0, (i3 & 256) != 0 ? 0L : j, (i3 & 512) == 0 ? j2 : 0L);
    }
}
