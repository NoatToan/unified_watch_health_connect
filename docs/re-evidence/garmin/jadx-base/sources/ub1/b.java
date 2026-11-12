package ub1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c80.b0;
import e23.p;
import l72.c1;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.l0;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f²\u0006\u000e\u0010\u000e\u001a\u00020\r8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lub1/b;", "Lub1/k;", "Lc80/b0;", "alertData", "Lkotlin/Function0;", "", "onFirstComposition", "onDismiss", "Lkotlin/Function1;", "Landroid/content/Context;", "onConfirm", "<init>", "(Lc80/b0;Le23/a;Le23/a;Le23/l;)V", "", "displayAlert", "gcm-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f169785e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f169786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.a<Unit> f169787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.a<Unit> f169788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.l<Context, Unit> f169789d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.presentation.DefaultPromoAlertComposable$PromoAlert$1$1", f = "DefaultPromoAlertComposable.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<o53.b0, t13.d<? super Unit>, Object> {
        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return b.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            b.this.f169787b.invoke();
            return Unit.INSTANCE;
        }
    }

    static {
        b0.a aVar = b0.f25300a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(b0 b0Var, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.l<? super Context, Unit> lVar) {
        b0Var.getClass();
        aVar.getClass();
        aVar2.getClass();
        lVar.getClass();
        this.f169786a = b0Var;
        this.f169787b = aVar;
        this.f169788c = aVar2;
        this.f169789d = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0063  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ub1.k
    public final void a(int i14, e23.a aVar, h4.r rVar, p3.m mVar) {
        o0 o0Var;
        rVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-708620820);
        int i15 = (o0VarE.r(aVar) ? 32 : 16) | i14 | (o0VarE.B(this) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 145) != 144)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Unit unit = Unit.INSTANCE;
            int i16 = i15 & 896;
            boolean z14 = i16 == 256;
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (z14) {
                objQ = new a(null);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a(null);
                    o0VarE.K(objQ);
                }
            }
            l0.e((p) objQ, unit, o0VarE);
            Object objQ2 = o0VarE.q();
            aVar2.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = p0.n(Boolean.TRUE);
                o0VarE.K(objQ2);
            }
            p1 p1Var = (p1) objQ2;
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(-758278158);
                b0 b0Var = this.f169786a;
                if (!(b0Var instanceof b0.b)) {
                    throw kg.f.h(o0VarE, 1915202064, false);
                }
                o0VarE.C(-758177284);
                c1 c1Var = c1.f110940a;
                b0.b bVar = (b0.b) b0Var;
                String str = bVar.f25302b;
                String str2 = bVar.f25303c;
                boolean z15 = true;
                String str3 = bVar.f25304d;
                String str4 = bVar.f25305e;
                int i17 = i15 & 112;
                boolean zR = (i16 == 256) | o0VarE.r(context) | (i17 == 32);
                Object objQ3 = o0VarE.q();
                if (zR || objQ3 == c2565a) {
                    objQ3 = new ok0.d(this, context, aVar, p1Var);
                    o0VarE.K(objQ3);
                }
                e23.a<Unit> aVar3 = (e23.a) objQ3;
                boolean z16 = i16 == 256;
                if (i17 != 32) {
                    z15 = false;
                }
                boolean z17 = z16 | z15;
                Object objQ4 = o0VarE.q();
                if (z17 || objQ4 == c2565a) {
                    objQ4 = new sg0.j(this, 29, aVar, p1Var);
                    o0VarE.K(objQ4);
                }
                c1Var.a(false, str, str2, null, null, str3, false, false, aVar3, str4, (e23.a) objQ4, o0VarE, 6, 0, 216);
                o0Var = o0VarE;
                o0Var.g0(false);
                o0Var.g0(false);
            } else {
                o0Var = o0VarE;
                o0Var.C(-757403338);
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new tb0.h(this, rVar, aVar, i14);
        }
    }
}
