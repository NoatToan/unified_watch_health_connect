package wc;

import java.util.List;
import p005kotlin.Metadata;
import p13.j0;
import wc.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lwc/e;", "Lwc/g;", "T", "", "initialInfo", "", "isBackEnabled", "isForwardEnabled", "<init>", "(Lwc/g;ZZ)V", "(Lwc/g;Z)V", "navigationevent"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class e<T extends g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f184233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<? extends T> f184234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<? extends T> f184235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j f184236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f184237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f184238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f184239g;

    public e(T t7, boolean z14, boolean z15) {
        t7.getClass();
        this.f184233a = t7;
        j0 j0Var = j0.f134944a;
        this.f184234b = j0Var;
        this.f184235c = j0Var;
        this.f184236d = j.b.f184258a;
        this.f184237e = z14;
        this.f184238f = z15;
    }

    public final boolean a() {
        c cVar = this.f184239g;
        if (cVar == null || cVar.g()) {
            return this.f184237e;
        }
        return false;
    }

    public final boolean b() {
        c cVar = this.f184239g;
        if (cVar == null || cVar.g()) {
            return this.f184238f;
        }
        return false;
    }

    public void c() {
    }

    public void d() {
        throw new UnsupportedOperationException("A handler that receives a 'backCompleted' event must override 'onBackCompleted()' to handle the callback.");
    }

    public void e(b bVar) {
    }

    public void f(b bVar) {
        bVar.getClass();
    }

    public void g() {
    }

    public final void h() {
        c cVar = this.f184239g;
        if (cVar == null || !cVar.f184231f.remove(this)) {
            return;
        }
        i iVar = cVar.f184229d;
        iVar.getClass();
        if (equals(iVar.f184249f)) {
            int i14 = iVar.f184250g;
            if (i14 == -1) {
                this.f184236d = j.b.f184258a;
                c();
            } else if (i14 == 1) {
                this.f184236d = j.b.f184258a;
                g();
            }
            iVar.f184249f = null;
            iVar.f184250g = 0;
            iVar.f184251h = null;
        }
        iVar.f184247d.remove(this);
        iVar.f184248e.remove(this);
        this.f184239g = null;
        iVar.b();
    }

    public final void i(boolean z14) {
        i iVar;
        if (this.f184237e == z14) {
            return;
        }
        this.f184237e = z14;
        c cVar = this.f184239g;
        if (cVar == null || (iVar = cVar.f184229d) == null) {
            return;
        }
        iVar.b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(T t7, boolean z14) {
        this(t7, z14, false);
        t7.getClass();
    }
}
