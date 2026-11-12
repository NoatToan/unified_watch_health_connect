package defpackage;

import android.graphics.drawable.Animatable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class k1a<INFO> implements uj4<INFO> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<uj4<? super INFO>> f23323a = new ArrayList(2);

    @Override // defpackage.uj4
    public synchronized void a(String str) {
        int size = this.f23323a.size();
        for (int i = 0; i < size; i++) {
            try {
                uj4<? super INFO> uj4Var = this.f23323a.get(i);
                if (uj4Var != null) {
                    uj4Var.a(str);
                }
            } catch (Exception e) {
                i("InternalListener exception in onRelease", e);
            }
        }
    }

    @Override // defpackage.uj4
    public synchronized void b(String str, Object obj) {
        int size = this.f23323a.size();
        for (int i = 0; i < size; i++) {
            try {
                uj4<? super INFO> uj4Var = this.f23323a.get(i);
                if (uj4Var != null) {
                    uj4Var.b(str, obj);
                }
            } catch (Exception e) {
                i("InternalListener exception in onSubmit", e);
            }
        }
    }

    @Override // defpackage.uj4
    public void c(String str, INFO info) {
        int size = this.f23323a.size();
        for (int i = 0; i < size; i++) {
            try {
                uj4<? super INFO> uj4Var = this.f23323a.get(i);
                if (uj4Var != null) {
                    uj4Var.c(str, info);
                }
            } catch (Exception e) {
                i("InternalListener exception in onIntermediateImageSet", e);
            }
        }
    }

    @Override // defpackage.uj4
    public synchronized void d(String str, Throwable th) {
        int size = this.f23323a.size();
        for (int i = 0; i < size; i++) {
            try {
                uj4<? super INFO> uj4Var = this.f23323a.get(i);
                if (uj4Var != null) {
                    uj4Var.d(str, th);
                }
            } catch (Exception e) {
                i("InternalListener exception in onFailure", e);
            }
        }
    }

    @Override // defpackage.uj4
    public synchronized void e(String str, INFO info, Animatable animatable) {
        int size = this.f23323a.size();
        for (int i = 0; i < size; i++) {
            try {
                uj4<? super INFO> uj4Var = this.f23323a.get(i);
                if (uj4Var != null) {
                    uj4Var.e(str, info, animatable);
                }
            } catch (Exception e) {
                i("InternalListener exception in onFinalImageSet", e);
            }
        }
    }

    @Override // defpackage.uj4
    public void f(String str, Throwable th) {
        int size = this.f23323a.size();
        for (int i = 0; i < size; i++) {
            try {
                uj4<? super INFO> uj4Var = this.f23323a.get(i);
                if (uj4Var != null) {
                    uj4Var.f(str, th);
                }
            } catch (Exception e) {
                i("InternalListener exception in onIntermediateImageFailed", e);
            }
        }
    }

    public synchronized void g(uj4<? super INFO> uj4Var) {
        this.f23323a.add(uj4Var);
    }

    public synchronized void h() {
        this.f23323a.clear();
    }

    public final synchronized void i(String str, Throwable th) {
    }

    public synchronized void j(uj4<? super INFO> uj4Var) {
        int iIndexOf = this.f23323a.indexOf(uj4Var);
        if (iIndexOf != -1) {
            this.f23323a.set(iIndexOf, null);
        }
    }
}
