package com.huami.ai.speech.alexa.filter;

import com.huami.ai.speech.alexa.entity.DirectiveContent;
import com.huami.ai.speech.alexa.entity.payload.Caption;
import com.huami.ai.speech.alexa.entity.payload.Payload;
import com.huami.ai.speech.alexa.entity.payload.SpeakPayload;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\u001e\u0010\u000f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00050\r0\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J(\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\bH\u0002J(\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\bH\u0016R.\u0010\u000f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00050\r0\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/huami/ai/speech/alexa/filter/TTSTextFilter;", "Lcom/huami/ai/speech/alexa/filter/DirectFilter;", "Lcom/huami/ai/speech/alexa/entity/DirectiveContent;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "directiveContent", "", "a", "c", "", "directives", "b", "list", "filter", "Lkotlin/Function1;", "Ljava/util/List;", "checkList", "<init>", "(Ljava/util/List;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final class TTSTextFilter implements DirectFilter {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<Function1<DirectiveContent<Payload>, Boolean>> checkList;

    /* JADX WARN: Multi-variable type inference failed */
    public TTSTextFilter(@NotNull List<? extends Function1<? super DirectiveContent<Payload>, Boolean>> list) {
        this.checkList = list;
    }

    private final boolean a(DirectiveContent<Payload> directiveContent) {
        Iterator<Function1<DirectiveContent<Payload>, Boolean>> it2 = this.checkList.iterator();
        while (it2.hasNext()) {
            if (it2.next().invoke(directiveContent).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    private final List<DirectiveContent<Payload>> b(List<DirectiveContent<Payload>> directives) {
        List<DirectiveContent<Payload>> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) directives);
        int i = 0;
        for (Object obj : directives) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            DirectiveContent<Payload> directiveContent = (DirectiveContent) obj;
            if (DirectiveCheckKt.getCheckSpeechSynthesizer().invoke(directiveContent).booleanValue()) {
                mutableList.set(i, c(directiveContent));
            }
            i = i2;
        }
        return mutableList;
    }

    private final DirectiveContent<Payload> c(DirectiveContent<Payload> directiveContent) {
        SpeakPayload speakPayloadCopy$default = SpeakPayload.copy$default((SpeakPayload) directiveContent.getPayload(), null, null, null, null, new Caption("", ""), 15, null);
        speakPayloadCopy$default.setAudio(((SpeakPayload) directiveContent.getPayload()).getAudio());
        return DirectiveContent.copy$default(directiveContent, null, speakPayloadCopy$default, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.huami.ai.speech.alexa.filter.DirectFilter
    @NotNull
    public List<DirectiveContent<Payload>> filter(@NotNull List<DirectiveContent<Payload>> list) {
        boolean z;
        Iterator<DirectiveContent<Payload>> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z = false;
                break;
            }
            if (a(it2.next())) {
                z = true;
                break;
            }
        }
        if (!z) {
            return list;
        }
        Function1<DirectiveContent<Payload>, Boolean> checkSpeechSynthesizer = DirectiveCheckKt.getCheckSpeechSynthesizer();
        for (Object obj : list) {
            if (((Boolean) checkSpeechSynthesizer.invoke(obj)).booleanValue()) {
                if (obj != null) {
                    return b(list);
                }
                return list;
            }
        }
        obj = null;
        if (obj != null) {
            return b(list);
        }
        return list;
    }
}
