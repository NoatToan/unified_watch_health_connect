package jo2;

import am.j;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0005¨\u0006\u000b"}, d2 = {"Ljo2/d;", "", "", "jws", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getJws", "()Ljava/lang/String;", "setJws", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("jws")
    private String jws;

    public d(String str) {
        str.getClass();
        this.jws = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && s.g(this.jws, ((d) obj).jws);
    }

    public final int hashCode() {
        return this.jws.hashCode();
    }

    public final String toString() {
        return j.m("PushAccountDataModel(jws=", this.jws, ")");
    }
}
