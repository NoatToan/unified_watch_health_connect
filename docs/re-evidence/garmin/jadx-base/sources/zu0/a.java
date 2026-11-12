package zu0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c.q;
import c.w;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import e23.l;
import e23.p;
import g.h;
import gl1.y;
import i3.e5;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.l0;
import p3.m;
import p3.n;
import p3.n1;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;
import s9.c;
import t13.d;
import v13.e;
import v13.i;
import z3.f;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: zu0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.managedsettings.ManagedAccountSharingSettingsScreenKt$ManagedAccountSharingSettingsScreen$1$1", f = "ManagedAccountSharingSettingsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class C3860a extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ gv0.d f207069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n1 f207070b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3860a(gv0.d dVar, n1 n1Var, d<? super C3860a> dVar2) {
            super(2, dVar2);
            this.f207069a = dVar;
            this.f207070b = n1Var;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new C3860a(this.f207069a, this.f207070b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((C3860a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.f207070b.t(this.f207069a.D4());
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f207071a;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fw.p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f207071a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(gv0.d dVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.a<Unit> aVar4, m mVar, int i14) {
        dVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        o0 o0VarE = mVar.E(-1821073717);
        int i15 = i14 | (o0VarE.r(dVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128) | (o0VarE.r(aVar3) ? 2048 : 1024) | (o0VarE.r(aVar4) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new yu0.d(context);
                o0VarE.K(objQ);
            }
            yu0.d dVar2 = (yu0.d) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = e5.o(0, o0VarE);
            }
            n1 n1Var = (n1) objQ2;
            h hVar = new h();
            boolean zR = o0VarE.r(dVar);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                objQ3 = new bv0.n(dVar, 21);
                o0VarE.K(objQ3);
            }
            q qVarC = w.c(hVar, (l) objQ3, o0VarE, 0);
            hl.a aVar5 = dVar.f79188f;
            aVar5.getClass();
            hl.a.b bVar = (hl.a.b) aVar5;
            p1 p1VarC = c.c(dVar.K0, o0VarE);
            g3 g3Var = (g3) p1VarC.getF182175a();
            boolean zR2 = o0VarE.r(dVar);
            Object objQ4 = o0VarE.q();
            if (zR2 || objQ4 == c2565a) {
                objQ4 = new C3860a(dVar, n1Var, null);
                o0VarE.K(objQ4);
            }
            g3.a aVar6 = g3.f35298f;
            l0.e((p) objQ4, g3Var, o0VarE);
            String strQ = y.Q(o0VarE, R.string.lbl_sharing_settings);
            boolean z14 = ((g3) p1VarC.getF182175a()).f35300a == fw.p.LOADING;
            i53.c cVarL = gl1.d.l(false, o0VarE, 1);
            boolean zR3 = o0VarE.r(qVarC) | o0VarE.r(context) | ((i15 & 112) == 32) | ((i15 & 896) == 256);
            Object objQ5 = o0VarE.q();
            if (zR3 || objQ5 == c2565a) {
                objQ5 = new wv0.h(aVar, aVar2, qVarC, context);
                o0VarE.K(objQ5);
            }
            gl1.d.b(strQ, aVar4, z14, cVarL, null, (l) objQ5, f.c(-959430183, new x91.n(p1VarC, bVar, dVar2, aVar3, n1Var, 8), o0VarE), o0VarE, ((i15 >> 9) & 112) | 1576960, 16);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new wv0.e(dVar, aVar, aVar2, aVar3, aVar4, i14);
        }
    }
}
