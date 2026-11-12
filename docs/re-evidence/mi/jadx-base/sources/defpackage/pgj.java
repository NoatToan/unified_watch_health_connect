package defpackage;

import org.joda.time.DateTimeZone;

/* JADX INFO: loaded from: classes3.dex */
public class pgj extends i00 implements flh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pgj f30379a = new pgj();

    @Override // defpackage.i00, defpackage.acd, defpackage.flh
    public bw3 a(Object obj, DateTimeZone dateTimeZone) {
        return b(obj, null).withZone(dateTimeZone);
    }

    @Override // defpackage.i00, defpackage.acd, defpackage.flh
    public bw3 b(Object obj, bw3 bw3Var) {
        return bw3Var == null ? wq5.c(((ogj) obj).getChronology()) : bw3Var;
    }

    @Override // defpackage.i00, defpackage.flh
    public int[] c(ogj ogjVar, Object obj, bw3 bw3Var) {
        ogj ogjVar2 = (ogj) obj;
        int size = ogjVar.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ogjVar2.get(ogjVar.getFieldType(i));
        }
        bw3Var.validate(ogjVar, iArr);
        return iArr;
    }

    @Override // defpackage.ck4
    public Class<?> e() {
        return ogj.class;
    }
}
