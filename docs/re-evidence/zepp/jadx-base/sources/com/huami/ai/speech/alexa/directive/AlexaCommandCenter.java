package com.huami.ai.speech.alexa.directive;

import com.huami.ai.speech.api.CommandCenter;
import com.huami.ai.speech.api.Commander;
import com.huami.ai.speech.api.Content;
import com.huami.tools.log.HMLog;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000bR.\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/huami/ai/speech/alexa/directive/AlexaCommandCenter;", "Lcom/huami/ai/speech/api/CommandCenter;", "", "type", "Lcom/huami/ai/speech/api/Commander;", "", "a", "Lcom/huami/ai/speech/api/Content;", "content", "", "hasCommander", "(Lcom/huami/ai/speech/api/Content;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "direct", "", "Ljava/util/Map;", "directionsMap", "<init>", "()V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final class AlexaCommandCenter implements CommandCenter {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Map<String, Commander<Object, Object>> directionsMap = new LinkedHashMap();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Content a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Content content) {
            super(0);
            this.a = content;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("direct: ", this.a);
        }
    }

    private final Commander<Object, Object> a(String type) throws UnsupportedCommanderException {
        Commander<Object, Object> commander = this.directionsMap.get(type);
        if (commander != null) {
            return commander;
        }
        Commander<?, Object> commanderCreateByType = new AlexaCommanderFactory().createByType(type);
        this.directionsMap.put(type, commanderCreateByType);
        return commanderCreateByType;
    }

    @Override // com.huami.ai.speech.api.CommandCenter
    @Nullable
    public Object direct(@NotNull Content content, @NotNull Continuation<? super Unit> continuation) {
        HMLog.info("speech", new a(content));
        Object objDirect = a(content.getType()).direct(content, continuation);
        return objDirect == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objDirect : Unit.INSTANCE;
    }

    @Override // com.huami.ai.speech.api.CommandCenter
    @Nullable
    public Object hasCommander(@NotNull Content content, @NotNull Continuation<? super Boolean> continuation) {
        boolean z;
        try {
            a(content.getType());
            z = true;
        } catch (UnsupportedCommanderException unused) {
            z = false;
        }
        return Boxing.boxBoolean(z);
    }
}
