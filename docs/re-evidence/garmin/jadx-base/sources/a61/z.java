package a61;

import androidx.appcompat.widget.AppCompatButton;
import java.util.LinkedHashMap;
import lc.u0;
import org.joda.time.LocalDate;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class z implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.performance.b f1697b;

    public /* synthetic */ z(com.garmin.android.apps.connectmobile.performance.b bVar, int i14) {
        this.f1696a = i14;
        this.f1697b = bVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        o71.e eVarA;
        p71.c cVar;
        p71.a aVar;
        int i14 = this.f1696a;
        com.garmin.android.apps.connectmobile.performance.b bVar = this.f1697b;
        switch (i14) {
            case 0:
                Boolean bool = (Boolean) obj;
                com.garmin.android.apps.connectmobile.performance.b.a aVar2 = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                AppCompatButton appCompatButtonF = bVar.f();
                bool.getClass();
                appCompatButtonF.setSelected(bool.booleanValue());
                o71.i iVar = bVar.f39859f;
                LinkedHashMap linkedHashMap = iVar.f130243e;
                j23.g<LocalDate> gVar = bVar.f39858e;
                o71.e eVar = (o71.e) linkedHashMap.get(gVar);
                if (eVar != null) {
                    eVarA = o71.e.b(eVar);
                } else {
                    o71.e.b bVar2 = o71.e.f130175g;
                    o71.g gVar2 = bVar.f39857d;
                    bVar2.getClass();
                    eVarA = new o71.e.a(gVar2, gVar).a();
                }
                eVarA.a(iVar.y4(), bVar.f39856c);
                bVar.a(eVarA);
                return Unit.INSTANCE;
            case 1:
                o71.e eVar2 = (o71.e) obj;
                com.garmin.android.apps.connectmobile.performance.b.a aVar3 = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                bVar.b(eVar2 != null ? o71.e.b(eVar2) : null);
                return Unit.INSTANCE;
            default:
                int iIntValue = ((Integer) obj).intValue();
                com.garmin.android.apps.connectmobile.performance.b.a aVar4 = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                if (iIntValue != 0) {
                    cVar = iIntValue != 1 ? null : p71.c.f136305b;
                } else {
                    cVar = p71.c.f136304a;
                }
                if (cVar != null) {
                    o71.i iVar2 = bVar.f39859f;
                    int i15 = o71.i.c.f130246a[cVar.ordinal()];
                    if (i15 == 1) {
                        l.f1621a.getClass();
                        aVar = (p71.a) l.f1622b.getValue();
                    } else {
                        if (i15 != 2) {
                            u0.r();
                            return null;
                        }
                        l.f1621a.getClass();
                        aVar = (p71.a) l.f1623c.getValue();
                    }
                    iVar2.f130240b.j(new o71.i.b(cVar, aVar));
                }
                return Unit.INSTANCE;
        }
    }
}
