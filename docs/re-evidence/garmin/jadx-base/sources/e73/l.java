package e73;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class l extends j73.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h73.m f63379a = new h73.m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f63380b = new ArrayList();

    public static class a extends j73.b {
        @Override // j73.e
        public final d a(h hVar, h.a aVar) {
            if (hVar.f63359g < 4 || hVar.f63360h || (hVar.h().c() instanceof h73.t)) {
                return null;
            }
            d dVar = new d(new l());
            dVar.f63333c = hVar.f63355c + 4;
            return dVar;
        }
    }

    @Override // j73.d
    public final h73.a c() {
        return this.f63379a;
    }

    @Override // j73.a, j73.d
    public final void d(CharSequence charSequence) {
        this.f63380b.add(charSequence);
    }

    @Override // j73.d
    public final j73.c g(h hVar) {
        if (hVar.f63359g >= 4) {
            return new b(-1, hVar.f63355c + 4, false);
        }
        if (hVar.f63360h) {
            return j73.c.a(hVar.f63357e);
        }
        return null;
    }

    @Override // j73.a, j73.d
    public final void h() {
        int i14;
        ArrayList arrayList = this.f63380b;
        int size = arrayList.size() - 1;
        while (true) {
            if (size >= 0) {
                CharSequence charSequence = (CharSequence) arrayList.get(size);
                int length = charSequence.length();
                int i15 = 0;
                while (true) {
                    if (i15 < length) {
                        char cCharAt = charSequence.charAt(i15);
                        if (cCharAt != ' ') {
                            switch (cCharAt) {
                                case '\t':
                                case '\n':
                                case 11:
                                case '\f':
                                case '\r':
                                    break;
                            }
                        }
                        i15++;
                    } else {
                        i15 = -1;
                    }
                }
                if (i15 == -1) {
                    size--;
                }
            }
        }
        StringBuilder sb3 = new StringBuilder();
        for (i14 = 0; i14 < size + 1; i14++) {
            sb3.append((CharSequence) arrayList.get(i14));
            sb3.append('\n');
        }
        this.f63379a.f82372f = sb3.toString();
    }
}
