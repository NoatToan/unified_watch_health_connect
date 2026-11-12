package rg1;

import c83.a0;
import e23.l;
import java.util.List;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lqg1/b;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.devices.backup.repo.DeviceBackupRepoImpl$getAllBackups$2", f = "DeviceBackupRepoImpl.kt", l = {13}, m = "invokeSuspend", v = 2)
public final class d extends i implements l<t13.d<? super a0<List<? extends qg1.b>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f152658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f152659b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, t13.d<? super d> dVar) {
        super(1, dVar);
        this.f152659b = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new d(this.f152659b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends qg1.b>>> dVar) {
        return ((d) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f152658a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        qg1.a aVar2 = this.f152659b.f152668a;
        this.f152658a = 1;
        Object objB = aVar2.b(this);
        return objB == aVar ? aVar : objB;
    }
}
