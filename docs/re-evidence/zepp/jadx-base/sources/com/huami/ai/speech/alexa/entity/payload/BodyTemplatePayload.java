package com.huami.ai.speech.alexa.entity.payload;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u001c\u0010\u0006\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/payload/BodyTemplatePayload;", "Lcom/huami/ai/speech/alexa/entity/payload/BaseTemplateRuntimePayload;", "", "component1", "Lcom/huami/ai/speech/alexa/entity/payload/Image;", "component2", "textField", "image", "copy", "toString", "", "hashCode", "", "other", "", "equals", "e", "Ljava/lang/String;", "getTextField", "()Ljava/lang/String;", "f", "Lcom/huami/ai/speech/alexa/entity/payload/Image;", "getImage", "()Lcom/huami/ai/speech/alexa/entity/payload/Image;", "<init>", "(Ljava/lang/String;Lcom/huami/ai/speech/alexa/entity/payload/Image;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BodyTemplatePayload extends BaseTemplateRuntimePayload {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @SerializedName("textField")
    @NotNull
    private final String textField;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @SerializedName("image")
    @NotNull
    private final Image image;

    public BodyTemplatePayload(@NotNull String str, @NotNull Image image) {
        super(null, null, null, null, 15, null);
        this.textField = str;
        this.image = image;
    }

    public static /* synthetic */ BodyTemplatePayload copy$default(BodyTemplatePayload bodyTemplatePayload, String str, Image image, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bodyTemplatePayload.textField;
        }
        if ((i & 2) != 0) {
            image = bodyTemplatePayload.image;
        }
        return bodyTemplatePayload.copy(str, image);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTextField() {
        return this.textField;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @NotNull
    public final BodyTemplatePayload copy(@NotNull String textField, @NotNull Image image) {
        return new BodyTemplatePayload(textField, image);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BodyTemplatePayload)) {
            return false;
        }
        BodyTemplatePayload bodyTemplatePayload = (BodyTemplatePayload) other;
        return Intrinsics.areEqual(this.textField, bodyTemplatePayload.textField) && Intrinsics.areEqual(this.image, bodyTemplatePayload.image);
    }

    @NotNull
    public final Image getImage() {
        return this.image;
    }

    @NotNull
    public final String getTextField() {
        return this.textField;
    }

    public int hashCode() {
        return (this.textField.hashCode() * 31) + this.image.hashCode();
    }

    @NotNull
    public String toString() {
        return "BodyTemplatePayload(textField=" + this.textField + ", image=" + this.image + ')';
    }
}
