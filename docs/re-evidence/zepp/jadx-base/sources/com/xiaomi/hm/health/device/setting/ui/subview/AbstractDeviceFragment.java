package com.xiaomi.hm.health.device.setting.ui.subview;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.ViewModel;
import com.facebook.appevents.UserDataStore;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.setting.find.FindDeviceViewModel;
import com.xiaomi.hm.health.device.setting.ui.SettingViewModelProvider;
import com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel;
import com.xiaomi.hm.health.device.setting.viewmodel.FeatureViewModel;
import java.util.HashSet;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 *2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b(\u0010)J\u001e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0004J)\u0010\f\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\t*\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0004¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0013\u001a\u00020\u000e8D@\u0004X\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0018\u001a\u0004\u0018\u00010\u00148D@\u0004X\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\u001d\u001a\u0004\u0018\u00010\u00198D@\u0004X\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\"\u001a\u0004\u0018\u00010\u001e8D@\u0004X\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b \u0010!R&\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\u00020#j\b\u0012\u0004\u0012\u00020\u0002`$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/AbstractDeviceFragment;", "Landroidx/fragment/app/Fragment;", "", "target", "Lkotlin/Function0;", "", UserDataStore.FIRST_NAME, "setOnce", "Landroidx/lifecycle/ViewModel;", "R", "Ljava/lang/Class;", "clazz", "loadViewModel", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "Lcom/xiaomi/hm/health/device/setting/ui/SettingViewModelProvider;", "a", "Lkotlin/Lazy;", "getViewModelProvider", "()Lcom/xiaomi/hm/health/device/setting/ui/SettingViewModelProvider;", "viewModelProvider", "Lcom/xiaomi/hm/health/device/setting/viewmodel/FeatureViewModel;", "b", "getFeatureViewModel", "()Lcom/xiaomi/hm/health/device/setting/viewmodel/FeatureViewModel;", "featureViewModel", "Lcom/xiaomi/hm/health/device/setting/viewmodel/DeviceFeatureViewModel;", "c", "getDeviceFeatureViewModel", "()Lcom/xiaomi/hm/health/device/setting/viewmodel/DeviceFeatureViewModel;", "deviceFeatureViewModel", "Lcom/xiaomi/hm/health/device/setting/find/FindDeviceViewModel;", GoogleApiAvailabilityLight.a, "getFindDeviceViewModel", "()Lcom/xiaomi/hm/health/device/setting/find/FindDeviceViewModel;", "findDeviceViewModel", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "e", "Ljava/util/HashSet;", "onceCache", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public abstract class AbstractDeviceFragment extends Fragment {

    @NotNull
    private static final String f = "AbstractDeviceFragment";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModelProvider = LazyKt__LazyJVMKt.lazy(new d());

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy featureViewModel = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceFeatureViewModel = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy findDeviceViewModel = LazyKt__LazyJVMKt.lazy(new c());

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final HashSet<Object> onceCache = new HashSet<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/viewmodel/DeviceFeatureViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<DeviceFeatureViewModel> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DeviceFeatureViewModel invoke() {
            try {
                return (DeviceFeatureViewModel) AbstractDeviceFragment.this.getViewModelProvider().get(DeviceFeatureViewModel.class);
            } catch (Throwable th) {
                HMLog.e(AbstractDeviceFragment.f, "error", th);
                return null;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/viewmodel/FeatureViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<FeatureViewModel> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FeatureViewModel invoke() {
            try {
                return (FeatureViewModel) AbstractDeviceFragment.this.getViewModelProvider().get(FeatureViewModel.class);
            } catch (Throwable th) {
                HMLog.e(AbstractDeviceFragment.f, "error", th);
                return null;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/find/FindDeviceViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<FindDeviceViewModel> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FindDeviceViewModel invoke() {
            try {
                return (FindDeviceViewModel) AbstractDeviceFragment.this.getViewModelProvider().get(FindDeviceViewModel.class);
            } catch (Throwable th) {
                HMLog.e(AbstractDeviceFragment.f, "error", th);
                return null;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/SettingViewModelProvider;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<SettingViewModelProvider> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SettingViewModelProvider invoke() {
            FragmentActivity fragmentActivityRequireActivity = AbstractDeviceFragment.this.requireActivity();
            return new SettingViewModelProvider(fragmentActivityRequireActivity, fragmentActivityRequireActivity);
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Nullable
    public final DeviceFeatureViewModel getDeviceFeatureViewModel() {
        return (DeviceFeatureViewModel) this.deviceFeatureViewModel.getValue();
    }

    @Nullable
    public final FeatureViewModel getFeatureViewModel() {
        return (FeatureViewModel) this.featureViewModel.getValue();
    }

    @Nullable
    public final FindDeviceViewModel getFindDeviceViewModel() {
        return (FindDeviceViewModel) this.findDeviceViewModel.getValue();
    }

    @NotNull
    public final SettingViewModelProvider getViewModelProvider() {
        return (SettingViewModelProvider) this.viewModelProvider.getValue();
    }

    @Nullable
    public final <R extends ViewModel> R loadViewModel(@NotNull Class<R> clazz) {
        try {
            return (R) getViewModelProvider().get(clazz);
        } catch (Exception e) {
            HMLog.e(f, "error", e);
            return null;
        }
    }

    public final void setOnce(@NotNull Object target, @NotNull Function0<Unit> fn) {
        if (this.onceCache.contains(target)) {
            return;
        }
        this.onceCache.add(target);
        fn.invoke();
    }
}
