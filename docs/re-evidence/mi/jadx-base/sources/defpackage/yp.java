package defpackage;

import com.huami.bluetooth.profile.channel.module.activity.RealtimeActivityModule;
import com.miui.tsmclient.entity.CardInfo;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lyp;", "", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class yp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f40387a = new a(null);

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\b"}, d2 = {"Lyp$a;", "", "Lh4;", CardInfo.KEY_OWNER, "Lcq;", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final cq a(@Nullable h4 owner) {
            if (owner == null) {
                return null;
            }
            if (!owner.a(22)) {
                if (owner instanceof cq) {
                    return (cq) owner;
                }
                return null;
            }
            RealtimeActivityModule realtimeActivityModule = (RealtimeActivityModule) f4.c.a(owner).a(RealtimeActivityModule.class);
            if (realtimeActivityModule instanceof cq) {
                return realtimeActivityModule;
            }
            return null;
        }
    }
}
