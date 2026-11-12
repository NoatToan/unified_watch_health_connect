package defpackage;

import android.text.TextUtils;
import com.xiaomi.yrn.env.trace.YRNTraceEvent;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class hur {
    public final c1d c;
    public final gur d;
    public final String e;
    public final iyr f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20485a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<t1d> f20486b = new ArrayList<>();
    public final String g = "YRN_YRNV3_SDK";

    public class a implements m1d {
        public a() {
        }

        @Override // defpackage.m1d
        public void onLoadFailure(String str) {
            hur.this.d(false);
            hur.this.e(1);
        }

        @Override // defpackage.m1d
        public void onLoadStart() {
        }

        @Override // defpackage.m1d
        public void onLoadSuccess(String str) {
            hur.this.d(true);
            hur.this.e(3);
        }
    }

    public hur(gur gurVar, c1d c1dVar) {
        sk1.c(gurVar);
        sk1.b(true ^ TextUtils.isEmpty(gurVar.j()), "appName can not be empty");
        sk1.c(c1dVar);
        this.d = gurVar;
        this.e = gurVar.j();
        this.c = c1dVar;
        this.f = new iyr(c1dVar);
    }

    private void addListener(t1d t1dVar) {
        if (t1dVar != null) {
            this.f20486b.add(t1dVar);
        }
    }

    public final void b() {
        zxr.a("YRN_YRNV3_SDK", "YRNAppInitEntry.initReactNativeToLoadBundle");
        ezr.c().f(YRNTraceEvent.newEvent(this.e, 1100, "initReactNativeToLoadBundle", null, Integer.valueOf(this.f20485a)));
        if (this.f20485a == 2) {
            return;
        }
        e(2);
        c(null);
    }

    public final void c(String str) {
        this.c.l(str, new a());
    }

    public final void d(boolean z) {
        zxr.a("YRN_YRNV3_SDK", "YRNAppInitEntry.onReactInitialized:" + z);
        f(z);
        iyr iyrVar = this.f;
        if (iyrVar != null) {
            iyrVar.d();
        }
    }

    public void e(int i) {
        this.f20485a = i;
    }

    public final void f(boolean z) {
        for (t1d t1dVar : this.f20486b) {
            if (t1dVar != null) {
                if (z) {
                    t1dVar.a();
                } else {
                    t1dVar.b();
                }
            }
        }
        this.f20486b.clear();
    }

    public synchronized void initReactNative(t1d t1dVar) {
        zxr.a("YRN_YRNV3_SDK", "YRNAppInitEntry.initReactNative");
        long jCurrentTimeMillis = System.currentTimeMillis();
        gur gurVar = this.d;
        if (gurVar != null && gurVar.p() != null && !this.d.p().isEnableRN()) {
            if (t1dVar != null) {
                t1dVar.b();
            }
            return;
        }
        int i = this.f20485a;
        if (i == 1) {
            addListener(t1dVar);
            b();
        } else if (i == 2) {
            addListener(t1dVar);
        } else if (i == 3) {
            if (this.c.j("") == null) {
                addListener(t1dVar);
                b();
            } else if (t1dVar != null) {
                t1dVar.a();
            }
        }
        zxr.a("YRN_YRNV3_SDK", "YRNAppInitEntry.initialReact: time:" + (System.currentTimeMillis() - jCurrentTimeMillis));
    }

    public synchronized void removeInitialReactListener(t1d t1dVar) {
        if (t1dVar != null) {
            this.f20486b.remove(t1dVar);
        }
    }
}
