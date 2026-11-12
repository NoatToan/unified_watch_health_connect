package e73;

import h73.x;

/* JADX INFO: loaded from: classes3.dex */
public class t extends j73.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f63438a = new x();

    public static class a extends j73.b {
        @Override // j73.e
        public final d a(h hVar, h.a aVar) {
            if (hVar.f63359g >= 4) {
                return null;
            }
            CharSequence charSequence = hVar.f63353a;
            int length = charSequence.length();
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            for (int i17 = hVar.f63357e; i17 < length; i17++) {
                char cCharAt = charSequence.charAt(i17);
                if (cCharAt != '\t' && cCharAt != ' ') {
                    if (cCharAt == '*') {
                        i16++;
                    } else if (cCharAt == '-') {
                        i14++;
                    } else {
                        if (cCharAt != '_') {
                            return null;
                        }
                        i15++;
                    }
                }
            }
            if ((i14 < 3 || i15 != 0 || i16 != 0) && ((i15 < 3 || i14 != 0 || i16 != 0) && (i16 < 3 || i14 != 0 || i15 != 0))) {
                return null;
            }
            d dVar = new d(new t());
            dVar.f63332b = charSequence.length();
            return dVar;
        }
    }

    @Override // j73.d
    public final h73.a c() {
        return this.f63438a;
    }

    @Override // j73.d
    public final j73.c g(h hVar) {
        return null;
    }
}
