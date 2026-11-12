package by1;

import android.content.Intent;
import java.util.ArrayList;
import nx1.c0;
import p005kotlin.Unit;
import p3.p1;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class i implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ey1.a f22188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f22189c;

    public /* synthetic */ i(ey1.a aVar, p1 p1Var, int i14) {
        this.f22187a = i14;
        this.f22188b = aVar;
        this.f22189c = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        Intent intent;
        com.garmin.android.apps.connectmobile.repcounting.model.d dVar;
        Object value;
        dy1.g gVar;
        ArrayList arrayList;
        int i14 = this.f22187a;
        p1 p1Var = this.f22189c;
        ey1.a aVar = this.f22188b;
        switch (i14) {
            case 0:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                j jVar = j.f22190a;
                p1Var.setValue(bool);
                aVar.P4(Boolean.valueOf(!zBooleanValue));
                break;
            default:
                f.a aVar2 = (f.a) obj;
                cy1.c cVar = cy1.c.f56798a;
                aVar2.getClass();
                if (aVar2.f67585a == -1 && (intent = aVar2.f67586b) != null && (dVar = (com.garmin.android.apps.connectmobile.repcounting.model.d) intent.getParcelableExtra("RESULT_SELECTED_EXERCISE")) != null) {
                    String str = (String) p1Var.getF182175a();
                    str.getClass();
                    c0 c0Var = aVar.f67281m;
                    c0Var.getClass();
                    p2 p2Var = c0Var.f128212f;
                    do {
                        value = p2Var.getValue();
                        gVar = (dy1.g) value;
                        i53.c<dy1.h> cVar2 = gVar.f61555b;
                        arrayList = new ArrayList(p13.y.r(cVar2, 10));
                        for (dy1.h hVarA : cVar2) {
                            if (p005kotlin.jvm.internal.s.g(hVarA.f61556a, str)) {
                                String str2 = dVar.f41107f;
                                String str3 = str2 == null ? "" : str2;
                                String str4 = dVar.f41102a;
                                String str5 = dVar.f41106e;
                                hVarA = dy1.h.a(hVarA, str5 != null ? str5 : "", str4, false, false, false, false, str3, 892);
                            }
                            arrayList.add(hVarA);
                        }
                    } while (!p2Var.b(value, dy1.g.a(gVar, i53.a.e(arrayList))));
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
