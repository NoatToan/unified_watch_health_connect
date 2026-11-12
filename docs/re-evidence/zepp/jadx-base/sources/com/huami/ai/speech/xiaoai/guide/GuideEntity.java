package com.huami.ai.speech.xiaoai.guide;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J1\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/huami/ai/speech/xiaoai/guide/GuideEntity;", "", "", "component1", "component2", "component3", "component4", "id", "headIcon", "query", "backgroundIcon", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "getHeadIcon", "c", "getQuery", GoogleApiAvailabilityLight.a, "getBackgroundIcon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class GuideEntity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String headIcon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String query;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String backgroundIcon;

    public GuideEntity(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        this.id = str;
        this.headIcon = str2;
        this.query = str3;
        this.backgroundIcon = str4;
    }

    public static /* synthetic */ GuideEntity copy$default(GuideEntity guideEntity, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = guideEntity.id;
        }
        if ((i & 2) != 0) {
            str2 = guideEntity.headIcon;
        }
        if ((i & 4) != 0) {
            str3 = guideEntity.query;
        }
        if ((i & 8) != 0) {
            str4 = guideEntity.backgroundIcon;
        }
        return guideEntity.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHeadIcon() {
        return this.headIcon;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBackgroundIcon() {
        return this.backgroundIcon;
    }

    @NotNull
    public final GuideEntity copy(@NotNull String id, @NotNull String headIcon, @NotNull String query, @NotNull String backgroundIcon) {
        return new GuideEntity(id, headIcon, query, backgroundIcon);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuideEntity)) {
            return false;
        }
        GuideEntity guideEntity = (GuideEntity) other;
        return Intrinsics.areEqual(this.id, guideEntity.id) && Intrinsics.areEqual(this.headIcon, guideEntity.headIcon) && Intrinsics.areEqual(this.query, guideEntity.query) && Intrinsics.areEqual(this.backgroundIcon, guideEntity.backgroundIcon);
    }

    @NotNull
    public final String getBackgroundIcon() {
        return this.backgroundIcon;
    }

    @NotNull
    public final String getHeadIcon() {
        return this.headIcon;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getQuery() {
        return this.query;
    }

    public int hashCode() {
        return (((((this.id.hashCode() * 31) + this.headIcon.hashCode()) * 31) + this.query.hashCode()) * 31) + this.backgroundIcon.hashCode();
    }

    @NotNull
    public String toString() {
        return "GuideEntity(id=" + this.id + ", headIcon=" + this.headIcon + ", query=" + this.query + ", backgroundIcon=" + this.backgroundIcon + ')';
    }

    public /* synthetic */ GuideEntity(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, str3, (i & 8) != 0 ? "" : str4);
    }
}
