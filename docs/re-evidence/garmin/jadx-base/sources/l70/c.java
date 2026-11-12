package l70;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Unit;
import r53.c2;

/* JADX INFO: loaded from: classes8.dex */
public interface c extends com.garmin.android.apps.connectmobile.f0 {
    static /* synthetic */ Object V0(c cVar, List list, List list2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, v13.c cVar2, int i14) {
        if ((i14 & 1) != 0) {
            list = null;
        }
        if ((i14 & 2) != 0) {
            list2 = null;
        }
        if ((i14 & 4) != 0) {
            arrayList = null;
        }
        if ((i14 & 8) != 0) {
            arrayList2 = null;
        }
        if ((i14 & 16) != 0) {
            arrayList3 = null;
        }
        return cVar.s(list, list2, arrayList, arrayList2, arrayList3, cVar2);
    }

    s53.k D2();

    s53.k D3();

    r53.i<j70.k.h> G3();

    f0 M1();

    s53.k P();

    c2 P2();

    e0 T2();

    c2 V2();

    Unit X(boolean z14);

    s53.k X1();

    c2 X2();

    c2 Z2();

    void cleanup();

    Object e(o70.f fVar, t13.d<? super Unit> dVar);

    s53.k j4();

    r53.i<j70.k.e> k1();

    r53.i<j70.f> p();

    Object s(List list, List list2, List list3, List list4, List list5, v13.c cVar);

    s53.k x3(boolean z14);

    r53.i<j70.k.i> y0();

    void z2();
}
