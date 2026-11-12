package qj0;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import v.e0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\b\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lqj0/f;", "", "", "imageAndroid", "lottieImage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("imageAndroid")
    private final String imageAndroid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lottieImage")
    private final String lottieImage;

    public f(String str, String str2) {
        this.imageAndroid = str;
        this.lottieImage = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getImageAndroid() {
        return this.imageAndroid;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLottieImage() {
        return this.lottieImage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.imageAndroid, fVar.imageAndroid) && s.g(this.lottieImage, fVar.lottieImage);
    }

    public final int hashCode() {
        String str = this.imageAndroid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lottieImage;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return e0.g("ContentfulMediaDTO(imageAndroid=", this.imageAndroid, ", lottieImage=", this.lottieImage, ")");
    }
}
