package com.xiaomi.hm.health.bt.device;

import android.bluetooth.BluetoothDevice;
import com.facebook.appevents.integrity.IntegrityManager;
import com.huami.bluetooth.utils.DefaultVarDelegate;
import com.xiaomi.hm.health.bt.BluetoothContext;
import com.xiaomi.hm.health.bt.device.smartwatch.HMSmartWatchDevice;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMDeviceFactory;", "", "Landroid/bluetooth/BluetoothDevice;", "device", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "createDevice", "", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface HMDeviceFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR+\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMDeviceFactory$Companion;", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceFactory;", "<set-?>", "c", "Lcom/huami/bluetooth/utils/DefaultVarDelegate;", "getFactory", "()Lcom/xiaomi/hm/health/bt/device/HMDeviceFactory;", "setFactory", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceFactory;)V", "factory", "<init>", "()V", "DefaultFactory", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ KProperty<Object>[] b = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "factory", "getFactory()Lcom/xiaomi/hm/health/bt/device/HMDeviceFactory;"))};
        public static final /* synthetic */ Companion a = new Companion();

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private static final DefaultVarDelegate<HMDeviceFactory> factory = new DefaultVarDelegate<>(new DefaultFactory());

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMDeviceFactory$Companion$DefaultFactory;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceFactory;", "Landroid/bluetooth/BluetoothDevice;", "device", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "createDevice", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
        public static final class DefaultFactory implements HMDeviceFactory {

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[HMDeviceSource.values().length];
                    iArr[HMDeviceSource.MILI_PRO.ordinal()] = 1;
                    iArr[HMDeviceSource.MILI_PRO_I.ordinal()] = 2;
                    iArr[HMDeviceSource.MILI_ROCKY.ordinal()] = 3;
                    iArr[HMDeviceSource.MILI_NFC.ordinal()] = 4;
                    iArr[HMDeviceSource.MILI_QINLING.ordinal()] = 5;
                    iArr[HMDeviceSource.MILI_WUHAN.ordinal()] = 6;
                    iArr[HMDeviceSource.MILI_CINCO.ordinal()] = 7;
                    iArr[HMDeviceSource.MILI_CINCO_L.ordinal()] = 8;
                    iArr[HMDeviceSource.MILI_RIO.ordinal()] = 9;
                    iArr[HMDeviceSource.MILI_CHONGQING.ordinal()] = 10;
                    iArr[HMDeviceSource.MILI_TEMPO.ordinal()] = 11;
                    iArr[HMDeviceSource.MILI_BEATS.ordinal()] = 12;
                    iArr[HMDeviceSource.MILI_BEATS_P.ordinal()] = 13;
                    iArr[HMDeviceSource.MILI_BEATS_W.ordinal()] = 14;
                    iArr[HMDeviceSource.MILI_PEYTO.ordinal()] = 15;
                    iArr[HMDeviceSource.MILI_PEYTO_L.ordinal()] = 16;
                    iArr[HMDeviceSource.MILI_PEYTO_WL.ordinal()] = 17;
                    iArr[HMDeviceSource.MILI_DTH.ordinal()] = 18;
                    iArr[HMDeviceSource.MILI_DTH_W.ordinal()] = 19;
                    iArr[HMDeviceSource.MILI_PYH.ordinal()] = 20;
                    iArr[HMDeviceSource.MILI_PYH_W.ordinal()] = 21;
                    iArr[HMDeviceSource.MILI_TONLESAP.ordinal()] = 22;
                    iArr[HMDeviceSource.MILI_TONLESAP_L.ordinal()] = 23;
                    iArr[HMDeviceSource.MILI_TONLESAP_O.ordinal()] = 24;
                    iArr[HMDeviceSource.MILI_TONLESAP_OL.ordinal()] = 25;
                    iArr[HMDeviceSource.MILI_FALCON.ordinal()] = 26;
                    iArr[HMDeviceSource.MILI_FALCON_W.ordinal()] = 27;
                    iArr[HMDeviceSource.MILI_FALCON_L.ordinal()] = 28;
                    iArr[HMDeviceSource.MILI_FALCON_WL.ordinal()] = 29;
                    iArr[HMDeviceSource.MILI_FALCON_DISNEY.ordinal()] = 30;
                    iArr[HMDeviceSource.MILI_HAWK.ordinal()] = 31;
                    iArr[HMDeviceSource.MILI_HAWK_W.ordinal()] = 32;
                    iArr[HMDeviceSource.MILI_HAWK_L.ordinal()] = 33;
                    iArr[HMDeviceSource.MILI_HAWK_WL.ordinal()] = 34;
                    iArr[HMDeviceSource.MILI_HAWK_SWK.ordinal()] = 35;
                    iArr[HMDeviceSource.MILI_HAWK_SWK_W.ordinal()] = 36;
                    iArr[HMDeviceSource.MILI_KESTREL.ordinal()] = 37;
                    iArr[HMDeviceSource.MILI_KESTREL_W.ordinal()] = 38;
                    iArr[HMDeviceSource.MILI_KESTREL_L.ordinal()] = 39;
                    iArr[HMDeviceSource.MILI_KESTREL_WL.ordinal()] = 40;
                    iArr[HMDeviceSource.MILI_VULTURE.ordinal()] = 41;
                    iArr[HMDeviceSource.MILI_PRAGUE.ordinal()] = 42;
                    iArr[HMDeviceSource.MILI_PRAGUE_W.ordinal()] = 43;
                    iArr[HMDeviceSource.TIMEX_SIMPLY_GPS.ordinal()] = 44;
                    iArr[HMDeviceSource.TIMEX_CROSS_FIT_ENTRY.ordinal()] = 45;
                    iArr[HMDeviceSource.TIMEX_CROSS_FIT_GPS.ordinal()] = 46;
                    iArr[HMDeviceSource.MILI_ATHENS.ordinal()] = 47;
                    iArr[HMDeviceSource.TIMEX_HEARTFIT_ZONE.ordinal()] = 48;
                    iArr[HMDeviceSource.TIMEX_FALCON.ordinal()] = 49;
                    iArr[HMDeviceSource.TIMEX_HAWK.ordinal()] = 50;
                    iArr[HMDeviceSource.TIMEX_KESTREL.ordinal()] = 51;
                    iArr[HMDeviceSource.SMART_WATCH_EVEREST_2.ordinal()] = 52;
                    iArr[HMDeviceSource.SMART_WATCH_EVEREST_2W.ordinal()] = 53;
                    iArr[HMDeviceSource.SMART_WATCH_EVEREST_2S.ordinal()] = 54;
                    iArr[HMDeviceSource.SMART_WATCH_EVEREST_2SW.ordinal()] = 55;
                    iArr[HMDeviceSource.SMART_WATCH_EVEREST_2_STAR_WAR.ordinal()] = 56;
                    iArr[HMDeviceSource.MILI_AMAZFIT.ordinal()] = 57;
                    iArr[HMDeviceSource.OTHER_BM.ordinal()] = 58;
                    iArr[HMDeviceSource.SHOES.ordinal()] = 59;
                    iArr[HMDeviceSource.SHOES_CHILD.ordinal()] = 60;
                    iArr[HMDeviceSource.SHOES_LIGHT.ordinal()] = 61;
                    iArr[HMDeviceSource.SHOES_SPRANDI.ordinal()] = 62;
                    iArr[HMDeviceSource.SHOES_MARS.ordinal()] = 63;
                    iArr[HMDeviceSource.WEIGHT_BODYFAT.ordinal()] = 64;
                    iArr[HMDeviceSource.WEIGHT_BFS.ordinal()] = 65;
                    iArr[HMDeviceSource.WEIGHT.ordinal()] = 66;
                    iArr[HMDeviceSource.WEIGHT_SCALE2.ordinal()] = 67;
                    iArr[HMDeviceSource.OTHER_BOLT.ordinal()] = 68;
                    iArr[HMDeviceSource.OTHER_BOLT_SECOND.ordinal()] = 69;
                    iArr[HMDeviceSource.OTHER_MOZART.ordinal()] = 70;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // com.xiaomi.hm.health.bt.device.HMDeviceFactory
            @Nullable
            public HMBaseDevice createDevice(@NotNull String str, @NotNull HMDeviceSource hMDeviceSource) {
                return DefaultImpls.createDevice(this, str, hMDeviceSource);
            }

            @Override // com.xiaomi.hm.health.bt.device.HMDeviceFactory
            @Nullable
            public HMBaseDevice createDevice(@Nullable BluetoothDevice device, @NotNull HMDeviceSource source) {
                if (source == HMDeviceSource.VDEVICE) {
                    return null;
                }
                switch (WhenMappings.$EnumSwitchMapping$0[source.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
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
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                        return new HMMiLiProDevice(BluetoothContext.getContext(), device);
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                        return new HMSmartWatchDevice(BluetoothContext.getContext(), device);
                    case 57:
                        return new HMAmazfitDevice(BluetoothContext.getContext(), device);
                    case 58:
                        return new HMBMDevice(BluetoothContext.getContext(), device);
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                        return new HMShoesDevice(BluetoothContext.getContext(), device);
                    case 63:
                        return new HMNormandyDevice(BluetoothContext.getContext(), device);
                    case 64:
                    case 65:
                        return new HMWeightBfsDevice(BluetoothContext.getContext(), device);
                    case 66:
                    case 67:
                        return new HMWeightDevice(BluetoothContext.getContext(), device);
                    case 68:
                    case 69:
                        return new HMBoltClassicDevice(BluetoothContext.getContext(), device);
                    case 70:
                        return new MozartDevice(device);
                    default:
                        return new HMMiLiDevice(BluetoothContext.getContext(), device);
                }
            }
        }

        private Companion() {
        }

        @NotNull
        public final HMDeviceFactory getFactory() {
            return factory.getValue(this, b[0]);
        }

        public final void setFactory(@NotNull HMDeviceFactory hMDeviceFactory) {
            factory.setValue(this, b[0], hMDeviceFactory);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @Nullable
        public static HMBaseDevice createDevice(@NotNull HMDeviceFactory hMDeviceFactory, @NotNull String str, @NotNull HMDeviceSource hMDeviceSource) {
            return hMDeviceFactory.createDevice(GattUtils.getRemoteDevice(str), hMDeviceSource);
        }
    }

    @Nullable
    HMBaseDevice createDevice(@Nullable BluetoothDevice device, @NotNull HMDeviceSource source);

    @Nullable
    HMBaseDevice createDevice(@NotNull String address, @NotNull HMDeviceSource source);
}
