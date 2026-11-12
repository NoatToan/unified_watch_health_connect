package com.xiaomi.hm.health.ui.smartplay.btphone;

import android.bluetooth.BluetoothAdapter;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.phone.PairStatus;
import com.huami.bluetooth.profile.channel.module.phone.Paired;
import com.huami.bluetooth.profile.channel.module.phone.SettingApi;
import com.huami.bluetooth.profile.channel.module.phone.dto.ItemDto;
import com.huami.discovery.bridge.model.WebItem;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.ui.smartplay.btphone.btphone.BtPhoneDeviceLifeCycle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 /2\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b-\u0010.J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u000b\u001a\u00060\u0007j\u0002`\b*\u00060\u0007j\u0002`\b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J \u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u00102\u0006\u0010\r\u001a\u00020\fH\u0002J\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0014\u001a\u00020\u0004R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u001f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u00188\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\"\u001a\u00020\u001e8\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010'\u001a\u0004\u0018\u00010#8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u0019\u0010&R\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0016\u0010,\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u00060"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/BtPhoneSettingGuideViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huami/bluetooth/profile/channel/module/phone/PairStatus;", "status", "", "e", "(Lcom/huami/bluetooth/profile/channel/module/phone/PairStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "str", "a", "", "enable", "Ljava/util/ArrayList;", "Lcom/huami/bluetooth/profile/channel/module/phone/dto/ItemDto;", "Lkotlin/collections/ArrayList;", "c", "Lcom/huami/discovery/bridge/model/WebItem;", "getGuidingWebItem", "checkToUpdateStatus", "Lcom/huami/bluetooth/profile/channel/module/phone/SettingApi;", "Lcom/huami/bluetooth/profile/channel/module/phone/SettingApi;", "btPhoneApi", "Landroidx/lifecycle/MutableLiveData;", "b", "Landroidx/lifecycle/MutableLiveData;", "getPairedData", "()Landroidx/lifecycle/MutableLiveData;", "pairedData", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getNeedCheckPairStatus", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "needCheckPairStatus", "", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "()Ljava/lang/String;", "btPhoneName", "Lkotlinx/coroutines/CompletableDeferred;", "Lkotlinx/coroutines/CompletableDeferred;", "initDeferred", "f", "handledStatusChange", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class BtPhoneSettingGuideViewModel extends ViewModel {

    @NotNull
    private static final String g = "BtPhoneSettingGuideViewmodel";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private SettingApi btPhoneApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> pairedData = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final AtomicBoolean needCheckPairStatus = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy btPhoneName = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final CompletableDeferred<Unit> initDeferred = CompletableDeferredKt.CompletableDeferred(Unit.INSTANCE);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final AtomicBoolean handledStatusChange = new AtomicBoolean(false);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return BluetoothAdapter.getDefaultAdapter().getName();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "checkToUpdateStatus failed as btphone name is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "start to check pair status";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ PairStatus a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(PairStatus pairStatus) {
            super(0);
            this.a = pairStatus;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "checkToUpdateStatus query status: " + this.a.getValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ WebItem a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(WebItem webItem) {
            super(0);
            this.a = webItem;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "web item url: " + this.a.url;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneSettingGuideViewModel", f = "BtPhoneSettingGuideViewModel.kt", i = {1}, l = {62, 65}, m = "handlePairStatusChanged", n = {"opResult"}, s = {"L$0"})
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
            return BtPhoneSettingGuideViewModel.this.e(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ PairStatus a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(PairStatus pairStatus) {
            super(0);
            this.a = pairStatus;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "bt phone paired changed1: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "bt phone paired changed: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ Boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Boolean bool) {
            super(0);
            this.a = bool;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "update setting result after handlePairStatusChanged: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public static final j a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "handlePairStatusChanged ignore";
        }
    }

    public BtPhoneSettingGuideViewModel() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new BtPhoneSettingGuideViewModel$special$$inlined$safeLaunch$1(null, this), 2, null);
    }

    private final StringBuilder a(StringBuilder sb, CharSequence charSequence) {
        if (charSequence != null) {
            sb.append(charSequence);
        }
        return sb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String b() {
        return (String) this.btPhoneName.getValue();
    }

    private final ArrayList<ItemDto> c(boolean enable) {
        ItemDto itemDto = new ItemDto();
        itemDto.value = enable;
        Unit unit = Unit.INSTANCE;
        return CollectionsKt__CollectionsKt.arrayListOf(itemDto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x0094 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(PairStatus pairStatus, Continuation<? super Unit> continuation) {
        f fVar;
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
        Object objUpdateSetting = fVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = fVar.d;
        if (i3 != 0) {
            if (i3 == 1) {
                ResultKt.throwOnFailure(objUpdateSetting);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bool = (Boolean) fVar.a;
                ResultKt.throwOnFailure(objUpdateSetting);
            }
            BtPhoneDeviceLifeCycle.INSTANCE.cacheBtPhoneEnable(true);
            HMLog.info(g, new i(bool));
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objUpdateSetting);
        HMLog.info(g, new g(pairStatus));
        if (this.handledStatusChange.compareAndSet(false, true)) {
            boolean z = pairStatus instanceof Paired;
            getPairedData().postValue(Boxing.boxBoolean(z));
            HMLog.info(g, new h(z));
            if (z) {
                SettingApi settingApi = this.btPhoneApi;
                if (settingApi == null) {
                    bool = null;
                } else {
                    ArrayList<ItemDto> arrayListC = c(true);
                    fVar.d = 1;
                    objUpdateSetting = settingApi.updateSetting(arrayListC, fVar);
                    if (objUpdateSetting == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                HMPersonInfo.getInstance().getMiliConfig().enableInComingCallTime();
                fVar.a = bool;
                fVar.d = 2;
                if (BtPhoneDevice.showContact(true, fVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                BtPhoneDeviceLifeCycle.INSTANCE.cacheBtPhoneEnable(true);
                HMLog.info(g, new i(bool));
            }
        } else {
            HMLog.info(g, j.a);
        }
        return Unit.INSTANCE;
        bool = (Boolean) objUpdateSetting;
        HMPersonInfo.getInstance().getMiliConfig().enableInComingCallTime();
        fVar.a = bool;
        fVar.d = 2;
        if (BtPhoneDevice.showContact(true, fVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        BtPhoneDeviceLifeCycle.INSTANCE.cacheBtPhoneEnable(true);
        HMLog.info(g, new i(bool));
        return Unit.INSTANCE;
    }

    public final void checkToUpdateStatus() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new BtPhoneSettingGuideViewModel$checkToUpdateStatus$$inlined$safeLaunch$1(null, this), 2, null);
    }

    @NotNull
    public final WebItem getGuidingWebItem() {
        HMDeviceSource deviceSource;
        HMDeviceType type;
        HMDeviceSource deviceSource2;
        DeviceInfo deviceInfo = BtPhoneDevice.INSTANCE.getDeviceInfo();
        StringBuilder sb = new StringBuilder();
        String string = null;
        StringBuilder sbA = a(sb, deviceInfo == null ? null : Integer.toString(deviceInfo.getProductId(), kotlin.text.a.checkRadix(10)));
        sbA.append(".");
        StringBuilder sbA2 = a(sbA, deviceInfo == null ? null : Integer.toString(deviceInfo.getProductVersion(), kotlin.text.a.checkRadix(10)));
        sbA2.append(".");
        StringBuilder sbA3 = a(sbA2, (deviceInfo == null || (deviceSource = deviceInfo.getDeviceSource()) == null || (type = deviceSource.getType()) == null) ? null : Integer.toString(type.getValue(), kotlin.text.a.checkRadix(10)));
        sbA3.append(".");
        if (deviceInfo != null && (deviceSource2 = deviceInfo.getDeviceSource()) != null) {
            string = Integer.toString(deviceSource2.getValue(), kotlin.text.a.checkRadix(10));
        }
        a(sbA3, string);
        WebItem webItem = new WebItem();
        webItem.url = HMServerDef.getHost() + "t/posts/watch?meta_key=device&category=70&meta_value=" + ((Object) sb) + "&platform=watch";
        webItem.isShowMore = false;
        webItem.isUseCache = false;
        webItem.isRefresh = true;
        HMLog.info(g, new e(webItem));
        return webItem;
    }

    @NotNull
    public final AtomicBoolean getNeedCheckPairStatus() {
        return this.needCheckPairStatus;
    }

    @NotNull
    public final MutableLiveData<Boolean> getPairedData() {
        return this.pairedData;
    }
}
