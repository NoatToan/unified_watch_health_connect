package gn1;

import java.util.List;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lgn1/f;", "", "", "", "labels", "Ln92/c;", "dotPattern", "Ljava/util/Locale;", "locale", "", "firstHourOfThePair", "<init>", "(Ljava/util/List;Ln92/c;Ljava/util/Locale;Ljava/lang/Integer;)V", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<String> f78083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n92.c f78084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Locale f78085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f78086d;

    public f(List<String> list, n92.c cVar, Locale locale, Integer num) {
        list.getClass();
        cVar.getClass();
        locale.getClass();
        this.f78083a = list;
        this.f78084b = cVar;
        this.f78085c = locale;
        this.f78086d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f78083a.equals(fVar.f78083a) && this.f78084b == fVar.f78084b && this.f78085c.equals(fVar.f78085c) && s.g(this.f78086d, fVar.f78086d);
    }

    public final int hashCode() {
        int iHashCode = (this.f78085c.hashCode() + ((this.f78084b.hashCode() + (this.f78083a.hashCode() * 31)) * 31)) * 31;
        Integer num = this.f78086d;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "SleepAlignmentChartXAxisConfig(labels=" + this.f78083a + ", dotPattern=" + this.f78084b + ", locale=" + this.f78085c + ", firstHourOfThePair=" + this.f78086d + ")";
    }
}
