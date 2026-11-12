package yg2;

import com.garmin.proto.generated.GDIDataTypes;
import java.util.ArrayList;
import java.util.Collection;
import p005kotlin.Unit;
import p3.p1;
import r53.p2;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class w implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f197227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f197228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f197229c;

    public /* synthetic */ w(h hVar, p1 p1Var, int i14) {
        this.f197227a = i14;
        this.f197228b = hVar;
        this.f197229c = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, o13.l] */
    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f197227a;
        p1 p1Var = this.f197229c;
        h hVar = this.f197228b;
        switch (i14) {
            case 0:
                Integer numI = d53.t.i((String) p1Var.getF182175a());
                hVar.B4(String.valueOf((numI != null ? numI.intValue() : 0) + 1));
                hVar.A4();
                break;
            default:
                GDIDataTypes.MeasurementUnit measurementUnit = (GDIDataTypes.MeasurementUnit) p1Var.getF182175a();
                measurementUnit.getClass();
                hVar.f197008p.k(null, Boolean.TRUE);
                p2 p2Var = hVar.f196996d;
                vf2.e eVar = (vf2.e) p2Var.getValue();
                if (eVar != null) {
                    p2 p2Var2 = hVar.f197000h;
                    ArrayList arrayListD1 = p13.h0.d1((Collection) p2Var2.getValue());
                    arrayListD1.add(eVar);
                    p2Var2.setValue(p13.h0.T(i53.a.e(arrayListD1)));
                }
                fg2.f fVar = (fg2.f) hVar.f196993a.getValue();
                fVar.getClass();
                int i15 = hVar.f197013w;
                Integer numValueOf = Integer.valueOf(hVar.f197014x);
                Float fValueOf = Float.valueOf(hVar.f197015y);
                vf2.e eVar2 = (vf2.e) p2Var.getValue();
                String str = eVar2 != null ? eVar2.f177929a : null;
                vf2.e eVar3 = (vf2.e) p2Var.getValue();
                fVar.f71478b.f131773b.f().i(i15, numValueOf, fValueOf, measurementUnit, str, eVar3 != null ? eVar3.f177932d : null);
                Unit unit = Unit.INSTANCE;
                hVar.A4();
                break;
        }
        return Unit.INSTANCE;
    }
}
