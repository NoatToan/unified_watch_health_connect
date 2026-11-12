package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public class j6 implements o6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w1 f16164a = new w1();

    @Override // com.huawei.hms.scankit.p.o6
    public final s6 a(p pVar, Map map) throws a {
        x1 x1VarA;
        boolean z = true;
        r3.j++;
        try {
            k2 k2VarA = new h2(pVar.b()).a(map);
            boolean z2 = a(k2VarA) > 0;
            try {
                x1VarA = this.f16164a.a(k2VarA.a(), map);
                z = false;
            } catch (Exception unused) {
                x1VarA = null;
            }
            if (z && z2) {
                return new s6(null, null, k2VarA.b(), BarcodeFormat.QR_CODE);
            }
            if (z) {
                throw a.a();
            }
            if (x1VarA == null) {
                return null;
            }
            u6[] u6VarArrD = k2VarA.d();
            if (x1VarA.b() instanceof i6) {
                ((i6) x1VarA.b()).a(u6VarArrD);
            }
            s6 s6Var = new s6(x1VarA.d(), x1VarA.c(), u6VarArrD, BarcodeFormat.QR_CODE);
            s6Var.b(k2VarA.b());
            return s6Var;
        } catch (a unused2) {
            throw a.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    private boolean a(s sVar, int i, int i2) {
        int i3;
        if (sVar != null && sVar.b() >= 21 && sVar.d() >= 21) {
            ?? B = sVar.b(i, i2);
            if (sVar.b(i + 1, i2)) {
                i3 = B;
                i3 = B + 1;
            }
            i3 = B;
            int i4 = i3;
            if (!sVar.b(i + 2, i2)) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (sVar.b(i + 3, i2)) {
                i5 = i4 + 1;
            }
            int i6 = i5;
            if (sVar.b(i - 1, i2)) {
                i6 = i5 + 1;
            }
            int i7 = i6;
            if (!sVar.b(i - 2, i2)) {
                i7 = i6 + 1;
            }
            int i8 = i7;
            if (sVar.b(i - 3, i2)) {
                i8 = i7 + 1;
            }
            int i9 = i8;
            if (sVar.b(i, i2 + 1)) {
                i9 = i8 + 1;
            }
            int i10 = i9;
            if (!sVar.b(i, i2 + 2)) {
                i10 = i9 + 1;
            }
            int i11 = i10;
            if (sVar.b(i, i2 + 3)) {
                i11 = i10 + 1;
            }
            int i12 = i11;
            if (sVar.b(i, i2 - 1)) {
                i12 = i11 + 1;
            }
            int i13 = i12;
            if (!sVar.b(i, i2 - 2)) {
                i13 = i12 + 1;
            }
            int i14 = i13;
            if (sVar.b(i, i2 - 3)) {
                i14 = i13 + 1;
            }
            if (i14 > 10) {
                return true;
            }
        }
        return false;
    }

    public static void a(p4 p4Var) {
        int iA = p4Var.a();
        if (iA == p4Var.c() && iA == 805) {
            r3.v[0] = true;
        }
    }

    public static void a(p4 p4Var, s6 s6Var) {
        boolean z;
        int iA = p4Var.a();
        int iC = p4Var.c();
        while (true) {
            if (r3.w.size() == 0) {
                z = false;
                break;
            }
            int iIntValue = ((Integer) r3.w.pop()).intValue();
            if (iIntValue != 0 && iA % iIntValue == 0) {
                z = true;
                break;
            }
        }
        if (iA != iC || !z || s6Var == null || s6Var.j() == null) {
            return;
        }
        if ((Math.max(Math.max(s6Var.j()[0].b(), s6Var.j()[1].b()), s6Var.j()[2].b()) - Math.min(Math.min(s6Var.j()[0].b(), s6Var.j()[1].b()), s6Var.j()[2].b())) * (Math.max(Math.max(s6Var.j()[0].c(), s6Var.j()[1].c()), s6Var.j()[2].c()) - Math.min(Math.min(s6Var.j()[0].c(), s6Var.j()[1].c()), s6Var.j()[2].c())) > ((double) (iA * iC)) * 0.8d) {
            r3.v[1] = true;
        }
    }

    private int a(k2 k2Var) {
        r3.i = k2Var.c();
        s sVarA = k2Var.a();
        int[] iArr = {3, sVarA.d() - 4, 3};
        int[] iArr2 = {3, 3, sVarA.b() - 4};
        int i = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            if (a(sVarA, iArr[i2], iArr2[i2])) {
                i++;
            }
        }
        return i;
    }
}
