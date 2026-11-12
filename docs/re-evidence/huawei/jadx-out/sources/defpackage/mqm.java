package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mqm {
    private long e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<mqk> f42184a = new ArrayList(16);

    public List<mqk> c() {
        return this.f42184a;
    }

    public void a(long j) {
        this.e = j;
    }

    public void a(List<mqk> list) {
        this.f42184a = list;
    }
}
