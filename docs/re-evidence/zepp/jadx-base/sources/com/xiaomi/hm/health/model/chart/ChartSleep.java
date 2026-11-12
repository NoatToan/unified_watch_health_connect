package com.xiaomi.hm.health.model.chart;

import androidx.annotation.NonNull;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.dataprocess.SleepInfo;
import com.xiaomi.hm.health.dataprocess.StageSleep;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class ChartSleep {
    public static final int MODE_AWAKE = 6;
    public static final int MODE_BLANK = 8;
    public static final int MODE_DREAM = 9;
    public static final int MODE_EDIT = 7;
    public static final int MODE_NREM = 5;
    public static final int MODE_REM = 4;
    private static final String i = "ChartSleep";
    private int a;
    private int b;
    private String c;
    private String d;
    private int e;
    private int f;
    private List<ChartSleepItem> g;
    private Style h;

    public class ChartSleepItem {
        private int a;
        private int b;
        private int c;

        public ChartSleepItem(int start, int end, int mode) {
            this.a = start;
            this.b = end;
            this.c = mode;
        }

        public int getEnd() {
            return this.b;
        }

        public int getMode() {
            return this.c;
        }

        public int getStart() {
            return this.a;
        }

        public void setEnd(int end) {
            this.b = end;
        }

        public void setMode(int mode) {
            this.c = mode;
        }

        public void setStart(int start) {
            this.a = start;
        }
    }

    public enum Style {
        HOMEPAGE,
        DETAILVIEW
    }

    public ChartSleep(@NonNull SleepInfo info) {
        this(info, Style.DETAILVIEW, false);
    }

    public int getEndSleep() {
        return this.b;
    }

    public List<ChartSleepItem> getItems() {
        return this.g;
    }

    public int getStartSleep() {
        return this.a;
    }

    public String getStartSleepStr() {
        return this.c;
    }

    public String getStopSleepStr() {
        return this.d;
    }

    public Style getStyle() {
        return this.h;
    }

    public int getTotalDeepSleep() {
        return this.f;
    }

    public int getTotalSleep() {
        return this.e;
    }

    public void setEndSleep(int mEndSleep) {
        this.b = mEndSleep;
    }

    public void setItems(List<ChartSleepItem> mItems) {
        this.g = mItems;
    }

    public void setStartSleep(int mStartSleep) {
        this.a = mStartSleep;
    }

    public void setStyle(Style style) {
        this.h = style;
    }

    public void setTotalDeepSleep(int mTotalDeepSleep) {
        this.f = mTotalDeepSleep;
    }

    public void setTotalSleep(int mTotalSleep) {
        this.e = mTotalSleep;
    }

    public ChartSleep(@NonNull SleepInfo sleepInfo, Style style, boolean isNap) {
        this.a = 0;
        this.b = 0;
        this.c = "";
        this.d = "";
        this.e = 0;
        this.f = 0;
        this.g = new ArrayList();
        this.h = Style.HOMEPAGE;
        this.h = style;
        ArrayList<StageSleep> stageSleep = !isNap ? sleepInfo.getStageSleep() : sleepInfo.getOddStageSleep();
        this.g.clear();
        for (int i2 = 0; i2 < stageSleep.size(); i2++) {
            HMLog.d(i, "index " + i2 + " data " + stageSleep.get(i2).toString(), new Object[0]);
            if (i2 == 0) {
                this.a = stageSleep.get(i2).start;
                this.b = stageSleep.get(i2).stop;
            }
            this.a = Math.min(this.a, stageSleep.get(i2).start);
            this.b = Math.max(this.b, stageSleep.get(i2).stop);
            this.g.add(stageSleep.get(i2).mode == 5 ? new ChartSleepItem(stageSleep.get(i2).start, stageSleep.get(i2).stop, 5) : stageSleep.get(i2).mode == 4 ? new ChartSleepItem(stageSleep.get(i2).start, stageSleep.get(i2).stop, 4) : stageSleep.get(i2).mode == 7 ? new ChartSleepItem(stageSleep.get(i2).start, stageSleep.get(i2).stop, 6) : stageSleep.get(i2).mode == 128 ? new ChartSleepItem(stageSleep.get(i2).start, stageSleep.get(i2).stop, 8) : stageSleep.get(i2).mode == 8 ? new ChartSleepItem(stageSleep.get(i2).start, stageSleep.get(i2).stop, 9) : new ChartSleepItem(stageSleep.get(i2).start, stageSleep.get(i2).stop, 7));
        }
        HMLog.d(i, "mEndSleep " + this.b + " mStartSleep " + this.a, new Object[0]);
        if (isNap) {
            return;
        }
        this.e = sleepInfo.getSleepCount();
        this.f = sleepInfo.getNonRemCount();
        this.c = TimeUtils.formatTime(BraceletApp.getContext(), sleepInfo.getStartDate());
        this.d = TimeUtils.formatTime(BraceletApp.getContext(), sleepInfo.getStopDate());
    }
}
