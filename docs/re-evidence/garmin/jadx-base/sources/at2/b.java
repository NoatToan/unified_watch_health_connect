package at2;

import com.garmin.gfdi.ResponseStatusException;
import e23.p;
import java.io.ByteArrayOutputStream;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import us2.f;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@e(c = "com.garmin.gfdi.handshake.HandshakeHandler$handleConfiguration$1", f = "HandshakeHandler.kt", l = {310}, m = "invokeSuspend")
public final class b extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f12818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ByteArrayOutputStream f12819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f12820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f12821e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, ByteArrayOutputStream byteArrayOutputStream, f fVar, f fVar2, d<? super b> dVar) {
        super(2, dVar);
        this.f12818b = aVar;
        this.f12819c = byteArrayOutputStream;
        this.f12820d = fVar;
        this.f12821e = fVar2;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new b(this.f12818b, this.f12819c, this.f12820d, this.f12821e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f12817a;
        f fVar = this.f12820d;
        a aVar2 = this.f12818b;
        try {
            if (i14 == 0) {
                r.b(obj);
                us2.a aVar3 = aVar2.f12797c;
                byte[] byteArray = this.f12819c.toByteArray();
                byteArray.getClass();
                this.f12817a = 1;
                if (aVar3.b(5050, byteArray, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            a.b(aVar2, fVar);
        } catch (ResponseStatusException e4) {
            f fVar2 = this.f12821e;
            int i15 = fVar2.f172495c;
            int i16 = fVar2.f172497e;
            if ((i15 != 2787 || i16 > 330) && (!a.f12795m.contains(new Integer(i15)) || i16 >= 400)) {
                a.e(aVar2, e4);
            } else {
                a.b(aVar2, fVar);
            }
        } catch (Exception e14) {
            a.e(aVar2, e14);
        }
        return Unit.INSTANCE;
    }
}
