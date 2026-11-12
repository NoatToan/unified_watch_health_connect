package q01;

import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lq01/c;", "", "Lorg/joda/time/LocalDate;", "date", "", "hasLoggedFoodToday", "", "streakDays", "<init>", "(Lorg/joda/time/LocalDate;ZI)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f141985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f141986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f141987c;

    public c(LocalDate localDate, boolean z14, int i14) {
        localDate.getClass();
        this.f141985a = localDate;
        this.f141986b = z14;
        this.f141987c = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f141985a.equals(cVar.f141985a) && this.f141986b == cVar.f141986b && this.f141987c == cVar.f141987c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f141987c) + q6.f.g(this.f141985a.hashCode() * 31, 31, this.f141986b);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FoodLogData(date=");
        sb3.append(this.f141985a);
        sb3.append(", hasLoggedFoodToday=");
        sb3.append(this.f141986b);
        sb3.append(", streakDays=");
        return am.j.q(sb3, this.f141987c, ")");
    }
}
