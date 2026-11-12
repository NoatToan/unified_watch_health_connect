package n70;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "bluetoothOn", "hasBluetoothPermission", "Lo70/d;", "<anonymous>", "(ZZ)Lo70/d;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetBluetoothCardStateUseCase$invoke$1", f = "GetBluetoothCardStateUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.q<Boolean, Boolean, t13.d<? super o70.d>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f124539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ boolean f124540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f124541c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, t13.d<? super s> dVar) {
        super(3, dVar);
        this.f124541c = tVar;
    }

    @Override // e23.q
    public final Object invoke(Boolean bool, Boolean bool2, t13.d<? super o70.d> dVar) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        s sVar = new s(this.f124541c, dVar);
        sVar.f124539a = zBooleanValue;
        sVar.f124540b = zBooleanValue2;
        return sVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        boolean z14 = this.f124539a;
        boolean z15 = this.f124540b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        t tVar = this.f124541c;
        if (!z15 && t.a(tVar)) {
            return o70.d.BLUETOOTH_PERMISSION_OFF;
        }
        if (z14 || !t.a(tVar)) {
            return null;
        }
        return o70.d.BLUETOOTH_OFF;
    }
}
