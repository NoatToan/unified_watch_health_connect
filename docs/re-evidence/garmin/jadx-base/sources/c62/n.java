package c62;

import com.garmin.android.apps.connectmobile.workouts.presentation.details.MultiSportsDetailsActivity;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.MultiSportsDetailsActivity$tryDownloadAudioNote$1", f = "MultiSportsDetailsActivity.kt", l = {1010}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MultiSportsDetailsActivity f24813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f24814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f24815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f24816e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(MultiSportsDetailsActivity multiSportsDetailsActivity, String str, String str2, e23.a<Unit> aVar, t13.d<? super n> dVar) {
        super(2, dVar);
        this.f24813b = multiSportsDetailsActivity;
        this.f24814c = str;
        this.f24815d = str2;
        this.f24816e = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n(this.f24813b, this.f24814c, this.f24815d, this.f24816e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f24812a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f24812a = 1;
            MultiSportsDetailsActivity.a aVar2 = MultiSportsDetailsActivity.f48440z;
            obj = this.f24813b.da(this.f24814c, this.f24815d, this);
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
            this.f24816e.invoke();
        }
        return Unit.INSTANCE;
    }
}
