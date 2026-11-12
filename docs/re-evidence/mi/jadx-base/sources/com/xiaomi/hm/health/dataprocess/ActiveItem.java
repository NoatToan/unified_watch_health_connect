package com.xiaomi.hm.health.dataprocess;

import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class ActiveItem implements Serializable {
    public static final int MODE_ACTIVE = 0;
    public static final int MODE_ACTIVE_NEW = 0;
    public static final int MODE_CHARGE = 9;
    public static final int MODE_FAST_WALK = 3;
    public static final int MODE_LIE = 10;
    public static final int MODE_MICRO_ACTIVE = 7;
    public static final int MODE_NOWEAR = 8;
    public static final int MODE_RUN = 2;
    public static final int MODE_RUN_NEW = 4;
    public static final int MODE_SIT = 6;
    public static final int MODE_SLOW_WALK = 1;
    public static final int MODE_STAND = 5;
    public static final int MODE_WALK = 1;
    public static final int MODE_WALK_NEW = 2;
    public int start = 0;
    public int stop = 0;
    public int mode = 0;
    public int distance = 0;
    public int calories = 0;
    public int runtime = 0;
    public int steps = 0;
    public int flag = 0;
    public int activeTime = 0;
    public int walkDistance = 0;
    public int walkCalories = 0;
    public int runDistance = 0;
    public int runCalories = 0;

    public boolean equals(Object obj) {
        if (!(obj instanceof ActiveItem)) {
            return false;
        }
        ActiveItem activeItem = (ActiveItem) obj;
        return activeItem.start == this.start && activeItem.stop == this.stop && activeItem.mode == this.mode;
    }

    public int getActiveTime() {
        return this.activeTime;
    }

    public int getCalories() {
        return this.calories;
    }

    public int getDistance() {
        return this.distance;
    }

    public int getKey() {
        return (this.start << 16) | this.stop;
    }

    public int getMode() {
        return this.mode;
    }

    public int getRunCalories() {
        return this.runCalories;
    }

    public int getRunDistance() {
        return this.runDistance;
    }

    public int getRuntime() {
        return this.runtime;
    }

    public int getStart() {
        return this.start;
    }

    public int getSteps() {
        return this.steps;
    }

    public int getStop() {
        return this.stop;
    }

    public int getWalkCalories() {
        return this.walkCalories;
    }

    public int getWalkDistance() {
        return this.walkDistance;
    }

    public int hashCode() {
        return (Integer.toString(this.start).hashCode() * 31) + (Integer.toString(this.stop).hashCode() * 31) + (Integer.toString(this.mode).hashCode() * 31);
    }

    public void setActiveTime(int i) {
        this.activeTime = i;
    }

    public void setCalories(int i) {
        this.calories = i;
    }

    public void setDistance(int i) {
        this.distance = i;
    }

    public void setInfos(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        this.start = i;
        this.stop = i2;
        this.mode = i3;
        this.distance = i4;
        this.calories = i5;
        this.runtime = i6;
        this.steps = i7;
        this.flag = i8;
        this.activeTime = i9;
        this.walkDistance = i10;
        this.walkCalories = i11;
        this.runDistance = i12;
        this.runCalories = i13;
    }

    public void setMode(int i) {
        this.mode = i;
    }

    public void setRunCalories(int i) {
        this.runCalories = i;
    }

    public void setRunDistance(int i) {
        this.runDistance = i;
    }

    public void setRuntime(int i) {
        this.runtime = i;
    }

    public void setStart(int i) {
        this.start = i;
    }

    public void setSteps(int i) {
        this.steps = i;
    }

    public void setStop(int i) {
        this.stop = i;
    }

    public void setWalkCalories(int i) {
        this.walkCalories = i;
    }

    public void setWalkDistance(int i) {
        this.walkDistance = i;
    }

    public String toString() {
        return "-----------------------\nstart " + this.start + "\nstop " + this.stop + "\nmode " + this.mode + "\ndistance " + this.distance + "\ncalories " + this.calories + "\nruntime " + this.runtime + "\nsteps " + this.steps + "\nflag " + this.flag + "\nactiveTime " + this.activeTime + "\nwalkDistance " + this.walkDistance + "\nwalkCalories " + this.walkCalories + "\nrunDistance " + this.runDistance + "\nrunCalories " + this.runCalories + "\n-----------------------\n";
    }
}
