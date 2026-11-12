package com.huami.ecg.core.db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.gson.annotations.SerializedName;
import com.huami.ecg.core.db.convert.Converters;
import com.huami.watch.companion.ecg.ui.activity.MeDongAuthActivity;
import com.xmlywind.sdk.common.Constants;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@TypeConverters({Converters.class})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b \u0010!J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0002R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lcom/huami/ecg/core/db/entity/EcgTag;", "", "", "hasStringTags", "hasCustomTag", "hasVoiceTag", "isEmpty", Constants.IS_EXPIRED, "", "a", "J", "getEcgId", "()J", "setEcgId", "(J)V", MeDongAuthActivity.ARGS_ECG, "", "b", LogUtil.I, "getSynced", "()I", "setSynced", "(I)V", "synced", "Lcom/huami/ecg/core/db/entity/EcgTagValue;", "c", "Lcom/huami/ecg/core/db/entity/EcgTagValue;", "getValue", "()Lcom/huami/ecg/core/db/entity/EcgTagValue;", "setValue", "(Lcom/huami/ecg/core/db/entity/EcgTagValue;)V", "value", "<init>", "()V", "Companion", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
@Entity(tableName = "ecg_tag")
public final class EcgTag {

    @NotNull
    public static final String CUSTOM_TAG = "customTag";

    @NotNull
    public static final String ECG_ID = "ecg_id";
    public static final int EXPIRED_TIME = 604800000;

    @NotNull
    public static final String LOCAL_VOICE_UPDATE_TIME = "voiceUpdateTime";

    @NotNull
    public static final String STRING_TAGS = "stringTags";

    @NotNull
    public static final String SYNCED = "synced";

    @NotNull
    public static final String VOICE_TAG = "voiceTag";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName(ECG_ID)
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = ECG_ID)
    private long ecgId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("synced")
    @ColumnInfo(defaultValue = "0", name = "synced")
    private int synced;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Embedded
    @Nullable
    private EcgTagValue value;

    public final long getEcgId() {
        return this.ecgId;
    }

    public final int getSynced() {
        return this.synced;
    }

    @Nullable
    public final EcgTagValue getValue() {
        return this.value;
    }

    public final boolean hasCustomTag() {
        String customTag;
        EcgTagValue ecgTagValue = this.value;
        if (ecgTagValue == null || (customTag = ecgTagValue.getCom.huami.ecg.core.db.entity.EcgTag.CUSTOM_TAG java.lang.String()) == null) {
            return false;
        }
        return customTag.length() > 0;
    }

    public final boolean hasStringTags() {
        List<String> stringTags;
        EcgTagValue ecgTagValue = this.value;
        return (ecgTagValue == null || (stringTags = ecgTagValue.getStringTags()) == null || !(stringTags.isEmpty() ^ true)) ? false : true;
    }

    public final boolean hasVoiceTag() {
        String voiceTag;
        EcgTagValue ecgTagValue = this.value;
        if (ecgTagValue == null || (voiceTag = ecgTagValue.getCom.huami.ecg.core.db.entity.EcgTag.VOICE_TAG java.lang.String()) == null) {
            return false;
        }
        return voiceTag.length() > 0;
    }

    public final boolean isEmpty() {
        return (hasStringTags() || hasCustomTag() || hasVoiceTag()) ? false : true;
    }

    public final boolean isExpired() {
        EcgTagValue ecgTagValue = this.value;
        return (ecgTagValue != null ? ecgTagValue.getLocalVoiceUpdateTime() : System.currentTimeMillis()) - System.currentTimeMillis() > ((long) 604800000);
    }

    public final void setEcgId(long j) {
        this.ecgId = j;
    }

    public final void setSynced(int i) {
        this.synced = i;
    }

    public final void setValue(@Nullable EcgTagValue ecgTagValue) {
        this.value = ecgTagValue;
    }
}
