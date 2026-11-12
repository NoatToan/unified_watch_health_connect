package ml2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Ljava/lang/Void;", "<anonymous>", "(Lo53/b0;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "com.garmin.device.multilink.MultiLinkServiceAgentImpl$legacyWrite$1", f = "MultiLinkServiceAgentImpl.kt", l = {200}, m = "invokeSuspend")
public final class u extends v13.i implements e23.p<o53.b0, t13.d<? super Void>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f119463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f119464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dz2.b f119465c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(s sVar, dz2.b bVar, t13.d<? super u> dVar) {
        super(2, dVar);
        this.f119464b = sVar;
        this.f119465c = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new u(this.f119464b, this.f119465c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Void> dVar) {
        return ((u) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f119463a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f119463a = 1;
            Object objC = this.f119464b.c(this.f119465c, null, this);
            if (objC != aVar) {
                objC = Unit.INSTANCE;
            }
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return null;
    }
}
