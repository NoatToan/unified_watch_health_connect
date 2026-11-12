package rg1;

import c83.a0;
import e23.l;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.devices.backup.repo.DeviceBackupRepoImpl$deleteBackup$2", f = "DeviceBackupRepoImpl.kt", l = {19}, m = "invokeSuspend", v = 2)
public final class c extends i implements l<t13.d<? super a0<Object>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f152655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f152656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f152657c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h hVar, long j8, t13.d<? super c> dVar) {
        super(1, dVar);
        this.f152656b = hVar;
        this.f152657c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new c(this.f152656b, this.f152657c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<Object>> dVar) {
        return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f152655a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        qg1.a aVar2 = this.f152656b.f152668a;
        this.f152655a = 1;
        Object objE = aVar2.e(this.f152657c, this);
        return objE == aVar ? aVar : objE;
    }
}
