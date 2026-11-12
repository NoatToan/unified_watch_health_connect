package ew1;

import com.garmin.android.apps.connectmobile.g3;
import java.util.Collection;
import org.joda.time.LocalDate;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class v1 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f66800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f66801c;

    public /* synthetic */ v1(p3.p1 p1Var, e23.l lVar) {
        this.f66799a = 1;
        this.f66800b = p1Var;
        this.f66801c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f66799a;
        p3.p1 p1Var = this.f66800b;
        e23.l lVar = this.f66801c;
        switch (i14) {
            case 0:
                w1.a aVar = w1.f66814e;
                lVar.invoke((hv1.f) p1Var.getF182175a());
                break;
            case 1:
                j2.a aVar2 = j2.f66533d;
                vt1.e eVar = (vt1.e) p1Var.getF182175a();
                if (eVar != null) {
                    lVar.invoke(eVar);
                }
                break;
            case 2:
                p1Var.setValue(new x5.l0("", 0L, (s5.w0) null, 6, (p005kotlin.jvm.internal.j) null));
                lVar.invoke("");
                break;
            case 3:
                p1Var.setValue(Boolean.FALSE);
                lVar.invoke(pv0.s.NO);
                break;
            case 4:
                if (lVar != null) {
                    lVar.invoke(null);
                }
                p1Var.setValue(Boolean.FALSE);
                break;
            case 5:
                Collection collection = (Collection) ((g3) p1Var.getF182175a()).f35301b;
                lVar.invoke(Boolean.valueOf(!(collection == null || collection.isEmpty())));
                break;
            case 6:
                lVar.invoke(Boolean.TRUE);
                p1Var.setValue(Boolean.FALSE);
                break;
            case 7:
                lVar.invoke(Boolean.TRUE);
                p1Var.setValue(Boolean.FALSE);
                break;
            case 8:
                p1Var.setValue(Boolean.FALSE);
                lVar.invoke(Boolean.TRUE);
                break;
            case 9:
                p1Var.setValue(Boolean.FALSE);
                lVar.invoke(Boolean.TRUE);
                break;
            case 10:
                lVar.invoke(Boolean.TRUE);
                p1Var.setValue(Boolean.FALSE);
                break;
            case 11:
                lVar.invoke(null);
                p1Var.setValue(new x5.l0("", 0L, (s5.w0) null, 6, (p005kotlin.jvm.internal.j) null));
                break;
            case 12:
                p1Var.setValue(new x5.l0("", 0L, (s5.w0) null, 6, (p005kotlin.jvm.internal.j) null));
                lVar.invoke("");
                break;
            case 13:
                p1Var.setValue(Boolean.valueOf(!((Boolean) p1Var.getF182175a()).booleanValue()));
                Boolean bool = (Boolean) p1Var.getF182175a();
                bool.getClass();
                lVar.invoke(bool);
                break;
            case 14:
                p1Var.setValue(Boolean.valueOf(!((Boolean) p1Var.getF182175a()).booleanValue()));
                Boolean bool2 = (Boolean) p1Var.getF182175a();
                bool2.getClass();
                lVar.invoke(bool2);
                break;
            case 15:
                lVar.invoke(Integer.valueOf(((na0.i) p1Var.getF182175a()).f125126b));
                break;
            case 16:
                lVar.invoke((String) p1Var.getF182175a());
                break;
            case 17:
                lVar.invoke(Boolean.TRUE);
                p1Var.setValue(Boolean.FALSE);
                break;
            case 18:
                lVar.invoke(jk0.p.Active);
                p1Var.setValue(Boolean.FALSE);
                break;
            case 19:
                lVar.invoke(jk0.p.Retired);
                p1Var.setValue(Boolean.FALSE);
                break;
            case 20:
                lVar.invoke((LocalDate) p1Var.getF182175a());
                break;
            case 21:
                lVar.invoke((String) p1Var.getF182175a());
                break;
            case 22:
                c80.u uVar = (c80.u) p1Var.getF182175a();
                if (uVar != null) {
                    lVar.invoke(uVar);
                }
                break;
            case 23:
                p1Var.setValue(Boolean.FALSE);
                lVar.invoke(null);
                break;
            case 24:
                lVar.invoke((pe0.d) p1Var.getF182175a());
                break;
            case 25:
                lVar.invoke((i53.c) p1Var.getF182175a());
                break;
            case 26:
                lVar.invoke(((x5.l0) p1Var.getF182175a()).f188878a.f157138b);
                break;
            case 27:
                p1Var.setValue(Boolean.valueOf(!((Boolean) p1Var.getF182175a()).booleanValue()));
                Boolean bool3 = (Boolean) p1Var.getF182175a();
                bool3.getClass();
                lVar.invoke(bool3);
                break;
            case 28:
                lVar.invoke((String) p1Var.getF182175a());
                break;
            default:
                lVar.invoke(w41.a.b.f181948a);
                p1Var.setValue(Boolean.FALSE);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ v1(e23.l lVar, p3.p1 p1Var, int i14) {
        this.f66799a = i14;
        this.f66801c = lVar;
        this.f66800b = p1Var;
    }
}
