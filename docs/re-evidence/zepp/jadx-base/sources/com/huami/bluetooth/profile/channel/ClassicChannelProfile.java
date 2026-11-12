package com.huami.bluetooth.profile.channel;

import android.bluetooth.BluetoothDevice;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.impl.ClassicPeripheral;
import com.huami.bluetooth.profile.channel.model.BleChannelLink;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.BuiltInModule;
import com.huami.bluetooth.profile.channel.module.ChannelModuleFactory;
import com.huami.bluetooth.profile.channel.module.ChannelModuleProvider;
import com.huami.bluetooth.profile.channel.module.ChannelModuleStore;
import com.huami.bluetooth.profile.channel.module.ChannelModuleStoreOwner;
import com.huami.bluetooth.profile.channel.module.annotation.ChannelModule;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.HMBleConfig;
import com.xiaomi.hm.health.bt.classic.ITransport;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.profile.base.ChannelApiDecorate;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 12\u00020\u0001:\u00011B\u001f\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019¢\u0006\u0004\b/\u00100J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J'\u0010\f\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\t*\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\f\u0010\rJ\n\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J \u0010\u0014\u001a\u00020\u0002\"\b\b\u0000\u0010\t*\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R*\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u001c\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00062"}, d2 = {"Lcom/huami/bluetooth/profile/channel/ClassicChannelProfile;", "Lcom/huami/bluetooth/profile/channel/module/ChannelModuleStoreOwner;", "", "initChannel", "isSupportChannel", "isBaseOnHuamiOS", "", "deInitChannel", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "clazz", "getChannelModule", "(Ljava/lang/Class;)Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "Lcom/huami/bluetooth/profile/channel/module/ChannelModuleStore;", "getChannelModuleStore", "Lcom/huami/bluetooth/profile/channel/module/ChannelModuleFactory;", "getChannelModuleFactory", "", "moduleId", "supportModule", "Landroid/bluetooth/BluetoothDevice;", "a", "Landroid/bluetooth/BluetoothDevice;", "bluetoothDevice", "Lkotlin/Function0;", "Lcom/xiaomi/hm/health/bt/classic/ITransport;", "b", "Lkotlin/jvm/functions/Function0;", NotificationCompat.CATEGORY_TRANSPORT, "Lcom/huami/bluetooth/profile/channel/model/BleChannelLink;", "c", "Lcom/huami/bluetooth/profile/channel/model/BleChannelLink;", "getBleChannelLink", "()Lcom/huami/bluetooth/profile/channel/model/BleChannelLink;", "setBleChannelLink", "(Lcom/huami/bluetooth/profile/channel/model/BleChannelLink;)V", "bleChannelLink", "Lcom/xiaomi/hm/health/bt/profile/base/ChannelApiDecorate;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/bt/profile/base/ChannelApiDecorate;", "channelApiDecorate", "e", "isSupportChannelFun", "()Lkotlin/jvm/functions/Function0;", "setSupportChannelFun", "(Lkotlin/jvm/functions/Function0;)V", "<init>", "(Landroid/bluetooth/BluetoothDevice;Lkotlin/jvm/functions/Function0;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ClassicChannelProfile implements ChannelModuleStoreOwner {

    @NotNull
    private static final String f = "ClassicChannelProfile";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final BluetoothDevice bluetoothDevice;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function0<ITransport> transport;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private BleChannelLink bleChannelLink;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final ChannelApiDecorate channelApiDecorate = new ChannelApiDecorate(null);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private Function0<Boolean> isSupportChannelFun;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "创建ble channel失败";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClassicChannelProfile(@NotNull BluetoothDevice bluetoothDevice, @NotNull Function0<? extends ITransport> function0) {
        this.bluetoothDevice = bluetoothDevice;
        this.transport = function0;
        this.bleChannelLink = new BleChannelLink(new ClassicPeripheral(function0), bluetoothDevice.getAddress());
    }

    public final void deInitChannel() {
        this.channelApiDecorate.unDecorate();
    }

    @NotNull
    public final BleChannelLink getBleChannelLink() {
        return this.bleChannelLink;
    }

    @Nullable
    public final <T extends BaseModule> T getChannelModule(@NotNull Class<T> clazz) {
        return (T) ChannelModuleProvider.INSTANCE.of(this).get(clazz);
    }

    @Override // com.huami.bluetooth.profile.channel.module.ChannelModuleStoreOwner
    @Nullable
    public ChannelModuleFactory getChannelModuleFactory() {
        return new ChannelModuleFactory(this.channelApiDecorate);
    }

    @Override // com.huami.bluetooth.profile.channel.module.ChannelModuleStoreOwner
    @Nullable
    public ChannelModuleStore getChannelModuleStore() {
        return ChannelModuleStore.INSTANCE.getModuleStore(this.bluetoothDevice.getAddress());
    }

    public final boolean initChannel() {
        this.bleChannelLink = new BleChannelLink(new ClassicPeripheral(this.transport), this.bluetoothDevice.getAddress());
        if (!isSupportChannel()) {
            return false;
        }
        Channel channelCreate = BleChannelFactory.INSTANCE.create(this.bleChannelLink);
        if (channelCreate == null) {
            HMLog.error$default(f, null, null, a.a, 6, null);
            return false;
        }
        this.channelApiDecorate.decorate(ChannelFactory.INSTANCE.createChannel(channelCreate, new ChannelCallbackHolder(), HMBleConfig.APP_ID));
        getChannelModuleStore().updateChannel(this.channelApiDecorate);
        return true;
    }

    public final boolean isBaseOnHuamiOS() {
        return this.bleChannelLink.isBaseOnHuamiOS();
    }

    public final boolean isSupportChannel() {
        Function0<Boolean> function0 = this.isSupportChannelFun;
        Boolean boolInvoke = function0 == null ? null : function0.invoke();
        return boolInvoke == null ? this.bleChannelLink.isSupportChannel() : boolInvoke.booleanValue();
    }

    @Nullable
    public final Function0<Boolean> isSupportChannelFun() {
        return this.isSupportChannelFun;
    }

    public final void setBleChannelLink(@NotNull BleChannelLink bleChannelLink) {
        this.bleChannelLink = bleChannelLink;
    }

    public final void setSupportChannelFun(@Nullable Function0<Boolean> function0) {
        this.isSupportChannelFun = function0;
    }

    @Override // com.huami.bluetooth.profile.channel.module.ChannelModuleStoreOwner
    public boolean supportModule(int moduleId) {
        if (this.channelApiDecorate.getVersion().getVersionCode() != 2) {
            return false;
        }
        BuiltInModule builtInModule = (BuiltInModule) getChannelModule(BuiltInModule.class);
        if (builtInModule == null) {
            Debug.fi("BuiltInModule", "BuiltInModule is null while check " + moduleId + " if supported by device");
            return false;
        }
        boolean zSupportModule = builtInModule.supportModule(moduleId);
        Debug.fi("BuiltInModule", "Is " + moduleId + " support? " + zSupportModule);
        return zSupportModule;
    }

    @Override // com.huami.bluetooth.profile.channel.module.ChannelModuleStoreOwner
    public <T extends BaseModule> boolean supportModule(@NotNull Class<T> clazz) {
        try {
            ChannelModule channelModule = (ChannelModule) clazz.getAnnotation(ChannelModule.class);
            if (channelModule == null) {
                Debug.fi(f, Intrinsics.stringPlus(clazz.getCanonicalName(), " has no ChannelModule annotation"));
                return false;
            }
            return supportModule(channelModule.id());
        } catch (Exception e) {
            Debug.fi(f, Intrinsics.stringPlus("Check if support module exception:", e));
            return false;
        }
    }
}
