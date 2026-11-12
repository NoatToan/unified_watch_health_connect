package ev1;

import androidx.lifecycle.y0;
import e51.c;
import fg0.d;
import fg0.k;
import gg0.h;
import o13.m;
import o13.t;
import p005kotlin.Metadata;
import r53.b2;
import r53.p2;
import r53.q2;
import r53.s;
import vt1.o;
import zf0.j0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lev1/b;", "Lzf0/j0;", "<init>", "()V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends j0 {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final /* synthetic */ int f66163k0 = 0;
    public o I;
    public final p2 P;
    public final b2 T;
    public final t X;
    public final y0 Y;
    public gv1.a Z;

    public b() {
        p2 p2VarA = q2.a(null);
        this.P = p2VarA;
        this.T = s.d(p2VarA);
        t tVarB = m.b(new c(26));
        this.X = tVarB;
        this.Y = (y0) tVarB.getValue();
        ((y0) tVarB.getValue()).m("FBTEditGoalFragment");
    }

    public final jv1.m X4() {
        gv1.a aVar = (gv1.a) this.P.getValue();
        if (aVar != null) {
            return aVar.f79444c;
        }
        return null;
    }

    public final jv1.m Y4() {
        gv1.a aVar = (gv1.a) this.P.getValue();
        if (aVar != null) {
            return aVar.f79443b;
        }
        return null;
    }

    public final boolean Z4() {
        k kVar;
        d completionTarget;
        gv1.a aVar = (gv1.a) this.T.f150540a.getValue();
        return ((aVar == null || (kVar = aVar.f79445d) == null || (completionTarget = kVar.getCompletionTarget()) == null) ? null : completionTarget.getUnitType()) == h.TIME;
    }
}
