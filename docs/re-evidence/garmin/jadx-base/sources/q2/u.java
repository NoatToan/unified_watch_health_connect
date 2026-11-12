package q2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.q1;
import p3.x1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq2/u;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f142195a = new u();

    private u() {
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    public final void a(Drawable drawable, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(257732500);
        int i15 = (o0VarE.r(drawable) ? 4 : 2) | i14;
        int i16 = 25;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            x1.j.f188348a.getClass();
            h4.r rVarQ = x2.q(aVar, x1.j.f188358k);
            boolean zR = o0VarE.r(drawable);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new q1(drawable, i16);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new q1(drawable, i16);
                    o0VarE.K(objQ);
                }
            }
            c2.q.a(l4.k.d(rVarQ, (e23.l) objQ), o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new oo0.f(this, drawable, i14, i16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    public final void b(final Icon icon, p3.m mVar, final int i14) {
        p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar;
        o0 o0VarE = mVar.E(2116504409);
        int i15 = (o0VarE.r(icon) ? 4 : 2) | i14;
        final int i16 = 0;
        final int i17 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            boolean zB = o0VarE.B(icon) | o0VarE.B(context);
            Object objQ = o0VarE.q();
            if (zB) {
                objQ = icon.loadDrawable(context);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = icon.loadDrawable(context);
                    o0VarE.K(objQ);
                }
            }
            Drawable drawable = (Drawable) objQ;
            if (drawable == null) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                } else {
                    pVar = new e23.p(this, icon, i14, i16) { // from class: q2.r

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ int f142190a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ u f142191b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ Icon f142192c;

                        {
                            this.f142190a = i16;
                            this.f142191b = this;
                        }

                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int i18 = this.f142190a;
                            Icon icon2 = this.f142192c;
                            u uVar = this.f142191b;
                            p3.m mVar2 = (p3.m) obj;
                            ((Integer) obj2).getClass();
                            u uVar2 = u.f142195a;
                            switch (i18) {
                                case 0:
                                    uVar.b(icon2, mVar2, p0.t(49));
                                    break;
                                default:
                                    uVar.b(icon2, mVar2, p0.t(49));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                }
            } else {
                a(drawable, o0VarE, 48);
            }
            p2VarI0.f135219d = pVar;
        }
        o0VarE.e();
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            pVar = new e23.p(this, icon, i14, i17) { // from class: q2.r

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f142190a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ u f142191b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Icon f142192c;

                {
                    this.f142190a = i17;
                    this.f142191b = this;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i18 = this.f142190a;
                    Icon icon2 = this.f142192c;
                    u uVar = this.f142191b;
                    p3.m mVar2 = (p3.m) obj;
                    ((Integer) obj2).getClass();
                    u uVar2 = u.f142195a;
                    switch (i18) {
                        case 0:
                            uVar.b(icon2, mVar2, p0.t(49));
                            break;
                        default:
                            uVar.b(icon2, mVar2, p0.t(49));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }
}
