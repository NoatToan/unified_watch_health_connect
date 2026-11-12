package com.xiaomi.hm.health.bt.model.statistic;

/* JADX INFO: loaded from: classes19.dex */
public class TempoStatistic extends BaseStatistic {
    private TempoEvent event;
    private Statistic statistic;
    private int silenceMode = -1;
    private int backlightLevel = -1;
    private boolean screenLock = false;

    public int getBacklightLevel() {
        return this.backlightLevel;
    }

    public int getSilenceMode() {
        return this.silenceMode;
    }

    @Override // com.xiaomi.hm.health.bt.model.statistic.BaseStatistic
    public Statistic getStatistic() {
        return this.statistic;
    }

    public boolean isScreenLock() {
        return this.screenLock;
    }

    public void setBacklightLevel(int backlightLevel) {
        this.backlightLevel = backlightLevel;
    }

    public void setScreenLock(boolean screenLock) {
        this.screenLock = screenLock;
    }

    public void setSilenceMode(int silenceMode) {
        this.silenceMode = silenceMode;
    }

    public void setStatistic(Statistic statistic) {
        this.statistic = statistic;
    }

    public void setTempoEvent(TempoEvent tempoEvent) {
        this.event = tempoEvent;
    }

    public String toString() {
        return "TempoStatistic{baseStatistic=" + this.statistic + ", tempoEvent=" + this.event + ", silenceMode=" + this.silenceMode + ", backlightLevel=" + this.backlightLevel + ", screenLock=" + this.screenLock + '}';
    }

    @Override // com.xiaomi.hm.health.bt.model.statistic.BaseStatistic
    public TempoEvent getEvent() {
        return this.event;
    }
}
