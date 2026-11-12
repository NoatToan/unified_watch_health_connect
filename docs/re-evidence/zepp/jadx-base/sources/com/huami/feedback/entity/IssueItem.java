package com.huami.feedback.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.gson.annotations.SerializedName;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Parcelize
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b$\u0010%J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u0012\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0002HÖ\u0001R\u001c\u0010\b\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\t\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\n\u001a\u00020\u00068\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/huami/feedback/entity/IssueItem;", "Landroid/os/Parcelable;", "", "component1", "", "component2", "Lcom/huami/feedback/entity/AdditionalInfoData;", "component3", "id", "title", "additionalInfo", "copy", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", DataCacher.j, "", "writeToParcel", "a", LogUtil.I, "getId", "()I", "b", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "c", "Lcom/huami/feedback/entity/AdditionalInfoData;", "getAdditionalInfo", "()Lcom/huami/feedback/entity/AdditionalInfoData;", "<init>", "(ILjava/lang/String;Lcom/huami/feedback/entity/AdditionalInfoData;)V", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class IssueItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<IssueItem> CREATOR = new Creator();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("id")
    private final int id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("additionalInfo")
    @NotNull
    private final AdditionalInfoData additionalInfo;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class Creator implements Parcelable.Creator<IssueItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final IssueItem createFromParcel(@NotNull Parcel parcel) {
            return new IssueItem(parcel.readInt(), parcel.readString(), AdditionalInfoData.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final IssueItem[] newArray(int i) {
            return new IssueItem[i];
        }
    }

    public IssueItem(int i, @NotNull String str, @NotNull AdditionalInfoData additionalInfoData) {
        this.id = i;
        this.title = str;
        this.additionalInfo = additionalInfoData;
    }

    public static /* synthetic */ IssueItem copy$default(IssueItem issueItem, int i, String str, AdditionalInfoData additionalInfoData, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = issueItem.id;
        }
        if ((i2 & 2) != 0) {
            str = issueItem.title;
        }
        if ((i2 & 4) != 0) {
            additionalInfoData = issueItem.additionalInfo;
        }
        return issueItem.copy(i, str, additionalInfoData);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final AdditionalInfoData getAdditionalInfo() {
        return this.additionalInfo;
    }

    @NotNull
    public final IssueItem copy(int id, @NotNull String title, @NotNull AdditionalInfoData additionalInfo) {
        return new IssueItem(id, title, additionalInfo);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IssueItem)) {
            return false;
        }
        IssueItem issueItem = (IssueItem) other;
        return this.id == issueItem.id && Intrinsics.areEqual(this.title, issueItem.title) && Intrinsics.areEqual(this.additionalInfo, issueItem.additionalInfo);
    }

    @NotNull
    public final AdditionalInfoData getAdditionalInfo() {
        return this.additionalInfo;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((this.id * 31) + this.title.hashCode()) * 31) + this.additionalInfo.hashCode();
    }

    @NotNull
    public String toString() {
        return "IssueItem(id=" + this.id + ", title=" + this.title + ", additionalInfo=" + this.additionalInfo + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
        this.additionalInfo.writeToParcel(parcel, flags);
    }
}
