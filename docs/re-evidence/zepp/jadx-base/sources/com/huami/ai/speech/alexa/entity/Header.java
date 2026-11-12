package com.huami.ai.speech.alexa.entity;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.huami.ai.speech.alexa.uitls.UUIDKt;
import com.huami.message.api.WebConst;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB/\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J5\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0007\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\b\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015¨\u0006\u001f"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/Header;", "", "", "component1", "component2", "component3", "component4", "namespace", "name", WebConst.QueryParam.MESSAGE_ID, "dialogRequestId", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getNamespace", "()Ljava/lang/String;", "b", "getName", "c", "getMessageId", GoogleApiAvailabilityLight.a, "getDialogRequestId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Header {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("namespace")
    @Expose
    @NotNull
    private final String namespace;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("name")
    @Expose
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName(WebConst.QueryParam.MESSAGE_ID)
    @Expose
    @Nullable
    private final String messageId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("dialogRequestId")
    @Expose
    @Nullable
    private final String dialogRequestId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002J\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002¨\u0006\r"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/Header$Companion;", "", "", "json", "Lcom/huami/ai/speech/alexa/entity/Header;", "fromJson", "name", "nameSpace", "normal", "withMessage", "withDialog", "<init>", "()V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Header fromJson(@NotNull String json) {
            JSONObject jSONObject = new JSONObject(json);
            return new Header(jSONObject.optString("namespace"), jSONObject.optString("name"), jSONObject.optString(WebConst.QueryParam.MESSAGE_ID), jSONObject.optString("dialogRequestId"));
        }

        @NotNull
        public final Header normal(@NotNull String name, @NotNull String nameSpace) {
            return new Header(nameSpace, name, null, null, 12, null);
        }

        @NotNull
        public final Header withDialog(@NotNull String name, @NotNull String nameSpace) {
            return new Header(nameSpace, name, UUIDKt.generateUuidString(), UUIDKt.generateUuidString());
        }

        @NotNull
        public final Header withMessage(@NotNull String name, @NotNull String nameSpace) {
            return new Header(nameSpace, name, UUIDKt.generateUuidString(), null, 8, null);
        }
    }

    public Header(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4) {
        this.namespace = str;
        this.name = str2;
        this.messageId = str3;
        this.dialogRequestId = str4;
    }

    public static /* synthetic */ Header copy$default(Header header, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = header.namespace;
        }
        if ((i & 2) != 0) {
            str2 = header.name;
        }
        if ((i & 4) != 0) {
            str3 = header.messageId;
        }
        if ((i & 8) != 0) {
            str4 = header.dialogRequestId;
        }
        return header.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNamespace() {
        return this.namespace;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDialogRequestId() {
        return this.dialogRequestId;
    }

    @NotNull
    public final Header copy(@NotNull String namespace, @NotNull String name, @Nullable String messageId, @Nullable String dialogRequestId) {
        return new Header(namespace, name, messageId, dialogRequestId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Header)) {
            return false;
        }
        Header header = (Header) other;
        return Intrinsics.areEqual(this.namespace, header.namespace) && Intrinsics.areEqual(this.name, header.name) && Intrinsics.areEqual(this.messageId, header.messageId) && Intrinsics.areEqual(this.dialogRequestId, header.dialogRequestId);
    }

    @Nullable
    public final String getDialogRequestId() {
        return this.dialogRequestId;
    }

    @Nullable
    public final String getMessageId() {
        return this.messageId;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getNamespace() {
        return this.namespace;
    }

    public int hashCode() {
        int iHashCode = ((this.namespace.hashCode() * 31) + this.name.hashCode()) * 31;
        String str = this.messageId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.dialogRequestId;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Header(namespace=" + this.namespace + ", name=" + this.name + ", messageId=" + ((Object) this.messageId) + ", dialogRequestId=" + ((Object) this.dialogRequestId) + ')';
    }

    public /* synthetic */ Header(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
