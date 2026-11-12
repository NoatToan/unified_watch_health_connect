package aq2;

import java.util.Locale;
import java.util.Map;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Laq2/f;", "", "", "isoName", "name", "", "Ljava/util/Locale;", "localizedNames", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f implements Comparable<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<Locale, String> f12475c;

    public f(String str, String str2, Map<Locale, String> map) {
        map.getClass();
        this.f12473a = str;
        this.f12474b = str2;
        this.f12475c = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Comparable
    public final int compareTo(f fVar) {
        Locale locale;
        String str;
        f fVar2 = fVar;
        fVar2.getClass();
        zn2.k.f205614a.getClass();
        p pVarA = zn2.k.a();
        if (pVarA == null || (locale = (Locale) pVarA.f128594a) == null) {
            locale = Locale.ENGLISH;
        }
        String str2 = this.f12475c.get(locale);
        String str3 = fVar2.f12475c.get(locale);
        if (str2 != null && str3 != null) {
            return str2.compareTo(str3);
        }
        String str4 = this.f12474b;
        if (str4 == null || (str = fVar2.f12474b) == null) {
            return 0;
        }
        return str4.compareTo(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.f12473a, fVar.f12473a) && s.g(this.f12474b, fVar.f12474b) && this.f12475c.equals(fVar.f12475c);
    }

    public final int hashCode() {
        String str = this.f12473a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f12474b;
        return this.f12475c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return am.j.s(p6.b.i("FitPayState(isoName=", this.f12473a, ", name=", this.f12474b, ", localizedNames="), this.f12475c, ")");
    }
}
