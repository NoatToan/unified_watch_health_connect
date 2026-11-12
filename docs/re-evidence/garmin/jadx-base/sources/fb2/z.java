package fb2;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;

/* JADX INFO: loaded from: classes8.dex */
public abstract class z<T> extends e<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f70384d;

    public z(Context context) {
        super(context);
        this.f70384d = null;
    }

    @Override // fb2.e
    public View a() {
        if (this.f70384d == null) {
            this.f70384d = g.d(this.f70343a, s(), t(), r());
        }
        return this.f70384d;
    }

    @Override // fb2.e
    public boolean g(i.c cVar, T t7) {
        View viewFindViewById = cVar.findViewById(s());
        if (viewFindViewById != null) {
            this.f70384d = viewFindViewById;
            o(viewFindViewById);
            this.f70345c = new a0(viewFindViewById, new y(this));
            return k(t7);
        }
        View viewA = a();
        o(viewA);
        this.f70345c = new a0(viewA, new y(this));
        return k(t7);
    }

    @Override // fb2.e
    public boolean k(T t7) {
        if (t7 == null) {
            vb.h.s("Model is required");
            return false;
        }
        if (!d()) {
            vb.h.s("View decorator is not found. Please call initialize() first before calling update().");
            return false;
        }
        this.f70344b = t7;
        boolean zH = h(t7);
        if (zH) {
            a0 a0Var = (a0) this.f70345c;
            String strQ = q(t7);
            GCMComplexTwoLineButton gCMComplexTwoLineButton = a0Var.f70332b;
            if (gCMComplexTwoLineButton != null) {
                if (strQ == null) {
                    strQ = "";
                }
                gCMComplexTwoLineButton.setButtonBottomLeftLabel(strQ);
            }
        }
        return zH;
    }

    public abstract String q(T t7);

    public String r() {
        return null;
    }

    public abstract int s();

    public abstract String t();
}
