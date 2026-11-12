package v2;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v1 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f175185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w1 f175186b;

    public /* synthetic */ v1(w1 w1Var, int i14) {
        this.f175185a = i14;
        this.f175186b = w1Var;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00fa  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f175185a;
        Activity activity = null;
        int i15 = 1;
        w1 w1Var = this.f175186b;
        switch (i14) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object[] objArr = w1Var.f175195f && !w1Var.f175196g;
                if (!zBooleanValue) {
                    w1Var.X1();
                    h2 h2Var = w1Var.f175192c;
                    u2.h hVar = h2Var.f175039a;
                    h2.a aVar = h2.f175038e;
                    x2.c cVar = x2.c.MergeIfPossible;
                    hVar.f167847b.a().b();
                    u2.d dVar = hVar.f167847b;
                    dVar.e(null);
                    h2Var.l(dVar);
                    u2.h.a(hVar, true, cVar);
                    w1Var.f175192c.a();
                } else if (objArr != false) {
                    w1Var.c2(false);
                }
                h5.j1.a(w1Var, new u1(w1Var, i15));
                return Unit.INSTANCE;
            case 1:
                k4.c cVar2 = (k4.c) obj;
                if (w1.b.a(w1Var) != null) {
                    ClipData clipData = cVar2.f102805a.getClipData();
                    int itemCount = clipData.getItemCount();
                    for (int i16 = 0; i16 < itemCount; i16++) {
                        Uri uri = clipData.getItemAt(i16).getUri();
                        if (uri != null && p005kotlin.jvm.internal.s.g(uri.getScheme(), FirebaseAnalytics.Param.CONTENT)) {
                            if (w1Var.getNode().getIsAttached()) {
                                for (Context context = h5.l.a(w1Var).getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                                    if (context instanceof Activity) {
                                        activity = (Activity) context;
                                        if (activity != null) {
                                            androidx.core.view.l.a(activity, cVar2.f102805a);
                                        }
                                    }
                                }
                                if (activity != null) {
                                    androidx.core.view.l.a(activity, cVar2.f102805a);
                                }
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            case 2:
                a2.e eVar = new a2.e();
                w1Var.f175199j.a(eVar);
                w1Var.f175204o = eVar;
                w1.a aVarA = w1.b.a(w1Var);
                if (aVarA != null) {
                    aVarA.a();
                }
                return Unit.INSTANCE;
            case 3:
                g2 g2Var = w1Var.f175193d;
                long jF = ((n4.c) obj).f123544a;
                f5.c0 c0VarB = g2Var.b();
                if (c0VarB != null && c0VarB.isAttached()) {
                    jF = c0VarB.F(jF);
                }
                int iD = w1Var.f175193d.d(jF, true);
                if (iD >= 0) {
                    w1Var.f175192c.j(og.a.l(iD, iD));
                }
                w1Var.f175194e.G(p006l2.l1.Cursor, jF);
                return Unit.INSTANCE;
            case 4:
                w1Var.Y1();
                w1Var.f175194e.i();
                w1.a aVarA2 = w1.b.a(w1Var);
                if (aVarA2 != null) {
                    aVarA2.a();
                }
                return Unit.INSTANCE;
            case 5:
                w1Var.Y1();
                return Unit.INSTANCE;
            case 6:
                ge1.b.T(w1Var.getCoroutineScope(), null, o53.d0.UNDISPATCHED, new w1.e((p006l2.s1) obj, w1Var, null), 1);
                return Unit.INSTANCE;
            case 7:
                List list = (List) obj;
                s5.q0 q0VarC = w1Var.f175193d.c();
                return Boolean.valueOf(q0VarC != null ? list.add(q0VarC) : false);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                w1Var.f175194e.f181378n.setValue(bool);
                return Unit.INSTANCE;
        }
    }
}
