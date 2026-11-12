package defpackage;

import com.huawei.health.sleep.sleepviewdata.SleepViewConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes43.dex */
public class ujd {
    private boolean j;
    private gxq h = new gxq(SleepViewConstants.ViewTypeEnum.DAY);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<uig> f50227a = new CopyOnWriteArrayList<>();
    private CopyOnWriteArrayList<uif> e = new CopyOnWriteArrayList<>();
    private volatile int d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile String f50229c = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Set<String> f50228b = new HashSet();
    private List<String> i = new ArrayList(16);

    public gxq h() {
        return this.h;
    }

    public void e(gxq gxqVar) {
        this.h = gxqVar;
    }

    public CopyOnWriteArrayList<uif> a() {
        return this.e;
    }

    public void c(CopyOnWriteArrayList<uif> copyOnWriteArrayList) {
        this.e = copyOnWriteArrayList;
    }

    public CopyOnWriteArrayList<uig> b() {
        return this.f50227a;
    }

    public void b(CopyOnWriteArrayList<uig> copyOnWriteArrayList) {
        this.f50227a = copyOnWriteArrayList;
    }

    public boolean j() {
        return this.j;
    }

    public void b(boolean z) {
        this.j = z;
    }

    public int e() {
        return this.d;
    }

    public void e(int i) {
        this.d = i;
    }

    public String c() {
        return this.f50229c;
    }

    public void e(String str) {
        this.f50229c = str;
    }

    public Set<String> d() {
        return this.f50228b;
    }

    public void c(Set<String> set) {
        this.f50228b = set;
    }

    public List<String> g() {
        return this.i;
    }

    public void c(List<String> list) {
        this.i = list;
    }
}
