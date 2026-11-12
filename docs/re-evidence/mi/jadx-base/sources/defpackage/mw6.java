package defpackage;

import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fitness.trail.diving.DivingRepository;
import com.xiaomi.fitness.trail.viewmodel.DimTotalVM;

/* JADX INFO: loaded from: classes10.dex */
public final class mw6 {
    public static void a(DimTotalVM dimTotalVM, FitnessDataGetter fitnessDataGetter) {
        dimTotalVM.dataGetter = fitnessDataGetter;
    }

    public static void b(DimTotalVM dimTotalVM, DivingRepository divingRepository) {
        dimTotalVM.divingRepository = divingRepository;
    }
}
