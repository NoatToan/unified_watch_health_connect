package nh2;

import e23.p;
import java.util.HashMap;
import java.util.Map;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import q03.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "com.garmin.androiddynamicsettings.app.datalayer.SettingsDataModel$getViewValue$1$1", f = "SettingsDataModel.kt", l = {}, m = "invokeSuspend")
public final class i extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f126191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f126192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s<Map<String, Object>> f126193c;

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\u00050\u0001¨\u0006\u0006"}, d2 = {"nh2/i$a", "Lni2/a;", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements ni2.a<HashMap<String, Object>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f126194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s<Map<String, Object>> f126195b;

        public a(d dVar, s<Map<String, Object>> sVar) {
            this.f126194a = dVar;
            this.f126195b = sVar;
        }

        @Override // ni2.a
        public final void a() {
            s<Map<String, Object>> sVar = this.f126195b;
            boolean zB = ((e13.a.C1312a) sVar).b();
            d dVar = this.f126194a;
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
            s<Map<String, Object>> sVar = this.f126195b;
            boolean zB = ((e13.a.C1312a) sVar).b();
            d dVar = this.f126194a;
            if (zB) {
                dVar.f126161a.getClass();
            } else {
                dVar.f126161a.getClass();
                ((e13.a.C1312a) sVar).a(th3);
            }
        }

        @Override // ni2.a
        public final void onSuccess(HashMap<String, Object> map) {
            HashMap<String, Object> map2 = map;
            map2.getClass();
            d dVar = this.f126194a;
            hi2.d dVar2 = dVar.f126161a;
            hi2.d dVar3 = dVar.f126161a;
            map2.toString();
            dVar2.getClass();
            dVar.f126168h = map2;
            e13.a.C1312a c1312a = (e13.a.C1312a) this.f126195b;
            if (c1312a.b() || map2.isEmpty()) {
                dVar3.b("Received success for data values, but no data.");
                c1312a.a(new NullPointerException());
            } else {
                dVar3.getClass();
                c1312a.c(map2);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, d dVar, s<Map<String, Object>> sVar, t13.d<? super i> dVar2) {
        super(2, dVar2);
        this.f126191a = str;
        this.f126192b = dVar;
        this.f126193c = sVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f126191a, this.f126192b, this.f126193c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        new ai2.e().a(new a(this.f126192b, this.f126193c), this.f126191a);
        return Unit.INSTANCE;
    }
}
