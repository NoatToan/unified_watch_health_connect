package c22;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
@Deprecated
public class u1 {
    @Deprecated
    public static String a(long j8) {
        da2.f.a().getClass();
        da2.d dVarB = da2.d.b();
        String macAddress = null;
        da2.b bVar = dVarB != null ? dVarB.f58886a.f111646e : null;
        for (da2.l lVar : bVar != null ? bVar.c(j8) : new da2.l[0]) {
            macAddress = lVar.getMacAddress();
            if (lVar.getConnectionType() == 1) {
                return macAddress;
            }
        }
        return macAddress;
    }

    @Deprecated
    public static String b(long j8) {
        da2.f.a().getClass();
        da2.d dVarB = da2.d.b();
        String macAddress = null;
        da2.b bVar = dVarB != null ? dVarB.f58886a.f111646e : null;
        for (da2.l lVar : bVar != null ? bVar.c(j8) : new da2.l[0]) {
            macAddress = lVar.getMacAddress();
            if (lVar.getConnectionType() == 2) {
                return macAddress;
            }
        }
        return macAddress;
    }

    @Deprecated
    public static ArrayList c(long j8) {
        ArrayList arrayList = new ArrayList();
        da2.f.a().getClass();
        da2.d dVarB = da2.d.b();
        da2.b bVar = dVarB != null ? dVarB.f58886a.f111646e : null;
        for (da2.l lVar : bVar != null ? bVar.c(j8) : new da2.l[0]) {
            arrayList.add(lVar.getMacAddress());
        }
        return arrayList;
    }
}
