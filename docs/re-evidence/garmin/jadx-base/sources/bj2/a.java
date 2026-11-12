package bj2;

import vb.h;

/* JADX INFO: loaded from: classes11.dex */
public class a implements Comparable<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f18348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final short f18349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final short f18350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final short f18351d;

    static {
        new a(2, 0, 0);
    }

    public a(String str) {
        String str2 = str.split("-")[0];
        if (!str2.matches("\\d+[.]\\d{1,2}[.]\\d{1,2}(\\.beta\\d{1,2})?")) {
            h.s("Connect IQ version string must be in the format major.minor.micro.betaN where each field is an integer except for the betaN field, which is a string, and optional. The minor and micro fields must less than 100 and the N value in the betaN field must be less than 100");
            throw null;
        }
        String[] strArrSplit = str2.split("\\.");
        this.f18348a = Short.parseShort(strArrSplit[0]);
        this.f18349b = Short.parseShort(strArrSplit[1]);
        this.f18350c = Short.parseShort(strArrSplit[2]);
        if (strArrSplit.length <= 3) {
            this.f18351d = (short) 0;
        } else {
            String str3 = strArrSplit[3];
            this.f18351d = Short.parseShort(str3.substring(4, str3.length()));
        }
    }

    public final int a() {
        int i14 = (this.f18350c * 100) + (this.f18349b * 1000) + (this.f18348a * 100000);
        short s8 = this.f18351d;
        return s8 != 0 ? i14 + s8 : i14;
    }

    @Override // java.lang.Comparable
    public final int compareTo(a aVar) {
        a aVar2 = aVar;
        aVar2.getClass();
        if (equals(aVar2)) {
            return 0;
        }
        return a() - aVar2.a();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f18348a == aVar.f18348a && this.f18349b == aVar.f18349b && this.f18350c == aVar.f18350c && this.f18351d == aVar.f18351d;
    }

    public final int hashCode() {
        return ((((((159 + this.f18348a) * 53) + this.f18349b) * 53) + this.f18350c) * 53) + this.f18351d;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append((int) this.f18348a);
        sb3.append('.');
        sb3.append((int) this.f18349b);
        sb3.append('.');
        sb3.append((int) this.f18350c);
        short s8 = this.f18351d;
        if (s8 != 0) {
            sb3.append(".beta");
            sb3.append((int) s8);
        }
        return sb3.toString();
    }

    public a(int i14, int i15, int i16, int i17) {
        this.f18348a = (short) i14;
        this.f18349b = (short) i15;
        this.f18350c = (short) i16;
        this.f18351d = (short) i17;
    }

    public a(int i14, int i15, int i16) {
        this.f18348a = (short) i14;
        this.f18349b = (short) i15;
        this.f18350c = (short) i16;
        this.f18351d = (short) 0;
    }
}
