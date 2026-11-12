package o72;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.trails.presentation.TrailElevationFullscreenChartActivity;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class z2 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f130725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f130726c;

    public /* synthetic */ z2(Context context, p3.p1 p1Var, int i14) {
        this.f130724a = i14;
        this.f130725b = context;
        this.f130726c = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        i53.c<o20.a> cVar;
        pt1.q qVar;
        List<jk0.g> list;
        List<jk0.s> list2;
        i53.f fVarJ;
        int i14 = this.f130724a;
        List listB1 = null;
        p3.p1 p1Var = this.f130726c;
        Context context = this.f130725b;
        switch (i14) {
            case 0:
                r1.c(context, "Action1");
                p1Var.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 1:
                r1.c(context, "Action2");
                p1Var.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 2:
                r1.c(context, "Action1");
                p1Var.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 3:
                r1.c(context, "Action2");
                p1Var.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 4:
                p1Var.setValue(Boolean.FALSE);
                r1.c(context, "Action2");
                return Unit.INSTANCE;
            case 5:
                r1.c(context, "Action2");
                p1Var.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 6:
                r1.c(context, "Action1");
                p1Var.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 7:
                r1.c(context, "Action2");
                p1Var.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 8:
                r1.c(context, "Action1");
                p1Var.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 9:
                r1.c(context, "Action2");
                p1Var.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 10:
                r1.c(context, "Action1");
                p1Var.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 11:
                r1.c(context, "Action2");
                p1Var.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 12:
                r1.c(context, "Action2");
                p1Var.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 13:
                r1.c(context, "Action2");
                p1Var.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 14:
                ot1.u uVar = ot1.u.f133824a;
                TrailElevationFullscreenChartActivity.a aVar = TrailElevationFullscreenChartActivity.f45086a;
                pt1.p pVar = ((pt1.o) p1Var.getF182175a()).f140912j;
                String str = (pVar == null || (qVar = pVar.f140931c) == null) ? null : qVar.f140953a;
                pt1.p pVar2 = ((pt1.o) p1Var.getF182175a()).f140912j;
                if (pVar2 != null && (cVar = pVar2.f140934f) != null) {
                    listB1 = p13.h0.b1(cVar);
                }
                pt1.b bVar = new pt1.b(str, listB1);
                aVar.getClass();
                context.getClass();
                Intent intent = new Intent(context, (Class<?>) TrailElevationFullscreenChartActivity.class);
                intent.putExtra("trail_name_key", bVar);
                context.startActivity(intent);
                return Unit.INSTANCE;
            case 15:
                rk0.j jVar = (rk0.j) p1Var.getF182175a();
                jVar.getClass();
                context.getClass();
                jk0.j jVar2 = jVar.f153165a;
                if (jVar2 == null || (list = jVar2.f99269h) == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    am.x0 x0Var = (am.x0) ((jk0.g) it.next()).f99251d.getValue();
                    if (x0Var != null) {
                        arrayList.add(x0Var);
                    }
                }
                uk0.i.f171830a.getClass();
                List listI = uk0.i.i(context, arrayList);
                if (listI != null) {
                    return i53.a.e(listI);
                }
                return null;
            case 16:
                Collator collator = Collator.getInstance();
                collator.setStrength(1);
                jk0.j jVar3 = ((rk0.j) p1Var.getF182175a()).f153165a;
                if (jVar3 != null && (list2 = jVar3.f99268g) != null) {
                    ArrayList arrayList2 = new ArrayList(p13.y.r(list2, 10));
                    Iterator<T> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(og2.k.N((jk0.s) it3.next()));
                    }
                    List listN0 = p13.h0.N0(arrayList2, new rk0.h.d(collator, context));
                    if (listN0 != null && (fVarJ = i53.a.j(listN0)) != null) {
                        return fVarJ;
                    }
                }
                return j53.l.b();
            case 17:
                rk0.f0 f0Var = ((rk0.g0) p1Var.getF182175a()).f153128a;
                f0Var.getClass();
                context.getClass();
                i53.c<am.x0> cVar2 = f0Var.f153112l;
                if (cVar2 == null) {
                    return null;
                }
                uk0.i.f171830a.getClass();
                return i53.a.e(uk0.i.i(context, cVar2));
            case 18:
                ht.s sVar = ht.s.f85508a;
                lt.e.l lVar = new lt.e.l(lt.e.a.Tapped);
                sVar.getClass();
                ht.s.a(lVar);
                j22.b.f96736a.getClass();
                p1Var.setValue(Boolean.valueOf(!j22.b.b(context)));
                return Unit.INSTANCE;
            case 19:
                j22.b.f96736a.getClass();
                Intent intentE = j22.b.e(context);
                if (intentE != null) {
                    intentE.addFlags(268435456);
                    context.startActivity(intentE);
                }
                p1Var.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            default:
                j22.b.f96736a.getClass();
                Intent intentE2 = j22.b.e(context);
                if (intentE2 != null) {
                    intentE2.addFlags(268435456);
                    context.startActivity(intentE2);
                }
                p1Var.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ z2(p3.p1 p1Var, Context context, int i14) {
        this.f130724a = i14;
        this.f130726c = p1Var;
        this.f130725b = context;
    }
}
