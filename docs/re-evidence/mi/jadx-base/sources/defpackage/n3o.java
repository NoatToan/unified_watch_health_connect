package defpackage;

import com.xiaomi.fit.fitness.persist.server.SportSummaryRequest;
import com.xiaomi.fitness.repo.summary.SportSummaryRepo;

/* JADX INFO: loaded from: classes9.dex */
public final class n3o implements dei {
    public static SportSummaryRepo a(SportSummaryRequest sportSummaryRequest) {
        return new SportSummaryRepo(sportSummaryRequest);
    }
}
