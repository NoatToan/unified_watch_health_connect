package gu;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\u0007\u0010\f¨\u0006\r"}, d2 = {"Lgu/d;", "", "", "productNumber", "fixedSoftwareVersion", "<init>", "(ILjava/lang/Integer;)V", "a", "I", "b", "()I", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("productNumber")
    private final int productNumber;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fixedSoftwareVersion")
    private final Integer fixedSoftwareVersion;

    public /* synthetic */ d(int i14, Integer num, int i15, j jVar) {
        this(i14, (i15 & 2) != 0 ? null : num);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getFixedSoftwareVersion() {
        return this.fixedSoftwareVersion;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getProductNumber() {
        return this.productNumber;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.productNumber == dVar.productNumber && s.g(this.fixedSoftwareVersion, dVar.fixedSoftwareVersion);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.productNumber) * 31;
        Integer num = this.fixedSoftwareVersion;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "AudioPromptsWorkaroundDevice(productNumber=" + this.productNumber + ", fixedSoftwareVersion=" + this.fixedSoftwareVersion + ")";
    }

    public d(int i14, Integer num) {
        this.productNumber = i14;
        this.fixedSoftwareVersion = num;
    }
}
