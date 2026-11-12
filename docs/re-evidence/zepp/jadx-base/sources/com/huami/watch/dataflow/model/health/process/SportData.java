package com.huami.watch.dataflow.model.health.process;

import java.io.Serializable;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes16.dex */
public class SportData implements Serializable, Cloneable {
    private static final long serialVersionUID = 1;
    private final int a;
    private int b;
    private int c;
    private int d;
    private int e;

    public SportData(int i, int i2) {
        this.e = 254;
        this.a = i;
        this.d = i2;
    }

    public SportData copy() throws CloneNotSupportedException {
        return (SportData) clone();
    }

    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        SportData sportData = (SportData) obj;
        return sportData.a == this.a && sportData.b == this.b && sportData.c == this.c && sportData.d == this.d;
    }

    public int getActivity() {
        return this.c;
    }

    public int getHR() {
        return this.e;
    }

    public int getSportMode() {
        return this.b;
    }

    public int getStep() {
        return this.d;
    }

    public int getTimeIndex() {
        return this.a;
    }

    public void setActivity(int i) {
        this.c = i;
    }

    public void setHR(int i) {
        this.e = i;
    }

    public void setMode(int i) {
        this.b = i;
    }

    public void setStep(int i) {
        this.d = i;
    }

    public String toString() {
        return SearchCriteria.LT + this.a + ":" + this.b + ":" + this.c + ":" + this.d + SearchCriteria.GT;
    }

    public SportData(int i, int i2, int i3, int i4) {
        this.e = 254;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public SportData(int i, int i2, int i3, int i4, int i5) {
        this(i, i2, i3, i4);
        this.e = i5;
    }
}
