package org.joda.time.base;

import defpackage.bw3;
import defpackage.egj;
import defpackage.fk4;
import defpackage.fl9;
import defpackage.hgj;
import defpackage.kgj;
import defpackage.mgj;
import defpackage.qgj;
import defpackage.sfd;
import defpackage.wq5;
import defpackage.z00;
import java.io.Serializable;
import org.joda.time.MutableInterval;
import org.joda.time.chrono.ISOChronology;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseInterval extends z00 implements mgj, Serializable {
    private static final long serialVersionUID = 576586928732749278L;
    private volatile bw3 iChronology;
    private volatile long iEndMillis;
    private volatile long iStartMillis;

    public BaseInterval(long j, long j2, bw3 bw3Var) {
        this.iChronology = wq5.c(bw3Var);
        checkInterval(j, j2);
        this.iStartMillis = j;
        this.iEndMillis = j2;
    }

    @Override // defpackage.mgj
    public bw3 getChronology() {
        return this.iChronology;
    }

    @Override // defpackage.mgj
    public long getEndMillis() {
        return this.iEndMillis;
    }

    @Override // defpackage.mgj
    public long getStartMillis() {
        return this.iStartMillis;
    }

    public void setInterval(long j, long j2, bw3 bw3Var) {
        checkInterval(j, j2);
        this.iStartMillis = j;
        this.iEndMillis = j2;
        this.iChronology = wq5.c(bw3Var);
    }

    public BaseInterval(kgj kgjVar, kgj kgjVar2) {
        if (kgjVar == null && kgjVar2 == null) {
            long jB = wq5.b();
            this.iEndMillis = jB;
            this.iStartMillis = jB;
            this.iChronology = ISOChronology.getInstance();
            return;
        }
        this.iChronology = wq5.g(kgjVar);
        this.iStartMillis = wq5.h(kgjVar);
        this.iEndMillis = wq5.h(kgjVar2);
        checkInterval(this.iStartMillis, this.iEndMillis);
    }

    public BaseInterval(kgj kgjVar, hgj hgjVar) {
        this.iChronology = wq5.g(kgjVar);
        this.iStartMillis = wq5.h(kgjVar);
        this.iEndMillis = fl9.e(this.iStartMillis, wq5.f(hgjVar));
        checkInterval(this.iStartMillis, this.iEndMillis);
    }

    public BaseInterval(hgj hgjVar, kgj kgjVar) {
        this.iChronology = wq5.g(kgjVar);
        this.iEndMillis = wq5.h(kgjVar);
        this.iStartMillis = fl9.e(this.iEndMillis, -wq5.f(hgjVar));
        checkInterval(this.iStartMillis, this.iEndMillis);
    }

    public BaseInterval(kgj kgjVar, qgj qgjVar) {
        bw3 bw3VarG = wq5.g(kgjVar);
        this.iChronology = bw3VarG;
        this.iStartMillis = wq5.h(kgjVar);
        if (qgjVar == null) {
            this.iEndMillis = this.iStartMillis;
        } else {
            this.iEndMillis = bw3VarG.add(qgjVar, this.iStartMillis, 1);
        }
        checkInterval(this.iStartMillis, this.iEndMillis);
    }

    public BaseInterval(qgj qgjVar, kgj kgjVar) {
        bw3 bw3VarG = wq5.g(kgjVar);
        this.iChronology = bw3VarG;
        this.iEndMillis = wq5.h(kgjVar);
        if (qgjVar == null) {
            this.iStartMillis = this.iEndMillis;
        } else {
            this.iStartMillis = bw3VarG.add(qgjVar, this.iEndMillis, -1);
        }
        checkInterval(this.iStartMillis, this.iEndMillis);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseInterval(Object obj, bw3 bw3Var) {
        sfd sfdVarD = fk4.b().d(obj);
        if (sfdVarD.h(obj, bw3Var)) {
            mgj mgjVar = (mgj) obj;
            this.iChronology = bw3Var == null ? mgjVar.getChronology() : bw3Var;
            this.iStartMillis = mgjVar.getStartMillis();
            this.iEndMillis = mgjVar.getEndMillis();
        } else if (this instanceof egj) {
            sfdVarD.j((egj) this, obj, bw3Var);
        } else {
            MutableInterval mutableInterval = new MutableInterval();
            sfdVarD.j(mutableInterval, obj, bw3Var);
            this.iChronology = mutableInterval.getChronology();
            this.iStartMillis = mutableInterval.getStartMillis();
            this.iEndMillis = mutableInterval.getEndMillis();
        }
        checkInterval(this.iStartMillis, this.iEndMillis);
    }
}
