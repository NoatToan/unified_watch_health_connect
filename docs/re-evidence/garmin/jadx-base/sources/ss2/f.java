package ss2;

import com.garmin.gfdi.GfdiException;
import java.io.ByteArrayOutputStream;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.gfdi.auth.AuthHandler$handleAuthNegotiationStart$3", f = "AuthHandler.kt", l = {197}, m = "invokeSuspend")
public final class f extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f160808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f160809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ByteArrayOutputStream f160810c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(c cVar, ByteArrayOutputStream byteArrayOutputStream, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f160809b = cVar;
        this.f160810c = byteArrayOutputStream;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f160809b, this.f160810c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f160808a;
        c cVar = this.f160809b;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                rs2.v vVar = cVar.f160785c;
                byte[] byteArray = this.f160810c.toByteArray();
                byteArray.getClass();
                this.f160808a = 1;
                obj = vVar.b(5102, byteArray, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            Byte bF = p13.u.F((byte[]) obj);
            byte bByteValue = bF != null ? bF.byteValue() : (byte) -1;
            cVar.f160787e.trace("LTK Reconnect response: " + ((int) bByteValue));
        } catch (Exception e4) {
            cVar.f160796n.O(new GfdiException("Failed to send LTK Reconnect request", e4));
        }
        return Unit.INSTANCE;
    }
}
