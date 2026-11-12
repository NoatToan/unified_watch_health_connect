package com.facebook.gamingservices.model;

import android.graphics.Bitmap;
import android.util.Base64;
import com.facebook.gamingservices.GamingContext;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.share.model.ShareStoryContent;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001!BI\b\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001f\u0010 J\u0006\u0010\u0003\u001a\u00020\u0002R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\u000f\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u00168\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\b¨\u0006\""}, d2 = {"Lcom/facebook/gamingservices/model/CustomUpdateContent;", "", "Lorg/json/JSONObject;", "toGraphRequestContent", "", "a", "Ljava/lang/String;", "getContextTokenId", "()Ljava/lang/String;", "contextTokenId", "Lcom/facebook/gamingservices/model/CustomUpdateLocalizedText;", "b", "Lcom/facebook/gamingservices/model/CustomUpdateLocalizedText;", "getText", "()Lcom/facebook/gamingservices/model/CustomUpdateLocalizedText;", "text", "c", "getCta", SDKConstants.PARAM_GAME_REQUESTS_CTA, GoogleApiAvailabilityLight.a, "getImage", "image", "Lcom/facebook/gamingservices/model/CustomUpdateMedia;", "e", "Lcom/facebook/gamingservices/model/CustomUpdateMedia;", "getMedia", "()Lcom/facebook/gamingservices/model/CustomUpdateMedia;", "media", "f", "getData", "data", "<init>", "(Ljava/lang/String;Lcom/facebook/gamingservices/model/CustomUpdateLocalizedText;Lcom/facebook/gamingservices/model/CustomUpdateLocalizedText;Ljava/lang/String;Lcom/facebook/gamingservices/model/CustomUpdateMedia;Ljava/lang/String;)V", ShareStoryContent.Builder.k, "facebook-gamingservices_release"}, k = 1, mv = {1, 5, 1})
public final class CustomUpdateContent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String contextTokenId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final CustomUpdateLocalizedText text;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final CustomUpdateLocalizedText cta;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private final String image;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private final CustomUpdateMedia media;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private final String data;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B/\b\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b \u0010!B!\b\u0016\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b \u0010$B!\b\u0016\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u0006\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b \u0010%J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\f\u001a\u00020\u000bR(\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R(\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u000eR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006&"}, d2 = {"Lcom/facebook/gamingservices/model/CustomUpdateContent$Builder;", "", "Landroid/graphics/Bitmap;", "bitmap", "", "a", "Lcom/facebook/gamingservices/model/CustomUpdateLocalizedText;", SDKConstants.PARAM_GAME_REQUESTS_CTA, "setCta", "data", "setData", "Lcom/facebook/gamingservices/model/CustomUpdateContent;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "<set-?>", "Lcom/facebook/gamingservices/model/CustomUpdateLocalizedText;", "getCta", "()Lcom/facebook/gamingservices/model/CustomUpdateLocalizedText;", "b", "Ljava/lang/String;", "getData", "()Ljava/lang/String;", "c", "contextTokenId", GoogleApiAvailabilityLight.a, "text", "e", "Landroid/graphics/Bitmap;", "image", "Lcom/facebook/gamingservices/model/CustomUpdateMedia;", "f", "Lcom/facebook/gamingservices/model/CustomUpdateMedia;", "media", "<init>", "(Ljava/lang/String;Lcom/facebook/gamingservices/model/CustomUpdateLocalizedText;Landroid/graphics/Bitmap;Lcom/facebook/gamingservices/model/CustomUpdateMedia;)V", "Lcom/facebook/gamingservices/GamingContext;", SDKConstants.PARAM_CONTEXT_TOKEN, "(Lcom/facebook/gamingservices/GamingContext;Lcom/facebook/gamingservices/model/CustomUpdateLocalizedText;Landroid/graphics/Bitmap;)V", "(Lcom/facebook/gamingservices/GamingContext;Lcom/facebook/gamingservices/model/CustomUpdateLocalizedText;Lcom/facebook/gamingservices/model/CustomUpdateMedia;)V", "facebook-gamingservices_release"}, k = 1, mv = {1, 5, 1})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private CustomUpdateLocalizedText cta;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private String data;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String contextTokenId;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final CustomUpdateLocalizedText text;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final Bitmap image;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final CustomUpdateMedia media;

        private Builder(String str, CustomUpdateLocalizedText customUpdateLocalizedText, Bitmap bitmap, CustomUpdateMedia customUpdateMedia) {
            this.contextTokenId = str;
            this.text = customUpdateLocalizedText;
            this.image = bitmap;
            this.media = customUpdateMedia;
        }

        private final String a(Bitmap bitmap) {
            if (bitmap == null) {
                return null;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            return "data:image/png;base64," + Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        }

        @NotNull
        public final CustomUpdateContent build() {
            CustomUpdateMedia customUpdateMedia = this.media;
            if (customUpdateMedia != null) {
                if (!((customUpdateMedia.getGif() != null) ^ (this.media.getVideo() != null))) {
                    throw new IllegalArgumentException("Invalid CustomUpdateMedia, please set either gif or video");
                }
            }
            String strA = a(this.image);
            String str = this.contextTokenId;
            if (str != null) {
                return new CustomUpdateContent(str, this.text, this.cta, strA, this.media, this.data, null);
            }
            throw new IllegalArgumentException("parameter contextToken must not be null");
        }

        @Nullable
        public final CustomUpdateLocalizedText getCta() {
            return this.cta;
        }

        @Nullable
        public final String getData() {
            return this.data;
        }

        @NotNull
        public final Builder setCta(@NotNull CustomUpdateLocalizedText cta) {
            this.cta = cta;
            return this;
        }

        @NotNull
        public final Builder setData(@NotNull String data) {
            this.data = data;
            return this;
        }

        public Builder(@NotNull GamingContext gamingContext, @NotNull CustomUpdateLocalizedText customUpdateLocalizedText, @NotNull Bitmap bitmap) {
            this(gamingContext.getContextID(), customUpdateLocalizedText, bitmap, null);
        }

        public Builder(@NotNull GamingContext gamingContext, @NotNull CustomUpdateLocalizedText customUpdateLocalizedText, @NotNull CustomUpdateMedia customUpdateMedia) {
            this(gamingContext.getContextID(), customUpdateLocalizedText, null, customUpdateMedia);
        }
    }

    public /* synthetic */ CustomUpdateContent(String str, CustomUpdateLocalizedText customUpdateLocalizedText, CustomUpdateLocalizedText customUpdateLocalizedText2, String str2, CustomUpdateMedia customUpdateMedia, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, customUpdateLocalizedText, customUpdateLocalizedText2, str2, customUpdateMedia, str3);
    }

    @NotNull
    public final String getContextTokenId() {
        return this.contextTokenId;
    }

    @Nullable
    public final CustomUpdateLocalizedText getCta() {
        return this.cta;
    }

    @Nullable
    public final String getData() {
        return this.data;
    }

    @Nullable
    public final String getImage() {
        return this.image;
    }

    @Nullable
    public final CustomUpdateMedia getMedia() {
        return this.media;
    }

    @NotNull
    public final CustomUpdateLocalizedText getText() {
        return this.text;
    }

    @NotNull
    public final JSONObject toGraphRequestContent() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("context_token_id", this.contextTokenId);
        jSONObject.put("text", this.text.toJSONObject().toString());
        CustomUpdateLocalizedText customUpdateLocalizedText = this.cta;
        if (customUpdateLocalizedText != null) {
            jSONObject.put(SDKConstants.PARAM_GAME_REQUESTS_CTA, customUpdateLocalizedText.toJSONObject().toString());
        }
        String str = this.image;
        if (str != null) {
            jSONObject.put("image", str);
        }
        CustomUpdateMedia customUpdateMedia = this.media;
        if (customUpdateMedia != null) {
            jSONObject.put("media", customUpdateMedia.toJSONObject().toString());
        }
        String str2 = this.data;
        if (str2 != null) {
            jSONObject.put("data", str2);
        }
        return jSONObject;
    }

    private CustomUpdateContent(String str, CustomUpdateLocalizedText customUpdateLocalizedText, CustomUpdateLocalizedText customUpdateLocalizedText2, String str2, CustomUpdateMedia customUpdateMedia, String str3) {
        this.contextTokenId = str;
        this.text = customUpdateLocalizedText;
        this.cta = customUpdateLocalizedText2;
        this.image = str2;
        this.media = customUpdateMedia;
        this.data = str3;
    }

    public /* synthetic */ CustomUpdateContent(String str, CustomUpdateLocalizedText customUpdateLocalizedText, CustomUpdateLocalizedText customUpdateLocalizedText2, String str2, CustomUpdateMedia customUpdateMedia, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, customUpdateLocalizedText, (i & 4) != 0 ? null : customUpdateLocalizedText2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : customUpdateMedia, (i & 32) != 0 ? null : str3);
    }
}
