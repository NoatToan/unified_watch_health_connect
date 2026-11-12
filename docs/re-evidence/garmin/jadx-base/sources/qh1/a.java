package qh1;

import c83.a0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lrh1/b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.devices.indexscale2.bodycomposition.DefaultIndexScale2AdjustBodyCompositionRepository$getLatestBodyComposition$2", f = "IndexScale2AdjustBodyCompositionRepository.kt", l = {45}, m = "invokeSuspend", v = 2)
public final class a extends v13.i implements e23.p<b0, t13.d<? super v2<? extends rh1.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f144695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f144696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f144697c;

    /* JADX INFO: renamed from: qh1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lrh1/b;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.devices.indexscale2.bodycomposition.DefaultIndexScale2AdjustBodyCompositionRepository$getLatestBodyComposition$2$result$1", f = "IndexScale2AdjustBodyCompositionRepository.kt", l = {45}, m = "invokeSuspend", v = 2)
    public static final class C2730a extends v13.i implements e23.l<t13.d<? super a0<rh1.b>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f144698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f144699b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f144700c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2730a(e eVar, long j8, t13.d<? super C2730a> dVar) {
            super(1, dVar);
            this.f144699b = eVar;
            this.f144700c = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new C2730a(this.f144699b, this.f144700c, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super a0<rh1.b>> dVar) {
            return ((C2730a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f144698a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            k kVar = this.f144699b.f144729a;
            this.f144698a = 1;
            Object objB = kVar.b(this.f144700c, this);
            return objB == aVar ? aVar : objB;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, long j8, t13.d<? super a> dVar) {
        super(2, dVar);
        this.f144696b = eVar;
        this.f144697c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a(this.f144696b, this.f144697c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super v2<? extends rh1.b>> dVar) {
        return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f144695a;
        if (i14 == 0) {
            o13.r.b(obj);
            long j8 = this.f144697c;
            e eVar = this.f144696b;
            C2730a c2730a = new C2730a(eVar, j8, null);
            this.f144695a = 1;
            eVar.getClass();
            obj = f0.J(eVar, c2730a, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        v2 v2Var = (v2) obj;
        boolean z14 = v2Var instanceof v2.b;
        if (z14) {
            v2.b bVar = (v2.b) v2Var;
            if (bVar.f47387b == 204) {
                return new v2.b(new rh1.b(null, null, null, null, 15, null), bVar.f47387b, null, null, 12, null);
            }
        }
        if (z14) {
            v2.b bVar2 = (v2.b) v2Var;
            if (!(bVar2.f47386a instanceof rh1.b)) {
                return new v2.a(new Exception("kotlin.Unit cannot be cast to BodyComposition"), new Integer(bVar2.f47387b), null, 4, null);
            }
        }
        return v2Var;
    }
}
