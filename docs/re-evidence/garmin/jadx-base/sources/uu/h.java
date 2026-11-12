package uu;

import com.garmin.android.apps.connectmobile.f3;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Luu/h;", "", "", "pageStart", "lastestOrder", "lastestPoints", "<init>", "(ILjava/lang/Integer;Ljava/lang/Integer;)V", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f172708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f172709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f172710c;

    public h(int i14, Integer num, Integer num2) {
        this.f172708a = i14;
        this.f172709b = num;
        this.f172710c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f172708a == hVar.f172708a && p005kotlin.jvm.internal.s.g(this.f172709b, hVar.f172709b) && p005kotlin.jvm.internal.s.g(this.f172710c, hVar.f172710c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f172708a) * 31;
        Integer num = this.f172709b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f172710c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BadgeLeaderboardPageKeys(pageStart=");
        sb3.append(this.f172708a);
        sb3.append(", lastestOrder=");
        sb3.append(this.f172709b);
        sb3.append(", lastestPoints=");
        return f3.i(sb3, this.f172710c, ")");
    }
}
