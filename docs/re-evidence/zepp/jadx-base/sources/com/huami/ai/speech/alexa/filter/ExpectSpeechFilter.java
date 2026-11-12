package com.huami.ai.speech.alexa.filter;

import com.huami.ai.speech.alexa.entity.DirectiveContent;
import com.huami.ai.speech.alexa.entity.payload.Payload;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\u001e\u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00050\n0\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J(\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0007H\u0016R.\u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00050\n0\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/huami/ai/speech/alexa/filter/ExpectSpeechFilter;", "Lcom/huami/ai/speech/alexa/filter/DirectFilter;", "Lcom/huami/ai/speech/alexa/entity/DirectiveContent;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "directiveContent", "", "a", "", "list", "filter", "Lkotlin/Function1;", "Ljava/util/List;", "checkList", "<init>", "(Ljava/util/List;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final class ExpectSpeechFilter implements DirectFilter {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<Function1<DirectiveContent<Payload>, Boolean>> checkList;

    /* JADX WARN: Multi-variable type inference failed */
    public ExpectSpeechFilter(@NotNull List<? extends Function1<? super DirectiveContent<Payload>, Boolean>> list) {
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
        Function1<DirectiveContent<Payload>, Boolean> checkExpectSpeech = DirectiveCheckKt.getCheckExpectSpeech();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((Boolean) checkExpectSpeech.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
