package vk2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lvk2/a;", "", "", "notificationTitle", "notificationMessage", "", "notificationIcon", "notificationChannelName", "", "notificationShowProgress", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Z)V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f178644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f178645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f178646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f178647d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f178648e;

    public a(String str, String str2, int i14, String str3, boolean z14) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.f178644a = str;
        this.f178645b = str2;
        this.f178646c = i14;
        this.f178647d = str3;
        this.f178648e = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f178644a, aVar.f178644a) && s.g(this.f178645b, aVar.f178645b) && this.f178646c == aVar.f178646c && s.g(this.f178647d, aVar.f178647d) && this.f178648e == aVar.f178648e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f178648e) + wr.g.j(q2.d(this.f178646c, wr.g.j(this.f178644a.hashCode() * 31, 31, this.f178645b), 31), 31, this.f178647d);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("BackgroundTransferNotification(notificationTitle=", this.f178644a, ", notificationMessage=", this.f178645b, ", notificationIcon=");
        wr.g.t(this.f178646c, ", notificationChannelName=", this.f178647d, ", notificationShowProgress=", sbI);
        return hb.a.k(sbI, this.f178648e, ")");
    }

    public /* synthetic */ a(String str, String str2, int i14, String str3, boolean z14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(str, str2, i14, str3, (i15 & 16) != 0 ? false : z14);
    }
}
