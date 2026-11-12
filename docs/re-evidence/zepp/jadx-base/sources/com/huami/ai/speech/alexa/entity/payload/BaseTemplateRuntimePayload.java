package com.huami.ai.speech.alexa.entity.payload;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\u0010\u001a\u00020\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0016\u001a\u00020\u00118\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/payload/BaseTemplateRuntimePayload;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "", "a", "Ljava/lang/String;", "getToken", "()Ljava/lang/String;", "token", "b", "getType", "type", "Lcom/huami/ai/speech/alexa/entity/payload/Title;", "c", "Lcom/huami/ai/speech/alexa/entity/payload/Title;", "getTitle", "()Lcom/huami/ai/speech/alexa/entity/payload/Title;", "title", "Lcom/huami/ai/speech/alexa/entity/payload/Image;", GoogleApiAvailabilityLight.a, "Lcom/huami/ai/speech/alexa/entity/payload/Image;", "getSkillIcon", "()Lcom/huami/ai/speech/alexa/entity/payload/Image;", "skillIcon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/huami/ai/speech/alexa/entity/payload/Title;Lcom/huami/ai/speech/alexa/entity/payload/Image;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public class BaseTemplateRuntimePayload implements Payload {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("token")
    @NotNull
    private final String token;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("title")
    @NotNull
    private final Title title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("skillIcon")
    @NotNull
    private final Image skillIcon;

    public BaseTemplateRuntimePayload() {
        this(null, null, null, null, 15, null);
    }

    public BaseTemplateRuntimePayload(@NotNull String str, @NotNull String str2, @NotNull Title title, @NotNull Image image) {
        this.token = str;
        this.type = str2;
        this.title = title;
        this.skillIcon = image;
    }

    @NotNull
    public final Image getSkillIcon() {
        return this.skillIcon;
    }

    @NotNull
    public final Title getTitle() {
        return this.title;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public /* synthetic */ BaseTemplateRuntimePayload(String str, String str2, Title title, Image image, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new Title(null, null, 3, null) : title, (i & 8) != 0 ? new Image(null, null, 3, null) : image);
    }
}
