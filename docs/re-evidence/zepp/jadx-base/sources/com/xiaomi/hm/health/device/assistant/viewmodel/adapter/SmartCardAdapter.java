package com.xiaomi.hm.health.device.assistant.viewmodel.adapter;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.assistant.AssistantVersion;
import com.huami.bluetooth.profile.channel.module.assistant.dto.AppCardItemDto;
import com.huami.bluetooth.profile.channel.module.assistant.dto.CardType;
import com.huami.bluetooth.profile.channel.module.assistant.v2.QuickCardStruct;
import com.huami.bluetooth.profile.channel.module.assistant.v2.SmartAssistantQuickCardApi;
import com.huami.device.feature.quickcards.cloud.resouce.impl.QuickCardId;
import com.huami.device.feature.quickcards.cloud.resouce.impl.QuickCardResponseItem;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.assistant.smart.vo.DisplayItemVo;
import com.xiaomi.hm.health.device.assistant.smart.vo.DisplayItemVoWithUrl;
import com.xiaomi.hm.health.device.assistant.smart.vo.DisplayResourceMapper;
import com.xiaomi.hm.health.device.assistant.smart.vo.ItemVo;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.h;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 &2\u00020\u0001:\u0001\u0018B\u001d\u0012\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u0017\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b$\u0010%J*\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u0019\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\fJ\u001b\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\fJ!\u0010\u0015\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR)\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f0\u001e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0018\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/viewmodel/adapter/SmartCardAdapter;", "", "", "Lcom/huami/bluetooth/profile/channel/module/assistant/v2/QuickCardStruct$QueryCardsResponseItem;", "data", "", "Lcom/huami/device/feature/quickcards/cloud/resouce/impl/QuickCardResponseItem;", "responses", "Lcom/xiaomi/hm/health/device/assistant/smart/vo/DisplayItemVoWithUrl;", "b", "Lcom/xiaomi/hm/health/device/assistant/smart/vo/ItemVo;", "queryCardSetting", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "queryDisplayMattersSetting", "isDisplay", "updateDisplayMatters", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bluetooth/profile/channel/module/assistant/AssistantVersion;", "queryVersion", "items", "updateCardsSetting", "(Ljava/lang/Iterable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bluetooth/profile/channel/module/assistant/v2/SmartAssistantQuickCardApi;", "a", "Lcom/huami/bluetooth/profile/channel/module/assistant/v2/SmartAssistantQuickCardApi;", "api", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "Lcom/xiaomi/hm/health/device/assistant/viewmodel/adapter/CloudResourceApi;", "", "c", "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/device/assistant/viewmodel/adapter/CloudResourceApi;", "cloudResourceApi", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/assistant/v2/SmartAssistantQuickCardApi;Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;)V", GoogleApiAvailabilityLight.a, "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class SmartCardAdapter {

    @Deprecated
    public static final boolean DEBUG = false;

    @NotNull
    private static final a d = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SmartAssistantQuickCardApi<?> api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final HMBaseDevice device;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy cloudResourceApi = LazyKt__LazyJVMKt.lazy(b.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/xiaomi/hm/health/device/assistant/viewmodel/adapter/SmartCardAdapter$a", "", "", "DEBUG", "Z", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/viewmodel/adapter/QuickCardsCloudResourceImpl;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<QuickCardsCloudResourceImpl> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final QuickCardsCloudResourceImpl invoke() {
            return new QuickCardsCloudResourceImpl();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.assistant.viewmodel.adapter.SmartCardAdapter", f = "SmartCardAdapter.kt", i = {0, 2}, l = {37, 38, 48}, m = "queryCardSetting", n = {"rs", "rs"}, s = {"L$1", "L$1"})
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
            return SmartCardAdapter.this.queryCardSetting(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.assistant.viewmodel.adapter.SmartCardAdapter", f = "SmartCardAdapter.kt", i = {0, 0}, l = {90, 91, 95}, m = "updateCardsSetting", n = {"this", "items"}, s = {"L$0", "L$1"})
    public static final class d extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return SmartCardAdapter.this.updateCardsSetting(null, this);
        }
    }

    public SmartCardAdapter(@NotNull SmartAssistantQuickCardApi<?> smartAssistantQuickCardApi, @Nullable HMBaseDevice hMBaseDevice) {
        this.api = smartAssistantQuickCardApi;
        this.device = hMBaseDevice;
    }

    private final CloudResourceApi<String, String> a() {
        return (CloudResourceApi) this.cloudResourceApi.getValue();
    }

    private final List<DisplayItemVoWithUrl> b(List<QuickCardStruct.QueryCardsResponseItem> data, Iterable<QuickCardResponseItem> responses) {
        String icon;
        String name;
        HashMap map = new HashMap();
        for (QuickCardResponseItem quickCardResponseItem : responses) {
            map.put(c(quickCardResponseItem), quickCardResponseItem);
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(data, 10));
        for (QuickCardStruct.QueryCardsResponseItem queryCardsResponseItem : data) {
            QuickCardResponseItem quickCardResponseItemE = e(queryCardsResponseItem, map);
            String str = (quickCardResponseItemE == null || (icon = quickCardResponseItemE.getIcon()) == null) ? "" : icon;
            QuickCardResponseItem quickCardResponseItemE2 = e(queryCardsResponseItem, map);
            arrayList.add(new DisplayItemVoWithUrl(str, (quickCardResponseItemE2 == null || (name = quickCardResponseItemE2.getName()) == null) ? "" : name, queryCardsResponseItem.getCardId(), queryCardsResponseItem.getAppId(), queryCardsResponseItem.getVisible(), 0, 32, null));
        }
        return arrayList;
    }

    private static final String c(QuickCardResponseItem quickCardResponseItem) {
        return quickCardResponseItem.getAppId() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + quickCardResponseItem.getCardId();
    }

    private static final String d(QuickCardStruct.QueryCardsResponseItem queryCardsResponseItem) {
        return queryCardsResponseItem.getAppId() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + queryCardsResponseItem.getCardId();
    }

    private static final QuickCardResponseItem e(QuickCardStruct.QueryCardsResponseItem queryCardsResponseItem, HashMap<String, QuickCardResponseItem> map) {
        return map.get(d(queryCardsResponseItem));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0098 A[LOOP:1: B:28:0x0092->B:30:0x0098, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e3 A[LOOP:2: B:32:0x00c7->B:36:0x00e3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x0141  */
    /* JADX WARN: Code duplicated, block: B:49:0x0154 A[LOOP:0: B:47:0x014e->B:49:0x0154, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x018e  */
    /* JADX WARN: Code duplicated, block: B:64:0x011a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object queryCardSetting(@NotNull Continuation<? super List<? extends ItemVo>> continuation) throws Exception {
        c cVar;
        SmartCardAdapter smartCardAdapter;
        ArrayList arrayList;
        ArrayList<QuickCardStruct.QueryCardsResponseItem> arrayList2;
        SmartCardAdapter smartCardAdapter2;
        ArrayList<QuickCardStruct.QueryCardsResponseItem> arrayList3;
        DisplayResourceMapper displayResourceMapper;
        ArrayList arrayList4;
        CardType cardTypeFindValueByInt;
        ArrayList arrayList5;
        HMBaseDevice hMBaseDevice;
        HMDeviceSource mDeviceSource;
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
        Object objQueryCardSetting = cVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = cVar.e;
        Integer numBoxInt = null;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objQueryCardSetting);
            ArrayList arrayList6 = new ArrayList();
            cVar.a = this;
            cVar.b = arrayList6;
            cVar.e = 1;
            Object objQueryVersion = queryVersion(cVar);
            if (objQueryVersion == coroutine_suspended) {
                return coroutine_suspended;
            }
            smartCardAdapter = this;
            arrayList = arrayList6;
            objQueryCardSetting = objQueryVersion;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    ResultKt.throwOnFailure(objQueryCardSetting);
                    Iterable<AppCardItemDto> iterable = (Iterable) objQueryCardSetting;
                    arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
                    for (AppCardItemDto appCardItemDto : iterable) {
                        arrayList3.add(new QuickCardStruct.QueryCardsResponseItem("", String.valueOf(appCardItemDto.getType()), appCardItemDto.isEnable()));
                    }
                    displayResourceMapper = new DisplayResourceMapper();
                    arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
                    for (QuickCardStruct.QueryCardsResponseItem queryCardsResponseItem : arrayList3) {
                        cardTypeFindValueByInt = CardType.INSTANCE.findValueByInt(Integer.parseInt(queryCardsResponseItem.getCardId()));
                        if (cardTypeFindValueByInt != null) {
                            throw new Exception("card type error");
                        }
                        CloudResourceApi.Item<Integer, Integer> itemLoadTitleAndIcon = displayResourceMapper.loadTitleAndIcon(queryCardsResponseItem.getAppId(), queryCardsResponseItem.getCardId());
                        arrayList4.add(new DisplayItemVo(itemLoadTitleAndIcon.getIcon().intValue(), itemLoadTitleAndIcon.getTitle().intValue(), queryCardsResponseItem.getCardId(), queryCardsResponseItem.getAppId(), queryCardsResponseItem.getVisible(), 0, cardTypeFindValueByInt));
                    }
                    return arrayList4;
                }
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                arrayList2 = (ArrayList) cVar.b;
                smartCardAdapter2 = (SmartCardAdapter) cVar.a;
                ResultKt.throwOnFailure(objQueryCardSetting);
                h.addAll(arrayList2, (Iterable) objQueryCardSetting);
                if (smartCardAdapter2.a() instanceof BatchCloudResourceApi) {
                    throw new Exception("please use BatchCloudResourceApi.");
                }
                arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                for (QuickCardStruct.QueryCardsResponseItem queryCardsResponseItem2 : arrayList2) {
                    arrayList5.add(new QuickCardId(queryCardsResponseItem2.getAppId(), queryCardsResponseItem2.getCardId()));
                }
                BatchCloudResourceApi batchCloudResourceApi = (BatchCloudResourceApi) smartCardAdapter2.a();
                hMBaseDevice = smartCardAdapter2.device;
                if (hMBaseDevice != null && (mDeviceSource = hMBaseDevice.getMDeviceSource()) != null) {
                    numBoxInt = Boxing.boxInt(mDeviceSource.getValue());
                }
                return smartCardAdapter2.b(arrayList2, batchCloudResourceApi.loadData(arrayList5, numBoxInt));
            }
            arrayList = (ArrayList) cVar.b;
            smartCardAdapter = (SmartCardAdapter) cVar.a;
            ResultKt.throwOnFailure(objQueryCardSetting);
        }
        if (((AssistantVersion) objQueryCardSetting).getVersion() != 1) {
            SmartAssistantQuickCardApi<?> smartAssistantQuickCardApi = smartCardAdapter.api;
            cVar.a = smartCardAdapter;
            cVar.b = arrayList;
            cVar.e = 3;
            objQueryCardSetting = smartAssistantQuickCardApi.queryCardSetting(cVar);
            if (objQueryCardSetting == coroutine_suspended) {
                return coroutine_suspended;
            }
            arrayList2 = arrayList;
            smartCardAdapter2 = smartCardAdapter;
            h.addAll(arrayList2, (Iterable) objQueryCardSetting);
            if (smartCardAdapter2.a() instanceof BatchCloudResourceApi) {
                throw new Exception("please use BatchCloudResourceApi.");
            }
            arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
            while (r2.hasNext()) {
                arrayList5.add(new QuickCardId(queryCardsResponseItem2.getAppId(), queryCardsResponseItem2.getCardId()));
            }
            BatchCloudResourceApi batchCloudResourceApi2 = (BatchCloudResourceApi) smartCardAdapter2.a();
            hMBaseDevice = smartCardAdapter2.device;
            if (hMBaseDevice != null) {
                numBoxInt = Boxing.boxInt(mDeviceSource.getValue());
            }
            return smartCardAdapter2.b(arrayList2, batchCloudResourceApi2.loadData(arrayList5, numBoxInt));
        }
        SmartAssistantQuickCardApi<?> smartAssistantQuickCardApi2 = smartCardAdapter.api;
        cVar.a = null;
        cVar.b = null;
        cVar.e = 2;
        objQueryCardSetting = smartAssistantQuickCardApi2.queryCardSetting(cVar);
        if (objQueryCardSetting == coroutine_suspended) {
            return coroutine_suspended;
        }
        Iterable<AppCardItemDto> iterable2 = (Iterable) objQueryCardSetting;
        arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable2, 10));
        while (r15.hasNext()) {
            arrayList3.add(new QuickCardStruct.QueryCardsResponseItem("", String.valueOf(appCardItemDto.getType()), appCardItemDto.isEnable()));
        }
        displayResourceMapper = new DisplayResourceMapper();
        arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
        while (r0.hasNext()) {
            cardTypeFindValueByInt = CardType.INSTANCE.findValueByInt(Integer.parseInt(queryCardsResponseItem.getCardId()));
            if (cardTypeFindValueByInt != null) {
                throw new Exception("card type error");
            }
            CloudResourceApi.Item<Integer, Integer> itemLoadTitleAndIcon2 = displayResourceMapper.loadTitleAndIcon(queryCardsResponseItem.getAppId(), queryCardsResponseItem.getCardId());
            arrayList4.add(new DisplayItemVo(itemLoadTitleAndIcon2.getIcon().intValue(), itemLoadTitleAndIcon2.getTitle().intValue(), queryCardsResponseItem.getCardId(), queryCardsResponseItem.getAppId(), queryCardsResponseItem.getVisible(), 0, cardTypeFindValueByInt));
        }
        return arrayList4;
    }

    @Nullable
    public final Object queryDisplayMattersSetting(@NotNull Continuation<? super Boolean> continuation) {
        return this.api.queryDisplayMattersSetting(continuation);
    }

    @Nullable
    public final Object queryVersion(@NotNull Continuation<? super AssistantVersion> continuation) {
        return this.api.queryVersion(continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object updateCardsSetting(@NotNull Iterable<QuickCardStruct.QueryCardsResponseItem> iterable, @NotNull Continuation<? super Boolean> continuation) {
        d dVar;
        SmartCardAdapter smartCardAdapter;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i = dVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.e = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object objQueryVersion = dVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = dVar.e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objQueryVersion);
            dVar.a = this;
            dVar.b = iterable;
            dVar.e = 1;
            objQueryVersion = queryVersion(dVar);
            if (objQueryVersion == coroutine_suspended) {
                return coroutine_suspended;
            }
            smartCardAdapter = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    ResultKt.throwOnFailure(objQueryVersion);
                }
                if (i2 == 3) {
                    ResultKt.throwOnFailure(objQueryVersion);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iterable = (Iterable) dVar.b;
            smartCardAdapter = (SmartCardAdapter) dVar.a;
            ResultKt.throwOnFailure(objQueryVersion);
        }
        if (((AssistantVersion) objQueryVersion).getVersion() != 1) {
            SmartAssistantQuickCardApi<?> smartAssistantQuickCardApi = smartCardAdapter.api;
            dVar.a = null;
            dVar.b = null;
            dVar.e = 3;
            objQueryVersion = smartAssistantQuickCardApi.updateCardsSetting(iterable, dVar);
            return objQueryVersion == coroutine_suspended ? coroutine_suspended : objQueryVersion;
        }
        SmartAssistantQuickCardApi<?> smartAssistantQuickCardApi2 = smartCardAdapter.api;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (QuickCardStruct.QueryCardsResponseItem queryCardsResponseItem : iterable) {
            arrayList.add(new AppCardItemDto(Integer.parseInt(queryCardsResponseItem.getCardId()), queryCardsResponseItem.getVisible()));
        }
        dVar.a = null;
        dVar.b = null;
        dVar.e = 2;
        objQueryVersion = smartAssistantQuickCardApi2.updateCardsSetting(arrayList, dVar);
        return objQueryVersion == coroutine_suspended ? coroutine_suspended : objQueryVersion;
    }

    @Nullable
    public final Object updateDisplayMatters(boolean z, @NotNull Continuation<? super Boolean> continuation) {
        return this.api.updateDisplayMatters(z, continuation);
    }
}
