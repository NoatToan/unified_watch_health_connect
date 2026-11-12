package lg2;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import o53.b0;
import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.e2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.ui.buttons.ButtonsViewModel$onStopClick$1", f = "ButtonsViewModel.kt", l = {TsExtractor.TS_STREAM_TYPE_DTS, SyslogConstants.LOG_LOCAL2}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f112320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public lg2.a f112321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f112322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f112323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lg2.a f112324e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.livesessionview.ui.buttons.ButtonsViewModel$onStopClick$1$1", f = "ButtonsViewModel.kt", l = {133}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f112325a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ lg2.a f112326b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lg2.a aVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f112326b = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f112326b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f112325a;
            if (i14 == 0) {
                o13.r.b(obj);
                e53.c.a aVar2 = e53.c.f63094b;
                long jE = e53.e.e(2000, e53.f.MILLISECONDS);
                this.f112325a = 1;
                if (m0.c(jE, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            this.f112326b.f112269p = true;
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(lg2.a aVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f112324e = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        h hVar = new h(this.f112324e, dVar);
        hVar.f112323d = obj;
        return hVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        if (r0.emit(r2, r8) == r1) goto L23;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objM;
        b0 b0Var = (b0) this.f112323d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f112322c;
        lg2.a aVar2 = this.f112324e;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                objM = ((o13.q) obj).f128597a;
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar2 = this.f112321b;
                o13.r.b(obj);
            }
            lg2.a.A4(aVar2, false);
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        lg2.a.A4(aVar2, true);
        ge1.b.T(b0Var, null, null, new a(aVar2, null), 3);
        mf2.h hVarE = aVar2.B4().e();
        if (hVarE != null) {
            hVarE.d(mf2.h.f.STOP);
        }
        fg2.f fVarB4 = aVar2.B4();
        this.f112323d = null;
        this.f112322c = 1;
        objM = fVarB4.m(this);
        if (objM != aVar) {
        }
        return aVar;
        int i15 = o13.q.f128596b;
        if (!(objM instanceof o13.q.b)) {
            aVar2.B4().q(true);
            lg2.a.A4(aVar2, false);
        }
        if (o13.q.b(objM) != null) {
            e2 e2Var = aVar2.f112266m;
            Boolean bool = Boolean.TRUE;
            this.f112323d = null;
            this.f112320a = objM;
            this.f112321b = aVar2;
            this.f112322c = 2;
        }
        return Unit.INSTANCE;
    }
}
