package com.xiaomi.hm.health.device.setting.life.feature;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.bluetooth.profile.channel.module.openapp.AppPageType;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.device.setting.life.feature.health.IOpenPageListener;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/life/feature/OpenAppPageSubscriber;", "Lcom/xiaomi/hm/health/device/setting/life/feature/BleEventSubscriber;", "Lcom/huami/bluetooth/profile/channel/module/openapp/AppPageType;", DTransferConstants.PAGE, "Lkotlin/Pair;", "", "a", "", "getName", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "", "register", MiPushClient.COMMAND_UNREGISTER, "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class OpenAppPageSubscriber implements BleEventSubscriber {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static IOpenPageListener a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/life/feature/OpenAppPageSubscriber$Companion;", "", "Lcom/xiaomi/hm/health/device/setting/life/feature/health/IOpenPageListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "initListener", "sOpenPageListener", "Lcom/xiaomi/hm/health/device/setting/life/feature/health/IOpenPageListener;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void initListener(@NotNull IOpenPageListener listener) {
            OpenAppPageSubscriber.a = listener;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0005\u001aB\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000 \u0001* \u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/openapp/AppPageType;", "kotlin.jvm.PlatformType", DTransferConstants.PAGE, "Lkotlin/Pair;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<AppPageType, Pair<? extends Boolean, ? extends AppPageType>> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pair<Boolean, AppPageType> invoke(AppPageType appPageType) {
            return OpenAppPageSubscriber.this.a(appPageType);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<Boolean, AppPageType> a(AppPageType page) {
        IOpenPageListener iOpenPageListener = a;
        Pair<Boolean, AppPageType> pairOpenPage = iOpenPageListener == null ? null : iOpenPageListener.openPage(page);
        return pairOpenPage == null ? new Pair<>(Boolean.FALSE, page) : pairOpenPage;
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber
    @NotNull
    public String getName() {
        return "OpenAppPage";
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber
    public void register(@NotNull HMBaseDevice device) {
        if (device instanceof HMMiLiProDevice) {
            ((HMMiLiProDevice) device).listenDeviceOpenAppPage(new a());
        }
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber
    public void unregister(@NotNull HMBaseDevice device) {
    }
}
