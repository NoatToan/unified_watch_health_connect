package com.huami.ai.speech.alexa.filter;

import com.huami.ai.helper.SpeechDevice;
import com.huami.ai.speech.alexa.entity.DirectiveContent;
import com.huami.ai.speech.alexa.entity.payload.Payload;
import com.huami.bluetooth.profile.channel.module.voice.command.ErrorCommand;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u001e\u0010\u0010\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00050\r0\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J(\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0007H\u0016R\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000bR.\u0010\u0010\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00050\r0\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/huami/ai/speech/alexa/filter/UnSupportDirectFilter;", "Lcom/huami/ai/speech/alexa/filter/DirectFilter;", "Lcom/huami/ai/speech/alexa/entity/DirectiveContent;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "directiveContent", "", "a", "", "list", "filter", "Lcom/huami/ai/helper/SpeechDevice;", "Lcom/huami/ai/helper/SpeechDevice;", "device", "Lkotlin/Function1;", "b", "Ljava/util/List;", "checkList", "<init>", "(Lcom/huami/ai/helper/SpeechDevice;Ljava/util/List;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final class UnSupportDirectFilter implements DirectFilter {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SpeechDevice device;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final List<Function1<DirectiveContent<Payload>, Boolean>> checkList;

    /* JADX WARN: Multi-variable type inference failed */
    public UnSupportDirectFilter(@NotNull SpeechDevice speechDevice, @NotNull List<? extends Function1<? super DirectiveContent<Payload>, Boolean>> list) {
        this.device = speechDevice;
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

    @Override // com.huami.ai.speech.alexa.filter.DirectFilter
    @NotNull
    public List<DirectiveContent<Payload>> filter(@NotNull List<DirectiveContent<Payload>> list) {
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            if (a((DirectiveContent) it2.next())) {
                SpeechDevice.DefaultImpls.sendCommand$default(this.device, new ErrorCommand(11, ""), null, 2, null);
                return CollectionsKt__CollectionsKt.emptyList();
            }
        }
        return list;
    }
}
