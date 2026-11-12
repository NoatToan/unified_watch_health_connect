package com.huami.ai.speech.alexa.capability.templateruntime;

import com.huami.ai.speech.alexa.entity.payload.BodyTemplatePayload;
import com.huami.ai.speech.alexa.entity.payload.ListTemplatePayload;
import com.huami.ai.speech.alexa.entity.payload.WeatherTemplatePayload;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u001b\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/huami/ai/speech/alexa/capability/templateruntime/TemplateRuntimeDirective;", "", "Lcom/huami/ai/speech/alexa/entity/payload/BodyTemplatePayload;", "bodyTemplatePayload", "", "renderBodyTemplate", "Lcom/huami/ai/speech/alexa/entity/payload/ListTemplatePayload;", "listTemplatePayload", "renderListTemplate", "Lcom/huami/ai/speech/alexa/entity/payload/WeatherTemplatePayload;", "weatherTemplatePayload", "renderWeatherTemplate", "(Lcom/huami/ai/speech/alexa/entity/payload/WeatherTemplatePayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public interface TemplateRuntimeDirective {
    void renderBodyTemplate(@NotNull BodyTemplatePayload bodyTemplatePayload);

    void renderListTemplate(@NotNull ListTemplatePayload listTemplatePayload);

    @Nullable
    Object renderWeatherTemplate(@NotNull WeatherTemplatePayload weatherTemplatePayload, @NotNull Continuation<? super Unit> continuation);
}
