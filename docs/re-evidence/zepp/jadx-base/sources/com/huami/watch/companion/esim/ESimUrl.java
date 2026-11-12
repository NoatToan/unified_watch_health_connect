package com.huami.watch.companion.esim;

import android.os.Parcel;
import android.os.Parcelable;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Parcelize
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u0011\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bHÖ\u0001R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u001a¨\u0006#"}, d2 = {"Lcom/huami/watch/companion/esim/ESimUrl;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "separateUrl", "shareUrl", "faqUrl", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", DataCacher.j, "", "writeToParcel", "a", "Ljava/lang/String;", "getSeparateUrl", "()Ljava/lang/String;", "setSeparateUrl", "(Ljava/lang/String;)V", "b", "getShareUrl", "c", "getFaqUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "esim_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ESimUrl implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ESimUrl> CREATOR = new Creator();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private String separateUrl;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String shareUrl;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String faqUrl;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class Creator implements Parcelable.Creator<ESimUrl> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ESimUrl createFromParcel(@NotNull Parcel parcel) {
            return new ESimUrl(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ESimUrl[] newArray(int i) {
            return new ESimUrl[i];
        }
    }

    public ESimUrl(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        this.separateUrl = str;
        this.shareUrl = str2;
        this.faqUrl = str3;
    }

    public static /* synthetic */ ESimUrl copy$default(ESimUrl eSimUrl, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eSimUrl.separateUrl;
        }
        if ((i & 2) != 0) {
            str2 = eSimUrl.shareUrl;
        }
        if ((i & 4) != 0) {
            str3 = eSimUrl.faqUrl;
        }
        return eSimUrl.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSeparateUrl() {
        return this.separateUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getShareUrl() {
        return this.shareUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFaqUrl() {
        return this.faqUrl;
    }

    @NotNull
    public final ESimUrl copy(@NotNull String separateUrl, @NotNull String shareUrl, @NotNull String faqUrl) {
        return new ESimUrl(separateUrl, shareUrl, faqUrl);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ESimUrl)) {
            return false;
        }
        ESimUrl eSimUrl = (ESimUrl) other;
        return Intrinsics.areEqual(this.separateUrl, eSimUrl.separateUrl) && Intrinsics.areEqual(this.shareUrl, eSimUrl.shareUrl) && Intrinsics.areEqual(this.faqUrl, eSimUrl.faqUrl);
    }

    @NotNull
    public final String getFaqUrl() {
        return this.faqUrl;
    }

    @NotNull
    public final String getSeparateUrl() {
        return this.separateUrl;
    }

    @NotNull
    public final String getShareUrl() {
        return this.shareUrl;
    }

    public int hashCode() {
        return (((this.separateUrl.hashCode() * 31) + this.shareUrl.hashCode()) * 31) + this.faqUrl.hashCode();
    }

    public final void setSeparateUrl(@NotNull String str) {
        this.separateUrl = str;
    }

    @NotNull
    public String toString() {
        return "ESimUrl(separateUrl=" + this.separateUrl + ", shareUrl=" + this.shareUrl + ", faqUrl=" + this.faqUrl + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.writeString(this.separateUrl);
        parcel.writeString(this.shareUrl);
        parcel.writeString(this.faqUrl);
    }
}
