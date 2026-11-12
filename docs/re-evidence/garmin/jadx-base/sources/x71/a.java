package x71;

import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lx71/a;", "", "Lyz1/d;", "status", "", FirebaseAnalytics.Param.SCORE, "Ln61/d;", "ranges", "Ln61/b;", "classification", "trendingTypeKey", "", "last12WeeksValidData", "<init>", "(Lyz1/d;Ljava/lang/Integer;Ln61/d;Ln61/b;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yz1.d f189418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f189419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n61.d f189420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n61.b f189421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f189422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Boolean f189423f;

    static {
        Parcelable.Creator<n61.d> creator = n61.d.CREATOR;
    }

    public a(yz1.d dVar, Integer num, n61.d dVar2, n61.b bVar, Integer num2, Boolean bool) {
        dVar.getClass();
        this.f189418a = dVar;
        this.f189419b = num;
        this.f189420c = dVar2;
        this.f189421d = bVar;
        this.f189422e = num2;
        this.f189423f = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f189418a.equals(aVar.f189418a) && s.g(this.f189419b, aVar.f189419b) && s.g(this.f189420c, aVar.f189420c) && this.f189421d == aVar.f189421d && s.g(this.f189422e, aVar.f189422e) && s.g(this.f189423f, aVar.f189423f);
    }

    public final int hashCode() {
        int iHashCode = this.f189418a.hashCode() * 31;
        Integer num = this.f189419b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        n61.d dVar = this.f189420c;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        n61.b bVar = this.f189421d;
        int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Integer num2 = this.f189422e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.f189423f;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "EnduranceScoreCardData(status=" + this.f189418a + ", score=" + this.f189419b + ", ranges=" + this.f189420c + ", classification=" + this.f189421d + ", trendingTypeKey=" + this.f189422e + ", last12WeeksValidData=" + this.f189423f + ")";
    }
}
