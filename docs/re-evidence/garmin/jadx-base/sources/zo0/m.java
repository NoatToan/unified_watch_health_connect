package zo0;

import com.garmin.android.framework.datamanagement.datasource.CacheDatabase;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.home.dialogs.DeviceReconnectDialogHandler$reconnectDevice$1", f = "DeviceReconnectDialogHandler.kt", l = {69}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f206167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f206168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bb2.i f206169c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.home.dialogs.DeviceReconnectDialogHandler$reconnectDevice$1$1", f = "DeviceReconnectDialogHandler.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ bb2.i f206170a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(bb2.i iVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f206170a = iVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f206170a, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            CacheDatabase.i().g().b(this.f206170a.f17361a);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(k kVar, bb2.i iVar, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f206168b = kVar;
        this.f206169c = iVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m(this.f206168b, this.f206169c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f206167a;
        bb2.i iVar = this.f206169c;
        k kVar = this.f206168b;
        if (i14 == 0) {
            o13.r.b(obj);
            kVar.f206162a.showProgressOverlay();
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(iVar, null);
            this.f206167a = 1;
            if (ge1.b.e0(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        q qVar = kVar.f206162a;
        q qVar2 = kVar.f206162a;
        if (o53.c0.g(qVar.Q7())) {
            qVar2.hideProgressOverlay();
            qVar2.V1(iVar.f17361a, iVar.f17362b, iVar.f17363c, iVar.f17364d, iVar.f17365e);
        }
        return Unit.INSTANCE;
    }
}
