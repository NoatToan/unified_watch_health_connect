package org.joda.time.base;

import defpackage.bw3;
import defpackage.fk4;
import defpackage.flh;
import defpackage.hq5;
import defpackage.i10;
import defpackage.jq5;
import defpackage.ogj;
import defpackage.wq5;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BasePartial extends i10 implements ogj, Serializable {
    private static final long serialVersionUID = 2353678632973660L;
    private final bw3 iChronology;
    private final int[] iValues;

    public BasePartial() {
        this(wq5.b(), (bw3) null);
    }

    @Override // defpackage.ogj
    public bw3 getChronology() {
        return this.iChronology;
    }

    @Override // defpackage.ogj
    public int getValue(int i) {
        return this.iValues[i];
    }

    @Override // defpackage.i10
    public int[] getValues() {
        return (int[]) this.iValues.clone();
    }

    public void setValue(int i, int i2) {
        int[] iArr = getField(i).set(this, i, this.iValues, i2);
        int[] iArr2 = this.iValues;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
    }

    public void setValues(int[] iArr) {
        getChronology().validate(this, iArr);
        int[] iArr2 = this.iValues;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
    }

    @Override // defpackage.ogj
    public abstract /* synthetic */ int size();

    public String toString(String str) {
        return str == null ? toString() : hq5.b(str).l(this);
    }

    public BasePartial(bw3 bw3Var) {
        this(wq5.b(), bw3Var);
    }

    public BasePartial(long j) {
        this(j, (bw3) null);
    }

    public String toString(String str, Locale locale) throws IllegalArgumentException {
        if (str == null) {
            return toString();
        }
        return hq5.b(str).v(locale).l(this);
    }

    public BasePartial(long j, bw3 bw3Var) {
        bw3 bw3VarC = wq5.c(bw3Var);
        this.iChronology = bw3VarC.withUTC();
        this.iValues = bw3VarC.get(this, j);
    }

    public BasePartial(Object obj, bw3 bw3Var) {
        flh flhVarE = fk4.b().e(obj);
        bw3 bw3VarC = wq5.c(flhVarE.b(obj, bw3Var));
        this.iChronology = bw3VarC.withUTC();
        this.iValues = flhVarE.c(this, obj, bw3VarC);
    }

    public BasePartial(Object obj, bw3 bw3Var, jq5 jq5Var) {
        flh flhVarE = fk4.b().e(obj);
        bw3 bw3VarC = wq5.c(flhVarE.b(obj, bw3Var));
        this.iChronology = bw3VarC.withUTC();
        this.iValues = flhVarE.k(this, obj, bw3VarC, jq5Var);
    }

    public BasePartial(int[] iArr, bw3 bw3Var) {
        bw3 bw3VarC = wq5.c(bw3Var);
        this.iChronology = bw3VarC.withUTC();
        bw3VarC.validate(this, iArr);
        this.iValues = iArr;
    }

    public BasePartial(BasePartial basePartial, int[] iArr) {
        this.iChronology = basePartial.iChronology;
        this.iValues = iArr;
    }

    public BasePartial(BasePartial basePartial, bw3 bw3Var) {
        this.iChronology = bw3Var.withUTC();
        this.iValues = basePartial.iValues;
    }
}
