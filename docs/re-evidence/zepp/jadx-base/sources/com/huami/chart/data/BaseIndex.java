package com.huami.chart.data;

import com.huami.tools.log.HMLog;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public class BaseIndex {
    private static final String c = "BaseIndex";
    private int a;
    private int b;

    public BaseIndex(int i) {
        this.a = i;
        this.b = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String b() {
        return "getIndex " + ((this.a + this.b) >> 1);
    }

    public boolean equals(Object obj) {
        BaseIndex baseIndex = (BaseIndex) obj;
        return baseIndex.getStart() == getStart() && baseIndex.getEnd() == getEnd();
    }

    public int getEnd() {
        return this.b;
    }

    public int getIndex() {
        int i = this.a;
        if (i == this.b) {
            return i;
        }
        HMLog.verbose(c, new Function0() { // from class: vq
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.a.b();
            }
        });
        return (this.a + this.b) >> 1;
    }

    public int getStart() {
        return this.a;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return "(" + this.a + ", " + this.b + ")";
    }

    public BaseIndex(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
