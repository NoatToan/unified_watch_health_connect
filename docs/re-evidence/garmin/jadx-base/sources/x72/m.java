package x72;

import c2.t2;
import c2.x2;
import com.garmin.android.apps.connectmobile.settings.usersettings.stride.StrideLengthSettingsActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import h4.r;
import o53.b0;
import p005kotlin.Unit;
import p3.p0;
import p3.p1;
import p3.x1;
import w52.u0;
import yr.t0;
import za0.t;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class m implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f189479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f189480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f189481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f189482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f189483e;

    public /* synthetic */ m(AddTIEventViewModel addTIEventViewModel, boolean z14, b0 b0Var, p1 p1Var) {
        this.f189479a = 3;
        this.f189481c = addTIEventViewModel;
        this.f189480b = z14;
        this.f189482d = b0Var;
        this.f189483e = p1Var;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f189479a;
        Object obj3 = this.f189483e;
        Object obj4 = this.f189482d;
        Object obj5 = this.f189481c;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                n.c((r) obj5, (d) obj4, this.f189480b, (e23.l) obj3, (p3.m) obj, p0.t(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                u0.c((xc.e) obj5, this.f189480b, (e23.a) obj4, (e23.a) obj3, (p3.m) obj, p0.t(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                t0.a((t2) obj5, this.f189480b, (e23.a) obj4, (e23.a) obj3, (p3.m) obj, p0.t(7));
                break;
            case 3:
                AddTIEventViewModel addTIEventViewModel = (AddTIEventViewModel) obj5;
                b0 b0Var = (b0) obj4;
                p1 p1Var = (p1) obj3;
                String str = (String) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                str.getClass();
                addTIEventViewModel.J6(str);
                boolean z14 = this.f189480b;
                if (!zBooleanValue) {
                    if (str.length() == 0) {
                        addTIEventViewModel.M6(null);
                    }
                    ge1.b.T(b0Var, null, null, new yy1.r(str, z14, addTIEventViewModel, null), 3);
                } else {
                    p1Var.setValue(Boolean.TRUE);
                    if (z14) {
                        p1Var.setValue(Boolean.FALSE);
                    } else {
                        addTIEventViewModel.I6(null);
                        addTIEventViewModel.M6(null);
                        addTIEventViewModel.J6("");
                    }
                }
                break;
            case 4:
                String str2 = (String) obj5;
                String str3 = (String) obj4;
                String str4 = (String) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    r.a aVar = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    g6.f.a aVar2 = g6.f.f75994b;
                    r rVarF = x2.f(c2.l.C(aVar, 0.0f, j92.b.f97899b.f97920e, 0.0f, 12, 5), 1.0f);
                    c2.j.f22691a.getClass();
                    c2.t0.a(rVarF, c2.j.f22698h, null, null, 3, 0, z3.f.c(-1251154975, new kh0.p(2, str2, str3, str4, this.f189480b), mVar), mVar, 1597488, 44);
                } else {
                    mVar.e();
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                z50.b.b(this.f189480b, (e23.l) obj3, (w20.b) obj5, (e23.l) obj4, (p3.m) obj, p0.t(49));
                break;
            case 6:
                ((Integer) obj2).getClass();
                t.a((za0.i) obj5, this.f189480b, (a4.a) obj4, (e23.a) obj3, (p3.m) obj, p0.t(1));
                break;
            default:
                ((Integer) obj2).getClass();
                zk1.e.a((StrideLengthSettingsActivity) obj5, (al1.a) obj4, this.f189480b, (e23.l) obj3, (p3.m) obj, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ m(Object obj, Object obj2, boolean z14, e23.l lVar, int i14, int i15) {
        this.f189479a = i15;
        this.f189481c = obj;
        this.f189482d = obj2;
        this.f189480b = z14;
        this.f189483e = lVar;
    }

    public /* synthetic */ m(Object obj, boolean z14, o13.h hVar, e23.a aVar, int i14, int i15) {
        this.f189479a = i15;
        this.f189481c = obj;
        this.f189480b = z14;
        this.f189482d = hVar;
        this.f189483e = aVar;
    }

    public /* synthetic */ m(String str, String str2, String str3, boolean z14) {
        this.f189479a = 4;
        this.f189480b = z14;
        this.f189481c = str;
        this.f189482d = str2;
        this.f189483e = str3;
    }

    public /* synthetic */ m(boolean z14, e23.l lVar, w20.b bVar, e23.l lVar2, int i14) {
        this.f189479a = 5;
        this.f189480b = z14;
        this.f189483e = lVar;
        this.f189481c = bVar;
        this.f189482d = lVar2;
    }
}
