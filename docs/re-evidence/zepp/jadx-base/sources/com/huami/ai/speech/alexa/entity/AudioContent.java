package com.huami.ai.speech.alexa.entity;

import com.xiaomi.ai.core.AivsConfig;
import java.io.InputStream;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/AudioContent;", "", "Ljava/io/InputStream;", "a", "Ljava/io/InputStream;", "getStream", "()Ljava/io/InputStream;", AivsConfig.Tts.AUDIO_TYPE_STREAM, "", "b", "Ljava/lang/String;", "getContentId", "()Ljava/lang/String;", "contentId", "<init>", "(Ljava/io/InputStream;Ljava/lang/String;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final class AudioContent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final InputStream stream;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String contentId;

    public AudioContent(@NotNull InputStream inputStream, @NotNull String str) {
        this.stream = inputStream;
        this.contentId = str;
    }

    @NotNull
    public final String getContentId() {
        return this.contentId;
    }

    @NotNull
    public final InputStream getStream() {
        return this.stream;
    }
}
