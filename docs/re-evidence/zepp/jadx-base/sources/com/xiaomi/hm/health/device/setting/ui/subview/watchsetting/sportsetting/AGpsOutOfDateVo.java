package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting;

import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J(\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0004R\u001b\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/AGpsOutOfDateVo;", "", "", "component1", "()Ljava/lang/Boolean;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;", "component2", "enable", "time", "copy", "(Ljava/lang/Boolean;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;)Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/AGpsOutOfDateVo;", "", "toString", "", "hashCode", "other", "equals", "a", "Ljava/lang/Boolean;", "getEnable", "b", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;", "getTime", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;", "<init>", "(Ljava/lang/Boolean;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AGpsOutOfDateVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private final Boolean enable;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final Time time;

    /* JADX WARN: Multi-variable type inference failed */
    public AGpsOutOfDateVo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public AGpsOutOfDateVo(@Nullable Boolean bool, @Nullable Time time) {
        this.enable = bool;
        this.time = time;
    }

    public static /* synthetic */ AGpsOutOfDateVo copy$default(AGpsOutOfDateVo aGpsOutOfDateVo, Boolean bool, Time time, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = aGpsOutOfDateVo.enable;
        }
        if ((i & 2) != 0) {
            time = aGpsOutOfDateVo.time;
        }
        return aGpsOutOfDateVo.copy(bool, time);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getEnable() {
        return this.enable;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Time getTime() {
        return this.time;
    }

    @NotNull
    public final AGpsOutOfDateVo copy(@Nullable Boolean enable, @Nullable Time time) {
        return new AGpsOutOfDateVo(enable, time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AGpsOutOfDateVo)) {
            return false;
        }
        AGpsOutOfDateVo aGpsOutOfDateVo = (AGpsOutOfDateVo) other;
        return Intrinsics.areEqual(this.enable, aGpsOutOfDateVo.enable) && Intrinsics.areEqual(this.time, aGpsOutOfDateVo.time);
    }

    @Nullable
    public final Boolean getEnable() {
        return this.enable;
    }

    @Nullable
    public final Time getTime() {
        return this.time;
    }

    public int hashCode() {
        Boolean bool = this.enable;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Time time = this.time;
        return iHashCode + (time != null ? time.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AGpsOutOfDateVo(enable=" + this.enable + ", time=" + this.time + ")";
    }

    public /* synthetic */ AGpsOutOfDateVo(Boolean bool, Time time, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : time);
    }
}
