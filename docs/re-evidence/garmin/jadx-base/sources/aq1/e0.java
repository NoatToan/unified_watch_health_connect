package aq1;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.startup.StartupChecksViewModel$onConsentReviewReturned$1", f = "StartupChecksViewModel.kt", l = {288, 299, 303}, m = "invokeSuspend", v = 2)
public final class e0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.startup.e f12367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q92.x f12368c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lq92/v;", "<anonymous>", "(Lo53/b0;)Lq92/v;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.startup.StartupChecksViewModel$onConsentReviewReturned$1$consentStatus$1", f = "StartupChecksViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super q92.v>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q92.x f12369a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q92.x xVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f12369a = xVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f12369a, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super q92.v> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            p92.o.f136619a.getClass();
            return p92.o.n(this.f12369a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.garmin.android.apps.connectmobile.startup.e eVar, q92.x xVar, t13.d<? super e0> dVar) {
        super(2, dVar);
        this.f12367b = eVar;
        this.f12368c = xVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e0(this.f12367b, this.f12368c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x008c, code lost:
    
        if (r5.F4(r11) == r0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a8, code lost:
    
        if (r5.F4(r11) == r0) goto L44;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        e eVar;
        ArrayList arrayList;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f12366a;
        q92.x xVar = this.f12368c;
        com.garmin.android.apps.connectmobile.startup.e eVar2 = this.f12367b;
        if (i14 == 0) {
            o13.r.b(obj);
            o53.z zVar = eVar2.f44830c;
            a aVar2 = new a(xVar, null);
            this.f12366a = 1;
            obj = ge1.b.e0(zVar, aVar2, this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 != 1) {
            if (i14 == 2) {
                o13.r.b(obj);
                return Unit.INSTANCE;
            }
            if (i14 == 3) {
                o13.r.b(obj);
                return Unit.INSTANCE;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        q92.v vVar = (q92.v) obj;
        if ((vVar == null || !q92.c.a(vVar)) && (vVar == null || !vVar.b())) {
            p2 p2Var = eVar2.f44833f;
            do {
                value = p2Var.getValue();
                eVar = (e) value;
                List<q92.x> list = eVar.f12364a;
                arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((q92.x) obj2) != xVar) {
                        arrayList.add(obj2);
                    }
                }
            } while (!p2Var.b(value, e.a(eVar, arrayList, 2)));
            if (xVar == q92.x.DI_CONNECT_UPLOAD) {
                this.f12366a = 2;
            } else if (((e) eVar2.f44833f.getValue()).f12364a.isEmpty()) {
                this.f12366a = 3;
            }
            return aVar;
        }
        return Unit.INSTANCE;
    }
}
