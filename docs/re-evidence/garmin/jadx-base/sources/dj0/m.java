package dj0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b.u;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.p;
import gl1.y;
import l72.i3;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class m {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a extends q implements e23.a<Unit> {
        public a(Object obj) {
            super(0, obj, u.class, "onBackPressed", "onBackPressed()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            ((u) this.receiver).d();
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.ftp.reports.presentation.composables.screen.FtpReportsScreenKt$FtpReportsScreen$2$1$2$1$1$1", f = "FtpReportsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ u82.f<gj0.a> f59947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<gj0.a> f59948b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(u82.f<gj0.a> fVar, p1<gj0.a> p1Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f59947a = fVar;
            this.f59948b = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f59947a, this.f59948b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.f59948b.setValue(this.f59947a.a());
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f59949a;

        static {
            int[] iArr = new int[o82.g.values().length];
            try {
                iArr[o82.g.f130849b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f59949a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(u82.d<o82.a, gj0.a> dVar, u82.d<o82.a, gj0.d> dVar2, yi0.c cVar, yi0.b bVar, e23.l<? super yi0.c, Unit> lVar, e23.l<? super yi0.b, Unit> lVar2, e23.a<Unit> aVar, e23.l<? super gj0.a, Unit> lVar3, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        dVar.getClass();
        dVar2.getClass();
        cVar.getClass();
        bVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        aVar.getClass();
        lVar3.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-1452849856);
        int i15 = i14 | (o0VarE.B(dVar) ? 4 : 2) | (o0VarE.B(dVar2) ? 32 : 16) | (o0VarE.k(cVar.ordinal()) ? 256 : 128) | (o0VarE.k(bVar.ordinal()) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192) | (o0VarE.r(lVar2) ? 131072 : 65536) | (o0VarE.r(aVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(lVar3) ? 8388608 : 4194304) | (o0VarE.r(aVar2) ? 67108864 : 33554432);
        if (o0VarE.n(i15 & 1, (38347923 & i15) != 38347922)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            u uVar = (u) o0VarE.A(g02.d.f74342a);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = i53.a.a(o82.g.f130849b, o82.g.f130853f, o82.g.f130854g, o82.g.f130856i);
                o0VarE.K(objQ);
            }
            i53.f fVar = (i53.f) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new n82.f.a((o82.g) fVar.get(0), null, null, 6, null);
                o0VarE.K(objQ2);
            }
            n82.f fVarA = n82.j.a((n82.f.a) objQ2, null, o0VarE, 2);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new yd1.a(context);
                o0VarE.K(objQ3);
            }
            yd1.a aVar3 = (yd1.a) objQ3;
            i3 i3Var = new i3("menu_item_add_weight", y.Q(o0VarE, R.string.lbl_add_weigh_in), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null);
            i3 i3Var2 = new i3("menu_item_help", y.Q(o0VarE, R.string.lbl_help), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null);
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = p0.n(null);
                o0VarE.K(objQ4);
            }
            p1 p1Var = (p1) objQ4;
            z02.d.a(false, z3.f.c(1119548507, new a42.c((Object) uVar, (Object) i3Var, (Object) i3Var2, (Object) aVar, (Object) lVar3, (Object) p1Var, 17), o0VarE), null, null, null, z3.f.c(-251986729, new j(fVar, fVarA, aVar3, dVar, dVar2, cVar, lVar, aVar2, aVar, p1Var, bVar, lVar2), o0VarE), o0VarE, 196656, 29);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c42.d(dVar, dVar2, cVar, bVar, lVar, lVar2, aVar, lVar3, aVar2, i14);
        }
    }
}
