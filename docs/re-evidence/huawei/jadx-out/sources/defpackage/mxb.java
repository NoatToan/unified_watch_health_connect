package defpackage;

import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class mxb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f42627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f42628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f42629c;
    private boolean d;
    private long e;
    private long f;

    public long h() {
        return this.f;
    }

    public long d() {
        return this.f42628b;
    }

    public long c() {
        return this.f42629c;
    }

    public long e() {
        return this.e;
    }

    public int a() {
        return this.f42627a;
    }

    public void c(int i) {
        this.f42627a = i;
    }

    public boolean b() {
        return this.d;
    }

    public void b(boolean z) {
        this.d = z;
    }

    public void a(int i, long j) {
        if (i != 101) {
            if (i != 102) {
                if (i != 301) {
                    if (i != 302) {
                        switch (i) {
                            case 401:
                                this.f42629c = j;
                                break;
                            case 402:
                                this.e = j;
                                break;
                            case 403:
                                this.f42629c = j;
                                this.e = j;
                                break;
                            default:
                                LogUtil.j("MenstrualData setTimeContent error", new Object[0]);
                                break;
                        }
                        return;
                    }
                }
            }
            this.f42628b = j;
            return;
        }
        this.f = j;
    }
}
