package xa1;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.g3;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.powerguide.edit.EditPowerGuideStrategyViewModel$duplicateCourse$1", f = "EditPowerGuideStrategyViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y0<g3<com.garmin.android.apps.connectmobile.courses.model.e>> f189765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f189766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f189767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f189768d;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"xa1/m$a", "Lgd0/a$a;", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements gd0.a.InterfaceC1550a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ y0<g3<com.garmin.android.apps.connectmobile.courses.model.e>> f189769a;

        public a(y0<g3<com.garmin.android.apps.connectmobile.courses.model.e>> y0Var) {
            this.f189769a = y0Var;
        }

        @Override // gd0.a.InterfaceC1550a
        public final void a() {
            this.f189769a.j(g3.a.a(g3.f35298f, null, null, null, null, 15));
        }

        @Override // gd0.a.InterfaceC1550a
        public final void b(com.garmin.android.apps.connectmobile.courses.model.e eVar) {
            eVar.getClass();
            g3.f35298f.getClass();
            this.f189769a.j(g3.a.d(eVar));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(y0<g3<com.garmin.android.apps.connectmobile.courses.model.e>> y0Var, k kVar, String str, String str2, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f189765a = y0Var;
        this.f189766b = kVar;
        this.f189767c = str;
        this.f189768d = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m(this.f189765a, this.f189766b, this.f189767c, this.f189768d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        g3<com.garmin.android.apps.connectmobile.courses.model.e> g3VarC = g3.a.c(g3.f35298f);
        y0<g3<com.garmin.android.apps.connectmobile.courses.model.e>> y0Var = this.f189765a;
        y0Var.j(g3VarC);
        a aVar2 = new a(y0Var);
        String str = this.f189767c;
        if (str == null) {
            str = "";
        }
        new gd0.a(aVar2, str, new k30.p(this.f189768d)).b();
        this.f189766b.getClass();
        return Unit.INSTANCE;
    }
}
