package com.huami.watchfacesstore.ext;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.huami.watchfacesstore.api.HomeApi;
import com.huami.watchfacesstore.device.DeviceConfigManager;
import com.huami.watchfacesstore.device.channel.DeviceInfo;
import com.huami.watchfacesstore.device.channel.IBlueToothChannel;
import com.huami.watchfacesstore.device.channel.IDeviceManager;
import com.huami.watchfacesstore.di.WFUserInfo;
import com.huami.watchfacesstore.navigation.WFNavigation;
import com.huami.watchfacesstore.repo.WatchFaceSettingRepo;
import com.huami.watchfacesstore.repo.WatchFaceStatusRepo;
import com.huami.watchfacesstore.room.WatchFaceDataBase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.context.GlobalContext;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0001\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\u0082\b¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u0006\u0010\b\u001a\u00020\u0007\u001a\u0006\u0010\n\u001a\u00020\t\u001a\u0006\u0010\f\u001a\u00020\u000b\u001a\u0006\u0010\u000e\u001a\u00020\r\u001a\u0006\u0010\u0010\u001a\u00020\u000f\u001a\u0006\u0010\u0012\u001a\u00020\u0011\u001a\u0006\u0010\u0014\u001a\u00020\u0013\u001a\b\u0010\u0016\u001a\u00020\u0015H\u0000\"\u0013\u0010\u001a\u001a\u00020\u00178F@\u0006¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "a", "()Ljava/lang/Object;", "Landroid/content/Context;", "getAppContext", "Lcom/huami/watchfacesstore/device/channel/DeviceInfo;", "getDeviceInfo", "Lcom/huami/watchfacesstore/device/channel/IDeviceManager;", "getDeviceManager", "Lcom/huami/watchfacesstore/device/DeviceConfigManager;", "getDeviceConfigManager", "Lcom/huami/watchfacesstore/api/HomeApi;", "getHomeApi", "Lcom/huami/watchfacesstore/device/channel/IBlueToothChannel;", "getBleChannel", "Lcom/huami/watchfacesstore/navigation/WFNavigation;", "getWFNavigation", "Lcom/huami/watchfacesstore/repo/WatchFaceStatusRepo;", "getWatchFaceStatusRepo", "Lcom/huami/watchfacesstore/room/WatchFaceDataBase;", "getDataBase", "Lcom/huami/watchfacesstore/repo/WatchFaceSettingRepo;", "getSettingRepo", "Lcom/huami/watchfacesstore/di/WFUserInfo;", "getUserInfo", "()Lcom/huami/watchfacesstore/di/WFUserInfo;", "userInfo", "lib_release"}, k = 2, mv = {1, 5, 1})
public final class KoinExtKt {
    private static final /* synthetic */ <T> T a() {
        Scope rootScope = GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) rootScope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
    }

    @NotNull
    public static final Context getAppContext() {
        return (Context) GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(Context.class), null, null);
    }

    @NotNull
    public static final IBlueToothChannel getBleChannel() {
        return (IBlueToothChannel) GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(IBlueToothChannel.class), null, null);
    }

    @NotNull
    public static final WatchFaceDataBase getDataBase() {
        return (WatchFaceDataBase) GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(WatchFaceDataBase.class), null, null);
    }

    @NotNull
    public static final DeviceConfigManager getDeviceConfigManager() {
        return (DeviceConfigManager) GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(DeviceConfigManager.class), null, null);
    }

    @NotNull
    public static final DeviceInfo getDeviceInfo() {
        return (DeviceInfo) GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(DeviceInfo.class), null, null);
    }

    @NotNull
    public static final IDeviceManager getDeviceManager() {
        return (IDeviceManager) GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(IDeviceManager.class), null, null);
    }

    @NotNull
    public static final HomeApi getHomeApi() {
        return (HomeApi) GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(HomeApi.class), null, null);
    }

    @NotNull
    public static final WatchFaceSettingRepo getSettingRepo() {
        return (WatchFaceSettingRepo) GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(WatchFaceSettingRepo.class), null, null);
    }

    @NotNull
    public static final WFUserInfo getUserInfo() {
        return (WFUserInfo) GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(WFUserInfo.class), null, null);
    }

    @NotNull
    public static final WFNavigation getWFNavigation() {
        return (WFNavigation) GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(WFNavigation.class), null, null);
    }

    @NotNull
    public static final WatchFaceStatusRepo getWatchFaceStatusRepo() {
        return (WatchFaceStatusRepo) GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(WatchFaceStatusRepo.class), null, null);
    }
}
