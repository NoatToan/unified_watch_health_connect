package com.huami.ai.speech.alexa.filter;

import com.huami.ai.speech.alexa.entity.AudioContent;
import com.huami.ai.speech.alexa.entity.DirectiveContent;
import com.huami.ai.speech.alexa.entity.payload.Caption;
import com.huami.ai.speech.alexa.entity.payload.Payload;
import com.huami.ai.speech.alexa.entity.payload.SpeakPayload;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/huami/ai/speech/alexa/filter/MultiTtsMergeFilter;", "Lcom/huami/ai/speech/alexa/filter/DirectFilter;", "", "Lcom/huami/ai/speech/alexa/entity/DirectiveContent;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "list", "filter", "<init>", "()V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final class MultiTtsMergeFilter implements DirectFilter {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.huami.ai.speech.alexa.filter.DirectFilter
    @NotNull
    public List<DirectiveContent<Payload>> filter(@NotNull List<DirectiveContent<Payload>> list) {
        Function1<DirectiveContent<Payload>, Boolean> checkSpeechSynthesizer = DirectiveCheckKt.getCheckSpeechSynthesizer();
        ArrayList<DirectiveContent> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Boolean) checkSpeechSynthesizer.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() <= 1) {
            return list;
        }
        Function1<DirectiveContent<Payload>, Boolean> checkSpeechSynthesizer2 = DirectiveCheckKt.getCheckSpeechSynthesizer();
        Iterator<DirectiveContent<Payload>> it2 = list.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            }
            if (checkSpeechSynthesizer2.invoke(it2.next()).booleanValue()) {
                break;
            }
            i++;
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList2 = new ArrayList();
        for (DirectiveContent directiveContent : arrayList) {
            if (((SpeakPayload) directiveContent.getPayload()).getCaption() != null) {
                sb.append(((SpeakPayload) directiveContent.getPayload()).getCaption().getContent());
                sb.append('\n');
            }
            if (((SpeakPayload) directiveContent.getPayload()).getAudio() != null) {
                arrayList2.addAll(ArraysKt___ArraysKt.toList(ByteStreamsKt.readBytes(((SpeakPayload) directiveContent.getPayload()).getAudio().getCom.xiaomi.ai.core.AivsConfig.Tts.AUDIO_TYPE_STREAM java.lang.String())));
            }
        }
        DirectiveContent directiveContent2 = (DirectiveContent) arrayList.get(0);
        SpeakPayload speakPayload = (SpeakPayload) directiveContent2.getPayload();
        SpeakPayload speakPayloadCopy$default = SpeakPayload.copy$default(speakPayload, null, null, null, null, Caption.copy$default(speakPayload.getCaption(), sb.toString(), null, 2, null), 15, null);
        if (arrayList2.size() > 0) {
            speakPayloadCopy$default.setAudio(new AudioContent(new ByteArrayInputStream(CollectionsKt___CollectionsKt.toByteArray(arrayList2)), ""));
        }
        DirectiveContent<Payload> directiveContentCopy$default = DirectiveContent.copy$default(directiveContent2, null, speakPayloadCopy$default, 1, null);
        Function1<DirectiveContent<Payload>, Boolean> checkSpeechSynthesizer3 = DirectiveCheckKt.getCheckSpeechSynthesizer();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            if (!((Boolean) checkSpeechSynthesizer3.invoke(obj2)).booleanValue()) {
                arrayList3.add(obj2);
            }
        }
        List<DirectiveContent<Payload>> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList3);
        mutableList.add(i, directiveContentCopy$default);
        return mutableList;
    }
}
