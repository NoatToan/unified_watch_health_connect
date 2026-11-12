package com.huami.ai.speech.alexa;

import com.amazon.alexa.avs.AVSAPIConstants;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ai.notify.DialogState;
import com.huami.ai.notify.VADSendState;
import com.huami.ai.speech.alexa.entity.DirectiveContent;
import com.huami.ai.speech.alexa.entity.DirectiveEntityFactory;
import com.huami.ai.speech.alexa.entity.Header;
import com.huami.ai.speech.alexa.entity.payload.Caption;
import com.huami.ai.speech.alexa.entity.payload.Payload;
import com.huami.ai.speech.alexa.entity.payload.SpeakPayload;
import com.huami.ai.speech.alexa.filter.DirectiveCheckKt;
import com.huami.ai.speech.alexa.filter.FilterChain;
import com.huami.ai.speech.api.CommandCenter;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0006\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001e\u001a\u00020\u001c\u0012\u0006\u0010!\u001a\u00020\u001f\u0012\u0006\u0010$\u001a\u00020\"¢\u0006\u0004\b)\u0010*J'\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\t\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\bJ\b\u0010\n\u001a\u00020\u0006H\u0002J'\u0010\u000b\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\bJ\u001c\u0010\r\u001a\u00020\f2\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u0002J\u0013\u0010\u000e\u001a\u00020\fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003H\u0002J\u001b\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001dR\u0016\u0010!\u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010#RR\u0010(\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 &*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 &*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 &*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"Lcom/huami/ai/speech/alexa/DistributorImpl;", "Lcom/huami/ai/speech/alexa/DataDistributor;", "", "Lcom/huami/ai/speech/alexa/entity/DirectiveContent;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "directives", "", GoogleApiAvailabilityLight.a, "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "f", "g", "", "a", "e", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/ai/speech/alexa/entity/payload/SpeakPayload;", "c", "Lcom/huami/ai/speech/alexa/MultipartResponse;", "data", "deliver", "(Lcom/huami/ai/speech/alexa/MultipartResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/ai/speech/api/CommandCenter;", "Lcom/huami/ai/speech/api/CommandCenter;", com.google.android.exoplayer2.text.ttml.b.m0, "Lcom/huami/ai/speech/alexa/filter/FilterChain;", "Lcom/huami/ai/speech/alexa/filter/FilterChain;", "filterChain", "Lcom/huami/ai/notify/DialogState;", "Lcom/huami/ai/notify/DialogState;", "dialogState", "Lcom/huami/ai/notify/VADSendState;", "Lcom/huami/ai/notify/VADSendState;", "vadSendState", "", LogUtil.I, "bleProtocolVersion", "", "kotlin.jvm.PlatformType", "Ljava/util/List;", "list", "<init>", "(Lcom/huami/ai/speech/api/CommandCenter;Lcom/huami/ai/speech/alexa/filter/FilterChain;Lcom/huami/ai/notify/DialogState;Lcom/huami/ai/notify/VADSendState;I)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final class DistributorImpl implements DataDistributor {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final CommandCenter center;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final FilterChain filterChain;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final DialogState dialogState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final VADSendState vadSendState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int bleProtocolVersion;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List<DirectiveContent<Payload>> list = Collections.synchronizedList(new ArrayList());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ List<DirectiveContent<Payload>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<DirectiveContent<Payload>> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("stop capture twice:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.ai.speech.alexa.DistributorImpl", f = "DataDistributor.kt", i = {}, l = {98}, m = "checkAlertsOfV3", n = {}, s = {})
    public static final class b extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return DistributorImpl.this.b(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.ai.speech.alexa.DistributorImpl", f = "DataDistributor.kt", i = {0, 0}, l = {60, 65, 69, 74}, m = "deliver", n = {"this", "directives"}, s = {"L$0", "L$1"})
    public static final class c extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return DistributorImpl.this.deliver(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.ai.speech.alexa.DistributorImpl", f = "DataDistributor.kt", i = {}, l = {80}, m = "findAndHandleSetTimer", n = {}, s = {})
    public static final class d extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return DistributorImpl.this.d(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.ai.speech.alexa.DistributorImpl", f = "DataDistributor.kt", i = {}, l = {145, 153, 156}, m = "handleStateCommand", n = {}, s = {})
    public static final class e extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return DistributorImpl.this.e(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "send vad replay before end dispatcher.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.ai.speech.alexa.DistributorImpl", f = "DataDistributor.kt", i = {}, l = {123}, m = "handleStateLessVAD", n = {}, s = {})
    public static final class g extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return DistributorImpl.this.g(null, this);
        }
    }

    public DistributorImpl(@NotNull CommandCenter commandCenter, @NotNull FilterChain filterChain, @NotNull DialogState dialogState, @NotNull VADSendState vADSendState, int i) {
        this.center = commandCenter;
        this.filterChain = filterChain;
        this.dialogState = dialogState;
        this.vadSendState = vADSendState;
        this.bleProtocolVersion = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void a(List<DirectiveContent<Payload>> directives) {
        Object next;
        Function1<DirectiveContent<Payload>, Boolean> checkStopCapture = DirectiveCheckKt.getCheckStopCapture();
        Iterator<T> it2 = directives.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!((Boolean) checkStopCapture.invoke(next)).booleanValue());
        if (next != null) {
            HMLog.warn$default("speech", null, new a(directives), 2, null);
            Function1<DirectiveContent<Payload>, Boolean> checkStopCapture2 = DirectiveCheckKt.getCheckStopCapture();
            ArrayList arrayList = new ArrayList();
            for (Object obj : directives) {
                if (!((Boolean) checkStopCapture2.invoke(obj)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
            directives = arrayList;
        }
        this.list.addAll(directives);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(List<DirectiveContent<Payload>> list, Continuation<? super Boolean> continuation) {
        b bVar;
        Iterator it2;
        DistributorImpl distributorImpl;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i = bVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.e = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = bVar.e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.bleProtocolVersion < 3) {
                return Boxing.boxBoolean(false);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (Boxing.boxBoolean(DirectiveCheckKt.getCheckAlerts().invoke((DirectiveContent) obj2).booleanValue()).booleanValue()) {
                    arrayList.add(obj2);
                }
            }
            if (arrayList.isEmpty()) {
                return Boxing.boxBoolean(false);
            }
            it2 = arrayList.iterator();
            distributorImpl = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it2 = (Iterator) bVar.b;
            distributorImpl = (DistributorImpl) bVar.a;
            ResultKt.throwOnFailure(obj);
        }
        while (it2.hasNext()) {
            DirectiveContent directiveContent = (DirectiveContent) it2.next();
            CommandCenter commandCenter = distributorImpl.center;
            bVar.a = distributorImpl;
            bVar.b = it2;
            bVar.e = 1;
            if (commandCenter.direct(directiveContent, bVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Boxing.boxBoolean(true);
    }

    private final DirectiveContent<SpeakPayload> c() {
        return new DirectiveContent<>(new Header("SpeechSynthesizer", AVSAPIConstants.SpeechSynthesizer.Directives.Speak.NAME, null, null, 12, null), new SpeakPayload("ENQUEUE", "", "AUDIO_MPEG", "", new Caption("", "WEBVTT")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(List<DirectiveContent<Payload>> list, Continuation<? super Boolean> continuation) {
        d dVar;
        Object next;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i = dVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.c = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object obj = dVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = dVar.c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Iterator<T> it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!Boxing.boxBoolean(DirectiveCheckKt.getCheckSetTimer().invoke((DirectiveContent) next).booleanValue()).booleanValue());
            DirectiveContent directiveContent = (DirectiveContent) next;
            if (directiveContent == null) {
                return Boxing.boxBoolean(false);
            }
            CommandCenter commandCenter = this.center;
            dVar.c = 1;
            if (commandCenter.direct(directiveContent, dVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Boxing.boxBoolean(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:31:0x0098  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(Continuation<? super Unit> continuation) {
        e eVar;
        Iterator<DirectiveContent<Payload>> it2;
        DirectiveContent<Payload> directiveContent;
        DistributorImpl distributorImpl;
        CommandCenter commandCenter;
        DirectiveContent<Payload> next;
        CommandCenter commandCenter2;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i = eVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                eVar.f = i - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object obj = eVar.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = eVar.f;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.dialogState.get() != 4) {
                return Unit.INSTANCE;
            }
            if (this.list.isEmpty()) {
                CommandCenter commandCenter3 = this.center;
                DirectiveContent<SpeakPayload> directiveContentC = c();
                eVar.a = this;
                eVar.f = 1;
                if (commandCenter3.direct(directiveContentC, eVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                distributorImpl = this;
            } else {
                it2 = this.filterChain.filter(this.list).iterator();
                directiveContent = null;
                distributorImpl = this;
                while (it2.hasNext()) {
                    next = it2.next();
                    if (directiveContent == null) {
                    }
                    commandCenter2 = distributorImpl.center;
                    eVar.a = distributorImpl;
                    eVar.b = directiveContent;
                    eVar.c = it2;
                    eVar.f = 2;
                    if (commandCenter2.direct(next, eVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                if (directiveContent != null) {
                    commandCenter = distributorImpl.center;
                    eVar.a = distributorImpl;
                    eVar.b = null;
                    eVar.c = null;
                    eVar.f = 3;
                    if (commandCenter.direct(directiveContent, eVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                distributorImpl.list.clear();
                distributorImpl.dialogState.set(5);
            }
        } else if (i2 != 1) {
            if (i2 == 2) {
                it2 = (Iterator) eVar.c;
                directiveContent = (DirectiveContent) eVar.b;
                DistributorImpl distributorImpl2 = (DistributorImpl) eVar.a;
                ResultKt.throwOnFailure(obj);
                distributorImpl = distributorImpl2;
                while (it2.hasNext()) {
                    next = it2.next();
                    if (directiveContent == null || !DirectiveCheckKt.getCheckExpectSpeech().invoke(next).booleanValue()) {
                        commandCenter2 = distributorImpl.center;
                        eVar.a = distributorImpl;
                        eVar.b = directiveContent;
                        eVar.c = it2;
                        eVar.f = 2;
                        if (commandCenter2.direct(next, eVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        directiveContent = next;
                    }
                }
                if (directiveContent != null) {
                    commandCenter = distributorImpl.center;
                    eVar.a = distributorImpl;
                    eVar.b = null;
                    eVar.c = null;
                    eVar.f = 3;
                    if (commandCenter.direct(directiveContent, eVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                distributorImpl = (DistributorImpl) eVar.a;
                ResultKt.throwOnFailure(obj);
            }
            distributorImpl.list.clear();
            distributorImpl.dialogState.set(5);
        } else {
            distributorImpl = (DistributorImpl) eVar.a;
            ResultKt.throwOnFailure(obj);
        }
        if (distributorImpl.vadSendState.compareAndSet(3, 1)) {
            distributorImpl.dialogState.set(0);
            HMLog.info("speech", f.a);
        }
        return Unit.INSTANCE;
    }

    private final boolean f() {
        if (this.dialogState.get() >= 1) {
            return false;
        }
        this.list.clear();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(List<DirectiveContent<Payload>> list, Continuation<? super Boolean> continuation) {
        g gVar;
        Object next;
        DistributorImpl distributorImpl;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i = gVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                gVar.e = i - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        Object obj = gVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = gVar.e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.dialogState.get() >= 2) {
                return Boxing.boxBoolean(false);
            }
            Iterator<T> it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!Boxing.boxBoolean(DirectiveCheckKt.getCheckStopCapture().invoke((DirectiveContent) next).booleanValue()).booleanValue());
            DirectiveContent directiveContent = (DirectiveContent) next;
            if (directiveContent != null) {
                this.dialogState.set(2);
                CommandCenter commandCenter = this.center;
                gVar.a = this;
                gVar.b = list;
                gVar.e = 1;
                if (commandCenter.direct(directiveContent, gVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                distributorImpl = this;
            }
            return Boxing.boxBoolean(true);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        list = (List) gVar.b;
        distributorImpl = (DistributorImpl) gVar.a;
        ResultKt.throwOnFailure(obj);
        List<DirectiveContent<Payload>> list2 = distributorImpl.list;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!Boxing.boxBoolean(DirectiveCheckKt.getCheckStopCapture().invoke((DirectiveContent) obj2).booleanValue()).booleanValue()) {
                arrayList.add(obj2);
            }
        }
        list2.addAll(arrayList);
        return Boxing.boxBoolean(true);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009d A[Catch: all -> 0x00d5, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0010, B:9:0x0019, B:15:0x002f, B:53:0x00cd, B:16:0x0034, B:17:0x003b, B:18:0x003c, B:44:0x00af, B:46:0x00b7, B:49:0x00bb, B:19:0x0048, B:35:0x0095, B:37:0x009d, B:40:0x00a1, B:20:0x0054, B:26:0x0078, B:28:0x0080, B:31:0x0087, B:56:0x00d1, B:21:0x0060, B:8:0x0014), top: B:62:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a1 A[Catch: all -> 0x00d5, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0010, B:9:0x0019, B:15:0x002f, B:53:0x00cd, B:16:0x0034, B:17:0x003b, B:18:0x003c, B:44:0x00af, B:46:0x00b7, B:49:0x00bb, B:19:0x0048, B:35:0x0095, B:37:0x009d, B:40:0x00a1, B:20:0x0054, B:26:0x0078, B:28:0x0080, B:31:0x0087, B:56:0x00d1, B:21:0x0060, B:8:0x0014), top: B:62:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ad A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:46:0x00b7 A[Catch: all -> 0x00d5, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0010, B:9:0x0019, B:15:0x002f, B:53:0x00cd, B:16:0x0034, B:17:0x003b, B:18:0x003c, B:44:0x00af, B:46:0x00b7, B:49:0x00bb, B:19:0x0048, B:35:0x0095, B:37:0x009d, B:40:0x00a1, B:20:0x0054, B:26:0x0078, B:28:0x0080, B:31:0x0087, B:56:0x00d1, B:21:0x0060, B:8:0x0014), top: B:62:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00bb A[Catch: all -> 0x00d5, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0010, B:9:0x0019, B:15:0x002f, B:53:0x00cd, B:16:0x0034, B:17:0x003b, B:18:0x003c, B:44:0x00af, B:46:0x00b7, B:49:0x00bb, B:19:0x0048, B:35:0x0095, B:37:0x009d, B:40:0x00a1, B:20:0x0054, B:26:0x0078, B:28:0x0080, B:31:0x0087, B:56:0x00d1, B:21:0x0060, B:8:0x0014), top: B:62:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00cb A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014 A[Catch: all -> 0x00d5, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0010, B:9:0x0019, B:15:0x002f, B:53:0x00cd, B:16:0x0034, B:17:0x003b, B:18:0x003c, B:44:0x00af, B:46:0x00b7, B:49:0x00bb, B:19:0x0048, B:35:0x0095, B:37:0x009d, B:40:0x00a1, B:20:0x0054, B:26:0x0078, B:28:0x0080, B:31:0x0087, B:56:0x00d1, B:21:0x0060, B:8:0x0014), top: B:62:0x0001 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:42:0x00ad, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x00cb, please report this as an issue */
    @Override // com.huami.ai.speech.alexa.DataDistributor
    @Nullable
    public synchronized Object deliver(@NotNull MultipartResponse multipartResponse, @NotNull Continuation<? super Unit> continuation) {
        c cVar;
        List<DirectiveContent<Payload>> listCreateDirectiveContent;
        DistributorImpl distributorImpl;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i = cVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.e = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objD = cVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = cVar.e;
        if (i2 != 0) {
            if (i2 == 1) {
                listCreateDirectiveContent = (List) cVar.b;
                distributorImpl = (DistributorImpl) cVar.a;
                ResultKt.throwOnFailure(objD);
            } else if (i2 == 2) {
                listCreateDirectiveContent = (List) cVar.b;
                distributorImpl = (DistributorImpl) cVar.a;
                ResultKt.throwOnFailure(objD);
                if (((Boolean) objD).booleanValue()) {
                    return Unit.INSTANCE;
                }
                cVar.a = distributorImpl;
                cVar.b = listCreateDirectiveContent;
                cVar.e = 3;
                objD = distributorImpl.g(listCreateDirectiveContent, cVar);
                if (objD == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (((Boolean) objD).booleanValue()) {
                    return Unit.INSTANCE;
                }
                distributorImpl.a(listCreateDirectiveContent);
                cVar.a = null;
                cVar.b = null;
                cVar.e = 4;
                if (distributorImpl.e(cVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 == 3) {
                listCreateDirectiveContent = (List) cVar.b;
                distributorImpl = (DistributorImpl) cVar.a;
                ResultKt.throwOnFailure(objD);
                if (((Boolean) objD).booleanValue()) {
                    return Unit.INSTANCE;
                }
                distributorImpl.a(listCreateDirectiveContent);
                cVar.a = null;
                cVar.b = null;
                cVar.e = 4;
                if (distributorImpl.e(cVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objD);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objD);
        listCreateDirectiveContent = DirectiveEntityFactory.INSTANCE.createDirectiveContent(multipartResponse);
        cVar.a = this;
        cVar.b = listCreateDirectiveContent;
        cVar.e = 1;
        objD = d(listCreateDirectiveContent, cVar);
        if (objD == coroutine_suspended) {
            return coroutine_suspended;
        }
        distributorImpl = this;
        if (!((Boolean) objD).booleanValue() && !distributorImpl.f()) {
            cVar.a = distributorImpl;
            cVar.b = listCreateDirectiveContent;
            cVar.e = 2;
            objD = distributorImpl.b(listCreateDirectiveContent, cVar);
            if (objD == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (((Boolean) objD).booleanValue()) {
                return Unit.INSTANCE;
            }
            cVar.a = distributorImpl;
            cVar.b = listCreateDirectiveContent;
            cVar.e = 3;
            objD = distributorImpl.g(listCreateDirectiveContent, cVar);
            if (objD == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (((Boolean) objD).booleanValue()) {
                return Unit.INSTANCE;
            }
            distributorImpl.a(listCreateDirectiveContent);
            cVar.a = null;
            cVar.b = null;
            cVar.e = 4;
            if (distributorImpl.e(cVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
