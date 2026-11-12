package e73;

/* JADX INFO: loaded from: classes3.dex */
public class p extends j73.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h73.p f63423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f63424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f63425c;

    public static class a extends j73.b {
        /* JADX WARN: Code duplicated, block: B:68:0x00ef  */
        /* JADX WARN: Code duplicated, block: B:9:0x0025  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Switch 'out' block B:41:0x0095 for B:26:0x0059 already processed. Defaulting to fallback option. */
        @Override // j73.e
        public final d a(h hVar, h.a aVar) {
            StringBuilder sb3;
            d dVar;
            char cCharAt;
            c cVar;
            b bVar;
            boolean z14;
            int i14;
            char cCharAt2;
            j73.d dVar2 = aVar.f63368a;
            int i15 = hVar.f63359g;
            if (i15 >= 4) {
                return null;
            }
            int i16 = hVar.f63357e;
            int i17 = hVar.f63355c + i15;
            if (dVar2 instanceof r) {
                sb3 = ((r) dVar2).f63434b.f63407b;
                if (sb3.length() == 0) {
                    sb3 = null;
                }
            } else {
                sb3 = null;
            }
            boolean z15 = sb3 != null;
            CharSequence charSequence = hVar.f63353a;
            char cCharAt3 = charSequence.charAt(i16);
            if (cCharAt3 == '*' || cCharAt3 == '+' || cCharAt3 == '-') {
                dVar = null;
                int i18 = i16 + 1;
                if (i18 >= charSequence.length() || (cCharAt = charSequence.charAt(i18)) == '\t' || cCharAt == ' ') {
                    h73.c cVar2 = new h73.c();
                    cVar2.f82362g = cCharAt3;
                    cVar = new c(cVar2, i18);
                } else {
                    cVar = dVar;
                }
            } else {
                int length = charSequence.length();
                int i19 = i16;
                int i24 = 0;
                while (true) {
                    if (i19 < length) {
                        char cCharAt4 = charSequence.charAt(i19);
                        dVar = null;
                        if (cCharAt4 != ')' && cCharAt4 != '.') {
                            switch (cCharAt4) {
                                case '0':
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                    i24++;
                                    if (i24 <= 9) {
                                        i19++;
                                    }
                                    break;
                                default:
                                    break;
                            }
                        } else if (i24 >= 1 && ((i14 = i19 + 1) >= charSequence.length() || (cCharAt2 = charSequence.charAt(i14)) == '\t' || cCharAt2 == ' ')) {
                            String string = charSequence.subSequence(i16, i19).toString();
                            h73.s sVar = new h73.s();
                            sVar.f82384g = Integer.parseInt(string);
                            sVar.f82385h = cCharAt4;
                            cVar = new c(sVar, i14);
                        }
                    } else {
                        dVar = null;
                    }
                    cVar = dVar;
                }
            }
            if (cVar == 0) {
                bVar = dVar;
            } else {
                h73.p pVar = cVar.f63428a;
                int i25 = cVar.f63429b;
                int i26 = (i25 - i16) + i17;
                int length2 = charSequence.length();
                int i27 = i26;
                while (true) {
                    if (i25 >= length2) {
                        z14 = false;
                    } else {
                        char cCharAt5 = charSequence.charAt(i25);
                        if (cCharAt5 == '\t') {
                            i27 = (4 - (i27 % 4)) + i27;
                        } else if (cCharAt5 == ' ') {
                            i27++;
                        } else {
                            z14 = true;
                        }
                        i25++;
                    }
                }
                if (!z15 || ((!(pVar instanceof h73.s) || ((h73.s) pVar).f82384g == 1) && z14)) {
                    if (!z14 || i27 - i26 > 4) {
                        i27 = i26 + 1;
                    }
                    bVar = new b(pVar, i27);
                } else {
                    bVar = dVar;
                }
            }
            if (bVar == 0) {
                return dVar;
            }
            h73.p pVar2 = bVar.f63426a;
            int i28 = bVar.f63427b;
            q qVar = new q(i28 - hVar.f63355c);
            if (dVar2 instanceof p) {
                h73.p pVar3 = ((p) dVar2).f63423a;
                if (((pVar3 instanceof h73.c) && (pVar2 instanceof h73.c)) ? Character.valueOf(((h73.c) pVar3).f82362g).equals(Character.valueOf(((h73.c) pVar2).f82362g)) : ((pVar3 instanceof h73.s) && (pVar2 instanceof h73.s)) ? Character.valueOf(((h73.s) pVar3).f82385h).equals(Character.valueOf(((h73.s) pVar2).f82385h)) : false) {
                    d dVar3 = new d(qVar);
                    dVar3.f63333c = i28;
                    return dVar3;
                }
            }
            p pVar4 = new p(pVar2);
            pVar2.f82378f = true;
            d dVar4 = new d(pVar4, qVar);
            dVar4.f63333c = i28;
            return dVar4;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h73.p f63426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f63427b;

        public b(h73.p pVar, int i14) {
            this.f63426a = pVar;
            this.f63427b = i14;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h73.p f63428a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f63429b;

        public c(h73.p pVar, int i14) {
            this.f63428a = pVar;
            this.f63429b = i14;
        }
    }

    public p(h73.p pVar) {
        this.f63423a = pVar;
    }

    @Override // j73.a, j73.d
    public final boolean a() {
        return true;
    }

    @Override // j73.d
    public final h73.a c() {
        return this.f63423a;
    }

    @Override // j73.a, j73.d
    public final boolean e(h73.a aVar) {
        if (!(aVar instanceof h73.q)) {
            return false;
        }
        if (this.f63424b && this.f63425c == 1) {
            this.f63423a.f82378f = false;
            this.f63424b = false;
        }
        return true;
    }

    @Override // j73.d
    public final j73.c g(h hVar) {
        if (hVar.f63360h) {
            this.f63424b = true;
            this.f63425c = 0;
        } else if (this.f63424b) {
            this.f63425c++;
        }
        return j73.c.a(hVar.f63354b);
    }
}
