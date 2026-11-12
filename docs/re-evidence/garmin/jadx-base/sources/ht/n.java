package ht;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lht/n;", "", "", "selectionType", "selectionValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "b", "gcm-domain-subscription_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("selectionType")
    private final String selectionType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("selectionValue")
    private final String selectionValue;

    public n(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.selectionType = str;
        this.selectionValue = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return p005kotlin.jvm.internal.s.g(this.selectionType, nVar.selectionType) && p005kotlin.jvm.internal.s.g(this.selectionValue, nVar.selectionValue);
    }

    public final int hashCode() {
        return this.selectionValue.hashCode() + (this.selectionType.hashCode() * 31);
    }

    public final String toString() {
        return e0.g("GCPlusAnalyticsSelection(selectionType=", this.selectionType, ", selectionValue=", this.selectionValue, ")");
    }
}
