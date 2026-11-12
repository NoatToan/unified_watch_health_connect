package sf0;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.epoch.EpochViewModel$requestEpochData$1", f = "EpochViewModel.kt", l = {58}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f158865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f158866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f158867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f158868d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(j jVar, String str, String str2, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f158866b = jVar;
        this.f158867c = str;
        this.f158868d = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f158866b, this.f158867c, this.f158868d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f158865a;
        if (i14 == 0) {
            r.b(obj);
            this.f158865a = 1;
            if (j.x4(this.f158866b, this.f158867c, this.f158868d, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
