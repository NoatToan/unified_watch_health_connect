package v2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lv2/h1;", "", "text", "<init>", "(Ljava/lang/CharSequence;)V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h1 implements CharSequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f175034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j0 f175035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f175036c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f175037d = -1;

    static {
        new a(null);
    }

    public h1(CharSequence charSequence) {
        this.f175034a = charSequence;
    }

    public final void a(int i14, int i15, int i16, CharSequence charSequence) {
        if (i14 > i15) {
            b2.e.a("start=" + i14 + " > end=" + i15);
        }
        if (i16 < 0) {
            b2.e.a("textStart=0 > textEnd=" + i16);
        }
        if (i14 < 0) {
            b2.e.a("start must be non-negative, but was " + i14);
        }
        j0 j0Var = this.f175035b;
        if (j0Var == null) {
            int iMax = Math.max(255, i16 + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i14, 64);
            int iMin2 = Math.min(this.f175034a.length() - i15, 64);
            int i17 = i14 - iMin;
            i.j(this.f175034a, cArr, 0, i17, i14);
            int i18 = iMax - iMin2;
            int i19 = iMin2 + i15;
            i.j(this.f175034a, cArr, i18, i15, i19);
            i.j(charSequence, cArr, iMin, 0, i16);
            this.f175035b = new j0(cArr, iMin + i16, i18);
            this.f175036c = i17;
            this.f175037d = i19;
            return;
        }
        int i24 = this.f175036c;
        int i25 = i14 - i24;
        int i26 = i15 - i24;
        if (i25 < 0 || i26 > j0Var.f175062a - j0Var.a()) {
            this.f175034a = toString();
            this.f175035b = null;
            this.f175036c = -1;
            this.f175037d = -1;
            a(i14, i15, i16, charSequence);
            return;
        }
        int i27 = i16 - (i26 - i25);
        if (i27 > j0Var.a()) {
            int iA = i27 - j0Var.a();
            int i28 = j0Var.f175062a;
            do {
                i28 *= 2;
            } while (i28 - j0Var.f175062a < iA);
            char[] cArr2 = new char[i28];
            p13.s.f(j0Var.f175063b, cArr2, 0, 0, j0Var.f175064c);
            int i29 = j0Var.f175062a;
            int i30 = j0Var.f175065d;
            int i34 = i29 - i30;
            int i35 = i28 - i34;
            p13.s.f(j0Var.f175063b, cArr2, i35, i30, i34 + i30);
            j0Var.f175063b = cArr2;
            j0Var.f175062a = i28;
            j0Var.f175065d = i35;
        }
        int i36 = j0Var.f175064c;
        if (i25 < i36 && i26 <= i36) {
            int i37 = i36 - i26;
            char[] cArr3 = j0Var.f175063b;
            p13.s.f(cArr3, cArr3, j0Var.f175065d - i37, i26, i36);
            j0Var.f175064c = i25;
            j0Var.f175065d -= i37;
        } else if (i25 >= i36 || i26 < i36) {
            int iA2 = j0Var.a() + i25;
            int iA3 = j0Var.a() + i26;
            int i38 = j0Var.f175065d;
            char[] cArr4 = j0Var.f175063b;
            p13.s.f(cArr4, cArr4, j0Var.f175064c, i38, iA2);
            j0Var.f175064c += iA2 - i38;
            j0Var.f175065d = iA3;
        } else {
            j0Var.f175065d = j0Var.a() + i26;
            j0Var.f175064c = i25;
        }
        i.j(charSequence, j0Var.f175063b, j0Var.f175064c, 0, i16);
        j0Var.f175064c += i16;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i14) {
        j0 j0Var = this.f175035b;
        if (j0Var != null && i14 >= this.f175036c) {
            int iA = j0Var.f175062a - j0Var.a();
            int i15 = this.f175036c;
            if (i14 >= iA + i15) {
                return this.f175034a.charAt(i14 - ((iA - this.f175037d) + i15));
            }
            int i16 = i14 - i15;
            int i17 = j0Var.f175064c;
            char[] cArr = j0Var.f175063b;
            return i16 < i17 ? cArr[i16] : cArr[(i16 - i17) + j0Var.f175065d];
        }
        return this.f175034a.charAt(i14);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        j0 j0Var = this.f175035b;
        CharSequence charSequence = this.f175034a;
        if (j0Var == null) {
            return charSequence.length();
        }
        return (j0Var.f175062a - j0Var.a()) + (charSequence.length() - (this.f175037d - this.f175036c));
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i14, int i15) {
        return toString().subSequence(i14, i15);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        j0 j0Var = this.f175035b;
        CharSequence charSequence = this.f175034a;
        if (j0Var == null) {
            return charSequence.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(charSequence, 0, this.f175036c);
        sb3.append(j0Var.f175063b, 0, j0Var.f175064c);
        char[] cArr = j0Var.f175063b;
        int i14 = j0Var.f175065d;
        sb3.append(cArr, i14, j0Var.f175062a - i14);
        CharSequence charSequence2 = this.f175034a;
        sb3.append(charSequence2, this.f175037d, charSequence2.length());
        return sb3.toString();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lv2/h1$a;", "", "<init>", "()V", "", "BUF_SIZE", "I", "SURROUNDING_SIZE", "NOWHERE", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
