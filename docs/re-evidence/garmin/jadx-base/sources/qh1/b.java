package qh1;

import c83.a0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import o53.b0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.devices.indexscale2.bodycomposition.DefaultIndexScale2AdjustBodyCompositionRepository$getWeightHistory$2", f = "IndexScale2AdjustBodyCompositionRepository.kt", l = {76}, m = "invokeSuspend", v = 2)
public final class b extends v13.i implements e23.p<b0, t13.d<? super v2<? extends Boolean>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f144701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f144702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Integer f144703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Integer f144704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ LocalDate f144705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ LocalDate f144706f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Boolean f144707g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.devices.indexscale2.bodycomposition.DefaultIndexScale2AdjustBodyCompositionRepository$getWeightHistory$2$1", f = "IndexScale2AdjustBodyCompositionRepository.kt", l = {76}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.l<t13.d<? super a0<Boolean>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f144708a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f144709b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Integer f144710c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Integer f144711d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ LocalDate f144712e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ LocalDate f144713f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Boolean f144714g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, Integer num, Integer num2, LocalDate localDate, LocalDate localDate2, Boolean bool, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f144709b = eVar;
            this.f144710c = num;
            this.f144711d = num2;
            this.f144712e = localDate;
            this.f144713f = localDate2;
            this.f144714g = bool;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f144709b, this.f144710c, this.f144711d, this.f144712e, this.f144713f, this.f144714g, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super a0<Boolean>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f144708a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            m42.a aVar2 = this.f144709b.f144730b;
            LocalDate localDate = this.f144712e;
            String string = localDate != null ? localDate.toString() : null;
            LocalDate localDate2 = this.f144713f;
            String string2 = localDate2 != null ? localDate2.toString() : null;
            this.f144708a = 1;
            Object objI = aVar2.i(this.f144710c, this.f144711d, string, string2, this.f144714g, this);
            return objI == aVar ? aVar : objI;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, Integer num, Integer num2, LocalDate localDate, LocalDate localDate2, Boolean bool, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f144702b = eVar;
        this.f144703c = num;
        this.f144704d = num2;
        this.f144705e = localDate;
        this.f144706f = localDate2;
        this.f144707g = bool;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f144702b, this.f144703c, this.f144704d, this.f144705e, this.f144706f, this.f144707g, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super v2<? extends Boolean>> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f144701a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        Boolean bool = this.f144707g;
        e eVar = this.f144702b;
        a aVar2 = new a(eVar, this.f144703c, this.f144704d, this.f144705e, this.f144706f, bool, null);
        this.f144701a = 1;
        eVar.getClass();
        Object objJ = f0.J(eVar, aVar2, this);
        return objJ == aVar ? aVar : objJ;
    }
}
