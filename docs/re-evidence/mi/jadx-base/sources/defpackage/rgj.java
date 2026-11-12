package defpackage;

import org.joda.time.PeriodType;

/* JADX INFO: loaded from: classes3.dex */
public class rgj extends i00 implements vqh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rgj f32524a = new rgj();

    @Override // defpackage.vqh
    public void d(fgj fgjVar, Object obj, bw3 bw3Var) {
        fgjVar.setPeriod((qgj) obj);
    }

    @Override // defpackage.ck4
    public Class<?> e() {
        return qgj.class;
    }

    @Override // defpackage.i00, defpackage.vqh
    public PeriodType g(Object obj) {
        return ((qgj) obj).getPeriodType();
    }
}
