package lc0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import c22.e1;
import e23.p;
import l30.i0;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import q53.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.domain.GetBluetoothStateUseCase$invoke$1", f = "GetBluetoothStateUseCase.kt", l = {30}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements p<t<? super Boolean>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f111932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f111933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f111934c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"lc0/e$a", "Landroid/content/BroadcastReceiver;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t<Boolean> f111935a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(t<? super Boolean> tVar) {
            this.f111935a = tVar;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            intent.getClass();
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
            if (12 == intExtra || 10 == intExtra) {
                this.f111935a.i(Boolean.valueOf(12 == intExtra));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f111934c = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e eVar = new e(this.f111934c, dVar);
        eVar.f111933b = obj;
        return eVar;
    }

    @Override // e23.p
    public final Object invoke(t<? super Boolean> tVar, t13.d<? super Unit> dVar) {
        return ((e) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        t tVar = (t) this.f111933b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f111932a;
        if (i14 == 0) {
            r.b(obj);
            tVar.i(Boolean.valueOf(e1.a()));
            a aVar2 = new a(tVar);
            f fVar = this.f111934c;
            Context context = fVar.f111936a;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            Unit unit = Unit.INSTANCE;
            context.registerReceiver(aVar2, intentFilter);
            i0 i0Var = new i0(8, fVar, aVar2);
            this.f111933b = null;
            this.f111932a = 1;
            if (q53.r.a(tVar, i0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
