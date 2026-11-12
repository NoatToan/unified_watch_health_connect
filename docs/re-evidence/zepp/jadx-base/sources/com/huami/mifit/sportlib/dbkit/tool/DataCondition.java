package com.huami.mifit.sportlib.dbkit.tool;

import android.util.Pair;
import com.huami.mifit.sportlib.common.SyncedState;

/* JADX INFO: loaded from: classes11.dex */
public class DataCondition {
    private long a;
    private int b;
    private int c;
    private int[] d;
    private Pair<String, Boolean> e;
    private Pair<String, Pair<Object, Object>> f;
    private int g;

    public DataCondition(long j, int i, int i2, int[] iArr) {
        this.a = -1L;
        this.b = -1;
        this.c = SyncedState.STATE_NONE.getValue();
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = iArr;
    }

    public Pair<String, Pair<Object, Object>> getBetween() {
        return this.f;
    }

    public int getLimit() {
        return this.g;
    }

    public Pair<String, Boolean> getOrder() {
        return this.e;
    }

    public int getSource() {
        return this.b;
    }

    public int[] getSportTypes() {
        return this.d;
    }

    public int getSyncState() {
        return this.c;
    }

    public long getTrackId() {
        return this.a;
    }

    public void setBetween(Pair<String, Pair<Object, Object>> pair) {
        this.f = pair;
    }

    public void setLimit(int i) {
        this.g = i;
    }

    public void setOrder(Pair<String, Boolean> pair) {
        this.e = pair;
    }

    public DataCondition(long j, int i, int[] iArr) {
        this.a = -1L;
        this.b = -1;
        this.c = SyncedState.STATE_NONE.getValue();
        this.a = j;
        this.b = i;
        this.d = iArr;
    }

    public DataCondition(long j, int i, int i2) {
        this.a = -1L;
        this.b = -1;
        this.c = SyncedState.STATE_NONE.getValue();
        this.a = j;
        this.b = i;
        if (i2 > -1) {
            this.d = new int[]{i2};
        }
    }

    public DataCondition(long j) {
        this.a = -1L;
        this.b = -1;
        this.c = SyncedState.STATE_NONE.getValue();
        this.a = j;
    }
}
