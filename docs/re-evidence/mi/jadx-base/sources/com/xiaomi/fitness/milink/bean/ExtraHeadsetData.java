package com.xiaomi.fitness.milink.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/milink/bean/ExtraHeadsetData;", "", "voiceMode", "", "multiConnection", "<init>", "(II)V", "getVoiceMode", "()I", "setVoiceMode", "(I)V", "getMultiConnection", "setMultiConnection", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "milink_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ExtraHeadsetData {
    private int multiConnection;
    private int voiceMode;

    /* JADX WARN: Illegal instructions before constructor call */
    public ExtraHeadsetData() {
        int i = 0;
        this(i, i, 3, null);
    }

    public static /* synthetic */ ExtraHeadsetData copy$default(ExtraHeadsetData extraHeadsetData, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = extraHeadsetData.voiceMode;
        }
        if ((i3 & 2) != 0) {
            i2 = extraHeadsetData.multiConnection;
        }
        return extraHeadsetData.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getVoiceMode() {
        return this.voiceMode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMultiConnection() {
        return this.multiConnection;
    }

    @NotNull
    public final ExtraHeadsetData copy(int voiceMode, int multiConnection) {
        return new ExtraHeadsetData(voiceMode, multiConnection);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtraHeadsetData)) {
            return false;
        }
        ExtraHeadsetData extraHeadsetData = (ExtraHeadsetData) other;
        return this.voiceMode == extraHeadsetData.voiceMode && this.multiConnection == extraHeadsetData.multiConnection;
    }

    public final int getMultiConnection() {
        return this.multiConnection;
    }

    public final int getVoiceMode() {
        return this.voiceMode;
    }

    public int hashCode() {
        return (Integer.hashCode(this.voiceMode) * 31) + Integer.hashCode(this.multiConnection);
    }

    public final void setMultiConnection(int i) {
        this.multiConnection = i;
    }

    public final void setVoiceMode(int i) {
        this.voiceMode = i;
    }

    @NotNull
    public String toString() {
        return "ExtraHeadsetData(voiceMode=" + this.voiceMode + ", multiConnection=" + this.multiConnection + ")";
    }

    public ExtraHeadsetData(int i, int i2) {
        this.voiceMode = i;
        this.multiConnection = i2;
    }

    public /* synthetic */ ExtraHeadsetData(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
