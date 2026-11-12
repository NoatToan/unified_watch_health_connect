package com.huami.ecg.core.db.entity;

import androidx.room.ColumnInfo;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 R(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u0011\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b\u0015\u0010\u0010R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/huami/ecg/core/db/entity/EcgTagValue;", "", "", "", "a", "Ljava/util/List;", "getStringTags", "()Ljava/util/List;", "setStringTags", "(Ljava/util/List;)V", EcgTag.STRING_TAGS, "b", "Ljava/lang/String;", "getCustomTag", "()Ljava/lang/String;", "setCustomTag", "(Ljava/lang/String;)V", EcgTag.CUSTOM_TAG, "value", "c", "getVoiceTag", "setVoiceTag", EcgTag.VOICE_TAG, "", GoogleApiAvailabilityLight.a, "J", "getLocalVoiceUpdateTime", "()J", "setLocalVoiceUpdateTime", "(J)V", "localVoiceUpdateTime", "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class EcgTagValue {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName(EcgTag.STRING_TAGS)
    @ColumnInfo(name = EcgTag.STRING_TAGS)
    @NotNull
    private List<String> stringTags = new ArrayList();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName(EcgTag.CUSTOM_TAG)
    @ColumnInfo(defaultValue = "", name = EcgTag.CUSTOM_TAG)
    @NotNull
    private String customTag = "";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName(EcgTag.VOICE_TAG)
    @ColumnInfo(defaultValue = "", name = EcgTag.VOICE_TAG)
    @NotNull
    private String voiceTag = "";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName(EcgTag.LOCAL_VOICE_UPDATE_TIME)
    @ColumnInfo(name = EcgTag.LOCAL_VOICE_UPDATE_TIME)
    private long localVoiceUpdateTime = System.currentTimeMillis();

    @NotNull
    public final String getCustomTag() {
        return this.customTag;
    }

    public final long getLocalVoiceUpdateTime() {
        return this.localVoiceUpdateTime;
    }

    @NotNull
    public final List<String> getStringTags() {
        return this.stringTags;
    }

    @NotNull
    public final String getVoiceTag() {
        return this.voiceTag;
    }

    public final void setCustomTag(@NotNull String str) {
        this.customTag = str;
    }

    public final void setLocalVoiceUpdateTime(long j) {
        this.localVoiceUpdateTime = j;
    }

    public final void setStringTags(@NotNull List<String> list) {
        this.stringTags = list;
    }

    public final void setVoiceTag(@NotNull String str) {
        this.voiceTag = str;
        this.localVoiceUpdateTime = System.currentTimeMillis();
    }
}
