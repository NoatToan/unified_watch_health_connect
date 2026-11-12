package tw;

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
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import v13.i;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.blood_pressure.presentation.components.DeleteReadingBottomSheetKt$DeleteReadingBottomSheet$1$1$1", f = "DeleteReadingBottomSheet.kt", l = {41}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f166668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f166669b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mc mcVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f166669b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f166669b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f166668a;
            if (i14 == 0) {
                r.b(obj);
                this.f166668a = 1;
                if (this.f166669b.d(this) == aVar) {
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

    /* JADX WARN: Code duplicated, block: B:47:0x00ab  */
    public static final void a(mc mcVar, b0 b0Var, List<pw.a> list, l<? super pw.a, Unit> lVar, m mVar, int i14) {
        int i15;
        Object obj;
        Object obj2;
        b0Var.getClass();
        list.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-482243943);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(mcVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(b0Var) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            obj = list;
            i15 |= o0VarE.r(obj) ? 256 : 128;
        } else {
            obj = list;
        }
        if ((i14 & 3072) == 0) {
            obj2 = lVar;
            i15 |= o0VarE.r(obj2) ? 2048 : 1024;
        } else {
            obj2 = lVar;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            yw.b bVar = new yw.b(context);
            int i16 = i15;
            w wVar = w.f111301a;
            String strQ = y.Q(o0VarE, R.string.lbl_delete_reading);
            boolean zR = o0VarE.r(b0Var) | ((i16 & 14) == 4);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new nw0.n(b0Var, mcVar, 16);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new nw0.n(b0Var, mcVar, 16);
                    o0VarE.K(objQ);
                }
            }
            wVar.f(strQ, null, null, null, (e23.a) objQ, mcVar, false, null, z3.f.c(1457813488, new mw0.h(obj, bVar, context, obj2, 24), o0VarE), o0VarE, ((i16 << 15) & 458752) | C.ENCODING_PCM_32BIT, 462);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t42.d(mcVar, b0Var, list, lVar, i14, 1);
        }
    }
}
