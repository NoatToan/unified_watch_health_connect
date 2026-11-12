package com.huami.module.homepage.sync.manager;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J1\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0013\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017¨\u0006&"}, d2 = {"Lcom/huami/module/homepage/sync/manager/RomEntry;", "", "", "component1", "", "component2", "component3", "component4", "needUpdate", "lastRomVersion", "updateMessage", "supportAutoUpdate", "copy", "toString", "", "hashCode", "other", "equals", "a", "Z", "getNeedUpdate", "()Z", "setNeedUpdate", "(Z)V", "b", "Ljava/lang/String;", "getLastRomVersion", "()Ljava/lang/String;", "setLastRomVersion", "(Ljava/lang/String;)V", "c", "getUpdateMessage", "setUpdateMessage", GoogleApiAvailabilityLight.a, "getSupportAutoUpdate", "setSupportAutoUpdate", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Z)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class RomEntry {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private boolean needUpdate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private String lastRomVersion;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private String updateMessage;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private boolean supportAutoUpdate;

    public RomEntry() {
        this(false, null, null, false, 15, null);
    }

    public RomEntry(boolean z, @NotNull String str, @NotNull String str2, boolean z2) {
        this.needUpdate = z;
        this.lastRomVersion = str;
        this.updateMessage = str2;
        this.supportAutoUpdate = z2;
    }

    public static /* synthetic */ RomEntry copy$default(RomEntry romEntry, boolean z, String str, String str2, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = romEntry.needUpdate;
        }
        if ((i & 2) != 0) {
            str = romEntry.lastRomVersion;
        }
        if ((i & 4) != 0) {
            str2 = romEntry.updateMessage;
        }
        if ((i & 8) != 0) {
            z2 = romEntry.supportAutoUpdate;
        }
        return romEntry.copy(z, str, str2, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getNeedUpdate() {
        return this.needUpdate;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLastRomVersion() {
        return this.lastRomVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUpdateMessage() {
        return this.updateMessage;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getSupportAutoUpdate() {
        return this.supportAutoUpdate;
    }

    @NotNull
    public final RomEntry copy(boolean needUpdate, @NotNull String lastRomVersion, @NotNull String updateMessage, boolean supportAutoUpdate) {
        return new RomEntry(needUpdate, lastRomVersion, updateMessage, supportAutoUpdate);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RomEntry)) {
            return false;
        }
        RomEntry romEntry = (RomEntry) other;
        return this.needUpdate == romEntry.needUpdate && Intrinsics.areEqual(this.lastRomVersion, romEntry.lastRomVersion) && Intrinsics.areEqual(this.updateMessage, romEntry.updateMessage) && this.supportAutoUpdate == romEntry.supportAutoUpdate;
    }

    @NotNull
    public final String getLastRomVersion() {
        return this.lastRomVersion;
    }

    public final boolean getNeedUpdate() {
        return this.needUpdate;
    }

    public final boolean getSupportAutoUpdate() {
        return this.supportAutoUpdate;
    }

    @NotNull
    public final String getUpdateMessage() {
        return this.updateMessage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public int hashCode() {
        boolean z = this.needUpdate;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int iHashCode = ((((r0 * 31) + this.lastRomVersion.hashCode()) * 31) + this.updateMessage.hashCode()) * 31;
        boolean z2 = this.supportAutoUpdate;
        return iHashCode + (z2 ? 1 : z2);
    }

    public final void setLastRomVersion(@NotNull String str) {
        this.lastRomVersion = str;
    }

    public final void setNeedUpdate(boolean z) {
        this.needUpdate = z;
    }

    public final void setSupportAutoUpdate(boolean z) {
        this.supportAutoUpdate = z;
    }

    public final void setUpdateMessage(@NotNull String str) {
        this.updateMessage = str;
    }

    @NotNull
    public String toString() {
        return "RomEntry(needUpdate=" + this.needUpdate + ", lastRomVersion=" + this.lastRomVersion + ", updateMessage=" + this.updateMessage + ", supportAutoUpdate=" + this.supportAutoUpdate + ")";
    }

    public /* synthetic */ RomEntry(boolean z, String str, String str2, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? false : z2);
    }
}
