package hq2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p13.u;
import p13.y;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class l implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f85261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ul2.c f85262c;

    public /* synthetic */ l(n nVar, ul2.c cVar, int i14) {
        this.f85260a = i14;
        this.f85261b = nVar;
        this.f85262c = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0056 A[LOOP:1: B:14:0x0050->B:16:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x0079 A[LOOP:2: B:18:0x0073->B:20:0x0079, LOOP_END] */
    @Override // e23.l
    public final Object invoke(Object obj) {
        ArrayList arrayList;
        Iterator it;
        char[] cArr;
        Iterator it3;
        int i14 = this.f85260a;
        ul2.c cVar = this.f85262c;
        n nVar = this.f85261b;
        switch (i14) {
            case 0:
                int i15 = n.f85263g;
                ((Throwable) obj).getClass();
                j.f85251a.getClass();
                byte[] bArr = j.f85252b;
                nVar.getClass();
                return as2.h.n(cVar, bArr);
            default:
                byte[] bArr2 = (byte[]) obj;
                int i16 = n.f85263g;
                bArr2.getClass();
                byte[] bArr3 = r.v(bArr2).f85277b;
                int length = bArr3.length - 16;
                int i17 = 0;
                if (length < 0) {
                    length = 0;
                }
                List listB0 = u.b0(length, bArr3);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : listB0) {
                    if (((Number) obj2).byteValue() <= 0) {
                        int i18 = 10;
                        arrayList = new ArrayList(y.r(arrayList2, 10));
                        it = arrayList2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(Character.valueOf((char) ((Number) it.next()).byteValue()));
                        }
                        cArr = new char[arrayList.size()];
                        it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            cArr[i17] = ((Character) it3.next()).charValue();
                            i17++;
                        }
                        String str = new String(cArr);
                        cVar.getClass();
                        e13.o oVarM = as2.h.m(cVar, nVar.w(), "Failed to getBalanceAndLastTopUpRecord");
                        gw.j jVar = new gw.j(new gw1.d(nVar, i18, cVar, str), 19);
                        int i19 = w03.b.f181178a;
                        return new e13.j(oVarM, jVar);
                    }
                    arrayList2.add(obj2);
                }
                int i110 = 10;
                arrayList = new ArrayList(y.r(arrayList2, 10));
                it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Character.valueOf((char) ((Number) it.next()).byteValue()));
                }
                cArr = new char[arrayList.size()];
                it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    cArr[i17] = ((Character) it3.next()).charValue();
                    i17++;
                }
                String str2 = new String(cArr);
                cVar.getClass();
                e13.o oVarM2 = as2.h.m(cVar, nVar.w(), "Failed to getBalanceAndLastTopUpRecord");
                gw.j jVar2 = new gw.j(new gw1.d(nVar, i110, cVar, str2), 19);
                int i111 = w03.b.f181178a;
                return new e13.j(oVarM2, jVar2);
        }
    }
}
