package si1;

import i3.fe;
import l72.d3;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.lte.cwsactivation.composables.InReachSubscriptionScreenKt$InReachSubscriptionScreen$1$1", f = "InReachSubscriptionScreen.kt", l = {89}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f159422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r53.i<String> f159423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fe f159424c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ fe f159425a;

        public a(fe feVar) {
            this.f159425a = feVar;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            Object objC = d3.c(this.f159425a, (String) obj, null, dVar);
            return objC == u13.a.COROUTINE_SUSPENDED ? objC : Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(r53.i<String> iVar, fe feVar, t13.d<? super n> dVar) {
        super(2, dVar);
        this.f159423b = iVar;
        this.f159424c = feVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n(this.f159423b, this.f159424c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f159422a;
        if (i14 == 0) {
            o13.r.b(obj);
            a aVar2 = new a(this.f159424c);
            this.f159422a = 1;
            if (this.f159423b.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
