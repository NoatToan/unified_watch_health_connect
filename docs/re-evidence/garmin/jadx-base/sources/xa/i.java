package xa;

import am.j;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final tl2.g f189706h = new tl2.g(13);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final tl2.g f189707i = new tl2.g(14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f189708a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f189712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f189713f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f189714g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b[] f189710c = new b[5];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<b> f189709b = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f189711d = -1;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f189715a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f189716b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f189717c;

        private b() {
        }
    }

    public i(int i14) {
        this.f189708a = i14;
    }

    public final void a(int i14, float f14) {
        b bVar;
        int i15 = this.f189711d;
        ArrayList<b> arrayList = this.f189709b;
        if (i15 != 1) {
            Collections.sort(arrayList, f189706h);
            this.f189711d = 1;
        }
        int i16 = this.f189714g;
        b[] bVarArr = this.f189710c;
        if (i16 > 0) {
            int i17 = i16 - 1;
            this.f189714g = i17;
            bVar = bVarArr[i17];
        } else {
            bVar = new b();
        }
        int i18 = this.f189712e;
        this.f189712e = i18 + 1;
        bVar.f189715a = i18;
        bVar.f189716b = i14;
        bVar.f189717c = f14;
        arrayList.add(bVar);
        this.f189713f += i14;
        while (true) {
            int i19 = this.f189713f;
            int i24 = this.f189708a;
            if (i19 <= i24) {
                return;
            }
            int i25 = i19 - i24;
            b bVar2 = arrayList.get(0);
            int i26 = bVar2.f189716b;
            if (i26 <= i25) {
                this.f189713f -= i26;
                arrayList.remove(0);
                int i27 = this.f189714g;
                if (i27 < 5) {
                    this.f189714g = i27 + 1;
                    bVarArr[i27] = bVar2;
                }
            } else {
                bVar2.f189716b = i26 - i25;
                this.f189713f -= i25;
            }
        }
    }

    public final float b() {
        int i14 = this.f189711d;
        ArrayList<b> arrayList = this.f189709b;
        if (i14 != 0) {
            Collections.sort(arrayList, f189707i);
            this.f189711d = 0;
        }
        float f14 = 0.5f * this.f189713f;
        int i15 = 0;
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            b bVar = arrayList.get(i16);
            i15 += bVar.f189716b;
            if (i15 >= f14) {
                return bVar.f189717c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((b) j.f(1, arrayList)).f189717c;
    }
}
