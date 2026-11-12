package av0;

import ak0.z;
import android.content.Context;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.s0;
import androidx.lifecycle.w0;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import d53.w;
import e23.l;
import e23.p;
import e23.q;
import et1.w1;
import et1.x1;
import f4.s;
import i3.a1;
import i3.mc;
import i3.pc;
import lc.u0;
import o53.b0;
import org.koin.androidx.viewmodel.ext.android.ViewModelLazyKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import p3.n1;
import p3.p1;
import p3.x3;
import pt1.j;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13173a = 5;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f13178f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f13179g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f13180h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f13181i;

    public /* synthetic */ d(s0 s0Var, m0 m0Var, m0 m0Var2, s0 s0Var2, m0 m0Var3, s0 s0Var3, w0 w0Var, q qVar) {
        this.f13175c = s0Var;
        this.f13176d = m0Var;
        this.f13174b = m0Var2;
        this.f13177e = s0Var2;
        this.f13178f = m0Var3;
        this.f13179g = s0Var3;
        this.f13180h = w0Var;
        this.f13181i = qVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        pt1.a aVar;
        j jVar;
        i53.c<pt1.i> cVar;
        String string;
        Object objD;
        Object objD2;
        Object objD3;
        int i14 = this.f13173a;
        int i15 = 0;
        Object obj = this.f13179g;
        Object obj2 = this.f13178f;
        Object obj3 = this.f13181i;
        Object obj4 = this.f13180h;
        Object obj5 = this.f13174b;
        Object obj6 = this.f13177e;
        Object obj7 = this.f13176d;
        Object obj8 = this.f13175c;
        switch (i14) {
            case 0:
                b.g gVar = (b.g) obj8;
                c.q qVar = (c.q) obj7;
                e23.a aVar2 = (e23.a) obj5;
                p1 p1Var = (p1) obj6;
                p1 p1Var2 = (p1) obj2;
                pu0.b bVar = (pu0.b) obj4;
                gv0.d dVar = (gv0.d) obj3;
                p1 p1Var3 = (p1) obj;
                p1Var.setValue(Boolean.FALSE);
                if (((String) p1Var2.getF182175a()) != null) {
                    String str = (String) p1Var2.getF182175a();
                    p1Var.setValue(Boolean.valueOf(h.c(gVar, str != null ? str : "", qVar, new e(bVar, dVar, i15), new z(p1Var3, 9), new z(p1Var3, 10), aVar2)));
                }
                return Unit.INSTANCE;
            case 1:
                pt1.c cVar2 = (pt1.c) obj8;
                a1 a1Var = (a1) obj7;
                b0 b0Var = (b0) obj6;
                m4.q qVar2 = (m4.q) obj2;
                e23.a aVar3 = (e23.a) obj5;
                p pVar = (p) obj;
                l lVar = (l) obj4;
                je2.b bVar2 = (je2.b) obj3;
                if (cVar2 == null || (jVar = cVar2.f140821f) == null || (cVar = jVar.f140869c) == null || !(!cVar.isEmpty())) {
                    kt1.a aVar4 = (cVar2 == null || (aVar = cVar2.f140820e) == null) ? null : aVar.f140798a;
                    int i16 = aVar4 == null ? -1 : w1.a.f65931a[aVar4.ordinal()];
                    if (i16 == 1 || i16 == 2) {
                        lVar.invoke(bVar2);
                        Unit unit = Unit.INSTANCE;
                    } else if (i16 == 3 && a1Var.f87409a.c() == pc.Expanded) {
                        ge1.b.T(b0Var, null, null, new x1(a1Var, null), 3);
                    } else {
                        aVar3.invoke();
                    }
                } else {
                    pVar.invoke("", Boolean.FALSE);
                    qVar2.y(true);
                }
                return Unit.INSTANCE;
            case 2:
                ((n1) obj3).t(0);
                ((p1) obj6).setValue("");
                ((p1) obj).setValue("");
                ((s) obj8).clear();
                ((s) obj7).clear();
                ((p1) obj2).setValue(Boolean.FALSE);
                ((s) obj4).clear();
                ((e23.a) obj5).invoke();
                return Unit.INSTANCE;
            case 3:
                hl.a aVar5 = (hl.a) obj7;
                Context context = (Context) obj6;
                pu0.b bVar3 = (pu0.b) obj4;
                l lVar2 = (l) obj2;
                e23.a aVar6 = (e23.a) obj3;
                ge1.b.T((b0) obj8, null, null, new iv0.q((e23.a) obj5, (mc) obj, null), 3);
                if (p005kotlin.jvm.internal.s.g(aVar5, hl.a.c.f84256b)) {
                    string = context.getString(R.string.live_track_remove_recipient_description, w.i0(og.a.A(bVar3)).toString());
                } else {
                    if (!(aVar5 instanceof hl.a.b)) {
                        u0.r();
                        return null;
                    }
                    string = context.getString(R.string.msg_child_livetrack_remove_recipient, w.i0(og.a.A(bVar3)).toString());
                }
                string.getClass();
                String string2 = context.getString(R.string.live_track_remove_recipient);
                lVar2.invoke(new lv0.a.C2188a(string2, string, p6.b.d(context, R.string.lbl_remove, string2), new ii0.h(aVar6, 20)));
                return Unit.INSTANCE;
            case 4:
                return ViewModelLazyKt.viewModelForClass$lambda$0((e23.a) obj5, (ViewModelStoreOwner) obj7, (b.g) obj8, (k23.d) obj6, (y1) obj2, (String) obj, (Qualifier) obj4, (e23.a) obj3);
            case 5:
                s0 s0Var = (s0) obj8;
                m0 m0Var = (m0) obj5;
                s0 s0Var2 = (s0) obj6;
                m0 m0Var2 = (m0) obj2;
                s0 s0Var3 = (s0) obj;
                w0 w0Var = (w0) obj4;
                q qVar3 = (q) obj3;
                boolean z14 = ((m0) obj7).f105804a;
                if (s0Var == null) {
                    if (z14 && m0Var.f105804a) {
                        i2.a aVar7 = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        aVar7.getClass();
                        i2.a.b(a2Var, "LiveDataExt", "mergeFunc - both sources emitted");
                        Object objD4 = s0Var2.d();
                        if (objD4 != null && (objD3 = s0Var3.d()) != null) {
                            w0Var.m(qVar3.invoke(objD4, objD3, null));
                        }
                    }
                } else if (z14 && m0Var.f105804a && m0Var2.f105804a) {
                    i2.a aVar8 = i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar8.getClass();
                    i2.a.b(a2Var2, "LiveDataExt", "mergeFunc - all sources emitted");
                    Object objD5 = s0Var2.d();
                    if (objD5 != null && (objD = s0Var3.d()) != null && (objD2 = s0Var.d()) != null) {
                        w0Var.m(qVar3.invoke(objD5, objD, objD2));
                    }
                }
                return Unit.INSTANCE;
            default:
                b0 b0Var2 = (b0) obj8;
                c.q qVar4 = (c.q) obj7;
                Context context2 = (Context) obj5;
                AddTIEventViewModel addTIEventViewModel = (AddTIEventViewModel) obj4;
                x3 x3Var = (x3) obj3;
                p1 p1Var4 = (p1) obj2;
                p1 p1Var5 = (p1) obj;
                if (((Boolean) ((p1) obj6).getF182175a()).booleanValue()) {
                    ge1.b.T(b0Var2, null, null, new yy1.s(context2, addTIEventViewModel, x3Var, p1Var4, p1Var5, null), 3);
                } else {
                    qVar4.a("android.permission.ACCESS_FINE_LOCATION", null);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ d(b.g gVar, c.q qVar, e23.a aVar, p1 p1Var, p1 p1Var2, pu0.b bVar, gv0.d dVar, p1 p1Var3) {
        this.f13175c = gVar;
        this.f13176d = qVar;
        this.f13174b = aVar;
        this.f13177e = p1Var;
        this.f13178f = p1Var2;
        this.f13180h = bVar;
        this.f13181i = dVar;
        this.f13179g = p1Var3;
    }

    public /* synthetic */ d(e23.a aVar, ViewModelStoreOwner viewModelStoreOwner, b.g gVar, k23.d dVar, y1 y1Var, String str, Qualifier qualifier, e23.a aVar2) {
        this.f13174b = aVar;
        this.f13176d = viewModelStoreOwner;
        this.f13175c = gVar;
        this.f13177e = dVar;
        this.f13178f = y1Var;
        this.f13179g = str;
        this.f13180h = qualifier;
        this.f13181i = aVar2;
    }

    public /* synthetic */ d(b0 b0Var, c.q qVar, p1 p1Var, Context context, AddTIEventViewModel addTIEventViewModel, p1 p1Var2, p1 p1Var3, p1 p1Var4) {
        this.f13175c = b0Var;
        this.f13176d = qVar;
        this.f13177e = p1Var;
        this.f13174b = context;
        this.f13180h = addTIEventViewModel;
        this.f13181i = p1Var2;
        this.f13178f = p1Var3;
        this.f13179g = p1Var4;
    }

    public /* synthetic */ d(b0 b0Var, hl.a aVar, Context context, pu0.b bVar, l lVar, e23.a aVar2, mc mcVar, e23.a aVar3) {
        this.f13175c = b0Var;
        this.f13176d = aVar;
        this.f13177e = context;
        this.f13180h = bVar;
        this.f13178f = lVar;
        this.f13174b = aVar2;
        this.f13179g = mcVar;
        this.f13181i = aVar3;
    }

    public /* synthetic */ d(p1 p1Var, s sVar, s sVar2, p1 p1Var2, s sVar3, e23.a aVar, n1 n1Var, p1 p1Var3) {
        this.f13177e = p1Var;
        this.f13175c = sVar;
        this.f13176d = sVar2;
        this.f13178f = p1Var2;
        this.f13180h = sVar3;
        this.f13174b = aVar;
        this.f13181i = n1Var;
        this.f13179g = p1Var3;
    }

    public /* synthetic */ d(pt1.c cVar, a1 a1Var, b0 b0Var, m4.q qVar, e23.a aVar, p pVar, l lVar, je2.b bVar) {
        this.f13175c = cVar;
        this.f13176d = a1Var;
        this.f13177e = b0Var;
        this.f13178f = qVar;
        this.f13174b = aVar;
        this.f13179g = pVar;
        this.f13180h = lVar;
        this.f13181i = bVar;
    }
}
