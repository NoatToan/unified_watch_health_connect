package com.xiaomi.hm.health.ui.sportfitness.event;

import com.xiaomi.hm.health.ui.sportfitness.model.ExerciseStatData;

/* JADX INFO: loaded from: classes22.dex */
public class EventUpdateStatUI {
    public boolean onlyExchange;
    public ExerciseStatData statData;

    public EventUpdateStatUI(ExerciseStatData statData) {
        this.statData = statData;
        this.onlyExchange = false;
    }

    public EventUpdateStatUI(boolean exchange) {
        this.onlyExchange = exchange;
    }
}
