package rg1;

import c83.a0;
import e23.l;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.devices.backup.repo.DeviceBackupRepoImpl$applyBackup$2", f = "DeviceBackupRepoImpl.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class b extends i implements l<t13.d<? super a0<Object>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f152651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f152652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f152653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f152654d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h hVar, long j8, long j14, t13.d<? super b> dVar) {
        super(1, dVar);
        this.f152652b = hVar;
        this.f152653c = j8;
        this.f152654d = j14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new b(this.f152652b, this.f152653c, this.f152654d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<Object>> dVar) {
        return ((b) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f152651a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        qg1.a aVar2 = this.f152652b.f152668a;
        this.f152651a = 1;
        Object objD = aVar2.d(this.f152653c, this.f152654d, this);
        return objD == aVar ? aVar : objD;
    }
}
