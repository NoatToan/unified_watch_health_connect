package com.huami.ai.speech.alexa.filter;

import com.huami.ai.speech.alexa.entity.DirectiveContent;
import com.huami.ai.speech.alexa.entity.payload.Payload;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J(\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0016R:\u0010\u0010\u001a&\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00020\u0002 \r*\u0012\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\b0\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/huami/ai/speech/alexa/filter/AlexaFilterChain;", "Lcom/huami/ai/speech/alexa/filter/FilterChain;", "Lcom/huami/ai/speech/alexa/filter/DirectFilter;", "filter", "", "addFilter", "removeFilter", "removeAllFilter", "", "Lcom/huami/ai/speech/alexa/entity/DirectiveContent;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "list", "", "kotlin.jvm.PlatformType", "a", "Ljava/util/List;", "chainList", "<init>", "()V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final class AlexaFilterChain implements FilterChain {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<DirectFilter> chainList = Collections.synchronizedList(new ArrayList());

    @Override // com.huami.ai.speech.alexa.filter.FilterChain
    public void addFilter(@NotNull DirectFilter filter) {
        this.chainList.add(filter);
    }

    @Override // com.huami.ai.speech.alexa.filter.FilterChain
    @NotNull
    public List<DirectiveContent<Payload>> filter(@NotNull List<DirectiveContent<Payload>> list) {
        if (this.chainList.isEmpty()) {
            return list;
        }
        Iterator<T> it2 = this.chainList.iterator();
        while (it2.hasNext()) {
            list = ((DirectFilter) it2.next()).filter(list);
        }
        return list;
    }

    @Override // com.huami.ai.speech.alexa.filter.FilterChain
    public void removeAllFilter() {
        this.chainList.clear();
    }

    @Override // com.huami.ai.speech.alexa.filter.FilterChain
    public void removeFilter(@NotNull DirectFilter filter) {
        this.chainList.remove(filter);
    }
}
