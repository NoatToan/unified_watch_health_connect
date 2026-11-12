package cl2;

import e23.l;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.core.util.CoreTransferExtensionsKt$loadWithListener$2$1", f = "CoreTransferExtensions.kt", l = {509}, m = "invokeSuspend")
public final class f extends i implements l<t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wk2.e f27948b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(wk2.e eVar, t13.d<? super f> dVar) {
        super(1, dVar);
        this.f27948b = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new f(this.f27948b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super Unit> dVar) {
        return ((f) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f27947a;
        if (i14 == 0) {
            r.b(obj);
            this.f27947a = 1;
            if (this.f27948b.c(this) == aVar) {
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
