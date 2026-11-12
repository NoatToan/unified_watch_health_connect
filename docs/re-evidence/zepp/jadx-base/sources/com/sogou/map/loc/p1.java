package com.sogou.map.loc;

import android.telephony.CellLocation;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
final class p1 extends h0 {
    private final TelephonyManager b;
    private boolean c;
    private LinkedList d;
    private LinkedList e;
    private int f;
    private boolean g;
    private PhoneStateListener h;

    public p1(l0 l0Var) {
        super(l0Var);
        this.c = false;
        this.d = new LinkedList();
        this.e = new LinkedList();
        this.f = 0;
        this.g = false;
        this.b = j0.A(l0Var.d());
        try {
            this.h = new q1(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a9  */
    public boolean h(CellLocation cellLocation) {
        boolean z;
        boolean z2;
        if (cellLocation instanceof GsmCellLocation) {
            this.f = 1;
            z0 z0Var = this.d.size() > 0 ? (z0) this.d.getFirst() : null;
            z0 z0VarC = q0.c((GsmCellLocation) cellLocation);
            if (z0VarC == null) {
                z2 = false;
            } else {
                if ((z0VarC.a == -1 || z0VarC.b == -1) ? false : true) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            this.g = z2;
            if (z0VarC != null) {
                if (!(z0Var != null && z0Var.a == z0VarC.a && z0Var.b == z0VarC.b)) {
                    LinkedList linkedList = new LinkedList(this.d);
                    linkedList.addFirst(z0VarC);
                    while (linkedList.size() > 10) {
                        linkedList.removeLast();
                    }
                    this.d = linkedList;
                    r0.b("history gsm: " + this.d);
                    return true;
                }
            }
        } else if (cellLocation instanceof CdmaCellLocation) {
            this.f = 2;
            w0 w0Var = this.e.size() > 0 ? (w0) this.e.getFirst() : null;
            w0 w0VarB = q0.b((CdmaCellLocation) cellLocation);
            if (w0VarB == null) {
                z = false;
            } else {
                if ((w0VarB.a == -1 || w0VarB.b == -1 || w0VarB.c == -1) ? false : true) {
                    z = true;
                } else {
                    z = false;
                }
            }
            this.g = z;
            if (w0VarB != null) {
                if (!(w0Var != null && w0Var.a == w0VarB.a && w0Var.b == w0VarB.b && w0Var.c == w0VarB.c)) {
                    LinkedList linkedList2 = new LinkedList(this.e);
                    linkedList2.addFirst(w0VarB);
                    while (linkedList2.size() > 10) {
                        linkedList2.removeLast();
                    }
                    this.e = linkedList2;
                    r0.b("history cdma: " + this.e);
                    return true;
                }
            }
        } else {
            this.f = 0;
            this.g = false;
        }
        return false;
    }

    public final x0 f(long j) {
        CellLocation cellLocationD = j0.d(this.b);
        if (cellLocationD == null) {
            return null;
        }
        try {
            h(cellLocationD);
            x0 x0Var = new x0();
            x0Var.b(j);
            x0Var.c(this.b.getNetworkOperator());
            return x0Var;
        } catch (Exception unused) {
            return null;
        }
    }

    public final synchronized p1 g() {
        TelephonyManager telephonyManager = this.b;
        if (telephonyManager != null && !this.c) {
            this.c = true;
            try {
                telephonyManager.listen(this.h, 272);
            } catch (Exception unused) {
            }
            return this;
        }
        return this;
    }

    public final synchronized p1 j() {
        TelephonyManager telephonyManager = this.b;
        if (telephonyManager != null && this.c) {
            this.c = false;
            try {
                telephonyManager.listen(this.h, 0);
            } catch (Exception unused) {
            }
            return this;
        }
        return this;
    }

    public final TelephonyManager k() {
        return this.b;
    }

    public final int l() {
        return this.f;
    }

    public final boolean m() {
        return this.g;
    }

    public final List n() {
        h(j0.d(this.b));
        return Collections.unmodifiableList(this.d);
    }

    public final List o() {
        h(j0.d(this.b));
        return Collections.unmodifiableList(this.e);
    }
}
