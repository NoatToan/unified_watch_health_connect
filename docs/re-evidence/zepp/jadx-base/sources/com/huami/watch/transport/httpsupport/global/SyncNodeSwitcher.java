package com.huami.watch.transport.httpsupport.global;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes9.dex */
public class SyncNodeSwitcher {
    public static final int SWITCH_CLIENT_2_SERVICE = 0;
    public static final int SWITCH_SERVICE_2_CLOUD = 1;
    private static SyncNodeSwitcher b;
    private SparseBooleanArray a;

    private SyncNodeSwitcher() {
        if (this.a == null) {
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            this.a = sparseBooleanArray;
            sparseBooleanArray.put(0, true);
            this.a.put(1, true);
        }
    }

    public static SyncNodeSwitcher self() {
        SyncNodeSwitcher syncNodeSwitcher;
        synchronized (SyncNodeSwitcher.class) {
            if (b == null) {
                b = new SyncNodeSwitcher();
            }
            syncNodeSwitcher = b;
        }
        return syncNodeSwitcher;
    }

    public void changeTo(int i, boolean z) {
        synchronized (this.a) {
            if (i == 0) {
                this.a.put(i, z);
            }
        }
    }

    public void destory() {
        synchronized (this) {
            SparseBooleanArray sparseBooleanArray = this.a;
            if (sparseBooleanArray != null) {
                sparseBooleanArray.clear();
            }
            b = null;
        }
    }

    public boolean mayGo(int i) {
        boolean z;
        synchronized (this.a) {
            z = this.a.get(i);
        }
        return z;
    }
}
