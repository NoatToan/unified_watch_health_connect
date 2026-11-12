package zr;

import android.content.Context;
import com.garmin.android.apps.connectmobile.activities.ui.RPESeekBar;
import e2.f0;
import java.util.ArrayList;
import java.util.Map;
import p005kotlin.Unit;
import p3.p1;
import sr.r;
import vd0.s0;
import zs1.o;
import zs1.p;
import zs1.q;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class j implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206739a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f206740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f206741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f206742d;

    public /* synthetic */ j(av1.f fVar, zu1.k kVar, p1 p1Var) {
        this.f206741c = fVar;
        this.f206742d = kVar;
        this.f206740b = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int iIntValue;
        i53.c<av1.g> value;
        int i14 = this.f206739a;
        Object obj2 = this.f206740b;
        Object obj3 = this.f206742d;
        Object obj4 = this.f206741c;
        switch (i14) {
            case 0:
                p1 p1Var = (p1) obj2;
                r rVar = (r) obj3;
                p1 p1Var2 = (p1) obj4;
                Context context = (Context) obj;
                context.getClass();
                RPESeekBar rPESeekBar = new RPESeekBar(context, null, 2, null);
                Integer num = (Integer) p1Var.getF182175a();
                int i15 = 0;
                if (num != null && (iIntValue = num.intValue()) > 0) {
                    i15 = iIntValue / 10;
                }
                rPESeekBar.setProgress(i15);
                rPESeekBar.setOnRPEChangeListener(new l(rVar, p1Var2, p1Var));
                return rPESeekBar;
            case 1:
                i53.c cVar = (i53.c) obj2;
                f0 f0Var = (f0) obj;
                f0Var.getClass();
                f0Var.a(cVar.size(), new p(new z81.b(28), cVar), new q(o.f206877a, cVar), new z3.e(802480018, true, new zs1.r(cVar, (e23.l) obj4, (e23.l) obj3)));
                return Unit.INSTANCE;
            default:
                av1.f fVar = (av1.f) obj4;
                zu1.k kVar = (zu1.k) obj3;
                p1 p1Var3 = (p1) obj2;
                f0 f0Var2 = (f0) obj;
                zu1.k.a aVar = zu1.k.f207122d;
                f0Var2.getClass();
                if (fVar.f13269b) {
                    f0.b(f0Var2, null, new z3.e(545184747, true, new yu1.h(7, kVar, p1Var3)), 3);
                }
                i53.d<hv1.b, i53.c<av1.g>> dVar = fVar.f13268a;
                if (dVar != null) {
                    for (Map.Entry<hv1.b, i53.c<av1.g>> entry : dVar.entrySet()) {
                        if (p1Var3.getF182175a() == hv1.c.ALL) {
                            value = entry.getValue();
                        } else {
                            i53.c<av1.g> value2 = entry.getValue();
                            ArrayList arrayList = new ArrayList();
                            for (av1.g gVar : value2) {
                                if (gVar.f13277h == p1Var3.getF182175a()) {
                                    arrayList.add(gVar);
                                }
                            }
                            value = arrayList;
                        }
                        if (!value.isEmpty()) {
                            f0.b(f0Var2, null, new z3.e(581773199, true, new s0(kVar, 24, entry, value)), 3);
                        }
                    }
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ j(i53.c cVar, e23.l lVar, e23.l lVar2) {
        this.f206740b = cVar;
        this.f206741c = lVar;
        this.f206742d = lVar2;
    }

    public /* synthetic */ j(r rVar, p1 p1Var, p1 p1Var2) {
        this.f206740b = p1Var;
        this.f206742d = rVar;
        this.f206741c = p1Var2;
    }
}
