package defpackage;

import com.apprichtap.haptic.b.a.c;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class pi implements c {
    public ArrayList<pf> d;
    public pe e;

    @Override // com.apprichtap.haptic.b.a.c
    public int getDuration() {
        try {
            ArrayList<pf> arrayList = this.d;
            ph phVar = arrayList.get(arrayList.size() - 1).f45262a;
            return "continuous".equals(phVar.f45343a) ? phVar.e + phVar.f45344b : phVar.e + 48;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override // com.apprichtap.haptic.b.a.c
    public int a() {
        return this.e.f45227a;
    }
}
