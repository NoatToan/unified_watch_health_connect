package defpackage;

import io.reactivex.exceptions.CompositeException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class na4 implements jz6, kz6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public bbh<jz6> f27702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f27703b;

    @Override // defpackage.kz6
    public boolean a(jz6 jz6Var) {
        x3h.d(jz6Var, "disposable is null");
        if (!this.f27703b) {
            synchronized (this) {
                try {
                    if (!this.f27703b) {
                        bbh<jz6> bbhVar = this.f27702a;
                        if (bbhVar == null) {
                            bbhVar = new bbh<>();
                            this.f27702a = bbhVar;
                        }
                        bbhVar.a(jz6Var);
                        return true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        jz6Var.dispose();
        return false;
    }

    @Override // defpackage.kz6
    public boolean b(jz6 jz6Var) {
        if (!c(jz6Var)) {
            return false;
        }
        jz6Var.dispose();
        return true;
    }

    @Override // defpackage.kz6
    public boolean c(jz6 jz6Var) {
        x3h.d(jz6Var, "disposables is null");
        if (this.f27703b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f27703b) {
                    return false;
                }
                bbh<jz6> bbhVar = this.f27702a;
                if (bbhVar != null && bbhVar.e(jz6Var)) {
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d() {
        if (this.f27703b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f27703b) {
                    return;
                }
                bbh<jz6> bbhVar = this.f27702a;
                this.f27702a = null;
                e(bbhVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.jz6
    public void dispose() {
        if (this.f27703b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f27703b) {
                    return;
                }
                this.f27703b = true;
                bbh<jz6> bbhVar = this.f27702a;
                this.f27702a = null;
                e(bbhVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(bbh<jz6> bbhVar) {
        if (bbhVar == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : bbhVar.b()) {
            if (obj instanceof jz6) {
                try {
                    ((jz6) obj).dispose();
                } catch (Throwable th) {
                    qf8.b(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new CompositeException(arrayList);
            }
            throw jf8.d((Throwable) arrayList.get(0));
        }
    }

    @Override // defpackage.jz6
    public boolean isDisposed() {
        return this.f27703b;
    }
}
