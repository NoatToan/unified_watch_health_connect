package e73;

/* JADX INFO: loaded from: classes3.dex */
public class c extends j73.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h73.b f63330a = new h73.b();

    public static class a extends j73.b {
        @Override // j73.e
        public final d a(h hVar, h.a aVar) {
            char cCharAt;
            int i14 = hVar.f63357e;
            if (!c.i(hVar, i14)) {
                return null;
            }
            int i15 = hVar.f63355c + hVar.f63359g;
            int i16 = i15 + 1;
            CharSequence charSequence = hVar.f63353a;
            int i17 = i14 + 1;
            if (i17 < charSequence.length() && ((cCharAt = charSequence.charAt(i17)) == '\t' || cCharAt == ' ')) {
                i16 = i15 + 2;
            }
            d dVar = new d(new c());
            dVar.f63333c = i16;
            return dVar;
        }
    }

    public static boolean i(h hVar, int i14) {
        CharSequence charSequence = hVar.f63353a;
        return hVar.f63359g < 4 && i14 < charSequence.length() && charSequence.charAt(i14) == '>';
    }

    @Override // j73.d
    public final h73.a c() {
        return this.f63330a;
    }

    @Override // j73.d
    public final j73.c g(h hVar) {
        char cCharAt;
        int i14 = hVar.f63357e;
        if (!i(hVar, i14)) {
            return null;
        }
        int i15 = hVar.f63355c + hVar.f63359g;
        int i16 = i15 + 1;
        CharSequence charSequence = hVar.f63353a;
        int i17 = i14 + 1;
        if (i17 < charSequence.length() && ((cCharAt = charSequence.charAt(i17)) == '\t' || cCharAt == ' ')) {
            i16 = i15 + 2;
        }
        return new b(-1, i16, false);
    }
}
