package defpackage;

import android.util.SparseArray;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.camera.core.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class n0m implements o5d {
    public final List<Integer> e;
    public String f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f27412a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("mLock")
    public final SparseArray<cb3.a<m>> f27413b = new SparseArray<>();

    @GuardedBy("mLock")
    public final SparseArray<lhe<m>> c = new SparseArray<>();

    @GuardedBy("mLock")
    public final List<m> d = new ArrayList();

    @GuardedBy("mLock")
    public boolean g = false;

    public class a implements cb3.c<m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f27414a;

        public a(int i) {
            this.f27414a = i;
        }

        @Override // cb3.c
        public Object a(cb3.a<m> aVar) {
            synchronized (n0m.this.f27412a) {
                n0m.this.f27413b.put(this.f27414a, aVar);
            }
            return "getImageProxy(id: " + this.f27414a + ")";
        }
    }

    public n0m(List<Integer> list, String str) {
        this.e = list;
        this.f = str;
        f();
    }

    @Override // defpackage.o5d
    public List<Integer> a() {
        return Collections.unmodifiableList(this.e);
    }

    @Override // defpackage.o5d
    public lhe<m> b(int i) {
        lhe<m> lheVar;
        synchronized (this.f27412a) {
            try {
                if (this.g) {
                    throw new IllegalStateException("ImageProxyBundle already closed.");
                }
                lheVar = this.c.get(i);
                if (lheVar == null) {
                    throw new IllegalArgumentException("ImageProxyBundle does not contain this id: " + i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return lheVar;
    }

    public void c(m mVar) {
        synchronized (this.f27412a) {
            try {
                if (this.g) {
                    return;
                }
                Integer num = (Integer) mVar.H().a().c(this.f);
                if (num == null) {
                    throw new IllegalArgumentException("CaptureId is null.");
                }
                cb3.a<m> aVar = this.f27413b.get(num.intValue());
                if (aVar != null) {
                    this.d.add(mVar);
                    aVar.c(mVar);
                } else {
                    throw new IllegalArgumentException("ImageProxyBundle does not contain this id: " + num);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d() {
        synchronized (this.f27412a) {
            try {
                if (this.g) {
                    return;
                }
                Iterator<m> it = this.d.iterator();
                while (it.hasNext()) {
                    it.next().close();
                }
                this.d.clear();
                this.c.clear();
                this.f27413b.clear();
                this.g = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e() {
        synchronized (this.f27412a) {
            try {
                if (this.g) {
                    return;
                }
                Iterator<m> it = this.d.iterator();
                while (it.hasNext()) {
                    it.next().close();
                }
                this.d.clear();
                this.c.clear();
                this.f27413b.clear();
                f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        synchronized (this.f27412a) {
            try {
                Iterator<Integer> it = this.e.iterator();
                while (it.hasNext()) {
                    int iIntValue = it.next().intValue();
                    this.c.put(iIntValue, cb3.a(new a(iIntValue)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
