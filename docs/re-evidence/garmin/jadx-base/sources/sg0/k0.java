package sg0;

import com.garmin.android.apps.connectmobile.v2;
import java.util.Collection;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.managefamily.ManageChildViewModel$getChildDevices$1", f = "ManageChildViewModel.kt", l = {118}, m = "invokeSuspend", v = 2)
public final class k0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f159110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f159111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f159112c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(f0 f0Var, long j8, t13.d<? super k0> dVar) {
        super(2, dVar);
        this.f159111b = f0Var;
        this.f159112c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k0(this.f159111b, this.f159112c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objM;
        Object value2;
        String message;
        Boolean bool;
        boolean z14;
        Object value3;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f159110a;
        f0 f0Var = this.f159111b;
        boolean z15 = true;
        if (i14 == 0) {
            o13.r.b(obj);
            p2 p2Var = f0Var.f159087f;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, u.b((u) f0Var.f159087f.getValue(), null, null, null, null, true, null, false, false, false, null, null, 8159)));
            re0.o oVar = f0Var.f159083b;
            this.f159110a = 1;
            objM = oVar.m(this.f159112c, this);
            if (objM == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objM = obj;
        }
        v2 v2Var = (v2) objM;
        if (v2Var instanceof v2.b) {
            Iterable iterable = (Iterable) ((v2.b) v2Var).f47386a;
            boolean z16 = iterable instanceof Collection;
            if (!z16 || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z14 = false;
                        break;
                    }
                    if (p005kotlin.jvm.internal.s.g(((ue0.h) it.next()).getLiveTrackCapable(), Boolean.TRUE)) {
                        z14 = true;
                        break;
                    }
                }
            } else {
                z14 = false;
                break;
            }
            if (!z16 || !((Collection) iterable).isEmpty()) {
                Iterator it3 = iterable.iterator();
                do {
                    if (!it3.hasNext()) {
                        z15 = false;
                        break;
                    }
                } while (!p005kotlin.jvm.internal.s.g(((ue0.h) it3.next()).getIncidentDetectionCapable(), Boolean.TRUE));
            } else {
                z15 = false;
                break;
            }
            p2 p2Var2 = f0Var.f159087f;
            do {
                value3 = p2Var2.getValue();
            } while (!p2Var2.b(value3, u.b((u) value3, null, null, null, null, false, null, false, false, false, Boolean.valueOf(z14), Boolean.valueOf(z15), 1951)));
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            p2 p2Var3 = f0Var.f159087f;
            do {
                value2 = p2Var3.getValue();
                message = ((v2.a) v2Var).f47383a.getMessage();
                bool = Boolean.FALSE;
            } while (!p2Var3.b(value2, u.b((u) value2, null, null, null, null, false, message, false, false, false, bool, bool, 1951)));
        }
        return Unit.INSTANCE;
    }
}
