package defpackage;

import com.huawei.hihealth.HiHealthData;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mzg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<HiHealthData> f42743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final eea f42744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<eeb> f42745c;
    private final String e;
    private int i = 0;
    private int d = 0;

    public mzg(List<eeb> list, eea eeaVar, String str, List<HiHealthData> list2) {
        this.f42745c = list;
        this.f42744b = eeaVar;
        this.e = str;
        this.f42743a = list2;
    }

    public List<eeb> b() {
        return this.f42745c;
    }

    public eea a() {
        return this.f42744b;
    }

    public String c() {
        return this.e;
    }

    public int f() {
        return this.i;
    }

    public int e() {
        return this.d;
    }

    public List<HiHealthData> d() {
        return this.f42743a;
    }

    public void d(int i) {
        this.i = i;
    }

    public void b(int i) {
        this.d = i;
    }
}
