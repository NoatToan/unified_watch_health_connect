package com.huawei.health.suggestion.ui.fitness.viewholder;

import android.content.Context;
import androidx.fragment.app.FragmentManager;

/* JADX INFO: loaded from: classes9.dex */
public class FitnessSessionManager {
    private static FitnessSessionManager d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SessionActivityAction f9501b;

    public interface SessionActivityAction {
        void startSportHistoryActivity(Context context);

        void startSportHistoryActivity(Context context, int i, int i2);
    }

    /* JADX INFO: loaded from: classes31.dex */
    public interface SessionForFitness {
        void initOperationConfigured(int i, FragmentManager fragmentManager);
    }

    public static FitnessSessionManager b() {
        FitnessSessionManager fitnessSessionManager;
        synchronized (FitnessSessionManager.class) {
            if (d == null) {
                d = new FitnessSessionManager();
            }
            fitnessSessionManager = d;
        }
        return fitnessSessionManager;
    }

    public SessionActivityAction d() {
        return this.f9501b;
    }

    public void d(SessionActivityAction sessionActivityAction) {
        this.f9501b = sessionActivityAction;
    }
}
