package defpackage;

import com.huami.bluetooth.profile.channel.module.notification.NotificationModule;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Ldn;", "", "Lyus;", "baseProfile", "Lwm;", PluginDeviceInfo.FMODEL, "(Lyus;)Lwm;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class dn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final dn f15704a = new dn();

    @Nullable
    public final wm a(@NotNull yus baseProfile) {
        NotificationModule notificationModule;
        Intrinsics.checkNotNullParameter(baseProfile, "baseProfile");
        if (!baseProfile.q1(NotificationModule.class) || (notificationModule = (NotificationModule) baseProfile.i1(NotificationModule.class)) == null) {
            return null;
        }
        return notificationModule.loadApi();
    }
}
