package com.huami.ai.speech.alexa.entity.payload;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.hm.health.databases.model.trainning.TrainingCourse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u001c\u0010\u0007\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\t\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/payload/SpeechStatePayload;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "", "component1", "", "component2", "component3", "offsetInMilliseconds", "token", "playerActivity", "copy", "toString", "hashCode", "", "other", "", "equals", "a", LogUtil.I, "getOffsetInMilliseconds", "()I", "b", "Ljava/lang/String;", "getToken", "()Ljava/lang/String;", "c", "getPlayerActivity", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SpeechStatePayload implements Payload {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("offsetInMilliseconds")
    private final int offsetInMilliseconds;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("token")
    @NotNull
    private final String token;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("playerActivity")
    @NotNull
    private final String playerActivity;

    public SpeechStatePayload() {
        this(0, null, null, 7, null);
    }

    public SpeechStatePayload(int i, @NotNull String str, @NotNull String str2) {
        this.offsetInMilliseconds = i;
        this.token = str;
        this.playerActivity = str2;
    }

    public static /* synthetic */ SpeechStatePayload copy$default(SpeechStatePayload speechStatePayload, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = speechStatePayload.offsetInMilliseconds;
        }
        if ((i2 & 2) != 0) {
            str = speechStatePayload.token;
        }
        if ((i2 & 4) != 0) {
            str2 = speechStatePayload.playerActivity;
        }
        return speechStatePayload.copy(i, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getOffsetInMilliseconds() {
        return this.offsetInMilliseconds;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPlayerActivity() {
        return this.playerActivity;
    }

    @NotNull
    public final SpeechStatePayload copy(int offsetInMilliseconds, @NotNull String token, @NotNull String playerActivity) {
        return new SpeechStatePayload(offsetInMilliseconds, token, playerActivity);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpeechStatePayload)) {
            return false;
        }
        SpeechStatePayload speechStatePayload = (SpeechStatePayload) other;
        return this.offsetInMilliseconds == speechStatePayload.offsetInMilliseconds && Intrinsics.areEqual(this.token, speechStatePayload.token) && Intrinsics.areEqual(this.playerActivity, speechStatePayload.playerActivity);
    }

    public final int getOffsetInMilliseconds() {
        return this.offsetInMilliseconds;
    }

    @NotNull
    public final String getPlayerActivity() {
        return this.playerActivity;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return (((this.offsetInMilliseconds * 31) + this.token.hashCode()) * 31) + this.playerActivity.hashCode();
    }

    @NotNull
    public String toString() {
        return "SpeechStatePayload(offsetInMilliseconds=" + this.offsetInMilliseconds + ", token=" + this.token + ", playerActivity=" + this.playerActivity + ')';
    }

    public /* synthetic */ SpeechStatePayload(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? TrainingCourse.FINISHED : str2);
    }
}
