package i71;

import java.util.ArrayList;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li71/d;", "", "<init>", "()V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {
    public static y a(LocalDate localDate, LocalDate localDate2, int i14, com.garmin.android.apps.connectmobile.performance.model.b bVar) {
        return new y((Math.abs(Days.daysBetween(localDate, localDate2).getDays()) + 1) / i14, bVar);
    }

    public static i53.f b(ArrayList arrayList, LocalDate localDate, LocalDate localDate2, int i14) {
        ArrayList arrayList2 = new ArrayList();
        LocalDate localDateMinusDays = localDate.minusDays(1);
        int i15 = 0;
        for (Object obj : arrayList) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                p13.x.q();
                throw null;
            }
            o61.n nVar = (o61.n) obj;
            o61.n nVar2 = i15 > 0 ? (o61.n) arrayList.get(i15 - 1) : null;
            o61.n nVar3 = i15 < arrayList.size() - 1 ? (o61.n) arrayList.get(i16) : null;
            com.garmin.android.apps.connectmobile.performance.model.b.a aVar = com.garmin.android.apps.connectmobile.performance.model.b.f39921h;
            Double trainingStatus = nVar.getTrainingStatus();
            double dDoubleValue = trainingStatus != null ? trainingStatus.doubleValue() : Double.NaN;
            Boolean boolValueOf = Boolean.valueOf(nVar.getIsTrainingStatusPaused());
            aVar.getClass();
            com.garmin.android.apps.connectmobile.performance.model.b bVarA = com.garmin.android.apps.connectmobile.performance.model.b.a.a(dDoubleValue, boolValueOf);
            if (nVar2 == null) {
                if (!g22.k.g(nVar.d(), localDate)) {
                    localDateMinusDays = nVar.d().minusDays(1);
                    localDateMinusDays.getClass();
                    arrayList2.add(a(localDate, localDateMinusDays, i14, com.garmin.android.apps.connectmobile.performance.model.b.UNKNOWN));
                }
            } else if (Math.abs(Days.daysBetween(nVar.d(), nVar2.d()).getDays()) > 1) {
                localDateMinusDays = nVar.d().minusDays(1);
                LocalDate localDatePlusDays = nVar2.d().plusDays(1);
                localDatePlusDays.getClass();
                localDateMinusDays.getClass();
                arrayList2.add(a(localDatePlusDays, localDateMinusDays, i14, com.garmin.android.apps.connectmobile.performance.model.b.UNKNOWN));
            }
            if (nVar3 == null) {
                LocalDate localDatePlusDays2 = localDateMinusDays.plusDays(1);
                localDatePlusDays2.getClass();
                arrayList2.add(a(localDatePlusDays2, nVar.d(), i14, bVarA));
                if (!g22.k.g(nVar.d(), localDate2)) {
                    LocalDate localDatePlusDays3 = nVar.d().plusDays(1);
                    localDatePlusDays3.getClass();
                    arrayList2.add(a(localDatePlusDays3, localDate2, i14, com.garmin.android.apps.connectmobile.performance.model.b.UNKNOWN));
                }
            } else {
                Double trainingStatus2 = nVar3.getTrainingStatus();
                if (bVarA != com.garmin.android.apps.connectmobile.performance.model.b.a.a(trainingStatus2 != null ? trainingStatus2.doubleValue() : Double.NaN, Boolean.valueOf(nVar3.getIsTrainingStatusPaused())) || Math.abs(Days.daysBetween(nVar.d(), nVar3.d()).getDays()) > 1) {
                    LocalDate localDatePlusDays4 = localDateMinusDays.plusDays(1);
                    localDatePlusDays4.getClass();
                    arrayList2.add(a(localDatePlusDays4, nVar.d(), i14, bVarA));
                    localDateMinusDays = nVar.d();
                }
            }
            i15 = i16;
        }
        return i53.a.j(arrayList2);
    }
}
