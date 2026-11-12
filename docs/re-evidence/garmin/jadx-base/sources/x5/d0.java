package x5;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lx5/d0;", "", "", "text", "<init>", "(Ljava/lang/String;)V", "a", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f188830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o f188831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f188832c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f188833d = -1;

    static {
        new a(null);
    }

    public d0(String str) {
        this.f188830a = str;
    }

    public final int a() {
        o oVar = this.f188831b;
        String str = this.f188830a;
        if (oVar == null) {
            return str.length();
        }
        return (oVar.f188913a - oVar.a()) + (str.length() - (this.f188833d - this.f188832c));
    }

    public final void b(int i14, int i15, String str) {
        if (i14 > i15) {
            y5.a.a("start index must be less than or equal to end index: " + i14 + " > " + i15);
        }
        if (i14 < 0) {
            y5.a.a("start must be non-negative, but was " + i14);
        }
        o oVar = this.f188831b;
        if (oVar == null) {
            int iMax = Math.max(255, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i14, 64);
            int iMin2 = Math.min(this.f188830a.length() - i15, 64);
            String str2 = this.f188830a;
            int i16 = i14 - iMin;
            str2.getClass();
            str2.getChars(i16, i14, cArr, 0);
            String str3 = this.f188830a;
            int i17 = iMax - iMin2;
            int i18 = iMin2 + i15;
            str3.getClass();
            str3.getChars(i15, i18, cArr, i17);
            str.getChars(0, str.length(), cArr, iMin);
            this.f188831b = new o(cArr, str.length() + iMin, i17);
            this.f188832c = i16;
            this.f188833d = i18;
            return;
        }
        int i19 = this.f188832c;
        int i24 = i14 - i19;
        int i25 = i15 - i19;
        if (i24 < 0 || i25 > oVar.f188913a - oVar.a()) {
            this.f188830a = toString();
            this.f188831b = null;
            this.f188832c = -1;
            this.f188833d = -1;
            b(i14, i15, str);
            return;
        }
        int length = str.length() - (i25 - i24);
        if (length > oVar.a()) {
            int iA = length - oVar.a();
            int i26 = oVar.f188913a;
            do {
                i26 *= 2;
            } while (i26 - oVar.f188913a < iA);
            char[] cArr2 = new char[i26];
            p13.s.f(oVar.f188914b, cArr2, 0, 0, oVar.f188915c);
            int i27 = oVar.f188913a;
            int i28 = oVar.f188916d;
            int i29 = i27 - i28;
            int i30 = i26 - i29;
            p13.s.f(oVar.f188914b, cArr2, i30, i28, i29 + i28);
            oVar.f188914b = cArr2;
            oVar.f188913a = i26;
            oVar.f188916d = i30;
        }
        int i34 = oVar.f188915c;
        if (i24 < i34 && i25 <= i34) {
            int i35 = i34 - i25;
            char[] cArr3 = oVar.f188914b;
            p13.s.f(cArr3, cArr3, oVar.f188916d - i35, i25, i34);
            oVar.f188915c = i24;
            oVar.f188916d -= i35;
        } else if (i24 >= i34 || i25 < i34) {
            int iA2 = oVar.a() + i24;
            int iA3 = oVar.a() + i25;
            int i36 = oVar.f188916d;
            char[] cArr4 = oVar.f188914b;
            p13.s.f(cArr4, cArr4, oVar.f188915c, i36, iA2);
            oVar.f188915c += iA2 - i36;
            oVar.f188916d = iA3;
        } else {
            oVar.f188916d = oVar.a() + i25;
            oVar.f188915c = i24;
        }
        str.getChars(0, str.length(), oVar.f188914b, oVar.f188915c);
        oVar.f188915c = str.length() + oVar.f188915c;
    }

    public final String toString() {
        o oVar = this.f188831b;
        String str = this.f188830a;
        if (oVar == null) {
            return str;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append((CharSequence) str, 0, this.f188832c);
        sb3.append(oVar.f188914b, 0, oVar.f188915c);
        char[] cArr = oVar.f188914b;
        int i14 = oVar.f188916d;
        sb3.append(cArr, i14, oVar.f188913a - i14);
        String str2 = this.f188830a;
        sb3.append((CharSequence) str2, this.f188833d, str2.length());
        return sb3.toString();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lx5/d0$a;", "", "<init>", "()V", "", "BUF_SIZE", "I", "SURROUNDING_SIZE", "NOWHERE", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
