package fb2;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a<T> extends e<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f70326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f70327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f70328f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f70329g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f70330h;

    /* JADX INFO: renamed from: fb2.a$a, reason: collision with other inner class name */
    public class C1441a implements b0.a<Boolean> {
        public C1441a() {
        }

        @Override // fb2.b0.a
        public final void e(Boolean bool) {
            Boolean bool2 = bool;
            a aVar = a.this;
            if (!aVar.f70330h || bool2 == null) {
                return;
            }
            aVar.y(aVar.f70344b, bool2.booleanValue());
            aVar.setChanged();
            aVar.notifyObservers(bool2);
        }
    }

    public a(Context context, boolean z14) {
        super(context);
        this.f70326d = null;
        this.f70327e = true;
        this.f70328f = null;
        this.f70329g = false;
        this.f70330h = !z14;
    }

    @Override // fb2.e
    public final View a() {
        if (this.f70326d == null) {
            boolean z14 = this.f70327e;
            boolean z15 = this.f70329g;
            Context context = this.f70343a;
            if (z14) {
                if (z15) {
                    this.f70326d = g.d(context, getF71600i(), t(), r());
                } else {
                    this.f70326d = g.b(context, getF71600i(), t(), u(), r(), GCMComplexOneLineButton.a.SWITCH);
                }
            } else if (z15) {
                this.f70326d = g.d(context, getF71600i(), t(), null);
            } else {
                this.f70326d = g.b(context, getF71600i(), t(), u(), null, GCMComplexOneLineButton.a.SWITCH);
            }
        }
        return this.f70326d;
    }

    @Override // fb2.e
    public final boolean g(i.c cVar, T t7) {
        View viewFindViewById = cVar.findViewById(getF71600i());
        if (viewFindViewById == null) {
            View viewA = a();
            o(viewA);
            return w(viewA, t7);
        }
        this.f70326d = viewFindViewById;
        o(viewFindViewById);
        View view2 = this.f70326d;
        if (view2 instanceof GCMComplexOneLineButton) {
            GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) view2;
            if (!TextUtils.isEmpty(t())) {
                gCMComplexOneLineButton.setButtonLeftLabel(t());
            }
            if (!TextUtils.isEmpty(r())) {
                gCMComplexOneLineButton.setButtonBottomHint(r());
            }
        }
        View view3 = this.f70326d;
        if (view3 instanceof GCMComplexTwoLineButton) {
            GCMComplexTwoLineButton gCMComplexTwoLineButton = (GCMComplexTwoLineButton) view3;
            if (!TextUtils.isEmpty(t())) {
                gCMComplexTwoLineButton.setButtonTopLabel(t());
            }
            if (!TextUtils.isEmpty(r())) {
                gCMComplexTwoLineButton.setButtonHint(r());
            }
        }
        return w(viewFindViewById, t7);
    }

    @Override // fb2.e
    public final boolean k(T t7) {
        f.a(t7, "Model is required");
        f.a(this.f70345c, "View decorator is not found. Please call initialize() first before calling update().");
        this.f70344b = t7;
        boolean zH = h(t7);
        if (zH) {
            boolean z14 = this.f70329g;
            b0 b0Var = this.f70345c;
            if (z14) {
                boolean zQ = q(t7);
                GCMComplexTwoLineButton gCMComplexTwoLineButton = ((x) b0Var).f70382b;
                if (gCMComplexTwoLineButton != null) {
                    gCMComplexTwoLineButton.g(zQ);
                    return zH;
                }
            } else {
                boolean zQ2 = q(t7);
                GCMComplexOneLineButton gCMComplexOneLineButton = ((b) b0Var).f70333b;
                if (gCMComplexOneLineButton != null) {
                    gCMComplexOneLineButton.i(zQ2);
                }
            }
        }
        return zH;
    }

    public abstract boolean q(T t7);

    public String r() {
        return null;
    }

    /* JADX INFO: renamed from: s */
    public abstract int getF71600i();

    public abstract String t();

    public Integer u() {
        return null;
    }

    public String v() {
        return null;
    }

    public boolean w(View view2, T t7) {
        C1441a c1441a = new C1441a();
        if (this.f70329g) {
            x xVar = new x(view2, c1441a);
            this.f70345c = xVar;
            String strV = v();
            GCMComplexTwoLineButton gCMComplexTwoLineButton = xVar.f70382b;
            if (gCMComplexTwoLineButton != null && strV != null) {
                gCMComplexTwoLineButton.b(strV, null);
            }
            xVar.h(true);
        } else {
            this.f70345c = new b(view2, c1441a);
        }
        boolean zK = k(t7);
        this.f70330h = true;
        return zK;
    }

    public final boolean x() {
        boolean z14 = this.f70329g;
        View view2 = this.f70326d;
        if (!z14) {
            return ((GCMComplexOneLineButton) view2).f47771k.isChecked();
        }
        SwitchCompat switchCompat = ((GCMComplexTwoLineButton) view2).f47791k;
        return switchCompat != null && switchCompat.isChecked();
    }

    public abstract void y(Object obj, boolean z14);

    public a(Context context) {
        super(context);
        this.f70326d = null;
        this.f70327e = true;
        this.f70328f = null;
        this.f70329g = false;
        this.f70330h = true;
    }

    public a(Context context, String str) {
        super(context);
        this.f70326d = null;
        this.f70327e = true;
        this.f70329g = false;
        this.f70330h = true;
        this.f70328f = str;
    }

    public a(Context context, int i14) {
        this(context, context.getString(i14));
    }
}
