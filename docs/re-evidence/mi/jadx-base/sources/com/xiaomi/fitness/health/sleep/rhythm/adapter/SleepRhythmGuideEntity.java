package com.xiaomi.fitness.health.sleep.rhythm.adapter;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003JC\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/adapter/SleepRhythmGuideEntity;", "", "imageUrl", "", "title", "description", "", "title2", "description2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/CharSequence;)V", "getImageUrl", "()Ljava/lang/String;", "getTitle", "getDescription", "()Ljava/lang/CharSequence;", "getTitle2", "getDescription2", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SleepRhythmGuideEntity {

    @Nullable
    private final CharSequence description;

    @Nullable
    private final CharSequence description2;

    @NotNull
    private final String imageUrl;

    @Nullable
    private final String title;

    @Nullable
    private final String title2;

    public SleepRhythmGuideEntity(@NotNull String imageUrl, @Nullable String str, @Nullable CharSequence charSequence, @Nullable String str2, @Nullable CharSequence charSequence2) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.imageUrl = imageUrl;
        this.title = str;
        this.description = charSequence;
        this.title2 = str2;
        this.description2 = charSequence2;
    }

    public static /* synthetic */ SleepRhythmGuideEntity copy$default(SleepRhythmGuideEntity sleepRhythmGuideEntity, String str, String str2, CharSequence charSequence, String str3, CharSequence charSequence2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sleepRhythmGuideEntity.imageUrl;
        }
        if ((i & 2) != 0) {
            str2 = sleepRhythmGuideEntity.title;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            charSequence = sleepRhythmGuideEntity.description;
        }
        CharSequence charSequence3 = charSequence;
        if ((i & 8) != 0) {
            str3 = sleepRhythmGuideEntity.title2;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            charSequence2 = sleepRhythmGuideEntity.description2;
        }
        return sleepRhythmGuideEntity.copy(str, str4, charSequence3, str5, charSequence2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CharSequence getDescription() {
        return this.description;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle2() {
        return this.title2;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final CharSequence getDescription2() {
        return this.description2;
    }

    @NotNull
    public final SleepRhythmGuideEntity copy(@NotNull String imageUrl, @Nullable String title, @Nullable CharSequence description, @Nullable String title2, @Nullable CharSequence description2) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        return new SleepRhythmGuideEntity(imageUrl, title, description, title2, description2);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepRhythmGuideEntity)) {
            return false;
        }
        SleepRhythmGuideEntity sleepRhythmGuideEntity = (SleepRhythmGuideEntity) other;
        return Intrinsics.areEqual(this.imageUrl, sleepRhythmGuideEntity.imageUrl) && Intrinsics.areEqual(this.title, sleepRhythmGuideEntity.title) && Intrinsics.areEqual(this.description, sleepRhythmGuideEntity.description) && Intrinsics.areEqual(this.title2, sleepRhythmGuideEntity.title2) && Intrinsics.areEqual(this.description2, sleepRhythmGuideEntity.description2);
    }

    @Nullable
    public final CharSequence getDescription() {
        return this.description;
    }

    @Nullable
    public final CharSequence getDescription2() {
        return this.description2;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getTitle2() {
        return this.title2;
    }

    public int hashCode() {
        int iHashCode = this.imageUrl.hashCode() * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        CharSequence charSequence = this.description;
        int iHashCode3 = (iHashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        String str2 = this.title2;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CharSequence charSequence2 = this.description2;
        return iHashCode4 + (charSequence2 != null ? charSequence2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.imageUrl;
        String str2 = this.title;
        CharSequence charSequence = this.description;
        return "SleepRhythmGuideEntity(imageUrl=" + str + ", title=" + str2 + ", description=" + ((Object) charSequence) + ", title2=" + this.title2 + ", description2=" + ((Object) this.description2) + ")";
    }

    public /* synthetic */ SleepRhythmGuideEntity(String str, String str2, CharSequence charSequence, String str3, CharSequence charSequence2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : charSequence, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : charSequence2);
    }
}
