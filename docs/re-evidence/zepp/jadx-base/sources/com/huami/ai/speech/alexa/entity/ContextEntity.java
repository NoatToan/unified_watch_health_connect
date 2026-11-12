package com.huami.ai.speech.alexa.entity;

import androidx.exifinterface.media.ExifInterface;
import com.google.gson.annotations.SerializedName;
import com.huami.ai.speech.alexa.entity.payload.Payload;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u0010\u0010\u0006\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00028\u0000HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÖ\u0003R\u001c\u0010\b\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\t\u001a\u00028\u00008\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/ContextEntity;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lcom/huami/ai/speech/alexa/entity/Header;", "component1", "component2", "()Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "header", "payload", "copy", "(Lcom/huami/ai/speech/alexa/entity/Header;Lcom/huami/ai/speech/alexa/entity/payload/Payload;)Lcom/huami/ai/speech/alexa/entity/ContextEntity;", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/huami/ai/speech/alexa/entity/Header;", "getHeader", "()Lcom/huami/ai/speech/alexa/entity/Header;", "b", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "getPayload", "<init>", "(Lcom/huami/ai/speech/alexa/entity/Header;Lcom/huami/ai/speech/alexa/entity/payload/Payload;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ContextEntity<T extends Payload> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("header")
    @NotNull
    private final Header header;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("payload")
    @NotNull
    private final T payload;

    public ContextEntity(@NotNull Header header, @NotNull T t) {
        this.header = header;
        this.payload = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContextEntity copy$default(ContextEntity contextEntity, Header header, Payload payload, int i, Object obj) {
        if ((i & 1) != 0) {
            header = contextEntity.header;
        }
        if ((i & 2) != 0) {
            payload = contextEntity.payload;
        }
        return contextEntity.copy(header, payload);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Header getHeader() {
        return this.header;
    }

    @NotNull
    public final T component2() {
        return this.payload;
    }

    @NotNull
    public final ContextEntity<T> copy(@NotNull Header header, @NotNull T payload) {
        return new ContextEntity<>(header, payload);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContextEntity)) {
            return false;
        }
        ContextEntity contextEntity = (ContextEntity) other;
        return Intrinsics.areEqual(this.header, contextEntity.header) && Intrinsics.areEqual(this.payload, contextEntity.payload);
    }

    @NotNull
    public final Header getHeader() {
        return this.header;
    }

    @NotNull
    public final T getPayload() {
        return this.payload;
    }

    public int hashCode() {
        return (this.header.hashCode() * 31) + this.payload.hashCode();
    }

    @NotNull
    public String toString() {
        return "ContextEntity(header=" + this.header + ", payload=" + this.payload + ')';
    }
}
