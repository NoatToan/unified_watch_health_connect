package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class bmh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<s2b> f4369b = new ArrayList();
    public int c;
    public long d;
    public int e;

    public bmh(long j, int i, List<s2b> list, int i2) {
        this.f4368a = i;
        this.d = j;
        if (list != null && list.size() > 0) {
            this.f4369b.addAll(list);
        }
        this.c = i2;
    }

    public String toString() {
        return super.toString();
    }
}
