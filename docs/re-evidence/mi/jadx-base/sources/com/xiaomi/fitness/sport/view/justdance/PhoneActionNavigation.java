package com.xiaomi.fitness.sport.view.justdance;

import defpackage.eoi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0015\u001a\u00020\tH\u0007J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\tHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/sport/view/justdance/PhoneActionNavigation;", "", "title", "", "command", "shortcutType", "isSwearMode", "", "totalCount", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V", "getTitle", "()Ljava/lang/String;", "getCommand", "getShortcutType", "()Z", "getTotalCount", "()I", "setTotalCount", "(I)V", "getShortcutImage", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PhoneActionNavigation {

    @NotNull
    private final String command;
    private final boolean isSwearMode;

    @NotNull
    private final String shortcutType;

    @NotNull
    private final String title;
    private int totalCount;

    public PhoneActionNavigation(@NotNull String title, @NotNull String command, @NotNull String shortcutType, boolean z, int i) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(shortcutType, "shortcutType");
        this.title = title;
        this.command = command;
        this.shortcutType = shortcutType;
        this.isSwearMode = z;
        this.totalCount = i;
    }

    public static /* synthetic */ PhoneActionNavigation copy$default(PhoneActionNavigation phoneActionNavigation, String str, String str2, String str3, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = phoneActionNavigation.title;
        }
        if ((i2 & 2) != 0) {
            str2 = phoneActionNavigation.command;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            str3 = phoneActionNavigation.shortcutType;
        }
        String str5 = str3;
        if ((i2 & 8) != 0) {
            z = phoneActionNavigation.isSwearMode;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            i = phoneActionNavigation.totalCount;
        }
        return phoneActionNavigation.copy(str, str4, str5, z2, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCommand() {
        return this.command;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getShortcutType() {
        return this.shortcutType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsSwearMode() {
        return this.isSwearMode;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getTotalCount() {
        return this.totalCount;
    }

    @NotNull
    public final PhoneActionNavigation copy(@NotNull String title, @NotNull String command, @NotNull String shortcutType, boolean isSwearMode, int totalCount) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(shortcutType, "shortcutType");
        return new PhoneActionNavigation(title, command, shortcutType, isSwearMode, totalCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhoneActionNavigation)) {
            return false;
        }
        PhoneActionNavigation phoneActionNavigation = (PhoneActionNavigation) other;
        return Intrinsics.areEqual(this.title, phoneActionNavigation.title) && Intrinsics.areEqual(this.command, phoneActionNavigation.command) && Intrinsics.areEqual(this.shortcutType, phoneActionNavigation.shortcutType) && this.isSwearMode == phoneActionNavigation.isSwearMode && this.totalCount == phoneActionNavigation.totalCount;
    }

    @NotNull
    public final String getCommand() {
        return this.command;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final int getShortcutImage() {
        String str = this.shortcutType;
        switch (str.hashCode()) {
            case -1933930845:
                if (str.equals("PHONE_FTUE_FINISH")) {
                    return eoi.t0;
                }
                return -1;
            case -1832505687:
                if (str.equals("SHORTCUT_SONG_CREDITS")) {
                    return eoi.G0;
                }
                return -1;
            case -1809595671:
                if (str.equals("SHORTCUT_TOGGLE_SUBTITLES")) {
                    return eoi.I0;
                }
                return -1;
            case -1693683596:
                if (str.equals("SHORTCUT_SWAP_GENDER")) {
                    return eoi.J0;
                }
                return -1;
            case -1531943513:
                if (str.equals("SHORTCUT_SWAP_LYRICS")) {
                    return eoi.G0;
                }
                return -1;
            case -1515960908:
                if (str.equals("SHORTCUT_TOGGLE_AUTOSCROLLING")) {
                    return eoi.x0;
                }
                return -1;
            case -1502766086:
                if (str.equals("SHORTCUT_GOTO_SONGSTAB")) {
                    return eoi.v0;
                }
                return -1;
            case -1410860358:
                if (str.equals("SHORTCUT_SWEAT_ACTIVATION")) {
                    return this.isSwearMode ? eoi.L0 : eoi.K0;
                }
                return -1;
            case -1408195264:
                if (str.equals("SHORTCUT_BACK")) {
                    return eoi.n0;
                }
                return -1;
            case -1407681706:
                if (str.equals("SHORTCUT_SHOW")) {
                    return eoi.E0;
                }
                return -1;
            case -1407679016:
                if (str.equals("SHORTCUT_SKIP")) {
                    return eoi.F0;
                }
                return -1;
            case -1025836395:
                if (str.equals("SHORTCUT_PLAYLIST_DELETE_SONG")) {
                    return eoi.q0;
                }
                return -1;
            case -1022423598:
                if (str.equals("SHORTCUT_VIDEO_RESTART")) {
                    return eoi.C0;
                }
                return -1;
            case -914593260:
                if (str.equals("SHORTCUT_DONT_SHOW_ANYMORE")) {
                    return eoi.w0;
                }
                return -1;
            case -902209300:
                if (str.equals("SHORTCUT_PLAYLIST_MOVE_SONG_RIGHT")) {
                    return eoi.D0;
                }
                return -1;
            case -182560634:
                if (str.equals("SHORTCUT_GAME_CREDITS")) {
                    return eoi.M0;
                }
                return -1;
            case -162272758:
                if (str.equals("SHORTCUT_DELETE_DANCERCARD")) {
                    return eoi.q0;
                }
                return -1;
            case -111199150:
                if (str.equals("SHORTCUT_PLAYLIST_RENAME")) {
                    return eoi.A0;
                }
                return -1;
            case -49574539:
                if (str.equals("SHORTCUT_FAVORITE")) {
                    return eoi.s0;
                }
                return -1;
            case 18132587:
                if (str.equals("SHORTCUT_SORTING")) {
                    return eoi.H0;
                }
                return -1;
            case 28848785:
                if (str.equals("SHORTCUT_TOGGLE_VIDEO_PLAYBACK")) {
                    return eoi.z0;
                }
                return -1;
            case 267013122:
                if (str.equals("SHORTCUT_ACTIVATE_DANCERCARD")) {
                    return eoi.H0;
                }
                return -1;
            case 473625115:
                if (str.equals("SHORTCUT_SAVE_PLAYLIST")) {
                    return eoi.B0;
                }
                return -1;
            case 524903191:
                if (str.equals("SHORTCUT_PLAYLIST_MOVE_SONG_LEFT")) {
                    return eoi.y0;
                }
                return -1;
            case 1108793061:
                if (str.equals("SHORTCUT_CHANGE_DANCERCARD")) {
                    return eoi.p0;
                }
                return -1;
            case 1551282157:
                if (str.equals("SHORTCUT_DELETE_PLAYLIST")) {
                    return eoi.r0;
                }
                return -1;
            case 1879847095:
                if (str.equals("SHORTCUT_GOTO_PLAYLISTSTAB")) {
                    return eoi.u0;
                }
                return -1;
            case 1899960031:
                if (str.equals("SHORTCUT_TOGGLE_COOP")) {
                    return eoi.o0;
                }
                return -1;
            default:
                return -1;
        }
    }

    @NotNull
    public final String getShortcutType() {
        return this.shortcutType;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public int hashCode() {
        return (((((((this.title.hashCode() * 31) + this.command.hashCode()) * 31) + this.shortcutType.hashCode()) * 31) + Boolean.hashCode(this.isSwearMode)) * 31) + Integer.hashCode(this.totalCount);
    }

    public final boolean isSwearMode() {
        return this.isSwearMode;
    }

    public final void setTotalCount(int i) {
        this.totalCount = i;
    }

    @NotNull
    public String toString() {
        return "PhoneActionNavigation(title=" + this.title + ", command=" + this.command + ", shortcutType=" + this.shortcutType + ", isSwearMode=" + this.isSwearMode + ", totalCount=" + this.totalCount + ")";
    }
}
