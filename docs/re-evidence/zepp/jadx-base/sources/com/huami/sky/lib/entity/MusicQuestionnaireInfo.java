package com.huami.sky.lib.entity;

import com.google.gson.annotations.SerializedName;
import com.huami.sky.lib.constant.WebConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0004\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/huami/sky/lib/entity/MusicQuestionnaireInfo;", "", "Lcom/huami/sky/lib/entity/MusicPreference;", "component1", "musicPreferences", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/huami/sky/lib/entity/MusicPreference;", "getMusicPreferences", "()Lcom/huami/sky/lib/entity/MusicPreference;", "<init>", "(Lcom/huami/sky/lib/entity/MusicPreference;)V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class MusicQuestionnaireInfo {

    @SerializedName(WebConstant.QueryParam.TYPE_MUSIC)
    @NotNull
    private final MusicPreference musicPreferences;

    public MusicQuestionnaireInfo(@NotNull MusicPreference musicPreference) {
        this.musicPreferences = musicPreference;
    }

    public static /* synthetic */ MusicQuestionnaireInfo copy$default(MusicQuestionnaireInfo musicQuestionnaireInfo, MusicPreference musicPreference, int i, Object obj) {
        if ((i & 1) != 0) {
            musicPreference = musicQuestionnaireInfo.musicPreferences;
        }
        return musicQuestionnaireInfo.copy(musicPreference);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MusicPreference getMusicPreferences() {
        return this.musicPreferences;
    }

    @NotNull
    public final MusicQuestionnaireInfo copy(@NotNull MusicPreference musicPreferences) {
        return new MusicQuestionnaireInfo(musicPreferences);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MusicQuestionnaireInfo) && Intrinsics.areEqual(this.musicPreferences, ((MusicQuestionnaireInfo) other).musicPreferences);
    }

    @NotNull
    public final MusicPreference getMusicPreferences() {
        return this.musicPreferences;
    }

    public int hashCode() {
        return this.musicPreferences.hashCode();
    }

    @NotNull
    public String toString() {
        return "MusicQuestionnaireInfo(musicPreferences=" + this.musicPreferences + ")";
    }
}
