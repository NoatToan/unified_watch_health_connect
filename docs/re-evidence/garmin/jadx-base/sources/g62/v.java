package g62;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.MultiSportOverviewFragment$tryDownloadAudioNote$1", f = "MultiSportOverviewFragment.kt", l = {325}, m = "invokeSuspend", v = 2)
public final class v extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f76108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b f76109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f76110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f76111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f76112e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b bVar, String str, String str2, e23.a<Unit> aVar, t13.d<? super v> dVar) {
        super(2, dVar);
        this.f76109b = bVar;
        this.f76110c = str;
        this.f76111d = str2;
        this.f76112e = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new v(this.f76109b, this.f76110c, this.f76111d, this.f76112e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((v) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f76108a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f76108a = 1;
            com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b.a aVar2 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b.f49107t;
            obj = this.f76109b.v6(this.f76110c, this.f76111d, this);
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
        if (((Boolean) obj).booleanValue()) {
            this.f76112e.invoke();
        }
        return Unit.INSTANCE;
    }
}
