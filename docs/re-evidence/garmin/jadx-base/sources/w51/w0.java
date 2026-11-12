package w51;

import android.content.Context;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.pending.activities.presentation.PendingActivityDetailsViewModel$onAcceptClicked$1", f = "PendingActivityDetailsViewModel.kt", l = {389}, m = "invokeSuspend", v = 2)
public final class w0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f182451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f182452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f182453c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(q0 q0Var, Context context, t13.d<? super w0> dVar) {
        super(2, dVar);
        this.f182452b = q0Var;
        this.f182453c = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new w0(this.f182452b, this.f182453c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((w0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objC;
        Integer numR;
        Object value2;
        Object value3;
        w0 w0Var = this;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = w0Var.f182451a;
        q0 q0Var = w0Var.f182452b;
        if (i14 == 0) {
            o13.r.b(obj);
            p2 p2Var = q0Var.f182375f;
            b2 b2Var = q0Var.f182376g;
            while (true) {
                Object value4 = p2Var.getValue();
                if (p2Var.b(value4, p0.a((p0) value4, null, null, null, null, null, null, null, null, 0.0d, false, false, false, true, false, true, false, null, false, null, false, false, false, false, 16756735))) {
                    break;
                }
                w0Var = this;
            }
            z51.h hVar = ((p0) b2Var.f150540a.getValue()).f182344a;
            String string = null;
            String str = hVar != null ? hVar.f202505a : null;
            sz0.f.a aVar2 = sz0.f.f161394a;
            int iHashCode = (str == null ? "" : str).hashCode();
            aVar2.getClass();
            Context context = w0Var.f182453c;
            boolean zE = sz0.f.a.e(iHashCode, context);
            z51.h hVar2 = ((p0) b2Var.f150540a.getValue()).f182344a;
            b63.o oVar = hVar2 != null ? hVar2.f202506b : null;
            String str2 = ((p0) b2Var.f150540a.getValue()).f182345b;
            if (str2 == null) {
                am.x0 x0Var = (am.x0) p13.h0.d0(((p0) b2Var.f150540a.getValue()).f182346c);
                str2 = x0Var != null ? x0Var.f4358a : null;
                if (str2 == null) {
                    str2 = am.x0.f4336u2.f4358a;
                }
            }
            z51.h hVar3 = ((p0) b2Var.f150540a.getValue()).f182344a;
            if (hVar3 != null && (numR = w2.a0.r(hVar3)) != null) {
                string = context.getString(numR.intValue());
            }
            if (zE) {
                sz0.f.a.a((str != null ? str : "").hashCode(), context);
            }
            if (str == null || oVar == null) {
                p2 p2Var2 = q0Var.f182375f;
                do {
                    value = p2Var2.getValue();
                } while (!p2Var2.b(value, p0.a((p0) value, null, null, null, null, null, null, null, null, 0.0d, false, false, false, false, true, false, false, null, false, null, false, false, false, false, 16764927)));
            } else {
                String str3 = str;
                y51.a aVar3 = q0Var.f182370a;
                b63.u uVarG = g22.l.g(((p0) b2Var.f150540a.getValue()).f182350g);
                b63.u uVarG2 = g22.l.g(((p0) b2Var.f150540a.getValue()).f182351h);
                w0Var.f182451a = 1;
                objC = aVar3.c(oVar, str3, uVarG, uVarG2, str2, string, w0Var);
                if (objC == aVar) {
                    return aVar;
                }
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        objC = obj;
        if (((v2) objC) instanceof v2.a) {
            p2 p2Var3 = q0Var.f182375f;
            do {
                value3 = p2Var3.getValue();
            } while (!p2Var3.b(value3, p0.a((p0) value3, null, null, null, null, null, null, null, null, 0.0d, false, false, false, false, true, false, false, null, false, null, false, false, false, false, 16748543)));
        } else {
            p2 p2Var4 = q0Var.f182375f;
            do {
                value2 = p2Var4.getValue();
            } while (!p2Var4.b(value2, p0.a((p0) value2, null, null, null, null, null, null, null, null, 0.0d, false, false, false, false, false, false, false, null, false, null, false, false, false, false, 16760831)));
        }
        return Unit.INSTANCE;
    }
}
