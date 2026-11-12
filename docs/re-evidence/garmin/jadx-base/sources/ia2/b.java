package ia2;

import com.garmin.android.gfdi.configuration.SupportedCapability;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import rs2.v;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 6, 0})
@e(c = "com.garmin.android.deviceinterface.capabilities.impl.findmyphone.FindMyPhoneDataHandler$cancelFindMyPhone$1", f = "FindMyPhoneDataHandler.kt", l = {37}, m = "invokeSuspend")
public final class b extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f92446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f92447b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, d<? super b> dVar) {
        super(2, dVar);
        this.f92447b = aVar;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new b(this.f92447b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f92446a;
        a aVar2 = this.f92447b;
        try {
            if (i14 == 0) {
                r.b(obj);
                SupportedCapability supportedCapability = a.f92441h;
                v vVar = aVar2.f70166e;
                if (vVar == null) {
                    s.m("messenger");
                    throw null;
                }
                this.f92446a = 1;
                if (vVar.b(5040, new byte[0], this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
        } catch (Exception e4) {
            SupportedCapability supportedCapability2 = a.f92441h;
            aVar2.b().error("Failed to send cancel find my phone", (Throwable) e4);
        }
        return Unit.INSTANCE;
    }
}
