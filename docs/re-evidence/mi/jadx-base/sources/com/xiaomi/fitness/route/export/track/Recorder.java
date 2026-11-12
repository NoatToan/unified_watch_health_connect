package com.xiaomi.fitness.route.export.track;

import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b[\b\u0086\b\u0018\u00002\u00020\u0001B»\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d\u0012\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001d\u0012\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u001d\u0012\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d\u0012\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d\u0012\u0006\u0010%\u001a\u00020\u000b\u0012\u0006\u0010&\u001a\u00020\u000b\u0012\b\b\u0002\u0010'\u001a\u00020\u000b¢\u0006\u0004\b(\u0010)J\t\u0010\\\u001a\u00020\u0003HÆ\u0003J\t\u0010]\u001a\u00020\u0005HÆ\u0003J\t\u0010^\u001a\u00020\u0007HÆ\u0003J\t\u0010_\u001a\u00020\tHÆ\u0003J\t\u0010`\u001a\u00020\u000bHÆ\u0003J\t\u0010a\u001a\u00020\tHÆ\u0003J\t\u0010b\u001a\u00020\u000bHÆ\u0003J\t\u0010c\u001a\u00020\u0007HÆ\u0003J\t\u0010d\u001a\u00020\u0007HÆ\u0003J\t\u0010e\u001a\u00020\u0007HÆ\u0003J\t\u0010f\u001a\u00020\u0007HÆ\u0003J\t\u0010g\u001a\u00020\u0007HÆ\u0003J\t\u0010h\u001a\u00020\u0007HÆ\u0003J\t\u0010i\u001a\u00020\u0007HÆ\u0003J\t\u0010j\u001a\u00020\u0007HÆ\u0003J\t\u0010k\u001a\u00020\u0007HÆ\u0003J\t\u0010l\u001a\u00020\u0007HÆ\u0003J\t\u0010m\u001a\u00020\u0007HÆ\u0003J\t\u0010n\u001a\u00020\u001aHÆ\u0003J\t\u0010o\u001a\u00020\u001aHÆ\u0003J\u0011\u0010p\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dHÆ\u0003J\u0011\u0010q\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001dHÆ\u0003J\u0011\u0010r\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u001dHÆ\u0003J\u0011\u0010s\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dHÆ\u0003J\u0011\u0010t\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dHÆ\u0003J\t\u0010u\u001a\u00020\u000bHÆ\u0003J\t\u0010v\u001a\u00020\u000bHÆ\u0003J\t\u0010w\u001a\u00020\u000bHÆ\u0003JÉ\u0002\u0010x\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001d2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u001d2\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d2\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d2\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u0010&\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020\u000bHÆ\u0001J\u0013\u0010y\u001a\u00020\u00052\b\u0010z\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010{\u001a\u00020\u0007HÖ\u0001J\t\u0010|\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010,R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b5\u00100R\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b6\u00102R\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b7\u0010.R\u0011\u0010\u000f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b8\u0010.R\u001a\u0010\u0010\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010.\"\u0004\b:\u0010;R\u0011\u0010\u0011\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b<\u0010.R\u001a\u0010\u0012\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010.\"\u0004\b>\u0010;R\u001a\u0010\u0013\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010.\"\u0004\b@\u0010;R\u001a\u0010\u0014\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010.\"\u0004\bB\u0010;R\u001a\u0010\u0015\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010.\"\u0004\bD\u0010;R\u001a\u0010\u0016\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010.\"\u0004\bF\u0010;R\u001a\u0010\u0017\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010.\"\u0004\bH\u0010;R\u0011\u0010\u0018\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bI\u0010.R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001a\u0010\u001b\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010K\"\u0004\bO\u0010MR\u0019\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\"\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010Q\"\u0004\bS\u0010TR\"\u0010!\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010Q\"\u0004\bV\u0010TR\u0019\u0010#\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\bW\u0010QR\u0019\u0010$\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\bX\u0010QR\u0011\u0010%\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bY\u00102R\u0011\u0010&\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bZ\u00102R\u0011\u0010'\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b[\u00102¨\u0006}"}, d2 = {"Lcom/xiaomi/fitness/route/export/track/Recorder;", "", "headValid", "", "isEleEnable", "", "version", "", "name", "", "nameStr", "", "md5", "md5Str", StepsInfo.KEY_DISTANCE, "locationCount", "passPoint", "turnPoint", "minLongitude", "minLatitude", "maxLongitude", "maxLatitude", FitnessReportKey.minAltitude, FitnessReportKey.maxAltitude, "aveAltitude", "cumulativeIncrease", "", "cumulativeDecrease", "pointList", "", "Lcom/xiaomi/fitness/route/export/track/RecorderPoint;", "wptList", "Lcom/xiaomi/fitness/route/export/track/WptRecorderPoint;", "segmentList", "Lcom/xiaomi/fitness/route/export/track/SegmentRecorderPoint;", "originalPointList", "segmentPointList", "filePath", "fileExtension", "duration", "<init>", "(BZI[BLjava/lang/String;[BLjava/lang/String;IIIIIIIIIIIDDLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHeadValid", "()B", "()Z", "getVersion", "()I", "getName", "()[B", "getNameStr", "()Ljava/lang/String;", "setNameStr", "(Ljava/lang/String;)V", "getMd5", "getMd5Str", "getDis", "getLocationCount", "getPassPoint", "setPassPoint", "(I)V", "getTurnPoint", "getMinLongitude", "setMinLongitude", "getMinLatitude", "setMinLatitude", "getMaxLongitude", "setMaxLongitude", "getMaxLatitude", "setMaxLatitude", "getMinAltitude", "setMinAltitude", "getMaxAltitude", "setMaxAltitude", "getAveAltitude", "getCumulativeIncrease", "()D", "setCumulativeIncrease", "(D)V", "getCumulativeDecrease", "setCumulativeDecrease", "getPointList", "()Ljava/util/List;", "getWptList", "setWptList", "(Ljava/util/List;)V", "getSegmentList", "setSegmentList", "getOriginalPointList", "getSegmentPointList", "getFilePath", "getFileExtension", "getDuration", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "copy", "equals", "other", "hashCode", "toString", "route-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Recorder {
    private final int aveAltitude;
    private double cumulativeDecrease;
    private double cumulativeIncrease;
    private final int dis;

    @NotNull
    private final String duration;

    @NotNull
    private final String fileExtension;

    @NotNull
    private final String filePath;
    private final byte headValid;
    private final boolean isEleEnable;
    private final int locationCount;
    private int maxAltitude;
    private int maxLatitude;
    private int maxLongitude;

    @NotNull
    private final byte[] md5;

    @NotNull
    private final String md5Str;
    private int minAltitude;
    private int minLatitude;
    private int minLongitude;

    @NotNull
    private final byte[] name;

    @NotNull
    private String nameStr;

    @Nullable
    private final List<RecorderPoint> originalPointList;
    private int passPoint;

    @Nullable
    private final List<RecorderPoint> pointList;

    @Nullable
    private List<SegmentRecorderPoint> segmentList;

    @Nullable
    private final List<RecorderPoint> segmentPointList;
    private final int turnPoint;
    private final int version;

    @Nullable
    private List<WptRecorderPoint> wptList;

    public Recorder(byte b2, boolean z, int i, @NotNull byte[] name, @NotNull String nameStr, @NotNull byte[] md5, @NotNull String md5Str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, double d, double d2, @Nullable List<RecorderPoint> list, @Nullable List<WptRecorderPoint> list2, @Nullable List<SegmentRecorderPoint> list3, @Nullable List<RecorderPoint> list4, @Nullable List<RecorderPoint> list5, @NotNull String filePath, @NotNull String fileExtension, @NotNull String duration) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(nameStr, "nameStr");
        Intrinsics.checkNotNullParameter(md5, "md5");
        Intrinsics.checkNotNullParameter(md5Str, "md5Str");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(fileExtension, "fileExtension");
        Intrinsics.checkNotNullParameter(duration, "duration");
        this.headValid = b2;
        this.isEleEnable = z;
        this.version = i;
        this.name = name;
        this.nameStr = nameStr;
        this.md5 = md5;
        this.md5Str = md5Str;
        this.dis = i2;
        this.locationCount = i3;
        this.passPoint = i4;
        this.turnPoint = i5;
        this.minLongitude = i6;
        this.minLatitude = i7;
        this.maxLongitude = i8;
        this.maxLatitude = i9;
        this.minAltitude = i10;
        this.maxAltitude = i11;
        this.aveAltitude = i12;
        this.cumulativeIncrease = d;
        this.cumulativeDecrease = d2;
        this.pointList = list;
        this.wptList = list2;
        this.segmentList = list3;
        this.originalPointList = list4;
        this.segmentPointList = list5;
        this.filePath = filePath;
        this.fileExtension = fileExtension;
        this.duration = duration;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final byte getHeadValid() {
        return this.headValid;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getPassPoint() {
        return this.passPoint;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getTurnPoint() {
        return this.turnPoint;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getMinLongitude() {
        return this.minLongitude;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getMinLatitude() {
        return this.minLatitude;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getMaxLongitude() {
        return this.maxLongitude;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getMaxLatitude() {
        return this.maxLatitude;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getMinAltitude() {
        return this.minAltitude;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getMaxAltitude() {
        return this.maxAltitude;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getAveAltitude() {
        return this.aveAltitude;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final double getCumulativeIncrease() {
        return this.cumulativeIncrease;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsEleEnable() {
        return this.isEleEnable;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final double getCumulativeDecrease() {
        return this.cumulativeDecrease;
    }

    @Nullable
    public final List<RecorderPoint> component21() {
        return this.pointList;
    }

    @Nullable
    public final List<WptRecorderPoint> component22() {
        return this.wptList;
    }

    @Nullable
    public final List<SegmentRecorderPoint> component23() {
        return this.segmentList;
    }

    @Nullable
    public final List<RecorderPoint> component24() {
        return this.originalPointList;
    }

    @Nullable
    public final List<RecorderPoint> component25() {
        return this.segmentPointList;
    }

    @NotNull
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getFilePath() {
        return this.filePath;
    }

    @NotNull
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getFileExtension() {
        return this.fileExtension;
    }

    @NotNull
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final byte[] getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNameStr() {
        return this.nameStr;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final byte[] getMd5() {
        return this.md5;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMd5Str() {
        return this.md5Str;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getDis() {
        return this.dis;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getLocationCount() {
        return this.locationCount;
    }

    @NotNull
    public final Recorder copy(byte headValid, boolean isEleEnable, int version, @NotNull byte[] name, @NotNull String nameStr, @NotNull byte[] md5, @NotNull String md5Str, int dis, int locationCount, int passPoint, int turnPoint, int minLongitude, int minLatitude, int maxLongitude, int maxLatitude, int minAltitude, int maxAltitude, int aveAltitude, double cumulativeIncrease, double cumulativeDecrease, @Nullable List<RecorderPoint> pointList, @Nullable List<WptRecorderPoint> wptList, @Nullable List<SegmentRecorderPoint> segmentList, @Nullable List<RecorderPoint> originalPointList, @Nullable List<RecorderPoint> segmentPointList, @NotNull String filePath, @NotNull String fileExtension, @NotNull String duration) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(nameStr, "nameStr");
        Intrinsics.checkNotNullParameter(md5, "md5");
        Intrinsics.checkNotNullParameter(md5Str, "md5Str");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(fileExtension, "fileExtension");
        Intrinsics.checkNotNullParameter(duration, "duration");
        return new Recorder(headValid, isEleEnable, version, name, nameStr, md5, md5Str, dis, locationCount, passPoint, turnPoint, minLongitude, minLatitude, maxLongitude, maxLatitude, minAltitude, maxAltitude, aveAltitude, cumulativeIncrease, cumulativeDecrease, pointList, wptList, segmentList, originalPointList, segmentPointList, filePath, fileExtension, duration);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Recorder)) {
            return false;
        }
        Recorder recorder = (Recorder) other;
        return this.headValid == recorder.headValid && this.isEleEnable == recorder.isEleEnable && this.version == recorder.version && Intrinsics.areEqual(this.name, recorder.name) && Intrinsics.areEqual(this.nameStr, recorder.nameStr) && Intrinsics.areEqual(this.md5, recorder.md5) && Intrinsics.areEqual(this.md5Str, recorder.md5Str) && this.dis == recorder.dis && this.locationCount == recorder.locationCount && this.passPoint == recorder.passPoint && this.turnPoint == recorder.turnPoint && this.minLongitude == recorder.minLongitude && this.minLatitude == recorder.minLatitude && this.maxLongitude == recorder.maxLongitude && this.maxLatitude == recorder.maxLatitude && this.minAltitude == recorder.minAltitude && this.maxAltitude == recorder.maxAltitude && this.aveAltitude == recorder.aveAltitude && Double.compare(this.cumulativeIncrease, recorder.cumulativeIncrease) == 0 && Double.compare(this.cumulativeDecrease, recorder.cumulativeDecrease) == 0 && Intrinsics.areEqual(this.pointList, recorder.pointList) && Intrinsics.areEqual(this.wptList, recorder.wptList) && Intrinsics.areEqual(this.segmentList, recorder.segmentList) && Intrinsics.areEqual(this.originalPointList, recorder.originalPointList) && Intrinsics.areEqual(this.segmentPointList, recorder.segmentPointList) && Intrinsics.areEqual(this.filePath, recorder.filePath) && Intrinsics.areEqual(this.fileExtension, recorder.fileExtension) && Intrinsics.areEqual(this.duration, recorder.duration);
    }

    public final int getAveAltitude() {
        return this.aveAltitude;
    }

    public final double getCumulativeDecrease() {
        return this.cumulativeDecrease;
    }

    public final double getCumulativeIncrease() {
        return this.cumulativeIncrease;
    }

    public final int getDis() {
        return this.dis;
    }

    @NotNull
    public final String getDuration() {
        return this.duration;
    }

    @NotNull
    public final String getFileExtension() {
        return this.fileExtension;
    }

    @NotNull
    public final String getFilePath() {
        return this.filePath;
    }

    public final byte getHeadValid() {
        return this.headValid;
    }

    public final int getLocationCount() {
        return this.locationCount;
    }

    public final int getMaxAltitude() {
        return this.maxAltitude;
    }

    public final int getMaxLatitude() {
        return this.maxLatitude;
    }

    public final int getMaxLongitude() {
        return this.maxLongitude;
    }

    @NotNull
    public final byte[] getMd5() {
        return this.md5;
    }

    @NotNull
    public final String getMd5Str() {
        return this.md5Str;
    }

    public final int getMinAltitude() {
        return this.minAltitude;
    }

    public final int getMinLatitude() {
        return this.minLatitude;
    }

    public final int getMinLongitude() {
        return this.minLongitude;
    }

    @NotNull
    public final byte[] getName() {
        return this.name;
    }

    @NotNull
    public final String getNameStr() {
        return this.nameStr;
    }

    @Nullable
    public final List<RecorderPoint> getOriginalPointList() {
        return this.originalPointList;
    }

    public final int getPassPoint() {
        return this.passPoint;
    }

    @Nullable
    public final List<RecorderPoint> getPointList() {
        return this.pointList;
    }

    @Nullable
    public final List<SegmentRecorderPoint> getSegmentList() {
        return this.segmentList;
    }

    @Nullable
    public final List<RecorderPoint> getSegmentPointList() {
        return this.segmentPointList;
    }

    public final int getTurnPoint() {
        return this.turnPoint;
    }

    public final int getVersion() {
        return this.version;
    }

    @Nullable
    public final List<WptRecorderPoint> getWptList() {
        return this.wptList;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((((((((Byte.hashCode(this.headValid) * 31) + Boolean.hashCode(this.isEleEnable)) * 31) + Integer.hashCode(this.version)) * 31) + Arrays.hashCode(this.name)) * 31) + this.nameStr.hashCode()) * 31) + Arrays.hashCode(this.md5)) * 31) + this.md5Str.hashCode()) * 31) + Integer.hashCode(this.dis)) * 31) + Integer.hashCode(this.locationCount)) * 31) + Integer.hashCode(this.passPoint)) * 31) + Integer.hashCode(this.turnPoint)) * 31) + Integer.hashCode(this.minLongitude)) * 31) + Integer.hashCode(this.minLatitude)) * 31) + Integer.hashCode(this.maxLongitude)) * 31) + Integer.hashCode(this.maxLatitude)) * 31) + Integer.hashCode(this.minAltitude)) * 31) + Integer.hashCode(this.maxAltitude)) * 31) + Integer.hashCode(this.aveAltitude)) * 31) + Double.hashCode(this.cumulativeIncrease)) * 31) + Double.hashCode(this.cumulativeDecrease)) * 31;
        List<RecorderPoint> list = this.pointList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<WptRecorderPoint> list2 = this.wptList;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<SegmentRecorderPoint> list3 = this.segmentList;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<RecorderPoint> list4 = this.originalPointList;
        int iHashCode5 = (iHashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<RecorderPoint> list5 = this.segmentPointList;
        return ((((((iHashCode5 + (list5 != null ? list5.hashCode() : 0)) * 31) + this.filePath.hashCode()) * 31) + this.fileExtension.hashCode()) * 31) + this.duration.hashCode();
    }

    public final boolean isEleEnable() {
        return this.isEleEnable;
    }

    public final void setCumulativeDecrease(double d) {
        this.cumulativeDecrease = d;
    }

    public final void setCumulativeIncrease(double d) {
        this.cumulativeIncrease = d;
    }

    public final void setMaxAltitude(int i) {
        this.maxAltitude = i;
    }

    public final void setMaxLatitude(int i) {
        this.maxLatitude = i;
    }

    public final void setMaxLongitude(int i) {
        this.maxLongitude = i;
    }

    public final void setMinAltitude(int i) {
        this.minAltitude = i;
    }

    public final void setMinLatitude(int i) {
        this.minLatitude = i;
    }

    public final void setMinLongitude(int i) {
        this.minLongitude = i;
    }

    public final void setNameStr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nameStr = str;
    }

    public final void setPassPoint(int i) {
        this.passPoint = i;
    }

    public final void setSegmentList(@Nullable List<SegmentRecorderPoint> list) {
        this.segmentList = list;
    }

    public final void setWptList(@Nullable List<WptRecorderPoint> list) {
        this.wptList = list;
    }

    @NotNull
    public String toString() {
        byte b2 = this.headValid;
        return "Recorder(headValid=" + ((int) b2) + ", isEleEnable=" + this.isEleEnable + ", version=" + this.version + ", name=" + Arrays.toString(this.name) + ", nameStr=" + this.nameStr + ", md5=" + Arrays.toString(this.md5) + ", md5Str=" + this.md5Str + ", dis=" + this.dis + ", locationCount=" + this.locationCount + ", passPoint=" + this.passPoint + ", turnPoint=" + this.turnPoint + ", minLongitude=" + this.minLongitude + ", minLatitude=" + this.minLatitude + ", maxLongitude=" + this.maxLongitude + ", maxLatitude=" + this.maxLatitude + ", minAltitude=" + this.minAltitude + ", maxAltitude=" + this.maxAltitude + ", aveAltitude=" + this.aveAltitude + ", cumulativeIncrease=" + this.cumulativeIncrease + ", cumulativeDecrease=" + this.cumulativeDecrease + ", pointList=" + this.pointList + ", wptList=" + this.wptList + ", segmentList=" + this.segmentList + ", originalPointList=" + this.originalPointList + ", segmentPointList=" + this.segmentPointList + ", filePath=" + this.filePath + ", fileExtension=" + this.fileExtension + ", duration=" + this.duration + ")";
    }

    public /* synthetic */ Recorder(byte b2, boolean z, int i, byte[] bArr, String str, byte[] bArr2, String str2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, double d, double d2, List list, List list2, List list3, List list4, List list5, String str3, String str4, String str5, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? (byte) 55 : b2, (i13 & 2) != 0 ? true : z, (i13 & 4) != 0 ? 2 : i, bArr, str, bArr2, str2, (i13 & 128) != 0 ? 0 : i2, (i13 & 256) != 0 ? 0 : i3, (i13 & 512) != 0 ? 0 : i4, (i13 & 1024) != 0 ? 0 : i5, (i13 & 2048) != 0 ? 0 : i6, (i13 & 4096) != 0 ? 0 : i7, (i13 & 8192) != 0 ? 0 : i8, (i13 & 16384) != 0 ? 0 : i9, (32768 & i13) != 0 ? 0 : i10, (65536 & i13) != 0 ? 0 : i11, (131072 & i13) != 0 ? 0 : i12, (262144 & i13) != 0 ? 0.0d : d, (524288 & i13) != 0 ? 0.0d : d2, (1048576 & i13) != 0 ? null : list, (2097152 & i13) != 0 ? null : list2, (4194304 & i13) != 0 ? null : list3, (8388608 & i13) != 0 ? null : list4, (16777216 & i13) != 0 ? null : list5, str3, str4, (i13 & 134217728) != 0 ? "--" : str5);
    }
}
