package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lyi {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f41118c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<lyj> f41117a = new ArrayList(16);

    public List<lyj> b() {
        return this.f41117a;
    }

    public void e(long j) {
        this.f41118c = j;
    }

    public void e(List<lyj> list) {
        this.f41117a = list;
    }
}
