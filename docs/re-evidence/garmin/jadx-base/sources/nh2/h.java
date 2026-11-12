package nh2;

import e23.p;
import o13.r;
import o53.b0;
import org.json.JSONArray;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import q03.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "com.garmin.androiddynamicsettings.app.datalayer.SettingsDataModel$getSearchObject$1$1", f = "SettingsDataModel.kt", l = {}, m = "invokeSuspend")
public final class h extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f126187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s<Boolean> f126188b;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"nh2/h$a", "Lni2/a;", "Lorg/json/JSONArray;", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements ni2.a<JSONArray> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f126189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s<Boolean> f126190b;

        public a(d dVar, s<Boolean> sVar) {
            this.f126189a = dVar;
            this.f126190b = sVar;
        }

        @Override // ni2.a
        public final void a() {
            s<Boolean> sVar = this.f126190b;
            boolean zB = ((e13.a.C1312a) sVar).b();
            d dVar = this.f126189a;
            if (zB) {
                dVar.f126161a.getClass();
                return;
            }
            dVar.f126161a.getClass();
            ((e13.a.C1312a) sVar).a(new NullPointerException());
        }

        @Override // ni2.a
        public final void b(String str, Throwable th3) {
            th3.getClass();
            s<Boolean> sVar = this.f126190b;
            boolean zB = ((e13.a.C1312a) sVar).b();
            d dVar = this.f126189a;
            if (zB) {
                dVar.f126161a.getClass();
            } else {
                dVar.f126161a.getClass();
                ((e13.a.C1312a) sVar).a(th3);
            }
        }

        @Override // ni2.a
        public final void onSuccess(JSONArray jSONArray) {
            JSONArray jSONArray2 = jSONArray;
            jSONArray2.getClass();
            d dVar = this.f126189a;
            hi2.d dVar2 = dVar.f126161a;
            jSONArray2.toString();
            dVar2.getClass();
            com.garmin.androiddynamicsettings.app.util.a.f50704a.getClass();
            dVar.f126169i = h0.d1(com.garmin.androiddynamicsettings.app.util.a.C1021a.b(jSONArray2));
            ((e13.a.C1312a) this.f126190b).c(Boolean.TRUE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(d dVar, s<Boolean> sVar, t13.d<? super h> dVar2) {
        super(2, dVar2);
        this.f126187a = dVar;
        this.f126188b = sVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f126187a, this.f126188b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        ai2.b bVar = new ai2.b();
        a aVar2 = new a(this.f126187a, this.f126188b);
        bVar.f3313a.a("Trying for search index object");
        zh2.e.f204807a.getClass();
        zh2.e.b().a(new ai2.a(bVar, aVar2));
        return Unit.INSTANCE;
    }
}
