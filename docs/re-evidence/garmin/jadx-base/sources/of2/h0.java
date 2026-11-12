package of2;

import com.google.mlkit.common.MlKitException;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.d2;
import r53.l1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lsf2/d;", "<anonymous>", "(Lo53/b0;)Lsf2/d;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.communication.LSVSessionManager$awaitSessionEvent$2", f = "LSVSessionManager.kt", l = {MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR}, m = "invokeSuspend", v = 2)
public final class h0 extends v13.i implements e23.p<o53.b0, t13.d<? super sf2.d>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f131824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d2<sf2.d> f131825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l<sf2.d, Boolean> f131826c;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsf2/d;", "it", "", "<anonymous>", "(Lsf2/d;)Z"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.livesessionview.communication.LSVSessionManager$awaitSessionEvent$2$1", f = "LSVSessionManager.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<sf2.d, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f131827a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.l<sf2.d, Boolean> f131828b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.l<? super sf2.d, Boolean> lVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f131828b = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f131828b, dVar);
            aVar.f131827a = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(sf2.d dVar, t13.d<? super Boolean> dVar2) {
            return ((a) create(dVar, dVar2)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            sf2.d dVar = (sf2.d) this.f131827a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            return this.f131828b.invoke(dVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h0(d2<? extends sf2.d> d2Var, e23.l<? super sf2.d, Boolean> lVar, t13.d<? super h0> dVar) {
        super(2, dVar);
        this.f131825b = d2Var;
        this.f131826c = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h0(this.f131825b, this.f131826c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super sf2.d> dVar) {
        return ((h0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f131824a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        l1 l1Var = new l1(this.f131825b);
        a aVar2 = new a(this.f131826c, null);
        this.f131824a = 1;
        Object objW = r53.s.w(l1Var, aVar2, this);
        return objW == aVar ? aVar : objW;
    }
}
