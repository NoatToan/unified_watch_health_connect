package com.huami.training.db.po;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.training.dto.DisplayMode;
import com.huami.training.dto.TargetMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Entity
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b.\u0010/J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003J[\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\nHÆ\u0001J\t\u0010\u0014\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\f\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001dR\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010\u001dR\u001b\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001b\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"Lcom/huami/training/db/po/Subject;", "", "", "component1", "component2", "component3", "component4", "component5", "Lcom/huami/training/dto/TargetMode;", "component6", "Lcom/huami/training/dto/DisplayMode;", "component7", "id", "title", MessengerShareContentUtility.SUBTITLE, "imageUrl", "targetUrl", "targetMode", "displayMode", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "getTitle", "c", "getSubtitle", GoogleApiAvailabilityLight.a, "getImageUrl", "e", "getTargetUrl", "f", "Lcom/huami/training/dto/TargetMode;", "getTargetMode", "()Lcom/huami/training/dto/TargetMode;", "g", "Lcom/huami/training/dto/DisplayMode;", "getDisplayMode", "()Lcom/huami/training/dto/DisplayMode;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huami/training/dto/TargetMode;Lcom/huami/training/dto/DisplayMode;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Subject {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @PrimaryKey
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final String subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final String imageUrl;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final String targetUrl;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private final TargetMode targetMode;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    private final DisplayMode displayMode;

    public Subject(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable TargetMode targetMode, @Nullable DisplayMode displayMode) {
        this.id = str;
        this.title = str2;
        this.subtitle = str3;
        this.imageUrl = str4;
        this.targetUrl = str5;
        this.targetMode = targetMode;
        this.displayMode = displayMode;
    }

    public static /* synthetic */ Subject copy$default(Subject subject, String str, String str2, String str3, String str4, String str5, TargetMode targetMode, DisplayMode displayMode, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subject.id;
        }
        if ((i & 2) != 0) {
            str2 = subject.title;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = subject.subtitle;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = subject.imageUrl;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = subject.targetUrl;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            targetMode = subject.targetMode;
        }
        TargetMode targetMode2 = targetMode;
        if ((i & 64) != 0) {
            displayMode = subject.displayMode;
        }
        return subject.copy(str, str6, str7, str8, str9, targetMode2, displayMode);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTargetUrl() {
        return this.targetUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final TargetMode getTargetMode() {
        return this.targetMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final DisplayMode getDisplayMode() {
        return this.displayMode;
    }

    @NotNull
    public final Subject copy(@NotNull String id, @Nullable String title, @Nullable String subtitle, @Nullable String imageUrl, @Nullable String targetUrl, @Nullable TargetMode targetMode, @Nullable DisplayMode displayMode) {
        return new Subject(id, title, subtitle, imageUrl, targetUrl, targetMode, displayMode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Subject)) {
            return false;
        }
        Subject subject = (Subject) other;
        return Intrinsics.areEqual(this.id, subject.id) && Intrinsics.areEqual(this.title, subject.title) && Intrinsics.areEqual(this.subtitle, subject.subtitle) && Intrinsics.areEqual(this.imageUrl, subject.imageUrl) && Intrinsics.areEqual(this.targetUrl, subject.targetUrl) && this.targetMode == subject.targetMode && this.displayMode == subject.displayMode;
    }

    @Nullable
    public final DisplayMode getDisplayMode() {
        return this.displayMode;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Nullable
    public final TargetMode getTargetMode() {
        return this.targetMode;
    }

    @Nullable
    public final String getTargetUrl() {
        return this.targetUrl;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageUrl;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.targetUrl;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        TargetMode targetMode = this.targetMode;
        int iHashCode6 = (iHashCode5 + (targetMode == null ? 0 : targetMode.hashCode())) * 31;
        DisplayMode displayMode = this.displayMode;
        return iHashCode6 + (displayMode != null ? displayMode.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Subject(id=" + this.id + ", title=" + ((Object) this.title) + ", subtitle=" + ((Object) this.subtitle) + ", imageUrl=" + ((Object) this.imageUrl) + ", targetUrl=" + ((Object) this.targetUrl) + ", targetMode=" + this.targetMode + ", displayMode=" + this.displayMode + ')';
    }
}
