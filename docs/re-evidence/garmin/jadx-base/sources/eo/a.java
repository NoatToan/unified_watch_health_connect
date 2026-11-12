package eo;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Leo/a;", "", "Lam/g;", "mode", "", "badgeId", "", "userDisplayName", "", "Ljo/d;", "availableFilters", "<init>", "(Lam/g;ILjava/lang/String;Ljava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final am.g f64751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f64752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f64753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<jo.d> f64754d;

    /* JADX WARN: Multi-variable type inference failed */
    public a(am.g gVar, int i14, String str, List<? extends jo.d> list) {
        gVar.getClass();
        list.getClass();
        this.f64751a = gVar;
        this.f64752b = i14;
        this.f64753c = str;
        this.f64754d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f64751a == aVar.f64751a && this.f64752b == aVar.f64752b && s.g(this.f64753c, aVar.f64753c) && this.f64754d.equals(aVar.f64754d);
    }

    public final int hashCode() {
        int iD = q2.d(this.f64752b, this.f64751a.hashCode() * 31, 31);
        String str = this.f64753c;
        return this.f64754d.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "ActivitiesDisplayConfig(mode=" + this.f64751a + ", badgeId=" + this.f64752b + ", userDisplayName=" + this.f64753c + ", availableFilters=" + this.f64754d + ")";
    }
}
