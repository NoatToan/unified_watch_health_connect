package com.xiaomi.hm.health.di.koin.module;

import android.content.Context;
import cn.eid.service.EidServiceConfig;
import com.huami.components.devicestatus.DeviceStatusStringProvider;
import com.huami.eid.ui.api.EidConfig;
import com.huami.jac.repo.di.JacModuleKt;
import com.huami.jac.ui.amazfit.helper.JacDeviceStatusStringProvider;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.nfc.base.INfcChannel;
import com.huami.nfc.ble.IDeviceApi;
import com.huami.nfc.ble.NfcBleApi;
import com.huami.nfc.door.INfcTag;
import com.huami.nfc.eid.api.EidDeviceApi;
import com.huami.nfc.web.IWebConfig;
import com.huami.nfc.web.NfcDevice;
import com.huami.nfc.web.UserInfo;
import com.huami.wallet.common.config.LocationConfig;
import com.huami.wallet.common.config.LocationInfo;
import com.huami.wallet.common.config.NavigationConfig;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.xiaopeng.repo.di.XiaopengModuleKt;
import com.unionpay.api.WatchUnionpayDeviceApi;
import com.unionpay.util.WatchUnionpayConfig;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.NfcDeviceConfigKt;
import com.xiaomi.hm.health.locweather.LocWeatherKeeper;
import com.xiaomi.hm.health.locweather.location.MyLocation;
import com.xiaomi.hm.health.nfc.DeviceApi;
import com.xiaomi.hm.health.nfc.MiUserInfoKt;
import com.xiaomi.hm.health.nfc.NavigationConfigImpl;
import com.xiaomi.hm.health.nfc.NfcConfigKt;
import com.xiaomi.hm.health.nfc.NfcStatusListener;
import com.xiaomi.hm.health.nfc.WalletDeviceStatusStringProvider;
import com.xiaomi.hm.health.nfc.WalletNfcBleApi;
import com.xiaomi.hm.health.nfc.WebConfig;
import com.xiaomi.hm.health.nfc.XpDeviceStatusStringProvider;
import com.xiaomi.hm.health.nfc.channel.BandNfcChannel;
import com.xiaomi.hm.health.nfc.channel.TransportChannel;
import com.xiaomi.hm.health.nfc.channel.TransportChannelImpl;
import com.xiaomi.hm.health.nfc.channel.WatchNfcChannel;
import com.xiaomi.hm.health.nfc.channel.WatchNfcTag;
import com.xiaomi.hm.health.nfc.door.DoorNfcTag;
import com.xiaomi.hm.health.nfc.eid.EidDeviceApiImpl;
import com.xiaomi.hm.health.nfc.eid.EidServiceConfigImpl;
import com.xiaomi.hm.health.nfc.unionpay.WatchUnionpayDeviceApiBleImpl;
import com.xiaomi.hm.health.nfc.unionpay.WatchUnionpayDeviceApiBtImpl;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.context.GlobalContext;
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

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0006\u0010\u0005\u001a\u00020\u0004\u001a\n\u0010\u0007\u001a\u00020\u0006*\u00020\u0004\u001a\n\u0010\t\u001a\u00020\b*\u00020\u0004\u001a\u0006\u0010\u000b\u001a\u00020\n\"\u0016\u0010\f\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0016\u0010\u000e\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\r\"\u0016\u0010\u000f\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\r\"\u0016\u0010\u0011\u001a\u00020\u00108\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0016\u0010\u0013\u001a\u00020\u00108\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"", "getSN", "Lcom/xiaomi/hm/health/databases/model/Device;", "deviceInfo", "Lorg/koin/core/scope/Scope;", "huamipayNFCChannelScope", "Lcom/huami/nfc/base/INfcChannel;", "nfcChannel", "Lcom/huami/nfc/door/INfcTag;", "nfcTag", "", "huamipayNFCChannelScopeDestroy", HuamipayModuleKt.HUAMIPAY_SCOPE_NFCCHANNEL, "Ljava/lang/String;", HuamipayModuleKt.HUAMIPAY_SCOPE_NFCCHANNEL_INFCTAG, HuamipayModuleKt.HUAMIPAY_SCOPE_NFCCHANNEL_INFCCHANNEL, "Lorg/koin/core/module/Module;", "nfcChannelModule", "Lorg/koin/core/module/Module;", "huamipayDeps", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class HuamipayModuleKt {

    @NotNull
    public static final String HUAMIPAY_SCOPE_NFCCHANNEL = "HUAMIPAY_SCOPE_NFCCHANNEL";

    @NotNull
    public static final String HUAMIPAY_SCOPE_NFCCHANNEL_INFCCHANNEL = "HUAMIPAY_SCOPE_NFCCHANNEL_INFCCHANNEL";

    @NotNull
    public static final String HUAMIPAY_SCOPE_NFCCHANNEL_INFCTAG = "HUAMIPAY_SCOPE_NFCCHANNEL_INFCTAG";

    @JvmField
    @NotNull
    public static final Module nfcChannelModule = ModuleKt.module$default(false, a.a, 1, null);

    @JvmField
    @NotNull
    public static final Module huamipayDeps = ModuleKt.module$default(false, new Function1<Module, Unit>() { // from class: com.xiaomi.hm.health.di.koin.module.HuamipayModuleKt$huamipayDeps$1

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/components/devicestatus/DeviceStatusStringProvider;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function2<Scope, ParametersHolder, DeviceStatusStringProvider> {
            public static final a a = new a();

            public a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DeviceStatusStringProvider invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new WalletDeviceStatusStringProvider();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/components/devicestatus/DeviceStatusStringProvider;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function2<Scope, ParametersHolder, DeviceStatusStringProvider> {
            public static final b a = new b();

            public b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DeviceStatusStringProvider invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new XpDeviceStatusStringProvider();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/components/devicestatus/DeviceStatusStringProvider;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function2<Scope, ParametersHolder, DeviceStatusStringProvider> {
            public static final c a = new c();

            public c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DeviceStatusStringProvider invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new JacDeviceStatusStringProvider();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/eid/ui/api/EidConfig;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function2<Scope, ParametersHolder, EidConfig> {
            public static final d a = new d();

            public d() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final EidConfig invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return HMServerDef.isProductUrl() ? new EidConfig("7", "33") : new EidConfig("4", "31");
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcn/eid/service/EidServiceConfig;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function2<Scope, ParametersHolder, EidServiceConfig> {
            public static final e a = new e();

            public e() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final EidServiceConfig invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new EidServiceConfigImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/nfc/eid/api/EidDeviceApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class f extends Lambda implements Function2<Scope, ParametersHolder, EidDeviceApi> {
            public static final f a = new f();

            public f() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final EidDeviceApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new EidDeviceApiImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/unionpay/api/WatchUnionpayDeviceApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class g extends Lambda implements Function2<Scope, ParametersHolder, WatchUnionpayDeviceApi> {
            public static final g a = new g();

            public g() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final WatchUnionpayDeviceApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return NfcDeviceConfigKt.isNfcWatchDevice() ? new WatchUnionpayDeviceApiBtImpl() : new WatchUnionpayDeviceApiBleImpl((INfcChannel) scope.get(Reflection.getOrCreateKotlinClass(INfcChannel.class), null, null), (NfcBleApi) scope.get(Reflection.getOrCreateKotlinClass(NfcBleApi.class), null, null), (IDeviceApi) scope.get(Reflection.getOrCreateKotlinClass(IDeviceApi.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/nfc/channel/TransportChannel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class h extends Lambda implements Function2<Scope, ParametersHolder, TransportChannel> {
            public static final h a = new h();

            public h() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TransportChannel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new TransportChannelImpl((Context) scope.get(Reflection.getOrCreateKotlinClass(Context.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/nfc/ble/NfcBleApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class i extends Lambda implements Function2<Scope, ParametersHolder, NfcBleApi> {
            public static final i a = new i();

            public i() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final NfcBleApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new WalletNfcBleApi();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/nfc/ble/IDeviceApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class j extends Lambda implements Function2<Scope, ParametersHolder, IDeviceApi> {
            public static final j a = new j();

            public j() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IDeviceApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new DeviceApi();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/nfc/web/IWebConfig;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class k extends Lambda implements Function2<Scope, ParametersHolder, IWebConfig> {
            public static final k a = new k();

            public k() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IWebConfig invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new WebConfig();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/nfc/web/NfcDevice;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class l extends Lambda implements Function2<Scope, ParametersHolder, NfcDevice> {
            public static final l a = new l();

            public l() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final NfcDevice invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new NfcDevice(HuamipayModuleKt.getSN(), NfcConfigKt.deviceModel(HuamipayModuleKt.deviceInfo()), null, 4, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/nfc/web/UserInfo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class m extends Lambda implements Function2<Scope, ParametersHolder, UserInfo> {
            public static final m a = new m();

            public m() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final UserInfo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new UserInfo(MiUserInfoKt.getMiId(), MiUserInfoKt.getMiToken());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/wallet/common/config/WebConfig;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class n extends Lambda implements Function2<Scope, ParametersHolder, com.huami.wallet.common.config.WebConfig> {
            public static final n a = new n();

            public n() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final com.huami.wallet.common.config.WebConfig invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new com.huami.wallet.common.config.WebConfig("com.huami.midong", HMServerDef.getHost());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/wallet/common/config/NavigationConfig;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class o extends Lambda implements Function2<Scope, ParametersHolder, NavigationConfig> {
            public static final o a = new o();

            public o() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final NavigationConfig invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new NavigationConfigImpl();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Module module) {
            invoke2(module);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Module module) {
            h hVar = h.a;
            Kind kind = Kind.Singleton;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            BeanDefinition beanDefinition = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(TransportChannel.class), null, hVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, singleInstanceFactory, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory);
            }
            new Pair(module, singleInstanceFactory);
            i iVar = i.a;
            BeanDefinition beanDefinition2 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(NfcBleApi.class), null, iVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory2 = new SingleInstanceFactory<>(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, singleInstanceFactory2, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory2);
            }
            new Pair(module, singleInstanceFactory2);
            j jVar = j.a;
            BeanDefinition beanDefinition3 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(IDeviceApi.class), null, jVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory3 = new SingleInstanceFactory<>(beanDefinition3);
            Module.saveMapping$default(module, strIndexKey3, singleInstanceFactory3, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory3);
            }
            new Pair(module, singleInstanceFactory3);
            k kVar = k.a;
            BeanDefinition beanDefinition4 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(IWebConfig.class), null, kVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory4 = new SingleInstanceFactory<>(beanDefinition4);
            Module.saveMapping$default(module, strIndexKey4, singleInstanceFactory4, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory4);
            }
            new Pair(module, singleInstanceFactory4);
            l lVar = l.a;
            BeanDefinition beanDefinition5 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(NfcDevice.class), null, lVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey5 = BeanDefinitionKt.indexKey(beanDefinition5.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory5 = new SingleInstanceFactory<>(beanDefinition5);
            Module.saveMapping$default(module, strIndexKey5, singleInstanceFactory5, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory5);
            }
            new Pair(module, singleInstanceFactory5);
            m mVar = m.a;
            BeanDefinition beanDefinition6 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(UserInfo.class), null, mVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey6 = BeanDefinitionKt.indexKey(beanDefinition6.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory6 = new SingleInstanceFactory<>(beanDefinition6);
            Module.saveMapping$default(module, strIndexKey6, singleInstanceFactory6, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory6);
            }
            new Pair(module, singleInstanceFactory6);
            n nVar = n.a;
            BeanDefinition beanDefinition7 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(com.huami.wallet.common.config.WebConfig.class), null, nVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey7 = BeanDefinitionKt.indexKey(beanDefinition7.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory7 = new SingleInstanceFactory<>(beanDefinition7);
            Module.saveMapping$default(module, strIndexKey7, singleInstanceFactory7, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory7);
            }
            new Pair(module, singleInstanceFactory7);
            AnonymousClass8 anonymousClass8 = new Function2<Scope, ParametersHolder, LocationConfig>() { // from class: com.xiaomi.hm.health.di.koin.module.HuamipayModuleKt$huamipayDeps$1.8
                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final LocationConfig invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new LocationConfig() { // from class: com.xiaomi.hm.health.di.koin.module.HuamipayModuleKt.huamipayDeps.1.8.1
                        @Override // com.huami.wallet.common.config.LocationConfig
                        @Nullable
                        public LocationInfo getLocationInfo() {
                            MyLocation lastLocation = LocWeatherKeeper.getLastLocation();
                            MyLocation.Address address = lastLocation == null ? null : lastLocation.getAddress();
                            if (address == null) {
                                return null;
                            }
                            String cityCode = address.getCityCode();
                            String locality = address.getLocality();
                            if (locality == null) {
                                locality = "";
                            }
                            return new LocationInfo(cityCode, locality);
                        }
                    };
                }
            };
            BeanDefinition beanDefinition8 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(LocationConfig.class), null, anonymousClass8, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey8 = BeanDefinitionKt.indexKey(beanDefinition8.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory8 = new SingleInstanceFactory<>(beanDefinition8);
            Module.saveMapping$default(module, strIndexKey8, singleInstanceFactory8, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory8);
            }
            new Pair(module, singleInstanceFactory8);
            o oVar = o.a;
            BeanDefinition beanDefinition9 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(NavigationConfig.class), null, oVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey9 = BeanDefinitionKt.indexKey(beanDefinition9.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory9 = new SingleInstanceFactory<>(beanDefinition9);
            Module.saveMapping$default(module, strIndexKey9, singleInstanceFactory9, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory9);
            }
            new Pair(module, singleInstanceFactory9);
            a aVar = a.a;
            BeanDefinition beanDefinition10 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DeviceStatusStringProvider.class), null, aVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey10 = BeanDefinitionKt.indexKey(beanDefinition10.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory10 = new SingleInstanceFactory<>(beanDefinition10);
            Module.saveMapping$default(module, strIndexKey10, singleInstanceFactory10, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory10);
            }
            new Pair(module, singleInstanceFactory10);
            StringQualifier stringQualifierNamed = QualifierKt.named(XiaopengModuleKt.XP_DEVICE_PROVIDER);
            b bVar = b.a;
            BeanDefinition beanDefinition11 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DeviceStatusStringProvider.class), stringQualifierNamed, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey11 = BeanDefinitionKt.indexKey(beanDefinition11.getPrimaryType(), stringQualifierNamed, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory11 = new SingleInstanceFactory<>(beanDefinition11);
            Module.saveMapping$default(module, strIndexKey11, singleInstanceFactory11, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory11);
            }
            new Pair(module, singleInstanceFactory11);
            StringQualifier stringQualifierNamed2 = QualifierKt.named(JacModuleKt.JAC_DEVICE_PROVIDER);
            c cVar = c.a;
            BeanDefinition beanDefinition12 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DeviceStatusStringProvider.class), stringQualifierNamed2, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey12 = BeanDefinitionKt.indexKey(beanDefinition12.getPrimaryType(), stringQualifierNamed2, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory12 = new SingleInstanceFactory<>(beanDefinition12);
            Module.saveMapping$default(module, strIndexKey12, singleInstanceFactory12, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory12);
            }
            new Pair(module, singleInstanceFactory12);
            d dVar = d.a;
            BeanDefinition beanDefinition13 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(EidConfig.class), null, dVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey13 = BeanDefinitionKt.indexKey(beanDefinition13.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory13 = new SingleInstanceFactory<>(beanDefinition13);
            Module.saveMapping$default(module, strIndexKey13, singleInstanceFactory13, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory13);
            }
            new Pair(module, singleInstanceFactory13);
            e eVar = e.a;
            BeanDefinition beanDefinition14 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(EidServiceConfig.class), null, eVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey14 = BeanDefinitionKt.indexKey(beanDefinition14.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory14 = new SingleInstanceFactory<>(beanDefinition14);
            Module.saveMapping$default(module, strIndexKey14, singleInstanceFactory14, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory14);
            }
            new Pair(module, singleInstanceFactory14);
            f fVar = f.a;
            BeanDefinition beanDefinition15 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(EidDeviceApi.class), null, fVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey15 = BeanDefinitionKt.indexKey(beanDefinition15.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory15 = new SingleInstanceFactory<>(beanDefinition15);
            Module.saveMapping$default(module, strIndexKey15, singleInstanceFactory15, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory15);
            }
            new Pair(module, singleInstanceFactory15);
            g gVar = g.a;
            BeanDefinition beanDefinition16 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(WatchUnionpayDeviceApi.class), null, gVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey16 = BeanDefinitionKt.indexKey(beanDefinition16.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory16 = new SingleInstanceFactory<>(beanDefinition16);
            Module.saveMapping$default(module, strIndexKey16, singleInstanceFactory16, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory16);
            }
            new Pair(module, singleInstanceFactory16);
            AnonymousClass17 anonymousClass17 = new Function2<Scope, ParametersHolder, WatchUnionpayConfig>() { // from class: com.xiaomi.hm.health.di.koin.module.HuamipayModuleKt$huamipayDeps$1.17
                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final WatchUnionpayConfig invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new WatchUnionpayConfig() { // from class: com.xiaomi.hm.health.di.koin.module.HuamipayModuleKt.huamipayDeps.1.17.1
                        @Override // com.unionpay.util.WatchUnionpayConfig
                        @NotNull
                        public String getProtocolTitle() {
                            return "Zepp/Amazfit可穿戴设备电子银行卡业务服务协议";
                        }

                        @Override // com.unionpay.util.WatchUnionpayConfig
                        public boolean isConnected() {
                            return HMDeviceManager.getInstance().isConnected(HMDeviceManager.getInstance().getMajorDeviceType());
                        }
                    };
                }
            };
            BeanDefinition beanDefinition17 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(WatchUnionpayConfig.class), null, anonymousClass17, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey17 = BeanDefinitionKt.indexKey(beanDefinition17.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory17 = new SingleInstanceFactory<>(beanDefinition17);
            Module.saveMapping$default(module, strIndexKey17, singleInstanceFactory17, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory17);
            }
            new Pair(module, singleInstanceFactory17);
        }
    }, 1, null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Module, Unit> {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.HuamipayModuleKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/dsl/ScopeDSL;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0913a extends Lambda implements Function1<ScopeDSL, Unit> {
            public static final C0913a a = new C0913a();

            /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.HuamipayModuleKt$a$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/nfc/base/INfcChannel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0914a extends Lambda implements Function2<Scope, ParametersHolder, INfcChannel> {
                public static final C0914a a = new C0914a();

                public C0914a() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final INfcChannel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return NfcDeviceConfigKt.isNfcWatchDevice() ? new WatchNfcChannel((TransportChannel) scope.get(Reflection.getOrCreateKotlinClass(TransportChannel.class), null, null)) : new BandNfcChannel(new NfcStatusListener());
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.HuamipayModuleKt$a$a$b */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/nfc/door/INfcTag;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function2<Scope, ParametersHolder, INfcTag> {
                public static final b a = new b();

                public b() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final INfcTag invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return NfcDeviceConfigKt.isNfcWatchDevice() ? new WatchNfcTag((TransportChannel) scope.get(Reflection.getOrCreateKotlinClass(TransportChannel.class), null, null)) : new DoorNfcTag();
                }
            }

            public C0913a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ScopeDSL scopeDSL) {
                invoke2(scopeDSL);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ScopeDSL scopeDSL) {
                StringQualifier stringQualifierNamed = QualifierKt.named(HuamipayModuleKt.HUAMIPAY_SCOPE_NFCCHANNEL_INFCCHANNEL);
                C0914a c0914a = C0914a.a;
                Kind kind = Kind.Scoped;
                BeanDefinition beanDefinition = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(INfcChannel.class), stringQualifierNamed, c0914a, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), stringQualifierNamed, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(beanDefinition);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey, scopedInstanceFactory, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory);
                StringQualifier stringQualifierNamed2 = QualifierKt.named(HuamipayModuleKt.HUAMIPAY_SCOPE_NFCCHANNEL_INFCTAG);
                b bVar = b.a;
                BeanDefinition beanDefinition2 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(INfcTag.class), stringQualifierNamed2, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), stringQualifierNamed2, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory2 = new ScopedInstanceFactory(beanDefinition2);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey2, scopedInstanceFactory2, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory2);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/nfc/base/INfcChannel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function2<Scope, ParametersHolder, INfcChannel> {
            public static final b a = new b();

            public b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final INfcChannel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return HuamipayModuleKt.nfcChannel(HuamipayModuleKt.huamipayNFCChannelScope());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/nfc/door/INfcTag;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function2<Scope, ParametersHolder, INfcTag> {
            public static final c a = new c();

            public c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final INfcTag invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return HuamipayModuleKt.nfcTag(HuamipayModuleKt.huamipayNFCChannelScope());
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
            module.scope(QualifierKt.named(HuamipayModuleKt.HUAMIPAY_SCOPE_NFCCHANNEL), C0913a.a);
            b bVar = b.a;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Factory;
            BeanDefinition beanDefinition = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(INfcChannel.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, rootScopeQualifier);
            FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, factoryInstanceFactory, false, 4, null);
            new Pair(module, factoryInstanceFactory);
            c cVar = c.a;
            StringQualifier rootScopeQualifier2 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition2 = new BeanDefinition(rootScopeQualifier2, Reflection.getOrCreateKotlinClass(INfcTag.class), null, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, rootScopeQualifier2);
            FactoryInstanceFactory factoryInstanceFactory2 = new FactoryInstanceFactory(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, factoryInstanceFactory2, false, 4, null);
            new Pair(module, factoryInstanceFactory2);
        }
    }

    @NotNull
    public static final Device deviceInfo() {
        Device bindInfo = HMDeviceManager.getInstance().getBindInfo(HMDeviceManager.getInstance().getMajorDeviceType());
        Objects.requireNonNull(bindInfo, "Error of device");
        return bindInfo;
    }

    @NotNull
    public static final String getSN() {
        String sn = deviceInfo().getSn();
        if ((sn == null || sn.length() == 0) && NfcDeviceConfigKt.isNfcWatchDevice()) {
            sn = DeviceManager.getManager(BraceletApp.getContext()).getCurrentDevice().getSN();
        }
        return sn == null ? "" : sn;
    }

    @NotNull
    public static final Scope huamipayNFCChannelScope() {
        return Koin.getOrCreateScope$default(GlobalContext.INSTANCE.get(), HUAMIPAY_SCOPE_NFCCHANNEL, QualifierKt.named(HUAMIPAY_SCOPE_NFCCHANNEL), null, 4, null);
    }

    public static final void huamipayNFCChannelScopeDestroy() {
        huamipayNFCChannelScope().close();
    }

    @NotNull
    public static final INfcChannel nfcChannel(@NotNull Scope scope) {
        return (INfcChannel) scope.get(Reflection.getOrCreateKotlinClass(INfcChannel.class), QualifierKt.named(HUAMIPAY_SCOPE_NFCCHANNEL_INFCCHANNEL), null);
    }

    @NotNull
    public static final INfcTag nfcTag(@NotNull Scope scope) {
        return (INfcTag) scope.get(Reflection.getOrCreateKotlinClass(INfcTag.class), QualifierKt.named(HUAMIPAY_SCOPE_NFCCHANNEL_INFCTAG), null);
    }
}
