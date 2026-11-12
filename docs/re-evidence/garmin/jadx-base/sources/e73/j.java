package e73;

/* JADX INFO: loaded from: classes3.dex */
public class j extends j73.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h73.i f63372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63373b;

    public static class a extends j73.b {
        /* JADX WARN: Code duplicated, block: B:43:0x0093  */
        /* JADX WARN: Code duplicated, block: B:56:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:58:0x00e5  */
        /* JADX WARN: Code duplicated, block: B:59:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:65:0x00fc  */
        @Override // j73.e
        public final d a(h hVar, h.a aVar) {
            j jVar;
            int i14;
            StringBuilder sb3;
            if (hVar.f63359g < 4) {
                CharSequence charSequence = hVar.f63353a;
                int i15 = hVar.f63357e;
                int iB = g73.d.b('#', i15, charSequence.length(), charSequence) - i15;
                if (iB == 0 || iB > 6) {
                    jVar = null;
                } else {
                    int i16 = i15 + iB;
                    if (i16 >= charSequence.length()) {
                        jVar = new j(iB, "");
                    } else {
                        char cCharAt = charSequence.charAt(i16);
                        if (cCharAt == ' ' || cCharAt == '\t') {
                            int length = charSequence.length() - 1;
                            while (true) {
                                if (length >= i16) {
                                    char cCharAt2 = charSequence.charAt(length);
                                    if (cCharAt2 != '\t' && cCharAt2 != ' ') {
                                        break;
                                    }
                                    length--;
                                } else {
                                    length = i16 - 1;
                                    break;
                                }
                            }
                            int i17 = length;
                            while (true) {
                                if (i17 < i16) {
                                    i17 = i16 - 1;
                                    break;
                                }
                                if (charSequence.charAt(i17) != '#') {
                                    break;
                                }
                                i17--;
                            }
                            int i18 = i17;
                            while (true) {
                                if (i18 >= i16) {
                                    char cCharAt3 = charSequence.charAt(i18);
                                    if (cCharAt3 != '\t' && cCharAt3 != ' ') {
                                        break;
                                    }
                                    i18--;
                                } else {
                                    i18 = i16 - 1;
                                    break;
                                }
                            }
                            jVar = i18 != i17 ? new j(iB, charSequence.subSequence(i16, i18 + 1).toString()) : new j(iB, charSequence.subSequence(i16, length + 1).toString());
                        } else {
                            jVar = null;
                        }
                    }
                }
                if (jVar != null) {
                    d dVar = new d(jVar);
                    dVar.f63332b = charSequence.length();
                    return dVar;
                }
                char cCharAt4 = charSequence.charAt(i15);
                if (cCharAt4 == '-') {
                    if (g73.d.c(g73.d.b('-', i15 + 1, charSequence.length(), charSequence), charSequence.length(), charSequence) >= charSequence.length()) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                } else if (cCharAt4 != '=') {
                    i14 = 0;
                } else if (g73.d.c(g73.d.b('=', i15 + 1, charSequence.length(), charSequence), charSequence.length(), charSequence) >= charSequence.length()) {
                    i14 = 1;
                } else if (g73.d.c(g73.d.b('-', i15 + 1, charSequence.length(), charSequence), charSequence.length(), charSequence) >= charSequence.length()) {
                    i14 = 2;
                } else {
                    i14 = 0;
                }
                if (i14 > 0) {
                    j73.d dVar2 = aVar.f63368a;
                    if (dVar2 instanceof r) {
                        sb3 = ((r) dVar2).f63434b.f63407b;
                        if (sb3.length() == 0) {
                            sb3 = null;
                        }
                    } else {
                        sb3 = null;
                    }
                    if (sb3 != null) {
                        d dVar3 = new d(new j(i14, sb3.toString()));
                        dVar3.f63332b = charSequence.length();
                        dVar3.f63334d = true;
                        return dVar3;
                    }
                }
            }
            return null;
        }
    }

    public j(int i14, String str) {
        h73.i iVar = new h73.i();
        this.f63372a = iVar;
        iVar.f82369f = i14;
        this.f63373b = str;
    }

    @Override // j73.d
    public final h73.a c() {
        return this.f63372a;
    }

    @Override // j73.a, j73.d
    public final void f(n nVar) {
        nVar.f(this.f63373b, this.f63372a);
    }

    @Override // j73.d
    public final j73.c g(h hVar) {
        return null;
    }
}
