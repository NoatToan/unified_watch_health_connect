package ec0;

import com.garmin.android.library.connectdatabase.ConnectDatabase;
import e23.p;
import java.util.Iterator;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)[B"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.bleupgrade.BLEUpgradeCoordinator$getDeviceCapabilities$2", f = "BLEUpgradeCoordinator.kt", l = {}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements p<b0, t13.d<? super byte[]>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f63777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f63778b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(long j8, a aVar, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f63777a = j8;
        this.f63778b = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f63777a, this.f63778b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super byte[]> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        Iterator it = ConnectDatabase.g().f().a(this.f63777a).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            a aVar2 = this.f63778b;
            if (!zHasNext) {
                return aVar2.f63767a;
            }
            Object next = it.next();
            next.getClass();
            byte[] bArr = aVar2.f63767a;
            byte[] bArr2 = ((sd2.e) next).f158648c;
            bArr2.getClass();
            aVar2.f63767a = s.q(bArr, bArr2);
        }
    }
}
