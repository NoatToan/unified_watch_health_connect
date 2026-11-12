package com.xiaomi.hm.health.device.setting.network.bean;

import com.facebook.internal.ServerProtocol;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import com.huami.assistant.ocr.camera.CameraActivity;
import com.huami.tools.log.HMLog;
import com.loc.z;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\bA\b\u0086\b\u0018\u0000 g2\u00020\u0001:\u0001gB\u007f\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\be\u0010fJ\u0006\u0010\u0002\u001a\u00020\u0000J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u0081\u0001\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u001aHÆ\u0001J\t\u0010(\u001a\u00020'HÖ\u0001R$\u0010\u001c\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u0010\u001d\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u0010\u001e\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010\u001f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010 \u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010!\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR$\u0010\"\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR$\u0010#\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR$\u0010$\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R$\u0010%\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010d¨\u0006h"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "", "clone", "other", "", "equals", "", "hashCode", "Lcom/xiaomi/hm/health/device/setting/network/bean/SleepMode;", "component1", "Lcom/xiaomi/hm/health/device/setting/network/bean/Display;", "component2", "Lcom/xiaomi/hm/health/device/setting/network/bean/Sound;", "component3", "Lcom/xiaomi/hm/health/device/setting/network/bean/Sport;", "component4", "Lcom/xiaomi/hm/health/device/setting/network/bean/DndMode;", "component5", "Lcom/xiaomi/hm/health/device/setting/network/bean/QuickStart;", "component6", "Lcom/xiaomi/hm/health/device/setting/network/bean/Sort;", "component7", "Lcom/xiaomi/hm/health/device/setting/network/bean/Wearing;", "component8", "Lcom/xiaomi/hm/health/device/setting/network/bean/OfflineVoice;", "component9", "Lcom/xiaomi/hm/health/device/setting/network/bean/General;", "component10", "sleepMode", ServerProtocol.DIALOG_PARAM_DISPLAY, "sound", "sport", "dndMode", "quickStart", "sort", "wearing", "offlineVoice", CameraActivity.CONTENT_TYPE_GENERAL, "copy", "", "toString", "a", "Lcom/xiaomi/hm/health/device/setting/network/bean/SleepMode;", "getSleepMode", "()Lcom/xiaomi/hm/health/device/setting/network/bean/SleepMode;", "setSleepMode", "(Lcom/xiaomi/hm/health/device/setting/network/bean/SleepMode;)V", "b", "Lcom/xiaomi/hm/health/device/setting/network/bean/Display;", "getDisplay", "()Lcom/xiaomi/hm/health/device/setting/network/bean/Display;", "setDisplay", "(Lcom/xiaomi/hm/health/device/setting/network/bean/Display;)V", "c", "Lcom/xiaomi/hm/health/device/setting/network/bean/Sound;", "getSound", "()Lcom/xiaomi/hm/health/device/setting/network/bean/Sound;", "setSound", "(Lcom/xiaomi/hm/health/device/setting/network/bean/Sound;)V", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/device/setting/network/bean/Sport;", "getSport", "()Lcom/xiaomi/hm/health/device/setting/network/bean/Sport;", "setSport", "(Lcom/xiaomi/hm/health/device/setting/network/bean/Sport;)V", "e", "Lcom/xiaomi/hm/health/device/setting/network/bean/DndMode;", "getDndMode", "()Lcom/xiaomi/hm/health/device/setting/network/bean/DndMode;", "setDndMode", "(Lcom/xiaomi/hm/health/device/setting/network/bean/DndMode;)V", "f", "Lcom/xiaomi/hm/health/device/setting/network/bean/QuickStart;", "getQuickStart", "()Lcom/xiaomi/hm/health/device/setting/network/bean/QuickStart;", "setQuickStart", "(Lcom/xiaomi/hm/health/device/setting/network/bean/QuickStart;)V", "g", "Lcom/xiaomi/hm/health/device/setting/network/bean/Sort;", "getSort", "()Lcom/xiaomi/hm/health/device/setting/network/bean/Sort;", "setSort", "(Lcom/xiaomi/hm/health/device/setting/network/bean/Sort;)V", "h", "Lcom/xiaomi/hm/health/device/setting/network/bean/Wearing;", "getWearing", "()Lcom/xiaomi/hm/health/device/setting/network/bean/Wearing;", "setWearing", "(Lcom/xiaomi/hm/health/device/setting/network/bean/Wearing;)V", "i", "Lcom/xiaomi/hm/health/device/setting/network/bean/OfflineVoice;", "getOfflineVoice", "()Lcom/xiaomi/hm/health/device/setting/network/bean/OfflineVoice;", "setOfflineVoice", "(Lcom/xiaomi/hm/health/device/setting/network/bean/OfflineVoice;)V", z.j, "Lcom/xiaomi/hm/health/device/setting/network/bean/General;", "getGeneral", "()Lcom/xiaomi/hm/health/device/setting/network/bean/General;", "setGeneral", "(Lcom/xiaomi/hm/health/device/setting/network/bean/General;)V", "<init>", "(Lcom/xiaomi/hm/health/device/setting/network/bean/SleepMode;Lcom/xiaomi/hm/health/device/setting/network/bean/Display;Lcom/xiaomi/hm/health/device/setting/network/bean/Sound;Lcom/xiaomi/hm/health/device/setting/network/bean/Sport;Lcom/xiaomi/hm/health/device/setting/network/bean/DndMode;Lcom/xiaomi/hm/health/device/setting/network/bean/QuickStart;Lcom/xiaomi/hm/health/device/setting/network/bean/Sort;Lcom/xiaomi/hm/health/device/setting/network/bean/Wearing;Lcom/xiaomi/hm/health/device/setting/network/bean/OfflineVoice;Lcom/xiaomi/hm/health/device/setting/network/bean/General;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class WatchSettings {

    @NotNull
    private static final String k = "WatchSettings";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("sleepMode")
    @Nullable
    private SleepMode sleepMode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName(ServerProtocol.DIALOG_PARAM_DISPLAY)
    @Nullable
    private Display display;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("sound")
    @Nullable
    private Sound sound;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("sport")
    @Nullable
    private Sport sport;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @SerializedName("dndMode")
    @Nullable
    private DndMode dndMode;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @SerializedName("quickStart")
    @Nullable
    private QuickStart quickStart;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @SerializedName("sort")
    @Nullable
    private Sort sort;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @SerializedName("wearing")
    @Nullable
    private Wearing wearing;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @SerializedName("offlineVoice")
    @Nullable
    private OfflineVoice offlineVoice;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @SerializedName(CameraActivity.CONTENT_TYPE_GENERAL)
    @Nullable
    private General general;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Object b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj) {
            super(0);
            this.b = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "settings: " + WatchSettings.this + " \n otherSettings: " + this.b;
        }
    }

    public WatchSettings() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public WatchSettings(@Nullable SleepMode sleepMode, @Nullable Display display, @Nullable Sound sound, @Nullable Sport sport, @Nullable DndMode dndMode, @Nullable QuickStart quickStart, @Nullable Sort sort, @Nullable Wearing wearing, @Nullable OfflineVoice offlineVoice, @Nullable General general) {
        this.sleepMode = sleepMode;
        this.display = display;
        this.sound = sound;
        this.sport = sport;
        this.dndMode = dndMode;
        this.quickStart = quickStart;
        this.sort = sort;
        this.wearing = wearing;
        this.offlineVoice = offlineVoice;
        this.general = general;
    }

    @NotNull
    public final WatchSettings clone() {
        SleepMode sleepMode = this.sleepMode;
        SleepMode sleepModeClone = sleepMode == null ? null : sleepMode.clone();
        Display display = this.display;
        Display displayClone = display == null ? null : display.clone();
        Sound sound = this.sound;
        Sound soundClone = sound == null ? null : sound.clone();
        Sport sport = this.sport;
        Sport sportClone = sport == null ? null : sport.clone();
        DndMode dndMode = this.dndMode;
        DndMode dndModeClone = dndMode == null ? null : dndMode.clone();
        QuickStart quickStart = this.quickStart;
        QuickStart quickStartClone = quickStart == null ? null : quickStart.clone();
        Sort sort = this.sort;
        Sort sortClone = sort == null ? null : sort.clone();
        Wearing wearing = this.wearing;
        Wearing wearingClone = wearing == null ? null : wearing.clone();
        OfflineVoice offlineVoice = this.offlineVoice;
        return new WatchSettings(sleepModeClone, displayClone, soundClone, sportClone, dndModeClone, quickStartClone, sortClone, wearingClone, offlineVoice == null ? null : offlineVoice.clone(), null, 512, null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SleepMode getSleepMode() {
        return this.sleepMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final General getGeneral() {
        return this.general;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Display getDisplay() {
        return this.display;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Sound getSound() {
        return this.sound;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Sport getSport() {
        return this.sport;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DndMode getDndMode() {
        return this.dndMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final QuickStart getQuickStart() {
        return this.quickStart;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Sort getSort() {
        return this.sort;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Wearing getWearing() {
        return this.wearing;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final OfflineVoice getOfflineVoice() {
        return this.offlineVoice;
    }

    @NotNull
    public final WatchSettings copy(@Nullable SleepMode sleepMode, @Nullable Display display, @Nullable Sound sound, @Nullable Sport sport, @Nullable DndMode dndMode, @Nullable QuickStart quickStart, @Nullable Sort sort, @Nullable Wearing wearing, @Nullable OfflineVoice offlineVoice, @Nullable General general) {
        return new WatchSettings(sleepMode, display, sound, sport, dndMode, quickStart, sort, wearing, offlineVoice, general);
    }

    public boolean equals(@Nullable Object other) {
        HMLog.info("WatchSettings", new a(other));
        WatchSettings watchSettings = other instanceof WatchSettings ? (WatchSettings) other : null;
        return watchSettings != null && Intrinsics.areEqual(watchSettings.sleepMode, this.sleepMode) && Intrinsics.areEqual(watchSettings.display, this.display) && Intrinsics.areEqual(watchSettings.sound, this.sound) && Intrinsics.areEqual(watchSettings.sport, this.sport) && Intrinsics.areEqual(watchSettings.dndMode, this.dndMode) && Intrinsics.areEqual(watchSettings.quickStart, this.quickStart) && Intrinsics.areEqual(watchSettings.sort, this.sort) && Intrinsics.areEqual(watchSettings.wearing, this.wearing) && Intrinsics.areEqual(watchSettings.offlineVoice, this.offlineVoice);
    }

    @Nullable
    public final Display getDisplay() {
        return this.display;
    }

    @Nullable
    public final DndMode getDndMode() {
        return this.dndMode;
    }

    @Nullable
    public final General getGeneral() {
        return this.general;
    }

    @Nullable
    public final OfflineVoice getOfflineVoice() {
        return this.offlineVoice;
    }

    @Nullable
    public final QuickStart getQuickStart() {
        return this.quickStart;
    }

    @Nullable
    public final SleepMode getSleepMode() {
        return this.sleepMode;
    }

    @Nullable
    public final Sort getSort() {
        return this.sort;
    }

    @Nullable
    public final Sound getSound() {
        return this.sound;
    }

    @Nullable
    public final Sport getSport() {
        return this.sport;
    }

    @Nullable
    public final Wearing getWearing() {
        return this.wearing;
    }

    public int hashCode() {
        SleepMode sleepMode = this.sleepMode;
        int iHashCode = (sleepMode == null ? 0 : sleepMode.hashCode()) * 31;
        Display display = this.display;
        int iHashCode2 = (iHashCode + (display == null ? 0 : display.hashCode())) * 31;
        Sound sound = this.sound;
        int iHashCode3 = (iHashCode2 + (sound == null ? 0 : sound.hashCode())) * 31;
        Sport sport = this.sport;
        int iHashCode4 = (iHashCode3 + (sport == null ? 0 : sport.hashCode())) * 31;
        DndMode dndMode = this.dndMode;
        int iHashCode5 = (iHashCode4 + (dndMode == null ? 0 : dndMode.hashCode())) * 31;
        QuickStart quickStart = this.quickStart;
        int iHashCode6 = (iHashCode5 + (quickStart == null ? 0 : quickStart.hashCode())) * 31;
        Sort sort = this.sort;
        int iHashCode7 = (iHashCode6 + (sort == null ? 0 : sort.hashCode())) * 31;
        Wearing wearing = this.wearing;
        int iHashCode8 = (iHashCode7 + (wearing == null ? 0 : wearing.hashCode())) * 31;
        OfflineVoice offlineVoice = this.offlineVoice;
        return iHashCode8 + (offlineVoice != null ? offlineVoice.hashCode() : 0);
    }

    public final void setDisplay(@Nullable Display display) {
        this.display = display;
    }

    public final void setDndMode(@Nullable DndMode dndMode) {
        this.dndMode = dndMode;
    }

    public final void setGeneral(@Nullable General general) {
        this.general = general;
    }

    public final void setOfflineVoice(@Nullable OfflineVoice offlineVoice) {
        this.offlineVoice = offlineVoice;
    }

    public final void setQuickStart(@Nullable QuickStart quickStart) {
        this.quickStart = quickStart;
    }

    public final void setSleepMode(@Nullable SleepMode sleepMode) {
        this.sleepMode = sleepMode;
    }

    public final void setSort(@Nullable Sort sort) {
        this.sort = sort;
    }

    public final void setSound(@Nullable Sound sound) {
        this.sound = sound;
    }

    public final void setSport(@Nullable Sport sport) {
        this.sport = sport;
    }

    public final void setWearing(@Nullable Wearing wearing) {
        this.wearing = wearing;
    }

    @NotNull
    public String toString() {
        return "WatchSettings(sleepMode=" + this.sleepMode + ", display=" + this.display + ", sound=" + this.sound + ", sport=" + this.sport + ", dndMode=" + this.dndMode + ", quickStart=" + this.quickStart + ", sort=" + this.sort + ", wearing=" + this.wearing + ", offlineVoice=" + this.offlineVoice + ", general=" + this.general + ")";
    }

    public /* synthetic */ WatchSettings(SleepMode sleepMode, Display display, Sound sound, Sport sport, DndMode dndMode, QuickStart quickStart, Sort sort, Wearing wearing, OfflineVoice offlineVoice, General general, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : sleepMode, (i & 2) != 0 ? null : display, (i & 4) != 0 ? null : sound, (i & 8) != 0 ? null : sport, (i & 16) != 0 ? null : dndMode, (i & 32) != 0 ? null : quickStart, (i & 64) != 0 ? null : sort, (i & 128) != 0 ? null : wearing, (i & 256) != 0 ? null : offlineVoice, (i & 512) == 0 ? general : null);
    }
}
