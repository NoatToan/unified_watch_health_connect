package lk2;

import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.filetransfer.TransferTaskImpl$startTransfer$1", f = "TransferTask.kt", l = {248}, m = "invokeSuspend")
public final class f0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f113207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f113208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l<t13.d<? super a0>, Object> f113209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.q<a0, e23.p<? super Long, ? super Long, Unit>, t13.d<? super Unit>, Object> f113210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f113211e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f0(c0 c0Var, e23.l<? super t13.d<? super a0>, ? extends Object> lVar, e23.q<? super a0, ? super e23.p<? super Long, ? super Long, Unit>, ? super t13.d<? super Unit>, ? extends Object> qVar, e23.a<Unit> aVar, t13.d<? super f0> dVar) {
        super(2, dVar);
        this.f113208b = c0Var;
        this.f113209c = lVar;
        this.f113210d = qVar;
        this.f113211e = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f0(this.f113208b, this.f113209c, this.f113210d, this.f113211e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f113207a;
        e23.a<Unit> aVar2 = this.f113211e;
        c0 c0Var = this.f113208b;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                e23.l<t13.d<? super a0>, Object> lVar = this.f113209c;
                e23.q<a0, e23.p<? super Long, ? super Long, Unit>, t13.d<? super Unit>, Object> qVar = this.f113210d;
                this.f113207a = 1;
                if (c0.d(c0Var, lVar, qVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            o53.c0.c(c0Var.f113169g, null);
            if (aVar2 != null) {
            }
        } catch (Exception e4) {
            int i15 = c0.f113162p;
            c0Var.getClass();
            if (c0.h(e4)) {
                String message = e4.getMessage();
                if (message == null || !d53.u.y(message, c0Var.f113163a, false)) {
                    message = c0Var.f113163a + StringUtils.SPACE + message;
                }
                c0Var.f113167e.warn(message);
            } else {
                c0Var.f113167e.error(c0Var.f113163a + " failed", (Throwable) e4);
            }
            c0Var.g(c0.i(e4, c0Var.f113163a + " failed"));
        } finally {
            o53.c0.c(c0Var.f113169g, null);
            if (aVar2 != null) {
                aVar2.invoke();
            }
        }
        return Unit.INSTANCE;
    }
}
