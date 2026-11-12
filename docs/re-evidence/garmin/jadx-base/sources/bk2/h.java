package bk2;

import com.garmin.gfdi.protobuf.ProtobufException;
import com.garmin.proto.generated.GDIDeviceMessages;
import com.garmin.proto.generated.GDIDeviceMessagesExtension;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.GeneratedMessage;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "com.garmin.device.devicemessages.CIQMessageManager$send$2", f = "CIQMessageManager.kt", l = {333}, m = "invokeSuspend")
public final class h extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b.C0269b f18539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GDISmartProto.Smart f18540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f18541d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
    @v13.e(c = "com.garmin.device.devicemessages.CIQMessageManager$send$2$1", f = "CIQMessageManager.kt", l = {335, 341, 343, 348}, m = "invokeSuspend")
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f18542a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.C0269b f18543b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ GDISmartProto.Smart f18544c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ b f18545d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b.C0269b c0269b, GDISmartProto.Smart smart, b bVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f18543b = c0269b;
            this.f18544c = smart;
            this.f18545d = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f18543b, this.f18544c, this.f18545d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x008f, code lost:
        
            if (bk2.b.c(r6, r4, r10) == r0) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00a5, code lost:
        
            if (bk2.b.c(r6, r3, r10) == r0) goto L42;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            GDIDeviceMessages.DeviceMessageService deviceMessageService;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f18542a;
            b bVar = this.f18545d;
            b.C0269b c0269b = this.f18543b;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    dt2.g gVar = c0269b.f18513b;
                    GDISmartProto.Smart smart = this.f18544c;
                    this.f18542a = 1;
                    obj = gVar.b(smart, this);
                    if (obj == aVar) {
                    }
                    return aVar;
                }
                if (i14 == 1) {
                    r.b(obj);
                } else {
                    if (i14 != 2 && i14 != 3 && i14 != 4) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
                GDISmartProto.Smart smart2 = (GDISmartProto.Smart) obj;
                if (smart2 != null) {
                    GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIDeviceMessages.DeviceMessageService> generatedExtension = GDIDeviceMessagesExtension.deviceMessageService;
                    deviceMessageService = !smart2.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension) ? null : (GDIDeviceMessages.DeviceMessageService) smart2.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
                }
                if (deviceMessageService != null && deviceMessageService.hasMessageResponse()) {
                    GDIDeviceMessages.CIQMessageResponse messageResponse = deviceMessageService.getMessageResponse();
                    if (messageResponse.hasStatus() && messageResponse.getStatus() == GDIDeviceMessages.CIQMessageResponse.Status.SUCCESS) {
                        long f172494b = c0269b.f18512a.getF92746j();
                        String eventId = messageResponse.getEventId();
                        eventId.getClass();
                        this.f18542a = 2;
                        if (b.d(bVar, f172494b, eventId, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        long f172494b2 = c0269b.f18512a.getF92746j();
                        this.f18542a = 3;
                    }
                }
            } catch (ProtobufException e4) {
                bVar.f18504c.error("Error sending message", (Throwable) e4);
                long f172494b3 = c0269b.f18512a.getF92746j();
                this.f18542a = 4;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(b.C0269b c0269b, GDISmartProto.Smart smart, b bVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f18539b = c0269b;
        this.f18540c = smart;
        this.f18541d = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f18539b, this.f18540c, this.f18541d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f18538a;
        if (i14 == 0) {
            r.b(obj);
            a aVar2 = new a(this.f18539b, this.f18540c, this.f18541d, null);
            this.f18538a = 1;
            if (ge1.b.Y(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
