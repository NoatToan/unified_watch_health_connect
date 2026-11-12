package com.huami.ai.speech.alexa;

import com.google.gson.Gson;
import com.huami.ai.speech.alexa.entity.EventEntityWrapper;
import com.huami.ai.speech.alexa.entity.payload.Payload;
import com.huami.http.OkHttpKtxKt;
import kotlin.Metadata;
import kotlin.text.Charsets;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u001a \u0010\u0006\u001a\u00020\u0005*\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\n\u001a\u001e\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¨\u0006\r"}, d2 = {"Lcom/huami/ai/speech/alexa/AlexaWebApi;", "", "json", "Lokhttp3/RequestBody;", "audioBody", "Lcom/huami/ai/speech/alexa/MultipartResponseResult;", "events", "Lcom/huami/ai/speech/alexa/entity/EventEntityWrapper;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "entity", "Lcom/google/gson/Gson;", "gson", "jsonBody", "speech-alexa_release"}, k = 2, mv = {1, 5, 1})
public final class AlexaWebApiKt {
    @NotNull
    public static final MultipartResponseResult events(@NotNull AlexaWebApi alexaWebApi, @NotNull String str, @Nullable RequestBody requestBody) {
        return events(alexaWebApi, OkHttpKtxKt.buildRequestJsonBody(str), requestBody);
    }

    public static /* synthetic */ MultipartResponseResult events$default(AlexaWebApi alexaWebApi, String str, RequestBody requestBody, int i, Object obj) {
        if ((i & 2) != 0) {
            requestBody = null;
        }
        return events(alexaWebApi, str, requestBody);
    }

    @NotNull
    public static final MultipartResponseResult events(@NotNull AlexaWebApi alexaWebApi, @NotNull EventEntityWrapper<Payload> eventEntityWrapper, @NotNull Gson gson) {
        return events$default(alexaWebApi, gson.toJson(eventEntityWrapper), (RequestBody) null, 2, (Object) null);
    }

    public static /* synthetic */ MultipartResponseResult events$default(AlexaWebApi alexaWebApi, RequestBody requestBody, RequestBody requestBody2, int i, Object obj) {
        if ((i & 2) != 0) {
            requestBody2 = null;
        }
        return events(alexaWebApi, requestBody, requestBody2);
    }

    @NotNull
    public static final MultipartResponseResult events(@NotNull AlexaWebApi alexaWebApi, @NotNull RequestBody requestBody, @Nullable RequestBody requestBody2) {
        MultipartBody.Builder builder = new MultipartBody.Builder("alexa-boundary");
        builder.addFormDataPart("metadata", null, requestBody);
        if (requestBody2 != null) {
            builder.addFormDataPart("audio", null, requestBody2);
        }
        return MultipartResponseKt.asMultipart$default(alexaWebApi.events(builder.build()), "------abcde123".getBytes(Charsets.UTF_8), 0, 2, (Object) null);
    }
}
