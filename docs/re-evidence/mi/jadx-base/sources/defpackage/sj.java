package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.homeroom.model.Home;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0005\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lsj;", "", "", Home.JSON_KEY_ADDRESS, "Lj9;", PluginDeviceInfo.FMODEL, "keyStore", "", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class sj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final sj f33689a = new sj();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final ConcurrentHashMap<String, EncryptKeyStore> f33690b = new ConcurrentHashMap<>();

    @Nullable
    public final EncryptKeyStore a(@NotNull String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        return f33690b.get(address);
    }

    public final void a(@NotNull String address, @NotNull EncryptKeyStore keyStore) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(keyStore, "keyStore");
        t5t.d("KeyStoreManager", "Update key store while auth success");
        f33690b.put(address, keyStore);
    }
}
