package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.quickstart;

import android.text.TextUtils;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.assistant.ocr.camera.CameraActivity;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.bluetooth.profile.channel.module.settings.entity.general.General;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.StringEnum;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.setting.appsort.repo.iddesc.IdDescApi;
import com.xiaomi.hm.health.device.setting.appsort.repo.iddesc.MockAppSortIdDescImpl;
import com.xiaomi.hm.health.device.setting.appsort.repo.iddesc.web.RealIdDescImpl;
import com.xiaomi.hm.health.device.setting.network.bean.QuickStart;
import com.xiaomi.hm.health.device.setting.network.bean.WatchSettings;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.loading.LoadingVo;
import com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b:\u0010;J\u0010\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002J6\u0010\r\u001a\u00020\f2&\u0010\t\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005j\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\b2\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\u000e\u001a\u00020\fJ\u0016\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nR\u001d\u0010\u0017\u001a\u00020\u00128B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\"\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\"\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001aR\"\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001aR+\u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0%0\u00188\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010\u001a\u001a\u0004\b'\u0010\u001cR\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R6\u0010\t\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005j\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00104\u001a\u0004\u0018\u0001018B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0018\u00107\u001a\u0004\u0018\u0001058B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u00106R!\u00109\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00188F@\u0006¢\u0006\u0006\u001a\u0004\b8\u0010\u001c¨\u0006<"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/quickstart/QuickStartViewModel;", "Landroidx/lifecycle/ViewModel;", "", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/quickstart/QuickStartVo;", "c", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "watchSettings", "", "type", "", PointCategory.LOAD, "getQuickStartList", "origin", "curr", "setQuickStart", "Lcom/xiaomi/hm/health/device/setting/appsort/repo/iddesc/IdDescApi;", "a", "Lkotlin/Lazy;", "b", "()Lcom/xiaomi/hm/health/device/setting/appsort/repo/iddesc/IdDescApi;", "idSortApi", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/loading/LoadingVo;", "Landroidx/lifecycle/MutableLiveData;", "getLoadingLiveData", "()Landroidx/lifecycle/MutableLiveData;", "loadingLiveData", "longPressSideAppLiveData", GoogleApiAvailabilityLight.a, "longPressUpAppLiveData", "e", "clickDownAppLiveData", "f", "clickSelectAppLiveData", "Lkotlin/Pair;", "g", "getQuickStartIndexLiveData", "quickStartIndexLiveData", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "h", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "settingsModule", "i", "Ljava/util/HashMap;", z.j, LogUtil.I, "Lcom/huami/bluetooth/profile/channel/module/settings/entity/general/General;", "getGeneral", "()Lcom/huami/bluetooth/profile/channel/module/settings/entity/general/General;", CameraActivity.CONTENT_TYPE_GENERAL, "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/StringEnum;", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/StringEnum;", "currApps", "getQuickStartListLiveData", "quickStartListLiveData", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class QuickStartViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy idSortApi = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<LoadingVo> loadingLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<QuickStartVo>> longPressSideAppLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<QuickStartVo>> longPressUpAppLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<QuickStartVo>> clickDownAppLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<QuickStartVo>> clickSelectAppLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Pair<Integer, Integer>> quickStartIndexLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private SettingsModule settingsModule;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private HashMap<SettingsGroupType, Settings> watchSettings;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int type;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/repo/iddesc/web/RealIdDescImpl;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<RealIdDescImpl> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RealIdDescImpl invoke() {
            HMDeviceSource deviceSource;
            HMBaseDevice device = HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
            Integer numValueOf = null;
            if (device != null && (deviceSource = device.getDeviceSource()) != null) {
                numValueOf = Integer.valueOf(deviceSource.getValue());
            }
            return new RealIdDescImpl(1, numValueOf);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.quickstart.QuickStartViewModel$setQuickStart$1$1", f = "QuickStartViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return QuickStartViewModel.this.new b(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            StringEnum stringEnumA = QuickStartViewModel.this.a();
            if (stringEnumA != null) {
                stringEnumA.setValue(this.c);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<WatchSettings, Unit> {
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(1);
            this.b = str;
        }

        public final void a(@NotNull WatchSettings watchSettings) {
            QuickStart quickStart;
            int i = QuickStartViewModel.this.type;
            if (i == 1) {
                QuickStart quickStart2 = watchSettings.getQuickStart();
                if (quickStart2 == null) {
                    return;
                }
                quickStart2.setTargetAppStartByLongPressSideKey(MockAppSortIdDescImpl.INSTANCE.hexStrToInt(this.b));
                return;
            }
            if (i == 2) {
                QuickStart quickStart3 = watchSettings.getQuickStart();
                if (quickStart3 == null) {
                    return;
                }
                quickStart3.setTargetAppStartByLongPressUpKey(MockAppSortIdDescImpl.INSTANCE.hexStrToInt(this.b));
                return;
            }
            if (i != 3) {
                if (i == 4 && (quickStart = watchSettings.getQuickStart()) != null) {
                    quickStart.setTargetAppStartByClickSelectKey(MockAppSortIdDescImpl.INSTANCE.hexStrToInt(this.b));
                    return;
                }
                return;
            }
            QuickStart quickStart4 = watchSettings.getQuickStart();
            if (quickStart4 == null) {
                return;
            }
            quickStart4.setTargetAppStartByClickDownKey(MockAppSortIdDescImpl.INSTANCE.hexStrToInt(this.b));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WatchSettings watchSettings) {
            a(watchSettings);
            return Unit.INSTANCE;
        }
    }

    public QuickStartViewModel() {
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
        this.settingsModule = device == null ? null : (SettingsModule) device.getChannelModule(SettingsModule.class);
        this.type = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StringEnum a() {
        General general;
        int i = this.type;
        if (i == 1) {
            General general2 = getGeneral();
            if (general2 == null) {
                return null;
            }
            return general2.getLongPressSideApp();
        }
        if (i == 2) {
            General general3 = getGeneral();
            if (general3 == null) {
                return null;
            }
            return general3.getLongPressUpApp();
        }
        if (i != 3) {
            if (i == 4 && (general = getGeneral()) != null) {
                return general.getClickSelectApp();
            }
            return null;
        }
        General general4 = getGeneral();
        if (general4 == null) {
            return null;
        }
        return general4.getClickDownApp();
    }

    private final IdDescApi b() {
        return (IdDescApi) this.idSortApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x000f  */
    public final List<QuickStartVo> c() {
        StringEnum longPressSideApp;
        General general;
        int i = this.type;
        if (i == 1) {
            General general2 = getGeneral();
            if (general2 == null) {
                longPressSideApp = null;
            } else {
                longPressSideApp = general2.getLongPressSideApp();
            }
        } else if (i == 2) {
            General general3 = getGeneral();
            if (general3 == null) {
                longPressSideApp = null;
            } else {
                longPressSideApp = general3.getLongPressUpApp();
            }
        } else if (i == 3) {
            General general4 = getGeneral();
            if (general4 == null) {
                longPressSideApp = null;
            } else {
                longPressSideApp = general4.getClickDownApp();
            }
        } else if (i == 4 && (general = getGeneral()) != null) {
            longPressSideApp = general.getClickSelectApp();
        } else {
            longPressSideApp = null;
        }
        if (longPressSideApp == null) {
            return null;
        }
        IdDescApi idDescApiB = b();
        ArrayList<String> enums = longPressSideApp.getEnums();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(enums, 10));
        Iterator<T> it2 = enums.iterator();
        while (it2.hasNext()) {
            arrayList.add(String.valueOf(MockAppSortIdDescImpl.INSTANCE.hexStrToInt((String) it2.next())));
        }
        if (!idDescApiB.parse(arrayList)) {
            return null;
        }
        int i2 = 0;
        String value = longPressSideApp.getValue();
        ArrayList<String> enums2 = longPressSideApp.getEnums();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(enums2, 10));
        for (String str : enums2) {
            arrayList2.add(new QuickStartVo(b().getDesc(String.valueOf(MockAppSortIdDescImpl.INSTANCE.hexStrToInt(str))), str, TextUtils.equals(value, str), i2));
            i2++;
        }
        return arrayList2;
    }

    private final General getGeneral() {
        HashMap<SettingsGroupType, Settings> map = this.watchSettings;
        Settings settings = map == null ? null : map.get(SettingsGroupType.GENERAL);
        if (settings instanceof General) {
            return (General) settings;
        }
        return null;
    }

    @NotNull
    public final MutableLiveData<LoadingVo> getLoadingLiveData() {
        return this.loadingLiveData;
    }

    @NotNull
    public final MutableLiveData<Pair<Integer, Integer>> getQuickStartIndexLiveData() {
        return this.quickStartIndexLiveData;
    }

    public final void getQuickStartList() {
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new QuickStartViewModel$getQuickStartList$$inlined$safeLaunch$1(null, this), 2, null);
    }

    @Nullable
    public final MutableLiveData<List<QuickStartVo>> getQuickStartListLiveData() {
        int i = this.type;
        if (i == 1) {
            return this.longPressSideAppLiveData;
        }
        if (i == 2) {
            return this.longPressUpAppLiveData;
        }
        if (i == 3) {
            return this.clickDownAppLiveData;
        }
        if (i != 4) {
            return null;
        }
        return this.clickSelectAppLiveData;
    }

    public final void load(@Nullable HashMap<SettingsGroupType, Settings> watchSettings, int type) {
        this.watchSettings = watchSettings;
        this.type = type;
    }

    public final void setQuickStart(int origin, int curr) {
        LoadingVo.Companion.postStartMsg$default(LoadingVo.INSTANCE, this.loadingLiveData, null, 2, null);
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new QuickStartViewModel$setQuickStart$$inlined$safeLaunch$1(null, this, curr, origin), 2, null);
    }
}
