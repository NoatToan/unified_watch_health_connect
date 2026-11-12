package p40;

import org.joda.time.DateTimeConstants;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class s implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q40.b f135735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f135736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f135737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1 f135738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p1 f135739f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p1 f135740g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p1 f135741h;

    public /* synthetic */ s(q40.b bVar, e23.l lVar, p1 p1Var, p1 p1Var2, p1 p1Var3, p1 p1Var4, p1 p1Var5, int i14) {
        this.f135734a = i14;
        this.f135735b = bVar;
        this.f135736c = lVar;
        this.f135737d = p1Var;
        this.f135738e = p1Var2;
        this.f135739f = p1Var3;
        this.f135740g = p1Var4;
        this.f135741h = p1Var5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        switch (this.f135734a) {
            case 0:
                int i14 = u.b.f135762a[((u0) this.f135737d.getF182175a()).ordinal()];
                q40.b bVar = this.f135735b;
                e23.l lVar = this.f135736c;
                p1 p1Var = this.f135738e;
                p1 p1Var2 = this.f135739f;
                p1 p1Var3 = this.f135740g;
                if (i14 == 1) {
                    int iIntValue = (((Number) p1Var3.getF182175a()).intValue() * DateTimeConstants.SECONDS_PER_HOUR) + (((Number) p1Var2.getF182175a()).intValue() * 60) + ((Number) p1Var.getF182175a()).intValue();
                    lVar.invoke(new q40.b(bVar.f142574a, bVar.f142575b, bVar.f142576c, bVar.f142577d, bVar.f142578e, bVar.f142579f, bVar.f142580g, bVar.f142581h, iIntValue > 0 ? Integer.valueOf(iIntValue) : null, bVar.f142583j, bVar.f142584k, bVar.f142585l, bVar.f142586m, bVar.f142587n, bVar.f142588o));
                } else {
                    if (i14 != 2) {
                        lc.u0.r();
                        return null;
                    }
                    int iIntValue2 = (((Number) p1Var3.getF182175a()).intValue() * DateTimeConstants.SECONDS_PER_HOUR) + (((Number) p1Var2.getF182175a()).intValue() * 60) + ((Number) p1Var.getF182175a()).intValue();
                    lVar.invoke(new q40.b(bVar.f142574a, bVar.f142575b, bVar.f142576c, bVar.f142577d, bVar.f142578e, bVar.f142579f, bVar.f142580g, bVar.f142581h, bVar.f142582i, iIntValue2 > 0 ? Integer.valueOf(iIntValue2) : null, bVar.f142584k, bVar.f142585l, bVar.f142586m, bVar.f142587n, bVar.f142588o));
                }
                this.f135741h.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            default:
                int i15 = r0.b.f135732a[((u0) this.f135737d.getF182175a()).ordinal()];
                q40.b bVar2 = this.f135735b;
                e23.l lVar2 = this.f135736c;
                p1 p1Var4 = this.f135738e;
                p1 p1Var5 = this.f135739f;
                p1 p1Var6 = this.f135740g;
                if (i15 == 1) {
                    int iIntValue3 = (((Number) p1Var6.getF182175a()).intValue() * DateTimeConstants.SECONDS_PER_HOUR) + (((Number) p1Var5.getF182175a()).intValue() * 60) + ((Number) p1Var4.getF182175a()).intValue();
                    lVar2.invoke(new q40.b(bVar2.f142574a, bVar2.f142575b, bVar2.f142576c, bVar2.f142577d, bVar2.f142578e, bVar2.f142579f, bVar2.f142580g, bVar2.f142581h, iIntValue3 > 0 ? Integer.valueOf(iIntValue3) : null, bVar2.f142583j, bVar2.f142584k, bVar2.f142585l, bVar2.f142586m, bVar2.f142587n, bVar2.f142588o));
                } else {
                    if (i15 != 2) {
                        lc.u0.r();
                        return null;
                    }
                    int iIntValue4 = (((Number) p1Var6.getF182175a()).intValue() * DateTimeConstants.SECONDS_PER_HOUR) + (((Number) p1Var5.getF182175a()).intValue() * 60) + ((Number) p1Var4.getF182175a()).intValue();
                    lVar2.invoke(new q40.b(bVar2.f142574a, bVar2.f142575b, bVar2.f142576c, bVar2.f142577d, bVar2.f142578e, bVar2.f142579f, bVar2.f142580g, bVar2.f142581h, bVar2.f142582i, iIntValue4 > 0 ? Integer.valueOf(iIntValue4) : null, bVar2.f142584k, bVar2.f142585l, bVar2.f142586m, bVar2.f142587n, bVar2.f142588o));
                }
                this.f135741h.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
        }
    }
}
