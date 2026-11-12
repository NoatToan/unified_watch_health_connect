package com.xiaomi.hm.health.nps;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.HMLoginManager;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.HMDeviceUtils;
import com.xiaomi.hm.health.device.model.HMBrandType;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.model.account.HMUserInfo;
import com.xiaomi.hm.health.nps.NpsViewModel;
import com.xiaomi.hm.health.nps.api.NpsWebAPI;
import com.xiaomi.hm.health.nps.model.NpsDevice;
import com.xiaomi.hm.health.nps.model.NpsTarget;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.r;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 :2\u00020\u00012\u00020\u0002:\u0002;:B\u0007¢\u0006\u0004\b8\u00109J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J&\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002J\u001e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000fH\u0002J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0005J\u0006\u0010\u0017\u001a\u00020\u0016J\u0014\u0010\u001a\u001a\u00020\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018R\u001d\u0010\u001f\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00180 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\"\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00180 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R&\u0010(\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010&\u0018\u00010%0 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\"R%\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00180)8\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R)\u00103\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010&\u0018\u00010\u00180/8\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u00102R\u0016\u00107\u001a\u0002048V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u0006<"}, d2 = {"Lcom/xiaomi/hm/health/nps/NpsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/xiaomi/hm/health/databases/model/Device;", "device", "", "f", "Lcom/xiaomi/hm/health/nps/model/NpsTarget;", "npsTarget", "", "", "Lcom/xiaomi/hm/health/nps/NpsViewModel$BoundDevice;", "sourceNameMap", "Lcom/xiaomi/hm/health/nps/model/NpsDevice;", "i", "", "boundDevices", "", "h", "source", "", "setClickedEntrance", "Lkotlinx/coroutines/Job;", "fetchNpsTargets", "", "devices", "updateBoundDevices", "a", "Lkotlin/Lazy;", "g", "()Lkotlinx/coroutines/Job;", "job", "Landroidx/lifecycle/MutableLiveData;", "b", "Landroidx/lifecycle/MutableLiveData;", "npsTargets", "c", "", "Lcom/xiaomi/hm/health/nps/NpsClickedMode;", GoogleApiAvailabilityLight.a, "hasClickedEntrance", "Landroidx/lifecycle/MediatorLiveData;", "e", "Landroidx/lifecycle/MediatorLiveData;", "getNpsDevices", "()Landroidx/lifecycle/MediatorLiveData;", "npsDevices", "Landroidx/lifecycle/LiveData;", "Landroidx/lifecycle/LiveData;", "getShowRedDot", "()Landroidx/lifecycle/LiveData;", "showRedDot", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "()V", "Companion", "BoundDevice", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class NpsViewModel extends ViewModel implements CoroutineScope {

    @NotNull
    public static final String TAG = "NpsViewModel";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy job = LazyKt__LazyJVMKt.lazy(c.a);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<NpsTarget>> npsTargets;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<Device>> boundDevices;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<NpsClickedMode>> hasClickedEntrance;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MediatorLiveData<List<NpsDevice>> npsDevices;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final LiveData<List<NpsClickedMode>> showRedDot;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/nps/NpsViewModel$BoundDevice;", "", "", "component1", "component2", "name", "source", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", "getSource", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class BoundDevice {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        private final String source;

        public BoundDevice(@NotNull String str, @NotNull String str2) {
            this.name = str;
            this.source = str2;
        }

        public static /* synthetic */ BoundDevice copy$default(BoundDevice boundDevice, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = boundDevice.name;
            }
            if ((i & 2) != 0) {
                str2 = boundDevice.source;
            }
            return boundDevice.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        @NotNull
        public final BoundDevice copy(@NotNull String name, @NotNull String source) {
            return new BoundDevice(name, source);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BoundDevice)) {
                return false;
            }
            BoundDevice boundDevice = (BoundDevice) other;
            return Intrinsics.areEqual(this.name, boundDevice.name) && Intrinsics.areEqual(this.source, boundDevice.source);
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String getSource() {
            return this.source;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.source.hashCode();
        }

        @NotNull
        public String toString() {
            return "BoundDevice(name=" + this.name + ", source=" + this.source + ")";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.nps.NpsViewModel$fetchNpsTargets$1", f = "NpsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.nps.NpsViewModel$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/xiaomi/hm/health/nps/model/NpsTarget;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0984a extends Lambda implements Function1<List<? extends NpsTarget>, Unit> {
            public final /* synthetic */ NpsViewModel a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0984a(NpsViewModel npsViewModel) {
                super(1);
                this.a = npsViewModel;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends NpsTarget> list) {
                invoke2((List<NpsTarget>) list);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull List<NpsTarget> list) {
                this.a.npsTargets.postValue(list);
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return NpsViewModel.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws JSONException {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (HMLoginManager.isUnInit()) {
                return Unit.INSTANCE;
            }
            List<Device> list = (List) NpsViewModel.this.boundDevices.getValue();
            if (list == null || list.isEmpty()) {
                return Unit.INSTANCE;
            }
            JSONArray jSONArray = new JSONArray();
            NpsViewModel npsViewModel = NpsViewModel.this;
            ArrayList<Pair> arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (Device device : list) {
                arrayList.add(TuplesKt.to(device.getDevice_source(), new BoundDevice(npsViewModel.f(device), String.valueOf(device.getDevice_source()))));
            }
            for (Pair pair : arrayList) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", ((BoundDevice) pair.getSecond()).getSource());
                jSONObject.put("name", ((BoundDevice) pair.getSecond()).getName());
                jSONArray.put(jSONObject);
            }
            HMUserInfo userInfo = HMPersonInfo.getInstance().getUserInfo();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("userid", userInfo.getUserid());
            jSONObject2.put("devices", jSONArray);
            NpsWebAPI.INSTANCE.getNpsTargets(jSONObject2.toString(), new C0984a(NpsViewModel.this));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0000H\n"}, d2 = {"", "Lcom/xiaomi/hm/health/nps/NpsClickedMode;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<List<? extends NpsClickedMode>, Unit> {
        public final /* synthetic */ MutableLiveData<List<NpsClickedMode>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MutableLiveData<List<NpsClickedMode>> mutableLiveData) {
            super(1);
            this.a = mutableLiveData;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends NpsClickedMode> list) {
            invoke2((List<NpsClickedMode>) list);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable List<NpsClickedMode> list) {
            this.a.setValue(list == null ? null : CollectionsKt___CollectionsKt.toMutableList((Collection) list));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlinx/coroutines/CompletableJob;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<CompletableJob> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CompletableJob invoke() {
            return JobKt__JobKt.d(null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ List<Device> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(List<? extends Device> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            List<Device> list = this.a;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((Device) it2.next()).getDevice_source());
            }
            return "设备列表刷新：" + CollectionsKt___CollectionsKt.toList(arrayList);
        }
    }

    public NpsViewModel() {
        MutableLiveData<List<NpsTarget>> mutableLiveData = new MutableLiveData<>();
        this.npsTargets = mutableLiveData;
        MutableLiveData<List<Device>> mutableLiveData2 = new MutableLiveData<>();
        this.boundDevices = mutableLiveData2;
        MutableLiveData<List<NpsClickedMode>> mutableLiveData3 = new MutableLiveData<>();
        NpsUtil.INSTANCE.getNpsClickStatus(new b(mutableLiveData3));
        Unit unit = Unit.INSTANCE;
        this.hasClickedEntrance = mutableLiveData3;
        final MediatorLiveData<List<NpsDevice>> mediatorLiveData = new MediatorLiveData<>();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        mediatorLiveData.addSource(mutableLiveData2, new Observer() { // from class: vh5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                NpsViewModel.j(objectRef, mediatorLiveData, objectRef2, this, (List) obj);
            }
        });
        mediatorLiveData.addSource(mutableLiveData, new Observer() { // from class: uh5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                NpsViewModel.k(objectRef2, mediatorLiveData, objectRef, this, (List) obj);
            }
        });
        this.npsDevices = mediatorLiveData;
        final MediatorLiveData mediatorLiveData2 = new MediatorLiveData();
        final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        mediatorLiveData2.addSource(mutableLiveData3, new Observer() { // from class: sh5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                NpsViewModel.n(linkedHashMap, objectRef3, mediatorLiveData2, (List) obj);
            }
        });
        mediatorLiveData2.addSource(getNpsDevices(), new Observer() { // from class: th5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                NpsViewModel.o(objectRef3, mediatorLiveData2, linkedHashMap, (List) obj);
            }
        });
        this.showRedDot = mediatorLiveData2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String f(Device device) {
        return HMDeviceManager.getInstance().isUseWearCompanionName(device) ? HMDeviceUtils.getHuamiDeviceDescription(device) : HMDeviceUtils.getDeviceDescription(HMDeviceSource.fromValue(device.getDevice_source().intValue()), HMBrandType.fromValue(device.getBrandType().intValue()));
    }

    private final Job g() {
        return (Job) this.job.getValue();
    }

    private final boolean h(NpsTarget npsTarget, Set<Integer> boundDevices) {
        Integer mode;
        if (npsTarget.getDeviceId() != null) {
            String deviceId = npsTarget.getDeviceId();
            if (CollectionsKt___CollectionsKt.contains(boundDevices, deviceId == null ? null : Integer.valueOf(Integer.parseInt(deviceId))) && (mode = npsTarget.getMode()) != null && mode.intValue() == 1) {
                return true;
            }
        }
        return false;
    }

    private final NpsDevice i(NpsTarget npsTarget, Map<Integer, BoundDevice> sourceNameMap) {
        String target;
        String deviceId = npsTarget.getDeviceId();
        BoundDevice boundDevice = sourceNameMap.get(deviceId == null ? null : Integer.valueOf(Integer.parseInt(deviceId)));
        if (boundDevice == null || (target = npsTarget.getTarget()) == null) {
            return null;
        }
        return new NpsDevice(boundDevice.getName(), target, boundDevice.getSource());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r9v2, types: [T, java.util.Map] */
    public static final void j(Ref.ObjectRef objectRef, MediatorLiveData mediatorLiveData, Ref.ObjectRef objectRef2, NpsViewModel npsViewModel, List list) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Device device = (Device) it2.next();
            arrayList.add(TuplesKt.to(device.getDevice_source(), new BoundDevice(npsViewModel.f(device), String.valueOf(device.getDevice_source()))));
        }
        ?? map = r.toMap(arrayList);
        objectRef.element = map;
        m(npsViewModel, mediatorLiveData, (List) objectRef2.element, (Map) map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void k(Ref.ObjectRef objectRef, MediatorLiveData mediatorLiveData, Ref.ObjectRef objectRef2, NpsViewModel npsViewModel, List list) {
        objectRef.element = list;
        m(npsViewModel, mediatorLiveData, list, (Map) objectRef2.element);
    }

    private static final void m(NpsViewModel npsViewModel, MediatorLiveData<List<NpsDevice>> mediatorLiveData, List<NpsTarget> list, Map<Integer, BoundDevice> map) {
        if (list == null || map == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (npsViewModel.h((NpsTarget) obj, map.keySet())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            NpsDevice npsDeviceI = npsViewModel.i((NpsTarget) it2.next(), map);
            if (npsDeviceI != null) {
                arrayList2.add(npsDeviceI);
            }
        }
        mediatorLiveData.setValue(arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(Map map, Ref.ObjectRef objectRef, MediatorLiveData mediatorLiveData, List list) {
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                NpsClickedMode npsClickedMode = (NpsClickedMode) it2.next();
                if (npsClickedMode != null) {
                    map.put(npsClickedMode.getCode(), npsClickedMode);
                }
            }
        }
        p(objectRef, mediatorLiveData, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.ArrayList, java.util.Collection] */
    public static final void o(Ref.ObjectRef objectRef, MediatorLiveData mediatorLiveData, Map map, List list) {
        ?? arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((NpsDevice) it2.next()).getSource());
        }
        objectRef.element = arrayList;
        p(objectRef, mediatorLiveData, map);
    }

    private static final void p(Ref.ObjectRef<List<String>> objectRef, MediatorLiveData<List<NpsClickedMode>> mediatorLiveData, Map<String, NpsClickedMode> map) {
        ArrayList arrayList = new ArrayList();
        List<String> list = objectRef.element;
        if (list != null) {
            for (String str : list) {
                if (map.keySet().contains(str)) {
                    NpsClickedMode npsClickedMode = map.get(str);
                    if (npsClickedMode != null) {
                        arrayList.add(npsClickedMode);
                    }
                } else {
                    arrayList.add(new NpsClickedMode(str, false));
                }
            }
        }
        mediatorLiveData.postValue(arrayList);
    }

    @NotNull
    public final Job fetchNpsTargets() {
        return e.f(this, null, null, new a(null), 3, null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return g().plus(Dispatchers.getIO());
    }

    @NotNull
    public final MediatorLiveData<List<NpsDevice>> getNpsDevices() {
        return this.npsDevices;
    }

    @NotNull
    public final LiveData<List<NpsClickedMode>> getShowRedDot() {
        return this.showRedDot;
    }

    public final void setClickedEntrance(@NotNull String source) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(source, new NpsClickedMode(source, true));
        List<NpsClickedMode> value = this.hasClickedEntrance.getValue();
        if (value != null) {
            for (NpsClickedMode npsClickedMode : value) {
                if (npsClickedMode != null) {
                    if (Intrinsics.areEqual(source, npsClickedMode.getCode())) {
                        npsClickedMode.setHasClicked(true);
                    }
                    linkedHashMap.put(npsClickedMode.getCode(), npsClickedMode);
                }
            }
        }
        List<NpsDevice> value2 = this.npsDevices.getValue();
        if (value2 != null) {
            for (NpsDevice npsDevice : value2) {
                if (!linkedHashMap.keySet().contains(npsDevice.getSource()) && !Intrinsics.areEqual(npsDevice.getSource(), source)) {
                    linkedHashMap.put(npsDevice.getSource(), new NpsClickedMode(npsDevice.getSource(), false));
                }
            }
        }
        this.hasClickedEntrance.setValue(CollectionsKt___CollectionsKt.toMutableList(linkedHashMap.values()));
        NpsUtil.INSTANCE.updateNpsClickStatus(this.hasClickedEntrance.getValue());
    }

    public final void updateBoundDevices(@NotNull List<? extends Device> devices) {
        if (Intrinsics.areEqual(this.boundDevices.getValue(), devices)) {
            return;
        }
        this.boundDevices.setValue(devices);
        HMLog.debug(TAG, new d(devices));
        fetchNpsTargets();
    }
}
