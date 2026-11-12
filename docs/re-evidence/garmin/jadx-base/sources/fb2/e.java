package fb2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Observable;

/* JADX INFO: loaded from: classes8.dex */
public abstract class e<T> extends Observable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f70343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T f70344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b0 f70345c;

    public e(Context context) {
        this.f70343a = context;
    }

    public abstract View a();

    public final String b(int i14) {
        Context context = this.f70343a;
        return context != null ? context.getString(i14) : "";
    }

    public final String c(int i14, Object... objArr) {
        Context context = this.f70343a;
        return context != null ? context.getString(i14, objArr) : "";
    }

    public final boolean d() {
        return this.f70345c != null;
    }

    public final View f(int i14) {
        try {
            return ((LayoutInflater) this.f70343a.getSystemService("layout_inflater")).inflate(i14, (ViewGroup) null);
        } catch (Exception unused) {
            return null;
        }
    }

    public abstract boolean g(i.c cVar, T t7);

    public abstract boolean h(T t7);

    public final boolean i() {
        if (d()) {
            return this.f70345c.b();
        }
        return false;
    }

    public final boolean j() {
        if (d()) {
            return this.f70345c.d();
        }
        return false;
    }

    public abstract boolean k(T t7);

    public void l(boolean z14) {
        if (d()) {
            this.f70345c.h(z14);
        }
    }

    public void m(boolean z14) {
        if (d()) {
            this.f70345c.j(z14);
        }
    }

    public final void n() {
        this.f70343a = null;
        this.f70344b = null;
        if (d()) {
            this.f70345c.f70334a = null;
            this.f70345c = null;
        }
    }

    public final void o(View view2) {
        if (view2 != null) {
            Class<?> enclosingClass = getClass().getEnclosingClass();
            view2.setTag(-1, enclosingClass != null ? enclosingClass.getName() : getClass().getName());
        }
    }
}
