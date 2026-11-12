package fb2;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;

/* JADX INFO: loaded from: classes8.dex */
public abstract class m<T> extends e<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f70362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f70363e;

    public m(Context context) {
        super(context);
        this.f70362d = null;
        this.f70363e = false;
    }

    public static /* synthetic */ void p(m mVar, String str) {
        mVar.setChanged();
        mVar.notifyObservers(str);
    }

    @Override // fb2.e
    public View a() {
        if (this.f70362d == null) {
            Context context = this.f70343a;
            if (this.f70363e) {
                this.f70362d = g.d(context, t(), u(), s());
            } else {
                this.f70362d = g.b(context, t(), u(), null, s(), GCMComplexOneLineButton.a.NONE);
            }
        }
        return this.f70362d;
    }

    @Override // fb2.e
    public boolean g(i.c cVar, T t7) {
        n.a bVar;
        View viewFindViewById = cVar.findViewById(t());
        if (viewFindViewById != null) {
            this.f70362d = viewFindViewById;
            if (viewFindViewById instanceof GCMComplexOneLineButton) {
                GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) viewFindViewById;
                String strU = u();
                if (!TextUtils.isEmpty(strU)) {
                    gCMComplexOneLineButton.setButtonLeftLabel(strU);
                }
                String strS = s();
                if (!TextUtils.isEmpty(strS)) {
                    gCMComplexOneLineButton.setButtonBottomHint(strS);
                }
            } else if (viewFindViewById instanceof GCMComplexTwoLineButton) {
                GCMComplexTwoLineButton gCMComplexTwoLineButton = (GCMComplexTwoLineButton) viewFindViewById;
                String strU2 = u();
                if (!TextUtils.isEmpty(strU2)) {
                    gCMComplexTwoLineButton.setButtonTopLabel(strU2);
                }
                String strS2 = s();
                if (!TextUtils.isEmpty(strS2)) {
                    gCMComplexTwoLineButton.setButtonHint(strS2);
                }
            }
        } else {
            this.f70362d = a();
        }
        View view2 = this.f70362d;
        int i14 = 0;
        if (view2 != null) {
            if (view2 instanceof GCMComplexOneLineButton) {
                bVar = new a((GCMComplexOneLineButton) view2, i14);
            } else {
                bVar = view2 instanceof GCMComplexTwoLineButton ? new b((GCMComplexTwoLineButton) view2, i14) : null;
            }
            if (bVar != null) {
                o(bVar.getView());
                n nVar = new n(bVar, new en0.n(this, 17));
                this.f70345c = nVar;
                nVar.f70366b.a(q(t7), r(t7));
                try {
                    return h(t7);
                } catch (Exception unused) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // fb2.e
    public boolean k(T t7) {
        b0 b0Var = this.f70345c;
        if (b0Var == null || t7 == null) {
            return true;
        }
        ((n) b0Var).f70366b.a(q(t7), r(t7));
        return true;
    }

    public String q(T t7) {
        return null;
    }

    public String r(T t7) {
        return null;
    }

    public String s() {
        return null;
    }

    public abstract int t();

    public abstract String u();

    public static class a implements n.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GCMComplexOneLineButton f70364a;

        private a(GCMComplexOneLineButton gCMComplexOneLineButton) {
            this.f70364a = gCMComplexOneLineButton;
        }

        @Override // fb2.n.a
        public final void a(String str, String str2) {
            GCMComplexOneLineButton gCMComplexOneLineButton = this.f70364a;
            gCMComplexOneLineButton.setButtonRightLabel(str);
            gCMComplexOneLineButton.f47763c.setContentDescription(str2);
        }

        @Override // fb2.n.a
        public final void b(int i14) {
            this.f70364a.setFieldValueColor(i14);
        }

        @Override // fb2.n.a
        public final void c(n nVar) {
            this.f70364a.setOnClickListener(nVar);
        }

        @Override // fb2.n.a
        public final String getLabel() {
            return this.f70364a.getButtonLeftLabel();
        }

        @Override // fb2.n.a
        public final View getView() {
            return this.f70364a;
        }

        public /* synthetic */ a(GCMComplexOneLineButton gCMComplexOneLineButton, int i14) {
            this(gCMComplexOneLineButton);
        }
    }

    public static class b implements n.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GCMComplexTwoLineButton f70365a;

        private b(GCMComplexTwoLineButton gCMComplexTwoLineButton) {
            this.f70365a = gCMComplexTwoLineButton;
        }

        @Override // fb2.n.a
        public final void a(String str, String str2) {
            this.f70365a.b(str, str2);
        }

        @Override // fb2.n.a
        public final void b(int i14) {
            this.f70365a.setFieldValueColor(i14);
        }

        @Override // fb2.n.a
        public final void c(n nVar) {
            this.f70365a.setOnClickListener(nVar);
        }

        @Override // fb2.n.a
        public final String getLabel() {
            return this.f70365a.getButtonTopLabel();
        }

        @Override // fb2.n.a
        public final View getView() {
            return this.f70365a;
        }

        public /* synthetic */ b(GCMComplexTwoLineButton gCMComplexTwoLineButton, int i14) {
            this(gCMComplexTwoLineButton);
        }
    }

    public m(Context context, boolean z14) {
        super(context);
        this.f70362d = null;
        this.f70363e = z14;
    }

    public m(Context context, boolean z14, boolean z15) {
        super(context);
        this.f70362d = null;
        this.f70363e = z14;
    }
}
