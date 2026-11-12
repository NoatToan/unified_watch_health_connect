package com.huami.ai.speech.alexa.entity.payload;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/payload/UnsupportedPayloadException;", "", "", "a", "Ljava/lang/String;", "namespace", "b", "name", "getMessage", "()Ljava/lang/String;", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final class UnsupportedPayloadException extends Throwable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String namespace;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final String name;

    public /* synthetic */ UnsupportedPayloadException(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        String str = this.name;
        if (str == null || str.length() == 0) {
            return "不支持此类型的 Payload(namespace: " + this.namespace + "), 请在 PayloadFactory 中添加。";
        }
        return "不支持此类型的 Payload(namespace: " + this.namespace + ", name: " + ((Object) this.name) + "), 请在 PayloadFactory 中添加。";
    }

    public UnsupportedPayloadException(@NotNull String str, @Nullable String str2) {
        this.namespace = str;
        this.name = str2;
    }
}
