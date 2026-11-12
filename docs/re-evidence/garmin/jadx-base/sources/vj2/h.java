package vj2;

import com.garmin.gfdi.protobuf.ProtobufException;
import com.garmin.proto.generated.GDIConnectIQHTTPProto;
import com.garmin.proto.generated.GDISmartProto;
import dt2.k;
import e23.l;
import e23.p;
import o13.q;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.ciq.http.rawresourcerequest.RawResourceRequestProcessor$respond$1", f = "RawResourceRequestProcessor.kt", l = {423}, m = "invokeSuspend")
public final class h extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f178528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f178529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GDIConnectIQHTTPProto.RawResourceResponse.Builder f178530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l<q<Unit>, Unit> f178531d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Throwable f178532e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(g gVar, GDIConnectIQHTTPProto.RawResourceResponse.Builder builder, l<? super q<Unit>, Unit> lVar, Throwable th3, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f178529b = gVar;
        this.f178530c = builder;
        this.f178531d = lVar;
        this.f178532e = th3;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f178529b, this.f178530c, this.f178531d, this.f178532e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f178528a;
        l<q<Unit>, Unit> lVar = this.f178531d;
        GDIConnectIQHTTPProto.RawResourceResponse.Builder builder = this.f178530c;
        g gVar = this.f178529b;
        try {
            if (i14 == 0) {
                r.b(obj);
                k kVar = gVar.f178520d;
                GDISmartProto.Smart smartA = nu2.a.a(GDIConnectIQHTTPProto.ConnectIQHTTPService.newBuilder().setRawResourceResponse(builder));
                smartA.getClass();
                this.f178528a = 1;
                if (kVar.a(smartA, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            if (lVar != null) {
                Throwable th3 = this.f178532e;
                if (th3 == null && builder.getStatus() == GDIConnectIQHTTPProto.RawResourceResponse.ResponseStatus.OK) {
                    int i15 = q.f128596b;
                    lVar.invoke(q.a(Unit.INSTANCE));
                } else if (th3 != null) {
                    int i16 = q.f128596b;
                    lVar.invoke(q.a(new q.b(th3)));
                } else {
                    int i17 = q.f128596b;
                    lVar.invoke(q.a(new q.b(new Throwable(builder.getStatus().name()))));
                }
            }
        } catch (ProtobufException e4) {
            g.a aVar2 = g.f178515l;
            gVar.b().error("failed to send response", (Throwable) e4);
            if (lVar != null) {
                int i18 = q.f128596b;
                lVar.invoke(q.a(new q.b(e4)));
            }
        }
        return Unit.INSTANCE;
    }
}
