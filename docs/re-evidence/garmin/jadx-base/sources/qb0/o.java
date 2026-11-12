package qb0;

import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import gl1.y;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.l0;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;

/* JADX INFO: loaded from: classes8.dex */
public final class o {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.sync.DeviceSyncTutorialScreenKt$DeviceSyncTutorialRoute$1$1", f = "DeviceSyncTutorialScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x3<sb0.a> f144015a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f144016b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f144017c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f144018d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x3<sb0.a> x3Var, b bVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f144015a = x3Var;
            this.f144016b = bVar;
            this.f144017c = aVar;
            this.f144018d = aVar2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f144015a, this.f144016b, this.f144017c, this.f144018d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Boolean bool;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            sb0.a f182175a = this.f144015a.getF182175a();
            if (f182175a != null && (bool = f182175a.f158389b) != null) {
                boolean zBooleanValue = bool.booleanValue();
                b bVar = this.f144016b;
                bVar.getClass();
                ge1.b.T(v1.a(bVar), null, null, new e(bVar, zBooleanValue, null), 3);
                if (zBooleanValue) {
                    this.f144017c.invoke();
                } else {
                    this.f144018d.invoke();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:73:0x0138  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(b bVar, d90.f fVar, String str, o90.a aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.l<? super Float, Unit> lVar, e23.a<Unit> aVar4, p3.m mVar, int i14) {
        Object aVar5;
        sb0.a aVar6;
        p1 p1Var;
        b bVar2 = bVar;
        bVar2.getClass();
        fVar.getClass();
        str.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        lVar.getClass();
        aVar4.getClass();
        o0 o0VarE = mVar.E(-1806992546);
        int i15 = i14 | (o0VarE.r(bVar2) ? 4 : 2) | (o0VarE.B(fVar) ? 32 : 16) | (o0VarE.B(str) ? 256 : 128) | (o0VarE.B(aVar) ? 2048 : 1024) | (o0VarE.r(aVar2) ? 16384 : 8192) | (o0VarE.r(aVar3) ? 131072 : 65536) | (o0VarE.r(lVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(aVar4) ? 8388608 : 4194304);
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (4793491 & i15) != 4793490)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(bVar2.f143969l, o0VarE);
            sb0.a aVar7 = (sb0.a) p1VarC.getF182175a();
            int i17 = 57344 & i15;
            boolean zB = o0VarE.B(p1VarC) | o0VarE.r(bVar2) | ((i15 & 458752) == 131072) | (i17 == 16384);
            Object objQ = o0VarE.q();
            p3.m.a aVar8 = p3.m.f135153a;
            if (zB) {
                aVar6 = aVar7;
                aVar5 = new a(p1VarC, bVar, aVar3, aVar2, null);
                p1Var = p1VarC;
                bVar2 = bVar;
                o0VarE.K(aVar5);
            } else {
                aVar8.getClass();
                if (objQ == p3.m.a.f135155b) {
                    aVar6 = aVar7;
                    aVar5 = new a(p1VarC, bVar, aVar3, aVar2, null);
                    p1Var = p1VarC;
                    bVar2 = bVar;
                    o0VarE.K(aVar5);
                } else {
                    p1Var = p1VarC;
                    aVar5 = objQ;
                    aVar6 = aVar7;
                }
            }
            l0.e((e23.p) aVar5, aVar6, o0VarE);
            sb0.a aVar9 = (sb0.a) p1Var.getF182175a();
            boolean z14 = aVar9 != null && aVar9.f158388a;
            boolean zR = ((i15 & 112) == 32) | o0VarE.r(bVar2) | (i17 == 16384);
            Object objQ2 = o0VarE.q();
            if (zR) {
                objQ2 = new q42.v(fVar, i16, bVar2, aVar2);
                o0VarE.K(objQ2);
            } else {
                aVar8.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new q42.v(fVar, i16, bVar2, aVar2);
                    o0VarE.K(objQ2);
                }
            }
            b(str, aVar, z14, (e23.a) objQ2, lVar, aVar4, o0VarE, (i15 >> 6) & 516222);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new dd1.d(bVar2, fVar, str, aVar, (e23.a) aVar2, (e23.a) aVar3, (e23.l) lVar, (e23.a) aVar4, i14);
        }
    }

    public static final void b(String str, o90.a aVar, boolean z14, e23.a<Unit> aVar2, e23.l<? super Float, Unit> lVar, e23.a<Unit> aVar3, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        o0 o0VarE = mVar.E(-1172626395);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(lVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(aVar3) ? 131072 : 65536;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            String strQ = y.Q(o0VarE, R.string.sync_reminder_title);
            String strQ2 = y.Q(o0VarE, R.string.sync_now_label);
            qb0.a.f143954a.getClass();
            int i16 = i15 << 3;
            int i17 = (i16 & 896) | (i16 & 112) | 6 | ((i15 << 18) & 1879048192);
            int i18 = i15 << 15;
            o0Var = o0VarE;
            da0.p.c("sync_tutorial_screen", str, aVar, strQ, false, null, null, null, strQ2, aVar2, false, null, null, false, null, null, false, z14, aVar3, lVar, null, null, qb0.a.f143955b, o0Var, i17, ((i15 << 9) & 234881024) | (29360128 & i18) | (i18 & 1879048192), 3072, 7470320);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a82.b(str, aVar, z14, aVar2, lVar, aVar3, i14);
        }
    }
}
