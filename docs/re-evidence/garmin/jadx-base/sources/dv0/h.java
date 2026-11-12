package dv0;

import android.view.View;
import com.garmin.android.apps.connectmobile.g3;
import p005kotlin.Unit;
import r53.b2;
import r53.o2;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f61391b;

    public /* synthetic */ h(j jVar, int i14) {
        this.f61390a = i14;
        this.f61391b = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        o2<T> o2Var;
        String str;
        Object value3;
        String str2;
        Object value4;
        boolean z14;
        int i14 = this.f61390a;
        j jVar = this.f61391b;
        switch (i14) {
            case 0:
                j.a aVar = j.f61394i;
                ((View) obj).getClass();
                yu0.f fVarF6 = jVar.F6();
                b2 b2Var = fVarF6.f199712j;
                p2 p2Var = fVarF6.f199715m;
                do {
                    value = p2Var.getValue();
                    ((Boolean) value).getClass();
                } while (!p2Var.b(value, Boolean.FALSE));
                p2 p2Var2 = fVarF6.f199717o;
                do {
                    value2 = p2Var2.getValue();
                    o2Var = b2Var.f150540a;
                    ev0.c cVar = (ev0.c) ((g3) o2Var.getValue()).f35301b;
                    str = cVar != null ? cVar.f66155d : null;
                    if (str == null) {
                        str = "";
                    }
                } while (!p2Var2.b(value2, str));
                p2 p2Var3 = fVarF6.f199719q;
                do {
                    value3 = p2Var3.getValue();
                    ev0.c cVar2 = (ev0.c) ((g3) o2Var.getValue()).f35301b;
                    str2 = cVar2 != null ? cVar2.f66156e : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                } while (!p2Var3.b(value3, str2));
                p2 p2Var4 = fVarF6.f199721t;
                do {
                    value4 = p2Var4.getValue();
                    ((Boolean) value4).getClass();
                    ev0.c cVar3 = (ev0.c) ((g3) o2Var.getValue()).f35301b;
                    z14 = false;
                    if (cVar3 != null && cVar3.b()) {
                        z14 = true;
                    }
                } while (!p2Var4.b(value4, Boolean.valueOf(z14)));
                View viewRequireView = jVar.requireView();
                viewRequireView.getClass();
                v22.e.b(viewRequireView);
                jVar.dismiss();
                break;
            default:
                j.a aVar2 = j.f61394i;
                ((b.s) obj).getClass();
                jVar.E6();
                break;
        }
        return Unit.INSTANCE;
    }
}
