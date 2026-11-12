package com.xiaomi.fitness.route.track.ext;

import com.xiaomi.hm.health.dataprocess.StepsInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003Jm\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0010¨\u0006-"}, d2 = {"Lcom/xiaomi/fitness/route/track/ext/Report;", "", "name", "", "import", "duration", "durationDes", StepsInfo.KEY_DISTANCE, "disDes", "increase", "increaseDes", "decline", "declineDes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getImport", "getDuration", "getDurationDes", "getDis", "getDisDes", "getIncrease", "getIncreaseDes", "getDecline", "getDeclineDes", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Report {

    @NotNull
    private final String decline;

    @NotNull
    private final String declineDes;

    @NotNull
    private final String dis;

    @NotNull
    private final String disDes;

    @NotNull
    private final String duration;

    @NotNull
    private final String durationDes;

    @NotNull
    private final String import;

    @NotNull
    private final String increase;

    @NotNull
    private final String increaseDes;

    @NotNull
    private String name;

    public Report(@NotNull String name, @NotNull String str, @NotNull String duration, @NotNull String durationDes, @NotNull String dis, @NotNull String disDes, @NotNull String increase, @NotNull String increaseDes, @NotNull String decline, @NotNull String declineDes) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(str, "import");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(durationDes, "durationDes");
        Intrinsics.checkNotNullParameter(dis, "dis");
        Intrinsics.checkNotNullParameter(disDes, "disDes");
        Intrinsics.checkNotNullParameter(increase, "increase");
        Intrinsics.checkNotNullParameter(increaseDes, "increaseDes");
        Intrinsics.checkNotNullParameter(decline, "decline");
        Intrinsics.checkNotNullParameter(declineDes, "declineDes");
        this.name = name;
        this.import = str;
        this.duration = duration;
        this.durationDes = durationDes;
        this.dis = dis;
        this.disDes = disDes;
        this.increase = increase;
        this.increaseDes = increaseDes;
        this.decline = decline;
        this.declineDes = declineDes;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDeclineDes() {
        return this.declineDes;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getImport() {
        return this.import;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDurationDes() {
        return this.durationDes;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDis() {
        return this.dis;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDisDes() {
        return this.disDes;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getIncrease() {
        return this.increase;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getIncreaseDes() {
        return this.increaseDes;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDecline() {
        return this.decline;
    }

    @NotNull
    public final Report copy(@NotNull String name, @NotNull String str, @NotNull String duration, @NotNull String durationDes, @NotNull String dis, @NotNull String disDes, @NotNull String increase, @NotNull String increaseDes, @NotNull String decline, @NotNull String declineDes) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(str, "import");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(durationDes, "durationDes");
        Intrinsics.checkNotNullParameter(dis, "dis");
        Intrinsics.checkNotNullParameter(disDes, "disDes");
        Intrinsics.checkNotNullParameter(increase, "increase");
        Intrinsics.checkNotNullParameter(increaseDes, "increaseDes");
        Intrinsics.checkNotNullParameter(decline, "decline");
        Intrinsics.checkNotNullParameter(declineDes, "declineDes");
        return new Report(name, str, duration, durationDes, dis, disDes, increase, increaseDes, decline, declineDes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Report)) {
            return false;
        }
        Report report = (Report) other;
        return Intrinsics.areEqual(this.name, report.name) && Intrinsics.areEqual(this.import, report.import) && Intrinsics.areEqual(this.duration, report.duration) && Intrinsics.areEqual(this.durationDes, report.durationDes) && Intrinsics.areEqual(this.dis, report.dis) && Intrinsics.areEqual(this.disDes, report.disDes) && Intrinsics.areEqual(this.increase, report.increase) && Intrinsics.areEqual(this.increaseDes, report.increaseDes) && Intrinsics.areEqual(this.decline, report.decline) && Intrinsics.areEqual(this.declineDes, report.declineDes);
    }

    @NotNull
    public final String getDecline() {
        return this.decline;
    }

    @NotNull
    public final String getDeclineDes() {
        return this.declineDes;
    }

    @NotNull
    public final String getDis() {
        return this.dis;
    }

    @NotNull
    public final String getDisDes() {
        return this.disDes;
    }

    @NotNull
    public final String getDuration() {
        return this.duration;
    }

    @NotNull
    public final String getDurationDes() {
        return this.durationDes;
    }

    @NotNull
    public final String getImport() {
        return this.import;
    }

    @NotNull
    public final String getIncrease() {
        return this.increase;
    }

    @NotNull
    public final String getIncreaseDes() {
        return this.increaseDes;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((((((((((((((((this.name.hashCode() * 31) + this.import.hashCode()) * 31) + this.duration.hashCode()) * 31) + this.durationDes.hashCode()) * 31) + this.dis.hashCode()) * 31) + this.disDes.hashCode()) * 31) + this.increase.hashCode()) * 31) + this.increaseDes.hashCode()) * 31) + this.decline.hashCode()) * 31) + this.declineDes.hashCode();
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    @NotNull
    public String toString() {
        return "Report(name=" + this.name + ", import=" + this.import + ", duration=" + this.duration + ", durationDes=" + this.durationDes + ", dis=" + this.dis + ", disDes=" + this.disDes + ", increase=" + this.increase + ", increaseDes=" + this.increaseDes + ", decline=" + this.decline + ", declineDes=" + this.declineDes + ")";
    }
}
