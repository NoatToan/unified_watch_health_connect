package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f10522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f10523b = new a();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10524a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10525b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f10526c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f10527d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f10528e;

        public final boolean a() {
            int i14;
            int i15;
            int i16;
            int i17 = this.f10524a;
            int i18 = 2;
            if ((i17 & 7) != 0) {
                int i19 = this.f10527d;
                int i24 = this.f10525b;
                if (i19 > i24) {
                    i16 = 1;
                } else {
                    i16 = i19 == i24 ? 2 : 4;
                }
                if ((i16 & i17) == 0) {
                    return false;
                }
            }
            if ((i17 & 112) != 0) {
                int i25 = this.f10527d;
                int i26 = this.f10526c;
                if (i25 > i26) {
                    i15 = 1;
                } else {
                    i15 = i25 == i26 ? 2 : 4;
                }
                if (((i15 << 4) & i17) == 0) {
                    return false;
                }
            }
            if ((i17 & 1792) != 0) {
                int i27 = this.f10528e;
                int i28 = this.f10525b;
                if (i27 > i28) {
                    i14 = 1;
                } else {
                    i14 = i27 == i28 ? 2 : 4;
                }
                if (((i14 << 8) & i17) == 0) {
                    return false;
                }
            }
            if ((i17 & 28672) != 0) {
                int i29 = this.f10528e;
                int i30 = this.f10526c;
                if (i29 > i30) {
                    i18 = 1;
                } else if (i29 != i30) {
                    i18 = 4;
                }
                if ((i17 & (i18 << 12)) == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public interface b {
        int a();

        View b(int i14);

        int c(View view2);

        int d();

        int e(View view2);
    }

    public k0(b bVar) {
        this.f10522a = bVar;
    }

    public final View a(int i14, int i15, int i16, int i17) {
        b bVar = this.f10522a;
        int iD = bVar.d();
        int iA = bVar.a();
        int i18 = i15 > i14 ? 1 : -1;
        View view2 = null;
        while (i14 != i15) {
            View viewB = bVar.b(i14);
            int iC = bVar.c(viewB);
            int iE = bVar.e(viewB);
            a aVar = this.f10523b;
            aVar.f10525b = iD;
            aVar.f10526c = iA;
            aVar.f10527d = iC;
            aVar.f10528e = iE;
            if (i16 != 0) {
                aVar.f10524a = i16;
                if (aVar.a()) {
                    return viewB;
                }
            }
            if (i17 != 0) {
                aVar.f10524a = i17;
                if (aVar.a()) {
                    view2 = viewB;
                }
            }
            i14 += i18;
        }
        return view2;
    }

    public final boolean b(View view2) {
        b bVar = this.f10522a;
        int iD = bVar.d();
        int iA = bVar.a();
        int iC = bVar.c(view2);
        int iE = bVar.e(view2);
        a aVar = this.f10523b;
        aVar.f10525b = iD;
        aVar.f10526c = iA;
        aVar.f10527d = iC;
        aVar.f10528e = iE;
        aVar.f10524a = 24579;
        return aVar.a();
    }
}
