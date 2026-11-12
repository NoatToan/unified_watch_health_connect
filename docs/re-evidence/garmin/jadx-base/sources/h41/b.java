package h41;

import e23.l;
import i41.h;
import java.util.List;
import java.util.Map;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class b implements l<LocalDate, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List<f> f81605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map<String, i41.f> f81606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocalDate f81607c;

    public b(List<f> list, Map<String, i41.f> map, LocalDate localDate) {
        this.f81605a = list;
        this.f81606b = map;
        this.f81607c = localDate;
    }

    @Override // e23.l
    public final Unit invoke(LocalDate localDate) {
        Float f14;
        Float fValueOf;
        LocalDate localDate2 = localDate;
        localDate2.getClass();
        i41.f fVar = this.f81606b.get(localDate2.toString());
        f fVar2 = null;
        if (fVar != null) {
            i41.a baseline = fVar.getBaseline();
            if (baseline == null || !t31.b.c(baseline, fVar.getStatus()) || fVar.j() == h.f90947j) {
                f14 = null;
                fValueOf = null;
            } else {
                Integer balancedLow = baseline.getBalancedLow();
                Float fValueOf2 = balancedLow != null ? Float.valueOf(balancedLow.intValue()) : null;
                Integer balancedUpper = baseline.getBalancedUpper();
                fValueOf = balancedUpper != null ? Float.valueOf(balancedUpper.intValue()) : null;
                f14 = fValueOf2;
            }
            Integer weeklyAvg = fVar.getWeeklyAvg();
            h hVarJ = fVar.j();
            boolean z14 = false;
            boolean z15 = (fValueOf == null || f14 == null) ? false : true;
            if (weeklyAvg != null && hVarJ != null) {
                z14 = true;
            }
            if (z15 || z14) {
                fVar2 = new f(Days.daysBetween(this.f81607c, localDate2).getDays(), f14, fValueOf, weeklyAvg, hVarJ);
            }
        }
        this.f81605a.add(fVar2);
        return Unit.INSTANCE;
    }
}
