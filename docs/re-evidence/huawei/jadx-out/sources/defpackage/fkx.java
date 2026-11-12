package defpackage;

import java.util.LinkedList;

/* JADX INFO: loaded from: classes7.dex */
public class fkx {
    public static void e(LinkedList linkedList) {
        if (linkedList == null) {
            return;
        }
        int size = linkedList.size();
        for (int i = 0; i < size - 15; i++) {
            linkedList.removeFirst();
        }
    }

    public static float e(fku fkuVar, fku fkuVar2) {
        if (fkuVar == null || fkuVar2 == null) {
            return 0.0f;
        }
        float fB = b(fkuVar, fkuVar2);
        if (fkuVar.e() == 0.0f || fkuVar2.e() == 0.0f) {
            return fB;
        }
        return (float) Math.sqrt(Math.pow(fB, 2.0d) + Math.pow(Math.abs(fkuVar.e() - fkuVar2.e()), 2.0d));
    }

    public static float c(fku fkuVar, fku fkuVar2) {
        if (fkuVar == null || fkuVar2 == null) {
            return 0.0f;
        }
        float fB = b(fkuVar, fkuVar2);
        long jG = fkuVar2.g() - fkuVar.g();
        if (jG <= 0) {
            return 0.0f;
        }
        return (fB * 1000.0f) / jG;
    }

    public static float b(fku fkuVar, fku fkuVar2) {
        if (fkuVar == null || fkuVar2 == null) {
            return 0.0f;
        }
        if (Math.abs(fkuVar.f() - fkuVar2.f()) < 1.0E-9d && Math.abs(fkuVar.i() - fkuVar2.i()) < 1.0E-9d) {
            return 0.0f;
        }
        double dF = fkuVar.f() * 0.017453292519943295d;
        double dF2 = fkuVar2.f() * 0.017453292519943295d;
        double dSin = (Math.sin(dF) * Math.sin(dF2)) + (Math.cos(dF) * Math.cos(dF2) * Math.cos((fkuVar2.i() * 0.017453292519943295d) - (fkuVar.i() * 0.017453292519943295d)));
        if (dSin > 1.0d) {
            dSin = 1.0d;
        }
        if (dSin < -1.0d) {
            dSin = -1.0d;
        }
        return ((float) (Math.acos(dSin) * 6371.0d)) * 1000.0f;
    }
}
