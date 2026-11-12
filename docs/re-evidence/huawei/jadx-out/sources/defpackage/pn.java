package defpackage;

import com.apprichtap.haptic.b.a.c;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class pn implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<pl> f45702a;
    public pj d;

    @Override // com.apprichtap.haptic.b.a.c
    public int getDuration() {
        int i;
        try {
            ArrayList<pl> arrayList = this.f45702a;
            pl plVar = arrayList.get(arrayList.size() - 1);
            int i2 = 0;
            for (pf pfVar : plVar.e) {
                if (pfVar.f45262a.f45343a.equals("continuous")) {
                    ph phVar = pfVar.f45262a;
                    i = phVar.e + phVar.f45344b;
                } else {
                    i = pfVar.f45262a.e + 48;
                }
                if (i > i2) {
                    i2 = i;
                }
            }
            return i2 + plVar.f45580c;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int a(int i) {
        for (int i2 = 0; i2 < this.f45702a.size(); i2++) {
            try {
                for (int i3 = 0; i3 < this.f45702a.get(i2).e.size(); i3++) {
                    if (this.f45702a.get(i2).f45580c <= i && this.f45702a.get(i2).f45580c + this.f45702a.get(i2).e.get(i3).f45262a.e >= i) {
                        return i2;
                    }
                    if (this.f45702a.get(i2).f45580c > i) {
                        return i2 - 1;
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
                return Integer.MIN_VALUE;
            }
        }
        return Integer.MIN_VALUE;
    }

    @Override // com.apprichtap.haptic.b.a.c
    public int a() {
        return this.d.e;
    }
}
