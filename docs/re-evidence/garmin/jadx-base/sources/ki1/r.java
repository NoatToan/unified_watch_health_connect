package ki1;

import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.findmydevice.presentation.FindMyDeviceViewModel$sendFindMyBand$1", f = "FindMyDeviceViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f104902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f104903b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.findmydevice.presentation.FindMyDeviceViewModel$sendFindMyBand$1$3$1", f = "FindMyDeviceViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f104904a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l lVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f104904a = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f104904a, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            p2 p2Var = this.f104904a.f104868q;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, ki1.b.c.f104822a));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.findmydevice.presentation.FindMyDeviceViewModel$sendFindMyBand$1$4$1", f = "FindMyDeviceViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f104905a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l lVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f104905a = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f104905a, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            p2 p2Var = this.f104905a.f104868q;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, ki1.b.a.f104820a));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(l lVar, t13.d<? super r> dVar) {
        super(2, dVar);
        this.f104903b = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        r rVar = new r(this.f104903b, dVar);
        rVar.f104902a = obj;
        return rVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        final b0 b0Var = (b0) this.f104902a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        final l lVar = this.f104903b;
        p2 p2Var = lVar.f104860i;
        p2 p2Var2 = lVar.f104868q;
        fi1.a aVar2 = (fi1.a) p2Var.getValue();
        if (!((Boolean) lVar.f104861j.f150540a.getValue()).booleanValue()) {
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar3.getClass();
            i2.a.b(a2Var, "FindMyDeviceViewModel", "[sendFindMyBand] device not connected");
            do {
                value2 = p2Var2.getValue();
            } while (!p2Var2.b(value2, ki1.b.a.f104820a));
            return Unit.INSTANCE;
        }
        hi1.a aVar4 = lVar.f104858g;
        String str = aVar2.f71764d;
        aVar4.getClass();
        str.getClass();
        u0 u0Var = (u0) u0.f203782n6.get(str);
        final int i14 = 0;
        if (!(u0Var != null ? aVar4.f83862a.contains(u0Var) : false)) {
            i2.a aVar5 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar5.getClass();
            i2.a.b(a2Var2, "FindMyDeviceViewModel", "[sendFindMyBand] device not supported");
            do {
                value = p2Var2.getValue();
            } while (!p2Var2.b(value, ki1.b.a.f104820a));
            return Unit.INSTANCE;
        }
        i2.a aVar6 = i2.f36769a;
        a2 a2Var3 = a2.GENERAL;
        aVar6.getClass();
        i2.a.b(a2Var3, "FindMyDeviceViewModel", "[sendFindMyBand] sending find my band command");
        ii1.m mVar = lVar.f104856e;
        String str2 = aVar2.f71765e;
        String str3 = aVar2.f71764d;
        e23.a aVar7 = new e23.a() { // from class: ki1.q
            @Override // e23.a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        i2.a aVar8 = i2.f36769a;
                        a2 a2Var4 = a2.GENERAL;
                        aVar8.getClass();
                        i2.a.b(a2Var4, "FindMyDeviceViewModel", "[sendFindMyBand] onFindMyBandMessageSent");
                        l lVar2 = lVar;
                        ge1.b.T(v1.a(lVar2), null, null, new r.a(lVar2, null), 3);
                        break;
                    default:
                        i2.a aVar9 = i2.f36769a;
                        a2 a2Var5 = a2.GENERAL;
                        aVar9.getClass();
                        i2.a.b(a2Var5, "FindMyDeviceViewModel", "[sendFindMyBand] onFailedToSendFindMyBandMessage");
                        l lVar3 = lVar;
                        ge1.b.T(v1.a(lVar3), null, null, new r.b(lVar3, null), 3);
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        final int i15 = 1;
        e23.a aVar8 = new e23.a() { // from class: ki1.q
            @Override // e23.a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        i2.a aVar9 = i2.f36769a;
                        a2 a2Var4 = a2.GENERAL;
                        aVar9.getClass();
                        i2.a.b(a2Var4, "FindMyDeviceViewModel", "[sendFindMyBand] onFindMyBandMessageSent");
                        l lVar2 = lVar;
                        ge1.b.T(v1.a(lVar2), null, null, new r.a(lVar2, null), 3);
                        break;
                    default:
                        i2.a aVar10 = i2.f36769a;
                        a2 a2Var5 = a2.GENERAL;
                        aVar10.getClass();
                        i2.a.b(a2Var5, "FindMyDeviceViewModel", "[sendFindMyBand] onFailedToSendFindMyBandMessage");
                        l lVar3 = lVar;
                        ge1.b.T(v1.a(lVar3), null, null, new r.b(lVar3, null), 3);
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        mVar.getClass();
        str2.getClass();
        str3.getClass();
        xt2.a aVarA = mVar.f93789a.a(str2);
        if (aVarA == null) {
            i2.a.f(a2Var3, "SendFindMyBandUseCase", "FindMyWatchDataHandler is null for macAddress: ".concat(str2));
            aVar8.invoke();
        } else {
            aVarA.d(new ii1.l(aVar8, aVar7));
        }
        return Unit.INSTANCE;
    }
}
