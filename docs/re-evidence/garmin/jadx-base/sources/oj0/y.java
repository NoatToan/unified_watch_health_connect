package oj0;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Loj0/y;", "", "", "partNumber", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getPartNumber", "()Ljava/lang/String;", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("partNumber")
    private final String partNumber;

    public y(String str) {
        str.getClass();
        this.partNumber = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && p005kotlin.jvm.internal.s.g(this.partNumber, ((y) obj).partNumber);
    }

    public final int hashCode() {
        return this.partNumber.hashCode();
    }

    public final String toString() {
        return am.j.m("OptimisticSubscriptionRequest(partNumber=", this.partNumber, ")");
    }
}
