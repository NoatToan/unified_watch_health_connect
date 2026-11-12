package defpackage;

import com.huawei.pluginhealthzone.cloud.CloudApi;

/* JADX INFO: loaded from: classes14.dex */
public class pfs {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile CloudApi f45291c;

    private pfs() {
    }

    public static CloudApi e() {
        if (f45291c == null) {
            synchronized (pfs.class) {
                if (f45291c == null) {
                    f45291c = new pfn();
                }
            }
        }
        return f45291c;
    }
}
