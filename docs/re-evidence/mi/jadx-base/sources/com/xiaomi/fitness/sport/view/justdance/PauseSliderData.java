package com.xiaomi.fitness.sport.view.justdance;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000b\"\u0004\b\u0014\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/sport/view/justdance/PauseSliderData;", "", "title", "", "isEnabled", "", "command", "coachImage", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "()Z", "setEnabled", "(Z)V", "getCommand", "setCommand", "getCoachImage", "setCoachImage", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PauseSliderData {

    @NotNull
    private String coachImage;

    @NotNull
    private String command;
    private boolean isEnabled;

    @NotNull
    private String title;

    public PauseSliderData() {
        this(null, false, null, null, 15, null);
    }

    public static /* synthetic */ PauseSliderData copy$default(PauseSliderData pauseSliderData, String str, boolean z, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pauseSliderData.title;
        }
        if ((i & 2) != 0) {
            z = pauseSliderData.isEnabled;
        }
        if ((i & 4) != 0) {
            str2 = pauseSliderData.command;
        }
        if ((i & 8) != 0) {
            str3 = pauseSliderData.coachImage;
        }
        return pauseSliderData.copy(str, z, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCommand() {
        return this.command;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCoachImage() {
        return this.coachImage;
    }

    @NotNull
    public final PauseSliderData copy(@NotNull String title, boolean isEnabled, @NotNull String command, @NotNull String coachImage) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(coachImage, "coachImage");
        return new PauseSliderData(title, isEnabled, command, coachImage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PauseSliderData)) {
            return false;
        }
        PauseSliderData pauseSliderData = (PauseSliderData) other;
        return Intrinsics.areEqual(this.title, pauseSliderData.title) && this.isEnabled == pauseSliderData.isEnabled && Intrinsics.areEqual(this.command, pauseSliderData.command) && Intrinsics.areEqual(this.coachImage, pauseSliderData.coachImage);
    }

    @NotNull
    public final String getCoachImage() {
        return this.coachImage;
    }

    @NotNull
    public final String getCommand() {
        return this.command;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((this.title.hashCode() * 31) + Boolean.hashCode(this.isEnabled)) * 31) + this.command.hashCode()) * 31) + this.coachImage.hashCode();
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void setCoachImage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.coachImage = str;
    }

    public final void setCommand(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.command = str;
    }

    public final void setEnabled(boolean z) {
        this.isEnabled = z;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    @NotNull
    public String toString() {
        return "PauseSliderData(title=" + this.title + ", isEnabled=" + this.isEnabled + ", command=" + this.command + ", coachImage=" + this.coachImage + ")";
    }

    public PauseSliderData(@NotNull String title, boolean z, @NotNull String command, @NotNull String coachImage) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(coachImage, "coachImage");
        this.title = title;
        this.isEnabled = z;
        this.command = command;
        this.coachImage = coachImage;
    }

    public /* synthetic */ PauseSliderData(String str, boolean z, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3);
    }
}
