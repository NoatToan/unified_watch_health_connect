package jv0;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import e23.p;
import gl1.y;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.settings.setup.screens.GroupTrackSetupScreenKt$GroupTrackSetupScreen$1$1", f = "GroupTrackSetupScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f100989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<g3<List<pu0.a>>> f100990b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Context context, x3<? extends g3<? extends List<pu0.a>>> x3Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f100989a = context;
            this.f100990b = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f100989a, this.f100990b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            if (this.f100990b.getF182175a().f35300a == fw.p.ERROR) {
                Toast.makeText(this.f100989a, R.string.txt_error_occurred, 0).show();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ad  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(gv0.d dVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, m mVar, int i14) {
        ou0.b bVar;
        dVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        o0 o0VarE = mVar.E(210851622);
        int i15 = i14 | (o0VarE.r(dVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128) | (o0VarE.r(aVar3) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            p1 p1VarC = s9.c.c(dVar.f79204w, o0VarE);
            p1 p1VarC2 = s9.c.c(dVar.f79194k0, o0VarE);
            su0.h.f160962a.getClass();
            boolean z14 = false;
            int iD = su0.h.d();
            ou0.f fVar = (ou0.f) ((g3) p1VarC.getF182175a()).f35301b;
            if (fVar == null || (bVar = fVar.f133984b) == null) {
                bVar = ou0.b.c.f133963a;
            }
            fw.p pVar = ((g3) p1VarC2.getF182175a()).f35300a;
            boolean zB = o0VarE.B(p1VarC2) | o0VarE.r(context);
            Object objQ = o0VarE.q();
            if (zB) {
                objQ = new a(context, p1VarC2, null);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new a(context, p1VarC2, null);
                    o0VarE.K(objQ);
                }
            }
            l0.e((p) objQ, pVar, o0VarE);
            String strQ = y.Q(o0VarE, R.string.lbl_livetrack_setup);
            if (((g3) p1VarC2.getF182175a()).f35300a == fw.p.LOADING) {
                z14 = true;
            }
            gl1.d.b(strQ, aVar3, z14, null, null, null, z3.f.c(1983995352, new bv0.i(p1VarC2, aVar2, bVar, iD, dVar, aVar), o0VarE), o0VarE, ((i15 >> 6) & 112) | 1572864, 56);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new hv0.f(dVar, aVar, aVar2, aVar3, i14, 2);
        }
    }
}
