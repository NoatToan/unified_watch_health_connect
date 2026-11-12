package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class dp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15771b;
    public final List<tmk> c;
    public final List<mz5> d;
    public final List<mz5> e;
    public final List<mz5> f;

    public dp0(int i, int i2, List<tmk> list, List<mz5> list2, List<mz5> list3, List<mz5> list4) {
        this.f15770a = i;
        this.f15771b = i2;
        this.c = Collections.unmodifiableList(list);
        this.d = Collections.unmodifiableList(list2);
        this.e = Collections.unmodifiableList(list3);
        this.f = Collections.unmodifiableList(list4);
    }
}
