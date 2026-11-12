package com.xiaomi.hm.health.device.setting.pattern;

import com.huami.devicex.manager.DeviceManagerApi;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.setting.SoftFeature;
import com.xiaomi.hm.health.device.setting.pattern.impl.BleDeviceFeatureTree;
import com.xiaomi.hm.health.device.setting.pattern.impl.band.BariFeatureTree;
import com.xiaomi.hm.health.device.setting.pattern.impl.band.L66FeatureTree;
import com.xiaomi.hm.health.device.setting.pattern.impl.band.PanguFeatureTree;
import com.xiaomi.hm.health.device.setting.pattern.impl.blanc.BlancFeatureTree;
import com.xiaomi.hm.health.device.setting.pattern.impl.como.ComoFeatureTree;
import com.xiaomi.hm.health.device.setting.pattern.impl.como.ComoWFeatureTree;
import com.xiaomi.hm.health.device.setting.pattern.impl.gt2.BonnFeatureTree;
import com.xiaomi.hm.health.device.setting.pattern.impl.gt2.CorsicaFeatureTree;
import com.xiaomi.hm.health.device.setting.pattern.impl.gt2.HamburgFeatureTree;
import com.xiaomi.hm.health.device.setting.pattern.impl.gt2.LincsFeatureTree;
import com.xiaomi.hm.health.device.setting.pattern.impl.gt2.LisbonFeatureTree;
import com.xiaomi.hm.health.device.setting.pattern.impl.gt2.NewtonFeatureTree;
import com.xiaomi.hm.health.device.setting.pattern.impl.gt2.OnyxFeatureTree;
import com.xiaomi.hm.health.device.setting.pattern.impl.gt2.OspreyFeatureTree;
import com.xiaomi.hm.health.device.setting.pattern.impl.gt2.PragueFeatureTree;
import com.xiaomi.hm.health.device.setting.pattern.impl.gt2.VolgaFeatureTree;
import com.xiaomi.hm.health.device.setting.pattern.impl.gt3.GT3FeatureTree;
import com.xiaomi.hm.health.device.setting.pattern.impl.gt3.ProvenceFeatureTree;
import com.xiaomi.hm.health.device.setting.pattern.impl.gt3.ViennaFeatureTree;
import com.xiaomi.hm.health.device.setting.pattern.impl.gt3.ZVFeatureTree;
import com.xiaomi.hm.health.device.setting.pattern.impl.gt4.GT4FeatureTree;
import com.xiaomi.hm.health.device.setting.pattern.impl.gt4.LeidenFeatureTree;
import com.xiaomi.hm.health.device.setting.pattern.impl.osaka.OsakaFeatureTree;
import com.xiaomi.market.sdk.Constants;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007R\"\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001d\u0010\u0012\u001a\u00020\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\f\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/pattern/FeatureTreeFactory;", "Lorg/koin/core/component/KoinComponent;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "Lcom/xiaomi/hm/health/device/setting/pattern/FeatureTree;", "b", "realCreate", "Lcom/xiaomi/hm/health/device/setting/SoftFeature;", Constants.JSON_FEATURE, "", "isSupportFeature", "Ljava/util/WeakHashMap;", "a", "Ljava/util/WeakHashMap;", "cacheMap", "Lcom/huami/devicex/manager/DeviceManagerApi;", "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "c", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "hmBaseDeviceSource", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class FeatureTreeFactory implements KoinComponent {

    @NotNull
    public static final FeatureTreeFactory INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final WeakHashMap<HMDeviceSource, FeatureTree> cacheMap;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static HMDeviceSource hmBaseDeviceSource;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMDeviceSource.values().length];
            iArr[HMDeviceSource.MILI_LISBON.ordinal()] = 1;
            iArr[HMDeviceSource.MILI_LISBON_W.ordinal()] = 2;
            iArr[HMDeviceSource.MILI_LISBON_WL.ordinal()] = 3;
            iArr[HMDeviceSource.MILI_OSPREY.ordinal()] = 4;
            iArr[HMDeviceSource.MILI_OSPREY_W.ordinal()] = 5;
            iArr[HMDeviceSource.MILI_OSPREY_C.ordinal()] = 6;
            iArr[HMDeviceSource.MILI_VOLGA.ordinal()] = 7;
            iArr[HMDeviceSource.MILI_VOLGA_W.ordinal()] = 8;
            iArr[HMDeviceSource.MILI_NEWTON.ordinal()] = 9;
            iArr[HMDeviceSource.MILI_NEWTON_W.ordinal()] = 10;
            iArr[HMDeviceSource.MILI_NEWTON_WL.ordinal()] = 11;
            iArr[HMDeviceSource.MILI_LINCS.ordinal()] = 12;
            iArr[HMDeviceSource.MILI_LINCS_W.ordinal()] = 13;
            iArr[HMDeviceSource.MILI_PRAGUE.ordinal()] = 14;
            iArr[HMDeviceSource.MILI_PRAGUE_W.ordinal()] = 15;
            iArr[HMDeviceSource.MILI_ONYX.ordinal()] = 16;
            iArr[HMDeviceSource.MILI_ONYX_W.ordinal()] = 17;
            iArr[HMDeviceSource.MILI_CORSICA.ordinal()] = 18;
            iArr[HMDeviceSource.MILI_CORSICA_W.ordinal()] = 19;
            iArr[HMDeviceSource.MILI_BLANC.ordinal()] = 20;
            iArr[HMDeviceSource.MILI_BLANC_W.ordinal()] = 21;
            iArr[HMDeviceSource.MILI_HAMBURG.ordinal()] = 22;
            iArr[HMDeviceSource.MILI_HAMBURG_W.ordinal()] = 23;
            iArr[HMDeviceSource.MILI_BONN.ordinal()] = 24;
            iArr[HMDeviceSource.MILI_BONN_W.ordinal()] = 25;
            iArr[HMDeviceSource.MILI_COMO.ordinal()] = 26;
            iArr[HMDeviceSource.MILI_COMO_L.ordinal()] = 27;
            iArr[HMDeviceSource.MILI_NESS.ordinal()] = 28;
            iArr[HMDeviceSource.MILI_WAST.ordinal()] = 29;
            iArr[HMDeviceSource.MILI_COMO_W.ordinal()] = 30;
            iArr[HMDeviceSource.MILI_COMO_WL.ordinal()] = 31;
            iArr[HMDeviceSource.MILI_NESS_W.ordinal()] = 32;
            iArr[HMDeviceSource.MILI_DAX.ordinal()] = 33;
            iArr[HMDeviceSource.MILI_CRATER_W.ordinal()] = 34;
            iArr[HMDeviceSource.MILI_CRATER_WL.ordinal()] = 35;
            iArr[HMDeviceSource.MILI_WAST_W.ordinal()] = 36;
            iArr[HMDeviceSource.MILI_MADRID.ordinal()] = 37;
            iArr[HMDeviceSource.MILI_MADRID_W.ordinal()] = 38;
            iArr[HMDeviceSource.MILI_BLED.ordinal()] = 39;
            iArr[HMDeviceSource.MILI_BLED_W.ordinal()] = 40;
            iArr[HMDeviceSource.MILI_BLED_PRO.ordinal()] = 41;
            iArr[HMDeviceSource.MILI_BLED_PRO_W.ordinal()] = 42;
            iArr[HMDeviceSource.MILI_CANNES.ordinal()] = 43;
            iArr[HMDeviceSource.MILI_CANNES_W.ordinal()] = 44;
            iArr[HMDeviceSource.MILI_SOFIA.ordinal()] = 45;
            iArr[HMDeviceSource.MILI_SOFIA_W.ordinal()] = 46;
            iArr[HMDeviceSource.MILI_MADRID_HML.ordinal()] = 47;
            iArr[HMDeviceSource.MILI_PROVENCE.ordinal()] = 48;
            iArr[HMDeviceSource.MILI_PROVENCE_W.ordinal()] = 49;
            iArr[HMDeviceSource.MILI_PROVENCE_W_NFC.ordinal()] = 50;
            iArr[HMDeviceSource.MILI_ZURICH.ordinal()] = 51;
            iArr[HMDeviceSource.MILI_ZURICH_W.ordinal()] = 52;
            iArr[HMDeviceSource.MILI_VERONA.ordinal()] = 53;
            iArr[HMDeviceSource.MILI_VERONA_W.ordinal()] = 54;
            iArr[HMDeviceSource.MILI_VIENNA.ordinal()] = 55;
            iArr[HMDeviceSource.MILI_VIENNA_W.ordinal()] = 56;
            iArr[HMDeviceSource.MILI_TEIDE.ordinal()] = 57;
            iArr[HMDeviceSource.MILI_TEIDE_W.ordinal()] = 58;
            iArr[HMDeviceSource.MILI_ANDES.ordinal()] = 59;
            iArr[HMDeviceSource.MILI_ANDES_W.ordinal()] = 60;
            iArr[HMDeviceSource.MILI_OSAKA.ordinal()] = 61;
            iArr[HMDeviceSource.MILI_OSAKA_W.ordinal()] = 62;
            iArr[HMDeviceSource.MILI_PANGU.ordinal()] = 63;
            iArr[HMDeviceSource.MILI_PANGU_L.ordinal()] = 64;
            iArr[HMDeviceSource.MILI_L66.ordinal()] = 65;
            iArr[HMDeviceSource.MILI_L66_AP.ordinal()] = 66;
            iArr[HMDeviceSource.MILI_L66_I.ordinal()] = 67;
            iArr[HMDeviceSource.MILI_L66_IN.ordinal()] = 68;
            iArr[HMDeviceSource.MILI_L66_NFC.ordinal()] = 69;
            iArr[HMDeviceSource.MILI_L66_NFC_I.ordinal()] = 70;
            iArr[HMDeviceSource.MILI_L66_WE.ordinal()] = 71;
            iArr[HMDeviceSource.MILI_LEIDEN.ordinal()] = 72;
            iArr[HMDeviceSource.MILI_LEIDEN_W.ordinal()] = 73;
            iArr[HMDeviceSource.MILI_BARI.ordinal()] = 74;
            iArr[HMDeviceSource.MILI_BARI_NFC.ordinal()] = 75;
            iArr[HMDeviceSource.MILI_BARI_W.ordinal()] = 76;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        final FeatureTreeFactory featureTreeFactory = new FeatureTreeFactory();
        INSTANCE = featureTreeFactory;
        cacheMap = new WeakHashMap<>();
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.setting.pattern.FeatureTreeFactory$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceManagerApi invoke() {
                KoinComponent koinComponent = featureTreeFactory;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
    }

    private FeatureTreeFactory() {
    }

    private final DeviceManagerApi a() {
        return (DeviceManagerApi) deviceManagerApi.getValue();
    }

    private final FeatureTree b(HMDeviceSource source) {
        switch (WhenMappings.$EnumSwitchMapping$0[source.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return new LisbonFeatureTree();
            case 4:
            case 5:
            case 6:
                return new OspreyFeatureTree();
            case 7:
            case 8:
                return new VolgaFeatureTree();
            case 9:
            case 10:
            case 11:
                return new NewtonFeatureTree();
            case 12:
            case 13:
                return new LincsFeatureTree();
            case 14:
            case 15:
                return new PragueFeatureTree();
            case 16:
            case 17:
                return new OnyxFeatureTree();
            case 18:
            case 19:
                return new CorsicaFeatureTree();
            case 20:
            case 21:
                return new BlancFeatureTree();
            case 22:
            case 23:
                return new HamburgFeatureTree();
            case 24:
            case 25:
                return new BonnFeatureTree();
            case 26:
            case 27:
            case 28:
            case 29:
                return new ComoFeatureTree();
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
                return new ComoWFeatureTree();
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
                return new GT3FeatureTree();
            case 48:
            case 49:
            case 50:
                return new ProvenceFeatureTree();
            case 51:
            case 52:
            case 53:
            case 54:
                return new ZVFeatureTree();
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
                return new ViennaFeatureTree();
            case 61:
            case 62:
                return new OsakaFeatureTree();
            case 63:
            case 64:
                return new PanguFeatureTree();
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
                return new L66FeatureTree();
            case 72:
            case 73:
                return new LeidenFeatureTree();
            case 74:
            case 75:
            case 76:
                return new BariFeatureTree();
            default:
                HMDeviceSource hMDeviceSource = hmBaseDeviceSource;
                Objects.requireNonNull(hMDeviceSource);
                return new BleDeviceFeatureTree(hMDeviceSource);
        }
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public final boolean isSupportFeature(@NotNull SoftFeature feature) throws Exception {
        FeatureTree featureTreeRealCreate = realCreate();
        featureTreeRealCreate.setup();
        return featureTreeRealCreate.isSupport(feature);
    }

    @NotNull
    public final FeatureTree realCreate() throws Exception {
        HMDeviceSource boundDeviceSource = a().getBoundDeviceSource(HMDeviceType.MILI);
        hmBaseDeviceSource = boundDeviceSource;
        WeakHashMap<HMDeviceSource, FeatureTree> weakHashMap = cacheMap;
        Objects.requireNonNull(boundDeviceSource);
        FeatureTree featureTreeB = weakHashMap.get(boundDeviceSource);
        if (featureTreeB == null) {
            GT4FeatureTree.Companion companion = GT4FeatureTree.INSTANCE;
            HMDeviceSource hMDeviceSource = hmBaseDeviceSource;
            Objects.requireNonNull(hMDeviceSource);
            if (companion.isGt4Source(hMDeviceSource)) {
                HMDeviceSource hMDeviceSource2 = hmBaseDeviceSource;
                Objects.requireNonNull(hMDeviceSource2);
                featureTreeB = companion.create(hMDeviceSource2);
                if (featureTreeB == null) {
                    throw new Exception("Config error");
                }
            } else {
                HMDeviceSource hMDeviceSource3 = hmBaseDeviceSource;
                Objects.requireNonNull(hMDeviceSource3);
                featureTreeB = b(hMDeviceSource3);
            }
            HMDeviceSource hMDeviceSource4 = hmBaseDeviceSource;
            Objects.requireNonNull(hMDeviceSource4);
            weakHashMap.put(hMDeviceSource4, featureTreeB);
        }
        return featureTreeB;
    }
}
