package defpackage;

import com.huami.bluetooth.profile.channel.module.DialModule;
import com.miui.tsmclient.entity.CardInfo;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lt7;", "", "Lh4;", CardInfo.KEY_OWNER, "Ls7;", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class t7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final t7 f34399a = new t7();

    @Nullable
    public final s7 a(@NotNull h4 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (!owner.a(35)) {
            if (owner instanceof x7t) {
                return new a8((z8) owner);
            }
            return null;
        }
        DialModule dialModule = (DialModule) f4.c.a(owner).a(DialModule.class);
        if (dialModule != null) {
            return new c8(dialModule);
        }
        return null;
    }
}
