package zv0;

import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import wr.g;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lzv0/b;", "", "", "title", "message", "urlName", "urlAddress", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f207163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f207164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f207165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f207166d;

    public b(String str, String str2, String str3, String str4) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.f207163a = str;
        this.f207164b = str2;
        this.f207165c = str3;
        this.f207166d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f207163a.equals(bVar.f207163a) && this.f207164b.equals(bVar.f207164b) && this.f207165c.equals(bVar.f207165c) && s.g(this.f207166d, bVar.f207166d);
    }

    public final int hashCode() {
        int iJ = g.j(g.j(this.f207163a.hashCode() * 31, 31, this.f207164b), 31, this.f207165c);
        String str = this.f207166d;
        return iJ + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return e5.h(p6.b.i("BehaviourHelpContent(title=", this.f207163a, ", message=", this.f207164b, ", urlName="), this.f207165c, ", urlAddress=", this.f207166d, ")");
    }
}
