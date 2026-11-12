package com.huami.bluetooth.profile.channel.module;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&J \u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH&¨\u0006\u000e"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/ChannelModuleStoreOwner;", "", "Lcom/huami/bluetooth/profile/channel/module/ChannelModuleStore;", "getChannelModuleStore", "Lcom/huami/bluetooth/profile/channel/module/ChannelModuleFactory;", "getChannelModuleFactory", "", "moduleId", "", "supportModule", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "clazz", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface ChannelModuleStoreOwner {
    @Nullable
    ChannelModuleFactory getChannelModuleFactory();

    @Nullable
    ChannelModuleStore getChannelModuleStore();

    boolean supportModule(int moduleId);

    <T extends BaseModule> boolean supportModule(@NotNull Class<T> clazz);
}
