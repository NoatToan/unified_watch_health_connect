package qy;

import hd1.o;
import hs1.c;
import hs1.d;
import j70.j;
import java.util.List;
import n70.a0;
import p005kotlin.Metadata;
import r53.i;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B3\u0012\"\u0010\b\u001a\u001e\u0012\u001a\u0012\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00040\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lqy/b;", "Ln70/a0;", "Lr53/i;", "Lry/a;", "Lj70/j;", "", "", "Lhd1/o;", "data", "Lae0/b;", "userSummariesUseCase", "<init>", "(Lr53/i;Lae0/b;)V", "gcm-calories_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements a0<i<? extends ry.a>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<j<List<String>, o>> f148464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ae0.b f148465b;

    public b(i<j<List<String>, o>> iVar, ae0.b bVar) {
        iVar.getClass();
        bVar.getClass();
        this.f148464a = iVar;
        this.f148465b = bVar;
    }

    public static final Double c(b bVar, d dVar, o oVar) {
        c calories;
        Integer burnedTotal;
        bVar.getClass();
        Double dValueOf = (dVar == null || (calories = dVar.getCalories()) == null || (burnedTotal = calories.getBurnedTotal()) == null) ? null : Double.valueOf(burnedTotal.intValue());
        Double dValueOf2 = oVar != null ? Double.valueOf(oVar.f83393b) : null;
        if (dValueOf == null || dValueOf2 == null) {
            return dValueOf == null ? dValueOf2 : dValueOf;
        }
        return Double.valueOf(Math.max(dValueOf.doubleValue(), dValueOf2.doubleValue()));
    }

    @Override // n70.a0
    public final String getTag() {
        return "GetCaloriesBurnedDataUseCase";
    }

    @Override // n70.a0
    public final i<? extends ry.a> invoke() {
        return new a(this.f148464a, this);
    }
}
