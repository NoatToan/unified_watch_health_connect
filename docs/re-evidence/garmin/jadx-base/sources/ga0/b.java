package ga0;

import com.garmin.android.apps.connectmobile.devices.model.w;
import e23.p;
import java.util.List;
import o13.q;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.p2;
import v13.e;
import v13.i;
import vb.h;
import z80.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.DeviceCustomizationViewModel$customizationComplete$1", f = "DeviceCustomizationViewModel.kt", l = {140, 143}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f76608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f76609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ la0.a f76610c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, la0.a aVar2, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f76609b = aVar;
        this.f76610c = aVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f76609b, this.f76610c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0078  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
    
        if (r15 == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007e, code lost:
    
        if (r4.x4(r15, r14) == r0) goto L35;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Boolean bool;
        Object objB;
        f fVar;
        la0.a aVar;
        p2 p2Var;
        Object value;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f76608a;
        a aVar3 = this.f76609b;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                objB = ((q) obj).f128597a;
            } else {
                if (i14 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            p2Var = aVar3.f76600i;
            do {
                value = p2Var.getValue();
                ((Boolean) value).getClass();
            } while (!p2Var.b(value, Boolean.TRUE));
            return Unit.INSTANCE;
        }
        r.b(obj);
        b2 b2Var = aVar3.f76605n;
        q90.c cVar = aVar3.f76592a;
        f fVar2 = (f) b2Var.f150540a.getValue();
        if (fVar2 == null) {
            aVar = this.f76610c;
            if (aVar != null) {
                this.f76608a = 2;
            }
            p2Var = aVar3.f76600i;
            do {
                value = p2Var.getValue();
                ((Boolean) value).getClass();
            } while (!p2Var.b(value, Boolean.TRUE));
            return Unit.INSTANCE;
        }
        if (cVar.f143500h || (bool = fVar2.f203048f) != null) {
            bool = Boolean.TRUE;
        }
        Boolean bool2 = bool;
        List<w> list = null;
        Integer num = aVar3.f76602k.contains(j90.e.LANGUAGE_SELECTION) ? fVar2.f203044b : null;
        if (num != null && (fVar = aVar3.f76603l) != null) {
            list = fVar.f203043a;
        }
        f fVarB = f.b(fVar2, list, num, null, null, null, bool2, null, 220);
        y80.w wVar = aVar3.f76593b;
        long j8 = cVar.f143493a;
        this.f76608a = 1;
        objB = wVar.b(j8, fVarB, this);
        return aVar2;
        q.a(objB);
        aVar = this.f76610c;
        if (aVar != null) {
            this.f76608a = 2;
        }
        p2Var = aVar3.f76600i;
        do {
            value = p2Var.getValue();
            ((Boolean) value).getClass();
        } while (!p2Var.b(value, Boolean.TRUE));
        return Unit.INSTANCE;
    }
}
