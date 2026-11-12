package w12;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.room.a0;
import c2.x2;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import e23.l;
import e23.p;
import i3.i7;
import li0.y;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import v13.i;
import v62.e1;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.profile.privacy.PrivacySelectionScreenKt$PrivacySelectionScreen$1$1", f = "PrivacySelectionScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w12.a f181256a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<PrivacyType> f181257b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(w12.a aVar, p1<PrivacyType> p1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f181256a = aVar;
            this.f181257b = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f181256a, this.f181257b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.f181257b.setValue(this.f181256a.f181252c);
            return Unit.INSTANCE;
        }
    }

    public static final void a(m mVar, int i14) {
        o0 o0VarE = mVar.E(316783459);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = n.f135158a;
            s62.a.f157643a.getClass();
            u4.d dVarA = e1.a(t62.b.f162798a);
            d92.b.f58623a.getClass();
            long jA = d92.b.a(o0VarE).f().a();
            h4.r.a aVar = h4.r.S;
            d92.b.f58625c.getClass();
            i7.b(dVarA, null, x2.q(aVar, j92.b.f97901d.f97904c), jA, o0VarE, 48, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vp1.a(i14, 15);
        }
    }

    public static final void b(boolean z14, w12.a aVar, e23.a<Unit> aVar2, l<? super com.garmin.android.apps.connectmobile.userprofile.presentation.f.b, Unit> lVar, m mVar, int i14) {
        aVar.getClass();
        PrivacyType privacyType = aVar.f181252c;
        o0 o0VarO = a0.o(aVar2, lVar, mVar, 2101969326);
        int i15 = i14 | (o0VarO.h(z14) ? 4 : 2) | (o0VarO.r(aVar) ? 32 : 16) | (o0VarO.r(aVar2) ? 256 : 128) | (o0VarO.r(lVar) ? 2048 : 1024);
        if (o0VarO.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarO.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(privacyType);
                o0VarO.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            boolean zR = o0VarO.r(aVar);
            Object objQ2 = o0VarO.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new a(aVar, p1Var, null);
                o0VarO.K(objQ2);
            }
            l0.e((p) objQ2, privacyType, o0VarO);
            z02.d.a(z14, z3.f.c(-929974007, new vx1.b(aVar, 8, (Context) o0VarO.A(AndroidCompositionLocals_androidKt.f6042b), aVar2), o0VarO), null, null, null, z3.f.c(1629138565, new y(z14, aVar, lVar, p1Var, 22), o0VarO), o0VarO, (i15 & 14) | 196656, 28);
        } else {
            o0VarO.e();
        }
        p2 p2VarI0 = o0VarO.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new y(z14, aVar, aVar2, lVar, i14, 23);
        }
    }
}
