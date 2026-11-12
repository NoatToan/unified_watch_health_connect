package com.xiaomi.hm.health.device.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.tools.log.HMLog;
import com.huami.watch.notification.TransportUri;
import com.huami.widget.share.ShareAnalytics;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.HardwareInfo;
import com.xiaomi.hm.health.bt.profile.page.PageItem;
import com.xiaomi.hm.health.device.viewmodel.ShortcutAppSortNewViewModel;
import com.xiaomi.hm.health.model.account.secondaryscreen.SecondaryModel;
import com.xiaomi.hm.health.model.account.secondaryscreen.SecondaryScreen;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 B2\u00020\u00012\u00020\u0002:\u0001BB\u0007¢\u0006\u0004\b@\u0010AJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J \u0010\u000b\u001a\u00020\n2\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0007j\b\u0012\u0004\u0012\u00020\u0003`\bH\u0002J\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005J\u0006\u0010\u000f\u001a\u00020\u000eJ\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0007j\b\u0012\u0004\u0012\u00020\u0003`\bJ\u0016\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eJ\u0016\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eJ\u000e\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u000eJ\u0006\u0010\u0016\u001a\u00020\nJ\u0006\u0010\u0017\u001a\u00020\u0005R\u001d\u0010\u001d\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\"\u001a\u00020\u001e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010!R\u001d\u0010'\u001a\u00020#8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010&R\u0016\u0010*\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R:\u0010/\u001a&\u0012\f\u0012\n ,*\u0004\u0018\u00010\u00030\u0003 ,*\u0012\u0012\f\u0012\n ,*\u0004\u0018\u00010\u00030\u0003\u0018\u00010-0+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010.R\u0016\u00101\u001a\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00100R\u001e\u00102\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010.R&\u00105\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0007j\b\u0012\u0004\u0012\u00020\u0003`\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R#\u00109\u001a\b\u0012\u0004\u0012\u00020\u0005068F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b7\u00108R/\u0010<\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0007j\b\u0012\u0004\u0012\u00020\u0003`\b068\u0006@\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b\u0010\u00108R#\u0010?\u001a\b\u0012\u0004\u0012\u00020\u000e068F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b=\u0010\u001a\u001a\u0004\b>\u00108¨\u0006C"}, d2 = {"Lcom/xiaomi/hm/health/device/viewmodel/ShortcutAppSortNewViewModel;", "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/component/KoinComponent;", "Lcom/xiaomi/hm/health/model/account/secondaryscreen/SecondaryModel;", "model", "", "i", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "saveList", "", "g", "enable", "setBtStatusEnable", "", "getDividerIndex", "getSecondaryModelList", "from", "to", "drag", "delete", TransportUri.ACTION_ADD, ShareAnalytics.ParamValue.SAVE, "isMusicEnable", "Lcom/huami/devicex/manager/DeviceManagerApi;", "a", "Lkotlin/Lazy;", "e", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "b", "f", "()Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "deviceUtilsApi", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "c", "getDeviceSource", "()Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", GoogleApiAvailabilityLight.a, LogUtil.I, "dividerIndex", "", "kotlin.jvm.PlatformType", "", "Ljava/util/List;", "defaultSecondaryModelList", "Lcom/xiaomi/hm/health/model/account/secondaryscreen/SecondaryModel;", "defaultSecondary", "displayDataNewList", "h", "Ljava/util/ArrayList;", "unSupport", "Landroidx/lifecycle/MutableLiveData;", "getBtStatusEnable", "()Landroidx/lifecycle/MutableLiveData;", "btStatusEnable", z.j, "Landroidx/lifecycle/MutableLiveData;", "secondaryModelList", hl.k, "getSaveType", "saveType", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class ShortcutAppSortNewViewModel extends ViewModel implements KoinComponent {
    public static final int MAX_VISIBLE_SIZE = 10;
    public static final int MAX_VISIBLE_SIZE_NEW = 6;
    public static final int SAVE_TYPE_FAIL = 3;
    public static final int SAVE_TYPE_PROGRESS = 1;
    public static final int SAVE_TYPE_SUCCESS = 2;

    @NotNull
    private static final String l = "ShortcutAppSortNewViewModel";
    private static final int m = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceUtilsApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceSource;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int dividerIndex;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<SecondaryModel> defaultSecondaryModelList;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final SecondaryModel defaultSecondary;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private final List<SecondaryModel> displayDataNewList;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<SecondaryModel> unSupport;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy btStatusEnable;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<ArrayList<SecondaryModel>> secondaryModelList;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy saveType;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<MutableLiveData<Boolean>> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<Boolean> getA() {
            MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
            mutableLiveData.setValue(Boolean.TRUE);
            return mutableLiveData;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<HMDeviceSource> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HMDeviceSource getA() {
            return ShortcutAppSortNewViewModel.this.e().getBoundDeviceSource(HMDeviceType.MILI);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<MutableLiveData<Integer>> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<Integer> getA() {
            MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
            mutableLiveData.setValue(0);
            return mutableLiveData;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ ArrayList<SecondaryModel> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ArrayList<SecondaryModel> arrayList) {
            super(0);
            this.a = arrayList;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "list:" + Arrays.toString(this.a.toArray());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShortcutAppSortNewViewModel() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.viewmodel.ShortcutAppSortNewViewModel$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceManagerApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.deviceUtilsApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<DeviceUtilsApi>() { // from class: com.xiaomi.hm.health.device.viewmodel.ShortcutAppSortNewViewModel$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.basic.DeviceUtilsApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceUtilsApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceUtilsApi.class), objArr2, objArr3);
            }
        });
        this.deviceSource = LazyKt__LazyJVMKt.lazy(new b());
        this.defaultSecondaryModelList = SecondaryScreen.getInstance().getDefaultSecondaryModelList(getDeviceSource());
        int i = 0;
        this.defaultSecondary = new SecondaryModel(-1, false, -1);
        List<SecondaryModel> displayDataNewList = f().getDisplayDataNewList();
        this.displayDataNewList = displayDataNewList;
        this.unSupport = new ArrayList<>();
        this.btStatusEnable = LazyKt__LazyJVMKt.lazy(a.a);
        MutableLiveData<ArrayList<SecondaryModel>> mutableLiveData = new MutableLiveData<>();
        ArrayList arrayList = new ArrayList(displayDataNewList == null ? CollectionsKt__CollectionsKt.emptyList() : displayDataNewList);
        ArrayList<SecondaryModel> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        if (size > 0) {
            while (true) {
                int i2 = i + 1;
                SecondaryModel secondaryModel = (SecondaryModel) arrayList.get(i);
                if (i(secondaryModel)) {
                    this.unSupport.add(secondaryModel);
                } else {
                    if (secondaryModel.isEnable()) {
                        this.dividerIndex++;
                    }
                    arrayList2.add(secondaryModel);
                }
                if (i2 >= size) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        g.sortWith(arrayList2, new Comparator() { // from class: iu6
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ShortcutAppSortNewViewModel.h((SecondaryModel) obj, (SecondaryModel) obj2);
            }
        });
        arrayList2.add(this.dividerIndex, this.defaultSecondary);
        HMLog.debug(l, new d(arrayList));
        mutableLiveData.setValue(arrayList2);
        Unit unit = Unit.INSTANCE;
        this.secondaryModelList = mutableLiveData;
        this.saveType = LazyKt__LazyJVMKt.lazy(c.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(ArrayList arrayList, ShortcutAppSortNewViewModel shortcutAppSortNewViewModel, SecondaryModel secondaryModel, SecondaryModel secondaryModel2) {
        int iIndexOf = arrayList.indexOf(secondaryModel);
        int iIndexOf2 = arrayList.indexOf(secondaryModel2);
        int i = shortcutAppSortNewViewModel.dividerIndex;
        if (iIndexOf <= i || iIndexOf2 <= i) {
            return 0;
        }
        return shortcutAppSortNewViewModel.defaultSecondaryModelList.indexOf(secondaryModel) - shortcutAppSortNewViewModel.defaultSecondaryModelList.indexOf(secondaryModel2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceManagerApi e() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final DeviceUtilsApi f() {
        return (DeviceUtilsApi) this.deviceUtilsApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(ArrayList<SecondaryModel> saveList) {
        for (SecondaryModel secondaryModel : this.unSupport) {
            secondaryModel.setEnable(false);
            secondaryModel.setIndex(saveList.size());
            saveList.add(secondaryModel);
        }
        List<SecondaryModel> list = this.displayDataNewList;
        if (list != null) {
            list.clear();
        }
        List<SecondaryModel> list2 = this.displayDataNewList;
        if (list2 != null) {
            list2.addAll(saveList);
        }
        SecondaryScreen.getInstance().save(true);
    }

    private final HMDeviceSource getDeviceSource() {
        return (HMDeviceSource) this.deviceSource.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int h(SecondaryModel secondaryModel, SecondaryModel secondaryModel2) {
        return secondaryModel.getIndex() - secondaryModel2.getIndex();
    }

    private final boolean i(SecondaryModel model) {
        DeviceInfo deviceInfo;
        HMBaseDevice device = e().getDevice(getDeviceSource().getType());
        return (device == null || (deviceInfo = device.getDeviceInfo()) == null || HardwareInfo.isMiliKongmingMainLand(deviceInfo.getHardwareVersionStr()) || model.getType() != 17) ? false : true;
    }

    public final void add(int from) {
        ArrayList<SecondaryModel> arrayListM3447getSecondaryModelList = m3447getSecondaryModelList();
        arrayListM3447getSecondaryModelList.add(this.dividerIndex, arrayListM3447getSecondaryModelList.remove(from));
        this.dividerIndex++;
    }

    public final void delete(int from, int to) {
        final ArrayList<SecondaryModel> arrayListM3447getSecondaryModelList = m3447getSecondaryModelList();
        arrayListM3447getSecondaryModelList.add(to, arrayListM3447getSecondaryModelList.remove(from));
        this.dividerIndex--;
        g.sortWith(arrayListM3447getSecondaryModelList, new Comparator() { // from class: hu6
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ShortcutAppSortNewViewModel.c(arrayListM3447getSecondaryModelList, this, (SecondaryModel) obj, (SecondaryModel) obj2);
            }
        });
    }

    public final void drag(int from, int to) {
        int i = this.dividerIndex;
        if (to <= i && i < from) {
            add(from);
            return;
        }
        if (from + 1 <= i && i <= to) {
            delete(from, i);
        } else {
            ArrayList<SecondaryModel> arrayListM3447getSecondaryModelList = m3447getSecondaryModelList();
            arrayListM3447getSecondaryModelList.add(to, arrayListM3447getSecondaryModelList.remove(from));
        }
    }

    @NotNull
    public final MutableLiveData<Boolean> getBtStatusEnable() {
        return (MutableLiveData) this.btStatusEnable.getValue();
    }

    public final int getDividerIndex() {
        return this.dividerIndex;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final MutableLiveData<Integer> getSaveType() {
        return (MutableLiveData) this.saveType.getValue();
    }

    @NotNull
    public final MutableLiveData<ArrayList<SecondaryModel>> getSecondaryModelList() {
        return this.secondaryModelList;
    }

    public final boolean isMusicEnable() {
        ArrayList<SecondaryModel> value;
        ArrayList<SecondaryModel> value2 = this.secondaryModelList.getValue();
        SecondaryModel secondaryModel = null;
        Integer numValueOf = value2 == null ? null : Integer.valueOf(value2.indexOf(new SecondaryModel(4, false, -1)));
        if (numValueOf != null && (value = this.secondaryModelList.getValue()) != null) {
            secondaryModel = value.get(numValueOf.intValue());
        }
        return secondaryModel != null && secondaryModel.isEnable();
    }

    public final void save() {
        PageItem pageItem;
        getSaveType().setValue(1);
        ArrayList arrayList = new ArrayList();
        ArrayList<SecondaryModel> arrayListM3447getSecondaryModelList = m3447getSecondaryModelList();
        final ArrayList arrayList2 = new ArrayList();
        int size = arrayListM3447getSecondaryModelList.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                SecondaryModel secondaryModel = arrayListM3447getSecondaryModelList.get(i);
                if (!Intrinsics.areEqual(secondaryModel, this.defaultSecondary)) {
                    if (i < this.dividerIndex) {
                        secondaryModel.setIndex(i);
                        secondaryModel.setEnable(true);
                        pageItem = new PageItem(i, secondaryModel.getType(), secondaryModel.getParentType(), false);
                    } else {
                        int i3 = i - 1;
                        secondaryModel.setIndex(i3);
                        secondaryModel.setEnable(false);
                        pageItem = new PageItem(i3, secondaryModel.getType(), secondaryModel.getParentType(), true);
                    }
                    arrayList.add(pageItem);
                    arrayList2.add(secondaryModel);
                }
                if (i2 > size) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        HMBaseDevice device = e().getDevice(HMDeviceType.MILI);
        Objects.requireNonNull(device, "null cannot be cast to non-null type com.xiaomi.hm.health.bt.device.HMMiLiProDevice");
        ((HMMiLiProDevice) device).setPages(arrayList, new HMCallback<Boolean>() { // from class: com.xiaomi.hm.health.device.viewmodel.ShortcutAppSortNewViewModel$save$1$1
            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public /* bridge */ /* synthetic */ void onFinish(Boolean bool) {
                onFinish(bool.booleanValue());
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(boolean result) {
                if (!result) {
                    this.a.getSaveType().setValue(3);
                } else {
                    this.a.g(arrayList2);
                    this.a.getSaveType().setValue(2);
                }
            }
        });
    }

    public final void setBtStatusEnable(boolean enable) {
        getBtStatusEnable().setValue(Boolean.valueOf(enable));
    }

    @NotNull
    /* JADX INFO: renamed from: getSecondaryModelList, reason: collision with other method in class */
    public final ArrayList<SecondaryModel> m3447getSecondaryModelList() {
        return this.secondaryModelList.getValue();
    }
}
