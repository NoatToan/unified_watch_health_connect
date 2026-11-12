package com.huami.bluetooth.profile.channel.module.hearing.entity;

import com.xiaomi.hm.health.device.event.StatEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J!\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/hearing/entity/HearingScenes;", "", "", "toString", "Lcom/huami/bluetooth/profile/channel/module/hearing/entity/HearingFavorite;", "component1", "Lcom/huami/bluetooth/profile/channel/module/hearing/entity/HearingSelectedModes;", "component2", StatEvent.MINE_KINGKONG_C_FAVORITE_VALUE, "modes", "copy", "", "hashCode", "other", "", "equals", "a", "Lcom/huami/bluetooth/profile/channel/module/hearing/entity/HearingFavorite;", "getFavorite", "()Lcom/huami/bluetooth/profile/channel/module/hearing/entity/HearingFavorite;", "setFavorite", "(Lcom/huami/bluetooth/profile/channel/module/hearing/entity/HearingFavorite;)V", "b", "Lcom/huami/bluetooth/profile/channel/module/hearing/entity/HearingSelectedModes;", "getModes", "()Lcom/huami/bluetooth/profile/channel/module/hearing/entity/HearingSelectedModes;", "setModes", "(Lcom/huami/bluetooth/profile/channel/module/hearing/entity/HearingSelectedModes;)V", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/hearing/entity/HearingFavorite;Lcom/huami/bluetooth/profile/channel/module/hearing/entity/HearingSelectedModes;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HearingScenes {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private HearingFavorite favorite;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private HearingSelectedModes modes;

    public HearingScenes(@Nullable HearingFavorite hearingFavorite, @Nullable HearingSelectedModes hearingSelectedModes) {
        this.favorite = hearingFavorite;
        this.modes = hearingSelectedModes;
    }

    public static /* synthetic */ HearingScenes copy$default(HearingScenes hearingScenes, HearingFavorite hearingFavorite, HearingSelectedModes hearingSelectedModes, int i, Object obj) {
        if ((i & 1) != 0) {
            hearingFavorite = hearingScenes.favorite;
        }
        if ((i & 2) != 0) {
            hearingSelectedModes = hearingScenes.modes;
        }
        return hearingScenes.copy(hearingFavorite, hearingSelectedModes);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HearingFavorite getFavorite() {
        return this.favorite;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HearingSelectedModes getModes() {
        return this.modes;
    }

    @NotNull
    public final HearingScenes copy(@Nullable HearingFavorite favorite, @Nullable HearingSelectedModes modes) {
        return new HearingScenes(favorite, modes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HearingScenes)) {
            return false;
        }
        HearingScenes hearingScenes = (HearingScenes) other;
        return Intrinsics.areEqual(this.favorite, hearingScenes.favorite) && Intrinsics.areEqual(this.modes, hearingScenes.modes);
    }

    @Nullable
    public final HearingFavorite getFavorite() {
        return this.favorite;
    }

    @Nullable
    public final HearingSelectedModes getModes() {
        return this.modes;
    }

    public int hashCode() {
        HearingFavorite hearingFavorite = this.favorite;
        int iHashCode = (hearingFavorite == null ? 0 : hearingFavorite.hashCode()) * 31;
        HearingSelectedModes hearingSelectedModes = this.modes;
        return iHashCode + (hearingSelectedModes != null ? hearingSelectedModes.hashCode() : 0);
    }

    public final void setFavorite(@Nullable HearingFavorite hearingFavorite) {
        this.favorite = hearingFavorite;
    }

    public final void setModes(@Nullable HearingSelectedModes hearingSelectedModes) {
        this.modes = hearingSelectedModes;
    }

    @NotNull
    public String toString() {
        return "HearingScenes{favorite=" + this.favorite + ", modes=" + this.modes + '}';
    }
}
