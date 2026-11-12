package com.xiaomi.hm.health.device.setting.pattern.impl.gt4;

import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.setting.SoftFeature;
import com.xiaomi.hm.health.device.setting.pattern.FeatureTree;
import com.xiaomi.hm.health.device.setting.pattern.impl.gt3.GT3FeatureTree;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.component.KoinComponent;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00072\u00020\u00012\u00020\u0002:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/pattern/impl/gt4/GT4FeatureTree;", "Lcom/xiaomi/hm/health/device/setting/pattern/impl/gt3/GT3FeatureTree;", "Lorg/koin/core/component/KoinComponent;", "", "setup", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public class GT4FeatureTree extends GT3FeatureTree implements KoinComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/pattern/impl/gt4/GT4FeatureTree$Companion;", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "", "isGt4Source", "Lcom/xiaomi/hm/health/device/setting/pattern/FeatureTree;", "create", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[HMDeviceSource.values().length];
                iArr[HMDeviceSource.MILI_FLORENCE.ordinal()] = 1;
                iArr[HMDeviceSource.MILI_FLORENCE_W.ordinal()] = 2;
                iArr[HMDeviceSource.MILI_BERLIN.ordinal()] = 3;
                iArr[HMDeviceSource.MILI_BERLIN_W.ordinal()] = 4;
                iArr[HMDeviceSource.MILI_LILLE.ordinal()] = 5;
                iArr[HMDeviceSource.MILI_LILLE_W.ordinal()] = 6;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final FeatureTree create(@NotNull HMDeviceSource source) {
            switch (WhenMappings.$EnumSwitchMapping$0[source.ordinal()]) {
                case 1:
                case 2:
                    return new Florence(source == HMDeviceSource.MILI_FLORENCE_W);
                case 3:
                case 4:
                    return new Berlin(source == HMDeviceSource.MILI_BERLIN_W);
                case 5:
                case 6:
                    return new Lille(source == HMDeviceSource.MILI_LILLE_W);
                default:
                    return null;
            }
        }

        public final boolean isGt4Source(@NotNull HMDeviceSource source) {
            return CollectionsKt__CollectionsKt.arrayListOf(HMDeviceSource.MILI_FLORENCE, HMDeviceSource.MILI_FLORENCE_W, HMDeviceSource.MILI_BERLIN, HMDeviceSource.MILI_BERLIN_W, HMDeviceSource.MILI_LILLE, HMDeviceSource.MILI_LILLE_W).contains(source);
        }
    }

    @Override // com.xiaomi.hm.health.device.setting.pattern.impl.gt3.GT3FeatureTree, com.xiaomi.hm.health.device.setting.pattern.FeatureTree
    public void setup() {
        super.setup();
        putFeature(SoftFeature.SCHEDULE);
    }
}
