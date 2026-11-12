package com.huami.bluetooth.profile.channel.module.assistant.impl;

import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.assistant.AssistantApi;
import com.huami.bluetooth.profile.channel.module.assistant.AssistantDataBackApi;
import com.huami.bluetooth.profile.channel.module.assistant.dto.ItemDto;
import com.huami.bluetooth.profile.channel.module.assistant.response.AppCardsResponse;
import com.huami.bluetooth.profile.channel.module.assistant.response.AppCardsUpdateRequest;
import com.huami.bluetooth.profile.channel.module.assistant.response.Failure;
import com.huami.bluetooth.profile.channel.module.assistant.response.Response;
import com.huami.bluetooth.profile.channel.module.assistant.response.Success;
import com.huami.bluetooth.profile.channel.module.binary.BinaryDecoder;
import com.huami.bluetooth.profile.channel.module.schedule.action.DataTransferCallback;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 :2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001:B\u000f\u0012\u0006\u0010%\u001a\u00020#¢\u0006\u0004\b8\u00109J\u001b\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u0019\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\bJ\u0019\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0010J#\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00142\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\bJ!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e2\u0006\u0010\u0016\u001a\u00020\u0012H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00142\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\bJ\u001f\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0010J)\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\bJ'\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00120\u000e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001aH\u0096@ø\u0001\u0000¢\u0006\u0004\b \u0010!J#\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\"\u0010\bR\u0016\u0010%\u001a\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$RJ\u0010,\u001a6\u0012\u0004\u0012\u00020'\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000e0(0&j\u001a\u0012\u0004\u0012\u00020'\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000e0(`)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+RJ\u0010.\u001a6\u0012\u0004\u0012\u00020'\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000e0(0&j\u001a\u0012\u0004\u0012\u00020'\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000e0(`)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010+RV\u00100\u001aB\u0012\u0004\u0012\u00020'\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u000e0(0&j \u0012\u0004\u0012\u00020'\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u000e0(`)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010+R\u0018\u00103\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00107\u001a\u0002048V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006;"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/assistant/impl/AssistantV1Impl;", "Lcom/huami/bluetooth/profile/channel/module/assistant/AssistantApi;", "Lcom/huami/bluetooth/profile/channel/module/assistant/AssistantDataBackApi;", "Lkotlinx/coroutines/CoroutineScope;", "", "data", "", "a", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bluetooth/profile/channel/module/schedule/action/DataTransferCallback;", "callback", "register", "", "moduleId", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "queryVersion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onQueryVersionBack", "", "queryDisplayMattersSettings", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Success;", "onQueryDisplayMattersSettingsBack", "isDisplay", "updateDisplayMatters", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onUpdateDisplayMattersBack", "", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/AppCardsResponse;", "queryCardSetting", "onQueryCardSettingBack", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/AppCardsUpdateRequest;", "requestBody", "updateCardSetting", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onUpdateCardSettingBack", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "module", "Ljava/util/HashMap;", "", "Lkotlinx/coroutines/channels/Channel;", "Lkotlin/collections/HashMap;", "b", "Ljava/util/HashMap;", "cacheChannel", "c", "cacheBoolChannel", GoogleApiAvailabilityLight.a, "cacheQueryCardsChannel", "e", "Lcom/huami/bluetooth/profile/channel/module/schedule/action/DataTransferCallback;", "dataTransferCallback", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/BaseModule;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class AssistantV1Impl implements AssistantApi, AssistantDataBackApi, CoroutineScope {

    @NotNull
    public static final String TAG = "AssistantApi";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final BaseModule module;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final HashMap<Byte, Channel<Response<Integer>>> cacheChannel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final HashMap<Byte, Channel<Response<Boolean>>> cacheBoolChannel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final HashMap<Byte, Channel<Response<List<AppCardsResponse>>>> cacheQueryCardsChannel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private DataTransferCallback dataTransferCallback;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.assistant.impl.AssistantV1Impl$1", f = "AssistantV1Impl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<byte[], Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.assistant.impl.AssistantV1Impl$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.assistant.impl.AssistantV1Impl$1$1", f = "AssistantV1Impl.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0319a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ AssistantV1Impl b;
            public final /* synthetic */ byte[] c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0319a(AssistantV1Impl assistantV1Impl, byte[] bArr, Continuation<? super C0319a> continuation) {
                super(2, continuation);
                this.b = assistantV1Impl;
                this.c = bArr;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0319a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0319a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        AssistantV1Impl assistantV1Impl = this.b;
                        byte[] bArr = this.c;
                        this.a = 1;
                        if (assistantV1Impl.a(bArr, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                } catch (Throwable th) {
                    Debug.e("AssistantApi", "error", th);
                }
                return Unit.INSTANCE;
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull byte[] bArr, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(bArr, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = AssistantV1Impl.this.new a(continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            byte[] bArr = (byte[]) this.b;
            if (bArr.length == 0) {
                return Unit.INSTANCE;
            }
            AssistantV1Impl assistantV1Impl = AssistantV1Impl.this;
            kotlinx.coroutines.e.f(assistantV1Impl, null, null, new C0319a(assistantV1Impl, bArr, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.assistant.impl.AssistantV1Impl", f = "AssistantV1Impl.kt", i = {1}, l = {155, 170}, m = "onQueryCardSettingBack", n = {AbstractJSONTokenResponse.RESPONSE}, s = {"L$0"})
    public static final class b extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return AssistantV1Impl.this.onQueryCardSettingBack(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.assistant.impl.AssistantV1Impl", f = "AssistantV1Impl.kt", i = {1}, l = {107, 116}, m = "onQueryDisplayMattersSettingsBack", n = {AbstractJSONTokenResponse.RESPONSE}, s = {"L$0"})
    public static final class c extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return AssistantV1Impl.this.onQueryDisplayMattersSettingsBack(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.assistant.impl.AssistantV1Impl", f = "AssistantV1Impl.kt", i = {1}, l = {80, 89}, m = "onQueryVersionBack", n = {"result"}, s = {"L$0"})
    public static final class d extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return AssistantV1Impl.this.onQueryVersionBack(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.assistant.impl.AssistantV1Impl", f = "AssistantV1Impl.kt", i = {1}, l = {190, 196}, m = "onUpdateCardSettingBack", n = {AbstractJSONTokenResponse.RESPONSE}, s = {"L$0"})
    public static final class e extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return AssistantV1Impl.this.onUpdateCardSettingBack(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.assistant.impl.AssistantV1Impl", f = "AssistantV1Impl.kt", i = {1}, l = {133, 139}, m = "onUpdateDisplayMattersBack", n = {AbstractJSONTokenResponse.RESPONSE}, s = {"L$0"})
    public static final class f extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return AssistantV1Impl.this.onUpdateDisplayMattersBack(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.assistant.impl.AssistantV1Impl", f = "AssistantV1Impl.kt", i = {}, l = {146}, m = "queryCardSetting", n = {}, s = {})
    public static final class g extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return AssistantV1Impl.this.queryCardSetting(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/AppCardsResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.assistant.impl.AssistantV1Impl$queryCardSetting$response$1", f = "AssistantV1Impl.kt", i = {}, l = {147}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<List<? extends AppCardsResponse>>>, Object> {
        public int a;

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AssistantV1Impl.this.new h(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Response<List<? extends AppCardsResponse>>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Response<List<AppCardsResponse>>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Response<List<AppCardsResponse>>> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) AssistantV1Impl.this.cacheQueryCardsChannel.get(Boxing.boxByte((byte) 7));
                if (channel == null) {
                    return null;
                }
                this.a = 1;
                obj = channel.receive(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return (Response) obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.assistant.impl.AssistantV1Impl", f = "AssistantV1Impl.kt", i = {}, l = {98}, m = "queryDisplayMattersSettings", n = {}, s = {})
    public static final class i extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return AssistantV1Impl.this.queryDisplayMattersSettings(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.assistant.impl.AssistantV1Impl$queryDisplayMattersSettings$response$1", f = "AssistantV1Impl.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<Boolean>>, Object> {
        public int a;

        public j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AssistantV1Impl.this.new j(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Response<Boolean>> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) AssistantV1Impl.this.cacheBoolChannel.get(Boxing.boxByte((byte) 3));
                if (channel == null) {
                    return null;
                }
                this.a = 1;
                obj = channel.receive(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return (Response) obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.assistant.impl.AssistantV1Impl", f = "AssistantV1Impl.kt", i = {}, l = {71}, m = "queryVersion", n = {}, s = {})
    public static final class k extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return AssistantV1Impl.this.queryVersion(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.assistant.impl.AssistantV1Impl$queryVersion$response$1", f = "AssistantV1Impl.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<Integer>>, Object> {
        public int a;

        public l(Continuation<? super l> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AssistantV1Impl.this.new l(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Response<Integer>> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) AssistantV1Impl.this.cacheChannel.get(Boxing.boxByte((byte) 1));
                if (channel == null) {
                    return null;
                }
                this.a = 1;
                obj = channel.receive(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return (Response) obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.assistant.impl.AssistantV1Impl", f = "AssistantV1Impl.kt", i = {}, l = {DataTypeSource.SPORT_TYPE_DOWNHILL}, m = "updateCardSetting", n = {}, s = {})
    public static final class m extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public m(Continuation<? super m> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return AssistantV1Impl.this.updateCardSetting(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.assistant.impl.AssistantV1Impl$updateCardSetting$response$1", f = "AssistantV1Impl.kt", i = {}, l = {DataTypeSource.SPORT_TYPE_BUNGEE_JUMPING}, m = "invokeSuspend", n = {}, s = {})
    public static final class n extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<Boolean>>, Object> {
        public int a;

        public n(Continuation<? super n> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AssistantV1Impl.this.new n(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Response<Boolean>> continuation) {
            return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) AssistantV1Impl.this.cacheBoolChannel.get(Boxing.boxByte((byte) 9));
                if (channel == null) {
                    return null;
                }
                this.a = 1;
                obj = channel.receive(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return (Response) obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.assistant.impl.AssistantV1Impl", f = "AssistantV1Impl.kt", i = {}, l = {124}, m = "updateDisplayMatters", n = {}, s = {})
    public static final class o extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public o(Continuation<? super o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return AssistantV1Impl.this.updateDisplayMatters(false, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.assistant.impl.AssistantV1Impl$updateDisplayMatters$response$1", f = "AssistantV1Impl.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
    public static final class p extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<Boolean>>, Object> {
        public int a;

        public p(Continuation<? super p> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AssistantV1Impl.this.new p(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Response<Boolean>> continuation) {
            return ((p) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) AssistantV1Impl.this.cacheBoolChannel.get(Boxing.boxByte((byte) 5));
                if (channel == null) {
                    return null;
                }
                this.a = 1;
                obj = channel.receive(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return (Response) obj;
        }
    }

    public AssistantV1Impl(@NotNull BaseModule baseModule) {
        this.module = baseModule;
        baseModule.registerMessageCallback(new a(null));
        this.cacheChannel = new HashMap<>();
        this.cacheBoolChannel = new HashMap<>();
        this.cacheQueryCardsChannel = new HashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(byte[] bArr, Continuation<? super Unit> continuation) {
        DataTransferCallback dataTransferCallback = this.dataTransferCallback;
        if (dataTransferCallback != null) {
            dataTransferCallback.onReceive(bArr);
        }
        byte bFirst = ArraysKt___ArraysKt.first(bArr);
        if (bFirst == 2) {
            Object objOnQueryVersionBack = onQueryVersionBack(bArr, continuation);
            return objOnQueryVersionBack == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objOnQueryVersionBack : Unit.INSTANCE;
        }
        if (bFirst == 4) {
            Object objOnQueryDisplayMattersSettingsBack = onQueryDisplayMattersSettingsBack(bArr, continuation);
            return objOnQueryDisplayMattersSettingsBack == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objOnQueryDisplayMattersSettingsBack : Unit.INSTANCE;
        }
        if (bFirst == 6) {
            Object objOnUpdateDisplayMattersBack = onUpdateDisplayMattersBack(bArr, continuation);
            return objOnUpdateDisplayMattersBack == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objOnUpdateDisplayMattersBack : Unit.INSTANCE;
        }
        if (bFirst == 8) {
            Object objOnQueryCardSettingBack = onQueryCardSettingBack(bArr, continuation);
            return objOnQueryCardSettingBack == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objOnQueryCardSettingBack : Unit.INSTANCE;
        }
        if (bFirst != 10) {
            return Unit.INSTANCE;
        }
        Object objOnUpdateCardSettingBack = onUpdateCardSettingBack(bArr, continuation);
        return objOnUpdateCardSettingBack == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objOnUpdateCardSettingBack : Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return Dispatchers.getIO();
    }

    @Override // com.huami.bluetooth.profile.channel.module.assistant.AssistantApi
    public int moduleId() {
        return 9;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bluetooth.profile.channel.module.assistant.AssistantDataBackApi
    @Nullable
    public Object onQueryCardSettingBack(@NotNull byte[] bArr, @NotNull Continuation<? super Response<List<AppCardsResponse>>> continuation) {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.d = i2 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = bVar.d;
        if (i3 != 0) {
            if (i3 == 1) {
                ResultKt.throwOnFailure(obj);
                return null;
            }
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Success success = (Success) bVar.a;
            ResultKt.throwOnFailure(obj);
            return success;
        }
        ResultKt.throwOnFailure(obj);
        if (bArr.length < 2) {
            Channel<Response<List<AppCardsResponse>>> channel = this.cacheQueryCardsChannel.get(Boxing.boxByte((byte) 7));
            if (channel == null) {
                return null;
            }
            Failure failureFail = Response.INSTANCE.fail("数据错误", 7);
            bVar.d = 1;
            if (channel.send(failureFail, bVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return null;
        }
        int i4 = ByteUtilsKt.toInt(bArr, 1, 1);
        ArrayList arrayList = new ArrayList();
        int iDecode = 2;
        for (int i5 = 0; i5 < i4; i5++) {
            Boxing.boxInt(i5).intValue();
            ItemDto itemDto = new ItemDto();
            iDecode = BinaryDecoder.decode(itemDto, bArr, iDecode);
            arrayList.add(itemDto);
        }
        Response.Companion companion = Response.INSTANCE;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((ItemDto) it2.next()).convert());
        }
        Success success2 = companion.success(arrayList2);
        Channel<Response<List<AppCardsResponse>>> channel2 = this.cacheQueryCardsChannel.get(Boxing.boxByte((byte) 7));
        if (channel2 == null) {
            return success2;
        }
        bVar.a = success2;
        bVar.d = 2;
        return channel2.send(success2, bVar) == coroutine_suspended ? coroutine_suspended : success2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bluetooth.profile.channel.module.assistant.AssistantDataBackApi
    @Nullable
    public Object onQueryDisplayMattersSettingsBack(@NotNull byte[] bArr, @NotNull Continuation<? super Success<Boolean>> continuation) {
        c cVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i2 = cVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.d = i2 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object obj = cVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = cVar.d;
        if (i3 != 0) {
            if (i3 == 1) {
                ResultKt.throwOnFailure(obj);
                return null;
            }
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Success success = (Success) cVar.a;
            ResultKt.throwOnFailure(obj);
            return success;
        }
        ResultKt.throwOnFailure(obj);
        if (bArr.length >= 2) {
            Success success2 = Response.INSTANCE.success(Boxing.boxBoolean(ByteUtilsKt.toBoolean(bArr[1])));
            Channel<Response<Boolean>> channel = this.cacheBoolChannel.get(Boxing.boxByte((byte) 3));
            if (channel == null) {
                return success2;
            }
            cVar.a = success2;
            cVar.d = 2;
            return channel.send(success2, cVar) == coroutine_suspended ? coroutine_suspended : success2;
        }
        Channel<Response<Boolean>> channel2 = this.cacheBoolChannel.get(Boxing.boxByte((byte) 3));
        if (channel2 == null) {
            return null;
        }
        Failure failureFail = Response.INSTANCE.fail("Return settings命令 检查失败", 3);
        cVar.d = 1;
        if (channel2.send(failureFail, cVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bluetooth.profile.channel.module.assistant.AssistantDataBackApi
    @Nullable
    public Object onQueryVersionBack(@NotNull byte[] bArr, @NotNull Continuation<? super Response<Integer>> continuation) {
        d dVar;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i2 = dVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.d = i2 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object obj = dVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = dVar.d;
        if (i3 != 0) {
            if (i3 == 1) {
                ResultKt.throwOnFailure(obj);
                return null;
            }
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Success success = (Success) dVar.a;
            ResultKt.throwOnFailure(obj);
            return success;
        }
        ResultKt.throwOnFailure(obj);
        if (bArr.length >= 2) {
            Success success2 = Response.INSTANCE.success(Boxing.boxInt(GattUtils.bytesToInt(bArr, 1, 1)));
            Channel<Response<Integer>> channel = this.cacheChannel.get(Boxing.boxByte((byte) 1));
            if (channel == null) {
                return success2;
            }
            dVar.a = success2;
            dVar.d = 2;
            return channel.send(success2, dVar) == coroutine_suspended ? coroutine_suspended : success2;
        }
        Channel<Response<Boolean>> channel2 = this.cacheBoolChannel.get(Boxing.boxByte((byte) 1));
        if (channel2 == null) {
            return null;
        }
        Failure failureFail = Response.INSTANCE.fail("Return version命令 检查失败", 1);
        dVar.d = 1;
        if (channel2.send(failureFail, dVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bluetooth.profile.channel.module.assistant.AssistantDataBackApi
    @Nullable
    public Object onUpdateCardSettingBack(@NotNull byte[] bArr, @NotNull Continuation<? super Response<Boolean>> continuation) {
        e eVar;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i2 = eVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.d = i2 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object obj = eVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = eVar.d;
        if (i3 != 0) {
            if (i3 == 1) {
                ResultKt.throwOnFailure(obj);
                return null;
            }
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Success success = (Success) eVar.a;
            ResultKt.throwOnFailure(obj);
            return success;
        }
        ResultKt.throwOnFailure(obj);
        if (bArr.length >= 2) {
            Success success2 = Response.INSTANCE.success(Boxing.boxBoolean(ByteUtilsKt.toBoolean(bArr[1])));
            Channel<Response<Boolean>> channel = this.cacheBoolChannel.get(Boxing.boxByte((byte) 9));
            if (channel == null) {
                return success2;
            }
            eVar.a = success2;
            eVar.d = 2;
            return channel.send(success2, eVar) == coroutine_suspended ? coroutine_suspended : success2;
        }
        Channel<Response<List<AppCardsResponse>>> channel2 = this.cacheQueryCardsChannel.get(Boxing.boxByte((byte) 9));
        if (channel2 == null) {
            return null;
        }
        Failure failureFail = Response.INSTANCE.fail("数据错误", 9);
        eVar.d = 1;
        if (channel2.send(failureFail, eVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bluetooth.profile.channel.module.assistant.AssistantDataBackApi
    @Nullable
    public Object onUpdateDisplayMattersBack(@NotNull byte[] bArr, @NotNull Continuation<? super Success<Boolean>> continuation) {
        f fVar;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i2 = fVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.d = i2 - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        Object obj = fVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = fVar.d;
        if (i3 != 0) {
            if (i3 == 1) {
                ResultKt.throwOnFailure(obj);
                return null;
            }
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Success success = (Success) fVar.a;
            ResultKt.throwOnFailure(obj);
            return success;
        }
        ResultKt.throwOnFailure(obj);
        if (bArr.length >= 2) {
            Success success2 = Response.INSTANCE.success(Boxing.boxBoolean(ByteUtilsKt.toBoolean(bArr[1])));
            Channel<Response<Boolean>> channel = this.cacheBoolChannel.get(Boxing.boxByte((byte) 5));
            if (channel == null) {
                return success2;
            }
            fVar.a = success2;
            fVar.d = 2;
            return channel.send(success2, fVar) == coroutine_suspended ? coroutine_suspended : success2;
        }
        Channel<Response<Boolean>> channel2 = this.cacheBoolChannel.get(Boxing.boxByte((byte) 5));
        if (channel2 == null) {
            return null;
        }
        Failure failureFail = Response.INSTANCE.fail("Update settings result命令 检查失败", 5);
        fVar.d = 1;
        if (channel2.send(failureFail, fVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bluetooth.profile.channel.module.assistant.AssistantApi
    @Nullable
    public Object queryCardSetting(@NotNull Continuation<? super Response<List<AppCardsResponse>>> continuation) {
        g gVar;
        AssistantV1Impl assistantV1Impl;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i2 = gVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.d = i2 - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        Object objWithTimeout = gVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = gVar.d;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objWithTimeout);
            this.cacheQueryCardsChannel.put(Boxing.boxByte((byte) 7), ChannelKt.Channel$default(0, 1, null));
            BaseModule.sendData$default(this.module, new byte[]{7}, 0, 2, null);
            h hVar = new h(null);
            gVar.a = this;
            gVar.d = 1;
            objWithTimeout = TimeoutKt.withTimeout(3000L, hVar, gVar);
            if (objWithTimeout == coroutine_suspended) {
                return coroutine_suspended;
            }
            assistantV1Impl = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            assistantV1Impl = (AssistantV1Impl) gVar.a;
            ResultKt.throwOnFailure(objWithTimeout);
        }
        Object objTimeout = (Response) objWithTimeout;
        if (objTimeout == null) {
            objTimeout = Response.INSTANCE.timeout();
        }
        assistantV1Impl.cacheQueryCardsChannel.remove(Boxing.boxByte((byte) 7));
        return objTimeout;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bluetooth.profile.channel.module.assistant.AssistantApi
    @Nullable
    public Object queryDisplayMattersSettings(@NotNull Continuation<? super Response<Boolean>> continuation) {
        i iVar;
        AssistantV1Impl assistantV1Impl;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i2 = iVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.d = i2 - Integer.MIN_VALUE;
            } else {
                iVar = new i(continuation);
            }
        } else {
            iVar = new i(continuation);
        }
        Object objWithTimeout = iVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = iVar.d;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objWithTimeout);
            this.cacheBoolChannel.put(Boxing.boxByte((byte) 3), ChannelKt.Channel$default(0, 1, null));
            byte[] bArr = {3};
            BaseModule.sendData$default(this.module, bArr, 0, 2, null);
            DataTransferCallback dataTransferCallback = this.dataTransferCallback;
            if (dataTransferCallback != null) {
                dataTransferCallback.onSend(bArr);
            }
            j jVar = new j(null);
            iVar.a = this;
            iVar.d = 1;
            objWithTimeout = TimeoutKt.withTimeout(3000L, jVar, iVar);
            if (objWithTimeout == coroutine_suspended) {
                return coroutine_suspended;
            }
            assistantV1Impl = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            assistantV1Impl = (AssistantV1Impl) iVar.a;
            ResultKt.throwOnFailure(objWithTimeout);
        }
        Object objTimeout = (Response) objWithTimeout;
        if (objTimeout == null) {
            objTimeout = Response.INSTANCE.timeout();
        }
        assistantV1Impl.cacheBoolChannel.remove(Boxing.boxByte((byte) 3));
        return objTimeout;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bluetooth.profile.channel.module.assistant.AssistantApi
    @Nullable
    public Object queryVersion(@NotNull Continuation<? super Response<Integer>> continuation) {
        k kVar;
        AssistantV1Impl assistantV1Impl;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i2 = kVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.d = i2 - Integer.MIN_VALUE;
            } else {
                kVar = new k(continuation);
            }
        } else {
            kVar = new k(continuation);
        }
        Object objWithTimeout = kVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = kVar.d;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objWithTimeout);
            this.cacheChannel.put(Boxing.boxByte((byte) 1), ChannelKt.Channel$default(0, 1, null));
            byte[] bArr = {1};
            DataTransferCallback dataTransferCallback = this.dataTransferCallback;
            if (dataTransferCallback != null) {
                dataTransferCallback.onSend(bArr);
            }
            BaseModule.sendData$default(this.module, bArr, 0, 2, null);
            l lVar = new l(null);
            kVar.a = this;
            kVar.d = 1;
            objWithTimeout = TimeoutKt.withTimeout(3000L, lVar, kVar);
            if (objWithTimeout == coroutine_suspended) {
                return coroutine_suspended;
            }
            assistantV1Impl = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            assistantV1Impl = (AssistantV1Impl) kVar.a;
            ResultKt.throwOnFailure(objWithTimeout);
        }
        Object objTimeout = (Response) objWithTimeout;
        if (objTimeout == null) {
            objTimeout = Response.INSTANCE.timeout();
        }
        assistantV1Impl.cacheChannel.remove(Boxing.boxByte((byte) 1));
        return objTimeout;
    }

    @Override // com.huami.bluetooth.profile.channel.module.assistant.AssistantApi
    public void register(@NotNull DataTransferCallback callback) {
        this.dataTransferCallback = callback;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bluetooth.profile.channel.module.assistant.AssistantApi
    @Nullable
    public Object updateCardSetting(@NotNull List<AppCardsUpdateRequest> list, @NotNull Continuation<? super Response<Boolean>> continuation) {
        m mVar;
        AssistantV1Impl assistantV1Impl;
        if (continuation instanceof m) {
            mVar = (m) continuation;
            int i2 = mVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mVar.d = i2 - Integer.MIN_VALUE;
            } else {
                mVar = new m(continuation);
            }
        } else {
            mVar = new m(continuation);
        }
        Object objWithTimeout = mVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = mVar.d;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objWithTimeout);
            this.cacheBoolChannel.put(Boxing.boxByte((byte) 9), ChannelKt.Channel$default(0, 1, null));
            byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus(new byte[]{9}, (byte) list.size());
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                bArrPlus = ArraysKt___ArraysJvmKt.plus(bArrPlus, ((AppCardsUpdateRequest) it2.next()).toBytes());
            }
            BaseModule.sendData$default(this.module, bArrPlus, 0, 2, null);
            DataTransferCallback dataTransferCallback = this.dataTransferCallback;
            if (dataTransferCallback != null) {
                dataTransferCallback.onSend(bArrPlus);
            }
            n nVar = new n(null);
            mVar.a = this;
            mVar.d = 1;
            objWithTimeout = TimeoutKt.withTimeout(3000L, nVar, mVar);
            if (objWithTimeout == coroutine_suspended) {
                return coroutine_suspended;
            }
            assistantV1Impl = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            assistantV1Impl = (AssistantV1Impl) mVar.a;
            ResultKt.throwOnFailure(objWithTimeout);
        }
        Object objTimeout = (Response) objWithTimeout;
        if (objTimeout == null) {
            objTimeout = Response.INSTANCE.timeout();
        }
        assistantV1Impl.cacheBoolChannel.remove(Boxing.boxByte((byte) 9));
        return objTimeout;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bluetooth.profile.channel.module.assistant.AssistantApi
    @Nullable
    public Object updateDisplayMatters(boolean z, @NotNull Continuation<? super Response<Boolean>> continuation) {
        o oVar;
        AssistantV1Impl assistantV1Impl;
        if (continuation instanceof o) {
            oVar = (o) continuation;
            int i2 = oVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oVar.d = i2 - Integer.MIN_VALUE;
            } else {
                oVar = new o(continuation);
            }
        } else {
            oVar = new o(continuation);
        }
        Object objWithTimeout = oVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = oVar.d;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objWithTimeout);
            this.cacheBoolChannel.put(Boxing.boxByte((byte) 5), ChannelKt.Channel$default(0, 1, null));
            BaseModule.sendData$default(this.module, new byte[]{5, ByteUtilsKt.toByte(z)}, 0, 2, null);
            p pVar = new p(null);
            oVar.a = this;
            oVar.d = 1;
            objWithTimeout = TimeoutKt.withTimeout(3000L, pVar, oVar);
            if (objWithTimeout == coroutine_suspended) {
                return coroutine_suspended;
            }
            assistantV1Impl = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            assistantV1Impl = (AssistantV1Impl) oVar.a;
            ResultKt.throwOnFailure(objWithTimeout);
        }
        Object objTimeout = (Response) objWithTimeout;
        if (objTimeout == null) {
            objTimeout = Response.INSTANCE.timeout();
        }
        assistantV1Impl.cacheBoolChannel.remove(Boxing.boxByte((byte) 5));
        return objTimeout;
    }
}
