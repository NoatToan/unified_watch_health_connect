package com.xiaomi.hm.health.weather;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelLazy;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.account.api.HMAccountWebAPI;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.devicex.R;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.single.DevicePreLaunchRepository;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.huami.koinstartup.KoinComponentAdapter;
import com.huami.lib.rainbow.ListTile;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.utils.easypermission.EasyPermissions;
import com.huami.view.basetitle.BaseTitleActivity;
import com.tbruyelle.rxpermissions2.Permission;
import com.tbruyelle.rxpermissions2.RxPermissions;
import com.xiaomi.hm.health.device.HMSelectCityActivity;
import com.xiaomi.hm.health.device.model.IZeppOSWeatherHandler;
import com.xiaomi.hm.health.device.model.WeatherSetting;
import com.xiaomi.hm.health.locweather.LocWeatherManager;
import com.xiaomi.hm.health.locweather.model.CityInfo;
import com.xiaomi.hm.health.locweather.model.WeatherInfos;
import com.xiaomi.hm.health.model.account.HMMiliConfig;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import com.xiaomi.hm.health.ui.UnifyTitleBarStyle;
import com.xiaomi.hm.health.weather.HuamiOSWeatherActivity;
import com.xiaomi.hm.health.weather.adapter.WeatherAdapter;
import com.xiaomi.hm.health.weather.events.CityListEventListener;
import com.xiaomi.hm.health.weather.events.WeatherFragmentCallback;
import com.xiaomi.hm.health.weather.fragment.SearchCityFragment;
import com.xiaomi.hm.health.weather.model.WeatherSettingVo;
import com.xiaomi.hm.health.weather.model.WeatherVo;
import com.xiaomi.hm.health.weather.other.WeatherItemType;
import com.xiaomi.hm.health.weather.other.ZeppOSWeatherHandlerKt;
import com.xiaomi.hm.health.weather.viewmodel.WeatherViewModel;
import com.zhouyou.recyclerview.swipemenu.SwipeMenuRecyclerView;
import de.greenrobot.event.EventBus;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
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

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 W2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001WB\u0007¢\u0006\u0004\bU\u0010VJ\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\f\u001a\u00020\nH\u0002J\u0012\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0010\u001a\u00020\nH\u0002J\b\u0010\u0011\u001a\u00020\nH\u0002J\u0019\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\nH\u0002J\u0010\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0012H\u0002J\b\u0010\u0019\u001a\u00020\nH\u0002J\b\u0010\u001a\u001a\u00020\nH\u0002J\b\u0010\u001b\u001a\u00020\nH\u0003J\u0012\u0010\u001e\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0014J\b\u0010\u001f\u001a\u00020\nH\u0014J\b\u0010 \u001a\u00020\nH\u0014J\b\u0010!\u001a\u00020\nH\u0016J\u0010\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"H\u0016J\u0010\u0010%\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010&\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010*\u001a\u00020\n2\u000e\u0010)\u001a\n\u0012\u0006\b\u0001\u0012\u00020(0'H\u0016J\u0018\u0010+\u001a\u00020\n2\u000e\u0010)\u001a\n\u0012\u0006\b\u0001\u0012\u00020(0'H\u0016J\b\u0010,\u001a\u00020\nH\u0016J\b\u0010-\u001a\u00020\nH\u0016J\u000e\u00100\u001a\u00020\n2\u0006\u0010/\u001a\u00020.R\u001e\u00105\u001a\n 2*\u0004\u0018\u000101018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001e\u00109\u001a\n 2*\u0004\u0018\u000106068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010<\u001a\u00020:8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010;R\u001d\u0010A\u001a\u00020=8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b>\u0010@R\u001d\u0010E\u001a\u00020B8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010?\u001a\u0004\bC\u0010DR\u001d\u0010I\u001a\u00020F8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010?\u001a\u0004\bG\u0010HR\u0016\u0010L\u001a\u00020J8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010KR\u0018\u0010P\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010T\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010S¨\u0006X"}, d2 = {"Lcom/xiaomi/hm/health/weather/HuamiOSWeatherActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Lcom/xiaomi/hm/health/weather/events/CityListEventListener;", "Lcom/xiaomi/hm/health/weather/events/WeatherFragmentCallback;", "Lcom/huami/koinstartup/KoinComponentAdapter;", "Lcom/xiaomi/hm/health/weather/model/WeatherVo;", "weatherVo", "", "z", "visible", "", "O", "U", "", "str", "Q", "initView", "G", "", "tempUnit", "P", "(Ljava/lang/Integer;)V", ExifInterface.LATITUDE_SOUTH, "unit", "V", LogUtil.D, "w", "L", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onResume", "onDestroy", "onLeftClicked", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "onSearchClick", "onDelete", "onDefaultCityChange", "Ljava/lang/Class;", "Landroidx/fragment/app/Fragment;", "clazz", "onEnter", com.alipay.sdk.m.x.d.n, "startLoading", "stopLoading", "Lcom/xiaomi/hm/health/locweather/model/WeatherInfos;", "weatherInfo", "onEventMainThread", "Lcom/xiaomi/hm/health/model/account/HMPersonInfo;", "kotlin.jvm.PlatformType", "x", "Lcom/xiaomi/hm/health/model/account/HMPersonInfo;", "personInfo", "Lcom/xiaomi/hm/health/model/account/HMMiliConfig;", "y", "Lcom/xiaomi/hm/health/model/account/HMMiliConfig;", "miliConfig", "Lcom/xiaomi/hm/health/device/model/WeatherSetting;", "Lcom/xiaomi/hm/health/device/model/WeatherSetting;", HMAccountWebAPI.MILI_CONFIG_EXTRA_WEATHER, "Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lkotlin/Lazy;", "()Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "deviceUtils", "Lcom/xiaomi/hm/health/weather/viewmodel/WeatherViewModel;", "B", "()Lcom/xiaomi/hm/health/weather/viewmodel/WeatherViewModel;", "viewModel", "Lcom/xiaomi/hm/health/device/model/IZeppOSWeatherHandler;", "C", "()Lcom/xiaomi/hm/health/device/model/IZeppOSWeatherHandler;", "weatherHandler", "Lcom/xiaomi/hm/health/weather/adapter/WeatherAdapter;", "Lcom/xiaomi/hm/health/weather/adapter/WeatherAdapter;", "adapter", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "E", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "loadingDlg", "Lcom/xiaomi/hm/health/ui/BTStatusFragment;", "F", "Lcom/xiaomi/hm/health/ui/BTStatusFragment;", "btStatusFragment", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
@SuppressLint({"NotifyDataSetChanged"})
public final class HuamiOSWeatherActivity extends BaseTitleActivity implements CityListEventListener, WeatherFragmentCallback, KoinComponentAdapter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String G = "HuamiOSWeatherActivity";
    private static final int H = 5;
    private static final int I = 3;
    private static final int J = 2;

    @NotNull
    private static final String K = "first_enter";
    private static final int L = 0;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceUtils;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    private final Lazy weatherHandler;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private WeatherAdapter adapter;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog loadingDlg;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @Nullable
    private BTStatusFragment btStatusFragment;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final HMPersonInfo personInfo;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final HMMiliConfig miliConfig;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private final WeatherSetting weatherSetting;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u001f\u0010\b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u0016\u0010\u0012\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u0016\u0010\u0013\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/weather/HuamiOSWeatherActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", WebConstant.QueryParam.LAUNCH, ExifInterface.GPS_DIRECTION_TRUE, "", "secondOrNull", "(Ljava/util/List;)Ljava/lang/Object;", "", "CITY_MAX", LogUtil.I, "INDEX_TEMP_UNIT_C", "", "KEY_FIRST_ENTER", "Ljava/lang/String;", "KOREA_DIFF", "NORMAL_DIFF", "TAG", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void launch(@NotNull Context context) {
            context.startActivity(new Intent(context, (Class<?>) HuamiOSWeatherActivity.class));
        }

        @Nullable
        public final <T> T secondOrNull(@NotNull List<? extends T> list) {
            if (list.size() < 2) {
                return null;
            }
            return list.get(1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ WeatherVo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(WeatherVo weatherVo) {
            super(0);
            this.a = weatherVo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "onDefaultCityChange: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ WeatherVo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(WeatherVo weatherVo) {
            super(0);
            this.a = weatherVo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "onDelete: " + this.a;
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
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "doubleClick";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            WeatherAdapter weatherAdapter = HuamiOSWeatherActivity.this.adapter;
            Objects.requireNonNull(weatherAdapter);
            return "cityList: " + weatherAdapter.getData();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ Permission a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Permission permission) {
            super(0);
            this.a = permission;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "requestPermission: " + this.a.granted;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "requestPermission error: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"Landroid/content/DialogInterface;", "<anonymous parameter 0>", "", "position", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function2<DialogInterface, Integer, Unit> {
        public g() {
            super(2);
        }

        public final void a(@Nullable DialogInterface dialogInterface, int i) {
            if (HuamiOSWeatherActivity.this.weatherSetting.getTemperatureUnit() == i) {
                return;
            }
            HuamiOSWeatherActivity.this.P(Integer.valueOf(i));
            HuamiOSWeatherActivity.this.B().setTempUnit(i);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(DialogInterface dialogInterface, Integer num) {
            a(dialogInterface, num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HuamiOSWeatherActivity() {
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        this.personInfo = hMPersonInfo;
        HMMiliConfig miliConfig = hMPersonInfo.getMiliConfig();
        this.miliConfig = miliConfig;
        this.weatherSetting = WeatherSetting.fromJsonString(miliConfig.getWeatherSetting());
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceUtils = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceUtilsApi>() { // from class: com.xiaomi.hm.health.weather.HuamiOSWeatherActivity$special$$inlined$inject$default$1
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
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceUtilsApi.class), qualifier, objArr);
            }
        });
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(WeatherViewModel.class), new Function0<ViewModelStore>() { // from class: com.xiaomi.hm.health.weather.HuamiOSWeatherActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ViewModelStore getA() {
                return this.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.xiaomi.hm.health.weather.HuamiOSWeatherActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ViewModelProvider.Factory getA() {
                return this.getDefaultViewModelProviderFactory();
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.weatherHandler = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<IZeppOSWeatherHandler>() { // from class: com.xiaomi.hm.health.weather.HuamiOSWeatherActivity$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.model.IZeppOSWeatherHandler, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final IZeppOSWeatherHandler getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(IZeppOSWeatherHandler.class), objArr2, objArr3);
            }
        });
    }

    private final DeviceUtilsApi A() {
        return (DeviceUtilsApi) this.deviceUtils.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WeatherViewModel B() {
        return (WeatherViewModel) this.viewModel.getValue();
    }

    private final IZeppOSWeatherHandler C() {
        return (IZeppOSWeatherHandler) this.weatherHandler.getValue();
    }

    private final void D() {
        if (this.btStatusFragment == null) {
            BTStatusFragment bTStatusFragmentNewInstance = BTStatusFragment.newInstance(R.id.bt_status_fragment_container, getSupportFragmentManager());
            this.btStatusFragment = bTStatusFragmentNewInstance;
            if (bTStatusFragmentNewInstance == null) {
                return;
            }
            bTStatusFragmentNewInstance.setBLEStatusListener(new BLEStatueListenerAdapter() { // from class: com.xiaomi.hm.health.weather.HuamiOSWeatherActivity$initBTStatusFragment$1
                @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
                public void onEnableChange(boolean enable) {
                    HuamiOSWeatherActivity huamiOSWeatherActivity = this.a;
                    int i = R.id.mask_view;
                    if (huamiOSWeatherActivity.findViewById(i) != null) {
                        this.a.findViewById(i).setVisibility(enable ? 8 : 0);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(HuamiOSWeatherActivity huamiOSWeatherActivity, View view) {
        huamiOSWeatherActivity.S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(HuamiOSWeatherActivity huamiOSWeatherActivity, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            huamiOSWeatherActivity.weatherSetting.setAlertEnable(z);
            huamiOSWeatherActivity.miliConfig.setWeatherSetting(huamiOSWeatherActivity.weatherSetting.toJsonString());
            huamiOSWeatherActivity.personInfo.saveInfo(2);
            huamiOSWeatherActivity.B().setAlert(z);
        }
    }

    private final void G() {
        B().getLoadingLiveData().observe(this, new Observer() { // from class: wb4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HuamiOSWeatherActivity.H(this.a, (Boolean) obj);
            }
        });
        B().getWeatherSettingLiveData().observe(this, new Observer() { // from class: vb4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HuamiOSWeatherActivity.I(this.a, (WeatherSettingVo) obj);
            }
        });
        B().getCityListLiveData().observe(this, new Observer() { // from class: yb4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HuamiOSWeatherActivity.J(this.a, (List) obj);
            }
        });
        B().getDeleteCityResultLiveData().observe(this, new Observer() { // from class: xb4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HuamiOSWeatherActivity.K(this.a, (Boolean) obj);
            }
        });
        B().getModifyDefaultCityLiveData().observe(this, new Observer() { // from class: com.xiaomi.hm.health.weather.HuamiOSWeatherActivity$observe$$inlined$observe$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                if (((Boolean) t).booleanValue()) {
                    Toast.makeText(this.a, R.string.change_default_location_tips, 0).show();
                } else {
                    HuamiOSWeatherActivity huamiOSWeatherActivity = this.a;
                    huamiOSWeatherActivity.Q(huamiOSWeatherActivity.getString(R.string.long_sit_set_failed));
                }
            }
        });
        B().getAlertVisibleLiveData().observe(this, new Observer() { // from class: com.xiaomi.hm.health.weather.HuamiOSWeatherActivity$observe$$inlined$observe$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                ((ListTile) this.a.findViewById(R.id.alert_iv)).setVisibility(((Boolean) t).booleanValue() ? 0 : 8);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(HuamiOSWeatherActivity huamiOSWeatherActivity, Boolean bool) {
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            huamiOSWeatherActivity.startLoading();
        } else {
            huamiOSWeatherActivity.stopLoading();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(HuamiOSWeatherActivity huamiOSWeatherActivity, WeatherSettingVo weatherSettingVo) {
        Integer weatherTempUnit;
        if (weatherSettingVo != null) {
            ListTile listTile = (ListTile) huamiOSWeatherActivity.findViewById(R.id.alert_iv);
            Boolean weatherAlarmSwitch = weatherSettingVo.getWeatherAlarmSwitch();
            listTile.setChecked(weatherAlarmSwitch == null ? false : weatherAlarmSwitch.booleanValue());
        }
        if (weatherSettingVo == null || (weatherTempUnit = weatherSettingVo.getWeatherTempUnit()) == null) {
            return;
        }
        huamiOSWeatherActivity.P(Integer.valueOf(weatherTempUnit.intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(HuamiOSWeatherActivity huamiOSWeatherActivity, List list) {
        huamiOSWeatherActivity.stopLoading();
        ((CardView) huamiOSWeatherActivity.findViewById(R.id.card_view)).setVisibility(0);
        ((TextView) huamiOSWeatherActivity.findViewById(R.id.weather_tips_tv)).setVisibility(0);
        WeatherAdapter weatherAdapter = huamiOSWeatherActivity.adapter;
        Objects.requireNonNull(weatherAdapter);
        weatherAdapter.setData(list);
        WeatherAdapter weatherAdapter2 = huamiOSWeatherActivity.adapter;
        Objects.requireNonNull(weatherAdapter2);
        weatherAdapter2.setSupportDefaultCity(huamiOSWeatherActivity.B().supportDefaultCity());
        WeatherAdapter weatherAdapter3 = huamiOSWeatherActivity.adapter;
        Objects.requireNonNull(weatherAdapter3);
        weatherAdapter3.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(HuamiOSWeatherActivity huamiOSWeatherActivity, Boolean bool) {
        if (bool.booleanValue()) {
            huamiOSWeatherActivity.U();
        } else {
            R(huamiOSWeatherActivity, null, 1, null);
        }
    }

    @SuppressLint({"CheckResult"})
    private final void L() {
        new RxPermissions(this).requestEach("android.permission.ACCESS_COARSE_LOCATION").subscribe(new Consumer() { // from class: zb4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                HuamiOSWeatherActivity.M(this.a, (Permission) obj);
            }
        }, new Consumer() { // from class: qb4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                HuamiOSWeatherActivity.N((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(HuamiOSWeatherActivity huamiOSWeatherActivity, Permission permission) {
        HMLog.info(G, new e(permission));
        if (permission.granted) {
            ExtKt.setVisible$default((ConstraintLayout) huamiOSWeatherActivity.findViewById(R.id.no_permission_layout), false, false, 2, null);
            LocWeatherManager.getInstance().requestLocation();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(Throwable th) {
        HMLog.error$default(G, null, null, new f(th), 6, null);
    }

    private final void O(boolean visible) {
        ExtKt.setVisible$default((NestedScrollView) findViewById(R.id.scroll_view), visible, false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(Integer tempUnit) {
        if (tempUnit != null) {
            tempUnit.intValue();
            this.weatherSetting.setTemperatureUnit(tempUnit.intValue());
            this.miliConfig.setWeatherSetting(this.weatherSetting.toJsonString());
            this.personInfo.saveInfo(2);
        }
        V(this.weatherSetting.getTemperatureUnit());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(String str) {
        LoadingDialog loadingDialog;
        LoadingDialog loadingDialog2 = this.loadingDlg;
        boolean z = false;
        if (loadingDialog2 != null && loadingDialog2.isShowing()) {
            z = true;
        }
        if (!z || (loadingDialog = this.loadingDlg) == null) {
            return;
        }
        loadingDialog.setFailed(str);
    }

    public static /* synthetic */ void R(HuamiOSWeatherActivity huamiOSWeatherActivity, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = huamiOSWeatherActivity.getString(R.string.delete_failed);
        }
        huamiOSWeatherActivity.Q(str);
    }

    private final void S() {
        final g gVar = new g();
        new AlertDialogFragment.Builder(this).setTitle(R.string.setting_weather_temp).setNeutralButton(R.string.cancel, (DialogInterface.OnClickListener) null).setSingleChoiceItems(new AlertDialogFragment.ChoiceItems().setItems(R.array.setting_weather_temp_unit_array).setItemChoice(this.weatherSetting.getTemperatureUnit()), new DialogInterface.OnClickListener() { // from class: rb4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                HuamiOSWeatherActivity.T(gVar, dialogInterface, i);
            }
        }).setCancelable(true).show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(Function2 function2, DialogInterface dialogInterface, int i) {
        function2.invoke(dialogInterface, Integer.valueOf(i));
    }

    private final void U() {
        LoadingDialog loadingDialog;
        LoadingDialog loadingDialog2 = this.loadingDlg;
        boolean z = false;
        if (loadingDialog2 != null && loadingDialog2.isShowing()) {
            z = true;
        }
        if (!z || (loadingDialog = this.loadingDlg) == null) {
            return;
        }
        loadingDialog.setSuccess(getString(R.string.delete_success));
    }

    private final void V(int unit) {
        ((ListTile) findViewById(R.id.temp_unit_iv)).setSubtitle(unit == 0 ? R.string.setting_weather_temp_c : R.string.setting_weather_temp_f);
    }

    private final void initView() {
        WeatherAdapter weatherAdapter = new WeatherAdapter(this, B(), new ArrayList(), this, false, 16, null);
        int i = R.id.city_rc;
        ((SwipeMenuRecyclerView) findViewById(i)).setAdapter(weatherAdapter);
        Unit unit = Unit.INSTANCE;
        this.adapter = weatherAdapter;
        ((SwipeMenuRecyclerView) findViewById(i)).setLayoutManager(new LinearLayoutManager(this));
        ((SwipeMenuRecyclerView) findViewById(i)).setPullRefreshEnabled(false);
        ((SwipeMenuRecyclerView) findViewById(i)).setLoadingMoreEnabled(false);
        ((SwipeMenuRecyclerView) findViewById(i)).setNestedScrollingEnabled(false);
        ((ListTile) findViewById(R.id.temp_unit_iv)).setOnClickListener(new View.OnClickListener() { // from class: tb4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HuamiOSWeatherActivity.E(this.a, view);
            }
        });
        ((ListTile) findViewById(R.id.alert_iv)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ub4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                HuamiOSWeatherActivity.F(this.a, compoundButton, z);
            }
        });
    }

    @JvmStatic
    public static final void launch(@NotNull Context context) {
        INSTANCE.launch(context);
    }

    private final void w() {
        if (!C().supportLocation() || EasyPermissions.hasPermissions(this, "android.permission.ACCESS_COARSE_LOCATION")) {
            return;
        }
        DevicePreLaunchRepository devicePreLaunchRepository = DevicePreLaunchRepository.INSTANCE;
        if (devicePreLaunchRepository.getDeviceXKVStore().getBoolean(K, true)) {
            new AlertDialogFragment.Builder(this).setTitle(R.string.running_no_locate_permission_title).setMessage(R.string.locate_content).setPositiveButton(R.string.open, new DialogInterface.OnClickListener() { // from class: pb4
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    HuamiOSWeatherActivity.x(this.a, dialogInterface, i);
                }
            }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).show(getSupportFragmentManager());
        } else {
            int i = R.id.no_permission_layout;
            ExtKt.setVisible$default((ConstraintLayout) findViewById(i), true, false, 2, null);
            ((ConstraintLayout) findViewById(i)).setOnClickListener(new View.OnClickListener() { // from class: sb4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HuamiOSWeatherActivity.y(this.a, view);
                }
            });
        }
        devicePreLaunchRepository.getDeviceXKVStore().putBoolean(K, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(HuamiOSWeatherActivity huamiOSWeatherActivity, DialogInterface dialogInterface, int i) {
        huamiOSWeatherActivity.L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(HuamiOSWeatherActivity huamiOSWeatherActivity, View view) {
        huamiOSWeatherActivity.L();
    }

    private final boolean z(WeatherVo weatherVo) {
        Integer numValueOf;
        if (weatherVo.getType() == WeatherItemType.LOCATED_CITY) {
            numValueOf = Integer.valueOf(R.string.cannot_delete_current_location);
        } else {
            numValueOf = weatherVo.getDefaultCity() ? Integer.valueOf(R.string.cannot_delete_default_location) : null;
        }
        if (numValueOf == null) {
            return false;
        }
        Toast.makeText(this, numValueOf.intValue(), 0).show();
        return true;
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponentAdapter.DefaultImpls.getKoin(this);
    }

    @Override // com.xiaomi.hm.health.weather.events.WeatherFragmentCallback
    public void onBack(@NotNull Class<? extends Fragment> clazz) {
        if (Intrinsics.areEqual(clazz, SearchCityFragment.class)) {
            setTitleText(R.string.weather);
            O(true);
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huamios_weather);
        UnifyTitleBarStyle.setUnifyTitleStyle$default(this, getString(R.string.weather), null, 2, null);
        EventBus.getDefault().register(this);
        initView();
        D();
        G();
    }

    @Override // com.xiaomi.hm.health.weather.events.CityListEventListener
    public void onDefaultCityChange(@NotNull WeatherVo weatherVo) {
        HMLog.info(G, new a(weatherVo));
        B().setDefaultCity(weatherVo);
    }

    @Override // com.xiaomi.hm.health.weather.events.CityListEventListener
    public void onDelete(@NotNull WeatherVo weatherVo) {
        HMLog.info(G, new b(weatherVo));
        if (z(weatherVo)) {
            return;
        }
        B().deleteCity(weatherVo);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    @Override // com.xiaomi.hm.health.weather.events.WeatherFragmentCallback
    public void onEnter(@NotNull Class<? extends Fragment> clazz) {
        if (Intrinsics.areEqual(clazz, SearchCityFragment.class)) {
            setTitleText(R.string.huamios_weather_add_city);
        }
    }

    public final void onEventMainThread(@NotNull WeatherInfos weatherInfo) {
        WeatherViewModel weatherViewModelB = B();
        CityInfo cityInfo = weatherInfo.getCityInfo();
        weatherViewModelB.updateCity(cityInfo == null ? null : ZeppOSWeatherHandlerKt.toBleModel(cityInfo));
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity
    public void onLeftClicked() {
        if (getSupportFragmentManager().getBackStackEntryCount() <= 0) {
            super.onLeftClicked();
        } else {
            HMSelectCityActivity.closeKeyboard(this);
            getSupportFragmentManager().popBackStack();
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        w();
    }

    @Override // com.xiaomi.hm.health.weather.events.CityListEventListener
    public void onSearchClick(@NotNull View view) {
        int size;
        if (A().isFastDoubleClick(view)) {
            HMLog.info(G, c.a);
            return;
        }
        if (C().supportLocation()) {
            WeatherAdapter weatherAdapter = this.adapter;
            Objects.requireNonNull(weatherAdapter);
            size = weatherAdapter.getData().size() - 3;
        } else {
            WeatherAdapter weatherAdapter2 = this.adapter;
            Objects.requireNonNull(weatherAdapter2);
            size = weatherAdapter2.getData().size() - 2;
        }
        HMLog.info(G, new d());
        if (size >= 5) {
            Toast.makeText(this, getString(R.string.weather_city_max), 0).show();
        } else {
            O(false);
            getSupportFragmentManager().beginTransaction().addToBackStack("SearchCity").add(R.id.search_fragment_container, new SearchCityFragment()).commitAllowingStateLoss();
        }
    }

    @Override // com.xiaomi.hm.health.weather.events.WeatherFragmentCallback
    public void startLoading() {
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(this, getString(R.string.loading));
        this.loadingDlg = loadingDialogShowDialog;
        if (loadingDialogShowDialog != null) {
            loadingDialogShowDialog.setCancelable(false);
        }
        LoadingDialog loadingDialog = this.loadingDlg;
        if (loadingDialog == null) {
            return;
        }
        loadingDialog.show();
    }

    @Override // com.xiaomi.hm.health.weather.events.WeatherFragmentCallback
    public void stopLoading() {
        LoadingDialog loadingDialog = this.loadingDlg;
        if (loadingDialog == null) {
            return;
        }
        loadingDialog.dismiss();
    }
}
