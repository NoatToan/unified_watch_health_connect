package com.huami.ai.speech.alexa.capability.templateruntime;

import com.amazon.alexa.avs.AVSAPIConstants;
import com.huami.ai.speech.alexa.directive.AlexaCommander;
import com.huami.ai.speech.alexa.entity.DirectiveContent;
import com.huami.ai.speech.alexa.entity.payload.BodyTemplatePayload;
import com.huami.ai.speech.alexa.entity.payload.ListTemplatePayload;
import com.huami.ai.speech.alexa.entity.payload.Payload;
import com.huami.ai.speech.alexa.entity.payload.WeatherTemplatePayload;
import com.huami.ai.speech.api.Commander;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/huami/ai/speech/alexa/capability/templateruntime/TemplateRuntimeCommander;", "Lcom/huami/ai/speech/api/Commander;", "Lcom/huami/ai/speech/alexa/entity/DirectiveContent;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "", "payload", "a", "(Lcom/huami/ai/speech/alexa/entity/payload/Payload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "content", "direct", "(Lcom/huami/ai/speech/alexa/entity/DirectiveContent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/ai/speech/alexa/capability/templateruntime/TemplateRuntimeDirective;", "Lcom/huami/ai/speech/alexa/capability/templateruntime/TemplateRuntimeDirective;", "directiveApi", "", "getType", "()Ljava/lang/String;", "type", "<init>", "(Lcom/huami/ai/speech/alexa/capability/templateruntime/TemplateRuntimeDirective;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final class TemplateRuntimeCommander implements Commander<DirectiveContent<Payload>, Unit> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final TemplateRuntimeDirective directiveApi;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.ai.speech.alexa.capability.templateruntime.TemplateRuntimeCommander", f = "TemplateRuntimeCommander.kt", i = {}, l = {33}, m = "direct", n = {}, s = {})
    public static final class a extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return TemplateRuntimeCommander.this.direct((DirectiveContent<Payload>) null, (Continuation<? super Unit>) this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "未处理 " + this.a + " 事件";
        }
    }

    public TemplateRuntimeCommander(@NotNull TemplateRuntimeDirective templateRuntimeDirective) {
        this.directiveApi = templateRuntimeDirective;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(Payload payload, Continuation<? super Unit> continuation) {
        if (payload instanceof BodyTemplatePayload) {
            this.directiveApi.renderBodyTemplate((BodyTemplatePayload) payload);
        } else if (payload instanceof ListTemplatePayload) {
            this.directiveApi.renderListTemplate((ListTemplatePayload) payload);
        } else if (payload instanceof WeatherTemplatePayload) {
            Object objRenderWeatherTemplate = this.directiveApi.renderWeatherTemplate((WeatherTemplatePayload) payload, continuation);
            return objRenderWeatherTemplate == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objRenderWeatherTemplate : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    @Override // com.huami.ai.speech.api.Commander
    @NotNull
    public String getType() {
        return AlexaCommander.TemplateRuntime.getNamespace();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.ai.speech.api.Commander
    @Nullable
    public Object direct(@NotNull DirectiveContent<Payload> directiveContent, @NotNull Continuation<? super Unit> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.c = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (AlexaCommander.INSTANCE.from(directiveContent.getHeader().getNamespace()) != AlexaCommander.TemplateRuntime) {
                return Unit.INSTANCE;
            }
            String name = directiveContent.getHeader().getName();
            if (!Intrinsics.areEqual(name, AVSAPIConstants.TemplateRuntime.Directives.RenderTemplate.NAME)) {
                HMLog.warn$default("speech", null, new b(name), 2, null);
                return Unit.INSTANCE;
            }
            Payload payload = directiveContent.getPayload();
            aVar.c = 1;
            if (a(payload, aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
