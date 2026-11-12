package com.huami.ai.speech.alexa.filter;

import com.huami.ai.speech.alexa.entity.DirectiveContent;
import com.huami.ai.speech.alexa.entity.payload.Payload;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/huami/ai/speech/alexa/filter/ReduplicatedSetAlertFilter;", "Lcom/huami/ai/speech/alexa/filter/DirectFilter;", "", "Lcom/huami/ai/speech/alexa/entity/DirectiveContent;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "list", "filter", "<init>", "()V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final class ReduplicatedSetAlertFilter implements DirectFilter {
    @Override // com.huami.ai.speech.alexa.filter.DirectFilter
    @NotNull
    public List<DirectiveContent<Payload>> filter(@NotNull List<DirectiveContent<Payload>> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (DirectiveCheckKt.getCheckSetAlarm().invoke((DirectiveContent) obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty() || arrayList.size() == 1) {
            return list;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (!DirectiveCheckKt.getCheckSetAlarm().invoke((DirectiveContent) obj2).booleanValue()) {
                arrayList2.add(obj2);
            }
        }
        return CollectionsKt___CollectionsKt.plus((Collection<? extends Object>) arrayList2, CollectionsKt.last((List) arrayList));
    }
}
