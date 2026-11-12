package dx2;

import e23.l;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 2, 0})
@v13.e(c = "com.garmin.realtimesettings.app.viewmodel.SettingsViewModel$updateMenuItem$1", f = "SettingsViewModel.kt", l = {154}, m = "invokeSuspend", v = 1)
public final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f61497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f61498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f61499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f61500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l<jw2.c, Unit> f61501e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(int i14, int i15, c cVar, l<? super jw2.c, Unit> lVar, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f61498b = i14;
        this.f61499c = i15;
        this.f61500d = cVar;
        this.f61501e = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f61498b, this.f61499c, this.f61500d, this.f61501e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f61497a;
        if (i14 == 0) {
            r.b(obj);
            jw2.c.a aVar2 = jw2.c.f101370c;
            this.f61497a = 1;
            obj = aVar2.a(this.f61498b, this.f61499c, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        this.f61500d.f61485b.getClass();
        this.f61501e.invoke((jw2.c) obj);
        return Unit.INSTANCE;
    }
}
