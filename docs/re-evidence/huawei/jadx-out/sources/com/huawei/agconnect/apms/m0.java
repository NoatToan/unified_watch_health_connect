package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.util.Session;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 extends srq implements rst {
    public static m0 cde = new m0();
    public Session abc = Session.getInstance();
    public final HashSet bcd = new HashSet();

    public static m0 klm() {
        return cde;
    }

    public final void abc(l0 l0Var) {
        synchronized (this.bcd) {
            this.bcd.add(l0Var);
        }
    }

    @Override // com.huawei.agconnect.apms.rst
    public final void jkl() {
        nop();
    }

    public final Session lmn() {
        return this.abc;
    }

    @Override // com.huawei.agconnect.apms.rst
    public final void mno() {
        if (this.abc.isExpired()) {
            nop();
        }
    }

    public final void nop() {
        if (Agent.isDisabled()) {
            return;
        }
        this.abc = Session.getInstance();
        synchronized (this.bcd) {
            for (l0 l0Var : this.bcd) {
                if (l0Var != null) {
                    l0Var.abc(this.abc);
                }
            }
        }
    }

    @Override // com.huawei.agconnect.apms.srq, com.huawei.agconnect.apms.qpo
    public final void abc() {
        if (this.abc.isExpired()) {
            nop();
        }
    }
}
