package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.onetrack.c.q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lc4;", "", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class c4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f4904a = new a(null);

    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\f"}, d2 = {"Lc4$a;", "", "Lq3;", "channel", "Lw3;", "callbackHolder", "", q.f13858b, "Lr3;", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final r3 a(@NotNull q3 channel, @NotNull w3 callbackHolder, int appId) {
            Intrinsics.checkNotNullParameter(channel, "channel");
            Intrinsics.checkNotNullParameter(callbackHolder, "callbackHolder");
            int versionCode = channel.c().getVersionCode();
            if (versionCode == 1) {
                return new t3(channel, callbackHolder);
            }
            if (versionCode == 2) {
                return new u3(channel, callbackHolder, appId);
            }
            throw new Exception("不支持的Channel版本:" + channel.c());
        }
    }
}
