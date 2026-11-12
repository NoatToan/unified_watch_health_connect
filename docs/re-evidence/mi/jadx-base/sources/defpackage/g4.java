package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.homeroom.model.Home;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¨\u0006\r"}, d2 = {"Lg4;", "", "", "key", "Lcom/huami/bluetooth/profile/channel/module/a;", "viewModel", "", PluginDeviceInfo.FMODEL, "(Ljava/lang/String;Lcom/huami/bluetooth/profile/channel/module/a;)V", "Lr3;", "channelApi", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class g4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f18570b = new a(null);

    @NotNull
    public static final ConcurrentHashMap<String, g4> c = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final HashMap<String, com.huami.bluetooth.profile.channel.module.a> f18571a = new HashMap<>();

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lg4$a;", "", "", Home.JSON_KEY_ADDRESS, "Lg4;", PluginDeviceInfo.FMODEL, "Ljava/util/concurrent/ConcurrentHashMap;", "stores", "Ljava/util/concurrent/ConcurrentHashMap;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final g4 a(@NotNull String address) {
            g4 g4Var;
            Intrinsics.checkNotNullParameter(address, "address");
            g4 g4Var2 = (g4) g4.c.get(address);
            if (g4Var2 != null) {
                return g4Var2;
            }
            synchronized (g4.c) {
                try {
                    g4Var = (g4) g4.c.get(address);
                    if (g4Var == null) {
                        g4Var = new g4();
                    }
                    Intrinsics.checkNotNullExpressionValue(g4Var, "stores[address] ?: ChannelModuleStore()");
                    g4.c.put(address, g4Var);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return g4Var;
        }
    }

    public final void a(@NotNull String key, @NotNull com.huami.bluetooth.profile.channel.module.a viewModel) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.f18571a.put(key, viewModel);
    }

    @Nullable
    public final com.huami.bluetooth.profile.channel.module.a a(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f18571a.get(key);
    }

    public final void a(@NotNull r3 channelApi) {
        Intrinsics.checkNotNullParameter(channelApi, "channelApi");
        Collection<com.huami.bluetooth.profile.channel.module.a> collectionValues = this.f18571a.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "mMap.values");
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((com.huami.bluetooth.profile.channel.module.a) it.next()).setChannelApi(channelApi);
        }
    }
}
