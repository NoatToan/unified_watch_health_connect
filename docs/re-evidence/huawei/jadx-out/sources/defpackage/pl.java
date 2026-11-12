package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class pl {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f45580c;
    public ArrayList<pf> e;

    public int d() {
        int i;
        try {
            int i2 = 0;
            for (pf pfVar : this.e) {
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
            return i2;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
