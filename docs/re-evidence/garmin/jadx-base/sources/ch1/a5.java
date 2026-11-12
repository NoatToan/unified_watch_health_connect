package ch1;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a5<T, RT> extends fb2.e<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f27300d;

    public a5(Context context) {
        super(context);
        this.f27300d = null;
    }

    public static void p(a5 a5Var, Object obj) {
        a5Var.x(obj, a5Var.f70344b);
        a5Var.setChanged();
        a5Var.notifyObservers(obj);
    }

    @Override // fb2.e
    public final View a() {
        if (this.f27300d == null) {
            int iR = r();
            if (iR == 0 || iR == 1) {
                this.f27300d = fb2.g.d(this.f70343a, t(), u(), null);
            } else if (iR == 2) {
                this.f27300d = fb2.g.b(this.f70343a, t(), u(), null, "", GCMComplexOneLineButton.a.NONE);
            }
        }
        return this.f27300d;
    }

    @Override // fb2.e
    public final boolean g(i.c cVar, T t7) {
        View viewFindViewById = cVar.findViewById(t());
        if (viewFindViewById == null) {
            this.f70345c = q(a(), cVar, new bd0.e(this, 10), t7);
            return k(t7);
        }
        this.f27300d = viewFindViewById;
        this.f70345c = q(viewFindViewById, cVar, new bd0.e(this, 10), t7);
        return k(t7);
    }

    @Override // fb2.e
    public boolean k(T t7) {
        eh1.b bVar;
        fb2.f.a(t7, "Model is required");
        fb2.f.a(this.f70345c, "View decorator is not found. Please call initialize() first before calling update().");
        this.f70344b = t7;
        boolean zH = h(t7);
        if (zH && d() && (bVar = (eh1.b) this.f70345c) != null) {
            bVar.k(s(t7));
        }
        return zH;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public eh1.b q(View view2, i.c cVar, bd0.e eVar, Object obj) {
        return new eh1.b(view2, cVar, eVar, v(obj), w());
    }

    public int r() {
        return 0;
    }

    public abstract RT s(T t7);

    public abstract int t();

    public abstract String u();

    public abstract xg1.c<RT> v(T t7);

    public abstract xg1.r<RT> w();

    public abstract void x(RT rt3, T t7);
}
