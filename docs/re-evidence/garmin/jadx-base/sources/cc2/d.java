package cc2;

import e23.p;
import my2.s;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.k0;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
@v13.e(c = "com.garmin.android.lib.connectdevicesync.impl.retrofit.SyncingRetrofitServerDelegate$getFitDeviceMessage$1", f = "SyncingRetrofitServerDelegate.kt", l = {80}, m = "invokeSuspend")
public final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fc2.a f26730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fc2.a f26732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f26733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f26734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f26735f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(fc2.a aVar, g gVar, long j8, String str, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f26732c = aVar;
        this.f26733d = gVar;
        this.f26734e = j8;
        this.f26735f = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f26732c, this.f26733d, this.f26734e, this.f26735f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        fc2.a aVar;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f26731b;
        fc2.a aVar3 = this.f26732c;
        try {
            if (i14 == 0) {
                r.b(obj);
                my2.a aVar4 = this.f26733d.f26752a;
                long j8 = this.f26734e;
                String str = this.f26735f;
                k0 k0Var = k0.f134949a;
                k0Var.getClass();
                this.f26730a = aVar3;
                this.f26731b = 1;
                obj = aVar4.e(j8, str, null, k0Var, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                aVar = aVar3;
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar = this.f26730a;
                r.b(obj);
            }
            aVar.a((hy2.c) obj);
        } catch (Throwable th3) {
            aVar3.a(new s(th3));
        }
        return Unit.INSTANCE;
    }
}
