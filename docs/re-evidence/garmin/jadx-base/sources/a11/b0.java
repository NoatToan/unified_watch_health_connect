package a11;

import b82.t0;
import ew1.f1;
import java.util.List;
import l72.i3;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p3.p1;
import s5.q0;
import s5.w0;
import x5.l0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f257c;

    public /* synthetic */ b0(e23.l lVar, p1 p1Var, int i14) {
        this.f255a = i14;
        this.f256b = lVar;
        this.f257c = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f255a;
        p1 p1Var = this.f257c;
        e23.l lVar = this.f256b;
        switch (i14) {
            case 0:
                b63.v vVar = (b63.v) obj;
                vVar.getClass();
                lVar.invoke(vVar);
                p1Var.setValue(Boolean.FALSE);
                break;
            case 1:
                m4.g0 g0Var = (m4.g0) obj;
                t0 t0Var = t0.f16792a;
                g0Var.getClass();
                p1Var.setValue(Boolean.valueOf(g0Var.b()));
                if (lVar != null) {
                    lVar.invoke(g0Var);
                }
                break;
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                p1Var.setValue(bool);
                lVar.invoke(bool);
                break;
            case 3:
                ge2.b bVar = (ge2.b) obj;
                bVar.getClass();
                p1Var.setValue(bVar);
                lVar.invoke(bVar);
                break;
            case 4:
                LocalDate localDate = (LocalDate) obj;
                localDate.getClass();
                lVar.invoke(localDate);
                p1Var.setValue(Boolean.FALSE);
                break;
            case 5:
                String str = (String) obj;
                str.getClass();
                lVar.invoke(d53.s.f(str));
                p1Var.setValue(str);
                break;
            case 6:
                hv1.f fVar = (hv1.f) obj;
                fVar.getClass();
                p1Var.setValue(Boolean.FALSE);
                lVar.invoke(fVar);
                break;
            case 7:
                hv1.j jVar = (hv1.j) obj;
                jVar.getClass();
                lVar.invoke(jVar);
                p1Var.setValue(Boolean.FALSE);
                break;
            case 8:
                Long l14 = (Long) obj;
                l14.getClass();
                lVar.invoke(l14);
                p1Var.setValue(Boolean.FALSE);
                break;
            case 9:
                e2.f0 f0Var = (e2.f0) obj;
                f0Var.getClass();
                List list = (List) p1Var.getF182175a();
                f0Var.a(list.size(), null, new dr.a.c(list), new z3.e(2039820996, true, new dr.a.d(list, lVar, p1Var)));
                break;
            case 10:
                Integer num = (Integer) obj;
                num.getClass();
                lVar.invoke(num);
                p1Var.setValue(Boolean.FALSE);
                break;
            case 11:
                Long l15 = (Long) obj;
                l15.getClass();
                lVar.invoke(l15);
                p1Var.setValue(Boolean.FALSE);
                break;
            case 12:
                l0 l0Var = (l0) obj;
                f1.a aVar = f1.f66451c;
                l0Var.getClass();
                p1Var.setValue(l0Var);
                lVar.invoke(l0Var.f188878a.f157138b);
                break;
            case 13:
                Integer num2 = (Integer) obj;
                num2.getClass();
                p1Var.setValue(Boolean.FALSE);
                lVar.invoke(num2);
                break;
            case 14:
                Integer num3 = (Integer) obj;
                num3.getClass();
                p1Var.setValue(Boolean.FALSE);
                lVar.invoke(num3);
                break;
            case 15:
                if (((Boolean) obj).booleanValue()) {
                    p1Var.setValue(Boolean.TRUE);
                } else {
                    lVar.invoke(Boolean.FALSE);
                }
                break;
            case 16:
                String str2 = (String) obj;
                str2.getClass();
                p1Var.setValue(str2);
                lVar.invoke(str2);
                break;
            case 17:
                q0 q0Var = (q0) obj;
                p1Var.setValue(q0Var);
                lVar.invoke(q0Var);
                break;
            case 18:
                n4.c cVar = (n4.c) obj;
                q0 q0Var2 = (q0) p1Var.getF182175a();
                if (q0Var2 != null) {
                    lVar.invoke(Integer.valueOf(q0Var2.f157281b.g(cVar.f123544a)));
                }
                break;
            case 19:
                m4.g0 g0Var2 = (m4.g0) obj;
                g0Var2.getClass();
                p1Var.setValue(Boolean.valueOf(g0Var2.a()));
                if (lVar != null) {
                    lVar.invoke(g0Var2);
                }
                break;
            case 20:
                l0 l0Var2 = (l0) obj;
                l0Var2.getClass();
                p1Var.setValue(w0.a(l0Var2.f188879b));
                lVar.invoke(l0Var2.f188878a.f157138b);
                break;
            case 21:
                l0 l0Var3 = (l0) obj;
                l0Var3.getClass();
                s5.c cVar2 = l0Var3.f188878a;
                if (g22.n.c(cVar2.f157138b) <= 50) {
                    lVar.invoke(cVar2.f157138b);
                    p1Var.setValue(l0Var3);
                }
                break;
            case 22:
                l0 l0Var4 = (l0) obj;
                l0Var4.getClass();
                p1Var.setValue(l0Var4);
                lVar.invoke(l0Var4.f188878a.f157138b);
                break;
            case 23:
                List list2 = (List) obj;
                list2.getClass();
                p1Var.setValue(list2);
                lVar.invoke(list2);
                break;
            case 24:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                p1Var.setValue(bool2);
                lVar.invoke(bool2);
                break;
            case 25:
                com.garmin.android.apps.connectmobile.courses.model.c cVar3 = (com.garmin.android.apps.connectmobile.courses.model.c) obj;
                cVar3.getClass();
                p1Var.setValue(cVar3);
                lVar.invoke(cVar3);
                break;
            case 26:
                com.garmin.android.library.mapsdkadapter.i.d dVar = (com.garmin.android.library.mapsdkadapter.i.d) obj;
                dVar.getClass();
                p1Var.setValue(dVar);
                lVar.invoke(dVar);
                break;
            case 27:
                l0 l0Var5 = (l0) obj;
                l0Var5.getClass();
                String str3 = l0Var5.f188878a.f157138b;
                StringBuilder sb3 = new StringBuilder();
                int length = str3.length();
                for (int i15 = 0; i15 < length; i15++) {
                    char cCharAt = str3.charAt(i15);
                    if (Character.isDigit(cCharAt)) {
                        sb3.append(cCharAt);
                    }
                }
                String strT0 = d53.y.t0(1, sb3.toString());
                int length2 = strT0.length();
                p1Var.setValue(new l0(strT0, og.a.l(length2, length2), (w0) null, 4, (p005kotlin.jvm.internal.j) null));
                lVar.invoke(strT0);
                break;
            case 28:
                Boolean bool3 = (Boolean) obj;
                boolean zBooleanValue = bool3.booleanValue();
                p1Var.setValue(bool3);
                if (!zBooleanValue) {
                    lVar.invoke(m52.e.NONE);
                }
                break;
            default:
                i3 i3Var = (i3) obj;
                i3Var.getClass();
                if (p005kotlin.jvm.internal.s.g(i3Var.f111063a, "MENU_SEARCH")) {
                    p1Var.setValue(Boolean.TRUE);
                } else {
                    lVar.invoke(i3Var);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ b0(p1 p1Var, e23.l lVar, int i14) {
        this.f255a = i14;
        this.f257c = p1Var;
        this.f256b = lVar;
    }
}
