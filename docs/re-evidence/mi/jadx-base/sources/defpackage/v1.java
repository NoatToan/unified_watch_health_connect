package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lv1;", "", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f36362a = new a(null);

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lv1$a;", "", "Ly1;", "bleChannelLink", "Lq3;", PluginDeviceInfo.FMODEL, "", "tag", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {

        /* JADX INFO: renamed from: v1$a$a, reason: collision with other inner class name */
        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
        public static final class C1121a extends Lambda implements Function0<String> {
            public final /* synthetic */ ChannelVersion t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1121a(ChannelVersion channelVersion) {
                super(0);
                this.t = channelVersion;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "不支持的channel版本:" + this.t;
            }
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final q3 a(@NotNull BleChannelLink bleChannelLink) {
            q3 w1Var;
            Intrinsics.checkNotNullParameter(bleChannelLink, "bleChannelLink");
            ChannelVersion channelVersionC = bleChannelLink.c();
            int versionCode = channelVersionC.getVersionCode();
            if (versionCode == 1) {
                w1Var = new w1(bleChannelLink);
            } else {
                if (versionCode != 2) {
                    le.c("BleChannelFactory", new C1121a(channelVersionC));
                    return null;
                }
                w1Var = new x1(bleChannelLink);
            }
            return w1Var;
        }
    }
}
