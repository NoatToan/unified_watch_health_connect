package v41;

import android.content.Context;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.pacepro.domain.usecase.SendToDeviceUseCase$sendPlanToDevice$1", f = "SendToDeviceUseCase.kt", l = {48}, m = "invokeSuspend", v = 2)
public final class a0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f175563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f175564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f175565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0 f175566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f175567e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var, Context context, t13.d<? super a0> dVar) {
        super(2, dVar);
        this.f175566d = b0Var;
        this.f175567e = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a0(this.f175566d, this.f175567e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((a0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Long l14;
        long j8;
        Object value3;
        Object value4;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f175565c;
        b0 b0Var = this.f175566d;
        if (i14 == 0) {
            o13.r.b(obj);
            p2 p2Var = b0Var.f175575e;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, o51.g.b((o51.g) value, true, null, 14)));
            com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar = (com.garmin.android.apps.connectmobile.pacepro.data.dto.b) b0Var.f175574d.getValue();
            Long l15 = bVar != null ? bVar.f39764a : null;
            if (bVar == null || l15 == null) {
                p2 p2Var2 = b0Var.f175575e;
                do {
                    value2 = p2Var2.getValue();
                } while (!p2Var2.b(value2, o51.g.b((o51.g) value2, false, null, 12)));
            } else {
                long jA = b0Var.f175573c.a();
                r41.a aVar2 = b0Var.f175572b;
                long jLongValue = l15.longValue();
                this.f175563a = l15;
                this.f175564b = jA;
                this.f175565c = 1;
                obj = com.garmin.android.apps.connectmobile.f0.J(aVar2, new r41.g(aVar2, jLongValue, jA, null), this);
                if (obj == aVar) {
                    return aVar;
                }
                l14 = l15;
                j8 = jA;
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j8 = this.f175564b;
        l14 = this.f175563a;
        o13.r.b(obj);
        if (((v2) obj) instanceof v2.b) {
            rd2.f.a().f152045a.getClass();
            sd2.f fVarI = rd2.j.i(j8, null);
            String string = this.f175567e.getString(R.string.pacepro_send_to_device_message, fVarI != null ? fVarI.getDisplayName() : null);
            string.getClass();
            long jLongValue2 = l14.longValue();
            b0Var.getClass();
            Bundle bundleA = h7.c.a(new o13.p("planId", String.valueOf(jLongValue2)));
            ht.a.f85464a.getClass();
            ht.a.a(bundleA, "PaceProSendToDevice");
            p2 p2Var3 = b0Var.f175575e;
            do {
                value4 = p2Var3.getValue();
            } while (!p2Var3.b(value4, o51.g.b((o51.g) value4, false, string, 2)));
        } else {
            p2 p2Var4 = b0Var.f175575e;
            do {
                value3 = p2Var4.getValue();
            } while (!p2Var4.b(value3, o51.g.b((o51.g) value3, false, null, 12)));
        }
        return Unit.INSTANCE;
    }
}
