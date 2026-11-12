package com.huami.ai.speech.alexa.entity.payload;

import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import com.huami.ai.speech.alexa.entity.AudioContent;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b,\u0010-J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J=\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003R\u001c\u0010\t\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\n\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010\u000b\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u001c\u0010\f\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u001e\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R$\u0010+\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/huami/ai/speech/alexa/entity/payload/SpeakPayload;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "", "component1", "component2", "component3", "component4", "Lcom/huami/ai/speech/alexa/entity/payload/Caption;", "component5", "playBehavior", "url", TrainingWebConst.QueryParam.VIDEO_FORMAT, "token", ShareConstants.FEED_CAPTION_PARAM, "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getPlayBehavior", "()Ljava/lang/String;", "b", "getUrl", "c", "getFormat", GoogleApiAvailabilityLight.a, "getToken", "e", "Lcom/huami/ai/speech/alexa/entity/payload/Caption;", "getCaption", "()Lcom/huami/ai/speech/alexa/entity/payload/Caption;", "Lcom/huami/ai/speech/alexa/entity/AudioContent;", "f", "Lcom/huami/ai/speech/alexa/entity/AudioContent;", "getAudio", "()Lcom/huami/ai/speech/alexa/entity/AudioContent;", "setAudio", "(Lcom/huami/ai/speech/alexa/entity/AudioContent;)V", "audio", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huami/ai/speech/alexa/entity/payload/Caption;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SpeakPayload implements Payload {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("playBehavior")
    @NotNull
    private final String playBehavior;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("url")
    @NotNull
    private final String url;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName(TrainingWebConst.QueryParam.VIDEO_FORMAT)
    @NotNull
    private final String format;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("token")
    @NotNull
    private final String token;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @SerializedName(ShareConstants.FEED_CAPTION_PARAM)
    @Nullable
    private final Caption caption;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private AudioContent audio;

    public SpeakPayload(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable Caption caption) {
        this.playBehavior = str;
        this.url = str2;
        this.format = str3;
        this.token = str4;
        this.caption = caption;
    }

    public static /* synthetic */ SpeakPayload copy$default(SpeakPayload speakPayload, String str, String str2, String str3, String str4, Caption caption, int i, Object obj) {
        if ((i & 1) != 0) {
            str = speakPayload.playBehavior;
        }
        if ((i & 2) != 0) {
            str2 = speakPayload.url;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = speakPayload.format;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = speakPayload.token;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            caption = speakPayload.caption;
        }
        return speakPayload.copy(str, str5, str6, str7, caption);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPlayBehavior() {
        return this.playBehavior;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFormat() {
        return this.format;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Caption getCaption() {
        return this.caption;
    }

    @NotNull
    public final SpeakPayload copy(@NotNull String playBehavior, @NotNull String url, @NotNull String format, @NotNull String token, @Nullable Caption caption) {
        return new SpeakPayload(playBehavior, url, format, token, caption);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpeakPayload)) {
            return false;
        }
        SpeakPayload speakPayload = (SpeakPayload) other;
        return Intrinsics.areEqual(this.playBehavior, speakPayload.playBehavior) && Intrinsics.areEqual(this.url, speakPayload.url) && Intrinsics.areEqual(this.format, speakPayload.format) && Intrinsics.areEqual(this.token, speakPayload.token) && Intrinsics.areEqual(this.caption, speakPayload.caption);
    }

    @Nullable
    public final AudioContent getAudio() {
        return this.audio;
    }

    @Nullable
    public final Caption getCaption() {
        return this.caption;
    }

    @NotNull
    public final String getFormat() {
        return this.format;
    }

    @NotNull
    public final String getPlayBehavior() {
        return this.playBehavior;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = ((((((this.playBehavior.hashCode() * 31) + this.url.hashCode()) * 31) + this.format.hashCode()) * 31) + this.token.hashCode()) * 31;
        Caption caption = this.caption;
        return iHashCode + (caption == null ? 0 : caption.hashCode());
    }

    public final void setAudio(@Nullable AudioContent audioContent) {
        this.audio = audioContent;
    }

    @NotNull
    public String toString() {
        return "SpeakPayload(playBehavior=" + this.playBehavior + ", url=" + this.url + ", format=" + this.format + ", token=" + this.token + ", caption=" + this.caption + ')';
    }
}
