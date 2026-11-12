package qh1;

import c83.a0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.devices.indexscale2.bodycomposition.DefaultIndexScale2AdjustBodyCompositionRepository$resetBodyComposition$2", f = "IndexScale2AdjustBodyCompositionRepository.kt", l = {65}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements e23.p<b0, t13.d<? super v2<? extends Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f144715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f144716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f144717c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.devices.indexscale2.bodycomposition.DefaultIndexScale2AdjustBodyCompositionRepository$resetBodyComposition$2$1", f = "IndexScale2AdjustBodyCompositionRepository.kt", l = {65}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.l<t13.d<? super a0<Unit>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f144718a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f144719b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f144720c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, long j8, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f144719b = eVar;
            this.f144720c = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f144719b, this.f144720c, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super a0<Unit>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f144718a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            k kVar = this.f144719b.f144729a;
            this.f144718a = 1;
            Object objC = kVar.c(this.f144720c, this);
            return objC == aVar ? aVar : objC;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, long j8, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f144716b = eVar;
        this.f144717c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f144716b, this.f144717c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super v2<? extends Unit>> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f144715a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        long j8 = this.f144717c;
        e eVar = this.f144716b;
        a aVar2 = new a(eVar, j8, null);
        this.f144715a = 1;
        eVar.getClass();
        Object objJ = f0.J(eVar, aVar2, this);
        return objJ == aVar ? aVar : objJ;
    }
}
