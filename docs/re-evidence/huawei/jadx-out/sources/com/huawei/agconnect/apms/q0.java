package com.huawei.agconnect.apms;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes22.dex */
public final class q0 {
    public final Object abc = new Object();
    public boolean bcd = false;
    public final ArrayList<p0> cde = new ArrayList<>();

    public final void abc(p0 p0Var) {
        synchronized (this.cde) {
            this.cde.add(p0Var);
        }
    }

    public final boolean abc() {
        boolean z;
        synchronized (this.abc) {
            synchronized (this.abc) {
                z = this.bcd;
            }
            if (!z) {
                this.bcd = true;
            }
        }
        return z;
    }
}
