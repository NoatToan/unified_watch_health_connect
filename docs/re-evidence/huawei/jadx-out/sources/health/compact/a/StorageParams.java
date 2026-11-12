package health.compact.a;

import defpackage.lst;

/* JADX INFO: loaded from: classes.dex */
public class StorageParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36652a;
    private int e;

    public StorageParams() {
        this.e = 0;
        this.f36652a = 0;
    }

    public StorageParams(int i) {
        this.e = 0;
        this.f36652a = i;
    }

    public int a() {
        return ((Integer) lst.d(Integer.valueOf(this.f36652a))).intValue();
    }

    public void e(int i) {
        this.f36652a = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }
}
