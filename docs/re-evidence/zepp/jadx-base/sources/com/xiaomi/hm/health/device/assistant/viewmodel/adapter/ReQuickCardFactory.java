package com.xiaomi.hm.health.device.assistant.viewmodel.adapter;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.huami.bluetooth.profile.channel.module.assistant.AssistantApi;
import com.huami.bluetooth.profile.channel.module.assistant.AssistantModule;
import com.huami.bluetooth.profile.channel.module.assistant.AssistantVersion;
import com.huami.bluetooth.profile.channel.module.assistant.QuickCardApi;
import com.huami.bluetooth.profile.channel.module.assistant.dto.AppCardItemDto;
import com.huami.bluetooth.profile.channel.module.assistant.dto.CardType;
import com.huami.bluetooth.profile.channel.module.assistant.response.AppCardsResponse;
import com.huami.bluetooth.profile.channel.module.assistant.response.AppCardsUpdateRequest;
import com.huami.bluetooth.profile.channel.module.assistant.response.Response;
import com.huami.bluetooth.profile.channel.module.assistant.response.Success;
import com.huami.bluetooth.profile.channel.module.assistant.v2.QuickCardFactory;
import com.huami.bluetooth.profile.channel.module.assistant.v2.QuickCardStruct;
import com.huami.bluetooth.profile.channel.module.assistant.v2.SmartAssistantQuickCardApi;
import com.huami.bluetooth.profile.channel.module.schedule.action.DataTransferCallback;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0003\b\u000b\u0010B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/viewmodel/adapter/ReQuickCardFactory;", "", "Lcom/huami/bluetooth/profile/channel/module/assistant/AssistantModule;", "module", "Lcom/huami/bluetooth/profile/channel/module/schedule/action/DataTransferCallback;", "dtr", "Lcom/huami/bluetooth/profile/channel/module/assistant/v2/QuickCardFactory;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "a", "Lcom/huami/bluetooth/profile/channel/module/schedule/action/DataTransferCallback;", "dtrc", "b", "Lcom/huami/bluetooth/profile/channel/module/assistant/v2/QuickCardFactory;", "cardFactory", "<init>", "()V", "c", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class ReQuickCardFactory {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private DataTransferCallback dtrc;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private QuickCardFactory cardFactory;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\f\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"com/xiaomi/hm/health/device/assistant/viewmodel/adapter/ReQuickCardFactory$a", "Lcom/huami/bluetooth/profile/channel/module/assistant/v2/QuickCardFactory;", "Lcom/huami/bluetooth/profile/channel/module/assistant/v2/SmartAssistantQuickCardApi;", "create", "Lcom/huami/bluetooth/profile/channel/module/assistant/AssistantModule;", "a", "Lcom/huami/bluetooth/profile/channel/module/assistant/AssistantModule;", "module", "b", "Lcom/huami/bluetooth/profile/channel/module/assistant/v2/SmartAssistantQuickCardApi;", "api", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/assistant/AssistantModule;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class a implements QuickCardFactory {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final AssistantModule module;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private SmartAssistantQuickCardApi<?> api;

        public a(@NotNull AssistantModule assistantModule) {
            this.module = assistantModule;
        }

        @Override // com.huami.bluetooth.profile.channel.module.assistant.v2.QuickCardFactory
        @NotNull
        public SmartAssistantQuickCardApi<?> create() throws Exception {
            SmartAssistantQuickCardApi<?> bVar;
            SmartAssistantQuickCardApi<?> smartAssistantQuickCardApi = this.api;
            if (smartAssistantQuickCardApi != null) {
                return smartAssistantQuickCardApi;
            }
            AssistantVersion assistantVersionQueryVersion = this.module.queryVersion();
            int version = assistantVersionQueryVersion.getVersion();
            if (version == 1) {
                bVar = new b(assistantVersionQueryVersion, this.module);
            } else {
                if (version != 2) {
                    throw new Exception("Not support with this version " + assistantVersionQueryVersion);
                }
                bVar = new c(assistantVersionQueryVersion, this.module);
            }
            this.api = bVar;
            return bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0005J\u001b\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0005J!\u0010\u000e\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0017\u001a\u00020\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001d\u0010\u001c\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0010\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"com/xiaomi/hm/health/device/assistant/viewmodel/adapter/ReQuickCardFactory$b", "Lcom/huami/bluetooth/profile/channel/module/assistant/v2/SmartAssistantQuickCardApi;", "Lcom/huami/bluetooth/profile/channel/module/assistant/dto/AppCardItemDto;", "Lcom/huami/bluetooth/profile/channel/module/assistant/AssistantVersion;", "queryVersion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "queryDisplayMattersSetting", "isDisplay", "updateDisplayMatters", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "queryCardSetting", "items", "updateCardsSetting", "(Ljava/lang/Iterable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lcom/huami/bluetooth/profile/channel/module/assistant/AssistantVersion;", "version", "Lcom/huami/bluetooth/profile/channel/module/assistant/AssistantModule;", "b", "Lcom/huami/bluetooth/profile/channel/module/assistant/AssistantModule;", "()Lcom/huami/bluetooth/profile/channel/module/assistant/AssistantModule;", "module", "Lcom/huami/bluetooth/profile/channel/module/assistant/AssistantApi;", "c", "Lkotlin/Lazy;", "()Lcom/huami/bluetooth/profile/channel/module/assistant/AssistantApi;", "api", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/assistant/AssistantVersion;Lcom/huami/bluetooth/profile/channel/module/assistant/AssistantModule;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class b implements SmartAssistantQuickCardApi<AppCardItemDto> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final AssistantVersion version;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final AssistantModule module;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final Lazy api = LazyKt__LazyJVMKt.lazy(new a());

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/assistant/AssistantApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<AssistantApi> {
            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AssistantApi invoke() {
                return b.this.getModule().loadApiV2();
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.assistant.viewmodel.adapter.ReQuickCardFactory$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.assistant.viewmodel.adapter.ReQuickCardFactory$SmartAssistantQuickCardV1Impl", f = "ReQuickCardFactory.kt", i = {}, l = {107}, m = "queryCardSetting", n = {}, s = {})
        public static final class C0803b extends ContinuationImpl {
            public /* synthetic */ Object a;
            public int c;

            public C0803b(Continuation<? super C0803b> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.a = obj;
                this.c |= Integer.MIN_VALUE;
                return b.this.queryCardSetting(this);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.assistant.viewmodel.adapter.ReQuickCardFactory$SmartAssistantQuickCardV1Impl", f = "ReQuickCardFactory.kt", i = {}, l = {91}, m = "queryDisplayMattersSetting", n = {}, s = {})
        public static final class c extends ContinuationImpl {
            public /* synthetic */ Object a;
            public int c;

            public c(Continuation<? super c> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.a = obj;
                this.c |= Integer.MIN_VALUE;
                return b.this.queryDisplayMattersSetting(this);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.assistant.viewmodel.adapter.ReQuickCardFactory$SmartAssistantQuickCardV1Impl", f = "ReQuickCardFactory.kt", i = {}, l = {117}, m = "updateCardsSetting", n = {}, s = {})
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
                return b.this.updateCardsSetting(null, this);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.assistant.viewmodel.adapter.ReQuickCardFactory$SmartAssistantQuickCardV1Impl", f = "ReQuickCardFactory.kt", i = {}, l = {99}, m = "updateDisplayMatters", n = {}, s = {})
        public static final class e extends ContinuationImpl {
            public /* synthetic */ Object a;
            public int c;

            public e(Continuation<? super e> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.a = obj;
                this.c |= Integer.MIN_VALUE;
                return b.this.updateDisplayMatters(false, this);
            }
        }

        public b(@NotNull AssistantVersion assistantVersion, @NotNull AssistantModule assistantModule) {
            this.version = assistantVersion;
            this.module = assistantModule;
        }

        private final AssistantApi a() {
            return (AssistantApi) this.api.getValue();
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final AssistantModule getModule() {
            return this.module;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // com.huami.bluetooth.profile.channel.module.assistant.v2.SmartAssistantQuickCardApi
        @Nullable
        public Object queryCardSetting(@NotNull Continuation<? super Iterable<? extends AppCardItemDto>> continuation) throws Exception {
            C0803b c0803b;
            if (continuation instanceof C0803b) {
                c0803b = (C0803b) continuation;
                int i = c0803b.c;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0803b.c = i - Integer.MIN_VALUE;
                } else {
                    c0803b = new C0803b(continuation);
                }
            } else {
                c0803b = new C0803b(continuation);
            }
            Object objQueryCardSetting = c0803b.a;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i2 = c0803b.c;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objQueryCardSetting);
                AssistantApi assistantApiA = a();
                c0803b.c = 1;
                objQueryCardSetting = assistantApiA.queryCardSetting(c0803b);
                if (objQueryCardSetting == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objQueryCardSetting);
            }
            Response response = (Response) objQueryCardSetting;
            if (!(response instanceof Success)) {
                throw new Exception("error " + response);
            }
            Iterable<AppCardsResponse> iterable = (Iterable) ((Success) response).getData();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
            for (AppCardsResponse appCardsResponse : iterable) {
                arrayList.add(new AppCardItemDto(appCardsResponse.getType().getValue(), appCardsResponse.isEnable()));
            }
            return arrayList;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // com.huami.bluetooth.profile.channel.module.assistant.v2.SmartAssistantQuickCardApi
        @Nullable
        public Object queryDisplayMattersSetting(@NotNull Continuation<? super Boolean> continuation) throws Exception {
            c cVar;
            if (continuation instanceof c) {
                cVar = (c) continuation;
                int i = cVar.c;
                if ((i & Integer.MIN_VALUE) != 0) {
                    cVar.c = i - Integer.MIN_VALUE;
                } else {
                    cVar = new c(continuation);
                }
            } else {
                cVar = new c(continuation);
            }
            Object objQueryDisplayMattersSettings = cVar.a;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i2 = cVar.c;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objQueryDisplayMattersSettings);
                AssistantApi assistantApiA = a();
                cVar.c = 1;
                objQueryDisplayMattersSettings = assistantApiA.queryDisplayMattersSettings(cVar);
                if (objQueryDisplayMattersSettings == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objQueryDisplayMattersSettings);
            }
            Response response = (Response) objQueryDisplayMattersSettings;
            if (response instanceof Success) {
                return ((Success) response).getData();
            }
            throw new Exception("error " + response);
        }

        @Override // com.huami.bluetooth.profile.channel.module.assistant.v2.SmartAssistantQuickCardApi
        @Nullable
        public Object queryVersion(@NotNull Continuation<? super AssistantVersion> continuation) {
            return this.version;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // com.huami.bluetooth.profile.channel.module.assistant.v2.SmartAssistantQuickCardApi
        @Nullable
        public Object updateCardsSetting(@NotNull Iterable<? extends AppCardItemDto> iterable, @NotNull Continuation<? super Boolean> continuation) throws Exception {
            d dVar;
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
            Object objUpdateCardSetting = dVar.a;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i2 = dVar.c;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objUpdateCardSetting);
                AssistantApi assistantApiA = a();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
                for (AppCardItemDto appCardItemDto : iterable) {
                    arrayList.add(new AppCardsUpdateRequest(CardType.INSTANCE.findValueByInt(appCardItemDto.getType()), appCardItemDto.isEnable()));
                }
                dVar.c = 1;
                objUpdateCardSetting = assistantApiA.updateCardSetting(arrayList, dVar);
                if (objUpdateCardSetting == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objUpdateCardSetting);
            }
            Response response = (Response) objUpdateCardSetting;
            if (response instanceof Success) {
                return ((Success) response).getData();
            }
            throw new Exception("error " + response);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // com.huami.bluetooth.profile.channel.module.assistant.v2.SmartAssistantQuickCardApi
        @Nullable
        public Object updateDisplayMatters(boolean z, @NotNull Continuation<? super Boolean> continuation) throws Exception {
            e eVar;
            if (continuation instanceof e) {
                eVar = (e) continuation;
                int i = eVar.c;
                if ((i & Integer.MIN_VALUE) != 0) {
                    eVar.c = i - Integer.MIN_VALUE;
                } else {
                    eVar = new e(continuation);
                }
            } else {
                eVar = new e(continuation);
            }
            Object objUpdateDisplayMatters = eVar.a;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i2 = eVar.c;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objUpdateDisplayMatters);
                AssistantApi assistantApiA = a();
                eVar.c = 1;
                objUpdateDisplayMatters = assistantApiA.updateDisplayMatters(z, eVar);
                if (objUpdateDisplayMatters == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objUpdateDisplayMatters);
            }
            Response response = (Response) objUpdateDisplayMatters;
            if (response instanceof Success) {
                return ((Success) response).getData();
            }
            throw new Exception("error " + response);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0005J\u001b\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0005J!\u0010\u000e\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0017\u001a\u00020\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001d\u0010\u001c\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0010\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"com/xiaomi/hm/health/device/assistant/viewmodel/adapter/ReQuickCardFactory$c", "Lcom/huami/bluetooth/profile/channel/module/assistant/v2/SmartAssistantQuickCardApi;", "Lcom/huami/bluetooth/profile/channel/module/assistant/v2/QuickCardStruct$QueryCardsResponseItem;", "Lcom/huami/bluetooth/profile/channel/module/assistant/AssistantVersion;", "queryVersion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "queryDisplayMattersSetting", "isDisplay", "updateDisplayMatters", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "queryCardSetting", "items", "updateCardsSetting", "(Ljava/lang/Iterable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lcom/huami/bluetooth/profile/channel/module/assistant/AssistantVersion;", "version", "Lcom/huami/bluetooth/profile/channel/module/assistant/AssistantModule;", "b", "Lcom/huami/bluetooth/profile/channel/module/assistant/AssistantModule;", "()Lcom/huami/bluetooth/profile/channel/module/assistant/AssistantModule;", "module", "Lcom/huami/bluetooth/profile/channel/module/assistant/QuickCardApi;", "c", "Lkotlin/Lazy;", "()Lcom/huami/bluetooth/profile/channel/module/assistant/QuickCardApi;", "api", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/assistant/AssistantVersion;Lcom/huami/bluetooth/profile/channel/module/assistant/AssistantModule;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class c implements SmartAssistantQuickCardApi<QuickCardStruct.QueryCardsResponseItem> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final AssistantVersion version;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final AssistantModule module;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final Lazy api = LazyKt__LazyJVMKt.lazy(new a());

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/assistant/QuickCardApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<QuickCardApi> {
            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final QuickCardApi invoke() {
                return c.this.getModule().loadQuickCardApi();
            }
        }

        public c(@NotNull AssistantVersion assistantVersion, @NotNull AssistantModule assistantModule) {
            this.version = assistantVersion;
            this.module = assistantModule;
        }

        private final QuickCardApi a() {
            return (QuickCardApi) this.api.getValue();
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final AssistantModule getModule() {
            return this.module;
        }

        @Override // com.huami.bluetooth.profile.channel.module.assistant.v2.SmartAssistantQuickCardApi
        @Nullable
        public Object queryCardSetting(@NotNull Continuation<? super Iterable<? extends QuickCardStruct.QueryCardsResponseItem>> continuation) {
            return a().queryCardSetting(continuation);
        }

        @Override // com.huami.bluetooth.profile.channel.module.assistant.v2.SmartAssistantQuickCardApi
        @Nullable
        public Object queryDisplayMattersSetting(@NotNull Continuation<? super Boolean> continuation) {
            return a().queryDisplayMattersSetting(continuation);
        }

        @Override // com.huami.bluetooth.profile.channel.module.assistant.v2.SmartAssistantQuickCardApi
        @Nullable
        public Object queryVersion(@NotNull Continuation<? super AssistantVersion> continuation) {
            return this.version;
        }

        @Override // com.huami.bluetooth.profile.channel.module.assistant.v2.SmartAssistantQuickCardApi
        @Nullable
        public Object updateCardsSetting(@NotNull Iterable<? extends QuickCardStruct.QueryCardsResponseItem> iterable, @NotNull Continuation<? super Boolean> continuation) {
            return a().updateCardsSetting(iterable, continuation);
        }

        @Override // com.huami.bluetooth.profile.channel.module.assistant.v2.SmartAssistantQuickCardApi
        @Nullable
        public Object updateDisplayMatters(boolean z, @NotNull Continuation<? super Boolean> continuation) {
            return a().updateDisplayMatters(z, continuation);
        }
    }

    @NotNull
    public final QuickCardFactory build(@NotNull AssistantModule module, @Nullable DataTransferCallback dtr) {
        this.dtrc = dtr;
        QuickCardFactory quickCardFactory = this.cardFactory;
        if (quickCardFactory != null) {
            return quickCardFactory;
        }
        a aVar = new a(module);
        this.cardFactory = aVar;
        return aVar;
    }
}
