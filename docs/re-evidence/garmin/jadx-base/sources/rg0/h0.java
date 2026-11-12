package rg0;

import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lrg0/h0;", "", "", "userId", "", "name", "Lb12/b;", "profileImageData", "<init>", "(JLjava/lang/String;Lb12/b;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f152559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f152560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b12.b f152561c;

    static {
        Parcelable.Creator<b12.b> creator = b12.b.CREATOR;
    }

    public h0(long j8, String str, b12.b bVar) {
        str.getClass();
        bVar.getClass();
        this.f152559a = j8;
        this.f152560b = str;
        this.f152561c = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f152559a == h0Var.f152559a && this.f152560b.equals(h0Var.f152560b) && this.f152561c.equals(h0Var.f152561c);
    }

    public final int hashCode() {
        return this.f152561c.hashCode() + wr.g.j(Long.hashCode(this.f152559a) * 31, 31, this.f152560b);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f152559a, "BasicProfileData(userId=", ", name=", this.f152560b);
        sbK.append(", profileImageData=");
        sbK.append(this.f152561c);
        sbK.append(")");
        return sbK.toString();
    }
}
