package wt2;

import java.io.ByteArrayOutputStream;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import rs2.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
@v13.e(c = "com.garmin.net.ephemeris.gdi.EphemerisDataHandler$sendGpsEphemerisData$1", f = "EphemerisDataHandler.kt", l = {271}, m = "invokeSuspend")
public final class h extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f187191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f187192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f187193c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(a aVar, byte[] bArr, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f187192b = aVar;
        this.f187193c = bArr;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f187192b, this.f187193c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f187191a;
        a aVar2 = this.f187192b;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                StringBuilder sb3 = new StringBuilder("data=");
                byte[] bArr = this.f187193c;
                sb3.append(dz2.c.a(bArr));
                String string = sb3.toString();
                a.C3482a c3482a = a.f187141k;
                aVar2.e("sendGpsEphemerisData", string);
                v vVar = aVar2.f187147e;
                if (vVar == null) {
                    s.m("messenger");
                    throw null;
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byteArrayOutputStream.write(1);
                byteArrayOutputStream.write(bArr);
                Unit unit = Unit.INSTANCE;
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                this.f187191a = 1;
                if (vVar.b(5020, byteArray, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
        } catch (Exception e4) {
            a.C3482a c3482a2 = a.f187141k;
            aVar2.f(e4, "sendGpsEphemerisData", "");
        }
        return Unit.INSTANCE;
    }
}
