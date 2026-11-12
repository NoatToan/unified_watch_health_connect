package com.xiaomi.hm.health.bt.model.statistic;

/* JADX INFO: loaded from: classes19.dex */
public class ChaohuStatistic extends BaseStatistic {
    private ChaohuEvent event;
    private Statistic statistic;
    private int silenceMode = -1;
    private int backlightLevel = -1;

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

    public void setBacklightLevel(int backlightLevel) {
        this.backlightLevel = backlightLevel;
    }

    public void setEvent(ChaohuEvent event) {
        this.event = event;
    }

    public void setSilenceMode(int silenceMode) {
        this.silenceMode = silenceMode;
    }

    public void setStatistic(Statistic statistic) {
        this.statistic = statistic;
    }

    public String toString() {
        return "ChaohuStatistic{baseStatistic=" + this.statistic + ", event=" + this.event + ", silenceMode=" + this.silenceMode + ", backlightLevel=" + this.backlightLevel + '}';
    }

    @Override // com.xiaomi.hm.health.bt.model.statistic.BaseStatistic
    public ChaohuEvent getEvent() {
        return this.event;
    }
}
