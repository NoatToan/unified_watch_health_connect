package com.huami.bluetooth.profile.channel.module.assistant.v2;

import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.assistant.QuickCardApi;
import com.huami.bluetooth.profile.channel.module.assistant.dto.QueryDto;
import com.huami.bluetooth.profile.channel.module.binary.BinaryDecoder;
import com.huami.bluetooth.profile.channel.module.binary.BinaryEncoder;
import com.huami.bluetooth.profile.channel.module.binary.struct.UInt8;
import com.huami.bluetooth.profile.channel.module.ex.NoResponseException;
import com.huami.bluetooth.profile.channel.module.phone.dto.UpdateDto;
import com.huami.bluetooth.profile.channel.module.phone.dto.VersionDto;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.debug.Debug;
import io.netty.util.internal.StringUtil;
import java.nio.charset.Charset;
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
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.TimeoutKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0002\u0018\u001dB\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0004J\u001b\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0004J!\u0010\u000e\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R2\u0010\u001a\u001a\u001e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014j\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016`\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/assistant/v2/QuickCardApiImpl;", "Lcom/huami/bluetooth/profile/channel/module/assistant/QuickCardApi;", "", "queryVersion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "queryDisplayMattersSetting", "isDisplay", "updateDisplayMatters", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/huami/bluetooth/profile/channel/module/assistant/v2/QuickCardStruct$QueryCardsResponseItem;", "queryCardSetting", "items", "updateCardsSetting", "(Ljava/lang/Iterable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "a", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "module", "Ljava/util/HashMap;", "", "Lcom/huami/bluetooth/profile/channel/module/assistant/v2/QuickCardApiImpl$b;", "Lkotlin/collections/HashMap;", "b", "Ljava/util/HashMap;", "callbackSet", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/BaseModule;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class QuickCardApiImpl implements QuickCardApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String c = "QuickCard";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final BaseModule module;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final HashMap<Byte, b> callbackSet = new HashMap<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/assistant/v2/QuickCardApiImpl$Companion;", "", "", "prefix", "message", "", "a", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ String a;
            public final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, String str2) {
                super(0);
                this.a = str;
                this.b = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return this.a + StringUtil.SPACE + this.b;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void a(String prefix, String message) {
            HMLog.info(QuickCardApiImpl.c, new a(prefix, message));
        }

        public static /* synthetic */ void b(Companion companion, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "";
            }
            companion.a(str, str2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", AbstractJSONTokenResponse.RESPONSE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.assistant.v2.QuickCardApiImpl$1", f = "QuickCardApiImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<byte[], Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

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
            a aVar = QuickCardApiImpl.this.new a(continuation);
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
            b bVar = (b) QuickCardApiImpl.this.callbackSet.get(Boxing.boxByte(ArraysKt___ArraysKt.first(bArr)));
            if (bVar != null) {
                bVar.action(bArr);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bb\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"com/huami/bluetooth/profile/channel/module/assistant/v2/QuickCardApiImpl$b", "", "", "it", "", "action", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public interface b {
        void action(@NotNull byte[] it2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.assistant.v2.QuickCardApiImpl", f = "QuickCardApiImpl.kt", i = {}, l = {126, 127}, m = "queryCardSetting", n = {}, s = {})
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
            return QuickCardApiImpl.this.queryCardSetting(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/huami/bluetooth/profile/channel/module/assistant/v2/QuickCardStruct$QueryCardsResponseItem;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.assistant.v2.QuickCardApiImpl$queryCardSetting$3", f = "QuickCardApiImpl.kt", i = {}, l = {128}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends QuickCardStruct.QueryCardsResponseItem>>, Object> {
        public int a;
        public final /* synthetic */ CompletableDeferred<Iterable<ItemDto>> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(CompletableDeferred<Iterable<ItemDto>> completableDeferred, Continuation<? super d> continuation) {
            super(2, continuation);
            this.b = completableDeferred;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new d(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends QuickCardStruct.QueryCardsResponseItem>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<QuickCardStruct.QueryCardsResponseItem>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<QuickCardStruct.QueryCardsResponseItem>> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CompletableDeferred<Iterable<ItemDto>> completableDeferred = this.b;
                this.a = 1;
                obj = completableDeferred.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                arrayList.add(QuickCardStruct.INSTANCE.item2ResponseItem((ItemDto) it2.next()));
            }
            return arrayList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.assistant.v2.QuickCardApiImpl", f = "QuickCardApiImpl.kt", i = {}, l = {88, 89}, m = "queryDisplayMattersSetting", n = {}, s = {})
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
            return QuickCardApiImpl.this.queryDisplayMattersSetting(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.assistant.v2.QuickCardApiImpl$queryDisplayMattersSetting$3", f = "QuickCardApiImpl.kt", i = {}, l = {90, 91}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ CompletableDeferred<QueryDto> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(CompletableDeferred<QueryDto> completableDeferred, Continuation<? super f> continuation) {
            super(2, continuation);
            this.c = completableDeferred;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new f(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            String str;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i != 0) {
                if (i == 1) {
                    str = (String) this.a;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return ((QueryDto) obj).displayMatters;
            }
            ResultKt.throwOnFailure(obj);
            str = "LOG";
            CompletableDeferred<QueryDto> completableDeferred = this.c;
            this.a = "LOG";
            this.b = 1;
            obj = completableDeferred.await(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            Debug.fi(str, String.valueOf(obj));
            CompletableDeferred<QueryDto> completableDeferred2 = this.c;
            this.a = null;
            this.b = 2;
            obj = completableDeferred2.await(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            return ((QueryDto) obj).displayMatters;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.assistant.v2.QuickCardApiImpl", f = "QuickCardApiImpl.kt", i = {}, l = {68, 70}, m = "queryVersion", n = {}, s = {})
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
            return QuickCardApiImpl.this.queryVersion(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.assistant.v2.QuickCardApiImpl$queryVersion$3", f = "QuickCardApiImpl.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
        public int a;
        public final /* synthetic */ CompletableDeferred<VersionDto> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(CompletableDeferred<VersionDto> completableDeferred, Continuation<? super h> continuation) {
            super(2, continuation);
            this.b = completableDeferred;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new h(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Integer> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CompletableDeferred<VersionDto> completableDeferred = this.b;
                this.a = 1;
                obj = completableDeferred.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return ((VersionDto) obj).versionNumber.ensureValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.assistant.v2.QuickCardApiImpl", f = "QuickCardApiImpl.kt", i = {}, l = {148, 159}, m = "updateCardsSetting", n = {}, s = {})
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
            return QuickCardApiImpl.this.updateCardsSetting(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.assistant.v2.QuickCardApiImpl$updateCardsSetting$3", f = "QuickCardApiImpl.kt", i = {}, l = {157}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ List<ItemDto> b;
        public final /* synthetic */ QuickCardApiImpl c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(List<? extends ItemDto> list, QuickCardApiImpl quickCardApiImpl, Continuation<? super j> continuation) {
            super(2, continuation);
            this.b = list;
            this.c = quickCardApiImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new j(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus(new byte[]{9}, new UInt8(this.b.size()).toBytes());
                new BinaryEncoder();
                int size = this.b.size();
                List<ItemDto> list = this.b;
                byte[] bArrPlus2 = bArrPlus;
                for (int i2 = 0; i2 < size; i2++) {
                    int iIntValue = Boxing.boxInt(i2).intValue();
                    bArrPlus2 = ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(bArrPlus2, ArraysKt___ArraysJvmKt.plus(list.get(iIntValue).appId.getBytes(Charset.defaultCharset()), new byte[]{0})), ArraysKt___ArraysJvmKt.plus(list.get(iIntValue).cardId.getBytes(Charset.defaultCharset()), new byte[]{0})), ByteUtilsKt.toByte(list.get(iIntValue).visible));
                }
                BaseModule baseModule = this.c.module;
                this.a = 1;
                obj = BaseModule.sendDataWithResult$default(baseModule, bArrPlus2, 0, false, this, 6, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.assistant.v2.QuickCardApiImpl$updateCardsSetting$4", f = "QuickCardApiImpl.kt", i = {}, l = {160}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ CompletableDeferred<UpdateDto> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(CompletableDeferred<UpdateDto> completableDeferred, Continuation<? super k> continuation) {
            super(2, continuation);
            this.b = completableDeferred;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new k(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CompletableDeferred<UpdateDto> completableDeferred = this.b;
                this.a = 1;
                obj = completableDeferred.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return ((UpdateDto) obj).isSuccess;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.assistant.v2.QuickCardApiImpl", f = "QuickCardApiImpl.kt", i = {}, l = {105, 106}, m = "updateDisplayMatters", n = {}, s = {})
    public static final class l extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public l(Continuation<? super l> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return QuickCardApiImpl.this.updateDisplayMatters(false, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.assistant.v2.QuickCardApiImpl$updateDisplayMatters$3", f = "QuickCardApiImpl.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {})
    public static final class m extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ CompletableDeferred<UpdateDto> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(CompletableDeferred<UpdateDto> completableDeferred, Continuation<? super m> continuation) {
            super(2, continuation);
            this.b = completableDeferred;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new m(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CompletableDeferred<UpdateDto> completableDeferred = this.b;
                this.a = 1;
                obj = completableDeferred.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return ((UpdateDto) obj).isSuccess;
        }
    }

    public QuickCardApiImpl(@NotNull BaseModule baseModule) {
        this.module = baseModule;
        baseModule.registerMessageCallback(new a(null));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0085  */
    /* JADX WARN: Code duplicated, block: B:27:0x0091  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bluetooth.profile.channel.module.assistant.QuickCardApi
    @Nullable
    public Object queryCardSetting(@NotNull Continuation<? super Iterable<QuickCardStruct.QueryCardsResponseItem>> continuation) throws NoResponseException {
        c cVar;
        CompletableDeferred completableDeferred;
        List list;
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
        Object objWithTimeoutOrNull = cVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = cVar.d;
        if (i3 != 0) {
            if (i3 == 1) {
                completableDeferred = (CompletableDeferred) cVar.a;
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            }
            list = (List) objWithTimeoutOrNull;
            if (list != null) {
                throw new NoResponseException("queryCardSetting no response !!");
            }
            INSTANCE.a("queryCardSetting", list.toString());
            return list;
        }
        ResultKt.throwOnFailure(objWithTimeoutOrNull);
        final CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this.callbackSet.put(Boxing.boxByte((byte) 8), new b() { // from class: com.huami.bluetooth.profile.channel.module.assistant.v2.QuickCardApiImpl.queryCardSetting.2
            @Override // com.huami.bluetooth.profile.channel.module.assistant.v2.QuickCardApiImpl.b
            public void action(@NotNull byte[] byteArray) {
                ArrayList arrayList = new ArrayList();
                int i4 = UInt8.INSTANCE.toInt(byteArray[1]);
                int iDecode = 2;
                for (int i5 = 0; i5 < i4; i5++) {
                    ItemDto itemDto = new ItemDto();
                    iDecode = BinaryDecoder.decode(itemDto, byteArray, iDecode);
                    arrayList.add(itemDto);
                }
                completableDeferredCompletableDeferred$default.complete(arrayList);
            }
        });
        BaseModule baseModule = this.module;
        byte[] bArr = {7};
        cVar.a = completableDeferredCompletableDeferred$default;
        cVar.d = 1;
        if (BaseModule.sendDataWithResult$default(baseModule, bArr, 0, false, cVar, 6, null) == coroutine_suspended) {
            return coroutine_suspended;
        }
        completableDeferred = completableDeferredCompletableDeferred$default;
        d dVar = new d(completableDeferred, null);
        cVar.a = null;
        cVar.d = 2;
        objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(3000L, dVar, cVar);
        if (objWithTimeoutOrNull == coroutine_suspended) {
            return coroutine_suspended;
        }
        list = (List) objWithTimeoutOrNull;
        if (list != null) {
            throw new NoResponseException("queryCardSetting no response !!");
        }
        INSTANCE.a("queryCardSetting", list.toString());
        return list;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0089  */
    /* JADX WARN: Code duplicated, block: B:27:0x0092  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bluetooth.profile.channel.module.assistant.QuickCardApi
    @Nullable
    public Object queryDisplayMattersSetting(@NotNull Continuation<? super Boolean> continuation) throws NoResponseException {
        e eVar;
        CompletableDeferred completableDeferred;
        Boolean bool;
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
        Object objWithTimeoutOrNull = eVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = eVar.d;
        if (i3 != 0) {
            if (i3 == 1) {
                completableDeferred = (CompletableDeferred) eVar.a;
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            }
            bool = (Boolean) objWithTimeoutOrNull;
            if (bool != null) {
                return Boxing.boxBoolean(bool.booleanValue());
            }
            throw new NoResponseException("queryDisplayMattersSetting No response");
        }
        ResultKt.throwOnFailure(objWithTimeoutOrNull);
        final QueryDto queryDto = new QueryDto();
        final CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        byte[] bArr = {3};
        this.callbackSet.put(Boxing.boxByte((byte) 4), new b() { // from class: com.huami.bluetooth.profile.channel.module.assistant.v2.QuickCardApiImpl.queryDisplayMattersSetting.2
            @Override // com.huami.bluetooth.profile.channel.module.assistant.v2.QuickCardApiImpl.b
            public void action(@NotNull byte[] it2) {
                BinaryDecoder.decode(queryDto, it2);
                completableDeferredCompletableDeferred$default.complete(queryDto);
            }
        });
        BaseModule baseModule = this.module;
        eVar.a = completableDeferredCompletableDeferred$default;
        eVar.d = 1;
        if (BaseModule.sendDataWithResult$default(baseModule, bArr, 0, false, eVar, 6, null) == coroutine_suspended) {
            return coroutine_suspended;
        }
        completableDeferred = completableDeferredCompletableDeferred$default;
        f fVar = new f(completableDeferred, null);
        eVar.a = null;
        eVar.d = 2;
        objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(3000L, fVar, eVar);
        if (objWithTimeoutOrNull == coroutine_suspended) {
            return coroutine_suspended;
        }
        bool = (Boolean) objWithTimeoutOrNull;
        if (bool != null) {
            return Boxing.boxBoolean(bool.booleanValue());
        }
        throw new NoResponseException("queryDisplayMattersSetting No response");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bluetooth.profile.channel.module.assistant.QuickCardApi
    @Nullable
    public Object queryVersion(@NotNull Continuation<? super Integer> continuation) {
        g gVar;
        int iIntValue;
        CompletableDeferred completableDeferred;
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
        try {
            if (i3 != 0) {
                if (i3 == 1) {
                    completableDeferred = (CompletableDeferred) gVar.a;
                    ResultKt.throwOnFailure(objWithTimeout);
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objWithTimeout);
                }
                iIntValue = ((Number) objWithTimeout).intValue();
                return Boxing.boxInt(iIntValue);
            }
            ResultKt.throwOnFailure(objWithTimeout);
            final VersionDto versionDto = new VersionDto();
            final CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            this.callbackSet.put(Boxing.boxByte((byte) 1), new b() { // from class: com.huami.bluetooth.profile.channel.module.assistant.v2.QuickCardApiImpl.queryVersion.2
                @Override // com.huami.bluetooth.profile.channel.module.assistant.v2.QuickCardApiImpl.b
                public void action(@NotNull byte[] it2) {
                    BinaryDecoder.decode(versionDto, it2);
                    versionDto.versionNumber.ensureValue();
                    completableDeferredCompletableDeferred$default.complete(versionDto);
                }
            });
            byte[] bArr = {1};
            BaseModule baseModule = this.module;
            gVar.a = completableDeferredCompletableDeferred$default;
            gVar.d = 1;
            if (BaseModule.sendDataWithResult$default(baseModule, bArr, 0, false, gVar, 6, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            completableDeferred = completableDeferredCompletableDeferred$default;
            h hVar = new h(completableDeferred, null);
            gVar.a = null;
            gVar.d = 2;
            objWithTimeout = TimeoutKt.withTimeout(3000L, hVar, gVar);
            if (objWithTimeout == coroutine_suspended) {
                return coroutine_suspended;
            }
            iIntValue = ((Number) objWithTimeout).intValue();
        } catch (Exception unused) {
            iIntValue = -1;
        }
        return Boxing.boxInt(iIntValue);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bluetooth.profile.channel.module.assistant.QuickCardApi
    @Nullable
    public Object updateCardsSetting(@NotNull Iterable<QuickCardStruct.QueryCardsResponseItem> iterable, @NotNull Continuation<? super Boolean> continuation) throws NoResponseException {
        i iVar;
        CompletableDeferred completableDeferred;
        Boolean bool;
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
        Object objWithTimeoutOrNull = iVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = iVar.d;
        if (i3 != 0) {
            if (i3 == 1) {
                completableDeferred = (CompletableDeferred) iVar.a;
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            }
            bool = (Boolean) objWithTimeoutOrNull;
            if (bool != null) {
                return Boxing.boxBoolean(bool.booleanValue());
            }
            throw new NoResponseException("updateCardsSetting no response !!");
        }
        ResultKt.throwOnFailure(objWithTimeoutOrNull);
        INSTANCE.a("updateCardsSetting", iterable.toString());
        final UpdateDto updateDto = new UpdateDto();
        final CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this.callbackSet.put(Boxing.boxByte((byte) 10), new b() { // from class: com.huami.bluetooth.profile.channel.module.assistant.v2.QuickCardApiImpl.updateCardsSetting.2
            @Override // com.huami.bluetooth.profile.channel.module.assistant.v2.QuickCardApiImpl.b
            public void action(@NotNull byte[] it2) {
                BinaryDecoder.decode(updateDto, it2);
                completableDeferredCompletableDeferred$default.complete(updateDto);
            }
        });
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        Iterator<QuickCardStruct.QueryCardsResponseItem> it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList.add(QuickCardStruct.INSTANCE.responseItem2dto(it2.next()));
        }
        CoroutineDispatcher io2 = Dispatchers.getIO();
        j jVar = new j(arrayList, this, null);
        iVar.a = completableDeferredCompletableDeferred$default;
        iVar.d = 1;
        if (BuildersKt.withContext(io2, jVar, iVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        completableDeferred = completableDeferredCompletableDeferred$default;
        k kVar = new k(completableDeferred, null);
        iVar.a = null;
        iVar.d = 2;
        objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(3000L, kVar, iVar);
        if (objWithTimeoutOrNull == coroutine_suspended) {
            return coroutine_suspended;
        }
        bool = (Boolean) objWithTimeoutOrNull;
        if (bool != null) {
            return Boxing.boxBoolean(bool.booleanValue());
        }
        throw new NoResponseException("updateCardsSetting no response !!");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0097  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bluetooth.profile.channel.module.assistant.QuickCardApi
    @Nullable
    public Object updateDisplayMatters(boolean z, @NotNull Continuation<? super Boolean> continuation) throws NoResponseException {
        l lVar;
        CompletableDeferred completableDeferred;
        Boolean bool;
        if (continuation instanceof l) {
            lVar = (l) continuation;
            int i2 = lVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lVar.d = i2 - Integer.MIN_VALUE;
            } else {
                lVar = new l(continuation);
            }
        } else {
            lVar = new l(continuation);
        }
        Object objWithTimeoutOrNull = lVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = lVar.d;
        if (i3 != 0) {
            if (i3 == 1) {
                completableDeferred = (CompletableDeferred) lVar.a;
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            }
            bool = (Boolean) objWithTimeoutOrNull;
            if (bool != null) {
                return Boxing.boxBoolean(bool.booleanValue());
            }
            throw new NoResponseException("updateDisplayMatters  Not response!!");
        }
        ResultKt.throwOnFailure(objWithTimeoutOrNull);
        final UpdateDto updateDto = new UpdateDto();
        final CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this.callbackSet.put(Boxing.boxByte((byte) 6), new b() { // from class: com.huami.bluetooth.profile.channel.module.assistant.v2.QuickCardApiImpl.updateDisplayMatters.2
            @Override // com.huami.bluetooth.profile.channel.module.assistant.v2.QuickCardApiImpl.b
            public void action(@NotNull byte[] it2) {
                BinaryDecoder.decode(updateDto, it2);
                completableDeferredCompletableDeferred$default.complete(updateDto);
            }
        });
        byte[] bArr = {5, ByteUtilsKt.toByte(z)};
        BaseModule baseModule = this.module;
        lVar.a = completableDeferredCompletableDeferred$default;
        lVar.d = 1;
        if (BaseModule.sendDataWithResult$default(baseModule, bArr, 0, false, lVar, 6, null) == coroutine_suspended) {
            return coroutine_suspended;
        }
        completableDeferred = completableDeferredCompletableDeferred$default;
        m mVar = new m(completableDeferred, null);
        lVar.a = null;
        lVar.d = 2;
        objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(3000L, mVar, lVar);
        if (objWithTimeoutOrNull == coroutine_suspended) {
            return coroutine_suspended;
        }
        bool = (Boolean) objWithTimeoutOrNull;
        if (bool != null) {
            return Boxing.boxBoolean(bool.booleanValue());
        }
        throw new NoResponseException("updateDisplayMatters  Not response!!");
    }
}
