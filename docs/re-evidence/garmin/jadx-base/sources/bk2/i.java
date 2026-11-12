package bk2;

import com.garmin.proto.generated.GDIDeviceMessages;
import com.garmin.proto.generated.GDIDeviceMessagesExtension;
import com.garmin.proto.generated.GDISmartProto;
import e23.p;
import java.util.ArrayList;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "com.garmin.device.devicemessages.CIQMessageManager$sendNextMessage$2", f = "CIQMessageManager.kt", l = {}, m = "invokeSuspend")
public final class i extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f18546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f18547b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(b bVar, long j8, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f18546a = bVar;
        this.f18547b = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f18546a, this.f18547b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        boolean zContainsKey;
        Long l14;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        b bVar = this.f18546a;
        long j8 = this.f18547b;
        synchronized (bVar.f18506e) {
            zContainsKey = bVar.f18507f.containsKey(Long.valueOf(j8));
        }
        b bVar2 = this.f18546a;
        if (zContainsKey) {
            long j14 = this.f18547b;
            if (bVar2.f18509h.containsKey(Long.valueOf(j14))) {
                bVar2.f18504c.debug("Message delivery already in progress.");
            } else {
                ck2.a aVarInvoke = bVar2.f18503b.invoke();
                long jCurrentTimeMillis = System.currentTimeMillis();
                synchronized (bVar2.f18506e) {
                    l14 = bVar2.f18507f.get(Long.valueOf(j14));
                    if (l14 == null) {
                        l14 = 0L;
                    }
                }
                aVarInvoke.e(j14, jCurrentTimeMillis, l14.longValue());
                ArrayList arrayListB = aVarInvoke.b(j14);
                if (arrayListB.isEmpty()) {
                    wr.g.v("sendNextMessage for device ", j14, ", but nothing in the cache to send.", bVar2.f18504c);
                } else {
                    b.C0269b c0269b = bVar2.f18508g.get(Long.valueOf(j14));
                    ck2.c cVar = (ck2.c) arrayListB.get(0);
                    if (c0269b != null) {
                        bVar2.f18509h.put(Long.valueOf(j14), cVar.f27917d);
                        a aVar2 = new a(cVar.f27914a, cVar.f27917d, cVar.f27918e, cVar.f27919f);
                        GDIDeviceMessages.CIQMessageRequest.Builder builderNewBuilder = GDIDeviceMessages.CIQMessageRequest.newBuilder();
                        builderNewBuilder.setAppId(aVar2.f18499c);
                        builderNewBuilder.setEventId(aVar2.f18498b);
                        builderNewBuilder.setPayload(aVar2.f18500d);
                        GDIDeviceMessages.DeviceMessageService.Builder builderNewBuilder2 = GDIDeviceMessages.DeviceMessageService.newBuilder();
                        builderNewBuilder2.setMessageRequest(builderNewBuilder);
                        GDIDeviceMessages.DeviceMessageService deviceMessageServiceBuild = builderNewBuilder2.build();
                        GDISmartProto.Smart.Builder builderNewBuilder3 = GDISmartProto.Smart.newBuilder();
                        builderNewBuilder3.setExtension(GDIDeviceMessagesExtension.deviceMessageService, deviceMessageServiceBuild);
                        GDISmartProto.Smart smartBuild = builderNewBuilder3.build();
                        smartBuild.getClass();
                        ge1.b.T(c0269b.f18514c, null, null, new h(c0269b, smartBuild, bVar2, null), 3);
                        cVar.f27920g++;
                        aVarInvoke.a(cVar);
                        bVar2.f18504c.debug("Sending message " + cVar.f27917d + ", " + cVar.f27918e + ", " + cVar.f27919f + " to device " + j14);
                    }
                }
            }
        } else {
            bVar2.f18504c.debug("Call to sendNextMessage but device " + this.f18547b + " is not subscribed.");
        }
        return Unit.INSTANCE;
    }
}
