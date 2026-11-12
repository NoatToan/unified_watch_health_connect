package com.xiaomi.hm.health.di.koin.module;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.huami.account.HMLoginManager;
import com.huami.devicex.funapi.ManagerFunctionsKt;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.feedback.api.FeedbackParams;
import com.huami.feedback.api.FeedbackService;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.nfc.bus.api.ISnowballWebApi;
import com.huami.nfc.bus.api.IXiaomiWebApi;
import com.huami.nfc.web.NfcDeviceKt;
import com.huami.wallet.datasource.cloud.CloudDataSource;
import com.huami.wallet.datasource.cloud.OnWalletHttpError;
import com.huami.wallet.lib.api.WalletDataSource;
import com.huami.wallet.lib.entity.WalletConfig;
import com.huami.wallet.ui.api.NfcNotificationApi;
import com.huami.wallet.ui.di.module.KoinModuleKt;
import com.huami.wallet.ui.pref.AndroidWalletPreference;
import com.huami.wallet.ui.pref.WalletPreference;
import com.huami.wallet.ui.resource.IWalletRes;
import com.huami.watch.companion.sync.ble.SyncNfcTradeHelper;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.devicelib.UserData;
import com.xiaomi.hm.health.discovery.WebHelper;
import com.xiaomi.hm.health.eventbus.EventHttpError;
import com.xiaomi.hm.health.locweather.LocWeatherKeeper;
import com.xiaomi.hm.health.locweather.location.MyLocation;
import com.xiaomi.hm.health.nfc.NfcConfigKt;
import com.xiaomi.hm.health.nfc.bus.INFCOpenServiceWebAPI;
import com.xiaomi.hm.health.nfc.bus.SnowballNFCOpenServiceWebAPI;
import com.xiaomi.hm.health.nfc.bus.XiaoMiNFCOpenServiceWebAPI;
import com.xiaomi.hm.health.utils.Utils;
import de.greenrobot.event.EventBus;
import io.reactivex.Flowable;
import java.util.Objects;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.instance.ScopedInstanceFactory;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleKt;
import org.koin.dsl.ScopeDSL;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0006\u0010\u0002\u001a\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0000\u001a\n\u0010\b\u001a\u00020\u0007*\u00020\u0000\u001a\n\u0010\n\u001a\u00020\t*\u00020\u0000\u001a\n\u0010\f\u001a\u00020\u000b*\u00020\u0000\u001a\u0006\u0010\u000e\u001a\u00020\r\u001a\u0006\u0010\u000f\u001a\u00020\r\"\u0016\u0010\u0010\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\"\u0016\u0010\u0012\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011\"\u0019\u0010\u0018\u001a\u00020\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0019\u0010\u001b\u001a\u00020\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017¨\u0006\u001c"}, d2 = {"Lorg/koin/core/scope/Scope;", "walletUserScope", "walletDeviceScope", "Lcom/xiaomi/hm/health/devicelib/UserData;", "user", "", SDKConstants.PARAM_USER_ID, "Lcom/xiaomi/hm/health/databases/model/Device;", "device", "Lcom/huami/wallet/lib/api/WalletDataSource;", ParamKey.dataSource, "Lcom/xiaomi/hm/health/nfc/bus/INFCOpenServiceWebAPI;", "nfcOpenServiceWebAPI", "", "walletUserScopeDestroy", "walletDeviceScopeDestroy", WalletModuleKt.WALLET_SCOPE_DEVICE_DATASOURCE, "Ljava/lang/String;", WalletModuleKt.WALLET_SCOPE_DEVICE_WEBAPI, "Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getWalletAppModule", "()Lorg/koin/core/module/Module;", "walletAppModule", "b", "getWalletUserDeviceModule", "walletUserDeviceModule", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class WalletModuleKt {

    @NotNull
    public static final String WALLET_SCOPE_DEVICE_DATASOURCE = "WALLET_SCOPE_DEVICE_DATASOURCE";

    @NotNull
    public static final String WALLET_SCOPE_DEVICE_WEBAPI = "WALLET_SCOPE_DEVICE_WEBAPI";

    @NotNull
    private static final Module a = ModuleKt.module$default(false, a.a, 1, null);

    @NotNull
    private static final Module b = ModuleKt.module$default(false, b.a, 1, null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Module, Unit> {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.WalletModuleKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/dsl/ScopeDSL;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0939a extends Lambda implements Function1<ScopeDSL, Unit> {
            public static final C0939a a = new C0939a();

            /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.WalletModuleKt$a$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/wallet/lib/api/WalletDataSource;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0940a extends Lambda implements Function2<Scope, ParametersHolder, WalletDataSource> {
                public static final C0940a a = new C0940a();

                /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.WalletModuleKt$a$a$a$a, reason: collision with other inner class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class C0941a extends Lambda implements Function0<String> {
                    public static final C0941a a = new C0941a();

                    public C0941a() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        MyLocation.Address address;
                        String cityCode;
                        MyLocation lastLocation = LocWeatherKeeper.getLastLocation();
                        return (lastLocation == null || (address = lastLocation.getAddress()) == null || (cityCode = address.getCityCode()) == null) ? "010" : cityCode;
                    }
                }

                /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.WalletModuleKt$a$a$a$b */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class b extends Lambda implements Function0<Integer> {
                    public static final b a = new b();

                    public b() {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final int invoke2() {
                        return R.string.nfc_notification_channel_name;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public /* bridge */ /* synthetic */ Integer getA() {
                        return Integer.valueOf(invoke2());
                    }
                }

                /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.WalletModuleKt$a$a$a$c */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class c extends Lambda implements Function0<Integer> {
                    public static final c a = new c();

                    public c() {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final int invoke2() {
                        return R.drawable.mipush_notification;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public /* bridge */ /* synthetic */ Integer getA() {
                        return Integer.valueOf(invoke2());
                    }
                }

                /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.WalletModuleKt$a$a$a$d */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class d extends Lambda implements Function0<Integer> {
                    public static final d a = new d();

                    public d() {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final int invoke2() {
                        return R.drawable.app_icon;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public /* bridge */ /* synthetic */ Integer getA() {
                        return Integer.valueOf(invoke2());
                    }
                }

                /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.WalletModuleKt$a$a$a$e */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class e extends Lambda implements Function0<Integer> {
                    public static final e a = new e();

                    public e() {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final int invoke2() {
                        return R.color.app_notification_icon_color;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public /* bridge */ /* synthetic */ Integer getA() {
                        return Integer.valueOf(invoke2());
                    }
                }

                /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.WalletModuleKt$a$a$a$f */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class f extends Lambda implements Function0<Boolean> {
                    public static final f a = new f();

                    public f() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public /* bridge */ /* synthetic */ Boolean getA() {
                        return Boolean.valueOf(invoke2());
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final boolean invoke2() {
                        return NfcConfigKt.isSupportDnyamicCityDevice(WalletModuleKt.device(WalletModuleKt.walletDeviceScope()));
                    }
                }

                /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.WalletModuleKt$a$a$a$g */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class g extends Lambda implements Function0<Boolean> {
                    public static final g a = new g();

                    public g() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public /* bridge */ /* synthetic */ Boolean getA() {
                        return Boolean.valueOf(invoke2());
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final boolean invoke2() {
                        return GlobalConfig.get().isBuildInner();
                    }
                }

                /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.WalletModuleKt$a$a$a$h */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n"}, d2 = {"", "url", "Landroid/os/Bundle;", "<anonymous parameter 1>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class h extends Lambda implements Function2<String, Bundle, Boolean> {
                    public static final h a = new h();

                    public h() {
                        super(2);
                    }

                    public final boolean a(@NotNull String str, @Nullable Bundle bundle) {
                        WebHelper.launch(str);
                        return true;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Boolean invoke(String str, Bundle bundle) {
                        return Boolean.valueOf(a(str, bundle));
                    }
                }

                /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.WalletModuleKt$a$a$a$i */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\n"}, d2 = {"Landroid/content/Context;", "fromActivity", "", "feedbackInfo", "", "<anonymous parameter 2>", "<anonymous parameter 3>", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class i extends Lambda implements Function4<Context, String, Boolean, Boolean, Boolean> {
                    public final /* synthetic */ Scope a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public i(Scope scope) {
                        super(4);
                        this.a = scope;
                    }

                    public final boolean a(@NotNull Context context, @NotNull String str, boolean z, boolean z2) {
                        ((FeedbackService) this.a.get(Reflection.getOrCreateKotlinClass(FeedbackService.class), null, null)).feedback(null, context, ((AppCompatActivity) context).getSupportFragmentManager(), new FeedbackParams(str, null, null, null, false, 30, null));
                        return true;
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Boolean invoke(Context context, String str, Boolean bool, Boolean bool2) {
                        return Boolean.valueOf(a(context, str, bool.booleanValue(), bool2.booleanValue()));
                    }
                }

                /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.WalletModuleKt$a$a$a$j */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0006\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class j extends Lambda implements Function0<Double> {
                    public static final j a = new j();

                    public j() {
                        super(0);
                    }

                    public final double a() {
                        MyLocation lastLocation = LocWeatherKeeper.getLastLocation();
                        if (lastLocation == null) {
                            return 0.0d;
                        }
                        return lastLocation.getLongitude();
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public /* bridge */ /* synthetic */ Double getA() {
                        return Double.valueOf(a());
                    }
                }

                /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.WalletModuleKt$a$a$a$k */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0006\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class k extends Lambda implements Function0<Double> {
                    public static final k a = new k();

                    public k() {
                        super(0);
                    }

                    public final double a() {
                        MyLocation lastLocation = LocWeatherKeeper.getLastLocation();
                        if (lastLocation == null) {
                            return 0.0d;
                        }
                        return lastLocation.getLatitude();
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public /* bridge */ /* synthetic */ Double getA() {
                        return Double.valueOf(a());
                    }
                }

                /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.WalletModuleKt$a$a$a$l */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class l extends Lambda implements Function0<Boolean> {
                    public static final l a = new l();

                    public l() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public /* bridge */ /* synthetic */ Boolean getA() {
                        return Boolean.valueOf(invoke2());
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final boolean invoke2() {
                        return true;
                    }
                }

                /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.WalletModuleKt$a$a$a$m */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class m extends Lambda implements Function0<Boolean> {
                    public static final m a = new m();

                    public m() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public /* bridge */ /* synthetic */ Boolean getA() {
                        return Boolean.valueOf(invoke2());
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final boolean invoke2() {
                        return true;
                    }
                }

                /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.WalletModuleKt$a$a$a$n */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class n extends Lambda implements Function0<Boolean> {
                    public static final n a = new n();

                    public n() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public /* bridge */ /* synthetic */ Boolean getA() {
                        return Boolean.valueOf(invoke2());
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final boolean invoke2() {
                        return true;
                    }
                }

                /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.WalletModuleKt$a$a$a$o */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class o extends Lambda implements Function0<Boolean> {
                    public static final o a = new o();

                    public o() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public /* bridge */ /* synthetic */ Boolean getA() {
                        return Boolean.valueOf(invoke2());
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final boolean invoke2() {
                        return NfcConfigKt.isSupportBleApi(WalletModuleKt.device(WalletModuleKt.walletDeviceScope()));
                    }
                }

                public C0940a() {
                    super(2);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Boolean f(Scope scope) {
                    return Boolean.valueOf(Utils.isSupportMIUIPay((Context) scope.get(Reflection.getOrCreateKotlinClass(Context.class), null, null)));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void g(String str, String str2) {
                    EventBus.getDefault().post(new EventHttpError(str, str2, 1));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Boolean h() {
                    return Boolean.valueOf(ManagerFunctionsKt.getDeviceManagerApi().isConnected(HMDeviceType.fromValue(WalletModuleKt.device(WalletModuleKt.walletDeviceScope()).getDevice_type().intValue())));
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public final WalletDataSource invoke(@NotNull final Scope scope, @NotNull ParametersHolder parametersHolder) {
                    CloudDataSource.Config config = new CloudDataSource.Config();
                    config.context = (Context) scope.get(Reflection.getOrCreateKotlinClass(Context.class), null, null);
                    config.deviceId = WalletModuleKt.device(WalletModuleKt.walletDeviceScope()).getDevice_id();
                    config.userId = WalletModuleKt.userID(WalletModuleKt.walletUserScope());
                    config.hostUrl = HMServerDef.getHost();
                    config.testPay = !HMServerDef.isProductUrl();
                    config.hostAppPackageName = config.context.getPackageName();
                    config.isSupportMiuiPay = Flowable.fromCallable(new Callable() { // from class: com.xiaomi.hm.health.di.koin.module.b
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return WalletModuleKt.a.C0939a.C0940a.f(scope);
                        }
                    });
                    config.onWalletHttpError = new OnWalletHttpError() { // from class: com.xiaomi.hm.health.di.koin.module.a
                        @Override // com.huami.wallet.datasource.cloud.OnWalletHttpError
                        public final void onHttpError(String str, String str2) {
                            WalletModuleKt.a.C0939a.C0940a.g(str, str2);
                        }
                    };
                    config.longitudeFunction0 = j.a;
                    config.latitudeFunction0 = k.a;
                    config.deviceConnectionChecker = Flowable.fromCallable(new Callable() { // from class: com.xiaomi.hm.health.di.koin.module.c
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return WalletModuleKt.a.C0939a.C0940a.h();
                        }
                    });
                    config.isSupportBannerView = l.a;
                    config.isSupportCardInformation = m.a;
                    config.isSupportMiInVoice = n.a;
                    config.withBleApi = o.a;
                    config.isSupportDynamicCity = f.a;
                    WalletConfig.setShowMessage(g.a);
                    WalletConfig.setOnOpenWebUrl(h.a);
                    WalletConfig.setOnErrorToFeedback(new i(scope));
                    SyncNfcTradeHelper.INSTANCE.setCityCode(C0941a.a);
                    NfcNotificationApi.Companion companion = NfcNotificationApi.INSTANCE;
                    companion.setChannelNameResId(b.a);
                    companion.setSmallIconResId(c.a);
                    companion.setLargeIconResId(d.a);
                    companion.setIconColorResId(e.a);
                    return new CloudDataSource(config);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.WalletModuleKt$a$a$b */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/nfc/bus/INFCOpenServiceWebAPI;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function2<Scope, ParametersHolder, INFCOpenServiceWebAPI> {
                public static final b a = new b();

                public b() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final INFCOpenServiceWebAPI invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return NfcDeviceKt.isXiaomiDevice(NfcConfigKt.deviceModel(WalletModuleKt.device(WalletModuleKt.walletDeviceScope()))) ? new XiaoMiNFCOpenServiceWebAPI((IXiaomiWebApi) scope.get(Reflection.getOrCreateKotlinClass(IXiaomiWebApi.class), null, null)) : new SnowballNFCOpenServiceWebAPI((ISnowballWebApi) scope.get(Reflection.getOrCreateKotlinClass(ISnowballWebApi.class), null, null));
                }
            }

            public C0939a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ScopeDSL scopeDSL) {
                invoke2(scopeDSL);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ScopeDSL scopeDSL) {
                StringQualifier stringQualifierNamed = QualifierKt.named(WalletModuleKt.WALLET_SCOPE_DEVICE_DATASOURCE);
                C0940a c0940a = C0940a.a;
                Kind kind = Kind.Scoped;
                BeanDefinition beanDefinition = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(WalletDataSource.class), stringQualifierNamed, c0940a, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), stringQualifierNamed, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(beanDefinition);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey, scopedInstanceFactory, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory);
                StringQualifier stringQualifierNamed2 = QualifierKt.named(WalletModuleKt.WALLET_SCOPE_DEVICE_WEBAPI);
                b bVar = b.a;
                BeanDefinition beanDefinition2 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(INFCOpenServiceWebAPI.class), stringQualifierNamed2, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), stringQualifierNamed2, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory2 = new ScopedInstanceFactory(beanDefinition2);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey2, scopedInstanceFactory2, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory2);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/wallet/ui/pref/WalletPreference;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function2<Scope, ParametersHolder, WalletPreference> {
            public static final b a = new b();

            public b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final WalletPreference invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new AndroidWalletPreference((Context) scope.get(Reflection.getOrCreateKotlinClass(Context.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function2<Scope, ParametersHolder, String> {
            public static final c a = new c();

            public c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return ((Context) scope.get(Reflection.getOrCreateKotlinClass(Context.class), null, null)).getString(R.string.app_name);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/wallet/lib/api/WalletDataSource;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function2<Scope, ParametersHolder, WalletDataSource> {
            public static final d a = new d();

            public d() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final WalletDataSource invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return WalletModuleKt.dataSource(WalletModuleKt.walletDeviceScope());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/nfc/bus/INFCOpenServiceWebAPI;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function2<Scope, ParametersHolder, INFCOpenServiceWebAPI> {
            public static final e a = new e();

            public e() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final INFCOpenServiceWebAPI invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return WalletModuleKt.nfcOpenServiceWebAPI(WalletModuleKt.walletDeviceScope());
            }
        }

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Module module) {
            invoke2(module);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Module module) {
            module.scope(QualifierKt.named(KoinModuleKt.WALLET_SCOPE_DEVICE), C0939a.a);
            b bVar = b.a;
            Kind kind = Kind.Singleton;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            BeanDefinition beanDefinition = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(WalletPreference.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, singleInstanceFactory, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory);
            }
            new Pair(module, singleInstanceFactory);
            StringQualifier stringQualifierNamed = QualifierKt.named(KoinModuleKt.WALLET_CONFIG_APPNAME);
            c cVar = c.a;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind2 = Kind.Factory;
            BeanDefinition beanDefinition2 = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(String.class), stringQualifierNamed, cVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), stringQualifierNamed, rootScopeQualifier);
            FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, factoryInstanceFactory, false, 4, null);
            new Pair(module, factoryInstanceFactory);
            d dVar = d.a;
            StringQualifier rootScopeQualifier2 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition3 = new BeanDefinition(rootScopeQualifier2, Reflection.getOrCreateKotlinClass(WalletDataSource.class), null, dVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, rootScopeQualifier2);
            FactoryInstanceFactory factoryInstanceFactory2 = new FactoryInstanceFactory(beanDefinition3);
            Module.saveMapping$default(module, strIndexKey3, factoryInstanceFactory2, false, 4, null);
            new Pair(module, factoryInstanceFactory2);
            e eVar = e.a;
            StringQualifier rootScopeQualifier3 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition4 = new BeanDefinition(rootScopeQualifier3, Reflection.getOrCreateKotlinClass(INFCOpenServiceWebAPI.class), null, eVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, rootScopeQualifier3);
            FactoryInstanceFactory factoryInstanceFactory3 = new FactoryInstanceFactory(beanDefinition4);
            Module.saveMapping$default(module, strIndexKey4, factoryInstanceFactory3, false, 4, null);
            new Pair(module, factoryInstanceFactory3);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Module, Unit> {
        public static final b a = new b();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/dsl/ScopeDSL;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<ScopeDSL, Unit> {
            public static final a a = new a();

            /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.WalletModuleKt$b$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0942a extends Lambda implements Function2<Scope, ParametersHolder, String> {
                public static final C0942a a = new C0942a();

                public C0942a() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return String.valueOf(HMLoginManager.getValidUid());
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.WalletModuleKt$b$a$b, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/devicelib/UserData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0943b extends Lambda implements Function2<Scope, ParametersHolder, UserData> {
                public static final C0943b a = new C0943b();

                public C0943b() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final UserData invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return UserData.get();
                }
            }

            public a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ScopeDSL scopeDSL) {
                invoke2(scopeDSL);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ScopeDSL scopeDSL) {
                StringQualifier stringQualifierNamed = QualifierKt.named(KoinModuleKt.WALLET_SCOPE_USER_ID);
                C0942a c0942a = C0942a.a;
                Kind kind = Kind.Scoped;
                BeanDefinition beanDefinition = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(String.class), stringQualifierNamed, c0942a, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), stringQualifierNamed, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(beanDefinition);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey, scopedInstanceFactory, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory);
                StringQualifier stringQualifierNamed2 = QualifierKt.named(KoinModuleKt.WALLET_SCOPE_USER_USERDATA);
                C0943b c0943b = C0943b.a;
                BeanDefinition beanDefinition2 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(UserData.class), stringQualifierNamed2, c0943b, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), stringQualifierNamed2, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory2 = new ScopedInstanceFactory(beanDefinition2);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey2, scopedInstanceFactory2, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory2);
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.WalletModuleKt$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/dsl/ScopeDSL;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0944b extends Lambda implements Function1<ScopeDSL, Unit> {
            public static final C0944b a = new C0944b();

            /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.WalletModuleKt$b$b$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/databases/model/Device;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function2<Scope, ParametersHolder, Device> {
                public static final a a = new a();

                public a() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Device invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    DeviceManagerApi deviceManagerApi = ManagerFunctionsKt.getDeviceManagerApi();
                    Device bindInfo = deviceManagerApi.getBindInfo(deviceManagerApi.getMajorDeviceType());
                    Objects.requireNonNull(bindInfo, "Error of get Device");
                    return bindInfo;
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.WalletModuleKt$b$b$b, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/wallet/ui/resource/IWalletRes;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0945b extends Lambda implements Function2<Scope, ParametersHolder, IWalletRes> {
                public static final C0945b a = new C0945b();

                public C0945b() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final IWalletRes invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return NfcConfigKt.getBusRes(WalletModuleKt.device(WalletModuleKt.walletDeviceScope()));
                }
            }

            public C0944b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ScopeDSL scopeDSL) {
                invoke2(scopeDSL);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ScopeDSL scopeDSL) {
                StringQualifier stringQualifierNamed = QualifierKt.named(KoinModuleKt.WALLET_SCOPE_DEVICE_DEVICE);
                a aVar = a.a;
                Kind kind = Kind.Scoped;
                BeanDefinition beanDefinition = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(Device.class), stringQualifierNamed, aVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), stringQualifierNamed, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(beanDefinition);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey, scopedInstanceFactory, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory);
                StringQualifier stringQualifierNamed2 = QualifierKt.named(KoinModuleKt.WALLET_SCOPE_DEVICE_RES);
                C0945b c0945b = C0945b.a;
                BeanDefinition beanDefinition2 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(IWalletRes.class), stringQualifierNamed2, c0945b, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), stringQualifierNamed2, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory2 = new ScopedInstanceFactory(beanDefinition2);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey2, scopedInstanceFactory2, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory2);
            }
        }

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Module module) {
            invoke2(module);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Module module) {
            module.scope(QualifierKt.named(KoinModuleKt.WALLET_SCOPE_USER), a.a);
            module.scope(QualifierKt.named(KoinModuleKt.WALLET_SCOPE_DEVICE), C0944b.a);
        }
    }

    @NotNull
    public static final WalletDataSource dataSource(@NotNull Scope scope) {
        return (WalletDataSource) scope.get(Reflection.getOrCreateKotlinClass(WalletDataSource.class), QualifierKt.named(WALLET_SCOPE_DEVICE_DATASOURCE), null);
    }

    @NotNull
    public static final Device device(@NotNull Scope scope) {
        return (Device) scope.get(Reflection.getOrCreateKotlinClass(Device.class), QualifierKt.named(KoinModuleKt.WALLET_SCOPE_DEVICE_DEVICE), null);
    }

    @NotNull
    public static final Module getWalletAppModule() {
        return a;
    }

    @NotNull
    public static final Module getWalletUserDeviceModule() {
        return b;
    }

    @NotNull
    public static final INFCOpenServiceWebAPI nfcOpenServiceWebAPI(@NotNull Scope scope) {
        return (INFCOpenServiceWebAPI) scope.get(Reflection.getOrCreateKotlinClass(INFCOpenServiceWebAPI.class), QualifierKt.named(WALLET_SCOPE_DEVICE_WEBAPI), null);
    }

    @NotNull
    public static final UserData user(@NotNull Scope scope) {
        return (UserData) scope.get(Reflection.getOrCreateKotlinClass(UserData.class), QualifierKt.named(KoinModuleKt.WALLET_SCOPE_USER_USERDATA), null);
    }

    @NotNull
    public static final String userID(@NotNull Scope scope) {
        return (String) scope.get(Reflection.getOrCreateKotlinClass(String.class), QualifierKt.named(KoinModuleKt.WALLET_SCOPE_USER_ID), null);
    }

    @NotNull
    public static final Scope walletDeviceScope() {
        return Koin.getOrCreateScope$default(KoinJavaComponent.getKoin(), KoinModuleKt.WALLET_SCOPE_DEVICE, QualifierKt.named(KoinModuleKt.WALLET_SCOPE_DEVICE), null, 4, null);
    }

    public static final void walletDeviceScopeDestroy() {
        walletDeviceScope().close();
    }

    @NotNull
    public static final Scope walletUserScope() {
        return Koin.getOrCreateScope$default(KoinJavaComponent.getKoin(), KoinModuleKt.WALLET_SCOPE_USER, QualifierKt.named(KoinModuleKt.WALLET_SCOPE_USER), null, 4, null);
    }

    public static final void walletUserScopeDestroy() {
        walletUserScope().close();
    }
}
