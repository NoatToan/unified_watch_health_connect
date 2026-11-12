package com.xiaomi.hm.health.device.amazfit_watch;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.ui.bind.PhoneBindActivity;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.tools.log.HMLog;
import com.tbruyelle.rxpermissions2.RxPermissions;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.amazfit_watch.BindWatchUtils;
import io.reactivex.functions.Consumer;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.context.GlobalContext;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/device/amazfit_watch/BindWatchUtils;", "", "<init>", "()V", "Companion", "IUserAction", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class BindWatchUtils {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<DeviceUtilsApi> a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0003J\u0010\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tJ\u0017\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/device/amazfit_watch/BindWatchUtils$Companion;", "", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "Lcom/xiaomi/hm/health/device/amazfit_watch/BindWatchUtils$IUserAction;", "userAction", "", "g", GoogleApiAvailabilityLight.a, "", PhoneBindActivity.EXTRA_BIND_TYPE, "", "getWatchName", "getWatchIcon", "(I)Ljava/lang/Integer;", "requestForNeededPermission", "Lkotlin/Lazy;", "Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "deviceUtilsApiLazy", "Lkotlin/Lazy;", "getDeviceUtilsApiLazy", "()Lkotlin/Lazy;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "";
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @SuppressLint({"CheckResult"})
        private final void d(AppCompatActivity activity, final IUserAction userAction) {
            new RxPermissions(activity).request("android.permission.CAMERA", "android.permission.ACCESS_FINE_LOCATION").subscribe(new Consumer() { // from class: iy
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    BindWatchUtils.Companion.e(userAction, (Boolean) obj);
                }
            }, new Consumer() { // from class: jy
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    BindWatchUtils.Companion.f((Throwable) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(IUserAction iUserAction, Boolean bool) {
            if (bool.booleanValue()) {
                iUserAction.onUserAllow(true);
            } else {
                iUserAction.onUserAllow(false);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(Throwable th) {
            HMLog.warn$default(null, th, a.a, 1, null);
        }

        private final void g(final AppCompatActivity activity, final IUserAction userAction) {
            new AlertDialogFragment.Builder(activity).setTitle("").setMessage(R.string.open_loaction_cam_per_msg).setNeutralButton(R.string.running_tip_known, new DialogInterface.OnClickListener() { // from class: hy
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    BindWatchUtils.Companion.h(activity, userAction, dialogInterface, i);
                }
            }).show(activity.getSupportFragmentManager());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void h(AppCompatActivity appCompatActivity, IUserAction iUserAction, DialogInterface dialogInterface, int i) {
            BindWatchUtils.INSTANCE.d(appCompatActivity, iUserAction);
        }

        @NotNull
        public final Lazy<DeviceUtilsApi> getDeviceUtilsApiLazy() {
            return BindWatchUtils.a;
        }

        @Nullable
        public final Integer getWatchIcon(int bindType) {
            if (bindType == 7) {
                return Integer.valueOf(R.drawable.img_dth);
            }
            if (bindType == 8) {
                return Integer.valueOf(R.drawable.img_pyh);
            }
            if (bindType != 10) {
                return null;
            }
            return Integer.valueOf(R.drawable.img_bind_amazfit_bip);
        }

        @Nullable
        public final String getWatchName(int bindType) {
            ResourceProvider resourceProvider = new ResourceProvider(DeviceXFunctionsKt.getContext());
            if (bindType == 7) {
                if (Language.isTraditionalChinese()) {
                    return resourceProvider.getString(R.string.mili_settting_mili_dth_line_feed_traditional_chinese);
                }
                return Language.isSimplifiedChinese() ? resourceProvider.getString(R.string.mili_settting_mili_dth_line_feed_simple_chinese) : resourceProvider.getString(R.string.mili_settting_mili_dth);
            }
            if (bindType != 8) {
                if (bindType != 10) {
                    return null;
                }
                return resourceProvider.getString(R.string.mili_chaohu_series);
            }
            if (Language.isFrench()) {
                return getDeviceUtilsApiLazy().getValue().getDeviceDescription(HMDeviceSource.MILI_PYH_W);
            }
            if (Language.isSimplifiedChinese()) {
                return resourceProvider.getString(R.string.mili_pyh_feed_simple_chinese);
            }
            return Language.isTraditionalChinese() ? resourceProvider.getString(R.string.mili_pyh_feed_traditional_chinese) : getDeviceUtilsApiLazy().getValue().getDeviceDescription(HMDeviceSource.MILI_PYH);
        }

        public final void requestForNeededPermission(@NotNull AppCompatActivity activity, @NotNull IUserAction userAction) {
            if (DeviceXFunctionsKt.getAppStateApi().checkPermission(activity, "android.permission.ACCESS_FINE_LOCATION") && DeviceXFunctionsKt.getAppStateApi().checkPermission(activity, "android.permission.CAMERA")) {
                userAction.onUserAllow(true);
            } else {
                g(activity, userAction);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/device/amazfit_watch/BindWatchUtils$IUserAction;", "", "", "allow", "", "onUserAllow", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public interface IUserAction {
        void onUserAllow(boolean allow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Koin koin = GlobalContext.INSTANCE.get();
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Scope rootScope = koin.getScopeRegistry().getRootScope();
        final Object[] objArr = 0 == true ? 1 : 0;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        a = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceUtilsApi>() { // from class: com.xiaomi.hm.health.device.amazfit_watch.BindWatchUtils$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.huami.devicex.injection.basic.DeviceUtilsApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceUtilsApi getA() {
                return rootScope.get(Reflection.getOrCreateKotlinClass(DeviceUtilsApi.class), objArr, objArr2);
            }
        });
    }
}
