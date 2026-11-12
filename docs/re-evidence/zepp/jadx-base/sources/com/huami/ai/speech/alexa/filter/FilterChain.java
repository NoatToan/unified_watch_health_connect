package com.huami.ai.speech.alexa.filter;

import com.huami.ai.speech.alexa.entity.DirectiveContent;
import com.huami.ai.speech.alexa.entity.payload.Payload;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0004H&J(\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH&¨\u0006\f"}, d2 = {"Lcom/huami/ai/speech/alexa/filter/FilterChain;", "", "Lcom/huami/ai/speech/alexa/filter/DirectFilter;", "filter", "", "addFilter", "removeFilter", "removeAllFilter", "", "Lcom/huami/ai/speech/alexa/entity/DirectiveContent;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "list", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public interface FilterChain {
    void addFilter(@NotNull DirectFilter filter);

    @NotNull
    List<DirectiveContent<Payload>> filter(@NotNull List<DirectiveContent<Payload>> list);

    void removeAllFilter();

    void removeFilter(@NotNull DirectFilter filter);
}
