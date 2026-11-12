package vd0;

import i3.fe;
import l72.d3;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dogs.presentation.EditDogPageKt$EditDogPageContent$12$2$1$1", f = "EditDogPage.kt", l = {289}, m = "invokeSuspend", v = 2)
public final class i1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f177292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fe f177293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f177294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f177295d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(fe feVar, String str, String str2, t13.d<? super i1> dVar) {
        super(2, dVar);
        this.f177293b = feVar;
        this.f177294c = str;
        this.f177295d = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i1(this.f177293b, this.f177294c, this.f177295d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f177292a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f177292a = 1;
            if (d3.c(this.f177293b, this.f177294c, this.f177295d, this) == aVar) {
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
