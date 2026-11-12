package in1;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.g1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.detail.components.SleepNotesKt$SleepNotes$scrollNotesIntoView$1", f = "SleepNotes.kt", l = {39, 40}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f94520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i2.a f94521b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i2.a aVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f94521b = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f94521b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (r4.f94521b.a(null, r4) == r0) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f94520a;
        if (i14 == 0) {
            o13.r.b(obj);
            ig2.d dVar = new ig2.d(24);
            this.f94520a = 1;
            if (g1.a(getF157466b()).v(dVar, this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        this.f94520a = 2;
    }
}
