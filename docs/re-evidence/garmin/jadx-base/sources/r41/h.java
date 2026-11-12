package r41;

import c83.a0;
import e23.l;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/a;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.pacepro.data.repo.PaceProApiRepository$updatePaceband$2", f = "PaceProApiRepository.kt", l = {20}, m = "invokeSuspend", v = 2)
public final class h extends i implements l<t13.d<? super a0<com.garmin.android.apps.connectmobile.pacepro.data.dto.a>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f150310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f150311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f150312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.pacepro.data.dto.a f150313d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(a aVar, long j8, com.garmin.android.apps.connectmobile.pacepro.data.dto.a aVar2, t13.d<? super h> dVar) {
        super(1, dVar);
        this.f150311b = aVar;
        this.f150312c = j8;
        this.f150313d = aVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new h(this.f150311b, this.f150312c, this.f150313d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<com.garmin.android.apps.connectmobile.pacepro.data.dto.a>> dVar) {
        return ((h) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f150310a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        p41.a aVar2 = this.f150311b.f150290a;
        this.f150310a = 1;
        Object objB = aVar2.b(this.f150312c, this.f150313d, this);
        return objB == aVar ? aVar : objB;
    }
}
