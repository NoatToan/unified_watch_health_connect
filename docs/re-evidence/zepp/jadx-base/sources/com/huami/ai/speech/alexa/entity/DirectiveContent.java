package com.huami.ai.speech.alexa.entity;

import androidx.exifinterface.media.ExifInterface;
import com.huami.ai.speech.alexa.entity.payload.Payload;
import com.huami.ai.speech.api.Content;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u0010\u0010\u0006\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00028\u0000HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\t\u001a\u00028\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0007R\u0016\u0010\u001d\u001a\u00020\f8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/huami/ai/speech/alexa/entity/DirectiveContent;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/ai/speech/api/Content;", "Lcom/huami/ai/speech/alexa/entity/Header;", "component1", "component2", "()Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "header", "payload", "copy", "(Lcom/huami/ai/speech/alexa/entity/Header;Lcom/huami/ai/speech/alexa/entity/payload/Payload;)Lcom/huami/ai/speech/alexa/entity/DirectiveContent;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Lcom/huami/ai/speech/alexa/entity/Header;", "getHeader", "()Lcom/huami/ai/speech/alexa/entity/Header;", "b", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "getPayload", "getType", "()Ljava/lang/String;", "type", "<init>", "(Lcom/huami/ai/speech/alexa/entity/Header;Lcom/huami/ai/speech/alexa/entity/payload/Payload;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class DirectiveContent<T extends Payload> implements Content {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final Header header;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final T payload;

    public DirectiveContent(@NotNull Header header, @NotNull T t) {
        this.header = header;
        this.payload = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DirectiveContent copy$default(DirectiveContent directiveContent, Header header, Payload payload, int i, Object obj) {
        if ((i & 1) != 0) {
            header = directiveContent.header;
        }
        if ((i & 2) != 0) {
            payload = directiveContent.payload;
        }
        return directiveContent.copy(header, payload);
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
    public final DirectiveContent<T> copy(@NotNull Header header, @NotNull T payload) {
        return new DirectiveContent<>(header, payload);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DirectiveContent)) {
            return false;
        }
        DirectiveContent directiveContent = (DirectiveContent) other;
        return Intrinsics.areEqual(this.header, directiveContent.header) && Intrinsics.areEqual(this.payload, directiveContent.payload);
    }

    @NotNull
    public final Header getHeader() {
        return this.header;
    }

    @NotNull
    public final T getPayload() {
        return this.payload;
    }

    @Override // com.huami.ai.speech.api.Content
    @NotNull
    public String getType() {
        return this.header.getNamespace() + JsonLexerKt.COLON + this.header.getName();
    }

    public int hashCode() {
        return (this.header.hashCode() * 31) + this.payload.hashCode();
    }

    @NotNull
    public String toString() {
        return "DirectiveContent(header=" + this.header + ", payload=" + this.payload + ')';
    }
}
