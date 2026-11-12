package z2;

import android.app.RemoteAction;
import android.content.Context;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;
import p005kotlin.Unit;
import p3.y3;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y3 f201839a = new y3(new yx2.b(23));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u72.a f201840b = new u72.a(6);

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(n2.a aVar, Context context, boolean z14, CharSequence charSequence, s5.w0 w0Var, q qVar, e23.l<? super n2.a, Unit> lVar) {
        if (charSequence == null || w0Var == null || qVar == null || !(qVar instanceof w)) {
            lVar.invoke(aVar);
            if (charSequence == null || w0Var == null) {
                return;
            }
            m2.c.a(aVar, context, z14, charSequence, w0Var.f157317a);
            return;
        }
        w wVar = (w) qVar;
        long j8 = w0Var.f157317a;
        Object obj = wVar.f201831h;
        z53.b bVar = wVar.f201828e;
        TextClassification textClassification = null;
        if (bVar.f()) {
            w1 w1Var = (w1) wVar.f201830g.getF182175a();
            TextClassification textClassification2 = (w1Var != null && s5.w0.d(j8, w1Var.f201837b) && p005kotlin.jvm.internal.s.g(charSequence, w1Var.f201836a)) ? w1Var.f201838c : null;
            bVar.e(null);
            textClassification = textClassification2;
        }
        if (textClassification == null) {
            lVar.invoke(aVar);
        } else {
            if (textClassification.getActions().isEmpty()) {
                x1.f201844a.getClass();
                if ((textClassification.getIcon() != null || !TextUtils.isEmpty(textClassification.getLabel())) && (textClassification.getIntent() != null || textClassification.getOnClickListener() != null)) {
                    aVar.f122353a.g(new o2.i(obj, textClassification, -1));
                }
            } else {
                aVar.f122353a.g(new o2.i(obj, textClassification, 0));
            }
            lVar.invoke(aVar);
            List<RemoteAction> actions = textClassification.getActions();
            int size = actions.size();
            for (int i14 = 0; i14 < size; i14++) {
                actions.get(i14);
                if (i14 > 0) {
                    aVar.f122353a.g(new o2.i(obj, textClassification, i14));
                }
            }
        }
        m2.c.a(aVar, context, z14, charSequence, w0Var.f157317a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0046  */
    public static final q b(a0 a0Var, z5.c cVar, p3.m mVar, int i14) {
        mVar.C(430530635);
        p3.x1 x1Var = p3.n.f135158a;
        Context context = (Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b);
        t13.g gVar = (t13.g) mVar.A(f201839a);
        boolean zB = ((((i14 & 112) ^ 48) > 32 && mVar.B(cVar)) || (i14 & 48) == 32) | mVar.B(gVar) | mVar.B(context);
        Object objQ = mVar.q();
        if (zB) {
            f201840b.getClass();
            objQ = new w(gVar, context, a0Var, cVar);
            mVar.K(objQ);
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                f201840b.getClass();
                objQ = new w(gVar, context, a0Var, cVar);
                mVar.K(objQ);
            }
        }
        q qVar = (q) objQ;
        mVar.f();
        return qVar;
    }
}
