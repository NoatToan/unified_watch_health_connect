package dv;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import com.garmin.android.apps.connectmobile.R;
import lc.u0;
import o4.f0;
import o4.f1;
import o4.y;
import p005kotlin.Unit;
import p3.m1;
import p3.p1;
import po.r;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class j implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61331a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f61332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f61333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f61334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1 f61335e;

    public /* synthetic */ j(float f14, float f15, po.b bVar, p1 p1Var) {
        this.f61332b = f14;
        this.f61333c = f15;
        this.f61334d = bVar;
        this.f61335e = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f61331a;
        p1 p1Var = this.f61335e;
        Object obj2 = this.f61334d;
        float f14 = this.f61333c;
        float f15 = this.f61332b;
        switch (i14) {
            case 0:
                m1 m1Var = (m1) p1Var;
                q4.f fVar = (q4.f) obj;
                int i15 = com.garmin.android.apps.connectmobile.bic.a.f30723c;
                fVar.getClass();
                y yVarA = fVar.getF142543b().a();
                o4.h hVar = new o4.h();
                hVar.e(f0.b(((com.garmin.android.apps.connectmobile.bic.a) obj2).getColor(R.color.surface_background_hero)));
                o4.j jVarA = o4.m.a();
                Path path = jVarA.f128869b;
                float floatValue = (f15 - m1Var.getFloatValue()) / 2;
                n4.d dVar = new n4.d(-floatValue, f14, m1Var.getFloatValue() + floatValue, f15 + f14);
                f1.b bVar = f1.b.CounterClockwise;
                if (jVarA.f128870c == null) {
                    jVarA.f128870c = new RectF();
                }
                RectF rectF = jVarA.f128870c;
                rectF.getClass();
                rectF.set(dVar.f123547a, dVar.f123548b, dVar.f123549c, dVar.f123550d);
                RectF rectF2 = jVarA.f128870c;
                rectF2.getClass();
                path.addOval(rectF2, o4.m.b(bVar));
                Canvas canvasA = o4.d.a(yVarA);
                int iSave = canvasA.save();
                try {
                    ((o4.c) yVarA).f128816a.clipOutPath(path);
                    ((o4.c) yVarA).f128816a.drawRect(0.0f, 0.0f, Float.intBitsToFloat((int) (fVar.b() >> 32)), Float.intBitsToFloat((int) (fVar.b() & 4294967295L)), hVar.f128857a);
                    return Unit.INSTANCE;
                } finally {
                    canvasA.restoreToCount(iSave);
                }
            default:
                po.b bVar2 = (po.b) obj2;
                a03.y yVar = (a03.y) obj;
                yVar.getClass();
                p1Var.setValue(yVar);
                int i16 = r.a.f138971a[((a03.y) p1Var.getF182175a()).ordinal()];
                if (i16 == 1) {
                    f14 = 0.0f;
                } else if (i16 == 2) {
                    f14 = f15;
                } else if (i16 == 3) {
                    f14 = f15 * 0.5f;
                } else if (i16 != 4) {
                    u0.r();
                    return null;
                }
                bVar2.invoke(Integer.valueOf((int) f14));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ j(com.garmin.android.apps.connectmobile.bic.a aVar, float f14, m1 m1Var, float f15) {
        this.f61334d = aVar;
        this.f61332b = f14;
        this.f61335e = m1Var;
        this.f61333c = f15;
    }
}
