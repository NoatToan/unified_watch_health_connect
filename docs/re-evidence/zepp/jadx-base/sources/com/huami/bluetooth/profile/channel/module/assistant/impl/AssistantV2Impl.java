package com.huami.bluetooth.profile.channel.module.assistant.impl;

import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.assistant.AssistantApiV2;
import com.huami.bluetooth.profile.channel.module.assistant.dto.AppCardItemDto;
import com.huami.bluetooth.profile.channel.module.assistant.dto.ItemDto;
import com.huami.bluetooth.profile.channel.module.assistant.dto.QueryDto;
import com.huami.bluetooth.profile.channel.module.binary.BinaryDecoder;
import com.huami.bluetooth.profile.channel.module.binary.BinaryEncoder;
import com.huami.bluetooth.profile.channel.module.binary.struct.UInt16;
import com.huami.bluetooth.profile.channel.module.binary.struct.UInt8;
import com.huami.bluetooth.profile.channel.module.ex.NoResponseException;
import com.huami.bluetooth.profile.channel.module.phone.dto.UpdateDto;
import com.huami.bluetooth.profile.channel.module.phone.dto.VersionDto;
import com.huami.bluetooth.utils.ByteUtilsKt;
import java.util.ArrayList;
import java.util.HashMap;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0002$%B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\"\u0010#J\u0013\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0005J\u001b\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0005J!\u0010\u000f\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u001a\u001a\u00020\u00158\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R2\u0010!\u001a\u001e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bj\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d`\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/assistant/impl/AssistantV2Impl;", "Lcom/huami/bluetooth/profile/channel/module/assistant/AssistantApiV2;", "Lkotlinx/coroutines/CoroutineScope;", "", "queryVersion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "queryDisplayMattersSetting", "isDisplay", "updateDisplayMatters", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/huami/bluetooth/profile/channel/module/assistant/dto/AppCardItemDto;", "queryCardSetting", "items", "updateCardsSetting", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "a", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "module", "Lkotlin/coroutines/CoroutineContext;", "b", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Ljava/util/HashMap;", "", "Lcom/huami/bluetooth/profile/channel/module/assistant/impl/AssistantV2Impl$FilterAction;", "Lkotlin/collections/HashMap;", "c", "Ljava/util/HashMap;", "callbackSet", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/BaseModule;)V", "Companion", "FilterAction", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class AssistantV2Impl implements AssistantApiV2, CoroutineScope {

    @NotNull
    public static final String TAG = "AssistantApi";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final BaseModule module;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final CoroutineContext coroutineContext = Dispatchers.getIO();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final HashMap<Byte, FilterAction> callbackSet = new HashMap<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003J\u0015\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0002HÆ\u0003J5\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0002HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R%\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R%\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/assistant/impl/AssistantV2Impl$FilterAction;", "", "Lkotlin/Function1;", "", "", "component1", "", "component2", "filter", "action", "copy", "", "toString", "", "hashCode", "other", "equals", "a", "Lkotlin/jvm/functions/Function1;", "getFilter", "()Lkotlin/jvm/functions/Function1;", "b", "getAction", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class FilterAction {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        private final Function1<byte[], Boolean> filter;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        private final Function1<byte[], Unit> action;

        /* JADX WARN: Multi-variable type inference failed */
        public FilterAction(@NotNull Function1<? super byte[], Boolean> function1, @NotNull Function1<? super byte[], Unit> function2) {
            this.filter = function1;
            this.action = function2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FilterAction copy$default(FilterAction filterAction, Function1 function1, Function1 function2, int i, Object obj) {
            if ((i & 1) != 0) {
                function1 = filterAction.filter;
            }
            if ((i & 2) != 0) {
                function2 = filterAction.action;
            }
            return filterAction.copy(function1, function2);
        }

        @NotNull
        public final Function1<byte[], Boolean> component1() {
            return this.filter;
        }

        @NotNull
        public final Function1<byte[], Unit> component2() {
            return this.action;
        }

        @NotNull
        public final FilterAction copy(@NotNull Function1<? super byte[], Boolean> filter, @NotNull Function1<? super byte[], Unit> action) {
            return new FilterAction(filter, action);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FilterAction)) {
                return false;
            }
            FilterAction filterAction = (FilterAction) other;
            return Intrinsics.areEqual(this.filter, filterAction.filter) && Intrinsics.areEqual(this.action, filterAction.action);
        }

        @NotNull
        public final Function1<byte[], Unit> getAction() {
            return this.action;
        }

        @NotNull
        public final Function1<byte[], Boolean> getFilter() {
            return this.filter;
        }

        public int hashCode() {
            return (this.filter.hashCode() * 31) + this.action.hashCode();
        }

        @NotNull
        public String toString() {
            return "FilterAction(filter=" + this.filter + ", action=" + this.action + ')';
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", AbstractJSONTokenResponse.RESPONSE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.assistant.impl.AssistantV2Impl$1", f = "AssistantV2Impl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
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
            a aVar = AssistantV2Impl.this.new a(continuation);
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
            for (FilterAction filterAction : AssistantV2Impl.this.callbackSet.values()) {
                if (filterAction.getFilter().invoke(bArr).booleanValue()) {
                    filterAction.getAction().invoke(bArr);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.assistant.impl.AssistantV2Impl", f = "AssistantV2Impl.kt", i = {}, l = {123, 124}, m = "queryCardSetting", n = {}, s = {})
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
            return AssistantV2Impl.this.queryCardSetting(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<byte[], Boolean> {
        public static final c a = new c();

        public c() {
            super(1);
        }

        public final boolean a(@NotNull byte[] bArr) {
            return ArraysKt___ArraysKt.first(bArr) == 8;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(byte[] bArr) {
            return Boolean.valueOf(a(bArr));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "byteArray", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<byte[], Unit> {
        public final /* synthetic */ CompletableDeferred<List<ItemDto>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(CompletableDeferred<List<ItemDto>> completableDeferred) {
            super(1);
            this.a = completableDeferred;
        }

        public final void a(@NotNull byte[] bArr) {
            ArrayList arrayList = new ArrayList();
            int i = UInt8.INSTANCE.toInt(bArr[1]);
            int iDecode = 2;
            for (int i2 = 0; i2 < i; i2++) {
                ItemDto itemDto = new ItemDto();
                iDecode = BinaryDecoder.decode(itemDto, bArr, iDecode);
                arrayList.add(itemDto);
            }
            this.a.complete(arrayList);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/huami/bluetooth/profile/channel/module/assistant/dto/AppCardItemDto;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.assistant.impl.AssistantV2Impl$queryCardSetting$4", f = "AssistantV2Impl.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends AppCardItemDto>>, Object> {
        public int a;
        public final /* synthetic */ CompletableDeferred<List<ItemDto>> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(CompletableDeferred<List<ItemDto>> completableDeferred, Continuation<? super e> continuation) {
            super(2, continuation);
            this.b = completableDeferred;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new e(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends AppCardItemDto>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<AppCardItemDto>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<AppCardItemDto>> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CompletableDeferred<List<ItemDto>> completableDeferred = this.b;
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
            Iterable<ItemDto> iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
            for (ItemDto itemDto : iterable) {
                arrayList.add(new AppCardItemDto(itemDto.type.ensureValue().intValue(), itemDto.isEnable));
            }
            return arrayList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.assistant.impl.AssistantV2Impl", f = "AssistantV2Impl.kt", i = {}, l = {82, 83}, m = "queryDisplayMattersSetting", n = {}, s = {})
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
            return AssistantV2Impl.this.queryDisplayMattersSetting(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<byte[], Boolean> {
        public static final g a = new g();

        public g() {
            super(1);
        }

        public final boolean a(@NotNull byte[] bArr) {
            return ArraysKt___ArraysKt.first(bArr) == 4;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(byte[] bArr) {
            return Boolean.valueOf(a(bArr));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function1<byte[], Unit> {
        public final /* synthetic */ QueryDto a;
        public final /* synthetic */ CompletableDeferred<QueryDto> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(QueryDto queryDto, CompletableDeferred<QueryDto> completableDeferred) {
            super(1);
            this.a = queryDto;
            this.b = completableDeferred;
        }

        public final void a(@NotNull byte[] bArr) {
            BinaryDecoder.decode(this.a, bArr);
            this.b.complete(this.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.assistant.impl.AssistantV2Impl$queryDisplayMattersSetting$4", f = "AssistantV2Impl.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ CompletableDeferred<QueryDto> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(CompletableDeferred<QueryDto> completableDeferred, Continuation<? super i> continuation) {
            super(2, continuation);
            this.b = completableDeferred;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new i(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CompletableDeferred<QueryDto> completableDeferred = this.b;
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
            return ((QueryDto) obj).displayMatters;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.assistant.impl.AssistantV2Impl", f = "AssistantV2Impl.kt", i = {}, l = {60, 62}, m = "queryVersion", n = {}, s = {})
    public static final class j extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public j(Continuation<? super j> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return AssistantV2Impl.this.queryVersion(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function1<byte[], Boolean> {
        public static final k a = new k();

        public k() {
            super(1);
        }

        public final boolean a(@NotNull byte[] bArr) {
            return ArraysKt___ArraysKt.first(bArr) == 2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(byte[] bArr) {
            return Boolean.valueOf(a(bArr));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function1<byte[], Unit> {
        public final /* synthetic */ VersionDto a;
        public final /* synthetic */ CompletableDeferred<VersionDto> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(VersionDto versionDto, CompletableDeferred<VersionDto> completableDeferred) {
            super(1);
            this.a = versionDto;
            this.b = completableDeferred;
        }

        public final void a(@NotNull byte[] bArr) {
            BinaryDecoder.decode(this.a, bArr);
            this.a.versionNumber.ensureValue();
            this.b.complete(this.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.assistant.impl.AssistantV2Impl$queryVersion$4", f = "AssistantV2Impl.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
    public static final class m extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
        public int a;
        public final /* synthetic */ CompletableDeferred<VersionDto> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(CompletableDeferred<VersionDto> completableDeferred, Continuation<? super m> continuation) {
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
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Integer> continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.assistant.impl.AssistantV2Impl", f = "AssistantV2Impl.kt", i = {}, l = {143, 152}, m = "updateCardsSetting", n = {}, s = {})
    public static final class n extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public n(Continuation<? super n> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return AssistantV2Impl.this.updateCardsSetting(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function1<byte[], Boolean> {
        public static final o a = new o();

        public o() {
            super(1);
        }

        public final boolean a(@NotNull byte[] bArr) {
            return ArraysKt___ArraysKt.first(bArr) == 10;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(byte[] bArr) {
            return Boolean.valueOf(a(bArr));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function1<byte[], Unit> {
        public final /* synthetic */ UpdateDto a;
        public final /* synthetic */ CompletableDeferred<UpdateDto> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(UpdateDto updateDto, CompletableDeferred<UpdateDto> completableDeferred) {
            super(1);
            this.a = updateDto;
            this.b = completableDeferred;
        }

        public final void a(@NotNull byte[] bArr) {
            BinaryDecoder.decode(this.a, bArr);
            this.b.complete(this.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.assistant.impl.AssistantV2Impl$updateCardsSetting$4", f = "AssistantV2Impl.kt", i = {}, l = {150}, m = "invokeSuspend", n = {}, s = {})
    public static final class q extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ List<AppCardItemDto> b;
        public final /* synthetic */ AssistantV2Impl c;
        public final /* synthetic */ List<ItemDto> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public q(List<AppCardItemDto> list, AssistantV2Impl assistantV2Impl, List<? extends ItemDto> list2, Continuation<? super q> continuation) {
            super(2, continuation);
            this.b = list;
            this.c = assistantV2Impl;
            this.d = list2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new q(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((q) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus(new byte[]{9}, new UInt8(this.b.size()).toBytes());
                BinaryEncoder binaryEncoder = new BinaryEncoder();
                int size = this.b.size();
                List<ItemDto> list = this.d;
                byte[] bArrPlus2 = bArrPlus;
                for (int i2 = 0; i2 < size; i2++) {
                    bArrPlus2 = ArraysKt___ArraysJvmKt.plus(bArrPlus2, binaryEncoder.encode(list.get(Boxing.boxInt(i2).intValue())));
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.assistant.impl.AssistantV2Impl$updateCardsSetting$5", f = "AssistantV2Impl.kt", i = {}, l = {153}, m = "invokeSuspend", n = {}, s = {})
    public static final class r extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ CompletableDeferred<UpdateDto> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(CompletableDeferred<UpdateDto> completableDeferred, Continuation<? super r> continuation) {
            super(2, continuation);
            this.b = completableDeferred;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new r(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((r) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.assistant.impl.AssistantV2Impl", f = "AssistantV2Impl.kt", i = {}, l = {100, 101}, m = "updateDisplayMatters", n = {}, s = {})
    public static final class s extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public s(Continuation<? super s> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return AssistantV2Impl.this.updateDisplayMatters(false, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class t extends Lambda implements Function1<byte[], Boolean> {
        public static final t a = new t();

        public t() {
            super(1);
        }

        public final boolean a(@NotNull byte[] bArr) {
            return ArraysKt___ArraysKt.first(bArr) == 6;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(byte[] bArr) {
            return Boolean.valueOf(a(bArr));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class u extends Lambda implements Function1<byte[], Unit> {
        public final /* synthetic */ UpdateDto a;
        public final /* synthetic */ CompletableDeferred<UpdateDto> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(UpdateDto updateDto, CompletableDeferred<UpdateDto> completableDeferred) {
            super(1);
            this.a = updateDto;
            this.b = completableDeferred;
        }

        public final void a(@NotNull byte[] bArr) {
            BinaryDecoder.decode(this.a, bArr);
            this.b.complete(this.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.assistant.impl.AssistantV2Impl$updateDisplayMatters$4", f = "AssistantV2Impl.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
    public static final class v extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ CompletableDeferred<UpdateDto> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(CompletableDeferred<UpdateDto> completableDeferred, Continuation<? super v> continuation) {
            super(2, continuation);
            this.b = completableDeferred;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new v(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((v) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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

    public AssistantV2Impl(@NotNull BaseModule baseModule) {
        this.module = baseModule;
        baseModule.registerMessageCallback(new a(null));
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0095 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x0096  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bluetooth.profile.channel.module.assistant.AssistantApiV2
    @Nullable
    public Object queryCardSetting(@NotNull Continuation<? super List<AppCardItemDto>> continuation) throws NoResponseException {
        b bVar;
        CompletableDeferred completableDeferred;
        List list;
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
        Object objWithTimeoutOrNull = bVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = bVar.d;
        if (i3 != 0) {
            if (i3 == 1) {
                completableDeferred = (CompletableDeferred) bVar.a;
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            }
            list = (List) objWithTimeoutOrNull;
            if (list != null) {
                return list;
            }
            throw new NoResponseException("queryCardSetting no response !!");
        }
        ResultKt.throwOnFailure(objWithTimeoutOrNull);
        CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        if (this.callbackSet.get(Boxing.boxByte((byte) 7)) == null) {
            this.callbackSet.put(Boxing.boxByte((byte) 7), new FilterAction(c.a, new d(completableDeferredCompletableDeferred$default)));
        }
        BaseModule baseModule = this.module;
        byte[] bArr = {7};
        bVar.a = completableDeferredCompletableDeferred$default;
        bVar.d = 1;
        if (BaseModule.sendDataWithResult$default(baseModule, bArr, 0, false, bVar, 6, null) == coroutine_suspended) {
            return coroutine_suspended;
        }
        completableDeferred = completableDeferredCompletableDeferred$default;
        e eVar = new e(completableDeferred, null);
        bVar.a = null;
        bVar.d = 2;
        objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(3000L, eVar, bVar);
        if (objWithTimeoutOrNull == coroutine_suspended) {
            return coroutine_suspended;
        }
        list = (List) objWithTimeoutOrNull;
        if (list != null) {
            return list;
        }
        throw new NoResponseException("queryCardSetting no response !!");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009a  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bluetooth.profile.channel.module.assistant.AssistantApiV2
    @Nullable
    public Object queryDisplayMattersSetting(@NotNull Continuation<? super Boolean> continuation) throws NoResponseException {
        f fVar;
        CompletableDeferred completableDeferred;
        Boolean bool;
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
        Object objWithTimeoutOrNull = fVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = fVar.d;
        if (i3 != 0) {
            if (i3 == 1) {
                completableDeferred = (CompletableDeferred) fVar.a;
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
        QueryDto queryDto = new QueryDto();
        CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        if (this.callbackSet.get(Boxing.boxByte((byte) 3)) == null) {
            this.callbackSet.put(Boxing.boxByte((byte) 3), new FilterAction(g.a, new h(queryDto, completableDeferredCompletableDeferred$default)));
        }
        byte[] bArr = {3};
        BaseModule baseModule = this.module;
        fVar.a = completableDeferredCompletableDeferred$default;
        fVar.d = 1;
        if (BaseModule.sendDataWithResult$default(baseModule, bArr, 0, false, fVar, 6, null) == coroutine_suspended) {
            return coroutine_suspended;
        }
        completableDeferred = completableDeferredCompletableDeferred$default;
        i iVar = new i(completableDeferred, null);
        fVar.a = null;
        fVar.d = 2;
        objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(3000L, iVar, fVar);
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
    @Override // com.huami.bluetooth.profile.channel.module.assistant.AssistantApiV2
    @Nullable
    public Object queryVersion(@NotNull Continuation<? super Integer> continuation) {
        j jVar;
        int iIntValue;
        CompletableDeferred completableDeferred;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.d = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        } else {
            jVar = new j(continuation);
        }
        Object objWithTimeout = jVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = jVar.d;
        try {
            if (i3 != 0) {
                if (i3 == 1) {
                    completableDeferred = (CompletableDeferred) jVar.a;
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
            VersionDto versionDto = new VersionDto();
            CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            if (this.callbackSet.get(Boxing.boxByte((byte) 1)) == null) {
                this.callbackSet.put(Boxing.boxByte((byte) 1), new FilterAction(k.a, new l(versionDto, completableDeferredCompletableDeferred$default)));
            }
            byte[] bArr = {1};
            BaseModule baseModule = this.module;
            jVar.a = completableDeferredCompletableDeferred$default;
            jVar.d = 1;
            if (BaseModule.sendDataWithResult$default(baseModule, bArr, 0, false, jVar, 6, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            completableDeferred = completableDeferredCompletableDeferred$default;
            m mVar = new m(completableDeferred, null);
            jVar.a = null;
            jVar.d = 2;
            objWithTimeout = TimeoutKt.withTimeout(3000L, mVar, jVar);
            if (objWithTimeout == coroutine_suspended) {
                return coroutine_suspended;
            }
            iIntValue = ((Number) objWithTimeout).intValue();
        } catch (Exception unused) {
            iIntValue = -1;
        }
        return Boxing.boxInt(iIntValue);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bluetooth.profile.channel.module.assistant.AssistantApiV2
    @Nullable
    public Object updateCardsSetting(@NotNull List<AppCardItemDto> list, @NotNull Continuation<? super Boolean> continuation) throws NoResponseException {
        n nVar;
        CompletableDeferred completableDeferred;
        Boolean bool;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.d = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        } else {
            nVar = new n(continuation);
        }
        Object objWithTimeoutOrNull = nVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = nVar.d;
        if (i3 != 0) {
            if (i3 == 1) {
                completableDeferred = (CompletableDeferred) nVar.a;
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
        UpdateDto updateDto = new UpdateDto();
        CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        if (this.callbackSet.get(Boxing.boxByte((byte) 9)) == null) {
            this.callbackSet.put(Boxing.boxByte((byte) 9), new FilterAction(o.a, new p(updateDto, completableDeferredCompletableDeferred$default)));
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (AppCardItemDto appCardItemDto : list) {
            ItemDto itemDto = new ItemDto();
            itemDto.type = new UInt16(appCardItemDto.getType());
            itemDto.isEnable = appCardItemDto.isEnable();
            arrayList.add(itemDto);
        }
        CoroutineDispatcher io2 = Dispatchers.getIO();
        q qVar = new q(list, this, arrayList, null);
        nVar.a = completableDeferredCompletableDeferred$default;
        nVar.d = 1;
        if (BuildersKt.withContext(io2, qVar, nVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        completableDeferred = completableDeferredCompletableDeferred$default;
        r rVar = new r(completableDeferred, null);
        nVar.a = null;
        nVar.d = 2;
        objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(3000L, rVar, nVar);
        if (objWithTimeoutOrNull == coroutine_suspended) {
            return coroutine_suspended;
        }
        bool = (Boolean) objWithTimeoutOrNull;
        if (bool != null) {
            return Boxing.boxBoolean(bool.booleanValue());
        }
        throw new NoResponseException("updateCardsSetting no response !!");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bluetooth.profile.channel.module.assistant.AssistantApiV2
    @Nullable
    public Object updateDisplayMatters(boolean z, @NotNull Continuation<? super Boolean> continuation) throws NoResponseException {
        s sVar;
        CompletableDeferred completableDeferred;
        Boolean bool;
        if (continuation instanceof s) {
            sVar = (s) continuation;
            int i2 = sVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sVar.d = i2 - Integer.MIN_VALUE;
            } else {
                sVar = new s(continuation);
            }
        } else {
            sVar = new s(continuation);
        }
        Object objWithTimeoutOrNull = sVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = sVar.d;
        if (i3 != 0) {
            if (i3 == 1) {
                completableDeferred = (CompletableDeferred) sVar.a;
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
        UpdateDto updateDto = new UpdateDto();
        CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        if (this.callbackSet.get(Boxing.boxByte((byte) 5)) == null) {
            this.callbackSet.put(Boxing.boxByte((byte) 5), new FilterAction(t.a, new u(updateDto, completableDeferredCompletableDeferred$default)));
        }
        byte[] bArr = {5, ByteUtilsKt.toByte(z)};
        BaseModule baseModule = this.module;
        sVar.a = completableDeferredCompletableDeferred$default;
        sVar.d = 1;
        if (BaseModule.sendDataWithResult$default(baseModule, bArr, 0, false, sVar, 6, null) == coroutine_suspended) {
            return coroutine_suspended;
        }
        completableDeferred = completableDeferredCompletableDeferred$default;
        v vVar = new v(completableDeferred, null);
        sVar.a = null;
        sVar.d = 2;
        objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(3000L, vVar, sVar);
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
