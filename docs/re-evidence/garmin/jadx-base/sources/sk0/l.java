package sk0;

import com.garmin.proto.generated.GDIDataTypes;
import i3.pc;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class l implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f159717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f159718c;

    public /* synthetic */ l(p3.p1 p1Var, p3.p1 p1Var2, int i14) {
        this.f159716a = i14;
        this.f159717b = p1Var;
        this.f159718c = p1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        boolean z14;
        boolean z15;
        switch (this.f159716a) {
            case 0:
                b63.o oVar = (b63.o) obj;
                if (oVar != null) {
                    p3.p1 p1Var = this.f159717b;
                    p1Var.setValue(n0.b((n0) p1Var.getF182175a(), null, null, null, null, oVar, null, null, null, null, null, false, null, null, 8175));
                }
                this.f159718c.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 1:
                b63.o oVar2 = (b63.o) obj;
                if (oVar2 != null) {
                    p3.p1 p1Var2 = this.f159717b;
                    p1Var2.setValue(n0.b((n0) p1Var2.getF182175a(), null, null, null, null, null, null, null, null, oVar2, null, false, null, null, 7935));
                }
                this.f159718c.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 2:
                c80.u uVar = (c80.u) obj;
                uVar.getClass();
                if (uVar != ((n0) this.f159717b.getF182175a()).f159762a) {
                    this.f159718c.setValue(uVar);
                }
                return Unit.INSTANCE;
            case 3:
                String str = (String) obj;
                str.getClass();
                int length = str.length();
                p3.p1 p1Var3 = this.f159717b;
                if (length > 250) {
                    p1Var3.setValue(o0.b((o0) p1Var3.getF182175a(), false, false, true, false, false, 27));
                } else if (((o0) p1Var3.getF182175a()).f159791c) {
                    p1Var3.setValue(o0.b((o0) p1Var3.getF182175a(), false, false, false, false, false, 27));
                }
                p3.p1 p1Var4 = this.f159718c;
                p1Var4.setValue(n0.b((n0) p1Var4.getF182175a(), null, null, null, str, null, null, null, null, null, null, false, null, null, 8183));
                return Unit.INSTANCE;
            case 4:
                s5.q0 q0Var = (s5.q0) obj;
                q0Var.getClass();
                if (!((Boolean) this.f159717b.getF182175a()).booleanValue() && q0Var.e()) {
                    this.f159718c.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 5:
                s5.q0 q0Var2 = (s5.q0) obj;
                q0Var2.getClass();
                if (!((Boolean) this.f159717b.getF182175a()).booleanValue() && q0Var2.e()) {
                    this.f159718c.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 6:
                GDIDataTypes.MeasurementUnit measurementUnit = (GDIDataTypes.MeasurementUnit) obj;
                measurementUnit.getClass();
                this.f159717b.setValue(measurementUnit);
                this.f159718c.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 7:
                t41.g gVar = (t41.g) obj;
                gVar.getClass();
                this.f159717b.setValue(gVar.name());
                z41.l.b(this.f159718c, true);
                return Unit.INSTANCE;
            case 8:
                b82.t0.a aVar = (b82.t0.a) obj;
                aVar.getClass();
                int i14 = z50.e.a.f202457a[aVar.ordinal()];
                p3.p1 p1Var5 = this.f159718c;
                if (i14 == 1) {
                    Boolean bool = Boolean.FALSE;
                    this.f159717b.setValue(bool);
                    p1Var5.setValue(bool);
                } else {
                    if (i14 != 2) {
                        lc.u0.r();
                        return null;
                    }
                    p1Var5.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 9:
                zo1.b bVar = (zo1.b) obj;
                bVar.getClass();
                this.f159717b.setValue(Boolean.TRUE);
                this.f159718c.setValue(bVar);
                return Unit.INSTANCE;
            case 10:
                zo1.a aVar2 = (zo1.a) obj;
                aVar2.getClass();
                this.f159717b.setValue(Boolean.TRUE);
                this.f159718c.setValue(aVar2);
                return Unit.INSTANCE;
            case 11:
                ((pc) obj).getClass();
                if (((Boolean) this.f159717b.getF182175a()).booleanValue()) {
                    this.f159718c.setValue(Boolean.TRUE);
                    z14 = false;
                } else {
                    z14 = true;
                }
                return Boolean.valueOf(z14);
            default:
                ((pc) obj).getClass();
                if (((Boolean) this.f159717b.getF182175a()).booleanValue()) {
                    this.f159718c.setValue(Boolean.TRUE);
                    z15 = false;
                } else {
                    z15 = true;
                }
                return Boolean.valueOf(z15);
        }
    }
}
