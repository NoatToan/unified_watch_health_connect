package com.xiaomi.hm.health.bt.profile.sport;

import com.huami.bluetooth.profile.channel.module.sport.SportSupplementPanelModule;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.profile.base.HMBaseProfile;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/sport/SportSupplementPanelApiFactory;", "", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class SportSupplementPanelApiFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/sport/SportSupplementPanelApiFactory$Companion;", "", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "gattPeripheral", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "Lcom/xiaomi/hm/health/bt/profile/sport/ISportSupplementPanelApi;", "create", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sport/SportSupplementPanelModule;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<SportSupplementPanelModule> {
            public final /* synthetic */ HMBaseDevice a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HMBaseDevice hMBaseDevice) {
                super(0);
                this.a = hMBaseDevice;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SportSupplementPanelModule invoke() {
                return (SportSupplementPanelModule) this.a.getChannelModule(SportSupplementPanelModule.class);
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final ISportSupplementPanelApi create(@NotNull GattPeripheral gattPeripheral, @NotNull HMBaseDevice device) throws Exception {
            Object objM3845constructorimpl;
            SportSupplementPanelModule sportSupplementPanelModule;
            if (SportSupplementPanelApiFactoryKt.hasCharacteristic(gattPeripheral, HMBaseProfile.UUID_SERVICE_MILI_SERVICE, HMSportProfile.UUID_CHARACTERISTIC_SPORT)) {
                return new HMSportController(gattPeripheral);
            }
            if (!device.supportModule(SportSupplementPanelModule.class)) {
                return null;
            }
            try {
                Result.Companion companion = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl((SportSupplementPanelModule) device.getChannelModule(SportSupplementPanelModule.class));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                objM3845constructorimpl = null;
            }
            if (((SportSupplementPanelModule) objM3845constructorimpl) == null || (sportSupplementPanelModule = (SportSupplementPanelModule) device.getChannelModule(SportSupplementPanelModule.class)) == null) {
                return null;
            }
            int iQueryVersion = sportSupplementPanelModule.queryVersion();
            if (iQueryVersion == 1) {
                return new SportSupplementPanelApiImpl(new a(device));
            }
            throw new Exception(Intrinsics.stringPlus("Compatible version ", Integer.valueOf(iQueryVersion)));
        }
    }
}
