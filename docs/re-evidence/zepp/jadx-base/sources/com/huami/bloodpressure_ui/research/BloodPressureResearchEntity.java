package com.huami.bloodpressure_ui.research;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003JE\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018¨\u0006 "}, d2 = {"Lcom/huami/bloodpressure_ui/research/BloodPressureResearchEntity;", "", "", "component1", "component2", "component3", "component4", "component5", "component6", "title", "desc", "author", "researchStatus", "linkUrl", "userAction", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getDesc", "getAuthor", "getResearchStatus", "getLinkUrl", "getUserAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BloodPressureResearchEntity {

    @NotNull
    private final String author;

    @NotNull
    private final String desc;

    @NotNull
    private final String linkUrl;

    @NotNull
    private final String researchStatus;

    @NotNull
    private final String title;

    @NotNull
    private final String userAction;

    public BloodPressureResearchEntity(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        this.title = str;
        this.desc = str2;
        this.author = str3;
        this.researchStatus = str4;
        this.linkUrl = str5;
        this.userAction = str6;
    }

    public static /* synthetic */ BloodPressureResearchEntity copy$default(BloodPressureResearchEntity bloodPressureResearchEntity, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bloodPressureResearchEntity.title;
        }
        if ((i & 2) != 0) {
            str2 = bloodPressureResearchEntity.desc;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = bloodPressureResearchEntity.author;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = bloodPressureResearchEntity.researchStatus;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = bloodPressureResearchEntity.linkUrl;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = bloodPressureResearchEntity.userAction;
        }
        return bloodPressureResearchEntity.copy(str, str7, str8, str9, str10, str6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAuthor() {
        return this.author;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getResearchStatus() {
        return this.researchStatus;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLinkUrl() {
        return this.linkUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUserAction() {
        return this.userAction;
    }

    @NotNull
    public final BloodPressureResearchEntity copy(@NotNull String title, @NotNull String desc, @NotNull String author, @NotNull String researchStatus, @NotNull String linkUrl, @NotNull String userAction) {
        return new BloodPressureResearchEntity(title, desc, author, researchStatus, linkUrl, userAction);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BloodPressureResearchEntity)) {
            return false;
        }
        BloodPressureResearchEntity bloodPressureResearchEntity = (BloodPressureResearchEntity) other;
        return Intrinsics.areEqual(this.title, bloodPressureResearchEntity.title) && Intrinsics.areEqual(this.desc, bloodPressureResearchEntity.desc) && Intrinsics.areEqual(this.author, bloodPressureResearchEntity.author) && Intrinsics.areEqual(this.researchStatus, bloodPressureResearchEntity.researchStatus) && Intrinsics.areEqual(this.linkUrl, bloodPressureResearchEntity.linkUrl) && Intrinsics.areEqual(this.userAction, bloodPressureResearchEntity.userAction);
    }

    @NotNull
    public final String getAuthor() {
        return this.author;
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    public final String getLinkUrl() {
        return this.linkUrl;
    }

    @NotNull
    public final String getResearchStatus() {
        return this.researchStatus;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getUserAction() {
        return this.userAction;
    }

    public int hashCode() {
        return (((((((((this.title.hashCode() * 31) + this.desc.hashCode()) * 31) + this.author.hashCode()) * 31) + this.researchStatus.hashCode()) * 31) + this.linkUrl.hashCode()) * 31) + this.userAction.hashCode();
    }

    @NotNull
    public String toString() {
        return "BloodPressureResearchEntity(title=" + this.title + ", desc=" + this.desc + ", author=" + this.author + ", researchStatus=" + this.researchStatus + ", linkUrl=" + this.linkUrl + ", userAction=" + this.userAction + ")";
    }
}
