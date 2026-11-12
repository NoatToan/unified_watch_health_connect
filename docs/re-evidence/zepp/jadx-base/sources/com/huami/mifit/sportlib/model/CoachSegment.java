package com.huami.mifit.sportlib.model;

import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0001&B;\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b$\u0010%J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J=\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\"\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0019\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR\"\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0019\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001d¨\u0006'"}, d2 = {"Lcom/huami/mifit/sportlib/model/CoachSegment;", "", "", "component1", "", "component2", "component3", "component4", "component5", "name", "type", CoachSegment.MAX_HR, CoachSegment.AVG_HR, "sportType", "copy", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", LogUtil.I, "getType", "()I", "setType", "(I)V", "getMaxhr", "setMaxhr", "getAvghr", "setAvghr", "getSportType", "setSportType", "<init>", "(Ljava/lang/String;IIII)V", "Companion", "sportlib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class CoachSegment {

    @NotNull
    public static final String AVG_HR = "avghr";

    @NotNull
    public static final String MAX_HR = "maxhr";

    @NotNull
    public static final String NAME = "name";

    @NotNull
    public static final String SPORT_TYPE = "sportType";

    @NotNull
    public static final String TYPE = "type";
    private int avghr;
    private int maxhr;

    @Nullable
    private String name;
    private int sportType;
    private int type;

    public CoachSegment() {
        this(null, 0, 0, 0, 0, 31, null);
    }

    public CoachSegment(@Nullable String str, int i, int i2, int i3, int i4) {
        this.name = str;
        this.type = i;
        this.maxhr = i2;
        this.avghr = i3;
        this.sportType = i4;
    }

    public static /* synthetic */ CoachSegment copy$default(CoachSegment coachSegment, String str, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = coachSegment.name;
        }
        if ((i5 & 2) != 0) {
            i = coachSegment.type;
        }
        int i6 = i;
        if ((i5 & 4) != 0) {
            i2 = coachSegment.maxhr;
        }
        int i7 = i2;
        if ((i5 & 8) != 0) {
            i3 = coachSegment.avghr;
        }
        int i8 = i3;
        if ((i5 & 16) != 0) {
            i4 = coachSegment.sportType;
        }
        return coachSegment.copy(str, i6, i7, i8, i4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMaxhr() {
        return this.maxhr;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getAvghr() {
        return this.avghr;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getSportType() {
        return this.sportType;
    }

    @NotNull
    public final CoachSegment copy(@Nullable String name, int type, int maxhr, int avghr, int sportType) {
        return new CoachSegment(name, type, maxhr, avghr, sportType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoachSegment)) {
            return false;
        }
        CoachSegment coachSegment = (CoachSegment) other;
        return Intrinsics.areEqual(this.name, coachSegment.name) && this.type == coachSegment.type && this.maxhr == coachSegment.maxhr && this.avghr == coachSegment.avghr && this.sportType == coachSegment.sportType;
    }

    public final int getAvghr() {
        return this.avghr;
    }

    public final int getMaxhr() {
        return this.maxhr;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final int getSportType() {
        return this.sportType;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.name;
        return ((((((((str == null ? 0 : str.hashCode()) * 31) + this.type) * 31) + this.maxhr) * 31) + this.avghr) * 31) + this.sportType;
    }

    public final void setAvghr(int i) {
        this.avghr = i;
    }

    public final void setMaxhr(int i) {
        this.maxhr = i;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setSportType(int i) {
        this.sportType = i;
    }

    public final void setType(int i) {
        this.type = i;
    }

    @NotNull
    public String toString() {
        return "CoachSegment(name=" + this.name + ", type=" + this.type + ", maxhr=" + this.maxhr + ", avghr=" + this.avghr + ", sportType=" + this.sportType + ")";
    }

    public /* synthetic */ CoachSegment(String str, int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? null : str, (i5 & 2) != 0 ? 0 : i, (i5 & 4) != 0 ? 0 : i2, (i5 & 8) != 0 ? 0 : i3, (i5 & 16) == 0 ? i4 : 0);
    }
}
