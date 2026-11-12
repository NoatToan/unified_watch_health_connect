package com.xiaomi.hm.health.bt.model;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J\u0006\u0010\u0003\u001a\u00020\u0002J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J-\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\n\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u000b\u0010\u001b\"\u0004\b\u001f\u0010\u001d¨\u0006\""}, d2 = {"Lcom/xiaomi/hm/health/bt/model/LanguageComBination;", "", "", "isSupportDeviceSettings", "", "Lcom/xiaomi/hm/health/bt/model/HMLanguage;", "component1", "component2", "component3", "languageList", "isContainLanguageFeature", "isContainLanguageGroup", "copy", "", "toString", "", "hashCode", "other", "equals", "a", "Ljava/util/List;", "getLanguageList", "()Ljava/util/List;", "setLanguageList", "(Ljava/util/List;)V", "b", "Z", "()Z", "setContainLanguageFeature", "(Z)V", "c", "setContainLanguageGroup", "<init>", "(Ljava/util/List;ZZ)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class LanguageComBination {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private List<HMLanguage> languageList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private boolean isContainLanguageFeature;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private boolean isContainLanguageGroup;

    public LanguageComBination() {
        this(null, false, false, 7, null);
    }

    public LanguageComBination(@NotNull List<HMLanguage> list, boolean z, boolean z2) {
        this.languageList = list;
        this.isContainLanguageFeature = z;
        this.isContainLanguageGroup = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LanguageComBination copy$default(LanguageComBination languageComBination, List list, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = languageComBination.languageList;
        }
        if ((i & 2) != 0) {
            z = languageComBination.isContainLanguageFeature;
        }
        if ((i & 4) != 0) {
            z2 = languageComBination.isContainLanguageGroup;
        }
        return languageComBination.copy(list, z, z2);
    }

    @NotNull
    public final List<HMLanguage> component1() {
        return this.languageList;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsContainLanguageFeature() {
        return this.isContainLanguageFeature;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsContainLanguageGroup() {
        return this.isContainLanguageGroup;
    }

    @NotNull
    public final LanguageComBination copy(@NotNull List<HMLanguage> languageList, boolean isContainLanguageFeature, boolean isContainLanguageGroup) {
        return new LanguageComBination(languageList, isContainLanguageFeature, isContainLanguageGroup);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LanguageComBination)) {
            return false;
        }
        LanguageComBination languageComBination = (LanguageComBination) other;
        return Intrinsics.areEqual(this.languageList, languageComBination.languageList) && this.isContainLanguageFeature == languageComBination.isContainLanguageFeature && this.isContainLanguageGroup == languageComBination.isContainLanguageGroup;
    }

    @NotNull
    public final List<HMLanguage> getLanguageList() {
        return this.languageList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = this.languageList.hashCode() * 31;
        boolean z = this.isContainLanguageFeature;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.isContainLanguageGroup;
        return i + (z2 ? 1 : z2);
    }

    public final boolean isContainLanguageFeature() {
        return this.isContainLanguageFeature;
    }

    public final boolean isContainLanguageGroup() {
        return this.isContainLanguageGroup;
    }

    public final boolean isSupportDeviceSettings() {
        return this.isContainLanguageFeature || this.isContainLanguageGroup;
    }

    public final void setContainLanguageFeature(boolean z) {
        this.isContainLanguageFeature = z;
    }

    public final void setContainLanguageGroup(boolean z) {
        this.isContainLanguageGroup = z;
    }

    public final void setLanguageList(@NotNull List<HMLanguage> list) {
        this.languageList = list;
    }

    @NotNull
    public String toString() {
        return "LanguageComBination(languageList=" + this.languageList + ", isContainLanguageFeature=" + this.isContainLanguageFeature + ", isContainLanguageGroup=" + this.isContainLanguageGroup + ')';
    }

    public /* synthetic */ LanguageComBination(List list, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
    }
}
