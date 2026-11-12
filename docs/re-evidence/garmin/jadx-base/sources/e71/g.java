package e71;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Le71/g;", "", "", "Le71/f;", "summaryItems", "", "infoText", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<f> f63305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63306b;

    public g(List<f> list, String str) {
        list.getClass();
        str.getClass();
        this.f63305a = list;
        this.f63306b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f63305a.equals(gVar.f63305a) && this.f63306b.equals(gVar.f63306b);
    }

    public final int hashCode() {
        return this.f63306b.hashCode() + (this.f63305a.hashCode() * 31);
    }

    public final String toString() {
        return "ExerciseLoadUiModel(summaryItems=" + this.f63305a + ", infoText=" + this.f63306b + ")";
    }
}
