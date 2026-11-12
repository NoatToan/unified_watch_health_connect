package com.huami.bluetooth.profile.channel.module;

import androidx.exifinterface.media.ExifInterface;
import com.huami.bluetooth.profile.channel.ChannelApi;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/ChannelModuleFactory;", "", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "clazz", "create", "(Ljava/lang/Class;)Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "a", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "getApi", "()Lcom/huami/bluetooth/profile/channel/ChannelApi;", "api", "<init>", "(Lcom/huami/bluetooth/profile/channel/ChannelApi;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ChannelModuleFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ChannelApi api;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/ChannelModuleFactory$Companion;", "", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "clazz", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "channelController", "createModule", "(Ljava/lang/Class;Lcom/huami/bluetooth/profile/channel/ChannelApi;)Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <T extends BaseModule> T createModule(@NotNull Class<T> clazz, @NotNull ChannelApi channelController) {
            return clazz.getConstructor(ChannelApi.class).newInstance(channelController);
        }
    }

    public ChannelModuleFactory(@NotNull ChannelApi channelApi) {
        this.api = channelApi;
    }

    @NotNull
    public final <T extends BaseModule> T create(@NotNull Class<T> clazz) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        T tNewInstance = clazz.getConstructor(ChannelApi.class).newInstance(this.api);
        tNewInstance.init();
        return tNewInstance;
    }

    @NotNull
    public final ChannelApi getApi() {
        return this.api;
    }
}
