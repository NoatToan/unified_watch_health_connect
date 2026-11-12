package com.huami.femalehealth.logiclib.vo;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import defpackage.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b1\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\r\u0012\u0006\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\bK\u0010LJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0005HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\t\u0010\u000f\u001a\u00020\u0002HÆ\u0003Jw\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\r2\b\b\u0002\u0010\u001a\u001a\u00020\u0002HÆ\u0001J\t\u0010\u001d\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0002HÖ\u0001J\u0013\u0010 \u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R\"\u0010\u0012\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\"\u001a\u0004\b1\u0010$\"\u0004\b2\u0010&R\"\u0010\u0014\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010+\u001a\u0004\b4\u0010-\"\u0004\b5\u0010/R\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010\"\u001a\u0004\b7\u0010$\"\u0004\b8\u0010&R\"\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010\"\u001a\u0004\b:\u0010$\"\u0004\b;\u0010&R\"\u0010\u0017\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010+\u001a\u0004\b=\u0010-\"\u0004\b>\u0010/R\"\u0010\u0018\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010+\u001a\u0004\b@\u0010-\"\u0004\bA\u0010/R\"\u0010\u0019\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010\"\u001a\u0004\bI\u0010$\"\u0004\bJ\u0010&¨\u0006M"}, d2 = {"Lcom/huami/femalehealth/logiclib/vo/SettingVo;", "", "", "component1", "component2", "", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "", "component10", "component11", "appBeforeMenstruationPush", "appBeforeOvulationPush", "appPush", "estimatedMenstrualDays", "firstTime", "hardwareBeforeMenstruationPush", "hardwareBeforeOvulationPush", "hardwarePush", "intelligentPrediction", "lastMenstrualTime", "menstrualCycle", "copy", "", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getAppBeforeMenstruationPush", "()I", "setAppBeforeMenstruationPush", "(I)V", "b", "getAppBeforeOvulationPush", "setAppBeforeOvulationPush", "c", "Z", "getAppPush", "()Z", "setAppPush", "(Z)V", GoogleApiAvailabilityLight.a, "getEstimatedMenstrualDays", "setEstimatedMenstrualDays", "e", "getFirstTime", "setFirstTime", "f", "getHardwareBeforeMenstruationPush", "setHardwareBeforeMenstruationPush", "g", "getHardwareBeforeOvulationPush", "setHardwareBeforeOvulationPush", "h", "getHardwarePush", "setHardwarePush", "i", "getIntelligentPrediction", "setIntelligentPrediction", z.j, "J", "getLastMenstrualTime", "()J", "setLastMenstrualTime", "(J)V", hl.k, "getMenstrualCycle", "setMenstrualCycle", "<init>", "(IIZIZIIZZJI)V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SettingVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private int appBeforeMenstruationPush;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private int appBeforeOvulationPush;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private boolean appPush;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private int estimatedMenstrualDays;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private boolean firstTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private int hardwareBeforeMenstruationPush;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private int hardwareBeforeOvulationPush;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private boolean hardwarePush;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    private boolean intelligentPrediction;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    private long lastMenstrualTime;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    private int menstrualCycle;

    public SettingVo(int i, int i2, boolean z, int i3, boolean z2, int i4, int i5, boolean z3, boolean z4, long j, int i6) {
        this.appBeforeMenstruationPush = i;
        this.appBeforeOvulationPush = i2;
        this.appPush = z;
        this.estimatedMenstrualDays = i3;
        this.firstTime = z2;
        this.hardwareBeforeMenstruationPush = i4;
        this.hardwareBeforeOvulationPush = i5;
        this.hardwarePush = z3;
        this.intelligentPrediction = z4;
        this.lastMenstrualTime = j;
        this.menstrualCycle = i6;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAppBeforeMenstruationPush() {
        return this.appBeforeMenstruationPush;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getLastMenstrualTime() {
        return this.lastMenstrualTime;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getMenstrualCycle() {
        return this.menstrualCycle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAppBeforeOvulationPush() {
        return this.appBeforeOvulationPush;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getAppPush() {
        return this.appPush;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getEstimatedMenstrualDays() {
        return this.estimatedMenstrualDays;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getFirstTime() {
        return this.firstTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getHardwareBeforeMenstruationPush() {
        return this.hardwareBeforeMenstruationPush;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getHardwareBeforeOvulationPush() {
        return this.hardwareBeforeOvulationPush;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getHardwarePush() {
        return this.hardwarePush;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIntelligentPrediction() {
        return this.intelligentPrediction;
    }

    @NotNull
    public final SettingVo copy(int appBeforeMenstruationPush, int appBeforeOvulationPush, boolean appPush, int estimatedMenstrualDays, boolean firstTime, int hardwareBeforeMenstruationPush, int hardwareBeforeOvulationPush, boolean hardwarePush, boolean intelligentPrediction, long lastMenstrualTime, int menstrualCycle) {
        return new SettingVo(appBeforeMenstruationPush, appBeforeOvulationPush, appPush, estimatedMenstrualDays, firstTime, hardwareBeforeMenstruationPush, hardwareBeforeOvulationPush, hardwarePush, intelligentPrediction, lastMenstrualTime, menstrualCycle);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SettingVo)) {
            return false;
        }
        SettingVo settingVo = (SettingVo) other;
        return this.appBeforeMenstruationPush == settingVo.appBeforeMenstruationPush && this.appBeforeOvulationPush == settingVo.appBeforeOvulationPush && this.appPush == settingVo.appPush && this.estimatedMenstrualDays == settingVo.estimatedMenstrualDays && this.firstTime == settingVo.firstTime && this.hardwareBeforeMenstruationPush == settingVo.hardwareBeforeMenstruationPush && this.hardwareBeforeOvulationPush == settingVo.hardwareBeforeOvulationPush && this.hardwarePush == settingVo.hardwarePush && this.intelligentPrediction == settingVo.intelligentPrediction && this.lastMenstrualTime == settingVo.lastMenstrualTime && this.menstrualCycle == settingVo.menstrualCycle;
    }

    public final int getAppBeforeMenstruationPush() {
        return this.appBeforeMenstruationPush;
    }

    public final int getAppBeforeOvulationPush() {
        return this.appBeforeOvulationPush;
    }

    public final boolean getAppPush() {
        return this.appPush;
    }

    public final int getEstimatedMenstrualDays() {
        return this.estimatedMenstrualDays;
    }

    public final boolean getFirstTime() {
        return this.firstTime;
    }

    public final int getHardwareBeforeMenstruationPush() {
        return this.hardwareBeforeMenstruationPush;
    }

    public final int getHardwareBeforeOvulationPush() {
        return this.hardwareBeforeOvulationPush;
    }

    public final boolean getHardwarePush() {
        return this.hardwarePush;
    }

    public final boolean getIntelligentPrediction() {
        return this.intelligentPrediction;
    }

    public final long getLastMenstrualTime() {
        return this.lastMenstrualTime;
    }

    public final int getMenstrualCycle() {
        return this.menstrualCycle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int i = ((this.appBeforeMenstruationPush * 31) + this.appBeforeOvulationPush) * 31;
        boolean z = this.appPush;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i2 = (((i + r1) * 31) + this.estimatedMenstrualDays) * 31;
        boolean z2 = this.firstTime;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i3 = (((((i2 + r2) * 31) + this.hardwareBeforeMenstruationPush) * 31) + this.hardwareBeforeOvulationPush) * 31;
        boolean z3 = this.hardwarePush;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int i4 = (i3 + r3) * 31;
        boolean z4 = this.intelligentPrediction;
        return ((((i4 + (z4 ? 1 : z4)) * 31) + b.a(this.lastMenstrualTime)) * 31) + this.menstrualCycle;
    }

    public final void setAppBeforeMenstruationPush(int i) {
        this.appBeforeMenstruationPush = i;
    }

    public final void setAppBeforeOvulationPush(int i) {
        this.appBeforeOvulationPush = i;
    }

    public final void setAppPush(boolean z) {
        this.appPush = z;
    }

    public final void setEstimatedMenstrualDays(int i) {
        this.estimatedMenstrualDays = i;
    }

    public final void setFirstTime(boolean z) {
        this.firstTime = z;
    }

    public final void setHardwareBeforeMenstruationPush(int i) {
        this.hardwareBeforeMenstruationPush = i;
    }

    public final void setHardwareBeforeOvulationPush(int i) {
        this.hardwareBeforeOvulationPush = i;
    }

    public final void setHardwarePush(boolean z) {
        this.hardwarePush = z;
    }

    public final void setIntelligentPrediction(boolean z) {
        this.intelligentPrediction = z;
    }

    public final void setLastMenstrualTime(long j) {
        this.lastMenstrualTime = j;
    }

    public final void setMenstrualCycle(int i) {
        this.menstrualCycle = i;
    }

    @NotNull
    public String toString() {
        return "SettingVo(appBeforeMenstruationPush=" + this.appBeforeMenstruationPush + ", appBeforeOvulationPush=" + this.appBeforeOvulationPush + ", appPush=" + this.appPush + ", estimatedMenstrualDays=" + this.estimatedMenstrualDays + ", firstTime=" + this.firstTime + ", hardwareBeforeMenstruationPush=" + this.hardwareBeforeMenstruationPush + ", hardwareBeforeOvulationPush=" + this.hardwareBeforeOvulationPush + ", hardwarePush=" + this.hardwarePush + ", intelligentPrediction=" + this.intelligentPrediction + ", lastMenstrualTime=" + this.lastMenstrualTime + ", menstrualCycle=" + this.menstrualCycle + ')';
    }
}
