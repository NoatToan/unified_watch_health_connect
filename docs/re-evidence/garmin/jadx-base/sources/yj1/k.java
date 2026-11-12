package yj1;

import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lyj1/k;", "", "Ll20/a;", "contact", "", "contactInfoPk", "Lpj1/l;", "change", "<init>", "(Ll20/a;JLpj1/l;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l20.a f197556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f197557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pj1.l f197558c;

    static {
        Parcelable.Creator<l20.a> creator = l20.a.CREATOR;
    }

    public k(l20.a aVar, long j8, pj1.l lVar) {
        aVar.getClass();
        lVar.getClass();
        this.f197556a = aVar;
        this.f197557b = j8;
        this.f197558c = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f197556a.equals(kVar.f197556a) && this.f197557b == kVar.f197557b && this.f197558c == kVar.f197558c;
    }

    public final int hashCode() {
        return this.f197558c.hashCode() + q6.f.e(this.f197556a.hashCode() * 31, 31, this.f197557b);
    }

    public final String toString() {
        return "NotificationChangeUIModel(contact=" + this.f197556a + ", contactInfoPk=" + this.f197557b + ", change=" + this.f197558c + ")";
    }
}
