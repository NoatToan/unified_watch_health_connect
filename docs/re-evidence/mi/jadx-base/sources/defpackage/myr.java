package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class myr implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<String> f27355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m1d f27356b;
    public final c1d c;
    public int d;
    public final Handler e = new Handler(Looper.getMainLooper());
    public final HashMap<String, u1d<Boolean>> f;

    public class a implements m1d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ u1d f27357a;

        public a(u1d u1dVar) {
            this.f27357a = u1dVar;
        }

        @Override // defpackage.m1d
        public void onLoadFailure(String str) {
            if (myr.this.f27356b != null) {
                myr.this.f27356b.onLoadFailure(str);
            }
            u1d u1dVar = this.f27357a;
            if (u1dVar != null) {
                u1dVar.onResult(Boolean.FALSE);
            }
        }

        @Override // defpackage.m1d
        public void onLoadStart() {
        }

        @Override // defpackage.m1d
        public void onLoadSuccess(String str) {
            myr.b(myr.this);
            if (myr.this.d < myr.this.f27355a.size()) {
                myr.this.e.post(myr.this);
            } else if (myr.this.f27356b != null) {
                myr.this.f27356b.onLoadSuccess(str);
            }
            u1d u1dVar = this.f27357a;
            if (u1dVar != null) {
                u1dVar.onResult(Boolean.TRUE);
            }
        }
    }

    public myr(HashMap<String, u1d<Boolean>> map, c1d c1dVar, m1d m1dVar) {
        sk1.c(map);
        this.f27355a = new ArrayList();
        for (Map.Entry<String, u1d<Boolean>> entry : map.entrySet()) {
            if (entry != null) {
                this.f27355a.add(entry.getKey());
            }
        }
        this.f = map;
        this.c = c1dVar;
        this.f27356b = m1dVar;
    }

    public static /* synthetic */ int b(myr myrVar) {
        int i = myrVar.d;
        myrVar.d = i + 1;
        return i;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.d <= this.f27355a.size() - 1) {
            String str = this.f27355a.get(this.d);
            this.c.l(str, new a(this.f.get(str)));
        } else {
            m1d m1dVar = this.f27356b;
            if (m1dVar != null) {
                m1dVar.onLoadSuccess(null);
            }
        }
    }
}
