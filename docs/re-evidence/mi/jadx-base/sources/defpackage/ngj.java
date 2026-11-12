package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class ngj extends i00 implements sfd, s67, vqh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ngj f27910a = new ngj();

    @Override // defpackage.vqh
    public void d(fgj fgjVar, Object obj, bw3 bw3Var) {
        mgj mgjVar = (mgj) obj;
        if (bw3Var == null) {
            bw3Var = wq5.j(mgjVar);
        }
        int[] iArr = bw3Var.get(fgjVar, mgjVar.getStartMillis(), mgjVar.getEndMillis());
        for (int i = 0; i < iArr.length; i++) {
            fgjVar.setValue(i, iArr[i]);
        }
    }

    @Override // defpackage.ck4
    public Class<?> e() {
        return mgj.class;
    }

    @Override // defpackage.s67
    public long f(Object obj) {
        return ((mgj) obj).toDurationMillis();
    }

    @Override // defpackage.i00, defpackage.sfd
    public boolean h(Object obj, bw3 bw3Var) {
        return true;
    }

    @Override // defpackage.sfd
    public void j(egj egjVar, Object obj, bw3 bw3Var) {
        mgj mgjVar = (mgj) obj;
        egjVar.setInterval(mgjVar);
        if (bw3Var != null) {
            egjVar.setChronology(bw3Var);
        } else {
            egjVar.setChronology(mgjVar.getChronology());
        }
    }
}
