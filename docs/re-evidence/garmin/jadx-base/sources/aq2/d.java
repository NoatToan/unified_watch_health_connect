package aq2;

import fo2.p;
import java.util.Locale;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Laq2/d;", "", "", "isoName", "name", "Lfo2/p;", "provincesLink", "", "Ljava/util/Locale;", "localizedNames", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lfo2/p;Ljava/util/Map;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d implements Comparable<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f12468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<Locale, String> f12469d;

    public d(String str, String str2, p pVar, Map<Locale, String> map) {
        pVar.getClass();
        map.getClass();
        this.f12466a = str;
        this.f12467b = str2;
        this.f12468c = pVar;
        this.f12469d = map;
    }

    @Override // java.lang.Comparable
    public final int compareTo(d dVar) {
        String str;
        d dVar2 = dVar;
        dVar2.getClass();
        String str2 = this.f12467b;
        if (str2 == null || (str = dVar2.f12467b) == null) {
            return 0;
        }
        return str2.compareTo(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f12466a, dVar.f12466a) && s.g(this.f12467b, dVar.f12467b) && this.f12468c.equals(dVar.f12468c) && this.f12469d.equals(dVar.f12469d);
    }

    public final int hashCode() {
        String str = this.f12466a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f12467b;
        return this.f12469d.hashCode() + fb1.c.e(this.f12468c, (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("FitPayCountry(isoName=", this.f12466a, ", name=", this.f12467b, ", provincesLink=");
        sbI.append(this.f12468c);
        sbI.append(", localizedNames=");
        sbI.append(this.f12469d);
        sbI.append(")");
        return sbI.toString();
    }
}
