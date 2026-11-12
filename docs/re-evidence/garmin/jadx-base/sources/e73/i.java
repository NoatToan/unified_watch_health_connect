package e73;

/* JADX INFO: loaded from: classes3.dex */
public class i extends j73.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h73.g f63369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f63370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StringBuilder f63371c;

    public static class a extends j73.b {
        /* JADX WARN: Code duplicated, block: B:32:0x0057  */
        @Override // j73.e
        public final d a(h hVar, h.a aVar) {
            i iVar;
            int i14 = hVar.f63359g;
            if (i14 >= 4) {
                return null;
            }
            int i15 = hVar.f63357e;
            CharSequence charSequence = hVar.f63353a;
            int length = charSequence.length();
            int i16 = 0;
            int i17 = 0;
            for (int i18 = i15; i18 < length; i18++) {
                char cCharAt = charSequence.charAt(i18);
                if (cCharAt == '`') {
                    i16++;
                } else {
                    if (cCharAt != '~') {
                        break;
                    }
                    i17++;
                }
            }
            if (i16 >= 3 && i17 == 0) {
                int i19 = i15 + i16;
                int length2 = charSequence.length();
                while (true) {
                    if (i19 >= length2) {
                        i19 = -1;
                        break;
                    }
                    if (charSequence.charAt(i19) == '`') {
                        break;
                    }
                    i19++;
                }
                if (i19 != -1) {
                    iVar = null;
                } else {
                    iVar = new i('`', i16, i14);
                }
            } else if (i17 < 3 || i16 != 0) {
                iVar = null;
            } else {
                iVar = new i('~', i17, i14);
            }
            if (iVar == null) {
                return null;
            }
            d dVar = new d(iVar);
            dVar.f63332b = i15 + iVar.f63369a.f82365g;
            return dVar;
        }
    }

    public i(char c14, int i14, int i15) {
        h73.g gVar = new h73.g();
        this.f63369a = gVar;
        this.f63371c = new StringBuilder();
        gVar.f82364f = c14;
        gVar.f82365g = i14;
        gVar.f82366h = i15;
    }

    @Override // j73.d
    public final h73.a c() {
        return this.f63369a;
    }

    @Override // j73.a, j73.d
    public final void d(CharSequence charSequence) {
        if (this.f63370b == null) {
            this.f63370b = charSequence.toString();
            return;
        }
        StringBuilder sb3 = this.f63371c;
        sb3.append(charSequence);
        sb3.append('\n');
    }

    @Override // j73.d
    public final j73.c g(h hVar) {
        int i14 = hVar.f63357e;
        int i15 = hVar.f63354b;
        CharSequence charSequence = hVar.f63353a;
        int i16 = hVar.f63359g;
        h73.g gVar = this.f63369a;
        if (i16 < 4) {
            char c14 = gVar.f82364f;
            int i17 = gVar.f82365g;
            int iB = g73.d.b(c14, i14, charSequence.length(), charSequence) - i14;
            if (iB >= i17 && g73.d.c(i14 + iB, charSequence.length(), charSequence) == charSequence.length()) {
                return new b(-1, -1, true);
            }
        }
        int length = charSequence.length();
        for (int i18 = gVar.f82366h; i18 > 0 && i15 < length && charSequence.charAt(i15) == ' '; i18--) {
            i15++;
        }
        return j73.c.a(i15);
    }

    @Override // j73.a, j73.d
    public final void h() {
        String strA = g73.a.a(this.f63370b.trim());
        h73.g gVar = this.f63369a;
        gVar.f82367i = strA;
        gVar.f82368j = this.f63371c.toString();
    }
}
