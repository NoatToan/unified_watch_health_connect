package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class uqh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f36028b;
    public final List<dp0> c;
    public final List<ze8> d;
    public final mz5 e;

    public uqh(String str, long j, List<dp0> list, List<ze8> list2) {
        this(str, j, list, list2, null);
    }

    public int a(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.c.get(i2).f15771b == i) {
                return i2;
            }
        }
        return -1;
    }

    public uqh(String str, long j, List<dp0> list, List<ze8> list2, mz5 mz5Var) {
        this.f36027a = str;
        this.f36028b = j;
        this.c = Collections.unmodifiableList(list);
        this.d = Collections.unmodifiableList(list2);
        this.e = mz5Var;
    }
}
