package com.xiaomi.hm.health.device.setting.appsort.utils;

import android.util.SparseArray;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.devicex.funapi.ManagerFunctionsKt;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.model.HMDisplaySetting;
import com.xiaomi.hm.health.bt.model.appsort.AppItem;
import com.xiaomi.hm.health.bt.model.appsort.SortableAppItems;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.hm.health.device.setting.appsort.AppSortHelperApi;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0016\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u001a\u0010\f\u001a\u00020\u000b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\b\u001a$\u0010\r\u001a\u00020\u000b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\tH\u0002\u001a\u001a\u0010\u0010\u001a\u00020\u000b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\b\u001a\u001a\u0010\u0011\u001a\u00020\u000b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\b\u001a\u001a\u0010\u0012\u001a\u00020\u000b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\b\u001a\u001a\u0010\u0013\u001a\u00020\u000b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\b\u001a\u001a\u0010\u0014\u001a\u00020\u000b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\b\u001a\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0004H\u0002\"\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019\"\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u001b\"2\u0010\u001e\u001a\u001e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00180\bj\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0018`\u001d8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\"\u0016\u0010 \u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u001b\"\u0016\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u001b\"\u0016\u0010\"\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u001b\"\u0016\u0010#\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u001b¨\u0006$"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "", "needCheckFwForPai", "", "type", "shouldHidePAI", "isFwSupportPAI", "Ljava/util/HashMap;", "Lcom/xiaomi/hm/health/bt/model/appsort/SortableAppItems;", SportAnalytics.ParamValue.MapButtonType.MAP, "", "checkPAI", "c", "setting", "b", "upgradeTokyo", "upgradeDth", "upgradeTonlesapo", "upgradeTonlesapol", "upgradeVulture", "sortableAppItems", "count", "a", "", "Ljava/lang/String;", "TAG", LogUtil.I, "VULTURE_APP_COUNT", "Lkotlin/collections/HashMap;", "SUPPORT_PAI_FW_VERSION_MAP", "Ljava/util/HashMap;", "APP_COUNT_DTH", "APP_COUNT_TONLESAP_O", "APP_COUNT_TONLESAP_OL", "APP_COUNT_TOKYO", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class AppSortUtilKt {
    public static final int APP_COUNT_DTH = 13;
    public static final int APP_COUNT_TOKYO = 11;
    public static final int APP_COUNT_TONLESAP_O = 11;
    public static final int APP_COUNT_TONLESAP_OL = 10;

    @JvmField
    @NotNull
    public static final HashMap<HMDeviceSource, String> SUPPORT_PAI_FW_VERSION_MAP;

    @NotNull
    private static final String a = "AppSortUtil";
    private static final int b = 15;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceSource a;
        public final /* synthetic */ Ref.ObjectRef<Integer> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HMDeviceSource hMDeviceSource, Ref.ObjectRef<Integer> objectRef) {
            super(0);
            this.a = hMDeviceSource;
            this.b = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "currSource: " + this.a + ", currFwVersion: " + this.b.element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "needUpgradeDTH:" + this.a;
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
            return "needCalibrationTimer:true";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceSource a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(HMDeviceSource hMDeviceSource, boolean z) {
            super(0);
            this.a = hMDeviceSource;
            this.b = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "source: " + this.a + ", needUpgradePAI: " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "needUpgradeTokyo:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "needUpgradeTonlesapo:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "needCalibrationTimer:true";
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
            return "needUpgradeTonlesapol:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public static final i a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "needCalibrationTimer:true";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "needUpgradeVulture: " + this.a;
        }
    }

    static {
        HashMap<HMDeviceSource, String> map = new HashMap<>();
        map.put(HMDeviceSource.MILI_FALCON, "1.6.7.01");
        map.put(HMDeviceSource.MILI_FALCON_W, "1.3.5.01");
        map.put(HMDeviceSource.MILI_FALCON_WL, "1.0.0.01");
        map.put(HMDeviceSource.MILI_HAWK, "0.1.0.00");
        map.put(HMDeviceSource.MILI_HAWK_W, "0.1.0.00");
        map.put(HMDeviceSource.MILI_HAWK_SWK, "0.1.0.00");
        map.put(HMDeviceSource.MILI_HAWK_SWK_W, "0.1.0.00");
        map.put(HMDeviceSource.MILI_KESTREL, "0.0.8.00");
        map.put(HMDeviceSource.MILI_KESTREL_W, "0.0.8.00");
        map.put(HMDeviceSource.MILI_PYH, "1.3.4.00");
        map.put(HMDeviceSource.MILI_PYH_W, "1.3.4.00");
        map.put(HMDeviceSource.MILI_FALCON_DISNEY, "0.0.0.00");
        map.put(HMDeviceSource.MILI_VULTURE, "0.0.0.00");
        SUPPORT_PAI_FW_VERSION_MAP = map;
    }

    private static final int a(SortableAppItems sortableAppItems, int i2) {
        HMBaseDevice device = ManagerFunctionsKt.getDeviceManagerApi().getDevice(HMDeviceType.MILI);
        DeviceInfo deviceInfo = device == null ? null : device.getDeviceInfo();
        Feature deviceFeature = deviceInfo != null ? deviceInfo.getDeviceFeature() : null;
        int i3 = 0;
        boolean z = deviceFeature != null && deviceFeature.hasSw(1);
        if (sortableAppItems.getSparseArrayApps().indexOfKey(26) <= 0 || z) {
            return i2;
        }
        int index = sortableAppItems.getSparseArrayApps().get(26).getIndex();
        sortableAppItems.getSparseArrayApps().remove(26);
        SparseArray<AppItem> sparseArrayApps = sortableAppItems.getSparseArrayApps();
        int size = sparseArrayApps.size();
        if (size > 0) {
            while (true) {
                int i4 = i3 + 1;
                sparseArrayApps.keyAt(i3);
                AppItem appItemValueAt = sparseArrayApps.valueAt(i3);
                if (appItemValueAt.getIndex() > index) {
                    appItemValueAt.setIndex(appItemValueAt.getIndex() - 1);
                }
                if (i4 >= size) {
                    break;
                }
                i3 = i4;
            }
        }
        return i2 - 1;
    }

    private static final boolean b(SortableAppItems sortableAppItems) {
        if (!(sortableAppItems.getSparseArrayApps().indexOfKey(12) >= 0)) {
            return false;
        }
        int iIndexOfKey = sortableAppItems.getSparseArrayApps().indexOfKey(12);
        sortableAppItems.getSparseArrayApps().setValueAt(iIndexOfKey, new AppItem(255, 27, iIndexOfKey, true));
        return true;
    }

    private static final void c(HashMap<HMDeviceSource, SortableAppItems> map, HMDeviceSource hMDeviceSource) {
        SortableAppItems sortableAppItems = map.get(hMDeviceSource);
        if (sortableAppItems == null) {
            return;
        }
        int i2 = 0;
        boolean z = sortableAppItems.getSparseArrayApps().indexOfKey(25) < 0;
        HMLog.info(a, new d(hMDeviceSource, z));
        if (z) {
            int size = sortableAppItems.getSparseArrayApps().size();
            if (size > 0) {
                while (true) {
                    int i3 = i2 + 1;
                    AppItem appItemValueAt = sortableAppItems.getSparseArrayApps().valueAt(i2);
                    if (appItemValueAt.getIndex() != 0) {
                        appItemValueAt.setIndex(appItemValueAt.getIndex() + 1);
                    }
                    if (i3 >= size) {
                        break;
                    } else {
                        i2 = i3;
                    }
                }
            }
            sortableAppItems.getSparseArrayApps().put(25, new AppItem(255, 25, 1, true));
            ((AppSortHelperApi) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(AppSortHelperApi.class), null, null)).syncAppSortDataToDevice(sortableAppItems, hMDeviceSource);
        }
    }

    public static final void checkPAI(@NotNull HashMap<HMDeviceSource, SortableAppItems> map) {
        HMDeviceSource boundDeviceSource = ManagerFunctionsKt.getDeviceManagerApi().getBoundDeviceSource(HMDeviceType.MILI);
        if (SUPPORT_PAI_FW_VERSION_MAP.get(boundDeviceSource) != null && isFwSupportPAI(boundDeviceSource)) {
            c(map, boundDeviceSource);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, java.lang.Integer] */
    public static final boolean isFwSupportPAI(@NotNull HMDeviceSource hMDeviceSource) {
        DeviceInfo deviceInfo;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        HMBaseDevice device = ManagerFunctionsKt.getDeviceManagerApi().getDevice(HMDeviceType.MILI);
        T tValueOf = 0;
        tValueOf = 0;
        if (device != null && (deviceInfo = device.getDeviceInfo()) != null) {
            tValueOf = Integer.valueOf(deviceInfo.getFirmwareVersion());
        }
        objectRef.element = tValueOf;
        if (tValueOf == 0) {
            objectRef.element = Integer.valueOf(ProfileUtils.getVersionCodeFromVersionName(ManagerFunctionsKt.getDeviceManagerApi().getBoundDeviceFirmwareVersion(hMDeviceSource.getType())));
        }
        HMLog.info(a, new a(hMDeviceSource, objectRef));
        String str = SUPPORT_PAI_FW_VERSION_MAP.get(hMDeviceSource);
        if (str == null) {
            return false;
        }
        return ((Number) objectRef.element).intValue() >= ProfileUtils.getVersionCodeFromVersionName(str);
    }

    public static final boolean needCheckFwForPai(@NotNull HMDeviceSource hMDeviceSource) {
        return SUPPORT_PAI_FW_VERSION_MAP.get(hMDeviceSource) != null;
    }

    public static final boolean shouldHidePAI(@NotNull HMDeviceSource hMDeviceSource, int i2) {
        return (SUPPORT_PAI_FW_VERSION_MAP.get(hMDeviceSource) == null || i2 != 25 || isFwSupportPAI(hMDeviceSource)) ? false : true;
    }

    public static final void upgradeDth(@NotNull HashMap<HMDeviceSource, SortableAppItems> map) {
        HMDeviceSource hMDeviceSource = HMDeviceSource.MILI_DTH;
        SortableAppItems sortableAppItems = map.get(hMDeviceSource);
        if (sortableAppItems == null) {
            return;
        }
        boolean z = sortableAppItems.getAppCount() < 13;
        HMLog.info(a, new b(z));
        AppSortHelperApi appSortHelperApi = (AppSortHelperApi) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(AppSortHelperApi.class), null, null);
        if (z) {
            map.put(hMDeviceSource, new HMDisplaySetting(4, true));
            appSortHelperApi.syncAppSortDataToDevice(map.get(hMDeviceSource), hMDeviceSource);
        }
        if (b(sortableAppItems)) {
            appSortHelperApi.syncAppSortDataToDevice(map.get(hMDeviceSource), hMDeviceSource);
            HMLog.info(a, c.a);
        }
    }

    public static final void upgradeTokyo(@NotNull HashMap<HMDeviceSource, SortableAppItems> map) {
        HMDeviceSource hMDeviceSource = HMDeviceSource.MILI_TOKYO;
        SortableAppItems sortableAppItems = map.get(hMDeviceSource);
        if (sortableAppItems == null) {
            return;
        }
        HMDisplaySetting hMDisplaySetting = new HMDisplaySetting(53, true);
        boolean z = ManagerFunctionsKt.getDeviceManagerApi().hasBound(hMDeviceSource) && sortableAppItems.getAppCount() != a(hMDisplaySetting, 11);
        HMLog.info(a, new e(z));
        if (z) {
            map.put(hMDeviceSource, hMDisplaySetting);
            ((AppSortHelperApi) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(AppSortHelperApi.class), null, null)).syncAppSortDataToDevice(map.get(hMDeviceSource), hMDeviceSource);
        }
    }

    public static final void upgradeTonlesapo(@NotNull HashMap<HMDeviceSource, SortableAppItems> map) {
        HMDeviceSource hMDeviceSource = HMDeviceSource.MILI_TONLESAP_O;
        SortableAppItems sortableAppItems = map.get(hMDeviceSource);
        if (sortableAppItems == null) {
            return;
        }
        boolean z = sortableAppItems.getAppCount() < 11;
        HMLog.info(a, new f(z));
        AppSortHelperApi appSortHelperApi = (AppSortHelperApi) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(AppSortHelperApi.class), null, null);
        if (z) {
            map.put(hMDeviceSource, new HMDisplaySetting(13, true));
            appSortHelperApi.syncAppSortDataToDevice(map.get(hMDeviceSource), hMDeviceSource);
        }
        if (b(sortableAppItems)) {
            appSortHelperApi.syncAppSortDataToDevice(map.get(hMDeviceSource), hMDeviceSource);
            HMLog.info(a, g.a);
        }
    }

    public static final void upgradeTonlesapol(@NotNull HashMap<HMDeviceSource, SortableAppItems> map) {
        HMDeviceSource hMDeviceSource = HMDeviceSource.MILI_TONLESAP_OL;
        SortableAppItems sortableAppItems = map.get(hMDeviceSource);
        if (sortableAppItems == null) {
            return;
        }
        boolean z = sortableAppItems.getAppCount() < 10;
        HMLog.info(a, new h(z));
        AppSortHelperApi appSortHelperApi = (AppSortHelperApi) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(AppSortHelperApi.class), null, null);
        if (z) {
            map.put(hMDeviceSource, new HMDisplaySetting(14, true));
            appSortHelperApi.syncAppSortDataToDevice(map.get(hMDeviceSource), hMDeviceSource);
        }
        if (b(sortableAppItems)) {
            appSortHelperApi.syncAppSortDataToDevice(map.get(hMDeviceSource), hMDeviceSource);
            HMLog.info(a, i.a);
        }
    }

    public static final void upgradeVulture(@NotNull HashMap<HMDeviceSource, SortableAppItems> map) {
        HMDeviceSource hMDeviceSource = HMDeviceSource.MILI_VULTURE;
        SortableAppItems sortableAppItems = map.get(hMDeviceSource);
        if (sortableAppItems == null) {
            return;
        }
        boolean z = sortableAppItems.getAppCount() != 15;
        HMLog.info(a, new j(z));
        AppSortHelperApi appSortHelperApi = (AppSortHelperApi) KoinJavaComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(AppSortHelperApi.class), null, null);
        if (z) {
            map.put(hMDeviceSource, new HMDisplaySetting(37, true));
            appSortHelperApi.syncAppSortDataToDevice(map.get(hMDeviceSource), hMDeviceSource);
        }
    }
}
