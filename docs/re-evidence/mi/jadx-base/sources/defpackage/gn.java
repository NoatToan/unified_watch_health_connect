package defpackage;

import com.huami.bluetooth.profile.channel.module.notification.NotificationModule;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lgn;", "", "Lwm;", PluginDeviceInfo.FMODEL, "()Lwm;", "Lyus;", "baseProfile", "<init>", "(Lyus;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class gn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final yus f19145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public wm f19146b;

    public gn(@NotNull yus baseProfile) {
        Intrinsics.checkNotNullParameter(baseProfile, "baseProfile");
        this.f19145a = baseProfile;
        this.f19146b = a();
    }

    public final wm a() {
        NotificationModule notificationModule;
        if (!this.f19145a.q1(NotificationModule.class) || (notificationModule = (NotificationModule) this.f19145a.i1(NotificationModule.class)) == null) {
            return null;
        }
        return notificationModule.loadApi();
    }
}
