package com.huami.device.core.agps.impl.factory;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.device.core.agps.AgpsUpgradeBuilder;
import com.huami.device.core.agps.api.AbstractAgpsUpgradeFactory;
import com.huami.device.core.agps.api.AgpsHttpClient;
import com.huami.device.core.agps.api.MultiDependenceStore;
import com.huami.device.core.agps.api.NeedUpgradeStrategy;
import com.huami.device.core.agps.api.UpgradeTarget;
import com.huami.device.core.agps.api.bean.AppInfo;
import com.huami.device.core.agps.impl.AgpsAnalytics;
import com.huami.device.core.agps.impl.DevicePropertyProvider;
import com.huami.device.core.agps.impl.MiFitHttpClient;
import com.huami.device.core.agps.impl.store.FanaticAgpsStore;
import com.huami.device.core.agps.impl.store.HmGpsStore;
import com.huami.device.core.agps.impl.store.HmSecondaryStore;
import com.huami.device.core.agps.impl.store.SonyAGPSFirmwareStore;
import com.huami.device.core.agps.impl.store.SonyAgpsBackupStore;
import com.huami.device.core.agps.impl.strategy.UpgradeStrategy;
import com.huami.device.core.agps.impl.upgrade.UpgradeWithRetryTarget;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.market.sdk.Constants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 ,2\u00020\u0001:\u0001,B\u001f\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\u0006\u0010$\u001a\u00020\u001f\u0012\u0006\u0010)\u001a\u00020\u0004¢\u0006\u0004\b*\u0010+J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0016\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fR\u001d\u0010\u0018\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u001e\u001a\u00020\u00198\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010$\u001a\u00020\u001f8\u0006@\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010)\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006-"}, d2 = {"Lcom/huami/device/core/agps/impl/factory/FanaticAgpsStoreFactory;", "Lcom/huami/device/core/agps/api/AbstractAgpsUpgradeFactory;", "Lcom/huami/device/core/agps/api/MultiDependenceStore;", "a", "Lcom/huami/device/core/agps/api/bean/AppInfo;", "createAppInfo", "Lcom/huami/device/core/agps/api/AgpsHttpClient;", "createHttpClient", "createStore", "Lcom/huami/device/core/agps/api/UpgradeTarget;", "createTarget", "Lcom/huami/device/core/agps/api/NeedUpgradeStrategy;", "createUpdateStrategy", "", "message", "", "progress", "", "onMessage", "Lcom/huami/device/core/agps/impl/AgpsAnalytics;", "c", "Lkotlin/Lazy;", "b", "()Lcom/huami/device/core/agps/impl/AgpsAnalytics;", "analytics", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "getDevice", "()Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "Lcom/xiaomi/hm/health/bt/profile/feature/Feature;", "e", "Lcom/xiaomi/hm/health/bt/profile/feature/Feature;", "getFeature", "()Lcom/xiaomi/hm/health/bt/profile/feature/Feature;", Constants.JSON_FEATURE, "f", "Lcom/huami/device/core/agps/api/bean/AppInfo;", "getInfo", "()Lcom/huami/device/core/agps/api/bean/AppInfo;", "info", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;Lcom/xiaomi/hm/health/bt/profile/feature/Feature;Lcom/huami/device/core/agps/api/bean/AppInfo;)V", "Companion", "agps-impl_release"}, k = 1, mv = {1, 4, 0})
public final class FanaticAgpsStoreFactory extends AbstractAgpsUpgradeFactory {
    private static final String g = "Agps-update-factory";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Lazy analytics;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final HMBaseDevice device;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Feature feature;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final AppInfo info;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/huami/device/core/agps/impl/AgpsAnalytics;", "a", "()Lcom/huami/device/core/agps/impl/AgpsAnalytics;"}, k = 3, mv = {1, 4, 0})
    public static final class a extends Lambda implements Function0<AgpsAnalytics> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AgpsAnalytics getA() {
            return new AgpsAnalytics(new DevicePropertyProvider(FanaticAgpsStoreFactory.this.getDevice()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0015\u0010\u0004\u001a\u00110\u0000¢\u0006\f\b\u0001\u0012\b\b\u0002\u0012\u0004\b\b(\u00032\u0015\u0010\u0007\u001a\u00110\u0005¢\u0006\f\b\u0001\u0012\b\b\u0002\u0012\u0004\b\b(\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "Lkotlin/ParameterName;", "name", "message", "p1", "", "progress", "p2", "", "a", "(Ljava/lang/String;I)V"}, k = 3, mv = {1, 4, 0})
    public static final /* synthetic */ class b extends FunctionReference implements Function2<String, Integer, Unit> {
        public b(FanaticAgpsStoreFactory fanaticAgpsStoreFactory) {
            super(2, fanaticAgpsStoreFactory);
        }

        public final void a(@NotNull String str, int i) {
            ((FanaticAgpsStoreFactory) this.receiver).onMessage(str, i);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "onMessage";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(FanaticAgpsStoreFactory.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "onMessage(Ljava/lang/String;I)V";
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, Integer num) {
            a(str, num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0015\u0010\u0004\u001a\u00110\u0000¢\u0006\f\b\u0001\u0012\b\b\u0002\u0012\u0004\b\b(\u00032\u0015\u0010\u0007\u001a\u00110\u0005¢\u0006\f\b\u0001\u0012\b\b\u0002\u0012\u0004\b\b(\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "Lkotlin/ParameterName;", "name", "message", "p1", "", "progress", "p2", "", "a", "(Ljava/lang/String;I)V"}, k = 3, mv = {1, 4, 0})
    public static final /* synthetic */ class c extends FunctionReference implements Function2<String, Integer, Unit> {
        public c(FanaticAgpsStoreFactory fanaticAgpsStoreFactory) {
            super(2, fanaticAgpsStoreFactory);
        }

        public final void a(@NotNull String str, int i) {
            ((FanaticAgpsStoreFactory) this.receiver).onMessage(str, i);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "onMessage";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(FanaticAgpsStoreFactory.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "onMessage(Ljava/lang/String;I)V";
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, Integer num) {
            a(str, num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0015\u0010\u0004\u001a\u00110\u0000¢\u0006\f\b\u0001\u0012\b\b\u0002\u0012\u0004\b\b(\u00032\u0015\u0010\u0007\u001a\u00110\u0005¢\u0006\f\b\u0001\u0012\b\b\u0002\u0012\u0004\b\b(\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "Lkotlin/ParameterName;", "name", "message", "p1", "", "progress", "p2", "", "a", "(Ljava/lang/String;I)V"}, k = 3, mv = {1, 4, 0})
    public static final /* synthetic */ class d extends FunctionReference implements Function2<String, Integer, Unit> {
        public d(FanaticAgpsStoreFactory fanaticAgpsStoreFactory) {
            super(2, fanaticAgpsStoreFactory);
        }

        public final void a(@NotNull String str, int i) {
            ((FanaticAgpsStoreFactory) this.receiver).onMessage(str, i);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "onMessage";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(FanaticAgpsStoreFactory.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "onMessage(Ljava/lang/String;I)V";
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, Integer num) {
            a(str, num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0015\u0010\u0004\u001a\u00110\u0000¢\u0006\f\b\u0001\u0012\b\b\u0002\u0012\u0004\b\b(\u00032\u0015\u0010\u0007\u001a\u00110\u0005¢\u0006\f\b\u0001\u0012\b\b\u0002\u0012\u0004\b\b(\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "Lkotlin/ParameterName;", "name", "message", "p1", "", "progress", "p2", "", "a", "(Ljava/lang/String;I)V"}, k = 3, mv = {1, 4, 0})
    public static final /* synthetic */ class e extends FunctionReference implements Function2<String, Integer, Unit> {
        public e(FanaticAgpsStoreFactory fanaticAgpsStoreFactory) {
            super(2, fanaticAgpsStoreFactory);
        }

        public final void a(@NotNull String str, int i) {
            ((FanaticAgpsStoreFactory) this.receiver).onMessage(str, i);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "onMessage";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(FanaticAgpsStoreFactory.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "onMessage(Ljava/lang/String;I)V";
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, Integer num) {
            a(str, num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, int i) {
            super(0);
            this.a = str;
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "message --> " + this.a + " [" + this.b + JsonLexerKt.END_LIST;
        }
    }

    public FanaticAgpsStoreFactory(@NotNull HMBaseDevice hMBaseDevice, @NotNull Feature feature, @NotNull AppInfo appInfo) {
        super(new FanaticResourceTypeProvider(hMBaseDevice, feature).loadResourceType());
        this.device = hMBaseDevice;
        this.feature = feature;
        this.info = appInfo;
        this.analytics = LazyKt__LazyJVMKt.lazy(new a());
    }

    private final MultiDependenceStore a() {
        return new HmSecondaryStore(createHttpClient(), getInfo(), AgpsUpgradeBuilder.INSTANCE.getContext$agps_impl_release().getCacheDir().getAbsolutePath());
    }

    private final AgpsAnalytics b() {
        return (AgpsAnalytics) this.analytics.getValue();
    }

    @Override // com.huami.device.core.agps.api.AbstractAgpsUpgradeFactory
    @NotNull
    /* JADX INFO: renamed from: createAppInfo */
    public AppInfo getInfo() {
        return AppInfo.copy$default(this.info, null, null, getResourceType(), null, null, null, 59, null);
    }

    @Override // com.huami.device.core.agps.api.AbstractAgpsUpgradeFactory
    @NotNull
    public AgpsHttpClient createHttpClient() {
        return new MiFitHttpClient(getInfo());
    }

    @Override // com.huami.device.core.agps.api.AbstractAgpsUpgradeFactory
    @NotNull
    public MultiDependenceStore createStore() {
        return new HmGpsStore(createHttpClient(), getInfo(), AgpsUpgradeBuilder.INSTANCE.getContext$agps_impl_release().getCacheDir().getAbsolutePath());
    }

    @Override // com.huami.device.core.agps.api.AbstractAgpsUpgradeFactory
    @NotNull
    public UpgradeTarget createTarget() {
        return this.feature.hasSw(37) ? new UpgradeWithRetryTarget(this.device, b(), new FanaticAgpsStore(b(), createStore(), new b(this)), new FanaticAgpsStore(b(), a(), new c(this)), new d(this)) : new UpgradeWithRetryTarget(this.device, b(), new SonyAGPSFirmwareStore(this.feature), new SonyAgpsBackupStore(this.feature), new e(this));
    }

    @Override // com.huami.device.core.agps.api.AbstractAgpsUpgradeFactory
    @NotNull
    public NeedUpgradeStrategy createUpdateStrategy() {
        return new UpgradeStrategy();
    }

    @NotNull
    public final HMBaseDevice getDevice() {
        return this.device;
    }

    @NotNull
    public final Feature getFeature() {
        return this.feature;
    }

    @NotNull
    public final AppInfo getInfo() {
        return this.info;
    }

    public final void onMessage(@NotNull String message, int progress) {
        HMLog.info(g, new f(message, progress));
    }
}
