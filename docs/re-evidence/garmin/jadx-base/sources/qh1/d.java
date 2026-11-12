package qh1;

import c83.a0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lrh1/b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.devices.indexscale2.bodycomposition.DefaultIndexScale2AdjustBodyCompositionRepository$saveBodyComposition$2", f = "IndexScale2AdjustBodyCompositionRepository.kt", l = {60}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements e23.p<b0, t13.d<? super v2<? extends rh1.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f144721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f144722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f144723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rh1.b f144724d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lrh1/b;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.devices.indexscale2.bodycomposition.DefaultIndexScale2AdjustBodyCompositionRepository$saveBodyComposition$2$1", f = "IndexScale2AdjustBodyCompositionRepository.kt", l = {60}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.l<t13.d<? super a0<rh1.b>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f144725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f144726b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f144727c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ rh1.b f144728d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, long j8, rh1.b bVar, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f144726b = eVar;
            this.f144727c = j8;
            this.f144728d = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f144726b, this.f144727c, this.f144728d, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super a0<rh1.b>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f144725a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            k kVar = this.f144726b.f144729a;
            this.f144725a = 1;
            Object objA = kVar.a(this.f144727c, this.f144728d, this);
            return objA == aVar ? aVar : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, long j8, rh1.b bVar, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f144722b = eVar;
        this.f144723c = j8;
        this.f144724d = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f144722b, this.f144723c, this.f144724d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super v2<? extends rh1.b>> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f144721a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        rh1.b bVar = this.f144724d;
        e eVar = this.f144722b;
        a aVar2 = new a(eVar, this.f144723c, bVar, null);
        this.f144721a = 1;
        eVar.getClass();
        Object objJ = f0.J(eVar, aVar2, this);
        return objJ == aVar ? aVar : objJ;
    }
}
