package com.huami.bluetooth.profile.channel.module.health;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0004\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/health/HealthModule;", "", "Lcom/huami/bluetooth/profile/channel/module/health/HeartHealthApi;", "component1", "heartHealth", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/huami/bluetooth/profile/channel/module/health/HeartHealthApi;", "getHeartHealth", "()Lcom/huami/bluetooth/profile/channel/module/health/HeartHealthApi;", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/health/HeartHealthApi;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HealthModule {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final HeartHealthApi heartHealth;

    public HealthModule(@NotNull HeartHealthApi heartHealthApi) {
        this.heartHealth = heartHealthApi;
    }

    public static /* synthetic */ HealthModule copy$default(HealthModule healthModule, HeartHealthApi heartHealthApi, int i, Object obj) {
        if ((i & 1) != 0) {
            heartHealthApi = healthModule.heartHealth;
        }
        return healthModule.copy(heartHealthApi);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HeartHealthApi getHeartHealth() {
        return this.heartHealth;
    }

    @NotNull
    public final HealthModule copy(@NotNull HeartHealthApi heartHealth) {
        return new HealthModule(heartHealth);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HealthModule) && Intrinsics.areEqual(this.heartHealth, ((HealthModule) other).heartHealth);
    }

    @NotNull
    public final HeartHealthApi getHeartHealth() {
        return this.heartHealth;
    }

    public int hashCode() {
        return this.heartHealth.hashCode();
    }

    @NotNull
    public String toString() {
        return "HealthModule(heartHealth=" + this.heartHealth + ')';
    }
}
