package pc0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.repo.DevicesRepo$updateBluetoothConnectionInfo$2", f = "DevicesRepo.kt", l = {356, 356}, m = "invokeSuspend", v = 2)
public final class k0 extends v13.i implements e23.l<t13.d<? super c83.a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f137239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f137240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f137241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f137242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f137243e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(j jVar, String str, String str2, String str3, t13.d<? super k0> dVar) {
        super(1, dVar);
        this.f137240b = jVar;
        this.f137241c = str;
        this.f137242d = str2;
        this.f137243e = str3;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new k0(this.f137240b, this.f137241c, this.f137242d, this.f137243e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<Unit>> dVar) {
        return ((k0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f137239a;
        if (i14 == 0) {
            o13.r.b(obj);
            ac0.c cVar = this.f137240b.f137224a;
            this.f137239a = 1;
            obj = cVar.g(this.f137241c, this.f137242d, this.f137243e, this);
            if (obj != aVar) {
            }
        }
        if (i14 != 1) {
            if (i14 == 2) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        this.f137239a = 2;
        Object objAwait = ((o53.i0) obj).await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
