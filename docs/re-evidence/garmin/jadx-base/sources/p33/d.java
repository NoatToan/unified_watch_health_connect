package p33;

/* JADX INFO: loaded from: classes3.dex */
public class d implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r1 f135422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j[] f135423b;

    public d(r1 r1Var, j[] jVarArr) {
        this.f135422a = r1Var;
        this.f135423b = jVarArr;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        j jVar;
        int iIntValue = ((Number) obj).intValue();
        r1 r1Var = this.f135422a;
        if (r1Var != null && (jVar = r1Var.f135512a.get(Integer.valueOf(iIntValue))) != null) {
            return jVar;
        }
        if (iIntValue >= 0) {
            j[] jVarArr = this.f135423b;
            if (iIntValue < jVarArr.length) {
                return jVarArr[iIntValue];
            }
        }
        j.f135458e.getClass();
        return j.f135459f;
    }
}
