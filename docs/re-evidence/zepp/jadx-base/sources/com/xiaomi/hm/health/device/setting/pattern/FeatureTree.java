package com.xiaomi.hm.health.device.setting.pattern;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.exifinterface.media.ExifInterface;
import androidx.p010navigation.NavController;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.passport.Configs;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.setting.SoftFeature;
import com.xiaomi.hm.health.device.setting.vo.WatchAppItemVo;
import com.xiaomi.market.sdk.Constants;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.h;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b9\u0010:J\b\u0010\u0003\u001a\u00020\u0002H\u0004J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0004J#\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\tH\u0004¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\r\u001a\u00020\n2\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\tH\u0004¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000eH\u0004J \u0010\u0014\u001a\u00020\u0006\"\b\b\u0000\u0010\u0011*\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0004J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u000eH\u0004JN\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\t2\b\b\u0001\u0010\u0016\u001a\u00020\u000e2\b\b\u0002\u0010\u0017\u001a\u00020\u000e2\b\b\u0003\u0010\u0018\u001a\u00020\u000e2\b\b\u0002\u0010\u0019\u001a\u00020\u00062\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\n\u0018\u00010\u001aJ\u000e\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tJ\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001fJ\u0010\u0010#\u001a\u0004\u0018\u00010 2\u0006\u0010\"\u001a\u00020\tJ\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0$J\u000e\u0010&\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tJ\u0016\u0010'\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0006J\b\u0010(\u001a\u00020\nH&J\u0006\u0010)\u001a\u00020\nR\u001d\u0010.\u001a\u00020*8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R&\u00103\u001a\u0012\u0012\u0004\u0012\u00020\t0/j\b\u0012\u0004\u0012\u00020\t`08\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R&\u00108\u001a\u0012\u0012\u0004\u0012\u00020 04j\b\u0012\u0004\u0012\u00020 `58\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u0006;"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/pattern/FeatureTree;", "Lorg/koin/core/component/KoinComponent;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "findDeviceSource", "Lcom/xiaomi/hm/health/device/deviceconfig/Feature;", Constants.JSON_FEATURE, "", "isSupportDeviceFeature", "", "Lcom/xiaomi/hm/health/device/setting/SoftFeature;", "", "putFeature", "([Lcom/xiaomi/hm/health/device/setting/SoftFeature;)V", "removeFeature", "", "isDeviceSupportFeature", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "module", "supportModule", "moduleId", "iconRes", "index", "titleRes", "isEnable", "Lkotlin/Function1;", "Landroidx/navigation/NavController;", "action", "setAppItem", "removeAppItem", "", "Lcom/xiaomi/hm/health/device/setting/vo/WatchAppItemVo;", "loadApplicationSetting", "type", "findWatchApp", "", "allFeatures", "isSupport", "setFeatureEnable", "setup", Configs.Params.RESET, "Lcom/huami/devicex/manager/DeviceManagerApi;", "a", "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "b", "Ljava/util/HashSet;", "supportFeatures", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "c", "Ljava/util/ArrayList;", "watchApps", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public abstract class FeatureTree implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final HashSet<SoftFeature> supportFeatures;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<WatchAppItemVo> watchApps;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "supportFeatures is empty!";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FeatureTree() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.setting.pattern.FeatureTree$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceManagerApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
        this.supportFeatures = new HashSet<>();
        this.watchApps = new ArrayList<>();
    }

    private final DeviceManagerApi a() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setAppItem$default(FeatureTree featureTree, SoftFeature softFeature, int i, int i2, int i3, boolean z, Function1 function1, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAppItem");
        }
        featureTree.setAppItem(softFeature, i, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? 0 : i3, (i4 & 16) != 0 ? true : z, (i4 & 32) != 0 ? null : function1);
    }

    @NotNull
    public final Set<SoftFeature> allFeatures() {
        return this.supportFeatures;
    }

    @NotNull
    public final HMDeviceSource findDeviceSource() {
        return a().getBoundDeviceSource(HMDeviceType.MILI);
    }

    @Nullable
    public final WatchAppItemVo findWatchApp(@NotNull SoftFeature type) {
        Object next;
        WatchAppItemVo watchAppItemVo;
        synchronized (this.supportFeatures) {
            Iterator<T> it2 = this.watchApps.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!(((WatchAppItemVo) next).getType() == type));
            watchAppItemVo = (WatchAppItemVo) next;
        }
        return watchAppItemVo;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public final boolean isDeviceSupportFeature(int feature) {
        DeviceInfo deviceInfo;
        Feature deviceFeature;
        HMBaseDevice device = a().getDevice(HMDeviceType.MILI);
        if (device == null || (deviceInfo = device.getDeviceInfo()) == null || (deviceFeature = deviceInfo.getDeviceFeature()) == null) {
            return false;
        }
        return deviceFeature.hasSw(feature);
    }

    public final boolean isSupport(@NotNull SoftFeature feature) {
        synchronized (this.supportFeatures) {
            if (this.supportFeatures.isEmpty()) {
                HMLog.error$default(null, null, null, a.a, 7, null);
                return false;
            }
            return this.supportFeatures.contains(feature);
        }
    }

    public final boolean isSupportDeviceFeature(@NotNull com.xiaomi.hm.health.device.deviceconfig.Feature feature) {
        return ConfigHelperKt.hasFeature(findDeviceSource(), feature);
    }

    @NotNull
    public final List<WatchAppItemVo> loadApplicationSetting() {
        ArrayList arrayList;
        synchronized (this.supportFeatures) {
            List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(this.watchApps, new Comparator() { // from class: com.xiaomi.hm.health.device.setting.pattern.FeatureTree$loadApplicationSetting$lambda-7$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((WatchAppItemVo) t).getIndex()), Integer.valueOf(((WatchAppItemVo) t2).getIndex()));
                }
            });
            arrayList = new ArrayList();
            for (Object obj : listSortedWith) {
                if (((WatchAppItemVo) obj).getEnable()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    public final void putFeature(@NotNull SoftFeature... feature) {
        h.addAll(this.supportFeatures, feature);
    }

    public final void removeAppItem(@NotNull SoftFeature feature) {
        Object next;
        synchronized (this.supportFeatures) {
            Iterator<T> it2 = this.watchApps.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!(((WatchAppItemVo) next).getType() == feature));
            WatchAppItemVo watchAppItemVo = (WatchAppItemVo) next;
            if (watchAppItemVo != null) {
                this.watchApps.remove(watchAppItemVo);
            }
        }
    }

    public final void removeFeature(@NotNull SoftFeature... feature) {
        h.removeAll(this.supportFeatures, feature);
    }

    public final void reset() {
        synchronized (this.supportFeatures) {
            this.watchApps.clear();
            this.supportFeatures.clear();
            setup();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void setAppItem(@NotNull SoftFeature feature, @DrawableRes int iconRes, int index, @StringRes int titleRes, boolean isEnable, @Nullable Function1<? super NavController, Unit> action) {
        Object next;
        try {
            synchronized (this.supportFeatures) {
                Iterator<T> it2 = this.watchApps.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!(((WatchAppItemVo) next).getType() == feature));
                WatchAppItemVo watchAppItemVo = (WatchAppItemVo) next;
                WatchAppItemVo watchAppItemVo2 = new WatchAppItemVo(index, feature, iconRes, isEnable, titleRes, action);
                if (watchAppItemVo == null) {
                    putFeature(feature);
                    this.watchApps.add(watchAppItemVo2);
                } else {
                    this.watchApps.set(this.watchApps.indexOf(watchAppItemVo), watchAppItemVo2);
                    Unit unit = Unit.INSTANCE;
                }
            }
        } catch (Throwable th) {
            HMLog.e("FeatureTree", th);
        }
    }

    public final void setFeatureEnable(@NotNull SoftFeature feature, boolean isEnable) {
        synchronized (this.supportFeatures) {
            try {
                if (isEnable) {
                    putFeature(feature);
                } else {
                    removeFeature(feature);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void setup();

    public final <T extends BaseModule> boolean supportModule(@NotNull Class<T> module) {
        HMBaseDevice device = a().getDevice(HMDeviceType.MILI);
        if (device == null) {
            return false;
        }
        return device.supportModule(module);
    }

    public final boolean supportModule(int moduleId) {
        HMBaseDevice device = a().getDevice(HMDeviceType.MILI);
        if (device == null) {
            return false;
        }
        return device.supportModule(moduleId);
    }
}
