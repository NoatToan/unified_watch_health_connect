package gw;

import com.garmin.android.apps.connectmobile.view.MultiLineImeEditText;
import g2.m1;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class j implements jw.o, jw.y, jw.d0.b, MultiLineImeEditText.b, ga.g.b, u03.d, u03.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f79511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f79512b;

    public /* synthetic */ j(Object obj, int i14) {
        this.f79511a = i14;
        this.f79512b = obj;
    }

    @Override // jw.d0.b
    public void a(to.c cVar) {
        ((l0) this.f79512b).i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, cVar);
    }

    @Override // u03.d
    public void accept(Object obj) {
        int i14 = this.f79511a;
        Object obj2 = this.f79512b;
        switch (i14) {
            case 5:
                Logger logger = hn2.c.f84546f;
                ((ha0.b) obj2).invoke(obj);
                break;
            case 6:
                ((hn2.d) obj2).invoke(obj);
                break;
            case 7:
                ((hn2.d) obj2).invoke(obj);
                break;
            case 8:
                ((hn2.d) obj2).invoke(obj);
                break;
            default:
                Logger logger2 = hq2.r.f85270f;
                ((m1) obj2).invoke(obj);
                break;
        }
    }

    @Override // u03.f
    /* JADX INFO: renamed from: apply */
    public Object mo330apply(Object obj) {
        int i14 = this.f79511a;
        Object obj2 = this.f79512b;
        switch (i14) {
            case 10:
                int i15 = hq2.g.f85248g;
                obj.getClass();
                return (q03.v) ((hq.f0) obj2).invoke(obj);
            case 11:
                int i16 = hq2.g.f85248g;
                obj.getClass();
                return (q03.v) ((gw1.d) obj2).invoke(obj);
            case 12:
                int i17 = hq2.g.f85248g;
                obj.getClass();
                return (String) ((hq.f0) obj2).invoke(obj);
            case 13:
                int i18 = hq2.g.f85248g;
                obj.getClass();
                return (hq2.q) ((hq2.e) obj2).invoke(obj);
            case 14:
                int i19 = hq2.g.f85248g;
                obj.getClass();
                return (q03.v) ((hq2.b) obj2).invoke(obj);
            case 15:
                int i24 = hq2.g.f85248g;
                obj.getClass();
                return (q03.v) ((hq2.b) obj2).invoke(obj);
            case 16:
                int i25 = hq2.g.f85248g;
                obj.getClass();
                return (q03.v) ((hq.f0) obj2).invoke(obj);
            case 17:
                int i26 = hq2.g.f85248g;
                obj.getClass();
                return (q03.v) ((m1) obj2).invoke(obj);
            case 18:
                int i27 = hq2.n.f85263g;
                obj.getClass();
                return (q03.f) ((hq2.l) obj2).invoke(obj);
            case 19:
                int i28 = hq2.n.f85263g;
                obj.getClass();
                return (q03.v) ((gw1.d) obj2).invoke(obj);
            case 20:
                int i29 = hq2.n.f85263g;
                obj.getClass();
                return (hq2.q) ((hq2.e) obj2).invoke(obj);
            case 21:
                int i30 = hq2.n.f85263g;
                obj.getClass();
                return (q03.v) ((hq2.k) obj2).invoke(obj);
            case 22:
                int i34 = hq2.n.f85263g;
                obj.getClass();
                return (q03.v) ((hq2.k) obj2).invoke(obj);
            case 23:
                int i35 = hq2.n.f85263g;
                obj.getClass();
                return (q03.v) ((hq2.l) obj2).invoke(obj);
            case 24:
                int i36 = hq2.n.f85263g;
                obj.getClass();
                return (q03.v) ((hq.f0) obj2).invoke(obj);
            case 25:
                Logger logger = hq2.r.f85270f;
                obj.getClass();
                return (q03.v) ((m1) obj2).invoke(obj);
            case 26:
                Logger logger2 = hq2.r.f85270f;
                obj.getClass();
                return (q03.v) ((ct2.d) obj2).invoke(obj);
            case 27:
                Logger logger3 = hq2.r.f85270f;
                obj.getClass();
                return (q03.v) ((ho0.g) obj2).invoke(obj);
            default:
                Logger logger4 = hq2.r.f85270f;
                obj.getClass();
                return (byte[]) ((hq.f0) obj2).invoke(obj);
        }
    }

    @Override // jw.y
    public void c() {
        g0 g0Var = (g0) this.f79512b;
        g0Var.b(new jw.d(g0Var, g0Var.f79501m));
    }

    @Override // ga.g.b
    public void e(long j8, fa.r rVar) {
        bb.f.a(j8, rVar, ((hc.b0) this.f79512b).f82828b);
    }

    @Override // com.garmin.android.apps.connectmobile.view.MultiLineImeEditText.b
    public void h() {
        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a aVar = (com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a) this.f79512b;
        db1.m mVar = aVar.f40592m;
        if (mVar == null) {
            p005kotlin.jvm.internal.s.m("mPregnancySnapshotDTO");
            throw null;
        }
        MultiLineImeEditText multiLineImeEditText = aVar.f40586g;
        if (multiLineImeEditText == null) {
            p005kotlin.jvm.internal.s.m("mPregnancyNotesEditTextButton");
            throw null;
        }
        mVar.y(String.valueOf(multiLineImeEditText.getText()));
        androidx.fragment.app.m activity = aVar.getActivity();
        if (activity != null) {
            activity.invalidateOptionsMenu();
        }
    }
}
