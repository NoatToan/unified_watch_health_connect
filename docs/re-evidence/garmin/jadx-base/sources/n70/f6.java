package n70;

import java.util.Comparator;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class f6<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        ww1.h athleteRace;
        ww1.h athleteRace2;
        ww1.c0 trainingPlanDetailBrief = ((ww1.t) t7).getTrainingPlanDetailBrief();
        String raceDay = null;
        DateTime dateTimeI = c22.j0.I((trainingPlanDetailBrief == null || (athleteRace2 = trainingPlanDetailBrief.getAthleteRace()) == null) ? null : athleteRace2.getRaceDay());
        ww1.c0 trainingPlanDetailBrief2 = ((ww1.t) t14).getTrainingPlanDetailBrief();
        if (trainingPlanDetailBrief2 != null && (athleteRace = trainingPlanDetailBrief2.getAthleteRace()) != null) {
            raceDay = athleteRace.getRaceDay();
        }
        return r13.a.b(dateTimeI, c22.j0.I(raceDay));
    }
}
