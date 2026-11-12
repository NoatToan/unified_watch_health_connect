package com.xiaomi.hm.health.device.headset.bean;

import com.amap.api.mapcore.util.hl;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b<\b\u0086\b\u0018\u00002\u00020\u0001B±\u0001\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\u0002\u0012\b\b\u0002\u0010!\u001a\u00020\u0002\u0012\b\b\u0002\u0010\"\u001a\u00020\u0002\u0012\b\b\u0002\u0010#\u001a\u00020\u0002\u0012\b\b\u0002\u0010$\u001a\u00020\u0002\u0012\b\b\u0002\u0010%\u001a\u00020\u0002¢\u0006\u0004\bc\u0010dJ\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003J\t\u0010\f\u001a\u00020\u0002HÆ\u0003J\t\u0010\r\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0002HÆ\u0003J³\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\u00022\b\b\u0002\u0010$\u001a\u00020\u00022\b\b\u0002\u0010%\u001a\u00020\u0002HÆ\u0001J\t\u0010(\u001a\u00020'HÖ\u0001J\t\u0010*\u001a\u00020)HÖ\u0001J\u0013\u0010,\u001a\u00020\u00022\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010.\u001a\u0004\b4\u00100\"\u0004\b5\u00102R\"\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010.\u001a\u0004\b7\u00100\"\u0004\b8\u00102R\"\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010.\u001a\u0004\b:\u00100\"\u0004\b;\u00102R\"\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010.\u001a\u0004\b=\u00100\"\u0004\b>\u00102R\"\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010.\u001a\u0004\b@\u00100\"\u0004\bA\u00102R\"\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010.\u001a\u0004\bC\u00100\"\u0004\bD\u00102R\"\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010.\u001a\u0004\bF\u00100\"\u0004\bG\u00102R\"\u0010\u001d\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010.\u001a\u0004\bI\u00100\"\u0004\bJ\u00102R\"\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010.\u001a\u0004\bL\u00100\"\u0004\bM\u00102R\"\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010.\u001a\u0004\bO\u00100\"\u0004\bP\u00102R\"\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010.\u001a\u0004\bR\u00100\"\u0004\bS\u00102R\"\u0010!\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010.\u001a\u0004\bU\u00100\"\u0004\bV\u00102R\"\u0010\"\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010.\u001a\u0004\bX\u00100\"\u0004\bY\u00102R\"\u0010#\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010.\u001a\u0004\b[\u00100\"\u0004\b\\\u00102R\"\u0010$\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010.\u001a\u0004\b^\u00100\"\u0004\b_\u00102R\"\u0010%\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010.\u001a\u0004\ba\u00100\"\u0004\bb\u00102¨\u0006e"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/bean/HeadsetSettings;", "", "", "isSupportSportSettings", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "gestureSettings", "musicEqualizer", "ambientSoundMonitoring", "sportsSettings", "hearingHealth", "cervicalProtection", "voiceControl", "noiseReduction", "wearInduction", "runningRecognition", "sportHighHrReminder", "beatEnhancement", "percussionBroadcast", "hrBroadcast", "skySleepRelax", "headsetAlarm", "smartPlayMusic", "copy", "", "toString", "", "hashCode", "other", "equals", "a", "Z", "getGestureSettings", "()Z", "setGestureSettings", "(Z)V", "b", "getMusicEqualizer", "setMusicEqualizer", "c", "getAmbientSoundMonitoring", "setAmbientSoundMonitoring", GoogleApiAvailabilityLight.a, "getSportsSettings", "setSportsSettings", "e", "getHearingHealth", "setHearingHealth", "f", "getCervicalProtection", "setCervicalProtection", "g", "getVoiceControl", "setVoiceControl", "h", "getNoiseReduction", "setNoiseReduction", "i", "getWearInduction", "setWearInduction", z.j, "getRunningRecognition", "setRunningRecognition", hl.k, "getSportHighHrReminder", "setSportHighHrReminder", "l", "getBeatEnhancement", "setBeatEnhancement", "m", "getPercussionBroadcast", "setPercussionBroadcast", GoogleApiAvailabilityLight.b, "getHrBroadcast", "setHrBroadcast", "o", "getSkySleepRelax", "setSkySleepRelax", b.r, "getHeadsetAlarm", "setHeadsetAlarm", DTransferConstants.SEARCH_KEY, "getSmartPlayMusic", "setSmartPlayMusic", "<init>", "(ZZZZZZZZZZZZZZZZZ)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HeadsetSettings {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private boolean gestureSettings;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private boolean musicEqualizer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private boolean ambientSoundMonitoring;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private boolean sportsSettings;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private boolean hearingHealth;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private boolean cervicalProtection;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private boolean voiceControl;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private boolean noiseReduction;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    private boolean wearInduction;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    private boolean runningRecognition;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    private boolean sportHighHrReminder;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    private boolean beatEnhancement;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    private boolean percussionBroadcast;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
    private boolean hrBroadcast;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
    private boolean skySleepRelax;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata and from toString */
    private boolean headsetAlarm;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata and from toString */
    private boolean smartPlayMusic;

    public HeadsetSettings() {
        this(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 131071, null);
    }

    public HeadsetSettings(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        this.gestureSettings = z;
        this.musicEqualizer = z2;
        this.ambientSoundMonitoring = z3;
        this.sportsSettings = z4;
        this.hearingHealth = z5;
        this.cervicalProtection = z6;
        this.voiceControl = z7;
        this.noiseReduction = z8;
        this.wearInduction = z9;
        this.runningRecognition = z10;
        this.sportHighHrReminder = z11;
        this.beatEnhancement = z12;
        this.percussionBroadcast = z13;
        this.hrBroadcast = z14;
        this.skySleepRelax = z15;
        this.headsetAlarm = z16;
        this.smartPlayMusic = z17;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getGestureSettings() {
        return this.gestureSettings;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getRunningRecognition() {
        return this.runningRecognition;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getSportHighHrReminder() {
        return this.sportHighHrReminder;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getBeatEnhancement() {
        return this.beatEnhancement;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getPercussionBroadcast() {
        return this.percussionBroadcast;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getHrBroadcast() {
        return this.hrBroadcast;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getSkySleepRelax() {
        return this.skySleepRelax;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getHeadsetAlarm() {
        return this.headsetAlarm;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getSmartPlayMusic() {
        return this.smartPlayMusic;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getMusicEqualizer() {
        return this.musicEqualizer;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getAmbientSoundMonitoring() {
        return this.ambientSoundMonitoring;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getSportsSettings() {
        return this.sportsSettings;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getHearingHealth() {
        return this.hearingHealth;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getCervicalProtection() {
        return this.cervicalProtection;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getVoiceControl() {
        return this.voiceControl;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getNoiseReduction() {
        return this.noiseReduction;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getWearInduction() {
        return this.wearInduction;
    }

    @NotNull
    public final HeadsetSettings copy(boolean gestureSettings, boolean musicEqualizer, boolean ambientSoundMonitoring, boolean sportsSettings, boolean hearingHealth, boolean cervicalProtection, boolean voiceControl, boolean noiseReduction, boolean wearInduction, boolean runningRecognition, boolean sportHighHrReminder, boolean beatEnhancement, boolean percussionBroadcast, boolean hrBroadcast, boolean skySleepRelax, boolean headsetAlarm, boolean smartPlayMusic) {
        return new HeadsetSettings(gestureSettings, musicEqualizer, ambientSoundMonitoring, sportsSettings, hearingHealth, cervicalProtection, voiceControl, noiseReduction, wearInduction, runningRecognition, sportHighHrReminder, beatEnhancement, percussionBroadcast, hrBroadcast, skySleepRelax, headsetAlarm, smartPlayMusic);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeadsetSettings)) {
            return false;
        }
        HeadsetSettings headsetSettings = (HeadsetSettings) other;
        return this.gestureSettings == headsetSettings.gestureSettings && this.musicEqualizer == headsetSettings.musicEqualizer && this.ambientSoundMonitoring == headsetSettings.ambientSoundMonitoring && this.sportsSettings == headsetSettings.sportsSettings && this.hearingHealth == headsetSettings.hearingHealth && this.cervicalProtection == headsetSettings.cervicalProtection && this.voiceControl == headsetSettings.voiceControl && this.noiseReduction == headsetSettings.noiseReduction && this.wearInduction == headsetSettings.wearInduction && this.runningRecognition == headsetSettings.runningRecognition && this.sportHighHrReminder == headsetSettings.sportHighHrReminder && this.beatEnhancement == headsetSettings.beatEnhancement && this.percussionBroadcast == headsetSettings.percussionBroadcast && this.hrBroadcast == headsetSettings.hrBroadcast && this.skySleepRelax == headsetSettings.skySleepRelax && this.headsetAlarm == headsetSettings.headsetAlarm && this.smartPlayMusic == headsetSettings.smartPlayMusic;
    }

    public final boolean getAmbientSoundMonitoring() {
        return this.ambientSoundMonitoring;
    }

    public final boolean getBeatEnhancement() {
        return this.beatEnhancement;
    }

    public final boolean getCervicalProtection() {
        return this.cervicalProtection;
    }

    public final boolean getGestureSettings() {
        return this.gestureSettings;
    }

    public final boolean getHeadsetAlarm() {
        return this.headsetAlarm;
    }

    public final boolean getHearingHealth() {
        return this.hearingHealth;
    }

    public final boolean getHrBroadcast() {
        return this.hrBroadcast;
    }

    public final boolean getMusicEqualizer() {
        return this.musicEqualizer;
    }

    public final boolean getNoiseReduction() {
        return this.noiseReduction;
    }

    public final boolean getPercussionBroadcast() {
        return this.percussionBroadcast;
    }

    public final boolean getRunningRecognition() {
        return this.runningRecognition;
    }

    public final boolean getSkySleepRelax() {
        return this.skySleepRelax;
    }

    public final boolean getSmartPlayMusic() {
        return this.smartPlayMusic;
    }

    public final boolean getSportHighHrReminder() {
        return this.sportHighHrReminder;
    }

    public final boolean getSportsSettings() {
        return this.sportsSettings;
    }

    public final boolean getVoiceControl() {
        return this.voiceControl;
    }

    public final boolean getWearInduction() {
        return this.wearInduction;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r0v23, types: [int] */
    /* JADX WARN: Type inference failed for: r0v25, types: [int] */
    /* JADX WARN: Type inference failed for: r0v27, types: [int] */
    /* JADX WARN: Type inference failed for: r0v29, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v31, types: [int] */
    /* JADX WARN: Type inference failed for: r0v33, types: [int] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v13, types: [int] */
    /* JADX WARN: Type inference failed for: r2v15, types: [int] */
    /* JADX WARN: Type inference failed for: r2v17, types: [int] */
    /* JADX WARN: Type inference failed for: r2v19, types: [int] */
    /* JADX WARN: Type inference failed for: r2v21, types: [int] */
    /* JADX WARN: Type inference failed for: r2v23, types: [int] */
    /* JADX WARN: Type inference failed for: r2v25, types: [int] */
    /* JADX WARN: Type inference failed for: r2v27, types: [int] */
    /* JADX WARN: Type inference failed for: r2v29, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v58 */
    /* JADX WARN: Type inference failed for: r2v59 */
    /* JADX WARN: Type inference failed for: r2v60 */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    public int hashCode() {
        boolean z = this.gestureSettings;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.musicEqualizer;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.ambientSoundMonitoring;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int i3 = (i2 + r3) * 31;
        boolean z4 = this.sportsSettings;
        ?? r4 = z4;
        if (z4) {
            r4 = 1;
        }
        int i4 = (i3 + r4) * 31;
        boolean z5 = this.hearingHealth;
        ?? r5 = z5;
        if (z5) {
            r5 = 1;
        }
        int i5 = (i4 + r5) * 31;
        boolean z6 = this.cervicalProtection;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        int i6 = (i5 + r6) * 31;
        boolean z7 = this.voiceControl;
        ?? r7 = z7;
        if (z7) {
            r7 = 1;
        }
        int i7 = (i6 + r7) * 31;
        boolean z8 = this.noiseReduction;
        ?? r8 = z8;
        if (z8) {
            r8 = 1;
        }
        int i8 = (i7 + r8) * 31;
        boolean z9 = this.wearInduction;
        ?? r9 = z9;
        if (z9) {
            r9 = 1;
        }
        int i9 = (i8 + r9) * 31;
        boolean z10 = this.runningRecognition;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (i9 + r10) * 31;
        boolean z11 = this.sportHighHrReminder;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = (i10 + r11) * 31;
        boolean z12 = this.beatEnhancement;
        ?? r12 = z12;
        if (z12) {
            r12 = 1;
        }
        int i12 = (i11 + r12) * 31;
        boolean z13 = this.percussionBroadcast;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        int i13 = (i12 + r13) * 31;
        boolean z14 = this.hrBroadcast;
        ?? r14 = z14;
        if (z14) {
            r14 = 1;
        }
        int i14 = (i13 + r14) * 31;
        boolean z15 = this.skySleepRelax;
        ?? r15 = z15;
        if (z15) {
            r15 = 1;
        }
        int i15 = (i14 + r15) * 31;
        boolean z16 = this.headsetAlarm;
        ?? r16 = z16;
        if (z16) {
            r16 = 1;
        }
        int i16 = (i15 + r16) * 31;
        boolean z17 = this.smartPlayMusic;
        return i16 + (z17 ? 1 : z17);
    }

    public final boolean isSupportSportSettings() {
        return this.runningRecognition || this.sportHighHrReminder || this.beatEnhancement || this.percussionBroadcast || this.hrBroadcast;
    }

    public final void setAmbientSoundMonitoring(boolean z) {
        this.ambientSoundMonitoring = z;
    }

    public final void setBeatEnhancement(boolean z) {
        this.beatEnhancement = z;
    }

    public final void setCervicalProtection(boolean z) {
        this.cervicalProtection = z;
    }

    public final void setGestureSettings(boolean z) {
        this.gestureSettings = z;
    }

    public final void setHeadsetAlarm(boolean z) {
        this.headsetAlarm = z;
    }

    public final void setHearingHealth(boolean z) {
        this.hearingHealth = z;
    }

    public final void setHrBroadcast(boolean z) {
        this.hrBroadcast = z;
    }

    public final void setMusicEqualizer(boolean z) {
        this.musicEqualizer = z;
    }

    public final void setNoiseReduction(boolean z) {
        this.noiseReduction = z;
    }

    public final void setPercussionBroadcast(boolean z) {
        this.percussionBroadcast = z;
    }

    public final void setRunningRecognition(boolean z) {
        this.runningRecognition = z;
    }

    public final void setSkySleepRelax(boolean z) {
        this.skySleepRelax = z;
    }

    public final void setSmartPlayMusic(boolean z) {
        this.smartPlayMusic = z;
    }

    public final void setSportHighHrReminder(boolean z) {
        this.sportHighHrReminder = z;
    }

    public final void setSportsSettings(boolean z) {
        this.sportsSettings = z;
    }

    public final void setVoiceControl(boolean z) {
        this.voiceControl = z;
    }

    public final void setWearInduction(boolean z) {
        this.wearInduction = z;
    }

    @NotNull
    public String toString() {
        return "HeadsetSettings(gestureSettings=" + this.gestureSettings + ", musicEqualizer=" + this.musicEqualizer + ", ambientSoundMonitoring=" + this.ambientSoundMonitoring + ", sportsSettings=" + this.sportsSettings + ", hearingHealth=" + this.hearingHealth + ", cervicalProtection=" + this.cervicalProtection + ", voiceControl=" + this.voiceControl + ", noiseReduction=" + this.noiseReduction + ", wearInduction=" + this.wearInduction + ", runningRecognition=" + this.runningRecognition + ", sportHighHrReminder=" + this.sportHighHrReminder + ", beatEnhancement=" + this.beatEnhancement + ", percussionBroadcast=" + this.percussionBroadcast + ", hrBroadcast=" + this.hrBroadcast + ", skySleepRelax=" + this.skySleepRelax + ", headsetAlarm=" + this.headsetAlarm + ", smartPlayMusic=" + this.smartPlayMusic + ")";
    }

    public /* synthetic */ HeadsetSettings(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? false : z6, (i & 64) != 0 ? false : z7, (i & 128) != 0 ? false : z8, (i & 256) != 0 ? false : z9, (i & 512) != 0 ? false : z10, (i & 1024) != 0 ? false : z11, (i & 2048) != 0 ? false : z12, (i & 4096) != 0 ? false : z13, (i & 8192) != 0 ? false : z14, (i & 16384) != 0 ? false : z15, (i & 32768) != 0 ? false : z16, (i & 65536) != 0 ? false : z17);
    }
}
