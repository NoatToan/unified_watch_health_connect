package com.huami.ai.speech.alexa.capability.audioplayer;

import com.huami.ai.speech.alexa.directive.AlexaCommander;
import com.huami.ai.speech.alexa.entity.DirectiveContent;
import com.huami.ai.speech.alexa.entity.payload.Payload;
import com.huami.ai.speech.alexa.entity.payload.PlayPayload;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\n\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/huami/ai/speech/alexa/capability/audioplayer/AudioPlayerCommander;", "Lcom/huami/ai/speech/api/Commander;", "Lcom/huami/ai/speech/alexa/entity/DirectiveContent;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "", "Lcom/huami/ai/speech/alexa/entity/payload/PlayPayload;", "payload", "a", "(Lcom/huami/ai/speech/alexa/entity/payload/PlayPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "content", "direct", "(Lcom/huami/ai/speech/alexa/entity/DirectiveContent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/ai/speech/alexa/capability/audioplayer/AudioPlayerDirective;", "Lcom/huami/ai/speech/alexa/capability/audioplayer/AudioPlayerDirective;", "directiveApi", "", "getType", "()Ljava/lang/String;", "type", "<init>", "(Lcom/huami/ai/speech/alexa/capability/audioplayer/AudioPlayerDirective;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final class AudioPlayerCommander implements Commander<DirectiveContent<Payload>, Unit> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AudioPlayerDirective directiveApi;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.ai.speech.alexa.capability.audioplayer.AudioPlayerCommander", f = "AudioPlayerCommander.kt", i = {}, l = {31}, m = "direct", n = {}, s = {})
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
            return AudioPlayerCommander.this.direct((DirectiveContent<Payload>) null, (Continuation<? super Unit>) this);
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

    public AudioPlayerCommander(@NotNull AudioPlayerDirective audioPlayerDirective) {
        this.directiveApi = audioPlayerDirective;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(PlayPayload playPayload, Continuation<? super Unit> continuation) {
        Object objDoPlay = this.directiveApi.doPlay(playPayload, continuation);
        return objDoPlay == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objDoPlay : Unit.INSTANCE;
    }

    @Override // com.huami.ai.speech.api.Commander
    @NotNull
    public String getType() {
        return AlexaCommander.AudioPlayer.getNamespace();
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
            if (AlexaCommander.INSTANCE.from(directiveContent.getHeader().getNamespace()) != AlexaCommander.AudioPlayer) {
                return Unit.INSTANCE;
            }
            String name = directiveContent.getHeader().getName();
            if (!Intrinsics.areEqual(name, "Play")) {
                HMLog.warn$default("speech", null, new b(name), 2, null);
                return Unit.INSTANCE;
            }
            PlayPayload playPayload = (PlayPayload) directiveContent.getPayload();
            aVar.c = 1;
            if (a(playPayload, aVar) == coroutine_suspended) {
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
