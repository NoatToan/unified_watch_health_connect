package k00;

import com.google.firebase.analytics.FirebaseAnalytics;
import ds.e0;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import u62.z;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lk00/b;", "", "", FirebaseAnalytics.Param.SCORE, "Lorg/joda/time/DateTime;", "date", "", "Lk00/a;", "stackItems", "<init>", "(ILorg/joda/time/DateTime;Ljava/util/List;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f101958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f101959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<a> f101960c;

    public b(int i14, DateTime dateTime, List<a> list) {
        dateTime.getClass();
        list.getClass();
        this.f101958a = i14;
        this.f101959b = dateTime;
        this.f101960c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f101958a == bVar.f101958a && this.f101959b.equals(bVar.f101959b) && this.f101960c.equals(bVar.f101960c);
    }

    public final int hashCode() {
        return this.f101960c.hashCode() + e0.a(Integer.hashCode(this.f101958a) * 31, this.f101959b, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ChartStackedColorValue(score=");
        sb3.append(this.f101958a);
        sb3.append(", date=");
        sb3.append(this.f101959b);
        sb3.append(", stackItems=");
        return z.c(sb3, this.f101960c, ")");
    }
}
