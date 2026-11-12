package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public final class b5 extends g5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q7[] f15998a;

    public b5(Map map) {
        Collection collection = map == null ? null : (Collection) map.get(m1.f16208c);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(BarcodeFormat.EAN_13)) {
                arrayList.add(new o2());
            } else if (collection.contains(BarcodeFormat.UPC_A)) {
                arrayList.add(new l7());
            }
            if (collection.contains(BarcodeFormat.EAN_8)) {
                arrayList.add(new q2());
            }
            if (collection.contains(BarcodeFormat.UPC_E)) {
                arrayList.add(new s7());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new o2());
            arrayList.add(new q2());
            arrayList.add(new s7());
        }
        this.f15998a = (q7[]) arrayList.toArray(new q7[arrayList.size()]);
    }

    @Override // com.huawei.hms.scankit.p.g5
    public s6 a(int i, r rVar, Map map) throws a {
        for (int[] iArr : q7.b(rVar)) {
            for (q7 q7Var : this.f15998a) {
                try {
                    s6 s6VarA = q7Var.a(i, rVar, iArr, map);
                    boolean z = s6VarA.c() == BarcodeFormat.EAN_13 && s6VarA.k().charAt(0) == '0';
                    Collection collection = map == null ? null : (Collection) map.get(m1.f16208c);
                    return (z && (collection == null || collection.contains(BarcodeFormat.UPC_A))) ? new s6(s6VarA.k().substring(1), s6VarA.i(), s6VarA.j(), BarcodeFormat.UPC_A) : s6VarA;
                } catch (a unused) {
                }
            }
        }
        throw a.a();
    }
}
