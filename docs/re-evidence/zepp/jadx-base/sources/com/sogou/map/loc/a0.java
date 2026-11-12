package com.sogou.map.loc;

/* JADX INFO: loaded from: classes18.dex */
enum a0 {
    pending,
    resolved,
    rejected;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static a0[] valuesCustom() {
        a0[] a0VarArr = new a0[3];
        System.arraycopy(values(), 0, a0VarArr, 0, 3);
        return a0VarArr;
    }
}
