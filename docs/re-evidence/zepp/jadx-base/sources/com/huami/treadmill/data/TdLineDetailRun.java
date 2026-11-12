package com.huami.treadmill.data;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001Bs\b\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b4\u00105J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003Js\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0017\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0018\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R$\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b'\u0010\u001e\"\u0004\b(\u0010 R$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b)\u0010\u001e\"\u0004\b*\u0010 R$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u001c\u001a\u0004\b+\u0010\u001e\"\u0004\b,\u0010 R$\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u001c\u001a\u0004\b-\u0010\u001e\"\u0004\b.\u0010 R\"\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u00066"}, d2 = {"Lcom/huami/treadmill/data/TdLineDetailRun;", "", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "", "component9", "lineDetailRunLongitudeLatitude", "lineDetailRunAltitude", "lineDetailRunPace", "lineDetailRunFlag", "lineDetailRunTime", "lineDetailRunDistance", "lineDetailRunTrackId", "lineDetailRunSource", "lineDetailRunVersion", "copy", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getLineDetailRunLongitudeLatitude", "()Ljava/lang/String;", "setLineDetailRunLongitudeLatitude", "(Ljava/lang/String;)V", "getLineDetailRunAltitude", "setLineDetailRunAltitude", "getLineDetailRunPace", "setLineDetailRunPace", "getLineDetailRunFlag", "setLineDetailRunFlag", "getLineDetailRunTime", "setLineDetailRunTime", "getLineDetailRunDistance", "setLineDetailRunDistance", "getLineDetailRunTrackId", "setLineDetailRunTrackId", "getLineDetailRunSource", "setLineDetailRunSource", LogUtil.I, "getLineDetailRunVersion", "()I", "setLineDetailRunVersion", "(I)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class TdLineDetailRun {

    @SerializedName("altitude")
    @Nullable
    private String lineDetailRunAltitude;

    @SerializedName("distance")
    @Nullable
    private String lineDetailRunDistance;

    @SerializedName("flag")
    @Nullable
    private String lineDetailRunFlag;

    @SerializedName("longitude_latitude")
    @Nullable
    private String lineDetailRunLongitudeLatitude;

    @SerializedName("pace")
    @Nullable
    private String lineDetailRunPace;

    @SerializedName("source")
    @Nullable
    private String lineDetailRunSource;

    @SerializedName("time")
    @Nullable
    private String lineDetailRunTime;

    @SerializedName("trackid")
    @Nullable
    private String lineDetailRunTrackId;

    @SerializedName("version")
    private int lineDetailRunVersion;

    @JvmOverloads
    public TdLineDetailRun() {
        this(null, null, null, null, null, null, null, null, 0, 511, null);
    }

    @JvmOverloads
    public TdLineDetailRun(@Nullable String str) {
        this(str, null, null, null, null, null, null, null, 0, 510, null);
    }

    @JvmOverloads
    public TdLineDetailRun(@Nullable String str, @Nullable String str2) {
        this(str, str2, null, null, null, null, null, null, 0, TypedValues.PositionType.TYPE_CURVE_FIT, null);
    }

    @JvmOverloads
    public TdLineDetailRun(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this(str, str2, str3, null, null, null, null, null, 0, 504, null);
    }

    @JvmOverloads
    public TdLineDetailRun(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this(str, str2, str3, str4, null, null, null, null, 0, 496, null);
    }

    @JvmOverloads
    public TdLineDetailRun(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this(str, str2, str3, str4, str5, null, null, null, 0, 480, null);
    }

    @JvmOverloads
    public TdLineDetailRun(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this(str, str2, str3, str4, str5, str6, null, null, 0, 448, null);
    }

    @JvmOverloads
    public TdLineDetailRun(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this(str, str2, str3, str4, str5, str6, str7, null, 0, 384, null);
    }

    @JvmOverloads
    public TdLineDetailRun(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        this(str, str2, str3, str4, str5, str6, str7, str8, 0, 256, null);
    }

    @JvmOverloads
    public TdLineDetailRun(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, int i) {
        this.lineDetailRunLongitudeLatitude = str;
        this.lineDetailRunAltitude = str2;
        this.lineDetailRunPace = str3;
        this.lineDetailRunFlag = str4;
        this.lineDetailRunTime = str5;
        this.lineDetailRunDistance = str6;
        this.lineDetailRunTrackId = str7;
        this.lineDetailRunSource = str8;
        this.lineDetailRunVersion = i;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLineDetailRunLongitudeLatitude() {
        return this.lineDetailRunLongitudeLatitude;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLineDetailRunAltitude() {
        return this.lineDetailRunAltitude;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLineDetailRunPace() {
        return this.lineDetailRunPace;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLineDetailRunFlag() {
        return this.lineDetailRunFlag;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLineDetailRunTime() {
        return this.lineDetailRunTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLineDetailRunDistance() {
        return this.lineDetailRunDistance;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLineDetailRunTrackId() {
        return this.lineDetailRunTrackId;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getLineDetailRunSource() {
        return this.lineDetailRunSource;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getLineDetailRunVersion() {
        return this.lineDetailRunVersion;
    }

    @NotNull
    public final TdLineDetailRun copy(@Nullable String lineDetailRunLongitudeLatitude, @Nullable String lineDetailRunAltitude, @Nullable String lineDetailRunPace, @Nullable String lineDetailRunFlag, @Nullable String lineDetailRunTime, @Nullable String lineDetailRunDistance, @Nullable String lineDetailRunTrackId, @Nullable String lineDetailRunSource, int lineDetailRunVersion) {
        return new TdLineDetailRun(lineDetailRunLongitudeLatitude, lineDetailRunAltitude, lineDetailRunPace, lineDetailRunFlag, lineDetailRunTime, lineDetailRunDistance, lineDetailRunTrackId, lineDetailRunSource, lineDetailRunVersion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TdLineDetailRun)) {
            return false;
        }
        TdLineDetailRun tdLineDetailRun = (TdLineDetailRun) other;
        return Intrinsics.areEqual(this.lineDetailRunLongitudeLatitude, tdLineDetailRun.lineDetailRunLongitudeLatitude) && Intrinsics.areEqual(this.lineDetailRunAltitude, tdLineDetailRun.lineDetailRunAltitude) && Intrinsics.areEqual(this.lineDetailRunPace, tdLineDetailRun.lineDetailRunPace) && Intrinsics.areEqual(this.lineDetailRunFlag, tdLineDetailRun.lineDetailRunFlag) && Intrinsics.areEqual(this.lineDetailRunTime, tdLineDetailRun.lineDetailRunTime) && Intrinsics.areEqual(this.lineDetailRunDistance, tdLineDetailRun.lineDetailRunDistance) && Intrinsics.areEqual(this.lineDetailRunTrackId, tdLineDetailRun.lineDetailRunTrackId) && Intrinsics.areEqual(this.lineDetailRunSource, tdLineDetailRun.lineDetailRunSource) && this.lineDetailRunVersion == tdLineDetailRun.lineDetailRunVersion;
    }

    @Nullable
    public final String getLineDetailRunAltitude() {
        return this.lineDetailRunAltitude;
    }

    @Nullable
    public final String getLineDetailRunDistance() {
        return this.lineDetailRunDistance;
    }

    @Nullable
    public final String getLineDetailRunFlag() {
        return this.lineDetailRunFlag;
    }

    @Nullable
    public final String getLineDetailRunLongitudeLatitude() {
        return this.lineDetailRunLongitudeLatitude;
    }

    @Nullable
    public final String getLineDetailRunPace() {
        return this.lineDetailRunPace;
    }

    @Nullable
    public final String getLineDetailRunSource() {
        return this.lineDetailRunSource;
    }

    @Nullable
    public final String getLineDetailRunTime() {
        return this.lineDetailRunTime;
    }

    @Nullable
    public final String getLineDetailRunTrackId() {
        return this.lineDetailRunTrackId;
    }

    public final int getLineDetailRunVersion() {
        return this.lineDetailRunVersion;
    }

    public int hashCode() {
        String str = this.lineDetailRunLongitudeLatitude;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lineDetailRunAltitude;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lineDetailRunPace;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.lineDetailRunFlag;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.lineDetailRunTime;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.lineDetailRunDistance;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.lineDetailRunTrackId;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.lineDetailRunSource;
        return ((iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31) + this.lineDetailRunVersion;
    }

    public final void setLineDetailRunAltitude(@Nullable String str) {
        this.lineDetailRunAltitude = str;
    }

    public final void setLineDetailRunDistance(@Nullable String str) {
        this.lineDetailRunDistance = str;
    }

    public final void setLineDetailRunFlag(@Nullable String str) {
        this.lineDetailRunFlag = str;
    }

    public final void setLineDetailRunLongitudeLatitude(@Nullable String str) {
        this.lineDetailRunLongitudeLatitude = str;
    }

    public final void setLineDetailRunPace(@Nullable String str) {
        this.lineDetailRunPace = str;
    }

    public final void setLineDetailRunSource(@Nullable String str) {
        this.lineDetailRunSource = str;
    }

    public final void setLineDetailRunTime(@Nullable String str) {
        this.lineDetailRunTime = str;
    }

    public final void setLineDetailRunTrackId(@Nullable String str) {
        this.lineDetailRunTrackId = str;
    }

    public final void setLineDetailRunVersion(int i) {
        this.lineDetailRunVersion = i;
    }

    @NotNull
    public String toString() {
        return "TdLineDetailRun(lineDetailRunLongitudeLatitude=" + ((Object) this.lineDetailRunLongitudeLatitude) + ", lineDetailRunAltitude=" + ((Object) this.lineDetailRunAltitude) + ", lineDetailRunPace=" + ((Object) this.lineDetailRunPace) + ", lineDetailRunFlag=" + ((Object) this.lineDetailRunFlag) + ", lineDetailRunTime=" + ((Object) this.lineDetailRunTime) + ", lineDetailRunDistance=" + ((Object) this.lineDetailRunDistance) + ", lineDetailRunTrackId=" + ((Object) this.lineDetailRunTrackId) + ", lineDetailRunSource=" + ((Object) this.lineDetailRunSource) + ", lineDetailRunVersion=" + this.lineDetailRunVersion + ')';
    }

    public /* synthetic */ TdLineDetailRun(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : str5, (i2 & 32) != 0 ? null : str6, (i2 & 64) != 0 ? null : str7, (i2 & 128) == 0 ? str8 : null, (i2 & 256) != 0 ? 0 : i);
    }
}
