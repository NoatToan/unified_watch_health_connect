package t8;

import android.health.connect.datatypes.units.Energy;
import android.health.connect.datatypes.units.Length;
import android.health.connect.datatypes.units.Mass;
import android.health.connect.datatypes.units.Power;

/* JADX INFO: loaded from: classes.dex */
public final class o {
    public static final Energy a(c9.b bVar) {
        bVar.getClass();
        Energy energyFromCalories = Energy.fromCalories(bVar.a());
        energyFromCalories.getClass();
        return energyFromCalories;
    }

    public static final Length b(c9.c cVar) {
        cVar.getClass();
        Length lengthFromMeters = Length.fromMeters(cVar.a());
        lengthFromMeters.getClass();
        return lengthFromMeters;
    }

    public static final Mass c(c9.d dVar) {
        dVar.getClass();
        Mass massFromGrams = Mass.fromGrams(dVar.a());
        massFromGrams.getClass();
        return massFromGrams;
    }

    public static final Power d(c9.f fVar) {
        fVar.getClass();
        Power powerFromWatts = Power.fromWatts(fVar.a());
        powerFromWatts.getClass();
        return powerFromWatts;
    }
}
