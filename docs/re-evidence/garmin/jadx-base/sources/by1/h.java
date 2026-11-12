package by1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.koin.core.parameter.ParametersHolderKt;
import p3.p0;
import p3.x3;
import sm1.a0;
import z2.d1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class h implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x3 f22186b;

    public /* synthetic */ h(x3 x3Var, int i14) {
        this.f22185a = i14;
        this.f22186b = x3Var;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f22185a;
        x3 x3Var = this.f22186b;
        switch (i14) {
            case 0:
                j jVar = j.f22190a;
                return p0.n(((dy1.p) x3Var.getF182175a()).f61599e);
            case 1:
                vs.a aVar = ((ys.b) x3Var.getF182175a()).f199162d;
                return p0.n(Boolean.valueOf(p005kotlin.jvm.internal.s.g(aVar != null ? aVar.f179693b : null, ys.a.g.f199158a)));
            case 2:
                return Float.valueOf(((Number) x3Var.getF182175a()).floatValue());
            case 3:
                return Float.valueOf(((Number) x3Var.getF182175a()).floatValue());
            case 4:
                return ParametersHolderKt.parametersOf((Map) x3Var.getF182175a(), zb0.l.ALL);
            case 5:
                return Integer.valueOf(((a0) x3Var.getF182175a()).f160090f);
            case 6:
                Boolean bool = (Boolean) x3Var.getF182175a();
                bool.booleanValue();
                return bool;
            case 7:
                return Boolean.valueOf(((Number) x3Var.getF182175a()).floatValue() > 0.0f);
            case 8:
                return Boolean.valueOf(((Number) x3Var.getF182175a()).floatValue() > 0.0f);
            case 9:
                return Float.valueOf(((Number) x3Var.getF182175a()).floatValue());
            case 10:
                List list = (List) x3Var.getF182175a();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (p005kotlin.jvm.internal.s.g(((lc.v) obj).f111882b.f111772a, "composable")) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            case 11:
                return Integer.valueOf(((Number) x3Var.getF182175a()).intValue() + 4);
            case 12:
                return ParametersHolderKt.parametersOf((Map) x3Var.getF182175a(), null);
            case 13:
                return Integer.valueOf(((Number) x3Var.getF182175a()).intValue() + 4);
            case 14:
                return Integer.valueOf(((Number) x3Var.getF182175a()).intValue());
            case 15:
                return Integer.valueOf(((i53.c) x3Var.getF182175a()).size());
            case 16:
                return n4.c.a(((n4.c) x3Var.getF182175a()).f123544a);
            default:
                s1.o oVar = d1.f201559a;
                return n4.c.a(((n4.c) x3Var.getF182175a()).f123544a);
        }
    }
}
