package com.apprichtap.haptic.b.a;

import defpackage.pf;
import defpackage.pi;
import defpackage.pl;
import defpackage.pn;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public interface c {
    int a();

    int getDuration();

    static boolean a(c cVar) {
        pn pnVar;
        ArrayList<pl> arrayList;
        ArrayList<pf> arrayList2;
        if (cVar == null) {
            return false;
        }
        if (1 != cVar.a()) {
            return (2 != cVar.a() || (pnVar = (pn) cVar) == null || (arrayList = pnVar.f45702a) == null || arrayList.size() < 1 || pnVar.f45702a.get(0).e == null || pnVar.f45702a.get(0).e.size() < 1 || pnVar.f45702a.get(0).e.get(0).f45262a == null) ? false : true;
        }
        pi piVar = (pi) cVar;
        return (piVar == null || (arrayList2 = piVar.d) == null || arrayList2.size() < 1 || piVar.d.get(0).f45262a == null) ? false : true;
    }
}
