package com.huami.bluetooth.profile.channel.module.settings.primarydata;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u0000 \u000b2\u00020\u0001:\u0001\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\n\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IPrimaryData;", "Ljava/io/Serializable;", "Ljava/io/ByteArrayOutputStream;", "bos", "", "write", "", "checkValid", "getContainDesc", "()Z", "containDesc", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public interface IPrimaryData extends Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f9870a;

    /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.settings.primarydata.IPrimaryData$a, reason: from kotlin metadata */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IPrimaryData$a;", "", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f9870a = new Companion();
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class b {
        public static boolean a(@NotNull IPrimaryData iPrimaryData) {
            return true;
        }
    }

    boolean checkValid();

    boolean getContainDesc();

    void write(@NotNull ByteArrayOutputStream bos);
}
