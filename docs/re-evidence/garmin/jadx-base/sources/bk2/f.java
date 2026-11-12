package bk2;

import e23.p;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "com.garmin.device.devicemessages.CIQMessageManager$postMessage$1", f = "CIQMessageManager.kt", l = {91, 92}, m = "invokeSuspend")
public final class f extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f18532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f18533c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b bVar, a aVar, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f18532b = bVar;
        this.f18533c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f18532b, this.f18533c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        if (r6.p(r1, r7) == r0) goto L23;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f18531a;
        a aVar = this.f18533c;
        b bVar = this.f18532b;
        try {
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
            r.b(obj);
            this.f18531a = 1;
            b.c cVar = b.f18501j;
            bVar.getClass();
            x53.c cVar2 = s0.f129406a;
            Object objE0 = ge1.b.e0(x53.b.f189152a, new e(bVar, aVar, null), this);
            if (objE0 != obj2) {
                objE0 = Unit.INSTANCE;
            }
            if (objE0 == obj2) {
            }
            return obj2;
            long j8 = aVar.f18497a;
            this.f18531a = 2;
            b.c cVar3 = b.f18501j;
        } catch (Throwable th3) {
            bVar.f18504c.error("onError in postNotification", th3);
        }
    }
}
