package com.xiaomi.fitness.sport_manager_export.data;

import com.mi.fitness.netproxy.NetProxyComponentKt;
import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;
import com.xiaomi.fitness.sync.model.EventRecurrence;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\bi\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BÙ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u0006HÆ\u0003J\t\u0010X\u001a\u00020\u0006HÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\t\u0010[\u001a\u00020\u0003HÆ\u0003J\t\u0010\\\u001a\u00020\u0003HÆ\u0003J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\t\u0010^\u001a\u00020\u0003HÆ\u0003J\t\u0010_\u001a\u00020\u0003HÆ\u0003J\t\u0010`\u001a\u00020\u0003HÆ\u0003J\t\u0010a\u001a\u00020\u0003HÆ\u0003J\t\u0010b\u001a\u00020\u0003HÆ\u0003J\t\u0010c\u001a\u00020\u0003HÆ\u0003J\t\u0010d\u001a\u00020\u0003HÆ\u0003J\t\u0010e\u001a\u00020\u0003HÆ\u0003J\t\u0010f\u001a\u00020\u0003HÆ\u0003J\t\u0010g\u001a\u00020\u0003HÆ\u0003J\t\u0010h\u001a\u00020\u0003HÆ\u0003J\t\u0010i\u001a\u00020\u0003HÆ\u0003J\t\u0010j\u001a\u00020\u0003HÆ\u0003J\t\u0010k\u001a\u00020\u0003HÆ\u0003J\t\u0010l\u001a\u00020\u0003HÆ\u0003J\t\u0010m\u001a\u00020\u0003HÆ\u0003J\u0083\u0002\u0010n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u0003HÆ\u0001J\u0013\u0010o\u001a\u00020p2\b\u0010q\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010r\u001a\u00020\u0003HÖ\u0001J\t\u0010s\u001a\u00020tHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010&\"\u0004\b*\u0010(R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010 \"\u0004\b,\u0010\"R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010 \"\u0004\b.\u0010\"R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010 \"\u0004\b0\u0010\"R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010 \"\u0004\b2\u0010\"R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010 \"\u0004\b4\u0010\"R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010 \"\u0004\b6\u0010\"R\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010 \"\u0004\b8\u0010\"R\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010 \"\u0004\b:\u0010\"R\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010 \"\u0004\b<\u0010\"R\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010 \"\u0004\b>\u0010\"R\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010 \"\u0004\b@\u0010\"R\u001a\u0010\u0013\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010 \"\u0004\bB\u0010\"R\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010 \"\u0004\bD\u0010\"R\u001a\u0010\u0015\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010 \"\u0004\bF\u0010\"R\u001a\u0010\u0016\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010 \"\u0004\bH\u0010\"R\u001a\u0010\u0017\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010 \"\u0004\bJ\u0010\"R\u001a\u0010\u0018\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010 \"\u0004\bL\u0010\"R\u001a\u0010\u0019\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010 \"\u0004\bN\u0010\"R\u001a\u0010\u001a\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010 \"\u0004\bP\u0010\"R\u001a\u0010\u001b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010 \"\u0004\bR\u0010\"R\u001a\u0010\u001c\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010 \"\u0004\bT\u0010\"¨\u0006u"}, d2 = {"Lcom/xiaomi/fitness/sport_manager_export/data/SportResponseExtraData;", "", FitnessReportKey.avgPace, "", FitnessReportKey.maxPace, "avgSpeed", "", "maxSpeed", FitnessReportKey.avgFrequency, "maxFrequency", "avgStried", "degree", "mainRunStyle", "forefootRatio", "heelRatio", "avgImpact", "maxImpact", "avgOnGround", "minOnGround", "avgOffGround", "maxOffGround", "avgOnOffRatio", "minOnOffRatio", FitnessReportKey.avgVerticalStrideRatio, FitnessReportKey.minVerticalStrideRatio, FitnessReportKey.maxVerticalStrideRatio, "avgVerticalAmplitude", "minVerticalAmplitude", "maxVerticalAmplitude", "<init>", "(IIFFIIIIIIIIIIIIIIIIIIIII)V", "getAvgPace", "()I", "setAvgPace", "(I)V", "getMaxPace", "setMaxPace", "getAvgSpeed", "()F", "setAvgSpeed", "(F)V", "getMaxSpeed", "setMaxSpeed", "getAvgFrequency", "setAvgFrequency", "getMaxFrequency", "setMaxFrequency", "getAvgStried", "setAvgStried", "getDegree", "setDegree", "getMainRunStyle", "setMainRunStyle", "getForefootRatio", "setForefootRatio", "getHeelRatio", "setHeelRatio", "getAvgImpact", "setAvgImpact", "getMaxImpact", "setMaxImpact", "getAvgOnGround", "setAvgOnGround", "getMinOnGround", "setMinOnGround", "getAvgOffGround", "setAvgOffGround", "getMaxOffGround", "setMaxOffGround", "getAvgOnOffRatio", "setAvgOnOffRatio", "getMinOnOffRatio", "setMinOnOffRatio", "getAvgVerticalStrideRatio", "setAvgVerticalStrideRatio", "getMinVerticalStrideRatio", "setMinVerticalStrideRatio", "getMaxVerticalStrideRatio", "setMaxVerticalStrideRatio", "getAvgVerticalAmplitude", "setAvgVerticalAmplitude", "getMinVerticalAmplitude", "setMinVerticalAmplitude", "getMaxVerticalAmplitude", "setMaxVerticalAmplitude", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "copy", "equals", "", "other", "hashCode", "toString", "", "sport-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SportResponseExtraData {
    private int avgFrequency;
    private int avgImpact;
    private int avgOffGround;
    private int avgOnGround;
    private int avgOnOffRatio;
    private int avgPace;
    private float avgSpeed;
    private int avgStried;
    private int avgVerticalAmplitude;
    private int avgVerticalStrideRatio;
    private int degree;
    private int forefootRatio;
    private int heelRatio;
    private int mainRunStyle;
    private int maxFrequency;
    private int maxImpact;
    private int maxOffGround;
    private int maxPace;
    private float maxSpeed;
    private int maxVerticalAmplitude;
    private int maxVerticalStrideRatio;
    private int minOnGround;
    private int minOnOffRatio;
    private int minVerticalAmplitude;
    private int minVerticalStrideRatio;

    public SportResponseExtraData(int i, int i2, float f, float f2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23) {
        this.avgPace = i;
        this.maxPace = i2;
        this.avgSpeed = f;
        this.maxSpeed = f2;
        this.avgFrequency = i3;
        this.maxFrequency = i4;
        this.avgStried = i5;
        this.degree = i6;
        this.mainRunStyle = i7;
        this.forefootRatio = i8;
        this.heelRatio = i9;
        this.avgImpact = i10;
        this.maxImpact = i11;
        this.avgOnGround = i12;
        this.minOnGround = i13;
        this.avgOffGround = i14;
        this.maxOffGround = i15;
        this.avgOnOffRatio = i16;
        this.minOnOffRatio = i17;
        this.avgVerticalStrideRatio = i18;
        this.minVerticalStrideRatio = i19;
        this.maxVerticalStrideRatio = i20;
        this.avgVerticalAmplitude = i21;
        this.minVerticalAmplitude = i22;
        this.maxVerticalAmplitude = i23;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAvgPace() {
        return this.avgPace;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getForefootRatio() {
        return this.forefootRatio;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getHeelRatio() {
        return this.heelRatio;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getAvgImpact() {
        return this.avgImpact;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getMaxImpact() {
        return this.maxImpact;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getAvgOnGround() {
        return this.avgOnGround;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getMinOnGround() {
        return this.minOnGround;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getAvgOffGround() {
        return this.avgOffGround;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getMaxOffGround() {
        return this.maxOffGround;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getAvgOnOffRatio() {
        return this.avgOnOffRatio;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getMinOnOffRatio() {
        return this.minOnOffRatio;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMaxPace() {
        return this.maxPace;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final int getAvgVerticalStrideRatio() {
        return this.avgVerticalStrideRatio;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final int getMinVerticalStrideRatio() {
        return this.minVerticalStrideRatio;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final int getMaxVerticalStrideRatio() {
        return this.maxVerticalStrideRatio;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final int getAvgVerticalAmplitude() {
        return this.avgVerticalAmplitude;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final int getMinVerticalAmplitude() {
        return this.minVerticalAmplitude;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final int getMaxVerticalAmplitude() {
        return this.maxVerticalAmplitude;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getAvgSpeed() {
        return this.avgSpeed;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getMaxSpeed() {
        return this.maxSpeed;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getAvgFrequency() {
        return this.avgFrequency;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getMaxFrequency() {
        return this.maxFrequency;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getAvgStried() {
        return this.avgStried;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getDegree() {
        return this.degree;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getMainRunStyle() {
        return this.mainRunStyle;
    }

    @NotNull
    public final SportResponseExtraData copy(int avgPace, int maxPace, float avgSpeed, float maxSpeed, int avgFrequency, int maxFrequency, int avgStried, int degree, int mainRunStyle, int forefootRatio, int heelRatio, int avgImpact, int maxImpact, int avgOnGround, int minOnGround, int avgOffGround, int maxOffGround, int avgOnOffRatio, int minOnOffRatio, int avgVerticalStrideRatio, int minVerticalStrideRatio, int maxVerticalStrideRatio, int avgVerticalAmplitude, int minVerticalAmplitude, int maxVerticalAmplitude) {
        return new SportResponseExtraData(avgPace, maxPace, avgSpeed, maxSpeed, avgFrequency, maxFrequency, avgStried, degree, mainRunStyle, forefootRatio, heelRatio, avgImpact, maxImpact, avgOnGround, minOnGround, avgOffGround, maxOffGround, avgOnOffRatio, minOnOffRatio, avgVerticalStrideRatio, minVerticalStrideRatio, maxVerticalStrideRatio, avgVerticalAmplitude, minVerticalAmplitude, maxVerticalAmplitude);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportResponseExtraData)) {
            return false;
        }
        SportResponseExtraData sportResponseExtraData = (SportResponseExtraData) other;
        return this.avgPace == sportResponseExtraData.avgPace && this.maxPace == sportResponseExtraData.maxPace && Float.compare(this.avgSpeed, sportResponseExtraData.avgSpeed) == 0 && Float.compare(this.maxSpeed, sportResponseExtraData.maxSpeed) == 0 && this.avgFrequency == sportResponseExtraData.avgFrequency && this.maxFrequency == sportResponseExtraData.maxFrequency && this.avgStried == sportResponseExtraData.avgStried && this.degree == sportResponseExtraData.degree && this.mainRunStyle == sportResponseExtraData.mainRunStyle && this.forefootRatio == sportResponseExtraData.forefootRatio && this.heelRatio == sportResponseExtraData.heelRatio && this.avgImpact == sportResponseExtraData.avgImpact && this.maxImpact == sportResponseExtraData.maxImpact && this.avgOnGround == sportResponseExtraData.avgOnGround && this.minOnGround == sportResponseExtraData.minOnGround && this.avgOffGround == sportResponseExtraData.avgOffGround && this.maxOffGround == sportResponseExtraData.maxOffGround && this.avgOnOffRatio == sportResponseExtraData.avgOnOffRatio && this.minOnOffRatio == sportResponseExtraData.minOnOffRatio && this.avgVerticalStrideRatio == sportResponseExtraData.avgVerticalStrideRatio && this.minVerticalStrideRatio == sportResponseExtraData.minVerticalStrideRatio && this.maxVerticalStrideRatio == sportResponseExtraData.maxVerticalStrideRatio && this.avgVerticalAmplitude == sportResponseExtraData.avgVerticalAmplitude && this.minVerticalAmplitude == sportResponseExtraData.minVerticalAmplitude && this.maxVerticalAmplitude == sportResponseExtraData.maxVerticalAmplitude;
    }

    public final int getAvgFrequency() {
        return this.avgFrequency;
    }

    public final int getAvgImpact() {
        return this.avgImpact;
    }

    public final int getAvgOffGround() {
        return this.avgOffGround;
    }

    public final int getAvgOnGround() {
        return this.avgOnGround;
    }

    public final int getAvgOnOffRatio() {
        return this.avgOnOffRatio;
    }

    public final int getAvgPace() {
        return this.avgPace;
    }

    public final float getAvgSpeed() {
        return this.avgSpeed;
    }

    public final int getAvgStried() {
        return this.avgStried;
    }

    public final int getAvgVerticalAmplitude() {
        return this.avgVerticalAmplitude;
    }

    public final int getAvgVerticalStrideRatio() {
        return this.avgVerticalStrideRatio;
    }

    public final int getDegree() {
        return this.degree;
    }

    public final int getForefootRatio() {
        return this.forefootRatio;
    }

    public final int getHeelRatio() {
        return this.heelRatio;
    }

    public final int getMainRunStyle() {
        return this.mainRunStyle;
    }

    public final int getMaxFrequency() {
        return this.maxFrequency;
    }

    public final int getMaxImpact() {
        return this.maxImpact;
    }

    public final int getMaxOffGround() {
        return this.maxOffGround;
    }

    public final int getMaxPace() {
        return this.maxPace;
    }

    public final float getMaxSpeed() {
        return this.maxSpeed;
    }

    public final int getMaxVerticalAmplitude() {
        return this.maxVerticalAmplitude;
    }

    public final int getMaxVerticalStrideRatio() {
        return this.maxVerticalStrideRatio;
    }

    public final int getMinOnGround() {
        return this.minOnGround;
    }

    public final int getMinOnOffRatio() {
        return this.minOnOffRatio;
    }

    public final int getMinVerticalAmplitude() {
        return this.minVerticalAmplitude;
    }

    public final int getMinVerticalStrideRatio() {
        return this.minVerticalStrideRatio;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((Integer.hashCode(this.avgPace) * 31) + Integer.hashCode(this.maxPace)) * 31) + Float.hashCode(this.avgSpeed)) * 31) + Float.hashCode(this.maxSpeed)) * 31) + Integer.hashCode(this.avgFrequency)) * 31) + Integer.hashCode(this.maxFrequency)) * 31) + Integer.hashCode(this.avgStried)) * 31) + Integer.hashCode(this.degree)) * 31) + Integer.hashCode(this.mainRunStyle)) * 31) + Integer.hashCode(this.forefootRatio)) * 31) + Integer.hashCode(this.heelRatio)) * 31) + Integer.hashCode(this.avgImpact)) * 31) + Integer.hashCode(this.maxImpact)) * 31) + Integer.hashCode(this.avgOnGround)) * 31) + Integer.hashCode(this.minOnGround)) * 31) + Integer.hashCode(this.avgOffGround)) * 31) + Integer.hashCode(this.maxOffGround)) * 31) + Integer.hashCode(this.avgOnOffRatio)) * 31) + Integer.hashCode(this.minOnOffRatio)) * 31) + Integer.hashCode(this.avgVerticalStrideRatio)) * 31) + Integer.hashCode(this.minVerticalStrideRatio)) * 31) + Integer.hashCode(this.maxVerticalStrideRatio)) * 31) + Integer.hashCode(this.avgVerticalAmplitude)) * 31) + Integer.hashCode(this.minVerticalAmplitude)) * 31) + Integer.hashCode(this.maxVerticalAmplitude);
    }

    public final void setAvgFrequency(int i) {
        this.avgFrequency = i;
    }

    public final void setAvgImpact(int i) {
        this.avgImpact = i;
    }

    public final void setAvgOffGround(int i) {
        this.avgOffGround = i;
    }

    public final void setAvgOnGround(int i) {
        this.avgOnGround = i;
    }

    public final void setAvgOnOffRatio(int i) {
        this.avgOnOffRatio = i;
    }

    public final void setAvgPace(int i) {
        this.avgPace = i;
    }

    public final void setAvgSpeed(float f) {
        this.avgSpeed = f;
    }

    public final void setAvgStried(int i) {
        this.avgStried = i;
    }

    public final void setAvgVerticalAmplitude(int i) {
        this.avgVerticalAmplitude = i;
    }

    public final void setAvgVerticalStrideRatio(int i) {
        this.avgVerticalStrideRatio = i;
    }

    public final void setDegree(int i) {
        this.degree = i;
    }

    public final void setForefootRatio(int i) {
        this.forefootRatio = i;
    }

    public final void setHeelRatio(int i) {
        this.heelRatio = i;
    }

    public final void setMainRunStyle(int i) {
        this.mainRunStyle = i;
    }

    public final void setMaxFrequency(int i) {
        this.maxFrequency = i;
    }

    public final void setMaxImpact(int i) {
        this.maxImpact = i;
    }

    public final void setMaxOffGround(int i) {
        this.maxOffGround = i;
    }

    public final void setMaxPace(int i) {
        this.maxPace = i;
    }

    public final void setMaxSpeed(float f) {
        this.maxSpeed = f;
    }

    public final void setMaxVerticalAmplitude(int i) {
        this.maxVerticalAmplitude = i;
    }

    public final void setMaxVerticalStrideRatio(int i) {
        this.maxVerticalStrideRatio = i;
    }

    public final void setMinOnGround(int i) {
        this.minOnGround = i;
    }

    public final void setMinOnOffRatio(int i) {
        this.minOnOffRatio = i;
    }

    public final void setMinVerticalAmplitude(int i) {
        this.minVerticalAmplitude = i;
    }

    public final void setMinVerticalStrideRatio(int i) {
        this.minVerticalStrideRatio = i;
    }

    @NotNull
    public String toString() {
        return "SportResponseExtraData(avgPace=" + this.avgPace + ", maxPace=" + this.maxPace + ", avgSpeed=" + this.avgSpeed + ", maxSpeed=" + this.maxSpeed + ", avgFrequency=" + this.avgFrequency + ", maxFrequency=" + this.maxFrequency + ", avgStried=" + this.avgStried + ", degree=" + this.degree + ", mainRunStyle=" + this.mainRunStyle + ", forefootRatio=" + this.forefootRatio + ", heelRatio=" + this.heelRatio + ", avgImpact=" + this.avgImpact + ", maxImpact=" + this.maxImpact + ", avgOnGround=" + this.avgOnGround + ", minOnGround=" + this.minOnGround + ", avgOffGround=" + this.avgOffGround + ", maxOffGround=" + this.maxOffGround + ", avgOnOffRatio=" + this.avgOnOffRatio + ", minOnOffRatio=" + this.minOnOffRatio + ", avgVerticalStrideRatio=" + this.avgVerticalStrideRatio + ", minVerticalStrideRatio=" + this.minVerticalStrideRatio + ", maxVerticalStrideRatio=" + this.maxVerticalStrideRatio + ", avgVerticalAmplitude=" + this.avgVerticalAmplitude + ", minVerticalAmplitude=" + this.minVerticalAmplitude + ", maxVerticalAmplitude=" + this.maxVerticalAmplitude + ")";
    }

    public /* synthetic */ SportResponseExtraData(int i, int i2, float f, float f2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, f, f2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, (i24 & EventRecurrence.TH) != 0 ? 0 : i19, (i24 & 2097152) != 0 ? 0 : i20, (i24 & 4194304) != 0 ? 0 : i21, (i24 & NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY) != 0 ? 0 : i22, (i24 & 16777216) != 0 ? 0 : i23);
    }
}
