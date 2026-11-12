package defpackage;

import com.huami.bluetooth.profile.channel.module.health.HeartHealthApi;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: nf, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lnf;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/huami/bluetooth/profile/channel/module/health/HeartHealthApi;", "heartHealth", "Lcom/huami/bluetooth/profile/channel/module/health/HeartHealthApi;", PluginDeviceInfo.FMODEL, "()Lcom/huami/bluetooth/profile/channel/module/health/HeartHealthApi;", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/health/HeartHealthApi;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class HealthModule {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    @NotNull
    public final HeartHealthApi heartHealth;

    public HealthModule(@NotNull HeartHealthApi heartHealth) {
        Intrinsics.checkNotNullParameter(heartHealth, "heartHealth");
        this.heartHealth = heartHealth;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final HeartHealthApi getHeartHealth() {
        return this.heartHealth;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HealthModule) && Intrinsics.areEqual(this.heartHealth, ((HealthModule) other).heartHealth);
    }

    public int hashCode() {
        return this.heartHealth.hashCode();
    }

    @NotNull
    public String toString() {
        return "HealthModule(heartHealth=" + this.heartHealth + ')';
    }
}
