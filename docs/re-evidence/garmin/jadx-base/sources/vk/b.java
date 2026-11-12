package vk;

import jk.j;

/* JADX INFO: loaded from: classes7.dex */
public class b extends j {
    /* JADX WARN: Illegal instructions before constructor call */
    public b(j.k kVar, long j8, String str) {
        String[] strArrSplit = str.split(":");
        super(kVar, j8, Integer.parseInt(strArrSplit[5], 16) + (Integer.parseInt(strArrSplit[4], 16) << 8));
        this.f99076x = 0;
        this.f99075w = 0;
    }
}
