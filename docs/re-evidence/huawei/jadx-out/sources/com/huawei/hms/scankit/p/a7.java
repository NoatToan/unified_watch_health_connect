package com.huawei.hms.scankit.p;

import com.huawei.hihealth.HiDataFilter;

/* JADX INFO: loaded from: classes10.dex */
final class a7 extends i7 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final short f15978c;
    private final short d;

    a7(i7 i7Var, int i, int i2) {
        super(i7Var);
        this.f15978c = (short) i;
        this.d = (short) i2;
    }

    @Override // com.huawei.hms.scankit.p.i7
    void a(r rVar, byte[] bArr) {
        rVar.a(this.f15978c, this.d);
    }

    public String toString() {
        short s = this.f15978c;
        int i = 1 << this.d;
        return HiDataFilter.DataFilterExpression.LESS_THAN + Integer.toBinaryString((s & (i - 1)) | i | (1 << this.d)).substring(1) + '>';
    }
}
