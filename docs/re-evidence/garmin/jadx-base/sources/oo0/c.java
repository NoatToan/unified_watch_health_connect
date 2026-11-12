package oo0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import e23.l;
import e23.p;
import gl1.y;
import i3.mc;
import java.util.List;
import l72.w;
import o13.r;
import o53.b0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.heartrate.presentation.view.details.DeleteAbnormalHeartRateBottomSheetKt$DeleteAbnormalHeartRateBottomSheet$1$1$1", f = "DeleteAbnormalHeartRateBottomSheet.kt", l = {42}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f133118a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f133119b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mc mcVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f133119b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f133119b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f133118a;
            if (i14 == 0) {
                r.b(obj);
                this.f133118a = 1;
                if (this.f133119b.d(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x009c  */
    public static final void a(mc mcVar, b0 b0Var, List<gs1.d.b> list, DateTime dateTime, l<? super gs1.d.b, Unit> lVar, m mVar, int i14) {
        mcVar.getClass();
        b0Var.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-1045150575);
        int i15 = i14 | (o0VarE.B(mcVar) ? 4 : 2) | (o0VarE.r(b0Var) ? 32 : 16) | (o0VarE.r(list) ? 256 : 128) | (o0VarE.r(dateTime) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            mo0.a aVar = new mo0.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            w wVar = w.f111301a;
            String strQ = y.Q(o0VarE, R.string.lbl_delete_abnormal_hr);
            boolean zR = o0VarE.r(b0Var) | ((i15 & 14) == 4);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new nw0.n(b0Var, mcVar, 3);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new nw0.n(b0Var, mcVar, 3);
                    o0VarE.K(objQ);
                }
            }
            wVar.f(strQ, null, null, null, (e23.a) objQ, mcVar, false, null, z3.f.c(-1780112600, new mw0.h(list, dateTime, aVar, lVar, 5), o0VarE), o0VarE, ((i15 << 15) & 458752) | C.ENCODING_PCM_32BIT, 462);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ob0.e((Object) mcVar, (Object) b0Var, (Object) list, (Object) dateTime, (l) lVar, i14, 3);
        }
    }
}
